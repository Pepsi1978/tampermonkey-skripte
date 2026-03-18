package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsEasy5(): List<Question> = listOf(

    // ── INSECTS & REPTILES — EASY (difficulty = 1) — 50 questions ────────────

    Question(
        categoryId = 9,
        questionText = "Wie viele Beine hat eine Biene?",
        answerA = "4",
        answerB = "8",
        answerC = "6",
        answerD = "10",
        correctAnswer = 2,
        explanation = "Wie alle Insekten hat die Biene genau 6 Beine. Das ist eines der wichtigsten Merkmale der Insekten.",
        difficulty = 1,
        funFact = "Eine Bienenkoenigin kann bis zu 2.000 Eier pro Tag legen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was produzieren Bienen als Nahrungsmittel fuer Menschen?",
        answerA = "Milch",
        answerB = "Honig",
        answerC = "Wachs",
        answerD = "Seide",
        correctAnswer = 1,
        explanation = "Bienen produzieren Honig aus Blutennektar. Er dient ihnen als Energiereserve fuer den Winter.",
        difficulty = 1,
        funFact = "Eine Biene produziert in ihrem ganzen Leben nur etwa einen Teeloessel Honig."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt ist fuer seine roten Fluegeldecken mit schwarzen Punkten bekannt?",
        answerA = "Marienkaefer",
        answerB = "Rosenkaefer",
        answerC = "Feuerwanze",
        answerD = "Schmetterling",
        correctAnswer = 0,
        explanation = "Der Marienkaefer ist an seinen roten Fluegeldecken mit schwarzen Punkten leicht zu erkennen. Er gilt als nuetzliches Insekt, weil er Blattlaeuse frisst.",
        difficulty = 1,
        funFact = "Der Marienkaefer hat seinen Namen von der Jungfrau Maria — fruehre Christen glaubten, er sei ihr geschickt worden, um Pflanzen zu schuetzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Larvenstadium eines Schmetterlings?",
        answerA = "Puppe",
        answerB = "Kokon",
        answerC = "Nymphe",
        answerD = "Raupe",
        correctAnswer = 3,
        explanation = "Schmetterlinge durchlaufen eine vollstaendige Verwandlung: Ei, Raupe, Puppe, fertiger Schmetterling.",
        difficulty = 1,
        funFact = "Manche Raupen fressen ihr eigenes Gewicht taeglich an Blaettern."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bauen Ameisen als Zuhause?",
        answerA = "Bienenwaben",
        answerB = "Termitenhuegelchen",
        answerC = "Ameisenhaufen",
        answerD = "Spinnweben",
        correctAnswer = 2,
        explanation = "Ameisen bauen Ameisenhaufen aus Erde, Holzfasern und Pflanzenteilen. Innen gibt es ein weitverzweigtes Gangsystem.",
        difficulty = 1,
        funFact = "Ein grosser Ameisenhaufen kann mehr als eine Million Ameisen beherbergen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Beine hat eine Spinne?",
        answerA = "6",
        answerB = "8",
        answerC = "10",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Spinnen haben 8 Beine und gehoeren damit zu den Spinnentieren (Arachnida), nicht zu den Insekten.",
        difficulty = 1,
        funFact = "Spinnen koennten theoretisch alle Insekten der Welt ernaehren — so viele fangen sie jaehrlich."
    ),

    Question(
        categoryId = 9,
        questionText = "Was webt eine Spinne, um Beute zu fangen?",
        answerA = "Ein Nest",
        answerB = "Ein Netz",
        answerC = "Einen Kokon",
        answerD = "Eine Hoehle",
        correctAnswer = 1,
        explanation = "Viele Spinnenarten weben Netze aus Spinnseide, um Insekten zu fangen. Die Seide ist fuer ihre Feinheit erstaunlich reissfest.",
        difficulty = 1,
        funFact = "Spinnenseide ist pro Gewichtseinheit fuenfmal so stark wie Stahl."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt saugt das Blut von Menschen und Tieren?",
        answerA = "Muecke",
        answerB = "Wespe",
        answerC = "Hummel",
        answerD = "Libelle",
        correctAnswer = 0,
        explanation = "Weibliche Muecken saugen Blut, um Proteine fuer ihre Eier zu gewinnen. Maennliche Muecken ernaehren sich nur von Pflanzensaft.",
        difficulty = 1,
        funFact = "Muecken sind die gefaehrlichsten Tiere der Welt — durch von ihnen uebertragene Krankheiten sterben jaehrlich ueber eine Million Menschen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Schmetterling in seinem dritten Lebensstadium?",
        answerA = "Raupe",
        answerB = "Ei",
        answerC = "Puppe",
        answerD = "Larve",
        correctAnswer = 2,
        explanation = "Die Verwandlung des Schmetterlings geht: Ei, Raupe, Puppe, fertiger Schmetterling. In der Puppe findet die Metamorphose statt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist ein Krokodil?",
        answerA = "Ein Saeugetier",
        answerB = "Ein Reptil",
        answerC = "Ein Amphibium",
        answerD = "Ein Fisch",
        correctAnswer = 1,
        explanation = "Krokodile sind Reptilien. Sie sind wechselwarm, atmen Luft und haben eine schuppige Haut.",
        difficulty = 1,
        funFact = "Krokodile gibt es bereits seit ueber 200 Millionen Jahren — sie lebten zur Zeit der Dinosaurier."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bewegt sich eine Schlange fort?",
        answerA = "Sie springt",
        answerB = "Sie laeuft auf Beinen",
        answerC = "Sie schwimmt ausschliesslich",
        answerD = "Sie schlaengelt sich auf dem Boden",
        correctAnswer = 3,
        explanation = "Schlangen haben keine Beine und bewegen sich durch Schlaengelbewegungen vorwaerts, bei denen sie Muskeln und Schuppen nutzen.",
        difficulty = 1,
        funFact = "Manche Schlangenarten koennen klettern, schwimmen und sogar kurze Strecken gleiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft macht den Chamaelon bekannt?",
        answerA = "Es kann fliegen",
        answerB = "Es kann seine Farbe wechseln",
        answerC = "Es ist giftig",
        answerD = "Es hat kein Schwanz",
        correctAnswer = 1,
        explanation = "Chamaeleons koennen ihre Hautfarbe veraendern, hauptsaechlich zur Kommunikation und Stimmungsanzeige, aber auch zur Tarnung.",
        difficulty = 1,
        funFact = "Die Zunge eines Chamaeleons ist oft laenger als sein gesamter Koerper."
    ),

    Question(
        categoryId = 9,
        questionText = "Was traegt eine Schildkroete auf dem Ruecken?",
        answerA = "Federn",
        answerB = "Schuppen",
        answerC = "Einen Panzer",
        answerD = "Ein Fell",
        correctAnswer = 2,
        explanation = "Der knochige Panzer der Schildkroete ist mit ihrer Wirbelsaeule verwachsen. Er schuetzt sie vor Fressfeinden.",
        difficulty = 1,
        funFact = "Schildkroeten koennen mehrere hundert Jahre alt werden — sie sind damit die laengstlebenden Wirbeltiere der Welt."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Haut der Schlange, die sie regelmaessig abwirft?",
        answerA = "Fell",
        answerB = "Panzer",
        answerC = "Balghaeutchen",
        answerD = "Hautbalg",
        correctAnswer = 3,
        explanation = "Schlangen hauten sich regelmaessig, da ihre Haut nicht mitwachst. Diesen Vorgang nennt man Haeutung.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was fressen Libellen hauptsaechlich?",
        answerA = "Blattlaeuse",
        answerB = "Muecken und kleine Insekten",
        answerC = "Pflanzen",
        answerD = "Honig",
        correctAnswer = 1,
        explanation = "Libellen sind effektive Raubtiere und fangen im Flug Muecken, Fliegen und andere kleine Insekten.",
        difficulty = 1,
        funFact = "Libellen haben eine Fangerfolgsquote von ueber 90 Prozent — sie sind damit einer der erfolgreichsten Jaeger im Tierreich."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiergruppe kann Gecko sein?",
        answerA = "Saeugetiere",
        answerB = "Reptilien",
        answerC = "Amphibien",
        answerD = "Voegel",
        correctAnswer = 1,
        explanation = "Geckos sind kleine Reptilien. Sie gehoeren zur Unterordnung der Schuppenkriechtiere.",
        difficulty = 1,
        funFact = "Geckos koennen an glatten Waenden und sogar an der Decke laufen, weil ihre Zehenunterseiten Millionen winziger Haerchen besitzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Fluegel hat eine Biene?",
        answerA = "2",
        answerB = "4",
        answerC = "6",
        answerD = "Keine",
        correctAnswer = 1,
        explanation = "Bienen haben 4 Fluegel, die beim Fliegen durch Haken miteinander verbunden werden und gemeinsam schlagen.",
        difficulty = 1,
        funFact = "Bienen schlagen ihre Fluegel etwa 200-mal pro Sekunde — das erzeugt das typische Summen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sammeln Bienen aus Blueten?",
        answerA = "Pollen und Nektar",
        answerB = "Blaetter und Zweige",
        answerC = "Wasser und Erde",
        answerD = "Larven und Eier",
        correctAnswer = 0,
        explanation = "Bienen sammeln Nektar (wird zu Honig) und Pollen (als Proteinfutter fuer die Larven) aus Blueten.",
        difficulty = 1,
        funFact = "Eine Biene besucht bis zu 1.500 Blueten pro Tag auf der Suche nach Nektar."
    ),

    Question(
        categoryId = 9,
        questionText = "Was fressen Raupen hauptsaechlich?",
        answerA = "Andere Insekten",
        answerB = "Blaetter und Pflanzen",
        answerC = "Honig",
        answerD = "Holz",
        correctAnswer = 1,
        explanation = "Raupen sind Pflanzenfresser und ernaehren sich hauptsaechlich von Blaettern. Jede Raupenart bevorzugt oft bestimmte Pflanzenarten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Farbe hat ein typischer Marienkaefer?",
        answerA = "Blau mit weissen Punkten",
        answerB = "Gelb mit braunen Streifen",
        answerC = "Rot mit schwarzen Punkten",
        answerD = "Gruen mit roten Punkten",
        correctAnswer = 2,
        explanation = "Der bekannteste Marienkaefer ist rot mit schwarzen Punkten. Es gibt aber auch gelbe, schwarze und andere Farbvarianten.",
        difficulty = 1,
        funFact = "Die Anzahl der Punkte sagt nichts ueber das Alter des Marienkaefers aus — sie ist artspezifisch."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Zuhause einer Biene?",
        answerA = "Bau",
        answerB = "Nest",
        answerC = "Bienenstock",
        answerD = "Hoehle",
        correctAnswer = 2,
        explanation = "Honigbienen leben in einem Bienenstock, den Menschen als Kasten oder Beute bauen. Wildvorkommen befinden sich oft in hohlen Baeumen.",
        difficulty = 1,
        funFact = "In einem Bienenstock leben im Sommer bis zu 80.000 Bienen zusammen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sind Ameisen?",
        answerA = "Spinnen",
        answerB = "Kaefer",
        answerC = "Insekten",
        answerD = "Milben",
        correctAnswer = 2,
        explanation = "Ameisen sind Insekten aus der Ordnung der Hautfluegel. Sie leben in hochorganisierten Staaten.",
        difficulty = 1,
        funFact = "Ameisen koennen das 50-fache ihres eigenen Koerpergewichts tragen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Reptil ist fuer seinen langen Hals und seine Groesse bekannt und lebt in Afrika?",
        answerA = "Nil-Monitor",
        answerB = "Panzernashorn",
        answerC = "Nil-Krokodil",
        answerD = "Komodo-Waran",
        correctAnswer = 2,
        explanation = "Das Nil-Krokodil ist eines der groessten Reptilien Afrikas und lebt in Fluessen und Seen des Kontinents.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt macht das Geraeusch 'Grillen' oder 'Zirpen'?",
        answerA = "Grashuefer",
        answerB = "Grille",
        answerC = "Heuschrecke",
        answerD = "Kaeferpuppe",
        correctAnswer = 1,
        explanation = "Grillen erzeugen das typische Zirpen, indem sie ihre Fluegel aneinander reiben. Nur Maennchen zirpen.",
        difficulty = 1,
        funFact = "Je waermer es ist, desto schneller zirpen Grillen. Man kann die Aussentemperatur durch die Zirpfrequenz abschaetzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Womit sticht eine Biene?",
        answerA = "Mit ihren Mandibeln",
        answerB = "Mit ihrem Stachel",
        answerC = "Mit ihrer Zunge",
        answerD = "Mit ihren Vorderbeinen",
        correctAnswer = 1,
        explanation = "Bienen haben am Hinterleib einen Stachel, mit dem sie Gift in die Haut spritzen koennen. Arbeitsbienen sterben nach dem Stich.",
        difficulty = 1,
        funFact = "Eine Bienenkoenigin hat einen glatten Stachel und kann deshalb mehrmals stechen, ohne zu sterben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist eine Heuschrecke?",
        answerA = "Ein Reptil",
        answerB = "Ein Amphibium",
        answerC = "Ein Insekt",
        answerD = "Ein Spinnentier",
        correctAnswer = 2,
        explanation = "Heuschrecken sind Insekten mit langen Sprungbeinen. Sie gehoeren zur Ordnung der Orthoptera.",
        difficulty = 1,
        funFact = "Eine Wanderheuschrecke kann pro Tag bis zu 130 Kilometer zuruecklegen und dabei riesige Ernteschaeden anrichten."
    ),

    Question(
        categoryId = 9,
        questionText = "Wo legt eine Schlange ihre Eier ab?",
        answerA = "Im Wasser",
        answerB = "In warmen, geschuetzten Verstecken am Boden",
        answerC = "In Baumhoehlen hoch oben",
        answerD = "In Spinnennetzen",
        correctAnswer = 1,
        explanation = "Die meisten Schlangen legen Eier in warme, geschuetzte Stellen wie Kompost, Laub oder Erdhoehlen. Einige gebaeren lebende Junge.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das Summen oder Zirpen, das Insekten erzeugen koennen?",
        answerA = "Gesang",
        answerB = "Laut",
        answerC = "Stridulation",
        answerD = "Schnattern",
        correctAnswer = 2,
        explanation = "Das Geraeuschmachen durch Reiben von Koerperteilen (wie bei Grillen und Heuschrecken) nennt man Stridulation.",
        difficulty = 1,
        funFact = "Maennliche Grillen und Heuschrecken stridulieren hauptsaechlich, um Weibchen anzulocken."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier gilt als gaengiges Beispiel fuer eine harmlose Eidechse in Deutschland?",
        answerA = "Komodo-Waran",
        answerB = "Smaragdeidechse",
        answerC = "Zauneidechse",
        answerD = "Gecko",
        correctAnswer = 2,
        explanation = "Die Zauneidechse ist eine in Deutschland heimische, harmlose Eidechsenart. Sie lebt an sonnigen Stellen.",
        difficulty = 1,
        funFact = "Eidechsen koennen ihren Schwanz abwerfen, wenn sie von einem Feind gepackt werden. Der Schwanz waechst wieder nach."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Augen hat eine Stubenfliege?",
        answerA = "2 einfache Augen",
        answerB = "4 Augen",
        answerC = "2 grosse Facettenaugen",
        answerD = "Keine Augen",
        correctAnswer = 2,
        explanation = "Fliegen haben zwei grosse Facettenaugen, die aus tausenden von Einzellinsen bestehen und ein breites Sichtfeld geben.",
        difficulty = 1,
        funFact = "Fliegen koennen ultraviolettes Licht sehen, das fuer Menschen unsichtbar ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die bekannteste giftige Schlange Deutschlands?",
        answerA = "Ringelnatter",
        answerB = "Koenig Kobra",
        answerC = "Kreuzotter",
        answerD = "Schlingnatter",
        correctAnswer = 2,
        explanation = "Die Kreuzotter ist die einzige in Deutschland heimische Giftschlange. Ihr Biss ist schmerzhaft, aber fuer gesunde Erwachsene selten lebensgefaehrlich.",
        difficulty = 1,
        funFact = "Die Kreuzotter ist an dem typischen Zickzack-Muster auf ihrem Ruecken zu erkennen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was fressen Krokodile hauptsaechlich?",
        answerA = "Pflanzen und Algen",
        answerB = "Fische, Voegel und Saeugetiere",
        answerC = "Insekten",
        answerD = "Nur Fische",
        correctAnswer = 1,
        explanation = "Krokodile sind Fleischfresser und ernaehren sich je nach Groesse von Fischen, Voegeln, Antilopen und anderen Tieren.",
        difficulty = 1,
        funFact = "Krokodile koennen monatelang ohne Nahrung auskommen, wenn es noetig ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Hauptmerkmal aller Insekten?",
        answerA = "Sie koennen fliegen",
        answerB = "Sie leben im Wasser",
        answerC = "Sie haben 6 Beine",
        answerD = "Sie sind giftig",
        correctAnswer = 2,
        explanation = "Das wichtigste Merkmal aller Insekten sind genau 6 Beine. Ausserdem haben Insekten 3 Koerperabschnitte: Kopf, Brust und Hinterleib.",
        difficulty = 1,
        funFact = "Es gibt mehr als eine Million bekannte Insektenarten — das sind mehr als alle anderen Tierarten zusammen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Verwandlung einer Raupe in einen Schmetterling?",
        answerA = "Evolution",
        answerB = "Metamorphose",
        answerC = "Haeutung",
        answerD = "Wachstum",
        correctAnswer = 1,
        explanation = "Die vollstaendige Verwandlung vom Ei ueber Raupe und Puppe zum erwachsenen Tier nennt man Metamorphose.",
        difficulty = 1,
        funFact = "Waehrend die Raupe in der Puppe steckt, loest sich ihr Koerper fast vollstaendig auf und wird komplett neu aufgebaut."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist der Gecko?",
        answerA = "Ein Insekt",
        answerB = "Ein Amphibium",
        answerC = "Ein Reptil",
        answerD = "Ein Spinnentier",
        correctAnswer = 2,
        explanation = "Geckos sind kleine bis mittelgrosse Reptilien, die weltweit in warmen Regionen vorkommen.",
        difficulty = 1,
        funFact = "Geckos sind die einzigen Reptilien, die echte Laute von sich geben koennen — sie kommunizieren mit Pfeif- und Klicklauten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Hauptaufgabe der Koenigin in einem Bienenvolk?",
        answerA = "Honig produzieren",
        answerB = "Das Volk verteidigen",
        answerC = "Eier legen",
        answerD = "Pollen sammeln",
        correctAnswer = 2,
        explanation = "Die Bienenkoenigin ist die einzige fortpflanzungsfaehige Biene im Volk. Ihre einzige Aufgabe ist das Legen von Eiern.",
        difficulty = 1,
        funFact = "Eine Bienenkoenigin kann bis zu 5 Jahre alt werden, waehrend Arbeiterinnen nur 6 Wochen leben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist eine Libelle?",
        answerA = "Ein Spinnentier",
        answerB = "Ein Insekt",
        answerC = "Ein Amphibium",
        answerD = "Ein Reptil",
        correctAnswer = 1,
        explanation = "Libellen sind Insekten mit zwei Paar Fluegel. Sie leben als Larven im Wasser und als Erwachsene in der Luft.",
        difficulty = 1,
        funFact = "Libellen koennen in alle Richtungen fliegen, sogar rueckwaerts — eine Faehigkeit, die kaum ein anderes Insekt hat."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man eine Schildkroete, die im Meer lebt?",
        answerA = "Flussschildkroete",
        answerB = "Meeresschildkroete",
        answerC = "Landschildkroete",
        answerD = "Sumpfschildkroete",
        correctAnswer = 1,
        explanation = "Im Meer lebende Schildkroeten heissen Meeresschildkroeten. Sie sind groesser als ihre Verwandten an Land.",
        difficulty = 1,
        funFact = "Meeresschildkroeten kehren immer an den Strand zurueck, an dem sie selbst geschluepft sind, um ihre Eier zu legen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Schmetterling nach seiner vollstaendigen Entwicklung?",
        answerA = "Eine Raupe",
        answerB = "Eine Puppe",
        answerC = "Ein fliegendes Insekt",
        answerD = "Ein Kaefer",
        correctAnswer = 2,
        explanation = "Nach der Metamorphose ist der Schmetterling ein gefluegeltes Insekt. Er ernaehrt sich nun hauptsaechlich von Blutennektar.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Koerperteile haben alle Insekten gemeinsam?",
        answerA = "Fluegel und Stachel",
        answerB = "Kopf, Brust und Hinterleib",
        answerC = "Scheren und Fuehler",
        answerD = "Panzer und Schuppen",
        correctAnswer = 1,
        explanation = "Alle Insekten haben drei Koerperabschnitte: Kopf, Brust (Thorax) und Hinterleib (Abdomen).",
        difficulty = 1,
        funFact = "Die Brust der Insekten traegt alle Beine und, wenn vorhanden, die Fluegel."
    ),

    Question(
        categoryId = 9,
        questionText = "Womit haelt sich ein Gecko an Waenden und Decken fest?",
        answerA = "Mit Saugnaefen",
        answerB = "Mit Klebstoff",
        answerC = "Mit Millionen winziger Haerchen an den Zehen",
        answerD = "Mit spitzen Krallen",
        correctAnswer = 2,
        explanation = "Geckos haften dank Millionen mikroskopisch kleiner Haerchen (Setae) an den Zehenunterseiten, die van-der-Waals-Kraefte erzeugen.",
        difficulty = 1,
        funFact = "Geckos koennen eine Flaeche von einem Quadratmeter halten, obwohl sie selbst nur wenige Gramm wiegen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was fressen Ameisen?",
        answerA = "Nur Nektar",
        answerB = "Fast alles: Zucker, Insekten, Pilze",
        answerC = "Ausschliesslich Blattlaeuse",
        answerD = "Nur Holz",
        correctAnswer = 1,
        explanation = "Ameisen sind Allesfresser. Je nach Art fressen sie Samen, Insekten, Pilze, Fruechte oder zuckerhaltigen Honigtau von Blattlaeusen.",
        difficulty = 1,
        funFact = "Manche Ameisenarten halten Blattlaeuse wie Nutztiere und 'melken' sie regelmaessig fuer ihren Honigtau."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Sinnesorgane sitzen bei Insekten am Kopf?",
        answerA = "Flossen und Schuppen",
        answerB = "Stacheln und Krallen",
        answerC = "Fuehler (Antennen) und Facettenaugen",
        answerD = "Zaehne und Zunge",
        correctAnswer = 2,
        explanation = "Insekten haben Fuehler (Antennen) zum Riechen und Tasten sowie Facettenaugen fuer das Sehen.",
        difficulty = 1,
        funFact = "Einige Schmetterlinge 'schmecken' mit ihren Fuessen — so erkennen sie, ob eine Pflanze als Eiablage geeignet ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Ringelnatter in Deutschland?",
        answerA = "Eine giftige Schlange",
        answerB = "Eine ungiftige Schlange",
        answerC = "Eine Eidechse",
        answerD = "Ein Krokodil",
        correctAnswer = 1,
        explanation = "Die Ringelnatter ist die haeufigste Schlange Deutschlands und voellig ungiftig. Sie ist am gelben Halsfleck erkennbar.",
        difficulty = 1,
        funFact = "Wenn die Ringelnatter bedroht wird, kann sie sich totstellen und einen unangenehmen Geruch absondern."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das gruenartige Insekt, das gut getarnt auf Blaettern sitzt?",
        answerA = "Stabheuschrecke",
        answerB = "Gottesanbeterin",
        answerC = "Wandelndes Blatt",
        answerD = "Gruene Heuschrecke",
        correctAnswer = 1,
        explanation = "Die Gottesanbeterin ist ein Insekt, das ausgezeichnet auf Blaettern getarnt ist und mit seinen Vorderbeinen Beute greift.",
        difficulty = 1,
        funFact = "Die Gottesanbeterin ist das einzige Insekt, das seinen Kopf um 180 Grad drehen kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Wo legt ein Schmetterling seine Eier ab?",
        answerA = "Im Wasser",
        answerB = "Auf Pflanzen, die als Nahrung fuer die Raupen dienen",
        answerC = "Im Boden",
        answerD = "In Baumrinde",
        correctAnswer = 1,
        explanation = "Schmetterlinge legen ihre Eier gezielt auf Pflanzen ab, die die spaeter schluepfenden Raupen als Nahrung benoetigen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Merkmal unterscheidet Reptilien von Amphibien?",
        answerA = "Reptilien koennen schwimmen",
        answerB = "Reptilien haben immer trockene, schuppige Haut",
        answerC = "Reptilien sind immer giftig",
        answerD = "Reptilien haben keine Augen",
        correctAnswer = 1,
        explanation = "Reptilien haben eine trockene, schuppige Haut und sind nicht auf Wasser angewiesen. Amphibien dagegen haben feuchte Haut.",
        difficulty = 1,
        funFact = "Reptilien waren die ersten Wirbeltiere, die vollstaendig landleben konnten — ihre Eier brauchen kein Wasser."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist eine Hornisse?",
        answerA = "Eine grosse Ameisenart",
        answerB = "Eine Spinne",
        answerC = "Eine grosse Wespenart",
        answerD = "Ein Kaefer",
        correctAnswer = 2,
        explanation = "Die Hornisse ist die groesste in Deutschland heimische Wespenart. Sie baut grosse Papiernester aus zerkautem Holz.",
        difficulty = 1,
        funFact = "Hornissen sind in Wirklichkeit weniger aggressiv als Wespen und stechen nur, wenn sie oder ihr Nest bedroht werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Frosch fuer ein Tier?",
        answerA = "Ein Reptil",
        answerB = "Ein Insekt",
        answerC = "Ein Amphibium",
        answerD = "Ein Fisch",
        correctAnswer = 2,
        explanation = "Frosche sind Amphibien. Sie leben sowohl im Wasser (als Kaulquappen) als auch an Land (als erwachsene Tiere).",
        difficulty = 1,
        funFact = "Der Pfeilgiftfrosch in Suedamerika ist eines der giftigsten Tiere der Welt — sein Gift wird von einheimischen Voelkern auf Blasrohrpfeile aufgetragen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Larve eines Froschs?",
        answerA = "Raupe",
        answerB = "Nymphe",
        answerC = "Kaulquappe",
        answerD = "Made",
        correctAnswer = 2,
        explanation = "Die Larve des Froschs heisst Kaulquappe. Sie lebt im Wasser und verwandelt sich nach einigen Wochen in einen Frosch.",
        difficulty = 1,
        funFact = "Kaulquappen atmen mit Kiemen wie Fische — erst wenn sie Lungen entwickeln, koennen sie an Land leben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was isst ein Gecko am liebsten?",
        answerA = "Pflanzen und Blueten",
        answerB = "Insekten und kleine Spinnen",
        answerC = "Honig und Nektar",
        answerD = "Samen und Fruechte",
        correctAnswer = 1,
        explanation = "Geckos sind Fleischfresser und jagen hauptsaechlich Insekten, Spinnen und andere kleine Gliedertiere.",
        difficulty = 1,
        funFact = "Hausgeckos in tropischen Laendern werden von Einheimischen gerne geduldet, weil sie Muecken und Kakerlaken fressen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sind Termiten?",
        answerA = "Eine Ameisenart",
        answerB = "Soziale Insekten, die Holz fressen",
        answerC = "Kleine Eidechsen",
        answerD = "Wasserinsekten",
        correctAnswer = 1,
        explanation = "Termiten sind soziale Insekten, die in grossen Kolonien leben und sich hauptsaechlich von Holz und Zellulose ernaehren.",
        difficulty = 1,
        funFact = "Termiten bauen die relativ groessten Bauwerke im Tierreich — ihre Huegelkonstruktionen koennen 9 Meter hoch werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier schluepft aus einem Ei und waechst zur Schlange?",
        answerA = "Krokodil",
        answerB = "Kobra",
        answerC = "Schildkroete",
        answerD = "Frosch",
        correctAnswer = 1,
        explanation = "Die Kobra ist eine Schlange, die aus Eiern schluepft. Sie ist eine der bekanntesten Giftschlangen der Welt.",
        difficulty = 1,
        funFact = "Die Koenigskobra ist die laengste Giftschlange der Welt und kann bis zu 5 Meter lang werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was macht eine Spinne mit gefangener Beute?",
        answerA = "Sie kaut sie auf",
        answerB = "Sie schluckt sie ganz",
        answerC = "Sie injiziert Verdauungssaefte und saugt den verfluessigten Inhalt aus",
        answerD = "Sie bringt sie zum Nest und lagert sie",
        correctAnswer = 2,
        explanation = "Spinnen koennen keine feste Nahrung verdauen. Sie spitzen Verdauungssaefte in die Beute und saugen dann den verfluessigten Inhalt aus.",
        difficulty = 1,
        funFact = null
    ),

)
