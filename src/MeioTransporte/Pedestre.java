package MeioTransporte;

public class Pedestre extends MeioTransporte{

    public Pedestre() { }

    public int calcularRota(int kms) {
        return kms * 12;
    }

    public String toString() {
        return "Pedestre";
    }
}
