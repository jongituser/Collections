package lexicon.se.dao.sequencers;

public class ToDoItemTaskIdSequencer
{
    private int currentId;


    ToDoItemTaskIdSequencer(int currentId)
    {
        this.currentId = currentId;
    }

    public int nextId()
    {
        return currentId++;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

}
