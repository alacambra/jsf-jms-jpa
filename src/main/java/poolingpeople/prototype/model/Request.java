package poolingpeople.prototype.model;

import javax.persistence.*;

/**
 * Created by alacambra on 18.11.14.
 */
@Entity
public class Request {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    User requester;

    @ManyToOne
    User requested;

    @ManyToOne
    Task task;

    public Task getTask() {
        return task;
    }

    public User getRequested() {
        return requested;
    }

    public User getRequester() {
        return requester;
    }

    public void setRequester(User requester) {
        this.requester = requester;
    }

    public void setRequested(User requested) {
        this.requested = requested;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
