public class SomaCalculadora {
    private int INDICE;
    private int SOMA;
    private int K;

    public SomaCalculadora(int INDICE){
        this.INDICE = INDICE;
        this.SOMA = 0;
        this.K = 0;
    }

    public void calcularSoma(){
        while(K<INDICE){
            K++;
            SOMA += K;
        }
    }
    public int getSoma(){
        return SOMA;
    }

    public static void main(String[] args) {
        SomaCalculadora calculadora = new SomaCalculadora(12);
        calculadora.calcularSoma();
        System.out.println("Soma: " + calculadora.getSoma());
    }


}
