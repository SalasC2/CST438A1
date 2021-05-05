package com.example.CST4381A;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.Date;

@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    @Size(min=3, max=25)
    private String title;
    
    @NotNull(message="Please select a value")
//    @Size(min=1, max=5)
    private Integer rating;
    
    @NotNull
    @Size(min=3, max=25)
    private String personName;
    
    private Date dateTime;
    
    public MovieRating() { 
        title = null;
        rating = null;
        personName = null;
        dateTime = null;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return this.title;
    }
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public Integer getRating() {
        return this.rating;
    }
    public void setRating(final Integer rating) {
        this.rating = rating;
    }
    
    public String getPersonName() {
        return this.personName;
    }
    
    public void setPersonName(final String personName) {
        this.personName = personName;
    }
    
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(final Date dateTime) {
        this.dateTime = dateTime;
    }
    
    public MovieRating(String title, Integer rating, String personName, Date dateTime ) { 
        super();
        this.title = title;
        this.rating = rating;
        this.personName = personName;
        this.dateTime = dateTime; 
    }
    
    
}
