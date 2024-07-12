package aplicacao;

public class ImpostoRJ implements cauculo{

    @Override
    public double cCauculo(double porcento) {
        return porcento * 0.20;
    }

}
