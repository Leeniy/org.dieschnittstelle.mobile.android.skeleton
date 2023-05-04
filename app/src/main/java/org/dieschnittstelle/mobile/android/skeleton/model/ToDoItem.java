package org.dieschnittstelle.mobile.android.skeleton.model;

import java.io.Serializable;
import java.util.Objects;

public class ToDoItem implements Serializable {


    private long id;
    private String name;
    private String description;
    private boolean checked;

    public ToDoItem(){
    }

    public ToDoItem(String name){
        this();
        this.name= name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return id == toDoItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
