package student.report;


public class Main {
    public static void main(String[] args) {

        Student student = new Student("John", "Doe", 20, 12, 50);

        FeeService feeService = new FeeService();
        System.out.println(feeService.calculateFee(student));

        ReportService reportService = new ReportService();
        String report = reportService.getReport(student);
        System.out.println(report);

        FileService fileService = new FileService();
        fileService.generateReportAttendance("report.txt", report);
    }
}