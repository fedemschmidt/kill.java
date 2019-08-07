import java.util.ArrayList;

public class Mesa{
    private ArrayList <Plato> pl;

    public Mesa(){
        this.pl=new ArrayList<Plato>();
    }

    public void addplato (Plato plato){
        this.pl.add(plato);
    }

    public void clearnpalto (){
        this.pl.clear();
    }
}
