public class ContratoB2B extends Contrato{

    private double valorAdicionaisB2B;

    public ContratoB2B(Plano plano, double valorAdicionaisB2B) {
        super(plano,valorAdicionaisB2B + plano.getValor());
        this.valorAdicionaisB2B = valorAdicionaisB2B;
    }

    public double getValorAdicionaisB2B() {
        return valorAdicionaisB2B;
    }

    public void setValorAdicionaisB2B(double valorAdicionaisB2B) {
        this.valorAdicionaisB2B = valorAdicionaisB2B;
    }

    @Override
    public double calculaValorFatura() {
        this.valorFatura = this.valorFatura * ( 1 + this.plano.percentualAumento());
        return this.valorFatura;
    }
}
