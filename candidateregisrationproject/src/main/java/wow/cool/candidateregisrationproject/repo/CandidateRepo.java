package wow.cool.candidateregisrationproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wow.cool.candidateregisrationproject.entity.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Long> {

}
