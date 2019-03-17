## Przypomnienie 

 - kod zamknięcia (exit code) to liczba od 0 do 255 zwracana przez aplikację przy zakończeniu
 - exit code 0 oznacza zakończenie z sukcesem, każda inna wartość oznacza błąd
 - *stos* to lista zawierająca informacje o tym jakie funkcje były wywoływane, w jakiej kolejności i jaki jest ich stan
 - *wyjątki* to sposób informowania kodu wywołującego o niespodziewanych sytuacjach
 - w przypadku Javy jest używany bardzo często, także dla błędów "typowych" (np. błąd parsowania przy konwersji ciągu znaków na liczbę)
 - w innych językach bywa używany rzadziej (np. wyłącznie dla sytuacji niespodziewanych lub krytycznych - brak pamięci, przepełnienie stosu itd.)
 - *wyjątkiem* jest dowolna klasa dziedzicząca po klasie `Exception`
 - wyjątek zgłasza się za pomocą słowa kluczowego `throw` (np. `throw new RuntimeException()`)
 - żeby obsłużyć wyjątek, kod który go zgłasza musi znajdować się w bloku `try { ... }`, natomiast typ wyjątku (lub któraś z jego klas bazowych)
 musi być wymieniona w sekwencji bloków `catch (ExceptionType e) { ... }`
 - zgłoszenie wyjątku przerywa wykonywanie aktualnej funkcji i odwija stos aż do miejsca, w którym wyjątek może być obsłużony
 - nieobsłużony wyjątek powoduje zamknięcie aplikacji z kodem błędu (standardowo 1)
 - jeśli kod ma wykonać się niezależnie od tego, czy funkcja zakończy się poprawnie czy zostanie przerwana wyjątkiem, musi znajdować się w bloku `finally { ... }`
 - typowe zastosowania dla bloku `finally` to zwalnianie zasobów - zamykanie plików, kończenie połączeń sieciowych, usuwanie plików tymczasowych itd.
 
## Ćwiczenia

 - utwórz hierarchię jednostek miar i kalkulator, umożliwiający przeliczanie pomiędzy różnymi systemami:
   - klasa bazowa dla wszystkich - `Unit` (może być interfejsem) - każda jednostka ma swój symbol i wartość oraz możliwość wydrukowania "się" (można do tego użyć dodatkowej klasy)
   - klasy dla podstawowych rodzajów miar - `Lenght`, `Mass` i `Time` - możliwa jest konwersja tylko pomiędzy jednostkami tego samego typu (masa na masę itd.)
   - klasy dla jednostek SI - `SILength` i `SIMass` (albo `Meter` i `Kilogram`)
   - klasy dla jednostek imperialnych - `ImperialLength` i `ImperialMass`  (albo `Foot` i `Pound`)
   - klasy dla jednostek wspólnych - `CommonTime` (albo `Second`)
   - klasę do obliczeń `UnitConverter` mającą statyczną metodę `Unit convert(Unit source, String toSymbol)`
   - w przypadku próby konwersji do nieznanej jednostki (np. `UnitConverter.convert(new Meter(1), "abc")`) powinien być zgłoszony wyjątek
  `UnknownUnitException` zawierający symbol, którego nie udało się przetłumaczyć na jednostkę
   - w przypadku próby konwersji pomiędzy rodzajami (np. długość na masę) powinien być zgłoszony wyjątek `IncompatibleConversionException` 
  zawierający informację jakie typy nie mogą być między sobą konwertowane
   - przeliczniki powinny być zdefiniowane w klasie `UnitConverter`
   - nie powinno być możliwości utworzenia obiektów `Lenght`, `Mass` i `Time`
