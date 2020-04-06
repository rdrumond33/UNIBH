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
public class Book {

    private String codUnico, titulo, descricao, autor, editora;

    public Book() {}

    public Book(String codUnico, String titulo,String descricao,String autor,String editora) {
        this.autor = autor;
        this.codUnico = codUnico;
        this.titulo = titulo;
        this.descricao = descricao;
        this.editora = editora;
    }

    /**
     * @return the codUnico
     */
    public String getCodUnico() {
        return codUnico;
    }

    /**
     * @param codUnico the codUnico to set
     */
    public void setCodUnico(String codUnico) {
        this.codUnico = codUnico;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

}
