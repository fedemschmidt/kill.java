import java.util.ArrayList;
public class Pez_q_pruscino_odia extends Pez_q_nadia_odia{
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Pez_q_pruscino_odia(String n, String d){
        super(n ,d);
        vida=10;
    }

    public ArrayList<Animal> saludar(String user, String nombre, ArrayList<Animal> animales){
        if(user.equals(this.getdueño()) && vida<=1){
            vida=vida-1;
        }
        else{
            vida=0;
        }
        if(vida==0){
            for(int i=0; i!=animales.size(); i++){
                if(animales.get(i).getnombre().equals(nombre))  animales.remove(i);
            }
        }
        return animales;
    }

    public void alimentar(String u, String n){
        vida=vida+1;
    }

    public String tipo(){
        System.out.println("Pez");
        return "pez";
    }
}