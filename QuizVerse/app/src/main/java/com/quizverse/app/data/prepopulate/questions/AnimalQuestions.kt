package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestions(): List<Question> = listOf(

    // ── EASY (difficulty = 1) ── ~10 questions ──────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist das größte Landsäugetier der Erde?",
        answerA = "Nilpferd",
        answerB = "Nashorn",
        answerC = "Afrikanischer Elefant",
        answerD = "Giraffe",
        correctAnswer = 2,
        explanation = "Der afrikanische Elefant ist das größte Landsäugetier der Erde und kann bis zu 7 Tonnen wiegen.",
        difficulty = 1,
        funFact = "Elefanten sind die einzigen Tiere, die nicht springen können."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Lieblingsnahrung eines Koalabären?",
        answerA = "Bambus",
        answerB = "Eukalyptusblätter",
        answerC = "Früchte",
        answerD = "Gras",
        correctAnswer = 1,
        explanation = "Koalas ernähren sich fast ausschließlich von Eukalyptusblättern, die für die meisten anderen Tiere giftig sind.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Farbe haben Flamingos bei der Geburt?",
        answerA = "Rosa",
        answerB = "Weiß",
        answerC = "Grau",
        answerD = "Hellrot",
        correctAnswer = 2,
        explanation = "Flamingos werden mit grauem Gefieder geboren. Ihre rosa Farbe entsteht durch Carotinoide in ihrer Nahrung.",
        difficulty = 1,
        funFact = "Je mehr Krebse und Algen ein Flamingo frisst, desto intensiver wird seine rosa Farbe."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Haus einer Schnecke?",
        answerA = "Schale",
        answerB = "Panzer",
        answerC = "Gehäuse",
        answerD = "Kokon",
        correctAnswer = 2,
        explanation = "Das Haus einer Schnecke heißt Gehäuse. Es besteht hauptsächlich aus Kalk und wächst mit der Schnecke mit.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist als 'König der Tiere' bekannt?",
        answerA = "Tiger",
        answerB = "Leopard",
        answerC = "Gepard",
        answerD = "Löwe",
        correctAnswer = 3,
        explanation = "Der Löwe wird traditionell als 'König der Tiere' bezeichnet, vermutlich wegen seiner imposanten Mähne und seines majestätischen Auftretens.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat den längsten Hals?",
        answerA = "Kamel",
        answerB = "Giraffe",
        answerC = "Strauß",
        answerD = "Flamingo",
        correctAnswer = 1,
        explanation = "Die Giraffe hat den längsten Hals aller lebenden Tiere. Ihr Hals kann bis zu 2,4 Meter lang sein.",
        difficulty = 1,
        funFact = "Trotz des langen Halses hat die Giraffe genauso viele Halswirbel wie der Mensch – nämlich sieben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier legt die größten Eier der Welt?",
        answerA = "Strauß",
        answerB = "Pelikan",
        answerC = "Kondor",
        answerD = "Albatros",
        correctAnswer = 0,
        explanation = "Der Strauß legt die größten Eier aller lebenden Vögel. Ein Straußenei kann bis zu 1,5 kg wiegen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man einen männlichen Schwan?",
        answerA = "Rüde",
        answerB = "Hahn",
        answerC = "Kober",
        answerD = "Enter",
        correctAnswer = 2,
        explanation = "Ein männlicher Schwan heißt Kober, das Weibchen heißt Penne und das Jungtier heißt Schwänlein.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier schläft den ganzen Winter?",
        answerA = "Wolf",
        answerB = "Igel",
        answerC = "Fuchs",
        answerD = "Reh",
        correctAnswer = 1,
        explanation = "Der Igel hält echten Winterschlaf. Dabei sinkt seine Körpertemperatur fast auf Außentemperatur und sein Herzschlag verlangsamt sich stark.",
        difficulty = 1,
        funFact = "Während des Winterschlafs atmet ein Igel nur noch etwa einmal pro Minute."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann seinen Schwanz nachwachsen lassen?",
        answerA = "Schildkröte",
        answerB = "Eidechse",
        answerC = "Krokodil",
        answerD = "Schlange",
        correctAnswer = 1,
        explanation = "Viele Eidechsenarten können ihren Schwanz abwerfen (Autotomie) und innerhalb weniger Wochen einen neuen nachwachsen lassen.",
        difficulty = 1,
        funFact = null
    ),

    // ── MEDIUM (difficulty = 2) ── ~15 questions ─────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Wie lange ist die Trächtigkeitsdauer eines afrikanischen Elefanten?",
        answerA = "12 Monate",
        answerB = "18 Monate",
        answerC = "22 Monate",
        answerD = "30 Monate",
        correctAnswer = 2,
        explanation = "Afrikanische Elefanten haben mit etwa 22 Monaten die längste Trächtigkeitsdauer aller Landsäugetiere.",
        difficulty = 2,
        funFact = "Ein neugeborenes Elefantenbaby kann bereits kurz nach der Geburt laufen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt produziert Honig?",
        answerA = "Wespe",
        answerB = "Hummel",
        answerC = "Honigbiene",
        answerD = "Hornisse",
        correctAnswer = 2,
        explanation = "Die Honigbiene (Apis mellifera) produziert Honig aus dem Nektar von Blüten, den sie in ihrem Bienenstock lagert und eindickt.",
        difficulty = 2,
        funFact = "Eine Biene muss rund zwei Millionen Blüten besuchen, um ein Kilogramm Honig zu produzieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Meerestier hat drei Herzen?",
        answerA = "Delfin",
        answerB = "Krake",
        answerC = "Tintenfisch",
        answerD = "Seepferdchen",
        correctAnswer = 1,
        explanation = "Der Krake (Oktopus) besitzt drei Herzen: ein Hauptherz und zwei Kiemenherzen, die das Blut durch die Kiemen pumpen.",
        difficulty = 2,
        funFact = "Das Blut eines Kraken ist blau, weil es Hämocyanin statt Hämoglobin enthält."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der schnellste Vogel im Sturzflug?",
        answerA = "Mauersegler",
        answerB = "Wanderfalke",
        answerC = "Adler",
        answerD = "Albatros",
        correctAnswer = 1,
        explanation = "Der Wanderfalke ist im Sturzflug das schnellste Tier der Welt und erreicht Geschwindigkeiten von über 300 km/h.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Säugetier kann fliegen?",
        answerA = "Fliegender Hund",
        answerB = "Flughörnchen",
        answerC = "Fledermaus",
        answerD = "Flugbeutler",
        correctAnswer = 2,
        explanation = "Fledermäuse sind die einzigen Säugetiere, die aktiv fliegen können. Alle anderen genannten Tiere gleiten nur.",
        difficulty = 2,
        funFact = "Es gibt weltweit über 1.400 verschiedene Fledermausarten – das sind fast 20% aller Säugetierarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie orientieren sich Zugvögel auf ihren langen Reisen?",
        answerA = "Ausschließlich nach der Sonne",
        answerB = "Nach dem Magnetfeld der Erde",
        answerC = "Nach Flussverläufen",
        answerD = "Durch Lernverhalten von den Eltern",
        correctAnswer = 1,
        explanation = "Zugvögel nutzen mehrere Navigationssysteme, darunter das Erdmagnetfeld. In bestimmten Zellen ihrer Augen gibt es Magnetrezeptoren.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat die meisten Beine?",
        answerA = "Tausendfüßer (Millipede)",
        answerB = "Tausendfüßer (Centipede)",
        answerC = "Krabbe",
        answerD = "Seestern",
        correctAnswer = 0,
        explanation = "Tausendfüßer der Klasse Diplopoda (Doppelfüßer) haben die meisten Beine – rekordverdächtig sind über 1.300 Beine bei Eumillipes persephone.",
        difficulty = 2,
        funFact = "Trotz des Namens hat kein Tausendfüßer exakt 1.000 Beine."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Hermelin?",
        answerA = "Ein Raubtier aus der Familie der Marder",
        answerB = "Eine Vogelart",
        answerC = "Ein Nagetier",
        answerD = "Ein Reptil",
        correctAnswer = 0,
        explanation = "Das Hermelin (Mustela erminea) ist ein kleines Raubtier aus der Familie der Marder. Im Winter wird sein Fell weiß.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist der nächste lebende Verwandte des Menschen?",
        answerA = "Gorilla",
        answerB = "Orang-Utan",
        answerC = "Schimpanse",
        answerD = "Gibbon",
        correctAnswer = 2,
        explanation = "Der Schimpanse teilt mit dem Menschen etwa 98,7% der DNA und ist damit unser nächster lebender Verwandter.",
        difficulty = 2,
        funFact = "Schimpansen können Werkzeuge herstellen und verwenden – zum Beispiel nutzen sie Stöcke, um Termiten aus Hügeln zu angeln."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier produziert Seide?",
        answerA = "Seidenraupe",
        answerB = "Stabheuschrecke",
        answerC = "Gottesanbeterin",
        answerD = "Libelle",
        correctAnswer = 0,
        explanation = "Die Seidenraupe (Bombyx mori), die Larve des Maulbeerspinners, produziert Seide für ihren Kokon.",
        difficulty = 2,
        funFact = "Ein einziger Seidenkokon kann bis zu 1.500 Meter Seidentfaden enthalten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel kann rückwärts fliegen?",
        answerA = "Kolibri",
        answerB = "Schwalbe",
        answerC = "Specht",
        answerD = "Eisvogel",
        correctAnswer = 0,
        explanation = "Der Kolibri ist der einzige Vogel, der dauerhaft rückwärts fliegen kann. Seine Flügel schlagen bis zu 80 Mal pro Sekunde.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heißt der Lebensraum der Polarfüchse?",
        answerA = "Taiga",
        answerB = "Tundra",
        answerC = "Steppe",
        answerD = "Savanne",
        correctAnswer = 1,
        explanation = "Polarfüchse leben in der arktischen Tundra und sind hervorragend an extreme Kälte angepasst.",
        difficulty = 2,
        funFact = "Das Fell des Polarfuchses ist das wärmste aller arktischen Tiere im Verhältnis zu seinem Gewicht."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Jungtier eines Pferdes?",
        answerA = "Fohlen",
        answerB = "Küken",
        answerC = "Welpe",
        answerD = "Ferkel",
        correctAnswer = 0,
        explanation = "Das Jungtier eines Pferdes heißt Fohlen. Weibliche Jungtiere nennt man Stutfohlen, männliche Hengstfohlen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Meerestier ist für seine Biolumineszenz bekannt?",
        answerA = "Weißer Hai",
        answerB = "Tiefseequalle",
        answerC = "Seehund",
        answerD = "Mantarochen",
        correctAnswer = 1,
        explanation = "Viele Tiefseequallen können Licht produzieren (Biolumineszenz). Dieses Phänomen kommt bei bis zu 80% aller Tiefseebewohner vor.",
        difficulty = 2,
        funFact = "Das Meeresleuchten, das man manchmal an Stränden beobachten kann, wird von biolumineszenten Plankton verursacht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist ein Allesfresser?",
        answerA = "Löwe",
        answerB = "Koala",
        answerC = "Braunbär",
        answerD = "Gepard",
        correctAnswer = 2,
        explanation = "Der Braunbär ist ein Allesfresser (Omnivore) und frisst Beeren, Nüsse, Fisch, Insekten sowie gelegentlich Säugetiere.",
        difficulty = 2,
        funFact = null
    ),

    // ── HARD (difficulty = 3) ── ~12 questions ───────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Kommunikationssprache der Delfine?",
        answerA = "Infraschall",
        answerB = "Echoortung und Klick-Laute",
        answerC = "Ultraviolettes Signaling",
        answerD = "Chemische Signale",
        correctAnswer = 1,
        explanation = "Delfine kommunizieren hauptsächlich durch Klick-Laute, Pfiffe und Echoortung (Biosonar). Jeder Delfin hat einen einzigartigen Signaturpfiff.",
        difficulty = 3,
        funFact = "Delfine schlafen, indem sie eine Gehirnhälfte ausschalten – die andere bleibt wach, um die Atmung zu kontrollieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat das größte Gehirn im Verhältnis zur Körpergröße?",
        answerA = "Delfin",
        answerB = "Elefant",
        answerC = "Ameise",
        answerD = "Mensch",
        correctAnswer = 2,
        explanation = "Ameisen haben das größte Gehirn im Verhältnis zur Körpergröße. Ihr Gehirn macht etwa 6% ihres Körpergewichts aus.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Besonderheit des Schnabeltiers unter den Säugetieren?",
        answerA = "Es hat Schuppen statt Haare",
        answerB = "Es legt Eier und säugt seine Jungen",
        answerC = "Es kann sich wie ein Chamäleon tarnen",
        answerD = "Es hat kein Skelett",
        correctAnswer = 1,
        explanation = "Das Schnabeltier ist ein Kloakentier – es legt Eier wie Reptilien, säugt aber seine Jungen wie Säugetiere. Es gehört zu den drei Kloakentierarten.",
        difficulty = 3,
        funFact = "Das Schnabeltier ist eines der wenigen giftigen Säugetiere – Männchen haben an den Hinterbeinen Giftstachel."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion haben die roten Flecken auf den Flügeln des Kaiserpinguins?",
        answerA = "Sie dienen der Tarnung",
        answerB = "Sie regulieren die Körpertemperatur",
        answerC = "Sie spielen eine Rolle bei der Partnerwahl",
        answerD = "Kaiserpinguine haben keine roten Flecken",
        correctAnswer = 3,
        explanation = "Kaiserpinguine haben keine roten Flecken auf ihren Flügeln. Sie haben jedoch gelb-orangefarbene Markierungen am Kopf, die bei der Partnersuche eine Rolle spielen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Mimikry im Tierreich?",
        answerA = "Die Fähigkeit, Laute anderer Tiere nachzuahmen",
        answerB = "Das Nachahmen von Aussehen oder Verhalten anderer Arten zum Schutz",
        answerC = "Ein Balzritual bei Vögeln",
        answerD = "Die Anpassung an saisonale Nahrungsquellen",
        correctAnswer = 1,
        explanation = "Mimikry ist die evolutionäre Anpassung, bei der eine Art das Aussehen, die Farben oder das Verhalten einer anderen Art imitiert – meist zum Schutz vor Fressfeinden.",
        difficulty = 3,
        funFact = "Das Schmetterlings-Ei der Passionsblume ahmt Schmetterlingseiern nach, um echte Schmetterlinge davon abzuhalten, dort Eier abzulegen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Phänomen, wenn ein Tier seine Farbe wechselt wie das Chamäleon?",
        answerA = "Biolumineszenz",
        answerB = "Chromatophorie",
        answerC = "Autotomie",
        answerD = "Aposematismus",
        correctAnswer = 1,
        explanation = "Chromatophorie beschreibt den Farbwechsel durch spezielle Zellen, die Chromatophoren. Chamäleons ändern die Farbe hauptsächlich zur Kommunikation, nicht zur Tarnung.",
        difficulty = 3,
        funFact = "Tintenfische und Kraken können ihre Farbe in Millisekunden ändern und sind damit die schnellsten Farbwechsler im Tierreich."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel legt sein Ei in die Nester anderer Vögel?",
        answerA = "Elster",
        answerB = "Kuckuck",
        answerC = "Rabenkrähe",
        answerD = "Wendehals",
        correctAnswer = 1,
        explanation = "Der Kuckuck ist ein Brutparasit – er legt seine Eier in fremde Nester. Das Kuckucksjunge wirft dann die anderen Eier oder Nestlinge hinaus.",
        difficulty = 3,
        funFact = "Das Weibchen des Kuckucks kann die Farbe und Muster seiner Eier an die Wirtsvögeleier anpassen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Alligator und einem Krokodil?",
        answerA = "Alligatoren sind größer",
        answerB = "Bei Alligatoren ist der Unterkiefer-Vierzahn im geschlossenen Maul nicht sichtbar",
        answerC = "Krokodile leben ausschließlich im Salzwasser",
        answerD = "Alligatoren haben keine Zähne",
        correctAnswer = 1,
        explanation = "Der auffälligste Unterschied: Bei Krokodilen ist der vierte Zahn des Unterkiefers sichtbar, wenn das Maul geschlossen ist. Bei Alligatoren verschwindet er in einer Ausbuchtung des Oberkiefers.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Geweih des Rehs im ersten Jahr?",
        answerA = "Spießer",
        answerB = "Kitz-Geweih",
        answerC = "Erstling",
        answerD = "Bock-Geweih",
        correctAnswer = 0,
        explanation = "Jungrehe tragen im ersten Jahr einfache, spießartige Geweihe ohne Verästelungen – daher werden sie als Spießer bezeichnet.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat die längste Lebensdauer unter den Wirbellosen?",
        answerA = "Riesenschildkröte",
        answerB = "Grönlandhai",
        answerC = "Ozeanische Qualle (Turritopsis dohrnii)",
        answerD = "Islandmuschel (Arctica islandica)",
        correctAnswer = 3,
        explanation = "Die Islandmuschel kann über 500 Jahre alt werden. Das älteste bekannte Individuum, 'Ming', war 507 Jahre alt.",
        difficulty = 3,
        funFact = "Die Qualle Turritopsis dohrnii gilt als biologisch unsterblich, da sie sich nach der Fortpflanzung wieder in ihr Jugendstadium zurückbilden kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Hauptunterschied zwischen Affen und Menschenaffen?",
        answerA = "Menschenaffen haben einen Schwanz",
        answerB = "Affen haben keinen Schwanz",
        answerC = "Menschenaffen haben keinen Schwanz",
        answerD = "Affen leben nur in Afrika",
        correctAnswer = 2,
        explanation = "Menschenaffen (Gorilla, Schimpanse, Orang-Utan, Gibbon, Mensch) haben im Gegensatz zu Affen keinen Schwanz und haben ein größeres Gehirn.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist bekannt für seine Fähigkeit, den eigenen Arm zu regenerieren?",
        answerA = "Tintenfisch",
        answerB = "Seestern",
        answerC = "Krabbe",
        answerD = "Seegurke",
        correctAnswer = 1,
        explanation = "Seesterne können verlorene Arme vollständig regenerieren. Einige Arten können sogar aus einem einzigen Arm einen neuen Seestern wachsen lassen.",
        difficulty = 3,
        funFact = "Seegurken können bei Gefahr ihre inneren Organe ausstoßen und regenerieren sie später – ein extremes Überlebensstrategie."
    ),

    // ── EXPERT (difficulty = 4) ── ~8 questions ──────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Phänomen, bei dem Bienenvölker plötzlich zusammenbrechen?",
        answerA = "Kollapssyndrom",
        answerB = "Colony Collapse Disorder (CCD)",
        answerC = "Schwarmfieber",
        answerD = "Varroatose",
        correctAnswer = 1,
        explanation = "Colony Collapse Disorder (CCD) oder Bienenvölkersterben bezeichnet das massenhafte Verschwinden von Arbeiterbienen. Pestizide, Varroamilben und Monokultur gelten als Ursachen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem Begriff 'K-Strategie' in der Ökologie?",
        answerA = "Tiere die viele Nachkommen mit wenig elterlicher Fürsorge produzieren",
        answerB = "Tiere die wenige Nachkommen mit intensiver elterlicher Fürsorge aufziehen",
        answerC = "Tiere die sowohl Beute als auch Räuber sein können",
        answerD = "Tiere die in Gruppen leben und sich koordinieren",
        correctAnswer = 1,
        explanation = "K-Strategen (z.B. Elefanten, Wale, Menschen) investieren viel in wenige Nachkommen und haben eine hohe Lebenserwartung. Im Gegensatz dazu stehen r-Strategen wie Insekten.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus ermöglicht dem Wüstenhahn-Gecko, an glatten Wänden zu laufen?",
        answerA = "Klebrige Sekretion an den Zehen",
        answerB = "Van-der-Waals-Kräfte durch Milliarden winziger Haare",
        answerC = "Saugnäpfe an den Zehen",
        answerD = "Statische Elektrizität",
        correctAnswer = 1,
        explanation = "Geckos haften durch Van-der-Waals-Kräfte – intermolekulare Anziehungskräfte zwischen Milliarden winziger Haare (Setae) auf ihren Zehen und der Oberfläche.",
        difficulty = 4,
        funFact = "Die Haftfläche eines Geckos könnte theoretisch das 40-fache seines Körpergewichts tragen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Red Queen'-Prinzip in der Evolutionsbiologie?",
        answerA = "Das Aussterben der stärksten Art durch Übernutzung",
        answerB = "Die kontinuierliche Co-Evolution von Räuber und Beute",
        answerC = "Die Dominanz weiblicher Tiere in Matriarchaten",
        answerD = "Die evolutionäre Stagnation in stabilen Ökosystemen",
        correctAnswer = 1,
        explanation = "Das Red-Queen-Prinzip beschreibt, wie Arten sich ständig weiterentwickeln müssen, nur um im evolutionären Wettrüsten mit anderen Arten mitzuhalten – analog zu Alices Lauf im Wunderland.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann bis zu 3,8 km Wassertiefe überleben und dabei dem extremen Druck standhalten?",
        answerA = "Blauwal",
        answerB = "Pottwal",
        answerC = "Schnabelwal (Ziphius cavirostris)",
        answerD = "Riesenkalmar",
        correctAnswer = 2,
        explanation = "Ziphius cavirostris (Cuvier-Schnabelwal) hält mit Tauchgängen bis 3.800 m Tiefe und Tauchzeiten über 3,5 Stunden den Rekord unter den Meeressäugetieren.",
        difficulty = 4,
        funFact = "Beim Auftauchen nach Tieftauchgängen müssen Schnabelwale langsam aufsteigen, um Dekompressionskrankheit zu vermeiden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet man als 'Müller'sche Mimikry'?",
        answerA = "Eine harmlose Art ahmt eine gefährliche nach",
        answerB = "Mehrere giftige Arten ähneln sich gegenseitig",
        answerC = "Ein Räuber tarnt sich als Beute",
        answerD = "Eine Art imitiert unbelebte Objekte",
        correctAnswer = 1,
        explanation = "Müller'sche Mimikry liegt vor, wenn mehrere tatsächlich giftige oder ungenießbare Arten ein ähnliches Warnmuster entwickeln – zum gemeinsamen Schutz gegenüber Fressfeinden.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tierart hat die höchste bekannte Anzahl an Chromosomen?",
        answerA = "Mensch (46)",
        answerB = "Hund (78)",
        answerC = "Krallenfarn-Schmetterlingsling (Polyommatus icarus) mit 448",
        answerD = "Adlerfarn (kein Tier)",
        correctAnswer = 2,
        explanation = "Einige Schmetterlingsarten haben extrem viele Chromosomen. Beim Bläuling Polyommatus icarus wurden bis zu 448 Chromosomen gezählt – eine außergewöhnlich hohe Zahl.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Funktion der Jacobsonschen Organe bei Schlangen?",
        answerA = "Seitenlinienorgan zum Spüren von Vibrationen",
        answerB = "Wärmewahrnehmung zur Jagd",
        answerC = "Chemisches Sinnesorgan zum Riechen und Schmecken von Luftpartikeln",
        answerD = "Gleichgewichtsorgan",
        correctAnswer = 2,
        explanation = "Das Jacobsonsche Organ (Vomeronasalorgan) im Gaumen ermöglicht Schlangen, Geruchspartikel aus der Luft chemisch zu analysieren – ihr Zungen-Flimmern sammelt diese Partikel.",
        difficulty = 4,
        funFact = "Schlangen 'sehen' ihre Beute durch eine Kombination aus Zungenschmecken, Wärmewahrnehmung und Sehvermögen."
    ),

    // ── MASTER (difficulty = 5) ── ~5 questions ──────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Begriff 'Eigentumsmarkierung' durch Infraschall bei Elefanten?",
        answerA = "Elefanten nutzen Ultraschall zur Kommunikation über große Distanzen",
        answerB = "Elefanten produzieren tieffrequente Laute unter 20 Hz, die durch den Boden übertragen werden",
        answerC = "Elefanten erzeugen Schallwellen durch Trampeln auf dem Boden",
        answerD = "Elefanten kommunizieren durch elektrische Felder im Boden",
        correctAnswer = 1,
        explanation = "Elefanten produzieren Infraschall (unter 20 Hz) durch Kehlkopfschwingungen, der Hunderte von Kilometern durch Boden und Luft übertragen wird. Artgenossen empfangen ihn über empfindliche Fußsohlen.",
        difficulty = 5,
        funFact = "Elefantenkommunikation durch Infraschall wurde erst in den 1980er-Jahren von Katy Payne entdeckt, die auch die Infraschall-Kommunikation bei Walen erforscht hatte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus ermöglicht dem Mantis-Krebses (Fangschreckenkrebs) den tödlichsten Schlag im Tierreich?",
        answerA = "Muskelkontraktion mit höchster bekannter Beschleunigung im Tierreich",
        answerB = "Einlagerung von Energie in einem Federmechanismus aus Exoskelett-Material",
        answerC = "Chemische Explosion durch Mischung von Sekreten",
        answerD = "Kavitationsblase durch Beschleunigung über die Schallgeschwindigkeit im Wasser",
        correctAnswer = 1,
        explanation = "Mantis-Krebse laden ihre Schläger wie eine Feder. Die Energie wird im saddle-förmigen Exoskelett gespeichert und innerhalb von 2,7 Millisekunden freigesetzt – erzeugt kurz Temperaturen wie auf der Sonnenoberfläche durch Kavitation.",
        difficulty = 5,
        funFact = "Der Schlag des Mantis-Krebses ist so kraftvoll, dass er Aquarienglas zerbrechen kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Handicap-Prinzip' in der sexuellen Selektion nach Zahavi?",
        answerA = "Tiere wählen Partner mit möglichst symmetrischen Körpermerkmalen",
        answerB = "Kostspielige, hinderliche Merkmale signalisieren ehrlich genetische Qualität",
        answerC = "Weibchen bevorzugen stets die größten Männchen ihrer Art",
        answerD = "Tiere passen ihr Verhalten an Umweltbedingungen an",
        correctAnswer = 1,
        explanation = "Amotz Zahavi postulierte: Nur genetisch überlegene Individuen können sich kostspielige Merkmale (wie Pfauenrad, Hirschgeweih) leisten. Das Handicap beweist gerade dadurch die genetische Qualität.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher evolutionäre Prozess erklärt die Entstehung der Mitochondrien in eukaryotischen Zellen?",
        answerA = "Virale Integration",
        answerB = "Endosymbiose – Aufnahme eines Alphaproteobakteriums",
        answerC = "Horizontaler Gentransfer aus Archaeen",
        answerD = "Spontane Membranevolution",
        correctAnswer = 1,
        explanation = "Laut Endosymbiontentheorie (Lynn Margulis) wurden Mitochondrien durch die Aufnahme eines Alphaproteobakteriums in eine Wirtszelle vor ca. 1,5 Milliarden Jahren gebildet.",
        difficulty = 5,
        funFact = "Mitochondrien haben noch immer eine eigene kreisförmige DNA und teilen sich unabhängig von der Zelle – als Relikt ihrer Herkunft als freie Bakterien."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Müller-Haeckel-Prinzip' und welches Tier widerlegt es am deutlichsten?",
        answerA = "Die Ontogenese rekapituliert die Phylogenese; der Schnabeligel widerlegt es durch fehlende Embryonalstadien",
        answerB = "Alle Tiere durchlaufen in der Embryonalentwicklung ähnliche Stadien; Bandwürmer widerlegen es durch direkte Entwicklung",
        answerC = "Alle Arten streben nach Komplexitätszunahme; sessile Tiere widerlegen es",
        answerD = "Verwandte Arten haben ähnliche Verhaltensweisen; Parasiten widerlegen es durch Verhaltensreduktion",
        correctAnswer = 1,
        explanation = "Das biogenetische Grundgesetz ('Ontogenese rekapituliert Phylogenese') gilt nur eingeschränkt. Bandwürmer und andere Parasiten zeigen direkte Entwicklung ohne ancestrale Larvenstadien.",
        difficulty = 5,
        funFact = null
    ),

    // ── NEW EASY (difficulty = 1) ── 15 questions ─────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist das schnellste Landtier der Welt?",
        answerA = "Löwe",
        answerB = "Gepard",
        answerC = "Gazelle",
        answerD = "Gepard",
        correctAnswer = 1,
        explanation = "Der Gepard ist das schnellste Landtier und kann Geschwindigkeiten von bis zu 120 km/h erreichen.",
        difficulty = 1,
        funFact = "Ein Gepard beschleunigt in etwa 3 Sekunden von 0 auf 100 km/h – schneller als die meisten Sportwagen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Beine hat eine Spinne?",
        answerA = "6",
        answerB = "8",
        answerC = "10",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Spinnen sind Spinnentiere und haben 8 Beine. Insekten hingegen haben nur 6 Beine.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist ein Säugetier?",
        answerA = "Krokodil",
        answerB = "Schildkröte",
        answerC = "Delfin",
        answerD = "Thunfisch",
        correctAnswer = 2,
        explanation = "Der Delfin ist ein Säugetier: Er atmet mit Lungen, ist warmblütig und säugt seine Jungtiere.",
        difficulty = 1,
        funFact = "Delfine müssen regelmäßig an die Oberfläche kommen, um Luft zu holen – sie können nicht unter Wasser atmen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Jungtier einer Katze?",
        answerA = "Welpe",
        answerB = "Küken",
        answerC = "Kätzchen",
        answerD = "Fohlen",
        correctAnswer = 2,
        explanation = "Das Jungtier einer Katze heißt Kätzchen oder Kitten. Neugeborene Kätzchen öffnen ihre Augen erst nach etwa 10 Tagen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier produziert Wolle?",
        answerA = "Ziege",
        answerB = "Schaf",
        answerC = "Kuh",
        answerD = "Schwein",
        correctAnswer = 1,
        explanation = "Schafe werden geschoren, um ihre Wolle zu gewinnen. Die Wolle wächst jedes Jahr nach und muss regelmäßig geschoren werden.",
        difficulty = 1,
        funFact = "Ein Schaf liefert pro Jahr durchschnittlich 2–4 kg Wolle – genug für etwa zwei Pullover."
    ),

    Question(
        categoryId = 9,
        questionText = "Was fressen Pandas?",
        answerA = "Fleisch",
        answerB = "Früchte",
        answerC = "Bambus",
        answerD = "Insekten",
        correctAnswer = 2,
        explanation = "Große Pandas ernähren sich zu fast 99% von Bambus. Sie müssen täglich bis zu 15 kg Bambus fressen, da er sehr nährstoffarm ist.",
        difficulty = 1,
        funFact = "Obwohl Pandas Fleischfresser-Verdauung haben, fressen sie fast ausschließlich Bambus."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heißt das weibliche Rind?",
        answerA = "Stute",
        answerB = "Kuh",
        answerC = "Henne",
        answerD = "Sau",
        correctAnswer = 1,
        explanation = "Das weibliche Rind heißt Kuh. Der männliche Stier heißt Bulle, das Jungtier Kalb.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier baut Dämme aus Holz und Schlamm?",
        answerA = "Otter",
        answerB = "Biber",
        answerC = "Waschbär",
        answerD = "Murmeltier",
        correctAnswer = 1,
        explanation = "Biber bauen Dämme aus Ästen, Holzstämmen und Schlamm, um Teiche zu schaffen, in denen sie ihre Burgen sicher anlegen können.",
        difficulty = 1,
        funFact = "Biberdämme können bis zu 100 Meter lang werden und verändern ganze Landschaften."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier trägt sein Junges im Beutel?",
        answerA = "Koala",
        answerB = "Känguru",
        answerC = "Wombat",
        answerD = "Alle genannten",
        correctAnswer = 3,
        explanation = "Känguru, Koala und Wombat sind alle Beuteltiere. Ihre unreif geborenen Jungtiere entwickeln sich im Beutel der Mutter weiter.",
        difficulty = 1,
        funFact = "Ein neugeborenes Känguru ist nur etwa 2 cm groß – so klein wie eine Bohne."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Höcker hat ein Dromedar?",
        answerA = "Keinen",
        answerB = "Einen",
        answerC = "Zwei",
        answerD = "Drei",
        correctAnswer = 1,
        explanation = "Das Dromedar hat einen Höcker, das Trampeltier (Baktrisches Kamel) hat zwei Höcker. Im Höcker wird Fett gespeichert, kein Wasser.",
        difficulty = 1,
        funFact = "Ein erschöpftes Kamel hat einen schlaffen Höcker – das Fett wurde aufgebraucht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist für seine schwarzweißen Streifen bekannt?",
        answerA = "Gepard",
        answerB = "Zebra",
        answerC = "Gnu",
        answerD = "Impala",
        correctAnswer = 1,
        explanation = "Zebras sind für ihr schwarz-weißes Streifenmuster bekannt. Jedes Zebra hat ein einzigartiges Streifenmuster, ähnlich wie menschliche Fingerabdrücke.",
        difficulty = 1,
        funFact = "Forscher diskutieren noch, ob Zebras schwarze Tiere mit weißen Streifen oder weiße mit schwarzen Streifen sind."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Oktopus?",
        answerA = "Ein Fisch",
        answerB = "Ein Weichtier",
        answerC = "Ein Krebstier",
        answerD = "Ein Stachelhäuter",
        correctAnswer = 1,
        explanation = "Der Oktopus (Krake) ist ein Weichtier aus der Klasse der Kopffüßer. Er ist eng mit Tintenfischen und Nautilussen verwandt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel kann nicht fliegen und ist der größte lebende Vogel?",
        answerA = "Pinguin",
        answerB = "Kiwi",
        answerC = "Strauß",
        answerD = "Nandu",
        correctAnswer = 2,
        explanation = "Der Strauß ist der größte lebende Vogel und kann nicht fliegen. Er kann jedoch bis zu 70 km/h rennen.",
        difficulty = 1,
        funFact = "Strauße haben die größten Augen aller Landtiere – größer als ihr eigenes Gehirn."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt verwandelt sich von einer Raupe zu einem Schmetterling?",
        answerA = "Motte",
        answerB = "Tagfalter",
        answerC = "Beide (A und B)",
        answerD = "Libelle",
        correctAnswer = 2,
        explanation = "Sowohl Tagfalter als auch Motten durchlaufen eine vollständige Verwandlung (Metamorphose): Ei → Raupe → Puppe → Falter.",
        difficulty = 1,
        funFact = "Die Puppe des Schmetterlings heißt Chrysalis. In ihr löst sich die Raupe fast vollständig auf, bevor der Falter entsteht."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man eine Gruppe von Wölfen?",
        answerA = "Rudel",
        answerB = "Herde",
        answerC = "Schwarm",
        answerD = "Meute",
        correctAnswer = 0,
        explanation = "Eine Gruppe von Wölfen heißt Rudel. Ein Rudel besteht meist aus einem Elternpaar (Alphapaar) und ihren Nachkommen.",
        difficulty = 1,
        funFact = "Wölfe kommunizieren durch Heulen, um ihr Rudel zusammenzuhalten und ihr Revier zu markieren."
    ),

    // ── NEW MEDIUM (difficulty = 2) ── 20 questions ───────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welches Organ nutzen Fledermäuse zur Navigation?",
        answerA = "Infrarotwahrnehmung",
        answerB = "Echoortung (Ultraschall)",
        answerC = "Elektrorezeption",
        answerD = "Magnetrezeptoren in der Schnauze",
        correctAnswer = 1,
        explanation = "Fledermäuse senden Ultraschallwellen aus und hören deren Echo. So können sie Insekten und Hindernisse in totaler Dunkelheit präzise orten.",
        difficulty = 2,
        funFact = "Einige Fledermausarten senden Rufe mit bis zu 120 Dezibel – lauter als ein Presslufthammer."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie schläft ein Delfin?",
        answerA = "Auf dem Meeresgrund liegend",
        answerB = "Mit einer Gehirnhälfte schlafen, die andere bleibt wach",
        answerC = "Schwimmend an der Oberfläche für maximal 2 Stunden",
        answerD = "In Höhlen am Meeresgrund",
        correctAnswer = 1,
        explanation = "Delfine praktizieren den unihemisphärischen Schlaf: Eine Gehirnhälfte schläft, die andere bleibt aktiv. So können sie weiter schwimmen und atmen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Marsupial?",
        answerA = "Ein Raubtier aus Australien",
        answerB = "Ein Beuteltier",
        answerC = "Ein flugunfähiger Vogel",
        answerD = "Ein wasserbewohnendes Säugetier",
        correctAnswer = 1,
        explanation = "Marsupialier (Beuteltiere) sind Säugetiere, deren Jungtiere unreif geboren werden und sich im Beutel der Mutter weiterentwickeln.",
        difficulty = 2,
        funFact = "Fast alle Beuteltiere leben auf der Südhalbkugel – vor allem in Australien und Südamerika."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat das größte Herz (absolut) aller Lebewesen?",
        answerA = "Afrikanischer Elefant",
        answerB = "Blauwal",
        answerC = "Riesenschildkröte",
        answerD = "Buckelwal",
        correctAnswer = 1,
        explanation = "Das Herz des Blauwals ist das größte aller lebenden Tiere – es wiegt etwa 180 kg und ist so groß wie ein kleines Auto.",
        difficulty = 2,
        funFact = "Durch die Aorta des Blauwals könnte ein kleines Kind hindurchkrabbeln."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen Schmetterlingslarven (Raupen) und Maden?",
        answerA = "Raupen haben Beine, Maden nicht",
        answerB = "Maden haben Beine, Raupen nicht",
        answerC = "Es gibt keinen Unterschied",
        answerD = "Raupen leben im Wasser, Maden an Land",
        correctAnswer = 0,
        explanation = "Schmetterlingsraupen haben echte Beine (3 Paar Thoraxbeine) und Bauchfüße (Prolegs). Fliegenlarven (Maden) sind beinlos.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat kein natürliches Fressfeind in seiner Heimat?",
        answerA = "Kaninchen",
        answerB = "Nilkrokodil",
        answerC = "Eisbär",
        answerD = "Polarfuchs",
        correctAnswer = 2,
        explanation = "Erwachsene Eisbären haben in der Arktis keine natürlichen Fressfeinde. Sie stehen an der Spitze der arktischen Nahrungskette.",
        difficulty = 2,
        funFact = "Eisbären haben keine weißen Haare – ihre Haare sind farblos und hohl. Die Fellfarbe entsteht durch Lichtbrechung."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man den Vorgang, wenn eine Schlange ihre Haut abstreift?",
        answerA = "Häutung",
        answerB = "Metamorphose",
        answerC = "Mauserung",
        answerD = "Exuviation",
        correctAnswer = 0,
        explanation = "Das Abstreifen der alten Haut bei Schlangen und anderen Reptilien heißt Häutung. Schlangen häuten sich mehrmals im Jahr.",
        difficulty = 2,
        funFact = "Kurz vor der Häutung trüben sich die Augen der Schlange milchig – ein Zeichen, dass die alte Haut sich löst."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier produziert die giftigste bekannte Substanz in der Tierwelt?",
        answerA = "Kobra",
        answerB = "Würfelqualle",
        answerC = "Pfeilgiftfrosch",
        answerD = "Schwarze Witwe",
        correctAnswer = 1,
        explanation = "Die Würfelqualle (Chironex fleckeri) gilt als eines der giftigsten Tiere der Welt. Ihr Gift kann in weniger als 5 Minuten töten.",
        difficulty = 2,
        funFact = "Würfelquallen haben 24 Augen in 4 Gruppen, aber kein zentrales Gehirn."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man Tiere, die sowohl an Land als auch im Wasser leben?",
        answerA = "Reptilien",
        answerB = "Amphibien",
        answerC = "Aquatische Säugetiere",
        answerD = "Semiaquatische Tiere",
        correctAnswer = 1,
        explanation = "Amphibien (Lurche) leben typischerweise im Wasser (Larvalstadium) und an Land (Erwachsenenstadium). Dazu gehören Frösche, Kröten, Molche und Salamander.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel hat die größte Flügelspannweite aller lebenden Vögel?",
        answerA = "Kondor",
        answerB = "Wanderalbatros",
        answerC = "Pelikan",
        answerD = "Marabu",
        correctAnswer = 1,
        explanation = "Der Wanderalbatros hat mit bis zu 3,7 m die größte Flügelspannweite aller lebenden Vögel.",
        difficulty = 2,
        funFact = "Wanderalbatrosse schlafen im Gleitflug und legen jährlich bis zu 120.000 km zurück."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Raubtier (Karnivore)?",
        answerA = "Ein Tier, das nur Pflanzen frisst",
        answerB = "Ein Tier, das sich hauptsächlich von anderen Tieren ernährt",
        answerC = "Ein Tier, das Aas frisst",
        answerD = "Ein Tier, das Insekten frisst",
        correctAnswer = 1,
        explanation = "Karnivore sind Tiere, die sich hauptsächlich von anderen Tieren (Fleisch) ernähren. Dazu gehören Löwen, Adler, Haie und viele andere.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist bekannt für seine Echolokation im Wasser?",
        answerA = "Seehund",
        answerB = "Wal",
        answerC = "Walross",
        answerD = "Seelöwe",
        correctAnswer = 1,
        explanation = "Zahnwale wie Delfine und Pottwale nutzen Echolokation: Sie senden Klicks aus und orten Objekte anhand des zurückkehrenden Echos.",
        difficulty = 2,
        funFact = "Pottwale produzieren die lautesten Laute aller Tiere – bis zu 230 Dezibel."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man Tiere, die nachts aktiv sind?",
        answerA = "Diurnal",
        answerB = "Nokturnal",
        answerC = "Krepuskulär",
        answerD = "Arrhythmisch",
        correctAnswer = 1,
        explanation = "Nachtaktive Tiere werden als nokturnal bezeichnet. Dazu gehören Eulen, Fledermäuse und viele Insekten. Tagaktive Tiere nennt man diurnal.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat die längste Zunge im Verhältnis zur Körpergröße?",
        answerA = "Chamäleon",
        answerB = "Ameisenbär",
        answerC = "Specht",
        answerD = "Chamäleon",
        correctAnswer = 0,
        explanation = "Chamäleons können ihre Zunge blitzschnell herausschleudern – sie ist oft länger als ihr gesamter Körper. Ein spezieller Zungenknochen dient als Abschussmechanismus.",
        difficulty = 2,
        funFact = "Die Zunge eines Chamäleons schießt mit einer Beschleunigung von bis zu 41 g vor – schneller als ein Kampfjet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Kaltblüter?",
        answerA = "Ein Tier, das in kalten Regionen lebt",
        answerB = "Ein Tier, dessen Körpertemperatur von der Umgebungstemperatur abhängt",
        answerC = "Ein Tier, das im Winter Winterschlaf hält",
        answerD = "Ein Tier mit niedriger Herzfrequenz",
        correctAnswer = 1,
        explanation = "Kaltblüter (Poikilotherme) regulieren ihre Körpertemperatur nicht selbst – sie nehmen die Temperatur ihrer Umgebung an. Dazu gehören Reptilien, Fische und Amphibien.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat einen einzigartigen Fingerabdruck ähnlich wie Menschen?",
        answerA = "Gorilla",
        answerB = "Koala",
        answerC = "Schimpanse",
        answerD = "Orang-Utan",
        correctAnswer = 1,
        explanation = "Koalas haben Fingerabdrücke, die menschlichen so ähnlich sind, dass sie forensisch kaum zu unterscheiden sind – eine der wenigen nicht-menschlichen Arten mit solchen Merkmalen.",
        difficulty = 2,
        funFact = "Auch Gorillas und Schimpansen haben Fingerabdrücke, aber die des Koalas ähneln menschlichen am stärksten."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man Tiere, die sich von Aas ernähren?",
        answerA = "Herbivore",
        answerB = "Omnivore",
        answerC = "Aasfresser (Scavenger)",
        answerD = "Detritivore",
        correctAnswer = 2,
        explanation = "Aasfresser (Scavenger) ernähren sich von toten und verwesenden Tieren. Geier, Hyänen und Krähen sind bekannte Beispiele.",
        difficulty = 2,
        funFact = "Geier haben eine hochentwickelte Magensäure, die selbst gefährliche Krankheitserreger wie Milzbrand abtötet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat die empfindlichste Nase im Tierreich?",
        answerA = "Hund",
        answerB = "Bär",
        answerC = "Elefant",
        answerD = "Haifisch",
        correctAnswer = 2,
        explanation = "Bären haben den schärfsten Geruchssinn aller Landsäugetiere – bis zu 2.100 Mal feiner als beim Menschen. Sie können Nahrungsquellen aus über 30 km Entfernung riechen.",
        difficulty = 2,
        funFact = "Der Haifisch gilt dagegen als der empfindlichste Geruchssinn unter den Meerestieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Parthenogenese im Tierreich?",
        answerA = "Geschlechtliche Fortpflanzung durch externe Befruchtung",
        answerB = "Ungeschlechtliche Fortpflanzung ohne Befruchtung durch ein Männchen",
        answerC = "Zweigeschlechtliche Fortpflanzung bei Zwittern",
        answerD = "Klonierung durch Zellteilung",
        correctAnswer = 1,
        explanation = "Parthenogenese ist die Entwicklung eines Organismus aus einer unbefruchteten Eizelle. Komodo-Warane, Haie und einige Insekten können sich so fortpflanzen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiere bilden die größten Wanderherden der Welt?",
        answerA = "Elefanten in Botswana",
        answerB = "Gnus in der Serengeti",
        answerC = "Rentiere in Kanada",
        answerD = "Karibu in Sibirien",
        correctAnswer = 1,
        explanation = "Die Große Gnu-Wanderung in der Serengeti (Tansania/Kenia) ist die größte Landsäuger-Wanderung der Welt – bis zu 1,5 Millionen Gnus bewegen sich jährlich im Kreis.",
        difficulty = 2,
        funFact = "Auf ihrer Wanderung überqueren die Gnus den Krokodil-verseuchten Mara-Fluss – eines der gefährlichsten Naturschauspiele Afrikas."
    ),

    // ── NEW HARD (difficulty = 3) ── 15 questions ─────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Allopatrie' in der Evolutionsbiologie?",
        answerA = "Artbildung durch geografische Trennung von Populationen",
        answerB = "Artbildung innerhalb desselben Lebensraums durch ökologische Nischen",
        answerC = "Das Aussterben einer Art durch Konkurrenz",
        answerD = "Die Rückkehr einer Art in ihr ursprüngliches Verbreitungsgebiet",
        correctAnswer = 0,
        explanation = "Allopatrische Artbildung entsteht, wenn Populationen geografisch getrennt werden und sich unabhängig voneinander entwickeln, bis sie nicht mehr erfolgreich interbreeden können.",
        difficulty = 3,
        funFact = "Die Darwin-Finken auf den Galapagos-Inseln sind ein klassisches Beispiel für allopatrische Artbildung."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die spezielle Zelle, mit der Nesseltiere (Cnidaria) ihre Beute lähmen?",
        answerA = "Nesselzelle (Cnidozyt/Nematozyt)",
        answerB = "Giftdrüsenzelle",
        answerC = "Phagozyt",
        answerD = "Chromatophor",
        correctAnswer = 0,
        explanation = "Cnidozyten (Nesselzellen) enthalten eine Stechkapsel (Nematocyst). Bei Berührung wird ein giftiger Faden mit bis zu 5 m/s herausgeschossen – der schnellste biologische Mechanismus.",
        difficulty = 3,
        funFact = "Eine Qualle löst die Nesseln auch noch nach dem Tod aus – tote Quallen am Strand können noch stechen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Merkmal kennzeichnet Fische der Klasse Chondrichthyes?",
        answerA = "Knöchernes Skelett",
        answerB = "Knorpeliges Skelett ohne echte Knochen",
        answerC = "Keine Kiemen",
        answerD = "Lungen statt Kiemen",
        correctAnswer = 1,
        explanation = "Chondrichthyes (Knorpelfische) wie Haie, Rochen und Chimären haben ein vollständig knorpeliges Skelett. Im Gegensatz dazu haben Osteichthyes (Knochenfische) ein verknöchertes Skelett.",
        difficulty = 3,
        funFact = "Haie haben kein Schwimmblasenorgan und müssen ständig schwimmen, um nicht abzusinken."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Besondere an der Fortpflanzung des Seepferdchens?",
        answerA = "Das Weibchen bebrütet die Eier im Mund",
        answerB = "Das Männchen trägt die Eier in einem Beutel und gebiert die Jungtiere",
        answerC = "Seepferdchen sind Hermaphroditen",
        answerD = "Die Eier werden im offenen Wasser abgelegt",
        correctAnswer = 1,
        explanation = "Beim Seepferdchen übernimmt das Männchen die Schwangerschaft: Das Weibchen legt Eier in den Beutel des Männchens, wo sie befruchtet und ausgetragen werden.",
        difficulty = 3,
        funFact = "Ein Seepferdchen-Männchen kann bis zu 2.000 Jungtiere in einer Geburt auf einmal zur Welt bringen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gift produziert der Pfeilgiftfrosch selbst nicht – woher kommt es?",
        answerA = "Aus speziellen Giftdrüsen in der Haut",
        answerB = "Aus der Nahrung (Insekten mit Alkaloiden)",
        answerC = "Aus einer Symbiose mit Bakterien",
        answerD = "Es wird in der Leber produziert",
        correctAnswer = 1,
        explanation = "Pfeilgiftfrösche akkumulieren ihr Gift aus ihrer Nahrung – vor allem aus Ameisen, Käfern und Milben, die pflanzliche Alkaloide enthalten. In Gefangenschaft ohne diese Nahrung werden sie ungiftig.",
        difficulty = 3,
        funFact = "Indigene Völker Südamerikas nutzten das Batrachotoxin aus Pfeilgiftfröschen für vergiftete Blasrohrpfeile."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen Homologie und Analogie im Tierreich?",
        answerA = "Homologe Organe haben gleiche Funktion, analoge haben gemeinsamen Ursprung",
        answerB = "Homologe Organe haben gemeinsamen evolutionären Ursprung, analoge haben gleiche Funktion durch konvergente Evolution",
        answerC = "Homologien betreffen Verhaltensweisen, Analogien betreffen körperliche Merkmale",
        answerD = "Es gibt keinen relevanten Unterschied",
        correctAnswer = 1,
        explanation = "Homologe Organe haben den gleichen evolutionären Ursprung (z.B. Menschenhand und Flosse des Wals). Analoge Organe haben durch konvergente Evolution ähnliche Funktion, aber verschiedenen Ursprung (z.B. Insekten- und Vogelflügel).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Vogelart ist bekannt dafür, dass sie komplexe Werkzeuge aus Haken und Haften herstellt?",
        answerA = "Tannenhäher",
        answerB = "Neukaledonische Krähe (Corvus moneduloides)",
        answerC = "Grüner Specht",
        answerD = "Papagei",
        correctAnswer = 1,
        explanation = "Neukaledonische Krähen stellen aus Blättern und Zweigen Haken-Werkzeuge her, um Insektenlarven aus Rindenspalten zu angeln – eine der komplexesten Werkzeugnutzungen im Tierreich.",
        difficulty = 3,
        funFact = "Diese Krähen lösen mehrstufige Problemstellungen, die sogar für Kleinkinder herausfordernd sind."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Begriff 'Torpor' bei Tieren?",
        answerA = "Einen tiefen Schlafzustand identisch mit Winterschlaf",
        answerB = "Einen kurzfristigen Zustand reduzierter Körperfunktionen und Temperatur",
        answerC = "Einen dauerhaften Ruhezustand bei Wirbellosen",
        answerD = "Die sommerliche Version des Winterschlafs",
        correctAnswer = 1,
        explanation = "Torpor ist ein kurzfristiger Energiesparzustand mit stark reduzierter Körpertemperatur und Stoffwechsel. Er unterscheidet sich vom Winterschlaf durch seine Kürze und Umkehrbarkeit in Minuten.",
        difficulty = 3,
        funFact = "Kolibris fallen jede Nacht in Torpor – ohne diesen würden sie ihre Energiereserven über Nacht erschöpfen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Pheromon-Kommunikation bei Ameisen, die Wegmarkierungen hinterlässt?",
        answerA = "Trophallaxis",
        answerB = "Tandem Running",
        answerC = "Pheromonspur (Trail Pheromone)",
        answerD = "Rekrutierungstanz",
        correctAnswer = 2,
        explanation = "Ameisen hinterlassen chemische Duftspuren aus Pheromonen, die andere Arbeiterinnen zur Nahrungsquelle leiten. Je stärker die Spur, desto mehr Ameisen folgen ihr.",
        difficulty = 3,
        funFact = "Trophallaxis bezeichnet den Nahrungsaustausch zwischen Ameisen durch Mund-zu-Mund-Weitergabe von verdauten Substanzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat tatsächlich vier Gehirne (oder das Äquivalent)?",
        answerA = "Krake (Oktopus)",
        answerB = "Tintenfisch",
        answerC = "Blauwal",
        answerD = "Seestern",
        correctAnswer = 0,
        explanation = "Kraken haben ein zentrales Gehirn plus je ein Nervenganglion in jedem der 8 Tentakel – die Tentakel agieren damit weitgehend autonom und verarbeiten Informationen unabhängig vom Zentralgehirn.",
        difficulty = 3,
        funFact = "Etwa zwei Drittel der Neuronen eines Krakens befinden sich in seinen Tentakeln, nicht im Gehirn."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Viviparie' in der Zoologie?",
        answerA = "Lebendgeburt mit Placenta-ähnlicher Nährstoffversorgung",
        answerB = "Eierlegung mit anschließender Bebrütung",
        answerC = "Brutpflege im Maul",
        answerD = "Entwicklung der Jungen im Mutterleib ohne Placenta",
        correctAnswer = 0,
        explanation = "Viviparie bezeichnet die echte Lebendgeburt, bei der der Embryo über eine Placenta oder ähnliche Struktur mit Nährstoffen versorgt wird. Die meisten Säugetiere sind vivipar.",
        difficulty = 3,
        funFact = "Einige Hai-Arten sind ebenfalls vivipar – der Sandtigerhai zeigt sogar intrauterinen Kannibalismus."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier setzt bei Gefahr eine blaue Flüssigkeit aus seinen Poren frei?",
        answerA = "Krake",
        answerB = "Blauringkrake",
        answerC = "Schleimaal",
        answerD = "Blaue Pfeilgiftfrösche",
        correctAnswer = 2,
        explanation = "Der Schleimaal (Myxine) produziert bei Bedrohung enorme Mengen zähen Schleim aus Hunderten von Drüsen. Dieser Schleim kann die Kiemen von Fressfeinden verkleben.",
        difficulty = 3,
        funFact = "Aus dem Schleim des Schleimaaals entwickeln Forscher neue Materialien – er ist elastischer als Nylon und zäher als Kevlar."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie lange kann ein Grönlandwal (Bowhead Whale) leben?",
        answerA = "Bis zu 70 Jahre",
        answerB = "Bis zu 100 Jahre",
        answerC = "Bis zu 150 Jahre",
        answerD = "Über 200 Jahre",
        correctAnswer = 3,
        explanation = "Grönlandwale sind die ältesten bekannten Säugetiere – Individuen über 200 Jahre wurden dokumentiert. In Walkörpern wurden Harpunenspitzen aus dem 19. Jahrhundert gefunden.",
        difficulty = 3,
        funFact = "Grönlandwale haben die dickste Speckschicht aller Wale – bis zu 50 cm Isolierung."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Horn und einem Geweih?",
        answerA = "Hörner sind aus Knochen, Geweihe aus Keratin",
        answerB = "Hörner wachsen nicht nach, Geweihe werden jährlich abgeworfen und neu gebildet",
        answerC = "Geweihe haben keine Knochenbasis, Hörner schon",
        answerD = "Nur Männchen haben Hörner, nur Weibchen Geweihe",
        correctAnswer = 1,
        explanation = "Hörner (z.B. bei Rindern) bestehen aus einem Knochenzapfen mit einer Keratinhülle und wachsen lebenslang. Geweihe (z.B. bei Hirschen) sind reine Knochengebilde, werden jährlich abgeworfen und neu gebildet.",
        difficulty = 3,
        funFact = "Geweihe sind das am schnellsten wachsende Körpergewebe bei Säugetieren – bis zu 2,5 cm pro Tag."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Phänomen beschreibt den 'Müller'schen Körper' bei Ameisenpflanzen?",
        answerA = "Giftstoff zur Abwehr von Insekten",
        answerB = "Nährstoffreiche Körper als Nahrung für Symbiose-Ameisen",
        answerC = "Extrafloreale Nektarien an den Blättern",
        answerD = "Hohlräume als Nestplatz für Ameisenkolonien",
        correctAnswer = 1,
        explanation = "Müller'sche Körper sind eiweißreiche Strukturen an bestimmten Pflanzen (z.B. Cecropia), die als Nahrung für Schutzameisen dienen. Die Ameisen verteidigen im Gegenzug die Pflanze vor Herbivoren.",
        difficulty = 3,
        funFact = "Diese Wechselbeziehung ist ein klassisches Beispiel für Mutualismus – beide Partner profitieren voneinander."
    )
)
