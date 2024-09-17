public class FaturamentoDistribuidora {

    private double sp;
    private double rj;
    private double mg;
    private double es;
    private double outros;

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public double getRj() {
        return rj;
    }

    public void setRj(double rj) {
        this.rj = rj;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public double getEs() {
        return es;
    }

    public void setEs(double es) {
        this.es = es;
    }

    public double getOutros() {
        return outros;
    }

    public void setOutros(double outros) {
        this.outros = outros;
    }

    public FaturamentoDistribuidora(double sp, double rj, double mg, double es, double outros){
        this.sp = sp;
        this.rj = rj;
        this.mg = mg;
        this.es = es;
        this.outros = outros;
    }

    public double calcularFaturamentoTotal(){
        return sp + rj + mg + es + outros;
    }
    public double calcularPercentual(double valor){
        return valor/calcularFaturamentoTotal()*100;
    }

    public void exibirPercentuais(){
        System.out.println("Percentual por estado: ");
        System.out.printf("SP: %.2f%%\n", calcularPercentual(sp));
        System.out.printf("RJ: %.2f%%\n", calcularPercentual(rj));
        System.out.printf("MG: %.2f%%\n", calcularPercentual(mg));
        System.out.printf("ES: %.2f%%\n", calcularPercentual(es));
        System.out.printf("Outros: %.2f%%\n", calcularPercentual(outros));
    }

    public static void main(String[] args) {
        FaturamentoDistribuidora faturamentoDistribuidora = new FaturamentoDistribuidora(
                67836.43,
                36678.66,
                29229.88,
                27165.48,
                19849.53
        );
        faturamentoDistribuidora.exibirPercentuais();
    }
}
