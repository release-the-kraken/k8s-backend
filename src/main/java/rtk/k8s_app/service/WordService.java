package rtk.k8s_app.service;

import org.springframework.stereotype.Service;
import rtk.k8s_app.model.Word;
import rtk.k8s_app.model.WordDTO;
import rtk.k8s_app.repository.WordRepository;
import rtk.k8s_app.utils.Logger;
import rtk.k8s_app.utils.Mapper;

@Service
public class WordService {
    private final WordRepository repository;
    private final Mapper mapper;

    public WordService(WordRepository repository,
                       Mapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    public WordDTO saveWord(WordDTO dto){
        Word word = mapper.mapToWord(dto);
        word = repository.save(word);
        Logger.info("Word %s saved successfully with id %s".formatted(word.word, word.id));
        return mapper.mapToWordDTO(word);
    }
}
