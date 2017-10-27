
package abstractfactory;

public class BossFactory implements AbstractFactory{
    @Override
    public Tpaita luoPaita() {
        Tpaita tpaita = new Tpaita("Boss-paita");
        return tpaita;
    }
    @Override
    public Farmarit luoFarmarit(){
        Farmarit farmarit = new Farmarit("Boss-farmarit");
        return farmarit;
    }
    @Override
    public Lippis luoLippis(){
        Lippis lippis = new Lippis("Boss-lippis");
        return lippis;
    }
    @Override
    public Kengät luoKengät() {
        Kengät kengät = new Kengät("Boss-kengät");
        return kengät;
    }
}
