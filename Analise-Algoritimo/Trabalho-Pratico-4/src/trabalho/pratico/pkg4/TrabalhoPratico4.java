/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pratico.pkg4;

import java.util.Scanner;

/**
 *
 * @author rdrumond
 */
public class TrabalhoPratico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinariaClientes clientes = new ArvoreBinariaClientes();
        Estoques estoque = new Estoques();

        int opcs = 0;
        Scanner entrada = new Scanner(System.in);
        String nome, cpf, rua, setor;
        int codigo;
        double valor;

        clientes.Insere(new Clientes("Rodrigo", "0000000", "Rua teste", 1));
        clientes.Insere(new Clientes("Daniel", "0000001", "Rua tereza", 2));
        clientes.Insere(new Clientes("Jennifer", "0000002", "Rua teste", 3));

        estoque.getEstoque().Insere(new Produtos("chocolate", 12.50, "Doces", 12, 1));
        estoque.getEstoque().Insere(new Produtos("PC", 1200.50, "Eletronicos", 3, 20));
        estoque.getEstoque().Insere(new Produtos("Fone a2", 129.50, "Eletronicos", 2, 12));

        do {
            System.out.println("\n-----------Menu-Pricipal-----------");
            System.out.println("Novo cliente - 1");
            System.out.println("Novo produto - 2");
            System.out.println("Para fazer compra devera realizar o login - 3");
            System.out.println("Listar Estoque - 4");
            System.out.println("Ordenar Estoque - 5");

            opcs = entrada.nextInt();
            switch (opcs) {
                case 1:
                    System.out.println("\n-----------Criacao Usuario-----------");

                    System.out.println("Digita o nome");
                    nome = entrada.nextLine();
                    entrada.close();

                    System.out.println("Digita o CPF");
                    cpf = entrada.nextLine();

                    System.out.println("Digita o Rua");
                    rua = entrada.nextLine();

                    System.out.println("Digita o Codigo Unico");
                    codigo = entrada.nextInt();

                    clientes.Insere(new Clientes(nome, cpf, rua, codigo));

                    break;
                case 2:

                    System.out.println("\n-----------Criacao Produto-----------");

                    System.out.println("Digita o nome");
                    nome = entrada.next();

                    System.out.println("Digita o Valor");
                    valor = entrada.nextDouble();

                    System.out.println("Digita o setor");
                    setor = entrada.next();

                    System.out.println("Digita o Codigo Unico");
                    codigo = entrada.nextInt();

                    System.out.println("Digita a quantidade");
                    int qtd = entrada.nextInt();

                    estoque.getEstoque().Insere(new Produtos(nome, valor, setor, codigo, qtd));

                    break;

                case 3:
                    Clientes c = null;
                    Produtos produto = null;

                    while (true) {
                        entrada = new Scanner(System.in);
                        System.out.println("Faca o login digite seu codigo de usuario:");
                        String escolha = entrada.nextLine();

                        if (!isNumeric(escolha)) {
                            System.out.println("Escolha invalida tente de novo.\n");
                            continue;
                        }

                        c = clientes.Buscar(Integer.parseInt(escolha));
                        if (c == null) {
                            System.out.println("Error ao buscar produto tente de novo:");
                            continue;
                        }

                        break;

                    }

                    Estoques clone_estoque = estoque.Clone();

                    System.out.println("\n---- Bem vindo cliente: " + c.toString() + "-----\n");

                    while (true) {
                        entrada = new Scanner(System.in);

                        System.out.println("\n---- Menu Compras-----");
                        System.out.println("Escolha um protudo digitando: i ou inserir");
                        System.out.println("Para Listar estoque digite: l ou listar");
                        System.out.println("Para Listar seu carrinho digite: c ou carrinho");
                        System.out.println("Para ordenar seu carrinho digite: o ou ordenar");
                        System.out.println("Para sair 'Se sair ira perder o carrinho': s ou sair");
                        System.out.println("Para finalizar : f ou finalizar\n");

                        String escolha = entrada.nextLine();
                        if (escolha.equalsIgnoreCase("i") || escolha.equalsIgnoreCase("inserir")) {
                            entrada = new Scanner(System.in);
                            while (true) {
                                System.out.println("Digite o codigo do produto!\n");

                                String codigo_digitado = entrada.next();

                                System.out.println("Digite e a Quantidade\n");

                                String qtd_produto = entrada.next();

                                if (isNumeric(codigo_digitado)) {
                                    
                                    produto = estoque.getEstoque().Buscar(Integer.parseInt(codigo_digitado));
                                    
                                    if (produto != null) {
                                        if (produto.getQtd() - Integer.parseInt(qtd_produto) >= 0) {
                                            Produtos produto_carrinho = c.getVendas().getCarrinho().Buscar(produto.getCodigo_unico());
                                            if (produto_carrinho == null) {
                                                c.getVendas().getCarrinho().Insere(new Produtos(produto.getNome(), produto.getValor() * Integer.parseInt(qtd_produto), produto.getSetor(), produto.getCodigo_unico(), Integer.parseInt(qtd_produto)));
                                            } else {
                                                produto_carrinho.setQtd(produto_carrinho.getQtd() + Integer.parseInt(qtd_produto));
                                                produto_carrinho.setValor(produto_carrinho.getValor() * produto_carrinho.getQtd());
                                                c.getVendas().getCarrinho().Atualizar(produto_carrinho);
                                            }

                                            produto.setQtd(produto.getQtd() - Integer.parseInt(qtd_produto));
                                            clone_estoque.getEstoque().Atualizar(produto);

                                            break;
                                        } else {
                                            System.out.println("Nao contem o produto em estoque\n");
                                        }
                                    }
                                    System.out.println("Produto nao encontrado\n");
                                    break;
                                }

                                System.out.println("Escolha invalida tente de novo.\n");
                                continue;

                            }

                        } else if (escolha.equalsIgnoreCase("s") || escolha.equalsIgnoreCase("sair")) {
                            c.setVendas(new Vendas());
                            break;
                        } else if (escolha.equalsIgnoreCase("o") || escolha.equalsIgnoreCase("ordenar")) {
                            c.getVendas().ordenar();
                            continue;
                        } else if (escolha.equalsIgnoreCase("f") || escolha.equalsIgnoreCase("finalizar")) {
                            entrada = new Scanner(System.in);
                            while (true) {
                                System.out.println("Tem certeza que deseja finalizar !!");
                                System.out.println("sim(s) ou nao(n) ");
                                String e = entrada.nextLine();
                                if (e.equalsIgnoreCase("sim") || e.equalsIgnoreCase("s")) {
                                    estoque.setEstoque(clone_estoque.getEstoque());
                                    System.out.println("Compra finalizada !!\n");

                                    break;
                                } else if (e.equalsIgnoreCase("nao") || e.equalsIgnoreCase("n")) {
                                    break;
                                }
                                System.out.println("Escolha invalida tente de novo.\n");
                                continue;

                            }
                        } else if (escolha.equalsIgnoreCase("c") || escolha.equalsIgnoreCase("carrinho")) {
                            System.out.println("Listar carrinho:");
                            c.getVendas().getCarrinho().printTree();
                            System.out.println("--------------------------");
                            continue;
                        } else if (escolha.equalsIgnoreCase("l") || escolha.equalsIgnoreCase("listar")) {
                            System.out.println("Listar Estoque:");
                            estoque.getEstoque().printTree();
                            System.out.println("--------------------------");
                            continue;
                        } else if (!isNumeric(escolha)) {
                            System.out.println("Escolha invalida tente de novo.\n");
                            continue;
                        }

                    }

                    break;
                case 4:
                    System.out.println("Listar Estoque:");
                    estoque.getEstoque().printTree();
                    System.out.println("--------------------------\n");
                    break;
                case 5:
                    estoque.ordenar();
                    break;
            }
        } while (opcs < 10);

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
