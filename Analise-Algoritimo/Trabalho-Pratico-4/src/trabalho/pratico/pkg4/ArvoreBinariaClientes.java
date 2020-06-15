package trabalho.pratico.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rdrumond
 */
public class ArvoreBinariaClientes {
    private NoClientes Raiz;
    private int interacao;
    public int interacoesMoviemntacao;
    
    public ArvoreBinariaClientes() {
        this.Raiz = null;
    }

    public boolean Vazia() {
        return this.Raiz == null;
    }
    public void Insere(Clientes cliente) {
        this.Raiz = this.Insere(cliente, this.Raiz);
    }
     
    private NoClientes Insere(Clientes cliente, NoClientes p) {
        if (p == null) {
            p = new NoClientes(cliente); 
        } else if (cliente.getCodigo_unico() < p.getCliente().getCodigo_unico()) {
            p.setEsquerda(Insere(cliente, p.getEsquerda()));
        } else if (cliente.getCodigo_unico()  > p.getCliente().getCodigo_unico()) {
            p.setDireita(Insere(cliente, p.getDireita()));
        } else {
            System.out.println("Erro: Id já pertence a algum livro.");
        }
        return p;
    }
  
     
    // melhor caso: 1 
    // medio caso: n+2?2
    // pior caso: n + 1
     public Clientes Buscar(int cod) {
        NoClientes cliente;
        this.interacao = 0;
        if (this.Raiz.getCliente().getCodigo_unico() == cod) {
            // 1
//            return "Valor encontrado numero de interacoes necessario[" + this.interacao + "]:"
//                    + this.Raiz.getProduto().toString();
            return this.Raiz.getCliente();
        } else {
            // n
            if (cod > this.Raiz.getCliente().getCodigo_unico()) {
                cliente = BuscarDireita(cod, this.Raiz.getDireita());

            } else {
                cliente = BuscarEsquerda(cod, this.Raiz.getEsquerda());
            }
        }
        if (cliente != null) {
            return cliente.getCliente();
        }
        return null;

    }

    private NoClientes Buscar(int cod, NoClientes no) {
        NoClientes no_produto;
        if (cod > no.getCliente().getCodigo_unico()) {
            no_produto = BuscarDireita(cod, no.getDireita());
        } else {
            no_produto = BuscarEsquerda(cod, no.getEsquerda());
        }
        return no_produto;
    }
 
    private NoClientes BuscarDireita(int cod, NoClientes no) {
        NoClientes no_produto;
        if (no != null) {
            this.interacao++;
            if (no.getCliente().getCodigo_unico() == cod) {
//                return "Valor encontrado numero de interacoes necessario[" + this.interacao + "]:"
//                        + no.getProduto().toString();
                return no;
            } else {
                no_produto = Buscar(cod, no);
            }
        } else {
            return null;
        }
        return no_produto;
    }

    private NoClientes BuscarEsquerda(int cod, NoClientes no) {
        NoClientes no_produto;

        if (no != null) { 
            this.interacao++;
            if (no.getCliente().getCodigo_unico() == cod) {
                return no;
            } else {
                no_produto = Buscar(cod, no);
            }
        } else {
            return null;
        }
        return no;
    }

     
    // o(n) melhor, pior, medio caso  
    private void CaminhamentoCentral(NoClientes R) {
        if (R == null) {
            return;
        }

        if (R.getEsquerda() != null) {
            CaminhamentoCentral(R.getEsquerda());
        }
        System.out.print(R.getCliente().getCodigo_unico()+",");
        if (R.getDireita() != null) {
            CaminhamentoCentral(R.getDireita());
        }
    }

    public void PreOrdem(NoClientes R) {
        if (R == null) {
            return;
        }
        System.out.println("Produto: " + R.getCliente().toString());
        if (R.getEsquerda() != null) {
            PreOrdem(R.getEsquerda());
        }
        if (R.getDireita() != null) {
            PreOrdem(R.getDireita());
        }
    }

    public void PosOrdem(NoClientes R) {
        if (R == null) {
            return;
        }
        if (R.getEsquerda() != null) {
            PosOrdem(R.getEsquerda());
        }
        if (R.getDireita() != null) {
            PosOrdem(R.getDireita());
        }
        System.out.println("Produto: " + R.getCliente().toString());
    }

    public NoClientes getRaiz() {
        return Raiz;
    }
    
  // Complexidade 2n-1+n-1=3n-2
    private NoClientes antecessor(NoClientes q, NoClientes r) {
        if (r.getDireita() != null) {
            // 2n-1
            r.setDireita(antecessor(q, r.getDireita()));
        } else {
            // n-1
            q.setCliente(r.getCliente());
            r = r.getEsquerda();
        }
        return r;
    }
    

    // Melhor caso: O(n)
    // Medio caso: O(n)
    // Pior caso: O(n)
    private NoClientes retira(int cod, NoClientes p) {
        if (p == null) {
            System.out.println("Erro: Registro não encontrado");
        } else if (cod < p.getCliente().getCodigo_unico()) {
            p.setEsquerda(retira(cod, p.getEsquerda()));
        } else if (cod > p.getCliente().getCodigo_unico()) {
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
        this.interacoesMoviemntacao ++;
        return p;
    }
    // Complexidade do codigo e de n
    public void retira(int cod) {
        this.interacoesMoviemntacao = 0;
        this.Raiz = this.retira(cod, this.Raiz);
    }

    public void printTree() {
        if (this.Raiz == null) {
            System.out.println("Árvore vazia");
        } else {
            int nivel = 0;
            printTree(this.Raiz, nivel);
        }
    }

    private void printTree(NoClientes no, int nivel) {

        nivel++;
        if (no.getEsquerda() != null) {
            printTree(no.getEsquerda(), nivel);
        }
        if (no.getDireita() != null) {

            printTree(no.getDireita(), nivel);
        }
        System.out.println("Nivel[" + nivel + "]Codigo:" + no.getCliente().getCodigo_unico());
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
}
