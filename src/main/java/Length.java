public class Length {
    public final double value;
    public final Unit unit;

    public Length(Unit unit,double value){
        this.value=value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return Double.compare(length.value, this.value) == 0;
    }
}