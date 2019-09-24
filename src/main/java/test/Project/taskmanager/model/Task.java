package test.Project.taskmanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@Table
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createDate = new Date();
    private String nameTask;
    private String text;

    public Task(Long id, String nameTask, String text) {
        this.id = id;
        this.nameTask = nameTask;
        this.text = text;
    }

    public Task(){}

    public Task(String nameTask, String text) {
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
}
