/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pratico.pkg4;

import java.util.ArrayList;

/**
 *
 * @author rdrumond
 */
public class ArvoreBinariaProdutos {

    private NoProdutos Raiz;
    private int interacao;
    public int interacoesMoviemntacao;
    private ArrayList<Produtos> clone_produtos;

    public ArvoreBinariaProdutos() {
        this.Raiz = null;
    }

    public boolean Vazia() {
        return this.Raiz == null;
    }

    public void Insere(Produtos produto) {
        this.Raiz = this.Insere(produto, this.Raiz);
    }

    private NoProdutos Insere(Produtos produto, NoProdutos p) {
        if (p == null) {
            p = new NoProdutos(produto);
        } else if (produto.getCodigo_unico() < p.getProduto().getCodigo_unico()) {
            p.setEsquerda(Insere(produto, p.getEsquerda()));
        } else if (produto.getCodigo_unico() > p.getProduto().getCodigo_unico()) {
            p.setDireita(Insere(produto, p.getDireita()));
        } else {
            System.out.println("Erro: Id já pertence a algum livro.");
        }
        return p;
    }

    // melhor caso: 1 
    // medio caso: n+2?2
    // pior caso: n + 1
    public Produtos Buscar(int cod) {
        NoProdutos produto;
        if (this.Raiz == null) {
            return null;
        } else if (this.Raiz.getProduto().getCodigo_unico() == cod) {
            // 1
//            return "Valor encontrado numero de interacoes necessario[" + this.interacao + "]:"
//                    + this.Raiz.getProduto().toString();
            return this.Raiz.getProduto();
        } else {
            // n
            if (cod > this.Raiz.getProduto().getCodigo_unico()) {
                produto = BuscarDireita(cod, this.Raiz.getDireita());

            } else {
                produto = BuscarEsquerda(cod, this.Raiz.getEsquerda());
            }
        }
        if (produto == null) {
            return null;
        }
        return produto.getProduto();

    }

    private NoProdutos Buscar(int cod, NoProdutos no) {
        NoProdutos no_produto;
        if (cod > no.getProduto().getCodigo_unico()) {
            return BuscarDireita(cod, no.getDireita());
        } else {
            return BuscarEsquerda(cod, no.getEsquerda());
        }
    }

    private NoProdutos BuscarDireita(int cod, NoProdutos no) {
        if (no != null) {
            this.interacao++;
            if (no.getProduto().getCodigo_unico() == cod) {
//                return "Valor encontrado numero de interacoes necessario[" + this.interacao + "]:"
//                        + no.getProduto().toString();
                return no;
            } else {
                return Buscar(cod, no);
            }
        } else {
            return null;
        }
    }

    private NoProdutos BuscarEsquerda(int cod, NoProdutos no) {

        if (no != null) {
            this.interacao++;
            if (no.getProduto().getCodigo_unico() == cod) {
                return no;
            } else {
                return Buscar(cod, no);
            }
        } else {
            return null;
        }
    }

    public boolean Atualizar(Produtos p) {
        if (this.Raiz.getProduto().getCodigo_unico() == p.getCodigo_unico()) {
            this.Raiz.setProduto(p);
            return true;
        } else {
            // n
            if (p.getCodigo_unico() > this.Raiz.getProduto().getCodigo_unico()) {
                return AtualizarDireita(p, this.Raiz.getDireita());

            } else {
                return AtualizarEsquerda(p, this.Raiz.getEsquerda());
            }
        }
    }

    private boolean Atualizar(Produtos p, NoProdutos no) {
        if (p.getCodigo_unico() > no.getProduto().getCodigo_unico()) {
            return AtualizarDireita(p, no.getDireita());
        } else {
            return AtualizarEsquerda(p, no.getEsquerda());
        }
    }

    private boolean AtualizarDireita(Produtos p, NoProdutos no) {
        if (no != null) {
            this.interacao++;
            if (no.getProduto().getCodigo_unico() == p.getCodigo_unico()) {
                no.setProduto(p);
                return true;
            } else {
                return Atualizar(p, no);
            }
        } else {
            return false;
        }
    }

    private boolean AtualizarEsquerda(Produtos p, NoProdutos no) {
        NoProdutos no_produto;

        if (no != null) {
            if (no.getProduto().getCodigo_unico() == p.getCodigo_unico()) {
                no.setProduto(p);
                return true;
            } else {
                return Atualizar(p, no);
            }
        } else {
            return false;
        }
    }

    // o(n) melhor, pior, medio caso  
    private void CaminhamentoCentral(NoProdutos R) {
        if (R == null) {
            return;
        }

        if (R.getEsquerda() != null) {
            CaminhamentoCentral(R.getEsquerda());
        }
        System.out.print(R.getProduto().getCodigo_unico() + ",");
        if (R.getDireita() != null) {
            CaminhamentoCentral(R.getDireita());
        }
    }

    public void PreOrdem(NoProdutos R) {
        if (R == null) {
            return;
        }
        System.out.println("Produto: " + R.getProduto().toString());
        if (R.getEsquerda() != null) {
            PreOrdem(R.getEsquerda());
        }
        if (R.getDireita() != null) {
            PreOrdem(R.getDireita());
        }
    }

