public class memberDTO {
    private String number;
    private String name;
    private String petName;
    private String city;
    private String breed;
    private int year;

    public memberDTO(){     };
    public memberDTO(String number, String name, String petName, String city, String breed, int year) {
        this.number = number;
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

    @Override
    public String toString() {
        return "memberDTO{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", petName='" + petName + '\'' +
                ", city='" + city + '\'' +
                ", breed='" + breed + '\'' +
                ", year=" + year +
                '}';
    }
}
