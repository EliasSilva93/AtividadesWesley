import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Cálculo da média de três notas
        System.out.println("1) Cálculo da média de três notas");
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);

        // 2) Cálculo de idade atual e idade em 2050
        System.out.println("\n2) Cálculo de idade atual e idade em 2050");
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        System.out.println("Idade atual: " + idadeAtual);
        System.out.println("Idade em 2050: " + idade2050);

        // 3) Conversão de dólares para reais
        System.out.println("\n3) Conversão de dólares para reais");
        System.out.println("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.println("Digite a quantidade de dólares que você possui: ");
        double quantidadeDolares = scanner.nextDouble();
        double valorEmReais = quantidadeDolares * cotacaoDolar;
        System.out.println("O valor em reais é: " + valorEmReais);

        // 4) Cálculo de novo salário com aumento de 25%
        System.out.println("\n4) Cálculo de novo salário com aumento de 25%");
        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.println("O novo salário é: " + novoSalario);

        // 5) Cálculo da área de um losango
        System.out.println("\n5) Cálculo da área de um losango");
        System.out.println("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.println("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + areaLosango);

        // 6) Conversão de temperatura de Celsius para Fahrenheit
        System.out.println("\n6) Conversão de temperatura de Celsius para Fahrenheit");
        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        // 7) Cálculo da quantidade de salários mínimos
        System.out.println("\n7) Cálculo da quantidade de salários mínimos");
        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");

        // 8) Cálculo de novo peso (aumento e redução)
        System.out.println("\n8) Cálculo de novo peso (aumento e redução)");
        System.out.println("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();
        double novoPesoAumento = peso * 1.15;
        double novoPesoReducao = peso * 0.8;
        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + novoPesoAumento);
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoReducao);

        // 9) Cálculo da hipotenusa usando o Teorema de Pitágoras
        System.out.println("\n9) Cálculo da hipotenusa usando o Teorema de Pitágoras");
        System.out.println("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.println("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        // 10) Cálculo de comprimento, área e volume de uma esfera
        System.out.println("\n10) Cálculo de comprimento, área e volume de uma esfera");
        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double comprimentoEsfera = 2 * Math.PI * raio;
        double areaEsfera = Math.PI * raio * raio;
        double volumeEsfera = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O comprimento da esfera é: " + comprimentoEsfera);
        System.out.println("A área da esfera é: " + areaEsfera);
        System.out.println("O volume da esfera é: " + volumeEsfera);

        // 11) Tabuada de multiplicação
        System.out.println("\n11) Tabuada de multiplicação");
        System.out.println("Informe um número para a tabuada: ");
        int numeroTabuada = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);
        }
    }
}
