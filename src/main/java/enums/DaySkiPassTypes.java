package enums;

public enum DaySkiPassTypes
{
    NONE(0), ONE_DAY(1), TWO_DAYS(2), FIVE_DAYS(5);

    private final int _value;

    DaySkiPassTypes(int value)
    {
        this._value = value;
    }

    public int getValue()
    {
        return _value;
    }

}
