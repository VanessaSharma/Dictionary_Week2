import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mUserWord;
  private static List<Word> words = new ArrayList<Word>();
  private int mId;
  private List<Definition> mUserDefinition2;

public Word(String userWord) {
  mUserWord = userWord;
  words.add(this);
  mId = words.size();
  mUserDefinition2 = new ArrayList<Definition>();
}
public String getUserWord() {
  return mUserWord;
 }
public static List<Word> all() {
  return words;
}
public static void clear() {
  words.clear();
}
public int getId() {
  return mId;
}
public static Word find(int id) {
  return words.get(id - 1);
}

}
