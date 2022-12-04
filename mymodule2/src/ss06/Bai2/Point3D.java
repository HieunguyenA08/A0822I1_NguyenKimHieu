package ss06.Bai2;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ (double x, double y , double z){
        super.setXY(x,y);
    }
    public  double[] getXYZ (double x , double y , double z){
        return new double[]{x,y,z};
    }

    @Override
    public String toString() {
        return super.toString() + "," + z;
    }
}
