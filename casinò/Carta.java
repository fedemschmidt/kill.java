public class Carta{
    String palo;
    int num;
    boolean use;

    public String getPalo() { return palo; }

    public void setPalo(String palo) { this.palo = palo;}

    public boolean getUse() { return use; }

    public void setUse(boolean use) { this.use = use; }

    public int getNum() { return num; }

    public void setNum(int num) { this.num = num; }

    public Carta(String p,int n){
        palo = p;
        num = n;
        use = false;
    }
}