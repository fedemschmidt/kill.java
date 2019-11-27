import java.util.ArrayList;

public class BlackJack{
    Carta[] mazo = new Carta[4];
    ArrayList <Carta> muser = new ArrayList <Carta>();
    ArrayList <Carta> mbot1 = new ArrayList <Carta>();
    ArrayList <Carta> mbot2 = new ArrayList <Carta>();
    ArrayList <Carta> mbot3 = new ArrayList <Carta>();
    int mano = 0;
    int bot1 = 0;
    int bot2 = 0;
    int bot3 = 0;
    int x;
    Integer[] xa = new Integer [4];

    public void repartir(){
        for(int i=0; i!=4; i++){
            while(true){
                x = (int) Math.random()*53;
                if(x!=0 && x!=52 && mazo[i].getUse()==false) break;
            }
            xa[i]=x;
        }
    }
}