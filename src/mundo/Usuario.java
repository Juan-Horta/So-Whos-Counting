package mundo;

public class Usuario {
	
	private char[] num;
	
	public Usuario() {
		num = new char[5];
		System.out.println("Usuario...");
	}
	
	private void elegir(int digito, int casilla) {
		
		if(isEmpty(casilla))
			num[casilla] = (char) (digito + '0');
	}
	
	private boolean isEmpty(int casilla) {
		
		if(num[casilla] == '\0')
			return true;
		else
			return false;
	}
	
	private String generarString() {

		String numString = "";
		for (char c : num) {
			if (c == '\0')
				c = '-';
			numString += c;
		}
		return numString;
	}
	
	private int generarInt() {

		String numString = "";
		for (char c : num) {
			numString += c;
		}
		return Integer.parseInt(numString);
	}
}
