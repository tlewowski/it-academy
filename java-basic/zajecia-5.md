## Przypomnienie 

 - żeby porównywać obiekty za pomocą równości parametrów trzeba przeładować metodę `.equals`
 - `==` porównuje tożsamość (tzn. wskazywanie na ten sam obszar pamięci)
 - tablice to struktury o stałym rozmiarze, z dostępem wyłącznie za pomocą indeksów
 - `List` - typowa implementacja to to `ArrayList<Item>`
 - `ArrayList` umożliwia dostęp po indeksach tak jak tablica, ale automatycznie dostosowuje rozmiar do ilości elementów
 - `Map` - typowymi implementacjami są `HashMap<Key, Value>` i `TreeMap<Key, Value>`
 - Mapy umożliwiają dostęp do wartości po kluczu
 - `HashMap` polega na metodzie `hashCode`
 - `Set` - przechowuje tylko wartość, może być używany do deduplikacji. Typową implementacją jest `HashSet`
 
## Ćwiczenia

 - Utwórz klasę `Store` przechowującą listę obiektów na sprzedaż. Każdy obiekt ma nazwę i identyfikator.
 W osobnej kolekcji umieść mapowanie z identyfikatora na cenę.
 - W poprzedniej klasie dodaj funkcję sumującą koszt zakupów. Zakupy przekaż jako listę lub tablicę.
