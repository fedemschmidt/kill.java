public class Perro extends Habla{
    public Perro(String n, String d){
        super("guau",n,d);
    }

    public String tipo(){
        System.out.println("Perro");
        return "perro";
    }
}