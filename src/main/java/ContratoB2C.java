public class ContratoB2C extends Contrato {

    private double valorAdicionaisB2C;

    public ContratoB2C(Plano plano, double valorAdicionaisB2C) {
        super(plano, plano.getValor() + valorAdicionaisB2C );
        this.valorAdicionaisB2C = valorAdicionaisB2C;
    }

    public double getValorAdicionaisB2C() {
        return valorAdicionaisB2C;
    }

    public void setValorAdicionaisB2C(int valorAdicionaisB2C) {
        this.valorAdicionaisB2C = valorAdicionaisB2C;
    }

    @Override
    public double calculaValorFatura() {
        this.valorFatura = this.plano.getValor() * (1 + this.plano.percentualAumento()) + valorAdicionaisB2C;
        return this.valorFatura;
    }
}
