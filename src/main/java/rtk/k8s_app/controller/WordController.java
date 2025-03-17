package rtk.k8s_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rtk.k8s_app.model.WordDTO;
import rtk.k8s_app.service.WordService;
import rtk.k8s_app.utils.Logger;

@RestController
@RequestMapping("/v1")
@CrossOrigin
public class WordController {

    private final WordService service;

    public WordController(WordService service){
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<WordDTO> saveWord(@RequestBody WordDTO request){
        Logger.info("POST Save word API called");
        WordDTO response = service.saveWord(request);
        return ResponseEntity.ok(response);
    }
}
