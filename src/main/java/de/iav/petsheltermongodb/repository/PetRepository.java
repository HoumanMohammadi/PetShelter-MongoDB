package de.iav.petsheltermongodb.repository;

import de.iav.petsheltermongodb.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {

}
