package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class PetType extends BaseEntity{

    private String typeNameForPet;


    public String getTypeNameForPet() {
        return typeNameForPet;
    }

    public void setTypeNameForPet(String typeNameForPet) {
        this.typeNameForPet = typeNameForPet;
    }


}
