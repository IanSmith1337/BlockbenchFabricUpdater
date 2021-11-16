
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            File file = new File(args[0]);
            File result = new File(args[1]);
            String fileName = result.getName();
            try {
                parseFile(file, result, fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        private static void parseFile(File input, File result, String fileName) throws FileNotFoundException, IOException {
            Pivot pivot = new Pivot("0", "0", "0");
            Rotation rot = new Rotation("0", "0", "0");
            int textureWidth = 16, textureHeight = 16;
            Scanner reader = new Scanner(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(result));
            String line = reader.nextLine();
            writer.write("public class " + fileName.substring(0, fileName.length() - 5) + " extends EntityModel<YourEntityTypeHere> {\nprivate final ModelPart root;\npublic <EnterEntityNameHere>(ModelPart rootModelPart) {\n    root = modelPartBase.getChild(EntityModelPartNames.BODY);\n}\n\npublic static TexturedModelData getTexturedModelData() {\n");
            while (reader.hasNextLine()) {
                if(!line.contains("//") && !line.contains("class") && !line.contains("package") && !line.contains("final") && !line.isBlank()) {
                    line = line.trim();
                    if (line.contains("@")) {
                        break;
                    }

                    if(line.contains("textureWidth")) {
                        String width = line.substring(line.lastIndexOf("textureWidth = ") + "textureWidth =".length()).trim();
                        width = width.substring(0, width.length() - 1);
                        textureWidth = Integer.parseInt(width); 
                    }

                    if(line.contains("textureHeight")) {
                        String height = line.substring(line.lastIndexOf("textureHeight = ") + "textureHeight =".length()).trim();
                        height = height.substring(0, height.length() - 1);
                        textureHeight = Integer.parseInt(height); 
                    }

                    if(line.contains("setPivot")) {
                        String pivotString = line.substring(line.lastIndexOf("setPivot") + "setPivot".length());
                        String[] pivotValues = pivotString.split(", ");
                        for (int i = 0; i < pivotValues.length; i++) {
                            pivotValues[i] = pivotValues[i].replace("(", " ");
                            pivotValues[i] = pivotValues[i].trim();
                        }
                        pivot.setX(pivotValues[0]);
                        pivot.setY(pivotValues[1]);
                        String pivotZ = pivotValues[2].substring(0, pivotValues[2].length() - 2);
                        pivot.setZ(pivotZ);
                    }

                    if(line.contains("setRotationAngle")) {
                        String rotString = line.substring(line.lastIndexOf("setRotationAngle") + "setRotationAngle".length());
                        String[] rotValues = rotString.split(", ");
                        for (int i = 0; i < rotValues.length; i++) {
                            rotValues[i] = rotValues[i].replace("(", " ");
                            rotValues[i] = rotValues[i].trim();
                        }
                        rot.setX(rotValues[1]);
                        rot.setY(rotValues[2]);
                        String rotZ = rotValues[3].substring(0, rotValues[3].length() - 2);
                        rot.setZ(rotZ);
                    }

                    if(line.contains("addCuboid")) {
                        System.out.println(line.lastIndexOf("addCuboid") + " " + line.lastIndexOf(")") + " " + line.length());
                        String attrSub = line.substring(line.lastIndexOf("addCuboid") + "addCuboid".length());
                        attrSub = attrSub.substring(0, attrSub.length() - 9);
                        String[] attrValues = attrSub.split(", ");
                        String Dilation = "new Dilation(" + attrValues[6] + ")), ";
                        String objectPivot = "createModelTransform(" + pivot.getX() + ", " + pivot.getY() + ", " + pivot.getZ();
                        String objectRotation = ", " + rot.getX() + ", " + rot.getY() + ", " + rot.getZ() + ");\n";
                        line = "mpd.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 0).cuboid(";
                        for (int i = 0; i < 6; i++) {
                            line = line.concat(attrValues[i] + ", ");
                        }
                        line = line.concat(Dilation);
                        line = line.concat(objectPivot);
                        line = line.concat(objectRotation);
                        writer.write(line);
                    }
                    
                    if(line.contains("public")) {
                        writer.write("ModelData md = new ModelData();\nModelPartData mpd = md.getRoot();\n");
                    }
                }
                line = reader.nextLine();
            }
            writer.write("return TexturedModelData.of(md, " + textureWidth + ", " + textureHeight + ");\n}\n\n");
            writer.write("@Override\npublic void setAngles(<EnterEntityNameHere> entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){\n//previously the render function, render code was moved to a method below\n}\n\n");
            writer.write("@Override\npublic void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){\nImmutableList.of(this.root).forEach((modelRenderer) -> {\nmodelRenderer.render(matrixStack, buffer, packedLight, packedOverlay);\n});\n}\n\n");
            writer.write("public static ModelTransform createModelTransform(float pivotX, float pivotY, float pivotZ, float pitch, float yaw, float roll) {\nfloat px = pivotX;\nfloat py = pivotY;\nfloat pz = pivotZ;\nfloat x = pitch;\nfloat y = yaw;\nfloat z = roll;\nreturn ModelTransform.of(px, py, pz, x, y, z);\n}\n}");
            reader.close();
            writer.close();
        }
}
