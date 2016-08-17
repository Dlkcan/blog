package wordPress;

public class TextPost extends Post {

	private String summary;

	public TextPost(String title, String body, String category) {

		super(title, body, category);
		if (body.length() > 10) {
			this.summary = body.substring(0, 10);
		} else {
			this.summary = body;
		}

	}

	public String getSummary() {
		return summary;
	}
}
