package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun dortmundQuestions(): List<Question> = listOf(

    // ── EASY (10) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde Borussia Dortmund gegründet?",
        answerA = "1909",
        answerB = "1912",
        answerC = "1905",
        answerD = "1920",
        correctAnswer = 0,
        explanation = "Borussia Dortmund wurde am 19. Dezember 1909 gegründet.",
        difficulty = 1,
        funFact = "Der Verein wurde von jungen Männern gegründet, die sich gegen ihren Pfarrer durchsetzten, der ihnen die Mitgliedschaft im Athletik-Club Borussia verboten hatte."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie lautet der Spitzname von Borussia Dortmund?",
        answerA = "Die Schwarzen",
        answerB = "BVB",
        answerC = "Die Borussen",
        answerD = "Der BVB",
        correctAnswer = 1,
        explanation = "Borussia Dortmund wird allgemein als BVB abgekürzt, was für Ballspiel-Verein Borussia steht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Farben trägt Borussia Dortmund?",
        answerA = "Blau und Weiß",
        answerB = "Rot und Schwarz",
        answerC = "Schwarz und Gelb",
        answerD = "Grün und Weiß",
        correctAnswer = 2,
        explanation = "Borussia Dortmund spielt traditionell in Schwarz und Gelb, den Vereinsfarben seit den frühen Jahren.",
        difficulty = 1,
        funFact = "Die Farben Schwarz und Gelb sollen ursprünglich von einer lokalen Schule übernommen worden sein."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt das Stadion von Borussia Dortmund?",
        answerA = "Allianz Arena",
        answerB = "Signal Iduna Park",
        answerC = "Olympiastadion",
        answerD = "Volksparkstadion",
        correctAnswer = 1,
        explanation = "Das Heimstadion von BVB heißt seit 2005 Signal Iduna Park (nach dem Versicherungsunternehmen Signal Iduna).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wie nennt man die berühmte Südtribüne im Stadion von Borussia Dortmund?",
        answerA = "Nordkurve",
        answerB = "Rote Wand",
        answerC = "Gelbe Wand",
        answerD = "Schwarze Wand",
        correctAnswer = 2,
        explanation = "Die Südtribüne des Signal Iduna Parks wird als 'Gelbe Wand' bezeichnet und fasst über 25.000 Stehplätze.",
        difficulty = 1,
        funFact = "Die Gelbe Wand gilt als eine der lautesten und eindrucksvollsten Fankurven der Welt."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der BVB-Trainer, der den Verein in die goldene Ära 2010-2012 führte?",
        answerA = "Thomas Tuchel",
        answerB = "Ottmar Hitzfeld",
        answerC = "Jürgen Klopp",
        answerD = "Edin Terzic",
        correctAnswer = 2,
        explanation = "Jürgen Klopp trainierte Borussia Dortmund von 2008 bis 2015 und gewann zwei Bundesliga-Meisterschaften in Folge.",
        difficulty = 1,
        funFact = "Klopp wurde für seinen intensiven Pressing-Stil bekannt, den er 'Gegenpressing' nannte."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Stadt befindet sich Borussia Dortmund?",
        answerA = "Köln",
        answerB = "Essen",
        answerC = "Bochum",
        answerD = "Dortmund",
        correctAnswer = 3,
        explanation = "Borussia Dortmund kommt aus Dortmund im Ruhrgebiet in Nordrhein-Westfalen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt der Erzrivale von Borussia Dortmund im Revierderby?",
        answerA = "FC Schalke 04",
        answerB = "Bayer Leverkusen",
        answerC = "VfL Bochum",
        answerD = "MSV Duisburg",
        correctAnswer = 0,
        explanation = "Das Revierderby zwischen BVB und dem FC Schalke 04 gilt als eines der intensivsten Derbys im deutschen Fußball.",
        difficulty = 1,
        funFact = "Das Derby zwischen Dortmund und Schalke wird auch als 'Das Spiel' bezeichnet."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr gewann Borussia Dortmund die UEFA Champions League?",
        answerA = "1994",
        answerB = "1997",
        answerC = "2001",
        answerD = "2013",
        correctAnswer = 1,
        explanation = "BVB gewann die UEFA Champions League 1997 in München gegen Juventus Turin mit 3:1.",
        difficulty = 1,
        funFact = "Es war der erste Champions-League-Titel für einen deutschen Verein seit Bayern München 1976."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Trikot trägt BVB traditionell als Heimtrikot?",
        answerA = "Weißes Trikot mit schwarzen Streifen",
        answerB = "Schwarzes Trikot mit gelben Ärmeln",
        answerC = "Gelbes Trikot mit schwarzen Details",
        answerD = "Schwarz-gelbes Streifen-Trikot",
        correctAnswer = 2,
        explanation = "Das klassische Heimtrikot von BVB ist gelb mit schwarzen Details, das die Vereinsfarben widerspiegelt.",
        difficulty = 1,
        funFact = null
    ),

    // ── MEDIUM (15) ────────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wer schoss das entscheidende Tor im Champions-League-Finale 1997 gegen Juventus Turin?",
        answerA = "Stéphane Chapuisat",
        answerB = "Karl-Heinz Riedle",
        answerC = "Lars Ricken",
        answerD = "Andreas Möller",
        correctAnswer = 2,
        explanation = "Lars Ricken erzielte das 3:1 in der 71. Minute mit einem Lupfer kurz nach seiner Einwechslung und besiegelte damit den Sieg.",
        difficulty = 2,
        funFact = "Ricken war erst 20 Jahre alt und traf mit seinem ersten Ballkontakt im Finale."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Bundesliga-Meisterschaften hat Borussia Dortmund gewonnen?",
        answerA = "5",
        answerB = "6",
        answerC = "8",
        answerD = "10",
        correctAnswer = 2,
        explanation = "Borussia Dortmund gewann bislang acht Bundesliga-Meisterschaften (Stand 2024).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wer ist der Rekordtorschütze in der Geschichte von Borussia Dortmund?",
        answerA = "Robert Lewandowski",
        answerB = "Michael Zorc",
        answerC = "Stéphane Chapuisat",
        answerD = "Marco Reus",
        correctAnswer = 1,
        explanation = "Michael Zorc erzielte in seiner Karriere bei BVB 463 Pflichtspiele und ist mit 220 Toren Rekordtorschütze des Vereins.",
        difficulty = 2,
        funFact = "Zorc wurde später Sportdirektor bei BVB und prägte den Verein über Jahrzehnte."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr erreichte Borussia Dortmund erneut das Champions-League-Finale?",
        answerA = "2011",
        answerB = "2013",
        answerC = "2016",
        answerD = "2019",
        correctAnswer = 1,
        explanation = "2013 stand BVB im Champions-League-Finale in Wembley gegen Bayern München, verlor jedoch 1:2.",
        difficulty = 2,
        funFact = "Es war das erste rein deutsche Champions-League-Finale in der Geschichte des Wettbewerbs."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore schoss Erling Haaland in seiner ersten Bundesliga-Saison bei BVB (2019/20)?",
        answerA = "13",
        answerB = "16",
        answerC = "22",
        answerD = "27",
        correctAnswer = 1,
        explanation = "Erling Haaland erzielte in der Saison 2019/20 für BVB 16 Bundesliga-Tore – dies in nur 18 Spielen.",
        difficulty = 2,
        funFact = "Haaland erzielte in seinen ersten drei Bundesliga-Spielen für BVB fünf Tore."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Spieler wechselte 2013 im DFB-Pokalfinale von BVB zu Bayern München und wurde mit dem 'Verrat' assoziiert?",
        answerA = "Mario Götze",
        answerB = "Nuri Şahin",
        answerC = "Henrikh Mkhitaryan",
        answerD = "Kevin Großkreutz",
        correctAnswer = 0,
        explanation = "Mario Götze wechselte 2013 zu Bayern München, was viele BVB-Fans als Verrat empfanden, da er aus der BVB-Jugend stammte.",
        difficulty = 2,
        funFact = "Götze kehrte 2016 nach drei Jahren zu BVB zurück."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war Kapitän von Borussia Dortmund beim Champions-League-Finale 1997?",
        answerA = "Stefan Reuter",
        answerB = "Michael Zorc",
        answerC = "Andreas Möller",
        answerD = "Matthias Sammer",
        correctAnswer = 2,
        explanation = "Andreas Möller war Kapitän der BVB-Mannschaft beim Champions-League-Finale 1997 in München.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler gewann 2014 mit Deutschland die Fußball-Weltmeisterschaft und schoss das entscheidende Tor im Finale?",
        answerA = "Marco Reus",
        answerB = "Mats Hummels",
        answerC = "Mario Götze",
        answerD = "Ilkay Gündogan",
        correctAnswer = 2,
        explanation = "Mario Götze schoss im WM-Finale 2014 in der Verlängerung das 1:0 gegen Argentinien und sicherte Deutschland den Weltmeistertitel.",
        difficulty = 2,
        funFact = "Das Tor fiel in der 113. Minute der Verlängerung."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie lautet der ursprüngliche Name des Signal Iduna Parks?",
        answerA = "Ruhrstadion",
        answerB = "Westfalenstadion",
        answerC = "BVB Arena",
        answerD = "Dortmund Arena",
        correctAnswer = 1,
        explanation = "Das Stadion wurde 1974 als Westfalenstadion eröffnet und ist bis heute unter diesem Namen bekannt. Der Sponsorenname Signal Iduna Park gilt seit 2005.",
        difficulty = 2,
        funFact = "Das Westfalenstadion war Austragungsort von Spielen der Fußball-WM 1974 und 2006."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Zuschauer fasst der Signal Iduna Park bei Bundesliga-Spielen?",
        answerA = "62.000",
        answerB = "75.000",
        answerC = "81.365",
        answerD = "68.000",
        correctAnswer = 2,
        explanation = "Der Signal Iduna Park fasst bei nationalen Spielen 81.365 Zuschauer und ist damit das größte Fußballstadion Deutschlands.",
        difficulty = 2,
        funFact = "Bei internationalen Spielen (ohne Stehplätze) reduziert sich die Kapazität auf 66.099 Zuschauer."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Torwart war beim Champions-League-Sieg 1997 im Tor?",
        answerA = "Roman Weidenfeller",
        answerB = "Stefan Klos",
        answerC = "Jens Lehmann",
        answerD = "Marwin Hitz",
        correctAnswer = 1,
        explanation = "Stefan Klos war der Stammtorwart von BVB beim Champions-League-Sieg 1997.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wer trainierte BVB in der Saison des Champions-League-Sieges 1997?",
        answerA = "Nevio Scala",
        answerB = "Udo Lattek",
        answerC = "Ottmar Hitzfeld",
        answerD = "Bernd Krauss",
        correctAnswer = 0,
        explanation = "Der Italiener Nevio Scala trainierte Borussia Dortmund zum Champions-League-Sieg 1997.",
        difficulty = 2,
        funFact = "Scala war der erste ausländische Trainer, der die Champions League gewann."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt die BVB-Vereinshymne?",
        answerA = "Immer wieder Dortmund",
        answerB = "Heja BVB",
        answerC = "Echte Liebe",
        answerD = "Schwarz und Gelb",
        correctAnswer = 1,
        explanation = "Die offizielle Vereinshymne von Borussia Dortmund heißt 'Heja BVB'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Saison gewann BVB unter Klopp zwei Bundesliga-Meisterschaften in Folge?",
        answerA = "2009/10 und 2010/11",
        answerB = "2010/11 und 2011/12",
        answerC = "2011/12 und 2012/13",
        answerD = "2008/09 und 2009/10",
        correctAnswer = 1,
        explanation = "BVB gewann unter Jürgen Klopp die Bundesliga in den Saisons 2010/11 und 2011/12.",
        difficulty = 2,
        funFact = "In der Saison 2011/12 holte BVB den Titel mit 81 Punkten – einem damaligen Bundesliga-Rekord."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Schweizer Stürmer war eine Legende bei Borussia Dortmund in den 1990er Jahren?",
        answerA = "Granit Xhaka",
        answerB = "Stéphane Chapuisat",
        answerC = "Xherdan Shaqiri",
        answerD = "Hakan Yakin",
        correctAnswer = 1,
        explanation = "Stéphane Chapuisat spielte von 1991 bis 1999 für BVB und war einer der besten Stürmer seiner Zeit.",
        difficulty = 2,
        funFact = "Chapuisat erzielte 106 Tore in 270 Bundesliga-Spielen für BVB."
    ),

    // ── HARD (12) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Was war das Ergebnis des Champions-League-Finales 1997 gegen Juventus Turin?",
        answerA = "2:1",
        answerB = "3:1",
        answerC = "2:0",
        answerD = "4:2",
        correctAnswer = 1,
        explanation = "BVB besiegte Juventus Turin im Finale am 28. Mai 1997 in München mit 3:1. Karl-Heinz Riedle traf zweimal, Lars Ricken schoss das dritte Tor.",
        difficulty = 3,
        funFact = "Alessandro Del Piero traf für Juventus zum zwischenzeitlichen 1:2."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Wettbewerb gewann BVB 1966 seinen ersten großen internationalen Titel?",
        answerA = "UEFA-Pokal",
        answerB = "Europapokal der Pokalsieger",
        answerC = "Messepokal",
        answerD = "Intertoto-Cup",
        correctAnswer = 1,
        explanation = "BVB gewann 1966 den Europapokal der Pokalsieger als erster westdeutscher Verein, der einen Europapokal holte.",
        difficulty = 3,
        funFact = "Im Finale besiegte BVB den FC Liverpool mit 2:1 nach Verlängerung."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt der ehemalige BVB-Spieler, der 1996 Europameister mit Deutschland wurde und als einer der besten deutschen Spieler gilt?",
        answerA = "Andreas Möller",
        answerB = "Stefan Reuter",
        answerC = "Matthias Sammer",
        answerD = "Karl-Heinz Riedle",
        correctAnswer = 2,
        explanation = "Matthias Sammer gewann 1996 die Europameisterschaft und wurde zudem zum Europas Fußballer des Jahres gewählt – er spielte damals für BVB.",
        difficulty = 3,
        funFact = "Sammer war der letzte deutsche Spieler, der als Europas Fußballer des Jahres ausgezeichnet wurde (1996)."
    ),

    Question(
        categoryId = 14,
        questionText = "Wann stand BVB zuletzt im Champions-League-Finale (nach 2013)?",
        answerA = "2019",
        answerB = "2021",
        answerC = "2023",
        answerD = "2024",
        correctAnswer = 3,
        explanation = "Borussia Dortmund erreichte im Jahr 2024 erneut das Champions-League-Finale in Wembley, verlor jedoch gegen Real Madrid mit 0:2.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher polnische Stürmer wechselte 2010 ablösefrei von Lech Posen zu BVB und wurde zur Vereinslegende?",
        answerA = "Arkadiusz Milik",
        answerB = "Jakub Błaszczykowski",
        answerC = "Robert Lewandowski",
        answerD = "Łukasz Piszczek",
        correctAnswer = 2,
        explanation = "Robert Lewandowski wechselte 2010 ablösefrei von Lech Posen zu BVB und wurde unter Klopp zum Weltklassestürmer.",
        difficulty = 3,
        funFact = "Lewandowski wechselte 2014 ablösefrei zu Bayern München, nachdem er seinen Vertrag nicht verlängerte."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr meldete Borussia Dortmund fast Insolvenz an?",
        answerA = "2001",
        answerB = "2003",
        answerC = "2005",
        answerD = "2007",
        correctAnswer = 1,
        explanation = "2003 stand Borussia Dortmund kurz vor der Insolvenz, nachdem der Verein zu viel für Spielertransfers ausgegeben hatte.",
        difficulty = 3,
        funFact = "Dortmund war der erste börsennotierte Fußballclub Deutschlands (seit 2000)."
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen wen gewann BVB das DFB-Pokalfinale 2012 in Berlin?",
        answerA = "Schalke 04",
        answerB = "Bayer Leverkusen",
        answerC = "Bayern München",
        answerD = "Hamburger SV",
        correctAnswer = 2,
        explanation = "BVB gewann 2012 das DFB-Pokalfinale gegen Bayern München mit 5:2 und holte damit das Double.",
        difficulty = 3,
        funFact = "Es war der erste Gewinn des Doubles (Meisterschaft + Pokal) in der Geschichte von BVB."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore schoss Karl-Heinz Riedle im Champions-League-Finale 1997 gegen Juventus?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "0",
        correctAnswer = 1,
        explanation = "Karl-Heinz Riedle traf in der 29. und 34. Minute und brachte BVB mit 2:0 in Führung.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Rekord stellte der Signal Iduna Park bei seiner Renovierung in den 2000er Jahren auf?",
        answerA = "Größtes Dach Europas",
        answerB = "Größte LED-Flutlichtanlage",
        answerC = "Größtes Fußballstadion der Welt",
        answerD = "Größte Stehplatztribüne Europas",
        correctAnswer = 3,
        explanation = "Die Gelbe Wand (Südtribüne) ist die größte Stehplatztribüne Europas mit über 25.000 Stehplätzen.",
        difficulty = 3,
        funFact = "Insgesamt hat der Signal Iduna Park 24.454 Stehplätze auf der Südtribüne allein."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Trainer holte nach Klopp erneut den DFB-Pokal für den Verein im Jahr 2017?",
        answerA = "Peter Bosz",
        answerB = "Thomas Tuchel",
        answerC = "Lucien Favre",
        answerD = "Roger Schmidt",
        correctAnswer = 1,
        explanation = "Thomas Tuchel gewann mit BVB 2017 den DFB-Pokal gegen Eintracht Frankfurt mit 2:1.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wurde beim Bombenanschlag auf den Mannschaftsbus im April 2017 verletzt?",
        answerA = "Marco Reus",
        answerB = "Marc Bartra",
        answerC = "Pierre-Emerick Aubameyang",
        answerD = "Roman Bürki",
        correctAnswer = 1,
        explanation = "Der spanische Verteidiger Marc Bartra wurde beim Anschlag auf den BVB-Bus am 11. April 2017 verletzt.",
        difficulty = 3,
        funFact = "Der Anschlag erfolgte kurz vor einem Champions-League-Viertelfinalspiel gegen AS Monaco."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt der langjährige BVB-Sportdirektor, der selbst Vereinsikone als Spieler war?",
        answerA = "Michael Zorc",
        answerB = "Lars Ricken",
        answerC = "Karl-Heinz Riedle",
        answerD = "Andreas Möller",
        correctAnswer = 0,
        explanation = "Michael Zorc war nach seiner Spielerkarriere viele Jahre Sportdirektor bei Borussia Dortmund.",
        difficulty = 3,
        funFact = "Zorc war insgesamt über 30 Jahre mit BVB verbunden – als Spieler und als Funktionär."
    ),

    // ── EXPERT (8) ─────────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "In welchem Stadion fand das Champions-League-Finale 1997 zwischen BVB und Juventus Turin statt?",
        answerA = "Wembley Stadium",
        answerB = "Santiago Bernabéu",
        answerC = "Münchner Olympiastadion",
        answerD = "San Siro",
        correctAnswer = 2,
        explanation = "Das Finale fand am 28. Mai 1997 im Olympiastadion München statt – gewissermaßen ein Heimspiel für den deutschen Vertreter.",
        difficulty = 4,
        funFact = "Für BVB war es ein Heimspiel-Finale, da Juventus die Auswärtsmannschaft war."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Rückennummer trug Marco Reus bei Borussia Dortmund während seiner gesamten Karriere?",
        answerA = "7",
        answerB = "10",
        answerC = "11",
        answerD = "9",
        correctAnswer = 2,
        explanation = "Marco Reus trug bei BVB stets die Rückennummer 11 und war von 2012 bis 2024 Vereinskapitän.",
        difficulty = 4,
        funFact = "Reus verzichtete mehrfach auf lukrative Wechselangebote, um BVB treu zu bleiben."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Transferrekord stellte Borussia Dortmund mit dem Verkauf von Erling Haaland im Jahr 2022 auf?",
        answerA = "75 Millionen Euro",
        answerB = "60 Millionen Euro",
        answerC = "85 Millionen Euro",
        answerD = "100 Millionen Euro",
        correctAnswer = 1,
        explanation = "Erling Haaland wurde 2022 für rund 60 Millionen Euro (inklusive Ausstiegsklausel) zu Manchester City verkauft.",
        difficulty = 4,
        funFact = "Haaland erzielte in 67 Pflichtspielen für BVB 86 Tore – eine überragende Quote."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt die offizielle Mitgliederzahl von Borussia Dortmund (ca. Stand 2023)?",
        answerA = "Über 100.000",
        answerB = "Über 150.000",
        answerC = "Über 200.000",
        answerD = "Über 250.000",
        correctAnswer = 1,
        explanation = "BVB hat über 150.000 eingetragene Mitglieder und ist damit einer der mitgliederstärksten Sportvereine Deutschlands.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welche BVB-Junioren-Akademie gilt als eine der besten in Deutschland?",
        answerA = "BVB Sportschule",
        answerB = "BVB NLZ (Nachwuchsleistungszentrum)",
        answerC = "Kicker Akademie Dortmund",
        answerD = "Ruhr Fußball Akademie",
        correctAnswer = 1,
        explanation = "Das Nachwuchsleistungszentrum (NLZ) von BVB gilt als eine der besten Jugendakademien Deutschlands und brachte Spieler wie Mario Götze hervor.",
        difficulty = 4,
        funFact = "Das NLZ von BVB wurde mehrfach mit dem DFL-Stern für herausragende Nachwuchsarbeit ausgezeichnet."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte das schnellste Bundesliga-Tor in der Geschichte von Borussia Dortmund?",
        answerA = "Pierre-Emerick Aubameyang",
        answerB = "Erling Haaland",
        answerC = "Karim Adeyemi",
        answerD = "Donyell Malen",
        correctAnswer = 1,
        explanation = "Erling Haaland ist für einige der schnellsten Tore in BVBs Bundesliga-Geschichte verantwortlich und traf regelmäßig nach unter einer Minute.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde das Westfalenstadion (heutiger Signal Iduna Park) zur WM 1974 eröffnet?",
        answerA = "1972",
        answerB = "1974",
        answerC = "1976",
        answerD = "1970",
        correctAnswer = 0,
        explanation = "Das Westfalenstadion wurde 1972 eröffnet, zwei Jahre vor der Weltmeisterschaft 1974.",
        difficulty = 4,
        funFact = "Das Stadion kostete bei seiner Eröffnung rund 34 Millionen Deutsche Mark."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der erste ausländische Spieler, den Borussia Dortmund jemals verpflichtete?",
        answerA = "Bert Trautmann",
        answerB = "Hans Tilkowski",
        answerC = "Willie Ormond",
        answerD = "Zigi Latos",
        correctAnswer = 3,
        explanation = "Zigi Latos, ein jugoslawischer Spieler, war einer der frühen ausländischen Spieler bei BVB in den Nachkriegsjahren.",
        difficulty = 4,
        funFact = null
    ),

    // ── MASTER (5) ─────────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wie lautet die genaue Gründungsadresse bzw. der Gründungsort von Borussia Dortmund im Jahr 1909?",
        answerA = "Im Gasthaus 'Zum Wildschütz'",
        answerB = "Im Stadtpark Dortmund",
        answerC = "In der Dreifaltigkeitskirche",
        answerD = "Im Ratskeller Dortmund",
        correctAnswer = 0,
        explanation = "Borussia Dortmund wurde am 19. Dezember 1909 im Gasthaus 'Zum Wildschütz' in Dortmund gegründet.",
        difficulty = 5,
        funFact = "Die Gründungsmitglieder waren größtenteils Jugendliche des Kirchenchors Heilige Dreifaltigkeit."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche BVB-Spieler standen im Kader des Champions-League-Sieges 1997 UND gewannen im selben Jahr mit Deutschland die U17-Weltmeisterschaft?",
        answerA = "Lars Ricken und Jens Lehmann",
        answerB = "Es gab keinen solchen Spieler",
        answerC = "Sebastian Kehl",
        answerD = "Sven Bender",
        correctAnswer = 1,
        explanation = "Es gab keinen BVB-Spieler, der 1997 sowohl den Champions-League-Sieg als auch die U17-WM gewann. Lars Ricken war im CL-Kader, aber nicht U17-Weltmeister in dem Jahr.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Was war der genaue Marktwertverlust von BVB durch die Insolvenz-Krise Anfang der 2000er Jahre?",
        answerA = "Etwa 100 Millionen Euro Schulden",
        answerB = "Etwa 118 Millionen Euro Schulden",
        answerC = "Etwa 200 Millionen Euro Schulden",
        answerD = "Etwa 150 Millionen Euro Schulden",
        correctAnswer = 1,
        explanation = "Zur Zeit der Krise 2003/2004 hatte BVB Schulden von rund 118 Millionen Euro angehäuft.",
        difficulty = 5,
        funFact = "Nur ein Notkredit der Deutschen Bank rettete den Verein vor der endgültigen Insolvenz."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Bundesliga-Rekordserie stellte BVB in der Saison 2011/12 auf?",
        answerA = "Meiste Siege in einer Saison (28)",
        answerB = "Längste Siegesserie (18 Spiele)",
        answerC = "Höchste Punktzahl einer Saison (81 Punkte)",
        answerD = "Meiste erzielte Tore in einer Saison (108)",
        correctAnswer = 2,
        explanation = "BVB holte in der Saison 2011/12 unter Klopp 81 Punkte – die bis dahin höchste Punktzahl in der Bundesliga-Geschichte.",
        difficulty = 5,
        funFact = "Dieser Rekord wurde später von Bayern München übertroffen."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler der Meistermannschaft 1995/96 spielte zuvor in der DDR-Nationalmannschaft?",
        answerA = "Stefan Reuter",
        answerB = "Matthias Sammer",
        answerC = "Andreas Möller",
        answerD = "Michael Zorc",
        correctAnswer = 1,
        explanation = "Matthias Sammer spielte vor der Wiedervereinigung für die DDR-Nationalmannschaft und danach für die gesamtdeutsche Nationalelf.",
        difficulty = 5,
        funFact = "Sammer ist damit einer der wenigen Spieler, der sowohl für die DDR als auch für Deutschland spielte."
    )
)
