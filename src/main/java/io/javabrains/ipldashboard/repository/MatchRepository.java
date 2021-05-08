package io.javabrains.ipldashboard.repository;

import io.javabrains.ipldashboard.Data.Match;
import io.javabrains.ipldashboard.Data.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName, String teamName2, Pageable pageable);

    default List<Match> findLatestMatches(String teamName, int count){
        return getByTeam1OrTeam2OrderByDateDesc(teamName,teamName, PageRequest.of(0,count));
    }
}
