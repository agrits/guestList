package io.agrits.guestList.repositories;

import io.agrits.guestList.models.GuestList;
import io.agrits.guestList.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Long>{
    Optional<Participant> findOneById(Long id);
    Collection<Participant> findAllByGuestList(GuestList guestList);
}
