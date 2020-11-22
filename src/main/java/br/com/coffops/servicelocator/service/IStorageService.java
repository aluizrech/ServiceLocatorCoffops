package br.com.coffops.servicelocator.service;

public interface IStorageService {

    void save(String filePath, byte[] file);
    byte[] download(String filePath);
    void delete(String filePath);

}
