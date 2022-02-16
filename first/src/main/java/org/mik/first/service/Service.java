package org.mik.first.service;

import org.mik.first.domain.Client;

public interface Service<T extends Client> {

    void pay(T t);

    void receiveService(T t);

}
