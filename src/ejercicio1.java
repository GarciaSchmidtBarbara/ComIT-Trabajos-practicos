
public class ejercicio1 {

	public static void main(String[] args) {
			
		int valores[]= new int [3];
		
		//genero los 3 valores y los almaceno en un array
		for(int i=0; i<3; i++) {
			valores[i]=generarNumeroRandom();
		}
		
		informarValores(valores);
		int suma= sumar(valores);
		calcularPromedio(suma);
		calcularPorcentajeDelNum1(valores[0], suma);
	}


	private static void informarValores(int[] valores) {
		System.out.println("Valores Generados: ");
		for(int i=0; i<3; i++) {
			System.out.println(valores[i]+"-");
		}
	}

	private static void calcularPorcentajeDelNum1(int primero, int suma) {
		System.out.println("El promedio del primero respecto a la suma es: "+ (primero*100)/(suma) +"%");
		
	} 

	private static void calcularPromedio(int suma) {
		System.out.println("El promedio de los tres numeros es: "+(suma/3));
		
	}

	private static int sumar(int[] vec) {
		int suma=0;
		for(int i=0; i<3; i++) {
			suma= suma + vec[i] ;
		}
		System.out.println("La suma de los tres numero da como resultado: "+ suma);
		return suma;
	}

	public static int generarNumeroRandom() {
		return (int)(1000*Math.random());				//genera numeros de 3 digitos
	}
}
