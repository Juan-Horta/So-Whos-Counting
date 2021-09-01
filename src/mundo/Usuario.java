package mundo;

public class Usuario {
	
	private char[] num;
	
	public Usuario() {
		num = new char[5];
		System.out.println("Usuario...");
	}
	
	public void nuevo() {
		num = new char[5];
	}
	
	public void elegir(int digito, int casilla) {
		
		if(isEmpty(casilla))
			num[casilla] = (char) (digito + '0');
	}
	
	private boolean isEmpty(int casilla) {
		
		if(num[casilla] == '\0')
			return true;
		else
			return false;
	}
	
	public int getRonda() {
		
		int ronda = 0;
		
		for (char c : num) {
			if (c != '\0')
				ronda++;	
		}
		
		return ronda;
	}
	
	public String generarString() {

		String numString = "";
		for (char c : num) {
			if (c == '\0')
				c = '-';
			numString += c;
		}
		return numString;
	}
	
	public int generarInt() {

		String numString = "";
		for (char c : num) {
			numString += c;
		}
		return Integer.parseInt(numString);
	}
}
