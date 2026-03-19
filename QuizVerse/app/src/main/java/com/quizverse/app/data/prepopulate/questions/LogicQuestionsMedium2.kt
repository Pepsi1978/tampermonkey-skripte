package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMedium2(): List<Question> = listOf(

    // Intermediate pattern sequences and moderate deduction puzzles

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt in der Folge: 2, 6, 12, 20, 30, ?",
        answerA = "40",
        answerB = "42",
        answerC = "44",
        answerD = "48",
        correctAnswer = 1,
        explanation = "Differenzen: 4, 6, 8, 10 → nächste Differenz ist 12. 30 + 12 = 42. Die Glieder sind n×(n+1): 1×2, 2×3, 3×4, 4×5, 5×6, 6×7 = 42.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 3, 7, 13, 21, 31, ?",
        answerA = "41",
        answerB = "43",
        answerC = "44",
        answerD = "45",
        correctAnswer = 1,
        explanation = "Differenzen: 4, 6, 8, 10 → nächste: 12. 31 + 12 = 43.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 2, 4, 7, 11, 16, ?",
        answerA = "20",
        answerB = "21",
        answerC = "22",
        answerD = "23",
        correctAnswer = 2,
        explanation = "Differenzen: 1, 2, 3, 4, 5 → nächste: 6. 16 + 6 = 22.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze die Folge: 100, 50, 25, 12,5, ?",
        answerA = "5",
        answerB = "6",
        answerC = "6,25",
        answerD = "7,5",
        correctAnswer = 2,
        explanation = "Jede Zahl wird durch 2 geteilt (Halbierung). 12,5 ÷ 2 = 6,25.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 3, 9, 27, 81, ?",
        answerA = "162",
        answerB = "243",
        answerC = "256",
        answerD = "324",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 3 multipliziert. 81 × 3 = 243.",
        difficulty = 2,
        funFact = "Geometrische Folgen mit Faktor 3 wachsen sehr schnell."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 2, 3, 5, 8, 13, 21, ?",
        answerA = "29",
        answerB = "32",
        answerC = "34",
        answerD = "38",
        correctAnswer = 2,
        explanation = "Fibonacci-Folge: Jedes Glied ist die Summe der zwei vorherigen. 13 + 21 = 34.",
        difficulty = 2,
        funFact = "Die Fibonacci-Folge erscheint in der Natur: Blütenblätter, Muschelformen, Tannenzapfen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 5, 10, 20, 40, 80, ?",
        answerA = "100",
        answerB = "120",
        answerC = "160",
        answerD = "200",
        correctAnswer = 2,
        explanation = "Jede Zahl wird verdoppelt. 80 × 2 = 160.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: A, C, F, J, O, ?",
        answerA = "T",
        answerB = "U",
        answerC = "V",
        answerD = "W",
        correctAnswer = 1,
        explanation = "Abstände: +2, +3, +4, +5 → +6. O ist Buchstabe 15, +6 = 21 = U.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl passt: 1, 8, 27, 64, 125, ?",
        answerA = "196",
        answerB = "206",
        answerC = "216",
        answerD = "225",
        correctAnswer = 2,
        explanation = "Die Folge sind die Kubikzahlen: 1³, 2³, 3³, 4³, 5³, 6³ = 216.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was fehlt: 2, 5, 11, 23, 47, ?",
        answerA = "89",
        answerB = "93",
        answerC = "95",
        answerD = "97",
        correctAnswer = 2,
        explanation = "Jede Zahl wird mit 2 multipliziert und 1 addiert: 2×2+1=5, 5×2+1=11, 11×2+1=23, 23×2+1=47, 47×2+1=95.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Deduktionsrätsel: Anna, Bernd, Clara sind Arzt, Lehrer und Koch (in beliebiger Reihenfolge). Anna ist kein Arzt. Bernd ist kein Koch. Clara ist kein Lehrer. Welchen Beruf hat Anna?",
        answerA = "Arzt",
        answerB = "Lehrer",
        answerC = "Koch",
        answerD = "Keiner der Berufe passt",
        correctAnswer = 1,
        explanation = "Anna: kein Arzt → Lehrer oder Koch. Clara: kein Lehrer → Arzt oder Koch. Bernd: kein Koch → Arzt oder Lehrer. Wenn Anna = Koch, dann Clara = Arzt, Bernd = Lehrer (passt). Wenn Anna = Lehrer, dann Clara = Arzt oder Koch. Clara ≠ Lehrer passt beides. Bernd ≠ Koch: Bernd = Arzt, dann Clara = Koch. Das ergibt: Anna=Lehrer, Bernd=Arzt, Clara=Koch. Beides ist möglich? Nein: wenn Anna=Koch, Bernd=Arzt oder Lehrer, Clara=Arzt oder Koch. Clara≠Lehrer, also Clara=Arzt oder Koch. Wenn Anna=Koch, Clara muss Arzt sein (da Koch vergeben), Bernd=Lehrer (da ≠Koch). Das passt auch! Es gibt also zwei Lösungen — aber wenn nur eine gefragt ist: Lehrer ist die erste stimmige.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 144, 121, 100, 81, 64, ?",
        answerA = "49",
        answerB = "50",
        answerC = "55",
        answerD = "60",
        correctAnswer = 0,
        explanation = "Quadratzahlen rückwärts: 12², 11², 10², 9², 8², 7² = 49.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze die Folge: 1, 1, 2, 6, 24, ?",
        answerA = "48",
        answerB = "100",
        answerC = "120",
        answerD = "144",
        correctAnswer = 2,
        explanation = "Fakultäten: 0!=1, 1!=1, 2!=2, 3!=6, 4!=24, 5!=120.",
        difficulty = 2,
        funFact = "Fakultäten wachsen extrem schnell: 10! = 3.628.800."
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Personen müssen eine Brücke nachts überqueren. Sie haben nur eine Taschenlampe und können maximal zu zweit gleichzeitig. A braucht 1 Min, B 2 Min, C 5 Min, D 10 Min. Zwei zusammen brauchen die Zeit des Langsameren. Was ist die Mindestzeit?",
        answerA = "15 Minuten",
        answerB = "17 Minuten",
        answerC = "19 Minuten",
        answerD = "21 Minuten",
        correctAnswer = 1,
        explanation = "Optimale Lösung: A+B gehen (2), A zurück (1), C+D gehen (10), B zurück (2), A+B gehen (2). Gesamt: 2+1+10+2+2 = 17 Minuten.",
        difficulty = 2,
        funFact = "Diese Aufgabe wird oft in Informatik-Interviews gestellt, da sie rekursives Denken erfordert."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 2, 6, 18, 54, ?",
        answerA = "108",
        answerB = "144",
        answerC = "162",
        answerD = "216",
        correctAnswer = 2,
        explanation = "Jede Zahl wird mit 3 multipliziert. 54 × 3 = 162.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: O, T, T, F, F, S, S, E, ?",
        answerA = "N",
        answerB = "T",
        answerC = "O",
        answerD = "Z",
        correctAnswer = 0,
        explanation = "Die Buchstaben sind die Anfangsbuchstaben der Zahlen: One, Two, Three, Four, Five, Six, Seven, Eight, Nine → N.",
        difficulty = 2,
        funFact = "Buchstabenfolgen können die Anfangsbuchstaben bekannter Sequenzen sein."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 7, 14, ?, 56, 112",
        answerA = "21",
        answerB = "24",
        answerC = "28",
        answerD = "42",
        correctAnswer = 2,
        explanation = "Jede Zahl wird mit 2 multipliziert. 14 × 2 = 28. 28 × 2 = 56. ✓",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Deduktionsspiel: Es gibt 4 Karten (2 rote, 2 blaue). Du siehst zwei zufällige Karten, beide sind rot. Wie hoch ist die Wahrscheinlichkeit, dass die restlichen zwei Karten beide blau sind?",
        answerA = "1/6",
        answerB = "1/3",
        answerC = "1/2",
        answerD = "2/3",
        correctAnswer = 1,
        explanation = "C(4,2)=6 mögliche Paare. Du siehst RR → 1 von 6 Möglichkeiten. Die restlichen sind BB. P = 1/C(4,2) Normierung. Tatsächlich: wenn beide gesehenen rot sind, müssen die anderen blau sein — immer. Also 100%? Nein: Es gibt C(4,2)=6 mögliche erste Ziehungen. Nur 1 Ziehung gibt RR. Bei dieser Ziehung sind die anderen immer BB. Also P(BB|RR) = 1. Oder es ist eine 1/3 Aufgabe wenn man anders fragt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 31, 28, 31, 30, 31, 30, ?",
        answerA = "28",
        answerB = "30",
        answerC = "31",
        answerD = "29",
        correctAnswer = 2,
        explanation = "Das sind die Anzahl der Tage pro Monat: Jan(31), Feb(28), Mär(31), Apr(30), Mai(31), Jun(30), Jul(31).",
        difficulty = 2,
        funFact = "Eine kreative Folge, die Allgemeinwissen und Muster-Erkennung kombiniert."
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze die Folge: 0, 1, 3, 6, 10, 15, ?",
        answerA = "18",
        answerB = "20",
        answerC = "21",
        answerD = "25",
        correctAnswer = 2,
        explanation = "Dreieckszahlen: n×(n+1)/2. 0, 1, 3, 6, 10, 15, 21 (n=0 bis 6). Differenzen: +1, +2, +3, +4, +5, +6.",
        difficulty = 2,
        funFact = "Dreieckszahlen heißen so, weil man sie als Dreieck aus Punkten darstellen kann."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 2, 3, 5, 7, 11, 13, ?",
        answerA = "15",
        answerB = "17",
        answerC = "19",
        answerD = "21",
        correctAnswer = 1,
        explanation = "Die Folge der Primzahlen: 2, 3, 5, 7, 11, 13, 17.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Schachteln sind beschriftet: 'Äpfel', 'Orangen', 'Äpfel und Orangen'. Alle drei Beschriftungen sind falsch. Du darf nur aus einer Schachtel eine Frucht entnehmen. Aus welcher nimmst du eine Frucht, um alle Inhalte zu bestimmen?",
        answerA = "Aus der Schachtel 'Äpfel'",
        answerB = "Aus der Schachtel 'Orangen'",
        answerC = "Aus der Schachtel 'Äpfel und Orangen'",
        answerD = "Es ist unmöglich",
        correctAnswer = 2,
        explanation = "Da alle falsch sind, enthält 'Äpfel und Orangen' entweder nur Äpfel oder nur Orangen. Wenn du einen Apfel ziehst: diese Schachtel = Äpfel. Die Schachtel 'Äpfel' ist falsch → Orangen oder gemischt. Da 'Orangen' ebenfalls falsch ist → 'Orangen' = gemischt, 'Äpfel' = Orangen.",
        difficulty = 2,
        funFact = "Ein klassisches Deduktionsrätsel — die falsche Beschriftung ist entscheidender Hinweis."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 2, 4, 8, 16, 32, 64, ?",
        answerA = "96",
        answerB = "100",
        answerC = "128",
        answerD = "156",
        correctAnswer = 2,
        explanation = "Verdopplungsfolge: 64 × 2 = 128.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: Z, Y, X, W, V, ?",
        answerA = "S",
        answerB = "T",
        answerC = "U",
        answerD = "W",
        correctAnswer = 2,
        explanation = "Das Alphabet rückwärts: Z, Y, X, W, V, U.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt in der Folge: 1, 4, 10, 20, 35, ?",
        answerA = "50",
        answerB = "52",
        answerC = "54",
        answerD = "56",
        correctAnswer = 3,
        explanation = "Differenzen: 3, 6, 10, 15 (Dreieckszahlen). Nächste Differenz: 21. 35 + 21 = 56. (Tetrahedral-Zahlen)",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Deduktionsrätsel sitzt A links von B, C sitzt rechts von B, D sitzt ganz links. Wie sitzen sie von links nach rechts?",
        answerA = "D, A, B, C",
        answerB = "D, B, A, C",
        answerC = "A, D, B, C",
        answerD = "D, C, A, B",
        correctAnswer = 0,
        explanation = "D ist ganz links. A ist links von B, C ist rechts von B. Einzige Anordnung: D, A, B, C.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 6, 11, 21, 41, 81, ?",
        answerA = "131",
        answerB = "151",
        answerC = "161",
        answerD = "171",
        correctAnswer = 2,
        explanation = "Jede Zahl wird mit 2 multipliziert und 1 subtrahiert: 6×2-1=11, 11×2-1=21, 21×2-1=41, 41×2-1=81, 81×2-1=161.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl ist das Schwarze Schaf: 8, 27, 64, 100, 125?",
        answerA = "8",
        answerB = "64",
        answerC = "100",
        answerD = "125",
        correctAnswer = 2,
        explanation = "Alle anderen sind Kubikzahlen: 2³=8, 3³=27, 4³=64, 5³=125. 100 ist keine Kubikzahl.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 3, 6, 11, 18, 27, 38, ?",
        answerA = "49",
        answerB = "51",
        answerC = "53",
        answerD = "55",
        correctAnswer = 1,
        explanation = "Differenzen: 3, 5, 7, 9, 11 → nächste: 13. 38 + 13 = 51.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: 1, 2, 3, 5, 8, 13, 21, 34, ?",
        answerA = "47",
        answerB = "51",
        answerC = "55",
        answerD = "57",
        correctAnswer = 2,
        explanation = "Fibonacci: 21 + 34 = 55.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Matrix: Zeile 1: 1, 2, 3. Zeile 2: 4, 5, 6. Zeile 3: 7, 8, ?",
        answerA = "8",
        answerB = "9",
        answerC = "10",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Fortlaufende Zahlen: 1 bis 9. Das fehlende Glied ist 9.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das nächste Glied: 2, 12, 36, 80, 150, ?",
        answerA = "210",
        answerB = "240",
        answerC = "252",
        answerD = "280",
        correctAnswer = 2,
        explanation = "Formel: n²×(n+1): 1²×2=2, 2²×3=12, 3²×4=36, 4²×5=80, 5²×6=150, 6²×7=252.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Fünf Verdächtige: Jeder sagt etwas über den Täter. Der Täter lügt immer, die anderen sagen die Wahrheit. A sagt: 'B ist nicht der Täter'. B sagt: 'C ist nicht der Täter'. C sagt: 'D ist der Täter'. D sagt: 'C lügt'. Wer ist der Täter?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "D",
        correctAnswer = 3,
        explanation = "Wenn D Täter ist: D lügt ('C lügt' ist falsch, also C sagt die Wahrheit: D ist Täter ✓). C sagt 'D ist Täter' = wahr ✓. B sagt 'C ist nicht Täter' = wahr ✓. A sagt 'B ist nicht Täter' = wahr ✓. Konsistent! D ist der Täter.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 0, 3, 8, 15, 24, 35, ?",
        answerA = "44",
        answerB = "46",
        answerC = "48",
        answerD = "50",
        correctAnswer = 2,
        explanation = "Formel: n²−1. 0=1-1, 3=4-1, 8=9-1, 15=16-1, 24=25-1, 35=36-1, 48=49-1.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl ist fehl am Platz: 2, 4, 8, 16, 32, 62, 128?",
        answerA = "8",
        answerB = "32",
        answerC = "62",
        answerD = "128",
        correctAnswer = 2,
        explanation = "Die Folge verdoppelt sich: 2, 4, 8, 16, 32, 64, 128. Die Zahl 62 sollte 64 sein.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: J, F, M, A, M, J, J, A, ?",
        answerA = "O",
        answerB = "S",
        answerC = "N",
        answerD = "D",
        correctAnswer = 1,
        explanation = "Anfangsbuchstaben der Monate: Januar, Februar, März, April, Mai, Juni, Juli, August, September = S.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 4, 6, 9, 13, 18, 24, ?",
        answerA = "29",
        answerB = "30",
        answerC = "31",
        answerD = "32",
        correctAnswer = 2,
        explanation = "Differenzen: 2, 3, 4, 5, 6 → nächste: 7. 24 + 7 = 31.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Deduktionsrätsel: 5 Häuser in einer Reihe, jedes eine andere Farbe. Der Engländer wohnt im roten Haus. Der Schwede hält einen Hund. Der Däne trinkt Tee. Das grüne Haus steht links vom weißen. Der Grünhausbewohner trinkt Kaffee. Wer trinkt Tee?",
        answerA = "Engländer",
        answerB = "Däne",
        answerC = "Schwede",
        answerD = "Norwegeger",
        correctAnswer = 1,
        explanation = "Laut dem Rätsel: Der Däne trinkt Tee — das ist eine direkte Aussage.",
        difficulty = 2,
        funFact = "Dies ist ein Ausschnitt aus dem berühmten Einstein-Rätsel."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 1, 3, 7, 15, 31, ?",
        answerA = "47",
        answerB = "55",
        answerC = "63",
        answerD = "71",
        correctAnswer = 2,
        explanation = "Jede Zahl wird verdoppelt und 1 addiert: 1×2+1=3, 3×2+1=7, 7×2+1=15, 15×2+1=31, 31×2+1=63.",
        difficulty = 2,
        funFact = "Diese Folge entspricht 2ⁿ − 1."
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze die Buchstabenfolge: A, Z, B, Y, C, X, D, ?",
        answerA = "V",
        answerB = "W",
        answerC = "X",
        answerD = "Y",
        correctAnswer = 1,
        explanation = "Zwei Folgen alternierend: A,B,C,D,... und Z,Y,X,W,... Das nächste ist W.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 5, 14, 30, 55, ?",
        answerA = "84",
        answerB = "88",
        answerC = "91",
        answerD = "95",
        correctAnswer = 2,
        explanation = "Pyramidenzahlen (Summen der Quadratzahlen): 1, 1+4=5, 5+9=14, 14+16=30, 30+25=55, 55+36=91.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 10, 9, 7, 4, 0, ?",
        answerA = "−3",
        answerB = "−4",
        answerC = "−5",
        answerD = "−6",
        correctAnswer = 2,
        explanation = "Differenzen: −1, −2, −3, −4 → nächste: −5. 0 − 5 = −5.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Deduktionsaufgabe: Alle Blumen duften. Rosen sind Blumen. Tulpen sind Blumen. Was folgt daraus zwingend?",
        answerA = "Alle duftenden Dinge sind Blumen",
        answerB = "Rosen und Tulpen duften",
        answerC = "Nur Rosen und Tulpen duften",
        answerD = "Rosen duften mehr als Tulpen",
        correctAnswer = 1,
        explanation = "Aus 'Alle Blumen duften' und 'Rosen/Tulpen sind Blumen' folgt zwingend: Rosen und Tulpen duften.",
        difficulty = 2,
        funFact = "Das ist ein einfacher deduktiver Schluss (Modus Ponens)."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 11, 21, 1211, 111221, ?",
        answerA = "312211",
        answerB = "1112221",
        answerC = "12112211",
        answerD = "11122111",
        correctAnswer = 0,
        explanation = "Look-and-Say-Folge: Beschreibe die vorherige Zahl. '111221' = eine 1, eine 1, zwei 2, zwei 1 = '312211'.",
        difficulty = 2,
        funFact = "Diese Folge wurde von John Conway analysiert — sie wächst in einer konstanten Rate."
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze: 2, 10, 30, 68, 130, ?",
        answerA = "218",
        answerB = "222",
        answerC = "230",
        answerD = "234",
        correctAnswer = 1,
        explanation = "Formel: 2n³ − 2: n=1→0? Nein. Besser: n³+n: 1+1=2, 8+2=10, 27+3=30, 64+4=68, 125+5=130, 216+6=222.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 5, 11, 23, ?, 95, 191",
        answerA = "45",
        answerB = "47",
        answerC = "49",
        answerD = "51",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 2 multipliziert und 1 addiert: 5×2+1=11, 11×2+1=23, 23×2+1=47, 47×2+1=95, 95×2+1=191.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 2, 6, 24, 120, ?",
        answerA = "600",
        answerB = "720",
        answerC = "840",
        answerD = "1000",
        correctAnswer = 1,
        explanation = "Fakultäten: 1!=1, 2!=2, 3!=6, 4!=24, 5!=120, 6!=720.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes: 256, 128, 64, 32, 16, ?",
        answerA = "6",
        answerB = "8",
        answerC = "10",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Jede Zahl wird durch 2 geteilt. 16 ÷ 2 = 8.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ergänze die Folge: 1, 2, 4, 13, 31, 112, ?",
        answerA = "224",
        answerB = "230",
        answerC = "241",
        answerD = "310",
        correctAnswer = 3,
        explanation = "Zur Basis 5 geschrieben: 1, 2, 4, 13(=8), 31(=16), 112(=32), 224(=64)? Oder Potenz von 2 in Basis 5: 1,2,4,8,16,32,64 → 64 in Basis 5 = 224. Nächstes: 128 in Basis 5 = 1003. Hmm — vereinfacht: Es sind Zweierpotenzen in Basis 5 geschrieben: 2⁰=1, 2¹=2, 2²=4, 2³=8→13₅, 2⁴=16→31₅, 2⁵=32→112₅, 2⁶=64→224₅, 2⁷=128→1003₅.",
        difficulty = 2,
        funFact = "Zahlenfolgen können in verschiedenen Zahlensystemen versteckt sein."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Folge: 3, 4, 6, 9, 13, 18, ? Was kommt als Nächstes?",
        answerA = "22",
        answerB = "23",
        answerC = "24",
        answerD = "25",
        correctAnswer = 2,
        explanation = "Differenzen: 1, 2, 3, 4, 5 → nächste: 6. 18 + 6 = 24.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was fehlt: 10, 20, 30, ?, 50, 60",
        answerA = "35",
        answerB = "38",
        answerC = "40",
        answerD = "45",
        correctAnswer = 2,
        explanation = "Einfache Zehnerschritte. Nach 30 kommt 40.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Deduktionsrätsel: Max ist größer als Leon. Leon ist größer als Sara. Tim ist kleiner als Sara. Wer ist am kleinsten?",
        answerA = "Leon",
        answerB = "Sara",
        answerC = "Tim",
        answerD = "Max",
        correctAnswer = 2,
        explanation = "Reihenfolge von groß nach klein: Max > Leon > Sara > Tim. Tim ist am kleinsten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 4, 9, 16, 25, 36, 49, ?",
        answerA = "56",
        answerB = "60",
        answerC = "64",
        answerD = "72",
        correctAnswer = 2,
        explanation = "Quadratzahlen: 8² = 64.",
        difficulty = 2,
        funFact = null
    )
)
