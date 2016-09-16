import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new myDefinition("a fruit");
    assertEquals(True, myDefinition instanceof Definition);
  }
  @Test
  public void getUserDefinition_definitionInstantiatesWithUserDefinition_apple() {
    Definition myDefinition = new Definition("a fruit");
    assertEquals("a fruit", myDefinition.getUserDefinition());
  }
  @Test
  public void all_returnsDefinitionsOfDefinition_true() {
    Definition firstDefinition = new Definition("a fruit");
    Definition secondDefinition = new Definition("a delicious fruit");
    assertEquals(true, Definition.all().contains(firstDefinition));
    assertEquals(true, Definition.all().contains(secondDefinition));
  }
  @Test
  public void clear_emptiesAllDefinitionsFromList_0() {
    Definition myDefinition = new Definition("a fruit");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
  @Test
  public void getId_definitionsInstantiatesWithId_1() {
    Definition myDefinition = new Definition("a fruit");
    assertEquals(1, myDefinition.getId());
  }
  @Test
  public static Definition find(int id) {
    return definitions.get(id - 1);
  }
}
