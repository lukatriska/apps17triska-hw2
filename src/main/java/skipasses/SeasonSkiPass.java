package skipasses;

import enums.DaySkiPassTypes;
import enums.SkiPassTypes;

import java.util.Date;

public class SeasonSkiPass extends SkiPass
{
    private DaySkiPassTypes daypasstype;
    private Date dateOfActivation;
    private Date dateOfExpiration;

    public SeasonSkiPass(int ID, SkiPassTypes skipasstype, Date dateOfActivation, Date dateOfExpiration)
    {
        super(ID, skipasstype);
        this.dateOfActivation = dateOfActivation;
        this.dateOfExpiration = dateOfExpiration;
        this.active = (this.getDuration() > 0 && new Date().before(this.dateOfExpiration));
    }

    public Date getDateOfActivation()
    {
        return dateOfActivation;
    }

    public Date getDateOfExpiration()
    {
        return dateOfExpiration;
    }

    // returns duration in seconds
    public long getDuration() {
        return Math.abs(this.getDateOfActivation().getTime() - this.getDateOfExpiration().getTime()) / 1000;
    }


}
