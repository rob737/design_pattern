package pattern.blogs.creational.abstractfactory;

public class Record {
    private final long id;
    private final String description;
    private final double amount;

    public Record(long id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Record : {");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
