public class Pez extends Animal{
    /*
    Colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */
    String branquia;

    public Pez(){
        // constructor clase 
    }
    //sobrecarga para obtener y enviar el ladrido
    public Pez(String nombre, String raza, String tipo_alimento, 
    int edad, String branquia){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, raza, tipo_alimento, edad);
        this.branquia = branquia;
    }
    public String getBranquia(){
        return branquia;
    }

    //enviar
    public void setBranquia(String branquia){
        this.branquia = branquia;
    }

    //metodo para mostrar la informacion del pez
    public void mostrarPez(){
        System.out.println("El nombre del pez es: " + getNombre() +"\n"
                            + "Su raza es: " + getRaza() +"\n"
                            + "Se alimenta de: " + getTipo_alimento() +"\n"
                            + "Tiene la edad de: " + getEdad() +"\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "El tamanio de su branquia es: " + branquia  +"\n");
    }
}