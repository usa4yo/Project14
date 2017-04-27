
public class SampleChildException extends SampleParentException {
    private static final long serialVersionUID = 1L;
    
    public SampleChildException(String message){
        super(message);
    }

    public SampleChildException(){
        this("Child Exception object");
    }
}
