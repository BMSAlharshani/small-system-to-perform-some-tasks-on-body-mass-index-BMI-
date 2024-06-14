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
public class User {
     private String  name ;
    private String gender ; 
    private double height ; 
    private double weight ; 
    private double bmiValue;
    private String bmiStatus;
    
    public User (String name , String gender , double height , double weight){
        
        this.name = name ; 
        this.gender = gender ; 
        this.height = height; 
        this.weight = weight;
       
        
        

            }
            public String getName(){ 
                return name; 


            }
            public String getgender(){ 
                return gender ; 

            }
            public double getHeight(){
                return height ; 

            }
            public double getWeight(){
                return weight ; 
            }
             public double getBMIValue() {
                return bmiValue;
            }

            public String getBMiStatus() {
                return bmiStatus;
            }

            public void  settName(String newName ){

                this.name = newName ; 

            }
            public void setGender (String newGender){
                    this.gender = newGender;

        }
            public void setHeight(int newHeight){
                    this.height = newHeight; 

                }

            public void setHright(int newWeight){
                    this.weight = newWeight; 

                }

            public void setBMI(double BMI ) {
                this.bmiValue = BMI;

            }
            
            public void setBMIStatus(String newBMIStatus){
                this.bmiStatus = newBMIStatus;
            
}
}


