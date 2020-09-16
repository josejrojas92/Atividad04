package edu.unicesar.p2.g02.bicicleta;

/**
 *
 * @author José J Rojas
 */
public class Bicicleta {

    private int velocidadActual;
    private int platoActual;
    private int piñonActual;

    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }

    public void acelerar() {
        System.out.println("Acabaste de acelerar, la velocidad nueva es de:" + getVelocidadActual() * 2 + " km");

    }

    public void frenar() {
        System.out.println("Frenando... la disminucion de la velocidad es de:" + (getVelocidadActual() * 2) / 2 + " km");
    }

    public void cambiarPlato(int plato) {
        System.out.println("Cambiando a plato: " + getPlatoActual());
    }

    public void cambiarPiñon(int piñon) {
        System.out.println("Cambiando a piñon: " + getPiñonActual());
    }
}
