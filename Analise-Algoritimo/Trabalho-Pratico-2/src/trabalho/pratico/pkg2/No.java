package trabalho.pratico.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rdrumond
 */
public class No {
    private Book book;
    private No noLeft,noRight,noFather;
    private int nivel;
    private char label;
    
    public No(){}
    
    public No(Book book, No noEsquerdo,No noDireito,No noPai,int nivel,char label){
        this.book = book;
        this.nivel=nivel;
        this.noLeft= noEsquerdo;
        this.noRight = noDireito;
        this.noFather= noPai;
        this.label = label;
    }
    
    
    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the noLeft
     */
    public No getNoLeft() {
        return noLeft;
    }

    /**
     * @param noLeft the noLeft to set
     */
    public void setNoLeft(No noLeft) {
        this.noLeft = noLeft;
    }

    /**
     * @return the noRight
     */
    public No getNoRight() {
        return noRight;
    }

    /**
     * @param noRight the noRight to set
     */
    public void setNoRight(No noRight) {
        this.noRight = noRight;
    }

    /**
     * @return the noFather
     */
    public No getNoFather() {
        return noFather;
    }

    /**
     * @param noFather the noFather to set
     */
    public void setNoFather(No noFather) {
        this.noFather = noFather;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the label
     */
    public char getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(char label) {
        this.label = label;
    }
}
