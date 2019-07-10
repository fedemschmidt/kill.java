

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

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
            String aux=getn(a, i);
            if(stack.empty()) {
                stack.push(0);
            }
            if(aux=="add") add();
            if(aux=="sub") sub();
            if(aux=="mul") mul();
            if(aux=="push") ingresarStack();
            if(aux=="write") write();
            if(aux=="read") read();
        }
    }

    public void add(){
        int aux=stack.pop();
        if(stack.empty()) stack.push(0);
        stack.push(aux+stack.pop());
    }
    public void sub(){
        int aux=stack.pop();
        if(stack.empty()) stack.push(0);
        stack.push(aux-stack.pop());
    }
    public void mul(){
        int aux=stack.pop();
        if(stack.empty()) stack.push(0);
        stack.push(aux*stack.pop());
    }
    public void ingresarStack(){
        System.out.println("Que valor desea ingresar en el tope del stack?");
        Scanner scan = new Scanner(System.in);
        stack.push(scan.nextInt());
    }
    public String getn(int a, int i){
        return rutinas.get(a).getinstruccion(i);
    }
    public void write(){
        System.out.println("Que nombre desea darle a la variable del tope del stack?");
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        for(int i=0; i<memoria.size(); i++){
            if(memoria.get(i)==a){
                memo.add(stack.pop());
                break;
            }
        }
        memoria.add(a);
        memo.add(stack.pop());
    }
    public void read(){
        System.out.println("Que variable desea buscar en la memoria?");
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        for(int i=0; i<memoria.size(); i++){
            if(memoria.get(i).equals(a)){
                int aux = memo.get(i);
                stack.push(aux);
                break;
            }
        }
    }
    public int check(){
        return stack.peek();
    }
}