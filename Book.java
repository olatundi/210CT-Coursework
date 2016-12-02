
public class Book {
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + iSBN + ", publication_date="
				+ publication_date + "]";
	}

	public Book(String title, String author, int iSBN, String publication_date) {
		super();
		this.title = title;
		this.author = author;
		this.iSBN = iSBN;
		this.publication_date = publication_date;
	}

	private String title;
	private String author;
	private int iSBN;
	private String publication_date;
	
	public int getISBN(){
		return iSBN;
	}
	public void setISBN(int i){
		this.iSBN = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book ("Java", "John Born", 2453889, "21/2/1957");
		System.out.println(b1);
	}

}
