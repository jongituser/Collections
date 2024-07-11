package lexicon.se.dao.interfaces;

import lexicon.se.model.TodoItem;
import lexicon.se.model.TodoItemTask;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItemDAO
{
    TodoItem persist(TodoItem todoItem);
    TodoItem findById(int id);
    Collection<TodoItem>findAll();
    Collection<TodoItem>findAllByDoneStatus(boolean done);
    Collection<TodoItem>findByTitleContains(String title);
    Collection<TodoItem>findByPersonId(int personId);
    Collection<TodoItem>findByDeadlineBefore(LocalDate end);
    Collection<TodoItem>findByDeadlineAfter(LocalDate start);
    void remove(int id);

}
