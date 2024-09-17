public class Distribuidora {

    private double[] faturamentoDiario;

    public Distribuidora(double[] faturamentoDiario) {
        this.faturamentoDiario = faturamentoDiario;
    }

    public double MenorFaturamento() {
        double menor = Double.MAX_VALUE;
        for (double valor : faturamentoDiario) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public double MaiorFaturamento() {
        double maior = Double.MIN_VALUE;
        for (double valor : faturamentoDiario) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public double MediaFaturamento() {
        double soma = 0;
        for (double valor : faturamentoDiario) {
            soma += valor;
        }
        return soma / faturamentoDiario.length;
    }

    public int DiasAcimaMedia() {
        double media = MediaFaturamento();
        int contador = 0;
        for (double valor : faturamentoDiario) {
            if (valor > media) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        double[] faturamento = {1000, 1500, 1200, 1600, 1800, 2000, 2100, 2300, 2500, 2400, 2200, 1900};
        Distribuidora distribuidora = new Distribuidora(faturamento);

        System.out.println("Menor valor de faturamento: " + distribuidora.MenorFaturamento());
        System.out.println("Maior valor de faturamento: " + distribuidora.MaiorFaturamento());
        System.out.println("Média de faturamento: " + distribuidora.MediaFaturamento());
        System.out.println("Dias acima da média: " + distribuidora.DiasAcimaMedia());
    }
}
