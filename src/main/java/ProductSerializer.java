/**
 * The ProductSerializer class provides methods for manually serializing Product objects to JSON and
 * XML formats.
 */
public class ProductSerializer {

  /**
   * Serializes a Product object to JSON format.
   *
   * @param product the Product object to serialize
   * @return the JSON representation of the Product object
   */
  public static String toJson(Product product) {
    return String.format("{\"id\": %d, \"title\": \"%s\", \"product\": \"%s\"}",
        product.getId(), product.getTitle(), product.getCategory());
  }

  /**
   * Serializes a Product object to XML format.
   *
   * @param product the Product object to serialize
   * @return the XML representation of the Product object
   */
  public static String toXml(Product product) {
    return String.format("<product><id>%d</id><title>%s</title><category>%s</category></product>",
        product.getId(), product.getTitle(), product.getCategory());
  }
}
