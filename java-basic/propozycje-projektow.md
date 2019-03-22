## Parser linii komend

### Zadanie
 - wspieramy 3 typy argumentów:
   - bezparametrowe (tzw. flagi, np. `--abc`, `-a`, `-h`)
   - jednoparametrowe (np. `--abc=123`, `-a=g`)
   - wieloparametrowe (np. `--abc=123,123,123`, `-a=abc,def,ghi`)
 - w argumentach wieloparametrowych parametry są oddzielone przecinkiem
 - wszystkie parametry to wyłącznie litery i cyfry
 - znak `=` nie może się pojawić wewnątrz parametru
 - nazwy argumentów to zawsze wyłącznie litery
 - argument nie może pojawić się w wywołaniu więcej niż raz (np. `--abc --abc` jest niepoprawne) - należy wtedy zgłosić wyjątek
 - nazwy argumentów nie zawierają poprzedzających myślników (tzn. nazwą `--abc` jest `abc`)
 - musimy mieć możliwość sprawdzenia, czy w wywołaniu znaleziono dany argument
 - jeśli argument znaleziono, musimy mieć możliwość pobrania go - zakładamy, że użytkownik wie czy argument jest flagą, jednoargumentowy
 czy wieloargumentowy
 
### Propozycja implementacji

to tylko propozycja, oczywiście dowolna inna działająca implementacja też jest OK

 - klasa bazowa `CmdArg` mająca pole z nazwą
 - po niej dziedziczą:
   - `FlagArg`
   - `SingleArg` mająca pole z wartością argumentu
   - `MultiArg` mająca pole z listą powiązanych wartości
 - przetwarzamy argument po argumencie zaczynając od 1 - przetworzone trzymamy w mapie indeksowanej nazwą
 - najpierw usuwamy znaki `-` z przodu, potem szukamy znaku `=`
 - jeśli znaku nie ma - mamy do czynienia z flagą, sprawdzamy czy nazwa jest poprawna, jeśli tak - dodajemy
 - podczas dodawania sprawdzamy, że nie ma jeszcze argumentu o tej nazwie
 - jeśli jest znak `=` - oddzielamy nazwę argumentu od wartości, sprawdzamy poprawność nazwy i sprawdzamy ile jest wartości
 - jeśli w wartości występują przecinki, dzielimy ją w punktach przecinków na wiele wartości i tworzymy `MultiArg`
 - w przeciwnym razie tworzymy `SingleArg`
 - użytkownik ma prawo zapytać o istnienie danego argumentu
 - użytkownik ma prawo pobrać argument jako `SingleArg` lub `MultiArg` (pobieranie `FlagArg` nie ma sensu)
 - jeśli użytkownik pobiera `SingleArg` jako `MultiArg` - powinien otrzymać `MultiArg` z jednym argumentem
 - jeśli użytkownik pobiera `MultiArg` jako `SingleArg` - powinniśmy rzucić błędem
 - jeśli użytkownik pobiera `FlagArg` - powinniśmy rzucić błędem

## Silnik reguł

### Zadanie
 - zaimplementuj produkt - co najmniej nazwa i cena
 - zaimplementuj prosty koszyk zakupowy (np. jako tablicę produktów)
 - zaimplementuj kasjera - klasę liczącą łączny koszt zakupów
 - zaimplementuj reguły przyznawania rabatów:
   - jeśli w koszyku jest więcej niż 1 przedmiot danego typu - na każdy kolejny rabat wynosi o 10% więcej niż na poprzedni
   - jeśli w koszyku znajdują się przedmioty o nazwach zaczynających się na tę samą literę alfabetu - rabat na najtańszu 
   - jeśli łączna wartość po rabatach na pojedyncze przedmioty przekracza 100.0 - 10% rabatu
 - łączny rabat na dowolny produkt może wynosić maksymalnie 50%
 - łączny rabat na cały koszyk może wynosić maksymalnie 40%
 - musi dać się łatwo dodawać nowe reguły rabatowania bazujące na koszyku
 - reguły odnoszące się do kosztu całego koszyka muszą być aplikowane później, niż te odnoszące się do pojedynczych produktów - jeśli
 ten warunek nie jest spełniony, aplikacja powinna rzucić wyjątek w czasie konfiguracji
 - musi być możliwość włączania i wyłączania reguł rabatowania za pomocą konfiguracji z wiersza poleceń
 - może być włączonych naraz kilka reguł - wtedy są aplikowane po kolei, następne z uwzględnieniem wyników poprzednich
 
### Propozycja implementacji

to tylko propozycja, oczywiście dowolna inna działająca implementacja też jest OK

 - produkt - klasa o dwóch polach (`String nazwa`, `double cena`)
 - koszyk - tablica produktów (`ArrayList<Product>`)
 - kasjer - klasa z metodą `.calculateTotal(Cart c)`
 - reguła rabatowania - klasa abstrakcyjna z metodą `ArrayList<Product> calculatePrices(ArrayList<Product>)`
 - poszczególne reguły - podklasy
 - limit rabatu powinien ocenić kasjer
 - konfiguracja z wiersza poleceń - nazwy przypisane regułom, kolejne nazwy oznaczają dodanie reguły rabatowej w danej kolejności, 
 np. `countRebate totalRebate` oznacza aplikowanie najpierw reguły obniżającej ceny kolejnych produktów tego samego typu, a później 
 reguły obniżającej łączną cenę koszyka. Reguła alfabetyczna pozostaje wyłączona.
 - kasjer ma listę reguł do aplikowania jako zmienną instancji
