import java.util.Scanner;

public class NameInput

{

public static void main(String[]args)
{
Scanner in = new Scanner(System.in);





System.out.println(" Enter your name (Ex:John Quincy Adams)");
String name = in.nextLine();
int firstSpace = name.indexOf(" ");
int nextSpace = name.indexOf(" ");

  int lastChar = name.length();
 String firstName = name.substring(0, firstSpace);
 String middleName = name.substring(firstSpace,lastChar);

//  String middleName = name.substring();
//  String lastName = name.substring();


System.out.println( firstName + " " + middleName + lastChar);






}


}