package operator;

public class Addierer extends BinaererOperator {

    Addierer(double operand) {
        super(operand);
    }

    @Override
    public double wendeAn(double argument) {
        return argument + this.operand;
    }

    @Override
    protected String gibOperatorName() {
        return "Addierer";
    }

    @Override
    protected String gibBeispielargument() {
        return "10.0";
    }

}
