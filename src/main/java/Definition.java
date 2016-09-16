import java.util.List;
import java.util.ArrayList;

public class Definition {
  private String mUserDefinition;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId;

public Definition(String userDefinition) {
  mUserDefinition = userDefinition;
  instances.add(this);
  mId = instances.size();
}
public String getUserDefinition() {
  return mUserDefinition;
}
public static List<Definition> all() {
  return instances;
}
public static void clear() {
  instances.clear();
}
public int getId() {
  return mId;
}
}
