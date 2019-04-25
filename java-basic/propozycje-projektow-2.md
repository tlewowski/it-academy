## Przetwarzanie strumieniowe plików CSV na podstawie przepisu użytkownika

### Wymagania

 - wejściem są 2 pliki z danymi:
   - plik z danymi do przetworzenia (CSV)
   - instrukcja przetwarzania danych
 - dla każdego wiersza z pliku z danymi należy wykonać wszystkie instrukcje z drugiego pliku
 - wynik należy zapisać do pliku
 - instrukcje powinny dopuszczać następujące operacje:
   - usunięcie kolumny z CSV
   - dodanie kolumny o stałej wartości
   - dodanie wartości w dwóch kolumnach i zapis do trzeciej
   - zmiana rozmiaru liter w danej kolumnie
   - usunięcie wiersza z danych
   - zmiana ciągu znaków w kolumnie na camelCase
 - można śmiało zignorować niepoprawne pliki CSV i pola zawierające przecinki
 - kolumny należy identyfikować po indeksie
 - listę instrukcji można rozszerzać
 
### Przykład

`data-in.csv`
```
Jan,kto je banany,100
Kasia,ja mam owce,200
Darek,on nie ma nic,1
```

`processing.txt`
UPPERCASE 0
CAMELCASE 1
ADD-CONSTANT 300 3
ADD 2 3 4
REMOVE 2
REMOVE 2

`data-out.csv`
```
JAN,ktoJeBanany,400
KASIA,jaMamOwce,500
```

## Generowanie raportów z plików CSV
### Wymagania
 - wejściem są 1 plik z danymi do przetworzenia (CSV)
 - plik zawiera wiersze z transakcjami. W każdym wierszu znajdują się:
   - nazwa produktu
   - cena za jaką został sprzedany
   - klasyfikacja klienta który go kupił
   - data transakcji
 - należy wygenerować raport z danych w tym pliku
 - powinny być dostępne następujące raporty:
   - średnia cena dla produktu
   - średni rozmiar transakcji dla danej klasy klienta
   - łączny dzienny utarg
   - łączny miesięczny utarg
   - porównanie utargu w kolejnych latach
 - typ raportu podaje użytkownik w wierszu poleceń
 - jeśli raport nie ma naturalnego porządku (np. chronologicznego), należy go uporządkować w kolejności malejącej wartości transakcji
 - raport wynikowy należy zapisać do pliku
 - można śmiało zignorować niepoprawne pliki CSV i pola zawierające przecinki
 - kolumny należy identyfikować po nazwie

### Przykład

`data-in.csv`
```
Jaja,100,Bogaty,11-11-2011
Sok,10,Artysta,11-11-2011
Sok,20,Bogaty,11-11-2011
Krowy,1000,Bogaty,03-02-2012
Koza,1500,Rolnik,12-04-2014
Koza,5000,Artysta,16-04-2014
```
`report-type=average-per-product`

`out.txt`
```
Koza,3250
Krowy,1000
Jaja,100
Sok,15
```
