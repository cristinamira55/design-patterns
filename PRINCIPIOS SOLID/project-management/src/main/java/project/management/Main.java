package project.management;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        QATester qaTester = new QATester();
        ProjectManagement projectManagement = new ProjectManagement();
        
        System.out.println(projectManagement.process(programmer));
        System.out.println(projectManagement.process(qaTester));
        
    }
}