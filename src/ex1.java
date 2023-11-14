import java.io.*;
public class ex1 {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("C://Users//Nadia//IdeaProjects//lab12//src//input");
            FileOutputStream out = new FileOutputStream("C://Users//Nadia//IdeaProjects//lab12//src//output"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage() + "dfdfd");
        } catch (Exception exx) {
            System.out.println();
            System.out.println(exx.getMessage());
        }
    }
}
