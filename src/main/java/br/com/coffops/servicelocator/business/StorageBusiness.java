package br.com.coffops.servicelocator.business;

import br.com.coffops.servicelocator.ServiceLocatorInit;
import br.com.coffops.servicelocator.factory.IStorageServiceFactory;
import br.com.coffops.servicelocator.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageBusiness {

    private final IStorageService storageService;

    @Autowired
    public StorageBusiness(IStorageServiceFactory iStorageServiceFactory){
        this.storageService = iStorageServiceFactory.getService(ServiceLocatorInit.STORAGE_SERVICE_TYPE.getStorageServiceName());
    }

    public void save(String filePath, byte[] file) {
        this.storageService.save(filePath, file);
    }

    public byte[] download(String filePath) {
        return this.storageService.download(filePath);
    }

    public void delete(String filePath) {
        this.storageService.delete(filePath);
    }

}
