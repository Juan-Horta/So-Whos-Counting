package mundo;

public class Computadora {

	private static char[] num;
	private static int[][] tablaEstrategia;

	public Computadora() {
		num = new char[5];
		tablaEstrategia = new int[][] { { 5, 4, 3, 2, 1 }, 
										{ 5, 3, 3, 2, 1 },
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
	
	public void setTablaEstrategia(int[][] tablaEstrategia) {
		this.tablaEstrategia = tablaEstrategia;
	}

	//digito y ronda deben empezar en 0
	private static void elegir(int digito, int ronda) {

		int casilla = tablaEstrategia[digito][ronda];
		int casillaLibre = 0;
		int i;
		for (i = 0; i < num.length; i++) {
			if(casilla == casillaLibre)
				break;
			if(num[i] == '\0') {
				casillaLibre++;
			}
		}
		num[--i] = (char) (digito + '0');
	}

	private static String generarString() {

		String numString = "";
		for (char c : num) {
			if (c == '\0')
				c = '-';
			numString += c;
		}
		return numString;
	}
	
	private static int generarInt() {
		
		String numString = "";
		for (char c : num) {
			if (c == '\0')
				continue;
			numString += c;
		}
		return Integer.parseInt(numString);
	}
	
	public static void main(String[] args) {
		
		new Computadora();
		
		elegir(0,0);
		System.out.println(generarString());
		elegir(6,1);
		System.out.println(generarString());
		elegir(4,2);
		System.out.println(generarString());
		elegir(6,3);
		System.out.println(generarString());
		elegir(9,4);
		System.out.println(generarString());
		
		
	}

}
