package com.a001backtest;

import com.a001backtest.mouse.MouseModel;
import com.a001backtest.mouse.MouseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class A001BackTestApplication {
//0510 2022 jeghar lavet dette for at teste hvordan man forbinder to app-services på Azure.
//denne A001BackTest og den anden er A002FrontTest.
    public static void main(String[] args) {
        SpringApplication.run(A001BackTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(MouseRepository mouseRepository) {
        return (args) -> {
            final List<MouseModel> miceListOfData = new ArrayList<>();
            miceListOfData.add(new MouseModel("Mouse 1: Terminatoaro"));
            miceListOfData.add(new MouseModel("Mouse 2: MOAR TEROMEINAT"));
            miceListOfData.add(new MouseModel("msoue ttree: DEATH SEEKER"));
            mouseRepository.saveAll(miceListOfData);

        };
    }
}
