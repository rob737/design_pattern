package pattern.structural.proxy.assignment;

public class ProductProxy implements Product{
    private final ProductEntity productEntity;
    private final DbContext dbContext;

    public ProductProxy(ProductEntity productEntity, DbContext dbContext) {
        this.productEntity = productEntity;
        this.dbContext = dbContext;
    }

    @Override
    public int getId() {
        return productEntity.getId();
    }

    @Override
    public String getName() {
        return productEntity.getName();
    }

    @Override
    public void setName(String name) {
       productEntity.setName(name);
       dbContext.markAsChanged(productEntity);
    }
}
