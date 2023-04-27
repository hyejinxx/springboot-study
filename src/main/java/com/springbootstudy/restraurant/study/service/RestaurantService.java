package com.springbootstudy.restraurant.study.service;

import com.springbootstudy.restraurant.study.dto.RestaurantDto;
import com.springbootstudy.restraurant.study.entity.Restaurant;
import com.springbootstudy.restraurant.study.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

    public List<Restaurant> findByCategory(String category){
        return restaurantRepository.findByCategory(category);
    }
    public Restaurant findById(long id){
        return restaurantRepository.findById(id);
    }
    public void registerRestaurant(RestaurantDto restaurant){
         restaurantRepository.registerRestaurant(restaurant);
    }
    public void updateRestaurant(long id, RestaurantDto restaurant){
         restaurantRepository.updateRestaurant(id, restaurant);
    }
    public void deleteRestaurant(long id){
         restaurantRepository.deleteRestaurant(id);
    }

}
