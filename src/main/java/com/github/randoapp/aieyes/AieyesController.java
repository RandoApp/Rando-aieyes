package com.github.randoapp.aieyes;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/")
public class AieyesController {

    @ResponseBody
    @PostMapping("/")
    public String test(@RequestParam("file") MultipartFile file,
                       RedirectAttributes redirectAttributes) {
        org.deeplearning4j.nn.modelimport.keras.KerasModelImport.importKerasModelAndWeights();
        ComputationGraphConfiguration computationGraphConfig = KerasModelImport.importKerasModelConfiguration("PATH TO YOUR JSON FILE)


    }

}

