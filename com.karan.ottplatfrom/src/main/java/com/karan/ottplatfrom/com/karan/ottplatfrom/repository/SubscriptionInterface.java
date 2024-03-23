package com.karan.ottplatfrom.com.karan.ottplatfrom.repository;

import com.karan.ottplatfrom.com.karan.ottplatfrom.model.RegistoreModel.subscription.SubscriptionModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionInterface extends MongoRepository<SubscriptionModel,Long> {
}
