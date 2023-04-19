package ejercicioPoo;

public class SmartWatch extends SmartDevice{

    //1. Atributos:

    String material;
    double tamanho;

    //2. Constructores:

    public SmartWatch() {
    }

    public SmartWatch(String marca, String fabricante, String sistemaOperativo, double pulgadas, boolean encendido, String material, double tamanho) {
        super(marca, fabricante, sistemaOperativo, pulgadas, encendido);
        this.material = material;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "SmartWatch: \n" +
                "material='" + material + '\'' +
                ", \ntamaño=" + tamanho +
                ", \nmarca='" + marca + '\'' +
                ", \nfabricante='" + fabricante + '\'' +
                ", \nsistemaOperativo='" + sistemaOperativo + '\'' +
                ", \npulgadas=" + pulgadas +
                ", \nencendido=" + encendido + "\n-------";
    }
}
