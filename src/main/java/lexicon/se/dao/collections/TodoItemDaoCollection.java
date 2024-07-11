package lexicon.se.dao.collections;


import lexicon.se.dao.interfaces.TodoItemDAO;
import lexicon.se.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class TodoItemDaoCollection implements TodoItemDAO {

    private List<TodoItem> todoItems;

    public TodoItemDaoCollection() {
        this.todoItems = new ArrayList<>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {

        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem item : todoItems) {
            if (item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItems);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> result = new ArrayList<>();
        for (TodoItem item : todoItems)
        {
            if (item.isDone() == done) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        List<TodoItem> result = new ArrayList<>();
        for (TodoItem item : todoItems) {
            if (item.getTitle().contains(title)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        List<TodoItem> result = new ArrayList<>();
        for (TodoItem item : todoItems) {
            if (item.getCreator().getId() == personId) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate end) {
        List<TodoItem> result = new ArrayList<>();
        for (TodoItem item : todoItems) {
            if (item.getDeadLine().isBefore(end)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate start) {
        List<TodoItem> result = new ArrayList<>();
        for (TodoItem item : todoItems) {
            if (item.getDeadLine().isAfter(start)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public void remove(int id) {
        todoItems.remove(id);
    }
}