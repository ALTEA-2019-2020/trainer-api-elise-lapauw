package com.miage.altea.trainer_api.controller;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    @Autowired
    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("")
    Iterable<Trainer> getAllTrainers(){
        return this.trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name){
        return  this.trainerService.getTrainer(name);
    }

    @PutMapping()
    Trainer updateTrainer(@RequestBody Trainer trainer) {
        return this.trainerService.updateTrainer(trainer);
    }
    @PostMapping()
    Trainer newTrainer(@RequestBody Trainer trainer) {
        return this.trainerService.createTrainer(trainer);
    }
    @DeleteMapping(value="/{name}")
    void deleteTrainer(@PathVariable String name) {
        this.trainerService.deleteTrainer(name);
    }

}