package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert5(): List<Question> = listOf(

    // ── ERNÄHRUNGSMEDIZIN & STOFFWECHSEL ──────────────────────────────────────

    // Question 1 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Enzym ist bei primärer Laktoseintoleranz defizient?",
        answerA = "Laktase",
        answerB = "Maltase",
        answerC = "Sucrase",
        answerD = "Amylase",
        correctAnswer = 0,
        explanation = "Primäre Laktoseintoleranz entsteht durch einen genetisch bedingten Rückgang der Laktase-Aktivität (Laktase-Persistenz-Phänomen). Ohne Laktase kann der Dünndarm Laktose (Milchzucker) nicht in Glukose und Galaktose spalten, was zu Gärung durch Dickdarmbakterien und typischen Symptomen führt.",
        difficulty = 4,
        funFact = "Weltweit sind etwa 65–70 % der erwachsenen Bevölkerung laktoseintolerant — Laktase-Persistenz ist die Ausnahme, evolutionär durch Viehhaltung entstanden."
    ),

    // Question 2 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Antikörper ist der wichtigste diagnostische Marker bei Zöliakie?",
        answerA = "IgE gegen Gliadin",
        answerB = "IgA anti-Transglutaminase (tTG-IgA)",
        answerC = "IgG anti-Endomysium",
        answerD = "IgM anti-Deamidiertes Gliadin",
        correctAnswer = 1,
        explanation = "Der IgA-Antikörper gegen Gewebstransglutaminase (tTG-IgA) ist der Erstlinien-Screeningtest bei Zöliakieverdacht mit einer Sensitivität von 95–98 %. Bei IgA-Mangel wird zusätzlich IgG-basierter Antikörper (DGP-IgG) bestimmt. Die Diagnose wird durch Duodenalbiopsie (Marsh-Klassifikation) gesichert.",
        difficulty = 4,
        funFact = "Zöliakie betrifft etwa 1 % der Weltbevölkerung, bleibt aber in ca. 80 % der Fälle undiagnostiziert — viele Jahre lang werden Symptome anderen Ursachen zugeschrieben."
    ),

    // Question 3 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher Mechanismus liegt dem Typ-2-Diabetes mellitus primär zugrunde?",
        answerA = "Autoimmune Zerstörung der Beta-Zellen",
        answerB = "Absoluter Insulinmangel durch Pankreatitis",
        answerC = "Periphere Insulinresistenz kombiniert mit progredientem Beta-Zell-Versagen",
        answerD = "Überschießende Glukagonsekretion bei normaler Insulinproduktion",
        correctAnswer = 2,
        explanation = "Typ-2-Diabetes beginnt mit Insulinresistenz (Muskel, Leber, Fettgewebe sprechen schlechter auf Insulin an). Kompensatorisch steigern die Beta-Zellen die Insulinproduktion, erschöpfen sich aber über Jahre. Diese Kombination aus Insulinresistenz und progredientem relativen Insulinmangel ist der Kernmechanismus.",
        difficulty = 4,
        funFact = "Bereits 10–15 Jahre vor der klinischen Diagnose Typ-2-Diabetes sind erste Anzeichen von Insulinresistenz messbar — das sogenannte 'prädiabetische Fenster' bietet die beste Chance zur Prävention."
    ),

    // Question 4 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Laborwert ist die Grundlage der Diagnose eines metabolischen Syndroms nach IDF-Kriterien (International Diabetes Federation)?",
        answerA = "LDL-Cholesterin > 160 mg/dl",
        answerB = "BMI > 30 kg/m²",
        answerC = "Nüchternblutzucker > 126 mg/dl",
        answerD = "Zentrales Übergewicht (Taillenumfang ≥ 94 cm bei Männern)",
        correctAnswer = 3,
        explanation = "Nach IDF-Definition ist zentrales Übergewicht (gemessen am Taillenumfang: ≥ 94 cm bei europäischen Männern, ≥ 80 cm bei Frauen) das obligate Hauptkriterium. Dazu müssen mindestens 2 von 4 weiteren Kriterien erfüllt sein: erhöhte Triglyceride, niedriges HDL, erhöhter Blutdruck, erhöhter Nüchternblutzucker.",
        difficulty = 4,
        funFact = "Das metabolische Syndrom wird auch als 'tödliches Quartett' bezeichnet: Adipositas, Hypertonie, Dyslipidämie und Insulinresistenz erhöhen das Herzinfarkt-Risiko um das 3-fache."
    ),

    // Question 5 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Vitaminmangel führt klassischerweise zur Wernicke-Enzephalopathie?",
        answerA = "Thiamin (Vitamin B1)",
        answerB = "Cobalamin (Vitamin B12)",
        answerC = "Pyridoxin (Vitamin B6)",
        answerD = "Folsäure (Vitamin B9)",
        correctAnswer = 0,
        explanation = "Thiaminmangel (Vitamin B1) führt zur Wernicke-Enzephalopathie, charakterisiert durch die klinische Trias: Ophthalmoplegie, Ataxie und Bewusstseinsstörung. Häufig bei Alkoholabhängigkeit und Mangelernährung. Ohne sofortige Thiamingabe kann es zum Korsakow-Syndrom (irreversible Amnesie) fortschreiten.",
        difficulty = 4,
        funFact = "Bei Verdacht auf Wernicke-Enzephalopathie darf man dem Patienten NIEMALS zuerst Glukose geben — das verbraucht den letzten Thiaminvorrat und beschleunigt die Hirnschädigung."
    ),

    // Question 6 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches ist der biochemische Schlüsselschritt der Ketogenese in der Leber?",
        answerA = "Umwandlung von Pyruvat zu Acetyl-CoA durch die Pyruvatdehydrogenase",
        answerB = "Kondensation von zwei Acetyl-CoA zu Acetoacetat durch HMGCS2 (HMG-CoA-Synthase 2)",
        answerC = "Beta-Oxidation von Fettsäuren im Zytosol",
        answerD = "Transaminierung von Alanin zu Pyruvat in Mitochondrien",
        correctAnswer = 1,
        explanation = "Im Fastenoder Kohlenhydratmangel-Zustand werden in Lebermitochondrien überschüssige Acetyl-CoA-Einheiten durch die mitochondriale HMG-CoA-Synthase (HMGCS2) zu HMG-CoA kondensiert, das dann zu Acetoacetat gespalten wird. Dieser Schritt ist der regulatorische Engpass der Ketonkörpersynthese.",
        difficulty = 4,
        funFact = "Gehirn kann Ketonkörper als Energiequelle nutzen — nach mehrwöchigem Fasten decken sie bis zu 70 % des Hirnenergieverbrauchs und schonen so Körperprotein."
    ),

    // Question 7 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Diät hat in kontrollierten Studien die stärkste Evidenz zur Senkung kardiovaskulärer Mortalität?",
        answerA = "Ketogene Diät (< 20 g Kohlenhydrate/Tag)",
        answerB = "DASH-Diät (Dietary Approaches to Stop Hypertension)",
        answerC = "Mediterrane Ernährung (Olivenöl, Fisch, Hülsenfrüchte, Nüsse)",
        answerD = "Vegane Ernährung ohne tierische Produkte",
        correctAnswer = 2,
        explanation = "Die PREDIMED-Studie (2013, n > 7.000) zeigte, dass die mediterrane Ernährung kardiovaskuläre Ereignisse um 30 % reduziert. Sie ist die einzige Ernährungsform mit starker RCT-Evidenz für harte kardiovaskuläre Endpunkte. DASH ist gut für Blutdruck belegt, aber nicht für Gesamtmortalität in großen RCTs.",
        difficulty = 4,
        funFact = "Das 'Paradoxon' der mediterranen Ernährung: Trotz relativ hohem Fettanteil (40–45 % der Energie, hauptsächlich MUFA aus Olivenöl) zeigt sie ausgeprägte kardioprotektive Effekte."
    ),

    // Question 8 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Mangel an welchem Spurenelement verursacht die Krankheit Keshan-Disease?",
        answerA = "Zinkmangel",
        answerB = "Eisenmangel",
        answerC = "Jodmangel",
        answerD = "Selenmangel",
        correctAnswer = 3,
        explanation = "Keshan-Disease ist eine endemische Kardiomyopathie, die in selenarmen Regionen Chinas auftritt. Selenmangel beeinträchtigt die Glutathionperoxidase (GPx), ein selenabhängiges Antioxidationsenzym, was zu oxidativem Stress im Herzmuskelgewebe und fataler dilativer Kardiomyopathie führen kann.",
        difficulty = 4,
        funFact = "Selen kommt in Böden sehr ungleich verteilt vor. In Deutschland und Österreich sind die Böden selenarm — weshalb viele Menschen suboptimale Selenspiegel haben, obwohl keine manifeste Mangelkrankheit besteht."
    ),

    // Question 9 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Pathomechanismus erklärt die Skorbut-typischen Blutungen bei Vitamin-C-Mangel?",
        answerA = "Fehlerhafte Kollagensynthese durch mangelnde Hydroxylierung von Prolin und Lysin",
        answerB = "Hemmung der Thrombozytenaggregation durch Askorbinsäure-Mangel",
        answerC = "Erhöhte Kapillarpermeabilität durch Histaminüberproduktion",
        answerD = "Gerinnungsfaktormangel durch hepatische Synthesestörung",
        correctAnswer = 0,
        explanation = "Vitamin C ist Cofaktor der Prolyl- und Lysylhydroxylase, die Prolin und Lysin in Prokollagen hydroxylieren. Ohne diese Hydroxylierung kann Kollagen nicht die stabile Triple-Helix-Struktur bilden — es entsteht strukturell minderwertiges Kollagen, was zu Gefäßbrüchigkeit, Zahnfleischbluten und Wundheilungsstörungen führt.",
        difficulty = 4,
        funFact = "Skorbut tötet in extremen Fällen innerhalb von 3 Monaten. Seekapitäne des 18. Jahrhunderts verloren bis zu 50 % ihrer Besatzung — bis James Lind 1747 Zitrusfrüchte als Heilmittel bewies."
    ),

    // Question 10 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Stoffwechselweg ist bei Phenylketonurie (PKU) gestört?",
        answerA = "Hydroxylierung von Tryptophan zu 5-Hydroxytryptophan",
        answerB = "Hydroxylierung von Phenylalanin zu Tyrosin durch Phenylalaninhydroxylase",
        answerC = "Decarboxylierung von Histidin zu Histamin",
        answerD = "Transaminierung von Leucin zu alpha-Ketoisocapronsäure",
        correctAnswer = 1,
        explanation = "Bei PKU ist die hepatische Phenylalaninhydroxylase (PAH) defekt oder fehlt. Phenylalanin kann nicht zu Tyrosin hydroxyliert werden und akkumuliert im Blut. Hohe Phenylalaninspiegel sind neurotoxisch und verursachen ohne Behandlung schwere geistige Behinderung. Neugeborenenscreening erlaubt frühzeitige Diättherapie.",
        difficulty = 4,
        funFact = "PKU-Patienten müssen lebenslang eine phenylalaninarmie Diät einhalten — inklusive strikter Vermeidung von Aspartam (Süßungsmittel), das im Körper zu Phenylalanin abgebaut wird."
    ),

    // Question 11 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Refeeding-Syndrom'?",
        answerA = "Gewichtszunahme nach Beendigung einer Kalorienrestriktionsdiät",
        answerB = "Refluxbeschwerden nach schnellem Wiederaufbau des Essverhaltens",
        answerC = "Lebensbedrohliche Elektrolytstörungen (v.a. Hypophosphatämie) bei zu raschem Kostaufbau nach Mangelernährung",
        answerD = "Erneuter Gewichtsverlust nach anfänglichem Therapieerfolg bei Anorexie",
        correctAnswer = 2,
        explanation = "Das Refeeding-Syndrom entsteht, wenn Unterernährte zu schnell mit Kohlenhydraten versorgt werden. Insulin stimuliert die zelluläre Aufnahme von Phosphat, Magnesium und Kalium — die ohnehin niedrigen Serumspiegel fallen katastrophal ab. Folge: Herzrhythmusstörungen, Herzversagen, neuromuskuläre Störungen. Langsamer, überwachter Kostaufbau ist essenziell.",
        difficulty = 4,
        funFact = "Das Refeeding-Syndrom wurde erstmals nach dem Zweiten Weltkrieg beschrieben, als befreite KZ-Überlebende mit Nahrungsmitteln überflutet wurden und daran starben."
    ),

    // Question 12 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches ist das korrekte Prinzip der glykämischen Last (GL) im Unterschied zum glykämischen Index (GI)?",
        answerA = "GL misst die Blutzuckerreaktion im Nüchternzustand, GI postprandial",
        answerB = "GL berücksichtigt die Insulinantwort, GI nur den Blutzucker",
        answerC = "GL und GI sind identisch, nur die Einheit ist verschieden",
        answerD = "GL berücksichtigt zusätzlich die verzehrte Kohlenhydratmenge (GL = GI × Kohlenhydrate in g / 100)",
        correctAnswer = 3,
        explanation = "Der GI beschreibt nur, wie schnell ein Lebensmittel den Blutzucker anhebt (relativ zu Glukose). Die GL multipliziert GI mit der tatsächlich verzehrten Kohlenhydratmenge: GL = (GI × verfügbare KH in g) / 100. Wassermelone hat z.B. einen hohen GI (~72), aber niedrige GL (~4) wegen geringem KH-Gehalt pro Portion.",
        difficulty = 4,
        funFact = "Die Forschungsgruppe um David Jenkins (Universität Toronto) entwickelte 1981 den GI — ursprünglich zur Diabetesernährung, heute im Leistungssport und bei der Gewichtskontrolle genutzt."
    ),

    // Question 13 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Fettsäuretyp hemmt nachweislich die HMG-CoA-Reduktase und senkt so LDL-Cholesterin?",
        answerA = "Keine Fettsäure — HMG-CoA-Reduktase wird durch Statine gehemmt, nicht durch Nahrungsfettsäuren direkt",
        answerB = "Omega-3-Fettsäuren (EPA, DHA)",
        answerC = "Einfach ungesättigte Fettsäuren (Ölsäure)",
        answerD = "Konjugierte Linolsäure (CLA)",
        correctAnswer = 0,
        explanation = "Nahrungsfettsäuren beeinflussen den Cholesterinspiegel indirekt über LDL-Rezeptor-Expression und VLDL-Sekretion, nicht durch direkte HMG-CoA-Reduktase-Hemmung. Gesättigte Fettsäuren erhöhen LDL durch Downregulation des LDL-Rezeptors. Die direkte HMG-CoA-Reduktase-Hemmung ist Mechanismus der Statine (Arzneimittel).",
        difficulty = 4,
        funFact = "Omega-3-Fettsäuren senken hauptsächlich Triglyceride (um bis zu 50 % bei hohen Dosen), aber ihr LDL-senkender Effekt ist begrenzt — dafür erhöhen sie leicht HDL und wirken entzündungshemmend."
    ),

    // Question 14 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche Aminosäure ist die wichtigste endogene Stickstoffdonatorin beim Harnstoffzyklus?",
        answerA = "Glutamat",
        answerB = "Aspartat",
        answerC = "Alanin",
        answerD = "Glutamin",
        correctAnswer = 1,
        explanation = "Im Harnstoffzyklus werden zwei Stickstoffatome pro Harnstoffmolekül eingebaut: das erste kommt als Ammoniak (via Carbamylphosphat) aus mitochondrialer Glutamatdehydrogenase, das zweite liefert Aspartat im Cytosol bei der Kondensation mit Citrullin zu Argininosuccinat. Aspartat ist damit der direkte N-Donor für das zweite Harnstoff-N.",
        difficulty = 4,
        funFact = "Der Harnstoffzyklus ist der einzige Weg, wie Säugetiere toxisches Ammoniak entsorgen können — Leberversagen führt daher zu Hyperammonämie und hepatischer Enzephalopathie."
    ),

    // Question 15 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Vitamin wird durch Sonnenexposition (UVB-Strahlung) in der Haut gebildet?",
        answerA = "Vitamin A (Retinol)",
        answerB = "Vitamin E (Tocopherol)",
        answerC = "Vitamin D3 (Cholecalciferol)",
        answerD = "Vitamin K2 (Menachinon)",
        correctAnswer = 2,
        explanation = "UVB-Strahlung (290–315 nm) spaltet in der Haut 7-Dehydrocholesterin zu Prävitamin D3, das sich spontan zu Vitamin D3 (Cholecalciferol) isomerisiert. Dieses wird in der Leber zu 25-OH-D3 hydroxyliert und in der Niere zum biologisch aktiven 1,25-(OH)₂-D3 (Calcitriol) aktiviert.",
        difficulty = 4,
        funFact = "Die Haut kann an einem sonnigen Sommertag in Mitteleuropa in 15–20 Minuten bis zu 10.000–20.000 IE Vitamin D3 synthetisieren — mehr als jedes Nahrungsmittel liefern kann."
    ),

    // Question 16 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist das Prinzip der 'nutrigenomischen' Ernährungsberatung?",
        answerA = "Ernährungsempfehlungen basierend auf dem Blutgruppentyp",
        answerB = "Messung von Stuhlmikrobiom-Profilen zur Ableitung individueller Diätpläne",
        answerC = "Anpassung der Energiezufuhr an den gemessenen Grundumsatz per Kalorimetrie",
        answerD = "Individuelle Ernährungsempfehlungen basierend auf genetischen Varianten (SNPs) die Nährstoffstoffwechsel beeinflussen",
        correctAnswer = 3,
        explanation = "Nutrigenomik untersucht, wie genetische Varianten (Single Nucleotide Polymorphisms, SNPs) die Reaktion auf Nahrungsbestandteile bestimmen. Beispiel: MTHFR-C677T-Variante beeinflusst Folsäuremetabolismus; APOE-E4-Variante erhöht LDL-Anstieg bei gesättigten Fettsäuren. Ziel ist personalisierte Ernährungsmedizin.",
        difficulty = 4,
        funFact = "Die Blutgruppen-Diät ist wissenschaftlich vollständig widerlegt — genetische Varianten die Ernährungsreaktionen beeinflussen haben nichts mit Blutgruppen zu tun."
    ),

    // Question 17 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches ist der korrekte Wirkmechanismus von GLP-1-Rezeptoragonisten (z.B. Semaglutid) bei Typ-2-Diabetes?",
        answerA = "Glukoseabhängige Insulinstimulation, Glukagonsuppression, Verlangsamung der Magenentleerung und Appetitreduktion",
        answerB = "Direkte Hemmung der Glukoseabsorption im Dünndarm",
        answerC = "Aktivierung der GLUT4-Translokation in Muskelzellen ohne Insulinbeteiligung",
        answerD = "Inhibition der hepatischen Glukoneogenese über AMPK-Aktivierung",
        correctAnswer = 0,
        explanation = "GLP-1-Rezeptoragonisten ahmen das Inkretinhormon GLP-1 nach: Sie stimulieren Insulinsekretion glukoseabhängig (kein Hypoglykämierisiko bei Normoglykämie), hemmen Glukagon, verlangsamen die Magenentleerung (Sättigungsgefühl länger) und wirken zentral appetitreduzierend. Diese Kombination erklärt den starken Gewichtsreduktionseffekt.",
        difficulty = 4,
        funFact = "Semaglutid (Ozempic/Wegovy) führt in Studien zu 15–20 % Körpergewichtsreduktion — ein bislang beispielloser Effekt für ein Medikament und damit ein Paradigmenwechsel in der Adipositastherapie."
    ),

    // Question 18 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Biomarker zeigt am zuverlässigsten eine chronische Eisenmangelanämie an?",
        answerA = "Serumeisen",
        answerB = "Ferritin (Serumferritin < 30 µg/l)",
        answerC = "Hämoglobin",
        answerD = "Transferrinsättigung",
        correctAnswer = 1,
        explanation = "Ferritin ist das Eisenspeicherprotein und spiegelt die Körpereisenspeicher wider. Ein niedriges Ferritin (< 30 µg/l) ist hochspezifisch für Eisenmangel. Serumeisen und Hämoglobin fallen erst in späteren Stadien. Wichtig: Ferritin ist ein Akutphaseprotein — bei Entzündung kann es trotz Eisenmangel normal/erhöht sein.",
        difficulty = 4,
        funFact = "Der häufigste Nährstoffmangel weltweit ist Eisenmangel — er betrifft ca. 2 Milliarden Menschen, überwiegend Frauen im gebärfähigen Alter und Kinder in Entwicklungsländern."
    ),

    // Question 19 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem 'postprandialen Lipämie-Paradoxon' bei der mediterranen Ernährung?",
        answerA = "LDL sinkt paradoxerweise nach einer fetthaltigen Mahlzeit mit Olivenöl",
        answerB = "Triglyceride steigen nach einer Mahlzeit stärker als nach dem Nüchternwert erwartet",
        answerC = "Trotz hohem Fettgehalt mediteraner Mahlzeiten ist die postprandiale Entzündungsreaktion geringer als bei gleichkalorischen westlichen Mahlzeiten",
        answerD = "HDL sinkt paradoxerweise nach dem Verzehr von einfach ungesättigten Fettsäuren",
        correctAnswer = 2,
        explanation = "Studien zeigen, dass mediterrane Mahlzeiten (reich an MUFA, Polyphenolen, Antioxidantien aus Olivenöl und Gemüse) trotz hohem Fettgehalt eine deutlich geringere postprandiale Inflammation auslösen als westliche Hochfett-Mahlzeiten. Dies wird auf die entzündungshemmenden Polyphenole und das Fettsäureprofil zurückgeführt.",
        difficulty = 4,
        funFact = "Extra-natives Olivenöl enthält Oleocanthal — ein Polyphenol mit struktureller Ähnlichkeit zu Ibuprofen, das COX-1 und COX-2 hemmt und so antiinflammatorisch wirkt."
    ),

    // Question 20 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches ist die klinisch relevante Schwelle für eine schwere Hyponatriämie?",
        answerA = "Na⁺ < 135 mmol/l",
        answerB = "Na⁺ < 130 mmol/l",
        answerC = "Na⁺ < 125 mmol/l",
        answerD = "Na⁺ < 120 mmol/l mit klinischen Symptomen (Krampfanfall, Bewusstseinsstörung)",
        correctAnswer = 3,
        explanation = "Klinische Einteilung: mild (130–135), moderat (125–130), schwer (< 125 mmol/l). Neurologische Symptome (Kopfschmerzen, Krampfanfälle, Bewusstseinsstörung, Koma) treten typischerweise unter 120 mmol/l auf. Die Korrekturgeschwindigkeit ist kritisch: zu schnelle Korrektur riskiert zentrale pontine Myelinolyse.",
        difficulty = 4,
        funFact = "Marathonläufer entwickeln durch exzessive Wasserzufuhr ohne Salzersatz eine gefährliche Hyponatriämie — Überhydratation kann tödlicher sein als Dehydratation."
    ),

    // Question 21 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Enzym aktiviert die Vitamin-D-Vorstufe 25-OH-D3 zum biologisch wirksamen Calcitriol?",
        answerA = "1-alpha-Hydroxylase (CYP27B1) in der Niere",
        answerB = "25-Hydroxylase (CYP2R1) in der Leber",
        answerC = "24-Hydroxylase (CYP24A1) im Darm",
        answerD = "Aromatase (CYP19A1) in Fettzellen",
        correctAnswer = 0,
        explanation = "Die renale 1-alpha-Hydroxylase (CYP27B1) katalysiert den letzten Aktivierungsschritt: 25-OH-D3 → 1,25-(OH)₂-D3 (Calcitriol). Dieses Enzym wird durch PTH stimuliert (bei Calciumbedarf) und durch hohe Calciumspiegel und FGF-23 gehemmt. Bei chronischer Niereninsuffizienz fehlt dieses Enzym — daher renale Osteodystrophie.",
        difficulty = 4,
        funFact = "Calcitriol ist streng genommen kein Vitamin, sondern ein Steroidhormon — es bindet an nukleäre Rezeptoren (VDR) und reguliert die Expression von über 200 Genen."
    ),

    // Question 22 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Prinzip liegt der 'Low-FODMAP-Diät' zugrunde?",
        answerA = "Vollständige Eliminierung aller Kohlenhydrate zur Darmentlastung",
        answerB = "Reduktion fermentierbare Oligosaccharide, Disaccharide, Monosaccharide und Polyole zur Symptomkontrolle bei Reizdarmsyndrom",
        answerC = "Ausschluss aller glutenhaltigen Lebensmittel ohne Zöliakiediagnose",
        answerD = "Erhöhung des Ballaststoffanteils durch unlösliche Fasern",
        correctAnswer = 1,
        explanation = "FODMAP steht für Fermentable Oligosaccharides, Disaccharides, Monosaccharides And Polyols — schlecht absorbierte, fermentierbare Kurzkettige Kohlenhydrate. Sie ziehen osmotisch Wasser in den Darm und werden von Bakterien zu Gas fermentiert, was bei RDS-Patienten Blähungen, Schmerzen und veränderten Stuhlgang auslöst. Meta-Analysen zeigen 50–75 % Symptomverbesserung.",
        difficulty = 4,
        funFact = "Die Low-FODMAP-Diät wurde 2001 von Peter Gibson und Sue Shepherd an der Monash University entwickelt — heute gilt sie als die evidenzbasierte Erstlinientherapie beim Reizdarmsyndrom."
    ),

    // Question 23 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher Mechanismus erklärt die gewichtsreduzierende Wirkung des intermittierenden Fastens (16:8-Methode)?",
        answerA = "Erhöhung der Basaltemperatur durch Thermogenese im braunen Fettgewebe",
        answerB = "Direkte Hemmung der Lipolyse durch verlängerte Insulinsuppression",
        answerC = "Kaloriendefizit durch verkürzte Essensfenster, verbesserte Insulinsensitivität und verstärkte Autophagie",
        answerD = "Gesteigerte Wachstumshormonsynthese in der Fastenperiode",
        correctAnswer = 2,
        explanation = "Intermittierendes Fasten wirkt hauptsächlich durch spontanes Kaloriendefizit (kürzeres Essensfenster = weniger Mahlzeiten), verbesserte Insulinsensitivität durch längere Insulinfreie Phasen und mTOR-Hemmung mit gesteigerter Autophagie. Studien zeigen ähnliche Gewichtsreduktion wie kontinuierliche Kalorienreduktion, aber bessere Adhärenz.",
        difficulty = 4,
        funFact = "Der Nobelpreisträger Yoshinori Ohsumi (2016) entdeckte die molekularen Grundlagen der Autophagie — der zelluläre 'Selbstreinigungsmechanismus', der durch Fasten aktiviert wird."
    ),

    // Question 24 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dumping-Syndrom' im Kontext der bariatrischen Chirurgie?",
        answerA = "Malnutrition durch unzureichende Nährstoffabsorption nach Magenbypass",
        answerB = "Psychologische Komplikation durch verändertes Körperbild nach Gewichtsverlust",
        answerC = "Refluxösophagitis durch Druckumverteilung nach Magenreduktion",
        answerD = "Rapid-Passage von unverdauter Nahrung in den Dünndarm, was vasomotorische Symptome und Hypoglykämie auslöst",
        correctAnswer = 3,
        explanation = "Früh-Dumping (15–30 min nach Mahlzeit): osmotischer Flüssigkeitseinstrom in den Dünndarm → Volumenreduktion im Gefäßsystem → Übelkeit, Tachykardie, Schwäche. Spät-Dumping (1–3 h nach Mahlzeit): reaktive Hypoglykämie durch exzessive Insulinsekretion. Häufig nach Roux-en-Y-Magenbypass durch fehlenden Pylorus-Kontrollmechanismus.",
        difficulty = 4,
        funFact = "Das Dumping-Syndrom tritt bei bis zu 75 % der Magenbypass-Patienten auf — es hat aber auch einen unerwarteten Nutzen: Die unangenehmen Symptome nach süßen oder fettreichen Speisen konditionieren Patienten zu einer gesünderen Ernährungsweise."
    ),

    // Question 25 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Protein ist verantwortlich für den Transport von Vitamin B12 im Blut zur Leberspeicherung?",
        answerA = "Transcobalamin II (TCII)",
        answerB = "Intrinsic Factor (IF)",
        answerC = "Haptocorrin (R-Protein / Transcobalamin I)",
        answerD = "Gastroferrin",
        correctAnswer = 0,
        explanation = "Transcobalamin II (TCII) bindet neu absorbiertes Vitamin B12 im Darmepithel und transportiert es im Blut zu Leber und anderen Geweben. TCII-Mangel führt zu schwerer B12-Mangelanämie trotz normaler B12-Zufuhr. Haptocorrin (TCII) transportiert den größten Teil des gespeicherten B12 im Blut, ist aber für die Gewebsaufnahme weniger wichtig.",
        difficulty = 4,
        funFact = "Der Körper kann Vitamin B12 für 3–5 Jahre speichern (hauptsächlich in der Leber) — weshalb ein B12-Mangel bei Veganern oft erst nach Jahren symptomatisch wird."
    ),

    // Question 26 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Neurotransmitter wird aus Tryptophan synthetisiert und reguliert Appetit und Stimmung?",
        answerA = "Dopamin",
        answerB = "Serotonin (5-Hydroxytryptamin)",
        answerC = "GABA",
        answerD = "Noradrenalin",
        correctAnswer = 1,
        explanation = "Tryptophan wird durch Tryptophanhydroxylase zu 5-Hydroxytryptophan und dann zu Serotonin (5-HT) decarboxyliert. Ca. 95 % des Körperserotonins wird im enterochromaffinen Zellen des Darms gebildet. Serotonin reguliert Sättigung, Schlaf, Stimmung und GI-Motilität. Tryptophanmangel (z.B. bei Mais-Diät) führt zu Pellagra und Depressionen.",
        difficulty = 4,
        funFact = "Das 'Truthahn-schläfrig-Mythos' ist ein Irrtum: Obwohl Truthahn tryptophanreich ist, enthält er nicht mehr Tryptophan als Huhn. Die Schläfrigkeit nach dem Festmahl kommt von Alkohol, großer Kalorienmenge und sozialer Entspannung."
    ),

    // Question 27 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist das Hauptprinzip der 'Deutschen Gesellschaft für Ernährung (DGE)' Empfehlung zur Protein-Zufuhr bei gesunden Erwachsenen?",
        answerA = "1,5 g Protein pro kg Körpergewicht täglich",
        answerB = "Mindestens 20 % der Gesamtkalorienzufuhr aus Proteinen",
        answerC = "0,8 g Protein pro kg Körpergewicht täglich als Mindestbedarf",
        answerD = "Proteinzufuhr soll die Hälfte der Kohlenhydratzufuhr betragen",
        correctAnswer = 2,
        explanation = "Die DGE empfiehlt für gesunde Erwachsene 0,8 g Protein pro kg Körpergewicht täglich als Referenzwert. Für ältere Menschen (> 65 Jahre) wird aufgrund von Sarkopenieprophylaxe 1,0–1,2 g/kg empfohlen. Leistungssportler benötigen 1,4–2,0 g/kg. Die Empfehlung basiert auf Stickstoffbilanzstudien.",
        difficulty = 4,
        funFact = "Die DGE-Proteinempfehlung deckt den Mindestbedarf — aktuelle Forschung zeigt, dass für optimale Muskelmasse und Sattheit (insbesondere im Alter) 1,2–1,6 g/kg sinnvoll sein können."
    ),

    // Question 28 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Prozess beschreibt den 'enterohepatischen Kreislauf' von Gallensäuren?",
        answerA = "Synthese von Gallensäuren aus Cholesterin in der Leber und Sekretion in die Gallenblase",
        answerB = "Rückresorption von Bilirubin im Darm und Wiederverwertung in der Leber",
        answerC = "Umwandlung von primären zu sekundären Gallensäuren durch Darmbakterien",
        answerD = "Rückresorption von Gallensäuren im terminalen Ileum, portaler Transport zur Leber und erneute Sekretion",
        correctAnswer = 3,
        explanation = "Der enterohepatische Kreislauf: Gallensäuren werden aus der Leber in die Gallenblase sezerniert → Dünndarm (Fettemulgierung) → aktive Rückresorption im terminalen Ileum → Pfortaderblut → Leber → erneute Konjugation und Sekretion. Pro Tag zirkulieren ca. 20–30 g Gallensäuren 6–10-mal. Nur 0,5 g/Tag wird im Stuhl verloren.",
        difficulty = 4,
        funFact = "Cholestyramin (Gallensäurebinder) senkt LDL, indem es Gallensäuren im Darm bindet und deren Rückresorption verhindert — die Leber muss mehr Cholesterin zu Gallensäuren abbauen."
    ),

    // Question 29 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches ist der Goldstandard zur Messung des Gesamtkörperfetts in der klinischen Ernährungsmedizin?",
        answerA = "DEXA-Scan (Dual-Energy X-ray Absorptiometry)",
        answerB = "Bioelektrische Impedanzanalyse (BIA)",
        answerC = "Hautfaltenmessung nach Durnin-Womersley",
        answerD = "MRT-Volumetrie",
        correctAnswer = 0,
        explanation = "DEXA gilt als Goldstandard für die Körperzusammensetzungsmessung: Es quantifiziert Knochenmineralmasse, Mager- und Fettmasse mit hoher Präzision und Reproduzierbarkeit (Variationskoeffizient < 2 %). BIA ist günstiger und einfacher, aber von Hydrationsstatus abhängig. MRT ist präziser für viszerales Fett, aber teuer und zeitaufwendig.",
        difficulty = 4,
        funFact = "BMI erfasst nur Gewicht relativ zur Körpergröße — er unterscheidet nicht zwischen Muskel- und Fettmasse. Ein Bodybuilder kann 'adipös' laut BMI sein, während jemand mit 'Normalgewicht' gefährlich viel viszerales Fett haben kann ('skinny fat')."
    ),

    // Question 30 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Mechanismus liegt der Gicht (Hyperurikämie) als Stoffwechselkrankheit zugrunde?",
        answerA = "Erhöhte Synthese von Harnsäure durch exzessive Fruktosezufuhr und gestörte renale Ausscheidung",
        answerB = "Unzureichende renale Ausscheidung (> 90 % der Fälle) und/oder Überproduktion von Harnsäure durch Purinabbau",
        answerC = "Akkumulation von Xanthin durch Xanthinoxidase-Überaktivität",
        answerD = "Direkte Purinaufnahme aus der Nahrung als Hauptursache",
        correctAnswer = 1,
        explanation = "Harnsäure ist das Endprodukt des Purinabbaus (Xanthinoxidase katalysiert Xanthin → Harnsäure). Über 90 % der Gichtpatienten haben eine renale Ausscheidungsstörung, < 10 % produzieren zu viel. Diät (purinarme Kost, Alkoholreduktion, Fruktosereduktion) kann Harnsäure senken, reicht aber meist nicht aus — Allopurinol (Xanthinoxidase-Hemmer) ist die Basistherapie.",
        difficulty = 4,
        funFact = "Fructose ist der einzige Zucker, der direkt Harnsäure erhöht — weil ATP bei der Fruktosephosphorylierung verbraucht wird und AMP zu Harnsäure abgebaut wird. Hochfructose-Maissirup in Softdrinks ist ein Haupttreiber der Gichtepidemie."
    ),

    // Question 31 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Non-Alcoholic Fatty Liver Disease (NAFLD)' und welcher Ernährungsfaktor ist am stärksten damit assoziiert?",
        answerA = "Leberverfettung durch exzessiven Fettkonsum; assoziiert mit Omega-6-Fettsäureüberschuss",
        answerB = "Leberenzündung durch Mangelernährung; assoziiert mit Proteinmangel",
        answerC = "Hepatische Triglyceridakkumulation ohne Alkohol; am stärksten assoziiert mit Übergewicht, Insulinresistenz und hoher Fruktose-/Gesamtkalorienbelastung",
        answerD = "Leberfibrose durch Schwermetallakkumulation; assoziiert mit verarbeitetem Fleisch",
        correctAnswer = 2,
        explanation = "NAFLD (heute: MASLD = Metabolic dysfunction-associated steatotic liver disease) entsteht durch Triglyceridakkumulation in Hepatozyten ohne signifikanten Alkoholkonsum. Die stärksten Risikofaktoren sind Adipositas, Insulinresistenz, Typ-2-Diabetes und Dyslipidämie. Fruktose fördert de-novo-Lipogenese in der Leber besonders stark. NAFLD betrifft ca. 25 % der Weltbevölkerung.",
        difficulty = 4,
        funFact = "NAFLD ist die häufigste Lebererkrankung weltweit und die häufigste Ursache von Leberzirrhose — dennoch gibt es erst seit 2024 das erste zugelassene Medikament (Resmetirom)."
    ),

    // Question 32 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Gerinnungsfaktor ist als einziger unabhängig von Vitamin K für die Synthese?",
        answerA = "Faktor II (Prothrombin)",
        answerB = "Faktor VII",
        answerC = "Faktor X",
        answerD = "Faktor VIII",
        correctAnswer = 3,
        explanation = "Die Vitamin-K-abhängigen Gerinnungsfaktoren sind: II (Prothrombin), VII, IX, X sowie die antikoagulatorischen Proteine C, S und Z. Faktor VIII ist nicht Vitamin-K-abhängig — sein Mangel führt zur Hämophilie A. Vitamin K aktiviert diese Faktoren durch Carboxylierung von Glutaminsäureresten (Gamma-Carboxylierung), was Calcium-Bindung ermöglicht.",
        difficulty = 4,
        funFact = "Cumarin-Antikoagulanzien (Warfarin, Phenprocoumon) hemmen die Vitamin-K-Epoxidreduktase, wodurch Vitamin K nicht recycelt werden kann — das ist die Basis ihrer blutverdünnenden Wirkung."
    ),

    // Question 33 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Aminosäure ist die einzige, die direkt als Neurotransmitter im ZNS wirkt?",
        answerA = "Glycin (inhibitorischer Neurotransmitter im Rückenmark)",
        answerB = "Tryptophan",
        answerC = "Tyrosin",
        answerD = "Phenylalanin",
        correctAnswer = 0,
        explanation = "Glycin wirkt als inhibitorischer Neurotransmitter im Rückenmark und Hirnstamm durch Aktivierung von Glycin-Rezeptoren (Chloridkanal). Glutamat und GABA sind die wichtigsten exzitatorischen bzw. inhibitorischen Neurotransmitter im Gehirn, aber keine proteinogenen Aminosäuren per se. Tryptophan und Tyrosin sind Vorstufen von Neurotransmittern (Serotonin, Dopamin), aber nicht selbst direkte Neurotransmitter.",
        difficulty = 4,
        funFact = "Strychnin — das klassische Rattenkonzept-Gift — blockiert spezifisch Glycin-Rezeptoren im Rückenmark, was zu unkontrollierten Muskelkrämpfen und Tod durch Atemlähmung führt."
    ),

    // Question 34 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Biomarker wird zur Langzeitkontrolle der Blutzuckereinstellung bei Diabetikern über 2–3 Monate verwendet?",
        answerA = "Nüchternblutzucker (Glukose nüchtern)",
        answerB = "HbA1c (glykiertes Hämoglobin A1c)",
        answerC = "Fruktosamin",
        answerD = "Postprandialer 2-Stunden-Blutzucker",
        correctAnswer = 1,
        explanation = "HbA1c reflektiert die durchschnittliche Blutglukose der letzten 8–12 Wochen (Erythrozytenlebensdauer ca. 120 Tage). Glukose bindet nicht-enzymatisch an Hämoglobin — je höher der Blutzucker, desto mehr HbA1c. Zielwert bei Typ-2-Diabetes: < 7,0 % (53 mmol/mol). Falsch niedrig bei Hämolyse oder Hämoglobinopathien.",
        difficulty = 4,
        funFact = "HbA1c wurde 1969 von Samuel Rahbar entdeckt — er beobachtete eine ungewöhnliche Hämoglobinfraktion bei Diabetikern und erkannte deren Zusammenhang mit der Glukosekonzentration."
    ),

    // Question 35 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher Effekt tritt auf, wenn Vitamin A in hohen Dosen supplementiert wird (> 10.000 IE/Tag über lange Zeit)?",
        answerA = "Erhöhtes Risiko für Nierensteine durch Kalziumüberladung",
        answerB = "Erhöhtes Risiko für Herzrhythmusstörungen durch Magnesiumsenkung",
        answerC = "Hepatotoxizität, Teratogenität und Pseudotumor cerebri durch Akkumulation in der Leber",
        answerD = "Erhöhtes Infektionsrisiko durch Immunsuppression",
        correctAnswer = 2,
        explanation = "Vitamin A (Retinol) ist fettlöslich und akkumuliert in der Leber. Chronische Überdosierung (> 10.000 IE/Tag) führt zur Hypervitaminose A: Lebertoxizität (Leberfibrose), Pseudotumor cerebri (erhöhter Hirndruck), Knochenschmerzen, Haarausfall. Schwangerschaft: Teratogenität bei > 3.000 µg/Tag. Isotretinoin (Aknetherapeutikum) ist ein Retinoid mit strengstem Schwangerschaftsverbot.",
        difficulty = 4,
        funFact = "Arktisforscher erkrankten im 19. Jahrhundert an Vitamin-A-Intoxikation durch den Verzehr von Polarbärlebern — eine einzige Mahlzeit kann letale Mengen (bis 9.000.000 IE) enthalten."
    ),

    // Question 36 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist die klinische Bedeutung des 'Insulinresistenz-Indexes HOMA-IR'?",
        answerA = "Er misst die maximale Insulinsekretion der Betazellen unter Glukosebelastung",
        answerB = "Er berechnet den täglichen Insulinbedarf bei Typ-1-Diabetes",
        answerC = "Er quantifiziert die postprandiale Glukoseantwort nach standardisierter Mahlzeit",
        answerD = "Er schätzt die Insulinresistenz aus Nüchterninsulin und Nüchternglukose: HOMA-IR = (Insulin µU/ml × Glukose mmol/l) / 22,5",
        correctAnswer = 3,
        explanation = "HOMA-IR (Homeostasis Model Assessment of Insulin Resistance) ist eine einfache Formel aus Nüchternwerten: HOMA-IR = (Nüchterninsulin [µU/ml] × Nüchternglukose [mmol/l]) / 22,5. Werte > 2,5 gelten als Hinweis auf Insulinresistenz. Einfach durchführbar, aber weniger präzise als der Hyperinsulinämisch-euglykämische Clamp (Goldstandard).",
        difficulty = 4,
        funFact = "HOMA-IR korreliert auch mit dem Risiko für NAFLD, Polyzystisches Ovarialsyndrom (PCOS) und kardiovaskuläre Erkrankungen — Insulinresistenz ist ein übergreifender metabolischer Risikofaktor."
    ),

    // Question 37 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Magenerkrankung führt zu einem Vitamin B12-Mangel durch fehlenden Intrinsic Factor?",
        answerA = "Autoimmune atrophische Gastritis (Typ-A-Gastritis) mit Antikörpern gegen Parietalzellen",
        answerB = "Helicobacter-pylori-Gastritis (Typ-B)",
        answerC = "NSAID-induzierte Gastritis",
        answerD = "Alkoholtoxische Gastritis",
        correctAnswer = 0,
        explanation = "Autoimmune atrophische Gastritis (Typ A) betrifft den Magenfundus: Antikörper gegen Parietalzellen und gegen Intrinsic Factor zerstören Parietalzellen. Ohne Intrinsic Factor kann terminales Ileum Vitamin B12 nicht absorbieren → Perniziöse Anämie (makrozytäre, megaloblastäre Anämie). Behandlung: parenterale B12-Gabe (Injektion), da orales B12 nicht absorbiert wird.",
        difficulty = 4,
        funFact = "Metformin (Erstlinienmedikament bei Typ-2-Diabetes) hemmt die B12-Absorption im terminalen Ileum — ca. 30 % der Langzeit-Metformin-Patienten entwickeln einen B12-Mangel, der oft unerkannt bleibt."
    ),

    // Question 38 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Effekt erklärt, warum Ballaststoffe den Blutzuckerspiegel senken?",
        answerA = "Ballaststoffe binden Insulin und verlangsamen dessen Abbau",
        answerB = "Lösliche Ballaststoffe bilden ein Gel im Darm, das die Glukoseabsorption verlangsamt und die intestinale Transitzeit erhöht",
        answerC = "Ballaststoffe aktivieren GLUT4-Transporter in Muskelzellen direkt",
        answerD = "Ballaststoffe hemmen die Amylase und reduzieren so die Stärkespaltung vollständig",
        correctAnswer = 1,
        explanation = "Lösliche Ballaststoffe (Pektin, Beta-Glucan, Psyllium) bilden im Dünndarm eine viskose Gelmatrix, die die Diffusion von Glukose zur Darmwand verlangsamt und die Magenentleerung verzögert. Dadurch flacht der postprandiale Blutzuckeranstieg ab. Unlösliche Ballaststoffe (Cellulose) fördern hauptsächlich die Darmmotilität.",
        difficulty = 4,
        funFact = "Beta-Glucan aus Hafer ist so wirksam bei der Blutzuckerkontrolle, dass die EU-Kommission eine Health-Claim-Zulassung erteilt hat: 3 g Beta-Glucan/Tag reduzieren nachweislich den postprandialen Blutzucker."
    ),

    // Question 39 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist die Ursache der Hyperhomocysteinämie und welche Vitamine sind zur Therapie essenziell?",
        answerA = "Erhöhte Methioninzufuhr aus tierischem Protein; Therapie mit Vitamin C",
        answerB = "Fehlende Transsulfurierung durch Vitamin-A-Mangel; Therapie mit Retinol",
        answerC = "Mangel an Folsäure, Vitamin B6 und B12, die als Cofaktoren im Homocystein-Remethylierungs- und Transsulfurierungsweg benötigt werden",
        answerD = "Überschüssige Histidinzufuhr; Therapie mit Zink",
        correctAnswer = 2,
        explanation = "Homocystein entsteht beim Methioninabbau. Remethylierung (Homocystein → Methionin): benötigt MTHFR + Methylen-THF (Folsäure) + Vitamin B12. Transsulfurierung (Homocystein → Cystein): benötigt Cystathionin-Beta-Synthase + Vitamin B6. Mangel an Folsäure, B6 oder B12 führt zu Homocysteinakkumulation mit erhöhtem kardiovaskulärem und thrombotischem Risiko.",
        difficulty = 4,
        funFact = "Die MTHFR-C677T-Genvariante (bei ca. 10 % der Europäer homozygot) reduziert die Enzymaktivität um 70 % — Betroffene haben erhöhte Homocysteinwerte und profitieren besonders von Folsäuresupplementierung."
    ),

    // Question 40 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen essentiellen und nicht-essentiellen Aminosäuren?",
        answerA = "Essentielle Aminosäuren sind nur in tierischen, nicht-essentielle nur in pflanzlichen Proteinen vorhanden",
        answerB = "Essentielle Aminosäuren werden für die Proteinsynthese benötigt, nicht-essentielle nicht",
        answerC = "Essentielle Aminosäuren können aus nicht-essentiellen synthetisiert werden, nicht-essentielle nicht",
        answerD = "Essentielle Aminosäuren kann der Körper nicht ausreichend selbst synthetisieren und müssen über die Nahrung zugeführt werden",
        correctAnswer = 3,
        explanation = "Essentielle Aminosäuren (8–9 beim Erwachsenen: His, Ile, Leu, Lys, Met, Phe, Thr, Trp, Val) kann der menschliche Körper nicht ausreichend selbst synthetisieren und müssen mit der Nahrung zugeführt werden. Bedingt essentielle Aminosäuren (z.B. Arginin, Glutamin) sind unter Stressbedingungen (Sepsis, Verbrennung) essentiell, weil die körpereigene Synthese den Bedarf nicht deckt.",
        difficulty = 4,
        funFact = "Lysin ist die limitierende Aminosäure in Getreideprodukten — Quinoa ist deshalb besonders wertvoll, weil es alle 9 essentiellen Aminosäuren in ausgewogenem Verhältnis enthält und als 'vollständiges Protein' gilt."
    ),

    // Question 41 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Hormon stimuliert den Appetit und steigt vor dem Essen an?",
        answerA = "Ghrelin (produziert im Magenfundus)",
        answerB = "Leptin",
        answerC = "Cholecystokinin (CCK)",
        answerD = "Peptid YY (PYY)",
        correctAnswer = 0,
        explanation = "Ghrelin ist das einzige bekannte orexigene (appetitstimulierende) Darmhormon. Es wird im Magenfundus gebildet und steigt präprandial an. Nach dem Essen fällt es ab. Leptin (aus Fettgewebe), CCK und PYY sind sättigende Hormone. Bei Schlafentzug steigt Ghrelin an und Leptin fällt — ein Mechanismus für ernährungsrelevante Schlafeffekte.",
        difficulty = 4,
        funFact = "Ghrelin wurde erst 1999 entdeckt — ironischerweise wurde es zunächst als Wachstumshormon-Sekretions-stimulierendes Peptid identifiziert, bevor seine Hungerrolle bekannt wurde."
    ),

    // Question 42 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches ist das klinisch etablierte Bewertungssystem für den Ernährungszustand in Krankenhäusern (NRS-2002)?",
        answerA = "Messung von Albumin und Präalbumin im Serum",
        answerB = "Nutritional Risk Screening mit BMI, Gewichtsverlust, Nahrungsaufnahme und Krankheitsschwere",
        answerC = "Anthropometrische Messung von Taillenumfang und Körperfettanteil",
        answerD = "Bioelektrische Impedanzanalyse der Phasenwinkel",
        correctAnswer = 1,
        explanation = "Der NRS-2002 (Nutritional Risk Screening 2002, Kondrup et al.) erfasst: Nahrungsaufnahme (0–3 Punkte), Gewichtsverlust/BMI (0–3 Punkte) und Krankheitsschwere (0–3 Punkte). Gesamtscore ≥ 3: Mangelernährungsrisiko → Ernährungstherapie indiziert. Validiert für stationäre Patienten und von ESPEN empfohlen.",
        difficulty = 4,
        funFact = "Mangelernährung im Krankenhaus betrifft je nach Studie 20–60 % der stationären Patienten, erhöht Komplikationsrate, Liegedauer und Mortalität — und wird trotzdem im Klinikalltag häufig übersehen."
    ),

    // Question 43 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher Mechanismus erklärt die Wirkung von Statinen auf den Cholesterinstoffwechsel?",
        answerA = "Hemmung der LDL-Rezeptor-Expression in Hepatozyten",
        answerB = "Beschleunigung des LDL-Abbaus durch Aktivierung von PCSK9",
        answerC = "Kompetitive Hemmung der HMG-CoA-Reduktase → Kompensatorische Hochregulation von LDL-Rezeptoren in der Leber",
        answerD = "Blockade der intestinalen Cholesterinabsorption durch NPC1L1-Hemmung",
        correctAnswer = 2,
        explanation = "Statine hemmen kompetitiv die HMG-CoA-Reduktase (Schlüsselenzym der Cholesterinbiosynthese). Dadurch sinkt die intrahepatische Cholesterinkonzentration → Hepatozyten hochregulieren LDL-Rezeptoren kompensatorisch → mehr LDL wird aus dem Blut aufgenommen → LDL-Spiegel sinkt. PCSK9-Inhibitoren (Alirocumab, Evolocumab) haben einen anderen Mechanismus: Sie verhindern LDL-Rezeptor-Abbau.",
        difficulty = 4,
        funFact = "Die Entdeckung der HMG-CoA-Reduktase durch Akira Endo 1971 aus dem Schimmelpilz Penicillium citrinum führte zu den Statinen — heute das meistverkaufte Medikament der Welt und eines der Leben rettenden Therapeutika des 20. Jahrhunderts."
    ),

    // Question 44 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sarcopenic Obesity' und warum ist sie klinisch besonders gefährlich?",
        answerA = "Adipositas bei gleichzeitiger Unterernährung durch Mangelernährung trotz hoher Kalorienzufuhr",
        answerB = "Altersassoziierter Muskelabbau ohne begleitendes Übergewicht",
        answerC = "Erhöhter intramuskulärer Fettgehalt durch Insulinresistenz in jungen Erwachsenen",
        answerD = "Gleichzeitiges Vorliegen von erhöhtem Körperfett und verminderter Muskelmasse/-funktion mit synergistisch erhöhtem Risiko für Diabetes, Herzerkrankungen und Pflegebedürftigkeit",
        correctAnswer = 3,
        explanation = "Sarcopenic Obesity kombiniert die Risiken beider Zustände synergistisch: Erhöhtes Fettgewebe (Inflammation, Insulinresistenz) plus verringerte Muskelmasse (reduzierter Grundumsatz, schlechte Glukoseutilisation, Sturzrisiko). Risiko für Metabolisches Syndrom, Typ-2-Diabetes und funktionelle Einschränkungen ist höher als bei reiner Adipositas oder Sarkopenie allein.",
        difficulty = 4,
        funFact = "Bei 'normalgewichtigen' älteren Menschen ist Sarcopenic Obesity häufig: BMI normal, aber Muskelmasse altersbedingt reduziert und durch Fett ersetzt — das 'skinny fat'-Problem des Alters."
    ),

    // Question 45 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Vitamin wird ausschließlich in tierischen Produkten gefunden und ist für Veganer essenziell zu supplementieren?",
        answerA = "Vitamin B12 (Cobalamin)",
        answerB = "Vitamin D3 (Cholecalciferol)",
        answerC = "Vitamin K2 (Menachinon-7)",
        answerD = "Vitamin A (Retinol, als Retinol nur tierisch; Provitamin A in Pflanzen)",
        correctAnswer = 0,
        explanation = "Vitamin B12 wird ausschließlich von Mikroorganismen synthetisiert und kommt in natürlichen Lebensmitteln nur in tierischen Produkten vor (Fleisch, Fisch, Eier, Milch). Algen wie Chlorella enthalten zwar B12-ähnliche Verbindungen, aber keine biologisch aktiven Formen in ausreichender Menge. DGE und alle großen Ernährungsgesellschaften empfehlen B12-Supplementierung für Veganer.",
        difficulty = 4,
        funFact = "Vitamin D3 kommt auch in pflanzlichen Quellen (Flechten, UVB-behandelte Pilze) vor, ist aber nicht ausschließlich tierisch — Algen und Flechten können D3 synthetisieren. Deshalb ist D2 (pflanzlich) vs. D3 (tierisch/UVB) kein veganes Ausschlusskriterium wie B12."
    ),

    // Question 46 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Konzept beschreibt der Begriff 'Epigenetische Programmierung' in der perinatalen Ernährungsforschung?",
        answerA = "Genetische Mutationen durch Mangelernährung während der Schwangerschaft",
        answerB = "Dauerhafte Veränderungen der Genexpression durch Methylierungsmuster, die durch Ernährung in der frühen Kindheit oder im Uterus beeinflusst werden",
        answerC = "Vererbte Nahrungsmittelallergien durch Antikörpertransfer über die Muttermilch",
        answerD = "Angeborene Geschmackspräferenzen durch fetale Exposition gegenüber Aromen im Fruchtwasser",
        correctAnswer = 1,
        explanation = "Epigenetische Programmierung (auch 'fetal programming' nach Barker) beschreibt, wie Ernährungsdefizite oder -überschüsse in kritischen Entwicklungsphasen (intrauterin, Stillzeit) Methylierungsmuster der DNA dauerhaft verändern. Diese epigenetischen Markierungen beeinflussen Genexpression lebenslang und erhöhen Risiko für Metabolisches Syndrom, Adipositas und Typ-2-Diabetes im Erwachsenenalter.",
        difficulty = 4,
        funFact = "Die Holländer-Hungerwinter-Kinder (1944/45) wurden intensiv erforscht: Föten, die den Hunger im 1. Trimester erlebten, hatten 50 Jahre später erhöhte Raten von Adipositas und Herzerkrankungen — epigenetisch programmiert durch pränatale Unterernährung."
    ),

    // Question 47 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Ernährungsstrategie ist bei chronischer Niereninsuffizienz (CKD Stadium 3–4) zur Progressionsverlangsamung evidenzbasiert?",
        answerA = "Hochproteindiät (> 1,5 g/kg/Tag) zur Muskelmasserhaltung",
        answerB = "Phosphatreiche Ernährung zur Knochengesundheit",
        answerC = "Proteinrestriktion (0,6–0,8 g/kg/Tag) zur Reduktion der Stickstoff-Urämietoxin-Last und Verlangsamung des GFR-Abfalls",
        answerD = "Erhöhter Kaliumkonsum zur Blutdrucksenkung",
        correctAnswer = 2,
        explanation = "Bei CKD Stadium 3–4 empfiehlt KDOQI/ESPEN eine moderate Proteinrestriktion (0,6–0,8 g/kg/Tag ideal): weniger Harnstoff und Urämietoxine, geringere Hyperfiltration der restlichen Nephrone, langsamerer GFR-Abfall. Gleichzeitig: Phosphatrestriktion (sekundärer Hyperparathyreoidismus), Kaliumrestriktion bei Hyperkaliämie, Natriumreduktion für Blutdruckkontrolle.",
        difficulty = 4,
        funFact = "Die 'low-protein diet'-Debatte in der Nephrologie dauert seit 50 Jahren an — die MDRD-Studie von 1994 zeigte nur marginalen Nutzen, aber neuere Daten und konsistente pathophysiologische Argumente unterstützen die Strategie."
    ),

    // Question 48 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Labortest ist der Goldstandard zur Diagnose einer Nahrungsmittelallergie?",
        answerA = "Bestimmung von spezifischem IgE im Serum (RAST)",
        answerB = "Pricktest mit Nahrungsmittelextrakten",
        answerC = "Basophilen-Aktivierungstest (BAT)",
        answerD = "Oraler Nahrungsmittelprovokationstest (DBPCFC — Double Blind Placebo Controlled Food Challenge)",
        correctAnswer = 3,
        explanation = "Der DBPCFC (doppelblinder, placebokontrollierter Nahrungsmittelprovokationstest) ist der diagnostische Goldstandard für IgE-vermittelte und nicht-IgE-vermittelte Nahrungsmittelallergien. IgE-Tests und Pricktest haben hohe falsch-positive Raten (Sensibilisierung ≠ klinische Allergie). Der DBPCFC minimiert Erwartungs- und Placeboeffekte und quantifiziert die individuelle Reaktionsschwelle.",
        difficulty = 4,
        funFact = "Ca. 20 % der Bevölkerung glaubt, an einer Nahrungsmittelallergie zu leiden — bei DBPCFC-Tests lässt sich jedoch nur bei 2–4 % eine echte allergische Reaktion bestätigen. Viele selbst diagnostizierte 'Allergien' sind Intoleranzen oder psychogene Reaktionen."
    ),

    // Question 49 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches ist das Hauptmerkmal der 'Protein-Energie-Malnutrition' vom Kwashiorkor-Typ im Vergleich zum Marasmus?",
        answerA = "Protein selektiver Mangel bei ausreichender Energiezufuhr, mit typischen Ödemen durch Hypoalbuminämie",
        answerB = "Totaler Nahrungsentzug mit ausgeprägtem Muskel- und Fettabbau ohne Ödeme",
        answerC = "Vitamin-A-Mangel mit Nachtblindheit und Keratomalazie",
        answerD = "Eisenmangel mit makrozytärer Anämie und neurologischen Symptomen",
        correctAnswer = 0,
        explanation = "Kwashiorkor: vorwiegend Proteinmangel bei relativem Energieüberschuss (z.B. kohlenhydratreiche, proteinarme Ernährung). Kennzeichen: Ödeme durch Hypoalbuminämie (geschwollener Bauch), Fettleber, Hautveränderungen, Apathie. Marasmus: generelle Unterernährung (Kalorien + Protein) → Kachexie ohne Ödeme. Mischformen sind häufig.",
        difficulty = 4,
        funFact = "Der Begriff 'Kwashiorkor' stammt aus der ghanaischen Ga-Sprache und bedeutet 'Krankheit des verdrängten Kindes' — traditionell bei der Geburt eines Geschwisterkindes, wenn das ältere Kind von der Muttermilch (proteinreich) auf Hirsebrei (proteinarm) umgestellt wurde."
    ),

    // Question 50 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche Aussage zur Omega-3/Omega-6-Fettsäure-Balance in der modernen westlichen Ernährung ist korrekt?",
        answerA = "Das moderne Verhältnis von Omega-6 zu Omega-3 beträgt etwa 2:1 — nahe dem evolutionären Optimum",
        answerB = "Das moderne Verhältnis liegt bei 15–20:1 statt dem evolutionären ~4:1, was proinflammatorische Arachidonsäuremetaboliten begünstigt",
        answerC = "Omega-3 und Omega-6 konkurrieren nicht um dieselben Enzyme, daher ist das Verhältnis klinisch irrelevant",
        answerD = "Omega-6-Fettsäuren aus Pflanzenölen sind antiinflammatorisch und sollten maximiert werden",
        correctAnswer = 1,
        explanation = "Omega-6 (Linolsäure, Arachidonsäure) und Omega-3 (EPA, DHA) konkurrieren um dieselben Enzyme (Delta-6-Desaturase, COX, LOX). Hohe Omega-6-Zufuhr (Sonnenblumen-, Maiskeimöl) verschiebt das Verhältnis stark zugunsten proinflammatorischer Eicosanoide aus Arachidonsäure. Die westliche Ernährung hat ein Verhältnis von 15–20:1 (Omega-6:Omega-3), das evolutionäre Optimum liegt bei 1–4:1.",
        difficulty = 4,
        funFact = "Grönländische Inuit haben trotz hochkalorischer, fettreicher Ernährung extrem niedrige Herzkrankheitsraten — was 1971 von Bang und Dyerberg untersucht wurde und zur Entdeckung der kardioprotektiven Wirkung von Omega-3-Fettsäuren führte."
    )

)
