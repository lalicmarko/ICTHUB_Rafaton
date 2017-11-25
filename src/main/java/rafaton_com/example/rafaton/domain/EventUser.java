package rafaton_com.example.rafaton.domain;

public class EventUser {
    private Event event;
    private Long userId;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Long getUserId() {
        return userId;
    }

    public Event getEvent() {
        return event;
    }
}
