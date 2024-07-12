package aplicacao;

public class ImpostoES implements cauculo {

    @Override
    public double cCauculo(double porcento) {
        return porcento * 0.30;
    }
    
}
