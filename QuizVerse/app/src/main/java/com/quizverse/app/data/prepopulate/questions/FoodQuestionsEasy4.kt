package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsEasy4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Wiener Schnitzel ursprünglich?",
        answerA = "Deutschland",
        answerB = "Österreich",
        answerC = "Schweiz",
        answerD = "Ungarn",
        correctAnswer = 1,
        explanation = "Das Wiener Schnitzel ist ein klassisches Gericht der österreichischen Küche und stammt aus Wien. Es besteht traditionell aus dünn geklopftem Kalbfleisch, das in Semmelbröseln paniert und in Butterschmalz ausgebacken wird.",
        difficulty = 1,
        funFact = "Das Wiener Schnitzel ist so bekannt, dass es in Österreich gesetzlich geschützt ist – nur Schnitzel aus Kalbfleisch darf offiziell 'Wiener Schnitzel' heißen."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Was ist eine Brezel?",
        answerA = "Ein süßes Hefegebäck mit Zuckerguss",
        answerB = "Ein herzhafte Kartoffelkloß",
        answerC = "Ein Laugengebäck in Schleifenform",
        answerD = "Ein flaches Maisbrot",
        correctAnswer = 2,
        explanation = "Die Brezel ist ein traditionelles deutsches Laugengebäck, das vor dem Backen in Natronlauge getaucht wird. Dadurch bekommt sie ihre charakteristische braune Farbe und den typischen Laugengeschmack.",
        difficulty = 1,
        funFact = "Die Form der Brezel soll Mönchsarme beim Beten darstellen – daher stammt angeblich auch ihr Name aus dem Lateinischen 'bracellus' (Armreif)."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Was ist der Hauptbestandteil eines Apfelstrudels?",
        answerA = "Birnen",
        answerB = "Kirschen",
        answerC = "Pflaumen",
        answerD = "Äpfel",
        correctAnswer = 3,
        explanation = "Der Apfelstrudel ist ein klassisches österreichisches Dessert, dessen Füllung hauptsächlich aus geschälten und geriebenen Äpfeln, Zucker, Zimt und Rosinen besteht. Er wird in hauchdünnem Strudelteig gerollt und gebacken.",
        difficulty = 1,
        funFact = "Das älteste bekannte Strudelrezept stammt aus dem Jahr 1696 und befindet sich heute in der Wiener Stadtbibliothek."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist das Nationalgetränk Bayerns?",
        answerA = "Glühwein",
        answerB = "Apfelwein",
        answerC = "Buttermilch",
        answerD = "Weißbier",
        correctAnswer = 3,
        explanation = "Weißbier, auch Weizenbier genannt, gilt als das typischste Bier Bayerns und gehört zur bayerischen Trinkkultur wie die Brezn zum Biergarten. Es wird aus Weizenmalz gebraut und hat einen fruchtigen, leicht säuerlichen Geschmack.",
        difficulty = 1,
        funFact = "Bayern trinkt pro Kopf am meisten Bier in Deutschland – rund 115 Liter pro Person und Jahr."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Sauerbraten'?",
        answerA = "Saures Gemüse mit gebratenem Speck",
        answerB = "Sauer eingelegte Würstchen",
        answerC = "Gebratener Fisch in Essigmarinade",
        answerD = "In Essig mariniertes und geschmortes Rindfleisch",
        correctAnswer = 3,
        explanation = "Sauerbraten ist ein deutsches Schmorgericht, bei dem Rindfleisch mehrere Tage in einer Marinade aus Essig, Wasser, Zwiebeln und Gewürzen eingelegt wird. Anschließend wird das Fleisch langsam geschmort und ergibt eine würzige, leicht säuerliche Soße.",
        difficulty = 1,
        funFact = "Sauerbraten gilt als eines der Nationalgerichte Deutschlands und wird regional sehr unterschiedlich zubereitet – in Rheinland wird er sogar mit Rosinen und Lebkuchen verfeinert."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Woher stammt der Schwarzwälder Kirschtorte?",
        answerA = "Bayern",
        answerB = "Thüringen",
        answerC = "Schwarzwald (Baden-Württemberg)",
        answerD = "Hessen",
        correctAnswer = 2,
        explanation = "Die Schwarzwälder Kirschtorte stammt aus der Region Schwarzwald im deutschen Bundesland Baden-Württemberg. Sie besteht aus Schokoladenbiskuit, Sahne, Kirschen und wird mit Kirschwasser aromatisiert.",
        difficulty = 1,
        funFact = "Die Schwarzwälder Kirschtorte ist so berühmt, dass im Jahr 2006 eine 'Schutzgemeinschaft Schwarzwälder Kirschtorte' gegründet wurde, die für die Qualität des Originals einsteht."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was ist 'Leberkäse' in Bayern?",
        answerA = "Gebratene Schweineleber mit Käse überbacken",
        answerB = "Ein Leberwurstbrot mit Käse",
        answerC = "Ein Käsegericht mit Leber-Aroma",
        answerD = "Eine Fleischterrine aus gebackenem Brät",
        correctAnswer = 3,
        explanation = "Leberkäse ist trotz seines Namens weder ein Käse noch muss er Leber enthalten. Es handelt sich um ein bayerisches Brät aus fein gehacktem Schweine- und Rindfleisch, das in einer Kastenform gebacken wird und eine braune Kruste bekommt.",
        difficulty = 1,
        funFact = "Der Name 'Leberkäse' leitet sich nicht von Leber oder Käse ab, sondern vom mittelhochdeutschen 'laib' (Laib/Block) und 'kese' (Speise) ab."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz ist typisch für den deutschen Weihnachtskuchen 'Stollen'?",
        answerA = "Paprika",
        answerB = "Koriander",
        answerC = "Kardamom und Zimt",
        answerD = "Ingwer und Chili",
        correctAnswer = 2,
        explanation = "Der Stollen, besonders der Dresdner Christstollen, wird mit einer Mischung aus Weihnachtsgewürzen aromatisiert, zu denen vor allem Kardamom und Zimt gehören. Außerdem enthalten Stollen Rosinen, Mandeln, Marzipan und kandierte Früchte.",
        difficulty = 1,
        funFact = "Der Dresdner Stollen hat eine geografisch geschützte Herkunftsbezeichnung der EU – nur Stollen aus Dresden darf offiziell 'Dresdner Christstollen' heißen."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Was ist 'Maultaschen'?",
        answerA = "Ein süddeutsches Teiggericht mit Fleischfüllung",
        answerB = "Getrocknete Pilze aus dem Schwarzwald",
        answerC = "Eine Käseart aus Württemberg",
        answerD = "Gefüllte Paprikaschoten",
        correctAnswer = 0,
        explanation = "Maultaschen sind ein schwäbisches Teiggericht, ähnlich wie Ravioli, mit einer Füllung aus Hackfleisch, Spinat, Zwiebeln und Gewürzen. Sie werden in Brühe gekocht oder anschließend in der Pfanne angebraten.",
        difficulty = 1,
        funFact = "Maultaschen werden manchmal auch 'Herrgottsbescheißerle' genannt, weil die Mönche angeblich das Fleisch im Teig versteckten, um während der Fastenzeit unbemerkt Fleisch essen zu können."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Gericht 'Gulasch'?",
        answerA = "Polen",
        answerB = "Rumänien",
        answerC = "Ungarn",
        answerD = "Tschechien",
        correctAnswer = 2,
        explanation = "Gulasch ist ein traditionelles ungarisches Eintopfgericht aus gewürfeltem Rindfleisch, Zwiebeln und Paprika. Es gilt als das Nationalgericht Ungarns und hat sich von dort aus in ganz Europa verbreitet.",
        difficulty = 1,
        funFact = "Ursprünglich war Gulasch das Essen der ungarischen Rinderhirten (Gulyás = Rinderhirt) und wurde auf offenem Feuer in großen Kesseln zubereitet."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welche Seite liegt beim Tischdecken links vom Teller?",
        answerA = "Messer",
        answerB = "Löffel",
        answerC = "Gabel",
        answerD = "Suppenlöffel",
        correctAnswer = 2,
        explanation = "Bei der europäischen Tischetikette liegt die Gabel immer links vom Teller, das Messer und der Löffel befinden sich rechts. Diese Regel gilt sowohl für formelle Anlässe als auch im Alltag.",
        difficulty = 1,
        funFact = "In Europa isst man üblicherweise mit der Gabel in der linken Hand, während man in den USA nach dem Schneiden das Besteck in die rechte Hand wechselt."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es, wenn man das Besteck parallel auf dem Teller ablegt?",
        answerA = "Man bittet um Nachschlag",
        answerB = "Man möchte eine Pause machen",
        answerC = "Man ist fertig mit dem Essen",
        answerD = "Man möchte das Gericht wechseln",
        correctAnswer = 2,
        explanation = "Wenn Gabel und Messer parallel auf dem Teller abgelegt werden (in der '5-Uhr-Position'), signalisiert man dem Servicepersonal, dass man fertig mit dem Essen ist. Das Besteck zeigt dabei schräg nach rechts oben.",
        difficulty = 1,
        funFact = "Diese stumme Kommunikation mit dem Besteck nennt man 'Bestecksprache' und ist in der gehobenen Gastronomie weltweit bekannt."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Welches Verhalten gilt bei Tisch in Deutschland als unhöflich?",
        answerA = "Den Wein am Stiel des Glases halten",
        answerB = "Die Serviette auf den Schoß legen",
        answerC = "Das Brot mit der Hand brechen",
        answerD = "Laut schmatzen und rülpsen",
        correctAnswer = 3,
        explanation = "In Deutschland und den meisten westlichen Kulturen gilt lautes Schmatzen und Rülpsen beim Essen als grob unhöflich. Im Gegensatz dazu gilt Rülpsen in manchen asiatischen Kulturen als Zeichen der Wertschätzung gegenüber dem Koch.",
        difficulty = 1,
        funFact = "In China und Japan ist es dagegen vollkommen akzeptiert oder sogar erwünscht, beim Essen hörbare Geräusche zu machen – es zeigt dem Gastgeber, dass das Essen schmeckt."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Wann legt man die Serviette beim Verlassen des Tisches ab?",
        answerA = "Locker zusammengefaltet links neben den Teller",
        answerB = "Ordentlich gefaltet direkt auf den Teller",
        answerC = "Aufgehängt an der Stuhllehne",
        answerD = "In das Trinkglas gesteckt",
        correctAnswer = 0,
        explanation = "Wenn man den Tisch während oder nach dem Essen verlässt, legt man die Serviette locker (nicht ordentlich gefaltet) links neben den Teller. Eine ordentlich gefaltete Serviette würde signalisieren, dass man nicht zurückkommt.",
        difficulty = 1,
        funFact = "Im Mittelalter dienten Tischdecken auch als gemeinsame Serviette – alle Gäste wischten sich einfach am Tischtuch ab, denn persönliche Servietten gab es noch nicht."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Was ist beim Anstoßen mit Weingläsern in Deutschland üblich?",
        answerA = "Man trinkt erst nach dem ältesten Gast",
        answerB = "Man dreht sich einmal im Kreis danach",
        answerC = "Man stößt nur mit dem Boden der Gläser an",
        answerD = "Man hält Blickkontakt beim Anstoßen",
        correctAnswer = 3,
        explanation = "In Deutschland ist es üblich, beim Anstoßen direkten Blickkontakt mit den anderen Personen zu halten. Wer den Blickkontakt vermeidet, bringt angeblich sieben Jahre Unglück – so zumindest die Volksweisheit.",
        difficulty = 1,
        funFact = "In manchen deutschen Regionen ist es zudem Brauch, nach dem Anstoßen die Gläser auf den Tisch zu tippen, was symbolisch bedeutet, auch an die Toten zu denken."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr wurde die Pizza Margherita erfunden?",
        answerA = "1789",
        answerB = "1850",
        answerC = "1889",
        answerD = "1912",
        correctAnswer = 2,
        explanation = "Die Pizza Margherita wurde 1889 vom neapolitanischen Pizzabäcker Raffaele Esposito kreiert. Er belegte die Pizza zu Ehren der Königin Margherita von Savoyen mit Tomaten, Mozzarella und Basilikum – den Farben der italienischen Flagge.",
        difficulty = 1,
        funFact = "Es gibt einen Brief der königlichen Haushaltsverwaltung an Raffaele Esposito aus dem Jahr 1889, in dem der Küchenchef der Königin die Pizza lobt – einer der ältesten bekannten Restaurantbewertungen der Geschichte."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Wo wurde der Hamburger erfunden?",
        answerA = "In Kanada",
        answerB = "In der deutschen Stadt Hamburg",
        answerC = "In den Vereinigten Staaten",
        answerD = "In Großbritannien",
        correctAnswer = 2,
        explanation = "Obwohl der Hamburger seinen Namen von der deutschen Stadt Hamburg hat, wurde er als modernes Fast-Food-Gericht in den USA entwickelt. Einwanderer brachten das Konzept des gehackten Rindersteak ('Hamburg Steak') nach Amerika, wo es zwischen zwei Brötchen serviert wurde.",
        difficulty = 1,
        funFact = "Das erste bekannte Burger-Restaurant in den USA war White Castle, gegründet 1921 in Wichita, Kansas – über 30 Jahre vor McDonald's."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Croissant ursprünglich?",
        answerA = "Österreich",
        answerB = "Frankreich",
        answerC = "Belgien",
        answerD = "Italien",
        correctAnswer = 0,
        explanation = "Das Croissant hat seine Wurzeln in Österreich, wo das Kipferl als halbmondförmiges Gebäck bekannt war. Im 19. Jahrhundert brachte ein österreichischer Bäcker in Paris das Rezept nach Frankreich, wo es zum Symbol der französischen Bäckereikultur wurde.",
        difficulty = 1,
        funFact = "Die halbmondförmige Form des Croissants soll an den Halbmond auf der osmanischen Flagge erinnern – als Siegestrophäe nach der gescheiterten Belagerung Wiens durch die Türken im Jahr 1683."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "In welchem Land wurde Schokolade ursprünglich als Getränk konsumiert?",
        answerA = "Spanien",
        answerB = "Portugal",
        answerC = "Mexiko (von den Azteken)",
        answerD = "Belgien",
        correctAnswer = 2,
        explanation = "Die Azteken in Mexiko konsumierten Kakao schon Jahrhunderte vor der europäischen Entdeckung als bitteres Getränk namens 'Xocolātl'. Der Kakao hatte für sie einen heiligen Wert und diente auch als Zahlungsmittel.",
        difficulty = 1,
        funFact = "Als die Spanier im 16. Jahrhundert Schokolade nach Europa brachten, galt sie als Luxusgut und war nur dem Adel vorbehalten. Feste Schokolade gibt es erst seit dem 19. Jahrhundert."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Wer hat die Kartoffelchips erfunden?",
        answerA = "Ein belgischer Pommesbäcker",
        answerB = "Ein englischer Adeliger",
        answerC = "Ein deutscher Bäcker",
        answerD = "Ein amerikanischer Koch namens George Crum",
        correctAnswer = 3,
        explanation = "Die Kartoffelchips wurden 1853 von George Crum, einem amerikanischen Koch in Saratoga Springs, New York, erfunden. Er schnitt Kartoffeln hauchdünn und frittierte sie knusprig, nachdem ein Gast seine Pommes als zu dick reklamiert hatte.",
        difficulty = 1,
        funFact = "Ursprünglich wurden Kartoffelchips als 'Saratoga Chips' bezeichnet und galten als Restaurantspezialität – erst Jahrzehnte später wurden sie in Tüten als Massenprodukt verkauft."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Welches Superfood enthält besonders viel Vitamin C?",
        answerA = "Karotten",
        answerB = "Kartoffeln",
        answerC = "Champignons",
        answerD = "Paprika",
        correctAnswer = 3,
        explanation = "Rote Paprika enthält sogar mehr Vitamin C als Orangen – etwa 140 mg pro 100 g. Vitamin C ist wichtig für das Immunsystem, die Wundheilung und die Aufnahme von Eisen aus pflanzlichen Quellen.",
        difficulty = 1,
        funFact = "Rote Paprika enthält dreimal so viel Vitamin C wie grüne Paprika, da sie länger am Strauch reift und dabei mehr Nährstoffe entwickelt."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Was ist Quinoa?",
        answerA = "Ein Gemüse aus dem Mittelmeerraum",
        answerB = "Eine Hülsenfrucht aus Afrika",
        answerC = "Ein Pseudogetreide aus Südamerika",
        answerD = "Eine Getreideart aus Asien",
        correctAnswer = 2,
        explanation = "Quinoa ist ein Pseudogetreide, das aus den Anden Südamerikas stammt und bereits von den Inkas als Grundnahrungsmittel angebaut wurde. Es ist botanisch kein echtes Getreide, wird aber ähnlich verwendet und ist glutenfrei.",
        difficulty = 1,
        funFact = "Die Inka nannten Quinoa 'Chisaya Mama' (Mutter aller Körner) und hielten es für heilig. Die NASA hat Quinoa als ideale Nahrung für Langzeitmissionen im Weltraum untersucht."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welcher Nährstoff macht Avocados so gesund?",
        answerA = "Viel Ballaststoffe und gesunde Fette",
        answerB = "Vitamin D und Kalzium",
        answerC = "Viel Eisen und Zink",
        answerD = "Hoher Proteingehalt",
        correctAnswer = 0,
        explanation = "Avocados sind reich an einfach ungesättigten Fettsäuren (besonders Ölsäure), die gut für das Herz-Kreislauf-System sind. Außerdem enthalten sie viele Ballaststoffe, Kalium, Folsäure und die Vitamine E, K und B.",
        difficulty = 1,
        funFact = "Eine Avocado hat mehr Kalium als eine Banane. Kalium ist wichtig für die Regulierung des Blutdrucks und die Funktion von Muskeln und Nerven."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Warum gilt Blaubeeren als Superfood?",
        answerA = "Sie enthalten besonders viel Calcium",
        answerB = "Sie sind reich an Antioxidantien",
        answerC = "Sie haben den höchsten Proteingehalt aller Früchte",
        answerD = "Sie senken sofort den Blutzucker",
        correctAnswer = 1,
        explanation = "Blaubeeren (Heidelbeeren) zählen zu den antioxidantienreichsten Lebensmitteln überhaupt. Die enthaltenen Anthocyane (blaue Pflanzenfarbstoffe) schützen Zellen vor freien Radikalen und gelten als entzündungshemmend.",
        difficulty = 1,
        funFact = "Wilde Blaubeeren enthalten bis zu doppelt so viele Antioxidantien wie kultivierte Blaubeeren aus dem Supermarkt, weil sie sich in freier Natur stärker gegen Umwelteinflüsse schützen müssen."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist Chiasamen?",
        answerA = "Ein Gewürz aus der Karibik",
        answerB = "Ein nährstoffreiches Saatgut aus Zentralamerika",
        answerC = "Eine Getreideart aus Indien",
        answerD = "Ein getrocknetes Algenprodukt",
        correctAnswer = 1,
        explanation = "Chiasamen stammen von der Chia-Pflanze, die in Zentralamerika und Mexiko heimisch ist. Sie waren schon bei den Azteken und Maya ein wichtiges Grundnahrungsmittel und enthalten viel Omega-3-Fettsäuren, Ballaststoffe, Protein und Mineralien.",
        difficulty = 1,
        funFact = "Chiasamen können das bis zu Zwölffache ihres Eigengewichts an Wasser aufnehmen und bilden dabei ein gallertartiges Gel – ideal als Eiersatz beim Backen für Veganer."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel wird als 'grünes Gold' bezeichnet?",
        answerA = "Spinat",
        answerB = "Matcha",
        answerC = "Olivenöl",
        answerD = "Avocado",
        correctAnswer = 2,
        explanation = "Olivenöl wird oft als 'flüssiges Gold' oder 'grünes Gold' bezeichnet, weil es sehr wertvoll ist. Hochwertiges natives Olivenöl extra enthält viele gesunde einfach ungesättigte Fettsäuren und entzündungshemmende Polyphenole.",
        difficulty = 1,
        funFact = "Für einen Liter Olivenöl werden rund 4 bis 5 kg Oliven benötigt. Die ältesten bekannten Olivenbäume auf der Welt stehen auf der griechischen Insel Kreta und sind über 3.000 Jahre alt."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Was ist der gesündeste Teil eines Apfels?",
        answerA = "Das Fruchtfleisch",
        answerB = "Der Kern",
        answerC = "Die Schale",
        answerD = "Der Stiel",
        correctAnswer = 2,
        explanation = "Die Apfelschale enthält die meisten Vitamine, Ballaststoffe und Antioxidantien des Apfels, darunter Quercetin und Pektin. Deshalb ist es gesünder, Äpfel mit Schale zu essen – wenn möglich aus biologischem Anbau, um Pestizide zu vermeiden.",
        difficulty = 1,
        funFact = "Das Pektin in der Apfelschale ist ein löslicher Ballaststoff, der im Darm wie ein Gel wirkt und dabei hilft, Cholesterin zu binden und den Blutzucker zu stabilisieren."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist Kurkuma?",
        answerA = "Eine Frucht aus Südostasien",
        answerB = "Ein gelbes Gewürz mit entzündungshemmender Wirkung",
        answerC = "Eine Teepflanze aus Japan",
        answerD = "Ein Meeresfrüchte-Gericht aus Indien",
        correctAnswer = 1,
        explanation = "Kurkuma ist ein gelb-oranges Gewürz aus der Wurzel der Kurkumapflanze. Es enthält den Wirkstoff Curcumin, dem entzündungshemmende, antioxidative und möglicherweise krebsvorbeugende Eigenschaften zugeschrieben werden.",
        difficulty = 1,
        funFact = "Kurkuma ist der Hauptbestandteil von Curry-Pulver und verleiht ihm die typisch gelbe Farbe. In Indien wird es seit über 4.000 Jahren als Heilmittel eingesetzt."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse enthält besonders viel Eisen?",
        answerA = "Gurken",
        answerB = "Eisbergsalat",
        answerC = "Spinat",
        answerD = "Zucchini",
        correctAnswer = 2,
        explanation = "Spinat enthält mit etwa 2,7 mg pro 100 g relativ viel Eisen für ein Gemüse. Allerdings ist das pflanzliche Eisen (Nicht-Häm-Eisen) schlechter verwertbar als tierisches Eisen. Vitamin C verbessert die Eisenaufnahme erheblich.",
        difficulty = 1,
        funFact = "Der Mythos, dass Spinat besonders eisenreich ist, entstand durch einen Dezimalfehler in einer Studie aus dem 19. Jahrhundert – der Eisengehalt wurde zehnmal zu hoch angegeben."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen braunem und weißem Reis?",
        answerA = "Brauner Reis enthält mehr Kalorien und weniger Vitamine",
        answerB = "Brauner Reis hat die Schale noch dran und ist nährstoffreicher",
        answerC = "Weißer Reis stammt aus einer anderen Reissorte",
        answerD = "Es gibt keinen ernährungsphysiologischen Unterschied",
        correctAnswer = 1,
        explanation = "Brauner Reis ist Vollkornreis – er hat noch die äußere Kleie- und Keimschicht. Diese enthält Ballaststoffe, B-Vitamine, Mineralstoffe und Antioxidantien. Weißer Reis wurde poliert und dabei diese nährstoffreichen Schichten entfernt.",
        difficulty = 1,
        funFact = "In Teilen Asiens, wo polierter weißer Reis die Hauptnahrung war, kam es zu Beriberi-Erkrankungen durch Thiamin (Vitamin B1)-Mangel – bis man erkannte, dass die entfernte Reisschale das fehlende Vitamin enthielt."
    ),

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Kaiserschmarrn'?",
        answerA = "Eine österreichische Mehlspeise aus zerrissenen Pfannkuchen",
        answerB = "Ein bayerisches Fleischgericht",
        answerC = "Ein Wiener Brotaufstrich",
        answerD = "Eine Schweizer Käsespezialität",
        correctAnswer = 0,
        explanation = "Kaiserschmarrn ist ein klassisches österreichisches Dessert aus einem luftigen Pfannkuchenteig, der in der Pfanne in Stücke gerissen und karamellisiert wird. Er wird mit Puderzucker bestäubt und meist mit Zwetschgenröster oder Apfelmus serviert.",
        difficulty = 1,
        funFact = "Dem Namen nach soll Kaiserschmarrn das Leibgericht von Kaiser Franz Joseph I. von Österreich gewesen sein – angeblich war er so von dem Gericht begeistert, dass es nach ihm benannt wurde."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tafelspitz'?",
        answerA = "Ein österreichisches Rindfleischgericht",
        answerB = "Ein norddeutsches Fischgericht",
        answerC = "Eine Schweizer Fondue-Variante",
        answerD = "Ein Würzburger Weingericht",
        correctAnswer = 0,
        explanation = "Tafelspitz ist ein klassisches Wiener Gericht aus in Brühe gekochtem Rindfleisch – speziell dem Schwanzstück (Tafelspitz). Es wird mit Wurzelgemüse, Bratkartoffeln, Apfelkren und Schnittlauchsauce serviert.",
        difficulty = 1,
        funFact = "Tafelspitz gilt als das Lieblingsgericht von Kaiser Franz Joseph I. von Österreich, der es angeblich täglich zu Mittag aß."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist das Hauptgetreide in deutschem Roggenbrot?",
        answerA = "Weizen",
        answerB = "Gerste",
        answerC = "Roggen",
        answerD = "Dinkel",
        correctAnswer = 2,
        explanation = "Deutsches Roggenbrot wird hauptsächlich aus Roggenmehl hergestellt. Roggen eignet sich besonders gut für Brot, da er auch in kühleren Klimazonen gedeiht und das Brot eine längere Haltbarkeit und einen kräftigen, leicht säuerlichen Geschmack erhält.",
        difficulty = 1,
        funFact = "Deutschland hat die größte Brotvielfalt der Welt – über 3.000 verschiedene Brotsorten und Brötchen sind registriert. Das Deutsche Brot wurde 2014 von der UNESCO als immaterielles Kulturerbe anerkannt."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welcher Käse ist der bekannteste aus der Schweiz?",
        answerA = "Gouda",
        answerB = "Emmentaler",
        answerC = "Cheddar",
        answerD = "Mozzarella",
        correctAnswer = 1,
        explanation = "Der Emmentaler ist der bekannteste Schweizer Käse weltweit und zeichnet sich durch seine großen runden Löcher aus. Er stammt aus dem Emmental im Kanton Bern und wird aus pasteurisierter oder unpasteurisierter Kuhmilch hergestellt.",
        difficulty = 1,
        funFact = "Die Löcher im Emmentaler entstehen durch Kohlendioxidgas, das von Propionsäurebakterien während der Reifung produziert wird. Je wärmer die Reifung, desto größer die Löcher."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fondue'?",
        answerA = "Ein französisches Salatdressing",
        answerB = "Ein in Käse oder Öl getunktes Gericht",
        answerC = "Eine belgische Schokoladenspezialität",
        answerD = "Ein österreichischer Knödeltyp",
        correctAnswer = 1,
        explanation = "Fondue ist ein Schweizer Gericht, bei dem Brot, Fleisch oder Gemüse in geschmolzenem Käse (Käsefondue), heißem Öl (Fleischfondue) oder geschmolzener Schokolade (Schokoladenfondue) am Tisch getaucht wird.",
        difficulty = 1,
        funFact = "Im Winter 1940 erklärte die Schweizer Armee Fondue offiziell zum 'nationalen Gericht' – hauptsächlich als Propagandamittel, um den Gemeinschaftssinn zu stärken."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist die Hauptzutat in einem echten Wiener Sachertorte?",
        answerA = "Marzipan",
        answerB = "Sahne und Nüsse",
        answerC = "Schokolade und Marillenmarmelade",
        answerD = "Honig und Mandeln",
        correctAnswer = 2,
        explanation = "Die Original Sacher-Torte besteht aus einem dichten Schokoladenbiskuit, der mit einer Schicht Marillenmarmelade (Aprikosenmarmelade) gefüllt und mit glatter Schokoladeglasur überzogen ist.",
        difficulty = 1,
        funFact = "Um die 'Original Sacher-Torte' gibt es einen berühmten Rechtsstreit zwischen dem Hotel Sacher in Wien und der Konditorei Demel, der von 1954 bis 1963 dauerte – eine der längsten Tortenklagen der Geschichte."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Rösti'?",
        answerA = "Ein Schweizer Kartoffelgericht",
        answerB = "Ein österreichischer Teigfladen",
        answerC = "Ein Bayrischer Kartoffeleintopf",
        answerD = "Ein deutsches Grillgericht",
        correctAnswer = 0,
        explanation = "Rösti ist ein traditionelles Schweizer Gericht aus geriebenen, gebratenen Kartoffeln, die in der Pfanne zu einem flachen Kuchen gepresst werden. Es ist ein klassisches Frühstücks- oder Beilagengericht, besonders in der Deutschschweiz.",
        difficulty = 1,
        funFact = "Die Grenze zwischen der Deutsch- und Westschweiz wird manchmal auch 'Röstigraben' genannt – ein humorvoller Begriff für die kulturellen Unterschiede zwischen den Sprachregionen."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Welche Speise wird traditionell in Bayern zum Oktoberfest gegessen?",
        answerA = "Currywurst",
        answerB = "Haxn (Schweinshaxe)",
        answerC = "Döner Kebab",
        answerD = "Berliner Pfannkuchen",
        correctAnswer = 1,
        explanation = "Die Schweinshaxe (Haxn) ist eines der beliebtesten Gerichte auf dem Münchner Oktoberfest. Sie besteht aus dem Unterschenkel des Schweins, der knusprig gebraten oder geschmort wird, und wird oft mit Sauerkraut und Knödeln serviert.",
        difficulty = 1,
        funFact = "Beim Münchner Oktoberfest werden jährlich rund 100 gebratene Ochsen und Hunderttausende Hendl (Grillhähnchen) verzehrt – neben Brezeln das beliebteste Festessen."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Woher stammt das Gericht 'Döner Kebab' in Deutschland?",
        answerA = "Es wurde in der Türkei erfunden und importiert",
        answerB = "Es wurde von türkischen Einwanderern in Berlin entwickelt",
        answerC = "Es stammt aus Griechenland",
        answerD = "Es wurde in Frankfurt von deutschen Köchen kreiert",
        correctAnswer = 1,
        explanation = "Der Döner Kebab in seiner deutschen Form – im Fladenbrot mit Salat und Soße – wurde in den 1970er Jahren von türkischen Gastarbeitern in West-Berlin entwickelt. Kadir Nurman gilt als Erfinder des deutschen Döners.",
        difficulty = 1,
        funFact = "Deutschland ist das Land mit dem höchsten Döner-Konsum außerhalb der Türkei. Täglich werden in Deutschland schätzungsweise 400 Tonnen Dönerfleisch verzehrt."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Was ist 'Currywurst'?",
        answerA = "Eine Bratwurst mit Currysoße und Ketchup",
        answerB = "Ein indisches Currygerciht mit Würstchen",
        answerC = "Eine geräucherte Wurst in Currymarinade",
        answerD = "Ein Würstchen gefüllt mit Currypaste",
        correctAnswer = 0,
        explanation = "Currywurst ist ein deutsches Fast-Food-Gericht aus gebratener oder gegrillter Bratwurst, die mit Ketchup übergossen und mit Currypulver bestreut wird. Sie ist besonders in Berlin und dem Ruhrgebiet sehr beliebt.",
        difficulty = 1,
        funFact = "Die Currywurst wurde 1949 von Herta Heuwer in Berlin erfunden. Sie mischte Ketchup mit Worcestershire-Soße und Curry und goss diese Soße über eine Bratwurst – ein Imbissklassiker war geboren."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pumpernickel'?",
        answerA = "Ein bayerisches Lebkuchengebäck",
        answerB = "Ein sehr dunkles, kompaktes Roggenbrot aus Westfalen",
        answerC = "Eine thüringische Bratwurstsorte",
        answerD = "Ein norddeutscher Heringssalat",
        correctAnswer = 1,
        explanation = "Pumpernickel ist ein westfälisches Vollkornbrot aus grobem Roggenschrot, das sehr langsam bei niedrigen Temperaturen viele Stunden gebacken wird. Dadurch wird es sehr dunkel und hat einen typisch süßlich-herben Geschmack.",
        difficulty = 1,
        funFact = "Pumpernickel hat eine extrem lange Haltbarkeit – original verpackter Pumpernickel ist bis zu zwei Jahre haltbar, was ihn früher als ideale Proviant auf Reisen beliebt machte."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was macht Ingwer als Superfood besonders?",
        answerA = "Er enthält viel Vitamin B12",
        answerB = "Er hat entzündungshemmende und verdauungsfördernde Eigenschaften",
        answerC = "Er ist besonders reich an Kalzium",
        answerD = "Er senkt nachweislich den Cholesterinspiegel",
        correctAnswer = 1,
        explanation = "Ingwer enthält Gingerole und Shogaole, die entzündungshemmend wirken. Er hilft gegen Übelkeit, fördert die Verdauung, hat antibakterielle Eigenschaften und kann Muskelschmerzen lindern.",
        difficulty = 1,
        funFact = "Ingwer wird in der traditionellen chinesischen und ayurvedischen Medizin seit über 5.000 Jahren als Heilmittel eingesetzt. Heute ist er weltweit eines der am häufigsten verwendeten Gewürze."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was ist Kefir?",
        answerA = "Ein fermentiertes Milchgetränk mit Probiotika",
        answerB = "Ein griechischer Weichkäse",
        answerC = "Ein türkisches Joghurtdessert",
        answerD = "Ein skandinavischer Sauerrahm",
        correctAnswer = 0,
        explanation = "Kefir ist ein fermentiertes Milchgetränk, das durch Kefirknollen hergestellt wird. Diese enthalten eine Symbiose aus Milchsäurebakterien und Hefen. Kefir ist reich an Probiotika, die die Darmflora unterstützen.",
        difficulty = 1,
        funFact = "Kefir stammt ursprünglich aus dem Kaukasus, wo die Knollen als heilig galten und als 'Körner des Propheten Mohammed' bezeichnet wurden. Jahrhundertelang wurden die Kefirknollen streng gehütet und nicht nach außen weitergegeben."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel ist für seinen hohen Omega-3-Gehalt bekannt?",
        answerA = "Hühnerbrust",
        answerB = "Lachs",
        answerC = "Rinderfilet",
        answerD = "Thunfisch in Dosen",
        correctAnswer = 1,
        explanation = "Lachs gehört zu den fettreichsten Speisefischen und enthält besonders viel Omega-3-Fettsäuren (EPA und DHA). Diese sind wichtig für Herz und Gefäße, das Gehirn und wirken entzündungshemmend.",
        difficulty = 1,
        funFact = "Wildlachs enthält in der Regel mehr Omega-3-Fettsäuren als Zuchtlachs, weil er sich von Krill und anderen kleinen Meerestieren ernährt, die selbst reich an Omega-3 sind."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist Miso?",
        answerA = "Ein japanisches fermentiertes Sojaprodukt",
        answerB = "Ein chinesisches Reisgebäck",
        answerC = "Ein koreanisches Gemüsegericht",
        answerD = "Ein thailändisches Kokosprodukt",
        correctAnswer = 0,
        explanation = "Miso ist eine traditionelle japanische Würzpaste aus fermentierten Sojabohnen, die mit Salz und oft Koji (einem Schimmelpilz) hergestellt wird. Sie ist reich an Probiotika, Proteinen und verschiedenen Mineralstoffen.",
        difficulty = 1,
        funFact = "In Japan wird Misosuppe oft zum Frühstück getrunken. Wissenschaftliche Studien deuten darauf hin, dass regelmäßiger Misokonsum mit einer längeren Lebenserwartung zusammenhängen könnte."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse wird auch 'Superfood' genannt und enthält viele Antioxidantien?",
        answerA = "Eisbergsalat",
        answerB = "Grünkohl",
        answerC = "Weißkohl",
        answerD = "Kohlrabi",
        correctAnswer = 1,
        explanation = "Grünkohl gilt als eines der nährstoffreichsten Gemüse überhaupt. Er enthält viel Vitamin C, K, A, Kalzium, Eisen sowie Antioxidantien wie Quercetin und Kaempferol, die zellschützend wirken.",
        difficulty = 1,
        funFact = "Grünkohl ist nach einem Frost noch gesünder und schmeckt süßer, weil die Kälte Stärke in Zucker umwandelt. Daher ist die norddeutsche Tradition, Grünkohl erst nach dem ersten Frost zu essen, auch ernährungsphysiologisch sinnvoll."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Butter und Margarine?",
        answerA = "Butter enthält mehr Kalorien, Margarine mehr Vitamine",
        answerB = "Butter wird aus Milchfett hergestellt, Margarine aus pflanzlichen Ölen",
        answerC = "Margarine ist immer gesünder als Butter",
        answerD = "Es gibt keinen wesentlichen Unterschied",
        correctAnswer = 1,
        explanation = "Butter wird durch Verarbeitung von Sahne aus Kuhmilch hergestellt und besteht zu mindestens 80 % aus Milchfett. Margarine dagegen wird aus pflanzlichen Ölen hergestellt und enthält je nach Sorte Sonnenblumen-, Raps- oder Palmöl.",
        difficulty = 1,
        funFact = "Margarine wurde 1869 vom französischen Chemiker Hippolyte Mège-Mouriès erfunden, als Napoleon III. einen preiswerten Butterersatz für das Militär und die arme Bevölkerung gesucht hatte."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Fermentation' bei Lebensmitteln?",
        answerA = "Das Einfrieren von Lebensmitteln zur Konservierung",
        answerB = "Die Umwandlung von Zucker durch Mikroorganismen (z.B. Joghurt, Käse, Brot)",
        answerC = "Das Kochen bei sehr hohen Temperaturen",
        answerD = "Das Trocknen von Kräutern und Früchten",
        correctAnswer = 1,
        explanation = "Fermentation ist ein natürlicher Prozess, bei dem Mikroorganismen wie Bakterien, Hefen oder Pilze Kohlenhydrate (Zucker) abbauen und dabei u.a. Milchsäure, Alkohol oder Kohlendioxid produzieren. So entstehen Joghurt, Käse, Brot, Sauerkraut, Bier und Wein.",
        difficulty = 1,
        funFact = "Fermentierte Lebensmittel sind nicht nur länger haltbar, sie sind oft auch leichter verdaulich und können durch Probiotika die Darmgesundheit fördern. Fermentation ist eine der ältesten Konservierungsmethoden der Menschheit."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist 'Spätzle'?",
        answerA = "Eine süddeutsche Nudelspezialität aus Eiern und Mehl",
        answerB = "Ein bayrisches Süßgebäck",
        answerC = "Ein österreichischer Knödel",
        answerD = "Eine Schweizer Käsenudel",
        correctAnswer = 0,
        explanation = "Spätzle sind eine traditionelle schwäbisch-alemannische Nudelspezialität aus einem einfachen Teig aus Mehl, Eiern, Salz und Wasser. Der Teig wird durch ein Sieb oder Spätzlehobel in kochendes Salzwasser gedrückt und dann kurz gekocht.",
        difficulty = 1,
        funFact = "Spätzle sind so sehr Teil der süddeutschen Kultur, dass sie in Baden-Württemberg und Bayern sogar als 'Kulturgut' gelten. Das schwäbische Sprichwort 'Schaffe, schaffe, Häusle baue und keine Spätzle spare' zeigt, wie tief sie in der Volkskultur verwurzelt sind."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welche Farbe hat echter Safran und warum ist er so teuer?",
        answerA = "Grün – weil er nur in den Tropen wächst",
        answerB = "Tiefrot – weil er von Hand aus Krokusblüten geerntet wird",
        answerC = "Blau – wegen seiner seltenen chemischen Verbindungen",
        answerD = "Weiß – weil er gefriergetrocknet wird",
        correctAnswer = 1,
        explanation = "Safranfäden sind tiefrot und stammen aus den Narben des Crocus sativus. Für ein Gramm Safran werden rund 150 bis 200 Blüten benötigt, die alle von Hand geerntet werden müssen – das macht Safran zum teuersten Gewürz der Welt.",
        difficulty = 1,
        funFact = "Safran verleiht Gerichten eine goldgelbe Farbe und ein einzigartiges Aroma. Schon die alten Griechen und Römer nutzten Safran als Färbe- und Heilmittel sowie als Luxusgewürz – es war zeitweise buchstäblich mit Gold aufgewogen."
    ),

)
