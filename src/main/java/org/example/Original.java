package org.example;

public class Original implements Filtro{

    public float valorSaturacao;

    public Original(){
    }

    public Original(float valorSaturacao){
        this.valorSaturacao = valorSaturacao;
    }
    @Override
    public float getTaxaTotalSaturacao() {
        return valorSaturacao ;
    }

    @Override
    public String getListaFiltros() {
        return "Original";
    }
}
