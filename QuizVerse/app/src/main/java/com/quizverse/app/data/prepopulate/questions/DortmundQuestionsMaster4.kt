package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun dortmundQuestionsMaster4(): List<Question> = listOf(

    // ── CHAMPIONS LEAGUE FINALE 1997 ─────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Mit welchem Ergebnis gewann Borussia Dortmund das Champions-League-Finale 1997 gegen Juventus Turin?",
        answerA = "2:0",
        answerB = "3:1",
        answerC = "2:1",
        answerD = "4:1",
        correctAnswer = 1,
        explanation = "Borussia Dortmund besiegte Juventus Turin am 28. Mai 1997 im Olympiastadion München mit 3:1. Karl-Heinz Riedle traf doppelt (29./34.), Lars Ricken zum 3:1 (71.). Del Piero erzielte den Ehrentreffer.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte im Champions-League-Finale 1997 den spielentscheidenden 3:1-Treffer für den BVB?",
        answerA = "Andreas Möller",
        answerB = "Paulo Sousa",
        answerC = "Lars Ricken",
        answerD = "Stéphane Chapuisat",
        correctAnswer = 2,
        explanation = "Lars Ricken erzielte mit seinem ersten Ballkontakt nach seiner Einwechslung in der 71. Minute den 3:1-Endstand – ein Lupfer aus rund 25 Metern über Juventus-Torhüter Angelo Peruzzi.",
        difficulty = 5,
        funFact = "Ricken stand nach seiner Einwechslung nur etwa 16 Sekunden auf dem Platz, als er zum Schuss ansetzt. Sein Tor wurde 2009 von den BVB-Fans zum 'Tor des Jahrhunderts' gewählt."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Karl-Heinz Riedle im Champions-League-Finale 1997 gegen Juventus?",
        answerA = "1",
        answerB = "3",
        answerC = "2",
        answerD = "0",
        correctAnswer = 2,
        explanation = "Karl-Heinz Riedle traf im Finale 1997 gleich zweimal: in der 29. Minute per flachem Schuss und in der 34. Minute per Kopfball nach einem Eckball von Andreas Möller. Er wurde zum Man of the Match gewählt.",
        difficulty = 5,
        funFact = "Riedle war eigentlich als Ergänzungsspieler eingeplant, rückte aber nach Verletzungen ins Finale und nutzte seine Chance mit einem Doppelpack."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer schoss den Ehrentreffer für Juventus Turin im Champions-League-Finale 1997?",
        answerA = "Zinédine Zidane",
        answerB = "Alessandro Del Piero",
        answerC = "Filippo Inzaghi",
        answerD = "Didier Deschamps",
        correctAnswer = 1,
        explanation = "Alessandro Del Piero erzielte den einzigen Treffer für Juventus Turin im Finale 1997 – ein Hackentrick nach einem Flankenball von Alen Bokšić. Del Piero verkürzte damit auf 2:1.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Stadt und welchem Stadion fand das Champions-League-Finale 1997 zwischen BVB und Juventus statt?",
        answerA = "Berlin, Olympiastadion",
        answerB = "München, Allianz Arena",
        answerC = "Hamburg, Volksparkstadion",
        answerD = "München, Olympiastadion",
        correctAnswer = 3,
        explanation = "Das Finale der Saison 1996/97 fand am 28. Mai 1997 im Olympiastadion in München statt. Borussia Dortmund gewann dort seinen einzigen Champions-League-Titel.",
        difficulty = 5,
        funFact = "Das Olympiastadion München war eigentlich die Heimstätte des FC Bayern – ein pikantes Detail für die BVB-Fans, die dort ihren größten Triumph feierten."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer assistierte bei Lars Rickens Tor zum 3:1 im CL-Finale 1997 mit dem entscheidenden Steilpass?",
        answerA = "Paulo Sousa",
        answerB = "Julio Cesar",
        answerC = "Stéphane Chapuisat",
        answerD = "Andreas Möller",
        correctAnswer = 3,
        explanation = "Andreas Möller spielte den präzisen Steilpass auf Lars Ricken, der den Ball beim ersten Ballkontakt per Lupfer über Torwart Angelo Peruzzi ins Netz chippte.",
        difficulty = 5
    ),

    // ── WELTPOKAL / INTERCONTINENTAL CUP 1997 ────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wen besiegte Borussia Dortmund im Intercontinental Cup 1997 (Weltpokal)?",
        answerA = "Boca Juniors (Argentinien)",
        answerB = "River Plate (Argentinien)",
        answerC = "Flamengo (Brasilien)",
        answerD = "Cruzeiro (Brasilien)",
        correctAnswer = 3,
        explanation = "Borussia Dortmund besiegte am 2. Dezember 1997 im Nationalstadion Tokio den brasilianischen Copa-Libertadores-Sieger Cruzeiro mit 2:0 und krönte sich damit zum Weltpokalsieger.",
        difficulty = 5,
        funFact = "Cruzeiro-Mittelfeldspieler Élcio wurde in der 75. Minute mit Gelb-Rot vom Platz gestellt. Andreas Möller wurde zum Man of the Match gewählt."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte die beiden Tore für Borussia Dortmund beim Weltpokal-Sieg 1997 gegen Cruzeiro?",
        answerA = "Stéphane Chapuisat und Andreas Möller",
        answerB = "Michael Zorc (Elfmeter) und Heiko Herrlich",
        answerC = "Lars Ricken und Karl-Heinz Riedle",
        answerD = "Paulo Sousa und Stefan Reuter",
        correctAnswer = 1,
        explanation = "Michael Zorc traf in der 34. Minute per Elfmeter zum 1:0, Heiko Herrlich erhöhte in der 85. Minute auf 2:0. Borussia Dortmund gewann damit den Weltpokal in Tokio.",
        difficulty = 5,
        funFact = "BVB war nur der zweite deutsche Club nach Bayern München (1976), der den Weltpokal gewann. Das Spiel fand vor 46.953 Zuschauern im Nationalstadion Tokio statt."
    ),

    // ── CHAMPIONS LEAGUE FINALE 2013 ─────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Wer erzielte den einzigen BVB-Treffer im Champions-League-Finale 2013 gegen Bayern München?",
        answerA = "Robert Lewandowski",
        answerB = "Marco Reus",
        answerC = "İlkay Gündoğan",
        answerD = "Mario Götze",
        correctAnswer = 2,
        explanation = "İlkay Gündoğan verwandelte in der 68. Minute einen Elfmeter zum zwischenzeitlichen 1:1. Hintergrund: Referee Nicola Rizzoli ahndete ein Foul an Marco Reus. Arjen Robben traf kurz vor Schluss zum 2:1-Endstand für Bayern.",
        difficulty = 5,
        funFact = "Mario Götze, der wenige Wochen zuvor seinen Wechsel zu Bayern München bekannt gegeben hatte, fehlte dem BVB verletzt – eine doppelt bittere Situation für Dortmund."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Stadion fand das Champions-League-Finale 2013 zwischen BVB und Bayern München statt?",
        answerA = "Signal Iduna Park, Dortmund",
        answerB = "Allianz Arena, München",
        answerC = "Wembley Stadium, London",
        answerD = "Camp Nou, Barcelona",
        correctAnswer = 2,
        explanation = "Das erste rein deutsche Champions-League-Finale der Geschichte fand am 25. Mai 2013 im Wembley Stadium in London vor 86.298 Zuschauern statt. Bayern München gewann 2:1.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte das entscheidende 2:1-Siegtor für Bayern München im CL-Finale 2013 gegen den BVB?",
        answerA = "Mario Mandžukić",
        answerB = "Thomas Müller",
        answerC = "Franck Ribéry",
        answerD = "Arjen Robben",
        correctAnswer = 3,
        explanation = "Arjen Robben erzielte das 2:1-Siegtor für Bayern München in der 89. Minute nach einem Rückenpass von Franck Ribéry. Es war Robbens fünfter Elfmeter-Versuch im Finale – diesmal als Flachschuss.",
        difficulty = 5,
        funFact = "Robben hatte im selben Spiel zuvor einen Elfmeter verschossen. Sein Siegtor in der 89. Minute bescherte Bayern die 'Königsklasse' auf dem eigenen Wembley-Rasen."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer traf als erster Torschütze im Champions-League-Finale 2013 zwischen Bayern und BVB?",
        answerA = "Franck Ribéry",
        answerB = "İlkay Gündoğan",
        answerC = "Arjen Robben",
        answerD = "Mario Mandžukić",
        correctAnswer = 3,
        explanation = "Mario Mandžukić erzielte in der 60. Minute das 1:0 für Bayern München nach einem Zuspiel von Franck Ribéry. Es war der erste Treffer des rein deutschen CL-Finals 2013.",
        difficulty = 5
    ),

    // ── CHAMPIONS LEAGUE FINALE 2024 ─────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Mit welchem Ergebnis verlor Borussia Dortmund das Champions-League-Finale 2024 gegen Real Madrid?",
        answerA = "1:2",
        answerB = "0:3",
        answerC = "0:2",
        answerD = "1:3",
        correctAnswer = 2,
        explanation = "Borussia Dortmund unterlag Real Madrid am 1. Juni 2024 im Wembley Stadium mit 0:2. Daniel Carvajal (74.) und Vinícius Júnior (83.) erzielten die Tore für Real Madrid.",
        difficulty = 5,
        funFact = "Es war Dortmunds drittes Champions-League-Finale – und das zweite, das im Wembley Stadium stattfand. Sowohl 2013 als auch 2024 spielte der BVB in Wembley und verlor beide Male."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Real-Madrid-Spieler erzielte das 1:0 im Champions-League-Finale 2024 gegen Borussia Dortmund?",
        answerA = "Vinícius Júnior",
        answerB = "Jude Bellingham",
        answerC = "Luka Modrić",
        answerD = "Daniel Carvajal",
        correctAnswer = 3,
        explanation = "Rechtsverteidiger Daniel Carvajal erzielte in der 74. Minute das 1:0 für Real Madrid. Vinícius Júnior erhöhte neun Minuten später auf 2:0 und sicherte Real Madrids 15. Champions-League-Titel.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Welches war Borussia Dortmunds drittes Champions-League-Finale in der Vereinsgeschichte (2024)?",
        answerA = "Viertes Finale",
        answerB = "Zweites Finale",
        answerC = "Fünftes Finale",
        answerD = "Drittes Finale",
        correctAnswer = 3,
        explanation = "Das Finale 2024 gegen Real Madrid war Borussia Dortmunds drittes Champions-League-Finale: 1997 (Sieg gegen Juventus), 2013 (Niederlage gegen Bayern) und 2024 (Niederlage gegen Real Madrid).",
        difficulty = 5
    ),

    // ── EUROPAPOKAL DER POKALSIEGER 1966 ────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Gegen wen gewann Borussia Dortmund 1966 den Europapokal der Pokalsieger?",
        answerA = "Atletico Madrid",
        answerB = "Celtic Glasgow",
        answerC = "FC Liverpool",
        answerD = "West Ham United",
        correctAnswer = 2,
        explanation = "Borussia Dortmund besiegte am 5. Mai 1966 den FC Liverpool im Finale des Europapokals der Pokalsieger mit 2:1 nach Verlängerung im Hampden Park in Glasgow.",
        difficulty = 5,
        funFact = "Der BVB wurde damit der erste deutsche Verein überhaupt, der einen europäischen Titel gewann – ein historischer Meilenstein für den deutschen Fußball."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte das Siegtor (2:1) für den BVB im Europapokal-der-Pokalsieger-Finale 1966 in der Verlängerung?",
        answerA = "Siegfried Held",
        answerB = "Franz Brungs",
        answerC = "Lothar Emmerich",
        answerD = "Reinhard Libuda",
        correctAnswer = 3,
        explanation = "Reinhard 'Stan' Libuda erzielte in der 106. Minute der Verlängerung das 2:1-Siegtor für Borussia Dortmund gegen den FC Liverpool. Das Tor wurde später als 'Wunder von Glasgow' bekannt.",
        difficulty = 5,
        funFact = "Libuda bekam seinen Spitznamen 'Stan' wegen seiner Ähnlichkeit mit dem englischen Dribbelkünstler Stanley Matthews. Sein Tor brachte dem BVB den ersten europäischen Titel für einen deutschen Club."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte das 1:0-Führungstor für den BVB im Europapokal-der-Pokalsieger-Finale 1966 gegen den FC Liverpool?",
        answerA = "Reinhard Libuda",
        answerB = "Lothar Emmerich",
        answerC = "Franz Brungs",
        answerD = "Siegfried Held",
        correctAnswer = 3,
        explanation = "Siegfried Held erzielte das frühe 1:0 für Borussia Dortmund im Finale gegen den FC Liverpool. Roger Hunt glich für Liverpool aus, ehe Libuda in der Verlängerung das entscheidende 2:1 schoss.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Zuschauer sahen das Europapokal-der-Pokalsieger-Finale 1966 zwischen BVB und Liverpool in Glasgow?",
        answerA = "etwa 65.000",
        answerB = "etwa 41.000",
        answerC = "etwa 80.000",
        answerD = "etwa 28.000",
        correctAnswer = 1,
        explanation = "41.657 Zuschauer verfolgten das Finale am 5. Mai 1966 im Hampden Park in Glasgow. Die relativ niedrige Zuschauerzahl lag auch daran, dass das Spiel unter der Woche stattfand.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Stadion fand das Europapokal-der-Pokalsieger-Finale 1966 zwischen BVB und Liverpool statt?",
        answerA = "Celtic Park, Glasgow",
        answerB = "Hampden Park, Glasgow",
        answerC = "Ibrox Stadium, Glasgow",
        answerD = "Murrayfield, Edinburgh",
        correctAnswer = 1,
        explanation = "Das Finale des Europapokals der Pokalsieger 1965/66 fand am 5. Mai 1966 im Hampden Park in Glasgow statt – dem Nationalstadion Schottlands. BVB gewann 2:1 n.V.",
        difficulty = 5,
        funFact = "Der Hampden Park war damals das größte Fußballstadion der Welt. Heute hat das Stadion eine Kapazität von ca. 51.866 Plätzen."
    ),

    // ── UEFA-CUP FINALE 1993 ─────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Gegen wen verlor Borussia Dortmund das UEFA-Cup-Finale 1993?",
        answerA = "AC Parma",
        answerB = "Ajax Amsterdam",
        answerC = "Juventus Turin",
        answerD = "Inter Mailand",
        correctAnswer = 2,
        explanation = "Borussia Dortmund verlor das UEFA-Cup-Finale 1993 gegen Juventus Turin. Juventus gewann das Finale über zwei Spiele mit einem Gesamtergebnis von 6:1 (3:1, 3:0) – bis heute das höchste Ergebnis in einem UEFA-Cup-Finale.",
        difficulty = 5,
        funFact = "Ironisch: Vier Jahre später, 1997, revanchierte sich der BVB für diese Niederlage, indem er Juventus im Champions-League-Finale besiegte."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie hoch war die Gesamtniederlage des BVB im UEFA-Cup-Finale 1993 gegen Juventus Turin?",
        answerA = "3:5 (Gesamt)",
        answerB = "1:6 (Gesamt)",
        answerC = "2:4 (Gesamt)",
        answerD = "0:3 (Gesamt)",
        correctAnswer = 1,
        explanation = "Borussia Dortmund verlor das UEFA-Cup-Finale 1993 gegen Juventus Turin mit insgesamt 1:6 – Hinspiel 1:3, Rückspiel 0:3. Es ist bis heute die höchste Niederlage in einem UEFA-Cup-/Europa-League-Finale.",
        difficulty = 5
    ),

    // ── UEFA-CUP FINALE 2002 ─────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Gegen wen verlor Borussia Dortmund das UEFA-Cup-Finale 2002?",
        answerA = "Valencia CF",
        answerB = "Galatasaray Istanbul",
        answerC = "Feyenoord Rotterdam",
        answerD = "Celtic Glasgow",
        correctAnswer = 2,
        explanation = "Borussia Dortmund verlor das UEFA-Cup-Finale 2002 gegen Feyenoord Rotterdam mit 2:3. Das Finale fand im Feijenoord-Stadion (De Kuip) in Rotterdam statt – also im Heimstadion des Gegners.",
        difficulty = 5,
        funFact = "Das Finale wurde im Heimstadion von Feyenoord gespielt, was für den BVB ein erheblicher Nachteil war. Trotz Rückstand schaffte Dortmund den zwischenzeitlichen Ausgleich, verlor aber am Ende 2:3."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Ergebnis hatte das UEFA-Cup-Finale 2002 zwischen Feyenoord und Borussia Dortmund?",
        answerA = "2:1 für Feyenoord",
        answerB = "3:2 für Feyenoord",
        answerC = "1:0 für Feyenoord",
        answerD = "4:2 für Feyenoord",
        correctAnswer = 1,
        explanation = "Feyenoord Rotterdam gewann das UEFA-Cup-Finale 2002 gegen Borussia Dortmund mit 3:2 in Rotterdam. Es war der erste europäische Triumph für einen niederländischen Club seit dem Ajax-Champions-League-Sieg 1995.",
        difficulty = 5
    ),

    // ── CHAMPIONS LEAGUE HALBFINALE 2013 (LEWANDOWSKI) ───────────────────────

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Robert Lewandowski im Champions-League-Halbfinale 2013 für den BVB gegen Real Madrid?",
        answerA = "2 Tore",
        answerB = "3 Tore",
        answerC = "5 Tore",
        answerD = "4 Tore",
        correctAnswer = 3,
        explanation = "Robert Lewandowski erzielte am 24. April 2013 im Halbfinal-Hinspiel gegen Real Madrid alle vier Tore beim 4:1-Sieg des BVB: 8., 50., 55. und 67. Minute (Elfmeter). Es war das erste Mal, dass ein Spieler vier Tore in einem CL-Halbfinale schoss.",
        difficulty = 5,
        funFact = "Lewandowskis historische Leistung wurde international als 'Masterclass' bezeichnet. Die UEFA kürte ihn zum Man of the Match. Cristiano Ronaldo schoss das einzige Real-Tor in der 43. Minute."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Ergebnis erzielte Borussia Dortmund im CL-Halbfinale 2013 gegen Real Madrid im Hinspiel?",
        answerA = "3:0",
        answerB = "2:1",
        answerC = "4:1",
        answerD = "5:2",
        correctAnswer = 2,
        explanation = "Borussia Dortmund gewann das Halbfinale der Champions League 2012/13 gegen Real Madrid im Hinspiel am 24. April 2013 mit 4:1. Alle vier Tore schoss Robert Lewandowski.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Welches Ergebnis erzielte Real Madrid im CL-Halbfinale 2013 gegen BVB im Rückspiel?",
        answerA = "2:0 für Real Madrid",
        answerB = "1:0 für Real Madrid",
        answerC = "3:1 für Real Madrid",
        answerD = "2:1 für Real Madrid",
        correctAnswer = 0,
        explanation = "Real Madrid gewann das Rückspiel am 30. April 2013 mit 2:0, schied aber durch das 1:4 aus dem Hinspiel trotzdem aus. Borussia Dortmund zog mit einem Gesamtergebnis von 4:3 ins Finale ein.",
        difficulty = 5
    ),

    // ── REKORDSPIEL: BVB 8:4 LEGIA WARSCHAU 2016 ────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welches torreichste Spiel der Champions-League-Geschichte gewann der BVB im November 2016?",
        answerA = "BVB 7:1 gegen Celtic Glasgow",
        answerB = "BVB 8:4 gegen Legia Warschau",
        answerC = "BVB 6:0 gegen Ajax Amsterdam",
        answerD = "BVB 9:2 gegen Slavia Prag",
        correctAnswer = 1,
        explanation = "Am 22. November 2016 besiegte Borussia Dortmund Legia Warschau mit 8:4 – das Spiel mit den meisten Toren in der Champions-League-Geschichte (12 Tore). Es übertraf das bisherige Rekordspiel Monaco vs. Deportivo (8:3, 2003).",
        difficulty = 5,
        funFact = "In den ersten 25 Minuten fielen bereits fünf Tore! Marco Reus und Shinji Kagawa trafen jeweils doppelt für den BVB. Das erste Gruppenspiel beider Mannschaften endete 6:0 für Dortmund."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher CL-Gruppenphase-Runde fand das Rekordspiel BVB 8:4 gegen Legia Warschau statt?",
        answerA = "2. Spieltag",
        answerB = "6. Spieltag",
        answerC = "4. Spieltag",
        answerD = "5. Spieltag",
        correctAnswer = 3,
        explanation = "Das Spiel Borussia Dortmund gegen Legia Warschau fand am 5. Spieltag der Champions-League-Gruppenphase 2016/17 statt, am 22. November 2016 im Signal Iduna Park.",
        difficulty = 5
    ),

    // ── HÖCHSTE INTERNATIONALE SIEGE ─────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Was war der höchste Champions-League-Sieg des BVB in der Neuzeit (ab 2024/25)?",
        answerA = "6:1 gegen Sporting Lissabon",
        answerB = "7:1 gegen Celtic Glasgow",
        answerC = "5:0 gegen PSG",
        answerD = "8:0 gegen PAOK Saloniki",
        correctAnswer = 1,
        explanation = "Borussia Dortmunds höchster Sieg in der Champions League ist ein 7:1 gegen Celtic Glasgow, erzielt in der Saison 2024/25. Es war der höchste CL-Sieg in der BVB-Geschichte.",
        difficulty = 5
    ),

    // ── EUROPAPOKAL-FINALE: ALLGEMEINE FRAGEN ────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "In wie vielen UEFA-Champions-League-/Europapokal-der-Landesmeister-Finales stand der BVB bisher (Stand 2024)?",
        answerA = "2 Finale",
        answerB = "4 Finale",
        answerC = "3 Finale",
        answerD = "1 Finale",
        correctAnswer = 2,
        explanation = "Borussia Dortmund stand in drei Champions-League-Finales: 1997 (Sieg gegen Juventus 3:1), 2013 (Niederlage gegen Bayern München 1:2) und 2024 (Niederlage gegen Real Madrid 0:2).",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Trainer coachte das Team im Champions-League-Finale 1997 gegen Juventus?",
        answerA = "Nevio Scala",
        answerB = "Bert van Marwijk",
        answerC = "Ottmar Hitzfeld",
        answerD = "Matthias Sammer",
        correctAnswer = 2,
        explanation = "Ottmar Hitzfeld führte Borussia Dortmund zum Champions-League-Sieg 1997 gegen Juventus Turin. Hitzfeld war zuvor auch beim VfB Stuttgart und Bayern München erfolgreich und gilt als einer der besten deutschen Trainer aller Zeiten.",
        difficulty = 5,
        funFact = "Hitzfeld gewann die Champions League sowohl mit Borussia Dortmund (1997) als auch mit Bayern München (2001) – als einer von nur wenigen Trainern, die den Titel mit zwei verschiedenen Vereinen holten."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer trainierte den BVB im Champions-League-Finale 2013 gegen Bayern München in Wembley?",
        answerA = "Thomas Tuchel",
        answerB = "Peter Bosz",
        answerC = "Jürgen Klopp",
        answerD = "Lucien Favre",
        correctAnswer = 2,
        explanation = "Jürgen Klopp trainierte Borussia Dortmund im Champions-League-Finale 2013 in Wembley gegen Bayern München. Er verlor das Finale mit 1:2 gegen seinen Landsmann Jupp Heynckes.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer trainierte Borussia Dortmund im Champions-League-Finale 2024 gegen Real Madrid?",
        answerA = "Edin Terzić",
        answerB = "Thomas Tuchel",
        answerC = "Niko Kovač",
        answerD = "Niko Schlotterbeck",
        correctAnswer = 0,
        explanation = "Edin Terzić führte Borussia Dortmund ins Champions-League-Finale 2024, das 0:2 gegen Real Madrid verloren ging. Es war Terzićs größter internationaler Erfolg als BVB-Cheftrainer.",
        difficulty = 5,
        funFact = "Edin Terzić ist eingefleischter BVB-Fan und hat als Kind Spiele des BVB im Signal Iduna Park verfolgt. Seine Trainerkarriere begann im Nachwuchs des Vereins."
    ),

    // ── SPIELER UND REKORDE ───────────────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welches Land repräsentiert Reinhard Libuda, der das Siegtor im Europapokal-Finale 1966 für den BVB schoss?",
        answerA = "Polen",
        answerB = "Deutschland",
        answerC = "Österreich",
        answerD = "Schweiz",
        correctAnswer = 1,
        explanation = "Reinhard 'Stan' Libuda war ein Deutsch-Westfale aus Gelsenkirchen. Er spielte für die deutsche Nationalmannschaft und war bekannt für sein hervorragendes Dribbling. Er erzielte das legendäre 2:1 im Finale 1966.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war im Champions-League-Finale 1997 der Torwart von Borussia Dortmund?",
        answerA = "Stefan Klos",
        answerB = "Roman Weidenfeller",
        answerC = "Lars Ricken",
        answerD = "Jens Lehmann",
        correctAnswer = 0,
        explanation = "Stefan Klos war im Champions-League-Finale 1997 der Torwart von Borussia Dortmund. Er hielt das Tor sauber bis zum Del-Piero-Treffer und trug maßgeblich zum 3:1-Sieg bei.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war Kapitän von Borussia Dortmund im Champions-League-Finale 1997 gegen Juventus?",
        answerA = "Karlheinz Riedle",
        answerB = "Michael Zorc",
        answerC = "Andreas Möller",
        answerD = "Stefan Reuter",
        correctAnswer = 2,
        explanation = "Andreas Möller war im Champions-League-Finale 1997 der Kapitän von Borussia Dortmund. Er assistierte bei Riedels zweitem Tor und spielte den entscheidenden Pass auf Lars Ricken beim 3:1.",
        difficulty = 5,
        funFact = "Möller war zuvor für Juventus Turin gespielt hatte. Das Finale 1997 war für ihn deshalb besonders emotional – er kehrte als Sieger zu seinem früheren Verein zurück."
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Besonderheit hatte Lars Rickens Tor im CL-Finale 1997 aus Sicht der Spielzeit?",
        answerA = "Er schoss das Tor als letzter Spieler im Spiel (90+5 Min.)",
        answerB = "Er traf mit seinem ersten Ballkontakt nach der Einwechslung",
        answerC = "Er traf direkt aus dem Anstoßstoß nach Juves Anschlusstor",
        answerD = "Er verwandelte einen Freistoß aus 35 Metern Entfernung",
        correctAnswer = 1,
        explanation = "Lars Ricken schoss das 3:1 buchstäblich mit seinem ersten Ballkontakt nach seiner Einwechslung – etwa 16 Sekunden nach Betreten des Rasens. Es war ein Chip aus rund 25 Metern über Keeper Angelo Peruzzi.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wie alt war Lars Ricken, als er im CL-Finale 1997 das 3:1 für den BVB erzielte?",
        answerA = "22 Jahre",
        answerB = "19 Jahre",
        answerC = "20 Jahre",
        answerD = "24 Jahre",
        correctAnswer = 2,
        explanation = "Lars Ricken war beim Champions-League-Finale am 28. Mai 1997 gerade 20 Jahre alt. Sein Tor im Finale machte ihn schlagartig zu einer der bekanntesten Figuren in der BVB-Geschichte.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Was wurde Lars Rickens Tor vom CL-Finale 1997 aus Anlass des 100-jährigen BVB-Jubiläums?",
        answerA = "Es wurde zum 'Tor der Bundesliga-Geschichte' gewählt",
        answerB = "Es wurde zum 'BVB-Tor des Jahrhunderts' gewählt",
        answerC = "Es wurde zum 'UEFA-Tor des Jahrhunderts' prämiert",
        answerD = "Es wurde vom DFB als 'schönstes Tor der Nachkriegsgeschichte' ausgezeichnet",
        correctAnswer = 1,
        explanation = "Zum 100-jährigen Vereinsjubiläum am 19. Dezember 2009 wählten die BVB-Fans Lars Rickens Tor vom Champions-League-Finale 1997 zum 'BVB-Tor des Jahrhunderts'.",
        difficulty = 5,
        funFact = "Das Tor war auch 1997 bereits 'Tor des Jahres' in Deutschland gewählt worden – ein seltener Doppelerfolg für einen einzelnen Treffer."
    ),

    // ── BVB IM EUROPÄISCHEN KONTEXT ───────────────────────────────────────────

    Question(
        categoryId = 14,
        questionText = "Welcher Spieler assistierte bei Karl-Heinz Riedels erstem Tor im CL-Finale 1997?",
        answerA = "Stéphane Chapuisat",
        answerB = "Paulo Sousa",
        answerC = "Lars Ricken",
        answerD = "Paul Lambert",
        correctAnswer = 3,
        explanation = "Der schottische Mittelfeldspieler Paul Lambert legte mit einer Flanke von rechts das 1:0 durch Karl-Heinz Riedle auf. Lambert war einer der weniger bekannten BVB-Spieler, aber unverzichtbar für den Finalsieg.",
        difficulty = 5,
        funFact = "Paul Lambert ist der einzige Schotte, der jemals die Champions League gewonnen hat. Er wechselte kurz nach dem Finale nach Schottland zu Celtic Glasgow."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Spieler stand im CL-Finale 1997 für Juventus Turin und gehörte später zu den Weltklasse-Spielern?",
        answerA = "Luca Toni",
        answerB = "Zinédine Zidane",
        answerC = "Francesco Totti",
        answerD = "Alessandro Nesta",
        correctAnswer = 1,
        explanation = "Zinédine Zidane spielte im Champions-League-Finale 1997 für Juventus Turin gegen Borussia Dortmund. Er verlor das Finale 1:3 und wechselte zwei Jahre später für damals Rekordkosten zu Real Madrid.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen internationalen Wettbewerb gewann der BVB 1966 als erster deutscher Club überhaupt?",
        answerA = "UEFA-Cup",
        answerB = "Europapokal der Landesmeister",
        answerC = "Europapokal der Pokalsieger",
        answerD = "Messestädte-Pokal",
        correctAnswer = 2,
        explanation = "Borussia Dortmund gewann 1966 den Europapokal der Pokalsieger und war damit der erste deutsche Verein, der überhaupt einen europäischen Titel holte. Der Sieg gegen den FC Liverpool in Glasgow ging als 'Wunder von Glasgow' in die Geschichte ein.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele internationale Titel hat Borussia Dortmund insgesamt gewonnen (Stand 2024)?",
        answerA = "4 Titel",
        answerB = "2 Titel",
        answerC = "5 Titel",
        answerD = "3 Titel",
        correctAnswer = 3,
        explanation = "Borussia Dortmund gewann drei internationale Titel: Europapokal der Pokalsieger 1966, UEFA Champions League 1997 und den Intercontinental Cup (Weltpokal) 1997.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Was war der Unterschied zwischen dem deutschen Weltpokal-Sieger Bayern München (1976) und dem BVB (1997)?",
        answerA = "Bayern gewann den ersten, BVB den zweiten deutschen Weltpokal-Sieg",
        answerB = "Bayern gewann in Spanien, BVB in Japan",
        answerC = "Bayern spielte gegen einen argentinischen Club, BVB gegen einen chilenischen",
        answerD = "Bayern spielte Elfmeterschießen, BVB gewann regulär",
        correctAnswer = 0,
        explanation = "Bayern München war 1976 der erste deutsche Club, der den Weltpokal (Intercontinental Cup) gewann. 21 Jahre später wurde Borussia Dortmund 1997 der zweite deutsche Club mit diesem Titel – durch einen 2:0-Sieg gegen Cruzeiro in Tokio.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Mit welchem Spielstand endete die reguläre Spielzeit im Europapokal-der-Pokalsieger-Finale 1966 zwischen BVB und Liverpool?",
        answerA = "1:0 für BVB",
        answerB = "0:0",
        answerC = "2:1 für BVB",
        answerD = "1:1",
        correctAnswer = 3,
        explanation = "Das Finale 1966 zwischen BVB und FC Liverpool endete nach 90 Minuten 1:1 (Held 1:0, Hunt 1:1). Erst in der Verlängerung schoss Reinhard Libuda das entscheidende 2:1 für Dortmund.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Gegner feierte der BVB seinen ersten internationalen Sieg überhaupt im Europapokal der Landesmeister 1956?",
        answerA = "Spora Luxemburg",
        answerB = "Sporting Lissabon",
        answerC = "Servette Genf",
        answerD = "Shamrock Rovers",
        correctAnswer = 0,
        explanation = "Borussia Dortmund feierte seinen ersten Auftritt im Europapokal der Landesmeister 1956/57 gegen den luxemburgischen Club Spora Luxemburg. Der BVB gewann deutlich und erzielte dabei einen historisch hohen Sieg.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Champions-League-Saison erzielte Borussia Dortmund die höchste Anzahl an Gruppenphase-Siegen hintereinander?",
        answerA = "2011/12 (Klopp-Ära, 5 Siege am Stück)",
        answerB = "2013/14 (6 Siege von 6 Spielen)",
        answerC = "2019/20 (Favre-Ära, 5 Siege am Stück)",
        answerD = "2016/17 (nach 8:4 gegen Legia)",
        correctAnswer = 1,
        explanation = "In der Champions-League-Gruppenphase 2013/14 gewann Borussia Dortmund alle sechs Gruppenspiele und war damit das einzige Team, das eine makellose Bilanz in der Gruppe erreichte.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Wer schoss für Real Madrid das entscheidende 2:0 im Champions-League-Finale 2024 gegen den BVB?",
        answerA = "Jude Bellingham",
        answerB = "Luka Modrić",
        answerC = "Rodrygo",
        answerD = "Vinícius Júnior",
        correctAnswer = 3,
        explanation = "Vinícius Júnior erzielte in der 83. Minute das 2:0 für Real Madrid im Champions-League-Finale 2024 und sicherte Real damit den 15. Titel in der Königsklasse.",
        difficulty = 5,
        funFact = "Für Borussia Dortmund war es bereits das zweite verlorene Finale im Wembley Stadium (2013 gegen Bayern München und 2024 gegen Real Madrid) – ein bitteres Schicksal in diesem Stadion."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler fehlte dem Team im Champions-League-Finale 2013 verletzt?",
        answerA = "Kevin Großkreutz",
        answerB = "Shinji Kagawa",
        answerC = "Mario Götze",
        answerD = "Jakub Blaszczykowski",
        correctAnswer = 2,
        explanation = "Mario Götze fehlte dem BVB im Champions-League-Finale 2013 wegen eines Oberschenkelproblems verletzt. Besonderes Pikanterie: Wenige Wochen zuvor hatte er seinen bald bevorstehenden Wechsel zu Bayern München bekanntgegeben.",
        difficulty = 5,
        funFact = "Götze war in der Saison 2012/13 einer der formstärksten BVB-Spieler, aber nicht nur seine Verletzung fehlte – das Bekanntwerden seines Wechsels zu Bayern beschäftigte die BVB-Fans bis ins Finale."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der beste Torschütze des BVB in der Champions-League-Saison 2012/13 (Finalsaison)?",
        answerA = "Marco Reus",
        answerB = "Robert Lewandowski",
        answerC = "İlkay Gündoğan",
        answerD = "Jakub Blaszczykowski",
        correctAnswer = 1,
        explanation = "Robert Lewandowski war in der CL-Saison 2012/13 der überragende BVB-Torschütze. Sein Höhepunkt war der Vierfach-Treffer im Halbfinale gegen Real Madrid (4:1). Insgesamt erzielte er in diesem Wettbewerb 10 Tore.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "Welche Nationalität hatte der Torwart Angelo Peruzzi, über den Lars Ricken im CL-Finale 1997 sein legendäres Tor lupfte?",
        answerA = "Spanisch",
        answerB = "Argentinisch",
        answerC = "Brasilianisch",
        answerD = "Italienisch",
        correctAnswer = 3,
        explanation = "Angelo Peruzzi war der italienische Stammtorhüter von Juventus Turin im Champions-League-Finale 1997. Er stand beim Ricken-Tor zu weit vor seinem Kasten, was der 20-jährige Einwechselspieler gnadenlos mit dem Chip bestrafte.",
        difficulty = 5
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr gewann Borussia Dortmund den Intercontinental Cup (Weltpokal)?",
        answerA = "1998",
        answerB = "1999",
        answerC = "1997",
        answerD = "2000",
        correctAnswer = 2,
        explanation = "Borussia Dortmund gewann den Intercontinental Cup (Weltpokal) am 2. Dezember 1997 in Tokio mit 2:0 gegen Cruzeiro. Damit krönte der BVB sein erfolgreichstes Jahr in der Vereinsgeschichte.",
        difficulty = 5
    )

)
