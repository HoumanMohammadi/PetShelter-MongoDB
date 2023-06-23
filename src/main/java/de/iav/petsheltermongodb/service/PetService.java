package de.iav.petsheltermongodb.service;

import de.iav.petsheltermongodb.exception.PetNotFoundException;
import de.iav.petsheltermongodb.model.Pet;
import de.iav.petsheltermongodb.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PetService {
    private final PetRepository petRepository;


    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    public Optional<Pet> getPetById(String id){
        return petRepository.findById(id);
    }

    public List<Pet> getPetBySpecies(String species){
        return petRepository.findAllBySpeciesEqualsIgnoreCase(species);
    }

    public List<Pet> getPetOlderThan(int age){
        return petRepository.findAllByAgeAfter(age);
    }

    public List<Pet> getPetWhenNameBeginsWith (String name){
        return petRepository.findAllByNameStartingWith(name);
    }

    public Pet createPet(Pet petToAdd){
        return petRepository.save(petToAdd);
    }

    public Pet updatePet(String id, Pet petToUpdate){
        petRepository.findById(id).orElseThrow(()-> new PetNotFoundException(id));
        Pet updatedPet=petToUpdate.withId(id);

        return petRepository.save(updatedPet);
    }

    public void deletePet(String id){
        petRepository.deleteById(id);
    }
}
