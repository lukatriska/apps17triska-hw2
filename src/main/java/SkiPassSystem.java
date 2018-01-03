import enums.DaySkiPassTypes;
import enums.RidesSkiPassTypes;
import enums.SkiPassTypes;
import skipasses.DaySkiPass;
import skipasses.RidesSkiPass;
import skipasses.SeasonSkiPass;
import skipasses.SkiPass;

import java.util.ArrayList;
import java.util.Date;

public class SkiPassSystem
{
    public Turnstile turnstile;
    public ArrayList<SkiPass> skiPasses;
    public int numberOfSkipasses = 0;


    public SkiPassSystem(Turnstile turnstile)
    {
        this.turnstile = turnstile;
    }

    public DaySkiPass createDaySkiPass(SkiPassTypes skipasstype, DaySkiPassTypes daypasstype,
                                    Date dateOfActivation, Date dateOfExpiration) {
        numberOfSkipasses++;
        DaySkiPass dayskipass = new DaySkiPass(numberOfSkipasses, skipasstype, daypasstype, dateOfActivation, dateOfExpiration);
        skiPasses.add(dayskipass);
        return dayskipass;
    }

    public RidesSkiPass createRidesSkiPass(SkiPassTypes skipasstype, RidesSkiPassTypes ridespasstype) {
        numberOfSkipasses++;
        RidesSkiPass rideskipass = new RidesSkiPass(numberOfSkipasses, skipasstype, ridespasstype, ridespasstype.getValue());
        skiPasses.add(rideskipass);
        return rideskipass;
    }

    public SeasonSkiPass createSeasonSkiPass(SkiPassTypes skipasstype, Date dateOfActivation, Date dateOfExpiration) {
        numberOfSkipasses++;
        SeasonSkiPass seasonskipass = new SeasonSkiPass(numberOfSkipasses, skipasstype, dateOfActivation, dateOfExpiration);
        skiPasses.add(seasonskipass);
        return seasonskipass;
    }




}
