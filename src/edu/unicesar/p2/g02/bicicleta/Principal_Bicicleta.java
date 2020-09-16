package edu.unicesar.p2.g02.bicicleta;

/**
 *
 * @author José J Rojas
 */
public class Principal_Bicicleta {

    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta(10, 5, 2);

        bicicleta.acelerar();
        bicicleta.frenar();
        bicicleta.cambiarPlato(8);
        bicicleta.cambiarPiñon(3);

    }
}
