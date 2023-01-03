

public class Product {
    private int ProductId;
    private String ProductCollection;
    private int ProductNumbers;

    public Product(int productId, String productCollection, int productNumbers) {
        ProductId = productId;
        ProductCollection = productCollection;
        ProductNumbers = productNumbers;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductCollection() {
        return ProductCollection;
    }

    public void setProductCollection(String productCollection) {
        ProductCollection = productCollection;
    }

    public int getProductNumbers() {
        return ProductNumbers;
    }

    public void setProductNumbers(int productNumbers) {
        ProductNumbers = productNumbers;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductCollection='" + ProductCollection + '\'' +
                ", ProductNumbers=" + ProductNumbers +
                '}';
    }
}