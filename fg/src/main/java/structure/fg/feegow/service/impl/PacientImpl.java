package structure.fg.feegow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import structure.fg.feegow.repositories.PacientRepository;
import structure.fg.feegow.service.Pacient;

@Service
public class PacientImpl implements Pacient {

    @Autowired
    private PacientRepository repository;

    @Override
    public void insertPacient(Pacient pacient) {
            
    }
}
