package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun geoQuestions(): List<Question> = listOf(

    // ── EASY (difficulty = 1) ── ~10 questions ──────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Was ist die Hauptstadt von Frankreich?",
        answerA = "Lyon",
        answerB = "Marseille",
        answerC = "Paris",
        answerD = "Bordeaux",
        correctAnswer = 2,
        explanation = "Paris ist seit Jahrhunderten die Hauptstadt Frankreichs und mit über 2 Millionen Einwohnern die größte Stadt des Landes.",
        difficulty = 1,
        funFact = "Der Eiffelturm in Paris wurde ursprünglich als temporäres Bauwerk für die Weltausstellung 1889 errichtet."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Kontinent ist der größte der Erde?",
        answerA = "Afrika",
        answerB = "Nordamerika",
        answerC = "Europa",
        answerD = "Asien",
        correctAnswer = 3,
        explanation = "Asien ist mit einer Fläche von rund 44,6 Millionen km² der größte Kontinent der Erde und beherbergt über 60 % der Weltbevölkerung.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Fluss ist der längste der Welt?",
        answerA = "Amazonas",
        answerB = "Nil",
        answerC = "Jangtse",
        answerD = "Mississippi",
        correctAnswer = 1,
        explanation = "Der Nil in Afrika gilt mit etwa 6.650 km als längster Fluss der Welt, obwohl der Amazonas in manchen Messungen ähnliche Längen erreicht.",
        difficulty = 1,
        funFact = "Der Nil fließt als einer der wenigen großen Flüsse von Süd nach Nord ins Mittelmeer."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land steht die Chinesische Mauer?",
        answerA = "Japan",
        answerB = "Südkorea",
        answerC = "Mongolei",
        answerD = "China",
        correctAnswer = 3,
        explanation = "Die Chinesische Mauer wurde über viele Jahrhunderte in China erbaut, um das Reich vor Invasionen aus dem Norden zu schützen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das flächenmäßig größte Land der Erde?",
        answerA = "Kanada",
        answerB = "USA",
        answerC = "Russland",
        answerD = "China",
        correctAnswer = 2,
        explanation = "Russland ist mit über 17 Millionen km² das größte Land der Erde und erstreckt sich über elf Zeitzonen.",
        difficulty = 1,
        funFact = "Russland ist so groß, dass es größer als der gesamte Pluto ist."
    ),

    Question(
        categoryId = 1,
        questionText = "Was ist die Hauptstadt von Deutschland?",
        answerA = "München",
        answerB = "Hamburg",
        answerC = "Frankfurt",
        answerD = "Berlin",
        correctAnswer = 3,
        explanation = "Berlin ist die Hauptstadt und mit rund 3,7 Millionen Einwohnern die größte Stadt Deutschlands.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Ozean ist der größte der Erde?",
        answerA = "Atlantischer Ozean",
        answerB = "Indischer Ozean",
        answerC = "Pazifischer Ozean",
        answerD = "Arktischer Ozean",
        correctAnswer = 2,
        explanation = "Der Pazifische Ozean bedeckt rund 165 Millionen km² und ist damit größer als alle Landmassen der Erde zusammen.",
        difficulty = 1,
        funFact = "Im Pazifik liegt der tiefste Punkt der Erde: der Marianengraben mit einer Tiefe von fast 11.000 m."
    ),

    Question(
        categoryId = 1,
        questionText = "Auf welchem Kontinent befindet sich Ägypten?",
        answerA = "Asien",
        answerB = "Europa",
        answerC = "Afrika",
        answerD = "Südamerika",
        correctAnswer = 2,
        explanation = "Ägypten liegt im Nordosten Afrikas, obwohl die Sinai-Halbinsel geografisch zu Asien gehört.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wie lautet die Hauptstadt von Japan?",
        answerA = "Osaka",
        answerB = "Kyoto",
        answerC = "Hiroshima",
        answerD = "Tokio",
        correctAnswer = 3,
        explanation = "Tokio ist seit 1869 die Hauptstadt Japans und mit der umliegenden Metropolregion die bevölkerungsreichste Stadtregion der Welt.",
        difficulty = 1,
        funFact = "Tokio heißt auf Japanisch 東京, was \"Östliche Hauptstadt\" bedeutet."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Gebirge ist das höchste der Welt?",
        answerA = "Anden",
        answerB = "Rocky Mountains",
        answerC = "Himalaya",
        answerD = "Alpen",
        correctAnswer = 2,
        explanation = "Der Himalaya in Asien beherbergt die höchsten Berge der Erde, darunter den Mount Everest mit 8.849 m.",
        difficulty = 1,
        funFact = "Der Himalaya wächst jedes Jahr um etwa 5 mm, weil die Indische Platte weiter unter die Eurasische Platte schiebt."
    ),

    // ── MEDIUM (difficulty = 2) ── ~15 questions ────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Welche Wüste ist die größte der Welt?",
        answerA = "Sahara",
        answerB = "Gobi",
        answerC = "Arabische Wüste",
        answerD = "Antarktische Eiswüste",
        correctAnswer = 3,
        explanation = "Die Antarktis gilt als größte Wüste der Erde (ca. 14,2 Mio. km²), da sie extrem wenig Niederschlag erhält. Die Sahara ist die größte Heiß­wüste.",
        difficulty = 2,
        funFact = "In der Antarktis liegt fast 70 % des weltweiten Süßwassers als Eis gespeichert."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die meisten Einwohner?",
        answerA = "USA",
        answerB = "Indien",
        answerC = "China",
        answerD = "Indonesien",
        correctAnswer = 1,
        explanation = "Indien hat China im Jahr 2023 als bevölkerungsreichstes Land überholt und zählt nun mehr als 1,4 Milliarden Einwohner.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher See ist der tiefste der Welt?",
        answerA = "Tanganjikasee",
        answerB = "Kaspisches Meer",
        answerC = "Baikalsee",
        answerD = "Victoriasee",
        correctAnswer = 2,
        explanation = "Der Baikalsee in Sibirien ist mit einer maximalen Tiefe von 1.642 m der tiefste See der Welt und enthält rund 20 % des weltweiten Süßwasservorrats.",
        difficulty = 2,
        funFact = "Der Baikalsee ist so tief, dass man den Eiffelturm mehrfach übereinander hineinstellen könnte."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die längste Küstenlinie?",
        answerA = "Russland",
        answerB = "Australien",
        answerC = "Norwegen",
        answerD = "Kanada",
        correctAnswer = 3,
        explanation = "Kanada besitzt mit rund 202.080 km die längste Küstenlinie aller Länder der Erde, dank tausender Inseln und Fjorde.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wo liegt das Dead Sea (Totes Meer)?",
        answerA = "Ägypten und Sudan",
        answerB = "Israel, Jordanien und Palästinensische Gebiete",
        answerC = "Saudi-Arabien und Jemen",
        answerD = "Türkei und Syrien",
        correctAnswer = 1,
        explanation = "Das Tote Meer liegt an der Grenze zwischen Israel, Jordanien und den Palästinensischen Gebieten und ist mit ca. –430 m der tiefstgelegene Punkt der Erdoberfläche.",
        difficulty = 2,
        funFact = "Der Salzgehalt des Toten Meeres ist etwa zehnmal höher als der normaler Meere – Menschen schwimmen dort mühelos."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist die größte Insel der Welt?",
        answerA = "Madagaskar",
        answerB = "Borneo",
        answerC = "Grönland",
        answerD = "Neuguinea",
        correctAnswer = 2,
        explanation = "Grönland ist mit einer Fläche von rund 2,16 Millionen km² die größte Insel der Welt, gehört aber politisch zu Dänemark.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land liegt vollständig innerhalb Italiens?",
        answerA = "Monaco",
        answerB = "Vatikanstadt",
        answerC = "San Marino",
        answerD = "Liechtenstein",
        correctAnswer = 1,
        explanation = "Vatikanstadt liegt vollständig innerhalb Roms und ist mit rund 0,44 km² der kleinste Staat der Welt. San Marino wird von Italien umgeben, liegt aber nicht in einer einzigen Stadt.",
        difficulty = 2,
        funFact = "Vatikanstadt hat eine eigene Postbehörde, Armee (Schweizergarde) und sogar einen eigenen Bahnhof."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Vulkan gilt als aktivster der Erde?",
        answerA = "Ätna",
        answerB = "Kilauea",
        answerC = "Vesuv",
        answerD = "Piton de la Fournaise",
        correctAnswer = 1,
        explanation = "Der Kilauea auf Hawaii gilt als einer der aktivsten Vulkane der Welt und ist seit 1983 nahezu ununterbrochen aktiv.",
        difficulty = 2,
        funFact = "Das Wort \"Hawaii\" stammt aus der hawaiianischen Sprache und bedeutet möglicherweise \"Heimat der kleinen Götter\"."
    ),

    Question(
        categoryId = 1,
        questionText = "Durch wie viele Länder fließt der Amazonas?",
        answerA = "Nur durch Brasilien",
        answerB = "2 Länder",
        answerC = "3 Länder",
        answerD = "5 Länder",
        correctAnswer = 2,
        explanation = "Der Amazonas entspringt in Peru und fließt dann durch Kolumbien und schließlich quer durch Brasilien zum Atlantik – insgesamt 3 Länder.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist der höchste Berg außerhalb Asiens?",
        answerA = "Kilimandscharo",
        answerB = "Mont Blanc",
        answerC = "Aconcagua",
        answerD = "Denali",
        correctAnswer = 2,
        explanation = "Der Aconcagua in Argentinien ist mit 6.961 m der höchste Berg der Anden und der höchste Berg außerhalb Asiens.",
        difficulty = 2,
        funFact = "Der Aconcagua bedeutet in der Quechua-Sprache \"weißer Wächter\"."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der größte Regenwald der Erde?",
        answerA = "Kongobecken",
        answerB = "Daintree-Regenwald",
        answerC = "Amazonas-Regenwald",
        answerD = "Borneo-Regenwald",
        correctAnswer = 2,
        explanation = "Der Amazonas-Regenwald in Südamerika ist mit rund 5,5 Millionen km² der größte tropische Regenwald der Erde.",
        difficulty = 2,
        funFact = "Im Amazonas-Regenwald leben schätzungsweise 10 % aller Tier- und Pflanzenarten der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Meer liegt zwischen Europa und Afrika?",
        answerA = "Rotes Meer",
        answerB = "Schwarzes Meer",
        answerC = "Kaspisches Meer",
        answerD = "Mittelmeer",
        correctAnswer = 3,
        explanation = "Das Mittelmeer liegt zwischen Europa im Norden, Afrika im Süden und Asien im Osten und verbindet über die Straße von Gibraltar mit dem Atlantik.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land liegt der Viktoriasee?",
        answerA = "Nur in Kenia",
        answerB = "Nur in Uganda",
        answerC = "Kenia, Uganda und Tansania",
        answerD = "Äthiopien und Sudan",
        correctAnswer = 2,
        explanation = "Der Viktoriasee ist der größte See Afrikas und wird von Kenia, Uganda und Tansania geteilt.",
        difficulty = 2,
        funFact = "Der Viktoriasee ist die Hauptquelle des Weißen Nils."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die meisten Nachbarländer?",
        answerA = "Russland",
        answerB = "Brasilien",
        answerC = "China",
        answerD = "Deutschland",
        correctAnswer = 0,
        explanation = "Russland und China teilen sich den Rekord mit je 14 Nachbarländern. Da beide gleichauf liegen, gilt Russland oft als Erstgenanntes.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wo liegt Kapstadt?",
        answerA = "Kenia",
        answerB = "Nigeria",
        answerC = "Südafrika",
        answerD = "Namibia",
        correctAnswer = 2,
        explanation = "Kapstadt liegt im Westen Südafrikas am Kap der Guten Hoffnung und ist eine der schönsten Städte Afrikas.",
        difficulty = 2,
        funFact = "Südafrika hat drei Hauptstädte: Kapstadt (Legislative), Pretoria (Exekutive) und Bloemfontein (Judikative)."
    ),

    // ── HARD (difficulty = 3) ── ~12 questions ──────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Wie heißt der tiefste Punkt der Erdoberfläche?",
        answerA = "Puerto-Rico-Graben",
        answerB = "Diamantina-Tiefseerinne",
        answerC = "Marianengraben (Challengertief)",
        answerD = "Java-Graben",
        correctAnswer = 2,
        explanation = "Das Challengertief im Marianengraben im Pazifischen Ozean ist mit rund 10.935 m der tiefste bekannte Punkt der Erde.",
        difficulty = 3,
        funFact = "Der Druck am Grund des Marianengrabens beträgt etwa 1.086 bar – mehr als 1000 Mal höher als an der Oberfläche."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die meisten UNESCO-Welterbestätten?",
        answerA = "Frankreich",
        answerB = "Spanien",
        answerC = "China",
        answerD = "Italien",
        correctAnswer = 3,
        explanation = "Italien führt seit langem die Liste der Länder mit den meisten UNESCO-Welterbestätten an und zählt über 58 Einträge (Stand 2024).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Fluss hat das größte Einzugsgebiet der Welt?",
        answerA = "Nil",
        answerB = "Jangtse",
        answerC = "Amazonas",
        answerD = "Kongo",
        correctAnswer = 2,
        explanation = "Der Amazonas besitzt mit rund 7 Millionen km² das größte Einzugsgebiet aller Flüsse der Erde.",
        difficulty = 3,
        funFact = "Der Amazonas führt etwa 20 % des gesamten Flusswassers, das auf der Erde ins Meer gelangt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das bevölkerungsreichste Land Afrikas?",
        answerA = "Äthiopien",
        answerB = "Demokratische Republik Kongo",
        answerC = "Südafrika",
        answerD = "Nigeria",
        correctAnswer = 3,
        explanation = "Nigeria ist mit über 220 Millionen Einwohnern das bevölkerungsreichste Land Afrikas und zählt zu den zehn bevölkerungsreichsten Ländern weltweit.",
        difficulty = 3,
        funFact = "Bis 2050 soll Nigeria nach Prognosen das drittbevölkerungsreichste Land der Welt sein."
    ),

    Question(
        categoryId = 1,
        questionText = "Durch welche Länder verläuft der Äquator in Afrika?",
        answerA = "Marokko, Algerien, Libyen",
        answerB = "Gabun, Kongo, Demokratische Republik Kongo, Uganda, Kenia, Somalia",
        answerC = "Angola, Sambia, Mosambik",
        answerD = "Senegal, Guinea, Côte d'Ivoire",
        correctAnswer = 1,
        explanation = "Der Äquator verläuft durch mehrere afrikanische Länder, darunter Gabun, die Republik Kongo, die DR Kongo, Uganda, Kenia und Somalia.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Gebirge bildet die natürliche Grenze zwischen Europa und Asien?",
        answerA = "Kaukasus",
        answerB = "Ural",
        answerC = "Karpaten",
        answerD = "Balkangebirge",
        correctAnswer = 1,
        explanation = "Der Ural gilt traditionell als geografische Grenze zwischen Europa und Asien und erstreckt sich von der Arktis bis zur kasachischen Steppe.",
        difficulty = 3,
        funFact = "Der höchste Gipfel des Urals, der Narodnaja, ist nur 1.895 m hoch – verglichen mit dem Himalaya sehr bescheiden."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt das größte Binnengewässer der Welt (nach Fläche)?",
        answerA = "Baikalsee",
        answerB = "Aralsee",
        answerC = "Kaspisches Meer",
        answerD = "Oberer See",
        correctAnswer = 2,
        explanation = "Das Kaspische Meer ist mit rund 371.000 km² das größte abflusslose Binnengewässer der Erde, obwohl es technisch ein See ist.",
        difficulty = 3,
        funFact = "Das Kaspische Meer schrumpft kontinuierlich wegen Verdunstung und menschlicher Wasserentnahme."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das einzige Land der Welt, das auf zwei Kontinenten liegt und gleichzeitig eine Insel ist?",
        answerA = "Australien",
        answerB = "Indonesien",
        answerC = "Madagaskar",
        answerD = "Neuguinea (Papua)",
        correctAnswer = 3,
        explanation = "Neuguinea liegt geografisch in Australasien/Ozeanien, aber politisch ist der westliche Teil (Papua) zu Asien/Indonesien gehörend, was es zu einem interessanten Grenzfall macht.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat als einziges keinen Zugang zum Meer und ist gleichzeitig von einem Binnenstaat umgeben?",
        answerA = "Österreich",
        answerB = "Luxemburg",
        answerC = "Liechtenstein oder Usbekistan",
        answerD = "Andorra",
        correctAnswer = 2,
        explanation = "Liechtenstein und Usbekistan sind die einzigen doppelt eingeschlossenen Binnenstaaten der Welt: Beide sind von Ländern umgeben, die selbst keinen Meereszugang haben.",
        difficulty = 3,
        funFact = "Liechtenstein grenzt an die Schweiz und Österreich – beide haben keinen direkten Meereszugang."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Wasserfall hat die größte Wassermenge der Welt?",
        answerA = "Niagarafälle",
        answerB = "Iguazú-Fälle",
        answerC = "Viktoriafälle",
        answerD = "Boyoma-Fälle",
        correctAnswer = 3,
        explanation = "Die Boyoma-Fälle (früher Stanley Falls) am Kongo in der DR Kongo führen mit durchschnittlich 17.000 m³/s die meiste Wassermenge aller Wasserfälle.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land liegt der Titicacasee, der höchstgelegene schiffbare See der Welt?",
        answerA = "Nur in Bolivien",
        answerB = "Bolivien und Peru",
        answerC = "Peru und Ecuador",
        answerD = "Argentinien und Chile",
        correctAnswer = 1,
        explanation = "Der Titicacasee liegt auf 3.812 m Höhe und wird von Bolivien und Peru geteilt. Er ist der größte See Südamerikas nach Fläche.",
        difficulty = 3,
        funFact = "Die Uros, ein indigenes Volk, leben auf schwimmenden Schilfinseln auf dem Titicacasee."
    ),

    Question(
        categoryId = 1,
        questionText = "Welche Meerenge verbindet das Mittelmeer mit dem Atlantischen Ozean?",
        answerA = "Straße von Messina",
        answerB = "Straße von Malakka",
        answerC = "Straße von Gibraltar",
        answerD = "Straße von Hormuz",
        correctAnswer = 2,
        explanation = "Die Straße von Gibraltar zwischen Spanien und Marokko verbindet das Mittelmeer mit dem Atlantik. An der schmalsten Stelle ist sie nur 14 km breit.",
        difficulty = 3,
        funFact = "Pro Tag passieren durchschnittlich 300 Schiffe die Straße von Gibraltar – sie ist eine der meistbefahrenen Wasserstraßen der Welt."
    ),

    // ── EXPERT (difficulty = 4) ── ~8 questions ─────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Kasachstan?",
        answerA = "Almaty",
        answerB = "Taschkent",
        answerC = "Astana",
        answerD = "Bischkek",
        correctAnswer = 2,
        explanation = "Die Hauptstadt Kasachstans ist Astana (früher Nur-Sultan, davor Astana, davor Aqmola). Die Umbenennung erfolgte mehrfach nach politischen Änderungen.",
        difficulty = 4,
        funFact = "Astana wurde erst 1997 zur Hauptstadt, als Kasachstan die Hauptstadtfunktion von Almaty dorthin verlegte."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land besitzt den geografischen Mittelpunkt Südamerikas?",
        answerA = "Bolivien",
        answerB = "Brasilien",
        answerC = "Paraguay",
        answerD = "Peru",
        correctAnswer = 1,
        explanation = "Der geografische Mittelpunkt Südamerikas liegt in Brasilien, nahe der Stadt Cuiabá im Bundesstaat Mato Grosso.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das kleinste Land Afrikas?",
        answerA = "Dschibuti",
        answerB = "Cabo Verde",
        answerC = "Seychellen",
        answerD = "São Tomé und Príncipe",
        correctAnswer = 2,
        explanation = "Die Seychellen sind mit rund 455 km² der flächenmäßig kleinste Staat Afrikas und bestehen aus 115 Inseln im Indischen Ozean.",
        difficulty = 4,
        funFact = "Die Seychellen haben die größte Seeschildkröten-Population der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welche Stadt liegt am nächsten zum Erdmittelpunkt (dem geografischen Pol der Unzugänglichkeit der Erde)?",
        answerA = "Ulaanbaatar",
        answerB = "Nur-Sultan (Astana)",
        answerC = "Ürümqi",
        answerD = "Lhasa",
        correctAnswer = 2,
        explanation = "Der Pol der Unzugänglichkeit des eurasischen Kontinents liegt nahe der Stadt Ürümqi in der chinesischen Provinz Xinjiang – dem Punkt, der am weitesten von jedem Ozean entfernt ist.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der breiteste Fluss der Welt (nach Breite)?",
        answerA = "Amazonas",
        answerB = "Río de la Plata",
        answerC = "Kongo",
        answerD = "Ob",
        correctAnswer = 1,
        explanation = "Der Río de la Plata zwischen Argentinien und Uruguay gilt mit bis zu 220 km Breite als breitester Fluss der Welt, obwohl er eher eine Flussmündung ist.",
        difficulty = 4,
        funFact = "Der Name \"Río de la Plata\" bedeutet \"Silberfluss\" – die Spanier erhofften sich dort Silbervorkommen."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das einzige Land der Erde, das als Kontinent gilt?",
        answerA = "Brasilien",
        answerB = "Grönland",
        answerC = "Indien",
        answerD = "Australien",
        correctAnswer = 3,
        explanation = "Australien ist das einzige Land, das einen gesamten Kontinent (Australien/Ozeanien) für sich allein einnimmt – ohne andere souveräne Staaten auf dem Festland.",
        difficulty = 4,
        funFact = "Australien ist breiter als der Mond – von West nach Ost misst es etwa 4.000 km, der Monddurchmesser beträgt nur 3.474 km."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Kanal verbindet den Atlantischen mit dem Pazifischen Ozean?",
        answerA = "Suezkanal",
        answerB = "Panamakanal",
        answerC = "Korinthkanal",
        answerD = "Kielkanal",
        correctAnswer = 1,
        explanation = "Der Panamakanal in Panama verbindet den Atlantischen mit dem Pazifischen Ozean und wurde 1914 fertiggestellt.",
        difficulty = 4,
        funFact = "Beim Transit durch den Panamakanal kann ein Schiff von Ost nach West – paradoxerweise – in östlicher Richtung reisen, weil Panama sich von Nordwest nach Südost krümmt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die am weitesten östlich gelegene Hauptstadt der Welt?",
        answerA = "Japan (Tokio)",
        answerB = "Neuseeland (Wellington)",
        answerC = "Samoa (Apia)",
        answerD = "Tonga (Nuku'alofa)",
        correctAnswer = 1,
        explanation = "Wellington in Neuseeland liegt auf etwa 174° Ost und gilt als eine der östlichsten Hauptstädte. Nuku'alofa in Tonga (175° West, aber westlich der Datumsgrenze) ist ebenfalls ein Kandidat.",
        difficulty = 4,
        funFact = null
    ),

    // ── MASTER (difficulty = 5) ── ~5 questions ─────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die größte Anzahl an aktiven Vulkanen?",
        answerA = "Japan",
        answerB = "Russland",
        answerC = "Indonesien",
        answerD = "USA",
        correctAnswer = 2,
        explanation = "Indonesien liegt auf dem Pazifischen Feuerring und besitzt über 130 aktive Vulkane – mehr als jedes andere Land der Erde.",
        difficulty = 5,
        funFact = "Der Ausbruch des Tambora auf Indonesien im Jahr 1815 war der stärkste in der aufgezeichneten Menschheitsgeschichte und verursachte das \"Jahr ohne Sommer\" 1816."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der längste Gebirgszug unter dem Meeresspiegel?",
        answerA = "Mittelatlantischer Rücken",
        answerB = "Tonga-Kermadec-Rücken",
        answerC = "Pazifisch-Antarktischer Rücken",
        answerD = "Carlsberg-Rücken",
        correctAnswer = 0,
        explanation = "Der Mittelatlantische Rücken ist mit rund 16.000 km der längste Gebirgszug der Erde und liegt größtenteils unter dem Atlantischen Ozean.",
        difficulty = 5,
        funFact = "Auf Island kann man den Mittelatlantischen Rücken an der Erdoberfläche sehen – das Land liegt genau auf ihm."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land in Südostasien hat die meisten Inseln der Welt?",
        answerA = "Philippinen",
        answerB = "Indonesien",
        answerC = "Malaysia",
        answerD = "Schweden",
        correctAnswer = 1,
        explanation = "Schweden hat mit über 220.000 Inseln die meisten registrierten Inseln weltweit, aber Indonesien hat die meisten bewohnten Inseln (über 6.000 von 17.508).",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Meer hat den höchsten Salzgehalt der Welt?",
        answerA = "Totes Meer",
        answerB = "Rotes Meer",
        answerC = "Mittelmeer",
        answerD = "Don Juan Pond",
        correctAnswer = 3,
        explanation = "Der Don Juan Pond in der Antarktis hat einen Salzgehalt von über 40 % und ist das salzigste natürliche Gewässer der Erde. Das Tote Meer folgt mit rund 30 %.",
        difficulty = 5,
        funFact = "Der Don Juan Pond friert selbst bei –53 °C nicht ein, weil sein extrem hoher Salzgehalt den Gefrierpunkt drastisch senkt."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der Punkt auf der Erdoberfläche, der dem Erdmittelpunkt am nächsten liegt (flachster Punkt der Erde bezogen auf den Erdradius)?",
        answerA = "Totes Meer",
        answerB = "Marianengraben",
        answerC = "Arktischer Ozean",
        answerD = "Nordpol",
        correctAnswer = 0,
        explanation = "Aufgrund der Abplattung der Erde an den Polen hat der Nordpol den geringsten Abstand zum Erdmittelpunkt – er liegt näher am Mittelpunkt als der Äquator.",
        difficulty = 5,
        funFact = "Die Erde ist kein perfekter Kreis: Am Äquator beträgt der Radius 6.378 km, an den Polen nur 6.357 km – ein Unterschied von 21 km."
    ),

    // ── NEW EASY (difficulty = 1) ── 15 questions ────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Was ist die Hauptstadt von Spanien?",
        answerA = "Barcelona",
        answerB = "Madrid",
        answerC = "Sevilla",
        answerD = "Valencia",
        correctAnswer = 1,
        explanation = "Madrid ist die Hauptstadt Spaniens und mit über 3,3 Millionen Einwohnern die größte Stadt des Landes.",
        difficulty = 1,
        funFact = "Madrid ist die höchstgelegene Hauptstadt der Europäischen Union, auf etwa 667 Metern über dem Meeresspiegel."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Italien?",
        answerA = "Mailand",
        answerB = "Neapel",
        answerC = "Florenz",
        answerD = "Rom",
        correctAnswer = 3,
        explanation = "Rom ist die Hauptstadt Italiens und war das Zentrum des antiken Römischen Reiches. Mit über 2,8 Millionen Einwohnern ist es die größte Stadt Italiens.",
        difficulty = 1,
        funFact = "Rom wird auch die 'Ewige Stadt' genannt – eine Bezeichnung, die auf den Dichter Tibullus aus dem 1. Jahrhundert v. Chr. zurückgeht."
    ),

    Question(
        categoryId = 1,
        questionText = "Auf welchem Kontinent liegt Brasilien?",
        answerA = "Afrika",
        answerB = "Nordamerika",
        answerC = "Südamerika",
        answerD = "Asien",
        correctAnswer = 2,
        explanation = "Brasilien liegt in Südamerika und ist mit über 8,5 Millionen km² das größte Land des Kontinents sowie das fünftgrößte der Welt.",
        difficulty = 1,
        funFact = "Brasilien ist das einzige portugiesischsprachige Land in Südamerika – alle Nachbarländer sprechen Spanisch."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Fluss fließt durch London?",
        answerA = "Themse",
        answerB = "Severn",
        answerC = "Avon",
        answerD = "Mersey",
        correctAnswer = 0,
        explanation = "Die Themse fließt durch das Zentrum Londons und ist der längste Fluss Englands mit einer Länge von rund 346 km.",
        difficulty = 1,
        funFact = "Die Tower Bridge über die Themse wurde 1894 eröffnet und öffnet sich heute noch etwa 1.000 Mal pro Jahr für hohe Schiffe."
    ),

    Question(
        categoryId = 1,
        questionText = "Was ist die Hauptstadt von Australien?",
        answerA = "Sydney",
        answerB = "Melbourne",
        answerC = "Brisbane",
        answerD = "Canberra",
        correctAnswer = 3,
        explanation = "Canberra ist die Hauptstadt Australiens. Die Stadt wurde 1913 eigens als Kompromiss zwischen den Rivalen Sydney und Melbourne gegründet.",
        difficulty = 1,
        funFact = "Canberra ist eine der wenigen Hauptstädte der Welt, die von Grund auf als Planstadt neu errichtet wurde."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das kleinste Land der Welt?",
        answerA = "Monaco",
        answerB = "Liechtenstein",
        answerC = "Vatikanstadt",
        answerD = "San Marino",
        correctAnswer = 2,
        explanation = "Vatikanstadt ist mit einer Fläche von nur 0,44 km² der kleinste Staat der Welt und liegt vollständig innerhalb Roms.",
        difficulty = 1,
        funFact = "Vatikanstadt hat mehr Staatsangehörige pro Quadratkilometer als jedes andere Land – aber die meisten Bürger leben außerhalb des Vatikans."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land steht der Eiffelturm?",
        answerA = "Belgien",
        answerB = "Schweiz",
        answerC = "Deutschland",
        answerD = "Frankreich",
        correctAnswer = 3,
        explanation = "Der Eiffelturm steht in Paris, der Hauptstadt Frankreichs, und wurde 1889 zur Weltausstellung fertiggestellt.",
        difficulty = 1,
        funFact = "Der Eiffelturm ist im Sommer bis zu 15 cm höher als im Winter – weil sich das Metall durch die Hitze ausdehnt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Gebirge trennt Europa von Asien?",
        answerA = "Alpen",
        answerB = "Ural",
        answerC = "Kaukasus",
        answerD = "Karpaten",
        correctAnswer = 1,
        explanation = "Der Ural gilt als konventionelle geografische Grenze zwischen Europa und Asien und erstreckt sich von der Arktis bis zur kasachischen Steppe.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Kanada?",
        answerA = "Toronto",
        answerB = "Vancouver",
        answerC = "Montreal",
        answerD = "Ottawa",
        correctAnswer = 3,
        explanation = "Ottawa ist die Hauptstadt Kanadas. Obwohl Toronto und Vancouver größer sind, wurde Ottawa 1857 von Königin Victoria zur Hauptstadt erklärt.",
        difficulty = 1,
        funFact = "Ottawa liegt direkt an der Grenze zur Provinz Quebec und ist damit offiziell zweisprachig – Englisch und Französisch."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Berg ist der höchste der Erde?",
        answerA = "K2",
        answerB = "Kangchendzönga",
        answerC = "Mount Everest",
        answerD = "Lhotse",
        correctAnswer = 2,
        explanation = "Der Mount Everest im Himalaya ist mit 8.849 m der höchste Berg der Erde über dem Meeresspiegel.",
        difficulty = 1,
        funFact = "Der Mount Everest wurde erstmals am 29. Mai 1953 von Edmund Hillary und Tenzing Norgay bestiegen."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land liegt der Amazonas-Regenwald hauptsächlich?",
        answerA = "Kolumbien",
        answerB = "Peru",
        answerC = "Bolivien",
        answerD = "Brasilien",
        correctAnswer = 3,
        explanation = "Etwa 60 % des Amazonas-Regenwaldes befinden sich in Brasilien, der Rest verteilt sich auf acht weitere südamerikanische Länder.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Meer liegt nördlich von Deutschland?",
        answerA = "Mittelmeer",
        answerB = "Schwarzes Meer",
        answerC = "Nord- und Ostsee",
        answerD = "Atlantischer Ozean",
        correctAnswer = 2,
        explanation = "Deutschland grenzt im Norden an die Nordsee (im Westen) und die Ostsee (im Osten).",
        difficulty = 1,
        funFact = "Die deutsche Nordseeküste ist bekannt für ihre Gezeiten – bei Ebbe kann man kilometerweit über den Wattenmeer-Boden laufen."
    ),

    Question(
        categoryId = 1,
        questionText = "Was ist die Hauptstadt von China?",
        answerA = "Shanghai",
        answerB = "Peking (Beijing)",
        answerC = "Hongkong",
        answerD = "Kanton (Guangzhou)",
        correctAnswer = 1,
        explanation = "Peking (Beijing) ist die Hauptstadt der Volksrepublik China und war auch über Jahrhunderte die kaiserliche Hauptstadt des Landes.",
        difficulty = 1,
        funFact = "Der Name 'Beijing' bedeutet auf Chinesisch 'Nördliche Hauptstadt'."
    ),

    Question(
        categoryId = 1,
        questionText = "Auf welchem Kontinent liegt Südafrika?",
        answerA = "Asien",
        answerB = "Südamerika",
        answerC = "Afrika",
        answerD = "Australien",
        correctAnswer = 2,
        explanation = "Südafrika liegt an der Südspitze des afrikanischen Kontinents und grenzt an den Atlantischen und den Indischen Ozean.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Brasilien?",
        answerA = "Rio de Janeiro",
        answerB = "São Paulo",
        answerC = "Brasília",
        answerD = "Salvador",
        correctAnswer = 2,
        explanation = "Brasília ist die Hauptstadt Brasiliens. Die Stadt wurde in den 1950er Jahren als Planhauptstadt neu gebaut und 1960 eingeweiht.",
        difficulty = 1,
        funFact = "Brasília ist als einzige Stadt des 20. Jahrhunderts UNESCO-Welterbe – wegen ihrer modernistischen Stadtplanung und Architektur."
    ),

    // ── NEW MEDIUM (difficulty = 2) ── 20 questions ──────────────────────────

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die meisten Zeitzonen?",
        answerA = "Russland",
        answerB = "USA",
        answerC = "Kanada",
        answerD = "Frankreich",
        correctAnswer = 3,
        explanation = "Frankreich hat mit seinen Überseegebieten insgesamt 12 Zeitzonen und liegt damit vor Russland (11) und den USA (11).",
        difficulty = 2,
        funFact = "Obwohl das Mutterland Frankreichs nur eine Zeitzone hat, verteilen sich die Überseegebiete über die ganze Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Kontinent hat die meisten Länder?",
        answerA = "Asien",
        answerB = "Amerika",
        answerC = "Afrika",
        answerD = "Europa",
        correctAnswer = 2,
        explanation = "Afrika hat mit 54 anerkannten Staaten die meisten Länder aller Kontinente.",
        difficulty = 2,
        funFact = "Fast alle afrikanischen Länder wurden erst im 20. Jahrhundert unabhängig – die meisten zwischen 1956 und 1975."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die längste Landgrenze der Welt?",
        answerA = "USA–Mexiko",
        answerB = "Russland–Kasachstan",
        answerC = "Argentinien–Chile",
        answerD = "Kanada–USA",
        correctAnswer = 3,
        explanation = "Die Grenze zwischen Kanada und den USA ist mit rund 8.891 km die längste Landgrenze der Welt.",
        difficulty = 2,
        funFact = "Die Kanada-USA-Grenze ist nahezu unbewacht und gilt als die freundlichste internationale Grenze der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Fluss fließt durch Paris?",
        answerA = "Loire",
        answerB = "Rhône",
        answerC = "Seine",
        answerD = "Garonne",
        correctAnswer = 2,
        explanation = "Die Seine fließt durch Paris und ist 775 km lang. Sie mündet bei Le Havre in den Ärmelkanal.",
        difficulty = 2,
        funFact = "Die mittelalterliche Île de la Cité in der Seine ist der historische Kern von Paris – hier stand die erste Siedlung der Stadt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das bevölkerungsreichste Land Europas?",
        answerA = "Deutschland",
        answerB = "Frankreich",
        answerC = "Russland",
        answerD = "Ukraine",
        correctAnswer = 2,
        explanation = "Russland hat als größtes Land Europas auch die meisten Einwohner (etwa 144 Millionen im europäischen Teil eingerechnet), wobei der Großteil der Bevölkerung westlich des Urals lebt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Gebirgspass ist der bekannteste Übergang in den Alpen zwischen Deutschland und Italien?",
        answerA = "Gotthardpass",
        answerB = "Brennerpass",
        answerC = "Großer St. Bernhard",
        answerD = "Simplon",
        correctAnswer = 1,
        explanation = "Der Brennerpass auf 1.374 m ist die wichtigste Alpenquerung zwischen Österreich und Italien und der niedrigste Pass der Zentralalpen.",
        difficulty = 2,
        funFact = "Durch den Brenner fährt die meistbefahrene Fernstraße Europas – täglich passieren tausende LKW den Pass."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land entspringt der Rhein?",
        answerA = "Deutschland",
        answerB = "Österreich",
        answerC = "Schweiz",
        answerD = "Frankreich",
        correctAnswer = 2,
        explanation = "Der Rhein entspringt in der Schweiz im Kanton Graubünden (Rheinquellen Toma-See und Tomasee) und mündet in den Niederlanden in die Nordsee.",
        difficulty = 2,
        funFact = "Der Rhein ist 1.230 km lang und einer der wichtigsten Binnenschifffahrtswege Europas."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches afrikanische Land war nie eine europäische Kolonie?",
        answerA = "Kenia",
        answerB = "Nigeria",
        answerC = "Äthiopien",
        answerD = "Ghana",
        correctAnswer = 2,
        explanation = "Äthiopien ist eines der wenigen afrikanischen Länder, das nie dauerhaft kolonisiert wurde. Die kurze italienische Besatzung (1936–1941) gilt nicht als vollständige Kolonisierung.",
        difficulty = 2,
        funFact = "Äthiopiens Sieg über Italien in der Schlacht von Adwa 1896 machte das Land zum Symbol afrikanischen Widerstands gegen den Kolonialismus."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land liegt zwischen Frankreich und Spanien in den Pyrenäen?",
        answerA = "Monaco",
        answerB = "Luxemburg",
        answerC = "Andorra",
        answerD = "Liechtenstein",
        correctAnswer = 2,
        explanation = "Andorra ist ein kleines Fürstentum, das vollständig in den Pyrenäen zwischen Frankreich und Spanien liegt.",
        difficulty = 2,
        funFact = "Andorra hat keine eigene Armee und ist seit 1278 ein Ko-Fürstentum – regiert gemeinsam vom Bischof von Urgell und dem Präsidenten Frankreichs."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist der längste Fluss Europas?",
        answerA = "Donau",
        answerB = "Rhein",
        answerC = "Wolga",
        answerD = "Elbe",
        correctAnswer = 2,
        explanation = "Die Wolga ist mit 3.530 km der längste Fluss Europas und fließt ausschließlich durch Russland ins Kaspische Meer.",
        difficulty = 2,
        funFact = "In Russland wird die Wolga 'Матушка Волга' (Mutter Wolga) genannt – sie ist kulturell und historisch von zentraler Bedeutung."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land hat den Kilimandscharo?",
        answerA = "Kenia",
        answerB = "Uganda",
        answerC = "Tansania",
        answerD = "Äthiopien",
        correctAnswer = 2,
        explanation = "Der Kilimandscharo liegt in Tansania und ist mit 5.895 m der höchste Berg Afrikas und ein freistehender Vulkan.",
        difficulty = 2,
        funFact = "Der Kilimandscharo hat drei Vulkankegel: Kibo (höchster), Mawenzi und Shira. Kibo ist seit etwa 200.000 Jahren erloschen."
    ),

    Question(
        categoryId = 1,
        questionText = "Durch welche Stadt fließt sowohl der Fluss Moldau als auch die Elbe (über Moldau)?",
        answerA = "Wien",
        answerB = "Budapest",
        answerC = "Prag",
        answerD = "Bratislava",
        correctAnswer = 2,
        explanation = "Die Moldau fließt durch Prag und mündet nördlich der Stadt in die Elbe. Prag liegt also im Einzugsgebiet der Elbe.",
        difficulty = 2,
        funFact = "Die berühmte Karlsbrücke in Prag überspannt die Moldau und wurde 1357 von Kaiser Karl IV. in Auftrag gegeben."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist der größte See Nordamerikas?",
        answerA = "Oberer See",
        answerB = "Huronsee",
        answerC = "Michigansee",
        answerD = "Eriesee",
        correctAnswer = 0,
        explanation = "Der Obere See (Lake Superior) ist mit rund 82.100 km² der größte Süßwassersee Nordamerikas und einer der Großen Seen.",
        difficulty = 2,
        funFact = "Der Obere See enthält etwa 10 % des gesamten Oberflächensüßwassers der Erde."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Argentinien?",
        answerA = "Montevideo",
        answerB = "Santiago de Chile",
        answerC = "Lima",
        answerD = "Buenos Aires",
        correctAnswer = 3,
        explanation = "Buenos Aires ist die Hauptstadt Argentiniens und mit über 15 Millionen Einwohnern in der Metropolregion eine der größten Städte Südamerikas.",
        difficulty = 2,
        funFact = "Buenos Aires bedeutet auf Spanisch 'gute Lüfte' oder 'gute Winde' – der Name stammt von der Schutzpatronin der Seefahrer."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Kanal verbindet das Rote Meer mit dem Mittelmeer?",
        answerA = "Panamakanal",
        answerB = "Korinthkanal",
        answerC = "Kielkanal",
        answerD = "Suezkanal",
        correctAnswer = 3,
        explanation = "Der Suezkanal in Ägypten verbindet das Rote Meer mit dem Mittelmeer und wurde 1869 eröffnet. Er ist rund 193 km lang.",
        difficulty = 2,
        funFact = "Durch den Suezkanal wird der Seeweg zwischen Europa und Asien um bis zu 7.000 km verkürzt."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land liegen die Galapagos-Inseln?",
        answerA = "Peru",
        answerB = "Ecuador",
        answerC = "Kolumbien",
        answerD = "Chile",
        correctAnswer = 1,
        explanation = "Die Galapagos-Inseln gehören zu Ecuador und liegen im Pazifischen Ozean etwa 960 km westlich der ecuadorianischen Küste.",
        difficulty = 2,
        funFact = "Charles Darwin besuchte die Galapagos-Inseln 1835 – seine Beobachtungen inspirierten ihn zur Evolutionstheorie."
    ),

    Question(
        categoryId = 1,
        questionText = "Welche Stadt ist die größte der Welt nach Einwohnerzahl (Stadtgebiet)?",
        answerA = "Mumbai",
        answerB = "São Paulo",
        answerC = "Tokio",
        answerD = "Delhi",
        correctAnswer = 2,
        explanation = "Die Metropolregion Tokio ist mit über 37 Millionen Einwohnern die bevölkerungsreichste Stadtregion der Welt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Meer liegt zwischen der Arabischen Halbinsel und Afrika?",
        answerA = "Kaspisches Meer",
        answerB = "Rotes Meer",
        answerC = "Persischer Golf",
        answerD = "Arabisches Meer",
        correctAnswer = 1,
        explanation = "Das Rote Meer liegt zwischen der Arabischen Halbinsel (Saudi-Arabien, Jemen) und Afrika (Ägypten, Sudan, Eritrea) und verbindet über den Golf von Aden mit dem Indischen Ozean.",
        difficulty = 2,
        funFact = "Das Rote Meer hat seinen Namen möglicherweise von den roten Cyanobakterien-Blüten, die das Wasser gelegentlich rötlich färben."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches europäische Land hat die meisten Einwohner (ohne Russland)?",
        answerA = "Frankreich",
        answerB = "Deutschland",
        answerC = "Vereinigtes Königreich",
        answerD = "Italien",
        correctAnswer = 1,
        explanation = "Deutschland ist ohne Russland mit rund 84 Millionen Einwohnern das bevölkerungsreichste Land der Europäischen Union und Europas.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der höchste Berg der Alpen?",
        answerA = "Matterhorn",
        answerB = "Großglockner",
        answerC = "Jungfrau",
        answerD = "Mont Blanc",
        correctAnswer = 3,
        explanation = "Der Mont Blanc auf der Grenze zwischen Frankreich und Italien ist mit 4.808 m der höchste Gipfel der Alpen und Westeuropas.",
        difficulty = 2,
        funFact = "Der Mont Blanc wurde erstmals 1786 von Michel Paccard und Jacques Balmat bestiegen – das gilt als Geburtsstunde des modernen Alpinismus."
    ),

    // ── NEW HARD (difficulty = 3) ── 15 questions ────────────────────────────

    Question(
        categoryId = 1,
        questionText = "Welches Land hat die höchste Bevölkerungsdichte der Welt (unter den Flächenstaaten)?",
        answerA = "Singapur",
        answerB = "Bangladesch",
        answerC = "Südkorea",
        answerD = "Niederlande",
        correctAnswer = 1,
        explanation = "Bangladesch hat unter den großen Flächenstaaten die höchste Bevölkerungsdichte mit über 1.100 Einwohnern pro km². Stadtstaaten wie Monaco oder Singapur haben noch höhere Dichten.",
        difficulty = 3,
        funFact = "Bangladesch ist flächenmäßig etwa so groß wie Griechenland, beherbergt aber über 170 Millionen Menschen."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Fluss hat die größte Fließgeschwindigkeit der Welt?",
        answerA = "Amazonas",
        answerB = "Kongo",
        answerC = "Yangtze",
        answerD = "Mississippi",
        correctAnswer = 1,
        explanation = "Der Kongo in Zentralafrika ist der wasserreichste Fluss der Welt nach dem Amazonas und hat die tiefste Schlucht eines Flusses – stellenweise über 220 m tief.",
        difficulty = 3,
        funFact = "Der Kongo ist der einzige Fluss, der den Äquator zweimal überquert."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt die Hauptstadt von Myanmar (Burma)?",
        answerA = "Rangun (Yangon)",
        answerB = "Mandalay",
        answerC = "Naypyidaw",
        answerD = "Bagan",
        correctAnswer = 2,
        explanation = "Naypyidaw ist seit 2006 die Hauptstadt Myanmars. Die Stadt wurde speziell als neue Hauptstadt gebaut und liegt im Zentrum des Landes.",
        difficulty = 3,
        funFact = "Naypyidaw hat breite Highways mit bis zu 20 Fahrspuren, die meist fast leer sind – eine der gespenstischsten Hauptstädte der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das einzige Land in Südamerika, das weder Spanisch noch Portugiesisch als Amtssprache hat?",
        answerA = "Peru",
        answerB = "Guyana",
        answerC = "Bolivien",
        answerD = "Uruguay",
        correctAnswer = 1,
        explanation = "Guyana hat Englisch als Amtssprache – ein Erbe der britischen Kolonialzeit. Es ist das einzige englischsprachige Land Südamerikas.",
        difficulty = 3,
        funFact = "Guyana, Suriname (Niederländisch) und Französisch-Guayana (Französisch) bilden die Guianas – drei Länder mit europäischen Sprachen in Südamerika."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher europäische Fluss ist der längste, der vollständig in der EU liegt?",
        answerA = "Donau",
        answerB = "Rhein",
        answerC = "Elbe",
        answerD = "Loire",
        correctAnswer = 0,
        explanation = "Die Donau mit 2.860 km Gesamtlänge fließt durch 10 Länder und ist der zweitlängste Fluss Europas. Der Großteil liegt in EU-Staaten.",
        difficulty = 3,
        funFact = "Die Donau entspringt im Schwarzwald in Deutschland und mündet im Donaudelta in Rumänien ins Schwarze Meer."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land liegt der Salzsee Salar de Uyuni, der größte Salzsee der Welt?",
        answerA = "Chile",
        answerB = "Argentinien",
        answerC = "Bolivien",
        answerD = "Peru",
        correctAnswer = 2,
        explanation = "Der Salar de Uyuni liegt in Bolivien auf dem Altiplano in 3.656 m Höhe und ist mit über 10.000 km² der größte Salzsee der Welt.",
        difficulty = 3,
        funFact = "Der Salar de Uyuni enthält schätzungsweise 50–70 % der weltweiten Lithium-Reserven und ist für die Akkuproduktion von großer Bedeutung."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Land grenzt an die meisten andere Länder in Afrika?",
        answerA = "Sudan",
        answerB = "Demokratische Republik Kongo",
        answerC = "Tansania",
        answerD = "Äthiopien",
        correctAnswer = 1,
        explanation = "Die Demokratische Republik Kongo grenzt an 9 Länder: Angola, Burundi, Zentralafrikanische Republik, Republik Kongo, Ruanda, Südsudan, Tansania, Uganda und Sambia.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Ozean ist der kleinste der Welt?",
        answerA = "Indischer Ozean",
        answerB = "Südlicher Ozean",
        answerC = "Arktischer Ozean",
        answerD = "Atlantischer Ozean",
        correctAnswer = 2,
        explanation = "Der Arktische Ozean (Nordpolarmeer) ist mit rund 14,06 Millionen km² der kleinste der fünf Weltozeane.",
        difficulty = 3,
        funFact = "Der Arktische Ozean ist im Winter fast vollständig von Meereis bedeckt. Durch den Klimawandel schmilzt das Eis jedoch zunehmend."
    ),

    Question(
        categoryId = 1,
        questionText = "Wie heißt der längste Fluss Asiens?",
        answerA = "Ganges",
        answerB = "Mekong",
        answerC = "Yangtse (Jangtsekiang)",
        answerD = "Indus",
        correctAnswer = 2,
        explanation = "Der Yangtse (Jangtsekiang) in China ist mit 6.380 km der längste Fluss Asiens und der drittlängste der Welt.",
        difficulty = 3,
        funFact = "Am Yangtse steht der Drei-Schluchten-Damm – das leistungsstärkste Wasserkraftwerk der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches ist das höchstgelegene Hauptstadt der Welt?",
        answerA = "Quito, Ecuador",
        answerB = "Addis Abeba, Äthiopien",
        answerC = "Bogotá, Kolumbien",
        answerD = "La Paz, Bolivien",
        correctAnswer = 3,
        explanation = "La Paz in Bolivien liegt auf 3.640 m Höhe (Regierungssitz) und gilt als die höchstgelegene Regierungshauptstadt der Welt. Formell ist Sucre die Verfassungshauptstadt.",
        difficulty = 3,
        funFact = "In La Paz gilt Wasser schon bei ca. 90 °C als kochend – wegen des niedrigen Luftdrucks in der Höhe."
    ),

    Question(
        categoryId = 1,
        questionText = "Welche Inselgruppe gehört geografisch zu Afrika, politisch aber zu Spanien?",
        answerA = "Balearen",
        answerB = "Kanarische Inseln",
        answerC = "Azoren",
        answerD = "Madeira",
        correctAnswer = 1,
        explanation = "Die Kanarischen Inseln liegen vor der Küste Westafrikas (Marokko/Westsahara), sind aber eine autonome spanische Gemeinschaft.",
        difficulty = 3,
        funFact = "Der Name 'Kanarische Inseln' kommt vom lateinischen 'Canariae Insulae' – Insel der Hunde – nicht von Kanarienvögeln."
    ),

    Question(
        categoryId = 1,
        questionText = "In welchem Land befinden sich die Viktoriafälle?",
        answerA = "Nur in Simbabwe",
        answerB = "Nur in Sambia",
        answerC = "Simbabwe und Sambia",
        answerD = "Mosambik und Tansania",
        correctAnswer = 2,
        explanation = "Die Viktoriafälle liegen auf der Grenze zwischen Simbabwe und Sambia am Fluss Sambesi und sind mit 1.708 m Breite die breitesten Wasserfälle der Welt.",
        difficulty = 3,
        funFact = "Die lokale Bezeichnung der Viktoriafälle ist 'Mosi-oa-Tunya' – 'der Rauch, der donnert' – weil der Sprühnebel kilometerweit sichtbar ist."
    ),

    Question(
        categoryId = 1,
        questionText = "Welche zwei Länder teilen sich die Insel Hispaniola?",
        answerA = "Kuba und Jamaika",
        answerB = "Haiti und Dominikanische Republik",
        answerC = "Puerto Rico und Haiti",
        answerD = "Trinidad und Tobago",
        correctAnswer = 1,
        explanation = "Die Insel Hispaniola in der Karibik ist zwischen Haiti (westlicher Teil) und der Dominikanischen Republik (östlicher Teil) aufgeteilt.",
        difficulty = 3,
        funFact = "Hispaniola war die erste Insel in Amerika, auf der Kolumbus 1492 eine dauerhafte europäische Siedlung gründete."
    ),

    Question(
        categoryId = 1,
        questionText = "Welcher Gebirgspass in der Schweiz trennt die Tessiner Alpen von den Urner Alpen und war historisch wichtig für Nord-Süd-Handel?",
        answerA = "Simplon",
        answerB = "Gotthardpass",
        answerC = "San Bernardino",
        answerD = "Maloja",
        correctAnswer = 1,
        explanation = "Der Gotthardpass (2.106 m) war seit dem 13. Jahrhundert einer der wichtigsten Alpenpässe für den Handel zwischen Nord- und Südeuropa.",
        difficulty = 3,
        funFact = "Der Gotthard-Basistunnel (57 km) ist seit 2016 der längste Eisenbahntunnel der Welt."
    ),

    Question(
        categoryId = 1,
        questionText = "Welches Meer liegt östlich der Arabischen Halbinsel?",
        answerA = "Rotes Meer",
        answerB = "Mittelmeer",
        answerC = "Persischer Golf und Arabisches Meer",
        answerD = "Kaspisches Meer",
        correctAnswer = 2,
        explanation = "Östlich der Arabischen Halbinsel liegt der Persische Golf (im Norden) und das Arabische Meer (im Süden), das Teil des Indischen Ozeans ist.",
        difficulty = 3,
        funFact = "Der Persische Golf enthält etwa 55 % der weltweiten nachgewiesenen Ölreserven."
    )
)
