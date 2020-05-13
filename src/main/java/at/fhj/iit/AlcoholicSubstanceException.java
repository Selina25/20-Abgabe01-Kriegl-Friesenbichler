package at.fhj.iit;

public class AlcoholicSubstanceException extends Throwable {


    /**
     * Constructs a new exception with the specified detail message, the cause is not initialized.
     */
    public AlcoholicSubstanceException() {
        super("The Definiton of a mixed drink is that it contains not more than one alcoholic liquid. Too many alcoholic liquids here.");
    }

    /**
     * Constructs a new exception with the specified detail message and cause
     *
     * @param errorMessage the detail message (which is saved for later retrieval by the Throwable.getMessage() method)
     * @param cause the cause (which is saved for later retrieval by the Throwable.getCause() method)
     */
    public AlcoholicSubstanceException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
