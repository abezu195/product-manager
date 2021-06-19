package md.tekwill.dao;

import md.tekwill.entity.product.FoodCategory;
import md.tekwill.entity.product.Product;

import java.util.List;

public class JDBCProductRepository implements ProductRepository {


    @Override
    public void save(Product product) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void update(int id, double volume) {

    }

    @Override
    public void update(int id, FoodCategory category) {

    }

    @Override
    public void delete(int id) {

    }
}
