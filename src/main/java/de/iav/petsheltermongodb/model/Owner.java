package de.iav.petsheltermongodb.model;

import java.util.List;

public record Owner(String id,
                    String name,
                    List<Pet> pets) {
}
