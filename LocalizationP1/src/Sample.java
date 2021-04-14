import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample {

	public static void main(String[] args) {
		
//		DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("de","DE"));
//		String d2=df.format(new Date());
//		System.out.println("Todays Time::"+d2);
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","US"));
		String d1=df.format(new Date());
        System.out.println(d1);
	}

}
