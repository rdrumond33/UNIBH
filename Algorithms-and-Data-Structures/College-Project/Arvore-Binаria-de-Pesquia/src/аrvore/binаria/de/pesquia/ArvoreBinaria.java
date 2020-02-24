package árvore.binária.de.pesquia;

/**
 *
 * @author Rodrigo Drumond
 */
public class ArvoreBinaria {

    private Nodo raiz;

    public ArvoreBinaria() {
        this.raiz = null;

    }

    public boolean Vazio() {
        return this.raiz == null;
    }

    public void insere(Aluno aluno) {
        this.raiz = this.insere(aluno, this.raiz);

    }

    private Nodo insere(Aluno aluno, Nodo p) {
        if (p == null) {
            p = new Nodo(aluno);

        } else if (aluno.getMatricula() < p.getAluno().getMatricula()) {

            p.setEsquerda(insere(aluno, p.getEsquerda()));
        } else if (aluno.getMatricula() > p.getAluno().getMatricula()) {
            p.setDireita(insere(aluno, p.getDireita()));

        } else {
            System.out.println("erro");
        }
        return p;
    }

    public void EmOrdem(Nodo R) {

        if (R == null) {
            return;

        }
        if (R.getEsquerda() != null) {
            EmOrdem(R.getEsquerda());

        }
        System.out.println("Nome:" + R.getAluno().getNome() + "Matricula:" + R.getAluno().getMatricula() + "Curso:" + R.getAluno().getCurso());
        if (R.getDireita() != null) {
            EmOrdem(R.getDireita());

        }

    }

    public Nodo getRaiz() {

        return raiz;
    }

    public void PosOrdem(Nodo R) {//E,D,R

        if (R == null) {
            return;

        }

        if (R.getEsquerda() != null) {
            PosOrdem(R.getEsquerda());
        }
        if (R.getDireita() != null) {
            PosOrdem(R.getDireita());
        }
        System.out.println("Nome:" + R.getAluno().getNome() + "Matricula:" + R.getAluno().getMatricula() + "Curso:" + R.getAluno().getCurso());

    }

    public void PreOrdem(Nodo R) {//R,E,D
        if (R == null) {
            return;

        }
        System.out.println("Nome:" + R.getAluno().getNome() + "Matricula:" + R.getAluno().getMatricula() + "Curso:" + R.getAluno().getCurso());

        if (R.getEsquerda() != null) {
            PreOrdem(R.getEsquerda());
        }

        if (R.getDireita() != null) {
            PreOrdem(R.getDireita());

        }
    }

    private Nodo antecessor(Nodo q, Nodo r) {
        if (r.getDireita() != null) {
            r.setDireita(antecessor(q, r.getDireita()));
        } else {
            q.setAluno(r.getAluno());
            r = r.getEsquerda();
        }
        return r;
    }

    private Nodo retira(Aluno reg, Nodo p) {
        if (p == null) {
            System.out.println("Erro: Registro não encontrado");
        } else if (reg.getMatricula() < p.getAluno().getMatricula()) {
            p.setEsquerda(retira(reg, p.getEsquerda()));
        } else if (reg.getMatricula() > p.getAluno().getMatricula()) {
            p.setDireita(retira(reg, p.getDireita()));
        } else {
            if (p.getDireita() == null) {
                p = p.getEsquerda();
            } else if (p.getEsquerda() == null) {
                p = p.getDireita();
            } else {
                p.setEsquerda(antecessor(p, p.getEsquerda()));
            }
        }
        return p;
    }

    public void retira(Aluno reg) {
        this.raiz = this.retira(reg, this.raiz);
    }

    public void imprimeEmOrdem() {
        this.EmOrdem(this.raiz);
    }

    public void imprimePreOrdem() {
        this.PreOrdem(this.raiz);
    }

    public void imprimePosOrdem() {
        this.PosOrdem(this.raiz);
    }

}
