import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class FisExample{
public static void main(String args[])throws IOException
{
File file=new File("newFile1.txt");
file.createNewFile();

/*try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
*/

FileInputStream fis=new FileInputStream("readData.txt");
FileOutputStream fos=new FileOutputStream("readData.txt");
String data="file is writing successfully..";
byte b[]=data.getBytes();
fos.write(b);
int temp;
while((temp=fis.read())!=-1){
System.out.println((char)temp);
}
}
}