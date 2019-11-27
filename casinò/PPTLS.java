import java.util.Scanner;

public class PPTLS{
    Scanner scn = new Scanner(System.in);
    int bot;
    String x;

    public void play(){
        System.out.println("Piedra, papel o tijeras");
        x = scn.nextLine();
        while(true){
            bot = (int) Math.random()*6;
            if(bot!=0 && bot!=6) break;
        }
        if(x.equals("piedra")){
            if(bot==1) System.out.println("iguales");
            else if(bot==2 || bot==5) System.out.println("perdiste");
            else System.out.println("ganaste");
        }
        if(x.equals("papel")){
            if(bot==1 || bot==5) System.out.println("ganaste");
            else if(bot==2) System.out.println("iguales");
            else System.out.println("perdiste");
        }
        if(x.equals("tijeras")){
            if(bot==1 || bot==5) System.out.println("perdiste");
            else if(bot==2 || bot==4) System.out.println("ganaste");
            else System.out.println("iguales");
        }
        if(x.equals("lizard")){
            if(bot==1 || bot==3) System.out.println("perdiste");
            else if(bot==2 || bot==5) System.out.println("ganaste");
            else System.out.println("iguales");
        }
        if(x.equals("spock")){
            if(bot==2 || bot==4) System.out.println("perdiste");
            else if(bot==1 || bot==3) System.out.println("ganaste");
            else System.out.println("iguales");
        }
    }
}