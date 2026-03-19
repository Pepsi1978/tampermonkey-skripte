package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsEasy4(): List<Question> = listOf(

    // Simple math puzzles, basic comparisons, easy lateral thinking

    Question(
        categoryId = 12,
        questionText = "Was ergibt 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1?",
        answerA = "9",
        answerB = "10",
        answerC = "11",
        answerD = "100",
        correctAnswer = 1,
        explanation = "1 zehnmal addiert ergibt 10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 1 Euro hast und 50 Cent ausgibst, wie viel hast du dann noch?",
        answerA = "1 Euro",
        answerB = "50 Cent",
        answerC = "25 Cent",
        answerD = "75 Cent",
        correctAnswer = 1,
        explanation = "100 Cent - 50 Cent = 50 Cent.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist mehr: 100 Cent oder 1 Euro?",
        answerA = "100 Cent ist mehr",
        answerB = "1 Euro ist mehr",
        answerC = "Beide sind gleich viel",
        answerD = "Das hängt vom Land ab",
        correctAnswer = 2,
        explanation = "100 Cent = 1 Euro. Beide Beträge sind identisch.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kostet mehr: 500 Gramm Gold oder 1 Kilogramm Silber?",
        answerA = "1 Kilogramm Silber",
        answerB = "Beide gleich teuer",
        answerC = "500 Gramm Gold",
        answerD = "Das ändert sich täglich",
        correctAnswer = 2,
        explanation = "Gold ist viel teurer pro Gramm als Silber. 500g Gold kosten mehr als 1kg Silber.",
        difficulty = 1,
        funFact = "Der Goldpreis liegt bei etwa 60-80 Euro pro Gramm, Silber nur bei etwa 0,80-1 Euro pro Gramm."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 50% von 50?",
        answerA = "100",
        answerB = "25",
        answerC = "10",
        answerD = "5",
        correctAnswer = 1,
        explanation = "50% bedeutet die Hälfte. Die Hälfte von 50 ist 25.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 4 Äpfel 2 Euro kosten, was kosten dann 8 Äpfel?",
        answerA = "3 Euro",
        answerB = "4 Euro",
        answerC = "6 Euro",
        answerD = "8 Euro",
        correctAnswer = 1,
        explanation = "4 Äpfel = 2 Euro. 8 Äpfel ist doppelt so viel, also 2×2=4 Euro.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast einen 5-Liter-Eimer und einen 3-Liter-Eimer. Wie füllst du genau 4 Liter Wasser ab?",
        answerA = "Den 5-Liter halb füllen",
        answerB = "3-Liter voll, in 5-Liter gießen, 3-Liter wieder füllen, bis 5-Liter voll – 1 Liter bleibt im 3-Liter",
        answerC = "Das geht nicht",
        answerD = "Beide Eimer halb füllen",
        correctAnswer = 1,
        explanation = "3L voll → in 5L gießen (5L hat 3L). 3L voll → in 5L gießen bis voll (2L rein, 1L bleibt im 3L-Eimer). 5L ausleeren → 1L aus 3L in 5L. 3L voll → in 5L gießen → 5L hat 4L!",
        difficulty = 1,
        funFact = "Dieses klassische Rätsel wurde in vielen Filmen verwendet, darunter 'Stirb langsam 3'."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 10 minus 3 plus 2?",
        answerA = "7",
        answerB = "9",
        answerC = "5",
        answerD = "11",
        correctAnswer = 1,
        explanation = "10 - 3 = 7, dann 7 + 2 = 9.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Produkt um 20% teurer wird und dann um 20% billiger, ist es dann wieder so teuer wie vorher?",
        answerA = "Ja, exakt der gleiche Preis",
        answerB = "Nein, es ist 4% billiger als vorher",
        answerC = "Nein, es ist teurer als vorher",
        answerD = "Es hängt vom Originalpreis ab",
        correctAnswer = 1,
        explanation = "Beispiel: 100€ + 20% = 120€. 120€ - 20% = 96€. Der Preis ist 4% niedriger als der Originalpreis.",
        difficulty = 1,
        funFact = "Dieses Konzept nennt man 'Asymmetrie der Prozentrechnungen' – es überrascht viele Leute."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt heraus: 2 × 3 + 4?",
        answerA = "14",
        answerB = "10",
        answerC = "24",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Punkt vor Strich: zuerst 2×3=6, dann 6+4=10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du eine Münze 3 Mal wirfst, wie oft kann sie maximal auf Kopf landen?",
        answerA = "2 Mal",
        answerB = "3 Mal",
        answerC = "1 Mal",
        answerD = "Nur 1 Mal nach den Regeln",
        correctAnswer = 1,
        explanation = "Jeder Wurf kann Kopf oder Zahl zeigen. Bei 3 Würfen können maximal 3 Mal Kopf auftreten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist mehr: 1/2 oder 1/3?",
        answerA = "1/3 ist mehr",
        answerB = "1/2 ist mehr",
        answerC = "Beide sind gleich",
        answerD = "Kommt auf den Kontext an",
        correctAnswer = 1,
        explanation = "1/2 = 0,5 und 1/3 ≈ 0,33. Also ist 1/2 größer als 1/3.",
        difficulty = 1,
        funFact = "Je kleiner der Nenner (untere Zahl), desto größer der Bruch – bei gleichem Zähler."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ergibt 0 × 1000?",
        answerA = "1000",
        answerB = "0",
        answerC = "100",
        answerD = "999",
        correctAnswer = 1,
        explanation = "Jede Zahl multipliziert mit 0 ergibt immer 0.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du kaufst 3 Stifte zu je 2 Euro und 2 Hefte zu je 3 Euro. Wie viel zahlst du insgesamt?",
        answerA = "10 Euro",
        answerB = "12 Euro",
        answerC = "14 Euro",
        answerD = "16 Euro",
        correctAnswer = 1,
        explanation = "3 Stifte × 2€ = 6€. 2 Hefte × 3€ = 6€. Gesamt: 6 + 6 = 12€.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist kleiner: 0,1 oder 0,09?",
        answerA = "0,1 ist kleiner",
        answerB = "0,09 ist kleiner",
        answerC = "Beide sind gleich",
        answerD = "Kommt auf den Kontext an",
        correctAnswer = 1,
        explanation = "0,1 = 0,10, und 0,10 > 0,09. Also ist 0,09 kleiner.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Pizza wird in 6 gleiche Stücke geschnitten. Du isst 2 Stücke. Wie viel Prozent der Pizza hast du gegessen?",
        answerA = "25%",
        answerB = "33%",
        answerC = "50%",
        answerD = "20%",
        correctAnswer = 1,
        explanation = "2 von 6 Stücken = 2/6 = 1/3 ≈ 33%.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Zug mit 100 km/h fährt und nach 2 Stunden ankommt, wie weit ist die Strecke?",
        answerA = "100 km",
        answerB = "150 km",
        answerC = "200 km",
        answerD = "250 km",
        correctAnswer = 2,
        explanation = "Strecke = Geschwindigkeit × Zeit = 100 km/h × 2 h = 200 km.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist die Hälfte von 1000?",
        answerA = "250",
        answerB = "500",
        answerC = "100",
        answerD = "750",
        correctAnswer = 1,
        explanation = "1000 ÷ 2 = 500.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn es 8 Uhr morgens ist und du 3 Stunden schläfst, um wie viel Uhr wachst du auf?",
        answerA = "10 Uhr",
        answerB = "11 Uhr",
        answerC = "12 Uhr",
        answerD = "9 Uhr",
        correctAnswer = 1,
        explanation = "8 Uhr + 3 Stunden = 11 Uhr.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Regal hat 5 Etagen. Auf jeder Etage stehen 8 Bücher. Wie viele Bücher sind das insgesamt?",
        answerA = "13",
        answerB = "30",
        answerC = "40",
        answerD = "45",
        correctAnswer = 2,
        explanation = "5 Etagen × 8 Bücher = 40 Bücher.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist größer: 3² oder 2³?",
        answerA = "3² (9) ist größer",
        answerB = "2³ (8) ist größer",
        answerC = "Beide sind gleich",
        answerD = "Das hängt vom Kontext ab",
        correctAnswer = 0,
        explanation = "3² = 3×3 = 9. 2³ = 2×2×2 = 8. Also ist 9 > 8.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 3 Euro mehr als dein Freund hast und dein Freund 7 Euro hat, wie viel hast du?",
        answerA = "4 Euro",
        answerB = "10 Euro",
        answerC = "7 Euro",
        answerD = "3 Euro",
        correctAnswer = 1,
        explanation = "Freund hat 7€. Du hast 3€ mehr: 7 + 3 = 10€.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Auto fährt 60 km/h. Wie lange braucht es für 30 km?",
        answerA = "1 Stunde",
        answerB = "30 Minuten",
        answerC = "45 Minuten",
        answerD = "15 Minuten",
        correctAnswer = 1,
        explanation = "Zeit = Strecke ÷ Geschwindigkeit = 30 ÷ 60 = 0,5 Stunden = 30 Minuten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ergibt 15 + 15 + 15 – 15?",
        answerA = "45",
        answerB = "30",
        answerC = "15",
        answerD = "60",
        correctAnswer = 1,
        explanation = "15+15+15 = 45, dann 45-15 = 30.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl ist sowohl durch 2 als auch durch 3 teilbar?",
        answerA = "4",
        answerB = "6",
        answerC = "9",
        answerD = "10",
        correctAnswer = 1,
        explanation = "6 ÷ 2 = 3 und 6 ÷ 3 = 2. Also ist 6 durch beide teilbar.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast 20 Euro. Du kaufst ein T-Shirt für 8 Euro und eine Hose für 11 Euro. Reicht das Geld?",
        answerA = "Ja, du bekommst 2 Euro zurück",
        answerB = "Nein, du hast 1 Euro zu wenig",
        answerC = "Genau, kein Wechselgeld",
        answerD = "Ja, du bekommst 1 Euro zurück",
        correctAnswer = 1,
        explanation = "8 + 11 = 19 Euro. Du hast 20 Euro – das reicht, und du bekommst 1 Euro zurück.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ergibt die Hälfte von 12 plus das Doppelte von 2?",
        answerA = "8",
        answerB = "10",
        answerC = "12",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Hälfte von 12 = 6. Doppeltes von 2 = 4. 6 + 4 = 10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 1 Meter 100 Zentimeter hat, wie viele Zentimeter hat ein halber Meter?",
        answerA = "25 cm",
        answerB = "50 cm",
        answerC = "75 cm",
        answerD = "100 cm",
        correctAnswer = 1,
        explanation = "Ein halber Meter = 100 cm ÷ 2 = 50 cm.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 10% von 200?",
        answerA = "10",
        answerB = "20",
        answerC = "2",
        answerD = "100",
        correctAnswer = 1,
        explanation = "10% von 200 = 200 × 0,1 = 20.",
        difficulty = 1,
        funFact = "10% einer Zahl ausrechnen ist einfach: einfach durch 10 teilen."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du jeden Tag 1 Euro sparst, wie viel hast du nach 1 Monat (30 Tage)?",
        answerA = "20 Euro",
        answerB = "30 Euro",
        answerC = "25 Euro",
        answerD = "31 Euro",
        correctAnswer = 1,
        explanation = "1 Euro × 30 Tage = 30 Euro.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist größer: ein Viertel von 100 oder ein Drittel von 60?",
        answerA = "Ein Viertel von 100 (=25) ist größer",
        answerB = "Ein Drittel von 60 (=20) ist größer",
        answerC = "Beide sind gleich groß",
        answerD = "Weder noch",
        correctAnswer = 0,
        explanation = "Viertel von 100 = 25. Drittel von 60 = 20. Also ist 25 > 20.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Produkt heute 80€ kostet und das der halbe Preis vom letzten Jahr ist, was hat es letztes Jahr gekostet?",
        answerA = "40 Euro",
        answerB = "120 Euro",
        answerC = "160 Euro",
        answerD = "100 Euro",
        correctAnswer = 2,
        explanation = "80€ ist die Hälfte des alten Preises. Also: 80€ × 2 = 160€.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Rechteck hat eine Länge von 8 cm und eine Breite von 3 cm. Was ist sein Umfang?",
        answerA = "11 cm",
        answerB = "22 cm",
        answerC = "24 cm",
        answerD = "16 cm",
        correctAnswer = 1,
        explanation = "Umfang eines Rechtecks: 2 × (Länge + Breite) = 2 × (8+3) = 2 × 11 = 22 cm.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 3 Personen je 4 Euro zahlen, und eine vierte Person die Hälfte zahlt, was ist das Gesamtgeld?",
        answerA = "14 Euro",
        answerB = "16 Euro",
        answerC = "18 Euro",
        answerD = "20 Euro",
        correctAnswer = 1,
        explanation = "3 Personen × 4€ = 12€. Die vierte Person zahlt 4÷2=2€. Gesamt: 12+2=14€.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt heraus, wenn du 7 von beiden Seiten einer Gleichung abziehst: 15 = x + 7?",
        answerA = "x = 21",
        answerB = "x = 8",
        answerC = "x = 7",
        answerD = "x = 22",
        correctAnswer = 1,
        explanation = "15 - 7 = x + 7 - 7, also 8 = x.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ergibt 1000 – 997?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "7",
        correctAnswer = 1,
        explanation = "1000 - 997 = 3.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 3 gleich große Pizzen unter 6 Personen gleichmäßig aufteilst, wie viele Stücke bekommt jeder (wenn jede Pizza in 8 Stücke geschnitten wird)?",
        answerA = "3 Stücke",
        answerB = "4 Stücke",
        answerC = "5 Stücke",
        answerD = "6 Stücke",
        correctAnswer = 1,
        explanation = "3 Pizzen × 8 Stücke = 24 Stücke. 24 ÷ 6 Personen = 4 Stücke pro Person.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 25 × 4?",
        answerA = "80",
        answerB = "100",
        answerC = "90",
        answerD = "120",
        correctAnswer = 1,
        explanation = "25 × 4 = 100.",
        difficulty = 1,
        funFact = "Trick: 25 × 4 ist dasselbe wie 100 ÷ 1 = 100. Oder einfacher: 25+25+25+25=100."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Würfel 6 Seiten hat, wie viele Seiten haben 4 Würfel?",
        answerA = "18",
        answerB = "20",
        answerC = "24",
        answerD = "28",
        correctAnswer = 2,
        explanation = "4 Würfel × 6 Seiten = 24 Seiten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist kleiner: 1/4 oder 1/5?",
        answerA = "1/4 ist kleiner",
        answerB = "1/5 ist kleiner",
        answerC = "Beide gleich",
        answerD = "Kommt auf den Kontext an",
        correctAnswer = 1,
        explanation = "1/4 = 0,25 und 1/5 = 0,20. Also ist 1/5 kleiner.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Klasse hat 30 Schüler. 40% sind Mädchen. Wie viele Mädchen sind das?",
        answerA = "10",
        answerB = "12",
        answerC = "15",
        answerD = "18",
        correctAnswer = 1,
        explanation = "40% von 30 = 30 × 0,4 = 12 Mädchen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ergibt 99 + 1 + 99 + 1?",
        answerA = "190",
        answerB = "200",
        answerC = "201",
        answerD = "198",
        correctAnswer = 1,
        explanation = "(99+1) + (99+1) = 100 + 100 = 200.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 5 Bonbons hast und bekommst dreimal so viele dazu, wie viele hast du dann?",
        answerA = "15",
        answerB = "20",
        answerC = "10",
        answerD = "8",
        correctAnswer = 1,
        explanation = "5 (ursprünglich) + 3×5 (dazu) = 5 + 15 = 20.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das Dreifache von einem Drittel von 90?",
        answerA = "30",
        answerB = "90",
        answerC = "45",
        answerD = "270",
        correctAnswer = 1,
        explanation = "Ein Drittel von 90 = 30. Das Dreifache davon: 30 × 3 = 90.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viel ist 1000 minus 1?",
        answerA = "999",
        answerB = "1001",
        answerC = "998",
        answerD = "100",
        correctAnswer = 0,
        explanation = "1000 - 1 = 999.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Eis 2 Euro kostet und du 5 Euro hast, wie viele Eis kannst du kaufen?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "5",
        correctAnswer = 1,
        explanation = "5 Euro ÷ 2 Euro = 2 Eis, mit 1 Euro Rest.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 7 × 8?",
        answerA = "54",
        answerB = "56",
        answerC = "58",
        answerD = "64",
        correctAnswer = 1,
        explanation = "7 × 8 = 56.",
        difficulty = 1,
        funFact = "Eselsbrücke: 5, 6, 7, 8 – also 56 = 7×8."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist 12 × 12?",
        answerA = "124",
        answerB = "144",
        answerC = "132",
        answerD = "112",
        correctAnswer = 1,
        explanation = "12 × 12 = 144.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du morgens um 7 Uhr aufstehst und 15 Minuten frühstückst und 20 Minuten zur Schule läufst, wann bist du in der Schule?",
        answerA = "7:30 Uhr",
        answerB = "7:35 Uhr",
        answerC = "7:45 Uhr",
        answerD = "8:00 Uhr",
        correctAnswer = 1,
        explanation = "7:00 + 15 Minuten + 20 Minuten = 7:35 Uhr.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das Ergebnis: (10 + 5) × 2?",
        answerA = "20",
        answerB = "30",
        answerC = "25",
        answerD = "15",
        correctAnswer = 1,
        explanation = "Klammern zuerst: 10+5=15. Dann 15×2=30.",
        difficulty = 1,
        funFact = null
    )
)
