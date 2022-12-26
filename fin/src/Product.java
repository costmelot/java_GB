public class Product {
    private String nameOfBrand;
    private int randomAccessMemory;
    private String operatingSystem;
    private int hardDiskSize;
    private String colorOfNotebook;
    private int price;

    public Product(String nameOfBrand, int randomAccessMemory, String operatingSystem, int hardDiskSize,
                   String colorOfNotebook, int price) {
        super();
        this.nameOfBrand = nameOfBrand;
        this.randomAccessMemory = randomAccessMemory;
        this.operatingSystem = operatingSystem;
        this.hardDiskSize = hardDiskSize;
        this.colorOfNotebook = colorOfNotebook;
        this.price = price;
    }

    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public void setNameOfBrand(String nameOfBrand) {
        this.nameOfBrand = nameOfBrand;
    }

    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(Integer randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(Integer hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getColorOfNotebook() {
        return colorOfNotebook;
    }

    public void setColorOfNotebook(String colorOfNotebook) {
        this.colorOfNotebook = colorOfNotebook;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return nameOfBrand + " - " + randomAccessMemory + " - " + operatingSystem + " - " + hardDiskSize + " - " +
                colorOfNotebook + " - " + price;
    }
}
