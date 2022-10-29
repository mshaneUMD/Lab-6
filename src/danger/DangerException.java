package danger;

public class DangerException extends Exception{
    String imformation;
    
    DangerException(String imformation){
        this.imformation=imformation;
    
    }
    void toShow(){
        
            System.out.println(imformation);
   }
}