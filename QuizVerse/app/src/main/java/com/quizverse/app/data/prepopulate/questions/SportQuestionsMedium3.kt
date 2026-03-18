package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsMedium3(): List<Question> = listOf(

    // --- Handball-WM/EM (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr gewann Deutschland zum ersten Mal die Handball-Weltmeisterschaft?",
        answerA = "1978",
        answerB = "2007",
        answerC = "2019",
        answerD = "1938",
        correctAnswer = 1,
        explanation = "Deutschland gewann die Handball-WM 2007 im eigenen Land. Im Finale besiegten sie Polen 29:24. Das Turnier wurde als 'Handball-Sommermärchen' gefeiert.",
        difficulty = 2,
        funFact = "Der damalige Bundestrainer Heiner Brand wurde zum Welthandballtrainer des Jahres 2007 gewählt – eine Auszeichnung, die er bereits 1978 erhalten hatte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land hat die meisten Handball-Weltmeistertitel der Männer gewonnen (Stand 2024)?",
        answerA = "Deutschland",
        answerB = "Frankreich",
        answerC = "Schweden",
        answerD = "Daenemark",
        correctAnswer = 1,
        explanation = "Frankreich hat mit 6 WM-Titeln (1995, 2001, 2003, 2009, 2011, 2015, 2017 – Korrektur: 6 Titel bis 2024) die meisten Weltmeisterschaften der Männer gewonnen und dominiert seit den 1990ern den Welthandball.",
        difficulty = 2,
        funFact = "Frankreichs Dominanz im Handball basiert auf einem ausgereiften Nachwuchssystem – das sogenannte 'Pôle France' trainiert Talente seit den 1980er Jahren auf höchstem Niveau."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Spieler stehen beim Handball gleichzeitig auf dem Feld pro Mannschaft?",
        answerA = "5 Feldspieler + 1 Torwart",
        answerB = "6 Feldspieler + 1 Torwart",
        answerC = "7 Feldspieler + 1 Torwart",
        answerD = "8 Feldspieler + 1 Torwart",
        correctAnswer = 1,
        explanation = "Im Handball spielen 6 Feldspieler plus 1 Torwart gleichzeitig – also 7 Spieler pro Mannschaft. Teams koennen bis zu 14 Spieler nominieren, davon 2 Torhueter.",
        difficulty = 2,
        funFact = "Eine Besonderheit: Im Handball darf der Torwart gegen Ende eines Spiels durch einen zusaetzlichen Feldspieler ersetzt werden – dann spielen 7 gegen 7 Feldspieler ohne Torwart."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nation gewann die erste Handball-Europameisterschaft der Männer 1994?",
        answerA = "Deutschland",
        answerB = "Schweden",
        answerC = "Russland",
        answerD = "Daenemark",
        correctAnswer = 3,
        explanation = "Daenemark gewann die erste Handball-Europameisterschaft 1994 in Portugal. Im Finale besiegten sie Frankreich 1:0 nach Verlaengerung – eine ungewoehnlich enge Partie.",
        difficulty = 2,
        funFact = "Die erste Handball-EM fand erst 1994 statt – lange nach der WM (seit 1938) und den Olympischen Spielen (seit 1972). Daenemark ist traditionell eine der stärksten Handball-Nationen Europas."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie gross ist ein Handball-Spielfeld in seiner offiziellen Länge?",
        answerA = "30 Meter",
        answerB = "35 Meter",
        answerC = "40 Meter",
        answerD = "45 Meter",
        correctAnswer = 2,
        explanation = "Ein offizielles Handball-Spielfeld ist 40 Meter lang und 20 Meter breit. Der Torkreis (6-Meter-Kreis) ist der Wurfkreis, aus dem nur der Torwart spielen darf.",
        difficulty = 2,
        funFact = "Die Wurfkreislinie beim Handball liegt 6 Meter vor dem Tor. Die Freiwurflinie liegt 9 Meter vor dem Tor – Wuerfe von dort bei Versuchen, die von Abwehrspielern geblockt werden, müssen von der 9-Meter-Linie wiederholt werden."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Handballer wurde mehrfach zum Welthandballer des Jahres gewählt?",
        answerA = "Stefan Kretzschmar",
        answerB = "Heiner Brand",
        answerC = "Nikola Karabatic",
        answerD = "Marcus Ahlm",
        correctAnswer = 0,
        explanation = "Nikola Karabatic (Frankreich) gewann dreimal den Titel Welthandballer des Jahres (2007, 2011, 2014). Stefan Kretzschmar war zwar bekannt, wurde aber nie Welthandballer des Jahres.",
        difficulty = 2,
        funFact = "Stefan Kretzschmar ist einer der bekanntesten deutschen Handballer – nicht wegen seiner Titel, sondern auch wegen seines markanten Stils und seiner Medienpraesenz. Er spielte für den SC Magdeburg und Hannover-Burgdorf."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei der Handball-WM 2019 in Deutschland und Daenemark – welches Land gewann den Titel?",
        answerA = "Frankreich",
        answerB = "Daenemark",
        answerC = "Norwegen",
        answerD = "Deutschland",
        correctAnswer = 1,
        explanation = "Daenemark gewann die Handball-WM 2019 im eigenen Land – das erste Mal, dass Daenemark Weltmeister wurde. Im Finale besiegten sie Norwegen 31:22. Deutschland schied im Halbfinale aus.",
        difficulty = 2,
        funFact = "Mikkel Hansen wurde bei der WM 2019 als bester Spieler ausgezeichnet. Daenemark gewann das Turnier als Gastgeber – was zuvor nur Deutschland 2007 gelungen war."
    ),

    // --- Tennis-Grand-Slam-Details (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Auf welchem Belag wird die French Open (Roland Garros) gespielt?",
        answerA = "Rasen",
        answerB = "Hartplatz",
        answerC = "Sand",
        answerD = "Teppich",
        correctAnswer = 2,
        explanation = "Roland Garros wird auf rotem Sand (Clay) gespielt – ein langsamer Belag, der hohe Bälle erzeugt und gut fuer Grundlinienspieler ist. Rafael Nadal ist der erfolgreichste Spieler auf diesem Belag.",
        difficulty = 2,
        funFact = "Roland Garros ist nach einem französischen Flugpionier benannt – nicht nach einem Tennisspieler. Der Komplex liegt im 16. Arrondissement von Paris und hat 20 Tennisplätze."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer hält den Rekord fuer die meisten French-Open-Titel bei den Männern?",
        answerA = "Novak Djokovic mit 3 Titeln",
        answerB = "Rafael Nadal mit 14 Titeln",
        answerC = "Bjorn Borg mit 6 Titeln",
        answerD = "Roger Federer mit 1 Titel",
        correctAnswer = 1,
        explanation = "Rafael Nadal gewann Roland Garros insgesamt 14 Mal (2005–2008, 2010–2014, 2017–2020, 2022) – ein Weltrekord bei einem einzelnen Grand-Slam-Turnier in der Geschichte des Tennis.",
        difficulty = 2,
        funFact = "Nadals Dominanz in Paris ist so legendaer, dass er dort 112 Siege und nur 4 Niederlagen aufweist – eine Siegquote von über 96 Prozent auf dem Court Philippe Chatrier."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Saetze müssen Männer bei einem Grand-Slam-Match gewinnen, um das Spiel zu entscheiden?",
        answerA = "2 von 3 Saetzen",
        answerB = "3 von 5 Saetzen",
        answerC = "2 von 4 Saetzen",
        answerD = "4 von 7 Saetzen",
        correctAnswer = 1,
        explanation = "Bei Grand-Slam-Turnieren spielen Männer im Best-of-five-Format: Der Spieler, der zuerst 3 Saetze gewinnt, gewinnt das Match. Frauen spielen Best-of-three (2 von 3 Saetzen).",
        difficulty = 2,
        funFact = "Das laengste Grand-Slam-Match der Geschichte dauerte 11 Stunden und 5 Minuten – John Isner gegen Nicolas Mahut in Wimbledon 2010. Der finale Satz endete 70:68."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Monat findet Wimbledon traditionell statt?",
        answerA = "Mai",
        answerB = "Juni",
        answerC = "Juli",
        answerD = "August",
        correctAnswer = 1,
        explanation = "Wimbledon findet traditionell Ende Juni bis Anfang Juli statt – genau zwei Wochen, die auf dem Rasen des All England Lawn Tennis and Croquet Club in London ausgetragen werden.",
        difficulty = 2,
        funFact = "Wimbledon hat strenge Kleiderordnung: Spieler müssen überwiegend Weiss tragen. Strawberries with cream und Pimm's sind die ikonischen Speisen und Getraenke des Turniers."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Tennisspielerin gewann das erste Grand-Slam-Turnier des Jahres (Australian Open) am häufigsten?",
        answerA = "Serena Williams mit 7 Titeln",
        answerB = "Steffi Graf mit 4 Titeln",
        answerC = "Margaret Court mit 11 Titeln",
        answerD = "Martina Navratilova mit 3 Titeln",
        correctAnswer = 2,
        explanation = "Margaret Court gewann die Australian Open 11 Mal (1960–1966, 1969–1971, 1973) – mehr als jede andere Spielerin. Ihr Gesamtrekord von 24 Grand-Slam-Titeln steht bis heute.",
        difficulty = 2,
        funFact = "Margaret Court ist die einzige Spielerin, die alle vier Grand-Slam-Turniere im gleichen Kalenderjahr gewonnen hat – den sogenannten Calendar Slam (1970). Steffi Graf schaffte dies als einzige Frau in der Open Era (1988)."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Golden Slam' im Tennis?",
        answerA = "Alle vier Grand-Slam-Titel plus Olympisch-Gold im gleichen Kalenderjahr",
        answerB = "Drei Grand-Slam-Titel in einer Saison",
        answerC = "Ein Spieler, der alle Aufschlaege in einem Satz aus dem ersten Aufschlag macht",
        answerD = "Sieg bei drei Grand Slams und dem Davis Cup",
        correctAnswer = 0,
        explanation = "Der Golden Slam bezeichnet das Gewinnen aller vier Grand-Slam-Turniere plus der Olympischen Goldmedaille im gleichen Kalenderjahr. Steffi Graf ist bisher die einzige Person, die dies erreicht hat (1988).",
        difficulty = 2,
        funFact = "Novak Djokovic hatte 2021 die Chance auf den Golden Slam – er gewann die ersten drei Grand Slams, verlor aber das Olympia-Finale in Tokio gegen Alexander Zverev und scheiterte bei den US Open im Halbfinale."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Grand-Slam-Turnier wird auf Hartplatz gespielt und ist das erste des Jahres?",
        answerA = "US Open",
        answerB = "Australian Open",
        answerC = "Roland Garros",
        answerD = "Wimbledon",
        correctAnswer = 1,
        explanation = "Die Australian Open findet im Januar in Melbourne statt und wird auf Hartplatz (DecoTurf) gespielt. Es ist aufgrund der australischen Sommerhitze oft das physisch anspruchsvollste der vier Grand Slams.",
        difficulty = 2,
        funFact = "Melbourne Park war früher als Flinders Park bekannt. Novak Djokovic hält mit 10 Australian-Open-Titeln den Rekord bei Männern."
    ),

    // --- Baseball/MLB (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Wie viele Spieler einer Mannschaft stehen im Baseball gleichzeitig auf dem Feld?",
        answerA = "7 Spieler",
        answerB = "9 Spieler",
        answerC = "11 Spieler",
        answerD = "Variiert je nach Liga",
        correctAnswer = 1,
        explanation = "Im Baseball spielen 9 Spieler pro Mannschaft auf dem Feld – 1 Pitcher (Werfer), 1 Catcher und 7 Feldspieler. Die Batteriereihenfolge hat ebenfalls 9 Schlagmänner.",
        difficulty = 2,
        funFact = "Seit 2022 gibt es in der MLB auch einen 'Designated Hitter' (DH) in beiden Ligen – ein Schlagmann, der für den Pitcher schlägt und nicht im Feld spielt. Das American League hatte diese Regel schon seit 1973."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches MLB-Team hat die meisten World-Series-Titel gewonnen?",
        answerA = "Boston Red Sox mit 9 Titeln",
        answerB = "New York Yankees mit 27 Titeln",
        answerC = "Los Angeles Dodgers mit 8 Titeln",
        answerD = "San Francisco Giants mit 8 Titeln",
        correctAnswer = 1,
        explanation = "Die New York Yankees haben mit 27 World-Series-Titeln die meisten Meisterschaften in der MLB-Geschichte. Ihr letzter Titel war 2009.",
        difficulty = 2,
        funFact = "Die Yankees werden 'The Bronx Bombers' genannt – nach ihrem Stadtviertel und ihrer Vorliebe fuer Homeruns. Das legendäre Yankee Stadium war von 1923 bis 2008 in Betrieb."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Home Run' im Baseball?",
        answerA = "Ein Treffer, bei dem der Schläger die erste Base erreicht",
        answerB = "Ein Treffer, bei dem der Ball über den Aussenzaun fliegt und der Schläger alle Bases läuft",
        answerC = "Ein Wurf, den der Schläger dreimal verfehlt",
        answerD = "Ein Treffer, der den Ball ins Zentrum des Feldes schickt",
        correctAnswer = 1,
        explanation = "Ein Home Run ist ein Treffer, bei dem der Ball über die Aussenfeldmauer fliegt (Fair Ball). Der Schläger und alle Läufer auf den Bases können alle vier Bases laufen und Punkte erzielen.",
        difficulty = 2,
        funFact = "Der Rekord fuer die meisten Home Runs in einer MLB-Saison haelt Barry Bonds mit 73 Homeruns (2001). Das ewige Karriere-Rekord haelt Barry Bonds mit 762 Homeruns."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer gilt als der beruehrmteste Baseballspieler der Geschichte?",
        answerA = "Mickey Mantle",
        answerB = "Hank Aaron",
        answerC = "Babe Ruth",
        answerD = "Joe DiMaggio",
        correctAnswer = 2,
        explanation = "Babe Ruth (George Herman Ruth) gilt als der groesste Baseballspieler aller Zeiten. Er spielte hauptsaechlich fuer die New York Yankees und revolutionierte das Spiel durch seine Homerun-Macht.",
        difficulty = 2,
        funFact = "Babe Ruth trug den Spitznamen 'The Sultan of Swat'. Er erzielte 714 Karriere-Homeruns – ein Rekord, der 39 Jahre stand, bis Hank Aaron ihn 1974 brach."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Innings hat ein regulaeres Baseball-Spiel?",
        answerA = "7 Innings",
        answerB = "8 Innings",
        answerC = "9 Innings",
        answerD = "10 Innings",
        correctAnswer = 2,
        explanation = "Ein regulaeres MLB-Spiel hat 9 Innings. In jedem Inning schlaegt jede Mannschaft einmal – das Spiel ist beendet, wenn die fuehren de Mannschaft nach 9 Innings vorne liegt.",
        difficulty = 2,
        funFact = "Ein Inning im Baseball endet, wenn die verteidigende Mannschaft 3 Outs erzielt hat. Im Vergleich hat ein Softball-Spiel nur 7 Innings."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Strikeout' im Baseball und wie entscheidet er ein At-Bat?",
        answerA = "Der Schläger trifft dreimal und schlägt aus – Out",
        answerB = "Der Pitcher trifft dreimal die Strike Zone ohne dass der Schlaeger trifft – Out",
        answerC = "Der Ball wird vom Pitcher ins Aus geworfen",
        answerD = "Der Schläger verlässt die Box ohne zu schlagen",
        correctAnswer = 1,
        explanation = "Ein Strikeout entsteht, wenn ein Schläger drei Strikes erhält – entweder indem er am Ball vorbeischlägt, einen Ball durch die Strike Zone passieren laesst oder einen Ball hochschlägt, der gefangen wird.",
        difficulty = 2,
        funFact = "Nolan Ryan haelt den MLB-Rekord fuer die meisten Strikeouts in einer Karriere mit 5714. Er erzielte in 27 Saisons diesen Rekord und warf 7 No-Hitter."
    ),

    Question(
        categoryId = 6,
        questionText = "In welcher Stadt wurde 1903 die erste offizielle World Series der MLB ausgetragen?",
        answerA = "New York",
        answerB = "Boston",
        answerC = "Chicago",
        answerD = "Pittsburgh",
        correctAnswer = 1,
        explanation = "Die erste offizielle World Series 1903 fand zwischen den Boston Americans (heutige Red Sox) und den Pittsburgh Pirates statt. Boston gewann das Best-of-nine-Format 5:3.",
        difficulty = 2,
        funFact = "Die World Series heisst nicht wegen weltweiter Teilnahme 'World Series' – der Name stammt moeglicherweise vom 'New York World', einer Zeitung, die das Turnier sponserte."
    ),

    // --- Rugby-Weltmeisterschaft (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr fand die erste Rugby-Union-Weltmeisterschaft statt?",
        answerA = "1979",
        answerB = "1983",
        answerC = "1987",
        answerD = "1991",
        correctAnswer = 2,
        explanation = "Die erste Rugby-Union-Weltmeisterschaft fand 1987 in Australien und Neuseeland statt. Neuseeland (All Blacks) gewann den ersten Titel mit einem Finalsieg ueber Frankreich (29:9).",
        difficulty = 2,
        funFact = "Die Idee zur Rugby-WM entstand 1985 – erst zwei Jahre vor dem ersten Turnier. Zuvor hatte Rugby Union keine Weltmeisterschaft, da der Sport streng amateurhaft organisiert war."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land hat die Rugby-Union-Weltmeisterschaft am häufigsten gewonnen (Stand 2024)?",
        answerA = "England mit 2 Titeln",
        answerB = "Suedafrika mit 4 Titeln",
        answerC = "Neuseeland mit 3 Titeln",
        answerD = "Australien mit 2 Titeln",
        correctAnswer = 1,
        explanation = "Suedafrika gewann die Rugby-WM 2023 in Frankreich und haelt mit 4 Titeln (1995, 2007, 2019, 2023) den Rekord – einer mehr als Neuseeland (1987, 2011, 2015).",
        difficulty = 2,
        funFact = "Suedafrikas WM-Sieg 1995 war von besonderer historischer Bedeutung: Kapitan Francois Pienaar nahm den Pokal von Präsident Nelson Mandela entgegen – ein Symbol der post-Apartheid-Versoehn ung."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Haka' im Zusammenhang mit Rugby?",
        answerA = "Eine neuseeländische Jubel-Choreographie nach einem Sieg",
        answerB = "Ein traditioneller Maori-Kriegstanz, den die All Blacks vor jedem Spiel auffuehren",
        answerC = "Der Name fuer einen speziellen Rugby-Angriffszug",
        answerD = "Ein australischer Rugby-Slogan",
        correctAnswer = 1,
        explanation = "Der Haka ist ein traditioneller Maori-Kriegstanz, den das neuseelaendische Rugbyteam (All Blacks) vor jedem Spiel auffuehrt. Es ist eine kulturelle Herausforderung und Einstimmung auf den Kampf.",
        difficulty = 2,
        funFact = "Der bekannteste Haka der All Blacks heisst 'Ka Mate' und wurde im 19. Jahrhundert von Haeupt ling Te Rauparaha komponiert. Seit 2005 wird auch 'Kapa O Pango' verwendet – speziell fuer grosse Anlässe."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Spieler hat eine Rugby-Union-Mannschaft auf dem Feld?",
        answerA = "13 Spieler",
        answerB = "14 Spieler",
        answerC = "15 Spieler",
        answerD = "16 Spieler",
        correctAnswer = 2,
        explanation = "Eine Rugby-Union-Mannschaft hat 15 Spieler auf dem Feld – 8 Vorwärtsspieler (Forwards) und 7 Hintermannschaft (Backs). Rugby League hat dagegen nur 13 Spieler.",
        difficulty = 2,
        funFact = "Rugby Union und Rugby League sind zwei verschiedene Sportarten mit unterschiedlichen Regeln. Rugby Union entstand 1823 als William Webb Ellis den Ball in einem Fussballspiel aufhob und rannte – laut Legende."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Drop Goal' im Rugby Union?",
        answerA = "Ein Einwurf aus dem Seitenfeld",
        answerB = "Ein Tor durch einen Dropkick durch die Torpfosten während des Spiels",
        answerC = "Ein Versuch (Try) unter den Torpfosten",
        answerD = "Ein Strafstoss nach einem Foul",
        correctAnswer = 1,
        explanation = "Ein Drop Goal wird erzielt, indem ein Spieler den Ball erst auf den Boden fallen laesst und ihn dann direkt durch die Torpfosten kickt. Es zaehlt 3 Punkte im Rugby Union.",
        difficulty = 2,
        funFact = "Jonny Wilkinsons Drop Goal in der 100. Minute des WM-Finals 2003 sicherte England den Titel gegen Australien 20:17 – einer der dramatischsten Momente der Rugby-Geschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Turnier gilt als das prestigetraechtigste ausserhalb der WM im Rugby Union?",
        answerA = "Six Nations Championship",
        answerB = "Tri Nations / Rugby Championship",
        answerC = "Lions Tour",
        answerD = "Heineken Champions Cup",
        correctAnswer = 0,
        explanation = "Das Six Nations Championship (England, Frankreich, Irland, Italien, Schottland, Wales) gilt als das prestigetraechtigste regulaere Turnier im Rugby Union. Es findet jedes Jahr statt und hat Wurzeln im Home Nations Championship von 1883.",
        difficulty = 2,
        funFact = "Das 'Grand Slam' im Six Nations bedeutet, alle 5 Spiele zu gewinnen. Das 'Triple Crown' ist ein britisch-irischer Ehrentitel – England, Irland, Schottland oder Wales, die alle drei anderen Home Nations besiegen."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Punkte zaehlt ein 'Penalty Try' im Rugby Union?",
        answerA = "5 Punkte",
        answerB = "7 Punkte",
        answerC = "10 Punkte",
        answerD = "8 Punkte",
        correctAnswer = 1,
        explanation = "Ein Penalty Try wird vergeben, wenn ohne die regelwidrige Handlung des Verteidigers wahrscheinlich ein Try erzielt worden waere. Er zaehlt 7 Punkte – Try (5) plus automatische Umwandlung (2), ohne dass die Umwandlung gespielt werden muss.",
        difficulty = 2,
        funFact = "Der Penalty Try wurde 2017 in seiner aktuellen Form reformiert: Er zaehlt automatisch 7 Punkte ohne Umwandlungsversuch. Zuvor wurden Try (5) und Umwandlung (2) separat zugesprochen."
    ),

    // --- Motorsport-Serien (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Was ist die MotoGP und welche Motorrad-Hubraum-Klasse faehrt dort?",
        answerA = "Motorrad-Weltmeisterschaft mit Bikes bis 600 ccm",
        answerB = "Motorrad-Weltmeisterschaft der Prototypen bis 1000 ccm",
        answerC = "Motorrad-Strassenserie fuer Serienmotorraeder",
        answerD = "Elektromotorrad-Weltmeisterschaft",
        correctAnswer = 1,
        explanation = "Die MotoGP ist die höchste Klasse der Motorrad-Weltmeisterschaft. Seit 2012 fahren Prototypen mit bis zu 1000 ccm Hubraum und ca. 290 PS. Es ist die prestigetraechtigste Motorrad-Rennserie der Welt.",
        difficulty = 2,
        funFact = "Valentino Rossi gewann 9 Motorrad-Weltmeistertitel, davon 7 in der 500-ccm/MotoGP-Klasse. Er ist einer der erfolgreichsten Motorradrennfahrer der Geschichte und fuhr bis 2021."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Rennserie ist bekannt als 'Die Haerte des Ausdauerrennsports' und findet 24 Stunden statt?",
        answerA = "Formel E",
        answerB = "24 Stunden von Le Mans",
        answerC = "IndyCar Series",
        answerD = "WTCR Tourenwagen-WM",
        correctAnswer = 1,
        explanation = "Die 24 Stunden von Le Mans ist das beruehm teste Ausdauerrennen der Welt und findet seit 1923 in Frankreich statt. Autos und Fahrer (3 pro Auto) fahren 24 Stunden lang – wer die weiteste Strecke zuruecklegt, gewinnt.",
        difficulty = 2,
        funFact = "Porsche hat die 24h Le Mans am häufigsten gewonnen – über 19 Siege. Audi dominierte von 2000 bis 2014 mit 13 Siegen und machte Diesel-Motorsport salonfaehig."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die IndyCar Series und wo ist sie hauptsaechlich verbreitet?",
        answerA = "Europaeische Formel-Tourenwagen-Meisterschaft",
        answerB = "Amerikanische Open-Wheel-Rennserie, bekannt durch das Indianapolis 500",
        answerC = "Weltweite Elektroauto-Rennserie",
        answerD = "Kanadische Rallyerennserie",
        correctAnswer = 1,
        explanation = "Die IndyCar Series ist die wichtigste amerikanische Open-Wheel-Rennserie. Ihr beruehm testes Rennen ist das Indianapolis 500 – eines der 'Triple Crown of Motorsport'-Rennen. IndyCar und Formel 1 sind die beiden bedeutendsten Open-Wheel-Serien der Welt.",
        difficulty = 2,
        funFact = "Das Indianapolis 500 wird traditionell am Memorial Day-Wochenende gefahren und zieht über 250.000 Zuschauer an – es ist das meistbesuchte einzel ne Sportereignis der Welt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Fahrer gewann die DTM-Meisterschaft (Deutsche Tourenwagen Masters) am häufigsten?",
        answerA = "Klaus Ludwig mit 3 Titeln",
        answerB = "Bernd Schneider mit 5 Titeln",
        answerC = "Hans-Joachim Stuck mit 4 Titeln",
        answerD = "Rolf Stommelen mit 2 Titeln",
        correctAnswer = 1,
        explanation = "Bernd Schneider gewann die DTM fuenfmal (1995, 2000, 2001, 2003, 2004) – mehr als jeder andere Fahrer in der Geschichte der Deutschen Tourenwagen Masters.",
        difficulty = 2,
        funFact = "Die DTM wurde 1984 gegruendet und war in den 1990ern eine der populaersten Motorsport-Serien Europas. Mercedes, BMW und Audi kaempften jahrelang um die Vorherrschaft."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die World Rally Championship (WRC)?",
        answerA = "Eine Rundkurs-Rennserie fuer Sportwagen",
        answerB = "Eine Welt-Rallye-Meisterschaft auf natuerlichen Untergründen wie Schotter, Asphalt und Schnee",
        answerC = "Eine amerikanische Off-Road-Serie",
        answerD = "Eine europaeische Motorrad-Rallye",
        correctAnswer = 1,
        explanation = "Die WRC ist die Rallye-Weltmeisterschaft und umfasst Rennen auf verschiedenen natürlichen Untergründen: Schotter, Asphalt, Schnee/Eis und Sand. Sebastien Loeb ist mit 9 Weltmeistertiteln der erfolgreichste Fahrer.",
        difficulty = 2,
        funFact = "Die WRC gilt als eine der technisch anspruchsvollsten Motorsport-Serien – Fahrer bewältigen Sonderprüfungen auf öffentlichen Strassen, oft in extremen Wetterbedingungen, teilweise nachts."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Formel-1-Fahrer gewann viermal in Folge den Weltmeistertitel von 2010 bis 2013?",
        answerA = "Fernando Alonso",
        answerB = "Lewis Hamilton",
        answerC = "Sebastian Vettel",
        answerD = "Jenson Button",
        correctAnswer = 2,
        explanation = "Sebastian Vettel gewann von 2010 bis 2013 vier aufeinanderfolgende Formel-1-Weltmeistertitel mit Red Bull Racing – der juengste vierfache Champion aller Zeiten.",
        difficulty = 2,
        funFact = "Vettel gewann 2013 in Suzuka seinen vierten Titel und ist hinter Michael Schumacher und Lewis Hamilton der dritte Fahrer mit mindestens vier WM-Titeln."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die Formel E und was macht sie besonders?",
        answerA = "Eine Junior-Serie fuer junge Formel-1-Talente",
        answerB = "Die Weltmeisterschaft fuer vollelektrische Rennwagen auf Stadtstrassen",
        answerC = "Eine Langstrecken-Rennserie fuer Elektrofahrzeuge",
        answerD = "Eine Virtual-Reality-Rennsimulations-Weltmeisterschaft",
        correctAnswer = 1,
        explanation = "Die Formel E ist die FIA-Weltmeisterschaft fuer vollelektrische Einzel-Rennwagen. Sie wurde 2014 gegruendet und findet auf temporaeren Stadtrundkursen statt – um Nachhaltigkeit und elektrische Mobilitaet zu foerdern.",
        difficulty = 2,
        funFact = "In den ersten Formel-E-Saisons mussten Fahrer mitten im Rennen das Auto wechseln – die Batterie reichte nicht fuer das ganze Rennen. Ab Saison 5 (2019) entfielen die Autostops dank verbesserter Batterien."
    ),

    // --- Schwimm-Rekorde (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmer gewann bei einem einzelnen Olympia-Turnier die meisten Goldmedaillen in der Geschichte?",
        answerA = "Mark Spitz (7 Gold 1972)",
        answerB = "Michael Phelps (8 Gold 2008)",
        answerC = "Ian Thorpe (4 Gold 2000)",
        answerD = "Ryan Lochte (4 Gold 2012)",
        correctAnswer = 1,
        explanation = "Michael Phelps gewann 2008 in Peking 8 Goldmedaillen bei einem einzigen Olympia-Turnier – ein Weltrekord. Mark Spitz hatte 1972 in Muenchen 7 Goldmedaillen gewonnen, die vorherige Bestmarke.",
        difficulty = 2,
        funFact = "Phelps gewann all seine 8 Goldmedaillen 2008 in Weltrekordzeit. In seiner Gesamt-Olympiakarriere gewann er 23 Goldmedaillen – mehr als viele Nationen insgesamt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmstil ist der schnellste und wird bei den 100-Meter-Wettkämpfen genutzt?",
        answerA = "Brustschwimmen",
        answerB = "Rueckenschwimmen",
        answerC = "Schmetterlingsstil",
        answerD = "Freistilschwimmen (Kraul)",
        correctAnswer = 3,
        explanation = "Freistilschwimmen (Kraulen) ist der schnellste Schwimmstil. Bei 'Freistil'-Wettkaeampfen wählen Schwimmer frei – und fast alle wählen Kraulen. Der Weltrekord über 100m Freistil liegt bei 46,80 Sekunden (David Popovici, 2022).",
        difficulty = 2,
        funFact = "Der Schmetterlingstil (Butterfly) ist der zweitschnellste Stil – er erfordert enorme Kraft und Koordination. Er wurde erst 1952 als eigene Disziplin eingeführt, nachdem Schwimmer ihn als Technik beim Brustschwimmen entdeckten."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land dominiert traditionell das Beckenschwimmen bei Olympischen Spielen?",
        answerA = "Australien",
        answerB = "USA",
        answerC = "China",
        answerD = "Deutschland",
        correctAnswer = 1,
        explanation = "Die USA dominieren das olympische Beckenschwimmen seit Jahrzehnten. Mit Athleten wie Michael Phelps, Mark Spitz, Ryan Lochte und Katie Ledecky haben sie mehr Schwimm-Goldmedaillen gewonnen als jede andere Nation.",
        difficulty = 2,
        funFact = "Australien ist die stärkste Herausforderer-Nation in vielen Freistil- und Schmetterlingsrennen. Ian Thorpe ('Torpedo'), Grant Hackett und Emma McKeon gehören zu den groessten australischen Schwimm-Stars."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Weltrekord im Kurzbahnenschwimmen' (SCM) und wie unterscheidet er sich vom Langbahnrekord?",
        answerA = "Kurzbahnrekorde gelten auf 25-Meter-Bahnen, Langbahnrekorde auf 50-Meter-Bahnen",
        answerB = "Kurzbahnrekorde gelten fuer unter 18-Jaehrige, Langbahnrekorde fuer Erwachsene",
        answerC = "Es gibt keinen Unterschied – beide gelten gleichermassen",
        answerD = "Kurzbahnrekorde werden nur bei Weltmeisterschaften anerkannt",
        correctAnswer = 0,
        explanation = "SCM (Short Course Meters) gilt auf 25-Meter-Bahnen, LCM (Long Course Meters) auf 50-Meter-Bahnen. Kurzbahnrekorde sind schneller – Schwimmer koennen oefter abstoppen (an der Wand abstossen). Olympische Spiele finden auf Langbahnen statt.",
        difficulty = 2,
        funFact = "Ein Abstopp an der Wand kann einem Schwimmer auf 25-Meter-Bahn bis zu 0,3 Sekunden pro Wende bringen – auf 100 Meter Kurzbahn gibt es 3 Wenden, auf Langbahn nur eine."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Schwimmdisziplin kombiniert alle vier Schwimmstile in einer bestimmten Reihenfolge?",
        answerA = "Staffel 4x100 Freistil",
        answerB = "Lagenschwimmen (Individual Medley)",
        answerC = "Superfinale Mixed Relay",
        answerD = "Kombinationsrennen",
        correctAnswer = 1,
        explanation = "Beim Lagenschwimmen (Individual Medley, IM) schwimmt ein Athlet alle vier Stile nacheinander: Schmetterling, Ruecken, Brust, Freistil. Es gilt als die technisch anspruchsvollste Einzeldisziplin im Schwimmen.",
        difficulty = 2,
        funFact = "Michael Phelps war im 200m und 400m Lagenschwimmen weltdominant – er gewann beide Disziplinen mehrfach olympisch und setzte Weltrekorde. Das Lagenschwimmen erfordert Perfektion in allen vier Stilen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmer haelt den Weltrekord ueber 50 Meter Freistil (Stand 2024)?",
        answerA = "Florent Manaudou (20,26 s)",
        answerB = "Caeleb Dressel (20,24 s)",
        answerC = "Ben Proud (20,47 s)",
        answerD = "Cesar Cielo (20,91 s)",
        correctAnswer = 1,
        explanation = "Caeleb Dressel aus den USA schwamm 2021 bei den Olympischen Spielen in Tokio die 50 Meter Freistil in 20,24 Sekunden – Weltrekord auf der Langbahn (50-Meter-Becken).",
        difficulty = 2,
        funFact = "Caeleb Dressel ist einer der dominantesten Sprinter der Schwimmgeschichte. Bei den Tokio-Spielen gewann er 5 Goldmedaillen in einer Woche – eine der herausragenden Einzelleistungen in der Schwimmgeschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr wurde Schwimmen zum ersten Mal bei den Olympischen Spielen ausgetragen?",
        answerA = "1896 in Athen",
        answerB = "1900 in Paris",
        answerC = "1904 in St. Louis",
        answerD = "1908 in London",
        correctAnswer = 0,
        explanation = "Schwimmen war bei den ersten modernen Olympischen Spielen 1896 in Athen dabei. Die Wettkaeampfe fanden im offenen Meer (Zea Bay bei Piräus) statt – Wellenschwimmen inklusive.",
        difficulty = 2,
        funFact = "Bei den Spielen 1896 gab es nur Männer-Wettkaeampfe. Frauen durften erst 1912 in Stockholm olympisch schwimmen – und die erste Olympiasiegerin war die Australierin Fanny Durack."
    ),

    // --- Sport und Geld/Transfers (8 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Was war der teuerste Fussball-Transfer aller Zeiten (Stand 2024)?",
        answerA = "Cristiano Ronaldo zu Real Madrid fuer 94 Millionen Euro (2009)",
        answerB = "Neymar Jr. zu PSG fuer 222 Millionen Euro (2017)",
        answerC = "Kylian Mbappe zu Real Madrid fuer 180 Millionen Euro (2024)",
        answerD = "Gareth Bale zu Real Madrid fuer 101 Millionen Euro (2013)",
        correctAnswer = 1,
        explanation = "Neymar Jr. wechselte 2017 fuer 222 Millionen Euro von FC Barcelona zu Paris Saint-Germain – der teuerste Fussball-Transfer aller Zeiten. Die Transfersumme brach den vorherigen Rekord mehr als doppelt.",
        difficulty = 2,
        funFact = "Neymars Abloesegebühr aktivierte eine Ausstiegsklausel in seinem Barcelona-Vertrag. Barcelona nutzten das Geld teilweise fuer den Kauf von Ousmane Dembele und Philippe Coutinho."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer war der erste Sportler, der mehr als 1 Milliarde Dollar Gesamteinkünfte in seiner Karriere verdiente?",
        answerA = "Michael Jordan",
        answerB = "Tiger Woods",
        answerC = "LeBron James",
        answerD = "Cristiano Ronaldo",
        correctAnswer = 1,
        explanation = "Tiger Woods ueberschritt als erster Athlet die Grenze von 1 Milliarde Dollar Gesamteinkünften (Preisgelder + Sponsoring + Geschäfte) – noch während seiner aktiven Karriere.",
        difficulty = 2,
        funFact = "Michael Jordan übertraf die Milliarden-Grenze später durch seine Beteiligung am NBA-Team Charlotte Hornets und die Air Jordan/Nike-Partnerschaft. LeBron James ist ebenfalls Milliadär durch Sportgeschäfte."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Financial Fair Play' (FFP) in der UEFA?",
        answerA = "Ein Regelwerk, das Vereinen verbietet, mehr auszugeben als sie einnehmen",
        answerB = "Ein Fonds, der arme Vereine subventioniert",
        answerC = "Eine Spieler-Gehaltsobergrenze in der Champions League",
        answerD = "Eine Regel, die Transfergebuehren auf 50 Millionen Euro begrenzt",
        correctAnswer = 0,
        explanation = "Financial Fair Play wurde 2011 von der UEFA eingeführt, um zu verhindern, dass Vereine mehr ausgeben als sie einnehmen. Ziel: Finanziell nachhaltige Clubs und keine Marktverzerrung durch unkontrollierte Investitionen.",
        difficulty = 2,
        funFact = "Der FFP wurde nach Kontroversen reformiert: Ab 2022 gilt das 'UEFA Club Licensing and Financial Sustainability Regulations' (CLFFSR) – schärfere Regeln mit direkteren Sanktionen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher NBA-Spieler unterschrieb 2016 den damals reichsten Vertrag in der NBA-Geschichte?",
        answerA = "LeBron James mit 153 Millionen Dollar",
        answerB = "Stephen Curry mit 201 Millionen Dollar",
        answerC = "Kevin Durant mit 188 Millionen Dollar",
        answerD = "Russell Westbrook mit 205 Millionen Dollar",
        correctAnswer = 1,
        explanation = "Stephen Curry unterschrieb 2016 einen Vertrag ueber 201 Millionen Dollar ueber 5 Jahre mit den Golden State Warriors – der damals groesste Einzelvertrag in der NBA-Geschichte.",
        difficulty = 2,
        funFact = "Der NBA-Gehaltsrekord ist durch die Luxury-Tax-Regelungen begrenzt – ohne Salary Cap wuerden Spitzenverdiener noch hoeher dotierte Vertraege erhalten. Curry war der erste 200-Millionen-Dollar-Spieler in der NBA."
    ),

    Question(
        categoryId = 6,
        questionText = "Wofuer steht der Begriff 'Salary Cap' im Profisport?",
        answerA = "Der maximale Transferpreis fuer einen einzelnen Spieler",
        answerB = "Die maximale Gesamtgehaltsumme, die ein Team pro Saison ausgeben darf",
        answerC = "Das Mindestgehalt fuer Neuzugaenge",
        answerD = "Der maximale Jahresbonus fuer den Meistertitel",
        correctAnswer = 1,
        explanation = "Der Salary Cap ist eine Gehaltsgrenze: ein Team darf pro Saison nicht mehr als diesen festgelegten Betrag an Spielergehaelter zahlen. Er soll Wettbewerbsgleichheit foerdern. Die NFL und NBA haben ihn, die Fussball-Ligen nicht.",
        difficulty = 2,
        funFact = "Der NFL-Salary Cap lag 2024 bei 255,4 Millionen Dollar pro Team. Teams, die den Cap überschreiten, muessen Spieler entlassen oder Vertraege umstrukturieren – eine komplexe Managementwissenschaft."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viel Preisgeld erhalten die Wimbledon-Sieger (Maenner und Frauen) ungefähr (Stand 2024)?",
        answerA = "Ca. 1 Million Britische Pfund",
        answerB = "Ca. 2,5 Millionen Britische Pfund",
        answerC = "Ca. 500.000 Britische Pfund",
        answerD = "Ca. 5 Millionen Britische Pfund",
        correctAnswer = 1,
        explanation = "Die Wimbledon-Sieger in Einzel Maenner und Frauen erhalten jeweils ca. 2,35–2,5 Millionen Britische Pfund Preisgeld (Stand 2024). Wimbledon zahlt seit 1973 gleiche Preisgeld fuer Maenner und Frauen.",
        difficulty = 2,
        funFact = "Wimbledon war 1973 das erste Grand-Slam-Turnier, das Maenner und Frauen gleich entlohnte. Die US Open und Roland Garros folgten, die Australian Open erst 2001."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Verein zahlte 2013 fuer Gareth Bale die damals hoechste Transfersumme der Fussballgeschichte?",
        answerA = "Paris Saint-Germain fuer 94 Millionen Euro",
        answerB = "Real Madrid fuer 101 Millionen Euro",
        answerC = "Manchester City fuer 95 Millionen Euro",
        answerD = "FC Barcelona fuer 90 Millionen Euro",
        correctAnswer = 1,
        explanation = "Real Madrid zahlte 2013 fuer Gareth Bale 101 Millionen Euro an Tottenham Hotspur – damals ein Weltrekord, der Cristiano Ronaldos Rekord von 2009 brach.",
        difficulty = 2,
        funFact = "Gareth Bale wurde nach seinem Wechsel zu Real Madrid mit drei Champions-League-Titeln belohnt und erzielte im Finale 2018 ein Fallrückzieher-Tor, das als eines der schönsten CL-Final-Tore gilt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Bosman-Urteil' im europaeischen Fussball und welche Konsequenzen hatte es?",
        answerA = "Ein Urteil, das Vereine zur Offenlegung ihrer Finanzen verpflichtet",
        answerB = "Ein EuGH-Urteil von 1995, das Spielern nach Vertragsende freie Wahl des Vereins und unbegrenzte EU-Auslaenderkontingente erlaubt",
        answerC = "Eine Regel, die Transfers zwischen Erstligisten auf 50 Millionen begrenzt",
        answerD = "Ein Abkommen ueber Mindestgehaelter fuer Nachwuchsspieler",
        correctAnswer = 1,
        explanation = "Das Bosman-Urteil des Europaeischen Gerichtshofes (1995) garantiert EU-Fussballspielern nach Vertragsende den freien Wechsel ohne Abloesegebuehr und erlaubt unbegrenzt EU-Auslaender in einer Mannschaft.",
        difficulty = 2,
        funFact = "Jean-Marc Bosman war ein belgischer Mittelfeldspieler, der gegen seinen Klub RCF Liege klagte, als dieser eine hoch e Ablöse fuer seinen Wechsel verlangte, obwohl sein Vertrag ausgelaufen war. Sein Name veränderte den Weltfussball."
    ),

)
