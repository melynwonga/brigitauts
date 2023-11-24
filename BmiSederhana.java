
package bmisederhana;


public class BmiSederhana {

 public static void main(String[] args) {
       String nama = "Bigita Amelia Sulastri Wonga";
       int umur = 19;
       double tb = 1.46;
       int bb = 53;
       double BMI;
       
       System.out.println("nama:" +nama);
       System.out.println("umur:" +umur);
       System.out.println("tb:" +tb);
       System.out.println("bb:" +bb);
       
       BMI= (bb/(tb*tb));
       
       if (BMI <18.5){
           System.out.println(String.format("BMI: %.2f", BMI));
           System.out.println("Kurus");
       }
       else if (BMI <24.9){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Ideal");
       }
       
       else if (BMI <29.9){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Gemuk");
       }
            
       else if (BMI <29.9){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Obesitas");
       }
            
          
                
             
                
              
                }
       
        
       }
    
    

