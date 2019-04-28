package com.aziflaj.todolist;

/**
 * Represents an item in a To Do list
 */
public class ToDoItem {

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * task ID
     */
    @com.google.gson.annotations.SerializedName("taskID")
    private String tiText;

    /**
     * task Name
     */
    @com.google.gson.annotations.SerializedName("taskName")
    private String mText;

    /**
     * task Status
     */
    @com.google.gson.annotations.SerializedName("taskStatus")
    private String tsText;

    /**
     * LayoutID
     */
    @com.google.gson.annotations.SerializedName("LayoutID")
    private String lText;

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("blockVal")
    private String bvText;



    /**
     * ToDoItem constructor
     */
    public ToDoItem() {

    }

    @Override
    public String toString() {
        return getText();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param text
     *            The item text
     * @param id
     *            The item id
     */
    public ToDoItem(String text, String id) {
        this.setText(text);
        this.setId(id);

    }

    public String getText() {
        return mText;
    }

    public String getId() {
        return mId;
    }

    public String getTID(){ return tiText;}

    public String getStatus() {return tsText;}

    public String getLID() { return lText;}

    public String getBV() {return bvText;}



    public final void setText(String text) {
        mText = text;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ToDoItem && ((ToDoItem) o).mId == mId;
    }
}