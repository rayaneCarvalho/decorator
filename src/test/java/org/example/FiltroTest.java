package org.example;

import org.example.abstracao.Original;
import org.example.implementacao.Filtro;
import org.example.implementacao.PretoBranco;
import org.example.implementacao.Sepia;
import org.example.implementacao.Vintage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiltroTest {
    @Test
    void deveRetornarTaxaTotalSaturacao() {
        Filtro filtro = new Original(0.02f);

        assertEquals(0.02f, filtro.getTaxaTotalSaturacao());
    }

    @Test
    void deveRetornarListaFiltros() {
        Filtro filtro = new Original(0.02f);

        assertEquals("Original", filtro.getListaFiltros());
    }

    @Test
    void deveRetornarTaxaTotalSaturacaoComPretoBranco() {
        Filtro filtro = new PretoBranco(new Original(0.02f));

        assertEquals(0.07f, filtro.getTaxaTotalSaturacao());
    }

    @Test
    void deveRetornarListaFiltrosComPretoBranco() {
        Filtro filtro = new PretoBranco (new Original(0.02f));

        assertEquals("Original, Preto e Branco", filtro.getListaFiltros());
    }

    @Test
    void deveRetornarTaxaTotalSaturacaoComSepia() {
        Filtro filtro = new Sepia(new Original(0.02f));

        assertEquals(0.17f, filtro.getTaxaTotalSaturacao());
    }

    @Test
    void deveRetornarListaFiltrosComSepia() {
        Filtro filtro = new Sepia (new Original(0.02f));

        assertEquals("Original, Sepia", filtro.getListaFiltros());
    }

    @Test
    void deveRetornarTaxaTotalSaturacaoComVintage() {
        Filtro filtro = new Vintage(new Original(0.02f));

        assertEquals(0.09, filtro.getTaxaTotalSaturacao(), 0.01f);
    }

    @Test
    void deveRetornarListaFiltrosComVintage() {
        Filtro filtro = new Vintage (new Original(0.02f));

        assertEquals("Original, Vintage", filtro.getListaFiltros());
    }

    @Test
    void deveRetornarTaxaTotalSaturacaoComPretoBrancoMaisSepia() {
        Filtro filtro = new Sepia (new PretoBranco (new Original(0.02f)));

        assertEquals(0.22f, filtro.getTaxaTotalSaturacao());
    }

    @Test
    void deveRetornarListaFiltrosComPretoBrancoMaisSepia() {
        Filtro filtro = new Sepia (new PretoBranco (new Original(0.02f)));

        assertEquals("Original, Preto e Branco, Sepia", filtro.getListaFiltros());
    }

    @Test
    void deveRetornarTaxaTotalSaturacaoComPretoBrancoMaisSepiaMaisVintage() {
        Filtro filtro = new Vintage(new Sepia (new PretoBranco (new Original(0.02f))));

        assertEquals(0.3f, filtro.getTaxaTotalSaturacao());
    }

    @Test
    void deveRetornarListaFiltrosComPretoBrancoMaisSepiaMaisVintage() {
        Filtro filtro = new Vintage(new Sepia (new PretoBranco (new Original(0.02f))));

        assertEquals("Original, Preto e Branco, Sepia, Vintage", filtro.getListaFiltros());
    }

}