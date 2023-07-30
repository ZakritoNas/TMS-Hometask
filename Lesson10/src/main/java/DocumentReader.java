import java.io.*;
import java.util.Scanner;

public class DocumentReader {
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the path to the document:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);

        try (LineNumberReader read = new LineNumberReader(new FileReader(file));
             Writer writerRight = new FileWriter("C:\\TMS\\TMS-Hometask\\Lesson10\\src\\main\\java\\Documents\\ReportCorrect.txt");
             Writer writerWrong = new FileWriter("C:\\TMS\\TMS-Hometask\\Lesson10\\src\\main\\java\\Documents\\ReportIncorrect.txt")) {
            String document = read.readLine();
            while (document != null){
                if ((document.startsWith("docnum") || document.startsWith("contract")) && document.length() == 15){
                    writerRight.write(document + "\n");
                } else if (!(document.startsWith("docnum") || document.startsWith("contract"))){
                    writerWrong.write( document + " - Invalid number start" + "\n");
                } else if (document.length() !=15) {
                    writerWrong.write( document + " - Invalid number length" + "\n");
                }
                document = read.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Invalid path specified. Please try again.");
        }
    }
}
