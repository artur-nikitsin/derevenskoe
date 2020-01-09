package by.berdmival.derevenskoe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
@RequestMapping(path = "/testimages")
public class TestController {
    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/{id}/{img}")
    public ModelAndView getImages(ModelAndView modelAndView, @PathVariable String img, @PathVariable String id) {
        modelAndView.addObject("src",
                new File(uploadPath).getAbsolutePath() + File.separator +
                id + File.separator + img
        );
        modelAndView.setViewName("images.html");
        return modelAndView;
    }
}
