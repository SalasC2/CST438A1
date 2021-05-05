package com.example.CST4381A;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieRating, Long> {
    @Query("select m from MovieRating m order by title, dateTime desc")
    List<MovieRating> findAllMovieRatingsOrderByTitleDesc();
}