package wow.cool.candidateregisrationproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wow.cool.candidateregisrationproject.entity.ActivePosition;
import wow.cool.candidateregisrationproject.repo.ActivePositionRepo;

import java.util.List;

@Service
public class ActivePositionService {

    @Autowired
    ActivePositionRepo repo;

    public List<ActivePosition> getAllActivePositions() {

        List<ActivePosition> activePositionList = repo.findAll();

        return activePositionList;
    }

    public ActivePositionService() {
    }

    public ActivePosition findActivePositionById(long id) {

        ActivePosition activePosition = repo.findById(id).orElse(null);

        return activePosition;
    }

    public ActivePosition saveActivePosition(ActivePosition newActivePosition) {

        return repo.save(newActivePosition);

    }

    public long findHighestID() {

        long temp_max = 1;

        for (ActivePosition i: getAllActivePositions()) {
            if (i.getId() > temp_max) {
                temp_max = i.getId();
            }
        }

        return temp_max;
    }

}
