package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsEasy3(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 16,
        questionText = "Welches Vitamin ist reichlich in Orangen enthalten?",
        answerA = "Vitamin A",
        answerB = "Vitamin B12",
        answerC = "Vitamin C",
        answerD = "Vitamin D",
        correctAnswer = 2,
        explanation = "Orangen sind besonders reich an Vitamin C, das das Immunsystem staerkt und bei der Wundheilung hilft.",
        difficulty = 1,
        funFact = "Eine einzige mittelgrosse Orange deckt bereits den kompletten Tagesbedarf eines Erwachsenen an Vitamin C."
    ),

    // Question 2
    Question(
        categoryId = 16,
        questionText = "Wie viele Liter Wasser sollte ein Erwachsener taeglich mindestens trinken?",
        answerA = "0,5 Liter",
        answerB = "1,0 Liter",
        answerC = "1,5 Liter",
        answerD = "3,0 Liter",
        correctAnswer = 2,
        explanation = "Erwaschsene sollten taeglich mindestens 1,5 Liter Wasser trinken, bei Hitze oder Sport entsprechend mehr.",
        difficulty = 1,
        funFact = "Der menschliche Koerper besteht zu etwa 60 Prozent aus Wasser -- das Gehirn sogar zu rund 75 Prozent."
    ),

    // Question 3
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel gehoert zur Gruppe der Milchprodukte?",
        answerA = "Tofu",
        answerB = "Joghurt",
        answerC = "Margarine",
        answerD = "Haferflocken",
        correctAnswer = 1,
        explanation = "Joghurt ist ein Milchprodukt und liefert Kalzium, Protein und wertvolle Bakterienkulturen fuer die Darmgesundheit.",
        difficulty = 1,
        funFact = "In einem Becher Naturjoghurt leben bis zu einer Milliarde lebender Bakterienkulturen."
    ),

    // Question 4
    Question(
        categoryId = 16,
        questionText = "Durch welche natuerliche Quelle nimmt der Koerper Vitamin D auf?",
        answerA = "Trinkwasser",
        answerB = "Sonnenlicht",
        answerC = "Frische Luft",
        answerD = "Boden",
        correctAnswer = 1,
        explanation = "Der Koerper bildet Vitamin D hauptsaechlich durch Sonnenlicht, das die Haut bestrahlt.",
        difficulty = 1,
        funFact = "In Deutschland reicht die Sonnenstrahlung von Oktober bis Maerz nicht aus, um genuegend Vitamin D zu produzieren."
    ),

    // Question 5
    Question(
        categoryId = 16,
        questionText = "Welche der folgenden Lebensmittelgruppen liefert hauptsaechlich Energie in Form von Kohlenhydraten?",
        answerA = "Fleisch und Fisch",
        answerB = "Oel und Butter",
        answerC = "Brot und Nudeln",
        answerD = "Kaese und Eier",
        correctAnswer = 2,
        explanation = "Brot, Nudeln, Reis und andere Getreideprodukte bestehen hauptsaechlich aus Kohlenhydraten, die dem Koerper Energie liefern.",
        difficulty = 1,
        funFact = "Das Gehirn verbraucht taeglich etwa 120 Gramm Glukose und ist damit das energiehungrigste Organ im Koerper."
    ),

    // Question 6
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einer Laktoseintoleranz?",
        answerA = "Allergie gegen Weizen",
        answerB = "Unvertraeglichkeit von Milchzucker",
        answerC = "Allergie gegen Nuesse",
        answerD = "Unvertraeglichkeit von Fruchtzucker",
        correctAnswer = 1,
        explanation = "Bei einer Laktoseintoleranz kann der Koerper den Milchzucker Laktose nicht richtig verdauen, was zu Blahungen und Bauchschmerzen fuehrt.",
        difficulty = 1,
        funFact = "Weltweit haben etwa 65 Prozent aller Menschen eine verminderte Faehigkeit, Laktose als Erwachsener zu verdauen."
    ),

    // Question 7
    Question(
        categoryId = 16,
        questionText = "Welches Obst enthaelt besonders viel Kalium?",
        answerA = "Apfel",
        answerB = "Erdbeere",
        answerC = "Banane",
        answerD = "Kirsche",
        correctAnswer = 2,
        explanation = "Bananen sind bekannt fuer ihren hohen Kaliumgehalt, der wichtig fuer Muskeln und Herzfunktion ist.",
        difficulty = 1,
        funFact = "Eine einzige Banane liefert bis zu 422 Milligramm Kalium und kann nach dem Sport schnell Energie zurueckgeben."
    ),

    // Question 8
    Question(
        categoryId = 16,
        questionText = "Welche Naehrstoffgruppe liefert pro Gramm die meisten Kalorien?",
        answerA = "Kohlenhydrate",
        answerB = "Eiweiss",
        answerC = "Fett",
        answerD = "Ballaststoffe",
        correctAnswer = 2,
        explanation = "Fett liefert mit 9 Kilokalorien pro Gramm mehr als doppelt so viele Kalorien wie Kohlenhydrate oder Eiweiss (je 4 kcal/g).",
        difficulty = 1,
        funFact = "Obwohl Fett oft als 'Boesewicht' gilt, ist es fuer die Aufnahme der fettloeslichen Vitamine A, D, E und K unverzichtbar."
    ),

    // Question 9
    Question(
        categoryId = 16,
        questionText = "Was ist Gluten?",
        answerA = "Ein Milchzucker",
        answerB = "Ein Fruchtzucker",
        answerC = "Ein Eiweiss in Getreide",
        answerD = "Ein Fett in Nuessen",
        correctAnswer = 2,
        explanation = "Gluten ist ein Eiweiss, das in Getreidearten wie Weizen, Roggen und Gerste vorkommt und bei Zoeliakie Beschwerden verursacht.",
        difficulty = 1,
        funFact = "Menschen mit Zoeliakie duerfen nicht einmal Spuren von Gluten zu sich nehmen -- selbst ein einziger Kruemel kann die Darmschleimhaut schaedigen."
    ),

    // Question 10
    Question(
        categoryId = 16,
        questionText = "Welches Mineral ist besonders wichtig fuer starke Knochen und Zaehne?",
        answerA = "Eisen",
        answerB = "Kalzium",
        answerC = "Magnesium",
        answerD = "Zink",
        correctAnswer = 1,
        explanation = "Kalzium ist der Hauptbaustein von Knochen und Zaehnen und wird besonders in der Wachstumsphase benoetigt.",
        difficulty = 1,
        funFact = "Der menschliche Koerper speichert etwa 99 Prozent seines Kalziums in Knochen und Zaehnen."
    ),

    // Question 11
    Question(
        categoryId = 16,
        questionText = "Wie viele Mahlzeiten pro Tag empfehlen Ernaehrungsexperten?",
        answerA = "1 bis 2",
        answerB = "3 bis 5",
        answerC = "6 bis 8",
        answerD = "9 bis 10",
        correctAnswer = 1,
        explanation = "Ernaehrungsexperten empfehlen 3 Hauptmahlzeiten und 1 bis 2 Zwischenmahlzeiten fuer eine ausgewogene Energieversorgung.",
        difficulty = 1,
        funFact = "Das Fruehstueck wird als 'wichtigste Mahlzeit des Tages' bezeichnet, weil es den Blutzucker nach der Nachtruhe wieder anhebt."
    ),

    // Question 12
    Question(
        categoryId = 16,
        questionText = "Welches Gemuese enthaelt besonders viel Eisen?",
        answerA = "Gurke",
        answerB = "Spinat",
        answerC = "Tomate",
        answerD = "Paprika",
        correctAnswer = 1,
        explanation = "Spinat enthaelt nennenswerte Mengen an pflanzlichem Eisen und ist daher besonders bei Vegetariern beliebt.",
        difficulty = 1,
        funFact = "Durch Zugabe von Vitamin C -- zum Beispiel Zitronensaft -- kann der Koerper das pflanzliche Eisen aus Spinat viel besser aufnehmen."
    ),

    // Question 13
    Question(
        categoryId = 16,
        questionText = "Was ist eine ausgewogene Ernaehrung?",
        answerA = "Nur Obst und Gemuese essen",
        answerB = "Eine Mischung aller Naehrstoffgruppen in richtigen Mengen",
        answerC = "Taeglich Fleisch essen",
        answerD = "Keine Fette oder Zucker zu sich nehmen",
        correctAnswer = 1,
        explanation = "Eine ausgewogene Ernaehrung umfasst alle Naehrstoffgruppen in angemessenen Mengen und versorgt den Koerper optimal.",
        difficulty = 1,
        funFact = "Die Deutsche Gesellschaft fuer Ernaehrung empfiehlt taeglich mindestens 5 Portionen Obst und Gemuese -- die sogenannte '5 am Tag'-Regel."
    ),

    // Question 14
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel gilt als wichtige pflanzliche Eiweissquelle?",
        answerA = "Weissbrot",
        answerB = "Linsen",
        answerC = "Butter",
        answerD = "Apfelsaft",
        correctAnswer = 1,
        explanation = "Huelsenfruechte wie Linsen enthalten viel pflanzliches Eiweiss und sind daher eine wichtige Proteinquelle fuer Vegetarier.",
        difficulty = 1,
        funFact = "Linsen gehoeren zu den aeltesten Nutzpflanzen der Welt und werden seit ueber 8.000 Jahren angebaut."
    ),

    // Question 15
    Question(
        categoryId = 16,
        questionText = "Welches Getraenk enthaelt von Natur aus keine Kalorien?",
        answerA = "Apfelsaft",
        answerB = "Milch",
        answerC = "Wasser",
        answerD = "Orangensaft",
        correctAnswer = 2,
        explanation = "Reines Wasser enthaelt keine Kalorien, keinen Zucker und keine anderen Naehrstoffe und ist daher das ideale Getraenk.",
        difficulty = 1,
        funFact = "Selbst leicht gesuesste Getraenke koennen bis zu 10 Wuerfelzucker pro Glas enthalten -- das entspricht etwa 40 Gramm Zucker."
    ),

    // Question 16
    Question(
        categoryId = 16,
        questionText = "Wofuer braucht der Koerper Ballaststoffe?",
        answerA = "Fuer den Muskelaufbau",
        answerB = "Fuer die Verdauung",
        answerC = "Fuer die Blutbildung",
        answerD = "Fuer die Sehkraft",
        correctAnswer = 1,
        explanation = "Ballaststoffe foerdern eine gesunde Verdauung, erhoehen das Saettigungsgefuehl und unterstuetzen die Darmgesundheit.",
        difficulty = 1,
        funFact = "Die meisten Deutschen nehmen zu wenig Ballaststoffe zu sich -- empfohlen werden 30 Gramm pro Tag, aufgenommen werden im Schnitt nur 20 Gramm."
    ),

    // Question 17
    Question(
        categoryId = 16,
        questionText = "In welchem Lebensmittel ist besonders viel gesundes Omega-3-Fett enthalten?",
        answerA = "Schokolade",
        answerB = "Weissbrot",
        answerC = "Lachs",
        answerD = "Pommes frites",
        correctAnswer = 2,
        explanation = "Lachs und andere Fettfische wie Hering oder Makrele enthalten viel Omega-3-Fettsaeuren, die gut fuer Herz und Gehirn sind.",
        difficulty = 1,
        funFact = "Omega-3-Fettsaeuren koennen Entzuendungen im Koerper reduzieren und das Risiko von Herzerkrankungen senken."
    ),

    // Question 18
    Question(
        categoryId = 16,
        questionText = "Was ist die haeufigste Nahrungsmittelallergie bei Erwachsenen?",
        answerA = "Allergie gegen Erdbeeren",
        answerB = "Allergie gegen Nuesse",
        answerC = "Allergie gegen Kartoffeln",
        answerD = "Allergie gegen Reis",
        correctAnswer = 1,
        explanation = "Nussallergien, besonders gegen Erdnuesse und Baumnuesse, gehoeren zu den haeufigsten und oft schwersten Nahrungsmittelallergien.",
        difficulty = 1,
        funFact = "Eine schwere Nussallergie kann innerhalb von Minuten zu einem lebensbedrohlichen anaphylaktischen Schock fuehren."
    ),

    // Question 19
    Question(
        categoryId = 16,
        questionText = "Welche Farbe hat gesundes Gemuese oft, das viele Vitamine enthaelt?",
        answerA = "Weiss",
        answerB = "Dunkelgruen",
        answerC = "Beige",
        answerD = "Grau",
        correctAnswer = 1,
        explanation = "Dunkelgruenes Gemuese wie Brokkoli, Spinat oder Gruenkohl ist besonders reich an Vitaminen und Mineralstoffen.",
        difficulty = 1,
        funFact = "Die gruene Farbe kommt vom Chlorophyll -- demselben Stoff, mit dem Pflanzen Sonnenlicht in Energie umwandeln."
    ),

    // Question 20
    Question(
        categoryId = 16,
        questionText = "Wie viele Gramm Zucker enthaelt eine typische Dose Cola (330 ml) ungefaehr?",
        answerA = "5 Gramm",
        answerB = "15 Gramm",
        answerC = "35 Gramm",
        answerD = "60 Gramm",
        correctAnswer = 2,
        explanation = "Eine Dose Cola (330 ml) enthaelt ungefaehr 35 Gramm Zucker, was etwa 7 bis 9 Wuerfelzuckern entspricht.",
        difficulty = 1,
        funFact = "Die Weltgesundheitsorganisation empfiehlt, nicht mehr als 25 Gramm freien Zucker pro Tag zu sich zu nehmen -- eine Dose Cola uebersteigt das bereits."
    ),

    // Question 21
    Question(
        categoryId = 16,
        questionText = "Welche Lebensmittelgruppe sollte die Grundlage der taeglich Ernaehrung bilden?",
        answerA = "Fleisch und Wurst",
        answerB = "Suessigkeiten und Gebaeck",
        answerC = "Getreideprodukte und Kartoffeln",
        answerD = "Fette und Oele",
        correctAnswer = 2,
        explanation = "Getreideprodukte und Kartoffeln liefern komplexe Kohlenhydrate und Ballaststoffe und sollten die Basis einer gesunden Ernaehrung sein.",
        difficulty = 1,
        funFact = "In der Ernaehrungspyramide nimmt die Gruppe der Getreideprodukte die groesste Flaeche ein -- das zeigt, wie viel davon gegessen werden sollte."
    ),

    // Question 22
    Question(
        categoryId = 16,
        questionText = "Was passiert im Koerper, wenn man zu wenig trinkt?",
        answerA = "Man wird muede und kann sich schlechter konzentrieren",
        answerB = "Man bekommt mehr Energie",
        answerC = "Die Muskeln werden staerker",
        answerD = "Der Blutdruck sinkt sofort",
        correctAnswer = 0,
        explanation = "Bereits leichter Wassermangel (1-2% des Koerpergewichts) fuehrt zu Muedigkeit, Konzentrationsproblemen und Kopfschmerzen.",
        difficulty = 1,
        funFact = "Das Durstgefuehl setzt erst ein, wenn der Koerper bereits leicht dehydriert ist -- man sollte also trinken, bevor man Durst verspuert."
    ),

    // Question 23
    Question(
        categoryId = 16,
        questionText = "Welches der folgenden Lebensmittel enthaelt von Natur aus viel Zucker?",
        answerA = "Butter",
        answerB = "Huhn",
        answerC = "Weintrauben",
        answerD = "Kaese",
        correctAnswer = 2,
        explanation = "Weintrauben enthalten natuerlichen Fruchtzucker (Fruktose) und Traubenzucker (Glukose) in vergleichsweise grossen Mengen.",
        difficulty = 1,
        funFact = "Weintrauben enthalten so viel Zucker, dass man aus ihnen durch Gaerung Wein herstellen kann -- der Zucker wird dabei in Alkohol umgewandelt."
    ),

    // Question 24
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel ist eine gute Quelle fuer Vitamin A?",
        answerA = "Karotte",
        answerB = "Weissbrot",
        answerC = "Nudeln",
        answerD = "Zucker",
        correctAnswer = 0,
        explanation = "Karotten enthalten viel Beta-Carotin, das der Koerper in Vitamin A umwandelt und das wichtig fuer die Sehkraft ist.",
        difficulty = 1,
        funFact = "Das Sprichwort, dass Karotten gut fuer die Augen sind, hat einen wahren Kern: Vitamin A ist tatsaechlich notwendig fuer das Sehen bei Daemmerung."
    ),

    // Question 25
    Question(
        categoryId = 16,
        questionText = "Was sind Kalorien?",
        answerA = "Eine Art von Vitaminmangel",
        answerB = "Einheiten fuer den Energiegehalt von Lebensmitteln",
        answerC = "Schadstoffe in Lebensmitteln",
        answerD = "Zuckerarten in Obst",
        correctAnswer = 1,
        explanation = "Kalorien (genauer: Kilokalorien) sind Masseinheiten fuer den Energiegehalt von Nahrungsmitteln und beschreiben, wie viel Energie der Koerper daraus gewinnen kann.",
        difficulty = 1,
        funFact = "Ein Gramm Alkohol liefert 7 Kilokalorien -- fast so viel wie Fett (9 kcal/g) und deutlich mehr als Kohlenhydrate oder Eiweiss (je 4 kcal/g)."
    ),

    // Question 26
    Question(
        categoryId = 16,
        questionText = "Welches ist das einzige Getraenk, das Babys in den ersten Lebensmonaten brauchen?",
        answerA = "Wasser",
        answerB = "Apfelsaft",
        answerC = "Muttermilch oder Saeuglings-Anfangsnahrung",
        answerD = "Kuhvollmilch",
        correctAnswer = 2,
        explanation = "In den ersten Lebensmonaten benoetigen Babys nur Muttermilch oder Saeuglings-Anfangsnahrung -- beides versorgt sie vollstaendig mit Naehrstoffen und Fluessigkeit.",
        difficulty = 1,
        funFact = "Muttermilch veraendert ihre Zusammensetzung im Laufe des Tages und passt sich sogar den Beduerfnissen des Kindes an."
    ),

    // Question 27
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel enthaelt viel Eiweiss?",
        answerA = "Kartoffelchips",
        answerB = "Weissmehlbrot",
        answerC = "Eier",
        answerD = "Limonade",
        correctAnswer = 2,
        explanation = "Eier enthalten hochwertiges Eiweiss mit allen essentiellen Aminosaeuren und gelten als eines der nahrhaftesten Lebensmittel.",
        difficulty = 1,
        funFact = "Das Eiweiss im Ei gilt als Referenz fuer die biologische Wertigkeit von Proteinen -- es bekommt den Wert 100 als Vergleichsmassstab."
    ),

    // Question 28
    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'ballaststoffreich'?",
        answerA = "Das Lebensmittel enthaelt viel Zucker",
        answerB = "Das Lebensmittel enthaelt viel pflanzliche Fasern",
        answerC = "Das Lebensmittel enthaelt viel Fett",
        answerD = "Das Lebensmittel enthaelt viel Eiweiss",
        correctAnswer = 1,
        explanation = "Ballaststoffe sind pflanzliche Fasern, die nicht verdaut werden koennen, aber die Verdauung foerdern und lange saettigen.",
        difficulty = 1,
        funFact = "Ballaststoffe ernaehren die guten Bakterien im Darm und unterstuetzen so ein gesundes Mikrobiom."
    ),

    // Question 29
    Question(
        categoryId = 16,
        questionText = "Welche Frucht enthaelt besonders viel Vitamin C?",
        answerA = "Banane",
        answerB = "Apfel",
        answerC = "Kiwi",
        answerD = "Birne",
        correctAnswer = 2,
        explanation = "Kiwis enthalten sogar mehr Vitamin C als Orangen und liefern pro 100 Gramm etwa 90 Milligramm Vitamin C.",
        difficulty = 1,
        funFact = "Die Paprika gehoert unter dem Gemuese zu den Vitamin-C-Champions und enthaelt sogar mehr Vitamin C als Orangen."
    ),

    // Question 30
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen Vollkornbrot und Weissbrot?",
        answerA = "Weissbrot hat mehr Vitamine",
        answerB = "Vollkornbrot enthaelt mehr Ballaststoffe und Naehrstoffe",
        answerC = "Weissbrot hat weniger Kalorien",
        answerD = "Es gibt keinen ernaehrungsrelevanten Unterschied",
        correctAnswer = 1,
        explanation = "Vollkornbrot enthaelt das vollstaendige Getreidekorn mit Schale und Keim, wodurch es mehr Ballaststoffe, Vitamine und Mineralstoffe liefert als Weissbrot.",
        difficulty = 1,
        funFact = "Beim Mahlen zu Weissmehl gehen bis zu 80 Prozent der im Getreide enthaltenen Vitamine und Mineralstoffe verloren."
    ),

    // Question 31
    Question(
        categoryId = 16,
        questionText = "Welche Nuss wird oft als besonders gesund fuer das Herz bezeichnet?",
        answerA = "Erdnuss",
        answerB = "Walnuss",
        answerC = "Macadamia",
        answerD = "Pistazie",
        correctAnswer = 1,
        explanation = "Walnuesse enthalten besonders viele Omega-3-Fettsaeuren und andere herzschuetzende Inhaltsstoffe.",
        difficulty = 1,
        funFact = "Schon eine Handvoll Walnuesse (etwa 30 Gramm) pro Tag kann laut Studien das Risiko von Herzerkrankungen spuerbar senken."
    ),

    // Question 32
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'leeren Kalorien'?",
        answerA = "Lebensmittel mit sehr wenig Kalorien",
        answerB = "Kalorien aus Lebensmitteln ohne nennenswerte Naehrstoffe",
        answerC = "Kalorien aus gesunden Lebensmitteln",
        answerD = "Kalorien, die der Koerper nicht verwerten kann",
        correctAnswer = 1,
        explanation = "Leere Kalorien liefern zwar Energie, aber kaum Vitamine, Mineralstoffe oder andere wertvolle Naehrstoffe -- typisch fuer Suessigkeiten und Softdrinks.",
        difficulty = 1,
        funFact = "Alkohol ist das Paradebeispiel fuer leere Kalorien: Er liefert fast so viel Energie wie Fett, aber keine einzige verwertbare Naehrstoff-Einheit."
    ),

    // Question 33
    Question(
        categoryId = 16,
        questionText = "Wie viele Portionen Obst und Gemuese pro Tag empfehlen Ernaehrungsexperten?",
        answerA = "1 Portion",
        answerB = "3 Portionen",
        answerC = "5 Portionen",
        answerD = "10 Portionen",
        correctAnswer = 2,
        explanation = "Die Empfehlung '5 am Tag' besagt, dass taeglich 5 Portionen Obst und Gemuese gegessen werden sollten fuer optimale Versorgung mit Vitaminen.",
        difficulty = 1,
        funFact = "Eine 'Portion' entspricht ungefaehr einer Handvoll -- das macht die Empfehlung einfach umsetzbar ohne Waage oder Tabellen."
    ),

    // Question 34
    Question(
        categoryId = 16,
        questionText = "Welches Mineral ist wichtig fuer die Blutbildung und wird in rotem Fleisch gefunden?",
        answerA = "Kalzium",
        answerB = "Kalium",
        answerC = "Eisen",
        answerD = "Natrium",
        correctAnswer = 2,
        explanation = "Eisen ist ein zentraler Bestandteil des roten Blutfarbstoffs Haemoglobin und wird benoetigt, um Sauerstoff im Blut zu transportieren.",
        difficulty = 1,
        funFact = "Frauen im gebaerfaehigen Alter haben einen doppelt so hohen Eisenbedarf wie Maenner, weil sie durch die Menstruation regelmaessig Blut verlieren."
    ),

    // Question 35
    Question(
        categoryId = 16,
        questionText = "Welche Ernaehrungsweise verzichtet komplett auf tierische Produkte?",
        answerA = "Vegetarisch",
        answerB = "Vegan",
        answerC = "Pescetarisch",
        answerD = "Flexitarisch",
        correctAnswer = 1,
        explanation = "Veganer verzichten vollstaendig auf alle tierischen Produkte einschliesslich Fleisch, Fisch, Milchprodukte, Eier und Honig.",
        difficulty = 1,
        funFact = "Veganer muessen Vitamin B12 als Nahrungsergaenzungsmittel nehmen, da dieses Vitamin fast ausschliesslich in tierischen Produkten vorkommt."
    ),

    // Question 36
    Question(
        categoryId = 16,
        questionText = "Was liefert Milch in besonders grossen Mengen?",
        answerA = "Vitamin C",
        answerB = "Kalzium und Eiweiss",
        answerC = "Ballaststoffe",
        answerD = "Eisen",
        correctAnswer = 1,
        explanation = "Milch ist eine hervorragende Quelle fuer Kalzium und Eiweiss und foerdert damit Knochenaufbau und Muskelentwicklung.",
        difficulty = 1,
        funFact = "Ein Glas Vollmilch (200 ml) liefert bereits ein Viertel des empfohlenen Tagesbedarfs an Kalzium fuer Erwachsene."
    ),

    // Question 37
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel gilt als besonders ungesund wegen seines hohen Salzgehalts?",
        answerA = "Frisches Gemuese",
        answerB = "Chips und Salzgebaeck",
        answerC = "Vollkornbrot",
        answerD = "Naturjoghurt",
        correctAnswer = 1,
        explanation = "Chips, Salzgebaeck und andere Knabberartikel enthalten oft extrem viel Salz, was langfristig den Blutdruck erhoehen kann.",
        difficulty = 1,
        funFact = "Die Weltgesundheitsorganisation empfiehlt maximal 5 Gramm Salz pro Tag -- ein Tuetenchen Chips kann bereits die Haelfte dieser Menge enthalten."
    ),

    // Question 38
    Question(
        categoryId = 16,
        questionText = "Warum ist Fruehstueck wichtig?",
        answerA = "Es hat keinen besonderen Nutzen",
        answerB = "Es fuellt die Energiereserven nach der Nacht wieder auf",
        answerC = "Man nimmt durch Fruehstueck immer ab",
        answerD = "Fruehstueck macht immer muede",
        correctAnswer = 1,
        explanation = "Nach dem langen Nachtschlaf sind die Glukosespeicher des Koerpers leer -- das Fruehstueck fuellt sie wieder auf und liefert Energie fuer den Tag.",
        difficulty = 1,
        funFact = "Kinder, die regelmaessig fruehstuecken, zeigen in Studien bessere schulische Leistungen als Kinder, die das Fruehstueck auslassen."
    ),

    // Question 39
    Question(
        categoryId = 16,
        questionText = "Was ist Fruktose?",
        answerA = "Ein kuenstlicher Suessungsstoff",
        answerB = "Ein natuerlch vorkommender Fruchtzucker",
        answerC = "Ein Fett in Avocados",
        answerD = "Ein Eiweiss in Huelsenfruechten",
        correctAnswer = 1,
        explanation = "Fruktose ist ein natuerlich in Obst und Honig vorkommender Zucker, der dem Obst seine suesse Geschmacksnote verleiht.",
        difficulty = 1,
        funFact = "Obwohl Fruktose natuerlich ist, kann zu viel davon -- vor allem aus Sirupen in verarbeiteten Lebensmitteln -- die Leber belasten."
    ),

    // Question 40
    Question(
        categoryId = 16,
        questionText = "Welche Nahrungskomponente ist am wichtigsten fuer den Aufbau von Muskeln?",
        answerA = "Fett",
        answerB = "Eiweiss (Protein)",
        answerC = "Zucker",
        answerD = "Wasser",
        correctAnswer = 1,
        explanation = "Muskeln bestehen hauptsaechlich aus Eiweiss, daher ist eine ausreichende Proteinzufuhr fuer den Muskelaufbau unverzichtbar.",
        difficulty = 1,
        funFact = "Nach dem Sport benoetigt der Koerper innerhalb von 30 Minuten Protein, um die Muskelreparatur optimal einzuleiten -- dieses Zeitfenster nennt man 'anaboles Fenster'."
    ),

    // Question 41
    Question(
        categoryId = 16,
        questionText = "Was enthaelt mehr natuerlichen Zucker: Obst oder Gemuese?",
        answerA = "Gemuese enthaelt generell mehr Zucker",
        answerB = "Beide enthalten gleich viel Zucker",
        answerC = "Obst enthaelt generell mehr Zucker",
        answerD = "Weder Obst noch Gemuese enthalten Zucker",
        correctAnswer = 2,
        explanation = "Obst enthaelt in der Regel deutlich mehr natuerlichen Fruchtzucker als Gemuese und schmeckt deshalb suesslicher.",
        difficulty = 1,
        funFact = "Manche Gemuesesorten wie Mais, Erbsen und Moehren enthalten jedoch ueberraschend viel Zucker und kommen manchen Obstsorten nah."
    ),

    // Question 42
    Question(
        categoryId = 16,
        questionText = "Welches Vitamin wird auch als 'Sonnenvitamin' bezeichnet?",
        answerA = "Vitamin A",
        answerB = "Vitamin B6",
        answerC = "Vitamin C",
        answerD = "Vitamin D",
        correctAnswer = 3,
        explanation = "Vitamin D wird als Sonnenvitamin bezeichnet, weil der Koerper es unter Einwirkung von Sonnenlicht selbst in der Haut bildet.",
        difficulty = 1,
        funFact = "Vitamin-D-Mangel ist in Deutschland weit verbreitet: Rund 60 Prozent der Bevoelkerung sind in den Wintermonaten nicht ausreichend versorgt."
    ),

    // Question 43
    Question(
        categoryId = 16,
        questionText = "Was ist der Hauptnaehrstoff in Brot und Nudeln?",
        answerA = "Fett",
        answerB = "Kohlenhydrate",
        answerC = "Eiweiss",
        answerD = "Vitamine",
        correctAnswer = 1,
        explanation = "Brot und Nudeln bestehen hauptsaechlich aus Staerke, einem komplexen Kohlenhydrat, das dem Koerper lang anhaltende Energie liefert.",
        difficulty = 1,
        funFact = "Nudeln haben einen niedrigeren glykamischen Index als Weissbrot, was bedeutet, dass der Blutzucker nach dem Nudelessen langsamer ansteigt."
    ),

    // Question 44
    Question(
        categoryId = 16,
        questionText = "Welches Lebensmittel enthaelt von Natur aus kein Gluten?",
        answerA = "Weizenbrot",
        answerB = "Roggenbrot",
        answerC = "Gerste",
        answerD = "Reis",
        correctAnswer = 3,
        explanation = "Reis enthaelt kein Gluten und ist daher ein wichtiges Grundnahrungsmittel fuer Menschen mit Zoeliakie oder Glutenunvertraeglichkeit.",
        difficulty = 1,
        funFact = "Mais, Quinoa, Hirse und Buchweizen sind ebenfalls glutenfrei und koennen als Getreidealternativen eingesetzt werden."
    ),

    // Question 45
    Question(
        categoryId = 16,
        questionText = "Was ist 'Dehydration'?",
        answerA = "Zu viel Fett im Blut",
        answerB = "Zu wenig Fluessigkeit im Koerper",
        answerC = "Zu viel Zucker im Blut",
        answerD = "Ein Vitaminmangel",
        correctAnswer = 1,
        explanation = "Dehydration bedeutet, dass der Koerper zu wenig Fluessigkeit hat, was zu Muedigkeit, Schwindel und bei schwerem Verlauf zu ernsthaften Gesundheitsproblemen fuehren kann.",
        difficulty = 1,
        funFact = "Selbst ein Wasserverlust von nur 2 Prozent des Koerpergewichts kann die sportliche Leistungsfaehigkeit um bis zu 20 Prozent verringern."
    ),

    // Question 46
    Question(
        categoryId = 16,
        questionText = "Welche Fettart gilt als besonders ungesund?",
        answerA = "Ungesaettigte Fettsaeuren aus Olivenoel",
        answerB = "Omega-3-Fettsaeuren aus Fisch",
        answerC = "Transfettsaeuren aus Frittierfett",
        answerD = "Natuerliche Fette aus Nuessen",
        correctAnswer = 2,
        explanation = "Transfettsaeuren entstehen beim Haerten von Fetten und gelten als besonders schadlich fuer das Herz-Kreislauf-System.",
        difficulty = 1,
        funFact = "In der EU sind kuenstliche Transfettsaeuren seit 2021 in Lebensmitteln auf maximal 2 Gramm pro 100 Gramm Fett begrenzt."
    ),

    // Question 47
    Question(
        categoryId = 16,
        questionText = "Welches Gemuese gehoert zu den Huelsenfruechten?",
        answerA = "Brokkoli",
        answerB = "Gurke",
        answerC = "Erbse",
        answerD = "Paprika",
        correctAnswer = 2,
        explanation = "Erbsen gehoeren zu den Huelsenfruechten und enthalten viel pflanzliches Eiweiss und Ballaststoffe.",
        difficulty = 1,
        funFact = "Huelsenfruechte koennen Stickstoff aus der Luft binden und reichern damit den Boden mit natuerlichem Duenger an -- sie sind echte Bodenverbesserer."
    ),

    // Question 48
    Question(
        categoryId = 16,
        questionText = "Was ist eine gesunde Alternative zu Pommes frites?",
        answerA = "Kartoffelchips",
        answerB = "Im Ofen gebackene Kartoffelspalten",
        answerC = "Tiefgekuehlte Pommes",
        answerD = "Gebratene Kartoffeln in viel Oel",
        correctAnswer = 1,
        explanation = "Im Ofen gebackene Kartoffelspalten enthalten deutlich weniger Fett als frittierte Pommes und sind eine gesundere Alternative.",
        difficulty = 1,
        funFact = "Beim Frittieren nimmt eine Portion Pommes bis zu 15 Gramm Fett auf -- beim Backen im Ofen mit wenig Oel sind es nur ein bis zwei Gramm."
    ),

    // Question 49
    Question(
        categoryId = 16,
        questionText = "Welcher Naehrstoff ist besonders wichtig fuer das Immunsystem?",
        answerA = "Vitamin C",
        answerB = "Natrium",
        answerC = "Staerke",
        answerD = "Saettigung",
        correctAnswer = 0,
        explanation = "Vitamin C unterstuetzt das Immunsystem, foerdert die Bildung weisser Blutkoerperchen und hat eine antioxidative Wirkung.",
        difficulty = 1,
        funFact = "Anders als die meisten Tiere kann der Mensch Vitamin C nicht selbst produzieren und muss es taeglich ueber die Nahrung aufnehmen."
    ),

    // Question 50
    Question(
        categoryId = 16,
        questionText = "Was bedeutet der Begriff 'Naehrwert' auf einer Lebensmittelverpackung?",
        answerA = "Den Preis des Lebensmittels",
        answerB = "Die enthaltenen Naehrstoffe und ihren Energiegehalt",
        answerC = "Das Mindesthaltbarkeitsdatum",
        answerD = "Die Herkunft der Zutaten",
        correctAnswer = 1,
        explanation = "Die Naehrwerttabelle auf Lebensmitteln zeigt, wie viel Energie sowie welche Mengen an Fett, Kohlenhydraten, Eiweiss und anderen Naehrstoffen enthalten sind.",
        difficulty = 1,
        funFact = "In der EU ist die Naehrwertkennzeichnung auf verpackten Lebensmitteln seit 2016 Pflicht -- die Ampelkennzeichnung wie in Grossbritannien ist aber freiwillig."
    ),

)
