package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CurdService<Vet, Long> {
    Vet findByLastName(String lastName);

}
