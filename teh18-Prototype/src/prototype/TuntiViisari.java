package prototype;

public class TuntiViisari {

    private int lukema;

    TuntiViisari(int lukema) {
        if (lukema > 59) {
            this.lukema = 59;
        } else {
            this.lukema = lukema;
        }
    }

    public void tunti() {
        lukema++;
        if (lukema > 59) {
            this.lukema = 59;
        }
    }

    public int getLukema() {
        return lukema;
    }
}
