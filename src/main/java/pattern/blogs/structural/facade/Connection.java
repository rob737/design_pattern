package pattern.blogs.structural.facade;

public class Connection {

    public Connection connect(String url){
        System.out.println("Successfully connected to url : " + url);
        return this;
    }

    public void disconnect(){
        System.out.println("Successfully terminated connection.");
    }

}
