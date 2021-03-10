package rikki.com.demo_springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikki.com.demo_springboot1.Product.ProductRepository;
import rikki.com.demo_springboot1.model.UserProduct;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<UserProduct>listAll()
    {
        return repo.findAll();
    }
    public  void save(UserProduct product){
        repo.save(product);
    }
    public  UserProduct get(String makh){
        return  repo.findById(makh).get();
    }
    public  void delete(String makh)
    {
        repo.deleteById(makh);
    }
}
