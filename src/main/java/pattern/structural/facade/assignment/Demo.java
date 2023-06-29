package pattern.structural.facade.assignment;

public class Demo {
  public static void show() {
    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(AccessToken.getAccessToken());
  }
}
