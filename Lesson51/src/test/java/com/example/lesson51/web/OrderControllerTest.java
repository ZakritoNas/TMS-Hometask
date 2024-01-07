package com.example.lesson51.web;

import com.example.lesson51.domain.Order;
import com.example.lesson51.domain.Product;
import com.example.lesson51.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @MockBean
    private OrderService orderService;

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    void saveOrder() throws Exception {
        Order order = new Order (1, Product.CAR, 2, 240000L);

        Mockito.when(orderService.save(eq(Product.CAR), eq(2))).thenReturn(order);
        var json = mapper.writeValueAsString(order);

        mockMvc.perform(post("/order")
                    .content(json)
                    .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", CoreMatchers.is(order.getId())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.product", CoreMatchers.is(order.getProduct().name())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.quantity", CoreMatchers.is(order.getQuantity())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.count", CoreMatchers.is(order.getCount())));
    }
}