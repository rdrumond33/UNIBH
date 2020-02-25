package entrada_saída_atribuição_e_estrutura_sequencial;

import java.util.Scanner;

public class Lista_de_Exercícios_1 {
	/*Autor Rodrigo Drumond de Paula RA:11623863*/
	public static void main(String[] args) {

		Scanner ent_string = new Scanner(System.in);
		Scanner ent_num = new Scanner(System.in);

		int num;
		double num_1 = 0;
		double num_2 = 0;
		double num_3 = 0;
		double num_4 = 0;
		double Celsius = 0;
		double importância = 0;
		double latao = 0;

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 29: ​Criar um programa que carregue uma matriz 12 x 4 com os valores das vendas de uma loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês.\r\n"
						+ "\r\n"
						+ "Para fins de simplificação considere que cada mês possui somente 4 semanas. Calcule e imprima:\r\n"
						+ "\r\n" + "-Total vendido em cada mês do ano;\r\n" + "\r\n"
						+ "-Total vendido em cada semana durante todo o ano;\r\n" + "\r\n" + "-Total vendido no ano.");

		double[][] matrizLoja = new double[12][4];
		double totalVendaAno = 0;
		double[] totalVendaMes = new double[12];
		double[] totalVendaSemana = new double[4];

		System.out.println(
				"Questão 1: Codifique um programa que leia um número inteiro qualquer e imprima o seu sucessor e seu antecessor.");
		System.out.print("\nNumero inteiro: ");
		num_1 = ent_num.nextDouble();
		System.out.printf("\nSucessor:%.1f\nNumero:%.1f\nAntecessor:%.1f\n", num_1 + 1, num_1, num_1 - 1);

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 2: ​Codifique um programa que leia três números reais quaisquer. A seguir o programa calcula e imprime a média aritmética desses três números.");
		System.out.print("\nNumero_1: ");
		num_1 = ent_num.nextDouble();
		System.out.print("\nNumero_2: ");
		num_2 = ent_num.nextDouble();
		System.out.print("\nNumero_3: ");
		num_3 = ent_num.nextDouble();
		System.out.printf("\nMedia:%.2f\n", (num_1 + num_2 + num_3) / 3);

		System.out.print("\n/************************************************/");
		System.out.print(
				"\nQuestão 3: ​Codifique um programa para realizar a conversão de uma temperatura em graus Celsius para graus Fahrenheit. O programa recebe com entrada a temperatura em Celsius e exibe o resultado da conversão para o usuário. Utilize a fórmula para a conversão:");
		System.out.print("\n\nGraus Celsius: ");
		Celsius = ent_num.nextDouble();
		System.out.printf("\nGraus Fahrenheit: %.2f\n", (Celsius * 9 / 5) + 32);

		System.out.print("\n/************************************************/");
		System.out.print(
				"\nQuestão 4: ​Certa importância em dólares será dividida entre três pessoas. A primeira receberá 30% da quantia total; a segunda 38% e a terceira 32%. Codifique um programa que leia o valor total da importância em dólares e calcule a parcela destinada a cada pessoa.\n");
		System.out.print("\nQual a importância: ");
		importância = ent_num.nextDouble();
		System.out.printf("\nPrimeira::%.2f\nSegunda:%.2f\nTerceira:%.2f\n", (importância * 0.3), (importância * 0.38),
				(importância * 0.32));

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 5: Sabendo que o latão é obtido fundindo-se sete partes de cobre com três partes de zinco, escreva um programa que solicite quantos quilos de latão um usuário quer produzir. A seguir o programa informa ao usuário as quantidades de cobre e zinco necessárias. ");
		System.out.print("\nQuantos quilos de latão: ");
		latao = ent_num.nextDouble();
		System.out.printf("\nQuantidade de cobre:%.2f", (latao / 10) * 7);
		System.out.printf("\nQuantidade de zinco:%.2f\n", (latao / 10) * 3);

