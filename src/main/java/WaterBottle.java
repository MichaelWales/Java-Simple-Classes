public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeDrink() {
        return this.volume - 10;
    }

}
