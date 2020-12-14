public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;


    public QuadraticEquation(){
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
       delta = this.b*this.b - 4*this.a*this.c;
       return delta;
    }

    public double  getRoot1(){
        return (-this.b + Math.pow((this.b*this.b - 4*this.a*this.c), 0.5))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b - Math.pow((this.b*this.b - 4*this.a*this.c), 0.5))/(2*this.a);
    }

    public String disPlay() {
        return "Phương trình bậc 2 có a = " + this.a + " b = " + this.b + " c = " + this.c;
    }


}
