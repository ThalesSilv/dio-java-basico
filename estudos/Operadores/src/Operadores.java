public class Operadores {
    public static void main(String[] args) throws Exception {
            //classe Operadores.java
            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3;
            double resultado = (10 * 7) + (20/4);
            //classe Operadores.java
            int numero = 5;
		
            //Imprimindo o numero negativo
            System.out.println(- numero);

            //incrementando numero em mais 1 numero, imprime 6
            numero ++;
            System.out.println(numero);

            //incrementando numero em mais 1 numero, imprime 7
            System.out.println(numero ++);// ops algo de errado não está certo

            System.out.println(numero);// agora sim, numero virou 7

            //ordem de precedencia conta aqui
            System.out.println(++ numero);

            boolean verdadeiro = true;

            System.out.println("Inverteu " + !verdadeiro);
            // classe Operadores.java
            int a, b;

            a = 5;
            b = 6;
            /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
               resultado = "verdadeiro";
            else
               resultado = "falso";
            */

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado1= (a==b) ? "verdadeiro" : "false";

            System.out.println(resultado1);
            // && and, || or
    }


}
