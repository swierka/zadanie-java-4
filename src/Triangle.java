public class Triangle {
    private double angleA;
    private double angleB;
    private double angleC;

    public Triangle(double angleA, double angleB, double angleC) {
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }

    public void setAngleC(double angleC) {
        this.angleC = angleC;
    }
}
