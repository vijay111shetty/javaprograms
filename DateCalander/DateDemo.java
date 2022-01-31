package DateCalander;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));

	}

}
