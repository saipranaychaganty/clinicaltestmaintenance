package cmt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cmt.store.model.TestStoreDetails;
import cmt.store.service.TestStoreDetailsService;

@SpringBootTest
class ClinicalMaintenanceApplicationTests {
@Autowired
TestStoreDetailsService tss;
	@Test
	void contextLoads() {
	}
	
	@Test
	void deletefromtable()
	{
		tss.deletebytesdetailsid(5);
	}

}
