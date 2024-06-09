package com.springboot.coffee.mapper;

import com.springboot.coffee.dto.CoffeeDto;
import com.springboot.coffee.entity.Coffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeeDto.Post requestBody);
    Coffee coffeePatchDtoToCoffee(CoffeeDto.Patch requestBody);
    CoffeeDto.Response coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeDto.Response> coffeesToCoffeeResponseDtos(List<Coffee> coffees);
}
