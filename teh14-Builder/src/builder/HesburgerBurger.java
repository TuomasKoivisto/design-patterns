package builder;

import java.util.ArrayList;
import java.util.List;

public final class HesburgerBurger implements BurgerBuilder{

    private List <Osa> osat;
    
    HesburgerBurger() {
        buildBurger();
    }
    
    @Override
    public void buildBurger() {
        osat = new ArrayList();
        osat.add(new Osa("hesesämpylä"));
        osat.add(new Osa("hesejuusto"));
        osat.add(new Osa("hesepihvi"));
        osat.add(new Osa("hesesalaatti"));
        osat.add(new Osa("hesekastike"));
    }

    public List getBurger() {
        return osat;
    }
    
    private class Osa {
        String osa;
        
        Osa(String osa) {
            this.osa = osa;
        }
        @Override
        public String toString() {
            return osa;
        }
    }
}
