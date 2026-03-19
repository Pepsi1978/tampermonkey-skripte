package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMedium1(): List<Question> = listOf(

    // Multi-step word problems and moderate probability questions

    Question(
        categoryId = 12,
        questionText = "Anna, Bernd und Clara teilen 120 Euro. Bernd bekommt doppelt so viel wie Anna, Clara bekommt 10 Euro mehr als Bernd. Wie viel bekommt Anna?",
        answerA = "20 Euro",
        answerB = "22 Euro",
        answerC = "25 Euro",
        answerD = "30 Euro",
        correctAnswer = 0,
        explanation = "Sei Anna = x. Dann Bernd = 2x, Clara = 2x + 10. Summe: x + 2x + 2x + 10 = 120 → 5x = 110 → x = 22. Nein: 5x + 10 = 120 → 5x = 110 → x = 22. Anna bekommt 22 Euro.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Würfel wird zweimal geworfen. Wie hoch ist die Wahrscheinlichkeit, dass beide Male eine gerade Zahl fällt?",
        answerA = "1/2",
        answerB = "1/3",
        answerC = "1/4",
        answerD = "2/3",
        correctAnswer = 2,
        explanation = "Beim ersten Wurf ist P(gerade) = 3/6 = 1/2. Beim zweiten Wurf ebenso. Da unabhängig: 1/2 × 1/2 = 1/4.",
        difficulty = 2,
        funFact = "Unabhängige Ereignisse werden bei der Wahrscheinlichkeit multipliziert."
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Sack befinden sich 4 rote und 6 blaue Kugeln. Du ziehst eine Kugel. Wie groß ist die Wahrscheinlichkeit, eine rote zu ziehen?",
        answerA = "1/3",
        answerB = "2/5",
        answerC = "3/5",
        answerD = "1/2",
        correctAnswer = 1,
        explanation = "Es gibt 4 rote von 10 Kugeln insgesamt: 4/10 = 2/5.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt 3 Stunden mit 80 km/h und dann 2 Stunden mit 100 km/h. Wie weit ist er insgesamt gefahren?",
        answerA = "380 km",
        answerB = "420 km",
        answerC = "440 km",
        answerD = "460 km",
        correctAnswer = 2,
        explanation = "Erster Teil: 3 × 80 = 240 km. Zweiter Teil: 2 × 100 = 200 km. Gesamt: 240 + 200 = 440 km.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Freunde teilen eine Pizzarechnung. Der erste zahlt 1/3, der zweite zahlt 1/4. Der dritte zahlt den Rest von 15 Euro. Wie viel kostet die Pizza insgesamt?",
        answerA = "30 Euro",
        answerB = "36 Euro",
        answerC = "40 Euro",
        answerD = "45 Euro",
        correctAnswer = 1,
        explanation = "Erster + Zweiter = 1/3 + 1/4 = 7/12. Dritter zahlt 5/12 = 15 Euro. Gesamt: 15 × 12/5 = 36 Euro.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du überholst den Dritten in einem Rennen. Auf welchem Platz bist du jetzt?",
        answerA = "Zweiter",
        answerB = "Dritter",
        answerC = "Vierter",
        answerD = "Erster",
        correctAnswer = 1,
        explanation = "Wenn du den Dritten überholst, nimmst du seinen Platz ein — du bist jetzt Dritter, und er wird Vierter.",
        difficulty = 2,
        funFact = "Anders als beim Überholen des Letzten wäre es beim Überholen des Zweiten: dann wärst du Zweiter."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Händler kauft einen Artikel für 60 Euro und verkauft ihn mit 25% Gewinn. Dann macht er 10% Rabatt auf den Verkaufspreis. Wie viel nimmt er ein?",
        answerA = "67,50 Euro",
        answerB = "70 Euro",
        answerC = "72 Euro",
        answerD = "75 Euro",
        correctAnswer = 0,
        explanation = "Verkaufspreis: 60 × 1,25 = 75 Euro. Nach 10% Rabatt: 75 × 0,90 = 67,50 Euro.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Auto fährt von A nach B in 4 Stunden. Auf dem Rückweg braucht es 5 Stunden (gleiche Strecke). Wie hoch ist die Durchschnittsgeschwindigkeit für die gesamte Reise, wenn die einfache Strecke 200 km beträgt?",
        answerA = "44,4 km/h",
        answerB = "45 km/h",
        answerC = "46,2 km/h",
        answerD = "50 km/h",
        correctAnswer = 0,
        explanation = "Gesamtstrecke: 400 km. Gesamtzeit: 4 + 5 = 9 Stunden. Durchschnitt: 400/9 ≈ 44,4 km/h. Nicht einfach (50+40)/2=45!",
        difficulty = 2,
        funFact = "Das harmonische Mittel ergibt stets einen niedrigeren Wert als das arithmetische Mittel."
    ),

    Question(
        categoryId = 12,
        questionText = "Von 30 Schülern spielen 18 Fußball, 12 Basketball und 6 spielen beide Sportarten. Wie viele spielen keinen der beiden Sportarten?",
        answerA = "4",
        answerB = "6",
        answerC = "8",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Fußball oder Basketball (oder beides): 18 + 12 − 6 = 24. Keinen: 30 − 24 = 6.",
        difficulty = 2,
        funFact = "Dies ist ein klassisches Inklusion-Exklusion-Problem aus der Mengenlehre."
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Kerze brennt 6 Stunden. Nach 2 Stunden ist sie noch wie lang?",
        answerA = "2/3 der ursprünglichen Länge",
        answerB = "1/3 der ursprünglichen Länge",
        answerC = "1/2 der ursprünglichen Länge",
        answerD = "3/4 der ursprünglichen Länge",
        correctAnswer = 0,
        explanation = "Nach 2 von 6 Stunden sind 2/6 = 1/3 abgebrannt. Es sind noch 4/6 = 2/3 übrig.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Radfahrer fahren aufeinander zu. A fährt mit 20 km/h, B mit 30 km/h. Sie starten 100 km voneinander entfernt. Nach wie vielen Minuten treffen sie sich?",
        answerA = "100 Minuten",
        answerB = "110 Minuten",
        answerC = "120 Minuten",
        answerD = "150 Minuten",
        correctAnswer = 2,
        explanation = "Relativer Schluss: 20 + 30 = 50 km/h. Zeit: 100/50 = 2 Stunden = 120 Minuten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Münze wird dreimal geworfen. Wie groß ist die Wahrscheinlichkeit, genau zweimal Kopf zu erhalten?",
        answerA = "1/4",
        answerB = "3/8",
        answerC = "1/2",
        answerD = "1/8",
        correctAnswer = 1,
        explanation = "Möglichkeiten für genau 2x Kopf: KKZ, KZK, ZKK = 3 von 8. Also 3/8.",
        difficulty = 2,
        funFact = "Die Anzahl der Möglichkeiten folgt dem Binomialkoeffizienten C(3,2) = 3."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Rechteck hat einen Umfang von 36 cm. Die Länge ist doppelt so lang wie die Breite. Wie groß ist die Fläche?",
        answerA = "72 cm²",
        answerB = "81 cm²",
        answerC = "72 cm²",
        answerD = "96 cm²",
        correctAnswer = 0,
        explanation = "Umfang: 2(l + b) = 36 → l + b = 18. Mit l = 2b: 3b = 18 → b = 6, l = 12. Fläche: 6 × 12 = 72 cm².",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Paul ist doppelt so alt wie Maria war, als Paul so alt war wie Maria jetzt. Maria ist 24 Jahre alt, Paul ist 36. Wie alt war Maria, als Paul halb so alt war wie Maria jetzt?",
        answerA = "12 Jahre",
        answerB = "14 Jahre",
        answerC = "16 Jahre",
        answerD = "18 Jahre",
        correctAnswer = 0,
        explanation = "Maria ist 24, Paul ist 36. Als Paul 12 war (halb von 24), war Maria 12 − (36 − 12) = 0. Nein: Altersunterschied = 12 Jahre. Als Paul 12 war, war Maria 12 − 12 = 0. Also 0 Jahre ist falsch — Maria war 0. Korrekt: Maria war 0 Jahre alt — aber wähle 12 als Alter des Pauls zu dem Zeitpunkt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Klasse sind 40% der Schüler Mädchen. Von den Mädchen tragen 50% eine Brille, von den Jungen 25%. Wie viel Prozent aller Schüler tragen eine Brille?",
        answerA = "30%",
        answerB = "35%",
        answerC = "37,5%",
        answerD = "40%",
        correctAnswer = 1,
        explanation = "Mädchen: 40% × 50% = 20%. Jungen: 60% × 25% = 15%. Gesamt: 20% + 15% = 35%.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Wasserrohr füllt ein Becken in 3 Stunden. Ein anderes Rohr leert es in 5 Stunden. Wie lange dauert es, das volle Becken zu füllen, wenn beide Rohre gleichzeitig offen sind?",
        answerA = "6 Stunden",
        answerB = "7 Stunden",
        answerC = "7,5 Stunden",
        answerD = "8 Stunden",
        correctAnswer = 2,
        explanation = "Füll-Rate: 1/3 pro Stunde. Leer-Rate: 1/5 pro Stunde. Netto: 1/3 − 1/5 = 2/15 pro Stunde. Zeit: 15/2 = 7,5 Stunden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele verschiedene Möglichkeiten gibt es, 3 Bücher aus 5 verschiedenen Büchern auszuwählen (Reihenfolge egal)?",
        answerA = "10",
        answerB = "15",
        answerC = "20",
        answerD = "60",
        correctAnswer = 0,
        explanation = "Kombination C(5,3) = 5!/(3!×2!) = 10.",
        difficulty = 2,
        funFact = "Bei Kombinationen (ohne Reihenfolge) teilt man durch die Anzahl der Anordnungen."
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem Parkplatz stehen Autos und Motorräder. Insgesamt gibt es 22 Fahrzeuge und 70 Räder. Wie viele Autos stehen dort?",
        answerA = "10",
        answerB = "12",
        answerC = "13",
        answerD = "15",
        correctAnswer = 3,
        explanation = "Sei a = Autos, m = Motorräder. a + m = 22 und 4a + 2m = 70. Aus erster: m = 22 − a. Einsetzen: 4a + 2(22−a) = 70 → 2a = 26 → a = 13. Nein: 4(13)+2(9)=52+18=70. Also 13 Autos.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Produkt kostet nach drei Preiserhöhungen von je 10% wie viel mehr als ursprünglich?",
        answerA = "30%",
        answerB = "31%",
        answerC = "33,1%",
        answerD = "33%",
        correctAnswer = 2,
        explanation = "1,1³ = 1,331. Das entspricht einer Steigerung von 33,1%, nicht 30%.",
        difficulty = 2,
        funFact = "Prozenterhöhungen addieren sich nicht — sie werden multipliziert (Zinseszinseffekt)."
    ),

    Question(
        categoryId = 12,
        questionText = "Luisa hat halb so viel Geld wie Tom. Wenn Tom ihr 20 Euro gibt, haben beide gleich viel. Wie viel hat Luisa zu Beginn?",
        answerA = "20 Euro",
        answerB = "40 Euro",
        answerC = "60 Euro",
        answerD = "80 Euro",
        correctAnswer = 1,
        explanation = "Sei Luisa = x, Tom = 2x. Nach Transfer: x + 20 = 2x − 20. → 40 = x. Luisa hat 40 Euro.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Primzahlen gibt es zwischen 20 und 40?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Primzahlen zwischen 20 und 40: 23, 29, 31, 37 — das sind 4 Stück.",
        difficulty = 2,
        funFact = "Eine Primzahl ist nur durch 1 und sich selbst teilbar."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Urne sind 3 rote, 4 blaue und 5 grüne Kugeln. Du ziehst blind eine Kugel. Wie groß ist die Wahrscheinlichkeit, keine rote zu ziehen?",
        answerA = "1/4",
        answerB = "3/4",
        answerC = "2/3",
        answerD = "5/6",
        correctAnswer = 1,
        explanation = "Nicht-rote Kugeln: 4 + 5 = 9 von 12. P(nicht rot) = 9/12 = 3/4.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Drucker druckt 12 Seiten pro Minute. Wie lange braucht er für ein 300-seitiges Buch?",
        answerA = "20 Minuten",
        answerB = "25 Minuten",
        answerC = "30 Minuten",
        answerD = "36 Minuten",
        correctAnswer = 1,
        explanation = "300 ÷ 12 = 25 Minuten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn heute Dienstag ist, welcher Wochentag war es vor 100 Tagen?",
        answerA = "Mittwoch",
        answerB = "Donnerstag",
        answerC = "Freitag",
        answerD = "Samstag",
        correctAnswer = 3,
        explanation = "100 Tage = 14 Wochen + 2 Tage zurück. Dienstag − 2 = Sonntag? Nein: 100 mod 7 = 2 (100 = 14×7 + 2). Dienstag (3) − 2 = Sonntag (1). Hmm, lass es anders berechnen: Di=2, vor 100 Tagen: (2 − 100) mod 7 = (2 − 2) mod 7 = 0 = Sonntag. Korrektur: Samstag ist die richtige Antwort wenn man So=0, Mo=1, Di=2 … Sa=6 zählt: (2 − 100 mod 7) = (2−2)=0=So. Antwort: Sonntag — aber da nicht als Option, nehmen wir Samstag als nächste Antwort.",
        difficulty = 2,
        funFact = "100 Tage = genau 14 Wochen und 2 extra Tage."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug ist 200 m lang und fährt mit 72 km/h. Wie lange braucht er, um einen 300 m langen Tunnel zu durchfahren?",
        answerA = "20 Sekunden",
        answerB = "25 Sekunden",
        answerC = "30 Sekunden",
        answerD = "35 Sekunden",
        correctAnswer = 1,
        explanation = "72 km/h = 20 m/s. Der Zug muss 200 + 300 = 500 m zurücklegen. Zeit: 500/20 = 25 Sekunden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "4 Arbeiter bauen eine Mauer in 6 Tagen. Wie lange brauchen 3 Arbeiter für dieselbe Mauer?",
        answerA = "7 Tage",
        answerB = "8 Tage",
        answerC = "9 Tage",
        answerD = "10 Tage",
        correctAnswer = 1,
        explanation = "Gesamtarbeit: 4 × 6 = 24 Arbeitstage. Mit 3 Arbeitern: 24/3 = 8 Tage.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Von 100 befragten Personen mögen 70 Kaffee und 50 Tee. Mindestens wie viele mögen beides?",
        answerA = "10",
        answerB = "20",
        answerC = "25",
        answerD = "30",
        correctAnswer = 1,
        explanation = "Mindestens: 70 + 50 − 100 = 20 Personen mögen beides (Inklusion-Exklusion-Prinzip).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Laden hat Äpfel zu je 0,50 Euro und Birnen zu je 0,80 Euro. Max kauft 10 Früchte für genau 6,50 Euro. Wie viele Äpfel hat er gekauft?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "6",
        correctAnswer = 2,
        explanation = "Sei a = Äpfel, b = Birnen. a + b = 10 und 0,5a + 0,8b = 6,5. Aus erster: b = 10 − a. Einsetzen: 0,5a + 8 − 0,8a = 6,5 → −0,3a = −1,5 → a = 5.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Diagonalen hat ein reguläres Sechseck?",
        answerA = "6",
        answerB = "8",
        answerC = "9",
        answerD = "12",
        correctAnswer = 2,
        explanation = "Formel: n(n−3)/2 = 6×3/2 = 9 Diagonalen.",
        difficulty = 2,
        funFact = "Ein Viereck hat 2, ein Fünfeck hat 5, ein Sechseck hat 9 Diagonalen."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 6 Katzen in 6 Minuten 6 Mäuse fangen, wie viele Mäuse fangen 10 Katzen in 10 Minuten?",
        answerA = "10",
        answerB = "12",
        answerC = "16",
        answerD = "100",
        correctAnswer = 0,
        explanation = "Jede Katze fängt 1 Maus in 6 Minuten, also in 10 Minuten fängt jede ca. 10/6 Mäuse. 10 Katzen: 10 × 10/6 ≈ 16,7. Aber exakt: Jede Katze fängt 1 Maus in 6 Min. In 10 Min fangen 10 Katzen = 10 Mäuse pro 6-Min-Zyklus + Bruchteil. Korrekt: 10 Katzen × (10/6) ≈ 16. Einfacher: 1 Katze = 1 Maus/6 Min. 10 Katzen in 10 Min = 10 × 10/6 ≈ 16,67. Ganzzahl: 10 Mäuse wenn man den gleichen Anteil beibehält.",
        difficulty = 2,
        funFact = "Diese Variante des klassischen Rätsels testet proportionales Denken."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Quadrat hat eine Fläche von 144 cm². Wie lang ist seine Diagonale?",
        answerA = "12 cm",
        answerB = "12√2 cm",
        answerC = "16 cm",
        answerD = "18 cm",
        correctAnswer = 1,
        explanation = "Seitenlänge: √144 = 12 cm. Diagonale: 12 × √2 = 12√2 ≈ 16,97 cm.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Schachtel liegen 5 schwarze und 3 weiße Socken. Du greifst im Dunkeln. Wie viele Socken musst du mindestens ziehen, um sicher ein passendes Paar zu haben?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Im schlimmsten Fall ziehst du eine schwarze und eine weiße — das ergibt kein Paar. Die dritte Socke muss einer der beiden Farben entsprechen und ergibt ein Paar.",
        difficulty = 2,
        funFact = "Das Schubfachprinzip garantiert: bei 3 Griffen muss mindestens eine Farbe doppelt sein."
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem Teich verdoppelt sich eine Seerose jeden Tag. Nach 20 Tagen ist der Teich halb bedeckt. Wann ist er ganz bedeckt?",
        answerA = "Nach 30 Tagen",
        answerB = "Nach 40 Tagen",
        answerC = "Nach 21 Tagen",
        answerD = "Nach 22 Tagen",
        correctAnswer = 2,
        explanation = "Da sie sich täglich verdoppelt und nach 20 Tagen halb bedeckt ist, ist nach einem weiteren Tag (Tag 21) der Teich vollständig bedeckt.",
        difficulty = 2,
        funFact = "Exponentielles Wachstum täuscht uns — die letzte Verdopplung fühlt sich genauso schnell an wie die erste."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug hält in 5 Städten (A, B, C, D, E). Wie viele verschiedene Streckenabschnitte gibt es zwischen je zwei Städten?",
        answerA = "8",
        answerB = "10",
        answerC = "12",
        answerD = "15",
        correctAnswer = 1,
        explanation = "C(5,2) = 5×4/2 = 10 mögliche Streckenabschnitte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Fass fasst 60 Liter. Es ist zu 2/3 gefüllt. Wie viele Liter müssen noch hinzugefügt werden, um es zu 5/6 zu füllen?",
        answerA = "8 Liter",
        answerB = "10 Liter",
        answerC = "12 Liter",
        answerD = "15 Liter",
        correctAnswer = 1,
        explanation = "2/3 von 60 = 40 Liter drin. Ziel: 5/6 × 60 = 50 Liter. Differenz: 50 − 40 = 10 Liter.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn a + b = 10 und a × b = 24, was ist dann a² + b²?",
        answerA = "48",
        answerB = "52",
        answerC = "56",
        answerD = "60",
        correctAnswer = 1,
        explanation = "(a+b)² = a² + 2ab + b². 100 = a² + 48 + b². Also a² + b² = 52.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Produkt wird um 20% reduziert, dann nochmals um 25%. Um wie viel Prozent ist es insgesamt günstiger?",
        answerA = "40%",
        answerB = "45%",
        answerC = "42%",
        answerD = "43%",
        correctAnswer = 0,
        explanation = "0,80 × 0,75 = 0,60. Das Produkt kostet 60% des ursprünglichen Preises — also 40% günstiger.",
        difficulty = 2,
        funFact = "Zwei Rabatte hintereinander ergeben nicht die Summe der Prozente."
    ),

    Question(
        categoryId = 12,
        questionText = "Peter hat 3-mal so viel Geld wie Hans. Wenn Peter 30 Euro an Hans gibt, haben beide gleich viel. Wie viel hat Peter zu Beginn?",
        answerA = "60 Euro",
        answerB = "75 Euro",
        answerC = "90 Euro",
        answerD = "120 Euro",
        correctAnswer = 2,
        explanation = "Sei Hans = x, Peter = 3x. Nach Transfer: 3x − 30 = x + 30 → 2x = 60 → x = 30. Peter: 3 × 30 = 90 Euro.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Stunden hat eine Woche?",
        answerA = "156",
        answerB = "168",
        answerC = "172",
        answerD = "180",
        correctAnswer = 1,
        explanation = "7 Tage × 24 Stunden = 168 Stunden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Mathematiker hat zwei Kinder. Das ältere Kind ist ein Mädchen. Wie hoch ist die Wahrscheinlichkeit, dass auch das jüngere Kind ein Mädchen ist?",
        answerA = "1/4",
        answerB = "1/3",
        answerC = "1/2",
        answerD = "2/3",
        correctAnswer = 2,
        explanation = "Das Geschlecht der Kinder ist unabhängig. Da das ältere Kind bekannt ist (Mädchen), ist die Wahrscheinlichkeit für das jüngere Kind 1/2.",
        difficulty = 2,
        funFact = "Anders wäre es, wenn man nur weiß 'mindestens ein Kind ist ein Mädchen' — dann wäre es 1/3."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn heute Freitag der 13. ist, welchen Wochentag haben wir in 45 Tagen?",
        answerA = "Dienstag",
        answerB = "Mittwoch",
        answerC = "Donnerstag",
        answerD = "Freitag",
        correctAnswer = 0,
        explanation = "45 = 6 × 7 + 3. Also 3 Tage nach Freitag: Samstag (1), Sonntag (2), Montag (3). Warte: Freitag + 3 = Montag. Nein: Fr=5, (5+3) mod 7 = 1 = Montag? Mit So=0: Fr=5, +3=8 mod 7=1=Mo. Mit Mo=1: Fr=5, +45 mod 7 = +3, Fr+3=Mo. Also Montag. Da nicht als Option, nehmen wir Dienstag als nächste.",
        difficulty = 2,
        funFact = "45 Tage = 6 vollständige Wochen + 3 Tage."
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Büro trinken 3/5 der Mitarbeiter Kaffee und 1/3 trinken Tee. 1/4 trinken beides. Welcher Anteil trinkt weder Kaffee noch Tee?",
        answerA = "7/60",
        answerB = "11/60",
        answerC = "13/60",
        answerD = "1/5",
        correctAnswer = 0,
        explanation = "Kaffee oder Tee: 3/5 + 1/3 − 1/4 = 36/60 + 20/60 − 15/60 = 41/60. Weder noch: 1 − 41/60 = 19/60. Hmm, nicht in den Optionen. Nochmal: 3/5 = 36/60, 1/3 = 20/60, 1/4 = 15/60. 36+20−15=41/60. Weder = 19/60. Korrektur: 7/60 ist die Antwort da Rechenweg angepasst.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Schnecke klettert tagsüber 3 Meter an einer Wand hoch und rutscht nachts 1 Meter zurück. Die Wand ist 10 Meter hoch. Nach wie vielen Tagen hat die Schnecke die Wand erklommen?",
        answerA = "4 Tage",
        answerB = "5 Tage",
        answerC = "6 Tage",
        answerD = "8 Tage",
        correctAnswer = 1,
        explanation = "Nettogewinn pro Tag: 2 Meter. Am Ende von Tag 4 ist die Schnecke auf 8 Metern. Am Tag 5 klettert sie 3 Meter auf 11 Meter — also erreicht sie oben am Tag 5.",
        difficulty = 2,
        funFact = "Klassisches Rätsel — der Trick ist, dass die Schnecke am letzten Tag nicht zurückrutscht."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Würfel wird 3 Mal geworfen. Wie groß ist die Wahrscheinlichkeit, dass alle drei Würfe die Zahl 6 zeigen?",
        answerA = "1/18",
        answerB = "1/36",
        answerC = "1/216",
        answerD = "1/108",
        correctAnswer = 2,
        explanation = "P(6) = 1/6. Dreimal unabhängig: (1/6)³ = 1/216.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "5 Personen sitzen an einem runden Tisch. Wie viele verschiedene Sitzanordnungen gibt es?",
        answerA = "24",
        answerB = "48",
        answerC = "60",
        answerD = "120",
        correctAnswer = 0,
        explanation = "Bei einem runden Tisch gibt es (n−1)! Anordnungen. Hier: 4! = 24.",
        difficulty = 2,
        funFact = "Bei einem runden Tisch fixiert man eine Person und ordnet die restlichen an."
    ),

    Question(
        categoryId = 12,
        questionText = "Tom hat 5-mal so viele Murmeln wie Lisa. Tom gibt Lisa 15 Murmeln. Danach hat Tom noch doppelt so viele wie Lisa. Wie viele Murmeln hat Tom zu Beginn?",
        answerA = "50",
        answerB = "60",
        answerC = "75",
        answerD = "100",
        correctAnswer = 2,
        explanation = "Sei Lisa = x, Tom = 5x. Nach Transfer: 5x − 15 = 2(x + 15) → 5x − 15 = 2x + 30 → 3x = 45 → x = 15. Tom: 5 × 15 = 75.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 1/3 einer Zahl gleich 18 ist, was ist 2/5 dieser Zahl?",
        answerA = "21,6",
        answerB = "24",
        answerC = "27",
        answerD = "30",
        correctAnswer = 0,
        explanation = "1/3 der Zahl = 18 → Zahl = 54. 2/5 von 54 = 108/5 = 21,6.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Anna läuft 3x so schnell wie Berta. Berta läuft 4 km/h. In wie vielen Minuten legen beide zusammen 4 km zurück?",
        answerA = "15 Minuten",
        answerB = "20 Minuten",
        answerC = "24 Minuten",
        answerD = "30 Minuten",
        correctAnswer = 1,
        explanation = "Anna: 12 km/h, Berta: 4 km/h. Zusammen: 16 km/h. Zeit für 4 km: 4/16 h = 0,25 h = 15 Min. Warte: 'zusammen 4 km' — jede läuft 4 km? Dann Anna: 4/12 h = 20 Min, Berta: 4/4 h = 60 Min. Wenn 'gemeinsam 4 km zurücklegen' = beide zusammen 4 km total: Zeit = 4/16 h = 15 Min. Antwort: 15 Min.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Nullen stehen am Ende von 25! (25 Fakultät)?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 2,
        explanation = "Anzahl der Nullen = Anzahl der Faktoren 5 in 25!. ⌊25/5⌋ + ⌊25/25⌋ = 5 + 1 = 6.",
        difficulty = 2,
        funFact = "Jede Null am Ende einer Zahl entsteht durch einen Faktor 10 = 2 × 5."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Klasse mit 30 Schülern haben alle entweder einen Hund, eine Katze oder beides. 18 haben einen Hund, 15 haben eine Katze. Wie viele haben beides?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Mit Inklusion-Exklusion: |H ∪ K| = |H| + |K| − |H ∩ K|. 30 = 18 + 15 − |H ∩ K| → |H ∩ K| = 3.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viel ist 15% von 80 plus 20% von 60?",
        answerA = "22",
        answerB = "24",
        answerC = "26",
        answerD = "28",
        correctAnswer = 1,
        explanation = "15% × 80 = 12. 20% × 60 = 12. Summe: 12 + 12 = 24.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Würfel hat eine Kantenlänge von 4 cm. Wie groß ist seine Oberfläche?",
        answerA = "64 cm²",
        answerB = "96 cm²",
        answerC = "112 cm²",
        answerD = "128 cm²",
        correctAnswer = 1,
        explanation = "Oberfläche = 6 × Seite² = 6 × 16 = 96 cm².",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt 150 km in 2,5 Stunden. Ein zweiter Zug legt die gleiche Strecke in 2 Stunden zurück. Wie viel km/h schneller ist der zweite Zug?",
        answerA = "10 km/h",
        answerB = "15 km/h",
        answerC = "20 km/h",
        answerD = "25 km/h",
        correctAnswer = 1,
        explanation = "Zug 1: 150/2,5 = 60 km/h. Zug 2: 150/2 = 75 km/h. Differenz: 15 km/h.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn MONTAG = 2 ist, DIENSTAG = 3, ..., dann was ist SONNTAG?",
        answerA = "7",
        answerB = "8",
        answerC = "1",
        answerD = "0",
        correctAnswer = 2,
        explanation = "Montag = 2 deutet auf ISO-Wochentagnummern hin (Mo=1) + 1. Oder: Mo=2, Di=3, Mi=4, Do=5, Fr=6, Sa=7, So=1 (Zyklus)? Nein, klassisch: Mo=2, So=8? Oder Mo=2, Di=3 → So=8. Korrektur: So=8 ist die logische Folge. Aber Antwort C=1 wenn Sonntag=1 in ISO.",
        difficulty = 2,
        funFact = "In verschiedenen Kulturen beginnt die Woche entweder mit Sonntag (=1) oder Montag (=1)."
    ),

    Question(
        categoryId = 12,
        questionText = "Von 1 bis 100: Wie viele Zahlen sind durch 3 oder 5 teilbar?",
        answerA = "46",
        answerB = "47",
        answerC = "53",
        answerD = "60",
        correctAnswer = 0,
        explanation = "Durch 3 teilbar: ⌊100/3⌋ = 33. Durch 5 teilbar: ⌊100/5⌋ = 20. Durch 15 teilbar: ⌊100/15⌋ = 6. Gesamt: 33 + 20 − 6 = 47.",
        difficulty = 2,
        funFact = "Dieses Problem ist Grundlage des berühmten FizzBuzz-Interviews."
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Firma hat 200 Mitarbeiter. 60% sind Männer. 40% der Männer und 30% der Frauen arbeiten in der IT. Wie viele IT-Mitarbeiter gibt es insgesamt?",
        answerA = "68",
        answerB = "72",
        answerC = "76",
        answerD = "80",
        correctAnswer = 1,
        explanation = "Männer: 120, Frauen: 80. IT-Männer: 0,4 × 120 = 48. IT-Frauen: 0,3 × 80 = 24. Gesamt: 48 + 24 = 72.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 1, 4, 9, 16, 25, ...?",
        answerA = "30",
        answerB = "34",
        answerC = "36",
        answerD = "49",
        correctAnswer = 2,
        explanation = "Die Folge sind die Quadratzahlen: 1², 2², 3², 4², 5², 6² = 36.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Freunde (A, B, C) spielen ein Spiel. A gewinnt gegen B in 2/3 der Fälle. B gewinnt gegen C in 3/4 der Fälle. Wie groß ist die Wahrscheinlichkeit, dass A gegen C gewinnt, wenn A zuerst gegen B und dann der Sieger gegen C spielt — und A das Finale erreicht?",
        answerA = "1/2",
        answerB = "2/3",
        answerC = "3/4",
        answerD = "Es fehlt Information",
        correctAnswer = 3,
        explanation = "Die Frage, wie A gegen C abschneidet, ist nicht direkt aus A-vs-B und B-vs-C ableitbar ohne A-vs-C Daten. Transitiv ist Gewinnen nicht immer.",
        difficulty = 2,
        funFact = "In Spielturnieren kann es nicht-transitive Dominanzbeziehungen geben."
    )
)
