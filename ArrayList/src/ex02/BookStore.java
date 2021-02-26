package ex02;

public class BookStore {
		
		// Attributes
		private String title;
		private String author;
		private int code;
		private String genre;
		private float price;
		
		// Constructors
		
		public BookStore() {
			super();
		}

		public BookStore(String title, String author, int code, String genre, float price) {
			super();
			this.title = title;
			this.author = author;
			this.code = code;
			this.genre = genre;
			this.price = price;
		}
		
		// Getters and Setters
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
		
		
		// Others Methods
		
		public String print() {
			return "Title: " + title + "\nAuthor: " + author +
					"\nCode: "+ code + "\nGenre:" + genre +
					String.format("\n $ %f.2", price);
		}
		
		
		
}
