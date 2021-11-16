
class Pivot {
    String x;
    String y;
    String z;

    Pivot(String px, String py, String pz) {
        this.x = px;
        this.y = py;
        this.z = pz;
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

    public void setX(String pivotValues) {
        this.x = pivotValues;
    }

    public void setY(String pivotValues) {
        this.y = pivotValues;
    }

    public void setZ(String pivotValues) {
        this.z = pivotValues;
    }
}