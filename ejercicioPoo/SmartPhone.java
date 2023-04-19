package ejercicioPoo;

public class SmartPhone extends SmartDevice{

    //1. Atributos:
    String modelo;
    double resolución;

    //2. Constructores:
    public SmartPhone() {
    }

    public SmartPhone(String marca, String fabricante, String sistemaOperativo, double pulgadas, boolean encendido, String modelo, double resolución) {
        super(marca, fabricante, sistemaOperativo, pulgadas, encendido);
        this.modelo = modelo;
        this.resolución = resolución;
    }

    @Override
    public String toString() {
        return "SmartPhone: \n" +
                "modelo='" + modelo + '\'' +
                ", \nresolución=" + resolución +
                ", \nmarca='" + marca + '\'' +
                ", \nfabricante='" + fabricante + '\'' +
                ", \nsistemaOperativo='" + sistemaOperativo + '\'' +
                ", \npulgadas=" + pulgadas +
                ", \nencendido=" + encendido + "\n-------";
    }
}
