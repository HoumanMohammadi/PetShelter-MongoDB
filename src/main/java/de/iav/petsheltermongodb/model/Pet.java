package de.iav.petsheltermongodb.model;

import java.util.Optional;

public record Pet(String id,
                  String name,
                  int age,
                  String species,
                  String ownerId,
                  String ownerName
){
    public Pet withId(String newId){
        return new Pet(newId, this.name(), this.age(), this.species(), this.ownerId, this.ownerName);
    }

    //public Pet withOwnerName()

    public Pet(String id, String name, int age, String species){
        this(id, name, age, species, null, null);
    }
}


