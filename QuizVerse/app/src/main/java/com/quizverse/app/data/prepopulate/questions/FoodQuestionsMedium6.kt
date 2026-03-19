package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMedium6(): List<Question> = listOf(

    // --- correctAnswer = 0 (13 Fragen) ---

    // Tischsitten Indien
    Question(
        categoryId = 8,
        questionText = "Warum darf man beim traditionellen Essen in Indien nur mit der rechten Hand essen?",
        answerA = "Die linke Hand gilt als unrein, da sie traditionell für unhygienische Tätigkeiten genutzt wird",
        answerB = "In der indischen Mythologie ist die rechte Hand der Göttin Lakshmi gewidmet",
        answerC = "Die rechte Hand soll gestärkt werden, da sie die wichtigere Arbeitshand ist",
        answerD = "Es ist eine religiöse Pflicht, die im Hinduismus verankert ist",
        correctAnswer = 0,
        explanation = "In Indien gilt die linke Hand als unrein, da sie traditionell für die Körperhygiene nach dem Toilettengang verwendet wird. Das Anfassen von Speisen mit ihr gilt als unhöflich und respektlos.",
        difficulty = 2,
        funFact = null
    ),

    // Slow Food Philosophie
    Question(
        categoryId = 8,
        questionText = "Welche drei Leitprinzipien beschreibt die Slow Food Bewegung für gute Ernährung?",
        answerA = "Gut, sauber und fair",
        answerB = "Biologisch, regional, saisonal",
        answerC = "Nachhaltig, lokal und traditionell",
        answerD = "Gesund, lecker und erschwinglich",
        correctAnswer = 0,
        explanation = "Die drei Leitprinzipien von Slow Food lauten 'gut, sauber und fair': gut (Qualität und Geschmack), sauber (umweltfreundliche Produktion) und fair (gerechter Preis für Erzeuger und Verbraucher).",
        difficulty = 2,
        funFact = null
    ),

    // Esskultur Äthiopien Injera
    Question(
        categoryId = 8,
        questionText = "Was ist Injera und welche Funktion hat es beim äthiopischen Essen?",
        answerA = "Ein säuerliches Fladenbrot aus Teff, das gleichzeitig Teller und Besteck ersetzt",
        answerB = "Ein äthiopischer Gewürztee, der vor dem Essen getrunken wird",
        answerC = "Eine Fleischsuppe die das Hauptgericht bildet",
        answerD = "Ein fermentiertes Hirsebier das zum Essen gereicht wird",
        correctAnswer = 0,
        explanation = "Injera ist ein großes, schwammig-säuerliches Fladenbrot aus Teff-Getreide, das in Äthiopien als Unterlage dient, auf die alle Gerichte gelegt werden. Man reißt Stücke ab und greift damit das Essen.",
        difficulty = 2,
        funFact = "Teff ist ein uraltes äthiopisches Getreide mit hohem Eisengehalt und ist von Natur aus glutenfrei."
    ),

    // Food-Trend Fermentation Tempeh
    Question(
        categoryId = 8,
        questionText = "Was ist Tempeh und woher stammt es ursprünglich?",
        answerA = "Ein fermentiertes Sojaprodukt aus Indonesien, das durch Schimmelpilze zu einem festen Kuchen verarbeitet wird",
        answerB = "Eine japanische Fleischalternative aus fermentiertem Tofu",
        answerC = "Ein getrocknetes Sojaprodukt aus China ähnlich wie Sojaschnetzel",
        answerD = "Eine koreanische Bohnenpaste ähnlich wie Gochujang",
        correctAnswer = 0,
        explanation = "Tempeh stammt aus Java (Indonesien) und wird aus fermentierten Sojabohnen hergestellt, die durch den Schimmelpilz Rhizopus oligosporus zu einem festen, schneidbaren Kuchen gebunden werden – reich an Proteinen und B-Vitaminen.",
        difficulty = 2,
        funFact = null
    ),

    // Tischsitten Tschingis-Etikette Mongolei
    Question(
        categoryId = 8,
        questionText = "Was ist die wichtigste Höflichkeitsregel beim Besuch in einer mongolischen Jurte (Ger)?",
        answerA = "Angebotenes Essen und Trinken darf man niemals ablehnen – man trinkt zumindest einen Schluck oder isst etwas",
        answerB = "Man darf die Jurte nur durch die Südseite betreten",
        answerC = "Frauen dürfen beim Essen nicht anwesend sein",
        answerD = "Man muss immer mit dem Rücken zur Türe sitzen",
        correctAnswer = 0,
        explanation = "In der mongolischen Gastfreundschaftskultur gilt es als sehr unhöflich, angebotenes Essen oder Trinken komplett abzulehnen – besonders Airag (fermentierte Stutenmilch) sollte zumindest gekostet werden.",
        difficulty = 2,
        funFact = "Airag (auch Kumiss) enthält etwa 2 % Alkohol und gilt als nationales Getränk der Mongolei – ein Zeichen der Gastfreundschaft."
    ),

    // Ceviche Peru
    Question(
        categoryId = 8,
        questionText = "Wie wird Ceviche in der peruanischen Tradition 'gegart'?",
        answerA = "Durch die denaturierende Wirkung von Limettensaft, ohne Hitze",
        answerB = "Durch kurzes Dämpfen bei niedrigen Temperaturen",
        answerC = "Durch Einlegen in Salzlake für mindestens 12 Stunden",
        answerD = "Durch kurzes Blanchieren in heißem Wasser mit Chili",
        correctAnswer = 0,
        explanation = "Ceviche wird nicht erhitzt – der frische Fisch wird durch die Säure des Limettensafts 'kaltgegart': Die Zitrusäure denaturiert die Proteine ähnlich wie Hitze und verändert Textur und Optik des Fischs.",
        difficulty = 2,
        funFact = "Die Flüssigkeit die beim Marinieren entsteht, nennt man 'Leche de Tigre' (Tigermilch) und wird in Peru als Muntermacher nach Partynächten getrunken."
    ),

    // Vertical Farming
    Question(
        categoryId = 8,
        questionText = "Was ist 'Vertical Farming' und welche Vorteile bietet es?",
        answerA = "Das mehrgeschossige Anbausystem in kontrollierten Innenräumen mit LED-Beleuchtung, ganzjährig ohne Pestizide und mit minimalem Wasserverbrauch",
        answerB = "Das Anlegen von Gemüsegärten auf Hausdächern in Städten",
        answerC = "Eine Bergbauernmethode für steiles Gelände",
        answerD = "Das Prinzip, Gemüse an senkrechten Wänden auf Hängevorrichtungen zu züchten",
        correctAnswer = 0,
        explanation = "Vertical Farming bezeichnet mehrgeschossige Innenfarmen mit kontrollierten Wachstumsbedingungen – der Wasserverbrauch ist bis zu 95 % geringer als in der konventionellen Landwirtschaft und Pestizide werden nicht benötigt.",
        difficulty = 2,
        funFact = null
    ),

    // Food-Trend Nose-to-Tail
    Question(
        categoryId = 8,
        questionText = "Was bedeutet der Food-Trend 'Nose-to-Tail' in der modernen Küche?",
        answerA = "Das vollständige Verwenden aller Teile eines Tieres – vom Kopf bis zum Schwanz",
        answerB = "Das Verwenden von Gemüse von der Wurzel bis zum Blatt ohne Abfall",
        answerC = "Eine Kochmethode die mit sehr kleinen Portionen arbeitet",
        answerD = "Ein Ernährungskonzept das nur Fisch aus nachhaltigem Fang verwendet",
        correctAnswer = 0,
        explanation = "Nose-to-Tail (von der Nase bis zum Schwanz) bezeichnet das vollständige Verwerten aller Teile eines geschlachteten Tieres – Innereien, Knochen, Haut und Extremitäten eingeschlossen – um Lebensmittelverschwendung zu minimieren.",
        difficulty = 2,
        funFact = "Der britische Koch Fergus Henderson vom Restaurant St. JOHN in London gilt als Pionier der Nose-to-Tail Philosophie der Neuzeit."
    ),

    // Food-Waste
    Question(
        categoryId = 8,
        questionText = "Wie viel Prozent aller Lebensmittel weltweit werden laut UN-Schätzungen weggeworfen oder gehen verloren?",
        answerA = "Ca. 33 Prozent",
        answerB = "Ca. 10 Prozent",
        answerC = "Ca. 20 Prozent",
        answerD = "Ca. 50 Prozent",
        correctAnswer = 0,
        explanation = "Laut der UN-FAO werden weltweit etwa ein Drittel (33 %) aller produzierten Lebensmittel weggeworfen oder gehen in der Lieferkette verloren – das entspricht etwa 1,3 Milliarden Tonnen pro Jahr.",
        difficulty = 2,
        funFact = null
    ),

    // Tischsitten Äthiopien Gursha
    Question(
        categoryId = 8,
        questionText = "Was ist die wichtigste Regel beim gemeinsamen Essen in der äthiopischen Esskultur?",
        answerA = "Alle essen gemeinsam von einer großen Platte und es ist üblich, dem Nachbarn Bissen (Gursha) zu reichen",
        answerB = "Jeder Gast bekommt sein eigenes kleines Tablett",
        answerC = "Der Älteste am Tisch beginnt immer als erster zu essen",
        answerD = "Männer und Frauen essen immer getrennt voneinander",
        correctAnswer = 0,
        explanation = "In Äthiopien isst man traditionell gemeinsam von einer großen Platte mit Injera. Es gilt als Zeichen der Zuneigung, dem Nachbarn einen Bissen (Gursha) direkt in den Mund zu reichen.",
        difficulty = 2,
        funFact = "Das gegenseitige Reichen von Bissen heißt 'Gursha' und ist ein Ausdruck von Freundschaft und Liebe in der äthiopischen Kultur."
    ),

    // Esskultur Frankreich Baguette UNESCO
    Question(
        categoryId = 8,
        questionText = "Wann wurde das handwerkliche Können der Baguette-Herstellung zum UNESCO-Weltkulturerbe ernannt?",
        answerA = "2022",
        answerB = "2019",
        answerC = "2015",
        answerD = "2017",
        correctAnswer = 0,
        explanation = "Das handwerkliche Können der Baguette-Herstellung ('Le savoir-faire artisanal et la culture de la baguette') wurde im November 2022 von der UNESCO zum immateriellen Kulturerbe der Menschheit erklärt.",
        difficulty = 2,
        funFact = null
    ),

    // Koscher
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Koscher' und welche zentrale Regel bestimmt das jüdische Kochen?",
        answerA = "Fleisch und Milchprodukte dürfen niemals zusammen zubereitet oder gegessen werden",
        answerB = "Alle Speisen müssen von einem Rabbiner gesegnet werden",
        answerC = "Alle Zutaten müssen aus Israel stammen",
        answerD = "Alle Mahlzeiten müssen aus frischen, unverarbeiteten Zutaten bestehen",
        correctAnswer = 0,
        explanation = "Das Koschere Gebot (Kashrut) umfasst viele Regeln, die bekannteste ist die strikte Trennung von Fleisch (Fleischig) und Milchprodukten (Milchig) – in frommen Haushalten gibt es sogar getrennte Töpfe und Besteck.",
        difficulty = 2,
        funFact = "Nach traditioneller Auslegung muss man zwischen Fleisch- und Milchspeisen mehrere Stunden warten – von 1 bis 6 Stunden je nach Tradition."
    ),

    // Pflanzenmilch
    Question(
        categoryId = 8,
        questionText = "Welche pflanzliche Milchalternative hat den geringsten Wasserverbrauch in der Produktion?",
        answerA = "Hafermilch",
        answerB = "Mandelmilch",
        answerC = "Reismilch",
        answerD = "Sojamilch",
        correctAnswer = 0,
        explanation = "Hafermilch hat von allen gängigen pflanzlichen Milchalternativen den geringsten Wasserverbrauch – Hafer benötigt viel weniger Wasser als Mandeln und ist zudem in Europa regional anbaubar.",
        difficulty = 2,
        funFact = "Für 1 Liter Mandelmilch werden ca. 371 Liter Wasser benötigt, für Hafermilch nur etwa 48 Liter."
    ),

    // --- correctAnswer = 1 (13 Fragen) ---

    // Tischsitten Japan
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es in Japan, die Stäbchen senkrecht in den Reis zu stecken?",
        answerA = "Es ist ein Zeichen, dass man fertig gegessen hat",
        answerB = "Es erinnert an Räucherstäbchen bei Bestattungsritualen und gilt als äußerst unhöflich",
        answerC = "Es ist eine Einladung an andere, mitzuessen",
        answerD = "Es zeigt an, dass man noch mehr Reis möchte",
        correctAnswer = 1,
        explanation = "Stäbchen senkrecht in den Reis zu stecken erinnert in Japan an Räucherstäbchen bei Beerdigungen und gilt am Tisch als schweres Fauxpas – diese Geste ist ausschließlich bei Totenopfern üblich.",
        difficulty = 2,
        funFact = "Auch das Übergeben von Speisen von Stäbchen zu Stäbchen ist tabu, da dies bei japanischen Bestattungsritualen mit den Knochen des Verstorbenen gemacht wird."
    ),

    // Slow Food Gründung
    Question(
        categoryId = 8,
        questionText = "Wann und wo wurde die Slow Food Bewegung gegründet?",
        answerA = "1995 in Berlin, Deutschland",
        answerB = "1989 in Bra, Italien",
        answerC = "1989 in Paris, Frankreich",
        answerD = "1982 in Rom, Italien",
        correctAnswer = 1,
        explanation = "Slow Food wurde 1989 in Bra, Piemont, Italien, vom Journalisten Carlo Petrini gegründet – als Antwort auf die Eröffnung eines McDonald's an der Spanischen Treppe in Rom.",
        difficulty = 2,
        funFact = "Das Symbol von Slow Food ist eine Schnecke, die Langsamkeit, Bedächtigkeit und Genuss symbolisiert."
    ),

    // Kombucha
    Question(
        categoryId = 8,
        questionText = "Was ist Kombucha und warum gilt er als Trendgetränk?",
        answerA = "Ein japanischer Matcha-Tee mit Kokosmilch",
        answerB = "Ein fermentiertes Teegetränk, das durch Bakterien und Hefen entsteht und probiotische Eigenschaften hat",
        answerC = "Ein alkoholfreier Ingwer-Kräutertee aus Indien",
        answerD = "Ein chinesischer Kräuterextrakt mit adaptogenen Pilzen",
        correctAnswer = 1,
        explanation = "Kombucha ist ein fermentiertes Getränk aus gesüßtem Tee, der durch eine symbiotische Kultur aus Bakterien und Hefen (SCOBY) fermentiert wird – er enthält Probiotika, B-Vitamine und organische Säuren.",
        difficulty = 2,
        funFact = "Kombucha wird seit über 2.000 Jahren in China getrunken und wurde ursprünglich als 'Tee der Unsterblichkeit' bezeichnet."
    ),

    // Insekten als Nahrung
    Question(
        categoryId = 8,
        questionText = "Seit wann sind Mehlwürmer in der EU offiziell als Lebensmittel zugelassen?",
        answerA = "Seit Januar 2019",
        answerB = "Seit Mai 2021",
        answerC = "Seit März 2023",
        answerD = "Seit Juni 2020",
        correctAnswer = 1,
        explanation = "Die EU-Kommission hat Mehlwürmer (Tenebrio molitor) im Mai 2021 als erstes Insekt offiziell als neuartiges Lebensmittel (Novel Food) zugelassen – seitdem dürfen sie als Zutat in Lebensmitteln verwendet werden.",
        difficulty = 2,
        funFact = "Insekten enthalten bis zu 80 % Protein und benötigen für 1 kg Biomasse nur 300 Liter Wasser – Rinderhaltung benötigt hingegen 15.500 Liter pro Kilogramm."
    ),

    // China Tee
    Question(
        categoryId = 8,
        questionText = "Was ist in der chinesischen Tischkultur beim Einschenken von Tee üblich?",
        answerA = "Man hält die Tasse immer mit beiden Händen",
        answerB = "Man tippt mit zwei Fingern auf den Tisch als Dankeszeichen, wenn jemand einschenkt",
        answerC = "Man schenkt sich selbst zuerst ein, dann den Gästen",
        answerD = "Der Gastgeber schenkt sich nie selbst ein",
        correctAnswer = 1,
        explanation = "In der chinesischen Teekultur ist es üblich, mit zwei Fingern leicht auf den Tisch zu klopfen, wenn jemand Tee einschenkt – das ist ein stilles Dankeschön, das auf eine historische Ehrerbietungsgeste zurückgeht.",
        difficulty = 2,
        funFact = "Die Geste stammt aus der Zeit, als Kaiser Qianlong inkognito reiste und seine Diener, um ihn nicht zu verraten, mit gekrümmten Fingern den Kotau andeuteten."
    ),

    // Flexitarismus
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Flexitarier'?",
        answerA = "Personen, die sich ausschließlich von roher Pflanzenkost ernähren",
        answerB = "Personen, die überwiegend vegetarisch essen, aber gelegentlich Fleisch oder Fisch konsumieren",
        answerC = "Personen, die je nach Jahreszeit ihre Ernährungsweise anpassen",
        answerD = "Personen die nur Bio-zertifizierte tierische Produkte konsumieren",
        correctAnswer = 1,
        explanation = "Flexitarier sind 'flexible Vegetarier' – sie ernähren sich hauptsächlich vegetarisch, essen aber bewusst und selten Fleisch oder Fisch. Diese Ernährungsform hat in den letzten Jahren stark zugenommen.",
        difficulty = 2,
        funFact = null
    ),

    // Kimchi
    Question(
        categoryId = 8,
        questionText = "Was ist Kimchi und aus welchem Land stammt es?",
        answerA = "Eine eingelegte Kohlzubereitung aus Japan",
        answerB = "Ein fermentiertes Gemüsegericht aus Korea, hauptsächlich aus Chinakohl mit Chili",
        answerC = "Eine pikante Gurkenpaste aus China",
        answerD = "Ein fermentierter Rettich aus Vietnam",
        correctAnswer = 1,
        explanation = "Kimchi ist ein traditionelles koreanisches Fermentationsgericht aus Chinakohl, Rettich, Frühlingszwiebeln, Knoblauch, Ingwer und Gochugaru (Chilipulver) – es ist das Nationalgericht Koreas.",
        difficulty = 2,
        funFact = null
    ),

    // Esskultur UNESCO Frankreich
    Question(
        categoryId = 8,
        questionText = "Wann wurde die gastronomische Mahlzeit der Franzosen in die UNESCO-Liste des immateriellen Kulturerbes aufgenommen?",
        answerA = "2003",
        answerB = "2010",
        answerC = "2015",
        answerD = "2007",
        correctAnswer = 1,
        explanation = "Die 'gastronomische Mahlzeit der Franzosen' wurde 2010 in die UNESCO-Liste des immateriellen Kulturerbes der Menschheit aufgenommen – als erstes nationales Esskultur-Ritual überhaupt.",
        difficulty = 2,
        funFact = null
    ),

    // Aperitivo Italien
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Aperitivo' in der italienischen Esskultur?",
        answerA = "Ein leichter Nachtisch nach einem mehrgängigen Menü",
        answerB = "Ein geselliges Ritual vor dem Abendessen mit Getränken und kleinen Snacks",
        answerC = "Ein Mittagsschlaf nach dem Essen, ähnlich wie die Siesta",
        answerD = "Ein traditionelles Frühstück aus Gebäck und Kaffee",
        correctAnswer = 1,
        explanation = "Das Aperitivo ist ein wichtiges gesellschaftliches Ritual in Italien: Vor dem Abendessen trifft man sich zu einem Aperitif (oft Aperol Spritz, Campari oder Prosecco) mit kleinen Snacks wie Oliven, Chips und Bruschetta.",
        difficulty = 2,
        funFact = null
    ),

    // Moringa Superfood
    Question(
        categoryId = 8,
        questionText = "Was ist Moringa und warum wird es als Superfood bezeichnet?",
        answerA = "Eine japanische Algenart mit hohem Jodgehalt",
        answerB = "Ein tropischer Baum, dessen Blätter besonders reich an Vitaminen, Mineralien und Antioxidantien sind",
        answerC = "Eine südamerikanische Knollenart ähnlich wie Maca",
        answerD = "Eine afrikanische Hülsenfrucht mit sehr hohem Proteingehalt",
        correctAnswer = 1,
        explanation = "Moringa oleifera ist ein Baum aus Südostasien und Afrika, dessen Blätter außergewöhnlich reich an Vitamin C, Kalzium, Eisen, Kalium und Antioxidantien sind – sie werden getrocknet als Pulver oder in Tees verwendet.",
        difficulty = 2,
        funFact = null
    ),

    // Probiotika vs Prebiotika
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Probiotika und Prebiotika?",
        answerA = "Probiotika sind Vitamine für den Darm, Prebiotika sind Mineralien",
        answerB = "Probiotika sind lebende Mikroorganismen die den Darm besiedeln, Prebiotika sind unverdauliche Ballaststoffe die diese Bakterien ernähren",
        answerC = "Prebiotika werden vor dem Essen eingenommen, Probiotika danach",
        answerD = "Beide Begriffe bezeichnen dasselbe – probiotische Nahrungsergänzungsmittel",
        correctAnswer = 1,
        explanation = "Probiotika sind lebende Bakterien und Hefen (z.B. in Joghurt, Kefir, Kimchi), die die Darmflora positiv beeinflussen. Prebiotika sind unverdauliche Ballaststoffe (z.B. in Zwiebeln, Lauch), die als Nahrung für die Darmbakterien dienen.",
        difficulty = 2,
        funFact = null
    ),

    // Brunch
    Question(
        categoryId = 8,
        questionText = "Was ist 'Brunch' und aus welcher kulturellen Tradition stammt er?",
        answerA = "Ein deutsches Konzept aus den 1950ern als Ersatz für das große Mittagessen",
        answerB = "Eine englisch-amerikanische Mahlzeit zwischen Frühstück und Mittagessen, die in den 1890er Jahren populär wurde",
        answerC = "Eine französische Tradition aus den Kaffeehäusern des 19. Jahrhunderts",
        answerD = "Ein australisches Konzept das nach dem Zweiten Weltkrieg nach Europa kam",
        correctAnswer = 1,
        explanation = "Brunch (Kombination aus Breakfast und Lunch) wurde erstmals 1895 vom britischen Schriftsteller Guy Beringer erwähnt und in der amerikanischen Upper-Class-Kultur der Jahrhundertwende populär – als gemütliche Sonntagsmahlzeit.",
        difficulty = 2,
        funFact = "Beringer argumentierte, dass Brunch eine 'humanere Form des Sonntags' sei, da man nicht früh aufstehen müsse."
    ),

    // Craft Beer
    Question(
        categoryId = 8,
        questionText = "Was definiert ein 'Craft Beer' im Unterschied zu industriellem Bier?",
        answerA = "Craft Beer enthält immer mehr Alkohol als industrielles Bier",
        answerB = "Craft Beer wird von kleinen, unabhängigen Brauereien mit Fokus auf Qualität und kreative Rezepturen hergestellt",
        answerC = "Craft Beer ist immer unfiltriert und naturtrüb",
        answerD = "Craft Beer darf nicht pasteurisiert werden",
        correctAnswer = 1,
        explanation = "Craft Beer definiert sich durch drei Faktoren: kleine Produktionsmengen, Unabhängigkeit von großen Konzernen und einen Fokus auf handwerkliche Qualität mit kreativen Rezepturen – oft mit ungewöhnlichen Zutaten und Aromen.",
        difficulty = 2,
        funFact = null
    ),

    // --- correctAnswer = 2 (12 Fragen) ---

    // Tischsitten Japan Schlürfen
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es in Japan, laut zu schlürfen und Geräusche beim Nudelessen zu machen?",
        answerA = "Es gilt als sehr unhöflich und störend für andere Gäste",
        answerB = "Es ist nur in bestimmten Regionen Japans akzeptabel",
        answerC = "Es ist ein Kompliment an den Koch und zeigt dass es schmeckt",
        answerD = "Es wird toleriert, ist aber kein Ausdruck von Freude",
        correctAnswer = 2,
        explanation = "In Japan gilt lautes Schlürfen und Schmatzen beim Nudelessen als Zeichen, dass man die Speise genießt und dem Koch ein Kompliment macht. Das Schlürfen soll zudem die Aromen besser entfalten.",
        difficulty = 2,
        funFact = "Dieser kulturelle Unterschied überrascht viele westliche Touristen in Japan, die das Schmatzen als unhöflich empfinden."
    ),

    // Tischsitten Spanien Tapas
    Question(
        categoryId = 8,
        questionText = "Was ist in einer traditionellen spanischen Tapas-Bar eine übliche Praxis bezüglich Essensresten?",
        answerA = "Rückstände werden in einer kleinen Schüssel gesammelt und wieder verwendet",
        answerB = "Teller werden vom Gast selbst in die Küche gebracht",
        answerC = "Reste wie Papierservietten und Zahnstocherhüllen werden auf dem Boden unter der Bar entsorgt",
        answerD = "Reste werden dem Wirt als Trinkgeld mitgegeben",
        correctAnswer = 2,
        explanation = "In vielen traditionellen Tapas-Bars in Spanien ist es üblich, Servietten, Zahnstocher und andere kleine Reste auf den Boden zu werfen. Ein voller Boden gilt als Zeichen für ein beliebtes, gut besuchtes Lokal.",
        difficulty = 2,
        funFact = "Diese Praxis findet sich besonders in andalusischen Tavernen und ist kulturell akzeptiert – je mehr Reste, desto beliebter das Lokal."
    ),

    // Tischsitten Frankreich
    Question(
        categoryId = 8,
        questionText = "Welche Geste gilt in Frankreich beim Essen als besonders unhöflich?",
        answerA = "Brot mit einem Messer schneiden statt es mit den Händen zu brechen",
        answerB = "Wein vor dem Gastgeber einschenken",
        answerC = "Suppe laut pusten um sie abzukühlen",
        answerD = "Den Teller nach dem Essen sauber wischen",
        correctAnswer = 2,
        explanation = "In Frankreich gilt es als sehr unhöflich, die heiße Suppe laut zu pusten. Man lässt Suppe von selbst abkühlen oder rührt sie behutsam um – lautes Pusten gilt als unfein und unmanierlich.",
        difficulty = 2,
        funFact = "Baguette hingegen darf und soll man mit den Händen brechen – es ist in Frankreich verpönt, Brot mit dem Messer zu schneiden."
    ),

    // Vegane Trends Deutschland
    Question(
        categoryId = 8,
        questionText = "Wie viel Prozent der Deutschen bezeichnen sich laut BMEL-Ernährungsreport 2024 als vegan?",
        answerA = "5 Prozent",
        answerB = "8 Prozent",
        answerC = "2 Prozent",
        answerD = "12 Prozent",
        correctAnswer = 2,
        explanation = "Laut dem BMEL-Ernährungsreport 2024 ernähren sich 2 Prozent der Bevölkerung in Deutschland rein vegan, während 8 Prozent vegetarisch leben.",
        difficulty = 2,
        funFact = "Gleichzeitig ist der Anteil der Menschen, die häufiger pflanzliche Alternativen kaufen, in vier Jahren um 10 Prozent gestiegen."
    ),

    // Korea Tischsitte
    Question(
        categoryId = 8,
        questionText = "Was ist in der koreanischen Tischkultur bezüglich des Essenbeginns wichtig?",
        answerA = "Alle beginnen exakt gleichzeitig auf ein gemeinsames Signal",
        answerB = "Jüngere Personen beginnen als erste zu essen, um die Älteren zu ehren",
        answerC = "Man wartet, bis die älteste Person am Tisch zuerst isst oder trinkt",
        answerD = "Der Gastgeber isst immer zuerst als Zeichen der Sicherheit",
        correctAnswer = 2,
        explanation = "In der koreanischen Tischkultur (konfuzianische Tradition) zeigt man den älteren Personen Respekt: Man wartet, bis die älteste anwesende Person mit dem Essen oder Trinken beginnt.",
        difficulty = 2,
        funFact = null
    ),

    // Food Miles
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Food Miles' (Lebensmittelmeilen) im Kontext nachhaltiger Ernährung?",
        answerA = "Die Kaloriendichte eines Lebensmittels pro 100 Gramm",
        answerB = "Ein Bewertungssystem für Bio-Lebensmittel",
        answerC = "Die Distanz, die Lebensmittel vom Erzeuger bis zum Verbraucher zurücklegen",
        answerD = "Die Haltbarkeitsdauer eines Produkts in Meilen berechnet",
        correctAnswer = 2,
        explanation = "Food Miles bezeichnet die Transportdistanz von Lebensmitteln vom Produktionsort bis zum Verbraucher – je mehr Food Miles, desto größer der CO₂-Fußabdruck. Das Konzept fördert den Kauf regionaler Produkte.",
        difficulty = 2,
        funFact = "Eine Studie zeigte, dass Lebensmittel in den USA im Durchschnitt 2.400 Kilometer zurücklegen, bevor sie gekauft werden."
    ),

    // Wasserkefir
    Question(
        categoryId = 8,
        questionText = "Was ist Wasserkefir und wie unterscheidet er sich von Milchkefir?",
        answerA = "Wasserkefir ist verdünnter Milchkefir mit Mineralwasser",
        answerB = "Wasserkefir enthält mehr Alkohol als Milchkefir",
        answerC = "Wasserkefir ist ein fermentiertes Getränk auf Zuckerwasserbasis und ist komplett milchfrei und vegan",
        answerD = "Wasserkefir wird mit anderen Bakterienkulturen als Milchkefir hergestellt",
        correctAnswer = 2,
        explanation = "Wasserkefir (auch Tibicos) entsteht durch Fermentation von Zuckerwasser, Fruchtsaft oder Kokoswasser mit speziellen Wasserkefir-Kristallen – er ist komplett milchfrei, vegan und enthält Probiotika sowie wenig Alkohol.",
        difficulty = 2,
        funFact = "Wasserkefir-Kristalle bestehen aus einer Matrix aus Polysacchariden, in denen Bakterien und Hefen in Symbiose leben."
    ),

    // Mexikanische Tortilla
    Question(
        categoryId = 8,
        questionText = "Welchen Unterschied gibt es zwischen einer 'Corn Tortilla' und einer 'Flour Tortilla'?",
        answerA = "Corn Tortillas sind immer dicker und eignen sich für Burritos",
        answerB = "Es handelt sich um regionale Bezeichnungen für dasselbe Produkt",
        answerC = "Corn Tortillas werden aus Nixtamal-Maismehl hergestellt, Flour Tortillas aus Weizenmehl und sind typisch für Nordmexiko",
        answerD = "Flour Tortillas enthalten immer Schmalz, Corn Tortillas nie Fett",
        correctAnswer = 2,
        explanation = "Corn Tortillas aus nixtamalisiertem Maismehl (Masa harina) sind die ältere, traditionellere Form. Flour Tortillas aus Weizenmehl wurden nach der spanischen Conquista entwickelt und sind in Nordmexiko populär.",
        difficulty = 2,
        funFact = "In Mexiko gilt: Echte Tacos werden nur mit Corn Tortillas gemacht – alles andere ist ein Wrap."
    ),

    // Omotenashi Japan
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Omotenashi' im Kontext der japanischen Gastgeberkultur?",
        answerA = "Die Kunst, Speisen durch aufwändige Schneidetechniken zu präsentieren",
        answerB = "Das Prinzip der minimalen Verschwendung beim Kochen",
        answerC = "Eine bedingungslose, selbstlose Gastfreundschaft ohne Erwartung von Gegenleistung",
        answerD = "Die Tradition, Gäste mit einem bestimmten Tee zu begrüßen",
        correctAnswer = 2,
        explanation = "Omotenashi ist das japanische Konzept der vollkommenen, herzlichen Gastfreundschaft – der Gastgeber antizipiert die Bedürfnisse des Gastes ohne dass dieser etwas verlangen muss, ohne eine Gegenleistung zu erwarten.",
        difficulty = 2,
        funFact = "Omotenashi war eines der zentralen Konzepte in der Präsentation Japans für die Olympischen Spiele 2020 in Tokio."
    ),

    // Plant-based
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Begriff 'Plant-based' in der modernen Ernährungskultur?",
        answerA = "Ausschließlich rohes, unverarbeitetes Gemüse und Obst",
        answerB = "Biologisch angebaute Produkte ohne Pestizide",
        answerC = "Lebensmittel und Produkte, die überwiegend oder ausschließlich aus pflanzlichen Zutaten bestehen",
        answerD = "Produkte die keine tierischen Fette enthalten",
        correctAnswer = 2,
        explanation = "Plant-based bezeichnet Lebensmittel, Produkte oder Ernährungsweisen, die überwiegend aus pflanzlichen Zutaten bestehen – dazu gehören vegane Fleisch- und Milchalternativen sowie pflanzliche Proteinquellen.",
        difficulty = 2,
        funFact = null
    ),

    // Dim Sum
    Question(
        categoryId = 8,
        questionText = "Was ist 'Yum Cha' und was hat es mit Dim Sum zu tun?",
        answerA = "Yum Cha ist ein chinesisches Abendessen, Dim Sum ist das Mittagessen",
        answerB = "Yum Cha ist eine Tee-Zeremonie, Dim Sum sind die dabei servierten Süßspeisen",
        answerC = "Yum Cha (wörtlich 'Tee trinken') ist das Ritual des gemeinsamen Tee-Trinkens mit kleinen Häppchen (Dim Sum) am Morgen und Mittag",
        answerD = "Yum Cha und Dim Sum sind zwei Bezeichnungen für dasselbe Gericht",
        correctAnswer = 2,
        explanation = "Yum Cha bedeutet auf Kantonesisch 'Tee trinken' und bezeichnet die Tradition, zum Frühstück oder Mittagsbrunch Tee zu trinken und viele kleine Gerichte (Dim Sum) zu genießen – gedämpfte Teigtaschen, Knödel und Reisnudelrollen.",
        difficulty = 2,
        funFact = null
    ),

    // Regenerative Landwirtschaft
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Konzept 'Regenerative Landwirtschaft' im Kontext moderner Food-Trends?",
        answerA = "Nur Bio-Anbau ohne Pestizide",
        answerB = "Der Einsatz von Technologie und Robotik im Ackerbau",
        answerC = "Anbaumethoden, die Böden aktiv regenerieren, Kohlenstoff binden und Biodiversität fördern",
        answerD = "Hydroponie und Indoor-Farming ohne Erde",
        correctAnswer = 2,
        explanation = "Regenerative Landwirtschaft geht über Bio-Anbau hinaus und zielt darauf ab, Böden aktiv zu heilen: durch Fruchtfolge, Zwischenfrüchte, minimale Bodenbearbeitung und Kompostierung wird Kohlenstoff gebunden und Biodiversität gefördert.",
        difficulty = 2,
        funFact = null
    ),

    // --- correctAnswer = 3 (12 Fragen) ---

    // Tischsitten Russland
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es in Russland, wenn man den Teller vollständig leer isst?",
        answerA = "Es ist das größte Kompliment an die Gastgeberin",
        answerB = "Es gilt als Signal, dass man noch mehr essen möchte",
        answerC = "Es zeigt Respekt vor dem Essen",
        answerD = "Man sollte einen kleinen Rest lassen, um zu signalisieren, dass man satt ist",
        correctAnswer = 3,
        explanation = "In Russland ist es Tradition, einen kleinen 'Anstandshappen' auf dem Teller zu lassen – das signalisiert dem Gastgeber, dass man wirklich satt ist. Einen leeren Teller kann bedeuten, dass man noch mehr möchte.",
        difficulty = 2,
        funFact = null
    ),

    // Arabischer Kaffee
    Question(
        categoryId = 8,
        questionText = "Wie signalisiert man in arabischen Ländern beim Kaffeetrinken höflich, dass man genug hat?",
        answerA = "Man stellt das leere Glas auf den Tisch",
        answerB = "Man deckt das Glas mit der Hand ab",
        answerC = "Man sagt 'Shukran' und legt das Glas um",
        answerD = "Man schüttelt das Kaffeeglas leicht hin und her",
        correctAnswer = 3,
        explanation = "In arabischen Ländern signalisiert man, dass man keinen Kaffee mehr möchte, indem man das kleine Kaffeeglas (Finjan) leicht hin und her schüttelt – einfach abzustellen bedeutet, dass man noch mehr möchte.",
        difficulty = 2,
        funFact = "Der Gast kann so höflich ablehnen, ohne 'Nein' zu sagen – ein wichtiges Konzept in der arabischen Gastfreundschaftskultur."
    ),

    // Hygge Dänemark
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Hygge' im dänischen Esskulturkontext?",
        answerA = "Ein dänisches Wort für das Buffet-Konzept Smörgåsbord",
        answerB = "Eine nordische Diät basierend auf natürlichen, unverarbeiteten Zutaten",
        answerC = "Das Ritual des winterlichen Glühwein-Trinkens in Skandinavien",
        answerD = "Das dänische Konzept von Gemütlichkeit und Zusammensein, das besonders beim gemeinsamen Essen gelebt wird",
        correctAnswer = 3,
        explanation = "Hygge ist ein dänisches Kulturkonzept für Gemütlichkeit, Wärme und Zusammengehörigkeitsgefühl – es wird besonders beim gemeinsamen Essen am Tisch gelebt, mit Kerzen, gutem Essen und Zeit füreinander.",
        difficulty = 2,
        funFact = "Hygge hat kein direktes Äquivalent in anderen Sprachen und wurde 2016 in den Oxford English Dictionary aufgenommen."
    ),

    // Umami Entdeckung
    Question(
        categoryId = 8,
        questionText = "Was ist der fünfte Grundgeschmack 'Umami' und wer hat ihn entdeckt?",
        answerA = "Umami ist identisch mit Schärfe und wurde von einem mexikanischen Koch entdeckt",
        answerB = "Umami ist ein fettiger Geschmack und wurde erst 2005 offiziell anerkannt",
        answerC = "Umami ist der Geschmack von Hefe und wurde von deutschen Biochemikern entdeckt",
        answerD = "Umami bedeutet 'köstlicher Geschmack' und wurde 1908 vom japanischen Chemiker Kikunae Ikeda identifiziert",
        correctAnswer = 3,
        explanation = "Umami (japanisch: 'köstlicher Geschmack') wurde 1908 vom japanischen Chemiker Kikunae Ikeda entdeckt, der feststellte, dass Kombu-Algen einen besonderen Geschmack erzeugen – ausgelöst durch Glutaminsäure.",
        difficulty = 2,
        funFact = null
    ),

    // Algen Nahrungsquelle
    Question(
        categoryId = 8,
        questionText = "Warum gelten Algen als vielversprechende Nahrungsquelle der Zukunft?",
        answerA = "Algen haben einen sehr milden Geschmack und eignen sich als Brotaufstrich",
        answerB = "Algen können in der Wüste angebaut werden und sind hitzeresistent",
        answerC = "Algen ersetzen vollständig tierische Proteinquellen ohne Geschmackseinbußen",
        answerD = "Algen sind einfach zu kultivieren, brauchen kein Süßwasser und sind reich an Proteinen und Omega-3-Fettsäuren",
        correctAnswer = 3,
        explanation = "Algen (Makro- und Mikroalgen) wachsen schnell, brauchen kein Trinkwasser, produzieren Sauerstoff und sind reich an Proteinen, Omega-3-Fettsäuren, Vitaminen, Mineralien und Antioxidantien – ein nachhaltiges Superfood.",
        difficulty = 2,
        funFact = null
    ),

    // Fika Schweden
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fika' in der schwedischen Kultur?",
        answerA = "Ein traditionelles schwedisches Mittagsgericht ähnlich wie ein Buffet",
        answerB = "Ein schwedisches Wort für ein Sonntagsessen mit der Familie",
        answerC = "Eine Art Cocktailstunde vor dem Abendessen",
        answerD = "Eine wichtige soziale Pause für Kaffee und Gebäck, die in Schweden als kulturelle Institution gilt",
        correctAnswer = 3,
        explanation = "Fika ist in Schweden viel mehr als eine Kaffeepause – es ist ein soziales Ritual, bei dem man sich Zeit nimmt, um bei Kaffee und Gebäck (oft Zimtschnecken) miteinander zu reden und Gemeinschaft zu pflegen.",
        difficulty = 2,
        funFact = "Das Wort 'Fika' entstand durch Umdrehung der Silben des Wortes 'Kaffe'. Schweden gehört zu den weltgrößten Pro-Kopf-Kaffeekonsumenten."
    ),

    // Churrascaria Brasilien
    Question(
        categoryId = 8,
        questionText = "Was ist beim Essen in einem brasilianischen Churrascaria (Rodízio-Grillrestaurant) die übliche Praxis?",
        answerA = "Man bestellt einzelne Portionen von der Karte",
        answerB = "Gäste grillen ihr Fleisch selbst am Tischgrill",
        answerC = "Es gibt ein einziges Tagesgericht für alle",
        answerD = "Kellner bringen durchgehend verschiedene Fleischsorten, und eine zweiseitige Signal-Karte zeigt ob man mehr möchte",
        correctAnswer = 3,
        explanation = "In einem brasilianischen Churrascaria (Rodízio-Stil) bringen Passadores durchgehend verschiedene Fleischsorten auf Spießen. Eine grüne Karte bedeutet 'bitte mehr bringen', eine rote bedeutet 'Pause'.",
        difficulty = 2,
        funFact = "Das Wort 'Rodízio' bedeutet auf Portugiesisch 'Rotation' und beschreibt das Prinzip, dass die Kellner im Kreislauf durch alle Tische laufen."
    ),

    // Darm-Gehirn-Achse
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Darm-Gehirn-Achse' im Kontext moderner Ernährungstrends?",
        answerA = "Die Theorie, dass Essen direkt die Intelligenz steigern kann",
        answerB = "Ein Diätkonzept das Darmreinigung durch Fasten fördert",
        answerC = "Die wissenschaftliche Erklärung warum scharfes Essen Kopfschmerzen verursacht",
        answerD = "Die bidirektionale Kommunikation zwischen Darm und Gehirn über Nervensystem und Hormonachsen",
        correctAnswer = 3,
        explanation = "Die Darm-Gehirn-Achse beschreibt die komplexe bidirektionale Kommunikation zwischen dem enterischen Nervensystem des Darms und dem Gehirn über den Vagusnerv, Hormone und das Immunsystem – das Darmmikrobiom beeinflusst Stimmung und mentale Gesundheit.",
        difficulty = 2,
        funFact = null
    ),

    // Wiener Kaffeehauskultur
    Question(
        categoryId = 8,
        questionText = "Was ist das besondere Merkmal der Wiener Kaffeehauskultur, das zum UNESCO-Weltkulturerbe erklärt wurde?",
        answerA = "Die einzigartige Zubereitung des Mokka nach osmanischem Vorbild",
        answerB = "Das breite Angebot an Kaffeespezialitäten mit eigenem Vokabular",
        answerC = "Die Tradition der Zeitungsleseecke und des Billardtisches",
        answerD = "Das Konzept des Kaffeehauses als öffentlicher Wohnzimmer-Ersatz mit unbegrenzter Verweildauer",
        correctAnswer = 3,
        explanation = "Die Wiener Kaffeehauskultur wurde 2011 ins UNESCO-Weltkulturerbe aufgenommen – charakteristisch ist das Konzept des öffentlichen 'Wohnzimmers', wo man stundenlang sitzen, lesen und diskutieren kann, ohne mehr als einen Kaffee zu bestellen.",
        difficulty = 2,
        funFact = "Wiener Kaffeehäuser entstanden nach der zweiten Wiener Türkenbelagerung 1683, als türkische Kriegsvorräte an Kaffeebohnen in der Stadt verblieben."
    ),

    // Buen Provecho
    Question(
        categoryId = 8,
        questionText = "Was ist 'Buen provecho' in der mexikanischen und spanischen Esskultur?",
        answerA = "Ein traditionelles mexikanisches Mittagsgebet",
        answerB = "Eine Dankesformel nach dem Essen an den Koch",
        answerC = "Ein Signal, dass das Essen sehr scharf sein wird",
        answerD = "Eine Grußformel vor dem Essen die 'Guten Appetit' bedeutet und auch Fremden zugerufen wird",
        correctAnswer = 3,
        explanation = "In Mexiko und anderen spanischsprachigen Ländern ist es üblich, beim Vorbeigehen an einem essenden Menschen 'Buen provecho' (Guten Appetit) zu sagen – selbst Fremden gegenüber. Das Ignorieren gilt als unhöflich.",
        difficulty = 2,
        funFact = null
    ),

    // Kaiseki Japan
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kaiseki' in der japanischen Esskultur?",
        answerA = "Ein japanisches Straßenessen aus gegrillten Fleischspießen",
        answerB = "Ein schnelles Mittagessen aus der Bento-Box-Kultur",
        answerC = "Ein einfaches Volksessen aus Reis und Eingelegtem",
        answerD = "Eine hochformale mehrgängige Küche die auf der Teezeremonie-Tradition basiert und saisonale Zutaten hervorhebt",
        correctAnswer = 3,
        explanation = "Kaiseki ist die höchste Form der japanischen Haute Cuisine – ein kunstvolles Mehrgangmenü, das ursprünglich aus der Teezeremonie (Chanoyu) stammt und streng saisonale, regional bezogene Zutaten in minimalistischer Ästhetik präsentiert.",
        difficulty = 2,
        funFact = "Ein traditionelles Kaiseki-Menü kann aus 8–12 Gängen bestehen und jeder Gang ist wie ein Kunstwerk auf dem Teller angerichtet."
    ),

    // Türkei Çay
    Question(
        categoryId = 8,
        questionText = "Was ist 'Çay Kültürü' und welche soziale Bedeutung hat Tee in der türkischen Kultur?",
        answerA = "Çay ist ein Abendessen-Ritual nach dem Gebet",
        answerB = "Çay ist ein Schnapsglas das zum Anstoßen gereicht wird",
        answerC = "Çay ist ein Kaffeeersatz der nur morgens getrunken wird",
        answerD = "Çay-Trinken ist ein zentrales Gastfreundschafts- und Gemeinschaftsritual das jeden Besuch begleitet",
        correctAnswer = 3,
        explanation = "Çay (schwarzer Tee im Tulpenglas) ist das soziale Schmiermittel der türkischen Gesellschaft: kein Besuch ohne Tee, kein Gespräch ohne Tee. Die Türkei gehört zu den Ländern mit dem weltweit höchsten Pro-Kopf-Teekonsum.",
        difficulty = 2,
        funFact = null
    ),

)
