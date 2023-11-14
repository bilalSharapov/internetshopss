public abstract  class Product {
    private String name ;
    private String description;
    private  int pric ;
    private int createdAt;

    public Product(String name, String description, int pric, int createdAt) {
        this.name = name;
        this.description = description;
        this.pric = pric;
        this.createdAt = createdAt;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPric() {
        return pric;
    }

    public void setPric(int pric) {
        this.pric = pric;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pric=" + pric +
                ", createdAt=" + createdAt +
                '}';
    }
}
//name, description, price, createdAt