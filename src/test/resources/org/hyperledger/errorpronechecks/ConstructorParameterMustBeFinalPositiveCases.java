package org.hyperledger.errorpronechecks;

public class ConstructorParameterMustBeFinalPositiveCases {
    public enum BadBlockReason {
        // Standard spec-related validation failures
        SPEC_VALIDATION_FAILURE,
        // When an unexpected exception occurs during block processing
        EXCEPTIONAL_BLOCK_PROCESSING,
        // This block is bad because it descends from a bad block
        DESCENDS_FROM_BAD_BLOCK,
    }

    private final BadBlockReason reason;
    private final String description;

    // BUG: Diagnostic contains: Method input parameters must be final.
    ConstructorParameterMustBeFinalPositiveCases(BadBlockReason reason, String description) {
        this.reason = reason;
        this.description = description;
    }

    public static ConstructorParameterMustBeFinalPositiveCases fromValidationFailure(final String failureMessage) {
        return new ConstructorParameterMustBeFinalPositiveCases(BadBlockReason.SPEC_VALIDATION_FAILURE, failureMessage);
    }

    // BUG: Diagnostic contains: Method input parameters must be final.
    public String shouldRaiseError(String a) {
        // This is a dummy method to test the rule
        System.out.println(a);
        //return new java.security.SecureRandom().getAlgorithm();
        return a;
    }

    public BadBlockReason getReason() {
        return reason;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BadBlockCause{" + "reason=" + reason + ", description='" + description + '\'' + '}';
    }
}
