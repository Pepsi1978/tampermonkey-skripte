package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsExpert2(): List<Question> = listOf(

    // ── EXPERT (difficulty = 4) — Zoological Taxonomy & Evolutionary Biology ──

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung umfasst die Fledermaeuse (Chiroptera) nach der aktuellen phylogenetischen Klassifikation innerhalb der Saeugetiere?",
        answerA = "Eulipotyphla",
        answerB = "Laurasiatheria",
        answerC = "Scrotifera",
        answerD = "Boreoeutheria",
        correctAnswer = 2,
        explanation = "Fledermaeuse (Chiroptera) gehoeren zur Gruppe Scrotifera innerhalb von Laurasiatheria. Scrotifera vereint Chiroptera, Carnivora, Perissodactyla und Cetartiodactyla als Schwesterklade.",
        difficulty = 4,
        funFact = "Chiroptera ist mit ueber 1.400 Arten die zweitgroesste Ordnung der Saeugetiere nach den Nagetieren (Rodentia)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Hox-Gen-Cluster ist bei Wirbeltieren fuer die anterior-posteriore Musterbildung der Hinterextremitaeten besonders massgeblich?",
        answerA = "HoxA-Cluster",
        answerB = "HoxB-Cluster",
        answerC = "HoxC-Cluster",
        answerD = "HoxD-Cluster",
        correctAnswer = 3,
        explanation = "Der HoxD-Cluster, insbesondere die Gene Hoxd9-Hoxd13, ist entscheidend fuer die Musterbildung der Hinterextremitaeten. Mutationen in Hoxd13 fuehren zu Synpolydaktylie beim Menschen.",
        difficulty = 4,
        funFact = "Die Hox-Gene sind bei allen Bilateria hochkonserviert — dasselbe Gen steuert bei der Fruchtfliege den Hinterleib und beim Maeuschen den Schwanz."
    ),

    Question(
        categoryId = 9,
        questionText = "Zur welcher Familie gehoert der Okapi (Okapia johnstoni) nach der zoologischen Systematik?",
        answerA = "Bovidae",
        answerB = "Cervidae",
        answerC = "Giraffidae",
        answerD = "Antilocapridae",
        correctAnswer = 2,
        explanation = "Der Okapi gehoert zur Familie Giraffidae und ist der einzige rezente Verwandte der Giraffe. Trotz seiner zebraaehnlichen Zeichnung ist er kein Zebra-Verwandter.",
        difficulty = 4,
        funFact = "Der Okapi wurde der Wissenschaft erst 1901 bekannt — er war eines der letzten grossen Saeugetiere, die von der Wissenschaft beschrieben wurden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus beschreibt den Gruendungseffekt (Founder Effect) in der Populationsgenetik am praezisesten?",
        answerA = "Selektion auf seltene Allele durch Praedatoren",
        answerB = "Verlust genetischer Vielfalt durch Gruendung einer Population durch wenige Individuen",
        answerC = "Zunahme der Heterozygotie durch Isolation",
        answerD = "Fixierung vorteilhafter Mutationen durch positive Selektion",
        correctAnswer = 1,
        explanation = "Der Gruendungseffekt beschreibt den Verlust genetischer Variabilitaet, wenn eine neue Population von wenigen Individuen gegruendet wird, die nur einen Bruchteil der genetischen Vielfalt der Ursprungspopulation tragen.",
        difficulty = 4,
        funFact = "Die Amish-Bevoelkerung in Pennsylvania zeigt starken Founder-Effekt: Ellis-van-Creveld-Syndrom tritt dort 100x haeufiger auf als in der Normalbevoelkerung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Klade vereint Cetacea (Wale) und Artiodactyla (Paarhufer) in der modernen molekularen Systematik?",
        answerA = "Perissodactyla",
        answerB = "Ferae",
        answerC = "Cetartiodactyla",
        answerD = "Zooamata",
        correctAnswer = 2,
        explanation = "Cetartiodactyla ist die Klade, die Wale und Paarhufer vereint. Molekulare Daten zeigen, dass Wale innerhalb der Artiodactyla entstanden sind, mit Flusspferden als naechsten lebenden Verwandten.",
        difficulty = 4,
        funFact = "Das Pakicetus, ein landbewohnendes Saeugetier aus dem Eozaen vor ~50 Mio. Jahren, gilt als Vorfahre der heutigen Wale."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Gattung der Familie Felidae zeigt als einzige ausgepraegten kooperativen Gruppenjagd und komplexe Sozialstruktur?",
        answerA = "Panthera",
        answerB = "Acinonyx",
        answerC = "Puma",
        answerD = "Leo (Panthera leo)",
        correctAnswer = 3,
        explanation = "Loewen (Panthera leo, frueher auch als Leo leo klassifiziert) sind die einzigen Feliden mit stabiler Gruppenstruktur (Rudel) und koordinierter Kooperativjagd. Alle anderen Katzenarten sind Solitaerjaeger.",
        difficulty = 4,
        funFact = "Koeninnen eines Loewenrudels sind oft miteinander verwandt — die Rudel-Struktur basiert auf verwandtschaftlicher Kooperation (Kin Selection nach Hamilton)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Fossil markiert den Uebergang von Reptilien zu Saeugetieren und zeigt charakteristische Zahnmerkmale beider Gruppen?",
        answerA = "Tiktaalik roseae",
        answerB = "Morganucodon",
        answerC = "Archaeopteryx lithographica",
        answerD = "Dimetrodon limbatus",
        correctAnswer = 1,
        explanation = "Morganucodon aus dem Spaeteren Trias/fruehen Jura (~205 Mio. Jahre) zeigt sowohl reptilisches Kiefergelenk (Articulare-Quadratum) als auch saeugetierartige Zahnmorphologie (Diphyodontie, differenzierte Zaehne).",
        difficulty = 4,
        funFact = "Die Gehoerknoechelchen der Saeugetiere (Hammer, Amboss) sind evolutionaer umgewandelte Kieferknochen der Reptilien — ein klassisches Beispiel fuer Exaptation."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Methode der molekularen Phylogenetik verwendet eine Wahrscheinlichkeitsfunktion, um den evolutionaer plausibelsten Stammbaum zu berechnen?",
        answerA = "UPGMA (Unweighted Pair Group Method)",
        answerB = "Parsimoniemethode (Cladistik)",
        answerC = "Maximum-Likelihood-Methode",
        answerD = "Neighbour-Joining",
        correctAnswer = 2,
        explanation = "Die Maximum-Likelihood-Methode berechnet, unter welchem Baummodell die beobachteten Sequenzdaten die hoechste Wahrscheinlichkeit (Likelihood) haben. Sie ist rechnerisch aufwaendig, aber statistisch sehr robust.",
        difficulty = 4,
        funFact = "Modern wird oft die Bayesianische Inferenz eingesetzt, die posteriore Wahrscheinlichkeiten fuer Baumtopologien berechnet — ein Verfahren, das erst durch schnelle Computer praktikabel wurde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff beschreibt in der Evo-Devo-Biologie die Veraenderung des Entwicklungszeitplans, bei der Juvenile Merkmale im Adultstadium erhalten bleiben?",
        answerA = "Peramorphose",
        answerB = "Heterochronie",
        answerC = "Neotenie",
        answerD = "Rekombination",
        correctAnswer = 2,
        explanation = "Neotenie (Paedomorphose durch Neotenie) bezeichnet das Beibehalten juveniler Merkmale im adulten Stadium durch Verlangsamung der somatischen Entwicklung. Der Axolotl ist ein Paradebeispiel: er erreicht die Geschlechtsreife in einem larvaeren Zustand.",
        difficulty = 4,
        funFact = "Manche Wissenschaftler argumentieren, dass auch der Mensch neotenische Merkmale gegenueber anderen Primaten zeigt: grosser Kopf, flaches Gesicht, Neugier, langes Lernen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung der Insekten gilt nach aktueller Phylogenie als Schwestergruppe der Hymenoptera (Hautfluegler)?",
        answerA = "Coleoptera",
        answerB = "Diptera",
        answerC = "Lepidoptera",
        answerD = "Mecoptera",
        correctAnswer = 3,
        explanation = "Mecoptera (Schnabelhafte) gelten als Schwestergruppe der Hymenoptera innerhalb der Holometabola. Diese phylogenetische Position wurde durch morphologische und molekulare Analysen bestaetigt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Bezeichnung traegt das Konzept, nach dem sich zwei Populationen durch geographische Isolation und anschliessende allopatrische Artbildung trennen?",
        answerA = "Sympatrische Speziation",
        answerB = "Peripatrische Speziation",
        answerC = "Allopatrische Speziation",
        answerD = "Parapatrische Speziation",
        correctAnswer = 2,
        explanation = "Allopatrische Speziation tritt auf, wenn zwei Populationen raeumlich vollstaendig getrennt werden (z.B. durch Gebirge, Meere) und sich in Isolation durch genetische Drift und Selektion auseinanderentwickeln.",
        difficulty = 4,
        funFact = "Die Darwinfinken auf den Galapagos-Inseln sind ein Paradebeispiel fuer adaptive Radiation nach allopatrischer Speziation von einem gemeinsamen Vorfahren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Familie gehoert innerhalb der Ordnung Primates zur Ueberfamilie Cercopithecoidea (Altweltaffen)?",
        answerA = "Hylobatidae",
        answerB = "Hominidae",
        answerC = "Cercopithecidae",
        answerD = "Callitrichidae",
        correctAnswer = 2,
        explanation = "Cercopithecidae (Meerkatzenartige) ist die einzige Familie der Ueberfamilie Cercopithecoidea. Sie umfasst u.a. Makaken, Paviane, Mangaben und Colobinae (Blaetterfresser).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein-kodierende Gen wird als universeller Barcode fuer die Tierartenidentifizierung am haeufigsten eingesetzt?",
        answerA = "16S rRNA",
        answerB = "Cytochrom-c-Oxidase-Untereinheit I (COI/COX1)",
        answerC = "Cytochrom b",
        answerD = "28S rDNA",
        correctAnswer = 1,
        explanation = "Das mitochondriale COI-Gen (Cytochrom-c-Oxidase-Untereinheit I) ist der Standard-DNA-Barcode fuer Tiere (Initiative des BOLD-Systems). Es variiert zwischen Arten stark, ist innerhalb einer Art aber konserviert.",
        difficulty = 4,
        funFact = "Das DNA-Barcoding-Projekt BOLD (Barcode of Life Data System) hat bisher ueber 10 Millionen Sequenzen von mehr als 500.000 Tierarten archiviert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Fisch aus der Ordnung Coelacanthiformes gilt als lebendiges Fossil und wurde 1938 wiederentdeckt?",
        answerA = "Latimeria chalumnae",
        answerB = "Polypterus senegalus",
        answerC = "Neoceratodus forsteri",
        answerD = "Acipenser sturio",
        correctAnswer = 0,
        explanation = "Latimeria chalumnae (Quastenflosser) wurde 1938 vor Suedafrika gefangen. Diese Art gehoert zu den Coelacanthiformes, die bis dahin nur als Fossilien bekannt waren und als seit 66 Mio. Jahren ausgestorben galten.",
        difficulty = 4,
        funFact = "1999 wurde eine zweite Art, Latimeria menadoensis, in indonesischen Gewaessern entdeckt — genetisch bereits deutlich von L. chalumnae getrennt."
    ),

    Question(
        categoryId = 9,
        questionText = "In welche Unterordnung werden die Bartenwale (Mysticeti) und die Zahnwale (Odontoceti) zusammengefasst?",
        answerA = "Archaeoceti",
        answerB = "Sie bilden zusammen die Ordnung Cetacea ohne Unterordnung",
        answerC = "Neoceti",
        answerD = "Pelagiceti",
        correctAnswer = 2,
        explanation = "Mysticeti und Odontoceti bilden gemeinsam die Klade Neoceti innerhalb der Ordnung Cetacea. Archaeoceti sind ausgestorbene basale Wale, die noch Hinterbeine besassen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche konvergente Evolution zeigen Beutelwolf (Thylacinus cynocephalus) und Grauwolf (Canis lupus) als Paradebeispiel?",
        answerA = "Identische Schadelgroesse und Gehirnvolumen",
        answerB = "Aehnliche Zahnformel und Schaedelform trotz verschiedener Abstammungslinien",
        answerC = "Gleichartige Paarungsrituale",
        answerD = "Identische Chromosomenzahl",
        correctAnswer = 1,
        explanation = "Beutelwolf und Grauwolf zeigen klassische konvergente Evolution: trotz ~180 Mio. Jahren Trennung (Beuteltier vs. Plazentier) entwickelten sie nahezu identische Schaedelformen, Zahnformeln und Koerperproportionen fuer denselben oekologischen Nischenjob.",
        difficulty = 4,
        funFact = "Computergestutzte morphometrische Analysen zeigen, dass Beutelwolf-Schaedel so aehnlich wie Hundeschaedel sind, dass sie in Blindstudien oft verwechselt werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Klasse der Gliederfuesser umfasst die Spinnentiere (Chelicerata: Arachnida) nach aktueller Systematik?",
        answerA = "Merostomata",
        answerB = "Pycnogonida",
        answerC = "Arachnida",
        answerD = "Euchelicerata",
        correctAnswer = 2,
        explanation = "Arachnida ist die Klasse innerhalb der Chelicerata, die Spinnen (Araneae), Skorpione (Scorpiones), Milben (Acari), Weberknechte (Opiliones) und weitere Ordnungen umfasst.",
        difficulty = 4,
        funFact = "Milben (Acari) sind mit ueber 50.000 beschriebenen Arten die artenreichste Ordnung der Arachnida, aber Schatzungen gehen von ueber 500.000 Arten aus."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Theorie der Artbildung beschreibt die Entstehung neuer Arten durch Hybridisierung ohne geographische Trennung, haeufig durch Polyploidie?",
        answerA = "Allopatrische Speziation",
        answerB = "Sympatrische Speziation",
        answerC = "Parapatrische Speziation",
        answerD = "Quantenmechanische Speziation",
        correctAnswer = 1,
        explanation = "Sympatrische Speziation beschreibt die Entstehung neuer Arten innerhalb desselben geographischen Gebiets ohne Isolation. Bei Pflanzen ist Polyploidie (Verdopplung des Chromosomensatzes) ein haeufiger sympatrischer Speziationsmechanismus.",
        difficulty = 4,
        funFact = "Beim Weizen ist Polyploidie nachgewiesen: Saatweizen (Triticum aestivum) ist hexaploid (6n = 42) und entstand durch mehrfache Hybridisierung verschiedener Wildgrasarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Fossil aus dem Kambrium (~530 Mio. Jahre) aus dem Burgess-Schiefer (Kanada) gilt als Schluessselfund fuer das Verstaendnis der Tierphyla-Entstehung?",
        answerA = "Pikaia gracilens",
        answerB = "Hallucigenia sparsa",
        answerC = "Opabinia regalis",
        answerD = "Alle genannten gehoeren zum Burgess-Schiefer",
        correctAnswer = 3,
        explanation = "Alle drei — Pikaia (fruehes Chordat), Hallucigenia (Velvet Worm-Verwandter, Panarthropoda) und Opabinia (raetselhaftes Radiodont) — gehoeren zum Burgess-Schiefer und repraesentieren die explosive Tier-Diversifizierung im Kambrium.",
        difficulty = 4,
        funFact = "Stephen Jay Gould popularisierte den Burgess-Schiefer in seinem Buch 'Wonderful Life' (1989) und postulierte, dass das fruehere Kambrium eine noch viel groessere morphologische Vielfalt zeigte als heute."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Gattung der Tagfalter (Lepidoptera: Papilionidae) wird als Musterbeispiel fuer Muellersche Mimikry zwischen giftigen Arten genannt?",
        answerA = "Papilio",
        answerB = "Heliconius",
        answerC = "Morpho",
        answerD = "Pieris",
        correctAnswer = 1,
        explanation = "Heliconius-Falter zeigen klassische Muellersche Mimikry: mehrere giftige Arten teilen identische Warnfarben-Muster, wodurch Praedatoren schneller lernen, alle zu meiden. Dies unterscheidet sich von Batesscher Mimikry (ungiftig imitiert giftig).",
        difficulty = 4,
        funFact = "Heliconius melpomene und H. erato zeigen in verschiedenen Regionen Suedamerikas lokale Farbvarianten, die sich gegenseitig nachahmen — ein aktiv ablaufender Koevolutionsprozess."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Methode nutzt die Geschwindigkeit der Akkumulation neutraler Mutationen, um Divergenzzeiten zwischen Arten zu schaetzen?",
        answerA = "Morphologische Uhr",
        answerB = "Molekulare Uhr",
        answerC = "Radiometrische Datierung",
        answerD = "Biogeographische Kalibrierung",
        correctAnswer = 1,
        explanation = "Die molekulare Uhr nutzt die angenaehernd konstante Rate neutraler Mutationen in bestimmten Genen, um Divergenzzeiten abzuschaetzen. Sie muss durch gut datierte Fossilien kalibriert werden.",
        difficulty = 4,
        funFact = "Emile Zuckerkandl und Linus Pauling stellten 1965 das Konzept der molekularen Uhr auf, als sie Haemoglobin-Sequenzen verschiedener Arten verglichen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff beschreibt in der Phylogenetik eine Gruppe, die den letzten gemeinsamen Vorfahren und alle seine Nachkommen umfasst?",
        answerA = "Paraphylum",
        answerB = "Polyphylum",
        answerC = "Monophylum (Klade)",
        answerD = "Taxon",
        correctAnswer = 2,
        explanation = "Ein Monophylum (oder eine Klade) umfasst einen gemeinsamen Vorfahren und saemtliche seiner Nachkommen. Die Kladistik (Phylogenetische Systematik nach Hennig) fordert, dass nur Monophyla als natuerliche Gruppen anerkannt werden.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung der Reptilien (Squamata) zeigt als einzige vollstaendige Gliedmassenreduktion bei gleichzeitiger Beibehaltung von Vestigialstrukturen (Beckenrudimenten)?",
        answerA = "Gekkota",
        answerB = "Serpentes",
        answerC = "Lacertidae",
        answerD = "Iguania",
        correctAnswer = 1,
        explanation = "Schlangen (Serpentes) haben vollstaendig funktionslose Gliedmassen, aber viele basale Gruppen (Boa, Python) behalten vestigiale Beckenknochen und rudimentaere Hinterbeinstrukturen (Kloakensporen).",
        difficulty = 4,
        funFact = "Beim Pythonschlangen-Embryo sind Hinterextremitaeten-Anlagen sichtbar, werden aber durch HOX-Gen-Expressionsverlust waehrend der Entwicklung wieder reduziert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche der folgenden Tiergruppen ist phylogenetisch NICHT Teil der Deuterostomia?",
        answerA = "Echinodermata",
        answerB = "Hemichordata",
        answerC = "Chordata",
        answerD = "Nematoda",
        correctAnswer = 3,
        explanation = "Nematoda (Fadenwuermer) sind Protostomia und gehoeren zu Ecdysozoa. Deuterostomia umfassen Echinodermata, Hemichordata und Chordata, die alle durch die Entstehung des Afters aus dem Urmund (Blastoporus) charakterisiert sind.",
        difficulty = 4,
        funFact = "Die Einteilung in Proto- und Deuterostomia basiert auf der embryonalen Entwicklung des Blastoporus — ein fundamentaler Unterschied im Koerperplan."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bezeichnet man das Phaenomen, bei dem eine Genmutation denselben Phaenotyupen erzeugt wie bei einer entfernt verwandten Art, durch unabhaengig entstandene Mutationen im selben Gen?",
        answerA = "Konvergente Evolution",
        answerB = "Parallele Molekulare Evolution",
        answerC = "Homoplasie",
        answerD = "Epistasis",
        correctAnswer = 1,
        explanation = "Parallele molekulare Evolution beschreibt das Auftreten identischer Mutationen in denselben Genen bei phylogenetisch entfernten Arten. Ein Beispiel ist die parallele Entstehung der Augenreduktion bei hoehlenlebenden Tieren durch Mutationen in denselben Kandidatengenen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiergruppe wird in der Kladistik als 'Reptilia' klassifiziert, wenn Aves (Voegel) korrekterweise eingeschlossen werden?",
        answerA = "Lepidosauria",
        answerB = "Archosauria",
        answerC = "Sauropsida",
        answerD = "Testudines",
        correctAnswer = 2,
        explanation = "Sauropsida ist die inklusive Klade, die Reptilia plus Aves vereint. Der Begriff 'Reptilia' im traditionellen Sinn ist paraphyletisch, da er Voegel ausschliesst, obwohl diese innerhalb der Archosauria entstanden.",
        difficulty = 4,
        funFact = "Krokodile sind naeher mit Voegeln verwandt als mit anderen 'Reptilien' wie Schlangen oder Eidechsen — phylogenetisch sind beide Archosaurier."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Familie gehoert zur Ordnung Tubulidentata, der artenaeermsten Ordnung der Saeugetiere?",
        answerA = "Orycteropodidae",
        answerB = "Myrmecophagidae",
        answerC = "Manidae",
        answerD = "Dasypodidae",
        correctAnswer = 0,
        explanation = "Tubulidentata umfasst nur eine Familie (Orycteropodidae) mit einer einzigen Art: den Erdferkel (Orycteropus afer). Diese Ordnung steht phylogenetisch innerhalb der Afrotheria.",
        difficulty = 4,
        funFact = "Der Erdferkel ist trotz seiner aeusserlichen Aehnlichkeit mit Ameisenbaren NICHT mit diesen verwandt — ein klassisches Beispiel fuer konvergente Evolution der Myrmekophagie."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Prinzip der Populationsgenetik besagt, dass in einer unendlich grossen, panmiktischen Population ohne Selektion, Mutation und Migration die Allelfrequenzen konstant bleiben?",
        answerA = "Neutral-Theorie (Kimura)",
        answerB = "Hardy-Weinberg-Gleichgewicht",
        answerC = "Fishers Fundamentalsatz",
        answerD = "Wrights Inzuchtkoeffizient",
        correctAnswer = 1,
        explanation = "Das Hardy-Weinberg-Gleichgewicht (1908, unabhaengig von G.H. Hardy und W. Weinberg formuliert) besagt, dass Genotyp- und Allelfrequenzen ohne evolutionaere Kraefte von Generation zu Generation konstant bleiben.",
        difficulty = 4,
        funFact = "Das Hardy-Weinberg-Gleichgewicht ist in der Praxis nie vollstaendig erfuellt, dient aber als Nullhypothese zum Nachweis evolutionaerer Prozesse in realen Populationen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Unterordnung der Primaten umfasst ausschliesslich die Lemuren Madagaskars und verwandte Feuchtnasenprimaten?",
        answerA = "Haplorrhini",
        answerB = "Strepsirrhini",
        answerC = "Simiiformes",
        answerD = "Tarsiiformes",
        correctAnswer = 1,
        explanation = "Strepsirrhini (Feuchtnasenprimaten) umfassen Lemuren (Infraordnung Lemuriformes), Loris und Galagos. Sie werden von den Haplorrhini (Trockennasenprimaten: Tarsier, Affen, Menschen) abgegrenzt.",
        difficulty = 4,
        funFact = "Madagaskar wurde erst vor ~88-60 Mio. Jahren von Afrika getrennt — die Lemuren kolonisierten es vermutlich durch 'Insane Rafting' auf natuerlichen Floessen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt in der Evolutionsbiologie die 'Rote-Koenigin-Hypothese' nach dem Lewis-Carroll-Zitat?",
        answerA = "Zunehmende Koerpermasse durch Selektion",
        answerB = "Konstante evolutionaere Anpassung noetig, um relativ zur Umgebung gleich gut zu bleiben",
        answerC = "Sexualdimorphismus als Folge der Koevolution",
        answerD = "Artensterben als Folge von Klimawandel",
        correctAnswer = 1,
        explanation = "Die Rote-Koenigin-Hypothese (Van Valen, 1973) besagt, dass Organismen sich staendig weiterentwickeln muessen, nur um relativ zu Konkurrenten, Parasiten und Raeuber-Beute-Beziehungen gleich 'fit' zu bleiben — analog zur Roten Koenigin in 'Alice im Spiegelland'.",
        difficulty = 4,
        funFact = "Die Rote-Koenigin-Hypothese wird auch als Erklaerung fuer die Erhaltung der sexuellen Fortpflanzung herangezogen: Sex erzeugt genetische Variabilitaet gegen Parasiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Schwesterfamilie teilen Nashornvoegel (Bucerotidae) nach aktueller Molekularphylogenie?",
        answerA = "Eisvoegelchen (Alcedinidae)",
        answerB = "Hopfe (Upupidae)",
        answerC = "Trogone (Trogonidae)",
        answerD = "Spechtvoegel (Picidae)",
        correctAnswer = 1,
        explanation = "Nashornvoegel (Bucerotidae) und Hopfe (Upupidae) bilden gemeinsam die Ordnung Bucerotiformes. Molekulare Daten zeigen eine enge Verwandtschaft, auch wenn Hopfe wesentlich kleiner sind.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff aus der Evolutionsentwicklungsbiologie beschreibt Gene, die als Masterregulatoren fungieren und die Expression vieler nachgeordneter Gene steuern?",
        answerA = "Strukturgene",
        answerB = "Housekeeping-Gene",
        answerC = "Toolkit-Gene (Developmental Toolkit)",
        answerD = "Transposons",
        correctAnswer = 2,
        explanation = "Toolkit-Gene (Entwicklungswerkzeuge) wie Pax6, Dll, Tbx, Nkx2.2 sind evolutionaer hochkonservierte Transkriptionsfaktoren und Signalmolekuele, die Koerperplan-Grundstrukturen regulieren. Pax6 steuert z.B. die Augenentwicklung von Tintenfischen bis Menschen.",
        difficulty = 4,
        funFact = "Das Gen Pax6 kann, wenn in eine Fruchtfliege eingebracht, Augen auf Beinen erzeugen — das murine Pax6 funktioniert in Drosophila praktisch identisch wie das fliegeneigene eyeless-Gen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung der Voegel zeigt den sogenannten 'Neopallium-Korridor', der bei Songbirds mit dem Saeugetierhirn verglichenen Grosshirnanteilen korrespondiert?",
        answerA = "Psittaciformes",
        answerB = "Passeriformes",
        answerC = "Strigiformes",
        answerD = "Acciptriformes",
        correctAnswer = 1,
        explanation = "Passeriformes (Singvoegel) haben besonders grosses Telencephalon mit analoger Funktion zum Neopallium. Die neuronale Grundlage des Gesangslernens (Vogelgesang = Modell fuer Spracherwerb) wurde intensiv in dieser Ordnung erforscht.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche phylogenetische Analyse-Methode verwendet Charakterzustaende und minimiert die Gesamtzahl notwendiger evolutionaerer Veraenderungen?",
        answerA = "Maximum Likelihood",
        answerB = "Bayesianische Inferenz",
        answerC = "Maximum Parsimony",
        answerD = "Distanzmatrix-Methode",
        correctAnswer = 2,
        explanation = "Maximum Parsimony (Ockham-Prinzip) sucht den Stammbaum, der die geringste Gesamtanzahl von Charakterveraenderungen (Apomorphien) benoetigt, um die beobachteten Taxon-Daten zu erklaeren.",
        difficulty = 4,
        funFact = "Bei sehr langen Aesten kann Maximum Parsimony versagen und verwandte Taxa faelschlich zusammengruppieren — dieses Problem heisst 'Long Branch Attraction' (LBA)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiergruppe besitzt als einzige unter den Wirbeltieren echte Zellwandbestandteile in der extrazellullaeren Matrix der Chorda dorsalis auch im Adultstadium?",
        answerA = "Actinopterygii (Knochenfische)",
        answerB = "Cyclostomata (Neunaeugen + Schleimale)",
        answerC = "Amphibia",
        answerD = "Cephalochordata (Lanzettfischchen)",
        correctAnswer = 3,
        explanation = "Cephalochordata (Amphioxus/Lanzettfischchen) behalten die Chorda dorsalis (Notochord) zeitlebens als Hauptskelettstruktur und sind damit das basalste lebende Chordata-Taxon ohne Wirbelknochen.",
        difficulty = 4,
        funFact = "Branchiostoma lanceolatum, das Europaische Lanzettfischchen, ist entscheidend fuer das Verstaendnis der Wirbeltierentstehung — sein Genom zeigt den Ursprungszustand vieler Wirbeltiergen-Familien."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Gattung der Familie Viperidae gilt als groesste Giftschlange Afrikas und zeigt hochentwickelte haemotoxische Giftstoffe (Phospholipasen A2)?",
        answerA = "Naja",
        answerB = "Dendroaspis",
        answerC = "Bitis",
        answerD = "Dispholidus",
        correctAnswer = 2,
        explanation = "Bitis (Puffottern) sind Viperidae und zeigen komplexe haemotoxische Gifte. Bitis gabonica (Gabun-Puffotter) hat die laengsten Giftzaehne aller Schlangen (bis 5 cm) und produziert grosse Giftmengen.",
        difficulty = 4,
        funFact = "Bitis arietans (Gemeine Puffotter) verursacht in Afrika mehr Schlangenbissopfer als jede andere Art, weil sie haeufig in bewohnten Gebieten vorkommt und sich bei Bedrohung nur zoegernd bewegt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Prinzip der Evo-Devo besagt, dass kleine Veraenderungen in regulatorischen Elementen grosse morphologische Unterschiede erzeugen koennen?",
        answerA = "Cis-regulatorische Evolution",
        answerB = "Genduplication-Subfunktionalisierung",
        answerC = "Transposable-Element-Drift",
        answerD = "Epigenetische Vererbung",
        correctAnswer = 0,
        explanation = "Cis-regulatorische Evolution beschreibt Veraenderungen in nicht-kodierenden regulatorischen DNA-Elementen (Enhancer, Promotoren), die Expressionsmuster von Genen aendern, ohne die Proteinstruktur zu beeinflussen. Sean Carroll hat dieses Konzept massgeblich entwickelt.",
        difficulty = 4,
        funFact = "Die unterschiedliche Koerperbeaarung zwischen Mensch und Schimpanse wird teilweise auf cis-regulatorische Veraenderungen in einem einzigen Gen (HACNS1-Enhancer) zurueckgefuehrt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Artengruppe zeigt als Beispiel fuer peripatrische Speziation die Entstehung neuer Arten an Randbereichen einer Verbreitungsgebietes durch kleinen Grunderpopulationen?",
        answerA = "Afrikanische Cichliden im Victoriasee",
        answerB = "Darwin-Finken auf Galapagos",
        answerC = "Hawaiianische Honeycreeper (Drepanididae)",
        answerD = "Guppys in Trinidad-Fluessen",
        correctAnswer = 2,
        explanation = "Hawaiianische Honeycreeper sind ein Paradebeispiel peripatrischer Speziation: eine oder wenige Gruenderindividuen besiedelten neue Inseln der Hawaiikette und diversifizierten sich durch Drift und Selektion in 50+ Arten.",
        difficulty = 4,
        funFact = "Alle Drepanididae stammen von einem einzigen Vorfahren ab, der vor ~5-7 Mio. Jahren Hawaii erreichte — eine der spektakulaersten adaptiven Radiationen der Vogelwelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Zu welchem Stamm (Phylum) gehoert der Seeigel (Strongylocentrotus purpuratus) nach der zoologischen Systematik?",
        answerA = "Hemichordata",
        answerB = "Mollusca",
        answerC = "Echinodermata",
        answerD = "Annelida",
        correctAnswer = 2,
        explanation = "Seeigel gehoeren zum Stamm Echinodermata, Klasse Echinoidea. Als Deuterostomier sind sie naeher mit Wirbeltieren verwandt als mit Insekten oder Wuermern.",
        difficulty = 4,
        funFact = "Strongylocentrotus purpuratus war das erste marine Invertebrat, dessen vollstaendiges Genom sequenziert wurde (2006) — und hat ca. 23.000 Gene, aehnlich viel wie der Mensch."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Prinzip der neutralen Theorie der molekularen Evolution (Kimura, 1968) besagt ueber die Fixierungswahrscheinlichkeit neutraler Allele?",
        answerA = "Neutrale Allele haben keine Fixierungswahrscheinlichkeit",
        answerB = "Die Fixierungswahrscheinlichkeit eines neutralen Allels entspricht seiner Anfangsfrequenz in der Population",
        answerC = "Neutrale Allele werden bevorzugt durch positive Selektion fixiert",
        answerD = "Die Fixierungsrate ist unabhaengig von der Populationsgroesse",
        correctAnswer = 1,
        explanation = "Kimuras neutrale Theorie (1968) sagt voraus: die Wahrscheinlichkeit, dass ein neues neutrales Allel in einer Population fixiert wird, entspricht seiner Anfangsfrequenz (1/2N fuer eine diploide Population der Groesse N).",
        difficulty = 4,
        funFact = "Kimura berechnete, dass die meisten Substitutionen auf molekularer Ebene selektiv neutral sind und nur durch Drift fixiert werden — ein damals revolutionaerer Gedanke."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung der Insekten hat als Apomorphie vollstaendig modifizierte Vorderfluegel (Elytren) als Schutzdeckel entwickelt?",
        answerA = "Hemiptera",
        answerB = "Orthoptera",
        answerC = "Coleoptera",
        answerD = "Dictyoptera",
        correctAnswer = 2,
        explanation = "Coleoptera (Kaefer) besitzen als charakteristisches Merkmal Elytren — sklerotisierte, fluegeldachaehnliche Vorderfluegel, die die Hinterfluegel schuetzen. Mit ueber 400.000 Arten sind Kaefer die artenreichste Ordnung aller Tiere.",
        difficulty = 4,
        funFact = "Auf die Frage, was die Schoepfung ueber die Absichten Gottes verrate, soll J.B.S. Haldane geantwortet haben: 'Eine uebertriebene Vorliebe fuer Kaefer.'"
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Auswahl beschreibt korrekt die Position der Fische der Klasse Myxini (Schleimale) im Wirbeltierstammbaum?",
        answerA = "Basalste Gruppe aller Wirbeltiere mit echten Wirbeln",
        answerB = "Schwestergruppe der Gnathostomata (Kiefertiere)",
        answerC = "Innerhalb der Agnatha, als Schwestertaxon der Petromyzontida (Neunaeugen)",
        answerD = "Abgeleitete Gruppe innerhalb der Teleostei",
        correctAnswer = 2,
        explanation = "Myxini (Schleimale) und Petromyzontida (Neunaeugen) bilden zusammen die Cyclostomata — kieferlose Wirbeltiere, die als Schwestergruppe aller Gnathostomata (Kiefer-Wirbeltiere) gelten. Ob sie mono- oder paraphyletisch sind, ist debattiert.",
        difficulty = 4,
        funFact = "Schleimale produzieren bei Bedrohung Schleim in solchen Mengen, dass ein einziger Aal einen Eimer Meerwasser in wenigen Sekunden zu Schleim verwandeln kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche phylogenetische Besonderheit zeigt Trichoplax adhaerens (Stamm Placozoa) in Bezug auf die Entstehung des Tierreichs?",
        answerA = "Es ist das einfachste bekannte vielzellige Tier ohne echte Gewebe oder Symmetrieachsen",
        answerB = "Es ist ein Einzeller mit tieraehnlichem Verhalten",
        answerC = "Es besitzt ein primitives Nervensystem ohne Neuronen",
        answerD = "Es ist phylogenetisch naeher mit Pilzen verwandt als mit anderen Tieren",
        correctAnswer = 0,
        explanation = "Trichoplax adhaerens (Placozoa) ist das einfachste bekannte vielzellige Tier: vier Zelltypen, keine echten Gewebe, keine Symmetrieachsen, keine Koerperachse. Sein Genom aehnelt basalen Metazoa und gibt Hinweise auf die fruehe Tierevolution.",
        difficulty = 4,
        funFact = "Trichoplax hat kein Mund, keinen Darm und kein Nervensystem — es verdaut Nahrung durch Sekretion von Verdauungsenzymen unter seinem Koerper."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept der Artdefinition betont die biologische Isolation und definiert eine Art als Gruppe tatsaechlich oder potentiell sich miteinander kreuzender Individuen?",
        answerA = "Morphologisches Artkonzept",
        answerB = "Biologisches Artkonzept (Ernst Mayr, 1942)",
        answerC = "Phylogenetisches Artkonzept",
        answerD = "Oekologisches Artkonzept",
        correctAnswer = 1,
        explanation = "Ernst Mayrs biologisches Artkonzept (1942) definiert Arten als 'Gruppen tatsaechlich oder potentiell sich miteinander kreuzender natuerlicher Populationen, die von anderen solchen Gruppen reproduktiv isoliert sind'. Es ist das am weitesten verbreitete Artkonzept.",
        difficulty = 4,
        funFact = "Das biologische Artkonzept scheitert bei asexuellen Organismen, fossilen Arten und Ringen-Arten (Ring species) — daher existieren heute ueber 30 verschiedene Artkonzepte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Gattung der Wuergeschlangen zeigt als einzige Oviparie (Eiablage) statt Ovoviviparie bei den Boidae?",
        answerA = "Boa",
        answerB = "Eunectes",
        answerC = "Python",
        answerD = "Corallus",
        correctAnswer = 2,
        explanation = "Pythons (Python spp., Familie Pythonidae nach moderner Taxonomie) sind ovipar und legen Eier, die das Weibchen aktiv bruetet. Boas hingegen sind ovovivipar. Die Trennung Pythonidae vs. Boidae spiegelt diese phylogenetische Trennung wider.",
        difficulty = 4,
        funFact = "Python reticulatus (Netzpython) ist die laengste Schlange der Welt mit verifizierter Laenge von 6,95 m — und bruetet ihre Eier durch Muskelzittern aktiv auf Koerpertemperatur."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus der reproduktiven Isolation entsteht nach Auskreuzungsversuchen, wenn Hybride zwar lebensfaehig, aber steril sind (z.B. Maultier)?",
        answerA = "Praezygotische Isolation",
        answerB = "Hybridsterilit ae t (Postzygotische Isolation)",
        answerC = "Oekologische Isolation",
        answerD = "Verhaltensbarriere",
        correctAnswer = 1,
        explanation = "Hybridsterilit ae t ist eine postzygotische Isolationsbarriere: Hybride entstehen (zygotische Barriere ueberwunden), sind aber unfruchtbar. Bei Maultieren (Kreuzung Pferd x Esel) verhindert die Chromosomeninkompatibilitaet (2n=63) die meiotische Teilung.",
        difficulty = 4,
        funFact = "Haldanes Regel (1922) besagt, dass bei Hybridsterilitaet das heterogametische Geschlecht (XY-Maennchen) staerker betroffen ist als das homogametische — ein Muster, das in vielen Tiergruppen gilt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung der Saeugetiere umfasst die Spitzmaeuse (Soricidae), Maulwuerfe (Talpidae) und Igel (Erinaceidae)?",
        answerA = "Rodentia",
        answerB = "Afrosoricida",
        answerC = "Eulipotyphla",
        answerD = "Scandentia",
        correctAnswer = 2,
        explanation = "Eulipotyphla umfasst die insektivoren Familien Soricidae, Talpidae, Erinaceidae und Solenodontidae. Phylogenetisch gehoeren sie zu Laurasiatheria, nicht zu den 'Insectivora' des traditionellen Systems.",
        difficulty = 4,
        funFact = "Soricidae (Spitzmaeuse) haben den hoechsten Stoffwechsel aller Saeugetiere — manche Arten muessen alle 2 Stunden fressen oder sterben an Unterzuckerung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Typ von Selektion begunstigt Heterozygote gegenueber beiden Homozygoten und erhaelt damit Polymorphismus in einer Population?",
        answerA = "Gerichtete Selektion (Directional Selection)",
        answerB = "Stabilisierende Selektion",
        answerC = "Heterozygotenvorteil (Uberdominanz / Balancierte Selektion)",
        answerD = "Disruptive Selektion",
        correctAnswer = 2,
        explanation = "Ueberdominanz (Heterozygotenvorteil) liegt vor, wenn Heterozygote (Aa) einen hoeheren Fitnesswert haben als beide Homozygoten (AA, aa). Das bekannteste Beispiel ist die Sichelzellanämie: HbA/HbS-Heterozygote sind resistenter gegen Malaria.",
        difficulty = 4,
        funFact = "Balancierte Selektion kann Allele ueber sehr lange Zeiten erhalten — einige MHC-Allele (Immunsystem) haben Divergenzzeiten, die die Art-Divergenz von Mensch und Schimpanse ueberschreiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Zoologe etablierte 1950 die phylogenetische Systematik (Kladistik) als methodischen Rahmen fuer die Klassifikation von Lebewesen?",
        answerA = "Ernst Mayr",
        answerB = "George Gaylord Simpson",
        answerC = "Willi Hennig",
        answerD = "Carl von Linne",
        correctAnswer = 2,
        explanation = "Willi Hennig (1913-1976) begruendete die Phylogenetische Systematik (Kladistik) mit seinem Werk 'Grundzuege einer Theorie der Phylogenetischen Systematik' (1950). Er definierte die Konzepte Apomorphie, Plesiomorphie, Synapomorphie und Klade.",
        difficulty = 4,
        funFact = "Hennig arbeitete als Entomologe und entwickelte seine Theorie ursprueglich fuer die Klassifikation von Diptera (Zweiflueglern) — seine Methoden wurden aber zur Grundlage der gesamten modernen Biologie."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft des Genoms der Caenorhabditis elegans (Fadenwurm) macht ihn zu einem Modellorganismus fuer Entwicklungsbiologie und Apoptose-Forschung?",
        answerA = "Variables Zellschicksal bei jeder Entwicklung",
        answerB = "Vollstaendig determinierter Zellstammbaum mit exakt 959 Koerperzellen beim Adulten",
        answerC = "Grosses Hirn relativ zur Koerpergroesse",
        answerD = "Groesstes bekanntes Invertebrate-Genom",
        correctAnswer = 1,
        explanation = "C. elegans hat einen vollstaendig bestimmten Zellstammbaum: jede der 959 Koerperzellen (Hermaphrodit) ist in ihrer Entstehungsgeschichte und Funktion bekannt. 131 Zellen sterben durch programmierte Apoptose — was die Entdeckung der Apoptosegene begruendete (Nobelpreis 2002 an Brenner, Sulston, Horvitz).",
        difficulty = 4,
        funFact = "C. elegans war der erste vielzellige Organismus mit vollstaendig sequenziertem Genom (1998) und der erste, dessen vollstaendiges neuronales Verschaltungsdiagramm (Connectome, 302 Neuronen) kartiert wurde."
    ),

)
