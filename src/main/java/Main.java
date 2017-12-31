import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{

    public static void main(String[] args) throws ParseException
    {

        Date date = new SimpleDateFormat("dd-MM-yyyy-hh-mm").parse("01-01-1999-22-14");

        System.out.println(date);


    }

}
