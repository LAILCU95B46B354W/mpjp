package kata;

public class MyUtilities {

	public boolean isDigit(String s) {
	
		boolean started = false;
		boolean minus = false;
		boolean dot = false;
		
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (Character.isDigit(cur)) {
				started = true;
			} else if (cur == '.') {
				if (dot == true) {
					return false;
				} else 
				started = true;
				dot = true;
			} else if (cur == '-')
				if (minus || started) {
					return false;
				}
			started = true;
			minus = true;
		} else if (cur == ' ') {
			if (started) {
				return false;
			}
		} else {
			return false;
		}
			  
		  }
}
