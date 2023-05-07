package FolhaDePagamento;

import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[] valorHora = new double[999];
		double[] qtdeHoras = new double[999];
		double[] salarioBruto = new double[999];
		double[] horaExtra = new double[999];
		String funcionario[] = new String[999];

		System.out.println("--------------Carregamento - FOLHA DE PAGAMENTO DA RENTECH----------\n");

		for (int i = 0; i < 999; i++) {

			System.out.println("Informe o nome do funcionário " + (i + 1) + ":");
			System.out.println("Para sair digite S !"); 
			funcionario[i] = sc.next();

			if (funcionario[i].equals("S") || funcionario[i].equals("s")) {//equals sintaxe que permite o travamento de string.
				System.out.println("Programa finalizado!");
				break;
			}

			do {
				System.out.println("Informe a quantidade de horas trabalhadas: ");
				qtdeHoras[i] = sc.nextDouble();

				if (!FuncoesSalario.testaHoraTrabalhada(qtdeHoras[i])) {
					System.out.println("Quantidade de horas incorreta ou acima do limite (160h) !\n");
				}
			} while (!FuncoesSalario.testaHoraTrabalhada(qtdeHoras[i]));

			do {
				System.out.println("Informe o valor hora do Funcionário: ");
				valorHora[i] = sc.nextDouble();
				if (!FuncoesSalario.testaValorHora(valorHora[i])) {
					System.out.println("Valor hora incorreto ou maior que o limite (R$ 80,00) !\n");
				}
			} while (!FuncoesSalario.testaValorHora(valorHora[i]));

			salarioBruto[i] = FuncoesSalario.calculaSalarioBruto(qtdeHoras[i], valorHora[i]);

			horaExtra[i] = (FuncoesSalario.retornaHoraInferiorNormal(qtdeHoras[i]));

		}

		System.out.println("\n");

		System.out.println(
				"-----------------------------------FOLHA DE PAGAMENTO - RENTECH------------------------------------\n");

		System.out.println("Funcionário       " + "Qtde Hora trabalhada       " + "Qtde Horas Extras       "
				+ "Valor Hora    " + "Salário Bruto \n");
		for (int i = 0; i < 999; i++) {
			if (funcionario[i].equals("S") || funcionario[i].equals("s")) {
				break;
			} else {

				System.out.println("" + (i + 1) + "-" + funcionario[i] + "                 " + qtdeHoras[i]
						+ "                      " + horaExtra[i] + "                 " + valorHora[i] + "            "
						+ salarioBruto[i]);
			}
		}
	}
}
