package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsHard4(): List<Question> = listOf(

    // ── VITAMINE ──────────────────────────────────────────────────────────────

    // Q1 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches Vitamin wird im menschlichen Körper durch UV-B-Strahlung der Sonne aus 7-Dehydrocholesterol synthetisiert?",
        answerA = "Vitamin A (Retinol)",
        answerB = "Vitamin E (Tocopherol)",
        answerC = "Vitamin K (Phyllochinon)",
        answerD = "Vitamin D3 (Cholecalciferol)",
        correctAnswer = 3,
        explanation = "UV-B-Strahlung (290–315 nm) wandelt 7-Dehydrocholesterol in der Haut zu Prä-Vitamin D3 um, das sich bei Körperwärme spontan zu Cholecalciferol (Vitamin D3) isomerisiert. Dieses wird in der Leber zu 25-Hydroxyvitamin D und in der Niere zur aktiven Form 1,25-Dihydroxyvitamin D (Calcitriol) umgewandelt.",
        difficulty = 3,
        funFact = "In Deutschland ist die Sonnenbestrahlung von Oktober bis März zu schwach für eine ausreichende Vitamin-D-Eigenproduktion — der Sonnenstand ist zu flach für UV-B."
    ),

    // Q2 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der biochemische Unterschied zwischen fettlöslichen und wasserlöslichen Vitaminen bezüglich der Speicherung im Körper?",
        answerA = "Fettlösliche Vitamine (A, D, E, K) werden im Fettgewebe und in der Leber gespeichert; wasserlösliche werden kaum gespeichert und täglich ausgeschieden",
        answerB = "Wasserlösliche Vitamine werden ausschließlich in der Leber gespeichert; fettlösliche im Blut gebunden",
        answerC = "Beide Gruppen werden gleich gut gespeichert, aber fettlösliche wirken schneller",
        answerD = "Fettlösliche Vitamine sind kurzlebig; wasserlösliche bleiben jahrelang im Körper erhalten",
        correctAnswer = 0,
        explanation = "Die fettlöslichen Vitamine A, D, E und K akkumulieren im Körperfett und der Leber und können bei exzessiver Zufuhr zu Hypervitaminose führen. Wasserlösliche Vitamine (B-Komplex, C) werden bei Überschuss renal ausgeschieden; ein Mangel entsteht daher schneller, eine Überdosierung über die Nahrung ist aber seltener.",
        difficulty = 3,
        funFact = "Vitamin B12 ist eine Ausnahme: Es wird in der Leber für 3–5 Jahre gespeichert, obwohl es wasserlöslich ist."
    ),

    // Q3 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches B-Vitamin ist Koenzym für über 100 Enzymreaktionen im Aminosäurestoffwechsel und verursacht bei Mangel periphere Neuropathie?",
        answerA = "Vitamin B1 (Thiamin)",
        answerB = "Vitamin B6 (Pyridoxin)",
        answerC = "Vitamin B3 (Niacin)",
        answerD = "Vitamin B2 (Riboflavin)",
        correctAnswer = 1,
        explanation = "Vitamin B6 (Pyridoxal-5-Phosphat, PLP) ist Koenzym für Transaminasen, Decarboxylasen und Lyasen, die Aminosäuren umwandeln. Mangel äußert sich in Dermatitis, Glossitis, peripherer Neuropathie und Depressionen. Es ist unverzichtbar für die Synthese von Neurotransmittern wie Serotonin, Dopamin und GABA.",
        difficulty = 3,
        funFact = "Hochdosierte B6-Supplementierung (über 50 mg/Tag über Monate) kann paradoxerweise eine sensorische Neuropathie verursachen — B6-Überdosierung ist eine der wenigen toxischen wasserlöslichen Vitaminreaktionen."
    ),

    // Q4 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem 'Intrinsic Factor' und für welches Vitamin ist er essenziell?",
        answerA = "Ein Transportprotein im Blut für Vitamin D; produziert in der Leber",
        answerB = "Ein Glykoprotein der Magenschleimhaut, das Vitamin B12 für die Resorption im Ileum bindet",
        answerC = "Ein Trägerprotein für Vitamin A, das in der Darmschleimhaut gebildet wird",
        answerD = "Ein intestinales Enzym, das Folsäure in die aktive Form Tetrahydrofolat umwandelt",
        correctAnswer = 1,
        explanation = "Der Intrinsic Factor (IF) ist ein von den Parietalzellen des Magens produziertes Glykoprotein. Er bindet Vitamin B12 und schützt es vor dem sauren Magenmilieu. Der IF-B12-Komplex wird im terminalen Ileum über spezifische Rezeptoren (Cubilin) aufgenommen. Fehlt der IF (z. B. bei Autoimmungastritis), entsteht perniziöse Anämie.",
        difficulty = 3,
        funFact = "Die Entdeckung des Intrinsic Factor wurde 1934 mit dem Nobelpreis für Medizin ausgezeichnet — Whipple, Minot und Murphy erhielten ihn für die Behandlung der perniziösen Anämie mit Leber."
    ),

    // Q5 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher Lebensmittelinhaltsstoff hemmt die Aufnahme von Vitamin C und in welchen Lebensmitteln kommt er häufig vor?",
        answerA = "Oxalsäure in Spinat und Rhabarber hemmt die Vitamin-C-Resorption durch Komplexbildung",
        answerB = "Phytinsäure in Getreide und Hülsenfrüchten bindet Vitamin C und verhindert die Absorption",
        answerC = "Tannine in Tee und Kaffee reduzieren die Bioverfügbarkeit von Vitamin C durch oxidative Inaktivierung",
        answerD = "Avidin im rohen Eiklar bindet Vitamin C und blockiert dessen intestinale Aufnahme",
        correctAnswer = 2,
        explanation = "Polyphenole wie Tannine in Tee, Kaffee und Rotwein können die Resorption von Vitamin C (Ascorbinsäure) durch Oxidation verringern. Ascorbinsäure wirkt selbst als Antioxidans und wird durch Reaktion mit Polyphenol-Oxidationsprodukten (Chinonen) verbraucht. Avidin blockiert Biotin (Vitamin B7), nicht Vitamin C.",
        difficulty = 3,
        funFact = "Gleichzeitige Aufnahme von Vitamin C mit Eisen erhöht die Eisenabsorption um bis zu 300 % — Ascorbinsäure reduziert dreiwertiges Fe³⁺ zu besser absorbierbarem Fe²⁺."
    ),

    // Q6 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist die aktive Form von Folsäure im Stoffwechsel und welche Mangelerkrankung ist besonders bei Schwangeren gefürchtet?",
        answerA = "5-Methyltetrahydrofolat (5-MTHF); Neuralrohrdefekte beim Fötus",
        answerB = "Pyridoxal-5-Phosphat; hämolytische Anämie beim Neugeborenen",
        answerC = "Methylcobalamin; Spina bifida durch Vitamin-B12-Mangel",
        answerD = "Folinsäure (Leucovorin); Megaloblastische Anämie der Mutter",
        correctAnswer = 0,
        explanation = "Folsäure wird im Körper zu Tetrahydrofolat (THF) und weiter zur aktiven Form 5-Methyltetrahydrofolat (5-MTHF) reduziert. THF ist essenziell für die DNA-Synthese (Purinsynthese, Thymidilat-Synthase). Bei Mangel in der frühen Schwangerschaft (3.–4. Woche) können Neuralrohrdefekte entstehen, da die neuronale Tube sich nicht vollständig schließt.",
        difficulty = 3,
        funFact = "Die DGE empfiehlt Frauen mit Kinderwunsch bereits 4 Wochen vor der Konzeption täglich 400 µg synthetische Folsäure zusätzlich zur normalen Ernährung einzunehmen."
    ),

    // Q7 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Vitamin ist als einziges mit Hormoncharakter bekannt und zentral an der Calciumhomöostase beteiligt?",
        answerA = "Vitamin E (alpha-Tocopherol)",
        answerB = "Vitamin D (Calcitriol / 1,25-Dihydroxycholecalciferol)",
        answerC = "Vitamin K2 (Menachinon-7)",
        answerD = "Vitamin A (all-trans-Retinsäure)",
        correctAnswer = 1,
        explanation = "Calcitriol (1,25-Dihydroxycholecalciferol), die aktive Form von Vitamin D, wirkt über nukleäre Rezeptoren (VDR) wie ein Steroidhormon. Es reguliert die intestinale Calciumresorption, die renale Calciumrückresorption und die Osteoklasten-Aktivierung. Kein anderes Vitamin wirkt in dieser Weise direkt als Hormon.",
        difficulty = 3,
        funFact = "Vitamin-D-Rezeptoren (VDR) wurden inzwischen in fast jedem menschlichen Gewebe gefunden — vom Immunsystem bis zu Herzmuskelzellen."
    ),

    // Q8 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Vitamin enthält als einziges ein Metall (Kobalt) als zentrales Ion in seiner molekularen Struktur?",
        answerA = "Vitamin K",
        answerB = "Vitamin B12 (Cobalamin)",
        answerC = "Vitamin E",
        answerD = "Vitamin C",
        correctAnswer = 1,
        explanation = "Vitamin B12 (Cobalamin) ist ein Corrinoid mit einem Corrinringsystem — ähnlich dem Porphyrin des Hämoglobins, aber mit einem zentralen Kobalt-Ion (Co) statt Eisen. Das Kobalt liegt je nach Coenzymform als Methyl-, Adenosyl- oder Hydroxocobalamin vor.",
        difficulty = 3,
        funFact = "Cobalamin ist die größte und strukturell komplexeste bekannte Vitaminmoleküle — sein Molekulargewicht beträgt 1.355 Dalton, fast hundertmal so groß wie Vitamin C."
    ),

    // ── MINERALSTOFFE & SPURENELEMENTE ────────────────────────────────────────

    // Q9 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Spurenelement ist Bestandteil der Schilddrüsenhormone Thyroxin (T4) und Trijodthyronin (T3)?",
        answerA = "Selen",
        answerB = "Fluor",
        answerC = "Jod",
        answerD = "Mangan",
        correctAnswer = 2,
        explanation = "Jod ist essenzieller Bestandteil der Schilddrüsenhormone: Thyroxin (T4) enthält 4 Jodatome, Trijodthyronin (T3) enthält 3. Die Schilddrüse nimmt Jodid aktiv auf und oxidiert es mittels Thyreoperoxidase zu reaktivem Jod, das Tyrosinreste am Thyreoglobulin jodiert. Jodmangel führt zu Kropf (Struma).",
        difficulty = 3,
        funFact = "Weltweit sind etwa 2 Milliarden Menschen von Jodmangel betroffen. Deutschland jodiert seit 1993 Speisesalz mit 15–25 µg Kaliumjodat pro Gramm."
    ),

    // Q10 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Enzym enthält Selen als selenocysteinhaltiges aktives Zentrum und schützt Zellmembranen vor oxidativer Schädigung?",
        answerA = "Superoxid-Dismutase (SOD)",
        answerB = "Katalase",
        answerC = "Glutathionperoxidase (GPx)",
        answerD = "Thioredoxinreduktase",
        correctAnswer = 2,
        explanation = "Glutathionperoxidase (GPx) enthält Selenocystein — eine Aminosäure, bei der das Schwefelatom durch Selen ersetzt ist — im aktiven Zentrum. GPx reduziert Wasserstoffperoxid (H₂O₂) und Lipidhydroperoxide unter Verbrauch von reduziertem Glutathion (GSH), wodurch oxidativer Stress in Zellen und Membranen neutralisiert wird.",
        difficulty = 3,
        funFact = "Selen-Tagesbedarf Erwachsener: ~60 µg. Die Breite zwischen Mangelbereich und toxischer Dosis ist extrem schmal — übermäßige Supplementierung kann innerhalb weniger Wochen zur Selenose führen."
    ),

    // Q11 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hämochromatose' und welches Mineral ist dabei betroffen?",
        answerA = "Eine genetisch bedingte Eisenspeicherkrankheit, bei der zu viel Eisen in Organen abgelagert wird",
        answerB = "Eine erworbene Calciumüberschuss-Erkrankung durch übermäßige Vitamin-D-Gabe",
        answerC = "Ein Zinkstoffwechseldefekt, der zu Haut- und Immunsystemschäden führt",
        answerD = "Eine Selenmangelerkrankung, die Herzmuskelschäden (Keshan-Krankheit) verursacht",
        correctAnswer = 0,
        explanation = "Hereditäre Hämochromatose ist eine häufige autosomal-rezessive Erbkrankheit (HFE-Gen-Mutation), bei der die intestinale Eisenabsorption chronisch erhöht ist. Eisen akkumuliert in Leber, Herz, Pankreas und Gelenken und verursacht Leberzirrhose, Kardiomyopathie, Diabetes mellitus und Arthralgien. Therapie: regelmäßige Aderlässe.",
        difficulty = 3,
        funFact = "Hämochromatose ist mit einer Häufigkeit von 1:200–400 in Nordeuropa eine der häufigsten genetischen Erkrankungen — viele Betroffene wissen jahrelang nichts davon."
    ),

    // Q12 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Mineral ist Cofaktor für über 300 Enzyme und wird bei intensivem Sport in erhöhtem Maß über den Schweiß verloren?",
        answerA = "Kalzium",
        answerB = "Phosphor",
        answerC = "Magnesium",
        answerD = "Natrium",
        correctAnswer = 2,
        explanation = "Magnesium ist Cofaktor für über 300 enzymatische Reaktionen, darunter alle ATP-abhängigen Reaktionen (ATP liegt physiologisch als Mg²⁺-ATP-Komplex vor), die DNA-Synthese, Proteinbiosynthese und Glykolyse. Bei Sport geht Magnesium verstärkt über Schweiß und Urin verloren. Mangel äußert sich in Muskelkrämpfen und Herzrhythmusstörungen.",
        difficulty = 3,
        funFact = "NMDA-Rezeptoren (wichtig für Lernprozesse) werden durch Magnesium-Ionen reguliert, was Magnesium auch neurobiologisch bedeutsam macht."
    ),

    // Q13 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Häm-Eisen und Nicht-Häm-Eisen in der Nahrung und welches wird besser absorbiert?",
        answerA = "Häm-Eisen (aus tierischen Lebensmitteln, in Porphyrin eingebunden) mit 15–35 % Bioverfügbarkeit; Nicht-Häm-Eisen (aus pflanzlichen Quellen) mit nur 2–20 %",
        answerB = "Nicht-Häm-Eisen hat identische Bioverfügbarkeit, wird aber durch Vitamin C gehemmt",
        answerC = "Häm-Eisen wird schlechter absorbiert, da die Porphyrinstruktur die Absorption verlangsamt",
        answerD = "Beide Eisenformen haben dieselbe Bioverfügbarkeit von ca. 10 % im Mittel",
        correctAnswer = 0,
        explanation = "Häm-Eisen (Fe²⁺ in Hämoglobin und Myoglobin von Fleisch und Fisch) wird über spezifische Häm-Carrier-Proteine direkt in Enterozyten aufgenommen — unabhängig von pH und Hemmfaktoren — mit einer Absorption von 15–35 %. Nicht-Häm-Eisen (Fe³⁺ aus Pflanzen) muss erst zu Fe²⁺ reduziert werden und wird durch Phytate, Tannine und Oxalat stark gehemmt.",
        difficulty = 3,
        funFact = "Eisenmangel ist bei Veganern überproportional häufig — nicht wegen zu wenig Eisen in Gramm, sondern durch niedrige Bioverfügbarkeit und Hemmfaktoren."
    ),

    // Q14 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche zwei Spurenelemente sind im aktiven Zentrum der cytosolischen Superoxid-Dismutase (Cu/Zn-SOD) enthalten?",
        answerA = "Eisen und Cobalt",
        answerB = "Mangan und Selen",
        answerC = "Kupfer und Zink",
        answerD = "Molybdän und Chrom",
        correctAnswer = 2,
        explanation = "Die cytosolische Cu/Zn-Superoxid-Dismutase enthält ein Kupfer-Ion (katalytisch aktiv) und ein Zink-Ion (strukturell stabilisierend) im aktiven Zentrum. Das Kupfer-Ion katalysiert die Dismutation von Superoxid-Radikalen (O₂⁻) zu Wasserstoffperoxid und molekularem Sauerstoff. In Mitochondrien gibt es die Mn-SOD.",
        difficulty = 3,
        funFact = "Mutationen im Gen der Cu/Zn-SOD1 sind mit familiärer amyotropher Lateralsklerose (ALS) assoziiert — oxidativer Schutz ist lebensnotwendig für Motoneuronen."
    ),

    // Q15 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Mineral ist Hauptbestandteil des Zahnschmelzes (Hydroxylapatit) und welche Verbindung entsteht durch Fluorid, die den Schmelz säureresistenter macht?",
        answerA = "Calcium; Fluorapatit (Ca₁₀(PO₄)₆F₂) durch Ersatz von OH⁻ durch F⁻",
        answerB = "Phosphor; Calciumphosphat durch Reaktion mit Fluoridionen",
        answerC = "Magnesium; Magnesiumfluorid durch Ionenaustausch im Schmelzgitter",
        answerD = "Silizium; Siliziumdioxid durch Einlagerung von Fluoridionen",
        correctAnswer = 0,
        explanation = "Zahnschmelz besteht zu ~97 % aus Hydroxylapatit Ca₁₀(PO₄)₆(OH)₂. Fluorid tauscht Hydroxyl-Ionen (OH⁻) gegen Fluorid-Ionen (F⁻) aus und bildet Fluorapatit Ca₁₀(PO₄)₆F₂. Fluorapatit hat einen niedrigeren Löslichkeits-pKs als Hydroxylapatit und ist damit deutlich säureresistenter.",
        difficulty = 3,
        funFact = "Zu hohe Fluoridaufnahme (>1,5 mg/L im Trinkwasser über Jahre) verursacht Dentalfluorose — weiße Flecken bis zu Verfärbungen am Zahnschmelz."
    ),

    // ── MAKRONÄHRSTOFFE & BIOCHEMIE ───────────────────────────────────────────

    // Q16 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist der glykämische Index (GI) und welche biochemische Eigenschaft des Lebensmittels beeinflusst ihn am stärksten?",
        answerA = "Der GI misst die Süßkraft relativ zu Saccharose; die Fruktose-Konzentration ist entscheidend",
        answerB = "Der GI misst die Kaloriendichte; Lebensmittel mit mehr als 4 kcal/g haben stets einen hohen GI",
        answerC = "Der GI ist ein Maß für den Blutglucose-Anstieg nach Konsum im Vergleich zu reiner Glucose; beeinflusst durch Kohlenhydrat-Struktur, Ballaststoffe und Verarbeitung",
        answerD = "Der GI bewertet die Insulinausschüttung; nur die Proteinmenge bestimmt den Index",
        correctAnswer = 2,
        explanation = "Der glykämische Index (GI) ist ein Maß für die Geschwindigkeit, mit der ein Lebensmittel den Blutglucosespiegel anhebt, verglichen mit reiner Glucose (GI = 100). Wesentliche Einflussfaktoren: Stärkestruktur (Amylose vs. Amylopektin), Ballaststoffe, Verarbeitungsgrad, Fettgehalt und Säure.",
        difficulty = 3,
        funFact = "Gekochte und abgekühlte Kartoffeln haben einen deutlich niedrigeren GI als frisch heiße Kartoffeln, da beim Abkühlen resistente Stärke Typ III entsteht."
    ),

    // Q17 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was sind 'essentielle Aminosäuren' und wie viele davon kann der menschliche Körper nicht selbst synthetisieren?",
        answerA = "5 essentielle Aminosäuren; der Körper kann die übrigen 15 selbst herstellen",
        answerB = "8–9 essentielle Aminosäuren (Leucin, Isoleucin, Valin, Lysin, Methionin, Phenylalanin, Threonin, Tryptophan; optional Histidin für Kinder)",
        answerC = "Alle 20 proteinogenen Aminosäuren sind essentiell, weil der Körper zu langsam synthetisiert",
        answerD = "12 essentielle Aminosäuren; alle aromatischen Aminosäuren sind essentiell",
        correctAnswer = 1,
        explanation = "Es gibt 8 essentielle Aminosäuren für Erwachsene: Leucin, Isoleucin, Valin (verzweigtkettig), Lysin, Methionin, Phenylalanin, Threonin und Tryptophan. Histidin ist für Kinder und bei manchen Erkrankungen essentiell. Der Körper kann konditionell-essentielle Aminosäuren (Arginin, Glutamin, Tyrosin) in ausreichender Menge selbst synthetisieren.",
        difficulty = 3,
        funFact = "Tryptophan ist die seltenste Aminosäure in Proteinen und die einzige Vorstufe für Serotonin und Melatonin im Gehirn."
    ),

    // Q18 — correctAnswer = 0  (richtige Antwort an Position A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Beta-Oxidation' und in welchem Zellkompartiment findet sie statt?",
        answerA = "Abbau von Fettsäuren durch schrittweise Entfernung von C2-Einheiten als Acetyl-CoA; findet in den Mitochondrien statt",
        answerB = "Synthese von Fettsäuren aus Acetyl-CoA; findet im Zytosol statt",
        answerC = "Umwandlung von Triglyceriden zu freien Fettsäuren durch Lipasen; findet im endoplasmatischen Retikulum statt",
        answerD = "Oxidation von Glucose zu Pyruvat; findet im Zytosol statt",
        correctAnswer = 0,
        explanation = "Die Beta-Oxidation ist der mitochondriale Abbauweg für Fettsäuren: In jedem Zyklus werden zwei Kohlenstoffatome als Acetyl-CoA abgespalten, wobei FADH₂ und NADH entstehen. Eine C16-Palmitinsäure liefert 7 Zyklen Beta-Oxidation mit netto ~106 ATP — deutlich mehr als die Verbrennung von Glucose (36–38 ATP pro Molekül).",
        difficulty = 3,
        funFact = "Sehr langkettige Fettsäuren (>C22) müssen zunächst in Peroxisomen vorab verkürzt werden, bevor die Beta-Oxidation in Mitochondrien fortgesetzt werden kann."
    ),

    // Q19 — correctAnswer = 2  (richtige Antwort an Position C)
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen cis- und trans-Fettsäuren und warum gelten industrielle trans-Fettsäuren als kardiovaskulär schädlich?",
        answerA = "cis-Fettsäuren sind gesättigt; trans-Fettsäuren sind ungesättigt — chemisch identisch, nur der Name unterscheidet sich",
        answerB = "trans-Fettsäuren entstehen nur natürlich in Wiederkäuern und sind gesundheitlich völlig unbedenklich",
        answerC = "cis-Fettsäuren haben H-Atome auf derselben Seite der Doppelbindung (gebogen, flüssig); trans-Fettsäuren haben sie auf gegenüberliegenden Seiten (gestreckt, fest) und erhöhen LDL-Cholesterol, senken HDL",
        answerD = "cis- und trans-Fettsäuren unterscheiden sich nur im Schmelzpunkt, haben aber identische biochemische Wirkungen auf Lipoproteine",
        correctAnswer = 2,
        explanation = "Bei cis-Konfiguration befinden sich beide Wasserstoffatome an der Doppelbindung auf derselben Seite, was eine Knickstruktur erzeugt. Bei trans-Konfiguration stehen sie gegenüberliegend, die Kette ist gestreckt. Industrielle trans-Fette (aus Teilhydrierung) erhöhen LDL-Cholesterol und Entzündungsmarker, senken HDL und erhöhen das kardiovaskuläre Risiko ca. 2- bis 3-fach stärker als gesättigte Fettsäuren.",
        difficulty = 3,
        funFact = "Seit 2021 sind industrielle trans-Fettsäuren in der EU auf maximal 2 g pro 100 g Fett begrenzt (VO 2019/649)."
    ),

    // Q20 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'resistente Stärke' und welche Gesundheitsvorteile hat sie gegenüber normaler verdaulicher Stärke?",
        answerA = "Stärke, die durch erhöhte Amylase-Aktivität vollständig aufgespalten wird und daher kaum Kalorien hat",
        answerB = "Eine synthetische Stärkeform ohne Nährwert, die als Füllstoff in Diätprodukten eingesetzt wird",
        answerC = "Stärke aus genetisch gezüchteten Getreidesorten mit höherer Nährstoffdichte",
        answerD = "Stärke, die Amylase-Verdauung im Dünndarm widersteht und im Dickdarm als Präbiotikum fermentiert wird, mit niedrigerem GI und mehr Butyrat-Produktion",
        correctAnswer = 3,
        explanation = "Resistente Stärke (RS) wird im Dünndarm nicht vollständig verdaut. Typen: RS1 (physikalisch eingeschlossen), RS2 (rohe Granula, z. B. grüne Banane), RS3 (retrogradierte Stärke nach Abkühlung), RS4 (chemisch modifiziert). Im Dickdarm fermentieren Bifidobakterien RS zu kurzkettigen Fettsäuren, besonders Butyrat, das kolonzytenschützend wirkt.",
        difficulty = 3,
        funFact = "Erkalteter Reis hat etwa 3- bis 4-fach mehr resistente Stärke als frisch gekochter Reis — Sushi-Reis enthält daher weniger leicht verfügbare Kalorien."
    ),

    // Q21 — correctAnswer = 0  (richtige Antwort an Position A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Stickstoffbilanz' in der Ernährungswissenschaft und was bedeutet eine negative Bilanz?",
        answerA = "Die Differenz zwischen aufgenommenem und ausgeschiedenem Stickstoff; negativ bedeutet Muskelabbau und katabolen Stoffwechsel",
        answerB = "Das Verhältnis von Eiweiß zu Kohlenhydraten in der Nahrung; negativ bedeutet zu wenig Kohlenhydrate",
        answerC = "Der Luftstickstoff-Gehalt in Lebensmitteln; negativ bei anaerob fermentierten Produkten",
        answerD = "Die Menge an Harnstoff im Blut; negativ bei Nierenpatienten mit verminderter Ausscheidung",
        correctAnswer = 0,
        explanation = "Da fast aller Körperstickstoff in Proteinen vorkommt (16 % Stickstoffanteil) und Harnstoff das Hauptausscheidungsprodukt des Stickstoffstoffwechsels ist, misst die Stickstoffbilanz die Proteinsynthese vs. -abbau: Aufgenommener N - Ausgeschiedener N (Harn + Stuhl + Haut). Negativ (katabol): mehr Abbau als Aufbau, z. B. bei Hunger oder Infektionen.",
        difficulty = 3,
        funFact = "Positive Stickstoffbilanz (anabole Phase) tritt während des Wachstums, der Schwangerschaft, Rekonvaleszenz und beim Muskelaufbau durch Krafttraining auf."
    ),

    // ── LEBENSMITTELZUSATZSTOFFE & E-NUMMERN ─────────────────────────────────

    // Q22 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Welche E-Nummer bezeichnet Natriumglutamat (Mononatriumglutamat, MSG) und welchen Geschmack verstärkt es primär?",
        answerA = "E 620; süß-sauren Geschmack",
        answerB = "E 631; Bittergeschmack durch Verstärkung von Chininsäure-Rezeptoren",
        answerC = "E 635; Salzgeschmack durch Natriumionen-Synergismus",
        answerD = "E 621; Umami-Geschmack (der fünfte Grundgeschmack)",
        correctAnswer = 3,
        explanation = "E 621 (Mononatriumglutamat, MSG) ist das Natriumsalz der Glutaminsäure. Es aktiviert metabotrope Glutamat-Rezeptoren (mGluR) auf Geschmackszellen und verstärkt den Umami-Geschmack — den fünften Grundgeschmack neben süß, sauer, salzig und bitter. In Kombination mit Ribonukleotiden (E 631/627) entsteht ein synergistischer Umami-Effekt.",
        difficulty = 3,
        funFact = "MSG wurde 1908 vom japanischen Chemiker Kikunae Ikeda aus Kombu-Algen isoliert, nachdem er den einzigartigen herzhaften Geschmack von Dashi-Brühe zu verstehen suchte — er nannte ihn 'Umami'."
    ),

    // Q23 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche E-Nummer hat Ascorbinsäure (Vitamin C) als Lebensmittelzusatzstoff und welche Funktion erfüllt sie dabei?",
        answerA = "E 300; Antioxidationsmittel — verhindert oxidative Verfärbung und Ranzigkeit",
        answerB = "E 440; Emulgator — stabilisiert Öl-in-Wasser-Emulsionen in Dressings",
        answerC = "E 330; Säuerungsmittel — senkt den pH-Wert zur Konservierung",
        answerD = "E 200; Konservierungsstoff — hemmt Schimmelwachstum durch Membranschädigung",
        correctAnswer = 0,
        explanation = "Ascorbinsäure (E 300) und ihre Derivate (E 301 Natriumascorbat, E 302 Calciumascorbat) sind bevorzugte Antioxidationsmittel in der Lebensmittelindustrie. Ascorbinsäure wird selbst oxidiert (zu Dehydroascorbinsäure) und schützt so andere oxidationsempfindliche Komponenten — wie Fette, Vitamine und Farbstoffe — vor Sauerstoffangriff.",
        difficulty = 3,
        funFact = "E 300 ist eines der wenigen E-Nummern mit einem ernährungsphysiologischen Zusatznutzen: Es wirkt gleichzeitig als Antioxidans und erhöht die Vitamin-C-Versorgung des Verbrauchers."
    ),

    // Q24 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist Titandioxid (E 171) und warum wurde es 2022 in der EU für Lebensmittel verboten?",
        answerA = "Ein Emulgator; verboten wegen allergener Reaktionen beim Backen",
        answerB = "Ein weißer Farbstoff; verboten wegen Hinweisen auf Genotoxizität der Nanopartikel-Fraktion",
        answerC = "Ein Konservierungsstoff; verboten wegen antimikrobieller Resistenzförderung",
        answerD = "Ein Süßungsmittel; verboten wegen übermäßigem Blutzuckeranstieg bei Kindern",
        correctAnswer = 1,
        explanation = "Titandioxid (E 171) wurde als weißes Pigment in Süßwaren, Kaugummi und Soßen eingesetzt. Die EFSA stellte 2021 fest, dass die Genotoxizität nicht ausgeschlossen werden kann — insbesondere die Nanopartikel-Fraktion kann Zell-DNA schädigen. Ab August 2022 gilt ein EU-weites Verbot für Lebensmittel.",
        difficulty = 3,
        funFact = "Titandioxid bleibt in der EU als Farbstoff für pharmazeutische Tablettenbeschichtungen und Kosmetika zugelassen — nur die orale Aufnahme über Lebensmittel ist verboten."
    ),

    // Q25 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Zusatzstoff (E 250) wird in Wurstwaren zur Konservierung eingesetzt und steht im Verdacht, krebserregende Nitrosamine zu bilden?",
        answerA = "E 250 Natriumnitrit; reagiert mit sekundären Aminen aus Proteinen zu Nitrosaminen, besonders beim Erhitzen",
        answerB = "E 250 Natriumsulfat; oxidiert zu Schwefeldioxid und schädigt Atemwege",
        answerC = "E 250 Kaliumbenzoat; bildet Benzol in Gegenwart von Ascorbinsäure",
        answerD = "E 250 Natriumacetat; fördert die Bildung von Acetaldehyd bei hohen Temperaturen",
        correctAnswer = 0,
        explanation = "E 250 (Natriumnitrit) dient in Pökelfleisch und Wurstwaren als Konservierungsstoff gegen Clostridium botulinum und verleiht Fleisch die typische rosarote Farbe (Nitrosomyoglobin). Im sauren Magenmilieu und beim Braten können Nitrit-Ionen mit sekundären Aminen aus Fleischproteinen zu N-Nitrosaminen reagieren, von denen viele als kanzerogen eingestuft sind.",
        difficulty = 3,
        funFact = "Wird E 300 (Ascorbinsäure) gemeinsam mit E 250 eingesetzt, konkurriert Ascorbinsäure mit den Aminen um das reaktive Nitrit und reduziert die Nitrosamin-Bildung erheblich."
    ),

    // Q26 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was sind 'modifizierte Stärken' (E 1400–E 1450) und welchen Vorteil bieten sie gegenüber nativer Stärke?",
        answerA = "Stärken, die durch gentechnische Veränderung der Ausgangspflanze höhere Amylose-Anteile aufweisen",
        answerB = "Stärken aus neuen Pflanzenquellen (Quinoa, Amaranth) mit höherer Nährstoffdichte",
        answerC = "Chemisch oder physikalisch veränderte Stärken mit verbesserter Hitzestabilität, Säureresistenz, geänderter Viskosität und Gefrier-Tau-Stabilität",
        answerD = "Vorverkleisterte Stärken, die nur durch Aufkochen reaktiviert werden müssen",
        correctAnswer = 2,
        explanation = "Modifizierte Stärken werden durch chemische Behandlung (Veretherung, Veresterung, Vernetzung, Oxidation) oder physikalische Prozesse hergestellt. Dadurch erhöht sich die Stabilität gegenüber Hitze, Säure, Scherung und Gefrieren/Tauen — native Stärke würde unter diesen Bedingungen retrogradieren oder abbrechen. Anwendungen: Salatdressings, Babynahrung, Tiefkühlprodukte.",
        difficulty = 3,
        funFact = "E 1442 (Hydroxypropyl-Distärkephosphat) ist eine der häufigsten modifizierten Stärken in Babynahrung, da sie auch bei Sterilisationstemperaturen stabil bleibt."
    ),

    // Q27 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche sechs Azofarbstoffe wurden in der 'Southampton-Studie' untersucht und stehen seitdem im Verdacht, Kinder hyperaktiver zu machen?",
        answerA = "E 102 (Tartrazin), E 110 (Gelb-Orange S), E 122 (Azorubin), E 124 (Cochenillerot A), E 129 (Allurarot AC), E 104 (Chinolingelb)",
        answerB = "E 150 (Zuckercouleur), E 160 (Carotinoide), E 162 (Betanin), E 140 (Chlorophyll), E 153, E 155",
        answerC = "E 120 (Karmin), E 140 (Chlorophyll), E 141, E 142, E 143, E 151",
        answerD = "Alle synthetischen Farbstoffe E 100–E 180 gelten pauschal als hyperaktivitätsfördernd",
        correctAnswer = 0,
        explanation = "Die Southampton-Studie (McCann et al., Lancet 2007) untersuchte 6 Azofarbstoffe in Kombination mit Natriumbenzoat: E 102 (Tartrazin), E 104 (Chinolingelb), E 110 (Gelborange S), E 122 (Azorubin), E 124 (Cochenillerot A) und E 129 (Allurarot AC). Diese Mischung erhöhte Hyperaktivitäts-Scores bei Kindern signifikant. Seitdem tragen betroffene Lebensmittel in der EU den Warnhinweis 'kann Aktivität und Aufmerksamkeit bei Kindern beeinträchtigen'.",
        difficulty = 3,
        funFact = "In den USA sind einige Southampton-Farbstoffe wie E 110 (Yellow 6) noch ohne Warnhinweis zugelassen — ein transatlantischer Regulierungsunterschied."
    ),

    // Q28 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist Carrageen (E 407) und aus welchem Rohstoff wird es gewonnen?",
        answerA = "Ein Geliermittel aus Rotalgen; besteht aus sulfatierten Galactan-Polysacchariden (Kappa, Iota, Lambda)",
        answerB = "Ein Emulgator aus Eigelb-Phospholipiden; wird aus Hühnereiern gewonnen",
        answerC = "Ein Verdickungsmittel aus Johannisbrotkernmehl; gewonnen aus Leguminosen",
        answerD = "Ein Stabilisator aus tierischen Knochen; besteht aus Kollagen-abgeleiteter Gelatine",
        correctAnswer = 0,
        explanation = "Carrageen (E 407) sind sulfatierte Galactan-Polysaccharide aus Rotalgen (Rhodophyta), hauptsächlich Chondrus crispus und Kappaphycus alvarezii. Es gibt drei Haupttypen (Kappa, Iota, Lambda) mit unterschiedlicher Gelstärke. Carrageen wird als Geliermittel, Verdickungsmittel und Stabilisator in Molkereiprodukten und Fleischerzeugnissen eingesetzt.",
        difficulty = 3,
        funFact = "Degradiertes Carrageen (Poligeenan) mit niedrigerem Molekulargewicht steht im Verdacht, intestinale Entzündungen zu fördern — in Lebensmitteln ist ausschließlich nicht-degradiertes Carrageen erlaubt."
    ),

    // ── ANTIOXIDANTIEN & PHYTOCHEMIKALIEN ────────────────────────────────────

    // Q29 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was sind 'Polyphenole' und in welche Hauptgruppen werden sie eingeteilt?",
        answerA = "Polyphenole sind stickstoffhaltige Verbindungen; Hauptgruppen: Alkaloide, Terpene, Saponine",
        answerB = "Polyphenole sind sekundäre Pflanzenstoffe mit mehreren phenolischen Hydroxygruppen; Hauptgruppen: Flavonoide, Phenolsäuren, Stilbene, Lignane",
        answerC = "Polyphenole sind Zuckeralkohol-Verbindungen; Hauptgruppen: Sorbit, Mannit, Xylit",
        answerD = "Polyphenole sind Fettsäure-Derivate; Hauptgruppen: Omega-3, Omega-6 und konjugierte Linolsäuren",
        correctAnswer = 1,
        explanation = "Polyphenole sind eine strukturell diverse Klasse sekundärer Pflanzenstoffe mit mindestens einem aromatischen Ring mit Hydroxylgruppen. Flavonoide (>6.000 bekannte Verbindungen) sind die größte Untergruppe: Flavone, Flavanole (Catechine im Tee, Quercetin), Anthocyane (rote/blaue Farbstoffe in Beeren), Isoflavone (Genistein in Soja). Phenolsäuren: Chlorogensäure (Kaffee), Rosmarinsäure.",
        difficulty = 3,
        funFact = "Der ORAC-Wert (Oxygen Radical Absorbance Capacity) wurde 2012 von der USDA-Datenbank entfernt, da er die biologische Aktivität im Körper unzureichend widerspiegelt."
    ),

    // Q30 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist Resveratrol und in welchem Lebensmittel kommt es in höchster natürlicher Konzentration vor?",
        answerA = "Ein Carotinoid; höchste Konzentration in Karotten und Süßkartoffeln",
        answerB = "Ein Stilben-Polyphenol; höchste Konzentration in der Schale roter Weintrauben und Rotwein",
        answerC = "Ein Phytosterin; höchste Konzentration in pflanzlichen Ölen wie Raps- und Sojaöl",
        answerD = "Ein Glucosinolat; höchste Konzentration in Brokkoli und anderen Brassica-Arten",
        correctAnswer = 1,
        explanation = "Resveratrol (3,5,4'-Trihydroxystilben) ist ein Stilben, das Weinreben (Vitis vinifera) als Phytoalexin gegen Pilzbefall und UV-Stress produzieren. Es kommt hauptsächlich in der Traubenschale vor; rote Weintrauben haben deutlich mehr als weiße. Es aktiviert Sirtuine (besonders SIRT1) und wird mit Anti-Aging-Effekten assoziiert.",
        difficulty = 3,
        funFact = "Der 'Französische Paradox' — niedrige Herzerkrankungsrate trotz fettreicher Ernährung — wurde in den 1990er Jahren mit dem Resveratrol im Rotwein erklärt, obwohl spätere Studien keine eindeutige Kausalität belegen konnten."
    ),

    // Q31 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was sind Glucosinolate und welche Verbindung entsteht aus ihnen beim Kauen oder Schneiden von Brokkoli?",
        answerA = "Schwefelhaltige Glycosinolate in Kreuzblütengewächsen; beim Zerkleinern entsteht Sulforaphan durch Myrosinase-Reaktion",
        answerB = "Glucosinolate sind Saponine; beim Kochen entstehen Sapogenine durch Hydrolyse",
        answerC = "Glucosinolate sind Phytate; beim Kauen entsteht Inositol durch Phytase-Aktivität",
        answerD = "Glucosinolate sind Lektine; beim Kauen entstehen Agglutinine durch mechanische Freisetzung",
        correctAnswer = 0,
        explanation = "Glucosinolate sind schwefelhaltige Glycosinolate in Kreuzblütengewächsen (Brassicaceae). Beim Zerkleinern wird das Zellkompartiment verletzt und Myrosinase trifft auf Glucosinolate — es entsteht Sulforaphan (aus Glucoraphanin). Sulforaphan aktiviert den Nrf2-Transkriptionsfaktor und induziert zelleigene Antioxidans- und Detoxifizierungsenzyme.",
        difficulty = 3,
        funFact = "Kochen inaktiviert Myrosinase, aber Darmflora-Bakterien können Glucosinolate auch aus gekochtem Brokkoli noch zu Sulforaphan umwandeln — wenn auch weniger effizient."
    ),

    // Q32 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist Lycopin und warum wird es besser aus erhitzten Tomatenprodukten absorbiert als aus rohen Tomaten?",
        answerA = "Ein Carotinoid ohne Vitamin-A-Aktivität; Erhitzen bricht Zellwände auf und wandelt all-trans in besser absorbierbare cis-Isomere um",
        answerB = "Ein Flavonoid; Erhitzen polymerisiert es zu bioverfügbareren Oligomeren",
        answerC = "Ein B-Vitamin-Derivat; thermische Behandlung konvertiert die inaktive Glucosid-Form in die freie aktive Form",
        answerD = "Ein Phospholipid; Erhitzen emulgiert es und verbessert die mizelläre Aufnahme",
        correctAnswer = 0,
        explanation = "Lycopin ist ein azyklisches Carotinoid (C40H56) ohne Beta-Ionon-Ring — es hat keine Provitamin-A-Aktivität. In rohen Tomaten liegt es hauptsächlich als all-trans-Isomer in Chromoplasten-Kristallen eingeschlossen vor. Erhitzen bricht Zellstrukturen auf und fördert die Isomerisierung zu cis-Lycopin, das mizellärer ist und durch Darmmucosa besser absorbiert wird. Fett erhöht die Absorption zusätzlich.",
        difficulty = 3,
        funFact = "Ketchup enthält pro Portion mehr bioverfügbares Lycopin als frische Tomaten — weshalb Ketchup in manchen Ernährungsempfehlungen als Lycopin-Quelle gilt, trotz des Zuckerzusatzes."
    ),

    // Q33 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was sind 'Phytosterine' (Pflanzensterole) und wie reduzieren sie den LDL-Cholesterolspiegel?",
        answerA = "Phytosterine sind pflanzliche Steroidhormone, die die hepatische Cholesterolsynthese durch HMG-CoA-Reduktase-Hemmung blockieren",
        answerB = "Phytosterine sind Ballaststoffe, die Gallensäuren binden und dadurch die Cholesterolausscheidung steigern",
        answerC = "Phytosterine sind Protease-Inhibitoren, die die Produktion von Apolipoprotein B in der Leber vermindern",
        answerD = "Phytosterine sind strukturelle Analoga von Cholesterol aus Pflanzen; sie konkurrieren im Darm mit Cholesterol um Mizellenaufnahme und verringern so die intestinale Cholesterol-Absorption",
        correctAnswer = 3,
        explanation = "Phytosterine (Sitosterol, Campesterol, Stigmasterol) sind strukturell dem Cholesterol sehr ähnlich, werden aber vom Darm kaum resorbiert. Sie konkurrieren im Darmlumen um die Aufnahme in Mizellen: Weniger Cholesterol wird solubilisiert und absorbiert. Täglich 1,5–3 g Phytosterine reduzieren das LDL-Cholesterol um ca. 7–15 % bei gesunden Erwachsenen.",
        difficulty = 3,
        funFact = "Angereicherte Phytosterin-Margarine ist nur für Personen mit erhöhtem Cholesterolspiegel empfohlen — bei Gesunden bieten sie keinen zusätzlichen kardiovaskulären Nutzen."
    ),

    // Q34 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist Quercetin und welche antioxidative Wirkung hat dieses Flavonol im menschlichen Körper?",
        answerA = "Quercetin ist ein Carotinoid; es absorbiert UV-Licht und schützt Pflanzenzellen vor Sonnenbrand",
        answerB = "Quercetin ist ein Flavonol; es fängt freie Radikale durch Wasserstoffatomtransfer ab, cheliert Metallionen und hemmt Lipoxygenase",
        answerC = "Quercetin ist ein Glucosinolat; es hemmt NF-κB-Signalwege durch kovalente Modifikation",
        answerD = "Quercetin ist ein Phytat; es komplexiert Eisen und verhindert Fenton-Reaktionen",
        correctAnswer = 1,
        explanation = "Quercetin (C₁₅H₁₀O₇) ist eines der häufigsten Flavonole in der menschlichen Ernährung (Zwiebeln, Äpfel, Kapern). Die catechol-Gruppe im B-Ring ermöglicht effiziente Radikalabfangung durch H-Atom-Transfer. Zusätzlich cheliert Quercetin Übergangsmetalle (Fe²⁺, Cu²⁺) und hemmt dadurch Fenton-Reaktionen sowie Cyclooxygenasen (COX-1/2).",
        difficulty = 3,
        funFact = "Quercetin hat im Darm eine sehr geringe Bioverfügbarkeit (~1–17 %), wird aber durch Darmflora-Enzyme (Rhamnosidasen) aus Glycosiden freigesetzt und weiter metabolisiert."
    ),

    // ── LEBENSMITTELALLERGIEN & INTOLERANZEN ──────────────────────────────────

    // Q35 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist der molekulare Unterschied zwischen einer Laktoseintoleranz und einer Milchproteinallergie?",
        answerA = "Laktoseintoleranz ist eine immunologische IgE-vermittelte Reaktion auf Casein; Milchproteinallergie ist ein Enzymmangel",
        answerB = "Beide Zustände sind immunologisch identisch, unterscheiden sich nur im auslösenden Molekül",
        answerC = "Milchproteinallergie betrifft nur Erwachsene; Laktoseintoleranz ist eine ausschließliche Kindererkrankung",
        answerD = "Laktoseintoleranz ist ein Laktasemangel (Enzymdefizit); Milchproteinallergie ist eine IgE-vermittelte Immunreaktion auf Molken- oder Casein-Proteine",
        correctAnswer = 3,
        explanation = "Laktoseintoleranz: Mangel an intestinaler Laktase führt dazu, dass Laktose unverdaut in den Dickdarm gelangt, wo Darmbakterien sie vergären und Blähungen, Bauchschmerzen und Diarrhöe verursachen. Milchproteinallergie: IgE-Antikörper gegen Casein oder β-Laktoglobulin lösen allergische Reaktionen aus — von Urtikaria bis Anaphylaxie.",
        difficulty = 3,
        funFact = "Etwa 65–70 % der Weltbevölkerung entwickeln nach dem Abstillen eine sekundäre Laktoseintoleranz. Europäische Populationen haben durch eine Mutation im Laktase-Gen-Promotor eine lebenslange Laktase-Persistenz."
    ),

    // Q36 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Protein im Weizen ist für Zöliakie verantwortlich und welche immunologische Reaktion liegt zugrunde?",
        answerA = "Glutenin; eine IgE-vermittelte Sofortreaktion Typ I mit Mastzell-Degranulation",
        answerB = "Gliadin (α-Gliadin); T-Zell-vermittelte Autoimmunreaktion — HLA-DQ2/DQ8 präsentiert Gliadin-Peptide, die intestinale Schleimhaut wird zerstört",
        answerC = "Albumin; eine non-immunologische Entzündungsreaktion durch osmotischen Stress auf Enterozyten",
        answerD = "Amylase-Trypsin-Inhibitoren (ATI); direkter Zellschaden durch proteolytische Aktivität im Dünndarm",
        correctAnswer = 1,
        explanation = "Bei Zöliakie (Prävalenz ~1 %) bewirkt Gewebetransglutaminase (tTG2) eine Deamidierung von Gliadin-Glutaminresten. Diese deamidierten Peptide werden von HLA-DQ2 oder HLA-DQ8 auf dendritischen Zellen präsentiert und aktivieren CD4+-T-Zellen, die intestinale Epithelzellen angreifen — Zottenatrophie, Kryptenhyperplasie, Malabsorption sind die Folge.",
        difficulty = 3,
        funFact = "Hafer enthält Avenin, nicht Gliadin — die meisten Zöliakie-Patienten vertragen reinen Hafer, aber kommerzielle Haferprodukte sind oft mit Weizen kontaminiert."
    ),

    // Q37 — correctAnswer = 2  (richtige Antwort an Position C)
    Question(
        categoryId = 8,
        questionText = "Was ist Histaminunverträglichkeit (Histaminintoleranz) und durch welchen enzymatischen Defizit entsteht sie?",
        answerA = "Eine IgE-Allergie gegen Histamin in Fisch; verursacht durch erhöhte Mastzell-Sensitivität",
        answerB = "Eine genetische Mutation im Histamin-H1-Rezeptor, die zu Überempfindlichkeit führt",
        answerC = "Eine verminderte Aktivität der Diaminooxidase (DAO) und/oder Histamin-N-Methyltransferase (HNMT), die Histamin aus Lebensmitteln nicht ausreichend abbauen",
        answerD = "Eine erhöhte intestinale Histaminproduktion durch Dysbiose der Darmflora",
        correctAnswer = 2,
        explanation = "Histamin aus Lebensmitteln (gereifter Käse, Rotwein, Fischkonserven, Sauerkraut) wird normalerweise durch DAO (im Dünndarmepithel) und HNMT (intrazellulär) abgebaut. Bei verminderter DAO-Aktivität akkumuliert Histamin und verursacht pseudoallergische Reaktionen: Kopfschmerzen, Flush, Rhinitis, Herzrasen.",
        difficulty = 3,
        funFact = "Rotwein enthält nicht nur Histamin, sondern auch andere biogene Amine (Tyramin, Putrescin) und Ethanol, das DAO hemmt — ein dreifacher Wirkmechanismus bei Betroffenen."
    ),

    // ── LEBENSMITTELTECHNOLOGIE ───────────────────────────────────────────────

    // Q38 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Wasseraktivitätswert' (aw-Wert) in der Lebensmitteltechnologie und ab welchem Wert ist mikrobielles Wachstum weitgehend gehemmt?",
        answerA = "Der aw-Wert misst den pH-Wert eines Lebensmittels; unter pH 4,5 ist Wachstum gehemmt",
        answerB = "Der aw-Wert misst den Trockensubstanzgehalt; unter 10 % Wassergehalt sind Lebensmittel stabil",
        answerC = "Der aw-Wert ist ein Maß für die Viskosität; unter 100 mPa·s sind Flüssigkeiten mikrobiell stabil",
        answerD = "Der aw-Wert beschreibt das verfügbare Wasser (Verhältnis Dampfdruck Lebensmittel zu reinem Wasser); unter aw 0,60–0,70 ist die meiste mikrobielle Aktivität gestoppt",
        correctAnswer = 3,
        explanation = "Der Wasseraktivitätswert (aw) ist das Verhältnis des Wasserdampfdrucks des Lebensmittels zum Dampfdruck reinen Wassers (0–1). Die meisten Bakterien wachsen nicht unter aw 0,91; Hefen unter 0,88; Schimmelpilze unter 0,70; bei aw < 0,60 ist praktisch keine mikrobielle Aktivität mehr möglich. Zucker und Salz binden Wasser (senken aw) und konservieren Lebensmittel.",
        difficulty = 3,
        funFact = "Honig hat einen aw-Wert von ~0,6 und ist deshalb ohne Konservierungsmittel praktisch unbegrenzt haltbar — in ägyptischen Gräbern gefundener 3.000 Jahre alter Honig war noch essbar."
    ),

    // Q39 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was beschreibt die 'Gefriertrocknung' (Lyophilisierung) und welchen Vorteil hat sie gegenüber konventionellem Heißlufttrocknen?",
        answerA = "Trocknen bei hoher Temperatur im Vakuum; verursacht weniger Maillard-Bräunung als Ofentrocknung",
        answerB = "Osmotisches Trocknen durch Einlegen in Zuckerlösung; reduziert den aw-Wert ohne Hitzeeinwirkung",
        answerC = "Sprühtrocknung von Flüssigprodukten; erzeugt Pulver mit hoher Löslichkeit durch schnelle Verdampfung",
        answerD = "Gefrieren des Produkts und anschließende Sublimation des Eises direkt zu Wasserdampf unter Vakuum; erhält Struktur, Farbe, Aroma und Nährstoffe besser als Heißlufttrocknung",
        correctAnswer = 3,
        explanation = "Bei der Lyophilisierung wird das Produkt zunächst bei ca. −40 °C tiefgefroren, dann unter Hochvakuum (< 1 mbar) sublimiert — Eis geht direkt in Dampf über, ohne flüssige Phase. Da keine Hitze einwirkt und Zellstrukturen erhalten bleiben, sind Vitamine, Aromastoffe und bioaktive Verbindungen besonders gut erhalten.",
        difficulty = 3,
        funFact = "Lyophilisierung ist so schonend, dass sogar Lebendkulturen (Probiotika) und Enzyme gefriergetrocknet werden können und nach Rehydrierung wieder aktiv sind."
    ),

    // Q40 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist Hochdruckverarbeitung (HPP) bei Lebensmitteln und wie werden Mikroorganismen dabei inaktiviert?",
        answerA = "Erhitzen auf 140 °C durch Druckerhöhung; Hitze-Denaturierung von Proteinen",
        answerB = "UV-C-Bestrahlung unter Vakuumdruck; DNA-Schäden in Mikroorganismen",
        answerC = "Elektrischer Hochspannungsimpuls; Elektroporation der Zellmembran von Pathogenen",
        answerD = "Behandlung mit hohem hydrostatischen Druck (100–600 MPa); Inaktivierung von Mikroorganismen durch Membranschädigung und Protein-Denaturierung ohne wesentliche Hitzeeinwirkung",
        correctAnswer = 3,
        explanation = "HPP (High Pressure Processing) setzt Lebensmittel für Sekunden bis Minuten hydrostatischem Druck von 100–600 MPa aus (1.000–6.000 Atmosphären). Der Druck schädigt Zellmembranen und denaturiert Proteine nach dem Prinzip von Le Chatelier. Da keine Wärme entsteht, bleiben Vitamine, Aromen und Textur weitgehend erhalten.",
        difficulty = 3,
        funFact = "HPP-behandelter Guacamole hat eine deutlich längere Haltbarkeit ohne Konservierungsstoffe — HPP inaktiviert das braunnmachende Enzym Polyphenoloxidase durch Druck-Denaturierung."
    ),

    // ── LEBENSMITTELANALYTIK & SENSORIK ──────────────────────────────────────

    // Q41 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist HPLC (High-Performance Liquid Chromatography) und wofür wird sie in der Lebensmittelanalytik eingesetzt?",
        answerA = "Ein mikrobiologisches Verfahren zur Keimzahlbestimmung in Hochdruckbehältern",
        answerB = "Eine chromatographische Trennmethode; in der Lebensmittelanalytik zur Identifikation und Quantifizierung von Vitaminen, Pestiziden, Mykotoxinen, Farbstoffen und Zusatzstoffen",
        answerC = "Eine spektroskopische Methode zur Bestimmung des Wassergehalts durch Hochfrequenzwellen",
        answerD = "Ein elektrochemisches Verfahren zur pH-Messung hochviskoser Lebensmittelmatrizen",
        correctAnswer = 1,
        explanation = "HPLC trennt Substanzen einer flüssigen Probe durch unterschiedliche Wechselwirkungen mit einer stationären Phase (Säulenfüllung) bei hohem Pumpendruck. In der Lebensmittelanalytik wird HPLC für Vitaminbestimmung (besonders B-Vitamine, Vitamin C), Pestizidrückstände, Mykotoxine (Aflatoxine), Farbstoffe (E-Nummern) und organische Säuren eingesetzt.",
        difficulty = 3,
        funFact = "Die Kopplung von HPLC mit Massenspektrometrie (LC-MS/MS) kann gleichzeitig hunderte Pestizide in einem einzigen Lebensmittelextrakt in wenigen Minuten identifizieren und quantifizieren."
    ),

    // Q42 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' als Geschmacksqualität und welche zwei Verbindungen erzeugen den stärksten synergistischen Umami-Effekt?",
        answerA = "Umami ist ein salziger Geschmack; NaCl und KCl erzeugen zusammen den stärksten Effekt",
        answerB = "Umami (japanisch: 'wohlschmeckend') ist der fünfte Grundgeschmack; Glutaminsäure/Glutamat und Nukleotide wie Inosinmonophosphat (IMP) oder Guanosinmonophosphat (GMP) sind synergistisch 8-fach stärker als jedes allein",
        answerC = "Umami ist ein bitterer Geschmack; Koffein und Tannine erzeugen synergetisch intensiven Umami",
        answerD = "Umami ist ein fettiger Geschmack; Ölsäure und Palmitinsäure aktivieren zusammen T2R-Bitterrezeptoren",
        correctAnswer = 1,
        explanation = "Umami wird durch Aktivierung des Rezeptors mGluR4 und des T1R1/T1R3-Heterodimers auf Geschmackszellen vermittelt. Glutamat allein hat einen schwachen Umami-Effekt; in Kombination mit Ribonukleotiden (IMP aus Fleisch/Fisch, GMP aus Pilzen) entsteht ein synergistischer Effekt. Dieses Phänomen erklärt, warum Dashi-Brühe so intensiv schmeckt.",
        difficulty = 3,
        funFact = "Parmesan enthält nach langer Reifung bis zu 1,2 g freie Glutaminsäure pro 100 g — einer der höchsten natürlichen Glutamatgehalte in Lebensmitteln."
    ),

    // Q43 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Mykotoxin' und welches dieser Schimmelpilzgifte ist das stärkste bekannte natürliche Hepatotoxin?",
        answerA = "Mykotoxine sind bakterielle Stoffwechselprodukte; Botulinum-Toxin ist das stärkste Hepatotoxin",
        answerB = "Mykotoxine sind pflanzliche Abwehrstoffe gegen Pilze; Solanin ist der stärkste Vertreter",
        answerC = "Mykotoxine sind Hefefermentationsprodukte; Fumonisin B1 aus Saccharomyces cerevisiae ist das stärkste Lebertoxin",
        answerD = "Mykotoxine sind Schimmelpilz-Sekundärmetaboliten; Aflatoxin B1 (produziert von Aspergillus flavus/parasiticus) ist das stärkste natürliche Lebertoxin und potente Karzinogen",
        correctAnswer = 3,
        explanation = "Aflatoxin B1 (AFB1), produziert von Aspergillus flavus und A. parasiticus in feuchten Erdnüssen, Getreide und Nüssen, ist das stärkste natürliche Karzinogen für die Leber. AFB1 wird in der Leber durch CYP450 zu Aflatoxin-8,9-Epoxid metabolisiert, das kovalent an Guanin in der DNA bindet und G→T-Transversionen am TP53-Codon 249 verursacht.",
        difficulty = 3,
        funFact = "Der EU-Grenzwert für AFB1 in Nüssen (10 µg/kg) und Getreide (2 µg/kg) ist streng, weil AFB1 selbst bei ppb-Konzentrationen mutagen wirkt."
    ),

    // Q44 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist der biochemische Unterschied zwischen Omega-3- und Omega-6-Fettsäuren bezüglich ihrer Eicosanoid-Produkte?",
        answerA = "Omega-3 und Omega-6 unterscheiden sich nur im Ausgangstier; beide haben identische Enzymmetaboliten",
        answerB = "Omega-3-Fettsäuren sind gesättigt, Omega-6-Fettsäuren sind ungesättigt; gesättigte Fette fördern Entzündungen",
        answerC = "Omega-6-Arachidonsäure → pro-inflammatorische Eicosanoide (PGE2, LTB4); Omega-3 EPA → schwächer entzündungsfördernde der Serie 3 (Resolvin D1) — Verhältnis Omega-6:Omega-3 in westlicher Ernährung problematisch",
        answerD = "Beide Fettsäuren werden identisch metabolisiert; das Verhältnis beeinflusst nur die Zellmembranfluidität",
        correctAnswer = 2,
        explanation = "Omega-6 (Linolsäure → Arachidonsäure) und Omega-3 (Alpha-Linolensäure → EPA, DHA) konkurrieren um dieselben Desaturasen und Elongasen. Aus Arachidonsäure entstehen pro-inflammatorische Eicosanoide der Serie 2 (PGE2, Leukotrien B4); aus EPA entstehen schwächer entzündungsfördernde der Serie 3. Das westliche Ernährungsverhältnis Omega-6:Omega-3 von 15–20:1 (optimal: 4:1) fördert chronische Inflammation.",
        difficulty = 3,
        funFact = "DHA (Docosahexaensäure, Omega-3) macht 40 % der Polyungesättigten Fettsäuren im Gehirn aus und ist essenziell für die Synaptogenese."
    ),

    // ── ERNÄHRUNGSPHYSIOLOGIE ─────────────────────────────────────────────────

    // Q45 — correctAnswer = 2  (richtige Antwort an Position C)
    Question(
        categoryId = 8,
        questionText = "Was ist der 'thermische Effekt der Nahrung' (TEF) und für welchen Makronährstoff ist er am höchsten?",
        answerA = "TEF ist die Energie für Verdauung und Metabolismus; Fett hat den höchsten TEF mit 25–30 %",
        answerB = "TEF ist der kalorische Mehrwert durch Nahrungsaufnahme; Kohlenhydrate haben den höchsten TEF durch ihre Fermentation",
        answerC = "TEF ist die Energie für Verdauung, Absorption und Metabolismus; Protein hat den höchsten TEF mit 20–35 % der aufgenommenen Energie",
        answerD = "TEF ist gleich für alle Makronährstoffe bei ca. 10 % der Kalorienzufuhr",
        correctAnswer = 2,
        explanation = "Der thermische Effekt der Nahrung ist der Energieverbrauch durch Digestion, Absorption, Transport und Metabolismus. Protein hat mit 20–35 % den höchsten TEF, weil die Deaminierung von Aminosäuren, der Harnstoffzyklus und Glukoneogenese sehr energieaufwändig sind. Kohlenhydrate: 5–10 %, Fette: 0–3 %. Hochprotein-Diäten haben daher einen metabolischen Vorteil.",
        difficulty = 3,
        funFact = "Der TEF trägt bei normaler Ernährung ca. 10 % des Gesamtenergieverbrauchs bei — auf eine Person mit 2000 kcal/Tag Bedarf bedeutet das ca. 200 kcal, die allein durch Verdauen verbraucht werden."
    ),

    // Q46 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Bioavailabilität' eines Nährstoffs und welche Faktoren beeinflussen sie am stärksten?",
        answerA = "Die Menge eines Nährstoffs in einem Lebensmittel, berechnet als Konzentration pro 100 g",
        answerB = "Die Löslichkeit eines Nährstoffs in Wasser; wasserunlösliche Verbindungen haben per definitionem Null-Bioverfügbarkeit",
        answerC = "Die Stabilität eines Nährstoffs bei der Lagerung; hitzelabile Vitamine haben generell niedrige Bioverfügbarkeit",
        answerD = "Der Anteil eines Nährstoffs, der nach Aufnahme tatsächlich in die systemische Zirkulation gelangt; beeinflusst durch chemische Form, Nahrungsmatrix, Anti-Nährstoffe, Transportproteine und gastrointestinale Faktoren",
        correctAnswer = 3,
        explanation = "Bioverfügbarkeit bezeichnet den Anteil einer aufgenommenen Dosis, der in den systemischen Kreislauf aufgenommen wird. Einflussgrößen: (1) Chemische Form (z. B. Häm- vs. Nicht-Häm-Eisen), (2) Lebensmittelmatrix (Zelluloseeinschluss, Fettgehalt), (3) Anti-Nährstoffe (Phytate, Oxalate, Tannine), (4) Körperstatus (Mangel erhöht Absorption), (5) gastrointestinaler pH und Passagezeit.",
        difficulty = 3,
        funFact = "Zeaxanthin aus Eiern (in Lipid eingebettet) hat eine 3- bis 4-fach höhere Bioverfügbarkeit als Zeaxanthin aus Spinat — obwohl Spinat mehr enthält."
    ),

    // Q47 — correctAnswer = 2  (richtige Antwort an Position C)
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Präbiotikum', 'Probiotikum' und 'Synbiotikum'?",
        answerA = "Präbiotikum = lebende Bakterienstämme; Probiotikum = Ballaststoffe zur Bakterienförderung; Synbiotikum = eine Mischung beider",
        answerB = "Präbiotikum = verdauliche Stärke; Probiotikum = Antibiotikum pflanzlichen Ursprungs; Synbiotikum = Vitamin-Mineralstoff-Kombination",
        answerC = "Präbiotikum = nicht verdauliches Substrat (z. B. Inulin, FOS), das selektiv nützliche Darmkeime fördert; Probiotikum = lebende Mikroorganismen mit gesundheitlichem Nutzen; Synbiotikum = Kombination beider",
        answerD = "Präbiotikum und Probiotikum sind Synonyme; Synbiotikum bezeichnet ein klinisch zugelassenes Produkt",
        correctAnswer = 2,
        explanation = "Präbiotika (Inulin, Fructooligosaccharide, Galactooligosaccharide) sind nicht verdauliche Kohlenhydrate, die selektiv Bifido- und Lactobacillen im Dickdarm stimulieren. Probiotika (Lactobacillus acidophilus, Bifidobacterium longum) sind lebende Mikroorganismen, die in ausreichender Menge die Darmgesundheit fördern. Synbiotika kombinieren beides.",
        difficulty = 3,
        funFact = "Die Darmmikrobiota hat ca. 3,8 × 10¹³ Bakterienzellen — etwa die gleiche Anzahl wie Körperzellen — und produziert u.a. Vitamin K2, kurze Fettsäuren und Neurotransmitter-Vorstufen."
    ),

    // Q48 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Refeeding-Syndrom' und welches Elektrolyt ist dabei die kritischste Gefahr?",
        answerA = "Ein Syndrom nach zu schneller Gewichtszunahme; kritischstes Elektrolyt ist Natrium (Hypernatriämie)",
        answerB = "Eine Entzündungsreaktion auf zu viel Protein nach Hungerphasen; kritischstes Elektrolyt ist Kalzium",
        answerC = "Ein gastrointestinaler Schock durch zu schnelle Ballaststoffaufnahme; kritischstes Elektrolyt ist Magnesium",
        answerD = "Ein lebensbedrohlicher Zustand nach Wiederernährung stark unterernährter Personen; kritischstes Elektrolyt ist Phosphat (Hypophosphatämie) — Insulin schiebt Phosphat in die Zellen",
        correctAnswer = 3,
        explanation = "Das Refeeding-Syndrom entsteht, wenn stark unterernährte Personen (Anorexie, prolongiertes Fasten) zu schnell Kohlenhydrate erhalten: Insulin-Ausschüttung treibt Glucose, Phosphat, Kalium und Magnesium in die Zellen. Der Serumphosphatspiegel fällt dramatisch. Phosphat ist essenziell für ATP-Synthese — kritische ATP-Erschöpfung in Herzmuskel und Atemmuskulatur kann lebensbedrohlich sein.",
        difficulty = 3,
        funFact = "Das Refeeding-Syndrom wurde erstmals nach dem Zweiten Weltkrieg bei Überlebenden japanischer Kriegsgefangenenlager und Holocaust-Überlebenden beschrieben."
    ),

    // Q49 — correctAnswer = 2  (richtige Antwort an Position C)
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel enthält natürlicherweise die höchste Konzentration an Oxalsäure und warum ist das für Menschen mit Nierensteinen relevant?",
        answerA = "Kuhmilch; Oxalsäure bindet Calcium und kann Nierensteine verursachen",
        answerB = "Fleisch; Harnsäure aus Purinabbau ist der Hauptfaktor für Calciumoxalat-Nierensteine",
        answerC = "Rhabarber (besonders die Blätter) und Spinat; Oxalsäure bildet in der Niere unlösliches Calciumoxalat, das zum häufigsten Nierensteinstyp führt",
        answerD = "Weizenkleie; Phytinsäure ist die eigentliche Ursache von Calciumoxalatsteinen",
        correctAnswer = 2,
        explanation = "Rhabarber-Blätter enthalten bis zu 500–1.000 mg Oxalsäure pro 100 g (giftig); Rhabarberstiele 275–1.500 mg/100 g. Auch Spinat (970 mg/100 g), Mangold und Kakao sind reich an Oxalat. Oxalat bindet im Darm Calcium und wird renal ausgeschieden, wo es bei Sättigung als Calciumoxalat kristallisiert — der häufigste Nierenstein-Typ (~80 %).",
        difficulty = 3,
        funFact = "Rhabarber-Blätter können bei Kindern durch Oxalsäure-Vergiftung (ab ~5 g Oxalsäure) tödlich sein. Daher werden in der Küche ausschließlich die Stiele verwendet."
    ),

    // Q50 — correctAnswer = 3  (richtige Antwort an Position D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Acrylamid' in Lebensmitteln, wie entsteht es und welche EU-Regulierung gibt es dazu?",
        answerA = "Acrylamid ist ein Mykotoxin aus Schimmelpilzen auf Brot; die EU hat einen MRL von 100 µg/kg festgesetzt",
        answerB = "Acrylamid ist ein Kunststoffmonomer aus Verpackungsmaterial, das in fettige Lebensmittel migriert; EU-VO 10/2011 reguliert die Migration",
        answerC = "Acrylamid ist ein natürlicher Inhaltsstoff von Kartoffeln; die EU verbietet Kartoffelchips mit über 2.000 µg/kg Acrylamid",
        answerD = "Acrylamid ist ein hitzeinduziertes Reaktionsprodukt aus Asparagin und reduzierenden Zuckern bei Temperaturen über 120 °C (Maillard-Nebenprodukt); EU-Verordnung 2017/2158 legt Richtwerte für Lebensmittelkategorien fest",
        correctAnswer = 3,
        explanation = "Acrylamid (C₃H₅NO) entsteht bei der Maillard-Reaktion aus der Aminosäure Asparagin und reduzierenden Zuckern bei Temperaturen über 120 °C — hauptsächlich beim Frittieren, Backen, Rösten. Es kommt in Pommes frites, Chips, Toast, Kaffee und Knäckebrot vor. IARC klassifiziert es als 'wahrscheinlich krebserregend beim Menschen' (Gruppe 2A). EU-VO 2017/2158 verlangt Maßnahmen zur Reduzierung in der Lebensmittelproduktion.",
        difficulty = 3,
        funFact = "Die Faustformel 'golden statt braun' beim Backen und Frittieren gilt als praktische Regel zur Acrylamid-Reduktion: Goldgelbes Bräunen hat ca. 3–5-fach weniger Acrylamid als dunkelbraunes Rösten."
    )
)
