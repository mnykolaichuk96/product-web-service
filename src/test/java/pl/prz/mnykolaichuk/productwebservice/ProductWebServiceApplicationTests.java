package pl.prz.mnykolaichuk.productwebservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
//junit5 zrozumi ze bedzie wykorzystany testcontainer do testow
@Testcontainers
class ProductWebServiceApplicationTests {
    // junit understand that  this is container
    @Container
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:6.0.4");

    @DynamicPropertySource      // doda propierties dynamicznie do kontenera
    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
        dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
    }
    /*
    * Test uruchomi mongodb kontainer sciagajac image: mongodb:6.0.4
    * Pobierze replikaset url i doda ten url do spring.data.mongodb.uri
    * */
    @Test
    void shouldCreateProduct() {

    }

}
