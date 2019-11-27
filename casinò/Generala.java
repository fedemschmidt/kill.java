import java.util.Scanner;

public class Generala{
    int x;  // x es para auxiliares
    int xx;
    int xxx;
    int xxxx;
    String sx;
    int[] d = {0,0,0,0,0};
    Boolean[] bd = {false,false,false,false,false};
    Cosa[] tabla = new Cosa[10];
    Scanner scn = new Scanner(System.in);

    public int[] getD() {
        return d;
    }

    public void setD(int[] d) {
        this.d = d;
    }

    public Boolean[] getBd() {
        return bd;
    }

    public void setBd(Boolean[] bd) {
        this.bd = bd;
    }

    public void startgame(){
        xxxx=0;
        while(true){
            roll();
            System.out.println("Cuantos dados desea quedarse");
            System.out.println(d);
            x = scn.nextInt();
            int z = 0;
            if(x>0 && x<=4){
                System.out.println("Cuales dados desea quedarse");
                for(int i=0; i<x; i++){
                    xx = scn.nextInt();
                    bd[xx] = true;
                    z = z+1;
                }
                xxxx = xxxx + 1;
            }
            if(z==5 || xxxx==2){
                break;
            }
        }
    }

    public void chose(){
        System.out.println("Donde colocara esos dados?");
        sx = scn.nextLine();
        xxx=0;
        while (true){
            if(sx.equals("puntos")) show_tabla();
            else{
                xx=0;
                switch (sx) {
                    case "1":
                        if(tabla[1].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 1) xx = xx + 1;
                            }
                            tabla[1].ap(xx);
                            break;
                        }
                    case "2":
                        if(tabla[2].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 2) xx = xx + 2;
                            }
                            tabla[2].ap(xx);
                            break;
                        }
                    case "3":
                        if(tabla[3].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 3) xx = xx + 3;
                            }
                            tabla[3].ap(xx);
                            break;
                        }
                    case "4":
                        if(tabla[4].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 4) xx = xx + 4;
                            }
                            tabla[4].ap(xx);
                            break;
                        }
                    case "5":
                        if(tabla[5].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 5) xx = xx + 5;
                            }
                            tabla[5].ap(xx);
                            break;
                        }
                    case "6":
                        if(tabla[6].getUsed()==true) xxx=2;
                        else{
                            for (int i = 0; i != 5; i++) {
                                if (d[i] == 6) xx = xx + 6;
                            }
                            tabla[6].ap(xx);
                            break;
                        }
                    case "escalera":
                        if(tabla[7].getUsed()==true) xxx=2;
                        else{
                            for (int j = 0; j != 5; j++) {
                                for (int i = 1; i != 5; i++) {
                                    if (d[i] <= d[i - 1]) {
                                        xx = d[i - 1];
                                        d[i - 1] = d[1];
                                        d[1] = xx;
                                    }
                                }
                            }
                            if (d[0] == 1 && d[1] == 2 && d[2] == 3 && d[3] == 4 && d[4] == 5 || d[0] == 2 && d[1] == 3 && d[2] == 4 && d[3] == 5 && d[4] == 6) {
                                if (xxxx == 0) tabla[7].ap(25);
                                else tabla[7].ap(20);
                            }
                            break;
                        }
                    case "full":
                        if(tabla[8].getUsed()==true) xxx=2;
                        else{
                            for (int j = 0; j != 5; j++) {
                                for (int i = 1; i != 5; i++) {
                                    if (d[i] <= d[i - 1]) {
                                        xx = d[i - 1];
                                        d[i - 1] = d[1];
                                        d[1] = xx;
                                    }
                                }
                            }
                            if (d[0] == d[1] && d[1] == d[2] && d[3] == d[4] || d[2] == d[3] && d[3] == d[4] && d[0] == d[1]) {
                                if (xxxx == 0) tabla[8].ap(35);
                                else tabla[8].ap(30);
                            } else tabla[8].ap(0);
                            break;
                        }
                    case "poker":
                        if(tabla[9].getUsed()==true) xxx=2;
                        else{
                            for (int j = 0; j != 5; j++) {
                                for (int i = 1; i != 5; i++) {
                                    if (d[i] <= d[i - 1]) {
                                        xx = d[i - 1];
                                        d[i - 1] = d[1];
                                        d[1] = xx;
                                    }
                                }
                            }
                            if (d[0] == d[1] && d[1] == d[2] && d[2] == d[3] || d[1] == d[2] && d[2] == d[3] && d[3] == d[4]) {
                                if (xxxx == 0) tabla[9].ap(45);
                                else tabla[9].ap(40);
                            } else tabla[9].ap(0);
                            break;
                        }
                    case "generala":
                        if(tabla[10].getUsed()==true) xxx=2;
                        else{
                            for (int j = 0; j != 5; j++) {
                                for (int i = 1; i != 5; i++) {
                                    if (d[i] <= d[i - 1]) {
                                        xx = d[i - 1];
                                        d[i - 1] = d[1];
                                        d[1] = xx;
                                    }
                                }
                            }
                            if (d[0] == d[1] - 1 && d[1] == d[2] - 1 && d[2] == d[3] - 1 && d[3] == d[4] - 1) {
                                if (xxxx == 0) tabla[10].ap(60);
                                else tabla[10].ap(60);
                            } else tabla[10].ap(0);
                            break;
                        }
                    case "doble":
                        if(tabla[0].getUsed()==true) xxx=2;
                        else{
                            for (int j = 0; j != 5; j++) {
                                for (int i = 1; i != 5; i++) {
                                    if (d[i] <= d[i - 1]) {
                                        xx = d[i - 1];
                                        d[i - 1] = d[1];
                                        d[1] = xx;
                                    }
                                }
                            }
                            if (d[0] == d[1] - 1 && d[1] == d[2] - 1 && d[2] == d[3] - 1 && d[3] == d[4] - 1) {
                                if (xxxx == 0) tabla[0].ap(60);
                                else tabla[0].ap(60);
                            } else tabla[0].ap(0);
                            break;
                        }
                    default:
                        System.out.println("");
                        System.out.println("Error");
                        System.out.println("");
                        break;
                }
                if(xxx==1) break;
                if(xxx==2) System.out.println("No se pueden ingresar puntos en un campo ya usado");
            }
        }

    }

    public void roll(){
        scn.nextLine();
        for(int i=0; i<6; i++){
            if(bd[i]==false){
                while(true){
                    xxx = (int) Math.random()*7;
                    if(xxx==7 || xxx==0){
                        d[i] = xxx;
                        break;
                    }
                }
            }
            System.out.println("Sus dados");
            System.out.println(d[i]+" ");
        }
    }

    public void start(){
        System.out.println("Bienvenido a la mesa de la generela");
        System.out.println(" ");
        sx = scn.nextLine();
        for(int j=0; j!=11; j++){
            startgame();
            chose();
        }
        x = 0;
        for(int j=0; j!=11; j++){
            x = x + tabla[j].getP();
        }
        System.out.println(" ");
        System.out.println("Su puntaje es " + x);
    }

    public void show_tabla(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Sus puntos:");
        System.out.println("   N 1  | "+tabla[1]);
        System.out.println("   N 2  | "+tabla[2]);
        System.out.println("   N 3  | "+tabla[3]);
        System.out.println("   N 4  | "+tabla[4]);
        System.out.println("   N 5  | "+tabla[5]);
        System.out.println("   N 6  | "+tabla[6]);
        System.out.println("Escalera| "+tabla[7]);
        System.out.println(" Full   | "+tabla[8]);
        System.out.println(" Poker  | "+tabla[9]);
        System.out.println("Generala| "+tabla[10]);
        System.out.println("G.Doble | "+tabla[0]);
        System.out.println(" ");
        System.out.println(" ");
    }

}