public class Distribuidora {

    public static void main(String[] args) {
        double[] faturamentoDiario = {1000, 1500, 1200, 1600, 1800, 2000, 2100, 2300, 2500, 2400, 2200, 1900};

        double menorFaturamento = menorFaturamento(faturamentoDiario);
        double maiorFaturamento = maiorFaturamento(faturamentoDiario);
        double mediaFaturamento = calcularMedia(faturamentoDiario);
        int diasAcimaMedia = diaAcimaMedia(faturamentoDiario, mediaFaturamento);

        System.out.println("Menor valor de faturmaneot " + menorFaturamento);
        System.out.println("Maior valor de faturamento " + maiorFaturamento);
        System.out.println("Media de faturamento " + mediaFaturamento);
        System.out.println("Dias acima da media " + diasAcimaMedia);
    }

    public static double menorFaturamento(double[] faturamento){
        double menor = Double.MAX_VALUE;
        for(double valor : faturamento){
            if(valor<menor){
                menor = valor;
            }
        }
        return menor;
    }

    public static double maiorFaturamento(double[] faturamento){
        double maior = Double.MIN_VALUE;
        for(double valor : faturamento){
            if(valor >maior){
                maior = valor;
            }
        }
        return maior;
    }

    public static double calcularMedia(double[] faturamento){
        double soma = 0;
        for(double valor : faturamento){
            soma += valor;
        }
        return soma/faturamento.length;
    }

    public static int diaAcimaMedia (double[] faturamento, double media){
        int contador = 0;
        for(double valor : faturamento){
            if(valor > media){
                contador++;
            }
        }
        return contador;
    }

}

