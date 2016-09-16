import java.util.List;
import java.util.ArrayList;

public class Definition {
  private String mUserDefinition;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId;
  private List<Word> mWord;


public Definition(String userDefinition) {
  mUserDefinition = userDefinition;
  instances.add(this);
  mId = instances.size();
  mWord = new ArrayList<Word>();
}
public String getUserDefinition() {
  return mUserDefinition;
}
public static ArrayList<Definition> all() {
  return instances;
}
public static void clear() {
  instances.clear();
}
public int getId() {
  return mId;
}
public List<Definition> getDefinition() {
  return mDefinition;
}
public void addWord(Word word) {
  mWord.add(word);
}
}
