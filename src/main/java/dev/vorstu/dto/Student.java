package dev.vorstu.dto;

public class Student {
    public  Student() {}

    public Student (Long id, String title, String fio, String category, String country, String city, String year, String text){
        this (title, fio, category, country, city, year, text);
        this.id = id;
    }

    public Student ( String title, String fio, String category, String country,String  city, String year, String text) {
        this.title = title;
        this.fio = fio;
        this.category = category;
        this.country = country;
        this.city = city;
        this.year = year;
        this.text = text;
    }

    private Long id;
    private String title;
    private String fio;
    private String category;
    private String country;
    private String city;

    private String year;
    private String text;


    public Long getId() {return id;}
    public  void setId (Long id) {this.id = id;}
    public String getTitle(){
        return title;
    }
    public String getFio(){
        return fio;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setFio(String fio){
        this.fio = fio;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country) {
        this.category = country;
    }
    public String getCity(){
        return this.city;
    }

    public void setCity(String country) { this.city = city; }


    public String getYear(){
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.year = text;
    }

}
