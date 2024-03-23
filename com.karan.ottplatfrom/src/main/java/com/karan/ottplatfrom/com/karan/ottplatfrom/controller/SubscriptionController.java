package com.karan.ottplatfrom.com.karan.ottplatfrom.controller;

import com.karan.ottplatfrom.com.karan.ottplatfrom.model.RegistoreModel.subscription.SubscriptionModel;
import com.karan.ottplatfrom.com.karan.ottplatfrom.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    @PostMapping("/subscribe")
    public ResponseEntity<SubscriptionModel> subscribe(@RequestBody SubscriptionModel model){
        return service.subscribe(model);
    }
}
