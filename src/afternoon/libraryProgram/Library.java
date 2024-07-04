package afternoon.libraryProgram;

import java.util.Scanner;

public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        this.bookCount = 0;
    }

    public void addBook() {
        if(bookCount == LIBRARY_SIZE) {
            System.out.println("더 이상 책을 보관할 수 없습니다.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 제목을 입력하세요 : ");
        String inputTitle = scanner.nextLine();

        System.out.print("책 저자을 입력하세요 : ");
        String inputAuthor = scanner.nextLine();

        books[bookCount] = new Book(inputTitle, inputAuthor);
        bookCount++;
        System.out.println("보관된 책의 수 : " + bookCount);
    }
    public void showBooks(){
        if(bookCount == 0) {
            System.out.println("*** 보관된 책이 존재하지 않습니다. ***");
        }
        System.out.println("=== 책 목록 출력 ===");
        System.out.println("*** 총 보관 책의 수는 : "+bookCount+" 입니다. ***");
        for(int i = 0; i < bookCount; i++) {
            System.out.println((i+1)+". 제목 : "+books[i].title+" / 저자 : "+books[i].author);
        }
    }

    public void removeBook() {
        if(bookCount==0){
            System.out.println("보관된 책이 존재하지 않습니다..");
            return;
        }
        books[bookCount] = null;
        bookCount--;
        System.out.println("*** 가장 오래된 책이 삭제되었습니다. ***");
    }

    static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
