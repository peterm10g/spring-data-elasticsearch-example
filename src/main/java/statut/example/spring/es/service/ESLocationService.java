package statut.example.spring.es.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import statut.example.spring.es.domain.Location;
import statut.example.spring.es.repository.ESLocationRepository;

import java.util.List;

@Service
public class ESLocationService {
    private final ESLocationRepository repository;

    @Autowired
    public ESLocationService(ESLocationRepository repository) {
        this.repository = repository;
    }

    public String save(Location location) {
        return repository.save(location).getId();
    }

    public Location findOne(String id) {
        return repository.findOne(id);
    }

    public List<Location> findByDistance(double latitude, double longitude, String distance, int page, int size) {
        return repository.findByDistance(latitude, longitude, distance, new PageRequest(page, size)).getContent();
    }
}
