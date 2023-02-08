package contabilidade;

public class PIS implements Interface{
    
    private double valor;

    public PIS(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double c, double d) {
        this.valor = c - d;
    }
    
    @Override
    public double calcularImposto(){
        return valor / 100 * 1.65;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String descricao(){
        return "PIS: ";
    }
    
}
