
public class CuotaAgua {

	
	public class CalculoFactura {

		private static final double CuotaBasura = 5.0;
		private static final double PAltoAlcanta = 0.50;
		private static final double PBajoAlcanta = 0.25;
		private static final double MinimoAlcanta = 3.0;
		private static final double PAlto = 1;
		private static final double PMedio = 0.75;
		private static final double PBajo = 0.5;
		private static final double CuotaMinimaAgua = 1.5;
		/**
		* @param args
		*/
		
		
		private int consumoInterno;
		public CalculoFactura (int consumo) {
		if (consumo < 0)
		consumo = 0;
		consumoInterno = consumo;
		}
		
		
		public CalculoFactura () {
		new CalculoFactura(0);
		}
		
		
		public double getImporte() {
			return  cuotaAgua()+cuotaAlcantarilla()+cuotaBasura();
		 
		}


		public double cuotaBasura() {
			
			return CuotaBasura;
		}


		private double cuotaAlcantarilla() {
			double importe=0;
			importe += MinimoAlcanta;
			if (consumoInterno < 15)
			importe += consumoInterno * PBajoAlcanta;
			else
			importe += consumoInterno * PAltoAlcanta;
			return importe;
		}


		private double cuotaAgua() {
			double importe=0;
			importe += CuotaMinimaAgua;
			
			
			if (consumoInterno < 10)
			importe += consumoInterno * PBajo;
			
			else if (consumoInterno < 20)
			importe += consumoInterno * PMedio;
			
			else
			importe += consumoInterno * PAlto;
			return importe;
		}

		}

	
}
