package adapter;

public class Main {

    public static void main(String[] args) {
        
        Työntekijä kokki = new Kokki();
        Tarjoilija tarjoilija = new Tarjoilija();
        Työntekijä tarjoilijaTyöntekijä = new TarjoilijaAdapter(tarjoilija);
        
        System.out.println("Kokki: \n");
        
        kokki.teeTöitä();
        kokki.pidäTauko();
        kokki.autaTyökaveria();
        
        System.out.println("\nTarjoilija: \n");
        
        tarjoilija.palveleAsiakkaita();
        tarjoilija.istu();
        tarjoilija.tuuraaTyökaveria();
        
        System.out.println("\nTarjoilijaAdapter: \n");
        
        tarjoilijaTyöntekijä.teeTöitä();
        tarjoilijaTyöntekijä.pidäTauko();
        tarjoilijaTyöntekijä.autaTyökaveria();
    }
    
}
