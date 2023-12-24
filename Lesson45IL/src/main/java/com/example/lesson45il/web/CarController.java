package com.example.lesson45il.web;

import com.example.lesson45il.dto.CarDto;
import com.example.lesson45il.dto.IlError;
import com.example.lesson45il.service.CarService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/store/cars")
@OpenAPIDefinition(info = @Info(
        title = "This is controller to process car request",
        description = "The controller allows save and search for cars",
        version = "0.0.1"
))
public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto){
        return service.save(dto);
    }

    @GetMapping("/{id}")
    @Operation(tags = "search",
    description = "Method to search car by ID",
    responses = {
            @ApiResponse(
                    responseCode = "200",
                    description = "car search was successful",
                    content = @Content (
                            mediaType = "application/json",
                            schema = @Schema (
                                    implementation = CarDto.class
                            )
                    )

            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "non-existent ID",
                    content = @Content (
                            mediaType = "application/json",
                            schema = @Schema (
                                    implementation = IlError.class
                            )
                    )
            )
    })
    public CarDto find(@PathVariable(name = "id") Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<CarDto> findAll(){
        return service.findAll();
    }
}
