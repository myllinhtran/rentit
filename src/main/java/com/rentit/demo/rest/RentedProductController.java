package com.rentit.demo.rest;

import com.rentit.demo.model.RentedProduct;
import com.rentit.demo.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/v1/accounts")
@CrossOrigin(origins = "http://localhost:3000")
public class RentedProductController {

    @Autowired
    private PlatformService platformService;

    @GetMapping(path = "/{id}/rentedProducts")
    public @ResponseBody
    Collection<RentedProduct> getRentedProductByAccount(@PathVariable("id") int id) {
        return platformService.findRentedProductByAccount(id);
    }
}
