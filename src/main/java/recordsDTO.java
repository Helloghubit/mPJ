public class recordsDTO {
    private String number;
    private String date;
    private String symptoms;
    private String name;
    private String petName;
    private String city;
    private String breed;
    private int year;

    @Override
    public String toString() {
        return "recordsDTO{" +
                "number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", name='" + name + '\'' +
                ", petName='" + petName + '\'' +
                ", city='" + city + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + year + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public recordsDTO(){        };

    public recordsDTO(String number, String date, String symptoms, String name, String petName, String city, String breed, int year) {
        this.number = number;
        this.date = date;
        this.symptoms = symptoms;
        this.name = name;
        this.petName = petName;
        this.city = city;
        this.breed = breed;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

}
