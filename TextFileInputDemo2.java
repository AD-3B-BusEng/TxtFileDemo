import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fgailly
 */
public class TextFileInputDemo2 {

  /**
   * @param args the command line arguments
   */
  public static void test() {
    System.out.print ("Enter file name: ");    
    Scanner keyboard = new Scanner (System.in);
    String fileName = keyboard.next ();        
    Scanner inputStream = null;
    System.out.println ("The file " + fileName + "\n" +
                "contains the following lines:\n");
    try
    {
      inputStream = new Scanner (new File (fileName));
    }
    catch (FileNotFoundException e)
    {
      System.out.println ("Error opening the file " + fileName);
      System.exit (0);
    }
    while (inputStream.hasNextLine ())
    {
      String line = inputStream.nextLine ();
      System.out.println (line);
    }
    inputStream.close ();
  }
  
}
