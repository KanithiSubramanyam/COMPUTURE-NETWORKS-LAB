import java.io.*;
public class CRC{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the message to be send");
        String message = br.readLine();
        System.out.println("Enter the polynomial");
        String polynomial = br.readLine();
        String dummy = message;
        dummy= message+ div(message,polynomial);
        System.out.println("the transmitted message is: " + dummy);
    }
    static String div(String message,String polynomial){
        int num2 = polynomial.length();
        String dividend = message.substring(0,num2);
        String remainder = ""; 
        for (int i = 0; i < polynomial.length(); i++) {
            if (dividend.charAt(i) == polynomial.charAt(i)) {
                remainder = remainder + "0";
            } else {
                remainder = remainder + "1";
            }
        }
        while(num2 <message.length()){
            if(remainder.charAt(0) == '0'){
                remainder=remainder.substring(1,remainder.length());
                remainder+=String.valueOf(message.charAt(num2));
                num2++;
            }
        }
            dividend=remainder;
            remainder="";  
            for (int i = 0; i < polynomial.length(); i++) {
                if (dividend.charAt(i) == polynomial.charAt(i)) {
                    remainder = remainder + "0";
                } else {
                    remainder = remainder + "1";
                }
            } 
    return remainder.substring(1,remainder.length());
}
}