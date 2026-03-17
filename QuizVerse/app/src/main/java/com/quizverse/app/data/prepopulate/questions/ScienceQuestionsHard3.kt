package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsHard3(): List<Question> = listOf(

    // Question 1 – Bioinorganic Chemistry: Hemoglobin Iron
    Question(
        categoryId = 2,
        questionText = "In welchem Oxidationszustand liegt das Eisen im Häm-Komplex des Oxyhämoglobins vor?",
        answerA = "Fe³⁺ (Eisen(III))",
        answerB = "Fe²⁺ (Eisen(II))",
        answerC = "Fe⁰ (elementares Eisen)",
        answerD = "Fe⁴⁺ (Eisen(IV))",
        correctAnswer = 1, // B
        explanation = "Im funktionsfähigen Oxyhämoglobin liegt das Häm-Eisen formal als Fe²⁺ vor. Obwohl O₂ bindet und Elektronen delokalisiert werden (der Komplex hat teilweise Fe³⁺-Superoxid-Charakter), bleibt der formale Oxidationszustand Fe²⁺. Wird Fe²⁺ zu Fe³⁺ oxidiert (Methämoglobin), kann kein Sauerstoff mehr gebunden werden.",
        difficulty = 3,
        funFact = "Kohlenmonoxid bindet 250-mal stärker an Hämoglobin als Sauerstoff — deshalb ist CO so gefährlich. Es blockiert buchstäblich den Sauerstofftransport."
    ),

    // Question 2 – Bioinorganic Chemistry: Zinc Finger Proteins
    Question(
        categoryId = 2,
        questionText = "Welche Aminosäuren koordinieren typischerweise das Zink-Ion in einem klassischen C₂H₂-Zinkfinger-Protein?",
        answerA = "Zwei Histidine und zwei Methionine",
        answerB = "Vier Cysteine",
        answerC = "Zwei Cysteine und zwei Histidine",
        answerD = "Vier Histidine",
        correctAnswer = 2, // C
        explanation = "Im klassischen C₂H₂-Zinkfinger-Motiv koordinieren zwei Cysteine (aus einem β-Strang) und zwei Histidine (aus einer α-Helix) das Zn²⁺-Ion tetraedrisch. Diese Koordination stabilisiert das Protein-Faltungsmotiv, das dann sequenzspezifisch an die große Furche der DNA bindet.",
        difficulty = 3,
        funFact = null
    ),

    // Question 3 – Bioinorganic Chemistry: Cisplatin Mechanism
    Question(
        categoryId = 2,
        questionText = "Wie wirkt Cisplatin als Zytostatikum auf molekularer Ebene?",
        answerA = "Es hemmt die RNA-Polymerase durch kompetitive Inhibition",
        answerB = "Es bildet intrastrand-Quervernetzungen zwischen benachbarten Guanin-Basen der DNA",
        answerC = "Es interkaliert zwischen DNA-Basenpaare und verhindert die Helikase-Aktivität",
        answerD = "Es alkyliert den Adenin-N7-Stickstoff und verhindert die Basenpaarung",
        correctAnswer = 1, // B
        explanation = "Cisplatin (cis-[Pt(NH₃)₂Cl₂]) verliert nach Eintritt in die Zelle seine Chloridliganden durch Aquatisierung. Das reaktive Platin-Aquo-Komplex bildet bevorzugt 1,2-Intrastrang-Addukte zwischen zwei benachbarten Guaninen (GG oder AG) an den N7-Positionen. Diese Quervernetzungen verbiegen die DNA um ~34° und blockieren die Replikation.",
        difficulty = 3,
        funFact = "Cisplatin wurde 1965 zufällig entdeckt: Barnett Rosenberg bemerkte, dass Platinelektroden das Wachstum von Bakterien hemmen — ein Zufallsfund, der zu einem der wichtigsten Krebsmedikamente führte."
    ),

    // Question 4 – Bioinorganic Chemistry: Metalloenzymes
    Question(
        categoryId = 2,
        questionText = "Welches Metall ist im aktiven Zentrum der Carboanhydrase enthalten und welche Reaktion katalysiert sie?",
        answerA = "Magnesium; Phosphatesterhydrolyse",
        answerB = "Zink; Hydratation von CO₂ zu HCO₃⁻",
        answerC = "Mangan; Dismutation von Superoxid zu H₂O₂",
        answerD = "Eisen; Reduktion von Stickstoff zu Ammoniak",
        correctAnswer = 1, // B
        explanation = "Carboanhydrase enthält ein Zn²⁺-Ion, das tetraedrisch von drei Histidinen und einem Wassermolekül koordiniert ist. Das Zink aktiviert Wasser zu einem Hydroxid-Anion (Zn-OH⁻), welches nukleophil CO₂ angreift und Bicarbonat (HCO₃⁻) bildet. Das Enzym erreicht eine Wechselzahl von bis zu 10⁶ s⁻¹ — eines der schnellsten Enzyme überhaupt.",
        difficulty = 3,
        funFact = null
    ),

    // Question 5 – Bioinorganic Chemistry: Copper in Oxidases
    Question(
        categoryId = 2,
        questionText = "Welche Funktion haben die Kupferzentren Typ I, II und III in der Laccase?",
        answerA = "Typ I transportiert Elektronen; Typ II und III bilden ein trinukleares Cluster für die O₂-Reduktion",
        answerB = "Alle drei Typen reduzieren gleichzeitig und unabhängig O₂ zu H₂O₂",
        answerC = "Typ I bindet Substrat; Typ II und III übertragen Protonen über die Membran",
        answerD = "Typ I und II akzeptieren Elektronen vom Substrat; Typ III überträgt sie auf Sauerstoff",
        correctAnswer = 0, // A
        explanation = "In Laccasen übernimmt das blaue Typ-I-Kupfer (T1) Elektronen vom organischen Substrat und leitet sie über eine His-Cys-His-Brücke an das trinukleare Cluster weiter, bestehend aus Typ-II (T2) und zwei Typ-III-Kupfern (T3). Im trinuklearen Cluster erfolgt die 4-Elektronen-Reduktion von O₂ zu 2 H₂O ohne Freisetzung toxischer Intermediate.",
        difficulty = 3,
        funFact = "Laccasen sind biotechnologisch interessant für die Entfernung von Farbstoffen aus Abwässern und die Delignifizierung von Biomasse — reine Oxidation mit Luftsauerstoff, ohne Peroxide."
    ),

    // Question 6 – Photobiology: Circadian Rhythm Molecular Basis
    Question(
        categoryId = 2,
        questionText = "Welche molekularen Komponenten bilden die negative Rückkopplungsschleife der circadianen Uhr in Säugetieren?",
        answerA = "CLOCK/BMAL1 aktivieren PER/CRY-Gene; akkumuliertes PER/CRY-Protein hemmt CLOCK/BMAL1",
        answerB = "Cortisol aktiviert REV-ERBα; REV-ERBα hemmt die Melatonin-Synthese im SCN",
        answerC = "Rhodopsin aktiviert cGMP-Kaskade; cGMP phosphoryliert CREB und aktiviert Per1",
        answerD = "Adenosin akkumuliert tagsüber; hohes Adenosin hemmt den Wachzustand über A1-Rezeptoren",
        correctAnswer = 0, // A
        explanation = "CLOCK und BMAL1 (Aktivatoren) binden als Heterodimer an E-Box-Elemente und aktivieren die Transkription von Period-(PER1/2/3) und Cryptochrom-(CRY1/2)-Genen. Das akkumulierte PER/CRY-Protein transloziert in den Kern und hemmt den CLOCK/BMAL1-Komplex. Diese Schleife hat eine Periodendauer von ~24 h; zusätzliche Schleifen über REV-ERBα/RORα stabilisieren den Rhythmus.",
        difficulty = 3,
        funFact = null
    ),

    // Question 7 – Photobiology: UV Damage and Repair
    Question(
        categoryId = 2,
        questionText = "Welcher DNA-Schadenstyp wird durch UV-B-Strahlung am häufigsten erzeugt und durch welchen Mechanismus repariert?",
        answerA = "8-Oxo-Guanin; repariert durch Basen-Exzisionsreparatur (BER)",
        answerB = "Cyclobutan-Pyrimidin-Dimere (CPDs); repariert durch Nukleotid-Exzisionsreparatur (NER)",
        answerC = "Doppelstrangbrüche; repariert durch homologe Rekombination",
        answerD = "O⁶-Methylguanin; repariert durch direkte Demethylierung durch MGMT",
        correctAnswer = 1, // B
        explanation = "UV-B (280–315 nm) erzeugt bevorzugt Cyclobutan-Pyrimidin-Dimere (CPDs) zwischen benachbarten Pyrimidinen (v.a. T-T) durch [2+2]-Cycloaddition. Diese Läsionen werden durch die Nukleotid-Exzisionsreparatur (NER) entfernt: XPC erkennt den Schaden, dann schneiden XPG und XPF/ERCC1 einen ~30 Nukleotide langen Abschnitt heraus, der aufgefüllt und ligiert wird.",
        difficulty = 3,
        funFact = "Menschen mit Xeroderma pigmentosum haben defekte NER-Gene und entwickeln ohne Sonnenschutz bereits in der Kindheit zahlreiche Hauttumoren — ein drastisches Beispiel für die Notwendigkeit der UV-Reparatur."
    ),

    // Question 8 – Photobiology: Bioluminescence
    Question(
        categoryId = 2,
        questionText = "Was ist der chemische Mechanismus der Biolumineszenz beim Glühwürmchen (Lampyridae)?",
        answerA = "Luciferin wird durch Luciferase mit ATP und O₂ oxidiert, wobei ein angeregtes Oxyluciferin entsteht, das Licht emittiert",
        answerB = "Flavin-Mononukleotid wird durch NADH reduziert und emittiert beim Rückfall in den Grundzustand Photonen",
        answerC = "Coelenterazin wird durch Aequorin bei Ca²⁺-Bindung oxidiert und emittiert blaues Licht",
        answerD = "Porphyrin-Komplexe absorbieren UV-Strahlung und reemittieren sichtbares Licht durch Fluoreszenz",
        correctAnswer = 0, // A
        explanation = "Luciferase katalysiert die ATP-abhängige Aktivierung von D-Luciferin zu Luciferyl-Adenylat, gefolgt von oxidativer Decarboxylierung mit O₂. Das entstandene Oxyluciferin befindet sich im elektronisch angeregten Singulett-Zustand und emittiert beim Übergang in den Grundzustand Licht (555–575 nm, grün-gelb). Die Lichtfarbe variiert je nach Enzym-Isoform und pH-Wert.",
        difficulty = 3,
        funFact = "Luciferase wird als molekularer Reporter in Zellbiologie und Medizin eingesetzt — etwa um Genexpression sichtbar zu machen oder Tumorzellen in lebenden Mäusen zu verfolgen."
    ),

    // Question 9 – Photobiology: Vision Photochemistry
    Question(
        categoryId = 2,
        questionText = "Was ist das primäre photochemische Ereignis beim Sehen in Stäbchen-Photorezeptoren?",
        answerA = "11-cis-Retinal isomerisiert zu all-trans-Retinal und löst eine Konformationsänderung in Rhodopsin aus",
        answerB = "Retinol wird durch Retinol-Dehydrogenase zu Retinal oxidiert und aktiviert Transducin",
        answerC = "All-trans-Retinal absorbiert ein Photon und isomerisiert zu 11-cis-Retinal",
        answerD = "Opsin trennt sich von Retinal, woraufhin cGMP-Phosphodiesterase aktiviert wird",
        correctAnswer = 0, // A
        explanation = "Rhodopsin enthält 11-cis-Retinal als kovalent (Schiff-Base) gebundenen Chromophor. Bei Photonenabsorption isomerisiert 11-cis-Retinal innerhalb von ~200 Femtosekunden zu all-trans-Retinal. Diese geometrische Änderung löst eine Konformationsänderung von Rhodopsin zu Metarhodopsin II aus, welches das G-Protein Transducin (Gt) aktiviert und die Phototransduktionskaskade einleitet.",
        difficulty = 3,
        funFact = null
    ),

    // Question 10 – Photobiology: Photosensitizers
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus liegt der photodynamischen Therapie (PDT) bei Krebsbehandlungen zugrunde?",
        answerA = "Der Photosensibilisator absorbiert UV-Licht und emittiert Röntgenstrahlung, die Tumorgewebe ionisiert",
        answerB = "Ein Photosensibilisator im angeregten Triplettzustand überträgt Energie auf ³O₂ und erzeugt reaktives Singulett-Sauerstoff (¹O₂)",
        answerC = "Der Photosensibilisator katalysiert die Photolyse von Wasser und setzt zelltoxisches H₂O₂ frei",
        answerD = "Lichtenergie aktiviert einen Prodrug, der durch Reduktion in ein alkylierende Agens umgewandelt wird",
        correctAnswer = 1, // B
        explanation = "In der PDT akkumuliert ein Photosensibilisator (z.B. Porphyrin-Derivate) im Tumorgewebe. Belichtung mit sichtbarem Licht hebt den Sensibilisator in den angeregten Singulettzustand, der in den langlebigen Triplettzustand übergeht (Intersystem Crossing). Dieser überträgt Energie auf molekularen Sauerstoff (Typ-II-Reaktion) und erzeugt hochreaktiven Singulett-Sauerstoff (¹O₂), der Lipide, Proteine und DNA oxidiert und Apoptose auslöst.",
        difficulty = 3,
        funFact = "Die erste klinische PDT wurde 1978 durchgeführt. Heute behandeln Ärzte damit Haut-, Blasen- und Lungenkrebs — mit dem Vorteil sehr präziser räumlicher Kontrolle durch gezielte Belichtung."
    ),

    // Question 11 – Nuclear Chemistry: Radioactive Decay Series
    Question(
        categoryId = 2,
        questionText = "In welche stabile Tochtersubstanz zerfällt Uran-238 am Ende der natürlichen Zerfallsreihe?",
        answerA = "Blei-206 (²⁰⁶Pb)",
        answerB = "Blei-207 (²⁰⁷Pb)",
        answerC = "Bismut-209 (²⁰⁹Bi)",
        answerD = "Thallium-208 (²⁰⁸Tl)",
        correctAnswer = 0, // A
        explanation = "Die Uran-Radium-Zerfallsreihe beginnt mit ²³⁸U (Halbwertszeit 4,47 Mrd. Jahre) und endet nach 14 Zerfallsschritten (8 Alpha- und 6 Beta-Zerfälle) beim stabilen Isotop ²⁰⁶Pb. ²⁰⁷Pb ist das Endprodukt der Actinium-Reihe (²³⁵U), ²⁰⁸Pb der Thorium-Reihe (²³²Th).",
        difficulty = 3,
        funFact = "Das Verhältnis von ²⁰⁶Pb zu ²³⁸U in Zirkonen erlaubt Altersbestimmungen bis 4,4 Milliarden Jahren — so alt wie die ältesten bekannten Minerale der Erde."
    ),

    // Question 12 – Nuclear Chemistry: Reactor Types
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Druckwasserreaktor (DWR) von einem Siedewasserreaktor (SWR) in der Kernphysik?",
        answerA = "Im DWR siedet das Kühlwasser direkt; im SWR bleibt es flüssig durch Überdruck",
        answerB = "Im DWR bleibt das Primärkreiswasser flüssig unter Hochdruck; im SWR verdampft es direkt im Reaktorkern",
        answerC = "Im DWR wird Schwerwasser als Moderator verwendet; im SWR normales Leichtwasser",
        answerD = "Im DWR wird ²³⁵U verwendet; im SWR wird ²³⁹Pu als Brennstoff genutzt",
        correctAnswer = 1, // B
        explanation = "Im Druckwasserreaktor (DWR) steht das Primärkühlwasser unter ~155 bar Druck (ca. 325°C), wodurch es trotz hoher Temperatur flüssig bleibt. Die Wärme wird über Dampferzeuger auf einen Sekundärkreis übertragen. Im Siedewasserreaktor (SWR) siedet das Kühlwasser direkt im Reaktorkern bei ~70 bar (ca. 285°C) und der entstehende Dampf treibt die Turbine direkt an.",
        difficulty = 3,
        funFact = null
    ),

    // Question 13 – Nuclear Chemistry: Radiometric Dating
    Question(
        categoryId = 2,
        questionText = "Warum ist die Kalium-Argon-Datierung (K-Ar) für magmatische Gesteine besonders geeignet?",
        answerA = "Kalium ist in allen Mineralen gleichmäßig verteilt; Argon diffundiert nicht aus Gesteinen",
        answerB = "Bei der Erstarrung von Magma entweicht gasförmiges Argon vollständig; danach akkumuliert nur radiogenes ⁴⁰Ar aus ⁴⁰K-Zerfall",
        answerC = "Kalium hat keine chemischen Analoga, die das Messergebnis verfälschen könnten",
        answerD = "Die Halbwertszeit von ⁴⁰K beträgt genau 1 Million Jahre und eignet sich perfekt für geologische Zeitskalen",
        correctAnswer = 1, // B
        explanation = "Beim Abkühlen und Erstarren von Magma entweicht das bis dahin vorhandene Argon als Edelgas vollständig. Mit der Erstarrung beginnt die Uhr: ⁴⁰K zerfällt mit einer Halbwertszeit von 1,248 Mrd. Jahren zu 11% in ⁴⁰Ar. Das akkumulierte ⁴⁰Ar im Kristallgitter erlaubt die Altersbestimmung. Methode geeignet für Gesteine von ~100.000 bis mehrere Milliarden Jahre alt.",
        difficulty = 3,
        funFact = "K-Ar-Datierung war entscheidend für die Bestätigung der Plattentektonik: Die ozeanische Kruste wird an Mittelozeanischen Rücken gebildet — und wird mit zunehmender Entfernung vom Rücken immer älter."
    ),

    // Question 14 – Nuclear Chemistry: Nuclear Medicine Isotopes
    Question(
        categoryId = 2,
        questionText = "Warum ist Technetium-99m (⁹⁹ᵐTc) das am häufigsten verwendete Radionuklid in der nuklearmedizinischen Diagnostik?",
        answerA = "Es hat eine Halbwertszeit von 6 Stunden, emittiert ausschließlich γ-Strahlung (140 keV) und kann direkt im Krankenhaus aus ⁹⁹Mo-Generatoren gewonnen werden",
        answerB = "Es emittiert α-Strahlung hoher Energie, die präzise Tumorgewebe zerstört ohne Umgebungsgewebe zu schädigen",
        answerC = "Es hat eine Halbwertszeit von 24 Stunden und reichert sich selektiv in malignen Zellen an",
        answerD = "Es emittiert Positronen und eignet sich für PET-Scans mit hoher räumlicher Auflösung",
        correctAnswer = 0, // A
        explanation = "⁹⁹ᵐTc kombiniert ideale nuklearmedizinische Eigenschaften: Die kurze HWZ von 6,01 h minimiert die Strahlendosis; ausschließliche γ-Emission (140 keV, optimal für Gammakameras) ohne α/β-Strahlung schont das Gewebe; die Gewinnung aus ⁹⁹Mo/⁹⁹ᵐTc-Generatoren ('Kuh') ermöglicht tägliche Elution direkt im Krankenhaus. Über 80% aller nuklearmedizinischen Untersuchungen weltweit nutzen ⁹⁹ᵐTc.",
        difficulty = 3,
        funFact = null
    ),

    // Question 15 – Nuclear Chemistry: Nuclear Waste
    Question(
        categoryId = 2,
        questionText = "Was versteht man unter Transmutation im Kontext der nuklearen Abfallbehandlung?",
        answerA = "Die chemische Aufbereitung von abgebrannten Brennelementen durch Lösungsmittelextraktion (PUREX-Prozess)",
        answerB = "Die Umwandlung langlebiger Aktinide und Spaltprodukte durch Neutronenbestrahlung in kurzlebigere oder stabile Nuklide",
        answerC = "Die thermische Behandlung von radioaktivem Abfall bei hohen Temperaturen zur Volumenreduktion",
        answerD = "Die geologische Endlagerung in tiefen Salzformationen zur Isolation über Hunderttausende von Jahren",
        correctAnswer = 1, // B
        explanation = "Transmutation bezeichnet die kernphysikalische Umwandlung schwerer, langlebiger Radionuklide (z.B. ²⁴¹Am mit HWZ 432 a, ²³⁷Np mit HWZ 2,1 Mio. a) durch Neutronenabsorption in kurzlebigere Isotope oder stabile Elemente. In Beschleuniger-betriebenen Systemen (ADS) oder schnellen Reaktoren können so die Langzeitgefährlichkeit und das Volumen des Hochradioaktiven Abfalls erheblich reduziert werden.",
        difficulty = 3,
        funFact = "Ohne Transmutation müsste hochradioaktiver Abfall etwa eine Million Jahre sicher gelagert werden — länger als die gesamte Menschheitsgeschichte."
    ),

    // Question 16 – Mathematical Biology: SIR Model
    Question(
        categoryId = 2,
        questionText = "Was ist die Bedingung für den Ausbruch einer Epidemie im SIR-Modell?",
        answerA = "Die Kontaktrate β muss größer als die Genesungsrate γ sein: β > γ",
        answerB = "Die Basisreproduktionszahl R₀ = β/γ · S₀/N muss größer als 1 sein",
        answerC = "Die initiale Anzahl infizierter Individuen muss größer als 1% der Gesamtpopulation sein",
        answerD = "Die Übertragungsrate muss exponentiell mit der Bevölkerungsdichte zunehmen",
        correctAnswer = 1, // B
        explanation = "Im klassischen SIR-Modell (dS/dt = -βSI/N, dI/dt = βSI/N - γI, dR/dt = γI) nimmt die Zahl der Infizierten zu, wenn dI/dt > 0, also wenn βS/N > γ. Zum Zeitpunkt t=0 mit S₀ ≈ N ergibt sich die Basisreproduktionszahl R₀ = β/γ. Eine Epidemie bricht aus, wenn R₀ > 1. Die Herdenimmunität ist bei S < γN/β (Herdenschwelle 1 - 1/R₀) erreicht.",
        difficulty = 3,
        funFact = "Das SIR-Modell wurde 1927 von Kermack und McKendrick entwickelt. COVID-19 hatte ein R₀ von etwa 2–3 (Wildtyp) bis 8–15 (Omikron)."
    ),

    // Question 17 – Mathematical Biology: Predator-Prey Beyond Lotka-Volterra
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet das Rosenzweig-MacArthur-Modell vom klassischen Lotka-Volterra-Modell?",
        answerA = "Es berücksichtigt Migration zwischen Populationen und räumliche Heterogenität",
        answerB = "Es verwendet eine logistische Wachstumsfunktion für die Beute und eine gesättigte Holling-Typ-II-Funktionalreaktion für den Räuber",
        answerC = "Es modelliert drei trophische Ebenen statt zwei und berücksichtigt Konkurrenz innerhalb der Räubergruppe",
        answerD = "Es ersetzt die deterministischen durch stochastische Differentialgleichungen",
        correctAnswer = 1, // B
        explanation = "Das Rosenzweig-MacArthur-Modell erweitert Lotka-Volterra durch: (1) logistisches Beutewachstum (K-Limitierung statt unbegrenztem Wachstum) und (2) eine Holling-Typ-II-Funktionalreaktion p(N) = aN/(1+ahN) für den Räuber (gesättigte Fresrate). Diese Erweiterungen führen zu stabilen Grenzzyklen, Gleichgewichtspunkten und zum 'Paradox der Bereicherung' — bei höherer Beutekapazität destabilisiert sich das System.",
        difficulty = 3,
        funFact = null
    ),

    // Question 18 – Mathematical Biology: Neural Network Biology
    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Hodgkin-Huxley-Modell in der mathematischen Neurobiologie?",
        answerA = "Die synaptische Plastizität durch Veränderung der Neurotransmitter-Konzentration",
        answerB = "Die Ionenkanaldynamik des Aktionspotenzials als System gekoppelter nichtlinearer Differentialgleichungen",
        answerC = "Das Feuermuster neuronaler Netzwerke unter dem Einfluss von Inhibitor-Interneuronen",
        answerD = "Die räumliche Ausbreitung von elektrischen Signalen entlang myelinisierter Axone",
        correctAnswer = 1, // B
        explanation = "Das Hodgkin-Huxley-Modell (1952, Nobelpreis 1963) beschreibt die Membranspannung als: CdV/dt = -g_Na·m³h(V-E_Na) - g_K·n⁴(V-E_K) - g_L(V-E_L) + I. Die Gating-Variablen m, h, n beschreiben die Öffnungswahrscheinlichkeiten von Na⁺- und K⁺-Kanälen als Funktionen von Spannung und Zeit. Es ist das erste quantitative Modell eines biologischen Prozesses auf zellulärer Ebene.",
        difficulty = 3,
        funFact = "Hodgkin und Huxley leiteten ihre Gleichungen ab, ohne die molekulare Struktur der Ionenkanäle zu kennen — diese wurden erst Jahrzehnte später mit Patch-Clamp-Techniken direkt gemessen."
    ),

    // Question 19 – Mathematical Biology: Phylogenetic Tree Construction
    Question(
        categoryId = 2,
        questionText = "Was ist das Prinzip der 'Maximum Likelihood'-Methode bei der Konstruktion phylogenetischer Bäume?",
        answerA = "Es wird der Baum gewählt, der die minimale Gesamtlänge aller Äste (parsimoniöseste Erklärung) aufweist",
        answerB = "Es wird der Baum gewählt, bei dem die beobachteten Sequenzdaten unter einem expliziten Evolutionsmodell am wahrscheinlichsten sind",
        answerC = "Es werden paarweise genetische Distanzen berechnet und durch sukzessives Zusammenfassen der ähnlichsten Taxa ein Baum erstellt",
        answerD = "Es wird der Baum durch bayesianische Posteriorverteilung über Baumtopologien bestimmt",
        correctAnswer = 1, // B
        explanation = "Maximum Likelihood (ML) sucht den Baum T*, der P(Daten | Baum, Modell) maximiert. Dabei werden explizite Substitutionsmodelle verwendet (z.B. GTR+Γ für DNA), die unterschiedliche Mutationsraten zwischen Basen und Raten-Heterogenität modellieren. Im Gegensatz zur Parsimonie berücksichtigt ML multiple Substitutionen an derselben Position (Sättigungseffekte), was zu genaueren Tiefenzweig-Schätzungen führt.",
        difficulty = 3,
        funFact = null
    ),

    // Question 20 – Mathematical Biology: Diffusion in Biology
    Question(
        categoryId = 2,
        questionText = "Was beschreiben Turing-Muster in der Reaktions-Diffusions-Theorie der Biologie?",
        answerA = "Die osmoregulatorische Balance zwischen Intra- und Extrazellulärraum in Epithelzellen",
        answerB = "Spontane räumliche Musterbildung durch Wechselwirkung eines kurzreichweitigen Aktivators mit einem langreichweitigen Inhibitor",
        answerC = "Die Diffusion von Morphogenen entlang eines Konzentrationsgradienten zur Spezifizierung von Körperachsen",
        answerD = "Die stochastische Verteilung von Transkriptionsfaktoren im Zellkern durch Brownsche Bewegung",
        correctAnswer = 1, // B
        explanation = "Alan Turing zeigte 1952, dass ein System aus zwei diffundierenden Molekülen — ein Aktivator (A, kurzreichweitig selbstverstärkend) und ein Inhibitor (I, langreichweitig) — aus einem homogenen Zustand spontan räumliche Muster erzeugen kann (Diffusionsinstabilität). Bedingung: D_Inhibitor >> D_Aktivator. Biologische Anwendungen: Fellmuster bei Katzen, Fingerabdrücke, Streifenbildung bei Fischen, Kiemenentwicklung.",
        difficulty = 3,
        funFact = "Turing entwickelte diese Theorie 1952 kurz vor seinem Tod — die experimentelle Bestätigung im biologischen System gelang erst Jahrzehnte später."
    ),

    // Question 21 – Geochemistry: Isotope Fractionation
    Question(
        categoryId = 2,
        questionText = "Was versteht man unter kinetischer Isotopenfraktionierung und in welcher Richtung fraktionieren stabile Kohlenstoffisotope bei der Photosynthese?",
        answerA = "Schwerere Isotope reagieren schneller; C4-Pflanzen reichern ¹³C gegenüber ¹²C an",
        answerB = "Leichtere Isotope reagieren schneller; C3-Pflanzen reichern ¹²C an, ihre δ¹³C-Werte sind negativer als atmosphärisches CO₂",
        answerC = "Kinetische Fraktionierung tritt nur bei radioaktiven Isotopen auf; stabile Isotope fraktionieren nur gleichgewichtsmäßig",
        answerD = "Die Rubisco-Carboxylase bevorzugt ¹³CO₂; C3-Pflanzen haben daher δ¹³C-Werte nahe 0‰",
        correctAnswer = 1, // B
        explanation = "Bei kinetischer Fraktionierung reagieren leichtere Isotope schneller (geringere Aktivierungsenergie, höhere Diffusionsgeschwindigkeit). Die Rubisco (C3-Pflanzen) diskriminiert ¹³CO₂ gegenüber ¹²CO₂ stark (Fraktionierungsfaktor ε ≈ -29‰). C3-Pflanzen haben typisch δ¹³C = -28 bis -25‰; C4-Pflanzen diskriminieren weniger (δ¹³C = -14 bis -10‰), da CO₂ zuerst durch PEP-Carboxylase fixiert wird.",
        difficulty = 3,
        funFact = "Anhand von δ¹³C-Werten in fossilen Pflanzenmaterial und Tier-Kollagen können Paläoanthropologen rekonstruieren, ob prähistorische Menschen vorwiegend C3- oder C4-Pflanzen aßen."
    ),

    // Question 22 – Geochemistry: Rare Earth Elements
    Question(
        categoryId = 2,
        questionText = "Warum ist das geochemische Verhalten von Cer (Ce) in Sedimenten für die Paläoozeanographie bedeutsam?",
        answerA = "Ce ist das einzige Seltene-Erd-Element, das in oxidierenden marinen Umgebungen als Ce⁴⁺ aus der Lösung ausfällt und eine negative Ce-Anomalie in Meerwasser hinterlässt",
        answerB = "Ce hat die höchste Konzentration aller SEE in der Erdkruste und dominiert das Gesamtspektrum",
        answerC = "Ce ist ein radioaktives Isotop mit einer Halbwertszeit von 10 Millionen Jahren und eignet sich zur absoluten Datierung",
        answerD = "Ce fraktioniert bei hydrothermaler Aktivität stark und zeigt positive Anomalien in anoxischen Tiefsedimenten",
        correctAnswer = 0, // A
        explanation = "Cer ist das einzige SEE, das unter oxidierenden Bedingungen von Ce³⁺ zu Ce⁴⁺ oxidiert werden kann. Ce⁴⁺ ist unlöslich und wird aus der Meerwasserlösung entfernt (Adsorption an Mn-Oxide und Fe-Oxyhydroxide). Dies erzeugt eine charakteristische negative Ce-Anomalie in modernem oxischen Meerwasser (Ce/Ce* < 1). Anoxische paläomarinen Environments zeigen keine Ce-Anomalie — ein Proxy für den Redox-Zustand der Ur-Ozeane.",
        difficulty = 3,
        funFact = null
    ),

    // Question 23 – Geochemistry: Ocean Chemistry
    Question(
        categoryId = 2,
        questionText = "Was ist der biologische Kohlenstoffpumpe und welche Rolle spielen Foraminiferen dabei?",
        answerA = "Phytoplankton produziert O₂ durch Photosynthese; Foraminiferen transportieren Stickstoffe in die Tiefsee",
        answerB = "Photosynthetisches Plankton fixiert CO₂ zu organischem Kohlenstoff; beim Absinken von Foraminiferen-Schalen (CaCO₃) und organischem Material wird CO₂ aus der Oberflächenschicht in die Tiefsee exportiert",
        answerC = "Foraminiferen katalysieren die Calcit-Auflösung unterhalb der CCD und setzen CO₂ in der Tiefsee frei",
        answerD = "Die biologische Pumpe beschreibt den horizontalen Transport von Nährstoffen durch Thermohaline Zirkulation",
        correctAnswer = 1, // B
        explanation = "Die biologische Kohlenstoffpumpe umfasst zwei Teilprozesse: (1) Weiche Pumpe: Photosynthese fixiert CO₂ zu organischem C; beim Absinken und Remineralisierung wird CO₂ in der Tiefsee freigesetzt. (2) Karbonathüllen-Pumpe ('hard pump'): Foraminiferen, Coccolithophoriden und Pteropoden bilden CaCO₃-Schalen (bei der Bildung wird CO₂ freigesetzt: Ca²⁺ + 2HCO₃⁻ → CaCO₃ + CO₂ + H₂O), die beim Absinken den Karbonatalkalitätsgradienten beeinflussen.",
        difficulty = 3,
        funFact = "Wenn die biologische Pumpe vollständig aufhören würde, würde die CO₂-Konzentration der Atmosphäre auf etwa 500 ppm ansteigen — der Ozean ist ein massiver Kohlenstoffspeicher."
    ),

    // Question 24 – Geochemistry: Carbon Cycle
    Question(
        categoryId = 2,
        questionText = "Was ist der Urey-Reaktion-Zyklus und welche Bedeutung hat er für die langfristige Klimaregulation?",
        answerA = "CaSiO₃ + CO₂ → CaCO₃ + SiO₂: Silikatverwitterung bindet CO₂; bei erhöhter Temperatur beschleunigte Verwitterung reduziert CO₂ und kühlt die Erde (negativer Rückkopplungsmechanismus)",
        answerB = "CO₂ + H₂O → CH₂O + O₂: Photosynthese bindet CO₂ auf kurzen Zeitskalen und reguliert den saisonalen CO₂-Zyklus",
        answerC = "Ca²⁺ + 2HCO₃⁻ → CaCO₃ + CO₂ + H₂O: Karbonatsedimentation setzt CO₂ frei und erhöht langfristig den atmosphärischen CO₂-Gehalt",
        answerD = "CH₄ + 2O₂ → CO₂ + 2H₂O: Methanoxidation in der Atmosphäre wandelt das stärkere Treibhausgas in das schwächere um",
        correctAnswer = 0, // A
        explanation = "Die Urey-Reaktion (Carbonate-Silicate-Zyklus) beschreibt: CaSiO₃ + CO₂ ⇌ CaCO₃ + SiO₂. Bei erhöhtem CO₂ und Temperatur beschleunigt sich die Silikatverwitterung auf dem Land (höhere chemische Reaktionsraten, mehr Niederschlag) und entzieht der Atmosphäre CO₂. Dieser negative Rückkopplungsmechanismus hat die Erde über Hunderte Millionen Jahre vor Übererwärmung oder Vereisung bewahrt — auf Zeitskalen von 10⁵–10⁶ Jahren.",
        difficulty = 3,
        funFact = null
    ),

    // Question 25 – Geochemistry: Mineral Formation
    Question(
        categoryId = 2,
        questionText = "Welcher Prozess führt zur Bildung von Banded Iron Formations (BIF) im Archaikum und Proterozoikum?",
        answerA = "Vulkanische Fe²⁺-Emissionen wurden direkt als Hämatit abgelagert; die Bänderung entstand durch saisonale Vulkanismus-Zyklen",
        answerB = "Cyanobakteriell produzierter Sauerstoff oxidierte gelöstes Fe²⁺ im Meerwasser zu unlöslichem Fe³⁺ (Goethit/Hämatit), das ablagerte; alternierend mit SiO₂-reichen Chert-Lagen",
        answerC = "Hydrothermale Systeme injizierten abwechselnd Fe- und Si-reiche Lösungen in den Ozean, die bei Abkühlung gemeinsam ausfielen",
        answerD = "Meteoriteneinschläge lieferten extraterrestrisches Eisen, das durch Regen in Schichten niedergeschlagen wurde",
        correctAnswer = 1, // B
        explanation = "BIFs entstanden hauptsächlich zwischen 2,5–1,8 Mrd. Jahren als Cyanobakterien begannen, durch oxygene Photosynthese O₂ zu produzieren (Große Sauerstoffkatastrophe). Der Sauerstoff oxidierte das reichlich gelöste Fe²⁺ (unter anoxischen Bedingungen im Ur-Ozean akkumuliert) zu Fe³⁺-Oxihydroxiden, die ausfielen. Die charakteristische Bänderung (Fe-Lagen und SiO₂-Chert) reflektiert möglicherweise saisonale oder zyklische Photosynthese-Aktivitäts-Änderungen.",
        difficulty = 3,
        funFact = "Die Mehrzahl des heute abgebauten Eisenerzes stammt aus BIFs — die Cyanobakterien vor 2,5 Mrd. Jahren haben buchstäblich die industrielle Zivilisation möglich gemacht."
    ),

    // Question 26 – Plasma Physics: Plasma States
    Question(
        categoryId = 2,
        questionText = "Was charakterisiert Plasma als vierten Aggregatzustand und welche Größe beschreibt die kollektive Abschirmung elektrischer Felder?",
        answerA = "Plasma besteht aus ionisierten Gasmolekülen; die Fermi-Energie beschreibt den Energiezustand der freien Elektronen",
        answerB = "Plasma ist ein ionisiertes Gas mit quasineutraler Gesamtladung; die Debye-Länge λ_D beschreibt die charakteristische Abschirmlänge elektrischer Felder",
        answerC = "Plasma besteht aus neutralen Atomen mit hoher kinetischer Energie; das Plasma-β beschreibt das Verhältnis von Plasmadruck zu magnetischer Energiedichte",
        answerD = "Plasma ist ein superfluides Medium; die Plasmafrequenz ω_p beschreibt die kritische Frequenz für Schallwellen",
        correctAnswer = 1, // B
        explanation = "Plasma ist ein ionisiertes Gas (Elektronen + Ionen), das quasineutral ist (gleiche positive und negative Ladungsdichte über größere Volumen). Die Debye-Länge λ_D = √(ε₀k_BT_e/n_ee²) gibt an, über welche Distanz externe elektrische Felder durch kollektive Ladungsverschiebung abgeschirmt werden. Auf Skalen >> λ_D verhält sich das Plasma quasineutral; auf kleineren Skalen dominieren individuelle Coulomb-Wechselwirkungen.",
        difficulty = 3,
        funFact = "99% der sichtbaren Materie im Universum liegt als Plasma vor — Sterne, interstellares Medium, Nebel. Das 'feste' Material auf der Erde ist die kosmologische Ausnahme, nicht die Regel."
    ),

    // Question 27 – Plasma Physics: Tokamak Fusion
    Question(
        categoryId = 2,
        questionText = "Was ist das Lawson-Kriterium in der Fusionsreaktorforschung?",
        answerA = "Der minimale Tritiumvorrat für eine selbsterhaltende Fusionsreaktion im Tokamak",
        answerB = "Das Produkt n·τ_E (Plasmadichte × Energieeinschlusszeit) muss einen kritischen Schwellenwert überschreiten, damit mehr Fusionsenergie freigesetzt als zugeführt wird",
        answerC = "Die minimale Plasmatemperatur von 15 Millionen Kelvin für das Zünden der D-T-Reaktion",
        answerD = "Das Verhältnis von Fusionsleistung zu magnetischer Feldenergie muss größer als eins sein",
        correctAnswer = 1, // B
        explanation = "Das Lawson-Kriterium (John Lawson, 1957) besagt, dass für eine selbsterhaltende Fusion das Dreifach-Produkt n·T·τ_E einen Schwellenwert überschreiten muss. Für D-T-Fusion: n·τ_E > 2×10²⁰ m⁻³s bei optimaler Temperatur ~150 Mio. K (oder n·T·τ_E > 3×10²¹ keV·m⁻³s). ITER soll Q = 10 (10× mehr Energie raus als rein) erreichen; ein kommerzielles Kraftwerk benötigt Q > 30.",
        difficulty = 3,
        funFact = null
    ),

    // Question 28 – Plasma Physics: Lightning Physics
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus initiiert die elektrische Entladung bei einem Blitz?",
        answerA = "Direkte elektrische Entladung zwischen Wolke und Erde sobald die elektrische Feldstärke 3 MV/m übersteigt",
        answerB = "Gestufter Leitkanal (stepped leader) aus der Wolke bahnt einen ionisierten Pfad; beim Kontakt mit dem Rückblitz entsteht der sichtbare helle Kanal",
        answerC = "Kosmische Myonen ionisieren die Luft und schaffen leitfähige Kanäle, die elektrische Entladungen ermöglichen",
        answerD = "Wassertröpfchen in Gewitterwolken sammeln Ladung durch reibungselektrische Trennung und entladen sich direkt in Richtung Erde",
        correctAnswer = 1, // B
        explanation = "Ein Blitz beginnt mit einem unsichtbaren gestuften Leitkanal (stepped leader): schwach ionisierte Plasmafäden propagieren stufenweise (~50 m/Stufe, ~1 µs Pause) von der Wolke zur Erde. Wenn er sich dem Boden nähert, steigen Fangentladungen (streamers) von Spitzen entgegen. Bei Kontakt fließt der Hauptblitz (return stroke) von unten nach oben mit ~100.000 km/s Rückblitzgeschwindigkeit — das ist das helle Leuchten, das wir sehen.",
        difficulty = 3,
        funFact = "Der heiße Blitzkanal (~30.000 K, dreimal heißer als die Sonnenoberfläche) dehnt sich explosionsartig aus und erzeugt die Druckwelle, die wir als Donner hören."
    ),

    // Question 29 – Plasma Physics: Aurora Mechanism
    Question(
        categoryId = 2,
        questionText = "Wie entsteht die grüne Farbe der Polarlichter auf molekularer Ebene?",
        answerA = "Stickstoffmoleküle emittieren grünes Licht durch Chemilumineszenz bei Reaktion mit Sonnenwinden-Protonen",
        answerB = "Angeregte Sauerstoffatome (O*) bei ca. 100–120 km Höhe emittieren beim Übergang ¹S → ¹D Licht bei 557,7 nm (grün) mit einer Lebensdauer von ~1 s",
        answerC = "Elektronen aus dem Sonnenwind prallen auf N₂-Moleküle und erzeugen Fluoreszenz im grünen Spektralbereich",
        answerD = "Ionisierte Sauerstoffmoleküle O₂⁺ emittieren bei Rekombination mit freien Elektronen charakteristisches grünes Licht",
        correctAnswer = 1, // B
        explanation = "Grüne Polarlichter (557,7 nm) entstehen durch den verbotenen Übergang im atomaren Sauerstoff: O(¹S) → O(¹D) + hν. Solare Elektronen anregen O-Atome in der Thermosphäre (100–120 km) in den ¹S-Zustand (Lebensdauer ~1 s). Da der Druck gering genug ist (kaum Stoßlöschung), leuchtet der Übergang. Höhere Lagen (>200 km) zeigen rot (O ¹D→³P, 630 nm), niedrigere Lagen blau/violett (N₂).",
        difficulty = 3,
        funFact = null
    ),

    // Question 30 – Plasma Physics: Plasma in Stars
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der magnetische Dynamo-Mechanismus in Sternen?",
        answerA = "Die Kernfusion erzeugt magnetische Felder durch Bewegung geladener Teilchen im Plasmazustand",
        answerB = "Differenzielle Rotation und konvektive Bewegungen des leitfähigen Plasmas in der Konvektionszone erzeugen und erhalten das stellare Magnetfeld",
        answerC = "Solare Magnetfelder stammen aus dem ursprünglichen Magnetfeld der Galaxie und werden durch den Stern amplifiziert",
        answerD = "Sonnenflecken erzeugen lokale Magnetfelder durch thermoelektrische Effekte an der Phothosphäre",
        correctAnswer = 1, // B
        explanation = "Der stellare αΩ-Dynamo konvertiert kinetische Energie von Plasmaströmungen in magnetische Energie. Zwei Prozesse spielen zusammen: (1) Ω-Effekt: Differentielle Rotation streckt und verstärkt poloidale Magnetfeldlinien zu toroidalen Feldern. (2) α-Effekt: Helizität der konvektiven Wirbel (Coriolis-Kraft) regeneriert poloidales Feld aus toroidalem. Der 11-jährige Sonnenzyklus spiegelt die periodische Umpolung des solaren Magnetfelds wider.",
        difficulty = 3,
        funFact = "Ohne den magnetischen Dynamo gäbe es keine Sonnenflecken, keine Korona, keinen Sonnenwind und damit keine Polarlichter — das Magnetfeld der Sonne ist die Quelle all dieser Phänomene."
    ),

    // Question 31 – Behavioral Neuroscience: Reward Circuits
    Question(
        categoryId = 2,
        questionText = "Was ist die Rolle der dopaminergen Neurone im ventralen Tegmentum (VTA) im Belohnungssystem?",
        answerA = "VTA-Neurone feuern tonisch bei jeder Bewegungsinitiierung und kodieren motorische Befehle",
        answerB = "VTA-Neurone kodieren Belohnungsprädiktion-Fehler: sie feuern bei unerwarteten Belohnungen, werden gehemmt bei ausbleibenden erwarteten Belohnungen und zeigen keine Antwort bei erwarteten Belohnungen",
        answerC = "VTA-Neurone hemmen den Hippocampus während der Belohnungsphase, um Kontextgedächtnis zu unterdrücken",
        answerD = "VTA-Neurone setzen Endorphine frei, die über den Nucleus accumbens das subjektive Lustgefühl erzeugen",
        correctAnswer = 1, // B
        explanation = "Die Dopamin-Belohnungsprädiktion-Fehler-Hypothese (Schultz, Dayan, Montague 1997): VTA-Dopaminneurone kodieren das Signal (r - V), wobei r die tatsächliche und V die erwartete Belohnung ist. Bei unerwarteter Belohnung: phasisches Feuern ↑. Bei erwarteter Belohnung: keine Reaktion. Bei ausbleibender erwarteter Belohnung: Hemmung zum Zeitpunkt des erwarteten Ereignisses. Dieses Signal ermöglicht Lernen durch temporale Differenz-Verstärkungslernen.",
        difficulty = 3,
        funFact = "Dieses Belohnungssignal-Prinzip ist die biologische Grundlage für Reinforcement Learning in der KI — das gleiche mathematische Prinzip steckt hinter AlphaGo und modernen KI-Systemen."
    ),

    // Question 32 – Behavioral Neuroscience: Addiction
    Question(
        categoryId = 2,
        questionText = "Welcher neurobiologische Mechanismus erklärt die Toleranzentwicklung bei chronischem Opioidkonsum?",
        answerA = "Chronische Opioidexposition führt zu vermehrter Expression von μ-Opioidrezeptoren und erhöhter Sensitivität des Belohnungssystems",
        answerB = "Langfristige Rezeptoraktivierung führt zu Desensitisierung (β-Arrestin-Internalisierung) und Downregulation von μ-Opioidrezeptoren sowie Anpassungen der intrazellulären cAMP-Signalkaskade",
        answerC = "Opioidtoleranz entsteht durch Überproduktion von Endorphinen, die mit exogenen Opioiden konkurrieren",
        answerD = "Chronischer Konsum stimuliert GABA-erge Inhibition im VTA und reduziert Dopaminausschüttung permanent",
        correctAnswer = 1, // B
        explanation = "Chronische μ-Opioidrezeptor-Aktivierung führt zu: (1) Akut: β-Arrestin-2-Rekrutierung → Rezeptor-Internalisierung → Desensitisierung. (2) Chronisch: Downregulation der Rezeptordichte, Upregulation der Adenylatzyklase (AC-Supersensitivität). Bei Entzug: die hochregulierte AC produziert exzessiv cAMP → 'cAMP rebound' erklärt physische Entzugssymptome wie Tachykardie, Schwitzen, Hyperalgesie.",
        difficulty = 3,
        funFact = null
    ),

    // Question 33 – Behavioral Neuroscience: Sleep Stages
    Question(
        categoryId = 2,
        questionText = "Welche Rolle spielt der Hippocampus-Neokortex-Dialog im NREM-Tiefschlaf für die Gedächtniskonsolidierung?",
        answerA = "Hippocampale Theta-Wellen koordinieren sich mit kortikalen Beta-Wellen, um deklarative Gedächtnisinhalte zu löschen",
        answerB = "Hippocampale scharfe Wellen-Ripples (SWRs) werden mit kortikalen Slow Oscillations und Schlafspindeln koordiniert; dadurch werden neu encodierte Gedächtnisspuren in den Neokortex transferiert",
        answerC = "Im Tiefschlaf ist der Hippocampus inaktiv; Gedächtniskonsolidierung findet ausschließlich im REM-Schlaf durch Träume statt",
        answerD = "Astrozyten bereinigen im Tiefschlaf giftige Metabolite wie Amyloid-β, was indirekt die Synaptische Plastizität verbessert",
        correctAnswer = 1, // B
        explanation = "Das Two-Stage-Memory-Modell (Buzsáki): Tagsüber werden Erinnerungen schnell im Hippocampus encodiert (schnelle synaptische Plastizität). Im NREM-Tiefschlaf replizieren hippocampale SWRs (80–140 Hz) Tageserlebnisse und koordinieren mit kortikalen Slow Oscillations (0,5–1 Hz) und thalamokortikalen Schlafspindeln (12–15 Hz). Dieser 3-fache Rhythmus-Coupling ermöglicht schrittweise Transfer und Integration in Neokortex-Netzwerke.",
        difficulty = 3,
        funFact = "Schlafentzug nach dem Lernen reduziert die Gedächtniskonsolidierung erheblich. 'Eine Nacht drüber schlafen' hat eine echte neurobiologische Grundlage."
    ),

    // Question 34 – Behavioral Neuroscience: Mirror Neurons
    Question(
        categoryId = 2,
        questionText = "Welche Eigenschaft definiert Spiegelneurone und wo wurden sie zuerst entdeckt?",
        answerA = "Neurone im primären motorischen Kortex, die nur bei eigenen zielgerichteten Bewegungen feuern, nicht bei beobachteten",
        answerB = "Neurone im prämotorischen Kortex von Makaken (Area F5), die sowohl beim Ausführen als auch beim Beobachten derselben zielgerichteten Handlung aktiv werden",
        answerC = "Spiegelneurone im anterioren cingulären Kortex kodieren sowohl eigenen als auch fremden Schmerz",
        answerD = "Neurone in der Amygdala, die emotionale Mimik spiegeln und die Grundlage für Empathie bilden",
        correctAnswer = 1, // B
        explanation = "Spiegelneurone wurden 1992 von Rizzolatti und Kollegen in Area F5 des Makaken-Prämotorkortex entdeckt. Sie feuern sowohl wenn der Affe selbst eine zielgerichtete Handlung ausführt (z.B. Nuss greifen) als auch wenn er dieselbe Handlung bei einem anderen beobachtet. Beim Menschen wurden homologe Aktivierungen in Area 44 (Broca) und IPL (inferior parietaler Lobulus) per fMRT nachgewiesen.",
        difficulty = 3,
        funFact = "Die 'gequetschte Nuss'-Entdeckung: Rizzolatti's Team bemerkte die Spiegelneurone zufällig, als ein Forscher die Elektrode des Makaken anlegt hatte und eine Nuss aß — das Neuron feuerte, obwohl der Affe nur zuschaute."
    ),

    // Question 35 – Behavioral Neuroscience: Fear Conditioning
    Question(
        categoryId = 2,
        questionText = "Welche synaptische Plastizitätsform in der Amygdala liegt der Furchtkonditionierung zugrunde?",
        answerA = "Langzeitdepression (LTD) in den Neuronen des zentralen Amygdala-Kerns durch wiederholte nicht-bedrohliche Stimuli",
        answerB = "NMDA-Rezeptor-abhängige Langzeitpotenzierung (LTP) an thalamokortikalen Synapsen auf die basale laterale Amygdala (BLA), assoziativ verstärkt durch US-CS-Kopplung",
        answerC = "Dopamin-abhängige Modulation des Nucleus accumbens vermittelt die aversive Konditionierung über das mesolimbische System",
        answerD = "Erhöhte GABAerge Inhibition in der Amygdala wird durch den unkonditionierten Stimulus (US) dauerhaft reduziert",
        correctAnswer = 1, // B
        explanation = "Bei klassischer Furchtkonditionierung (CS: Ton + US: Schock) konvergieren CS-Information (thalamisch + kortikal) und US-Information (aus dem Hirnstamm) auf Neuronen der BLA. Die simultane Aktivierung führt zu NMDA-Rezeptor-abhängiger LTP an CS-Synapsen. Nach Konditionierung aktiviert der CS allein BLA-Neurone → Furchtreaktion über zentralen Amygdala-Kern (Freeze, autonome Reaktionen). Extinktion erfordert neues Lernen im medialen präfrontalen Kortex, nicht Löschung der Amygdala-Spur.",
        difficulty = 3,
        funFact = null
    ),

    // Question 36 – Polymer Chemistry: Polymerization Types
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet lebende anionische Polymerisation von radikalischer Kettenpolymerisation?",
        answerA = "Radikalische Polymerisation läuft isothermal ab; anionische Polymerisation benötigt Wärme als Initiator",
        answerB = "Bei lebender anionischer Polymerisation gibt es keine Terminierungsreaktion; das aktive Kettenende bleibt reaktionsfähig und ermöglicht definierte Molmassen und Blockcopolymere",
        answerC = "Anionische Polymerisation benötigt einen Metallkatalysator; radikalische Polymerisation arbeitet mit Peroxidinitiatoren",
        answerD = "Radikalische Polymerisation erzeugt ataktische Polymere; anionische erzeugt stets isotaktische Strukturen durch gerichteten Kettenangriff",
        correctAnswer = 1, // B
        explanation = "In der lebenden anionischen Polymerisation (initiiert z.B. durch n-BuLi) sind Terminierungs- und Übertragungsreaktionen eliminiert. Die aktiven Carbanion-Kettenenden wachsen einheitlich bis zum Monomerenverbrauch. Vorteile: enge Molmassenverteilung (PDI → 1,0), kontrolliertes Molekulargewicht (M_n = [M]/[I] × M_Monomer), Möglichkeit der sequentiellen Blockcopolymersynthese durch Zugabe von zweitem Monomer nach vollständigem Umsatz des ersten.",
        difficulty = 3,
        funFact = "Lebende Polymerisation wurde von Michael Szwarc 1956 entdeckt. Er nannte sie 'living' weil die Ketten nicht sterben — ein poetischer Name für ein fundamentales Konzept der Polymerchemie."
    ),

    // Question 37 – Polymer Chemistry: Rubber Vulcanization
    Question(
        categoryId = 2,
        questionText = "Welcher chemische Mechanismus liegt der Vulkanisation von Naturkautschuk mit Schwefel zugrunde?",
        answerA = "Schwefelatome addieren an die C=C-Doppelbindungen und erhöhen die Kettenlänge des Polymers",
        answerB = "Schwefelbrücken (-S_x-) quervernetzen die Polyisoprenketten über allylische C-H-Positionen, wodurch ein dreidimensionales Netzwerk entsteht",
        answerC = "Schwefel deprotoniert allylische Positionen und initiiert radikalische Polymerisation zur Vernetzung",
        answerD = "ZnO-Schwefel-Komplexe koordinieren benachbarte Ketten und bilden ionische Quervernetzungen",
        correctAnswer = 1, // B
        explanation = "Bei der Vulkanisation reagiert elementarer Schwefel (S₈) bei 140–180°C mit allylischen C-H-Positionen der Polyisopren-Ketten. Beschleuniger (z.B. Sulfenamide) und Aktivatoren (ZnO/Stearinsäure) erhöhen Effizienz und Selektivität. Es entstehen Poly(di-, mono-)sulfidbrücken (-C-S_x-C-, x=1-8) zwischen Nachbarketten. Diese kovalenten Quervernetzungen verleihen Gummi seine Elastizität, Reißfestigkeit und Temperaturbeständigkeit.",
        difficulty = 3,
        funFact = "Charles Goodyear entdeckte die Vulkanisation 1839 durch Zufall: Er ließ eine Gummi-Schwefel-Mischung auf einem heißen Ofen liegen. Die Entdeckung revolutionierte die Reifenindustrie."
    ),

    // Question 38 – Polymer Chemistry: Biodegradable Polymers
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus degradiert Polylactid (PLA) in der Umwelt und welche Faktoren beeinflussen die Abbaurate?",
        answerA = "PLA wird durch mikrobielle Esterasen unter Freisetzung von Methan abgebaut; Temperatur ist der wichtigste Faktor",
        answerB = "PLA degradiert primär durch hydrolytische Spaltung der Esterbindungen (bulk erosion); Temperatur >55°C, Feuchtigkeit und pH beschleunigen den Abbau erheblich",
        answerC = "PLA wird durch UV-Strahlung photolytisch gespalten und in CO₂ und H₂O überführt; direktes Sonnenlicht ist notwendig",
        answerD = "PLA degradiert durch enzymatischen Abbau von Proteasen im Boden; die Stereochemie (L vs. D-PLA) hat keinen Einfluss",
        correctAnswer = 1, // B
        explanation = "PLA (Polymerisation von L-Milchsäure) degradiert durch zwei Stufen: (1) Hydrolytische Kettenspaltung (Bulk Erosion): H₂O diffundiert ins Volumen und spaltet Esterbindungen, die Molmasse sinkt (Induktionsphase oft Monate). (2) Mikrobielle Mineralisierung der entstehenden Oligomere/Milchsäure. Kritisch: PLA braucht industrielle Kompostierungsbedingungen (>55°C) — bei Umgebungstemperatur dauert der Abbau viele Jahre. L-PLA ist langsamer abbaubar als D,L-PLA.",
        difficulty = 3,
        funFact = null
    ),

    // Question 39 – Polymer Chemistry: Conducting Polymers
    Question(
        categoryId = 2,
        questionText = "Was ist der Mechanismus der elektrischen Leitfähigkeit in Polyacetylen nach Dotierung?",
        answerA = "Metallatome diffundieren in die Polymerkette und übertragen Elektronen über koordinative Bindungen",
        answerB = "Konjugiertes π-Elektronen-System ermöglicht Lochleitung; Dotierung (z.B. I₂ = p-Typ) erzeugt polaronische Ladungsträger, die sich entlang der Konjugationskette bewegen",
        answerC = "Kristallisierte Bereiche des Polyacetylens leiten durch Bandlückenüberwindung wie Silizium; Dotierung verringert die Bandlücke",
        answerD = "Leitfähigkeit entsteht durch Hopping von Elektronen zwischen separierten sp³-Kohlenstoffzentren",
        correctAnswer = 1, // B
        explanation = "Polyacetylen hat ein konjugiertes π-System entlang der Kette. Im undotierten Zustand ist es halbleitend (Bandlücke ~1,5 eV). Dotierung mit I₂ (p-Typ) oder Na (n-Typ) entzieht/fügt Elektronen hinzu und erzeugt Polarone (Ladung + lokale Gitterverzerrung) oder Bipolarone. Diese delokalisierten Ladungsträger können sich entlang des π-Konjugationssystems bewegen. Heeger, MacDiarmid und Shirakawa erhielten dafür 2000 den Nobelpreis für Chemie.",
        difficulty = 3,
        funFact = "Leitende Polymere werden heute in OLEDs, organischen Solarzellen und flexiblen Elektronik eingesetzt — die Entdeckung hat eine ganze neue Technologiegeneration ermöglicht."
    ),

    // Question 40 – Polymer Chemistry: Polymer Crystallinity
    Question(
        categoryId = 2,
        questionText = "Warum können Polymere niemals 100% kristallin sein und was beeinflusst den Kristallinitätsgrad?",
        answerA = "Chemische Verunreinigungen bei der Synthese verhindern vollständige Kristallisation; höhere Reinheit erhöht den Kristallinitätsgrad",
        answerB = "Kettenverschlaufungen, Kettenenden und sterische Unregelmäßigkeiten (Ataktizität) können nicht in ein perfektes Kristallgitter eingebaut werden; langsame Abkühlung, Taktizität und Kettenregelmäßigkeit erhöhen den Kristallinitätsgrad",
        answerC = "Polymerketten sind zu lang, um in Kristallstrukturen zu passen; nur kurze Oligomere können vollständig kristallisieren",
        answerD = "Der zweite Hauptsatz der Thermodynamik verbietet vollständige Kristallinität bei Temperaturen über 0 K",
        correctAnswer = 1, // B
        explanation = "Polymere bestehen aus langen Ketten mit topologischer Komplexität (Verschlaufungen, die bei Kristallisation nicht aufgelöst werden können), Kettenenden (stören Gitterperiodizität) und Konfigurationsunregelmäßigkeiten (ataktische Zentren passen nicht ins Gitter). Kristallinitätsgrad steigt bei: Isotaktizität (geordnete Seitengruppen), linearer Kettenarchitektur, langsamer Abkühlung (mehr Zeit zur Kristallkeimbildung), symmetrischen Monomeren. Typische Werte: HDPE ~80%, LDPE ~45%, ataktisches PS: <5% kristallin.",
        difficulty = 3,
        funFact = null
    ),

    // Question 41 – Astrobiology: Habitable Zone
    Question(
        categoryId = 2,
        questionText = "Was sind die innere und äußere Grenze der klassischen stellaren habitablen Zone und welche physikalischen Prozesse definieren sie?",
        answerA = "Innere Grenze: Wassergefrierung; äußere Grenze: CO₂-Kondensation in der Atmosphäre",
        answerB = "Innere Grenze: moist greenhouse / runaway greenhouse (Wasserverlust durch Photodissoziation); äußere Grenze: maximaler CO₂-Treibhauseffekt ohne H₂O-Kondensation (erste CO₂-Kondensation)",
        answerC = "Innere Grenze: Felsschmelze durch Solarstrahlung; äußere Grenze: Atmosphärengefrierung und Kollaps",
        answerD = "Innere Grenze: UV-Sterilisierung durch zu hohe Strahlung; äußere Grenze: unzureichende Photosynthese-Strahlung",
        correctAnswer = 1, // B
        explanation = "Die Kopparapu et al. HZ-Modelle definieren: Innere Grenze (konservativ ~0,95 AU): 'moist greenhouse' — bei hoher Insolation sättigt H₂O die Stratosphäre, UV photodissoziiert es, H₂ entweicht. Optimistisch: ~0,75 AU (runaway greenhouse). Äußere Grenze (konservativ ~1,67 AU): Maximum an CO₂-Treibhauseffekt, bei dem noch flüssiges Wasser existiert. CO₂-Kondensation in der Stratosphäre reflektiert Strahlung. Optimistisch: ~1,77 AU (first CO₂ condensation).",
        difficulty = 3,
        funFact = "Die Erde liegt komfortabel innerhalb der HZ — aber Venus überschreitet möglicherweise die innere Grenze (sie war früher vielleicht bewohnbar) und Mars liegt nahe der äußeren."
    ),

    // Question 42 – Astrobiology: Extremophile Types
    Question(
        categoryId = 2,
        questionText = "Welche molekularen Anpassungen ermöglichen Hyperthermophilen (Wachstum bei >80°C) die Stabilität ihrer Proteine?",
        answerA = "Sie verwenden RNA statt DNA als genetisches Material, da RNA bei hohen Temperaturen stabiler ist",
        answerB = "Erhöhter Anteil ionischer Wechselwirkungen, hydrophober Kern, Disulfidbrücken, ringförmige Aminosäuren (Pro) und salt bridges stabilisieren die Tertiärstruktur; reverse Gyrierung erhöht die DNA-Topologie-Stabilität",
        answerC = "Hyperthermophile synthetisieren Hitzeschockproteine, die alle anderen Proteine permanent gefaltet halten",
        answerD = "Ihre Membranlipide bestehen aus Tetraether-Lipiden, die auch die Proteine stabilisieren durch direkte Wechselwirkung",
        correctAnswer = 1, // B
        explanation = "Thermostabile Proteine zeigen: erhöhte hydrophobe Kern-Packungsdichte, mehr Salzbrücken zwischen geladenen Aminosäuren, erhöhter Pro-Gehalt (rigidisiert Scharnierregionen), interne Disulfidbrücken (bei oxidierenden Bedingungen), N-/C-terminal verknüpfte Schleifen. Archaeelle DNA wird durch Reverse-Gyrasen positiv supercoiliert (statt negativ wie bei Bakterien/Eukaryoten), was die Doppelhelix bei hohen Temperaturen stabilisiert.",
        difficulty = 3,
        funFact = "Taq-Polymerase aus Thermus aquaticus (gefunden in Yellowstone-Quellen) ermöglichte die PCR-Technik — eine thermostabile DNA-Polymerase veränderte die gesamte Molekularbiologie."
    ),

    // Question 43 – Astrobiology: Biosignatures
    Question(
        categoryId = 2,
        questionText = "Warum ist Sauerstoff (O₂) allein kein eindeutiges Biosignaturgas und welche Kombination von Gasen wäre überzeugender?",
        answerA = "O₂ kann durch abiotische Photolyse von Wasser oder CO₂ entstehen; die Kombination O₂ + CH₄ im Ungleichgewicht ist überzeugender, da beide ohne Leben schnell miteinander reagieren würden",
        answerB = "O₂ ist nur bei Planeten mit blauem Lichtspektrum detektierbar; auf roten Zwergen ist es nicht als Biosignatur verwendbar",
        answerC = "O₂ ist in der Atmosphäre fast aller Planeten vorhanden; erst N₂O ist ein einzigartiges Lebenssignal",
        answerD = "O₂ kann nur durch spektroskopische Messungen der Vegetation nachgewiesen werden; der Red-Edge-Effekt ist das eigentliche Biosignatur",
        correctAnswer = 0, // A
        explanation = "Sauerstoff allein kann abiotisch entstehen: Photolyse von H₂O oder CO₂ (besonders bei M-Zwergen mit hohem UV-Fluss), gefolgt von H₂/CO-Entweichen. Desshalb: Kontextabhängige Interpretation nötig. Überzeugendere Biosignaturen sind Gaspaare im chemischen Ungleichgewicht: O₂ + CH₄ — beide reagieren zu CO₂ + H₂O und müssen ständig biologisch nachgeliefert werden (Erde: ~21% O₂ durch Photosynthese, ~1,7 ppm CH₄ durch Methanogene). Auch O₃ + N₂O oder das 'Red Edge' der Vegetation sind robustere Biosignaturen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 44 – Astrobiology: Titan's Methane
    Question(
        categoryId = 2,
        questionText = "Warum ist das Vorhandensein von Methan in Titans Atmosphäre astrobiologisch interessant und welche abiotischen Quellen wurden vorgeschlagen?",
        answerA = "Methan in Titans Atmosphäre stammt aus Kommeteneinschlägen und ist daher kein Hinweis auf Leben",
        answerB = "Methan wird durch UV-Strahlung schnell photolytisch abgebaut (HWZ ~30 Mio. Jahre); eine kontinuierliche Quelle ist nötig — Kandidaten sind kryovulkanische Ausgasungen, Serpentenisierungsreaktionen oder (spekulativ) methanogene Organismen in flüssigem Ethan/Methan",
        answerC = "Titans Methan stammt aus dem inneren Kern durch radioaktiven Zerfall von Uran",
        answerD = "Methan auf Titan hat keine astrobiologische Relevanz, da die Temperatur mit -179°C jede Biochemie unmöglich macht",
        correctAnswer = 1, // B
        explanation = "Titans Atmosphäre enthält ~5% CH₄, obwohl UV-Photolyse es in ~30 Mio. Jahren vollständig abbaut. Ohne ständige Nachlieferung wäre Titan längst CH₄-frei. Abiotische Quellen: Kryovulkanismus (Ausgasung von NH₃-H₂O-Eis), Serpentinisierung (Fe²⁺-Mineralien + H₂O → H₂ + CH₄), thermischer Abbau organischer Materialien. Spekulativ: Methanogene in Oberflächenseen aus flüssigem Methan/Ethan — solche Organismen bräuchten eine nicht-wässrige, kryogene Biochemie.",
        difficulty = 3,
        funFact = "Cassini-Huygens entdeckte Seen und Meere auf Titan, bestehend aus flüssigem Methan und Ethan bei -179°C. Die Dragonfly-Mission (2034) soll dies direkt erkunden."
    ),

    // Question 45 – Astrobiology: SETI Methods
    Question(
        categoryId = 2,
        questionText = "Was ist die Drake-Gleichung und welche Terme sind am unsichersten?",
        answerA = "Eine Formel zur Berechnung der Reisezeit zwischen Sternen; unsicherste Terme sind Entfernung und Antriebstechnologie",
        answerB = "N = R* · f_p · n_e · f_l · f_i · f_c · L: Schätzung kommunizierender Zivilisationen in der Galaxis; am unsichersten sind f_l (Ursprung des Lebens), f_i (Intelligenz-Entstehung) und L (Zivilisations-Lebensdauer)",
        answerC = "Eine statistische Methode um SETI-Signale vom kosmischen Rauschen zu unterscheiden; unsicherster Faktor ist das Signal-Rausch-Verhältnis",
        answerD = "Formel für die Anzahl bewohnbarer Planeten in der Galaxis; am unsichersten ist die Sternbildungsrate R*",
        correctAnswer = 1, // B
        explanation = "Die Drake-Gleichung (Frank Drake, 1961): N = R* · f_p · n_e · f_l · f_i · f_c · L. Heute gut bekannte Terme: R* (Sternbildungsrate ~1–3/Jahr), f_p (planetarische Systeme ~1), n_e (bewohnbare Planeten ~0,1–1). Hochgradig unsicher: f_l (Wahrscheinlichkeit der Lebensentstehung: 10⁻¹⁰ bis ~1), f_i (Wahrscheinlichkeit intelligenten Lebens), f_c (kommunizierende Zivilisationen), und vor allem L (Lebensdauer in Jahren: 100 bis 10⁹?). Diese Terme spannen Größenordnungen auf.",
        difficulty = 3,
        funFact = "Die Drake-Gleichung war primär ein Gesprächsstarter für das erste SETI-Meeting 1961, nicht eine präzise wissenschaftliche Formel. Drake selbst schätzte N auf etwa 10."
    ),

    // Question 46 – Medical Physics: MRI Physics
    Question(
        categoryId = 2,
        questionText = "Was ist der Ursprung des MRI-Signals und welche Rolle spielen T1- und T2-Relaxationszeiten?",
        answerA = "MRI misst die Röntgenabsorption von Kalzium in Knochen; T1 ist die Knochendichte, T2 die Knochenmineralisierungsrate",
        answerB = "Kernspins von ¹H-Atomen werden durch B₀-Feld ausgerichtet, durch RF-Puls ausgelenkt; T1 = longitudinale Relaxation (Spin-Gitter), T2 = transversale Relaxation (Spin-Spin); unterschiedliche T1/T2-Werte erzeugen Gewebekontrast",
        answerC = "Elektronen in Wassermolekülen werden durch den starken Magnetfeld in angeregte Zustände gehoben; die Emissionsfrequenz hängt von der Elektronendichte des umgebenden Gewebes ab",
        answerD = "Das MRI-Signal stammt aus der Piezoelektrizität von Kollagen-Fasern; T1 und T2 beschreiben die mechanischen Schwingungszeiten",
        correctAnswer = 1, // B
        explanation = "Im Magnetfeld B₀ richten sich ¹H-Kernspins aus (Larmor-Frequenz ω₀ = γB₀). Ein RF-Puls (B₁, 90° oder 180°) kippt die Magnetisierung. T1 (Spin-Gitter-Relaxation): Längsmagnetisierung kehrt zum Gleichgewicht zurück (exponentiell, Wärme an Gitterschwingungen). T2 (Spin-Spin-Relaxation): Transversale Magnetisierung dephasiert durch lokale Feldinhomogenitäten zwischen Spins. Gewebe unterscheiden sich in T1/T2 (z.B. Fett: kurzes T1, langes T2; Wasser: langes T1 und T2), was ohne Kontrastmittel Weichgewebekontrast ermöglicht.",
        difficulty = 3,
        funFact = "Paul Lauterbur und Peter Mansfield erhielten 2003 den Nobelpreis für MRI — Felix Bloch und Edward Purcell erhielten ihn bereits 1952 für die NMR-Grundlagen."
    ),

    // Question 47 – Medical Physics: Radiation Therapy
    Question(
        categoryId = 2,
        questionText = "Was ist das Prinzip der Protonentherapie und welchen physikalischen Vorteil hat sie gegenüber konventioneller Photonenstrahlung?",
        answerA = "Protonen haben eine geringere biologische Wirksamkeit als Photonen und werden daher für radiosensibles Gewebe eingesetzt",
        answerB = "Protonen deponieren den Großteil ihrer Energie am Ende ihrer Reichweite (Bragg-Peak), was präzise Dosisdeposition im Tumor bei Schonung des dahinterliegenden Gewebes ermöglicht",
        answerC = "Protonentherapie nutzt die direkte ionisierende Wirkung ohne Freie-Radikal-Bildung, was normales Gewebe vollständig schützt",
        answerD = "Protonen dringen tiefer als Photonen ein und eignen sich nur für oberflächliche Tumoren bis 5 cm Tiefe",
        correctAnswer = 1, // B
        explanation = "Protonen verlieren Energie hauptsächlich durch Bethe-Bloch-Ionisation und zeigen ein charakteristisches Bragg-Peak-Muster: geringe Dosis im Eintrittgewebe, scharf ansteigende maximale Dosis am Ende der Reichweite (die eingestellt wird), dann Nulldosis dahinter. Photonen dagegen zeigen exponentielle Dosis-Tiefenkurve (höchste Dosis oberflächennah, kontinuierlicher Abfall). Der Bragg-Peak ermöglicht: hohe Tumordosis, niedrige Exit-Dosis, reduzierte Normalgewebe-Dosis besonders bei pädiatrischen Tumoren und Tumoren neben kritischen Strukturen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 48 – Medical Physics: Ultrasound Imaging
    Question(
        categoryId = 2,
        questionText = "Was ist der Doppler-Effekt in der medizinischen Ultraschalldiagnostik und wie wird er klinisch genutzt?",
        answerA = "Der Doppler-Effekt beschreibt die Abschwächung von Ultraschall in tiefem Gewebe; er wird genutzt um Gewebetiefe zu berechnen",
        answerB = "Ultraschall, der von bewegten Erythrozyten reflektiert wird, zeigt eine frequenzverschobene Echofrequenz (Δf = 2·f₀·v·cos(θ)/c); dies erlaubt die Messung von Blutflussgeschwindigkeit und -richtung",
        answerC = "Piezoelektrische Kristalle erzeugen Doppler-Muster durch Interferenz; das Muster kodiert Gewebedichte und Elastizität",
        answerD = "Doppler-Ultraschall nutzt nichtlinearen Harmonics-Effekt zur Verbesserung der Auflösung gegenüber konventionellem B-Mode",
        correctAnswer = 1, // B
        explanation = "Der medizinische Doppler-Ultraschall basiert auf der Frequenzverschiebung Δf = 2·f₀·v·cos(θ)/c, wobei v die Blutflussgeschwindigkeit, θ der Winkel zwischen Schallstrahl und Flussrichtung (optimal θ <60°), f₀ die Sendefrequenz und c die Schallgeschwindigkeit im Gewebe (~1540 m/s) sind. Anwendungen: Continuous Wave (CW) für hohe Geschwindigkeiten (Herzklappenstenosen), Pulsed Wave (PW) für ortsauflösende Flussmessung, Farb-Doppler für 2D-Flussdarstellung.",
        difficulty = 3,
        funFact = "Doppler-Echokardiographie ermöglicht nicht-invasive Druckmessung über Herzklappen via vereinfachter Bernoulli-Gleichung: ΔP = 4·v² (mmHg) — die Kardiologie wurde dadurch revolutioniert."
    ),

    // Question 49 – Medical Physics: PET Scan Principles
    Question(
        categoryId = 2,
        questionText = "Wie funktioniert die Positronenemissions-Tomographie (PET) auf physikalischer Ebene?",
        answerA = "Ein radioaktives Isotop emittiert γ-Strahlen in eine definierte Richtung; Detektoren messen die Strahlungsintensität analog zur Computertomographie",
        answerB = "Ein β⁺-Emitter (z.B. ¹⁸F) emittiert Positronen, die nach ~1 mm Annihilation mit Elektronen zwei koinzidente 511-keV-γ-Quanten in entgegengesetzte Richtungen emittieren; Koinzidenznachweis ermöglicht tomographische Rekonstruktion",
        answerC = "Radioaktive Ionen werden durch Magnetfelder gelenkt und auf Detektoren fokussiert; die Ablenkung hängt von der Gewebedichte ab",
        answerD = "PET nutzt die natürliche Radioaktivität von Kalium-40 im Körper; externe Detektoren messen die räumliche Verteilung",
        correctAnswer = 1, // B
        explanation = "¹⁸F-FDG (¹⁸Fluor-Deoxyglucose, HWZ 110 min) wird injiziert und reichert sich in metabolisch aktiven Zellen an. ¹⁸F zerfällt durch β⁺-Emission (Positron). Das Positron annihiliert nach ~1 mm mit einem Elektron und erzeugt zwei γ-Quanten (je 511 keV) in exakt entgegengesetzten Richtungen (180° ± 0,5°). Koinzidenzdetektoren erfassen beide Quanten innerhalb eines Zeitfensters (~10 ns) und definieren eine Responselinie (LOR). Mathematische Rekonstruktion (FBP oder OSEM) ergibt 3D-Stoffwechselbilder.",
        difficulty = 3,
        funFact = "PET/CT kombiniert metabolische Information (PET) mit anatomischer Lokalisation (CT) in einer Untersuchung. In der Onkologie kann ein einziger Scan den gesamten Körper auf Tumore untersuchen."
    ),

    // Question 50 – Medical Physics: Dosimetry
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen absorbierter Dosis (Gray) und effektiver Dosis (Sievert) in der Strahlendosimetrie?",
        answerA = "Gray misst die Strahlenenergie pro Fläche; Sievert berücksichtigt die zeitliche Verteilung der Exposition",
        answerB = "Absorbierte Dosis (Gy = J/kg) misst deponierte Energie pro Masse; effektive Dosis (Sv) multipliziert die absorbierte Dosis mit Strahlungs-Wichtungsfaktor (w_R) und Gewebe-Wichtungsfaktor (w_T) für biologisches Risiko",
        answerC = "Gray gilt für externe Bestrahlung; Sievert nur für Inkorporation radioaktiver Stoffe im Körper",
        answerD = "Beide Einheiten sind identisch für Gammastrahlung; sie unterscheiden sich nur bei Neutronen und schweren Ionen",
        correctAnswer = 1, // B
        explanation = "Absorbierte Dosis D [Gy = J/kg] beschreibt rein physikalisch die im Gewebe deponierte Energiemenge. Äquivalentdosis H [Sv] = D × w_R berücksichtigt die unterschiedliche biologische Wirksamkeit: Photonen/Elektronen: w_R=1; Protonen: w_R=2; α-Teilchen: w_R=20; schwere Ionen: w_R=20. Effektive Dosis E [Sv] = Σ(w_T × H_T) gewichtet zusätzlich die Strahlensensitivität verschiedener Gewebe (Gonaden w_T=0,08; Knochenmark/Kolon/Lunge je 0,12; Haut 0,01) und erlaubt das Gesamtkrebsrisiko zu vergleichen.",
        difficulty = 3,
        funFact = "Die natürliche Hintergrundstrahlung in Deutschland beträgt etwa 2,1 mSv/Jahr. Ein transatlantischer Flug entspricht ~0,05 mSv, ein Thorax-CT ~7 mSv — das hilft, Strahlenrisiken einzuordnen."
    )

)
