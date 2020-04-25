public class Quantity {
    public final double value;
    public final Unit unit;

    public Quantity(Unit unit, double value){
        this.value=value;
        this.unit=unit;
    }

    public static Quantity getObject(String quantityType, double additionOfQuantity) {
        if (quantityType.equals("length"))
        {
            return new Quantity(Unit.INCH,additionOfQuantity);
        }
        else if(quantityType.equals("volume"))
        {
            return new Quantity(Unit.LITER,additionOfQuantity);
        }
        return new Quantity(Unit.KG,additionOfQuantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, this.value) == 0;
    }
}