import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[]args){

        System.out.println("Hereinafter will be deployed the menu where you will select the section of your interest ");
        System.out.println();
        System.out.println("---------------Menu---------------");
        System.out.println("1. Create a project.");
        System.out.println("2. Culminate stage of project.");
        System.out.println("3. Register capsule."); 
        System.out.println("4. Approve capsule."); 
        System.out.println("5. Publish capsule.");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Select the phase you want:  ");

        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        Project[] projects = new Project[10];

        projects[0] = new Project("project #1", "Thomas", "Camila", "+99 310 744 1290", 83656.99, "12/03/2022", "12/06/2022");
        projects[1] = new Project("project #2", "Sebastian", "Francisco", "+1 408 567 9421", 2349.00, "04/09/2024", "06/11/2024");
        projects[2] = new Project("Project #3", "Juan", "Daniel", "+966 054 3122", 999999.00, "22/05/2023", "11/08/2023");
        projects[3] = new Project("Project #4", "Castro", "gabriel", "+31 874 2366", 4657.83, "17/01/2024", "20/04/2024");
        projects[4] = new Project("Project #5", "samuel", "vanegas", "+46 112 7645", 56654.00, "03/12/2023", "14/04/2024");
        projects[5] = new Project("Porject #6", "Agata", "Alejandro", "+22 895 1234", 562.00, "07/22/2024", "10/10/2024");
        projects[6] = new Project("Project #7", "Sofia", "Carlos", "+42 678 4128", 63853.00, "27/06/2024", "15/11/2024");
        projects[7] = new Project("Project #8", "Isabella", "Karla", "+67 843 1264", 33278.99, "19/02/2025", "23/08/2026");
        projects[8] = new Project("Project #9", "Ursula", "Jennifer", "+34 856 1956", 67874.37, "21/06/2025", "27/10/2025");
        projects[9] = new Project("Project #10", "Garcia", "Lopez", "+ 57 784 5523", 218.00, "01/01/2026", "08/07/2026");

            switch (op){

                case 1: 
                System.out.println("You have selected: 'Create a project'");
                System.out.println();
                System.out.println("The information for the projects is: ");
                System.out.println();
                for (int i = 0; i <= 9; i++){
                    System.out.println(projects[i].toString());
                    System.out.println();
                }
                break;

                case 2:
                System.out.println("You have selected: 'Culminate stage of project'");
                break;

                case 3:
                System.out.println("You have selected: 'Register capsule'");
                break;

                case 4: 
                System.out.println("You have salected: 'Approve capsule'"); 
                break;

                case 5: 
                System.out.println("You have selected: 'Publish capsule'"); 
                break;

                default: 
                System.out.println("Invalid parameter, try again"); 
                break;
            }

            

    }
}
