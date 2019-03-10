## Przypomnienie 

 - klasa to coś w rodzaju "matrycy" dla obiektów
 - klasy mogą mieć składowe (metody i zmienne) statyczne lub niestatyczne
 - statyczne zmienne istnieją tylko w jednym egzemplarzu w całej aplikacji
 - statyczne zmienne i metody muszą być oznaczane jako `static`
 - każdy obiekt ma własną kopię zmiennych niestatycznych
 - klasa dziedzicząca ma dostęp do wszystkich nie-prywatnych metod i zmiennych klasy bazowej
 - poziom dostępu `protected` oznacza "dla mnie i klas dziedziczących po mnie"
 - jeśli klasa bazowa nie ma domyślnego konstruktora, klasa potomna musi wywołać któryś z konstruktorów klasy bazowej jako pierwszą operację w swoim konstruktorze
 - konstruktor klasy bazowej wywołuje się za pomocą słowa kluczowego `super`
 - dziedziczenie oznacza się poprzez słowo kluczowe `extends`
 - można dziedziczyć po co najwyżej jednej klasie
 - do obiektu klasy `X` można się odwoływać przez referencję do klasy bazowej (tzn. jeśli `class X extends Y` to `Y y = new X()` jest poprawne)
 - wszystkie klasy dziedziczą po `java.lang.Object`
 - `new` alokuje nowy fragment pamięci i tworzy tam obiekt, po czym zwraca referencję (uchwyt) do tego obiektu
 - pamięć jest czyszczona kiedy nie ma do niej już żadnych referencji dostępnych dla kodu użytkownika
 - pamięć jest czyszczona automatycznie przez garbage collector (pracuje w tle, na ogół nie wymaga interwencji użytkownika)
 - słowo kluczowe `final` jest używane do zapewnienia niemutowalności (stałej wartości pola przez cały czas)
 - `final` zapewnia tylko płytką ("shallow") niemutowalność, tzn. "ta referencja cały czas wskazuje na ten sam obiekt", a nie "ta referencja wskazuje na obiekt, który się nie zmienia"
 - klasa potomna może *przeciążyć* metodę klasy bazowej implementując metodę o tej samej nazwie i sygnaturze (typach)
 - klasa nie musi definiować wszystkich funkcji które deklaruje
 - metoda zadeklarowana w klasie, ale nie zaimplementowana musi być oznaczona jako `abstract` (abstrakcyjna)
 - klasa zawierająca co najmniej jedną metodę oznaczoną jako `abstract` też musi być oznaczona jako `abstract` (abstrakcyjna)
 - nie można tworzyć obiektów klasy oznaczonej jako `abstract`
 - można tworzyć obiekty tylko klas *konkretnych*, tzn. takich, dla których wszystkie metody są podefiniowane
 - ze zdefiniowanych metod można wywoływać przeciążane (co prowadzi do wzorca *Template Method*)
 - dla danego obiektu zawsze wywoływana jest implementacja zaimplementowana najbliżej tej klasy (tzn. jeśli `X extends Y`, `Y extends Z` i `Z extends W` oraz `Z` i `Y` implementują metodę `f()`, to `new X().f()` wywoła implementację z `Y`)
 - interfejsy to specjalny rodzaj quasi-klas, które mogą wyłącznie deklarować metody publiczne
 - klasa może implementować dowolnie wiele interfejsów
 - składnia implementowania interfejsów to `X implements IF1, IF2 {...}`
 - można trzymać referencję do interfejsu (tzn. `X implements IF1`, `IF1 i = new X()` jest poprawne)
 
## Ćwiczenia

 - Utwórz program, który będzie przyjmował jako argument nazwę kształtu i jego parametry, a następnie wydrukuje pole powierzchi i obwód danej figury.
 Użyj klasy bazowej `PrintableShape` oraz interfejsów `HasArea` i `HasPerimeter`. Zaimplementuj co najmniej 3 dowolne figury.
 - Utwórz program, który będzie drukował instrukcję "help" dla programu Git-like. Program ma przyjmować 1 argument określający typ operacji do wykonania
 (np. `git pull`, `git commit` albo `git push` - wyczerpujący opis jest tutaj: https://git-scm.com/docs, ale wystarczą 3-4 komendy), a następnie wydrukować krótką instrukcję pomocy.
 Wykorzystać klasę bazową `Subprogram` z metodą `getHelpText()` i zaimplementować operacje jako klasy potomne (`Pull extends Subprogram` etc.). Zapewnić, że tekst pomocy nie zostanie przypadkowo zmieniony.
 
