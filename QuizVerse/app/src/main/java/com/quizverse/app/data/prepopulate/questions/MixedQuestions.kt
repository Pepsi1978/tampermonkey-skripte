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
    )
)
