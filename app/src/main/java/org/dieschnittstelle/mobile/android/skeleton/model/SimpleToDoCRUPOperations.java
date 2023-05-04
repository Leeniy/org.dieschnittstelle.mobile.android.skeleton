package org.dieschnittstelle.mobile.android.skeleton.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleToDoCRUPOperations implements IToDoItemCRUDOperations{

    private static long idcounter = 0;
    private List<ToDoItem> items = new ArrayList<>();

    public SimpleToDoCRUPOperations(){
        Arrays.asList("ron", "rita", "george", "harry").forEach(name -> createToDoItem(new ToDoItem(name)));
    }
    @Override
    public ToDoItem createToDoItem(ToDoItem item) {
        item.setId(++idcounter);
        items.add(item);
        return item;
    }

    @Override
    public List<ToDoItem> readAllToDoItems() {
        return items;
    }

    @Override
    public ToDoItem readToDoItem(long id) {
        return null;
    }

    @Override
    public boolean updateToDoItem(ToDoItem item) {
        return false;
    }

    @Override
    public boolean deleteToDoItem(long id) {
        return false;
    }
}
