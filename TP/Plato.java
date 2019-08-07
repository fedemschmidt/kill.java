import java.util.ArrayList;

public class Plato{
    private String nombre;
    private int pedido;
    private int nmesa;
    private int cant;

    public Plato(){

    }

    public Plato (String a, int b, int c, int d){
        this.nombre = a;
        this.pedido = b;
        this.nmesa = c;
        this.cant = d;
    }

    public void setNombre(String a){
        this.nombre = a;
    }
    public void setPedido(int a){
        this.pedido = a;
    }
    public void setNmesa(int a){
        this.nmesa = a;
    }
    public void setCant(int a){
        this.cant = a;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPedido(){
        return this.pedido;
    }
    public int getNmesa(){
        return this.nmesa;
    }
    public int getCant(){
        return this.cant;
    }
}
