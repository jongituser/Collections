package lexicon.se.dao.collections;
import lexicon.se.dao.interfaces.TodoItemTaskDAO;
import lexicon.se.model.TodoItemTask;

import java.util.Collection;
import java.util.List;

public class TodoItemTaskDaoCollection implements TodoItemTaskDAO
{

    private List<TodoItemTask> = todoItemTask;


    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return List.of();
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(String status) {
        return List.of();
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        return List.of();
    }

    @Override
    public void remove(int id) {

    }
}
