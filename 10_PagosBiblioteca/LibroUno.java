public class LibroUno extends Libros{
    int CostoLibro;
    
    public LibroUno(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el CostoLibro
    public LibroUno(String nombre, String autor, String isbn, String genero,
    int ejemplares, int CostoLibro){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibro = CostoLibro;

    }
    public int getCostoLibro(){
        return CostoLibro;
    }

    //enviar
    public void setCostoLibro(int CostoLibro){
        this.CostoLibro = CostoLibro;
    }

    //metodo para mostrar la informacion del Unlibro
    public void mostrarLibroUno(){
        System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                            + "Su autor(a) es: " + getAutor() +"\n"
                            + "Su ISBN: " + getIsbn() +"\n"
                            + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                            + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su Costo es de: MXN" + CostoLibro  +"\n");
    }
}