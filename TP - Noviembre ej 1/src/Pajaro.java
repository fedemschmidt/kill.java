public class Pajaro extends Habla{
    public boolean cantor;

    public Pajaro(String n, String d){
        super("pio",n,d);
        cantor = false;
    }

    public Pajaro(String s, String n, String d){
        super(s,n,d);
        cantor = true;
    }

    public String tipo(){
        System.out.println("Pajaro");
        return "pajaro";
    }
}