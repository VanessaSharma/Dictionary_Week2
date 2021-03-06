import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

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
    public void getUserWord_wordInstantiatesWithUserWord_apple() {
    Word myWord = new Word("apple");
    assertEquals("apple", myWord.getUserWord());
}
  @Test
  public void all_returnsAllWordsOfWord_true() {
    Word firstWord = new Word("apple");
    Word secondWord = new Word("banana");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromArrayList_0() {
    Word myWord = new Word("apple");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getId_wordInstantiatesWithAnId_1() {
   Word firstWord = new Word("apple");
   assertEquals(1, firstWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("apple");
    Word secondWord = new Word("banana");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }
  @Test
  public void getDefinition_initiallyReturnsEmptyList_ArrayList() {
    Word myWord = new Word("apple");
    assertEquals(0, myWord.getDefinition().size());
  }
  @Test
  public void addDefinition_addDefinitionsToWord_true() {
    Word myWord = new Word("apple");
    Definition myDefinition = new Definition("a delicious fruit");
    myWord.addDefinition(myDefinition);
    assertTrue(myWord.getDefinition().contains(myDefinition));
  }
}
