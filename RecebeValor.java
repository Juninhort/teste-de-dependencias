package aplicacao;

public class RecebeValor {

    private cauculo cCauculo;

    public RecebeValor (cauculo cCauculo){
        this.cCauculo = cCauculo;
    }

    public double taxa (double porcento){
        porcento = porcento - cCauculo.cCauculo(porcento);
        return porcento * 0.2;
    }
    
}
