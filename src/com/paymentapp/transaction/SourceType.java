package com.paymentapp.transaction;

public enum SourceType {
    BANK_ACCOUNT("bank_account"),
    WALLET_ACCOUNT("wallet_account"),
    THIRD_PARTY("third_party");

    private final String sourceTypeName;

    
    SourceType(String sourceTypeName) {
        this.sourceTypeName = sourceTypeName;
    }

    
    public String getSourceTypeName() {
        return sourceTypeName;
    }

  
    public static SourceType fromName(String name) {
        for (SourceType type : SourceType.values()) {
            if (type.getSourceTypeName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid source type name: " + name);
    }
}