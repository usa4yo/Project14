
public class SampleExceptionDriver {

    public static void main(String[] args) {
        
        try{
            
            int x = 3;
            int y = 0;
            
            System.out.println(x/y);
            
            throw new SampleChildException();
//            throw new SampleParentException();            
//            throw new Exception("This is an exception");

        } catch(SampleChildException cpe){
            System.out.println("In Child Exception block");
            System.out.println(cpe.getMessage());
            
        } catch(SampleParentException spe){
            System.out.println("In Parent Exception block");
            System.out.println(spe.getMessage());

        } catch(Exception e){
            System.out.println("In exception block");
            System.out.println(e.getMessage());
        }   // Ending bracket of try catch exception

    }   // Ending bracket of the main method

}   // Ending bracket of the SampleExceptionDriver class
