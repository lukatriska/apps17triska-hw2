import skipasses.RidesSkiPass;
import skipasses.SkiPass;

public class Turnstile
{


    public boolean checkSkiPass(SkiPass skipass) {
        return skipass.isActive();
    }

    public void makePass(RidesSkiPass sp) {
        sp.setNumberOfRidesLeft(sp.getNumberOfRidesLeft() - 1);
    }

}
