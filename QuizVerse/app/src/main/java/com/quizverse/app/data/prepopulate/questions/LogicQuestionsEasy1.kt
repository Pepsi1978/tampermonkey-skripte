package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsEasy1(): List<Question> = listOf(

    // Simple riddles, "Was bin ich" puzzles, basic counting tricks

    Question(
        categoryId = 12,
        questionText = "Was hat Hände, aber kann nicht klatschen?",
        answerA = "Ein Baum",
        answerB = "Eine Uhr",
        answerC = "Ein Stuhl",
        answerD = "Ein Buch",
        correctAnswer = 1,
        explanation = "Eine Uhr hat Zeiger, die man auch 'Hände' nennt – aber klatschen kann sie natürlich nicht.",
        difficulty = 1,
        funFact = "Im Englischen heißen die Uhrzeiger 'hands', daher kommt dieses Rätsel ursprünglich aus dem Englischen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man fangen, aber nicht werfen?",
        answerA = "Einen Ball",
        answerB = "Einen Fisch",
        answerC = "Eine Erkältung",
        answerD = "Einen Schmetterling",
        correctAnswer = 2,
        explanation = "Eine Erkältung kann man 'fangen' (bekommen), aber man kann sie nicht wie einen Gegenstand werfen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ich bin immer vor dir, aber kann nicht gesehen werden. Was bin ich?",
        answerA = "Dein Schatten",
        answerB = "Die Zukunft",
        answerC = "Dein Spiegelbild",
        answerD = "Deine Gedanken",
        correctAnswer = 1,
        explanation = "Die Zukunft liegt immer vor uns, aber da sie noch nicht eingetreten ist, kann man sie nicht sehen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was wird nasser, je mehr es trocknet?",
        answerA = "Ein Schwamm",
        answerB = "Ein Handtuch",
        answerC = "Ein Regenschirm",
        answerD = "Eine Badewanne",
        correctAnswer = 1,
        explanation = "Ein Handtuch nimmt beim Trocknen immer mehr Feuchtigkeit auf und wird dadurch selbst nasser.",
        difficulty = 1,
        funFact = "Dieses Rätsel ist eines der ältesten bekannten Rätsel überhaupt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ich habe keinen Körper, aber ich kann trotzdem rennen. Ich habe kein Gesicht, aber ich ticke. Was bin ich?",
        answerA = "Eine Uhr",
        answerB = "Die Zeit",
        answerC = "Ein Herz",
        answerD = "Ein Fluss",
        correctAnswer = 1,
        explanation = "Die Zeit 'rennt' (vergeht schnell) und 'tickt' wie eine Uhr, hat aber keinen physischen Körper.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man nicht zweimal essen?",
        answerA = "Suppe",
        answerB = "Aufgewärmtes Essen",
        answerC = "Frühstück",
        answerD = "Ein rohes Ei",
        correctAnswer = 3,
        explanation = "Ein rohes Ei kann man nur einmal essen – danach ist es gekaut und kann nicht mehr in den Originalzustand zurückgebracht werden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat viele Zähne, beißt aber nie?",
        answerA = "Ein Tiger",
        answerB = "Ein Kamm",
        answerC = "Eine Säge",
        answerD = "Ein Hai",
        correctAnswer = 1,
        explanation = "Ein Kamm hat viele Zinken (Zähne), aber er beißt natürlich niemanden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort wird kürzer, wenn man zwei Buchstaben hinzufügt?",
        answerA = "Kurz",
        answerB = "Klein",
        answerC = "Lang",
        answerD = "Groß",
        correctAnswer = 0,
        explanation = "Aus 'kurz' wird 'kürzer' – das Wort beschreibt nun etwas noch Kürzeres, also ist es 'kürzer' geworden.",
        difficulty = 1,
        funFact = "Solche Wortspiele nennt man Paradoxon – scheinbare Widersprüche, die sich auflösen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat viele Löcher, hält aber das Wasser?",
        answerA = "Ein Eimer",
        answerB = "Ein Schwamm",
        answerC = "Ein Sieb",
        answerD = "Ein Netz",
        correctAnswer = 1,
        explanation = "Ein Schwamm hat viele kleine Poren (Löcher), kann aber trotzdem Wasser aufnehmen und halten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Mann lebt im 20. Stock. Wenn es regnet, fährt er mit dem Fahrstuhl nach oben. Wenn es schön ist, steigt er im 10. Stock aus und läuft. Warum?",
        answerA = "Er macht gerne Sport",
        answerB = "Er ist zu klein, um den Knopf für den 20. Stock zu erreichen",
        answerC = "Er spart Strom",
        answerD = "Der Fahrstuhl hält nicht bei 20",
        correctAnswer = 1,
        explanation = "Bei Regen hat er seinen Regenschirm dabei – mit dem kann er den hohen Knopf drücken. Ohne Schirm kommt er nur bis Stockwerk 10.",
        difficulty = 1,
        funFact = "Dieses Rätsel ist als 'Fahrstuhl-Rätsel' weltbekannt und überrascht fast jeden beim ersten Mal."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man sehen, aber nicht anfassen?",
        answerA = "Luft",
        answerB = "Ein Regenbogen",
        answerC = "Wasser",
        answerD = "Sand",
        correctAnswer = 1,
        explanation = "Ein Regenbogen ist nur ein optisches Phänomen – er entsteht durch Lichtbrechung und existiert nicht als greifbares Objekt.",
        difficulty = 1,
        funFact = "Ein Regenbogen ist eigentlich ein vollständiger Kreis – man sieht nur den oberen Teil, weil der Horizont den Rest verdeckt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ich spreche ohne Mund und höre ohne Ohren. Ich habe keinen Körper, aber ich lebe mit dem Wind. Was bin ich?",
        answerA = "Ein Geist",
        answerB = "Ein Echo",
        answerC = "Ein Traum",
        answerD = "Eine Wolke",
        correctAnswer = 1,
        explanation = "Ein Echo 'spricht' zurück was man ruft, obwohl es keinen Mund hat – es ist nur die Reflexion des Schalls.",
        difficulty = 1,
        funFact = "In der griechischen Mythologie war Echo eine Nymphe, die zur Strafe nur wiederholen konnte, was andere sagten."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Sekunden hat ein Jahr?",
        answerA = "3.153.600",
        answerB = "31.536.000",
        answerC = "8.760",
        answerD = "525.600",
        correctAnswer = 1,
        explanation = "365 Tage × 24 Stunden × 60 Minuten × 60 Sekunden = 31.536.000 Sekunden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das: Je mehr du nimmst, desto mehr lässt du zurück?",
        answerA = "Geld",
        answerB = "Schritte",
        answerC = "Zeit",
        answerD = "Wasser",
        correctAnswer = 1,
        explanation = "Wenn du Schritte machst, hinterlässt du Fußabdrücke – je mehr Schritte du gehst, desto mehr Spuren bleiben zurück.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Tier schläft mit offenen Augen?",
        answerA = "Der Hund",
        answerB = "Die Katze",
        answerC = "Der Fisch",
        answerD = "Der Vogel",
        correctAnswer = 2,
        explanation = "Fische haben keine Augenlider, sie können ihre Augen nicht schließen und schlafen daher mit offenen Augen.",
        difficulty = 1,
        funFact = "Haie müssen sogar ständig schwimmen, damit Wasser durch ihre Kiemen strömt – sonst würden sie ersticken."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt einmal in einer Minute vor, zweimal in einem Moment, aber nie in tausend Jahren?",
        answerA = "Der Buchstabe N",
        answerB = "Der Buchstabe M",
        answerC = "Der Buchstabe E",
        answerD = "Eine Sekunde",
        correctAnswer = 1,
        explanation = "Im Wort 'Minute' kommt M einmal vor, in 'Moment' zweimal (M...m), in 'tausend Jahren' gar nicht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Hahn sitzt auf dem Dach. Nach Osten zeigt er. In welche Richtung fällt das Ei?",
        answerA = "Nach Osten",
        answerB = "Nach Westen",
        answerC = "Nach unten",
        answerD = "Hähne legen keine Eier",
        correctAnswer = 3,
        explanation = "Hähne legen keine Eier – das tun nur Hennen. Das ist die Fangfrage!",
        difficulty = 1,
        funFact = "Diese Frage ist eine klassische Ablenkungsfrage – man denkt über die Windrichtung nach, statt an das Offensichtliche."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat ein Gesicht und zwei Zeiger, aber kein Leben?",
        answerA = "Eine Maske",
        answerB = "Eine Uhr",
        answerC = "Eine Puppe",
        answerD = "Ein Kompass",
        correctAnswer = 1,
        explanation = "Eine Uhr hat ein 'Zifferblatt' (Gesicht) und zwei Zeiger (Stunden- und Minutenzeiger), ist aber kein Lebewesen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie nennt man einen Fisch ohne Augen?",
        answerA = "Einen blinden Fisch",
        answerB = "Einen Fsh",
        answerC = "Einen Tiefseefisch",
        answerD = "Einen Aal",
        correctAnswer = 1,
        explanation = "Auf Englisch: 'A fish without eyes is a fsh' – ohne 'i' (eye = Auge). Auf Deutsch: Fisch ohne 'i' = 'Fsch' – ein Wortspiel!",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du vor einem Spiegel stehst, was siehst du dann links von dir?",
        answerA = "Deine linke Seite",
        answerB = "Deine rechte Seite",
        answerC = "Nichts",
        answerD = "Den Hintergrund",
        correctAnswer = 1,
        explanation = "Im Spiegel erscheint deine rechte Hand auf der linken Seite des Spiegelbildes – du siehst links von dir deine echte rechte Seite.",
        difficulty = 1,
        funFact = "Spiegel kehren nicht links und rechts um, sondern vorne und hinten – das ist ein häufiges Missverständnis."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat vier Beine morgens, zwei mittags und drei abends?",
        answerA = "Ein Hund",
        answerB = "Ein Tisch",
        answerC = "Der Mensch",
        answerD = "Ein Pferd",
        correctAnswer = 2,
        explanation = "Das berühmte Rätsel der Sphinx: Als Baby krabbelt der Mensch auf vier Gliedmaßen, als Erwachsener läuft er auf zwei Beinen, als alter Mensch braucht er einen Stock (drei 'Beine').",
        difficulty = 1,
        funFact = "Dieses Rätsel stellte die Sphinx in der griechischen Sage dem Helden Ödipus – er löste es als Einziger."
    ),

    Question(
        categoryId = 12,
        questionText = "Was geht ohne Füße, läuft ohne Beine und fließt ohne Wasser?",
        answerA = "Der Wind",
        answerB = "Die Zeit",
        answerC = "Ein Gedanke",
        answerD = "Musik",
        correctAnswer = 1,
        explanation = "Die Zeit 'geht' (vergeht) und 'läuft' (tickt weiter), ohne dass sie physische Beine oder Füße hat.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das einzige Wort im Wörterbuch, das falsch geschrieben ist?",
        answerA = "Das Wort 'falsch'",
        answerB = "Das Wort 'Fehler'",
        answerC = "Das Wort 'falsch geschrieben'",
        answerD = "Das Wort 'verkehrt'",
        correctAnswer = 2,
        explanation = "Im Wörterbuch steht das Wort 'falsch geschrieben' – denn das ist die Antwort auf die Frage! Es ist ein Wortspiel.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du drei Äpfel und zwei Orangen hast und nimmst zwei Äpfel, wie viele hast du dann?",
        answerA = "Drei",
        answerB = "Zwei",
        answerC = "Fünf",
        answerD = "Einen",
        correctAnswer = 1,
        explanation = "Du nimmst zwei Äpfel – die hast du jetzt bei dir. Du hast also zwei Äpfel.",
        difficulty = 1,
        funFact = "Diese Frage ist eine Ablenkungsfrage – man denkt über die verbleibenden Früchte nach statt über die genommenen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist immer am Ende einer Regenbow?",
        answerA = "Ein Topf Gold",
        answerB = "Der Buchstabe W",
        answerC = "Eine Wolke",
        answerD = "Der Horizont",
        correctAnswer = 1,
        explanation = "Am Ende des Wortes 'Regenbogen' steht der Buchstabe 'n' – aber am Ende von 'Regenbow' steht das 'W'! (Englisches Wortspiel auf Deutsch übertragen.)",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Bauer hat 5 Töchter. Jede Tochter hat einen Bruder. Wie viele Kinder hat der Bauer?",
        answerA = "10",
        answerB = "6",
        answerC = "11",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Es gibt 5 Töchter und EINEN Bruder (alle Töchter teilen sich denselben Bruder). Das macht 5 + 1 = 6 Kinder.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was trägt man, obwohl es kein Kleidungsstück ist?",
        answerA = "Eine Meinung",
        answerB = "Einen Hut",
        answerC = "Eine Brille",
        answerD = "Einen Namen",
        correctAnswer = 3,
        explanation = "Einen Namen 'trägt' man sein ganzes Leben lang, obwohl er kein Kleidungsstück ist.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ich bin leichter als eine Feder, aber kein Mensch kann mich lange halten. Was bin ich?",
        answerA = "Ein Geheimnis",
        answerB = "Der Atem",
        answerC = "Licht",
        answerD = "Stille",
        correctAnswer = 1,
        explanation = "Den Atem anzuhalten (einzuhalten) schafft kein Mensch sehr lange – obwohl Luft kaum etwas wiegt.",
        difficulty = 1,
        funFact = "Der Weltrekord im Luftanhalten liegt bei über 24 Minuten – aber das ist eine extreme Ausnahme mit spezieller Technik."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Nadeln, sticht aber nicht?",
        answerA = "Eine Tanne",
        answerB = "Ein Igel",
        answerC = "Eine Nähmaschine",
        answerD = "Ein Kaktus",
        correctAnswer = 0,
        explanation = "Eine Tanne (Tannenbaum) hat Nadeln – das sind die spitzen Blätter –, aber die Tanne selbst sticht nicht aktiv.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man zerbrechen, ohne es anzufassen?",
        answerA = "Ein Glas",
        answerB = "Eine Versprechen",
        answerC = "Ein Ei",
        answerD = "Eis",
        correctAnswer = 1,
        explanation = "Ein Versprechen kann man brechen (nicht einhalten), ohne es physisch anzufassen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Buchstaben hat das Wort 'das Alphabet'?",
        answerA = "26",
        answerB = "10",
        answerC = "11",
        answerD = "24",
        correctAnswer = 1,
        explanation = "Die Frage ist nach den Buchstaben im Wort 'das Alphabet' – zählt man sie: d-a-s-A-l-p-h-a-b-e-t = 11 Buchstaben. Aber ohne Leerzeichen: dasAlphabet = 10.",
        difficulty = 1,
        funFact = "Viele antworten '26', weil sie an das Alphabet als Ganzes denken – das ist die Fangfrage!"
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat ein Gesicht ohne Augen, Hände ohne Arme und sagt dir trotzdem die Zeit?",
        answerA = "Ein Orakel",
        answerB = "Eine Sonnenuhr",
        answerC = "Eine Uhr",
        answerD = "Ein Kalender",
        correctAnswer = 2,
        explanation = "Eine Uhr hat ein 'Gesicht' (Zifferblatt), 'Hände' (Zeiger), aber keine echten Augen oder Arme.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das einzige Tier, das rückwärts fliegen kann?",
        answerA = "Die Eule",
        answerB = "Der Kolibri",
        answerC = "Der Adler",
        answerD = "Die Schwalbe",
        correctAnswer = 1,
        explanation = "Der Kolibri ist das einzige Vogel, der tatsächlich rückwärts fliegen kann – dank seiner speziellen Flügelstruktur.",
        difficulty = 1,
        funFact = "Kolibris schlagen ihre Flügel bis zu 80-mal pro Sekunde – das erzeugt das charakteristische Summen (engl. 'hum', daher 'hummingbird')."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Zähne aber kein Mund?",
        answerA = "Eine Gabel",
        answerB = "Ein Kamm",
        answerC = "Ein Säge",
        answerD = "Ein Reißverschluss",
        correctAnswer = 3,
        explanation = "Ein Reißverschluss hat kleine Zähne (Zahnelemente), die ineinandergreifen, aber keinen Mund.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wo liegt der 4. Juli in England?",
        answerA = "Er wird nicht gefeiert",
        answerB = "Zwischen dem 3. und 5. Juli",
        answerC = "Es gibt ihn nicht",
        answerD = "Im Kalender wie überall",
        correctAnswer = 1,
        explanation = "Der 4. Juli liegt in England – wie überall auf der Welt – zwischen dem 3. und dem 5. Juli. Es ist ein Datum, kein Feiertag!",
        difficulty = 1,
        funFact = "Der 4. Juli ist der Unabhängigkeitstag der USA, wird aber in England selbst natürlich nicht als Feiertag begangen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man sehen, das kein Gewicht hat und keinen Schatten wirft?",
        answerA = "Eine Idee",
        answerB = "Das Licht selbst",
        answerC = "Hitze",
        answerD = "Der Wind",
        correctAnswer = 1,
        explanation = "Licht hat (praktisch) kein Gewicht und wirft keinen eigenen Schatten – es erzeugt nur Schatten bei anderen Objekten.",
        difficulty = 1,
        funFact = "Licht hat tatsächlich Impuls (Strahlungsdruck), auch wenn es keine Ruhemasse hat – Sonnensegel nutzen genau das."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du in einem Einbahnstraßentunnel in die falsche Richtung fährst und ein Polizist sieht dich – warum macht er nichts?",
        answerA = "Du fährst zu schnell",
        answerB = "Du gehst zu Fuß",
        answerC = "Es ist Nacht",
        answerD = "Der Polizist ist korrupt",
        correctAnswer = 1,
        explanation = "Du FÄHRST nicht – du GEHST zu Fuß durch den Tunnel. Für Fußgänger gilt die Einbahnstraßenregel nicht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was wird kleiner, wenn man es auf den Kopf stellt?",
        answerA = "Ein Glas Wasser",
        answerB = "Die Zahl 6",
        answerC = "Ein Sanduhr",
        answerD = "Ein Baum",
        correctAnswer = 1,
        explanation = "Die Zahl 6 wird zu einer 9, wenn man sie auf den Kopf stellt – und 9 ist größer als 6. Nein, warte: Die Frage sagt 'kleiner' – und 6 auf dem Kopf wird zur 9. Oder: Die Zahl 9 auf dem Kopf wird zur 6, die kleiner ist.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie oft kann man 10 von 100 abziehen?",
        answerA = "10 Mal",
        answerB = "Nur einmal",
        answerC = "9 Mal",
        answerD = "Unendlich oft",
        correctAnswer = 1,
        explanation = "Nur einmal! Nach dem ersten Abziehen ist es nicht mehr 100, sondern 90. Das nächste Mal zieht man 10 von 90 ab.",
        difficulty = 1,
        funFact = "Diese Frage prüft, ob man die Ausgangsbedingung im Blick behält."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Ohren, aber kann nicht hören?",
        answerA = "Ein Elefant",
        answerB = "Ein Maiskolben",
        answerC = "Eine Tasse",
        answerD = "Eine Vase",
        correctAnswer = 1,
        explanation = "Ein Maiskolben hat 'Ohren' – so nennt man auf Englisch (ears of corn) und auch im Deutschen manchmal die Maiskolben. Zudem haben Töpfe und Tassen 'Ohren' (Henkel).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Ringe, aber keinen Finger?",
        answerA = "Eine Kette",
        answerB = "Ein Saturn",
        answerC = "Ein Baum",
        answerD = "Eine Zwiebelschale",
        correctAnswer = 2,
        explanation = "Ein Baum hat Jahresringe im Querschnitt – so kann man sein Alter bestimmen. Kein Finger nötig.",
        difficulty = 1,
        funFact = "Die Wissenschaft der Baumringforschung heißt Dendrochronologie und kann Bäume bis zu 5000 Jahre alt datieren."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Flugzeug auf der Grenze zwischen zwei Ländern abstürzt, wo werden die Überlebenden begraben?",
        answerA = "Im näheren Land",
        answerB = "In ihrem Heimatland",
        answerC = "Überlebende werden nicht begraben",
        answerD = "Das bestimmt ein Gericht",
        correctAnswer = 2,
        explanation = "Überlebende werden NICHT begraben – sie haben den Absturz überlebt!",
        difficulty = 1,
        funFact = "Diese Frage ist eine klassische Denk-Falle, weil man sofort über Beerdigungsregelungen nachdenkt."
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat einen Schwanz, aber keinen Körper?",
        answerA = "Ein Komet",
        answerB = "Ein Pfeil",
        answerC = "Eine Münze",
        answerD = "Ein Stern",
        correctAnswer = 2,
        explanation = "Eine Münze hat eine 'Zahl'-Seite (Kopf) und eine 'Adler'- oder 'Wappen'-Seite. Im Deutschen sagt man 'Kopf oder Zahl' – auf Englisch 'heads or tails' (Kopf oder Schwanz). Die Münze hat einen 'Schwanz', aber keinen lebenden Körper.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was läuft, hat aber keine Beine?",
        answerA = "Ein Auto",
        answerB = "Wasser (ein Fluss)",
        answerC = "Ein Ball",
        answerD = "Eine Uhr",
        correctAnswer = 1,
        explanation = "Wasser 'läuft' einen Fluss hinunter, hat aber keine Beine.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ich stehe in der Mitte von Paris. Was bin ich?",
        answerA = "Der Eiffelturm",
        answerB = "Der Buchstabe R",
        answerC = "Der Louvre",
        answerD = "Der Triumphbogen",
        correctAnswer = 1,
        explanation = "In der Mitte des Wortes 'Paris' steht der Buchstabe 'r' (P-a-R-i-s).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist größer als ein Elefant, wiegt aber nichts?",
        answerA = "Der Ozean",
        answerB = "Der Schatten eines Elefanten",
        answerC = "Eine Wolke",
        answerD = "Der Himmel",
        correctAnswer = 1,
        explanation = "Der Schatten eines Elefanten ist genauso groß wie der Elefant (oder größer), wiegt aber überhaupt nichts.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Wort hat in jeder Sprache dieselbe Aussprache?",
        answerA = "Mama",
        answerB = "Hallo",
        answerC = "Wasser",
        answerD = "Nein",
        correctAnswer = 0,
        explanation = "'Mama' oder ähnliche Varianten (Maman, Mom, Mam) klingen in fast allen Sprachen der Welt ähnlich – weil es der erste Laut ist, den Babys machen.",
        difficulty = 1,
        funFact = "Linguisten haben festgestellt, dass Silben mit M und A in fast allen Sprachen für 'Mutter' verwendet werden."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie nennt man einen Schneemann im Sommer?",
        answerA = "Einen nassen Schneemann",
        answerB = "Eine Pfütze",
        answerC = "Wasser",
        answerD = "Schmelzwasser",
        correctAnswer = 1,
        explanation = "Ein Schneemann im Sommer schmilzt und wird zu einer Pfütze – er ist weg!",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat kein Gewicht, aber kann ein Schiff versenken?",
        answerA = "Ein Sturm",
        answerB = "Ein Loch",
        answerC = "Eine Welle",
        answerD = "Eis",
        correctAnswer = 1,
        explanation = "Ein Loch hat kein Gewicht, aber wenn es im Rumpf eines Schiffes entsteht, kann es das Schiff zum Sinken bringen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann man hören, aber nicht sehen und nicht anfassen?",
        answerA = "Licht",
        answerB = "Stille",
        answerC = "Schall / Lärm",
        answerD = "Eine Idee",
        correctAnswer = 2,
        explanation = "Schall (Geräusche) kann man hören, aber nicht sehen oder anfassen – er ist eine Druckwelle in der Luft.",
        difficulty = 1,
        funFact = "Im Vakuum gibt es keinen Schall – im Weltraum kann niemand dich schreien hören."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das: Es hat einen Kopf und einen Schwanz, aber keinen Körper?",
        answerA = "Eine Schlange",
        answerB = "Eine Münze",
        answerC = "Ein Komma",
        answerD = "Ein Pfeil",
        correctAnswer = 1,
        explanation = "Eine Münze hat eine Kopfseite und eine Zahlseite – im Deutschen sagt man 'Kopf oder Zahl', im Englischen 'heads or tails' (Kopf oder Schwanz).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie heißt die Mutter aller Mütter?",
        answerA = "Großmutter",
        answerB = "Die Erde",
        answerC = "Oma",
        answerD = "Urgroßmutter",
        correctAnswer = 1,
        explanation = "Die Erde wird oft als 'Mutter Erde' bezeichnet – sie ist die Mutter aller Lebewesen und damit aller Mütter.",
        difficulty = 1,
        funFact = "In vielen Kulturen und Mythologien wird die Erde als weibliche Gottheit verehrt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Elektriker, ein Klempner und ein Maler arbeiten an einem Haus. Wer kommt zuerst?",
        answerA = "Der Elektriker",
        answerB = "Der Klempner",
        answerC = "Der Maler",
        answerD = "Sie kommen alle gleichzeitig",
        correctAnswer = 1,
        explanation = "Der Klempner muss zuerst kommen und die Rohre verlegen. Dann kommt der Elektriker für die Leitungen. Zuletzt streicht der Maler die Wände.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Äste, aber keine Blätter und keine Früchte?",
        answerA = "Ein toter Baum",
        answerB = "Ein Fluss",
        answerC = "Ein Gebirge",
        answerD = "Ein Korallriff",
        correctAnswer = 1,
        explanation = "Ein Fluss hat einen Hauptlauf und Nebenarme (Äste), aber natürlich keine Blätter oder Früchte.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hört das Ende jedes Witzes?",
        answerA = "Das Publikum",
        answerB = "Den Buchstaben S",
        answerC = "Eine Pointe",
        answerD = "Ein Lachen",
        correctAnswer = 1,
        explanation = "Das Wort 'Witzes' – am Ende steht der Buchstabe 'S'. Das ist die Antwort auf 'Was hört das Ende jedes Witzes?'",
        difficulty = 1,
        funFact = null
    )
)
