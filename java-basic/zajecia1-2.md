## Przypomnienie 

 - nazwa "Java" bywa używana jako język programowania, ale też jako środowisko (JVM - Java Virtual Machine)
 - uruchomiona może być tylko klasa z metodą `static void main(String[] args)`, i ta metoda jest uruchamiana jako "program"
 - metoda	≈ funkcja
 - argument	≈ parametr
 - deklaracja zmiennej to `typ nazwa = wartość;`
 - przypisanie zmiennej to `nazwa = wartość;`. `wartość` musi być tego samego typu co zmienna
 - średniki są ważne
 - `==` to operator porównania dla typów podstawowych
 - `.equals` to funkcja porównująca ciągi znaków (`String`)
 - kod wykonywany pod warunkiem to `if(warunek){kod jeśli warunek == true;} else {kod jeśli warunek == false}`
 - Java ma 4 rodzaje pętli: `while(warunek) {kod}`, `do {kod} while (warunek);`, `for(zmienna; warunek; modyfikacja zmiennej){kod}`, `for(zmienna in kolekcja)`
 - metody statyczne można wywoływać na klasie
 - metody niestatyczne można wywoływać tylko na obiekcie
 - metody niestatyczne mogą używać zmiennych instancji (obiektu)
 - każdy obiekt ma swoją kopię zmiennych instancji (mogą mieć różne wartości)
 - nowe obiekty tworzy się z użyciem słowa kluczowego `new` (np. `new Animal()`)
 - obiekt może mieć konstruktor, czyli funkcję o nazwie takiej jak klasa która jest wywoływana przy użyciu `new`
 
## Inne źródła i linki

 - Środowisko Java (JDK) - oficjalna strona Oracle: https://www.oracle.com/technetwork/java/javase/downloads/index.html
 - IntelliJ - jedno z popularniejszych IDE: https://www.jetbrains.com/idea/
 - Oficjalna dokumentacja Javy (języka i środowiska): https://docs.oracle.com/en/java/javase/11/
 - IDE online (do różnych języków - wygodne do współdzielenia kodu, projekty można też eksportować do GitHuba): https://www.tutorialspoint.com/codingground.htm
 - Kompletny podręcznik (potencjalnie trudny!) - do kupienia np. tu: https://helion.pl/ksiazki/java-podstawy-wydanie-ix-cay-s-horstmann-gary-cornell,javpd9.htm#format/e lub do wypożyczenia np. tu: http://primo-48mbp.hosted.exlibrisgroup.com/primo_library/libweb/action/search.do?cs=frb&ct=frb&frbg=1914225940&fctN=facet_frbrgroupid&fctV=1914225940&doc=48MBP_MBP01000181179&lastPag=&lastPagIndx=1&rfnGrp=frbr&frbrSrt=date&frbrRecordsSource=Primo+Local&frbrJtitleDisplay=&frbrIssnDisplay=&frbrEissnDisplay=&frbrSourceidDisplay=48MBP_MBP01&vl(41007343UI0)=any&query=any%2Ccontains%2CJava.%20Podstawy&fn=search&indx=1&dscnt=1&search_scope=local_scope&scp.scps=scope%3A(48MBP_MBP01)&tb=t&vid=48MBP_VIEW&mode=Basic&onCampus=false&ct=search&institution=48MBP&srt=rank&tab=local_tab&dym=true&vl(freeText0)=Java.%20Podstawy&dum=true&fromLogin=true&dstmp=1551619595542&group=GUEST&fromDL
 - Dowolny inny podręcznik podstawowy do Javy
 - Stack Overflow (pytania i odpowiedzi na mnóstwo problemów programistycznych) - https://stackoverflow.com/questions/tagged/java
 - exercism.io - dużo różnego rodzaju ćwiczeń na różnych poziomach trudności - https://exercism.io/tracks/java

## Ćwiczenia

 - Utwórz program, który przyjmuje dwa argumenty z wiersza poleceń,
 a następnie drukuje je w formacie: `"pierwszy: <<pierwszy-argument>>, drugi: <<drugi-argument>>"`
 - Utwórz program, który przyjmuje kilka argumentów. 
 Jeśli pierwszym argumentem jest ciąg znaków "dodaj", drukuje sumę drugiego i trzeciego, w przeciwnym wypadku drukuje ciąg znaków `"Bye bye"`
 - Utwórz program, który przyjmuje kilka argumentów. 
 Jeśli pierwszym argumentem jest ciąg znaków "dodaj", zwraca sumę wszystkich pozostałych. 
 Jeśli pierwszym argumentem jest ciąg znaków "drukuj", drukuje drugi argument.
 W przeciwnym wypadku drukuje ciąg znaków "Bye bye"
 - Utwórz klasę `Cat`, przyjmującą jako argumenty konstruktora `String name` i `int meowCount`. Napisz metodę `meow` drukującą `"<<name>>: "` a następnie `meowCount` razy `"meow"`.
 W klasie `Main` utwórz przynajmniej 3 obiekty `Cat` z różnymi argumentami a następnie wywołaj na każdej z nich metodę `meow`. Jak zmieni się wynik, jeśli `meowCount` będzie zmienną klasy (`static`) a nie instancji?
