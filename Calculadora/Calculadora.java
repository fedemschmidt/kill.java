import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora{
    private ArrayList<Rutinas> rutinas;
    private Stack<Integer> stack;
    private ArrayList<String> memoria;
    private ArrayList<Integer> memo; //

    public Calculadora(){
        rutinas = new ArrayList <Rutinas>();
        stack = new Stack<Integer>();
        memoria = new ArrayList<String>();
        memo = new ArrayList<Integer>();
    }

    public void addRutina (Rutinas a){
        rutinas.add(a);
    }

    public void usarRutina (int a){
        for(int i=0; i<rutinas.get(a).getsize(); i++){
            String aux=getnx(i);
            if(aux=="add") add();
            if(aux=="sub") sub();
            if(aux=="mul") mul();
            if(aux=="push") push();
            if(aux=="write") write();
            if(aux=="read") read();
        }        
    }

    public void add(){
        if(stack.empty())push(0);
        else push(pop()+pop());
    }
    public void sub(){
        if(stack.empty())push(0);
        else push(pop()-pop());
    }
    public void mul(){
        if(stack.empty())push(0);
        else push(pop()*pop());
    }
    public void push(){
        System.out.println("Que valor desea ingresar en el tope del stack?");
        Scanner scan = new Scanner(System.in);
        push(scan.nextint());
        scan.close();
    }
    public String getnx(int i){
        return rutinas.get(i).getn(i);
    }
    public void write(){
        System.out.println("Que nombre desea darle a la variable del tope del stack?");
        Scanner scan = new Scanner(System.in);
        String a=scan.next();
        for(int i=0; i<memoria.size(); i++){
            if(memoria.get(i)==a){
                memo.add(stack.pop());
                break;
            }
        }
        memoria.add(a);
        memo.add(stack.pop());
        scan.close();
    }
    public void read(){
        System.out.println("Que variable desea buscar en la memoria?");
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<memoria.size(); i++){
            if(memoria.get(i)==a){
                stack.push(memo.get(i));
                break;
            }
        }
        stack.push(0);
        scan.close();
    }
}