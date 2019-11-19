import java.util.ArrayList;

public abstract class Animal{
    private String nombre;
    private String dueño;

    public Animal(String n, String d){
        nombre=n;
        dueño=d;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdueño() {
        return dueño;
    }

    public void setdueño(String dueño) {
        this.dueño = dueño;
    }

    public void add(String n, String d){

    }

    public ArrayList<Animal> saludar(String user, String nombre, ArrayList<Animal> animales){
        return  animales;
    }

    public void alimentar(String n){}

    public void mostrar(){
        System.out.println(this.nombre+" - "+this.dueño);
    }

    public String tipo(){
        return "x";
    }
}