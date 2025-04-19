package rtk.k8s_app.utils;

import org.springframework.stereotype.Component;
import rtk.k8s_app.model.Word;
import rtk.k8s_app.model.WordDTO;

@Component
public class Mapper {
    public WordDTO mapToWordDTO(Word word){
        return new WordDTO(word.id, word.word);
    }

    public Word mapToWord(WordDTO dto){
        return new Word().setWord(dto.word);
    }
}
