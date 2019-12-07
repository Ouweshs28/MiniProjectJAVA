import java.util.Scanner;

public class PatientTester {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);


        //patient1.Print();
        //patient2.Print();

        int menu=0;
        Patient patient3 = new Patient();
        Patient patient1= new Patient(125,"Ouwesh ",25);
        Patient patient2= new Patient(213,"Alex",300);
        do {
            System.out.println("Please make a choice");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Enter Patient Details");
                    System.out.print("Enter Patient ID: ");
                    int id = input.nextInt();
                    System.out.print("Enter Patient Name: ");
                    String name = input.next();
                    System.out.print("Enter Fees: ");
                    double fees = input.nextDouble();
                    patient3 = new Patient(id, name, fees);

                    break;
                case 2:
                    patient3.Print();
                    patient1.Print();
                    patient2.Print();
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                case 4:
                    System.out.println("Search patient by ID");
                    int search=input.nextInt();
                    if(patient1.id==search) {
                        System.out.println("Patient Found!");
                        patient1.Print();
                    }
                    else if(patient2.id==search){
                        System.out.println("Patient Found!");
                        patient2.Print();
                    }
                    else if(patient3.id==search){
                        System.out.println("Patient Found!");
                        patient3.Print();
                    }
                    else {
                        System.out.println("Patient not found");
                    }
                        break;

                default:
                    System.out.println("invalid choice");
            }
        }while (menu!=3);


    }
}
