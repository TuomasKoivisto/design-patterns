package adapter;

public class TarjoilijaAdapter implements Työntekijä{
    
    Tarjoilija tarjoilija;

    public TarjoilijaAdapter(Tarjoilija tarjoilija) {
        this.tarjoilija = tarjoilija;
    }
    
    @Override
    public void teeTöitä() {
        tarjoilija.palveleAsiakkaita();
    }

    @Override
    public void pidäTauko() {
        tarjoilija.istu();
    }

    @Override
    public void autaTyökaveria() {
        tarjoilija.tuuraaTyökaveria();
    }
    
}
