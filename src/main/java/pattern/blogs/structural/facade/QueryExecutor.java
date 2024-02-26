package pattern.blogs.structural.facade;

public class QueryExecutor {

    private final String query;

    public QueryExecutor(String query) {
        this.query = query;
    }

    public void execute(){
        System.out.println("Query : " + query + " executed successfully in 350 ms");
    }
}
