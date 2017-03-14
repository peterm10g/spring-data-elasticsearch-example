package statut.example.spring.es.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;
import statut.example.spring.es.domain.Location;

@Repository
public interface ESLocationRepository extends ElasticsearchCrudRepository<Location, String> {

    @Query("{\"bool\":{\"filter\":{\"geo_distance\":{\"coordinates\":{\"lat\":?0,\"lon\":?1},\"distance\":\"?2\"}}}}")
    Page<Location> findByDistance(double latitude, double longitude, String distance, Pageable pageable);

}
