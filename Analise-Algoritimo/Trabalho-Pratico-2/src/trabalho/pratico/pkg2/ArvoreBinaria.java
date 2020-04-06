/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pratico.pkg2;

/**
 *
 * @author rdrumond
 */
public class ArvoreBinaria implements ArvoreBinariaInterface {

    private No masterNo;
    private int oneInsert = 0;

    public ArvoreBinaria() {
        this.masterNo = new No(null, null, null, null, 0, ' ');
    }

    public void Initialize(Book[] books) {
        for (Book book : books) {
            insertBook(book);
        }
    }

    public String searchTreeBinari(String codUnico) {
        String msg = "";
        int interacao = 0;

        if (this.masterNo.getBook().getCodUnico().equalsIgnoreCase(codUnico)) {
            interacao++;
            msg += "Interacoes[" + interacao + "]" + "Nó[" + this.masterNo.getLabel() + "-" + this.masterNo.getNivel() + "]:" + this.masterNo.getBook().getCodUnico() + " Nivel: " + this.masterNo.getNivel();
            return msg;
        } else if (Integer.parseInt(codUnico) > Integer.parseInt(this.masterNo.getBook().getCodUnico())) {
            interacao++;
            msg += searchTreeBinari(codUnico, this.masterNo.getNoRight(), interacao);
        } else {
            interacao++;
            msg += searchTreeBinari(codUnico, this.masterNo.getNoLeft(), interacao);
        }

        return msg;
    }

    private String searchTreeBinari(String codUnico, No no, int interacao) {
        String msg = "";
        if (no == null) {
            return "Codigo[" + codUnico + "] Nao encontrado";
        }
        if (no.getBook().getCodUnico().equalsIgnoreCase(codUnico)) {
            interacao++;
            msg += "Interacoes[" + interacao + "]" + "Nó[" + no.getLabel() + "-" + no.getNivel() + "]:" + no.getBook().getCodUnico() + " Nivel: " + no.getNivel();
            return msg;
        } else if (Integer.parseInt(codUnico) > Integer.parseInt(no.getBook().getCodUnico())) {
            interacao++;
            msg += searchTreeBinari(codUnico, no.getNoRight(), interacao);
        } else {
            interacao++;
            msg += searchTreeBinari(codUnico, no.getNoLeft(), interacao);
        }

        return msg;
    }

    public String removeBook(String codUnico) {
        String msg = "";
        if (this.masterNo.getBook().getCodUnico().equalsIgnoreCase(codUnico)) {
            return "";
        } else {
            if (Integer.parseInt(codUnico) > Integer.parseInt(this.masterNo.getBook().getCodUnico())) {
                msg = removeBook(codUnico, this.masterNo.getNoRight(), "R");
            } else {
                msg = removeBook(codUnico, this.masterNo.getNoLeft(), "L");
            }
        }
        normalizeNivel();
        return msg;
    }

    private String removeBook(String codUnico, No no, String label) {
        String msg = "";
        if (no == null) {
            return "Codigo[" + codUnico + "] Nao encontrado";
        }
        if (no.getBook().getCodUnico().equalsIgnoreCase(codUnico)) {

            if (no.getNoLeft() != null && no.getNoRight() != null) {
                return "";
            } else if (no.getNoLeft() == null && no.getNoRight() == null) {
            } else if (no.getNoLeft() != null) {
                if (label.equalsIgnoreCase("l")) {
                    msg += "" + no.getBook().getCodUnico();

                    no.getNoFather().setNoRight(no.getNoLeft());
                    no.getNoLeft().setNoFather(no.getNoFather());

                    return msg;
                } else {
                    msg += "" + no.getBook().getCodUnico();

                    no.getNoFather().setNoRight(no.getNoLeft());
                    no.getNoLeft().setNoFather(no.getNoFather());

                    return msg;

                }

            } else if (no.getNoRight() != null) {
                if (label.equalsIgnoreCase("l")) {
                    msg += "" + no.getBook().getCodUnico();

                    no.getNoFather().setNoLeft(no.getNoRight());
                    no.getNoRight().setNoFather(no.getNoFather());

                    return msg;
                } else {
                    msg += "" + no.getBook().getCodUnico();

                    no.getNoFather().setNoRight(no.getNoRight());
                    no.getNoRight().setNoFather(no.getNoFather());

                    return msg;

                }
            }
            msg += "Nó[" + no.getLabel() + "-" + no.getNivel() + "]:" + no.getBook().getCodUnico() + " Nivel: " + no.getNivel();
            return msg;
        } else if (Integer.parseInt(codUnico) > Integer.parseInt(no.getBook().getCodUnico())) {
            removeBook(codUnico, this.masterNo.getNoRight(), "R");
        } else {
            removeBook(codUnico, this.masterNo.getNoLeft(), "L");
        }

        return msg;
    }

