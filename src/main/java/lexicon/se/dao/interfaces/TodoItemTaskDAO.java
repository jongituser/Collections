package lexicon.se.dao.interfaces;

import lexicon.se.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO
{
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask>findAll();
    Collection<TodoItemTask>findByAssignedStatus(String status);
    Collection<TodoItemTask>findByPersonId(int personId);
    void remove(int id);
}
