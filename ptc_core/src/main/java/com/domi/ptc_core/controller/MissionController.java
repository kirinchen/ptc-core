package com.domi.ptc_core.controller;


import com.domi.ptc_core.model.Activity;
import com.domi.ptc_core.model.Mission;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "app/mission/")
public class MissionController {



    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.PATCH)
    public Mission patch(@PathVariable String id, @RequestBody Mission reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Mission create(@RequestBody Mission reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Mission get(@PathVariable int id) {
        return null;
    }


}
