package BasicPractice;

import java.util.Arrays;

public class IntegerAndFractionExtractor {
    public static String extractIntegerAndFraction(double number){
        // extract integer part
        String []parts=splitIntoIntegerAndFraction(number);
        System.out.println(Arrays.toString(parts));
        String integerPart=parts[0];
        if(parts.length>1 && parts[1].length()>0){
            String fractionalPart=getReducedFraction(parts[1]);
            return integerPart+" "+fractionalPart;
        }
        return integerPart;
    }
    public static String getReducedFraction(String b){
        int numerator=Integer.parseInt(b);
        int denominator= (int) Math.pow(10,b.length());
        int hcf=getHCF(numerator,denominator);
        numerator/=hcf;
        denominator/=hcf;
        return numerator +"/"+ denominator;
    }
    public static int getHCF(int a, int b){
        return (b==0)?a:getHCF(b,a%b);
    }
    public static String [] splitIntoIntegerAndFraction(double number){
        System.out.println("given number "+number);
        return Double.toString(number).split("\\.");
    }
}
