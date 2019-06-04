package app.service;

import app.model.Cat;
import app.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    private PagedListHolder<Cat> catsPage;


    public PagedListHolder<Cat> getAllCats(int page) {
        if (page == 0) {
            List<Cat> cats = catRepository.findAll();
            Collections.shuffle(cats);

            catsPage = new PagedListHolder<>(cats);
            catsPage.setPageSize(2);
        }

        catsPage.setPage(page);

        return catsPage;
    }

    public void sendVote(Cat cat) {
        cat.setVotes(cat.getVotes() + 1);
        catRepository.save(cat);
    }

    public List<Cat> getTop10() {
        return catRepository.findTop10ByOrderByVotesDesc();
    }
}
