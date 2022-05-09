import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoB2BTest {

    @Test
    void deveRetornarFataruaB2BComReajustePlanoInternet(){
        Plano planoNet = new PlanoInternet("120mpbs",100.0);
        ContratoB2B contratoB2B = new ContratoB2B(planoNet,25.0);
        assertEquals(162.5, contratoB2B.calculaValorFatura());
    }

    @Test
    void deveRetornarFataruaB2BComReajustePlanoTv(){
        Plano planoTv = new PlanoTv("Canais HBO",60.0);
        ContratoB2B contratoB2B = new ContratoB2B(planoTv,0.0);
        assertEquals(72.0, contratoB2B.calculaValorFatura());
    }

    @Test
    void deveRetornarFataruaB2BComReajustePlanoTelefone(){
        Plano planoTel = new PlanoTelefonia(100,60.0);
        ContratoB2B contratoB2B = new ContratoB2B(planoTel,10.0);
        assertEquals(77.0, contratoB2B.calculaValorFatura());
    }
}