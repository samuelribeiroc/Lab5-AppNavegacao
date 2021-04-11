package MeioTransporte;

public class Carro extends MeioTransporte {

    public Carro() {}

    public int calcularRota(int kms) {
        return (int) (kms * 0.6);
    }

    public String toString() {
        return "Carro";
    }
}
