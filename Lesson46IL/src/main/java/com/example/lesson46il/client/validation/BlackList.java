package com.example.lesson46il.client.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class BlackList {
    private List<String> blacklist = new ArrayList<>(List.of("yellow", "orange", "green"));
}
