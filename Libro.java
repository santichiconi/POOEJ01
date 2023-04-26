
package Libro;

public class Libro {

    
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Libro(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    

    public Libro() {
        
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }
    
    
    
    
}
