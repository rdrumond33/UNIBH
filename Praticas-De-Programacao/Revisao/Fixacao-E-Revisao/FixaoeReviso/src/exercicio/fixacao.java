package exercicio;

import java.util.*;

public class fixacao {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);// Para Numeros
		Scanner ent1 = new Scanner(System.in);// Para String
		Random rdm = new Random();// numeros aleatorios
		int[] Vnum = new int[10];
		int[] Vmedia = new int[4];

		// -------------------------------exercicio 1-----------------
		int NUMINT1 = 5, NUMINT2 = 10, NUMINT3 = 3, NUMINT4 = NUMINT1++, NUMINT5 = NUMINT4--;
		double NUMDEC1 = 2.5, NUMDEC2 = 7.2;
		String NUMTEXT1 = "LINGUAGEM", NUMTEXT2 = "JAVA";
		System.out.println("\nExercicio 2");
		System.out.println((int) NUMDEC1);
		System.out.println(NUMTEXT1 + NUMTEXT2);
		System.out.printf(NUMTEXT2 + String.valueOf(NUMDEC2) + "\n");
		System.out.println("\nExercicio 3");

		System.out.printf("%d >  %.2f: " + String.valueOf(NUMINT1 > NUMDEC1) + "\n", NUMINT1, NUMDEC1);
		System.out.printf("%d >= %d: " + String.valueOf(NUMINT1 >= NUMINT5) + "\n", NUMINT1, NUMINT5);
		System.out.printf("%d <  %d: " + String.valueOf(NUMINT2 < NUMINT3) + "\n", NUMINT2, NUMINT3);
		System.out.printf("(%d +%d) == %d: " + String.valueOf((NUMINT1 + NUMINT5) == NUMINT2) + "\n", NUMINT1, NUMINT5,
				NUMINT2);
		System.out.printf(
				"(%d <=  %d) || (%d > %.2f): " + String.valueOf((NUMINT2 <= NUMINT3) || (NUMINT1 > NUMDEC1)) + "\n",
				NUMINT2, NUMINT3, NUMINT1, NUMDEC1);
		System.out.printf(
				"(%d >  %d)  && (%d > %.2f): " + String.valueOf((NUMINT2 <= NUMINT3) || (NUMINT1 > NUMDEC1)) + "\n",
				NUMINT2, NUMINT3, NUMINT1, NUMDEC1);
		// -----------------------Exercicio
		// 4---------------------------------------------------------
		System.out.println("Exercicio 4");
		System.out.println("A: ");
		if (NUMINT1 > NUMDEC1) {
			System.out.println("Codigo 0001");
		}
		if (NUMINT1 >= NUMINT5) {
			System.out.println("Codigo 0002");

		}
		if (NUMINT2 < NUMINT3) {
			System.out.println("Codigo 0003");

		}

		System.out.println("B: ");

		if (NUMINT2 < NUMINT3) {
			System.out.println("Codigo 0011");

		} else {

			System.out.println("Codigo 0012");

		}

		System.out.println("C:");

		if (NUMINT1 >= NUMINT5) {
			System.out.println("Codigo 0100");

		} else if (NUMINT2 < NUMINT3) {

			System.out.println("Codigo 0200");

		} else if ((NUMINT1 + NUMINT5) == NUMINT2) {

			System.out.println("Codigo 0300");

		} else {
			System.out.println("Codigo 0400");

		}
		System.out.println("D:");

		if ((NUMINT5 > NUMINT4) && (NUMDEC1 < NUMDEC2)) {

			System.out.println("Codigo 1000");

		} else if (!(NUMINT2 <= NUMINT3) && (NUMINT1 < NUMDEC1)) {

			System.out.println("Codigo 2000");

		} else if (!(NUMINT5 > NUMINT4) || (NUMDEC1 < NUMDEC2)) {

			System.out.println("Codigo 3000");

		} else {

			System.out.println("Codigo 4000");

		}

		// -------------------------------------------------------------------------------------------
		System.out.println(
				"\n 5 – Altere os valores das variáveis NUMINT1, NUMDEC1, NUMTEXT1 através do teclado do usuário.\n");

		System.out.println("Digite o novo numero de NUMINT1: ");
		NUMINT1 = ent.nextInt();
		System.out.println("Digite o novo numero de NUMDEC1: ");
		NUMDEC1 = ent.nextDouble();
		System.out.println("Digite o novo numero de NUMTEXT1: ");
		NUMTEXT1 = ent1.nextLine();
		System.out.printf("\n a variavel NUMINT1:%d,NUMDEC1:%.2f,NUMTEXT1:%s\n", NUMINT1, NUMDEC1, NUMTEXT1);

		System.out.println("\n6 – Imprima os números que vão de 1 até 10 utilizando o laço de repetição WHILE.\n");

		int i = 1;
		while (i <= 10) {
			System.out.println(i++);

		}
		System.out.println("\n7 – Imprima os números que vão de 1 até 10 utilizando o laço de repetição FOR.\n");

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);

		}
		System.out.println(
				"\n8 – Imprima os números pares de 2 à 20 utilizando um dos laços de repetição (WHILE ou FOR).\n");
		i = 2;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.printf("\nNumeros par:%d\n", i);

			}
			i++;
		}

		System.out.println(
				"\n9 – Imprima os números ímpares de 1 à 30 utilizando um dos laços de repetição (WHILE ou FOR).");
		i = 1;
		while (i <= 30) {
			if (!(i % 2 == 0)) {
				System.out.printf("\nNumeros impar:%d\n", i);

			}
			i++;
		}
		System.out.println("\n10 – Crie uma tabuada utilizando um dos laços de repetição (WHILE ou FOR)");
		i = 0;
		int x = 0;
		while (i <= 10) {
			x = 0;
			while (x <= 10) {
				System.out.printf("\n%d*%d=%d\n", i, x, i * x);
				x++;

			}

			i++;
		}
		System.out.println("\n11 – Faça uma função que receba dez parâmetros e retorne a soma de todos esses números.");
		i = 0;
		while (i < 10) {
			System.out.printf("Digite o %d numero: ", i);
			Vnum[i] = ent.nextInt();
			i++;
		}
		System.out.println("Resultado da soma: " + FuncaoSoma(Vnum));

		System.out.println(
				"\n12–Faça uma função que receba dez parâmetros e retorne a multiplicação de todos esses números.");
		i = 0;
		while (i < 10) {
			System.out.printf("Digite o %d numero: ", i);
			Vnum[i] = ent.nextInt();
			i++;
		}
		System.out.println("Resultado da multiplicacao: " + FuncaoMult(Vnum));

		System.out.println("\n13 – Faça uma função que receba quatro parâmetros e retorne a média desses números.");
		i = 0;
		while (i < 4) {
			System.out.printf("Digite o %d numero: ", i);
			Vmedia[i] = ent.nextInt();
			i++;
		}
		System.out.printf("\nOresultado da media e %d\n", FuncaoMedia(Vmedia));

		System.out.println(
				"\n14 – Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A função\n"
						+ "deve retornar um valor booleano.\n");

		System.out.printf("\ndigite o numero inteiro:%s\n ", FuncaoPositivoNegativo(ent.nextInt()));

		System.out.println(
				"15 – Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve\n"
						+ "retornar um valor booleano.\n");

		System.out.println("digite o numero inteiro: ");
		System.out.println(FuncaoParImpar(ent.nextInt()));

		System.out.println(
				"16 – Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias");

		System.out.println("\ndigite o ano, mes e dia de seu aniversario: ");
		System.out.printf("Sua idade em Dias e: %.2f\n\n",funcaoIdade(ent.nextInt(), ent.nextInt(), ent.nextInt()));

		System.out.println(
				"17 – Faça um procedimento que recebe 3 valores inteiros por parâmetro e imprima-os ordenados em\n"
						+ "ordem crescente.");
		System.out.println("Digite os tres numeros: ");
		System.out.printf("\nCrecente:%s\n\n", FuncaoCrescente(ent.nextInt(), ent.nextInt(), ent.nextInt()));

		System.out.println(
				"18 – Faça um procedimento que recebe 3 valores inteiros por parâmetro e imprima-os ordenados em\n"
						+ "ordem decrescente.");
		System.out.println("Digite os tres numeros: ");
		System.out.printf("\ndecrescente:%s\n", FuncaoDecrecente(ent.nextInt(), ent.nextInt(), ent.nextInt()));

		System.out.println(
				"19 – Faça um procedimento que recebe um valor inteiro por parâmetro e imprima todos os seus numeros\n"
						+ "antecessores maiores que 0.");
		System.out.println("Digite o numero: ");
		System.out.printf("%s\n\n", FuncaoAntecessores(ent.nextInt()));

		System.out
				.println("20 – Faça um procedimento que recebe três nomes e imprima a concatenação desses três nomes.");
		System.out.println("Digite os tres nomes: ");
		System.out.printf("%s", FuncaoConcatenacao(ent1.nextLine(), ent1.nextLine(), ent1.nextLine()));

	}// fim main

	public static int FuncaoSoma(int[] Num) {
		int resultado = 0, i = 0;

		while (i < 10) {

			resultado += Num[i];

			i++;
		}
		return resultado;
	}

	public static int FuncaoMult(int[] Num) {
		int resultado = 1, i = 0;

		while (i < 10) {

			resultado *= Num[i];

			i++;
		}

		return resultado;
	}

	public static int FuncaoMedia(int[] Num) {
		int media = 0, i = 0;

		while (i < 4) {

			media += Num[i];

			i++;
		}

		return media / Num.length;
	}

	public static boolean FuncaoPositivoNegativo(int x) {

		if (x > 0) {
			return true;
		} else {

			return false;
		}
	}

	/*
	 * 15 – Faça uma função que recebe um valor inteiro e verifica se o valor é par
	 * ou ímpar. A função deve retornar um valor booleano.
	 */ public static boolean FuncaoParImpar(int x) {
		if (x % 2 == 0) {
			return true;
		} else {

			return false;
		}
	}

	/*
	 * 16 – Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e
	 * retorna essa idade expressa em dias.
	 */

	public static double funcaoIdade(int ano, int mes, int dia) {
		// pegando ano, mes e dia do systema
		Calendar cal = Calendar.getInstance();
		int diaSystem = cal.get(Calendar.DATE);
		int mesSystem = cal.get(Calendar.MONTH) + 1;
		int anoSystem = cal.get(Calendar.YEAR);

		return ((anoSystem - ano) * 365) + ((mesSystem - mes) * 31) + (diaSystem - dia);
	}

	/*
	 * 17 – Faça um procedimento que recebe 3 valores inteiros por parâmetro e
	 * imprima-os ordenados em ordem crescente.
	 */
	public static String FuncaoCrescente(int n1, int n2, int n3) {
		int[] vetor = { n1, n2, n3 };
		int aux = 0;
		int i = 0;

		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return "" + vetor[0] + ";" + vetor[1] + ";" + vetor[2];

	}
	/*
	 * 18 – Faça um procedimento que recebe 3 valores inteiros por parâmetro e
	 * imprima-os ordenados em ordem decrescent
	 */

	public static String FuncaoDecrecente(int n1, int n2, int n3) {
		int[] vetor = { n1, n2, n3 };
		int aux = 0;
		int i = 0;

		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (vetor[j] < vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return "" + vetor[0] + ";" + vetor[1] + ";" + vetor[2];

	}

	/*
	 * 19 – Faça um procedimento que recebe um valor inteiro por parâmetro e imprima
	 * todos os seus numeros antecessores maiores que 0.
	 */
	public static String FuncaoAntecessores(int n1) {
		String msg = "";
		int i = 1;
		while (i < n1) {

			msg = msg + ";" + i;
			i++;
		}

		return msg;
	}

	/*
	 * 20 – Faça um procedimento que recebe três nomes e imprima a concatenação
	 * desses três nomes.
	 */
	public static String FuncaoConcatenacao(String nome1, String nome2, String nome3) {

		return nome1 + nome2 + nome3;

	}

}
