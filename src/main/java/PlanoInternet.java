public class PlanoInternet implements Plano{

    private String velocidade;
    private double valor;

    public PlanoInternet(String velocidade, double valor) {
        this.velocidade = velocidade;
        this.valor = valor;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double percentualAumento() {
        return 0.3d;
    }
}
