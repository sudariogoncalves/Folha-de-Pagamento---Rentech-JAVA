package FolhaDePagamento;

public class FuncoesSalario {
	
	
			 public static boolean testaHoraTrabalhada(double hora){
				if ((hora < 0) || (hora > (160))) { 
					return false;
					} else { 
						return true;
						}
	
			 }public static boolean testaValorHora (double valorHora) {
					if ((valorHora < 0) || (valorHora > 80)){ 
						return false;
						} else {
							return true;
							}
				
						
			}public static double calculaSalarioBruto(double horas, double valorHora) {
					
					double salarioBruto = 0; 
					if ((horas<=40) || (horas>160)){
						salarioBruto = horas * valorHora;
					   } else { 
						
						double horaExtra = horas - 40;
						salarioBruto =((40 * valorHora) + (horaExtra*valorHora*1.5));
					
					   } return salarioBruto;
					   
			}public static double retornaHoraInferiorNormal(double qtdeHoras) {
					   
					  double  horaExtra = qtdeHoras- 40;
						if (horaExtra <0) {
							horaExtra = 0;
						}
						return horaExtra;
					
				}			
				
}

			
