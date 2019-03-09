package pack;

public class Massive {
	int quantityOfPages;
	int sizeOfBook;
	boolean isIntresting;
	double weight;

	public void getQuantityOfPages(int quantityOfPages) {
		this.quantityOfPages = quantityOfPages;
	}

//	public void getsizeOfBook (String sizeOfBook) {
//		this.sizeOfBook = sizeOfBook;
//	}
	public void getisIntresting(boolean isIntresting) {
		this.isIntresting = isIntresting;
	}

	public void getweight(double weight) {
		this.weight = weight;
	}
	
	

	public void setsizeOfBook(int sizeOfBook) {
		this.sizeOfBook = sizeOfBook;
	}

	public int getsizeOfBook() {
		return 0;
	}

}
