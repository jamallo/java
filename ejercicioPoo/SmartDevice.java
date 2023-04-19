package ejercicioPoo;

public abstract class SmartDevice {


    //1. Atributos:
    protected String marca;
    protected String fabricante;
    protected String sistemaOperativo;
    protected double pulgadas;
    protected boolean encendido;

    //2. Constructores:
    public SmartDevice() {
    }

    public SmartDevice(String marca, String fabricante, String sistemaOperativo, double pulgadas, boolean encendido) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.sistemaOperativo = sistemaOperativo;
        this.pulgadas = pulgadas;
        this.encendido = encendido;
    }

    // 3. Método:
    public void encender (boolean enciende){
        this.encendido = true;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pulgadas=" + pulgadas +
                ", encendido=" + encendido;
    }
}
