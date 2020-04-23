public class Quantity {
    public final double value;
    public final Unit unit;

    public Quantity(Unit unit, double value){
        this.value=value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, this.value) == 0;
    }
}