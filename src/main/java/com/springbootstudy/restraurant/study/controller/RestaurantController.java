package com.springbootstudy.restraurant.study.controller;

import com.springbootstudy.restraurant.study.dto.RestaurantDto;
import com.springbootstudy.restraurant.study.entity.Restaurant;
import com.springbootstudy.restraurant.study.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RequiredArgsConstructor
@RequestMapping("api/restaurant")
@RestController
public class RestaurantController {
    private Logger logger = Logger.getLogger(RestaurantController.class.getName());
    RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<Restaurant>> getRestaurantList(){
        logger.info("getRestaurantList");
        List<Restaurant> restaurants = restaurantService.findAll();
        return new ResponseEntity<List<Restaurant>>(restaurants, HttpStatus.OK);
    }

    @GetMapping("/search/category/{category}")
    public ResponseEntity<List<Restaurant>> getRestaurantByCategory(@PathVariable("category") String category){
        logger.info("getRestaurantByName");
        List<Restaurant> restaurants = restaurantService.findByCategory(category);
        return new ResponseEntity<List<Restaurant>>(restaurants, HttpStatus.OK);

    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") long id){
        logger.info("getRestaurantById");
        Restaurant restaurant = restaurantService.findById(id);
        return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<Void> registerRestaurant(RestaurantDto restaurant){
        logger.info("registerRestaurant");
        restaurantService.registerRestaurant(restaurant);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Void> updateRestaurant(long id, RestaurantDto restaurant){
        logger.info("updateRestaurant");
        restaurantService.updateRestaurant(id, restaurant);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteRestaurant(long id){
        logger.info("deleteRestaurant");
        restaurantService.deleteRestaurant(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
