package de.iav.petsheltermongodb.repository;

import de.iav.petsheltermongodb.model.Owner;
import de.iav.petsheltermongodb.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {

    List<Pet> findAllBySpeciesEqualsIgnoreCase(String species);
    List<Pet> findAllByAgeAfter(int age);

    List<Pet> findAllByNameStartingWith(String name);
    List<Pet> findPetsByOwnerId(String id);
    List<Pet> findPetsByOwnerName (String ownerName);
}
