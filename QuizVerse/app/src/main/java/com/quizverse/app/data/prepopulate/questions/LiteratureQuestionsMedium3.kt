package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMedium3(): List<Question> = listOf(

    // Question 1 — Kafka: Die Verwandlung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welches Tier verwandelt sich Gregor Samsa in Kafkas 'Die Verwandlung'?",
        answerA = "Ein Ungeziefer (riesiges Insekt)",
        answerB = "Eine Ratte",
        answerC = "Ein Hund",
        answerD = "Eine Schlange",
        correctAnswer = 0,
        explanation = "In Franz Kafkas Erzählung 'Die Verwandlung' (1912) erwacht Gregor Samsa eines Morgens und findet sich in ein riesiges Ungeziefer verwandelt — oft als Käfer interpretiert.",
        difficulty = 2,
        funFact = "Kafka beschreibt das Tier nie genau. Der Begriff 'Ungeziefer' bedeutet im Deutschen wörtlich 'nicht für Opferzwecke geeignetes Tier' — ein Wesen ohne gesellschaftlichen Wert."
    ),

    // Question 2 — Hemingway: Der alte Mann und das Meer
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie lange war der Fischer Santiago in Hemingways 'Der alte Mann und das Meer' bereits ohne Fang?",
        answerA = "42 Tage",
        answerB = "84 Tage",
        answerC = "100 Tage",
        answerD = "21 Tage",
        correctAnswer = 1,
        explanation = "In Ernest Hemingways Novelle (1952) ist Santiago bereits seit 84 Tagen ohne einen einzigen Fisch zurückgekehrt, als er endlich den riesigen Marlin fängt.",
        difficulty = 2,
        funFact = "Hemingway erhielt 1954 den Nobelpreis für Literatur — die Jury lobte ausdrücklich 'Der alte Mann und das Meer' als Beweis seiner erzählerischen Meisterschaft."
    ),

    // Question 3 — García Márquez: Hundert Jahre Einsamkeit
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie heißt das fiktive Dorf, in dem 'Hundert Jahre Einsamkeit' von García Márquez spielt?",
        answerA = "Aracataca",
        answerB = "Cartagena",
        answerC = "Macondo",
        answerD = "Bogotá",
        correctAnswer = 2,
        explanation = "Der Roman spielt in dem fiktiven Dorf Macondo, das auf der realen Bananenpflanzung in der Nähe von Aracataca basiert — dem Geburtsort des Autors Gabriel García Márquez.",
        difficulty = 2,
        funFact = "Macondo ist so ikonisch geworden, dass der Begriff 'Macondismo' heute für lateinamerikanische Wunderwelt-Literatur steht."
    ),

    // Question 4 — Orwell: Farm der Tiere
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien George Orwells 'Farm der Tiere'?",
        answerA = "1939",
        answerB = "1941",
        answerC = "1949",
        answerD = "1945",
        correctAnswer = 3,
        explanation = "George Orwells politische Fabel 'Farm der Tiere' (Animal Farm) erschien 1945. Der Roman gilt als Parabel auf die Sowjetunion unter Stalin.",
        difficulty = 2,
        funFact = "Mehrere Verlage lehnten das Buch zunächst ab — darunter auch Victor Gollancz, der die Sowjetkritik als politisch unklug empfand, während der Krieg noch andauerte."
    ),

    // Question 5 — Hermann Hesse: Siddhartha
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr veröffentlichte Hermann Hesse seinen Roman 'Siddhartha'?",
        answerA = "1922",
        answerB = "1919",
        answerC = "1927",
        answerD = "1930",
        correctAnswer = 0,
        explanation = "Hermann Hesses spiritueller Roman 'Siddhartha', der von einem jungen Brahmanen auf der Suche nach Erleuchtung handelt, erschien 1922.",
        difficulty = 2,
        funFact = "Hesse war tief von der indischen Philosophie und dem Buddhismus beeinflusst. Er schrieb 'Siddhartha' nach einer spirituellen Krise und einer Reise nach Indien."
    ),

    // Question 6 — Thomas Mann: Buddenbrooks
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt Thomas Mann 1929 den Nobelpreis für Literatur?",
        answerA = "Der Zauberberg",
        answerB = "Buddenbrooks",
        answerC = "Der Tod in Venedig",
        answerD = "Doktor Faustus",
        correctAnswer = 1,
        explanation = "Thomas Mann erhielt den Nobelpreis 1929 offiziell für 'Buddenbrooks' (1901), obwohl das Komitee intern auch 'Der Zauberberg' diskutierte. Mann selbst war überrascht, dass nur 'Buddenbrooks' genannt wurde.",
        difficulty = 2,
        funFact = "Zwischen dem Erscheinen der 'Buddenbrooks' und dem Nobelpreis lagen 28 Jahre — ein ungewöhnlich langer Zeitraum in der Geschichte des Nobelpreises."
    ),

    // Question 7 — Albert Camus: Der Fremde
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Albert Camus' Roman 'Der Fremde'?",
        answerA = "1938",
        answerB = "1944",
        answerC = "1942",
        answerD = "1947",
        correctAnswer = 2,
        explanation = "'Der Fremde' (L'Étranger) von Albert Camus erschien 1942 und gilt als Hauptwerk des Existentialismus und des Absurdismus.",
        difficulty = 2,
        funFact = "Der erste Satz des Romans — 'Heute ist Mama gestorben. Vielleicht auch gestern, ich weiß es nicht.' — gilt als einer der berühmtesten Romananfänge der Weltliteratur."
    ),

    // Question 8 — F. Scott Fitzgerald: Der große Gatsby
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wer erzählt in F. Scott Fitzgeralds 'Der große Gatsby' die Geschichte in der Ich-Form?",
        answerA = "Jay Gatsby",
        answerB = "Daisy Buchanan",
        answerC = "Tom Buchanan",
        answerD = "Nick Carraway",
        correctAnswer = 3,
        explanation = "In Fitzgeralds Roman (1925) ist Nick Carraway, Gatsbys Nachbar und entfernter Cousin von Daisy, der Ich-Erzähler der Geschichte.",
        difficulty = 2,
        funFact = "Der Roman verkaufte sich bei seiner Erstveröffentlichung schlecht. Erst nach Fitzgeralds Tod 1940 wurde er zum Klassiker — heute gilt er als das 'Große Amerikanische Buch'."
    ),

    // Question 9 — Kafka: Der Prozess
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie heißt der Hauptcharakter in Franz Kafkas Roman 'Der Prozess'?",
        answerA = "Josef K.",
        answerB = "Georg Bendemann",
        answerC = "Karl Rossmann",
        answerD = "Gregor Samsa",
        correctAnswer = 0,
        explanation = "In Kafkas Roman 'Der Prozess' (1925 posthum veröffentlicht) wird Josef K. eines Morgens verhaftet, ohne je zu erfahren, welches Verbrechen ihm vorgeworfen wird.",
        difficulty = 2,
        funFact = "Kafka bat seinen Freund Max Brod, alle unveröffentlichten Manuskripte nach seinem Tod zu verbrennen. Brod ignorierte diesen Wunsch und rettete 'Der Prozess', 'Das Schloss' und 'Amerika' für die Nachwelt."
    ),

    // Question 10 — Hemingway: Nobelpreis
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Ernest Hemingway den Nobelpreis für Literatur?",
        answerA = "1952",
        answerB = "1954",
        answerC = "1953",
        answerD = "1950",
        correctAnswer = 1,
        explanation = "Ernest Hemingway erhielt den Nobelpreis für Literatur im Jahr 1954 — zwei Jahre nach der Veröffentlichung von 'Der alte Mann und das Meer', das ausdrücklich in der Begründung erwähnt wurde.",
        difficulty = 2,
        funFact = "Hemingway konnte die Preisverleihung in Stockholm nicht persönlich entgegennehmen — er hatte sich bei einem Flugzeugabsturz schwer verletzt und sandte eine schriftliche Dankesrede."
    ),

    // Question 11 — García Márquez: Familie Buendía
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie viele Generationen der Familie Buendía werden in 'Hundert Jahre Einsamkeit' geschildert?",
        answerA = "Drei Generationen",
        answerB = "Vier Generationen",
        answerC = "Sechs Generationen",
        answerD = "Zehn Generationen",
        correctAnswer = 2,
        explanation = "Der Roman von Gabriel García Márquez begleitet sechs Generationen der Familie Buendía in dem fiktiven Dorf Macondo — von der Gründung bis zum Untergang.",
        difficulty = 2,
        funFact = "Viele männliche Figuren des Romans heißen 'Aureliano' oder 'José Arcadio', was die Verwirrung der Familiengeschichte absichtlich verstärkt — ein Stilmittel des Magischen Realismus."
    ),

    // Question 12 — Orwell: 1984
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien George Orwells dystopischer Roman '1984'?",
        answerA = "1945",
        answerB = "1947",
        answerC = "1948",
        answerD = "1949",
        correctAnswer = 3,
        explanation = "Orwells Roman '1984' erschien im Jahr 1949. Orwell begann ihn 1946 zu schreiben und beendete ihn Ende 1948 — daher der umgekehrte Titel '1984'.",
        difficulty = 2,
        funFact = "Orwell schrieb den Roman krank auf der schottischen Insel Jura. Er starb nur sechs Monate nach der Veröffentlichung an Tuberkulose."
    ),

    // Question 13 — Hesse: Steppenwolf
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Hermann Hesses Roman 'Der Steppenwolf'?",
        answerA = "1927",
        answerB = "1922",
        answerC = "1930",
        answerD = "1919",
        correctAnswer = 0,
        explanation = "Hermann Hesses 'Der Steppenwolf' erschien 1927. Der Roman schildert den innerlich zerrissenen Intellektuellen Harry Haller, der sich halb Mensch, halb Wolf fühlt.",
        difficulty = 2,
        funFact = "In den 1960er Jahren wurde 'Der Steppenwolf' zur Bibel der Hippie-Bewegung — die Rockband 'Steppenwolf' benannte sich nach dem Roman."
    ),

    // Question 14 — Thomas Mann: Der Zauberberg
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Land spielt Thomas Manns Roman 'Der Zauberberg'?",
        answerA = "Deutschland",
        answerB = "Schweiz",
        answerC = "Österreich",
        answerD = "Italien",
        correctAnswer = 1,
        explanation = "Thomas Manns 'Der Zauberberg' (1924) spielt in einem Tuberkulose-Sanatorium in Davos in der Schweiz, wo der junge Hans Castorp seinen tuberkulösen Cousin besuchen will.",
        difficulty = 2,
        funFact = "Thomas Mann besuchte seine kranke Frau in Davos und wollte ursprünglich nur eine kurze Erzählung schreiben — daraus wurde ein über 1000 Seiten langer Roman."
    ),

    // Question 15 — Camus: Die Pest
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt spielt Albert Camus' Roman 'Die Pest'?",
        answerA = "Algier",
        answerB = "Tunis",
        answerC = "Oran",
        answerD = "Casablanca",
        correctAnswer = 2,
        explanation = "Camus' Roman 'Die Pest' (1947) spielt in der algerischen Küstenstadt Oran, die von einer Pestepidemie heimgesucht und von der Außenwelt abgeschnitten wird.",
        difficulty = 2,
        funFact = "Camus schrieb 'Die Pest' während der deutschen Besatzung Frankreichs im Zweiten Weltkrieg. Die Pest steht symbolisch für den Faschismus und die Notwendigkeit des Widerstands."
    ),

    // Question 16 — Fitzgerald: Der große Gatsby
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien F. Scott Fitzgeralds Roman 'Der große Gatsby'?",
        answerA = "1920",
        answerB = "1922",
        answerC = "1923",
        answerD = "1925",
        correctAnswer = 3,
        explanation = "F. Scott Fitzgeralds Meisterwerk 'Der große Gatsby' erschien im April 1925 als dritter Roman des Autors. Er spielt im Sommer 1922 auf Long Island.",
        difficulty = 2,
        funFact = "Fitzgerald erhielt für das Buch zunächst nur bescheidene Verkaufszahlen. Er starb 1940 in der Überzeugung, ein gescheiterter Schriftsteller zu sein — heute gilt der Roman als eines der größten Werke der englischsprachigen Literatur."
    ),

    // Question 17 — John Steinbeck: Früchte des Zorns
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt John Steinbeck den Pulitzer-Preis im Jahr 1940?",
        answerA = "Früchte des Zorns",
        answerB = "Von Mäusen und Menschen",
        answerC = "Jenseits von Eden",
        answerD = "Die Straße der Ölsardinen",
        correctAnswer = 0,
        explanation = "John Steinbecks Roman 'Früchte des Zorns' (The Grapes of Wrath, 1939) gewann 1940 den Pulitzer-Preis und schildert die Odyssee einer Farmerfamilie während der Großen Depression.",
        difficulty = 2,
        funFact = "Steinbeck erhielt 1962 den Nobelpreis für Literatur — die Jury lobte ausdrücklich 'Von Mäusen und Menschen' als 'kleines Meisterwerk'."
    ),

    // Question 18 — Sartre: Der Ekel
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Jean-Paul Sartres existenzialistischer Roman 'Der Ekel'?",
        answerA = "1935",
        answerB = "1938",
        answerC = "1943",
        answerD = "1945",
        correctAnswer = 1,
        explanation = "'Der Ekel' (La Nausée) von Jean-Paul Sartre erschien 1938 und gilt als das wichtigste literarische Werk des Existentialismus. Der Roman machte Sartre schlagartig berühmt.",
        difficulty = 2,
        funFact = "Sartre lehnte 1964 den Nobelpreis für Literatur ab — er wollte sich nicht institutionalisieren lassen und erklärte, kein lebender Schriftsteller solle in eine Institution verwandelt werden."
    ),

    // Question 19 — Borges: Fiktionen
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Aus welchem Land stammte der Schriftsteller Jorge Luis Borges?",
        answerA = "Chile",
        answerB = "Mexiko",
        answerC = "Argentinien",
        answerD = "Kolumbien",
        correctAnswer = 2,
        explanation = "Jorge Luis Borges wurde 1899 in Buenos Aires, Argentinien, geboren und gilt als einer der einflussreichsten Schriftsteller des 20. Jahrhunderts.",
        difficulty = 2,
        funFact = "Borges war jahrzehntelang Direktor der Nationalbibliothek von Argentinien — bis er fast vollständig erblindet war. Er sagte dazu: 'Gott gibt mir Bücher und nimmt mir das Licht.'"
    ),

    // Question 20 — Murakami: Naokos Lächeln
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt Haruki Murakamis Roman, mit dem ihm 1987 der internationale Durchbruch gelang?",
        answerA = "Kafka am Strand",
        answerB = "Der Elefant verschwindet",
        answerC = "Gefährliche Geliebte",
        answerD = "Naokos Lächeln",
        correctAnswer = 3,
        explanation = "Mit dem Roman 'Naokos Lächeln' (Norwegian Wood) von 1987 gelang Haruki Murakami der internationale Durchbruch. Der Roman wurde weltweit über 13 Millionen Mal verkauft.",
        difficulty = 2,
        funFact = "Der japanische Originaltitel 'Noruwei no Mori' bedeutet 'Norwegischer Wald' — benannt nach dem Beatles-Song 'Norwegian Wood', der im Buch eine wichtige Rolle spielt."
    ),

    // Question 21 — Kafka: Das Schloss
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie heißt der Hauptcharakter in Kafkas Roman 'Das Schloss'?",
        answerA = "K.",
        answerB = "Josef K.",
        answerC = "Gregor K.",
        answerD = "Hans K.",
        correctAnswer = 0,
        explanation = "In Kafkas unvollendetem Roman 'Das Schloss' (1926 posthum veröffentlicht) heißt der Landvermesser schlicht 'K.' — er versucht vergeblich, Zugang zum geheimnisvollen Schloss zu erhalten.",
        difficulty = 2,
        funFact = "Anders als in 'Der Prozess', wo der Held 'Josef K.' heißt, hat der Protagonist in 'Das Schloss' keinen Vornamen — eine noch radikalere Anonymisierung."
    ),

    // Question 22 — Hemingway: Pulitzer-Preis
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wofür erhielt Ernest Hemingway 1953 den Pulitzer-Preis?",
        answerA = "Für 'In einem anderen Land'",
        answerB = "Für 'Der alte Mann und das Meer'",
        answerC = "Für 'Wem die Stunde schlägt'",
        answerD = "Für 'Fiesta'",
        correctAnswer = 1,
        explanation = "Ernest Hemingway erhielt am 4. März 1953 den Pulitzer-Preis für Literatur für 'Der alte Mann und das Meer' (1952) in der Kategorie Roman.",
        difficulty = 2,
        funFact = "Die Novelle erschien zuerst vollständig in einer einzigen Ausgabe des Life-Magazins vom 1. September 1952 — davon wurden 5,2 Millionen Exemplare in nur zwei Tagen verkauft."
    ),

    // Question 23 — García Márquez: Nobelpreis
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Gabriel García Márquez den Nobelpreis für Literatur?",
        answerA = "1967",
        answerB = "1975",
        answerC = "1982",
        answerD = "1990",
        correctAnswer = 2,
        explanation = "Gabriel García Márquez erhielt 1982 den Nobelpreis für Literatur — vor allem für seinen Stil des Magischen Realismus und das Meisterwerk 'Hundert Jahre Einsamkeit'.",
        difficulty = 2,
        funFact = "García Márquez erschien zur Nobelpreisverleihung in traditioneller kolumbianischer Kleidung (dem 'liquiliqui'), um seine lateinamerikanische Identität zu betonen."
    ),

    // Question 24 — Orwell: Farm der Tiere — Figuren
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Tier ist die Anführerfigur Napoleon in George Orwells 'Farm der Tiere'?",
        answerA = "Ein Pferd",
        answerB = "Ein Hund",
        answerC = "Eine Kuh",
        answerD = "Ein Schwein",
        correctAnswer = 3,
        explanation = "In 'Farm der Tiere' ist Napoleon ein Schwein, das nach der Revolution die Kontrolle über die Farm übernimmt und eine Diktatur errichtet — eine Anspielung auf Joseph Stalin.",
        difficulty = 2,
        funFact = "Das berühmteste Motto der Farm — 'Alle Tiere sind gleich, aber manche Tiere sind gleicher als andere' — ist eines der bekanntesten Zitate der Weltliteratur."
    ),

    // Question 25 — Hesse: Nobelpreis
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Hermann Hesse den Nobelpreis für Literatur?",
        answerA = "1946",
        answerB = "1927",
        answerC = "1943",
        answerD = "1950",
        correctAnswer = 0,
        explanation = "Hermann Hesse erhielt 1946 den Nobelpreis für Literatur — offiziell für seinen Roman 'Das Glasperlenspiel' (1943), sein letztes und ambitioniertestes Werk.",
        difficulty = 2,
        funFact = "Hesse wurde 1877 in Deutschland geboren, nahm aber 1923 die Schweizer Staatsbürgerschaft an, um der nationalistischen Atmosphäre in Deutschland zu entkommen."
    ),

    // Question 26 — Thomas Mann: Buddenbrooks
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt spielt Thomas Manns Roman 'Buddenbrooks'?",
        answerA = "Hamburg",
        answerB = "Lübeck",
        answerC = "Bremen",
        answerD = "Kiel",
        correctAnswer = 1,
        explanation = "Thomas Manns 'Buddenbrooks' (1901) spielt in Lübeck und schildert den Niedergang einer Kaufmannsfamilie über vier Generationen — stark autobiografisch geprägt.",
        difficulty = 2,
        funFact = "Thomas Mann schrieb 'Buddenbrooks' mit nur 25 Jahren. Die Lübecker Bürgerschaft war über die allzu erkennbaren Porträts echter Personen zunächst empört."
    ),

    // Question 27 — Camus: Nobelpreis
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Albert Camus den Nobelpreis für Literatur?",
        answerA = "1942",
        answerB = "1950",
        answerC = "1957",
        answerD = "1960",
        correctAnswer = 2,
        explanation = "Albert Camus erhielt 1957 den Nobelpreis für Literatur — mit nur 44 Jahren war er einer der jüngsten Preisträger in der Geschichte des Nobelpreises.",
        difficulty = 2,
        funFact = "Camus starb am 4. Januar 1960 bei einem Autounfall — nur drei Jahre nach seiner Nobelpreisverleihung. In seiner Tasche fand man ein unbenutztes Zugticket."
    ),

    // Question 28 — Fitzgerald: Inhalt
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Figur liebt Jay Gatsby in Fitzgeralds 'Der große Gatsby' leidenschaftlich?",
        answerA = "Jordan Baker",
        answerB = "Myrtle Wilson",
        answerC = "Catherine",
        answerD = "Daisy Buchanan",
        correctAnswer = 3,
        explanation = "Jay Gatsby hat über Jahre hinweg luxuriöse Partys veranstaltet in der Hoffnung, dass Daisy Buchanan — die Frau, die er liebt und die einen anderen geheiratet hat — eines Tages erscheint.",
        difficulty = 2,
        funFact = "Gatsby ist 'neu reich' — er hat sein Vermögen durch dubiose Geschäfte angehäuft, um Daisy zu imponieren. Die 'alten reichen' Buchanans verachten ihn trotzdem."
    ),

    // Question 29 — Steinbeck: Von Mäusen und Menschen
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien John Steinbecks 'Von Mäusen und Menschen'?",
        answerA = "1937",
        answerB = "1935",
        answerC = "1939",
        answerD = "1942",
        correctAnswer = 0,
        explanation = "John Steinbecks Novelle 'Von Mäusen und Menschen' (Of Mice and Men) erschien 1937 und erzählt von den Wanderarbeitern George und Lennie in Kalifornien.",
        difficulty = 2,
        funFact = "Der Titel stammt aus einem Gedicht des schottischen Dichters Robert Burns: 'The best laid schemes of mice and men / Gang aft agley' — Die besten Pläne von Mäusen und Menschen gehen oft schief."
    ),

    // Question 30 — Sartre: Geschlossene Gesellschaft
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches berühmte Zitat stammt aus Jean-Paul Sartres Theaterstück 'Geschlossene Gesellschaft'?",
        answerA = "Die Existenz geht der Essenz voraus",
        answerB = "Die Hölle, das sind die anderen",
        answerC = "Der Ekel ist das Grundgefühl des Lebens",
        answerD = "Freiheit ist Verantwortung",
        correctAnswer = 1,
        explanation = "Das berühmte Zitat 'Die Hölle, das sind die anderen' stammt aus Sartres Theaterstück 'Geschlossene Gesellschaft' (Huis clos, 1943).",
        difficulty = 2,
        funFact = "In dem Stück sind drei Personen nach dem Tod in einem Zimmer eingesperrt — die Pointe ist, dass sie sich gegenseitig zur Hölle machen, ohne Teufel oder Feuer."
    ),

    // Question 31 — Borges: Fiktionen
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie heißt Jorge Luis Borges' bekannteste Kurzgeschichtensammlung von 1944?",
        answerA = "Das Aleph",
        answerB = "Labyrinths",
        answerC = "Fiktionen",
        answerD = "Die Bibliothek von Babel",
        correctAnswer = 2,
        explanation = "Borges' Sammlung 'Fiktionen' (Ficciones, 1944) gilt als sein wichtigstes Werk und löste eine literarische Revolution aus — mit verschachtelten Erzählungen über Labyrinthe, Unendlichkeit und fiktive Bücher.",
        difficulty = 2,
        funFact = "Philosophen wie Michel Foucault und Roland Barthes feierten Borges als Vorläufer des Poststrukturalismus — er beeinflusste die Literaturtheorie nachhaltig."
    ),

    // Question 32 — Murakami: Kafka am Strand
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Haruki Murakamis Roman 'Kafka am Strand'?",
        answerA = "1999",
        answerB = "2000",
        answerC = "2001",
        answerD = "2002",
        correctAnswer = 3,
        explanation = "Haruki Murakamis Roman 'Kafka am Strand' erschien im September 2002 in Japan und war sofort ein Bestseller — 500.000 Exemplare wurden im ersten Monat verkauft.",
        difficulty = 2,
        funFact = "Der Roman verbindet zwei parallele Handlungsstränge: den 15-jährigen Kafka Tamura und den alten Nakata, der nicht lesen kann, aber mit Katzen sprechen kann."
    ),

    // Question 33 — Kafka: Erscheinungsjahr Die Verwandlung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Franz Kafka schrieb 'Die Verwandlung' im Jahr 1912 — wann wurde sie erstmals veröffentlicht?",
        answerA = "1915",
        answerB = "1912",
        answerC = "1920",
        answerD = "1924",
        correctAnswer = 0,
        explanation = "Obwohl Franz Kafka 'Die Verwandlung' Ende 1912 schrieb, erschien die Erzählung erstmals 1915 in der Zeitschrift 'Die weißen Blätter'.",
        difficulty = 2,
        funFact = "Kafka war zeit seines Lebens unzufrieden mit dem Titelbild der Erstausgabe und bestand darauf, dass das Insekt NICHT abgebildet werden darf — die Fantasie des Lesers solle frei bleiben."
    ),

    // Question 34 — Hemingway: Santiago
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Auf welchem Gewässer kämpft der alte Fischer Santiago in Hemingways Roman um seinen Fang?",
        answerA = "Atlantik vor Florida",
        answerB = "Gewässer vor Kuba",
        answerC = "Mittelmeer vor Spanien",
        answerD = "Pazifik vor Mexiko",
        correctAnswer = 1,
        explanation = "In 'Der alte Mann und das Meer' kämpft der kubanische Fischer Santiago auf dem Meer vor Kuba um einen riesigen Marlin, den er nach tagelangem Kampf fängt.",
        difficulty = 2,
        funFact = "Hemingway lebte von 1939 bis 1960 selbst auf Kuba und war leidenschaftlicher Hochseefischer. 'Der alte Mann und das Meer' ist stark autobiografisch geprägt."
    ),

    // Question 35 — García Márquez: Erscheinungsjahr
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Gabriel García Márquez' 'Hundert Jahre Einsamkeit'?",
        answerA = "1962",
        answerB = "1965",
        answerC = "1967",
        answerD = "1970",
        correctAnswer = 2,
        explanation = "'Hundert Jahre Einsamkeit' (Cien años de soledad) erschien am 5. Juni 1967 und wurde sofort ein weltweiter Bestseller — weltweit über 30 Millionen Exemplare in 32 Sprachen.",
        difficulty = 2,
        funFact = "García Márquez soll auf dem Weg zum Verleger plötzlich die gesamte Handlung im Kopf gehabt haben. Er drehte das Auto um, schrieb anderthalb Jahre und schickte das Manuskript — er musste dafür sein Auto verkaufen."
    ),

    // Question 36 — Orwell: Sprache in 1984
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt die vereinfachte Staatssprache in George Orwells '1984', die dazu dient, unerwünschte Gedanken zu unterdrücken?",
        answerA = "Doublethink",
        answerB = "Oldspeak",
        answerC = "Thinkspeak",
        answerD = "Neusprech",
        correctAnswer = 3,
        explanation = "In Orwells '1984' ist 'Neusprech' (Newspeak) die offizielle Staatssprache des totalitären Regimes Ozeaniens — durch schrittweise Reduktion des Wortschatzes sollen unerwünschte Gedanken unmöglich werden.",
        difficulty = 2,
        funFact = "Orwells Begriff 'Neusprech' ist heute in den Duden aufgenommen — als Bezeichnung für eine bewusst verschleiernde, manipulative Sprache."
    ),

    // Question 37 — Hesse: Das Glasperlenspiel
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt Hermann Hesse offiziell den Nobelpreis für Literatur?",
        answerA = "Das Glasperlenspiel",
        answerB = "Siddhartha",
        answerC = "Der Steppenwolf",
        answerD = "Demian",
        correctAnswer = 0,
        explanation = "Hesse erhielt den Nobelpreis 1946 offiziell für 'Das Glasperlenspiel' (1943), seinen letzten und ambitioniertesten Roman über eine utopische Gelehrtengesellschaft.",
        difficulty = 2,
        funFact = "'Das Glasperlenspiel' entstand zwischen 1931 und 1942, mitten in der Nazi-Zeit. Hesse lebte in der Schweiz und konnte das Werk nicht in Deutschland veröffentlichen."
    ),

    // Question 38 — Thomas Mann: Erscheinungsjahr Buddenbrooks
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Thomas Manns Debütroman 'Buddenbrooks'?",
        answerA = "1897",
        answerB = "1901",
        answerC = "1905",
        answerD = "1910",
        correctAnswer = 1,
        explanation = "Thomas Manns 'Buddenbrooks — Verfall einer Familie' erschien 1901. Der Roman schildert den Niedergang einer Lübecker Kaufmannsfamilie über vier Generationen.",
        difficulty = 2,
        funFact = "Thomas Mann war bei der Veröffentlichung der 'Buddenbrooks' erst 26 Jahre alt. Der Verleger wollte zunächst nur einen einbändigen Auszug — Mann bestand auf der zweibändigen Vollausgabe."
    ),

    // Question 39 — Camus: Der Fremde — Figur
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie heißt der Protagonist in Albert Camus' Roman 'Der Fremde'?",
        answerA = "Antoine Roquentin",
        answerB = "Jean Meursault",
        answerC = "Meursault",
        answerD = "Bernard Rieux",
        correctAnswer = 2,
        explanation = "Der Protagonist von Camus' 'Der Fremde' heißt Meursault — ein emotional abgestumpfter Mann, der seine Mutter begräbt und kurz darauf einen Araber erschießt, ohne echtes Schuldgefühl zu zeigen.",
        difficulty = 2,
        funFact = "Der Name 'Meursault' ist eine Kombination aus 'meurs' (stirb) und 'sault' (Sprung) — eine versteckte Anspielung auf seinen Tod durch die Guillotine am Ende des Romans."
    ),

    // Question 40 — Steinbeck: Nobelpreis
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt John Steinbeck den Nobelpreis für Literatur?",
        answerA = "1939",
        answerB = "1940",
        answerC = "1955",
        answerD = "1962",
        correctAnswer = 3,
        explanation = "John Steinbeck erhielt den Nobelpreis für Literatur im Jahr 1962, ausgezeichnet für seinen realistischen und imaginativen Schreibstil mit sympathischem Humor und sozialer Wahrnehmung.",
        difficulty = 2,
        funFact = "Steinbeck war überrascht und nicht unumstritten als Preisträger. Kritiker wie William Faulkner hatten bereits den Preis erhalten und galten als würdigere Kandidaten."
    ),

    // Question 41 — Saramago: Blindheit
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Für welches Werk ist der portugiesische Nobelpreisträger José Saramago international am bekanntesten?",
        answerA = "Blindheit",
        answerB = "Das Evangelium nach Jesus Christus",
        answerC = "Der Mensch als Duplikat",
        answerD = "Geschichte der Belagerung von Lissabon",
        correctAnswer = 0,
        explanation = "José Saramagos Roman 'Blindheit' (Ensaio sobre a Cegueira, 1995) ist sein international bekanntestes Werk — eine Dystopie über eine mysteriöse Blindheitsepidemie.",
        difficulty = 2,
        funFact = "Saramago erhielt 1998 den Nobelpreis für Literatur — als erster portugiesischsprachiger Schriftsteller. Er schrieb 'Blindheit' ohne Absätze und ohne Anführungszeichen, was den desorientierten Stil verstärkt."
    ),

    // Question 42 — Ishiguro: Nobelpreis
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Kazuo Ishiguro den Nobelpreis für Literatur?",
        answerA = "2012",
        answerB = "2017",
        answerC = "2015",
        answerD = "2019",
        correctAnswer = 1,
        explanation = "Kazuo Ishiguro erhielt 2017 den Nobelpreis für Literatur. Die Akademie würdigte seine Romane als 'emotionaler Kraft' die zeigen, 'was unter unserer illusorischen Sicherheit in der Welt liegt'.",
        difficulty = 2,
        funFact = "Ishiguro wurde in Nagasaki, Japan, geboren, emigrierte mit 6 Jahren nach England und schreibt auf Englisch. Er ist Bürger beider Kulturen — ein Thema, das sein gesamtes Werk durchzieht."
    ),

    // Question 43 — Pamuk: Nobelpreis
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Orhan Pamuk erhielt 2006 den Nobelpreis für Literatur — aus welchem Land stammt er?",
        answerA = "Iran",
        answerB = "Griechenland",
        answerC = "Türkei",
        answerD = "Ägypten",
        correctAnswer = 2,
        explanation = "Orhan Pamuk ist türkischer Schriftsteller und wurde 2006 als erster türkischer Literaturnobelpreisträger ausgezeichnet. Sein bekanntestes Werk ist 'Schnee' (2002).",
        difficulty = 2,
        funFact = "Kurz vor der Nobelpreisverleihung wurde Pamuk in der Türkei wegen 'Beleidigung des Türkentums' angeklagt — er hatte öffentlich den Armeniergenozid und den Tod von Kurden angesprochen."
    ),

    // Question 44 — Borges: Themen
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Symbol kehrt immer wieder in Jorge Luis Borges' Erzählungen als Metapher für Komplexität und Desorientierung zurück?",
        answerA = "Der Spiegel",
        answerB = "Die Bibliothek",
        answerC = "Der Traum",
        answerD = "Das Labyrinth",
        correctAnswer = 3,
        explanation = "Das Labyrinth ist das zentrale Leitmotiv in Borges' Werk — es steht für die menschliche Grunderfahrung von Ratlosigkeit, Ausweglosigkeit und die Komplexität der Realität.",
        difficulty = 2,
        funFact = "Borges erblindete im Laufe seines Lebens fast vollständig — was er selbst als grausame Ironie empfand, da er von Büchern und Bibliotheken besessen war."
    ),

    // Question 45 — Murakami: Franz-Kafka-Preis
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchen bedeutenden Literaturpreis erhielt Haruki Murakami im Jahr 2006?",
        answerA = "Franz-Kafka-Literaturpreis",
        answerB = "Nobelpreis für Literatur",
        answerC = "Booker Prize",
        answerD = "Pulitzer-Preis",
        correctAnswer = 0,
        explanation = "Haruki Murakami erhielt 2006 den Franz-Kafka-Literaturpreis — benannt nach dem Prager Schriftsteller Franz Kafka, dessen surreale Welten Murakami stark beeinflusst haben.",
        difficulty = 2,
        funFact = "Murakami ist einer der meistdiskutierten Kandidaten für den Nobelpreis — er hat ihn bis heute nicht erhalten, gilt aber jedes Jahr als Favorit."
    ),

    // Question 46 — Ishiguro: Das Bildnis der Reste des Tages
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Kazuo Ishiguros Roman 'Was vom Tage übrig blieb' gewann 1989 welchen bedeutenden Preis?",
        answerA = "Pulitzer-Preis",
        answerB = "Booker Prize",
        answerC = "Prix Goncourt",
        answerD = "Deutschen Buchpreis",
        correctAnswer = 1,
        explanation = "Kazuo Ishiguros 'Was vom Tage übrig blieb' (The Remains of the Day) gewann 1989 den Booker Prize und erzählt von einem englischen Butler, der sein ganzes Leben dem Dienst geopfert hat.",
        difficulty = 2,
        funFact = "Der Roman wurde 1993 mit Anthony Hopkins als Butler Stevens und Emma Thompson verfilmt — eine Oscar-nominierte Adaption, die heute als Klassiker gilt."
    ),

    // Question 47 — Sartre: Roquentin
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welcher Form ist Jean-Paul Sartres Roman 'Der Ekel' erzählt?",
        answerA = "Als Brief",
        answerB = "Als Bericht in der dritten Person",
        answerC = "Als Tagebuch",
        answerD = "Als Interview",
        correctAnswer = 2,
        explanation = "'Der Ekel' von Jean-Paul Sartre ist als fiktives Tagebuch des Historikers Antoine Roquentin verfasst, der in einer Hafenstadt plötzlich ein tiefes Ekelgefühl vor der Existenz verspürt.",
        difficulty = 2,
        funFact = "Der Protagonist Roquentin erfährt den 'Ekel' erstmals beim Betrachten eines Steins am Strand — die Dinge erscheinen ihm plötzlich fremd und sinnlos, wuchern geradezu aus sich heraus."
    ),

    // Question 48 — Saramago: Nobelpreis Jahr
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt José Saramago den Nobelpreis für Literatur?",
        answerA = "1995",
        answerB = "1996",
        answerC = "2000",
        answerD = "1998",
        correctAnswer = 3,
        explanation = "José Saramago erhielt 1998 den Nobelpreis für Literatur — als erster Autor portugiesischer Sprache überhaupt. Er wurde für seine allegorischen Romane ausgezeichnet.",
        difficulty = 2,
        funFact = "Die portugiesische Regierung versuchte zunächst, Saramagos Nominierung zu blockieren, weil sein Roman 'Das Evangelium nach Jesus Christus' als blasphemisch galt."
    ),

    // Question 49 — Kafka: Max Brod
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was bat Franz Kafka seinen Freund Max Brod, mit seinen unveröffentlichten Manuskripten nach seinem Tod zu tun?",
        answerA = "Sie zu verbrennen",
        answerB = "Sie zu veröffentlichen",
        answerC = "Sie in einer Bibliothek aufzubewahren",
        answerD = "Sie seiner Familie zu geben",
        correctAnswer = 0,
        explanation = "Franz Kafka bat Max Brod ausdrücklich, alle unveröffentlichten Manuskripte nach seinem Tod zu verbrennen. Brod ignorierte diesen Wunsch und veröffentlichte 'Der Prozess', 'Das Schloss' und weitere Werke.",
        difficulty = 2,
        funFact = "Kafka starb 1924 an Tuberkulose, im Alter von nur 40 Jahren. Fast alle seine bekanntesten Werke erschienen posthum — er selbst hielt sich zu Lebzeiten für einen gescheiterten Schriftsteller."
    ),

    // Question 50 — Pamuk: Istanbul
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches autobiografische Werk von Orhan Pamuk beschreibt seine Kindheit und Jugend in Istanbul?",
        answerA = "Schnee",
        answerB = "Istanbul — Erinnerungen an eine Stadt",
        answerC = "Rot ist mein Name",
        answerD = "Das schwarze Buch",
        correctAnswer = 1,
        explanation = "Orhan Pamuks 'Istanbul — Erinnerungen an eine Stadt' (2003) ist sein autobiografisches Werk, das seine Kindheit in Istanbul beschreibt und gleichzeitig eine Liebeserklärung an die Metropole ist.",
        difficulty = 2,
        funFact = "Pamuk wurde in Istanbul geboren und lebt bis heute dort — obwohl er als Literaturnobelpreisträger und Kritiker der türkischen Politik internationale Berühmtheit erlangt hat."
    )
)
