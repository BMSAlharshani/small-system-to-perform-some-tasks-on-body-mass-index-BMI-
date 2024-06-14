/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a232_stia1123_asgn1_260511;
// Alharshani Bader (260511)
/**
 *
 * @author mczo4
 */
public class BMISystem {
    
    private User[] users;
    private int userCount;

    public BMISystem(int size) {
        users = new User[size];
        userCount = 0;


    }
    public void displayUsers() {
        System.out.println("A list of user records\n");
        for (User user : users) {
            if (user == null) {
                continue;
            }
            System.out.println("Your name = " + user.getName());
            System.out.println("Gender = " + user.getgender());
            System.out.println("Height = " + user.getHeight() + " m");
            System.out.println("Weight = " + user.getWeight() + " kg");
            System.out.println("BMI = " + user.getBMIValue());
            System.out.println("Status = " + user.getBMiStatus());
            System.out.println();
        }
    }

    public void searchUser(String name) {
        for (User user : users) {
            if (user == null) {
                continue;
            }
            
            if (user.getName().equalsIgnoreCase(name)) {
                System.out.println("The data is found.\n");
                System.out.println("Your name = " + user.getName());
                System.out.println("Gender = " + user.getgender());
                System.out.println("Height (in cm) = " + user.getHeight() + " m");
                System.out.println("Weight (in kg) = " + user.getWeight() + " kg");
                System.out.println("BMI = " + user.getBMIValue());
                System.out.println("Status = " + user.getBMiStatus());
                return;
            }
            
        }
        System.out.println("Sorry, the data is not found.");
    }

    public void deleteUser(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            }
            if (users[i].getName().equalsIgnoreCase(name)) {
                users[i] = null;
                System.out.println("The data has already successfully deleted from the array of objects.");
               return;
            }
        }
        System.out.println("Sorry, the data is not found.");
    
    
    
}

   public void addUser(String name, String gender, double height, double weight) {
       User x = new User (name , gender , height , weight); 
       x.setBMI(calculateBMIValue (height , weight));
       x.setBMIStatus(calculateBMIStatus (x.getBMIValue()));
       for (int i = 0 ; i <users.length ; i++ ){
           
           if (users[i] != null){
               
               continue; 
           }
           users[i] = x; 
           break;
       }
    }
    private double calculateBMIValue(double height, double weight){
        double bmi = weight / (height * height);
        return  bmi;
    }
    private String calculateBMIStatus(double bmiValue){
        double bmi = bmiValue;
        if (  bmi <=18 ){
            return (" your under wight ");

        }
            else if (  bmi <=24  ){

            return (" your noraml  ");

        }
            else if (  bmi <=29 ){
            return (" your overwight  ");

        }
            else if ( bmi <= 34   ){
            return (" your  obese  ");

        } 
            else if (  bmi <= 39 ){

            return (" your  severly obese  ");

        }
            else  {
             return (" your morbidly obses  ");
        }


        }

}
