package br.com.coffops.servicelocator;

import br.com.coffops.servicelocator.business.StorageBusiness;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceLocatorApplicationTests {

	@Autowired
	private StorageBusiness storageBusiness;

	public static final String fakeFilePath = "/home/coffops/file.pdf";

	@Test
	@DisplayName("Save test example")
	void save() {
		this.storageBusiness.save(fakeFilePath, new byte[0]);
	}

	@Test
	@DisplayName("Download test example")
	void download() {
		this.storageBusiness.download(fakeFilePath);
	}

	@Test
	@DisplayName("Delete test example")
	void delete() {
		this.storageBusiness.delete(fakeFilePath);
	}

}
