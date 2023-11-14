public class Electronics  extends  Product{
    private String brand;
    private String color;
    private String  isNew;
    private String memmory;

    public Electronics() {
    }

    public Electronics(String brand, String color, String isNew, String memmory) {
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memmory = memmory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getMemmory() {
        return memmory;
    }

    public void setMemmory(String memmory) {
        this.memmory = memmory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew='" + isNew + '\'' +
                ", memmory='" + memmory + '\'' +
                "} " + super.toString();
    }
}
// (brand, color, isNew, memory