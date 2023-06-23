package de.iav.petsheltermongodb.controller;

import de.iav.petsheltermongodb.model.Pet;
import de.iav.petsheltermongodb.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAllPets(){
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getPetById(@PathVariable String id){
        return petService.getPetById(id);
    }

    @PostMapping
    public Pet addPet(@RequestBody Pet petToAdd){
        return petService.createPet(petToAdd);
    }

    @PutMapping("/{id}")
    public Pet updatePet(@PathVariable String id, @RequestBody Pet pet){
        return petService.updatePet(id, pet);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable String id){
        petService.deletePet(id);
    }


}
