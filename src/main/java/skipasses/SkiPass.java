package skipasses;

import enums.DaySkiPassTypes;
import enums.RidesSkiPassTypes;
import enums.SkiPassTypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SkiPass
{

    private final int ID;

    private SkiPassTypes skipasstype;
//    private DaySkiPassTypes daypasstype;
//    private RidesSkiPassTypes ridespasstype;

    public boolean active = false;

    public SkiPass(int ID, SkiPassTypes skipasstype)
    {
        this.ID = ID;
        this.skipasstype = skipasstype;
    }

    public int getID()
    {
        return ID;
    }

    public SkiPassTypes getSkipasstype()
    {
        return skipasstype;
    }

    public boolean isActive()
    {
        return active;
    }

    public void block() {
        this.active = false;
    }

//    public static void main(String[] args) throws ParseException
//    {
//        skipasses.SkiPass skipass = new skipasses.SkiPass(
//                12345789,
//                new SimpleDateFormat("dd-MM-yyyy-hh-mm").parse("01-04-1999-22-14"),
//                new SimpleDateFormat("dd-MM-yyyy-hh-mm").parse("01-06-1999-22-14"),
//                SkiPassTypes.WORKDAYS,
//                DaySkiPassTypes.FIVE_DAYS,
//                RidesSkiPassTypes.NONE
//        );
//
//        System.out.println("diffDays = " + skipass.getDuration());
//        System.out.println(skipass.isActive());
//
//    }


}