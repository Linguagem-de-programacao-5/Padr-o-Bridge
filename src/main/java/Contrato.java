public abstract class Contrato {
    protected Plano plano;
    protected double valorFatura;

    public Contrato(Plano plano, double valorFatura) {
        this.plano = plano;
        this.valorFatura = valorFatura;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }

    public abstract double calculaValorFatura();
}
