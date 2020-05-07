package main.java.at.fhj.iit;

public class AlcoholicSubstanceException extends Throwable {
    public AlcoholicSubstanceException() {
        super("The Definiton of a mixed drink is that it contains not more than one alcoholic liquid. Too many alcoholic liquids here.");
    }

    public AlcoholicSubstanceException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