    public void PosOrdem(NoProdutos R) {
        if (R == null) {
            return;
        }
        if (R.getEsquerda() != null) {
            PosOrdem(R.getEsquerda());
        }
        if (R.getDireita() != null) {
            PosOrdem(R.getDireita());
        }
        System.out.println("Produto: " + R.getProduto().toString());
    }

    public NoProdutos getRaiz() {
        return Raiz;
    }

    // Complexidade 2n-1+n-1=3n-2
    private NoProdutos antecessor(NoProdutos q, NoProdutos r) {
        if (r.getDireita() != null) {
            // 2n-1
            r.setDireita(antecessor(q, r.getDireita()));
        } else {
            // n-1
            q.setProduto(r.getProduto());
            r = r.getEsquerda();
        }
        return r;
    }

    // Melhor caso: O(n)
    // Medio caso: O(n)
    // Pior caso: O(n)
    private NoProdutos retira(int cod, NoProdutos p) {
        if (p == null) {
            System.out.println("Erro: Registro não encontrado");
        } else if (cod < p.getProduto().getCodigo_unico()) {
            p.setEsquerda(retira(cod, p.getEsquerda()));
        } else if (cod > p.getProduto().getCodigo_unico()) {
            p.setDireita(retira(cod, p.getDireita()));
        } else {
            if (p.getDireita() == null) {
                p = p.getEsquerda();
            } else if (p.getEsquerda() == null) {
                p = p.getDireita();
            } else {
                p.setEsquerda(antecessor(p, p.getEsquerda()));
            }
        }
        this.interacoesMoviemntacao++;
        return p;
    }

    // Complexidade do codigo e de n
    public void retira(int cod) {
        this.interacoesMoviemntacao = 0;
        this.Raiz = this.retira(cod, this.Raiz);
    }

    public ArrayList<Produtos> clone() {
        this.clone_produtos = new ArrayList();
        if (this.Raiz == null) {
            System.out.println("Árvore vazia");
            return null;
        } else {
            this.clone_produtos.add(this.Raiz.getProduto());
            clone(this.Raiz);
        }
        return this.clone_produtos;
    }

    private void clone(NoProdutos no) {
        if (no.getEsquerda() != null) {
            this.clone_produtos.add(no.getEsquerda().getProduto());
            clone(no.getEsquerda());
        }

        if (no.getDireita() != null) {
            this.clone_produtos.add(no.getDireita().getProduto());
            clone(no.getDireita());
        }

    }

    public void printTree() {
        if (this.Raiz == null) {
            System.out.println("Árvore vazia");
        } else {
            ArrayList<Produtos> c = clone();
            for (Produtos p : c) {
                System.out.println("Codigo: " + p.getCodigo_unico() + " Nome: " + p.getNome() + " Setor: " + p.getSetor() + " Qtd: " + p.getQtd() + " Valor: " + p.getValor());
            }
        }
    }

    private void printTree(NoProdutos no) {

        if (no.getEsquerda() != null) {
            printTree(no.getEsquerda());
        }
        System.out.println("Codigo: " + no.getProduto().getCodigo_unico() + " Nome: " + no.getProduto().getNome() + " Setor: " + no.getProduto().getSetor() + " Qtd: " + no.getProduto().getQtd() + " Valor: " + no.getProduto().getValor());
        if (no.getDireita() != null) {

            printTree(no.getDireita());
        }
    }

    public void CaminhamentoCentral() {
        this.CaminhamentoCentral(this.Raiz);
    }

    /**
     * @return the interacoesMoviemntacao
     */
    public int getInteracoesMoviemntacao() {
        return interacoesMoviemntacao;
    }

    /**
     * @param interacoesMoviemntacao the interacoesMoviemntacao to set
     */
    public void setInteracoesMoviemntacao(int interacoesMoviemntacao) {
        this.interacoesMoviemntacao = interacoesMoviemntacao;
    }

    public ArvoreBinariaProdutos ordenarQuickShort() {

        ArrayList<Produtos> clone_p = this.clone();
        quickSort(clone_p, 0, clone_p.size() - 1);
        ArvoreBinariaProdutos a = new ArvoreBinariaProdutos();
        for (Produtos p : clone_p) {
            a.Insere(p);
        }

        return a;
    }

    public void quickSort(ArrayList<Produtos> v, int esq, int dir) {
        if (esq < dir) {
            int j = separer(v, esq, dir);
            quickSort(v, esq, j - 1);
            quickSort(v, j + 1, dir);

        }
    }

    public int separer(ArrayList<Produtos> v, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = v.get(esq).getCodigo_unico();
        while (i <= j) {
            if (v.get(i).getCodigo_unico() <= pivo) {
                i++;
            } else if (v.get(j).getCodigo_unico() > pivo) {
                j--;
            } else if (i <= j) {
                trocar(v, i, j);
                i++;
                j++;
            }
        }

        trocar(v, esq, j);

        return j;
    }

    public void trocar(ArrayList<Produtos> v, int i, int j) {
        Produtos aux = v.get(i);
        v.set(i, v.get(j));
        v.set(j, aux);
    }
}
