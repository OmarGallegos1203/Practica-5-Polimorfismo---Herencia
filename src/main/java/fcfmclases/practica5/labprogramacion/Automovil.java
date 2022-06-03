package fcfmclases.practica5.labprogramacion;
/** PRACTICA 5 "POLIMORFISMO"
 * CLASE HIJA AUTOMOVIL 
 * @since 28/02/2022
 * @author Omar Gallegos
 */
public class Automovil extends Transporte implements ISistemaElectrico, ISistemaFrenos{
    double gas = 0;
// METODOS DE LA CLASE (AVANZAR)
    public String Avanzar(double gas) {
        String salida;
        this.gas = gas;
        if (this.gas > 1){
            salida = "AUTOMOVIL AVANZANDO!";
        }
        else{
            salida = "SIN GASOLINA!";
        }
        return salida;
    }
// METODOS DE LA CLASE (REVERSA)
    double gasl = 0;    
    public String Reversa(double gasl) {
        String salida;
        this.gasl = gasl;
        if (this.gasl > 1){
            salida = "AUTOMOVIL EN REVERSA!";
        }
        else{
            salida = "SIN GASOLINA!";
        }
        return salida;
    }
//METODOS DEL OVERRIDE
    double gass = 0;
    @Override
    public String Encender(double gass) {
        String salida;
        this.gass = gass;
        if (this.gass > 1){
            salida = "AUTOMOVIL ENCENDIDO!";
        }
        else{
            salida = "SIN GASOLINA!";
        }
        return salida; 
    }
//
    @Override
    public void Apagar() {
        System.out.println("AUTOMOVIL APAGADO!");
    }
//
    @Override
    public String EncenderLuces() {
        return "LUCES ENCENDIDADAS!";
    }
//
    @Override
    public String ApagarLuces() {
        return "LUCES APAGADAS!";
    }

    @Override
    public String Frenar() {
        return "FRENOS ACCIONADOS!";
    }
}