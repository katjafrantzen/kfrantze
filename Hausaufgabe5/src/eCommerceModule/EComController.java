package eCommerceModule;

public class EComController {

	public static void main(String[] args) {

		try {
			ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
			Profile profile = new Profile(info);
			Customer customer = new Customer(profile, 123);
			System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
		} catch (InvalidShippingInfoException e) {
			System.err.println("Invalid shipping information: " + e.getMessage());
		} catch (MissingShippingInfoException e) {
			System.err.println("Missing shipping information " + e.getMessage());
		} catch (InvalidCustomerException e) {
			System.err.println("Invalid customer data: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An unexpected error occured : " + e.getMessage());
		}
		// System.out.println("Shipping to: " +
		// customer.getProfile().getShippingInfo().getCity());
	}
}

/*
 * Dieser Code ist ein Beispiel für dependency injection, da Customer sein
 * Attribut (Profilobjekt) von außen bekommt.
 * 
 * Der Code bricht die Regel von Dementer, weil sie eine Verkettung an Calls
 * enthält. Eine Lösung wäre es, in jeder Klasse Methoden zu implementieren, die
 * die entsprechenden Informationen zurückgibt. Zum Beispiel die Methode
 * getCity() in der Customer-Klasse.
 */

/*
 * Wenn eine Exception geworfen wird, aber nicht gefangen wird, wird sie an die
 * aufrufende Methode weitergegeben (progagiert). Wenn sie bis zur JVM nicht
 * gefangen wird, wird das Programm mit einer Fehlermeldung beendet. Vortiele
 * des Fangens spezifischer Exceptions: Man kann für jeden Fehlertyp spezifische
 * Maßnahmen ergreifen. Es ist offensichtlich, welcher Fehler erwartet wird.
 * Vermeidung von ungewolltem Fangen anderer Exceptions, die anders behandelt
 * werden sollten.
 */
