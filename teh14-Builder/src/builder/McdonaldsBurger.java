package builder;

public final class McdonaldsBurger implements BurgerBuilder{
    
    StringBuilder osat;
    
    public McdonaldsBurger() {
        buildBurger();
    }

    @Override
    public void buildBurger() {
        osat = new StringBuilder();
        osat.append("mcsämpylä ");
        osat.append("mcjuusto ");
        osat.append("mcpihvi ");
        osat.append("mcsalaatti ");
        osat.append("mckastike ");
    }

    public StringBuilder getBurger() {
        return osat;
    }
}
