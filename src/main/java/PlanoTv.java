public class PlanoTv implements Plano {

    private String canal;
    private double valor;

    public PlanoTv(String canal, double valor) {
        this.canal = canal;
        this.valor = valor;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double percentualAumento() {
        return 0.2d;
    }
}
