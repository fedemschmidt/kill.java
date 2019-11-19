public class Gato extends Habla{
    public Gato(String n, String d){
        super("miau",n,d);
    }

    public String tipo(){
        System.out.println("Gato");
        return "gato";
    }
}