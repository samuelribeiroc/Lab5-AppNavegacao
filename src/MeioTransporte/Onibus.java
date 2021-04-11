package MeioTransporte;

public class Onibus extends MeioTransporte {

    public Onibus() {}

    public int calcularRota(int kms) {
        return (int) (kms * 0.9);
    }

    public String toString() {
        return "Onibus";
    }
}
