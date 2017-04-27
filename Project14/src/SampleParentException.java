
public class SampleParentException extends Exception{
    private static final long serialVersionUID = 1L;
    
    public SampleParentException(String message) {
        super(message);
    }   // Ending bracket of the constructor SampleParentsException 

    public SampleParentException(){
        this("This is the parent exception");
    }   // Ending bracket of the default constructor 
    
}   //Ending bracket of the class SampleParentException
