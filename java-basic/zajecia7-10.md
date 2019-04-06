## Przypomnienie

### Wyliczenia

 - typ wyliczeniowy definiujemy przez słowo kluczowe `enum` (zamiast `class`)
 - w ciele typu wyliczeniowego znajduje się lista wartości dostępnych dla tego typu
 - typ wyliczeniowy może mieć konstruktor - w takim przypadku wszystkie wartości na liście muszą być wywołane z odpowiednimi parameterami
 - obiekty typu wyliczeniowego można tworzyć np. za pomocą `.valueOf`
 - istnieje tylko jeden obiekt każdego z elementów wyliczenia, tzn. jeśli jednym z parametrów jest obiekt, wszystkie użycia tego elementu korzystają z tej samej instancji obiektu
 
### Testy

 - żeby pisać zautomatyzowane testy w Javie należy użyć specjalnych bibliotek - standardowo jest to jUnit4 lub jUnit5
 - żeby oznaczyć metodę jako testową potrzeba oznaczyć ją adnotacją @Test
 - w teście powinny znajdować się tzw. asercje, czyli sprawdzenia czy zachowanie kodu jest zgodne z oczekiwaniami (np. wartość zwrócona jest zgodna z oczekiwaną)
 - w klasie może znajdować się dowolnie dużo testów i metod pomocnicznych (np. przygotowujących dane testowe)

### Odczyt z plików

 - do obsługi plików służy obecnie głównie pakiet `java.nio`
 - ścieżkę do plików reprezentuje się za pomocą obiektu typu `Path`, tworzonego przez `Paths.get`
 - małe pliki można odczytywać na raz, np. za pomocą `Files.realAllLines`
 - duże pliki trzeba odczytywać strumieniem, np. za pomocą `Files.newInputStream`
 - strumienie można konsumować za pomocą skanerów (`Scanner`) krok po kroku
 - wywołanie `.next` na obiekcie skanera powoduje odczyt kolejnego elementu i przesunięcie kursora - poprzedni element przestaje być dostępny w strumieniu
 - strumień typowo kończy się symbolem ASCII EOF (niedrukowalny - koniec pliku)

## Ćwiczenia

### Biblioteczka

 - utwórz typ wyliczeniowy zawierający rodzaje książek (kryminał, popularnonaukowa itd.)
 - utwórz klasę reprezentującą książkę - tytuł, autora, gatunek
 - utwórz (ręcznie) plik zawierający całą biblioteczkę w formacie:
 
```
tytul-ksiazki-1,autor-ksiazki-1,gatunek-ksiazki-1
tytul-ksiazki-2,autor-ksiazki-2,gatunek-ksiazki-2
tytul-ksiazki-3,autor-ksiazki-3,gatunek-ksiazki-3
tytul-ksiazki-4,autor-ksiazki-4,gatunek-ksiazki-4
tytul-ksiazki-5,autor-ksiazki-5,gatunek-ksiazki-5
```

 - pobierz od użytkownika z linii komend gatunek
 - wypisz wszystkie książki z biblioteki mające dany gatunek
