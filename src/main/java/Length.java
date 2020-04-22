public class Length {
    private final double value;
    private final Unit unit;
    private final static double FEET_TO_INCH=12.0;
    enum Unit{ INCH,FEET}

    public Length(Unit unit,double value){
        this.value=value;
        this.unit=unit;
    }


    public boolean compare(Length that) {
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET)){
            return Double.compare(this.value*FEET_TO_INCH,that.value)==0;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}
