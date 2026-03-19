package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsExpert2(): List<Question> = listOf(

    // --- Rekordtransfers & Big City Club Ära ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wer ist Hertha BSCs teuerster Einkauf in der Vereinsgeschichte?",
        answerA = "Lucas Tousart (25 Mio. €)",
        answerB = "Krzysztof Piatek (24 Mio. €)",
        answerC = "Dodi Lukébakio (20 Mio. €)",
        answerD = "Matheus Cunha (18 Mio. €)",
        correctAnswer = 0,
        explanation = "Lucas Tousart wurde im Februar 2020 für 25 Millionen Euro von Olympique Lyon verpflichtet und ist damit Herthas teuerster Einkauf der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Tousart war zuvor an Hertha ausgeliehen und zeigte solide Leistungen, bevor der Verein die Kaufoption für 25 Mio. € zog – noch während der Coronavirus-Pause."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Für welche Ablösesumme verkaufte Hertha BSC Matheus Cunha im Sommer 2021 an Atlético Madrid?",
        answerA = "22 Millionen Euro",
        answerB = "26 Millionen Euro",
        answerC = "30 Millionen Euro",
        answerD = "18 Millionen Euro",
        correctAnswer = 1,
        explanation = "Matheus Cunha wurde im Sommer 2021 für 26 Millionen Euro an Atlético Madrid verkauft und ist damit Herthas teuerster Abgang in der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Cunha hatte Hertha in der Hinrunde 2020/21 trotz schwieriger Mannschaftslage mit starken Leistungen überzeugt, bevor ihn Atlético Madrid aus dem Abstiegskampf herausholte."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie hoch war die Ablösesumme, die Hertha BSC im Winter 2020 für Krzysztof Piatek an den AC Milan bezahlte?",
        answerA = "20 Millionen Euro",
        answerB = "18 Millionen Euro",
        answerC = "24 Millionen Euro",
        answerD = "28 Millionen Euro",
        correctAnswer = 2,
        explanation = "Hertha BSC verpflichtete Krzysztof Piatek am 30. Januar 2020 für 24 Millionen Euro vom AC Milan – als Teil des rekordverdächtigen Wintertransferfensters 2019/20.",
        difficulty = 4,
        funFact = "Piatek war zuvor beim AC Milan wenig erfolgreich gewesen, nachdem er in seiner ersten Saison beim Genua CFC mit 19 Toren geglänzt hatte."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welche Gesamtsumme gab Hertha BSC im Wintertransferfenster 2019/20 für neue Spieler aus?",
        answerA = "ca. 45 Millionen Euro",
        answerB = "ca. 55 Millionen Euro",
        answerC = "ca. 65 Millionen Euro",
        answerD = "ca. 77 Millionen Euro",
        correctAnswer = 3,
        explanation = "Im Wintertransferfenster 2019/20 gab Hertha BSC rund 77 Millionen Euro aus (Tousart, Piatek, Cunha, Ascacibar) und stellte damit einen neuen Bundesliga-Rekord für ein Wintertransferfenster auf.",
        difficulty = 4,
        funFact = "Der damalige Trainer Jürgen Klinsmann hatte maßgeblichen Anteil an der Transferstrategie, trat aber bereits im Februar 2020 von seinem Posten zurück."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Für wie viel Millionen Euro verpflichtete Hertha BSC Dodi Lukébakio im Sommer 2019 vom VfL Wolfsburg?",
        answerA = "20 Millionen Euro",
        answerB = "15 Millionen Euro",
        answerC = "25 Millionen Euro",
        answerD = "12 Millionen Euro",
        correctAnswer = 0,
        explanation = "Hertha BSC verpflichtete Dodi Lukébakio am 1. August 2019 für 20 Millionen Euro vom VfL Wolfsburg, wo der Belgier zuvor auf Leihbasis gespielt hatte.",
        difficulty = 4,
        funFact = "Lukébakio hatte in der Saison 2018/19 beim FC Fortuna Düsseldorf auf Leihbasis mit einem Dreierpack gegen Bayern München auf sich aufmerksam gemacht."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Für welche Ablösesumme wurde Valentino Lazaro im Jahr 2020 von Hertha BSC verkauft?",
        answerA = "18 Millionen Euro",
        answerB = "22,4 Millionen Euro",
        answerC = "16 Millionen Euro",
        answerD = "25 Millionen Euro",
        correctAnswer = 1,
        explanation = "Valentino Lazaro wurde 2020 für 22,4 Millionen Euro von Hertha BSC verkauft und war damit zum damaligen Zeitpunkt Herthas teuerster Abgang der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Lazaro wechselte zu Inter Mailand, wo er sich allerdings nicht dauerhaft durchsetzen konnte und zu verschiedenen Vereinen verliehen wurde."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Aus welchem Verein wechselte Santiago Ascacibar im Wintertransferfenster 2020 zu Hertha BSC?",
        answerA = "River Plate",
        answerB = "Boca Juniors",
        answerC = "VfB Stuttgart",
        answerD = "FC Sevilla",
        correctAnswer = 2,
        explanation = "Santiago Ascacibar wechselte im Wintertransferfenster 2020 vom VfB Stuttgart zu Hertha BSC als Teil des rekordverdächtigen Transferwinters unter Lars Windhorst.",
        difficulty = 4,
        funFact = "Ascacibar ist argentinischer Nationalspieler und galt als defensiver Mittelfeldspieler als der 'Räuber', der Herthas Mittelfeld stabilisieren sollte."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Investor investierte ab 2019 mehrere hundert Millionen Euro in Hertha BSC und prägte die 'Big City Club'-Ära?",
        answerA = "Dietmar Hopp",
        answerB = "Martin Kind",
        answerC = "Klaus-Michael Kühne",
        answerD = "Lars Windhorst",
        correctAnswer = 3,
        explanation = "Lars Windhorst investierte ab 2019 insgesamt rund 374 Millionen Euro in Hertha BSC über seine Gesellschaft Tennor Holding und finanzierte damit die Großeinkäufe der 'Big City Club'-Ära.",
        difficulty = 4,
        funFact = "Der Begriff 'Big City Club' wurde von Windhorst geprägt – er wollte Hertha BSC in die Liga der europäischen Topklubs katapultieren. Das Projekt scheiterte, und Hertha stieg 2023 ab."
    ),

    // --- Rekordtorschützen & Spieler-Statistiken ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wer ist mit 84 Bundesliga-Toren Herthas Rekordtorschütze in der Bundesliga?",
        answerA = "Michael Preetz",
        answerB = "Axel Kruse",
        answerC = "Uwe Rahn",
        answerD = "Fabian Lustenberger",
        correctAnswer = 0,
        explanation = "Michael Preetz erzielte in seiner Zeit bei Hertha BSC 84 Bundesliga-Treffer und ist damit der Rekordtorschütze des Vereins in der Bundesliga-Geschichte.",
        difficulty = 4,
        funFact = "Preetz erzielte in der Saison 1998/99 insgesamt 23 Bundesliga-Tore und gewann damit die Torjägerkanone als bester Torschütze der Bundesliga."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie viele Pflichtspiel-Tore erzielte Michael Preetz insgesamt für Hertha BSC?",
        answerA = "98 Tore",
        answerB = "108 Tore",
        answerC = "120 Tore",
        answerD = "93 Tore",
        correctAnswer = 1,
        explanation = "Michael Preetz erzielte insgesamt 108 Pflichtspiel-Tore für Hertha BSC und ist damit der Rekordtorjäger des Vereins in der Neuzeit.",
        difficulty = 4,
        funFact = "Nach seiner Spielerkarriere wechselte Preetz ins Management und wurde 2009 Geschäftsführer Sport bei Hertha BSC, ein Amt, das er bis 2021 innehatte."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie viele Tore erzielte Michael Preetz in der Bundesligasaison 1998/99, mit der er die Torjägerkanone gewann?",
        answerA = "19 Tore",
        answerB = "21 Tore",
        answerC = "23 Tore",
        answerD = "25 Tore",
        correctAnswer = 2,
        explanation = "Michael Preetz erzielte in der Saison 1998/99 genau 23 Bundesliga-Tore für Hertha BSC und gewann damit die Torjägerkanone als Torschützenkönig der Bundesliga.",
        difficulty = 4,
        funFact = "Preetz war in jener Saison der Hauptgrund, warum Hertha BSC mit Platz 2 in der Bundesliga erstmals für die Champions League qualifiziert wurde."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welche Nationalität hat Marcelinho, einer der beliebtesten Hertha-Spieler der frühen 2000er Jahre?",
        answerA = "Argentinisch",
        answerB = "Spanisch",
        answerC = "Portugiesisch",
        answerD = "Brasilianisch",
        correctAnswer = 3,
        explanation = "Marcelinho (vollständiger Name: Marcelo Aparecido de Morais) ist Brasilianer und spielte von 2001 bis 2006 für Hertha BSC, wo er mit seinen Freistoßkünsten zum Liebling der Fans wurde.",
        difficulty = 4,
        funFact = "Marcelinho erzielte in seiner Zeit bei Hertha BSC über 40 Tore, viele davon durch spektakuläre Freistöße, die ihn zu einer echten Publikumsliebling der 'Alten Dame' machten."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Für wie viel Millionen Euro wurde Marcelinho 2001 zu Hertha BSC geholt?",
        answerA = "7 Millionen Euro",
        answerB = "4 Millionen Euro",
        answerC = "10 Millionen Euro",
        answerD = "5,5 Millionen Euro",
        correctAnswer = 0,
        explanation = "Marcelinho wurde 2001 für 7 Millionen Euro zu Hertha BSC verpflichtet und war damals einer der teuersten Einkäufe des Vereins. 2006 wurde er für lediglich 2,5 Millionen Euro weiterverkauft.",
        difficulty = 4,
        funFact = "Der Wertverlust von Marcelinho illustriert das typische Hertha-Problem dieser Jahre: Hohe Einkaufspreise, aber deutlich niedrigere Verkaufserlöse bei den meisten Transfers."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Zu welchem Verein wechselte Sebastian Deisler nach seiner Zeit bei Hertha BSC?",
        answerA = "Borussia Dortmund",
        answerB = "FC Bayern München",
        answerC = "Bayer Leverkusen",
        answerD = "Schalke 04",
        correctAnswer = 1,
        explanation = "Sebastian Deisler wechselte 2002 vom FC Bayern München zu Hertha BSC – umgekehrt zum Transferweg, denn Deisler war bereits bei Hertha, bevor er nach München ging. Hertha hatte ihn 1999 verpflichtet, Bayern kaufte ihn 2002.",
        difficulty = 4,
        funFact = "Sebastian Deisler war eines der größten deutschen Fußballtalente um die Jahrtausendwende und kämpfte zeitgleich offen mit Depressionen – sein Mut zur Offenheit trug zur Entstigmatisierung psychischer Erkrankungen im Fußball bei."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr machte Kevin-Prince Boateng bei Hertha BSC sein Bundesliga-Debüt?",
        answerA = "2003",
        answerB = "2004",
        answerC = "2005",
        answerD = "2006",
        correctAnswer = 2,
        explanation = "Kevin-Prince Boateng debütierte am 13. August 2005 in der Bundesliga für Hertha BSC in einem 2:0-Sieg gegen Eintracht Frankfurt und wurde damit zum jüngsten Bundesligaspieler, den die Akademie hervorgebracht hatte.",
        difficulty = 4,
        funFact = "Boateng wuchs in Berlin auf und absolvierte die gesamte Jugendakademie von Hertha BSC – sein Debüt war damit ein wichtiger Moment für die Berliner Nachwuchsarbeit."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "An welchen englischen Verein wechselte Kevin-Prince Boateng 2007 von Hertha BSC?",
        answerA = "Chelsea FC",
        answerB = "Manchester City",
        answerC = "Arsenal FC",
        answerD = "Tottenham Hotspur",
        correctAnswer = 3,
        explanation = "Kevin-Prince Boateng wechselte 2007 von Hertha BSC zu Tottenham Hotspur in die Premier League, nachdem er 53 Pflichtspiele für die Berliner absolviert hatte.",
        difficulty = 4,
        funFact = "Boateng kehrte später in seiner Karriere nach Berlin zurück und schloss sich 2021 noch einmal Hertha BSC an – als gefeierter Rückkehrer in seine Heimatstadt."
    ),

    // --- Trainer & Vereinsführung ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wie lange war Pál Dárdai in seiner ersten Amtszeit Trainer von Hertha BSC?",
        answerA = "Von 2015 bis 2019",
        answerB = "Von 2016 bis 2020",
        answerC = "Von 2014 bis 2018",
        answerD = "Von 2013 bis 2017",
        correctAnswer = 0,
        explanation = "Pál Dárdai war in seiner ersten Amtszeit von Februar 2015 bis Mai 2019 Trainer von Hertha BSC und führte den Verein zu mehreren stabilen Bundesligasaisonen.",
        difficulty = 4,
        funFact = "Dárdai begann seine Trainerkarriere bei Hertha BSC noch während seiner Tätigkeit als Nationaltrainer Ungarns – er war zeitweise Teilzeit-Bundesligatrainer, bis er sich voll auf Hertha konzentrierte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher frühere Weltstar übernahm Hertha BSC als Trainer im November 2019 und trat schon im Februar 2020 zurück?",
        answerA = "Luca Toni",
        answerB = "Jürgen Klinsmann",
        answerC = "Oliver Bierhoff",
        answerD = "Klinsi Klinsi",
        correctAnswer = 1,
        explanation = "Jürgen Klinsmann übernahm Hertha BSC im November 2019 als Trainer, trat aber bereits im Februar 2020 – nach nur 76 Tagen im Amt – zurück. Er kritisierte den Verein anschließend öffentlich.",
        difficulty = 4,
        funFact = "Klinsmann war auch Mitglied des Hertha-Aufsichtsrats, was nach seinem Rücktritt zu einem Interessenkonflikt führte. Er beendete das Aufsichtsratsmandat kurz nach dem Rücktritt ebenfalls."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wer war der Trainer, der Hertha BSC in der Saison 2022/23 aus der Bundesliga abstieg?",
        answerA = "Tayfun Korkut",
        answerB = "Felix Magath",
        answerC = "Sandro Schwarz",
        answerD = "Pál Dárdai",
        correctAnswer = 2,
        explanation = "Sandro Schwarz war Trainer von Hertha BSC in der Abstiegssaison 2022/23. Der Verein stieg als Tabellenletzter in die 2. Bundesliga ab.",
        difficulty = 4,
        funFact = "Hertha BSC musste in der Saison 2022/23 trotz eines Kaders mit erheblichen Investitionen der Windhorst-Ära in die zweite Liga absteigen – das Ende der 'Big City Club'-Vision."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer rettete Hertha BSC in der Saison 2021/22 in der Relegation vor dem Abstieg?",
        answerA = "Tayfun Korkut",
        answerB = "Mark Fotheringham",
        answerC = "Pál Dárdai",
        answerD = "Felix Magath",
        correctAnswer = 3,
        explanation = "Felix Magath übernahm Hertha BSC im März 2022 in der Abstiegszone und rettete den Verein über die Relegation gegen den Hamburger SV in der Bundesliga – trotz zunächst aussichtsloser Lage.",
        difficulty = 4,
        funFact = "Magath war zum Zeitpunkt seiner Verpflichtung seit Jahren nicht mehr als Clubtrainer tätig. Der 'Quälix' lieferte dennoch eine der dramatischsten Hertha-Rettungen der jüngeren Geschichte ab."
    ),

    // --- Nachwuchs & Vereinsrekorde ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Spieler hält den Rekord für die meisten Pflichtspiele für Hertha BSC in der Bundesliga-Ära?",
        answerA = "Pál Dárdai",
        answerB = "Michael Preetz",
        answerC = "Axel Kruse",
        answerD = "Thomas Kraft",
        correctAnswer = 0,
        explanation = "Pál Dárdai absolvierte die meisten Pflichtspiele für Hertha BSC in der Bundesliga-Ära und ist damit Rekordhalter bei den Einsätzen für den Berliner Verein.",
        difficulty = 4,
        funFact = "Dárdai spielte von 1997 bis 2014 für Hertha BSC – eine außergewöhnliche Vereinstreue, die ihm den Status einer lebenden Legende einbrachte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Aus welchem Verein wechselte Pál Dárdai 1997 zu Hertha BSC?",
        answerA = "Ferencváros TC",
        answerB = "Videoton FC",
        answerC = "Debreceni VSC",
        answerD = "MTK Budapest",
        correctAnswer = 1,
        explanation = "Pál Dárdai wechselte 1997 vom ungarischen Verein Videoton FC (heute Fehérvár FC) zu Hertha BSC und begann damit eine fast zwei Jahrzehnte andauernde Verbindung zum Berliner Verein.",
        difficulty = 4,
        funFact = "Obwohl Dárdai kein teurer Einkauf war, wurde er zu einer der wertvollsten Investitionen, die Hertha BSC je getätigt hat – sowohl als Spieler als auch später als Trainer."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Torwart hält den Rekord für die meisten Bundesliga-Einsätze in der Torwartposition für den Verein?",
        answerA = "Gabor Kiraly",
        answerB = "Nico Mauer",
        answerC = "Thomas Kraft",
        answerD = "Julien Faubert",
        correctAnswer = 2,
        explanation = "Thomas Kraft hält den Rekord für die meisten Bundesliga-Einsätze als Hertha-BSC-Torhüter und war über viele Jahre die unangefochtene Nummer eins im Tor der Berliner.",
        difficulty = 4,
        funFact = "Thomas Kraft spielte von 2012 bis 2020 für Hertha BSC und absolvierte dabei über 140 Bundesliga-Spiele, bevor er den Verein verließ."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher ungarische Torhüter stand von 1997 bis 2004 im Tor von Hertha BSC und ist vor allem für seine grauen Baumwollhosen bekannt?",
        answerA = "Zoltán Szalai",
        answerB = "Péter Molnár",
        answerC = "Ádám Bogdán",
        answerD = "Gábor Király",
        correctAnswer = 3,
        explanation = "Gábor Király spielte von 1997 bis 2004 für Hertha BSC und war bekannt für seine charakteristischen grauen Jogginghosen, die er stets als Unterhose trug – ein Markenzeichen, das ihn weltweit bekannt machte.",
        difficulty = 4,
        funFact = "Király trug diese grauen Hosen auch noch bei der EM 2016 mit Ungarn, als er mit 40 Jahren zum ältesten Spieler in der Geschichte der Europameisterschaften wurde."
    ),

    // --- Champions League & Europapokal Details ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein erzielte Hertha BSC seinen bedeutendsten Sieg in der Champions-League-Gruppenphase 1999/2000?",
        answerA = "AC Milan",
        answerB = "Real Madrid",
        answerC = "FC Barcelona",
        answerD = "Juventus Turin",
        correctAnswer = 0,
        explanation = "Hertha BSC besiegte in der ersten Gruppenphase der Champions League 1999/2000 den AC Milan und setzte damit ein europäisches Ausrufezeichen.",
        difficulty = 4,
        funFact = "Der Sieg gegen den AC Milan wurde zum Symbol der goldenen Ära von Hertha BSC – einem Verein, der nur wenige Jahre zuvor noch in der Regionalliga spielte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welcher Champions-League-Gruppe spielte Hertha BSC in der ersten Gruppenphase der Saison 1999/2000?",
        answerA = "Gruppe A mit Real Madrid",
        answerB = "Gruppe D mit AC Milan und Chelsea FC",
        answerC = "Gruppe B mit Bayern München",
        answerD = "Gruppe C mit Juventus Turin",
        correctAnswer = 1,
        explanation = "Hertha BSC wurde in der Champions League 1999/2000 in die Gruppe D mit dem AC Milan und dem FC Chelsea gelost – eine Hochkaräter-Gruppe, in der die Berliner solide abschnitten.",
        difficulty = 4,
        funFact = "Das Heimspiel gegen Chelsea FC vor über 70.000 Zuschauern im Olympiastadion gilt als eines der stimmungsvollsten Europapokalspiele in der Geschichte des Vereins."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welcher Runde schied Hertha BSC in der Champions League 1999/2000 aus?",
        answerA = "Viertelfinale",
        answerB = "Halbfinale",
        answerC = "Zweite Gruppenphase",
        answerD = "Achtelfinale",
        correctAnswer = 2,
        explanation = "Hertha BSC erreichte die zweite Gruppenphase der Champions League 1999/2000, scheiterte dort aber und schied aus dem Wettbewerb aus.",
        difficulty = 4,
        funFact = "In der zweiten Gruppenphase traf Hertha auf Gegner wie Real Madrid – der Klassenunterschied wurde deutlich spürbar, nachdem die erste Phase noch überzeugend gemeistert worden war."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wie hieß der Hertha-BSC-Kapitän während der Champions-League-Saison 1999/2000?",
        answerA = "Michael Preetz",
        answerB = "Andreas Thom",
        answerC = "Pál Dárdai",
        answerD = "Andreas Schmidt",
        correctAnswer = 3,
        explanation = "Andreas Schmidt war der Kapitän von Hertha BSC während der Champions-League-Saison 1999/2000 und führte die Mannschaft durch diese historische Periode.",
        difficulty = 4,
        funFact = "Schmidt war ein zuverlässiger Abwehrspieler, der die Mannschaft als Anführer prägte, auch wenn die Stars wie Preetz und Deisler das öffentliche Bild dominierten."
    ),

    // --- Abstiege & Wiederaufstiege ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC zuletzt aus der Bundesliga in die 2. Liga ab?",
        answerA = "2022/23",
        answerB = "2021/22",
        answerC = "2020/21",
        answerD = "2019/20",
        correctAnswer = 0,
        explanation = "Hertha BSC stieg in der Saison 2022/23 aus der Bundesliga ab und spielte seitdem in der 2. Bundesliga.",
        difficulty = 4,
        funFact = "Der Abstieg 2023 war besonders bitter, da der Verein dank Windhorst-Investitionen in den Vorjahren über 100 Millionen Euro für neue Spieler ausgegeben hatte, ohne nachhaltigen sportlichen Erfolg."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie viele Male stieg Hertha BSC seit der Bundesliga-Gründung 1963 bis 2023 aus der Bundesliga ab (reguläre Abstiege)?",
        answerA = "Fünfmal",
        answerB = "Siebenmal",
        answerC = "Viermal",
        answerD = "Neunmal",
        correctAnswer = 1,
        explanation = "Hertha BSC stieg insgesamt siebenmal regulär aus der Bundesliga ab (1979/80, 1982/83, 1990/91, 2011/12, 2019/20, 2021/22 knapp vermieden via Relegation, 2022/23).",
        difficulty = 4,
        funFact = "Kein anderer Berliner Verein hat die Bundesliga-Auf- und Abstiege so häufig erlebt wie Hertha BSC – die permanente Achterbahn ist fast schon ein Markenzeichen."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wer erzielte das entscheidende Tor in der Relegation 2022, mit dem Hertha BSC den Klassenerhalt gegen den HSV sicherte?",
        answerA = "Ishak Belfodil",
        answerB = "Dedryck Boyata",
        answerC = "Kevin-Prince Boateng",
        answerD = "Davie Selke",
        correctAnswer = 2,
        explanation = "Kevin-Prince Boateng erzielte in der Relegation 2022 gegen den Hamburger SV einen entscheidenden Treffer und half damit, Hertha BSC in der Bundesliga zu halten – ein emotionaler Moment für den Berliner Rückkehrer.",
        difficulty = 4,
        funFact = "Boateng hatte wenige Monate zuvor seinen Wechsel zurück zu Hertha BSC als emotionale Heimkehr gefeiert – und lieferte in der Relegation prompt einen seiner wichtigsten Treffer überhaupt."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC in die 2. Liga ab und feierte nach nur einer Spielzeit den sofortigen Wiederaufstieg?",
        answerA = "2009/10 – Abstieg, 2010/11 – Aufstieg",
        answerB = "2003/04 – Abstieg, 2004/05 – Aufstieg",
        answerC = "2006/07 – Abstieg, 2007/08 – Aufstieg",
        answerD = "2011/12 – Abstieg, 2012/13 – Aufstieg",
        correctAnswer = 3,
        explanation = "Hertha BSC stieg am Ende der Saison 2011/12 aus der Bundesliga ab und kehrte nach dem Aufstieg als Zweitligameister 2012/13 sofort wieder in die Bundesliga zurück.",
        difficulty = 4,
        funFact = "Der sofortige Wiederaufstieg 2013 war mit einem Rekordzuschauerschnitt in der 2. Bundesliga verbunden – die Berliner Fans blieben dem Verein trotz des Abstiegs massenhaft treu."
    ),

    // --- Spieler-Karrieredetails ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Von welchem Verein kam Andreas Thom 1995 zu Hertha BSC und wurde zum wichtigen Aufstiegshelden?",
        answerA = "Celtic FC Glasgow",
        answerB = "Bayer Leverkusen",
        answerC = "1. FC Köln",
        answerD = "Borussia Dortmund",
        correctAnswer = 0,
        explanation = "Andreas Thom wechselte 1995 vom Celtic FC Glasgow zu Hertha BSC und wurde unter anderem durch seinen Beitrag zum Aufstieg 1997 zum Helden der 'Alten Dame'.",
        difficulty = 4,
        funFact = "Thom war in der DDR beim BFC Dynamo Berlin groß geworden und ist damit einer der wenigen Spieler, der sowohl für DDR- als auch für gesamtdeutsche Klub-Teams spielte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welche Nationalität hatte Striker Kjetil Rekdal, der in den späten 1990ern für Hertha BSC spielte?",
        answerA = "Schwedisch",
        answerB = "Norwegisch",
        answerC = "Dänisch",
        answerD = "Finnisch",
        correctAnswer = 1,
        explanation = "Kjetil Rekdal ist norwegischer Nationalspieler und spielte in der erfolgreichen Hertha-Ära der späten 1990er Jahre für den Berliner Verein.",
        difficulty = 4,
        funFact = "Rekdal ist in Norwegen vor allem für sein Tor bekannt, mit dem er Brasilien bei der WM 1998 besiegte – eines der größten Fußball-Überraschungsresultate der Geschichte."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Für wie viel Millionen Euro wechselte Dedryck Boyata 2021 von Hertha BSC zu Nottingham Forest?",
        answerA = "1 Million Euro",
        answerB = "2 Millionen Euro",
        answerC = "Ablösefrei",
        answerD = "3 Millionen Euro",
        correctAnswer = 2,
        explanation = "Dedryck Boyata verließ Hertha BSC 2022 ablösefrei – trotz seines Status als belgischer Nationalspieler und Kapitän bei Hertha konnte der Verein keinen Transfererlös generieren.",
        difficulty = 4,
        funFact = "Boyata war Kapitän der belgischen Nationalmannschaft und hatte sich bei Hertha als einer der wenigen Transfers der Windhorst-Ära positiv bewährt – sein Abgang war ein großer Verlust."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-BSC-Spieler wurde in der Saison 2019/20 an die AS Roma verliehen und wechselte kurz darauf fest nach England?",
        answerA = "Lucas Tousart",
        answerB = "Ondřej Duda",
        answerC = "Valentino Lazaro",
        answerD = "Davide Esposito",
        correctAnswer = 3,
        explanation = "Valentino Lazaro wurde 2019/20 zunächst von Hertha BSC an Inter Mailand und dann an andere Vereine verliehen, bevor er fest das Blau-Weiß verließ.",
        difficulty = 4,
        funFact = "Lazaro war ein technisch hochbegabter Außenspieler, der mit einem Tor durch eine Fallrückzieher-Hacke in der Premier League für Aufsehen sorgte."
    ),

    // --- Internationale Spieler bei Hertha ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Aus welchem Land stammt Ivan Perišić, der 2012 kurz für Hertha BSC spielte?",
        answerA = "Kroatien",
        answerB = "Serbien",
        answerC = "Slowenien",
        answerD = "Bosnien-Herzegowina",
        correctAnswer = 0,
        explanation = "Ivan Perišić ist kroatischer Nationalspieler und spielte in der Saison 2012/13 für Hertha BSC in der 2. Bundesliga, bevor er zu Borussia Dortmund wechselte.",
        difficulty = 4,
        funFact = "Perišić spielte für Hertha in deren Zweitliga-Saison 2012/13 und war maßgeblich am direkten Wiederaufstieg beteiligt, bevor er für deutlich mehr Geld zu BVB wechselte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher ghanaische Nationalspieler spielte von 2010 bis 2013 für Hertha BSC?",
        answerA = "Sulley Muntari",
        answerB = "John Boye",
        answerC = "Asamoah Gyan",
        answerD = "Kwadwo Asamoah",
        correctAnswer = 1,
        explanation = "John Boye, ghanaischer Nationalspieler und Innenverteidiger, spielte von 2010 bis 2013 für Hertha BSC und war ein zuverlässiger Baustein in der Abwehr des Berliner Vereins.",
        difficulty = 4,
        funFact = "John Boye ist in Ghana auch deshalb bekannt, weil er nach dem WM-Aus 2010 im Elfmeterschießen gegen Uruguay öffentlich beschuldigt wurde, das Spiel 'verloren' zu haben – völlig zu Unrecht."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher jamaikanische Nationalspieler wechselte 2021 zu Hertha BSC und war einer der teuersten Einkäufe der Windhorst-Ära?",
        answerA = "Kemar Roofe",
        answerB = "Leon Bailey",
        answerC = "Omar Richards",
        answerD = "Stephy Mavididi",
        correctAnswer = 1,
        explanation = "Leon Bailey, jamaikanischer Nationalspieler, wurde als Teil der Windhorst-finanzierten Einkäufe zu Hertha BSC verpflichtet, entwickelte sich aber nicht wie erhofft.",
        difficulty = 4,
        funFact = "Leon Bailey war zuvor bei Bayer Leverkusen aufgefallen, wo er mit seinen Dribblings und Toren großes Aufsehen erregt hatte – bei Hertha konnte er diese Form nie konstant abrufen."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher kolumbianische Spieler wechselte 2019 zu Hertha BSC und spielte dort bis 2021?",
        answerA = "Juan Cuadrado",
        answerB = "James Rodríguez",
        answerC = "David Ospina",
        answerD = "Jhon Córdoba",
        correctAnswer = 3,
        explanation = "Jhon Córdoba wechselte im Sommer 2019 zu Hertha BSC und spielte bis 2021 für den Berliner Verein, bevor er zu Krasnodar in Russland wechselte.",
        difficulty = 4,
        funFact = "Córdoba erzielte in seiner Zeit bei Hertha einige wichtige Tore, war aber nie konstant genug, um sich als echter Stürmer-Hoffnungsträger zu etablieren."
    ),

    // --- Vereinsfinanzen & Struktur ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welche Gesamtsumme investierte Lars Windhorst zwischen 2019 und 2022 in Hertha BSC?",
        answerA = "374 Millionen Euro",
        answerB = "250 Millionen Euro",
        answerC = "450 Millionen Euro",
        answerD = "300 Millionen Euro",
        correctAnswer = 0,
        explanation = "Lars Windhorst investierte über seine Tennor Holding insgesamt rund 374 Millionen Euro in Hertha BSC – die größte Einzelinvestition in einen deutschen Fußballverein außerhalb des FC Bayern.",
        difficulty = 4,
        funFact = "Trotz dieser immensen Investition stieg Hertha BSC 2023 ab. Windhorst und Hertha stritten anschließend vor Gericht um Teile des investierten Geldes."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde Michael Preetz Geschäftsführer Sport bei Hertha BSC?",
        answerA = "2007",
        answerB = "2009",
        answerC = "2011",
        answerD = "2005",
        correctAnswer = 1,
        explanation = "Michael Preetz wurde am 7. Juni 2009 zum Geschäftsführer Sport bei Hertha BSC ernannt und löste damit den scheidenden Dieter Hoeneß ab.",
        difficulty = 4,
        funFact = "Preetz leitete die Transferaktivitäten der 'Big City Club'-Ära und musste sich nach dem erneuten Abstieg 2021 vielfacher Kritik an seiner Personalpolitik stellen, bevor er entlassen wurde."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr übernahm Fredi Bobic die Rolle als Geschäftsführer Sport bei Hertha BSC?",
        answerA = "2019",
        answerB = "2020",
        answerC = "2021",
        answerD = "2022",
        correctAnswer = 2,
        explanation = "Fredi Bobic übernahm im Sommer 2021 die Rolle des Geschäftsführers Sport bei Hertha BSC als Nachfolger des entlassenen Michael Preetz.",
        difficulty = 4,
        funFact = "Bobic kam von Eintracht Frankfurt, wo er die Meisterschaft im DFB-Pokal und starke Europapokal-Teilnahmen verantwortet hatte. Bei Hertha war die Lage von Anfang an turbulenter."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welche Gesellschaftsform hat Hertha BSC in seiner modernen Vereinsstruktur?",
        answerA = "Hertha BSC e.V.",
        answerB = "Hertha BSC AG",
        answerC = "Hertha BSC GmbH",
        answerD = "Hertha BSC GmbH & Co. KGaA",
        correctAnswer = 3,
        explanation = "Die Profi-Fußballabteilung von Hertha BSC ist als GmbH & Co. KGaA organisiert – eine Kommanditgesellschaft auf Aktien, die es ermöglichte, externe Investoren wie Lars Windhorst aufzunehmen.",
        difficulty = 4,
        funFact = "Diese Gesellschaftsform ist im deutschen Profifußball verbreitet (z.B. auch bei BVB), da sie die 50+1-Regel wahren und gleichzeitig Investoren beteiligen kann."
    ),

    // --- Saisondetails & Tabellenplätze ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welchen Platz belegte Hertha BSC in der Bundesliga-Saison 2018/19?",
        answerA = "11. Platz",
        answerB = "8. Platz",
        answerC = "14. Platz",
        answerD = "5. Platz",
        correctAnswer = 0,
        explanation = "Hertha BSC belegte in der Saison 2018/19 den 11. Platz in der Bundesliga – eine mittelmäßige Platzierung, die aber die Basis für die anschließenden Windhorst-Investitionen legte.",
        difficulty = 4,
        funFact = "Es war die letzte Saison unter dem damaligen Trainer Pál Dárdai in seiner ersten Amtszeit, bevor er im Mai 2019 abgelöst wurde."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie viele Punkte holte Hertha BSC in der Abstiegssaison 2022/23?",
        answerA = "22 Punkte",
        answerB = "26 Punkte",
        answerC = "30 Punkte",
        answerD = "19 Punkte",
        correctAnswer = 1,
        explanation = "Hertha BSC sammelte in der Abstiegssaison 2022/23 nur 26 Punkte und beendete die Spielzeit auf dem letzten Platz der Bundesliga.",
        difficulty = 4,
        funFact = "Mit 26 Punkten war Hertha BSC das schwächste Team der Saison 2022/23, was den deutlichsten Beweis lieferte, dass trotz der massiven Investitionen keine tragfähige Mannschaft aufgebaut worden war."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welcher Saison erzielte Hertha BSC mit Platz 6 in der Bundesliga das beste Ergebnis der 2000er Jahre?",
        answerA = "2001/02",
        answerB = "2003/04",
        answerC = "2006/07",
        answerD = "2009/10",
        correctAnswer = 2,
        explanation = "Hertha BSC erzielte in der Saison 2006/07 mit Platz 6 eines der besten Bundesliga-Ergebnisse der 2000er Jahre und qualifizierte sich damit für den UEFA-Pokal.",
        difficulty = 4,
        funFact = "Der 6. Platz 2007 ermöglichte Hertha erneut die Teilnahme am europäischen Wettbewerb – ein kurzes Aufflackern der Erinnerungen an die Champions-League-Ära des Jahres 2000."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wie viele Tore erzielte Hertha BSC in der Bundesligasaison 2019/20, als Klinsmann kurzzeitig Trainer war?",
        answerA = "38 Tore",
        answerB = "44 Tore",
        answerC = "50 Tore",
        answerD = "32 Tore",
        correctAnswer = 3,
        explanation = "Hertha BSC erzielte in der Saison 2019/20 nur 32 Tore und hatte damit eine der schwächsten Offensiven der Bundesliga – trotz teurer Neuzugänge blieb der erhoffte Aufschwung aus.",
        difficulty = 4,
        funFact = "Die teuren Einkäufe der Windhorst-Ära brachten paradoxerweise kaum Verbesserung – viele Neuzugänge kamen im Winter und brauchten Zeit, die die Mannschaft nicht hatte."
    ),

    // --- Nachwuchs-Talente & Eigengewächse ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher spätere Weltstar spielte in der Jugend von Hertha BSC, bevor er den Verein verließ und international berühmt wurde?",
        answerA = "Kevin-Prince Boateng",
        answerB = "Timo Werner",
        answerC = "Leroy Sané",
        answerD = "Serge Gnabry",
        correctAnswer = 0,
        explanation = "Kevin-Prince Boateng durchlief die gesamte Jugendakademie von Hertha BSC und debütierte dort in der Bundesliga, bevor er zu Tottenham Hotspur wechselte und weltweite Bekanntheit erlangte.",
        difficulty = 4,
        funFact = "Berlin ist Boatengs Heimatstadt, und seine Verbundenheit zu Hertha BSC brachte ihn nach vielen Stationen in Europa (Tottenham, Milan, Schalke etc.) wieder in die Hauptstadt zurück."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher spätere Nationalspieler und Weltmeister 2014 begann seine Karriere in der Hertha-Jugend und wechselte früh zum 1. FC Köln?",
        answerA = "Toni Kroos",
        answerB = "Lukas Podolski",
        answerC = "Mesut Özil",
        answerD = "Mario Götze",
        correctAnswer = 1,
        explanation = "Lukas Podolski begann seine Fußballausbildung in Bergheim und wechselte über Stationen durch die Jugend des 1. FC Köln zum Profifußball – Hertha BSC war nicht direkt in seiner frühen Karriere involviert.",
        difficulty = 4,
        funFact = "Diese Frage testet das Expertenwissen: Podolski ist kein Hertha-Eigengewächs. Echter Hertha-Eigengewächs war hingegen Kevin-Prince Boateng."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-BSC-Jugendtrainer wurde später Cheftrainer der ungarischen Nationalmannschaft?",
        answerA = "Georg Keßler",
        answerB = "Jürgen Röber",
        answerC = "Pál Dárdai",
        answerD = "Andreas Thom",
        correctAnswer = 2,
        explanation = "Pál Dárdai war Trainer der ungarischen Nationalmannschaft und gleichzeitig zeitweise Jugend- und U23-Trainer bei Hertha BSC, bevor er hauptamtlich die erste Mannschaft übernahm.",
        difficulty = 4,
        funFact = "Dárdai manövrierte die ungarische Nationalelf 2016 zu ihrer ersten EM-Teilnahme seit Jahrzehnten – eine bemerkenswerte Leistung, die seine Qualitäten als Trainer unterstrich."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Mittelfeldspieler absolvierte über 300 Pflichtspiele für Hertha BSC und galt als 'Herz' der Mannschaft in den 2010er Jahren?",
        answerA = "Peter Niemeyer",
        answerB = "Sven Bender",
        answerC = "Vladimir Darida",
        answerD = "Fabian Lustenberger",
        correctAnswer = 3,
        explanation = "Fabian Lustenberger spielte von 2008 bis 2019 für Hertha BSC, absolvierte über 300 Pflichtspiele und war über viele Jahre Kapitän und Herzstück der Berliner Mannschaft.",
        difficulty = 4,
        funFact = "Der Schweizer Lustenberger blieb Hertha BSC durch Auf- und Abstiege hindurch treu und gilt als einer der loyalsten Spieler in der jüngeren Vereinsgeschichte."
    ),

    // --- Sonstige Expert-Fakten ---

    // correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Stürmer wurde in der Saison 2016/17 mit 10 Bundesliga-Toren Herthas bester Torschütze?",
        answerA = "Davie Selke",
        answerB = "Vedad Ibišević",
        answerC = "Niklas Stark",
        answerD = "Alexander Esswein",
        correctAnswer = 0,
        explanation = "Davie Selke war in der Saison 2016/17 mit 10 Bundesliga-Toren Herthas bester Torschütze und erregte damit Aufmerksamkeit, die schließlich zu einem Wechsel zu RB Leipzig führte.",
        difficulty = 4,
        funFact = "Selke kehrte später zu Hertha BSC zurück und spielte nochmals für den Verein – ein häufiges Muster bei Spielern, die eine enge Bindung zur 'Alten Dame' entwickelt haben."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher Torwart kam 2020 ablösefrei zu Hertha BSC und wurde zur Nummer 1 im Bundesliga-Tor?",
        answerA = "Rune Jarstein",
        answerB = "Alexander Schwolow",
        answerC = "Thomas Kraft",
        answerD = "Oliver Christensen",
        correctAnswer = 1,
        explanation = "Alexander Schwolow wechselte im Sommer 2020 ablösefrei vom SC Freiburg zu Hertha BSC und verdrängte Thomas Kraft als neue Nummer 1 im Tor.",
        difficulty = 4,
        funFact = "Schwolow hatte in Freiburg durch konstante Leistungen über Jahre überzeugt und war einer der wenigen Transfers der Windhorst-Ära, der als klar gelungen betrachtet werden kann."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-BSC-Trainer startete die Saison 2021/22 und wurde noch während der Hinrunde abgelöst?",
        answerA = "Pál Dárdai",
        answerB = "Felix Magath",
        answerC = "Tayfun Korkut",
        answerD = "Sandro Schwarz",
        correctAnswer = 2,
        explanation = "Tayfun Korkut übernahm Hertha BSC im Herbst 2021 von Pál Dárdai und wurde noch in der Saison 2021/22 durch Felix Magath ersetzt, nachdem die Ergebnisse ausblieben.",
        difficulty = 4,
        funFact = "Hertha BSC hatte in der Saison 2021/22 drei verschiedene Trainer (Dárdai, Korkut, Magath) – ein Zeichen der tiefen sportlichen und strukturellen Krise im Verein."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welchen Verein besiegte Hertha BSC im DFB-Pokal-Finale 1993 NICHT – also: gegen wen verlor Hertha das Finale 1993?",
        answerA = "Borussia Dortmund",
        answerB = "FC Bayern München",
        answerC = "Werder Bremen",
        answerD = "Bayer Leverkusen",
        correctAnswer = 3,
        explanation = "Hertha BSC verlor das DFB-Pokal-Finale 1993 gegen Bayer Leverkusen mit 0:1 – das dritte verlorene Finale nach 1977 und 1979. Hertha hat den DFB-Pokal bis heute nie gewonnen.",
        difficulty = 4,
        funFact = "Das DFB-Pokal-Finale 1993 fand natürlich im Berliner Olympiastadion statt – Hertha spielte quasi ein 'Heimfinale', verlor aber trotzdem gegen Leverkusen."
    ),

)
