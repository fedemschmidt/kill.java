import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x;
        System.out.println(" \n  \n Bienvenido al casino\n A que desea jugar?\n 1 - Generala\n 2 - Ruleta\n 3 - Piedra, Papel o Tijeras\n 4 - Piedra, Papel, Tijeras, Lizard, Spock");
        x = scn.nextInt();
        switch (x){
            case 1:
                new Generala();
                break;
            case 2:
                new Ruleta();
                break;
            case 3:
                new PPT();
                break;
            case 4:
                new PPTLS();
                break;
        }
    }
}