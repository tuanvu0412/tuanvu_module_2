package ss6_inheritance.bai_tap.bai_2;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z=0.0f;
    private float[] array= new float[3];

    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
        getXYZ();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y, float z){
        array[0]=getX();
        array[1]=getY();
        array[2]=z;
        this.array= array;
    }
    public float[] getXYZ(){
        float[]array={(super.getX()), (super.getY()),(this.getZ())};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY()+
                "z=" + z +
                "array = "+ Arrays.toString(array)+"array1"+Arrays.toString(super.getXY());
    }
}
