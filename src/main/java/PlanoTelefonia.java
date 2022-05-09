public class PlanoTelefonia implements Plano{

    private int minutos;
    private double valor;

    public PlanoTelefonia(int minutos, double valor) {
        this.minutos = minutos;
        this.valor = valor;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double percentualAumento() {
        return 0.1d;
    }
}
