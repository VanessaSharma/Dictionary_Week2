import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mUserWord;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;

public Word(String userWord) {
  mUserWord = userWord;
  instances.add(this);
  mId = instances.size();
}
public String getUserWord() {
  return mUserWord;
 }
public static List<Word> all() {
  return instances;
}
public static void clear() {
  instances.clear();
}
public int getId() {
  return mId;
}
public static Word find(int id) {
  return instances.get(id - 1);
}

}
