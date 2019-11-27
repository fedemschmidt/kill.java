public class Cosa{
    int p;
    boolean used;

    public Cosa(){

    }
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public boolean getUsed() {
        return used;
    }

    public void setUsed(boolean u) {
        this.used = u;
    }

    public void ap(int x){ //addpoints
        p = x;
        used = true;
    }
}