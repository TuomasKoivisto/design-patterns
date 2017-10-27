package factorymethod;

public class Vahtimestari extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kahvi();
    };

}