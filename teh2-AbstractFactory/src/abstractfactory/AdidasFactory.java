
package abstractfactory;


public class AdidasFactory implements AbstractFactory{
    @Override
    public Tpaita luoPaita() {
        Tpaita tpaita = new Tpaita("Adidas-paita");
        return tpaita;
    }
    @Override
    public Farmarit luoFarmarit(){
        Farmarit farmarit = new Farmarit("Adidas-farmarit");
        return farmarit;
    }
    @Override
    public Lippis luoLippis(){
        Lippis lippis = new Lippis("Adidas-lippis");
        return lippis;
    }
    @Override
    public Kengät luoKengät() {
        Kengät kengät = new Kengät("Adidas-kengät");
        return kengät;
    }
}
