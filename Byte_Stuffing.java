import java.util.*;
public class Byte_Stuffing{
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Data");
        String data  = input.nextLine();
        String res = new String();
        String output= new String();
        data="f"+data+"f";
        for(int i=0; i<data.length(); i++){
            if(data.charAt(i) == 'f' && i!=0 && i!=data.length()-1){ 
                res=res+'e'+data.charAt(i);
            }
            else if(data.charAt(i) == 'e'){
                res=res+'e'+data.charAt(i);  
            }
            else{
                res=res+data.charAt(i);
            }
        }
        System.out.println("The DATA is stuffed with e");
        System.out.println("The Stuffed Data:--->"+res);
        for(int i=1; i<res.length()-1; i++) {
            if(res.charAt(i) == 'f') {
                output+=res.charAt(i);
            }
            else if(res.charAt(i) == 'e'&&res.charAt(i+1) == 'e') {
                output+='e';
                i=i+2;
            }
            else{
                output+=res.charAt(i);
            }
        }
        System.out.println("the Data is Destuffed");
        System.out.println("The output Destuffed data---->"+output);
        input.close();
    }
}