package app;

public class Book {

    private int id;

    private String title;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printBookIdWithTitle(){
        String idWithTitle = this.id + "-" + this.title;
        System.out.println(idWithTitle);
    }
}
