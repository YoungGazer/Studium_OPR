package operator;

import java.text.MessageFormat;

public abstract class Operator {

    public abstract double wendeAn(double argument);

    public final String gibInfo() {
        return "<p>" +
                this.gibOperatorName() +
                "</p><p>Beispielaufruf: " +
                this.gibKonstruktorausdruck() +
                ".wendeAn(" +
                this.gibBeispielargument() +
                ") = " +
                this.gibWertNachBeispielargument() +
                "</p>";
    }

    protected abstract String gibOperatorName();

    protected abstract String gibKonstruktorausdruck();

    protected abstract String gibBeispielargument();

    protected abstract String gibWertNachBeispielargument();

}
