package prototype;

public class MinuuttiViisari{

    private int lukema;

    MinuuttiViisari(int lukema) {
        if (lukema > 59) {
            this.lukema = 59;
        } else {
            this.lukema = lukema;
        }
    }

    public void minuutti() {
        lukema++;
        if (lukema > 59) {
            this.lukema = 59;
        }
    }

    public int getLukema() {
        return lukema;
    }
}
