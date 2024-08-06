package org.example.abstracao;

import org.example.implementacao.Filtro;

public abstract class FiltroDecorator implements Filtro {

    private Filtro filtro;

    public String nomeFiltro;

    public FiltroDecorator(Filtro filtro){
        this.filtro = filtro;
    }

    public Filtro getFiltro(){
        return filtro;
    }

    public abstract float getTaxaSaturacao();

    public float getTaxaTotalSaturacao(){
        return this.filtro.getTaxaTotalSaturacao() + this.getTaxaSaturacao();
    }

    public abstract String getNomeFiltro();

    public String getListaFiltros(){
        return this.filtro.getListaFiltros() + ", " + this.getNomeFiltro();
    }

    public void setNomeFiltro(){
        this.nomeFiltro = nomeFiltro;
    }
}

