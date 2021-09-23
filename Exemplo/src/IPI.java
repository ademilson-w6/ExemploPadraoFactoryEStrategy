public class IPI implements Imposto{
    private double valor;


    public IPI(double valor){
        this.valor = valor;
    }

    public IPI() {
        this.valor = 0.0;
    }


    @Override
    public double calcular(double valor) {
        return valor * 0.20;
    }
}
