package Methods;

public class Dechotome {
    private double a, b, e, d;

    public Dechotome(double a, double b, double e, double d) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
    }

    public double start(){
        int count = 0;
        while (Math.abs(b-a) > e){
            count++;
            double x1 =  (a+b-d)/2.0;
            double x2 = (a+b+d)/2.0;
            if(Function.f(x1) < Function.f(x2)){
                b=x2;
            }else {
                a=x1;

            }
        }
        System.out.println( "Кол-во итераций " + count + " Кол-во вызовов " + count*2);
        return a;
    }




}
