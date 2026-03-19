package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert3(): List<Question> = listOf(

    // ── MICHELIN-GUIDE & AUSZEICHNUNGSSYSTEM ──────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr vergab der Guide Michelin erstmals Sterne als Qualitätsbewertung für Restaurants?",
        answerA = "1900",
        answerB = "1920",
        answerC = "1926",
        answerD = "1936",
        correctAnswer = 2,
        explanation = "Michelin vergab 1926 erstmals einen Stern als Auszeichnung. Das abgestufte System mit einem, zwei und drei Sternen wurde 1931 eingeführt. Der Guide selbst erschien bereits 1900 — zunächst als Pannenhilfe für Autofahrer.",
        difficulty = 4,
        funFact = "Die ersten Michelin-Guides wurden kostenlos an Autofahrer verteilt, weil die Brüder Michelin glaubten, mehr Autofahrten würden mehr Reifen verschleißen."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Was symbolisiert der 'Bib Gourmand' im Guide Michelin?",
        answerA = "Drei Sterne für außergewöhnliche Küche",
        answerB = "Nachhaltige und ökologische Gastronomie",
        answerC = "Ein Restaurant mit besonderem Ambientekonzept",
        answerD = "Hervorragende Küche zu moderaten Preisen",
        correctAnswer = 3,
        explanation = "Der Bib Gourmand, seit 1997 vergeben, zeichnet Restaurants aus, die hervorragende Küche zu moderaten Preisen bieten. Der Name leitet sich vom Michelin-Maskottchen Bibendum ab. Es ist eine eigene Kategorie — kein Stern.",
        difficulty = 4,
        funFact = null
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Was stellt das Logo des Grünen Michelin-Sterns dar, der seit 2020 vergeben wird?",
        answerA = "Ein Blatt mit Wassertropfen",
        answerB = "Einen grünen Baum",
        answerC = "Einen Kreislaufpfeil",
        answerD = "Ein fünfblättriges Kleeblatt",
        correctAnswer = 3,
        explanation = "Das Logo des Grünen Michelin-Sterns ist ein fünfblättriges Kleeblatt. Die Auszeichnung würdigt seit 2020 Restaurants, die sich durch besonderes Engagement für nachhaltige und verantwortungsvolle Gastronomie auszeichnen.",
        difficulty = 4,
        funFact = "Der Grüne Stern kann sowohl mit einem, zwei oder drei klassischen Sternen kombiniert als auch eigenständig vergeben werden."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welche Stadt hatte 2025 weltweit die meisten Michelin-Drei-Sterne-Restaurants?",
        answerA = "Paris",
        answerB = "Tokio",
        answerC = "Hongkong",
        answerD = "New York",
        correctAnswer = 1,
        explanation = "Tokio ist seit Jahren die Stadt mit den meisten Michelin-Sternen weltweit und führt auch in der Drei-Sterne-Kategorie. Japan insgesamt hat mehr Michelin-Sterne als jedes andere Land — ein Zeichen der außerordentlichen Qualitätsdichte der japanischen Küche.",
        difficulty = 4,
        funFact = "Tokio hat mehr Michelin-Sterne als Paris und New York zusammen."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Wie viele anonyme Inspektoren besucht ein Restaurant in der Regel, bevor Michelin über eine Drei-Sterne-Vergabe entscheidet?",
        answerA = "Mindestens 2",
        answerB = "Mindestens 4",
        answerC = "Mindestens 6",
        answerD = "Mindestens 10",
        correctAnswer = 2,
        explanation = "Für die begehrten drei Sterne werden mindestens sechs verschiedene anonyme Inspektoren eingesetzt. Alle Besuche und Berichte werden von einem zentralen Komitee ausgewertet. Die Inspektoren bezahlen ihre Mahlzeiten stets selbst.",
        difficulty = 4,
        funFact = null
    ),

    // ── WELTKLASSE-RESTAURANTS & RANKINGS ────────────────────────────────────

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welches Restaurant gewann beim 'World's 50 Best Restaurants 2025' den ersten Platz?",
        answerA = "Noma, Kopenhagen",
        answerB = "Osteria Francescana, Modena",
        answerC = "Maido, Lima",
        answerD = "Disfrutar, Barcelona",
        correctAnswer = 2,
        explanation = "Das Restaurant Maido in Lima (Peru) von Chef Mitsuharu 'Micha' Tsumura gewann 2025 den Titel 'Bestes Restaurant der Welt' bei der World's 50 Best-Zeremonie in Turin. Maido verbindet japanische und peruanische Küche zur Nikkei-Cuisine.",
        difficulty = 4,
        funFact = "Der Begriff 'Nikkei' bezeichnet die Fusion peruanischer Zutaten mit japanischen Techniken — entstanden durch japanische Einwanderer, die ab 1899 nach Peru kamen."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was bedeutet der Name 'Noma', das legendäre Kopenhagener Restaurant von René Redzepi?",
        answerA = "Natürliche Aromen",
        answerB = "Neues Meer",
        answerC = "Nordisches Feuer",
        answerD = "Nordisches Essen",
        correctAnswer = 3,
        explanation = "Noma ist eine Silbenabkürzung aus den dänischen Wörtern 'nordisk' (nordisch) und 'mad' (Essen). Das 2003 eröffnete Restaurant gilt als Pionier der New Nordic Cuisine und war fünfmal bestes Restaurant der Welt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr eröffnete Ferran Adriàs El Bulli — das Restaurant, das die Molekularküche revolutionierte?",
        answerA = "1961",
        answerB = "1964",
        answerC = "1971",
        answerD = "1983",
        correctAnswer = 0,
        explanation = "El Bulli wurde 1961 als Strandbar in Roses (Katalonien) von einem deutschen Ehepaar eröffnet. Ferran Adrià übernahm 1984 die Küche und verwandelte es schrittweise in das revolutionärste Restaurant des 20. Jahrhunderts. El Bulli schloss 2011.",
        difficulty = 4,
        funFact = "El Bulli erhielt 2 Millionen Reservierungsanfragen pro Jahr für lediglich 8.000 verfügbare Plätze."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welches Restaurant von Massimo Bottura wurde 2016 und 2018 zum besten Restaurant der Welt gekürt?",
        answerA = "Osteria Francescana",
        answerB = "Piazza Duomo",
        answerC = "Dal Pescatore",
        answerD = "Il Luogo di Aimo e Nadia",
        correctAnswer = 0,
        explanation = "Die Osteria Francescana in Modena, 1995 von Massimo Bottura eröffnet, wurde 2016 und 2018 zum besten Restaurant der Welt gewählt. Bottura interpretiert klassische italienische Küche radikal neu — sein bekanntestes Gericht heißt 'Oops! I Dropped the Lemon Tart'.",
        difficulty = 4,
        funFact = "Bottura betreibt weltweit Refettorios — Sozialrestaurants, die Überschusslebensmittel zu Gourmet-Mahlzeiten für Obdachlose verarbeiten."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welches deutsche Restaurant schaffte es 2025 als einziges in die Top 50 der World's 50 Best Restaurants?",
        answerA = "Tantris, München",
        answerB = "Victor's Fine Dining, Perl-Nennig",
        answerC = "Jan, München",
        answerD = "Vendôme, Bergisch Gladbach",
        correctAnswer = 2,
        explanation = "Das Restaurant Jan von Chef Jan Hartwig in München schaffte als einziges deutsches Restaurant den Einzug in die Top 50 der World's 50 Best Restaurants 2025. Hartwig definiert laut Jury die deutsche Haute Cuisine mit kühner Kreativität und Präzision neu.",
        difficulty = 4,
        funFact = null
    ),

    // ── SPITZENKÖCHE & IHRE SIGNATURE-GERICHTE ───────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welche Kochtechnik ist das bekannteste Markenzeichen von Ferran Adriàs Küche bei El Bulli?",
        answerA = "Kryomazeration",
        answerB = "Vakuumkompression",
        answerC = "Sphärisierung",
        answerD = "Sous-vide-Garen",
        correctAnswer = 2,
        explanation = "Die Sphärisierung ist Adriàs Signature-Technik: Flüssigkeiten werden durch Reaktion von Natriumalginat mit Calciumchlorid in Kügelchen mit flüssigem Kern und dünner Gelatin-Hülle verwandelt. Bekanntestes Beispiel: seine flüssigen Olivenöl-Kugeln.",
        difficulty = 4,
        funFact = "Adrià verbrachte jährlich sechs Monate damit, ausschließlich neue Techniken im Labor zu entwickeln, bevor er das Restaurant für die Saison öffnete."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Wer gilt als Begründer der Nouvelle Cuisine und prägte die französische Spitzengastronomie wie kein anderer im 20. Jahrhundert?",
        answerA = "Michel Guérard",
        answerB = "Paul Bocuse",
        answerC = "Joël Robuchon",
        answerD = "Alain Ducasse",
        correctAnswer = 1,
        explanation = "Paul Bocuse (1926–2018) gilt als wichtigster Wegbereiter der Nouvelle Cuisine, die in den 1970ern die schwerere klassische Küche ablöste. Er betonte frische Zutaten, leichtere Saucen und ehrliche Produktqualität. Sein Restaurant nahe Lyon trägt bis heute drei Michelin-Sterne.",
        difficulty = 4,
        funFact = "Bocuse wurde 1989 von der französischen Kochzunft zum 'Koch des Jahrhunderts' ernannt — als einziger Lebender."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Welcher Koch hielt mit seinen Restaurants (u.a. Jamin, Paris) den Rekord der meisten Michelin-Sterne einer Einzelperson?",
        answerA = "Gordon Ramsay",
        answerB = "Joël Robuchon",
        answerC = "Alain Ducasse",
        answerD = "Pierre Gagnaire",
        correctAnswer = 1,
        explanation = "Joël Robuchon (1945–2018) hielt mit insgesamt 32 Michelin-Sternen den Weltrekord. Sein Konzept 'L'Atelier de Joël Robuchon' — Offenküche mit Barhocker direkt an der Küchentheke — revolutionierte das Fine-Dining-Erlebnis weltweit.",
        difficulty = 4,
        funFact = "Robuchons berühmtestes Gericht ist sein Kartoffelpüree: gleiche Teile Butter und Kartoffeln, sehr fein passiert."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "In welchem Land und in welcher Stadt betreibt Alain Ducasse das Restaurant 'Louis XV', das als erstes Hotelrestaurant drei Michelin-Sterne erhielt?",
        answerA = "Schweiz, Genf",
        answerB = "Monaco, Monte Carlo",
        answerC = "Frankreich, Paris",
        answerD = "Italien, Venedig",
        correctAnswer = 1,
        explanation = "Das Louis XV im Hôtel de Paris in Monte Carlo (Monaco) war 1990 das erste Hotelrestaurant weltweit, das drei Michelin-Sterne erhielt — nur 33 Monate nach Eröffnung. Alain Ducasse war damals erst 33 Jahre alt.",
        difficulty = 4,
        funFact = "Ducasse betreibt heute Restaurants auf 4 Kontinenten und hält als Einzelperson mehr als 20 Michelin-Sterne gleichzeitig."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Wer ist der Pionier der deutschen Haute Cuisine, der 1971 im Tantris München erstmals drei Michelin-Sterne für Deutschland erkochte?",
        answerA = "Harald Wohlfahrt",
        answerB = "Heinz Winkler",
        answerC = "Eckart Witzigmann",
        answerD = "Dieter Müller",
        correctAnswer = 2,
        explanation = "Eckart Witzigmann erkochte 1979 im Aubergine (München) als erster deutschsprachiger Koch drei Michelin-Sterne und gilt als 'Koch des Jahrhunderts' in Deutschland. Er arbeitete zuvor bei Paul Bocuse und prägte eine ganze Generation deutscher Küchenchefs.",
        difficulty = 4,
        funFact = "Witzigmanns Schüler sind eine 'Wer ist Wer' der deutschen Spitzengastronomie: Alfons Schuhbeck, Johann Lafer, Otto Koch und viele weitere."
    ),

    // ── HAUTE CUISINE — GESCHICHTE & BEGRIFFE ────────────────────────────────

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welcher französische Koch des 19. Jahrhunderts gilt als Begründer der 'Haute Cuisine' und ließ sich bei der Speisenpräsentation von Architektur inspirieren?",
        answerA = "Ferdinand Point",
        answerB = "Marie-Antoine Carême",
        answerC = "Auguste Escoffier",
        answerD = "Taillevent",
        correctAnswer = 1,
        explanation = "Marie-Antoine Carême (1784–1833) kodifizierte die klassische französische Küche und erfand die Grundsaucen. Seine aufwendigen 'Pièces montées' — essbare Bauten aus Zucker und Marzipan — inspirierten sich an griechischen Tempeln und Pyramiden.",
        difficulty = 4,
        funFact = "Carême war Autodidakt und lernte Kochen als Straßenkind in Paris, nachdem ihn sein Vater im Alter von 8 Jahren ausgesetzt hatte."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Auguste Escoffier führte das sogenannte 'Brigade-System' in der Profiküche ein. Wie nennt man die höchste Position in dieser Hierarchie?",
        answerA = "Garde Manger",
        answerB = "Chef de Cuisine",
        answerC = "Sous-Chef",
        answerD = "Chef de Partie",
        correctAnswer = 1,
        explanation = "Der Chef de Cuisine steht an der Spitze von Escoffiers Brigade-System. Darunter folgen Sous-Chef, Chef de Partie (Stationsköche), Commis und Apprenti. Escoffier entwickelte dieses System im Ritz London und Savoy, um die chaotische Küche seiner Zeit zu strukturieren.",
        difficulty = 4,
        funFact = "Escoffiers Brigade-System von 1900 ist in seinen Grundzügen noch heute in Spitzenrestaurants weltweit Standard."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Mise en Place' in der Profiküche?",
        answerA = "Die vollständige Vorbereitung aller Zutaten und Werkzeuge vor dem Kochbeginn",
        answerB = "Das Ritual der Menüabstimmung zwischen Küche und Service",
        answerC = "Die Platzierung der Gäste im Restaurant",
        answerD = "Die Anrichte-Technik für das finale Gericht",
        correctAnswer = 0,
        explanation = "Mise en Place (französisch: 'alles an seinen Platz') bezeichnet die vollständige Vorbereitung — Zutaten portioniert, geschnitten, gewogen, Saucen vorproduziert, Werkzeuge bereit — bevor der eigentliche Kochservice beginnt. Es ist das Fundament professioneller Küche.",
        difficulty = 4,
        funFact = null
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Terroir' in der Spitzengastronomie, ursprünglich aus der Weinwelt?",
        answerA = "Die Herkunftszertifizierung von Fleischprodukten",
        answerB = "Den Einfluss von Boden, Klima und Umgebung auf den Geschmack eines Produkts",
        answerC = "Die Zubereitungstechnik regionaler Gerichte",
        answerD = "Das Konzept der saisonalen Menüplanung",
        correctAnswer = 1,
        explanation = "Terroir bezeichnet den Gesamteinfluss von Boden, Klima, Mikroklima und geografischer Lage auf den Charakter eines Produkts. In der Spitzengastronomie fließt das Konzept zunehmend ein: Köche wie René Redzepi betonen, wie sehr der Ursprungsort den Geschmack prägt.",
        difficulty = 4,
        funFact = "Das Konzept 'Terroir' findet sich heute in der Küche von Top-Restaurants weltweit — von japanischen Fischern die ihren Fang nach Fangort sortieren bis zu amerikanischen Köchen die ihr Gemüse nach Bodentypen auswählen."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welches Konzept beschreibt die 'New Nordic Cuisine', die René Redzepi und das Noma maßgeblich prägten?",
        answerA = "Strenge Verwendung lokaler, saisonaler Zutaten und Fermentierungstechniken",
        answerB = "Vegane Küche auf Basis nordeuropäischer Pflanzenwelt",
        answerC = "Reininterpretation klassischer französischer Techniken mit nordischen Produkten",
        answerD = "Fusion von skandinavischer und japanischer Küche mit Fokus auf Umami",
        correctAnswer = 0,
        explanation = "Die New Nordic Cuisine, 2004 in einem Manifest von 12 Köchen (darunter Redzepi) definiert, setzt auf ausschließlich lokale und saisonale Zutaten, vergessene Techniken wie Fermentation, Räuchern und Einlegen sowie eine tiefe Verbindung mit Natur und Jahreszeiten.",
        difficulty = 4,
        funFact = "Das New Nordic Manifesto wurde 2004 von Köchen aus Dänemark, Schweden, Norwegen, Finnland, Island und den Färöern gemeinsam formuliert."
    ),

    // ── MOLEKULARKÜCHE & MODERNE TECHNIKEN ───────────────────────────────────

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Wer prägte 1990 den wissenschaftlichen Begriff 'Molekulargastronomie'?",
        answerA = "Harold McGee",
        answerB = "Hervé This",
        answerC = "Ferran Adrià",
        answerD = "Heston Blumenthal",
        correctAnswer = 1,
        explanation = "Der französische Physikochemiker Hervé This prägte 1990 gemeinsam mit dem ungarischen Physiker Nicholas Kurti den Begriff 'Molekulargastronomie'. This erforscht seit Jahrzehnten die chemischen und physikalischen Prozesse beim Kochen.",
        difficulty = 4,
        funFact = "Hervé This veröffentlichte das erste wissenschaftliche Forschungsprogramm zur Gastronomie und definierte über 25.000 'kulinarische Präzisionen' — Volksweisheiten über das Kochen, die er wissenschaftlich überprüfte."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welche zwei Substanzen reagieren bei der klassischen 'Basischen Sphärisierung' miteinander, um eine Gelkugel zu erzeugen?",
        answerA = "Methylcellulose und Natriumcitrat",
        answerB = "Agar-Agar und Kaliumchlorid",
        answerC = "Xanthan und Calciumlactat",
        answerD = "Natriumalginat und Calciumchlorid",
        correctAnswer = 3,
        explanation = "Bei der basischen Sphärisierung wird Natriumalginat in die Flüssigkeit eingearbeitet, die dann in ein Calciumchloridbad getropft wird. Das Calcium vernetzt die Alginat-Ketten sofort zu einer Gelschicht — die Kugel hat einen flüssigen Kern und eine dünne feste Hülle.",
        difficulty = 4,
        funFact = null
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Beim 'Sous-vide-Garen' werden Lebensmittel vakuumiert und bei welcher charakteristischen Eigenschaft gegart?",
        answerA = "Sehr niedrigen, präzise kontrollierten Temperaturen im Wasserbad",
        answerB = "Unter Stickstoffatmosphäre ohne Wasserkontakt",
        answerC = "Wechselnden Temperaturen zwischen 0 °C und 80 °C",
        answerD = "Sehr hohem Druck (über 10 bar)",
        correctAnswer = 0,
        explanation = "Sous-vide (französisch: 'unter Vakuum') gart Lebensmittel in versiegelten Beuteln im Wasserbad bei präzise kontrollierten Niedrigtemperaturen — oft 55–65 °C für Fleisch. Das garantiert perfekte, homogene Garstufen, die auf klassischem Weg kaum reproduzierbar wären.",
        difficulty = 4,
        funFact = "Die Sous-vide-Technik wurde in den 1970ern vom französischen Koch Georges Pralus für Foie gras entwickelt, um Gewichtsverlust zu minimieren."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welche Technik nutzt flüssigen Stickstoff (−196 °C) in der modernen Spitzenküche hauptsächlich?",
        answerA = "Zur Fermentation von Gemüse unter anaeroben Bedingungen",
        answerB = "Zum sofortigen Gefrieren und Erstellen von Texturen wie Pulvern oder Eis",
        answerC = "Zur Emulsifikation von Saucen",
        answerD = "Zum Sous-vide-Garen von Proteinen",
        correctAnswer = 1,
        explanation = "Flüssiger Stickstoff gefriert Lebensmittel in Sekunden, was extrem feine Eiskristalle erzeugt (kein wässriger Matsch). Köche wie Heston Blumenthal und Ferran Adrià nutzten ihn für Tisch-Eiscreme, Pulver aus Fetten wie Olivenöl sowie dramatische Tischpräsentationen mit Nebel.",
        difficulty = 4,
        funFact = "Heston Blumenthal ließ Stickstoff-Eis direkt vor dem Gast am Tisch zubereiten — als Teil seiner Philosophie, dass Kochen Theater ist."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist 'Transglutaminase' und wie wird es in der Spitzenküche eingesetzt?",
        answerA = "Ein Gärmittel für Sauerteigbrote",
        answerB = "Ein synthetisches Verdickungsmittel für Saucen",
        answerC = "Ein Enzym, das Proteine miteinander verklebt und neue Fleischformen ermöglicht",
        answerD = "Ein Farbstoff, der Lebensmitteln eine unnatürliche Farbe verleiht",
        correctAnswer = 2,
        explanation = "Transglutaminase (auch 'Fleischkleber' genannt) ist ein natürliches Enzym, das Proteinmoleküle miteinander verbindet. Köche nutzen es, um verschiedene Proteine zu neuen Formen zu verschmelzen — z.B. Lachs-Garnelen-Kompositionen oder perfekt gleichmäßige Fleischscheiben aus Fleischabschnitten.",
        difficulty = 4,
        funFact = null
    ),

    // ── RESTAURANTKULTUR & FINE-DINING-KONZEPTE ──────────────────────────────

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet 'Omakase' im japanischen Fine-Dining-Kontext?",
        answerA = "Die traditionelle japanische Tischordnung",
        answerB = "Ein Festmenü mit exakt 12 Gängen",
        answerC = "Ich überlasse es dem Koch — der Chef bestimmt das Menü",
        answerD = "Ein Live-Kocherlebnis vor dem Gast",
        correctAnswer = 2,
        explanation = "Omakase (お任せ) bedeutet wörtlich 'Ich überlasse es dir'. Der Gast vertraut dem Koch vollständig die Menüauswahl an. In Sushi-Omakase-Restaurants bestimmt der Itamae die Abfolge je nach Tagesfrische, Saison und dem, was er für den Gast für richtig hält.",
        difficulty = 4,
        funFact = "Im echten Omakase wird der Preis erst am Ende bekannt — Gäste vertrauen dem Koch nicht nur beim Essen, sondern auch beim Preis."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Was ist das kulinarische Konzept hinter 'Farm-to-Table' (Vom Hof auf den Tisch)?",
        answerA = "Tischservice durch die Landwirte selbst",
        answerB = "Gerichte die ausschließlich auf dem Teller mit Frischkräutern aus Topfpflanzen garniert werden",
        answerC = "Industrielle Großproduktion mit direktem Liefervertrag",
        answerD = "Direkte Beziehung zwischen Restaurant und lokalen Produzenten ohne Zwischenhändler",
        correctAnswer = 3,
        explanation = "Farm-to-Table bezeichnet die direkte Versorgungskette: Restaurants beziehen Zutaten direkt von lokalen Bauern, Züchtern und Fischern — ohne Großhändler. Das garantiert maximale Frische, stärkt lokale Landwirtschaft und ist heute ein Kernprinzip vieler Spitzenrestaurants.",
        difficulty = 4,
        funFact = "Das Blue Hill at Stone Barns in New York betreibt das Farmkonzept radikal: Gäste wählen kein Menü, sondern die Küche kocht, was der Tag vom eigenen Gut hergibt."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Amuse-Bouche' in der gehobenen Gastronomie?",
        answerA = "Ein kleiner, kostenloser Gruss aus der Küche vor dem ersten Gang",
        answerB = "Ein Digestif-Cocktail nach dem Dessert",
        answerC = "Die handgeschriebene Speisekarte des Abends",
        answerD = "Ein Palate-Cleanser zwischen den Hauptgängen",
        correctAnswer = 0,
        explanation = "Amuse-Bouche (französisch: 'Mundvergnügen') ist ein kleiner, nicht bestellter Häppchen-Gruss aus der Küche, der vor dem eigentlichen ersten Gang serviert wird. Er soll Gaumen und Erwartung stimulieren und zeigt oft die Handschrift und Kreativität des Kochs in miniaturisierter Form.",
        difficulty = 4,
        funFact = "Im Spitzenniveau können Amuse-Bouche-Serien aus 5–10 winzigen Häppchen bestehen — ein Miniaturmenü für sich."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Tasting Menu' bzw. 'Menu Dégustation' in der Spitzengastronomie?",
        answerA = "Ein spezielles Weinbegleitungsmenü ohne Speisen",
        answerB = "Ein Buffet mit Kostproben aller Gerichte der regulären Karte",
        answerC = "Eine private Küchenführung mit Kostproben für Stammgäste",
        answerD = "Ein mehrgängiges Menü mit vielen kleinen Portionen, das die gesamte Küchenwelt des Chefs zeigt",
        correctAnswer = 3,
        explanation = "Das Tasting Menu ist ein mehrgängiges Degustationsmenü (oft 8–20 Gänge), bei dem jeder Gang in kleiner Portion präsentiert wird. Es gibt dem Koch die Freiheit, seine gesamte kulinarische Philosophie und technische Bandbreite zu demonstrieren — die reinste Form des Fine Dining.",
        difficulty = 4,
        funFact = null
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Welcher Begriff bezeichnet die Praxis, ein Restaurant als einzigen Tisch mit einem individuellen Privatmenü zu buchen?",
        answerA = "Chef's Table",
        answerB = "Table d'hôte",
        answerC = "Exclusive Buyout",
        answerD = "Grand Couvert",
        correctAnswer = 0,
        explanation = "Der 'Chef's Table' bezeichnet ursprünglich einen privilegierten Platz direkt an oder nahe der Küche mit direktem Blick auf die Köche. In modernen Kontexten meint es oft exklusive Erlebnisse für eine Handvoll Gäste direkt am Koch — oder ein komplett privates Restaurant-Erlebnis.",
        difficulty = 4,
        funFact = "Die Netflix-Dokumentarserie 'Chef's Table' machte das Konzept und die dahinterstehenden Köche wie Massimo Bottura, Grant Achatz und Niki Nakayama weltweit berühmt."
    ),

    // ── REGIONALE KOCHKULTUREN WELTWEIT ──────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welches Land hat trotz seiner Einwohnerzahl und geografischen Größe prozentual die höchste Dichte an Michelin-Sternen weltweit?",
        answerA = "Schweiz",
        answerB = "Luxemburg",
        answerC = "Japan",
        answerD = "Frankreich",
        correctAnswer = 1,
        explanation = "Luxemburg hat mit seinen wenigen Restaurants und kleiner Einwohnerzahl eine der höchsten Michelin-Stern-Dichten pro Kopf weltweit. Das kleine Land betreibt eine außerordentlich hochwertige Restaurantkultur, die weit über seine Größe hinausgeht.",
        difficulty = 4,
        funFact = null
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kaiseki' in der japanischen Hochküche?",
        answerA = "Die japanische Bezeichnung für Sushi-Omakase",
        answerB = "Ein Street-Food-Festival in Kyoto",
        answerC = "Ein schnelles Businesslunch-Format mit fünf Gängen",
        answerD = "Ein streng ritualisiertes Mehrgänge-Menü, das aus der Teezeremonie entstammt",
        correctAnswer = 3,
        explanation = "Kaiseki (懐石/会席) ist die höchste Form japanischer Hochküche — ein stark ritualisiertes Mehrgänge-Menü, das Saisonalität, regionale Zutaten und präzise Handwerkskunst vereint. Es entstammt der Teezeremonie (chado) und folgt strengen Regeln in Abfolge, Präsentation und Harmonie.",
        difficulty = 4,
        funFact = "In Kyoto gibt es Kaiseki-Restaurants, die seit über 300 Jahren in Familienbesitz sind und deren Rezepte als streng gehütetes Geheimnis weitergegeben werden."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist 'Nikkei Cuisine', die kulinarische Tradition, die Maidos Chef Mitsuharu Tsumura pflegt?",
        answerA = "Die Fusion japanischer Techniken mit peruanischen Zutaten durch japanische Einwanderer",
        answerB = "Hawaiianische Küche mit japanischen Ramen-Elementen",
        answerC = "Nordkoreanische Küche mit japanischen Einflüssen",
        answerD = "Moderne Neuinterpretation traditioneller japanischer Kaiseki-Küche",
        correctAnswer = 0,
        explanation = "Nikkei Cuisine entstand durch japanische Einwanderer, die ab 1899 nach Peru kamen und japanische Techniken mit lokalen peruanischen Zutaten wie Aji Amarillo, Chicha und Meeresfrüchten verschmolzen. Es ist eine der originellsten Fusionsküchen der Welt.",
        difficulty = 4,
        funFact = "Peru ist neben Japan eines der wenigen Länder, in denen roher Fisch traditionell seit Jahrhunderten eine zentrale Rolle spielt — Ceviche und Sashimi verbindet mehr als man denkt."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welche UNESCO-Auszeichnung erhielt die mexikanische Küche als erste der Welt im Jahr 2010?",
        answerA = "Immaterielles Kulturerbe der Menschheit",
        answerB = "Globales Ernährungserbe",
        answerC = "Welterbe der materiellen Kultur",
        answerD = "Kulturhauptstadt der Gastronomie",
        correctAnswer = 0,
        explanation = "Die traditionelle mexikanische Küche wurde 2010 als erste Landesküche in die UNESCO-Liste des immateriellen Kulturerbes der Menschheit aufgenommen — mit Fokus auf die Michoacán-Küche als repräsentatives Beispiel. Frankreich folgte 2010 ebenfalls mit dem 'gastronomischen Mahl der Franzosen'.",
        difficulty = 4,
        funFact = "Die mexikanische Küche basiert auf der 'heiligen Dreifaltigkeit': Mais, Bohnen und Kürbis — seit über 9.000 Jahren kultiviert und kombiniert."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ceviche' und welchem chemischen Prozess wird der Fisch dabei unterzogen?",
        answerA = "Gebratenes Fischgericht aus Peru mit Chili-Marinade",
        answerB = "Geräucherter Fisch nach aztekischer Räuchertradition",
        answerC = "Peruvianisches Fischeintopf-Gericht, bei dem Fisch bei 80 °C pochiert wird",
        answerD = "Rohes Fischgericht, bei dem Säure (Limettensaft) Proteine denaturiert — kein Erhitzen",
        correctAnswer = 3,
        explanation = "Ceviche ist peruanisches Nationalgericht: roher Fisch wird in Limettensaft mariniert, dessen Citronensäure die Proteine denaturiert (wie Hitze) — ohne Kochen. Dieser Prozess heißt 'Acidic Denaturation'. Ceviche enthält außerdem Aji Amarillo, rote Zwiebeln und Koriander.",
        difficulty = 4,
        funFact = "Das 'Leche de Tigre' (Tigermilch) — der übrig bleibende Marinadensaft — gilt in Peru als Kater-Heilmittel und wird pur als Getränk verkauft."
    ),

    // ── WEIN & FOOD-PAIRING IN DER SPITZENGASTRONOMIE ────────────────────────

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Sommelier' in einem Spitzenrestaurant?",
        answerA = "Den Spezialisten für Käseauswahl und -service",
        answerB = "Den Weinexperten, der für Weinkeller, Beratung und Begleitung der Speisen zuständig ist",
        answerC = "Den Chefkoch der Dessertabteilung",
        answerD = "Den Restaurantmanager der Gasträume",
        correctAnswer = 1,
        explanation = "Der Sommelier ist der Weinexperte des Hauses: verantwortlich für den Weinkeller, Einkauf, Weinliste und persönliche Beratung der Gäste. In Spitzenrestaurants empfiehlt er Weinbegleitung ('Pairing') passend zu jedem Gang des Tasting Menüs.",
        difficulty = 4,
        funFact = "Der 'Best Sommelier of the World'-Wettbewerb (ASI) findet alle 3 Jahre statt. Kandidaten müssen in 30 Sekunden Weinregion, Rebsorte, Jahrgang und Produzent eines Weines identifizieren."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Welches Prinzip beschreibt das perfekte Food-Wine-Pairing nach der Regel 'Gewicht trifft Gewicht'?",
        answerA = "Wein und Speise sollen in Körper und Intensität harmonieren — leicht zu leicht, reich zu reich",
        answerB = "Wein muss immer teurer sein als das Gericht, das er begleitet",
        answerC = "Weißwein passt ausschließlich zu Fisch, Rotwein ausschließlich zu Fleisch",
        answerD = "Leichte Speisen werden immer mit Rotwein kombiniert",
        correctAnswer = 0,
        explanation = "Das Grundprinzip des Food-Pairing besagt: Wein und Speise müssen in ihrer Intensität und ihrem 'Gewicht' harmonieren. Ein körperreicher Burgunder zu einer leichten Forelle würde das Gericht überdecken; ein schlanker Riesling zu einem dunklen Schmorgericht würde verschwinden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sake' und bei welcher Temperatur wird er in der japanischen Hochküche traditionell eingesetzt?",
        answerA = "Fermentierter Reiswein, ausschließlich bei Zimmertemperatur 22 °C serviert",
        answerB = "Destillierter Reisbrand, stets bei Raumtemperatur genossen",
        answerC = "Japanischer Reiswein, je nach Qualität warm (40–55 °C) oder kühl (10–15 °C) serviert",
        answerD = "Japanischer Reiswein, traditionsgemäß ausschließlich eisgekühlt bei 5 °C serviert",
        correctAnswer = 2,
        explanation = "Sake (日本酒) ist fermentierter Reiswein mit ca. 15 % Alkohol. Qualitativ höhere Sake (Ginjo, Daiginjo) werden kühl serviert um Aromafeinheiten zu bewahren; günstigere werden erwärmt. In kaiseki-Restaurants wählt der Sommelier Sake nach dem gleichen Pairing-Prinzip wie Wein.",
        difficulty = 4,
        funFact = "Der Poliergrad des Reises bestimmt die Sake-Klasse: Daiginjo-Sake wird aus Reis gebraut, von dem mindestens 50 % abpoliert wurden — nur der reine Kern des Korns wird verwendet."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' und wer entdeckte diesen fünften Grundgeschmack?",
        answerA = "Der Begriff für bittere Noten in der japanischen Teezeremonie",
        answerB = "Ein koreanisches Gewürz auf Basis fermentierter Sojabohnen",
        answerC = "Eine japanische Süßigkeit — entdeckt von Koch Yukio Hattori 1982",
        answerD = "Der fünfte Grundgeschmack ('herzhaft-würzig') — entdeckt von Kikunae Ikeda 1908",
        correctAnswer = 3,
        explanation = "Umami (うま味, 'wohlschmeckend') wurde 1908 vom japanischen Chemiker Kikunae Ikeda als fünfter Grundgeschmack identifiziert, als er die Substanz Glutamat in Kombu-Algen isolierte. Umami ist der würzig-herzhafte, runde Geschmack von Parmesan, Sojasauce, Tomaten und Fleisch.",
        difficulty = 4,
        funFact = "Ikeda ließ Mononatriumglutamat (MSG) patentieren und gründete das Unternehmen Ajinomoto — heute einer der größten Lebensmittelkonzerne Japans."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welches Phänomen beschreibt 'Synästhesie' in der Spitzengastronomie, wie Heston Blumenthal es einsetzt?",
        answerA = "Das Zusammenspiel mehrerer Sinne (Klang, Licht, Textur) um den Geschmack zu verstärken",
        answerB = "Das Servieren aller Gänge gleichzeitig statt sequenziell",
        answerC = "Die Kombination von mehr als 10 Gewürzen in einem einzigen Gericht",
        answerD = "Die chemische Reaktion zwischen zwei unvereinbaren Zutaten",
        correctAnswer = 0,
        explanation = "Heston Blumenthal (The Fat Duck) nutzt synästhetische Effekte bewusst: Sein Gericht 'Sound of the Sea' wird mit Kopfhörern serviert, über die Meeresrauschen klingt — nachgewiesen verstärkt dies den Geschmack von Meeresfrüchten. Musik, Licht, Tischware und Klang formen den Geschmack mit.",
        difficulty = 4,
        funFact = "Oxford-Forscher belegten in Studien mit Blumenthal, dass laute versus leise Musik den wahrgenommenen Bittergeschmack eines Kaffees messbar beeinflusst."
    ),

    // ── LUXUSZUTATEN & DELIKATESSEN ───────────────────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welche Trüffelsorte gilt als die wertvollste und teuerste der Welt und stammt aus dem Périgord in Frankreich?",
        answerA = "Tuber brumale (Wintertrüffel)",
        answerB = "Tuber magnatum (Weiße Alba-Trüffel)",
        answerC = "Tuber aestivum (Sommertrüffel)",
        answerD = "Tuber melanosporum (Schwarze Périgord-Trüffel)",
        correctAnswer = 1,
        explanation = "Die Weiße Trüffel (Tuber magnatum) aus Alba im Piemont, nicht die schwarze Périgord-Trüffel, erzielt die höchsten Preise — bis zu 5.000 € pro Kilo oder mehr. Sie kann nicht kultiviert werden und muss mit speziell trainierten Hunden aufgespürt werden. Die schwarze Périgord-Trüffel ist ebenfalls hochwertig, aber günstiger.",
        difficulty = 4,
        funFact = "Die teuerste jemals versteigerte Weiße Trüffel wog 1,89 kg und wurde 2007 für 330.000 USD an das Macau-Casino versteigert."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was ist 'Foie Gras' und aus welchem Land kommt der weltweit größte Teil der Produktion?",
        answerA = "Gepresstes Fischrogen — überwiegend aus Russland",
        answerB = "Marinierte Schweineleber — überwiegend aus Spanien",
        answerC = "Gemästete Enten- oder Gänseleber — überwiegend aus Frankreich",
        answerD = "Kalbsleberpastete — überwiegend aus der Schweiz",
        correctAnswer = 2,
        explanation = "Foie Gras (französisch: 'fette Leber') ist die vergrößerte Leber von Enten oder Gänsen, die durch Gavage (Zwangsernährung) gemästet wurden. Frankreich produziert etwa 75 % der weltweiten Foie-Gras-Menge. Es ist eines der umstrittensten, aber auch ikonischsten Produkte der Haute Cuisine.",
        difficulty = 4,
        funFact = "Foie Gras ist in über 15 Ländern verboten. Frankreich hat die Produktion hingegen per Gesetz als kulturelles und gastronomisches Nationalerbe geschützt."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Welche drei Hauptkaviar-Störarten liefern den klassischen russisch-iranischen Beluga-, Osietra- und Sevruga-Kaviar?",
        answerA = "Acipenser naccarii, Huso huso, Polyodon spathula",
        answerB = "Huso huso, Acipenser gueldenstaedtii, Acipenser stellatus",
        answerC = "Acipenser baerii, Acipenser sturio, Scaphirhynchus platorynchus",
        answerD = "Huso dauricus, Acipenser sinensis, Acipenser ruthenus",
        correctAnswer = 1,
        explanation = "Beluga-Kaviar stammt vom Europäischen Hausen (Huso huso), Osietra vom Russischen Stör (Acipenser gueldenstaedtii) und Sevruga vom Sterlet/Sternhausen (Acipenser stellatus). Alle drei Arten sind vom Aussterben bedroht — Wildentnahme ist weitgehend verboten.",
        difficulty = 4,
        funFact = "Beluga-Stör kann 100 Jahre alt und bis zu 7 Meter lang werden. Ein einziges Weibchen kann bis zu 15 % seines Körpergewichts als Rogen produzieren — bis zu 100 kg."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was ist 'Wagyu' und warum sind A5-Wagyu-Rinder in der Spitzengastronomie so außergewöhnlich teuer?",
        answerA = "Japanische Rinderrasse mit extremer intramuskulärer Fettmarmorierung und genetisch bedingter hoher Ölsäure",
        answerB = "Irisches Weidefleisch, das ausschließlich auf Seegras-Diät aufgezogen wird",
        answerC = "Amerikanische Angus-Kreuzung mit spezieller Bier-Diät für intensives Aroma",
        answerD = "Eine australische Schafrasse — teuer wegen extrem langer Aufzuchtzeit von 5 Jahren",
        correctAnswer = 0,
        explanation = "Wagyu (和牛, 'japanisches Rind') ist eine genetisch einzigartige Rinderrasse mit extremer intramuskulärer Fettmarmorierung. A5 ist die höchste Qualitätsstufe. Das Fett ist reich an Ölsäure (wie Olivenöl) und schmilzt bei Körpertemperatur — der Schmelzpunkt liegt unter 37 °C.",
        difficulty = 4,
        funFact = "Kobe-Beef ist Wagyu aus der Region Kobe, das zusätzliche Kriterien erfüllt: Tajima-Rasse, in der Präfektur Hyogo geboren und aufgezogen, A4/A5-Qualität. Echter Kobe-Beef kommt aus nur etwa 3.000–4.000 Tieren pro Jahr."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist 'Bottarga' und in welcher Küchentradition hat diese Delikatesse ihren Ursprung?",
        answerA = "Geräuchertes Walfleisch aus der isländischen Küche",
        answerB = "Fermentierter Schweinespeck aus der korsischen Charcuterie-Tradition",
        answerC = "Eingelegte Senfkörner aus der deutschen Küche des 17. Jahrhunderts",
        answerD = "Gepresster und getrockneter Fischrogen (Meeräsche oder Thunfisch) — mediterrane, besonders sardische Tradition",
        correctAnswer = 3,
        explanation = "Bottarga ist gepresster und getrockneter Rogen von Meeräsche (Bottarga di Muggine) oder Thunfisch (Bottarga di Tonno). Ursprung ist Sardinien und Sizilien, aber auch im Nahen Osten und Japan bekannt. Dünn gehobelt über Pasta oder Toast, hat sie ein intensives Umami-Meeres-Aroma.",
        difficulty = 4,
        funFact = "Bottarga wird auch als 'Kaviar des Mittelmeers' bezeichnet. Das Wort stammt vom arabischen 'batarikh' — ein Zeichen phoenizisch-arabischer Handelswege im Mittelmeer."
    ),

    // ── DESSERTS, PÂTISSERIE & KÄSE IN DER SPITZENGASTRONOMIE ───────────────

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet einen 'Chef Pâtissier' von einem 'Chef de Cuisine' in einem Spitzenrestaurant?",
        answerA = "Es gibt keinen Unterschied — beide Titel sind austauschbar",
        answerB = "Der Chef Pâtissier ist nur in frankophonen Ländern eine anerkannte Position",
        answerC = "Der Chef Pâtissier leitet die Dessert- und Gebäckabteilung als eigenständige, hochspezialisierte Einheit",
        answerD = "Der Chef Pâtissier ist ausschließlich für Brot und Vorspeisen zuständig",
        correctAnswer = 2,
        explanation = "Der Chef Pâtissier (Konditormeister) leitet die eigenständige Dessert-, Gebäck- und Pralinenabteilung — eine hochspezialisierte Rolle, die oft eine eigene Brigade umfasst. In Drei-Sterne-Restaurants ist es eine gleichwertige Spitzenposition neben dem Küchenchef.",
        difficulty = 4,
        funFact = "Weltberühmte Chef Pâtissiers wie Pierre Hermé (Paris) und Dominique Ansel (New York, Erfinder des Cronuts) sind Kultstatus-Figuren, die dem Küchenchef eines Spitzenrestaurants in Popularität in nichts nachstehen."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tempering' bei der Schokoladenverarbeitung und warum ist es für Spitzenpâtissiers unerlässlich?",
        answerA = "Die alkoholische Fermentation der Kakaobohnen vor dem Rösten",
        answerB = "Das Mischen verschiedener Kakaosorten für ein harmonisches Aromaprofil",
        answerC = "Das Aufschlagen von Schokolade mit Rahm zu einer stabilen Ganache",
        answerD = "Die präzise Temperaturführung beim Schmelzen und Abkühlen, die Kakaobutter in stabiler Kristallform setzt",
        correctAnswer = 3,
        explanation = "Tempering (Temperieren) bezeichnet die präzise Temperaturführung: Schokolade wird auf ca. 45–50 °C geschmolzen, auf 27 °C abgekühlt und wieder auf 31–32 °C (Zartbitter) erwärmt. Nur so bildet Kakaobutter stabile Beta-V-Kristalle — die Schokolade glänzt, hat Schnappigkeit und schmilzt korrekt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "In welcher französischen Region liegt das Dorf Époisses, das dem gleichnamigen Rotschmierenkäse seinen Namen gab — einem von Brillat-Savarin als 'König der Käse' bezeichneten Produkt?",
        answerA = "Auvergne",
        answerB = "Elsass",
        answerC = "Burgund",
        answerD = "Normandie",
        correctAnswer = 2,
        explanation = "Époisses de Bourgogne stammt aus dem Burgund (Gemeinde Époisses). Der Rotschmierekäse wird während der Reifung mit Marc de Bourgogne (Tresterbrand) gewaschen, was seine orange Rinde und das intensive Aroma erzeugt. Jean Anthelme Brillat-Savarin nannte ihn im 19. Jahrhundert 'König der Käse'.",
        difficulty = 4,
        funFact = "Époisses ist so intensiv riechend, dass er auf einigen französischen Bahnhöfen und Zügen verboten ist."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist 'Affinage' im Kontext der Käseherstellung und welche Berufsbezeichnung trägt der Spezialist dafür?",
        answerA = "Das Pressen des Käsebruchs — durchgeführt vom Fromager",
        answerB = "Die Pasteurisierung der Milch — durchgeführt vom Laiier",
        answerC = "Die Auswahl der Milchlieferanten — durchgeführt vom Sélectionneur",
        answerD = "Die Kunst der Käsereifung in kontrollierten Kellern — durchgeführt vom Affineur",
        correctAnswer = 3,
        explanation = "Affinage bezeichnet die Kunst und Wissenschaft der Käsereifung: Im Reifekeller (cave d'affinage) überwacht der Affineur Temperatur, Feuchtigkeit, Wendeintervalle, Behandlung der Rinde mit Salzlake, Schimmelpilzkulturen oder Bränden. Große Affineurs wie Marie-Anne Cantin oder Bernard Antony sind in der Gastronomiewelt Stars.",
        difficulty = 4,
        funFact = "Spitzenrestaurants wie das Restaurant Alain Ducasse im Plaza Athénée Paris servieren Käse, der von handverlesenen Affineurs stammt — Herkunft und Affineur sind auf der Käsekarte angegeben."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welcher Chemiker beschrieb erstmals das Konzept der 'Flavour Pairing Theory' — die Idee, dass Zutaten mit gleichen Aromaverbindungen harmonisch kombiniert werden können?",
        answerA = "Hervé This und Pierre Gagnaire",
        answerB = "Ferran Adrià und Albert Adrià",
        answerC = "Harold McGee",
        answerD = "Heston Blumenthal (in Zusammenarbeit mit Parfümeur François Benzi)",
        correctAnswer = 3,
        explanation = "Die Flavour Pairing Theory wurde von Heston Blumenthal zusammen mit dem Parfümeur François Benzi entwickelt: Zutaten mit identischen Hauptaromaverbindungen sollen harmonisch schmecken. Daraus entstanden Kombinationen wie weiße Schokolade mit Kaviar oder Erdbeere mit Koriandersamen — beide teilen Aromastoffe.",
        difficulty = 4,
        funFact = "Die Theorie inspirierte das digitale Tool 'FlavorDB' und 'Foodpairing.com', die heute von Tausenden Köchen und Bartenders weltweit genutzt werden."
    )

)
