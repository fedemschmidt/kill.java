

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Rutinas{
    private ArrayList<String> instrucciones;

    public Rutinas(){
        instrucciones = new ArrayList <String>();
    }

    public void addinstrucion (String a){
        //System.out.println("Ingrese el tipo de instruccion");
        //Scanner scan = new Scanner(System.in);
        //String a=scan.next();
        if(a=="add" || a=="sub" || a=="mul" || a=="push" || a=="write" || a=="read")instrucciones.add(a);
        //else System.out.println("No hay instrucciones de ese tipo");
        //scan.close();
    }
    public String getinstruccion(int i){
        return instrucciones.get(i);
    }
    public int getsize(){
        return instrucciones.size();
    }
}