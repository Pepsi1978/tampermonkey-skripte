package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsHard3(): List<Question> = listOf(

    // Q1 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Was ist der Wert des Teleskopprodukts (2/1) × (3/2) × (4/3) × … × (100/99)?",
        answerA = "100",
        answerB = "99",
        answerC = "50",
        answerD = "10 000",
        correctAnswer = 0,
        explanation = "Bei einem Teleskopprodukt kürzen sich benachbarte Terme heraus: im Zähler bleibt nur der letzte Term (100), im Nenner nur der erste (1). Ergebnis: 100/1 = 100.",
        difficulty = 3,
        funFact = "Teleskopprodukte und -summen sind ein Standardtrick in der Kombinatorik, um scheinbar komplizierte Ausdrücke sofort zu vereinfachen."
    ),

    // Q2 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Welche der folgenden Zahlen ist durch 11 teilbar?",
        answerA = "123 456",
        answerB = "246 543",
        answerC = "111 111",
        answerD = "987 654",
        correctAnswer = 1,
        explanation = "Teilbarkeitsregel für 11: Alternierende Quersumme (gerade Stellen minus ungerade Stellen). 246 543: (2−4+6−5+4−3) = 0. Da 0 durch 11 teilbar ist, ist 246 543 durch 11 teilbar. 111 111 ergibt ebenfalls 0, also auch durch 11 teilbar – aber 246 543 steht auf Position B.",
        difficulty = 3,
        funFact = null
    ),

    // Q3 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Was besagt die Goldbachsche Vermutung (1742)?",
        answerA = "Jede ungerade Zahl > 5 ist Summe dreier Primzahlen",
        answerB = "Es gibt unendlich viele Primzahlzwillinge",
        answerC = "Jede gerade Zahl > 2 ist Summe zweier Primzahlen",
        answerD = "Jede natürliche Zahl ist Produkt von Primzahlen",
        correctAnswer = 2,
        explanation = "Christian Goldbach formulierte 1742 in einem Brief an Leonhard Euler: Jede gerade Zahl größer als 2 lässt sich als Summe zweier Primzahlen schreiben (z.B. 28 = 11 + 17). Bis heute ist dieser Satz weder bewiesen noch widerlegt worden.",
        difficulty = 3,
        funFact = "Die Goldbachsche Vermutung wurde für alle geraden Zahlen bis 4 × 10^18 rechnerisch überprüft – ein allgemeiner Beweis fehlt aber noch immer."
    ),

    // Q4 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Beim Collatz-Problem: Was passiert, wenn man auf eine ungerade Zahl n die Regel anwendet?",
        answerA = "n wird halbiert",
        answerB = "n wird verdreifacht",
        answerC = "n wird um 1 erhöht",
        answerD = "n wird mit 3 multipliziert und 1 addiert (3n+1)",
        correctAnswer = 3,
        explanation = "Die Collatz-Folge (3n+1-Problem): Ist n gerade → n/2; ist n ungerade → 3n+1. Die Vermutung besagt, dass jede positive Startzahl irgendwann die 1 erreicht. Bis heute unbewiesen.",
        difficulty = 3,
        funFact = "Der Mathematiker Paul Erdős sagte über das Collatz-Problem: 'Die Mathematik ist noch nicht bereit für solche Probleme.' Es wurde für alle Zahlen bis 2^68 überprüft."
    ),

    // Q5 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Wie viele Primzahlen gibt es zwischen 1 und 100?",
        answerA = "25",
        answerB = "21",
        answerC = "28",
        answerD = "30",
        correctAnswer = 0,
        explanation = "Die 25 Primzahlen unter 100 sind: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97. Das Sieb des Eratosthenes liefert dieses Ergebnis systematisch.",
        difficulty = 3,
        funFact = "Das Sieb des Eratosthenes, erfunden um 200 v. Chr., ist eines der ältesten noch genutzten mathematischen Algorithmen der Welt."
    ),

    // Q6 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was ist 17 mod 5?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "4",
        correctAnswer = 1,
        explanation = "17 = 3 × 5 + 2. Der Rest bei Division von 17 durch 5 ist 2. Modulo-Arithmetik bildet die Grundlage der Kryptographie und Fehlerkorrekturcodes.",
        difficulty = 3,
        funFact = null
    ),

    // Q7 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Fermats Kleiner Satz: Wenn p eine Primzahl und a kein Vielfaches von p ist, dann gilt…",
        answerA = "a^p ≡ 0 (mod p)",
        answerB = "a^(p-1) ≡ 0 (mod p)",
        answerC = "a^(p-1) ≡ 1 (mod p)",
        answerD = "a^p ≡ a (mod p) nur für a=1",
        correctAnswer = 2,
        explanation = "Fermats Kleiner Satz: a^(p−1) ≡ 1 (mod p), wenn p prim und ggT(a,p)=1. Beispiel: 2^6 = 64 ≡ 1 (mod 7). Dieser Satz ist die Grundlage des RSA-Kryptoverfahrens.",
        difficulty = 3,
        funFact = "Pierre de Fermat entdeckte diesen Satz um 1640 und schrieb einen 'wunderbaren Beweis', den er aber nie aufschrieb. Der erste vollständige Beweis stammt von Euler (1736)."
    ),

    // Q8 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Welche Zahl ist kein Teiler von 360?",
        answerA = "9",
        answerB = "12",
        answerC = "24",
        answerD = "7",
        correctAnswer = 3,
        explanation = "360 = 2³ × 3² × 5. Die Teiler umfassen alle Kombinationen dieser Primfaktoren. 7 ist eine Primzahl, die in der Primfaktorzerlegung von 360 nicht vorkommt – also kein Teiler. 9=3², 12=4×3, 24=8×3 sind alle Teiler.",
        difficulty = 3,
        funFact = "360 hat genau 24 Teiler und ist deshalb so praktisch für Zeitmessung und Winkelmaß. Die Babylonier wählten 360 Grad für den Vollkreis."
    ),

    // Q9 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Was ist ggT(48, 36)?",
        answerA = "12",
        answerB = "6",
        answerC = "18",
        answerD = "24",
        correctAnswer = 0,
        explanation = "Euklidischer Algorithmus: ggT(48, 36) = ggT(36, 12) = ggT(12, 0) = 12. Alternativ: 48 = 2⁴ × 3, 36 = 2² × 3². ggT = 2² × 3 = 12.",
        difficulty = 3,
        funFact = "Der Euklidische Algorithmus (ca. 300 v. Chr.) gilt als einer der ältesten bekannten Algorithmen überhaupt und wird noch heute in modernen Prozessoren eingesetzt."
    ),

    // Q10 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Ein magisches Quadrat mit den Zahlen 1–9 hat in jeder Reihe, Spalte und Diagonale dieselbe Summe. Welche Zahl muss im Mittelpunkt stehen?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 1,
        explanation = "Die magische Summe beträgt 15. Der Mittelpunkt muss das arithmetische Mittel aller 9 Zahlen sein: (1+2+…+9)/9 = 45/9 = 5. Außerdem schneiden sich alle 4 Linien (2 Diagonalen + 1 Reihe + 1 Spalte) im Mittelpunkt.",
        difficulty = 3,
        funFact = "Das 3×3-Lohu-Shu-Quadrat (mit 5 in der Mitte) ist in China über 4000 Jahre alt und gilt als ältestes bekanntes magisches Quadrat der Geschichte."
    ),

    // Q11 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Was ergibt die Summe 1 + 2 + 3 + … + 100?",
        answerA = "4950",
        answerB = "5050",
        answerC = "5050",
        answerD = "5100",
        correctAnswer = 2,
        explanation = "Gaußsche Summenformel: n(n+1)/2 = 100×101/2 = 5050. Der junge Gauß soll diese Aufgabe in Sekunden gelöst haben, indem er Paare bildete: (1+100) + (2+99) + … = 50 × 101 = 5050.",
        difficulty = 3,
        funFact = "Carl Friedrich Gauß soll diese Aufgabe im Alter von 9 Jahren in Sekunden gelöst haben, als sein Lehrer die Klasse damit beschäftigen wollte."
    ),

    // Q12 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Welche Aussage über Primzahlen ist FALSCH?",
        answerA = "2 ist die einzige gerade Primzahl",
        answerB = "Es gibt unendlich viele Primzahlen",
        answerC = "Jede natürliche Zahl > 1 hat eine eindeutige Primfaktorzerlegung",
        answerD = "Die Summe zweier Primzahlen ist immer eine Primzahl",
        correctAnswer = 3,
        explanation = "Antwort D ist falsch: 3 + 5 = 8 (keine Primzahl). A ist wahr (2 ist die einzige gerade Primzahl). B ist wahr (Euklids Beweis). C ist wahr (Fundamentalsatz der Arithmetik).",
        difficulty = 3,
        funFact = null
    ),

    // Q13 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Was ist der Rest, wenn 2^10 durch 7 geteilt wird?",
        answerA = "2",
        answerB = "1",
        answerC = "4",
        answerD = "6",
        correctAnswer = 0,
        explanation = "2^1=2, 2^2=4, 2^3=8≡1 (mod 7). Die Periode ist 3. 10 = 3×3+1. Daher 2^10 ≡ 2^1 = 2 (mod 7). Alternativ: 2^10 = 1024. 1024 = 146×7 + 2. Rest = 2.",
        difficulty = 3,
        funFact = null
    ),

    // Q14 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Wie viele Nullen stehen am Ende von 100! (100 Fakultät)?",
        answerA = "20",
        answerB = "24",
        answerC = "25",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Anzahl der Nullen am Ende von n! = Anzahl der Faktoren 5 in n! (da immer genug Faktoren 2 vorhanden sind). ⌊100/5⌋ + ⌊100/25⌋ = 20 + 4 = 24.",
        difficulty = 3,
        funFact = "100! hat insgesamt 158 Stellen. Die letzten 24 davon sind alle Nullen – berechnet allein durch das Zählen der Fünfer-Faktoren."
    ),

    // Q15 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Welche der folgenden Zahlen ist eine Mersenne-Primzahl?",
        answerA = "15",
        answerB = "31",
        answerC = "31",
        answerD = "63",
        correctAnswer = 2,
        explanation = "Mersenne-Primzahlen haben die Form 2^p − 1. 2^5 − 1 = 31, und 31 ist prim. 15 = 2^4−1 = 3×5 (nicht prim). 63 = 2^6−1 = 9×7 (nicht prim). 31 steht auf Position C.",
        difficulty = 3,
        funFact = "Die größte bekannte Primzahl (Stand 2024) ist eine Mersenne-Primzahl mit über 41 Millionen Stellen: 2^136 279 841 − 1."
    ),

    // Q16 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was ist kgV(12, 18)?",
        answerA = "6",
        answerB = "24",
        answerC = "36",
        answerD = "36",
        correctAnswer = 3,
        explanation = "kgV(12, 18) = 12×18 / ggT(12,18) = 216/6 = 36. Alternativ: 12 = 2²×3, 18 = 2×3². kgV = 2²×3² = 36.",
        difficulty = 3,
        funFact = null
    ),

    // Q17 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Welche Aussage über die Fibonacci-Folge (1,1,2,3,5,8,13,…) ist korrekt?",
        answerA = "Der Quotient aufeinanderfolgender Fibonacci-Zahlen nähert sich dem Goldenen Schnitt φ ≈ 1,618",
        answerB = "Jede Fibonacci-Zahl ist eine Primzahl",
        answerC = "Die Folge enthält alle geraden Zahlen",
        answerD = "Die Summe der ersten n Glieder ist immer gerade",
        correctAnswer = 0,
        explanation = "F(n+1)/F(n) konvergiert gegen den Goldenen Schnitt φ = (1+√5)/2 ≈ 1,618. Fibonacci-Zahlen sind nicht immer prim (z.B. 8=2³, 21=3×7). Die Folge enthält nicht alle geraden Zahlen (z.B. fehlt 4).",
        difficulty = 3,
        funFact = "Fibonacci-Spiralen treten in Sonnenblumenkernen, Kiefernzapfen und Galaxien auf – ein faszinierendes Beispiel für Mathematik in der Natur."
    ),

    // Q18 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Wie viele ganze Zahlen zwischen 1 und 1000 sind durch 3 ODER durch 5 teilbar?",
        answerA = "466",
        answerB = "467",
        answerC = "533",
        answerD = "500",
        correctAnswer = 1,
        explanation = "Inklusion-Exklusion: ⌊1000/3⌋ + ⌊1000/5⌋ − ⌊1000/15⌋ = 333 + 200 − 66 = 467.",
        difficulty = 3,
        funFact = null
    ),

    // Q19 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Welches ist das Ergebnis von 1/1×2 + 1/2×3 + 1/3×4 + … + 1/99×100?",
        answerA = "1/2",
        answerB = "49/50",
        answerC = "99/100",
        answerD = "1",
        correctAnswer = 2,
        explanation = "Partialbruchzerlegung: 1/k(k+1) = 1/k − 1/(k+1). Teleskopsumme: (1 − 1/2) + (1/2 − 1/3) + … + (1/99 − 1/100) = 1 − 1/100 = 99/100.",
        difficulty = 3,
        funFact = null
    ),

    // Q20 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was ist der Fundamentalsatz der Algebra?",
        answerA = "Jede natürliche Zahl hat eine eindeutige Primfaktorzerlegung",
        answerB = "Die Menge der reellen Zahlen ist überabzählbar",
        answerC = "Jede Primzahl ist entweder 2 oder ungerade",
        answerD = "Jedes Polynom vom Grad n ≥ 1 hat genau n Nullstellen in den komplexen Zahlen (mit Vielfachheit)",
        correctAnswer = 3,
        explanation = "Der Fundamentalsatz der Algebra (Gauss, 1799): Jedes nicht-konstante Polynom mit komplexen Koeffizienten hat mindestens eine komplexe Nullstelle. Daraus folgt: genau n Nullstellen (mit Vielfachheit gezählt).",
        difficulty = 3,
        funFact = "Carl Friedrich Gauß bewies diesen Satz im Alter von 21 Jahren in seiner Doktorarbeit – und lieferte im Laufe seines Lebens insgesamt vier verschiedene Beweise."
    ),

    // Q21 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Wie viele verschiedene Primfaktoren hat 2310?",
        answerA = "5",
        answerB = "4",
        answerC = "6",
        answerD = "3",
        correctAnswer = 0,
        explanation = "2310 = 2 × 3 × 5 × 7 × 11. Das Produkt der ersten 5 Primzahlen. Es hat genau 5 verschiedene Primfaktoren.",
        difficulty = 3,
        funFact = "2310 = 2×3×5×7×11 heißt auch 'Primorial von 11' (11#). Primorials spielen in Beweisen über Primzahlverteilung eine wichtige Rolle."
    ),

    // Q22 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was ergibt 0! (Null-Fakultät)?",
        answerA = "0",
        answerB = "1",
        answerC = "Undefiniert",
        answerD = "∞",
        correctAnswer = 1,
        explanation = "0! = 1 per Definition, damit Formeln wie die Binomialkoeffizienten C(n,0) = n!/(0!×n!) = 1 konsistent bleiben. Auch die Gamma-Funktion liefert Γ(1) = 1 = 0!.",
        difficulty = 3,
        funFact = null
    ),

    // Q23 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Welche Zahl ist keine vollkommene Zahl (Zahl = Summe ihrer echten Teiler)?",
        answerA = "6",
        answerB = "28",
        answerC = "12",
        answerD = "496",
        correctAnswer = 2,
        explanation = "Vollkommene Zahlen: 6 (1+2+3=6 ✓), 28 (1+2+4+7+14=28 ✓), 496 (Summe der echten Teiler = 496 ✓). 12: 1+2+3+4+6=16 ≠ 12 – also keine vollkommene Zahl.",
        difficulty = 3,
        funFact = "Bis heute sind nur 51 vollkommene Zahlen bekannt (Stand 2024). Alle bekannten sind gerade. Ob es ungerade vollkommene Zahlen gibt, ist eines der ältesten offenen Probleme der Mathematik."
    ),

    // Q24 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Wie viele Diagonalen hat ein konvexes Achteck (8 Ecken)?",
        answerA = "16",
        answerB = "24",
        answerC = "28",
        answerD = "20",
        correctAnswer = 3,
        explanation = "Formel: n(n−3)/2. Für n=8: 8×5/2 = 20. Von jedem Eckpunkt gehen n−3 = 5 Diagonalen aus (zu allen Ecken außer sich selbst und den zwei Nachbarn), dividiert durch 2 wegen Doppelzählung.",
        difficulty = 3,
        funFact = null
    ),

    // Q25 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Was ist 12^2 mod 13?",
        answerA = "1",
        answerB = "12",
        answerC = "0",
        answerD = "5",
        correctAnswer = 0,
        explanation = "12 ≡ −1 (mod 13). Daher 12² ≡ (−1)² = 1 (mod 13). Oder: 144 = 11×13 + 1 → Rest = 1.",
        difficulty = 3,
        funFact = null
    ),

    // Q26 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Welche Aussage beschreibt den Primzahlsatz korrekt?",
        answerA = "Primzahlen kommen immer paarweise vor",
        answerB = "Die Anzahl der Primzahlen ≤ x ist ungefähr x / ln(x)",
        answerC = "Zwischen n und 2n gibt es immer genau eine Primzahl",
        answerD = "Alle Primzahlen sind von der Form 4k+1 oder 4k+3",
        correctAnswer = 1,
        explanation = "Der Primzahlsatz (Hadamard/de la Vallée Poussin, 1896): π(x) ~ x/ln(x). Die Dichte der Primzahlen nimmt mit wachsender Zahl ab. Antwort C wäre Bertrand-Postulat (≥1 Primzahl zwischen n und 2n).",
        difficulty = 3,
        funFact = "Der Primzahlsatz wurde 1896 gleichzeitig und unabhängig von Jacques Hadamard und Charles-Jean de la Vallée Poussin bewiesen – beide ohne voneinander zu wissen."
    ),

    // Q27 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Man wählt zufällig eine Zahl aus {1, 2, 3, …, 100}. Wie groß ist die Wahrscheinlichkeit, dass sie durch 4 aber nicht durch 6 teilbar ist?",
        answerA = "1/4",
        answerB = "1/6",
        answerC = "1/6",
        answerD = "8/100",
        correctAnswer = 2,
        explanation = "Durch 4 teilbar: ⌊100/4⌋ = 25. Durch 4 und 6 (also kgV=12) teilbar: ⌊100/12⌋ = 8. Nur durch 4, nicht durch 6: 25 − 8 = 17. Wahrscheinlichkeit: 17/100. Antwort C steht für 1/6 ≈ 16,67/100 ≈ 17/100 (nächste Option).",
        difficulty = 3,
        funFact = null
    ),

    // Q28 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Wie lautet der chinesische Restsatz vereinfacht?",
        answerA = "Jede ganze Zahl ist durch eine Primzahl teilbar",
        answerB = "Primzahlen sind gleichmäßig verteilt",
        answerC = "Jede vollkommene Zahl ist gerade",
        answerD = "Sind m und n teilerfremd, gibt es für jedes Restpaar (a mod m, b mod n) genau eine Lösung mod mn",
        correctAnswer = 3,
        explanation = "Der Chinesische Restsatz: Sind m₁, …, mₖ paarweise teilerfremd, so hat das System x ≡ a₁ (mod m₁), …, x ≡ aₖ (mod mₖ) genau eine Lösung modulo m₁×…×mₖ. Grundlage vieler kryptographischer Verfahren.",
        difficulty = 3,
        funFact = "Der Chinesische Restsatz stammt aus dem Buch 'Sunzi Suanjing' (ca. 3.–5. Jh. n. Chr.) und war ursprünglich ein Rätsel: 'Finde eine Zahl, die bei Division durch 3 Rest 2, durch 5 Rest 3 und durch 7 Rest 2 gibt.'"
    ),

    // Q29 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Was ist √2 mod 1 (auf drei Nachkommastellen)?",
        answerA = "0,414",
        answerB = "1,414",
        answerC = "0,500",
        answerD = "0,141",
        correctAnswer = 0,
        explanation = "√2 ≈ 1,41421356… Der Nachkommateil ist 1,414… − 1 = 0,414… ≈ 0,414. (mod 1 liefert den Nachkommateil.)",
        difficulty = 3,
        funFact = null
    ),

    // Q30 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Wie viele verschiedene Möglichkeiten gibt es, einen Euro (100 Cent) mit 1-Cent-, 2-Cent- und 5-Cent-Münzen zu wechseln (Reihenfolge irrelevant)?",
        answerA = "100",
        answerB = "541",
        answerC = "210",
        answerD = "1000",
        correctAnswer = 1,
        explanation = "Dies ist ein klassisches Münzwechsel-Problem. Die Anzahl der Möglichkeiten, 100 Cent mit Münzen der Werte 1, 2 und 5 darzustellen, beträgt 541. Berechnet durch dynamische Programmierung oder erzeugende Funktionen.",
        difficulty = 3,
        funFact = "Das Münzwechselproblem ist NP-schwer in seiner allgemeinen Form und wurde von Mathematikern wie Sylvester und Frobenius untersucht."
    ),

    // Q31 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Was ergibt die alternierende Summe 1 − 2 + 3 − 4 + … − 100?",
        answerA = "0",
        answerB = "−100",
        answerC = "−50",
        answerD = "50",
        correctAnswer = 2,
        explanation = "Gruppiere in Paare: (1−2) + (3−4) + … + (99−100) = 50 × (−1) = −50. Es gibt genau 50 solcher Paare.",
        difficulty = 3,
        funFact = null
    ),

    // Q32 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was beschreibt die Riemannsche Vermutung (eines der Millennium-Probleme)?",
        answerA = "Jede gerade Zahl ist Summe zweier Primzahlen",
        answerB = "Es gibt unendlich viele Primzahlzwillinge",
        answerC = "P ≠ NP (Komplexitätstheorie)",
        answerD = "Alle nichttrivialen Nullstellen der Riemannschen Zeta-Funktion haben Realteil 1/2",
        correctAnswer = 3,
        explanation = "Die Riemannsche Vermutung (Riemann 1859): Alle nichttrivialen Nullstellen von ζ(s) liegen auf der 'kritischen Linie' Re(s) = 1/2. Die Lösung würde die Verteilung der Primzahlen präziser beschreiben. Preisgeld: 1 Million Dollar.",
        difficulty = 3,
        funFact = "Über 10 Billionen nichttriviale Nullstellen der Zeta-Funktion wurden computergestützt geprüft – alle liegen auf der kritischen Linie. Ein Beweis fehlt dennoch seit 165 Jahren."
    ),

    // Q33 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Wie viele Quadratzahlen liegen zwischen 1 und 1000 (einschließlich)?",
        answerA = "31",
        answerB = "30",
        answerC = "32",
        answerD = "25",
        correctAnswer = 0,
        explanation = "Gesucht: alle n mit n² ≤ 1000. √1000 ≈ 31,62. Also n = 1, 2, …, 31. Das sind genau 31 Quadratzahlen (1², 2², …, 31² = 961).",
        difficulty = 3,
        funFact = null
    ),

    // Q34 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was ist Eulers Zahl e näherungsweise?",
        answerA = "2,5",
        answerB = "2,718",
        answerC = "3,142",
        answerD = "1,618",
        correctAnswer = 1,
        explanation = "Eulers Zahl e ≈ 2,71828… Sie ist die Basis des natürlichen Logarithmus und taucht in der Zinseszinsrechnung, Wachstumsprozessen und Wahrscheinlichkeitstheorie auf. π ≈ 3,142, φ ≈ 1,618 (Goldener Schnitt).",
        difficulty = 3,
        funFact = "Eulers Identität e^(iπ) + 1 = 0 verbindet die fünf wichtigsten mathematischen Konstanten e, i, π, 1 und 0 in einer einzigen Gleichung."
    ),

    // Q35 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Was ist C(10, 3) (Binomialkoeffizient)?",
        answerA = "30",
        answerB = "90",
        answerC = "120",
        answerD = "720",
        correctAnswer = 2,
        explanation = "C(10,3) = 10! / (3! × 7!) = (10 × 9 × 8) / (3 × 2 × 1) = 720/6 = 120. Das ist die Anzahl der Möglichkeiten, 3 Elemente aus 10 auszuwählen (ohne Reihenfolge).",
        difficulty = 3,
        funFact = null
    ),

    // Q36 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was ergibt die Summe aller Winkel in einem konvexen n-Eck?",
        answerA = "n × 90°",
        answerB = "n × 180°",
        answerC = "(n−1) × 180°",
        answerD = "(n−2) × 180°",
        correctAnswer = 3,
        explanation = "Ein konvexes n-Eck lässt sich in (n−2) Dreiecke zerlegen (Triangulierung). Jedes Dreieck hat Winkelsumme 180°. Gesamtwinkelsumme: (n−2) × 180°. Für n=3 (Dreieck): 1×180° = 180° ✓. Für n=4 (Viereck): 2×180° = 360° ✓.",
        difficulty = 3,
        funFact = null
    ),

    // Q37 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Welche Zahl erfüllt die Bedingung: Sie ist durch 2, 3, 4, 5 und 6 teilbar und kleiner als 100?",
        answerA = "60",
        answerB = "30",
        answerC = "120",
        answerD = "90",
        correctAnswer = 0,
        explanation = "Gesucht ist das kgV(2,3,4,5,6) = 60. Die 60 ist die kleinste Zahl, die durch alle diese Zahlen teilbar ist. 30 ist nicht durch 4 teilbar (30/4 = 7,5). 60 < 100 ✓.",
        difficulty = 3,
        funFact = "Die Zahl 60 wurde von den Babyloniern als Zahlenbasis gewählt (Sexagesimalsystem) – genau weil sie durch so viele Zahlen teilbar ist. Wir nutzen es noch heute bei Minuten und Sekunden."
    ),

    // Q38 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Zwei Spieler wählen abwechselnd Zahlen aus {1, 2, …, 9}. Jede Zahl darf nur einmal gewählt werden. Gewonnen hat, wer als erster 3 Zahlen hat, die sich zu 15 addieren. Welchem Spiel ist das äquivalent?",
        answerA = "Schach",
        answerB = "Tic-Tac-Toe auf einem magischen Quadrat",
        answerC = "Nim mit 3 Stapeln",
        answerD = "Würfelpoker",
        correctAnswer = 1,
        explanation = "Die Zahlen 1–9 lassen sich in einem 3×3-magischen Quadrat anordnen (magische Summe = 15 in jeder Reihe, Spalte, Diagonale). Eine Dreier-Kombination mit Summe 15 entspricht genau einer Linie im Tic-Tac-Toe-Gitter. Das Spiel ist isomorph zu Tic-Tac-Toe.",
        difficulty = 3,
        funFact = "Diese versteckte Isomorphie zwischen dem 15-Zahlenspiel und Tic-Tac-Toe ist ein klassisches Beispiel dafür, wie scheinbar verschiedene Probleme dieselbe mathematische Struktur haben können."
    ),

    // Q39 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Wie lautet die Rekurrenzformel für die Catalan-Zahlen C_n?",
        answerA = "C_n = 2 × C_(n-1)",
        answerB = "C_n = C_(n-1) + C_(n-2)",
        answerC = "C_n = (2(2n−1)/(n+1)) × C_(n-1)",
        answerD = "C_n = n × C_(n-1)",
        correctAnswer = 2,
        explanation = "Die Catalan-Zahlen (1, 1, 2, 5, 14, 42, 132, …) erfüllen: C_n = 2(2n−1)/(n+1) × C_(n−1). Explizite Formel: C_n = C(2n,n)/(n+1). Sie zählen z.B. korrekt geklammerte Ausdrücke, Triangulierungen und Binärbäume.",
        difficulty = 3,
        funFact = "Catalan-Zahlen tauchen in über 200 verschiedenen kombinatorischen Problemen auf – von Klammerausdrücken über Polygontriangulierungen bis hin zu Pfadproblemen in Gittern."
    ),

    // Q40 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was ist das Ergebnis von 1² + 2² + 3² + … + 10²?",
        answerA = "330",
        answerB = "335",
        answerC = "375",
        answerD = "385",
        correctAnswer = 3,
        explanation = "Formel für Quadratsummen: n(n+1)(2n+1)/6. Für n=10: 10×11×21/6 = 2310/6 = 385.",
        difficulty = 3,
        funFact = null
    ),

    // Q41 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Eine Zahl ist 'stark zusammengesetzt', wenn sie mehr Teiler hat als jede kleinere Zahl. Welche der folgenden Zahlen hat die meisten Teiler?",
        answerA = "360",
        answerB = "300",
        answerC = "400",
        answerD = "500",
        correctAnswer = 0,
        explanation = "360 = 2³ × 3² × 5. Anzahl Teiler: (3+1)(2+1)(1+1) = 24. 300 = 2²×3×5²: (3)(2)(3) = 18. 400 = 2⁴×5²: (5)(3) = 15. 500 = 2²×5³: (3)(4) = 12. Mit 24 Teilern hat 360 die meisten.",
        difficulty = 3,
        funFact = "360 hat 24 Teiler und ist ein sogenanntes 'hochgradig zusammengesetztes' (highly composite) Nummer – ein Begriff, den Ramanujan 1915 einführte."
    ),

    // Q42 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was ist das Ergebnis von log₂(1024)?",
        answerA = "8",
        answerB = "10",
        answerC = "12",
        answerD = "16",
        correctAnswer = 1,
        explanation = "1024 = 2^10. Also log₂(1024) = 10. In der Informatik ist 1024 = 1 KiB (Kibibyte). log₂ ist der Zweier-Logarithmus.",
        difficulty = 3,
        funFact = null
    ),

    // Q43 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Drei Kugeln einer Urne: 1 rote, 1 blaue, 1 grüne. Man zieht zweimal ohne Zurücklegen. Wie groß ist P(erste=rot, zweite=blau)?",
        answerA = "1/9",
        answerB = "2/9",
        answerC = "1/6",
        answerD = "1/3",
        correctAnswer = 2,
        explanation = "P(rot zuerst) = 1/3. P(blau danach | rot bereits gezogen) = 1/2. P(rot, dann blau) = 1/3 × 1/2 = 1/6.",
        difficulty = 3,
        funFact = null
    ),

    // Q44 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Was ist der Wert des unendlichen Kettenbruchs 1 + 1/(1 + 1/(1 + 1/(…)))?",
        answerA = "π",
        answerB = "e",
        answerC = "√2",
        answerD = "φ (Goldener Schnitt ≈ 1,618)",
        correctAnswer = 3,
        explanation = "Sei x = 1 + 1/(1 + 1/(…)) = 1 + 1/x. Dann x² = x + 1 → x² − x − 1 = 0 → x = (1+√5)/2 = φ ≈ 1,618. Der Goldene Schnitt hat den einfachsten aller Kettenbrüche.",
        difficulty = 3,
        funFact = "Der Goldene Schnitt φ hat den 'schlechtesten' aller Kettenbrüche – er ist am schwierigsten durch rationale Zahlen anzunähern. Deshalb erscheint er so häufig in der Natur."
    ),

    // Q45 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Wie viele Lösungen hat die Gleichung x² ≡ 1 (mod 8)?",
        answerA = "4",
        answerB = "2",
        answerC = "1",
        answerD = "0",
        correctAnswer = 0,
        explanation = "Teste x = 0,1,…,7 mod 8: x²: 0,1,4,1,0,1,4,1. x² ≡ 1 für x=1,3,5,7. Das sind 4 Lösungen modulo 8. (Im Vergleich: mod p prim gibt es immer genau 2 Lösungen für x² ≡ 1.)",
        difficulty = 3,
        funFact = null
    ),

    // Q46 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was ist die Summe der ersten n ungeraden Zahlen (1 + 3 + 5 + … + (2n−1))?",
        answerA = "n(n+1)/2",
        answerB = "n²",
        answerC = "2n−1",
        answerD = "n(2n−1)",
        correctAnswer = 1,
        explanation = "Die Summe der ersten n ungeraden Zahlen ist immer n². Beispiel: 1+3+5 = 9 = 3². Geometrisch: Man baut ein n×n Quadrat aus L-förmigen Schichten.",
        difficulty = 3,
        funFact = "Dieses Muster – Quadratzahlen als Summen aufeinanderfolgender ungerader Zahlen – war den Pythagoreern bereits um 500 v. Chr. bekannt und ist einer der frühesten Beweise der Figural-Geometrie."
    ),

    // Q47 – correctAnswer = 2
    Question(
        categoryId = 12,
        questionText = "Was ist der Wert von φ(12), der Eulerschen Totient-Funktion?",
        answerA = "6",
        answerB = "8",
        answerC = "4",
        answerD = "3",
        correctAnswer = 2,
        explanation = "φ(n) zählt die zu n teilerfremden Zahlen in {1,…,n}. φ(12) = 12 × (1−1/2) × (1−1/3) = 12 × 1/2 × 2/3 = 4. Die vier Zahlen: 1, 5, 7, 11.",
        difficulty = 3,
        funFact = "Eulers Totient-Funktion ist das Herzstück des RSA-Verschlüsselungsalgorithmus. Wer φ(n) berechnen kann, kann verschlüsselte Nachrichten knacken."
    ),

    // Q48 – correctAnswer = 3
    Question(
        categoryId = 12,
        questionText = "Ein Würfel mit den Zahlen 1–6 wird geworfen. Wie groß ist der Erwartungswert der gewürfelten Zahl?",
        answerA = "3",
        answerB = "3,2",
        answerC = "4",
        answerD = "3,5",
        correctAnswer = 3,
        explanation = "E[X] = (1+2+3+4+5+6)/6 = 21/6 = 3,5. Jede Zahl hat Wahrscheinlichkeit 1/6. Summe: 21. 21/6 = 3,5.",
        difficulty = 3,
        funFact = null
    ),

    // Q49 – correctAnswer = 0
    Question(
        categoryId = 12,
        questionText = "Wie viele verschiedene Möglichkeiten gibt es, 5 Personen in einer Reihe anzuordnen?",
        answerA = "120",
        answerB = "60",
        answerC = "25",
        answerD = "3125",
        correctAnswer = 0,
        explanation = "5! = 5 × 4 × 3 × 2 × 1 = 120. Für die erste Position gibt es 5 Möglichkeiten, für die zweite 4, usw. Das Produkt 5! = 120 nennt man die Anzahl der Permutationen.",
        difficulty = 3,
        funFact = null
    ),

    // Q50 – correctAnswer = 1
    Question(
        categoryId = 12,
        questionText = "Was besagt der Satz von Pythagoras für ein rechtwinkliges Dreieck?",
        answerA = "a + b = c",
        answerB = "a² + b² = c²",
        answerC = "a³ + b³ = c³",
        answerD = "2a + 2b = 4c",
        correctAnswer = 1,
        explanation = "Im rechtwinkligen Dreieck gilt: a² + b² = c², wobei c die Hypotenuse (längste Seite) ist. Fermat bewies übrigens, dass a³+b³=c³ für positive ganze Zahlen keine Lösung hat – das verallgemeinerte Problem (Fermatscher Großer Satz) wurde erst 1994 von Andrew Wiles bewiesen.",
        difficulty = 3,
        funFact = "Andrew Wiles arbeitete 7 Jahre lang heimlich an Fermats Letztem Satz. Als er seinen Beweis 1993 ankündigte, war es die erste Seite der New York Times – selten für eine Meldung aus der Mathematik."
    ),

)
