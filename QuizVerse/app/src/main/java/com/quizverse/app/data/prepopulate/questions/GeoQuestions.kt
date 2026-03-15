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
    )
)
