import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("apple");
    assertEquals(true, myWord instanceof Word);
}

  @Test
  public void Word_instantiatesWithUserWord_apple() {
    Word myWord = new Word("apple");
    assertEquals("apple", myWord.getUserWord());
}
  @Test
  public void all_returnsAllInstancesOfTask_true(); {
    Word firstWord = new Word("apple");
    Word secondWord = new Word("banana");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord);
 }
}
