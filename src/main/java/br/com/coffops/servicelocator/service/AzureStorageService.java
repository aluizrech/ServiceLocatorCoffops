package br.com.coffops.servicelocator.service;

import org.springframework.stereotype.Component;

@Component("AzureStorageService")
public class AzureStorageService implements IStorageService {

    public void save(String filePath, byte[] file) {
        System.out.println("Saving file using AzureStorageService: "+filePath);
    }

    public byte[] download(String filePath) {
        System.out.println("Downloading file from AzureStorageService: "+filePath);
        return new byte[0];
    }

    public void delete(String filePath) {
        System.out.println("Deleting file in AzureStorageService: "+filePath);
    }

}
