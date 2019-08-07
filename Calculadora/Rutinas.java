import java.util.ArrayList;

public class Rutinas{
    private ArrayList<String> instrucciones;
    private Stack<Integer> memoriaRutina;

    public Rutina(){
        instrucciones = new ArrayList <String>();
        memoriaRutina = new Stack<Integer>();
    }

    public void addinstrucion (){
        System.out.println("Ingrese el tipo de instruccion");
        Scanner scan = new Scanner(System.in);
        String a=scan.next();
        if(a=="add" || a=="sub" || a=="mul" || a=="push" || a=="write" || a=="read")instrucciones.add(a);
        else System.out.println("No hay instrucciones de ese tipo");
    }
    public Instrucciones getinstruccion(int i){
        return instrucciones.get(i);
    }
    public int getsize(){
        return instrucciones.size();
    }
}