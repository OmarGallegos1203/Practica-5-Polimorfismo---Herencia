package fcfmclases.practica5.labprogramacion;
/** PRACTICA 5 "POLIMORFISMO"
 * RUN FILE 
 * @since 28/02/2022
 * @author Omar Gallegos
 * OMAR ESAÚ GALLEGOS MORENO 1969869
 */
public class RunPractica5 {
    public static void main(String[] args) {
        System.out.println("\tTRANSPORTE\n");    
        //  A   U   T   O   M   O   V   I   L
        //LOGIN DATOS CLASE AUTOMOVIL
        System.out.println("\tAUTOMOVIL - Clase Hija ");
        Automovil bocho = new Automovil();
        bocho.setMarca("Bocho");
        bocho.setModelo("1990");
        //PRINT
        System.out.println("Marca: "+bocho.getMarca());
        System.out.println("Modelo: "+bocho.getModelo());
        System.out.println(bocho.Encender(5));
        System.out.println("\tSISTEMA ELECTRICO - Interface");
        System.out.println(bocho.EncenderLuces());
        System.out.println(bocho.ApagarLuces());
        System.out.println(bocho.Avanzar(3)); 
        System.out.println(bocho.Frenar()); 
        System.out.println(bocho.Reversa(3));
        bocho.Apagar();
        
//LOGIN DATOS AUTOMOVIL (POLIMORFISMO)
        System.out.println("\n\n\tTRANSPORTE AUTOMOVIL - Clase Padre");
        Transporte tsuru = new Automovil(); //AQUI ESTA EL POLIMORFISMO: ESTO NOS DA ACSESO A LO QUE TENGA TRANSPORTE (SOLO METODOS)
        tsuru.setMarca("Tsuru");
        tsuru.setModelo("2003");
//PRINT Y POLIMORFISMO
        System.out.println("Marca: "+tsuru.getMarca());
        System.out.println("Modelo: "+tsuru.getModelo());
        System.out.println(tsuru.Encender(0));
        tsuru.Apagar();
//POLIMORFISMO INTERFACE DE SISTEMA ELECTRICO
        System.out.println("\tINTERFACE DE SISTEMA ELECTRICO - Interface");
        ISistemaElectrico bochuru = new Automovil(); //OJO AQUI
        System.out.println(bochuru.EncenderLuces());
        System.out.println(bochuru.ApagarLuces());
//POLIMORFISMO INTERFACE DE SISTEMA DE FRENOS
        System.out.println("\tINTERFACE DE SISTEMA DE FRENOS Y REVERSA - Interface");
        ISistemaFrenos honda = new Automovil(); //OJO AQUI
        System.out.println(honda.Frenar());
//POLIMORFISMO DE CLASE AVION
        Automovil altima = new Automovil();
        System.out.println(altima.Reversa(0));
        tsuru.Apagar();
        
        //  A   V   I   O   N
        //LOGIN CLASE AVION
        System.out.println("\n\n\tAVION - Clase Hija ");
        Avion batplane = new Avion();
        batplane.setMarca("Wayne Inc");
        batplane.setModelo("BatPlane 016");
        //PRINT
        System.out.println("Marca: "+batplane.getMarca());
        System.out.println("Modelo: "+batplane.getModelo());
        System.out.println(batplane.Encender(10));
        System.out.println("\tSISTEMA ELECTRICO Y DE FRENOS - Interface");
        System.out.println(batplane.EncenderLuces());
        System.out.println(batplane.ApagarLuces());
        System.out.println(batplane.Frenar());
        System.out.println(batplane.Despegar());
        System.out.println(batplane.Volar());
        System.out.println(batplane.Aterrizar());
        batplane.Apagar();
        
//LOGIN DATOS AVION (POLIMORFISMO)
        System.out.println("\n\n\tTRANSPORTE AVION - Clase Padre");
        Transporte quinjet = new Avion(); //AQUI ESTA EL POLIMORFISMO: ESTO NOS DA ACSESO A LO QUE TENGA TRANSPORTE (SOLO METODOS)
        quinjet.setMarca("Stark industries");
        quinjet.setModelo("QuinJet-Avenger");
//PRINT Y POLIMORFISMO
        System.out.println("Marca: "+quinjet.getMarca());
        System.out.println("Modelo: "+quinjet.getModelo());
        System.out.println(quinjet.Encender(7));
//POLIMORFISMO INTERFACE SISTEMA ELECTRICO
        System.out.println("\tINTERFACE SISTEMA ELECTRICO - Interface");
        ISistemaElectrico quinjetISE = new Avion();
        System.out.println(quinjetISE.EncenderLuces());
        System.out.println(quinjetISE.ApagarLuces());
//POLIMORFISMO INTERFACE SISTEMA FRENOS
        System.out.println("\tINTERFACE SISTEMA DE FRENOS - Interface");
        ISistemaFrenos quinjetISF = new Avion();
        System.out.println(quinjetISF.Frenar());
//POLIMORFISMO DE CLASE AVION
//Despegar, Volar y Aterrizar pertenecen a la clase avion
        Avion quinjetCA = new Avion();
        System.out.println(quinjetCA.Despegar());
        System.out.println(quinjetCA.Volar());
        System.out.println(quinjetCA.Aterrizar());
        quinjet.Apagar();
    }    
}
/*
NO ES POSIBLE HACER ESTO DEBIDO A QUE TRASPORTE ES UN CLASE ABSTRACTA
        Transporte tsuru = new Transporte();
        System.out.println(tsuru.Encender(3));
        System.out.println(tsuru.EncenderLuces());
        tsuru.Apagar();
EN CAMBIO AUTOMOVIL ES UNA CLASE NORMAL (EMPLEAMOS POLIMORFISMO)
        Transporte tsuru = new Automovil();
        System.out.println(tsuru.Encender(3));
        System.out.println(tsuru.EncenderLuces());
        tsuru.Apagar();
*/