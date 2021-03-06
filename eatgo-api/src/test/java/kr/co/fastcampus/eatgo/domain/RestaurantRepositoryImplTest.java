package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RestaurantRepositoryImplTest {

    @Test
    void save() {
        RestaurantRepository repository = new RestaurantRepositoryImpl();
        int oldCount = repository.findAll().size();
        Restaurant restaurant = new Restaurant("BeRyong", "Seoul");
        repository.save(restaurant);
        assertThat(restaurant.getId(), is(1234L));
        int newCount = repository.findAll().size();
        assertThat(newCount - oldCount, is(1));

    }
}