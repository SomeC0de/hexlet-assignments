package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;
    private double balconyArea;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
        this.balconyArea = 0.0;
    }

    public Cottage(double area, int floorCount, double balconyArea) {
        this.area = area;
        this.floorCount = floorCount;
        this.balconyArea = balconyArea;
    }

    @Override
    public double getArea() {
        return (this.area + this.balconyArea);
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }

    @Override
    public String toString() {
        return String.format("%s этажный коттедж площадью %s метров", this.floorCount, this.getArea());
    }
}
// END

// END
