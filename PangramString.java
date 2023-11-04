import java.util.Scanner;

public class PangramString {
    public static boolean checkPangram(String str){
        boolean[] mark=new boolean[26];
        int index=0;
        for(int i=0; i<str.length(); i++){
            if('A'<= str.charAt(i) && str.charAt(i)<= 'Z'){
            index = str.charAt(i) - 'A';
            }
            else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
            index = str.charAt(i)- 'a';
            }
            else
            continue;
            mark[index]= true;
        }
        for(int i=0; i<=25; i++)
        if(mark[i] == false)
        return (false);
        return (true);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String Value: ");
        String str= sc.nextLine();
        if(checkPangram(str) == true){
            System.out.println("The string value is Pangram");
        }
        else{
            System.out.println("The string value is not Pangram");
        }
    }
}
