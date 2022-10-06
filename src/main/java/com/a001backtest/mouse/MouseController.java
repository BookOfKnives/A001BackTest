package com.a001backtest.mouse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
