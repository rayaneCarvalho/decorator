package org.example.implementacao;

import org.example.abstracao.FiltroDecorator;
import org.example.implementacao.Filtro;

public class Sepia extends FiltroDecorator {
    public Sepia(Filtro filtro) {
        super(filtro);
    }

    @Override
    public float getTaxaSaturacao() {
        return 0.15f;
    }

    @Override
    public String getNomeFiltro() {
        return "Sepia";
    }
}
