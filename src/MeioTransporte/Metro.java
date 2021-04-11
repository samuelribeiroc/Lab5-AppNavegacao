package MeioTransporte;

public class Metro extends MeioTransporte {

    public Metro() {}

    public int calcularRota(int kms) {
        return (int) (kms * 0.7);
    }

    public String toString() {
        return "Metro";
    }
}
