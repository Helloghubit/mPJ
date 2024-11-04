public class recordsDTO {
    private String number;
    private String date;
    private String symptoms;

    public recordsDTO(){        };
    public recordsDTO(String number, String date, String symptoms) {
        this.number = number;
        this.date = date;
        this.symptoms = symptoms;
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

    @Override
    public String toString() {
        return "recordsDTO{" +
                "number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", symptoms='" + symptoms + '\'' +
                '}';
    }
}
