package GenericUtils;

import java.util.Random;

public class javautility {
	/**
	 * @author punith
	 */
public static String getRandomNumber() {
	Random ran=new Random();
	int randomnumber=ran.nextInt(1000);
	return ""+randomnumber;
}
}
