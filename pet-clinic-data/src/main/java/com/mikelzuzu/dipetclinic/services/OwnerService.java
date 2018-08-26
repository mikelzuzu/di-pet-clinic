package com.mikelzuzu.dipetclinic.services;

import com.mikelzuzu.dipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
