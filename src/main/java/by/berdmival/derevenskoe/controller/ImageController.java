package by.berdmival.derevenskoe.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Controller
@RequestMapping
public class ImageController {
    @Value("${upload.path}")
    private String uploadPath;

    @ApiOperation(value = "Testing of loading images from server")
    @GetMapping("/testimg/{type}/{id}/{img}")
    public ModelAndView testImage(
            ModelAndView modelAndView, @PathVariable String img, @PathVariable String id, @PathVariable String type
    ) {
        modelAndView.addObject("id", id);
        modelAndView.addObject("img", img);
        modelAndView.addObject("type", type);
        modelAndView.setViewName("images.html");
        return modelAndView;
    }

    @ApiOperation(value = "Load images from server for type owner with id owner and image name")
    @GetMapping(value = "/img/{type}/{id}/{img}")
    public ResponseEntity<byte[]> getImage(
            @PathVariable String id, @PathVariable String img, @PathVariable String type
    ) throws IOException {
        return ResponseEntity.ok(
                Files.readAllBytes(
                        new File(
                                uploadPath + "/" + type + "/" + id + "/" + img
                        ).toPath()
                )
        );
    }
}
