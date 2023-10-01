public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("245443199");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("o cep não corresponde com as regras do negocio");
            
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
