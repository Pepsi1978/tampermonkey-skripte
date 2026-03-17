package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsEasy3(): List<Question> = listOf(

    // Question 1 — Geology basics
    Question(
        categoryId = 2,
        questionText = "Welche drei Grundarten von Gesteinen gibt es?",
        answerA = "Magmatisch, Sedimentär und Metamorph",
        answerB = "Vulkanisch, Fossile und Kristallin",
        answerC = "Hart, Weich und Flüssig",
        answerD = "Kalk, Sand und Ton",
        correctAnswer = 0, // A
        explanation = "Die drei Grundgesteinsarten sind magmatisches Gestein (aus Magma erstarrt), Sedimentgestein (aus abgelagerten Schichten entstanden) und metamorphes Gestein (durch Druck/Wärme umgewandelt).",
        difficulty = 1,
        funFact = "Granit ist ein magmatisches Gestein und wird weltweit für Küchen-Arbeitsplatten genutzt — es entsteht tief im Erdinneren aus abkühlender Gesteinsschmelze."
    ),

    // Question 2 — Geology basics
    Question(
        categoryId = 2,
        questionText = "Was ist ein Vulkan?",
        answerA = "Eine unterirdische Höhle voller Wasser",
        answerB = "Ein Berg, der glühend heißes Magma aus dem Erdinneren ausstößt",
        answerC = "Eine Spalte im Meeresboden",
        answerD = "Ein besonders alter Gebirgsrücken",
        correctAnswer = 1, // B
        explanation = "Ein Vulkan ist eine Öffnung in der Erdkruste, durch die Magma (flüssiges Gestein), Gase und Asche aus dem Erdinneren an die Oberfläche gelangen. Das ausgetretene Magma nennt man Lava.",
        difficulty = 1,
        funFact = "Auf der Erde gibt es etwa 1.500 aktive Vulkane. Der aktivste Vulkan der Welt ist Kīlauea auf Hawaii — er bricht seit 1983 fast ununterbrochen aus."
    ),

    // Question 3 — Geology basics
    Question(
        categoryId = 2,
        questionText = "Was sind Erdbeben?",
        answerA = "Stürme unter der Erde",
        answerB = "Erschütterungen der Erdoberfläche durch Bewegungen der Erdplatten",
        answerC = "Explosionen von Unterwasser-Vulkanen",
        answerD = "Schwingungen durch starke Winde",
        correctAnswer = 1, // B
        explanation = "Erdbeben entstehen, wenn tektonische Platten gegeneinander reiben, aneinanderstoßen oder auseinanderbrechen. Die freigesetzte Energie breitet sich als Erschütterungswellen aus.",
        difficulty = 1,
        funFact = "Jedes Jahr ereignen sich weltweit etwa 500.000 messbare Erdbeben — aber nur etwa 100 davon sind stark genug, um Schäden zu verursachen."
    ),

    // Question 4 — Geology basics
    Question(
        categoryId = 2,
        questionText = "Was sind Mineralien?",
        answerA = "Abgestorbene Pflanzen- und Tierreste im Boden",
        answerB = "Natürlich vorkommende, feste, anorganische Stoffe mit bestimmter chemischer Zusammensetzung",
        answerC = "Flüssige Substanzen im Erdmantel",
        answerD = "Gasförmige Bestandteile im Grundwasser",
        correctAnswer = 1, // B
        explanation = "Mineralien sind natürliche, feste, anorganische Substanzen mit einer geordneten Kristallstruktur und bestimmter chemischer Zusammensetzung. Quarz, Feldspat und Glimmer sind häufige Mineralien.",
        difficulty = 1,
        funFact = null
    ),

    // Question 5 — Geology basics
    Question(
        categoryId = 2,
        questionText = "Woraus besteht fruchtbarer Boden hauptsächlich?",
        answerA = "Nur aus Sand und Kieseln",
        answerB = "Aus Gesteinspartikeln, Humus, Wasser, Luft und Mikroorganismen",
        answerC = "Aus reinem Kalk",
        answerD = "Aus Salz und Tonmineralien",
        correctAnswer = 1, // B
        explanation = "Fruchtbarer Boden besteht aus einem Gemisch aus verwitterten Gesteinspartikeln, organischem Material (Humus), Wasser, Luft und einer Vielzahl von Mikroorganismen.",
        difficulty = 1,
        funFact = "In einem Teelöffel gesunden Bodens leben mehr Mikroorganismen als Menschen auf der Erde — über 10 Milliarden Bakterien allein."
    ),

    // Question 6 — Sound & Acoustics
    Question(
        categoryId = 2,
        questionText = "Was sind Schallwellen?",
        answerA = "Sichtbare Lichtstrahlen",
        answerB = "Druckschwankungen, die sich durch ein Medium wie Luft oder Wasser fortbewegen",
        answerC = "Elektrische Impulse im Gehirn",
        answerD = "Magnetische Felder um einen Lautsprecher",
        correctAnswer = 1, // B
        explanation = "Schallwellen sind mechanische Wellen, die durch Druckschwankungen in einem Medium (Luft, Wasser, Festkörper) entstehen. Sie benötigen ein Medium zur Ausbreitung — im Vakuum gibt es keinen Schall.",
        difficulty = 1,
        funFact = "Im Weltraum kann man keinen Schall hören, weil dort kein Luftatmosphäre als Medium vorhanden ist. Der Hollywood-Satz 'Im Weltraum hört dich niemand schreien' ist physikalisch korrekt."
    ),

    // Question 7 — Sound & Acoustics
    Question(
        categoryId = 2,
        questionText = "Was ist ein Echo?",
        answerA = "Ein leiser Ton bei Windstille",
        answerB = "Die Reflexion von Schall an einer Fläche, wodurch man den Ton nochmals hört",
        answerC = "Ein besonders lauter Knall",
        answerD = "Das Summen in den Ohren nach einem lauten Konzert",
        correctAnswer = 1, // B
        explanation = "Ein Echo entsteht, wenn Schallwellen auf eine harte Fläche (z.B. Felswand, Gebäude) treffen und zurückgeworfen werden. Das Gehör nimmt den reflektierten Ton zeitversetzt wahr.",
        difficulty = 1,
        funFact = "Damit ein Echo wahrnehmbar ist, muss das reflektierende Hindernis mindestens 17 Meter entfernt sein — da das Gehirn Töne innerhalb von 1/10 Sekunde als gleichzeitig wahrnimmt."
    ),

    // Question 8 — Sound & Acoustics
    Question(
        categoryId = 2,
        questionText = "Was bestimmt die Tonhöhe eines Klangs?",
        answerA = "Die Lautstärke des Klangs",
        answerB = "Die Farbe der Schallquelle",
        answerC = "Die Frequenz — wie viele Schwingungen pro Sekunde",
        answerD = "Die Größe des Lautsprechers",
        correctAnswer = 2, // C
        explanation = "Die Tonhöhe wird durch die Frequenz bestimmt: Hohe Frequenz (viele Schwingungen pro Sekunde, gemessen in Hertz) ergibt einen hohen Ton, niedrige Frequenz einen tiefen Ton.",
        difficulty = 1,
        funFact = null
    ),

    // Question 9 — Sound & Acoustics
    Question(
        categoryId = 2,
        questionText = "In welcher Einheit wird die Lautstärke von Schall gemessen?",
        answerA = "Watt",
        answerB = "Hertz",
        answerC = "Meter",
        answerD = "Dezibel",
        correctAnswer = 3, // D
        explanation = "Lautstärke wird in Dezibel (dB) gemessen. Eine normale Unterhaltung hat etwa 60 dB, ein Düsenflugzeug beim Start etwa 130 dB.",
        difficulty = 1,
        funFact = "Ab 85 Dezibel kann dauerhafter Lärm das Gehör schädigen. Kopfhörer können bis zu 110 dB erzeugen — deshalb sollte man sie nicht zu laut stellen."
    ),

    // Question 10 — Sound & Acoustics
    Question(
        categoryId = 2,
        questionText = "Was ist Ultraschall?",
        answerA = "Sehr lauter Schall über 100 Dezibel",
        answerB = "Schall mit Frequenzen über 20.000 Hz, die Menschen nicht hören können",
        answerC = "Schall unter Wasser",
        answerD = "Schall, der sich schneller als Licht bewegt",
        correctAnswer = 1, // B
        explanation = "Ultraschall bezeichnet Schallwellen mit Frequenzen oberhalb des menschlichen Hörvermögens (über 20.000 Hz). Fledermäuse und Delfine nutzen Ultraschall zur Orientierung.",
        difficulty = 1,
        funFact = "Ärzte nutzen Ultraschall, um Babys im Mutterleib zu untersuchen — komplett ohne Strahlung, da es nur Schallwellen sind."
    ),

    // Question 11 — Chemistry in everyday life
    Question(
        categoryId = 2,
        questionText = "Warum reinigt Seife Schmutz und Fett?",
        answerA = "Weil Seife sehr heiß ist",
        answerB = "Weil Seifenmoleküle einen wasserlöslichen und einen fettlöslichen Teil haben",
        answerC = "Weil Seife Säure enthält",
        answerD = "Weil Seife Schmutz einfach abkratzt",
        correctAnswer = 1, // B
        explanation = "Seifenmoleküle haben zwei Enden: eines liebt Wasser (hydrophil), das andere liebt Fett (hydrophob). So umhüllen sie Fettteilchen und können mit dem Waschwasser weggespült werden.",
        difficulty = 1,
        funFact = "Die älteste bekannte Seifenrezeptur stammt aus dem Alten Babylon, etwa 2800 v. Chr. — sie bestand aus Tierfett und Holzasche."
    ),

    // Question 12 — Chemistry in everyday life
    Question(
        categoryId = 2,
        questionText = "Was ist Rost, der sich auf Eisen bildet?",
        answerA = "Schimmel auf der Metalloberfläche",
        answerB = "Eine Farbschicht aus Farbe",
        answerC = "Eisenoxid, das entsteht, wenn Eisen mit Sauerstoff und Wasser reagiert",
        answerD = "Eine Form von Kristall",
        correctAnswer = 2, // C
        explanation = "Rost (Eisenoxid, Fe₂O₃) entsteht durch die chemische Reaktion von Eisen mit Sauerstoff und Wasser. Dieser Prozess heißt Korrosion und zersetzt das Metall langsam.",
        difficulty = 1,
        funFact = null
    ),

    // Question 13 — Chemistry in everyday life
    Question(
        categoryId = 2,
        questionText = "Was passiert, wenn man Backpulver (Natron) mit Essig vermischt?",
        answerA = "Es entsteht eine explosive Mischung",
        answerB = "Nichts, die Stoffe reagieren nicht miteinander",
        answerC = "Es entsteht eine giftige Flüssigkeit",
        answerD = "Es schäumt auf, weil Kohlendioxidgas freigesetzt wird",
        correctAnswer = 3, // D
        explanation = "Backpulver (Natriumbicarbonat, eine Lauge) reagiert mit Essig (Essigsäure) in einer Säure-Base-Reaktion. Dabei entstehen Wasser, Natriumacetat und Kohlendioxid (CO₂), das die Bläschen erzeugt.",
        difficulty = 1,
        funFact = "Diese Reaktion nutzen Kinder für selbstgemachte Vulkane beim Schulprojekt — und Bäcker nutzen dasselbe Prinzip, damit Teig aufgeht."
    ),

    // Question 14 — Chemistry in everyday life
    Question(
        categoryId = 2,
        questionText = "Was misst der pH-Wert?",
        answerA = "Die Temperatur einer Flüssigkeit",
        answerB = "Den Säure- oder Basengehalt einer Lösung",
        answerC = "Die elektrische Leitfähigkeit",
        answerD = "Die Dichte einer Flüssigkeit",
        correctAnswer = 1, // B
        explanation = "Der pH-Wert misst, ob eine Lösung sauer (pH unter 7), neutral (pH 7) oder basisch/alkalisch (pH über 7) ist. Zitronensaft hat pH 2, Wasser pH 7, Seifenwasser pH 9-10.",
        difficulty = 1,
        funFact = "Unser Magen hat einen pH-Wert von 1-2 — damit ist die Magensäure etwa so sauer wie Batteriesäure und kann Metall auflösen."
    ),

    // Question 15 — Chemistry in everyday life
    Question(
        categoryId = 2,
        questionText = "Welcher Stoff macht Kohlensäuregetränke sprudelig?",
        answerA = "Sauerstoff",
        answerB = "Stickstoff",
        answerC = "Kohlendioxid (CO₂)",
        answerD = "Wasserstoff",
        correctAnswer = 2, // C
        explanation = "Kohlensäurehaltige Getränke werden unter Druck mit Kohlendioxid (CO₂) versetzt. Wenn die Flasche geöffnet wird, entweicht der Druck und das Gas perlt als Bläschen aus.",
        difficulty = 1,
        funFact = "Der Knall beim Öffnen einer Champagnerflasche entsteht durch das schlagartig entweichende CO₂, das im Flaschenhals einen Überdruck von bis zu 6 bar aufgebaut hat."
    ),

    // Question 16 — Insects & small creatures
    Question(
        categoryId = 2,
        questionText = "Wie viele Beine hat eine Ameise?",
        answerA = "4",
        answerB = "8",
        answerC = "6",
        answerD = "12",
        correctAnswer = 2, // C
        explanation = "Ameisen sind Insekten und haben wie alle Insekten genau 6 Beine. Sie haben außerdem einen dreigeteilten Körper (Kopf, Thorax, Abdomen) und Fühler.",
        difficulty = 1,
        funFact = "Ameisen können das 10- bis 50-fache ihres eigenen Körpergewichts tragen. Das entspräche einem Menschen, der einen kleinen Auto-Anhänger schleppt."
    ),

    // Question 17 — Insects & small creatures
    Question(
        categoryId = 2,
        questionText = "Wie nennt man das Wachs-Gebäude, in dem Bienen leben und Honig lagern?",
        answerA = "Bienenkorb",
        answerB = "Bienenwabe",
        answerC = "Bienennest",
        answerD = "Bienenstock",
        correctAnswer = 1, // B
        explanation = "Die Bienenwabe ist die sechseckige Struktur aus Bienenwachs, die Bienen bauen. Die sechseckige Form ist ideal, da sie maximalen Raum mit minimalem Materialaufwand schafft.",
        difficulty = 1,
        funFact = "Eine Biene muss ihr ganzes Leben lang fliegen, um aus dem gesammelten Nektar gerade einmal einen Teelöffel Honig zu produzieren."
    ),

    // Question 18 — Insects & small creatures
    Question(
        categoryId = 2,
        questionText = "Wie nennt man die Verwandlung einer Raupe in einen Schmetterling?",
        answerA = "Zellteilung",
        answerB = "Metamorphose",
        answerC = "Fotosynthese",
        answerD = "Evolution",
        correctAnswer = 1, // B
        explanation = "Die vollständige Verwandlung (holometabole Metamorphose) des Schmetterlings umfasst vier Stadien: Ei, Raupe (Larve), Puppe (Chrysalis) und adulter Schmetterling.",
        difficulty = 1,
        funFact = "Im Inneren der Puppe löst sich die Raupe fast vollständig auf — das Gewebe wird zu einer Art Brei, aus dem sich dann der Schmetterling neu aufbaut."
    ),

    // Question 19 — Insects & small creatures
    Question(
        categoryId = 2,
        questionText = "Was sind Käfer (Coleoptera)?",
        answerA = "Spinnentiere mit harter Schale",
        answerB = "Insekten mit einem Paar harter Deckflügel, die die weichen Flugflügel schützen",
        answerC = "Krebstiere, die an Land leben",
        answerD = "Würmer mit Beinen",
        correctAnswer = 1, // B
        explanation = "Käfer sind Insekten, die sich durch ihre harten Deckflügel (Elytren) auszeichnen. Sie sind die artenreichste Tierordnung der Erde mit über 400.000 bekannten Arten.",
        difficulty = 1,
        funFact = "Käfer machen etwa 25 % aller bekannten Tierarten aus. Der Biologe J.B.S. Haldane soll gesagt haben, Gott habe 'eine außerordentliche Vorliebe für Käfer'."
    ),

    // Question 20 — Insects & small creatures
    Question(
        categoryId = 2,
        questionText = "Was fressen Regenwürmer?",
        answerA = "Andere Würmer und kleine Insekten",
        answerB = "Blätter direkt von Pflanzen",
        answerC = "Abgestorbene organische Substanz und Erde",
        answerD = "Mineralien aus Steinen",
        correctAnswer = 2, // C
        explanation = "Regenwürmer ernähren sich von abgestorbenen Pflanzenresten (Laub, Humus) und der organischen Substanz in der Erde. Dabei durchpflügen und lockern sie den Boden.",
        difficulty = 1,
        funFact = "Ein einziger Regenwurm kann pro Jahr bis zu 10 Tonnen Erde pro Hektar umwälzen — Charles Darwin erkannte ihre Bedeutung für fruchtbare Böden und widmete ihnen sein letztes Buch."
    ),

    // Question 21 — Human body systems
    Question(
        categoryId = 2,
        questionText = "Was ist die Funktion der Muskeln im menschlichen Körper?",
        answerA = "Blut filtern",
        answerB = "Bewegung erzeugen durch Zusammenziehen und Entspannen",
        answerC = "Hormone produzieren",
        answerD = "Den Körper mit Sauerstoff versorgen",
        correctAnswer = 1, // B
        explanation = "Muskeln erzeugen Bewegung, indem sie sich zusammenziehen (kontrahieren). Der Mensch hat über 600 Muskeln, die zusammen etwa 40-50 % des Körpergewichts ausmachen.",
        difficulty = 1,
        funFact = "Das Zwerchfell ist der einzige Muskel, der nie schläft — es arbeitet pausenlos für die Atmung, solange man lebt."
    ),

    // Question 22 — Human body systems
    Question(
        categoryId = 2,
        questionText = "Was ist die wichtigste Funktion der Haut?",
        answerA = "Hormonspeicherung",
        answerB = "Blutproduktion",
        answerC = "Schutzbarriere gegen Austrocknung, Keime und äußere Einflüsse",
        answerD = "Sauerstoffproduktion",
        correctAnswer = 2, // C
        explanation = "Die Haut ist das größte Organ des Menschen und dient als äußere Schutzbarriere. Sie schützt vor Austrocknung, Keimen, UV-Strahlung und Verletzungen.",
        difficulty = 1,
        funFact = "Die Haut erneuert sich alle 3-4 Wochen vollständig. Der Hausstaub besteht zu einem großen Teil aus abgestorbenen Hautzellen."
    ),

    // Question 23 — Human body systems
    Question(
        categoryId = 2,
        questionText = "Woraus bestehen Haare beim Menschen?",
        answerA = "Aus lebenden Nervenzellen",
        answerB = "Aus einem Protein namens Keratin",
        answerC = "Aus Blutgefäßen und Kollagen",
        answerD = "Aus Muskelgewebe",
        correctAnswer = 1, // B
        explanation = "Haare bestehen hauptsächlich aus Keratin, einem harten Strukturprotein. Der sichtbare Teil des Haares (Haarschaft) besteht aus abgestorbenen Zellen.",
        difficulty = 1,
        funFact = "Ein einzelnes Haar kann bis zu 100 Gramm tragen. Ein voller Kopf Haare (ca. 100.000 Haare) könnte theoretisch das Gewicht von zwei Elefanten tragen."
    ),

    // Question 24 — Human body systems
    Question(
        categoryId = 2,
        questionText = "Was passiert in den Lungen?",
        answerA = "Blut wird gefiltert und gereinigt",
        answerB = "Nahrung wird verdaut",
        answerC = "Hormone werden produziert",
        answerD = "Sauerstoff wird ins Blut aufgenommen und Kohlendioxid abgegeben",
        correctAnswer = 3, // D
        explanation = "In den Lungen findet der Gasaustausch statt: Sauerstoff aus der eingeatmeten Luft geht ins Blut über, während Kohlendioxid aus dem Blut in die Luft abgegeben und ausgeatmet wird.",
        difficulty = 1,
        funFact = "Entfaltet man die gesamte innere Oberfläche der Lungen, hätte sie eine Fläche von etwa 70-100 Quadratmetern — so groß wie ein Tennisplatz."
    ),

    // Question 25 — Human body systems
    Question(
        categoryId = 2,
        questionText = "Woraus bestehen Fingernägel und Zehennägel?",
        answerA = "Aus Knochengewebe",
        answerB = "Aus verhärtetem Keratin",
        answerC = "Aus Fettgewebe",
        answerD = "Aus Bindegewebe und Kollagen",
        correctAnswer = 1, // B
        explanation = "Nägel bestehen wie Haare aus Keratin — einem harten, wasserunlöslichen Strukturprotein. Sie wachsen aus der Nagelwurzel heraus und sind abgestorbene Zellen.",
        difficulty = 1,
        funFact = null
    ),

    // Question 26 — Light & Color
    Question(
        categoryId = 2,
        questionText = "Wie entsteht ein Regenbogen?",
        answerA = "Durch Reflexion von Licht an Wolken",
        answerB = "Durch Brechung und Spiegelung von Sonnenlicht in Regentropfen",
        answerC = "Durch elektrische Entladungen in der Luft",
        answerD = "Durch das Mischen von Licht verschiedener Sterne",
        correctAnswer = 1, // B
        explanation = "Ein Regenbogen entsteht, wenn Sonnenlicht in Regentropfen eintritt, sich bricht, an der Rückseite reflektiert und beim Austreten erneut gebrochen wird. Dabei wird weißes Licht in seine Spektralfarben aufgefächert.",
        difficulty = 1,
        funFact = "Ein Regenbogen ist eigentlich ein vollständiger Kreis — wir sehen nur einen Bogen, weil der Horizont die untere Hälfte verdeckt. Vom Flugzeug aus kann man den vollen Kreis sehen."
    ),

    // Question 27 — Light & Color
    Question(
        categoryId = 2,
        questionText = "Was sind die drei additiven Grundfarben des Lichts?",
        answerA = "Rot, Gelb und Blau",
        answerB = "Rot, Grün und Blau",
        answerC = "Cyan, Magenta und Gelb",
        answerD = "Orange, Grün und Violett",
        correctAnswer = 1, // B
        explanation = "Die drei additiven Grundfarben des Lichts sind Rot, Grün und Blau (RGB). Mischung aller drei ergibt weißes Licht. Bildschirme nutzen dieses Prinzip.",
        difficulty = 1,
        funFact = null
    ),

    // Question 28 — Light & Color
    Question(
        categoryId = 2,
        questionText = "Wie entsteht ein Schatten?",
        answerA = "Wenn Licht durch Wasser geleitet wird",
        answerB = "Wenn ein undurchsichtiges Objekt Licht blockiert und eine dunkle Fläche dahinter entsteht",
        answerC = "Wenn Luft abkühlt und Licht bricht",
        answerD = "Durch elektrische Felder in der Luft",
        correctAnswer = 1, // B
        explanation = "Ein Schatten entsteht, wenn ein undurchsichtiger Körper Lichtstrahlen blockiert. Hinter dem Objekt trifft weniger oder kein Licht auf eine Fläche, was den Schatten erzeugt.",
        difficulty = 1,
        funFact = "Der Mond hat keinen eigenen Schatten, weil er kein eigenes Licht aussendet. Was wir als 'Mondlicht' wahrnehmen, ist reflektiertes Sonnenlicht."
    ),

    // Question 29 — Light & Color
    Question(
        categoryId = 2,
        questionText = "Was passiert, wenn Licht von einer glatten Spiegeloberfläche zurückgeworfen wird?",
        answerA = "Absorption",
        answerB = "Brechung",
        answerC = "Reflexion",
        answerD = "Beugung",
        correctAnswer = 2, // C
        explanation = "Wenn Licht auf eine glatte Fläche trifft und zurückgeworfen wird, nennt man das Reflexion. Bei einem glatten Spiegel wird das Licht geordnet reflektiert, sodass ein klares Bild entsteht.",
        difficulty = 1,
        funFact = "Der Mond leuchtet nicht selbst — er ist kein Stern, sondern reflektiert nur das Licht der Sonne. Er ist im Grunde ein riesiger, schwach reflektierender Spiegel."
    ),

    // Question 30 — Light & Color
    Question(
        categoryId = 2,
        questionText = "Was ist UV-Licht?",
        answerA = "Licht, das besonders langsam ist",
        answerB = "Licht mit einer Wellenlänge unterhalb des sichtbaren Violett, das für Menschen unsichtbar ist",
        answerC = "Licht, das nur unter Wasser sichtbar ist",
        answerD = "Licht aus künstlichen Quellen",
        correctAnswer = 1, // B
        explanation = "UV-Licht (ultraviolettes Licht) hat kürzere Wellenlängen als sichtbares Licht und ist für Menschen unsichtbar. Es stammt von der Sonne und kann Sonnenbrand und Hautschäden verursachen.",
        difficulty = 1,
        funFact = "Bienen können UV-Licht sehen! Viele Blüten haben UV-Muster, die für Menschen unsichtbar sind, aber Bienen zu Nektar und Pollen führen."
    ),

    // Question 31 — Dinosaurs & prehistoric life
    Question(
        categoryId = 2,
        questionText = "Was bedeutet das Wort 'Dinosaurier'?",
        answerA = "Schnelles Tier",
        answerB = "Schreckliche Eidechse",
        answerC = "Riesiges Reptil",
        answerD = "Uraltes Wesen",
        correctAnswer = 1, // B
        explanation = "Das Wort 'Dinosaurier' stammt vom griechischen 'deinos' (schrecklich, gewaltig) und 'sauros' (Eidechse). Der Begriff wurde 1842 vom Naturforscher Richard Owen geprägt.",
        difficulty = 1,
        funFact = null
    ),

    // Question 32 — Dinosaurs & prehistoric life
    Question(
        categoryId = 2,
        questionText = "Was ist ein Fossil?",
        answerA = "Ein lebender Dinosaurier in einem Zoo",
        answerB = "Die versteinerten Überreste oder Spuren eines einst lebenden Organismus",
        answerC = "Ein Gesteinsbrocken mit seltenem Mineral",
        answerD = "Ein Tier, das seit tausend Jahren unverändert lebt",
        correctAnswer = 1, // B
        explanation = "Fossilien sind versteinerte Überreste (Knochen, Schalen) oder Spuren (Fußabdrücke, Abdrücke) von Lebewesen, die vor langer Zeit gestorben sind und in Gestein eingebettet wurden.",
        difficulty = 1,
        funFact = "Das älteste bekannte Fossil ist ein Einzeller (Bakterie), der vor etwa 3,5 Milliarden Jahren lebte — also weit vor den Dinosauriern."
    ),

    // Question 33 — Dinosaurs & prehistoric life
    Question(
        categoryId = 2,
        questionText = "Welcher bekannte Dinosaurier hatte drei Hörner und eine große Nackenkrause?",
        answerA = "Stegosaurus",
        answerB = "Brachiosaurus",
        answerC = "Triceratops",
        answerD = "Ankylosaurus",
        correctAnswer = 2, // C
        explanation = "Der Triceratops ist einer der bekanntesten Dinosaurier mit drei Hörnern (tri = drei, keras = Horn) und einer großen knöchernen Nackenplatte. Er lebte vor etwa 68-66 Millionen Jahren.",
        difficulty = 1,
        funFact = "Triceratops-Fossilien sind sehr häufig — es ist einer der am häufigsten gefundenen Dinosaurier. Interessanterweise lebte er zeitgleich mit dem T-Rex und war wahrscheinlich seine Beute."
    ),

    // Question 34 — Dinosaurs & prehistoric life
    Question(
        categoryId = 2,
        questionText = "Wann starben die (nicht-vogelähnlichen) Dinosaurier aus?",
        answerA = "Vor etwa 10.000 Jahren",
        answerB = "Vor etwa 66 Millionen Jahren",
        answerC = "Vor etwa 250 Millionen Jahren",
        answerD = "Vor etwa 1 Million Jahren",
        correctAnswer = 1, // B
        explanation = "Die nicht-vogelähnlichen Dinosaurier starben vor etwa 66 Millionen Jahren aus, wahrscheinlich durch den Einschlag eines großen Asteroiden und die daraus folgende Klimakatastrophe.",
        difficulty = 1,
        funFact = "Vögel sind tatsächlich lebende Dinosaurier — sie sind die direkten Nachfahren der vogelähnlichen Dinosaurier (Therapoden) und überlebten das Massenaussterben."
    ),

    // Question 35 — Dinosaurs & prehistoric life
    Question(
        categoryId = 2,
        questionText = "Was ist eine Eiszeit?",
        answerA = "Ein Tag mit extremem Frost",
        answerB = "Ein langer Zeitraum, in dem große Teile der Erde von Gletschern bedeckt waren",
        answerC = "Eine Region nahe dem Nordpol",
        answerD = "Ein Phänomen auf anderen Planeten",
        correctAnswer = 1, // B
        explanation = "Eine Eiszeit ist ein geologischer Zeitraum mit dauerhaft niedrigen Temperaturen, bei dem Gletscher und Eisschilde große Teile der Erdoberfläche bedecken. Die letzte Eiszeit endete vor etwa 12.000 Jahren.",
        difficulty = 1,
        funFact = "Während der letzten Eiszeit war der Meeresspiegel bis zu 120 Meter niedriger als heute — Großbritannien war über eine Landbrücke mit dem europäischen Festland verbunden."
    ),

    // Question 36 — Renewable Energy
    Question(
        categoryId = 2,
        questionText = "Wie erzeugen Solarpanele Strom?",
        answerA = "Durch Verbrennung von Sonnenlicht",
        answerB = "Durch Umwandlung von Sonnenlicht direkt in elektrischen Strom über den photovoltaischen Effekt",
        answerC = "Durch Aufheizen von Wasser zu Dampf",
        answerD = "Durch Anziehung von Magnetfeldern",
        correctAnswer = 1, // B
        explanation = "Solarzellen nutzen den photovoltaischen Effekt: Wenn Licht auf Halbleitermaterial (meist Silizium) trifft, werden Elektronen in Bewegung versetzt und erzeugen so Gleichstrom.",
        difficulty = 1,
        funFact = "Die Sahara-Wüste bekommt jährlich so viel Sonnenlicht, dass selbst ein kleiner Bruchteil dieser Fläche mit Solarpanelen den weltweiten Strombedarf decken könnte."
    ),

    // Question 37 — Renewable Energy
    Question(
        categoryId = 2,
        questionText = "Wie erzeugt ein Windrad (Windturbine) Strom?",
        answerA = "Durch Verbrennung von Wind",
        answerB = "Durch Sonnenlicht auf die Flügel",
        answerC = "Wind dreht die Rotorblätter, die einen Generator antreiben",
        answerD = "Durch Wärmeunterschiede zwischen Luft und Boden",
        correctAnswer = 2, // C
        explanation = "Wind dreht die Rotorblätter einer Windturbine. Diese Drehbewegung treibt einen Generator an, der mechanische Energie in elektrische Energie umwandelt.",
        difficulty = 1,
        funFact = "Ein einziges modernes Offshore-Windrad kann genug Strom erzeugen, um 1.000 bis 2.000 Haushalte mit Energie zu versorgen."
    ),

    // Question 38 — Renewable Energy
    Question(
        categoryId = 2,
        questionText = "Was ist Wasserkraft?",
        answerA = "Strom aus Salzwasser durch Elektrolyse",
        answerB = "Erzeugung von Strom durch die Strömungsenergie oder Fallenergie von Wasser",
        answerC = "Nutzung von Meerestemperatur für Energie",
        answerD = "Kühlung von Kraftwerken mit Flusswasser",
        correctAnswer = 1, // B
        explanation = "Wasserkraft nutzt die Energie von fließendem oder fallendem Wasser. Staudämme leiten Wasser durch Turbinen, die Generatoren antreiben und Strom erzeugen.",
        difficulty = 1,
        funFact = "Wasserkraft ist die älteste erneuerbare Energiequelle — Wasserräder wurden schon im Altertum genutzt. Heute ist Wasserkraft weltweit die größte erneuerbare Stromquelle."
    ),

    // Question 39 — Renewable Energy
    Question(
        categoryId = 2,
        questionText = "Was ist Geothermie?",
        answerA = "Energie aus dem Sonnensystem",
        answerB = "Strom aus der Bewegung von Planeten",
        answerC = "Nutzung der Erdwärme aus dem Inneren der Erde",
        answerD = "Energie aus dem Golfstrom",
        correctAnswer = 2, // C
        explanation = "Geothermie nutzt die Wärme aus dem Inneren der Erde. In vulkanisch aktiven Regionen (Island, Neuseeland) kann heißes Wasser oder Dampf direkt zur Stromerzeugung oder Heizung genutzt werden.",
        difficulty = 1,
        funFact = "Island deckt über 66 % seines gesamten Energiebedarfs mit Geothermie und Wasserkraft — einer der weltweit höchsten Anteile erneuerbarer Energien überhaupt."
    ),

    // Question 40 — Renewable Energy
    Question(
        categoryId = 2,
        questionText = "Was ist Biomasse als Energiequelle?",
        answerA = "Energie aus Kernspaltung von Pflanzen",
        answerB = "Nutzung von organischen Materialien wie Holz, Pflanzen oder Abfällen als Energieträger",
        answerC = "Strom aus Tierbewegungen",
        answerD = "Energie aus dem Abbau von Steinkohle",
        correctAnswer = 1, // B
        explanation = "Biomasse umfasst organische Materialien wie Holz, Pflanzenreste, Tierdung oder Abfälle, die verbrannt oder vergärt werden, um Wärme oder Strom zu erzeugen.",
        difficulty = 1,
        funFact = null
    ),

    // Question 41 — Earth facts
    Question(
        categoryId = 2,
        questionText = "Wie viele Kontinente hat die Erde?",
        answerA = "5",
        answerB = "6",
        answerC = "7",
        answerD = "8",
        correctAnswer = 2, // C
        explanation = "Die Erde hat 7 Kontinente: Afrika, Antarktika, Asien, Australien/Ozeanien, Europa, Nordamerika und Südamerika. In manchen Modellen werden Europa und Asien als Eurasien zusammengefasst.",
        difficulty = 1,
        funFact = "Vor etwa 250 Millionen Jahren bildeten alle heutigen Kontinente einen einzigen riesigen Superkontinent namens Pangäa, bevor er auseinanderbrach."
    ),

    // Question 42 — Earth facts
    Question(
        categoryId = 2,
        questionText = "Was ist der Äquator?",
        answerA = "Der nördlichste Punkt der Erde",
        answerB = "Die Grenzlinie zwischen zwei Ozeanen",
        answerC = "Der tiefste Punkt des Meeresbodens",
        answerD = "Ein imaginärer Kreis um die Erde, der sie in nördliche und südliche Halbkugel teilt",
        correctAnswer = 3, // D
        explanation = "Der Äquator ist ein gedachter Kreis um die Erde, der sie in die Nord- und Südhalbkugel teilt. Er liegt bei 0° geographischer Breite und ist der längste Breitenkreis.",
        difficulty = 1,
        funFact = "Am Äquator ist man durch die Erdrotation mit einer Geschwindigkeit von 1.674 km/h unterwegs — ohne es zu merken."
    ),

    // Question 43 — Earth facts
    Question(
        categoryId = 2,
        questionText = "Wie lange braucht die Erde für eine vollständige Drehung um ihre eigene Achse?",
        answerA = "12 Stunden",
        answerB = "24 Stunden (einen Tag)",
        answerC = "365 Tage",
        answerD = "7 Tage",
        correctAnswer = 1, // B
        explanation = "Die Erde dreht sich einmal in etwa 24 Stunden (genauer: 23 Stunden, 56 Minuten und 4 Sekunden) um ihre eigene Achse. Diese Rotation verursacht den Wechsel von Tag und Nacht.",
        difficulty = 1,
        funFact = "Vor 1,4 Milliarden Jahren war ein Erdtag nur etwa 18 Stunden lang. Die Erdrotation verlangsamt sich durch die Anziehung des Mondes langsam — um etwa 1,4 Millisekunden pro Jahrhundert."
    ),

    // Question 44 — Earth facts
    Question(
        categoryId = 2,
        questionText = "Was sind die Pole der Erde?",
        answerA = "Die heißesten Punkte der Erde",
        answerB = "Die nördlichsten und südlichsten Punkte der Erdachse",
        answerC = "Die flachsten Stellen der Ozeane",
        answerD = "Die Enden des Äquators",
        correctAnswer = 1, // B
        explanation = "Der Nord- und Südpol sind die beiden Endpunkte der Erdachse, um die sich die Erde dreht. Am Nordpol liegt das arktische Eismeer, am Südpol der Kontinent Antarktika.",
        difficulty = 1,
        funFact = null
    ),

    // Question 45 — Earth facts
    Question(
        categoryId = 2,
        questionText = "Was erzeugt das Magnetfeld der Erde?",
        answerA = "Die Sonne",
        answerB = "Strömungen aus flüssigem Eisen im äußeren Erdkern",
        answerC = "Die Rotation des Mondes",
        answerD = "Elektrische Stürme in der Atmosphäre",
        correctAnswer = 1, // B
        explanation = "Das Erdmagnetfeld entsteht durch elektrische Ströme in der flüssigen Eisenschmelze des äußeren Erdkerns. Es schützt die Erde vor dem schädlichen Sonnenwind.",
        difficulty = 1,
        funFact = "Das Magnetfeld der Erde hat sich im Laufe der Erdgeschichte schon hunderte Male umgekehrt — der Nordpol war also manchmal dort, wo heute der Südpol ist."
    ),

    // Question 46 — Basic Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist ein Atom?",
        answerA = "Die kleinste nicht weiter teilbare Einheit der Materie",
        answerB = "Ein Verbund aus mehreren Elementen",
        answerC = "Der Kern eines Moleküls",
        answerD = "Ein Gas bei Zimmertemperatur",
        correctAnswer = 0, // A
        explanation = "Ein Atom ist die kleinste Einheit eines chemischen Elements, die noch die Eigenschaften dieses Elements besitzt. Atome bestehen aus einem Kern (Protonen, Neutronen) und einer Hülle aus Elektronen.",
        difficulty = 1,
        funFact = "Ein Atom besteht zu über 99,9 % aus leerem Raum. Wenn der Atomkern so groß wie ein Fußball wäre, würden die Elektronen in einem Radius von mehreren Kilometern darum kreisen."
    ),

    // Question 47 — Basic Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist ein Molekül?",
        answerA = "Ein einzelnes Element im Periodensystem",
        answerB = "Zwei oder mehr miteinander verbundene Atome",
        answerC = "Der Kern eines Atoms",
        answerD = "Eine radioaktive Substanz",
        correctAnswer = 1, // B
        explanation = "Ein Molekül besteht aus zwei oder mehr Atomen, die durch chemische Bindungen zusammengehalten werden. Wasser (H₂O) ist ein Molekül aus zwei Wasserstoff- und einem Sauerstoffatom.",
        difficulty = 1,
        funFact = null
    ),

    // Question 48 — Basic Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist das Periodensystem?",
        answerA = "Eine Tabelle aller bekannten chemischen Elemente, geordnet nach ihrer Ordnungszahl",
        answerB = "Eine Liste aller chemischen Reaktionen",
        answerC = "Eine Karte aller Mineralien der Erde",
        answerD = "Ein System zur Messung von Temperaturen",
        correctAnswer = 0, // A
        explanation = "Das Periodensystem (Periodensystem der Elemente, PSE) ordnet alle bekannten chemischen Elemente nach ihrer Ordnungszahl (Anzahl der Protonen) und gruppiert Elemente mit ähnlichen Eigenschaften.",
        difficulty = 1,
        funFact = "Dmitri Mendelejew entwarf 1869 das erste Periodensystem und ließ Lücken für noch unentdeckte Elemente — er sagte ihre Eigenschaften erstaunlich genau voraus, bevor sie entdeckt wurden."
    ),

    // Question 49 — Basic Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen einem Gemisch und einer chemischen Verbindung?",
        answerA = "Es gibt keinen Unterschied",
        answerB = "In einem Gemisch sind Stoffe nur vermischt, in einer Verbindung sind Atome chemisch gebunden",
        answerC = "Verbindungen sind immer flüssig, Gemische immer fest",
        answerD = "Gemische bestehen aus einem einzigen Element, Verbindungen aus vielen",
        correctAnswer = 1, // B
        explanation = "In einem Gemisch (z.B. Salzwasser) sind Stoffe physikalisch vermischt und können getrennt werden. In einer chemischen Verbindung (z.B. Wasser, H₂O) sind Atome fest chemisch gebunden.",
        difficulty = 1,
        funFact = "Luft ist ein Gemisch aus Stickstoff, Sauerstoff und anderen Gasen. Da sie kein festes Verhältnis hat und ihre Bestandteile getrennt werden können, ist sie kein chemischer Stoff."
    ),

    // Question 50 — Basic Chemistry
    Question(
        categoryId = 2,
        questionText = "Wie nennt man den Übergang von fest zu gasförmig ohne den flüssigen Zustand?",
        answerA = "Schmelzen",
        answerB = "Verdunsten",
        answerC = "Kondensation",
        answerD = "Sublimation",
        correctAnswer = 3, // D
        explanation = "Sublimation bezeichnet den direkten Übergang eines Stoffs vom festen in den gasförmigen Zustand, ohne dabei flüssig zu werden. Trockeneis (festes CO₂) sublimiert bei Raumtemperatur.",
        difficulty = 1,
        funFact = "Mottenkugeln aus Naphthalin sublimieren langsam bei Raumtemperatur — deshalb verschwinden sie mit der Zeit, ohne eine Flüssigkeit zu hinterlassen."
    ),

)
