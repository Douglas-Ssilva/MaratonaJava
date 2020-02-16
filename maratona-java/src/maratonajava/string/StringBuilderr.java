package maratonajava.string;

public class StringBuilderr {

    public static void main(String[] args) {
        String s = "java";
        String vazia = "";
        StringBuilder sb = new StringBuilder("Java Como Programar");        //tamanho da String
//        s= sb;                  tipos incompátiveis
//        s= sb.toString();      Convertendo a Builder p String
        System.out.println(s);
        System.out.println(sb);     //p todo objeto, quando imprimimos assim chama-se o toString implicitamente

        //ACRESCENTAR NA STRING, CRIA VÁRIOS OBJETOS NA MEMÓRIA, NA BUILDER NÃO
        sb.append(" Deitel");
        System.out.println(sb);
//        System.out.println(sb.reverse());         INVERTENDO A STRINGBUILDER

        //INVERTENDO UMA STRING
        for (int i = s.length() - 1; i >= 0; i--) {
            vazia += s.substring(i, i + 1);
        }
        System.out.println(vazia);

//        System.out.println(sb.delete(0, 2));    COMEÇA CONTAR DO 1
//        System.out.println(sb.insert(2, "DD"));     A PARTIR DE, INSIRA

    }

}
