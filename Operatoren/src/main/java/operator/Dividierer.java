package operator;

public class Dividierer extends BinaererOperator {

    Dividierer(double operand) {
        super(operand);
    }

    @Override
    public double wendeAn(double argument) {
        return argument / this.operand;
    }

    @Override
    protected String gibOperatorName() {
        return "Dividierer";
    }

    @Override
    protected String gibBeispielargument() {
        return "3.0";
    }

}