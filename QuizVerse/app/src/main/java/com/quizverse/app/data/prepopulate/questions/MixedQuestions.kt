package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestions(): List<Question> = listOf(

    // --- EASY (10) ---

    Question(
        categoryId = 11,
        questionText = "Welche Farbe hat der Mittelteil der deutschen Flagge?",
        answerA = "Rot",
        answerB = "Gold",
        answerC = "Blau",
        answerD = "Grün",
        correctAnswer = 0,
        explanation = "Die deutsche Flagge besteht aus drei horizontalen Streifen: Schwarz, Rot und Gold.",
        difficulty = 1,
        funFact = "Die Farben Schwarz, Rot und Gold wurden erstmals während der Befreiungskriege gegen Napoleon verwendet."
    ),

    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde die Schokolade erfunden?",
        answerA = "Schweiz",
        answerB = "Belgien",
        answerC = "Mexiko",
        answerD = "Deutschland",
        correctAnswer = 2,
        explanation = "Die ursprüngliche Schokolade stammt von den Azteken und Mayas in Mexiko, die Kakao bereits vor Tausenden von Jahren nutzten.",
        difficulty = 1,
        funFact = "Das Wort 'Schokolade' leitet sich vom aztekischen Wort 'xocolātl' ab, was 'bitteres Wasser' bedeutet."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie viele Kontinente gibt es auf der Erde?",
        answerA = "5",
        answerB = "6",
        answerC = "7",
        answerD = "8",
        correctAnswer = 2,
        explanation = "Die Erde hat sieben Kontinente: Afrika, Antarktika, Asien, Australien, Europa, Nordamerika und Südamerika.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist die Hauptstadt von Australien?",
        answerA = "Sydney",
        answerB = "Melbourne",
        answerC = "Brisbane",
        answerD = "Canberra",
        correctAnswer = 3,
        explanation = "Canberra ist die Hauptstadt Australiens. Viele verwechseln sie mit Sydney, dem bekanntesten Ort des Landes.",
        difficulty = 1,
        funFact = "Canberra wurde als Kompromiss zwischen Sydney und Melbourne als Hauptstadt gewählt, da beide Städte um den Status rivalisierten."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Tier ist das schnellste Landtier der Welt?",
        answerA = "Löwe",
        answerB = "Gepard",
        answerC = "Gepard",
        answerD = "Springbock",
        correctAnswer = 1,
        explanation = "Der Gepard ist das schnellste Landtier und kann Geschwindigkeiten von bis zu 120 km/h erreichen.",
        difficulty = 1,
        funFact = "Ein Gepard kann in nur drei Sekunden von 0 auf 100 km/h beschleunigen – schneller als viele Sportwagen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Währung wird in Japan verwendet?",
        answerA = "Yuan",
        answerB = "Won",
        answerC = "Yen",
        answerD = "Ringgit",
        correctAnswer = 2,
        explanation = "Die Währung Japans ist der Japanische Yen (¥), eine der meistgehandelten Währungen der Welt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "An welchem Tag wird in Deutschland Weihnachten gefeiert?",
        answerA = "24. Dezember",
        answerB = "25. Dezember",
        answerC = "26. Dezember",
        answerD = "1. Januar",
        correctAnswer = 0,
        explanation = "In Deutschland ist der 24. Dezember (Heiligabend) der Haupttag der Weihnachtsfeierlichkeiten, an dem Geschenke verteilt werden.",
        difficulty = 1,
        funFact = "In vielen anderen Ländern wie den USA und Großbritannien ist der 25. Dezember der wichtigste Weihnachtstag."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie viele Seiten hat ein Hexagon?",
        answerA = "5",
        answerB = "6",
        answerC = "7",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Ein Hexagon ist eine geometrische Figur mit sechs Seiten. Das Wort kommt aus dem Griechischen: 'hexa' (sechs) + 'gonia' (Ecke).",
        difficulty = 1,
        funFact = "Bienenwaben bestehen aus sechseckigen Zellen – diese Form ist die effizienteste, um Raum zu füllen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches ist das größte Organ des menschlichen Körpers?",
        answerA = "Lunge",
        answerB = "Leber",
        answerC = "Haut",
        answerD = "Gehirn",
        correctAnswer = 2,
        explanation = "Die Haut ist das größte Organ des menschlichen Körpers mit einer Fläche von etwa 1,5–2 Quadratmetern.",
        difficulty = 1,
        funFact = "Die Haut erneuert sich alle 27 Tage vollständig – im Laufe eines Lebens wirft der Mensch etwa 30–40 kg Haut ab."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Farbe hat der Streifen in der Mitte der Flagge Italiens?",
        answerA = "Rot",
        answerB = "Weiß",
        answerC = "Blau",
        answerD = "Gelb",
        correctAnswer = 1,
        explanation = "Die italienische Flagge besteht aus drei vertikalen Streifen: Grün, Weiß und Rot.",
        difficulty = 1,
        funFact = null
    ),

    // --- MEDIUM (15) ---

    Question(
        categoryId = 11,
        questionText = "Welches Unternehmen hat den ersten iPhone-Smartphone vorgestellt?",
        answerA = "Samsung",
        answerB = "Nokia",
        answerC = "Apple",
        answerD = "Motorola",
        correctAnswer = 2,
        explanation = "Apple präsentierte das erste iPhone am 9. Januar 2007, vorgestellt von Steve Jobs auf der Macworld Conference.",
        difficulty = 2,
        funFact = "Steve Jobs beschrieb das iPhone als 'ein iPod, ein Telefon und ein Internet-Gerät' in einem."
    ),

    Question(
        categoryId = 11,
        questionText = "In welchem Jahr fand die erste Mondlandung statt?",
        answerA = "1965",
        answerB = "1967",
        answerC = "1969",
        answerD = "1971",
        correctAnswer = 2,
        explanation = "Am 20. Juli 1969 landeten Neil Armstrong und Buzz Aldrin im Rahmen der Apollo-11-Mission auf dem Mond.",
        difficulty = 2,
        funFact = "Neil Armstrongs erster Satz auf dem Mond war: 'Das ist ein kleiner Schritt für einen Menschen, aber ein riesiger Sprung für die Menschheit.'"
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Element hat das chemische Symbol 'Au'?",
        answerA = "Silber",
        answerB = "Aluminium",
        answerC = "Kupfer",
        answerD = "Gold",
        correctAnswer = 3,
        explanation = "Das chemische Symbol 'Au' steht für Gold und leitet sich vom lateinischen Wort 'aurum' ab.",
        difficulty = 2,
        funFact = "Gold ist so selten, dass alles je geförderte Gold der Welt in einen Würfel von nur 21 Metern Kantenlänge passen würde."
    ),

    Question(
        categoryId = 11,
        questionText = "Wer hat die Relativitätstheorie entwickelt?",
        answerA = "Isaac Newton",
        answerB = "Albert Einstein",
        answerC = "Niels Bohr",
        answerD = "Max Planck",
        correctAnswer = 1,
        explanation = "Albert Einstein veröffentlichte die spezielle Relativitätstheorie 1905 und die allgemeine Relativitätstheorie 1915.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Land hat die meisten Einwohner der Welt?",
        answerA = "USA",
        answerB = "Russland",
        answerC = "China",
        answerD = "Indien",
        correctAnswer = 3,
        explanation = "Indien hat China im Jahr 2023 als bevölkerungsreichstes Land der Welt überholt, mit über 1,4 Milliarden Menschen.",
        difficulty = 2,
        funFact = "Jeden Tag kommen in Indien etwa 67.000 neue Menschen zur Welt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Kunstwerk schuf Michelangelo an der Decke der Sixtinischen Kapelle?",
        answerA = "Das Abendmahl",
        answerB = "Die Erschaffung Adams",
        answerC = "Die Geburt der Venus",
        answerD = "Der Schrei",
        correctAnswer = 1,
        explanation = "Die Erschaffung Adams ist das bekannteste Bild aus Michelangelos Deckengemälde der Sixtinischen Kapelle (1508–1512).",
        difficulty = 2,
        funFact = "Michelangelo malte die Sixtinische Kapelle hauptsächlich stehend – nicht auf dem Rücken liegend, wie oft fälschlicherweise angenommen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Währung wird in Großbritannien verwendet?",
        answerA = "Euro",
        answerB = "Pfund Sterling",
        answerC = "Schweizer Franken",
        answerD = "Krone",
        correctAnswer = 1,
        explanation = "Großbritannien verwendet das Pfund Sterling (£, GBP) und ist nach dem Brexit nicht dem Euro beigetreten.",
        difficulty = 2,
        funFact = "Das Pfund Sterling ist die älteste noch verwendete Währung der Welt – es existiert seit über 1.200 Jahren."
    ),

    Question(
        categoryId = 11,
        questionText = "Aus welchem Material besteht der Eiffelturm hauptsächlich?",
        answerA = "Stahl",
        answerB = "Beton",
        answerC = "Eisen",
        answerD = "Aluminium",
        correctAnswer = 2,
        explanation = "Der Eiffelturm besteht aus Puddelleisen (Schmiedeeisen), nicht aus modernem Stahl. Er wurde 1889 fertiggestellt.",
        difficulty = 2,
        funFact = "Im Sommer wird der Eiffelturm durch die Wärme bis zu 15 cm größer, da sich das Metall ausdehnt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches mythologische Wesen ist halb Mensch, halb Pferd?",
        answerA = "Satyr",
        answerB = "Minotaurus",
        answerC = "Zentaur",
        answerD = "Harpy",
        correctAnswer = 2,
        explanation = "Zentauren sind Wesen aus der griechischen Mythologie mit einem menschlichen Oberkörper und dem Körper eines Pferdes.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde der Erfinder des Telefons, Alexander Graham Bell, geboren?",
        answerA = "USA",
        answerB = "Kanada",
        answerC = "England",
        answerD = "Schottland",
        correctAnswer = 3,
        explanation = "Alexander Graham Bell wurde am 3. März 1847 in Edinburgh, Schottland, geboren. Er emigrierte später nach Nordamerika.",
        difficulty = 2,
        funFact = "Bell weigerte sich, ein Telefon in sein Arbeitszimmer zu stellen, da er es als störend empfand."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Planet ist der Sonne am nächsten?",
        answerA = "Venus",
        answerB = "Mars",
        answerC = "Merkur",
        answerD = "Erde",
        correctAnswer = 2,
        explanation = "Merkur ist der sonnennächste Planet und umkreist die Sonne in nur 88 Erdtagen.",
        difficulty = 2,
        funFact = "Obwohl Merkur der sonnennächste Planet ist, ist die Venus heißer, da ihre dichte Atmosphäre Wärme speichert."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Tier ist das nationale Symbol der USA?",
        answerA = "Adler",
        answerB = "Bison",
        answerC = "Weißkopfseeadler",
        answerD = "Puma",
        correctAnswer = 2,
        explanation = "Der Weißkopfseeadler (Bald Eagle) ist das Nationaltier der USA und Symbol der Freiheit und Stärke.",
        difficulty = 2,
        funFact = "Benjamin Franklin wollte den Truthahn als Nationaltier der USA – er hielt den Weißkopfseeadler für einen Feigling."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Modehaus kreierte den berühmten 'Little Black Dress'?",
        answerA = "Dior",
        answerB = "Chanel",
        answerC = "Givenchy",
        answerD = "Valentino",
        correctAnswer = 1,
        explanation = "Coco Chanel führte das 'Kleine Schwarze' (Little Black Dress) 1926 ein und revolutionierte damit die Frauenmode.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Wie nennt man die Angst vor Spinnen?",
        answerA = "Klaustrophobie",
        answerB = "Arachnophobie",
        answerC = "Entomophobie",
        answerD = "Zoophobie",
        correctAnswer = 1,
        explanation = "Arachnophobie ist die Angst vor Spinnen und eine der häufigsten spezifischen Phobien weltweit.",
        difficulty = 2,
        funFact = "Schätzungsweise 3–15 % der Weltbevölkerung leiden unter Arachnophobie."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Land produziert weltweit am meisten Kaffee?",
        answerA = "Kolumbien",
        answerB = "Vietnam",
        answerC = "Brasilien",
        answerD = "Äthiopien",
        correctAnswer = 2,
        explanation = "Brasilien ist seit über 150 Jahren der größte Kaffeeproduzent der Welt und produziert etwa ein Drittel des globalen Kaffees.",
        difficulty = 2,
        funFact = "Kaffee ist nach Erdöl das meistgehandelte Rohprodukt der Welt."
    ),

    // --- HARD (12) ---

    Question(
        categoryId = 11,
        questionText = "Welches Gesetz regelt in Deutschland die Grundrechte der Bürger?",
        answerA = "Bürgerliches Gesetzbuch",
        answerB = "Strafgesetzbuch",
        answerC = "Grundgesetz",
        answerD = "Verwaltungsrecht",
        correctAnswer = 2,
        explanation = "Das Grundgesetz (GG) ist die Verfassung Deutschlands. Die Artikel 1–19 enthalten die Grundrechte der Bürger.",
        difficulty = 3,
        funFact = "Das Grundgesetz wurde am 23. Mai 1949 verkündet – dieser Tag ist seitdem der 'Tag des Grundgesetzes'."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches ist das höchste Gebäude der Welt (Stand 2024)?",
        answerA = "Shanghai Tower",
        answerB = "Abraj Al-Bait Tower",
        answerC = "Burj Khalifa",
        answerD = "One World Trade Center",
        correctAnswer = 2,
        explanation = "Der Burj Khalifa in Dubai ist mit 828 Metern das höchste Gebäude der Welt (Stand 2024).",
        difficulty = 3,
        funFact = "Von der Spitze des Burj Khalifa aus kann man den Sonnenuntergang zweimal am selben Tag beobachten."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches psychologische Experiment beschreibt das 'Marshmallow-Test'?",
        answerA = "Gehorsam gegenüber Autorität",
        answerB = "Belohnungsaufschub und Selbstkontrolle",
        answerC = "Soziale Konformität",
        answerD = "Konditioniertes Verhalten",
        correctAnswer = 1,
        explanation = "Der Marshmallow-Test von Walter Mischel untersuchte die Fähigkeit von Kindern, eine Belohnung aufzuschieben als Maß für Selbstkontrolle.",
        difficulty = 3,
        funFact = "Spätere Studien zeigten, dass Kinder mit besserem Belohnungsaufschub im Leben tendenziell erfolgreicher waren."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Gemälde von Leonardo da Vinci gilt als das bekannteste Porträt der Welt?",
        answerA = "Dame mit dem Hermelin",
        answerB = "La Belle Ferronnière",
        answerC = "Mona Lisa",
        answerD = "Salvator Mundi",
        correctAnswer = 2,
        explanation = "Die Mona Lisa (ca. 1503–1519) hängt im Louvre in Paris und ist das bekannteste und meistbesuchte Gemälde der Welt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "In welchem Jahr wurde die Berliner Mauer errichtet?",
        answerA = "1953",
        answerB = "1958",
        answerC = "1961",
        answerD = "1963",
        correctAnswer = 2,
        explanation = "Die Berliner Mauer wurde in der Nacht vom 12. auf den 13. August 1961 gebaut und trennte Berlin 28 Jahre lang.",
        difficulty = 3,
        funFact = "Die Berliner Mauer war 155 km lang und hatte 302 Wachtürme."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Land hat die längste Landesgrenze der Welt?",
        answerA = "Russland",
        answerB = "China",
        answerC = "USA",
        answerD = "Kanada",
        correctAnswer = 3,
        explanation = "Kanada hat mit über 202.000 km die längste Gesamtküstenlinie, aber auch eine der längsten Landesgrenzen (mit den USA: ~8.891 km).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Erfindung wird Thomas Edison FÄLSCHLICHERWEISE zugeschrieben?",
        answerA = "Phonograph",
        answerB = "Glühbirne",
        answerC = "Elektromotor",
        answerD = "Kohlefaden-Glühbirne",
        correctAnswer = 2,
        explanation = "Edison erfand die Glühbirne nicht – er verbesserte lediglich frühere Entwürfe. Heinrich Göbel und Joseph Swan entwickelten funktionierende Glühlampen vor Edison.",
        difficulty = 3,
        funFact = "Thomas Edison hielt über 1.093 US-Patente – er gilt als einer der produktivsten Erfinder aller Zeiten."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie lautet der wirtschaftliche Begriff für die Inflation, bei der die Preise extrem schnell steigen?",
        answerA = "Stagflation",
        answerB = "Deflation",
        answerC = "Hyperinflation",
        answerD = "Disinflation",
        correctAnswer = 2,
        explanation = "Hyperinflation bezeichnet eine extrem hohe und schnell ansteigende Inflationsrate. Bekanntes Beispiel: Deutschland 1923.",
        difficulty = 3,
        funFact = "In Deutschland 1923 kostete ein Brot zeitweise 200 Milliarden Mark."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher griechische Gott war der Schmied der Götter?",
        answerA = "Ares",
        answerB = "Hephaistos",
        answerC = "Hades",
        answerD = "Hermes",
        correctAnswer = 1,
        explanation = "Hephaistos war der griechische Gott des Feuers, der Schmiedekunst und des Handwerks. Sein römisches Gegenstück ist Vulcanus.",
        difficulty = 3,
        funFact = "Hephaistos soll laut Mythologie lahm gewesen sein, nachdem Zeus ihn vom Olymp geworfen hatte."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Modehaus hat den berühmten 'Birkin Bag' kreiert?",
        answerA = "Gucci",
        answerB = "Louis Vuitton",
        answerC = "Hermès",
        answerD = "Prada",
        correctAnswer = 2,
        explanation = "Die Birkin Bag wurde 1984 von Hermès für die Schauspielerin Jane Birkin entworfen und ist heute eine der begehrtesten Handtaschen der Welt.",
        difficulty = 3,
        funFact = "Eine neue Birkin Bag kostet zwischen 10.000 und über 200.000 Euro – und ist oft jahrelang ausverkauft."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches ist das älteste noch existierende Parlament der Welt?",
        answerA = "Britisches Unterhaus",
        answerB = "Althing (Island)",
        answerC = "Seimas (Litauen)",
        answerD = "Riksdag (Schweden)",
        correctAnswer = 1,
        explanation = "Das isländische Althing wurde 930 n. Chr. gegründet und gilt als das älteste noch existierende Parlament der Welt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welche psychologische Theorie beschreibt die 'Maslow'sche Bedürfnispyramide'?",
        answerA = "Konditionierung menschlichen Verhaltens",
        answerB = "Hierarchie menschlicher Bedürfnisse",
        answerC = "Entwicklungsstufen der Persönlichkeit",
        answerD = "Kognitive Verhaltenstherapie",
        correctAnswer = 1,
        explanation = "Abraham Maslow entwickelte 1943 eine Hierarchie menschlicher Bedürfnisse – von Grundbedürfnissen (Essen, Schlaf) bis zur Selbstverwirklichung.",
        difficulty = 3,
        funFact = "Maslow selbst hat das Wort 'Pyramide' nie verwendet – die visuelle Darstellung als Pyramide kam erst nach seinem Tod auf."
    ),

    // --- EXPERT (8) ---

    Question(
        categoryId = 11,
        questionText = "Welches Wirtschaftskonzept beschreibt den 'Tragedy of the Commons'?",
        answerA = "Übernutzung gemeinsamer Ressourcen durch individuelle Interessen",
        answerB = "Staatliche Regulierung privater Güter",
        answerC = "Monopolisierung öffentlicher Güter",
        answerD = "Einkommensungleichheit in Entwicklungsländern",
        correctAnswer = 0,
        explanation = "Die 'Tragedy of the Commons' (Garret Hardin, 1968) beschreibt, wie individuelle Eigeninteressen zur Übernutzung gemeinsamer Ressourcen führen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "In welchem Jahr wurde die Welthandelsorganisation (WTO) gegründet?",
        answerA = "1986",
        answerB = "1991",
        answerC = "1995",
        answerD = "1999",
        correctAnswer = 2,
        explanation = "Die WTO wurde am 1. Januar 1995 als Nachfolgerin des GATT gegründet, um den internationalen Handel zu regulieren.",
        difficulty = 4,
        funFact = "Die WTO hat 164 Mitgliedsstaaten, die zusammen über 98 % des weltweiten Handelsvolumens repräsentieren."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Architekturbüro entwarf das Guggenheim-Museum in Bilbao?",
        answerA = "Zaha Hadid Architects",
        answerB = "Frank Gehry",
        answerC = "Renzo Piano",
        answerD = "Norman Foster",
        correctAnswer = 1,
        explanation = "Das Guggenheim-Museum in Bilbao wurde von dem Architekten Frank Gehry entworfen und 1997 eröffnet. Es gilt als Meilenstein der Gegenwartsarchitektur.",
        difficulty = 4,
        funFact = "Das Guggenheim Bilbao ist mit Titanplatten verkleidet – insgesamt wurden 33.000 Titanplatten verbaut."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches psychologische Phänomen beschreibt den 'Dunning-Kruger-Effekt'?",
        answerA = "Unterbewusste Anpassung an Gruppenverhalten",
        answerB = "Kognitives Vorurteil, bei dem Menschen mit geringem Wissen ihre Kompetenz überschätzen",
        answerC = "Selektive Wahrnehmung zur Bestätigung vorhandener Überzeugungen",
        answerD = "Psychologischer Schutzmechanismus gegen Versagenserlebnisse",
        correctAnswer = 1,
        explanation = "Der Dunning-Kruger-Effekt beschreibt das Phänomen, dass Personen mit geringem Wissen ihr eigenes Können tendenziell überschätzen.",
        difficulty = 4,
        funFact = "Der Effekt hat seinen Namen von David Dunning und Justin Kruger, die ihn 1999 in einer bahnbrechenden Studie beschrieben."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Land hat die höchste Anzahl an UNESCO-Welterbestätten?",
        answerA = "China",
        answerB = "Italien",
        answerC = "Spanien",
        answerD = "Frankreich",
        correctAnswer = 1,
        explanation = "Italien hat mit 58 Welterbestätten (Stand 2023) die meisten UNESCO-Welterbestätten weltweit, gefolgt von China mit 57.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Wie nennt man in der Rechtswissenschaft das Prinzip 'nulla poena sine lege'?",
        answerA = "Unschuldsvermutung",
        answerB = "Gesetzmäßigkeitsprinzip",
        answerC = "Verhältnismäßigkeitsprinzip",
        answerD = "Anklageprinzip",
        correctAnswer = 1,
        explanation = "'Nulla poena sine lege' bedeutet 'keine Strafe ohne Gesetz' und ist ein fundamentales Prinzip des Strafrechts – niemand darf für eine Tat bestraft werden, die zum Zeitpunkt der Begehung nicht gesetzlich verboten war.",
        difficulty = 4,
        funFact = "Dieses Prinzip ist in Deutschland in Artikel 103 Absatz 2 des Grundgesetzes verankert."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Maler des Surrealismus schuf das Werk 'Die Beständigkeit der Erinnerung' mit den schmelzenden Uhren?",
        answerA = "René Magritte",
        answerB = "Max Ernst",
        answerC = "Salvador Dalí",
        answerD = "Joan Miró",
        correctAnswer = 2,
        explanation = "Salvador Dalí malte 'Die Beständigkeit der Erinnerung' (1931), das zu den bekanntesten Werken des Surrealismus gehört.",
        difficulty = 4,
        funFact = "Dalí malte dieses Bild in nur wenigen Stunden, inspiriert von der Textur eines schmelzenden Camembert-Käses."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Phänomen beschreibt der Begriff 'Black Swan' in der Wirtschaft (Nassim Taleb)?",
        answerA = "Systematische Marktfehler durch Regulierungsversagen",
        answerB = "Unvorhersehbare Ereignisse mit extremen Konsequenzen",
        answerC = "Konzentrierte Risikoverteilung in Portfolios",
        answerD = "Spekulative Finanzblasen auf Rohstoffmärkten",
        correctAnswer = 1,
        explanation = "Nassim Talebs 'Black Swan'-Theorie (2007) beschreibt seltene, unvorhersehbare Ereignisse mit massiven Auswirkungen – wie die Finanzkrise 2008.",
        difficulty = 4,
        funFact = null
    ),

    // --- MASTER (5) ---

    Question(
        categoryId = 11,
        questionText = "Welches Rechtsprinzip liegt dem 'Habeas Corpus Act' von 1679 zugrunde?",
        answerA = "Recht auf ein faires Verfahren durch eine Geschworenenjury",
        answerB = "Das Recht, nicht ohne richterliche Prüfung inhaftiert zu werden",
        answerC = "Immunität von Parlamentsmitgliedern gegenüber Strafverfolgung",
        answerD = "Gleichheit aller Bürger vor dem Gesetz unabhängig vom Stand",
        correctAnswer = 1,
        explanation = "Der Habeas Corpus Act garantiert, dass jede Inhaftierung vor einem Richter überprüft werden muss – ein Grundpfeiler des angelsächsischen Rechts.",
        difficulty = 5,
        funFact = "Der Begriff 'Habeas Corpus' ist Latein und bedeutet wörtlich 'Du sollst den Körper haben'."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches ökonomische Konzept beschreibt die 'Kondratjew-Wellen'?",
        answerA = "Kurzfristige Konjunkturzyklen durch Zinspolitik",
        answerB = "Langfristige wirtschaftliche Wellen durch technologischen Wandel (40–60 Jahre)",
        answerC = "Wechselnde Handelsbilanzzyklen zwischen Industrienationen",
        answerD = "Periodische Börsenpaniken durch spekulative Übertreibungen",
        correctAnswer = 1,
        explanation = "Nikolai Kondratjew beschrieb in den 1920ern langfristige Wirtschaftszyklen von 40–60 Jahren, getrieben durch grundlegende technologische Revolutionen.",
        difficulty = 5,
        funFact = "Kondratjew wurde 1938 während Stalins Großem Terror hingerichtet – seine Theorie galt als zu kapitalismusfreundlich."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Begriff aus der Architekturtheorie beschreibt eine Fassadengestaltung, bei der die Oberfläche keine strukturelle Funktion hat?",
        answerA = "Pilaster",
        answerB = "Curtain Wall",
        answerC = "Rustika",
        answerD = "Entasis",
        correctAnswer = 1,
        explanation = "Ein 'Curtain Wall' (Vorhangfassade) ist eine nicht-tragende Außenhülle, die nur vor Witterung schützt, aber keine Last trägt – typisch für moderne Hochhäuser.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches psychologische Konzept beschreibt die 'Theorie der kognitiven Dissonanz' nach Leon Festinger?",
        answerA = "Unbewusster Widerstand gegen Autoritäten durch emotionale Abwehrreaktionen",
        answerB = "Psychisches Unbehagen durch widersprüchliche Überzeugungen, das zur Änderung einer Überzeugung führt",
        answerC = "Tendenz zur Überanpassung an soziale Normen auf Kosten der Identität",
        answerD = "Kognitive Überlastung durch simultane Entscheidungsprozesse",
        correctAnswer = 1,
        explanation = "Leon Festingers Theorie (1957) besagt, dass Menschen Unbehagen empfinden, wenn sie widersprüchliche Überzeugungen halten, und dieses Unbehagen durch Änderung einer Überzeugung reduzieren.",
        difficulty = 5,
        funFact = "Festinger entwickelte die Theorie nach einer Untersuchung einer apokalyptischen Sekte, die ihre Prophezeiungen nach dem Ausbleiben des Weltuntergangs neu interpretierte."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Konzept beschreibt in der Finanzwirtschaft den 'Modigliani-Miller-Theorems'?",
        answerA = "Optimale Portfoliodiversifikation durch Korrelationsanalyse",
        answerB = "Unter bestimmten Voraussetzungen ist der Unternehmenswert unabhängig von seiner Kapitalstruktur",
        answerC = "Effiziente Marktpreisbildung durch vollständige Informationsverarbeitung",
        answerD = "Langfristige Konvergenz von Zinssätzen in integrierten Kapitalmärkten",
        correctAnswer = 1,
        explanation = "Das Modigliani-Miller-Theorem (1958) besagt, dass unter idealen Marktbedingungen (keine Steuern, keine Insolvenzkosten) der Unternehmenswert unabhängig von der Finanzierungsstruktur ist.",
        difficulty = 5,
        funFact = "Franco Modigliani und Merton Miller erhielten für ihre gemeinsamen Arbeiten beide den Nobelpreis für Wirtschaftswissenschaften – allerdings in unterschiedlichen Jahren."
    ),

    // --- NEW EASY (15) ---

    Question(
        categoryId = 11,
        questionText = "Wie viele Stunden hat ein Tag?",
        answerA = "12",
        answerB = "20",
        answerC = "24",
        answerD = "48",
        correctAnswer = 2,
        explanation = "Ein Tag hat 24 Stunden. Dies basiert auf der Zeit, die die Erde benötigt, um sich einmal um ihre eigene Achse zu drehen.",
        difficulty = 1,
        funFact = "Vor 1,4 Milliarden Jahren hatte ein Erdtag nur etwa 18 Stunden – die Erde dreht sich seitdem immer langsamer."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Tier legt keine Eier?",
        answerA = "Krokodil",
        answerB = "Wal",
        answerC = "Pinguin",
        answerD = "Schildkröte",
        correctAnswer = 1,
        explanation = "Wale sind Säugetiere und bringen lebendige Junge zur Welt — sie legen keine Eier. Krokodile, Pinguine und Schildkröten hingegen legen Eier.",
        difficulty = 1,
        funFact = "Ein neugeborenes Blauwalbaby ist bei der Geburt bereits etwa 7 Meter lang und wiegt rund 2,7 Tonnen."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist die Hauptzutat von Brot?",
        answerA = "Reis",
        answerB = "Mais",
        answerC = "Mehl",
        answerD = "Kartoffeln",
        correctAnswer = 2,
        explanation = "Mehl (meist Weizenmehl) ist die Hauptzutat von Brot. In Kombination mit Wasser, Hefe und Salz entsteht der Brotteig.",
        difficulty = 1,
        funFact = "Deutschland hat die größte Brotvielfalt der Welt — über 3.000 verschiedene Brotsorten sind offiziell registriert."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Farbe hat der Himmel an einem klaren Tag?",
        answerA = "Grün",
        answerB = "Blau",
        answerC = "Weiß",
        answerD = "Gelb",
        correctAnswer = 1,
        explanation = "Der Himmel erscheint blau, weil die Erdatmosphäre blaues Licht der Sonne stärker streut als andere Farben (Rayleigh-Streuung).",
        difficulty = 1,
        funFact = "Bei Sonnenaufgang und -untergang erscheint der Himmel rot-orange, weil das Licht einen längeren Weg durch die Atmosphäre zurücklegt."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie viele Monate hat ein Jahr?",
        answerA = "10",
        answerB = "11",
        answerC = "12",
        answerD = "13",
        correctAnswer = 2,
        explanation = "Ein Jahr hat 12 Monate. Der gregorianische Kalender, der weltweit am häufigsten verwendet wird, teilt das Jahr in 12 Monate auf.",
        difficulty = 1,
        funFact = "Der ursprüngliche römische Kalender hatte nur 10 Monate — Januar und Februar wurden erst später hinzugefügt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches ist das kleinste Land der Welt?",
        answerA = "Monaco",
        answerB = "San Marino",
        answerC = "Liechtenstein",
        answerD = "Vatikanstadt",
        correctAnswer = 3,
        explanation = "Vatikanstadt ist mit einer Fläche von nur 0,44 km² der kleinste souveräne Staat der Welt.",
        difficulty = 1,
        funFact = "Vatikanstadt hat eine eigene Armee — die Schweizergarde, gegründet 1506, ist eine der ältesten Armeen der Welt."
    ),

    Question(
        categoryId = 11,
        questionText = "Aus welchem Material werden Fenster hauptsächlich hergestellt?",
        answerA = "Plastik",
        answerB = "Holz",
        answerC = "Glas",
        answerD = "Metall",
        correctAnswer = 2,
        explanation = "Fenster bestehen hauptsächlich aus Glas. Glas ist transparent und lässt Licht durch, während es gleichzeitig vor Wind und Regen schützt.",
        difficulty = 1,
        funFact = "Das älteste bekannte Fensterglas stammt aus dem antiken Rom und wurde im 1. Jahrhundert n. Chr. hergestellt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Organ pumpt Blut durch den menschlichen Körper?",
        answerA = "Lunge",
        answerB = "Niere",
        answerC = "Leber",
        answerD = "Herz",
        correctAnswer = 3,
        explanation = "Das Herz ist ein Muskel, der das Blut durch den gesamten Körper pumpt und so alle Organe mit Sauerstoff und Nährstoffen versorgt.",
        difficulty = 1,
        funFact = "Das menschliche Herz schlägt etwa 100.000 Mal pro Tag — im Laufe eines Lebens über 2,5 Milliarden Mal."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Planet ist der größte in unserem Sonnensystem?",
        answerA = "Saturn",
        answerB = "Jupiter",
        answerC = "Uranus",
        answerD = "Neptun",
        correctAnswer = 1,
        explanation = "Jupiter ist der größte Planet im Sonnensystem. Er ist so groß, dass alle anderen Planeten zusammen darin Platz hätten.",
        difficulty = 1,
        funFact = "Jupiters berühmter Großer Roter Fleck ist ein Sturm, der seit mindestens 350 Jahren wütet und größer als die Erde ist."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Kürzel 'km' als Maßeinheit?",
        answerA = "Kilogramm",
        answerB = "Kilometer",
        answerC = "Kubikemeter",
        answerD = "Kilopascal",
        correctAnswer = 1,
        explanation = "km steht für Kilometer. Ein Kilometer entspricht 1.000 Metern. Die Abkürzung kommt vom griechischen 'chilioi' (tausend) und dem lateinischen 'mille' (tausend).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Sprache wird in Brasilien gesprochen?",
        answerA = "Spanisch",
        answerB = "Englisch",
        answerC = "Portugiesisch",
        answerD = "Französisch",
        correctAnswer = 2,
        explanation = "In Brasilien wird Portugiesisch gesprochen. Brasilien ist die ehemalige Kolonie Portugals und hat heute die meisten Portugiesisch-Muttersprachler weltweit.",
        difficulty = 1,
        funFact = "Brasilien ist das einzige portugiesischsprachige Land in Südamerika — alle anderen Nachbarländer sprechen Spanisch."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie viele Finger hat eine normale menschliche Hand?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Eine normale menschliche Hand hat 5 Finger: Daumen, Zeigefinger, Mittelfinger, Ringfinger und kleiner Finger.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist Wasser in seiner flüssigen Form bei 0 °C?",
        answerA = "Dampf",
        answerB = "Eis",
        answerC = "Schnee",
        answerD = "Flüssig",
        correctAnswer = 1,
        explanation = "Bei genau 0 °C gefriert Wasser und wird zu Eis. Unterhalb von 0 °C ist Wasser fest (Eis), oberhalb flüssig.",
        difficulty = 1,
        funFact = "Wasser ist eine der wenigen Substanzen, die beim Gefrieren ihr Volumen vergrößern — deshalb schwimmt Eis auf Wasser."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Jahreszeit folgt auf den Winter?",
        answerA = "Herbst",
        answerB = "Sommer",
        answerC = "Frühling",
        answerD = "Monsun",
        correctAnswer = 2,
        explanation = "Auf den Winter folgt der Frühling. Die vier Jahreszeiten in der gemäßigten Zone sind: Frühling, Sommer, Herbst, Winter.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Tier ist für seine außergewöhnlich lange Schlafzeit bekannt?",
        answerA = "Elefant",
        answerB = "Koala",
        answerC = "Pferd",
        answerD = "Hund",
        correctAnswer = 1,
        explanation = "Koalas schlafen bis zu 22 Stunden am Tag. Ihr Eukalyptus-Nahrung ist sehr nährstoffarm und schwer verdaulich — Schlafen spart Energie.",
        difficulty = 1,
        funFact = "Koalas sind keine Bären, obwohl sie oft 'Koalabären' genannt werden — sie sind Beuteltiere und mit dem Wombat verwandt."
    ),

    // --- NEW MEDIUM (20) ---

    Question(
        categoryId = 11,
        questionText = "Welches Element hat die Ordnungszahl 1 im Periodensystem?",
        answerA = "Helium",
        answerB = "Lithium",
        answerC = "Sauerstoff",
        answerD = "Wasserstoff",
        correctAnswer = 3,
        explanation = "Wasserstoff (H) hat die Ordnungszahl 1 und ist das leichteste und häufigste Element im Universum.",
        difficulty = 2,
        funFact = "Etwa 75 % der normalen Materie im Universum besteht aus Wasserstoff."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Kontinent hat die meisten Länder?",
        answerA = "Asien",
        answerB = "Amerika",
        answerC = "Ozeanien",
        answerD = "Afrika",
        correctAnswer = 3,
        explanation = "Afrika hat mit 54 anerkannten Staaten die meisten Länder aller Kontinente — mehr als Asien (48) oder Amerika (35).",
        difficulty = 2,
        funFact = "Über 1.500 verschiedene Sprachen werden in Afrika gesprochen — das entspricht etwa einem Viertel aller Sprachen der Welt."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie nennt man den Prozess, bei dem Pflanzen Licht in Energie umwandeln?",
        answerA = "Zellatmung",
        answerB = "Osmose",
        answerC = "Photosynthese",
        answerD = "Transpiration",
        correctAnswer = 2,
        explanation = "Bei der Photosynthese wandeln Pflanzen Sonnenlicht, Wasser und CO₂ in Glukose (Zucker) und Sauerstoff um.",
        difficulty = 2,
        funFact = "Die gesamte Photosynthese auf der Erde produziert jährlich etwa 120 Milliarden Tonnen organisches Material."
    ),

    Question(
        categoryId = 11,
        questionText = "In welcher Stadt findet jährlich das berühmte Oktoberfest statt?",
        answerA = "Berlin",
        answerB = "Hamburg",
        answerC = "Köln",
        answerD = "München",
        correctAnswer = 3,
        explanation = "Das Oktoberfest findet jährlich in München auf der Theresienwiese statt. Es ist das weltgrößte Volksfest.",
        difficulty = 2,
        funFact = "Das erste Oktoberfest fand am 12. Oktober 1810 anlässlich der Hochzeit von Kronprinz Ludwig und Prinzessin Therese statt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Pflanze liefert den Rohstoff für Leinen?",
        answerA = "Baumwollstrauch",
        answerB = "Hanfpflanze",
        answerC = "Flachs",
        answerD = "Brennnessel",
        correctAnswer = 2,
        explanation = "Leinen wird aus den Fasern der Flachspflanze (Linum usitatissimum) gewonnen. Es ist eines der ältesten Textilfasern der Menschheit.",
        difficulty = 2,
        funFact = "Leinenfasern wurden bereits vor 36.000 Jahren von Menschen verarbeitet — Leinen ist damit älter als Baumwolle und Wolle."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches chemische Element wird mit dem Symbol 'Fe' bezeichnet?",
        answerA = "Fluor",
        answerB = "Eisen",
        answerC = "Francium",
        answerD = "Fermium",
        correctAnswer = 1,
        explanation = "Fe ist das chemische Symbol für Eisen und stammt vom lateinischen Wort 'ferrum'. Eisen ist das meistverwendete Metall der Welt.",
        difficulty = 2,
        funFact = "Der Erdkern besteht hauptsächlich aus Eisen und Nickel und erzeugt durch seine Bewegung das Magnetfeld der Erde."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Wissenschaftler formulierte die Gravitationsgesetze?",
        answerA = "Galileo Galilei",
        answerB = "Johannes Kepler",
        answerC = "Isaac Newton",
        answerD = "René Descartes",
        correctAnswer = 2,
        explanation = "Isaac Newton formulierte 1687 in seinem Werk 'Principia Mathematica' das Gravitationsgesetz und die drei Bewegungsgesetze.",
        difficulty = 2,
        funFact = "Die Geschichte mit dem Apfel, der Newton zur Entdeckung der Schwerkraft inspiriert haben soll, ist zwar vereinfacht, geht aber auf Newton selbst zurück."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie viele Knochen hat ein erwachsener menschlicher Körper?",
        answerA = "106",
        answerB = "156",
        answerC = "206",
        answerD = "256",
        correctAnswer = 2,
        explanation = "Ein erwachsener Mensch hat 206 Knochen. Babys haben noch etwa 270–300 Knochen, da viele im Laufe des Wachstums zusammenwachsen.",
        difficulty = 2,
        funFact = "Der kleinste Knochen im menschlichen Körper ist der Steigbügel im Ohr — er ist nur etwa 3 mm lang."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Programmiersprache wurde von Guido van Rossum entwickelt?",
        answerA = "Java",
        answerB = "Ruby",
        answerC = "Python",
        answerD = "Perl",
        correctAnswer = 2,
        explanation = "Python wurde von Guido van Rossum entwickelt und erstmals 1991 veröffentlicht. Die Sprache ist bekannt für ihre klare, lesbare Syntax.",
        difficulty = 2,
        funFact = "Der Name 'Python' ist nicht nach der Schlange benannt, sondern nach der britischen Komödianten-Gruppe 'Monty Python'."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Jahr gilt als Beginn des Ersten Weltkrieges?",
        answerA = "1912",
        answerB = "1914",
        answerC = "1916",
        answerD = "1918",
        correctAnswer = 1,
        explanation = "Der Erste Weltkrieg begann im Jahr 1914 nach dem Attentat auf Erzherzog Franz Ferdinand am 28. Juni 1914 in Sarajevo.",
        difficulty = 2,
        funFact = "Im Ersten Weltkrieg kämpften erstmals Flugzeuge, Panzer, Giftgas und Unterseeboote als Kriegswaffen — es war der erste 'totale Krieg'."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Komponist schrieb die Symphonie Nr. 9 'Ode an die Freude', obwohl er taub war?",
        answerA = "Wolfgang Amadeus Mozart",
        answerB = "Johann Sebastian Bach",
        answerC = "Franz Schubert",
        answerD = "Ludwig van Beethoven",
        correctAnswer = 3,
        explanation = "Ludwig van Beethoven vollendete seine 9. Symphonie 1824, zu einem Zeitpunkt, als er bereits völlig taub war. Die 'Ode an die Freude' ist heute die Europahymne.",
        difficulty = 2,
        funFact = "Bei der Uraufführung der 9. Symphonie musste man Beethoven am Arm drehen, damit er den Applaus des Publikums sehen konnte, da er ihn nicht hören konnte."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Gas macht etwa 78 % der Erdatmosphäre aus?",
        answerA = "Sauerstoff",
        answerB = "Kohlendioxid",
        answerC = "Argon",
        answerD = "Stickstoff",
        correctAnswer = 3,
        explanation = "Stickstoff (N₂) macht etwa 78 % der Erdatmosphäre aus. Sauerstoff folgt mit etwa 21 %, Argon mit etwa 0,9 %.",
        difficulty = 2,
        funFact = "Obwohl Stickstoff überall in der Luft vorhanden ist, können die meisten Lebewesen ihn nicht direkt verwenden — er muss erst von speziellen Bakterien 'fixiert' werden."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Zahlensystem verwenden Computer intern?",
        answerA = "Dezimalsystem (Basis 10)",
        answerB = "Hexadezimalsystem (Basis 16)",
        answerC = "Binärsystem (Basis 2)",
        answerD = "Oktalsystem (Basis 8)",
        correctAnswer = 2,
        explanation = "Computer arbeiten intern mit dem Binärsystem (0 und 1), da elektronische Schaltkreise nur zwei Zustände kennen: Strom an oder Strom aus.",
        difficulty = 2,
        funFact = "Ein einziges 'Bit' (0 oder 1) ist die kleinste Informationseinheit. Acht Bits ergeben ein Byte — genug, um einen einzelnen Buchstaben zu speichern."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Erfindung geht auf Johannes Gutenberg zurück?",
        answerA = "Dampfmaschine",
        answerB = "Buchdruck mit beweglichen Lettern",
        answerC = "Teleskop",
        answerD = "Kompass",
        correctAnswer = 1,
        explanation = "Johannes Gutenberg erfand um 1450 den Buchdruck mit beweglichen Metalllettern und revolutionierte damit die Verbreitung von Wissen in Europa.",
        difficulty = 2,
        funFact = "Gutenbergs erste gedruckte Bibel (die 'Gutenberg-Bibel', ca. 1455) gilt als eines der schönsten gedruckten Bücher aller Zeiten — nur noch etwa 49 vollständige Exemplare existieren."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Ozean ist der flächenmäßig größte der Welt?",
        answerA = "Atlantischer Ozean",
        answerB = "Arktischer Ozean",
        answerC = "Indischer Ozean",
        answerD = "Pazifischer Ozean",
        correctAnswer = 3,
        explanation = "Der Pazifische Ozean ist der größte Ozean der Erde. Er bedeckt etwa ein Drittel der Erdoberfläche und ist größer als alle Landmassen zusammen.",
        difficulty = 2,
        funFact = "Der tiefste Punkt der Erde befindet sich im Pazifik: der Mariannengraben mit etwa 11.000 Metern Tiefe."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Informationseinheit entspricht 1.024 Megabyte?",
        answerA = "Kilobyte",
        answerB = "Terabyte",
        answerC = "Gigabyte",
        answerD = "Petabyte",
        correctAnswer = 2,
        explanation = "1 Gigabyte (GB) entspricht 1.024 Megabyte (MB). Die Reihenfolge lautet: Bit → Byte → Kilobyte → Megabyte → Gigabyte → Terabyte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher chemische Prozess lässt Eisen rosten?",
        answerA = "Reduktion",
        answerB = "Sublimation",
        answerC = "Oxidation",
        answerD = "Hydrolyse",
        correctAnswer = 2,
        explanation = "Rost entsteht durch Oxidation: Eisen reagiert mit Sauerstoff und Feuchtigkeit zu Eisenoxid (Fe₂O₃), dem rötlich-braunen Rost.",
        difficulty = 2,
        funFact = "Die Rostschicht auf Eisen schützt das darunterliegende Metall kaum — anders als bei Aluminium, dessen Oxidschicht das Metall dauerhaft schützt."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt die Linie, die einen Kreis in zwei gleiche Hälften teilt?",
        answerA = "Radius",
        answerB = "Tangente",
        answerC = "Sekante",
        answerD = "Durchmesser",
        correctAnswer = 3,
        explanation = "Der Durchmesser (Diameter) ist eine Linie durch den Mittelpunkt eines Kreises, die den Kreis in zwei gleiche Hälften teilt. Er ist doppelt so lang wie der Radius.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Tier ist für seinen elektrischen Schlag bekannt?",
        answerA = "Schwarzer Marlin",
        answerB = "Zitteraal",
        answerC = "Weißer Hai",
        answerD = "Krake",
        correctAnswer = 1,
        explanation = "Der Zitteraal (Electrophorus electricus) kann Stromstöße von bis zu 860 Volt erzeugen — stark genug, um ein Pferd zu betäuben.",
        difficulty = 2,
        funFact = "Der Zitteraal ist trotz seines Namens kein echter Aal, sondern gehört zur Ordnung der karpfenartigen Fische."
    ),

    Question(
        categoryId = 11,
        questionText = "In welcher Stadt steht das Kolosseum?",
        answerA = "Athen",
        answerB = "Rom",
        answerC = "Karthago",
        answerD = "Istanbul",
        correctAnswer = 1,
        explanation = "Das Kolosseum (Amphitheatrum Flavium) steht in Rom und wurde zwischen 72 und 80 n. Chr. erbaut. Es fasste bis zu 80.000 Zuschauer.",
        difficulty = 2,
        funFact = "Das Kolosseum hatte ein ausgeklügeltes Sonnensegel-System ('Velarium'), das die Zuschauer vor Sonne und Regen schützte."
    ),

    // --- NEW HARD (15) ---

    Question(
        categoryId = 11,
        questionText = "Was besagt das 'Ohmsche Gesetz' in der Elektrizitätslehre?",
        answerA = "Die Leistung ist gleich Spannung multipliziert mit der Zeit",
        answerB = "Die Spannung ist gleich Stromstärke multipliziert mit dem Widerstand (U = R × I)",
        answerC = "Der Widerstand ist proportional zur Querschnittsfläche des Leiters",
        answerD = "Die Ladung ist gleich Kapazität mal Spannung",
        correctAnswer = 1,
        explanation = "Das Ohmsche Gesetz (Georg Simon Ohm, 1827) besagt: U = R × I. Die elektrische Spannung (U) ist gleich dem Widerstand (R) multipliziert mit der Stromstärke (I).",
        difficulty = 3,
        funFact = "Ohms Entdeckung wurde von der Berliner Akademie der Wissenschaften zunächst abgelehnt — er wurde sogar aus seinem Lehramt entlassen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Prinzip der Quantenmechanik besagt, dass Position und Impuls eines Teilchens nicht gleichzeitig exakt bestimmbar sind?",
        answerA = "Pauliprinzip",
        answerB = "Wellenfunktionskollaps",
        answerC = "Heisenbergsche Unschärferelation",
        answerD = "Schrödingers Prinzip",
        correctAnswer = 2,
        explanation = "Die Heisenbergsche Unschärferelation (Werner Heisenberg, 1927) besagt, dass Position und Impuls eines Quantenteilchens nicht beliebig genau gleichzeitig gemessen werden können.",
        difficulty = 3,
        funFact = "Heisenberg entwickelte seine Unschärferelation während eines Urlaubs auf der Insel Helgoland, um sich von Heuschnupfen zu erholen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher deutschen Kaisers Tod 1888 war Teil des sogenannten 'Dreikaiserjahres'?",
        answerA = "Friedrich III. und Wilhelm I.",
        answerB = "Nur Wilhelm I.",
        answerC = "Wilhelm I., Friedrich III. und Wilhelm II.",
        answerD = "Nur Friedrich III.",
        correctAnswer = 2,
        explanation = "Im Jahr 1888 — dem 'Dreikaiserjahr' — starben Kaiser Wilhelm I. und Kaiser Friedrich III. Wilhelm II. folgte als dritter Kaiser desselben Jahres nach.",
        difficulty = 3,
        funFact = "Friedrich III. regierte nur 99 Tage — er starb an Kehlkopfkrebs. Hätte er länger regiert, wäre Deutschlands Geschichte möglicherweise liberaler verlaufen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Prinzip beschreibt in der Thermodynamik den 'zweiten Hauptsatz'?",
        answerA = "Energie kann weder erzeugt noch vernichtet werden",
        answerB = "Die Entropie eines abgeschlossenen Systems nimmt immer zu oder bleibt gleich",
        answerC = "Bei absolutem Nullpunkt (-273,15 °C) hat ein ideales Gas das Volumen null",
        answerD = "Wärme fließt stets vom wärmeren zum kälteren Körper",
        correctAnswer = 1,
        explanation = "Der zweite Hauptsatz der Thermodynamik besagt, dass die Entropie (Unordnung) eines abgeschlossenen Systems immer zunimmt oder gleich bleibt — spontane Prozesse verlaufen in Richtung größerer Unordnung.",
        difficulty = 3,
        funFact = "Der zweite Hauptsatz erklärt, warum die Zeit eine Richtung hat — er ist der einzige physikalische Grundsatz, der zwischen Vergangenheit und Zukunft unterscheidet."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Philosoph prägte den Begriff 'Kategorischer Imperativ'?",
        answerA = "Georg Wilhelm Friedrich Hegel",
        answerB = "Arthur Schopenhauer",
        answerC = "Immanuel Kant",
        answerD = "Friedrich Nietzsche",
        correctAnswer = 2,
        explanation = "Immanuel Kant formulierte den Kategorischen Imperativ in seiner 'Grundlegung zur Metaphysik der Sitten' (1785): Handle nur nach derjenigen Maxime, durch die du zugleich wollen kannst, dass sie allgemeines Gesetz werde.",
        difficulty = 3,
        funFact = "Kant war so pünktlich in seiner täglichen Routine, dass seine Nachbarn angeblich die Uhr nach seinem Spaziergang stellen konnten."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der Unterschied zwischen DNS und RNA in der Biologie?",
        answerA = "DNS enthält Uracil, RNA enthält Thymin",
        answerB = "DNS ist doppelsträngig und enthält Thymin; RNA ist meist einzelsträngig und enthält Uracil",
        answerC = "DNS überträgt genetische Information, RNA speichert sie dauerhaft",
        answerD = "DNS befindet sich nur im Zellkern, RNA nur in Mitochondrien",
        correctAnswer = 1,
        explanation = "DNS (DNA) ist doppelsträngig, stabil und enthält die Base Thymin. RNA ist meist einzelsträngig, kurzlebiger und enthält statt Thymin die Base Uracil.",
        difficulty = 3,
        funFact = "In jeder menschlichen Körperzelle befinden sich etwa 2 Meter DNS — zusammen in allen Körperzellen würde sie bis zur Sonne und zurück reichen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches mathematische Konzept beschreibt die 'Eulersche Zahl' e ≈ 2,718?",
        answerA = "Die Basis des natürlichen Logarithmus und Grenzwert von (1+1/n)ⁿ für n→∞",
        answerB = "Das Verhältnis des Kreisumfangs zu seinem Durchmesser",
        answerC = "Die Quadratwurzel aus -1 in der komplexen Zahlentheorie",
        answerD = "Der goldene Schnitt in der Geometrie",
        correctAnswer = 0,
        explanation = "Die Eulersche Zahl e ≈ 2,71828... ist die Basis des natürlichen Logarithmus und kann als Grenzwert von (1+1/n)ⁿ für n gegen Unendlich definiert werden.",
        difficulty = 3,
        funFact = "Leonhard Euler verwendete den Buchstaben 'e' erstmals 1736 für diese Zahl — wahrscheinlich als erste Buchstabe des Wortes 'exponential'."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches historische Dokument begrenzte 1215 erstmals die Macht des englischen Königs?",
        answerA = "Bill of Rights",
        answerB = "Habeas Corpus Act",
        answerC = "Magna Carta",
        answerD = "Petition of Right",
        correctAnswer = 2,
        explanation = "Die Magna Carta (Große Urkunde der Freiheiten) wurde 1215 von König Johann ohne Land unterzeichnet und begrenzte erstmals die königliche Macht durch verbürgte Rechte.",
        difficulty = 3,
        funFact = "Von der ursprünglichen Magna Carta existieren heute noch vier Originalexemplare — zwei im British Museum, je eines in Salisbury und Lincoln Cathedral."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Theorie beschreibt, wie sich Lebewesen durch natürliche Selektion über Generationen verändern?",
        answerA = "Lamarckismus",
        answerB = "Kreationismus",
        answerC = "Panspermie-Theorie",
        answerD = "Darwinsche Evolutionstheorie",
        correctAnswer = 3,
        explanation = "Charles Darwins Evolutionstheorie (1859, 'On the Origin of Species') beschreibt, wie natürliche Selektion — das Überleben der am besten Angepassten — Arten verändert.",
        difficulty = 3,
        funFact = "Darwin zögerte 20 Jahre lang, seine Evolutionstheorie zu veröffentlichen, aus Angst vor dem religiösen und gesellschaftlichen Aufruhr, den sie auslösen würde."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man in der Volkswirtschaft unter dem Begriff 'BIP' (Bruttoinlandsprodukt)?",
        answerA = "Den Gesamtwert aller im Ausland von Inländern produzierten Güter und Dienstleistungen",
        answerB = "Den Gesamtwert aller innerhalb eines Landes produzierten Güter und Dienstleistungen in einem Jahr",
        answerC = "Die Summe aller Staatsausgaben abzüglich der Steuereinnahmen",
        answerD = "Den Durchschnittslohn aller Beschäftigten in einer Volkswirtschaft",
        correctAnswer = 1,
        explanation = "Das BIP misst den Gesamtwert aller Güter und Dienstleistungen, die innerhalb der Grenzen eines Landes in einem bestimmten Zeitraum produziert werden.",
        difficulty = 3,
        funFact = "Das BIP wurde erst in den 1930ern als Konzept entwickelt — der Wirtschaftswissenschaftler Simon Kuznets erhielt dafür den Wirtschaftsnobelpreis, warnte aber gleichzeitig vor Fehlanwendungen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Prozess beschreibt das Aufbrechen schwerer Atomkerne zur Energiegewinnung?",
        answerA = "Kernfusion",
        answerB = "Radioaktiver Zerfall",
        answerC = "Kernspaltung",
        answerD = "Neutronenaktivierung",
        correctAnswer = 2,
        explanation = "Bei der Kernspaltung (Fission) wird ein schwerer Atomkern (z.B. Uran-235) durch ein Neutron in kleinere Kerne gespalten, wobei enorme Energie freigesetzt wird.",
        difficulty = 3,
        funFact = "Die erste kontrollierte Kernspaltungsreaktion fand am 2. Dezember 1942 in Chicago unter Leitung von Enrico Fermi statt — in einem umgebauten Squash-Platz."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Schachprinzip besagt, dass ein Bauer, der die gegnerische Grundreihe erreicht, in eine andere Figur umgewandelt werden kann?",
        answerA = "Rochade",
        answerB = "En passant",
        answerC = "Umwandlung (Promotion)",
        answerD = "Zugzwang",
        correctAnswer = 2,
        explanation = "Bei der Bauernumwandlung (Promotion) kann ein Bauer, der die 8. Reihe (für Weiß) oder 1. Reihe (für Schwarz) erreicht, in eine Dame, Turm, Läufer oder Springer umgewandelt werden.",
        difficulty = 3,
        funFact = "Theoretisch könnte ein Spieler neun Damen auf dem Brett haben — eine durch Aufstellung plus acht durch Bauernumwandlung. Das wäre aber ein extrem ungewöhnliches Spiel."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher deutsche Dichter verfasste das Werk 'Faust', eines der bedeutendsten Werke der deutschen Literatur?",
        answerA = "Friedrich Schiller",
        answerB = "Heinrich Heine",
        answerC = "Novalis",
        answerD = "Johann Wolfgang von Goethe",
        correctAnswer = 3,
        explanation = "Johann Wolfgang von Goethe schrieb 'Faust' in zwei Teilen: Faust I (1808) und Faust II (1832, posthum). Es gilt als das bedeutendste Werk der deutschen Literatur.",
        difficulty = 3,
        funFact = "Goethe arbeitete über 60 Jahre an 'Faust' — er begann als junger Mann und vollendete den zweiten Teil kurz vor seinem Tod im Alter von 82 Jahren."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Einheit wird zur Messung der Schallintensität (Lautstärke) verwendet?",
        answerA = "Hertz (Hz)",
        answerB = "Watt (W)",
        answerC = "Dezibel (dB)",
        answerD = "Pascal (Pa)",
        correctAnswer = 2,
        explanation = "Dezibel (dB) ist die Einheit für den Schalldruckpegel. Die Skala ist logarithmisch: 10 dB mehr bedeuten eine zehnfache Schallintensität.",
        difficulty = 3,
        funFact = "Ein normales Gespräch hat etwa 60 dB. Ein Düsentriebwerk aus 30 Metern Entfernung hat etwa 140 dB — das übersteigt die Schmerzgrenze des menschlichen Ohres."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Ereignis markierte das Ende des Weströmischen Reiches?",
        answerA = "Die Plünderung Roms durch die Westgoten (410 n. Chr.)",
        answerB = "Die Absetzung des letzten weströmischen Kaisers Romulus Augustulus (476 n. Chr.)",
        answerC = "Die Teilung des Römischen Reiches unter Kaiser Diokletian (285 n. Chr.)",
        answerD = "Die Ermordung Caesars (44 v. Chr.)",
        correctAnswer = 1,
        explanation = "Das Ende des Weströmischen Reiches wird konventionell auf das Jahr 476 n. Chr. datiert, als der germanische Heerführer Odoaker den letzten Kaiser Romulus Augustulus absetzte.",
        difficulty = 3,
        funFact = "Der Name 'Romulus Augustulus' bedeutet 'kleiner Augustus' — ein ironischer Spitzname, da er der letzte und bedeutungsloseste der weströmischen Kaiser war."
    )
)
