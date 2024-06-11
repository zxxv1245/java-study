package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "타이타닉";
        movieReview1.review = "재밌었다.";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "대부";
        movieReview2.review = "인상 깊었다.";

        MovieReview[] movieReviews = {movieReview1,movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목 : " + movieReview.title + " 리뷰 : " + movieReview.review);
        }

    }
}
