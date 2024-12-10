package Methods;

public class Nuton {
    private double e;
    private double x0,d,x1 ;

    public Nuton(double x0, double e) {
        this.x0 = x0;
        this.e = e;
    }

    public void start() {
        int counter = 0;
        int iter = 0;

        do {

            x1 = x0 - Function.fStrih(x0) / Function.fTwofStrih(x0);
            d = Math.abs(x1 - x0);
            if (d >= e) {
                x0 = x1;
                counter += 2;
                iter++;
            }
        } while (d >= e);


        System.out.println(" " + x1);

        System.out.println("Ньютон итерации " + iter + " Кол-во вызовов " + counter);
    }
}
