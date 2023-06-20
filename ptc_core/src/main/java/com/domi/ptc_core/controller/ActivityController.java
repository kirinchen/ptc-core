package com.domi.ptc_core.controller;

import com.domi.ptc_core.model.Activity;
import com.domi.ptc_core.model.Reward;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "app/activity/")
public class ActivityController {


    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.PATCH)
    public Activity patch(@PathVariable String id, @RequestBody Activity reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Activity create(@RequestBody Activity reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Activity get(@PathVariable int id) {
        return null;
    }


}
