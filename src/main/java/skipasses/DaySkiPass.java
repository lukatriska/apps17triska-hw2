package skipasses;

import enums.DaySkiPassTypes;
import enums.SkiPassTypes;

import java.util.Date;

public class DaySkiPass extends SkiPass
{
    private DaySkiPassTypes daypasstype;
    private Date dateOfActivation;
    private Date dateOfExpiration;

    public DaySkiPass(int ID, SkiPassTypes skipasstype, DaySkiPassTypes daypasstype,
                      Date dateOfActivation, Date dateOfExpiration)
    {
        super(ID, skipasstype);
        this.daypasstype = daypasstype;
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

    public DaySkiPassTypes getDaypasstype()
    {
        return daypasstype;
    }

    // returns duration in seconds
    public long getDuration() {
        return Math.abs(this.getDateOfActivation().getTime() - this.getDateOfExpiration().getTime()) / 1000;
    }

}
