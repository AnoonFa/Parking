package org.ficha2902082.maven.parking.estebanalejandro;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import  org.ficha2902082.maven.parking.estebanalejandro.entities.Carro;
import org.ficha2902082.maven.parking.estebanalejandro.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.estebanalejandro.entities.Cliente;
import org.ficha2902082.maven.parking.estebanalejandro.entities.TipoDocumento;
public class Main {
    public static void main(String[] args) {

        Carro carrito = new Carro();
        carrito.placa = "342143";
        carrito.tipoVehiculo = TipoVehiculo.Carro;

        Carro carrito2 = new Carro();
        carrito2.placa = "3dwda13";
        carrito2.tipoVehiculo = TipoVehiculo.Taxi;

        Cliente Cliente1 = new Cliente();
        Cliente1.nombre = "Esteban";
        Cliente1.apellido = "Espinosa";
        Cliente1.tipoDocumento = TipoDocumento.TI;
        Cliente1.numeroIdentificador = 123505983;
        
        Cliente Cliente2 = new Cliente();
        Cliente2.nombre = "Alejandro";
        Cliente2.apellido = "Castillo";
        Cliente2.tipoDocumento = TipoDocumento.CC;
        Cliente2.numeroIdentificador = 123789219;


    System.out.println("Carro del cliente: El " + carrito2.tipoVehiculo + " de " + Cliente1.nombre );

    //metodo
        Cliente2.addCar(carrito);
        Cliente1.addCar("12321", TipoVehiculo.Bus );
     for(Carro x : Cliente2.misCarros){

        System.out.println("Placa:" + x.placa);
        System.out.println("Tipo:" + x.tipoVehiculo);
        
     }

        for (Carro x : Cliente1.misCarros) {
            System.out.println("Placa:" + x.placa);
            System.out.println("Tipo:" + x.tipoVehiculo);
            
        }


    }

    
}