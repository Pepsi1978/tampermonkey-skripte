package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsHard(): List<Question> = listOf(

    // Question 1 – Quantum Mechanics: Wave-Particle Duality
    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Doppelspaltexperiment in der Quantenmechanik?",
        answerA = "Elektronen verhalten sich immer wie klassische Teilchen mit definiertem Weg",
        answerB = "Elektronen erzeugen ein Interferenzmuster auch wenn sie einzeln durch den Spalt geschossen werden",
        answerC = "Licht besteht ausschließlich aus Wellen ohne Teilchencharakter",
        answerD = "Die Wellennatur von Teilchen verschwindet bei höherer Energie",
        correctAnswer = 1, // B
        explanation = "Im Doppelspaltexperiment zeigen Elektronen ein Interferenzmuster auf dem Schirm, obwohl sie einzeln ausgesandt werden. Sobald man beobachtet, durch welchen Spalt das Elektron geht, verschwindet das Interferenzmuster – ein Beweis für den Welle-Teilchen-Dualismus.",
        difficulty = 3,
        funFact = "Richard Feynman nannte das Doppelspaltexperiment 'das einzige Rätsel der Quantenmechanik', da es die ganze Quantenmechanik in einem Experiment enthält."
    ),

    // Question 2 – Quantum Mechanics: Heisenberg Uncertainty Principle
    Question(
        categoryId = 2,
        questionText = "Was besagt die Heisenbergsche Unschärferelation exakt?",
        answerA = "Ein Elektron kann nicht gleichzeitig Spin-up und Spin-down haben",
        answerB = "Die Energie eines Photons ist proportional zu seiner Frequenz",
        answerC = "Das Produkt der Unschärfen von Ort und Impuls ist mindestens ℏ/2",
        answerD = "Kein zwei Elektronen können im gleichen Atom den gleichen Quantenzustand einnehmen",
        correctAnswer = 2, // C
        explanation = "Die Heisenbergsche Unschärferelation lautet Δx · Δp ≥ ℏ/2. Je genauer der Ort eines Teilchens bekannt ist, desto unschärfer ist zwangsläufig sein Impuls – und umgekehrt. Dies ist keine messtechnische Limitation, sondern ein fundamentales Naturgesetz.",
        difficulty = 3,
        funFact = null
    ),

    // Question 3 – Quantum Mechanics: Schrödinger Equation
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die zeitunabhängige Schrödinger-Gleichung Ĥψ = Eψ?",
        answerA = "Den Energiezustand eines harmonischen Oszillators in der Thermodynamik",
        answerB = "Die Eigenwertgleichung für stationäre Quantenzustände mit dem Hamilton-Operator",
        answerC = "Die Bewegungsgleichung eines Elektrons im klassischen Coulomb-Feld",
        answerD = "Die Wellenfunktion kollabiert beim Messprozess auf einen Eigenwert",
        correctAnswer = 1, // B
        explanation = "Die zeitunabhängige Schrödinger-Gleichung Ĥψ = Eψ ist eine Eigenwertgleichung, wobei Ĥ der Hamilton-Operator (Energieoperator), ψ die Wellenfunktion und E die erlaubten Energieeigenwerte sind. Sie liefert die stationären Zustände eines Quantensystems.",
        difficulty = 3,
        funFact = "Erwin Schrödinger entwickelte diese Gleichung 1926 und erhielt dafür 1933 den Nobelpreis für Physik, gemeinsam mit Paul Dirac."
    ),

    // Question 4 – Quantum Mechanics: Quantum Tunneling
    Question(
        categoryId = 2,
        questionText = "Welcher physikalische Effekt ermöglicht die Kernfusion in der Sonne trotz unzureichender klassischer kinetischer Energie der Protonen?",
        answerA = "Thermalionisation durch hohe Temperatur",
        answerB = "Quantentunnelung durch die Coulomb-Barriere",
        answerC = "Photoionisation durch intensive Gammastrahlung",
        answerD = "Bose-Einstein-Kondensation des Protonenplasmas",
        correctAnswer = 1, // B
        explanation = "Die Quantentunnelung erlaubt es Protonen, die Coulomb-Barriere zu 'durchtunneln', obwohl ihre thermische Energie klassisch nicht ausreicht, um die Abstoßung zu überwinden. Die Tunnelwahrscheinlichkeit ergibt sich aus dem exponentiellen Abfall der Wellenfunktion im klassisch verbotenen Bereich.",
        difficulty = 3,
        funFact = null
    ),

    // Question 5 – Quantum Mechanics: Superposition
    Question(
        categoryId = 2,
        questionText = "Was bezeichnet man als 'Kollaps der Wellenfunktion' in der Quantenmechanik?",
        answerA = "Die mathematische Normierung einer Wellenfunktion auf eins",
        answerB = "Das Verschwinden der Wellenfunktion außerhalb eines Potentialtopfs",
        answerC = "Den Übergang von einer Superposition aller möglichen Zustände auf einen definierten Eigenzustand bei der Messung",
        answerD = "Die Dekohärenz eines Quantensystems durch Wechselwirkung mit einem Magnetfeld",
        correctAnswer = 2, // C
        explanation = "Vor einer Messung befindet sich ein Quantenobjekt in einer Superposition aller möglichen Eigenzustände. Bei der Messung kollabiert die Wellenfunktion instantan auf einen einzigen Eigenzustand – der gemessene Wert ist das zugehörige Eigenwert. Der genaue Mechanismus ist noch nicht vollständig verstanden (Messproblem).",
        difficulty = 3,
        funFact = "Schrödingers Katze ist ein Gedankenexperiment, das diesen Kollaps veranschaulicht: Die Katze ist in Superposition von lebendig und tot – erst beim Öffnen der Box wird ein Zustand realisiert."
    ),

    // Question 6 – Organic Chemistry: Reaction Mechanisms
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet eine SN1- von einer SN2-Reaktion in der organischen Chemie?",
        answerA = "SN1 ist eine radikalische Reaktion, SN2 eine ionische",
        answerB = "SN1 läuft über ein Carbenium-Ionen-Intermediat in zwei Schritten ab, SN2 in einem konzertierten Schritt mit Inversion am Reaktionszentrum",
        answerC = "SN1 findet nur an primären, SN2 nur an tertiären Kohlenstoffatomen statt",
        answerD = "SN1 benötigt UV-Licht als Katalysator, SN2 nicht",
        correctAnswer = 1, // B
        explanation = "Bei der SN1-Reaktion bildet sich zunächst ein stabilisiertes Carbenium-Ion (bevorzugt bei tertiären C-Atomen), das dann vom Nucleophil angegriffen wird – Stereochemie: Racemisierung. Die SN2-Reaktion läuft konzertiert mit Walden-Umkehr ab und ist kinetisch zweiter Ordnung (bevorzugt bei primären C-Atomen).",
        difficulty = 3,
        funFact = null
    ),

    // Question 7 – Organic Chemistry: Stereochemistry
    Question(
        categoryId = 2,
        questionText = "Was bezeichnet die R/S-Nomenklatur (Cahn-Ingold-Prelog) in der Stereochemie?",
        answerA = "Die relative Stabilität zweier Diastereomere",
        answerB = "Die absolute Konfiguration an einem stereogenen Zentrum nach Prioritätsregeln",
        answerC = "Den Drehwinkel von polarisiertem Licht durch eine chirale Verbindung",
        answerD = "Die cis/trans-Konfiguration bei Doppelbindungen",
        correctAnswer = 1, // B
        explanation = "Das CIP-System weist jedem Substituenten an einem stereogenen Zentrum eine Priorität nach Ordnungszahl zu. Zeigt der Substituent mit niedrigster Priorität vom Betrachter weg und sind die übrigen Gruppen im Uhrzeigersinn geordnet, ist die Konfiguration R (rectus); gegen den Uhrzeigersinn = S (sinister).",
        difficulty = 3,
        funFact = "Ibuprofen ist ein chirales Molekül: Nur das S-Enantiomer ist pharmakologisch wirksam, das R-Enantiomer wird im Körper jedoch teilweise umgewandelt."
    ),

    // Question 8 – Organic Chemistry: Aromatic Compounds
    Question(
        categoryId = 2,
        questionText = "Welche Bedingung muss eine cyclische Verbindung nach der Hückel-Regel erfüllen, um aromatisch zu sein?",
        answerA = "Sie muss 4n π-Elektronen im Ring haben (n = 0, 1, 2, ...)",
        answerB = "Sie muss planar sein und (4n+2) delokalisierte π-Elektronen besitzen",
        answerC = "Sie muss alternierend Einfach- und Doppelbindungen mit genau sechs Atomen haben",
        answerD = "Sie muss aus ausschließlich Kohlenstoffatomen bestehen und gesättigt sein",
        correctAnswer = 1, // B
        explanation = "Die Hückel-Regel besagt: Eine planare, cyclische Verbindung mit vollständig konjugierten π-Elektronen ist aromatisch, wenn sie (4n+2) π-Elektronen enthält (n = 0,1,2,...). Benzol hat 6 π-Elektronen (n=1), Naphthalin 10 (n=2). Systeme mit 4n π-Elektronen sind antiaromatisch.",
        difficulty = 3,
        funFact = null
    ),

    // Question 9 – Organic Chemistry: Carbonyl Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist der Mechanismus einer Aldol-Kondensation?",
        answerA = "Radikalische Addition eines Alkylrestes an eine Carbonylgruppe unter UV-Bestrahlung",
        answerB = "Nucleophile Addition eines Enolat-Ions an die Carbonylgruppe einer zweiten Carbonylverbindung",
        answerC = "Elektrophile aromatische Substitution am Benzolring durch eine Carbonylgruppe",
        answerD = "Oxidation eines Aldehyds zur Carbonsäure durch nukleophilen Angriff von Wasser",
        correctAnswer = 1, // B
        explanation = "Bei der Aldol-Kondensation deprotoniert eine Base die α-Position einer Carbonylverbindung zum Enolat-Ion. Dieses greift nucleophil an die Carbonylgruppe einer zweiten Carbonylverbindung an (Aldol-Addition). Anschließende Wasserabspaltung ergibt das α,β-ungesättigte Carbonylprodukt (Kondensation).",
        difficulty = 3,
        funFact = "Die Aldol-Reaktion ist eine der wichtigsten C-C-knüpfenden Reaktionen in der Biosynthese – beispielsweise in der Glykolyse beim Schritt der Aldolase."
    ),

    // Question 10 – Organic Chemistry: Spectroscopy
    Question(
        categoryId = 2,
        questionText = "Was gibt die chemische Verschiebung δ (in ppm) im ¹H-NMR-Spektrum an?",
        answerA = "Die Intensität des Signals relativ zur Gesamtprotonenzahl",
        answerB = "Den Massenunterschied zwischen dem Proton und einem Referenzatom",
        answerC = "Die Resonanzfrequenz des Protons relativ zu TMS, normiert auf die Gerätefrequenz",
        answerD = "Die Kopplungskonstante zwischen zwei benachbarten Protonen",
        correctAnswer = 2, // C
        explanation = "Die chemische Verschiebung δ in ppm gibt an, wie weit die Resonanzfrequenz eines Protons von der eines Referenzstoffs (TMS = Tetramethylsilan, δ=0) entfernt liegt, normiert auf die Messfrequenz des Spektrometers. Elektronenziehende Gruppen entschirmen Protonen und erhöhen δ.",
        difficulty = 3,
        funFact = null
    ),

    // Question 11 – Molecular Biology: Gene Expression
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen einem Exon und einem Intron in eukaryotischen Genen?",
        answerA = "Exons codieren für tRNA, Introns für rRNA",
        answerB = "Exons sind proteinkodierender Bestandteile, die im reifen mRNA verbleiben; Introns werden herausgespleißt",
        answerC = "Introns sind regulatorische Sequenzen im Promotorbereich, Exons kodieren für Histonproteine",
        answerD = "Exons kommen nur in Prokaryoten vor, Introns nur in Eukaryoten",
        correctAnswer = 1, // B
        explanation = "Eukaryotische Gene enthalten kodierende Exon-Bereiche und nicht-kodierende Intron-Bereiche. Nach der Transkription wird die prä-mRNA im Spleißosom prozessiert: Introns werden entfernt, Exons zusammengefügt. Die reife mRNA enthält nur Exons und wird dann translatiert.",
        difficulty = 3,
        funFact = "Durch alternatives Spleißen kann ein einzelnes Gen für viele verschiedene Proteine kodieren. Der Mensch besitzt ca. 20.000 Gene, produziert aber schätzungsweise über 100.000 verschiedene Proteine."
    ),

    // Question 12 – Molecular Biology: Translation
    Question(
        categoryId = 2,
        questionText = "Welche Rolle spielt die Peptidyltransferase-Aktivität im Ribosom bei der Translation?",
        answerA = "Sie decodiert das Codon der mRNA durch Watson-Crick-Basenpaarung",
        answerB = "Sie katalysiert die Bildung der Peptidbindung zwischen der wachsenden Kette und der neuen Aminosäure",
        answerC = "Sie transloziert die mRNA um ein Codon im Ribosom weiter",
        answerD = "Sie bindet das Startsignal (Kozak-Sequenz) der mRNA am kleinen Ribosom",
        correctAnswer = 1, // B
        explanation = "Die Peptidyltransferase-Aktivität sitzt im großen Ribosom (23S-rRNA in Prokaryoten, 28S-rRNA in Eukaryoten) und ist ribozymischer Natur. Sie katalysiert die nukleophile Substitution: Die Aminogruppe der Aminoacyl-tRNA an der A-Stelle greift die Esterverbindung der Peptidyl-tRNA an der P-Stelle an.",
        difficulty = 3,
        funFact = "Die Entdeckung, dass Ribosomen katalytisch aktive RNA enthalten (Ribozyme), war bahnbrechend und wurde 2009 mit dem Nobelpreis für Chemie gewürdigt."
    ),

    // Question 13 – Molecular Biology: Post-Translational Modifications
    Question(
        categoryId = 2,
        questionText = "Welche Funktion hat die Ubiquitinierung von Proteinen?",
        answerA = "Sie aktiviert Enzyme durch Phosphorylierung an Serinresten",
        answerB = "Sie markiert Proteine für den Abbau durch das 26S-Proteasom",
        answerC = "Sie leitet Proteine zur Mitochondrienmembran durch ein Signalpeptid",
        answerD = "Sie verknüpft zwei Proteine durch Disulfidbrücken im endoplasmatischen Retikulum",
        correctAnswer = 1, // B
        explanation = "Ubiquitin ist ein hochkonserviertes 76-Aminosäuren-Protein. Die kovalente Verknüpfung von Ubiquitin-Ketten an ein Zielprotein (Polyubiquitinierung) markiert es für den proteasomalen Abbau. Das 26S-Proteasom erkennt die Markierung, entfaltet und degradiert das Protein.",
        difficulty = 3,
        funFact = null
    ),

    // Question 14 – Molecular Biology: Epigenetics
    Question(
        categoryId = 2,
        questionText = "Was bewirkt die Trimethylierung von Histon H3 an Lysin 27 (H3K27me3)?",
        answerA = "Aktivierung der Transkription durch Lockerung der Chromatinstruktur",
        answerB = "Rekrutierung von Acetylierungsenzymen an aktive Promotoren",
        answerC = "Repression der Genexpression durch Polycomb-Repressor-Komplexe und Heterochromatinbildung",
        answerD = "Initiation der DNA-Replikation an Ursprungssequenzen",
        correctAnswer = 2, // C
        explanation = "H3K27me3 ist eine repressive Histonmodifikation. Sie wird durch den Polycomb Repressive Complex 2 (PRC2) gesetzt, der die Histonmethyltransferase EZH2 enthält. H3K27me3 rekrutiert PRC1, was zur Chromatin-Kompaktierung und transkriptioneller Silenzierung führt.",
        difficulty = 3,
        funFact = "H3K27me3 ist entscheidend für die Regulation von Hox-Genen während der Entwicklung. Fehler in dieser Modifikation sind mit verschiedenen Krebsarten assoziiert."
    ),

    // Question 15 – Molecular Biology: CRISPR
    Question(
        categoryId = 2,
        questionText = "Wie schneidet Cas9 im CRISPR-Cas9-System die DNA?",
        answerA = "Es erzeugt durch seine Helikase-Domäne einen Einzelstrangbruch am PAM-Motiv",
        answerB = "Die HNH-Domäne schneidet den komplementären Strang, die RuvC-Domäne den nicht-komplementären Strang, resultierend in einem Doppelstrangbruch",
        answerC = "Es ligiert die guide-RNA an die Ziel-DNA und aktiviert zelleigene Topoisomerasen",
        answerD = "Es schneidet die DNA durch eine ATP-abhängige Konformationsänderung am CRISPR-Array",
        correctAnswer = 1, // B
        explanation = "Cas9 ist eine Nuklease mit zwei katalytischen Domänen: Die HNH-Domäne schneidet den zu sgRNA-komplementären Strang, die RuvC-Domäne den nicht-komplementären Strang. Der Schnitt erfolgt 3 bp upstream des PAM-Motivs (5'-NGG-3') und erzeugt einen stumpfen Doppelstrangbruch.",
        difficulty = 3,
        funFact = "Jennifer Doudna und Emmanuelle Charpentier erhielten 2020 den Nobelpreis für Chemie für die Entwicklung des CRISPR-Cas9-Systems als Genschere."
    ),

    // Question 16 – Astrophysics: Stellar Evolution
    Question(
        categoryId = 2,
        questionText = "Was passiert mit einem Stern mit ca. 8 Sonnenmassen am Ende seines Lebens nach dem Ende der Kernfusion?",
        answerA = "Er zieht sich zu einem weißen Zwerg zusammen und kühlt ab",
        answerB = "Er explodiert als Typ-Ia-Supernova durch Kohlenstoffdetonation",
        answerC = "Er kollabiert zum Neutronenstern oder schwarzen Loch nach einer Kern-Kollaps-Supernova",
        answerD = "Er wirft seine Hülle als Planetennebel ab und verbleibt als brauner Zwerg",
        correctAnswer = 2, // C
        explanation = "Sterne mit mehr als ca. 8 Sonnenmassen enden in einer Kern-Kollaps-Supernova (Typ II). Nach der Erschöpfung aller Fusionsreaktionen bis Eisen (endotherm) kollabiert der Kern in Millisekunden. Je nach Restmasse entsteht ein Neutronenstern (< ~3 M☉) oder ein schwarzes Loch.",
        difficulty = 3,
        funFact = null
    ),

    // Question 17 – Astrophysics: Black Holes
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Hawking-Strahlung bei schwarzen Löchern?",
        answerA = "Die Synchrotron-Strahlung, die durch Materieakkretionen in den Akkretionsscheiben erzeugt wird",
        answerB = "Thermische Strahlung durch quantenmechanische Paarbildung nahe des Ereignishorizonts, die zur langsamen Verdampfung führt",
        answerC = "Röntgenstrahlung, die bei der Materiespiegelung am Ergosphärenrand entsteht",
        answerD = "Gravitationswellenstrahlung beim Verschmelzen zweier schwarzer Löcher",
        correctAnswer = 1, // B
        explanation = "Stephen Hawking sagte 1974 vorher, dass schwarze Löcher durch Quanteneffekte Strahlung emittieren. Nahe des Ereignishorizonts entstehen virtuelle Teilchenpaare; fällt ein Teilchen ins schwarze Loch, entkommt das andere als reale Strahlung. Die Temperatur ist T ∝ 1/M – kleine schwarze Löcher verdampfen schneller.",
        difficulty = 3,
        funFact = "Für ein schwarzes Loch mit Sonnenmasse würde die Verdampfung durch Hawking-Strahlung 10⁶⁷ Jahre dauern – weit länger als das aktuelle Alter des Universums."
    ),

    // Question 18 – Astrophysics: Neutron Stars
    Question(
        categoryId = 2,
        questionText = "Was ist ein Millisekunden-Pulsar?",
        answerA = "Ein Neutronenstern der kurz nach seiner Entstehung mit sehr kurzer Periode pulsiert, bevor er abbremst",
        answerB = "Ein durch Massenakkretionen von einem Begleitstier auf Millisekunden-Perioden 'recycelter' Pulsar",
        answerC = "Ein Magnetar mit extrem starkem Magnetfeld und periodischen Röntgenausbrüchen",
        answerD = "Ein kollabierender Weiß-Zwerg kurz vor der Typ-Ia-Supernova",
        correctAnswer = 1, // B
        explanation = "Millisekunden-Pulsare sind alte Neutronensterne in Binärsystemen, die durch Massenübertragung vom Begleitstern auf sehr schnelle Rotationsperioden (1-10 ms) aufgedreht ('recycelt') wurden. Sie sind sehr stabile Rotatoren und dienen als präzise kosmische Uhren.",
        difficulty = 3,
        funFact = "Einige Millisekunden-Pulsare sind so stabil, dass sie als kosmische Uhren zur Detektion von Gravitationswellen-Hintergrundrauschen (Pulsar Timing Arrays) genutzt werden."
    ),

    // Question 19 – Astrophysics: Gravitational Waves
    Question(
        categoryId = 2,
        questionText = "Welche Eigenschaft unterscheidet Gravitationswellen grundlegend von elektromagnetischen Wellen?",
        answerA = "Gravitationswellen haben eine höhere Ausbreitungsgeschwindigkeit als Licht",
        answerB = "Gravitationswellen sind Raumzeitkrümmungen, die Materie transversal komprimieren und strecken, und wechselwirken kaum mit Materie",
        answerC = "Gravitationswellen können reflektiert und gebrochen werden wie sichtbares Licht",
        answerD = "Gravitationswellen werden durch Magnetfelder polarisiert und abgelenkt",
        correctAnswer = 1, // B
        explanation = "Gravitationswellen sind Ripple in der Raumzeitkrümmung, die sich mit Lichtgeschwindigkeit ausbreiten. Im Gegensatz zu EM-Wellen, die Energie durch Teilchen übertragen, deformieren Gravitationswellen physikalisch den Raum (Kompression und Dehnung). Sie wechselwirken extrem schwach mit Materie – daher ihre Detektionsschwierigkeit.",
        difficulty = 3,
        funFact = "LIGO detektierte 2015 erstmals Gravitationswellen. Die gemessene Raumzeitverzerrung betrug ca. 10⁻¹⁸ m – ein Tausendstel des Protonendurchmessers über eine 4 km lange Messstrecke."
    ),

    // Question 20 – Astrophysics: Dark Energy
    Question(
        categoryId = 2,
        questionText = "Was bewirkt die Dunkle Energie auf kosmologischer Skala?",
        answerA = "Sie verlangsamt die Expansion des Universums durch Gravitationsanziehung",
        answerB = "Sie beschleunigt die Expansion des Universums und wirkt wie ein negatives Druckfeld im Vakuum",
        answerC = "Sie verbindet Galaxien durch unsichtbare Gravitationsbrücken",
        answerD = "Sie erzeugt das kosmische Mikrowellen-Hintergrundrauschen durch Vakuumfluktuation",
        correctAnswer = 1, // B
        explanation = "Dunkle Energie, die ca. 68% des Energiegehalts des Universums ausmacht, bewirkt die seit 1998 beobachtete beschleunigte kosmische Expansion. Mathematisch wird sie als kosmologische Konstante Λ oder als Quintessenz modelliert. Physikalisch entspricht sie einem negativen Druck (p = -ρc²).",
        difficulty = 3,
        funFact = null
    ),

    // Question 21 – Paleontology: Geological Eras
    Question(
        categoryId = 2,
        questionText = "Was markiert die Grenze zwischen dem Mesozoikum und dem Känozoikum (K-Pg-Grenze)?",
        answerA = "Das Erscheinen erster Landpflanzen und die Devonische Fauna-Explosion",
        answerB = "Eine Iridium-Anomalie in Sedimenten, die auf einen Asteroideneinschlag vor ~66 Millionen Jahren hindeutet",
        answerC = "Die Gondwana-Aufspaltung und das Ende der Perm-Fauna",
        answerD = "Der Beginn der Eiszeiten und das erste Auftreten von Homo habilis",
        correctAnswer = 1, // B
        explanation = "Die K-Pg-Grenze (früher K-T) vor ~66 Ma ist durch eine weltweit nachweisbare Iridium-Anreicherung im Sediment charakterisiert. Iridium ist auf der Erde selten, in Asteroiden häufig. Zusammen mit dem Chicxulub-Krater belegt dies einen Asteroideneinschlag als Auslöser des Massenaussterbens.",
        difficulty = 3,
        funFact = "Das Iridium in der K-Pg-Schicht wurde 1980 von Luis Alvarez und seinem Sohn Walter entdeckt und führte zur Asteroid-Impact-Hypothese."
    ),

    // Question 22 – Paleontology: Mass Extinctions
    Question(
        categoryId = 2,
        questionText = "Welches Massenaussterben war das größte der Erdgeschichte und welche Ursache wird vorwiegend diskutiert?",
        answerA = "Kreide-Paläogen (K-Pg) – Asteroideneinschlag",
        answerB = "Perm-Trias (P-T) vor ~252 Ma – massiver Sibirischer Trapp-Vulkanismus mit CO₂-Anstieg und Ozean-Anoxie",
        answerC = "Ordovizium-Silur – Supernova-Strahlung und globale Vereisung",
        answerD = "Devon (Frasnium-Famennium) – Meeresanoxie durch Algenpopulationskollaps",
        correctAnswer = 1, // B
        explanation = "Das Perm-Trias-Aussterben vor ~252 Ma, auch 'Great Dying' genannt, war mit ~95% aller Meeresarten und ~70% aller Landarten das größte Massenaussterben der Erdgeschichte. Der sibirische Trapp-Vulkanismus setzte in kurzer Zeit enorme CO₂- und SO₂-Mengen frei, die zur Erwärmung, Ozeanversauerung und Anoxie führten.",
        difficulty = 3,
        funFact = "Nach dem Perm-Trias-Aussterben dauerte es ca. 10 Millionen Jahre, bis sich die marine Biodiversität vollständig erholt hatte."
    ),

    // Question 23 – Paleontology: Fossil Types
    Question(
        categoryId = 2,
        questionText = "Was sind Leitfossilien und welche Anforderungen müssen sie erfüllen?",
        answerA = "Fossilien, die immer in den ältesten Gesteinsschichten auftreten und eine große Körpergröße haben",
        answerB = "Artenreiche Fossiliengruppen mit langer Überlieferungsgeschichte und globaler Verbreitung",
        answerC = "Fossilien von Arten mit kurzer Existenzdauer, weiter Verbreitung und charakteristischer Morphologie zur Altersbestimmung von Gesteinsschichten",
        answerD = "Nur marine Fossilien aus kalkigem Skelettmaterial, die Korallenfazies anzeigen",
        correctAnswer = 2, // C
        explanation = "Leitfossilien müssen eine kurze geologische Reichweite (kurze Existenzzeit einer Art), eine weite geographische Verbreitung, eine charakteristische und leicht erkennbare Morphologie sowie eine hohe Häufigkeit im Fundgut besitzen. Ideale Beispiele sind Ammoniten im Mesozoikum und Graptolithen im Paläozoikum.",
        difficulty = 3,
        funFact = null
    ),

    // Question 24 – Paleontology: Evolution Milestones
    Question(
        categoryId = 2,
        questionText = "Was belegt der Fossilbefund von Tiktaalik roseae aus dem Devon?",
        answerA = "Den Übergang von Reptilien zu Säugetieren durch Veränderung des Kieferapparats",
        answerB = "Das erste Auftreten von Wirbeltieren im Kambrium",
        answerC = "Ein Übergangstier zwischen Fischen und Tetrapoden mit Flossenmorphologie aber tetrapoden-ähnlichen Gelenkstrukturen",
        answerD = "Den Ursprung der Amnioten durch Entwicklung der Fruchthülle",
        correctAnswer = 2, // C
        explanation = "Tiktaalik roseae (ca. 375 Ma) ist ein 'Übergangsform' zwischen Fischen und frühen Tetrapoden. Es besitzt Schuppen und Kiemen wie ein Fisch, aber auch Rippen, Nacken und flossen-ähnliche Gliedmaßen mit Knochen (Humerus, Ulna, Radius), die Vorläufer der tetrapoden Extremitäten sind.",
        difficulty = 3,
        funFact = "Tiktaalik wurde 2004 auf Ellesmere Island (Kanada) entdeckt. Der Fund wurde vorhergesagt, indem man nach Gesteinen des richtigen Alters und Typs in der richtigen Region suchte."
    ),

    // Question 25 – Paleontology: Dating Methods
    Question(
        categoryId = 2,
        questionText = "Warum ist die Radiokarbonmethode (¹⁴C) für Fossilien älter als ~50.000 Jahre ungeeignet?",
        answerA = "¹⁴C wird bei hohem Druck im Gestein chemisch abgebaut und ist nicht mehr messbar",
        answerB = "Nach ~50.000 Jahren sind nur noch weniger als 0,1% des ursprünglichen ¹⁴C vorhanden, unterhalb der Messgenauigkeit",
        answerC = "¹⁴C-Ionen werden durch kosmische Strahlung in älteren Sedimenten kontinuierlich neu erzeugt",
        answerD = "Die Halbwertszeit von ¹⁴C variiert mit dem Erdmagnetfeld und macht die Methode unzuverlässig",
        correctAnswer = 1, // B
        explanation = "¹⁴C hat eine Halbwertszeit von ~5.730 Jahren. Nach 8-9 Halbwertszeiten (~50.000 Jahre) sind weniger als 0,1% des ursprünglichen ¹⁴C vorhanden. Die verbleibende Aktivität liegt unterhalb der Nachweisgrenze moderner Massenspektrometer. Für ältere Proben nutzt man K-Ar, Rb-Sr oder U-Pb.",
        difficulty = 3,
        funFact = "Die Accelerator Mass Spectrometry (AMS) hat die Nachweisgrenze auf ~1% des Werts der klassischen Zählmethode gesenkt und ermöglicht Messungen an Proben von nur 1 mg Kohlenstoff."
    ),

    // Question 26 – Advanced Ecology: Population Dynamics
    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Lotka-Volterra-Modell in der Ökologie?",
        answerA = "Die Konkurrenz zweier Arten um dieselbe Ressource nach dem Wettbewerbsausschlussprinzip",
        answerB = "Die oscillierenden Populationsdynamiken zwischen Räuber und Beute mit gegenseitiger Abhängigkeit",
        answerC = "Das Populationswachstum bis zur Tragfähigkeit eines Habitats nach logistischer Kurve",
        answerD = "Die Ausbreitungsgeschwindigkeit invasiver Arten in neue Habitate",
        correctAnswer = 1, // B
        explanation = "Das Lotka-Volterra-Modell beschreibt die Wechselwirkung zwischen einer Räuber- und einer Beutepopulation durch zwei gekoppelte Differentialgleichungen. Es zeigt, dass beide Populationen in einem Phasenverzug zueinander oszillieren: Beutepopulationen wachsen bei niedrigen Räuberzahlen, hohe Beutezahlen lassen die Räuberpopulation anwachsen, was dann die Beute dezimiert.",
        difficulty = 3,
        funFact = null
    ),

    // Question 27 – Advanced Ecology: r/K Selection
    Question(
        categoryId = 2,
        questionText = "Was charakterisiert K-Strategen im Vergleich zu r-Strategen?",
        answerA = "K-Strategen produzieren viele kleine Nachkommen mit geringer elterlicher Fürsorge in instabilen Habitaten",
        answerB = "K-Strategen haben wenige Nachkommen mit hoher elterlicher Investition und sind an konstante Habitate nahe der Tragfähigkeit angepasst",
        answerC = "r-Strategen leben länger und konkurrieren intensiv um begrenztes Territorium",
        answerD = "K-Strategen sind primär r-Reproduktoren, die seasonal umschalten können",
        correctAnswer = 1, // B
        explanation = "r/K-Selektion: r-Strategen (r = intrinsische Wachstumsrate) produzieren viele Nachkommen mit wenig elterlichem Aufwand – angepasst an fluktuierende, ressourcenreiche Umgebungen (z.B. Insekten, Mäuse). K-Strategen (K = Tragfähigkeit) investieren stark in wenige Nachkommen – angepasst an stabile, ressourcenlimitierte Umgebungen (z.B. Elefanten, Wale).",
        difficulty = 3,
        funFact = "Das r/K-Konzept wurde von Robert MacArthur und E.O. Wilson 1967 im Kontext der Insel-Biogeographie entwickelt."
    ),

    // Question 28 – Advanced Ecology: Ecological Succession
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet die primäre von der sekundären Sukzession?",
        answerA = "Primäre Sukzession beginnt auf bereits besiedeltem Land nach einer Störung; sekundäre auf nacktem Substrat ohne Bodensamen",
        answerB = "Primäre Sukzession beginnt auf substratlosem Neuland ohne Bodenmatrix; sekundäre Sukzession nach Störung auf bestehendem Boden mit Samenbank",
        answerC = "Primäre Sukzession läuft schneller ab, da keine Bodenbildung nötig ist",
        answerD = "Sekundäre Sukzession findet nur in tropischen Ökosystemen statt",
        correctAnswer = 1, // B
        explanation = "Bei der primären Sukzession (z.B. nach Gletscherrückzug oder Vulkanausbruch) fehlt jede biologische Vorgeschichte – es muss zunächst Boden durch Pionierorganismen (Flechten, Moose) gebildet werden. Die sekundäre Sukzession (nach Waldbrand, Überschwemmung) startet auf bereits vorhandenem Boden mit Samenbank und ist daher viel schneller.",
        difficulty = 3,
        funFact = "Nach dem Ausbruch des Mount St. Helens 1980 wurden primäre Sukzessionsprozesse intensiv erforscht. Erste Pionierpflanzen besiedelten bereits nach 2 Jahren die erkaltete Lavaasche."
    ),

    // Question 29 – Advanced Ecology: Island Biogeography
    Question(
        categoryId = 2,
        questionText = "Was besagt die Gleichgewichtstheorie der Insel-Biogeographie nach MacArthur und Wilson?",
        answerA = "Die Artenzahl auf Inseln entspricht immer der des nächstgelegenen Festlands",
        answerB = "Die Artenzahl auf einer Insel erreicht ein dynamisches Gleichgewicht zwischen Einwanderungs- und Aussterberatene, abhängig von Inselgröße und Festlandnähe",
        answerC = "Größere Inseln verlieren schneller Arten, da sie mehr Räuber haben",
        answerD = "Nur Inseln in tropischen Breiten entwickeln stabile Artengemeinschaften",
        correctAnswer = 1, // B
        explanation = "MacArthur und Wilson (1967) postulierten, dass die Artenzahl auf Inseln ein dynamisches Gleichgewicht zwischen Immigration (höher bei Festlandnähe) und Aussterben (höher bei kleiner Insel) darstellt. Größere Inseln halten mehr Arten; nähere Inseln erhalten mehr Immigranten. Diese Theorie begründete die Naturschutzbiologie.",
        difficulty = 3,
        funFact = null
    ),

    // Question 30 – Advanced Ecology: Keystone Species
    Question(
        categoryId = 2,
        questionText = "Welches klassische Experiment von Robert Paine begründete das Konzept der Schlüsselart (keystone species)?",
        answerA = "Entfernung von Wölfen aus Yellowstone und Beobachtung trophischer Kaskaden",
        answerB = "Entfernung des Seesternes Pisaster ochraceus aus einem Gezeitenbereich, was zur Dominanz von Miesmuscheln und Artenverlust führte",
        answerC = "Entfernung von Bienenkolonien aus einem Blütenpflanzenökosystem",
        answerD = "Einführung des Nilbarsches in den Viktoriasee als Raubfischprädator",
        correctAnswer = 1, // B
        explanation = "Robert Paine entfernte in den 1960er Jahren den Seestern Pisaster ochraceus aus einem Gezeitentümpel-Ökosystem. Ohne diesen Prädator breiteten sich Miesmuscheln unkontrolliert aus und verdrängten andere Arten. Dies zeigte, dass einzelne Arten weit überproportional zur Artendiversität beitragen können.",
        difficulty = 3,
        funFact = "Der Begriff 'keystone species' wurde von Paine 1969 geprägt – in Analogie zum Schlussstein eines Gewölbes, der ohne proportionale Größe die gesamte Struktur hält."
    ),

    // Question 31 – Neuroscience: Neurotransmitters
    Question(
        categoryId = 2,
        questionText = "Welchen Mechanismus nutzen SSRIs (Selektive Serotonin-Wiederaufnahmehemmer) bei der Behandlung von Depressionen?",
        answerA = "Sie erhöhen die Serotoninproduktion in den Raphé-Kernen des Hirnstamms",
        answerB = "Sie blockieren den Serotonin-Transporter (SERT) präsynaptisch und erhöhen so die synaptische Serotoninkonzentration",
        answerC = "Sie aktivieren postsynaptische 5-HT1A-Rezeptoren direkt als Agonisten",
        answerD = "Sie hemmen den enzymatischen Abbau von Serotonin durch MAO-A",
        correctAnswer = 1, // B
        explanation = "SSRIs binden selektiv an den Serotonin-Transporter (SERT) und blockieren die Wiederaufnahme von Serotonin aus dem synaptischen Spalt in das präsynaptische Neuron. Dies erhöht die Konzentration und Verweildauer von Serotonin im synaptischen Spalt, was die serotonerge Neurotransmission verstärkt.",
        difficulty = 3,
        funFact = "Die klinische Wirkung von SSRIs tritt erst nach 2-4 Wochen auf, obwohl die Wiederaufnahmehemmung sofort einsetzt – ein Hinweis auf komplexe adaptive Rezeptorveränderungen als eigentlichen Wirkmechanismus."
    ),

    // Question 32 – Neuroscience: Action Potentials
    Question(
        categoryId = 2,
        questionText = "Was bewirkt die Refraktärzeit nach einem Aktionspotenzial in einem Axon?",
        answerA = "Eine kurze Hyperpolarisation verhindert ein sofortiges zweites Aktionspotenzial (absolute Refraktärzeit) und begrenzt die maximale Feuerrate",
        answerB = "Die Myelinscheide wird neu synthetisiert, um das nächste Potenzial zu isolieren",
        answerC = "Kalzium-Ionen strömen ein und hyperpolarisieren die Membran permanent",
        answerD = "Das Ruhemembranpotenzial wird durch erhöhte Na⁺/K⁺-ATPase-Aktivität auf +70 mV gebracht",
        correctAnswer = 0, // A
        explanation = "Nach einem Aktionspotenzial bleiben spannungsgesteuerte Na⁺-Kanäle für ca. 1 ms inaktiviert (absolute Refraktärzeit) – kein weiteres AP möglich. Danach folgt die relative Refraktärzeit durch verzögerte K⁺-Kanäle und Hyperpolarisation. Dies limitiert die Feuerfrequenz auf ca. 500-1000 Hz und stellt Einwegkommunikation im Axon sicher.",
        difficulty = 3,
        funFact = null
    ),

    // Question 33 – Neuroscience: Brain Regions
    Question(
        categoryId = 2,
        questionText = "Welche Funktion hat der Hippocampus beim menschlichen Gedächtnis?",
        answerA = "Er speichert implizite motorische Erinnerungen wie Fahrradfahren dauerhaft",
        answerB = "Er ist entscheidend für die Konsolidierung neuer deklarativer Gedächtnisinhalte vom Kurzzeit- in das Langzeitgedächtnis",
        answerC = "Er reguliert den Schlaf-Wach-Rhythmus und kontrolliert die REM-Phase",
        answerD = "Er verarbeitet emotionale Reaktionen auf Bedrohungsreize und steuert die Amygdala",
        correctAnswer = 1, // B
        explanation = "Der Hippocampus ist essentiell für die Gedächtniskonsolidierung: Er wandelt neue deklarative (explizite) Gedächtnisinhalte vom Arbeitsgedächtnis in Langzeitgedächtnis um und encodiert episodische und semantische Erinnerungen. Patient H.M., dem beide Hippocampi entfernt wurden, konnte keine neuen expliziten Erinnerungen mehr bilden.",
        difficulty = 3,
        funFact = "Taxi-Fahrer in London haben nachweislich einen größeren posterioren Hippocampus als Nicht-Taxifahrer – ein Beleg für erfahrungsabhängige hippocampale Plastizität beim räumlichen Gedächtnis."
    ),

    // Question 34 – Neuroscience: Synaptic Plasticity
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Langzeitpotenzierung (LTP) an glutamatergen Synapsen?",
        answerA = "Eine dauerhafte Verringerung der Synapseneffizienz durch anhaltende niedrigfrequente Stimulation",
        answerB = "Eine anhaltende Stärkung der synaptischen Übertragung durch starke koaktive Stimulation, vermittelt durch NMDA-Rezeptor-Aktivierung und AMPA-Rezeptor-Hochregulation",
        answerC = "Die spontane Freisetzung von Neurotransmittern ohne Aktionspotenzial",
        answerD = "Eine strukturelle Veränderung des Axonhügels durch Methylierung von Ionenkanälen",
        correctAnswer = 1, // B
        explanation = "LTP erfordert die gleichzeitige prä- und postsynaptische Aktivität (Hebbsche Synapsen). NMDA-Rezeptoren als 'Koinzidenzdetektor' werden bei ausreichender Depolarisation durch Mg²⁺-Entfernung aktiviert. Ca²⁺-Einstrom aktiviert Kinasen (CaMKII), die AMPA-Rezeptoren einbauen und phosphorylieren – die Synapse wird dauerhaft effizienter.",
        difficulty = 3,
        funFact = "LTP ist der zellulare Mechanismus des Lernens nach dem Hebbs'schen Prinzip: 'Neurons that fire together, wire together.'"
    ),

    // Question 35 – Neuroscience: Neural Networks
    Question(
        categoryId = 2,
        questionText = "Was ist das Default Mode Network (DMN) im menschlichen Gehirn?",
        answerA = "Das Netzwerk aus Hirnstamm und Kleinhirn, das Grundfunktionen wie Atmung reguliert",
        answerB = "Ein Netzwerk aus medialen Kortexregionen, das bei Ruhezustand und selbstbezogenen Prozessen aktiv ist und bei fokussierter Aufgabe deaktiviert wird",
        answerC = "Das visuelle Kortex-Netzwerk, das Standardverarbeitungsroutinen für Gesichtserkennung enthält",
        answerD = "Die Basalganglien-Schaltkreise für automatisierte Bewegungssequenzen",
        correctAnswer = 1, // B
        explanation = "Das DMN umfasst medialen präfrontalen Kortex, posterioren zingulären Kortex und angrenzendes Areal. Es ist aktiv bei Ruhe, Tagträumen, selbstbezogenen Gedanken und episodischer Zukunftsplanung. Bei fokussierter Außenaufmerksamkeit wird es supprimiert. Fehlfunktionen werden mit Depression, Schizophrenie und Alzheimer assoziiert.",
        difficulty = 3,
        funFact = null
    ),

    // Question 36 – Inorganic Chemistry: Coordination Chemistry
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Koordinationszahl in der Koordinationschemie?",
        answerA = "Die Anzahl der Valenzelektronen des Zentralatoms in einem Komplex",
        answerB = "Die Anzahl der Liganden-Donoratorenpaare, die direkt an das Zentralatom koordinieren",
        answerC = "Die Summe aller Elektronen im antibindenden Molekülorbital",
        answerD = "Den Oxidationszustand des Zentralmetalls im Komplex",
        correctAnswer = 1, // B
        explanation = "Die Koordinationszahl gibt an, wie viele Donoratorenpaare von Liganden direkt an das Zentralatom koordiniert sind. Einzähnige Liganden (Monodentate) erhöhen sie um 1, zweizähnige (Bidentate) um 2 etc. Häufige Koordinationszahlen: 4 (tetraedrisch, quadratisch-planar) und 6 (oktaedrisch).",
        difficulty = 3,
        funFact = "Hämoglobin enthält ein Eisen-Porphyrin-Komplex (Fe²⁺) mit Koordinationszahl 6: 4 Stickstoffatome des Porphyrins, 1 Histidin und 1 O₂ oder H₂O als sechster Ligand."
    ),

    // Question 37 – Inorganic Chemistry: Crystal Field Theory
    Question(
        categoryId = 2,
        questionText = "Was erklärt die Kristallfeldtheorie bei oktaedrischen Übergangsmetallkomplexen?",
        answerA = "Die kovalente Bindung zwischen Ligand und Metallatom durch überlappende Orbitale",
        answerB = "Die Aufspaltung der d-Orbitale in zwei Energieniveaus (eg und t2g) durch das elektrostatische Feld der Liganden",
        answerC = "Die paramagnetischen Eigenschaften von Komplexen durch freie Valenzelektronen",
        answerD = "Die Farbe von Komplexen durch Ladungsübertragungsbanden zwischen Metall und Ligand",
        correctAnswer = 1, // B
        explanation = "In einem oktaedrischen Feld heben die sechs Liganden die fünffache d-Entartung auf: Die d-Orbitale spalten in die zum Liganden zeigenden eg-Orbitale (höhere Energie) und die zwischen den Liganden liegenden t2g-Orbitale auf. Die Aufspaltungsenergie Δo (10Dq) bestimmt Farbe und magnetische Eigenschaften.",
        difficulty = 3,
        funFact = "Die intensive blaue Farbe von [Cu(H₂O)₆]²⁺ entsteht durch d-d-Übergänge; die tatsächliche Absorptionswellenlänge liegt bei ~800 nm (rot), komplementär erscheint Blau."
    ),

    // Question 38 – Inorganic Chemistry: Catalysis
    Question(
        categoryId = 2,
        questionText = "Wie funktioniert die heterogene Katalyse bei der Haber-Bosch-Synthese von Ammoniak?",
        answerA = "Eisen-Nanopartikel transportieren N₂ durch eine selektive Membran unter Druck",
        answerB = "N₂ und H₂ adsorbieren auf der Eisenoberfläche, dissoziieren in Atome, rekombinieren zu NH₃ und desorbieren",
        answerC = "Eisenionen in Lösung komplexieren N₂ und übertragen es enzymatisch auf Wasserstoff",
        answerD = "UV-Licht aktiviert N₂ auf der Katalysatoroberfläche zu reaktiven Nitryl-Radikalen",
        correctAnswer = 1, // B
        explanation = "Beim Haber-Bosch-Verfahren (Fe-Katalysator mit K₂O und Al₂O₃ als Promotoren, 400–500°C, 150–300 bar): N₂ und H₂ adsorbieren auf der Eisenoberfläche. N₂ dissoziiert dabei (geschwindigkeitsbestimmender Schritt), adsorbierter N reagiert schrittweise mit H zu NH, NH₂ und NH₃, das dann desorbiert.",
        difficulty = 3,
        funFact = null
    ),

    // Question 39 – Inorganic Chemistry: Redox Reactions
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen einer galvanischen Zelle und einer Elektrolysezelle?",
        answerA = "Eine galvanische Zelle verbraucht elektrische Energie für eine Redoxreaktion; die Elektrolysezelle erzeugt Energie",
        answerB = "Eine galvanische Zelle wandelt chemische in elektrische Energie um (spontane Reaktion); die Elektrolysezelle treibt eine nicht-spontane Redoxreaktion durch externe Spannung",
        answerC = "Beide Zelltypen sind identisch, nur die Bezeichnung unterscheidet sich je nach verwendeten Elektroden",
        answerD = "In der galvanischen Zelle findet nur Oxidation statt, in der Elektrolysezelle nur Reduktion",
        correctAnswer = 1, // B
        explanation = "Galvanische Zellen (z.B. Akkumulatoren beim Entladen) nutzen spontane Redoxreaktionen (ΔG < 0) zur Stromerzeugung. Elektrolysezellen erzwingen eine nicht-spontane Reaktion (ΔG > 0) durch Anlegen externer Spannung. In beiden Fällen: Oxidation an Anode, Reduktion an Kathode.",
        difficulty = 3,
        funFact = "Die Chlor-Alkali-Elektrolyse ist eine der wichtigsten industriellen Elektrolyseprozesse: 2 NaCl + 2 H₂O → Cl₂ + H₂ + 2 NaOH."
    ),

    // Question 40 – Inorganic Chemistry: Electrochemistry
    Question(
        categoryId = 2,
        questionText = "Was gibt die Standardelektrodenpotenzial (E°) einer Halbzelle an?",
        answerA = "Die Maximalspannung, die ein Elektrolyt unter Standardbedingungen erzeugen kann",
        answerB = "Das Potenzial einer Elektrode relativ zur Standardwasserstoffelektrode (E° = 0 V) unter Standardbedingungen (25°C, 1 bar, 1 mol/L)",
        answerC = "Den Strom in mA, der bei der Elektrolyse von 1 mol Wasser fließt",
        answerD = "Die Freie Enthalpie der Elektrodenreaktion bei 298 K",
        correctAnswer = 1, // B
        explanation = "Das Standardelektrodenpotenzial E° misst die Tendenz einer Halbreaktion, Elektronen aufzunehmen (Reduktion), verglichen mit der Standardwasserstoffelektrode (SHE, E° = 0 V). Aus zwei Halbzellen-E°-Werten berechnet sich die EMK einer galvanischen Zelle: E°Zelle = E°Kathode – E°Anode.",
        difficulty = 3,
        funFact = "Die elektrochemische Spannungsreihe ordnet Elemente nach ihrem Standardpotenzial. Fluorgas hat mit +2,87 V das höchste Reduktionspotenzial aller Elemente."
    ),

    // Question 41 – Fluid Dynamics: Bernoulli Principle
    Question(
        categoryId = 2,
        questionText = "Unter welchen Voraussetzungen gilt die Bernoulli-Gleichung (p + ½ρv² + ρgh = const)?",
        answerA = "Kompressible, viskose, turbulente Strömung entlang einer Stromlinie",
        answerB = "Inkompressible, reibungsfreie (ideale) stationäre Strömung entlang einer Stromlinie",
        answerC = "Nur für Gase bei Unterschallgeschwindigkeit, nicht für Flüssigkeiten",
        answerD = "Zeitabhängige Strömung mit variabler Dichte und Viskosität",
        correctAnswer = 1, // B
        explanation = "Die Bernoulli-Gleichung gilt streng nur für ideale Fluide (keine Viskosität, keine Kompressibilität) bei stationärer (zeitunabhängiger) Strömung entlang einer Stromlinie. Sie folgt aus dem Energieerhaltungssatz: Summe aus statischem Druck, dynamischem Druck und hydrostatischem Druck ist konstant.",
        difficulty = 3,
        funFact = "Der Auftrieb eines Flugzeugflügels (Tragflügelquerschnitt) lässt sich näherungsweise mit Bernoulli erklären – die oberseitig schnellere Strömung erzeugt niedrigeren Druck und damit Auftrieb."
    ),

    // Question 42 – Fluid Dynamics: Viscosity
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Newtonischen und Nicht-Newtonischen Fluiden?",
        answerA = "Newtonische Fluide fließen nur vertikal nach unten, Nicht-Newtonische in alle Richtungen",
        answerB = "Bei Newtonischen Fluiden ist die Viskosität konstant und proportional zur Scherspannung; bei Nicht-Newtonischen ändert sie sich mit der Scherrate",
        answerC = "Nicht-Newtonische Fluide sind immer Gase, Newtonische immer Flüssigkeiten",
        answerD = "Newtonische Fluide haben keine Oberflächenspannung, Nicht-Newtonische besitzen sie",
        correctAnswer = 1, // B
        explanation = "Bei Newtonischen Fluiden (Wasser, Öl) gilt: Scherspannung = Viskosität × Scherrate (linearer Zusammenhang). Nicht-Newtonische Fluide zeigen ein komplexeres Verhalten: Scherverdickende Fluide (z.B. Stärkelösung) werden mit zunehmendem Scherstress fester; scherverdünnende (z.B. Ketchup) fließen leichter.",
        difficulty = 3,
        funFact = null
    ),

    // Question 43 – Fluid Dynamics: Turbulence
    Question(
        categoryId = 2,
        questionText = "Was ist das Kolmogorov-Längenmaß in der Turbulenztheorie?",
        answerA = "Die Wellenlänge der dominierenden großen Wirbelstrukturen in einem turbulenten Fluid",
        answerB = "Die kleinste Längenskala im Energiespektrum, bei der viskose Dissipation die kinetische Energie aufzehrt",
        answerC = "Der mittlere Abstand zwischen zwei Partikeln in einer turbulenten Suspension",
        answerD = "Die kritische Reynoldszahl, ab der eine laminare Strömung in Turbulenz übergeht",
        correctAnswer = 1, // B
        explanation = "Das Kolmogorov-Längenmaß η = (ν³/ε)^(1/4) (ν: kinematische Viskosität, ε: Dissipationsrate) beschreibt die kleinsten Wirbelstrukturen, bei denen Trägheitskräfte und viskose Kräfte gleichwertig sind. Unterhalb von η wird turbulente kinetische Energie in Wärme umgewandelt. Es bildet den Abschluss der Energiekaskade.",
        difficulty = 3,
        funFact = "Turbulenzen gelten als eines der letzten ungelösten Probleme der klassischen Physik. Die Navier-Stokes-Gleichungen für turbulente Strömungen sind eines der sieben Milleniumsprobleme der Mathematik."
    ),

    // Question 44 – Fluid Dynamics: Reynolds Number
    Question(
        categoryId = 2,
        questionText = "Was gibt die Reynolds-Zahl Re = ρvL/μ physikalisch an?",
        answerA = "Das Verhältnis von Oberflächenspannungskräften zu Gravitationskräften in einer Flüssigkeit",
        answerB = "Das Verhältnis von Trägheitskräften zu viskosen Kräften und bestimmt den Übergang von laminarer zu turbulenter Strömung",
        answerC = "Die dimensionslose Strömungsgeschwindigkeit relativ zur Schallgeschwindigkeit",
        answerD = "Das Verhältnis von Druckkräften zu kinetischer Energie in einer kompressiblen Strömung",
        correctAnswer = 1, // B
        explanation = "Re = ρvL/μ (ρ: Dichte, v: Geschwindigkeit, L: charakteristische Länge, μ: dynamische Viskosität) ist das Verhältnis von Trägheitskräften zu viskosen Kräften. Für Re < ~2300 in Rohren ist die Strömung laminar, für Re > ~4000 turbulent. Dies ist eine der grundlegenden dimensionslosen Kenngrößen der Strömungsmechanik.",
        difficulty = 3,
        funFact = "Bakterien bewegen sich bei Re ~ 10⁻⁵ – für sie dominieren völlig viskose Kräfte, Trägheit spielt keine Rolle. Sie 'schwimmen' in einem Medium, das ihnen wie Honig vorkommt."
    ),

    // Question 45 – Fluid Dynamics: Surface Tension
    Question(
        categoryId = 2,
        questionText = "Welcher physikalische Effekt bewirkt, dass ein Wasserläufer auf der Wasseroberfläche gehen kann?",
        answerA = "Auftrieb durch das verdrängte Wasservolumen gemäß dem Archimedes-Prinzip",
        answerB = "Oberflächenspannung, die durch intermolekulare Wasserstoffbrücken an der Grenzfläche entsteht und eine elastische 'Haut' bildet",
        answerC = "Hydrophobe Wechselwirkung der wasserabweisenden Beinhaare, die eine Luftschicht einschließen",
        answerD = "Kapillarkräfte, die den Wasserläufer an der Oberfläche halten",
        correctAnswer = 1, // B
        explanation = "Oberflächenspannung entsteht, weil Moleküle an der Wasseroberfläche weniger Nachbarn haben als im Inneren – die resultierenden unkompensierten Kohäsionskräfte erzeugen eine energie-minimierte Grenzfläche. Wasser hat mit ~72 mN/m eine sehr hohe Oberflächenspannung (Wasserstoffbrücken). Der Wasserläufer krümmt die Oberfläche, ohne sie zu durchdringen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 46 – Immunology: Adaptive Immune System
    Question(
        categoryId = 2,
        questionText = "Was ist klonale Selektion in der adaptiven Immunantwort?",
        answerA = "Die zufällige Aktivierung aller B-Zellen durch ein Antigen",
        answerB = "Die selektive Proliferation und Differenzierung der wenigen Lymphozyten, deren Rezeptoren spezifisch das Antigen erkennen",
        answerC = "Die Hemmung des Immunsystems durch regulatorische T-Zellen bei Selbst-Antigenen",
        answerD = "Die Reifung von B-Zellen im Knochenmark durch Positiv- und Negativselektion",
        correctAnswer = 1, // B
        explanation = "Klonale Selektion: Jeder Lymphozyt trägt einen einzigartigen Rezeptor (VDJ-Rekombination). Bindet ein Antigen an den passenden Rezeptor, proliferiert diese Zelle klonal (viele identische Kopien). Diese Klone differenzieren zu Effektorzellen und Gedächtniszellen – nur die antigenspezifischen Klone werden aktiviert.",
        difficulty = 3,
        funFact = "Das Immunsystem kann theoretisch > 10¹⁸ verschiedene Antikörper erzeugen – durch kombinatorische V(D)J-Rekombination und somatische Hypermutation."
    ),

    // Question 47 – Immunology: T-Cells
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet MHC-Klasse-I- von MHC-Klasse-II-Molekülen bei der T-Zell-Aktivierung?",
        answerA = "MHC I präsentiert intrazelluläre Peptide an CD8⁺ zytotoxische T-Zellen; MHC II präsentiert extrazelluläre Peptide an CD4⁺ Helfer-T-Zellen",
        answerB = "MHC I kommt nur auf B-Zellen vor; MHC II nur auf Makrophagen",
        answerC = "MHC I präsentiert Lipidantigene; MHC II präsentiert Proteinantigene",
        answerD = "MHC I aktiviert die humorale Immunantwort; MHC II die zelluläre",
        correctAnswer = 0, // A
        explanation = "MHC-I-Moleküle (auf allen kernhaltigen Zellen) präsentieren intrazellulär prozessierte Peptide (z.B. Viren, Tumor-Antigene) an CD8⁺ zytotoxische T-Zellen, die die Zelle töten können. MHC-II-Moleküle (auf professionellen Antigenpräsentierenden Zellen) präsentieren extrazelluläre Antigene an CD4⁺ Helfer-T-Zellen, die die Immunantwort koordinieren.",
        difficulty = 3,
        funFact = null
    ),

    // Question 48 – Immunology: B-Cells and Antibodies
    Question(
        categoryId = 2,
        questionText = "Was ist somatische Hypermutation und welche Funktion hat sie bei der Antikörperreifung?",
        answerA = "Die Fusion von B-Zellen mit Tumorzellen zur Produktion monoklonaler Antikörper in vitro",
        answerB = "Erhöhte Mutationsrate in den Antigenbindungsregionen der B-Zell-Rezeptoren nach Antigen-Kontakt, die hochaffine Antikörpervarianten durch Selektion erzeugt",
        answerC = "Chromosomenumlagerungen (VDJ-Rekombination) im Knochenmark zur Erzeugung des Antikörperrepertoires",
        answerD = "Die Klassenswitchung von IgM zu IgG durch Cre-Rekombinase im Keimzentrum",
        correctAnswer = 1, // B
        explanation = "Somatische Hypermutation findet in Keimzentren der Lymphknoten statt: Aktivierungs-induzierte Cytidindeaminase (AID) erzeugt gezielte Mutationen in den variablen Regionen (CDRs) der B-Zell-Rezeptorgene. Mutanten mit höherer Affinität zum Antigen werden positiv selektiert (Affinitätsreifung) – die Antikörperaffinität steigt über die Immunreaktion progressiv.",
        difficulty = 3,
        funFact = "Die Affinitätsmaturierung kann die Antikörperaffinität um den Faktor 1000-10.000 gegenüber dem ursprünglichen naiven B-Zell-Rezeptor steigern."
    ),

    // Question 49 – Immunology: Autoimmune Diseases
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus erklärt die Entstehung von Typ-1-Diabetes als Autoimmunerkrankung?",
        answerA = "Antikörper gegen Insulin blockieren die Insulinrezeptoren auf Muskelzellen",
        answerB = "Autoreaktive CD8⁺ T-Zellen zerstören insulinproduzierte β-Zellen des Pankreas durch Erkennung von Selbst-Antigenen auf MHC-I",
        answerC = "Regulatorische T-Zellen werden durch Virusinfektionen aktiviert und hemmen die Insulinsekretion",
        answerD = "Antikörper gegen Glutamat-Decarboxylase (GAD65) lösen durch Komplementaktivierung Pankreatitis aus",
        correctAnswer = 1, // B
        explanation = "Bei Typ-1-Diabetes (T1D) umgehen autoreaktive T-Zellen (spezifisch für β-Zell-Antigene wie Insulin, GAD65) die zentrale Toleranz. CD8⁺ T-Zellen erkennen Selbst-Peptide auf MHC-I der β-Zellen und töten sie durch Apoptose-Induktion (Perforin/Granzym). Genetische Faktoren (HLA-DR3/DR4) und Umweltauslöser spielen eine Rolle.",
        difficulty = 3,
        funFact = "Eineiige Zwillinge haben nur eine ~50% Übereinstimmung bei Typ-1-Diabetes – ein Beweis für bedeutende nicht-genetische (Umwelt-)Faktoren bei der Auslösung."
    ),

    // Question 50 – Immunology: Antibody Structure
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen dem Fab- und dem Fc-Fragment eines IgG-Antikörpers?",
        answerA = "Fab enthält die Antigenbindungsstellen (variable Regionen); Fc interagiert mit Rezeptoren auf Immunzellen und Komplementproteinen",
        answerB = "Fab ist die schwere Kette; Fc ist die leichte Kette des Antikörpers",
        answerC = "Fab vermittelt die Klassenswitchung; Fc aktiviert die somatische Hypermutation",
        answerD = "Fab enthält die Disulfidbrücken; Fc die N-glykosylierten Zucker",
        correctAnswer = 0, // A
        explanation = "IgG-Antikörper können durch Papain in zwei Fab-Fragmente (Fragment antigen-binding: je 1 leichte + 1 halbe schwere Kette mit variabler Antigenbindungsregion) und ein Fc-Fragment (Fragment crystallizable: die zwei Fc-Regionen der schweren Ketten) gespalten werden. Fc bindet an Fc-Rezeptoren (FcγR) auf Makrophagen, NK-Zellen und Mastzellen sowie an Komplementfaktor C1q.",
        difficulty = 3,
        funFact = "Das Fc-Fragment ist für die Benennung von IgG-Subklassen (IgG1-4) maßgeblich – sie unterscheiden sich in ihrer Fc-Region und damit in der Effektor-Funktion."
    )
)
