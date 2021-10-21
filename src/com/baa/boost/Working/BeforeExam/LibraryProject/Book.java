package com.baa.boost.Working.BeforeExam.LibraryProject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	
	// book_id;isbn;authors;original_publication_year;original_title;title;language_code;average_rating
	
	String bookId;
	String isbn;
	String author;
	String publishYear;
	String orgBookTitle;
	String bookTitle;
	String languageCode;
	String averageRating;
	
	@Override
	public String toString() {
		return "" + bookId + "." + "[bookId=" + bookId + ", isbn=" + isbn + ", author=" + author + ", publishYear="
				+ publishYear + ", orgBookTitle=" + orgBookTitle + ", bookTitle=" + bookTitle + ", languageCode="
				+ languageCode + ", averageRating=" + averageRating + "]";
	}
	
}
