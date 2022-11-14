package ua.edu.ucu.apps.flower_store_web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.services.FlowerService;

import java.util.List;

@RestController //serves rest endpoints
@RequestMapping(path = "api/v1/flower")
public class FLowerController {
    private final FlowerService flowerService;

    @Autowired
    public FLowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping //rest endpoint
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
}
