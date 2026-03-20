package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

// Sources: raetselstunde.de, raetseldino.de, kleineschule.com.de, spiele-gruppen.de,
//          gedankenwelt.de, schnitzeljagd-kinder.com, logiclike.com/de, studyflix.de,
//          karrierebibel.de, betzold.de, raetselgeist.de, wort-spielereien.de
// correctAnswer distribution: 0→12, 1→13, 2→13, 3→12 (total 50)
fun logicQuestionsEasy5(): List<Question> = listOf(

    // ── correctAnswer = 0 (12 questions) ──────────────────────────────────────

    // Source: spiele-gruppen.de / raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Ein Mann schiebt sein Auto an ein Hotel heran und ist danach pleite. Was ist passiert?",
        answerA = "Er hat Monopoly gespielt",
        answerB = "Das Auto hatte eine Panne",
        answerC = "Er hat zu viel getankt",
        answerD = "Er hat das Hotel gekauft",
        correctAnswer = 0,
        explanation = "Beim Brettspiel Monopoly schiebt man seine Spielfigur (Auto) auf ein Hotelfeld und muss Miete zahlen – das kann einen in den Ruin treiben.",
        difficulty = 1,
        funFact = "Monopoly wurde 1935 von Charles Darrow erfunden und ist eines der meistverkauften Brettspiele der Welt."
    ),

    // Source: raetselstunde.de / gedankenwelt.de
    Question(
        categoryId = 12,
        questionText = "Jemand sagt: 'Vorgestern war ich 25, nächstes Jahr werde ich 28.' An welchem Tag hat er Geburtstag?",
        answerA = "31. Dezember",
        answerB = "1. Januar",
        answerC = "29. Februar",
        answerD = "1. April",
        correctAnswer = 0,
        explanation = "Er spricht am 1. Januar. Vorgestern (30. Dezember) war er noch 25. Gestern (31. Dezember) wurde er 26. Dieses Jahr wird er 27. Nächstes Jahr 28.",
        difficulty = 1,
        funFact = "Dieses Rätsel funktioniert nur, wenn der Geburtstag auf den 31. Dezember fällt und das Gespräch am 1. Januar stattfindet."
    ),

    // Source: logiclike.com/de
    Question(
        categoryId = 12,
        questionText = "Was wird größer, je mehr man davon wegnimmt?",
        answerA = "Ein Loch",
        answerB = "Ein Kuchen",
        answerC = "Eine Schuld",
        answerD = "Ein Stapel",
        correctAnswer = 0,
        explanation = "Ein Loch: Je mehr Material man herausgräbt oder entfernt, desto größer wird das Loch.",
        difficulty = 1,
        funFact = "Das tiefste von Menschen gegrabene Loch der Welt ist die Kola-Supertiefbohrung in Russland mit über 12 km Tiefe."
    ),

    // Source: raetselgeist.de / studyflix.de
    Question(
        categoryId = 12,
        questionText = "Was ist immer vor dir, aber kann nicht gesehen werden?",
        answerA = "Die Zukunft",
        answerB = "Dein Schatten",
        answerC = "Die Luft",
        answerD = "Dein Rücken",
        correctAnswer = 0,
        explanation = "Die Zukunft liegt immer vor uns – sie ist aber noch nicht eingetroffen und daher unsichtbar.",
        difficulty = 1,
        funFact = "Das Wort 'Zukunft' kommt vom althochdeutschen 'zuochumft' – 'das Herankommen'."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Was hat Zeiger, aber zeigt nie auf sich selbst?",
        answerA = "Eine Uhr",
        answerB = "Ein Kompass",
        answerC = "Ein Spiegel",
        answerD = "Ein Wegweiser",
        correctAnswer = 0,
        explanation = "Eine Uhr hat Zeiger, die immer auf Zahlen auf dem Zifferblatt zeigen – niemals auf die Zeiger selbst.",
        difficulty = 1,
        funFact = null
    ),

    // Source: karrierebibel.de
    Question(
        categoryId = 12,
        questionText = "Du stehst an einem Ort. Du gehst 1 km nach Süden, 1 km nach Osten, 1 km nach Norden und bist wieder am Ausgangspunkt. Wo kannst du am wahrscheinlichsten stehen?",
        answerA = "Am Nordpol",
        answerB = "Am Südpol",
        answerC = "Am Äquator",
        answerD = "In der Mitte Europas",
        correctAnswer = 0,
        explanation = "Am Nordpol ist die klassische Antwort: Von dort aus führt jede Richtung nach Süden, nach Osten kommt man im Kreis zurück, und nach Norden geht es zurück zum Pol.",
        difficulty = 1,
        funFact = "Am Nordpol zeigt ein Kompass nicht zuverlässig nach Norden – alle Richtungen führen von dort aus nach Süden."
    ),

    // Source: wort-spielereien.de / raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Ein Baum fällt im Wald. Kein Mensch ist in der Nähe. Wie viele Bäume sind danach noch im Wald?",
        answerA = "Genauso viele wie vorher – er liegt noch im Wald",
        answerB = "Einer weniger",
        answerC = "Das hängt von der Waldgröße ab",
        answerD = "Keiner – alle fallen mit",
        correctAnswer = 0,
        explanation = "Der gefallene Baum liegt immer noch im Wald! Die Anzahl hat sich nicht verändert – er ist nur umgefallen, nicht verschwunden.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Du hast 3 Äpfel und nimmst 2 weg. Wie viele Äpfel hast du?",
        answerA = "2",
        answerB = "1",
        answerC = "3",
        answerD = "0",
        correctAnswer = 0,
        explanation = "Du hast 2 Äpfel – nämlich die, die du weggenommen (also behalten) hast!",
        difficulty = 1,
        funFact = null
    ),

    // Source: logikquiz.de / raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Wenn du eine Zahl verdoppelst, 10 addierst und das Ergebnis halbierst – was erhältst du?",
        answerA = "Die Ausgangszahl plus 5",
        answerB = "Die Ausgangszahl verdreifacht",
        answerC = "Immer 10",
        answerD = "Die Ausgangszahl selbst",
        correctAnswer = 0,
        explanation = "Nehmen wir x: (2x + 10) ÷ 2 = x + 5. Das Ergebnis ist immer die Ausgangszahl + 5.",
        difficulty = 1,
        funFact = "Dieser Trick funktioniert bei jeder beliebigen Zahl – probiere es mit 7 aus: (14 + 10) ÷ 2 = 12 = 7 + 5."
    ),

    // Source: schnitzeljagd-kinder.com / bravo.de
    Question(
        categoryId = 12,
        questionText = "Was wächst mit der Spitze nach unten?",
        answerA = "Ein Stalaktit",
        answerB = "Ein Baum",
        answerC = "Ein Kaktus",
        answerD = "Eine Stalagmite",
        correctAnswer = 0,
        explanation = "Stalaktiten wachsen von der Höhlendecke nach unten – ihre Spitze zeigt zum Boden.",
        difficulty = 1,
        funFact = "Stalaktiten wachsen extrem langsam: nur etwa 0,1 bis 1 mm pro Jahr. Manche sind tausende Jahre alt."
    ),

    // Source: raetseldino.de / programmwechsel.de
    Question(
        categoryId = 12,
        questionText = "Welcher Handwerker 'verputzt' ganze Häuser und isst daher am meisten?",
        answerA = "Der Maurer",
        answerB = "Der Zimmermann",
        answerC = "Der Klempner",
        answerD = "Der Elektriker",
        correctAnswer = 0,
        explanation = "Der Maurer – er 'verputzt' Häuser. 'Verputzen' bedeutet sowohl 'mit Putz verkleiden' als auch umgangssprachlich 'aufessen'.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetselstunde.de / schulkreis.de
    Question(
        categoryId = 12,
        questionText = "Wie viele Sekunden hat ein Jahr?",
        answerA = "Ca. 31.536.000",
        answerB = "Ca. 8.760",
        answerC = "Ca. 525.600",
        answerD = "Ca. 3.153.600",
        correctAnswer = 0,
        explanation = "365 Tage × 24 Stunden × 60 Minuten × 60 Sekunden = 31.536.000 Sekunden.",
        difficulty = 1,
        funFact = "Der Musical-Song 'Seasons of Love' fragt 'How do you measure a year?' und antwortet: 525.600 Minuten."
    ),

    // ── correctAnswer = 1 (13 questions) ──────────────────────────────────────

    // Source: raetselstunde.de / betzold.de
    Question(
        categoryId = 12,
        questionText = "Eine Mutter hat 4 Töchter. Jede Tochter hat genau einen Bruder. Wie viele Kinder hat die Mutter insgesamt?",
        answerA = "8",
        answerB = "5",
        answerC = "4",
        answerD = "9",
        correctAnswer = 1,
        explanation = "Es gibt nur EINEN Bruder, der für alle vier Töchter derselbe ist. Also 4 Töchter + 1 Sohn = 5 Kinder.",
        difficulty = 1,
        funFact = "Dieses klassische Rätsel täuscht viele, weil man instinktiv 4 Brüder annimmt."
    ),

    // Source: spiele-gruppen.de / logiclike.com
    Question(
        categoryId = 12,
        questionText = "Zwei Väter und zwei Söhne sitzen in einem Auto. Es sind aber nur 3 Personen im Wagen. Wie ist das möglich?",
        answerA = "Einer sitzt im Kofferraum",
        answerB = "Es sind Großvater, Vater und Sohn",
        answerC = "Einer ist unsichtbar",
        answerD = "Das Auto ist doppelt groß",
        correctAnswer = 1,
        explanation = "Der Großvater ist zugleich Vater (des mittleren Mannes), der mittlere Mann ist zugleich Sohn und Vater (des Enkels). Drei Personen, aber zwei Väter und zwei Söhne.",
        difficulty = 1,
        funFact = "Dieses Rätsel ist eines der bekanntesten Logikrätsel weltweit."
    ),

    // Source: raetseldino.de / betzold.de
    Question(
        categoryId = 12,
        questionText = "Was hat Städte, aber keine Häuser, Wälder, aber keine Bäume, und Flüsse, aber kein Wasser?",
        answerA = "Ein Gemälde",
        answerB = "Eine Landkarte",
        answerC = "Ein Buch",
        answerD = "Ein Computerspiel",
        correctAnswer = 1,
        explanation = "Eine Landkarte zeigt Symbole für Städte, Wälder und Flüsse, enthält aber keine echten Häuser, Bäume oder Wasser.",
        difficulty = 1,
        funFact = "Die älteste bekannte Landkarte ist über 3.700 Jahre alt und stammt aus dem antiken Babylonien."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Teas Mutter hat vier Töchter. Die ersten drei heißen Dana, Dena und Dina. Wie heißt die vierte Tochter?",
        answerA = "Dona",
        answerB = "Tea",
        answerC = "Duna",
        answerD = "Tina",
        correctAnswer = 1,
        explanation = "Die Frage beginnt mit 'Teas Mutter hat vier Töchter' – Tea ist also selbst eine der Töchter und damit die Antwort.",
        difficulty = 1,
        funFact = "Dieses Rätsel ist eine klassische Falle: Man sucht das Muster (Da, De, Di…) und übersieht, dass Tea bereits im ersten Satz steht."
    ),

    // Source: wort-spielereien.de
    Question(
        categoryId = 12,
        questionText = "Was läuft und hat doch keine Füße?",
        answerA = "Das Feuer",
        answerB = "Ein Fluss",
        answerC = "Der Wind",
        answerD = "Ein Zug",
        correctAnswer = 1,
        explanation = "Ein Fluss 'läuft' (fließt) von der Quelle zur Mündung, hat aber natürlich keine Füße.",
        difficulty = 1,
        funFact = "Der längste Fluss der Welt ist der Nil mit rund 6.650 km Länge."
    ),

    // Source: raetselgeist.de / studyflix.de
    Question(
        categoryId = 12,
        questionText = "Was wird nasser, je mehr es trocknet?",
        answerA = "Ein Schwamm",
        answerB = "Ein Handtuch",
        answerC = "Ein Regenschirm",
        answerD = "Ein Wischlappen",
        correctAnswer = 1,
        explanation = "Ein Handtuch nimmt beim Abtrocknen immer mehr Wasser auf – es wird selbst nasser, je mehr es trocknet.",
        difficulty = 1,
        funFact = "Ein Frottee-Handtuch kann bis zu 30 % seines Eigengewichts an Wasser aufnehmen."
    ),

    // Source: raetselstunde.de / denksport-raetsel.de
    Question(
        categoryId = 12,
        questionText = "Wenn 3 Hühner in 3 Minuten 3 Eier legen, wie viele Eier legen 6 Hühner in 6 Minuten?",
        answerA = "6",
        answerB = "12",
        answerC = "9",
        answerD = "18",
        correctAnswer = 1,
        explanation = "Ein Huhn legt in 3 Minuten 1 Ei. In 6 Minuten legt es 2 Eier. 6 Hühner × 2 Eier = 12 Eier.",
        difficulty = 1,
        funFact = "In Deutschland werden jährlich rund 16 Milliarden Eier produziert."
    ),

    // Source: schnitzeljagd-kinder.com / bravo.de
    Question(
        categoryId = 12,
        questionText = "Was kommt einmal in einer Minute vor, zweimal in einem Moment, aber kein einziges Mal in tausend Jahren?",
        answerA = "Der Buchstabe 'e'",
        answerB = "Der Buchstabe 'm'",
        answerC = "Eine Sekunde",
        answerD = "Ein Wimpernschlag",
        correctAnswer = 1,
        explanation = "Der Buchstabe 'm': in 'Minute' einmal, in 'Moment' zweimal, in 'tausend Jahren' kein einziges Mal.",
        difficulty = 1,
        funFact = "Solche Rätsel nennt man Buchstaben-Logik-Rätsel und sind ein klassisches Beispiel für sprachbasierte Denkaufgaben."
    ),

    // Source: raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Wie oft kommt die Ziffer 8 in allen Zahlen von 1 bis 100 vor?",
        answerA = "10-mal",
        answerB = "20-mal",
        answerC = "18-mal",
        answerD = "11-mal",
        correctAnswer = 1,
        explanation = "8, 18, 28, 38, 48, 58, 68, 78, 98 (je eine 8) + 80–87, 89 (je eine 8) + 88 (zwei Achten) = 20 Mal.",
        difficulty = 1,
        funFact = "Die Zahl 88 enthält zwei Achten – das übersehen viele beim schnellen Zählen."
    ),

    // Source: wort-spielereien.de
    Question(
        categoryId = 12,
        questionText = "Welches Wort liest sich vorwärts und rückwärts gleich?",
        answerA = "Stuhl",
        answerB = "Rennfahrer",
        answerC = "Lesen",
        answerD = "Kaffee",
        correctAnswer = 1,
        explanation = "Rennfahrer: R-E-N-N-F-A-H-R-E-R – vorwärts und rückwärts identisch. Solche Wörter nennt man Palindrome.",
        difficulty = 1,
        funFact = "Auch 'Otto', 'Anna' und 'Kajak' sind bekannte deutsche Palindrome."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Du gehst eine Treppe hoch: 2 Stufen rauf, 1 Stufe runter, 2 rauf, 1 runter – und das 10 Mal. Auf welcher Stufe stehst du?",
        answerA = "20",
        answerB = "10",
        answerC = "15",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Pro Zyklus: +2 - 1 = +1 Stufe Nettogewinn. Nach 10 Zyklen: 10 × 1 = 10. Du stehst auf Stufe 10.",
        difficulty = 1,
        funFact = null
    ),

    // Source: schnitzeljagd-kinder.com
    Question(
        categoryId = 12,
        questionText = "Ich habe eine Mündung, aber ich spreche nicht. Ich fließe, aber habe keine Beine. Was bin ich?",
        answerA = "Ein Wasserfall",
        answerB = "Ein Fluss",
        answerC = "Ein Bach",
        answerD = "Ein Kanal",
        correctAnswer = 1,
        explanation = "Ein Fluss hat eine Mündung (wo er ins Meer mündet), fließt ständig, hat aber keine Beine.",
        difficulty = 1,
        funFact = "Der Rhein hat seine Mündung in den Niederlanden in der Nordsee."
    ),

    // Source: raetselstunde.de / schulkreis.de
    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als nächstes? 2, 4, 8, 16, 32, …",
        answerA = "48",
        answerB = "64",
        answerC = "60",
        answerD = "36",
        correctAnswer = 1,
        explanation = "Jede Zahl wird mit 2 multipliziert: 32 × 2 = 64.",
        difficulty = 1,
        funFact = "Diese geometrische Folge findet sich in der Natur häufig, z. B. bei der Zellteilung."
    ),

    // ── correctAnswer = 2 (13 questions) ──────────────────────────────────────

    // Source: kleineschule.com.de
    Question(
        categoryId = 12,
        questionText = "Tony kauft eine 2,15 m lange Angelrute. Im Bus darf er nichts mitnehmen, das länger als 2 m ist. Was kauft er zusätzlich?",
        answerA = "Eine Säge",
        answerB = "Ein Busticket erster Klasse",
        answerC = "Einen 2 m langen Koffer",
        answerD = "Einen größeren Rucksack",
        correctAnswer = 2,
        explanation = "Er kauft einen 2 m langen Koffer. Die Angelrute passt diagonal hinein: √(2² + 0,75²) ≈ 2,14 m. So bleibt die Rute intakt und der Koffer ist nur 2 m lang.",
        difficulty = 1,
        funFact = null
    ),

    // Source: betzold.de / raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Daniel führt täglich 2 Hunde aus und läuft dabei 4,5 km. Wenn er stattdessen 4 Hunde ausführt, wie weit läuft er dann?",
        answerA = "9 km",
        answerB = "3 km",
        answerC = "4,5 km",
        answerD = "6 km",
        correctAnswer = 2,
        explanation = "Die Strecke bleibt gleich, egal wie viele Hunde er ausführt. Er läuft immer die gleiche Route: 4,5 km.",
        difficulty = 1,
        funFact = null
    ),

    // Source: kleineschule.com.de / raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Ein Arzt verschreibt dir 3 Tabletten. Jede halbe Stunde eine. Wie lange dauert es, bis du alle genommen hast?",
        answerA = "1,5 Stunden",
        answerB = "2 Stunden",
        answerC = "1 Stunde",
        answerD = "30 Minuten",
        correctAnswer = 2,
        explanation = "Erste Tablette sofort (Minute 0), zweite nach 30 Minuten, dritte nach 60 Minuten. Also genau 1 Stunde – nicht 1,5 Stunden!",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Was hat Augen, aber kann nicht sehen?",
        answerA = "Eine Puppe",
        answerB = "Ein Igel",
        answerC = "Eine Kartoffel",
        answerD = "Ein Fisch",
        correctAnswer = 2,
        explanation = "Eine Kartoffel hat 'Augen' (Keimaugen) – kleine Vertiefungen, aus denen neue Triebe wachsen. Sehen kann sie damit natürlich nicht.",
        difficulty = 1,
        funFact = "Das Wort 'Auge' für Kartoffelkeime kommt von der runden, augenähnlichen Form dieser Vertiefungen."
    ),

    // Source: schnitzeljagd-kinder.com
    Question(
        categoryId = 12,
        questionText = "Was hat Zähne, aber beißt nicht?",
        answerA = "Ein Hund ohne Leine",
        answerB = "Ein Zahnrad",
        answerC = "Ein Kamm",
        answerD = "Eine Säge",
        correctAnswer = 2,
        explanation = "Ein Kamm hat Zähne (die schmalen Zinken), beißt aber nicht – er wird zum Kämmen der Haare benutzt.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Was ist schwerer: ein Kilogramm Federn oder ein Kilogramm Eisen?",
        answerA = "Eisen",
        answerB = "Federn",
        answerC = "Beide gleich schwer",
        answerD = "Kommt auf die Federn an",
        correctAnswer = 2,
        explanation = "Beide wiegen genau gleich viel: ein Kilogramm. Das Volumen ist sehr unterschiedlich, aber das Gewicht ist identisch.",
        difficulty = 1,
        funFact = "Eisen hat eine Dichte von ca. 7,9 g/cm³, Federn liegen bei ca. 0,03 g/cm³ – 1 kg Federn nimmt rund 260-mal so viel Raum ein wie 1 kg Eisen."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Wie viele Monate im Jahr haben 28 Tage?",
        answerA = "Nur einer (Februar)",
        answerB = "Sieben",
        answerC = "Alle zwölf",
        answerD = "Keiner",
        correctAnswer = 2,
        explanation = "Alle zwölf Monate haben mindestens 28 Tage! Der Februar hat im Normalfall genau 28, alle anderen Monate haben mehr – aber alle haben auch 28.",
        difficulty = 1,
        funFact = "Im Schaltjahr hat der Februar 29 Tage. Ein Schaltjahr ist jedes durch 4 teilbare Jahr."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Kann ein lebender Mann seine eigene Witwe heiraten?",
        answerA = "Ja, mit Sondergenehmigung",
        answerB = "Ja, nach 2 Jahren Wartezeit",
        answerC = "Nein, das ist unmöglich",
        answerD = "Nein, er braucht eine Genehmigung",
        correctAnswer = 2,
        explanation = "Eine Witwe ist eine Frau, deren Mann gestorben ist. Ein lebender Mann kann keine Witwe haben – denn dafür müsste er selbst tot sein.",
        difficulty = 1,
        funFact = "Das Wort 'Witwe' stammt vom indogermanischen Wurzelwort 'vidhava', was 'leer' oder 'verlassen' bedeutet."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Wenn ein Schachbrett 64 Felder hat – wie viele Ecken hat das Schachbrett insgesamt?",
        answerA = "64",
        answerB = "8",
        answerC = "4",
        answerD = "256",
        correctAnswer = 2,
        explanation = "Das gesamte Schachbrett hat 4 Ecken – genauso wie jedes andere Rechteck. Die Anzahl der Felder ändert daran nichts.",
        difficulty = 1,
        funFact = null
    ),

    // Source: schulkreis.de / sivakids.de
    Question(
        categoryId = 12,
        questionText = "Was ergibt 11 × 11?",
        answerA = "111",
        answerB = "131",
        answerC = "121",
        answerD = "112",
        correctAnswer = 2,
        explanation = "11 × 11 = 121.",
        difficulty = 1,
        funFact = "Interessantes Muster: 11²=121, 11³=1331, 11⁴=14641 – die Koeffizienten entsprechen dem Pascalschen Dreieck!"
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Wie viele Buchstaben hat das deutsche Alphabet (inklusive Ä, Ö, Ü und ß)?",
        answerA = "26",
        answerB = "23",
        answerC = "30",
        answerD = "28",
        correctAnswer = 2,
        explanation = "Das deutsche Alphabet hat 26 Grundbuchstaben plus 4 Sonderbuchstaben (Ä, Ö, Ü, ß) = 30 Buchstaben insgesamt.",
        difficulty = 1,
        funFact = "Das ß (Eszett) ist der einzige deutsche Buchstabe, der bis 2017 nur in Kleinschreibung existierte – dann wurde das große ẞ offiziell eingeführt."
    ),

    // Source: gedankenwelt.de
    Question(
        categoryId = 12,
        questionText = "Was reist um die ganze Welt, bleibt aber immer in seiner Ecke?",
        answerA = "Ein Koffer",
        answerB = "Ein Kompass",
        answerC = "Eine Briefmarke",
        answerD = "Ein Atlas",
        correctAnswer = 2,
        explanation = "Eine Briefmarke klebt immer in der Ecke des Briefumschlags und reist so mit dem Brief um die ganze Welt.",
        difficulty = 1,
        funFact = "Die erste Briefmarke der Welt war die 'Penny Black', ausgegeben in Großbritannien am 6. Mai 1840."
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Auf einem Bauernhof gibt es Hühner und Kühe. Zusammen haben sie 14 Köpfe und 36 Beine. Wie viele Kühe gibt es?",
        answerA = "6",
        answerB = "5",
        answerC = "4",
        answerD = "8",
        correctAnswer = 2,
        explanation = "4 Kühe (4×4=16 Beine) + 10 Hühner (10×2=20 Beine) = 36 Beine und 14 Köpfe. Es gibt 4 Kühe.",
        difficulty = 1,
        funFact = null
    ),

    // ── correctAnswer = 3 (12 questions) ──────────────────────────────────────

    // Source: raetselstunde.de / wort-spielereien.de
    Question(
        categoryId = 12,
        questionText = "Was geht ohne Beine?",
        answerA = "Ein Rad",
        answerB = "Ein Stein",
        answerC = "Der Wind",
        answerD = "Die Zeit",
        correctAnswer = 3,
        explanation = "Die Zeit 'geht' (im Sinne von 'vergeht'), obwohl sie keine Beine hat.",
        difficulty = 1,
        funFact = "Im Deutschen sagen wir 'Die Zeit geht' oder 'Die Uhr geht' – ein interessantes sprachliches Bild."
    ),

    // Source: raetselstunde.de / raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Wann kommt Donnerstag vor Mittwoch?",
        answerA = "Im Schaltjahr",
        answerB = "Niemals",
        answerC = "Im Kalender nächsten Jahres",
        answerD = "Im Wörterbuch",
        correctAnswer = 3,
        explanation = "Im Wörterbuch! Die Wörter sind alphabetisch sortiert, und 'Donnerstag' kommt im Alphabet vor 'Mittwoch'.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetseldino.de / programmwechsel.de
    Question(
        categoryId = 12,
        questionText = "Wo geht man morgens durch ein großes Loch rein und durch zwei kleinere Löcher wieder raus?",
        answerA = "Durch einen Tunnel",
        answerB = "Durch eine Jacke",
        answerC = "Durch einen Schuh",
        answerD = "Durch eine Hose",
        correctAnswer = 3,
        explanation = "Wenn man eine Hose anzieht: Man schiebt beide Beine durch den Bund (ein großes Loch) und sie kommen durch die beiden Hosenbeine wieder heraus.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetselstunde.de / schulkreis.de
    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als nächstes in dieser Reihe? 1, 2, 4, 7, 11, 16, …",
        answerA = "20",
        answerB = "21",
        answerC = "19",
        answerD = "22",
        correctAnswer = 3,
        explanation = "Die Abstände steigen um 1: +1, +2, +3, +4, +5, +6. Von 16 aus: 16 + 6 = 22.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Was hat Tasten, aber kein Schloss, und macht Musik?",
        answerA = "Eine Orgel",
        answerB = "Eine Gitarre",
        answerC = "Eine Trompete",
        answerD = "Ein Klavier",
        correctAnswer = 3,
        explanation = "Ein Klavier hat Tasten (Klaviertasten), aber kein Schloss. Mit den Tasten wird Musik erzeugt.",
        difficulty = 1,
        funFact = "Das Klavier wurde um 1700 von Bartolomeo Cristofori in Florenz erfunden."
    ),

    // Source: logiclike.com/de
    Question(
        categoryId = 12,
        questionText = "Was hat keinen festen Körper, aber wirft dennoch einen Schatten?",
        answerA = "Der Mond",
        answerB = "Die Sonne",
        answerC = "Der Nebel",
        answerD = "Eine Wolke",
        correctAnswer = 3,
        explanation = "Eine Wolke besteht aus winzigen Wassertröpfchen und hat keinen festen Körper, wirft aber deutlich sichtbare Schatten auf die Erde.",
        difficulty = 1,
        funFact = null
    ),

    // Source: studyflix.de / raetselgeist.de
    Question(
        categoryId = 12,
        questionText = "Ich bin leichter als eine Feder, aber kein Mensch kann mich länger als ein paar Minuten halten. Was bin ich?",
        answerA = "Ein Gedanke",
        answerB = "Licht",
        answerC = "Eine Seifenblase",
        answerD = "Der Atem",
        correctAnswer = 3,
        explanation = "Der Atem (Luft) ist extrem leicht, aber kein Mensch kann ihn dauerhaft anhalten.",
        difficulty = 1,
        funFact = "Der Weltrekord im Luftanhalten unter Wasser liegt bei über 24 Minuten (Aleix Segura Vendrell, 2016)."
    ),

    // Source: raetseldino.de
    Question(
        categoryId = 12,
        questionText = "Kann man mit einem deutschen Personalausweis nach Istanbul fliegen?",
        answerA = "Nein, man braucht einen Reisepass",
        answerB = "Ja, immer",
        answerC = "Ja, aber nur für EU-Bürger",
        answerD = "Nein, man braucht ein Flugzeug",
        correctAnswer = 3,
        explanation = "Mit einem Ausweis allein kommt man nicht nach Istanbul – man braucht dazu ein Flugzeug! (Oder ein Schiff, einen Bus…)",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Wie viele Tage hat der Februar in einem normalen Jahr (kein Schaltjahr)?",
        answerA = "29",
        answerB = "30",
        answerC = "31",
        answerD = "28",
        correctAnswer = 3,
        explanation = "Der Februar hat in einem Normaljahr genau 28 Tage. Im Schaltjahr (alle 4 Jahre) hat er 29 Tage.",
        difficulty = 1,
        funFact = "Der Februar ist nach Februa benannt, einem römischen Reinigungsfest, das am 15. Februar gefeiert wurde."
    ),

    // Source: wort-spielereien.de
    Question(
        categoryId = 12,
        questionText = "Was ist der längste bekannte deutsche Gesetzesbegriff (63 Buchstaben)?",
        answerA = "Donaudampfschifffahrtsgesellschaft",
        answerB = "Kraftfahrzeughaftpflichtversicherung",
        answerC = "Bundesverfassungsgericht",
        answerD = "Rindfleischetikettierungsüberwachungsaufgabenübertragungsgesetz",
        correctAnswer = 3,
        explanation = "Das Rindfleischetikettierungsüberwachungsaufgabenübertragungsgesetz mit 63 Buchstaben war ein echtes Gesetz in Mecklenburg-Vorpommern.",
        difficulty = 1,
        funFact = "Dieses Wort war ein echtes Gesetz und wurde 2013 abgeschafft, als die EU-Vorschriften dazu ausliefen."
    ),

    // Source: gedankenwelt.de / raetselstunde.de
    Question(
        categoryId = 12,
        questionText = "Was kann man einmal fressen, aber nicht zweimal?",
        answerA = "Eine Brille",
        answerB = "Ein Sandwich",
        answerC = "Vergänglichkeit",
        answerD = "Den Köder einer Mausefalle",
        correctAnswer = 3,
        explanation = "Den Köder einer Mausefalle – denn nach dem ersten Zuschnappen ist die Maus gefangen und kann nicht mehr fressen.",
        difficulty = 1,
        funFact = null
    ),

    // Source: raetselstunde.de / logiclike.com
    Question(
        categoryId = 12,
        questionText = "Ich habe Gebirge ohne Felsen, Wälder ohne Bäume, Städte ohne Häuser. Was bin ich?",
        answerA = "Ein Traum",
        answerB = "Ein Gemälde",
        answerC = "Ein Globus",
        answerD = "Eine Landkarte",
        correctAnswer = 3,
        explanation = "Eine Landkarte zeigt Gebirge, Wälder und Städte als Symbole – aber ohne echte Felsen, Bäume oder Häuser.",
        difficulty = 1,
        funFact = null
    )
)
