public enum Unit {
    FEET(12.0,"length"),INCH(1.0,"length"),
    YARD(36.0,"length"),CM(0.4,"length"),
    ML(0.001,"volume"),LITER(1,"volume"),GALLON(3.780,"volume"),
    KG(1.0,"mass"),GRAMS(0.001,"mass"),TUNNE(1000,"mass"),
    FAHRENHEIT(1,"temperature"),CELSIUS(2.12,"temperature");
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
