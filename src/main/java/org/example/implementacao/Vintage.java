package org.example.implementacao;

import org.example.abstracao.FiltroDecorator;
import org.example.implementacao.Filtro;

public class Vintage extends FiltroDecorator {
    public Vintage(Filtro filtro) {
        super(filtro);
    }

    @Override
    public float getTaxaSaturacao() {
        return 0.08f;
    }

    @Override
    public String getNomeFiltro() {
        return "Vintage";
    }
}
