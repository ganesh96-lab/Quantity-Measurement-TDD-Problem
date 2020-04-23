public enum Unit {
    FEET(12.0,"length"),INCH(1.0,"length"),
    YARD(36.0,"length"),CM(0.4,"length"),
    ML(1,"volume"),LITER(1000,"volume"),GALLON(3780,"volume");

    double baseUnitConversion;
    String quantityType;

    Unit(double baseUnitConversion,String quantityType){
        this.baseUnitConversion=baseUnitConversion;
        this.quantityType=quantityType;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.unit.quantityType.equals(quantity2.unit.quantityType)) {
            return Double.compare(quantity1.value * quantity1.unit.baseUnitConversion,
                    quantity2.value * quantity2.unit.baseUnitConversion) == 0;
        }
        throw new QuantityException(QuantityException.ExceptionType.INVALID_QUANTITY_COMPARE,
                "Invalid quantity compare");
    }
}