		System.out.print("\n/************************************************/");
		/* Estrutura de Seleção (Condicional) */
		System.out.println(
				"\nQuestão 6: ​Codifique um programa que faça a entrada de um número qualquer pelo teclado. A seguir o programa imprime uma mensagem textual somente se ele for maior que 20.");
		System.out.print("\nDigite um numero: ");
		num_1 = ent_num.nextDouble();
		if (num_1 > 20) {
			System.out.println("\nMensagem textual somente se o nuemero for maior que 20!!");
		}

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 7: ​Codifique um programa que leia dois números inteiros e calcule a soma desses dois números. O programa somente imprimirá o resultado da soma quando a soma for maior que 10. Se a soma for menor ou igual a 10, o programa imprime uma mensagem de aviso ao usuário.");
		System.out.print("\nDigite um numero 1: ");
		num_1 = ent_num.nextDouble();
		System.out.print("\nDigite um numero 2: ");
		num_2 = ent_num.nextDouble();
		if (num_1 + num_2 > 10) {
			System.out.printf("\nResultado da soma: ", num_1 + num_2);
		} else {
			System.out.printf("\nResultado da soma e inferior a 10!!\n");
		}

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 8: ​Codifique um programa que faça a leitura de um número inteiro pelo teclado. A seguir, o programa determina se o número é par ou impar, imprimindo uma mensagem para o usuário.");
		System.out.print("\n\nDigite um numero para verificar se e impar ou par: ");
		num_1 = ent_num.nextDouble();
		if (num_1 % 2 == 0) {

			System.out.printf("\nO numero %.2f e par\n", num_1);
		} else {

			System.out.printf("\nO numero %.2f e impar\n", num_1);
		}

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 9: ​Codifique um programa que faça a leitura de um número inteiro pelo teclado. O programa deve exibir uma mensagem de texto identificando o número como “POSITIVO”,“NEGATIVO” ou “NULO”.");
		System.out.print("\nDigite um numero: ");
		num_1 = ent_num.nextDouble();
		if (num_1 > 0) {

			System.out.printf("\nO numero %.2f e POSITIVO\n", num_1);
		} else if (num_1 < 0) {
			System.out.printf("\nO numero %.2f e NEGATIVO\n", num_1);
		} else {

			System.out.print("\nNULO!!\n");
		}

		System.out.print("\n/************************************************/");
		System.out.println(
				"\nQuestão 10: ​Codifique um programa que faça a leitura de um número inteiro pelo teclado. Se o número for positivo, ou nulo, o programa calcula a raiz quadrada do número. Caso contrário, o programa calcula o quadrado desse número.");
		System.out.print("\nDigite um numero: ");
		num_1 = ent_num.nextDouble();
		if (num_1 > 0) {

			System.out.printf("\nraiz quadrada do numero %.2f=%.5f\n", num_1, Math.sqrt(num_1));
		} else {

			System.out.printf("\nquadrada do numero %.2f=%.5f\n", num_1, Math.pow(num_1, 2));
		}

		System.out.print("\n/************************************************/");
		System.out.print(
				"\nQuestão 11: ​Codifique um programa que solicite ao usuário quatro valores, a saber: A, B, C e D. O programa deve determinar, dentre os valores fornecidos, qual é o menor e qual é o maior valor.");
		System.out.print("\nDigite um numero 1: ");
		num_1 = ent_num.nextDouble();
		System.out.print("\nDigite um numero 2: ");
		num_2 = ent_num.nextDouble();
		System.out.print("\nDigite um numero 3: ");
		num_3 = ent_num.nextDouble();
		System.out.print("\nDigite um numero 4: ");
		num_4 = ent_num.nextDouble();
		System.out.printf("\nMaior numero:%.2f\nmenor numero:%.2f",
				Math.max(Math.max(num_1, num_2), Math.max(num_3, num_4)),
				Math.min(Math.min(num_1, num_2), Math.min(num_3, num_4)));

		System.out.print("\n/************************************************/\n");
		double[] vetor = new double[3];

		System.out.println(
				"Questão 12: ​Codifique um programa que solicite ao usuário três valores, a saber: A, B e C. O programa deve imprimir os valores em ordem crescente (do menor para o maior)");

		System.out.print("\ndigite o numero A: ");
		vetor[0] = ent_num.nextDouble();
		System.out.print("\ndigite o numero B");
		vetor[1] = ent_num.nextDouble();
		System.out.print("\ndigite o nuemro C");
		vetor[2] = ent_num.nextDouble();

