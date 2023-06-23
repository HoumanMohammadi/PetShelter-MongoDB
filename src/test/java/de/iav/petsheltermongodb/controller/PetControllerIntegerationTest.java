package de.iav.petsheltermongodb.controller;

import de.iav.petsheltermongodb.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class PetControllerIntegerationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PetRepository petRepository;

    @Test
    @DirtiesContext
    void getAllPets_whenApiCalledAndListIsEmpty_thenExpectStatusOkAndReturnEmptyListAsJson() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/pets"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("[]"));
    }

    @Test
    void getPetById() {
    }

    @Test
    void searchPet() {
    }

    @Test
    void addPet() {
    }

    @Test
    void updatePet() {
    }

    @Test
    void deletePet() {
    }
}