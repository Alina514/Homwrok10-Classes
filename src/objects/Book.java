package objects;

public class Book {
    private String author;
    private Integer pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Book(String author, Integer pages) {
        this.author = author;
        this.pages = pages;
    }
    public void displayInformation(){
        System.out.println("author " + author);
        System.out.println("pages" + pages);
    }

    @Override
    public String toString() {
        return "My books is written by " + author + " and has " + pages + " pages.";
    }
}
