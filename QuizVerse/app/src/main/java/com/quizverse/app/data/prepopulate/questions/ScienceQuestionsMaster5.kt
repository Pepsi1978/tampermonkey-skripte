package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsMaster5(): List<Question> = listOf(

    // ── MASTER 5 (difficulty = 5) ── 50 questions ────────────────────────────

    // ── BLOCK 1: Quantum Thermodynamics ──────────────────────────────────────

    // Question 1 – Landauer's Principle
    Question(
        categoryId = 2,
        questionText = "Landauers Prinzip verbindet Informationstheorie und Thermodynamik. Welche Energiemenge muss mindestens dissipiert werden, wenn ein Bit Information irreversibel gelöscht wird, und welche physikalische Begründung liegt dem zugrunde?",
        answerA = "E = hν pro Bit, da jede Information durch ein Photon der Frequenz ν kodiert wird und beim Löschen vollständig in Strahlung übergeht",
        answerB = "E = k_B T ln(2) pro Bit, da das Löschen eines Bits eine logisch irreversible Operation ist, die den Phasenraumvolumen des Computers reduziert und nach Liouville thermodynamische Entropieproduktion von mindestens k_B ln(2) pro Bit erzwingt",
        answerC = "E = k_B T pro Bit, da jedes Bit einem harmonischen Oszillator mit mittlerer thermischer Energie ½k_BT entspricht und beim Löschen diese Energie vollständig in Wärme umgewandelt wird",
        answerD = "Es gibt keine thermodynamische Untergrenze für den Löschvorgang, da reversibles Computing prinzipiell kein Bit in endlicher Zeit löschen kann und Landauers Argument nur für klassische Systeme gilt",
        correctAnswer = 1, // B
        explanation = "Landauer (1961) zeigte: Eine logisch irreversible Operation wie das Löschen eines Bits muss mindestens k_B T ln(2) ≈ 2,85 × 10⁻²¹ J bei Raumtemperatur dissipieren. Der Grund: Löschen bedeutet, zwei Zustände (0 und 1) auf einen (0) abzubilden. Dies reduziert das Phasenraumvolumen um Faktor 2, und nach dem zweiten Hauptsatz muss entsprechend Entropie ΔS ≥ k_B ln(2) an die Umgebung abgegeben werden. Dies hat tiefgreifende Implikationen: Reversibles Computing (Bennet, 1973) kann das Landauer-Limit umgehen, indem Berechnungen rückgängig gemacht werden, bevor Bits gelöscht werden.",
        difficulty = 5,
        funFact = "Erst 2012 gelang Bérut et al. (Nature) der erste direkte experimentelle Nachweis des Landauer-Limits durch eine kolloidale Teilchenpartikeln in einem zeitabhängigen Doppelmuldenpotenzial — fast 50 Jahre nach Landauers Vorhersage."
    ),

    // Question 2 – Maxwell's Demon
    Question(
        categoryId = 2,
        questionText = "Maxwells Dämon schien den zweiten Hauptsatz zu verletzen, indem er schnelle und langsame Moleküle trennt. Welche Auflösung des Widerspruchs ist heute als korrekt anerkannt, und welche Rolle spielt dabei Szilards Analyse?",
        answerA = "Der Dämon verletzt tatsächlich den zweiten Hauptsatz lokal, aber ein globaler Beobachter auf kosmologischer Skala stellt fest, dass die Gesamtentropie des Universums konstant bleibt, da die Energieerhaltung für die exakte Kompensation sorgt",
        answerB = "Der Dämon muss Information über die Teilchenpositionen speichern; nach Bennet (1982) erfolgt die Entropieproduktion nicht bei der Messung, sondern beim Löschen der gespeicherten Information im Dämongedächtnis — in Übereinstimmung mit Landauers Prinzip",
        answerC = "Der Dämon scheitert, weil jede Messung eines Teilchengeschwindigkeit nach Heisenbergs Unschärfeprinzip zwingend Energie überträgt, die größer ist als die gewonnene thermische Energie; die Quantenfluktuationen untergraben die klassische Analyse vollständig",
        answerD = "Szilard zeigte 1929, dass die Entropieproduktion bei der Messung des Teilchenzustands exakt k_B ln(2) pro Bit beträgt und damit den zweiten Hauptsatz rettet; Bennet widerlegte später diesen Ansatz durch reversible Quantenmessungen",
        correctAnswer = 1, // B
        explanation = "Szilard (1929) formalisierte den Dämon als Einzel-Molekül-Motor und erkannte, dass Information physikalische Relevanz hat. Lange glaubte man, die Messung selbst produziere Entropie. Bennet (1982) korrigierte dies: Messungen können prinzipiell reversibel durchgeführt werden. Der springende Punkt ist das Löschen des Gedächtnisses am Ende eines Zyklus — dieser logisch irreversible Schritt erzeugt nach Landauer mindestens k_B ln(2) Entropie pro Bit und rettet den zweiten Hauptsatz. Experimentell bestätigt durch Toyabe et al. (2010): Ein informationsgetriebener Motor zog Partikel bergauf, und das Löschen des Speichers produzierte nachweislich Wärme.",
        difficulty = 5,
        funFact = null
    ),

    // Question 3 – Quantum Heat Engines
    Question(
        categoryId = 2,
        questionText = "Ein Quantenwärmemotor (z.B. ein Zwei-Niveau-Atom zwischen zwei Wärmebädern) kann unter bestimmten Umständen den Carnot-Wirkungsgrad überschreiten, wenn Quantenkohärenz ausgenutzt wird. Welches Konzept ermöglicht dies, und welche thermodynamischen Grenzen gelten dennoch?",
        answerA = "Quantenmotoren können den Carnot-Wirkungsgrad durch Bose-Einstein-Kondensation des Arbeitsmediums überschreiten; die Grenze ist der absolute Nullpunkt, da bei T→0 alle Quantenzustände besetzt sind und keine Arbeit mehr geleistet werden kann",
        answerB = "Durch Quantenkohärenz im Arbeitsmedium (z.B. phasenkohärente Überlagerungen in einem Drei-Niveau-Laser-Atom) kann die effektive Temperatur des heißen Bades erhöht werden, ohne physische Wärme zuzuführen; der Wirkungsgrad kann η_Carnot überschreiten, aber der zweite Hauptsatz bleibt gültig, da die kohärente Arbeit bei der Präparation bereits eingerechnet werden muss",
        answerC = "Quantum-Motoren unterliegen nicht dem zweiten Hauptsatz, da Schrödinger-Gleichung vollständig reversibel ist; thermodynamische Grenzen entstehen erst durch Dekohärenz durch die Umgebung, die dann den Carnot-Wirkungsgrad wiederherstellt",
        answerD = "Der Carnot-Wirkungsgrad kann durch Quantenmotoren nie überschritten werden; Quantenkohärenz erhöht nur die Leistungsdichte, nicht den Wirkungsgrad, und die Thermodynamischen Hauptsätze gelten unverändert für alle quantenmechanischen Systeme",
        correctAnswer = 1, // B
        explanation = "Scully et al. (2003, Science) zeigten, dass ein Drei-Niveau-Quantenlaser-Atom durch Quantenkohärenz (Dunkle Zustände) eine effektive Temperatur des heißen Bades über T_H hinaus erzeugen kann. Der Wirkungsgrad kann η_Carnot überschreiten — aber nur wenn die Kosten der Kohärenzpräparation berücksichtigt werden. Bei vollständiger thermodynamischer Bilanz bleibt der zweite Hauptsatz erhalten. Dieses Konzept wird als 'Quantum Coherence Enhancement' bezeichnet. Thermodynamische Unsicherheitsrelationen (TUR) von Barato und Seifert (2015) setzen fundamentale Grenzen: Je kleiner die Entropieproduktion, desto größer die relativen Fluktuationen der Leistung.",
        difficulty = 5,
        funFact = "Der erste experimentelle Quantenwärmemotor wurde 2019 von Peterson et al. mit einem einzelnen Spin-½ Teilchen in einem NMR-Experiment realisiert — kleiner geht es nicht."
    ),

    // Question 4 – Thermodynamic Uncertainty Relations
    Question(
        categoryId = 2,
        questionText = "Die thermodynamische Unsicherheitsrelation (TUR) von Barato und Seifert (2015) verbindet Entropieproduktion und Strömungsfluktuationen in stationären Markov-Prozessen. Welche Aussage beschreibt die TUR korrekt?",
        answerA = "Für jeden stationären Strom J in einem offenen System gilt: Var(J)/⟨J⟩² ≥ 2k_B/⟨σ⟩, wobei ⟨σ⟩ die mittlere Entropieproduktionsrate ist; je kleiner die Entropieproduktion, desto größer die relativen Schwankungen des Stroms",
        answerB = "Die TUR besagt: ⟨J⟩ × Var(J) ≥ ℏ/2, was einer quantenmechanischen Unschärferelation entspricht und zeigt, dass Ströme und ihre Schwankungen komplementäre Observablen sind",
        answerC = "Die TUR limitiert die Präzision biochemischer Uhren: Eine Uhr mit N ATP-hydrolyse-Zyklen pro Periode kann die Zeit mit relativer Genauigkeit von höchstens 1/√N messen, unabhängig von der dissipierten Energie",
        answerD = "Die TUR gilt nur für klassische Systeme und wird durch Quantenkohärenz aufgehoben; in Quantensystemen können Ströme beliebig präzise bei beliebig kleiner Entropieproduktion fließen, da Kohärenz die Fluktuationen unterdrückt",
        correctAnswer = 0, // A
        explanation = "Die TUR von Barato und Seifert lautet: (Var(J_T)/⟨J_T⟩²) ≥ 2/⟨Σ_T⟩ in dimensionslosen Einheiten (k_B = 1), wobei Var(J_T) die Varianz des zeitintegrierten Stroms über Zeit T und ⟨Σ_T⟩ die mittlere Entropieproduktion ist. Dies bedeutet: Je weniger Entropie produziert wird (nahe Gleichgewicht), desto lauter rauscht der Strom relativ zu seinem Mittelwert. Biologische Motoren (wie ATP-Synthase) operieren in einem optimalen Bereich — nicht zu weit vom Gleichgewicht (zu viel Dissipation) und nicht zu nah (zu viel Rauschen). Die TUR hat Anwendungen in der Biophysik biochemischer Uhren und in der Analyse von Ionenkanälen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 5 – Quantum Refrigerators and Absorption Refrigerators
    Question(
        categoryId = 2,
        questionText = "Ein Quantenabsorptionskühler besteht aus drei quantenmechanischen Qubits, die an drei verschiedene Wärmebäder bei T_c < T_r < T_h gekoppelt sind, ohne externe Arbeitszufuhr. Unter welcher Bedingung funktioniert dieser Kühler, und was bestimmt seine Effizienz?",
        answerA = "Der Kühler funktioniert, wenn T_h/T_r > T_r/T_c; die Effizienz (COP) ist durch den Carnot-Wert COP_c = T_c/(T_r - T_c) nach oben begrenzt, und der Wärmestrom wird durch virtuelle Temperatur-Resonanzbedingung zwischen den drei Qubits ermöglicht",
        answerB = "Der Kühler benötigt mindestens ein kohärentes Kopplungsglied zwischen dem kalten und dem heißen Qubit; ohne Quantenverschränkung kann kein Wärmestrom aus dem kalten Bad entnommen werden, und die Effizienz ist durch die Shannon-Entropie des Qubits begrenzt",
        answerC = "Der Kühler funktioniert ausschließlich bei T_h → ∞ (unendlich heißes Reservoir); die Effizienz ist dann durch ηmax = 1 - T_c/T_r bestimmt, unabhängig von Quanteneffekten im Arbeitsmedium",
        answerD = "Quantenabsorptionskühler verstoßen gegen den dritten Hauptsatz, da sie eine endliche Wärmepumprate bei T_c → 0 K aufrechterhalten können; ihre Existenz wurde experimentell bis heute nicht nachgewiesen",
        correctAnswer = 0, // A
        explanation = "Linden et al. (2010, PRL) analysierten einen Drei-Qubit-Absorptionskühler: System r (Raumtemperatur-Qubit) vermittelt die Interaktion zwischen dem kalten Qubit c und dem heißen Qubit h über eine drei-Qubit-Kopplung H = g(|100⟩⟨011| + h.c.). Die Energie-Resonanzbedingung ω_h = ω_c + ω_r erzeugt einen Wärmestrom aus dem kalten Bad ohne externe Arbeit. Der Kühler funktioniert wenn T_h groß genug ist, dass das heiße Bad mehr Energie liefern kann als nötig. Der maximale COP ist der Carnot-COP: COP_Carnot = T_c/(T_r - T_c). Bemerkenswert: selbst ein einzelnes Qubit pro Bad reicht aus — das kleinste mögliche quantenmechanische Kühlaggregat.",
        difficulty = 5,
        funFact = "Das Konzept des Quantenabsorptionskühlers wurde von Linden, Popescu und Skrzypczyk 2010 als theoretisches Gedankenexperiment eingeführt. Der Wirkungsgrad ist derselbe wie ein klassischer Absorptionskühler — der Quantencharakter zeigt sich in der minimalen Systemgröße."
    ),

    // ── BLOCK 2: Single-Cell Biology ─────────────────────────────────────────

    // Question 6 – CITE-seq
    Question(
        categoryId = 2,
        questionText = "CITE-seq (Cellular Indexing of Transcriptomes and Epitopes by Sequencing) ermöglicht simultane Messung von Transkriptom und Proteom auf Einzelzellebene. Welches molekulare Prinzip ermöglicht die gleichzeitige Erfassung beider Modalitäten?",
        answerA = "CITE-seq nutzt FRET zwischen fluoreszenten Antikörpern und mRNA-Fluoreszenz-Hybridisierungssonden; beide Signale werden durch Konfokalmikroskopie gleichzeitig auf Einzelzellniveau erfasst und durch Bildanalyse dekonvolviert",
        answerB = "CITE-seq koppelt Antikörper an DNA-Oligo-Strichcodes (Antibody-Derived Tags, ADTs); diese ADTs werden gemeinsam mit der mRNA in Einzelzel-Droplets eingefangen und nach reverser Transkription gemeinsam sequenziert — die Barcode-Sequenz identifiziert das Protein, die cDNA das Transkriptom",
        answerC = "CITE-seq verwendet massenspektrometrische Isotopen-Antikörper (CyTOF-Prinzip) kombiniert mit in-situ-RNA-Amplifikation; Transkriptom und Proteom werden durch zwei sequenzielle Einzelzell-Extraktionsschritte aus derselben Zelle gewonnen",
        answerD = "CITE-seq basiert auf proximity ligation: Antikörper-DNA-Paare, die in räumlicher Nähe zueinander sind, werden durch Ligase verbunden und co-sequenziert mit der mRNA, wobei die räumliche Nähe als Proximitätssignal für Protein-mRNA-Korrelation dient",
        correctAnswer = 1, // B
        explanation = "CITE-seq (Stoeckius et al., 2017, Nature Methods) nutzt Antikörper, die kovalent mit kurzen DNA-Oligos (ADTs — Antibody-Derived Tags) konjugiert sind. Diese ADTs besitzen einen Poly-A-Schwanz, der im 10x Genomics- oder ähnlichem Droplet-System zusammen mit der zellulären mRNA an Oligo-dT-Kügelchen hybridisiert wird. Nach Einzelzell-Barcoding und reverser Transkription liegen cDNA-Bibliotheken vor, die sowohl mRNA-abgeleitete Transkripte als auch ADT-Sequenzen enthalten. Beim Sequenzieren kann man dann für jede Zelle (identifiziert durch Zell-Barcode) sowohl den Proteinspiegel (aus ADT-Counts) als auch das Transkriptom (aus mRNA-Counts) ablesen. CITE-seq ist essenziell für die Charakterisierung von Immunzell-Subpopulationen.",
        difficulty = 5,
        funFact = "CITE-seq wurde von Stoeckius et al. 2017 als Erweiterung von Drop-seq entwickelt. Heute ermöglichen CITE-seq-Varianten die simultane Messung von über 200 Proteinen und dem gesamten Transkriptom in Tausenden von Zellen gleichzeitig."
    ),

    // Question 7 – Droplet Microfluidics for Single-Cell Analysis
    Question(
        categoryId = 2,
        questionText = "In der Tröpfchen-Mikrofluidik für Einzelzell-Genomik (z.B. Drop-seq, 10x Chromium) werden Zellen in Nanoliter-Tröpfchen mit Barcode-Kügelchen eingeschlossen. Welches statistische Problem entsteht beim Beladen, und wie wird es gelöst?",
        answerA = "Da Zellen und Kügelchen nach Poisson-Statistik auf Tröpfchen verteilt werden, treten Mehrfach-Beladungen (Doublets) auf; diese werden computationell mit Tools wie DoubletFinder durch Simulation synthetischer Doublets und anschließendem k-nearest-neighbor-Klassifikator detektiert und aus der Analyse ausgeschlossen",
        answerB = "Das Problem heißt 'barcode collision': Verschiedene Zellen können zufällig den gleichen Barcode erhalten; dies wird durch einen Reed-Solomon-Fehlerkorrekturcode auf den Barcode-Sequenzen gelöst, der Kollisionen mit >99,9% Wahrscheinlichkeit erkennt",
        answerC = "Poisson-Statistik erzeugt überwiegend leere Tröpfchen und zu wenige Tröpfchen mit genau einer Zelle; die Lösung ist ein aktives DEP-Sorting (Dielektrophorese) der Tröpfchen nach der Bildung, das leere Tröpfchen in Echtzeit aussortiert",
        answerD = "Das zentrale Problem ist RNA-Diffusion zwischen Tröpfchen durch die Öl-Wasser-Grenzfläche; wasserunlösliche RNA-Schutzpolymere werden dem Puffer zugesetzt, die RNA sofort nach Zellyse komplexieren und so eine Kontamination zwischen benachbarten Tröpfchen verhindern",
        correctAnswer = 0, // A
        explanation = "Bei der Tröpfchen-Bildung folgen sowohl Zellen als auch Barcode-Kügelchen einer Poisson-Verteilung. Um Doublets (zwei Zellen in einem Tröpfchen) zu minimieren, wird die Zell-Konzentration so gewählt, dass im Mittel nur ~0,1 Zellen pro Tröpfchen eingeschlossen werden — die meisten Tröpfchen sind leer, nur ~10% enthalten genau eine Zelle, und <1% enthalten zwei. Verbleibende Doublets werden bioinformatisch mit Tools wie DoubletFinder (McGinnis et al., 2019) oder Scrublet identifiziert: Man simuliert synthetische Doublets durch paarweise Addition echter Zell-Profile, trainiert einen Klassifikator und identifiziert reale Zellen mit ungewöhnlich 'gemischten' Profilen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 8 – Lineage Tracing
    Question(
        categoryId = 2,
        questionText = "Modernes genomisches Lineage-Tracing nutzt CRISPR-induzierte Mutationen als natürliche Zellabstammungs-Barcodes. Welches Prinzip liegt dem GESTALT/scScarTrace-Ansatz zugrunde?",
        answerA = "CRISPR-Cas9 wird genutzt, um in einem einzigen Ziel-Lokus sequentielle, irreversible Indel-Mutationen einzuführen; da jede Zellteilung die Chance einer neuen Mutation bietet, entsteht ein Stammbaum aus dem Muster akkumulierter Mutationen über alle Tochterzellen, der mit single-cell RNA-seq kombiniert wird",
        answerB = "Fluoreszente Protein-Barcodes werden zufällig in das Genom integriert; Tochter-Zellen erben dieselbe Farbkombination, sodass Klone durch Fluoreszenzmikroskopie über mehrere Generationen verfolgt werden können, ohne das Transkriptom zu stören",
        answerC = "Retrovirale Barcodes werden in hämatopoetische Stammzellen eingebracht; der Barcode wird über Methylierungsmuster vererbt und durch Bisulfit-Sequenzierung in Einzelzellen ausgelesen, wobei Methylierungsveränderungen den Zellalter kodieren",
        answerD = "Transposon-Mobilisierung durch piggyBac-Transposase erzeugt zufällige genomische Insertionen als Barcode; die Insertionsstellen werden durch tagmentation-basierte Sequenzierung kartiert und mit dem Transkriptom derselben Zelle verknüpft",
        correctAnswer = 0, // A
        explanation = "McKenna et al. (2016, Science) entwickelten GESTALT (Genome Editing of Synthetic Target Arrays for Lineage Tracing): Ein Array von CRISPR-Zielsequenzen wird ins Zebrafisch-Genom integriert. Cas9 erzeugt stochastische Indel-Mutationen an diesen Stellen während der Embryonalentwicklung. Jede Zelle trägt ein spezifisches Muster dieser akkumulierten Mutationen, das als zellulärer Barcode dient. Da Schwesternzellen denselben Barcode teilen und unterschiedliche Abstammungslinien verschiedene Mutationsmuster aufweisen, kann aus dem Mutationsmuster ein Stammbaum rekonstruiert werden. Kombiniert mit scRNA-seq erhält man gleichzeitig Abstammungsinformation und Zellidentität (Transkriptionszustand).",
        difficulty = 5,
        funFact = "GESTALT wurde erstmals im gesamten Zebrafischembryo eingesetzt und konnte die Abstammung aller Zellen aus einer einzigen befruchteten Zelle rekonstruieren — ein ganzer Organismus als Stammbaum."
    ),

    // Question 9 – Spatial Proteomics
    Question(
        categoryId = 2,
        questionText = "CODEX (CO-Detection by indEXing) und ähnliche zyklische Immunfluoreszenz-Methoden ermöglichen simultane Messung von 40–60 Proteinen mit räumlicher Auflösung. Welches chemische Prinzip ermöglicht die Multiplexierung über die spektrale Kapazität von Fluorophoren hinaus?",
        answerA = "Antikörper werden mit DNA-Oligos gekoppelt; in jedem Imaging-Zyklus hybridisieren fluoreszente Reporter-Oligos an spezifische Antikörper-Oligos; nach der Bildaufnahme werden die Fluorophore durch Photobleaching inaktiviert und im nächsten Zyklus neue Reporter hybridisiert — so werden sequenziell alle 40–60 Zielproteine abgebildet",
        answerB = "CODEX verwendet 40 verschiedene fluoreszente Quantum Dots mit diskreten Emissionsspektren zwischen 400 und 900 nm; spektrale Entmischungsalgorithmen (Spectral Unmixing) trennen die überlappenden Emissionen und erlauben simultane Detektion aller Targets in einem einzigen Bildaufnahmeschritt",
        answerC = "Isotopen-markierte Antikörper werden durch Sekundärantikörper detektiert, die unterschiedlich viele Goldnanopartikel tragen; die Goldpartikelanzahl (1–40 Partikel) wird durch Transmissions-Elektronenmikroskopie ausgezählt und gibt das jeweilige Protein an",
        answerD = "CODEX nutzt STORM-artige stochastische optische Rekonstruktionsmikroskopie mit blinkendem Fluorophoren; die Blink-Frequenz jedes Fluorophors ist Antikörper-spezifisch kodiert und wird durch Zeitkorrelations-Spektroskopie ausgelesen",
        correctAnswer = 0, // A
        explanation = "CODEX (Goltsev et al., 2018, Cell) und sein Vorgänger CyCIF nutzen das Prinzip der zyklischen Immunfluoreszenz: Antikörper sind mit kurzen DNA-Oligos konjugiert, die als Brücke zu fluoreszenten Reporter-Oligos dienen. In Runde 1 werden z.B. Antikörper gegen 3–4 Proteine mit passenden Reportern inkubiert, Bilder aufgenommen, dann die Fluorophore durch UV-Belichtung oder chemische Behandlung deaktiviert/abgelöst. In Runde 2 kommen neue Reporter für 3–4 weitere Proteine. Nach 15–20 Zyklen sind 40–60+ Proteine kartiert. Alle Zyklusbilder werden computergestützt übereinander registriert. CODEX ist transformativ für Tumorimmunologie: Es kann den vollständigen Immunzell-Kontext in Gewebeschnitten abbilden.",
        difficulty = 5,
        funFact = null
    ),

    // Question 10 – Clonal Dynamics
    Question(
        categoryId = 2,
        questionText = "In der klonalen Hämatopoese (CHIP — Clonal Hematopoiesis of Indeterminate Potential) expandieren Zellen mit somatischen Mutationen in DNMT3A, TET2 oder ASXL1. Welcher Mechanismus erklärt die Klondynamik, und warum erhöht CHIP das kardiovaskuläre Risiko?",
        answerA = "CHIP-Mutationen deaktivieren Tumorsuppressorgene im Knochenmark; die klonale Expansion führt durch Aktivierung des mTOR-Signalwegs zu Überproduktion von Erythrozyten, die durch erhöhte Blutviskosität kardiovaskuläre Ereignisse auslösen",
        answerB = "Mutationen in epigenetischen Regulatoren wie DNMT3A/TET2 geben hämatopoetischen Stammzellen einen Proliferations- oder Überlebensvorteil durch veränderte epigenetische Programmierung; CHIP-Monozyten/Makrophagen zeigen veränderte Entzündungsantworten (NLRP3-Inflammasom-Aktivierung, IL-1β-Sekretion) die Atherosklerose und Herzinsuffizienz fördern",
        answerC = "CHIP-Klone entstehen durch Telomerkrise im Knochenmark und expandieren, weil sie p53 durch alternative Splicing-Isoformen umgehen; das kardiovaskuläre Risiko entsteht durch Thrombozytopenie, die zu Mikro-Thrombenbildung in Koronararterien führt",
        answerD = "DNMT3A-Mutationen aktivieren das JAK2-V617F-Signalnetz und führen zur Myeloproliferation; das Herzrisiko entsteht durch erhöhten Hämatokrit (>60%) der aus der JAK2-Aktivierung folgt und die Scherviskosität des Blutes erhöht",
        correctAnswer = 1, // B
        explanation = "CHIP betrifft >10% der Menschen über 70 Jahren. Mutationen in DNMT3A (DNA-Methyltransferase), TET2 (Demethylase) oder ASXL1 (Chromatin-Remodeler) verändern die Chromatinlandschaft hämatopoetischer Stammzellen und verleihen ihnen einen Fitness-Vorteil — wahrscheinlich durch verminderte Apoptose oder veränderte Differenzierung. Jaeik et al. (2017, NEJM) und Fuster et al. (2017, Science) zeigten: TET2-defiziente Makrophagen aktivieren verstärkt das NLRP3-Inflammasom und sezernieren mehr IL-1β und IL-6. In Atherosklerose-Mausmodellen beschleunigten TET2-KO-Knochenmarktransplantate dramatisch die Plaquebildung. IL-1β-Hemmung (Canakinumab) reduziert kardiovaskuläre Ereignisse stärker bei Patienten mit hohen IL-6-Spiegeln — möglicherweise teilweise durch CHIP-getriebene Inflammation.",
        difficulty = 5,
        funFact = "CHIP-Träger haben ein 40–100% erhöhtes Herzinfarkt- und Schlaganfall-Risiko — unabhängig von klassischen Risikofaktoren. Das ist mehr Risiko als Bluthochdruck allein verleiht."
    ),

    // ── BLOCK 3: Advanced String Theory ──────────────────────────────────────

    // Question 11 – M-Theory
    Question(
        categoryId = 2,
        questionText = "M-Theorie wurde 1995 von Edward Witten als vereinigende Beschreibung der fünf konsistenten superstringtheoretischen Formulierungen in 10 Dimensionen vorgeschlagen. Was ist M-Theorie, und in welcher Dimension existiert sie?",
        answerA = "M-Theorie ist eine 11-dimensionale Theorie ohne Strings; ihre fundamentalen Objekte sind ausschließlich 2-Branes (M2-Branes) und 5-Branes (M5-Branes); alle fünf Stringtheorien entstehen als Kompaktifizierungen auf verschiedene 1-dimensionale Mannigfaltigkeiten (Kreise oder Intervalle)",
        answerB = "M-Theorie ist eine 12-dimensionale F-Theorie-Erweiterung mit zwei Zeitdimensionen; sie unificiert Typ-I, Typ-IIA, Typ-IIB, SO(32)-Heterotisch und E₈×E₈-Heterotisch durch ein gemeinsames Dualitätsnetz und reduziert sich bei schwacher Kopplung auf gewöhnliche 10D-Stringtheorie",
        answerC = "M-Theorie ist eine nicht-perturbative 11-dimensionale Theorie, deren Grundobjekte M2- und M5-Branes sind; die fünf 10D-Stringtheorien entstehen als verschiedene Grenzfälle bei Kompaktifizierung auf S¹ (→IIA) oder S¹/Z₂ (→E₈×E₈ het.), und bei starker Kopplung der Typ-IIA-Stringtheorie wächst eine 11. Dimension auf",
        answerD = "M-Theorie ersetzt Strings durch punktförmige Preons, die durch eine 11-dimensionale supersymmetrische Yang-Mills-Theorie beschrieben werden; die Buchstabe 'M' steht für 'Matrix' (nach der BFSS-Matrix-Theorie, die M-Theorie im Lichtkegelrahmen beschreibt)",
        correctAnswer = 2, // C
        explanation = "Witten zeigte 1995 in seinem bahnbrechenden Aufsatz 'String Theory Dynamics in Various Dimensions', dass alle fünf konsistenten Stringtheorien (Typ I, Typ IIA, Typ IIB, SO(32)-Heterotisch, E₈×E₈-Heterotisch) als verschiedene Grenzfälle einer einzigen 11-dimensionalen Theorie — M-Theorie — aufgefasst werden können. Bei starker Kopplung der Typ-IIA-Stringtheorie wächst eine neue 11. Raumdimension auf, deren Radius R₁₁ = g_s l_s (g_s = String-Kopplung, l_s = String-Länge) ist. Kompaktifizierung auf S¹ ergibt Typ IIA, auf S¹/Z₂ (Horava-Witten-Konstruktion) E₈×E₈-Heterotisch. Die fundamentalen Objekte sind M2-Branes und M5-Branes.",
        difficulty = 5,
        funFact = "'M' in M-Theorie steht laut Witten offiziell für 'Magic, Mystery, or Membrane' — er ließ die Interpretation bewusst offen, da eine vollständige Definition der Theorie bis heute fehlt."
    ),

    // Question 12 – Calabi-Yau Compactification
    Question(
        categoryId = 2,
        questionText = "Calabi-Yau-Mannigfaltigkeiten sind die bevorzugten Kompaktifizierungsräume in der Stringtheorie, wenn 4D N=1-Supersymmetrie erhalten werden soll. Welche mathematische Eigenschaft der Calabi-Yau-Mannigfaltigkeit garantiert dies?",
        answerA = "Calabi-Yau-Mannigfaltigkeiten sind komplex-dreidimensionale (reell-sechsdimensionale) Kähler-Mannigfaltigkeiten mit verschwindender erster Chern-Klasse c₁ = 0; dies ist äquivalent zur Existenz einer Ricci-flachen Kähler-Metrik (Yaus Theorem), die genau SU(3)-Holonomie garantiert und so eine supersymmetrische Kovariante-Konstante Spinorenfeld erlaubt",
        answerB = "Calabi-Yau-Mannigfaltigkeiten haben verschwindende Euler-Charakteristik χ = 0; dies garantiert N=1 SUSY in 4D, weil χ direkt der Anzahl der supersymmetrischen Generatoren in der effektiven Feldtheorie proportional ist",
        answerC = "Calabi-Yau-Mannigfaltigkeiten sind quaternionisch-Kähler mit SU(2)-Holonomie; die SU(2)-Struktur auf dem Tangentialbündel erlaubt genau zwei kovariante konstante Spinoren, was N=2 SUSY in 4D erzeugt, die durch Orbifolding auf N=1 reduziert wird",
        answerD = "Calabi-Yau-Mannigfaltigkeiten haben eine triviale kanonische Klasse und verschwindende Hodge-Zahlen h^{0,1} = h^{0,2} = 0; diese topologischen Bedingungen stellen sicher, dass keine massiven Gravitinos aus dem Kompaktifizierungsraum in 4D auftauchen",
        correctAnswer = 0, // A
        explanation = "Die Euler-Yau-Calabi-Theorie: Calabi vermutete 1954, Yau bewies 1977 (Fields-Medaille), dass jede kompakte Kähler-Mannigfaltigkeit mit c₁ = 0 eine eindeutige Ricci-flache Kähler-Metrik besitzt. Ricci-Flachheit bedeutet SU(3)-Holonomie (statt der generischen U(3)-Holonomie für Kähler-Mannigfaltigkeiten). SU(3)-Holonomie garantiert, dass genau ein globaler kovarianter konstanter Spinor existiert (die Fundamentaldarstellung von SU(3) enthält genau eine invariante Spinorkomponente). Dieser Spinor ist der Goldstino der gebrochenen SUSY in den kompakten Dimensionen und korrespondiert zu N=1 SUSY in 4D. Die Hodge-Zahlen (h^{1,1}, h^{2,1}) bestimmen die Zahl der Kähler- und komplexen-Struktur-Moduli.",
        difficulty = 5,
        funFact = null
    ),

    // Question 13 – T-Duality
    Question(
        categoryId = 2,
        questionText = "T-Dualität verbindet Stringtheorien auf Kompaktifizierungsräumen verschiedener Größe. Was ist T-Dualität präzise, und was ist der physikalische Ursprung der Dualitätsrelation R ↔ α'/R?",
        answerA = "T-Dualität ist eine perturbative Symmetrie der Stringtheorie auf S¹ mit Radius R; die Dualitätstransformation R → α'/R tauscht Impuls-Moden (n, Quantenzahl entlang S¹) gegen Winding-Moden (w, Anzahl der Umwicklungen des Strings um S¹) aus — beide tragen zum Massenspektrum bei: M² = (n/R)² + (wR/α')² + (Oszillationen)",
        answerB = "T-Dualität entsteht durch eine spontane Symmetriebrechung der T-Dualitätsgruppe O(d,d); sie ist nicht-perturbativ und verbindet Typ-I mit Typ-II Stringtheorie durch Inversion der String-Kopplung g_s → 1/g_s bei gleichzeitiger Radiusinversion",
        answerC = "T-Dualität ist eine Konsequenz der modularen Invarianz der Stringtheorie-Weltflächentheorie; die SL(2,Z)-Modulgruppe der Torus-Kompaktifizierung enthält als Untergruppe die T-Dualitätsgruppe, die R→1/R als Dedeking-η-Funktions-Transformation realisiert",
        answerD = "T-Dualität ist nur für Heterotische Strings exakt; für Typ-II-Strings ist die entsprechende Symmetrie durch S-Dualität (g_s → 1/g_s) ersetzt, während T-Dualität für Typ-II nur im Grenzfall α'→0 als näherungsweise Symmetrie gilt",
        correctAnswer = 0, // A
        explanation = "Ein String um einen Kreis der Radius R kann nicht-triviale Topologie haben: Er kann n-mal entlang des Kreises Impuls tragen (Kaluza-Klein-Moden) und w-mal um den Kreis wickeln (Winding-Moden). Die Masse² eines solchen Zustands ist M² = (n/R)² + (wR/α')² + N_L + N_R - 2 (in geeigneten Einheiten). Unter R → α'/R und Vertauschen n ↔ w ist das Spektrum invariant — das ist T-Dualität. Sie tauscht Typ-IIA ↔ Typ-IIB und die zwei Heterotischen Stringtheorien ineinander um. T-Dualität impliziert, dass Abstände unterhalb der Stringlänge l_s = √α' keine physikalische Bedeutung haben — es gibt eine minimale Länge in der Stringtheorie.",
        difficulty = 5,
        funFact = "T-Dualität impliziert, dass der Radius R = 0 und R = ∞ in der Stringtheorie physikalisch äquivalent sind. Es gibt keine Singularität bei kleinem Radius — Strings 'sehen' Geometrie anders als Punktteilchen."
    ),

    // Question 14 – Landscape Problem
    Question(
        categoryId = 2,
        questionText = "Das Landschaftsproblem der Stringtheorie (String Landscape) bezieht sich auf die enorme Anzahl konsistenter Vakua. Welche Schätzung für die Anzahl der Vakua gilt als kanonisch, und welche konzeptionelle Konsequenz zieht Susskind daraus?",
        answerA = "Die Stringlandschaft hat ~10^{500} konsistente Vakua, die durch verschiedene Fluss-Kompaktifizierungen entstehen; Susskind argumentiert, dass dies eine Erklärung für den kleinen beobachteten Wert der kosmologischen Konstante durch anthropisches Selektion im Rahmen eines Multiversums liefert (anthropisches Prinzip)",
        answerB = "Die Stringlandschaft hat ~10^{100} (Googol) konsistente Vakua aus den möglichen Calabi-Yau-Topologien; Susskind argumentiert, dass das Feintuning-Problem der kosmologischen Konstante durch ewige Inflation gelöst wird, da alle Vakua physikalisch realisiert werden",
        answerC = "Die Zahl der Stringvakua ist exakt berechenbar als 2^{h^{1,1}+h^{2,1}} für die bevorzugte Calabi-Yau-Mannigfaltigkeit; Weinberg nutzte diese Zahl um 1987 vorherzusagen, dass die kosmologische Konstante positiv und klein sein muss, was 1998 durch Supernovae-Beobachtungen bestätigt wurde",
        answerD = "Das Landschaftsproblem ergibt sich aus den ~10^{1000} möglichen D-Brane-Konfigurationen auf Calabi-Yau-Mannigfaltigkeiten; KKLT (Kachru-Kallosh-Linde-Trivedi) zeigte, dass alle diese Vakua Anti-de-Sitter-Geometrie haben und durch D3-Brane-Stapelung zu de-Sitter-Vakua angehoben werden können",
        correctAnswer = 0, // A
        explanation = "KKLT (Kachru, Kallosh, Linde, Trivedi, 2003) und die Arbeit von Bousso und Polchinski zeigten, dass Fluss-Kompaktifizierungen (Quantisierung von Hintergrundfeldern entlang der kompakten Zyklen) zu ~10^{500} metastabilen Vakua führen, von denen jedes unterschiedliche Werte der Naturkonstanten (Kopplungen, Massen, kosmologische Konstante) aufweist. Susskind (2003) und Linde argumentierten: In einem ewig inflationären Multiversum werden alle diese Vakua realisiert. Anthropisches Selektion erklärt, warum wir in einem Vakuum mit kleiner, positiver kosmologischer Konstante beobachten — nur dort kann Galaxienbildung und Leben entstehen (Weinbergs Argument von 1987). Dies ist kontrovers: Es könnte die prädiktive Kraft der Stringtheorie fundamental einschränken.",
        difficulty = 5,
        funFact = null
    ),

    // Question 15 – Brane Worlds
    Question(
        categoryId = 2,
        questionText = "Im Randall-Sundrum-Modell (RS1) wird die Hierarchieproblem durch eine fünfdimensionale Anti-de-Sitter-Geometrie zwischen zwei 3-Branes gelöst. Wie genau funktioniert dieser Warping-Mechanismus?",
        answerA = "In RS1 wächst der Warpfaktor e^{-kπr_c} exponentiell von der 'Planck-Brane' zur 'TeV-Brane'; eine Massenskala M auf der Planck-Brane erscheint auf der TeV-Brane als m = Me^{-kπr_c}; für kr_c ≈ 12 ergibt sich eine Hierarchie von M_Pl/M_EW ≈ 10^{15} ohne Feintuning der Moduli",
        answerB = "RS1 löst das Hierarchieproblem durch dimensionale Transmutation: Die 5D-Planck-Masse ist identisch mit der 4D-Planck-Masse, aber das Higgs-Boson ist auf der IR-Brane lokalisiert, wo die Kaluza-Klein-Gravitonmassen exponentiell kleiner erscheinen als auf der UV-Brane",
        answerC = "Im Randall-Sundrum-Modell existiert nur eine Brane (RS2); Gravitation ist auf der Brane durch eine gebundene masslose Graviton-Mode lokalisiert, während Materie auf der Brane lebt; das Hierarchieproblem entfällt, weil es nur eine fundamentale Massenskala gibt",
        answerD = "RS1 nutzt supersymmetrische Brane-Spannungen, die das Vakuumenergiedichte der Branes kompensieren; die negative kosmologische Konstante im Bulk sorgt für eine exponentielle Unterdrückung der Quantenkorrekturen zur Higgs-Masse und macht Supersymmetrie auf der TeV-Brane unnötig",
        correctAnswer = 0, // A
        explanation = "Randall und Sundrum (1999, PRL) lösten das Hierarchieproblem durch eine fünfdimensionale AdS-Geometrie (Anti-de-Sitter) zwischen zwei Branes im Abstand r_c mit dem Metrik-Ansatz ds² = e^{-2k|y|}η_{μν}dx^μdx^ν + dy². Der Warpfaktor e^{-2ky} modifiziert exponentiell alle Massenskalen. Physikalische Massen auf der IR-Brane (TeV-Brane) sind um e^{-kπr_c} gegenüber der fundamentalen Planck-Masse reduziert. Für kr_c ≈ 11-12 ergibt sich M_Pl/M_TeV ≈ e^{kπr_c} ≈ 10^{15} — genau die beobachtete Hierarchie, ohne Feintuning. Ein charakteristisches Signal sind Kaluza-Klein-Gravitonen bei ~TeV-Energien am LHC.",
        difficulty = 5,
        funFact = "Das Randall-Sundrum-Modell ist eines der wenigen über die Standard-Stringtheorie hinausgehenden Brane-Modelle, das direkte LHC-Vorhersagen macht: KK-Gravitonen sollten bei ~1–3 TeV auftauchen. Bis dato kein Fund — aber die Suche läuft."
    ),

    // ── BLOCK 4: Tribology ────────────────────────────────────────────────────

    // Question 16 – Superlubricity
    Question(
        categoryId = 2,
        questionText = "Strukturelle Supergleitfähigkeit (structural superlubricity) tritt auf, wenn zwei kristalline Oberflächen in inkommensurabler Orientierung übereinandergleiten. Welcher atomistische Mechanismus erklärt den (nahezu) verschwindenden Reibungskoeffizienten?",
        answerA = "Bei inkommensuraten Grenzflächen interferieren die atomaren Haftkräfte der beiden Gitter destruktiv: Für jeden Atom der einen Oberfläche, der in eine Mulde des Gegengitters fällt, fällt ein Nachbar auf einen Sattel — die Nettolateralkraft mittelt sich zu null, und kein Peierlspotenzial baut sich auf",
        answerB = "Supergleitfähigkeit entsteht durch Bildung einer amorphen Zwischenschicht aus abgeriebenen Atomen, die als Festkörperschmierung fungiert; die amorphe Schicht hat keine Fernordnung und damit keine Haftpotenzial-Barrieren für das Gleiten",
        answerC = "Inkommensurabilität bewirkt, dass die Debye-Temperatur der Grenzfläche drastisch erhöht wird; bei Raumtemperatur befinden sich dadurch alle Phononenmoden des Kontakts im Grundzustand, was Phononstreuung und damit Reibung verhindert",
        answerD = "Supergleitfähigkeit ist ein rein quantenmechanischer Effekt durch Tunneln der gesamten Kontaktfläche durch das Haftpotenzial; klassische Modelle wie das Tomlinson-Modell sagen Reibung vorher, aber Quanten-Korrekturen heben diese bei verschwindenden Temperaturen auf",
        correctAnswer = 0, // A
        explanation = "Das Aubry-Modell und seine Erweiterungen erklären strukturelle Supergleitfähigkeit: Bei kommensurablen Gittern (rational-kommensurates Verhältnis der Gitterkonstanten) passen Atome des einen Gitters periodiisch in die Potenzialminima des anderen — es entsteht ein Peierlspotenzial, das überwunden werden muss. Bei inkommensurablen Gittern (irrationales Verhältnis) sind die Atome gleichmäßig über alle Phasen der Potenziallandschaft verteilt; die Kräfte mitteln sich zu null (Aubry-Übergang). Hirano und Shinjo (1991) beobachteten experimentell nahezu null Reibung zwischen inkommensurablen Glimmeroberflächen. Dienste et al. (2012) demonstrierten Supergleitfähigkeit von Graphit-Flocken auf Graphit in inkommensurabler Orientierung mit μ < 10⁻⁴.",
        difficulty = 5,
        funFact = "Graphen auf hexagonalem Bornitrid zeigt Supergleitfähigkeit bei Raumtemperatur bei inkommensurabler Verdrehung. Bei genau 0° oder 30° Verdrehung (kommensurate Winkel) springt die Reibung um Faktoren von 100–1000 an."
    ),

    // Question 17 – Nanoscale Friction and AFM
    Question(
        categoryId = 2,
        questionText = "Das Tomlinson-Modell (1928) beschreibt atomare Reibung in der Reibungskraftmikroskopie (FFM). Was sagt das Modell vorher, und wann gilt der Übergang von Stick-Slip zu kontinuierlichem Gleiten?",
        answerA = "Das Tomlinson-Modell beschreibt eine Spitze in einem sinusförmigen Potential, die durch eine Feder gezogen wird; Stick-Slip entsteht wenn η = 4π²E*/ka² > 1 (η = Tomlinson-Parameter, E* = Korrektur-Potential, k = Federkonstante, a = Gitterkonstante); für η < 1 gleitet die Spitze kontinuierlich, für η > 1 gibt es diskrete Sprünge mit Energiedissipation",
        answerB = "Das Tomlinson-Modell ist ein Zwei-Massen-Feder-System; Stick-Slip entsteht wenn die Resonanzfrequenz der Spitze kleiner ist als die Anregungsfrequenz der Oberfläche; bei hohen Gleitgeschwindigkeiten kommt es immer zu kontinuierlichem Gleiten durch hydrodynamische Dämpfung",
        answerC = "Das Tomlinson-Modell sagt vorher, dass Reibungskraft linear mit Normalkraft steigt (Amontons' Gesetz); der Stick-Slip-Übergang tritt bei kritischer Temperatur T_c = E*/k_B auf, unterhalb derer thermisches Aktivieren den Stick-Slip-Übergang nicht überbrücken kann",
        answerD = "Im Tomlinson-Modell ist die Reibungskraft proportional zur Gleitgeschwindigkeit v nach dem Stokes-Gesetz; Stick-Slip-Oszillationen entstehen bei bestimmten Resonanz-Verhältnissen zwischen Spitzenfrequenz und Scangeschwindigkeit und verschwinden bei inkommensurablen Verhältnissen",
        correctAnswer = 0, // A
        explanation = "Das Tomlinson-Modell (auch Prandtl-Tomlinson-Modell) behandelt eine Spitze, die durch eine Feder der Steifigkeit k über eine Oberfläche mit sinusförmigem Potenzial U = E*/2 × (1-cos(2πx/a)) gezogen wird. Der dimensionslose Tomlinson-Parameter η = 2π²E*/(k_eff a²) entscheidet über das Regime: η > 1 → Stick-Slip (die Gleichgewichtslage ist bistabil, die Spitze springt abrupt von einem Minimum zum nächsten, dissipiert Energie durch jeden Sprung). η < 1 → kontinuierliches Gleiten (nur ein stabiles Gleichgewicht, keine Dissipation im T=0-Limit). Bei endlicher Temperatur gibt es thermisch aktivierten Slip auch für η < 1 mit logarithmischer Geschwindigkeitsabhängigkeit der Reibung — beobachtet in präzisen AFM-Experimenten.",
        difficulty = 5,
        funFact = null
    ),

    // Question 18 – Wear Mechanisms
    Question(
        categoryId = 2,
        questionText = "Archard's Verschleißgesetz beschreibt makroskopischen Verschleiß durch Asperitenkontakt. Welches atomistische Modell erklärt den Übergang von Adhäsionsverschleiß zu abrasivem Verschleiß, und welche Rolle spielt die kritische Kontaktgröße?",
        answerA = "Archard's Gesetz W = K·F·s/H (W = Verschleißvolumen, K = dimensionsloser Verschleißkoeffizient, F = Normalkraft, s = Gleitweg, H = Härte) gilt für makroskopische Kontakte; auf Nanoskala zeigen MD-Simulationen, dass unter einer kritischen Kontaktgröße d_c ~ b(α_frictional/E*)^{0.5} (b = Burgers-Vektor) kein Versetzungsgleiten möglich ist und Kontakte quasi-elastisch ohne permanente Verformung gleiten können",
        answerB = "Archard's Gesetz gilt nur für abrasiven Verschleiß; Adhäsionsverschleiß folgt dem Rabinowicz-Modell, bei dem die kritische Energie für Partikelablösung durch die Grenzflächenenergie γ_WA bestimmt wird; die kritische Kontaktgröße ist d_c = 60000 γ_WA/H²",
        answerC = "Adhäsionsverschleiß tritt auf wenn der Kontaktdruck σ > H/3 übersteigt; abrasiver Verschleiß erfordert σ > H; der Übergang wird durch die Meyer-Härte H_M beschrieben, die die kritische Grenzfläche markiert, an der plastische Instabilität in Materialausbruch übergeht",
        answerD = "Verschleiß auf Nanoskala folgt ausschließlich thermischen Aktivierungsmechanismen nach Arrhenius; sowohl Adhäsions- als auch abrasiver Verschleiß haben dieselbe Aktivierungsenergie E_a = G_c × a³ (G_c = kritische Energiefreisetzungsrate, a = Atomdurchmesser) und unterscheiden sich nur in der Versuchsfrequenz",
        correctAnswer = 0, // A
        explanation = "Archard (1953) zeigte makroskopisch: Verschleißvolumen ∝ F·s/H. Auf Nanoskala offenbaren MD-Simulationen (Pastewka & Robbins, 2014, Science) einen qualitativen Unterschied: Unter einer kritischen Kontaktgröße d_c können Asperitenkontakte quasi-elastisch gleiten ohne plastische Verformung, weil das Versetzungsvolumen größer als der Kontakt ist — keine Versetzungsquelle kann aktiviert werden. Dies erklärt, warum nano-strukturierte Oberflächen (z.B. DLC-Beschichtungen mit nm-Kornstruktur) deutlich weniger Verschleiß zeigen als Vorhersagen makroskopischer Modelle. Der Übergang Adhäsion → Abrasion hängt von der Härte der abrasiven Partikel relativ zur Oberfläche ab: Abrasiv wenn H_Partikel > 1.2 H_Oberfläche.",
        difficulty = 5,
        funFact = "Diamantähnlicher Kohlenstoff (DLC) zeigt unter bestimmten Bedingungen gleichzeitig Supergleitfähigkeit und extremen Verschleißwiderstand — die Traum-Kombination der Tribologie. H/DLC-Beschichtungen (hydrogeniertes DLC) erreichen Reibungskoeffizienten von 0,001 unter Vakuum."
    ),

    // Question 19 – Biotribology: Synovial Joint
    Question(
        categoryId = 2,
        questionText = "Das menschliche Synovialgelenk (z.B. Hüfte) erreicht Reibungskoeffizienten von μ ≈ 0,001–0,01 — besser als jedes synthetische Tribosystem. Welche hierarchische Schmierungsstrategie erklärt diese außergewöhnliche Leistung?",
        answerA = "Synovialgelenke nutzen ausschließlich hydrodynamische Schmierung (elasto-hydrodynamisches Regime): Der Gelenkknorpel ist unter Lasteinwirkung vollständig vom viskosen Synovialfluid getrennt; Lubricin (PRG4) erhöht die Viskosität des Fluids auf 10⁴ × Wasser und verhindert jede Festkörper-Festkörper-Berührung",
        answerB = "Synovialgelenke nutzen ein Mehrskalen-Schmierungsregime: Im makroskopischen Kontakt weicher Knorpel-Elastohydrodynamik, auf der Mikro-Skala Boosted Lubrication durch Hyaluronsäure-Aggregatdepots, und auf der molekularen Skala Boundary Lubrication durch Lubricin (PRG4)-Anbindung an Aggrecan-Oberflächen; alle drei Mechanismen greifen je nach Belastung und Geschwindigkeit ineinander",
        answerC = "Das Geheimnis liegt in der poroelastischen Struktur des Knorpels: Unter Last wird interstitielle Flüssigkeit herausgepresst, die eine Druckwasserfläche zwischen den Gelenk-Oberflächen bildet; diese selbst-regulierende Fluidpumpe erzeugt einen Hydrodynamikfilm, der dicker ist als die Oberflächen-Rauheit",
        answerD = "Synovialgelenke verwenden Festkörperschmierung durch Hydroxyapatit-Nanopartikel im Gelenkknorpel; diese Nanopartikel werden unter Last aus der Knorpeloberfläche freigesetzt, bilden einen Tribofilm und reduzieren die Reibung durch Wälzkörpermechanismus",
        correctAnswer = 1, // B
        explanation = "Synoviale Schmierung ist ein Meisterwerk evolutionärer Tribologie. Das Mehrskalen-Regime (Ateshian, 2009; Seror et al., 2015): (1) Makroskopisch: Weicher Knorpel (E ~ 1 MPa) verformt sich elasto-hydrodynamisch, der Kontaktfilm wird durch Knorpel-Elastizität und Synovialfluid-Viskosität getragen. (2) Mesoskopisch: Boosted Lubrication — Hyaluronsäure-Proteoglykan-Aggregate werden unter Druck in Lakunen konzentriert und sorgen für Fluidreservoirs. (3) Molekular: Lubricin (PRG4, Proteoglykan 4) mit seinem Mucin-artigen zentralen Bereich bindet an Aggrecan auf Knorpeloberflächen und wirkt als molekulare Bürste, die Festkörperkontakte verhindert. Beim Ende-Stadium Osteoarthritis fehlt Lubricin — der Reibungskoeffizient steigt auf μ ≈ 0,3.",
        difficulty = 5,
        funFact = null
    ),

    // Question 20 – Contact Mechanics: JKR vs DMT
    Question(
        categoryId = 2,
        questionText = "JKR- (Johnson-Kendall-Roberts) und DMT- (Derjaguin-Muller-Toporov) Theorie beschreiben adhäsiven Kontakt zwischen elastischen Kugeln unterschiedlich. Durch welchen dimensionslosen Parameter wird bestimmt, welches Modell gilt, und was ist der physikalische Unterschied?",
        answerA = "Der Tabor-Parameter μ_T = (Rγ²/E*²z₀³)^{1/3} entscheidet: μ_T >> 1 → JKR-Regime (weiche, große, adhäsive Kontakte; Adhäsion wirkt nur im Kontaktbereich, bildet einen Hals beim Abziehen), μ_T << 1 → DMT-Regime (harte, kleine, schwach adhäsive Kontakte; Adhäsion wirkt außerhalb des Kontakts, kein Hals beim Abziehen)",
        answerB = "Der Hamaker-Parameter A/(6πz₀²Rγ) bestimmt das Regime: Für A >> 6πz₀²Rγ gilt JKR (van-der-Waals-Domination), für A << 6πz₀²Rγ gilt DMT (Kontaktdeformations-Domination); der Unterschied liegt in der relativen Stärke der van-der-Waals-Kräfte zur elastischen Rückstellkraft",
        answerC = "JKR und DMT sind alternative Grenzfälle desselben MD&P-Modells (Maugis-Dugdale-Pollock); die Wahl hängt vom Radius R der Spitze ab: R > 100 nm → JKR, R < 10 nm → DMT; für mittlere Radien gilt das vollständige Maugis-Dugdale-Modell mit einem Dugdale-Zonenparameter",
        answerD = "Der Unterschied ist rein geometrisch: JKR gilt für Kugel-Kugel-Kontakt, DMT für Kugel-Ebene-Kontakt; der Tabor-Parameter beschreibt den Formfaktor und hat keinen physikalischen Bezug zur Materialsteifigkeit oder Adhäsionsenergie",
        correctAnswer = 0, // A
        explanation = "Der Tabor-Parameter (Tabor, 1977) μ_T = (Rγ²/E*²z₀³)^{1/3} ist das zentrale Kriterium: R = reduzierter Radius, γ = Adhäsionsenergie, E* = reduzierter Elastizitätsmodul, z₀ = Gleichgewichtsabstand. JKR (μ_T >> 1): Das elastische System ist nachgiebig genug, um erhebliche Deformationen durch Adhäsionskräfte zuzulassen. Energie-Balance zwischen Oberflächenenergie und elastischer Verzerrungsenergie. Beim Abziehen bildet sich ein Hals (neck), und der Kontakt bricht instabil ab bei Kraft F_pulloff = -3/2 πRγ. DMT (μ_T << 1): Harte Materialien, kleine Radien — der Kontakt deformiert sich kaum. Adhäsionskräfte wirken aus der van-der-Waals-Region außerhalb des Hertz-Kontakts. Keine Halsbildung, F_pulloff = -2πRγ. Das Maugis-Dugdale-Modell interpoliert zwischen beiden Grenzfällen.",
        difficulty = 5,
        funFact = "Geckos nutzen das JKR-Regime: Ihre Setae-Nanostrukturen (~200 nm Radius) haben μ_T ≈ 1-10 — optimal für reversible Adhäsion. Inspiration für synthetische Gecko-Klebstoffe."
    ),

    // ── BLOCK 5: Advanced Atmospheric Chemistry ───────────────────────────────

    // Question 21 – HOx Cycle
    Question(
        categoryId = 2,
        questionText = "Der HOx-Katalysezyklus (OH, HO₂) ist der dominante Mechanismus für den oxidativen Abbau von Spurengasen in der Troposphäre. Welche Reaktionssequenz beschreibt den vollständigen Zyklus, und welche Reaktion reguliert das OH/HO₂-Verhältnis?",
        answerA = "OH initiiert die Oxidation (OH + CO → CO₂ + H; H + O₂ → HO₂); HO₂ regeneriert OH durch NO-Reaktion: HO₂ + NO → OH + NO₂; das OH/HO₂-Verhältnis wird durch die NO-Konzentration kontrolliert — bei niedrigem NO dominiert die HO₂-Selbstreaktionsterminierung (HO₂ + HO₂ → H₂O₂ + O₂)",
        answerB = "OH entsteht ausschließlich aus Ozonolyse von Alkenen; HO₂ fungiert als Puffer-Radikal, das OH regeneriert durch UV-Photolyse von H₂O₂; das OH/HO₂-Verhältnis ist durch die Photolyserate j(H₂O₂) bestimmt und ist temperaturunabhängig",
        answerC = "Der HOx-Zyklus koppelt OH-Produkton an Methan-Oxidation: CH₄ + OH → CH₃ + H₂O; CH₃ + O₂ → CH₃O₂; das Methylperoxiradical reagiert mit OH zu H₂CO, das OH/HO₂-Verhältnis wird durch die Formaldehyd-Photolyse j(HCHO) dominiert",
        answerD = "OH wird durch H₂O-Photolyse bei 185 nm produziert; HO₂ entsteht aus OH + O₃ Reaktion; das OH/HO₂-Verhältnis folgt strikter Photogleichgewicht [OH]/[HO₂] = j(O³D)×[H₂O]/(k_{OH+O3}×[O₃]) und ist damit nur von stratosphärischen Ozonmengen abhängig",
        correctAnswer = 0, // A
        explanation = "Der troposphärische HOx-Zyklus: (1) Initiierung: O₃ + hν → O(¹D); O(¹D) + H₂O → 2OH. (2) Propagation: OH + CO → CO₂ + H; H + O₂ + M → HO₂ + M. (3) OH-Regeneration: HO₂ + NO → OH + NO₂; NO₂ + hν → NO + O; O + O₂ → O₃ (netto: CO oxidiert, Ozon erhalten). (4) Terminierung bei niedrig NO: HO₂ + HO₂ → H₂O₂ + O₂ (sink für HOx). Das [OH]/[HO₂]-Verhältnis hängt stark von [NO] ab: Hoch-NO → OH dominiert, Niedrig-NO → HO₂ akkumuliert. In der unberührten marinen Troposphäre (NO < 50 pptv) übernimmt HO₂ + O₃ → OH + 2O₂ die OH-Regeneration, aber ineffizient. Die OH-Konzentration (~2×10⁶ cm⁻³) bestimmt die Reinigungskapazität der Troposphäre.",
        difficulty = 5,
        funFact = null
    ),

    // Question 22 – Isoprene Oxidation and IEPOX
    Question(
        categoryId = 2,
        questionText = "Isopren (C₅H₈) ist das am häufigsten emittierte biogene flüchtige organische Molekül (BVOC, ~500 Tg C/Jahr). Die Isopren-Oxidation in Niedrig-NOx-Regionen führt über Isoprene Epoxydiols (IEPOX). Welche Reaktionssequenz und welche atmosphärische Bedeutung hat IEPOX?",
        answerA = "Isopren + OH → Isoprylhydroperoxid (ISOP-OOH) → bei Photolyse → IEPOX; IEPOX uptake auf saure Aerosole → 2-Methyltetrols und organosulfate; diese Reaktion ist der dominante Bildungsweg für sekundäres organisches Aerosol (SOA) in tropischen Regenwäldern wie dem Amazonasbecken",
        answerB = "Isopren + O₃ → Criegee-Intermediat → IEPOX direkt durch O₃-Addition; IEPOX ist gasförmig stabil und sedimentiert als Feuchtigkeitsnukleus; die IEPOX-Konzentration korreliert direkt mit dem Waldalbedo durch Bildung von Lichtstreuzentren",
        answerC = "IEPOX entsteht nur in der Stratosphäre durch UV-Photolyse von isopryl-Nitraten (ISOPN); es reagiert mit Sulfataerosolen zu methylierten Schwefelsäurestern, die als natürlicher Klimaregulator die Wolkenalbedo über tropischen Wäldern erhöhen",
        answerD = "Isopren + NO₃ (nachts) → δ-Isopren-Nitrat → IEPOX durch Nitrat-Esterspaltung; IEPOX-Konzentration ist daher ausschließlich nachtaktiv und hat keine direkte Bedeutung für Tages-Chemie oder SOA-Bildung",
        correctAnswer = 0, // A
        explanation = "Paulot et al. (2009, Science) identifizierten den 'isopren epoxydiols' (IEPOX)-Pfad als dominant in Niedrig-NOx-Umgebungen: Isopren + OH → Isoprenylhydroperoxide (δ-ISOP(OOH)); diese reagieren mit OH zu IEPOX (cis- und trans-β-IEPOX und δ-IEPOX). IEPOX reagiert auf sauren Aerosol-Oberflächen (heterogene Reaktion) zu 2-Methyltetrols, Methyltetrols-Sulfatestern (Organosulfaten) und 3-MeTHF-3,4-Diols. 2-Methyltetrols wurden erstmals im Amazonas-Aerosol von Claeys et al. (2004) gefunden und stellten ein Rätsel dar — die IEPOX-Route lieferte die Erklärung. SOA aus IEPOX-Chemie macht ~30–50% des globalen biogenen SOA aus und ist besonders im amazonautischen Regenwald relevant.",
        difficulty = 5,
        funFact = "Das Amazonas-Regenwaldbecken ist 'entkoppelt' von anthropogener Verschmutzung — hier können Atmosphärenchemiker quasi-prä-industrielle Chemie studieren. Die IEPOX-SOA-Bildungsrate ist dort ~30 Tg/Jahr."
    ),

    // Question 23 – New Particle Formation
    Question(
        categoryId = 2,
        questionText = "Neue Partikelbildung (NPF — New Particle Formation) ist ein wichtiger Mechanismus für atmosphärische Partikelneubildung. Welche molekularen Mechanismen sind nach dem aktuellen Stand (CLOUD-Experiment, CERN) für NPF in der unteren Troposphäre relevant?",
        answerA = "NPF erfolgt ausschließlich durch binäre Nukleation von H₂SO₄ und H₂O; Ammoniak und biogene organische Verbindungen haben keine Rolle bei der Keimbildung, sondern nur beim Wachstum der Partikel von 1 nm auf 100 nm durch Kondensation",
        answerB = "Schwefeltrioxid (SO₃) ist der aktive Nukleant, nicht H₂SO₄; SO₃-Moleküle bilden Trimere bei troposphärischen Temperaturen; nach CLOUD-Experimenten erklären SO₃-Cluster die beobachtete Nukleationsrate besser als H₂SO₄-basierte Mechanismen",
        answerC = "Nach CLOUD-Daten tragen mindestens drei Mechanismen bei: (1) Ioneninduzierte Nukleation (ionische Cluster aus H₂SO₄-NH₃-Ionenpaaren), (2) ternäre Nukleation (H₂SO₄-NH₃-H₂O in Regionen hoher NH₃-Konzentrationen), (3) H₂SO₄-hochoxidierte organische Moleküle (HOM)-Nukleation in Waldregionen; HOM entstehen aus Monoterpen-Ozonolyse und können ohne H₂SO₄ nukleieren",
        answerD = "NPF wird durch primäre Partikelzerfragmentation erklärt: Existierende Ruß-Partikel fragmentieren durch photochemische Oxidation in Nanopartikel; dieser Mechanismus dominiert global und erklärt die beobachtete Nukleation nahe Biomassebrand-Regionen",
        correctAnswer = 2, // C
        explanation = "Das CLOUD-Experiment (Cosmics Leaving Outdoor Droplets) am CERN (Kirkby et al., 2011, 2016; Tröstl et al., 2016) hat die Nukleationschemie revolutioniert: (1) Ionen-induzierte Nukleation: Kosmische Strahlung ionisiert Luft → ionische H₂SO₄-Cluster nukleieren effizienter. (2) Ternäre H₂SO₄-NH₃-H₂O-Nukleation: Ammoniak stabilisiert H₂SO₄-Cluster dramatisch (Nukleationsrate steigt um 10²-10³). (3) Organisch-induzierte Nukleation: Hochoxidierte organische Moleküle (HOM) aus Monoterpen-Ozonolyse können mit oder ohne H₂SO₄ nukleieren. HOM-Mechanismus ist dominant in borealen und tropischen Wäldern. Der globale NPF-Beitrag zu Cloud Condensation Nuclei (CCN) beträgt ~45% — atmosphärisch hochrelevant für das Klima.",
        difficulty = 5,
        funFact = null
    ),

    // Question 24 – Halogen Chemistry in the Stratosphere
    Question(
        categoryId = 2,
        questionText = "Halogen-Radikale (Cl, Br, I) sind in der Stratosphäre außerordentlich effiziente Ozonzerstörer. Warum ist Brom pro Atom ~45-65x wirksamer als Chlor beim Ozonabbau?",
        answerA = "Br-Atome haben eine niedrigere Aktivierungsenergie für Br + O₃ → BrO + O₂ (E_a = 0 kJ/mol) als Cl-Atome; Brom reagiert mit Ozon effektiv bei allen Stratosphärentemperaturen, während Chlor erst oberhalb von 220 K reaktiv ist",
        answerB = "Bromverbindungen (CH₃Br, Halons) transportieren mehr Halogenatome pro Molekül als Chlor-Verbindungen (FCKW); die höhere Anzahl an Br-Atomen pro Molekül, nicht die intrinsische Reaktivität, erklärt die höhere Ozonzerstörungspotenzial (ODP)",
        answerC = "Die höhere Effizienz von Brom liegt darin, dass HBr wesentlich photolabiler ist als HCl (Photolysefrequenz j(HBr) >> j(HCl)); damit verbleibt Brom viel kürzer in der inaktiven HX-Reservoir-Form und steht länger als aktives Radikal zur Verfügung; zudem sind heterogene Reaktionen von BrONO₂ auf PSC deutlich schneller als ClONO₂-Reaktionen",
        answerD = "Brom hat eine dreifache Resonanzstruktur im BrO-Radikal, die dem System drei Reaktionskanäle für den katalytischen Ozon-Abbau gibt (BrO + XO → Br + X + O₂ für X = Br, Cl, I); jeder Reaktionskanal zerstört ein Ozonmolekül, weshalb Brom netto dreifach so effizient ist wie angenommen",
        correctAnswer = 2, // C
        explanation = "Daniel et al. und WMO-Berichte: Der Relative Efficiency Factor (α) von Brom ≈ 45–65. Mehrere Gründe: (1) HCl ist das dominante Reservoir für Cl (98% des stratosphärischen Cl sind als HCl und ClONO₂ inaktiv); HBr hat eine höhere Photolysefrequenz und ist säureempfindlicher auf PSC (Polar Stratospheric Clouds) — dadurch ist ein größerer Anteil des Broms als aktives BrO/Br vorhanden. (2) BrO reagiert mit ClO, NO₂ und selbst in gegenseitigen Abbaureaktionen: BrO + ClO → Br + Cl + O₂ (direkter Cross-Halogen-Katalysezyklus, der keinen NO-Recycling benötigt und daher auch bei Nacht aktiv ist). (3) HBr-Kondensation auf PSC ist effizienter als HCl. Die atmosphärische Brom-Belastung (~20 pptv total Br) ist 200x kleiner als Cl, aber wegen des hohen α-Faktors ist ihr Ozon-Abbau-Beitrag ~35%.",
        difficulty = 5,
        funFact = "Halon-1211 (CF₂ClBr) und Halon-1301 (CF₃Br) wurden in Feuerlöschern eingesetzt und haben Ozonzerstörungspotenziale von 3 und 10 — weit höher als die FCKW. Sie sind seit 1994 in entwickelten Ländern verboten."
    ),

    // Question 25 – Secondary Organic Aerosol Formation
    Question(
        categoryId = 2,
        questionText = "Sekundäres organisches Aerosol (SOA) übersteigt in der globalen Atmosphäre die Masse aller primären Partikelquellen zusammen. Welche Theorie der SOA-Bildung hat in den letzten Jahren das klassische Zwei-Produkt-Modell (Odum et al.) am stärksten erweitert?",
        answerA = "Das klassische Zwei-Produkt-Modell (Odum 1996) wurde durch die VBS-Theorie (Volatility Basis Set, Donahue et al. 2006) ersetzt; VBS beschreibt organische Verbindungen durch ihre Sättigungskonzentration C* in logarithmisch-gestuften Bins; SOA-Bildung und Verdampfung werden durch Verschiebung in VBS-Bins durch chemische Oxidation (aging) und photolytische Fragmentierung modelliert",
        answerB = "SOA-Bildung wird heute vollständig durch Molekulardynamiksimulationen beschrieben; experimentelle Parametrisierungen wie Zwei-Produkt oder VBS sind veraltet, da MD-Simulationen alle relevanten Kondensationspfade auf ns-Zeitskala quantitativ vorhersagen",
        answerC = "Das dominierende neue Paradigma ist das 'Aqueous-Phase SOA' (aqSOA): Fast alle SOA-Vorläufer sind wasserlöslich und bilden SOA ausschließlich in Wolkentropfen durch wässrige Oxidation mit OH; das klassische Gas-Partikel-Partitionierungsmodell ist für aqSOA irrelevant",
        answerD = "Die wichtigste Erweiterung ist die Einbeziehung von Peroxyradikalen (RO₂) als direkte SOA-Vorläufer ohne Oxidation zu semi-flüchtigen Produkten; ROOR-Diester-Bildung durch RO₂ + RO₂ Kreuzkombination erklärt die gesamte beobachtete SOA-Masse ohne jede Vorkondensation",
        correctAnswer = 0, // A
        explanation = "Donahue et al. (2006, EST) entwickelten das Volatility Basis Set (VBS): Organische Verbindungen werden in logarithmisch gestufte Bins nach ihrer Sättigungskonzentration C* (μg/m³) eingeteilt (typisch 10⁻² bis 10⁶ μg/m³). Das VBS ermöglicht: (1) Konsistente Beschreibung des gesamten Flüchtigkeitsspektrums von IVOCs bis LVOCs. (2) Modellierung von 'aging' — atmosphärische Oxidation verschiebt Verbindungen zu niedrigerem C* durch Hinzufügen funktioneller Gruppen, aber fragmentation verschiebt zu höherem C*. (3) Integration von HOM (extremely low volatility organics, ELVOC, C* < 10⁻³ μg/m³) aus Terpenen. Das VBS wurde in globale Klimamodelle (GEOS-Chem, ECMWF) integriert und verbessert die SOA-Vorhersagen erheblich. Aktuelle Forschung integriert auch heterogene Chemie und aqueous-phase-SOA als zusätzliche VBS-Quellen.",
        difficulty = 5,
        funFact = null
    ),

    // ── BLOCK 6: Genome Architecture ─────────────────────────────────────────

    // Question 26 – A/B Compartments
    Question(
        categoryId = 2,
        questionText = "Hi-C-Daten zeigen, dass das Säugetiergenom in zwei Arten von topologischen Kompartimenten organisiert ist: A-Kompartimente und B-Kompartimente. Welche Eigenschaften unterscheiden sie, und welcher molekulare Mechanismus hält die Phasensegregation aufrecht?",
        answerA = "A-Kompartimente entsprechen aktiv transkribierter Euchromatin-Regionen mit hoher Gendichte, hoher Histon-H3K27ac-/H3K4me3-Markierung und offener Chromatinstruktur; B-Kompartimente sind Heterochromatin-reich (H3K9me3, H3K27me3), replizieren spät und sind an der Kernperipherie lokalisiert; die Segregation wird durch Phasenseparation homotypischer Chromatin-Regionen getrieben, vermittelt durch Chromatin-bindende Proteine wie HP1 (für B) und BRD4 (für A)",
        answerB = "A-Kompartimente sind durch CTCF-Bindestellen an ihren Grenzen definiert und halten stabile Schleifen aufrecht; B-Kompartimente fehlt CTCF-Bindung und werden durch Cohesin-Strangulation von der A-Domänen-Transkription ferngehalten; die Segregation ist rein struktureller Natur ohne Phasenseparation",
        answerC = "A-Kompartimente sind kernlaminassoziiert (LADs — Lamina-Associated Domains) und B-Kompartimente befinden sich im Kerninneren; Hi-C-Daten wurden ursprünglich fehlinterpretiert — nach neueren Daten sind A-Regionen transkriptionell inaktiv, während B-Regionen aktiv transkribiert werden",
        answerD = "A- und B-Kompartimente wechseln ihre Identität zellzyklusabhängig; in der S-Phase werden alle B-Kompartimente zu A umgeschaltet um DNA-Replikation zu ermöglichen; die Identität wird durch reversible Phosphorylierung von Histonen H3S10 kontrolliert",
        correctAnswer = 0, // A
        explanation = "Lieberman-Aiden et al. (2009, Science) entdeckten A/B-Kompartimente mit Hi-C. Weitere Eigenschaften: A-Kompartimente (aktives Chromatin): DNase I-hypersensitiv, reich an CpG-Inseln, hohe RNA Pol II-Dichte, frühe Replikation, erhöhte Gendichte, assoziiert mit kondensiertem Nukleolus-assoziiertem Chromatin. B-Kompartimente (inaktives Chromatin): H3K9me2/3-reich, LADs (Kernlamina-assoziiert), LCDs (Nucleolus-assoziiert). Der Mechanismus der Phasensegregation: Mikrophasenseparation durch homotypische Chromatin-Kontakte — A-A-Kontakte bevorzugt gegenüber A-B-Kontakten (Polymer-Phasenseparation). HP1α kondensiert H3K9me3-Heterochromatin durch LLPS (Liquid-Liquid Phase Separation). BRD4 und Mediator bilden Superkondensate an aktiven Enhancern.",
        difficulty = 5,
        funFact = "A/B-Kompartimentgrenzen können sich bei Zelldifferenzierung verschieben — einzelne Gene wechseln aus B nach A beim Aktivieren. Dies ist messbar als 'compartment switching' in der Hi-C-Daten-Analyse bei Differenzierung von iPSCs."
    ),

    // Question 27 – Lamina-Associated Domains (LADs)
    Question(
        categoryId = 2,
        questionText = "Lamina-assoziierte Domänen (LADs) sind genomische Regionen, die bevorzugt mit der Kernlamina assoziieren. Welche experimentelle Methode identifiziert LADs, und welche Funktion haben sie für die Genregulation?",
        answerA = "LADs werden durch DamID (DNA adenine methylation identification) kartiert: Dam-Methylase wird an Lamin B1 fusioniert; überall wo Lamin B1 mit Chromatin in Kontakt kommt, methyliert Dam lokale Adenine (GATC-Motive); anschließend wird methylierte DNA durch DpnII-Verdau angereichert und sequenziert; LADs sind transkriptionell repressiv durch Heterochromatin-Bildung und räumliche Sequestration vom Transkriptions-Faktor-reichen Kerninneren",
        answerB = "LADs werden durch ChIP-seq mit Anti-Lamin-B1-Antikörper nach Chromatin-Immunpräzipitation kartiert; LADs entsprechen aktiv transkribiertem Chromatin, da die Kernlamina als Gerüst für aktive RNA-Polymerase-I-Komplexe dient",
        answerC = "LADs werden durch ATAC-seq-Regionen niedrigerer Zugänglichkeit identifiziert; Lamin A/C-Bindung öffnet Chromatin für Transkriptionsfaktoren und markiert so aktive Enhancer-Regionen; LADs sind überwiegend in Exon-reichen Genbereichen",
        answerD = "LADs entstehen durch CTCF-Cohesin-vermittelte Schleifenextrusion an der Kernperipherie; sie werden durch HiChIP mit Anti-CTCF-Antikörper kartiert und repräsentieren Genloci, die durch CTCF an der Lamina verankert werden",
        correctAnswer = 0, // A
        explanation = "DamID (van Steensel & Henikoff, 2000) ist die Standardmethode für LAD-Kartierung: Lamin B1-Dam-Fusionsprotein methyliert GATC-Motive nahe der Kernlamina. Nach genomischer DNA-Extraktion und DpnI-Verdau (schneidet nur methyliertes GATC) werden methylierte Fragmente identifiziert und zu LAD-Karten zusammengesetzt. LADs (~40% des Genoms in humanen Zellen) haben folgende Eigenschaften: späte Replikation, niedrige Genexpression, H3K9me2-reich, B-Kompartiment-assoziiert. Peric-Hupkes et al. (2010, Mol Cell) zeigten bei der Differenzierung von ESC zu neuronalen Zellen: Gene, die aktiviert werden, verlassen die Lamina (LAD → interLAD-Übergang). Repositionierung von der Lamina ermöglicht oder begleitet Genaktivierung — ob Ursache oder Wirkung ist noch diskutiert.",
        difficulty = 5,
        funFact = null
    ),

    // Question 28 – Condensin Complexes
    Question(
        categoryId = 2,
        questionText = "Condensin I und Condensin II sind SMC-Komplexe (Structural Maintenance of Chromosomes), die für die Chromosomenkondensation in der Mitose essenziell sind. Wie unterscheiden sich Condensin I und II in Lokalisation und Funktion?",
        answerA = "Condensin I ist ausschließlich nukleolär und verdichtet rDNA-Regionen; Condensin II verteilt sich gleichmäßig auf dem gesamten Chromosom und ist für die axiale Kompaktierung verantwortlich; beide wirken nach dem Loop-Extrusion-Mechanismus, aber mit entgegengesetzten Prozessivitäten",
        answerB = "Condensin I und II unterscheiden sich in ihren HEAT-Repeat-Untereinheiten (CAP-D2/G für I, CAP-D3/G2 für II); Condensin II ist kernständig während des gesamten Zellzyklus und beginnt Chromosomenkondensation in der G2/M-Phase; Condensin I wird erst nach Kernhüllenauflösung in der Prophase auf Chromosomen rekrutiert und erzeugt die feinere Helikalstruktur der Chromatide",
        answerC = "Condensin I kondensiert väterliche Chromosomen, Condensin II kondensiert mütterliche Chromosomen durch differentielle Bindung an H3K4me3 (paternal) und H3K27me3 (maternal) Histone; dieser Mechanismus sichert die korrekte Trennung epigenetisch unterschiedlicher Chromatiden",
        answerD = "Condensin I ist die aktive Form, Condensin II die regulatorische Form; Condensin II hemmt Condensin I durch kompetitive Bindung an SMC2/SMC4-Dimere; die Ratio Condensin I/II bestimmt den Grad der Chromosomenkondensation, nicht der räumliche Ausschluss",
        correctAnswer = 1, // B
        explanation = "Condensin I und II teilen die SMC2/SMC4-Dimer-Kernstruktur, unterscheiden sich aber in ihren regulatorischen Untereinheiten: Condensin I hat CAP-D2, CAP-G, CAP-H; Condensin II hat CAP-D3, CAP-G2, CAP-H2. Entscheidend für ihre differentielle Funktion ist die subzelluläre Lokalisation: Condensin II enthält ein Kernlokalisierungssignal und ist stets nuclear. Condensin I ist cytoplasmatisch und wird erst nach NEBD (Nuclear Envelope Breakdown) in der Prophase auf Chromosomen zugänglich. Hirota et al. (2004) und Ono et al. (2003) zeigten: Condensin II erzeugt die axiale Längsachse der Chromosomen (axiale Kompaktierung), Condensin I erzeugt die spiralförmige Helixstruktur der Chromatide (laterale Kompaktierung). Loop-Extrusion-Messungen (Ganji et al. 2018) zeigten: Condensin I extrudiert ~0,5 kb/s und stalls bei Cohesins, Condensin II ist langsamer aber prozessiver.",
        difficulty = 5,
        funFact = "Ohne Condensin II sind mitotische Chromosomen 3-4x länger als normal und können nicht korrekt segregiert werden. Condensin II ist essentiell für die axiale Kompaktierung — ohne es würden Chromosomen beim Pulling durch den Spindelapparat reißen."
    ),

    // Question 29 – Chromosome Territories
    Question(
        categoryId = 2,
        questionText = "Chromosomenterritorien (CT) sind nicht-zufällig im Zellkern positioniert. Welche Prinzipien bestimmen die radiale Positionierung der CT, und wie wird dies funktionell für die Genregulation genutzt?",
        answerA = "Die radiale CT-Position korreliert mit Gendichte und Transkriptionsaktivität: gen-reiche aktive Chromosomen (z.B. Chr. 19) befinden sich bevorzugt im Kerninneren; gen-arme inaktive Chromosomen (z.B. Chr. 18) befinden sich an der Kernperipherie; diese Positionierung ist nicht starr sondern korreliert statistisch, mit ~30% der Zellen in inversen Konformationen",
        answerB = "CT-Positionierung folgt dem Chromosomengröße-Prinzip: Kleine Chromosomen innen, große außen; dieser rein physikalische Entroplastik-Mechanismus erklärt 95% der beobachteten Radialpositionierung ohne epigenetische Regulationsnotwendigkeit",
        answerC = "Alle CT sind zufällig positioniert (Brownsche Diffusion); beobachtete statistische Häufungen in FISH-Studien entstehen durch Fixierungs-Artefakte; Live-Cell-Imaging zeigt, dass CT auf Sekunden-Zeitskala frei durch den Kern diffundieren",
        answerD = "CT-Positionierung wird ausschließlich durch Lamin-A/C-Spiegel bestimmt; hohe Lamin-A-Konzentrationen fixieren CT an der Peripherie; in Zellen ohne Lamin A (Laminopathien) wandern alle CT ins Kerninnere und verursachen Chromatinstruktur-Kollapsdurch wahllose Transkription",
        correctAnswer = 0, // A
        explanation = "Cremer & Cremer (2001, Nat Rev Genet) fassten die CT-Theorie zusammen. Die radiale Positionierung zeigt klare Präferenzen: Humanes Chr. 19 (gen-reich, ~23 Gene/Mb) liegt überwiegend im Kerninneren; Chr. 18 (gen-arm, ~4 Gene/Mb) liegt an der Peripherie — obwohl beide fast gleich groß sind (ca. 80 Mb). Dies zeigt, dass Gendichte/Aktivitätsstatus, nicht Chromosomengröße, die Hauptdeterminante ist. Mechanismus: Aktives Chromatin (A-Kompartiment) interagiert mit dem transkriptionell aktiven Kerninneren; B-Kompartiment-assoziiertes Chromatin bindet LADs an der Kernlamina. Funktionelle Konsequenz: Gene an der Peripherie sind bevorzugt reprimiert; Genaktivierung geht oft mit Repositionierung vom CT-Rand ins Innere einher (Gene reposition in CTs).",
        difficulty = 5,
        funFact = null
    ),

    // Question 30 – Nucleolus Organization and Phase Separation
    Question(
        categoryId = 2,
        questionText = "Der Nukleolus ist das größte membranlose Organell im Zellkern und bildet sich durch flüssig-flüssig-Phasenseparation. Welche molekularen Komponenten treiben die Nukleolus-Phasenseparation, und welche biophysikalische Eigenschaft erklärt seine interne Dreischicht-Organisation?",
        answerA = "Der Nukleolus wird durch Phasenseparation von rDNA-Transkripten (pre-rRNA) mit Nucleophosmin (NPM1) und Fibrillarin getrieben; die Dreischicht-Struktur (Fibrilläres Zentrum FC, Dense Fibrillar Component DFC, Granular Component GC) entsteht durch verschachtelte Flüssigkeitsphasenseparation: NPM1 in GC, Fibrillarin in DFC, RNA Pol I in FC; die Trennung folgt der Kapillaritätstheorie der ternären Flüssigkeitsgemische (Cahn-Hilliard für drei-Komponenten-System)",
        answerB = "Nukleolus-Phasenseparation wird ausschließlich durch H3K9me3-Chromatin ausgelöst, das nucleolär-assoziiertes Chromatin (NAD) als stabile Plattform bildet; Nucleophosmin bindet spezifisch H3K9me3 und rekrutiert rDNA-Gene in das entstehende Kondensat",
        answerC = "Der Nukleolus ist keine echte Flüssig-Phasenseparation, sondern ein gel-artiges Kondensat aus vernetzten rRNA-Transkripten; die Viskosität ist 10³-fach höher als das Nukleoplasma, weshalb FCS (Fluorescence Correlation Spectroscopy) zeigt, dass Proteine im Nukleolus immobil sind",
        answerD = "Nukleolus-Formation wird durch rDNA-Gencluster auf Chromosomen 13, 14, 15, 21, 22 (NOR — Nucleolar Organizer Regions) eingeleitet; die Phasenseparation wird durch G-Quadruplex-Bildung in rDNA getrieben, und die Dreischicht-Struktur entspricht den drei rDNA-Repeat-Typen (45S, 28S, 5.8S)",
        correctAnswer = 0, // A
        explanation = "Lafontaine et al. (2021, Science) und Feric et al. (2016, Cell) zeigten, dass der Nukleolus ein mehrphasiges flüssiges Kondensat ist. Die drei Schichten entstehen durch sequenzielle, verschachtelte Phasenseparation: (1) Fibrilläres Zentrum (FC): RNA Pol I + UBF + rDNA; site der aktiven Transkription. (2) Dense Fibrillar Component (DFC): Fibrillarin + pre-rRNA + snoRNPs; site der frühen rRNA-Prozessierung und 2'-O-Methylierung. (3) Granular Component (GC): Nucleophosmin (NPM1) + späte pre-rRNA; site der späten rRNA-Prozessierung und Ribosomen-Zusammenbau. Die Dreischichtung entsteht, weil NPM1 die äußere GC-Phase bevorzugt (niedrigere Oberflächenspannung gegen Nukleoplasma), während Fibrillarin die innere DFC bevorzugt. Dies ist ein physikalisches Prinzip der ternären Mischung mit unterschiedlichen Mischungsenergien.",
        difficulty = 5,
        funFact = "NPM1-Mutationen finden sich in ~30% aller akuten myeloischen Leukämien (AML). Die Mutation delokalisiert NPM1 aus dem Nukleolus ins Zytoplasma — ein seltener Fall, wo ein Phasenseparations-Defekt direkt Krebs verursacht."
    ),

    // ── BLOCK 7: Nonlinear Dynamics ───────────────────────────────────────────

    // Question 31 – Lorenz Attractor
    Question(
        categoryId = 2,
        questionText = "Das Lorenz-System (1963) war das erste explizite Beispiel für deterministisches Chaos in der Meteorologie. Welches mathematische Kriterium charakterisiert den Lorenz-Attraktor als 'seltsamen Attraktor', und welche physikalische Konsequenz folgt für die Wettervorhersage?",
        answerA = "Der Lorenz-Attraktor ist ein seltsamer Attraktor, weil er eine fraktale Hausdorff-Dimension von D_H ≈ 2,06 hat (größer als 2 aber kleiner als 3); dieser Attraktor besitzt einen positiven größten Lyapunov-Exponenten λ₁ > 0, was exponentielle Separation anfänglich naher Trajektorien (Schmetterlingssensitivität) bedeutet und die fundamentale Grenze der deterministischen Wettervorhersage von ~2 Wochen erklärt",
        answerB = "Lorenz-Attraktoren sind seltsam weil sie transient sind: Nach endlicher Zeit kollabiert jede Trajektorie auf einen stabilen Fixpunkt oder Grenzzyklus; die scheinbare fraktale Struktur ist ein numerisches Artefakt endlicher Iterationstiefe im Runge-Kutta-Integrator",
        answerC = "Der Lorenz-Attraktor ist ein seltsamer Attraktor wegen seiner nicht-analytischen Vektorfeldstruktur: Die Divergenz ∇·F ist nicht-konstant und zeigt Unstetigkeiten; diese mathematischen Singularitäten verursachen den Informationsverlust und machen Langzeitvorhersagen unmöglich",
        answerD = "Seltsamkeit beim Lorenz-Attraktor bedeutet ausschließlich seine topologische Eigenschaft: Er ist nicht-trivial verschlungen (ein Knoten mit Verschlingungszahl ≠ 0 in der Phasenfläche); der positive Lyapunov-Exponent ist eine sekundäre Konsequenz der Topologie und nicht das definitorische Kriterium",
        correctAnswer = 0, // A
        explanation = "Lorenz (1963) entdeckte deterministisches Chaos bei der numerischen Integration von dx/dt = σ(y-x), dy/dt = x(ρ-z)-y, dz/dt = xy-βz mit σ=10, ρ=28, β=8/3. Kriterien für 'seltsamen Attraktor': (1) Attraktor (Trajektorien konvergieren darauf), (2) fraktale Struktur (D_H ≈ 2,06, nicht-ganzzahlig), (3) sensitiv auf Anfangsbedingungen (positiver Lyapunov-Exponent λ₁ ≈ 0,9 für Standardparameter). Der Lyapunov-Exponent quantifiziert: zwei benachbarte Trajektorien trennen sich wie e^{λ₁t} — Verdopplung des Abstands alle ~0,8 Zeiteinheiten. Mit einer typischen Messgenauigkeit von ε₀ und tolerierbarer Fehler ε führt dies zu einer maximalen Vorhersagbarkeitszeit T ≈ λ₁⁻¹ ln(ε/ε₀) — für das Wetter ~2 Wochen bei Verbesserung der Anfangsbedingungen um Faktor 100 nur ~1 Woche Zugewinn.",
        difficulty = 5,
        funFact = null
    ),

    // Question 32 – Bifurcation Theory
    Question(
        categoryId = 2,
        questionText = "In der Bifurkationstheorie beschreibt eine Hopf-Bifurkation den Übergang von einem stabilen Fixpunkt zu einem Grenzzyklus. Welche algebraische Bedingung charakterisiert eine Hopf-Bifurkation, und was unterscheidet eine superkritische von einer subkritischen Hopf-Bifurkation?",
        answerA = "Eine Hopf-Bifurkation tritt auf wenn ein konjugiertes Eigenwertpaar λ_{1,2} = α(μ) ± iω(μ) bei μ = μ_c die imaginäre Achse überquert: dα/dμ ≠ 0 bei α(μ_c) = 0 und ω(μ_c) ≠ 0; superkritisch: stabiler Grenzzyklus entsteht für μ > μ_c (weicher Übergang); subkritisch: instabiler Grenzzyklus existiert für μ < μ_c, dann explosiver Übergang zu großer Amplitude (harter Übergang/Hysterese)",
        answerB = "Hopf-Bifurkation ist identisch mit der Periode-Verdopplungs-Bifurkation: Ein stabiler Grenzzyklus verdoppelt seine Periode bei μ = μ_c und führt zur Feigenbaum-Kaskade zur chaotischen Route; superkritisch bedeutet, dass die Feigenbaum-Konstante δ = 4,669 positiv ist",
        answerC = "Die Hopf-Bifurkation tritt nur in Systemen mit gerade Dimension n auf; für ungerade n ergibt sich stattdessen eine Pitchfork-Bifurkation; superkritische Hopf-Bifurkation bedeutet D²f/Dμ² > 0 (Krümmung des Bifurkationsdiagramms positiv), subkritisch entsprechend negativ",
        answerD = "Eine Hopf-Bifurkation erfordert eine reale Nullstelle des charakteristischen Polynoms; das Zeichen des Fokus-Quantitäts-Koeffizienten a₁ (erster Lyapunov-Koeffizient) bestimmt nur die Orientierung der spiralförmigen Annäherung, nicht den Typ der Bifurkation",
        correctAnswer = 0, // A
        explanation = "Die Hopf-Bifurkation (Hopf 1942, Marsden-McCracken 1976) tritt auf wenn ein konjugiertes Paar komplexer Eigenwerte λ = α(μ) ± iω(μ) die imaginäre Achse bei μ = μ_c transversal überquert: α(μ_c) = 0, ω(μ_c) ≠ 0, dα/dμ|_{μ_c} ≠ 0. Der erste Lyapunov-Koeffizient l₁ entscheidet den Typ: l₁ < 0 → superkritisch: stabiler Grenzzyklus entsteht für μ > μ_c mit Amplitude ~√(μ-μ_c), kein Hysterese-Verhalten. l₁ > 0 → subkritisch: instabiler Grenzzyklus existiert für μ < μ_c; bei μ = μ_c kollabiert der Fixpunkt und das System springt abrupt auf großamplitudigen Attraktoren — Hysterese und Bistabilität möglich. Biologisches Beispiel: Superkritisch in Neuronenfeuern (Klasse-II-Neuronen nach Hodgkin), subkritisch in Klasse-I-Neuronen.",
        difficulty = 5,
        funFact = "Hopf-Bifurkationen erklären warum manche Herzrhythmusstörungen (Arrhythmien) spontan entstehen und abrupt enden: Das Herzgewebe kann subkritisch in einen Grenzzyklus-Zustand (Fibrillation) kippen, von dem es nur durch starken Stimulus (Defibrillation) zurückgebracht werden kann."
    ),

    // Question 33 – Solitons
    Question(
        categoryId = 2,
        questionText = "Solitonen sind lokalisierte, stabile Wellenpakete, die kollisionsfrei durch andere Solitonen hindurchwandern. Welche mathematische Eigenschaft der Korteweg-de-Vries-Gleichung (KdV) erklärt die Soliton-Stabilität?",
        answerA = "Die KdV-Gleichung (∂_t u + 6u∂_x u + ∂³_x u = 0) ist vollständig integrabel: Sie besitzt unendlich viele erhaltene Größen (Erhaltungssätze J_n), die durch die inverse Streutheorie konstruiert werden; die Soliton-Lösungen u(x,t) = -2κ² sech²(κ(x-4κ²t)) sind exakte Lösungen und kollisionsfrei, weil alle Erhaltungsgrößen während der 'Kollision' erhalten bleiben und die Wellenpakete nur eine Phasenverschiebung erfahren",
        answerB = "KdV-Solitonen sind stabil wegen ihrer topologischen Ladung: Jedes Soliton trägt eine ganzzahlige Windungszahl n ∈ Z, die durch ein Homotopieargument topologisch geschützt ist; Kollisionen zwischen Solitonen unterschiedlicher Windungszahl sind verboten durch Ladungserhaltung",
        answerC = "Die Stabilität kommt aus der Balance zwischen nichtlinearer Selbstfokussierung (Kerr-Effekt: Brechungsindex n = n₀ + n₂|u|²) und linearer Dispersion; diese Balance ist dynamisch instabil, wird aber durch schwache Dämpfung stabilisiert — Solitonen dissipieren langsam Energie an die Umgebung und schrumpfen auf einer Dissipations-Zeitskala",
        answerD = "KdV-Solitonen sind stabile Lösungen weil die KdV-Gleichung eine nichtlineare Schrödinger-Gleichung als Normform hat; die Soliton-Lösung entspricht dem Grundzustand des effektiven Potenzials im NLS-Rahmen und ist daher global stabil gegen alle kleinen Störungen durch das Variantionsprinzip",
        correctAnswer = 0, // A
        explanation = "Gardner, Greene, Kruskal und Miura (1967) entdeckten die vollständige Integrabilität der KdV-Gleichung durch die inverse Streutheorie: Die KdV besitzt unendlich viele in Involution stehende Erhaltungsgrößen (∫u dx, ∫u² dx, ∫(u³-½(∂_x u)²) dx, ...), die als 'Aktionsvariablen' des zugehörigen Hamilton-Systems dienen. Soliton-Lösungen entsprechen reflektionslosen Potenzialen des assoziierten Schrödinger-Operators L = -∂²_x + u(x,t) im Lax-Paar L, A mit L_t = [A,L]. Bei Kollisionen zweier Solitonen bleibt das Formspektrum erhalten — nur die Phasen verschieben sich. John Scott Russell beobachtete 1834 das erste Soliton (eine 'Great Wave of Translation') im Edinburgh-Kanal, ohne die Theorie zu kennen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 34 – Turing Pattern Formation
    Question(
        categoryId = 2,
        questionText = "Alan Turings 'The Chemical Basis of Morphogenesis' (1952) beschreibt, wie räumlich homogene Gleichgewichte durch diffusionsgetriebene Instabilität Muster bilden können. Welche Bedingung (Turing-Instabilität) ist für Musterbildung notwendig?",
        answerA = "Zwei Reaktions-Diffusions-Spezies mit einem Aktivator (u, langsame Diffusion D_u) und einem Inhibitor (v, schnelle Diffusion D_v >> D_u) können instabil werden, wenn der Inhibitor den Aktivator räumlich auf einer größeren Längenskala reguliert als der Aktivator sich selbst verstärkt; formal: Das homogene Gleichgewicht ist ohne Diffusion stabil, aber die Jacobi-Matrix hat Eigenwerte mit positivem Realteil für bestimmte Wellenzahlen k wenn D_v/D_u > (1/D_u × ∂f/∂u / ∂g/∂v)² (Turing-Bedingung)",
        answerB = "Turing-Instabilität erfordert, dass beide Spezies gleich schnell diffundieren (D_u = D_v); der Unterschied zwischen Aktivierung und Inhibition kommt ausschließlich aus den nichtlinearen Reaktionsraten, nicht aus unterschiedlichen Diffusionskoeffizienten",
        answerC = "Die notwendige Bedingung ist eine negative Jacobi-Determinante det(J) < 0 für das Reaktionssystem ohne Diffusion; Diffusion verstärkt jede solche Instabilität und erzeugt räumliche Muster, unabhängig vom Verhältnis der Diffusionskonstanten",
        answerD = "Turing-Instabilität erfordert drei Spezies; mit nur zwei Spezies ist Musterbildung durch Diffusion prinzipiell unmöglich, da das Gierer-Meinhardt-Modell (2-Spezies) immer zu homogenen Endzuständen konvergiert",
        correctAnswer = 0, // A
        explanation = "Turing (1952) zeigte: Ein stabiles homogenes Gleichgewicht eines Zwei-Spezies-Reaktionssystems kann durch Diffusion destabilisiert werden (Diffusion as destabilizer). Die Turing-Bedingung für eine Instabilität bei Wellenzahl k: Die Dispersionskurve Re(σ(k)) hat ein Maximum bei k* > 0. Notwendige Bedingung: D_v/D_u > 1 (kurz: der Inhibitor muss schneller diffundieren als der Aktivator) zusammen mit der Bedingung an die Jacobi-Matrix des Reaktionssystems (fu+gv < 0, fu·gv - fv·gu > 0 für stabiles Gleichgewicht ohne Diffusion, aber fu > 0 für Selbstaktivierung). Die bevorzugte Muster-Wellenlänge ist λ* = 2π/k* mit k*² = √(fu·gv-fv·gu)/(Du·Dv). Experimente: Kondo & Asai (1995, Nature) zeigten Turing-Muster beim Zebrafisch-Streifenmuster.",
        difficulty = 5,
        funFact = "Die Zebrafischstreifenbildung wurde 2012 von Kondo und Kollegen als Turing-Muster bestätigt: Durch genetische Störung des Diffusionskoeffizient-Verhältnisses (Connexin-Mutationen) entstehen Punkte statt Streifen — exakt wie Turing vorhergesagt hatte."
    ),

    // Question 35 – Chaos Control
    Question(
        categoryId = 2,
        questionText = "OGY-Methode (Ott-Grebogi-Yorke, 1990) ermöglicht die Kontrolle chaotischer Systeme durch kleine Parameterperturbationen. Welches Prinzip liegt dieser Methode zugrunde, und warum funktioniert sie trotz des positiven Lyapunov-Exponenten?",
        answerA = "OGY nutzt die Tatsache, dass chaotische Attraktoren unendlich viele instabile periodische Orbits (UPOs) enthalten; durch kleine Systemparameterperturbationen nahe einer Poincaré-Schnittfläche kann eine Trajektorie auf die stabile Mannigfaltigkeit eines gewünschten UPOs gelenkt werden; der positive Lyapunov-Exponent der stabilen Richtung des UPO erlaubt die exponentielle Konvergenz auf den Orbit",
        answerB = "OGY funktioniert durch zeitverzögerte Rückkopplung (Pyragas-Methode): Das Kontrollsignal K(t) = u(t-τ) - u(t) mit τ gleich der gewünschten Periode treibt das System periodisch; chaotische Fluktuationen werden durch destruktive Interferenz ausgelöscht",
        answerC = "Die OGY-Methode erhöht lokal die Dämpfung des Systems durch adaptive Feedback-Kontrolle; durch Hinzufügen eines negativen Lyapunov-Termals -λ₁ × δx wird der positive Lyapunov-Exponent kompensiert und das Chaos unterdrückt",
        answerD = "OGY nutzt die fraktale Struktur des Lorenz-Attraktors: Durch gezielte Sprünge zwischen den zwei Lobes des Schmetterlings-Attraktors kann jede gewünschte periodische Trajektorie erzeugt werden; dies erfordert keine Kenntnis der Systemdynamik, nur das Beobachten der Selbstähnlichkeit des Attraktors",
        correctAnswer = 0, // A
        explanation = "OGY (Ott, Grebogi, Yorke, 1990, PRL) ist konzeptionell elegant: Jeder chaotische Attraktor enthält eine dichte Menge instabiler periodischer Orbits (UPOs) — als 'Skelett' des Chaos (Cvitanovic, 1988). Nahe einem UPO hat die linearisierte Dynamik eine stabile Mannigfaltigkeit (mit negativem Lyapunov-Exponenten) und eine instabile Mannigfaltigkeit (mit positivem Lyapunov-Exponenten). Der OGY-Kontrollalgorithmus: (1) Identifiziere UPO und seine stabilen/instabilen Mannigfaltigkeiten. (2) Wenn die Trajektorie die Poincaré-Schnittfläche nahe dem UPO-Fixpunkt trifft, berechne kleine Parameterperturbation δp, um die Trajektorie auf die stabile Mannigfaltigkeit zu projizieren. (3) Einmal auf der stabilen Mannigfaltigkeit, konvergiert die Trajektorie exponentiell auf den UPO — der positive Lyapunov-Exponent hilft dabei! Anwendungen: Herzrhythmus-Kontrolle, Laser-Stabilisierung.",
        difficulty = 5,
        funFact = null
    ),

    // ── BLOCK 8: Advanced Mineralogy ─────────────────────────────────────────

    // Question 36 – Mineral Thermodynamics and Geothermobarometry
    Question(
        categoryId = 2,
        questionText = "Geothermobarometrie nutzt das chemische Gleichgewicht zwischen koexistierenden Mineralen, um Druck und Temperatur der Mineralbildung zu rekonstruieren. Welche thermodynamische Basis liegt der Garnet-Biotit-Thermometrie zugrunde?",
        answerA = "Das Garnet-Biotit-Thermometer basiert auf dem Fe-Mg-Austauschgleichgewicht: Fe-Granat + Mg-Biotit ⇌ Mg-Granat + Fe-Biotit; die Gleichgewichtskonstante K_D = (X_Mg/X_Fe)_Grt / (X_Mg/X_Fe)_Bt ist temperaturabhängig (lnK_D = -ΔH°/RT + ΔS°/R); bei hohen Temperaturen nähert sich K_D → 1 (statistisches Gemisch), bei niedrigen Temperaturen segregiert Fe in Granat und Mg in Biotit",
        answerB = "Granat-Biotit-Thermometrie misst die Sauerstoff-Isotopen-Fraktionierung (δ¹⁸O) zwischen den Mineralen; da die Fraktionierungskoeffizienten temperaturabhängig sind (10³ ln α = A/T² + B), kann aus δ¹⁸O-Differenz die Gleichgewichtstemperatur berechnet werden",
        answerC = "Das Thermometer basiert auf der Ti-in-Biotit-Konzentration: Ti wird bei hohen Temperaturen bevorzugt in Biotit eingebaut; die Kalibrierungsfunktion T(°C) = 747 + 2030 × ln[Ti_Biotit] wurde empirisch aus Experimenten bestimmt und ist unabhängig vom koexistierenden Granat",
        answerD = "Granat-Biotit-Thermometrie nutzt die Gitterkonstanten beider Minerale: Wärmeausdehnung verändert die Gitterkonstanten nach ihrer Bildung; durch Rückrechnung der Gitterkonstanten auf Raumtemperatur aus den Hochtemperaturwerten kann die Bildungstemperatur rekonstruiert werden",
        correctAnswer = 0, // A
        explanation = "Das Garnet-Biotit-Thermometer (Ferry & Spear, 1978) ist ein Klassiker der Geothermobarometrie. Das Fe-Mg-Austauschgleichgewicht: (Fe)Grt + (Mg)Bt ⇌ (Mg)Grt + (Fe)Bt hat K_D = (Fe/Mg)_Grt / (Fe/Mg)_Bt. Die Temperaturabhängigkeit: ln K_D = -ΔH/(RT) + ΔS/R ≈ -2109/T(K) + 0,782 (nach Ferry & Spear). Da ΔH > 0, steigt K_D mit T — bei hoher T haben beide Minerale ähnlichere Fe/Mg-Verhältnisse. Mehrere Kalibrierungen existieren (Hodges & Spear 1982, Ganguly 1982, Berman 1990, etc.) mit leicht unterschiedlichen Koeffizienten. Anwendungsbereich: 300–700°C. Für Druck-Bestimmung kombiniert man mit dem GASP-Barometer (Granat-Al₂SiO₅-Feldspat-Plagioklas-Quarz-Gleichgewicht).",
        difficulty = 5,
        funFact = "Der Erdmantel kann mit solchen Geothermobarometern 'gelesen' werden: Xenolithe (Mantelbruchstücke in Kimberliten, den Trägern von Diamanten) zeigen durch Granat-Clinopyroxen-Thermobarometrie Bildungsdrücke von 50–60 kbar und Temperaturen von 1000–1400°C — direkt aus dem tiefen Mantel."
    ),

    // Question 37 – Polytypism in Minerals
    Question(
        categoryId = 2,
        questionText = "Polytypismus ist ein Phänomen, bei dem eine chemische Verbindung in mehreren Strukturvarianten existiert, die sich nur in der Stapelsequenz zweidimensionaler Schichten unterscheiden. Welche Minerale zeigen ausgeprägten Polytypismus, und welcher Mechanismus erzeugt die verschiedenen Polytypien?",
        answerA = "SiC ist das bekannteste anorganische Material mit Polytypismus (>250 bekannte Polytypien); Schichtsilikate (Glimmer, Chlorite) zeigen ebenfalls Polytypismus durch verschiedene Stapelsequenzen von TO- und TOT-Schichten; die verschiedenen Polytypien entstehen durch Fehlordnung während des Wachstums (Frank'scher Schraubendislokations-Mechanismus) oder durch epitaktisches Überwachsen",
        answerB = "Polytypismus ist ausschließlich ein Phänomen kubischer Spinelle und entsteht durch Besetzungsordnung der A- und B-Kationenplätze; die verschiedenen Polytypien entsprechen verschiedenen Kationen-Überstrukturschichten und werden durch Röntgenpulver-Beugung durch Überstruktur-Reflexe identifiziert",
        answerC = "Polytypismus tritt nur in synthetischen Materialien auf; in natürlichen Mineralen verhindert die thermodynamische Stabilisierung durch Spurenelemente die Existenz metastabiler Polytypien; Schichtsilikate wie Glimmer zeigen nur zwei polymorphe Formen (monokline und trikline Struktur)",
        answerD = "Polytypismus ist ein Spezialfall des Isomorphismus: Polytypische Strukturen haben identische chemische Zusammensetzung und fast identische physikalische Eigenschaften, unterscheiden sich aber in ihrer optischen Aktivität (Drehvermögen), die durch Röntgen-CD-Spektroskopie bestimmt wird",
        correctAnswer = 0, // A
        explanation = "Polytypismus (Begriff von Baumhauer, 1912) ist in Mineralen weit verbreitet: Glimmer (Muskovit, Biotit) zeigen 1M, 2M₁, 2M₂, 3T, 6H Polytypien durch verschiedene Stapelsequenzen der TO-T-Schichten (Tetraheder-Oktaheder-Tetraheder). Chlorite haben 1-layer bis 6-layer Polytypien. Die Entstehung: (1) Frank'scher Spiralwachstum an Schraubendislokationen erzeugt lange periodische Polytypien (Long Period Polytypes). (2) Fehlordnung beim Schichtwachstum erzeugt zufällige Stapelsequenzen (turbostratische Fehlordnung). (3) Thermodynamische Stabilität: Manche Polytypien sind bei bestimmten T/P metastabil. SiC hat >250 Polytypien von 2H bis 393R. Röntgenbeugung (Laue-Aufnahmen) und Transmissions-Elektronenmikroskopie identifizieren Polytypien. Polytypie-Informationen sind für Metamorphose-Studien wichtig: Glimmer-Polytypien können T/P-Geschichte anzeigen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 38 – Crystal Defects and Mineral Properties
    Question(
        categoryId = 2,
        questionText = "Farbzentren (F-Zentren) in Halit (NaCl) entstehen durch ionisierende Strahlung oder thermische Behandlung. Welcher atomistische Mechanismus liegt F-Zentren zugrunde, und warum färben sie das sonst farblose Mineral?",
        answerA = "F-Zentren (Farb-Zentren, aus dem Deutschen) sind Anionenleerstellen (Cl⁻-Leerstellen), die ein eingefangenes Elektron tragen; das Elektron in der Leerstellenpotenzial verhält sich wie ein Teilchen-in-einer-Box mit diskreten Energieniveaus; Lichtabsorption für elektrische Dipolübergänge zwischen diesen Niveaus liegt im sichtbaren Bereich (F-Bande in KCl bei ~550 nm), weshalb das Mineral sichtbares Licht absorbiert und Farbe zeigt",
        answerB = "F-Zentren sind Kationenleerstellen (Na⁺-Leerstellen) die lokale Ladungsüberschüsse erzeugen; die Färbung entsteht durch kolloidale Natriummetall-Ausscheidungen der Größe 10–100 nm, die durch Mie-Streuung selektiv Wellenlängen des sichtbaren Lichts streuen",
        answerC = "F-Zentren bestehen aus Cl₂⁻-Dimeren, die durch radiationsinduzierte Rekombination von Cl-Atomen gebildet werden; das HOMO-LUMO-Gap dieser Dimere liegt im sichtbaren Bereich; die Farbe hängt von der Konzentration der Cl₂⁻-Dimere ab, die proportional zur Strahlendosis ist",
        answerD = "F-Zentren sind Frenkel-Defekte (zwischengetretene Cl⁻-Ionen); die Zwischengitterionen stören das Madelung-Potential des Kristalls; die veränderte Bandstruktur verschmälert das Bandgap von 9 eV (farblos) auf ~2 eV (sichtbar), was zu Lichtabsorption und Färbung führt",
        correctAnswer = 0, // A
        explanation = "F-Zentren (Farbzentren) in Alkalihalogeniden sind ein klassisches Problem der Festkörperphysik (de Boer, 1937; Pohl, 1930s). Eine Cl⁻-Leerstellte in NaCl trägt ein eingefangenes Elektron. Das Elektron ist in der Leerstellenpotenzial-Kavität lokalisiert und verhält sich näherungsweise wie ein Teilchen-in-einer-Box oder genauer in einem Kastenpotenzial der Madelung-Umgebung. Quantenmechanische Niveaus: 1s-Grundzustand und 2p-angeregter Zustand, wobei die 1s→2p-Absorption ('F-Bande') im sichtbaren Bereich liegt. In KCl: F-Bande bei ~2,2 eV (564 nm, grün absorbiert → rot-violett Farbe). In NaCl: ~2,7 eV (blau absorbiert → gelbe Färbung bei hoher Defektdichte). Natürlicher violetter Fluorit (CaF₂) enthält F-Zentren durch Uranstrahlung — das klassische 'Fluor'-Mineral.",
        difficulty = 5,
        funFact = "Blauer Halit in natürlichen Salzvorkommen entsteht durch natürliche Strahlung über Millionen Jahre — F-Zentren als geologische Strahlendosimeter. Beim Erhitzen werden F-Zentren ausgeheilt und das Mineral wird wieder farblos."
    ),

    // Question 39 – Solid Solutions and Mixing Thermodynamics
    Question(
        categoryId = 2,
        questionText = "Mischkristalle (Solid Solutions) wie Olivin [(Mg,Fe)₂SiO₄] zeigen ideales oder nicht-ideales Mischungsverhalten. Wie wird nicht-ideales Mischungsverhalten thermodynamisch parametrisiert, und welche Auswirkungen hat es auf Mineralphasengrenzen?",
        answerA = "Nicht-ideale Mischung wird durch symmetrische oder asymmetrische Margules-Parameter (W_G, W_H, W_S, W_V) beschrieben; die exzessfreie Gibbs-Energie G_ex = W_G × X_A × X_B; positive W_G (positive Abweichung) führt zu Mischungslücken bei niedrigen T (Entmischung); negative W_G (negative Abweichung) stabilisiert die Mischung über den idealen Wert hinaus und verschiebt Phasengrenzen zu höheren Temperaturen",
        answerB = "Nicht-ideale Mischung in Silikaten wird ausschließlich durch das Debye-Hückel-Modell für ionische Interaktionen parametrisiert; Aktivitätskoeffizienten werden aus Madelung-Energie-Differenzen berechnet; positive Madelung-Differenz führt zu Mischungslücken, negative zur Ordnung",
        answerC = "Margules-Parameter werden experimentell nicht bestimmt, sondern ab initio durch DFT berechnet; der Interaktionsparameter W ist identisch mit der Differenz der DFT-Gesamtenergien W = E(AB) - ½[E(AA) + E(BB)] und ist immer positiv, weshalb alle Silikate positive Exzess-Enthalpien haben",
        answerD = "Nicht-ideales Mischungsverhalten in Mineralen wird durch den van-Laar-Formalismus beschrieben, der identisch mit der Margules-Theorie zweiter Ordnung ist; der Unterschied liegt nur in der Parameterisierung: Van-Laar nutzt molare Volumenverhältnisse statt empirischer W-Parameter",
        correctAnswer = 0, // A
        explanation = "Die thermodynamische Behandlung von Mineralmischkristallen verwendet Regular Solution-Theorie und ihre Erweiterungen. Für binäre Mischung (A_{1-x}B_x) mit symmetrischen Margules-Parametern: G_ex = W_G × (1-x) × x; G_total = (1-x)G_A + xG_B + RT[(1-x)ln(1-x) + x·ln(x)] + W_G(1-x)x. Bei W_G > 2RT: kritische Entmischung (Spinodale Entmischung oder Nukleation & Wachstum). Olivin [(Mg,Fe)₂SiO₄] ist näherungsweise ideale Lösung (W_G ~ 5 kJ/mol bei 1200°C), Amphibole und Pyroxene zeigen stärkere Nicht-Idealität. Phasengrenzen (Solvus, Consolute) werden direkt durch W-Parameter kontrolliert: T_critical = W_H/(2R) für symmetrische Lösung. Berman (1990) und Holland & Powell (2011) stellen umfangreiche Mineralthermodynamik-Datenbasen mit W-Parametern bereit.",
        difficulty = 5,
        funFact = null
    ),

    // Question 40 – Mineral Kinetics and Diffusion
    Question(
        categoryId = 2,
        questionText = "Diffusionsprofile in Mineralkörnern können als 'Mineralchronometer' für schnelle geologische Ereignisse genutzt werden. Welches Diffusionsmodell wird für Mg-Fe-Interdiffusion in Olivin verwendet, und welche zeitliche Auflösung ist erreichbar?",
        answerA = "Olivin-Diffusionschronometrie nutzt die analytische Lösung der 1D-Diffusionsgleichung für eine endliche Scheibe mit bekannten Randbedingungen (Crank 1975); der Diffusionskoeffizient D_Fe-Mg ist Arrhenius-artig: D = D₀ exp(-E_a/RT) mit E_a ≈ 220 kJ/mol und D₀ ≈ 10⁻¹⁰ m²/s; für vulkanische Olivinkristalle (T ~ 1200°C, Korngröße 0,5 mm) ergibt sich eine Auflösung von Stunden bis Tagen für Eruptionsprozesse",
        answerB = "Olivin-Diffusionszeitreihen werden durch U-Pb-Datierung von inkludierten Zirkonkörnern kombiniert mit Fe-Mg-Microprobe-Profilen erstellt; die zeitliche Auflösung ist durch die minimale U-Pb-Messungenauigkeit (~0,1 Ma) begrenzt, nicht durch die Diffusionskonstante",
        answerC = "Mg-Fe-Interdiffusion in Olivin wird durch Kirkendall-Effekt-Modelle beschrieben (asymmetrische Diffusivität: D_Mg >> D_Fe); die Chronometrie nutzt die Kirkendall-Porenbildung als zeitliches Marker — die Porendichte korreliert linear mit der Diffusionszeit",
        answerD = "Olivin-Diffusionschronometrie basiert auf Spaltspuren von Uran-Tochternukliden; die Spaltspurdichte nimmt mit Diffusionszeit ab, da Spaltspuren bei magmatischen Temperaturen ausheilen; die Abkühlrate kann aus dem Grad der Spaltspurauslöschung berechnet werden",
        correctAnswer = 0, // A
        explanation = "Costa & Chakraborty (2004) und Demouchy et al. (2006) entwickelten Olivin-Fe-Mg-Diffusionschronometrie. Der Diffusionskoeffizient D_Fe-Mg entlang der c-Achse: D = 10⁻¹⁰ × exp(-220000/(RT)) m²/s bei fO₂ = QFM. Die charakteristische Diffusionslänge L ≈ 2√(Dt) für typische vulkanische Bedingungen (T = 1200°C, D ≈ 10⁻¹⁷ m²/s): L = 20 μm nach 1 Tag, 100 μm nach 25 Tagen. EPMA-Mikroprofile mit 1–5 μm Auflösung erlauben die Rekonstruktion von Auflagerungszeiten im Magmareservoir (Wochen bis Jahre) oder von Mischungsereignissen (Tage bis Wochen) vor Vulkanausbrüchen. Diese Methode war entscheidend für die Rekonstruktion der Vorgeschichte des Pinatubo-Ausbruchs (1991) und der Yellowstone-Vulkansysteme.",
        difficulty = 5,
        funFact = "Diffusionsprofile in Olivin-Kristallen zeigten, dass der Ausbruch des Merapi 2010 durch Magma-Intrusion nur ~2 Monate vor dem Hauptausbruch ausgelöst wurde — eine potentiell lebensrettende Erkenntnis für Frühwarnsysteme."
    ),

    // ── BLOCK 9: Neuromodulation ──────────────────────────────────────────────

    // Question 41 – Deep Brain Stimulation Mechanism
    Question(
        categoryId = 2,
        questionText = "Tiefe Hirnstimulation (TBS/DBS) des Nucleus subthalamicus (STN) ist Goldstandard-Therapie für fortgeschrittenes Parkinson. Obwohl TBS seit ~30 Jahren klinisch eingesetzt wird, ist der Wirkmechanismus noch diskutiert. Welche Hypothesen sind aktuell am stärksten unterstützt?",
        answerA = "TBS aktiviert ausschließlich inhibitorische GABAerge Interneurone im STN, die dann glutamaterge STN-Projektionsneurone hemmen; das Ergebnis ist ein funktioneller 'Knockout' des STN, identisch mit einer Läsion (Pallidotomie); alle TBS-Effekte sind daher auf diese lokale Inhibition zurückzuführen",
        answerB = "TBS des STN wirkt durch: (1) Desynchronisation pathologischer beta-Oszillationen (13–30 Hz) im Basalganglien-Kortex-Netz, die für bradykinetische Parkinson-Symptome verantwortlich sind; (2) Antidrome Aktivierung von kortikospinalen Fasern und Aktivierung kortikaler Netzwerke; (3) Neurotransmitter-Modulation (Dopamin, Glutamat) im Stimulationsfeld; alle drei Mechanismen tragen synergistisch bei",
        answerC = "TBS wirkt ausschließlich durch Neuroplastizität: Chronische Stimulation induziert LTP (Long-Term Potentiation) in den hypofunktionalen dopaminergen Projektionen aus der SNc (Substantia nigra pars compacta); die therapeutische Wirkung tritt daher erst nach Wochen ein, nicht sofort",
        answerD = "Der Mechanismus ist vollständig aufgeklärt: TBS blockiert spannungsabhängige Na⁺-Kanäle im STN durch Überaktivierung (depolarization block); der STN feuert initial mit hoher Frequenz und geht dann in inaktiven Block über; dieser Block simuliert die dopaminerge Hemmung des STN in gesunden Individuen",
        correctAnswer = 1, // B
        explanation = "Der DBS-Wirkmechanismus beim Parkinson ist tatsächlich multifaktoriell (Lozano et al., 2019, Nat Rev Neurosci): (1) Beta-Desynchronisation: Parkinson-Patienten haben pathologisch erhöhte synchrone beta-Aktivität (13–30 Hz) in STN-Kortex-Kreisen, die Bewegungsinitiation hemmt. TBS interferiert mit diesen Oszillationen und desynchronisiert das Netzwerk. (2) Antidrome Aktivierung: TBS aktiviert rückwärts (antidrom) den kortiko-subthalamischen Trakt und moduliert kortikale Schaltkreise. (3) Lokale Wirkungen: Depolarization block von STN-Neuronen bei hohen Frequenzen (130 Hz Standard), Aktivierung inhibitorischer Interneurone, Glutamatfreisetzung downstream. (4) Netzwerkeffekte: Veränderungen der Aktivität im Globus pallidus und Thalamus. Der schnelle Wirkeintritt (Sekunden bis Minuten) spricht gegen reinen Plastizitäts-Mechanismus.",
        difficulty = 5,
        funFact = null
    ),

    // Question 42 – Transcranial Magnetic Stimulation
    Question(
        categoryId = 2,
        questionText = "Repetitive Transkranielle Magnetstimulation (rTMS) kann kortikale Erregbarkeit langfristig verändern. Welche Stimulationsparadigmen induzieren langfristige Potenzierung (LTP-ähnliche) versus langfristige Depression (LTD-ähnliche) Effekte, und welche molekularen Mechanismen liegen zugrunde?",
        answerA = "Hochfrequenz-rTMS (10–20 Hz) induziert LTP-ähnliche Erregbarkeitssteigerung (Motor Evoked Potential MEP-Erhöhung); Niederfrequenz-rTMS (1 Hz) induziert LTD-ähnliche Erregbarkeitsminderung; der Mechanismus ist NMDA-Rezeptor-abhängige synaptische Plastizität: Hebbian-artige Koinzidenz-Detektion durch konsistente Depolarisation der Postsynapse durch rTMS-induzierte Aktionspotenziale",
        answerB = "rTMS wirkt ausschließlich über GABA-erge Interneurone: Alle Frequenzen erhöhen GABA-Freisetzung, aber hohe Frequenzen aktivieren zusätzlich GABA-B-Autorezeptoren, die GABAerge Inhibition vermindern; das Nettoresultat ist scheinbare Erregbarkeitssteigerung bei hohen Frequenzen",
        answerC = "Die Frequenzabhängigkeit ist entgegengesetzt zu anderen Plastizitätsformen: Bei rTMS induziert 1 Hz LTP und 10 Hz LTD, weil die Stimulation-Antwort-Kopplung von der Kalzium-Signalkaskade über den Calcineurin-Weg (LTP) versus PKA-Weg (LTD) abhängt",
        answerD = "rTMS verändert kortikale Erregbarkeit ausschließlich durch epigenetische Modifikation: 10-Hz-Stimulation methyliert H3K4 an BDNF-Promotoren (Erregbarkeitssteigerung); 1-Hz-Stimulation demethyliert H3K4 (Erregbarkeitsminderung); dieser Prozess dauert Stunden, weshalb sofortige MEP-Änderungen kein Zeichen echter Plastizität sind",
        correctAnswer = 0, // A
        explanation = "Das Standard-Paradigma (Chen et al., 1997; Maeda et al., 2000): 10 Hz rTMS → MEP-Erhöhung (bis 150–200% Baseline) nach 10 min Stimulation; 1 Hz rTMS → MEP-Verminderung (bis 60–80% Baseline). Das Bienenstock-Cooper-Munro-Modell (BCM) und die NMDA-Rezeptor-Theorie: Die Plastizitätsschwelle (modification threshold θ_M) hängt von der Kalziumkonzentration ab. Hohe Calcium-Spikes (hohe Frequenz) → CaM-Kinase-II-Aktivierung → LTP. Niedrige, anhaltende Ca²⁺-Erhöhung (niedrige Frequenz) → Calcineurin/PP1-Aktivierung → LTD. Wichtig: Theta-Burst-Stimulation (TBS) — kurze 50-Hz-Bursts mit 5 Hz Wiederholungsrate — induziert LTP-ähnliche Effekte mit nur 190 statt 3000 Pulsen. Continuous TBS (cTBS) → LTD-artig; intermittent TBS (iTBS) → LTP-artig.",
        difficulty = 5,
        funFact = "Die FDA hat TBS für therapieresistente Depression (TRD) zugelassen. Insbesondere 10-Hz-Stimulation des linken dorsolateralen präfrontalen Kortex (DLPFC) und iTBS zeigen klinische Wirksamkeit als Alternative zu Elektrokrampftherapie."
    ),

    // Question 43 – Closed-Loop Neurostimulation
    Question(
        categoryId = 2,
        questionText = "Closed-Loop-Neurostimulation passt die Stimulationsparameter in Echtzeit an die gemessene neuronale Aktivität an. Welche Überlegenheit gegenüber Open-Loop-Stimulation wurde experimentell bei Parkinson-DBS gezeigt, und welche technischen Herausforderungen bestehen?",
        answerA = "Closed-Loop-DBS basiert auf Messung von Local Field Potentials (LFPs) im STN als biomarker; bei Anstieg der beta-Power (>30% über Threshold) wird DBS aktiviert; Studien zeigen 25–40% Energieeinsparung, reduzierte Nebenwirkungen und vergleichbare oder bessere motorische Kontrolle; technische Herausforderungen: Stimulations-Artefakt-Unterdrückung bei gleichzeitiger Messung und Detektion, latenzarme Verarbeitung (<5 ms), adaptive Algorithmen für sich verändernde Netzwerkzustände",
        answerB = "Closed-Loop-DBS adaptiert die Stimulationsfrequenz kontinuierlich von 10 bis 180 Hz basierend auf EMG-Signalen der kontralateralen Hand; Studien zeigen 3-fach höhere motorische Leistung verglichen mit Standard 130-Hz-DBS; die technische Hauptherausforderung ist die EMG-Elektroden-Implantation zusätzlich zur DBS-Elektrode",
        answerC = "Closed-Loop-Systeme messen kortikale EEG-Signale transkutan und stimulieren den STN wenn alpha-Wellen (8–12 Hz) die Beta-Aktivität übersteigen; dies induziert therapeutischen Dopamin-Burst aus der Substantia nigra; die Herausforderung ist die geringe Signal-Rausch-Ratio transkutaner EEG-Signale bei implantierten Patienten",
        answerD = "Closed-Loop-Neurostimulation ist ausschließlich für Epilepsie (NeuroPace RNS-System) klinisch etabliert; für Parkinson gibt es keine zugelassenen Closed-Loop-Systeme, da die therapeutischen Biomarker (z.B. beta-Oszillationen) zu variabel zwischen Patienten sind",
        correctAnswer = 0, // A
        explanation = "Little et al. (2013, Ann Neurology) und Rosa et al. (2015) zeigten in kontrollierten Studien: Adaptives (Closed-Loop) DBS unter beta-LFP-Feedback lieferte 27–40% bessere Symptomkontrolle verglichen mit Standard-DBS bei gleicher Stimulationsenergie, oder equivalente Symptomkontrolle mit 56% weniger Energie. Der Biomarker: Beta-LFP-Power (13–30 Hz) aus der DBS-Elektrode selbst korreliert negativ mit motorischer Kontrolle — bei Bewegungsintention sinkt die Beta-Power. Das Closed-Loop-System detektiert Beta-Erhöhung und schaltet Stimulation ein. Hauptherausforderungen: (1) Stimulations-Artefakt überlagert das LFP bei gemeinsamer Stim/Record-Elektrode (gelöst durch Blanking und Artefakt-Entfernung), (2) Patient-spezifische Schwellenwerte, (3) Long-term Drift des Biomarkers.",
        difficulty = 5,
        funFact = null
    ),

    // Question 44 – Focused Ultrasound Neuromodulation
    Question(
        categoryId = 2,
        questionText = "Fokussierter Ultraschall (FUS) kann nicht-invasiv tiefe Hirnregionen stimulieren oder läsionieren. Welche physikalischen Mechanismen vermitteln die neurobiologischen Effekte von niedrig-intensivem therapeutischem Ultraschall (LIFU)?",
        answerA = "LIFU wirkt durch direkte thermische Denaturierung von Membranproteinen: Die lokale Temperaturerhöhung (0,1–0,5°C) in der fokalen Zone verändert die Proteinkonformation von Na⁺/K⁺-ATPasen und ionotropen Rezeptoren reversibel; dieser reversible Konformationsübergang moduliert die neuronale Erregbarkeit",
        answerB = "LIFU-Neuromodulation wird durch mechanische Wirkung (Strahlungsdruck und akustischer Mikro-Streaming) auf Lipidmembranen vermittelt, die Konformationsänderungen von Ionenkanälen (insbesondere mechanosensitiven Kanälen PIEZO1/2 und TRP-Kanälen) induzieren; Kavitationseffekte (stabile Kavitation, nicht inertiale) können zusätzlich die Membranpermeabilität modulieren",
        answerC = "LIFU bewirkt ausschließlich lokal verstärkte Endozytose: Ultraschalldruck induziert massenhafte Vesikelbildung an der neuronalen Membran, was Neurotransmitter in die Synapse freisetzt; die neuronale Aktivierung ist rein cholinerg und wird durch Atropin vollständig blockiert",
        answerD = "Der ausschließliche Mechanismus ist Sonotransfektion: Ultraschallwellen öffnen vorübergehend die Zellmembran (Elektroporation-ähnlich) und ermöglichen den Eintritt von Kalzium-Ionen aus dem Extrazellulärraum; der Kalziumeinstrom aktiviert Calmodulin-abhängige Kinasen und löst so neuronale Aktivierung aus",
        correctAnswer = 1, // B
        explanation = "Der Mechanismus von LIFU-Neuromodulation ist komplex und noch nicht vollständig aufgeklärt (Tyler et al., 2008; Legon et al., 2014; Deffieux et al., 2013). Aktuelle Evidenz: (1) Mechanische Wirkung: Akustischer Strahlungsdruck (Acoustic Radiation Force) erzeugt Mikro-Auslenkungen der Membran (~nm-Bereich). Dies aktiviert mechanosensitive Kanäle (PIEZO1, TRP-V4, MscS-ähnliche). (2) Thermische Wirkung: Minimal bei LIFU (ΔT < 0,1°C); reicht nicht zur Protein-Denaturierung, aber könnte temperatur-sensitive Kanäle (TRP-V1) modulieren. (3) Stabile Kavitation: Existierende Mikroblasen im Gewebe schwingen mit und erzeugen lokalen Fluss (Mikro-Streaming); dies kann Ionenkanäle durch Scherkräfte aktivieren. (4) Intramembranöse Kavitation (Krasovitski-Muller-Sonttag-Engel-Modell): Ultraschall erzeugt Kavitation in Nanoblasen zwischen Lipidschichten der Membran.",
        difficulty = 5,
        funFact = "HIFU (High Intensity Focused Ultrasound) wird bereits klinisch für essenziellen Tremor und Parkinson-Tremor eingesetzt — durch thermische Läsion des Nucleus ventralis intermedius thalami (Vim). Völlig nicht-invasiv: kein Schnitt, keine Elektrode."
    ),

    // Question 45 – Vagus Nerve Stimulation
    Question(
        categoryId = 2,
        questionText = "Vagusnervstimulation (VNS) ist klinisch zugelassen für therapieresistente Epilepsie und Depression. Welche neuronalen Kreise vermitteln den antiepileptischen Effekt, und welche Rolle spielt der Locus coeruleus?",
        answerA = "VNS wirkt antiepileptisch ausschließlich durch direkte hemmende Beeinflussung des Hippocampus über den Nucleus tractus solitarius (NTS) → parahippocampalen Kortex-Schaltkreis; Noradrenalin aus dem Locus coeruleus (LC) hat keine Rolle — LC-Läsionen heben den VNS-Effekt nicht auf",
        answerB = "VNS aktiviert vagale Afferenzen → NTS → LC → noradrenerge Projektion in Thalamus, Kortex und Hippocampus; Noradrenalin-Freisetzung aus dem LC ist wesentlich für den antiepileptischen Effekt (LC-Läsionen reduzieren VNS-Wirksamkeit in Tiermodellen); zusätzlich: NTS → Parabrachial-Nukleus → Raphekerne → serotonerge Modulation; beide Aminüberträgersysteme synergisieren",
        answerC = "VNS wirkt über anti-inflammatorische Mechanismen: Vagus-Aktivierung hemmt systemische Inflammation durch den Cholinergic Anti-Inflammatory Pathway (CAP); TNF-α und IL-6-Reduktion erklärt den antiepileptischen Effekt, da Neuroinflammation ein bekannter Epilepsietrigger ist",
        answerD = "Der Mechanismus ist vollständig auf GABA zurückzuführen: VNS erhöht GABA-Spiegel im gesamten Kortex durch Aktivierung des GABA-synthase-exprimierenden Nucleus tractus solitarius; dieser Mechanismus erklärt sowohl antiepileptische als auch antidepressive VNS-Effekte",
        correctAnswer = 1, // B
        explanation = "Die neuronale VNS-Schaltkreis-Anatomie: Vagale Afferenzen (80% sensorisch, Aδ und C-Fasern) → NTS (primäre Relaisstation in der Medulla) → multiple Projektionen: zum LC (Noradrenalin), zu den Raphekernen (Serotonin), zum Parabrachial-Nukleus, über Thalamus in den Kortex. Der LC-Mechanismus: Krahl et al. (1998) zeigten, dass 6-OHDA-Läsion des LC die antiepileptische Wirksamkeit von VNS in Ratten um ~50% reduziert. Noradrenalin aus dem LC moduliert kortikale Erregbarkeit über α₂-Adrenozeptoren. Zusätzlich: vagale Aktivierung beeinflusst den Hippocampus über NTS → dorsalen Vaguskern → paraventrikulären Hypothalamus-Kreislauf. Klinisch: VNS-Response (>50% Anfallsreduktion) in ~50% nach 1 Jahr, steigt auf ~60% nach 5 Jahren.",
        difficulty = 5,
        funFact = null
    ),

    // ── BLOCK 10: Quantum Biology ─────────────────────────────────────────────

    // Question 46 – Photosynthetic Quantum Coherence
    Question(
        categoryId = 2,
        questionText = "Fleming et al. (2007, Nature) beobachteten langanhaltende quantenmechanische Kohärenz in Femtosekunden-Spektroskopie des FMO-Komplexes (Fenna-Matthews-Olson) grüner Schwefelbakterien bei 77K. Welche Interpretation dieser Befunde ist heute (post-2010) als konsistent mit allen Daten anerkannt?",
        answerA = "Die 2D-Spektroskopie-Kreuzpeaks im FMO zeigen beating-Signale, die eindeutig rein elektronischen Quantenkohärenz-Ursprungs sind; der Energietransfer erfolgt im Wesentlichen durch quantenmechanisches Tunneln zwischen allen Bacteriochlorophyll-Molekülen gleichzeitig, was die nahezu perfekte Effizienz (~95%) erklärt",
        answerB = "Die beating-Signale stammen aus einer Mischung von rein vibronischen Kohärenzen (gekoppelte elektronisch-vibronische Zustände) und möglicherweise rein vibratorischen Zuständen; bei physiologischer Temperatur (300K) ist langanhaltende rein elektronische Kohärenz sehr unwahrscheinlich aufgrund schneller Dekohärenz durch die Proteinumgebung; die hohe Transfereffizienz kann auch durch incoherent Förster/Redfield-Mechanismen erklärt werden",
        answerC = "Quantenkohärenz im FMO ist ein Artefakt der niedrigen Messtemperatur (77K) und der künstlichen 2D-Spektroskopie-Anregung; bei physiologischen Bedingungen (37°C, natürliche Sonnenlichteinstrahlung) gibt es keine Kohärenz, und Photosynthese-Effizienz basiert ausschließlich auf klassischer Boltzmann-statistischer Energiewanderung",
        answerD = "Die Kohärenz im FMO komplexiert das Konzept der Effizienz vollständig: Die quantenmechanische Überlagerung aller möglichen Energietransferpfade ('Quanten-Parallelismus') ergibt eine exponentielle Beschleunigung des Transfers gegenüber klassischen Mechanismen, was den evolutionären Ursprung der Photosynthese erklärt",
        correctAnswer = 1, // B
        explanation = "Die Fleming-Daten (Engel et al., 2007) lösten eine Kontroverse aus. Neuere Experimente und Theorie (Christensson et al., 2012; Plenio & Huelga, 2008; Kolli et al., 2012) zeigen: Die beating-Signale im FMO haben mehrere Ursprünge. (1) Vibronische Kohärenz (Mischung elektronischer und vibronischer Zustände) ist das wahrscheinlichste: Wenn vibronische Energien von Chlorophyll-Moden resonant mit elektronischen Energielücken sind, entstehen long-lived vibronische Kohärenzen. (2) Rein vibratorische Kohärenz (klassisch interpretierbar) trägt ebenfalls bei. (3) Rein elektronische Kohärenz ist bei 300K wahrscheinlich sehr kurzlebig (<100 fs). Wichtig: Die Transfereffizienz (~95%) ist nicht zwingend auf Kohärenz angewiesen — Redfield-Theorie erklärt sie auch klassisch. Der Konsens: Quantenkohärenz existiert im FMO, aber ihre funktionelle Relevanz für die Effizienz ist unklar.",
        difficulty = 5,
        funFact = "Das 'Quantum Biology'-Feld war nach dem Fleming-Paper 2007 explodiert — hunderte Papers behaupteten Quantenoptimierung. Eine nüchternere Revision nach 2013 zeigte, dass viele Signale vibronischer Natur sind. Die Frage 'Nutzt Photosynthese Quantenmechanik?' bleibt aktiv diskutiert."
    ),

    // Question 47 – Avian Magnetoreception
    Question(
        categoryId = 2,
        questionText = "Der Kryptochrom-Radikal-Paar-Mechanismus (RPM) für den magnetischen Kompass von Zugvögeln ist das führende biophysikalische Modell. Wie funktioniert der RPM, und welche experimentellen Befunde stützen ihn?",
        answerA = "Blaues Licht (360–500 nm) absorbiert in Kryptochrom im Auge → Elektron-Transfer von Tryptophan-Triade zu FAD → Radikalpaar [FAD•⁻ ... Trp•⁺]; da eines der Radikale magnetisch anisotrop ist, beeinflusst das Erdmagnetfeld die Singulett/Triplett-Interkonversionrate und damit die Reaktionsprodukt-Verhältnisse; dies ist detektierbar als unterschiedliche Reaktivität in 'Parallel' vs. 'Senkrecht zum Magnetfeld'-Ausrichtungen; Stützen: RF-Störung (1,4 MHz, resonant mit Elektronenspin-Präzession) blockiert den Magnetkompass, aber keine klassische Magnetit-basierte Störung",
        answerB = "Magnetit (Fe₃O₄)-Nanopartikel in Schnabelzellen dienen als Kompassnadel; der RPM ist ein alternatives Modell das bei Zugvögeln nicht relevant ist; Stützen: Das Magnetoreceptor-Gen MagR (CG8198 in Drosophila) kodiert ein Magnetit-bindendes Protein, das in Vogelaugen exprimiert ist",
        answerC = "Der RPM erfordert verschränkte Elektronenpaare zwischen benachbarten Kryptochrom-Molekülen; die Quantenverschränkung überlebt bei 37°C wegen des abgeschirmten hydrophoben Kerns der Cryptochrom-Proteinstruktur; dies wurde durch Delayed-Fluorescence-Spektroskopie an isolierten Kryptochromen bestätigt",
        answerD = "Kryptochrome dienen als passive Magnetfeld-Sensoren ohne Radikalpaar; das Erdmagnetfeld verändert durch Faraday-Induktion die Leitfähigkeit des Cryptochrom-Redoxzentrums; die resultierende bioelektrische Signalveränderung wird über den N. trigeminus zum Gehirn geleitet",
        correctAnswer = 0, // A
        explanation = "Das Ritz-Schulten-Modell (Ritz et al., 2000, Biophys J): Cryptochrome 1a im Vogelauge (Photorezeptorzellen des magnetosensitiven Bereichs) zeigen nach Lichtabsorption Radikalpaar-Bildung: [FAD•⁻ ... Trp•⁺] (Tryptophan-Triade der Kryptochrom). Beide Radikale tragen je einen ungepaarten Elektronspin. Das Erdmagnetfeld (~50 μT) beeinflusst die hyperfeine-Wechselwirkung, die die Singulett↔Triplett-Interkonversion moduliert. Verschiedene S/T-Produktverhältnisse werden durch nachgeschaltete Chemie in ein neuronales Signal umgewandelt. Kritische Experimente (Ritz et al., 2004, Nature): Applikation von RF-Feldern bei der Lamorfrequenz für Elektronen (~1,4 MHz für 50 μT-Felder) stört den Rotkehlchen-Kompass — konsistent mit RPM, inkonsistent mit Magnetit. CRY4 wurde 2018 als Kandidat identifiziert (Günther et al., Curr Biol).",
        difficulty = 5,
        funFact = null
    ),

    // Question 48 – Quantum Tunneling in Enzymes
    Question(
        categoryId = 2,
        questionText = "Enzymkatalyse durch Protonenübertragung kann quantenmechanisches Tunneln involvieren. Welche experimentellen Signaturen unterscheiden Tunneln von klassisch thermisch aktivierter Übertragung, und in welchen Enzymen ist Tunneln gut belegt?",
        answerA = "Quantentunneln bei Protonen-Transfer in Enzymen wird durch primäre kinetische Isotopen-Effekte (KIE = k_H/k_D) von kH/kD >> 7 (klassisches Limit) nachgewiesen; bei Tunneln zeigen KIEs Werte von 10–80 und eine schwache Temperaturabhängigkeit (ΔE_a zwischen H und D ist kleiner als klassisch erwartet); gut belegte Beispiele: Alkohol-Dehydrogenase (ADH), Dihydrofolat-Reduktase (DHFR), Aromatische Amin-Dehydrogenase (AADH)",
        answerB = "Tunneln in Enzymen ist an einer vollständigen Temperaturunabhängigkeit der Reaktionsrate erkennbar: k(T) = const für alle T > 100 K; klassisch thermisch aktivierte Reaktionen zeigen immer eine Arrhenius-artige T-Abhängigkeit; Tunneln wurde in Ribonukleosid-Diphosphat-Reduktase (RNR) für Elektronen-Tunneln über 35 Å nachgewiesen",
        answerC = "Tunneln in Enzymen wird durch Kinetic Isotope Competition (KIC) nachgewiesen: Wenn ein Enzym gleichzeitig H und D als Substrat hat, bevorzugt es H nicht aufgrund von KM-Unterschieden, sondern ausschließlich aufgrund der größeren Tunnelwahrscheinlichkeit; KIC-Werte >100 gelten als Tunnelindikator",
        answerD = "Der sicherste Nachweis für Tunneln ist das Fehlen der Anpassung an das Bell-Tunnelkorrekturfaktor-Modell: Bei echtem Tunneln versagt die Bell-Gleichung K_Bell = 1 + u²/24 (u = hν*/kBT); wenn K_Bell > 5 ist, ist das System im Tunnelregime; Alkoholdehydrogenase zeigt K_Bell = 47, was eindeutig auf Tunneln hinweist",
        correctAnswer = 0, // A
        explanation = "Die experimentellen Signaturen für Proton-Tunneln in Enzymen (Klinman & Kohen, 2013; Scrutton et al., 2012): (1) Primärer KIE k_H/k_D: Klassisches Maximum (aus Transition-State-Theorie) ~ 7 bei 25°C. Tunneln überschreitet diesen Wert deutlich: ADH aus Thermoanaerobacter brockii: kH/kD ~ 17; AADH: kH/kD ~ 55. (2) Schwache T-Abhängigkeit des KIE: Bei reinem Tunneln ist ΔE_a(H-D) = E_a(D) - E_a(H) → 0 (beide tunneln gleich, nur Tunnel-Amplitude unterscheidet sich); klassisch: ΔE_a ≈ 1,2 kJ/mol. (3) Breakpoint in Arrhenius-Plot bei niedriger T: Tunneln wird dominant, die scheinbare Aktivierungsenergie sinkt abrupt. Für Elektronen-Tunneln: RNR überträgt Elektronen über 35 Å in ms-Zeitskala über Tryptophan-Tyrosin-Kette — nur durch Superaustausch-Tunneln möglich.",
        difficulty = 5,
        funFact = "Femtosekundenkinetik im aktiven Zentrum der Dihydrofolat-Reduktase (DHFR) zeigte, dass Proteindynamik (Konformationsfluktuationen) die Tunnelrate moduliert — ein Protein 'schüttelt' den Tunneldonor und -akzeptor in optimalen Abstand. Dies zeigt: Tunneln ist keine passive Eigenschaft, sondern aktiv durch Proteinstruktur optimiert."
    ),

    // Question 49 – Olfaction Vibrational Theory
    Question(
        categoryId = 2,
        questionText = "Luca Turins Vibrations-Theorie des Geruchs postuliert, dass Geruchsrezeptoren Molekülvibrationen detektieren, nicht nur molekulare Form. Welche experimentellen Befunde stützen und welche widerlegen diese Hypothese?",
        answerA = "Die Vibrationstheorie wird durch zwei Befunde gestützt: (1) Isotopenpaare (H vs. D) riechen unterschiedlich, obwohl sie identische 3D-Form haben; (2) Verbindungen mit ähnlichen IR-Spektren (z.B. Boronsäure-Derivate) riechen ähnlich; Widerlegung: Franco et al. (2011) zeigten in Drosophila, dass deuterierte Verbindungen wie undeuterierte riechten; Block et al. (2015) fanden in Menschen-Studien keine konsistenten Isotopeneffekte — das Feld ist hochkontrovers",
        answerB = "Die Vibrationstheorie ist vollständig widerlegte: Strukturanalyse von OR51E2 und anderen Olfaktionsrezeptoren zeigen ausschließlich stereoselektive Bindungstaschen; Turin konnte nie erklären, wie ein G-Protein-gekoppelter Rezeptor Elektronentunneln messen sollte; alle Isotopen-Geruchs-Unterschiede wurden auf Verunreinigungen zurückgeführt",
        answerC = "Die Vibrationstheorie gilt als vollständig bestätigt: 2015 zeigten blind-getestete Drosophila-Experimente, dass deuterierte Muskatrosen-Duftstoffe von Fliegen von protonierten unterschieden werden konnten; quantenmechanische Berechnungen zeigen, dass TAAR-Rezeptoren einen optimalen Tunnelspalt für olfaktorisches Elektronentunneln haben",
        answerD = "Turin's Theorie erklärt ausschließlich metall-ähnliche Gerüche (Osmium, Bor); für alle organischen Verbindungen gilt die Shape-Theorie; der Mechanismus für metallischen Geruch ist Elektronen-Transfer vom Metall auf den Rezeptor — ein inverser Quanten-Effekt, der keine Vibrationsdetektion erfordert",
        correctAnswer = 0, // A
        explanation = "Die Geruchs-Vibrations-Theorie ist wissenschaftlich kontrovers: BEFÜRWORTEND: Turin (1996, Chem Senses) und Haffenden et al. (2001): Geschwefelte Verbindungen mit ähnlichen C-S-Streckschwingungen (700–800 cm⁻¹) riechen nach Fauleiern. Gane et al. (2013, PLOS ONE): Humane Probanden konnten deuteriertes und undeuteriertes Benzaldehyd (Bittermandelgeruch) unterscheiden (~75% korrekt, p<0,05). WIDERSPRECHEND: Franco et al. (2011, PLOS ONE): Deuterierte Duftstoffe aktivieren Drosophila-Rezeptoren fast identisch wie H-Analoga (Fliegen zeigen keine Unterscheidung). Vosshall & Block (2011): Mehrere Replikationsversuche schlugen fehl. Strukturell: GPCR-Olfaktionsrezeptoren haben keine offensichtliche Elektronentunnelstruktur. Der Konsens: Hauptmechanismus = Shape-Theorie; ob Vibration einen Beitrag leistet, ist offen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 50 – Quantum Effects in DNA
    Question(
        categoryId = 2,
        questionText = "Quanteneffekte in der DNA-Replikation und -Mutation wurden vorgeschlagen. Welche quantenmechanischen Effekte in der DNA-Chemie sind experimentell belegt, und welche Rolle spielen Tautomere-Übergänge für Mutationen?",
        answerA = "Proton-Tunneln zwischen Basenpaar-Komplementärbasen (Watson-Crick A:T → Hoogsteen A:T Tautomere) ist ein rein klassisch thermisch aktivierter Prozess; Quantentunneln tritt in DNA nicht auf, da Wasserstoffbrücken in wässriger Lösung zu schnell durch Bulk-Wasser-Austausch gestört werden; der einzige Quanteneffekt in DNA ist der photoinduzierten Cyclobutan-Pyrimidin-Dimer-Bildung als Tunnelprozess",
        answerB = "Proton-Tunneln zwischen A-T und G-C-Basenpaaren erzeugt seltene Tautomere (z.B. G*:C → G:C* mit enol/imino-Tautomere); NMR-Studien von Löwdin (1963) und neuere QM/MM-Simulationen (Pérez et al. 2010; Brovarets & Hovorun 2017) zeigen: Tautomere-Konzentrationen liegen bei 10⁻⁴ bis 10⁻⁷; wenn DNA-Polymerase einen solchen tautomeren Zustand einliest, kann es zu Transversionen oder Transitionen kommen — ein quantenmechanischer Beitrag zur spontanen Mutationsrate",
        answerC = "Quantentunneln in DNA ist vollständig auf Elektronen-Transfer beschränkt; Elektronentunneln entlang der pi-gestapelten DNA-Basen über Distanzen von 10–20 Å ist gut belegt (Giese et al., 2001); Protonentunneln wurde experimentell ausgeschlossen, da H-D-Isotopeneffekte in DNA-Replikation nicht messbar sind",
        answerD = "Der dominante Quanteneffekt in DNA-Schäden ist Kohärenz-vermittelte Energietransfer nach UV-Absorption: Exzitonische Kohärenz auf der Femtosekunden-Zeitskala kanalisiert Energie aus UV-Absorption in reparierbare versus irreparable Schadenwege; ohne Kohärenz wäre die Mutationsrate durch UV 10³-fach höher",
        correctAnswer = 1, // B
        explanation = "DNA-Tautomere und Quantentunneln: Per-Olov Löwdin postulierte 1963 (Rev Mod Phys), dass Proton-Tunneln zwischen den Basenpaaren seltene Tautomere erzeugt, die Mutationen verursachen könnten. Moderne QM/MM-Simulation: Tautomere-Gleichgewicht für G:C → G*:C* (wobei * = enol/imino-Form): K_taut ~ 10⁻⁴ bis 10⁻⁷ bei 37°C. Sowohl klassische Aktivierung als auch Tunneln tragen bei. NMR-Experimente (Kimsey et al., 2015, Nature): Direkte Beobachtung von seltenen tautomeren Zuständen in doppelsträngiger DNA durch CEST (Chemical Exchange Saturation Transfer) NMR mit Konzentration ~5 × 10⁻⁵ für Watson-Crick A:T → Hoogsteen A:T Übergang. DNA-Polymerase liest gelegentlich tautomere Basen ein und erzeugt so prämutagene Läsionen. Hinweis: Elektronen-Tunneln entlang DNA-pi-Stapeln ist ebenfalls gut belegt (Holmium-DNA, 2001) und relevant für DNA-Oxidationsschäden.",
        difficulty = 5,
        funFact = "Löwdins Quantenmutations-Hypothese von 1963 war ihrer Zeit 50 Jahre voraus. Erst moderne Femtosekundenspektroskopie, QM/MM-Simulationen und CEST-NMR konnten tatsächlich Tautomere in doppelsträngiger DNA direkt nachweisen."
    )

)
