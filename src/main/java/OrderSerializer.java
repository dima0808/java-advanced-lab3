/**
 * The OrderSerializer class provides methods for manually serializing Order objects to JSON and XML
 * formats.
 */
public class OrderSerializer {

  /**
   * Serializes an Order object to JSON format.
   *
   * @param order the Order object to serialize
   * @return the JSON representation of the Order object
   */
  public static String toJson(Order order) {
    return String.format("{\"orderNumber\": \"%s\", \"price\": %.2f}",
        order.getOrderNumber(), order.getPrice());
  }

  /**
   * Serializes an Order object to XML format.
   *
   * @param order the Order object to serialize
   * @return the XML representation of the Order object
   */
  public static String toXml(Order order) {
    return String.format("<order><orderNumber>%s</orderNumber><price>%.2f</price></order>",
        order.getOrderNumber(), order.getPrice());
  }
}
