package ss6_ke_thua_bai2;

public class Point2D {
    private float x = 0.0f;
    private  float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){

    }

    public  float[] getXY(){
        float[] array={this.x,this.y};
        return array;
    }

    @Override
    public String toString() {
        return String.format("POINT 2D: ["+"%s , %s",this.x,this.y+"]");
//        return "Point2D{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
    }
}
