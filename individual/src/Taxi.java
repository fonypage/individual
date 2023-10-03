public class Taxi extends Avto{
    private int price;

    public Taxi(String marka, int power, double vol, int price) {
        super(marka, power, vol);
        this.price = price;
    }
    double tariff(double km)
    {
        return km*price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "price=" + price +
                '}';
    }
}
