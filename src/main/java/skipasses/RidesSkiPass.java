package skipasses;

import enums.RidesSkiPassTypes;
import enums.SkiPassTypes;

import java.util.Date;

public class RidesSkiPass extends SkiPass
{
    private RidesSkiPassTypes ridespasstype;
    private int numberOfRidesLeft;


    public RidesSkiPass(int ID, SkiPassTypes skipasstype, RidesSkiPassTypes ridespasstype, int numberOfRidesLeft)
    {
        super(ID, skipasstype);
        this.ridespasstype = ridespasstype;
        this.numberOfRidesLeft = numberOfRidesLeft;
        if (this.getNumberOfRidesLeft() > 0) this.active = true;
    }

    public void setNumberOfRidesLeft(int numberOfRidesLeft)
    {
        this.numberOfRidesLeft = numberOfRidesLeft;
    }

    public int getNumberOfRidesLeft()
    {
        return numberOfRidesLeft;
    }

    public RidesSkiPassTypes getRidespasstype()
    {
        return ridespasstype;
    }

    @Override
    public boolean isActive()
    {
        return this.getNumberOfRidesLeft() > 0;
    }
}
