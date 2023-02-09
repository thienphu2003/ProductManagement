import java.io.Serializable;

public class Product implements Serializable {
    private int productID;
    private String productName;
    private String productProducer;
    private double productPrice;
    private String otherDescription;
    public Product(int productID,String productName,String productProducer,double productPrice,String otherDescription)
    {
        this.productPrice=productPrice;
        this.productProducer=productProducer;
        this.productName=productName;
        this.productID=productID;
        this.otherDescription=otherDescription;
    }
    public Product()
    {}

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductProducer() {
        return productProducer;
    }

    public void setProductProducer(String productProducer) {
        this.productProducer = productProducer;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    public String toString() {
        return "ID :"+this.getProductID()
                +" Product Name :"+this.getProductName()
                +" Product Creator :"+this.productProducer
                +" Product Price : "+this.productPrice
                +"Other Description "+this.otherDescription;
    }
}
