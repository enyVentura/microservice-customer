package kashitsyn.evgeny.microservice.customer.domain.repository;

import kashitsyn.evgeny.microservice.customer.domain.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
