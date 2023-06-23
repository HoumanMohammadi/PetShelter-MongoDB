package de.iav.petsheltermongodb.model;

public record Pet(String id,
                String name,
                int age,
                String species){
    public Pet withId(String newId){
        return new Pet(newId, this.name(), this.age(), this.species());
    }
}


