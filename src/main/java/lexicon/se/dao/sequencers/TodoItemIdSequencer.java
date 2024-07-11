package lexicon.se.dao.sequencers;

public class TodoItemIdSequencer
{

    private int currentId;


    TodoItemIdSequencer(int currentId)
    {

        this.currentId = currentId;
    }

    public int nextId()
    {
        return ++currentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {

        this.currentId = currentId;
    }


}
