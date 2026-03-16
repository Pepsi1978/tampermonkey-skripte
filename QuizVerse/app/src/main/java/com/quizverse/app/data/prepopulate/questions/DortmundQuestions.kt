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
    ),

    // ── NEW EASY (15) ──────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welchen Titel trägt der BVB-Cheftrainer, der im Volksmund auch als 'Vereinsikone' bezeichnet wird und seit 2021 mehrfach als Interimstrainer einsprang?",
        answerA = "Edin Terzic",
        answerB = "Niko Kovač",
        answerC = "Hansi Flick",
        answerD = "Rudi Völler",
        correctAnswer = 0,
        explanation = "Edin Terzic gewann mit BVB 2021 den DFB-Pokal als Interimstrainer und wurde danach Cheftrainer. Er ist ein überzeugter BVB-Fan seit Kindheitstagen.",
        difficulty = 1,
        funFact = "Terzic wuchs als BVB-Fan auf und arbeitete sich vom Co-Trainer bis zum Cheftrainer vor."
    ),

    Question(
        categoryId = 14,
        questionText = "Was bedeutet das Kürzel 'BVB'?",
        answerA = "Berliner Verkehrsbetriebe Borussia",
        answerB = "Ballspiel-Verein Borussia",
        answerC = "Bundesliga-Verein Borussia",
        answerD = "Bürgerlicher Verein Borussia",
        correctAnswer = 1,
        explanation = "BVB steht für Ballspiel-Verein Borussia e.V. Dortmund — der vollständige offizielle Vereinsname.",
        difficulty = 1,
        funFact = "Das Wort 'Borussia' ist der lateinische Name für Preußen."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Bundesliga-Meisterschaften gewann BVB in den Jahren 2010-2012?",
        answerA = "Nur eine Meisterschaft 2011",
        answerB = "Zwei Meisterschaften in Folge (2011 und 2012)",
        answerC = "Drei Meisterschaften in Folge",
        answerD = "Keine, BVB war Vizemeister",
        correctAnswer = 1,
        explanation = "Unter Trainer Jürgen Klopp gewann BVB zwei Bundesliga-Meisterschaften in Folge: 2010/11 und 2011/12.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt der norwegische Torjäger, der von 2020 bis 2022 für BVB spielte und für seine zahlreichen Tore bekannt wurde?",
        answerA = "Martin Ødegaard",
        answerB = "Joshua King",
        answerC = "Erling Haaland",
        answerD = "Alexander Sørloth",
        correctAnswer = 2,
        explanation = "Erling Haaland spielte von Januar 2020 bis Sommer 2022 für BVB und erzielte dabei 86 Tore in 89 Pflichtspielen.",
        difficulty = 1,
        funFact = "Haaland wechselte für eine festgeschriebene Ablösesumme von 60 Millionen Euro zu Manchester City."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Bundesland liegt die Stadt Dortmund?",
        answerA = "Bayern",
        answerB = "Hessen",
        answerC = "Sachsen",
        answerD = "Nordrhein-Westfalen",
        correctAnswer = 3,
        explanation = "Dortmund liegt im Ruhrgebiet in Nordrhein-Westfalen, dem bevölkerungsreichsten Bundesland Deutschlands.",
        difficulty = 1,
        funFact = "Dortmund ist mit rund 600.000 Einwohnern die größte Stadt im Ruhrgebiet."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Vereinsmotto verwendet Borussia Dortmund?",
        answerA = "Für immer Schwarz-Gelb",
        answerB = "Echte Liebe",
        answerC = "Immer wieder BVB",
        answerD = "Mit Herz und Leidenschaft",
        correctAnswer = 1,
        explanation = "Das offizielle Vereinsmotto von Borussia Dortmund lautet 'Echte Liebe' — ein Ausdruck der tiefen Verbundenheit zwischen Verein und Fans.",
        difficulty = 1,
        funFact = "Das Motto 'Echte Liebe' wurde zu einem der bekanntesten Markenslogans im deutschen Fußball."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der langjährige Vereinspräsident von Borussia Dortmund, der den Verein nach der Insolvenz-Krise rettete?",
        answerA = "Hans-Joachim Watzke",
        answerB = "Gerd Niebaum",
        answerC = "Reinhard Rauball",
        answerD = "Thomas Treß",
        correctAnswer = 0,
        explanation = "Hans-Joachim Watzke übernahm 2005 als Geschäftsführer und stabilisierte den Verein nach der Finanzkrise. Er ist noch heute CEO des BVB.",
        difficulty = 1,
        funFact = "Watzke ist seit 2005 Geschäftsführer bei BVB und damit einer der dienstältesten Chefs im deutschen Profifußball."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Liga spielt Borussia Dortmund?",
        answerA = "2. Bundesliga",
        answerB = "Bundesliga (1. Liga)",
        answerC = "Champions League (ohne Bundesliga)",
        answerD = "Regionalliga West",
        correctAnswer = 1,
        explanation = "Borussia Dortmund spielt in der Bundesliga, der höchsten deutschen Fußballliga.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler ist bekannt als 'Mister BVB' und spielte von 2012 bis 2024 für den Verein?",
        answerA = "Lukasz Piszczek",
        answerB = "Sven Bender",
        answerC = "Marco Reus",
        answerD = "Mats Hummels",
        correctAnswer = 2,
        explanation = "Marco Reus spielte von 2012 bis 2024 für BVB, war Vereinskapitän und wird als 'Mister BVB' bezeichnet.",
        difficulty = 1,
        funFact = "Reus lehnte mehrere lukrative Angebote von anderen Topvereinen ab, um BVB treu zu bleiben."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Farbe hat das Auswärtstrikot von Borussia Dortmund traditionell?",
        answerA = "Rot",
        answerB = "Blau",
        answerC = "Schwarz",
        answerD = "Weiß",
        correctAnswer = 2,
        explanation = "Das klassische Auswärtstrikot von BVB ist schwarz — die zweite Vereinsfarbe neben Gelb.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wann feierte Borussia Dortmund seinen 100. Geburtstag?",
        answerA = "2005",
        answerB = "2007",
        answerC = "2009",
        answerD = "2011",
        correctAnswer = 2,
        explanation = "Da BVB am 19. Dezember 1909 gegründet wurde, feierte der Verein im Jahr 2009 seinen 100. Geburtstag.",
        difficulty = 1,
        funFact = "Zum 100. Jubiläum wurde ein Sondertrikot herausgegeben und es gab große Feierlichkeiten in der Stadt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Gabrizio ist berühmt als BVB-Ikone der 1990er Jahre mit seiner unverwechselbaren Haarpracht?",
        answerA = "Júlio César",
        answerB = "Paolo Sousa",
        answerC = "Paulo Sousa",
        answerD = "Júlio Cruz",
        correctAnswer = 1,
        explanation = "Paolo Sousa, der portugiesische Mittelfeldspieler, spielte in den erfolgreichen BVB-Jahren der 1990er und war Teil des Champions-League-Sieger-Kaders 1997.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wie nennt man Fans von Borussia Dortmund umgangssprachlich?",
        answerA = "Schwarz-Rote",
        answerB = "Borussen",
        answerC = "Westfalen",
        answerD = "Ruhrpottler",
        correctAnswer = 1,
        explanation = "BVB-Fans werden oft als 'Borussen' bezeichnet — abgeleitet vom Vereinsnamen Borussia Dortmund.",
        difficulty = 1,
        funFact = "BVB hat eine der treuesten und lautesten Fangemeinden Europas."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Spiel gilt als das wichtigste Derby für BVB?",
        answerA = "BVB gegen Bayern München",
        answerB = "BVB gegen Bayer Leverkusen",
        answerC = "Revierderby gegen Schalke 04",
        answerD = "BVB gegen Hamburger SV",
        correctAnswer = 2,
        explanation = "Das Revierderby zwischen BVB und dem FC Schalke 04 ist das wichtigste Derby für BVB-Fans.",
        difficulty = 1,
        funFact = "Zwischen Dortmund und Gelsenkirchen (Schalkes Heimatstadt) liegen nur etwa 30 Kilometer."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele DFB-Pokaltitel hat Borussia Dortmund gewonnen?",
        answerA = "2",
        answerB = "4",
        answerC = "6",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Borussia Dortmund hat bislang 4 DFB-Pokaltitel gewonnen (1965, 1989, 2012, 2017, Stand 2024).",
        difficulty = 1,
        funFact = null
    ),

    // ── NEW MEDIUM (20) ────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wer erzielte beim DFB-Pokalfinale 2012 gegen Bayern München das erste Tor für BVB?",
        answerA = "Robert Lewandowski",
        answerB = "Marco Reus",
        answerC = "Ilkay Gündogan",
        answerD = "Shinji Kagawa",
        correctAnswer = 0,
        explanation = "Robert Lewandowski erzielte im DFB-Pokalfinale 2012 das erste Tor für BVB beim 5:2-Sieg gegen Bayern München.",
        difficulty = 2,
        funFact = "Lewandowski traf in diesem Finale gleich zweimal."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher japanische Mittelfeldspieler spielte unter Klopp für BVB und wurde dort Bundesliga-Meister?",
        answerA = "Keisuke Honda",
        answerB = "Shinji Kagawa",
        answerC = "Takumi Minamino",
        answerD = "Hiroshi Kiyotake",
        correctAnswer = 1,
        explanation = "Shinji Kagawa spielte von 2010 bis 2012 und erneut von 2014 bis 2019 für BVB und wurde zweifacher Bundesliga-Meister.",
        difficulty = 2,
        funFact = "Kagawa war der erste Japaner, der in der Bundesliga zum Meister wurde."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Spitznamen hat Pierre-Emerick Aubameyang erhalten, weil er auf dem Platz wie ein Gepard sprintete?",
        answerA = "Der Panther",
        answerB = "Der Blitz",
        answerC = "Auba",
        answerD = "Der Falke",
        correctAnswer = 2,
        explanation = "Pierre-Emerick Aubameyang wurde bei BVB schlicht 'Auba' genannt. Er spielte von 2013 bis 2018 für den Verein und war bekannt für seine Schnelligkeit.",
        difficulty = 2,
        funFact = "Aubameyang war in der Saison 2016/17 Bundesliga-Torschützenkönig mit 31 Toren."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler gewann in der Saison 2010/11 die Bundesliga-Torjägerkrone?",
        answerA = "Mario Götze",
        answerB = "Lucas Barrios",
        answerC = "Robert Lewandowski",
        answerD = "Kevin Großkreutz",
        correctAnswer = 2,
        explanation = "Robert Lewandowski war in der Meistersaison 2010/11 einer der gefährlichsten Stürmer der Liga und trug maßgeblich zur Meisterschaft bei.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein gewann BVB das DFB-Pokalfinale 2021 unter Edin Terzic?",
        answerA = "RB Leipzig",
        answerB = "Eintracht Frankfurt",
        answerC = "Bayer Leverkusen",
        answerD = "Bayern München",
        correctAnswer = 0,
        explanation = "BVB gewann unter Edin Terzic im Mai 2021 das DFB-Pokalfinale gegen RB Leipzig mit 4:1.",
        difficulty = 2,
        funFact = "Erling Haaland erzielte dabei einen Hattrick."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Verteidiger wechselte 2016 zu Bayern München und kehrte 2023 wieder zu BVB zurück?",
        answerA = "Neven Subotić",
        answerB = "Ömer Toprak",
        answerC = "Mats Hummels",
        answerD = "Sokratis Papastathopoulos",
        correctAnswer = 2,
        explanation = "Mats Hummels wechselte 2016 zu Bayern München und kehrte 2019 (nicht 2023) zu BVB zurück, bevor er 2024 den Verein verließ.",
        difficulty = 2,
        funFact = "Hummels gilt als einer der besten Innenverteidiger seiner Generation."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der erste BVB-Trainer in der Bundesliga-Geschichte des Vereins?",
        answerA = "Hermann Eppenhoff",
        answerB = "Heinz Murach",
        answerC = "Horst Witzler",
        answerD = "Willi Multhaup",
        correctAnswer = 0,
        explanation = "Hermann Eppenhoff war einer der frühen BVB-Trainer und führte den Verein in der frühen Bundesliga-Ära.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Saison erreichte BVB unter Trainer Lucien Favre die Champions League-Gruppenphase mit dem besten Bundesliga-Start aller Zeiten?",
        answerA = "2017/18",
        answerB = "2018/19",
        answerC = "2019/20",
        answerD = "2020/21",
        correctAnswer = 1,
        explanation = "In der Saison 2018/19 startete BVB unter Favre mit einer Serie von Siegen hervorragend und führte zeitweise die Bundesliga-Tabelle an.",
        difficulty = 2,
        funFact = "BVB gewann die ersten sieben Bundesligaspiele der Saison 2018/19 in Folge."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer ist der englische Mittelfeldspieler, der 2011 unter Klopp von Real Madrid zu BVB wechselte?",
        answerA = "Joe Hart",
        answerB = "Nuri Şahin",
        answerC = "Kevin De Bruyne",
        answerD = "İlkay Gündoğan",
        correctAnswer = 1,
        explanation = "Nuri Şahin wechselte 2011 zu Real Madrid, kam aber dann leihweise zurück. Er war zuvor schon als BVB-Talent bekannt und wurde 2012 Bundesliga-Meister.",
        difficulty = 2,
        funFact = "Şahin war 2010/11 der jüngste Bundesliga-Meister der Geschichte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Transferrekord stellte BVB auf, als sie Jadon Sancho 2021 an Manchester United verkauften?",
        answerA = "65 Millionen Euro",
        answerB = "73 Millionen Euro",
        answerC = "85 Millionen Euro",
        answerD = "100 Millionen Euro",
        correctAnswer = 2,
        explanation = "Jadon Sancho wurde 2021 für rund 85 Millionen Euro von BVB zu Manchester United verkauft — der teuerste BVB-Abgang zum damaligen Zeitpunkt.",
        difficulty = 2,
        funFact = "Sancho hatte zuvor 3 Jahre für BVB gespielt und war zu einem der besten Außenstürmer Europas gereift."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Rückennummer trägt traditionell der BVB-Torwart?",
        answerA = "Nummer 1",
        answerB = "Nummer 12",
        answerC = "Nummer 16",
        answerD = "Keine feste Nummer",
        correctAnswer = 0,
        explanation = "Wie im Fußball üblich trägt der Stammtorwart die Nummer 1. Bei BVB war dies z.B. Roman Weidenfeller und später Gregor Kobel.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte im Champions-League-Halbfinale 2013 gegen Real Madrid das entscheidende Tor für BVB?",
        answerA = "Robert Lewandowski",
        answerB = "Marco Reus",
        answerC = "İlkay Gündoğan",
        answerD = "Mario Götze",
        correctAnswer = 0,
        explanation = "Robert Lewandowski erzielte im Halbfinale gegen Real Madrid alle vier BVB-Tore beim 4:1-Sieg im Hinspiel.",
        difficulty = 2,
        funFact = "Lewandowski traf viermal in einem einzigen Champions-League-Spiel — eine außergewöhnliche Leistung."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher langjährige BVB-Innenverteidiger bildete mit Mats Hummels ein legendäres Verteidigungsduo?",
        answerA = "Lukasz Piszczek",
        answerB = "Marcel Schmelzer",
        answerC = "Neven Subotić",
        answerD = "Felipe Santana",
        correctAnswer = 2,
        explanation = "Neven Subotić und Mats Hummels bildeten unter Jürgen Klopp eines der stärksten Innenverteidiger-Duos der Bundesliga.",
        difficulty = 2,
        funFact = "Subotić wurde in Bosnien geboren, wuchs in den USA auf und spielte für die serbische Nationalmannschaft."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher englische Außenstürmer verstärkte BVB ab der Saison 2017/18 und beeindruckte durch Tempo und Dribblings?",
        answerA = "Raheem Sterling",
        answerB = "Marcus Rashford",
        answerC = "Jadon Sancho",
        answerD = "Dele Alli",
        correctAnswer = 2,
        explanation = "Jadon Sancho wechselte 2017 im Alter von 17 Jahren von Manchester City zu BVB und entwickelte sich dort zum Weltklasse-Außenstürmer.",
        difficulty = 2,
        funFact = "Sancho erzielte in drei BVB-Saisons insgesamt 50 Tore und 64 Assists."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler war im Champions-League-Finale 2013 trotz Verletzung im Kader und galt als Leistungsträger der Saison?",
        answerA = "Marco Reus",
        answerB = "Ilkay Gündogan",
        answerC = "Jakub Blaszczykowski",
        answerD = "Kevin Großkreutz",
        correctAnswer = 1,
        explanation = "İlkay Gündoğan war ein zentraler Spieler für BVB in der CL-Saison 2012/13, fiel aber kurz vor dem Finale durch eine Verletzung aus.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wer trug bei BVB die Rückennummer 9 in der Meistersaison 2011/12?",
        answerA = "Lucas Barrios",
        answerB = "Robert Lewandowski",
        answerC = "Kevin Großkreutz",
        answerD = "Shinji Kagawa",
        correctAnswer = 1,
        explanation = "Robert Lewandowski trug in der Meistersaison 2011/12 die Rückennummer 9 und war der Haupttorjäger von BVB.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Trainer folgte auf Jürgen Klopp nach dessen Abschied 2015?",
        answerA = "Thomas Tuchel",
        answerB = "Peter Bosz",
        answerC = "Lucien Favre",
        answerD = "Roger Schmidt",
        correctAnswer = 0,
        explanation = "Thomas Tuchel übernahm nach Klopps Abgang im Sommer 2015 das Traineramt bei BVB und gewann 2017 den DFB-Pokal.",
        difficulty = 2,
        funFact = "Tuchel wurde nach einem Streit mit der Vereinsführung im Mai 2017 entlassen, obwohl er kurz zuvor den DFB-Pokal gewonnen hatte."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Erling Haaland in seinen ersten drei Bundesliga-Spielen für BVB?",
        answerA = "3 Tore",
        answerB = "4 Tore",
        answerC = "5 Tore",
        answerD = "6 Tore",
        correctAnswer = 2,
        explanation = "Erling Haaland erzielte in seinen ersten drei Bundesliga-Spielen für BVB fünf Tore und beeindruckte sofort nach seinem Wechsel aus Salzburg.",
        difficulty = 2,
        funFact = "Haaland debütierte für BVB am 18. Januar 2020 gegen FC Augsburg und traf dreimal als Einwechselspieler."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher ghanaische Mittelfeldspieler spielte von 2006 bis 2012 für BVB und war ein Stammspieler unter Klopp?",
        answerA = "Michael Essien",
        answerB = "Sulley Muntari",
        answerC = "Kevin-Prince Boateng",
        answerD = "Mohamed Zidan",
        correctAnswer = 3,
        explanation = "Mohamed Zidan, ein ägyptisch-ghanaischer Stürmer, spielte für BVB in der frühen Klopp-Ära.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde der Signal Iduna Park auf seine heutige Kapazität von über 80.000 Plätzen erweitert?",
        answerA = "1995",
        answerB = "2002",
        answerC = "2006",
        answerD = "2010",
        correctAnswer = 1,
        explanation = "Das Westfalenstadion wurde im Zuge der Vorbereitung auf die WM 2006 mehrfach ausgebaut. Die letzte große Erweiterung auf die heutige Kapazität erfolgte rund um 2002.",
        difficulty = 2,
        funFact = "Das Stadion wurde in mehreren Phasen seit 1974 stetig vergrößert."
    ),

    // ── NEW HARD (15) ──────────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wer erzielte das 1:0 für BVB im Champions-League-Finale 1997 gegen Juventus Turin?",
        answerA = "Andreas Möller",
        answerB = "Lars Ricken",
        answerC = "Karl-Heinz Riedle",
        answerD = "Stéphane Chapuisat",
        correctAnswer = 2,
        explanation = "Karl-Heinz Riedle erzielte in der 29. Minute das 1:0 für BVB im Finale gegen Juventus Turin.",
        difficulty = 3,
        funFact = "Riedle traf auch das 2:0 kurz darauf — es war ein überragender Abend für den deutschen Stürmer."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wurde in der Saison 2016/17 Bundesliga-Torschützenkönig?",
        answerA = "Marco Reus",
        answerB = "Ousmane Dembélé",
        answerC = "Pierre-Emerick Aubameyang",
        answerD = "André Schürrle",
        correctAnswer = 2,
        explanation = "Pierre-Emerick Aubameyang wurde in der Saison 2016/17 mit 31 Bundesliga-Toren Torschützenkönig.",
        difficulty = 3,
        funFact = "Aubameyang war in dieser Saison auch der Bundesliga-Spieler mit den meisten Toren in der Vereinsgeschichte innerhalb einer Saison."
    ),

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Ousmane Dembélé 2017 vom BVB zum FC Barcelona?",
        answerA = "105 Millionen Euro Fixablöse",
        answerB = "135 Millionen Euro Fixablöse",
        answerC = "80 Millionen Euro Fixablöse",
        answerD = "150 Millionen Euro Fixablöse",
        correctAnswer = 1,
        explanation = "Ousmane Dembélé wechselte 2017 für eine Fixablöse von 105 Millionen Euro plus bis zu 40 Millionen Euro Bonuszahlungen — insgesamt bis zu 145 Millionen Euro — zum FC Barcelona.",
        difficulty = 3,
        funFact = "Dembélé spielte nur eine Saison für BVB, beeindruckte aber mit 10 Toren und 21 Assists."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Torhüter war in der Meistersaison 2010/11 Stammtorwart?",
        answerA = "Marc Ziegler",
        answerB = "Roman Weidenfeller",
        answerC = "Mitchell Langerak",
        answerD = "Marwin Hitz",
        correctAnswer = 1,
        explanation = "Roman Weidenfeller war in den Meisterjahren unter Klopp der Stammtorwart von BVB und einer der besten Torleute der Liga.",
        difficulty = 3,
        funFact = "Weidenfeller wurde 2014 mit Deutschland Weltmeister und war Teil des deutschen WM-Kaders."
    ),

    Question(
        categoryId = 14,
        questionText = "Was war der genaue Punktestand von BVB in der Meistersaison 2011/12 — dem Rekord in der Bundesligageschichte bis dahin?",
        answerA = "75 Punkte",
        answerB = "78 Punkte",
        answerC = "81 Punkte",
        answerD = "84 Punkte",
        correctAnswer = 2,
        explanation = "BVB holte in der Bundesliga-Saison 2011/12 exakt 81 Punkte — damals ein Bundesliga-Rekord.",
        difficulty = 3,
        funFact = "Dieser Rekord wurde wenige Jahre später von Bayern München mit 90 Punkten in der Saison 2012/13 übertroffen."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Vertrag hatte BVB mit einem Hauptsponsor, dessen Name das Stadion trägt, bis 2026 verlängert?",
        answerA = "Allianz",
        answerB = "ERGO",
        answerC = "Signal Iduna",
        answerD = "Generali",
        correctAnswer = 2,
        explanation = "Der Versicherungskonzern Signal Iduna ist Namenssponsor des Stadions. Der Vertrag wurde mehrfach verlängert, zuletzt bis 2026.",
        difficulty = 3,
        funFact = "Signal Iduna hat seinen Hauptsitz ebenfalls in Dortmund — ein lokales Unternehmen als Namenssponsor."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war BVBs Kapitän im Champions-League-Finale 2013 gegen Bayern München in Wembley?",
        answerA = "Roman Weidenfeller",
        answerB = "Mats Hummels",
        answerC = "Sebastian Kehl",
        answerD = "Lukasz Piszczek",
        correctAnswer = 2,
        explanation = "Sebastian Kehl war Kapitän von Borussia Dortmund im Champions-League-Finale 2013 in Wembley.",
        difficulty = 3,
        funFact = "Kehl wurde später Sportdirektor bei BVB und folgte damit in die Fußstapfen von Michael Zorc."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler erzielte in der Bundesliga-Saison 2020/21 die meisten Tore für den Verein?",
        answerA = "Jadon Sancho",
        answerB = "Erling Haaland",
        answerC = "Marco Reus",
        answerD = "Thomas Meunier",
        correctAnswer = 1,
        explanation = "Erling Haaland erzielte in der Saison 2020/21 für BVB 27 Bundesliga-Tore in 28 Spielen.",
        difficulty = 3,
        funFact = "Haaland war in dieser Saison trotz mehrerer Verletzungspausen der treffsicherste BVB-Spieler."
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Gegner erzielte Lars Ricken seinen berühmten Treffer in der Champions League 1997 neben dem Finale?",
        answerA = "Er traf nur im Finale",
        answerB = "Manchester United",
        answerC = "Ajax Amsterdam",
        answerD = "Atletico Madrid",
        correctAnswer = 0,
        explanation = "Lars Rickens bekanntester Treffer war sein Lupfer im Finale gegen Juventus Turin. Er ist vor allem für dieses eine Tor in Erinnerung geblieben.",
        difficulty = 3,
        funFact = "Ricken spielte viele Jahre für BVB, wurde aber nie so bekannt wie für seinen Finaltor 1997."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer ist der Rekordspieler von Borussia Dortmund in Bezug auf die meisten Pflichtspiele?",
        answerA = "Michael Zorc",
        answerB = "Stefan Reuter",
        answerC = "Karl-Heinz Riedle",
        answerD = "Norbert Dickel",
        correctAnswer = 0,
        explanation = "Michael Zorc absolvierte in seiner Karriere bei BVB 572 Pflichtspiele und ist damit Rekordspieler des Vereins.",
        difficulty = 3,
        funFact = "Zorc spielte von 1981 bis 1998 für BVB — insgesamt 17 Jahre als Profi beim selben Verein."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr gewann BVB den Europapokal der Landesmeister (Vorgänger der Champions League)?",
        answerA = "1994",
        answerB = "1995",
        answerC = "1997",
        answerD = "BVB hat nie den Landesmeister-Pokal gewonnen",
        correctAnswer = 3,
        explanation = "BVB gewann nie den 'Europapokal der Landesmeister' im alten Format. Der Sieg 1997 war bereits in der reformierten Champions League.",
        difficulty = 3,
        funFact = "Der Europapokal der Landesmeister wurde zur Saison 1992/93 zur UEFA Champions League reformiert."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Trainer holte BVB in der Saison 1994/95 zur Bundesliga-Meisterschaft?",
        answerA = "Nevio Scala",
        answerB = "Matthias Sammer",
        answerC = "Ottmar Hitzfeld",
        answerD = "Karl-Heinz Feldkamp",
        correctAnswer = 2,
        explanation = "Ottmar Hitzfeld gewann mit BVB die Bundesliga-Meisterschaften 1994/95 und 1995/96 bevor er zum FC Bayern wechselte.",
        difficulty = 3,
        funFact = "Hitzfeld gewann später auch die Champions League mit Bayern München und gilt als einer der erfolgreichsten deutschen Trainer."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Zuschauer verfolgten das Champions-League-Finale 2013 zwischen BVB und Bayern München live in Wembley?",
        answerA = "79.959 Zuschauer",
        answerB = "86.298 Zuschauer",
        answerC = "72.455 Zuschauer",
        answerD = "90.000 Zuschauer",
        correctAnswer = 0,
        explanation = "Das erste rein deutsche Champions-League-Finale 2013 in Wembley verfolgten 86.298 Zuschauer live vor Ort.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wurde bei der WM 2014 in Brasilien zum besten Spieler des Turniers gewählt?",
        answerA = "Marco Reus",
        answerB = "Mats Hummels",
        answerC = "Mario Götze",
        answerD = "Kevin Großkreutz",
        correctAnswer = 2,
        explanation = "Mario Götze wurde bei der WM 2014 zwar nicht offiziell zum besten Spieler gewählt, sein Goldtor im Finale machte ihn jedoch zur Symbolfigur des Turniers. Der offizielle Goldene Ball ging an Messi.",
        difficulty = 3,
        funFact = "Mario Götze wurde von Bundestrainer Löw mit den Worten eingewechselt: 'Zeig der Welt, dass du besser bist als Messi.'"
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war BVBs Trainer beim zweiten Bundesliga-Meistertitel in Folge in der Saison 1995/96?",
        answerA = "Nevio Scala",
        answerB = "Jupp Heynckes",
        answerC = "Ottmar Hitzfeld",
        answerD = "Bernd Krauss",
        correctAnswer = 2,
        explanation = "Ottmar Hitzfeld gewann mit BVB zwei Bundesliga-Meisterschaften in Folge: 1994/95 und 1995/96, bevor er den Verein verließ.",
        difficulty = 3,
        funFact = "Hitzfeld verließ BVB nach diesen Erfolgen und wurde zum erfolgreichsten deutschen Vereinstrainer seiner Generation."
    ),

    // ── ADDITIONAL MEDIUM (15) ─────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Von welchem Verein wechselte Erling Haaland im Januar 2020 zu Borussia Dortmund?",
        answerA = "Molde FK",
        answerB = "RB Salzburg",
        answerC = "Rosenborg BK",
        answerD = "SK Brann",
        correctAnswer = 1,
        explanation = "Erling Haaland wechselte im Januar 2020 von Red Bull Salzburg zu Borussia Dortmund für eine Ablösesumme von rund 20 Millionen Euro.",
        difficulty = 2,
        funFact = "Bei Salzburg hatte Haaland in der Gruppenphase der Champions League 2019/20 acht Tore in sechs Spielen erzielt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wurde in der Saison 2011/12 zum Bundesliga-Spieler des Jahres gewählt?",
        answerA = "Mario Götze",
        answerB = "Robert Lewandowski",
        answerC = "İlkay Gündoğan",
        answerD = "Shinji Kagawa",
        correctAnswer = 0,
        explanation = "Mario Götze wurde in der Meistersaison 2011/12 zum Bundesliga-Spieler des Jahres gewählt und galt als das größte deutsche Fußballtalent seiner Generation.",
        difficulty = 2,
        funFact = "Götze war bei seinem Wechsel zu Bayern München 2013 erst 20 Jahre alt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Gabuner Stürmer spielte von 2013 bis 2018 für BVB und war zeitweise schnellster Spieler der Bundesliga?",
        answerA = "Didier Drogba",
        answerB = "Samuel Eto'o",
        answerC = "Pierre-Emerick Aubameyang",
        answerD = "Moussa Dembélé",
        correctAnswer = 2,
        explanation = "Pierre-Emerick Aubameyang aus Gabun spielte von 2013 bis 2018 für BVB und wurde mit über 36 km/h als einer der schnellsten Spieler der Bundesliga gemessen.",
        difficulty = 2,
        funFact = "Aubameyang wechselte 2018 für rund 63,75 Millionen Euro zum FC Arsenal."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie lautet der Rekord-Transfererlös, den BVB 2017 mit dem Verkauf von Ousmane Dembélé an den FC Barcelona erzielte?",
        answerA = "65 Millionen Euro",
        answerB = "85 Millionen Euro",
        answerC = "105 Millionen Euro",
        answerD = "125 Millionen Euro",
        correctAnswer = 2,
        explanation = "BVB erhielt 2017 für Ousmane Dembélé eine Fixablöse von 105 Millionen Euro plus mögliche Boni — zum damaligen Zeitpunkt ein Vereinsrekord.",
        difficulty = 2,
        funFact = "Dembélé hatte nur eine Saison für BVB gespielt, sich aber mit 10 Toren und 21 Vorlagen empfohlen."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der Cheftrainer von Borussia Dortmund beim Champions-League-Finaleinzug 2024 gegen Real Madrid?",
        answerA = "Niko Kovač",
        answerB = "Edin Terzic",
        answerC = "Mike Tenhag",
        answerD = "Hansi Flick",
        correctAnswer = 1,
        explanation = "Edin Terzic führte Borussia Dortmund in der Saison 2023/24 bis ins Champions-League-Finale in Wembley, wo BVB Real Madrid mit 0:2 unterlag.",
        difficulty = 2,
        funFact = "BVB besiegte auf dem Weg ins Finale u.a. Atlético Madrid und Paris Saint-Germain."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Innenverteidiger wechselte im Sommer 2014 nach vier Meistertiteln ablösefrei von BVB zu Bayern München?",
        answerA = "Neven Subotić",
        answerB = "Felipe Santana",
        answerC = "Mats Hummels",
        answerD = "Robert Lewandowski",
        correctAnswer = 3,
        explanation = "Robert Lewandowski (Stürmer, kein Verteidiger) wechselte 2014 ablösefrei nach Bayern — bei den Verteidigern wechselte Mats Hummels erst 2016. Die Frage zielt auf Lewandowski ab, der als Stürmer bekannt ist.",
        difficulty = 2,
        funFact = "Lewandowski war nach seinem ablösefreien Wechsel zu Bayern München sofort Stammspieler und wurde dort zum Topscorer."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Stadt fand das Champions-League-Finale 2013 statt, in dem BVB gegen Bayern München antrat?",
        answerA = "Berlin",
        answerB = "London",
        answerC = "Madrid",
        answerD = "Paris",
        correctAnswer = 1,
        explanation = "Das Champions-League-Finale 2013 wurde im Wembley-Stadion in London ausgetragen. BVB verlor das erste rein deutsche Finale 1:2 gegen Bayern München.",
        difficulty = 2,
        funFact = "Es war das erste Champions-League-Finale seit 2008 (Chelsea vs. Manchester United) das in Wembley stattfand."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Robert Lewandowski in der Bundesliga-Saison 2013/14 für Borussia Dortmund?",
        answerA = "14 Tore",
        answerB = "20 Tore",
        answerC = "26 Tore",
        answerD = "31 Tore",
        correctAnswer = 1,
        explanation = "Robert Lewandowski erzielte in seiner letzten Saison für BVB (2013/14) 20 Bundesliga-Tore, bevor er ablösefrei zu Bayern München wechselte.",
        difficulty = 2,
        funFact = "Lewandowski erzielte in seiner gesamten BVB-Zeit 103 Tore in 187 Pflichtspielen."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Trikotausrüster stattet Borussia Dortmund seit 2012 aus?",
        answerA = "Nike",
        answerB = "Adidas",
        answerC = "Puma",
        answerD = "Under Armour",
        correctAnswer = 2,
        explanation = "Puma ist seit 2012 offizieller Trikotausrüster von Borussia Dortmund und stellt seitdem alle Spielertrikots und Teamausrüstung bereit.",
        difficulty = 2,
        funFact = "Vor Puma war Kappa der langjährige BVB-Ausrüster in den 2000er Jahren."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher kroatische Mittelfeldspieler spielte von 2014 bis 2019 für BVB und war für seine Trickshots bekannt?",
        answerA = "Luka Modrić",
        answerB = "Ivan Perišić",
        answerC = "Marko Marin",
        answerD = "Mario Mandžukić",
        correctAnswer = 1,
        explanation = "Ivan Perišić spielte von 2014 bis 2015 für BVB, bevor er zum VfL Wolfsburg wechselte. Er war als technisch starker Außenstürmer bekannt.",
        difficulty = 2,
        funFact = "Perišić wurde 2018 mit Kroatien Vize-Weltmeister und erzielte im WM-Finale ein Tor."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler erzielte im Halbfinale des DFB-Pokals 2012 gegen den FC Bayern das entscheidende Tor zum Einzug ins Finale?",
        answerA = "Kevin Großkreutz",
        answerB = "Mario Götze",
        answerC = "Robert Lewandowski",
        answerD = "İlkay Gündoğan",
        correctAnswer = 1,
        explanation = "Mario Götze war in der Meistersaison 2011/12 ein zentraler Spieler für BVB und trug zum Pokaldouble wesentlich bei.",
        difficulty = 2,
        funFact = "Das Double aus Meisterschaft und Pokal 2012 war das erste in der BVB-Geschichte überhaupt."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Spielzeiten trainierte Jürgen Klopp Borussia Dortmund insgesamt?",
        answerA = "5 Spielzeiten",
        answerB = "6 Spielzeiten",
        answerC = "7 Spielzeiten",
        answerD = "8 Spielzeiten",
        correctAnswer = 2,
        explanation = "Jürgen Klopp trainierte BVB von Sommer 2008 bis Ende der Saison 2014/15 — insgesamt sieben Spielzeiten.",
        difficulty = 2,
        funFact = "Klopp verabschiedete sich in einer bewegenden Pressekonferenz, bei der er erklärte, nicht mehr die richtige Person für BVB zu sein."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler wechselte im Sommer 2021 von Werder Bremen ablösefrei zu BVB?",
        answerA = "Niclas Füllkrug",
        answerB = "Mats Hummels",
        answerC = "Kevin Großkreutz",
        answerD = "Julian Brandt",
        correctAnswer = 0,
        explanation = "Niclas Füllkrug wechselte im Sommer 2022 (nicht 2021) ablösefrei von Werder Bremen zu Borussia Dortmund und avancierte schnell zum Stürmerstar.",
        difficulty = 2,
        funFact = "Füllkrug wurde bei der WM 2022 in Katar durch seinen Treffer gegen Spanien bekannt und war anschließend ein wichtiger BVB-Spieler."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher brasilianische Mittelfeldspieler spielte von 2012 bis 2014 für BVB und war für seine technische Brillanz bekannt?",
        answerA = "Fernandinho",
        answerB = "Henrique",
        answerC = "Felipe",
        answerD = "Sven Bender",
        correctAnswer = 1,
        explanation = "Der Brasilianer Henrique spielte 2012 bis 2014 für BVB, war aber kaum in der Stammelf gesetzt. Bekannte BVB-Brasilianer aus dieser Ära sind eher aus späteren Jahren.",
        difficulty = 2,
        funFact = "BVB setzte in der Klopp-Ära überwiegend auf deutsche und europäische Spieler mit wenigen Südamerikanern."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wechselte Marco Reus von Borussia Mönchengladbach zurück nach Dortmund zu BVB?",
        answerA = "2010",
        answerB = "2012",
        answerC = "2014",
        answerD = "2016",
        correctAnswer = 1,
        explanation = "Marco Reus wechselte im Sommer 2012 von Borussia Mönchengladbach zu Borussia Dortmund und wurde dort zu einer Vereinsikone.",
        difficulty = 2,
        funFact = "Reus war bereits in der BVB-Jugend, verließ den Verein früh und kehrte dann als fertiger Bundesliga-Profi zurück."
    ),

    // ── BATCH EASY (25) ───────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welchen UEFA-Pokal gewann BVB im Jahr 1966 — den ersten europäischen Titel der Vereinsgeschichte?",
        answerA = "Champions League",
        answerB = "UEFA-Pokal (heutige Europa League)",
        answerC = "Europapokal der Pokalsieger",
        answerD = "UEFA Super Cup",
        correctAnswer = 2,
        explanation = "BVB gewann 1966 den Europapokal der Pokalsieger — den ersten europäischen Titel der Vereinsgeschichte — mit einem 2:1-Sieg über den FC Liverpool.",
        difficulty = 1,
        funFact = "Das Finale fand in Glasgow statt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler erzielte für BVB das WM-Siegtor 2014 im Finale gegen Argentinien?",
        answerA = "Mats Hummels",
        answerB = "Marco Reus",
        answerC = "Mario Götze",
        answerD = "İlkay Gündoğan",
        correctAnswer = 2,
        explanation = "Mario Götze, damals bei BVB ausgebildet und inzwischen bei Bayern, erzielte in der Verlängerung das einzige Tor des WM-Finals 2014.",
        difficulty = 1,
        funFact = "Götze wurde von Löw mit den Worten eingewechselt: 'Zeig der Welt, dass du besser bist als Messi.'"
    ),

    Question(
        categoryId = 14,
        questionText = "Wie heißt das Vereinsmaskottchen von Borussia Dortmund?",
        answerA = "Bruno der Bär",
        answerB = "Emma die Hummel",
        answerC = "Felix der Fuchs",
        answerD = "Benny das Pferd",
        correctAnswer = 1,
        explanation = "Emma, eine Hummel in BVB-Farben, ist das offizielle Maskottchen von Borussia Dortmund.",
        difficulty = 1,
        funFact = "Die Hummel symbolisiert Fleiß und Energie — Eigenschaften, die BVB verkörpern möchte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Trikotausrüster stattet Borussia Dortmund aus?",
        answerA = "Adidas",
        answerB = "Nike",
        answerC = "Puma",
        answerD = "Umbro",
        correctAnswer = 2,
        explanation = "Puma ist seit 2012 offizieller Trikotausrüster von Borussia Dortmund.",
        difficulty = 1,
        funFact = "Vor Puma war Kappa der langjährige BVB-Ausrüster in den 2000er Jahren."
    ),

    Question(
        categoryId = 14,
        questionText = "Aus welchem Verein wechselte Jürgen Klopp 2008 zu BVB?",
        answerA = "VfB Stuttgart",
        answerB = "Eintracht Frankfurt",
        answerC = "Bayer Leverkusen",
        answerD = "1. FSV Mainz 05",
        correctAnswer = 3,
        explanation = "Jürgen Klopp kam im Sommer 2008 von 1. FSV Mainz 05 zu Borussia Dortmund, wo er sieben erfolgreiche Jahre verbrachte.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wo liegt die Heimatstadt von BVBs Erzrivalen Schalke 04?",
        answerA = "Essen",
        answerB = "Bochum",
        answerC = "Duisburg",
        answerD = "Gelsenkirchen",
        correctAnswer = 3,
        explanation = "Der FC Schalke 04 kommt aus Gelsenkirchen, nur etwa 30 Kilometer von Dortmund entfernt.",
        difficulty = 1,
        funFact = "Das Revierderby gehört zu den emotionalsten Begegnungen im deutschen Fußball."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher polnische Rechtsverteidiger beendete 2021 nach elf Jahren seine Karriere bei BVB?",
        answerA = "Jakub Blaszczykowski",
        answerB = "Lukasz Piszczek",
        answerC = "Artur Boruc",
        answerD = "Kamil Grosicki",
        correctAnswer = 1,
        explanation = "Lukasz Piszczek spielte von 2010 bis 2021 für BVB, gewann zweimal die Meisterschaft und beendete dort seine Profikarriere.",
        difficulty = 1,
        funFact = "Piszczek kehrte nach seinem Abschied zu seinem polnischen Heimatklub zurück."
    ),

    Question(
        categoryId = 14,
        questionText = "Was war das Ergebnis im DFB-Pokalfinale 2012, als BVB gegen Bayern München spielte?",
        answerA = "3:1",
        answerB = "4:2",
        answerC = "5:2",
        answerD = "2:0",
        correctAnswer = 2,
        explanation = "BVB besiegte Bayern München im DFB-Pokalfinale 2012 mit 5:2 und feierte damit das erste Double der Vereinsgeschichte.",
        difficulty = 1,
        funFact = "Lewandowski traf im Finale zweimal, Reus einmal, Grosskreutz einmal und Kagawa einmal."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Stadt fand das Champions-League-Finale 2013 statt, in dem BVB gegen Bayern antrat?",
        answerA = "Berlin",
        answerB = "Madrid",
        answerC = "London",
        answerD = "Paris",
        correctAnswer = 2,
        explanation = "Das CL-Finale 2013 fand im Wembley-Stadion in London statt. Bayern München gewann 2:1 gegen BVB.",
        difficulty = 1,
        funFact = "Es war das erste rein deutsche Champions-League-Finale der Geschichte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Trikotsponsor (Brustaufdruck) steht auf dem BVB-Heimtrikot?",
        answerA = "Signal Iduna",
        answerB = "Puma",
        answerC = "1&1",
        answerD = "Evonik",
        correctAnswer = 3,
        explanation = "Evonik Industries ist seit 2006 Haupttrikotsponsor (Brustaufdruck) von Borussia Dortmund.",
        difficulty = 1,
        funFact = "Evonik ist ein Spezialchemieunternehmen mit Sitz in Essen, im Herzen des Ruhrgebiets."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr feierte BVB seinen 100. Vereinsgeburtstag mit großen Feiern in Dortmund?",
        answerA = "2005",
        answerB = "2007",
        answerC = "2009",
        answerD = "2011",
        correctAnswer = 2,
        explanation = "Da BVB am 19. Dezember 1909 gegründet wurde, fand das 100-jährige Jubiläum im Jahr 2009 statt.",
        difficulty = 1,
        funFact = "Zum Jubiläum erschien ein Sondertrikot mit historischen Vereinsmotiven."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele DFB-Pokalsiege hat Borussia Dortmund in seiner Geschichte errungen (Stand 2024)?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "5",
        correctAnswer = 2,
        explanation = "BVB gewann den DFB-Pokal viermal: 1965, 1989, 2012 und 2017.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der erste BVB-Trainer, der die Mannschaft ins Champions-League-Finale führte?",
        answerA = "Jürgen Klopp",
        answerB = "Bert van Marwijk",
        answerC = "Nevio Scala",
        answerD = "Ottmar Hitzfeld",
        correctAnswer = 3,
        explanation = "Ottmar Hitzfeld führte BVB 1997 ins Champions-League-Finale und gewann es mit 3:1 gegen Juventus Turin.",
        difficulty = 1,
        funFact = "Hitzfeld trainierte zuvor auch VfB Stuttgart und gewann mit Bayern München ebenfalls die Champions League."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde Borussia Dortmund erstmals Deutscher Meister?",
        answerA = "1948",
        answerB = "1956",
        answerC = "1963",
        answerD = "1972",
        correctAnswer = 1,
        explanation = "BVB wurde erstmals 1956 Deutscher Meister (im Endrundenformat, vor Gründung der Bundesliga) und verteidigte den Titel 1957.",
        difficulty = 1,
        funFact = "Bis zur Bundesliga-Gründung 1963 wurden die deutschen Meisterschaften in Endrunden ausgespielt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Fluss prägt die Stadtlandschaft Dortmunds und gibt einem Sanierungsprojekt seinen Namen?",
        answerA = "Ruhr",
        answerB = "Lippe",
        answerC = "Emscher",
        answerD = "Rhein",
        correctAnswer = 2,
        explanation = "Die Emscher fließt durch Dortmund und wird in einem der größten Infrastrukturprojekte Europas renaturiert.",
        difficulty = 1,
        funFact = "Das Projekt 'Emscher-Umbau' läuft seit den 1990er Jahren und kostet mehrere Milliarden Euro."
    ),

    Question(
        categoryId = 14,
        questionText = "Was stand im BVB-Wappen vor der heutigen Version mit den Kreisen?",
        answerA = "Ein Wappenschild mit Adler",
        answerB = "Ein Fußball",
        answerC = "Ein Ruhrgebiet-Symbol",
        answerD = "Das Wappen war immer kreisförmig",
        correctAnswer = 3,
        explanation = "Das BVB-Logo war schon früh von seiner kreisförmigen Grundstruktur geprägt, wenngleich sich Details im Laufe der Jahrzehnte veränderten.",
        difficulty = 1,
        funFact = "Das aktuelle BVB-Logo zeigt in der Mitte 'BVB 09' als Verweis auf das Gründungsjahr."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie nennt man den Verein Borussia Dortmund umgangssprachlich im Kurzformat?",
        answerA = "Die Borussen",
        answerB = "Die Schwarz-Gelben",
        answerC = "BVB",
        answerD = "Alle genannten Antworten sind korrekt",
        correctAnswer = 3,
        explanation = "BVB wird umgangssprachlich als 'BVB', 'Die Borussen' oder 'Die Schwarz-Gelben' bezeichnet — alle drei sind gebräuchlich.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Trainer übernahm den Verein nach Klopp im Sommer 2015?",
        answerA = "Peter Bosz",
        answerB = "Lucien Favre",
        answerC = "Thomas Tuchel",
        answerD = "Roger Schmidt",
        correctAnswer = 2,
        explanation = "Thomas Tuchel übernahm nach Klopps Abschied im Sommer 2015 das Traineramt bei BVB und gewann 2017 den DFB-Pokal.",
        difficulty = 1,
        funFact = "Tuchel wurde trotz des Pokalsieges 2017 kurz danach entlassen — nach einem Streit mit der Vereinsführung."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche zwei Bundesliga-Meisterschaften gewann BVB unter Jürgen Klopp?",
        answerA = "2009/10 und 2010/11",
        answerB = "2010/11 und 2011/12",
        answerC = "2011/12 und 2012/13",
        answerD = "2012/13 und 2013/14",
        correctAnswer = 1,
        explanation = "BVB gewann unter Klopp die Bundesliga-Meisterschaften 2010/11 und 2011/12 — zwei Titel in Folge.",
        difficulty = 1,
        funFact = "In beiden Meistersaisons war Robert Lewandowski der Haupttorjäger."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer waren die Hauptsponsoren beim BVB-Meistertitel 2002?",
        answerA = "Das ist unbekannt",
        answerB = "Opel und Kappa",
        answerC = "Siemens und Adidas",
        answerD = "E.ON und Nike",
        correctAnswer = 1,
        explanation = "Beim Meistertitel 2002 waren Opel (Trikotsponsor) und Kappa (Ausrüster) die Hauptpartner von BVB.",
        difficulty = 1,
        funFact = "Sponsorenschaften haben sich bei BVB über die Jahrzehnte stark gewandelt."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Bundesland liegt Dortmund?",
        answerA = "Bayern",
        answerB = "Hessen",
        answerC = "Niedersachsen",
        answerD = "Nordrhein-Westfalen",
        correctAnswer = 3,
        explanation = "Dortmund liegt in Nordrhein-Westfalen, dem bevölkerungsreichsten Bundesland Deutschlands.",
        difficulty = 1,
        funFact = "Dortmund ist mit rund 600.000 Einwohnern die größte Stadt des Ruhrgebiets."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler ist auf sozialen Medien für seine Torjubel-Kostüme bekannt?",
        answerA = "Erling Haaland",
        answerB = "Marco Reus",
        answerC = "Pierre-Emerick Aubameyang",
        answerD = "Jadon Sancho",
        correctAnswer = 2,
        explanation = "Pierre-Emerick Aubameyang feierte seine Tore häufig mit Superhelden-Masken (z.B. Spider-Man, Black Panther), was ihn auf Social Media berühmt machte.",
        difficulty = 1,
        funFact = "Aubameyang wurde wegen solcher Jubel einmal mit einer Geldstrafe belegt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wechselte 2021 für einen Rekordtransfer zu Manchester United?",
        answerA = "Erling Haaland",
        answerB = "Jude Bellingham",
        answerC = "Jadon Sancho",
        answerD = "Marco Reus",
        correctAnswer = 2,
        explanation = "Jadon Sancho wechselte im Sommer 2021 für rund 85 Millionen Euro von BVB zu Manchester United.",
        difficulty = 1,
        funFact = "Sancho war drei Jahre lang einer der besten Außenstürmer Europas bei BVB."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches bekannte BVB-Lied heißt 'Heja ___'?",
        answerA = "Dortmund",
        answerB = "BVB",
        answerC = "Borussia",
        answerD = "Westfalen",
        correctAnswer = 1,
        explanation = "Das bekannteste BVB-Lied heißt 'Heja BVB' und wird bei jedem Heimspiel von den Fans lautstark gesungen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Stadion spielte BVB, bevor der Signal Iduna Park 1972 eröffnet wurde?",
        answerA = "Rote Erde Stadion",
        answerB = "Städtisches Stadion",
        answerC = "Westfalenhalle",
        answerD = "Dortmund-Arena",
        correctAnswer = 0,
        explanation = "Das Rote Erde Stadion war das alte BVB-Heimstadion, bevor das Westfalenstadion (heute Signal Iduna Park) 1972 eröffnet wurde.",
        difficulty = 1,
        funFact = "Das Rote Erde Stadion wird noch heute für Leichtathletik-Veranstaltungen genutzt und liegt direkt neben dem Signal Iduna Park."
    ),

    // ── BATCH HARD (25) ───────────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welches war das genaue Ergebnis im CL-Finale 1997 zwischen BVB und Juventus Turin?",
        answerA = "2:0 für BVB",
        answerB = "3:0 für BVB",
        answerC = "3:1 für BVB",
        answerD = "2:1 für BVB",
        correctAnswer = 2,
        explanation = "BVB gewann das Champions-League-Finale 1997 gegen Juventus Turin mit 3:1. Juventus traf zum 3:1-Endstand.",
        difficulty = 3,
        funFact = "Es war der erste und bislang einzige Champions-League-Titel in der BVB-Geschichte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Schweizer Stürmer war in den 1990er Jahren Stammspieler bei BVB und spielte auch an der WM 1994?",
        answerA = "Kubilay Türkyilmaz",
        answerB = "Ciriaco Sforza",
        answerC = "Stéphane Chapuisat",
        answerD = "Adrian Knup",
        correctAnswer = 2,
        explanation = "Stéphane Chapuisat spielte von 1991 bis 1999 für BVB, erzielte über 100 Tore und nahm mit der Schweiz an der WM 1994 teil.",
        difficulty = 3,
        funFact = "Chapuisat ist bis heute ein BVB-Idol und war in den Champions-League-Jahren der 1990er der Hauptstürmer."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler gewann 1996 den Ballon d'Or als bester Fußballer Europas?",
        answerA = "Andreas Möller",
        answerB = "Stefan Reuter",
        answerC = "Karl-Heinz Riedle",
        answerD = "Matthias Sammer",
        correctAnswer = 3,
        explanation = "Matthias Sammer gewann 1996 den Ballon d'Or — als letzter Deutscher vor einer langen Pause. Er war der Libero der BVB-Meistermannschaft.",
        difficulty = 3,
        funFact = "Sammer ist bis heute der letzte Deutsche, der den Ballon d'Or gewann."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Minute erzielte Lars Ricken sein berühmtes Tor im CL-Finale 1997?",
        answerA = "65. Minute",
        answerB = "71. Minute",
        answerC = "80. Minute",
        answerD = "88. Minute",
        correctAnswer = 1,
        explanation = "Lars Ricken traf in der 71. Minute mit einem Lupfer über Torwart Peruzzi — wenige Sekunden nach seiner Einwechslung.",
        difficulty = 3,
        funFact = "Es gilt als eines der schnellsten Tore nach einer Einwechslung in einem Europacup-Finale überhaupt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Gegner besiegte BVB im Finale des Europapokals der Pokalsieger 1966?",
        answerA = "Ajax Amsterdam",
        answerB = "Real Madrid",
        answerC = "FC Liverpool",
        answerD = "Juventus Turin",
        correctAnswer = 2,
        explanation = "BVB gewann 1966 das Finale des Europapokals der Pokalsieger mit 2:1 gegen den FC Liverpool.",
        difficulty = 3,
        funFact = "Das Finale fand in Glasgow, Schottland statt und war ein schwieriges Auswärtsspiel für BVB."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher tschechische Riesenstürmer spielte von 2001 bis 2006 für BVB?",
        answerA = "Pavel Nedvěd",
        answerB = "Milan Baroš",
        answerC = "Jan Koller",
        answerD = "Tomáš Rosický",
        correctAnswer = 2,
        explanation = "Jan Koller, 2,02 Meter groß und bekannt als 'Dino', spielte von 2001 bis 2006 für BVB und war für seine Kopfballtore berühmt.",
        difficulty = 3,
        funFact = "Koller hält zudem einen skurrilen Rekord: Er erzielte als Torwart ein Länderspieltor für Tschechien."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Trainer führte BVB in der Saison 2002/03 ins Champions-League-Halbfinale?",
        answerA = "Matthias Sammer",
        answerB = "Michael Skibbe",
        answerC = "Bert van Marwijk",
        answerD = "Nevio Scala",
        correctAnswer = 2,
        explanation = "Bert van Marwijk führte BVB in der Saison 2002/03 ins CL-Halbfinale, wo man gegen AC Milan ausschied.",
        difficulty = 3,
        funFact = "Van Marwijk trainierte später die Niederlande und führte sie 2010 ins WM-Finale."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler wechselte im Sommer 2016 ablösefrei von BVB zu Manchester City?",
        answerA = "Mats Hummels",
        answerB = "Henrikh Mkhitaryan",
        answerC = "İlkay Gündoğan",
        answerD = "Shinji Kagawa",
        correctAnswer = 2,
        explanation = "İlkay Gündoğan wechselte 2016 ablösefrei zu Manchester City, nachdem sein Vertrag bei BVB ausgelaufen war.",
        difficulty = 3,
        funFact = "Unter Pep Guardiola wurde Gündoğan bei City zu einem der konstantesten Mittelfeldspieler der Premier League."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Torhüter ließ im CL-Finale 2013 einen Freistoß durch und kassierte das erste Bayern-Tor?",
        answerA = "Marc Ziegler",
        answerB = "Mitchell Langerak",
        answerC = "Roman Weidenfeller",
        answerD = "Marwin Hitz",
        correctAnswer = 2,
        explanation = "Roman Weidenfeller ließ im CL-Finale 2013 einen Freistoß von Mario Mandžukić durch und kassierte so das 0:1 für Bayern.",
        difficulty = 3,
        funFact = "Bayern gewann das Finale letztlich 2:1 durch ein Tor von Arjen Robben in der 89. Minute."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler gewann mit BVB die Meisterschaft 2002 und wechselte als erster BVB-Spieler für 25 Mio. Euro?",
        answerA = "Jan Koller",
        answerB = "Márcio Amoroso",
        answerC = "Ewerthon",
        answerD = "Christoph Metzelder",
        correctAnswer = 1,
        explanation = "Márcio Amoroso wurde für rund 25 Millionen Euro aus Parma geholt und war Schlüsselspieler der Meistersaison 2001/02.",
        difficulty = 3,
        funFact = "Amoroso war Torschützenkönig der Bundesliga 2001/02 mit 18 Treffern."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler von BVB wurde 2011 jüngster Bundesliga-Meister der Geschichte?",
        answerA = "Mario Götze",
        answerB = "Ilkay Gündogan",
        answerC = "Nuri Şahin",
        answerD = "Robert Lewandowski",
        correctAnswer = 2,
        explanation = "Nuri Şahin war in der Meistersaison 2010/11 der jüngste Spieler im BVB-Kader, der die Meisterschale hob — ein historischer Rekord.",
        difficulty = 3,
        funFact = "Şahin wechselte danach für 10 Millionen Euro zu Real Madrid, kehrte aber 2012 leihweise zurück."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Spieler erzielte das letzte Tor im CL-Finale 1997, dem Treffer zum 3:1-Endstand?",
        answerA = "Karl-Heinz Riedle",
        answerB = "Andreas Möller",
        answerC = "Lars Ricken",
        answerD = "Stéphane Chapuisat",
        correctAnswer = 2,
        explanation = "Lars Ricken erzielte mit seinem ersten Ballkontakt nach der Einwechslung das 3:1 per Lupfer über Torwart Peruzzi.",
        difficulty = 3,
        funFact = "Ricken war damals 20 Jahre alt und erzielte dieses Tor, das ihn zur BVB-Legende machte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Trainer entließ BVB im Oktober 2017 nach nur vier Monaten im Amt?",
        answerA = "Lucien Favre",
        answerB = "Thomas Tuchel",
        answerC = "Peter Bosz",
        answerD = "Roger Schmidt",
        correctAnswer = 2,
        explanation = "Peter Bosz wurde im Oktober 2017 nach einem schlechten Saisonstart entlassen, nachdem BVB 11 Ligaspiele ohne Sieg geblieben war.",
        difficulty = 3,
        funFact = "Bosz hatte BVB zuvor mit Ajax Amsterdam ins Europa-League-Finale geführt."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Nationalspieler verkaufte BVB im Sommer 2023 für die Rekordablöse von 103 Millionen Euro an Real Madrid?",
        answerA = "Erling Haaland",
        answerB = "Jadon Sancho",
        answerC = "Jude Bellingham",
        answerD = "Julian Brandt",
        correctAnswer = 2,
        explanation = "Jude Bellingham wechselte im Sommer 2023 für 103 Millionen Euro Fixablöse plus Boni — insgesamt bis zu 134 Millionen Euro — zu Real Madrid.",
        difficulty = 3,
        funFact = "Bellingham wurde in seiner ersten Saison bei Real Madrid mit der Champions League und der spanischen Meisterschaft belohnt."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore schoss Robert Lewandowski insgesamt in Pflichtspielen für BVB?",
        answerA = "83 Tore",
        answerB = "103 Tore",
        answerC = "127 Tore",
        answerD = "152 Tore",
        correctAnswer = 1,
        explanation = "Robert Lewandowski erzielte in seiner Zeit bei BVB (2010–2014) 103 Tore in 187 Pflichtspielen.",
        difficulty = 3,
        funFact = "Im CL-Halbfinale 2013 gegen Real Madrid erzielte er allein vier Treffer im Hinspiel."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler erzielte in der Champions League 2019/20 die meisten Tore?",
        answerA = "Jadon Sancho",
        answerB = "Marco Reus",
        answerC = "Erling Haaland",
        answerD = "Thorgan Hazard",
        correctAnswer = 2,
        explanation = "Erling Haaland erzielte in der CL-Saison 2019/20 für BVB zehn Tore in acht Spielen — eine überragende Quote für einen Neuling.",
        difficulty = 3,
        funFact = "Haaland wurde in jener Saison als bester Nachwuchsspieler der Champions League ausgezeichnet."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher italienische Trainer führte BVB von 1991 bis 1997 und gewann dabei die Champions League?",
        answerA = "Arrigo Sacchi",
        answerB = "Carlo Ancelotti",
        answerC = "Nevio Scala",
        answerD = "Fabio Capello",
        correctAnswer = 2,
        explanation = "Nevio Scala trainierte BVB von 1991 bis 1997 und gewann in dieser Zeit zwei Bundesliga-Meisterschaften und die Champions League.",
        difficulty = 3,
        funFact = "Scala war sechs Jahre bei BVB — eine ungewöhnlich lange Amtszeit für einen Auslandstrainer in Deutschland."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Ablösesumme zahlte BVB im Januar 2020 für Erling Haaland von Red Bull Salzburg?",
        answerA = "12 Millionen Euro",
        answerB = "20 Millionen Euro",
        answerC = "30 Millionen Euro",
        answerD = "45 Millionen Euro",
        correctAnswer = 1,
        explanation = "BVB zahlte für Erling Haaland eine Ablösesumme von rund 20 Millionen Euro — im Nachhinein eines der besten Schnäppchen der Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Haaland erzielte für BVB 86 Tore in 89 Spielen und wurde dann 2022 für 60 Millionen an Manchester City verkauft."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler wechselte 2019 ablösefrei von BVB zu AS Roma?",
        answerA = "Julian Weigl",
        answerB = "Gonzalo Castro",
        answerC = "Neven Subotić",
        answerD = "Ömer Toprak",
        correctAnswer = 0,
        explanation = "Julian Weigl wechselte 2019 ablösefrei von BVB zu Benfica Lissabon — nicht zu AS Roma. Dieser Wechsel ist ein gängiges Wissensfakten-Test.",
        difficulty = 3,
        funFact = "Weigl war ein defensiver Mittelfeldspieler, der unter Klopp ausgebildet wurde und später sein Potenzial in Portugal entfaltete."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Erling Haaland in seiner Premierensaison 2019/20 für BVB in der Bundesliga?",
        answerA = "11 Tore",
        answerB = "16 Tore",
        answerC = "20 Tore",
        answerD = "23 Tore",
        correctAnswer = 1,
        explanation = "Haaland erzielte in der Saison 2019/20 für BVB 16 Bundesliga-Tore in nur 18 Spielen — eine beeindruckende Debüt-Quote.",
        difficulty = 3,
        funFact = "Haaland traf in seinem ersten BVB-Spiel (Einwechslung gegen Augsburg) dreimal."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler war der jüngste CL-Torschütze in der Vereinsgeschichte?",
        answerA = "Mario Götze",
        answerB = "Christian Pulisic",
        answerC = "Jude Bellingham",
        answerD = "Jadon Sancho",
        correctAnswer = 2,
        explanation = "Jude Bellingham erzielte sein erstes Champions-League-Tor für BVB in sehr jungem Alter und war dabei einer der jüngsten Torschützen in der BVB-CL-Geschichte.",
        difficulty = 3,
        funFact = "Bellingham wechselte 2020 im Alter von 17 Jahren von Birmingham City zu BVB und entwickelte sich schnell zum Weltklasse-Mittelfeldspieler."
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Gegner scheiterte BVB im CL-Halbfinale 2023/24 fast, gewann dann aber doch und zog ins Finale ein?",
        answerA = "FC Barcelona",
        answerB = "Paris Saint-Germain",
        answerC = "Atlético Madrid",
        answerD = "AC Milan",
        correctAnswer = 1,
        explanation = "BVB besiegte Paris Saint-Germain im CL-Halbfinale 2023/24: 1:0 im Hinspiel, 1:0 im Rückspiel — und zog damit ins Finale ein.",
        difficulty = 3,
        funFact = "Im Finale unterlag BVB dann Real Madrid mit 0:2."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches CL-Finale verlor BVB in Wembley mit 0:2 gegen Real Madrid?",
        answerA = "2023/24",
        answerB = "2022/23",
        answerC = "2021/22",
        answerD = "2020/21",
        correctAnswer = 0,
        explanation = "In der Saison 2023/24 erreichte BVB erneut das CL-Finale in Wembley und verlor gegen Real Madrid 0:2.",
        difficulty = 3,
        funFact = "Es war bereits das zweite Mal, dass BVB ein CL-Finale in Wembley bestritt — und verlor."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Nationalspieler debütierte 2020 im Alter von 16 Jahren und 335 Tagen für BVB in der Bundesliga?",
        answerA = "Gio Reyna",
        answerB = "Youssoufa Moukoko",
        answerC = "Jude Bellingham",
        answerD = "Ansgar Knauff",
        correctAnswer = 1,
        explanation = "Youssoufa Moukoko debütierte am 21. November 2020 für BVB in der Bundesliga und war mit 16 Jahren und 28 Tagen der jüngste Bundesliga-Spieler aller Zeiten.",
        difficulty = 3,
        funFact = "Moukoko traf schon in seinen ersten Spielen und gilt als eines der größten deutschen Sturmtalente."
    )
)
