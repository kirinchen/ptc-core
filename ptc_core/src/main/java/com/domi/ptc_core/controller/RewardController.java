package com.domi.ptc_core.controller;

import com.domi.ptc_core.model.Reward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "app/reward/")
public class RewardController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.PATCH)
    public Reward patch(@PathVariable String id, @RequestBody Reward reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Reward create(@RequestBody Reward reward) {
        return reward;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Reward get(@PathVariable int id) {
        return null;
    }


    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "{userId}", method = RequestMethod.GET, params = "type=user")
    public Page<Reward> listByUserId(@PathVariable int userId, @RequestParam int page, @RequestParam int size) {
        Pageable paging = PageRequest.of(page, size);
        return null;
    }
}
