package student.report;

public class ReportService {

    private static final int CREDITS_TO_HOURS_RATIO = 15;

    public String getReport(Student student) {

        
        int expectedAttendance = student.getTotalCredits() * CREDITS_TO_HOURS_RATIO;
        String performance = student.getTotalHoursAttended() < expectedAttendance / 2 ? "Poor" : "Good";

        return "Attendance Report - " + java.time.LocalDate.now() + "\n" +
                "Student: " + student.getFirstName() + " " + student.getLastName() + "\n" +
                "Total Hours Attended: " + student.getTotalHoursAttended() + "\n" +
                "Expected Attendance: " + expectedAttendance + "\n" +
                "Performance: " + performance;
    }

}
