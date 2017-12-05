package prototype;

public class SekuntiViisari{

    private int lukema;

    SekuntiViisari(int lukema) {
        if (lukema > 59) {
            this.lukema = 59;
        } else {
            this.lukema = lukema;
        }
    }

    public void sekunti() {
        lukema++;
        if (lukema > 59) {
            this.lukema = 59;
        }
    }

    public int getLukema() {
        return lukema;
    }
}
