package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * oontroller
 * data layer from user interface
 * handle server related data,e.g http request
 *docker push whispering-earth-31297.herokuapp.com/web  image name of this file to push on heroku
**/
@RestController ///anotate using rest controller //point sepecific poin
@RequestMapping(path = "index")
public class MyDemo {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public
    @ResponseBody
    String index() {
        return "hello";
    }

    @RequestMapping(path = "details", method = RequestMethod.GET)
    public
    @ResponseBody
    String showDetails() {
        return "hello";
    }


}
