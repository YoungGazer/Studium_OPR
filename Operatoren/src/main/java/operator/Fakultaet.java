package operator;

public class Fakultaet extends Operator {

    private final double beispielArgument = 10.0;

    @Override
    public double wendeAn(double argument) {
        return argument <= 1
                ? argument
                : argument * wendeAn(argument - 1);
    }

    @Override
    protected String gibOperatorName() {
        return "Fakultät";
    }

    @Override
    protected String gibKonstruktorausdruck() {
        return "new Fakultaet()";
    }

    @Override
    protected String gibBeispielargument() {
        return Double.toString(this.beispielArgument);
    }

    @Override
    protected String gibWertNachBeispielargument() {
        return Double.toString(this.wendeAn(this.beispielArgument));
    }

}
