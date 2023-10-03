public class Avto {
    String marka;
    int power;
    double vol;

    public Avto(String marka, int power, double vol) {
        this.marka = marka;
        this.power = power;
        this.vol = vol;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Avto{" +
                "marka='" + marka + '\'' +
                ", power=" + power +
                ", vol=" + vol +
                '}';
    }
}
