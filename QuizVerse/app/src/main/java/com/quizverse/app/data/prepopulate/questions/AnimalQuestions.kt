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
    )
)
