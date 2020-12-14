public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;


    public QuadraticEquation(){
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
       delta = b*b - 4*a*c;
       return delta;
    }

    public double  getRoot1(){
        return (-b + Math.pow((b*b - 4*a*c), 0.5))/(2*a);
    }

    public double getRoot2(){
        return (-b - Math.pow((b*b - 4*a*c), 0.5))/(2*a);
    }

    public String disPlay() {
        return "Phương trình bậc 2 có a = " + a + " b = " + b + " c = " + c;
    }


}
