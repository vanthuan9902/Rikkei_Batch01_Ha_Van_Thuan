package rikki.com.demo_springboot1.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import rikki.com.demo_springboot1.model.UserProduct;

public interface ProductRepository extends JpaRepository<UserProduct,String> {
}
