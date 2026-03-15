package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestions(): List<Question> = listOf(

    // --- EASY (difficulty = 1) ---

    Question(
        categoryId = 6,
        questionText = "Wie viele Spieler hat eine Fußballmannschaft auf dem Feld?",
        answerA = "9",
        answerB = "10",
        answerC = "11",
        answerD = "12",
        correctAnswer = 2,
        explanation = "Eine Fußballmannschaft besteht aus 11 Spielern auf dem Feld, inklusive Torwart.",
        difficulty = 1,
        funFact = "Das erste Regelwerk mit 11 Spielern pro Team wurde 1863 von der Football Association festgelegt."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Land fanden die Olympischen Sommerspiele 2020 statt?",
        answerA = "China",
        answerB = "Brasilien",
        answerC = "Japan",
        answerD = "Australien",
        correctAnswer = 2,
        explanation = "Die Olympischen Sommerspiele 2020 fanden 2021 in Tokio, Japan statt – verschoben wegen der Corona-Pandemie.",
        difficulty = 1,
        funFact = "Es waren die ersten Olympischen Spiele in der Geschichte, die um ein Jahr verschoben wurden."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Sets gewinnt ein Tennisspieler in einem Grand-Slam-Herrenfinale?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Bei Grand-Slam-Turnieren spielen Herren im Best-of-5-Modus. Wer zuerst 3 Sätze gewinnt, gewinnt das Match.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das Ziel beim Golfen?",
        answerA = "Den Ball so oft wie möglich zu schlagen",
        answerB = "Den Ball mit möglichst wenigen Schlägen ins Loch zu bringen",
        answerC = "Den Ball so weit wie möglich zu werfen",
        answerD = "Den Ball über eine Linie zu schießen",
        correctAnswer = 1,
        explanation = "Im Golf gewinnt der Spieler, der die 18 Löcher mit den wenigsten Schlägen absolviert.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Farbe hat die Rückseite einer Tischtennis-Schlägerseite laut offiziellen Regeln?",
        answerA = "Blau und Gelb",
        answerB = "Rot und Schwarz",
        answerC = "Grün und Weiß",
        answerD = "Orange und Grau",
        correctAnswer = 1,
        explanation = "Laut offiziellen ITTF-Regeln muss ein Seite des Tischtennisschlägers rot und die andere schwarz sein.",
        difficulty = 1,
        funFact = "Diese Regel wurde 1986 eingeführt, damit Gegner erkennen können, welcher Belag benutzt wird."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportart wird in Wimbledon ausgetragen?",
        answerA = "Badminton",
        answerB = "Squash",
        answerC = "Tennis",
        answerD = "Golf",
        correctAnswer = 2,
        explanation = "Wimbledon ist das bekannteste Tennisturnier der Welt und wird jährlich in London ausgetragen.",
        difficulty = 1,
        funFact = "Wimbledon ist das älteste Tennisturnier der Welt – die erste Ausgabe fand 1877 statt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie lange dauert ein reguläres Basketballspiel in der NBA?",
        answerA = "32 Minuten",
        answerB = "40 Minuten",
        answerC = "48 Minuten",
        answerD = "60 Minuten",
        correctAnswer = 2,
        explanation = "Ein NBA-Spiel dauert 48 Minuten, aufgeteilt in vier Viertel à 12 Minuten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nation hat die meisten Olympia-Goldmedaillen in der Geschichte gewonnen?",
        answerA = "Russland",
        answerB = "Deutschland",
        answerC = "China",
        answerD = "USA",
        correctAnswer = 3,
        explanation = "Die USA führen die ewige Bestenliste der Olympischen Sommerspiele mit der höchsten Anzahl an Goldmedaillen an.",
        difficulty = 1,
        funFact = "Die USA haben bisher über 1000 Goldmedaillen bei Olympischen Sommerspielen gewonnen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet 'Eigentor' im Fußball?",
        answerA = "Ein Tor aus großer Distanz",
        answerB = "Ein Tor, das ein Spieler in sein eigenes Netz schießt",
        answerC = "Ein Tor nach einem Freistoß",
        answerD = "Ein Tor nach einem Elfmeter",
        correctAnswer = 1,
        explanation = "Ein Eigentor entsteht, wenn ein Spieler den Ball versehentlich in sein eigenes Tor befördert – der Gegner erhält den Punkt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmstil ist der schnellste?",
        answerA = "Rückenschwimmen",
        answerB = "Brustschwimmen",
        answerC = "Schmetterlingsstil",
        answerD = "Freistil (Kraul)",
        correctAnswer = 3,
        explanation = "Der Freistil (Kraulstil) ist die schnellste Schwimmart und wird von Spitzenschwimmern bevorzugt.",
        difficulty = 1,
        funFact = "Im Freistilschwimmen können Profis über 100 Meter Geschwindigkeiten von fast 9 km/h erreichen."
    ),

    // --- MEDIUM (difficulty = 2) ---

    Question(
        categoryId = 6,
        questionText = "Wie oft hat Deutschland die FIFA Fußball-Weltmeisterschaft gewonnen?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Deutschland hat die Fußball-Weltmeisterschaft viermal gewonnen: 1954, 1974, 1990 und 2014.",
        difficulty = 2,
        funFact = "Der Sieg 1954 in Bern gilt als 'Wunder von Bern' und hat Deutschland nach dem Krieg wieder Hoffnung gegeben."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Formel-1-Fahrer hat die meisten Weltmeistertitel gewonnen?",
        answerA = "Ayrton Senna",
        answerB = "Michael Schumacher",
        answerC = "Lewis Hamilton",
        answerD = "Sebastian Vettel",
        correctAnswer = 2,
        explanation = "Sowohl Michael Schumacher als auch Lewis Hamilton haben je 7 Formel-1-Weltmeistertitel gewonnen – gemeinsamer Rekord.",
        difficulty = 2,
        funFact = "Michael Schumacher gewann seine ersten zwei Titel mit Benetton, die restlichen fünf mit Ferrari."
    ),

    Question(
        categoryId = 6,
        questionText = "In welcher Stadt fand die erste moderne Olympiade 1896 statt?",
        answerA = "London",
        answerB = "Paris",
        answerC = "Athen",
        answerD = "Stockholm",
        correctAnswer = 2,
        explanation = "Die ersten modernen Olympischen Spiele fanden 1896 in Athen, Griechenland statt.",
        difficulty = 2,
        funFact = "An den ersten modernen Olympischen Spielen nahmen 241 Athleten aus 14 Nationen teil."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Punkte erhält ein Basketballkorb hinter der Dreierlinie?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "4",
        correctAnswer = 2,
        explanation = "Ein Korb von jenseits der Dreierlinie bringt 3 Punkte, ein regulärer Korb 2 Punkte, ein Freiwurf 1 Punkt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Tennisspieler gewann 1985 als 17-Jähriger erstmals Wimbledon?",
        answerA = "Michael Stich",
        answerB = "Boris Becker",
        answerC = "Tommy Haas",
        answerD = "Nicolas Kiefer",
        correctAnswer = 1,
        explanation = "Boris Becker gewann 1985 als jüngster Spieler und erster Ungesetzter die Wimbledon-Championships.",
        difficulty = 2,
        funFact = "Boris Becker gewann Wimbledon insgesamt dreimal: 1985, 1986 und 1989."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Distanz wird beim Marathon gelaufen?",
        answerA = "40 km",
        answerB = "40,195 km",
        answerC = "42,195 km",
        answerD = "45 km",
        correctAnswer = 2,
        explanation = "Ein Marathon ist exakt 42,195 Kilometer lang – diese Strecke wurde bei den Olympischen Spielen 1908 in London standardisiert.",
        difficulty = 2,
        funFact = "Die Marathonstrecke von 42,195 km entstand, weil das Rennen 1908 vom Windsor Castle bis zur Ziellinie im Olympiastadion genau diese Länge hatte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land hat den Fußball-Weltpokal (FIFA WM) am häufigsten gewonnen?",
        answerA = "Deutschland",
        answerB = "Argentinien",
        answerC = "Brasilien",
        answerD = "Italien",
        correctAnswer = 2,
        explanation = "Brasilien hat die FIFA Fußball-Weltmeisterschaft fünfmal gewonnen (1958, 1962, 1970, 1994, 2002).",
        difficulty = 2,
        funFact = "Brasilien ist das einzige Land, das an jeder Fußball-Weltmeisterschaft teilgenommen hat."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Hat-Trick' im Sport?",
        answerA = "Ein Fehler in Folge",
        answerB = "Drei Erfolge desselben Spielers in einem Spiel",
        answerC = "Ein Sieg ohne Gegentor",
        answerD = "Eine besondere Auszeichnung für den besten Spieler",
        correctAnswer = 1,
        explanation = "Ein Hat-Trick bezeichnet drei Treffer oder Erfolge desselben Spielers in einem einzigen Spiel.",
        difficulty = 2,
        funFact = "Der Begriff 'Hat-Trick' stammt ursprünglich aus dem Kricket und beschrieb drei Wickets in drei aufeinanderfolgenden Würfen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Skispringer gewann viermal in Folge die Vierschanzentournee?",
        answerA = "Sven Hannawald",
        answerB = "Martin Schmitt",
        answerC = "Georg Thoma",
        answerD = "Andreas Wellinger",
        correctAnswer = 0,
        explanation = "Sven Hannawald gewann als erster Sportler überhaupt alle vier Springen der Vierschanzentournee in der Saison 2001/2002.",
        difficulty = 2,
        funFact = "Dieser Grand Slam gelang danach erst wieder Kamil Stoch (2018) und Ryōyū Kobayashi (2019)."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie nennt man im Tennis das Ergebnis 40:40?",
        answerA = "Vorteil",
        answerB = "Einstand",
        answerC = "Tiebreak",
        answerD = "Match",
        correctAnswer = 1,
        explanation = "Wenn beide Spieler 40 Punkte haben, spricht man von 'Einstand' (Deuce). Danach muss ein Spieler zwei Punkte in Folge gewinnen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr fanden die Olympischen Winterspiele in München statt?",
        answerA = "1956",
        answerB = "1972",
        answerC = "1976",
        answerD = "Noch nie in München",
        correctAnswer = 3,
        explanation = "München hat nie Olympische Winterspiele ausgetragen. Die Olympischen Sommerspiele fanden 1972 in München statt.",
        difficulty = 2,
        funFact = "Die Olympischen Spiele 1972 in München wurden durch das Münchner Olympia-Attentat überschattet, bei dem 11 israelische Sportler getötet wurden."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmer gilt als erfolgreichster Olympiateilnehmer aller Zeiten?",
        answerA = "Ian Thorpe",
        answerB = "Mark Spitz",
        answerC = "Michael Phelps",
        answerD = "Ryan Lochte",
        correctAnswer = 2,
        explanation = "Michael Phelps gewann insgesamt 23 Olympia-Goldmedaillen und ist damit der erfolgreichste Olympionike aller Zeiten.",
        difficulty = 2,
        funFact = "Michael Phelps gewann bei den Olympischen Spielen 2008 in Peking acht Goldmedaillen in einem einzigen Turnier."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Team gewann die erste Basketball-NBA-Meisterschaft?",
        answerA = "Boston Celtics",
        answerB = "Los Angeles Lakers",
        answerC = "Chicago Bulls",
        answerD = "Philadelphia Warriors",
        correctAnswer = 3,
        explanation = "Die Philadelphia Warriors gewannen 1947 die erste NBA-Meisterschaft (damals als BAA bekannt).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Runden hat ein Boxkampf im Profibereich maximal?",
        answerA = "10",
        answerB = "12",
        answerC = "15",
        answerD = "20",
        correctAnswer = 1,
        explanation = "Professionelle Titelkämpfe haben maximal 12 Runden à 3 Minuten. Früher waren es 15 Runden.",
        difficulty = 2,
        funFact = "Die Reduzierung von 15 auf 12 Runden erfolgte 1982 nach dem Tod des Boxers Duk Koo Kim."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Fußballverein hat die UEFA Champions League am häufigsten gewonnen?",
        answerA = "FC Barcelona",
        answerB = "Bayern München",
        answerC = "Real Madrid",
        answerD = "AC Mailand",
        correctAnswer = 2,
        explanation = "Real Madrid hat die UEFA Champions League (ehemals Europapokal der Landesmeister) am häufigsten gewonnen.",
        difficulty = 2,
        funFact = "Real Madrid gewann in den ersten fünf Jahren der Europacup-Geschichte (1956–1960) stets den Titel."
    ),

    // --- HARD (difficulty = 3) ---

    Question(
        categoryId = 6,
        questionText = "Welcher Leichtathlet hält den Weltrekord über 100 Meter der Männer?",
        answerA = "Tyson Gay",
        answerB = "Asafa Powell",
        answerC = "Usain Bolt",
        answerD = "Justin Gatlin",
        correctAnswer = 2,
        explanation = "Usain Bolt hält seit 2009 mit 9,58 Sekunden den Weltrekord über 100 Meter der Männer, aufgestellt in Berlin.",
        difficulty = 3,
        funFact = "Bolt stellte diesen Rekord bei den Weltmeisterschaften 2009 in Berlin auf – ausgerechnet in der deutschen Hauptstadt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie oft hat Steffi Graf das French Open in Paris gewonnen?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 2,
        explanation = "Steffi Graf gewann das French Open sechsmal (1987, 1988, 1993, 1995, 1996, 1999).",
        difficulty = 3,
        funFact = "Steffi Graf ist die einzige Tennisspielerin, die einen Golden Slam gewann – alle vier Grand Slams plus olympisches Gold in einem Jahr (1988)."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei welchen Olympischen Spielen führte die deutsche Staffel durch Staffelfehler die 4x100m-Goldmedaille ab?",
        answerA = "Sydney 2000",
        answerB = "Athen 2004",
        answerC = "Peking 2008",
        answerD = "London 2012",
        correctAnswer = 0,
        explanation = "Bei den Olympischen Spielen 2000 in Sydney gewann die deutsche 4x100m-Staffel Gold, nachdem die US-Staffel disqualifiziert wurde.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Formel-1-Fahrer verunglückte 1994 tödlich beim Grand Prix von San Marino in Imola?",
        answerA = "Roland Ratzenberger",
        answerB = "Ayrton Senna",
        answerC = "Gilles Villeneuve",
        answerD = "Stefan Bellof",
        correctAnswer = 1,
        explanation = "Ayrton Senna verunglückte am 1. Mai 1994 beim Grand Prix von San Marino in Tamburello-Kurve tödlich.",
        difficulty = 3,
        funFact = "Am selben Rennwochenende starb auch der Österreicher Roland Ratzenberger – ein schwarzes Wochenende für die Formel 1."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land gewann bei den Olympischen Winterspielen 2022 in Peking die meisten Goldmedaillen?",
        answerA = "Norwegen",
        answerB = "Deutschland",
        answerC = "USA",
        answerD = "Kanada",
        correctAnswer = 0,
        explanation = "Norwegen gewann bei den Olympischen Winterspielen 2022 in Peking mit 16 Goldmedaillen die Nationenwertung.",
        difficulty = 3,
        funFact = "Norwegen ist die erfolgreichste Nation in der Geschichte der Olympischen Winterspiele."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Basketball-Spieler wird als 'GOAT' (Greatest of All Time) am meisten diskutiert?",
        answerA = "Kareem Abdul-Jabbar",
        answerB = "Magic Johnson",
        answerC = "LeBron James",
        answerD = "Michael Jordan",
        correctAnswer = 3,
        explanation = "Michael Jordan wird von vielen Experten als der beste Basketballspieler aller Zeiten angesehen, obwohl LeBron James ebenfalls als ernsthafter Anwärter gilt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Marke stellt die meisten Formel-1-Motoren seit 2014 für verschiedene Teams bereit?",
        answerA = "Ferrari",
        answerB = "Renault",
        answerC = "Mercedes",
        answerD = "Honda",
        correctAnswer = 2,
        explanation = "Mercedes-Motoren dominierten von 2014 bis 2021 die Formel 1 und versorgten mehrere Teams mit ihren Antriebseinheiten.",
        difficulty = 3,
        funFact = "Die Mercedes-Ära von 2014 bis 2021 gilt als eine der dominantesten Phasen in der Geschichte der Formel 1."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Fußballer erzielte 2014 im WM-Finale das entscheidende Tor?",
        answerA = "Thomas Müller",
        answerB = "Miroslav Klose",
        answerC = "Mario Götze",
        answerD = "Mesut Özil",
        correctAnswer = 2,
        explanation = "Mario Götze erzielte in der Verlängerung des WM-Finals 2014 gegen Argentinien das 1:0 und sicherte Deutschland den vierten Weltmeistertitel.",
        difficulty = 3,
        funFact = "Mario Götze wurde von Bundestrainer Joachim Löw mit den Worten eingewechselt: 'Zeig der Welt, dass du besser bist als Messi.'"
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Kilometer beträgt die längste Etappe der Tour de France typischerweise?",
        answerA = "150–180 km",
        answerB = "200–230 km",
        answerC = "250–280 km",
        answerD = "300–330 km",
        correctAnswer = 1,
        explanation = "Die längsten Flachetappen der Tour de France liegen typischerweise zwischen 200 und 230 Kilometern.",
        difficulty = 3,
        funFact = "In den Anfangsjahren der Tour de France (1903) gab es Etappen von über 400 Kilometern."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Deutsche gewann 2008 in Peking Gold im Modernen Fünfkampf?",
        answerA = "Steffen Zesner",
        answerB = "Andrejus Zadneprovskis",
        answerC = "Lénárd Petrovics",
        answerD = "Andrei Moiseev",
        correctAnswer = 3,
        explanation = "Der Russe Andrei Moiseev gewann 2008 in Peking Gold im Modernen Fünfkampf. Kein Deutscher gewann in dieser Disziplin.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heißt das Regelwerk, das bestimmt, ob ein Fußballspieler im Abseits steht?",
        answerA = "Regel 10",
        answerB = "Regel 11",
        answerC = "Regel 12",
        answerD = "Regel 13",
        correctAnswer = 1,
        explanation = "Die Abseitsregel ist in Regel 11 der offiziellen FIFA-Spielregeln festgelegt.",
        difficulty = 3,
        funFact = "Die Abseitsregel wurde mehrfach verändert. Seit 1925 reicht ein Gegenspieler (außer dem Torwart) statt vorher zwei."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Skifahrer gewann die meisten alpinen Ski-Weltcup-Gesamtwertungen?",
        answerA = "Ingemar Stenmark",
        answerB = "Marcel Hirscher",
        answerC = "Hermann Maier",
        answerD = "Pirmin Zurbriggen",
        correctAnswer = 1,
        explanation = "Marcel Hirscher gewann von 2012 bis 2019 acht aufeinanderfolgende Ski-Weltcup-Gesamtwertungen – ein absoluter Rekord.",
        difficulty = 3,
        funFact = "Hirscher ist auch Rekordhalter mit 67 Weltcupsiegen in seiner Karriere."
    ),

    // --- EXPERT (difficulty = 4) ---

    Question(
        categoryId = 6,
        questionText = "Welcher Tennisspieler gewann 2023 alle vier Grand-Slam-Titel?",
        answerA = "Novak Djokovic",
        answerB = "Carlos Alcaraz",
        answerC = "Rafael Nadal",
        answerD = "Daniil Medvedev",
        correctAnswer = 0,
        explanation = "Novak Djokovic gewann 2023 drei von vier Grand Slams (Australian Open, French Open, US Open). Alcaraz gewann Wimbledon.",
        difficulty = 4,
        funFact = "Djokovic hält mit 24 Grand-Slam-Titeln den absoluten Rekord bei den Herren."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Mindestgeschwindigkeit muss ein Kugelstoßer bei den Olympischen Spielen erreichen, um in der Qualifikation zu bestehen?",
        answerA = "18,50 m",
        answerB = "19,50 m",
        answerC = "20,20 m",
        answerD = "21,10 m",
        correctAnswer = 2,
        explanation = "Die Qualifikationsnorm für den Kugelstoß der Männer bei den Olympischen Spielen liegt typischerweise bei 20,20 Metern.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Formel-1-Fahrer gewann 2021 auf dramatische Weise den WM-Titel beim letzten Rennen in Abu Dhabi?",
        answerA = "Valtteri Bottas",
        answerB = "Max Verstappen",
        answerC = "Charles Leclerc",
        answerD = "Sergio Pérez",
        correctAnswer = 1,
        explanation = "Max Verstappen gewann 2021 in der letzten Runde des letzten Rennens den Formel-1-Weltmeistertitel gegen Lewis Hamilton.",
        difficulty = 4,
        funFact = "Das Rennen in Abu Dhabi 2021 gilt als eines der umstrittensten in der F1-Geschichte wegen der Entscheidung des Rennleiters Michael Masi."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Biathlet gewann bei den Olympischen Winterspielen 2018 in Pyeongchang vier Goldmedaillen?",
        answerA = "Martin Fourcade",
        answerB = "Johannes Thingnes Bø",
        answerC = "Arnd Peiffer",
        answerD = "Johannes Dale",
        correctAnswer = 0,
        explanation = "Martin Fourcade gewann bei den Olympischen Winterspielen 2018 in Pyeongchang zwei Goldmedaillen (Einzel und Massenstart) – nicht vier. Diese Frage testet das genaue Wissen.",
        difficulty = 4,
        funFact = "Der Franzose Martin Fourcade ist einer der erfolgreichsten Biathleten aller Zeiten mit fünf Olympiasiegen."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr gründete Sepp Herberger den modernen deutschen Fußball und welche Taktik revolutionierte er?",
        answerA = "1936, das WM-System",
        answerB = "1950, die Libero-Taktik",
        answerC = "1936, die Viererkette",
        answerD = "1948, das Pressing",
        correctAnswer = 0,
        explanation = "Sepp Herberger wirkte von 1936 als Bundestrainer und setzte damals das WM-System ein, eine taktische Formation mit 3-2-5-Aufstellung.",
        difficulty = 4,
        funFact = "Sepp Herberger führte Deutschland 1954 zum 'Wunder von Bern' und war insgesamt 28 Jahre Nationaltrainer."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Schwimmer stellte bei den Weltmeisterschaften 2009 in Rom die meisten Weltrekorde auf?",
        answerA = "Michael Phelps",
        answerB = "Ryan Lochte",
        answerC = "Paul Biedermann",
        answerD = "César Cielo",
        correctAnswer = 2,
        explanation = "Der Deutsche Paul Biedermann schlug bei den WM 2009 in Rom Michael Phelps und stellte Weltrekorde über 200m und 400m Freistil auf.",
        difficulty = 4,
        funFact = "Biedermanns Weltrekorde wurden im umstrittenen Polyurethan-Anzug geschwommen, der danach verboten wurde."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie lautet der Spitzname des Sportgerichts des deutschen Fußballs?",
        answerA = "Sportgericht",
        answerB = "DFB-Gericht",
        answerC = "Sportgericht des DFB",
        answerD = "Kontrollausschuss",
        correctAnswer = 2,
        explanation = "Das 'Sportgericht des DFB' ist das zuständige Gremium für Disziplinarmaßnahmen im deutschen Fußball.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Sportler gewann bei den Olympischen Sommerspielen 1936 in Berlin vier Goldmedaillen und durchkreuzte damit Hitlers Rassenideologie?",
        answerA = "Ralph Metcalfe",
        answerB = "Jesse Owens",
        answerC = "Luz Long",
        answerD = "Mack Robinson",
        correctAnswer = 1,
        explanation = "Jesse Owens gewann bei den Olympischen Spielen 1936 in Berlin vier Goldmedaillen in Sprint, Weitsprung und Staffel.",
        difficulty = 4,
        funFact = "Der Deutsche Luz Long half Jesse Owens im Weitsprung-Wettkampf mit einem Tipp zur Anlauftechnik – eine bemerkenswerte Geste angesichts des politischen Klimas."
    ),

    // --- MASTER (difficulty = 5) ---

    Question(
        categoryId = 6,
        questionText = "Welchen Weltrekord hält der äthiopische Marathonläufer Kelvin Kiptum, der 2023 in Chicago aufgestellt wurde?",
        answerA = "2:00:35",
        answerB = "2:01:09",
        answerC = "2:00:10",
        answerD = "1:59:40",
        correctAnswer = 0,
        explanation = "Kelvin Kiptum lief am 8. Oktober 2023 beim Chicago Marathon in 2:00:35 Stunden und stellte damit den Marathon-Weltrekord auf.",
        difficulty = 5,
        funFact = "Kiptum verstarb tragischerweise im Februar 2024 bei einem Verkehrsunfall in Kenia. Sein Rekord bleibt posthum anerkannt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Besonderheit hat das Nürburgring-Streckenlayout, das es von anderen Formel-1-Strecken unterscheidet?",
        answerA = "Es hat die meisten Rechtskurven weltweit",
        answerB = "Es gibt zwei verschiedene Streckenversionen: Grand-Prix-Strecke und Nordschleife",
        answerC = "Es ist die höchstgelegene F1-Strecke Europas",
        answerD = "Es ist die einzige Strecke ohne permanente Tribünen",
        correctAnswer = 1,
        explanation = "Der Nürburgring hat eine moderne Grand-Prix-Strecke (für F1) und die legendäre Nordschleife (26 km), die als gefährlichste Rennstrecke der Welt gilt.",
        difficulty = 5,
        funFact = "Die Nordschleife des Nürburgrings hat 73 Kurven und gilt als Maßstab für Fahrzeugtests – viele Autohersteller testen dort ihre Serienfahrzeuge."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Hochspringer übersprang 1968 als erster die 2,24-Meter-Marke mit dem revolutionären Fosbury-Flop?",
        answerA = "Valeriy Brumel",
        answerB = "Dick Fosbury",
        answerC = "Charles Austin",
        answerD = "Javier Sotomayor",
        correctAnswer = 1,
        explanation = "Dick Fosbury revolutionierte 1968 den Hochsprung mit seinem Rückensprung (Fosbury-Flop) und gewann Olympia-Gold in Mexiko City.",
        difficulty = 5,
        funFact = "Vor Fosburys Technik sprangen Hochspringer mit dem Rollsprung oder dem Straddle. Heute verwenden nahezu alle Topathleten den Fosbury-Flop."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Grand-Slam-Titel hat Roger Federer in seiner Karriere insgesamt gewonnen?",
        answerA = "17",
        answerB = "18",
        answerC = "19",
        answerD = "20",
        correctAnswer = 3,
        explanation = "Roger Federer gewann in seiner Karriere 20 Grand-Slam-Titel, bevor er 2022 zurücktrat.",
        difficulty = 5,
        funFact = "Federer gewann 8 Wimbledon-Titel, was einem Rekord entspricht. Er hielt lange Zeit den Rekord für die meisten Grand-Slam-Titel überhaupt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Eisschnellläufer gewann bei den Olympischen Winterspielen 1992 in Albertville fünf Goldmedaillen?",
        answerA = "Gunda Niemann",
        answerB = "Claudia Pechstein",
        answerC = "Anni Friesinger",
        answerD = "Jacqueline Börner",
        correctAnswer = 0,
        explanation = "Gunda Niemann (heute Niemann-Stirnemann) ist eine der erfolgreichsten deutschen Eisschnellläuferinnen, gewann aber nicht fünf Goldmedaillen bei einem einzigen Olympia. Kein Deutscher gewann je fünf bei einer Winterolympiade.",
        difficulty = 5,
        funFact = null
    )
)
