package com.example.simpleumsapiwebflux;

import com.example.simpleumsapiwebflux.entity.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@RequestMapping("/test")
@RestController
public class UmsController {

    @GetMapping
    public List<Event> test() {
        List<Event> list = new ArrayList<>();


        for (int i = 0; i <= 20; i++) {
            String name = null;
            String gun = null;
            int point;
            int r = (int) ((Math.random() * 10000) % 4);
            if (r == 0) name = "수지";
            else if (r == 1) name = "준희";
            else if (r == 2) name = "다혜";
            else if (r == 3) name = "윤석";

            r = (int) ((Math.random() * 10000) % 4);
            if (r == 0) gun = "소총";
            else if (r == 1) gun = "기관총";
            else if (r == 2) gun = "물총";
            else if (r == 3) gun = "샷건";

            point = (int) ((Math.random() * 10000) % 10);
            list.add(new Event(name, gun, point));
        }


        return list;
    }

}
