package br.com.coffops.servicelocator.factory;

import br.com.coffops.servicelocator.service.IStorageService;

public interface IStorageServiceFactory {

    IStorageService getService(String type);

}
