package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster2(): List<Question> = listOf(

    // --- ROMANEE-CONTI & DOMAINE DE LA ROMANEE-CONTI ---

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welcher Jahrgang der Romanée-Conti erzielte im Oktober 2018 bei Sotheby's in New York den Weltrekordpreis von 558.000 US-Dollar pro Flasche?",
        answerA = "1961",
        answerB = "1978",
        answerC = "1990",
        answerD = "1945",
        correctAnswer = 3,
        explanation = "Die Flasche Romanée-Conti 1945 wurde am 13. Oktober 2018 bei Sotheby's New York fuer 558.000 US-Dollar versteigert — der bis dato hoechste jemals fuer eine 750-ml-Flasche Wein erzielte Preis. Nur wenige Minuten vorher erzielte eine zweite Flasche desselben Jahrgangs noch 496.000 Dollar.",
        difficulty = 5,
        funFact = "Von der Romanée-Conti 1945 wurden insgesamt nur 600 Flaschen produziert. Der Weinberg wurde danach gerodet und mit Phylloxera-resistenten Reben neu bepflanzt — was den Jahrgang zur absoluten Rarität macht."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Wie gross ist der Weinberg der Romanée-Conti in Vosne-Romanée, der als Monopole allein der Domaine de la Romanée-Conti gehoert?",
        answerA = "1,81 Hektar",
        answerB = "4,50 Hektar",
        answerC = "0,85 Hektar",
        answerD = "7,20 Hektar",
        correctAnswer = 0,
        explanation = "Die Lage Romanée-Conti umfasst exakt 1,81 Hektar in Vosne-Romanée im Cote de Nuits, Burgund. Sie gehoert als Monopole ausschliesslich der Domaine de la Romanée-Conti (DRC) und produziert in durchschnittlichen Jahren nur rund 5.500 Flaschen.",
        difficulty = 5,
        funFact = "Der Preis pro Flasche DRC Romanée-Conti liegt bei neuen Jahrgaengen ab Weingut bei etwa 15.000–25.000 Euro — und das, bevor der Sekundaermarkt sie weiter in die Hoehe treibt."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Welche Grand-Cru-Lagen gehoeren NICHT zum Portfolio der Domaine de la Romanée-Conti (DRC)?",
        answerA = "Richebourg und La Tâche",
        answerB = "Chambertin und Clos de Bèze",
        answerC = "Échezeaux und Grands-Échezeaux",
        answerD = "Romanée-Saint-Vivant und Le Montrachet",
        correctAnswer = 1,
        explanation = "Die DRC besitzt Anteile an Romanée-Conti, La Tâche, Richebourg, Romanée-Saint-Vivant, Grands-Échezeaux, Échezeaux und Le Montrachet. Chambertin und Clos de Bèze liegen in Gevrey-Chambertin und gehoeren anderen Produzenten wie Rousseau oder Drouhin.",
        difficulty = 5,
        funFact = "La Tâche ist neben Romanée-Conti das zweite Monopole der DRC und umfasst 6,06 Hektar. Eine Flasche La Tâche eines guten Jahrgangs kostet auf dem Auktionsmarkt oft ueber 3.000 Euro."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte wird fuer die roten Grand-Cru-Weine der Domaine de la Romanée-Conti ausschliesslich verwendet?",
        answerA = "Cabernet Franc",
        answerB = "Gamay",
        answerC = "Merlot",
        answerD = "Pinot Noir",
        correctAnswer = 3,
        explanation = "Die gesamte Rotweinproduktion der DRC basiert auf Pinot Noir — der einzigen zugelassenen roten Rebsorte fuer Burgunder Grand-Cru-Weine. Die Reben des Weinbergs Romanée-Conti sind teilweise ueber 70 Jahre alt, was die Konzentration der Fruechte steigert.",
        difficulty = 5,
        funFact = "Die DRC verzichtet weitgehend auf Herbizide und arbeitet nach biodynamischen Prinzipien. Alle Trauben werden per Hand gelesen und selektiert — maschinelle Ernte ist auf diesen kleinen Grand-Cru-Parzellen schlicht unmoeglich."
    ),

    // --- BORDEAUX GRAND CRU CLASSÉ 1855 ---

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Bei welchem Anlass wurde die beruehmte Bordeaux-Klassifikation von 1855 erstellt, die noch heute fuer den Médoc Gueltigkeit hat?",
        answerA = "Exposition Universelle de Paris unter Napoleon III.",
        answerB = "Kronung von Napoleon III. in Paris",
        answerC = "Gruendung der Weinhändler-Gilde Bordeaux",
        answerD = "Ersten internationalen Weinmesse in London",
        correctAnswer = 0,
        explanation = "Kaiser Napoleon III. beauftragte die Bordeaux-Weinhaendler fuer die Exposition Universelle de Paris 1855, die besten Bordeaux-Weine zu klassifizieren. Die Broecker rangierten die Chateaux nach Reputation und Handelspreis — eine Hierarchie, die sich seither kaum veraendert hat.",
        difficulty = 5,
        funFact = "Die Klassifikation von 1855 wurde seit ihrer Einfuehrung nur ein einziges Mal offiziell veraendert: 1973 wurde Chateau Mouton Rothschild nach Jahrzehnten des Lobbying von Baron Philippe de Rothschild vom Deuxième in den Premier Cru Classé aufgestuft."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welches Château wurde 1973 als einziges in der Geschichte der Bordeaux-Klassifikation von 1855 in den Premier Cru Classé aufgestuft?",
        answerA = "Château Pichon Longueville Comtesse de Lalande",
        answerB = "Château Mouton Rothschild",
        answerC = "Château Léoville Barton",
        answerD = "Château Cos d'Estournel",
        correctAnswer = 1,
        explanation = "Baron Philippe de Rothschild kaempfte jahrzehntelang fuer die Aufstufung von Mouton Rothschild in die erste Klasse. 1973 wurde er schliesslich belohnt — die einzige formale Aenderung der 1855er Klassifikation. Sein beruehmt-beruehmter Kommentar: 'Premier je suis, second je fus, Mouton ne change pas.'",
        difficulty = 5,
        funFact = "Château Mouton Rothschild ist bekannt fuer seine kuenstlerisch gestalteten Etikettensammlungen: Kuenstler wie Picasso, Dali, Warhol und Chagall haben Etiketten fuer bestimmte Jahrgaenge geschaffen."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Welches der fuenf Premiers Crus Classés de 1855 stammt NICHT aus dem Médoc, sondern aus Pessac-Léognan (Graves)?",
        answerA = "Château Lafite Rothschild",
        answerB = "Château Latour",
        answerC = "Château Haut-Brion",
        answerD = "Château Margaux",
        correctAnswer = 2,
        explanation = "Chateau Haut-Brion aus Pessac-Léognan (ehemals Graves) ist das einzige Nicht-Médoc-Chateau unter den fuenf Premiers Crus Classés von 1855. Die anderen vier — Lafite Rothschild, Latour, Margaux und Mouton Rothschild — liegen alle im Médoc.",
        difficulty = 5,
        funFact = "Château Haut-Brion gilt als eines der aeltesten bekannten Weingüter Bordeaux' und wurde bereits im 17. Jahrhundert vom englischen Diarist Samuel Pepys als aussergewoehnlicher Wein erwaehnt."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "In welcher Appellation liegt Château Pétrus, das trotz keiner offiziellen 1855-Klassifikation als eines der teuersten Weine der Welt gilt?",
        answerA = "Saint-Estèphe",
        answerB = "Pomerol",
        answerC = "Saint-Julien",
        answerD = "Saint-Émilion",
        correctAnswer = 1,
        explanation = "Château Pétrus liegt in der Appellation Pomerol, die in der Klassifikation von 1855 nicht beruecksichtigt wurde — Pomerol hat bis heute kein offizielles Klassifikationssystem. Dennoch erzielt Pétrus Preise, die mit den beruehmtesten Grand Crus mithalten oder sie uebertreffen.",
        difficulty = 5,
        funFact = "Pétrus besteht seit 2010 zu 100% aus Merlot und waechst auf einem einzigartigen blauen Tonplateau (Smektit-Ton), das weltweit in dieser Form einmalig ist und dem Wein seine charakteristische Textur und Langlebigkeit verleiht."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welche beiden Châteaux verliessen 2021 freiwillig die Saint-Émilion-Klassifikation Premier Grand Cru Classé A?",
        answerA = "Château Figeac und Château Angélus",
        answerB = "Château Pavie und Château Canon",
        answerC = "Château Valandraud und Château Tertre Roteboeuf",
        answerD = "Château Cheval Blanc und Château Ausone",
        correctAnswer = 3,
        explanation = "Château Cheval Blanc und Château Ausone — die beiden historischen Gruendungsmitglieder des Premier Grand Cru Classé A in Saint-Émilion (Klassifikation von 1955) — zogen sich 2021 aus der Klassifikation zurueck. Begruendung: Die Bewertungskriterien seien nicht laenger mit ihren Grundprinzipien vereinbar.",
        difficulty = 5,
        funFact = "Château Cheval Blanc pflanzt auf seinen 39 Hektar hauptsaechlich Cabernet Franc (52%) an — ungewoehnlich fuer Bordeaux, wo Merlot und Cabernet Sauvignon dominieren. Der beruehnte 1947er Cheval Blanc gilt als einer der legendaersten Weine des 20. Jahrhunderts."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Wie viele Premiers Grands Crus Classés (Premier Cru Classé) sind in der Bordeaux-Klassifikation von 1855 urspruenglich ausgewiesen worden?",
        answerA = "Fuenf — Mouton Rothschild war schon dabei",
        answerB = "Drei",
        answerC = "Vier — Mouton Rothschild war damals noch Second Cru",
        answerD = "Vier",
        correctAnswer = 2,
        explanation = "1855 wurden urspruenglich vier Châteaux als Premier Cru Classé eingestuft: Lafite Rothschild, Latour, Margaux und Haut-Brion. Mouton Rothschild war Second Cru. Erst 1973 wurde Mouton aufgestuft, sodass es seitdem fuenf Premiers Crus gibt.",
        difficulty = 5,
        funFact = "Die Zweiteinteilung (Deuxiemes Crus) umfasst heute 14 Chateaux, darunter klingende Namen wie Cos d'Estournel, Pichon Baron, Léoville Las Cases und Ducru-Beaucaillou."
    ),

    // --- BURGUND GRAND CRU LAGEN ---

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welcher Burgunder Grand Cru gilt als 'König der Weissweingegenden' und produziert den teuersten trockenen Weisswein der Welt?",
        answerA = "Corton-Charlemagne",
        answerB = "Montrachet",
        answerC = "Bâtard-Montrachet",
        answerD = "Chevalier-Montrachet",
        correctAnswer = 1,
        explanation = "Le Montrachet ist der beruehnteste Chardonnay-Grand-Cru in Burgund und gilt als Ursprung der teuersten trockenen Weissweine der Welt. Die Lage liegt auf der Grenze zwischen Puligny-Montrachet und Chassagne-Montrachet und umfasst nur 7,99 Hektar.",
        difficulty = 5,
        funFact = "Alexander Dumas soll gesagt haben, man solle Montrachet nur mit entbloesstem Haupt und auf Knien trinkend geniessen. Die DRC besitzt einen kleinen Anteil am Montrachet, der einige der teuersten Weissweinglaender der Welt produziert."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welches Grand-Cru-Klima in Chambolle-Musigny wird wegen seiner Verbindung von Kraft und Eleganz oft als 'Koenigin des Burgunds' bezeichnet?",
        answerA = "Bonnes-Mares",
        answerB = "Clos de Vougeot",
        answerC = "Le Musigny",
        answerD = "Chambertin",
        correctAnswer = 2,
        explanation = "Le Musigny in Chambolle-Musigny gilt als einer der feinstens Grand Crus Burgunds — oft als 'Koenigin' bezeichnet, waehrend Chambertin den Titel 'Koenig' traegt. Mit nur 10,86 Hektar ist Le Musigny ein kleines aber ungemein prestigetraechtigens Klima fuer Pinot Noir.",
        difficulty = 5,
        funFact = "Nur ein einziger Produzent — der Comte Georges de Voguë — produziert einen winzigen Anteil Weissen Musigny (Chardonnay) aus dieser eigentlich fuer Rotwein bestimmten Lage. Diese Flaschen sind echte Raritaeten."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Welcher Burgunder Grand Cru soll Napoleon Bonapartes Lieblingsrotwein gewesen sein und liegt in Gevrey-Chambertin?",
        answerA = "Nuits-Saint-Georges",
        answerB = "Chambertin",
        answerC = "Vosne-Romanée",
        answerD = "Corton",
        correctAnswer = 1,
        explanation = "Chambertin aus Gevrey-Chambertin war der Lieblingswein von Napoleon Bonaparte, der ihn angeblich auf all seinen Feldzuegen mitfuehrte. Die 12,9 Hektar grosse Lage produziert kraftvolle, strukturierte Pinot Noirs, die als 'Koenig der Burgunderweine' gelten.",
        difficulty = 5,
        funFact = "Nur 23 Produzenten besitzen Anteile am Chambertin. Die renommiertesten sind Rousseau, Leroy und Trapet. Ein Rousseau-Chambertin eines guten Jahrgangs kostet auf dem Auktionsmarkt regelmaessig ueber 1.000 Euro."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Wie viele Grand-Cru-Weinberge gibt es in der gesamen Bourgogne (Burgund)?",
        answerA = "33",
        answerB = "12",
        answerC = "57",
        answerD = "88",
        correctAnswer = 0,
        explanation = "Burgund kennt genau 33 Grand-Cru-Appellationen fuer Stillwein (zzgl. Chablis Grand Crus). Sie machen nur etwa 1,5% der gesamten burgundischen Weinproduktion aus — was ihre Seltenheit und die astronomischen Preise erklaert.",
        difficulty = 5,
        funFact = "Clos de Vougeot ist mit 50,6 Hektar der groesste Burgunder Grand Cru und gehoert ueber 80 verschiedenen Eigentümern — was die Qualitaet der Weine je nach Produzent stark variieren laesst."
    ),

    // --- CHÂTEAU PÉTRUS & POMEROL ---

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welche geologische Besonderheit des Pétrus-Weinbergs verleiht den Weinen ihre einzigartige Tiefe und Struktur?",
        answerA = "Kalksteinplateau mit fossilreichen Austernschalen",
        answerB = "Blaues Smektit-Tonplateau, das vor 40 Millionen Jahren entstand",
        answerC = "Aktives Geothermalgebiet mit erhöhter Bodenwaerme",
        answerD = "Eisenreicher Laterit-Boden aus dem Jura",
        correctAnswer = 1,
        explanation = "Der Boden von Pétrus besteht aus einem einzigartigen blauen Smektit-Ton (sogenannte 'bleu argile'), der sich vor etwa 40 Millionen Jahren bildete. Dieser dichte, wasserretentierende Ton gibt dem Merlot ideale Wachstumsbedingungen und ist weltweit in dieser Form einmalig.",
        difficulty = 5,
        funFact = "Pétrus wird ausschliesslich am Nachmittag gelesen, nachdem der Morgentau abgetrocknet ist — das verhindert Wasserverdunnung im Traubenmost und ist ein Zeichen der extremen Qualitaetskontrolle am Gut."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Wie viele Flaschen produziert Château Pétrus in einem durchschnittlichen Jahr?",
        answerA = "Circa 2.000 Flaschen",
        answerB = "Circa 30.000 Flaschen",
        answerC = "Circa 6.000 Flaschen",
        answerD = "Circa 120.000 Flaschen",
        correctAnswer = 1,
        explanation = "Château Pétrus produziert im Durchschnitt etwa 30.000 Flaschen pro Jahr — was angesichts des Weltrufs des Gutes einer verschwindend kleinen Menge entspricht. In schlechten Jahren oder bei starker Selektion kann die Menge auf unter 20.000 Flaschen sinken.",
        difficulty = 5,
        funFact = "In legendaeren Jahrgaengen wie 1947, 1961 oder 1982 erzielt Pétrus auf Auktionen regelmaessig Preise ueber 10.000 Euro pro Flasche. Der 1961er gilt als einer der besten Weine des 20. Jahrhunderts."
    ),

    // --- WEINAUKTIONEN ---

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Welches Auktionshaus versteigerte 2018 die Rekordflaschen Romanée-Conti 1945 in New York?",
        answerA = "Christie's",
        answerB = "Sotheby's",
        answerC = "Bonhams",
        answerD = "Hart Davis Hart",
        correctAnswer = 1,
        explanation = "Das Auktionshaus Sotheby's versteigerte am 13. Oktober 2018 in New York die beiden Rekord-Flaschen Romanée-Conti 1945 — eine fuer 558.000 US-Dollar, eine zweite wenig spaeter fuer 496.000 US-Dollar. Kaeufer waren ein asiatischer Privatsammler und ein US-amerikanischer Kollektor.",
        difficulty = 5,
        funFact = "Die dreitaegige Sotheby's-Weinauktion in Hongkong erzielte an einem einzigen Tag Weinverkauefe im Wert von 8,4 Millionen US-Dollar — ein Zeichen der enormen Nachfrage nach seltenen Weinen auf dem asiatischen Markt."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Was bezeichnen Weinkenner mit dem Begriff 'En Primeur' (Subskription) bei Bordeaux-Weinen?",
        answerA = "Den Kauf von Wein vor der Flaschenfuellung, typischerweise 18-24 Monate vor Auslieferung",
        answerB = "Weine die ausschliesslich an Premier-Cru-Lagen gefuehrt werden",
        answerC = "Einen Gutachterbesuch im Weingut noch vor der Ernte",
        answerD = "Die Erstklassifizierung eines neuen Jahrgangs durch den Weinrat",
        correctAnswer = 0,
        explanation = "En Primeur (oder 'Subskription') bezeichnet den Vorverkauf von Bordeaux-Weinen direkt nach der Ernte — also noch im Fass, bevor sie gefuellt und ausgeliefert werden. Kaeufer erhalten die Weine 18 bis 24 Monate spaeter. Die Preisersparnis kann 25 bis 50% betragen.",
        difficulty = 5,
        funFact = "Beim en-Primeur-Kauf des aussergewoehnlichen Bordeaux-Jahrgangs 2009 zahlten Subskribenten fuer Château Petrus noch 2.500 Euro pro Flasche — derselbe Wein wechselte auf dem Sekundaermarkt spaeter fuer das Dreifache den Besitzer."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Welche weinhistorische Auktionssammlung wurde bei Christie's New York fuer den Rekordpreis von 28,8 Millionen US-Dollar als einzelne private Kollektion versteigert?",
        answerA = "Die Weinsammlung von Baron Eric de Rothschild",
        answerB = "Die Weinsammlung von Berry Bros. & Rudd London",
        answerC = "Die Weinsammlung des Herzogs von Windsor",
        answerD = "Die Weinsammlung des US-Amerikaners William Koch",
        correctAnswer = 3,
        explanation = "Die Weinsammlung des amerikanischen Industriellen und Seglers William Koch wurde bei Christie's Rockefeller Center in New York fuer 28,8 Millionen US-Dollar versteigert — der hoechste je in Nordamerika fuer eine Weinkollektion aus einzelnem Privatbesitz erzielte Preis.",
        difficulty = 5,
        funFact = "William Koch war auch in einen aufsehenerregenden Weinbetrug verwickelt: Er klagte mehrere Haendler wegen gefaelschter Raritaetsweine — ein Problem, das den Markt fuer seltene Weine bis heute begleitet."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welche Flaschengrösse nennt man 'Jeroboam' bei Bordeaux-Weinen und wie viel Liter fasst sie?",
        answerA = "1,5 Liter (Doppelflasche / Magnum)",
        answerB = "4,5 Liter",
        answerC = "6 Liter",
        answerD = "3 Liter",
        correctAnswer = 3,
        explanation = "Bei Bordeaux-Weinen bezeichnet 'Jeroboam' eine Flasche mit 3 Litern Inhalt (entspricht 4 Standardflaschen). In Burgund wird dasselbe Format 'Double Magnum' genannt. Groessere Formate (Methusalem = 6 Liter, Balthazar = 12 Liter, Nebukadnezar = 15 Liter) sind bei Auktionen besonders begehrt.",
        difficulty = 5,
        funFact = "Grosse Flaschen reifen langsamer und gleichmaessiger als kleine, da das Verhaeltnis von Weinvolumen zu Korkgroesse guenstiger ist. Ein Magnum eines guten Bordeaux-Jahrgangs kann bei einer Auktion das Doppelte des Preises zweier Standardflaschen erzielen."
    ),

    // --- SCREAMING EAGLE & AMERIKANISCHE KULTWEINE ---

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Welcher kalifornische Kultwein aus dem Napa Valley wurde auf einer Auktion fuer 500.000 US-Dollar fuer eine einzelne Grossflasche (6 Liter) des Jahrgangs 1992 versteigert?",
        answerA = "Harlan Estate",
        answerB = "Screaming Eagle",
        answerC = "Opus One",
        answerD = "Bryant Family Vineyard",
        correctAnswer = 1,
        explanation = "Eine 6-Liter-Flasche Screaming Eagle Cabernet Sauvignon 1992 wurde fuer 500.000 US-Dollar versteigert. Screaming Eagle aus Oakville/Napa Valley produziert nur etwa 500 bis 800 Kisten jaehrlich, was die Weine zu absoluten Raritaeten auf dem Auktionsmarkt macht.",
        difficulty = 5,
        funFact = "Screaming Eagle wurde 1992 von Jean Phillips gegruendet und 2006 an eine Investorengruppe verkauft. Die Mailingliste fuer den Direktkauf hat eine Wartezeit von mehreren Jahrzehnten — die meisten Sammler kommen nie an den Wein."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welches amerikanische Gemeinschaftsprojekt zweier Weinlegenden — Robert Mondavi und Baron Philippe de Rothschild — produziert seit 1979 einen der bekanntesten Premium-Weine Kaliforniens?",
        answerA = "Dominus Estate",
        answerB = "Stag's Leap Wine Cellars",
        answerC = "Opus One",
        answerD = "Ridge Monte Bello",
        correctAnswer = 2,
        explanation = "Opus One ist ein Joint Venture zwischen Robert Mondavi (Napa Valley) und Baron Philippe de Rothschild (Mouton Rothschild, Bordeaux), das 1979 gegruendet wurde. Der erste Jahrgang erschien 1979. Opus One ist ein Bordeaux-Stil-Wein aus Napa Valley und gilt als Bruckenschlag zwischen Old und New World.",
        difficulty = 5,
        funFact = "Der Jahrgang 1979 von Opus One wurde als erster kommerzieller Jahrgang veroeffentlicht, aber erst 1984 offiziell vorgestellt. Eine Flasche des ersten Jahrgangs erzielt heute auf Auktionen regelmaessig 2.000 bis 5.000 Euro."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welcher Napa-Valley-Produzent erzielte bei einer Auktion 700.000 US-Dollar fuer ein Vertikal von 10 Jahrgaengen in Magnum-Formaten von 1987 bis 1996?",
        answerA = "Harlan Estate",
        answerB = "Screaming Eagle",
        answerC = "Dalla Valle",
        answerD = "Colgin Cellars",
        correctAnswer = 0,
        explanation = "Harlan Estate aus Oakville, Napa Valley, erzielte auf einer Napa Valley Wine Auction 700.000 US-Dollar fuer ein Vertikal von 10 Jahrgaengen in Magnum-Format (1987–1996). Harlan Estate gilt als einer der 'Cult Wines' des Napa Valley mit nur etwa 2.000 Kisten Jahresproduktion.",
        difficulty = 5,
        funFact = "Bill Harlan, Gruender von Harlan Estate, erklaerte seine Ambition, einen 'First Growth of California' zu schaffen. Winemaker Bob Levy arbeitete jahrzehntelang mit ihm zusammen, um dieses Ziel zu erreichen."
    ),

    // --- WEIN-RARITÄTEN & LEGENDARISCHE JAHRGÄNGE ---

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welcher Bordeaux-Jahrgang gilt unter Sammlern und Kritikern als 'Wein des Jahrhunderts' und liess den Robert Parker Score von 100 Punkten zur Pflicht werden?",
        answerA = "1961",
        answerB = "1982",
        answerC = "1975",
        answerD = "1990",
        correctAnswer = 1,
        explanation = "Der Bordeaux-Jahrgang 1982 gilt als revolutionaer: Robert Parker vergab massenhaft 100-Punkte-Bewertungen und legte damit den Grundstein fuer den internationalen Einfluss seiner Publikation. Weinpreise explodierten, und der Jahrgang loeste weltweit einen Boom fuer Bordeaux-Sammlerweine aus.",
        difficulty = 5,
        funFact = "Parker hatte den Bordeaux 1982 als einziger grosser Kritiker herausgehoben, als die meisten seiner Kollegen den Jahrgang unterschaetzten. Diese Weitsicht machte ihn zum einflussreichsten Weinkritiker der Welt."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'First Growth' (Premier Cru) und 'Grand Cru' in der Burgunder Weinsprache?",
        answerA = "Es gibt keinen Unterschied — beide Begriffe sind Synonyme",
        answerB = "Grand Cru bezeichnet ausschliesslich Chardonnay-Lagen, Premier Cru nur Pinot-Noir",
        answerC = "Premier Cru ist in Burgund hoeher eingestuft als Grand Cru",
        answerD = "Premier Cru ist eine Lage unterhalb Grand Cru, aber ueber Village-Wein",
        correctAnswer = 3,
        explanation = "In Burgund gibt es vier Qualitatsstufen: Bourgogne Regional, Village (z.B. Gevrey-Chambertin), Premier Cru und — an der Spitze — Grand Cru. Premier Cru bezeichnet also eine hochklassige, aber nicht ganz hoechste Lage. In Bordeaux bedeutet 'Premier Grand Cru Classé' dagegen die hoechste Klassifikationsstufe.",
        difficulty = 5,
        funFact = "In Burgund gibt es rund 560 Premier-Cru-Lagen aber nur 33 Grand-Cru-Appellationen fuer Stillwein. Ein Village-Wein von Chambolle-Musigny kann trotzdem teuer sein — der Name des Dorfes allein ist schon ein Qualitaetssignal."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welcher legendaere Weinkritiker praegte mit seiner 100-Punkte-Skala massgeblich den internationalen Weinmarkt und trieb die Preise fuer Raritaeten in die Hoehe?",
        answerA = "Jancis Robinson",
        answerB = "Robert Parker Jr.",
        answerC = "Hugh Johnson",
        answerD = "Michael Broadbent",
        correctAnswer = 1,
        explanation = "Robert M. Parker Jr. einfuehrte die 100-Punkte-Bewertungsskala und seine Publikation 'The Wine Advocate' dominierte jahrzehntelang den internationalen Feinweinmarkt. Ein 'Parker 100' fuer einen Bordeaux konnte den Preis quasi ueber Nacht verdoppeln oder verdreifachen.",
        difficulty = 5,
        funFact = "Parker verzichtete auf Anzeigeneinnahmen in seiner Publikation, um Unabhaengigkeit zu signalisieren — ein Novum in der Weinkritik. Produzenten, die er hochbewertete, erlebten sogenannte 'Parker-Scores-Effekte', bei denen ihre Weinpreise schlagartig stiegen."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welcher Champagner-Jahrgang von Perrier-Jouët aus dem Jahr 1874 erzielte bei Christie's einen Rekordpreis von 40.000 Euro?",
        answerA = "Perrier-Jouët Blanc de Blancs 1874",
        answerB = "Perrier-Jouët Belle Epoque 1874",
        answerC = "Perrier-Jouët Grand Brut 1874",
        answerD = "Perrier-Jouët Cuvée Prestige 1874",
        correctAnswer = 0,
        explanation = "Eine Flasche Perrier-Jouët Blanc de Blancs 1874 erzielte bei Christie's den Rekordpreis von 40.000 Euro — die teuerste bei Christie's jemals versteigerte Champagnerflasche. Das Alter von fast 150 Jahren und die perfekte Erhaltung machten diese Flasche zur Sensation.",
        difficulty = 5,
        funFact = "Champagner kann unter idealen Lagerbedingungen (konstante Kuehle, Dunkelheit, hohe Luftfeuchtigkeit) ueber ein Jahrhundert und laenger reifen. Besonders grosse Flaschenformate altern noch langsamer als Standardflaschen."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Wie nennt man das Phaenomen, bei dem ein Wein nach Jahren der Reife eine Phase scheinbarer Geschlossenheit und Undurchdringlichkeit durchlaeuft, bevor er sich wieder oeffnet?",
        answerA = "Bouquet-Kollaps",
        answerB = "Tanninaggression",
        answerC = "Oxidationsplateau",
        answerD = "Dumb Phase (stumme Phase)",
        correctAnswer = 3,
        explanation = "Die 'Dumb Phase' (auch 'stumme Phase') bezeichnet eine Entwicklungsphase eines reifen Weines, in der er sich sensorisch verschliesst — wenig Aroma, harte Tannine, ungastliche Textur. Diese Phase kann Jahre dauern und ist ein bekanntes Phaenomen bei grossen Burgunder- und Bordeaux-Weinen.",
        difficulty = 5,
        funFact = "Erfahrene Sammler beobachten ihre reifen Weine genau und versuchen, die stumme Phase zu ueberbruecken. Bei der Romanée-Conti kann diese Phase bei jungen Jahrgaengen (5-15 Jahre) sehr ausgepraegt sein, bevor sich der Wein mit 20-30 Jahren entfaltet."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter einem 'Vertical Tasting' bei seltenen Weinen auf Auktionen?",
        answerA = "Weinproben, bei denen Weine stehend verkostet werden",
        answerB = "Probe verschiedener Erzeuger desselben Jahrgangs nebeneinander",
        answerC = "Probe mehrerer aufeinanderfolgender Jahrgaenge desselben Weines",
        answerD = "Vertikale Lagerung als Standard fuer Raritaeten",
        correctAnswer = 2,
        explanation = "Ein 'Vertical Tasting' bezeichnet die Verkostung mehrerer aufeinanderfolgender Jahrgaenge desselben Weines vom selben Gut — z.B. Pétrus 2000, 2005, 2009, 2010, 2015, 2019. Diese Proben zeigen den Einfluss der Jahrgaenge auf einen Wein und sind bei Auktionen als Lot besonders begehrt.",
        difficulty = 5,
        funFact = "Das Gegenteil — ein 'Horizontal Tasting' — ist die Probe verschiedener Erzeuger desselben Jahrgangs. Das beruehnte 'Judgement of Paris' 1976 war ein solches horizontales Tasting, bei dem Kalifornien-Weine franzoesische Premier Crus schlugen."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Ullage' bei alten Weinflaschen, der den Wert einer Raritaet auf Auktionen stark beeinflusst?",
        answerA = "Die Farbe der Kapsel",
        answerB = "Das Gewicht der Flasche",
        answerC = "Den Jahrgang-Aufdruck auf dem Korken",
        answerD = "Den Abstand zwischen Weinoberflaechee und Flaschenhals (Leerraum)",
        correctAnswer = 3,
        explanation = "Der 'Ullage' bezeichnet den Leerraum zwischen Weinspiegel und Flaschenhals, der durch Verdunstung ueber Jahrzehnte entsteht. Bei alten Weinen ist ein geringer Ullage ein Zeichen guter Lagerung. Grosse Ullage kann auf Korkfehler oder schlechte Lagerung hindeuten und mindert den Auktionswert erheblich.",
        difficulty = 5,
        funFact = "Auktionshaeuser klassifizieren Ullage-Grade von 'Into Neck' (ideal) bis 'Low Shoulder' (problematisch). Ein Romanée-Conti 1945 mit perfektem Ullage war ein wesentlicher Faktor fuer den Rekordpreis von 558.000 Dollar."
    ),

    // --- WEITERE BERÜHMTE LAGEN & PRODUZENTEN ---

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welches Weingut in Pomerol produziert den legendaeren 'Le Pin' — einen der seltensten und teuersten Weine der Welt mit einer Jahresproduktion von nur circa 700 Kisten?",
        answerA = "Familie Labruyere",
        answerB = "Familie Thienpont",
        answerC = "Familie Moueix",
        answerD = "Familie Guichard",
        correctAnswer = 1,
        explanation = "Le Pin in Pomerol gehoert der belgischen Familie Thienpont und wurde 1979 von Jacques Thienpont gegruendet. Mit nur etwa 700 Kisten Jahresproduktion (circa 8.400 Flaschen) ist Le Pin noch seltener als Pétrus und erzielt regelmaessig Preise von 3.000 bis 8.000 Euro pro Flasche.",
        difficulty = 5,
        funFact = "Le Pin besteht zu 100% aus Merlot und laesst sich wegen seiner Weichheit, Opulenz und dem verführerischen Duft oft in jungem Alter trinken. Dennoch entwickelt er sich ueber Jahrzehnte weiter — ein seltenes Privileg guenstiger Jahrgaenge."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Welcher burgunderische Produzent gilt als die 'Koenigin des Burgunds' und war bis zu seinem Tod 2006 die einflussreichste Weinpersoenlichkeit Frankreichs?",
        answerA = "Lalou Bize-Leroy von Domaine Leroy",
        answerB = "Anne-Claude Leflaive von Domaine Leflaive",
        answerC = "Madame Boisset von Louis Jadot",
        answerD = "Christiane Roumier von Domaine Roumier",
        correctAnswer = 0,
        explanation = "Lalou Bize-Leroy ist die Gruenderin der Domaine Leroy in Vosne-Romanée und galt als eine der einflussreichsten Weinpersoenlichkeiten Frankreichs. Ihre biodynamisch bewirtschafteten Grand-Cru-Weine zaehlen zu den teuersten der Welt — ein Leroy Musigny kann 20.000 Euro und mehr kosten.",
        difficulty = 5,
        funFact = "Lalou Bize-Leroy war zuvor Teilhaberin der DRC und flog nach einem Streit ueber die Geschaeftspolitik raus. Daraufhin gruendete sie 1988 die Domaine Leroy — und schuf ein Weingut, das heute ebenbuertig mit der DRC gilt."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Welcher Wein des Rhône-Tals gilt als der edelste Syrah der Welt und produziert nur wenige tausend Flaschen jaehrlich aus einer uralten Einzellage?",
        answerA = "Châteauneuf-du-Pape von Chateau Rayas",
        answerB = "La Landonne von Guigal",
        answerC = "La Turque von Guigal",
        answerD = "Hermitage La Chapelle von Jaboulet",
        correctAnswer = 3,
        explanation = "Hermitage La Chapelle von Paul Jaboulet Ainé gilt als einer der legendaersten Weine der nördlichen Rhône — insbesondere der Jahrgang 1961, der regelmaessig als einer der zehn besten Weine des 20. Jahrhunderts genannt wird. Hermitage ist das bekannteste Grand Cru-Equivalent der Rhône fuer Syrah.",
        difficulty = 5,
        funFact = "Guigals Einzellagen-Côte-Rôties (La Mouline, La Landonne, La Turque) sind ebenfalls Rhône-Raritaeten und koennen auf Auktionen 1.000 bis 3.000 Euro pro Flasche erzielen. Sie werden nur in Ausnahme-Jahrgaengen produziert."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man im Weinhandel als 'OWC' (Original Wooden Case), und warum steigert dieser Status den Auktionswert?",
        answerA = "Offizielles Wuerdigungszertifikat des Weinmuseums",
        answerB = "Spezielle Holzverpackung fuer Magnum-Formate",
        answerC = "Original-Zertifikat des Winzers mit Unterschrift",
        answerD = "Originalholzkiste des Weinguts, unveroeffnet — Beweis fuer ungeoeffnete, original verpackte Ware",
        correctAnswer = 3,
        explanation = "OWC steht fuer 'Original Wooden Case' — die originalverschlossene Holzkiste des Weinguts, in der die Flaschen unmittelbar nach der Abfuellung verschickt wurden. OWC ist bei Auktionen ein wichtiges Qualitaets- und Provenienz-Zeichen, das den Wert deutlich steigert, da es lueckenlose Lagergeschichte belegt.",
        difficulty = 5,
        funFact = "Neben OWC gibt es OC (Original Carton fuer Pappschachteln) und IB (In Bond = unverzollt im Zolllager). Weine in IB-Status sind steuerlich im Schwebezustand und werden oft direkt von Investoren gehandelt, ohne je die Zollgrenze zu ueberschreiten."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welcher Jahrgang gilt bei Château Lafite Rothschild als einer der teuersten und legendaersten, angetrieben auch durch die enorme Nachfrage aus China?",
        answerA = "1982",
        answerB = "1995",
        answerC = "2003",
        answerD = "2010",
        correctAnswer = 0,
        explanation = "Der 1982er Château Lafite Rothschild gilt als einer der begehrtesten und teuersten Weine der Welt. Die chinesische Nachfrage liess die Preise in den 2000er und 2010er Jahren explodieren — eine Flasche konnte auf dem Sekundaermarkt ueber 5.000 Euro erreichen. Parker vergab dem Wein 100 Punkte.",
        difficulty = 5,
        funFact = "Chateau Lafite Rothschild gehoert seit 1868 der Familie Rothschild (Bankenhaus) und besitzt 103 Hektar in Pauillac. Der Jahrgang 1982 wurde zu einem globalen Symbol fuer Weinluxus und Prestige, besonders in Asien."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Welche bedeutende Weinmesse in Hongkong etablierte sich als wichtigster Handelsplatz fuer asiatische Weinkollektoren und ist Auktionsort fuer viele Weltrekordpreise?",
        answerA = "Vinexpo Asia-Pacific",
        answerB = "ProWein Hongkong",
        answerC = "Wine & Dine Festival Hongkong",
        answerD = "Hong Kong International Wine & Spirit Fair",
        correctAnswer = 3,
        explanation = "Die Hong Kong International Wine & Spirit Fair ist Asiens groesste Weinmesse und machte Hongkong nach Abschaffung der Weinsteuer 2008 zum groessten Weinauktionsmarkt der Welt. Sotheby's und Christie's eroeffneten dort bedeutende Niederlassungen und versteigern regelmaessig Weltrekordlose.",
        difficulty = 5,
        funFact = "Hongkong uebernahm nach der Steuerbefreiung von 2008 New York und London als weltweit groessten Weinauktionsstandort. Dieser Wandel beschleunigte die globale Preisexplosion fuer Top-Bordeaux und Burgunder erheblich."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Provenienz' in der Weinauktionswelt, und warum ist sie so entscheidend fuer den Wert eines Raritaeten-Weines?",
        answerA = "Die chemische Analyse eines Weines im Labor",
        answerB = "Den Produktionsort und die Rebsorte",
        answerC = "Die lueckenlose dokumentierte Lagergeschichte eines Weines von der Quelle bis zum Auktionsblock",
        answerD = "Das Gutachten eines zertifizierten Sommelier-Meisters",
        correctAnswer = 2,
        explanation = "Provenienz bezeichnet die vollstaendig nachweisbare Herkunfts- und Lagerungsgeschichte eines Weines. Bei teuren Raritaeten ist sie entscheidend, um Faelschungen auszuschliessen und ideale Lagerbedingungen (konstante Temperatur, Dunkelheit, Luftfeuchtigkeit) zu beweisen. Lueckenlose Provenienz kann den Auktionswert verdoppeln.",
        difficulty = 5,
        funFact = "Weinbetrug ist ein millionenschweres Problem: Der bekannteste Fall ist Rudy Kurniawan, der Flaschenetiketten renommierter Raritaeten faelschte und Jahrzehnte lang erfolgreich verkaufte, bis er 2013 in den USA verurteilt wurde."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Wie nennt man einen Wein, der ausschliesslich von einer einzigen Lage (ohne Verschnitt mit anderen Lagen) stammt — ein Begriff, der bei Burgunder-Raritaeten besonders wichtig ist?",
        answerA = "Monopole",
        answerB = "Lieu-dit",
        answerC = "Climat",
        answerD = "Clos",
        correctAnswer = 2,
        explanation = "Ein 'Climat' ist in Burgund der Begriff fuer eine exakt abgegrenzte, historisch gewachsene Einzellage mit eigenem Mikro-Klima und Bodencharakter. 2015 wurden die Burgundischen Climata von der UNESCO als Weltkulturerbe eingetragen — eine Anerkennung der einzigartigen Lagekultur.",
        difficulty = 5,
        funFact = "Burgund hat ueber 1.200 offiziell anerkannte Klimata. Jedes einzelne kann gesetzlich auf dem Etikett stehen — und je nach Ruf des Klimats kann der Preisunterschied zwischen benachbarten Lagen einer Gemeinde 10-fach oder mehr betragen."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welche einzigartige Eigenschaft zeichnet einen Monopole-Wein wie Romanée-Conti oder La Tâche aus?",
        answerA = "Ausschliesslicher Anbau alter Reben (ueber 100 Jahre)",
        answerB = "Produktion nur in besonderen Jahrgaengen",
        answerC = "Der gesamte Weinberg gehoert einem einzigen Eigentümer",
        answerD = "Exklusiver Verkauf ueber Auktionen ohne Haendlerzwischenstufe",
        correctAnswer = 2,
        explanation = "Ein Monopole-Weinberg gehoert vollstaendig einem einzigen Eigentümer — ohne Aufteilung auf mehrere Winzer. Romanée-Conti (1,81 ha) und La Tâche (6,06 ha) sind die bekanntesten Monopoles der DRC. Dies ist in Burgund mit seiner historisch kleinteiligen Erbteilung eine absolute Ausnahme.",
        difficulty = 5,
        funFact = "In Burgund gibt es nur sehr wenige Monopoles. Das groesste bekannte ist Clos de Tart (7,53 ha) in Morey-Saint-Denis, das bis 2018 Familie Mommessin gehoerte und seither im Besitz der Pinault-Familie ist."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welcher beruehmte italieanische 'Super Tuscan' eroeffnete 1968 die moderne aera der hochklassigen Nicht-DOC-Weine Italiens und erzielt heute Weltklasse-Auktionspreise?",
        answerA = "Sassicaia von Tenuta San Guido",
        answerB = "Ornellaia von Frescobaldi",
        answerC = "Tignanello von Antinori",
        answerD = "Masseto von Lodovico Antinori",
        correctAnswer = 0,
        explanation = "Sassicaia von Tenuta San Guido (Marchese Incisa della Rocchetta) ist der Uroater der Super Tuscans. Zuerst 1968 offiziell veroeffentlicht, war er ein Tafelwein (Vino da Tavola) aus Cabernet Sauvignon und Cabernet Franc, da DOC-Regeln andere Rebsorten nicht erlaubten. 1994 bekam er eine eigene DOC-Anerkennung.",
        difficulty = 5,
        funFact = "Sassicaia 1985 wurde bei einem Wine Spectator-Tasting 1994 als bester Cabernet Sauvignon der Welt eingestuft. Diese Bewertung kaeierte den Preis und machte Super Tuscans weltweit begehrt."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man im Weinhandel als 'Parker Effect' oder 'Parker-Punkt-Effekt'?",
        answerA = "Den Preisanstieg eines Weines nach einer Hochbewertung durch den Kritiker Robert Parker",
        answerB = "Die Abkehr von klassischen Bordeaux-Stilen hin zu kraftvolleren Weinen",
        answerC = "Die Standardisierung von Weinbeschreibungen auf einer 100-Punkte-Skala",
        answerD = "Den Auktionsbonus fuer in-Bond gelagerte Weine",
        correctAnswer = 0,
        explanation = "Der 'Parker Effect' beschreibt das direkte wirtschaftliche Phaenomen, bei dem ein hoher Parker-Score — insbesondere 95-100 Punkte — den Verkaufspreis eines Weines innerhalb kurzer Zeit erheblich steigert. Weine, die Parker 100 Punkte vergab, konnten binnen Tagen das Doppelte oder Dreifache kosten.",
        difficulty = 5,
        funFact = "Schätzungen zufolge beeinflusste Robert Parker mit seiner Publikation Wine Advocate direkt Weinkaeufentscheidungen im Wert von mehreren Milliarden Dollar jaehrlich. Produzenten passten sogar ihren Weinbaustil an seine Vorlieben an — ein Phaenomen, das als 'Parkerisation' bekannt wurde."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte dominiert die Premium-Weissweineproduktion in Burgund und wird fuer alle weissen Grand-Cru-Weine wie Montrachet und Corton-Charlemagne verwendet?",
        answerA = "Viognier",
        answerB = "Sauvignon Blanc",
        answerC = "Chardonnay",
        answerD = "Roussanne",
        correctAnswer = 2,
        explanation = "Chardonnay ist die einzige fuer weisse Grand-Cru-Weine in der Cote de Beaune zugelassene Rebsorte. Sie ist verantwortlich fuer Weltklasse-Weissweine wie Montrachet, Chevalier-Montrachet, Batard-Montrachet und Corton-Charlemagne. Burgundischer Chardonnay gilt als Massstab aller anderen Chardonnays weltweit.",
        difficulty = 5,
        funFact = "Chardonnay in Burgund wird ueblicherweise in neuen Eichenfaessern vergoren und ausgebaut — ein Prozess, der den Weinen Komplexitaet, Cremigkeit und Vanille-Noten verleiht. Die besten Produzenten wie DRC, Domaine Leflaive oder Coche-Dury erzielen mit ihren Weissweinen fuenf- bis sechsstellige Preise auf Auktionen."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Welcher legendaere Wein aus dem Piemonte gilt als 'König der Weine' Italiens und braucht oft 20 bis 30 Jahre Reife fuer seine optimale Entwicklung?",
        answerA = "Barolo",
        answerB = "Barbaresco",
        answerC = "Brunello di Montalcino",
        answerD = "Amarone della Valpolicella",
        correctAnswer = 0,
        explanation = "Barolo aus dem Piemonte, aus 100% Nebbiolo-Trauben, gilt als 'Koenig der Weine, Wein der Koenige'. Grosse Produzenten wie Giacomo Conterno, Bruno Giacosa oder Barolo Falletto produzieren Weine, die Jahrzehnte der Reife brauchen und auf Auktionen Tausende Euro erzielen.",
        difficulty = 5,
        funFact = "Der 'Barolo-Krieg' der 1970er und 1980er Jahre war ein Streit zwischen Traditionalisten (lange Mazerationszeiten, alte grosse Faesser) und Modernisten (kurze Mazeration, neue Barriques). Heute gilt eine Synthese beider Ansaetze als hoechste Kunst."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welches Weinformat fasst 12 Liter — entsprechend 16 Standardflaschen — und traegt den Namen eines babylonischen Koenigs?",
        answerA = "Balthazar (12 Liter)",
        answerB = "Nebukadnezar (15 Liter)",
        answerC = "Methusalem (6 Liter)",
        answerD = "Salmanazar (9 Liter)",
        correctAnswer = 0,
        explanation = "Das Balthazar-Format fasst 12 Liter (16 Standardflaschen) und ist nach dem babylonischen Koenig benannt. Grosse Flaschenformate werden bei Auktionen hoch geschaetzt, da Wein darin langsamer und gleichmaessiger reift. Ein Balthazar eines Premier Crus kann das Zehnfache des Preises von 16 Einzelflaschen erzielen.",
        difficulty = 5,
        funFact = "Das groesste kommerziell produzierte Champagnerformat ist der Midas (30 Liter = 40 Flaschen), der von Armand de Brignac hergestellt wird. Ein solches Bottle wurde fuer ueber 200.000 Dollar versteigert."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Begriff 'Terroir' im Zusammenhang mit Grand-Cru-Weinen?",
        answerA = "Ausschliesslich den Bodentyp eines Weinbergs",
        answerB = "Die genetische Beschaffenheit der Rebsorte",
        answerC = "Das Alter der Rebstöcke eines Weinbergs",
        answerD = "Die Gesamtheit von Boden, Klima, Exposition, Mikroklima und menschlichen Einfluss auf einen Weinberg",
        correctAnswer = 3,
        explanation = "Terroir bezeichnet im franzoesischen Weinverstaendnis das Gesamtkonzept aller natuerlichen und menschlichen Faktoren, die einem Wein seinen einzigartigen Charakter verleihen: Boden, Untergrund, Hangneigung, Exposition, Mikro- und Makroklima sowie die langjaehrige Tradition des Winzers.",
        difficulty = 5,
        funFact = "Das Konzept des Terroirs ist ein Alleinstellungsmerkmal franzoesischer Weinkultur und der philosophische Kern der Appellation d'Origine Controlée (AOC). Es erklaert, warum ein Weinberg von wenigen Metern Breite einen fundamental anderen Wein produziert als sein Nachbar."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welcher historische Weinskandal erschuetterte 1985 Oesterreich, als man feststellte, dass manche Produzenten Diethylenglykol (Frostschutzmittel) beimischten?",
        answerA = "Oesterreichischer Glykolwein-Skandal",
        answerB = "Wiener Weinskandal 1985",
        answerC = "Burgenlaender Falsch-Praedikats-Affaere",
        answerD = "Neusiedlersee-Betrugsfall",
        correctAnswer = 0,
        explanation = "Der oesterreichische Glykolwein-Skandal 1985 erschuetterte die europaeische Weinwelt: Mehrere oesterreichische Produzenten hatten Trockenbeerenauslesen und Spaetlesen illegal mit Diethylenglykol verduennt, um Koerper und Suessung zu erhoehen. Obwohl niemand zu Schaden kam, zerstoerte der Skandal den Ruf der oesterreichischen Weinbranche fuer Jahre.",
        difficulty = 5,
        funFact = "Paradoxerweise fuehrte der Glykolskandal langfristig zu einem Qualitaetsschub: Oesterreich einfuehrte eines der strengsten Weingesetze der Welt und etablierte sich seitdem als Hersteller hochklassiger Weissweine (insbesondere Gruener Veltliner und Riesling)."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Wie nennt man den Prozess, bei dem ein junger Rotwein bewusst mit kleinen Mengen eines herausragenden alten Jahrgangs 'aufgebessert' wurde — eine in Bordeaux frueherer Jahrzehnte verbreitete, heute verbotene Praxis?",
        answerA = "Coupage (Verschnitt mit anderen Rebsorten)",
        answerB = "Chaptalisation (Zuckerzusatz vor Gaerung)",
        answerC = "Hermitage (Beimischung von starkem Rhone-Wein)",
        answerD = "Vinage (Auffuellung mit Weingeist)",
        correctAnswer = 2,
        explanation = "Als 'Hermitage' (oder 'to Hermitage') bezeichnete man im 19. und fruehen 20. Jahrhundert in Bordeaux die Praxis, dünne oder saure Jahrgaenge mit kraftigem Rotwein aus Hermitage (nördliche Rhone) zu verbessern. Bekannte Haeuser wie Latour und Lafite sollen diese Praxis bis Mitte des 20. Jahrhunderts praktiziert haben.",
        difficulty = 5,
        funFact = "Das Hermitage der nördlichen Rhone galt historisch als der kraftvollste Wein Frankreichs und wurde als 'Korrekturmittel' fuer schwache Bordeaux-Jahrgaenge benutzt. Heute ist jede Form von Gebietsverschnitt streng verboten."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Welcher Weisswein aus dem Elsass gilt als langlebigster trockener Weisswein Frankreichs und erzielt bei grossen Jahrgaengen auf Auktionen Preise vergleichbar mit Burgunder Grand Crus?",
        answerA = "Gewurztraminer Vendanges Tardives",
        answerB = "Tokay Pinot Gris SGN",
        answerC = "Riesling Grand Cru",
        answerD = "Muscadet Sevre-et-Maine Sur Lie",
        correctAnswer = 2,
        explanation = "Elsaessischer Riesling Grand Cru — insbesondere von Lagen wie Schlossberg, Rangen oder Clos Sainte-Hune (Trimbach) — gilt als einer der langlebigsten trockenen Weissweine der Welt. In grossen Jahrgaengen entwickelt er sich ueber 30 bis 50 Jahre und erzielt auf Auktionen Preise von mehreren Hundert bis Tausend Euro.",
        difficulty = 5,
        funFact = "Trimbachs Clos Sainte-Hune ist ein 1,67-Hektar-Monopole im Grand-Cru-Rosacker und produziert nur ca. 8.000 Flaschen pro Jahr. Er gilt als einer der wenigen deutschen/elsaessischen Weine, der mit Burgunder Grand Crus konkurrieren kann."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Welches ungarische Suesswein-Wunderwerk aus der Tokaj-Region galt jahrhundertelang als 'Wein der Koenige und Koenig der Weine' und wurde von russischen Zaren gesammelt?",
        answerA = "Tokaj Furmint Trocken",
        answerB = "Aszú 6 Puttonyos",
        answerC = "Szamorodni Edes",
        answerD = "Tokaj Essencia",
        correctAnswer = 3,
        explanation = "Tokaj Essencia ist die Urform des Tokaj-Suessweins — ausfliessender Saft botrytisierter Beeren ohne Pressung, der jahrzehntelang reifen kann und weniger als 2% Alkohol hat. Russische Zaren hielten in Tokaj eigene Gueter und Wachsoldaten. Eine alte Flasche Essencia gilt als eine der seltensten Weinraritaeten der Welt.",
        difficulty = 5,
        funFact = "Tokaj Essencia kann ueber 200 g/l Restzucker enthalten — das Vielfache normaler Spaetlesen. Er faerbt sich tiefgolden bis braun und entwickelt einen Duft nach Aprikose, Karamell und Safran. Alte Jahrgaenge (19. Jahrhundert) wurden schon fuer Zehntausende Euro pro Flasche verkauft."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Botrytis cinerea' im Zusammenhang mit edelsüssen Weinraritaeten wie Sauternes, Tokaj oder Trockenbeerenauslese?",
        answerA = "Eine durch Pilzbefall verursachte Rebkrankheit, die als Edelmauke stets vernichtet werden muss",
        answerB = "Ein Gaerungshemmer, der natiuerliche Restsüsse im Wein erhaelt",
        answerC = "Ein Edelfaule-Pilz, der Trauben eintrocknen laesst und den Zucker konzentriert",
        answerD = "Eine Rebsortenbezeichnung fuer die Sauternes-Region",
        correctAnswer = 2,
        explanation = "Botrytis cinerea ist ein Schlauchpilz, der unter bestimmten Bedingungen (feuchte Morgen, trockene Nachmittage) die 'Edelfaule' (Pourriture Noble) ausloest. Der Pilz durchloechert die Beerenhaut, das Wasser verdunstet, Zucker und Inhaltsstoffe werden konzentriert. Das Ergebnis sind die grossen edelsüssen Raritaeten: Sauternes, Tokaj Aszú, deutsche Trockenbeerenauslesen.",
        difficulty = 5,
        funFact = "Château d'Yquem in Sauternes gilt als der groesste edelsüsse Wein der Welt und der einzige Sauternes mit der Einstufung Premier Cru Classé Superieur. In schlechten Jahren verzichtet das Gut lieber auf eine Produktion — 1952, 1964, 1972, 1974 und 1992 wurde kein Château d'Yquem abgefuellt."
    )

)
