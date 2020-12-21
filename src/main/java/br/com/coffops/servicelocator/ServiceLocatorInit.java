package br.com.coffops.servicelocator;

import br.com.coffops.servicelocator.enumeration.EnumStorageServiceType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ServiceLocatorInit {

    @Value("${storage.service.type}")
    private EnumStorageServiceType enumStorageServiceType;

    public static EnumStorageServiceType STORAGE_SERVICE_TYPE;

    @PostConstruct
    public void init(){
        STORAGE_SERVICE_TYPE = enumStorageServiceType;
        System.out.println("Variável configurada: "+ enumStorageServiceType.name());
    }

}
