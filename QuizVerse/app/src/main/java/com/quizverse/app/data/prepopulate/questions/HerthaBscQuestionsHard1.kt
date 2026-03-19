package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsHard1(): List<Question> = listOf(

    // --- Gründungsgeschichte ---

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "An welchem genauen Datum wurde der BFC Hertha 1892 gegründet?",
        answerA = "12. März 1892",
        answerB = "25. Juli 1892",
        answerC = "3. Oktober 1892",
        answerD = "19. Dezember 1892",
        correctAnswer = 1,
        explanation = "Der BFC Hertha 1892 wurde am 25. Juli 1892 von den Brüderpaaren Fritz und Max Lindner sowie Otto und Willi Lorenz gegründet.",
        difficulty = 3,
        funFact = "Der Name 'Hertha' stammt von einem Dampfschiff mit blau-weißem Schornstein, das einer der Gründer mit seinem Vater befahren hatte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Woher stammt der Name 'Hertha' des Berliner Fußballvereins?",
        answerA = "Nach der germanischen Erdgöttin Hertha",
        answerB = "Nach einem Dampfschiff mit blau-weißem Schornstein",
        answerC = "Nach dem Berliner Stadtteil Hertha",
        answerD = "Nach der griechischen Göttin Hera",
        correctAnswer = 1,
        explanation = "Der Vereinsname 'Hertha' stammt von einem Dampfschiff mit blau-weißem Schornstein, mit dem einer der Gründer zusammen mit seinem Vater gefahren war.",
        difficulty = 3,
        funFact = "Die blau-weißen Vereinsfarben wurden ebenfalls durch die Farben dieses Dampfschiffs inspiriert."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welchem Berliner Stadtteil wurden die Wurzeln des BFC Hertha 1892 ursprünglich gelegt?",
        answerA = "Wedding und Prenzlauer Berg",
        answerB = "Charlottenburg und Wilmersdorf",
        answerC = "Spandau und Reinickendorf",
        answerD = "Tempelhof und Neukölln",
        correctAnswer = 0,
        explanation = "Die Wurzeln des Vereins liegen in den Berliner Stadtteilen Wedding und Prenzlauer Berg, wo die Gründerfamilien wohnten.",
        difficulty = 3,
        funFact = "Das Vereinsgelände befand sich ursprünglich auf einem Gelände im nördlichen Berlin, weit entfernt vom heutigen Olympiastadion."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Mit welchem Verein fusionierte Hertha 1923, woraus der Name 'Hertha BSC' entstand?",
        answerA = "Berliner FC Viktoria",
        answerB = "BFC Germania 1888",
        answerC = "Berliner SC",
        answerD = "Tennis Borussia Berlin",
        correctAnswer = 2,
        explanation = "Aufgrund finanzieller Probleme fusionierte Hertha 1923 mit dem Berliner SC, woraus der Name 'Hertha BSC' (Berliner Sport-Club) entstand.",
        difficulty = 3,
        funFact = "Die Wege trennten sich 1930 wieder, doch Hertha behielt den Namen 'BSC' bei."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wie hieß Hertha BSC in der unmittelbaren Nachkriegszeit von 1945 bis 1949?",
        answerA = "SG Moabit",
        answerB = "Sport-Club Berlin-Nord",
        answerC = "Ballspielverein Berlin 1892",
        answerD = "SG Gesundbrunnen",
        correctAnswer = 3,
        explanation = "Nach dem Zweiten Weltkrieg lösten die Alliierten alle deutschen Vereine auf. Hertha spielte von 1945 bis 1949 unter dem Namen SG Gesundbrunnen.",
        difficulty = 3,
        funFact = "Gesundbrunnen ist ein Ortsteil im Berliner Bezirk Mitte, der traditionell zur Heimat des Vereins gehört."
    ),

    // --- Deutsche Meisterschaften 1930 und 1931 ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein gewann Hertha BSC im Finale die Deutsche Meisterschaft 1930?",
        answerA = "Holstein Kiel",
        answerB = "FC Bayern München",
        answerC = "1. FC Nürnberg",
        answerD = "Hamburger SV",
        correctAnswer = 0,
        explanation = "Im Finale der Deutschen Meisterschaft 1930 besiegte Hertha BSC Holstein Kiel mit 5:4. Das Spiel fand am 22. Juni 1930 im Rheinstadion Düsseldorf statt.",
        difficulty = 3,
        funFact = "Es war der erste Meistertitel nach vier verlorenen Finalspielen in den Jahren 1926 bis 1929 – Hertha stand sechsmal in Folge im Endspiel."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Mit welchem Ergebnis besiegte Hertha BSC Holstein Kiel im Deutschen Meisterschaftsfinale 1930?",
        answerA = "3:1",
        answerB = "4:2",
        answerC = "5:4",
        answerD = "2:0",
        correctAnswer = 2,
        explanation = "Das Meisterschaftsfinale 1930 endete 5:4 für Hertha BSC gegen Holstein Kiel. Es war ein dramatisches Spiel vor 40.000 Zuschauern im Rheinstadion Düsseldorf.",
        difficulty = 3,
        funFact = "Das Spiel gilt noch heute als eines der aufregendsten Meisterschaftsfinale der deutschen Fußballgeschichte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Gegner verteidigte Hertha BSC seinen Meistertitel im Finale 1931?",
        answerA = "Eintracht Frankfurt",
        answerB = "1860 München",
        answerC = "Schalke 04",
        answerD = "VfB Stuttgart",
        correctAnswer = 1,
        explanation = "Im Finale 1931 besiegte Hertha BSC den TSV 1860 München mit 3:2 nach Verlängerung und gewann damit die zweite Deutsche Meisterschaft in Folge.",
        difficulty = 3,
        funFact = "Das Finale 1931 war umstritten, da zwei Herthatreffer als strittige Abseitsentscheidungen galten, der Schiedsrichter sie aber anerkannte."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In wie vielen aufeinanderfolgenden Meisterschaftsendspielen stand Hertha BSC zwischen 1926 und 1931?",
        answerA = "Vier",
        answerB = "Fünf",
        answerC = "Sechs",
        answerD = "Drei",
        correctAnswer = 2,
        explanation = "Hertha BSC stand von 1926 bis 1931 in sechs aufeinanderfolgenden Meisterschaftsendspielen – ein einmaliger Rekord in der deutschen Fußballgeschichte.",
        difficulty = 3,
        funFact = "Trotz dieser bemerkenswerten Serie gewann Hertha nur zweimal den Titel (1930, 1931) – die anderen vier Endspiele gingen verloren."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "In welcher Stadt fand das Deutsche Meisterschaftsfinale 1930 von Hertha BSC gegen Holstein Kiel statt?",
        answerA = "Berlin",
        answerB = "Hamburg",
        answerC = "Frankfurt am Main",
        answerD = "Düsseldorf",
        correctAnswer = 3,
        explanation = "Das Meisterschaftsfinale 1930 fand im Rheinstadion in Düsseldorf statt und wurde vor rund 40.000 Zuschauern ausgetragen.",
        difficulty = 3,
        funFact = "Das Rheinstadion in Düsseldorf war in den 1920er und 1930er Jahren ein bevorzugter Austragungsort für Meisterschaftsendspiele."
    ),

    // --- Frühgeschichte und Bundesliga-Gründung ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wie hieß das erste bekannte Heimstadion von Hertha BSC, das im Volksmund 'Die Plumpe' genannt wurde?",
        answerA = "Stadion am Gesundbrunnen",
        answerB = "Stadion Moabit",
        answerC = "Platz an der Beuthstraße",
        answerD = "Prenzlauer Berg Stadion",
        correctAnswer = 0,
        explanation = "Das bedeutende Heimstadion von Hertha BSC war das Stadion am Gesundbrunnen, das im Volksmund 'Die Plumpe' genannt wurde.",
        difficulty = 3,
        funFact = "Das Stadion am Gesundbrunnen war so nah an der Berliner Mauer, dass die Geräusche aus dem Stadion von Ost-Berlin aus zu hören waren."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wann wurde Hertha BSC Gründungsmitglied der neu gegründeten Fußball-Bundesliga?",
        answerA = "1960",
        answerB = "1963",
        answerC = "1965",
        answerD = "1958",
        correctAnswer = 1,
        explanation = "Als Berliner Stadtmeister wurde Hertha BSC 1963 Gründungsmitglied der neu eingeführten Fußball-Bundesliga.",
        difficulty = 3,
        funFact = "Die Bundesliga wurde als professionelle nationale Liga gegründet, um den deutschen Vereinsfußball zu vereinheitlichen und international konkurrenzfähiger zu machen."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr war Hertha BSC Gründungsmitglied des Deutschen Fußball-Bundes (DFB)?",
        answerA = "1900",
        answerB = "1895",
        answerC = "1904",
        answerD = "1898",
        correctAnswer = 0,
        explanation = "Hertha BSC war 1900 Gründungsmitglied des Deutschen Fußball-Bundes (DFB), der in Leipzig ins Leben gerufen wurde.",
        difficulty = 3,
        funFact = "Der DFB wurde am 28. Januar 1900 in Leipzig gegründet und ist heute einer der mitgliederstärksten Sportverbände der Welt."
    ),

    // --- Bestechungsskandal 1965 ---

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Weshalb wurde Hertha BSC 1965 trotz Klassenerhalt aus der Bundesliga ausgeschlossen?",
        answerA = "Wegen Spielmanipulationen gegen Abstiegsgegner",
        answerB = "Wegen Dopingvergehen mehrerer Spieler",
        answerC = "Wegen illegaler Handgelder und Verstöße gegen Spielerstatuten",
        answerD = "Wegen Fanausschreitungen und Stadionverboten",
        correctAnswer = 2,
        explanation = "Hertha BSC zahlte illegale Handgelder, um Spieler nach West-Berlin zu locken. Am 18. Mai 1965 wurde der Verein aus der Bundesliga ausgeschlossen.",
        difficulty = 3,
        funFact = "Der Ausschluss hatte weitreichende Folgen: Die Bundesliga wurde auf 18 Mannschaften erweitert, und der unqualifizierte Tasmania 1900 rückte als Berlins Vertreter nach."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher Verein wurde 1965 als Ersatz für den ausgeschlossenen Hertha BSC in die Bundesliga aufgenommen?",
        answerA = "Blau-Weiß 90 Berlin",
        answerB = "Tasmania 1900 Berlin",
        answerC = "Tennis Borussia Berlin",
        answerD = "BFC Dynamo Berlin",
        correctAnswer = 1,
        explanation = "Tasmania 1900 Berlin wurde ohne sportliche Qualifikation als Berlins Vertreter in die Bundesliga aufgenommen – und lieferte die schlechteste Saison in der Bundesligageschichte.",
        difficulty = 3,
        funFact = "Tasmania erzielte nur 2 Siege bei 28 Niederlagen und hält damit bis heute den Rekord für die schlechteste Bundesligasaison aller Zeiten."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wann gelang Hertha BSC nach dem Zwangsabstieg 1965 die Rückkehr in die Bundesliga?",
        answerA = "Saison 1966/67",
        answerB = "Saison 1967/68",
        answerC = "Saison 1970/71",
        answerD = "Saison 1968/69",
        correctAnswer = 3,
        explanation = "Nach dem Zwangsabstieg 1965 kehrte Hertha BSC in der Saison 1968/69 in die Bundesliga zurück und entwickelte sich dann zu Berlins beliebtestem Verein.",
        difficulty = 3,
        funFact = "Nach der Rückkehr entwickelte Hertha BSC eine treue Fangemeinde und etablierte sich als feste Größe in der Bundesliga der 1970er Jahre."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wie hieß der Vorsitzende von Hertha BSC, der im Zuge des Handgeld-Skandals 1965 mit einer Ämtersperre belegt wurde?",
        answerA = "Siegfried Schmidt",
        answerB = "Hans-Joachim Strecker",
        answerC = "Werner Körner",
        answerD = "Kurt Plöger",
        correctAnswer = 0,
        explanation = "Der erste Vorsitzende Siegfried Schmidt erhielt im Zuge des Handgeld-Skandals 1965 eine zweijährige Ämtersperre und eine Geldstrafe von 2.000 DM.",
        difficulty = 3,
        funFact = "Der Skandal erschütterte nicht nur Hertha BSC, sondern den gesamten deutschen Fußball und führte zur Reform verschiedener Regularien."
    ),

    // --- Berliner Mauer und DDR-Zeit ---

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welchen besonderen politischen Stellenwert hatte Hertha BSC für die Bundesliga nach dem Bau der Berliner Mauer 1961?",
        answerA = "Hertha war der einzige Ostberliner Verein in der Westliga",
        answerB = "Die Bundesliga wollte aus politischen Gründen unbedingt einen West-Berliner Vertreter",
        answerC = "Hertha bekam als einziger Verein DDR-Spieler verpflichten",
        answerD = "Hertha war das einzige Team mit eigener TV-Übertragung",
        correctAnswer = 1,
        explanation = "Nach dem Mauerbau wollte die Bundesliga aus politischen Gründen unbedingt einen West-Berliner Vertreter behalten, was letztlich zum Tasmania-Desaster führte.",
        difficulty = 3,
        funFact = "West-Berlin war eine Insel mitten in der DDR, und ein Bundesliga-Verein dort hatte für die Bundesrepublik erhebliche politische Symbolkraft."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher spätere Nationaltrainer kam 1950/51 als Spieler-Trainer zu Hertha BSC vom aufgelösten DDR-Vizemeister SG Dresden-Friedrichstadt?",
        answerA = "Sepp Herberger",
        answerB = "Jupp Derwall",
        answerC = "Helmut Schön",
        answerD = "Georg Keßler",
        correctAnswer = 2,
        explanation = "Helmut Schön, der spätere Bundestrainer, kam 1950/51 als Spieler-Trainer zu Hertha BSC vom aufgelösten DDR-Vizemeister SG Dresden-Friedrichstadt.",
        difficulty = 3,
        funFact = "Helmut Schön führte die deutsche Nationalmannschaft 1974 zum Weltmeistertitel und 1972 zur Europameisterschaft."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Was unterschied die Situation von Hertha BSC während der Berliner Teilung von anderen Bundesligavereinen?",
        answerA = "Hertha durfte keine ausländischen Spieler verpflichten",
        answerB = "Hertha bekam keine Fernsehgelder wie andere Vereine",
        answerC = "Hertha durfte nur gegen Berliner Vereine spielen",
        answerD = "Alle Auswärtsspiele mussten per Flugzeug absolviert werden",
        correctAnswer = 3,
        explanation = "Da West-Berlin eine Enklave inmitten der DDR war, mussten Hertha BSC-Spieler für alle Auswärtsspiele fliegen, da Autofahrten durch DDR-Gebiet problematisch waren.",
        difficulty = 3,
        funFact = "Diese Situation machte Hertha BSC zu einem einzigartigen Verein in der Bundesliga und stellte den Verein vor besondere logistische Herausforderungen."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gewann Hertha BSC nach dem Krieg die erste Berliner Oberliga-Meisterschaft?",
        answerA = "1957",
        answerB = "1951",
        answerC = "1960",
        answerD = "1953",
        correctAnswer = 0,
        explanation = "Hertha BSC gewann 1957 die Berliner Oberliga-Meisterschaft und begann damit seinen Aufstieg in den deutschen Spitzenfußball.",
        difficulty = 3,
        funFact = "1953 war Hertha sogar in die Amateurklasse abgestiegen – der Wiederaufstieg und die Meisterschaft 1957 waren daher ein beeindruckendes Comeback."
    ),

    // --- Olympiastadion ---

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde das Berliner Olympiastadion eröffnet?",
        answerA = "1932",
        answerB = "1936",
        answerC = "1938",
        answerD = "1934",
        correctAnswer = 1,
        explanation = "Das Berliner Olympiastadion wurde am 1. August 1936 für die Olympischen Sommerspiele 1936 eröffnet. Es wurde nach Plänen von Architekt Werner March gebaut.",
        difficulty = 3,
        funFact = "Das Olympiastadion war Teil des Reichssportfeldes und sollte die Macht des Nationalsozialismus demonstrieren – heute ist es ein denkmalgeschütztes Wahrzeichen Berlins."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welchen Jahren spielte Hertha BSC ausnahmsweise NICHT im Olympiastadion?",
        answerA = "1978–1980",
        answerB = "1983–1985",
        answerC = "1986–1988",
        answerD = "1990–1992",
        correctAnswer = 2,
        explanation = "Von 1986 bis 1988 spielte Hertha BSC ausnahmsweise nicht im Olympiastadion, kehrte danach aber wieder dorthin zurück.",
        difficulty = 3,
        funFact = "Seit der Bundesligagründung 1963 ist das Olympiastadion ansonsten durchgehend die Heimstätte von Hertha BSC."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Seit welchem Jahr findet das DFB-Pokal-Finale regelmäßig im Berliner Olympiastadion statt?",
        answerA = "1985",
        answerB = "1979",
        answerC = "1990",
        answerD = "1975",
        correctAnswer = 0,
        explanation = "Seit 1985 findet das DFB-Pokal-Finale jährlich im Berliner Olympiastadion statt, was dem Stadion eine besondere Bedeutung im deutschen Fußball verleiht.",
        difficulty = 3,
        funFact = "Das Berliner Olympiastadion ist damit auch für Fans anderer Vereine ein vertrauter Ort und wird von vielen als das 'Wembley des deutschen Fußballs' bezeichnet."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Von wann bis wann wurde das Berliner Olympiastadion grundlegend renoviert und modernisiert?",
        answerA = "1996–1999",
        answerB = "1998–2002",
        answerC = "2002–2006",
        answerD = "2000–2004",
        correctAnswer = 3,
        explanation = "Zwischen 2000 und 2004 wurde das Berliner Olympiastadion grundlegend renoviert und modernisiert – unter anderem als Vorbereitung auf die Fußball-WM 2006.",
        difficulty = 3,
        funFact = "Die Renovierung kostete rund 242 Millionen Euro. Das Dach wurde erneuert und alle Plätze überdacht, die Kapazität auf 74.244 Plätze angepasst."
    ),

    // --- Bundesliga-Geschichte 1970er und 1980er ---

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welchen besten Bundesliga-Platz erreichte Hertha BSC in der Saison 1974/75?",
        answerA = "Dritter Platz",
        answerB = "Zweiter Platz",
        answerC = "Erster Platz (Meister)",
        answerD = "Vierter Platz",
        correctAnswer = 1,
        explanation = "In der Saison 1974/75 erreichte Hertha BSC den zweiten Platz in der Bundesliga hinter Borussia Mönchengladbach – das bis dahin beste Ergebnis in der Bundesliga-Ära.",
        difficulty = 3,
        funFact = "Borussia Mönchengladbach dominierte mit Spielern wie Jupp Heynckes und Günter Netzer die damalige Bundesliga."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welche außerordentliche europäische Leistung gelang Hertha BSC in der Saison 1978/79 im UEFA-Pokal?",
        answerA = "Viertelfinal-Einzug",
        answerB = "Gruppenphase überstanden",
        answerC = "Halbfinal-Einzug",
        answerD = "Final-Einzug",
        correctAnswer = 2,
        explanation = "In der Saison 1978/79 erreichte Hertha BSC das Halbfinale des UEFA-Pokals – die bislang größte europäische Leistung des Vereins bis zur Champions-League-Teilnahme 1999.",
        difficulty = 3,
        funFact = "Das UEFA-Pokal-Halbfinale 1979 zeigte, dass Hertha BSC in den 1970ern international konkurrenzfähig war."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welchen beiden Jahren stand Hertha BSC im DFB-Pokal-Finale und verlor beide Male?",
        answerA = "1977 und 1979",
        answerB = "1975 und 1978",
        answerC = "1976 und 1980",
        answerD = "1974 und 1977",
        correctAnswer = 0,
        explanation = "Hertha BSC stand 1977 und 1979 im DFB-Pokal-Finale, verlor jedoch beide Endspiele. Das dritte Finale folgte 1993, das ebenfalls verloren ging.",
        difficulty = 3,
        funFact = "Hertha BSC hat den DFB-Pokal bis heute noch nie gewonnen – alle drei Finalteilnahmen (1977, 1979, 1993) blieben erfolglos."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC nach einer turbulenten Phase aus der Bundesliga ab?",
        answerA = "1978/79",
        answerB = "1974/75",
        answerC = "1983/84",
        answerD = "1979/80",
        correctAnswer = 3,
        explanation = "In der Saison 1979/80 stieg Hertha BSC aus der Bundesliga ab – der erste reguläre Abstieg nach dem Zwangsabstieg von 1965.",
        difficulty = 3,
        funFact = "Dieser Abstieg begann eine turbulente Phase mit mehreren Auf- und Abstiegen in den 1980er Jahren."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr stieg Hertha BSC 1953 in die unterste Klasse ab?",
        answerA = "Aus der Bundesliga (1. Liga)",
        answerB = "Aus der 2. Liga in die Regionalliga",
        answerC = "In die Berliner Amateurliga",
        answerD = "Aus der Oberliga in die 2. Liga",
        correctAnswer = 2,
        explanation = "1953 stieg Hertha BSC in die Berliner Amateurliga ab – ein Tiefpunkt in der Vereinsgeschichte. Der Wiederaufstieg gelang sofort.",
        difficulty = 3,
        funFact = "Nach dem Abstieg 1953 schaffte Hertha BSC den Wiederaufstieg innerhalb einer Saison und war 1957 bereits wieder Berliner Meister."
    ),

    // --- 1990er Jahre Aufstieg ---

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr erfolgte Herthas dramatischer Aufstieg, der als 'Geburtsstunde der neuen Hertha' gilt?",
        answerA = "1995",
        answerB = "1997",
        answerC = "1999",
        answerD = "1993",
        correctAnswer = 1,
        explanation = "Am 7. April 1997 sicherte sich Hertha BSC den Aufstieg in die Bundesliga – ein Datum, das als 'Geburtsstunde der neuen Hertha' in die Vereinsgeschichte einging.",
        difficulty = 3,
        funFact = "Der Aufstieg 1997 war der Beginn einer goldenen Ära für Hertha BSC, die in der Champions-League-Teilnahme 1999/2000 gipfelte."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welchen Wettbewerb gewann Hertha BSC zweimal hintereinander in den Jahren 2001 und 2002?",
        answerA = "Deutschen Ligapokal",
        answerB = "DFB-Pokal",
        answerC = "UEFA-Intertoto-Cup",
        answerD = "DFL-Supercup",
        correctAnswer = 0,
        explanation = "Hertha BSC gewann 2001 und 2002 zweimal in Folge den Deutschen Ligapokal – einen Wettbewerb, der inzwischen nicht mehr ausgetragen wird.",
        difficulty = 3,
        funFact = "Der Deutsche Ligapokal wurde von 1997 bis 2007 ausgetragen und war ein Sommerwettbewerb für die Top-Bundesligaklubs."
    ),

    // --- Champions League 1999/2000 ---

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welchen Bundesliga-Tabellenplatz belegte Hertha BSC in der Saison 1998/99, der zur erstmaligen Champions-League-Qualifikation führte?",
        answerA = "Dritter Platz",
        answerB = "Vierter Platz",
        answerC = "Zweiter Platz",
        answerD = "Erster Platz",
        correctAnswer = 2,
        explanation = "Hertha BSC beendete die Saison 1998/99 auf dem zweiten Tabellenplatz der Bundesliga und qualifizierte sich damit erstmals für die UEFA Champions League.",
        difficulty = 3,
        funFact = "Das war der bis dahin beste Bundesliga-Abschluss in der neueren Vereinsgeschichte."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wie weit kam Hertha BSC in der UEFA Champions League der Saison 1999/2000?",
        answerA = "Vorrunde (Gruppenphase 1)",
        answerB = "Viertelfinale",
        answerC = "Halbfinale",
        answerD = "Zweite Gruppenphase",
        correctAnswer = 3,
        explanation = "In der Saison 1999/2000 erreichte Hertha BSC die zweite Gruppenphase der UEFA Champions League – ein historischer Erfolg für den Berliner Verein.",
        difficulty = 3,
        funFact = "Die Champions-League-Teilnahme 1999/2000 ist bis heute der größte internationale Wettbewerbserfolg von Hertha BSC."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher ungarische Spieler wechselte 1997 zu Hertha BSC und wurde eine der wichtigsten Identifikationsfiguren des Vereins?",
        answerA = "Pál Dárdai",
        answerB = "Zoltán Gera",
        answerC = "Ádám Szalai",
        answerD = "Balázs Dzsudzsák",
        correctAnswer = 0,
        explanation = "Pál Dárdai wechselte 1997 zu Hertha BSC und wurde dort zu einer Vereinslegende. Nach seiner Spielerkarriere wurde er auch Trainer der Mannschaft.",
        difficulty = 3,
        funFact = "Pál Dárdai ist einer der wenigen Spieler, die sowohl als Spieler als auch als Trainer so eng mit Hertha BSC verbunden sind."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer führte Hertha BSC Ende der 1990er Jahre auf Platz zwei der Bundesliga und in die Champions League?",
        answerA = "Huub Stevens",
        answerB = "Jürgen Röber",
        answerC = "Falko Götz",
        answerD = "Andreas Thom",
        correctAnswer = 1,
        explanation = "Jürgen Röber trainierte Hertha BSC in der erfolgreichen Phase Ende der 1990er Jahre und führte die Mannschaft 1999 auf den zweiten Bundesligaplatz und in die Champions League.",
        difficulty = 3,
        funFact = "Jürgen Röber war einer der wichtigsten Architekten von Herthas goldener Ära in den späten 1990ern."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Shootingstar wechselte 1999 zu Hertha BSC und war Teil der erfolgreichen Bundesliga-Ära?",
        answerA = "Oliver Kahn",
        answerB = "Michael Ballack",
        answerC = "Sebastian Deisler",
        answerD = "Carsten Jancker",
        correctAnswer = 2,
        explanation = "Sebastian Deisler wechselte 1999 zu Hertha BSC und avancierte dort zum deutschen Nationalspieler und Shootingstar.",
        difficulty = 3,
        funFact = "Sebastian Deisler galt als eines der größten Talente des deutschen Fußballs, kämpfte aber während seiner Karriere mit Verletzungen und psychischen Erkrankungen."
    ),

    // --- Vereinswappen, Farben, Name ---

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welche Farben tragen die Spieler von Hertha BSC traditionell?",
        answerA = "Schwarz und Gelb",
        answerB = "Rot und Weiß",
        answerC = "Grün und Weiß",
        answerD = "Blau und Weiß",
        correctAnswer = 3,
        explanation = "Hertha BSC trägt traditionell Blau und Weiß als Vereinsfarben – inspiriert durch die Farben des Dampfschiffs 'Hertha', nach dem der Verein benannt wurde.",
        difficulty = 3,
        funFact = "Die blau-weißen Farben sind seit der Vereinsgründung 1892 unverändert und ein zentrales Element der Vereinsidentität."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Unter welchem Spitznamen ist Hertha BSC bekannt?",
        answerA = "Die Alte Dame",
        answerB = "Die Berliner",
        answerC = "Die Blauen",
        answerD = "Die Hauptstädter",
        correctAnswer = 0,
        explanation = "Hertha BSC wird liebevoll als 'Die Alte Dame' bezeichnet – ein Spitzname, der die lange Geschichte und Tradition des Berliner Vereins widerspiegelt.",
        difficulty = 3,
        funFact = "Der Begriff 'Alte Dame' ehrt den Status des Vereins als einer der ältesten und traditionsreichsten Fußballklubs in Deutschland."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Was bedeutet das 'BSC' im Vereinsnamen Hertha BSC vollständig ausgeschrieben?",
        answerA = "Berliner Sport-Centrum",
        answerB = "Berliner Sport-Club",
        answerC = "Berliner Sportvereinigung Charlottenburg",
        answerD = "Berliner Sportler-Clubverein",
        correctAnswer = 1,
        explanation = "BSC steht für 'Berliner Sport-Club', der Fusionspartner von 1923. Obwohl die Fusion 1930 aufgelöst wurde, behielt Hertha den Namenszusatz BSC bei.",
        difficulty = 3,
        funFact = "Der vollständige offizielle Vereinsname lautet heute 'Hertha BSC GmbH & Co. KGaA' in der modernen Vereinsstruktur."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr stand Hertha BSC zum dritten Mal in einem DFB-Pokal-Finale?",
        answerA = "1988/89",
        answerB = "1990/91",
        answerC = "1992/93",
        answerD = "1995/96",
        correctAnswer = 2,
        explanation = "In der Saison 1992/93 stand Hertha BSC zum dritten Mal im DFB-Pokal-Finale und verlor auch dieses. Alle drei Finals (1977, 1979, 1993) blieben erfolglos.",
        difficulty = 3,
        funFact = "Die dreifache Finalteilnahme ohne Titel ist ein schmerzhaftes Kapitel der Vereinsgeschichte – Hertha BSC hat den DFB-Pokal noch nie gewonnen."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Was ist die historische Besonderheit, dass Hertha BSC sowohl 1930 als auch 1931 Deutscher Meister wurde?",
        answerA = "Es ist der einzige Fall, dass ein Berliner Verein zweimal Meister wurde",
        answerB = "Es war der einzige Doppelerfolg nördlich des Mains",
        answerC = "Es war Deutschlands erster Meister-Hattrick",
        answerD = "Es sind bis heute die einzigen Deutschen Meistertitel von Hertha BSC",
        correctAnswer = 3,
        explanation = "Die Meisterschaften 1930 und 1931 sind bis heute die einzigen Deutschen Meistertitel in der Geschichte von Hertha BSC.",
        difficulty = 3,
        funFact = "Seitdem 1931 wartet Hertha BSC nun bereits fast 100 Jahre auf den nächsten Deutschen Meistertitel."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher legendäre Hertha-BSC-Spieler der 1920er/30er Jahre gilt als Schlüsselfigur der Meisterschaften 1930 und 1931?",
        answerA = "Johannes 'Hanne' Sobek",
        answerB = "Max Morlock",
        answerC = "Karl Hohmann",
        answerD = "Otto Rohde",
        correctAnswer = 0,
        explanation = "Johannes 'Hanne' Sobek war einer der prägenden Spieler von Hertha BSC in den 1920er und 1930er Jahren und ein wichtiger Teil der Meisterschaftsmannschaften.",
        difficulty = 3,
        funFact = "Johannes Sobek wurde auch als Nationalspieler eingesetzt und gilt als einer der bedeutendsten Berliner Fußballer der Zwischenkriegszeit."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr nahm Hertha BSC erstmals an einem europäischen Vereinswettbewerb teil?",
        answerA = "1965/66",
        answerB = "1971/72",
        answerC = "1978/79",
        answerD = "1974/75",
        correctAnswer = 1,
        explanation = "Hertha BSC nahm in der Saison 1971/72 erstmals an einem europäischen Wettbewerb teil.",
        difficulty = 3,
        funFact = "Die erste europäische Teilnahme war ein wichtiger Schritt für den Berliner Verein auf dem Weg zur internationalen Bühne."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welche besondere Subvention erhielt Hertha BSC als West-Berliner Verein während der deutschen Teilung?",
        answerA = "Steuerbefreiung als politisch bedeutsamer Verein",
        answerB = "Direktzuschüsse vom Berliner Senat",
        answerC = "Reisekostenzuschüsse für die teuren Flüge zu Auswärtsspielen",
        answerD = "Vergünstigte Stadionmiete vom Bund",
        correctAnswer = 2,
        explanation = "Hertha BSC erhielt Reisekostenzuschüsse für die notwendigen Flüge zu Auswärtsspielen, da eine Reise durch die DDR unmöglich oder problematisch war.",
        difficulty = 3,
        funFact = "Diese Sonderregelung war ein Zeichen dafür, wie wichtig die Bundesrepublik einen Berliner Vertreter in der Bundesliga politisch und symbolisch nahm."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wann spielte Hertha BSC in der Saison 1999/2000 in der Champions League – wie war die historische Einordnung?",
        answerA = "Es war der zweite Champions-League-Auftritt des Vereins",
        answerB = "Der Verein hatte zuvor schon zweimal am UEFA-Pokal-Finale teilgenommen",
        answerC = "Hertha scheiterte bereits in der Qualifikation",
        answerD = "Es war die erste und bislang einzige Champions-League-Teilnahme des Vereins",
        correctAnswer = 3,
        explanation = "Die Saison 1999/2000 war Hertha BSCs erste und bis heute einzige Teilnahme an der UEFA Champions League.",
        difficulty = 3,
        funFact = "Die Champions-League-Teilnahme gilt als Höhepunkt der modernen Vereinsgeschichte von Hertha BSC."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gab es bei Hertha BSC den tiefen Fall in die Drittklassigkeit (Regionalliga), bevor der Verein 1997 wieder aufstieg?",
        answerA = "1994",
        answerB = "1990",
        answerC = "1988",
        answerD = "1996",
        correctAnswer = 0,
        explanation = "Hertha BSC spielte Anfang der 1990er Jahre in der Regionalliga (drittklassig) und kämpfte finanziell ums Überleben – der Weg zurück in die Bundesliga 1997 war außergewöhnlich.",
        difficulty = 3,
        funFact = "Der Weg von der Regionalliga zur Champions League innerhalb weniger Jahre ist eine der bemerkenswertesten Vereinsgeschichten im deutschen Fußball."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie lautet der vollständige ursprüngliche Vereinsname, unter dem Hertha BSC 1892 gegründet wurde?",
        answerA = "Fußball-Club Hertha Berlin 1892",
        answerB = "Berliner Fußball-Club Hertha 1892",
        answerC = "Sport-Verein Hertha Berlin 1892",
        answerD = "Hertha Berliner Ballspiel-Club 1892",
        correctAnswer = 1,
        explanation = "Der ursprüngliche Vereinsname lautete 'Berliner Fußball-Club Hertha 1892' (BFC Hertha 1892), bevor der Name durch die Fusion von 1923 zu 'Hertha BSC' wurde.",
        difficulty = 3,
        funFact = "Der Kürzel 'BFC' stand für 'Berliner Fußball-Club' – erst die Fusion mit dem Berliner SC änderte den Vereinsnamen grundlegend."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welche Strafe erhielt Hertha BSC beim Bundesliga-Handgeld-Skandal 1965 neben dem Ausschluss aus der Bundesliga?",
        answerA = "Spielsperre für alle Nationalspieler",
        answerB = "Verbot jeglicher Neuverpflichtungen für drei Jahre",
        answerC = "Degradierung in die Regionalliga Berlin",
        answerD = "Entzug aller Bundesliga-Zuschüsse",
        correctAnswer = 2,
        explanation = "Hertha BSC wurde 1965 in die Regionalliga Berlin degradiert und durfte damit nicht mehr an der Bundesliga teilnehmen – trotz sportlichen Klassenerhalts.",
        difficulty = 3,
        funFact = "Der Zwangsabstieg in die Regionalliga war eine der härtesten Strafen, die je gegen einen deutschen Bundesligaverein verhängt wurde."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wann wurde Herthas legendäres früheres Heimstadion 'Die Plumpe' (Stadion am Gesundbrunnen) zuletzt für Bundesliga-Spiele genutzt?",
        answerA = "1968",
        answerB = "1970",
        answerC = "1960",
        answerD = "1963",
        correctAnswer = 3,
        explanation = "Das Stadion am Gesundbrunnen ('Die Plumpe') wurde bis 1963 für Ligaspiele genutzt. Als Hertha BSC Gründungsmitglied der Bundesliga wurde, genügte es nicht mehr den Anforderungen.",
        difficulty = 3,
        funFact = "Das Stadion am Gesundbrunnen steht symbolisch für die frühe Geschichte von Hertha BSC und die besondere Lage West-Berlins nahe der Mauer."
    ),

)
