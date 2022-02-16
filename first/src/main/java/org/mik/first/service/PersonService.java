package org.mik.first.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mik.first.domain.Person;

public class PersonService implements Service<Person>{

    private static final Logger LOG= LogManager.getLogger();
    private static final Boolean DEBUG_TEMPORARY=false;

    private static PersonService instance;

    private PersonService() {
    }

    @Override
    public void pay(Person person) {

    }

    @Override
    public void receiveService(Person person) {

    }

    public synchronized static PersonService getInstance() {
        if (instance==null) {
            instance = new PersonService();
        }

        return instance;
    }
}
