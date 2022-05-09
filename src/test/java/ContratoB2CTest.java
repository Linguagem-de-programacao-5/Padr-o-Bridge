import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoB2CTest {

    @Test
    void deveRetornarFataruaB2BComReajustePlanoInternet(){
        Plano planoNet = new PlanoInternet("100mpbs",100.0);
        ContratoB2C contratoB2C = new ContratoB2C(planoNet,25.0);
        assertEquals(155.0, contratoB2C.calculaValorFatura());
    }

    @Test
    void deveRetornarFataruaB2BComReajustePlanoTv(){
        Plano planoTv = new PlanoTv("Canais Telecine",60.0);
        ContratoB2C contratoB2C = new ContratoB2C(planoTv,30.0);
        assertEquals(102.0, contratoB2C.calculaValorFatura());
    }

    @Test
    void deveRetornarFataruaB2BComReajustePlanoTelefone(){
        Plano planoTel = new PlanoTelefonia(300,70);
        ContratoB2C contratoB2C = new ContratoB2C(planoTel,10.0);
        assertEquals(87, contratoB2C.calculaValorFatura());
    }
}