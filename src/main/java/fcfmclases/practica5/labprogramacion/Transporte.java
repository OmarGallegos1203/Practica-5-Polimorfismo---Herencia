package fcfmclases.practica5.labprogramacion;
/** PRACTICA 5 "POLIMORFISMO"
 * CLASE PADRE
 * @since 28/02/2022
 * @author Omar Gallegos
 */
public abstract class Transporte {
    //METODOS PARA SOBRE ESCRIBIR
    public abstract String Encender(double gas);
    public abstract void Apagar(); 
    //PROPIEDADES
    private String marca;
    private String modelo;
   
    // ENCAPSULAMIENTO GET Y SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // ENCAPSULAMIENTO GET Y SET
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
