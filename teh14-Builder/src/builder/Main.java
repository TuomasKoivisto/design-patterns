package builder;

public class Main {
    
    public static void main(String[] args) {
        
        //luodaan "tyhjät" hampparit
        HesburgerBurger heseBurger = new HesburgerBurger();
        McdonaldsBurger mcdonaldsBurger = new McdonaldsBurger();
        
        //Listin tulostus
        heseBurger.getBurger().forEach((x) -> {
            System.out.print(x.toString() + " ");
        });
        
        //Stringbuilderin tulostus
        System.out.print("\n" + mcdonaldsBurger.getBurger());
    }
    
}
