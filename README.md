# Repozytorium do zajęć z Hibernate w SDA
Poniższe zadania zakładają, że mamy zaimportowaną bazę world_x.sql

Zadania:
1. Utworzyć następujące modele (na razie bez uwzględniania relacji):
   - Model dla encji City
   - Model dla encji Country
2. Dodać do powyższych informacje o relacjach.
3. Napisać programy realizujące, przy pomocy HQL, następujące zadania (najpierw w wersji "na sztywno", później z parametrem):
   - Wyświetlić wszystkie państwa wraz z ich kodami
   - Wyświetlić wszystkie miasta z zadanego kraju wraz z ich regionami
4. Utworzyć model dla CountryLanguage
5. Napisać i przetestować zapytania w HQL realizujące następujące zadania:
   - znalezienie nazw wszystkich miast w zadanym regionie
   - znalezienie państw wraz z ich dwuliterowymi kodami bez pobierania innych danych
   - znalezienie państw posiadających jeden używany język
   - znalezienie państw posiadających jeden oficjalny język
   - znalezienie wszystkich państw, w których mówi się w zadanym języku
   - znalezienie wszystkich państw, w których zadany język jest urzędowy
   - znalezienie państwa o najmniejszej liczbie powiązanych miast
   - znalezienie państwa o największej liczbie języków
   - znalezienie średniej ilośći języków używanych we wszystkich państwach
   - znalezienie średniej ilośći miast powiązanych ze wszystkimi państwami
 6. Dodać miasto do dowolnego państwa
 7. Zmienić stolićę dowolnego państwa
 8. Usunąć dowolne miasto
 9. Usunąć dowolne państwo
 10. Utworzyć nowe państwo i dodać do niego jedno miasto - w charakterze stolicy
 11. Dodać do utworzonego państwa dwa nowe miasta.
