package аrvoreBinаriaDePesquia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Drumond
 */
public class Aluno {

    private String nome;
    private int Matricula;
    private String curso;

    /**
     * @return the nome
     */
    public Aluno(String nome, int m, String curso) {
        this.nome = nome;
        this.curso = curso;
        Matricula = m;

    }

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the Matricula
     */
    public int getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

}
