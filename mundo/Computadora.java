package mundo;

public class Computadora {

	private char[] num;
	private int[][] tablaEstrategia;

	public Computadora() {
		num = new char[5];
		tablaEstrategia = new int[][] { { 5, 4, 3, 2, 1 }, 
										{ 5, 3, 3, 2, 1 }, 
										{ 4, 3, 2, 2, 1 }, 
										{ 4, 3, 2, 2, 1 },
										{ 3, 2, 2, 1, 1 }, 
										{ 3, 2, 1, 1, 1 }, 
										{ 2, 2, 1, 1, 1 }, 
										{ 1, 1, 1, 1, 1 }, 
										{ 1, 1, 1, 1, 1 } };
		System.out.println("Computadora...");
	}
	
	public Computadora(int[][] tablaEstrategia) {
		num = new char[5];
		this.tablaEstrategia = tablaEstrategia;
	}

	//digito y ronda deben empezar en 0
	private void elegir(int digito, int ronda) {

		int casilla = tablaEstrategia[digito][ronda] - 1;
		do {
			if (num[casilla++] == '\0') {
				num[casilla] = (char) (digito + '0');
				break;
			} 
		} while (casilla < num.length);
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
