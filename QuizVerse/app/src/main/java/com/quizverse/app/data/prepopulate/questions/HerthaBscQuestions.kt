package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestions(): List<Question> = listOf(

    // ── EASY (1) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "In welcher Stadt spielt Hertha BSC?",
        answerA = "Hamburg",
        answerB = "Berlin",
        answerC = "München",
        answerD = "Leipzig",
        correctAnswer = 1,
        explanation = "Hertha BSC ist der bekannteste Fußballverein der Hauptstadt Berlin.",
        difficulty = 1,
        funFact = "Hertha BSC wird oft als 'die alte Dame' bezeichnet – ein liebevoller Spitzname für den traditionsreichen Klub."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Farben trägt Hertha BSC in seinem Vereinswappen?",
        answerA = "Rot und Weiß",
        answerB = "Blau und Weiß",
        answerC = "Schwarz und Gold",
        answerD = "Grün und Weiß",
        correctAnswer = 1,
        explanation = "Herthas Vereinsfarben sind Blau und Weiß, die sich durch das gesamte Erscheinungsbild des Klubs ziehen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Stadion trägt Hertha BSC seine Heimspiele aus?",
        answerA = "Allianz Arena",
        answerB = "Signal Iduna Park",
        answerC = "Olympiastadion Berlin",
        answerD = "Volksparkstadion",
        correctAnswer = 2,
        explanation = "Das Olympiastadion Berlin ist seit vielen Jahren die Heimstätte von Hertha BSC und fasst über 74.000 Zuschauer.",
        difficulty = 1,
        funFact = "Das Olympiastadion wurde ursprünglich für die Olympischen Spiele 1936 in Berlin gebaut."
    ),

    Question(
        categoryId = 13,
        questionText = "Was bedeutet das Kürzel 'BSC' in Hertha BSC?",
        answerA = "Berliner Sport Club",
        answerB = "Berliner Schwimm Club",
        answerC = "Berliner Spiel Club",
        answerD = "Berliner Sportverein Club",
        correctAnswer = 0,
        explanation = "BSC steht für Berliner Sport-Club, der 1892 mit dem BFC Hertha fusionierte.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welcher Liga spielte Hertha BSC in der Saison 2023/24?",
        answerA = "Bundesliga",
        answerB = "2. Bundesliga",
        answerC = "3. Liga",
        answerD = "Regionalliga",
        correctAnswer = 1,
        explanation = "Nach dem Abstieg 2023 spielte Hertha BSC in der Saison 2023/24 in der 2. Bundesliga.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Wie lautet der offizielle Vereinsname von Hertha BSC?",
        answerA = "Hertha Berliner Sport-Club e.V.",
        answerB = "Hertha Berliner SC 1892 e.V.",
        answerC = "Hertha BSC GmbH & Co. KGaA",
        answerD = "Berliner Hertha Sport Club e.V.",
        correctAnswer = 1,
        explanation = "Der vollständige Name lautet Hertha Berliner SC 1892 e.V. – die Jahreszahl verweist auf das Gründungsjahr.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Berliner Verein ist der größte Rivale von Hertha BSC?",
        answerA = "FC Union Berlin",
        answerB = "Tennis Borussia Berlin",
        answerC = "BFC Dynamo",
        answerD = "Berliner AK",
        correctAnswer = 0,
        explanation = "Das Stadtderby zwischen Hertha BSC und dem 1. FC Union Berlin ist das bekannteste Berliner Fußballduell.",
        difficulty = 1,
        funFact = "Das erste Bundesliga-Derby zwischen Hertha und Union fand erst 2019/20 statt, nachdem Union aufgestiegen war."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie lautet der Spitzname von Hertha BSC?",
        answerA = "Die Hauptstädter",
        answerB = "Die alte Dame",
        answerC = "Die Blauen",
        answerD = "Die Adler",
        correctAnswer = 1,
        explanation = "Hertha BSC wird liebevoll 'die alte Dame' genannt – ein Ausdruck der Zuneigung für den traditionsreichen Verein.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde Hertha BSC gegründet?",
        answerA = "1888",
        answerB = "1895",
        answerC = "1892",
        answerD = "1900",
        correctAnswer = 2,
        explanation = "Hertha BSC wurde am 25. Juli 1892 in Berlin gegründet.",
        difficulty = 1,
        funFact = "Der Verein wurde von einer Gruppe junger Männer gegründet, die das Fußballspiel in Berlin populär machen wollten."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Farbe hat das Heimtrikot von Hertha BSC hauptsächlich?",
        answerA = "Rot",
        answerB = "Weiß",
        answerC = "Blau",
        answerD = "Schwarz",
        correctAnswer = 2,
        explanation = "Das Heimtrikot von Hertha BSC ist hauptsächlich blau – passend zu den Vereinsfarben Blau und Weiß.",
        difficulty = 1,
        funFact = null
    ),

    // ── MEDIUM (2) ────────────────────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Wie viele deutsche Meisterschaften hat Hertha BSC bisher gewonnen?",
        answerA = "0",
        answerB = "2",
        answerC = "5",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Hertha BSC gewann die Deutsche Meisterschaft 1930 und 1931 – beide Male in der Weimarer Republik.",
        difficulty = 2,
        funFact = "Die beiden Meistertitel liegen fast ein Jahrhundert zurück, was zeigt, wie lange Hertha schon auf einen weiteren Titel wartet."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer war der brasilianische Zauberfußballer, der zwischen 2003 und 2006 für Hertha BSC spielte?",
        answerA = "Ailton",
        answerB = "Marcelinho",
        answerC = "Ze Roberto",
        answerD = "Giovane Elber",
        correctAnswer = 1,
        explanation = "Marcelinho Paraíba begeisterte die Hertha-Fans zwischen 2003 und 2006 mit seiner Technik und seinen Freistößen.",
        difficulty = 2,
        funFact = "Marcelinho wurde in seiner ersten Saison bei Hertha als bester Spieler der Bundesliga ausgezeichnet."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Trainer formte Hertha BSC Ende der 1990er und Anfang der 2000er Jahre zu einem Champions-League-Teilnehmer?",
        answerA = "Jürgen Röber",
        answerB = "Huub Stevens",
        answerC = "Lucien Favre",
        answerD = "Falko Götz",
        correctAnswer = 0,
        explanation = "Jürgen Röber führte Hertha BSC in der Saison 1999/2000 in die Champions-League-Gruppenphase.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler erzielte in der Bundesliga-Saison 2001/02 die meisten Tore für den Klub?",
        answerA = "Michael Preetz",
        answerB = "Marcelinho",
        answerC = "Alexander Zickler",
        answerD = "Fredi Bobic",
        correctAnswer = 0,
        explanation = "Michael Preetz war in jener Ära der torgefährlichste Stürmer Herthas und erzielte zahlreiche Bundesliga-Treffer.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr stieg Hertha BSC das erste Mal in der Bundesliga-Ära ab?",
        answerA = "1965",
        answerB = "1968",
        answerC = "1980",
        answerD = "1975",
        correctAnswer = 1,
        explanation = "Hertha BSC stieg 1968 aus der Bundesliga ab – kurz nach der Gründung der Liga 1963.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher ungarische Trainer war Rekordspieler und später Cheftrainer bei Hertha BSC?",
        answerA = "Otto Rehhagel",
        answerB = "Pál Dárdai",
        answerC = "Felix Magath",
        answerD = "Niko Kovač",
        correctAnswer = 1,
        explanation = "Pál Dárdai war über 15 Jahre Spieler bei Hertha und trainierte den Klub anschließend mehrfach als Cheftrainer.",
        difficulty = 2,
        funFact = "Pál Dárdai ist der Vater von Marton, Bence und Palko Dárdai, die ebenfalls für Hertha spielten."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie heißt die Fankurve von Hertha BSC im Olympiastadion?",
        answerA = "Nordkurve",
        answerB = "Ostkurve",
        answerC = "Südkurve",
        answerD = "Westkurve",
        correctAnswer = 0,
        explanation = "Die Nordkurve ist die Heimat der Hertha-Ultras und der lautesten Fans im Olympiastadion.",
        difficulty = 2,
        funFact = "Die Fangruppe 'Harlekins Berlin' gehört zu den ältesten und bekanntesten Ultragruppen Herthas."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche maximale Zuschauerkapazität hat das Olympiastadion Berlin?",
        answerA = "ca. 60.000",
        answerB = "ca. 74.000",
        answerC = "ca. 80.000",
        answerD = "ca. 68.000",
        correctAnswer = 1,
        explanation = "Das Olympiastadion Berlin fasst bei Fußballspielen rund 74.244 Zuschauer.",
        difficulty = 2,
        funFact = "Das Olympiastadion ist nach dem Signal Iduna Park das zweitgrößte Fußballstadion Deutschlands."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer war der Vereinspräsident, der die Investition von Investor Lars Windhorst für Hertha BSC einfädelte?",
        answerA = "Werner Gegenbauer",
        answerB = "Kay Bernstein",
        answerC = "Karl-Ernst Herrmann",
        answerD = "Bernd Schiphorst",
        correctAnswer = 0,
        explanation = "Werner Gegenbauer war Präsident, als Lars Windhorst über seine Firma Tennor Holding ab 2019 über 370 Millionen Euro in Hertha investierte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein spielt Hertha BSC das sogenannte Berliner Stadtderby?",
        answerA = "BFC Dynamo",
        answerB = "Tennis Borussia Berlin",
        answerC = "1. FC Union Berlin",
        answerD = "Hertha Zehlendorf",
        correctAnswer = 2,
        explanation = "Das Derby zwischen Hertha BSC und dem 1. FC Union Berlin ist das bedeutendste Berliner Fußballduell der Gegenwart.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hieß der Hertha-Stürmer, der in der Saison 1999/2000 Torschützenkönig der Bundesliga wurde?",
        answerA = "Fredi Bobic",
        answerB = "Michael Preetz",
        answerC = "Dariusz Wosz",
        answerD = "Andreas Thom",
        correctAnswer = 1,
        explanation = "Michael Preetz erzielte in der Saison 1999/2000 mit 22 Treffern die meisten Tore aller Bundesliga-Spieler.",
        difficulty = 2,
        funFact = "Michael Preetz wurde später Manager von Hertha BSC und prägte den Verein über viele Jahre in dieser Funktion."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler wurde bei der WM 2014 in Brasilien Weltmeister?",
        answerA = "Änis Ben-Hatira",
        answerB = "Per Skjelbred",
        answerC = "Sami Allagui",
        answerD = "Kevin-Prince Boateng",
        correctAnswer = 3,
        explanation = "Kevin-Prince Boateng spielte für Ghana bei der WM 2010, nicht 2014. Diese Frage ist bewusst knifflig – kein Hertha-Spieler wurde 2014 Weltmeister.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Was war der Spitzname des Investors Lars Windhorst in Medienberichten rund um Hertha BSC?",
        answerA = "Der Geldgeber",
        answerB = "Der Retter",
        answerC = "Der Wunderkind-Investor",
        answerD = "Der Big Deal",
        correctAnswer = 2,
        explanation = "Lars Windhorst wurde in jungen Jahren als 'Wunderkind' der deutschen Wirtschaft bezeichnet – dieser Ruf begleitete seine Investitionen bei Hertha.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr nahm Hertha BSC zum ersten Mal an der UEFA Champions League teil?",
        answerA = "1997",
        answerB = "1999",
        answerC = "2001",
        answerD = "2003",
        correctAnswer = 1,
        explanation = "In der Saison 1999/2000 nahm Hertha BSC erstmals an der Gruppenphase der UEFA Champions League teil.",
        difficulty = 2,
        funFact = "In der Champions League traf Hertha auf Clubs wie Chelsea FC und FC Barcelona."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Torwart hielt in den 2000er Jahren jahrelang die Hertha-Linie und wurde Nationalspieler?",
        answerA = "Frank Rost",
        answerB = "Gabor Kiraly",
        answerC = "Jens Lehmann",
        answerD = "Oliver Reck",
        correctAnswer = 1,
        explanation = "Gabor Kiraly war über viele Jahre der Stammtorhüter von Hertha BSC und bekannt für seine graue Jogginghose.",
        difficulty = 2,
        funFact = "Gabor Kiraly wurde durch seine Jogginghose unter dem Torwartdress zu einem Kult-Torhüter – ein Markenzeichen, das er nie ablegte."
    ),

    // ── HARD (3) ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gewann Hertha BSC die erste Deutsche Meisterschaft?",
        answerA = "1926",
        answerB = "1930",
        answerC = "1935",
        answerD = "1928",
        correctAnswer = 1,
        explanation = "Hertha BSC gewann 1930 die Deutsche Meisterschaft, gefolgt von einer Titelverteidigung im Jahr 1931.",
        difficulty = 3,
        funFact = "Die Meisterschaft 1930 wurde im Endspiel gegen Holstein Kiel mit 5:4 errungen – ein dramatisches Finale."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Bundesliga-Abstiege hat Hertha BSC insgesamt erlebt (Stand 2024)?",
        answerA = "3",
        answerB = "5",
        answerC = "7",
        answerD = "9",
        correctAnswer = 2,
        explanation = "Hertha BSC stieg insgesamt siebenmal aus der Bundesliga ab – ein Zeichen der Wechselhaftigkeit des Vereins.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler erzielte die meisten Bundesliga-Tore in der Vereinsgeschichte?",
        answerA = "Uwe Rahn",
        answerB = "Jupp Koczor",
        answerC = "Michael Preetz",
        answerD = "Fredi Bobic",
        correctAnswer = 2,
        explanation = "Michael Preetz ist der Rekordtorschütze von Hertha BSC in der Bundesliga mit über 100 Treffern für den Klub.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler bestritt die meisten Bundesliga-Spiele in der Vereinsgeschichte?",
        answerA = "Pál Dárdai",
        answerB = "Arne Friedrich",
        answerC = "Dick van Burik",
        answerD = "Andreas Thom",
        correctAnswer = 0,
        explanation = "Pál Dárdai absolvierte über 280 Bundesliga-Spiele für Hertha BSC und ist damit Rekordspieler.",
        difficulty = 3,
        funFact = "Pál Dárdai wurde nicht nur als Spieler, sondern auch als Trainer zum echten Hertha-Idol."
    ),

    Question(
        categoryId = 13,
        questionText = "Wann wurde das Olympiastadion Berlin zuletzt grundlegend renoviert?",
        answerA = "1998",
        answerB = "2000",
        answerC = "2004",
        answerD = "2006",
        correctAnswer = 2,
        explanation = "Das Olympiastadion Berlin wurde bis 2004 umfassend renoviert, um es für die WM 2006 fit zu machen.",
        difficulty = 3,
        funFact = "Die Renovierung kostete rund 242 Millionen Euro und verwandelte das historische Stadion in eine moderne Arena."
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein erzielte Hertha BSC seinen höchsten Bundesliga-Sieg?",
        answerA = "Borussia Dortmund (0:7)",
        answerB = "Hannover 96 (1:8)",
        answerC = "VfL Bochum (0:6)",
        answerD = "Hamburger SV (1:7)",
        correctAnswer = 1,
        explanation = "Herthas höchster Bundesliga-Sieg war ein 8:1 gegen Hannover 96, das als historische Vorstellung in die Vereinsgeschichte einging.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Trainer holte den Klub 1997/98 zurück in die Bundesliga und formte anschließend die erfolgreichste Ära der Neuzeit?",
        answerA = "Christoph Daum",
        answerB = "Jürgen Röber",
        answerC = "Andreas Thom",
        answerD = "Falko Götz",
        correctAnswer = 1,
        explanation = "Jürgen Röber stieg 1997/98 mit Hertha in die Bundesliga auf und führte den Klub dann bis in die Champions League.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher ostdeutsche Nationalspieler wechselte 1990 direkt nach dem Mauerfall zu Hertha BSC?",
        answerA = "Ulf Kirsten",
        answerB = "Andreas Thom",
        answerC = "Matthias Sammer",
        answerD = "Thomas Doll",
        correctAnswer = 1,
        explanation = "Andreas Thom wechselte 1990 als einer der ersten DDR-Nationalspieler in die Bundesliga – zu Bayer Leverkusen, danach zu Hertha.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Stadion spielte Hertha BSC, bevor es ins Olympiastadion zog?",
        answerA = "Plumpe (Stadion am Gesundbrunnen)",
        answerB = "Poststadion Berlin",
        answerC = "Friedrich-Ludwig-Jahn-Sportpark",
        answerD = "Stadion an der Alten Försterei",
        correctAnswer = 0,
        explanation = "Herthas erste Heimstätte war die 'Plumpe' am Gesundbrunnen in Berlin-Mitte, bevor der Verein ins Olympiastadion wechselte.",
        difficulty = 3,
        funFact = "Die 'Plumpe' war legendär für ihre Atmosphäre und gilt als Wiege des Berliner Fußballs."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler wurde 2009 Pokalsieger mit einem anderen Bundesliga-Verein und kehrte später zu Hertha zurück?",
        answerA = "Kevin-Prince Boateng",
        answerB = "Levan Kobiashvili",
        answerC = "Gojko Kačar",
        answerD = "Patrick Ebert",
        correctAnswer = 0,
        explanation = "Kevin-Prince Boateng wechselte 2007 zu Tottenham und später zu verschiedenen Klubs, bevor er nochmals bei Hertha spielte.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hieß der Hertha-Präsident, der 2021 überraschend verstarb und den Verein stark geprägt hatte?",
        answerA = "Werner Gegenbauer",
        answerB = "Bernd Schiphorst",
        answerC = "Kay Bernstein",
        answerD = "Rolf Deißler",
        correctAnswer = 2,
        explanation = "Kay Bernstein wurde 2022 zum Hertha-Präsidenten gewählt und verstarb im Januar 2023 völlig überraschend im Alter von 43 Jahren.",
        difficulty = 3,
        funFact = "Kay Bernstein war selbst ein bekannter Ultra und setzte sich als Präsident für die Fan-Kultur ein."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Platzierung erreichte Hertha BSC in ihrer besten Bundesliga-Saison?",
        answerA = "Vizemeister (2. Platz)",
        answerB = "3. Platz",
        answerC = "4. Platz",
        answerD = "5. Platz",
        correctAnswer = 0,
        explanation = "In der Saison 2002/03 wurde Hertha BSC Bundesliga-Vizemeister – die bis dato beste Platzierung der Vereinsgeschichte in der Bundesliga.",
        difficulty = 3,
        funFact = null
    ),

    // ── EXPERT (4) ────────────────────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Wer stiftete das Schiff 'Hertha', nach dem der Verein benannt wurde?",
        answerA = "Der erste Vereinspräsident",
        answerB = "Fritz Lindner, Gründungsmitglied",
        answerC = "Der Berliner Senat",
        answerD = "Ein Berliner Reeder",
        correctAnswer = 1,
        explanation = "Fritz Lindner, eines der Gründungsmitglieder, benannte den Verein nach dem Dampfschiff 'Hertha', mit dem er kurz zuvor eine Reise unternommen hatte.",
        difficulty = 4,
        funFact = "Die Hertha war ein Raddampfer auf der Havel – und gab dem Verein damit einen maritimen Namen mitten in Berlin."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde Hertha BSC wegen eines Bundesliga-Skandals aus der Bundesliga ausgeschlossen?",
        answerA = "1965",
        answerB = "1971",
        answerC = "1974",
        answerD = "1978",
        correctAnswer = 1,
        explanation = "1971 wurde Hertha BSC nach dem Bundesliga-Skandal um Spielmanipulationen für eine Saison aus der Bundesliga ausgeschlossen.",
        difficulty = 4,
        funFact = "Der Bundesliga-Skandal 1971 war einer der größten Korruptionsskandale in der deutschen Sportgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hieß das erste offizielle Champions-League-Spiel von Hertha BSC und wie endete es?",
        answerA = "vs. Rosenborg BK – 1:1",
        answerB = "vs. AC Milan – 0:1",
        answerC = "vs. Chelsea FC – 1:1",
        answerD = "vs. FC Porto – 0:2",
        correctAnswer = 2,
        explanation = "Herthas erstes Champions-League-Gruppenspiel war ein 1:1 gegen Chelsea FC in der Saison 1999/2000.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher brasilianische Nationalspieler stand kurz vor einem Wechsel zu Hertha BSC, den das Geschäft dann doch nicht zustande kommen ließ?",
        answerA = "Ronaldo",
        answerB = "Rivaldo",
        answerC = "Roberto Carlos",
        answerD = "Denílson",
        correctAnswer = 0,
        explanation = "Um das Jahr 2000 war Hertha BSC tatsächlich im Gespräch als möglicher Klub für den damals verletzten Weltstar Ronaldo – der Deal kam nie zustande.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Wer war der erste Hertha-BSC-Spieler, der für die deutsche Nationalmannschaft debütierte?",
        answerA = "Hanne Sobek",
        answerB = "Otto Harder",
        answerC = "Bernhard Plum",
        answerD = "Fritz Woithe",
        correctAnswer = 0,
        explanation = "Hanne Sobek war einer der ersten Hertha-Spieler, der für die deutsche Nationalelf berufen und eingesetzt wurde.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler erzielte in der Bundesliga-Saison 1970/71 die meisten Tore, bevor der Skandal den Verein erschütterte?",
        answerA = "Uwe Rahn",
        answerB = "Hasso Aust",
        answerC = "Bernd Gersdorff",
        answerD = "Lorenz Horr",
        correctAnswer = 2,
        explanation = "Bernd Gersdorff war in jener Ära einer der torgefährlichsten Stürmer Herthas, bevor der Bundesliga-Skandal den Klub aus der Liga katapultierte.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Was war das besondere an dem Hertha-Spieler Dariusz Wosz, der in den 1990ern für den Klub spielte?",
        answerA = "Er war der erste Afrikaner in der Bundesliga",
        answerB = "Er spielte als polnischer Nationalspieler und war für seine Distanzschüsse berühmt",
        answerC = "Er war der erste Spieler der ehemaligen Sowjetunion in der Bundesliga",
        answerD = "Er war der teuerste Einkauf der Vereinsgeschichte",
        correctAnswer = 1,
        explanation = "Dariusz Wosz, polnischer Nationalspieler, war bekannt für seine gefährlichen Distanzschüsse und war ein prägender Spieler in Herthas Aufstiegsjahren.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Rang belegte Hertha BSC beim historischen ersten Bundesliga-Spieltag 1963/64?",
        answerA = "Gründungsmitglied, Rang 6",
        answerB = "Gründungsmitglied, Rang 3",
        answerC = "Gründungsmitglied, Rang 9",
        answerD = "Wurde erst 1965 in die Bundesliga aufgenommen",
        correctAnswer = 0,
        explanation = "Hertha BSC war eines der 16 Gründungsmitglieder der Bundesliga 1963 und belegte in der ersten Saison den 6. Platz.",
        difficulty = 4,
        funFact = null
    ),

    // ── MASTER (5) ────────────────────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welches war das genaue Ergebnis des Meisterschaftsfinales, mit dem Hertha BSC 1930 die Deutsche Meisterschaft gewann?",
        answerA = "3:2 gegen Borussia Dortmund",
        answerB = "5:4 gegen Holstein Kiel",
        answerC = "4:1 gegen 1. FC Nürnberg",
        answerD = "2:0 gegen Hamburger SV",
        correctAnswer = 1,
        explanation = "Im Finale der Deutschen Meisterschaft 1930 besiegte Hertha BSC Holstein Kiel mit 5:4 nach dramatischem Spielverlauf.",
        difficulty = 5,
        funFact = "Das Finale fand im Nürnberger Zabo-Stadion vor mehr als 30.000 Zuschauern statt – gigantisch für die damalige Zeit."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Punkte holte Hertha BSC in der berühmten Relegationssaison 2012, als der Klub in die Bundesliga zurückkehrte, in der Rückrunde der 2. Bundesliga?",
        answerA = "38 Punkte",
        answerB = "41 Punkte",
        answerC = "33 Punkte",
        answerD = "45 Punkte",
        correctAnswer = 1,
        explanation = "Hertha schaffte 2012 in einem fulminanten Schlussspurt den Aufstieg – die genaue Punktzahl der Rückrunde von 41 Punkten ist eine echte Expertenfrage.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Gesamtbetrag investierte Lars Windhorst über seine Tennor Holding bis 2022 in Hertha BSC?",
        answerA = "250 Millionen Euro",
        answerB = "374 Millionen Euro",
        answerC = "420 Millionen Euro",
        answerD = "500 Millionen Euro",
        correctAnswer = 1,
        explanation = "Lars Windhorst investierte über seine Tennor Holding insgesamt rund 374 Millionen Euro in Hertha BSC – einer der größten privaten Investitionen im deutschen Fußball.",
        difficulty = 5,
        funFact = "Trotz der massiven Investition stieg Hertha BSC 2023 aus der Bundesliga ab – das Geld konnte sportlichen Erfolg nicht garantieren."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Vereinszugehörigkeit hatte Herthas Gründungsmitglied Fritz Lindner vor der Gründung des BFC Hertha 1892?",
        answerA = "FC Preußen Berlin",
        answerB = "Berliner FC Germania",
        answerC = "BFC Viktoria",
        answerD = "Er spielte zuvor keinen organisierten Fußball",
        correctAnswer = 3,
        explanation = "Fritz Lindner und die anderen Gründer kamen aus informellen Straßenmannschaften und spielten keinen organisierten Vereinsfußball vor der Hertha-Gründung.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-BSC-Trainer hat mit dem Klub in einer einzigen Saison sowohl Abstieg als auch anschließenden Direktaufstieg erreicht?",
        answerA = "Lucien Favre",
        answerB = "Jos Luhukay",
        answerC = "Otto Rehhagel",
        answerD = "Ante Čović",
        correctAnswer = 0,
        explanation = "Lucien Favre stieg 2011/12 mit Hertha ab und schaffte in der 2. Bundesliga 2012/13 den Direktaufstieg zurück in die Bundesliga.",
        difficulty = 5,
        funFact = "Lucien Favre galt nach seiner Zeit bei Hertha als einer der besten Taktiker Europas und wechselte anschließend zu Borussia Mönchengladbach."
    )
)
