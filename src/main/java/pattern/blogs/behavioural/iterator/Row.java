package pattern.blogs.behavioural.iterator;

import java.util.Set;

public class Row {
    private final int id;
    private final Set<String> rowList;

    public Row(int id, Set<String> rowList) {
        this.id = id;
        this.rowList = rowList;
    }

    public int getId() {
        return id;
    }

    public Set<String> getRowList() {
        return rowList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Row{");
        sb.append("id=").append(id);
        sb.append(", rowList=").append(rowList);
        sb.append('}');
        return sb.toString();
    }
}
