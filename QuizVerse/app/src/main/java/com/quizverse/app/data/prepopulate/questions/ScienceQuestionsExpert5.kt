package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsExpert5(): List<Question> = listOf(

    // ── Mechanobiology 1 ───────────────────────────────────────────────────────
    // Question 1 — Mechanotransduction: Focal adhesions  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welche molekulare Verbindung ist zentral für die Übertragung mechanischer Kräfte von der extrazellulären Matrix über die Plasmamembran ins Zytoskelett (Mechanotransduktion)?",
        answerA = "Fokale Adhäsionskomplexe, bestehend aus Integrinen, Talin, Vinculin und FAK",
        answerB = "Gap Junctions aus Connexin-Hexameren",
        answerC = "Tight Junctions aus Occludin und Claudin",
        answerD = "Desmosomen aus Desmoglein und Desmocollin",
        correctAnswer = 0, // A
        explanation = "Fokale Adhäsionskomplexe koppeln Integrine (transmembranäre Rezeptoren für ECM-Proteine) über Adaptorproteine wie Talin und Vinculin mit dem Aktinzytoskelett. FAK (focal adhesion kinase) initiiert intrazelluläre Signalkaskaden, sobald mechanische Spannung auf die Integrine wirkt.",
        difficulty = 4,
        funFact = "Talin entfaltet sich unter Zugkraft und exponiert Bindungsstellen für Vinculin — ein molekularer 'Kraft-Sensor' in der Zelle."
    ),

    // Question 2 — YAP/TAZ signaling  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Wie reguliert die Substratsteifigkeit die nukleäre Lokalisation der mechanosensitiven Transkriptionskoaktivatoren YAP und TAZ?",
        answerA = "YAP/TAZ binden direkt an Kollagenfibrillen und werden dadurch ins Zytoplasma exportiert",
        answerB = "Substratsteifigkeit reguliert ausschließlich die mRNA-Stabilität von YAP/TAZ, nicht deren subzelluläre Lokalisation",
        answerC = "Auf weichen Substraten werden YAP/TAZ durch LATS1/2-Phosphorylierung im Zytoplasma zurückgehalten; auf steifen Substraten reduziert hohe Aktinspannung die LATS-Aktivität, sodass YAP/TAZ in den Kern translozieren",
        answerD = "YAP/TAZ sind membrangebundene Rezeptoren, die nur durch Ligandenbindung aktiviert werden",
        correctAnswer = 2, // C
        explanation = "Der Hippo-Signalweg zentralisiert die Steifigkeitssensorik: Auf weichem Substrat ist der Hippo-Weg aktiv, LATS1/2 phosphorylieren YAP/TAZ an Ser127/Ser89, was 14-3-3-Bindung und zytoplasmatische Sequestration oder proteasomalen Abbau bewirkt. Mechanische Spannung inaktiviert den Weg.",
        difficulty = 4,
        funFact = null
    ),

    // Question 3 — Cell stiffness measurement  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welche Methode wird am häufigsten eingesetzt, um die Steifigkeit einzelner lebender Zellen in einem Young-Modul-äquivalenten Wert zu quantifizieren?",
        answerA = "Konfokale Laser-Scanning-Mikroskopie mit FRET-Biosensoren",
        answerB = "Rasterkraft-Mikroskopie (AFM) mit einer weichen Cantilever-Spitze in Indentationsexperimenten, ausgewertet mit dem Hertz-Kontaktmodell",
        answerC = "Westernblot-Analyse von Zytoskelettproteinen",
        answerD = "Durchflusszytometrie mit Propidiumiodid-Färbung",
        correctAnswer = 1, // B
        explanation = "AFM-Nanoindentation erlaubt die Messung lokaler viskoelastischer Eigenschaften lebender Zellen. Das Hertz-Modell verknüpft Eindrücktiefe und Kraft mit dem effektiven Elastizitätsmodul. Typische Werte: Tumorzellen sind oft weicher (< 1 kPa) als normale Epithelzellen.",
        difficulty = 4,
        funFact = "Krebszellen sind im Mittel 5–10-mal weicher als ihre gesunden Gegenstücke — ein möglicher diagnostischer Biomarker."
    ),

    // Question 4 — Tissue mechanics / Durotaxis  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der Begriff 'Durotaxis' in der Zellbiologie?",
        answerA = "Die rhythmische Kontraktion von Herzmuskelzellen unter mechanischem Stress",
        answerB = "Die Apoptose von Zellen bei übermäßiger mechanischer Belastung",
        answerC = "Die Proliferation von Stammzellen auf ultra-weichen Hydrogelen",
        answerD = "Die gerichtete Migration von Zellen entlang eines Steifigkeitsgradienten der extrazellulären Matrix — in Richtung zunehmender Substratsteifigkeit",
        correctAnswer = 3, // D
        explanation = "Durotaxis (auch Mechanotaxis) wurde 2000 von Lo et al. beschrieben: Fibroblasten wandern bevorzugt auf steifere Areale einer Polyacrylamid-Gel-Oberfläche. Dieser Mechanismus spielt bei der Tumorprogression eine Rolle, da Tumorstroma steifer ist als gesundes Gewebe.",
        difficulty = 4,
        funFact = null
    ),

    // Question 5 — Shear stress in endothelium  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welchen primären mechanosensitiven Mechanismus nutzen Endothelzellen, um laminaren Blutfluss-Scherstress wahrzunehmen und atheroprotektive Genexpression zu induzieren?",
        answerA = "Der PECAM-1/VE-Cadherin/VEGFR2-Mechano-Komplex und der KLF2-Transkriptionsfaktor",
        answerB = "G-Protein-gekoppelte Rezeptoren für Adenosin",
        answerC = "Toll-like Rezeptor 4 (TLR4) mit MyD88-Signalweg",
        answerD = "Ryanodinstressorrezeptoren im sarkoplasmatischen Retikulum",
        correctAnswer = 0, // A
        explanation = "Laminarer Scherstress aktiviert den PECAM-1/VE-Cadherin/VEGFR2-Komplex an Zell-Zell-Kontakten, was eNOS-Aktivierung, NO-Produktion und KLF2-Expression bewirkt. KLF2 unterdrückt entzündliche Adhäsionsmoleküle (VCAM-1, ICAM-1) und wirkt so atheroprotektiv. Turbulenter Fluss aktiviert hingegen NF-κB.",
        difficulty = 4,
        funFact = "Atherosklerotische Plaques entstehen bevorzugt an Gefäßbiegungen und -verzweigungen, wo turbulenter statt laminarer Fluss herrscht."
    ),

    // ── Quantum Sensing 2 ──────────────────────────────────────────────────────
    // Question 6 — NV centers  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welche Eigenschaft macht Stickstoff-Fehlstellen-Zentren (NV-Zentren) in Diamant zu herausragenden Quantensensoren für Magnetfelder?",
        answerA = "Sie sind supraleitend unterhalb von 4 K und zeigen Josephson-Effekte",
        answerB = "Ihre Photolumineszenz ist ausschließlich temperatursensitiv, nicht magnetfeldsensitiv",
        answerC = "Ihr Elektronenspin-Triplett-Grundzustand zeigt optisch auslesbare Spinresonanz (ODMR), die bei Raumtemperatur langen Kohärenzzeiten (T₂ ~ Millisekunden) und sub-femtotesla Magnetfeldsensitivität ermöglicht",
        answerD = "NV-Zentren detektieren nur elektrische Felder; für Magnetfelder sind SQUID-Sensoren nötig",
        correctAnswer = 2, // C
        explanation = "NV-Zentren besitzen zwei ungepaarte Elektronen (S=1 Triplett). Die Mikrowellen-Spinresonanzfrequenz verschiebt sich proportional zum externen Magnetfeld (Zeeman-Effekt). Da der ms=0-Zustand heller fluoresziert als ms=±1, ist der Spin optisch auslesbar. Bei Raumtemperatur und in biologischen Proben einsetzbar.",
        difficulty = 4,
        funFact = "NV-Zentren können einzelne Neuronen-Aktionspotenziale magnetisch abbilden und werden als nicht-invasive Nano-MRT-Sonden in lebenden Zellen erprobt."
    ),

    // Question 7 — Atomic clocks  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welches physikalische Prinzip begrenzt die Stabilität moderner optischer Gitteruhren (z. B. Sr oder Yb), und wie wird dieses Limit praktisch überwunden?",
        answerA = "Doppler-Verbreiterung ist das einzige fundamentale Limit; sie wird durch Laserkühlung auf μK eliminiert, womit beliebige Genauigkeit erreichbar ist",
        answerB = "Das Quantenprojektionsrauschen (SQL) begrenzt die Einzelmessungsgenauigkeit; durch Verwendung verschränkter Atome (Spin-Squeezing) kann das Limit um den Faktor √N unterschritten werden",
        answerC = "Schwarzkörperstrahlung des Raumtemperaturgehäuses ist ein rein technisches Problem ohne physikalisches Grundlimit",
        answerD = "Optische Gitteruhren sind durch die Heisenberg-Energie-Zeit-Unschärfe absolut auf 10⁻¹⁸ limitiert und können nicht verbessert werden",
        correctAnswer = 1, // B
        explanation = "Das Standard-Quantenlimit (SQL) entsteht, weil N unabhängige Atome ein Phasenrauschen von 1/√N geben. Mit Spin-Squeezing (Quanten-Verschränkung aller N Atome) skaliert das Rauschen mit 1/N (Heisenberg-Limit). Aktuelle Sr-Gitteruhren erreichen 10⁻¹⁸ Instabilität — sie würden seit dem Urknall weniger als 1 Sekunde abweichen.",
        difficulty = 4,
        funFact = null
    ),

    // Question 8 — Quantum magnetometry / Ramsey  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Welches Messprotokoll wird in der Ramsey-Spektroskopie verwendet, und warum ist es für Quantensensoren vorteilhafter als kontinuierliche Mikrowellenbestrahlung?",
        answerA = "Ein einzelner π-Puls invertiert alle Spins gleichzeitig und misst die Rückkehr zur Gleichgewichtspopulation",
        answerB = "Kontinuierliche Mikrowellen-Einstrahlung erzeugt stehende Wellen im Atomensemble, die direkt das Magnetfeld abbilden",
        answerC = "Ramsey-Spektroskopie ist nur bei Temperaturen unter 10 mK anwendbar und daher für praktische Sensoren ungeeignet",
        answerD = "Zwei π/2-Pulse mit freier Präzessionszeit T zwischen ihnen: Die Phase akkumuliert proportional zur Frequenzverschiebung (Δf·T), was die Sensitivität ~T-mal besser macht als Rabi-Spektroskopie mit Pulsbreite ~1/T",
        correctAnswer = 3, // D
        explanation = "In der Ramsey-Methode bereitet der erste π/2-Puls eine Superposition vor; während T präzediert der Spin frei und sammelt Phaseninformation. Der zweite π/2-Puls konvertiert diese Phase in Populationsbesetzung. Die Linienbreite ~1/T, damit ist für längeres T die Resonanz schärfer und die Feldempfindlichkeit besser.",
        difficulty = 4,
        funFact = "Norman Ramsey erhielt 1989 den Nobelpreis für Physik für diese Methode, die Grundlage aller modernen Atomuhren und Quantensensoren ist."
    ),

    // Question 9 — SQUID devices  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Was ist das Funktionsprinzip eines DC-SQUID (Superconducting QUantum Interference Device) als Magnetfeldsensor?",
        answerA = "Zwei parallele Josephson-Kontakte in einem supraleitenden Ring: Der durch den Ring fließende kritische Strom oszilliert als Funktion des magnetischen Flusses Φ mit der Periode Φ₀ = h/2e",
        answerB = "Ein einzelner Josephson-Kontakt, dessen Spannung linear mit dem Magnetfeld ansteigt",
        answerC = "Ein supraleitender Solenoid, der magnetische Felder durch Fluss-Kompensation auf null reduziert",
        answerD = "Eine Josephson-Tunneldiode, bei der die Energie-Bandlücke durch das Magnetfeld moduliert wird",
        correctAnswer = 0, // A
        explanation = "Im DC-SQUID interferieren die Wellenfunktionen der Cooperpaare an zwei Josephson-Kontakten. Der maximale Suprastrom Ic(Φ) = Ic,max |cos(πΦ/Φ₀)| variiert periodisch mit dem Flussquant Φ₀ ≈ 2,07×10⁻¹⁵ Wb. Durch Flux-Bias nahe Φ₀/2 erhält man maximale Steilheit. SQUIDs erreichen Empfindlichkeiten < 1 fT/√Hz.",
        difficulty = 4,
        funFact = null
    ),

    // Question 10 — Quantum radar  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welches Quantenprinzip wird beim 'Quantum Illumination'-Radar ausgenutzt, und welchen theoretischen SNR-Vorteil bietet es gegenüber klassischen Systemen?",
        answerA = "Quantenradar nutzt Bose-Einstein-Kondensate als Sender und erreicht superluminale Signalgeschwindigkeit",
        answerB = "Gequetschtes Licht verdoppelt die Photonenzahl pro Puls und verbessert so die Reichweite quadratisch",
        answerC = "Verschränkte Signal-Idler-Photonenpaare: Selbst wenn nur das Signal-Photon reflektiert wird, erhöht die Korrelation mit dem gespeicherten Idler-Photon den Signal-Rausch-Abstand um bis zu 6 dB gegenüber dem klassischen Kohärenzzustand gleicher Leistung",
        answerD = "Quantenradar basiert auf dem Meissner-Effekt in supraleitenden Antennen, die klassisches Rauschen abschirmen",
        correctAnswer = 2, // C
        explanation = "Seth Lloyd zeigte 2008, dass Quantum Illumination trotz vollständigen Verschränkungsverlusts bei der Reflexion einen 6-dB-Empfindlichkeitsvorteil behält. Praktische Implementierungen nutzen Mikrowellen-verschränkte Quanten. Der Vorteil ist am größten bei starkem thermischen Hintergrausch.",
        difficulty = 4,
        funFact = "Im Mikrowellenbereich (wo thermisches Rauschen dominiert) ist der Quantum-Illumination-Vorteil am größten — genau der Frequenzbereich militärischer Radarsysteme."
    ),

    // ── Deep Learning for Science 3 ───────────────────────────────────────────
    // Question 11 — Protein structure prediction  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welche architektonische Schlüsselinnovation in AlphaFold2 ermöglicht die präzise Vorhersage der 3D-Proteinstruktur aus der Aminosäuresequenz?",
        answerA = "Ein rekurrentes LSTM-Netz, das die Sekundärstruktur Aminosäure für Aminosäure vorhersagt",
        answerB = "Der Evoformer-Block, der Evolutionsinformation (MSA) und Paarweisedistanzinformation iterativ mit Attention-Mechanismen verarbeitet, kombiniert mit einem Structure-Modul für SE(3)-äquivariante Koordinatengenerierung",
        answerC = "Generative adversarielle Netzwerke (GANs), die aus bekannten Strukturen neue interpolieren",
        answerD = "Monte-Carlo-Tree-Search mit Energiefunktionen aus dem CHARMM-Kraftfeld",
        correctAnswer = 1, // B
        explanation = "AlphaFold2 (DeepMind, 2021) kombiniert: (1) MSA-Transformer im Evoformer zur Kodierung evolutionärer Kovarianzinformation, (2) Paar-Repräsentation für geometrische Relationen, (3) ein invariantes Point-Attention-Modul im Structure-Module, das Backbone-Frames im SE(3)-Raum direkt optimiert. Beim CASP14-Benchmark übertraf es alle Konkurrenten bei weitem.",
        difficulty = 4,
        funFact = "AlphaFold2 hat die Strukturen von über 200 Millionen Proteinen vorhergesagt — mehr als alle bisherigen experimentellen Strukturen zusammen."
    ),

    // Question 12 — Drug discovery ML  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was ist das Prinzip von 'Message Passing Neural Networks' (MPNNs) bei der Vorhersage molekularer Eigenschaften für die Wirkstoffforschung?",
        answerA = "SMILES-Strings werden als 1D-Sequenzen in RNNs kodiert, ohne geometrische Information zu berücksichtigen",
        answerB = "Moleküle werden als 2D-Bilder gespeichert und mit Convolutional Neural Networks (CNNs) klassifiziert",
        answerC = "Quantenmechanische Wellenfunktionen werden direkt als Input verwendet und DFT-Rechnungen ersetzt",
        answerD = "Atome und Bindungen werden als Knoten und Kanten eines Graphen modelliert; iterativ werden Nachrichten zwischen benachbarten Atomen ausgetauscht und aggregiert, sodass die gelernte Darstellung strukturelle und elektronische Eigenschaften kodiert",
        correctAnswer = 3, // D
        explanation = "In MPNNs (z. B. MPNN, D-MPNN/Chemprop, SchNet) aggregiert jede Iteration die chemische Umgebung jedes Atoms über k Bindungsschritte. Nach T Iterationen enthält die Knotenrepräsentation Information aus dem T-hop-Neighborhood. Dies ermöglicht End-to-End-Training auf Aktivitätsdaten und übertrifft klassische Fingerabdruckmethoden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 13 — Climate modeling ML  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welchen methodischen Ansatz verfolgt das ML-Klimamodell 'GraphCast' von Google DeepMind für mittelfristige Wettervorhersagen?",
        answerA = "Ein Graph Neural Network auf einem ikosaedrischen Gitter, das 10-Tages-Vorhersagen in wenigen Sekunden auf einer GPU berechnet und in Tests ECMWF-Modelle übertrifft",
        answerB = "Reinforcement Learning mit dem Klimasystem als Umgebung und CO₂-Reduktion als Belohnungssignal",
        answerC = "Variational Autoencoder, der Klimazustände in einen 32-dimensionalen latenten Raum komprimiert",
        answerD = "Transformer-Modell, das historische Wetterdaten als Sprache behandelt und Tokenprädiktion nutzt",
        correctAnswer = 0, // A
        explanation = "GraphCast (Lam et al., Science 2023) repräsentiert die Atmosphäre als multiresolutionalen Graph. Ein GNN-Encoder projiziert ERA5-Reanalysedaten ins latente Raum, ein Graph-Processor propagiert Information und ein Decoder erzeugt Vorhersagen für alle Druckniveaus. Laufzeit: ~1 Minute vs. Stunden für ECMWF-IFS.",
        difficulty = 4,
        funFact = "GraphCast war das erste ML-Modell, das Hurricane-Zugbahnen 10 Tage im Voraus präziser vorhersagte als traditionelle NWP-Modelle."
    ),

    // Question 14 — Particle physics ML  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welche ML-Architektur wird beim CERN/LHC primär für die Jet-Tagging-Aufgabe verwendet (z. B. b-Jet vs. leichter Jet), und was ist ihre Stärke?",
        answerA = "Lineare Diskriminanzanalyse auf wenigen Variablen wie Transversalimpuls und Pseudorapidität",
        answerB = "Bayesianische Netzwerke mit Prior aus dem Standard-Modell",
        answerC = "Rekurrente Netzwerke (LSTM/GRU) und Graph Neural Networks, die Teilchenspuren als geordnete oder ungeordnete Mengen behandeln und Permutationsinvarianz mit überlegener Trennschärfe kombinieren",
        answerD = "Convolutional Neural Networks auf Kalorimeter-2D-Bildern mit fester Gitterauflösung",
        correctAnswer = 2, // C
        explanation = "Moderne Jet-Tagger wie ParticleNet, PELICAN oder Transformer-basierte JetClass-Modelle behandeln Teilchen als Point Clouds oder Graphen. GNNs auf dem k-nearest-neighbor-Graph über Impulsvariablen kodieren sowohl Impulsinformation als auch Spurparameter (Impact Parameter für B-Hadronen-Identifikation) effizient.",
        difficulty = 4,
        funFact = null
    ),

    // Question 15 — Genomics ML  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Was ist das Trainingsparadigma des Genomics-Foundationsmodells 'Nucleotide Transformer', und wie wird es zur Vorhersage regulatorischer Elemente verwendet?",
        answerA = "Supervised Training ausschließlich auf ChIP-seq-Daten mit binärer Klassifizierung offener Chromatinregionen",
        answerB = "Selbstüberwachtes Pretraining auf ~3000 menschlichen und nichtmenschlichen Genomen durch Masked Language Modeling auf DNA-Sequenzen; Fine-Tuning auf Downstream-Aufgaben wie Enhancer-Erkennung, Spleißstellen- oder TFBS-Vorhersage",
        answerC = "Reinforcement Learning, das Sequenzmutationen einführt und deren Effekt auf Genexpression optimiert",
        answerD = "Variational Autoencoder, der Sequenzevolution im latenten Raum modelliert und Phylogenien generiert",
        correctAnswer = 1, // B
        explanation = "Nucleotide Transformer (Dalla-Torre et al., 2023) ist ein BERT-ähnlicher Transformer mit bis zu 2,5 Mrd. Parametern. Er tokenisiert DNA in k-mers (k=6) und lernt durch MLM kontextuelle Sequenzrepräsentationen. Auf 18 von 18 Benchmark-Aufgaben übertraf das 2,5B-Modell spezialisierte Baselines.",
        difficulty = 4,
        funFact = "Foundationsmodelle für DNA können Transkriptionsfaktor-Bindemotive identifizieren, ohne diese je explizit trainiert bekommen zu haben — emergentes Wissen aus Sequenzkontext."
    ),

    // ── Isotope Geochemistry 4 ─────────────────────────────────────────────────
    // Question 16 — Stable isotope fractionation  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen kinetischer und Gleichgewichts-Isotopenfractionierung, und welche Bindungseigenschaft kontrolliert den Gleichgewichtsfractionierungsfaktor α?",
        answerA = "Kinetische Fractionierung ist immer größer als Gleichgewichts-Fractionierung und dominiert in geologischen Systemen",
        answerB = "Gleichgewichts-Fractionierung ist temperaturunabhängig und dient daher nicht als Paläothermometer",
        answerC = "Stabile Isotopenfractionierung tritt nur bei Elementen mit Z > 30 auf, da leichte Elemente keine Massenunterschiede zeigen",
        answerD = "Gleichgewichts-Fractionierung resultiert aus Nullpunkts-Energiedifferenzen zwischen leichteren und schwereren Isotopologen; schwerere Isotope bevorzugen stärkere Bindungen (höhere Kraftkonstanten). Kinetische Fractionierung entsteht durch Massenabhängigkeit von Diffusion und Reaktionsraten",
        correctAnswer = 3, // D
        explanation = "Die Bigeleisen-Mayer-Gleichung zeigt, dass α−1 ≈ (1/T²) · (h²/8π²kB) · Δ(u²) mit u = hν/kBT. Schwerere Isotope haben niedrigere Nullpunktsenergie und bevorzugen energetisch günstigere (stärkere) Bindungsumgebungen. Bei hoher T nähert sich α→1. Dies ist die Basis für Sauerstoff- und Kohlenstoff-Paläothermometer.",
        difficulty = 4,
        funFact = "Das δ¹⁸O-Verhältnis in Foraminiferen-Carbonaten ist unser wichtigstes Proxy für eiszeitliche Ozeantemperaturen und Eisvolumina."
    ),

    // Question 17 — Radiogenic isotopes  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welches Elternteil-Tochter-System eignet sich am besten zur Datierung von Gesteinen im Alter von 1–4 Milliarden Jahren, und warum?",
        answerA = "Das Rb-Sr-System (⁸⁷Rb → ⁸⁷Sr, t½ = 49 Ga) oder das Sm-Nd-System (¹⁴⁷Sm → ¹⁴³Nd, t½ = 106 Ga), weil ihre Halbwertszeiten groß genug sind, um über Ga-Zeiträume akkurates Messen zu ermöglichen",
        answerB = "Das ¹⁴C-System (t½ = 5730 Jahre), weil es die höchste Präzision bietet",
        answerC = "Das ²³⁸U-²⁰⁶Pb-System ist ungeeignet, da Uran in allen Mineralien homogen verteilt ist",
        answerD = "Das K-Ar-System ist das einzige, das Alter über 1 Ga messen kann",
        correctAnswer = 0, // A
        explanation = "U-Pb (in Zirkon) ist wegen seiner hohen Schließungstemperatur und zwei unabhängigen Uhren (²³⁸U/²⁰⁶Pb + ²³⁵U/²⁰⁷Pb) für präkambrische Gesteine ideal — Konkordiadiagramme erkennen Bleiverlust. Rb-Sr und Sm-Nd liefern Isochron-Alter für mantelartige Prozesse. Alle drei decken den 1–4-Ga-Bereich zuverlässig ab.",
        difficulty = 4,
        funFact = null
    ),

    // Question 18 — Cosmogenic nuclides  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Wie wird ¹⁰Be als kosmogenes Nuklid in der Erdwissenschaft zur Datierung von Gletschererosionsflächen eingesetzt?",
        answerA = "¹⁰Be wird aus dem Meeressediment extrahiert und über die Magnetisierungsstärke des Sediments normiert",
        answerB = "Gletscher produzieren ¹⁰Be durch Kernfusion bei extremem Druck und hinterlassen so eine Datierungssignatur",
        answerC = "Kosmische Strahlung erzeugt ¹⁰Be in Quarz-Mineralen an der Oberfläche durch Spallation; die Konzentration wächst mit der Expositionszeit. Aus dem ¹⁰Be/⁹Be-Verhältnis und der bekannten Produktionsrate ergibt sich das Alter der Freilegung (Expositionsdatierung)",
        answerD = "¹⁰Be entsteht nur in der Stratosphäre durch Myonenreaktionen und wird ausschließlich für atmosphärische Studien genutzt",
        correctAnswer = 2, // C
        explanation = "In-situ-kosmogene Nuklide (¹⁰Be, ²⁶Al, ³⁶Cl, ²¹Ne) akkumulieren in Mineralen in den obersten Metern der Erdkruste mit bekannter Produktionsrate P(z). Exhumierung oder Erosion reduziert die Konzentration. Anwendungen: Gletscherrückzugsdaten, Erosionsraten, Erdbebenfrequenz.",
        difficulty = 4,
        funFact = "Mit ¹⁰Be datierte Moränen lieferten den Beweis, dass der Yellowstone-Gletscher während der Letzten Glazialen Maxima vor ~18.000 Jahren seine größte Ausdehnung hatte."
    ),

    // Question 19 — Clumped isotopes  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Was messen 'Clumped Isotopes' (z. B. Δ₄₇ in Carbonaten), und welche geowissenschaftliche Anwendung macht sie besonders wertvoll?",
        answerA = "Die Gesamtkonzentration aller schweren Isotope in einem Mineral",
        answerB = "Die Häufigkeit seltener Isotopologe mit zwei seltenen Isotopen in derselben Moleküleinheit (z. B. ¹³C¹⁸O¹⁶O₂²⁻): Ihre Überhäufigkeit über stochastische Verteilung ist temperaturabhängig und erlaubt absolute Paläotemperatur-Rekonstruktionen unabhängig vom Wasser-δ¹⁸O",
        answerC = "Das Verhältnis von ¹³C zu ¹²C ausschließlich in organischem Material",
        answerD = "Die Häufigkeit kosmogener Nuklide in Meteoriten für Alters-Datierungen",
        correctAnswer = 1, // B
        explanation = "Clumped-Isotop-Thermometrie (Ghosh et al., 2006) nutzt, dass die Bildungsenergie von ¹³C-¹⁸O-Bindungen im Carbonat-Ion temperaturabhängig ist. Da weder δ¹³C noch δ¹⁸O des Bildungswassers bekannt sein müssen, ist Δ₄₇ ein echter Einzel-Mineral-Thermometer. Präzision: ±2–5°C.",
        difficulty = 4,
        funFact = null
    ),

    // Question 20 — Triple oxygen isotopes  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen massabhängiger und massenunabhängiger Sauerstoff-Isotopenfractionierung, und wo tritt letztere auf?",
        answerA = "Massenunabhängige Fractionierung tritt bei allen biologischen Prozessen auf und ist der Normalfall",
        answerB = "¹⁷O wird nur in Supernova-Überresten produziert; auf der Erde gibt es keine Fractionierung dieses Isotops",
        answerC = "Massabhängige Fractionierung ist ausschließlich in flüssigem Wasser möglich, massenunabhängige nur in der Gasphase",
        answerD = "Bei massabhängiger Fractionierung gilt δ¹⁷O ≈ 0,52·δ¹⁸O (terrestrische Fraktionierungslinie); massenunabhängige Fractionierung zeigt Abweichungen Δ¹⁷O ≠ 0 und tritt bei Photolyse stratosphärischer Spurengase (O₃, CO₂) und in präsolaren Staubkörnern auf",
        correctAnswer = 3, // D
        explanation = "Mark Thiemens entdeckte 1983 massenunabhängige Fractionierung (MIF) bei O₃-Photolyse. Δ¹⁷O = δ¹⁷O − 0,52·δ¹⁸O dient als Tracer für stratosphärischen Eintrag in Sulfate und Nitrate (Atmosphärenchemie) sowie für frühe Sonnensystem-Prozesse in CAIs (Calcium-Aluminium-reiche Einschlüsse) in Meteoriten.",
        difficulty = 4,
        funFact = "CAIs im Allende-Meteoriten zeigen Δ¹⁷O von −40‰ — ein Fingerabdruck, der zeigt, dass unser Sonnensystem Staubkörner aus anderen Sternen geerbt hat."
    ),

    // ── Chromosome Biology 5 ──────────────────────────────────────────────────
    // Question 21 — Telomere maintenance  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welche zwei Mechanismen der Telomerverlängerung existieren in humanen Zellen, und welcher dominiert in somatischen Tumorzellen?",
        answerA = "Telomerase (hTERT + hTERC: RNA-abhängige DNA-Polymerase, die TTAGGG-Repeats synthetisiert) und ALT (Alternative Lengthening of Telomeres, homologiebasierter Rekombinationsmechanismus); ~85 % der Tumorzellen nutzen Telomerase",
        answerB = "Telomere werden ausschließlich durch DNA-Replikation verlängert; ohne Verlängerungsmechanismus schrumpfen sie irreversibel",
        answerC = "ALT dominiert in >90 % aller Tumorzellen; Telomerase ist nur in embryonalen Stammzellen aktiv",
        answerD = "Retrotransposons kopieren sich an Telomere und ersetzen dadurch den Telomerase-Mechanismus",
        correctAnswer = 0, // A
        explanation = "Telomerase ist ein Ribonukleoprotein-Komplex: hTERT (katalytische Reverse Transkriptase) verlängert TTAGGG-Repeats unter Verwendung der hTERC-RNA als Matrize. ALT nutzt Break-Induced Replication und wird in ~15 % der Tumoren (oft Sarkom, Gliom) verwendet. Somatische Zellen exprimieren keine Telomerase — daher Hayflick-Limit.",
        difficulty = 4,
        funFact = "Die Entdeckung der Telomerase durch Blackburn, Greider und Szostak wurde 2009 mit dem Nobelpreis für Physiologie/Medizin ausgezeichnet."
    ),

    // Question 22 — Centromere structure  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welches epigenetische Merkmal definiert das Zentromer eines humanen Chromosoms, und warum ist die DNA-Sequenz allein unzureichend?",
        answerA = "Das Zentromer ist durch eine spezifische 17-bp-DNA-Konsensussequenz definiert, die in allen Eukaryoten konserviert ist",
        answerB = "Heterochromatin-Marker H3K9me3 definiert ausschließlich das Zentromer; CENP-A spielt eine untergeordnete Rolle",
        answerC = "Das Histon-Variante CENP-A (ein H3-Ersatz) bildet Zentromernukleosome und rekrutiert den CCAN (Constitutive Centromere-Associated Network); Neozentromer auf nicht-α-Satelliten-DNA beweisen, dass die Sequenz nicht ausreicht",
        answerD = "Das Zentromer wird durch RNA-Interferenz gegen α-Satelliten-Sequenzen epigenetisch markiert",
        correctAnswer = 2, // C
        explanation = "Neozentromerbildung auf ektopischer DNA ohne α-Satelliten zeigt, dass CENP-A-Chromatindomänen epigenetisch vererbt werden. CENP-A-Nukleosome rekrutieren das CCAN (CENP-B/C/N/T/W/S/X/M/I/K/L), den Kinetochoraußenring (KMN-Netz: KNL1, Mis12, Ndc80) und vermitteln so die Spindel-Chromosom-Kopplung.",
        difficulty = 4,
        funFact = null
    ),

    // Question 23 — Sister chromatid cohesion  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welches molekulare Prinzip sichert die Schwesterchromatid-Kohäsion bis zur Anaphase, und wie wird sie dann aufgelöst?",
        answerA = "Histondeacetylierung verbindet Schwesterchromatiden bis zur Anaphase; Acetylierung trennt sie",
        answerB = "Der Cohesin-Ringkomplex (SMC1/SMC3/RAD21/SA) umschließt topologisch beide Chromatiden; in der Anaphase spaltet Separase die RAD21-Untereinheit, nachdem der APC/C-Ubiquitinligase-Komplex den Separase-Inhibitor Securin abgebaut hat",
        answerC = "DNA-Topoisomerase II verknüpft Schwesterchromatiden kovalent; im Anaphase-Übergang löst Topoisomerase I diese Bindungen",
        answerD = "Mikrotubuli-Motoren schieben Schwesterchromatiden auseinander, ohne biochemische Trennung der Verbindung",
        correctAnswer = 1, // B
        explanation = "Das Cohesin-Modell (Nasmyth, 2001): Der SMC1/SMC3-Arm bildet eine ATPase-getriebene Zangenstruktur, die zusammen mit Kleisin (RAD21) einen Ring um beide Chromatiden bildet. Der Anaphase-Promoting Complex (APC/C-Cdc20) ubiquitiniert Securin (Pttg1); freigesetztes Separase schneidet RAD21, öffnet den Ring und erlaubt Chromatidentrennung.",
        difficulty = 4,
        funFact = "Fehler in der Schwesterchromatid-Kohäsion führen zu Aneuploidie — einer der häufigsten genetischen Defekte in Krebszellen."
    ),

    // Question 24 — Chromosome condensation  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Welches Proteinkomplex ist der zentrale Motor der mitotischen Chromosomenkondensation, und wie erzeugt er kompakte Chromatinschleifen?",
        answerA = "HP1-Protein vernetzt Heterochromatin-Domänen durch Liquid-Liquid-Phasenseparation zur Kondensation",
        answerB = "Histon-H1 allein ist ausreichend für mitotische Kondensation; SMC-Komplexe sind dispensabel",
        answerC = "RNA-Polymerase-II-Inhibition bei Mitoseeintritt ist der einzige notwendige Schritt zur Chromosomenkondensation",
        answerD = "Der Condensin-I/II-Komplex (SMC2/SMC4 + drei nicht-SMC-Untereinheiten) treibt durch ATP-abhängige Schleifenextrusion die Bildung kompakter ~200-nm-Chromatinschlaufen auf einem protein-axialen Gerüst",
        correctAnswer = 3, // D
        explanation = "Electron-Microscopy-Daten und Hi-C-Experimente zeigen, dass Condensin aktiv DNA-Schleifen extrudiert (Loop Extrusion Model, Sanborn et al. 2015; Fudenberg et al. 2016). Condensin II kondensiert im Zellkern (frühe Prophase), Condensin I nach Kernhüllauflösung. Cdk1/Cyclin-B-Phosphorylierung aktiviert Condensin zum Mitoseeintritt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 25 — Nuclear lamina  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Wie beeinflusst die Kernlamina die Chromatinorganisation, und welche Krankheiten entstehen bei Lamin-Mutationen (Laminopathien)?",
        answerA = "Lamin A/C und B bilden ein IF-Netzwerk an der Kernhülle; LADs (Lamina-Associated Domains, ~30 % des Genoms) sind transkriptionell supprimiertes Heterochromatin. LMNA-Mutationen verursachen Hutchinson-Gilford-Progerie, Emery-Dreifuss-Muskeldystrophie und dilatative Kardiomyopathie",
        answerB = "Die Kernlamina ist nur ein mechanisches Gerüst ohne Einfluss auf Genexpression; Laminopathien sind Strukturdefekte der Zellmembran",
        answerC = "Lamin B1 reguliert ausschließlich die DNA-Replikation in der S-Phase; Lamin A ist für die Transkription zuständig",
        answerD = "LADs sind die transkriptionell aktivsten Chromatin-Domänen im Interphasekern",
        correctAnswer = 0, // A
        explanation = "LAD-Repositionierung bei Differenzierung zeigt, dass Lamina-Kontakte Genexpression aktiv regulieren. Beim Progerie-Syndrom (HGPS) produziert eine Spleißmutation in LMNA ein abnormes Lamin A (Progerin), das den Kernhüllaufbau stört, DNA-Schäden akkumuliert und zur vorzeitigen Seneszenz führt. Patienten altern 7-fach schneller.",
        difficulty = 4,
        funFact = "Kinder mit Hutchinson-Gilford-Progerie sehen mit 10 Jahren wie 70-Jährige aus und sterben meist vor dem 15. Lebensjahr an Herzinfarkt."
    ),

    // ── Soft Matter Physics 6 ─────────────────────────────────────────────────
    // Question 26 — Colloids  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Was bestimmt die Stabilität einer kolloidalen Suspension nach der DLVO-Theorie, und unter welcher Bedingung kommt es zur Koagulation?",
        answerA = "Kolloidale Stabilität wird ausschließlich durch sterische Repulsion (Polymer-Brush) bestimmt; elektrostatische Kräfte sind vernachlässigbar",
        answerB = "Nach DLVO dominiert bei allen Abständen immer die van-der-Waals-Kraft, weshalb Kolloide immer koagulieren",
        answerC = "DLVO kombiniert elektrostatische Abstoßung (Debye-Hückel-Schicht) und van-der-Waals-Anziehung; Koagulation tritt auf, wenn die Ionenstärke ausreichend hoch ist, um die elektrostatische Barriere (kritische Koagulationskonzentration, CKK) zu unterdrücken",
        answerD = "Koagulation hängt nur von der Partikelgröße ab; die Ionenstärke hat keinen Einfluss",
        correctAnswer = 2, // C
        explanation = "DLVO (Derjaguin, Landau, Verwey, Overbeek, ~1940): V_DLVO = V_el + V_vdW. V_el ~ exp(−κr) mit Debye-Länge κ⁻¹ ~ 1/√I. Bei hoher Ionenstärke I schrumpft κ⁻¹, das sekundäre Maximum sinkt unter kBT, und van-der-Waals-Attraktion dominiert → irreversible Aggregation. Die Schulze-Hardy-Regel beschreibt die κ⁶-Abhängigkeit der CKK von der Ionenwertigkeit.",
        difficulty = 4,
        funFact = null
    ),

    // Question 27 — Liquid crystals  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen nematischen von einem smektischen Flüssigkristall hinsichtlich Ordnungsgrad und Symmetrie?",
        answerA = "Smektische LC sind weniger geordnet als nematische; sie haben weder Orientierungs- noch Positionsordnung",
        answerB = "Nematische LC haben nur Orientierungsordnung (Direktor n̂ parallel), keine Positionsordnung; smektische LC haben zusätzlich translatorische Schichtordnung (Layers), wobei smA senkrechte und smC geneigte Molekülausrichtung zeigt",
        answerC = "Nematische LC bilden zweidimensionale Kristallgitter; smektische LC sind vollständig isotrop",
        answerD = "Der Unterschied liegt nur in der Viskosität: Nematika sind viskoser als Smektika",
        correctAnswer = 1, // B
        explanation = "Nematika: Orientierungsordnungsparameter S = ½⟨3cos²θ−1⟩ > 0, keine Translationsordnung. Smektika (A, B, C, ...): Zusätzliche 1D-Dichte-Welle (Schichtperiode d). SmB zeigt Sechseck-in-Plane-Ordnung. Die Phasenübergänge isotropisch→nematisch→smektisch sind typisch für stabförmige kalamitische Mesogene. LCD-Displays nutzen Nematika mit elektrischer Direktorkontrolle.",
        difficulty = 4,
        funFact = "Nematische Flüssigkristalle im LC-Display reagieren auf ~1 V und schalten in Mikrosekunden — Billionen solcher Pixel bilden moderne 4K-Bildschirme."
    ),

    // Question 28 — Surfactants  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was ist die kritische Mizellenkonzentration (CMC), und wie hängt die Mizellenform von der dimensionslosen Packungsgeometrie (critical packing parameter, CPP) ab?",
        answerA = "Die CMC ist die maximale Löslichkeitskonzentration von Tensiden; oberhalb bildet sich immer ein Niederschlag",
        answerB = "CPP > 1 führt stets zu sphärischen Mizellen; bei CPP < 1 entstehen ausschließlich Vesikel",
        answerC = "Die Mizellenform hängt ausschließlich von der Temperatur ab, nicht von der Molekülgeometrie",
        answerD = "Die CMC ist die Konzentration, oberhalb derer Amphiphile spontan zu Mizellen aggregieren (Gleichgewicht freier Monomer ↔ Aggregat); CPP = v/(a₀·lc): CPP < ⅓ → sphärische Mizellen, ⅓–½ → Zylinder, ½–1 → Vesikel/Lamellen, > 1 → inverse Mizellen",
        correctAnswer = 3, // D
        explanation = "Das Israelachvili-CPP-Konzept erklärt aggregierte Strukturen aus der Molekülgeometrie: v (Volumen Kohlenwasserstoffschwanz), a₀ (optimale Kopfgruppenfläche), lc (Kettenlänge). Konische Moleküle (kl. Schwanz, gr. Kopf, CPP<⅓) bevorzugen positive Krümmung → sphärische Mizellen; zylindrische (CPP≈1/2) bilden Bilayer/Vesikel.",
        difficulty = 4,
        funFact = null
    ),

    // Question 29 — Gels  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Was ist der Gelationspunkt in einem Polymer-Netzwerk nach der Perkolationstheorie, und wie verhält sich die Schermoduli G' und G'' in seiner Nähe?",
        answerA = "Am Gelationspunkt (Perkolationsschwelle pc) überspannt das Netzwerk erstmals das gesamte System; G' und G'' zeigen ein Potenzgesetz G' ~ G'' ~ ωⁿ mit n ≈ 0,5–0,7, d. h. sie sind frequenzidentisch und gleich groß (Winter-Chambon-Kriterium)",
        answerB = "Am Gelationspunkt wird G' = 0 und G'' divergiert, was durch DSC-Messung detektiert wird",
        answerC = "Gelation tritt ausschließlich bei Temperaturunterschreitung auf und hat kein frequenzabhängiges rheologisches Signal",
        answerD = "Am Gelationspunkt wird das System vollständig starr mit G' >> G'' über alle Frequenzen",
        correctAnswer = 0, // A
        explanation = "Das Winter-Chambon-Kriterium (1986) definiert den Gelationspunkt durch tan δ = G''/G' = const (unabhängig von ω). Für perkolierende Netzwerke gilt G* ~ (p−pc)^t mit Perkolations-Exponenten t ≈ 1,9 in 3D. Dieses Konzept gilt für chemische Gele (Vernetzungsreaktion), physikalische Gele und kolloidale Netzwerke.",
        difficulty = 4,
        funFact = "Das Winter-Chambon-Kriterium wird heute routinemäßig eingesetzt, um Gelationspunkte in Biomaterialien, Lebensmittel-Gelen und Zement-Hydratation zu bestimmen."
    ),

    // Question 30 — Foams  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus dominiert den Zerfall wässriger Schäume im Laufe der Zeit, und welche Variable bestimmt die Alterungsrate am stärksten?",
        answerA = "Schwerkraftinduzierter Drainage (Draining) ist der einzige Zerfallsmechanismus; Gasaustausch spielt keine Rolle",
        answerB = "Koaleszenz durch Lamellendünnung dominiert immer, bevor Ostwaldreifung signifikant wird",
        answerC = "Ostwaldreifung (Diffusion von Gas aus kleinen in große Blasen getrieben durch Laplace-Druckdifferenz ΔP = 2γ/r); die Gaslöslichkeit im Wasser ist die entscheidende Variable",
        answerD = "Schäume sind thermodynamisch stabil, wenn die Tensidkonzentration über der CMC liegt; sie zerfallen daher nicht",
        correctAnswer = 2, // C
        explanation = "In Schäumen konkurrieren drei Prozesse: (1) Drainage (Schwerkraft/Kapillarität), (2) Koaleszenz (Filmriss), (3) Ostwaldreifung. Bei stabilisierten Filmen dominiert Ostwaldreifung: Gase mit hoher H₂O-Löslichkeit (CO₂, N₂O) diffundieren schnell → kurze Schaumlebensdauer. SF₆ (niedrige Löslichkeit) erzeugt außerordentlich stabile Schäume.",
        difficulty = 4,
        funFact = null
    ),

    // ── Regenerative Medicine 7 ───────────────────────────────────────────────
    // Question 31 — iPSC technology  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welche vier Transkriptionsfaktoren verwendete Yamanaka 2006 zur Reprogrammierung somatischer Mauszellen zu pluripotenten Stammzellen (iPSCs), und was sind die wichtigsten Sicherheitsbedenken bei therapeutischen Anwendungen?",
        answerA = "Nanog, Lin28, Rex1, Sall4; keine Sicherheitsbedenken, da alle Faktoren ubiquitär exprimiert werden",
        answerB = "Oct4, Sox2, Klf4, c-Myc (OSKM); Hauptbedenken: genomische Integration viraler Vektoren, c-Myc als Proto-Onkogen erhöht Tumorisierungsrisiko, epigenetische Instabilität und immunogene Reste",
        answerC = "p53, Rb, BRCA1, TP53; diese Tumorsuppressoren dienen der Genomstabilisierung in iPSCs",
        answerD = "CRISPR-Cas9 allein kann Fibroblasten ohne Transkriptionsfaktoren in iPSCs umwandeln",
        correctAnswer = 1, // B
        explanation = "Yamanaka und Kollegen (Cell 2006) verwendeten retrovirale Überexpression von Oct4 (Pou5f1), Sox2, Klf4 und c-Myc. Sicherheitsbedenken: c-Myc reaktiviertes Onkogen, Insertionsmutagenese. Neuere Protokolle: episomale Vektoren, mRNA-Transfektion, Sendai-Virus (nicht-integrierend) oder kleine Moleküle. iPSCs werden in klinischen Studien für AMD und Parkinson erprobt.",
        difficulty = 4,
        funFact = "Für diese Entdeckung erhielt Shinya Yamanaka 2012 den Nobelpreis für Physiologie/Medizin — geteilt mit John Gurdon."
    ),

    // Question 32 — Organoids  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was sind die wesentlichen biologischen Voraussetzungen, damit ein Organoid aus Stammzellen entsteht, und warum sind Organoide gegenüber 2D-Zellkultur überlegen für Wirkstofftests?",
        answerA = "Organoide entstehen nur aus embryonalen Stammzellen, nie aus adulten Geweben oder iPSCs",
        answerB = "2D-Kultur ist für Wirkstofftests ausreichend; Organoide bieten keinen Mehrwert bezüglich Geweberelevanz",
        answerC = "Organoide benötigen kein Matrigel; sie wachsen spontan in Suspension ohne exogene Signalmoleküle",
        answerD = "Stammzellen benötigen eine 3D-ECM-Matrix (z. B. Matrigel/BME), lösliche Signalmoleküle (Wnt, EGF, Noggin, R-Spondin) und Selbstorganisationsvermögen; Organoide recapitulieren Gewebearchitektur, Zelltyp-Diversität und patientenspezifische genetische Hintergründe",
        correctAnswer = 3, // D
        explanation = "Hans Clevers' Labor zeigte 2009, dass Darmkrypten-Stammzellen in Matrigel mit Wnt3A, EGF und Noggin zu Miniatur-Darmorganoiden heranwachsen. Heute existieren Organoide aus Leber, Niere, Gehirn, Pankreas, Lunge. Patient-derived Organoids (PDOs) von Tumoren spiegeln die Medikamentenresistenz des Primärtumors wider — in < 2 Wochen.",
        difficulty = 4,
        funFact = "Gehirn-Organoide (Zerebrale Organoide) bildeten 2013 kortikale Neuronenschichten — ein Meilenstein in der Erforschung der menschlichen Gehirnentwicklung."
    ),

    // Question 33 — Tissue scaffolds  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welche Anforderungen muss ein ideales Gewebegerüst (Scaffold) für den Knochen-Tissue-Engineering erfüllen hinsichtlich Mechanik, Porosität und Biodegradation?",
        answerA = "Druckfestigkeit 100–500 MPa (trabekulär: 2–50 MPa), >70 % Porosität mit Makroporen >300 μm für Vaskularisierung und Zelleinwanderung, Mikroporen für Nährstoffdiffusion, Biodegradationsrate abgestimmt auf Knochenneubildung (3–12 Monate), Osteokonduktivität",
        answerB = "Maximale Steifigkeit (>10 GPa) ohne Poren für mechanische Lastübertragung; Biodegradation ist unerwünscht",
        answerC = "Porosität < 10 % verhindert Bakterienbesiedlung und ist ideal für infektionsresistente Implantate",
        answerD = "Scaffolds müssen nicht biodegradieren; dauerhafte Titangitter sind gleichwertig zu biologischen Matrices",
        correctAnswer = 0, // A
        explanation = "Kortikaler Knochen: E ~15–25 GPa, Druckfestigkeit ~130–180 MPa; trabekulär: E ~0,1–5 GPa. Scaffolds aus HA/TCP, PLGA, PCL oder Seidenfibroin müssen diese Eigenschaften graduell über 6–12 Monate übertragen, während Osteoblasten neues Knochengewebe ablagern. Mikro/Makro-bimodale Porennetzwerke sind entscheidend.",
        difficulty = 4,
        funFact = null
    ),

    // Question 34 — Bioprinting  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Was sind die entscheidenden Unterschiede zwischen Extrusions-, Inkjet- und Stereolithographie-basiertem Bioprinting hinsichtlich Auflösung, Zellviabilität und Materialkompatibilität?",
        answerA = "Alle drei Methoden haben identische Auflösung und Zellviabilität; der Unterschied liegt nur in der Druckgeschwindigkeit",
        answerB = "Nur Extrusionsdruck kann lebende Zellen einschließen; Inkjet und SLA sind zellfreie Methoden",
        answerC = "Extrusion: niedrige Auflösung (200–1000 μm), hohe Zellviabilität (~85–95 %), viskose Hydrogele; Inkjet: hohe Auflösung (20–100 μm), gute Viabilität, niedrige Viskosität; SLA/DLP: hohe Auflösung (10–50 μm), erfordert photopolymerisierbare Bioinks mit UV-toleranten Zellen",
        answerD = "SLA bietet die niedrigste Auflösung (>1 mm), ist aber die einzige Methode für strukturell stabiles Knorpelgewebe",
        correctAnswer = 2, // C
        explanation = "Extrusion-Bioprinting (FDM-ähnlich) extrudiert Zell-Hydrogel-Mischungen durch Düsen — skalierbar aber limitierte Auflösung. Inkjet-Printing (thermisch/piezoelektrisch) erlaubt präzise Droplet-Kontrolle. DLP-Bioprinting (Layer-by-Layer-Photopolymerisation) erreicht sub-100-μm-Auflösung, erfordert aber fotoreaktive Gruppen (GelMA, PEGDA) und UV-tolerante Zellen.",
        difficulty = 4,
        funFact = "2022 druckte ein Team die ersten vollständig vaskularisierten Herzgewebepatches im 3D-Bioprinter — ein Schritt in Richtung funktionelles Herzersatzgewebe."
    ),

    // Question 35 — Immune tolerance for transplants  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welche zelluläre Strategie wird untersucht, um iPSC-abgeleitete Transplantate 'universal kompatibel' zu machen und eine Immunreaktion zu vermeiden?",
        answerA = "Systemische Immunsuppression mit Cyclosporin A reicht aus; genetische Modifikationen von Spenderzellen sind nicht nötig",
        answerB = "Knockout von MHC-I/II und β₂-Mikroglobulin sowie Expression von HLA-E/CD47/PD-L1/CD200 zur Hemmung von NK-Zellen und T-Zellen ('Stealth-Cells' oder 'hypoimmune iPSCs')",
        answerC = "Xenotransplantation von Schweineorganen löst das Problem der Immuntoleranz vollständig ohne Immunsuppression",
        answerD = "HLA-Matching allein ist ausreichend; NK-Zell-Aktivierung spielt bei iPSC-Transplantaten keine Rolle",
        correctAnswer = 1, // B
        explanation = "MHC-I-Knockout verhindert CD8-T-Zell-Erkennung, löst aber NK-Zell-Aktivierung aus (missing self). Die Expression von CD47 ('don't eat me signal'), HLA-E (NK-Inhibitor über KIR2DL1) und PD-L1 (T-Zell-Checkpoint) unterdrückt alle drei Immunarme. Cowan und Bhatt zeigten 2019 in Mäusen langfristiges Überleben solcher hypoimmune iPSC-Derivate ohne Immunsuppression.",
        difficulty = 4,
        funFact = null
    ),

    // ── Chemical Biology 8 ───────────────────────────────────────────────────
    // Question 36 — Chemical probes  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Welche Mindestanforderungen muss eine chemische Sonde (chemical probe) erfüllen, um als zuverlässiges Werkzeug zur Untersuchung einer Protein-Funktion in lebenden Zellen zu gelten?",
        answerA = "Ein Ki < 10 μM im biochemischen Assay ist ausreichend; zelluläre Aktivität muss nicht nachgewiesen werden",
        answerB = "Chemische Sonden müssen kovalent binden; reversible Inhibitoren sind per Definition keine Sonden",
        answerC = "Jede Verbindung mit pharmazeutischer Zulassung gilt automatisch als validierte chemische Sonde",
        answerD = "Zellpermeabilität, subnanomolare Potenz (Kd < 100 nM), ≥30-fache Selektivität über verwandte Proteine, verfügbares negatives Kontroll-Derivat (inaktives Strukturanalogon) und publizierte zelluläre Validierung",
        correctAnswer = 3, // D
        explanation = "Das Chemical Probes Portal (chemicalprobes.org) und die SGC-Richtlinien definieren strenge Kriterien. Ein negativer Kontroll-Compound (mit einer Punktmutation im Bindemotiv oder einem einzigen Methyl-Flip) ist entscheidend, um Off-Target-Effekte zu kontrollieren. Historische Probleme mit unkritisch verwendeten Inhibitoren (LY294002, SB203580) motivierten diese Standards.",
        difficulty = 4,
        funFact = "Die PROTACs (bifunktionelle Degrader) gelten als nächste Generation chemischer Sonden, da sie Proteine katalytisch abbauen statt nur inhibieren."
    ),

    // Question 37 — Activity-based profiling  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Was ist 'Activity-Based Protein Profiling' (ABPP), und welche chemische Reaktivität nutzt es, um aktive Enzymformen in komplexen Proteomen zu identifizieren?",
        answerA = "ABPP verwendet reaktive 'Activity-Based Probes' mit Warhead (kovalent-reaktive Gruppe für aktive Enzyme), Linker und Reporter-Tag (Fluorophor/Biotin); nur katalytisch aktive Enzymformen reagieren, nicht latente oder inhibierte Formen",
        answerB = "ABPP ist eine massenspektrometrische Methode, die alle Proteine unabhängig von ihrer Aktivität quantifiziert",
        answerC = "ABPP nutzt RNA-Sequenzierung zur indirekten Messung von Enzymaktivität über mRNA-Level",
        answerD = "ABPP basiert auf Antikörper-Sandwich-ELISA und misst Proteinkonzentration, nicht Aktivität",
        correctAnswer = 0, // A
        explanation = "Cravatt et al. (1999) entwickelten die ersten ABPP-Sonden für Serinhydrolasen (Fluorophosphonat-Warhead). Die ABP-Reaktion ist mechanismusbasiert: Der Warhead reagiert kovalent mit dem aktiven Zentrum. Nach Pulldown/Gel-Separation oder LC-MS/MS werden aktive Enzyme identifiziert. ABPP deckte neuartige Serinhydrolasen im Krebsmetabolom auf.",
        difficulty = 4,
        funFact = null
    ),

    // Question 38 — Bioorthogonal chemistry  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Welche zwei Reaktionen gelten als Goldstandard in der bioorthogonalen Chemie für die Markierung von Biomolekülen in lebenden Organismen, und was macht sie bioorthogonal?",
        answerA = "Biotin-Streptavidin-Bindung und NHS-Ester-Aminogruppen-Reaktion; beide gelten als bioorthogonal, da sie kovalent und irreversibel sind",
        answerB = "Maleimid-Thiol und Amin-NHS sind bioorthogonale Reaktionen; sie reagieren nicht mit endogenen Zellkomponenten",
        answerC = "Staudinger-Ligation (Azid + Phosphin) und Tetrazin/trans-Cycloocten-Diels-Alder-Reaktion (IEDDA): beide reagieren schnell und selektiv mit nicht-natürlichen funktionellen Gruppen, die in biologischen Systemen fehlen (keine nativen Azide, Tetrazine oder gespannte Alkene im Zellmetabolom)",
        answerD = "Bioorthogonale Reaktionen sind definiert durch ihre Geschwindigkeitskonstante k > 10⁶ M⁻¹s⁻¹, unabhängig von der chemischen Selektivität",
        correctAnswer = 2, // C
        explanation = "Carolyn Bertozzi (Nobelpreis Chemie 2022) definierte bioorthogonale Chemie als Reaktionen, die in lebenden Systemen ablaufen ohne mit endogenen Funktionalitäten zu kreuzen. IEDDA (k ~ 10³–10⁶ M⁻¹s⁻¹) ist heute die schnellste bioorthogonale Reaktion und erlaubt in-vivo-Zellmarkierung in Echtzeit. Azide werden über unnatürliche Zuckervorstufen metabolisch in Glykoproteine eingebaut.",
        difficulty = 4,
        funFact = "Carolyn Bertozzi erhielt 2022 den Nobelpreis für Chemie für die Entwicklung bioorthogonaler Reaktionen — gemeinsam mit Morten Meldal und Barry Sharpless."
    ),

    // Question 39 — Targeted protein degradation  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Wie unterscheidet sich das PROTAC-Konzept mechanistisch von klassischen Inhibitoren, und welchen therapeutischen Vorteil bietet die katalytische Wirkweise?",
        answerA = "PROTACs hemmen dauerhaft das 26S-Proteasom und reduzieren so alle Proteine unselektiv",
        answerB = "PROTACs sind bifunktionale Moleküle, die gleichzeitig eine E3-Ligase (z. B. CRBN, VHL) und das Zielprotein binden, um Ubiquitinierung und proteasomalen Abbau zu induzieren; da der PROTAC nach dem Abbau recycelt wird, reichen sub-stoichiometrische Mengen aus (katalytischer Mechanismus), und undruggable Proteine mit flachen Bindungstaschen werden zugänglich",
        answerC = "PROTACs sind kovalente Inhibitoren, die das Zielprotein irreversibel inaktivieren, ohne es abzubauen",
        answerD = "PROTACs wirken nur außerhalb der Zelle und müssen daher intravenös injiziert werden",
        correctAnswer = 1, // B
        explanation = "Das PROTAC-Konzept (Sakamoto et al., 2001; Craig Crews/Alessio Ciulli) nutzt den zellulären Ubiquitin-Proteasom-Weg. Nach Abbau des Zielproteins dissoziiert der PROTAC und kann erneut binden ('event-driven pharmacology'). Vorteil: Überwindung von Resistenzen durch Proteinmutation im Bindemotiv (Hook-Effekt bei zu hoher PROTAC-Konzentration zu beachten).",
        difficulty = 4,
        funFact = null
    ),

    // Question 40 — Chemical genetics  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Was ist das 'bump-and-hole'-Prinzip in der chemischen Genetik, und wie ermöglicht es die selektive Inhibition eines einzelnen Kinase-Allels in einer Zelle?",
        answerA = "Bump-and-hole beschreibt die komplementäre Form von Antigen und Antikörper; es hat keinen Bezug zu Kinasen",
        answerB = "Bei dieser Methode wird die Kinase durch CRISPR vollständig ausgeschaltet und durch einen viralen Vektor ersetzt",
        answerC = "Der 'bump' ist ein fluoreszenter Reporter, der nur an aktivierte Kinasen bindet und die Signalwegsaktivität visualisiert",
        answerD = "Eine Kinase wird mutiert, um eine vergrößerte ATP-Bindetasche zu erzeugen ('hole'); ein speziell synthetisierter, raumfüllender Inhibitor mit Bulksubstituenten ('bump') passt nur in diese mutierte Kinase, nicht in Wildtyp-Kinasen — analog-sensitive (as) Kinase",
        correctAnswer = 3, // D
        explanation = "Kevan Shokat entwickelte das as-Kinase-System (analog-sensitive): Mutation der 'Gatekeeper'-Aminosäure (oft Threonin/Met) zu Glycin/Alanin erzeugt Raum für einen Phenyl- oder Naphthyl-Substituenten am ATP-Analogon (1-NM-PP1, etc.). Da Wildtyp-Kinasen diesen Bulksubstituenten nicht tolerieren, ist die Inhibition isogen-selektiv. Über 200 verschiedene Kinasen wurden so analysiert.",
        difficulty = 4,
        funFact = "Das bump-and-hole-System revolutionierte die Phosphoproteomik: Erstmals konnte die Substrat-Phosphorylierung einer einzelnen Kinase in lebenden Zellen direkt analysiert werden."
    ),

    // ── Planetary Atmospheres 9 ───────────────────────────────────────────────
    // Question 41 — Venus greenhouse  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Warum ist die Oberflächentemperatur der Venus (~465 °C) trotz höherer Sonnenalbedo als die Erde viel heißer als erwartet, und welcher Treibhausgas-Mix ist hauptverantwortlich?",
        answerA = "Runaway-Treibhauseffekt durch eine ~92-bar-CO₂-Atmosphäre (96,5 % CO₂) mit Schwefelsäurewolken; CO₂ absorbiert intensiv im 15-μm-Bereich, und die hohe Atmosphärenmasse verhindert jede Infrarotabstrahlung ins All",
        answerB = "Die Venus hat keinen Treibhauseffekt; ihre Temperatur erklärt sich durch interne Radiogen-Wärme allein",
        answerC = "Methan (CH₄) und Lachgas (N₂O) sind die Haupttreibhausgase der Venus, ähnlich wie auf der Erde",
        answerD = "Die dichte SO₂-Wolkenschicht reflektiert Wärme zurück zur Oberfläche; CO₂ spielt keine Rolle",
        correctAnswer = 0, // A
        explanation = "Venus' Treibhauseffekt ist ~500 K (~490°C Erwärmung über Strahlungsgleichgewichtstemperatur). Trotz Albedo von 0,77 (hohe Reflexion durch Wolken) absorbiert die CO₂-Säule alle thermische IR-Strahlung vielfach. Venera-Sonden maßen 9,2 MPa Bodendruck. Modelle zeigen, dass die frühe Erde unter gleichen Insolationsbedingungen ähnlich eskalieren könnte.",
        difficulty = 4,
        funFact = null
    ),

    // Question 42 — Mars CO2 ice  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Wie verursachen die jahreszeitlichen CO₂-Eiskappe-Zyklen auf dem Mars messbare Variationen des globalen atmosphärischen Drucks?",
        answerA = "CO₂-Eis auf dem Mars ist ein oberflächliches Phänomen ohne Einfluss auf den globalen Druck, da der Mars keine kohärente Atmosphäre hat",
        answerB = "Nur die Nordpolkappe kondensiert CO₂; die Südpolkappe besteht ausschließlich aus Wassereis und ist druckneutral",
        answerC = "Im Marspolaren Winter kondensieren ~25 % der gesamten CO₂-Atmosphäre als Trockeneis an den Polen; dies senkt den globalen Druck um ~25 %, gemessen von Viking und InSight. Im Frühling sublimiert das Eis und treibt starke Polarwinde (CO₂-Jet)",
        answerD = "CO₂-Kondensation auf dem Mars ist nur im Untergrund messbar; keine Oberflächeneis-Kappe existiert",
        correctAnswer = 2, // C
        explanation = "Mars' Atmosphäre ist ~95 % CO₂ bei ~600 Pa Mittelwert. Mariner 9 und Viking-Lander maßen jahreszeitliche Druckschwankungen von ±10–15 %. InSight präzisierte: jährliche Amplitude ~175 Pa (Nordhalbkugel-Winter). Die asymmetrische Kondensation (Südpolkappe enthält permanentes CO₂-Eis-Residuum) erzeugt eine jährliche Nettomassenbilanz-Asymmetrie.",
        difficulty = 4,
        funFact = "Der Marsmeteorolog gäbe sich mit einer 'Wettervorhersage' zufrieden: Jeden Marsmonat (Sol) weht der CO₂-Sublimationswind gleichmäßig polwärts."
    ),

    // Question 43 — Titan methane cycle  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Welche Analogie zum irdischen Wasserkreislauf zeigt Titan (Saturnmond), und welche Messungen der Cassini-Mission bestätigten dies?",
        answerA = "Titan hat einen Wasserkreislauf mit flüssigem Wasser an der Oberfläche; Methan ist nur ein Spurengas",
        answerB = "Titan hat einen Methan-Kreislauf: Flüssiges Methan/Ethan in Polarseen (Ligeia Mare, Kraken Mare), Methanerosion von Kanälen, Methan-Verdampfung, troposphärische CH₄-Wolken und Methanregen wurden durch RADAR (Polarseen-Kartierung) und VIMS (Wolkendynamik) belegt",
        answerC = "Cassini zeigte, dass Titans Oberfläche vollständig von Kohlenwasserstoff-Eis bedeckt und vollkommen flüssigkeitsfrei ist",
        answerD = "Der Methankreislauf auf Titan ist rein geochemisch und beinhaltet keine flüssige Phase oder Niederschlag",
        correctAnswer = 1, // B
        explanation = "Titan (T = ~94 K, p = ~1,5 bar N₂) liegt nahe dem Methan-Tripelpunkt. RADAR-Daten der Cassini-Mission (2004–2017) kartierten Polarseen mit >1.000 km² Ausdehnung. Huygens-Sonde (2005) detektierte beim Abstieg CH₄-Feuchtigkeit und Oberflächensediment durch Methanregen. Aktuelle Schätzung: Polarseen enthalten ~300 m mittlere Tiefe flüssiger Kohlenwasserstoffe.",
        difficulty = 4,
        funFact = "Die Dragonfly-Mission der NASA soll 2034 auf Titan landen und gezielt nach präbiotischen Chemikalien in den Methan-Seen suchen."
    ),

    // Question 44 — Gas giant composition  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Welches physikalische Phänomen ist verantwortlich für die intensive Wärmestrahlung von Jupiter, die seine Infrarot-Luminosität 1,7-mal größer macht als seine absorbierte Sonnenenergie?",
        answerA = "Nukleare Fusionsreaktionen im Jupiterkern kompensieren Wärmeverluste in den oberen Schichten",
        answerB = "Jupiters Magnetfeld erhitzt die Atmosphäre durch Joule-Heizung und erzeugt so den Überschussfluss",
        answerC = "Radioaktiver Zerfall von ²³⁵U im metallischen Wasserstoff-Kern ist die Hauptwärmequelle",
        answerD = "Langfristige Kelvin-Helmholtz-Kontraktion: Jupiter schrumpft ~2 cm/Jahr und setzt dabei Gravitationsenergie als Wärme frei; der interne Wärmefluss beträgt ~7,5 W/m²",
        correctAnswer = 3, // D
        explanation = "Jupiter, Saturn, Neptun (nicht Uranus) strahlen mehr Energie ab als sie absorbieren. Bei Jupiter erklärt die Kelvin-Helmholtz-Kontraktion (Gravitationsenergie → Wärme bei langsamem Schrumpfen) den Überschuss. Saturn hat ähnliches, aber zusätzlich Helium-Entmischung ('He-Regen') als Wärmequelle. Uranus' schwacher interner Fluss (~0 W/m²) ist noch nicht vollständig erklärt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 45 — Exoplanet atmospheres  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Welche Transmissionsspektroskopie-Methode verwendet das James-Webb-Teleskop, um die Zusammensetzung von Exoplaneten-Atmosphären zu bestimmen, und was wurde bereits für WASP-39b nachgewiesen?",
        answerA = "Beim Transit beobachtet JWST die wellenlängenabhängige Opazität der Atmosphäre im IR-Spektrum; für WASP-39b wurden CO₂ (erste Detektion bei einem Exoplaneten), SO₂, CO, H₂O und Natrium eindeutig detektiert — SO₂ als Hinweis auf fotochemische Sulfurchemie",
        answerB = "JWST misst Exoplaneten-Atmosphären nur im UV; Infrarot-Daten werden für solche Studien nicht verwendet",
        answerC = "Transmissionsspektroskopie kann nur Wasserdampf detektieren; CO₂ ist bei diesen Wellenlängen transparent",
        answerD = "WASP-39b wurde als erste Welt mit einer reinen Stickstoff-Atmosphäre ähnlich der Erde identifiziert",
        correctAnswer = 0, // A
        explanation = "JWSTs NIRSpec (0,6–5,3 μm) und NIRISS/SOSS (0,6–2,8 μm) sind optimiert für Transmissionsspektroskopie. WASP-39b (Saturn-ähnlich, 900 K): Das ERS-Team (ERSTrans, 2022) identifizierte CO₂ bei 4,3 μm mit >50σ — spektakuläre erste Detektion dieses Gases in einer Exoplanetenatmosphäre. SO₂ bestätigte fotochemische Modellvorhersagen.",
        difficulty = 4,
        funFact = "Die CO₂-Detektion auf WASP-39b war so präzise, dass sie in wenigen Stunden mehr Atmospheric-Science lieferte als alle bisherigen Exoplaneten-Studien zusammen."
    ),

    // ── Advanced Electrochemistry 10 ──────────────────────────────────────────
    // Question 46 — Solid-state batteries  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Was sind die zwei Haupthürden beim Einsatz von Festkörperelektrolyten in Lithium-Ionen-Batterien, und welche Materialklassen werden intensiv erforscht?",
        answerA = "Festkörperelektrolyte haben keine Ionenleitfähigkeit; sie werden nur als Separator verwendet",
        answerB = "Die einzige Hürde ist die Li-Dendritenbildung; Grenzflächenwiderstand ist bei Festkörpern kein Problem",
        answerC = "Hoher Grenzflächenwiderstand zwischen Elektrode und Elektrolyt (Raumladungszone, Kriechen) und mechanische Rissbildung bei Zyklisierung; erforschte Materialien: Sulfide (LGPS, Li₆PS₅Cl Argyrodit), Oxide (LLZO, LIPON), Polymere (PEO-Lithiumsalz)",
        answerD = "Sulfid-Festkörperelektrolyte sind giftig und explosiv; nur Oxide werden in der Praxis eingesetzt",
        correctAnswer = 2, // C
        explanation = "Festkörper-Li-Ionenleiter: LGPS (Li₁₀GeP₂S₁₂, σ ~ 12 mS/cm) erreicht flüssigelektrolyt-ähnliche Leitfähigkeit, ist aber gegenüber Li-Metall und oxidischen Kathoden reaktiv. LLZO (Li₇La₃Zr₂O₁₂) ist stabil gegen Li-Metall, hat aber höheren Grenzflächenwiderstand. Li-Dendritenbildung tritt auch durch Festkörperelektrolyt auf — durch Korngrenzen-Risse.",
        difficulty = 4,
        funFact = null
    ),

    // Question 47 — Lithium-sulfur batteries  [correct = B → 1]
    Question(
        categoryId = 2,
        questionText = "Was ist das 'Polysulfid-Shuttle-Problem' bei Lithium-Schwefel-Batterien, und welche Strategien werden zu seiner Lösung verfolgt?",
        answerA = "Polysulfide sind gasförmig und entweichen aus der Zelle; das Problem wird durch versiegelte Zellgehäuse gelöst",
        answerB = "Lösliche Lithium-Polysulfide (Li₂Sₙ, n=4–8) diffundieren aus der Schwefelkathode zur Lithiumanode, werden dort reduziert und zur Kathode zurückoxidiert — ein irreversibler Kapazitätsverlust-Kreislauf; Lösungen: Separator-Modifikation mit polaren Additiven, nanoporöse Kohlenstoff-Einschlüsse, Li₂S-Präzipitationskatalysatoren",
        answerC = "Das Shuttle-Problem tritt nur bei wässrigen Elektrolyten auf; bei Ether-Elektrolyten ist es vernachlässigbar",
        answerD = "Polysulfide haben keine Löslichkeit in Ether-Elektrolyten und können daher nicht zwischen Elektroden diffundieren",
        correctAnswer = 1, // B
        explanation = "Li-S-Batterien haben theoretische Energiedichte ~2600 Wh/kg (vs. ~250 Wh/kg für LiCoO₂). Der Shuttle-Mechanismus: S₈ → Li₂S₈ → Li₂S₄ (löslich) → Li₂S₂/Li₂S (unlöslich). Lösliche Spezies wandern durch den Separator, reagieren mit Li-Anode und bilden irreversiblen Li₂S-Film. Kapazitätsfading, Coulomb-Effizienz <90 %.",
        difficulty = 4,
        funFact = "Li-S-Batterien könnten theoretisch Elektrofahrzeuge mit 1000 km Reichweite ohne Gewichtszunahme ermöglichen — wenn das Shuttle-Problem gelöst wird."
    ),

    // Question 48 — Sodium-ion batteries  [correct = D → 3]
    Question(
        categoryId = 2,
        questionText = "Warum können Natriumionen-Batterien keine Graphit-Anoden verwenden, die in kommerziellen Lithiumionenbatterien Standard sind, und welche Anode wird stattdessen eingesetzt?",
        answerA = "Graphit ist für Na-Ionen zu reaktiv und explodiert; daher werden ausschließlich Metalloxide als Anoden verwendet",
        answerB = "Na⁺ ist zu groß für alle Anodenmaterialien; Na-Batterien verwenden zwingend metallisches Natrium als Anode",
        answerC = "Graphit-Anoden funktionieren genauso gut für Na⁺ wie für Li⁺; der Unterschied liegt nur in der Kathode",
        answerD = "Na⁺ interkaliert thermodynamisch nicht stabil in Graphit (die NaC₆-Phase ist energetisch ungünstig); stattdessen werden Hartkohle (hard carbon, HC) mit ungeordneten turbostratischen Graphen-Schichten verwendet, die Na⁺ in Nanoporen einschließen ('house of cards')",
        correctAnswer = 3, // D
        explanation = "Thermodynamik: Die NaC₆-Phase ist im Vergleich zu LiC₆ (+186 vs. −17 kJ/mol bei 0 K) endotherm. Hartkohle (pyrolisierte Zellulose/Sucrose bei 1000–1300°C) zeigt zwei Na-Speicherregionen: Interkalation in weite Schichtabstände (0,37–0,40 nm) und Nanoporen-Befüllung ('pore filling') bei < 0,1 V vs. Na/Na⁺.",
        difficulty = 4,
        funFact = null
    ),

    // Question 49 — Flow batteries  [correct = A → 0]
    Question(
        categoryId = 2,
        questionText = "Was ist das zentrale Prinzip einer Redox-Flow-Batterie, das sie besonders für stationäre Langzeitspeicherung geeignet macht?",
        answerA = "Energie und Leistung sind entkoppelt: Die Energie ist proportional zum Volumen der Elektrolyttanks (günstig skalierbar), die Leistung zur Zellstack-Größe; Vanadium-Flow-Batterien vermeiden Kreuz-Kontamination, da beide Halbzellen dasselbe Vanadium verwenden",
        answerB = "Flow-Batterien speichern Energie ausschließlich als kinetische Energie rotierender Fluide",
        answerC = "Der Elektrolyt wird bei der Reaktion verbraucht und muss nach jeder Entladezyklung ausgetauscht werden",
        answerD = "Flow-Batterien erreichen höhere Energiedichten als Li-Ionen-Batterien, weshalb sie in Elektroautos eingesetzt werden",
        correctAnswer = 0, // A
        explanation = "Vanadium-Redox-Flow-Batterien (VRFB): V²⁺/V³⁺ (Anode) und VO²⁺/VO₂⁺ (Kathode), Zell-OCV = 1,26 V. Vorteil: >10.000 Zyklen ohne Kapazitätsverlust, reparierbar, brandarm, unabhängige Skalierung von Energie (Tankvolumen) und Leistung (Stackgröße). Nachteil: geringe Energiedichte (~25–35 Wh/kg Elektrolyt), teuer (Vanadium-Preis).",
        difficulty = 4,
        funFact = "Die weltweit größte VRFB-Anlage steht in Dalian, China: 800 MWh Kapazität bei 400 MW Leistung — genug für 670.000 Haushalte für eine Stunde."
    ),

    // Question 50 — Supercapacitors  [correct = C → 2]
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Pseudokondensator von einem elektrochemischen Doppelschichtkondensator (EDLC) in Bezug auf Ladungsspeichermechanismus und Energiedichte?",
        answerA = "Pseudokondensatoren nutzen ausschließlich Interkalation wie Lithium-Ionen-Batterien und haben keine kapazitiven Beiträge",
        answerB = "EDLCs und Pseudokondensatoren sind identisch; der Unterschied liegt nur im Elektrodenmaterial, nicht im Mechanismus",
        answerC = "EDLC speichert Ladung rein elektrostatisch in der Helmholtz-Doppelschicht (keine Faraday-Reaktion, sehr schnell, hohe Zyklenstabilität); Pseudokondensatoren (RuO₂, MnO₂, leitfähige Polymere) nutzen schnelle Oberflächen-Redoxreaktionen (extrinsischer Faraday-Prozess) und erreichen 5–10-fach höhere Energiedichte bei geringerer Leistungsdichte und Zyklenstabilität",
        answerD = "Pseudokondensatoren haben immer niedrigere Energiedichte als EDLCs, da Redoxreaktionen Energie verbrauchen",
        correctAnswer = 2, // C
        explanation = "Hydratiertes RuO₂ (Zheng et al., 1995) zeigt c = ~720 F/g — Faraday-Pseudokapazität durch RuO₂ + H⁺ + e⁻ ↔ RuO(OH) + ... . MnO₂ und PANI/PPy sind günstigere Alternativen. Hybrid-Supercapacitors kombinieren EDLC-Kohlenstoffanode + Batterie-Kathode für mittlere Energiedichte (~30 Wh/kg) und hohe Leistung (>10 kW/kg).",
        difficulty = 4,
        funFact = "Regenerative Bremsung in Stadtbussen und U-Bahnen nutzt heute EDLC-Superkondensatoren, die Bremsenergie in Millisekunden aufnehmen und wieder abgeben — Batterien wären dafür zu langsam."
    )
)
