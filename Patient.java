public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private Double height;
    private Double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, Double height, Double weight, String bloodGroup,String phoneNumber ){
        this.id = id;
        this.name = name;

        if(birthYear > 0){
            this.birthYear = birthYear;
        }else {
            System.out.println("Set default");
            this.birthYear = 2004; // Set
        }
        if(height >0){;
            this.height = height;
        }else{
            System.out.println("Set default");
            this.height = 170.0;
        }
        if(weight > 0){
            this.weight = weight;
        }else{
            System.out.println("Set default");
            this.weight = 75.0;
        }
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }
    public int getAge(int currentYear){
        if(currentYear > birthYear){
            return currentYear - birthYear;
        }else{
            return 0;
        }
    }
    public double getBMI(){
        if(height > 0|| weight > 0){
            return weight/ Math.pow(height/100,2);
        }else {
            return 0;
        }
    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group : " + bloodGroup);
        System.out.println("Patient Phone Number : " + phoneNumber);
        System.out.println("Patient BMI : " + getBMI());
    }

}

