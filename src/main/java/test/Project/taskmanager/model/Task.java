package test.Project.taskmanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class Task implements Comparable<Task> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createDate;

    private String nameTask;
    private String text;

    public Task(){}

    public Task(String nameTask, String text) {
        this.nameTask = nameTask;
        this.text = text;
    }

    public Task(Long id, String nameTask, String text) {
        this.id = id;
        this.nameTask = nameTask;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Task{ " +
                "id = " + id +
                " name task = " + nameTask +
                " text = " + text +
                " create Date = " + createDate;
    }

    @Override
    public int compareTo(Task o) {
        return id.compareTo(o.id);
    }
}
