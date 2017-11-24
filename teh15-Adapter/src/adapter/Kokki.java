package adapter;

public class Kokki implements Työntekijä{

    @Override
    public void teeTöitä() {
        System.out.println("Kokkaa siskonmakkarakeittoa");
    }

    @Override
    public void pidäTauko() {
        System.out.println("Juo ison kupin kahvia");
    }

    @Override
    public void autaTyökaveria() {
        System.out.println("Ottaa pannun ylähyllyltä");
    }
    
}
