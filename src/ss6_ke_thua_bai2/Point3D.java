package ss6_ke_thua_bai2;

public class Point3D extends Point2D {
    private float z =0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y ,float z){

    }

    public  float [] getXYZ(){
        float []array={this.z};
        return array;
    }

    @Override
    public String toString() {
        return String.format("POINT 3D : [ "+"%s ,%s ,%s",super.getX(),super.getY(),this.z+"]");

//        return "Point3D{" +
//                "z=" + z +
//                '}'+ super.toString();
    }
}
