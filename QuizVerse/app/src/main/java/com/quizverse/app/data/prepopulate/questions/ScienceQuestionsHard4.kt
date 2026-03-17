package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsHard4(): List<Question> = listOf(

    // Question 1 – Spectroscopy: UV-Vis
    Question(
        categoryId = 2,
        questionText = "Das Lambert-Beer-Gesetz lautet A = ε·c·d. Was beschreibt der molare Extinktionskoeffizient ε?",
        answerA = "Die Wellenlänge des absorbierten Lichts in nm",
        answerB = "Die Absorption einer 1 molaren Lösung bei 1 cm Schichtdicke",
        answerC = "Den pH-Wert der Messlösung",
        answerD = "Die Fluoreszenzquantenausbeute der Substanz",
        correctAnswer = 1, // B
        explanation = "Der molare Extinktionskoeffizient ε (in L·mol⁻¹·cm⁻¹) beschreibt, wie stark eine Substanz Licht einer bestimmten Wellenlänge absorbiert. Hohe ε-Werte (>10.000) zeigen starke Absorber an. Bei π→π*-Übergängen aromatischer Systeme liegt ε typischerweise über 10.000, bei n→π*-Übergängen dagegen nur zwischen 10 und 100.",
        difficulty = 3,
        funFact = "Hämoglobin hat bei 415 nm (Soret-Bande) einen ε-Wert von etwa 125.000 — damit gehört es zu den stärksten biologischen Absorbern überhaupt."
    ),

    // Question 2 – Spectroscopy: IR
    Question(
        categoryId = 2,
        questionText = "Warum ist die C=O-Streckschwingung im IR-Spektrum eines Aldehyds (ca. 1720 cm⁻¹) bei höherer Wellenzahl als die einer Carbonsäure (ca. 1710 cm⁻¹)?",
        answerA = "Weil Aldehyde eine größere Molmasse als Carbonsäuren besitzen",
        answerB = "Weil die OH-Gruppe der Carbonsäure durch Resonanz die C=O-Bindung schwächt",
        answerC = "Weil Aldehyde stärker polare Lösungsmittel bevorzugen",
        answerD = "Weil die CHO-Gruppe eine niedrigere Kraftkonstante hat als COOH",
        correctAnswer = 1, // B
        explanation = "In Carbonsäuren kann das freie Elektronenpaar des OH-Sauerstoffs in die C=O-Bindung delokalisiert werden (Mesomerie). Dadurch wird die C=O-Bindungsordnung leicht erniedrigt, die Kraftkonstante sinkt, und die Streckschwingungsfrequenz verschiebt sich zu niedrigeren Wellenzahlen. Aldehyde besitzen diesen Mesomerieeffekt nicht in gleicher Stärke.",
        difficulty = 3,
        funFact = null
    ),

    // Question 3 – Spectroscopy: Raman
    Question(
        categoryId = 2,
        questionText = "Welche Auswahlregel gilt für Raman-aktive Schwingungsmoden?",
        answerA = "Die Dipolmomentänderung während der Schwingung muss ungleich null sein",
        answerB = "Die Polarisierbarkeit des Moleküls muss sich während der Schwingung ändern",
        answerC = "Das Molekül muss ein permanentes Dipolmoment besitzen",
        answerD = "Die Symmetriezahl des Moleküls muss größer als 2 sein",
        correctAnswer = 1, // B
        explanation = "Raman-Aktivität erfordert eine Änderung der molekularen Polarisierbarkeit während der Schwingung. Im Gegensatz dazu erfordert IR-Aktivität eine Änderung des Dipolmoments. Bei zentrosymmetrischen Molekülen gilt die Alternativverbot-Regel: Eine Mode kann nicht gleichzeitig IR- und Raman-aktiv sein. Deshalb ergänzen sich IR- und Raman-Spektroskopie optimal.",
        difficulty = 3,
        funFact = "Der Raman-Effekt wurde 1928 von C.V. Raman entdeckt — er erhielt dafür 1930 den Nobelpreis für Physik. Nur etwa 1 von 10 Millionen Photonen wird Raman-gestreut."
    ),

    // Question 4 – Spectroscopy: Mass spectrometry fragmentation
    Question(
        categoryId = 2,
        questionText = "Bei der Elektronenstoß-Massenspektrometrie (EI-MS) bezeichnet der Basispeak den:",
        answerA = "Molekülionenpeak mit dem höchsten m/z-Verhältnis",
        answerB = "Peak mit der größten relativen Intensität im Spektrum",
        answerC = "Peak des Isotopenklusters mit der häufigsten Isotopenkombination",
        answerD = "Ersten Fragmentierungspeak nach Verlust von 18 Da (H₂O)",
        correctAnswer = 1, // B
        explanation = "Der Basispeak ist der intensivste Peak im Massenspektrum und wird auf 100% relativer Intensität normiert. Er entspricht dem stabilsten Kation oder dem bevorzugten Fragmentierungsprodukt. Der Molekülionenpeak (M⁺•) ist oft nicht der Basispeak, da Molekülionen instabil fragmentieren können.",
        difficulty = 3,
        funFact = null
    ),

    // Question 5 – Spectroscopy: Fluorescence
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Stokes-Verschiebung in der Fluoreszenzspektroskopie?",
        answerA = "Die Zeitverzögerung zwischen Anregung und Emission in Nanosekunden",
        answerB = "Den Wellenlängenunterschied zwischen Anregungs- und Emissionsmaximum",
        answerC = "Die Abnahme der Fluoreszenzintensität durch Sauerstoffquenching",
        answerD = "Die Überlappung von Absorptions- und Emissionsspektrum",
        correctAnswer = 1, // B
        explanation = "Die Stokes-Verschiebung bezeichnet die bathochrome (rotverschobene) Differenz zwischen dem Absorptionsmaximum und dem Fluoreszenzmaximum. Sie entsteht, weil das Molekül nach Anregung in einen höheren Schwingungszustand des S₁-Zustands relaxiert (internal conversion/Schwingungsrelaxation) und die Emission daher bei niedrigerer Energie (längerer Wellenlänge) erfolgt.",
        difficulty = 3,
        funFact = "GFP (Green Fluorescent Protein) hat eine Stokes-Verschiebung von ca. 23 nm (Anregung 395 nm, Emission 509 nm) und revolutionierte die Zellbiologie als lebendige Fluoreszenzmarkierung."
    ),

    // Question 6 – Cancer Biology: Oncogenes
    Question(
        categoryId = 2,
        questionText = "Proto-Onkogene werden durch welchen Mechanismus NICHT zu Onkogenen aktiviert?",
        answerA = "Punktmutation im kodierenden Bereich (z.B. RAS G12V)",
        answerB = "Genamplifikation (z.B. HER2/neu in Brustkrebs)",
        answerC = "Deletion beider Allele mit vollständigem Funktionsverlust",
        answerD = "Chromosomale Translokation (z.B. BCR-ABL in CML)",
        correctAnswer = 2, // C
        explanation = "Onkogene entstehen durch Gain-of-Function-Mechanismen: Punktmutationen (dauerhaft aktives RAS), Amplifikation (mehr Genprodukt), oder Translokationen (neues Fusionsprotein wie BCR-ABL). Deletion beider Allele mit Funktionsverlust ist der Mechanismus der Tumor-Suppressor-Inaktivierung, nicht der Onkogen-Aktivierung. Onkogene wirken dominant — ein mutiertes Allel reicht.",
        difficulty = 3,
        funFact = "Das RAS-Gen ist in etwa 30% aller menschlichen Krebserkrankungen mutiert. Die häufigste Mutation G12V verhindert die GTPase-Aktivität — RAS bleibt dauerhaft aktiv."
    ),

    // Question 7 – Cancer Biology: Tumor suppressors
    Question(
        categoryId = 2,
        questionText = "Die \"Two-Hit-Hypothese\" von Alfred Knudson erklärt, warum bei erblichem Retinoblastom:",
        answerA = "Beide Eltern das mutierte RB1-Allel tragen müssen",
        answerB = "Nur eine somatische Mutation im Tumor ausreicht, da das zweite Allel bereits keimbahnartig mutiert ist",
        answerC = "Der Tumor nur in einem Auge entstehen kann",
        answerD = "RAS-Onkogene gleichzeitig aktiviert werden müssen",
        correctAnswer = 1, // B
        explanation = "Knudson beobachtete, dass erbliches Retinoblastom früher und bilateral auftritt als sporadisches. Seine Erklärung: Bei erblicher Form ist bereits ein RB1-Allel in allen Zellen mutiert (1. Hit). Nur eine weitere somatische Mutation (2. Hit) im anderen Allel reicht aus. Bei sporadischer Form müssen beide Mutationen somatisch in derselben Zelle auftreten — statistisch seltener.",
        difficulty = 3,
        funFact = null
    ),

    // Question 8 – Cancer Biology: Angiogenesis
    Question(
        categoryId = 2,
        questionText = "Welches Molekül ist der wichtigste Induktor der Tumorangiogenese und primäres Ziel anti-angiogener Therapien wie Bevacizumab?",
        answerA = "EGF (Epidermal Growth Factor)",
        answerB = "VEGF (Vascular Endothelial Growth Factor)",
        answerC = "PDGF (Platelet-Derived Growth Factor)",
        answerD = "FGF-2 (Fibroblast Growth Factor 2)",
        correctAnswer = 1, // B
        explanation = "VEGF, besonders VEGF-A, ist der zentrale Treiber der pathologischen Angiogenese. Tumorzellen unter Hypoxie aktivieren HIF-1α, welches die VEGF-Transkription steigert. VEGF bindet an VEGFR-2 auf Endothelzellen und stimuliert Proliferation, Migration und Überleben. Bevacizumab (Avastin) ist ein monoklonaler Anti-VEGF-Antikörper, zugelassen u.a. für Kolorektal-, Lungen- und Nierenzellkarzinom.",
        difficulty = 3,
        funFact = "Judah Folkman postulierte bereits 1971, dass Tumore ohne Angiogenese nicht über 1-2 mm wachsen können. Es dauerte Jahrzehnte, bis die Welt seine revolutionäre Idee akzeptierte."
    ),

    // Question 9 – Cancer Biology: Metastasis
    Question(
        categoryId = 2,
        questionText = "Der epithelial-mesenchymale Übergang (EMT) ist ein Schlüsselprozess der Metastasierung. Welches molekulare Kennzeichen beschreibt ihn am besten?",
        answerA = "Hochregulierung von E-Cadherin und Verlust von Vimentin",
        answerB = "Verlust von E-Cadherin und Hochregulierung mesenchymaler Marker wie Vimentin und N-Cadherin",
        answerC = "Aktivierung des Retinoblastom-Proteins (pRb) und Zellzyklusarrest",
        answerD = "Erhöhte Expression von p53 und Apoptoseinduktion",
        correctAnswer = 1, // B
        explanation = "Beim EMT verlieren Tumorzellen epitheliale Eigenschaften (E-Cadherin, tight junctions, Polarität) und gewinnen mesenchymale (Vimentin, N-Cadherin, Fibronektin, erhöhte Motilität). Transkriptionsfaktoren wie Snail, Twist und ZEB1/2 reprimieren E-Cadherin-Expression. Dies ermöglicht Invasion in umliegendes Gewebe, Intravasation und Fernmetastasierung.",
        difficulty = 3,
        funFact = null
    ),

    // Question 10 – Cancer Biology: Immunotherapy
    Question(
        categoryId = 2,
        questionText = "PD-1/PD-L1-Checkpoint-Inhibitoren wirken, indem sie:",
        answerA = "T-Zellen direkt mit Tumorzellen verbinden und Zytotoxizität auslösen",
        answerB = "Die vom Tumor vermittelte Erschöpfung von T-Zellen durch Blockade des inhibitorischen PD-1-Signals aufheben",
        answerC = "Regulatorische T-Zellen eliminieren und so Entzündung induzieren",
        answerD = "Tumor-Antigene auf dendritischen Zellen präsentieren",
        correctAnswer = 1, // B
        explanation = "Tumorzellen exprimieren PD-L1, das an PD-1 auf T-Zellen bindet und deren Aktivierung hemmt — ein Mechanismus der Immunevasion. PD-1-Inhibitoren (Nivolumab, Pembrolizumab) oder PD-L1-Inhibitoren (Atezolizumab) blockieren diesen Checkpoint. T-Zellen werden reaktiviert und können den Tumor bekämpfen. Diese Therapie revolutionierte besonders Melanom, NSCLC und Urothel-Karzinom.",
        difficulty = 3,
        funFact = "James Allison und Tasuku Honjo erhielten 2018 den Nobelpreis für Medizin für die Entdeckung der Krebstherapie durch Hemmung negativer Immunregulation."
    ),

    // Question 11 – Materials Engineering: Alloy design
    Question(
        categoryId = 2,
        questionText = "Das Hume-Rothery-Modell beschreibt die Mischbarkeit von Metallen in Legierungen. Welche Bedingung ist dabei NICHT relevant?",
        answerA = "Atomradien-Unterschied kleiner als 15%",
        answerB = "Gleiche oder ähnliche Kristallstruktur",
        answerC = "Gleiche Elektronegativität beider Metalle",
        answerD = "Schmelzpunktdifferenz kleiner als 200°C",
        correctAnswer = 3, // D
        explanation = "Die Hume-Rothery-Regeln für Mischkristallbildung fordern: (1) Atomradien-Unterschied < 15%, (2) gleiche oder ähnliche Kristallstruktur, (3) ähnliche Elektronegativität, (4) gleiche oder ähnliche Valenz. Die Schmelzpunktdifferenz ist kein Hume-Rothery-Kriterium. Gold-Silber bilden z.B. lückenlose Mischkristalle, da alle vier Bedingungen erfüllt sind.",
        difficulty = 3,
        funFact = "Stahl ist technisch eine Legierung aus Eisen und maximal 2,06% Kohlenstoff. Trotz des kleinen Kohlenstoffanteils verändert er Festigkeit und Härte dramatisch — durch Einlagerungsmischkristallbildung."
    ),

    // Question 12 – Materials Engineering: Ceramics
    Question(
        categoryId = 2,
        questionText = "Warum zeigen keramische Werkstoffe im Gegensatz zu Metallen kaum plastische Verformung vor dem Bruch?",
        answerA = "Keramiken haben zu niedrige Schmelzpunkte für Versetzungsbewegung",
        answerB = "Die ionisch-kovalente Bindung und die hohe Versetzungsenergie verhindern Gleiten entlang von Gleitebenen",
        answerC = "Keramiken besitzen keine Kristallstruktur und können daher keine Versetzungen bilden",
        answerD = "Der hohe thermische Ausdehnungskoeffizient von Keramiken führt zu sofortigem Sprödbruch",
        correctAnswer = 1, // B
        explanation = "In Metallen können Versetzungen leicht gleiten, da metallische Bindungen ungerichtet sind. In Keramiken sind ionische und kovalente Bindungen stark gerichtet. Eine Versetzungsbewegung würde gleichnamig geladene Ionen nebeneinander bringen — elektrostatische Abstoßung macht dies energetisch extrem ungünstig. Daher versagen Keramiken spröde durch Rissausbreitung statt durch plastische Verformung.",
        difficulty = 3,
        funFact = null
    ),

    // Question 13 – Materials Engineering: Composites
    Question(
        categoryId = 2,
        questionText = "Die Mischungsregel (Rule of Mixtures) berechnet den E-Modul eines faserverstärkten Verbundwerkstoffs in Faserrichtung als:",
        answerA = "E_c = V_f · E_f · V_m · E_m (Produkt der Volumenanteile und E-Moduln)",
        answerB = "E_c = V_f · E_f + V_m · E_m (gewichteter Mittelwert nach Volumenanteilen)",
        answerC = "E_c = (V_f / E_f + V_m / E_m)⁻¹ (harmonisches Mittel)",
        answerD = "E_c = √(E_f · E_m) (geometrisches Mittel)",
        correctAnswer = 1, // B
        explanation = "In Faserrichtung (isostrain, Voigt-Modell) gilt die obere Mischungsregel: E_c = V_f·E_f + V_m·E_m. Faser und Matrix erfahren gleiche Dehnung, die Spannungen addieren sich proportional zu den Volumenanteilen. Quer zur Faserrichtung gilt das isostress-Modell (Reuss): E_c = (V_f/E_f + V_m/E_m)⁻¹, was niedrigere E-Moduln liefert.",
        difficulty = 3,
        funFact = "Carbonfaserverstärkte Kunststoffe (CFK) haben ein spezifisches E-Modul (E/ρ) das etwa 5-mal höher ist als das von Stahl — bei einem Viertel des Gewichts."
    ),

    // Question 14 – Materials Engineering: Corrosion
    Question(
        categoryId = 2,
        questionText = "Bei der galvanischen Korrosion fungiert das unedlere Metall als:",
        answerA = "Kathode, an der Reduktion stattfindet",
        answerB = "Anode, an der oxidative Metallauflösung stattfindet",
        answerC = "Elektrolyt zwischen den beiden Metallen",
        answerD = "Passivschicht, die das edlere Metall schützt",
        correctAnswer = 1, // B
        explanation = "Bei galvanischer Korrosion bilden zwei verschiedene Metalle in einem Elektrolyten ein elektrochemisches Element. Das unedlere Metall (negativeres Standardpotential) wird zur Anode: M → Mⁿ⁺ + ne⁻ (Oxidation, Metallauflösung). Das edlere Metall wird zur Kathode: O₂ + 2H₂O + 4e⁻ → 4OH⁻ (Reduktion). Das unedlere Metall korrodiert beschleunigt, das edlere wird geschützt.",
        difficulty = 3,
        funFact = "Verzinkter Stahl nutzt diesen Effekt gezielt: Zink ist unedler als Eisen und dient als Opferanode — selbst wenn der Zinküberzug beschädigt ist, schützt es das Eisen noch."
    ),

    // Question 15 – Materials Engineering: Fatigue failure
    Question(
        categoryId = 2,
        questionText = "Im Wöhler-Diagramm (S-N-Diagramm) beschreibt die Dauerfestigkeit (Endurance Limit) das:",
        answerA = "Maximum der ertragbaren Spannung bei einem einzigen Lastspiel",
        answerB = "Spannungsniveau, unterhalb dessen theoretisch unendlich viele Lastspiele ohne Bruch ertragen werden",
        answerC = "Spannungsamplitude bei der die Probe nach genau 10⁶ Lastspielen bricht",
        answerD = "Verhältnis von Zug- zu Druckfestigkeit unter Wechsellast",
        correctAnswer = 1, // B
        explanation = "Das Wöhler-Diagramm trägt Spannungsamplitude gegen Anzahl der Lastspiele bis zum Bruch auf. Viele Stähle zeigen eine horizontale Asymptote — die Dauerfestigkeit — typischerweise bei etwa 40-50% der Zugfestigkeit. Unterhalb dieser Schwelle tritt theoretisch kein Ermüdungsbruch auf. Aluminium-Legierungen zeigen meist keine echte Dauerfestigkeit, nur eine Zeitfestigkeit.",
        difficulty = 3,
        funFact = "Die erste wissenschaftliche Erforschung von Materialermüdung betrieb August Wöhler zwischen 1858 und 1870 nach häufigen Eisenbahnachsbrüchen — ein historisch wichtiges Ingenieursproblem."
    ),

    // Question 16 – Quantum Computing: Qubits
    Question(
        categoryId = 2,
        questionText = "Ein klassisches Bit kann den Zustand 0 oder 1 annehmen. Was unterscheidet ein Qubit fundamental davon?",
        answerA = "Ein Qubit kann bis zu 4 verschiedene Zustände gleichzeitig speichern",
        answerB = "Ein Qubit kann sich in einer Superposition befinden: |ψ⟩ = α|0⟩ + β|1⟩, wobei |α|² + |β|² = 1",
        answerC = "Ein Qubit verwendet ternäre Logik mit den Werten −1, 0 und +1",
        answerD = "Ein Qubit kann Informationen ohne Energieverbrauch verarbeiten",
        correctAnswer = 1, // B
        explanation = "Ein Qubit ist ein Quantensystem mit zwei Basiszuständen |0⟩ und |1⟩. Im Gegensatz zum klassischen Bit kann es eine kohärente Superposition beider Zustände annehmen: |ψ⟩ = α|0⟩ + β|1⟩, wobei α,β komplexe Amplituden sind und die Normierungsbedingung gilt. Erst bei der Messung kollabiert die Superposition zu 0 (mit Wahrscheinlichkeit |α|²) oder 1 (mit |β|²).",
        difficulty = 3,
        funFact = "Der Bloch-Kugel-Formalismus stellt den Zustand eines einzelnen Qubits als Punkt auf einer Einheitskugel dar — ein elegantes geometrisches Bild der Quantenmechanik."
    ),

    // Question 17 – Quantum Computing: Superposition
    Question(
        categoryId = 2,
        questionText = "Ein Quantencomputer mit n Qubits kann in Superposition gleichzeitig wie viele klassische Zustände repräsentieren?",
        answerA = "2n Zustände (lineares Wachstum)",
        answerB = "n² Zustände",
        answerC = "2ⁿ Zustände (exponentielles Wachstum)",
        answerD = "n! Zustände (faktorielles Wachstum)",
        correctAnswer = 2, // C
        explanation = "n Qubits können in Superposition 2ⁿ verschiedene Basiszustände gleichzeitig repräsentieren. Mit 10 Qubits sind das 1.024, mit 50 Qubits über 10¹⁵ Zustände. Dieses exponentielle Wachstum des Hilbert-Raums ist die Grundlage des potentiellen Quantenvorteils. Ein klassischer Computer mit 50 Bits repräsentiert dagegen immer nur genau einen von 2⁵⁰ möglichen Zuständen.",
        difficulty = 3,
        funFact = "Ein Quantencomputer mit 300 Qubits könnte mehr Zustände gleichzeitig repräsentieren als Atome im beobachtbaren Universum existieren."
    ),

    // Question 18 – Quantum Computing: Quantum gates
    Question(
        categoryId = 2,
        questionText = "Das Hadamard-Gate H erzeugt aus dem Basiszustand |0⟩ den Zustand:",
        answerA = "|1⟩ (Bitflip)",
        answerB = "(1/√2)(|0⟩ + |1⟩) — eine gleichgewichtete Superposition",
        answerC = "(1/√2)(|0⟩ − |1⟩) — eine gleichgewichtete Superposition mit Phasenunterschied",
        answerD = "i|0⟩ (Phasenrotation um 90°)",
        correctAnswer = 1, // B
        explanation = "Das Hadamard-Gate ist definiert als H = (1/√2)[[1,1],[1,-1]]. Angewendet auf |0⟩ ergibt sich H|0⟩ = (1/√2)(|0⟩ + |1⟩) = |+⟩. Angewendet auf |1⟩ ergibt sich H|1⟩ = (1/√2)(|0⟩ − |1⟩) = |−⟩. Das Hadamard-Gate ist das fundamentale Werkzeug zur Erzeugung von Superposition und ein Baustein in vielen Quantenalgorithmen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 19 – Quantum Computing: Entanglement
    Question(
        categoryId = 2,
        questionText = "Ein Bell-Zustand Φ⁺ = (1/√2)(|00⟩ + |11⟩) beschreibt zwei verschränkte Qubits. Was passiert, wenn man das erste Qubit misst und den Zustand |0⟩ erhält?",
        answerA = "Das zweite Qubit kollabiert sofort in den Zustand |0⟩, unabhängig von der Entfernung",
        answerB = "Das zweite Qubit bleibt in Superposition bis es selbst gemessen wird",
        answerC = "Das zweite Qubit nimmt den Zustand |1⟩ an (Anti-Korrelation)",
        answerD = "Die Verschränkung wird zerstört und das zweite Qubit nimmt einen zufälligen Zustand an",
        correctAnswer = 0, // A
        explanation = "Bei Messung des ersten Qubits im Bell-Zustand (1/√2)(|00⟩+|11⟩) mit Ergebnis |0⟩ kollabiert der Gesamtzustand auf |00⟩. Das zweite Qubit ist damit instantan ebenfalls in |0⟩. Dies ist keine Informationsübertragung (kein FTL-Signaling), da das Messergebnis des ersten Qubits zufällig ist. Einstein nannte dieses Phänomen kritisch \"spukhafte Fernwirkung\".",
        difficulty = 3,
        funFact = "Bell-Tests (nach John Bell, 1964) haben Einsteins lokalen Realismus experimentell widerlegt. Das Universum ist tatsächlich nicht-lokal, wenn auch ohne Informationsübertragung."
    ),

    // Question 20 – Quantum Computing: Decoherence
    Question(
        categoryId = 2,
        questionText = "Dekohärenz ist die größte praktische Herausforderung in Quantencomputern. Was beschreibt sie physikalisch?",
        answerA = "Den Energieverlust von Qubits durch Widerstand in supraleitenden Schaltkreisen",
        answerB = "Den Verlust der Quantenkohärenz durch unerwünschte Wechselwirkung des Quantensystems mit seiner Umgebung",
        answerC = "Die thermische Ausdehnung der Quantenchips bei Betriebstemperatur",
        answerD = "Die begrenzte Messgenauigkeit konventioneller Detektoren",
        correctAnswer = 1, // B
        explanation = "Dekohärenz bezeichnet den Prozess, durch den ein Quantensystem seine Superposition und Verschränkung durch Wechselwirkung mit der Umgebung verliert. Die Quanten-Information \"leckt\" in Umgebungsfreiheitsgrade. Typische Kohärenzzeiten supraleitender Qubits liegen im Mikrosekunden-Bereich. Quantenfehlerkorrektur kann Dekohärenz kompensieren, erfordert aber viele physikalische Qubits pro logischem Qubit.",
        difficulty = 3,
        funFact = "IBM's beste supraleitende Qubits erreichen heute T₂-Kohärenzzeiten von einigen hundert Mikrosekunden — eine 1000-fache Verbesserung gegenüber frühen Qubits von 2000."
    ),

    // Question 21 – Endocrinology: HPA axis
    Question(
        categoryId = 2,
        questionText = "Die Hypothalamus-Hypophysen-Nebennierenrinden-Achse (HPA-Achse) folgt einem negativen Feedback. Welches Hormon hemmt dabei auf Hypophysen- und Hypothalamusebene die weitere Stimulation?",
        answerA = "CRH (Corticotropin-Releasing-Hormon)",
        answerB = "ACTH (Adrenocorticotropes Hormon)",
        answerC = "Cortisol",
        answerD = "Aldosteron",
        correctAnswer = 2, // C
        explanation = "Die HPA-Achse: Hypothalamus sezerniert CRH → Hypophyse setzt ACTH frei → Nebennierenrinde produziert Cortisol. Cortisol übt negatives Feedback auf Hypophyse (hemmt ACTH-Sekretion) und Hypothalamus (hemmt CRH-Sekretion) aus. Dieser Mechanismus hält die Cortisolspiegel im Gleichgewicht. Bei Morbus Cushing (z.B. ACTH-produzierendes Adenom) ist dieses Feedback aufgehoben.",
        difficulty = 3,
        funFact = null
    ),

    // Question 22 – Endocrinology: Thyroid regulation
    Question(
        categoryId = 2,
        questionText = "Schilddrüsenhormone (T3/T4) regulieren ihren eigenen Spiegel durch Hemmung von:",
        answerA = "TRH im Hypothalamus und TSH in der Hypophyse (doppeltes negatives Feedback)",
        answerB = "Calcitonin in der Schilddrüse selbst (autokrines Feedback)",
        answerC = "Iodid-Transport durch den Natrium-Iodid-Symporter (NIS)",
        answerD = "Prolaktin in der Hypophyse durch Kreuzreaktivität",
        correctAnswer = 0, // A
        explanation = "T3 (aktive Form) hemmt auf Hypophysenebene die TSH-Sekretion und auf Hypothalamusebene die TRH-Sekretion — ein klassisches doppeltes negatives Feedback. TSH stimuliert Schilddrüsenhormon-Synthese und -Sekretion sowie Schilddrüsenwachstum. Bei primärer Hypothyreose sind T3/T4 niedrig, TSH kompensatorisch erhöht. Bei Hyperthyreose sind T3/T4 hoch, TSH supprimiert.",
        difficulty = 3,
        funFact = "T4 (Thyroxin) ist eigentlich ein Prohormon. Die eigentlich aktive Form ist T3 (Triiodthyronin), das in peripheren Geweben durch Deiodierung aus T4 entsteht."
    ),

    // Question 23 – Endocrinology: Insulin signaling
    Question(
        categoryId = 2,
        questionText = "Insulin bindet an seinen Rezeptor und aktiviert eine intrazelluläre Signalkaskade. Welche Kinase steht direkt am Anfang dieser Signalkette?",
        answerA = "PKA (Proteinkinase A) nach cAMP-Bildung",
        answerB = "Die intrinsische Tyrosinkinase-Aktivität des Insulinrezeptors selbst",
        answerC = "MAPK (Mitogen-activated protein kinase) durch Ras-Aktivierung",
        answerD = "PKC (Proteinkinase C) nach Diacylglycerol-Bildung",
        correctAnswer = 1, // B
        explanation = "Der Insulinrezeptor ist eine Rezeptor-Tyrosinkinase (RTK). Insulinbindung führt zur Dimerisierung und Autophosphorylierung der β-Untereinheiten an Tyrosinresten. Die aktivierte Tyrosinkinase phosphoryliert dann IRS-1/IRS-2 (Insulin Receptor Substrate). Downstream-Signale über PI3K/AKT führen zu GLUT4-Translokation (Glucoseaufnahme), Glykogensynthese und Proteinbiosynthese.",
        difficulty = 3,
        funFact = null
    ),

    // Question 24 – Endocrinology: Leptin resistance
    Question(
        categoryId = 2,
        questionText = "Leptin-Resistenz bei Adipositas bedeutet, dass:",
        answerA = "Zu wenig Leptin produziert wird, da Fettzellen schrumpfen",
        answerB = "Trotz hoher Leptinspiegel die Appetithemmung und Energiebereitstellung im Hypothalamus ausbleiben",
        answerC = "Leptin-Rezeptoren im Magen überexprimiert werden",
        answerD = "Die Blut-Hirn-Schranke Leptin verstärkt in den Hypothalamus transportiert",
        correctAnswer = 1, // B
        explanation = "Bei Adipositas sind Leptin-Spiegel oft chronisch erhöht (da Fettgewebe viel Leptin produziert), aber der Hypothalamus reagiert nicht mehr adäquat — Leptin-Resistenz. Mechanismen umfassen gestörten Leptin-Transport über die Blut-Hirn-Schranke, verringerte Rezeptor-Expression und erhöhte Aktivität von SOCS3 (Suppressor of Cytokine Signaling 3), das den JAK/STAT-Signalweg hemmt.",
        difficulty = 3,
        funFact = "Leptin wurde 1994 von Jeffrey Friedman entdeckt und nach dem griechischen Wort λεπτός (leptos = dünn/schlank) benannt — da Mäuse ohne Leptin-Gen extrem fettleibig werden."
    ),

    // Question 25 – Endocrinology: Adrenal insufficiency
    Question(
        categoryId = 2,
        questionText = "Der Morbus Addison ist eine primäre Nebennierenrindeninsuffizienz. Welche Elektrolytstörung ist charakteristisch?",
        answerA = "Hypernatriämie und Hypokaliämie durch Aldosteronüberschuss",
        answerB = "Hyponatriämie und Hyperkaliämie durch Aldosteronmangel",
        answerC = "Hyperkalzämie und Hypophosphatämie durch Cortisolüberschuss",
        answerD = "Hyperglykämie und Hypomagnesämie durch Katecholaminmangel",
        correctAnswer = 1, // B
        explanation = "Bei Morbus Addison fehlt Aldosteron (Mineralokortikoid-Mangel). Aldosteron fördert normalerweise Na⁺-Reabsorption und K⁺-Ausscheidung in der Niere. Ohne Aldosteron: Na⁺-Verlust (→ Hyponatriämie, Dehydratation, Hypotonie) und K⁺-Retention (→ Hyperkaliämie, Herzrhythmusstörungen). Zusätzlich besteht Cortisol-Mangel (Hypoglykämie, Schwäche). Hautbräunung durch kompensatorisch erhöhtes ACTH (MSH-ähnliche Wirkung).",
        difficulty = 3,
        funFact = "John F. Kennedy litt an Morbus Addison und nahm täglich Cortison. Sein markanter Teint war kein Zeichen von Gesundheit, sondern Folge der erhöhten ACTH-Spiegel."
    ),

    // Question 26 – Atmospheric Science: Stratospheric ozone
    Question(
        categoryId = 2,
        questionText = "Der katalytische Ozonabbau durch Chlorradikale in der Stratosphäre folgt welchem Mechanismus?",
        answerA = "Cl + O₃ → ClO + O₂; ClO + O → Cl + O₂ (Cl wird regeneriert)",
        answerB = "Cl₂ + O₃ → 2ClO + O (direkte Oxidation)",
        answerC = "Cl + O₂ → ClO₂; ClO₂ + O₃ → Cl + 2O₂",
        answerD = "Cl + UV → Cl⁺ + e⁻; Cl⁺ + O₃ → ClO₃⁻",
        correctAnswer = 0, // A
        explanation = "Der Chapman-Zyklus für Cl-katalysierten Ozonabbau: Cl• + O₃ → ClO• + O₂, dann ClO• + O• → Cl• + O₂. Netto: O₃ + O → 2O₂. Das Cl-Radikal wird regeneriert und kann Tausende weitere Ozonemoleküle zerstören. CFCs werden durch UV-Strahlung in der Stratosphäre photolytisch zu Cl-Radikalen gespalten. Fanthropogen: Ein Cl-Atom kann >100.000 O₃-Moleküle zerstören.",
        difficulty = 3,
        funFact = "Das Montrealer Protokoll (1987) zur Abschaffung der FCKW gilt als das erfolgreichste Umweltschutzabkommen. Das Ozonloch über der Antarktis erholt sich und soll bis 2066 geschlossen sein."
    ),

    // Question 27 – Atmospheric Science: Tropospheric ozone
    Question(
        categoryId = 2,
        questionText = "Troposphärisches Ozon ist ein Schadstoff und entsteht vor allem durch:",
        answerA = "Aufsteigen von stratosphärischem Ozon in die Troposphäre bei hohem UV-Index",
        answerB = "Photochemische Oxidation von NOₓ und VOC (flüchtigen organischen Verbindungen) unter UV-Einwirkung",
        answerC = "Verbrennung von Biomasse unter Sauerstoffmangel (unvollständige Verbrennung)",
        answerD = "Elektrische Entladungen in Gewittern über Industrie-Gebieten",
        correctAnswer = 1, // B
        explanation = "Troposphärisches Ozon (Sommersmog) entsteht durch komplexe Photooxidation: NOₓ aus Kfz-Abgasen und VOC (z.B. unverbrannte Kohlenwasserstoffe) reagieren unter UV-Strahlung. Schlüsselreaktion: NO₂ + hν → NO + O•; O• + O₂ + M → O₃ + M. Ohne VOC wird O₃ von NO wieder abgebaut (Titration). VOC verlängern die O₃-Lebensdauer erheblich. Anders als stratosphärisches O₃ schädigt troposphärisches Ozon Lungen und Pflanzen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 28 – Atmospheric Science: Aerosol effects
    Question(
        categoryId = 2,
        questionText = "Der indirekte aerosole Effekt auf das Klima (Twomey-Effekt) beschreibt:",
        answerA = "Die direkte Absorption von Sonnenstrahlung durch Rußpartikel (black carbon)",
        answerB = "Erhöhte Aerosolkonzentration führt zu mehr, kleineren Wolkentropfen und erhöhter Wolkenalbedo",
        answerC = "Sulfataerosole katalysieren den Abbau von Methan in der Atmosphäre",
        answerD = "Staubpartikel aus Saharastaub düngen den Amazonas mit Phosphor",
        correctAnswer = 1, // B
        explanation = "Der Twomey-Effekt (1. indirekter Aerosoleffekt): Mehr Kondensationskeime (CCN) durch Aerosole → mehr, aber kleinere Wolkentropfen bei gleicbem flüssigen Wassergehalt → höhere Wolkenalbedo (Reflexivität) → kühlender Effekt. Der 2. indirekte Effekt (Lebzeit-Effekt): Kleinere Tropfen koaleszieren weniger effizient → weniger Niederschlag → längere Wolkenlebensdauer → noch mehr Kühlung.",
        difficulty = 3,
        funFact = "Aerosole maskieren schätzungsweise 0,5–1,5 W/m² der anthropogenen Erwärmung. Würden wir morgen alle Emissionen stoppen, würde die Temperatur kurzfristig erst steigen."
    ),

    // Question 29 – Atmospheric Science: Cloud seeding
    Question(
        categoryId = 2,
        questionText = "Beim Cloud Seeding mit Silberiodid (AgI) nutzt man welche physikalische Eigenschaft von AgI?",
        answerA = "Seine starke UV-Absorption führt zur photochemischen Wolkenkondensation",
        answerB = "Seine Kristallstruktur ist ähnlich der von Eis und wirkt als heterogener Eiskristallisationskeim",
        answerC = "AgI ist hygroskopisch und zieht Wasserdampf aus der Luft",
        answerD = "AgI löst sich in Wassertröpfchen und erniedrigt den Gefrierpunkt",
        correctAnswer = 1, // B
        explanation = "Silberiodid hat eine Kristallstruktur (hexagonale Wurtzit-Struktur) sehr ähnlich der von Eis (hexagonale Struktur), mit Gitterkonstanten nahe an Eis. Dadurch wirkt es als sehr effizienter heterogener Eiskristallisationskeim — Eiskeimbildung beginnt bereits bei −5°C statt −40°C (homogene Nukleation). Dies fördert die Bildung von Niederschlag in übersättigten Wolken. China setzt Cloud Seeding groß-industriell ein.",
        difficulty = 3,
        funFact = null
    ),

    // Question 30 – Atmospheric Science: Atmospheric electricity
    Question(
        categoryId = 2,
        questionText = "Im globalen Stromkreis der Atmosphäre fungieren Gewitter als:",
        answerA = "Widerstand, der die atmosphärische Spannung abbaut",
        answerB = "Stromgeneratoren, die den positiven Ionosphären-Pol gegenüber der Erdoberfläche aufladen",
        answerC = "Kondensatoren, die elektrische Energie in Wolkentröpfchen speichern",
        answerD = "Gleichrichter, die Wechselstrom in Gleichstrom umwandeln",
        correctAnswer = 1, // B
        explanation = "Im globalen atmosphärischen Stromkreis nach C.T.R. Wilson: Blitze transportieren negative Ladung zur Erde (CG-Blitze) und positive Ladung in die Ionosphäre. Weltweit erzeugen ~40.000 Gewitter täglich einen globalen Strom von etwa 1000 A. Schönwettergebiete schließen den Kreislauf durch langsame positive Ionen-Bewegung von der Ionosphäre zur Erde (ca. 2 pA/m²).",
        difficulty = 3,
        funFact = "Die Ionosphäre steht auf dem positiven Pol (+300.000 V relativ zur Erde). Das elektrische Feld in Schönwetter-Atmosphäre beträgt etwa 100 V/m — der Mensch mit 1,8 m Höhe liegt also in einem 180-Volt-Feld."
    ),

    // Question 31 – Biogeochemistry: Carbon cycle
    Question(
        categoryId = 2,
        questionText = "Der ozeanische Kohlenstoffpumpen-Mechanismus \"Biologische Pumpe\" beschreibt:",
        answerA = "Die Aufnahme von CO₂ durch physikalische Löslichkeit in kaltem Tiefenwasser",
        answerB = "Den Transport von organischem Kohlenstoff vom Oberflächenwasser in die Tiefsee durch sinkende Partikel",
        answerC = "Die Verdampfung von Methan aus Meeressedimenten in die Atmosphäre",
        answerD = "Die chemische Lösung von Calciumcarbonat durch Tiefsee-Ansäuerung",
        correctAnswer = 1, // B
        explanation = "Die biologische Pumpe: Phytoplankton fixiert CO₂ durch Photosynthese im Oberflächenwasser. Tote Organismen, Fäkalien und Aggregate (\"marine snow\") sinken als partikulärer organischer Kohlenstoff (POC) in die Tiefsee. Dort wird Kohlenstoff für Jahrhunderte bis Jahrtausende sequestiert. Die biologische Pumpe exportiert etwa 10 Gt C/Jahr in die Tiefsee und ist entscheidend für die Regulation atmosphärischen CO₂.",
        difficulty = 3,
        funFact = "Ohne die biologische Pumpe wäre der atmosphärische CO₂-Gehalt schätzungsweise 200 ppm höher als heute — die Ozeane sind also ein riesiger Kohlenstoffpuffer."
    ),

    // Question 32 – Biogeochemistry: Phosphorus cycle
    Question(
        categoryId = 2,
        questionText = "Warum gilt Phosphor als \"limitierender Nährstoff\" in den meisten Süßwassersystemen?",
        answerA = "Weil Phosphor nur in Meeresgebieten vorkommt und Süßwasser kaum Phosphor enthält",
        answerB = "Weil Phosphor kein gasförmiges Reservoir besitzt und sein Kreislauf daher langsam über Gesteinsverwitterung läuft",
        answerC = "Weil Mikroorganismen aktiv Phosphor aus dem Wasser entfernen und speichern",
        answerD = "Weil Phosphatdünger vollständig von Landpflanzen aufgenommen wird",
        correctAnswer = 1, // B
        explanation = "Im Gegensatz zu C, N und S hat Phosphor kein signifikantes atmosphärisches Reservoir und keinen gasförmigen Verbindungen unter normalen Bedingungen. Der P-Kreislauf ist daher \"geschlossen\" und auf langsame geologische Prozesse (Gesteinsverwitterung, tektonische Hebung) angewiesen. Phosphat ist in natürlichen Gewässern daher sehr gering konzentriert. Eutrophierung durch P-Einträge aus Landwirtschaft führt zu Algenblüten.",
        difficulty = 3,
        funFact = null
    ),

    // Question 33 – Biogeochemistry: Sulfur cycle
    Question(
        categoryId = 2,
        questionText = "Welches Spurengas, produziert von marinem Phytoplankton, spielt eine zentrale Rolle im biogeochemischen Schwefelkreislauf und beeinflusst die Wolkenbildung?",
        answerA = "H₂S (Schwefelwasserstoff)",
        answerB = "SO₂ (Schwefeldioxid)",
        answerC = "DMS (Dimethylsulfid, (CH₃)₂S)",
        answerD = "COS (Carbonylsulfid)",
        correctAnswer = 2, // C
        explanation = "DMS (Dimethylsulfid) ist das wichtigste biologisch produzierte flüchtige Schwefelgas. Phytoplankton produziert DMSP (Dimethylsulfoniopropionat) als Osmolyt; bei Abbau entsteht DMS. DMS diffundiert in die Atmosphäre, wird zu SO₂ und Sulfataerosolen oxidiert, die als Wolkenkondensationskeime dienen. Die CLAW-Hypothese (1987) postulierte eine klimaregulierende Rückkopplung zwischen Planktonproduktivität und Wolkenbildung.",
        difficulty = 3,
        funFact = "Der charakteristische Geruch von Meeresluft stammt hauptsächlich von DMS. Er entsteht, wenn Meereswellen Phytoplankton aufbrechen und DMSP freisetzen."
    ),

    // Question 34 – Biogeochemistry: Nitrogen cycle ocean
    Question(
        categoryId = 2,
        questionText = "In sauerstoffarmen Zonen des Ozeans (OMZ) erfolgt der Prozess der Denitrifikation. Was ist das Endprodukt?",
        answerA = "NH₄⁺ (Ammonium) durch dissimilatorische Nitratreduktion",
        answerB = "N₂ (molekularer Stickstoff) der in die Atmosphäre entweicht",
        answerC = "NO₃⁻ (Nitrat) durch Nitrifikation",
        answerD = "N₂O (Lachgas) als einziges Endprodukt",
        correctAnswer = 1, // B
        explanation = "Denitrifikation: Anaerobe Bakterien reduzieren NO₃⁻ → NO₂⁻ → NO → N₂O → N₂. Das Endprodukt N₂ entweicht als inertes Gas in die Atmosphäre und entzieht dem System reaktiven Stickstoff (biologisch fixierbarer N). Dies ist die wichtigste N-Senke im Ozean. OMZ-Zonen (z.B. Arabisches Meer, östlicher Pazifik) sind weltweit bedeutende Denitrifikations-Hotspots und zugleich Quellen für N₂O.",
        difficulty = 3,
        funFact = null
    ),

    // Question 35 – Biogeochemistry: Silica cycle
    Question(
        categoryId = 2,
        questionText = "Diatomeen (Kieselalgen) spielen im marinen Siliziumkreislauf eine zentrale Rolle, weil sie:",
        answerA = "Silikat aus dem Meerwasser aufnehmen und biogene Kieselschalen (Frustulen) aus amorphem SiO₂ aufbauen",
        answerB = "Silikat in der Atmosphäre durch Photosynthese zu elementarem Silizium reduzieren",
        answerC = "Gelöstes Silikat durch alkalische Ausscheidungen aus dem Wasser fällen",
        answerD = "Silikat als Elektronendonor in anoxygenen Photosynthese-Reaktionen nutzen",
        correctAnswer = 0, // A
        explanation = "Diatomeen nehmen gelöstes reaktives Silikat (SiO₂(OH)₂²⁻, orthosilicic acid) aktiv auf und bauen daraus amorphe Kieselschalen (Frustulen) auf. Sie sind für ~40% der marinen Primärproduktion verantwortlich. Beim Absinken werden die Schalen in der Wassersäule teilweise wieder gelöst (Dissolution), ein kleiner Teil sedimentiert als biogener Opal auf dem Meeresboden (Diatomeenerde, Diatomit).",
        difficulty = 3,
        funFact = "Diatomeenerde (Diatomit) wird industriell als Filtermittel, Polierpaste und in Sprengstoff (Dynamit: Nitroglycerin in Kieselgur) eingesetzt — Nobel erkannte die Stabilisierung durch Kieselgur."
    ),

    // Question 36 – Acoustics: Piezoelectric transducers
    Question(
        categoryId = 2,
        questionText = "Welches Kristallmaterial wird am häufigsten in industriellen Ultraschall-Transducern eingesetzt, weil es einen starken piezoelektrischen Effekt zeigt?",
        answerA = "Quarzkristall (SiO₂) wegen seiner chemischen Stabilität",
        answerB = "PZT (Blei-Zirkonat-Titanat, Pb[Zr_xTi_{1-x}]O₃) wegen seines hohen piezoelektrischen Koeffizienten",
        answerC = "Saphir (Al₂O₃) wegen seiner Härte und Temperaturstabilität",
        answerD = "Bariumsulfat (BaSO₄) wegen seiner akustischen Impedanz",
        correctAnswer = 1, // B
        explanation = "PZT (Blei-Zirkonat-Titanat) ist die dominierende Piezo-Keramik für Transducer. Es hat piezoelektrische Koeffizienten d₃₃ von 300–600 pC/N — weit über Quarz (2,3 pC/N). Die ferroelektrische Domänenstruktur von PZT wird durch Poling mit starkem E-Feld ausgerichtet. Nachteile: Bleigehalt (Umwelt), Sprödigkeit. Alternatives bleifreies BNT-BT wird erforscht.",
        difficulty = 3,
        funFact = null
    ),

    // Question 37 – Acoustics: Sonar
    Question(
        categoryId = 2,
        questionText = "Aktives Sonar berechnet die Entfernung eines Objekts aus:",
        answerA = "Der Frequenzverschiebung des reflektierten Signals (Doppler-Effekt)",
        answerB = "Der Laufzeit des ausgesandten und reflektierten Schallpulses (ToF-Messung)",
        answerC = "Der Amplitude des empfangenen Echosignals",
        answerD = "Dem Phasenunterschied zwischen zwei räumlich getrennten Empfängern",
        correctAnswer = 1, // B
        explanation = "Aktives Sonar sendet kurze Schallpulse (Pings) aus und misst die Laufzeit bis zum Empfang des reflektierten Echos. Entfernung = (Schallgeschwindigkeit × Laufzeit) / 2. Die Schallgeschwindigkeit im Meerwasser beträgt ~1500 m/s (abhängig von Temperatur, Salzgehalt, Druck). Der Doppler-Effekt wird für Geschwindigkeitsmessungen genutzt, nicht für Entfernung. SONAR = Sound Navigation And Ranging.",
        difficulty = 3,
        funFact = "Wale nutzen biologisches Biosonar (Echolokation) mit Frequenzen bis 120 kHz und erreichen eine Auflösung von Millimetern — präziser als jede menschliche Technologie vergleichbarer Größe."
    ),

    // Question 38 – Acoustics: Acoustic levitation
    Question(
        categoryId = 2,
        questionText = "Bei akustischer Levitation werden Objekte an den Druckknoten einer stehenden Welle gehalten, weil:",
        answerA = "An Druckknoten der Schalldruck maximal ist und eine Auftriebskraft erzeugt",
        answerB = "An Druckknoten der Schalldruck minimal ist und der Strahlungsdruck Objekte aus Druckmaxima verdrängt",
        answerC = "An Druckknoten die Schallgeschwindigkeit maximal ist und Objekte eingesaugt werden",
        answerD = "An Druckknoten das elektromagnetische Feld der Schallwelle am stärksten ist",
        correctAnswer = 1, // B
        explanation = "In einer stehenden Schallwelle wechseln Druckknoten (minimaler Schalldruck) und Druckbäuche (maximaler Schalldruck) ab. Kleine Objekte erfahren durch den akustischen Strahlungsdruck eine Kraft in Richtung minimalen Drucks — zu den Knoten hin. Dies ist der akustische Primärstrahlungsdruck (Gorkov-Potential). Objekte schweben stabil an Druckknoten-Positionen.",
        difficulty = 3,
        funFact = "Akustische Levitation ermöglicht berührungsfreie Handhabung von Proben — ideal für kontaminationsempfindliche Substanzen. Mit Lautsprechern von 40 kHz können Wassertropfen und sogar lebende Tiere (Ameisen) zum Schweben gebracht werden."
    ),

    // Question 39 – Acoustics: Phononic crystals
    Question(
        categoryId = 2,
        questionText = "Phononische Kristalle sind künstliche Materialien mit periodischer Struktur. Welche akustische Eigenschaft nutzen sie gezielt?",
        answerA = "Piezoelektrische Konversion zwischen Schall und elektrischer Energie",
        answerB = "Bragg-Reflexion zur Erzeugung akustischer Bandlücken, in denen bestimmte Frequenzen nicht propagieren können",
        answerC = "Nichtlineare Schallabsorption durch viskoelastische Dämpfung",
        answerD = "Thermische Leitung entlang Schallpfaden zur Kühlung",
        correctAnswer = 1, // B
        explanation = "Phononische Kristalle nutzen konstruktive und destruktive Interferenz an periodischen Grenzflächen (Bragg-Reflexion) zur Schaffung akustischer Bandlücken — Frequenzbereiche, in denen Schall nicht propagieren kann. Dies ist das akustische Analogon zu photonischen Bandlücken in photonischen Kristallen. Anwendungen: akustische Isolatoren, Schallfilter, negative-refraction-Materialien.",
        difficulty = 3,
        funFact = null
    ),

    // Question 40 – Acoustics: Noise cancellation
    Question(
        categoryId = 2,
        questionText = "Aktive Geräuschunterdrückung (ANC) funktioniert durch:",
        answerA = "Absorption von Schallwellen durch poröse Materialien mit piezoelektrischer Aktivierung",
        answerB = "Erzeugung eines Antisignals mit gleicher Amplitude, aber 180° Phasenverschiebung zum Störgeräusch",
        answerC = "Digitalfilterung des eingehenden Audiosignals durch FFT-basierte Spektralsubtraktion",
        answerD = "Magnetische Dämpfung der Lautsprecher-Membran durch aktive Feldumkehr",
        correctAnswer = 1, // B
        explanation = "ANC nutzt destruktive Interferenz: Ein Mikrofon nimmt das Störgeräusch auf, ein DSP generiert in Echtzeit ein Antisignal gleicher Amplitude und um 180° phasenverschoben, und ein Lautsprecher gibt dieses Antisignal aus. Die Überlagerung löscht das ursprüngliche Störgeräusch durch destruktive Interferenz aus. Besonders effektiv bei niederfrequenten, periodischen Geräuschen (Motorlärm, Fluglärm).",
        difficulty = 3,
        funFact = "ANC wurde 1978 von Willard Meeker patentiert. Erste kommerzielle Kopfhörer mit ANC kamen in den 1980ern für Piloten auf den Markt — heute ist ANC in Consumer-Kopfhörern Standard."
    ),

    // Question 41 – Genetics advanced: Epigenetic inheritance
    Question(
        categoryId = 2,
        questionText = "Transgenerationale epigenetische Vererbung bei Säugetieren ist umstritten, weil:",
        answerA = "Epigenetische Markierungen bei der DNA-Replikation vollständig gelöscht werden",
        answerB = "Zwischen Generationen zwei globale Reprogrammierungswellen in Gametenentwicklung und früher Embryogenese epigenetische Markierungen weitgehend löschen",
        answerC = "DNA-Methylierung chemisch instabil ist und sich spontan abbaut",
        answerD = "Epigenetische Muster nur in somatischen, nicht in Keimbahnzellen bestehen",
        correctAnswer = 1, // B
        explanation = "Säugetiere durchlaufen zwei Reprogrammierungswellen: erstens in der Primordialkeimzellentwicklung (Demethylierung), zweitens in der Präimplantationsphase (Demethylierung und Remethylierung). Nur bestimmte Regionen (imprinted genes, bestimmte Retrotransposons) entkommen dieser Reprogrammierung. Transgenerationale Epigenetik existiert, ist aber auf wenige Loci beschränkt. Berühmt: Hungersnot-Studien (Hongerwinter) zeigen epidemiologische Effekte.",
        difficulty = 3,
        funFact = "Studien an der niederländischen Hungerwinter-Generation (1944/45) zeigten, dass Kinder und sogar Enkel von betroffenen Frauen ein erhöhtes Risiko für metabolische Erkrankungen hatten — ein möglicher epigenetischer Effekt."
    ),

    // Question 42 – Genetics advanced: Transposons
    Question(
        categoryId = 2,
        questionText = "Barbara McClintocks Transposons werden als \"springende Gene\" bezeichnet. Welcher Mechanismus unterscheidet Klasse-I-Transposons von Klasse-II-Transposons?",
        answerA = "Klasse I nutzt \"Cut-and-Paste\" via Transposase, Klasse II nutzt einen RNA-Zwischenschritt (Retrotransposon)",
        answerB = "Klasse I nutzt einen RNA-Zwischenschritt via Reverse Transkriptase (Copy-and-Paste), Klasse II nutzt direkte DNA-Rekombination (Cut-and-Paste)",
        answerC = "Klasse I transponiert nur in Mitose, Klasse II nur in Meiose",
        answerD = "Klasse I ist pflanzlich, Klasse II ist auf Säugetiere beschränkt",
        correctAnswer = 1, // B
        explanation = "Klasse-I-Transposons (Retrotransposons) replizieren über RNA: DNA → RNA → cDNA (Reverse Transkriptase) → neue DNA-Insertion. Kopienanzahl kann steigen (Copy-and-Paste). Klasse-II-Transposons (DNA-Transposons) nutzen Transposase für direkte DNA-Exzision und Reinsertion (Cut-and-Paste) — Kopienanzahl bleibt konstant. ~45% des menschlichen Genoms bestehen aus Transposon-Resten (größtenteils inaktiv).",
        difficulty = 3,
        funFact = "Barbara McClintock entdeckte Transposons schon 1950 an Mais, wurde aber jahrzehntelang nicht ernst genommen. 1983 erhielt sie dafür den Nobelpreis für Medizin — in ihrem 81. Lebensjahr."
    ),

    // Question 43 – Genetics advanced: Gene silencing
    Question(
        categoryId = 2,
        questionText = "MicroRNAs (miRNAs) silencen Gene post-transkriptionell durch:",
        answerA = "Direkte Methylierung des Promotors des Zielgens durch den RISC-Komplex",
        answerB = "Partielle komplementäre Basenpaarung mit der 3'-UTR von Ziel-mRNAs und Induktion von mRNA-Degradation oder Translationshemmung im RISC",
        answerC = "Abbau der Ziel-mRNA durch miRNA-kodierte Endonukleasen im Zellkern",
        answerD = "Konkurrenz mit Ribosomen um die 5'-Cap-Struktur der Ziel-mRNA",
        correctAnswer = 1, // B
        explanation = "miRNAs (~22 nt) werden aus Hairpin-Vorläufern prozessiert (Drosha, Dicer) und in den RISC (RNA-induced silencing complex) geladen. Über partielle Komplementarität der sogenannten Seed-Sequenz (nt 2-8) bindet miRNA an 3'-UTR von Ziel-mRNAs. Je nach Komplementarität folgt mRNA-Deadenylierung/Degradation oder Translationsrepression. Eine miRNA reguliert häufig Hunderte von Zielgenen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 44 – Genetics advanced: Copy number variations
    Question(
        categoryId = 2,
        questionText = "Copy Number Variations (CNVs) im menschlichen Genom sind:",
        answerA = "Einzelnukleotid-Polymorphismen mit erhöhter Mutationsrate",
        answerB = "Submikroskopische Deletionen oder Duplikationen von DNA-Segmenten (typisch ≥1 kb), die zwischen Individuen variieren",
        answerC = "Methylierungsunterschiede an CpG-Inseln zwischen Individuen",
        answerD = "Ringchromosomen die supernumeräre Genkopien tragen",
        correctAnswer = 1, // B
        explanation = "CNVs sind strukturelle Genomvariationen mit Deletionen oder Duplikationen von DNA-Regionen (typisch ≥1 kb, oft >500 kb). Sie entstehen durch Non-allelic homologous recombination (NAHR) oder Replication fork stalling. CNVs betreffen ~12% des Genoms und erklären individuelle Unterschiede in Gendosis, Phänotyp und Krankheitsdisposition. Bekannte Beispiele: 22q11-Deletion (DiGeorge-Syndrom), CNVs in AMY1 (Amylase-Gendosis).",
        difficulty = 3,
        funFact = "Menschen haben durchschnittlich 3-4 Kopien des Amylase-Gens AMY1. Populationen mit traditionell stärkereicher Ernährung haben signifikant mehr AMY1-Kopien — ein Beispiel für CNV-basierte adaptive Evolution."
    ),

    // Question 45 – Genetics advanced: Genetic mosaicism
    Question(
        categoryId = 2,
        questionText = "Genetischer Mosaizismus entsteht durch:",
        answerA = "Ungleiche Rekombination während der Meiose in Keimzellen",
        answerB = "Somatische Mutationen nach der Befruchtung, sodass ein Individuum zwei oder mehr genetisch verschiedene Zellpopulationen enthält",
        answerC = "Horizontalen Gentransfer zwischen verschiedenen Geweben",
        answerD = "Chimärenbildung durch Fusion zweier Embryonen in sehr frühen Entwicklungsstadien",
        correctAnswer = 1, // B
        explanation = "Mosaizismus entsteht wenn eine Mutation nach der Befruchtung in einer somatischen Zelle auftritt. Alle Tochterzellen dieser Zelle tragen die Mutation — andere nicht. Je früher die Mutation, desto größer der Prozentsatz betroffener Zellen. Beispiele: Segmentaler Mosaizismus bei Neurofibromatose Typ 1, somatischer Mosaizismus bei Krebs (klonale Evolution). Chimärismus ist das Einbringen von komplett fremden Zellen (z.B. zweieiige Zwillinge mit gemischter Hämatopoese).",
        difficulty = 3,
        funFact = null
    ),

    // Question 46 – Thermochemistry: Hess's law
    Question(
        categoryId = 2,
        questionText = "Das Hess'sche Gesetz der konstanten Wärmesummen besagt:",
        answerA = "Die Reaktionsenthalpie hängt von der Reaktionstemperatur und dem gewählten Lösungsmittel ab",
        answerB = "Die Reaktionsenthalpie einer Reaktion ist unabhängig vom Reaktionsweg und nur von Anfangs- und Endzustand abhängig",
        answerC = "Bei exothermen Reaktionen ist die freigesetzte Wärme proportional zur Aktivierungsenergie",
        answerD = "Die Enthalpie eines idealen Gases ist ausschließlich druckabhängig",
        correctAnswer = 1, // B
        explanation = "Das Hess'sche Gesetz (1840) ist eine Konsequenz der Zustandsfunktion Enthalpie (ΔH ist wegunabhängig). Dies ermöglicht die Berechnung schwer messbarer Reaktionsenthalpien durch Addition von Teilreaktionen (Born-Haber-Zyklen, Kreisprozesse). Mathematisch: ΔH_gesamt = ΣΔH_Teilreaktionen, wenn diese linear kombiniert die Gesamtreaktion ergeben.",
        difficulty = 3,
        funFact = "Germain Henri Hess formulierte sein Gesetz 1840 — zwei Jahrzehnte bevor Kelvin und Clausius das Konzept der Enthalpie formal entwickelten. Er verstand intuitiv, was später thermodynamisch bewiesen wurde."
    ),

    // Question 47 – Thermochemistry: Bond enthalpies
    Question(
        categoryId = 2,
        questionText = "Mittlere Bindungsenthalpien können nur näherungsweise Reaktionsenthalpien berechnen, weil:",
        answerA = "Bindungsenthalpien temperaturabhängig sind und nur bei 0 K exakt gelten",
        answerB = "Die Bindungsenergie einer spezifischen Bindung kontextabhängig ist und im Molekül von Nachbargruppen beeinflusst wird",
        answerC = "Bindungsenthalpien nur für gasförmige Moleküle definiert sind und Lösungsmitteleffekte ignorieren",
        answerD = "Sowohl B als auch C sind zutreffend",
        correctAnswer = 3, // D
        explanation = "Mittlere Bindungsenthalpien sind Durchschnittswerte über viele verschiedene Moleküle. Die tatsächliche Bindungsenergie variiert je nach molekularer Umgebung (Induktive Effekte, Mesomerie, Spannungseffekte). Zudem gelten Bindungsenthalpien für Gasphasenmoleküle, während reale Reaktionen oft in Lösung ablaufen. Daher liefern mittlere Bindungsenthalpien nur Näherungswerte für ΔH_R.",
        difficulty = 3,
        funFact = null
    ),

    // Question 48 – Thermochemistry: Calorimetry
    Question(
        categoryId = 2,
        questionText = "Ein Bombenkalorimeter misst im Gegensatz zum Lösungskalorimeter:",
        answerA = "ΔH (Enthalpieänderung) bei konstantem Druck",
        answerB = "ΔU (innere Energieänderung) bei konstantem Volumen",
        answerC = "ΔG (freie Enthalpie) bei konstanter Temperatur",
        answerD = "ΔS (Entropieänderung) bei konstanter Enthalpie",
        correctAnswer = 1, // B
        explanation = "Ein Bombenkalorimeter ist ein Stahlbehälter mit konstant gehaltenem Volumen (rigid vessel). Die gemessene Wärme entspricht ΔU (innere Energie) bei konstantem Volumen. Die Umrechnung zu ΔH erfolgt über: ΔH = ΔU + Δn_gas·R·T, wobei Δn_gas die Änderung der Molzahl gasförmiger Stoffe ist. Das Lösungskalorimeter läuft bei konstantem Druck (atmosphärisch) und misst direkt ΔH.",
        difficulty = 3,
        funFact = "Brennwerte von Nahrungsmitteln werden klassisch im Bombenkalorimeter bestimmt. Eine Calorie (cal) wurde ursprünglich als Wärme definiert, die 1 g Wasser um 1°C erwärmt."
    ),

    // Question 49 – Thermochemistry: Enthalpy of formation
    Question(
        categoryId = 2,
        questionText = "Die Standardbildungsenthalpie ΔH°_f von elementarem Sauerstoff O₂(g) beträgt:",
        answerA = "−249 kJ/mol (Dissoziationsenthalpie der O=O-Bindung)",
        answerB = "+249 kJ/mol (positive Bildungsenthalpie aus O-Atomen)",
        answerC = "0 kJ/mol per definitionem",
        answerD = "+498 kJ/mol (Energie zur vollständigen Atomisierung)",
        correctAnswer = 2, // C
        explanation = "Per Konvention gilt: Die Standardbildungsenthalpie ΔH°_f jedes Elements in seiner stabilsten Form und Standardaggregatzustand (25°C, 1 bar) ist per definitionem null. Für O₂(g) (stabil, gasförmig): ΔH°_f = 0 kJ/mol. Diese Konvention ist die Referenzbasis für alle thermochemischen Berechnungen. Die Bindungsdissoziationsenthalpie von O₂ (D(O=O) ≈ 498 kJ/mol) ist etwas anderes.",
        difficulty = 3,
        funFact = "Die Konvention ΔH°_f = 0 für Elemente gilt auch für Kohlenstoff als Graphit (nicht Diamant!), da Graphit die stabilere Modifikation bei Standardbedingungen ist. Diamant hat ΔH°_f = +1,9 kJ/mol."
    ),

    // Question 50 – Thermochemistry: Thermochemical cycles
    Question(
        categoryId = 2,
        questionText = "Der Born-Haber-Kreisprozess wird verwendet, um welche Größe zu bestimmen, die experimentell direkt schwer zugänglich ist?",
        answerA = "Die Schmelzwärme von Ionenverbindungen bei Raumtemperatur",
        answerB = "Die Gitterenergie von Ionenkristallen",
        answerC = "Die Elektronegativität von Elementen in ionischen Verbindungen",
        answerD = "Die Reaktionsgeschwindigkeit der Synthese von Salzen aus Elementen",
        correctAnswer = 1, // B
        explanation = "Der Born-Haber-Zyklus ist ein thermochemischer Kreisprozess (Anwendung des Hess'schen Gesetzes) zur indirekten Bestimmung der Gitterenergie U_L. Die Gitterenergie (Energie zur vollständigen Trennung des Ionengitters in Gasphasen-Ionen) ist direkt nicht messbar. Über Sublimationsenthalpie, Ionisierungsenergie, Elektronenaffinität und Bildungsenthalpie lässt sich U_L berechnen. Alternativ: Born-Madelung-Gleichung für theoretische Werte.",
        difficulty = 3,
        funFact = "Der Born-Haber-Zyklus für NaCl ergibt eine Gitterenergie von ca. −787 kJ/mol. Diese enorm hohe Energie erklärt, warum NaCl so schwer zu schmelzen ist (Schmelzpunkt 801°C) und trotzdem gut in Wasser löslich ist (Hydratationsenthalpie kompensiert)."
    )

)
