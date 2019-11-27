import java.util.PrimitiveIterator;

public class Cuadritos_notnull extends Cuadritos{
    boolean par;
    String color;
    boolean primeros18;
    int docena;
    int columna;

    public Cuadritos_notnull(int n){
        num = n;
    }

    public Cuadritos_notnull(int n, String c, int clm){
        num = n;
        if(n%2 == 0) par = true;
        else par = false;
        color = c;
        if(n>0 && n<=18) primeros18 = true;
        else primeros18 = false;
        if(n>0 && n<=12) docena = 1;
        else{
            if(n>12 && n<=24) docena = 2;
            else docena = 3;
        }
        columna = clm;
    }

    public boolean getPar(){
        return par;
    }

    public String getColor(){
        return color;
    }

    public boolean getPrimeros18(){
        return primeros18;
    }

    public int getDocena(){
        return docena;
    }

    public int getColumna(){
        return columna;
    }

}
