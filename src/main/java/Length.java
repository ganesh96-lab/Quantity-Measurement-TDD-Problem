public class Length {
    private final double value;
    private final Unit unit;

    enum Unit{ INCH,FEET}

    public Length(Unit unit,double value){
        this.value=value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}
