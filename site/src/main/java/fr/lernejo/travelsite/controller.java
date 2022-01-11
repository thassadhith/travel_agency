package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controller {
    private final ArrayList<inscription> listinscription = new ArrayList<>();
    private final ArrayList<country> listcountry = new ArrayList<>();

    @GetMapping("/api/travels")
    public ArrayList<country> getList() {
        listcountry.add(new country("Caribbean", 32.4));
        listcountry.add(new country("Australia", 35.1));
        return listcountry;
    }
    @PostMapping("api/inscription")
    public void add(@RequestBody inscription insc) {
        this.listinscription.add(insc);
    }
}
