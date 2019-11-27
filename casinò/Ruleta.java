import java.util.HashMap;
import java.util.Scanner;

public class Ruleta{
    Scanner scn = new Scanner(System.in);
    int bola;
    int puntos;
    HashMap <Integer, Integer> apuestas = new HashMap<Integer, Integer>();   // apuesta, monto
    /*
    0 a 36 son numeros
    41 42 43 son docenas
    51 52 53 son columnas
    61 / 62 primeros 18 /  segundos 18
    71 / 72 rojo / negro
    81 / 82 par / impar
    */
    Cuadritos_notnull[] tablero = new Cuadritos_notnull[36];
    int x;      // cualquier variable que empiece con x es auxiliar
    int xx;
    String xs;

    public void run(){
        System.out.println("\n  \n Bienvenido");
        while(true){
            if(puntos==0){
                System.out.println("Te quedaste sin puntos");
                break;
            }
            while(true){
                System.out.println("");
                System.out.println("A que le apostara?");
                xs = scn.nextLine();
                System.out.println("Cuanto apostara?");
                xx = scn.nextInt();

                switch (xs){
                    case "docena":
                        System.out.println("A que docena apostara?");
                        x = scn.nextInt();
                        if(x==1) x=41;
                        if(x==2) x=42;
                        if(x==3) x=43;
                        System.out.println("Cuanto apostara?");
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "columna":
                        System.out.println("A que columna apostara?");
                        x = scn.nextInt();
                        if(x==1) x=51;
                        if(x==2) x=52;
                        if(x==3) x=53;
                        System.out.println("Cuanto apostara?");
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "numero":
                        System.out.println("A que numero apostara?");
                        x = scn.nextInt();
                        System.out.println("Cuanto apostara?");
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "primeros 18":
                        System.out.println("Cuanto apostara?");
                        xx = scn.nextInt();
                        x=61;
                        apuestas.put(x, xx);
                        break;
                    case "segundos 18":
                        System.out.println("Cuanto apostara?");
                        x=62;
                        xx = scn.nextInt();
                        break;
                    case "rojo":
                        System.out.println("Cuanto apostara?");
                        x=71;
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "negro":
                        System.out.println("Cuanto apostara?");
                        x=72;
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "par":
                        System.out.println("Cuanto apostara?");
                        x=81;
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    case "impar":
                        System.out.println("Cuanto apostara?");
                        x=82;
                        xx = scn.nextInt();
                        apuestas.put(x, xx);
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Error");
                        System.out.println("");
                }
                System.out.println("Desea apostar a otra cosa?");
                xs = scn.nextLine();
                if(!(xs.equals("si"))) break;
            }
            while(true){
                x = (int) Math.random()*37;
                if(x!=37) break;
            }
            System.out.println(" ");
            System.out.println("El numero que salio en la ruleta es "+x);
            System.out.println(" ");
            if(x==0){
                for (Integer i : apuestas.keySet()){
                    if(i==0){
                        x = 36*apuestas.get(i);
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                }
            }
            else{
                int xp;
                int xcolor;
                int xp18;
                int xd;
                int xc;
                if(x % 2 == 0) xp = 81;
                else xp = 82;
                if(tablero[x].getColor().equals("rojo")) xcolor=71;
                else xcolor=72;
                if(x<19) xp18=61;
                else xp18=62;
                if(x<13) xd=41;
                else if(x<25) xd=42;
                    else xd=43;
                if(tablero[x].getColumna()==1) xc=51;
                else if(tablero[x].getColumna()==2) xc=52;
                    else xc=53;
                for (Integer i : apuestas.keySet()) {
                    if(x==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                    if(xp==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                    if(xcolor==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                    if(xp18==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                    if(xd==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                    if(xc==i) {
                        puntos = puntos+x;
                        System.out.println("Conseguiste "+x+" punos");
                    }
                }
            }
            System.out.println("Su total de puntos es "+puntos);
        }
    }

    public void creartablero(){
        new Cuadritos_null(0);
        new Cuadritos_notnull(1, "rojo", 1);
        new Cuadritos_notnull(2, "negro", 2);
        new Cuadritos_notnull(3, "rojo", 3);
        new Cuadritos_notnull(4, "negro", 1);
        new Cuadritos_notnull(5, "rojo", 2);
        new Cuadritos_notnull(6, "negro", 3);
        new Cuadritos_notnull(7, "rojo" ,1);
        new Cuadritos_notnull(8, "negro" ,2);
        new Cuadritos_notnull(9, "rojo", 3);
        new Cuadritos_notnull(10, "negro" ,1);
        new Cuadritos_notnull(11, "negro", 2);
        new Cuadritos_notnull(12, "rojo", 3);
        new Cuadritos_notnull(13, "negro", 1);
        new Cuadritos_notnull(14, "rojo", 2);
        new Cuadritos_notnull(15, "negro", 3);
        new Cuadritos_notnull(16, "rojo", 1);
        new Cuadritos_notnull(17, "negro", 2);
        new Cuadritos_notnull(18, "rojo", 3);
        new Cuadritos_notnull(19, "rojo" , 1);
        new Cuadritos_notnull(20, "negro", 2);
        new Cuadritos_notnull(21, "rojo", 3);
        new Cuadritos_notnull(22, "negro",1);
        new Cuadritos_notnull(23, "rojo", 2);
        new Cuadritos_notnull(24, "negro", 3);
        new Cuadritos_notnull(25, "rojo", 1);
        new Cuadritos_notnull(26, "negro", 2);
        new Cuadritos_notnull(27, "rojo", 3);
        new Cuadritos_notnull(28, "negro", 1);
        new Cuadritos_notnull(29, "negro", 2);
        new Cuadritos_notnull(30, "rojo", 3);
        new Cuadritos_notnull(31, "negro", 1);
        new Cuadritos_notnull(32, "rojo", 2);
        new Cuadritos_notnull(33, "negro", 3);
        new Cuadritos_notnull(34, "rojo", 1);
        new Cuadritos_notnull(35, "negro", 2);
        new Cuadritos_notnull(36, "rojo", 3);
    }
}