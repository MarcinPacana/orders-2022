package pl.edu.wszib.orders.consoleui;

import pl.edu.wszib.orders.api.order.OrderFacadeApi;
import pl.edu.wszib.orders.api.product.ProductFacadeApi;

import java.util.Scanner;

public class ConsoleUI {
    private final OrderFacadeApi orderFacadeApi;
    private final ProductFacadeApi productFacadeApi;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUI(final OrderFacadeApi orderFacadeApi,
                     final ProductFacadeApi productFacadeApi) {
        this.orderFacadeApi = orderFacadeApi;
        this.productFacadeApi = productFacadeApi;
    }

    public void run() {
        System.out.println("Wprowadź tekst: ");
        final String read = scanner.nextLine();
        System.out.println("Odczytano: " + read);
        // Główne menu:
        // 1. Utwórz zamówienie
        // 2. Wyszukaj zamówienie
        // 3. Dodaj produkt do zamówienia
        // 4. Usuń produkt z zamówienia
        // 0. Wyjście

        // 1. Identyfikator utworzonego zamówienia: ${orderId}

        // 2.1 Podaj identyfikator zamówienia: ${orderId}
        // 2.2 (odczytaj orderId)
        // 2.3 Znaleziono zamówienie: ${orderId}
        // 2.4 Wystąpił błąd: ${error}
        // 2.5 (powrót do głównego menu)

        // 3.1 Podaj identyfikator zamówienia: ${orderId}
        // 3.2 (odczytaj orderId)
        // 3.3 Wyświetl listę dostępnych produktów: ${allProducts}
        // 3.4 Podaj identyfikator produktu, który chcesz dodać do zamówienia: ${productId}
        // 3.5 Wyświetl zmodyfikowane zamówienie: ${order}
        // 3.6 Wystąpił błąd: ${error}
        // 3.7 (powrót do głównego menu)

        // 4. (na podstawie punktu 3)
        // 5. (Przerwanie pętli głównej programu)
    }
}
