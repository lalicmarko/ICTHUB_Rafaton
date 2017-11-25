package rafaton_com.example.rafaton.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "events_db")
@JsonIgnoreProperties
public class Event {
    @Id
    private String id;
    private String name;
    private String type;
    private String locale;
    private String url;
    private String info;
    private String date;
//    private String[] images;
    private Long userId;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public void setImages(String[] images) {
//        this.images = images;
//    }

    public String getId() {

        return id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocale() {
        return locale;
    }

    public String getUrl() {
        return url;
    }

    public String getInfo() {
        return info;
    }

    public String getDate() {
        return date;
    }

//    public String[] getImages() {
//        return images;
//    }

    @Override
    public String toString() {
        return "Name: " + name + " id:" + id;
    }
}
