package edu.wku.hospital.management.exception;

public class TransactionFailedException extends  Exception {
    public TransactionFailedException(String message){
        super(message);
    }

}
