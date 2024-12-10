package Methods;

public class Function {
    public static double f(double x){
        return  (1 - x) * Math.sin(x);
    }
    public static double fStrih(double x){
        return (1 - x) * Math.cos(x)-Math.sin(x);
    }

    public static double fTwofStrih(double x){
        return x * Math.sin(x)- 2*Math.cos(x);
    }

}
