package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiltroTest {
    @Test
    void deveRetornarValorTotalAssinatura() {
        Filtro streaming = new PrimeVideo(19.90f);

        assertEquals(19.90f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturas() {
        Filtro streaming = new PrimeVideo(19.90f);

        assertEquals("Prime Video", streaming.getListaFiltro());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamount() {
        Filtro streaming = new Paramount (new PrimeVideo(19.90f));

        assertEquals(34.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamount() {
        Filtro streaming = new Paramount (new PrimeVideo(19.90f));

        assertEquals("Prime Video, Paramount+", streaming.getListaFiltro());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComTeleCine() {
        Filtro streaming = new TeleCine (new PrimeVideo(19.90f));

        assertEquals(49.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComTeleCine() {
        Filtro streaming = new TeleCine (new PrimeVideo(19.90f));

        assertEquals("Prime Video, Telecine", streaming.getListaFiltro());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComPremiere() {
        Filtro streaming = new Premiere (new PrimeVideo(19.90f));

        assertEquals(79.80f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComPremiere() {
        Filtro streaming = new Premiere (new PrimeVideo(19.90f));

        assertEquals("Prime Video, PREMIERE", streaming.getListaFiltro());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamountMaisTeleCine() {
        Filtro streaming = new TeleCine (new Paramount (new PrimeVideo(19.90f)));

        assertEquals(64.70f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamountMaisTeleCine() {
        Filtro streaming = new TeleCine (new Paramount (new PrimeVideo(19.90f)));

        assertEquals("Prime Video, Paramount+, Telecine", streaming.getListaFiltro());
    }

    @Test
    void deveRetornarValorTotalAssinaturaComParamountMaisTeleCineMaisPremiere() {
        Filtro streaming = new Premiere(new TeleCine (new Paramount (new PrimeVideo(19.90f))));

        assertEquals(124.60f, streaming.getValorTotalAssinatura());
    }

    @Test
    void deveRetornarListaAssinaturasComParamountMaisTeleCineMaisPremiere() {
        Filtro streaming = new Premiere(new TeleCine (new Paramount (new PrimeVideo(19.90f))));

        assertEquals("Prime Video, Paramount+, Telecine, PREMIERE", streaming.getListaFiltro());
    }

}