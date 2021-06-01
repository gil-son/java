package exceptions.nullpointer.ex02;

public class MainAvoidException {

	public static void main(String[] args) {
		Address ad = null;
		/*
		try {
			System.out.println(ad.getAllAddress());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		if(ad != null) {
			System.out.println(ad.getAllAddress());
		}else {
			System.out.println("The variable is null, don't reference a object");
		}
		
		
	}

}