    public void insertBook(Book book) {

        if (isfirst()) {
            this.masterNo = new No(book, null, null, null, 0, 'M');
            this.oneInsert = 1;
            return;
        } else if (book.getCodUnico().equalsIgnoreCase(this.masterNo.getBook().getCodUnico())) {
            return;
        } else if (Integer.parseInt(book.getCodUnico()) > Integer.parseInt(this.masterNo.getBook().getCodUnico())) {
            insertRight(book);
        } else {
            insertLeft(book);
        }

    }

    public void insertBook(Book book, No no) {
        if (book.getCodUnico().equalsIgnoreCase(no.getBook().getCodUnico())) {
            return;
        } else if (Integer.parseInt(book.getCodUnico()) > Integer.parseInt(no.getBook().getCodUnico())) {
            insertRight(book, no);
        } else {
            insertLeft(book, no);
        }

    }

    public void printTree() {
        if (this.masterNo == null) {
            System.out.println("Árvore vazia");
        } else {
            printTree(this.masterNo);
        }
    }

    private void normalizeNivel() {
        if (this.masterNo.getNoLeft() != null) {
            normalizeNivel(this.masterNo.getNoLeft(), 1);
        }

        if (this.masterNo.getNoRight() != null) {
            normalizeNivel(this.masterNo.getNoRight(), 1);
        }
        return;
    }

    private void normalizeNivel(No no, int nivel) {
        if (no.getNivel() != nivel) {

            no.setNivel(nivel);
        }
        
        nivel++;
        if (no.getNoLeft() != null) {
            normalizeNivel(no.getNoLeft(), nivel);
        }

        if (no.getNoRight() != null) {
            normalizeNivel(no.getNoRight(), nivel);
        }

    }

    private void printTree(No no) {
        if (no.getNoLeft() != null) {
            printTree(no.getNoLeft());
        }
        if (no.getNoRight() != null) {
            printTree(no.getNoRight());
        }
        String noFather;
        if (no.getNoFather() == null) {
            noFather = "Master";
        } else {
            noFather = no.getNoFather().getBook().getCodUnico();

        }

        System.out.println("Nó[ NoPai[" + noFather + "]" + no.getLabel() + "-" + no.getNivel() + "]:" + no.getBook().getCodUnico() + " Nivel: " + no.getNivel());
    }

    private boolean isfirst() {
        if (this.oneInsert > 0) {
            return false;
        }
        return true;
    }

    private void insertLeft(Book book) {
        if (this.getMasterNo().getNoLeft() == null) {
            this.getMasterNo().setNoLeft(new No(book, null, null, this.masterNo, this.masterNo.getNivel() + 1, 'L'));
            return;
        }
        insertBook(book, this.masterNo.getNoLeft());
    }

    private void insertLeft(Book book, No no) {
        if (no.getNoLeft() == null) {
            no.setNoLeft(new No(book, null, null, no, no.getNivel() + 1, 'L'));
            return;
        }
        insertBook(book, no.getNoLeft());
    }

    private void insertRight(Book book) {
        if (this.getMasterNo().getNoRight() == null) {
            this.getMasterNo().setNoRight(new No(book, null, null, this.getMasterNo(), this.getMasterNo().getNivel() + 1, 'R'));
            return;
        }
        insertBook(book, this.getMasterNo().getNoRight());
    }

    private void insertRight(Book book, No no) {
        if (no.getNoRight() == null) {
            no.setNoRight(new No(book, null, null, no, no.getNivel() + 1, 'R'));
            return;
        }
        insertBook(book, no.getNoRight());
    }

    /**
     * @return the masterNo
     */
    public No getMasterNo() {
        return masterNo;
    }

}
