package io.agrits.guestList.repositories;

import io.agrits.guestList.models.GuestList;
import io.agrits.guestList.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "lists", path = "lists")
public interface GuestListRepository extends JpaRepository<GuestList, Long>{
    Optional<GuestList> findOneById(Long id);
    Collection<GuestList> findAllByUser(User user);

    @Query(value = "SELECT * FROM guest_list WHERE SUBSTR(date, 1, 11) = :searched", nativeQuery = true)
    Collection<GuestList> findAllByDate(@Param("searched") String dateToFind);
}
