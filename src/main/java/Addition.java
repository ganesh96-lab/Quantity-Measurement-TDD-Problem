public class Addition {
    public static Quantity add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.unit.quantityType.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.TEMP_NOT_ADDED,"Addition of Temp is not possible");
        if((quantity1.value>=0) && (quantity2.value>=0)) {
            double additionOfQuantity= quantity1.value * quantity1.unit.baseUnitConversion +
                    quantity2.value * quantity2.unit.baseUnitConversion;
            return Quantity.getObject(quantity1.unit.quantityType,additionOfQuantity);
        }
        throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE,"value can not negative");
    }
}
