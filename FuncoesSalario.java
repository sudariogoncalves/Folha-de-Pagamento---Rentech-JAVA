package FolhaDePagamento;

public class FuncoesSalario {
	
	
			 public static boolean testaHoraTrabalhada(double hora){
				if ((hora < 0) || (hora > (160))) { 
					return false;
					} else { 
						return true;
						}
	
			 }public static boolean testaValorHora (double valor) {
					if ((valor < 0) || (valor > 80)){ 
						return false;
						} else {
							return true;
							}
				
						
			}public static double calculaSalarioBruto(double hora, double valor) {
					
					double salarioBruto = 0; 
					if ((hora<=40) || (hora>160)){
						salarioBruto = hora * valor;
					   } else { 
						
						double horaExtra = hora - 40;
						salarioBruto =((40 * valor) + (horaExtra*valor*1.5));
					
					   } return salarioBruto;
					   
			}public static double retornaHoraInferiorNormal(double hora) {
					   
					  double  horaExtra = hora- 40;
						if (horaExtra <0) {
							horaExtra = 0;
						}
						return horaExtra;
					
				}			
				
}

			
