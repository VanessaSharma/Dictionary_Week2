import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mUserWord;
  private static List<Word> instances = new ArrayList<Word>();

public Word(String userWord) {
  mUserWord = userWord;
  instances.add(this);
}
public String getUserWord() {
  return mUserWord;
 }
}
