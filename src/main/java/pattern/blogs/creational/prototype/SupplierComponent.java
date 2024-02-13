package pattern.blogs.creational.prototype;

public class SupplierComponent implements Supplier{

    private int id;
    private String description;


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Supplier getSupplier(String product) {
        return new SupplierComponent();
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SupplierComponent{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
