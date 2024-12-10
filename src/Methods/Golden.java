package Methods;

public class Golden {
    private double a, b, e, alpha;

    public Golden(double a, double b, double e, double alpha) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.alpha = alpha;
    }

    public void start() {

        double x1 = b - (b - a) / alpha;
        double x2 = a + (b - a) / alpha;

        double y1 = Function.f(x1);
        double y2 = Function.f(x2);
        int count =2;
        int iter =1;
        while (Math.abs(b-a) > e) {
            if (y1 < y2) {
                b = x2;
                x2 = x1;
                x1 = b - (b - a) / alpha;

                y2 = y1;
                y1 = Function.f(x1);
                count++;
            }else {
                a = x1;
                x1=x2;
                x2=a + (b - a) / alpha;

                y1=y2;
                y2=Function.f(x2);
                count++;
            }
            iter++;
        }

        System.out.println(a);
        System.out.println( "Кол-во итераций " + iter + " Кол-во вызовов " + count);

    }
}
