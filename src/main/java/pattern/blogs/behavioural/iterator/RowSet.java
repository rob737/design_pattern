package pattern.blogs.behavioural.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RowSet {
    private final List<Row> rows = new ArrayList<>();

    public void execute(String query){
        System.out.println("Query execution in progress");
        rows.add(new Row(1, new HashSet<>(Collections.singletonList("Java,Design Pattern,Author"))));
        rows.add(new Row(2, new HashSet<>(Collections.singletonList("Java,Concurrency,Author"))));
        rows.add(new Row(3, new HashSet<>(Collections.singletonList("Java,Build Tool,Author"))));
        System.out.println("Query Execution completed successfully");
    }

    public Iterator<Row> iterator() {
        return new ResultSet(this);
    }

    static class ResultSet implements Iterator<Row> {
        private final RowSet rowSet;
        int index;

        public ResultSet(RowSet rowSet) {
            this.rowSet = rowSet;
        }

        @Override
        public boolean hasNext() {
            return index < rowSet.rows.size();
        }

        @Override
        public void next() {
            this.index ++;
        }

        @Override
        public Row current() {
            return rowSet.rows.get(index);
        }
    }
}
