package org.example;

public class Vintage extends FiltroDecorator{
    public Vintage(Filtro filtro) {
        super(filtro);
    }

    @Override
    public float getTaxaSaturacao() {
        return 0.20f;
    }

    @Override
    public String getNomeFiltro() {
        return "Preto e Branco";
    }
}
