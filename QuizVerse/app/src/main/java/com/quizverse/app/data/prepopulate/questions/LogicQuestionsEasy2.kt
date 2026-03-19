package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsEasy2(): List<Question> = listOf(

    // Simple number sequences, basic patterns, easy word puzzles

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes in der Folge: 1, 3, 5, 7, 9, ...?",
        answerA = "10",
        answerB = "11",
        answerC = "12",
        answerD = "13",
        correctAnswer = 1,
        explanation = "Es handelt sich um ungerade Zahlen: jede Zahl ist um 2 größer als die vorherige. Nach 9 kommt 11.",
        difficulty = 1,
        funFact = "Ungerade Zahlen spielen in der Mathematik eine wichtige Rolle – zum Beispiel sind alle Primzahlen außer 2 ungerade."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 2, 4, 6, 8, ...?",
        answerA = "9",
        answerB = "10",
        answerC = "12",
        answerD = "11",
        correctAnswer = 1,
        explanation = "Gerade Zahlen: jede Zahl ist um 2 größer. Nach 8 kommt 10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 10, 20, 30, 40, ...?",
        answerA = "45",
        answerB = "50",
        answerC = "41",
        answerD = "60",
        correctAnswer = 1,
        explanation = "Zehner-Schritte: jede Zahl ist um 10 größer. Nach 40 kommt 50.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 100, 90, 80, 70, ...?",
        answerA = "65",
        answerB = "60",
        answerC = "55",
        answerD = "50",
        correctAnswer = 1,
        explanation = "Absteigende Zehner-Schritte: jede Zahl ist um 10 kleiner. Nach 70 kommt 60.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 4, 9, 16, 25, ...?",
        answerA = "30",
        answerB = "36",
        answerC = "35",
        answerD = "32",
        correctAnswer = 1,
        explanation = "Es sind Quadratzahlen: 1²=1, 2²=4, 3²=9, 4²=16, 5²=25. Die nächste ist 6²=36.",
        difficulty = 1,
        funFact = "Quadratzahlen entstehen immer, wenn man eine Zahl mit sich selbst multipliziert."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 3, 6, 9, 12, ...?",
        answerA = "13",
        answerB = "15",
        answerC = "14",
        answerD = "18",
        correctAnswer = 1,
        explanation = "Vielfache der Zahl 3: jede Zahl ist um 3 größer. Nach 12 kommt 15.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: A, C, E, G, ...?",
        answerA = "H",
        answerB = "I",
        answerC = "J",
        answerD = "K",
        correctAnswer = 1,
        explanation = "Es werden nur die Buchstaben an ungeraden Positionen verwendet (A=1, C=3, E=5, G=7). Der nächste ist I=9.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: Z, Y, X, W, ...?",
        answerA = "U",
        answerB = "V",
        answerC = "T",
        answerD = "S",
        correctAnswer = 1,
        explanation = "Das Alphabet rückwärts: nach Z, Y, X, W kommt V.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 2, 4, 7, 11, ...?",
        answerA = "14",
        answerB = "16",
        answerC = "15",
        answerD = "17",
        correctAnswer = 1,
        explanation = "Die Abstände zwischen den Zahlen werden größer: +1, +2, +3, +4 – also kommt +5, was 11+5=16 ergibt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 5, 10, 15, 20, ...?",
        answerA = "24",
        answerB = "25",
        answerC = "30",
        answerD = "22",
        correctAnswer = 1,
        explanation = "Vielfache der Zahl 5: jede Zahl ist um 5 größer. Nach 20 kommt 25.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt: 2, ?, 8, 11, 14?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 1,
        explanation = "Die Zahlen steigen jeweils um 3: 2+3=5, 5+3=8, 8+3=11, 11+3=14. Die fehlende Zahl ist 5.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: Montag, Mittwoch, Freitag, ...?",
        answerA = "Samstag",
        answerB = "Sonntag",
        answerC = "Dienstag",
        answerD = "Donnerstag",
        correctAnswer = 1,
        explanation = "Es werden immer Wochentage mit einem Tag Abstand genannt. Nach Freitag kommt (mit einem Tag überspringen: Samstag überspringen) Sonntag.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: Januar, März, Mai, Juli, ...?",
        answerA = "August",
        answerB = "September",
        answerC = "Oktober",
        answerD = "November",
        correctAnswer = 1,
        explanation = "Monate mit ungerader Nummer: Januar (1), März (3), Mai (5), Juli (7), September (9).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Dreiecke siehst du, wenn du ein großes Dreieck in 4 gleiche Teile teilst?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 1,
        explanation = "Du siehst 4 kleine Dreiecke plus 1 großes Dreieck insgesamt = 5 Dreiecke.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: ○○●, ○●●, ●●●, ...?",
        answerA = "○○○",
        answerB = "●○●",
        answerC = "○●○",
        answerD = "●●○",
        correctAnswer = 0,
        explanation = "Das Muster zeigt zunehmend mehr gefüllte Kreise (0,1,2,3) und dann beginnt das Muster neu mit 0 gefüllten Kreisen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht in die Reihe: Apfel, Birne, Kartoffel, Pflaume?",
        answerA = "Apfel",
        answerB = "Birne",
        answerC = "Kartoffel",
        answerD = "Pflaume",
        correctAnswer = 2,
        explanation = "Apfel, Birne und Pflaume sind Früchte. Die Kartoffel ist ein Gemüse (genauer: eine Knolle), sie passt nicht in die Gruppe.",
        difficulty = 1,
        funFact = "Die Kartoffel stammt ursprünglich aus Südamerika und kam erst im 16. Jahrhundert nach Europa."
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht: Hund, Katze, Goldfisch, Rose?",
        answerA = "Hund",
        answerB = "Katze",
        answerC = "Goldfisch",
        answerD = "Rose",
        correctAnswer = 3,
        explanation = "Hund, Katze und Goldfisch sind Haustiere (Tiere). Die Rose ist eine Pflanze – sie passt nicht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht: Rot, Blau, Grün, Tisch?",
        answerA = "Rot",
        answerB = "Blau",
        answerC = "Grün",
        answerD = "Tisch",
        correctAnswer = 3,
        explanation = "Rot, Blau und Grün sind Farben. Ein Tisch ist ein Möbelstück – er passt nicht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht: Geige, Klavier, Flöte, Trompete?",
        answerA = "Geige",
        answerB = "Klavier",
        answerC = "Flöte",
        answerD = "Trompete",
        correctAnswer = 1,
        explanation = "Flöte und Trompete sind Blasinstrumente. Die Geige ist ein Streichinstrument. Das Klavier ist ein Tasteninstrument – es wird weder geblasen noch gestrichen.",
        difficulty = 1,
        funFact = "Das Klavier gehört technisch gesehen zu den Schlaginstrumenten, da Hämmer auf Saiten schlagen."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn HAUS = 4 und TISCH = 5, was ist dann STUHL?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "3",
        correctAnswer = 1,
        explanation = "Die Zahlen entsprechen der Anzahl der Buchstaben: HAUS=4 Buchstaben, TISCH=5 Buchstaben, STUHL=5 Buchstaben.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 1, 2, 3, 5, 8, ...?",
        answerA = "10",
        answerB = "11",
        answerC = "13",
        answerD = "12",
        correctAnswer = 2,
        explanation = "Fibonacci-Folge: jede Zahl ist die Summe der zwei vorherigen. 5+8=13.",
        difficulty = 1,
        funFact = "Die Fibonacci-Folge taucht in der Natur überall auf: in Blütenblättern, Schneckenhäusern und Tannenzapfen."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn Rot = 3, Blau = 4 und Grün = 5, was ist dann Gelb?",
        answerA = "3",
        answerB = "4",
        answerC = "6",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Die Zahlen entsprechen den Buchstaben im Farbwort: Rot=3, Blau=4, Grün=4, Gelb=4.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes im Muster: AB, BC, CD, DE, ...?",
        answerA = "EG",
        answerB = "EF",
        answerC = "FG",
        answerD = "DF",
        correctAnswer = 1,
        explanation = "Jedes Paar verschiebt sich um einen Buchstaben nach vorne: AB, BC, CD, DE, EF.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Ecken hat ein Würfel?",
        answerA = "6",
        answerB = "8",
        answerC = "12",
        answerD = "4",
        correctAnswer = 1,
        explanation = "Ein Würfel hat 8 Ecken, 12 Kanten und 6 Flächen.",
        difficulty = 1,
        funFact = "Die Summe der Augenzahlen gegenüberliegender Seiten eines Würfels ergibt immer 7."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 1, 3, 9, 27, ...?",
        answerA = "54",
        answerB = "81",
        answerC = "63",
        answerD = "36",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 3 multipliziert: 1×3=3, 3×3=9, 9×3=27, 27×3=81.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort ergibt sich, wenn man alle Vokale aus 'SCHULE' entfernt?",
        answerA = "SCHL",
        answerB = "SHL",
        answerC = "SCHL",
        answerD = "SCH",
        correctAnswer = 0,
        explanation = "Die Vokale in SCHULE sind U und E. Entfernt man sie: S-C-H-L (=SCHL).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Seiten hat ein Sechseck?",
        answerA = "5",
        answerB = "7",
        answerC = "6",
        answerD = "8",
        correctAnswer = 2,
        explanation = "Das Wort 'Sechseck' verrät es bereits: 'Sechs' + 'Eck' = eine Form mit 6 Seiten.",
        difficulty = 1,
        funFact = "Bienenwaben haben sechseckige Zellen – das ist die platzsparendste Form, die die Natur kennt."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 50, 45, 40, 35, ...?",
        answerA = "25",
        answerB = "30",
        answerC = "28",
        answerD = "32",
        correctAnswer = 1,
        explanation = "Absteigende Folge um 5: 50-5=45, 45-5=40, 40-5=35, 35-5=30.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Wörter enthält der Satz: 'Der Hund bellt laut'?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "2",
        correctAnswer = 1,
        explanation = "Der (1), Hund (2), bellt (3), laut (4) – es sind 4 Wörter.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht: Sonne, Mond, Stern, Regen?",
        answerA = "Sonne",
        answerB = "Mond",
        answerC = "Stern",
        answerD = "Regen",
        correctAnswer = 3,
        explanation = "Sonne, Mond und Stern sind Himmelskörper. Regen ist ein Wetterphänomen – er passt nicht in die Gruppe.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes im Muster: 1, 4, 2, 5, 3, 6, ...?",
        answerA = "7",
        answerB = "4",
        answerC = "8",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Es wechseln zwei Folgen ab: 1,2,3,... und 4,5,6,... Die nächste Zahl in der ersten Folge ist 4.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Buchstaben hat das Wort 'ELEFANT'?",
        answerA = "6",
        answerB = "7",
        answerC = "8",
        answerD = "5",
        correctAnswer = 1,
        explanation = "E-L-E-F-A-N-T = 7 Buchstaben.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das fehlende Wort: Hund verhält sich zu Welpe wie Katze zu ...?",
        answerA = "Pfote",
        answerB = "Kätzchen",
        answerC = "Miau",
        answerD = "Kater",
        correctAnswer = 1,
        explanation = "Ein Welpe ist ein junger Hund. Ein Kätzchen ist eine junge Katze – das ist die analoge Beziehung.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das fehlende Wort: Vogel verhält sich zu Nest wie Biene zu ...?",
        answerA = "Blume",
        answerB = "Honig",
        answerC = "Bienenstock",
        answerD = "Wabe",
        correctAnswer = 2,
        explanation = "Ein Nest ist das Zuhause eines Vogels. Ein Bienenstock ist das Zuhause einer Biene.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das fehlende Wort: Tag verhält sich zu Nacht wie Sommer zu ...?",
        answerA = "Frühling",
        answerB = "Herbst",
        answerC = "Winter",
        answerD = "Regen",
        correctAnswer = 2,
        explanation = "Tag und Nacht sind Gegensätze. Sommer und Winter sind ebenfalls Gegensätze.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Primzahlen gibt es zwischen 1 und 10?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "2",
        correctAnswer = 1,
        explanation = "Primzahlen zwischen 1 und 10: 2, 3, 5, 7 – das sind 4 Primzahlen.",
        difficulty = 1,
        funFact = "Eine Primzahl ist eine Zahl, die nur durch 1 und sich selbst teilbar ist."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: ▲▲□, ▲□□, □□□, ...?",
        answerA = "▲▲▲",
        answerB = "▲□▲",
        answerC = "□▲□",
        answerD = "□□▲",
        correctAnswer = 0,
        explanation = "Die Anzahl der Dreiecke nimmt ab: 2, 1, 0 – dann beginnt das Muster neu mit 3 Dreiecken (▲▲▲).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn alle Katzen Tiere sind und alle Tiger Katzen sind, was folgt daraus?",
        answerA = "Alle Tiere sind Tiger",
        answerB = "Alle Tiger sind Tiere",
        answerC = "Manche Katzen sind Tiger",
        answerD = "Manche Tiere sind keine Katzen",
        correctAnswer = 1,
        explanation = "Wenn alle Tiger Katzen sind und alle Katzen Tiere sind, dann sind alle Tiger auch Tiere. Das ist einfache Logik.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 2, 6, 18, 54, ...?",
        answerA = "108",
        answerB = "162",
        answerC = "100",
        answerD = "72",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 3 multipliziert: 2×3=6, 6×3=18, 18×3=54, 54×3=162.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist der nächste Buchstabe: M, T, W, T, F, S, ...?",
        answerA = "M",
        answerB = "S",
        answerC = "T",
        answerD = "W",
        correctAnswer = 1,
        explanation = "Die Anfangsbuchstaben der Wochentage auf Englisch: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday – dann kommt Sunday (S).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Tage hat ein Schaltjahr?",
        answerA = "364",
        answerB = "365",
        answerC = "366",
        answerD = "367",
        correctAnswer = 2,
        explanation = "Ein normales Jahr hat 365 Tage. Ein Schaltjahr hat 366 Tage, weil der Februar einen zusätzlichen Tag (29. Februar) bekommt.",
        difficulty = 1,
        funFact = "Schaltjahre gibt es alle 4 Jahre, außer bei vollen Jahrhundertjahren, die nicht durch 400 teilbar sind."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 64, 32, 16, 8, ...?",
        answerA = "2",
        answerB = "4",
        answerC = "6",
        answerD = "0",
        correctAnswer = 1,
        explanation = "Jede Zahl wird durch 2 geteilt: 64÷2=32, 32÷2=16, 16÷2=8, 8÷2=4.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort passt nicht: Hammer, Säge, Nagel, Schraubenzieher?",
        answerA = "Hammer",
        answerB = "Säge",
        answerC = "Nagel",
        answerD = "Schraubenzieher",
        correctAnswer = 2,
        explanation = "Hammer, Säge und Schraubenzieher sind Werkzeuge. Ein Nagel ist ein Befestigungsmittel (Material), kein Werkzeug.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das fehlende Wort: Buch verhält sich zu Seite wie Baum zu ...?",
        answerA = "Blatt",
        answerB = "Ast",
        answerC = "Wurzel",
        answerD = "Wald",
        correctAnswer = 0,
        explanation = "Ein Buch besteht aus Seiten. Ein Baum besteht aus (unter anderem) Blättern.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das fehlende Wort: Wasser verhält sich zu nass wie Feuer zu ...?",
        answerA = "Flamme",
        answerB = "Heiß",
        answerC = "Rot",
        answerD = "Rauch",
        correctAnswer = 1,
        explanation = "Wasser ist 'nass', Feuer ist 'heiß' – beides sind typische Eigenschaften dieser Elemente.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 0, 1, 1, 2, 3, 5, 8, 13, ...?",
        answerA = "18",
        answerB = "21",
        answerC = "20",
        answerD = "16",
        correctAnswer = 1,
        explanation = "Fibonacci-Folge: jede Zahl ist die Summe der zwei vorherigen. 8+13=21.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele gerade Zahlen gibt es zwischen 1 und 20?",
        answerA = "9",
        answerB = "10",
        answerC = "11",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Gerade Zahlen zwischen 1 und 20: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 – das sind 10 Zahlen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: Frühling, Sommer, Herbst, ...?",
        answerA = "Januar",
        answerB = "Winter",
        answerC = "Frost",
        answerD = "Schnee",
        correctAnswer = 1,
        explanation = "Es sind die vier Jahreszeiten in der richtigen Reihenfolge: Frühling, Sommer, Herbst, Winter.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: Einhorn, Zweier, Dreier, ...?",
        answerA = "Dreier",
        answerB = "Vierer",
        answerC = "Fünfer",
        answerD = "Viereck",
        correctAnswer = 1,
        explanation = "Ein-horn (1), Zwei-er (2), Drei-er (3) – das Muster folgt den Zahlen. Nach 3 kommt 4, also Vierer.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Buchstaben hat das Wort 'RECHTSCHREIBUNG'?",
        answerA = "14",
        answerB = "15",
        answerC = "13",
        answerD = "16",
        correctAnswer = 1,
        explanation = "R-E-C-H-T-S-C-H-R-E-I-B-U-N-G = 15 Buchstaben.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt als Nächstes: 7, 14, 21, 28, ...?",
        answerA = "32",
        answerB = "35",
        answerC = "36",
        answerD = "34",
        correctAnswer = 1,
        explanation = "Vielfache der Zahl 7: 7×1=7, 7×2=14, 7×3=21, 7×4=28, 7×5=35.",
        difficulty = 1,
        funFact = "7 ist eine Primzahl und gilt in vielen Kulturen als Glückszahl."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn KATZE → 5 Buchstaben und HUND → 4 Buchstaben, was ist HAMSTER?",
        answerA = "6",
        answerB = "7",
        answerC = "8",
        answerD = "5",
        correctAnswer = 1,
        explanation = "H-A-M-S-T-E-R = 7 Buchstaben.",
        difficulty = 1,
        funFact = null
    )
)
