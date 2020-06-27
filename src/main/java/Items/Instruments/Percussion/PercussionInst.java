package Items.Instruments.Percussion;

public enum PercussionInst{
    SNAREDRUM1("Ludwig", 14, 7, "Basic Snare", 100.00, 200.00),
    SNAREDRUM2("Gretsch", 14, 7, "Great all rounder", 80.00, 160.00);

    private final String brand;
    private final int width;
    private final int height;
    private final String description;
    private final Double wholesalePrice;
    private final Double rrpPrice;



    PercussionInst(String brand, int width, int height, String description, Double wholesalePrice, Double rrpPrice) {
        this.brand = brand;
        this.width = width;
        this.height = height;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.rrpPrice = rrpPrice;

    }

    public String getBrand() {
        return brand;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getDescription() {
        return description;
    }

    public Double getWholesalePrice() {
        return wholesalePrice;
    }

    public Double getRrpPrice() {
        return rrpPrice;
    }
}
