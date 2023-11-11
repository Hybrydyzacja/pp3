public class Book {
    String tittle;
    String author;
    int numberOfPages;
    int releaseYear;
    int currentPage;
    boolean isOpen;

    public void printTittle() {
        System.out.println(tittle);
    }

    public void printAuthor() {
        System.out.println(author);
    }

    public void printPages () {
        System.out.println(numberOfPages);
    }

    public void printYear() {
        System.out.println(releaseYear);
    }

    public void isOpen(){
        if (isOpen == true) {
            System.out.println("Book is open");
        } 
        else {
            System.out.println("Book is closed");
        }
    }

    public void openBook(){
        isOpen = true;
    }

    public void closeBook(){
        isOpen = false;
    }

    public void printCurrentPage() {
        if (isOpen == false) {
            System.out.println("First open the book");
        }
        else {
            System.out.println("Current Page: " + currentPage);
        }
    }

    public void nextPage(){
        if (currentPage < numberOfPages){
            currentPage++;
        }
    }

    public void previousPage(){
        if (currentPage > 0){
            currentPage--;
        }
    }

}
