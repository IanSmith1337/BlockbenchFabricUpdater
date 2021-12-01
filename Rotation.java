
class Rotation {
    String x;
    String y;
    String z;

    Rotation(String rx, String ry, String rz) {
        this.x = rx;
        this.y = ry;
        this.z = rz;
    }

    public String getX() {
        return this.x;
    }

    public String getY() {
        return this.y;
    }

    public String getZ() {
        return this.z;
    }

    public void setX(String rotValue) {
        this.x = rotValue;
    }

    public void setY(String rotValue) {
        this.y = rotValue;
    }

    public void setZ(String rotValue) {
        this.z = rotValue;
    }

    public void reset() {
        this.x = "0";
        this.y = "0";
        this.z = "0";
    }
}