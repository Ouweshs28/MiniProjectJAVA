public class Patient {
    int id;
    String name;
    double fees;

    public Patient(){
        id=0;
        name="";
        fees=0;
    }
    public Patient(int i, String n, double f){
        id=i;
        name=n;
        fees=f;
    }

    public void Print(){
        System.out.println("___________________");
        System.out.println("Patient details: ");
        System.out.println("Patient ID : " +id);
        System.out.println("Patient name: " +name);
        System.out.println("Patient fees: " +fees);
        System.out.println("___________________");
    }

}