		double aux;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ",");

		}

		System.out.print("\n/************************************************/\n");

		System.out.println(
				"Questão 13: ​Codifique um programa que solicite ao usuário três valores, a saber: A, B e C. O programa deve imprimir os valores em ordem decrescente (do maior para o menor).");

		System.out.print("\ndigite o numero A: ");
		vetor[0] = ent_num.nextDouble();
		System.out.print("\ndigite o numero B");
		vetor[1] = ent_num.nextDouble();
		System.out.print("\ndigite o nuemro C");
		vetor[2] = ent_num.nextDouble();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (vetor[j] < vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ",");

		}

		System.out.println("\n/************************************************/");
		System.out.println(
				"Questão 14: ​Codifique um programa que leia um número inteiro qualquer e determine se esse número é igual a 5, ou se é igual a 200, ou se é igual a 400, ou se está no intervalo aberto entre 500 e 1000 (aberto nos dois extremos). O programa também verifica se o número não atende a nenhum dos critérios anteriores.");
		System.out.print("\nDigite um numero 1: ");
		num = ent_num.nextInt();
		if (num == 5 || num == 200 || num == 400) {
			System.out.printf("O numero e igual a: %d ", num);

		} else if (num > 500 && num < 1000) {
			System.out.println("O numero esta no intervalo entre 500 e 1000");

		} else {
			System.out.println("O numero nao atende os requisitos");

		}

		System.out.println("\n/************************************************/");
		System.out.println(
				"Questão 15: ​Codifique um programa que faça a leitura de dois números reais pelo teclado, (X) e (Y), respectivamente. O programa imprime o quadrado do menor número, e a raiz quadrada do maior número, quando for possível.");
		double X, Y;
		System.out.print("\nDigite um numero X: ");
		X = ent_num.nextDouble();
		System.out.print("\nDigite um numero Y: ");
		Y = ent_num.nextDouble();

		System.out.printf("\nQuadrado %.1f : %.3f", Math.min(X, Y), Math.pow(Math.min(X, Y), 2));
		System.out.printf("\nA Raiz do numero: %.1f = %.3f", Math.max(X, Y), Math.sqrt(Math.max(X, Y)));

		System.out.println("\n/************************************************/");
		/* Estrutura de Repetição */
		System.out.println("Questão 16: ​Escreva um programa que imprima todos os números inteiros de 0 a 50.");
		System.out.println();
		for (int i = 0; i < 51; i++) {
			System.out.print(i + ",");
		}

		System.out.println("\n\n/************************************************/");
		System.out.println("Questão 17: ​Escreva um programa que imprima todos os números inteiros de 100 a 200.");
		System.out.println();
		for (int i = 100; i < 201; i++) {
			System.out.print(i + ",");
		}

		System.out.println("\n\n/************************************************/");

		System.out.println(
				"Questão 18: ​Escreva um programa que receba dez números do usuário e imprima o quadrado de cada número.");
		double[] Vet_num = new double[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("\nNumero %d: ", i);
			Vet_num[i] = ent_num.nextDouble();
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("\nO quadrado do %.2f: %.2f", Vet_num[i], Math.pow(Vet_num[i], 2));
		}

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 19: ​Criar um programa que imprima todos os números de 1 até 100, inclusive, e a soma de todos eles");
		int soma = 0;
		System.out.println();
		for (int i = 1; i < 101; i++) {
			System.out.print(i + ",");
			soma += i;
		}
		System.out.println("\nSoma: " + soma);

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 20: ​Criar um programa que imprima todos os números de 1 até 100, inclusive, e a soma do quadrado desses números.");
		int somaQuadrado = 0;
		System.out.println();
		for (int i = 1; i < 101; i++) {
			System.out.print(i + ",");
			somaQuadrado += Math.pow(i, 2);
		}
		System.out.println("\nSoma quadrados: " + somaQuadrado);

		System.out.println("\n\n/************************************************/");
		System.out.print(
				"Questão 21: ​Seja a seguinte série: 1, 4, 9, 16, 25, 36, ...Escreva um programa que gere esta série até o N-ésimo termo. Este N-ésimo termo é digitado pelo usuário.");
		int N_esimo = 0;
		System.out.println("\nDigite o N-ésimo: ");
		N_esimo = ent_num.nextInt();

		System.out.print("(");
		for (int i = 0; i <= N_esimo; i++) {
			System.out.printf("%d,", i * i);
		}
		System.out.println(")");

		System.out.println("\n\n/************************************************/");
		System.out.print(
				"Questão 22: ​Seja a seguinte série:1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ..Escreva um programa que seja capaz de gerar os N termos dessa série. Esse número N deve ser lido do teclado.");
		int aux_1 = 4;
		System.out.println("\nDigite o N-ésimo: ");
		N_esimo = ent_num.nextInt();

		System.out.print("(");
		for (int i = 1; i <= N_esimo; i++) {
			System.out.printf("%d,%d,%d,", i, aux_1, aux_1++);
		}
		System.out.println(")");

		/* Vetores */
		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 23: ​Escreva um programa que armazene em um vetor todos os números inteiros de 0 a 50. Após isso, o programa deve imprimir todos os valores armazenados.");
		int[] Num = new int[51];
		for (int i = 0; i < Num.length; i++) {
			Num[i] = i;

		}
		for (int i = 0; i < Num.length; i++) {
			System.out.print(Num[i] + ",");

		}

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 24: ​Escreva um programa que armazene em um vetor todos os números pares do intervalo fechado de 1 a 100. Após isso, o programa deve imprimir todos os valores armazenados.");
		int[] NumPar = new int[50];
		int y = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				NumPar[y++] = i;
			}

		}
		for (int i = 0; i < 50; i++) {
			System.out.print(NumPar[i] + ",");

		}

		System.out.println("\n\n/************************************************/");
		System.out.print(
				"Questão 25: ​Escreva um programa que armazene em um vetor os 100 primeiros números ímpares. Após isso, o programa deve imprimir todos os valores armazenados.");
		int[] NumImp = new int[50];
		y = 0;
		for (int i = 1; i < 101; i++) {
			if (!(i % 2 == 0)) {
				NumImp[y++] = i;
			}

		}
		System.out.println();

		for (int i = 0; i < 50; i++) {
			System.out.print(NumImp[i] + ",");

		}

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 26: ​Escreva um programa que receba dez números do usuário e armazene em um vetor a metade de cada número. Após isso, o programa deve imprimir todos os valores armazenados.");
		double[] NumMetade = new double[10];

		for (int i = 0; i < NumMetade.length; i++) {
			System.out.println("Digite os numeros: ");
			NumMetade[i] = (ent_num.nextDouble() / 2);

		}
		for (int i = 0; i < NumMetade.length; i++) {
			System.out.print(NumMetade[i] + ",");

		}

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 27: ​Escreva um programa que entre com valores para uma matriz M(5x5) e imprima a matriz final, como exemplo mostrado abaixo:");
		double[][] matriz = new double[5][5];

		for (int i = 0; i < matriz.length; i++) {

			System.out.printf("Digite a linha %d da matriz: ", i + 1);
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite a coluna %d da matriz: ", j + 1);

				matriz[i][j] = ent_num.nextDouble();

			}

		}

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");

			}
			System.out.println();
		}

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 28: ​Entrar com valores inteiros para um matriz A(4x4) e para uma matriz B(4x4). Gerar e imprimir uma outra matriz com a SOMA (A+B).");

		double[][] matrizA = new double[4][4];
		double[][] matrizB = new double[4][4];
		double[][] matrizSoma = new double[4][4];

		for (int i = 0; i < matrizA.length; i++) {

			System.out.printf("Digite a linha %d da matrizA: ", i + 1);
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.printf("Digite a coluna %d da matrizB: ", j + 1);
				matrizA[i][j] = ent_num.nextDouble();

			}

		}
		for (int i = 0; i < matrizB.length; i++) {

			System.out.printf("Digite a linha %d da matrizB: ", i + 1);
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.printf("Digite a coluna %d da matrizB: ", j + 1);
				
				matrizB[i][j] = ent_num.nextDouble();

			}

		}

		for (int i = 0; i < matrizSoma.length; i++) {

			for (int j = 0; j < matrizSoma[i].length; j++) {
				matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];

			}

		}

		System.out.println("A soma da MAtriz e:  ");
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[i].length; j++) {
				System.out.print(matrizSoma[i][j] + " - ");

			}
			System.out.println();
		}
		
		System.out.println("\n\n/************************************************/");
		System.out.println("\nQuestão 29: ​Criar um programa que carregue uma matriz 12 x 4 com os valores das vendas de uma loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês.\r\n" + 
				"\r\n" + 
				"Para fins de simplificação considere que cada mês possui somente 4 semanas. Calcule e imprima:\r\n" + 
				"\r\n" + 
				"-Total vendido em cada mês do ano;\r\n" + 
				"\r\n" + 
				"-Total vendido em cada semana durante todo o ano;\r\n" + 
				"\r\n" + 
				"-Total vendido no ano.");


		for (int i = 0; i < matrizLoja.length; i++) {

			System.out.printf("\nMes: %d  \n", i + 1);
			for (int j = 0; j < matrizLoja[i].length; j++) {
				System.out.printf("Digite o lucro da %d semana:  ", j + 1);
				matrizLoja[i][j] = ent_num.nextDouble();

			}
		}

		for (int j = 0; j < matrizLoja.length; j++) {

			for (int j2 = 0; j2 < matrizLoja[j].length; j2++) {
				totalVendaMes[j] += matrizLoja[j][j2];

				if (j2 == 0) {
					totalVendaSemana[0] += matrizLoja[j][j2];

				} else if (j2 == 1) {
					totalVendaSemana[1] += matrizLoja[j][j2];
				} else if (j2 == 2) {
					totalVendaSemana[2] += matrizLoja[j][j2];
				} else if (j2 == 3) {
					totalVendaSemana[3] += matrizLoja[j][j2];
				}

			}

		}

		for (int j2 = 0; j2 < totalVendaMes.length; j2++) {

			totalVendaAno += totalVendaMes[j2];

			System.out.printf("\nMes %d, lucro memsal:%.2f \n", j2 + 1, totalVendaMes[j2]);

		}
		for (int j = 0; j < totalVendaSemana.length; j++) {
			System.out.printf("\nSemana %d, lucro Semanal do ano :%.2f \n", j + 1, totalVendaSemana[j]);

		}

		System.out.printf("\nLucro ano :%.2f", totalVendaAno);

		/* Procedimentos */
		System.out.println("\n\n/************************************************/");
		System.out.print(
				"Questão 30: ​Escreva um procedimento que receba um número inteiro e imprima o mês correspondente ao número. Por exemplo, 2 corresponde à “fevereiro”. O procedimento deve mostrar uma mensagem de erro caso o número recebido não faça sentido. Gere também um programa que leia um valor e chame o procedimento criado.");
		System.out.println("Digite o numero do mes: ");
		qualMeses(ent_num.nextInt());

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 31: ​Escreva um procedimento que gere um cabeçalho para um relatório. Esse procedimento deve receber um literal (string, ou cadeia de caracteres) como parâmetro. O cabeçalho tem a seguinte forma:");
		System.out.println("Digite o nome: ");
		relatorio(ent_string.nextLine());

		/* Funções */
		System.out.println("\n\n/************************************************/");
		System.out.print(
				"Questão 32: ​Criar uma função que determine se um caractere, recebido como parâmetro, é ou não uma letra do alfabeto. A função deve retornar 1 caso positivo e 0 em caso contrário. Escreva também um programa para testar tal função.");
		System.out.println("Digite o O caractere: ");
		System.out.println(verificarNumLetra(ent_string.next().charAt(0)));

		System.out.println("\n\n/************************************************/");
		System.out.println(
				"Questão 33: ​Um número é dito ser capicua quando lido da esquerda para a direita é o mesmo que quando lido da direita para a esquerda. O ano 2002, por exemplo, é capicua. Então, elabore uma função para verificar se um número possui essa característica. Caso o número seja capicua, a função deve retornar 1 e 0 em caso contrário. Escreva também um programa para testar tal função.");
		System.out.println(capicua(ent_string.next()));

		System.out.println("\n\n/************************************************/");
		double numero_1, numero_2;
		System.out.println(
				"Questão 34: ​Criar uma função que calcule e retorne o MENOR entre dois valores recebidos como parâmetro. Um programa para testar tal função deve ser criado.");
		System.out.print("Digite o numero 1");
		numero_1 = ent_num.nextDouble();

		System.out.print("Digite o numero 2");
		numero_2 = ent_num.nextDouble();

		System.out.println("O numero menor e :" + isMenor(numero_1, numero_2));

	}

	/* Procedimentos */
	public static void qualMeses(int n) {

		switch (n) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("mes Inválido");
			break;

		}
	}

	public static void relatorio(String nome) {
		System.out.println();
		System.out.print("===============================================\n");
		System.out.print("UFMG - Universidade Federal de Minas\n");
		System.out.print("Gerais ICEx - Instituto de Ciências Exatas\n");
		System.out.print("Disciplina de Programação de Computadores\n");
		System.out.printf("Nome: %s ", nome);
		System.out.print("\n===============================================");

	}

	/* Funções */

	public static boolean verificarNumLetra(char digt) {

		if (Character.isLetter(digt)) {
			return true;

		} else if (Character.isDigit(digt)) {
			return false;

		}
		return false;

	}

	public static boolean capicua(String digito) {

		char[] charReverse = digito.toCharArray();
		String reverso = "";
		for (int i = charReverse.length; i > 0; i--) {
			reverso = reverso + charReverse[i - 1];
		}
		if (digito.equals(reverso)) {

			return true;

		} else {
			return false;

		}

	}

	public static double isMenor(double numero1, double numero2) {

		return Math.min(numero1, numero2);

	}
}
