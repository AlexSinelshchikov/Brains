import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Date date = new Date();

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy 'и время' hh:mm:ss a zzz" );


        System.out.println(format.format(date));
    }
}
