package br.com.coffops.servicelocator.service;

import org.springframework.stereotype.Component;

@Component("LocalStorageService")
public class LocalStorageService implements IStorageService {

    public void save(String filePath, byte[] file) {
        System.out.println("Saving file using LocalStorageService: "+filePath);
    }

    public byte[] download(String filePath) {
        System.out.println("Downloading file from LocalStorageService: "+filePath);
        return new byte[0];
    }

    public void delete(String filePath) {
        System.out.println("Deleting file in LocalStorageService: "+filePath);
    }

}
