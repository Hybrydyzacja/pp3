public class BookTets {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.tittle = "Harry Potter and the Philosopher's Stone";
        book1.author = "J. K. Rowling";
        book1.numberOfPages = 223;
        book1.releaseYear = 1997;

        book1.printTittle();
        book1.printAuthor();
        book1.printPages();
        book1.printYear();
        book1.printCurrentPage();
        book1.isOpen();
        book1.openBook();
        book1.isOpen();
        book1.printCurrentPage();
        book1.nextPage();
        book1.printCurrentPage();
        book1.previousPage();
        book1.previousPage();
        book1.previousPage();
        book1.printCurrentPage();
        book1.closeBook();
        book1.isOpen();

        Book book2 = new Book();
        book2.tittle = "Krew Elfów";
        book2.tittle = "Andrzej Sapkowski";
        book2.numberOfPages = 340;
        book2.releaseYear = 1994;
    }
    
}
