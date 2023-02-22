public class CarDannyi {
    private int yearCar;
    private String model;
    private int price;
    private String colour;

    public CarDannyi(int yearCar, String model, int price, String colour) {
        this.yearCar = yearCar;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public CarDannyi() {
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\n{" +
                "yearCar=" + yearCar +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
