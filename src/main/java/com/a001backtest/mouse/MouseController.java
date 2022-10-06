package com.a001backtest.mouse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/mice")
public class MouseController {

    private MouseRepository mouseRepository;

    public MouseController(MouseRepository mouseRepository){
        this.mouseRepository = mouseRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<MouseModel>> getAllMice() {
    List<MouseModel> allMice = (List<MouseModel>) mouseRepository.findAll();
    return ResponseEntity.ok().body(allMice);
    }

}
