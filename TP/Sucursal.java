import java.util.ArrayList;

public class Sucursal{
    private ArrayList<Plato> pls = new ArrayList<Plato>();;
    private ArrayList<Mesa> mss = new ArrayList<Mesa>();;
    private int cantmesas;

    public Sucursal(){

    }

    public void addplato (Plato plato){
        pls.add(plato);
    }
    public void addmesa (Mesa mesa){
        mss.add(mesa);
    }
    public void setCantmesas(int a){
        this.cantmesas = a;
    }
    public int getCantmesas(){
        return this.cantmesas;
    }
    public void numesa(int a){
        System.out.println(pls.get(a).getNmesa());
    }
    public void register(){
        for(int i=0 ; i<pls.size() ; i++){
            System.out.println(pls.get(i).getNombre());
        }
    }
    public void añadir(int a, ArrayList<String> n, ArrayList<Integer> c){
        n.add(pls.get(a).getNombre());
        c.add(pls.get(a).getCant());
    }
    public void cantplatos(){
        ArrayList<String> n = new ArrayList<String>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        int aux = 0;
        int pq = 0;
        añadir(0, n, c);
        for(int i=0 ; i<pls.size() ; i++){
            boolean paso = false;
            for(int j=0 ; j<n.size() ; j++){
                if(pls.get(i).getNombre().equals(n.get(j))){
                    aux = c.get(j);
                    pq = pls.get(i).getCant();
                    c.set(j, aux + pq);
                    paso = true;
                    break;
                } 
            }
            if(!paso) {
                añadir(i, n, c);
            }
        }
        for(int i=0 ; i<n.size() ; i++){
            System.out.print(n.get(i));
            System.out.print("  ");
            System.out.println(c.get(i));
        }
        String mays = n.get(0);
        int mayi = c.get(0);
        String mens = n.get(0);
        int meni = c.get(0);
        for(int i=0 ; i<n.size() ; i++){
            if(mayi<c.get(i)){
                mays = n.get(i);
                mayi = c.get(i);
            }
            if(meni>c.get(i)){
                mens = n.get(i);
                meni = c.get(i);
            }
        }
        System.out.print("El plato mas vendido fue ");
        System.out.print(mays);
        System.out.print(" habiendo sido vendido/s ");
        System.out.println(mayi);
        System.out.print("Y el plato menos vendido fue ");
        System.out.print(mens);
        System.out.print(" habiendo sido vendido/s ");
        System.out.println(meni);
    }
    
}