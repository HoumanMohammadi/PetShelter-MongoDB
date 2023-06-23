package de.iav.petsheltermongodb.exception;

import java.util.NoSuchElementException;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(String id) {
        super("Pet with id " + id + " not found");
    }
}
