package lexicon.se.model;

public class TodoItemTask {


    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        setId(id);
        setTodoItem(todoItem);
        setAssignee(assignee);
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public boolean isAssigned() {
        return assigned;
    }


    private void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }


    public TodoItem getTodoItem() {
        return todoItem;
    }


    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }
        this.todoItem = todoItem;
    }


    public Person getAssignee() {
        return assignee;
    }


    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }


    public String getSummary() {
        return "Id: " + id + ", Assigned: " + assigned + ", TodoItem: [" + todoItem.getSummary() + "], Assignee: [" +
                (assignee != null ? assignee.getSummary() : "No assignee") + "]";
    }

}