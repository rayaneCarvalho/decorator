package org.example;

public class PretoBranco extends FiltroDecorator{
    public PretoBranco(Filtro filtro) {
        super(filtro);
    }

    @Override
    public float getTaxaSaturacao() {
        return 0.05f;
    }

    @Override
    public String getNomeFiltro() {
        return "Preto e Branco";
    }
}
