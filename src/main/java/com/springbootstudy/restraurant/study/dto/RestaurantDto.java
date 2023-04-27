package com.springbootstudy.restraurant.study.dto;

import com.springbootstudy.restraurant.study.entity.Category;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantDto {
    private String name;
    private Category category;
    private LocalDateTime createAt;

}
