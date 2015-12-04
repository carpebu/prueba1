
public class Examen1 {

	private static final double PesoComportamiento = 0.08;
	private static final double PesoTrabajos = 0.12;
	private static final double PesoExamen = 0.8;

	public static double notaFinal (double examen, int trabajos, int comportamiento) {
		double resultado = 0;

		int fTrabajos = 1;
		double incTrabajos;
		
		incTrabajos = formulaProporcional(trabajos, fTrabajos);
		
		
		int fComportamiento = 1;
		double incComportamiento;
		
		incComportamiento = formulaProporcional(trabajos, fComportamiento);
		
		resultado = examen * PesoExamen +
				trabajos * PesoTrabajos +
				comportamiento * PesoComportamiento +
				incTrabajos + incComportamiento;
		
		
		return resultado;
	}

	private static double formulaProporcional(int trabajos, int fTrabajos) {
		double incTrabajos;
		for (int cont = 2; cont < trabajos; ++cont)
			fTrabajos = fTrabajos * cont;
		incTrabajos =  trabajos / fTrabajos;
		return incTrabajos;
	}
	
	
	
	
	
	
}
