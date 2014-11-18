package poolingpeople.prototype.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alacambra on 18.11.14.
 */
@Entity
public class Task {

    @Id
    @GeneratedValue
    String id;
    String title;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
