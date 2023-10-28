package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {

    @NotNull (message = "please enter number")
    private Integer number;
    @NotNull (message = "please enter a name")
    @NotBlank (message = "please enter a name")
    private String name;

}
