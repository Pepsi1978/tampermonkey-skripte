package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestions(): List<Question> = listOf(

    // ── EASY (10) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Ein Bauer hat 17 Schafe. Alle bis auf 9 sterben. Wie viele Schafe hat er noch?",
        answerA = "8",
        answerB = "17",
        answerC = "9",
        answerD = "0",
        correctAnswer = 2,
        explanation = "Die Formulierung 'alle bis auf 9' bedeutet, dass genau 9 Schafe überleben.",
        difficulty = 1,
        funFact = "Dieser klassische Trick funktioniert, weil unser Gehirn automatisch beginnt zu rechnen (17 − 8 = 9), statt die Worte genau zu lesen."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Monate haben 28 Tage?",
        answerA = "1",
        answerB = "2",
        answerC = "12",
        answerD = "4",
        correctAnswer = 2,
        explanation = "Alle 12 Monate haben mindestens 28 Tage. Nur der Februar hat genau 28 Tage (in Nicht-Schaltjahren).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Vater ist 30 Jahre älter als sein Sohn. Vor 5 Jahren war er 4-mal so alt. Wie alt ist der Sohn jetzt?",
        answerA = "5",
        answerB = "10",
        answerC = "15",
        answerD = "20",
        correctAnswer = 1,
        explanation = "Sei x das Alter des Sohnes heute. Vor 5 Jahren: (x−5+30) = 4·(x−5) → x+25 = 4x−20 → 3x = 45 → x = 10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes in der Folge: 2, 4, 8, 16, 32, ...?",
        answerA = "48",
        answerB = "64",
        answerC = "56",
        answerD = "40",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 2 multipliziert (Verdoppelung). 32 × 2 = 64.",
        difficulty = 1,
        funFact = "Verdopplungsfolgen kommen in der Natur vor, z. B. beim Bakterienwachstum."
    ),

    Question(
        categoryId = 12,
        questionText = "Ich habe Städte, aber keine Häuser. Ich habe Berge, aber keine Bäume. Ich habe Wasser, aber keinen Fisch. Was bin ich?",
        answerA = "Ein Traum",
        answerB = "Eine Landkarte",
        answerC = "Ein Gemälde",
        answerD = "Ein Foto",
        correctAnswer = 1,
        explanation = "Eine Landkarte stellt Städte, Berge und Wasser nur symbolisch dar – ohne die realen Dinge zu besitzen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 5 Maschinen in 5 Minuten 5 Widgets herstellen, wie lange brauchen 100 Maschinen für 100 Widgets?",
        answerA = "100 Minuten",
        answerB = "20 Minuten",
        answerC = "5 Minuten",
        answerD = "1 Minute",
        correctAnswer = 2,
        explanation = "Jede Maschine produziert 1 Widget in 5 Minuten. 100 Maschinen produzieren 100 Widgets also in denselben 5 Minuten.",
        difficulty = 1,
        funFact = "Diese Frage wird gern in Vorstellungsgesprächen verwendet, weil sie intuitives Denken prüft."
    ),

    Question(
        categoryId = 12,
        questionText = "Was wird größer, wenn man mehr davon wegnimmt?",
        answerA = "Ein Schneeball",
        answerB = "Ein Loch",
        answerC = "Ein Berg",
        answerD = "Eine Blase",
        correctAnswer = 1,
        explanation = "Je mehr Erde man aus einem Loch schaufelt, desto größer wird das Loch.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 1, 2, 3, 5, 8, 13, ...?",
        answerA = "18",
        answerB = "20",
        answerC = "21",
        answerD = "26",
        correctAnswer = 2,
        explanation = "Fibonacci-Folge: Jede Zahl ist die Summe der beiden vorherigen. 8 + 13 = 21.",
        difficulty = 1,
        funFact = "Die Fibonacci-Folge erscheint in Blütenblattanordnungen, Spiralen von Muscheln und sogar im Aktienmarkt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Hahn legt ein Ei auf dem First eines Daches. In welche Richtung fällt das Ei?",
        answerA = "Nach links",
        answerB = "Nach rechts",
        answerC = "Gar nicht – Hähne legen keine Eier",
        answerD = "Es rollt nach unten",
        correctAnswer = 2,
        explanation = "Hähne (männliche Hühner) legen keine Eier. Es gibt also kein Ei, das fallen könnte.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast zwei Münzen, die zusammen 30 Cent ergeben. Eine davon ist kein 5-Cent-Stück. Welche Münzen sind es?",
        answerA = "Zwei 15-Cent-Stücke",
        answerB = "Ein 25-Cent-Stück und ein 5-Cent-Stück",
        answerC = "Zwei 10-Cent-Stücke und ein 10-Cent-Stück",
        answerD = "Ein 20-Cent-Stück und ein 10-Cent-Stück",
        correctAnswer = 1,
        explanation = "Die eine Münze ist kein 5-Cent-Stück — sie ist ein 25-Cent-Stück. Die andere Münze ist das 5-Cent-Stück.",
        difficulty = 1,
        funFact = "Sprachliche Fallen sind ein klassisches Mittel der Logikrätsel."
    ),

    // ── MEDIUM (15) ────────────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "In einem Rennen überholst du den Zweiten. Auf welchem Platz bist du jetzt?",
        answerA = "Erster",
        answerB = "Zweiter",
        answerC = "Dritter",
        answerD = "Es hängt vom Rennen ab",
        correctAnswer = 1,
        explanation = "Wenn du den Zweiten überholst, nimmst du seinen Platz ein und bist jetzt auf Platz 2.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 3, 6, 11, 18, 27, ...?",
        answerA = "36",
        answerB = "38",
        answerC = "40",
        answerD = "38",
        correctAnswer = 1,
        explanation = "Die Differenzen sind 3, 5, 7, 9, 11 – steigende ungerade Zahlen. 27 + 11 = 38.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Glühbirnen hängen in einem Zimmer. Im Flur befinden sich drei Schalter. Du darfst nur einmal ins Zimmer. Wie findest du heraus, welcher Schalter zu welcher Birne gehört?",
        answerA = "Zwei Schalter anmachen und einen auslassen",
        answerB = "Einen Schalter lange an, dann aus; zweiten an; reingehen und Temperatur testen",
        answerC = "Alle Schalter der Reihe nach testen",
        answerD = "Das ist unlösbar",
        correctAnswer = 1,
        explanation = "Schalter 1 lange an (Birne wird warm), dann aus. Schalter 2 an. Reingehen: Die warme, dunkle Birne = Schalter 1. Die leuchtende = Schalter 2. Die kalte, dunkle = Schalter 3.",
        difficulty = 2,
        funFact = "Dieses Rätsel lehrt uns, mehrere Eigenschaften (Licht UND Wärme) gleichzeitig zu nutzen."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt mit 90 km/h von Stadt A nach Stadt B (450 km). Ein anderer Zug fährt mit 60 km/h von B nach A. Wie weit ist Zug 2 von Stadt A entfernt, wenn sich die Züge treffen?",
        answerA = "180 km",
        answerB = "270 km",
        answerC = "225 km",
        answerD = "300 km",
        correctAnswer = 0,
        explanation = "Die Züge nähern sich mit 150 km/h. Treffen nach 450/150 = 3 Stunden. Zug 2 ist 3 × 60 = 180 km von B → 450 − 180 = 270 km von A.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Quadrate sind auf einem normalen Schachbrett insgesamt vorhanden (nicht nur 1×1)?",
        answerA = "64",
        answerB = "128",
        answerC = "204",
        answerD = "256",
        correctAnswer = 2,
        explanation = "Quadrate der Größe n×n: (9−n)². Summe: 8²+7²+...+1² = 64+49+36+25+16+9+4+1 = 204.",
        difficulty = 2,
        funFact = "Die meisten Menschen sehen nur die 64 kleinen Felder, vergessen aber alle größeren Quadrate."
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast eine 3-Liter- und eine 5-Liter-Kanne. Wie misst du genau 4 Liter ab?",
        answerA = "Das ist nicht möglich",
        answerB = "5L füllen, 3L abfüllen, Rest (2L) in 3L; 5L erneut füllen, 1L in 3L (bis voll) → 4L bleiben",
        answerC = "3L zweimal in 5L füllen",
        answerD = "5L halb füllen",
        correctAnswer = 1,
        explanation = "5L voll → 3L füllen (2L übrig in 5L) → 3L leeren → 2L in 3L füllen → 5L voll → 3L bis voll füllen (1L aus 5L) → 4L bleiben in 5L.",
        difficulty = 2,
        funFact = "Dieses Rätsel wurde im Film 'Stirb langsam 3' gelöst – mit echten Konsequenzen!"
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist größer: die Zahl der geraden oder ungeraden positiven ganzen Zahlen bis 100?",
        answerA = "Gerade Zahlen (mehr)",
        answerB = "Ungerade Zahlen (mehr)",
        answerC = "Beide gleich viele",
        answerD = "Es kommt auf die Definition an",
        correctAnswer = 2,
        explanation = "Von 1 bis 100 gibt es genau 50 gerade (2,4,...,100) und 50 ungerade (1,3,...,99) Zahlen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn heute Mittwoch ist, was ist dann übermorgen nach übermorgen?",
        answerA = "Samstag",
        answerB = "Sonntag",
        answerC = "Montag",
        answerD = "Dienstag",
        correctAnswer = 1,
        explanation = "Übermorgen = Freitag. Übermorgen nach Freitag = Sonntag.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Mann kauft ein Pferd für 70 €, verkauft es für 80 €, kauft es zurück für 90 € und verkauft es erneut für 100 €. Wie viel Gewinn/Verlust macht er?",
        answerA = "0 € (kein Gewinn)",
        answerB = "10 € Gewinn",
        answerC = "20 € Gewinn",
        answerD = "10 € Verlust",
        correctAnswer = 2,
        explanation = "Transaktion 1: −70+80 = +10 €. Transaktion 2: −90+100 = +10 €. Gesamt: +20 €.",
        difficulty = 2,
        funFact = "Dieses Rätsel verwirrt viele, weil man die Transaktionen getrennt betrachten muss."
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Raum sind 23 Personen. Wie groß ist die Wahrscheinlichkeit, dass mindestens zwei davon am gleichen Tag Geburtstag haben?",
        answerA = "Ca. 10 %",
        answerB = "Ca. 50 %",
        answerC = "Ca. 75 %",
        answerD = "Ca. 90 %",
        correctAnswer = 1,
        explanation = "Das 'Geburtstagsparadoxon': Bei 23 Personen beträgt die Wahrscheinlichkeit bereits ~50,7 %. Sehr überraschend!",
        difficulty = 2,
        funFact = "Bei 70 Personen liegt die Wahrscheinlichkeit bereits bei über 99,9 %."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 1/2 von 2/3?",
        answerA = "1/4",
        answerB = "1/3",
        answerC = "2/5",
        answerD = "1/6",
        correctAnswer = 1,
        explanation = "(1/2) × (2/3) = 2/6 = 1/3.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Flugzeug stürzt genau an der Grenze zwischen Deutschland und Frankreich ab. Wo werden die Überlebenden begraben?",
        answerA = "In Deutschland",
        answerB = "In Frankreich",
        answerC = "An der Grenze",
        answerD = "Überlebende werden nicht begraben",
        correctAnswer = 3,
        explanation = "Überlebende — also lebende Personen — werden nicht begraben.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl sollte das Fragezeichen ersetzen? 2, 6, 12, 20, 30, 42, ?",
        answerA = "52",
        answerB = "54",
        answerC = "56",
        answerD = "58",
        correctAnswer = 2,
        explanation = "Die Zahlen sind n×(n+1): 1×2, 2×3, 3×4, 4×5, 5×6, 6×7, 7×8 = 56.",
        difficulty = 2,
        funFact = "Diese Folge heißt auch 'Oblong numbers' oder 'Pronic numbers'."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Male kann man 10 von 100 subtrahieren?",
        answerA = "10 Mal",
        answerB = "9 Mal",
        answerC = "Unendlich",
        answerD = "Nur 1 Mal",
        correctAnswer = 3,
        explanation = "Nach dem ersten Subtrahieren ist die Zahl 90, nicht mehr 100. Man kann 10 also nur einmal von 100 abziehen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Freunde zahlen je 10 € für ein Hotelzimmer (30 € total). Der Rezeptionist stellt fest, das Zimmer kostet nur 25 €, und schickt einen Boten mit 5 € zurück. Der Bote behält 2 € und gibt jedem 1 € zurück. Jeder zahlte netto 9 €, das sind 27 €. Plus 2 € beim Boten = 29 €. Wo ist der fehlende Euro?",
        answerA = "Der Bote hat ihn",
        answerB = "Das Hotel hat ihn",
        answerC = "Es fehlt keiner – falsches Rechnen",
        answerD = "Er ging verloren",
        correctAnswer = 2,
        explanation = "Das Paradoxon ist ein Rechenfehler: 27 € = 25 € (Hotel) + 2 € (Bote). Man darf die 2 € nicht addieren, sondern muss sie subtrahieren: 27 − 2 = 25 ✓.",
        difficulty = 2,
        funFact = "Dieses Rätsel heißt 'Missing Dollar Riddle' und täuscht durch falsch gewählte Rechenschritte."
    ),

    // ── HARD (12) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Du hast 12 Kugeln, eine ist schwerer oder leichter. Mit einer Balkenwaage und nur 3 Wiegungen: Wie findest du die falsche Kugel?",
        answerA = "Das ist mit 3 Wiegungen nicht möglich",
        answerB = "Immer in Hälften teilen",
        answerC = "Erst 4-4 wiegen, dann mit der guten Gruppe vergleichen",
        answerD = "In 3 Gruppen zu 4 aufteilen und systematisch vergleichen",
        correctAnswer = 3,
        explanation = "Runde 1: 4 vs 4 wiegen. Gleich → falsche Kugel in den anderen 4. Ungleich → System der 8 weiter eingrenzen. Mit 3 Wiegungen lassen sich 3^3 = 27 Möglichkeiten unterscheiden, genug für 24 (12 Kugeln × 2 Möglichkeiten).",
        difficulty = 3,
        funFact = "Mit n Wiegungen kann man (3^n − 3)/2 Kugeln prüfen: 3 Wiegungen → 12 Kugeln."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist die Summe aller ganzen Zahlen von 1 bis 100?",
        answerA = "5000",
        answerB = "4950",
        answerC = "5050",
        answerD = "10100",
        correctAnswer = 2,
        explanation = "Gaußsche Summenformel: n(n+1)/2 = 100×101/2 = 5050.",
        difficulty = 3,
        funFact = "Der 9-jährige Gauß soll diese Summe im Kopf berechnet haben, als der Lehrer die Klasse beschäftigen wollte."
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Brückenüberquerer in der Nacht: A=1 min, B=2 min, C=5 min, D=10 min. Höchstens 2 Personen pro Überquerung, Taschenlampe muss zurückgebracht werden. Was ist die kürzeste Gesamtzeit?",
        answerA = "17 Minuten",
        answerB = "19 Minuten",
        answerC = "21 Minuten",
        answerD = "23 Minuten",
        correctAnswer = 0,
        explanation = "A+B → 2 min. A zurück → 1 min. C+D → 10 min. B zurück → 2 min. A+B → 2 min. Gesamt: 17 Minuten.",
        difficulty = 3,
        funFact = "Dieses Rätsel wird als 'Torch problem' bezeichnet und hat eine nicht-intuitive Optimallösung."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn eine Schnecke den Brunnen tagsüber 3 m hochklettert und nachts 2 m zurückfällt, wie viele Tage braucht sie, um aus einem 10 m tiefen Brunnen zu kommen?",
        answerA = "8 Tage",
        answerB = "10 Tage",
        answerC = "7 Tage",
        answerD = "9 Tage",
        correctAnswer = 2,
        explanation = "Nach 7 Tagen ist sie auf 7 m (netto +1 m/Tag). Am 8. Tag klettert sie 3 m → erreicht 10 m und klettert heraus. Also 8 Tage.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Lilie auf einem Teich verdoppelt sich jeden Tag. Nach 30 Tagen ist der Teich halb bedeckt. An welchem Tag war der Teich halb bedeckt?",
        answerA = "Tag 15",
        answerB = "Tag 20",
        answerC = "Tag 25",
        answerD = "Tag 29",
        correctAnswer = 3,
        explanation = "Da sich die Fläche täglich verdoppelt und am Tag 30 voll ist, war sie am Tag 29 halb bedeckt.",
        difficulty = 3,
        funFact = "Dieses Rätsel illustriert exponentielles Wachstum – wichtig für das Verständnis von Epidemien und Zinseszins."
    ),

    Question(
        categoryId = 12,
        questionText = "Du befragst 100 Personen. 90 trinken Kaffee, 80 Tee, 70 Bier und 60 Cola. Was ist der Mindestanteil, der alle vier trinkt?",
        answerA = "0 %",
        answerB = "10 %",
        answerC = "20 %",
        answerD = "30 %",
        correctAnswer = 0,
        explanation = "Mindestzahl nach dem Inklusionsprinzip: 90+80+70+60 − 3×100 = 300 − 300 = 0. Mindestens 0 % trinken alle vier.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das nächste Element in der Folge: 1, 11, 21, 1211, 111221, ...?",
        answerA = "1112211",
        answerB = "312211",
        answerC = "31221",
        answerD = "1211221",
        correctAnswer = 1,
        explanation = "Look-and-say-Folge: Man beschreibt die vorherige Zahl. 111221 = 'drei Einsen, zwei Zweien, eine Eins' = 312211.",
        difficulty = 3,
        funFact = "Diese Folge wurde von John Horton Conway analysiert – sie wächst asymptotisch mit dem Faktor 1,303577..."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Nullen hat 100! (Hundert Fakultät) am Ende?",
        answerA = "20",
        answerB = "24",
        answerC = "25",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Nullen entstehen durch Faktoren 10 = 2×5. Anzahl der 5er in 100!: ⌊100/5⌋+⌊100/25⌋ = 20+4 = 24.",
        difficulty = 3,
        funFact = "2er kommen häufiger vor als 5er, daher zählt man nur die 5er."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Logiker gehen in eine Bar. Der Barmann fragt: 'Wollen alle drei Bier?' Der erste sagt: 'Weiß ich nicht.' Der zweite sagt: 'Weiß ich nicht.' Was sagt der dritte?",
        answerA = "Ich weiß es auch nicht",
        answerB = "Nein",
        answerC = "Ja",
        answerD = "Nur ich möchte Bier",
        correctAnswer = 2,
        explanation = "'Weiß ich nicht' bedeutet: Ich möchte Bier, aber weiß nicht ob alle wollen (also min. ich will). Da Logiker 1 und 2 Bier wollen, weiß der dritte: alle wollen → 'Ja'.",
        difficulty = 3,
        funFact = "Dieses Rätsel zeigt, wie man durch Verneinung von 'Nein' Information ableiten kann."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du ein Blatt Papier 42-mal in der Mitte faltest, wie dick ist es? (Papier = 0,1 mm)",
        answerA = "Ca. 1 Meter",
        answerB = "Ca. 42 cm",
        answerC = "Ca. von der Erde zum Mond",
        answerD = "Ca. vom Mond zur Sonne",
        correctAnswer = 2,
        explanation = "2^42 × 0,1 mm ≈ 439.804 km. Der Mond ist ~384.400 km entfernt. Das Papier reicht also bis zum Mond und zurück!",
        difficulty = 3,
        funFact = "Exponentielles Wachstum ist für unsere Intuition kaum fassbar – das zeigt dieses Beispiel perfekt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Würfel hat 6 Seiten. Wie viele Würfel braucht man, um einen 3×3×3-Würfel zu bauen, und wie viele kleine Würfel haben genau 2 Seiten sichtbar?",
        answerA = "27 Würfel, 12 mit 2 sichtbaren Seiten",
        answerB = "27 Würfel, 8 mit 2 sichtbaren Seiten",
        answerC = "27 Würfel, 6 mit 2 sichtbaren Seiten",
        answerD = "64 Würfel, 12 mit 2 sichtbaren Seiten",
        correctAnswer = 0,
        explanation = "3³=27 Würfel. Kantenwürfel (2 Seiten sichtbar): 12 Kanten × 1 = 12 (Eckwürfel haben 3, Flächenwürfel 1, Innenwürfel 0 sichtbare Seiten).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Aus einer vollen Tonne Wein wird 1 Liter entnommen und durch Wasser ersetzt. Dann wird wieder 1 Liter entnommen und durch Wasser ersetzt. Nach diesem Vorgang zum zweiten Mal – wie viel Wein ist noch in der Tonne? (Tonne = 100 Liter)",
        answerA = "98 Liter",
        answerB = "98,01 Liter",
        answerC = "97 Liter",
        answerD = "99 Liter",
        correctAnswer = 1,
        explanation = "Nach jeder Entnahme bleibt der Anteil × (99/100). Nach 2 Mal: 100 × (99/100)² = 98,01 Liter.",
        difficulty = 3,
        funFact = "Diese Formel zeigt, dass man nie alle Reste loswerden kann – dasselbe Prinzip gilt für Entgiftungsprozesse im Körper."
    ),

    // ── EXPERT (8) ─────────────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Der Monty-Hall-Problem: Du wählst eine von 3 Türen. Hinter einer ist ein Auto, hinter den anderen Ziegen. Der Moderator öffnet eine Tür mit einer Ziege. Solltest du wechseln?",
        answerA = "Nein, die Wahrscheinlichkeit ist jetzt 50/50",
        answerB = "Ja, wechseln erhöht die Gewinnchance auf 2/3",
        answerC = "Es ist egal",
        answerD = "Nein, deine erste Wahl war besser",
        correctAnswer = 1,
        explanation = "Anfangs: 1/3 Chance. Wechseln: 2/3 Chance. Der Moderator gibt Information preis, die den ursprünglichen Nichtgewinn-Türen zugute kommt. Wechseln ist immer besser!",
        difficulty = 4,
        funFact = "Als Marilyn vos Savant 1990 die korrekte Antwort veröffentlichte, protestierten Tausende Mathematiker – sie hatten Unrecht."
    ),

    Question(
        categoryId = 12,
        questionText = "Was sind die nächsten zwei Buchstaben der Folge: O, T, T, F, F, S, S, E, N, T, ...?",
        answerA = "E, T",
        answerB = "E, Z",
        answerC = "Z, E",
        answerD = "N, E",
        correctAnswer = 0,
        explanation = "Die Buchstaben sind die Anfangsbuchstaben der Zahlen: One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten → Elf (E), Twelve/Zwölf (T).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Primzahlen gibt es zwischen 1 und 100?",
        answerA = "20",
        answerB = "23",
        answerC = "25",
        answerD = "28",
        correctAnswer = 2,
        explanation = "Es gibt genau 25 Primzahlen bis 100: 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97.",
        difficulty = 4,
        funFact = "Bis heute ist unbewiesen, ob es unendlich viele Zwilliprimzahlen (Abstand 2) gibt – eines der großen ungelösten Mathematikprobleme."
    ),

    Question(
        categoryId = 12,
        questionText = "Du würfelst zweimal. Wie groß ist die Wahrscheinlichkeit, dass die Summe mindestens 10 ergibt?",
        answerA = "1/6",
        answerB = "1/12",
        answerC = "1/4",
        answerD = "5/18",
        correctAnswer = 0,
        explanation = "Günstige Ereignisse (≥10): (4,6),(5,5),(5,6),(6,4),(6,5),(6,6) = 6 von 36. 6/36 = 1/6.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "5 Häuser in einer Reihe, je eine Farbe. Einstein-Rätsel: Der Brite lebt im roten Haus. Der Schwede hat einen Hund. Der Däne trinkt Tee. Das grüne Haus steht links vom weißen. Der Grüne trinkt Kaffee. Wer trinkt Wasser?",
        answerA = "Der Brite",
        answerB = "Der Norweger",
        answerC = "Der Deutsche",
        answerD = "Der Schwede",
        correctAnswer = 1,
        explanation = "Das vollständige Einstein-Rätsel (mit allen 14 Hinweisen) ergibt: Der Norweger (Haus 1, blau) trinkt Wasser.",
        difficulty = 4,
        funFact = "Einstein soll behauptet haben, nur 2 % der Menschen könnten dieses Rätsel lösen – obwohl er es selbst erfunden haben soll."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist der Fehler in folgendem Beweis? '1=2': Sei a=b. Dann a²=ab → a²-b²=ab-b² → (a+b)(a-b)=b(a-b) → a+b=b → 2b=b → 2=1",
        answerA = "Die Algebra ist falsch",
        answerB = "Der erste Schritt ist falsch",
        answerC = "Division durch (a-b)=0 ist verboten",
        answerD = "Es gibt keinen Fehler, 1=2 stimmt",
        correctAnswer = 2,
        explanation = "Der Fehler liegt im Schritt (a+b)(a-b) = b(a-b) → (a+b) = b: Division durch (a-b). Da a=b, gilt a-b=0. Division durch 0 ist undefiniert!",
        difficulty = 4,
        funFact = "Ähnliche 'Beweise' für absurde Aussagen nutzen fast immer versteckte Divisionen durch 0."
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast einen 8×8 Schachbrett, aus dem zwei diagonal gegenüberliegende Ecken entfernt wurden (62 Felder). Kann man es mit 31 Dominosteinen (je 2 Felder) vollständig bedecken?",
        answerA = "Ja, es gibt mehrere Lösungen",
        answerB = "Nein, es ist unmöglich",
        answerC = "Nur wenn man Dominosteine diagonal legt",
        answerD = "Nur mit halben Steinen",
        correctAnswer = 1,
        explanation = "Nein! Beide entfernten Ecken sind gleicher Farbe (z.B. weiß). Jeder Domino deckt 1 weiß + 1 schwarz ab. Mit 30 weißen und 32 schwarzen Feldern ist es unmöglich.",
        difficulty = 4,
        funFact = "Dieses Rätsel zeigt die Kraft von Invarianten – eine Eigenschaft, die sich nie ändert, beweist Unmöglichkeit."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 0,999... (unendlich viele Neunen) im Vergleich zu 1?",
        answerA = "Kleiner als 1, aber extrem nah",
        answerB = "Exakt gleich 1",
        answerC = "Unendlich nahe, aber nie gleich",
        answerD = "Das ist mathematisch undefiniert",
        correctAnswer = 1,
        explanation = "0,999... = 1 exakt. Beweis: x=0,999..., 10x=9,999..., 10x−x=9, 9x=9, x=1. Oder: 1/3=0,333... → ×3: 1=0,999...",
        difficulty = 4,
        funFact = "Viele Mathematik-Studenten im ersten Semester glauben dies nicht – es ist aber streng beweisbar."
    ),

    // ── MASTER (5) ─────────────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "100 Piraten stimmen über die Goldverteilung ab. Der ranghöchste macht einen Vorschlag. Über 50 % müssen zustimmen, sonst wird er geworfen. Rational handelnd: Wie viel Gold bekommt Pirat 1 von 100 Münzen?",
        answerA = "1 Münze",
        answerB = "50 Münzen",
        answerC = "96 Münzen",
        answerD = "0 Münzen",
        correctAnswer = 2,
        explanation = "Durch Rückwärtsinduktion: Pirat 1 muss 49 andere überzeugen. Er bietet den Piraten, die bei einem 2er-Plan 0 bekämen, je 1 Münze. So erhält er 100−50+1 = 96 Münzen minus die 50 benötigten Stimmen... ergibt 96.",
        difficulty = 5,
        funFact = "Dieses spieltheoretische Rätsel zeigt, wie rationale Eigeninteressen zu überraschenden Ergebnissen führen."
    ),

    Question(
        categoryId = 12,
        questionText = "Du sitzt in einem Zug. Gegenüber sitzt ein Logiker. Er sagt: 'Der nächste Satz, den ich sage, ist falsch.' Dann: 'Der letzte Satz, den ich sagte, war wahr.' Was folgt daraus?",
        answerA = "Er lügt immer",
        answerB = "Er sagt die Wahrheit",
        answerC = "Ein Paradoxon ohne Lösung in klassischer Logik",
        answerD = "Er ist verwirrt",
        correctAnswer = 2,
        explanation = "Satz A='Der nächste Satz ist falsch', Satz B='A war wahr'. Wenn A wahr → B wahr → A war wahr → B falsch. Widerspruch. Klassisches Lügner-Paradoxon.",
        difficulty = 5,
        funFact = "Das Lügner-Paradoxon führte zur Entwicklung der mathematischen Logik und zu Gödels Unvollständigkeitssatz."
    ),

    Question(
        categoryId = 12,
        questionText = "Beweise: Es gibt unendlich viele Primzahlen. Welche Methode nutzte Euklid?",
        answerA = "Vollständige Induktion über die Primzahlformel",
        answerB = "Annahme endlich viele Primzahlen → Widerspruch durch Produkt+1",
        answerC = "Sieb des Eratosthenes bis Unendlich",
        answerD = "Bernoulli-Ungleichung auf Primzahlen anwenden",
        correctAnswer = 1,
        explanation = "Euklid: Sei P die größte Primzahl. Bilde N = (2×3×5×...×P)+1. N ist durch keine Primzahl bis P teilbar, also selbst prim oder hat größeren Primteiler – Widerspruch.",
        difficulty = 5,
        funFact = "Euklids Beweis aus ~300 v.Chr. gilt als eines der elegantesten mathematischen Argumente der Geschichte."
    ),

    Question(
        categoryId = 12,
        questionText = "30 Gefangene spielen ein Spiel: Jeder sieht eine Zufallszahl (1-30) auf seinem Rücken. Jeder darf nur seinen eigenen sehen, indem er eine Kiste mit Zahlen öffnet. Jeder darf 15 Kisten öffnen. Strategie mit >30% Gesamtüberlebenswahrscheinlichkeit?",
        answerA = "Jeder öffnet zufällige 15 Kisten",
        answerB = "Alle öffnen dieselben 15 Kisten",
        answerC = "Jeder folgt der Zyklusstrategie: eigene Nummer zuerst, dann immer der gefundenen Nummer folgen",
        answerD = "Es gibt keine solche Strategie",
        correctAnswer = 2,
        explanation = "Die Zyklusstrategie: Beginne mit Kiste=eigene Nummer, öffne dann Kiste mit der gefundenen Nummer usw. Überlebenswahrscheinlichkeit ≈31% (vs. 2^(-30) bei zufälliger Wahl).",
        difficulty = 5,
        funFact = "Dieses 'Gefangenen-Kisten-Problem' wurde 2003 von Peter Bro Miltersen und Anna Gal gelöst und überrascht durch die erstaunlich hohe Erfolgsrate."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Aussage über das Halteproblem ist korrekt?",
        answerA = "Es ist lösbar, braucht nur genug Rechenzeit",
        answerB = "Es ist unlösbar – kein Algorithmus kann für alle Programme entscheiden, ob sie stoppen",
        answerC = "Es ist lösbar für Quantencomputer",
        answerD = "Es gilt nur für Turing-Maschinen, nicht für moderne Computer",
        correctAnswer = 1,
        explanation = "Turing bewies 1936: Es gibt keinen allgemeinen Algorithmus H, der für jedes Programm P und Input I entscheidet, ob P(I) jemals stoppt. Beweis durch Diagonalisierung (Widerspruch durch Selbstreferenz).",
        difficulty = 5,
        funFact = "Turings Beweis des Halteproblems legte den Grundstein für die moderne Informatik und bewies grundlegende Grenzen der Berechenbarkeit."
    )
)
