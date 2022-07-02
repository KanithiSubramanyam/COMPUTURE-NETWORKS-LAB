import java.util.Scanner;
public class BItStuffing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the frame to Sent");
        String frame = input.nextLine();
        String remaning = new String();
        String output = new String();
        int count=0;
        for(int i = 0; i < frame.length(); i++) {
            if(frame.charAt(i) != '1' && frame.charAt(i) != '0'){
                System.out.println("Invalid frame: " + frame+"\nenter correct frame");
            }
            if(frame.charAt(i) == '1' ){   
                count+=1;
                remaning+=frame.charAt(i);
            }
            else{
                remaning+=frame.charAt(i);
                count=0;
            }       
            if(count==5){
                remaning+='0';
                count=0;
            }
        }   
        System.out.println("The flag-->01111110");
        String stuffed="01111110"+remaning+"01111110";
        System.out.println("The Stuffed Data: -->" + stuffed);
        count=0;
        for(int i=0; i < remaning.length(); i++){
            if(remaning.charAt(i) == '1' ){
                count++;
                output+=remaning.charAt(i);
            }
            else{
                output+=remaning.charAt(i);
                count=0;
            }
            if(count == 5)
            {
                if((i+2)!=remaning.length()){
                    output += remaning.charAt(i+2);
                }
                else{
                    output+= '1';
                }
                i=i+2;
                count = 1;
            }
        }
       
        System.out.println("The DeStuffed Data: -->" + output);
        input.close();
    }
}
