package fcfmclases.practica5.labprogramacion;
/** PRACTICA 5 "POLIMORFISMO"
 * CLASE HIJA AVION 
 * @since 28/02/2022
 * @author Omar Gallegos
 */
public class Avion extends Transporte implements ISistemaElectrico, ISistemaFrenos, IVolar{
    public String Despegar(){
        return "EL AVION HA DESPEGADO!";  
    }
    public String Aterrizar(){
        return "EL AVION HA ATERRIZADO!";
    }
    double disel = 0;
    @Override
    public String Encender(double disel) {
        String salida;
        this.disel = disel;
        if (this.disel > 1){
            salida = "EL AVION ESTA ENCENDIDO!";
        }
        else{
            salida = "SIN COMBUSTIBLE!";
        }
        return salida;
    }

    @Override
    public void Apagar() {
        System.out.println("EL AVION ESTA APAGADO!");
    }

    @Override
    public String EncenderLuces() {
        return "LUCES DEL AVION ENCENDIDAS!";
    }

    @Override
    public String ApagarLuces() {
        return "LUCES DEL AVION APAGADAS!";
    }

    @Override
    public String Frenar() {
        return "FRENOS ACCIONADOS!";
    }
    
    @Override
    public String Volar() {
        return "EL AVION ESTA VOLANDO!";
    }
}
