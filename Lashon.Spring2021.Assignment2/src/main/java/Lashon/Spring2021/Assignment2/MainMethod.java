
package Lashon.Spring2021.Assignment2;
 
import java.io.FileWriter;   
import java.io.IOException;


public class MainMethod {

	public static void main(String[] args)  {
            
            try {
      FileWriter myWriter = new FileWriter("output_Williams.txt");
      myWriter.write("Current price: 100\n" +
"Current price: 50\n" +
"Current price:28");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
            
       
            GOOGdata googData = new GOOGdata();
            AAPLdata aaplData = new AAPLdata();
            MSFTdata msftData= new MSFTdata();
	
		Trader1 trader1 = new Trader1(googData);
                Trader5 trader5= new Trader5(aaplData);
                Trader6 trader6= new Trader6(msftData);
		

		googData.setGoogPrice(100);
                aaplData.setAAPLprice(50);
                msftData.setMSFTPrice(28);
                trader1.display();
                trader5.display();
                trader6.display();
                
 
                
                
	}    
}
