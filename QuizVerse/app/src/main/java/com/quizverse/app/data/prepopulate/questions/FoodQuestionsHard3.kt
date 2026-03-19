package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsHard3(): List<Question> = listOf(

    // ── MICHELIN-GUIDE & STERNESYSTEM ─────────────────────────────────────────

    // Question 1 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr veröffentlichte Michelin seinen ersten Guide und welchem Zweck diente er ursprünglich?",
        answerA = "1900 — kostenloser Reiseführer für Autofahrer mit Tankstellen und Werkstätten",
        answerB = "1911 — kostenpflichtiger Restaurantführer für wohlhabende Touristen",
        answerC = "1895 — Werbebroschüre für Reifen mit Kartenmaterial",
        answerD = "1920 — offizieller Touristenführer des französischen Tourismusministeriums",
        correctAnswer = 0,
        explanation = "André und Édouard Michelin veröffentlichten 1900 den ersten Guide Michelin kostenlos für Autofahrer. Er enthielt Informationen zu Tankstellen, Reifenhändlern, Reparaturwerkstätten und einfachen Unterkünften — um den Automobilismus zu fördern und damit indirekt den Reifenabsatz zu steigern. Erst ab 1920 wurde er kostenpflichtig, und Restaurantbewertungen kamen ab 1926 hinzu.",
        difficulty = 3,
        funFact = "Die Brüder Michelin druckten den ersten Guide in einer Auflage von 35.000 Exemplaren — und verschenkten ihn an jede Reifenwerkstatt in Frankreich."
    ),

    // Question 2 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was bedeuten die drei Michelin-Sterne laut der offiziellen Definition des Guide Michelin?",
        answerA = "Sehr gutes Restaurant in seiner Kategorie; Exzellente Küche; Weltklasse-Küche",
        answerB = "Empfehlenswert; Lohnt die Reise in der Umgebung; Lohnt die extra Anreise",
        answerC = "Ein Stern: sehr gute Küche; zwei Sterne: exzellente Küche, einen Umweg wert; drei Sterne: einzigartige Küche, eine Reise wert",
        answerD = "Bronze, Silber, Gold nach internationalem Bewertungsstandard",
        correctAnswer = 2,
        explanation = "Die offizielle Michelin-Definition lautet: Ein Stern = 'Eine sehr gute Küche in ihrer Kategorie'. Zwei Sterne = 'Exzellente Küche — einen Umweg wert'. Drei Sterne = 'Eine einzigartige Küche — eine Reise wert'. Diese Formulierungen stammen aus dem Guide Michelin von 1936 und sind bis heute unverändert.",
        difficulty = 3,
        funFact = "Bis 1997 enthielt der Guide Michelin keine Kategorie 'Bib Gourmand'. Diese wurde erst 1997 eingeführt und ist benannt nach dem Michelin-Maskottchen Bibendum."
    ),

    // Question 3 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Wie viele Michelin-Sterne hat Joël Robuchon insgesamt in seiner Karriere gesammelt und warum gilt er als unangefochtener Rekordhalter?",
        answerA = "21 Sterne — weil er gleichzeitig in drei Städten 3-Sterne-Restaurants besaß",
        answerB = "28 Sterne — durch sein 'Joël Robuchon'-Netzwerk in Paris, Tokio und Las Vegas",
        answerC = "19 Sterne — als erster Koch, der eine vollständige Sternekarriere über 40 Jahre aufbaute",
        answerD = "31 Sterne — wegen des globalen L'Atelier-Formats, das er gleichzeitig in mehreren Städten betrieb",
        correctAnswer = 3,
        explanation = "Joël Robuchon (1945–2018) sammelte im Laufe seiner Karriere insgesamt 31 Michelin-Sterne — mehr als jeder andere Koch in der Geschichte des Guide Michelin. Sein innovatives 'L'Atelier de Joël Robuchon'-Konzept mit offener Küche und Barhockern verbreitete sich weltweit. Das Guinness-Buch der Rekorde bestätigte ihn als Rekordhalter.",
        difficulty = 3,
        funFact = "Robuchon wurde 1989 vom Gault Millau zum 'Koch des Jahrhunderts' ernannt — im Alter von nur 44 Jahren zog er sich zurück, nur um 2003 mit dem L'Atelier-Format ein grandioses Comeback zu feiern."
    ),

    // Question 4 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Koch bat Michelin 2017 ausdrücklich darum, seinen dritten Stern zurückzugeben, und was war sein Beweggrund?",
        answerA = "Sébastien Bras — er wollte sich aus dem psychologischen Druck des Bewertungssystems befreien",
        answerB = "Marco Pierre White — er gab alle Sterne zurück, weil er das Kochen aufgab",
        answerC = "Heston Blumenthal — er schloss The Fat Duck nach einem Lebensmittelskandal",
        answerD = "René Redzepi — er renovierte Noma und wollte keine Bewertung während der Pause",
        correctAnswer = 0,
        explanation = "Der französische Koch Sébastien Bras bat Michelin 2017 ausdrücklich darum, sein Restaurant 'Le Suquet' in Laguiole aus dem Guide zu streichen und die drei Sterne zurückzugeben. Er begründete dies mit dem enormen psychologischen Druck durch das Sternesystem, der seiner Kreativität und seinem persönlichen Wohlbefinden schadete. Michelin respektierte diesen Wunsch.",
        difficulty = 3,
        funFact = "Marco Pierre White war der erste britische Koch mit drei Michelin-Sternen und tatsächlich der erste Koch überhaupt, der freiwillig alle Sterne zurückgab — allerdings erst 1999, als er das Kochen aufgab."
    ),

    // Question 5 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Bib Gourmand' im Guide Michelin und wie unterscheidet er sich von einem Michelin-Stern?",
        answerA = "Ein Stern für junge Köche unter 35 Jahren mit besonderem Entwicklungspotenzial",
        answerB = "Ein regionaler Preis für traditionelle Regionalküche ohne internationale Einflüsse",
        answerC = "Eine Auszeichnung für vegetarische oder vegane Restaurants mit hohem Qualitätsniveau",
        answerD = "Eine Auszeichnung für Restaurants mit hervorragendem Preis-Leistungs-Verhältnis, aber ohne Sterneniveau",
        correctAnswer = 3,
        explanation = "Der Bib Gourmand (seit 1997) bezeichnet Restaurants, die 'gutes Essen zu moderaten Preisen' bieten — Michelin definiert konkrete Preisgrenzen je nach Land. Es ist keine Stern-Auszeichnung, sondern eine separate Empfehlungskategorie. Das Maskottchen Bibendum (Bibendum = Bib) leckt sich dabei die Lippen. In Deutschland gilt der Bib Gourmand oft als 'Geheimtipp des Führers'.",
        difficulty = 3,
        funFact = "Der Name 'Bibendum' kommt aus dem lateinischen Satz 'Nunc est bibendum' (Jetzt trinken wir) aus einer Ode des Horaz — gewählt, weil der Michelin-Mann so aussieht, als bestehe er aus übereinandergelegten Reifen."
    ),

    // Question 6 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Restaurant in Tokio war beim Ersterscheinen des Tokyo-Michelin-Guides 2007 unter den allerersten Drei-Sterne-Restaurants außerhalb Frankreichs?",
        answerA = "Sukiyabashi Jiro von Jiro Ono",
        answerB = "Joel Robuchon Restaurant Tokyo",
        answerC = "Kitcho Arashiyama",
        answerD = "Ryugin von Seiji Yamamoto",
        correctAnswer = 0,
        explanation = "Als Michelin 2007 erstmals einen Tokyo-Guide veröffentlichte, erhielten mehrere Restaurants sofort drei Sterne — darunter Sukiyabashi Jiro (Jiro Ono). Tokio übertraf Paris in der Gesamtzahl der Sterne und galt zeitweise als die 'Stadt mit den meisten Michelin-Sternen' weltweit.",
        difficulty = 3,
        funFact = "Der Dokumentarfilm 'Jiro Dreams of Sushi' (2011) machte Jiro Ono und sein winziges 10-Sitzer-Sushi-Restaurant weltberühmt — obwohl es sich in einer U-Bahn-Station befindet."
    ),

    // Question 7 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Grüne Stern' (Green Star) des Michelin Guide und seit wann wird er vergeben?",
        answerA = "Seit 2020 — eine Auszeichnung für Restaurants mit besonders nachhaltigem und umweltbewusstem Ansatz",
        answerB = "Seit 2015 — ein Stern für bio-zertifizierte Restaurants mit ausschließlich regionalen Zutaten",
        answerC = "Seit 2018 — eine Auszeichnung für Zero-Waste-Restaurants ohne Lebensmittelverschwendung",
        answerD = "Seit 2022 — ein Sonderstern für Restaurants mit pflanzenbasierter Küche",
        correctAnswer = 0,
        explanation = "Der Michelin Green Star (Grüner Stern) wurde 2020 eingeführt und zeichnet Restaurants aus, die sich durch besonders nachhaltiges Wirtschaften auszeichnen: eigene Gärten, Zero-Waste-Konzepte, direkte Zusammenarbeit mit Bauern, Reduktion des CO₂-Fußabdrucks. Er ist keine Ersetzung der klassischen Sterne, sondern eine zusätzliche Kategorie.",
        difficulty = 3,
        funFact = "Das dänische Restaurant Noma von René Redzepi war einer der ersten prominenten Green-Star-Empfänger — bekannt für sein eigenes Forschungslabor, Wildsammeln und fermentierte Küche."
    ),

    // Question 8 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Wie viele 3-Sterne-Restaurants hatte Deutschland im Guide Michelin 2025 und welches war das neueste?",
        answerA = "10 Restaurants — Victor's Fine Dining in Perl als Neuling",
        answerB = "8 Restaurants — JAN von Jan Hartwig in München als Neuling",
        answerC = "15 Restaurants — Tohru in der Schreiberei von Tohru Nakamura als Neuling",
        answerD = "12 Restaurants — ES:SENZ von Edip Sigl im Hotel Das Achental in Grassau als Neuling",
        correctAnswer = 3,
        explanation = "Im Guide Michelin Deutschland 2025 sind 12 Drei-Sterne-Restaurants ausgezeichnet. Das ES:SENZ von Edip Sigl im Hotel Das Achental in Grassau (Oberbayern) stieg als Neuling direkt in die Drei-Sterne-Kategorie auf. Insgesamt verzeichnete Deutschland 2025 einen Rekord von 341 mit Sternen ausgezeichneten Restaurants.",
        difficulty = 3,
        funFact = "Edip Sigl kochte zuvor im Victor's Fine Dining in Perl, das ebenfalls drei Sterne hält — er ist damit einer der wenigen Köche, die in zwei verschiedenen Drei-Sterne-Restaurants Chefkoch waren."
    ),

    // Question 9 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter der Tätigkeit eines Michelin-Inspektors und wie bleiben Inspektoren anonym?",
        answerA = "Inspektoren sind ausgebildete Köche, die sich offen vorstellen und Küchen besichtigen",
        answerB = "Inspektoren sind pensionierte Restaurantbesitzer, die ehrenamtlich für Michelin testen",
        answerC = "Inspektoren sind fest angestellte, ausgebildete Gastronomie-Experten, die mehrmals jährlich unerkannt als reguläre Gäste essen und Berichte schreiben",
        answerD = "Inspektoren sind Journalisten, die aus Pressemitteilungen und Gästebewertungen Ratings zusammenstellen",
        correctAnswer = 2,
        explanation = "Michelin-Inspektoren sind fest angestellte, ausgebildete Köche oder Hoteliers, die streng anonym arbeiten: keine Pressekarten, eigene Kreditkarten, keine Presseessen. Sie besuchen jedes bewertete Restaurant mehrmals pro Jahr und verfassen strukturierte Berichte. Ein Restaurant erhält einen Stern erst nach mehreren übereinstimmenden positiven Inspektionsberichten.",
        difficulty = 3,
        funFact = "Ein durchschnittlicher Michelin-Inspektor besucht pro Jahr etwa 240 Restaurants und isst über 800 Mahlzeiten auf Kosten des Verlags — ein stressiger Job, der zu gesundheitlichen Problemen führen kann."
    ),

    // Question 10 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Gault Millau' und wie unterscheidet sich sein Bewertungssystem vom Guide Michelin?",
        answerA = "Ein deutsches Restaurantmagazin mit Sternebewertung von 1–5 Sternen",
        answerB = "Ein internationaler Wettbewerb wie der Bocuse d'Or mit Medaillenvergabe statt Punkte",
        answerC = "Ein englischer Restaurantguide mit Letter-Grading-System (A–F) wie in Schulnoten",
        answerD = "Ein französischer Restaurantführer mit 20-Punkte-Skala; Fokus auf Kreativität und persönliche Küche statt Perfektion in Klassik",
        correctAnswer = 3,
        explanation = "Der Gault Millau wurde 1969 von Henri Gault und Christian Millau in Frankreich gegründet. Er bewertet auf einer 20-Punkte-Skala (20 unerreichbar, 19.5 weltklasse). Im Gegensatz zu Michelin, das klassische Perfektion prämiert, förderte Gault Millau die Nouvelle Cuisine: leichtere Saucen, kürzere Garzeiten, kreative Zutaten. Er war Wegbereiter für Köche wie Paul Bocuse.",
        difficulty = 3,
        funFact = "Paul Bocuse bekam im Gault Millau 19 von 20 Punkten — jahrelang der höchstbewertete Koch Frankreichs. Den 20. Punkt reservierte der Guide symbolisch für die Perfektion selbst."
    ),

    // ── BERUEHMTE KOECHE & IHRE RESTAURANTS ──────────────────────────────────

    // Question 11 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wer war Paul Bocuse und welcher Begriff ist untrennbar mit seiner kulinarischen Revolution verbunden?",
        answerA = "Ein spanischer Koch, der die Molekularküche begründete und das elBulli leitete",
        answerB = "Ein französischer Koch (1926–2018), Hauptvertreter der Nouvelle Cuisine und dreifacher Michelin-Sternekoch seit 1965",
        answerC = "Ein amerikanischer Koch, der die Farm-to-Table-Bewegung in den USA startete",
        answerD = "Ein japanischer Koch, der die Kaiseki-Küche international bekannt machte",
        correctAnswer = 1,
        explanation = "Paul Bocuse (1926–2018) aus Lyon gilt als 'Papst der französischen Küche'. Sein Restaurant L'Auberge du Pont de Collonges hielt 55 Jahre lang ununterbrochen drei Michelin-Sterne (1965–2020). Er war Hauptvertreter der Nouvelle Cuisine, die in den 1970ern schwere klassische Saucen durch leichtere Gerichte ersetzte. Seine bekannteste Kreation: die 'Soupe VGE' für Staatspräsident Giscard d'Estaing.",
        difficulty = 3,
        funFact = "Der internationale Koch-Wettbewerb 'Bocuse d'Or' wurde 1987 von Paul Bocuse persönlich gegründet und gilt heute als die inoffizielle Koch-Weltmeisterschaft — alle zwei Jahre in Lyon ausgetragen."
    ),

    // Question 12 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Alain Ducasse gilt als lebender Koch mit den meisten Michelin-Sternen. In welchen drei Städten hielt er gleichzeitig 3-Sterne-Restaurants und war damit ein historisches Novum?",
        answerA = "Paris, London, New York",
        answerB = "Paris, Tokio, Monaco",
        answerC = "Lyon, Paris, Las Vegas",
        answerD = "Paris, Monte-Carlo und New York",
        correctAnswer = 3,
        explanation = "Alain Ducasse war der erste Koch der Geschichte, der gleichzeitig in drei verschiedenen Städten je ein 3-Sterne-Restaurant führte: Le Louis XV in Monte-Carlo (Monaco), Restaurant Alain Ducasse im Plaza Athénée in Paris, und Alain Ducasse at the Essex House in New York. Diese Leistung gilt in der Gastronomiewelt als beispiellos.",
        difficulty = 3,
        funFact = "Ducasse überlebte 1984 einen Flugzeugabsturz in den Alpen, bei dem alle anderen Insassen starben — ein Erlebnis, das ihn nach eigener Aussage sein Leben und seine Kochphilosophie neu definieren ließ."
    ),

    // Question 13 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Bei welchem berühmten Koch absolvierte Gordon Ramsay in den 1980er Jahren seine entscheidende Ausbildung in Paris?",
        answerA = "Alain Ducasse im Le Louis XV Monaco",
        answerB = "Paul Bocuse in L'Auberge du Pont de Collonges",
        answerC = "Joël Robuchon im Restaurant Jamin Paris",
        answerD = "Pierre Gagnaire in seinem Pariser Restaurant",
        correctAnswer = 2,
        explanation = "Gordon Ramsay absolvierte eine prägende Ausbildung bei Joël Robuchon im Restaurant Jamin in Paris sowie bei Guy Savoy. Diese Lehrjahre bei Robuchon — bekannt für sein obsessives Streben nach Perfektion — formten Ramsays Kochstil nachhaltig. Ramsay beschrieb Robuchon später als den einzigen Koch, der ihn wirklich weinen ließ.",
        difficulty = 3,
        funFact = "Gordon Ramsay begann seine Karriere ursprünglich als Fußballspieler bei Glasgow Rangers — ehe eine Knieverletzung ihn im Alter von 18 Jahren zur Gastronomie wechseln ließ."
    ),

    // Question 14 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'The French Laundry' und welche Auszeichnungen machten es weltberühmt?",
        answerA = "Ein historisches Restaurant von Auguste Escoffier in Paris mit 3 Michelin-Sternen seit 1960",
        answerB = "Das Restaurant von Thomas Keller in Yountville, Kalifornien — eines der ersten amerikanischen Restaurants mit 3 Michelin-Sternen",
        answerC = "Eine historische Wäscherei in Lyon, die 1970 von Paul Bocuse zum Restaurant umgebaut wurde",
        answerD = "Das Restaurant von Heston Blumenthal in Bray, England, mit revolutionärer Molekularküche",
        correctAnswer = 1,
        explanation = "The French Laundry in Yountville, Napa Valley, Kalifornien, wurde 1994 von Thomas Keller übernommen und ist seither eines der bedeutendsten Restaurants der Welt. Es erhielt als eines der ersten amerikanischen Restaurants drei Michelin-Sterne und wurde mehrfach zum besten Restaurant der Welt gewählt. Keller ist für sein puristisches, produktzentriertes Kochen bekannt.",
        difficulty = 3,
        funFact = "Das French Laundry war tatsächlich eine Wäscherei — erbaut 1900. Thomas Keller kaufte das Gebäude und behielt den historischen Namen, der heute weltweit für Kochkunst steht."
    ),

    // Question 15 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "René Redzepi und Noma gelten als Begründer der 'New Nordic Cuisine'. Welche Kernprinzipien definieren diesen Kochstil?",
        answerA = "Ausschließliche Nutzung fernöstlicher Umami-Zutaten mit skandinavischen Präsentationstechniken",
        answerB = "Hauptsächlich Fisch und Meeresfrüchte, kombiniert mit molekularen Techniken aus der Haute Cuisine",
        answerC = "Traditionelle dänische Hausmannskost mit modernem Plating und internationalen Gewürzen",
        answerD = "Wildsammeln, saisonale lokale Zutaten aus dem Norden, Fermentation und die Natur als Inspirationsquelle",
        correctAnswer = 3,
        explanation = "Das 2004 gegründete Noma in Kopenhagen revolutionierte die Gastronomie mit den Prinzipien der New Nordic Cuisine: ausschließlich nordische Zutaten (Birke, Wald-Kräuter, Flechten, Wildpflanzen), konsequente Saisonalität, intensive Fermentationsforschung und die Philosophie, dass Natur und Ort den Geschmack definieren. Das 2010 erschienene 'New Nordic Manifesto' wurde von 12 Köchen aus Skandinavien unterzeichnet.",
        difficulty = 3,
        funFact = "Noma wurde viermal zum 'Besten Restaurant der Welt' gewählt (2010, 2011, 2012, 2014). René Redzepi kündigte 2023 an, Noma in ein Forschungslabor umzuwandeln — der reguläre Restaurantbetrieb wurde 2024 eingestellt."
    ),

    // Question 16 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist die 'World's 50 Best Restaurants'-Liste und wie unterscheidet sich ihre Methodik vom Guide Michelin?",
        answerA = "Eine staatliche UNESCO-Liste basierend auf kulturellem Erbe der Gastronomie",
        answerB = "Eine jährliche Rangliste von William Reed Business Media basierend auf Abstimmungen von ca. 1.080 Gastro-Experten weltweit",
        answerC = "Eine Michelin-Subliste für besonders innovative Restaurants außerhalb der klassischen Sterneküche",
        answerD = "Eine Zuschauerwahl via Online-Abstimmung vergleichbar mit dem Eurovision Song Contest",
        correctAnswer = 1,
        explanation = "The World's 50 Best Restaurants (seit 2002, William Reed Business Media/Restaurant Magazine) beruht auf anonymen Stimmen von ca. 1.080 Gastronomen, Kritikern, Köchen und Restaurantbesuchern aus 27 Regionen. Jeder Stimmberechtigte darf maximal 10 Restaurants nennen, mindestens 4 davon außerhalb seiner Heimatregion. Dies unterscheidet sich fundamental von der Michelin-Inspektor-Methode.",
        difficulty = 3,
        funFact = "Das dänische Noma dominierte die Liste jahrelang, gefolgt von El Celler de Can Roca (Girona). Kritiker bemängeln, dass die Abstimmungsberechtigten selbst Restaurants besitzen und gegenseitig füreinander stimmen könnten."
    ),

    // Question 17 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Restaurant der Gebrüder Roca in Girona wurde 2013 und 2015 zum 'Besten Restaurant der Welt' gewählt?",
        answerA = "Can Fabes",
        answerB = "Mugaritz",
        answerC = "El Celler de Can Roca",
        answerD = "Arzak",
        correctAnswer = 2,
        explanation = "El Celler de Can Roca in Girona (Katalonien, Spanien) der Brüder Joan, Josep und Jordi Roca wurde 2013 und 2015 zum 'Besten Restaurant der Welt' (World's 50 Best) gewählt und hält drei Michelin-Sterne. Die drei Brüder teilen Verantwortlichkeiten: Joan leitet die Küche, Josep den Weinkeller (einer der besten Sommeliers der Welt), Jordi die Patisserie.",
        difficulty = 3,
        funFact = "Das Restaurant befindet sich buchstäblich nebenan dem kleinen Restaurant, in dem ihre Eltern jahrzehntelang katalanische Hausmannskost kochten — 'Can Roca' bedeutet 'Haus Roca'."
    ),

    // Question 18 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Osteria Francescana' und welcher Koch führt es?",
        answerA = "Ein 3-Sterne-Restaurant in Modena, Italien, geführt von Massimo Bottura — zweimal Bestes Restaurant der Welt",
        answerB = "Ein 3-Sterne-Restaurant in Rom, geführt von Heinz Beck, bekannt für 'leichte Mediterrane Küche'",
        answerC = "Ein 2-Sterne-Restaurant in Florenz, geführt von Antonino Cannavacciuolo, bekannt für sizilianische Fusion",
        answerD = "Ein 3-Sterne-Restaurant in Venedig, geführt von Giorgio Locatelli, auf Fischküche spezialisiert",
        correctAnswer = 0,
        explanation = "Die Osteria Francescana in Modena (Italien) von Massimo Bottura wurde 2016 und 2018 zum 'Besten Restaurant der Welt' gewählt und hält drei Michelin-Sterne. Bottura verbindet tiefe Kenntnis der emilianischen Küche (Parmigiano Reggiano, Aceto Balsamico, Cotechino) mit zeitgenössischer Kunst und avantgardistischer Technik. Sein Gericht 'Oops! I Dropped the Lemon Tart' ist weltberühmt.",
        difficulty = 3,
        funFact = "Bottura engagiert sich stark gegen Lebensmittelverschwendung: Seine Initiative 'Food for Soul' eröffnet Refettorios, wo übrig gebliebene Lebensmittel von Spitzenköchen zu Mahlzeiten für Obdachlose verarbeitet werden."
    ),

    // Question 19 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher deutschsprachige Koch war der erste überhaupt, der drei Michelin-Sterne erhielt, und in welchem Restaurant?",
        answerA = "Harald Wohlfahrt im Traube Tonbach, Baiersbronn",
        answerB = "Dieter Müller im Schlosshotel Lerbach",
        answerC = "Eckart Witzigmann im Restaurant Aubergine in München",
        answerD = "Heinz Winkler in der Residenz Heinz Winkler in Aschau",
        correctAnswer = 2,
        explanation = "Eckart Witzigmann war 1979 der erste deutschsprachige Koch überhaupt, der drei Michelin-Sterne erhielt — mit seinem Restaurant 'Aubergine' in München. Er gilt als 'Koch des Jahrhunderts' und 'Vater der neuen deutschen Küche'. Witzigmann brachte die Prinzipien der Nouvelle Cuisine nach Deutschland und machte die deutsche Gastronomie international salonfähig.",
        difficulty = 3,
        funFact = "Witzigmann verlor seine Sterne 1994 durch einen privaten Skandal — nicht wegen seiner Kochkunst. Sein ehemaliger Schüler Helmut Thieltges und andere trugen sein kulinarisches Erbe weiter."
    ),

    // Question 20 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Heston Blumenthal ist bekannt für sein Restaurant 'The Fat Duck' in Bray (England). Welches Konzept revolutionierte er mit Gerichten wie 'Sound of the Sea'?",
        answerA = "Zero-Waste-Küche mit Verwertung jedes Zutatenteils bis zum letzten Gramm",
        answerB = "Streng vegane Küche mit molekularen Techniken als Ersatz für tierische Produkte",
        answerC = "Historische englische Rezepte aus dem Mittelalter mit modernen Techniken rekonstruiert",
        answerD = "Multisensorisches Essen, das alle fünf Sinne anspricht, inklusive Klang, Geruch und Textur",
        correctAnswer = 3,
        explanation = "Heston Blumenthals Philosophie ist 'multisensorisches Kochen': Das Gericht 'Sound of the Sea' wird mit einem iPod serviert, auf dem Meeresgeräusche gespielt werden — Studien zeigen, dass dies den Geschmack des Meeresfrüchte-Gerichts verstärkt. Blumenthal arbeitet mit Psychologen und Neurowissenschaftlern zusammen und nutzt wissenschaftliche Erkenntnisse über Wahrnehmung gezielt im Gericht-Design.",
        difficulty = 3,
        funFact = "The Fat Duck wurde 2009 wegen eines Norovirus-Ausbruchs vorübergehend geschlossen — über 500 Gäste erkrankten. Blumenthal schrieb damals: 'Das Schlimmste, was einem Koch passieren kann, ist, seine Gäste krank zu machen.'"
    ),

    // Question 21 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Bocuse d'Or' und wie ist der Wettbewerb strukturiert?",
        answerA = "Ein jährliches Gala-Dinner in Paris, bei dem Köche aus 10 Ländern für Staatsgäste kochen",
        answerB = "Ein zweijährlicher Koch-Weltmeisterschatts-Wettbewerb in Lyon, bei dem 24 Länder je einen Koch entsenden, der 5,5 Stunden lang zwei Gänge für eine Jury zubereitet",
        answerC = "Ein Michelin-Sonderwettbewerb für 3-Sterne-Köche, die ihre innovativsten Gerichte vorstellen",
        answerD = "Ein Schülerwettbewerb für Kochazubis unter 25 Jahren, benannt nach Paul Bocuse",
        correctAnswer = 1,
        explanation = "Der Bocuse d'Or (seit 1987, alle zwei Jahre in Lyon) gilt als inoffizielle Koch-Weltmeisterschaft. 24 Nationen entsenden je einen Kandidaten mit einem Commis-Koch. In 5 Stunden und 35 Minuten müssen zwei Gänge (Fisch und Fleisch) für eine 24-köpfige Jury gekocht werden. Die Präsentation auf großen Silberplatten (Plat) ist Teil der Bewertung.",
        difficulty = 3,
        funFact = "Frankreich und Norwegen haben den Bocuse d'Or am häufigsten gewonnen. Den USA gelang der Sieg 2017 erstmals — nach jahrelangem intensivem Training nach dem Vorbild der Olympischen Spiele."
    ),

    // Question 22 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kaiseki' und welche Philosophie steht hinter dieser japanischen Haute Cuisine?",
        answerA = "Eine japanische Fast-Food-Tradition basierend auf Ramen und Sushi, die weltweit verbreitet wurde",
        answerB = "Eine Fusionstechnik, die japanische Zutaten mit französischen Kochtechniken kombiniert, geprägt durch Nobu Matsuhisa",
        answerC = "Eine multi-gängige japanische Haute Cuisine mit streng saisonaler Philosophie, die aus der Teezeremonie entstammt",
        answerD = "Eine Rōjū-Zeremonie aus der Edo-Periode, die ausschließlich an kaiserlichen Höfen praktiziert wird",
        correctAnswer = 2,
        explanation = "Kaiseki (懐石) ist eine japanische Haute Cuisine mit streng saisonalem Konzept, die aus der Teezeremonie entwickelt wurde. Jedes Gericht repräsentiert einen Aspekt der Natur und der Jahreszeit. Berühmte Kaiseki-Restaurants wie Kyoto Kitcho und Kikunoi halten mehrere Michelin-Sterne.",
        difficulty = 3,
        funFact = "Das Wort Kaiseki bedeutet ursprünglich 'heiße Steine in der Brust' — buddhistische Mönche legten sich warme Steine auf den Bauch, um Hunger während langer Fastperioden zu lindern. Aus dieser bescheidenen Mahlzeit entwickelte sich eine der raffiniertesten Küchen der Welt."
    ),

    // ── KLASSISCHE HAUTE CUISINE & ESCOFFIER ─────────────────────────────────

    // Question 23 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Wer war Marie-Antoine Carême (1784–1833) und welchen revolutionären Beitrag leistete er zur europäischen Kochkunst?",
        answerA = "Er kodifizierte die Grande Cuisine, systematisierte die klassischen Saucen und erhob Kochen zur anerkannten Kunstform",
        answerB = "Er erfand das System der Brigadekueche und schrieb den 'Guide Culinaire'",
        answerC = "Er eröffnete das erste Pariser Restaurant und prägte den Begriff 'Restaurant'",
        answerD = "Er führte die Nouvelle Cuisine in Frankreich ein und arbeitete für Napoleon Bonaparte",
        correctAnswer = 0,
        explanation = "Marie-Antoine Carême (1784–1833) ist der Begründer der Grande Cuisine. Er arbeitete für Napoleon Bonaparte, den Zaren Alexander I. und den britischen König Georg IV. Carême systematisierte die Saucen in vier 'Mutterfonds', entwickelte die Kochmütze (Toque blanche) und schrieb monumentale Werke wie 'L'Art de la cuisine française' (5 Bände).",
        difficulty = 3,
        funFact = "Carême wuchs in extremer Armut in Paris auf — er war eines von 25 Kindern. Sein Vater setzte ihn im Alter von 10 Jahren auf der Straße aus, mit den Worten: 'Geh, die Welt gehört Talenten'. Er begann als Lehrling in einer Garküche."
    ),

    // Question 24 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Auguste Escoffier (1846–1935) reformierte die klassische Küche. Was sind die fünf Grundsaucen ('Sauces Mères') der Haute Cuisine nach seiner Kodifikation?",
        answerA = "Béchamel, Velouté, Espagnole, Demi-Glace, Allemande",
        answerB = "Béchamel, Velouté, Espagnole, Sauce Tomate, Hollandaise",
        answerC = "Fond brun, Fond blanc, Fumet, Jus, Nage",
        answerD = "Béchamel, Bordelaise, Béarnaise, Sauce Vin Blanc, Chasseur",
        correctAnswer = 1,
        explanation = "Escoffier kodifizierte in seinem 'Guide Culinaire' (1903) fünf Grundsaucen (Sauces Mères): Béchamel (Mehlschwitze + Milch), Velouté (Mehlschwitze + heller Fond), Espagnole (dunkle Mehlschwitze + Kalbsfond), Sauce Tomate und Hollandaise (Emulsion aus Butter und Eigelb). Aus diesen fünf leiten sich über 200 klassische Ableitungssaucen ab.",
        difficulty = 3,
        funFact = "Escoffier erfand im Savoy Hotel London für die australische Sopranistin Nellie Melba das 'Pêche Melba' (Pfirsich auf Vanilleeis mit Himbeersauce) und den 'Toast Melba' — beides nach ihr benannt."
    ),

    // Question 25 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Brigade de Cuisine' (Küchenbrigade) und wer hat sie als System eingeführt?",
        answerA = "Ein militärisches Ausbildungssystem für Köche in der Schweizer Garde; eingeführt von François Vatel",
        answerB = "Eine Vereinigung französischer Köche, gegründet 1900 zur Standardisierung von Rezepten",
        answerC = "Ein Rotationssystem, bei dem Köche alle 6 Monate die Station wechseln; eingeführt von Paul Bocuse",
        answerD = "Ein hierarchisches Küchenorganisationssystem mit festen Positionen (Chef de Cuisine, Sous-Chef, etc.); eingeführt von Auguste Escoffier",
        correctAnswer = 3,
        explanation = "Auguste Escoffier führte im Savoy Hotel London (ab 1890) das Brigaden-System ein, inspiriert vom Militär: Chef de Cuisine, Sous-Chef, Chef de Partie (für jede Station: Poissonnier, Saucier, Rôtisseur, Garde Manger, Pâtissier, Entremetier), Commis und Apprenti. Dieses hierarchische System ermöglichte die effiziente Organisation großer Hotelküchen und ist bis heute Standard.",
        difficulty = 3,
        funFact = "Escoffier und César Ritz (Gründer der Ritz-Hotels) arbeiteten gemeinsam im Savoy und später im Ritz Paris und Carlton London — ein legendäres Duo, das den modernen Luxushotel-Standard definierte."
    ),

    // Question 26 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Demi-Glace' in der klassischen französischen Küche und wie wird er hergestellt?",
        answerA = "Eine leichte Brühe aus Hühnerknochen und Kräutern, die als Suppengrundlage dient",
        answerB = "Eine konzentrierte Kalbsfleischsauce, hergestellt durch 50%-ige Reduktion einer Espagnole mit braunem Kalbsfond",
        answerC = "Ein Gelee aus Kalbsfüßen, das als Überzug für Pasteten und Terrinen verwendet wird",
        answerD = "Eine Emulsionssauce auf Basis von Eigelb und Butter mit Reduktion von Weißwein und Essig",
        correctAnswer = 1,
        explanation = "Demi-Glace ('halbe Glasur') ist eine der wichtigsten Grundsaucen der klassischen Küche: Man reduziert Espagnole-Sauce mit gleichem Anteil braunem Kalbsfond (Fond brun) auf die Hälfte (daher 'Demi'), bis eine sirupartige, glänzende, intensiv schmeckende Sauce entsteht. Sie ist Basis für Dutzende klassische Ableitungssaucen wie Sauce Bordelaise oder Sauce Périgueux.",
        difficulty = 3,
        funFact = "Echtes Demi-Glace aus rostfrei braunen Knochen braucht 24–36 Stunden Kochzeit. In modernen Restaurantküchen wird oft industrielles Demi-Glace-Pulver als Abkürzung verwendet — was Puristen als Sakrileg betrachten."
    ),

    // Question 27 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Mise en Place' und welche philosophische Bedeutung hat es in der Profigastronomie?",
        answerA = "Das finale Anrichten und Dekorieren des Tellers unmittelbar vor dem Service",
        answerB = "Die Stellprobe der Gerichte auf dem Buffet vor der Eröffnung des Restaurants",
        answerC = "Das vollständige Vorbereiten aller Zutaten, Geräte und Abläufe vor Beginn des Kochens — Grundlage jeder professionellen Küche",
        answerD = "Das wöchentliche Reinigen und Einräumen der Speisekammer nach einem definierten System",
        correctAnswer = 2,
        explanation = "'Mise en place' (Französisch: 'Alles an seinen Platz') bezeichnet in der Profiküche die vollständige Vorbereitung vor Servicebeginn: Zutaten gewogen, geschnitten, portioniert; alle Werkzeuge bereit; Saucen angesetzt; Fond reduziert. Es ist keine bloße Arbeitsmethode, sondern eine Lebensphilosophie — Köche sprechen von 'mise en place' als Geisteszustand: Vorausdenken, Ordnung, Kontrolle.",
        difficulty = 3,
        funFact = "Thomas Keller widmete seinem Buch 'The French Laundry Cookbook' ein ganzes Kapitel der Mise en Place — er bezeichnet sie als 'die Seele der professionellen Küche, ohne die alles zusammenbricht'."
    ),

    // Question 28 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Consommé' und wie unterscheidet es sich von einer normalen Bouillon?",
        answerA = "Eine durch Klärung mit Hackfleisch und Eiweiß vollständig transparente, kräftige Kraftbrühe",
        answerB = "Eine ungeklärte Fleischbrühe mit Gemüse, serviert als einfache Vorspeise",
        answerC = "Eine vegetarische Gemüsebrühe, zweifach reduziert für intensiveren Geschmack",
        answerD = "Ein leichter Fischfond, der als Basis für Fischsaucen der klassischen Küche dient",
        correctAnswer = 0,
        explanation = "Consommé ist eine durch Klärung gewonnene glasklare Brühe. Für die Klärung wird eine 'Clearmeat' aus Hackfleisch (mager), Eiweiß, Mirepoix und Tomatenpüree in die heiße Brühe gerührt. Das Eiweiß denaturiert und bindet Trübstoffe durch Adsorption; das entstehende 'Raft' (Floß) wird abgesiebt. Das Ergebnis: ein kristallklares, intensives Consommé — die höchste Disziplin der klassischen Brühentechnik.",
        difficulty = 3,
        funFact = "Escoffiers berühmtestes Consommé war das 'Consommé Madrilène' — mit Tomaten geklärte Rinderbrühe, serviert als heißes oder kaltes Gelée. Es war Statussymbol in Pariser Gourmandrestaurants der Belle Époque."
    ),

    // Question 29 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Foie Gras' und welche zwei Hauptarten existieren im kulinarischen Handel?",
        answerA = "Kalbs- oder Rinderleber, marmoriert durch spezielle Fütterung; als 'entier' (ganz) oder 'mousse' (als Schaum)",
        answerB = "Fettleber von Ente (Canard) oder Gans (Oie), durch Gavage (Zwangsfütterung) gewonnen; als 'foie gras entier' oder 'bloc de foie gras'",
        answerC = "Geräucherte Schweineleber nach elsässischer Tradition; 'foie gras frais' (frisch) oder 'foie gras mi-cuit' (halbgar)",
        answerD = "Spezialgericht aus Geflügelherzen und -lebern; in Terrine oder als Pâté en croûte",
        correctAnswer = 1,
        explanation = "Foie gras (Französisch: 'fette Leber') wird durch Gavage (Zwangsmast) von Enten (Canard) oder Gänsen (Oie) gewonnen: Die Tiere werden mehrmals täglich mit Mais gestopft, wodurch die Leber auf das 10-fache anschwillt. Qualitätsstufen: 'Foie gras entier' (ganze, unverarbeitete Leber), 'Bloc de foie gras' (gepresstes Stück), 'Mousse de foie gras' (Schaum mit anderen Zutaten). Gavage ist in Deutschland verboten.",
        difficulty = 3,
        funFact = "Die Technik der Zwangsmast stammt aus dem alten Ägypten — Hieroglyphen zeigen Menschen, die Gänse mit Feigen stopfen. Sie fand ihren Weg durch jüdische Händler nach Elsass-Lothringen, wo Foie Gras zur regionalen Spezialität wurde."
    ),

    // Question 30 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Tasting Menu' (Dégustation) in der Spitzengastronomie und wann wurde es zum Standard der 3-Sterne-Küche?",
        answerA = "Ein 3-Gänge-Menü mit Wahl zwischen Fleisch und Fisch, standardisiert nach dem Ersten Weltkrieg",
        answerB = "Ein wöchentlich wechselndes Mittagsmenü zu günstigem Preis, das handwerkliches Kochen zeigt",
        answerC = "Ein Buffet-Konzept, bei dem Gäste kleine Portionen aller Gerichte der Speisekarte probieren können",
        answerD = "Ein mehrgängiges (6–20 Gänge), festgelegtes Menü ohne Wahlmöglichkeit, seit den 1970er/80er Jahren in der Spitzengastronomie dominant",
        correctAnswer = 3,
        explanation = "Das Tasting Menu (Menu Dégustation) entwickelte sich in den 1970/80er Jahren mit der Nouvelle Cuisine. Köche wie Joël Robuchon und Alain Ducasse erkannten, dass kurze Einzelportionen die kreative Aussage besser transportieren als große Hauptgerichte. Heute sind 8–15 Gänge Standard in 3-Sterne-Restaurants; einige bieten bis zu 20 Gänge an.",
        difficulty = 3,
        funFact = "Das kürzeste Michelin-3-Sterne-Menü der Welt bietet Sukiyabashi Jiro in Tokyo an: Jiro Ono serviert ca. 20 Nigiris in unter 30 Minuten — jedes makellos, kein Wort wird gesprochen, kein Gang gewählt."
    ),

    // ── MOLEKULARKÜCHE & EL BULLI ─────────────────────────────────────────────

    // Question 31 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Ferran Adrià und das elBulli gelten als Wegbereiter der modernen Molekularküche. In welchen Jahren wurde das elBulli zum 'Besten Restaurant der Welt' gewählt und wann schloss es?",
        answerA = "2002, 2006, 2007, 2008, 2009 — Schliessung 2011",
        answerB = "1998–2002 — Schliessung 2005",
        answerC = "2004–2008 — Schliessung 2010",
        answerD = "2000–2004 — Schliessung 2008",
        correctAnswer = 0,
        explanation = "Das elBulli in Roses (Katalonien) von Ferran Adrià wurde in der World's 50 Best Restaurants Liste in den Jahren 2002, 2006, 2007, 2008 und 2009 zum besten Restaurant der Welt gewählt. Das Restaurant schloss 2011 freiwillig und wurde in die Forschungsstiftung 'elBulli Foundation' umgewandelt. Adrià revolutionierte die Gastronomie mit über 1.800 neuen Techniken.",
        difficulty = 3,
        funFact = "Das elBulli war nur 6 Monate im Jahr geöffnet, bot 50 Plätze pro Abend und erhielt jährlich über 2 Millionen Reservierungsanfragen für ca. 8.000 verfügbare Plätze — eine Buchungsquote von 0,4%."
    ),

    // Question 32 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Gelification' mit Agar-Agar in der Molekularküche und worin unterscheidet sie sich von Gelatine?",
        answerA = "Agar-Agar ist tierischen Ursprungs und ergibt weichere Gele als Gelatine; es schmilzt bereits bei 35°C",
        answerB = "Agar-Agar ist identisch mit Gelatine, aber 10-mal stärker konzentriert und daher sparsamer dosierbar",
        answerC = "Agar-Agar ist pflanzlichen Ursprungs (Rotalgen), ergibt feste, klare Gele und schmilzt erst bei 85°C — Gele bleiben daher auch warm stabil",
        answerD = "Agar-Agar wird aus Maiskörnern gewonnen und bildet thermoreversible Gele, die bei Kühlung erstarren und bei Erwärmung schmelzen",
        correctAnswer = 2,
        explanation = "Agar-Agar (aus japanischen und australischen Rotalgen) bildet Gele mit Schmelzpunkt ca. 85°C und Geliertemperatur ca. 32–40°C. Dies ermöglicht warme Gele: Ein Agar-Agar-Gel kann auf dem Teller bei 60°C serviert werden und behält seine Form. Gelatine (aus Tierknochen, Kollagen) schmilzt dagegen bereits bei 37°C — also auf der Zunge, was das cremige Mundgefühl erzeugt.",
        difficulty = 3,
        funFact = "Ferran Adrià nutzte Agar-Agar für seine 'Hot Jellies' — warme Gels, die Gäste verwirrten, weil sie optisch wie feste Sulze aussahen, aber heiß serviert wurden. Diese Umkehrung von Erwartungen war sein Markenzeichen."
    ),

    // Question 33 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sous Vide' (Vakuumgaren) und welche zwei Pioniere entwickelten das Verfahren in den 1970er Jahren unabhängig voneinander?",
        answerA = "Ein Druckgarverfahren für schnelleres Kochen bei 180°C; entwickelt von Heston Blumenthal und Ferran Adrià",
        answerB = "Einvakuumieren von Lebensmitteln zur längeren Haltbarkeit ohne Kühlung; erfunden von Louis Pasteur",
        answerC = "Ein Räucherverfahren unter Vakuum für intensivere Aromaaufnahme; entwickelt von Thomas Keller",
        answerD = "Garen in versiegelten Plastikbeuteln bei präziser niedriger Temperatur im Wasserbad; entwickelt von Bruno Goussault (Wissenschaftler) und Georges Pralus (Koch)",
        correctAnswer = 3,
        explanation = "Sous Vide ('unter Vakuum') wurde 1974 von zwei Personen unabhängig entwickelt: Lebensmittelwissenschaftler Bruno Goussault erforschte die Methode für industrielle Anwendungen; Koch Georges Pralus entdeckte sie zufällig bei der Suche nach einem Weg, Foie Gras ohne Fett- und Gewichtsverlust zu garen. Heute ist Sous Vide Standard in Spitzenrestaurants weltweit.",
        difficulty = 3,
        funFact = "Thomas Keller vom French Laundry popularisierte Sous Vide in den USA nach einem Gespräch mit Bruno Goussault und widmete dem Thema das vollständige Kochbuch 'Under Pressure'."
    ),

    // Question 34 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dehydrierung' als Kochtechnik in der Molekularküche und welche Texturen ermöglicht sie?",
        answerA = "Das Einfrieren von Lebensmitteln unter Vakuum (Gefriertrocknung) für crunchige, luftige Chips",
        answerB = "Das Entziehen von Feuchtigkeit bei 40–70°C im Dörrautomat oder Backofen, wodurch knusprige Chips, Pulver und Crackers entstehen",
        answerC = "Das Kochen von Lebensmitteln ohne Zugabe von Wasser oder Feuchtigkeit in versiegelten Behältern",
        answerD = "Eine Methode zum Konzentrieren von Säften durch osmotische Trocknung mit Salz",
        correctAnswer = 1,
        explanation = "Dehydrierung (Trocknung bei 40–70°C über Stunden/Tage) entzieht Lebensmitteln Wasser und konzentriert Aromen extrem. In der Molekularküche entstehen so: Tomatenpulver, Parmesanchips, getrocknete Olivenöl-Crumble, frittierte Kräuterpulver. Die Methode erzeugt Texturen (knusprig, spröde, zerfallend), die durch andere Techniken nicht erreichbar sind.",
        difficulty = 3,
        funFact = "Ferran Adrià entwickelte 'Olivenöl-Krokant' durch Dehydrierung einer Olivenöl-Maltodextrin-Mischung — ein Öl, das man kauen kann. Das scheinbar unmögliche wurde zur Signatur-Technik des elBulli."
    ),

    // Question 35 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Espuma' (Schaum) als Küchentechnik und wie hat Ferran Adrià ihn für die Moderne Gastronomie neu definiert?",
        answerA = "Mithilfe eines ISI-Siphons und Stickstoffkartuschen lassen sich beliebige Flüssigkeiten zu leichten, stabilen Schäumen ohne Sahne oder Eiweiß aufschlagen",
        answerB = "Geschlagene Sahne mit verschiedenen Aromen — eine Technik, die seit dem 19. Jahrhundert existiert und kaum verändert wurde",
        answerC = "Eine Emulsion aus Eiweiß und Zucker, die in der Patisserie als Baiser-Grundlage dient",
        answerD = "Ein durch Fermentation entstehender natürlicher Schaum, wie er bei Sauerteig oder Bier entsteht",
        correctAnswer = 0,
        explanation = "Ferran Adrià revolutionierte den Küchenschaum (Espuma) in den 1990er Jahren: Mithilfe eines ISI-Siphons und Stickstoffkartuschen lassen sich Flüssigkeiten mit beliebigen Aromen (Kartoffel, Pilze, Olivenöl, Parmesan) zu leichten, stabilen Schäumen ohne Sahne oder Eiweiß aufschlagen. So entstehen 'Kartoffelschaum' oder 'Schwarztrüffelschaum' — die Quintessenz des Geschmacks in luftiger Form.",
        difficulty = 3,
        funFact = "Adrià inspirierte sich beim ISI-Siphon aus der Barkultur — Barkeeper nutzten ihn für Sahneaufschlag. Sein 'Kartoffel-Trüffelschaum' gilt als eines der einflussreichsten Gerichte der modernen Gastronomiegeschichte."
    ),

    // Question 36 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kryokonzentration' in der Küchenchemie und welche Anwendung hat sie in der Spitzengastronomie?",
        answerA = "Das Ausfällen von Proteinen durch schnelles Abkühlen auf nahe 0°C in Fleischfonds",
        answerB = "Das Gefrieren von Fruchtsäften und Pressen des Eiskernes zur Gewinnung natürlicher Fruchtzucker",
        answerC = "Das Einfrieren von Flüssigkeiten und Abschöpfen des aufgetauten Konzentrats, um Aromen extrem zu intensivieren",
        answerD = "Eine Technik zur Herstellung von Eiscreme ohne Zucker durch osmotisches Gefrieren mit Salzlake",
        correctAnswer = 2,
        explanation = "Bei der Kryokonzentration wird eine Flüssigkeit (z. B. Fond, Saft, Wein) eingefroren. Beim langsamen Auftauen schmilzt zuerst der aromenreiche, weniger kristallisierte Teil — dieser wird aufgefangen. Das Ergebnis ist ein extrem konzentriertes, intensiv aromatisches Konzentrat ohne Wärmeschäden. René Redzepi nutzt die Methode für Kräuter- und Pflanzenessige in Noma.",
        difficulty = 3,
        funFact = "Die Technik stammt aus der Weinherstellung: Eiswein wird gewonnen, indem man Trauben nach dem ersten Frost liest — das Wasser gefriert in den Beeren, der Zuckermost bleibt flüssig und konzentriert sich beim Pressen."
    ),

    // Question 37 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' als fünfte Grundgeschmacksqualität und welche Lebensmittel enthalten die höchsten natürlichen Konzentrationen der auslösenden Verbindung?",
        answerA = "Ein metallischer Geschmack durch Eisenverbindungen in rotem Fleisch; höchste Konzentration in Blut",
        answerB = "Ein fettig-cremiger Geschmack durch Fettsäuren; höchste Konzentration in Butter und Olivenöl",
        answerC = "Ein erdiger Geschmack durch Terpene; höchste Konzentration in Trüffeln und Pilzen",
        answerD = "Ein herzhafter 'Fleischgeschmack' ausgelöst durch Glutaminsäure/Glutamate; höchste Konzentrationen in Parmesan, Miso, Kombu, getrockneten Tomaten und Sojasauce",
        correctAnswer = 3,
        explanation = "Umami (Japanisch: 'köstlicher Geschmack') wurde 1908 von Prof. Kikunae Ikeda an der Universität Tokio aus Kombu (Seetang) isoliert. Der Auslöser ist L-Glutaminsäure (Glutamat) und Nukleotide (IMP, GMP). Lebensmittel mit höchsten natürlichen Glutamat-Konzentrationen: Parmesan (~1.200 mg/100g), Kombu (~3.200 mg/100g), getrocknete Tomaten, Sojasoße, Miso, Bonitoflocken.",
        difficulty = 3,
        funFact = "Ikeda entdeckte Umami, als er bemerkte, dass der Dashi-Fond seiner Frau einen Geschmack hatte, der sich nicht durch süß, sauer, salzig oder bitter erklären ließ. Nach langer Forschung isolierte er Glutaminsäure als Ursache — ein Durchbruch, der die Lebensmittelwissenschaft veränderte."
    ),

    // Question 38 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fermentation' in der modernen Avantgarde-Küche (Noma, Mugaritz) und warum unterscheidet sie sich von klassischer Fermentation?",
        answerA = "Einfaches Einlegen in Essig oder Salz zur Konservierung — gleich wie in der Hausmannskost",
        answerB = "Gezielte Nutzung von Mikroorganismen (Koji-Schimmel, Lactobazillen, Essigsäurebakterien) zur Erzeugung neuer Aromen, Texturen und Umami-Verbindungen — weit über Konservierung hinaus",
        answerC = "Das Reifen von Fleisch bei 4°C über mehrere Wochen ohne Zugabe von Mikroorganismen",
        answerD = "Das Gären von Gemüse unter Luftabschluss mit Salz ausschließlich für Probiotika und Gesundheitswirkung",
        correctAnswer = 1,
        explanation = "In der modernen Avantgarde-Küche ist Fermentation eine kreative Forschungsmethode: Nomas 'Fermentation Lab' entwickelte Koji-fermentiertes Rindfleisch (Umami-Explosion), Insekten-Garum (wie Fischsauce), fermentierte Birkensäfte. Koji (Aspergillus oryzae) auf Getreide, Nüssen oder Fleisch kultiviert erzeugt Enzyme, die Proteine zu Glutamaten abbauen — eine völlig neue Umami-Dimension.",
        difficulty = 3,
        funFact = "Das Noma-Fermentationsbuch (2018) von René Redzepi und David Zilber gilt als eines der einflussreichsten Kochbücher des 21. Jahrhunderts — es ist kein Rezeptbuch, sondern ein wissenschaftliches Kompendium über mikrobielle Prozesse in der Küche."
    ),

    // Question 39 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Texturas' und welche Rolle spielt das Unternehmen in der Molekularküche?",
        answerA = "Ein von Albert Adrià (Bruder von Ferran) gegründetes Unternehmen, das professionelle Hydrokolloide und molekulare Zutaten für Köche vertreibt",
        answerB = "Ein Pariser Labor, das Escoffiers Grundsaucen in moderne Pulver umgewandelt hat",
        answerC = "Eine Kooperative katalanischer Restaurantbesitzer zur Förderung regionaler Zutaten",
        answerD = "Ein wissenschaftliches Forschungsinstitut an der Universität Barcelona für Lebensmitteltechnologie",
        correctAnswer = 0,
        explanation = "Albert Adrià (Bruder von Ferran) und das elBulli-Team gründeten Texturas, um die im elBulli entwickelten Techniken kommerziell verfügbar zu machen. Das Unternehmen vertreibt professionelle Hydrokolloide (Agar, Algin, Kappa, Iota-Carrageen, Methylcellulose, Xanthan), Emulgatoren und Gelierungsmittel. Texturas demokratisierte die Molekularküche — jeder Koch konnte mit diesen Zutaten experimentieren.",
        difficulty = 3,
        funFact = "Albert Adrià gilt als einer der kreativsten Konditoren der Welt — er übernahm nach der Schliessung des elBulli mehrere erfolgreiche Konzepte in Barcelona, darunter 'Tickets' und 'Bodega 1900'."
    ),

    // Question 40 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Reverse Spherification' (umgekehrte Sphärisierung) und welchen Vorteil hat sie gegenüber der direkten Methode?",
        answerA = "Das Formen von Sphären in heißem statt kaltem Wasser für dickere Gelschichten",
        answerB = "Das Einfrieren von Alginat-Kugeln in flüssigem Stickstoff für perfektere Sphären",
        answerC = "Das Tauchen eines calciumhaltigen Produkts (mit Calciumlactat) in ein Natriumalginat-Bad — ermöglicht dauerhaft flüssige Kerne und funktioniert auch mit sauren Flüssigkeiten",
        answerD = "Das Erzeugen von Sphären ohne Chemikalien durch rein mechanischen Druck in einer Gießform",
        correctAnswer = 2,
        explanation = "Bei direkter Sphärisierung (Alginat-Flüssigkeit in Calciumchlorid) entsteht die Gelschicht von außen nach innen und setzt sich fort — der Kern verdickt sich beim Warten. Bei umgekehrter Sphärisierung (Produkt mit Calciumlactat in Alginat-Bad) bildet sich die Membran nur an der Außenseite und stoppt — der Kern bleibt dauerhaft flüssig. Vorteil: dickere Schalen, keine Weitergelierung, geeignet für saure Produkte (Alginat versagt bei pH<4).",
        difficulty = 3,
        funFact = "Ferran Adriàs berühmte 'Olive' — eine perfekte grüne Kugel, die im Mund platzt und flüssiges Olivenöl freisetzt — wurde durch umgekehrte Sphärisierung hergestellt. Es war eines der emblematischsten Gerichte des elBulli."
    ),

    // ── KUECHEN-TECHNIKEN DER STERNEKUECHE ───────────────────────────────────

    // Question 41 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Brunoise' in der klassischen Schneidekunde und welche Maße definieren diesen Schnitt?",
        answerA = "Ein grober Würfelschnitt für Eintöpfe mit 1 x 1 x 1 cm Kantenlänge",
        answerB = "Ein schräger Rollschnitt für Wurzelgemüse mit 2–3 cm Länge",
        answerC = "Ein dünner Scheibenschnitt parallel zur Faser mit 0,5 mm Dicke",
        answerD = "Ein feiner Würfelschnitt mit 1–3 mm Kantenlänge, erzeugt durch vorheriges Julienne-Schneiden",
        correctAnswer = 3,
        explanation = "Brunoise (aus dem Französischen) ist ein feiner Würfelschnitt von 1–3 mm Kantenlänge. Die Technik: erst Julienne (feine Stäbchen), dann rechtwinklig würfeln. 'Fine Brunoise' hat 1–2 mm, 'Regular Brunoise' 3 mm. Verwendung: als Garnitur, in Consommé, als Füllung in Terrinen oder als Aromaträger in Saucen.",
        difficulty = 3,
        funFact = "In der professionellen Ausbildung gilt Brunoise als 'Prüfungsschnitt' — alle Würfel müssen exakt gleich groß sein, sonst garen sie ungleichmäßig. Ein guter Koch kann 1kg Karotten in unter 10 Minuten zu präziser Brunoise schneiden."
    ),

    // Question 42 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Jus' in der modernen Sterneküche und wie unterscheidet er sich von einer klassischen Sauce?",
        answerA = "Ein Jus ist identisch mit einer Demi-Glace — beide Begriffe sind austauschbar",
        answerB = "Ein Jus ist ein konzentrierter, ungebundener Fleisch- oder Gemüsefond ohne Mehlbindung, reduziert auf natürliche Konsistenz durch Kollagen-Gelatine oder Pektin",
        answerC = "Ein Jus ist eine helle, ungeklärte Brühe als Suppengrundlage; Saucen sind immer dunkler und intensiver",
        answerD = "Ein Jus ist ausschließlich aus Zitrusfrüchten gepresster Saft, als Säurekorrektiv in modernen Gerichten",
        correctAnswer = 1,
        explanation = "In der modernen Haute Cuisine bezeichnet 'Jus' einen konzentrierten, klaren Fond ohne klassische Mehlbindung. Der Jus gewinnt seine Konsistenz durch langsames Reduzieren von Kollagen (aus Knochen) zu Gelatine oder Pektin (aus Gemüse). Dies ergibt eine 'natürliche Bindung' — leichter als Demi-Glace, intensiver als Fond.",
        difficulty = 3,
        funFact = "Der Trend zu 'ungebundenen Saucen' (Jus statt klassische Saucen mit Mehlschwitze) stammt aus der Nouvelle Cuisine der 1970er Jahre — Paul Bocuse und Michel Guérard suchten Alternativen zur schweren klassischen Bindung."
    ),

    // Question 43 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tournieren' in der klassischen Küche und für welche Präsentation ist es typisch?",
        answerA = "Das Schnitzen von Gemüse (Karotten, Zucchini, Kartoffeln) in eine gleichmäßige 7-seitige Tonnenform mit fünf Schnittflächen",
        answerB = "Das Panieren und Wenden von Fleisch in einer Pfanne mit Butter",
        answerC = "Das Drehen von Nudelteig auf einer hölzernen Spindel zu gleichmäßig runden Pappardelle",
        answerD = "Das Wenden von gebratenen Filetstücken zur gleichmäßigen Bräunung auf beiden Seiten",
        correctAnswer = 0,
        explanation = "Tournieren (Französisch: 'drehen, formen') ist das Schnitzen von Gemüse in eine charakteristische 7-seitige Barrelform (ca. 5 cm lang, 2 cm breit). Die 7 Schnittflächen ermöglichen gleichmäßiges Garen, weil alle Oberflächen identische Dicke haben. Tourniertes Gemüse war in der klassischen Haute Cuisine obligatorisch als Garnitur für Hauptgerichte.",
        difficulty = 3,
        funFact = "Ein erfahrener Koch kann ein Gemüse in wenigen Sekunden tournieren — Escoffiers 'Guide Culinaire' forderte, dass alle Gemüse für ein 3-Sterne-Hauptgericht in identischer Tournieren-Form vorliegen mussten."
    ),

    // Question 44 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Blanchieren und Abschrecken' als Küchentechnik und warum ist das sofortige Abschrecken in Eiswasser entscheidend?",
        answerA = "Das langsame Erhitzen in heißem Fett gefolgt von Abkühlung auf Raumtemperatur — für zartes Garen von Hülsenfrüchten",
        answerB = "Das Einlegen in Salzlake gefolgt von kaltem Wasser — für Konservierung und Texturverbesserung von Fleisch",
        answerC = "Das kurze Überbrühen mit kochendem Wasser und sofortiges Einlegen in Eiswasser — stoppt Enzymatik, fixiert Chlorophyll und erhält knackige Textur",
        answerD = "Das Pochieren bei 80°C gefolgt von sofortigem Einfrieren — für Portionierbarkeit von Proteinen",
        correctAnswer = 2,
        explanation = "Blanchieren (kurz 30 Sekunden bis 3 Minuten in kochendem Salzwasser) gefolgt von sofortigem Abschrecken in Eiswasser (0°C) ist eine essenzielle Profiküchen-Technik: Der Hitzeschock stoppt alle enzymatischen Prozesse sofort (verhindert Bräunung durch Polyphenoloxidase), fixiert Chlorophyll in seiner grünen Form und erhält die knackige Textur. Ohne Abschrecken kocht das Gemüse weiter im eigenen Dampf.",
        difficulty = 3,
        funFact = "Das Chlorophyll in grünem Gemüse enthält Magnesium im Porphyrin-Ring. Beim Blanchieren wird Magnesium durch Hitze teilweise durch Wasserstoff ersetzt — ohne Abschrecken verliert das Gemüse schnell seine leuchtend grüne Farbe."
    ),

    // Question 45 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Soufflé' und welche physikalischen Prinzipien machen es so technisch anspruchsvoll?",
        answerA = "Eine stabile Mousse, die durch Gelatine und Sahne stabilisiert wird und auch nach Stunden form-stabil bleibt",
        answerB = "Ein gefrorenes Dessert, das durch stickstoffgekühlte Schaumschicht wie ein aufgegangenes Soufflé aussieht",
        answerC = "Ein Konditoreiprodukt aus Mürbeig und Creme Patissière, das beim Backen durch Blätterung des Teiges aufgeht",
        answerD = "Eine Backware aus Béchamelbasis mit Eigelb und geschlagenem Eiweiß, die durch Luftausdehnung und Dampf aufgeht — kollabiert beim Öffnen des Ofens durch Temperaturschock",
        correctAnswer = 3,
        explanation = "Ein Soufflé (Französisch: 'aufgeblasen') besteht aus einer Basismasse (Béchamel mit Eigelb und Aromazutaten) plus geschlagenem Eiweiß-Schnee. Im Ofen dehnt sich die in Eiweiß-Blasen eingeschlossene Luft aus (Charles-Gesetz) und Wasserdampf unterstützt das Aufgehen. Das denaturierte Eiweiß-Netz stabilisiert kurzfristig die Struktur. Beim Öffnen des Ofens kollabiert der Schaum sofort durch Temperaturabfall.",
        difficulty = 3,
        funFact = "Ein Soufflé muss serviert werden, nicht auf den Gast warten — Restaurantküchen koordinieren deshalb Soufflé-Bestellungen auf die Minute genau. Marie-Antoine Carême soll gesagt haben: 'Ein Soufflé wartet auf niemanden.'"
    ),

    // Question 46 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Nouvelle Cuisine' und welche Kernprinzipien formulierten Henri Gault und Christian Millau 1973 in ihrem Manifest?",
        answerA = "Ein japanischer Einfluss auf die französische Küche ab 1985; Prinzipien: rohe Zutaten, minimale Garung, keine Saucen",
        answerB = "Eine 1970er-Reformbewegung der französischen Küche; Prinzipien: kürzere Garzeiten, frische Zutaten, keine schweren Saucen, reduzierte Portionen, kreative Präsentation und Ablehnung von Dosenprodukten",
        answerC = "Eine molekulare Kochbewegung ab 1995; Prinzipien: chemische Transformation, Texturen, Schäume und Sphären",
        answerD = "Eine nationalistisch geprägte Rückbesinnung auf regionale Küche Frankreichs aus dem 16. Jahrhundert",
        correctAnswer = 1,
        explanation = "Gault und Millau formulierten 1973 in ihrem Aufsatz 'Vive la Nouvelle Cuisine Française' zehn Gebote: Kein unnötiges Garen, frische regionale Zutaten, weniger Speisekarte, keine systematische Modernisierung, moderne Techniken nutzen, keine Marinade, kein fettes Saucieren, gesundheitsbewusst kochen, nicht täuschen, immer neu erfinden. Köche wie Bocuse, Guérard und die Troisgros Brüder setzten es um.",
        difficulty = 3,
        funFact = "Paul Bocuse hasste den Begriff 'Nouvelle Cuisine' — er bestand darauf, einfach 'gut zu kochen'. Ironischerweise wurde er zum größten Symbol der Bewegung, gegen die er sich abstrampelte."
    ),

    // Question 47 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Confit' als klassische Konservierungstechnik und welche Lebensmittel werden traditionell damit verarbeitet?",
        answerA = "Das Garen und Konservieren in eigenem Fett bei niedriger Temperatur (70–90°C); traditionell für Entenkeulen und Gänsekeulen (Confit de Canard) aus dem Périgord",
        answerB = "Das Einlegen in Salzlake gefolgt von Räucherung; traditionell für Lachs und Makrelen aus der Bretagne",
        answerC = "Das Einkochen von Früchten mit Zucker zur Gelbildung; traditionell für Feigen, Quitten und Orangen aus der Provence",
        answerD = "Das Trocknen und Würzen unter Vakuum; traditionell für Schinken und Salami aus der Gascogne",
        correctAnswer = 0,
        explanation = "Confit (Französisch: 'eingemacht') ist eine der ältesten Konservierungsmethoden: Fleisch (meist Entenbeine/Gänsekeulen) wird in eigenem Fett bei 70–90°C viele Stunden gegart bis es zart ist, dann vollständig im Fett eingedeckt konserviert. Das Fett versiegelt und schützt vor Sauerstoff. Confit de Canard aus der Dordogne (Périgord) ist ein UNESCO-anerkanntes Kulinarerbe.",
        difficulty = 3,
        funFact = "In der modernen Küche wird 'Confit' auch für Gemüse genutzt: Knoblauchzehen in Olivenöl confiert ergeben eine samtige, milde Paste ohne den scharfen Rohknoblauch-Biss."
    ),

    // Question 48 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'En Papillote' als Garmethode und welche physikalischen Prozesse laufen im Päckchen ab?",
        answerA = "Eine Pfannentechnik, bei der Lebensmittel unter einem umgekehrten Topfdeckel im eigenen Dampf garen",
        answerB = "Eine Räuchermethode, bei der Räucherholz in Alufolie eingeschlagen und auf die Glut gelegt wird",
        answerC = "Das Garen eingeschlossener Lebensmittel in Pergamentpapier oder Alufolie — der entstehende Dampf gart das Produkt schonend aus dem Innern heraus",
        answerD = "Das Vakuumgaren in Plastikbeuteln bei 55°C — 'Papillote' ist die alte Bezeichnung für modernes Sous Vide",
        correctAnswer = 2,
        explanation = "En Papillote (Französisch: 'im Päckchen') ist eine klassische Garmethode: Lebensmittel (oft Fisch mit Gemüse, Kräutern, Wein) werden luftdicht in Pergamentpapier oder Alufolie eingepackt und im Ofen gegart. Die enthaltene Feuchtigkeit verdampft und gart das Produkt von innen durch Kondensation — ein geschlossenes Mikro-Dampfgarsystem. Das Öffnen am Tisch gehört zum Erlebnis.",
        difficulty = 3,
        funFact = "Das 'En Papillote' wurde im 18. Jahrhundert in Frankreich als Methode entwickelt, um zarte Fische ohne Austrocknen zu garen. Das aufgebauschte Päckchen wird traditionell am Tisch des Gastes mit Schere aufgeschnitten — ein theatralischer Moment."
    ),

    // Question 49 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Resting' (Ruhen lassen) bei gegartem Fleisch und welchen biochemischen Effekt hat es auf die Saftigkeit?",
        answerA = "Das Abkühlen von Fleisch auf Raumtemperatur vor dem Servieren, um Verbrennungen des Gastes zu vermeiden",
        answerB = "Das Einlegen von gegartem Fleisch in Butter und Kräuter für 30 Minuten zur Aromaaufnahme",
        answerC = "Das Wiedererwärmen von gegartem Fleisch im Ofen bei 60°C für gleichmäßige Kerntemperatur",
        answerD = "Eine Ruhephase nach dem Garen, in der Myofibrillen sich entspannen und Fleischsäfte durch Kapillarwirkung gleichmäßig verteilen — dadurch weniger Saftverlust beim Schneiden",
        correctAnswer = 3,
        explanation = "Beim Garen zieht sich Muskelfleisch zusammen und Saft wird in Richtung der Oberfläche gedrückt. Beim Resting (5–20 Minuten je nach Größe) entspannen sich die Myofibrillen wieder und Flüssigkeit verteilt sich durch Kapillarkräfte gleichmäßig im Gewebe. Studien zeigen, dass geruhtes Steak beim Schneiden 50–60% weniger Saft verliert als direkt angeschnittenes.",
        difficulty = 3,
        funFact = "Die optimale Resting-Zeit ist proportional zur Garzeit: Faustformel ist ca. 1/3 der Garzeit. Ein 2 Stunden gegarter Braten sollte 40 Minuten ruhen."
    ),

    // Question 50 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Mirepoix' in der klassischen Küche und wie lautet das klassische Mengenverhältnis der Gemüse?",
        answerA = "Eine Würzmischung aus Salz, Pfeffer, Muskat und Lorbeer im Verhältnis 4:2:1:1",
        answerB = "Eine grob geschnittene Aromat-Gemüsemischung aus Zwiebeln, Karotten und Sellerie im Verhältnis 2:1:1, die als Geschmacksbasis für Fonds und Saucen dient",
        answerC = "Eine katalanische Sofrito-Basis aus Tomaten, Paprika und Zwiebeln im Verhältnis 1:1:1",
        answerD = "Eine provenzalische Kräutermischung aus Thymian, Rosmarin und Lorbeer für Braten und Schmorgerichte",
        correctAnswer = 1,
        explanation = "Mirepoix ist die aromatische Gemüsebasis der klassischen französischen Küche: 2 Teile Zwiebeln : 1 Teil Karotten : 1 Teil Sellerie (Stangensellerie oder Knollensellerie). Diese Mischung dient als Geschmacksfundament für Fonds, Saucen, Schmorgerichte und Suppen. Die Gemüse werden grob gewürfelt (2–3 cm), da sie ausgekocht und meist abgesiebt werden.",
        difficulty = 3,
        funFact = "Mirepoix ist nach dem Herzog von Lévis-Mirepoix benannt — einem Marschall Ludwigs XV. im 18. Jahrhundert. Legende besagt, er war ein schlechter Koch, aber sein Leibkoch erfand die Mischung und nannte sie zu Ehren seines Dienstherren so."
    )
)
