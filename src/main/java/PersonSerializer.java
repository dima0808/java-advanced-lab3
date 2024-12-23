/**
 * The PersonSerializer class provides methods for manually serializing Person objects to JSON and
 * XML formats.
 */
public class PersonSerializer {

  /**
   * Serializes a Person object to JSON format.
   *
   * @param person the Person object to serialize
   * @return the JSON representation of the Person object
   */
  public static String toJson(Person person) {
    return String.format("{\"name\": \"%s\", \"age\": %d}", person.getName(), person.getAge());
  }

  /**
   * Serializes a Person object to XML format.
   *
   * @param person the Person object to serialize
   * @return the XML representation of the Person object
   */
  public static String toXml(Person person) {
    return String.format("<person><name>%s</name><age>%d</age></person>",
        person.getName(), person.getAge());
  }
}
