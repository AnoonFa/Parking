package org.ficha2902082.maven.parking.estebanalejandro.entities;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public TipoDocumento tipoDocumento;
    public String apellido;
    public int numeroIdentificador;
    public int Celular;
    public List<Carro> misCarros = new ArrayList<Carro>();

       //Metodo
        //1. añadir carro al cliente
        // -modificar acceso
        // -tipo de dato retorno
        // -nombre del metodo
        //parametros (Entradas, Inputs)
        //   1.Tipo de dato del parametro
        //  2. Nombre del parametro

    public void addCar (Carro x){ 

        this.misCarros.add(x);
        }

    //sobrecarga

    public void addCar( String placa, TipoVehiculo tipoVehiculo){
       //CONSTRUIR (INSTANCIAR)
       Carro x = new Carro();
       x.placa = placa;
       x.tipoVehiculo = tipoVehiculo;
      this.misCarros.add(x);
        }


}

