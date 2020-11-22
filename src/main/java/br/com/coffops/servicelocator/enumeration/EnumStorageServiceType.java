package br.com.coffops.servicelocator.enumeration;

import lombok.Getter;

public enum EnumStorageServiceType {

    LOCAL("LocalStorageService"),
    AZURE("AzureStorageService"),
    AMAZON("AmazonStorageService");

    @Getter
    private final String storageServiceName;

    EnumStorageServiceType(String storageServiceName) {
        this.storageServiceName = storageServiceName;
    }

}
