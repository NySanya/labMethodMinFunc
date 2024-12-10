package Methods;

public class Fiba {
    private double a, b, d;

    public Fiba(double a, double b,  double d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public void start(){
        double x2 = a+(b-a)/1.618033989;
        double x1= b-(x2-a);
        double f1 = Function.f(x1);
        double f2 = Function.f(x2);

        boolean out =false;
        int count =2;
        int iter =0;
        while (!out) {
            iter++;
            //System.out.println(iter + " " + x1 +" " +  x2);
            if (f1 > f2) {
                if (x2 - x1 < d) {
                    System.out.println(x2);
                    out = true;
                } else {
                    a = x1;
                    x1 = x2;
                    x2 = b - (x1 - a);
                    f1 = f2;
                    f2 = Function.f(x2);
                    count++;
                }
            }else {
                if (x2 - x1 < d) {
                    System.out.println(x1);
                    out = true;
                } else {
                    b = x2;
                    x2 = x1;
                    x1 = a + (b - x2);
                    f2 = f1;
                    f1 = Function.f(x1);
                    count++;
                }
            }
        }
        System.out.println( "Кол-во итераций " + iter + " Кол-во вызовов " + count);
    }
}
