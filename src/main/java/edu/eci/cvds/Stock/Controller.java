package edu.eci.cvds.Stock;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProductRepository catalogue;


    @GetMapping("/Products")
    public List<Product> allProducts(){
        return catalogue.findAll();
    }

    @GetMapping("/product/{name}")
    public List<Product> findByName(@PathVariable("name") String name) {
        return catalogue.findByName(name);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return catalogue.save(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable int id ,@RequestBody Product product) {
        return catalogue.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        catalogue.deleteById(id);
    }
}
