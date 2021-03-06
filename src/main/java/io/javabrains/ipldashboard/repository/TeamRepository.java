package io.javabrains.ipldashboard.repository;

import io.javabrains.ipldashboard.Data.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
}
