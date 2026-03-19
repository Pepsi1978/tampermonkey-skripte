package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun dortmundQuestionsExpert1(): List<Question> = listOf(

    // --- Gründung & Frühgeschichte ---

    Question(
        categoryId = 14,
        questionText = "An welchem genauen Datum wurde Borussia Dortmund gegründet?",
        answerA = "5. Mai 1909",
        answerB = "3. Oktober 1909",
        answerC = "19. Dezember 1909",
        answerD = "12. Januar 1910",
        correctAnswer = 2,
        explanation = "Der BVB wurde am 19. Dezember 1909 in Dortmund gegründet. Die Gründungsversammlung fand in der Gaststätte 'Zum Wildschütz' statt.",
        difficulty = 4,
        funFact = "Der Gründung ging ein Konflikt mit dem Ortspriester Pater Dewald voraus, der versuchte, die Versammlung zu unterbinden – die Gründer blockierten ihn erfolgreich."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Gaststätte fand die Gründungsversammlung des BVB am 19. Dezember 1909 statt?",
        answerA = "Zum Goldenen Anker",
        answerB = "Zum Wildschütz",
        answerC = "Zum Schwarzen Adler",
        answerD = "Zur Deutschen Eiche",
        correctAnswer = 1,
        explanation = "Die Gründungsversammlung des Ballspielvereins Borussia 09 fand in der Gaststätte 'Zum Wildschütz' in Dortmund statt.",
        difficulty = 4,
        funFact = "Die Gründer waren überwiegend Jugendliche einer katholischen Kirchengemeinde, die sich vom strengen Priester Pater Dewald losgesagt hatten."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welcher Brauerei leitete der BVB seinen Namen 'Borussia' (lateinisch für Preußen) tatsächlich ab?",
        answerA = "Borussia-Brauerei Dortmund",
        answerB = "Kronen-Brauerei",
        answerC = "Dortmunder Union-Brauerei",
        answerD = "Ritter-Brauerei",
        correctAnswer = 0,
        explanation = "Der Name 'Borussia' wurde von der nahegelegenen Borussia-Brauerei in Dortmund übernommen, obwohl er lateinisch für Preußen steht.",
        difficulty = 4,
        funFact = "Die Verbindung zum Bier war von Anfang an präsent – die Brauerei befand sich unweit des Gründungsortes."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr trugen die BVB-Spieler zum ersten Mal ihre bis heute bekannten schwarz-gelben Streifen?",
        answerA = "1909",
        answerB = "1920",
        answerC = "1913",
        answerD = "1925",
        correctAnswer = 2,
        explanation = "Erst 1913 – vier Jahre nach der Gründung – trugen die Dortmunder Spieler erstmals die charakteristischen schwarz-gelben Streifen.",
        difficulty = 4,
        funFact = "Davor spielte der BVB in blauen und weißen Farben, ähnlich wie viele andere westfälische Vereine dieser Zeit."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer war der erste Vereinspräsident in der Geschichte von Borussia Dortmund?",
        answerA = "Franz Jacobi",
        answerB = "Hans Kahn",
        answerC = "Fritz Schulte",
        answerD = "Paul Braun",
        correctAnswer = 0,
        explanation = "Franz Jacobi war der erste Vereinspräsident des neu gegründeten Ballspielvereins Borussia 09 e.V. Dortmund.",
        difficulty = 4,
        funFact = "Sein jüngerer Bruder Julius Jacobi war ebenfalls Gründungsmitglied und kehrte – wie neun weitere der 18 Gründer – nicht aus dem Ersten Weltkrieg zurück."
    ),

    // --- Deutsche Meisterschaften Vor-Bundesliga-Ära ---

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr gewann der BVB seine erste deutsche Meisterschaft?",
        answerA = "1963",
        answerB = "1956",
        answerC = "1949",
        answerD = "1951",
        correctAnswer = 1,
        explanation = "Der BVB gewann 1956 seine erste Deutsche Meisterschaft – als Höhepunkt einer goldenen Ära vor der Bundesliga-Einführung.",
        difficulty = 4,
        funFact = "Dem ersten Titel 1956 folgte 1957 sofort der zweite – ein Doppelpack, der erst Jahrzehnte später von Klopps Team wiederholt werden sollte."
    ),

    Question(
        categoryId = 14,
        questionText = "Mit welchem Ergebnis gewann der BVB die Deutsche Meisterschaft 1963 – den letzten Titel vor der Bundesliga-Ära?",
        answerA = "2:0 gegen Hamburger SV",
        answerB = "1:0 gegen FC Schalke 04",
        answerC = "3:1 gegen 1. FC Köln",
        answerD = "4:2 gegen Eintracht Frankfurt",
        correctAnswer = 2,
        explanation = "In der Meisterschaftsendrunde 1963 besiegte Borussia Dortmund den 1. FC Köln mit 3:1 und sicherte sich damit den dritten und letzten Titel vor Gründung der Bundesliga.",
        difficulty = 4,
        funFact = "Kurz darauf wurde zur Saison 1963/64 die Fußball-Bundesliga gegründet – die drei Meisterschaften zuvor wurden in der Deutschen Fußball-Meisterschaft ausgetragen."
    ),

    // --- Europapokal der Pokalsieger 1966 ---

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein gewann der BVB im Finale 1966 den Europapokal der Pokalsieger?",
        answerA = "FC Liverpool",
        answerB = "West Ham United",
        answerC = "Celtic Glasgow",
        answerD = "Ajax Amsterdam",
        correctAnswer = 0,
        explanation = "Im Finale am 5. Mai 1966 in Glasgow besiegte der BVB den FC Liverpool 2:1 nach Verlängerung und wurde damit der erste deutsche Europapokalsieger überhaupt.",
        difficulty = 4,
        funFact = "Das Finale fand im Hampden Park in Glasgow statt – daher wird dieser Triumph auch als 'Das Wunder von Glasgow' bezeichnet."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler war mit 14 Toren Torschützenkönig des Europapokals der Pokalsieger 1965/66 – ein bis heute unerreichter Rekord?",
        answerA = "Lothar Emmerich",
        answerB = "Alfred Preißler",
        answerC = "Sigfried Held",
        answerD = "Franz Brungs",
        correctAnswer = 0,
        explanation = "Lothar Emmerich schoss in der Saison 1965/66 unglaubliche 14 Tore im Europapokal der Pokalsieger – ein Rekord, der in diesem Wettbewerb nie übertroffen wurde.",
        difficulty = 4,
        funFact = "Emmerich galt als einer der schnellsten und treffsichersten Stürmer seiner Generation und war maßgeblich verantwortlich für den historischen Titel."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Titelverteidiger besiegte der BVB im Halbfinale des Europapokals der Pokalsieger 1965/66?",
        answerA = "FC Barcelona",
        answerB = "West Ham United",
        answerC = "Sporting Lissabon",
        answerD = "Atlético Madrid",
        correctAnswer = 1,
        explanation = "Im Halbfinale eliminierte der BVB West Ham United, den amtierenden Pokalsieger-Gewinner von 1965. Zuvor hatten die Dortmunder auch Atlético Madrid bezwungen.",
        difficulty = 4,
        funFact = "Der BVB besiegte im Turnierverlauf mit CSKA Sofia, Atlético Madrid und West Ham United drei international renommierte Gegner."
    ),

    // --- Bundesliga-Meisterschaften 1995 & 1996 ---

    Question(
        categoryId = 14,
        questionText = "Unter welchem Trainer gewann der BVB seine Bundesliga-Meisterschaften 1995 und 1996?",
        answerA = "Nevio Scala",
        answerB = "Bernd Krauss",
        answerC = "Matthias Sammer",
        answerD = "Ottmar Hitzfeld",
        correctAnswer = 3,
        explanation = "Ottmar Hitzfeld führte den BVB zu den Bundesliga-Meisterschaften 1994/95 und 1995/96 – zwei aufeinanderfolgende Titel, die den Verein wieder in die Weltklasse führten.",
        difficulty = 4,
        funFact = "Hitzfeld coachte den BVB von 1991 bis 1997 und bestritt insgesamt 273 Spiele als Trainer – mit 149 Siegen eine beeindruckende Bilanz."
    ),

    Question(
        categoryId = 14,
        questionText = "Matthias Sammer wurde 1996 zum Europäischen Fußballer des Jahres gewählt. Für welchen Verein spielte er zu diesem Zeitpunkt?",
        answerA = "Borussia Dortmund",
        answerB = "Inter Mailand",
        answerC = "Bayern München",
        answerD = "AC Mailand",
        correctAnswer = 0,
        explanation = "Matthias Sammer gewann 1996 den Ballon d'Or als Europäischer Fußballer des Jahres, während er bei Borussia Dortmund unter Vertrag stand und die Meisterschaft gewann.",
        difficulty = 4,
        funFact = "Sammer ist bis heute der letzte deutsche Spieler, der den Ballon d'Or gewonnen hat – eine Trophäe, die Deutschland seit 1996 nicht mehr erringen konnte."
    ),

    // --- Champions League 1997 ---

    Question(
        categoryId = 14,
        questionText = "In welcher Stadt und in welchem Stadion fand das Champions-League-Finale 1997 (BVB gegen Juventus) statt?",
        answerA = "Berlin, Olympiastadion",
        answerB = "München, Olympiastadion",
        answerC = "Madrid, Estadio Santiago Bernabéu",
        answerD = "Amsterdam, Amsterdam ArenA",
        correctAnswer = 1,
        explanation = "Das Finale der Champions League 1996/97 fand am 28. Mai 1997 im Olympiastadion München statt – ein Heimspiel-Vorteil für den deutschen Verein.",
        difficulty = 4,
        funFact = "Es war das erste und bislang einzige Champions-League-Finale, das in München ausgetragen wurde – bis zum Finale 2012 (ebenfalls in München) blieb es das einzige."
    ),

    Question(
        categoryId = 14,
        questionText = "Karl-Heinz Riedle erzielte im Champions-League-Finale 1997 zwei Tore für den BVB. In welcher Minute traf er zum 1:0?",
        answerA = "3. Minute",
        answerB = "10. Minute",
        answerC = "29. Minute",
        answerD = "45. Minute",
        correctAnswer = 0,
        explanation = "Karl-Heinz Riedle traf bereits in der 3. Minute zur 1:0-Führung mit einem Linksschuss – eingeleitet durch eine Flanke von Paul Lambert.",
        difficulty = 4,
        funFact = "Riedle erzielte im Finale zwei Tore (3. und 34. Minute) und war damit der Matchwinner des historischen Abends in München."
    ),

    Question(
        categoryId = 14,
        questionText = "Lars Ricken erzielte im Champions-League-Finale 1997 das 3:1 gegen Juventus. Wie viele Sekunden nach seiner Einwechslung traf er?",
        answerA = "8 Sekunden",
        answerB = "32 Sekunden",
        answerC = "16 Sekunden",
        answerD = "45 Sekunden",
        correctAnswer = 2,
        explanation = "Lars Ricken kam als Einwechselspieler und traf bereits nach 16 Sekunden zum entscheidenden 3:1 – eines der schnellsten Tore nach einer Einwechslung in der CL-Geschichte.",
        difficulty = 4,
        funFact = "Ricken lobte den Ball aus rund 20 Metern über Juventus-Torwart Angelo Peruzzi hinweg ins Netz – ein technisches Meisterstück des damals 20-Jährigen."
    ),

    Question(
        categoryId = 14,
        questionText = "Wer erzielte für Juventus Turin den Ehrentreffer zum 1:3 im Champions-League-Finale 1997 gegen den BVB?",
        answerA = "Zinedine Zidane",
        answerB = "Christian Vieri",
        answerC = "Alessandro Del Piero",
        answerD = "Filippo Inzaghi",
        correctAnswer = 2,
        explanation = "Alessandro Del Piero erzielte für Juventus Turin den Anschlusstreffer zum 1:3 in der zweiten Halbzeit des Finales – es blieb beim Endstand 3:1 für den BVB.",
        difficulty = 4,
        funFact = "Del Piero traf per Hackentor nach einer Flanke von Alen Boksic – ein eleganter Abschluss, der das Spiel kurzzeitig spannend machte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher schottische Mittelfeldspieler bereitete im CL-Finale 1997 Karl-Heinz Riedels erstes Tor mit einer präzisen Flanke vor?",
        answerA = "Ally McCoist",
        answerB = "Colin Hendry",
        answerC = "Paul Lambert",
        answerD = "Stuart McCall",
        correctAnswer = 2,
        explanation = "Paul Lambert, der schottische Mittelfeldspieler des BVB, lieferte die Flanke für Riedels Führungstreffer in der 3. Minute des Finales.",
        difficulty = 4,
        funFact = "Lambert war einer der wenigen schottischen Spieler, die einen Champions-League-Titel gewonnen haben – und er tat es mit einem deutschen Verein."
    ),

    // --- DFB-Pokal ---

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr gewann der BVB erstmals das historische Double aus Bundesliga-Meisterschaft und DFB-Pokal?",
        answerA = "1995",
        answerB = "2002",
        answerC = "2012",
        answerD = "2019",
        correctAnswer = 2,
        explanation = "In der Saison 2011/12 unter Jürgen Klopp gewann der BVB erstmals in seiner Vereinsgeschichte das Double aus Bundesliga-Meisterschaft und DFB-Pokal.",
        difficulty = 4,
        funFact = "Das Double 2012 war umso beeindruckender, da der BVB den Pokal mit einem 5:2-Finalsieg über den FC Bayern München errang – ein historischer Erfolg."
    ),

    // --- Finanzkrise 2003–2005 ---

    Question(
        categoryId = 14,
        questionText = "Wer übernahm im Jahr 2005 als Geschäftsführer den BVB und führte ihn aus der Finanzkrise?",
        answerA = "Gerd Niebaum",
        answerB = "Michael Zorc",
        answerC = "Hans-Joachim Watzke",
        answerD = "Reinhard Rauball",
        correctAnswer = 2,
        explanation = "Hans-Joachim Watzke übernahm 2005 als Geschäftsführer einen Verein mit 122 Millionen Euro Schulden und sanierte ihn innerhalb weniger Jahre erfolgreich.",
        difficulty = 4,
        funFact = "Beim Amtsantritt Watzkes gehörte sogar das Stadion nicht mehr dem BVB – es war im Rahmen eines Sale-and-leaseback-Verfahrens an einen Fonds veräußert worden."
    ),

    Question(
        categoryId = 14,
        questionText = "Was wäre laut Sanierungskonzept 2005 passiert, wenn weniger als 75 Prozent der Fondszeichner dem Plan zugestimmt hätten?",
        answerA = "Zwangsabstieg in die 2. Bundesliga",
        answerB = "Auflösung des Vereins",
        answerC = "Insolvenz und Abstieg in die Kreisliga C",
        answerD = "Übernahme durch Bayern München",
        correctAnswer = 2,
        explanation = "Hätten weniger als 75 Prozent der Fondszeichner zugestimmt, hätte Watzke am nächsten Morgen zum Amtsgericht gehen und Insolvenz anmelden müssen – was einen sofortigen Abstieg in die Kreisliga C bedeutet hätte.",
        difficulty = 4,
        funFact = "Die Insolvenz hätte den BVB um mehr als 60 Ligastufen zurückgeworfen – von der Bundesliga in die Kreisklasse."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher teure Starspieler war neben Jan Koller und Márcio Amoroso einer der Hauptgründe für die finanzielle Überdehnung des BVB um 2002/03?",
        answerA = "Christoph Metzelder",
        answerB = "Giovanni Reyna",
        answerC = "Evanilson",
        answerD = "Tomas Rosický",
        correctAnswer = 3,
        explanation = "Tomas Rosický, Jan Koller und Márcio Amoroso waren extrem teure Verpflichtungen, die sich der BVB nur leisten konnte, wenn er sich regelmäßig für die Champions League qualifizierte.",
        difficulty = 4,
        funFact = "Als der BVB im August 2003 in der Champions-League-Qualifikation am FC Brügge scheiterte, brach das gesamte Finanzmodell zusammen."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr ging Borussia Dortmund als erstes deutsches Fußballunternehmen an die Börse?",
        answerA = "1998",
        answerB = "2000",
        answerC = "2002",
        answerD = "2004",
        correctAnswer = 1,
        explanation = "Am 31. Oktober 2000 wurde der BVB als erstes deutsches Fußballunternehmen an der Frankfurter Wertpapierbörse notiert – ein wegweisender Schritt in der Vereinsgeschichte.",
        difficulty = 4,
        funFact = "Der Ausgabepreis der BVB-Aktie betrug beim Börsengang 11 Euro. Auf dem Tiefpunkt der Finanzkrise fiel der Kurs auf unter 1 Euro."
    ),

    // --- Klopp-Ära 2008–2015 ---

    Question(
        categoryId = 14,
        questionText = "In welcher Saison gewann der BVB unter Jürgen Klopp die erste Bundesliga-Meisterschaft der Klopp-Ära?",
        answerA = "2009/10",
        answerB = "2012/13",
        answerC = "2010/11",
        answerD = "2011/12",
        correctAnswer = 2,
        explanation = "In der Saison 2010/11 führte Jürgen Klopp eine junge, dynamische Mannschaft sensationell zur Bundesliga-Meisterschaft – dem ersten Titel seit 2002.",
        difficulty = 4,
        funFact = "Klopp hatte den BVB 2008 von Tabelle übernommen und ihn in nur drei Jahren zum Meister geformt – eine der beeindruckendsten Aufbauarbeiten im deutschen Fußball."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr verlor der BVB unter Klopp das Champions-League-Finale gegen Bayern München – und wie endete das Spiel?",
        answerA = "2012, 1:2",
        answerB = "2014, 0:2",
        answerC = "2013, 2:3 nach Verlängerung",
        answerD = "2013, 1:2",
        correctAnswer = 3,
        explanation = "Im Champions-League-Finale 2013 in Wembley unterlag der BVB Bayern München mit 1:2 nach Verlängerung – ein bitteres Ende einer herausragenden Saison.",
        difficulty = 4,
        funFact = "Das rein deutsche Finale in Wembley (BVB vs. Bayern) war das erste seiner Art in der Champions-League-Geschichte und zog weltweit ein Millionenpublikum an."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Torjäger erzielte in der Bundesliga-Saison 2010/11 unter Klopp beeindruckende 16 Tore und war maßgeblich an der Meisterschaft beteiligt?",
        answerA = "Mario Götze",
        answerB = "Lucas Barrios",
        answerC = "Kevin Großkreutz",
        answerD = "Robert Lewandowski",
        correctAnswer = 3,
        explanation = "Robert Lewandowski war in der Meistersaison 2010/11 mit 16 Bundesliga-Toren der treffsicherste Stürmer des BVB und eine Schlüsselfigur in Klopps System.",
        difficulty = 4,
        funFact = "Lewandowski spielte von 2010 bis 2014 für den BVB und war in dieser Zeit einer der gefährlichsten Mittelstürmer Europas – sein Wechsel zu Bayern 2014 war ein herber Verlust."
    ),

    Question(
        categoryId = 14,
        questionText = "Jürgen Klopp verließ den BVB 2015. Was war sein letztes Pflichtspiel als BVB-Trainer?",
        answerA = "Bundesliga-Auswärtsspiel bei Bayern München",
        answerB = "DFB-Pokalfinale gegen Bayern München",
        answerC = "Champions-League-Gruppenspiel gegen Arsenal",
        answerD = "Bundesliga-Heimspiel gegen Werder Bremen",
        correctAnswer = 1,
        explanation = "Klopps letztes Spiel als BVB-Trainer war das DFB-Pokalfinale 2015 gegen Bayern München, das der BVB nach Verlängerung mit 1:2 verlor.",
        difficulty = 4,
        funFact = "Klopp verabschiedete sich unter Tränen vom BVB – sein emotionaler Abschied berührte Fans und Spieler gleichermaßen."
    ),

    // --- Signal Iduna Park / Westfalenstadion ---

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde das Westfalenstadion offiziell in 'Signal Iduna Park' umbenannt?",
        answerA = "2001",
        answerB = "2003",
        answerC = "2005",
        answerD = "2008",
        correctAnswer = 2,
        explanation = "Am 1. Dezember 2005 wurde das Westfalenstadion offiziell in 'Signal Iduna Park' umbenannt – nach einem Versicherungsunternehmen als neuem Namenssponsor.",
        difficulty = 4,
        funFact = "Bei UEFA-Wettbewerben trägt das Stadion weiterhin den werbefreien Namen 'BVB Stadion Dortmund', da die UEFA keine Namenssponsorings erlaubt."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde das Westfalenstadion eröffnet und welches war das erste Spiel im neuen Stadion?",
        answerA = "1971, gegen Bayern München",
        answerB = "1974, gegen Bayer Uerdingen",
        answerC = "1974, gegen FC Schalke 04",
        answerD = "1972, gegen Werder Bremen",
        correctAnswer = 1,
        explanation = "Das erste Pflichtspiel im Westfalenstadion fand am 7. April 1974 gegen Bayer Uerdingen statt – und endete torlos 0:0.",
        difficulty = 4,
        funFact = "Das Stadion wurde ursprünglich für die Fußball-Weltmeisterschaft 1974 in Deutschland gebaut und hatte damals eine Kapazität von rund 54.000 Plätzen."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Zuschauer fasst der Signal Iduna Park bei Bundesligaspielen mit Stehplätzen (Gesamtkapazität)?",
        answerA = "67.500",
        answerB = "75.000",
        answerC = "81.365",
        answerD = "88.000",
        correctAnswer = 2,
        explanation = "Der Signal Iduna Park fasst 81.365 Zuschauer bei Bundesliga-Heimspielen (inklusive Stehplätze) und ist damit das größte Fußballstadion Deutschlands.",
        difficulty = 4,
        funFact = "Die berühmte 'Gelbe Wand' – die Südtribüne mit über 25.000 Stehplätzen – ist die größte Stehplatztribüne Europas."
    ),

    // --- Rekordtorschützen & Rekordspieler ---

    Question(
        categoryId = 14,
        questionText = "Wer ist bis heute Dortmunds Bundesliga-Rekordtorschütze mit 135 Treffern in 224 Spielen?",
        answerA = "Michael Zorc",
        answerB = "Alfred Preißler",
        answerC = "August Lenz",
        answerD = "Manfred Burgsmüller",
        correctAnswer = 3,
        explanation = "Manfred Burgsmüller erzielte in seiner Zeit beim BVB (1976–1983) insgesamt 135 Bundesliga-Tore in 224 Einsätzen – ein Rekord, der bis heute Bestand hat.",
        difficulty = 4,
        funFact = "Burgsmüller begann seine Karriere beim MSV Duisburg und wechselte erst mit 27 Jahren zum BVB – trotzdem wurde er Rekordtorschütze."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler hält mit 463 Bundesliga-Einsätzen den vereinsinternen Rekord als Rekordspieler?",
        answerA = "Michael Zorc",
        answerB = "Stefan Reuter",
        answerC = "Lars Ricken",
        answerD = "Matthias Sammer",
        correctAnswer = 0,
        explanation = "Michael Zorc bestritt für Borussia Dortmund 463 Bundesliga-Spiele und ist damit der Rekordspieler des Vereins in der Liga.",
        difficulty = 4,
        funFact = "Zorc erzielte dabei auch 131 Bundesliga-Tore und ist damit auch der zweitbeste Bundesliga-Torschütze in der Vereinsgeschichte hinter Burgsmüller."
    ),

    // --- Trainer-Geschichte ---

    Question(
        categoryId = 14,
        questionText = "Matthias Sammer wurde 2001/02 Bundesliga-Meister als Trainer des BVB. Was machte seinen Titelgewinn historisch einzigartig?",
        answerA = "Er war der jüngste Meistertrainer der Bundesliga",
        answerB = "Er führte eine rein deutsche Mannschaft zum Titel",
        answerC = "Er gewann die Meisterschaft ohne eine einzige Heimniederlage",
        answerD = "Er war der erste Trainer, der als Spieler und Trainer beim selben Verein Meister wurde",
        correctAnswer = 3,
        explanation = "Matthias Sammer ist bis heute die einzige Person in der Borussia-Dortmund-Geschichte, die den Bundesliga-Titel sowohl als Spieler (1995, 1996) als auch als Trainer (2002) gewonnen hat.",
        difficulty = 4,
        funFact = "Sammer war Trainer beim BVB von April 2000 bis Mai 2004 und erzielte einen Punkteschnitt von 1,74 pro Spiel – eine solide, wenngleich nicht überragende Bilanz."
    ),

    Question(
        categoryId = 14,
        questionText = "Ottmar Hitzfeld verlor 1993 mit dem BVB das UEFA-Cup-Finale gegen Juventus Turin. Wie endete das Finalrückspiel in Turin?",
        answerA = "0:3",
        answerB = "1:3",
        answerC = "0:1 nach Verlängerung",
        answerD = "3:0 für Dortmund",
        correctAnswer = 1,
        explanation = "Im UEFA-Cup-Finale 1993 verlor der BVB das Rückspiel in Turin gegen Juventus 1:3. Das Hinspiel hatte der BVB 1:3 verloren – Gesamtstand 2:6 für Juventus.",
        difficulty = 4,
        funFact = "Das Scheitern gegen Juventus 1993 machte Hitzfeld noch entschlossener – vier Jahre später schlug sein BVB denselben Gegner im Champions-League-Finale 1997."
    ),

    // --- Champions League 2024 ---

    Question(
        categoryId = 14,
        questionText = "Welches Ergebnis erzielte der BVB im Champions-League-Finale 2024 gegen Real Madrid in Wembley?",
        answerA = "1:2",
        answerB = "1:0 Halbzeitstand, 1:2 Endstand",
        answerC = "2:0",
        answerD = "0:2",
        correctAnswer = 3,
        explanation = "Im Champions-League-Finale 2024 in Wembley verlor Borussia Dortmund gegen Real Madrid mit 0:2 – trotz einer starken Leistung in der ersten Halbzeit.",
        difficulty = 4,
        funFact = "Der BVB überstand die Vorrunde als Gruppendritter und kämpfte sich durch Favoriten wie Atlético Madrid und Paris Saint-Germain ins Finale – ein sensationeller Lauf."
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein gewann der BVB in der Champions-League-Saison 2023/24 das Halbfinale und schaffte damit den Finaleinzug?",
        answerA = "Paris Saint-Germain",
        answerB = "Real Madrid",
        answerC = "FC Barcelona",
        answerD = "Manchester City",
        correctAnswer = 0,
        explanation = "Im Halbfinale der Champions League 2023/24 eliminierte der BVB Paris Saint-Germain mit einem Gesamtergebnis von 2:0 (1:0 und 1:0) und zog damit ins Finale ein.",
        difficulty = 4,
        funFact = "Der BVB-Trainer Edin Terzić führte die Mannschaft durch die gesamte CL-Saison 2023/24, trat aber nach dem verlorenen Finale zurück."
    ),

    // --- Vereins-Identität & Kultur ---

    Question(
        categoryId = 14,
        questionText = "Wie lautet der vollständige offizielle Name von Borussia Dortmund?",
        answerA = "Fußball-Club Borussia Dortmund e.V.",
        answerB = "Sportverein Borussia Dortmund GmbH & Co. KGaA",
        answerC = "Borussia Dortmund Fußballklub e.V.",
        answerD = "Ballspielverein Borussia 09 e.V. Dortmund",
        correctAnswer = 3,
        explanation = "Der vollständige offizielle Name lautet 'Ballspielverein Borussia 09 e.V. Dortmund' – die '09' steht für das Gründungsjahr 1909.",
        difficulty = 4,
        funFact = "Die Abkürzung 'BVB' steht für 'Ballspielverein Borussia' – viele Fans denken, das 'B' stehe für 'Borussia', was aber falsch ist."
    ),

    Question(
        categoryId = 14,
        questionText = "Welches ist der Spitzname des BVB-Stadtrivalen, gegen den der BVB das 'Revierderby' bestreitet?",
        answerA = "Hamburger SV",
        answerB = "VfL Bochum",
        answerC = "Rot-Weiss Essen",
        answerD = "FC Schalke 04",
        correctAnswer = 3,
        explanation = "Das Revierderby zwischen Borussia Dortmund und dem FC Schalke 04 ist eines der leidenschaftlichsten und traditionsreichsten Derbys im deutschen Fußball.",
        difficulty = 4,
        funFact = "Dortmund und Gelsenkirchen (Heimat von Schalke) liegen nur etwa 30 Kilometer voneinander entfernt – die Rivalität ist tief in der Ruhrgebiets-Identität verwurzelt."
    ),

    // --- Spezifische historische Fakten ---

    Question(
        categoryId = 14,
        questionText = "Wie endete das allererste Spiel in der Vereinsgeschichte des BVB am 15. Januar 1911?",
        answerA = "3:0 gegen Germania Dortmund",
        answerB = "2:0 gegen Arminia Dortmund",
        answerC = "9:3 gegen VfB Dortmund",
        answerD = "1:1 gegen Borussia Münster",
        correctAnswer = 2,
        explanation = "Das erste Spiel in der BVB-Geschichte endete am 15. Januar 1911 mit einem deutlichen 9:3-Sieg gegen den VfB Dortmund.",
        difficulty = 4,
        funFact = "Ein so deutlicher Auftaktsieg bei der Vereinspremiere war ein vielversprechender Start für den jungen Verein aus dem Ruhrgebiet."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele der ursprünglich 18 BVB-Gründungsmitglieder kehrten nicht aus dem Ersten Weltkrieg zurück?",
        answerA = "4",
        answerB = "9",
        answerC = "7",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Neun der 18 Gründungsmitglieder kehrten nicht aus dem Ersten Weltkrieg zurück – darunter Julius Jacobi, der jüngere Bruder des ersten Vereinspräsidenten.",
        difficulty = 4,
        funFact = "Der Verlust von fast der Hälfte der Gründungsmitglieder war ein schwerer Schlag, überlebte der junge Verein aber und wuchs in den 1920er-Jahren stark."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr wurde der BVB während der NS-Zeit kurzzeitig aufgelöst und mit anderen Vereinen zur 'BV Borussia 09 Dortmund' fusioniert?",
        answerA = "1933",
        answerB = "1941",
        answerC = "1938",
        answerD = "1945",
        correctAnswer = 1,
        explanation = "Im Jahr 1941 wurden mehrere Dortmunder Vereine auf Druck der NS-Behörden zu 'BV Borussia 09 Dortmund' zusammengeschlossen – eine aufgezwungene Fusion, die nach Kriegsende rückgängig gemacht wurde.",
        difficulty = 4,
        funFact = "Nach dem Ende des Zweiten Weltkriegs wurde Borussia Dortmund am 19. Dezember 1945 – exakt 36 Jahre nach der Gründung – neu gegründet."
    ),

    // --- Transfer & Spieler-Geschichte ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wechselte 2013 in einem spektakulären Transfer zum Erzrivalen Bayern München und wurde damit zum Symbol des Vereinswechsels?",
        answerA = "Robert Lewandowski",
        answerB = "Ilkay Gündogan",
        answerC = "Mats Hummels",
        answerD = "Mario Götze",
        correctAnswer = 3,
        explanation = "Mario Götze wechselte im Sommer 2013 für 37 Millionen Euro von Borussia Dortmund zum FC Bayern München – der Transfer wurde mitten in der Champions-League-Halbfinalsaison bekannt gegeben.",
        difficulty = 4,
        funFact = "Der Zeitpunkt der Transfer-Bekanntgabe kurz vor dem CL-Halbfinale gegen Real Madrid sorgte für erhebliche Unruhe beim BVB – trotzdem zog die Mannschaft ins Finale ein."
    ),

    Question(
        categoryId = 14,
        questionText = "Robert Lewandowski erzielte am 22. September 2015 fünf Tore in neun Minuten für Bayern München. Für welchen Verein spielte er davor (2010–2014)?",
        answerA = "Lech Posen",
        answerB = "Borussia Dortmund",
        answerC = "Ajax Amsterdam",
        answerD = "Hamburger SV",
        correctAnswer = 1,
        explanation = "Robert Lewandowski spielte von 2010 bis 2014 für Borussia Dortmund und wechselte dann ablösefrei zu Bayern München – dort stellte er den legendären Bundesliga-Rekord von 5 Toren in 9 Minuten auf.",
        difficulty = 4,
        funFact = "Lewandowskis Wechsel ablösefrei zu Bayern war einer der größten Ärgernisse der jüngeren BVB-Geschichte – der Verein erhielt keine Transferentschädigung."
    ),

    // --- Weitere Meisterschaften und Saisons ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Deutsche Meistertitel hat Borussia Dortmund insgesamt gewonnen (inklusive Vor-Bundesliga-Ären, Stand bis 2024)?",
        answerA = "5",
        answerB = "8",
        answerC = "6",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Borussia Dortmund hat insgesamt 8 Deutsche Meistertitel gewonnen: 1956, 1957, 1963 (Vor-Bundesliga) sowie 1995, 1996, 2002, 2011 und 2012 (Bundesliga).",
        difficulty = 4,
        funFact = "Zum Vergleich: Bayern München hat über 30 Meistertitel, Borussia Mönchengladbach fünf. Der BVB liegt damit auf Platz 3 in der ewigen Meistertitel-Rangliste Deutschlands."
    ),

    // --- Stadion-Details & Besonderheiten ---

    Question(
        categoryId = 14,
        questionText = "Bei internationalen Spielen (ohne Stehplätze) beträgt die Kapazität des Signal Iduna Parks laut UEFA-Regeln wie viele Sitzplätze?",
        answerA = "54.300",
        answerB = "60.500",
        answerC = "72.000",
        answerD = "66.099",
        correctAnswer = 3,
        explanation = "Bei UEFA-Wettbewerben, bei denen keine Stehplätze erlaubt sind, bietet der Signal Iduna Park 66.099 Sitzplätze.",
        difficulty = 4,
        funFact = "Die Umwandlung von Stehplätzen in Sitzplätze ist ein gängiges Verfahren – insbesondere für die Champions League schreibt die UEFA reine Sitzplatzbelegung vor."
    ),

    // --- Vereinswappen & Symbolik ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Punkte hat das offizielle BVB-Vereinswappen auf dem runden Emblem?",
        answerA = "8",
        answerB = "10",
        answerC = "12",
        answerD = "14",
        correctAnswer = 0,
        explanation = "Das BVB-Vereinswappen ist kreisrund mit acht nach außen ragenden Punkten am Rand – es wurde im Laufe der Vereinsgeschichte mehrfach leicht modernisiert, behielt aber stets seine runde Grundform.",
        difficulty = 4,
        funFact = "Das aktuelle BVB-Logo wurde zuletzt 2019 leicht modernisiert, um es für digitale Medien zu optimieren – der Charakter des klassischen Emblems blieb dabei erhalten."
    ),

    // --- Weitere historische Details ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Keeper hütete im Champions-League-Finale 1997 das Tor der Dortmunder?",
        answerA = "Stefan Klos",
        answerB = "Jens Lehmann",
        answerC = "Roman Weidenfeller",
        answerD = "Dariusz Żuraw",
        correctAnswer = 0,
        explanation = "Stefan Klos stand im Tor, als der BVB im CL-Finale 1997 Juventus mit 3:1 besiegte. Er hielt sicher und war ein wichtiger Teil des Erfolgs.",
        difficulty = 4,
        funFact = "Stefan Klos wechselte nach dem CL-Triumph kurz darauf zu den Glasgow Rangers, wo er ebenfalls eine hervorragende Karriere machte."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Verteidiger war 1997 Kapitän der Mannschaft während des Champions-League-Gewinns?",
        answerA = "Stefan Reuter",
        answerB = "Jürgen Kohler",
        answerC = "Steffen Freund",
        answerD = "Michael Zorc",
        correctAnswer = 0,
        explanation = "Stefan Reuter trug als Kapitän die Mannschaft durch die Champions-League-Saison 1996/97 und hob am Ende als erster die Trophäe in München in die Höhe.",
        difficulty = 4,
        funFact = "Stefan Reuter spielte von 1992 bis 2002 für den BVB und bestritt dabei über 250 Pflichtspiele für den Verein."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher frühere BVB-Trainer führte danach Bayern München ebenfalls zum Champions-League-Titel?",
        answerA = "Nevio Scala",
        answerB = "Ottmar Hitzfeld",
        answerC = "Matthias Sammer",
        answerD = "Jürgen Klopp",
        correctAnswer = 1,
        explanation = "Ottmar Hitzfeld gewann die Champions League zuerst mit dem BVB (1997) und danach erneut mit Bayern München (2001) – als bisher einziger Trainer zweier verschiedener Clubs.",
        difficulty = 4,
        funFact = "Hitzfeld ist damit einer von nur zwei Trainern weltweit, die die Champions League mit zwei verschiedenen Vereinen gewannen (neben Carlo Ancelotti)."
    ),

    Question(
        categoryId = 14,
        questionText = "Welchen Spitznamen trägt Borussia Dortmund in der Fußballwelt aufgrund seiner Vereinsfarben?",
        answerA = "Die Schwarz-Gelben",
        answerB = "Die Westfalen",
        answerC = "Die Borussen",
        answerD = "Alle diese Antworten sind korrekt",
        correctAnswer = 3,
        explanation = "Borussia Dortmund wird sowohl 'Die Schwarz-Gelben', 'Die Westfalen' als auch 'Die Borussen' genannt – alle drei Bezeichnungen sind gängige und anerkannte Spitznamen.",
        difficulty = 4,
        funFact = "Der Begriff 'Borussen' leitet sich vom Vereinsnamen 'Borussia' ab und wird für mehrere Vereine mit diesem Namen verwendet – am bekanntesten für den BVB und Borussia Mönchengladbach."
    ),

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr kaufte der BVB sein Stadion zurück, das er zuvor im Rahmen der Finanzsanierung verkauft hatte?",
        answerA = "2006",
        answerB = "2012",
        answerC = "2014",
        answerD = "2009",
        correctAnswer = 3,
        explanation = "Im Jahr 2009 kaufte Borussia Dortmund das Westfalenstadion (Signal Iduna Park) zurück, das im Rahmen der Finanzsanierung an einen Fonds verkauft worden war.",
        difficulty = 4,
        funFact = "Der Rückkauf des Stadions war ein wichtiges Symbol für die vollendete Gesundung des Vereins – und fiel zusammen mit dem Beginn der Klopp-Ära."
    )

)
