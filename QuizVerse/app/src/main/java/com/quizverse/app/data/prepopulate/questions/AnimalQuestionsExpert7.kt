package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsExpert7(): List<Question> = listOf(

    // EXPERT (difficulty = 4) -- Behavioral Ecology and Sociobiology

    Question(
        categoryId = 9,
        questionText = "Hamiltons Regel besagt, dass altruistisches Verhalten sich dann evolutionaer durchsetzt, wenn r*B > C gilt. Was bezeichnet 'r' in dieser Formel?",
        answerA = "Die Reproduktionsrate des Helfers",
        answerB = "Der Verwandtschaftskoeffizient zwischen Helfer und Empfaenger",
        answerC = "Die Ressourcenverfuegbarkeit im Habitat",
        answerD = "Der Rueckzahlungskoeffizient beim reziproken Altruismus",
        correctAnswer = 1,
        explanation = "In Hamiltons Inklusiv-Fitness-Regel r*B > C bezeichnet r den Verwandtschaftskoeffizienten (relatedness), also die Wahrscheinlichkeit, dass ein Allel beim Helfer und beim Empfaenger durch gemeinsame Abstammung identisch ist. Bei Vollgeschwistern betraegt r = 0,5, bei Halbgeschwistern r = 0,25. B ist der Nutzen fuer den Empfaenger, C sind die Kosten fuer den Helfer.",
        difficulty = 4,
        funFact = "W.D. Hamilton entwickelte diese Regel 1964 -- J.B.S. Haldane hatte sie informell schon frueher beschrieben mit dem Satz: 'Ich wuerde mein Leben fuer zwei Brueder oder acht Cousins opfern.'"
    ),

    Question(
        categoryId = 9,
        questionText = "Bei haplodiploiden Hymenopteren (Ameisen, Bienen, Wespen) ist der Verwandtschaftskoeffizient zwischen Vollschwestern wie gross?",
        answerA = "0,25",
        answerB = "0,50",
        answerC = "0,75",
        answerD = "1,00",
        correctAnswer = 2,
        explanation = "Bei Haplodiploiden teilen Vollschwestern alle vaeterlichen Gene (r_paternal = 1,0, da Vaeter haploid sind) und im Schnitt die Haelfte der muetterlichen Gene (r_maternal = 0,5). Der Gesamtverwandtschaftskoeffizient berechnet sich als (1,0 + 0,5) / 2 = 0,75. Dies ist hoeher als r = 0,5 zwischen Mutter und Tochter, was Hamiltons Erklaerung fuer die Eusozialitaet bei Hymenopteren stuetzt.",
        difficulty = 4,
        funFact = "Da Arbeiterinnen einen r = 0,75 zu Schwestern, aber nur r = 0,25 zu Bruedern haben, sollten sie 3:1 in Schwestern investieren -- eine Vorhersage, die Robert Trivers und Hope Hare 1976 empirisch bei Ameisen bestaetigt haben."
    ),

    Question(
        categoryId = 9,
        questionText = "Das 'Handicap-Prinzip' von Amotz Zahavi (1975) erklaert ehrliche Signale in der sexuellen Selektion. Was ist der zentrale Mechanismus?",
        answerA = "Nur genetisch ueberlegene Individuen koennen die Kosten eines aufwaendigen Signals tragen, weshalb das Signal als ehrlicher Qualitaetsindikator gilt",
        answerB = "Signale werden durch Lernen weitergegeben und repraesentieren kulturelles Kapital",
        answerC = "Rezessiv vorteilhafte Allele werden durch auffaellige Signale fuer Weibchen sichtbar gemacht",
        answerD = "Das Signal ist nur in ressourcenarmen Umgebungen kostspielig und daher konditioniert",
        correctAnswer = 0,
        explanation = "Zahavi argumentierte, dass ein ehrliches Signal nur dann stabil ist, wenn es fuer minderwertige Sender unerschwinglich teuer ist. Der Pfauenschwanz erhoehe das Praedationsrisiko so stark, dass nur Maennchen mit guten Genen (z.B. Parasitenresistenz) ihn tragen koennen. Alan Grafen formalisierte dieses Argument 1990 spieltheoretisch und zeigte, dass ein separierendes Gleichgewicht existiert.",
        difficulty = 4,
        funFact = "Zahavi nannte sein Prinzip 'Handicap Principle' in Anlehnung an das Golfsystem: Nur echte Koenner spielen mit Handicap und gewinnen trotzdem."
    ),

    Question(
        categoryId = 9,
        questionText = "Fishers 'runaway selection'-Modell erklaert die Evolution extremer Ziermerkmale. Welches genetische Prinzip liegt dem Mechanismus zugrunde?",
        answerA = "Epistase zwischen Allelen auf verschiedenen Autosomen",
        answerB = "Eine genetische Korrelation zwischen dem Merkmal beim Maennchen und der Praeferenz beim Weibchen entsteht durch Koppelung und verselbststaendigt den Prozess",
        answerC = "Heterozygotenvorteil stabilisiert extreme Merkmalswerte",
        answerD = "Mutationsdruckdrift in kleinen Populationen bevorzugt auffaellige Varianten",
        correctAnswer = 1,
        explanation = "Fisher (1930) beschrieb, dass sobald Weibchen eine schwache Praeferenz fuer ein Merkmal haben, eine genetische Korrelation zwischen Praeferenz-Allelen (bei Weibchen) und Merkmals-Allelen (bei Maennchen) entsteht. Diese Korrelation verstaerkt sich selbst: Soehne attraktiver Vaeter sind attraktiv, Toechter praeferenztraegender Muetter erben die Praeferenz. Der Prozess laeuft weg (runaway) bis natuerliche Selektion ihn bremst.",
        difficulty = 4,
        funFact = "Das Runaway-Modell wurde erst Jahrzehnte nach Fisher durch Lande (1981) und Kirkpatrick (1982) mathematisch formalisiert und gilt als wichtige Alternative zum Zahavi-Modell."
    ),

    Question(
        categoryId = 9,
        questionText = "Robert Trivers definierte 1972 das Konzept der elterlichen Investition. Was ist der entscheidende Faktor, der das Geschlecht zum limitierenden Faktor bei der sexuellen Selektion macht?",
        answerA = "Das Geschlecht mit der geringeren elterlichen Investition wird staerker durch intrasexuelle Konkurrenz selektiert",
        answerB = "Das Geschlecht mit dem groesseren Gehirn uebernimmt mehr elterliche Fuersorgepflichten",
        answerC = "Das Geschlecht, das teritorial ist, investiert per Definition mehr",
        answerD = "Elterliche Investition ist bei monogamen Arten ausgeglichen und daher irrelevant fuer sexuelle Selektion",
        correctAnswer = 0,
        explanation = "Trivers argumentierte: Das Geschlecht, das weniger pro Nachkomme investiert (typisch das Maennchen), hat eine hoehere potenzielle Reproduktionsrate und wird daher zum Engpass. Das andere Geschlecht waehlt aus, das investierende Geschlecht konkurriert. Dies erklaert, warum bei Seepferdchen (Maennchen tragen die Jungen) die Weibchen um Maennchen konkurrieren.",
        difficulty = 4,
        funFact = "Bei Jakanen (Jacana) und Becassinen-Arten brueten die Maennchen allein -- konsequenterweise sind dort die Weibchen groesser und aggressiver, da sie um Maennchen konkurrieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Die optimale Nahrungssuchtheorie (Optimal Foraging Theory) sagt vorher, dass Tiere Beute gemaess der Profitabilitaet E/h auswaehlen. Was bezeichnet 'h' in diesem Modell?",
        answerA = "Den Hunger-Index des Tieres zum Zeitpunkt der Entscheidung",
        answerB = "Die Handhabungs- und Verarbeitungszeit fuer die Beute nach dem Fang",
        answerC = "Den Hoehensunterschied zwischen Suchgebiet und Neststandort",
        answerD = "Die Haeufigkeit der Beute im Habitat",
        correctAnswer = 1,
        explanation = "Im Prey-Choice-Modell der OFT ist die Profitabilitaet einer Beuteart E/h, wobei E der Energiegehalt und h die Handhabungszeit (handling time) ist. Beutetiere mit niedrigerer Profitabilitaet als die beste Alternative werden nur dann in die Diaetstrategie aufgenommen, wenn profitable Beute selten ist. MacArthur und Pianka (1966) formulierten dieses Modell erstmals.",
        difficulty = 4,
        funFact = "Experimente mit Reiherenten (Aythya fuligula), die Muscheln unterschiedlicher Groesse angeboten wurden, bestaetigen das Modell: Die Enten waehlen konsistent die groessten Muscheln bis zu einem optimalen Durchmesser."
    ),

    Question(
        categoryId = 9,
        questionText = "Beim 'Marginal Value Theorem' von Charnov (1976) wird vorhergesagt, wann ein Tier ein Nahrungspatch verlassen soll. Was ist das optimale Verlassen-Kriterium?",
        answerA = "Wenn die Energieaufnahme im Patch unter die durchschnittliche Energieaufnahme im gesamten Habitat sinkt",
        answerB = "Wenn 50 % der Ressourcen im Patch aufgebraucht sind",
        answerC = "Wenn ein konkurrierendes Individuum den Patch betritt",
        answerD = "Wenn die Reisezeit zum naechsten Patch kuerzer ist als die verbleibende Suchzeit",
        correctAnswer = 0,
        explanation = "Charnovs Marginal Value Theorem besagt: Ein Tier soll einen Patch verlassen, wenn die momentane Ertragsrate (Grenznutzen) auf das Niveau der durchschnittlichen Habitatertragsrate sinkt. Das Theorem sagt auch vorher, dass Tiere in ressourcenarmen Habitaten laenger in Patches bleiben und dass laengere Reisezeiten zu laengeren Patch-Aufenthalten fuehren -- beides empirisch vielfach bestaetigt.",
        difficulty = 4,
        funFact = "Das MVT wurde beim Parasitoid Venturia canescens empirisch besonders elegant bestaetigt: Die Wespe verlaesst Mehlmotteneier-Gruppen exakt dann, wenn die Eiablage-Rate die Habitatdurchschnittsrate erreicht."
    ),

    Question(
        categoryId = 9,
        questionText = "Reziproker Altruismus nach Trivers (1971) erfordert bestimmte Voraussetzungen, damit er evolutionaer stabil sein kann. Welche Bedingung ist NICHT erforderlich?",
        answerA = "Individuen muessen sich wiedererkennen koennen",
        answerB = "Die Interaktionspartner muessen nah verwandt sein (r > 0,25)",
        answerC = "Die Interaktionen muessen sich ueber die Lebenszeit wiederholen",
        answerD = "Betrug (Defektieren ohne spaeteres Helfen) muss erkannt und bestraft werden",
        correctAnswer = 1,
        explanation = "Reziproker Altruismus erfordert Individuenerkennung, wiederholte Interaktionen und Mechanismen gegen Betrug -- aber KEINE Verwandtschaft. Gerade dies ist der konzeptionelle Unterschied zur Verwandtschaftsselektion. Trivers verwendete das Beispiel der Putzerfische: Klientenfische (Putzer vs. Klient sind nicht verwandt) kommen zurueck, da beide Seiten profitieren.",
        difficulty = 4,
        funFact = "Axelrods Computer-Turniere (1984) zeigten, dass 'Tit-for-Tat' (erst kooperieren, dann spiegeln) die robusteste Strategie ist -- koenig und einfach zugleich."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein 'evolutionaer stabiles Gleichgewicht' (ESS) im Sinne von Maynard Smith und Price (1973)?",
        answerA = "Eine Strategie, die bei hinreichender Verbreitung in einer Population nicht durch eine seltene Mutantenstrategie verdraengt werden kann",
        answerB = "Ein Gleichgewichtszustand, bei dem alle Individuen dieselbe Strategie spielen und keine Selektion wirkt",
        answerC = "Eine genetisch fixierte Verhaltensweise, die unter allen Umweltbedingungen optimal ist",
        answerD = "Das Nash-Gleichgewicht in einem Zwei-Personen-Nullsummenspiel",
        correctAnswer = 0,
        explanation = "Eine ESS ist eine Strategie, die -- wenn sie von der Mehrheit der Population gespielt wird -- einen hoeherern Fitness-Wert erzielt als jede seltene Mutantenstrategie. Sie muss also zwei Bedingungen erfuellen: E(I,I) > E(J,I) fuer alle J, oder wenn E(I,I) = E(J,I), dann E(I,J) > E(J,J). Das Konzept verbindet Spieltheorie mit evolutionaerer Biologie.",
        difficulty = 4,
        funFact = "Maynard Smith und Price zeigten, dass das 'Falke-Taube-Spiel' ein gemischtes ESS ergibt: Die optimale Strategiemischung haengt nur von den Kosten- und Nutzenverhaeltnissen ab, nicht von der Populationsgroesse."
    ),

    Question(
        categoryId = 9,
        questionText = "Im 'Falke-Taube-Spiel' (Hawk-Dove Game) ist das ESS eine gemischte Strategie, wenn V < C gilt. Was bedeuten V und C?",
        answerA = "Verwandtschaftsgrad (V) und Konkurrenzintensitaet (C)",
        answerB = "Wert der Ressource (V) und Kosten eines Kampfes (C)",
        answerC = "Verbreitung der Falken-Strategie (V) und Charakterstaerke (C)",
        answerD = "Volumen des Territoriums (V) und Calorie-Aufwand pro Kampf (C)",
        correctAnswer = 1,
        explanation = "Im Hawk-Dove-Spiel ist V der Fitnesswert der umkaempften Ressource und C die Fitness-Kosten eines vollstaendigen Kampfes. Wenn V > C, ist reine Falken-Strategie ESS (kaempfen lohnt immer). Wenn V < C, existiert ein gemischtes ESS: Der Anteil der Falken im Gleichgewicht betraegt p* = V/C. Dies erklaert, warum echte Tier-Kaempfe haeufig ritualisiert sind.",
        difficulty = 4,
        funFact = "Blauflossen-Thunfische zeigen exakt dieses Muster: Wenn Beute reichlich ist (V hoch), eskalieren Kaempfe -- wenn Beute knapp ist (C relativ zu V hoch), dominieren Display-Strategien."
    ),

    Question(
        categoryId = 9,
        questionText = "Was besagt die 'Local Mate Competition'-Theorie von Hamilton (1967) bezueglich des Geschlechterverhaeltnisses bei Parasitoidwespen?",
        answerA = "Wenn mehrere Weibchen im selben Wirt legen, sollte das Geschlechterverhaeltnis maennchenlastig sein",
        answerB = "Wenn nur ein Weibchen in einem isolierten Wirt legt, sollte das Geschlechterverhaeltnis stark weibchenlastig sein, da Brueder miteinander konkurrieren",
        answerC = "Gleichgewichtiges 1:1-Verhaeltnis entsteht nur bei Outbreeding-Populationen",
        answerD = "Die Groesse des Wirtes bestimmt ausschliesslich das Geschlechterverhaeltnis der Nachkommen",
        correctAnswer = 1,
        explanation = "Hamiltons LMC-Theorie: Wenn alle Nachkommen eines Weibchens im selben Wirt schluefen und sich dort paaren (Geschwisterpaarung), konkurrieren Brueder miteinander (Local Mate Competition). Das Muttertier maximiert ihre Inklusivfitness, indem sie nur so viele Soehne produziert, wie notig sind, um alle Toechter zu befruchten -- der Rest wird als weiblicher Nachwuchs angelegt.",
        difficulty = 4,
        funFact = "Bei der Schlupfwespe Nasonia vitripennis legen Einzelweibchen ca. 6-8 % Soehne; bei mehreren Weibchen im gleichen Wirt steigt der Sohn-Anteil auf ca. 50 % -- exakt wie LMC vorhersagt."
    ),

    Question(
        categoryId = 9,
        questionText = "Das 'Honest Signalling through Condition-Dependent Expression'-Konzept erklaert, warum manche Signale zuverlaessig sind. Was ist eine 'Voraussetzung fuer Ehrlichkeit' gemaess Grafen (1990)?",
        answerA = "Das Signal muss angeboren und nicht lernbar sein",
        answerB = "Die Grenzkosten der Signalintensitaet muessen mit steigender Qualitaet des Senders sinken (d.h. Signale sind billiger fuer hochwertige Sender)",
        answerC = "Das Signal muss von beiden Geschlechtern gleichermassen produzierbar sein",
        answerD = "Die Signalproduktion muss von Sexualhormonen abhaengen, damit Faelschung chemisch ausgeschlossen ist",
        correctAnswer = 1,
        explanation = "Grafen (1990) formalisierte Zahavis Handicap-Prinzip und zeigte: Ein ehrliches Separierungsgleichgewicht existiert genau dann, wenn die Grenzkosten der Signalerhoehung fuer qualitativ schlechtere Sender hoeher sind als fuer bessere (Spence-Bedingung). Hoehwertige Individuen koennen sich intensivere Signale 'leisten', da die Kosten relativ zu ihrem Benefit geringer sind.",
        difficulty = 4,
        funFact = "Das Carotinoid-gefaerbte Federkleid vieler Voegel ist ein klassisches Beispiel: Carotinoid-Pigmente muessen mit der Nahrung aufgenommen werden und stehen im Wettbewerb mit Immunfunktionen -- nur gesunde Tiere koennen intensiv gefaerbt sein."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die 'Sexy Son'-Hypothese (Weatherhead und Robertson, 1979) im Kontext polygynischer Voegel?",
        answerA = "Weibchen bevorzugen Maennchen, die haeufig singen, da Soehne dann auch singen und attraktiv sind",
        answerB = "Weibchen profitieren trotz reduzierter direkter Fuersorge vom Maennchen, weil Soehne attraktiver Vaeter ebenfalls attraktiv und fortpflanzungsreich sein werden (indirekte genetische Vorteile)",
        answerC = "Maennchen bevorzugen Weibchen, die bereits Soehne grossgezogen haben",
        answerD = "Attraktivitaet von Soehnen haengt ausschliesslich von der elterlichen Ernaehrung ab, nicht von Genen",
        correctAnswer = 1,
        explanation = "Die Sexy-Son-Hypothese erklaert, warum Weibchen polygyne Maennchen waehlen koennen, obwohl sie weniger direkte Fuersorge erhalten: Ihre Soehne erben die Attraktivitaet des Vaters und werden viele Nachkommen haben. Dies ist ein Mechanismus fuer indirekte (genetische) Vorteile der Partnerwahl, der neben direkten Vorteilen (Ressourcen, Parasitenresistenz) wirkt.",
        difficulty = 4,
        funFact = "Das Paradox der Polygynie: Weibchen eines attraktiven Maennchens koennten trotz geteilter Fuersorge mehr Enkelkinder haben als Weibchen eines monogamen, aber unattraktiven Maennchens."
    ),

    Question(
        categoryId = 9,
        questionText = "Das Konzept der 'Parenteral Investment Conflict'-Theorie nach Trivers (1974) beschreibt einen Konflikt zwischen Elternteil und Nachkomme. Wie unterscheiden sich die optimalen Investitionsstrategien?",
        answerA = "Das Elternteil bevorzugt mehr Investition als der Nachkomme verlangt, da Eltern groessere Erfahrung haben",
        answerB = "Der Nachkomme bevorzugt mehr Investition in sich selbst, als aus Sicht des Elternteils (unter Beruecksichtigung aller Nachkommen) optimal waere, weil r-Asymmetrien bestehen",
        answerC = "Konflikt entsteht nur bei adoptierenden Individuen, nicht bei biologischen Eltern",
        answerD = "Elterntier und Nachkomme haben identische Fitnessziele, da sie verwandt sind",
        correctAnswer = 1,
        explanation = "Trivers (1974): Ein Nachkomme ist mit sich selbst mit r=1 verwandt, mit Geschwistern nur r=0,5. Das Elternteil ist mit allen Nachkommen gleich nah verwandt (r=0,5). Daher bevorzugt der Nachkomme mehr Investition in sich selbst, als das Elterntier aus Gesamtfitness-Sicht optimal findet. Saeuglingsentwoehnungskonflikte bei Primaten sind ein klassisches Beispiel.",
        difficulty = 4,
        funFact = "Bei Schimpansen kann der Entwoehnungskonflikt Wochen dauern: Jungtiere schreien und klammern sich, waehrend Muetter die Milch zunehmend verweigern -- beides entspricht der theoretischen Vorhersage."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die 'Green Beard'-Hypothese von Dawkins (1976) und Hamilton?",
        answerA = "Tiere erkennen Verwandte durch epigenetische Pheromone, die von Allelen auf dem Y-Chromosom kodiert werden",
        answerB = "Ein Allel koennte theoretisch gleichzeitig ein erkennbares Signal (gruener Bart) kodieren und Altruismus nur gegenueber Traegern desselben Allels foerdern",
        answerC = "Gruenfaerbung bei Reptilien signalisiert Dominanzstatus und wird reziprok honoriert",
        answerD = "Die Hypothese erklaert, warum Verwandtenselektion bei gleichfarbigen Individuen staerker wirkt",
        correctAnswer = 1,
        explanation = "Das Green-Beard-Konzept beschreibt ein einzelnes Allel (oder engverlinktes Set), das drei Effekte hat: (1) ein erkennbares Merkmal erzeugen, (2) dieses Merkmal bei anderen erkennen, (3) Altruismus gegenueber Merkmalttraegern foerdern. Es waere genetischer Selektionismus in Reinkultur -- Altruismus ohne Verwandtschaft, nur aufgrund von Allelidentitaet. Echte Belege sind selten, aber bei Meerkatzen und Pilzkaefern beschrieben.",
        difficulty = 4,
        funFact = "Bei der Ameisenart Formica selysi wurde ein 'Supergene' identifiziert, das Koerperfarbe und Koloniestruktur (ein- vs. mehrkoeniglich) gemeinsam kontrolliert -- ein reales Naeherungsbeispiel fuer das Green-Beard-Konzept."
    ),

    Question(
        categoryId = 9,
        questionText = "Alarmrufe bei Beldingt-Zieselchen (Spermophilus beldingi) wurden von Paul Sherman (1977) untersucht. Welche Gruppe ruft signifikant mehr -- und warum?",
        answerA = "Maennchen rufen mehr, da sie groesser und weniger gefaehrdet sind",
        answerB = "Weibchen rufen mehr, da sie sesshaft leben und haeufig von nahen Verwandten (Toechter, Schwestern) umgeben sind",
        answerC = "Junge Tiere rufen mehr, da ihnen die Erfahrung fehlt, Gefahr einzuschaetzen",
        answerD = "Alle Altersgruppen rufen gleich haeufig, aber Intensitaet variiert",
        correctAnswer = 1,
        explanation = "Sherman fand, dass Weibchen deutlich haeufiger Alarmrufe senden als Maennchen. Da Weibchen philopatrisch sind (bleiben in Geburtskolonie), sind sie von nahen Verwandten umgeben. Maennchen dispergieren, sind also von Nicht-Verwandten umgeben. Hamiltons Egel erklaert: Bei hohem mittleren r der Umgebung lohnt sich Altruismus (Alarmruf erhoehen das eigene Risiko, retten aber Verwandte).",
        difficulty = 4,
        funFact = "Sherman zeigte auch, dass weibliche Ziesel mit lebenden Verwandten in der Naehe haeufiger rufen als Weibchen ohne Verwandte -- ein eleganter Test der Verwandtschaftsselektion im Freiland."
    ),

    Question(
        categoryId = 9,
        questionText = "Das 'Lek-Paradox' in der sexuellen Selektionsforschung bezeichnet welches Problem?",
        answerA = "Warum Maennchen auf Leks keine Ressourcen verteidigen, obwohl dies Weibchen anlocken wuerde",
        answerB = "Wenn Weibchen stark auf genetische Qualitaet selektieren, sollte genetische Varianz erschoepft werden -- dennoch beobachten wir anhaltende Praeferenzen. Wie bleibt Varianz erhalten?",
        answerC = "Warum wenige dominante Maennchen auf Leks unverhältnismaessig viele Paarungen erhalten",
        answerD = "Die Schwierigkeit, Weibchenpraeferenzen im Freiland von zufaelligen Begegnungen zu unterscheiden",
        correctAnswer = 1,
        explanation = "Das Lek-Paradox: Wenn Weibchen auf heritable Qualitaet selektieren, sollten gute Gene fixiert werden, Varianz abnehmen und damit der Selektionsvorteil der Wahl verschwinden. Erklaerungsansaetze: Mutation-Selektion-Balance (Mutational Load), fluktuierende Selektion durch parasitische Ko-Evolution (Hamilton-Zuk), konditionsabhaengige Signale die genetische Gesamtqualitaet integrieren.",
        difficulty = 4,
        funFact = "Das Hamilton-Zuk-Modell (1982) schlug vor, dass parasitenresistente Maennchen intensiver gefaerbt sind und diese Resistenz vererbbar ist -- getestet an 109 Vogelarten mit signifikanter Korrelation zwischen Parasitenlast und Farbenpracht."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Sperm Competition' und welche morphologische Konsequenz hat sie fuer Hodengroesse bei Primaten?",
        answerA = "Konkurrenz zwischen Spermien verschiedener Maennchen im weiblichen Fortpflanzungstrakt; polygyne Arten haben relativ groessere Hoden als monogame",
        answerB = "Konkurrenz zwischen Spermien desselben Maennchens um Ovocyten; fuehrt zu kleineren Hoden bei polygamen Arten",
        answerC = "Spermienwettbewerb tritt nur bei Insekten auf und ist fuer Saeugetiere irrelevant",
        answerD = "Groessere Hoden bei monogamen Arten da dort Spermaqualitaet wichtiger ist als Quantitaet",
        correctAnswer = 0,
        explanation = "Sperm Competition (Parker, 1970): Wenn Weibchen sich mit mehreren Maennchen paaren, konkurrieren Spermien verschiedener Maennchen um Befruchtung. Evolutionaere Antwort: Maennchen produzieren mehr Spermien (groessere Hoden relativ zur Koerpergroesse). Bei Schimpansen (promiskuitiv, hohes Spermienwettbewerb) sind Hoden relativ 4x groesser als beim Gorilla (Harem, wenig Wettbewerb).",
        difficulty = 4,
        funFact = "Beim Menschen liegen die relativen Hodengroessen zwischen Schimpanse und Gorilla -- konsistent mit einer evolutionaeren Geschichte moderater, aber vorhandener Polyandrie."
    ),

    Question(
        categoryId = 9,
        questionText = "Kryptische weibliche Wahl (Cryptic Female Choice, Eberhard 1996) beschreibt welches Phaenomen?",
        answerA = "Weibchen, die ihre Partnerwahl vor Maennchen verstecken, um Belastigung zu vermeiden",
        answerB = "Weibchen beeinflussen nach der Kopulation, welches Maennchen tatsaechlich befruchtet (durch Selektion von Spermien, Eizellen-Aktivierung oder Modifikation des Fortpflanzungstrakts)",
        answerC = "Chemische Signale der Eizelle, die nur fuer artzugehoerige Spermien erkennbar sind",
        answerD = "Sexuell rezeptive Weibchen signalisieren Bereitschaft nur innerhalb von Sichtdistanz zum ausgewaehlten Maennchen",
        correctAnswer = 1,
        explanation = "Eberhard (1996) argumentierte, dass Partnerwahl nicht mit der Kopulation endet. Weibchen koennen post-kopulatorisch selektieren: durch bevorzugte Speicherung, Aktivierung oder Transport von Spermien bestimmter Maennchen; durch Selektivitaet bei der Ovulation oder Implantation. Dies gibt Weibchen eine 'zweite Chance' der Selektion, nachdem direkte Wahl verhindert wurde (z.B. durch erzwungene Kopulation).",
        difficulty = 4,
        funFact = "Bei Drosophila-Fruchtfliegen wurde gezeigt, dass weibliche Proteine in der Eizellhuelle gezielt mit Spermienproteinen von Maennchen desselben Stammes interagieren -- ein molekularer Mechanismus kryptischer Wahl."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet das Konzept der 'Evolutionarily Stable Strategy' bei gemischten Strategien? Wann ist eine gemischte ESS stabil?",
        answerA = "Eine gemischte ESS ist stabil, wenn die Fitness aller reinstatistisch reinen Strategien im Gleichgewicht gleich ist",
        answerB = "Gemischte Strategien sind immer instabiler als reine Strategien und koennen keine ESS bilden",
        answerC = "Eine gemischte ESS entsteht nur bei asexuellen Populationen ohne Rekombination",
        answerD = "Stabilitaet erfordert, dass die dominante Strategie mindestens 75 % der Population ausmacht",
        correctAnswer = 0,
        explanation = "Eine gemischte ESS ist ein Gleichgewicht, bei dem mehrere reine Strategien koexistieren (entweder als polymorphe Population oder als individuelle Mischstrategie). Das Gleichgewicht ist stabil, wenn alle im Gleichgewicht vorkommenden reinen Strategien identische Fitness haben -- keine kann die andere bei gegebener Gleichgewichtsfrequenz uebertreffen. Beispiel: Im Falke-Taube-Spiel haben Falken und Tauben bei p* = V/C gleiche Fitness.",
        difficulty = 4,
        funFact = "Bei Seitenfleckeneidechsen (Uta stansburiana) spielen drei Maennchen-Morphen (orange, blau, gelb) ein Stein-Schere-Papier-ESS: Orange schlaegt Blau, Blau schlaegt Gelb, Gelb schlaegt Orange."
    ),

    Question(
        categoryId = 9,
        questionText = "Das 'Handicap-Prinzip' erklaert auch Warnfaerbung (Aposematismus). Warum ist leuchtend-rote Giftigkeit beim Pfeilgiftfrosch evolutionaer stabil?",
        answerA = "Weil rote Pigmente chemisch an Toxine gebunden sind und nicht separat produziert werden koennen",
        answerB = "Weil Mimikry billiger waere, sofern Predatoren nicht lernen koennen -- sie lernen aber, sodass Aposematismus als ehrliches Signal stabil ist",
        answerC = "Weil aposematische Tiere tatsaechlich ehrlich signalisieren: Das Produzieren von Toxinen und Pigmenten kostet Energie, die nur wirklich giftige Individuen tragen koennen",
        answerD = "Weil soziale Lerneffekte bei Praedatoren sicherstellen, dass das Signal nie faelschbar ist",
        correctAnswer = 2,
        explanation = "Aposematismus als ehrliches Signal: Die gemeinsame Produktion von Toxinen und aposematischem Signal ist kostspielig und konditionsabhaengig. Bei Dendrobatidae-Froesche haengt Giftigkeit und Farbintensitaet von der Verfuegbarkeit von Nahrungsmilben ab. Gesunde, ressourcenreiche Individuen sind giftiger und auffaelliger -- das Handicap-Prinzip gilt analog zur sexuellen Selektion.",
        difficulty = 4,
        funFact = "Laboraufgezogene Pfeilgiftfrosche ohne ihre milben-basierte Nahrung sind vollstaendig ungiftig -- ihr Gift entstammt komplett aus dem Nahrungsnetz und wird vom Frosch nur akkumuliert und modifiziert."
    ),

    Question(
        categoryId = 9,
        questionText = "Bei eusocialen Nacktmullen (Heterocephalus glaber) wurden aussergewoehnliche Sozialstrukturen beschrieben. Wie erklaert die Verwandtschaftsselektion ihre extreme Eusozialitaet, obwohl sie diploid sind?",
        answerA = "Inzucht erhoehe den durchschnittlichen Verwandtschaftskoeffizienten der Koloniemitglieder deutlich ueber den diploiden Normalwert von 0,5",
        answerB = "Nacktmulle sind haplodiploide Ausnahmen bei Saeugetieren",
        answerC = "Die Konigin manipuliert die Arbeiter chemisch, sodass Verwandtschaft keine Rolle spielt",
        answerD = "Selektionsdruck durch Praedatoren (Schlangen) wirkt als Gruppenselektionsmechanismus",
        correctAnswer = 0,
        explanation = "Nacktmulle sind diploid, aber hochgradig ingezuechtet: Die effektive Populationsgroesse der Kolonie ist sehr gering, Paarungen finden hauptsaechlich innerhalb der Gruppe statt. Messungen ergaben r-Werte von 0,7--0,9 zwischen Koloniemitgliedern -- hoeher als bei diploiden Vollgeschwistern (r=0,5). Hohe Verwandtschaft erklaert die extreme Eusozialitaet, unabhaengig von Haplodiploidie.",
        difficulty = 4,
        funFact = "Nacktmulle sind kaltbluetig unter Saeugetieren: Sie regulieren ihre Koerpertemperatur kaum selbst, sondern waermen sich kollektiv auf -- eine weitere ungewoehnliche Anpassung an das unterirdische Leben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Greenbeard reciprocity' (oder tit-for-tat) im Axelrod-Turnier und welche Eigenschaft macht es so robust?",
        answerA = "Es gewinnt immer in Direktvergleichen gegen andere Strategien",
        answerB = "Es ist 'nett' (kooperiert zuerst), vergeltend (bestraft Verrat), vergebend (kehrt nach Bestrafung zu Kooperation zurueck) und klar (leicht vorhersagbar)",
        answerC = "Es erkennt den Verwandtschaftsgrad und kooperiert nur mit r > 0,25",
        answerD = "Es maximiert den kurzfristigen Eigennutzen bei jedem einzelnen Zug",
        correctAnswer = 1,
        explanation = "In Robert Axelrods Computerturnieren (1984) gewann Tit-for-Tat (gespielt von Anatol Rapoport) trotz seiner Einfachheit. Robustheit durch vier Eigenschaften: (1) Nettigkeit -- nie als Erster defektieren; (2) Vergeltenheit -- sofortiger Vergeltung von Verrat; (3) Vergeblichkeit -- nach Bestrafung sofort zur Kooperation zurueckkehren; (4) Klarheit -- vorhersagbares Verhalten ermoeglicht Kooperationslernen beim Gegenueber.",
        difficulty = 4,
        funFact = "Axelrod lud Experten aus Oekonomie, Psychologie, Mathematik und Soziologie ein -- Tit-for-Tat mit nur vier Zeilen BASIC-Code schlug alle Strategien mit Hunderten von Bedingungen."
    ),

    Question(
        categoryId = 9,
        questionText = "Kooperatives Brutverhalten (Cooperative Breeding) bei Voegeln wurde extensiv bei Langschwanzscharben (Buphagus) und Weissstirnspinten untersucht. Welche zwei Haupthypothesen erklaeren, warum Helfer helfen?",
        answerA = "Ressourcenmangel und Praedationsdruck als externe Zwangsmechanismen",
        answerB = "Direkter Nutzen (Uebungserfahrung, zukuenftige Territorialpositionen) und indirekte Vorteile durch Verwandtschaftsselektion (Helfer sind oft Geschwister der Brutepaare)",
        answerC = "Chemische Manipulation durch Brutweibchen und hormonelle Unterdrueckung der Reproduktion bei Helfern",
        answerD = "Gruppenselektionsvorteile durch hoehere Kolonienueberlebensrate",
        correctAnswer = 1,
        explanation = "Zwei nicht-exklusive Erklaerungen fuer Helferverhalten: (1) Indirekte Vorteile -- Helfer sind oft Brueder/Schwestern der Bruetepaare, staerken also Inklusivfitness (Verwandtschaftsselektion). (2) Direkte Vorteile -- Helfer gewinnen Erfahrung im Brutverhalten ('pay-to-stay'), verbessern ihre Chancen auf ein eigenes Territorium oder erben es langfristig (Queue-Hypothese).",
        difficulty = 4,
        funFact = "Beim Florida Scrub-Jay (Aphelocoma coerulescens) sind fast alle Helfer maennliche Nachkommen des Vorjahres -- und Territorien in ihrem Habitat sind so knapp, dass Warten auf Erbschaft die beste Option ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Die 'Zahavi Handicap'-Debatte wurde durch Grafens spieltheoretische Analyse (1990) entschieden. Was war das zentrale Ergebnis?",
        answerA = "Zahavi hatte Unrecht -- Handicap-Signale koennen kein evolutionaeres Gleichgewicht bilden",
        answerB = "Ein ehrliches Separierungsgleichgewicht existiert, sofern die Kosten-Qualitaets-Interaktion die richtige Richtung hat (Crossover-Bedingung erfuellt ist)",
        answerC = "Nur binäre (an/aus) Signale sind evolutionaer stabil, graduelle Signale nicht",
        answerD = "Das Ergebnis haengt ausschliesslich von der Populationsgroesse ab, nicht von der Kostenfunktion",
        correctAnswer = 1,
        explanation = "Grafen (1990) modellierte Signalevolution mit optimaler Kontrolltheorie und zeigte: Ein separierendes Gleichgewicht (wo verschiedene Qualitatsstufen verschiedene Signale senden und Empfaenger richtig reagieren) existiert, wenn die partielle Ableitung der Kosten nach Qualitaet und Signalintensitaet eine bestimmte Vorzeichen-Bedingung erfuellt (Spence-Mirrlees-Kondition). Damit war Zahavis intuitives Argument formell bestaetigt.",
        difficulty = 4,
        funFact = "Grafens Paper 'Biological signals as handicaps' im Journal of Theoretical Biology gilt als eines der elegantesten mathematischen Argumente in der Verhaltensokologie und wird bis heute in Lehrbuecher zitiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das 'Polygyny Threshold Model' von Verner und Willson (1966)?",
        answerA = "Die minimale Koerpergroesse, die ein Maennchen fuer Polygynie benoetigt",
        answerB = "Den Schwellenwert der Habitatqualitaet, ab dem es fuer ein Weibchen besser ist, die zweite Partnerin eines Maennchens in einem guten Territorium zu sein als die alleinige Partnerin in einem schlechten",
        answerC = "Das Geschlechterverhaeltnis, ab dem polygyne Maennchen eine evolutionaere Mehrheit bilden",
        answerD = "Die Anzahl der Revierbesuche, ab der Weibchen Maennchen als geeignete Polygynisten akzeptieren",
        correctAnswer = 1,
        explanation = "Das Polygyny Threshold Model: Wenn die Habitatqualitaet zwischen Revieren stark variiert, koennte es vorteilhafter sein, als zweites Weibchen eines erfolgreichen Maennchens in hochwertigem Habitat zu brueten, als als alleiniges Weibchen in minderwertigem Habitat. Der 'Schwellenwert' ist der Qualitaetsunterschied, bei dem die erwartete Fitness beider Optionen gleich ist.",
        difficulty = 4,
        funFact = "Beim Rotschultersteckling (Agelaius phoeniceus) variiert Territorienqualitaet enorm durch Vegetationsstruktur. Weibchen, die polygynen Maennchen in Top-Territorien folgen, haben oft hoehere Bruterfolgswerte als Weibchen in monogamem Minimalhabitat."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die 'Chase Away Selection' als alternative zur 'Good Genes'-Hypothese bei der Partnerwahl?",
        answerA = "Maennchen verfolgen Weibchen bis zur Erschoepfung als Kopulationstaktik, was sexuellen Konflikt erzeugt",
        answerB = "Maennliche Stimuli evoluieren, um sensorische Systeme der Weibchen zu 'ueberwaltigen', waehrend weibliche Resistenz coevolviert -- ein Konflikt ohne genetische Nutzenkorrelation",
        answerC = "Weibchen jagen schwache Maennchen fort (chase away) und selektieren nur fuer koerperliche Ueberlegenheit",
        answerD = "Intersexueller Konflikt bei der Nahrungsressorucenverteilung treibt Evolutions von Geschlechtsunterschieden",
        correctAnswer = 1,
        explanation = "Holland und Rice (1998) postulierten Chase-Away Selection als sexuellen Konflikt: Maennliche Signale entwickeln Manipulationspotenzial ueber weibliche Sensorik (z.B. durch Ausnutzung vorbestehender sensorischer Biases). Weibchen entwickeln Widerstand. Es entsteht kein 'gute Gene'-Signal, sondern ein evolutionaerer Ruestungswettlauf zwischen maennlicher Manipulation und weiblicher Resistenz.",
        difficulty = 4,
        funFact = "Bei Guppies (Poecilia reticulata) gibt es Hinweise, dass Weibchen nach Exposition zu attraktiven Maennchen weniger lang leben -- konsistent mit dem Manipulationsmodell, nicht mit Good-Genes."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht die Verhaltensokologie unter 'Ideal Free Distribution' (IFD, Fretwell und Lucas, 1970)?",
        answerA = "Tiere verteilen sich proportional zur Ressourcendichte, wenn sie ideal informiert und frei von Konkurrenz sind -- jeder Patch hat gleiche individuelle Ertragrate im Gleichgewicht",
        answerB = "Tiere verteilen sich zufaellig (frei), ohne Ruecksicht auf Ressourcendichte",
        answerC = "Dominante Individuen besetzen den besten Patch; andere verteilen sich frei auf schlechtere Patches",
        answerD = "Migration erfolgt ideal proportional zur Distanz, nicht zur Qualitaet",
        correctAnswer = 0,
        explanation = "IFD-Modell: Wenn Individuen (1) perfekt informiert sind (ideal) und (2) ungehindert migrieren koennen (free), sagen Milman-Pool-Modelle vorher, dass sie sich so verteilen, dass die individuelle Fitness in allen genutzten Patches gleich ist. Mit steigender Nutzerzahl sinkt die individuelle Ertragrate durch intraspecifische Konkurrenz. Empirisch gut bestaetigt bei Fischen in gestreamten Versuchspools.",
        difficulty = 4,
        funFact = "Harper (1982) warf Brot in zwei Bereiche eines Teiches (verschiedene Wurffrequenzen) und beobachtete, dass Enten sich in exakt dem vorhergesagten IFD-Verhaeltnis verteilten -- einer der saubersten Freilandtests in der Verhaltensokologie."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Zahavian Altruism' oder das Konzept des 'Altruismus als Signal' und wie unterscheidet es sich vom Reziproken Altruismus?",
        answerA = "Altruismus als Signal meint, dass altruistische Handlungen eigene Qualitaet und Dominanz signalisieren -- die Kosten sind das Handicap, das ehrliche Senderqualitaet anzeigt",
        answerB = "Zahavian Altruismus basiert auf Gegenseitigkeit und ist daher identisch mit Triversschen Reziprokem Altruismus",
        answerC = "Altruismus als Signal funktioniert nur bei nahen Verwandten und ist damit ein Spezialfall der Verwandtenselektion",
        answerD = "Zahavi lehnte den Altruismusbegriff ab und erklaerte alle scheinbaren Hilfshandlungen als Eigennutz",
        correctAnswer = 0,
        explanation = "Zahavi (1977) schlug vor, dass altruistische Handlungen Handicap-Signale sind: Wer anderen gibt, demonstriert seinen Ueberschuss an Ressourcen. Der 'Altruist' signalisiert: Ich bin so hochwertig, dass ich es mir leisten kann, Ressourcen zu verschenken. Dies erklaert z.B. Arabersperling-Kooperation als Statusdemonstration -- anders als reziproker Altruismus, der kein Signaling beinhaltet.",
        difficulty = 4,
        funFact = "Zahavis eigene empirische Arbeit an Arabersplingen (Turdoides squamiceps) in der Negev-Wueste unterstuetzte das Signal-Modell: Helfer, die mehr gaben, wurden staerker von Dominanztieren toleriert."
    ),

    Question(
        categoryId = 9,
        questionText = "Das 'Life Dinner Principle' von Dawkins und Krebs (1979) beschreibt eine Asymmetrie im Ruestungswettlauf zwischen Raeuber und Beute. Was ist die Kernaussage?",
        answerA = "Beutetiere haben staerkere Selektionsdruck, sich zu verbessern, weil sie ihr Leben riskieren, waehrend Raeuber nur eine Mahlzeit riskieren",
        answerB = "Raeuber evoluieren schneller, weil sie energetisch mehr in Jagd investieren als Beute in Flucht",
        answerC = "Das Prinzip erklaert, warum Raeuber-Beute-Coevolution immer ein stabiles Gleichgewicht ansteuert",
        answerD = "Groessere Tiere (Raeubere) haben staerkeren Selektionsdruck als kleinere Beute",
        correctAnswer = 0,
        explanation = "Dawkins und Krebs (1979): Im Ruestungswettlauf zwischen Hase und Fuchs riskiert der Hase sein Leben, der Fuchs nur sein Abendessen. Diese asymmetrische Kostenfunktion bedeutet, dass Selektion auf Beuteseite staerker wirkt. Folge: Beutetiere koennen evolutionaer 'vorne liegen' und Raeuber sind permanent einen Schritt hinterher -- kein stabiles Koevolutions-Gleichgewicht, sondern eine Jagd.",
        difficulty = 4,
        funFact = "Das Prinzip erklaert, warum Gazellen schneller laufen als Geparden dies oekonomisch erfordern wuerde: Die Asymmetrie des Selektionsdrucks treibt Ueberspezifizierung der Flucht."
    ),

    Question(
        categoryId = 9,
        questionText = "Beim 'War of Attrition'-Modell (Maynard Smith, 1974) fuer langwierige Tierkaempfe: Was ist das ESS-Ergebnis?",
        answerA = "Alle Individuen warten gleich lange -- homogene Ausdauerstrategie",
        answerB = "Die ESS ist eine gemischte Strategie, bei der Wartezeiten nach einer Exponentialverteilung verteilt sind -- kein Individuum kann seine Wartezeit vorausschauend optimieren",
        answerC = "Das Individuum mit der groesseren Koerpergroesse gewinnt immer durch reine Praesenz",
        answerD = "Kaempfe eskalieren immer bis zur koerperlichen Verletzung, da Signaling kein stabiles Gleichgewicht bildet",
        correctAnswer = 1,
        explanation = "Im War-of-Attrition-Modell bezahlen beide Teilnehmer Kosten proportional zur Kampflaenge. Das ESS ist eine exponentiell verteilte Wartezeit -- Individuen mischen zufaellig aus einer exponentiellen Verteilung. Kein Individuum kann von einer deterministischen Wartezeit profitieren, da ein Gegner, der laenger warten koennte, immer gewinnen wuerde. Zufaelligkeit ist die einzig stabile Loesung.",
        difficulty = 4,
        funFact = "Dieses Modell hat elegante Anwendungen in der Spieltheorie des Nervensystems: Neuronales 'Rauschen' koennte adaptiv sein, weil es Verhaltensmuster unvorhersagbar macht -- wie beim War of Attrition."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Sneaker'-Maennchen-Konzept und wie erklaert es die Evolutionsstabilitaet alternativer Reproduktionstaktiken (ARTs)?",
        answerA = "Sneaker-Maennchen taeuschen weibliches Erscheinungsbild vor und koennen durch Frequenzabhaengigkeit eine ART-ESS bilden",
        answerB = "Sneaker sind genetisch minderwertig und werden langfristig durch sexuelle Selektion eliminiert",
        answerC = "Alternative Taktiken sind nur bei Fischen beschrieben und bei Saeugetieren nicht vorzufinden",
        answerD = "Sneaker-Maennchen umgehen Dominanzhierarchien durch Gruppenkooperation, nicht durch Einzelstrategie",
        correctAnswer = 0,
        explanation = "ARTs sind evolutionaer stabil, wenn Fitness-Auszahlungen frequenzabhaengig sind: Bei hoher Dichte von Satellit/Sneaker-Maennchen sind ihre Vorteile (kein Revierverteidigungsaufwand) geringer -- das System reguliert sich. Sneaker taeuschen oft weibliche Erscheinung vor (Mimikry). Bei Rufous-Kolibris, Atlantischen Lachsen und Seitenfleckeneidechsen sind ESS-Gleichgewichte empirisch beschrieben.",
        difficulty = 4,
        funFact = "Bei Atlantischen Lachsen (Salmo salar) werden 'Jack'-Maennchen (fruehreife Nichtmigranten) bereits im Suessgewasser sexuell aktiv -- sie infiltrieren Laichnester dominanter Maennchen und haben trotzdem vergleichbare Fitness."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie erklaert die 'Good Genes'-Hypothese die Evolution weiblischer Praeferenzen fuer Merkmale, die keinen direkten Nutzen bieten?",
        answerA = "Praeferenzen entstehen durch kulturelle Transmission und haben keinen genetischen Hintergrund",
        answerB = "Weibchen erhalten indirekte genetische Vorteile: Nachkommen erben die Qualitaets-Allele des Vaters (Parasitenresistenz, allgemeine Vitalitaet) und haben dadurch erhoehte Fitness",
        answerC = "Weibchen haben sensorische Biases, die zufaellig mit maennlichen Merkmalen korrelieren",
        answerD = "Direkte Kosten der Praeferenzausfuehrung selektieren immer gegen Praeferenzen ohne direkten Nutzen",
        correctAnswer = 1,
        explanation = "Good-Genes-Modelle (Zahavi, Hamilton, Zuk): Wenn Attraktivitaetsmerkmale mit allgemeiner genetischer Qualitaet (z.B. Immunfunktion, Parasitenresistenz) korrelier sind und diese Qualitaet vererbbar ist, profitieren Weibchen durch bessere Nachkommen. Soehne und Toechter erben Qualitaets-Allele des Vaters. Der Selektionsvorteil liegt in erhoehter Nachkommensfitness (indirect benefits).",
        difficulty = 4,
        funFact = "Weibliche Zebrafinkweibchen, deren Partner staerker rot (karotinoide Farbgebung) gefaerbt waren, hatten Soehne mit schnellerer Immunreaktion -- ein direkter Hinweis auf vererbte Qualitaet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Westermarck-Phaenomen' und welche evolutionaere Funktion wird ihm zugeschrieben?",
        answerA = "Die Praeferenz fuer aehlich riechende Partner als Zeichen guter Immunkompabilitaet",
        answerB = "Sexuelle Desensibilisierung gegenueber Individuen, mit denen man in den ersten Lebensjahren eng zusammenlebt -- ein Inzest-Vermeidungsmechanismus",
        answerC = "Die erlernte Praeferenz fuer Paarungspartner der Elterngeneration bei manchen Voegeln",
        answerD = "Epigenetische Programmierung der Sexualitaet durch fruehe soziale Erfahrung bei Saeugetieren",
        correctAnswer = 1,
        explanation = "Edvard Westermarck (1891) beschrieb, dass Menschen (und viele Tiere) sexuelles Interesse an engen fruehkindlichen Gefaehrten verlieren. Evolutionaere Funktion: Inzestvermeidung ohne Verwandtschaftserkennung -- wer in den ersten Jahren zusammenlebt, ist wahrscheinlich verwandt. Bestaetigt durch israelische Kibbutz-Studien (Kinder ohne gemeinsame Erziehung aus unterschiedlichen Familien heiraten waehlend, enge Spielgefaehrten nicht).",
        difficulty = 4,
        funFact = "Auf Taiwan war es zeitweise ueblich, zukuenftige Schwiegertochter als Kleinkinder ins Haushalt aufzunehmen (sim-pua). Diese Ehen hatten signifikant weniger Kinder und hoehere Scheidungsraten -- ein natuerliches Experiment fuer das Westermarck-Phaenomen."
    ),

    Question(
        categoryId = 9,
        questionText = "Bei der 'Recruiter-Scrounger'-Theorie (Barnard und Sibly, 1981) in Tiergruppen: Was ist das ESS-Resultat?",
        answerA = "Alle Tiere werden zu Produzenten (Producer), da Scrounger parasitaere Fitness haben",
        answerB = "Ein stabiles Mischgleichgewicht, bei dem Producer (suchen selbst) und Scrounger (nutzen Entdeckungen anderer) gleiche Fitness haben -- das Verhaeltnis haengt von der Gruppengroesse und Ressourcenklumpen ab",
        answerC = "Scrounger dominieren immer, bis Producer aussterben",
        answerD = "Nur genetisch determinierte Strategien sind stabil; flexible Tiere koennen keine ESS bilden",
        correctAnswer = 1,
        explanation = "Im Producer-Scrounger-Modell: Wenn Scrounger-Anteil steigt, werden Entdeckungen seltener (weniger Produzenten suchen), bis Scrounger-Fitness auf Producer-Niveau sinkt. Das Gleichgewicht p* ist frequenzabhaengig und bildet ein gemischtes ESS. Empirisch vielfach bestaetigt bei Tauben, Spatzen und Meisen: mit steigendem Scrounger-Anteil steigt auch Taktikwechsel-Rate.",
        difficulty = 4,
        funFact = "Luc-Alain Giraldeau und Thomas Caraco entwickelten das Modell zur vollen Theorie: Bei Hausspatzen korreliert die Scrounger-Rate mit Nahrungsklumpen-Verteilung -- exakt wie das Modell vorhersagt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt die 'Muller'sche Ratsche' (Muller's Ratchet) und welche Konsequenz hat sie fuer die Evolution der Sexualreproduktion?",
        answerA = "Sexuelle Selektion akkumuliert vorteilhafte Mutationen schneller als asexuelle Vermehrung",
        answerB = "In asexuellen Populationen akkumulieren schaedliche Mutationen irreversibel, da keine Rekombination erlaubt, belastungsfreie Linien wiederherzustellen -- Sexualreproduktion kann als Mechanismus zur Reinigung des Genoms dienen",
        answerC = "Die Ratchet-Metapher beschreibt den unidirektionalen Fortschritt der sexuellen Selektion",
        answerD = "Mutationen haeufen sich bei Maennchen schneller an als bei Weibchen, weil Y-Chromosomen keine Rekombination durchlaufen",
        correctAnswer = 1,
        explanation = "H.J. Muller (1964): In asexuellen Populationen koennen schaedliche Mutationen nicht durch Rekombination aus Linien entfernt werden. Die beste (am wenigsten belastete) Linie kann zufaellig aussterben (Drift), und es gibt keinen Weg zurueck -- die Ratchet klickt vor. Sexualreproduktion ermoeglicht Rekombination und kann so Linien schaffen, die weniger Mutationen tragen als beide Eltern -- ein Vorteil der Sexualitaet.",
        difficulty = 4,
        funFact = "Rotatorien (Raedertierechen) sind teilweise asexuell und zeigen erhoehte Mutationslast in asexuellen Linien -- empirische Unterstuetzung fuer Mullers Ratchet in der Natur."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Red Queen'-Modell von Van Valen (1973) und wie erklaert es sexuelle Reproduktion?",
        answerA = "Sexuelle Reproduktion ist adaptiv, weil es den Nachkommen ermoeglicht, Parasiten durch genetische Rekombination immer einen Schritt voraus zu sein",
        answerB = "Populationen muessen kontinuierlich evoluieren (wie Alice mit der Roten Koenigin rennen), nur um dasselbe absolute Fitnessniveau zu halten -- dies favorisiert Sexualreproduktion fuer schnelle Anpassung",
        answerC = "Die Red-Queen-Hypothese erklaert nur Ko-Evolution zwischen Raeuber und Beute, nicht sexuelle Selektion",
        answerD = "Sexuell reproduzierende Populationen haben immer hoehere absolute Fitness als asexuelle -- das Red-Queen-Modell formalisiert diesen direkten Vorteil",
        correctAnswer = 1,
        explanation = "Van Valen (1973) beobachtete konstante Extinktionsraten und schlussfolgerte, dass Organismen staendig evoluieren muessen, nur um ihren Platz zu halten -- benannte nach Lewis Carrolls Roter Koenigin. Im Kontext sexueller Reproduktion (Hamilton, Zuk, 1982): Parasiten co-evoluieren mit Wirten; genetisch diverse Nachkommen (durch Sex) sind schwerer fuer Parasiten anzupassen als genetische Klone.",
        difficulty = 4,
        funFact = "Experimente mit Fadenwurmem (Caenorhabditis elegans) und ihrem Bakterienparasit Serratia zeigten: Sexuelle C. elegans-Linien ueberlebten Parasitenbefall signifikant besser als isogene asexuelle Linien -- direkter Red-Queen-Beweis."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Condition-Dependent Expression' von Signalen und warum sichert sie Ehrlichkeit in der Kommunikation?",
        answerA = "Signale werden nur in bestimmten Jahreszeiten exprimiert, was Betrug zeitlich einschraenkt",
        answerB = "Signalintensitaet ist physiologisch an den Ernaehrungs- und Gesundheitszustand gekoppelt -- nur hochwertige Individuen koennen intensive Signale produzieren, weil dies Ressourcen oder Immunkapazitaet erfordert",
        answerC = "Alle Individuen produzieren dasselbe Grundsignal, aber Bedingungsabhaengige Modifikation filtern bei der Emission",
        answerD = "Bedingungsabhaengige Signale sind immer lernbasiert und unterliegen keiner genetischen Kontrolle",
        correctAnswer = 1,
        explanation = "Konditionsabhaengige Signale (Zahavi, Grafen): Wenn ein Signal die physiologische Verfassung direkt widerspiegelt (z.B. Carotinoid-Farbgebung haengt von Nahrungsaufnahme und Immunaktivitaet ab), koennen nur gesunde, gut ernaehrte Individuen maximale Signalintensitaet zeigen. Die Verbindung zwischen Qualitaet und Signalausdruck wird durch physiologische Contraints hergestellt, nicht durch genetische Kopplung allein.",
        difficulty = 4,
        funFact = "Experimentelle Injektion von Lipopolysaccharid (entzuendungsausloesendes Antigen) bei Zebrafinken reduziert die Farbintensitaet ihres Schnabels nachweislich -- die Immunaktivierung konkurriert direkt mit Carotinoid-Allokation fuer Farbgebung."
    ),

    Question(
        categoryId = 9,
        questionText = "Bei welcher Tierart wurde das Konzept der 'Reciprocal Altruism'-Kontrolle durch die Untersuchung von Vampirfledermaeuse-Blutmahlzeiten (Wilkinson, 1984) empirisch bestaetigt?",
        answerA = "Desmodus rotundus (Gemeine Vampirfledermaus), Kolonien in Hoehlenschlafraeumen Costa Ricas",
        answerB = "Myotis lucifugus (Nordamerikanische Braunfledermaus) in Hibernationshoehlen",
        answerC = "Pteropus giganteus (Flughund) in Obstgarten-Kolonien Suedostasiens",
        answerD = "Nyctalus noctula (Abendsegler) in Baumhoehlenschlaefern Europas",
        correctAnswer = 0,
        explanation = "Gerald Wilkinson (1984) untersuchte Desmodus rotundus in Costa Rica: Saette Fledermaeuse regurgitieren Blut an hungrige Roosting-Partner. Wilkinson zeigte: (1) Zurueckgabe korreliert mit Verwandtschaft (Verwandtenselektion), aber auch (2) nichtver wandte Paare tauschen reziprok aus, wobei Erfahrungsgeschichte der Interaktion prediktiv ist. Dies war ein seltener Freilandbeleg fuer reziproken Altruismus bei Nicht-Verwandten.",
        difficulty = 4,
        funFact = "Wilkinsons Befund: Hungernde Fledermaeuse sterben nach ca. 60 Stunden -- die Kosten des Gebens sind niedrig fuer Satte, der Nutzen fuer Hungernde extrem hoch. Exakt die Bedingungen, unter denen reziproker Altruismus evoluieren sollte."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Indirect Reciprocity' (Alexander, 1987) und wie unterscheidet es sich von direktem Reziproken Altruismus?",
        answerA = "Indirekte Reziprozitaet basiert auf Reputation: Wer beobachtet wird, wie er anderen hilft, erhaelt spaeter von Dritten Hilfe -- Kooperation breitet sich ueber soziale Netzwerke aus",
        answerB = "Indirekter Altruismus bedeutet Hilfe fuer Verwandte, waehrend direkter Altruismus Nicht-Verwandte betrifft",
        answerC = "Indirekte Reziprozitaet basiert auf chemischen Signalen (Pheromone), die Hilfsbereitschaft anzeigen",
        answerD = "Das Konzept ist identisch mit dem Triversschen Modell -- Alexander verwendete nur eine andere Bezeichnung",
        correctAnswer = 0,
        explanation = "Alexanders Indirect Reciprocity: A hilft B; C beobachtet dies und hilft A spaeter. Reputation ('image score') ist die Grundwaehrung. Dies erfordert kognitive Voraussetzungen: Gedaechtnis fuer fremde Interaktionen, Beobachtung Dritter und Weitergabe von Ruf-Information. Nowak und Sigmund (1998) formalisierten es mathematisch und zeigten, dass Gossip und Reputationsverfolgung Kooperation stabilisieren koennen.",
        difficulty = 4,
        funFact = "Experimente mit dem Wirtschaftsspiel 'Helping Game' bei Menschen zeigen: Personen helfen signifikant mehr, wenn sie wissen, dass sie beobachtet werden -- konsistent mit Indirect-Reciprocity-Logik."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem 'Honest Signaling' durch immunologische Kompromisse am Beispiel der 'Immunological Handicap Hypothesis'?",
        answerA = "Tiere signalisieren ehrlich ihre Parasitenbelastung durch aposematische Farbgebung",
        answerB = "Sexualmerkmale (z.B. Testosteron-abhaengige Ornamente) sind teuer, weil Testosteron die Immunfunktion supprimiert -- nur immunologisch robuste Maennchen koennen gleichzeitig ornamentieren und gesund bleiben",
        answerC = "Immunproteine werden direkt als Signalmolekuele genutzt, deren Konzentration Qualitaet anzeigt",
        answerD = "Krankheitsresistenz wird durch Balzverhalten direkt an Weibchen kommuniziert durch spezifische Vokalisierungen",
        correctAnswer = 1,
        explanation = "Folstad und Karter (1992) formulierten die 'Immunocompetence Handicap Hypothesis': Testosteron steigert sekundaere Geschlechtsmerkmale, supprimiert aber gleichzeitig das Immunsystem. Maennchen, die trotz hohem Testosteron gesund sind, haben superior Immunsystem. Ihr Ornament signalisiert ehrlich: Ich trage das Handicap hohen Testosterons und bin dennoch gesund -- nur Hochqualitaets-Individuen koennen das.",
        difficulty = 4,
        funFact = "Experimentelle Testosteron-Implantate bei Rotfluegel-Staerlingen erhoeht Ornamentexpression, aber auch Parasitenbelastung und Mortalitaet -- ein direkter Beleg fuer den Immunsystem-Kompromiss."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das evolutionaere Paradox der 'Costly Punishment' und wie wird es durch Theorien erklaert?",
        answerA = "Bestrafung ist nie kostspielig, da Bestrafer immer materielle Vorteile gewinnen",
        answerB = "Das Bestrafen von Normverletzern (Defekteuren) ist kostspielig fuer den Bestrafer ohne direkten Nutzen -- kann aber durch indirekte Reziprozitaet oder Reputationsgewinne evolutionaer stabil sein",
        answerC = "Bestrafung evoluiert nur bei hochkognitiven Arten mit Sprache",
        answerD = "Altruistische Bestrafung ist ein kulturelles Phaenomen ohne genetische Basis und daher ausserhalb der Evolutionsbiologie",
        correctAnswer = 1,
        explanation = "Altruistische Bestrafung (Fehr und Gaechter, 2002): In oeffentliche-Gut-Spielen bestrafen Menschen Defekteure auch dann, wenn dies eigene Kosten verursacht und keine direkten Vorteile bringt. Evolutionaere Erklaerungen: Reputationsgewinne durch Signaling eigener Haerte; indirekte Reziprozitaet; Gruppenselektionseffekte. In Computersimulationen mit Tit-for-Tat plus Bestrafungsmodul entstehen stabilere Kooperationsnetzwerke.",
        difficulty = 4,
        funFact = "Fehr und Gaechters Ultimatumspiel-Experimente zeigten, dass Menschen weltweit unfaire Angebote ablehnen und damit dem Gegner und sich selbst schaden -- altruistische Bestrafung scheint ein universelles Menschmerkmal zu sein."
    ),

)
