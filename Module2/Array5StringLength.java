/*Write a java program Find out length of string without using inbuilt function*/

package module2;

public class Array5StringLength 
{
	public static void main(String[] args)
	{  
        String myString = "Java Programming";         

        int count = 0;  
        
        for (int i = 0; i < myString.length(); i++) 
        {  
            count++;  
        }  
        System.out.println("Length of string is: " + count);  
    }  
}
