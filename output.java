public class output extends EntityModel<YourEntityTypeHere> {
    private final ModelPart body;
    	private final ModelPart legs;
    	private final ModelPart rf_leg;
    	private final ModelPart lf_leg;
    	private final ModelPart lb_leg;
    	private final ModelPart rb_leg;
    	private final ModelPart tail;
    	private final ModelPart actual_tail_r1;
    	private final ModelPart head;
    	private final ModelPart rear;
    	private final ModelPart lear;
    	private final ModelPart snout;
    	private final ModelPart Jaw;
public <EnterEntityNameHere>(ModelPart rootModelPart) {
    this.body = modelPartBase.getChild(<EntityModelPartName here>);
this.legs = modelPartBase.getChild(<EntityModelPartName here>);
this.rf_leg = modelPartBase.getChild(<EntityModelPartName here>);
this.lf_leg = modelPartBase.getChild(<EntityModelPartName here>);
this.lb_leg = modelPartBase.getChild(<EntityModelPartName here>);
this.rb_leg = modelPartBase.getChild(<EntityModelPartName here>);
this.tail = modelPartBase.getChild(<EntityModelPartName here>);
this.actual_tail_r1 = modelPartBase.getChild(<EntityModelPartName here>);
this.head = modelPartBase.getChild(<EntityModelPartName here>);
this.rear = modelPartBase.getChild(<EntityModelPartName here>);
this.lear = modelPartBase.getChild(<EntityModelPartName here>);
this.snout = modelPartBase.getChild(<EntityModelPartName here>);
this.Jaw = modelPartBase.getChild(<EntityModelPartName here>);

}

public static TexturedModelData getTexturedModelData() {
ModelData md = new ModelData();
ModelPartData mpdbody = md.getRoot();
body.setTextureOffset(0, 0).addCuboid(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 12.0F, 1.35F, false);(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 12.0F, new Dilation(1.35F)), createModelTransform(-0.075F, 15.275F, 0.075F, 0, 0, 0);

/* add "ModelPartData mpdlegs =" to the start of this line if necessary. */ 

legs.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-1.1F, -0.65F, -0.95F, 2.0F, 7.0F, 2.0F, new Dilation(0.15F)), createModelTransform(-2.45F, -6.5F, -5.5F, 0, 0, 0);

/* add "ModelPartData mpdlegs =" to the start of this line if necessary. */ 

legs.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-1.0F, -0.65F, -0.95F, 2.0F, 7.0F, 2.0F, new Dilation(0.15F)), createModelTransform(2.45F, -6.5F, -5.5F, 0, 0, 0);

/* add "ModelPartData mpdlegs =" to the start of this line if necessary. */ 

legs.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-1.0F, -0.65F, -0.825F, 2.0F, 7.0F, 2.0F, new Dilation(0.15F)), createModelTransform(2.45F, -6.5F, 5.5F, 0, 0, 0);

/* add "ModelPartData mpdlegs =" to the start of this line if necessary. */ 

legs.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-1.1F, -0.65F, -0.825F, 2.0F, 7.0F, 2.0F, new Dilation(0.15F)), createModelTransform(-2.45F, -6.5F, 5.5F, 0, 0, 0);

/* add "ModelPartData mpdbody =" to the start of this line if necessary. */ 

body.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-1.0F, -5.6127F, -0.8543F, 2.0F, 7.0F, 2.0F, new Dilation(0.01F)), createModelTransform(0.0F, -0.5F, 0.25F, -1.0472F, 0.0F, 0.0F);

/* add "ModelPartData mpdbody =" to the start of this line if necessary. */ 

body.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-3.0F, -5.0F, -5.5F, 6.0F, 6.0F, 5.0F, new Dilation(0.2F)), createModelTransform(0.075F, -0.6F, -6.75F, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -3.0F, -1.5F, 4.0F, 4.0F, 3.0F, new Dilation(-0.8F)), createModelTransform(-1.9758F, -4.8666F, -2.1089F, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -4.0F, -1.5F, 4.0F, 4.0F, 3.0F, new Dilation(-1.0F)), createModelTransform(0, 0, 0, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -3.0F, -1.5F, 4.0F, 4.0F, 3.0F, new Dilation(-0.8F)), createModelTransform(1.7742F, -4.8666F, -2.1089F, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -4.0F, -1.5F, 4.0F, 4.0F, 3.0F, new Dilation(-1.0F)), createModelTransform(0, 0, 0, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -2.25F, -3.75F, 4.0F, 3.0F, 5.0F, new Dilation(-0.1F)), createModelTransform(0.0875F, -0.5875F, -5.5375F, 0, 0, 0);

/* add "ModelPartData mpdhead =" to the start of this line if necessary. */ 

head.addChild(<EntityModelPartName here>, ModelPartBuilder.create().uv(0, 0).cuboid((-2.0F, -0.5F, -3.5F, 4.0F, 1.0F, 5.0F, new Dilation(-0.1F)), createModelTransform(0.0F, 1.0F, -0.25F, 0, 0, 0);
return TexturedModelData.of(md, 16, 16);
}

@Override
public void setAngles(<EnterEntityNameHere> entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//previously the render function, render code was moved to a method below
}

@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
ImmutableList.of(this.root).forEach((modelRenderer) -> {
modelRenderer.render(matrixStack, buffer, packedLight, packedOverlay);
});
}

public static ModelTransform createModelTransform(float pivotX, float pivotY, float pivotZ, float pitch, float yaw, float roll) {
float px = pivotX;
float py = pivotY;
float pz = pivotZ;
float x = pitch;
float y = yaw;
float z = roll;
return ModelTransform.of(px, py, pz, x, y, z);
}
}