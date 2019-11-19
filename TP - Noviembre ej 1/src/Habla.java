import java.util.ArrayList;

abstract public class Habla extends Animal{
    public String saludo;
    public int happiness;

    public Habla(String s, String n, String d){
        super(n, d);
        saludo=s;
        happiness=1;
    }

    public ArrayList<Animal> saludar(String user, String nombre, ArrayList<Animal> animales){
        String x = saludo;
        if(!(user.equals(getdueño()))){
            saludo=saludo.toUpperCase();
            saludo=saludo+"!";
        }
        String talk = saludo;
        for(int i=1; i!=happiness; i++){
            talk=talk + " " + saludo;
        }
        if(happiness>1) happiness = happiness - 1;
        System.out.println(talk);
        saludo = x;
        return animales;
    }

    public void alimentar(String n){
        happiness=happiness+1;
    }
}