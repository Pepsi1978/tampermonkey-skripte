package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsHard3(): List<Question> = listOf(

    // ── BUNDESLIGA SAISONS & PLATZIERUNGEN (1–10) ─────────────────────────────

    // Q1 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welcher Saison erzielte Hertha BSC mit Platz 3 das bisher beste Bundesliga-Ergebnis der Nachkriegsgeschichte?",
        answerA = "1998/1999",
        answerB = "2001/2002",
        answerC = "2016/2017",
        answerD = "2003/2004",
        correctAnswer = 0,
        explanation = "In der Saison 1998/99 belegte Hertha BSC Platz 3 in der Bundesliga – das bis heute beste Ergebnis der modernen Vereinsgeschichte. Der Rückstand auf Bayer Leverkusen (Platz 2) betrug nur einen Punkt.",
        difficulty = 3,
        funFact = "Hertha qualifizierte sich damit erstmals in der Bundesliga-Ära für den UEFA-Pokal."
    ),

    // Q2 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Platz reichte Hertha BSC in der Saison 2016/17 für die Qualifikation zur Europa League?",
        answerA = "Platz 4",
        answerB = "Platz 5",
        answerC = "Platz 7",
        answerD = "Platz 6",
        correctAnswer = 3,
        explanation = "Hertha BSC beendete die Saison 2016/17 auf Platz 6 und qualifizierte sich damit für die Europa League-Playoffs. Es war eine der stärksten Leistungen der jüngeren Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Hertha startete diese Saison mit neun Siegen in den ersten zwölf Spielen – Vereinsrekord für einen Saisonbeginn."
    ),

    // Q3 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie viele Male stieg Hertha BSC bis 2023 insgesamt aus der Bundesliga ab?",
        answerA = "Fünf Mal",
        answerB = "Sechs Mal",
        answerC = "Sieben Mal",
        answerD = "Acht Mal",
        correctAnswer = 2,
        explanation = "Hertha BSC stieg bis 2023 insgesamt siebenmal aus der Bundesliga ab (1965, 1980, 1983, 1991, 2010, 2012, 2023). Nur Nürnberg (9) und Bielefeld (8) stiegen häufiger ab.",
        difficulty = 3,
        funFact = "Trotz der vielen Abstiege gelang Hertha stets die Rückkehr in die Bundesliga – oft sogar als Meister der 2. Liga."
    ),

    // Q4 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC zum bisher letzten Mal (Stand 2023) direkt aus der Bundesliga ab?",
        answerA = "2020/2021",
        answerB = "2021/2022",
        answerC = "2019/2020",
        answerD = "2022/2023",
        correctAnswer = 3,
        explanation = "In der Saison 2022/23 stieg Hertha BSC als Tabellenvorletzter direkt aus der Bundesliga ab. Es war der siebte Bundesliga-Abstieg der Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Der Abstieg besiegelte das Ende einer turbulenten Ära mit mehreren Trainerwechseln und dem Windhorst-Investment."
    ),

    // Q5 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein spielte Hertha BSC die Bundesliga-Relegation 2012 – und was war das Ergebnis?",
        answerA = "Eintracht Frankfurt – Hertha verlor",
        answerB = "Fortuna Düsseldorf – Hertha verlor",
        answerC = "Hamburger SV – Hertha gewann",
        answerD = "Karlsruher SC – Hertha gewann",
        correctAnswer = 1,
        explanation = "In der Relegation 2012 traf Hertha auf Fortuna Düsseldorf und verlor über beide Spiele. Damit stieg Hertha in die 2. Bundesliga ab – nur ein Jahr nach dem DFB-Pokal-Triumph 2011.",
        difficulty = 3,
        funFact = "Es war der blamabelste Abstieg der Vereinsgeschichte: DFB-Pokalsieger 2011, Absteiger 2012."
    ),

    // Q6 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein sicherte sich Hertha BSC in der Relegation 2022 den Bundesliga-Verbleib – und wie hoch war der Gesamtscore?",
        answerA = "Hamburger SV – 2:0 Gesamtscore",
        answerB = "Hamburger SV – 2:1 Gesamtscore",
        answerC = "1. FC Nürnberg – 3:1 Gesamtscore",
        answerD = "Fortuna Düsseldorf – 1:0 Gesamtscore",
        correctAnswer = 0,
        explanation = "In der Relegation 2022 traf Hertha auf den Hamburger SV. Das Rückspiel in Hamburg gewann Hertha 2:0, das Hinspiel endete 0:0. Damit blieb Hertha mit einem Gesamtscore von 2:0 in der Bundesliga.",
        difficulty = 3,
        funFact = "Der HSV war damit zum wiederholten Mal in der Relegation gegen einen Bundesligisten gescheitert."
    ),

    // Q7 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "In welchen zwei aufeinanderfolgenden Jahren gewann Hertha BSC die deutsche Meisterschaft?",
        answerA = "1926 und 1927",
        answerB = "1933 und 1934",
        answerC = "1928 und 1929",
        answerD = "1930 und 1931",
        correctAnswer = 3,
        explanation = "Hertha BSC gewann 1930 und 1931 in Folge die Deutsche Fußballmeisterschaft – bis heute die einzigen nationalen Meisterschaften des Vereins.",
        difficulty = 3,
        funFact = "Beide Titel wurden im damaligen Endrundenformat gewonnen, das nichts mit dem heutigen Ligasystem zu vergleichen ist."
    ),

    // Q8 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welchen Bundesliga-Platz belegte Hertha BSC in der Saison 2001/02?",
        answerA = "Platz 2",
        answerB = "Platz 3",
        answerC = "Platz 4",
        answerD = "Platz 5",
        correctAnswer = 2,
        explanation = "In der Saison 2001/02 belegte Hertha BSC Platz 4 in der Bundesliga und qualifizierte sich für den UEFA-Pokal.",
        difficulty = 3,
        funFact = "Es war eine der konstantesten Hertha-Saisons der frühen 2000er Jahre unter Trainer Huub Stevens."
    ),

    // Q9 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr stieg Hertha BSC nach dem Zwangsabstieg von 1965 erstmals wieder in die Bundesliga auf?",
        answerA = "1967",
        answerB = "1968",
        answerC = "1971",
        answerD = "1975",
        correctAnswer = 1,
        explanation = "Nach dem Zwangsabstieg 1965 wegen der Bundesliga-Bestechungsaffäre stieg Hertha BSC 1968 wieder in die Bundesliga auf.",
        difficulty = 3,
        funFact = "Der Zwangsabstieg 1965 war eine der dunkelsten Stunden des Vereins – Hertha hatte Spieler bestochen."
    ),

    // Q10 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Was kennzeichnete Herthas turbulente Saison 2019/20 aus Trainerperspektive besonders?",
        answerA = "Hertha hatte drei verschiedene Trainer in einer Saison",
        answerB = "Der Trainer gewann den Preis als bester Bundesliga-Trainer",
        answerC = "Hertha beendete die Saison mit einem neuen Torrekord",
        answerD = "Jürgen Klinsmann trat per Facebook-Post nach 76 Tagen zurück",
        correctAnswer = 3,
        explanation = "In der Saison 2019/20 übernahm Jürgen Klinsmann und trat bereits nach nur 76 Tagen im Amt via Facebook-Post zurück. Sein spektakulärer Abgang sorgte bundesweit für Aufsehen.",
        difficulty = 3,
        funFact = "Klinsmann veröffentlichte danach ein internes Video, in dem er die Vereinsführung massiv kritisierte."
    ),

    // ── DERBY GEGEN UNION BERLIN – DETAILS (11–20) ────────────────────────────

    // Q11 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie endete das allererste Bundesliga-Derbyduell zwischen Hertha BSC und Union Berlin in der Saison 2019/20?",
        answerA = "1:0 für Hertha",
        answerB = "1:1 Unentschieden",
        answerC = "0:0 Unentschieden",
        answerD = "0:1 für Union",
        correctAnswer = 1,
        explanation = "Das erste Bundesliga-Derby zwischen Hertha BSC und Union Berlin in der Saison 2019/20 endete 1:1. Es war ein historisches Spiel, da beide Berliner Clubs erstmals in der Bundesliga aufeinandertrafen.",
        difficulty = 3,
        funFact = "Union Berlin war in der Saison 2019/20 erstmals überhaupt in der Bundesliga – direkt im Derby ein Unentschieden gegen den Stadtrivalen."
    ),

    // Q12 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Mit welchem Ergebnis gewann Union Berlin das Derbyspiel am 9. April 2022 im Olympiastadion?",
        answerA = "2:0",
        answerB = "3:1",
        answerC = "4:1",
        answerD = "2:1",
        correctAnswer = 2,
        explanation = "Am 9. April 2022 besiegte Union Berlin Hertha BSC im Olympiastadion mit 4:1. Union-Torschützen waren Genki Haraguchi, Grischa Prömel, Sheraldo Becker und Sven Michel.",
        difficulty = 3,
        funFact = "Es war eine der höchsten Derby-Niederlagen für Hertha in der Bundesliga-Geschichte der Berlin-Derbys."
    ),

    // Q13 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Wie endete das Bundesliga-Derby Hertha BSC gegen Union Berlin am 28. Januar 2023?",
        answerA = "1:0 für Hertha",
        answerB = "1:1 Unentschieden",
        answerC = "0:3 für Union",
        answerD = "2:0 für Union",
        correctAnswer = 3,
        explanation = "Das Derby am 28. Januar 2023 im Olympiastadion gewann Union Berlin mit 2:0. Es war der fünfte Derby-Sieg in Folge für Union in der Bundesliga.",
        difficulty = 3,
        funFact = "Union-Torschützen waren Danilho Doekhi (44. Minute) und Paul Seguin (67. Minute)."
    ),

    // Q14 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie viele Bundesliga-Derbys zwischen Hertha und Union Berlin gewann Union in Folge bis Ende der Saison 2022/23?",
        answerA = "Drei in Folge",
        answerB = "Vier in Folge",
        answerC = "Fünf in Folge",
        answerD = "Sechs in Folge",
        correctAnswer = 2,
        explanation = "Union Berlin gewann in der Bundesliga fünf Derby-Spiele in Folge gegen Hertha BSC – eine Serie, die die Dominanz der Köpenicker in dieser Rivalität der 2020er Jahre zeigt.",
        difficulty = 3,
        funFact = "Hertha stieg nach dieser langen Negativ-Serie gegen Union am Ende der Saison 2022/23 aus der Bundesliga ab."
    ),

    // Q15 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wann trafen Hertha BSC und Union Berlin erstmals in einem Bundesliga-Pflichtspiel aufeinander?",
        answerA = "September 2018",
        answerB = "August 2019",
        answerC = "Oktober 2019",
        answerD = "Januar 2020",
        correctAnswer = 1,
        explanation = "Das erste Bundesliga-Derby zwischen Hertha und Union fand im August 2019 statt, als Union Berlin in der Saison 2019/20 erstmals in die Bundesliga aufgestiegen war.",
        difficulty = 3,
        funFact = "Union Berlin hatte bis zu diesem Aufstieg noch nie in der Bundesliga gespielt – der Aufstieg 2019 machte das Berliner Derby erst möglich."
    ),

    // Q16 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welcher Saison erreichte Union Berlin erstmals die UEFA Champions League – in derselben Saison, in der Hertha BSC abstieg?",
        answerA = "2022/2023",
        answerB = "2020/2021",
        answerC = "2021/2022",
        answerD = "2023/2024",
        correctAnswer = 0,
        explanation = "In der Saison 2022/23 qualifizierte sich Union Berlin zum ersten Mal in der Vereinsgeschichte für die UEFA Champions League – in derselben Saison, in der Hertha BSC abstieg.",
        difficulty = 3,
        funFact = "Das Schicksal der beiden Berliner Clubs könnte in dieser Saison nicht gegensätzlicher gewesen sein."
    ),

    // Q17 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welches war das torreichste Bundesliga-Derby zwischen Hertha BSC und Union Berlin?",
        answerA = "4:1 für Union (April 2022)",
        answerB = "3:0 für Hertha (November 2020)",
        answerC = "3:2 für Union (August 2022)",
        answerD = "2:1 für Hertha (Oktober 2021)",
        correctAnswer = 0,
        explanation = "Das torreichste Bundesliga-Derby zwischen Hertha und Union war das 4:1 für Union Berlin am 9. April 2022 im Olympiastadion – insgesamt fünf Tore in einem Spiel.",
        difficulty = 3,
        funFact = "Hertha-Trainer Felix Magath konnte die hohe Niederlage trotz seiner Erfahrung nicht verhindern."
    ),

    // Q18 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Spieler erzielte beim 4:1-Derbysieg Unions gegen Hertha im April 2022 das erste Tor?",
        answerA = "Sheraldo Becker",
        answerB = "Grischa Prömel",
        answerC = "Sven Michel",
        answerD = "Genki Haraguchi",
        correctAnswer = 3,
        explanation = "Beim 4:1-Derbysieg Unions gegen Hertha am 9. April 2022 erzielte Genki Haraguchi in der 31. Minute das erste Tor für Union Berlin.",
        difficulty = 3,
        funFact = "Genki Haraguchi ist ein japanischer Nationalspieler, der für seine Torgefährlichkeit in entscheidenden Spielen bekannt ist."
    ),

    // Q19 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Wie endete das erste Derby der Saison 2022/23 (Hinspiel) zwischen Union Berlin und Hertha BSC in Köpenick?",
        answerA = "1:0 für Union",
        answerB = "3:1 für Union",
        answerC = "1:1 Unentschieden",
        answerD = "2:0 für Hertha",
        correctAnswer = 1,
        explanation = "Das Hinspiel der Saison 2022/23 in der Alten Försterei gewann Union Berlin mit 3:1 gegen Hertha BSC.",
        difficulty = 3,
        funFact = "In dieser Saison gewann Union beide Derbys – das Hinspiel 3:1 und das Rückspiel 2:0."
    ),

    // Q20 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welches Derby-Ergebnis erzielte Hertha BSC in der Saison 2020/21 im Heimspiel gegen Union Berlin?",
        answerA = "0:1",
        answerB = "1:0",
        answerC = "3:0",
        answerD = "2:2",
        correctAnswer = 2,
        explanation = "In der Saison 2020/21 gewann Hertha BSC das Heimderby gegen Union Berlin mit 3:0 – einer der deutlichsten Derby-Siege in der Bundesliga-Derbygeschichte der beiden Vereine.",
        difficulty = 3,
        funFact = "Es war einer der wenigen klaren Hertha-Siege in der Bundesliga-Derby-Serie gegen Union."
    ),

    // ── TRAINER, TRANSFERS & SPEKTAKULÄRE EREIGNISSE (21–30) ──────────────────

    // Q21 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer übernahm Hertha BSC im November 2019 und trat nach nur 76 Tagen zurück?",
        answerA = "Pal Dardai",
        answerB = "Alexander Nouri",
        answerC = "Jürgen Klinsmann",
        answerD = "Bruno Labbadia",
        correctAnswer = 2,
        explanation = "Jürgen Klinsmann übernahm Hertha BSC im November 2019 und trat bereits im Februar 2020 nach nur 76 Tagen im Amt zurück – via Facebook-Post. Sein Abgang sorgte bundesweit für Aufsehen.",
        difficulty = 3,
        funFact = "Klinsmann veröffentlichte nach seinem Rücktritt ein internes Video, in dem er die Vereinsführung massiv kritisierte."
    ),

    // Q22 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Für wie viel Millionen Euro investierte Lars Windhorst über die Tennor Holding in die Hertha BSC GmbH & Co. KGaA?",
        answerA = "150 Millionen Euro",
        answerB = "224 Millionen Euro",
        answerC = "500 Millionen Euro",
        answerD = "374 Millionen Euro",
        correctAnswer = 3,
        explanation = "Lars Windhorst investierte insgesamt rund 374 Millionen Euro in Hertha BSC – in mehreren Tranchen zwischen 2019 und 2021. Es war eine der größten Einzelinvestitionen in einen Bundesligaverein.",
        difficulty = 3,
        funFact = "Windhorst nannte Hertha einen 'schlafenden Riesen' – die erhoffte Entwicklung zum Spitzenclub blieb jedoch aus."
    ),

    // Q23 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher Spieler war der teuerste Einkauf in der Geschichte von Hertha BSC und wie hoch war die Ablöse?",
        answerA = "Dodi Lukebakio für 20 Millionen Euro",
        answerB = "Lucas Tousart für 25 Millionen Euro",
        answerC = "Kevin-Prince Boateng für 18 Millionen Euro",
        answerD = "Krzysztof Piatek für 24 Millionen Euro",
        correctAnswer = 1,
        explanation = "Lucas Tousart wurde 2020 für 25 Millionen Euro von Olympique Lyon verpflichtet – der teuerste Einkauf der Hertha-Geschichte. Er war bereits in der Hinrunde 2019/20 ausgeliehen worden.",
        difficulty = 3,
        funFact = "Tousart wurde im Januar 2020 für die Rückrunde ausgeliehen und im Sommer 2020 fest verpflichtet – kurz nach dem Windhorst-Investment."
    ),

    // Q24 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer führte Hertha BSC in der Saison 2006/07 als Meister der 2. Bundesliga zurück in die Bundesliga?",
        answerA = "Falko Götz",
        answerB = "Huub Stevens",
        answerC = "Lucien Favre",
        answerD = "Jos Luhukay",
        correctAnswer = 0,
        explanation = "Falko Götz führte Hertha BSC in der Saison 2006/07 als Meister der 2. Bundesliga zurück in die Bundesliga.",
        difficulty = 3,
        funFact = "Falko Götz war selbst als Spieler für Hertha aktiv und kehrte später als Trainer zurück."
    ),

    // Q25 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer wurde im November 2019 von Hertha BSC entlassen und dann durch Jürgen Klinsmann ersetzt?",
        answerA = "Pal Dardai",
        answerB = "Alexander Nouri",
        answerC = "Ante Covic",
        answerD = "Bruno Labbadia",
        correctAnswer = 2,
        explanation = "Ante Covic wurde im November 2019 nach schwachen Bundesliga-Ergebnissen entlassen. Jürgen Klinsmann übernahm als sein Nachfolger – zunächst bis Saisonende.",
        difficulty = 3,
        funFact = "Covic hatte Hertha in der Hinrunde der Saison 2019/20 gut geführt, ehe eine Niederlagenserie seinen Rauswurf besiegelte."
    ),

    // Q26 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher ungarische Trainer übernahm Hertha BSC zweimal als Cheftrainer in der Bundesliga?",
        answerA = "Bernd Storck",
        answerB = "Pal Dardai",
        answerC = "Attila Sebok",
        answerD = "Sándor Egervári",
        correctAnswer = 1,
        explanation = "Pal Dardai war Cheftrainer von Hertha BSC von 2015 bis 2019 (erste Amtszeit) und übernahm erneut im April 2021 für eine zweite Amtszeit. Er ist der erfolgreichste ungarische Trainer in der Bundesliga-Geschichte.",
        difficulty = 3,
        funFact = "Dardai war vorher jahrelang Spieler und Kapitän von Hertha BSC – er kennt den Verein wie kein anderer."
    ),

    // Q27 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer übernahm Hertha BSC nach Jürgen Klinsmanns Rücktritt im Februar 2020?",
        answerA = "Alexander Nouri",
        answerB = "Ante Covic",
        answerC = "Pal Dardai",
        answerD = "Bruno Labbadia",
        correctAnswer = 3,
        explanation = "Bruno Labbadia übernahm Hertha BSC nach Klinsmanns spektakulärem Rücktritt im Februar 2020 und führte den Club zum Bundesliga-Klassenerhalt – trotz der Corona-Pause.",
        difficulty = 3,
        funFact = "Labbadia startete mit Hertha nach der Corona-Pause mit vier Siegen in Folge – in Geisterspielen ohne Zuschauer."
    ),

    // Q28 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler hält den Rekord für die meisten Bundesliga-Einsätze für Hertha BSC?",
        answerA = "Pal Dardai",
        answerB = "Andreas Thom",
        answerC = "Michael Preetz",
        answerD = "Karsten Heine",
        correctAnswer = 0,
        explanation = "Pal Dardai absolvierte die meisten Bundesliga-Spiele für Hertha BSC in der Vereinsgeschichte. Er war über mehr als eine Dekade das Herzstück des Mittelfelds.",
        difficulty = 3,
        funFact = "Dardai spielte von 1997 bis 2014 für Hertha BSC – mit einer kurzen Unterbrechung."
    ),

    // Q29 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC als Tabellenletzter direkt aus der Bundesliga ab – ein Jahr nach Champions League-Teilnahme?",
        answerA = "2009/2010",
        answerB = "2011/2012",
        answerC = "2012/2013",
        answerD = "2014/2015",
        correctAnswer = 0,
        explanation = "In der Saison 2009/10 stieg Hertha BSC als Tabellenletzter direkt aus der Bundesliga ab – nur zwei Jahre nach dem Champions League-Abenteuer. Es war einer der schmerzhaftesten Abstiege der Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Der direkte Abstieg 2010 war besonders erschütternd, da Hertha in der vorangegangenen Saison noch in der Champions League gespielt hatte."
    ),

    // Q30 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welcher Saison spielte Hertha BSC zum ersten Mal in der UEFA Champions League Gruppenphase?",
        answerA = "1997/1998",
        answerB = "1999/2000",
        answerC = "2001/2002",
        answerD = "2003/2004",
        correctAnswer = 1,
        explanation = "Hertha BSC spielte in der Saison 1999/2000 erstmals in der UEFA Champions League Gruppenphase – qualifiziert durch den dritten Platz in der Bundesliga 1998/99.",
        difficulty = 3,
        funFact = "Es war das erste Mal, dass ein Berliner Club in der modernen Champions League-Ära spielte."
    ),

    // ── REKORDE, STATISTIKEN & BESONDERHEITEN (31–40) ─────────────────────────

    // Q31 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welches war der höchste Bundesliga-Heimsieg von Hertha BSC im Olympiastadion?",
        answerA = "8:1 gegen Fortuna Düsseldorf",
        answerB = "6:0 gegen Eintracht Frankfurt",
        answerC = "5:0 gegen den 1. FC Köln",
        answerD = "7:0 gegen Arminia Bielefeld",
        correctAnswer = 3,
        explanation = "Herthas höchster Bundesliga-Heimsieg war ein 7:0 gegen Arminia Bielefeld – eine der deutlichsten Heimsiege der Vereinsgeschichte in der Bundesliga.",
        difficulty = 3,
        funFact = "Solche Ergebnisse zeigen, wie variabel Herthas Leistungen über die Jahre waren."
    ),

    // Q32 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welcher Stürmer erzielte in der Bundesliga-Saison 1998/99 die meisten Tore für Hertha BSC?",
        answerA = "Nico Patschinski",
        answerB = "Michael Preetz",
        answerC = "Marko Pantelic",
        answerD = "Alex Alves",
        correctAnswer = 1,
        explanation = "Michael Preetz war in der Erfolgsaison 1998/99 der Top-Torschütze von Hertha BSC und einer der treffsichersten Stürmer der Bundesliga. Er ist bis heute Rekordtorschütze des Vereins.",
        difficulty = 3,
        funFact = "Preetz wurde später Geschäftsführer Sport bei Hertha BSC und prägte den Verein in einer anderen Rolle weiter."
    ),

    // Q33 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer führte Hertha BSC in den Saisons 1998/99 bis 2000/01 zur Champions League?",
        answerA = "Huub Stevens",
        answerB = "Lucien Favre",
        answerC = "Hans Meyer",
        answerD = "Jürgen Röber",
        correctAnswer = 3,
        explanation = "Jürgen Röber war Trainer von Hertha BSC in der erfolgreichen Phase Ende der 1990er und Anfang der 2000er Jahre – er führte den Verein in die Champions League und zu konstant guten Bundesliga-Platzierungen.",
        difficulty = 3,
        funFact = "Röber gilt als einer der erfolgreichsten Trainer der modernen Hertha-Geschichte."
    ),

    // Q34 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie viele Punkte hatte Hertha BSC in der Saison 1998/99 – der Saison mit dem dritten Bundesligaplatz?",
        answerA = "51 Punkte",
        answerB = "55 Punkte",
        answerC = "58 Punkte",
        answerD = "63 Punkte",
        correctAnswer = 2,
        explanation = "In der Saison 1998/99 erreichte Hertha BSC 58 Punkte und belegte damit Platz 3 – nur einen Punkt hinter Bayer Leverkusen auf Platz 2. Es war eine überragende Saison.",
        difficulty = 3,
        funFact = "Bayern München gewann die Meisterschaft in dieser Saison mit 78 Punkten."
    ),

    // Q35 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Bundesliga-Zuschauerrekord gehört zu einem Hertha-Heimspiel im Olympiastadion?",
        answerA = "88.075 Zuschauer bei einem Spiel in der frühen Bundesliga-Ära",
        answerB = "Niedrigste Zuschauerzahl: nur 2.315 gegen einen Aufsteiger",
        answerC = "Meiste Zuschauer in einer kompletten Bundesliga-Saison",
        answerD = "Ausverkauftes Haus mit 74.000 beim Derby gegen Union",
        correctAnswer = 0,
        explanation = "Das Bundesliga-Rekordspiel im Olympiastadion zog 88.075 Zuschauer an – ein Bundesliga-Zuschauerrekord für ein Spiel in Berlin. Das Olympiastadion hatte damals noch keine Sitzplatzbeschränkung.",
        difficulty = 3,
        funFact = "Das Olympiastadion fasst heute bei Bundesligaspielen etwa 74.000 Zuschauer – deutlich weniger als das historische Rekordspiel."
    ),

    // Q36 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wie lange spielte Hertha BSC ununterbrochen in der Bundesliga vor dem Abstieg 2023?",
        answerA = "Seit der Saison 2013/14 – also zehn Jahre ohne Unterbrechung",
        answerB = "Seit der Saison 2015/16 – also acht Jahre ohne Unterbrechung",
        answerC = "Seit der Saison 2019/20 – also vier Jahre ohne Unterbrechung",
        answerD = "Seit der Saison 2012/13 – also elf Jahre ohne Unterbrechung",
        correctAnswer = 0,
        explanation = "Hertha BSC war von der Saison 2013/14 bis 2022/23 ununterbrochen in der Bundesliga – eine Serie von zehn Jahren, bevor der Abstieg 2023 folgte.",
        difficulty = 3,
        funFact = "In diesen zehn Jahren hatte Hertha sowohl gute Saisons (Platz 6 in 2017) als auch turbulente Jahre mit mehreren Trainerwechseln."
    ),

    // Q37 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Aufsteiger erzielte Hertha BSC in der Saison 2019/20 einen 5:1-Auswärtssieg?",
        answerA = "Fortuna Düsseldorf",
        answerB = "FC Augsburg",
        answerC = "1. FC Köln",
        answerD = "SC Paderborn 07",
        correctAnswer = 3,
        explanation = "In der Saison 2019/20 gewann Hertha BSC auswärts gegen den SC Paderborn 07 mit 5:1 – einer der höchsten Auswärtssiege in dieser Saison.",
        difficulty = 3,
        funFact = "Paderborn stieg in dieser Saison als Letzter ab – Hertha nutzte die geschwächten Gegner am Ende der Saison."
    ),

    // Q38 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "Welchen Platz belegte Hertha BSC in der Bundesliga am Ende der Saison 2017/18?",
        answerA = "Platz 8",
        answerB = "Platz 10",
        answerC = "Platz 11",
        answerD = "Platz 12",
        correctAnswer = 1,
        explanation = "In der Saison 2017/18 belegte Hertha BSC Platz 10 in der Bundesliga – ein Rückschritt nach dem starken sechsten Platz der Vorsaison.",
        difficulty = 3,
        funFact = "Die Saison 2017/18 zeigte, wie inkonstant Hertha BSC in dieser Phase war."
    ),

    // Q39 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Stürmer erzielte 2013/14 die meisten Tore – kurz bevor er zu Borussia Dortmund wechselte?",
        answerA = "Adrian Ramos",
        answerB = "Pierre-Michel Lasogga",
        answerC = "Roy Beerens",
        answerD = "Ronny",
        correctAnswer = 0,
        explanation = "Adrian Ramos war in der Saison 2013/14 der Toptorschütze von Hertha BSC mit mehreren wichtigen Bundesliga-Treffern. Er wechselte im Januar 2014 für rund 10 Millionen Euro zu Borussia Dortmund.",
        difficulty = 3,
        funFact = "Ramos erzielte seine Tore oft in entscheidenden Spielen und war für Hertha unverzichtbar."
    ),

    // Q40 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher Spieler erzielte in der Saison 2003/04 die meisten Bundesliga-Tore für Hertha BSC?",
        answerA = "Michael Preetz",
        answerB = "Alex Alves",
        answerC = "Marko Pantelic",
        answerD = "Fredi Bobic",
        correctAnswer = 2,
        explanation = "Marko Pantelic war in der Saison 2003/04 der Toptorschütze von Hertha BSC und einer der wichtigsten Offensivspieler des Vereins in den mittleren 2000er Jahren.",
        difficulty = 3,
        funFact = "Pantelic war als Stürmer bekannt für seine Kopfballstärke und sein Gespür für wichtige Tore."
    ),

    // ── BUNDESLIGA-HIGHLIGHTS, TRAINER & EPOCHEN (41–50) ──────────────────────

    // Q41 — correctAnswer = 3
    Question(
        categoryId = 13,
        questionText = "Welcher Schweizer Trainer übernahm Hertha BSC im Jahr 2007 und führte den Club zurück in die Bundesliga?",
        answerA = "Murat Yakin",
        answerB = "René Weiler",
        answerC = "Thorsten Fink",
        answerD = "Lucien Favre",
        correctAnswer = 3,
        explanation = "Lucien Favre übernahm Hertha BSC 2007 und wurde für seinen attraktiven, offensiven Fußball bekannt. Er führte Hertha von der 2. Liga zurück in die Bundesliga und stellte die Weichen für eine starke Ära.",
        difficulty = 3,
        funFact = "Lucien Favre wurde in Berlin zur Trainerpersönlichkeit – er wechselte später zu Borussia Mönchengladbach und Borussia Dortmund."
    ),

    // Q42 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher internationale Gegner traf 1999/2000 in der Champions League-Gruppenphase auf Hertha BSC und gewann in dieser Saison den UEFA-Pokal?",
        answerA = "AC Mailand",
        answerB = "FC Chelsea",
        answerC = "Galatasaray SK",
        answerD = "FC Porto",
        correctAnswer = 2,
        explanation = "In der Champions League-Gruppenphase 1999/2000 traf Hertha BSC unter anderem auf Galatasaray SK – der türkische Club gewann in dieser Saison sogar den UEFA-Pokal.",
        difficulty = 3,
        funFact = "Herthas Champions League-Teilnahme war eine Sensation für Berlin – erstmals spielte ein Berliner Club im wichtigsten europäischen Wettbewerb."
    ),

    // Q43 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welcher Saison erzielte Hertha BSC nur 23 Punkte und stieg als Tabellenletzter ab?",
        answerA = "1991/1992",
        answerB = "2009/2010",
        answerC = "2012/2013",
        answerD = "1979/1980",
        correctAnswer = 1,
        explanation = "In der Saison 2009/10 erzielte Hertha BSC nur 23 Punkte und stieg als Tabellenletzter direkt ab – eine der schwächsten Bundesliga-Saisons der Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Es war ein tiefer Fall: Nur ein Jahr zuvor hatte Hertha noch in der Champions League gespielt."
    ),

    // Q44 — correctAnswer = 1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gewann Hertha BSC ein Bundesliga-Heimspiel gegen Bayern München im Olympiastadion?",
        answerA = "2009",
        answerB = "2017",
        answerC = "2014",
        answerD = "2021",
        correctAnswer = 1,
        explanation = "Hertha BSC gewann 2017 im Olympiastadion gegen Bayern München – eines der seltenen Ereignisse in der Bundesliga, bei dem Bayern die Punkte abgeben musste.",
        difficulty = 3,
        funFact = "Siege gegen Bayern im Olympiastadion sind äußerst selten und gelten als Highlights der Hertha-Geschichte."
    ),

    // Q45 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Trainer gewann 1993 den DFB-Pokal mit Hertha BSC?",
        answerA = "Eduard Geyer",
        answerB = "Werner Fuchs",
        answerC = "Helmut Schulte",
        answerD = "Hans-Peter Briegel",
        correctAnswer = 0,
        explanation = "Eduard Geyer war Trainer von Hertha BSC, als der Verein 1993 den DFB-Pokal gewann. Er führte Hertha zu einem 1:0-Finalsieg gegen Bayer Leverkusen.",
        difficulty = 3,
        funFact = "Eduard Geyer war zuvor Trainer der DDR-Nationalmannschaft und kam nach der Wiedervereinigung in den Westen."
    ),

    // Q46 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "In welcher Saison startete Hertha BSC mit dem besten Saisonauftakt der Vereinsgeschichte – neun Siege aus zwölf Spielen?",
        answerA = "2014/2015",
        answerB = "2015/2016",
        answerC = "2016/2017",
        answerD = "2017/2018",
        correctAnswer = 2,
        explanation = "In der Saison 2016/17 startete Hertha BSC mit neun Siegen aus den ersten zwölf Bundesligaspielen – der beste Saisonstart der Vereinsgeschichte. Am Ende stand Platz 6 und die Europa League.",
        difficulty = 3,
        funFact = "Trainer Pal Dardai nutzte in dieser Saison einen kompakten Defensivblock mit schnellem Umschaltspiel – eine Spielweise, die perfekt funktionierte."
    ),

    // Q47 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Welcher erfahrene Stürmer war in der Saison 2018/19 Kapitän von Hertha BSC?",
        answerA = "Per Skjelbred",
        answerB = "Niklas Stark",
        answerC = "Vedad Ibisevic",
        answerD = "Marvin Plattenhardt",
        correctAnswer = 2,
        explanation = "Vedad Ibisevic war in der Saison 2018/19 Kapitän von Hertha BSC und einer der erfahrensten Spieler im Kader. Er führte die Mannschaft auch als Torjäger an.",
        difficulty = 3,
        funFact = "Ibisevic ist einer der besten Stürmer, die je für Hertha BSC gespielt haben – er spielte zuvor für Hoffenheim und Stuttgart."
    ),

    // Q48 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Welcher Bundesliga-Gegner besiegte Hertha BSC in der Saison 2022/23 mit 6:0?",
        answerA = "FC Bayern München",
        answerB = "Borussia Dortmund",
        answerC = "Bayer Leverkusen",
        answerD = "RB Leipzig",
        correctAnswer = 0,
        explanation = "FC Bayern München besiegte Hertha BSC in der Saison 2022/23 mit 6:0 – eine der höchsten Niederlagen von Hertha in ihrer letzten Bundesliga-Saison vor dem Abstieg.",
        difficulty = 3,
        funFact = "Herthas Defensive war in dieser Saison komplett überfordert – der Abstieg war letztlich nicht vermeidbar."
    ),

    // Q49 — correctAnswer = 2
    Question(
        categoryId = 13,
        questionText = "Wie viele Saisons spielte Hertha BSC insgesamt in der Bundesliga von 1963 bis einschließlich 2022/23?",
        answerA = "32 Saisons",
        answerB = "38 Saisons",
        answerC = "44 Saisons",
        answerD = "47 Saisons",
        correctAnswer = 2,
        explanation = "Hertha BSC spielte von 1963 bis 2023 insgesamt 44 Saisons in der Bundesliga – trotz der sieben Abstiege. Es zeigt, dass Hertha grundsätzlich zur Bundesliga gehört, auch wenn Auf- und Abstiege immer wieder vorkamen.",
        difficulty = 3,
        funFact = "Zum Vergleich: Bayern München spielte alle 60 Saisons in der Bundesliga seit deren Gründung."
    ),

    // Q50 — correctAnswer = 0
    Question(
        categoryId = 13,
        questionText = "Wer ist mit den meisten Bundesliga-Toren für Hertha BSC der vereinsinterne Torrekordhalter?",
        answerA = "Michael Preetz mit 92 Bundesliga-Toren",
        answerB = "Adrian Ramos mit 54 Bundesliga-Toren",
        answerC = "Marko Pantelic mit 48 Bundesliga-Toren",
        answerD = "Vedad Ibisevic mit 44 Bundesliga-Toren",
        correctAnswer = 0,
        explanation = "Michael Preetz ist mit 92 Bundesliga-Toren für Hertha BSC der vereinsinterne Torrekordhalter. Er war von 1995 bis 2004 für Hertha aktiv und ist bis heute eine Legende des Vereins.",
        difficulty = 3,
        funFact = "Preetz wurde später Geschäftsführer Sport bei Hertha – er ist in der Vereinsgeschichte also doppelt verewigt: als Rekordtorschütze und als Manager."
    )

)
