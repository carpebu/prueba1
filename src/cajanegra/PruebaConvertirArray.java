package cajanegra;

public class PruebaConvertirArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
double [] valores = {-3 , 0.0 , 1.0 , 2.5 , 4 , 5.0 , 6 , 6.5 , 7 , 7.5 , 8 , 8.5 , 9 , 10 , 14};	
	
	String [] resultado= {
			"error<",
			"MD",
			"MD",
			"Insuficiente",
			"Insuficiente",
			"Suficiente",
			"Suficiente",
			"Bien",
			"Bien",
			"Notable",
			"Notable",
			"Sobresaliente",
			"Sobresaliente",
			"Sobresaliente",
			"Error nota > ",
	};
	
	int aciertos=0, fallos=0;
	
	
	
	for ( int cont=0; cont < valores.length; ++cont){
		if (resultado [cont] == notas.convertir(valores[cont])){
		System.out.println(
				 "valor a analizar: " + valores [cont] +
				 " Resultado esperado: " + resultado [cont] +
				 " Resultado devuelto: " + notas.convertir(valores[cont]) + "CORRECTO");
					++aciertos; 
					
	}
		else 
			System.out.println(
					 "valor a analizar: " + valores [cont] +
					 " Resultado esperado: " + resultado [cont] +
					 " Resultado devuelto: " + notas.convertir(valores[cont]) + "INCORRECTO");
						++fallos;
	}
	System.out.println("Estadisticas");
	System.out.println(" Numero de pruebas: " + (aciertos + fallos));
	System.out.println("Numero de aciertos:n "  + aciertos);
	System.out.println("Numero de fallos: " + fallos);
	
	
	
		

}
}
