package io.agrits.guestList.controllers;

import io.agrits.guestList.repositories.GuestListRepository;
import io.agrits.guestList.repositories.ParticipantRepository;
import io.agrits.guestList.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final UserRepository userRepository;
    @Qualifier("lists")
    private final GuestListRepository guestListRepository;
    private final ParticipantRepository participantRepository;

    @Autowired
    public MainController(UserRepository userRepository,
                          ParticipantRepository participantRepository,
                          GuestListRepository guestListRepository){
        this.userRepository = userRepository;
        this.guestListRepository = guestListRepository;
        this.participantRepository = participantRepository;
    }
}
