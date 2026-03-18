package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsEasy5(): List<Question> = listOf(

    // ─── SPORTMASKOTTCHEN / LOGOS (7) ─────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie heisst das offizielle Maskottchen der Olympischen Sommerspiele 1972 in Muenchen?",
        answerA = "Waldi",
        answerB = "Cobi",
        answerC = "Izzy",
        answerD = "Miga",
        correctAnswer = 0,
        explanation = "Waldi, ein bunter Dackel, war das erste offizielle Maskottchen der Olympischen Sommerspiele – eingeführt 1972 in Muenchen.",
        difficulty = 1,
        funFact = "Waldi war so beliebt, dass der Streckenplan des Marathons in Muenchen in Form eines Dackels auf der Karte eingezeichnet wurde."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Tier ist das Maskottchen des FC Bayern Muenchen?",
        answerA = "Loewe",
        answerB = "Adler",
        answerC = "Baer",
        answerD = "Fuchs",
        correctAnswer = 0,
        explanation = "Der Loewe ist das Wappentier des FC Bayern Muenchen – er steht fuer Staerke und Mut.",
        difficulty = 1,
        funFact = "Das offizielle Maskottchen des FC Bayern heisst 'Berni der Bayer' – ein Loewe in den Vereinsfarben Rot und Weiss."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche drei Farben hat das Logo der Olympischen Ringe zusammen mit Weiss und Schwarz?",
        answerA = "Rot, Blau, Gruen",
        answerB = "Blau, Gelb, Gruen",
        answerC = "Rot, Gelb, Blau",
        answerD = "Gruen, Orange, Lila",
        correctAnswer = 1,
        explanation = "Die fuenf olympischen Ringe sind blau, gelb, schwarz, gruen und rot auf weissem Grund – zusammen repraesentieren sie alle Kontinente.",
        difficulty = 1,
        funFact = "Das olympische Ringlogo wurde 1913 von Baron Pierre de Coubertin entworfen – jede Farbe findet sich in mindestens einer Nationalflagge der Welt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst das Maskottchen der FIFA Fussball-WM 2006 in Deutschland?",
        answerA = "Footix",
        answerB = "Goleo VI",
        answerC = "Striker",
        answerD = "Tip und Tap",
        correctAnswer = 1,
        explanation = "Goleo VI war das offizielle Maskottchen der WM 2006 in Deutschland – ein Loewe im DFB-Trikot mit einem sprechenden Fussball namens Pille.",
        difficulty = 1,
        funFact = "Goleo VI war umstritten, weil er keine Hose trug – was in manchen Laendern fuer Aufsehen sorgte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportmarke hat das beruemte 'Swoosh'-Logo?",
        answerA = "Adidas",
        answerB = "Puma",
        answerC = "Nike",
        answerD = "Reebok",
        correctAnswer = 2,
        explanation = "Der 'Swoosh' ist das ikonische Logo von Nike – ein einfacher Haken, der Bewegung und Geschwindigkeit symbolisiert.",
        difficulty = 1,
        funFact = "Das Nike-Swoosh-Logo wurde 1971 von der Designstudentin Carolyn Davidson fuer nur 35 Dollar entworfen – heute ist es eines der wertvollsten Logos der Welt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst das Maskottchen des Deutschen Fussball-Bundes (DFB)?",
        answerA = "Paul der Adler",
        answerB = "Fritz der Loewe",
        answerC = "Paule",
        answerD = "Der DFB hat kein eigenes Maskottchen",
        correctAnswer = 3,
        explanation = "Der DFB hat kein permanentes eigenes Maskottchen – bei Turnieren werden eigene WM- oder EM-Maskottchen verwendet.",
        difficulty = 1,
        funFact = "Fuer die Heim-EM 2024 in Deutschland wurde 'Albärt' – ein Baer mit Fussbällen als Hinterhauptmuster – als offizielles Turniermaskottchen eingefuehrt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportmarke hat drei parallele Streifen als Logo?",
        answerA = "Nike",
        answerB = "Adidas",
        answerC = "Under Armour",
        answerD = "New Balance",
        correctAnswer = 1,
        explanation = "Die drei parallelen Streifen sind das Erkennungszeichen von Adidas – sie symbolisieren einen Berg, den es zu ueberqueren gilt.",
        difficulty = 1,
        funFact = "Adidas-Gruender Adi Dassler naehte urspruenglich drei Lederstreifen um Sportschuhe, um sie zu stabilisieren – das wurde sein Markenzeichen."
    ),

    // ─── SPORT UND WETTER (6) ─────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Bei welcher Temperatur wird ein Fussballspiel in Deutschland in der Regel abgebrochen?",
        answerA = "Wenn es unter -10 Grad Celsius ist",
        answerB = "Es gibt keine Regeltemperatur – das entscheidet der Schiedsrichter",
        answerC = "Wenn der Platz gefroren ist und der Ball nicht springt",
        answerD = "Beim Frost unter 0 Grad wird immer abgebrochen",
        correctAnswer = 1,
        explanation = "Es gibt keine feste Abbruchtemperatur im Fussball – der Schiedsrichter entscheidet, ob ein Spielfeld bespielbar ist.",
        difficulty = 1,
        funFact = "Das kaelteste jemals ausgetragene WM-Spiel fand 1994 in den USA statt – in Pontiac (Michigan) spielten Teams trotz arktischer Aussentemperaturen in der Klimaanlage der Halle."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportart profitiert direkt vom Wind als Antrieb?",
        answerA = "Segeln",
        answerB = "Bogenschiessen",
        answerC = "Rudern",
        answerD = "Schwimmen",
        correctAnswer = 0,
        explanation = "Segeln nutzt die Windkraft als primaeren Antrieb – die Segelflaeche faengt den Wind auf und treibt das Boot vorwaerts.",
        difficulty = 1,
        funFact = "Segeln ist eine der wenigen Sportarten, bei der Wetterverhaeltnisse direkt taktisch genutzt werden – gute Skipper 'lesen' den Wind Minuten im Voraus."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportart wird bei starkem Regen in der Regel unterbrochen oder verschoben?",
        answerA = "Tennis auf Rasen",
        answerB = "Schwimmen im Freibad",
        answerC = "Basketball in der Halle",
        answerD = "Boxen im Ring",
        correctAnswer = 0,
        explanation = "Tennis auf Rasenplaetzen (wie Wimbledon) muss bei Regen unterbrochen werden, da nasser Rasen rutschig und nicht bespielbar ist.",
        difficulty = 1,
        funFact = "Wimbledon hat seit 2009 ein Dach ueber dem Centre Court – seitdem koennen Spiele auch bei Regen ohne Unterbrechung fortgesetzt werden."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Schneechaos' beim Ski-Weltcup?",
        answerA = "Zu viel Neuschnee macht die Strecke unfahrbar und das Rennen muss abgesagt werden",
        answerB = "Ein Ski-Stunt in starkem Schneefall",
        answerC = "Eine besondere Schnee-Kurve auf der Rennstrecke",
        answerD = "Der Start mehrerer Fahrer gleichzeitig im Schneefall",
        correctAnswer = 0,
        explanation = "Beim Ski-Weltcup kann zu viel Neuschnee, Nebel oder Schneefall die Sicht so sehr einschraenken, dass Rennen abgesagt oder verschoben werden muessen.",
        difficulty = 1,
        funFact = "Organisatoren von Skirennen pruefen die Strecke jeden Morgen – manchmal wird ein Rennen erst kurz vor dem Start abgesagt, weil das Wetter umgeschlagen ist."
    ),

    Question(
        categoryId = 6,
        questionText = "Warum ist Hoehenlage (z.B. Mexico City) fuer Laeufer aus dem Flachland ein Problem?",
        answerA = "Es ist dort kaelter",
        answerB = "Der Luftdruck ist niedriger, daher weniger Sauerstoff beim Atmen",
        answerC = "Die Strecken sind laenger",
        answerD = "Es regnet dort oefter",
        correctAnswer = 1,
        explanation = "In grossen Hoehenlagen ist der Luftdruck niedriger – das bedeutet weniger Sauerstoff pro Atemzug, was die Ausdauerleistung stark beeintraechtigt.",
        difficulty = 1,
        funFact = "Die Olympischen Spiele 1968 in Mexico City (2.240 m Hoehe) gelten als Hoehenlage-Spiele – ostafrikanische Laeufer dominierten die Mittel- und Langstreckenwettbewerbe."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportart wird ausschliesslich auf Eis oder Schnee betrieben?",
        answerA = "Biathlon",
        answerB = "Modernen Fuenfkampf",
        answerC = "Triathlon",
        answerD = "Leichtathletik",
        correctAnswer = 0,
        explanation = "Biathlon verbindet Langlaufski auf Schnee mit Schiessen – ohne Schnee ist diese Wintersportart nicht moeglich.",
        difficulty = 1,
        funFact = "Biathlon hat seine Wurzeln im militaerischen Training – norwegische Soldaten uebten auf Skiern zu schiessen, was zum Wettkampfsport wurde."
    ),

    // ─── FAMILIEN IM SPORT (7) ────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche beruemte Tennisspielerin ist die juengere Schwester von Venus Williams?",
        answerA = "Maria Scharapowa",
        answerB = "Serena Williams",
        answerC = "Martina Navratilova",
        answerD = "Steffi Graf",
        correctAnswer = 1,
        explanation = "Serena Williams ist die juengere Schwester von Venus Williams – beide wurden von ihrem Vater Richard Williams zu Weltklasse-Tennisspielerinnen ausgebildet.",
        difficulty = 1,
        funFact = "Venus und Serena Williams standen insgesamt 30 Mal im Finale gegeneinander – Serena gewann die meisten dieser Finals."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer ist der beruemte Vater des Formel-1-Weltmeisters Nico Rosberg?",
        answerA = "Michael Schumacher",
        answerB = "Keke Rosberg",
        answerC = "Alain Prost",
        answerD = "Ayrton Senna",
        correctAnswer = 1,
        explanation = "Nico Rosbergs Vater ist Keke Rosberg, der 1982 selbst Formel-1-Weltmeister wurde – damit sind sie eines der wenigen Vater-Sohn-Weltmeisterpaare.",
        difficulty = 1,
        funFact = "Nico Rosberg trat 2016 nach seinem WM-Titel ueberraschend zurueck – er wollte mehr Zeit mit seiner Familie verbringen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche zwei Becker-Brüder spielten beide professionell Tennis?",
        answerA = "Boris Becker und sein Bruder Andreas Becker",
        answerB = "Boris Becker und Michael Becker",
        answerC = "Boris Becker und sein Sohn Elias Becker",
        answerD = "Es gibt keine Becker-Brueder im Tennis",
        correctAnswer = 0,
        explanation = "Boris Becker und sein aelterer Bruder Andreas Becker spielten beide Tennis auf Profiniveau – allerdings war Boris der weltberuehmtere der beiden.",
        difficulty = 1,
        funFact = "Boris Becker wurde 1985 als erster Ungesetzter Wimbledonsieger – mit nur 17 Jahren war er der juengste Sieger der Wimbledon-Geschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher beruemte Fussballspieler ist der Vater von Romeo Beckham?",
        answerA = "Wayne Rooney",
        answerB = "Steven Gerrard",
        answerC = "David Beckham",
        answerD = "Gary Neville",
        correctAnswer = 2,
        explanation = "Romeo Beckham ist der Sohn von Fussball-Ikone David Beckham und der Saengerin Victoria Beckham (frueheres Spice Girl).",
        difficulty = 1,
        funFact = "Alle vier Beckham-Kinder – Brooklyn, Romeo, Cruz und Harper – sind regelmaessig in der Oeffentlichkeit und folgen unterschiedlichen Karrieren."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Familie dominierte den Ski-Alpin-Weltcup in Oesterreich ueber Jahrzehnte?",
        answerA = "Die Familie Mayer",
        answerB = "Die Familie Hirscher",
        answerC = "Die Familie Vonn",
        answerD = "Die Familie Eberharter",
        correctAnswer = 1,
        explanation = "Marcel Hirscher, der groesste Slalom- und Gesamtweltcup-Sieger der Geschichte, wurde von seinem Vater Ferdinand Hirscher trainiert und unterstuetzt.",
        difficulty = 1,
        funFact = "Marcel Hirscher gewann acht Gesamtweltcups in Folge (2012–2019) – ein bis heute unerreichter Rekord im alpinen Skirennsport."
    ),

    Question(
        categoryId = 6,
        questionText = "Was verbindet die Familie Manning im American Football?",
        answerA = "Archie Manning war NFL-Profi und seine Soehne Peyton und Eli auch",
        answerB = "Alle drei spielten beim gleichen Team",
        answerC = "Sie sind alle Super-Bowl-Coaches",
        answerD = "Sie spielen alle in der gleichen Saison",
        correctAnswer = 0,
        explanation = "Archie Manning spielte in der NFL, und seine Soehne Peyton und Eli Manning wurden beide Super-Bowl-Gewinner – eine einmalige Familie im American Football.",
        difficulty = 1,
        funFact = "Peyton Manning gewann den Super Bowl mit den Indianapolis Colts (2007) und den Denver Broncos (2016) – sein Bruder Eli gewann ihn zweimal mit den New York Giants."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher beruemte Boxchampion hatte eine Tochter, die ebenfalls Boxweltmeisterin wurde?",
        answerA = "Mike Tyson",
        answerB = "Muhammad Ali",
        answerC = "Joe Frazier",
        answerD = "Evander Holyfield",
        correctAnswer = 1,
        explanation = "Muhammad Alis Tochter Laila Ali wurde ebenfalls Boxerin und gewann zahlreiche Weltmeistertitel – sie blieb in ihrer gesamten Karriere ungeschlagen.",
        difficulty = 1,
        funFact = "Laila Ali bestritt 24 Profikaempfe und gewann alle – darunter 21 durch Knockout. Sie trat 2007 zurueck, als sie Mutter wurde."
    ),

    // ─── SPORTMODE / TRIKOTS (7) ──────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche Farbe tragen die deutschen Fussballer in der Regel bei Heimspielen?",
        answerA = "Schwarz",
        answerB = "Weiss",
        answerC = "Rot",
        answerD = "Gruen",
        correctAnswer = 1,
        explanation = "Die deutsche Nationalmannschaft traegt traditionell ein weisses Heimtrikot mit schwarzen Shorts – die Farben der deutschen Nationalflagge sind Schwarz-Rot-Gold.",
        difficulty = 1,
        funFact = "Beim WM-Finale 1954 (Wunder von Bern) trugen die Deutschen weisse Trikots – seitdem ist Weiss fest als Heimfarbe verankert."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Tennisturnier schreibt den Spielern vor, fast ausschliesslich weisse Kleidung zu tragen?",
        answerA = "French Open",
        answerB = "US Open",
        answerC = "Wimbledon",
        answerD = "Australian Open",
        correctAnswer = 2,
        explanation = "Wimbledon ist fuer seine strenge Weiss-Kleiderordnung bekannt – nahezu alle Kleidungsstuecke muessen weiss sein.",
        difficulty = 1,
        funFact = "Die Wimbledon-Kleiderordnung ist so praezise, dass sogar die Unterwaesche weiss sein muss – farbige Zufrieden sieht man nur am Seitenstreifen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Trikot' im Sport?",
        answerA = "Ein spezieller Schuh fuer Fussball",
        answerB = "Das Mannschafts-Oberhemd oder die Teambekleidung",
        answerC = "Ein Schutzhelm",
        answerD = "Der Staffelstab beim Laufen",
        correctAnswer = 1,
        explanation = "Ein Trikot ist das charakteristische Teamoberteil im Sport – es traegt meist die Mannschaftsfarben, Nummer und oft den Sponsor.",
        difficulty = 1,
        funFact = "Das teuerste Fussballtrikot, das je versteigert wurde, war das von Diego Maradona beim 'Hand Gottes'-Tor gegen England 1986 – fuer ueber 9 Millionen Dollar."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Farbe hat das Trikot des Leadersam Tour de France?",
        answerA = "Rotes Trikot",
        answerB = "Blaues Trikot",
        answerC = "Gelbes Trikot",
        answerD = "Weisses Trikot",
        correctAnswer = 2,
        explanation = "Der Gesamtfuehrende der Tour de France traegt das ikonische Gelbe Trikot (Maillot Jaune) – es ist das begehrteste Trikot im Radsport.",
        difficulty = 1,
        funFact = "Das Gelbe Trikot gibt es seit 1919 – die Farbe wurde gewaehlt, weil die Zeitung L'Auto, der Veranstalter, auf gelbem Papier gedruckt wurde."
    ),

    Question(
        categoryId = 6,
        questionText = "Was steht auf dem Ruecken eines Fussballtrikots?",
        answerA = "Nur die Trikotnummer",
        answerB = "Meistens der Nachname und die Trikotnummer des Spielers",
        answerC = "Immer der Vereinsname",
        answerD = "Gar nichts",
        correctAnswer = 1,
        explanation = "Auf modernen Fussballtrikots steht in der Regel der Nachname des Spielers und seine Trikotnummer auf dem Ruecken – so koennen Fans und Schiedsrichter Spieler identifizieren.",
        difficulty = 1,
        funFact = "Rueckennummern im Fussball wurden in England 1928 erstmals eingesetzt – die WM 1954 war die erste, bei der alle Teams nummerierte Trikots trugen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Sponsor-Patch' auf einem Sporttrikot?",
        answerA = "Das Vereinswappen",
        answerB = "Der Aufnaher eines Unternehmens, das den Verein finanziert",
        answerC = "Die Trikotnummer",
        answerD = "Das Material-Etikett",
        correctAnswer = 1,
        explanation = "Sponsor-Patches oder Trikotsponsoren sind Firmenlogos auf Trikots – Unternehmen zahlen viel Geld dafuer, ihren Namen auf Spielertrikots zu praesentieren.",
        difficulty = 1,
        funFact = "Der erste Trikotsponsor in der Bundesliga war Jaegermeister beim Eintracht Braunschweig 1973 – damals war das noch sehr umstritten."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Schuhe tragen Fussballspieler auf dem Rasen?",
        answerA = "Turnschuhe mit Gummisohle",
        answerB = "Spezielle Fussballschuhe mit Stollen",
        answerC = "Leichtathletik-Spikes",
        answerD = "Normale Sportschuhe",
        correctAnswer = 1,
        explanation = "Fussballschuhe haben Stollen (Noppen) unter der Sohle – sie bieten Halt im Rasen und verhindern das Ausrutschen beim Laufen und Drehen.",
        difficulty = 1,
        funFact = "Die ersten modernen Fussballschuhe mit Schraubstollen wurden 1954 vom deutschen Schuhmacher Adolf 'Adi' Dassler (Adidas) entwickelt – die Deutschen trugen sie beim WM-Finale."
    ),

    // ─── SPORT IM FERNSEHEN (7) ───────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche Sportsendung laeuft seit Jahrzehnten am Samstagabend in der ARD?",
        answerA = "Sport aktuell",
        answerB = "Sportschau",
        answerC = "Das Aktuelle Sportstudio",
        answerD = "Arena",
        correctAnswer = 1,
        explanation = "Die Sportschau in der ARD ist eine der laengsten laufenden Sport-Fernsehsendungen Deutschlands – sie zeigt Bundesliga-Highlights am Samstag.",
        difficulty = 1,
        funFact = "Die Sportschau gibt es seit 1952 – sie war die erste regelmaeßige Sportsendung im deutschen Fernsehen und ist bis heute fester Bestandteil des Samstagabends."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Live-Stream' im Sport?",
        answerA = "Ein Kanal nur fuer Wassersportarten",
        answerB = "Die Direktuebertragung eines Sportereignisses ueber das Internet in Echtzeit",
        answerC = "Ein Replay von bereits gesendeten Spielen",
        answerD = "Ein Sportmagazin im Fernsehen",
        correctAnswer = 1,
        explanation = "Ein Live-Stream uebertraegt Sportereignisse in Echtzeit ueber das Internet – Zuschauer koennen das Spiel sofort und von ueberall verfolgen.",
        difficulty = 1,
        funFact = "Das erste grosse Live-Sportereignis im Internet war 1995 ein Baseball-Spiel der Seattle Mariners – heute wird praktisch jeder grosse Sport live gestreamt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist eine 'Zeitlupe' im Sportfernsehen?",
        answerA = "Eine besonders lange Sendung",
        answerB = "Die verlangsamte Wiederholung einer Szene fuer bessere Analyse",
        answerC = "Eine Uhr im Bildschirm",
        answerD = "Ein Countdown bis zum Spielstart",
        correctAnswer = 1,
        explanation = "Die Zeitlupe (Slow-Motion) zeigt Spielszenen in stark verlangsamter Geschwindigkeit – so koennen Tore, Fouls und technische Details besser analysiert werden.",
        difficulty = 1,
        funFact = "Erstmals wurden Zeitlupen-Wiederholungen bei den Olympischen Spielen 1964 in Tokio eingesetzt – die Technologie revolutionierte die Sportberichterstattung."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Sender uebertraegt in Deutschland die Fussball-WM seit vielen Jahren im Free-TV?",
        answerA = "Sport1",
        answerB = "ARD und ZDF",
        answerC = "Sky",
        answerD = "DAZN",
        correctAnswer = 1,
        explanation = "ARD und ZDF uebertragen die Fussball-WM seit Jahrzehnten frei empfangbar im deutschen Fernsehen – fuer alle Zuschauer ohne zusaetzliche Kosten.",
        difficulty = 1,
        funFact = "Die WM 1954 in der Schweiz war die erste, die live in Deutschland im Fernsehen zu sehen war – das Endspiel wurde von Millionen im Kino und in Gaststaetten verfolgt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Kommentator' im Sportfernsehen?",
        answerA = "Ein Schiedsrichter, der Entscheidungen erklaert",
        answerB = "Eine Person, die das Spielgeschehen live beschreibt und erklaert",
        answerC = "Der Trainer, der Interviews gibt",
        answerD = "Ein Fan, der aus dem Stadion berichtet",
        correctAnswer = 1,
        explanation = "Der Sportkommentator begleitet die Live-Uebertragung mit Worten – er beschreibt das Spielgeschehen, gibt Hintergrundinformationen und sorgt fuer Spannung.",
        difficulty = 1,
        funFact = "Einer der beruemtesten deutschen Sportkommentatoren ist Marcel Reif – seine Stimme begleitete Millionen bei Champions-League-Spielen in den 1990er und 2000er Jahren."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'VAR' beim Fussball im Fernsehen?",
        answerA = "Ein besonderer Kamerawinkel",
        answerB = "Video Assistant Referee – ein Videoschiedsrichter, der strittige Szenen ueberpruefen kann",
        answerC = "Eine Anzeigetafel im Stadion",
        answerD = "Die Tondramaturgie beim Tor",
        correctAnswer = 1,
        explanation = "Der VAR (Video Assistant Referee) sitzt in einem Kontrollraum und kann bei strittigen Szenen (Tore, Elfmeter, Platzverweise) den Feldschiedsrichter per Funk informieren.",
        difficulty = 1,
        funFact = "Der VAR wurde 2018 bei der WM in Russland erstmals bei einem grossen Turnier eingesetzt – seitdem ist er Pflicht in der Bundesliga und UEFA-Wettbewerben."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet 'Pay-TV' im Sport?",
        answerA = "Kostenlose Sportsendungen im oeffentlichen Rundfunk",
        answerB = "Bezahlfernsehen, bei dem man ein Abonnement fuer bestimmte Sportuebertragungen benoetigt",
        answerC = "Sport-Live-Streaming nur fuer Profis",
        answerD = "Werbefinanziertes Sportfernsehen",
        correctAnswer = 1,
        explanation = "Pay-TV (Bezahlfernsehen) bietet Sportuebertragungen gegen ein Abonnement an – in Deutschland bieten Sky und DAZN viele Sportinhalte als Pay-TV an.",
        difficulty = 1,
        funFact = "Sky Deutschland uebertraegt seit 1996 Bundesliga-Spiele exklusiv – die Abonnementpreise sind ein haeufiges Diskussionsthema im deutschen Fussball."
    ),

    // ─── SPORTREKORDE FUER ANFAENGER (8) ──────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie schnell lief Usain Bolt seinen Weltrekord ueber 100 Meter?",
        answerA = "9,28 Sekunden",
        answerB = "9,58 Sekunden",
        answerC = "9,74 Sekunden",
        answerD = "9,81 Sekunden",
        correctAnswer = 1,
        explanation = "Usain Bolt stellte 2009 bei der WM in Berlin den Weltrekord ueber 100 Meter auf – 9,58 Sekunden, der bis heute unerreicht ist.",
        difficulty = 1,
        funFact = "Usain Bolt zog seinen Schuh waehrend des Laufes fast aus, weil er aufging – trotzdem rannte er Weltrekord."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Fussballspieler hat die meisten Tore fuer eine Nationalmannschaft geschossen?",
        answerA = "Lionel Messi",
        answerB = "Cristiano Ronaldo",
        answerC = "Miroslav Klose",
        answerD = "Pele",
        correctAnswer = 1,
        explanation = "Cristiano Ronaldo haelt den Weltrekord fuer die meisten Tore fuer eine Nationalmannschaft – er erzielte fuer Portugal weit ueber 100 Treffer.",
        difficulty = 1,
        funFact = "Cristiano Ronaldo ueberholte den iranischen Rekordschuetzen Ali Daei 2021 mit seinem 110. Nationalmannschaftstor – seitdem hat er seinen Rekord weiter ausgebaut."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie weit geht der Weltrekord im Weitsprung (Maenner)?",
        answerA = "8,50 Meter",
        answerB = "8,67 Meter",
        answerC = "8,95 Meter",
        answerD = "9,12 Meter",
        correctAnswer = 2,
        explanation = "Mike Powell stellte 1991 in Tokio den Weltrekord im Weitsprung auf – 8,95 Meter, der seitdem noch nie uebertroffen wurde.",
        difficulty = 1,
        funFact = "Mike Powell schlug bei jenem Weltrekordsprung den Rekord von Bob Beamon aus den Olympischen Spielen 1968 in Mexico City – der 23 Jahre standgehalten hatte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Schwimmerin hielt viele Jahre den 100-Meter-Freistil-Weltrekord der Frauen?",
        answerA = "Federica Pellegrini",
        answerB = "Sarah Sjoestroem",
        answerC = "Katinka Hosszu",
        answerD = "Katie Ledecky",
        correctAnswer = 1,
        explanation = "Sarah Sjoestroem aus Schweden stellte 2017 den Weltrekord ueber 100 Meter Freistil fuer Frauen auf – 51,71 Sekunden.",
        difficulty = 1,
        funFact = "Sarah Sjoestroem hielt zeitweise Weltrekorde ueber 50m und 100m Schmetterling – sie gilt als eine der schnellsten Schwimmerinnen der Geschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nationalmannschaft hat die meisten Fussball-WM-Titel gewonnen?",
        answerA = "Deutschland",
        answerB = "Argentinien",
        answerC = "Brasilien",
        answerD = "Italien",
        correctAnswer = 2,
        explanation = "Brasilien hat mit 5 Weltmeistertiteln (1958, 1962, 1970, 1994, 2002) die meisten WM-Titel aller Zeiten gewonnen.",
        difficulty = 1,
        funFact = "Brasilien ist das einzige Land, das an jeder Fussball-WM teilgenommen hat – alle anderen Nationen verpassten mindestens eine Endrunde."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele olympische Goldmedaillen gewann Michael Phelps in seiner Karriere?",
        answerA = "15",
        answerB = "18",
        answerC = "23",
        answerD = "28",
        correctAnswer = 2,
        explanation = "Michael Phelps gewann 23 olympische Goldmedaillen – er ist der erfolgreichste Olympiateilnehmer aller Zeiten, insgesamt mit 28 Medaillen.",
        difficulty = 1,
        funFact = "Bei den Olympischen Spielen 2008 in Peking gewann Phelps 8 Goldmedaillen in 8 Rennen – ein bis heute einmaliger Olympia-Rekord."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Tennisspieler hat die meisten Grand-Slam-Titel gewonnen (Stand 2024)?",
        answerA = "Roger Federer",
        answerB = "Rafael Nadal",
        answerC = "Novak Djokovic",
        answerD = "Pete Sampras",
        correctAnswer = 2,
        explanation = "Novak Djokovic hat mit 24 Grand-Slam-Titeln (Stand 2024) die meisten Titel aller Zeiten im Herren-Tennis gewonnen.",
        difficulty = 1,
        funFact = "Djokovic ueberholte Federer und Nadal im Grand-Slam-Rekord – er gewann bei allen vier Grand Slams mehrfach und ist der einzige mit dem 'Golden Slam' (alle 4 + Gold)."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Formel-1-Fahrer gewann die meisten Weltmeistertitel?",
        answerA = "Ayrton Senna",
        answerB = "Michael Schumacher",
        answerC = "Lewis Hamilton",
        answerD = "Sebastian Vettel",
        correctAnswer = 2,
        explanation = "Lewis Hamilton gewann 7 Formel-1-Weltmeistertitel (2008, 2014–2015, 2017–2020) und liegt damit gleichauf mit Michael Schumacher.",
        difficulty = 1,
        funFact = "Lewis Hamilton und Michael Schumacher haben beide 7 WM-Titel – Hamilton hält jedoch den Rekord fuer die meisten Siege und Poles in der F1-Geschichte."
    ),

    // ─── SPORTGERAETE (8) ─────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie viele Saiten hat ein normaler Tennisschlaeger?",
        answerA = "Keine feste Zahl – je nach Modell",
        answerB = "Immer genau 16 x 18 Saiten",
        answerC = "Immer genau 24 Saiten",
        answerD = "Zwischen 15 und 20 laengs, 18 und 22 quer",
        correctAnswer = 3,
        explanation = "Die Saitenzahl eines Tennisschlaegerss variiert – typisch sind 16 Laengssaiten und 18 bis 20 Quersaiten, aber das ist nicht exakt vorgeschrieben.",
        difficulty = 1,
        funFact = "Profi-Tennisspieler lassen ihre Schlaeger oft waehrend eines Matchs neu besaiten – Roger Federer wechselt zum Beispiel regelmaessig seine Schlaeger im Turnier."
    ),

    Question(
        categoryId = 6,
        questionText = "Aus welchem Material bestehen moderne Fahrradrahmen fuer den Profiradsport meist?",
        answerA = "Stahl",
        answerB = "Aluminium",
        answerC = "Carbon (Kohlefaser)",
        answerD = "Titan",
        correctAnswer = 2,
        explanation = "Moderne Profi-Rennraeder haben Rahmen aus Carbon (Kohlefasern) – das Material ist extrem leicht und dennoch sehr steif und stabil.",
        difficulty = 1,
        funFact = "Ein Profi-Rennrad darf laut UCI-Regeln nicht leichter als 6,8 kg sein – tatsaechlich muss Gewicht hinzugefuegt werden, da Carbon-Raeder oft noch leichter sind."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Diskus' in der Leichtathletik?",
        answerA = "Eine kreisrunde, flache Scheibe, die geworfen wird",
        answerB = "Ein Speer mit rundem Ende",
        answerC = "Ein Hammer mit Griff",
        answerD = "Ein Medizinball",
        correctAnswer = 0,
        explanation = "Der Diskus ist ein flacher, kreisrunder Wurfkoerper aus Holz, Gummi und Metall – Athleten schleudern ihn aus einem Kreis heraus so weit wie moeglich.",
        difficulty = 1,
        funFact = "Der Diskuswurf ist eine der aeltesten olympischen Disziplinen – er wurde schon bei den antiken Olympischen Spielen im alten Griechenland betrieben."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist eine 'Spitzhaube' (Helm) im Bob-Sport?",
        answerA = "Ein speziell geformter Schutzhelm fuer Bob-Athleten",
        answerB = "Der spitze Bug des Bobschlittens",
        answerC = "Eine Sicherheitsweste",
        answerD = "Die Bremse am Bobschlitten",
        correctAnswer = 0,
        explanation = "Im Bobsport tragen Athleten spezielle aerodynamische Helme mit glattem Design, um den Luftwiderstand zu minimieren.",
        difficulty = 1,
        funFact = "Bob-Helme sind aus Kevlar oder Carbon gefertigt – sie muessen extremen Aufprallkraeften standhalten, da Bobbahnen bei Unfaellen sehr gefaehrlich sind."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Sportgeraet wird beim Degenfechten verwendet?",
        answerA = "Der Degen – eine steife Stichwaffe mit dreieckigem Querschnitt",
        answerB = "Das Florett – eine biegsame Stichwaffe",
        answerC = "Der Saebel – eine Streich- und Stichwaffe",
        answerD = "Ein Bambusstock",
        correctAnswer = 0,
        explanation = "Beim Degenfechten wird der Degen genutzt – er ist steifer als das Florett und hat einen dreieckigen Klingenquerschnitt. Der gesamte Koerper ist Treffflaeche.",
        difficulty = 1,
        funFact = "Im Fechten gibt es drei Waffen: Florett, Degen und Saebel – jede hat eigene Regeln fuer Treffzonen und Trefferbewertung."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst die Stange, ueber die Hochspringer springen muessen?",
        answerA = "Sprungstab",
        answerB = "Latte",
        answerC = "Balken",
        answerD = "Bar",
        correctAnswer = 1,
        explanation = "Die Latte ist die horizontale Stange beim Hochsprung – sie liegt auf zwei Staendern und faellt herunter, wenn ein Athlet sie beruehrt.",
        difficulty = 1,
        funFact = "Die Hochsprunglatte bricht bei leichter Beruehrung weg – so soll vermieden werden, dass Athleten sich verletzen, wenn sie auf die Latte fallen wuerden."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Surfboard' und wie lang ist ein typisches Kurzboard?",
        answerA = "Ein Holzbrett fuer Wellenreiten, ca. 1,5 bis 2 Meter lang",
        answerB = "Ein Metallbrett, ca. 3 Meter lang",
        answerC = "Ein aufblasbares Brett, immer genau 2 Meter lang",
        answerD = "Ein Glasfaserbrett, immer 1 Meter lang",
        correctAnswer = 0,
        explanation = "Ein Kurzboard fuer das professionelle Wellenreiten ist etwa 1,5 bis 2 Meter lang und aus Polyurethan oder Epoxidharz gefertigt.",
        difficulty = 1,
        funFact = "Longboards im Surfen sind 2,7 bis 3,5 Meter lang – sie ermoglichen einen ganz anderen Fahrstil als Kurzboards und galten als Ursprungsform des Surfens."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Biathlon-Gewehr' und warum ist es so besonders?",
        answerA = "Ein gewoehnliches Jagdgewehr",
        answerB = "Ein spezielles Kleinkalibergewehr mit Riemen, das auf dem Ruecken getragen wird",
        answerC = "Ein Luftgewehr mit Laserzielsystem",
        answerD = "Ein Pistole, die auch unter Wasser funktioniert",
        correctAnswer = 1,
        explanation = "Das Biathlon-Gewehr ist ein Kleinkalibergewehr (.22 LR), das speziell fuer das Tragen auf dem Ruecken beim Skifahren konzipiert ist und bei Schiesseinlagen eingesetzt wird.",
        difficulty = 1,
        funFact = "Biathleten schiessen auf 50 Meter Entfernung – stehend oder liegend. Die Zielscheibe ist im Stehend-Anschlag nur 11,5 cm gross – so gross wie ein Apfel."
    ),

)
