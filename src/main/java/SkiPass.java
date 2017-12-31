import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SkiPass
{

    private final int ID;

    private Date dateOfActivation;
    private Date dateOfExpiration;

    SkiPassType type;

    boolean active = false;

    public SkiPass(int ID, Date dateOfActivation, Date dateOfExpiration)
    {
        this.ID = ID;
        this.dateOfActivation = dateOfActivation;
        this.dateOfExpiration = dateOfExpiration;
//        this.type = type;
    }

    public int getID()
    {
        return ID;
    }

    public Date getDateOfActivation()
    {
        return dateOfActivation;
    }

    public Date getDateOfExpiration()
    {
        return dateOfExpiration;
    }

    public SkiPassType getType()
    {
        return type;
    }

    public boolean isActive()
    {
        return active;
    }

    public static void main(String[] args) throws ParseException
    {
        SkiPass skipass = new SkiPass(12345789,
                new SimpleDateFormat("dd-MM-yyyy-hh-mm").parse("01-04-1999-22-14"),
                new SimpleDateFormat("dd-MM-yyyy-hh-mm").parse("01-06-1999-22-14"));

        long diffDays = Math.abs(skipass.getDateOfActivation().getTime() - skipass.getDateOfExpiration().getTime())
                / (24 * 60 * 60 * 1000);
        System.out.println("diffDays = " + diffDays);

    }


}