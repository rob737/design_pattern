package pattern.blogs.behavioural.iterator;

public class Client {
    public static void main(String[] args) {
        RowSet rowSet = new RowSet();
        rowSet.execute("select * from course");

        // Separation of concern of underlying collection and Iterable.
        Iterator<Row> iterator = rowSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
