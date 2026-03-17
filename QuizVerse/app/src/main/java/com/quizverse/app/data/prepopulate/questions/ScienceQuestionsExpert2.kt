package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsExpert2(): List<Question> = listOf(

    // Question 1 — Condensed Matter Physics: Topological Insulators
    Question(
        categoryId = 2,
        questionText = "Was ist die charakteristische Eigenschaft eines topologischen Isolators?",
        answerA = "Er leitet Strom nur bei tiefen Temperaturen durch das Innere",
        answerB = "Er besitzt leitende Oberflächenzustände, die durch Zeitumkehrsymmetrie geschützt sind, während das Innere isolierend ist",
        answerC = "Er zeigt Supraleitung ohne äußeres Magnetfeld",
        answerD = "Er hat eine Bandlücke, die durch Druck verschwindet",
        correctAnswer = 1, // B
        explanation = "Topologische Isolatoren sind im Volumen isolierend, besitzen aber metallische Oberflächenzustände, die durch die Zeitumkehrsymmetrie topologisch geschützt sind. Diese Zustände sind robust gegenüber nicht-magnetischen Störungen und zeigen einen charakteristischen Spin-Impuls-Kopplungs-Charakter.",
        difficulty = 4,
        funFact = "In 3D-topologischen Isolatoren wie Bi₂Se₃ verhalten sich die Oberflächenelektronen wie masselose Dirac-Fermionen – ähnlich wie in Graphen, aber nur auf der Oberfläche."
    ),

    // Question 2 — Condensed Matter Physics: Quantum Dots
    Question(
        categoryId = 2,
        questionText = "Warum zeigen Quantenpunkte (Quantum Dots) größenabhängige Emissionsfarben?",
        answerA = "Weil ihre Kristallstruktur mit der Größe variiert",
        answerB = "Weil die Oberflächenspannung die Gitterkonstante verändert",
        answerC = "Weil der Quantum-Confinement-Effekt die Bandlücke invers proportional zum Quadrat des Radius vergrößert",
        answerD = "Weil größere Partikel mehr Dotieratome enthalten",
        correctAnswer = 2, // C
        explanation = "Im Quantum-Confinement-Regime (wenn der Radius kleiner als der Bohr-Exzitonenradius ist) vergrößert sich die effektive Bandlücke proportional zu 1/r². Kleinere Quantenpunkte emittieren daher blaues Licht (größere Bandlücke), größere rotes Licht (kleinere Bandlücke).",
        difficulty = 4,
        funFact = null
    ),

    // Question 3 — Condensed Matter Physics: Spintronics
    Question(
        categoryId = 2,
        questionText = "Auf welchem Effekt basiert der Riesenmagnetowiderstand (GMR), der in modernen Festplattenköpfen genutzt wird?",
        answerA = "Der elektrische Widerstand einer Schichtstruktur hängt von der relativen Ausrichtung der Magnetisierung benachbarter ferromagnetischer Schichten ab",
        answerB = "Ein supraleitender Übergang wird durch ein äußeres Magnetfeld unterdrückt",
        answerC = "Spinpolarisierte Elektronen erzeugen ein messbares Hall-Signal",
        answerD = "Die Leitfähigkeit steigt im Magnetfeld durch verminderte Streuung",
        correctAnswer = 0, // A
        explanation = "Der GMR-Effekt (entdeckt 1988 von Fert und Grünberg) tritt in Schichtstrukturen aus ferromagnetischen und nichtmagnetischen Metallen auf. Bei paralleler Magnetisierung ist der Widerstand niedrig, bei antiparalleler hoch – weil spinabhängige Streuung stark von der relativen Ausrichtung abhängt.",
        difficulty = 4,
        funFact = "Albert Fert und Peter Grünberg erhielten 2007 den Physiknobelpreis für die Entdeckung des GMR-Effekts. Ohne ihn wäre die massive Kapazitätserhöhung moderner Festplatten nicht möglich gewesen."
    ),

    // Question 4 — Condensed Matter Physics: Kondo Effect
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der Kondo-Effekt in der Festkörperphysik?",
        answerA = "Den Phasenübergang eines Ferromagneten bei der Curie-Temperatur",
        answerB = "Den Anstieg des elektrischen Widerstands bei tiefen Temperaturen durch Streuung von Leitungselektronen an magnetischen Verunreinigungen",
        answerC = "Die Entstehung von Cooper-Paaren in einem Supraleiter",
        answerD = "Den quantenmechanischen Tunneleffekt durch Potenzialbarrieren",
        correctAnswer = 1, // B
        explanation = "Der Kondo-Effekt erklärt das anomale Widerstandsminimum in Metallen mit magnetischen Verunreinigungen bei tiefen Temperaturen. Unterhalb der Kondo-Temperatur bildet sich eine starke antiferromagnetische Kopplung zwischen dem lokalisierten Spin der Verunreinigung und den Leitungselektronen, was den Widerstand erhöht.",
        difficulty = 4,
        funFact = null
    ),

    // Question 5 — Condensed Matter Physics: Mott Insulators
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Mott-Isolator von einem normalen Bandstruktur-Isolator?",
        answerA = "Ein Mott-Isolator hat keine Bandlücke, aber die Isolierung entsteht durch starke Elektron-Elektron-Coulomb-Wechselwirkungen bei halbgefülltem Band",
        answerB = "Ein Mott-Isolator hat eine besonders breite Bandlücke über 5 eV",
        answerC = "Ein Mott-Isolator ist nur bei Temperaturen unter 4 K isolierend",
        answerD = "Ein Mott-Isolator entsteht durch Phonon-Elektronen-Kopplung",
        correctAnswer = 0, // A
        explanation = "Bei Mott-Isolatoren würde die Bandstrukturtheorie ein metallisches Verhalten vorhersagen (halbgefülltes Leitungsband), doch starke Coulomb-Abstoßung zwischen Elektronen (Hubbard-U >> Bandbreite W) verhindert die Bewegung der Elektronen. Hochtemperatur-Supraleiter wie La₂CuO₄ sind Mott-Isolatoren als Ausgangszustand.",
        difficulty = 4,
        funFact = "Viele Hochtemperatur-Supraleiter entstehen durch Dotierung eines Mott-Isolators – ein Zusammenhang, der bis heute nicht vollständig theoretisch verstanden ist."
    ),

    // Question 6 — Structural Biology: X-ray Crystallography
    Question(
        categoryId = 2,
        questionText = "Was ist das Phasenproblem in der Röntgenkristallographie und wie wird es gelöst?",
        answerA = "Röntgenstrahlen können Proteine zerstören; gelöst durch kryogene Kühlung",
        answerB = "Detektoren messen nur die Intensitäten (Betragsquadrate) der Strukturfaktoren, nicht die Phasen; gelöst durch SAD/MAD, molekularen Ersatz oder isomorphen Ersatz",
        answerC = "Die Beugungswinkel sind für schwere Atome zu klein; gelöst durch Synchrotronstrahlung",
        answerD = "Proteinkristalle sind zu dünn für klassische Röntgenstrahlen; gelöst durch Neutronenbeugung",
        correctAnswer = 1, // B
        explanation = "Für die Fourier-Synthese zur Elektronendichteberechnung werden Amplituden und Phasen der Strukturfaktoren benötigt. Da Detektoren nur Intensitäten (|F|²) messen, gehen die Phaseninformationen verloren. Lösungen: SAD (Single-wavelength Anomalous Dispersion) mit schwerem Atom, MAD (Multi-wavelength), Molekularer Ersatz mit bekannter Struktur, oder isomorphe Schweratomderivatisierung (MIR).",
        difficulty = 4,
        funFact = "Die erste vollständige Proteinstruktur via Röntgenkristallographie war Myoglobin (1958, Kendrew) – Nobelpreis 1962. Die Berechnung damals dauerte Jahre auf frühen Computern."
    ),

    // Question 7 — Structural Biology: NMR Protein Structure
    Question(
        categoryId = 2,
        questionText = "Welche Kerneigenschaft wird in der NMR-Spektroskopie zur Proteinstrukturbestimmung hauptsächlich genutzt, und welche Größe liefert Abstandsinformation?",
        answerA = "Der Kernspin; chemische Verschiebung liefert Abstandsinformation",
        answerB = "Die Kernladungszahl; J-Kopplung liefert Abstandsinformation",
        answerC = "Der Kernspin; der Nuclear Overhauser Effect (NOE) liefert über r⁻⁶-Abhängigkeit Abstandsinformation bis ~5 Å",
        answerD = "Die Elektronegativität; Relaxationszeiten T1/T2 liefern Abstandsinformation",
        correctAnswer = 2, // C
        explanation = "Der Nuclear Overhauser Effect (NOE) entsteht durch dipolaren Transfer der Kernmagnetisierung zwischen räumlich nahen Kernen (<5 Å). Da die NOE-Intensität proportional zu r⁻⁶ ist, liefert er präzise Abstandsbeschränkungen. Zusammen mit Diederwinkelinformation aus J-Kopplungen und chemischen Verschiebungen werden Proteinstrukturen in Lösung berechnet.",
        difficulty = 4,
        funFact = null
    ),

    // Question 8 — Structural Biology: Cryo-EM
    Question(
        categoryId = 2,
        questionText = "Was ist der entscheidende Vorteil der Kryo-Elektronenmikroskopie (Single-Particle Analysis) gegenüber Röntgenkristallographie?",
        answerA = "Kryo-EM benötigt keine Kryokühlung",
        answerB = "Kryo-EM erfordert keine Kristallisation und erlaubt Strukturbestimmung von Proteinen in nahezu nativer, gelöster Konformation, einschließlich flexibler Komplexe und membrangebundener Proteine",
        answerC = "Kryo-EM liefert immer höhere Auflösung als Röntgenstrahlung",
        answerD = "Kryo-EM funktioniert nur mit Partikeln über 500 kDa",
        correctAnswer = 1, // B
        explanation = "Der revolutionäre Vorteil der Kryo-EM-Einzelpartikel-Analyse liegt im Wegfall der Kristallisationsanforderung. Proteine werden in wässrigem Puffer vitrifikiert (schockgefroren), und tausende von 2D-Projektionsbilder werden zu 3D-Strukturen rekonstruiert. Seit der 'Resolution Revolution' (~2013) werden routinemäßig Auflösungen unter 3 Å erreicht.",
        difficulty = 4,
        funFact = "Jacques Dubochet, Joachim Frank und Richard Henderson erhielten 2017 den Chemienobelpreis für die Entwicklung der Kryo-EM. Henderson bestimmte 1990 die erste hochauflösende Membranproteinstruktur via Elektronenmikroskopie."
    ),

    // Question 9 — Structural Biology: AlphaFold
    Question(
        categoryId = 2,
        questionText = "Welchen fundamentalen Durchbruch erzielte AlphaFold2 (DeepMind, 2020) in der Strukturbiologie?",
        answerA = "Es synthetisierte erstmals Proteine vollständig in silico",
        answerB = "Es sagte die dreidimensionale Struktur von Proteinen allein aus ihrer Aminosäuresequenz mit experimentell vergleichbarer Genauigkeit voraus und löste damit ein 50 Jahre altes Problem",
        answerC = "Es entdeckte neue Proteinfaltungsklassen, die in der Natur nicht vorkommen",
        answerD = "Es löste das Phasenproblem der Röntgenkristallographie automatisiert",
        correctAnswer = 1, // B
        explanation = "AlphaFold2 nutzt evolutionäre Kopplungsanalysen aus multiplen Sequenzalignments (MSA) und Attention-Mechanismen, um 3D-Koordinaten aller Atome vorherzusagen. Im CASP14-Wettbewerb erreichte es Median-TM-Scores >0.9 – vergleichbar mit experimentellen Strukturen. Dies revolutionierte die Strukturbiologie und beschleunigte Wirkstoffentwicklung massiv.",
        difficulty = 4,
        funFact = "Die AlphaFold-Datenbank enthält mittlerweile vorhergesagte Strukturen für über 200 Millionen Proteine – nahezu das gesamte bekannte Proteom der Erde."
    ),

    // Question 10 — Structural Biology: Membrane Protein Structure
    Question(
        categoryId = 2,
        questionText = "Warum ist die Strukturbestimmung von Membranproteinen besonders herausfordernd, und welche Strategie hat sich zur Kristallisation bewährt?",
        answerA = "Membranproteine sind zu klein für Röntgenbeugung; Lösung: Massenspektrometrie",
        answerB = "Membranproteine sind amphiphil und denaturieren in wässrigen Puffern; lipidische mesophase (LCP) oder Detergenzien-Mizellen ermöglichen stabile Kristallisation",
        answerC = "Membranproteine haben keine Sekundärstruktur; Lösung: CD-Spektroskopie",
        answerD = "Membranproteine kristallisieren nur in organischen Lösungsmitteln",
        correctAnswer = 1, // B
        explanation = "Membranproteine besitzen hydrophobe Transmembranbereiche, die in wässrigen Lösungen aggregieren. Detergenzien umhüllen diese Regionen für Lösung in Mizellen. Die lipidische Mesophasekristallisation (LCP; Landau & Rosenbusch, 1996) bettet Proteine in eine kubische Lipidphase ein und ermöglichte die Strukturaufklärung von GPCRs – einer wichtigen Arzneimittelzielklasse.",
        difficulty = 4,
        funFact = null
    ),

    // Question 11 — Astrobiology: Drake Equation
    Question(
        categoryId = 2,
        questionText = "Welche Variable in der Drake-Gleichung ist aktuell am schlechtesten quantifizierbar und stellt die größte Unsicherheit dar?",
        answerA = "R* (Sternentstehungsrate in der Milchstraße)",
        answerB = "fp (Anteil der Sterne mit Planeten)",
        answerC = "fl (Anteil der Planeten, auf denen Leben entsteht) und fc (Anteil mit kommunizierender Zivilisation)",
        answerD = "ne (Anzahl lebensfreundlicher Planeten pro Sternsystem)",
        correctAnswer = 2, // C
        explanation = "R*, fp und ne können durch astronomische Beobachtungen gut eingegrenzt werden (Kepler-Daten zeigen fp ≈ 1). Die biologischen und soziologischen Terme fl, fi und besonders fc sind kaum quantifizierbar: Wir kennen nur einen einzigen Fall (Erde), auf dem Leben entstand, und keine kommunizierende Zivilisation außer uns.",
        difficulty = 4,
        funFact = "Frank Drake formulierte die Gleichung 1961 auf der ersten SETI-Konferenz in Green Bank. Er schätzte N (aktive Zivilisationen) auf 10 – trotz enormer Unsicherheit immer noch ein häufig zitierter Wert."
    ),

    // Question 12 — Astrobiology: Habitable Zones
    Question(
        categoryId = 2,
        questionText = "Was begrenzt die äußere Grenze der habitablen Zone eines Sternsystems nach dem Konzept der 'maximum greenhouse limit'?",
        answerA = "Jenseits dieser Grenze ist die UV-Strahlung zu schwach für die Photosynthese",
        answerB = "CO₂ kondensiert als Eis, bevor der Treibhauseffekt ausreicht, um flüssiges Wasser zu erhalten; CO₂-Wolken reflektieren zudem Strahlung",
        answerC = "Planeten jenseits dieser Grenze können keine Atmosphäre gravitativ halten",
        answerD = "Die Orbitalexzentrizität übersteigt 0,5, was starke Jahreszeiten erzeugt",
        correctAnswer = 1, // B
        explanation = "An der äußeren Grenze reicht selbst ein maximaler CO₂-Treibhauseffekt nicht mehr aus, um die Oberflächentemperatur über den Gefrierpunkt zu heben. Zudem bilden sich bei hohen CO₂-Partialdrücken CO₂-Eiswolken, die Sternlicht reflektieren (Rayleigh-Streuung überwiegt) und den Planeten weiter abkühlen. Kasting et al. 1993 definierten diese klassische habitable Zone.",
        difficulty = 4,
        funFact = null
    ),

    // Question 13 — Astrobiology: Extremophile Limits
    Question(
        categoryId = 2,
        questionText = "Welcher irdische Extremophil hält den Rekord für die höchste Temperaturtoleranz und bei welcher Temperatur wächst er noch?",
        answerA = "Thermus aquaticus bei 75 °C",
        answerB = "Pyrolobus fumarii, ein Archaeon, wächst bei bis zu 121 °C (im Autoklaven-Testbedingungen)",
        answerC = "Deinococcus radiodurans bei 90 °C",
        answerD = "Sulfolobus acidocaldarius bei 85 °C",
        correctAnswer = 1, // B
        explanation = "Pyrolobus fumarii (Archaea, Crenarchaeota) wurde 1997 an Schwarzen Rauchern im Atlantik entdeckt. Es wächst optimal bei ~105 °C und überlebt sogar 121 °C (Autoklav-Temperatur) für 1 Stunde. Dies zeigt, dass Leben in extrem heißen Umgebungen wie dem Enceladus-Ozean oder Hydrothermalfeldern auf anderen Planeten möglich wäre.",
        difficulty = 4,
        funFact = "Der Name 'fumarii' bezieht sich auf den rauchenden Schlot (Fumarole), an dem dieser Organismus lebt. Sein optimales Wachstum bei über 100 °C stellt biologische Strukturen wie Proteine und Lipide vor außergewöhnliche Stabilitätsprobleme."
    ),

    // Question 14 — Astrobiology: Biosignatures
    Question(
        categoryId = 2,
        questionText = "Warum gilt die simultane Detektion von Sauerstoff (O₂) und Methan (CH₄) in einer Planetenatmosphäre als starkes Biosignatur-Paar?",
        answerA = "Weil beide Gase photochemisch stabil sind und sich nicht gegenseitig beeinflussen",
        answerB = "Weil O₂ und CH₄ thermodynamisch schnell miteinander reagieren und daher ihr gleichzeitiges Vorkommen in großen Mengen eine stetige biologische Quelle beider Gase erfordert",
        answerC = "Weil keines der beiden Gase abiotisch erzeugt werden kann",
        answerD = "Weil ihre Spektrallinien sich gegenseitig verstärken und so leichter detektierbar sind",
        correctAnswer = 1, // B
        explanation = "O₂ oxidiert CH₄ sehr effizient (OH-Radikale als Intermediat), sodass die Gleichgewichtskonzentration beider Gase gemeinsam verschwindend gering wäre. Das gleichzeitige Vorhandensein in atmosphärischen Konzentrationen impliziert permanente starke Quellen für beide – auf der Erde sind Oxygene Photosynthese (O₂) und Methanogenese durch Archaeen (CH₄) diese Quellen.",
        difficulty = 4,
        funFact = null
    ),

    // Question 15 — Astrobiology: Panspermia
    Question(
        categoryId = 2,
        questionText = "Die Lithopanspermie-Hypothese postuliert den Transfer von Mikroorganismen zwischen Planeten via Gesteinsmeteoriten. Welches experimentelle Ergebnis stützt diese Möglichkeit am stärksten?",
        answerA = "Mikroorganismen wurden auf der ISS-Außenhülle lebend gefunden",
        answerB = "Bakter-Endosporen wie Bacillus subtilis überleben experimentell nachgestellte hyperveloze Auswurfbeschleunigungen, Vakuum/UV-Exposition im All und Atmosphäreneintritts-Hitze in simulierten Bedingungen",
        answerC = "Marsmeteoriten enthalten fossilierte Bakterienzellen",
        answerD = "Radiokarbondatierung zeigt, dass irdisches Leben 500 Mio. Jahre älter ist als die Erde",
        correctAnswer = 1, // B
        explanation = "EXPOSE-Experimente der ESA auf der ISS zeigen, dass Bacillus subtilis-Endosporen in Gesteinsmatrices mehrere Jahre Weltraumstrahlung und Vakuum überleben können. Hochdruckexperimente (Hopf et al.) belegen Überleben bei Einschlagsbeschleunigungen. ALH84001-Meteorit (Mars) zeigt zwar interessante Mikrostrukturen, aber kein eindeutiger biologischer Nachweis.",
        difficulty = 4,
        funFact = "Der Mars-Meteorit ALH84001 löste 1996 eine große Diskussion aus, als NASA-Forscher mögliche fossile Nanobakterien ankündigten – heute werden die Strukturen jedoch als abiotisch geformt angesehen."
    ),

    // Question 16 — Advanced Organic Chemistry: Pericyclic Reactions
    Question(
        categoryId = 2,
        questionText = "Welche der folgenden Aussagen über den Mechanismus der Diels-Alder-Reaktion ist korrekt?",
        answerA = "Die Reaktion verläuft über ein Diradikalintermediat und ist daher zweistufig",
        answerB = "Es handelt sich um eine konzertierte [4+2]-Cycloaddition, die thermisch erlaubt ist, weil 6 Elektronen (4π + 2π) in einem aromatischen Übergangszustand reagieren",
        answerC = "Die Reaktion erfordert UV-Licht und ist photochemisch erlaubt",
        answerD = "Der suprafaciale-suprafaciale Mechanismus ist für [4+2] thermisch verboten nach Woodward-Hoffmann",
        correctAnswer = 1, // B
        explanation = "Die Diels-Alder-[4+2]-Cycloaddition verläuft konzertiert über einen zyklischen, aromatischen Übergangszustand mit 6 Elektronen (analog Benzol). Nach Woodward-Hoffmann-Regeln ist eine suprafaciale-suprafaciale [4+2]-Cycloaddition thermisch erlaubt (Gesamt-4n+2 Elektronen, n=1). Der konzertierte Mechanismus erklärt die stereochemische Retention (syn-Addition, endo-Regel).",
        difficulty = 4,
        funFact = "Otto Diels und Kurt Alder erhielten 1950 den Chemienobelpreis für diese Reaktion. Sie ist eine der nützlichsten Reaktionen der organischen Synthese zum Aufbau sechsgliedriger Carbocyclen."
    ),

    // Question 17 — Advanced Organic Chemistry: Woodward-Hoffmann Rules
    Question(
        categoryId = 2,
        questionText = "Nach den Woodward-Hoffmann-Regeln: Wie verläuft die elektrische Ringschluss-Reaktion eines Pentadienyl-Kations (4 π-Elektronen) thermisch?",
        answerA = "Disrotatorisch (suprafacial), da 4n Elektronen thermisch disrotatorisch reagieren",
        answerB = "Conrotatorisch, da 4n Elektronen (n=1) thermisch conrotatorisch reagieren",
        answerC = "Photochemisch conrotatorisch, thermisch disrotatorisch – beide Wege sind erlaubt",
        answerD = "Weder con- noch disrotatorisch – 4n-Systeme sind immer thermisch verboten",
        correctAnswer = 1, // B
        explanation = "Für elektrocyclische Reaktionen gilt: 4n Elektronen → thermisch conrotatorisch, photochemisch disrotatorisch; 4n+2 Elektronen → thermisch disrotatorisch, photochemisch conrotatorisch. Ein Pentadienyl-Kation hat 4 π-Elektronen (4n, n=1), daher conrotatorische Ringschluss thermisch. Dies setzt spezifische Stereochemie voraus, die die Woodward-Hoffmann-Regeln 1965 voraussagten.",
        difficulty = 4,
        funFact = null
    ),

    // Question 18 — Advanced Organic Chemistry: Asymmetric Synthesis
    Question(
        categoryId = 2,
        questionText = "Was ist der Enantiomerenüberschuss (ee) und was bedeutet ein ee von 99% in einer asymmetrischen Synthese?",
        answerA = "99% der Produkte sind das gewünschte Enantiomer, 1% ist das unerwünschte – also 99,5% R und 0,5% S",
        answerB = "ee = |[R]−[S]| / ([R]+[S]) × 100%; 99% ee bedeutet 99,5% eines Enantiomers und 0,5% des anderen im Produktgemisch",
        answerC = "99% der Reaktion verläuft stereoselektiv; 1% racemisiert nach der Reaktion",
        answerD = "Der optische Reinheitsgrad beträgt 99%, gemessen durch Drehung von ±99° pro Millimeter Küvette",
        correctAnswer = 1, // B
        explanation = "Der Enantiomerenüberschuss ee = (R−S)/(R+S) × 100% (wenn R > S). Bei 99% ee gilt: R−S = 99 und R+S = 100, also R = 99,5% und S = 0,5%. Diese Berechnung ist direkt: 99% ee = 99,5:0,5-Verhältnis der Enantiomere. Moderne chirale Katalysatoren (Sharpless, Noyori, List) erreichen >99% ee routinemäßig.",
        difficulty = 4,
        funFact = "Ryoji Noyori, William Knowles und K. Barry Sharpless erhielten 2001 den Chemienobelpreis für die Entwicklung asymmetrischer Katalysatoren. Noyoris BINAP-Ru-Katalysator ermöglicht >99% ee bei Ketonreduktionen."
    ),

    // Question 19 — Advanced Organic Chemistry: Organocatalysis
    Question(
        categoryId = 2,
        questionText = "Wie aktiviert Prolin als Organokatalysator Aldehyde für asymmetrische aldol-Reaktionen?",
        answerA = "Prolin fungiert als Lewis-Säure und koordiniert das Aldehyd-Sauerstoffatom",
        answerB = "Das sekundäre Amin der Pyrrolidineinheit bildet ein Enamin mit dem Aldehyd, das nukleophil angreift; das Carboxylat dirigiert die Protonentransfers stereochemisch",
        answerC = "Prolin deprotoniert das α-C-H des Aldehyds via Brønsted-Basenkatalyse",
        answerD = "Prolin bildet ein Oxazolidinon-Intermediat, das durch Ringspannung aktiviert wird",
        correctAnswer = 1, // B
        explanation = "Prolin-Organokatalyse folgt dem Enamin-Mechanismus: Die sekundäre Amingruppe kondensiert mit dem Aldehyd zum Enamin, das als Nukleophil reagiert. Das benachbarte Carboxylat agiert als intramolekularer Brønsted-Säure-Base-Katalysator und fixiert den Übergangszustand durch H-Brücken, was hohe ee-Werte ermöglicht. List, Barbas und MacMillan entwickelten dies ab 2000.",
        difficulty = 4,
        funFact = null
    ),

    // Question 20 — Advanced Organic Chemistry: Olefin Metathesis
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus liegt der Olefin-Metathese (Grubbs-Katalyse) zugrunde?",
        answerA = "Ein [2+2]-Cycloadditionsmechanismus thermisch erlaubt durch das Metall-d-Orbitale als Leerorbital",
        answerB = "Das Metall-Carben (Metallcyclobutanintermediat via [2+2]-Cycloaddition) tauscht Alkylidenreste zwischen zwei Olefinen; der Mechanismus läuft über Metallacyclobutan-Intermediate",
        answerC = "Grubbs-Katalysatoren aktivieren die C=C-Doppelbindung durch oxidative Addition beider Olefine",
        answerD = "Die Reaktion folgt einem freien Radikalmechanismus initiiert durch das Rutheniummetal-Zentrum",
        correctAnswer = 1, // B
        explanation = "Die Olefin-Metathese verläuft über einen Chauvin-Mechanismus: Ein Metall-Carben ([Ru]=CR₂) reagiert mit einem Olefin via [2+2]-Cycloaddition zum Metallacyclobutan, das dann retro-[2+2] zum neuen Olefin und neuen Metallcarben öffnet. Grubbs-Ru-Katalysatoren (1. und 2. Generation) sind luft- und wasserstabil und ermöglichten die breite Anwendung der RCM (Ring-Closing Metathesis).",
        difficulty = 4,
        funFact = "Yves Chauvin, Robert Grubbs und Richard Schrock erhielten 2005 den Chemienobelpreis für die Metathese. Grubbs-Katalysatoren werden auch in der Totalsynthese von Naturstoffen wie Epothilon eingesetzt."
    ),

    // Question 21 — Neuroimmunology: Blood-Brain Barrier
    Question(
        categoryId = 2,
        questionText = "Welche molekulare Struktur ist hauptverantwortlich für die Dichtigkeit der Blut-Hirn-Schranke in Hirnkapillaren?",
        answerA = "Kollagen-IV-Fasern in der Basallamina bilden die primäre Barriere",
        answerB = "Claudin-5 und Occludin in Tight Junctions zwischen Endothelzellen, unterstützt durch Perizyten und Astrozytenfortsätze",
        answerC = "P-Glykoprotein-Pumpen exprimiert auf Astrozytenfortsätzen",
        answerD = "Die gliale Begrenzungsmembran aus Astrozyten bildet die eigentliche Blut-Hirn-Schranke",
        correctAnswer = 1, // B
        explanation = "Die BBB beruht primär auf den Tight Junctions zwischen Hirnendothelzellen, die durch die Transmembranproteine Claudin-5, Occludin und Junctions Adhesion Molecules (JAMs) gebildet werden. Diese verhindern den parazellulären Stofftransport. Perizyten regulieren die Barriereeigenschaften und Astrozytenfortsätze (Endfüße) induzieren Tight-Junction-Expression durch VEGF- und Angiopoetin-1-Signaling.",
        difficulty = 4,
        funFact = "Claudin-5-Knockout-Mäuse sind lebensfähig, zeigen aber massiv erhöhte BBB-Permeabilität für kleine Moleküle. Claudin-5 ist damit das kritischste Tight-Junction-Protein der BBB."
    ),

    // Question 22 — Neuroimmunology: Microglia
    Question(
        categoryId = 2,
        questionText = "Welchen embryonalen Ursprung haben Mikroglia und wie unterscheiden sie sich von anderen ZNS-Immunzellen?",
        answerA = "Mikroglia stammen aus dem Knochenmark und wandern post-natal ins Gehirn ein",
        answerB = "Mikroglia stammen aus dem Dottersack (Primordialzellen, ~E8.5 in der Maus) und besiedeln früh das Gehirn; sie unterscheiden sich von perivaskulären Makrophagen und meningealen Makrophagen durch ihre einzigartige Ontogenie und ihren stabilen Selbsterneuerungsstatus im adulten ZNS",
        answerC = "Mikroglia entstehen aus Neuroepithelzellen durch Differenzierung im ZNS",
        answerD = "Mikroglia sind differenzierte Astrozyten mit phagozytärer Funktion",
        correctAnswer = 1, // B
        explanation = "Mikroglia haben einen einzigartigen Ursprung: Sie entstammen primitiven Makrophagen aus dem embryonalen Dottersack und kolonisieren das Gehirn vor der Schließung der Blut-Hirn-Schranke. Im adulten Gehirn erneuern sie sich durch lokale Proliferation ohne Beitrag von Knochenmarksvorläufern (Ausnahme: nach Konditionierungsbestrahlung). Ihr spezifischer Transkriptionsfaktor ist PU.1, kombiniert mit TGF-β-abhängigen Mikroglia-Signaturgenen wie TMEM119 und P2RY12.",
        difficulty = 4,
        funFact = null
    ),

    // Question 23 — Neuroimmunology: Neuroinflammation
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus aktivieren beschädigte Neuronen Mikroglia, und welche Rolle spielen DAMPs dabei?",
        answerA = "Beschädigte Neuronen sekretieren TNF-α, das direkt Mikroglia aktiviert",
        answerB = "Neuronen setzen DAMPs (Damage-Associated Molecular Patterns) wie ATP, HMGB1 und Hitzeschockproteine frei, die an PRRs (TLR4, P2X7, RAGE) auf Mikroglia binden und NF-κB-abhängige Entzündungsantworten auslösen",
        answerC = "Mikroglia werden ausschließlich durch IL-1β aus infiltrierenden Monozyten aktiviert",
        answerD = "Beschädigte Neuronen exprimieren MHC-II und präsentieren direkt Antigene an Mikroglia",
        correctAnswer = 1, // B
        explanation = "DAMPs (alarmins) sind intrazellulläre Moleküle, die bei Zellschaden extrazellulär freigesetzt werden. ATP aktiviert purinische P2X7/P2Y12-Rezeptoren auf Mikroglia und dient als 'find-me'-Signal. HMGB1 bindet TLR4/RAGE. Hitzeschockproteine (HSP60, HSP70) aktivieren TLR4. Diese DAMP-PRR-Signaltransduktion aktiviert NF-κB und induziert die Produktion von IL-1β, IL-6, TNF-α und ROS.",
        difficulty = 4,
        funFact = "Das NLRP3-Inflammasom in Mikroglia ist ein wichtiger Verstärker von DAMPs: Es prozessiert Pro-IL-1β zu aktivem IL-1β und ist ein therapeutisches Ziel bei Alzheimer und anderen neurodegenerativen Erkrankungen."
    ),

    // Question 24 — Neuroimmunology: Multiple Sclerosis
    Question(
        categoryId = 2,
        questionText = "Welcher immunologische Mechanismus ist für die Demyelinisierung bei Multipler Sklerose primär verantwortlich?",
        answerA = "NK-Zellen töten direkt Oligodendrozyten durch Perforin-Granzym-B",
        answerB = "Myelin-reaktive CD4+ T-Helferzellen (Th1/Th17) überwinden die BBB, aktivieren Makrophagen und Mikroglia, die dann Myelin phagozytieren; CD8+ T-Zellen töten direkt Oligodendrozyten via MHC-I",
        answerC = "B-Zellen produzieren Antikörper gegen Basalmembrankomponenten, die Oligodendrozyten abtöten",
        answerD = "Regulatory T-Zellen werden hyperaktiv und aktivieren Entzündungskaskaden",
        correctAnswer = 1, // B
        explanation = "MS ist eine T-Zell-vermittelte Autoimmunerkrankung. Myelin-spezifische CD4+ Th1/Th17-Zellen überqueren die BBB und setzen IFN-γ, IL-17 und TNF-α frei, was Mikroglia und Makrophagen zur Myelinphagozytose aktiviert. CD8+ T-Zellen (dominant im chronischen Läsionsherd) zerstören Oligodendrozyten direkt via MHC-I/Perforin. Autoantigene sind u.a. MBP, MOG und PLP.",
        difficulty = 4,
        funFact = null
    ),

    // Question 25 — Neuroimmunology: Autoimmune Encephalitis
    Question(
        categoryId = 2,
        questionText = "Gegen welches Antigen richten sich die Autoantikörper bei der häufigsten Form der Autoimmun-Enzephalitis, und welche klinischen Symptome entstehen?",
        answerA = "Anti-MOG: demyelinisierende Läsionen ähnlich wie bei MS",
        answerB = "Anti-NMDA-Rezeptor (NR1-Untereinheit): psychiatrische Symptome, Epilepsie, Bewegungsstörungen, Bewusstseinsminderung – verursacht durch Internalisierung und Funktionsverlust von NMDA-Rezeptoren",
        answerC = "Anti-Dopaminrezeptor D2: hyperkinetische Bewegungsstörungen",
        answerD = "Anti-GFAP: isolierte Kleinhirnataxie ohne psychiatrische Symptome",
        correctAnswer = 1, // B
        explanation = "Anti-NMDA-Rezeptor-Enzephalitis (Dalmau 2007) ist die häufigste Autoimmun-Enzephalitis. IgG-Antikörper gegen die GluN1/NR1-Untereinheit des NMDA-Rezeptors führen zur Rezeptorinternalisierung und Hypo-Glutamataktivität. Klinik: prodromale Flu-Symptome → Psychose → Epilepsie → Bewusstseinsstörung → vegetative Instabilität → Katatonie. 80% sind Frauen, 50% haben einen ovariellen Teratom als Trigger.",
        difficulty = 4,
        funFact = "Anti-NMDA-Rezeptor-Enzephalitis wurde früher oft als Schizophrenie fehldiagnostiziert. Seit der Entdeckung durch Josep Dalmau werden viele Patienten rechtzeitig mit Immuntherapie (Steroide, IVIG, Rituximab) behandelt."
    ),

    // Question 26 — Oceanographic Science: Thermohaline Circulation
    Question(
        categoryId = 2,
        questionText = "Wo beginnt das tiefe Wasser der globalen thermohalinen Zirkulation (atlantische meridionale Umwälzzirkulation, AMOC) zu versinken und warum?",
        answerA = "Im Äquatorialen Atlantik, weil die Wassertemperatur dort am höchsten ist",
        answerB = "Im Nordatlantik (Labradorsee, Grönländisches Meer), weil dort warmes salzreiches Wasser abkühlt und durch erhöhte Dichte absinkt; Salz verbleibt beim Gefrieren im Wasser und erhöht die Dichte weiter",
        answerC = "Im Südpazifik bei der Antarktischen Divergenz, weil dort starke Winde das Wasser vertikal pumpen",
        answerD = "Im Mittelmeer, weil das Wasser durch Verdunstung so salzig und dicht wird",
        correctAnswer = 1, // B
        explanation = "AABW (Antarctic Bottom Water) und NADW (North Atlantic Deep Water) sind die zwei Hauptquellen des Tiefenwassers. Im Nordatlantik verliert der Golfstrom Wärme an die Atmosphäre und wird dichter. Bei Meereisbildung in der Labradorsee und den Nordischen Meeren reichert das verbleibende Wasser durch Brine-Rejection Salz an, erhöht die Dichte über den kritischen Wert und sinkt ab – ein Prozess namens tiefe Konvektion.",
        difficulty = 4,
        funFact = "Eine Verlangsamung der AMOC durch schmelzendes Grönlandeis (weniger dichtes Süßwasser) könnte Westeuropa um 5-8 °C abkühlen, obwohl der globale Erwärmungstrend anhält – ein potenzieller Kipppunkt des Klimasystems."
    ),

    // Question 27 — Oceanographic Science: Ocean Sediment Records
    Question(
        categoryId = 2,
        questionText = "Welche Isotopensignatur in marinen Tiefseesedimenten wird hauptsächlich für die Rekonstruktion vergangener Meerestemperaturen und Eisvolumina genutzt?",
        answerA = "Das C-14/C-12-Verhältnis in organischem Kohlenstoff",
        answerB = "Das ¹⁸O/¹⁶O-Verhältnis in Foraminiferen-Calcit: leichteres ¹⁶O reichert sich im Eis an, schwereres ¹⁸O bleibt im Ozean; der δ¹⁸O-Wert steigt mit Vereisungsgrad und sinkender Temperatur",
        answerC = "Das Sr/Ca-Verhältnis in benthischen Foraminiferen",
        answerD = "Das ³He/⁴He-Verhältnis kosmischen Ursprungs in Tiefseesedimenten",
        correctAnswer = 1, // B
        explanation = "Der δ¹⁸O-Wert von Foraminiferen-Calcit reflektiert zwei Signale: das Eisvolumen-Signal (globales Meerwasser-δ¹⁸O steigt um ~1‰ pro 10 m Meeresspiegel-Anstieg wegen ¹⁶O-Anreicherung im Eis) und ein Temperatur-Signal (~0,27‰/°C). Benthische Foraminiferen spiegeln hauptsächlich globales Eisvolumen wider. Die LR04-Stapelkurve von 57 marinen δ¹⁸O-Einträgen ermöglicht die Datierung von Meeressedimenten bis 5,3 Ma zurück.",
        difficulty = 4,
        funFact = null
    ),

    // Question 28 — Oceanographic Science: Hydrothermal Vents
    Question(
        categoryId = 2,
        questionText = "Welche chemosynthetische Reaktion bildet die Basis der Nahrungskette an hydrothermalen Schwarzen Rauchern der Tiefsee?",
        answerA = "Photosynthese durch Extremophile, die auf chemolumineszente Energie zurückgreifen",
        answerB = "Schwefeloxidation: HS⁻ + 2 O₂ → SO₄²⁻ + H⁺; sulfidoxidierende Bakterien (Thiomicrospira, Beggiatoa) fixieren CO₂ via Calvin-Zyklus mittels der Energie dieser Reaktion",
        answerC = "Methanoxidation durch aerobe Archaeen bildet den primären Kohlenstoffeintrag",
        answerD = "Nitrifikation von hydrothermalen NH₃-Emissionen durch Nitrifizierer",
        correctAnswer = 1, // B
        explanation = "Schwarze Raucher emittieren H₂S-reiches, heißes Wasser (>350 °C). Chemolithotrophe Bakterien oxidieren H₂S mit gelöstem O₂ und gewinnen so Energie für die CO₂-Fixierung. Symbiotische Beziehungen sind entscheidend: Riesenröhrenwürmer (Riftia pachyptila) beherbergen Endosymbionten (Candidatus Endoriftia persephone) in einem spezialisierten Organ (Trophosom), der über 10% des Körpergewichts ausmacht.",
        difficulty = 4,
        funFact = "Hydrothermalquellen wurden 1977 bei der Galapagos-Riftzone entdeckt – ein Schock für die damalige Biologie, die annahm, Sonnenlicht sei zwingend notwendig für das Leben. Diese Entdeckung veränderte unsere Sicht auf die Entstehung des Lebens und die Möglichkeit für Leben auf Enceladus oder Europa."
    ),

    // Question 29 — Oceanographic Science: Marine Isotope Stages
    Question(
        categoryId = 2,
        questionText = "Was bezeichnet der Marine Isotopenstadium-Wechsel MIS 11 und warum gilt er als Analogon für die aktuelle Warmzeit?",
        answerA = "MIS 11 ist ein Kaltzeitzyklus vor 420.000 Jahren mit extremer Vereisungsstärke",
        answerB = "MIS 11 (~400.000–374.000 Jahre BP) ist eine außergewöhnlich lange Warmzeit mit minimaler Exzentrizität der Erdorbital – astronomisch ähnlich dem Holozän – und diente damit als Benchmark für natürliche interglaziale Klimavariabilität",
        answerC = "MIS 11 bezeichnet den letzten Polumkehrereignis des Erdsmagnetfelds",
        answerD = "MIS 11 ist das älteste Interglazial, das mit Eisbohrkernmethoden direkt nachgewiesen werden konnte",
        correctAnswer = 1, // B
        explanation = "Marine Isotopenstadien werden durch Insolationszyklen (Milanković) gesteuert. MIS 11 (~400–374 ka BP) fällt in eine Phase sehr geringer orbitaler Exzentrizität (wie das aktuelle Holozän), was bedeutet, dass saisonale Schwankungen der Sonneneinstrahlung minimal waren. MIS 11 war extrem lang (~30.000 Jahre) und warm, mit Meeresspiegel ~6–13 m höher als heute. Paleoklimatiker nutzen es als worst-case-Szenario für das natürliche Holozän.",
        difficulty = 4,
        funFact = null
    ),

    // Question 30 — Oceanographic Science: Ocean Circulation Models
    Question(
        categoryId = 2,
        questionText = "Was ist die 'Stommel-Bifurkation' in Modellen der Nordatlantischen Zirkulation und welche Implikation hat sie für den Klimawandel?",
        answerA = "Eine bifurkationale Störung, bei der der Golfstrom zwischen zwei stabilen Bahnen wechselt",
        answerB = "Ein Bifurkationspunkt, an dem die AMOC zwei stabile Gleichgewichte hat (stark und schwach/abwesend); durch Süßwasserzufuhr kann ein irreversibler Übersprung vom starken in den schwachen Zustand eintreten – ein potenzieller Tipping Point",
        answerC = "Die Aufspaltung des Golfstroms in den Nordatlantikstrom und den Azorenstrom bei den Bermudas",
        answerD = "Die bifraktionale Turbulenz in der Labradorsee zwischen Zyklonalwirbeln und Antizyklonen",
        correctAnswer = 1, // B
        explanation = "Henry Stommel zeigte 1961 in einem einfachen Box-Modell, dass die thermohaline Zirkulation zwei stabile Zustände haben kann: einen starken (normalen) und einen schwachen/kollabierten. Die Stärke wird durch Temperatur-Salinität-Feedbacks reguliert. Schmelzendes Grönlandeis verdünnt den Nordatlantik, verringert die Dichte und könnte die AMOC über eine Hysteresisgrenze zum Kollaps bringen – ein nichtlinearer Kipppunkt.",
        difficulty = 4,
        funFact = "Aktuelle Rekonstruktionen (Caesar et al. 2021) zeigen, dass die AMOC sich seit 1950 um ~15% verlangsamt hat – auf den schwächsten Stand seit mindestens 1000 Jahren. RAPID-Beobachtungsnetz misst die AMOC-Stärke seit 2004 kontinuierlich."
    ),

    // Question 31 — Advanced Quantum Mechanics: Density Matrix
    Question(
        categoryId = 2,
        questionText = "Wann muss ein Quantensystem durch eine Dichtematrix (statistischer Operator) statt durch einen reinen Zustandsvektor beschrieben werden?",
        answerA = "Immer wenn das System mehr als zwei Quantenzustände hat",
        answerB = "Wenn das System mit einer Umgebung verschränkt ist oder klassische statistische Unwissenheit über den Zustand besteht – dann ist der Zustand ein gemischter Zustand mit Tr(ρ²) < 1",
        answerC = "Nur bei relativistischen Quantensystemen über 1 GeV Energie",
        answerD = "Wenn mehr als drei Teilchen beteiligt sind und die Wellenfunktion zu komplex wird",
        correctAnswer = 1, // B
        explanation = "Ein reiner Zustand |ψ⟩ hat ρ = |ψ⟩⟨ψ| mit Tr(ρ²) = 1. Ein gemischter Zustand ρ = Σᵢ pᵢ |ψᵢ⟩⟨ψᵢ| hat Tr(ρ²) < 1 und entsteht entweder durch (a) klassische Unwissenheit über den Zustand oder (b) Redzierung eines verschränkten Gesamtzustands auf ein Subsystem (partielle Spur). Die Von-Neumann-Entropie S = −Tr(ρ ln ρ) misst die Reinheit des Zustands.",
        difficulty = 4,
        funFact = null
    ),

    // Question 32 — Advanced Quantum Mechanics: Quantum Decoherence
    Question(
        categoryId = 2,
        questionText = "Wie erklärt Quantendekoheräz den scheinbaren Kollaps der Wellenfunktion bei Messungen?",
        answerA = "Dekohärenz ist identisch mit dem Messprozess und kollabiert die Wellenfunktion auf einen Eigenwert",
        answerB = "Durch Wechselwirkung mit der Umgebung werden Quantenüberlagerungen in Ensembles von klassisch-korrelierten Zuständen (Pointer States) umgewandelt; die Off-Diagonal-Elemente der reduzierten Dichtematrix verschwinden exponentiell schnell",
        answerC = "Dekohärenz zeigt, dass Quantenmechanik nur bei T = 0 K gilt",
        answerD = "Dekohärenz erklärt, warum Quantencomputer nicht skalieren können",
        correctAnswer = 1, // B
        explanation = "Im Dekohärenz-Formalismus (Zeh 1970, Zurek 1981) koppelt ein Quantensystem an seine Umgebung. Die Gesamtwellenfunktion |System+Umgebung⟩ bleibt unitär, aber die reduzierte Dichtematrix des Systems (nach partieller Spur über Umgebungsfreiheitsgrade) verliert ihre Off-Diagonal-Elemente (Quantenkohärenzen) exponentiell schnell. Die Dekoheränzzeit ist typischerweise 10⁻²⁰ s für makroskopische Objekte, was das Verschwinden von Quanteneffekten erklärt.",
        difficulty = 4,
        funFact = "Ein C₆₀-Fullerenmolekül zeigt in eleganten Experimenten (Arndt, Wien) immer noch Interferenzmuster – es ist groß genug, um die Grenze zwischen Quanten- und klassischer Welt zu erkunden, aber die Dekoheränzzeit ist noch nicht zu kurz."
    ),

    // Question 33 — Advanced Quantum Mechanics: Berry Phase
    Question(
        categoryId = 2,
        questionText = "Was ist die Berry-Phase (geometrische Phase) in der Quantenmechanik?",
        answerA = "Eine komplexe Zahl in der Wellenfunktion, die aus quantenmechanischen Impulsoszillationen entsteht",
        answerB = "Eine zusätzliche, nicht-dynamische Phase γ, die ein Quantenzustand bei adiabatischer Entwicklung entlang eines geschlossenen Weges im Parameterraum akkumuliert; sie hängt nur von der Geometrie des Weges ab, nicht von der Zeit",
        answerC = "Der Phasenunterschied zwischen dem Grundzustand und dem ersten angeregten Zustand",
        answerD = "Eine relativistische Phasenkorrektur für schnelle Elektronen",
        correctAnswer = 1, // B
        explanation = "Michael Berry (1984) zeigte, dass ein Quantenzustand nach einem adiabatischen Umlauf im Parameterraum eine Phase γ = i ∮ ⟨n|∇_R|n⟩·dR akkumuliert, die unabhängig von der Geschwindigkeit des Umlaufs ist (geometrisch). In der Festkörperphysik manifistiert sich Berry-Phase als Anomalous Hall Effect, topologische Invarianten (Chern-Zahl), und in der Interferometrie von Spinoren.",
        difficulty = 4,
        funFact = null
    ),

    // Question 34 — Advanced Quantum Mechanics: Adiabatic Theorem
    Question(
        categoryId = 2,
        questionText = "Was besagt das adiabatische Theorem der Quantenmechanik (Born & Fock 1928)?",
        answerA = "In einem adiabatischen Prozess bleibt die Entropie eines Quantensystems konstant",
        answerB = "Wenn sich der Hamilton-Operator eines Quantensystems hinreichend langsam ändert (adiabatisch), bleibt ein Eigenvektor des instantanen Hamiltonians ein Eigenvektor – das System 'folgt' seinem Energieniveau ohne Übergänge",
        answerC = "Adiabatische Prozesse sind immer reversibel in der Quantenmechanik",
        answerD = "Die Energie eines Quantensystems ändert sich nicht bei adiabatischer Kompression",
        correctAnswer = 1, // B
        explanation = "Die adiabatische Bedingung ist ℏ|⟨m|dH/dt|n⟩|/(Em−En)² ≪ 1 – die Änderungsrate des Hamiltonians ist klein verglichen mit dem Energieabstand der relevanten Niveaus. Das Theorem bildet die Grundlage für adiabatisches Quantencomputing (D-Wave) und erklärt Landau-Zener-Tunneling bei Verletzung der Adiabatizität.",
        difficulty = 4,
        funFact = "Adiabatisches Quantencomputing kodiert Optimierungsprobleme in den Grundzustand eines Hamiltonians und löst sie durch langsames Variieren des Hamiltonians. Das System folgt adiabatisch dem Grundzustand und liefert am Ende die Lösung."
    ),

    // Question 35 — Advanced Quantum Mechanics: WKB Approximation
    Question(
        categoryId = 2,
        questionText = "Die WKB-Näherung (Wentzel-Kramers-Brillouin) liefert für das quantenmechanische Tunneln durch eine Barriere welche Transmissionswahrscheinlichkeit?",
        answerA = "T ≈ exp(+2∫√(2m(V(x)−E)/ℏ²)dx), da Tunneln die Energie erhöht",
        answerB = "T ≈ exp(−2∫√(2m(V(x)−E)/ℏ²)dx), da die Wellenfunktion in der klassisch verbotenen Zone exponentiell evaneszent abfällt; das Integral läuft über die klassisch verbotene Region",
        answerC = "T ≈ (E/V₀)², proportional zur kinetischen Energie des einfallenden Teilchens",
        answerD = "T ≈ 1/(1 + e^(V₀/kT)), analog zur Boltzmann-Verteilung",
        correctAnswer = 1, // B
        explanation = "In der klassisch verbotenen Region (E < V(x)) ist die WKB-Wellenfunktion ψ ∝ exp(±∫κ(x)dx) mit κ(x) = √(2m(V−E))/ℏ. Die Transmissionswahrscheinlichkeit ist T ≈ exp(−2∫κ(x)dx), das Gamow-Integral. Dies erklärt den α-Zerfall (Gamow 1928), Feld-Elektronenemission (Fowler-Nordheim), und quantenmechanisches Tunneln in chemischen Reaktionen.",
        difficulty = 4,
        funFact = null
    ),

    // Question 36 — Environmental Chemistry: Persistent Organic Pollutants
    Question(
        categoryId = 2,
        questionText = "Welche strukturelle Eigenschaft macht polychlorierte Biphenyle (PCBs) zu persistenten organischen Schadstoffen (POPs)?",
        answerA = "Ihre hohe Wasserlöslichkeit ermöglicht globalen Transport durch Meeresströmungen",
        answerB = "Der aromatische Biphenyl-Grundkörper mit Chlorsubstituenten ist metabolisch schwer abzubauen (C-Cl-Bindungen sind stabil, keine Mikrobienenzyme für Dechlorierung); hohe Lipophilizität (log Kow 5–8) führt zu Bioakkumulation",
        answerC = "PCBs polymerisieren in der Umwelt zu größeren Molekülen die unabgebaut bleiben",
        answerD = "Ihre Gasphase ist reaktiv mit OH-Radikalen, was weitere toxische Verbindungen erzeugt",
        correctAnswer = 1, // B
        explanation = "PCBs haben log Kow-Werte von 5–8, was extreme Lipophilizität bedeutet. Sie akkumulieren im Fettgewebe (Bioakkumulation) und reichern sich in der Nahrungskette an (Biomagnifikation um Faktor 10⁵–10⁶). Mikrobielle Dechlorierung ist langsam unter aeroben Bedingungen; unter Anaeroben reductive Dechlorierung ist möglich. Das Stockholmer Übereinkommen (2001) verbot PCBs global.",
        difficulty = 4,
        funFact = "Der Biomagnifikationsfaktor für PCBs in der Arktis ist so hoch, dass Eisbärenleber PCB-Konzentrationen aufweist, die das 3-Millionen-fache der Meereskonzentration erreichen. Eisbären sind trotz geographischer Ferne von Industriequellen stark belastet."
    ),

    // Question 37 — Environmental Chemistry: Bioaccumulation Kinetics
    Question(
        categoryId = 2,
        questionText = "Was ist der Biokonzentrationsfaktor (BCF) und wie hängt er mit dem Oktanol-Wasser-Verteilungskoeffizienten (Kow) zusammen?",
        answerA = "BCF = Konzentration im Organism / Konzentration im Sediment; BCF ∝ log Kow²",
        answerB = "BCF = C_Organismus / C_Wasser im Gleichgewicht; für lipophile Substanzen gilt empirisch log BCF ≈ log Kow − 1,32 (Mackay 1982), da Kow die Lipid/Wasser-Verteilung approximiert",
        answerC = "BCF = Aufnahmerate / Eliminationsrate; unabhängig von Kow",
        answerD = "BCF ist die Konzentration im Fettgewebe dividiert durch die Konzentration im Muskel",
        correctAnswer = 1, // B
        explanation = "Der BCF quantifiziert die Anreicherung aus Wasser. Empirische Beziehungen: log BCF ≈ 0,85·log Kow − 0,70 bis log BCF ≈ log Kow − 1,32. Bei log Kow > 5 sinkt der BCF manchmal ab, weil sehr lipophile Substanzen zu langsam aufgenommen werden oder stark metabolisiert werden. Der Bioakkumulationsfaktor (BAF) schließt Nahrungsaufnahme ein und ist für hydrophobe Verbindungen deutlich höher als BCF.",
        difficulty = 4,
        funFact = null
    ),

    // Question 38 — Environmental Chemistry: Atmospheric Radical Chemistry
    Question(
        categoryId = 2,
        questionText = "Welche Rolle spielt das Hydroxyl-Radikal (OH•) in der Troposphäre und wie wird es primär gebildet?",
        answerA = "OH• ist ein Treibhausgas, das durch Blitzentladungen aus N₂ und H₂O gebildet wird",
        answerB = "OH• ist der wichtigste troposphärische Oxidant ('Waschmittel der Atmosphäre'): O₃ + hν (λ <320 nm) → O(¹D) + O₂; O(¹D) + H₂O → 2 OH•; OH• reagiert mit fast allen atmosphärischen Spurengasen (CH₄, CO, SO₂, VOCs)",
        answerC = "OH• entsteht hauptsächlich durch Photolyse von NO₂ in der Stratosphäre",
        answerD = "OH• wird durch HO₂-Disproportionierung an Aerosoloberflächen gebildet",
        correctAnswer = 1, // B
        explanation = "OH• hat eine globale Lebenszeit von ~1 s, aber eine enorme Reaktivität. Die Primärquelle ist die O₃-Photolyse im UV-B-Bereich (λ <320 nm), die angeregten Sauerstoffatome O(¹D) erzeugt, die mit Wasserdampf reagieren. Die globale OH-Konzentration (~10⁶ Moleküle/cm³) kontrolliert die Lebenszeit von CH₄ (9 Jahre), CO (2 Monate), und bestimmt die Oxidationskapazität der Atmosphäre.",
        difficulty = 4,
        funFact = "Die globale OH-Konzentration schwankt mit dem ENSO-Zyklus: El-Niño-Jahre haben durch erhöhte Brandemissionen (CO, Isoprene) niedrigere OH-Konzentrationen, was Methan-Lebenszeiten verlängert und zum CH₄-Anstieg beiträgt."
    ),

    // Question 39 — Environmental Chemistry: Microplastics
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus gelangen Nanoplastikpartikel in biologisches Gewebe, und welcher Größenbereich ist dabei kritisch?",
        answerA = "Nanoplastik wird ausschließlich oral aufgenommen und akkumuliert im Darm",
        answerB = "Partikel <150 nm können durch Endozytose in Zellen eindringen; Partikel <500 nm passieren die intestinale Barriere durch M-Zellen der Peyerschen Plaques; Nanopartikel unter ~100 nm können potentiell die Blut-Hirn-Schranke überwinden",
        answerC = "Nanoplastik wird nur durch Atemwege aufgenommen und akkumuliert in Lungenbläschen",
        answerD = "Plastikpartikel unter 1 µm werden vollständig von Makrophagen eliminiert ohne Gewebepenetration",
        correctAnswer = 1, // B
        explanation = "Die biologische Verfügbarkeit von Mikroplastik hängt stark von der Größe ab: Partikel im Mikrometerbereich werden phagozytiert, während Nanopartikel (<200 nm) aktive Transportwege (Endozytose, Transzytose) nutzen können. Peyersche Plaques im Dünndarm mit M-Zellen ermöglichen transepithelialen Transport. In humanem Blut, Lungengewebe und Hirngewebe wurden Plastikpartikel detektiert. Chemische Additiva (Weichmacher, Flammschutzmittel) erhöhen die Toxizität.",
        difficulty = 4,
        funFact = null
    ),

    // Question 40 — Environmental Chemistry: Water Treatment Chemistry
    Question(
        categoryId = 2,
        questionText = "Welche Desinfektionsnebenprodukte (DBPs) entstehen bei der Chlorierung von Trinkwasser mit natürlicher organischer Substanz und welche Gesundheitsrisiken sind assoziiert?",
        answerA = "Chloramine entstehen und verursachen Wassergeschmacksprobleme",
        answerB = "Trihalogenmethane (THMs, z.B. Chloroform CHCl₃) und halogenierte Essigsäuren (HAAs) entstehen durch Reaktion von Cl₂ mit huminen und fulvinen Säuren; beide Substanzklassen sind potenziell karzinogen (Kategorie 2B/2A nach IARC)",
        answerC = "Chlordioxid reagiert mit Carbonat zu toxischen Carbonylchloriden",
        answerD = "Hypochlorit oxidiert Nitrat zu Nitrosamin, dem Hauptkarzinogen in Trinkwasser",
        correctAnswer = 1, // B
        explanation = "Bei der Chlorierung reagiert Cl₂ / HOCl mit natürlichen organischen Verbindungen (NOM: Huminsäuren, Fulvosäuren) durch Halogensubstitution und -addition. Trihalogenmethane (THM4: CHCl₃, CHBrCl₂, CHBr₂Cl, CHBr₃) und Haloacetate (HAA5: Mono-, Di-, Trichlor- und Monobromo-Essigsäuren) sind die wichtigsten regulierten DBPs. EU-Grenzwert: THM-Summe ≤100 µg/L, HAA5 ≤60 µg/L.",
        difficulty = 4,
        funFact = "Alternative Desinfektionsmittel wie UV-Bestrahlung und Ozon erzeugen weniger halogenierte DBPs, aber Ozon kann Bromat (BrO₃⁻) aus Bromid bilden. UV-Bestrahlung hat keine Residualwirkung und muss mit Cl₂ kombiniert werden."
    ),

    // Question 41 — Bioinformatics: Sequence Alignment
    Question(
        categoryId = 2,
        questionText = "Was ist der fundamentale Unterschied zwischen dem Smith-Waterman- und dem Needleman-Wunsch-Algorithmus für Sequenzalignment?",
        answerA = "Smith-Waterman aligniert DNA, Needleman-Wunsch Proteine",
        answerB = "Smith-Waterman findet optimale lokale Alignments (beste übereinstimmende Regionen innerhalb der Sequenzen); Needleman-Wunsch findet optimale globale Alignments (vollständige Sequenzen werden aligned); beide nutzen dynamische Programmierung",
        answerC = "Smith-Waterman ist heuristisch und schnell; Needleman-Wunsch ist exact aber langsam",
        answerD = "Needleman-Wunsch erlaubt gaps, Smith-Waterman nicht",
        correctAnswer = 1, // B
        explanation = "Beide Algorithmen nutzen dynamische Programmierung mit O(n·m)-Komplexität. Der Unterschied liegt in der Initialisierung und Rückverfolgung: NW initialisiert mit negativen Gap-Scores, findet das bestmögliche Alignment der gesamten Sequenzen. SW initialisiert Scores bei 0 (negative Scores werden auf 0 gesetzt) und findet die ähnlichsten Teilregionen. BLAST ist eine Heuristik basierend auf SW-Prinzipien für schnelle Datenbanksuchen.",
        difficulty = 4,
        funFact = null
    ),

    // Question 42 — Bioinformatics: Phylogenetic Methods
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Maximum-Likelihood- und Bayes'scher Phylogenierekonstruktion?",
        answerA = "Maximum Likelihood nutzt DNA-Sequenzen, Bayes'sche Methoden Proteindaten",
        answerB = "Maximum Likelihood sucht den Baum, der die beobachteten Daten unter einem Substitutionsmodell am wahrscheinlichsten macht (L = P(Daten|Baum,Modell)); Bayes'sche Inferenz berechnet P(Baum|Daten) = P(Daten|Baum)·P(Baum)/P(Daten) mit MCMC-Sampling und liefert Posterior-Wahrscheinlichkeiten für Äste",
        answerC = "Bayes'sche Methoden setzen keine Evolutionsmodelle voraus, ML schon",
        answerD = "Maximum Likelihood wird für wenige Sequenzen genutzt, Bayes für Genomvergleiche",
        correctAnswer = 1, // B
        explanation = "ML-Phylogenietik (RAxML, IQ-TREE) optimiert die Baumtopologie und Astlängen um den Likelihood-Score zu maximieren. Bootstrap-Werte quantifizieren die Unsicherheit durch Resampling. Bayes'sche Phylogenetik (MrBayes, BEAST) samplet den Posteriorraum via Markov Chain Monte Carlo (MCMC) und liefert posterior probability-Werte für Äste. Beide Methoden benötigen explizite Substitutionsmodelle (GTR, JC, HKY).",
        difficulty = 4,
        funFact = "Der GTR-Modell (General Time Reversible) mit Gamma-verteilter Ratenvariabilität (+G) und invarianten Positionen (+I) ist das am häufigsten verwendete Nukleotid-Substitutionsmodell für molekulare Phylogenetik."
    ),

    // Question 43 — Bioinformatics: Gene Ontology
    Question(
        categoryId = 2,
        questionText = "Aus welchen drei Hauptontologien besteht die Gene Ontology (GO) und was beschreibt jede davon?",
        answerA = "Genomstruktur, Proteinfaltung und Metabolismus",
        answerB = "Biologischer Prozess (BP: Zielgerichtete biologische Aktivitäten), Molekulare Funktion (MF: biochemische Aktivität auf molekularer Ebene, z.B. Bindungsaktivität) und Zelluläre Komponente (CC: Ort in der Zelle oder extrazellulärem Raum)",
        answerC = "Genexpression, Proteininteraktion und Signaltransduktion",
        answerD = "Phylogenetische Herkunft, Gewebeexpression und Pathologieassoziationen",
        correctAnswer = 1, // B
        explanation = "Die Gene Ontology (Ashburner et al. 2000) beschreibt Genfunktionen in drei Ontologien: Biologischer Prozess (z.B. GO:0006915 Apoptose), Molekulare Funktion (z.B. GO:0005524 ATP-Bindung) und Zelluläre Komponente (z.B. GO:0005634 Nukleus). Terme sind in hierarchischen DAGs (Directed Acyclic Graphs) organisiert mit is-a, part-of und regulates-Beziehungen. GO-Anreicherungsanalysen (Fisher-Test, GSEA) sind Standardmethoden in funktioneller Genomik.",
        difficulty = 4,
        funFact = null
    ),

    // Question 44 — Bioinformatics: Metagenomics
    Question(
        categoryId = 2,
        questionText = "Was ist das 'Binning' in der Metagenomik und welche Merkmale werden dabei genutzt?",
        answerA = "Die Klassifizierung von Metagenomdaten nach Probenentnahmeort (Meeresboden vs. Darm)",
        answerB = "Die Zuordnung von DNA-Fragmenten (Contigs) eines Metagenoms zu einzelnen Organismen (MAGs: Metagenome-Assembled Genomes) anhand von GC-Gehalt, Tetranukleotid-Frequenzmustern und Sequenzierungstiefe (Coverage)",
        answerC = "Die Filterung von Host-DNA aus klinischen Metagenomproben",
        answerD = "Die Sortierung von Sequenzen nach Qualitätswerten vor dem Assembly",
        correctAnswer = 1, // B
        explanation = "Metagenom-Binning rekonstruiert Genome einzelner Organismen aus komplexen Gemeinschaften ohne Kultivierung. Tetra-nukleotid-Frequenzen (oder k-mer-Komposition) sind genomspezifisch und stabiler als GC-Gehalt. Coverage-Informationen aus multiplen Proben (differentielles Binning) verbessern die Zuordnung. Tools: MetaBAT2, CONCOCT, MaxBin2. Binning-Güte wird durch CheckM anhand universeller single-copy Gene bewertet (Completeness, Contamination).",
        difficulty = 4,
        funFact = "In einem menschlichen Darm-Metagenom können 100–1000 verschiedene mikrobielle Spezies präsent sein, von denen >80% nicht kultivierbar sind. Metagenomik ermöglichte damit die Entdeckung komplett neuer Phyla wie Candidate Phyla Radiation (CPR)."
    ),

    // Question 45 — Bioinformatics: Protein Domain Databases
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Pfam-Domänen und CATH/SCOP-Einträgen in Proteindatenbanken?",
        answerA = "Pfam klassifiziert Proteine nach Organismus, CATH nach Größe",
        answerB = "Pfam identifiziert Sequenz-konservierte Domänenfamilien via Hidden Markov Models (HMMs) aus multiplen Sequenzalignments – also sequenzbasiert; CATH und SCOP klassifizieren Proteinstrukturen hierarchisch nach Topologie/Fold – also strukturbasiert",
        answerC = "CATH ist nur für eukaryotische Proteine, Pfam für alle Domänen des Lebens",
        answerD = "Pfam enthält experimentelle Strukturen, SCOP/CATH vorhergesagte Strukturen",
        correctAnswer = 1, // B
        explanation = "Pfam (jetzt in InterPro integriert) nutzt Profile-HMMs trainiert auf curierten Alignments homologer Domänen. Treffer in neuen Sequenzen identifizieren bekannte Domänenfamilien. CATH (Class, Architecture, Topology, Homologous Superfamily) und SCOP (Structural Classification of Proteins) klassifizieren dreidimensionale Faltungstypen. Da Struktur konservierter ist als Sequenz, finden strukturbasierte Klassifikationen evolutionäre Verwandtschaft bei <20% Sequenzidentität.",
        difficulty = 4,
        funFact = null
    ),

    // Question 46 — Nuclear Medicine: PET Imaging
    Question(
        categoryId = 2,
        questionText = "Welches physikalische Prinzip liegt der Positronen-Emissions-Tomographie (PET) zugrunde, und warum verwendet man ¹⁸F-FDG?",
        answerA = "¹⁸F emittiert direkt Gammastrahlung, die von Detektorkristallen gemessen wird; FDG wird wegen seiner kurzen Halbwertszeit von 20 Minuten bevorzugt",
        answerB = "Ein ¹⁸F-Kern zerfällt β⁺: ¹⁸F → ¹⁸O + e⁺ + νₑ; das Positron annihiliert mit einem Elektron zu zwei kollinearen 511-keV-Photonen; Koinzidenzdetektoren lokalisieren die Annihilation; FDG (¹⁸F-Fluordesoxyglucose) akkumuliert in stoffwechselaktivem Gewebe (Halbwertszeit 110 min)",
        answerC = "¹⁸F emittiert α-Teilchen; die Streuung dieser Teilchen im Gewebe wird tomographisch rekonstruiert",
        answerD = "PET nutzt die Kernresonanz von ¹⁸F in einem Magnetfeld zur Bildgebung",
        correctAnswer = 1, // B
        explanation = "PET beruht auf β⁺-Zerfall und Paarvernichtung. Das Positron hat eine kurze Reichweite (<2 mm in Gewebe) und annihiliert mit einem Elektron zu zwei 511-keV-Photonen in exakt entgegengesetzten Richtungen (180°). Koinzidenzdetektion beider Photonen innerhalb eines Zeitfensters (nanoseconds) definiert eine Annihilationslinie. FDG wird wie Glucose in Zellen aufgenommen und phosphoryliert (FDG-6-P), kann aber nicht weiter metabolisiert werden und akkumuliert – besonders in Tumoren (Warburg-Effekt) und aktivem Hirngewebe.",
        difficulty = 4,
        funFact = "Die räumliche Auflösung eines PET-Scanners ist physikalisch durch die freie Weglänge des Positrons (~0,5–3 mm) und die Nicht-Kollinearität der Annihilationsphotonen (~0,5°) limitiert – klinische PET-Geräte erreichen ~4 mm Auflösung."
    ),

    // Question 47 — Nuclear Medicine: Mössbauer Spectroscopy
    Question(
        categoryId = 2,
        questionText = "Was ist der Mössbauer-Effekt und welche Informationen liefert Mössbauer-Spektroskopie über Eisenzentren in Proteinen?",
        answerA = "Fluoreszenzspektroskopie von Eisenatomen nach Röntgenanregung; liefert Oxidationszustand",
        answerB = "Rückstoßfreie Kernresonanzabsorption von Gammastrahlung (¹⁴·4 keV für ⁵⁷Fe): Isomerieverschiebung gibt Oxidationszustand (Fe²⁺ vs. Fe³⁺) und Spin-Zustand; Quadrupolaufspaltung gibt die lokale Symmetrie; Hyperfeinfeldaufspaltung im Magnetfeld gibt Spinzustand an",
        answerC = "Neutronenstreuung an Eisenkernen; gibt Kernradius und magnetisches Moment",
        answerD = "Mikrowellenspektroskopie von Ferritverbindungen in Lösung bei tiefen Temperaturen",
        correctAnswer = 1, // B
        explanation = "Rudolf Mössbauer (Nobelpreis 1961) entdeckte, dass Atomkerne in Festkörpern Gammaquanten ohne Rückstoß emittieren/absorbieren können. ⁵⁷Fe-Mössbauer-Spektroskopie liefert drei Hyperfeinkopplungsparameter: (1) Isomerieverschiebung δ (Oxidationszustand, Spin-Zustand, Koordination), (2) Quadrupolaufspaltung ΔEQ (elektrische Feldgradient = Symmetrie), (3) Hyperfeinfeld-Aufspaltung A (Spin-Zustand, Spinpolarisation). Anwendung: Charakterisierung von Eisen-Schwefel-Proteinen, Häm-Proteinen, Rieske-Zentren.",
        difficulty = 4,
        funFact = null
    ),

    // Question 48 — Nuclear Medicine: Radiopharmaceuticals
    Question(
        categoryId = 2,
        questionText = "Welche Eigenschaft eines Radionuklids ist entscheidend für seine therapeutische Verwendung in der nuklearmedizinischen Tumortherapie (z.B. PSMA-Therapie)?",
        answerA = "Hohe γ-Energie für tiefe Gewebepenetration und maximale Tumorschädigung",
        answerB = "Emisssion von α- oder β⁻-Teilchen mit kurzer Reichweite (α: <0,1 mm; β⁻: 1–10 mm) für lokale, zellnahe Strahlendeposition; gepaart mit tumorspezifischem Targeting-Molekül (z.B. PSMA-617 Ligand für ¹⁷⁷Lu oder ²²⁵Ac)",
        answerC = "Sehr lange Halbwertszeit (>1 Jahr) für kontinuierliche Strahlentherapie",
        answerD = "Elektronen-Einfang-Zerfall, da dieser keine schädliche Strahlung für normales Gewebe erzeugt",
        correctAnswer = 1, // B
        explanation = "Therapeutische Radionuklide müssen dichte, lokale Ionisationsspur erzeugen. ¹⁷⁷Lu (β⁻, Halbwertszeit 6,6 d, Reichweite ~0,5 mm) wird an PSMA-617 oder DOTATATE konjugiert für Prostatakrebs- bzw. neuroendokrine Tumortherapie. ²²⁵Ac (α, HWZ 10 d, sehr kurze Reichweite ~0,05 mm, sehr hohe LET) ist für mikro-metastatische Erkrankungen ideal. Die kurze Partikelreichweite schützt benachbartes gesundes Gewebe.",
        difficulty = 4,
        funFact = "Die VISION-Studie (2021) zeigte, dass ¹⁷⁷Lu-PSMA-617 das Gesamtüberleben bei metastasiertem, kastrationsresistentem Prostatakarzinom um 4 Monate verlängert. Es erhielt FDA-Zulassung 2022 unter dem Namen Pluvicto."
    ),

    // Question 49 — Nuclear Medicine: Neutron Activation Analysis
    Question(
        categoryId = 2,
        questionText = "Auf welchem Prinzip beruht die Neutronenaktivierungsanalyse (NAA) und welche Detektionsgrenze erreicht sie?",
        answerA = "Neutronen ionisieren Atome, die dann durch Massenspektrometrie analysiert werden; Nachweisgrenze liegt bei mg-Bereich",
        answerB = "Thermische Neutronen werden von Kernen eingefangen (n,γ)-Reaktion → instabile radioaktive Isotope entstehen; deren charakteristische γ-Strahlung (mit HPGe-Detektor) identifiziert die Elemente; Nachweisgrenzen im Picogramm- bis Nanogramm-Bereich",
        answerC = "Schnelle Neutronen beschleunigen Atome, die durch Lichtblitze detektiert werden",
        answerD = "Neutronenstreuung am Kernpotential liefert Elementverteilungskarten bei mm-Auflösung",
        correctAnswer = 1, // B
        explanation = "Bei der NAA wird die Probe mit thermischen Neutronen (E ~0,025 eV) bestrahlt, typischerweise in einem Forschungsreaktor. Kerne absorbieren Neutronen (Wirkungsquerschnitt in Barn): (A,Z) + n → (A+1,Z)* → β⁻-Zerfall → charakteristische γ-Linien. Mehrere Elemente können simultan bestimmt werden (multi-element). Die Methode ist zerstörungsfrei (INAA), äußerst empfindlich (pg/g für Au, Ir, As) und wird für geologische, archaeologische und forensische Proben genutzt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 50 — Nuclear Medicine: NMR Physics
    Question(
        categoryId = 2,
        questionText = "Welche physikalische Wechselwirkung zwischen Kernspins in einem Molekül liefert in der NMR-Spektroskopie strukturelle Abstandsinformation durch den J-Kopplungsmechanismus?",
        answerA = "Direkte magnetische Dipol-Dipol-Kopplung durch den Raum, skaliert mit r⁻³",
        answerB = "Skalare (indirekte) J-Kopplung über Bindungselektronen: Kernspins polarisieren Bindungselektronen (Fermi-Kontakt-Term), die den Spin auf benachbarte Kerne übertragen; ³J-Kopplungskonstanten folgen der Karplus-Gleichung ³J = A cos²φ − B cosφ + C und liefern Diederwinkelinformation",
        answerC = "Quantenmechanisches Tunneln des Kernspins zwischen benachbarten Kernen",
        answerD = "Elektrische Quadrupolkopplung von Kernen mit Spin I ≥ 1 an den elektrischen Feldgradienten",
        correctAnswer = 1, // B
        explanation = "Die skalare J-Kopplung erfolgt über chemische Bindungen, nicht durch den Raum (im Gegensatz zur dipolaren Kopplung D). Der Fermi-Kontakt-Term beschreibt die Wechselwirkung zwischen Kernspin und Elektronenspin an der Kernposition. Für ³J (vicinal coupling) gilt die Karplus-Gleichung: ³J hängt vom Diederwinkel φ zwischen den Bindungen ab. In COSY, HMBC und HSQC-Experimenten liefern J-Kopplungen Konnektivitätsinformation. J-Kopplungskonstanten sind unabhängig von der Feldstärke (in Hz), was sie von chemischen Verschiebungen unterscheidet.",
        difficulty = 4,
        funFact = "Die Karplus-Gleichung (Martin Karplus, Nobelpreis 2013 zusammen für Computerchemie) verbindet NMR-Daten mit Proteinrückgrat-Konformation und ist fundamental für die NMR-Proteinstrukturbestimmung."
    ),

)
