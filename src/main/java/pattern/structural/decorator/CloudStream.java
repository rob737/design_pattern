package pattern.structural.decorator;

/*
* Use case : you want to re-use the operation (e.g. write method) but
* the input to operation can vary.
* We can leverage decorator pattern to decorate the input to
* transform it into our custom format and also re-use the underlying implementation.
* */
public class CloudStream implements CloudStreamPlaceholder{
    @Override
    public void write(String data){
        System.out.println("Storing " + data + " to cloud.");
    }
}
