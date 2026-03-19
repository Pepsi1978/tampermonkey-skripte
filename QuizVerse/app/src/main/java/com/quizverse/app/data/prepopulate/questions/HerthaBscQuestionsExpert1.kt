package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsExpert1(): List<Question> = listOf(

    // ── GRÜNDUNG & FRÜHGESCHICHTE (1–8) ──────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Am welchem genauen Datum wurde Hertha BSC im Jahr 1892 gegründet?",
        answerA = "1. September 1892",
        answerB = "12. März 1892",
        answerC = "15. Oktober 1892",
        answerD = "25. Juli 1892",
        correctAnswer = 3,
        explanation = "Hertha BSC wurde am 25. Juli 1892 als Berliner Fußball Club Hertha 1892 von den Brüderpaaren Fritz und Max Lindner sowie Otto und Willi Lorenz gegründet.",
        difficulty = 4,
        funFact = "Die Namensidee kam Fritz Lindner, nachdem er kurz zuvor mit seinem Vater auf dem Ausflugsdampfer 'Hertha' auf der Havel gefahren war."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hieß der Dampfer, dessen Name als Namensgeber für Hertha BSC gilt, und in welchem Jahr wurde er gebaut?",
        answerA = "SS Hertha, gebaut 1880 in Bremen",
        answerB = "MV Hertha, gebaut 1888 in Kiel",
        answerC = "MS Hertha, gebaut 1890 in Hamburg",
        answerD = "DS Hertha, gebaut 1886 in Stettin",
        correctAnswer = 3,
        explanation = "Das Fahrgastschiff DS Hertha wurde 1886 auf der Werft Aron & Gollnow in Stettin als Dampfschiff gebaut. Es fuhr auf der Havel und inspirierte den Gründer Fritz Lindner zur Namensgebung.",
        difficulty = 4,
        funFact = "Der Schornstein des Dampfers hatte blau-weiß-gelbe Farben. Blau und Weiß wurden als Vereinsfarben übernommen, Gelb verschwand kurz nach der Gründung."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr fusionierte der BFC Hertha 92 mit dem Berliner Sport-Club (BSC) zum heutigen Hertha BSC?",
        answerA = "1923",
        answerB = "1918",
        answerC = "1920",
        answerD = "1926",
        correctAnswer = 0,
        explanation = "1923 fusionierten der BFC Hertha 92 und der Berliner Sport-Club (BSC) zum heutigen Hertha BSC. Seitdem trägt der Verein beide Kürzel im Namen.",
        difficulty = 4,
        funFact = "Der Berliner Sport-Club wurde 1892 als Cricketverein gegründet und wandte sich später dem Fußball zu."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Male in Folge erreichte Hertha BSC zwischen 1926 und 1931 das Finale der Deutschen Meisterschaft?",
        answerA = "Siebenmal",
        answerB = "Sechsmal",
        answerC = "Viermal",
        answerD = "Fünfmal",
        correctAnswer = 1,
        explanation = "Hertha BSC erreichte von 1926 bis 1931 sechsmal in Folge das Finale der Deutschen Meisterschaft – eine bis heute einzigartige Serie in der deutschen Fußballgeschichte.",
        difficulty = 4,
        funFact = "Von diesen sechs Finalteilnahmen gewann Hertha zwei (1930 und 1931). Die übrigen vier Endspiele gingen verloren."
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein gewann Hertha BSC am 22. Juni 1930 sein erstes Deutsches Meisterschafts-Finale?",
        answerA = "Holstein Kiel",
        answerB = "Hamburger SV",
        answerC = "SpVgg Fürth",
        answerD = "1. FC Nürnberg",
        correctAnswer = 0,
        explanation = "Im Finale der Deutschen Meisterschaft 1929/30 besiegte Hertha BSC Holstein Kiel mit 5:4 und gewann damit zum ersten Mal den Deutschen Meistertitel.",
        difficulty = 4,
        funFact = "Das Finaltor zum 5:4-Endstand erzielte Ruch. Es war eines der torreichsten Meisterschaftsfinale der deutschen Geschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen wen und mit welchem Ergebnis gewann Hertha BSC am 31. Mai 1931 die zweite Deutsche Meisterschaft?",
        answerA = "1:0 gegen VfB Stuttgart",
        answerB = "3:2 n.V. gegen Hamburger SV",
        answerC = "2:1 gegen SpVgg Fürth",
        answerD = "4:2 gegen Borussia Dortmund",
        correctAnswer = 1,
        explanation = "Im Finale 1930/31 schlug Hertha BSC den Hamburger SV in Leipzig mit 3:2 nach Verlängerung und verteidigte damit den Meistertitel erfolgreich.",
        difficulty = 4,
        funFact = "Im Halbfinale zuvor hatte Hertha die SpVgg Fürth mit 3:1 bezwungen. Damit war Hertha nach dem 1. FC Nürnberg erst der zweite Verein, dem die Titelverteidigung gelang."
    ),

    Question(
        categoryId = 13,
        questionText = "Wann wurde Hertha BSC als Gründungsmitglied aus der Bundesliga ausgeschlossen und in die Regionalliga zwangsversetzt?",
        answerA = "18. Mai 1965",
        answerB = "4. Juni 1967",
        answerC = "12. März 1969",
        answerD = "18. Mai 1963",
        correctAnswer = 0,
        explanation = "Am 18. Mai 1965 wurde Hertha BSC wegen unerlaubter Handgeldzahlungen und Gehaltsverstöße die Bundesliga-Lizenz entzogen. Der Verein musste in die Regionalliga Berlin absteigen.",
        difficulty = 4,
        funFact = "Hertha BSC war damit der erste Verein, dem die DFB-Lizenz für die erst 1963 gegründete Bundesliga entzogen wurde. Dieser Skandal blieb in der Vereinsgeschichte als 'Handgeld-Affäre' bekannt."
    ),

    Question(
        categoryId = 13,
        questionText = "In welcher Saison kehrte Hertha BSC nach dem Zwangsabstieg 1965 erstmals wieder in die Bundesliga zurück?",
        answerA = "1968/69",
        answerB = "1966/67",
        answerC = "1969/70",
        answerD = "1967/68",
        correctAnswer = 0,
        explanation = "Hertha BSC schaffte in der Saison 1968/69 den Wiederaufstieg in die Bundesliga und kehrte damit drei Jahre nach dem Zwangsabstieg in die höchste deutsche Spielklasse zurück.",
        difficulty = 4,
        funFact = "Nach der Rückkehr in die Bundesliga etablierte sich Hertha schnell wieder als Berlins beliebtester Verein und stellte bald neue Zuschauerrekorde auf."
    ),

    // ── ZUSCHAUERREKORDE & OLYMPIASTADION (9–14) ──────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welches ist der bis heute gültige Bundesliga-Zuschauerrekord, der am 26. September 1969 im Olympiastadion aufgestellt wurde?",
        answerA = "92.300 Zuschauer gegen Borussia Dortmund",
        answerB = "76.850 Zuschauer gegen Bayern München",
        answerC = "83.000 Zuschauer gegen Schalke 04",
        answerD = "88.075 Zuschauer gegen 1. FC Köln",
        correctAnswer = 3,
        explanation = "Am 26. September 1969 strömten offiziell 88.075 Zuschauer zum Bundesliga-Spiel Hertha BSC gegen 1. FC Köln ins Berliner Olympiastadion – bis heute der absolute Bundesliga-Zuschauerrekord.",
        difficulty = 4,
        funFact = "Inoffiziell sollen sich bis zu 120.000 Menschen im und um das Stadion befunden haben. Angesichts der heutigen Sicherheitskapazitäten wird dieser Rekord wohl nie mehr gebrochen werden."
    ),

    Question(
        categoryId = 13,
        questionText = "Für welche Olympischen Spiele wurde das Berliner Olympiastadion ursprünglich gebaut und in welchem Jahr wurde es eröffnet?",
        answerA = "Olympische Spiele 1932, Eröffnung 1930",
        answerB = "Olympische Spiele 1936, Eröffnung 1936",
        answerC = "Olympische Spiele 1940, Eröffnung 1938",
        answerD = "Olympische Spiele 1928, Eröffnung 1927",
        correctAnswer = 1,
        explanation = "Das Berliner Olympiastadion wurde für die Olympischen Sommerspiele 1936 gebaut und am 1. August 1936 zur Eröffnung der Spiele eingeweiht.",
        difficulty = 4,
        funFact = "Das heutige Olympiastadion nach dem Umbau 2000–2004 fasst 74.649 Zuschauer (alle sitzend). Die Umbaukosten betrugen rund 242 Millionen Euro."
    ),

    Question(
        categoryId = 13,
        questionText = "Seit welchem Jahr spielt Hertha BSC seine Bundesliga-Heimspiele im Olympiastadion Berlin?",
        answerA = "1963",
        answerB = "1970",
        answerC = "1945",
        answerD = "1950",
        correctAnswer = 0,
        explanation = "Seit der Gründung der Bundesliga im Jahr 1963 trägt Hertha BSC seine Heimspiele im Berliner Olympiastadion aus.",
        difficulty = 4,
        funFact = "Vor dem Umzug ins Olympiastadion spielte Hertha BSC auf verschiedenen Berliner Plätzen, unter anderem auf dem Sportplatz im Stadtteil Gesundbrunnen."
    ),

    Question(
        categoryId = 13,
        questionText = "Was war der Ursprung der blau-weißen Vereinsfarben von Hertha BSC?",
        answerA = "Die Fahne des Deutschen Fußball-Bundes",
        answerB = "Das Wappen des Stadtteils Gesundbrunnen",
        answerC = "Die Farben der Stadt Berlin",
        answerD = "Der Schornstein des Namensgeber-Dampfers Hertha",
        correctAnswer = 3,
        explanation = "Der Schornstein des Ausflugsdampfers 'Hertha' hatte die Farben Blau, Weiß und Gelb. Die Vereinsgründer übernahmen Blau und Weiß als Vereinsfarben; Gelb verschwand kurz nach der Gründung.",
        difficulty = 4,
        funFact = "2010 gründete sich die Faninitiative 'Fahne Pur', nachdem Hertha das Vereinswappen verändert hatte. Seit Mai 2014 ist die blau-weiße Fahne per Satzung als offizielles Vereinslogo verankert."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie lautet die aktuelle Kapazität des Berliner Olympiastadions nach dem Umbau zwischen 2000 und 2004?",
        answerA = "68.000 Plätze",
        answerB = "71.200 Plätze",
        answerC = "74.649 Plätze",
        answerD = "76.300 Plätze",
        correctAnswer = 2,
        explanation = "Nach dem Umbau des Berliner Olympiastadions von 2000 bis 2004 beträgt die Kapazität 74.649 Plätze – ausschließlich Sitzplätze, ohne Stehplätze.",
        difficulty = 4,
        funFact = "Das Berliner Olympiastadion ist damit das zweitgrößte Fußballstadion Deutschlands nach dem Signal Iduna Park in Dortmund (81.365 Plätze)."
    ),

    // ── REKORDSPIELER & TORSCHÜTZEN (15–21) ──────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Wie viele Bundesliga-Einsätze bestritt Pál Dárdai für Hertha BSC – ein bis heute gültiger Vereinsrekord?",
        answerA = "268 Einsätze",
        answerB = "286 Einsätze",
        answerC = "242 Einsätze",
        answerD = "301 Einsätze",
        correctAnswer = 1,
        explanation = "Pál Dárdai bestritt zwischen 1997 und 2011 insgesamt 286 Bundesliga-Spiele für Hertha BSC – Vereinsrekord. Gesamteinsätze für Hertha (alle Wettbewerbe): 372.",
        difficulty = 4,
        funFact = "Dárdai wurde später Cheftrainer von Hertha BSC (2015–2019 und 2021) und formte das Trainerteam gemeinsam mit seinem Sohn Palko Dárdai."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Spieler ist mit 84 Bundesliga-Toren Herthas Rekordtorschütze in der Bundesliga?",
        answerA = "Fredi Bobic",
        answerB = "Uwe Klimaschefski",
        answerC = "Michael Preetz",
        answerD = "Marcelinho",
        correctAnswer = 2,
        explanation = "Michael Preetz erzielte für Hertha BSC 84 Tore in der Bundesliga – Vereinsrekord. Über alle Wettbewerbe hinweg netzte er 111 Mal für die Berliner ein.",
        difficulty = 4,
        funFact = "Michael Preetz wurde nach seiner aktiven Karriere Manager von Hertha BSC und war von 2009 bis 2021 als Geschäftsführer Sport tätig."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches außergewöhnliche Torrekord stellte Hertha BSC in der Saison 1980/81 in der 2. Bundesliga auf?",
        answerA = "95 Tore in 34 Spielen",
        answerB = "108 Tore in 38 Spielen",
        answerC = "123 Tore in 42 Spielen",
        answerD = "137 Tore in 46 Spielen",
        correctAnswer = 2,
        explanation = "Hertha BSC erzielte in der Saison 1980/81 in der 2. Bundesliga 123 Saisontore in 42 Spielen – bis heute der Torrekord in der 2. Bundesliga.",
        difficulty = 4,
        funFact = "Diese Rekordsaison ist einem der offensivstärksten Kader in der Vereinsgeschichte zu verdanken. Der Rekord hat über 40 Jahre Bestand."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen DFB-Pokal-Finalist-Status erreichte Hertha BSC in den Jahren 1977 und 1979?",
        answerA = "Hertha gewann 1977, verlor 1979",
        answerB = "Hertha verlor 1977, gewann 1979",
        answerC = "Hertha gewann beide Pokal-Endspiele",
        answerD = "Hertha verlor beide Pokal-Endspiele",
        correctAnswer = 3,
        explanation = "Hertha BSC stand 1977 und 1979 im DFB-Pokalfinale, verlor jedoch beide Male. Bis heute ist Hertha BSC kein DFB-Pokalsieger.",
        difficulty = 4,
        funFact = "Das DFB-Pokalfinale 1977 verlor Hertha gegen den 1. FC Köln, das Finale 1979 gegen Fortuna Düsseldorf. Beide Niederlagen bleiben schmerzhafte Kapitel der Vereinsgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Gesamteinsätze (alle Wettbewerbe) absolvierte Pál Dárdai insgesamt für Hertha BSC?",
        answerA = "395 Einsätze",
        answerB = "372 Einsätze",
        answerC = "326 Einsätze",
        answerD = "348 Einsätze",
        correctAnswer = 1,
        explanation = "Pál Dárdai absolvierte insgesamt 372 Pflichtspiele für Hertha BSC (Bundesliga + Pokal + Europa) und ist damit der Spieler mit den meisten Gesamteinsätzen in der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Der gebürtige Ungar Dárdai ist eine lebende Legende bei Hertha BSC. Er spielte von 1997 bis 2011 aktiv und kehrte später als Trainer zurück."
    ),

    // ── TRANSFERS & FINANZEN (22–29) ──────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Wer war Herthas teuerster Einkauf in der Vereinsgeschichte und für welche Ablösesumme wurde er verpflichtet?",
        answerA = "Matheus Cunha für 15 Mio. Euro von RB Leipzig",
        answerB = "Lucas Tousart für 25 Mio. Euro von Olympique Lyon",
        answerC = "Krzysztof Piatek für 27 Mio. Euro vom AC Mailand",
        answerD = "Dedryck Boyata für 20 Mio. Euro von Celtic Glasgow",
        correctAnswer = 1,
        explanation = "Lucas Tousart wurde im Winter 2020 für 25 Millionen Euro von Olympique Lyon verpflichtet – der teuerste Transfer in der Geschichte von Hertha BSC.",
        difficulty = 4,
        funFact = "Tousart war bereits in der Hinrunde der Saison 2019/20 an Hertha ausgeliehen worden, bevor der Verein die festgelegte Kaufoption zog."
    ),

    Question(
        categoryId = 13,
        questionText = "Für welche Ablösesumme und zu welchem Verein wechselte Matheus Cunha als Herthas teuerster Abgang?",
        answerA = "30 Mio. Euro zu FC Barcelona",
        answerB = "35 Mio. Euro zu Manchester City",
        answerC = "22 Mio. Euro zu RB Leipzig",
        answerD = "26 Mio. Euro zu Atletico Madrid",
        correctAnswer = 3,
        explanation = "Matheus Cunha wechselte im August 2021 für rund 26 Millionen Euro von Hertha BSC zu Atlético Madrid – der teuerste Abgang in der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Cunha war im Januar 2020 für ca. 15 Millionen Euro von RB Leipzig zu Hertha gekommen. Mit dem Verkauf machte Hertha einen Gewinn von rund 11 Millionen Euro."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viel Geld investierte Lars Windhorst insgesamt in Hertha BSC, und welcher Anteil der KGaA gehörte ihm zuletzt?",
        answerA = "300 Mio. Euro für 52,3 % der Anteile",
        answerB = "250 Mio. Euro für 49,9 % der Anteile",
        answerC = "374 Mio. Euro für 64,7 % der Anteile",
        answerD = "450 Mio. Euro für 78,8 % der Anteile",
        correctAnswer = 2,
        explanation = "Lars Windhorst investierte in mehreren Tranchen insgesamt 374 Millionen Euro in die Hertha BSC GmbH & Co. KGaA und hielt zuletzt 64,7 % der Anteile – der größte Einzelinvestition in der Bundesliga-Geschichte.",
        difficulty = 4,
        funFact = "Windhorst bezeichnete Hertha mehrfach als 'schlafenden Riesen'. Das Projekt endete 2023 jedoch mit Windhorsts Ausstieg und der Übernahme durch 777 Partners."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Verlust machte Hertha BSC in seiner letzten Bundesliga-Abstiegssaison 2022/23?",
        answerA = "47,3 Mio. Euro",
        answerB = "63,8 Mio. Euro",
        answerC = "99,1 Mio. Euro",
        answerD = "128,5 Mio. Euro",
        correctAnswer = 2,
        explanation = "In der Abstiegssaison 2022/23 machte Hertha BSC einen Verlust von 99,1 Millionen Euro – eine existenzbedrohende Summe, die die Lizenzierung für die Folgesaison gefährdete.",
        difficulty = 4,
        funFact = "Zum Vergleich erwartete die Vereinsführung für die Folgesaison (2. Bundesliga) Verluste von 'nur' noch rund 30 Millionen Euro durch Sparmaßnahmen wie Spielerverkäufe und reduzierte Stadionmiete."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches US-amerikanische Investmentunternehmen übernahm im März 2023 die Anteile von Lars Windhorst an Hertha BSC?",
        answerA = "KKR & Co.",
        answerB = "Blackstone Group",
        answerC = "Silver Lake Partners",
        answerD = "777 Partners",
        correctAnswer = 3,
        explanation = "Die US-amerikanische Investmentfirma 777 Partners übernahm im März 2023 die Anteile von Lars Windhorst und investierte dabei rund 100 Millionen Euro, womit sie 78,8 % der Hertha-KGaA-Anteile hielt.",
        difficulty = 4,
        funFact = "777 Partners hält auch Anteile an anderen europäischen Fußballvereinen wie Genoa, Standard Lüttich und Sevilla FC, was Bedenken bezüglich Multi-Club-Ownership auslöste."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Wintertransferfenster brach Hertha BSC den Bundesliga-Rekord für die teuersten Wintertransfers und welche vier Spieler wurden verpflichtet?",
        answerA = "Winter 2019/20: Tousart, Cunha, Piatek, Ascacibar",
        answerB = "Winter 2020/21: Boyata, Alderete, Zeefuik, Mittelstädt",
        answerC = "Winter 2018/19: Lukébakio, Duda, Köpke, Darida",
        answerD = "Winter 2021/22: Kanga, Boyata, Serdar, Guendouzi",
        correctAnswer = 0,
        explanation = "Im Wintertransferfenster 2019/20 verpflichtete Hertha BSC unter Trainer Jürgen Klinsmann Lucas Tousart, Matheus Cunha, Krzysztof Piątek und Santiago Ascacibar für zusammen rund 78 Millionen Euro und stellte damit einen neuen Bundesliga-Rekord für Winterinvestitionen auf.",
        difficulty = 4,
        funFact = "Trotz dieser massiven Investitionen blieb Hertha sportlich hinter den Erwartungen zurück. Klinsmann trat noch im Februar 2020 zurück – nach nur neun Bundesliga-Spielen."
    ),

    Question(
        categoryId = 13,
        questionText = "Von welchem Verein wechselte Krzysztof Piatek im Januar 2020 zu Hertha BSC und für welche Ablösesumme?",
        answerA = "Inter Mailand für 22 Mio. Euro",
        answerB = "AS Roma für 24 Mio. Euro",
        answerC = "Juventus Turin für 18 Mio. Euro",
        answerD = "AC Mailand für 27 Mio. Euro",
        correctAnswer = 3,
        explanation = "Krzysztof Piątek wechselte im Januar 2020 für rund 27 Millionen Euro vom AC Mailand zu Hertha BSC und war damit der zweitteuerste Einkauf des Berliner Clubs.",
        difficulty = 4,
        funFact = "Piątek hatte sich beim FC Genua in der Serie A als Torjäger einen Namen gemacht und war dann für einen Rekordtransfer zum AC Mailand gewechselt – bevor er zu Hertha kam."
    ),

    // ── TRAINER-GESCHICHTE (30–36) ────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Wie viele Bundesliga-Spiele betreute Jürgen Röber als erfolgreichster Hertha-Trainer der jüngeren Geschichte (1997–2002) und welchen Punkteschnitt erzielte er?",
        answerA = "143 Spiele, 1,48 Punkte/Spiel",
        answerB = "131 Spiele, 1,42 Punkte/Spiel",
        answerC = "168 Spiele, 1,61 Punkte/Spiel",
        answerD = "157 Spiele, 1,55 Punkte/Spiel",
        correctAnswer = 3,
        explanation = "Jürgen Röber coachte Hertha BSC von Juli 1997 bis Februar 2002 in 157 Bundesliga-Spielen – die längste ununterbrochene Amtszeit eines Hertha-Trainers seit 1997. Er erzielte dabei einen Schnitt von 1,55 Punkten pro Spiel.",
        difficulty = 4,
        funFact = "Unter Röber erreichte Hertha BSC dreimal die Champions-League-Qualifikation und spielte in der Saison 1999/2000 erstmals in der Champions-League-Gruppenphase."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Bundesliga-Spiele bestritt Jürgen Klinsmann als Hertha-Trainer, bevor er im Februar 2020 zurücktrat?",
        answerA = "14 Spiele",
        answerB = "5 Spiele",
        answerC = "9 Spiele",
        answerD = "18 Spiele",
        correctAnswer = 2,
        explanation = "Jürgen Klinsmann übernahm Hertha BSC im November 2019 und trat bereits im Februar 2020 nach nur 9 Bundesliga-Spielen zurück – eine der kürzesten Trainer-Amtszeiten der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Klinsmanns Rücktritt erfolgte überraschend per Facebook-Post. Er begründete ihn damit, dass ihm die notwendige Unterstützung seitens der Vereinsführung fehlte."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer übernahm nach Klinsmanns Rücktritt im Februar 2020 als Interimstrainer und für wie viele Spiele?",
        answerA = "Bruno Labbadia für 2 Spiele",
        answerB = "Ante Covic für 3 Spiele",
        answerC = "Pal Dardai für 5 Spiele",
        answerD = "Alexander Nouri für 4 Spiele",
        correctAnswer = 3,
        explanation = "Alexander Nouri übernahm nach Klinsmanns Rücktritt als Interimslösung und betreute Hertha in 4 Bundesliga-Spielen, bevor Bruno Labbadia als neuer Cheftrainer kam.",
        difficulty = 4,
        funFact = "Labbadia stabilisierte Hertha und hielt den Verein in der Saison 2019/20 sicher in der Bundesliga. Sein Vertrag wurde jedoch nach der Saison nicht verlängert."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer rettete Hertha BSC in der Saison 2021/22 in nur neun Bundesliga-Spielen vor dem Abstieg?",
        answerA = "Tayfun Korkut",
        answerB = "Mark Fotheringham",
        answerC = "Felix Magath",
        answerD = "Sandro Schwarz",
        correctAnswer = 2,
        explanation = "Felix Magath übernahm Hertha BSC im März 2022 und rettete den Verein in nur neun Bundesliga-Spielen vor dem Abstieg mit einem Punkteschnitt von 1,11 Punkten pro Spiel.",
        difficulty = 4,
        funFact = "Magath griff zu drastischen Maßnahmen – er verhängte ein Trainingsverbot für mehrere Spieler und baute auf Spieler aus der U23. Trotz des Klassenhalts blieb seine Amtszeit auf die Rettungsmission beschränkt."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchen beiden Amtszeiten war Pál Dárdai als Cheftrainer von Hertha BSC tätig?",
        answerA = "2014–2018 und 2020–2022",
        answerB = "2016–2019 und 2022–2023",
        answerC = "2013–2017 und 2019–2020",
        answerD = "2015–2019 und Januar 2021–November 2021",
        correctAnswer = 3,
        explanation = "Pál Dárdai war von Februar 2015 bis Juni 2019 und erneut von Januar 2021 bis November 2021 Cheftrainer von Hertha BSC und betreute in beiden Amtszeiten zusammen 179 Bundesliga-Spiele.",
        difficulty = 4,
        funFact = "Dárdai übernahm 2015 das Amt sehr kurzfristig nach der Entlassung von Jos Luhukay und führte Hertha unmittelbar vor dem drohenden Abstieg zum Klassenerhalt."
    ),

    // ── EUROPACUP-HISTORY (37–41) ─────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Bis in welche Runde kam Hertha BSC im UEFA-Pokal 1978/79 – dem bislang größten Europacup-Erfolg des Vereins?",
        answerA = "Achtelfinale",
        answerB = "Finale",
        answerC = "Viertelfinale",
        answerD = "Halbfinale",
        correctAnswer = 3,
        explanation = "Hertha BSC erreichte im UEFA-Pokal 1978/79 das Halbfinale – der bislang größte Europacup-Erfolg. Dort scheiterte Hertha an Roter Stern Belgrad durch die Auswärtstorregel (Gesamtergebnis 2:2, Auswärtstor).",
        difficulty = 4,
        funFact = "Das Halbfinal-Rückspiel fand am 25. April 1979 im Berliner Olympiastadion statt. Hertha gewann 2:1, schied aber wegen der Auswärtstorregel aus, da das Hinspiel 0:1 verloren gegangen war."
    ),

    Question(
        categoryId = 13,
        questionText = "An welchem Gegner scheiterte Hertha BSC im UEFA-Pokal-Halbfinale 1978/79 und durch welche Regel?",
        answerA = "Dynamo Kiew durch 0:2-Niederlage im Rückspiel",
        answerB = "Juventus Turin durch das Los",
        answerC = "Borussia Mönchengladbach durch Elfmeterschießen",
        answerD = "Roter Stern Belgrad durch die Auswärtstorregel",
        correctAnswer = 3,
        explanation = "Hertha BSC scheiterte 1979 im UEFA-Pokal-Halbfinale an Roter Stern Belgrad aufgrund der Auswärtstorregel. Das Hinspiel verlor Hertha 0:1, das Rückspiel gewann man 2:1 – Gesamtergebnis 2:2, aber Belgrad hatte das Auswärtstor.",
        difficulty = 4,
        funFact = "Den UEFA-Pokal 1978/79 gewann letztlich Borussia Mönchengladbach, das im Finale Roter Stern Belgrad mit 2:1 im Gesamtergebnis bezwang."
    ),

    Question(
        categoryId = 13,
        questionText = "In welcher Champions-League-Saison spielte Hertha BSC erstmals in der Gruppenphase der Königsklasse?",
        answerA = "2001/02",
        answerB = "2003/04",
        answerC = "1997/98",
        answerD = "1999/2000",
        correctAnswer = 3,
        explanation = "Hertha BSC nahm in der Saison 1999/2000 erstmals an der Champions-League-Gruppenphase teil – ein historisches Ereignis für den Berliner Verein.",
        difficulty = 4,
        funFact = "Hertha qualifizierte sich für die Champions League durch einen dritten Platz in der Bundesliga 1998/99 unter Trainer Jürgen Röber. In der Gruppenphase spielte Hertha u.a. gegen Chelsea FC."
    ),

    Question(
        categoryId = 13,
        questionText = "Mit welchem Ergebnis verlor Herthas Amateurmannschaft das DFB-Pokalfinale 1992/93 gegen Bayer Leverkusen?",
        answerA = "0:1",
        answerB = "1:2",
        answerC = "0:3",
        answerD = "2:3 n.V.",
        correctAnswer = 0,
        explanation = "Die Amateurmannschaft von Hertha BSC erreichte 1993 das DFB-Pokalfinale und verlor dort gegen Bayer Leverkusen mit 0:1. Es bleibt ein einzigartiger Vorgang, dass eine Amateurelf ein DFB-Pokalfinale erreichte.",
        difficulty = 4,
        funFact = "Es ist bis heute das einzige Mal, dass eine Amateurmannschaft in einem deutschen Pokalfinale stand. Hertha BSC hatte damals keine erstklassige Mannschaft, da man in der 2. Bundesliga spielte."
    ),

    // ── ABSTIEG 2023 & JÜNGSTE GESCHICHTE (42–46) ────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welches Ergebnis besiegelte am 33. Spieltag der Saison 2022/23 den Abstieg von Hertha BSC aus der Bundesliga?",
        answerA = "1:3 gegen Union Berlin",
        answerB = "0:2 gegen Bayern München",
        answerC = "1:1 gegen VfL Bochum",
        answerD = "0:1 gegen Borussia Dortmund",
        correctAnswer = 2,
        explanation = "Ein 1:1-Unentschieden gegen den VfL Bochum am 33. Spieltag der Saison 2022/23 besiegelte den Abstieg von Hertha BSC aus der Bundesliga in die 2. Bundesliga.",
        difficulty = 4,
        funFact = "Es war der erste direkte Abstieg Herthas seit vielen Jahren – der Verein war zuvor zweimal in der Relegation angetreten und hatte sich gerettet."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hoch war Herthas kumulierter Bundesliga-Schuldenberg rund um den Abstieg 2023 laut Medienberichten?",
        answerA = "ca. 150 Mio. Euro",
        answerB = "ca. 215 Mio. Euro",
        answerC = "ca. 380 Mio. Euro",
        answerD = "ca. 500 Mio. Euro",
        correctAnswer = 2,
        explanation = "Rund um den Abstieg 2023 berichteten Medien von einem Gesamtschuldenberg Herthas von rund 380 Millionen Euro, der sich durch die massiven Investitionen der Windhorst-Ära angehäuft hatte.",
        difficulty = 4,
        funFact = "Dieser Schuldenberg zwang Hertha zu massiven Sparmaßnahmen: Spielerverkäufe, Gehaltskürzungen und Verhandlungen über reduzierte Stadionmiete für das Olympiastadion."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr stieg Hertha BSC zuletzt vor dem Abstieg 2023 aus der Bundesliga ab?",
        answerA = "2017",
        answerB = "2019",
        answerC = "2010",
        answerD = "2012",
        correctAnswer = 3,
        explanation = "Hertha BSC stieg zuletzt in der Saison 2011/12 aus der Bundesliga ab – mit dem direkten Wiederaufstieg in der Folgesaison.",
        difficulty = 4,
        funFact = "Hertha BSC ist bekannt für seine Auf- und Abstiege zwischen Bundesliga und 2. Bundesliga. Die Berliner wurden deshalb manchmal als 'Fahrstuhlmannschaft' bezeichnet."
    ),

    // ── VEREINSWISSEN VERTIEFT (42–50) ────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welches war die sportlich beste Bundesliga-Saison Herthas in der jüngeren Geschichte, in der die Berliner in der Champions-League-Qualifikation landeten?",
        answerA = "Saison 1996/97 mit Platz 5",
        answerB = "Saison 1998/99 mit Platz 3",
        answerC = "Saison 2000/01 mit Platz 2",
        answerD = "Saison 2016/17 mit Platz 6",
        correctAnswer = 1,
        explanation = "In der Saison 1998/99 belegte Hertha BSC unter Trainer Jürgen Röber Platz 3 der Bundesliga und qualifizierte sich damit erstmals für die Champions-League-Gruppenphase der Folgesaison.",
        difficulty = 4,
        funFact = "Platz 3 in der Bundesliga bleibt bis heute Herthas beste Platzierung in der Bundesliga-Geschichte der Nachkriegszeit."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie lautet der offizielle Spitzname der Hertha-BSC-Fangemeinde für ihren Verein, der auch in der Vereinshymne vorkommt?",
        answerA = "Die Hauptstädter",
        answerB = "Die Alte Dame",
        answerC = "Die Blauen",
        answerD = "Der Berliner Riese",
        correctAnswer = 1,
        explanation = "Hertha BSC wird liebevoll 'Die Alte Dame' genannt – ein Spitzname, der sich auf das hohe Alter des 1892 gegründeten Vereins bezieht und von den Fans stolz getragen wird.",
        difficulty = 4,
        funFact = "Der Beiname 'Alte Dame' soll auf ein angebliches Zitat des deutschen Kaisers zurückgehen, der den Berliner Verein nach einem Spiel so tituliert haben soll. Historisch belegt ist das jedoch nicht."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Besonderheit hatte Herthas Saison 2016/17 in der Bundesliga hinsichtlich des Saisonstarts?",
        answerA = "Hertha verlor die ersten fünf Spiele in Folge",
        answerB = "Hertha hatte den punktbesten Start nach 8 Spieltagen in seiner Bundesliga-Geschichte",
        answerC = "Hertha holte die meisten Auswärtspunkte in einem Saisondrittel",
        answerD = "Hertha hatte die meisten Zu-Null-Spiele zum Saisonbeginn",
        correctAnswer = 1,
        explanation = "In der Saison 2016/17 erlebte Hertha BSC seinen punktbesten Start in der Bundesliga-Geschichte. Nach 8 Spieltagen hatte Hertha mehr Punkte geholt als je zuvor in einem vergleichbaren Saisonabschnitt.",
        difficulty = 4,
        funFact = "Trotz des glänzenden Starts fiel Hertha in der Rückrunde zurück und beendete die Saison auf dem 6. Platz – was dennoch zur Qualifikation für den Europapokal reichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Rekord hält Hertha BSC in der Geschichte der 2. Bundesliga mit seiner Saison 1980/81?",
        answerA = "Meiste Siege in einer Saison (32 von 42 Spielen)",
        answerB = "Höchste Tordifferenz einer Saison (+88 Tore)",
        answerC = "Meiste Tore in einer Saison (123 Tore in 42 Spielen)",
        answerD = "Höchste Punktzahl je eines Aufsteigers (76 Punkte)",
        correctAnswer = 2,
        explanation = "Hertha BSC hält mit 123 erzielten Toren in der Saison 1980/81 den ewigen Torrekord in der 2. Bundesliga – aufgestellt in einem Ligaformat mit 42 Spielen pro Saison.",
        difficulty = 4,
        funFact = "Dieser Rekord ist seit über 40 Jahren ungebrochen und gilt als nahezu unangreifbar, da die 2. Bundesliga heute nur noch 34 Spieltage umfasst – deutlich weniger als damals."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Mitglieder zählte Hertha BSC e.V. auf dem Höhepunkt der 'Big City Club'-Ära um 2020 – ein neuer Vereinsrekord?",
        answerA = "ca. 36.000 Mitglieder",
        answerB = "ca. 50.000 Mitglieder",
        answerC = "ca. 68.000 Mitglieder",
        answerD = "ca. 82.000 Mitglieder",
        correctAnswer = 1,
        explanation = "Rund um die 'Big City Club'-Ära mit den massiven Investitionen von Lars Windhorst stieg die Mitgliederzahl von Hertha BSC e.V. auf rund 50.000 an – ein Rekord für den Verein.",
        difficulty = 4,
        funFact = "Das Motto 'Big City Club' wurde von Windhorst geprägt und sollte Herthas Ambitionen signalisieren, Berlin als Fußballmetropole auf die internationale Landkarte zu setzen."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches Bundesliga-Spiel Herthas gilt als das mit der höchsten Kulisse eines Heimspiels im Olympiastadion in der modernen Ära (nach 2004)?",
        answerA = "Hertha BSC – Bayern München mit 74.649 Zuschauern",
        answerB = "Hertha BSC – Borussia Dortmund mit 74.667 Zuschauern",
        answerC = "Hertha BSC – Schalke 04 mit 72.810 Zuschauern",
        answerD = "Hertha BSC – Union Berlin mit 74.302 Zuschauern",
        correctAnswer = 0,
        explanation = "Das Bundesliga-Spiel Hertha BSC gegen Bayern München zog in der modernen Ära nach dem Umbau 2004 mit 74.649 Zuschauern die volle Kapazität des Olympiastadions aus – eine ausverkaufte Rekordkulisse.",
        difficulty = 4,
        funFact = "Die Rivalität zwischen Hertha BSC und Bayern München zieht regelmäßig die größten Zuschauermengen ins Berliner Olympiastadion."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche wichtige Funktion hatte die Faninitiative 'Fahne Pur' und was erreichte sie 2014?",
        answerA = "Sie setzte die Rückkehr der Stehplatzkurve durch",
        answerB = "Sie verankerte die blau-weiße Fahne per Satzung als offizielles Vereinslogo",
        answerC = "Sie erkämpfte günstigere Ticket-Preise für Dauerkarteninhaber",
        answerD = "Sie verhinderte den Verkauf von Vereinsanteilen an ausländische Investoren",
        correctAnswer = 1,
        explanation = "Die Faninitiative 'Fahne Pur' gründete sich 2010 als Reaktion auf eine Wappenänderung durch den Verein. Im Mai 2014 wurde ihr Ziel erreicht: Die schlichte blau-weiße Fahne wurde per Vereinssatzung als offizielles Logo verankert.",
        difficulty = 4,
        funFact = "Die Fanszene von Hertha ist für ihren Traditionsbewusstsein bekannt. Die Aktion 'Fahne Pur' gilt als eines der erfolgreichsten Fanproteste in der deutschen Fußballgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Unter welchem Spitznamen war der brasilianische Mittelfeldspieler Marcelo Bordon bekannt, der Hertha BSC Mitte der 2000er Jahre prägte?",
        answerA = "Der Zauberer",
        answerB = "Marcelinho",
        answerC = "El Mago",
        answerD = "Der Samba-König",
        correctAnswer = 1,
        explanation = "Marcelo Aparecido de Oliveira war als 'Marcelinho' bekannt und spielte von 2000 bis 2006 für Hertha BSC. Er galt als einer der kreativsten Spieler seiner Generation in der Bundesliga.",
        difficulty = 4,
        funFact = "Marcelinho war für seine unberechenbaren Freistöße und sein Dribbling berüchtigt. Er wurde dreimal zur 'Mannschaft des Jahres' gewählt und war eine der großen Identifikationsfiguren der Hertha-Fans."
    ),

    Question(
        categoryId = 13,
        questionText = "Mit welchem Verein stieg Hertha BSC in der Saison 2022/23 direkt aus der Bundesliga ab, obwohl man am letzten Spieltag noch hatte gerettet werden können?",
        answerA = "Hertha stieg als Tabellenletzter mit Schalke 04 und dem VfB Stuttgart ab",
        answerB = "Hertha stieg als 16. mit VfL Bochum und Schalke 04 direkt ab",
        answerC = "Hertha stieg als 17. direkt ab; Schalke 04 und Bochum stiegen ebenfalls ab",
        answerD = "Hertha stieg nach der Relegation gegen den Hamburger SV ab",
        correctAnswer = 2,
        explanation = "In der Saison 2022/23 stieg Hertha BSC als 17. Platz direkt ab. Schalke 04 (letzter Platz) und VfL Bochum (16.) stiegen ebenfalls ab.",
        difficulty = 4,
        funFact = "Hertha BSC hatte zum letzten Spieltag theoretisch noch die Möglichkeit, die Relegation zu erreichen – scheiterte aber mit einem 1:1 gegen Bochum bereits am vorletzten Spieltag endgültig."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches war das teuerste Hertha-Trikot-Sponsoring in der Vereinsgeschichte und von welcher Firma?",
        answerA = "Hauptsponsor Tui, bis zu 8 Mio. Euro pro Saison",
        answerB = "Hauptsponsor Deutsche Bahn, bis zu 10 Mio. Euro pro Saison",
        answerC = "Hauptsponsor Nike als Ausrüster, 12 Mio. Euro pro Saison",
        answerD = "Hauptsponsor Adidas als Ausrüster, 15 Mio. Euro pro Saison",
        correctAnswer = 0,
        explanation = "Das Reiseunternehmen TUI war eines der langjährigen und bedeutendsten Hauptsponsoren von Hertha BSC und zahlte bis zu 8 Millionen Euro pro Saison für die Trikotwerbung.",
        difficulty = 4,
        funFact = "Hertha BSC wechselte im Laufe seiner Geschichte mehrere Hauptsponsoren. Das TUI-Logo auf dem Hertha-Trikot war über viele Jahre ein gewohntes Bild in der Bundesliga."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches Bundesliga-Spiel von Hertha BSC aus dem Jahr 1971 ging als 'Skandalspiel' in die Vereinsgeschichte ein?",
        answerA = "Das manipulierte 0:6-Spiel gegen Bielefeld im Bundesliga-Skandal",
        answerB = "Das 2:6-Spiel gegen Bayern München bei dem 3 Spieler des Platzes verwiesen wurden",
        answerC = "Das abgebrochene Spiel gegen den 1. FC Köln wegen Zuschauerausschreitungen",
        answerD = "Das 0:1-Spiel gegen Rot-Weiß Oberhausen, das nachträglich als Schiedsrichterfehler-Spiel bekannt wurde",
        correctAnswer = 0,
        explanation = "Im Bundesliga-Skandal 1971 wurden mehrere Spiele als manipuliert enthüllt, darunter auch Partien von Hertha BSC. Spieler kassierten Handgelder für abgesprochene Ergebnisse – ein schwerer Vertrauensschaden für den deutschen Fußball.",
        difficulty = 4,
        funFact = "Der Bundesliga-Skandal 1971 erfasste insgesamt über 50 Spieler und Offizielle aus vielen Vereinen. Er führte zu umfassenden Reformen im deutschen Profifußball."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler erzielte in der Saison 1970/71 die meisten Bundesliga-Tore für den Verein und wurde damit Herthas bester Torschütze jener Ära?",
        answerA = "Werner Kramer mit 18 Toren",
        answerB = "Erich Beer mit 21 Toren",
        answerC = "Klaus Stürmer mit 17 Toren",
        answerD = "Wolfgang Gayer mit 19 Toren",
        correctAnswer = 1,
        explanation = "Erich Beer war in der Blütezeit Herthas in den 1970er-Jahren einer der treffsichersten Stürmer und erzielte in der Saison 1970/71 21 Bundesliga-Tore für Hertha BSC.",
        difficulty = 4,
        funFact = "Erich Beer spielte von 1967 bis 1979 für Hertha BSC und wurde zum Volkshelden in Berlin. Er nahm auch an der Fußball-Weltmeisterschaft 1974 mit der deutschen Nationalmannschaft teil."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchem Deutschen Fußball-Bund-Gründungsakt wohnte Hertha BSC als Mitglied bei und in welchem Jahr fand er statt?",
        answerA = "Gründung des DFB in München, 1898",
        answerB = "Gründung des DFB in Leipzig, 1900",
        answerC = "Gründung des DFB in Hamburg, 1902",
        answerD = "Gründung des DFB in Berlin, 1905",
        correctAnswer = 1,
        explanation = "Hertha BSC war bei der Gründung des Deutschen Fußball-Bundes (DFB) am 28. Januar 1900 in Leipzig als einer der Gründungsvereine vertreten – ein Beleg für die frühe Bedeutung des Berliner Clubs.",
        difficulty = 4,
        funFact = "Beim DFB-Gründungstreffen in Leipzig nahmen 86 Vertreter von 86 Vereinen teil. Hertha BSC zählt damit zu den ältesten organisierten Fußballvereinen in Deutschland."
    )

)
