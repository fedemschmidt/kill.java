import java.util.ArrayList;

public class Colectivo{
    private ArrayList <Sube> ps = new ArrayList<Sube>();

    public Colectivo(){

    }
    public void ing(Sube a){
        ps.add(a);
    }
    public boolean orden(){
        float a, b, c;
        for(int i=0; i<ps.size(); i++){
            a=ps.get(i).getm();
            b=ps.get(i).getv();
            c=ps.get(i).getp();
            if(b>24){
                c=c*2;
            }
            if(a/2>c){
                return false;
            }
        }
        return true;
    }
}