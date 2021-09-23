public class ICMS implements Imposto {
    private double valor;


    public ICMS(double valor) {
        this.valor = valor;
    }

    public ICMS() {
        this.valor = 0.0;
    }


    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }
}