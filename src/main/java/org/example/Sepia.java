package org.example;

public class Sepia extends FiltroDecorator{
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
