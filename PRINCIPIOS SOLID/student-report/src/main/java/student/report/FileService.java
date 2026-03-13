package student.report;

public class FileService {

        public void generateReportAttendance(String filename, String content)  {
       
        try {
            printWriter = new PrintWriter(new FileWriter(filename));
            writer.println(content);
            System.out.println("Report file generated");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
