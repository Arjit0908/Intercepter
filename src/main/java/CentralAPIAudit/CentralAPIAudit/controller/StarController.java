package CentralAPIAudit.CentralAPIAudit.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TeamJoyti")
public class StarController {


    @PostMapping("/display")
    public String display(){
        Double.parseDouble("cwjhd");
        return "selected ";
    }

    @PostMapping("/interns")
    public String interns(){
        return "selected ";
    }
}
