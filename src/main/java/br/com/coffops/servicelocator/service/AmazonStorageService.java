package br.com.coffops.servicelocator.service;

import org.springframework.stereotype.Component;

@Component("AmazonStorageService")
public class AmazonStorageService implements IStorageService {

    public void save(String filePath, byte[] file) {
        System.out.println("Saving file using AmazonStorageService: "+filePath);
    }

    public byte[] download(String filePath) {
        System.out.println("Downloading file from AmazonStorageService: "+filePath);
        return new byte[0];
    }

    public void delete(String filePath) {
        System.out.println("Deleting file in AmazonStorageService: "+filePath);
    }

}
