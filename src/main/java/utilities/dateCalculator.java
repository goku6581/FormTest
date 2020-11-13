package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateCalculator {

	public dateCalculator()	{
	}


	protected String getActualDate() {
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy") ;
		return dateFormat.format(date);
	}
	
	public String retDateActual() {
		return getActualDate();
	}
	
}

