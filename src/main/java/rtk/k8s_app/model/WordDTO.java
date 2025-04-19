package rtk.k8s_app.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

public class WordDTO{
    Integer id;
    @NotBlank(message = "Word can not be blank")
    public String word;

    public WordDTO(Integer id, String word) {
        this.id = id;
        this.word = word;
    }
}
