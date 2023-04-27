package com.springbootstudy.restraurant.study.repository;

import com.springbootstudy.restraurant.study.dto.RestaurantDto;
import com.springbootstudy.restraurant.study.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    public List<Restaurant> findAll();
    public List<Restaurant> findByCategory(String category);
    public Restaurant findById(long id);
    public void registerRestaurant(RestaurantDto restaurant);
    public void updateRestaurant(long id, RestaurantDto restaurant);
    public void deleteRestaurant(long id);


}
