import java.util.Scanner;
public class Palindrome {
public static void main (String [] args){
Scanner keyboard=new Scanner(System.in);

System.out.println("Please enter any sequence of characters:");
String user_input = keyboard.nextLine();
user_input=user_input.toLowerCase();
user_input = user_input.replaceAll("\\W", "");

boolean isPalindrome = false;
int left = 0;
int right = user_input.length()-1;

while(left<right&&left!=right){
if(user_input.charAt(left) != user_input.charAt(right)){
isPalindrome = true;
break;
}
else{
isPalindrome = false;
}

left++;
right--;
}

if(isPalindrome == true){
System.out.println(user_input + " " + "is not a palindrome ");
}
else{
System.out.println(user_input + " " + "is a palindrome");

}
}

}