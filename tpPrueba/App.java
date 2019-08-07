import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] argum){

        Colectivo c1 = new Colectivo();
        Sube s1 = new Sube();
        Sube s2 = new Sube();
        Sube s3 = new Sube();
        /*
        s1.setm(10);
        s1.setv(3);
        s1.setp(13);

        s2.setm(2);
        s2.setv(8);
        s2.setp(9);

        s3.setm(25);
        s3.setv(40);
        s3.setp(20);

        c1.ing(s1);
        c1.ing(s2);
        c1.ing(s3);

        if(c1.orden()){
            System.out.println("Test correcto");
        }
        */
        /*
        s1.setm(10);
        s1.setv(3);
        s1.setp(13);

        s2.setm(2);
        s2.setv(8);
        s2.setp(9);

        s3.setm(25);
        s3.setv(40);
        s3.setp(3);

        c1.ing(s1);
        c1.ing(s2);
        c1.ing(s3);

        if(c1.orden()){
            }
        else{
            System.out.println("Test correcto");
        }
        */
        if(c1.orden())
            System.out.println("El colectivo esta en orden");
        else
            System.out.println("El colectivo no esta en orden");
    }
}
