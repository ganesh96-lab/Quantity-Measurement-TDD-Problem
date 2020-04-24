public class Addition {
    public static double add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.unit.quantityType.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.TEMP_NOT_ADDED,"Addition of Temp is not possible");
            if((quantity1.value>=0) && (quantity2.value>=0)) {
                return quantity1.value * quantity1.unit.baseUnitConversion +
                        quantity2.value * quantity2.unit.baseUnitConversion;
            }
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE,"value can not negative");

    }
}
