
package abstractfactory;

public class Jasper {
    Farmarit farmarit = null;
    Tpaita tpaita = null;
    Lippis lippis = null;
    Kengät kengät = null;
    AbstractFactory factory = null;
    
    public Jasper(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public void pueVaatteet() {
        System.out.println("Puen päälleni farmarit, t-paidan, lippiksen ja kengät.");
        farmarit = factory.luoFarmarit();
        tpaita = factory.luoPaita();
        lippis = factory.luoLippis();
        kengät = factory.luoKengät();
    }
    
    public void esitteleVaatteet() {
        System.out.println("Minulla on päälläni " + toString());
    }
    
    @Override
    public String toString() {
        return farmarit.getNimi() + ", " + tpaita.getNimi() + ", " + lippis.getNimi() + " ja " 
                + kengät.getNimi() + ".";
    }
}
