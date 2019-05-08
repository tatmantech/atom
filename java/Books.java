public class Books {
  String thisBook;

  public Books(String bestBook) {
    thisBook = bestBook;
  }

  public static void main(String[] args) {
    Books favoriteBook = new Books("Naked Lunch");
    Books favoriteAuthor = new Books("William Burroughs");
    System.out.print("My favorite book is " + favoriteBook.thisBook);
    System.out.println(" by my favorite author " + favoriteAuthor.thisBook);
  }
}
