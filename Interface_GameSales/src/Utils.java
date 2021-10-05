
public class Utils {
	public static void runVerify(Verify[] verifys,String message) {
		for(Verify verify : verifys) {
			verify.verifyM(message);
		}
	}
}	
