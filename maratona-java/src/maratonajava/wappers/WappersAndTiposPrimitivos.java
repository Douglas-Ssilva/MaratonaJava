package maratonajava.wappers;
 
public class WappersAndTiposPrimitivos {
    public static void main(String[] args) {
        byte bytePrimitivo= 127;        //-128  a 127
        short shortPrimitivo= 32767;
        int intPrimitivo= 10;
        long longPrimitivo= 100;
        float floatPrimitivo= 10.2f;
        double doublePrimitivo= 10.5d;
        char charPrimitivo= 'f';
        boolean booleanPrimitivo= true;
        
        Byte byteWappers= -128;
        Short shortWappers= -32768;
        Integer integerWappers= 10;
        Long longWappers= 100l;
        Float floatWappers= 1000.5f;
        Double doubleWappers= 1.25d;
        Character charWappers= 'g';
        Boolean booleanWappers= false;
        
        String value= "90";
        Short s= Short.parseShort(value);
        System.out.println(s + 1);
        
        Byte b= Byte.parseByte(value);
        System.out.println(b / 2);
        
        Double d= Double.parseDouble(value);
        System.out.println(d * 2);
        
        System.out.println( "É digito: " + Character.isDigit('9'));
        System.out.println( "É letra: " + Character.isLetter('e'));
        System.out.println( "É Upercase: " + Character.isUpperCase('E'));
        System.out.println( "É Lowercase: " + Character.isLowerCase('t'));
        
        System.out.println( "Soma: " + Double.sum(20, 10));
        System.out.println( "Valor: " + Double.valueOf("20"));
        
        System.out.println( "Maior: " + Integer.max(2, 10));
        System.out.println( "Menor: " + Integer.min(2, 10));
        
        System.out.println( "Converta p boolean: " + Boolean.parseBoolean("true"));
        
    }
    
}
