/*using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
*/

package module2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exception4
{
	public static void main(String[] args) {
	
		try {
			FileOutputStream fout = new FileOutputStream("a.text");
			try {
				ObjectOutputStream out = new ObjectOutputStream(fout);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}	
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
