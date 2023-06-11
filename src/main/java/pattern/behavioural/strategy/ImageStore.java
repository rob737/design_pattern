package pattern.behavioural.strategy;

public class ImageStore {
    private final Compressor compressor;
    private final Filter filter;

    public ImageStore(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if(compressor == Compressor.JPEG){
            System.out.println("Compressing using JPEG ...");
        }else if(compressor == Compressor.PNG){
            System.out.println("Compressing using PNG ...");
        }

        if(filter == Filter.B_W){
            System.out.println("Filter using B&W");
        }else if(filter == Filter.HIGH_CONTRAST){
            System.out.println("Filter using high contrast");
        }
    }
}
