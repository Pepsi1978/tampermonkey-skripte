package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert6(): List<Question> = listOf(

    // ── WHISKY-HERSTELLUNG & DESTILLATION ─────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Wie hoch ist ungefähr der sogenannte 'Angels' Share' — der jährliche Verdunstungsverlust — bei der Whisky-Reifung in schottischen Lagerhäusern?",
        answerA = "1,5–2 % pro Jahr",
        answerB = "0,5–1 % pro Jahr",
        answerC = "4–5 % pro Jahr",
        answerD = "8–10 % pro Jahr",
        correctAnswer = 0,
        explanation = "In Schottland verdunsten jährlich etwa 1,5–2 % des in den Fässern gelagerten Whiskys. In wärmeren Klimazonen wie der Karibik kann der Verlust deutlich höher sein — bis zu 8–10 % pro Jahr.",
        difficulty = 4,
        funFact = "Bei einem 20 Jahre alten Whisky aus der Karibik können bis zu 80 % der ursprünglichen Füllmenge verloren gegangen sein — was den Preis solcher Raritäten erklärt."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welche Funktion erfüllt Kupfer bei der Destillation in traditionellen Pot Stills — über die Wärmeleitung hinaus?",
        answerA = "Kupfer katalysiert die Entfernung unerwünschter Schwefelverbindungen und verbessert das Aroma",
        answerB = "Kupfer erhöht den Alkoholgehalt durch selektive Filterung",
        answerC = "Kupfer beschleunigt die Gärung durch enzymatische Reaktion",
        answerD = "Kupfer verhindert die Bildung von Methanol im Endprodukt",
        correctAnswer = 1,
        explanation = "Kupfer reagiert chemisch mit Schwefelverbindungen wie Dimethylsulfid, die im Destillat üble Gerüche erzeugen würden. Durch die Kupferkontaktfläche werden diese Verbindungen gebunden und entfernt, was das Aromaprodukt deutlich verbessert.",
        difficulty = 4,
        funFact = "Je länger der Kupferkontakt (durch hohe, schlanke Stills mit langem Hals), desto leichter und fruchtiger wird das Destillat — kurze, gedrungene Stills erzeugen einen schwereren, öligeren Charakter."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Fachbegriff 'Low Wines' in der Whisky-Destillation?",
        answerA = "Whisky aus ertragsschwachen Erntejahren",
        answerB = "Das Endprodukt der zweiten Destillation mit niedrigem Alkoholgehalt",
        answerC = "Das Rohbrand-Destillat nach der ersten Destillation mit ca. 20–28 % Alkohol",
        answerD = "Der Rückstand in der Wash Still nach der ersten Destillation",
        correctAnswer = 2,
        explanation = "Low Wines bezeichnet das Destillat nach dem ersten Brenndurchgang in der Wash Still. Es hat einen Alkoholgehalt von etwa 20–28 % und wird anschließend in der Spirit Still ein zweites Mal destilliert, um den Feinbrand (ca. 65–75 % Alkohol) zu erhalten.",
        difficulty = 4,
        funFact = "Beim schottischen Single Malt wird fast immer zweimal destilliert. Irish Whiskey wird traditionell dreimal destilliert — das macht ihn tendenziell leichter und glatter."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen einem 'Single Malt' und einem 'Blended Malt' Scotch Whisky?",
        answerA = "Single Malt kommt aus einer einzigen Destillerie; Blended Malt mischt Malt-Whiskys verschiedener Destillerien",
        answerB = "Single Malt wird einmal destilliert; Blended Malt wird mehrfach destilliert",
        answerC = "Single Malt reift in nur einem Fasstyp; Blended Malt reift in mehreren verschiedenen Fässern",
        answerD = "Single Malt enthält nur eine Getreideart; Blended Malt enthält Malzgerste und Weizen",
        correctAnswer = 3,
        explanation = "Single Malt Scotch Whisky muss aus gemälzter Gerste in einer einzigen Destillerie hergestellt werden. Blended Malt (früher 'Vatted Malt') ist eine Mischung aus Malt Whiskys verschiedener Destillerien — ohne Grain Whisky. Blended Scotch enthält hingegen sowohl Malt- als auch Grain-Whiskys.",
        difficulty = 4,
        funFact = "Bekannte Blended Malts sind z.B. Monkey Shoulder oder Johnnie Walker Green Label. Über 90 % des weltweit verkauften Scotch ist Blended Scotch, nicht Single Malt."
    ),

    // ── GIN: BOTANICALS & KATEGORIEN ─────────────────────────────────────────

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welches Botanical ist laut EU-Verordnung zwingend vorgeschrieben und muss im Geschmack eines Gins dominieren?",
        answerA = "Wacholderbeeren (Juniperus communis)",
        answerB = "Koriandersamen",
        answerC = "Angelikawurzel",
        answerD = "Zitrusschalen",
        correctAnswer = 0,
        explanation = "Die EU-Spirituosenverordnung schreibt vor, dass Gin aus Ethylalkohol mit natürlichen und/oder naturidentischen Aromastoffen hergestellt wird, wobei Wacholderbeeren (Juniperus communis) geschmacklich dominieren müssen. Ohne Wacholder darf sich eine Spirituose nicht Gin nennen.",
        difficulty = 4,
        funFact = "Echter Wacholder wächst in gemäßigten Klimazonen weltweit — für Gin werden die reifen, blauen Beeren verwendet, die eigentlich Zapfen sind. Je nach Herkunft variiert ihr Aroma von harzig über kieferig bis zitrusartig."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'London Dry Gin' rechtlich von 'Distilled Gin'?",
        answerA = "Bei London Dry Gin dürfen nach der Destillation keine Aromastoffe, Farbstoffe oder Zucker (außer min. 0,1 g/l) mehr hinzugefügt werden; bei Distilled Gin ist das erlaubt",
        answerB = "London Dry Gin muss in London produziert werden; Distilled Gin darf überall hergestellt werden",
        answerC = "London Dry Gin wird dreimal destilliert; Distilled Gin nur einmal",
        answerD = "London Dry Gin darf ausschließlich Wacholder als Botanical verwenden; Distilled Gin erlaubt beliebige Botanicals",
        correctAnswer = 1,
        explanation = "London Dry Gin muss durch Destillation hergestellt werden, wobei alle Aromen natürlicher Herkunft während der Destillation zugefügt werden. Nach der Destillation darf nichts außer Wasser und einer minimalen Menge Alkohol hinzugefügt werden. Zucker ist auf max. 0,1 g/l begrenzt. Er muss nicht in London produziert werden.",
        difficulty = 4,
        funFact = "Weil London Dry Gin nach der Destillation nicht mehr verändert werden darf, ist er besonders 'ehrlich' — die Qualität der Botanicals zeigt sich ungefiltert im Endprodukt."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was ist 'Genever' und worin unterscheidet er sich grundlegend von modernem London Dry Gin?",
        answerA = "Genever ist älter und wird auf Basis von gemälztem Getreide-Destillat (Moutwijn) hergestellt, was ihm ein malziges, getreideartiges Aroma gibt",
        answerB = "Genever ist ein Gin aus Wacholderdestillat ohne weitere Botanicals",
        answerC = "Genever enthält Zucker und ist daher ein Likör, kein Gin",
        answerD = "Genever wird nur in belgischen Pot Stills destilliert und zweimal gebrannt",
        correctAnswer = 2,
        explanation = "Genever ist der historische Vorläufer des modernen Gins und kommt aus den Niederlanden und Belgien. Er wird auf Basis von 'Moutwijn' (Malzwein) hergestellt — einem aus gemälztem Getreide destillierten Basisspirituosen — dem dann Wacholder und andere Botanicals zugefügt werden. Das gibt ihm ein malziges, whiskeyähnliches Grundaroma.",
        difficulty = 4,
        funFact = "Der englische Begriff 'Gin' ist eine Verkürzung des französischen/niederländischen Wortes 'genièvre' oder 'jenever' — Wacholder. Britische Soldaten im 80-jährigen Krieg tranken ihn zur Stärkung ('Dutch courage')."
    ),

    // ── RUM: SORTEN & HERSTELLUNG ─────────────────────────────────────────────

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Rhum Agricole' von normalem Melasse-Rum in der Produktion?",
        answerA = "Rhum Agricole wird aus frisch gepresstem Zuckerrohrsaft destilliert; Melasse-Rum aus dem Nebenprodukt der Zuckerraffinierung",
        answerB = "Rhum Agricole wird dreimal destilliert; Melasse-Rum nur einmal",
        answerC = "Rhum Agricole muss mindestens 3 Jahre reifen; Melasse-Rum kann sofort abgefüllt werden",
        answerD = "Rhum Agricole verwendet ausschließlich Column Stills; Melasse-Rum ausschließlich Pot Stills",
        correctAnswer = 3,
        explanation = "Rhum Agricole wird aus frischem Zuckerrohrsaft ('vesou') produziert, der unmittelbar nach der Ernte vergoren und destilliert wird. Melasse-Rum (industrieller Rum) wird aus Melasse hergestellt — dem dunklen, zähflüssigen Rückstand der Zuckerproduktion. Agricole hat ein frischeres, pflanzlicheres Aroma, während Melasse-Rum süßer und vollmundiger ist.",
        difficulty = 4,
        funFact = "Rhum Agricole aus Martinique hat als einziger Rum eine kontrollierte Ursprungsbezeichnung (AOC) nach französischem Recht. Über 95 % aller weltweit produzierten Rums sind Melasse-Rums."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Wie wird 'Dunder' in der traditionellen jamaikanischen Rum-Herstellung eingesetzt?",
        answerA = "Dunder ist abgestandener, vergorener Rückstand aus vorherigen Destillationen, der als Säuerungsmittel der neuen Gärmaische zugesetzt wird",
        answerB = "Dunder bezeichnet die Fasslagerung in getorften Eichenfässern",
        answerC = "Dunder ist ein lokales Zuckerrohr-Melasse-Gemisch mit besonders hohem Zuckergehalt",
        answerD = "Dunder ist die zweite Destillation in einer Kupfer-Pot-Still ohne Kühlung",
        correctAnswer = 0,
        explanation = "Dunder ist der Destillationsrückstand aus vorherigen Rum-Produktionschargen — eine komplexe Mischung aus Säuren, Estern und Mikroorganismen. Jamaikanische Destillateuren fügen ihn der Gärmaische zu, um die Gärung anzusäuern und zu beschleunigen. Das fördert die Bildung von Estern und den charakteristischen 'funky' Jamaika-Rum-Charakter.",
        difficulty = 4,
        funFact = "Einige Destillerien in Jamaika verwenden Dunder-Gruben, die seit Jahrzehnten niemals geleert wurden — die Mikroorganismenpopulation darin ist einzigartig und unverwechselbar für die jeweilige Destillerie."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Was ist 'Cachaça' und wie unterscheidet sie sich rechtlich von Rum?",
        answerA = "Cachaça ist ein brasilianischer Zuckerrohr-Brand aus frischem Saft, der nur in Brasilien produziert werden darf und seit 2013 eine eigene Kategorie bildet",
        answerB = "Cachaça ist Rum mit Zuckerzusatz und muss mindestens 38 % Alkohol haben",
        answerC = "Cachaça ist identisch mit Rhum Agricole, aber aus Brasilien",
        answerD = "Cachaça darf nur aus einer bestimmten Zuckerrohrsorte aus dem Bundesstaat Minas Gerais hergestellt werden",
        correctAnswer = 1,
        explanation = "Cachaça ist eine brasilianische Spirituose aus fermentiertem frischen Zuckerrohrsaft mit einem Alkoholgehalt von 38–48 %. Sie unterscheidet sich von Rum dadurch, dass sie ausschließlich aus frischem Saft (nicht Melasse) hergestellt wird, ausschließlich in Brasilien produziert werden darf und eine eigene gesetzlich geschützte Kategorie bildet.",
        difficulty = 4,
        funFact = "Cachaça ist die Basis des Caipirinhas — dem bekanntesten brasilianischen Cocktail. Jährlich werden ca. 1,5 Milliarden Liter Cachaça produziert, fast ausschließlich für den Heimmarkt."
    ),

    // ── COCKTAIL-GESCHICHTE & KLASSIKER ──────────────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Wie entstand der Negroni und wer soll ihn erfunden haben?",
        answerA = "1880 in London vom Barkeeper Harry Craddock als Abwandlung des Martinez",
        answerB = "1920 in Havanna von Constante Ribalaigua Vert im El Floridita",
        answerC = "Um 1919–1920 in Florenz von Graf Camillo Negroni, der seinen Americano mit Gin statt Soda verlängert haben soll",
        answerD = "1934 in New York von Salvatore Calabrese als Hommage an seine Heimatstadt Neapel",
        correctAnswer = 2,
        explanation = "Die bekannteste Überlieferung besagt, Graf Camillo Negroni habe im Caffè Casoni in Florenz um 1919/1920 den Barkeeper Fosco Scarselli gebeten, seinen Americano mit Gin statt Sodawasser zu verstärken. Das Rezept — gleiche Teile Gin, roter Wermut und Campari — wurde zur Ikone der Barkultur.",
        difficulty = 4,
        funFact = "Der Negroni Sbagliato ('falscher Negroni') ersetzt den Gin durch Prosecco — angeblich entstand er, als ein Barkeeper versehentlich zum Schaumwein griff. 'Sbagliato' bedeutet auf Italienisch 'Fehler'."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welcher Cocktail gilt als der älteste und entspricht der Ur-Definition eines Cocktails aus dem Jahr 1806 (Spirituose + Zucker + Wasser + Bitters)?",
        answerA = "Sazerac",
        answerB = "Mint Julep",
        answerC = "Tom Collins",
        answerD = "Old Fashioned",
        correctAnswer = 3,
        explanation = "Der Old Fashioned entspricht exakt der frühesten bekannten Cocktail-Definition, die 1806 in der amerikanischen Zeitung 'The Balance' veröffentlicht wurde: 'Ein stimulierendes Getränk aus Spirituose, Zucker, Wasser und Bitters.' Der Name 'Old Fashioned' entstand im 19. Jahrhundert, als Barkeeper begannen, komplexere Varianten zu servieren und Gäste ausdrücklich die altmodische Version bestellten.",
        difficulty = 4,
        funFact = "Der klassische Old Fashioned wird bis heute gleich zubereitet: Whiskey (Bourbon oder Rye), Zuckerwürfel, Angostura Bitters, ein Spritzer Wasser — in einem Rocks-Glas über einem großen Eiswürfel."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Wo und wann entstand der Daiquiri — und wer gilt als sein Erfinder?",
        answerA = "1898 in Kuba bei der Eisenmine Daiquirí, entwickelt vom US-Ingenieur Jennings Cox",
        answerB = "1920 in Havanna im Hotel Nacional de Cuba durch den Barkeeper Constante",
        answerC = "1905 in Puerto Rico von einem spanischen Kolonialoffizier namens Daiquirí",
        answerD = "1890 in New Orleans von einem unbekannten kreolischen Barkeeper",
        correctAnswer = 0,
        explanation = "Der Daiquiri entstand der Überlieferung nach um 1898 nahe der Eisenmine 'Daiquirí' in Santiago de Cuba. Der US-Bergbauingenieur Jennings Cox soll Rum, Limettensaft und Zucker zusammengemischt haben — aus dem einfachen Grund, dass der Gin ausging und er amerikanischen Beamten etwas anbieten musste.",
        difficulty = 4,
        funFact = "Ernest Hemingway liebte Daiquiris so sehr, dass das El Floridita in Havanna noch heute eine lebensgroße Bronzestatue von ihm an seinem Stammplatz hat. Sein 'Papa Doble' enthielt doppelten Rum und keinen Zucker."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Martinez' Cocktail und warum ist er historisch bedeutsam?",
        answerA = "Er gilt als direkter Vorläufer des Dry Martini und wurde um 1860–1880 mit Gin, süßem Wermut, Maraschino und Bitters serviert",
        answerB = "Er ist ein spanischer Cocktail aus Sherry, Brandy und Orangenlikör",
        answerC = "Er ist die Originalversion des Negroni ohne Campari",
        answerD = "Er gilt als erster Cocktail, der jemals in einem Barhandbuch veröffentlicht wurde",
        correctAnswer = 1,
        explanation = "Der Martinez gilt als historischer Vorläufer des Dry Martini. In frühen Barhandbüchern (z.B. Jerry Thomas' 'Bar-Tenders Guide' von 1887) erscheint er als Mischung aus Gin (oder Old Tom Gin), süßem Wermut, Maraschino-Likör und Angostura Bitters. Als Dry Gin und Dry Vermouth populär wurden, entwickelte er sich zum Dry Martini.",
        difficulty = 4,
        funFact = "Jerry Thomas, 'der Vater der amerikanischen Mixologie', soll den Martini einem Gast zubereitet haben, der nach Martinez (Kalifornien) unterwegs war — ob diese Geschichte stimmt, ist allerdings historisch umstritten."
    ),

    // ── DESTILLATION: TECHNIK & PROZESSE ─────────────────────────────────────

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Vorlauf', 'Mittellauf' und 'Nachlauf' bei der Destillation?",
        answerA = "Vorlauf enthält flüchtige Verbindungen wie Methanol und Acetaldehyd; der Mittellauf ist das gewünschte Herz der Destillation; der Nachlauf enthält schwerflüchtige Fuselöle",
        answerB = "Vorlauf ist die erste Destillation; Mittellauf die zweite; Nachlauf die dritte",
        answerC = "Vorlauf bezeichnet den Beginn der Gärung; Mittellauf die Gärung bei Maximaltemperatur; Nachlauf das Ende der Gärung",
        answerD = "Vorlauf, Mittellauf und Nachlauf sind drei verschiedene Fasstypen für die Reifung",
        correctAnswer = 2,
        explanation = "Bei der Destillation wird das Destillat in drei Fraktionen aufgeteilt: Der Vorlauf (Heads) enthält flüchtige, schädliche Verbindungen wie Methanol und Acetaldehyd und wird verworfen. Der Mittellauf (Heart/Herz) ist das aromatisch gewünschte Destillat. Der Nachlauf (Tails) enthält schwerflüchtige Fuselöle — er wird oft verworfen oder zur nächsten Charge gegeben.",
        difficulty = 4,
        funFact = "Die Entscheidung, wann der Brennmeister vom Vorlauf zum Mittellauf und vom Mittellauf zum Nachlauf wechselt ('cut points'), ist eine Kunst — sie beeinflusst den Charakter des Endprodukts mehr als fast jede andere Variable."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Coffey Still' und wer hat ihn erfunden?",
        answerA = "Ein kontinuierlich arbeitender Säulendestillationsapparat, erfunden 1831 von Aeneas Coffey",
        answerB = "Ein traditioneller irischer Pot Still aus Keramik",
        answerC = "Ein modifizierter Pot Still mit Kupferkatalyse, erfunden 1859 von James Coffey",
        answerD = "Ein Vakuum-Destillationsapparat für Niedertemperatur-Spirituosen",
        correctAnswer = 3,
        explanation = "Der Coffey Still (auch Patent Still oder Column Still) wurde 1831 von Aeneas Coffey, einem irischen Zollbeamten und Destillateur, patentiert. Er arbeitet kontinuierlich — neue Maische wird oben zugeführt, während unten ständig Destillat abgezogen wird. Er ermöglicht höhere Alkohol-Reinheit und deutlich größere Produktionsmengen als der Pot Still.",
        difficulty = 4,
        funFact = "Irlands großen Destillerien lehnten Coffeys Erfindung zunächst ab — sie sahen kontinuierliche Destillation als minderwertig an. Schottland und England übernahmen sie dagegen sofort, was zur Geburt des Blended Whisky führte."
    ),

    // ── COGNAC & BRANDY ──────────────────────────────────────────────────────

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was bedeuten die Cognac-Bezeichnungen 'VS', 'VSOP' und 'XO' in Bezug auf die Mindestreifedauer?",
        answerA = "VS: mindestens 2 Jahre; VSOP: mindestens 4 Jahre; XO: mindestens 10 Jahre",
        answerB = "VS: mindestens 1 Jahr; VSOP: mindestens 3 Jahre; XO: mindestens 6 Jahre",
        answerC = "VS: mindestens 3 Jahre; VSOP: mindestens 5 Jahre; XO: mindestens 12 Jahre",
        answerD = "VS: mindestens 6 Monate; VSOP: mindestens 2 Jahre; XO: mindestens 8 Jahre",
        correctAnswer = 0,
        explanation = "Laut den Cognac-Vorschriften des Bureau National Interprofessionnel du Cognac (BNIC) gilt: VS (Very Special) mindestens 2 Jahre Fasslagerung; VSOP (Very Superior Old Pale) mindestens 4 Jahre; XO (Extra Old) mindestens 10 Jahre — die Altersangabe bezieht sich auf den jüngsten Bestandteil der Assemblage.",
        difficulty = 4,
        funFact = "Die XO-Regelung wurde 2018 von 6 auf 10 Jahre verschärft. Cognac muss ausschließlich in der Cognac-Region in Frankreich produziert werden — andernfalls heißt es schlicht Brandy."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte dominiert die Cognac-Produktion und warum wird ausgerechnet diese verwendet?",
        answerA = "Ugni Blanc (Trebbiano), weil er hochsäurige, alkoholarme Weine ergibt, die ideal für die Destillation sind",
        answerB = "Pinot Noir, weil er aromatische Weine mit viel Gerbstoff produziert",
        answerC = "Chardonnay, weil er die klassische Butterkaramell-Note in Cognac erzeugt",
        answerD = "Colombard, weil er besonders zuckerreich und damit alkoholstark ist",
        correctAnswer = 1,
        explanation = "Ugni Blanc (in Italien Trebbiano genannt) macht über 90 % der Trauben in der Cognac-Produktion aus. Er liefert saure, alkoholarme Weine (ca. 7–9 % Alkohol) mit geringem Aroma — genau das, was ein gutes Destillat braucht: Säure bewahrt das Destillat, niedriger Alkohol bedeutet mehr aromatische Konzentration durch Destillation.",
        difficulty = 4,
        funFact = "Der Wein aus Ugni Blanc schmeckt als Tafelwein furchtbar — viel zu sauer und dünn. Paradoxerweise macht genau das ihn zum perfekten Rohmaterial für Cognac."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Was ist 'Armagnac' und worin unterscheidet er sich von Cognac in der Produktionsmethode?",
        answerA = "Armagnac ist ein Calvados-ähnlicher Apfelbrand aus der Gascogne",
        answerB = "Armagnac ist ein älterer französischer Traubenbrand, der traditionell in einer kontinuierlichen Säulendestille (alambic armagnacais) einmalig destilliert wird",
        answerC = "Armagnac wird zweimal in Pot Stills destilliert, genau wie Cognac, aber in der Region Gascogne",
        answerD = "Armagnac ist Cognac mit Prune-d'Agen-Zusatz zur Aromatisierung",
        correctAnswer = 2,
        explanation = "Armagnac ist Frankreichs ältester Weinbrand und stammt aus der Gascogne. Im Gegensatz zu Cognac, der zweimal in Charentais-Pot-Stills destilliert wird, verwendet Armagnac traditionell den 'alambic armagnacais' — eine kontinuierliche Säulendestille, die nur einmal destilliert. Dadurch behält Armagnac mehr Rohmaterial-Aromen und gilt als rustikaler und charaktervoller.",
        difficulty = 4,
        funFact = "Armagnac wird seit dem 15. Jahrhundert destilliert — fast 150 Jahre früher als Cognac. Trotzdem ist Cognac heute weltweit viel bekannter, weil die Cognac-Region bessere Handelsverbindungen nach England hatte."
    ),

    // ── TEQUILA & MEZCAL ─────────────────────────────────────────────────────

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Tequila und Mezcal?",
        answerA = "Tequila darf nur aus blauen Agaven in bestimmten mexikanischen Regionen hergestellt werden; Mezcal darf aus verschiedenen Agavenarten in anderen Regionen produziert werden",
        answerB = "Tequila wird in Column Stills destilliert; Mezcal ausschließlich in Pot Stills",
        answerC = "Tequila ist jünger als Mezcal und enthält per Gesetz mehr Agavenanteil",
        answerD = "Tequila enthält den Agavenwurm; Mezcal nicht",
        correctAnswer = 3,
        explanation = "Tequila ist rechtlich ein Untertyp von Mezcal und darf nur aus der blauen Weber-Agave (Agave tequilana) in bestimmten Regionen Mexikos (Jalisco und einige andere Bundesstaaten) produziert werden. Mezcal darf aus über 30 verschiedenen Agavenarten in anderen Regionen hergestellt werden — er ist also der Oberbegriff.",
        difficulty = 4,
        funFact = "Der Agavenwurm ('gusano') findet sich in manchen Mezcal-Flaschen, nicht in Tequila. Er ist ein Marketingtrick — kein traditioneller Bestandteil. Echter Qualitäts-Mezcal hat keinen Wurm."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Wie lange muss eine Agave-Pflanze wachsen, bevor sie für Tequila oder Mezcal geerntet werden kann?",
        answerA = "7–12 Jahre für blaue Weber-Agave; manche Wildagaven bis 25–30 Jahre",
        answerB = "2–4 Jahre, ähnlich wie Weinreben",
        answerC = "Genau 5 Jahre nach der EU-Norm für gesetzlich geschützte Ursprungsbezeichnungen",
        answerD = "1–3 Jahre für industriell gezüchtete Agaven",
        correctAnswer = 0,
        explanation = "Die blaue Weber-Agave für Tequila benötigt ca. 7–12 Jahre bis zur Reife. Bei Mezcal werden oft Wildagaven wie Tobalá oder Tepeztate verwendet, die 15–30 Jahre brauchen. Die Pflanze stirbt nach der Ernte — der Jimador schneidet den reifen Piña-Kern (Herz) heraus.",
        difficulty = 4,
        funFact = "Ein einziger Jimador ('Agavenernte') kann täglich nur ca. 1–2 Tonnen Agave ernten. Da eine Pflanze nur einmal geerntet werden kann und jahrzehntelang wächst, ist Premium-Mezcal aus Wildagaven naturgemäß sehr selten und teuer."
    ),

    // ── ABSINTHE & BITTERSPIRITUOSEN ─────────────────────────────────────────

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Warum wurde Absinth Anfang des 20. Jahrhunderts in vielen Ländern verboten — und was weiß man heute über diese Begründung?",
        answerA = "Er wurde für angebliche Halluzinationen durch Thujon verantwortlich gemacht; moderne Forschung zeigt, dass echter Absinth zu wenig Thujon enthält für psychoaktive Wirkung",
        answerB = "Er wurde wegen seines extremen Alkoholgehalts verboten, der zu Todesfällen führte",
        answerC = "Er enthielt Kupfer aus schlechten Destillierapparaten, was zu Vergiftungen führte",
        answerD = "Er wurde aus moralischen Gründen verboten, weil er in Bordellen konsumiert wurde",
        correctAnswer = 1,
        explanation = "Absinth wurde in der La Belle Époque für Halluzinationen, Geisteskrankheit und kriminelles Verhalten verantwortlich gemacht — als Ursache galt Thujon aus dem Wermutkraut. Moderne chemische Analysen historischer Absinthe zeigen jedoch, dass der Thujon-Gehalt viel zu niedrig war für psychoaktive Wirkung. Die eigentliche Ursache war schlicht der hohe Alkoholgehalt (60–75 %).",
        difficulty = 4,
        funFact = "Absinth war in Frankreich von 1915 bis 2011 verboten. Seit seiner Legalisierung boomt der Markt — authentische Absinthe nach historischen Rezepturen sind heute in Spezialgeschäften erhältlich."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Was ist 'Angostura Bitters' und wie wird es in der Cocktailherstellung eingesetzt?",
        answerA = "Es ist ein konzentriertes, alkoholisches Kräuterextrakt aus Venezuela (heute Trinidad), das als Geschmacksverstärker in winzigen Mengen (Dashes) eingesetzt wird",
        answerB = "Es ist ein venezolanischer Kräuterlikör mit 40 % Alkohol, der als Digestif getrunken wird",
        answerC = "Es ist ein brasilianischer Bittersaft aus Angostura-Rinde, der alkoholfrei ist",
        answerD = "Es ist ein medizinisches Präparat, das erst im 20. Jahrhundert zum Cocktailzutat wurde",
        correctAnswer = 2,
        explanation = "Angostura Bitters wurde 1824 von dem deutschen Arzt Johann Gottlieb Benjamin Siegert in der venezolanischen Stadt Angostura (heute Ciudad Bolívar) entwickelt — ursprünglich als medizinisches Mittel gegen Magenprobleme. Mit ca. 44,7 % Alkohol ist es konzentriert aromatisiert und wird in Bars in Dashes (wenige Milliliter) als Geschmackskomplexifizierer eingesetzt.",
        difficulty = 4,
        funFact = "Das Rezept für Angostura Bitters ist bis heute ein streng gehütetes Familiengeheimnis der House of Angostura. Nur fünf Personen weltweit kennen die vollständige Zutatenliste."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Digestif' im Unterschied zu 'Apéritif' — und welche Spirituosen gehören typischerweise dazu?",
        answerA = "Ein Digestif wird nach dem Essen zur Förderung der Verdauung getrunken (z.B. Grappa, Amaro, Cognac, Calvados); ein Apéritif vor dem Essen zur Anregung des Appetits",
        answerB = "Ein Digestif ist immer süß und enthält Zucker; ein Apéritif ist immer trocken",
        answerC = "Ein Digestif hat mindestens 50 % Alkohol; ein Apéritif hat höchstens 20 %",
        answerD = "Ein Digestif wird immer in einer Brandy-Schwenker serviert; ein Apéritif immer in einem Champagnerflöte",
        correctAnswer = 3,
        explanation = "Ein Digestif (von lateinisch 'digestivus', verdauungsfördernd) wird nach dem Essen getrunken. Klassische Digestifs sind Grappa, Amaro (Kräuterlikör), Cognac, Armagnac, Calvados, Whisky oder Obstbrände. Ein Apéritif wird vor dem Essen zur Appetitanregung getrunken — typisch sind Champagner, Wermut, Campari oder Pastis.",
        difficulty = 4,
        funFact = "Die wissenschaftliche Evidenz für die Verdauungsfördernde Wirkung von Digestifs ist schwach — aber die psychologische und kulturelle Wirkung des entspannten Abschluss-Rituals ist real."
    ),

    // ── WEINBRAND & OBSTSPIRITUOSEN ───────────────────────────────────────────

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist 'Grappa' und aus welchem Rohmaterial wird sie hergestellt?",
        answerA = "Grappa ist eine italienische Spirituose aus Trester — den gepressten Traubenschalen, Kernen und Stielen nach der Weinherstellung",
        answerB = "Grappa ist ein gereinigter Traubenwein-Destillat aus Norditalien",
        answerC = "Grappa ist identisch mit Cognac, wird aber in der Lombardei produziert",
        answerD = "Grappa ist ein Tresterbrand aus getrockneten Weintrauben, ähnlich wie Amarone-Wein",
        correctAnswer = 0,
        explanation = "Grappa ist eine geschützte italienische Spirituose (g.g.A.), die ausschließlich in Italien aus Vinacce (Trester) hergestellt wird — den festen Rückständen der Weinpressung: Schalen, Kerne, Stiele. Dieser Trester wird vergoren und destilliert. Die Ursprungsbezeichnung ist EU-weit geschützt.",
        difficulty = 4,
        funFact = "Marc de Bourgogne (Frankreich), Orujo (Spanien) und Tsikoudia (Griechenland/Kreta) sind ähnliche Tresterspirituosen — dürfen aber nicht Grappa heißen. Jede hat ihren eigenen regionalen Charakter."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Was ist 'Calvados' und welche geografischen Anforderungen gelten für seine Produktion?",
        answerA = "Calvados ist ein Apfelbrand ausschließlich aus der Normandie (Frankreich) mit kontrollierter Ursprungsbezeichnung, der aus vergorenem Apfelwein (Cidre) destilliert wird",
        answerB = "Calvados ist ein spanischer Apfellikör aus Asturien mit mindestens 30 % Alkohol",
        answerC = "Calvados ist eine britische Bezeichnung für jeden Apfelbrand aus Westeuropa",
        answerD = "Calvados ist ein belgischer Apfel-Birnen-Mischbrand ohne geschützte Herkunftsbezeichnung",
        correctAnswer = 1,
        explanation = "Calvados ist ein Apfelbrand mit Appellation d'Origine Contrôlée (AOC) und darf ausschließlich im Département Calvados und angrenzenden Teilen der Normandie hergestellt werden. Er wird aus fermentiertem Apfel- und manchmal Birnenwein (Cidre/Poiré) destilliert und muss mindestens 2 Jahre in Eichenfässern reifen.",
        difficulty = 4,
        funFact = "Die Normandie hat über 200 offiziell zugelassene Apfelsorten für Calvados — von sauer bis süß, von herb bis aromatisch. Ein guter Calvados enthält oft Äpfel aus 20–30 verschiedenen Sorten."
    ),

    // ── VODKA & AQUAVIT ──────────────────────────────────────────────────────

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welche Rohstoffe sind nach EU-Recht für die Vodka-Herstellung zugelassen — und welche Qualitätsunterschiede ergeben sich daraus?",
        answerA = "Nur Getreide (Weizen, Roggen) oder Kartoffeln; andere Rohstoffe müssen als 'Vodka aus ...' gekennzeichnet werden",
        answerB = "Alle fermentierbaren Rohstoffe sind erlaubt, müssen aber bei nicht-Getreide-/Kartoffelursprung deklariert werden",
        answerC = "Nur Roggen aus Polen oder Russland darf als 'Vodka' bezeichnet werden",
        answerD = "Nur Wasser und Alkohol aus Zuckerrohr werden verwendet, da alle anderen Aromen per Destillation entfernt werden",
        correctAnswer = 2,
        explanation = "Nach EU-Spirituosenverordnung (2019) darf Vodka aus Getreide, Kartoffeln oder anderen landwirtschaftlichen Rohstoffen hergestellt werden. Vodka aus anderen Rohstoffen (z.B. Zuckerrüben, Melasse) muss jedoch mit dem Zusatz 'hergestellt aus ...' gekennzeichnet werden — eine Regelung, die nach dem Streit zwischen osteuropäischen Produzenten und westeuropäischen Großkonzernen eingeführt wurde.",
        difficulty = 4,
        funFact = "Der 'Vodka Belt' (Polen, Russland, Schweden, Finnland, baltische Staaten) kämpfte jahrelang um diese Kennzeichnungspflicht — sie sollten verhindern, dass billiger Zuckerrohr-Alkohol als hochwertige Getreide-Vodka verkauft wird."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist 'Aquavit' und welches Botanical ist für ihn definierend?",
        answerA = "Aquavit ist eine skandinavische Spirituose, die immer mit Kümmel oder Dill aromatisiert sein muss",
        answerB = "Aquavit ist ein dänischer Kräuterlikör auf Kartoffelbasis mit Anis als Hauptaromat",
        answerC = "Aquavit ist ein nordischer Gin-Ersatz aus Gerste mit Wacholderbeeren",
        answerD = "Aquavit ist ein isländischer Destillat aus fermentiertem Birkenholz",
        correctAnswer = 3,
        explanation = "Aquavit (lateinisch 'aqua vitae' — Wasser des Lebens) ist eine skandinavische Spirituose, die immer mit Kümmel (Carum carvi) oder Dill aromatisiert sein muss — das ist gesetzlich vorgeschrieben. Er wird aus Kartoffeln oder Getreide destilliert und kann unvergoren (jung) oder gereift in Holzfässern abgefüllt werden.",
        difficulty = 4,
        funFact = "Linie Aquavit aus Norwegen macht eine traditionelle Reise über den Äquator in Sherryfässern auf einem Schiff — die Bewegung und Temperaturwechsel sollen das Holzaroma besonders gut in den Schnaps einarbeiten."
    ),

    // ── WHISKEY-STILE WELTWEIT ────────────────────────────────────────────────

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Was muss ein 'Bourbon' erfüllen, um diesen Namen tragen zu dürfen?",
        answerA = "Er muss in den USA aus mindestens 51 % Mais destilliert, in neuen, ausgekohlten Eichenfässern gereift und ohne Farbstoff- oder Aromastoff-Zusatz abgefüllt werden",
        answerB = "Er muss mindestens 2 Jahre im Bourbon County, Kentucky, reifen",
        answerC = "Er muss aus 100 % Mais bestehen und mindestens 4 Jahre in Kentucky reifen",
        answerD = "Er muss im Bundesstaat Kentucky produziert werden und mindestens 40 % Alkohol haben",
        correctAnswer = 0,
        explanation = "Bourbon muss: (1) in den USA produziert werden, (2) aus mindestens 51 % Mais bestehen (Rest meist Roggen oder Weizen und Malzgerste), (3) auf maximal 80 % vol. destilliert werden, (4) auf maximal 62,5 % vol. in neue, tiefgekohlte Eichenfässer gefüllt werden, (5) mit mindestens 40 % vol. abgefüllt werden. Eine Mindestreifezeit gibt es nicht — nur 'Straight Bourbon' muss mindestens 2 Jahre reifen.",
        difficulty = 4,
        funFact = "Entgegen der verbreiteten Meinung muss Bourbon NICHT aus Kentucky kommen — er kann in jedem US-Bundesstaat produziert werden. Etwa 95 % kommen aber dennoch aus Kentucky."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist die japanische Whisky-Tradition — und welche schottischen Elemente wurden bei der Gründung von Japans erster Destillerie übernommen?",
        answerA = "Masataka Taketsuru studierte 1919 Destillation in Schottland und brachte das Know-how nach Japan; Suntory gründete 1923 die erste japanische Destillerie in Yamazaki",
        answerB = "Japan übernahm die irische Destillationstradition durch amerikanische GIs nach dem Zweiten Weltkrieg",
        answerC = "Japans Whisky-Tradition entstand unabhängig aus lokaler Sake-Brennerei, ohne ausländischen Einfluss",
        answerD = "Amerikanische Bourbon-Produzenten gründeten 1930 die erste japanische Destillerie in Kyoto",
        correctAnswer = 1,
        explanation = "Masataka Taketsuru reiste 1919 nach Schottland, um Chemie zu studieren, lernte aber in mehreren Destillerien die Whisky-Produktion. Er heiratete eine Schottin (Rita Cowan) und kehrte mit dem Wissen zurück. Zusammen mit Shinjiro Torii gründete er Yamazaki (1923), Japans erste Malt-Whisky-Destillerie — Taketsuru gründete später Nikka.",
        difficulty = 4,
        funFact = "Japanischer Whisky gewann ab den 2000er Jahren internationale Preise und machte Scotch-Produzenten ernsthafte Konkurrenz. Heute sind Yamazaki und Nikka weltweit begehrte Raritäten."
    ),

    // ── BIER: STILE & HERSTELLUNG ─────────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'obergärig' vs. 'untergärig' bei Bier?",
        answerA = "Obergärige Hefen arbeiten bei 15–22 °C und steigen an die Oberfläche (Ales); untergärige Hefen arbeiten bei 6–12 °C und sinken ab (Lager)",
        answerB = "Obergärung ist die erste Gärung in offenen Behältern; Untergärung ist die zweite Gärung in geschlossenen Tanks",
        answerC = "Obergärig bedeutet, das Bier gärt bei hohem Druck; untergärig bei normalem Luftdruck",
        answerD = "Obergärig bezeichnet hell-farbige Biere; untergärig dunkel-farbige Biere",
        correctAnswer = 2,
        explanation = "Obergärige Hefen (Saccharomyces cerevisiae) fermentieren bei wärmeren Temperaturen (15–22 °C) und sammeln sich an der Oberfläche — sie erzeugen Ales wie Weizenbier, Stout oder Pale Ale. Untergärige Hefen (S. pastorianus) fermentieren kalt (6–12 °C) und setzen sich am Boden ab — sie erzeugen Lagerbiere. Die Technik der untergärigen Gärung setzte sich erst im 19. Jahrhundert mit Kühltechnik durch.",
        difficulty = 4,
        funFact = "Über 90 % des weltweit konsumierten Biers sind Lagerbiere — also untergärig. Die riesige Craft-Beer-Bewegung hat Ales (obergärig) jedoch stark revitalisiert."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Imperial Stout' und woher kommt der Name?",
        answerA = "Ein starkes, dunkel-malziges Bier, das ursprünglich für den russischen Zarenhof gebraut wurde und einen Alkoholgehalt von typisch 8–12 % hat",
        answerB = "Ein österreichisches Stout, das dem Kaiserhaus Habsburg serviert wurde",
        answerC = "Ein britisches Hof-Bier mit besonders viel Hopfen, das speziell für Queen Victoria gebraut wurde",
        answerD = "Ein dunkles Lagerbier aus Bayern, das beim Kaiserempfang in Berlin getrunken wurde",
        correctAnswer = 3,
        explanation = "Imperial Stout (auch Russian Imperial Stout) wurde von britischen Brauereien im 18. Jahrhundert für den russischen Zarenhof gebraut. Da das Bier die langen Seereisen von England nach St. Petersburg überstehen musste, wurde es stark eingebraut (viel Malz und Hopfen) — was einen Alkoholgehalt von 8–12 % und außergewöhnliche Haltbarkeit ergab.",
        difficulty = 4,
        funFact = "Zarin Katharina die Große soll ein Fan dieser starken britischen Stouts gewesen sein. Die Brauerei Barclay Perkins in London war der wichtigste Lieferant für den Zarenhof."
    ),

    // ── WEIN & SCHAUMWEIN ────────────────────────────────────────────────────

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Méthode Champenoise' (traditionelle Methode) bei der Schaumweinherstellung?",
        answerA = "Ein Verfahren, bei dem dem Grundwein in der Flasche Zucker und Hefe zugefügt werden, die zweite Gärung in der Flasche stattfindet und der Druck dauerhaft in der Flasche verbleibt",
        answerB = "Ein Verfahren, bei dem Kohlensäure direkt in fertigem Wein unter Druck eingelöst wird",
        answerC = "Ein Verfahren, bei dem die zweite Gärung in großen Drucktanks (Autoclaves) stattfindet",
        answerD = "Ein Verfahren, bei dem Champagner aus einer einzigen Traubenprüfung ohne Assemblage produziert wird",
        correctAnswer = 0,
        explanation = "Bei der traditionellen Methode (Méthode champenoise) wird dem Grundwein in der Flasche eine 'Fülldosage' aus Zucker und Hefe zugefügt. Die zweite Gärung erfolgt in derselben Flasche — der entstehende CO₂ kann nicht entweichen und löst sich im Wein. Nach der Reifung auf der Hefe wird die Hefe durch 'Rütteln' (Remuage) in den Flaschenhals bewegt und dann als gefrorenes Pfropfen (Dégorgement) entfernt.",
        difficulty = 4,
        funFact = "Veuve Clicquot soll um 1816 das Rüttelpult (Pupitre) erfunden haben — ein schräger Holzrahmen, in dem die Flaschen täglich von Hand gedreht und geneigt werden, um die Hefe in den Flaschenhals zu bewegen."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was ist 'Solera' und für welche Spirituosen- und Weinarten wird dieses System eingesetzt?",
        answerA = "Ein Fraktioniersystem aus mehreren Fassebenen, bei dem älterer Inhalt schrittweise mit jüngerem vermischt wird; wird bei Sherry, Manzanilla, Brandy de Jerez und manchem Rum eingesetzt",
        answerB = "Ein spanisches Kühllagerungssystem für Weißwein bei konstant 12 °C",
        answerC = "Ein Verfahren zur Herstellung von Cava durch dreifache Destillation des Grundweins",
        answerD = "Ein Eichenfasstyp aus südspanischer Korkeiche, der speziell für Sherry verwendet wird",
        correctAnswer = 1,
        explanation = "Das Solera-System besteht aus mehreren Fassreihen übereinander (Criaderas), wobei die unterste Reihe (Solera) den ältesten Wein/Spirituose enthält. Beim Abfüllen wird nie die gesamte Menge entnommen — der Rest wird mit der nächstjüngeren Reihe aufgefüllt. Dadurch enthält jede Abfüllung eine Mischung aus Jahrgängen, und der Charakter bleibt konstant.",
        difficulty = 4,
        funFact = "Manche Solera-Systeme für Sherry und Brandy de Jerez laufen seit dem 19. Jahrhundert — theoretisch enthält jede Flasche also einen winzigen Tropfen Wein aus dem Gründungsjahr."
    ),

    // ── COCKTAIL-TECHNIK & BARTENDER-HANDWERK ─────────────────────────────────

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Barman-Begriff 'Muddling' und bei welchen klassischen Cocktails ist es essenziell?",
        answerA = "Das Zerdrücken frischer Kräuter, Früchte oder Zucker im Glas mit einem Stößel (Muddler), um Aromen und Säfte freizusetzen; essenziell bei Mojito und Caipirinha",
        answerB = "Das schnelle Schütteln von Cocktails mit Eis in einem Shaker zur Kühlung und Vermischung",
        answerC = "Das Flambieren von Spirituosen über einem Cocktail zur Aromaübertragung",
        answerD = "Das langsame Rühren eines Cocktails am Eis zur Verdünnung ohne Schütteln",
        correctAnswer = 2,
        explanation = "Muddling bezeichnet das Zerdrücken fester Zutaten — meist frische Kräuter (Minze beim Mojito), Limettenspalten (Caipirinha) oder Zuckerwürfel mit Bitters (Old Fashioned) — mit einem Muddler im Glas oder Shaker. Durch Druck werden ätherische Öle, Säfte und Aromen freigesetzt, ohne die Zutaten zu zermahlen.",
        difficulty = 4,
        funFact = "Beim Mojito gilt: Nicht zu fest muddeln! Zu starkes Zerdrücken der Minze setzt Chlorophyll frei, das bitter schmeckt. Ziel ist, die ätherischen Öle aus den Zellmembranen zu lösen, nicht die Pflanze zu zerstören."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Shaken' und 'Stirred' bei Cocktails — und wann wird welche Methode verwendet?",
        answerA = "Shaken wird für Cocktails mit Fruchtsäften, Eiweißen oder Sahne verwendet (kühlt stärker, vermischt besser, fügt etwas Luft hinzu); Stirred für spirituosenreine Drinks wie Martini oder Manhattan (mehr Klarheit, weniger Verdünnung)",
        answerB = "Shaken ist immer schneller als Stirred und wird daher in der Praxis bevorzugt",
        answerC = "Stirred wird für alle Heißgetränke; Shaken für alle Kaltgetränke verwendet",
        answerD = "Shaken und Stirred sind gleichwertig — die Wahl ist reine Präsentation",
        correctAnswer = 3,
        explanation = "Die klassische Barman-Regel: Cocktails mit Fruchtsäften, Sirup, Liqueuren, Eiweißen oder Sahne werden geshaken — das emulgiert die Zutaten und schafft Textur. Rein spirituosenbasierte Drinks (Martini, Manhattan, Negroni) werden gerührt — das kühlt und verdünnt kontrolliert, ohne übermäßig Luft und Eis-Splitter einzubringen.",
        difficulty = 4,
        funFact = "James Bonds 'geschüttelter, nicht gerührter' Martini ist aus Bartender-Sicht eine Fehlzubereitung — ein echter Dry Martini wird immer gerührt. Aber Bond ist nun mal kein Barmann."
    ),

    // ── WEIN: WEINBAU & BESONDERE STILE ──────────────────────────────────────

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Eiswein' und welche besonderen klimatischen Bedingungen sind für seine Herstellung nötig?",
        answerA = "Die Trauben müssen am Stock gefroren (-8 °C oder kälter) geerntet und im gefrorenen Zustand gepresst werden; das Wasser bleibt als Eis zurück, der konzentrierte Saft ergibt intensiv süße Weine",
        answerB = "Ein Weißwein, der im Fass bei 0 °C gelagert wird, um Bitterstoffe auszufällen",
        answerC = "Ein Wein aus Trauben, die nach der Ernte in Gefriertruhen eingefroren wurden",
        answerD = "Ein Rosé-Wein, der durch schnelles Abkühlen nach der Gärung hergestellt wird",
        correctAnswer = 0,
        explanation = "Für echten Eiswein (Eiswein QmP in Deutschland/Österreich) müssen die Trauben natürlich am Rebstock gefrieren — bei mindestens -8 °C. Das Wasser in den Beeren gefriert, während der Zucker und die Säuren flüssig bleiben. Beim Pressen im gefrorenen Zustand wird nur der konzentrierte, zuckerreiche Saft gewonnen. Erträge sind winzig.",
        difficulty = 4,
        funFact = "Eiswein ist oft das Ergebnis eines Glücksspiels — Winzer warten bis in den tiefen Winter und riskieren, dass Vogelfraß, Fäulnis oder zu mildes Wetter die Ernte vernichten. In manchen Jahren gibt es gar keinen Eiswein."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was ist 'Botrytis cinerea' und welche Rolle spielt sie bei der Herstellung von Süßweinen wie Sauternes oder Trockenbeerenauslese?",
        answerA = "Botrytis cinerea ist ein Schimmelpilz ('Edelfäule'), der unter bestimmten Bedingungen Trauben schrumpfen lässt und dabei den Zucker extrem konzentriert",
        answerB = "Botrytis cinerea ist eine Hefespezies, die die Fermentation von Süßweinen einleitet",
        answerC = "Botrytis cinerea ist eine nützliche Bakterienart, die Milchsäure in Weinen abbaut",
        answerD = "Botrytis cinerea ist ein Insekt, das die Traubenschale ansticht und so Traubeneintrocknung beschleunigt",
        correctAnswer = 1,
        explanation = "Botrytis cinerea ist ein Schimmelpilz, der unter bestimmten Feuchte- und Wärme-Bedingungen als 'Edelfäule' (noble rot) die Traubenhäute durchdringt, Wasser verdunstet und dadurch Zucker, Säuren und Aromastoffe extrem konzentriert. Aus solchen Trauben entstehen die berühmtesten Süßweine der Welt: Sauternes, Trockenbeerenauslese, Tokay Aszú.",
        difficulty = 4,
        funFact = "Für eine Flasche Sauternes Premiers Crus werden oft nur wenige einzeln handverlesene Traubenbeeren verwendet — der Aufwand erklärt den Preis von Château d'Yquem (200–500 € pro Flasche und mehr)."
    ),

    // ── LIKÖR & LIQUER ───────────────────────────────────────────────────────

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was ist der rechtliche Unterschied zwischen 'Spirituose' und 'Likör' in der EU?",
        answerA = "Spirituosen haben keinen Mindestzuckergehalt; Liköre müssen mindestens 100 g/l Zucker enthalten und haben einen Mindestalkoholgehalt von 15 % vol.",
        answerB = "Spirituosen müssen destilliert werden; Liköre dürfen nur durch Mazeration hergestellt werden",
        answerC = "Spirituosen müssen mindestens 40 % Alkohol haben; Liköre höchstens 30 % Alkohol",
        answerD = "Spirituosen können Farbstoffe enthalten; Liköre sind per Gesetz farbstofffrei",
        correctAnswer = 2,
        explanation = "Nach EU-Spirituosenverordnung sind Liköre eine Kategorie von Spirituosen mit mindestens 15 % vol. Alkohol und einem Zuckergehalt von mindestens 100 g/l (bei einigen Typen wie Gentian nur 80 g/l). Spirituosen als Oberbegriff schließen alle destillierten alkoholischen Getränke ein — auch ohne Zuckerzusatz.",
        difficulty = 4,
        funFact = "Crème de Cassis (schwarze Johannisbeere) muss laut EU sogar mindestens 400 g/l Zucker enthalten. Triple Sec/Cointreau gilt als Orangenlikör mit ca. 100 g/l Zucker."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Was ist 'Chartreuse' und was macht sie historisch und geschmacklich besonders?",
        answerA = "Chartreuse ist ein französischer Kräuterlikör, der seit 1737 von Kartäusermönchen nach einem geheimen Rezept mit 130 Kräutern hergestellt wird; in Grün (55 % vol.) und Gelb (40 % vol.)",
        answerB = "Chartreuse ist ein belgischer Kräuterbitter aus dem Kloster Grande Chartreuse mit nur 5 Zutaten",
        answerC = "Chartreuse ist ein schweizer Absinth mit besonders hohem Thujon-Gehalt",
        answerD = "Chartreuse ist ein Cognac-basierter Digestif aus der Charente-Region mit geschützter Ursprungsbezeichnung",
        correctAnswer = 3,
        explanation = "Chartreuse wird im Kloster La Grande Chartreuse in den Alpen (nahe Grenoble) von Kartäusermönchen (Chartreux) hergestellt. Das geheime Rezept aus 130 Kräutern und Pflanzen soll seit 1737 unverändert sein. Grüne Chartreuse (55 % vol.) ist kräftiger und pflanzlicher, gelbe Chartreuse (40 % vol.) süßer und honigartiger.",
        difficulty = 4,
        funFact = "Nur zwei Mönche des Ordens kennen gleichzeitig das vollständige Chartreuse-Rezept. Das Kloster wurde mehrfach verboten und die Mönche ins Exil getrieben — das Rezept überlebte in Tarragona (Spanien), wo sie weiterproduzierten."
    ),

    // ── COCKTAILWETTBEWERBE & MODERNE MIXOLOGIE ───────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Molecular Mixology' und welche Techniken aus der Molekulargastronomie werden dabei eingesetzt?",
        answerA = "Molecular Mixology wendet Techniken wie Spherification, Gelification (Agar-Agar/Gellan), Sous-vide-Infusion und flüssigen Stickstoff an, um Cocktail-Zutaten zu transformieren",
        answerB = "Molecular Mixology bedeutet ausschließlich die chemische Analyse von Cocktail-Inhaltsstoffen im Labor",
        answerC = "Molecular Mixology ist ein Marketingbegriff für Pre-Batched-Cocktails ohne frische Zutaten",
        answerD = "Molecular Mixology bezeichnet den Trend zu alkoholarmen Cocktails unter 10 % Alkohol",
        correctAnswer = 0,
        explanation = "Molecular Mixology überträgt Techniken der Molekulargastronomie auf Cocktails: Spherification (Flüssigkeiten in kaviarähnliche Kugeln mit Natriumalginat), Gelification (Agar-Agar-Gels), Schäume (mit Lecithin), flüssiger Stickstoff für Instant-Gefriertechniken und Sous-vide-Infusionen für intensivere Aromaauszüge. Pioniere waren Ferran Adrià und Barkeeper wie Tony Conigliaro.",
        difficulty = 4,
        funFact = "Der 'Nitro Martini' — bei Tischseite mit flüssigem Stickstoff gefrorener Martini — wurde 2000er-Jahre Symbol für Molecular Mixology. Heute gelten viele dieser Techniken als überholt — die Rückbesinnung auf Klassiker ist die aktuelle Gegenbewegung."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Highball' Cocktail und welche Zutaten definieren ihn strukturell?",
        answerA = "Eine Spirituose mit einem großen Anteil nicht-alkoholischer Flüssigkeit (oft Soda, Ginger Beer oder Tonic Water) in einem hohen Glas über viel Eis",
        answerB = "Ein zweischichtiger Cocktail, bei dem schwerere Zutaten am Boden und leichtere an der Oberfläche schwimmen",
        answerC = "Ein Cocktail mit ausschließlich hochprozentigen Spirituosen ohne Mixer",
        answerD = "Ein historischer Begriff für Cocktails, die in einem Stehausschank ('Highball Saloon') getrunken wurden",
        correctAnswer = 1,
        explanation = "Ein Highball ist strukturell einfach: eine Spirituose (z.B. Whisky, Gin, Vodka) mit einer größeren Menge nicht-alkoholischen Mixers (Soda Water, Ginger Beer, Tonic Water, Cola) in einem hohen Glas über reichlich Eis. Klassische Highballs: Whisky Soda, Gin & Tonic, Moscow Mule, Gin Fizz. Das hohe Verhältnis von Mixer zu Spirituose (oft 1:3 bis 1:5) macht ihn erfrischend und trinkerfreundlich.",
        difficulty = 4,
        funFact = "In Japan ist der 'Whisky Highball' (Haibōru) ein kulturelles Phänomen: Bars servieren ihn mit speziellen Highball-Automaten, perfektionierten Eiswürfeln und stark gekühlten Gläsern — eine eigene Kunstform."
    )

)
