import io.chucknorris.client.ChuckNorrisClient;

public class ChuckNorris {

	public static void main(String[] args) {
		
		ChuckNorrisClient client = new ChuckNorrisClient();
		System.out.println(client.getRandomJoke().getValue());
		
	}

}
