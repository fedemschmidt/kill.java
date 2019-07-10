

/**
 * Hello world!
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        /*Calculadora c = new Calculadora();

        Rutinas r1 = new Rutinas();
        Rutinas r2 = new Rutinas();
        Rutinas r3 = new Rutinas();

        c.addRutina(r1);
        c.addRutina(r2);
        c.addRutina(r3);

        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("add");
        r1.addinstrucion("add");
        r1.addinstrucion("sub");

        r2.addinstrucion("push");
        r2.addinstrucion("mul");
        r2.addinstrucion("write");

        r3.addinstrucion("push");
        r3.addinstrucion("read");
        r3.addinstrucion("sum");
        r3.addinstrucion("write");*/

        /* Test push
        Calculadora c = new Calculadora();
        Rutinas r1 = new Rutinas();
        c.addRutina(r1);
        r1.addinstrucion("push");
        c.usarRutina(0);
        if(c.check()==5) System.out.println("!=/!="); */

        // Test add
        /*Calculadora c = new Calculadora();
        Rutinas r1 = new Rutinas();
        c.addRutina(r1);
        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("add");
        c.usarRutina(0);
        if(c.check()==5) System.out.println("!=/!=");*/

        // Test sub
        /*Calculadora c = new Calculadora();
        Rutinas r1 = new Rutinas();
        c.addRutina(r1);
        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("sub");
        c.usarRutina(0);
        if(c.check()==5) System.out.println("!=/!=");*/

        // Test mul
        /*Calculadora c = new Calculadora();
        Rutinas r1 = new Rutinas();
        c.addRutina(r1);
        r1.addinstrucion("push");
        r1.addinstrucion("push");
        r1.addinstrucion("mul");
        c.usarRutina(0);
        if(c.check()==25) System.out.println("!=/!=");*/

        //Test write and read
        /*Calculadora c = new Calculadora();
        Rutinas r1 = new Rutinas();
        c.addRutina(r1);
        r1.addinstrucion("push");
        r1.addinstrucion("write");
        r1.addinstrucion("read");
        c.usarRutina(0);
        System.out.println(c.check());*/
    }
}
