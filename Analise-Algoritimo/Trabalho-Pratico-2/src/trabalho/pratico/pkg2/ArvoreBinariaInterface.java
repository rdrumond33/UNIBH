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
public interface ArvoreBinariaInterface {

    public void Initialize(Book[] livros);

    public String searchTreeBinari(String codUnico);

    public String removeBook(String codUnico);

    public void insertBook(Book Book);

    public void insertBook(Book Book, No no);

}
