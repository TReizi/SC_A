package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControllerSecurity {

    @GetMapping("/" )
    public String getInfoForAllEmps(){
        return "view_for_all_emplayees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view_for_hr";
    }


    @GetMapping("/manager_info")
    public String getInfoOnlyForManager(){
        return "view_for_managers";

    }

}
