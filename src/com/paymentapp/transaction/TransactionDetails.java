package com.paymentapp.transaction;

import java.sql.Timestamp;

public class TransactionDetails {
    private int txnId;
    private Timestamp txnDateTime;
    private int sourceId;
    private int targetId;
    private SourceType sourceType; // Relationship with SourceType enum
    private SourceType destType;   // Relationship with SourceType enum
    private double txnAmount;
    private int userId; // Relationship with UserDetails

    // Constructor
    public TransactionDetails(int txnId, Timestamp txnDateTime, int sourceId, int targetId, SourceType sourceType, SourceType destType, double txnAmount, int userId) {
        this.txnId = txnId;
        this.txnDateTime = txnDateTime;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.sourceType = sourceType;
        this.destType = destType;
        this.txnAmount = txnAmount;
        this.userId = userId;
    }

    // Getters and Setters
    public int getTxnId() {
        return txnId;
    }

    public void setTxnId(int txnId) {
        this.txnId = txnId;
    }

    public Timestamp getTxnDateTime() {
        return txnDateTime;
    }

    public void setTxnDateTime(Timestamp txnDateTime) {
        this.txnDateTime = txnDateTime;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public SourceType getDestType() {
        return destType;
    }

    public void setDestType(SourceType destType) {
        this.destType = destType;
    }

    public double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(double txnAmount) {
        this.txnAmount = txnAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" +
                "txnId=" + txnId +
                ", txnDateTime=" + txnDateTime +
                ", sourceId=" + sourceId +
                ", targetId=" + targetId +
                ", sourceType=" + sourceType +
                ", destType=" + destType +
                ", txnAmount=" + txnAmount +
                ", userId=" + userId +
                '}';
    }
}