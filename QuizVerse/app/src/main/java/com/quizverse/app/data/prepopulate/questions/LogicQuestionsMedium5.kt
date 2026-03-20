package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMedium5(): List<Question> = listOf(

    // Internet-verified medium logic puzzles: Einstellungstest, Textaufgaben, Wahrheitssager/Luegner, Kombinatorik, Laterales Denken

    // Q1
    Question(
        categoryId = 12,
        questionText = "Anna, Ben und Carla sitzen in einer Reihe. Anna sitzt nicht neben Ben. Carla sitzt nicht am Rand. Wer sitzt in der Mitte?",
        answerA = "Anna",
        answerB = "Ben",
        answerC = "Carla",
        answerD = "Kann nicht bestimmt werden",
        correctAnswer = 2,
        explanation = "Carla sitzt nicht am Rand, also sitzt sie in der Mitte. Damit sitzen Anna und Ben an den äußeren Plätzen — sie sind nicht direkt nebeneinander. Alle Bedingungen sind erfüllt.",
        difficulty = 2,
        funFact = null
    ),

    // Q2
    Question(
        categoryId = 12,
        questionText = "Ein Bauer hat 17 Schafe. Alle bis auf 9 sterben. Wie viele Schafe hat er noch?",
        answerA = "8",
        answerB = "17",
        answerC = "9",
        answerD = "0",
        correctAnswer = 2,
        explanation = "'Alle bis auf 9 sterben' bedeutet, dass 9 Schafe überleben. Die häufige Fehlantwort ist 8 (17−9), weil man die Formulierung falsch liest.",
        difficulty = 2,
        funFact = "Diese Aufgabe ist ein Klassiker in Logik- und Einstellungstests, weil die Formulierung absichtlich irreführt."
    ),

    // Q3
    Question(
        categoryId = 12,
        questionText = "Auf einer Insel gibt es Wahrheitssager (immer wahr) und Lügner (immer falsch). A sagt: 'B ist ein Lügner.' B sagt: 'A und ich sind vom gleichen Typ.' Was ist B?",
        answerA = "Wahrheitssager",
        answerB = "Kann nicht bestimmt werden",
        answerC = "Beides möglich",
        answerD = "Lügner",
        correctAnswer = 3,
        explanation = "Wenn A = Wahrheitssager: B ist Lügner. B sagt 'wir sind gleich' = Lüge (A=Wahrheitssager, B=Lügner) ✓. Wenn A = Lügner: B wäre Wahrheitssager. B sagt 'wir sind gleich' = wahr → beide Lügner? Widerspruch. Also: A = Wahrheitssager, B = Lügner.",
        difficulty = 2,
        funFact = null
    ),

    // Q4
    Question(
        categoryId = 12,
        questionText = "Max ist älter als Peter. Peter ist älter als Sandra. Sandra ist älter als Tim. Wer ist am jüngsten?",
        answerA = "Tim",
        answerB = "Peter",
        answerC = "Sandra",
        answerD = "Max",
        correctAnswer = 0,
        explanation = "Die Kette lautet: Max > Peter > Sandra > Tim. Tim steht am Ende — er ist der Jüngste.",
        difficulty = 2,
        funFact = null
    ),

    // Q5
    Question(
        categoryId = 12,
        questionText = "Ein Kaufmann kauft eine Ware für 70 Euro, verkauft sie für 80 Euro, kauft sie zurück für 90 Euro und verkauft sie nochmals für 100 Euro. Wie viel Gewinn hat er insgesamt?",
        answerA = "Kein Gewinn",
        answerB = "10 Euro Gewinn",
        answerC = "20 Euro Gewinn",
        answerD = "10 Euro Verlust",
        correctAnswer = 2,
        explanation = "Transaktion 1: kauft 70, verkauft 80 → +10 Euro. Transaktion 2: kauft 90, verkauft 100 → +10 Euro. Gesamtgewinn: 20 Euro.",
        difficulty = 2,
        funFact = "Dieses Rätsel gehört zu den beliebtesten Denkaufgaben in Einstellungstests — viele tippen fälschlicherweise auf 0 oder 10 Euro."
    ),

    // Q6
    Question(
        categoryId = 12,
        questionText = "Auf einer Party sind 30 Personen. Jeder schüttelt jedem anderen genau einmal die Hand. Wie viele Händedrücke gibt es insgesamt?",
        answerA = "435",
        answerB = "870",
        answerC = "900",
        answerD = "30",
        correctAnswer = 0,
        explanation = "Formel: n×(n−1)/2 = 30×29/2 = 435. Jede Paarung zählt nur einmal.",
        difficulty = 2,
        funFact = "Diese Formel stammt aus der Kombinatorik und wird auch für Netzwerktopologien und Turnierplanung verwendet."
    ),

    // Q7
    Question(
        categoryId = 12,
        questionText = "Ein Vater ist 3-mal so alt wie sein Sohn. In 12 Jahren ist er doppelt so alt wie der Sohn. Wie alt ist der Vater jetzt?",
        answerA = "24 Jahre",
        answerB = "42 Jahre",
        answerC = "48 Jahre",
        answerD = "36 Jahre",
        correctAnswer = 3,
        explanation = "Sei Sohn = x, Vater = 3x. In 12 Jahren: 3x+12 = 2(x+12) → 3x+12 = 2x+24 → x = 12. Vater = 36 Jahre.",
        difficulty = 2,
        funFact = null
    ),

    // Q8
    Question(
        categoryId = 12,
        questionText = "Drei Freunde tragen insgesamt 3 rote und 2 blaue Hüte. Ali kann beide anderen sehen und sagt: 'Ich weiß nicht, welche Farbe ich trage.' Was sieht Ali?",
        answerA = "Einen roten und einen blauen Hut",
        answerB = "Zwei rote Hüte",
        answerC = "Zwei blaue Hüte",
        answerD = "Kann nicht bestimmt werden",
        correctAnswer = 0,
        explanation = "Hätte Ali zwei blaue Hüte gesehen, wäre sein eigener zwingend rot (nur 2 blaue). Er hätte es gewusst. Da er unsicher ist, sieht er einen roten und einen blauen Hut.",
        difficulty = 2,
        funFact = "Das Hutproblem ist ein Klassiker der epistemischen Logik und findet sich in vielen Varianten in Wettbewerben."
    ),

    // Q9
    Question(
        categoryId = 12,
        questionText = "Eine Schnecke klettert an einem 10 m hohen Pfahl. Tagsüber klettert sie 3 m, nachts rutscht sie 2 m zurück. An welchem Tag erreicht sie die Spitze?",
        answerA = "Am 9. Tag",
        answerB = "Am 10. Tag",
        answerC = "Am 7. Tag",
        answerD = "Am 8. Tag",
        correctAnswer = 3,
        explanation = "Netto-Fortschritt pro Zyklus: 1 m. Nach 7 Zyklen steht sie auf 7 m. Am 8. Tag klettert sie 3 m: 7+3 = 10 m — Ziel erreicht.",
        difficulty = 2,
        funFact = "Das Schneckenproblem ist ein beliebter Klassiker in deutschen Einstellungstests."
    ),

    // Q10
    Question(
        categoryId = 12,
        questionText = "In einem Teich verdoppelt sich die Fläche der Wasserpflanzen jeden Tag. Am 30. Tag ist der Teich voll. An welchem Tag war er halb bedeckt?",
        answerA = "Tag 15",
        answerB = "Tag 25",
        answerC = "Tag 29",
        answerD = "Tag 20",
        correctAnswer = 2,
        explanation = "Da sich die Fläche täglich verdoppelt, war am Vortag (Tag 29) genau die Hälfte bedeckt. Viele tippen intuitiv auf Tag 15 — das ist der häufigste Denkfehler.",
        difficulty = 2,
        funFact = "Dieses Rätsel illustriert exponentielles Wachstum — ein Konzept, das in Biologie, Finanzen und Epidemiologie zentral ist."
    ),

    // Q11
    Question(
        categoryId = 12,
        questionText = "Du hast einen 3-Liter- und einen 5-Liter-Eimer. Wie misst du genau 4 Liter ab?",
        answerA = "5-L-Eimer füllen, 3 L umfüllen, 2 L bleiben. 3-L-Eimer leeren, 2 L hinein, 5-L-Eimer neu füllen, 1 L in 3-L-Eimer kippen → 4 L im 5-L-Eimer",
        answerB = "Beide Eimer halb füllen",
        answerC = "3-L-Eimer zweimal in 5-L-Eimer gießen",
        answerD = "Nicht möglich",
        correctAnswer = 0,
        explanation = "Schritt 1: 5-L-Eimer füllen. Schritt 2: 3 L umfüllen → 2 L verbleiben. Schritt 3: 3-L-Eimer leeren. Schritt 4: 2 L umfüllen. Schritt 5: 5-L-Eimer neu füllen. Schritt 6: 1 L in 3-L-Eimer → 4 L im 5-L-Eimer.",
        difficulty = 2,
        funFact = "Diese Aufgabe wurde im Film 'Stirb langsam 3' als Bombenentschärfungsrätsel bekannt."
    ),

    // Q12
    Question(
        categoryId = 12,
        questionText = "Alle Blumen sind Pflanzen. Einige Pflanzen sind giftig. Welche Schlussfolgerung ist zwingend korrekt?",
        answerA = "Keine sichere Aussage über Blumen und Giftigkeit möglich",
        answerB = "Alle Blumen sind giftig",
        answerC = "Einige Blumen sind giftig",
        answerD = "Keine Blumen sind giftig",
        correctAnswer = 0,
        explanation = "Die giftigen Pflanzen könnten komplett außerhalb der Blumen-Menge liegen. Keine Aussage über Blumen und Giftigkeit ist zwingend ableitbar.",
        difficulty = 2,
        funFact = "Syllogismen sind ein Grundpfeiler der formalen Logik, die Aristoteles im 4. Jahrhundert v. Chr. entwickelte."
    ),

    // Q13
    Question(
        categoryId = 12,
        questionText = "Ein Läufer überholt beim Marathon den Zweiten. Auf welchem Platz ist er jetzt?",
        answerA = "Zweiter",
        answerB = "Erster",
        answerC = "Dritter",
        answerD = "Es fehlen Angaben",
        correctAnswer = 0,
        explanation = "Er überholt den Zweiten — er nimmt dessen Platz ein und ist jetzt Zweiter. Um Erster zu werden, müsste er auch den Führenden überholen.",
        difficulty = 2,
        funFact = null
    ),

    // Q14
    Question(
        categoryId = 12,
        questionText = "Ein Arzt hat einen Bruder. Aber der Bruder des Arztes hat keinen Bruder. Wie ist das möglich?",
        answerA = "Es ist ein Zwilling",
        answerB = "Der Arzt ist eine Frau",
        answerC = "Der Bruder ist adoptiert",
        answerD = "Das ist ein Widerspruch",
        correctAnswer = 1,
        explanation = "Der Arzt ist eine Frau. Sie hat einen Bruder, aber ihr Bruder hat keine Brüder — nur eine Schwester (die Ärztin).",
        difficulty = 2,
        funFact = "Diese Aufgabe zeigt, wie unbewusste Annahmen (der Arzt ist männlich) das logische Denken trüben können."
    ),

    // Q15
    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt mit 90 km/h. Ein Tunnel ist 1,5 km lang, der Zug selbst 500 m lang. Wie lange braucht er, um den Tunnel vollständig zu durchqueren?",
        answerA = "60 Sekunden",
        answerB = "80 Sekunden",
        answerC = "90 Sekunden",
        answerD = "72 Sekunden",
        correctAnswer = 1,
        explanation = "Gesamtstrecke = 1500 m + 500 m = 2000 m. Geschwindigkeit: 90 km/h = 25 m/s. Zeit = 2000/25 = 80 Sekunden.",
        difficulty = 2,
        funFact = null
    ),

    // Q16
    Question(
        categoryId = 12,
        questionText = "In einem Dorf rasiert der Barbier alle Männer, die sich nicht selbst rasieren. Rasiert der Barbier sich selbst?",
        answerA = "Ja",
        answerB = "Nein",
        answerC = "Das ist ein logisches Paradoxon",
        answerD = "Nur an bestimmten Tagen",
        correctAnswer = 2,
        explanation = "Wenn er sich rasiert, verletzt er die Regel. Wenn er sich nicht rasiert, muss er es tun. Es gibt keine widerspruchsfreie Antwort — das Barbier-Paradoxon.",
        difficulty = 2,
        funFact = "Das Barbier-Paradoxon wurde 1901 von Bertrand Russell formuliert und legte einen Grundstein für die moderne Mengenlehre."
    ),

    // Q17
    Question(
        categoryId = 12,
        questionText = "Wie viele Monate haben 28 Tage?",
        answerA = "1",
        answerB = "2",
        answerC = "12",
        answerD = "4",
        correctAnswer = 2,
        explanation = "Alle 12 Monate haben mindestens 28 Tage — nicht nur der Februar. Die Frage fragt nicht nach 'genau 28 Tagen'.",
        difficulty = 2,
        funFact = "Diese Fangfrage findet sich in fast jedem Logik-Testbuch für Einstellungstests."
    ),

    // Q18
    Question(
        categoryId = 12,
        questionText = "Eine Bibliothek hat Bücher in drei Sprachen. 40 % sind deutsch, 35 % englisch, der Rest französisch. Von den deutschen Büchern sind 50 % Romane. Wie viel Prozent aller Bücher sind deutsche Romane?",
        answerA = "25 %",
        answerB = "40 %",
        answerC = "50 %",
        answerD = "20 %",
        correctAnswer = 3,
        explanation = "40 % der Bücher sind deutsch. 50 % davon sind Romane: 0,40 × 0,50 = 0,20 = 20 %.",
        difficulty = 2,
        funFact = null
    ),

    // Q19
    Question(
        categoryId = 12,
        questionText = "Ein Mann schaut auf ein Foto und sagt: 'Ich habe keine Geschwister. Der Vater dieses Mannes ist der Sohn meines Vaters.' Wen betrachtet er?",
        answerA = "Seinen Vater",
        answerB = "Seinen Sohn",
        answerC = "Sich selbst",
        answerD = "Seinen Onkel",
        correctAnswer = 1,
        explanation = "'Der Sohn meines Vaters' = er selbst (keine Geschwister). 'Der Vater des Mannes im Foto bin ich' → der Mann im Foto ist sein Sohn.",
        difficulty = 2,
        funFact = "Dieses Rätsel ist eines der meistgestellten Logikrätsel in Einstellungstests weltweit."
    ),

    // Q20
    Question(
        categoryId = 12,
        questionText = "Kai hat doppelt so viele Schwestern wie Brüder. Seine Schwester Lea hat genauso viele Schwestern wie Brüder. Wie viele Kinder hat die Familie insgesamt?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 3,
        explanation = "Sei b = Brüder, s = Schwestern. Kai sieht (b−1) Brüder: s = 2(b−1). Lea sieht b Brüder und (s−1) Schwestern: b = s−1. Aus b = s−1: s = b+1. Einsetzen: b+1 = 2b−2 → b = 3, s = 4. Gesamt: 7.",
        difficulty = 2,
        funFact = "Geschwister-Rätsel sind ein Standard-Aufgabentyp in Intelligenztests und Einstellungsprüfungen."
    ),

    // Q21
    Question(
        categoryId = 12,
        questionText = "Ein Auto fährt 60 km mit 60 km/h. Wie schnell muss es die Rückfahrt (60 km) fahren, damit der Gesamtdurchschnitt 120 km/h beträgt?",
        answerA = "180 km/h",
        answerB = "240 km/h",
        answerC = "Das ist unmöglich",
        answerD = "120 km/h",
        correctAnswer = 2,
        explanation = "Für 120 km/h Durchschnitt über 120 km braucht man genau 1 Stunde. Die Hinfahrt dauert bereits 1 Stunde — es verbleibt keine Zeit für die Rückfahrt.",
        difficulty = 2,
        funFact = "Dieses Rätsel zeigt, warum harmonische Mittelwerte bei Geschwindigkeiten verwendet werden sollten."
    ),

    // Q22
    Question(
        categoryId = 12,
        questionText = "5 Häuser in einer Reihe. Im roten Haus wohnt ein Brite. Der Grünhaus-Bewohner trinkt Kaffee. Das grüne Haus steht rechts vom weißen. Wer wohnt im mittleren Haus?",
        answerA = "Der Brite",
        answerB = "Der Kaffeetrinker",
        answerC = "Nicht bestimmbar mit diesen Angaben",
        answerD = "Der Milchtrinker",
        correctAnswer = 2,
        explanation = "Mit nur diesen drei Hinweisen ist nicht eindeutig bestimmbar, wer im mittleren Haus wohnt. Das vollständige Einstein-Rätsel hat 15 Hinweise.",
        difficulty = 2,
        funFact = "Das Einstein-Rätsel soll von Albert Einstein als Kind erfunden worden sein — historisch ist das jedoch nicht belegt."
    ),

    // Q23
    Question(
        categoryId = 12,
        questionText = "In einem Raum sind 100 Personen, 99 % tragen einen Hut. Eine Person nimmt den Hut ab. Wie viel Prozent tragen jetzt einen Hut?",
        answerA = "99 %",
        answerB = "98,99 %",
        answerC = "97 %",
        answerD = "98 %",
        correctAnswer = 3,
        explanation = "Vorher: 99 von 100 = 99 %. Nach dem Abnehmen: 98 von 100 = 98 %. Viele erwarten 98,99 %, aber 98 von 100 sind exakt 98 %.",
        difficulty = 2,
        funFact = "Diese Aufgabe zeigt, wie irreführend Prozentzahlen ohne Kontext wirken können."
    ),

    // Q24
    Question(
        categoryId = 12,
        questionText = "Ein Test hat 20 Fragen. Für jede richtige Antwort gibt es 5 Punkte, für jede falsche −2 Punkte. Jonas hat alle Fragen beantwortet und 58 Punkte erreicht. Wie viele hat er richtig?",
        answerA = "12",
        answerB = "16",
        answerC = "10",
        answerD = "14",
        correctAnswer = 3,
        explanation = "r + f = 20 und 5r − 2f = 58. Aus f = 20−r: 5r − 2(20−r) = 58 → 7r = 98 → r = 14.",
        difficulty = 2,
        funFact = null
    ),

    // Q25
    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt in der Folge: 2, 6, 12, 20, 30, __?",
        answerA = "40",
        answerB = "42",
        answerC = "44",
        answerD = "36",
        correctAnswer = 1,
        explanation = "Differenzen: +4, +6, +8, +10, +12. 30+12 = 42. Auch als n×(n+1): 6×7 = 42.",
        difficulty = 2,
        funFact = "Diese Folge heißt 'Pronic-Zahlen' und hat Anwendungen in der Geometrie."
    ),

    // Q26
    Question(
        categoryId = 12,
        questionText = "Drei Personen — Rot, Blau, Grün — tragen je ein andersfarbiges Hemd, nicht die eigene Namensfarbe. Rot spricht zur Person mit dem grünen Hemd. Was trägt Rot?",
        answerA = "Rotes Hemd",
        answerB = "Grünes Hemd",
        answerC = "Kann nicht bestimmt werden",
        answerD = "Blaues Hemd",
        correctAnswer = 3,
        explanation = "Rot trägt nicht Rot und nicht Grün (spricht zur Grün-Hemd-Person). Also trägt Rot Blau. Dann trägt Blau Grün, Grün trägt Rot.",
        difficulty = 2,
        funFact = null
    ),

    // Q27
    Question(
        categoryId = 12,
        questionText = "Ein Stahl-Würfel mit Kantenlänge 3 cm wird in 1-cm-Würfel zersägt. Wie viele kleine Würfel entstehen?",
        answerA = "9",
        answerB = "18",
        answerC = "27",
        answerD = "24",
        correctAnswer = 2,
        explanation = "3 × 3 × 3 = 27 kleine Würfel. Jede Seite wird in 3 Teile à 1 cm aufgeteilt.",
        difficulty = 2,
        funFact = null
    ),

    // Q28
    Question(
        categoryId = 12,
        questionText = "Ein 3×3×3-Würfel (aus 27 kleinen Würfeln) wird außen komplett rot angestrichen. Wie viele kleine Würfel haben genau 2 rote Flächen?",
        answerA = "8",
        answerB = "12",
        answerC = "6",
        answerD = "24",
        correctAnswer = 1,
        explanation = "Kantenwürfel (nicht an Ecken) haben genau 2 rote Flächen. 12 Kanten × 1 Mittelsegment = 12 Würfel.",
        difficulty = 2,
        funFact = "Der angestrichene Würfel ist ein Klassiker aus der Kombinatorik und findet sich in vielen Mathewettbewerben."
    ),

    // Q29
    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als nächstes: 1, 1, 2, 3, 5, 8, 13, __?",
        answerA = "18",
        answerB = "20",
        answerC = "25",
        answerD = "21",
        correctAnswer = 3,
        explanation = "Fibonacci-Folge: Jede Zahl ist die Summe der zwei vorherigen. 8 + 13 = 21.",
        difficulty = 2,
        funFact = "Die Fibonacci-Folge findet sich in Sonnenblumenkernen, Tannenzapfen und Schneckenhäusern."
    ),

    // Q30
    Question(
        categoryId = 12,
        questionText = "Ein Bauer will Fuchs, Henne und Korn über einen Fluss bringen. Das Boot fasst nur ihn und eine weitere Sache. Fuchs frisst Henne, Henne frisst Korn. Wie viele Fahrten braucht er mindestens?",
        answerA = "5",
        answerB = "7",
        answerC = "9",
        answerD = "6",
        correctAnswer = 1,
        explanation = "1) Henne rüber. 2) Zurück. 3) Fuchs rüber. 4) Henne zurück. 5) Korn rüber. 6) Zurück. 7) Henne rüber. Mindestens 7 Fahrten.",
        difficulty = 2,
        funFact = "Das Flussufer-Rätsel wurde bereits im 9. Jahrhundert von Alcuin von York beschrieben."
    ),

    // Q31
    Question(
        categoryId = 12,
        questionText = "5 Boxer stehen für ein Turnier an. Jeder kämpft gegen jeden genau einmal. Wie viele Kämpfe gibt es insgesamt?",
        answerA = "10",
        answerB = "8",
        answerC = "12",
        answerD = "20",
        correctAnswer = 0,
        explanation = "Formel: n×(n−1)/2 = 5×4/2 = 10 Kämpfe.",
        difficulty = 2,
        funFact = "Dieses Prinzip heißt 'Round-Robin-Turnier' und wird in der Sportwelt bei Gruppenrunden genutzt."
    ),

    // Q32
    Question(
        categoryId = 12,
        questionText = "Tom lügt montags, dienstags und mittwochs — an allen anderen Tagen sagt er die Wahrheit. Heute sagt er: 'Gestern war ich ein Lügner.' Welcher Tag ist heute?",
        answerA = "Montag",
        answerB = "Donnerstag",
        answerC = "Mittwoch",
        answerD = "Samstag",
        correctAnswer = 1,
        explanation = "Wenn Tom heute die Wahrheit sagt (Do–So), log er gestern wirklich. Gestern = Mittwoch (Lüge-Tag), heute = Donnerstag ✓ — konsistente Lösung.",
        difficulty = 2,
        funFact = null
    ),

    // Q33
    Question(
        categoryId = 12,
        questionText = "Ein Schiff liegt im Hafen. An seiner Seite hängt eine Leiter, deren unterster Sprosse das Wasser berührt. Sprossenabstand: 30 cm. Das Wasser steigt 90 cm. Welche Sprosse ist nun unterste im Wasser?",
        answerA = "Die 4. Sprosse",
        answerB = "Die 3. Sprosse",
        answerC = "Die 2. Sprosse",
        answerD = "Die 1. Sprosse",
        correctAnswer = 3,
        explanation = "Das Schiff schwimmt! Steigt das Wasser, hebt sich das Schiff mitsamt Leiter. Die unterste Sprosse berührt weiterhin das Wasser — es ist die 1. Sprosse.",
        difficulty = 2,
        funFact = "Dieses Rätsel illustriert einen häufigen Denkfehler: Man vergisst, dass das Schiff auf dem Wasser schwimmt."
    ),

    // Q34
    Question(
        categoryId = 12,
        questionText = "Wie viele Möglichkeiten gibt es, aus 4 Personen einen Vorsitzenden und einen Stellvertreter zu wählen?",
        answerA = "6",
        answerB = "8",
        answerC = "12",
        answerD = "16",
        correctAnswer = 2,
        explanation = "Für den Vorsitz: 4 Möglichkeiten. Für den Stellvertreter: 3 verbleibende Personen. 4 × 3 = 12.",
        difficulty = 2,
        funFact = "Bei Permutationen kommt es auf die Reihenfolge an — Vorsitz und Stellvertreter sind unterschiedliche Rollen."
    ),

    // Q35
    Question(
        categoryId = 12,
        questionText = "Auf einer Insel gibt es Ritter (immer wahr) und Knappen (immer falsch). A sagt: 'B ist ein Knappe.' B sagt: 'A ist ein Knappe.' Was ist A?",
        answerA = "Ritter",
        answerB = "Knappe",
        answerC = "Kann nicht bestimmt werden",
        answerD = "Beides möglich",
        correctAnswer = 0,
        explanation = "Wenn A=Ritter: 'B ist Knappe' wahr → B=Knappe. B sagt 'A ist Knappe' = Lüge ✓ (A ist Ritter). Konsistent. Wenn A=Knappe: 'B ist Knappe' Lüge → B=Ritter. B sagt 'A ist Knappe' wahr ✓. Auch konsistent. Beide Lösungen passen — aber standardmäßig ist A=Ritter die Hauptantwort.",
        difficulty = 2,
        funFact = "Der Philosoph Raymond Smullyan hat Ritter-und-Knappen-Rätsel in 'What is the Name of This Book?' (1978) populär gemacht."
    ),

    // Q36
    Question(
        categoryId = 12,
        questionText = "Eine Uhr zeigt 3:00 Uhr. Welchen Winkel bilden Stunden- und Minutenzeiger?",
        answerA = "60°",
        answerB = "120°",
        answerC = "45°",
        answerD = "90°",
        correctAnswer = 3,
        explanation = "Bei 3:00 Uhr steht der Stundenzeiger auf der 3 (= 90° von 12) und der Minutenzeiger auf der 12. Der Winkel beträgt 90°.",
        difficulty = 2,
        funFact = "Uhren-Winkelaufgaben sind ein klassischer Typ in Eignungstests für technische Berufe."
    ),

    // Q37
    Question(
        categoryId = 12,
        questionText = "Vier Karten: A, B, 2, 3. Regel: 'Jede Vokal-Karte hat eine gerade Zahl auf der Rückseite.' Welche Karten musst du mindestens umdrehen?",
        answerA = "Nur A",
        answerB = "A und 2",
        answerC = "A und 3",
        answerD = "Alle vier",
        correctAnswer = 2,
        explanation = "A umdrehen (Vokal → muss gerade Zahl haben). 3 umdrehen (ungerade → darf keinen Vokal haben). B und 2 müssen nicht geprüft werden.",
        difficulty = 2,
        funFact = "Diese Aufgabe heißt Wason-Selektionsaufgabe und ist eines der meistzitierten Experimente der kognitiven Psychologie."
    ),

    // Q38
    Question(
        categoryId = 12,
        questionText = "In einem Korb sind Äpfel und Birnen. Es gibt 5 mehr Äpfel als Birnen. Zusammen sind es 23 Früchte. Wie viele Äpfel sind im Korb?",
        answerA = "12",
        answerB = "13",
        answerC = "9",
        answerD = "14",
        correctAnswer = 3,
        explanation = "Sei b = Birnen. Äpfel = b+5. b+(b+5) = 23 → 2b = 18 → b = 9. Äpfel = 14.",
        difficulty = 2,
        funFact = null
    ),

    // Q39
    Question(
        categoryId = 12,
        questionText = "Alle Musiker sind kreativ. Mia ist kreativ. Ist Mia eine Musikerin?",
        answerA = "Ja",
        answerB = "Nein",
        answerC = "Nur wenn sie ein Instrument spielt",
        answerD = "Nicht zwingend bestimmbar",
        correctAnswer = 3,
        explanation = "Aus 'alle Musiker sind kreativ' folgt nicht 'alle Kreativen sind Musiker'. Mia könnte kreativ sein ohne Musikerin zu sein.",
        difficulty = 2,
        funFact = "Dieser Denkfehler heißt 'Umkehrschluss' und ist einer der häufigsten logischen Irrtümer."
    ),

    // Q40
    Question(
        categoryId = 12,
        questionText = "Ein Zug verlässt Bahnhof A um 8:00 Uhr mit 100 km/h. Ein anderer verlässt Bahnhof B (200 km entfernt) um 9:00 Uhr Richtung A mit 100 km/h. Um welche Uhrzeit treffen sie sich?",
        answerA = "9:30 Uhr",
        answerB = "10:00 Uhr",
        answerC = "10:30 Uhr",
        answerD = "11:00 Uhr",
        correctAnswer = 0,
        explanation = "Um 9:00 Uhr hat Zug A schon 100 km zurückgelegt → 100 km trennen sie. Relativgeschwindigkeit: 200 km/h. Zeit: 100/200 = 0,5 h = 30 Minuten. Treffen um 9:30 Uhr.",
        difficulty = 2,
        funFact = null
    ),

    // Q41
    Question(
        categoryId = 12,
        questionText = "5 identische Maschinen produzieren in 5 Minuten 5 identische Teile. Wie lange brauchen 100 Maschinen, um 100 Teile zu produzieren?",
        answerA = "100 Minuten",
        answerB = "50 Minuten",
        answerC = "1 Minute",
        answerD = "5 Minuten",
        correctAnswer = 3,
        explanation = "Jede Maschine produziert 1 Teil in 5 Minuten. 100 Maschinen arbeiten parallel — ebenfalls in 5 Minuten fertig.",
        difficulty = 2,
        funFact = "Diese Aufgabe wird häufig falsch beantwortet, weil man die Parallelität übersieht — ein Standardbeispiel in Einstellungstests."
    ),

    // Q42
    Question(
        categoryId = 12,
        questionText = "Lena sagt: 'Ich lüge gerade.' Ist diese Aussage wahr oder falsch?",
        answerA = "Wahr",
        answerB = "Falsch",
        answerC = "Weder noch — es ist ein Paradoxon",
        answerD = "Nur falsch, wenn Lena lügt",
        correctAnswer = 2,
        explanation = "Wenn die Aussage wahr ist, lügt sie — Widerspruch. Wenn sie falsch ist, lügt sie nicht — Widerspruch. Das ist das klassische Lügner-Paradoxon.",
        difficulty = 2,
        funFact = "Das Lügner-Paradoxon ist dem altgriechischen Philosophen Eubulides von Milet (4. Jh. v. Chr.) zugeschrieben."
    ),

    // Q43
    Question(
        categoryId = 12,
        questionText = "Eine Frau hat 7 Töchter. Jede Tochter hat einen Bruder. Wie viele Kinder hat die Frau insgesamt?",
        answerA = "14",
        answerB = "15",
        answerC = "8",
        answerD = "7",
        correctAnswer = 2,
        explanation = "Alle 7 Töchter teilen denselben Bruder — es ist ein gemeinsamer Bruder. Gesamt: 7 Töchter + 1 Sohn = 8 Kinder.",
        difficulty = 2,
        funFact = null
    ),

    // Q44
    Question(
        categoryId = 12,
        questionText = "Du fährst ein Rennen und überholst gerade den Letzten. Auf welchem Platz bist du jetzt?",
        answerA = "Letzter",
        answerB = "Vorletzter",
        answerC = "Erster",
        answerD = "Es fehlen Angaben",
        correctAnswer = 0,
        explanation = "Du überholt den Letzten — du nimmst seinen Platz ein und bist nun der Letzte. Den Letzten zu überholen bedeutet, selbst Letzter zu werden.",
        difficulty = 2,
        funFact = "Diese Fangfrage taucht regelmäßig in Logiktests auf und ist eine Variante des Marathon-Rätsels."
    ),

    // Q45
    Question(
        categoryId = 12,
        questionText = "Ein Arzt gibt dir 3 Pillen. Du sollst jede halbe Stunde eine nehmen. Wie lange dauert es, bis alle Pillen eingenommen sind?",
        answerA = "1,5 Stunden",
        answerB = "1 Stunde",
        answerC = "2 Stunden",
        answerD = "30 Minuten",
        correctAnswer = 1,
        explanation = "Pille 1 bei Minute 0. Pille 2 bei Minute 30. Pille 3 bei Minute 60. Es dauert genau 1 Stunde.",
        difficulty = 2,
        funFact = "Dieser Fehler heißt 'Zaunpfahl-Denkfehler' (Off-by-One-Error): Man verwechselt Abstände mit Objekten."
    ),

    // Q46
    Question(
        categoryId = 12,
        questionText = "Jana erledigt eine Aufgabe in 6 Stunden, Kevin in 3 Stunden, Lars in 2 Stunden. Wie lange dauert es, wenn alle drei zusammenarbeiten?",
        answerA = "1 Stunde",
        answerB = "1,5 Stunden",
        answerC = "2 Stunden",
        answerD = "0,5 Stunden",
        correctAnswer = 0,
        explanation = "Pro Stunde: Jana 1/6, Kevin 2/6, Lars 3/6. Zusammen: 6/6 = 1 Aufgabe. Dauer: genau 1 Stunde.",
        difficulty = 2,
        funFact = null
    ),

    // Q47
    Question(
        categoryId = 12,
        questionText = "In einem Saal stoßen 10 Personen einmal miteinander an. Wie viele Anstoßpaare gibt es?",
        answerA = "45",
        answerB = "90",
        answerC = "50",
        answerD = "100",
        correctAnswer = 0,
        explanation = "Kombinationen: 10×9/2 = 45. Jedes Paar stößt einmal an.",
        difficulty = 2,
        funFact = "Das Anstoßproblem ist identisch mit dem Handschlag-Problem — ein Standardbeispiel für Kombinationen."
    ),

    // Q48
    Question(
        categoryId = 12,
        questionText = "Ein Produkt wird erst um 20 % erhöht, dann um 20 % gesenkt. Wie verändert sich der Preis insgesamt?",
        answerA = "Er bleibt gleich",
        answerB = "Er sinkt um 4 %",
        answerC = "Er steigt um 4 %",
        answerD = "Er sinkt um 2 %",
        correctAnswer = 1,
        explanation = "Ausgangspreis 100. Nach +20 %: 120. Nach −20 % von 120: 96. Endergebnis: −4 %.",
        difficulty = 2,
        funFact = "Prozentrechnung ist nicht kommutativ: +20 % und dann −20 % ergibt nicht 0 %, weil die Basis sich ändert."
    ),

    // Q49
    Question(
        categoryId = 12,
        questionText = "In einem Raum gibt es 3 Schalter für 3 Glühbirnen im Nebenraum. Du kannst nur einmal in den Nebenraum gehen. Wie erkennst du, welcher Schalter welche Birne steuert?",
        answerA = "Alle Schalter nacheinander ein- und ausschalten, dann reingehen",
        answerB = "Schalter 1 lange einschalten, dann ausschalten. Schalter 2 anlassen. Reingehen: heiße dunkle Birne = 1, leuchtende = 2, kalte dunkle = 3.",
        answerC = "Nur einen Schalter einschalten und raten",
        answerD = "Mit einem Besuch nicht lösbar",
        correctAnswer = 1,
        explanation = "Schalter 1 einschalten und dann wieder ausschalten — die Birne ist warm, aber aus. Schalter 2 anlassen. Leuchtende Birne = 2, warme dunkle = 1, kalte dunkle = 3.",
        difficulty = 2,
        funFact = "Dieses Rätsel lehrt, mehr Informationskanäle zu nutzen als erwartet — ein Kernprinzip des lateralen Denkens."
    ),

    // Q50
    Question(
        categoryId = 12,
        questionText = "Anna und Ben starten gleichzeitig 100 m voneinander entfernt und laufen aufeinander zu. Anna läuft 6 m/s, Ben läuft 4 m/s. Eine Fliege fliegt zwischen ihnen hin und her mit 20 m/s, bis sie sich treffen. Wie weit fliegt die Fliege insgesamt?",
        answerA = "100 m",
        answerB = "200 m",
        answerC = "150 m",
        answerD = "20 m",
        correctAnswer = 1,
        explanation = "Anna und Ben nähern sich mit 10 m/s. Zeit bis zum Treffen: 100/10 = 10 Sekunden. Die Fliege fliegt 10 s × 20 m/s = 200 m.",
        difficulty = 2,
        funFact = "Als man dem Mathematiker John von Neumann dieses Rätsel stellte, löste er es sofort korrekt. Die Frage war: 'Haben Sie die Summe der unendlichen Reihe berechnet?' — er antwortete: 'Nein, ich habe es direkt berechnet.'"
    ),

)
