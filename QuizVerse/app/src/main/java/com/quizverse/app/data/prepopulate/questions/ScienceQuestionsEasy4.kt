package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsEasy4(): List<Question> = listOf(

    // Question 1 — Space Technology
    Question(
        categoryId = 2,
        questionText = "Wie nennt man das bemannte Raumfahrtlabor, das seit dem Jahr 2000 ständig besetzt ist?",
        answerA = "Hubble-Teleskop",
        answerB = "Internationale Raumstation (ISS)",
        answerC = "Apollo-Kapsel",
        answerD = "Voyager-Sonde",
        correctAnswer = 1, // B
        explanation = "Die Internationale Raumstation (ISS) ist ein Raumfahrtlabor im Erdorbit, das seit November 2000 ununterbrochen von Astronauten bewohnt wird. Sie umkreist die Erde in etwa 400 km Höhe.",
        difficulty = 1,
        funFact = "Die ISS ist so groß wie ein Fußballfeld und fliegt mit etwa 28.000 km/h — das ist 23 Mal schneller als ein Schallflugzeug!"
    ),

    // Question 2 — Space Technology
    Question(
        categoryId = 2,
        questionText = "Welcher Planet wurde von mehreren Rovern erkundet, die auf seiner Oberfläche fuhren?",
        answerA = "Jupiter",
        answerB = "Venus",
        answerC = "Mars",
        answerD = "Saturn",
        correctAnswer = 2, // C
        explanation = "Der Mars wurde von mehreren NASA-Rovern erkundet, darunter Sojourner (1997), Spirit und Opportunity (2004) sowie Curiosity (seit 2012) und Perseverance (seit 2021). Sie suchen nach Spuren früheren Lebens.",
        difficulty = 1,
        funFact = null
    ),

    // Question 3 — Space Technology
    Question(
        categoryId = 2,
        questionText = "Wofür werden Satelliten im Erdorbit hauptsächlich verwendet?",
        answerA = "Zum Abbau von Rohstoffen im Weltall",
        answerB = "Als Tankstellen für Raumschiffe",
        answerC = "Für Kommunikation, Navigation und Wetterbeobachtung",
        answerD = "Als Wohnstationen für Astronauten",
        correctAnswer = 2, // C
        explanation = "Satelliten dienen hauptsächlich der Telekommunikation (z.B. Telefon, Internet), der Navigation (GPS), der Wettervorhersage und der Erdbeobachtung. Sie sind unverzichtbar für unser modernes Leben.",
        difficulty = 1,
        funFact = "GPS nutzt mindestens 24 Satelliten gleichzeitig. Dein Smartphone berechnet deinen Standort, indem es die Signale von mindestens vier davon misst."
    ),

    // Question 4 — Space Technology
    Question(
        categoryId = 2,
        questionText = "Was müssen Astronauten anziehen, wenn sie die Raumstation für einen Außeneinsatz verlassen?",
        answerA = "Einen Taucheranzug",
        answerB = "Einen Raumanzug",
        answerC = "Eine Thermojacke",
        answerD = "Einen Feuerschutzanzug",
        correctAnswer = 1, // B
        explanation = "Ein Raumanzug (EVA-Anzug) schützt Astronauten bei Weltraumausstiegen vor dem Vakuum, extremen Temperaturen (-150°C bis +120°C), kosmischer Strahlung und Mikrometeoriten. Er ist wie ein kleines Raumschiff zum Anziehen.",
        difficulty = 1,
        funFact = null
    ),

    // Question 5 — Space Technology
    Question(
        categoryId = 2,
        questionText = "Womit werden Raketen angetrieben, um in den Weltraum zu gelangen?",
        answerA = "Mit Benzin wie ein Auto",
        answerB = "Mit Druckluft wie ein Luftballon",
        answerC = "Mit Treibstoff, der beim Verbrennen gewaltige Schubkraft erzeugt",
        answerD = "Mit Solarpanelen",
        correctAnswer = 2, // C
        explanation = "Raketen verbrennen großen Mengen Treibstoff (meist flüssigen Wasserstoff und Sauerstoff oder feste Brennstoffe). Die heißen Gase werden nach hinten ausgestoßen und erzeugen nach dem Rückstoßprinzip enormen Schub nach vorne.",
        difficulty = 1,
        funFact = "Eine Saturn-V-Rakete (Mondrakete) verbrauchte in den ersten Sekunden mehr Treibstoff als ein Transatlantikflug eines Jumbo-Jets!"
    ),

    // Question 6 — Medical basics
    Question(
        categoryId = 2,
        questionText = "Was bewirkt eine Impfung im menschlichen Körper?",
        answerA = "Sie tötet alle Bakterien im Blut ab",
        answerB = "Sie trainiert das Immunsystem, einen Krankheitserreger zu erkennen und zu bekämpfen",
        answerC = "Sie ersetzt das natürliche Immunsystem",
        answerD = "Sie erhöht die Körpertemperatur dauerhaft",
        correctAnswer = 1, // B
        explanation = "Eine Impfung enthält abgeschwächte oder abgetötete Erreger bzw. Teile davon. Das Immunsystem lernt so, diese zu erkennen und bildet Antikörper. Bei einem späteren Kontakt mit dem echten Erreger ist der Körper vorbereitet.",
        difficulty = 1,
        funFact = "Die erste Impfung entwickelte Edward Jenner 1796 gegen Pocken — er verwendete dabei das harmlosere Kuhpockenvirus. Das Wort 'Vakzin' kommt vom lateinischen 'vacca' (Kuh)."
    ),

    // Question 7 — Medical basics
    Question(
        categoryId = 2,
        questionText = "Was kann man mit einem Röntgenbild im menschlichen Körper sichtbar machen?",
        answerA = "Nur Tumoren und Krebs",
        answerB = "Nur Blutgefäße",
        answerC = "Vor allem Knochen und dichte Strukturen",
        answerD = "Nur Muskeln und Fettgewebe",
        correctAnswer = 2, // C
        explanation = "Röntgenstrahlen durchdringen den Körper, werden aber von dichten Strukturen wie Knochen stärker absorbiert. Dadurch erscheinen Knochen hell auf dem Röntgenbild. Es ist ideal zum Erkennen von Knochenbrüchen.",
        difficulty = 1,
        funFact = null
    ),

    // Question 8 — Medical basics
    Question(
        categoryId = 2,
        questionText = "Womit hört ein Arzt den Herzschlag und die Atemgeräusche eines Patienten ab?",
        answerA = "Mit einem Thermometer",
        answerB = "Mit einem Blutdruckmessgerät",
        answerC = "Mit einem Stethoskop",
        answerD = "Mit einem Ultraschallgerät",
        correctAnswer = 2, // C
        explanation = "Das Stethoskop ist ein Abhörgerät, das Körpergeräusche wie Herzschlag, Atemgeräusche und Darmgeräusche verstärkt und an die Ohren des Arztes weiterleitet. Es wurde 1816 von René Laennec erfunden.",
        difficulty = 1,
        funFact = "René Laennec erfand das Stethoskop, weil er es unhöflich fand, sein Ohr direkt auf die Brust einer Patientin zu legen — er rollte stattdessen ein Blatt Papier zu einer Röhre!"
    ),

    // Question 9 — Medical basics
    Question(
        categoryId = 2,
        questionText = "Was misst ein Blutdruckmessgerät?",
        answerA = "Den Zuckergehalt im Blut",
        answerB = "Den Druck, mit dem das Herz das Blut durch die Adern pumpt",
        answerC = "Die Anzahl der roten Blutkörperchen",
        answerD = "Die Fließgeschwindigkeit des Blutes",
        correctAnswer = 1, // B
        explanation = "Der Blutdruck beschreibt den Druck, den das Blut auf die Wände der Blutgefäße ausübt. Er wird in zwei Werten angegeben: dem systolischen (Herz pumpt) und dem diastolischen (Herz entspannt). Normal ist etwa 120/80 mmHg.",
        difficulty = 1,
        funFact = null
    ),

    // Question 10 — Medical basics
    Question(
        categoryId = 2,
        questionText = "Wie misst man die Körpertemperatur eines Menschen?",
        answerA = "Mit einem Barometer",
        answerB = "Mit einem Thermometer",
        answerC = "Mit einem Manometer",
        answerD = "Mit einem Hygrometer",
        correctAnswer = 1, // B
        explanation = "Die Körpertemperatur wird mit einem Thermometer gemessen. Die normale Körpertemperatur liegt bei etwa 36,5 bis 37,5 Grad Celsius. Ab 38°C spricht man von Fieber, was oft auf eine Infektion hinweist.",
        difficulty = 1,
        funFact = "Das erste zuverlässige medizinische Thermometer wurde 1714 von Gabriel Fahrenheit erfunden — er verwendete Quecksilber. Moderne Fieberthermometer sind digital und messen in Sekunden."
    ),

    // Question 11 — Magnetism
    Question(
        categoryId = 2,
        questionText = "Welche Materialien werden von einem Magneten angezogen?",
        answerA = "Holz und Plastik",
        answerB = "Glas und Keramik",
        answerC = "Eisen, Nickel und Kobalt",
        answerD = "Aluminium und Kupfer",
        correctAnswer = 2, // C
        explanation = "Magnete ziehen ferromagnetische Materialien an: vor allem Eisen, aber auch Nickel und Kobalt. Metalle wie Aluminium, Kupfer oder Gold werden nicht von Magneten angezogen.",
        difficulty = 1,
        funFact = "Ein Kühlschrankmagnet hält dank Magnetismus — doch das verwendete Ferrit ist so schwach, dass er nur einige Gramm tragen kann. Industriemagnete aus Neodym können das Tausendfache heben!"
    ),

    // Question 12 — Magnetism
    Question(
        categoryId = 2,
        questionText = "Wie nennt man das Gerät, das mithilfe des Erdmagnetfelds die Himmelsrichtung anzeigt?",
        answerA = "Barometer",
        answerB = "Sextant",
        answerC = "Kompass",
        answerD = "Theodolith",
        correctAnswer = 2, // C
        explanation = "Ein Kompass nutzt das Erdmagnetfeld: Seine Nadel ist ein kleiner Magnet, der sich immer zum magnetischen Nordpol der Erde ausrichtet. So kann man immer die Himmelsrichtung bestimmen.",
        difficulty = 1,
        funFact = null
    ),

    // Question 13 — Magnetism
    Question(
        categoryId = 2,
        questionText = "Was passiert, wenn man zwei gleiche Magnetpole (z.B. Nord und Nord) aneinander hält?",
        answerA = "Sie ziehen sich stark an",
        answerB = "Sie stoßen sich ab",
        answerC = "Nichts passiert",
        answerD = "Sie verschmelzen zu einem Magneten",
        correctAnswer = 1, // B
        explanation = "Gleichnamige Magnetpole stoßen sich ab (Nord-Nord oder Süd-Süd). Ungleichnamige Pole ziehen sich an (Nord-Süd). Diese Regel gilt für alle Magnete — auch für die Pole der Erde.",
        difficulty = 1,
        funFact = "Magnetschwebezüge (Maglev) nutzen genau dieses Prinzip: Gleichnamige Pole stoßen sich ab und heben den Zug über die Schiene — komplett berührungslos und deshalb extrem schnell!"
    ),

    // Question 14 — Magnetism
    Question(
        categoryId = 2,
        questionText = "Was entsteht, wenn elektrischer Strom durch eine Spule aus Draht fließt?",
        answerA = "Ein Laser",
        answerB = "Ein Elektromagnet",
        answerC = "Eine chemische Reaktion",
        answerD = "Ultraschall",
        correctAnswer = 1, // B
        explanation = "Fließt Strom durch eine Drahtspule, entsteht ein Magnetfeld — ein sogenannter Elektromagnet. Seine Stärke lässt sich durch mehr Windungen oder mehr Strom erhöhen. Wird der Strom abgeschaltet, verschwindet das Magnetfeld.",
        difficulty = 1,
        funFact = null
    ),

    // Question 15 — Magnetism
    Question(
        categoryId = 2,
        questionText = "Wie viele Pole hat ein gewöhnlicher Stabmagnet?",
        answerA = "Einen",
        answerB = "Drei",
        answerC = "Zwei (Nord- und Südpol)",
        answerD = "Keinen — er zieht überall gleich an",
        correctAnswer = 2, // C
        explanation = "Jeder Magnet hat genau zwei Pole: einen Nordpol und einen Südpol. Interessanterweise hat auch die Erde ein Magnetfeld mit zwei Polen, weshalb ein Kompass funktioniert.",
        difficulty = 1,
        funFact = "Teilt man einen Magneten in zwei Hälften, entstehen KEINE einzelnen Pole — beide Hälften haben wieder je einen Nord- und Südpol. Man kann einen Magneten nicht in Einzelpole teilen!"
    ),

    // Question 16 — Water animals
    Question(
        categoryId = 2,
        questionText = "Zu welcher Tiergruppe gehören Delfine?",
        answerA = "Fische",
        answerB = "Reptilien",
        answerC = "Säugetiere",
        answerD = "Amphibien",
        correctAnswer = 2, // C
        explanation = "Delfine sind Meeressäugetiere. Sie atmen Luft mit Lungen (nicht mit Kiemen), gebären lebende Junge und säugen diese mit Muttermilch. Sie müssen regelmäßig auftauchen, um zu atmen.",
        difficulty = 1,
        funFact = "Delfine schlafen mit nur einer Gehirnhälfte — die andere bleibt wach, damit sie zum Atmen auftauchen können. Dieses Phänomen heißt unihemisphärischer Schlaf."
    ),

    // Question 17 — Water animals
    Question(
        categoryId = 2,
        questionText = "Was ist der Hai von Natur aus?",
        answerA = "Ein Meeressäuger",
        answerB = "Ein Knorpelfisch",
        answerC = "Ein Reptil",
        answerD = "Ein Weichtier",
        correctAnswer = 1, // B
        explanation = "Haie sind Knorpelfische — ihr Skelett besteht nicht aus Knochen, sondern aus elastischem Knorpel. Sie gehören zu den ältesten Wirbeltieren der Erde und existieren seit über 400 Millionen Jahren.",
        difficulty = 1,
        funFact = null
    ),

    // Question 18 — Water animals
    Question(
        categoryId = 2,
        questionText = "Wie viele Arme hat ein Tintenfisch (Oktopus)?",
        answerA = "Vier",
        answerB = "Sechs",
        answerC = "Acht",
        answerD = "Zehn",
        correctAnswer = 2, // C
        explanation = "Ein Oktopus (auch Tintenfisch genannt) hat genau acht Arme, die mit Saugnäpfen besetzt sind. Der Name 'Okto' kommt aus dem Griechischen und bedeutet 'acht'. Kalmare hingegen haben zehn Tentakel.",
        difficulty = 1,
        funFact = "Ein Oktopus hat drei Herzen und blaues Blut! Das blaue Blut enthält Hämocyanin (mit Kupfer) statt Hämoglobin (mit Eisen) — das transportiert Sauerstoff in kaltem Wasser besser."
    ),

    // Question 19 — Water animals
    Question(
        categoryId = 2,
        questionText = "Was ist besonders am Seepferdchen unter den Fischen?",
        answerA = "Es kann fliegen",
        answerB = "Beim Seepferdchen trägt das Männchen die Jungen aus",
        answerC = "Es lebt an Land und im Wasser",
        answerD = "Es hat kein Skelett",
        correctAnswer = 1, // B
        explanation = "Das Seepferdchen ist das einzige Tier, bei dem das Männchen schwanger wird. Das Weibchen legt ihre Eier in den Brutbeutel des Männchens, das die Jungen austrägt und gebiert — bis zu 2.000 Junge auf einmal!",
        difficulty = 1,
        funFact = null
    ),

    // Question 20 — Water animals
    Question(
        categoryId = 2,
        questionText = "Aus was besteht eine Qualle hauptsächlich?",
        answerA = "Aus Fett",
        answerB = "Aus Wasser (bis zu 95%)",
        answerC = "Aus Muskeln",
        answerD = "Aus Knorpel",
        correctAnswer = 1, // B
        explanation = "Quallen bestehen zu bis zu 95% aus Wasser. Sie haben kein Gehirn, kein Herz und keine Knochen. Trotzdem können sie mit ihren Tentakeln brennen und Beute lähmen — mit spezialisierten Nesselzellen.",
        difficulty = 1,
        funFact = "Die unsterbliche Qualle (Turritopsis dohrnii) kann sich nach dem Altern wieder in ihr jugendliches Stadium zurückverwandeln — als einziges bekanntes Tier kann sie ihren Lebenszyklus umkehren!"
    ),

    // Question 21 — Trees & Forests
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Laubbaum von einem Nadelbaum?",
        answerA = "Laubbäume sind immer kleiner als Nadelbäume",
        answerB = "Laubbäume werfen im Herbst ihre Blätter ab, Nadelbäume behalten meist ihre Nadeln",
        answerC = "Laubbäume wachsen nur in warmen Ländern",
        answerD = "Nadelbäume haben keine Früchte",
        correctAnswer = 1, // B
        explanation = "Die meisten Laubbäume (wie Eiche, Buche, Ahorn) sind Laubbäume, die im Herbst ihr Laub abwerfen. Nadelbäume (wie Fichte, Kiefer, Tanne) sind meist immergrün und behalten ihre Nadeln das ganze Jahr — eine Anpassung an Kälte.",
        difficulty = 1,
        funFact = null
    ),

    // Question 22 — Trees & Forests
    Question(
        categoryId = 2,
        questionText = "Was verraten die Jahresringe im Querschnitt eines Baumstammes?",
        answerA = "Die Art des Baumes",
        answerB = "Das Alter des Baumes",
        answerC = "Die Höhe des Baumes",
        answerD = "Wie viel Wasser der Baum braucht",
        correctAnswer = 1, // B
        explanation = "Jedes Jahr bildet ein Baum einen neuen Ring aus hellem Frühlingsholz und dunklem Sommerholz. Die Gesamtzahl der Ringe entspricht dem Alter des Baumes. Breite Ringe zeigen gute Wachstumsjahre, schmale Ringe schwierige.",
        difficulty = 1,
        funFact = "Die Wissenschaft des Datierens mithilfe von Jahresringen heißt Dendrochronologie. Mit ihr können Historiker das Fälldatum von Bauholz in alten Gebäuden auf das Jahr genau bestimmen."
    ),

    // Question 23 — Trees & Forests
    Question(
        categoryId = 2,
        questionText = "Was ist der Regenwald besonders wichtig für unsere Erde?",
        answerA = "Er ist die Heimat aller Sandwüsten",
        answerB = "Er produziert riesige Mengen Sauerstoff und beherbergt die meiste Artenvielfalt",
        answerC = "Er ist die einzige Quelle für Trinkwasser",
        answerD = "Er verhindert Erdbeben",
        correctAnswer = 1, // B
        explanation = "Der Regenwald, besonders der Amazonas, wird oft als 'Lunge der Erde' bezeichnet, weil er enorme Mengen CO₂ aufnimmt und Sauerstoff produziert. Er beherbergt über 50% aller Tier- und Pflanzenarten der Welt auf nur 6% der Landfläche.",
        difficulty = 1,
        funFact = null
    ),

    // Question 24 — Trees & Forests
    Question(
        categoryId = 2,
        questionText = "Welcher Baum gilt als der größte (höchste) Baum der Welt?",
        answerA = "Der Affenbrotbaum (Baobab)",
        answerB = "Der Küstenmammutbaum (Sequoia sempervirens)",
        answerC = "Die Zeder",
        answerD = "Der Eukalyptus",
        correctAnswer = 1, // B
        explanation = "Der Küstenmammutbaum (Coastal Redwood, Sequoia sempervirens) ist der höchste Baum der Welt. Das Exemplar 'Hyperion' in Kalifornien misst über 115 Meter — das ist so hoch wie ein 38-stöckiges Hochhaus!",
        difficulty = 1,
        funFact = "Der größte Baum nach Volumen ist der Riesenmammutbaum 'General Sherman' in Kalifornien. Er wiegt schätzungsweise 1.385 Tonnen — mehr als 200 Elefanten zusammen!"
    ),

    // Question 25 — Trees & Forests
    Question(
        categoryId = 2,
        questionText = "Was passiert mit der Fotosynthese eines Laubbaums im Winter?",
        answerA = "Sie läuft schneller, weil es kälter ist",
        answerB = "Sie hört fast auf, weil die Blätter fehlen und es weniger Licht gibt",
        answerC = "Sie verlagert sich in die Wurzeln",
        answerD = "Sie findet weiterhin in der Rinde statt",
        correctAnswer = 1, // B
        explanation = "Laubbäume werfen im Herbst ihre Blätter ab und stellen die Fotosynthese weitgehend ein. Ohne Blätter gibt es keine Oberfläche mehr für die Fotosynthese. Der Baum lebt von gespeicherten Nährstoffen bis zum nächsten Frühling.",
        difficulty = 1,
        funFact = null
    ),

    // Question 26 — Inventions
    Question(
        categoryId = 2,
        questionText = "Wer erfand das Teleskop, mit dem er als einer der Ersten den Sternenhimmel systematisch beobachtete?",
        answerA = "Isaac Newton",
        answerB = "Galileo Galilei",
        answerC = "Albert Einstein",
        answerD = "Nikolaus Kopernikus",
        correctAnswer = 1, // B
        explanation = "Galileo Galilei verbesserte das Teleskop um 1609 erheblich und nutzte es als erster Wissenschaftler systematisch für astronomische Beobachtungen. Er entdeckte damit die Jupitermonde und Mondkrater.",
        difficulty = 1,
        funFact = "Galilei entdeckte 1610 vier Monde des Jupiters — heute als 'Galileische Monde' bekannt. Das war der erste direkte Beweis, dass nicht alles um die Erde kreist, und erschütterte das damalige Weltbild!"
    ),

    // Question 27 — Inventions
    Question(
        categoryId = 2,
        questionText = "Wofür wird ein Mikroskop verwendet?",
        answerA = "Um weit entfernte Sterne zu beobachten",
        answerB = "Um sehr kleine Objekte stark vergrößert sehen zu können",
        answerC = "Um das Wetter vorherzusagen",
        answerD = "Um Töne sichtbar zu machen",
        correctAnswer = 1, // B
        explanation = "Ein Mikroskop vergrößert sehr kleine Objekte, die mit bloßem Auge nicht sichtbar wären — wie Bakterien, Zellen oder Insektenteile. Es wurde um 1590 von Zacharias Janssen erfunden und revolutionierte die Medizin.",
        difficulty = 1,
        funFact = null
    ),

    // Question 28 — Inventions
    Question(
        categoryId = 2,
        questionText = "Wer erfand den Buchdruck mit beweglichen Lettern im 15. Jahrhundert?",
        answerA = "Leonardo da Vinci",
        answerB = "Johannes Gutenberg",
        answerC = "Martin Luther",
        answerD = "Albrecht Dürer",
        correctAnswer = 1, // B
        explanation = "Johannes Gutenberg erfand um 1450 den Buchdruck mit beweglichen Metalllettern. Diese Erfindung ermöglichte es, Bücher schnell und günstig zu vervielfältigen, was die Verbreitung von Wissen revolutionierte.",
        difficulty = 1,
        funFact = "Vor Gutenbergs Erfindung dauerte das Abschreiben einer Bibel von Hand etwa drei Jahre. Mit seiner Druckpresse konnte man in derselben Zeit Hunderte Exemplare drucken — eine der folgenreichsten Erfindungen der Geschichte!"
    ),

    // Question 29 — Inventions
    Question(
        categoryId = 2,
        questionText = "Wozu wurde das Thermometer ursprünglich erfunden?",
        answerA = "Um Luftdruck zu messen",
        answerB = "Um Temperatur zu messen",
        answerC = "Um Zeit zu messen",
        answerD = "Um Feuchtigkeit zu messen",
        correctAnswer = 1, // B
        explanation = "Das Thermometer wurde entwickelt, um Temperaturen zu messen. Frühe Versionen nutzten die Ausdehnung von Flüssigkeiten (Wasser, später Alkohol und Quecksilber) bei Wärme. Galilei gilt als einer der ersten Erfinder eines Thermoskops.",
        difficulty = 1,
        funFact = null
    ),

    // Question 30 — Inventions
    Question(
        categoryId = 2,
        questionText = "Welches Antriebsprinzip ermöglicht mechanische Uhren, die Zeit gleichmäßig zu messen?",
        answerA = "Ein kleiner Elektromotor",
        answerB = "Eine gespannte Feder, die ein Räderwerk gleichmäßig antreibt",
        answerC = "Fließendes Wasser",
        answerD = "Sonnenstrahlung",
        correctAnswer = 1, // B
        explanation = "Mechanische Uhren werden durch eine gespannte Feder (Federwerk) angetrieben. Ein Hemmwerk (Ankerhemmung) reguliert die Energie gleichmäßig und erzeugt das typische Ticken. Das Räderwerk überträgt die Bewegung auf die Zeiger.",
        difficulty = 1,
        funFact = "Die erste tragbare mechanische Uhr ('Taschenuhr') wurde um 1500 erfunden. Davor hatten die meisten Menschen keine genaue Uhr — sie orientierten sich an Kirchturmglocken und dem Stand der Sonne."
    ),

    // Question 31 — Earth's atmosphere
    Question(
        categoryId = 2,
        questionText = "Warum erscheint der Himmel tagsüber blau?",
        answerA = "Weil das Meerwasser verdunstet und den Himmel blau färbt",
        answerB = "Weil die Atmosphäre blaues Licht stärker streut als rotes",
        answerC = "Weil Sauerstoff blau ist",
        answerD = "Weil der Weltraum hinter der Atmosphäre blau leuchtet",
        correctAnswer = 1, // B
        explanation = "Sonnenlicht enthält alle Farben. In der Atmosphäre werden kurzwellige blaue Lichtstrahlen von Luftmolekülen in alle Richtungen gestreut (Rayleigh-Streuung), viel stärker als langewelliges rotes Licht. Deshalb erscheint der Himmel blau.",
        difficulty = 1,
        funFact = "Bei Sonnenuntergang erscheint der Himmel rot und orange, weil das Licht einen längeren Weg durch die Atmosphäre nimmt. Das blaue Licht wird dabei weggestreut und nur das rote Langwellenlicht kommt noch an."
    ),

    // Question 32 — Earth's atmosphere
    Question(
        categoryId = 2,
        questionText = "Welches Gas macht den größten Anteil der Luft auf der Erde aus?",
        answerA = "Sauerstoff",
        answerB = "Kohlendioxid",
        answerC = "Stickstoff",
        answerD = "Wasserstoff",
        correctAnswer = 2, // C
        explanation = "Luft besteht zu etwa 78% aus Stickstoff (N₂) und nur zu etwa 21% aus Sauerstoff (O₂). Kohlendioxid (CO₂) macht nur etwa 0,04% aus — obwohl es für den Treibhauseffekt entscheidend ist.",
        difficulty = 1,
        funFact = null
    ),

    // Question 33 — Earth's atmosphere
    Question(
        categoryId = 2,
        questionText = "Was schützt die Ozonschicht in der Erdatmosphäre?",
        answerA = "Sie hält die Erde warm wie eine Decke",
        answerB = "Sie schützt vor schädlicher UV-Strahlung der Sonne",
        answerC = "Sie verhindert, dass Regen fällt",
        answerD = "Sie erzeugt den Wind",
        correctAnswer = 1, // B
        explanation = "Die Ozonschicht befindet sich in der Stratosphäre (15–35 km Höhe) und absorbiert den Großteil der schädlichen ultravioletten (UV) Strahlung der Sonne. Ohne sie wäre Leben auf der Erdoberfläche kaum möglich.",
        difficulty = 1,
        funFact = "Das Ozonloch über der Antarktis wurde 1985 entdeckt. Durch das Verbot von FCKW-Gasen (die Ozon zerstörten) erholt sich die Ozonschicht langsam — ein Erfolgsbeispiel für internationalen Umweltschutz."
    ),

    // Question 34 — Earth's atmosphere
    Question(
        categoryId = 2,
        questionText = "Was ist Wind?",
        answerA = "Kondenswasser, das sich in der Luft bewegt",
        answerB = "Bewegte Luft, die von Druckunterschieden angetrieben wird",
        answerC = "Strahlung der Sonne, die man spüren kann",
        answerD = "Die Rotation der Erde, die man spürt",
        correctAnswer = 1, // B
        explanation = "Wind entsteht durch Luftdruckunterschiede: Warme Luft steigt auf (Tiefdruck), kühle Luft strömt nach (Hochdruck). Luft fließt immer vom hohen zum niedrigen Druck — das erzeugt Wind.",
        difficulty = 1,
        funFact = null
    ),

    // Question 35 — Earth's atmosphere
    Question(
        categoryId = 2,
        questionText = "Wie entstehen Wolken?",
        answerA = "Rauch aus Fabrikschornsteinen steigt in die Höhe",
        answerB = "Wasserdampf kondensiert in der Höhe zu winzigen Wassertröpfchen",
        answerC = "Staub aus Wüsten wird nach oben geblasen",
        answerD = "Sauerstoff und Wasserstoff verbinden sich in der Luft",
        correctAnswer = 1, // B
        explanation = "Wenn feuchte Luft aufsteigt und sich abkühlt, kondensiert der Wasserdampf an winzigen Staubpartikeln zu kleinen Wassertröpfchen oder Eiskristallen. Millionen dieser Tröpfchen bilden zusammen eine sichtbare Wolke.",
        difficulty = 1,
        funFact = "Eine durchschnittliche Kumuluswolke wiegt etwa 500 Tonnen — das sind 100 Elefanten! Das Gewicht verteilt sich aber auf riesige Flächen, sodass die Wolke schwebt."
    ),

    // Question 36 — Human nutrition
    Question(
        categoryId = 2,
        questionText = "Was sind Kalorien in der Ernährungslehre?",
        answerA = "Kleine Fettteilchen in der Nahrung",
        answerB = "Eine Maßeinheit für den Energiegehalt von Nahrungsmitteln",
        answerC = "Vitamine, die Energie liefern",
        answerD = "Schadstoffe, die man meiden sollte",
        correctAnswer = 1, // B
        explanation = "Kalorien (genauer: Kilokalorien, kcal) sind eine Maßeinheit für die Energie, die unser Körper aus der Nahrung gewinnen kann. Ein Erwachsener benötigt täglich je nach Größe und Aktivität etwa 1.800–2.500 kcal.",
        difficulty = 1,
        funFact = null
    ),

    // Question 37 — Human nutrition
    Question(
        categoryId = 2,
        questionText = "Wozu braucht der Körper Eiweiß (Proteine)?",
        answerA = "Als Hauptenergiequelle für sportliche Aktivität",
        answerB = "Zum Aufbau und Erhalt von Muskeln und Körperzellen",
        answerC = "Um Vitamine zu transportieren",
        answerD = "Zur Wärmeregulierung des Körpers",
        correctAnswer = 1, // B
        explanation = "Proteine (Eiweiße) sind der wichtigste Baustoff des Körpers. Sie werden für den Aufbau von Muskeln, Organen, Haut und Haaren benötigt. Außerdem bilden sie Enzyme und Antikörper des Immunsystems.",
        difficulty = 1,
        funFact = "Der menschliche Körper besteht zu etwa 20% aus Proteinen — nach Wasser der zweithäufigste Bestandteil. Alle Proteine bestehen aus Aminosäuren, die wie Perlen an einer Kette aufgereiht sind."
    ),

    // Question 38 — Human nutrition
    Question(
        categoryId = 2,
        questionText = "Welche Nährstoffe liefern dem Körper die meiste Energie pro Gramm?",
        answerA = "Kohlenhydrate",
        answerB = "Proteine",
        answerC = "Fette",
        answerD = "Vitamine",
        correctAnswer = 2, // C
        explanation = "Fette liefern etwa 9 kcal pro Gramm — mehr als doppelt so viel wie Kohlenhydrate und Proteine (je etwa 4 kcal/g). Fette sind also sehr energiedichte Nährstoffe und wichtige Energiespeicher im Körper.",
        difficulty = 1,
        funFact = null
    ),

    // Question 39 — Human nutrition
    Question(
        categoryId = 2,
        questionText = "Wozu dienen Kohlenhydrate in der menschlichen Ernährung?",
        answerA = "Als Hauptlieferant für Baumaterial der Knochen",
        answerB = "Als wichtigste und schnellste Energiequelle für Körper und Gehirn",
        answerC = "Zur Regulierung des Hormonhaushalts",
        answerD = "Als Schutz für die Organe",
        correctAnswer = 1, // B
        explanation = "Kohlenhydrate (Zucker, Stärke) sind die bevorzugte Energiequelle des Körpers. Das Gehirn ist besonders auf Glukose (einfachen Zucker) angewiesen und verbraucht täglich etwa 120 Gramm davon.",
        difficulty = 1,
        funFact = "Das Gehirn macht nur 2% des Körpergewichts aus, verbraucht aber 20% der gesamten Energie — es ist das energiehungrigste Organ des Körpers!"
    ),

    // Question 40 — Human nutrition
    Question(
        categoryId = 2,
        questionText = "Was bewirken Ballaststoffe in der Ernährung?",
        answerA = "Sie liefern die meiste Energie",
        answerB = "Sie regen die Verdauung an und fördern die Darmgesundheit",
        answerC = "Sie ersetzen Vitamine",
        answerD = "Sie machen den Körper schnell satt, liefern aber sehr viele Kalorien",
        correctAnswer = 1, // B
        explanation = "Ballaststoffe sind unverdauliche Pflanzenfasern (z.B. in Vollkorn, Obst, Gemüse, Hülsenfrüchten). Sie fördern die Verdauung, ernähren gesunde Darmbakterien und helfen, den Blutzucker stabil zu halten. Liefern kaum Kalorien.",
        difficulty = 1,
        funFact = null
    ),

    // Question 41 — Basic physics
    Question(
        categoryId = 2,
        questionText = "Was ist Reibung?",
        answerA = "Eine Kraft, die Bewegung zwischen zwei Oberflächen verlangsamt oder verhindert",
        answerB = "Die Anziehung zwischen zwei Magneten",
        answerC = "Der Druck, den Wasser auf einen Körper ausübt",
        answerD = "Die Schwerkraft auf schiefen Flächen",
        correctAnswer = 0, // A
        explanation = "Reibung ist eine Kraft, die entsteht, wenn zwei Oberflächen aneinander reiben. Sie wirkt der Bewegung entgegen. Ohne Reibung könnten wir nicht gehen, kein Auto könnte bremsen, und Schrauben würden sich nicht festziehen.",
        difficulty = 1,
        funFact = "Eis ist so glatt, weil sich durch den Druck der Schlittschuhe eine hauchdünne Wasserschicht bildet — die reduziert die Reibung auf fast null. Das ist Physik beim Eislaufen!"
    ),

    // Question 42 — Basic physics
    Question(
        categoryId = 2,
        questionText = "Warum schwimmt ein Schiff aus schwerem Stahl auf dem Wasser, obwohl Stahl dichter als Wasser ist?",
        answerA = "Weil Stahl auf Salzwasser anders reagiert als auf Süßwasser",
        answerB = "Weil das Schiff durch seine Form viel Wasser verdrängt und dadurch Auftrieb erhält",
        answerC = "Weil der Motor das Schiff über Wasser hält",
        answerD = "Weil Stahl im Wasser leichter wird",
        correctAnswer = 1, // B
        explanation = "Auftrieb entsteht, weil ein Körper im Wasser eine Kraft nach oben erfährt, die dem Gewicht des verdrängten Wassers entspricht (Archimedisches Prinzip). Ein Schiff verdrängt durch seine hohle Form so viel Wasser, dass der Auftrieb sein Gewicht übersteigt.",
        difficulty = 1,
        funFact = "Archimedes soll seinen berühmten Geistesblitz beim Baden gehabt haben — als er ins volle Bad stieg und das Wasser überlief. Er rannte angeblich nackt durch die Straßen und rief 'Heureka!' (Ich hab's gefunden!)."
    ),

    // Question 43 — Basic physics
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Gewicht und Masse?",
        answerA = "Es gibt keinen Unterschied — beides bedeutet dasselbe",
        answerB = "Masse ist die Menge Materie in einem Körper, Gewicht ist die Schwerkraft, die auf diese Masse wirkt",
        answerC = "Masse misst man in Kilogramm, Gewicht in Litern",
        answerD = "Gewicht ist konstant, Masse ändert sich je nach Ort",
        correctAnswer = 1, // B
        explanation = "Masse ist die Menge an Materie in einem Körper (gemessen in kg) — sie ist überall gleich. Gewicht ist die Schwerkraft, die auf diese Masse wirkt (gemessen in Newton). Auf dem Mond würde man weniger wiegen, aber die gleiche Masse haben.",
        difficulty = 1,
        funFact = null
    ),

    // Question 44 — Basic physics
    Question(
        categoryId = 2,
        questionText = "Was passiert mit der Geschwindigkeit eines Objekts, wenn man eine konstante Kraft darauf ausübt?",
        answerA = "Es bleibt in Ruhe",
        answerB = "Es bewegt sich gleichmäßig ohne zu beschleunigen",
        answerC = "Es beschleunigt — wird also immer schneller",
        answerD = "Es bewegt sich rückwärts",
        correctAnswer = 2, // C
        explanation = "Nach Newtons zweitem Gesetz: Kraft = Masse × Beschleunigung. Eine konstante Kraft erzeugt eine konstante Beschleunigung, wodurch das Objekt kontinuierlich schneller wird — solange die Kraft wirkt.",
        difficulty = 1,
        funFact = "Das erklärt, warum ein fallender Apfel immer schneller wird: Die Schwerkraft zieht konstant, also beschleunigt er ständig — bis zum Aufprall oder bis die Luftreibung die Schwerkraft ausgleicht (Endgeschwindigkeit)."
    ),

    // Question 45 — Basic physics
    Question(
        categoryId = 2,
        questionText = "Was ist Auftrieb beim Schwimmen in Wasser?",
        answerA = "Die Kraft, die ein Körper im Wasser nach oben gedrückt wird",
        answerB = "Die Kraft, die Wasser auf den Grund des Gefäßes drückt",
        answerC = "Der Widerstand des Wassers beim Schwimmen",
        answerD = "Die Temperatur des Wassers",
        correctAnswer = 0, // A
        explanation = "Auftrieb ist die nach oben gerichtete Kraft, die Wasser auf einen eingetauchten Körper ausübt. Sie entspricht dem Gewicht des verdrängten Wassers (Archimedisches Prinzip). Ist der Auftrieb größer als das Gewicht, schwimmt der Körper.",
        difficulty = 1,
        funFact = null
    ),

    // Question 46 — Animal behavior
    Question(
        categoryId = 2,
        questionText = "Wie nennt man Tiere, die hauptsächlich nachts aktiv sind?",
        answerA = "Migrationstiere",
        answerB = "Nachtaktive oder nachtaktive (nocturnale) Tiere",
        answerC = "Hibernierende Tiere",
        answerD = "Omnivore",
        correctAnswer = 1, // B
        explanation = "Nachtaktive (nocturnale) Tiere sind vor allem nachts aktiv und schlafen tagsüber. Beispiele sind Eulen, Fledermäuse, Igel und viele Katzenarten. Sie haben oft besonders empfindliche Augen oder andere Sinne für die Dunkelheit.",
        difficulty = 1,
        funFact = "Eulen können ihren Kopf um bis zu 270 Grad drehen — aber nicht die Augen selbst, da diese röhrenförmig fixiert sind. Der drehbare Hals kompensiert das fehlende Augenbewegung perfekt."
    ),

    // Question 47 — Animal behavior
    Question(
        categoryId = 2,
        questionText = "Warum ziehen viele Vögel im Herbst in wärmere Gebiete?",
        answerA = "Weil sie größere Nester bauen wollen",
        answerB = "Um im Winter genug Nahrung zu finden und dem Kältetod zu entgehen",
        answerC = "Weil sie die Küstenwinde brauchen, um zu schlafen",
        answerD = "Weil sie sich in wärmeren Ländern paaren",
        correctAnswer = 1, // B
        explanation = "Zugvögel ziehen, weil ihre Nahrungsquellen (Insekten, Beeren) im Winter verschwinden. In wärmeren Regionen finden sie auch im Winter genug zu fressen. Sie navigieren dabei über die Sterne, das Erdmagnetfeld und Landmarken.",
        difficulty = 1,
        funFact = "Der Arktische Seeschwalbe fliegt die längste Reise aller Tiere: von der Arktis zur Antarktis und zurück — etwa 70.000 km pro Jahr. Im Laufe ihres Lebens entspricht das dreimal zur Sonne und zurück!"
    ),

    // Question 48 — Animal behavior
    Question(
        categoryId = 2,
        questionText = "Wie kommunizieren Bienen ihren Artgenossen, wo sich Blüten mit Nektar befinden?",
        answerA = "Sie schreien laut in der Nähe des Stocks",
        answerB = "Sie hinterlassen Duftspuren auf dem Boden",
        answerC = "Sie führen einen Schwänzeltanz auf, der Richtung und Entfernung anzeigt",
        answerD = "Sie tragen Blütenblätter als Zeichen zurück in den Stock",
        correctAnswer = 2, // C
        explanation = "Bienen kommunizieren durch den 'Schwänzeltanz': Durch die Tanzbewegungen teilen sie anderen Bienen mit, in welcher Richtung und wie weit entfernt eine Nahrungsquelle liegt. Diese komplexe Sprache entdeckte Karl von Frisch, wofür er 1973 den Nobelpreis erhielt.",
        difficulty = 1,
        funFact = null
    ),

    // Question 49 — Animal behavior
    Question(
        categoryId = 2,
        questionText = "Warum singen Wale?",
        answerA = "Nur zum Vergnügen, ähnlich wie Menschen Musik machen",
        answerB = "Zur Kommunikation, um Partner zu finden und sich zu orientieren",
        answerC = "Um Fische in die Irre zu führen",
        answerD = "Wale singen nicht — das ist ein Mythos",
        correctAnswer = 1, // B
        explanation = "Wale, besonders Buckelwale, produzieren komplexe Laute zur Kommunikation. Die Gesänge dienen der Partnersuche, der Orientierung und dem sozialen Austausch. Walgesang kann sich über hunderte Kilometer im Ozean ausbreiten.",
        difficulty = 1,
        funFact = "Der Gesang des Buckelwals kann bis zu 20 Minuten dauern und sich über 1.000 km im Ozean fortpflanzen. Das ist wie ein Radiosender, den man ohne Technik quer über den Atlantik hören kann!"
    ),

    // Question 50 — Animal behavior
    Question(
        categoryId = 2,
        questionText = "Wie ist ein Ameisenstaat organisiert?",
        answerA = "Jede Ameise handelt völlig eigenständig ohne soziale Struktur",
        answerB = "Es gibt eine Königin, Arbeiterinnen und Männchen mit klar verteilten Aufgaben",
        answerC = "Ein ältestes Männchen führt die Kolonie an",
        answerD = "Alle Ameisen sind gleich und wählen täglich eine neue Anführerin",
        correctAnswer = 1, // B
        explanation = "Ein Ameisenstaat ist eine hochorganisierte Gemeinschaft: Die Königin legt Eier, Arbeiterinnen bauen, sammeln Nahrung und pflegen die Brut, Männchen befruchten die Königin. Diese arbeitsteilige Gesellschaft kann Millionen von Individuen umfassen.",
        difficulty = 1,
        funFact = "Ameisen können das 50-fache ihres eigenen Körpergewichts tragen. Auf einen Menschen umgerechnet wäre das, als würde man ein Auto hochheben. Ihre Muskeln sind im Verhältnis zur Körpergröße viel stärker als unsere."
    ),

)
