import Methods.Dechotome;
import Methods.Fiba;
import Methods.Golden;
import Methods.Nuton;

public class Main {
    public static void main(String[] args) {

        Dechotome dechotome = new Dechotome(-3.0,3.0,0.001,0.0001);
        System.out.println("Дехотомия  " + dechotome.start());

        System.out.println();
        Fiba fiba = new Fiba(-3.0,3.0,0.001);
        System.out.print("Фибоначи  " );
        fiba.start();

        System.out.println();
        Golden golden = new Golden(-3.0,3.0,0.001, 1.618);
        System.out.print("Золотое сечение " );
        golden.start();

        System.out.println();
        Nuton nuton= new Nuton(-3.0,0.0001);
        System.out.print("Nuton " );
        nuton.start();

    }


}