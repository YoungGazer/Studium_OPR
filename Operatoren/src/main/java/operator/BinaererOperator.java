package operator;

import org.jetbrains.annotations.NotNull;

public abstract class BinaererOperator extends Operator {

    protected double operand;

    BinaererOperator(double operand) {
        this.operand = operand;
    }

    @Override
    protected final @NotNull String gibKonstruktorausdruck() {
        return "new " +
                this.gibOperatorName() +
                "(" +
                this.operand +
                ")";
    }

    @Override
    protected String gibWertNachBeispielargument() {
        return Double.toString(this.wendeAn(Double.parseDouble(this.gibBeispielargument())));
    }
}
