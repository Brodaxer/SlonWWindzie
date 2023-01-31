# SlonWWindzie

Ćwiczenie

Załóżmy, że piszemy aplikację do obsługi windy i potrzebne jest nam w niej zabezpieczenie, które sprawdzi, czy waga osób, które się w niej znajdują nie jest zbyt duża.

Na początku zdefiniuj klasę, która reprezentuje jakąś osobę. Nie potrzebujemy tutaj żadnych danych osobowych, wystarczy nam identyfikator (np. kolejna liczba całkowita) oraz waga danej osoby.

Później stwórz klasę, która będzie reprezentowała windę. Do windy mogą wejść maksymalnie 4 osoby (ale może ich też być mniej). W klasie zdefiniuj pole, które będzie tablicą, do której można dodawać obiekty reprezentujące osoby. Pole powinno być prywatne, a dodawanie osób powinno odbywać się poprzez dedykowaną metodę add(). Jeżeli do windy będzie próbowała wsiąść piąta osoba, to wyświetl komunikat, że w windzie nie ma już miejsca.

Dodaj także metodę start(), która uruchamia windę. Zanim winda rozpocznie jednak podróż, powinna nastąpić weryfikacja całkowitego obciążenia windy. Jeżeli będzie ono większe niż 400kg, to powinien wyświetlić się komunikat o tym, że winda jest przeciążona (wraz z informacją o ile kilogramów). Jeżeli osoby w windzie ważą łącznie mniej niż 400kg, to wyświetl komunikat "winda wystartowała". Ostatnia metoda w klasie windy powinna symulować opróżnienie windy (wszystkie osoby wysiadają i na ich miejsce mogą wejść inne), po jej wywołaniu wyświetl komunikat, że winda jest pusta.

Przetestuj różne przypadki (dwie, cztery lub pięć osób wsiadających do windy, przekroczona waga, waga w normie, osoby wysiadające i wsiadające).
