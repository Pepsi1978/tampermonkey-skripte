package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert1(): List<Question> = listOf(

    // ── PASTEURISIERUNG & ERHITZUNGSVERFAHREN ─────────────────────────────────

    // Question 1 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Bei der Kurzzeiterhitzung (KZE) von Milch wird diese auf 72–75 °C erhitzt. Wie lange muss die Milch bei dieser Temperatur gehalten werden, um den gesetzlichen Anforderungen zu genügen?",
        answerA = "5 Sekunden",
        answerB = "15 Sekunden",
        answerC = "45 Sekunden",
        answerD = "2 Minuten",
        correctAnswer = 1,
        explanation = "Die Kurzzeiterhitzung (HTST: High Temperature Short Time) hält Milch mindestens 15 Sekunden bei 72–75 °C. Diese Kombination aus Temperatur und Zeit reicht aus, um Mykobacterium tuberculosis und andere pathogene Keime um mindestens 5 log-Stufen zu reduzieren, ohne den Geschmack wesentlich zu beeinflussen.",
        difficulty = 4,
        funFact = "Louis Pasteur entwickelte das Pasteurisierungsprinzip 1864 zunächst für Wein und Bier — erst später wurde es auf Milch angewendet."
    ),

    // Question 2 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der 'D-Wert' (Dezimalreduktionswert) in der thermischen Lebensmittelkonservierung?",
        answerA = "Die Mindesttemperatur, bei der alle Sporen eines Keims abgetötet werden",
        answerB = "Die Zeit in Minuten bei einer bestimmten Temperatur, die nötig ist, um 90 % (1 log-Stufe) der Keimpopulation zu reduzieren",
        answerC = "Die Temperatur, bei der 50 % aller Mikroorganismen innerhalb von 1 Minute abgetötet werden",
        answerD = "Der Temperaturunterschied zwischen Pasteurisierung und Sterilisation",
        correctAnswer = 1,
        explanation = "Der D-Wert (Decimal Reduction Time) beschreibt die Zeit bei konstanter Temperatur, die erforderlich ist, um eine Keimpopulation um den Faktor 10 (1 Dekade / log-Stufe) zu reduzieren. Ein D₁₂₁-Wert von 0,2 min für Clostridium botulinum bedeutet: Bei 121 °C dauert es 0,2 min, um 90 % der Sporen abzutöten.",
        difficulty = 4,
        funFact = "Für kommerzielle Sterilität bei Dosenkonserven wird ein 12-D-Prozess (Botulinum-Koch) angestrebt — eine 10¹²-fache Reduktion von C. botulinum-Sporen."
    ),

    // Question 3 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der 'z-Wert' im Zusammenhang mit der Hitzeresistenz von Mikroorganismen?",
        answerA = "Die pH-Änderung, die nötig ist, um den D-Wert um 90 % zu senken",
        answerB = "Die Temperaturerhöhung in °C, die nötig ist, um den D-Wert um eine log-Stufe (Faktor 10) zu reduzieren",
        answerC = "Die Zeit in Stunden, bis ein Lebensmittel nach dem Öffnen verderben kann",
        answerD = "Der Zuckergehalt in Prozent, ab dem Osmose als Konservierungseffekt wirkt",
        correctAnswer = 1,
        explanation = "Der z-Wert ist ein Maß für die Temperaturabhängigkeit der Hitzeresistenz: Er gibt an, um wie viel Grad Celsius die Temperatur steigen muss, damit der D-Wert um den Faktor 10 sinkt (Keime also 10-mal schneller absterben). Für C. botulinum-Sporen beträgt er typischerweise 10 °C.",
        difficulty = 4,
        funFact = "z- und D-Wert zusammen ermöglichen die Berechnung von F-Werten — damit kann man verschiedene Sterilisationsprogramme rechnerisch vergleichen."
    ),

    // Question 4 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher physikalische Prozess macht UHT-Milch bei ungeöffneter Lagerung ohne Kühlung monatelang haltbar?",
        answerA = "Vollständige Sterilisation aller Keime und Sporen, gefolgt von aseptischer Abfüllung in sterile Mehrschichtkartons",
        answerB = "Zugabe von Konservierungsstoffen (Sorbinsäure E 200) direkt nach der Erhitzung",
        answerC = "Vakuumversiegelung, die den Sauerstoff vollständig entfernt",
        answerD = "Chemische Modifikation von Milchproteinen durch die Ultrahocherhitzung",
        correctAnswer = 0,
        explanation = "UHT-Milch wird bei 135–150 °C für 2–8 Sekunden ultrahocherhitzt (kommerzielle Sterilität), sodass alle vegetativen Keime und die meisten Sporen abgetötet werden. Direkt danach erfolgt die aseptische Abfüllung in sterilisierte Verbundkartons (Tetra Pak). Durch die Keimfreiheit und die luftdichte Verpackung bleibt die Milch ungeöffnet 6–12 Wochen bei Raumtemperatur haltbar.",
        difficulty = 4,
        funFact = "Aseptische Abfüllsysteme wurden in den 1950er Jahren von Ruben Rausing (Tetra Pak) entwickelt und revolutionierten die Milchversorgung in Entwicklungsländern ohne Kühlkette."
    ),

    // Question 5 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Pasteurisierung' und 'Sterilisation' nach dem F-Wert-Konzept?",
        answerA = "Pasteurisierung erreicht einen F₀-Wert von ≥ 3, Sterilisation einen F₀-Wert von ≥ 12",
        answerB = "Es gibt keinen Unterschied im Ergebnis — nur in der Geschwindigkeit des Prozesses",
        answerC = "Pasteurisierung zielt auf vegetative Keime bei unter 100 °C; Sterilisation erreicht F₀ ≥ 3 (äquivalent zu 3 min bei 121 °C) und tötet auch hitzeresistente Sporen",
        answerD = "Pasteurisierung verwendet feuchte Hitze, Sterilisation trockene Hitze bei 160 °C",
        correctAnswer = 2,
        explanation = "Der F₀-Wert (F-Wert bei Referenztemperatur 121 °C, z = 10 °C) quantifiziert die letale Wirkung einer Hitzebehandlung auf C. botulinum-Sporen. Pasteurisierung < 100 °C tötet vegetative Keime, erreicht aber F₀ << 1. Sterilisation fordert F₀ ≥ 3 (12-D-Prozess), um kommerzielle Sterilität zu garantieren.",
        difficulty = 4,
        funFact = null
    ),

    // ── GEFRIERTROCKNUNG & PHYSIKALISCHE KONSERVIERUNG ────────────────────────

    // Question 6 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Die Gefriertrocknung (Lyophilisation) besteht aus drei Phasen. Welche Reihenfolge ist korrekt?",
        answerA = "Sublimationstrocknung → Einfrieren → Desorptionstrocknung",
        answerB = "Einfrieren → Primärtrocknung (Sublimation) → Sekundärtrocknung (Desorption)",
        answerC = "Vortrocknung → Einfrieren → Vakuumsublimation",
        answerD = "Einfrieren → Desorptionstrocknung → Primärtrocknung",
        correctAnswer = 1,
        explanation = "Phase 1: Einfrieren des Produkts auf −40 bis −55 °C (Eiskristalle bilden sich). Phase 2: Primärtrocknung — unter Vakuum (< 1 mbar) sublimiert das Eis direkt zu Wasserdampf (ca. 95 % des Wassers werden entfernt). Phase 3: Sekundärtrocknung — adsorbiertes, nicht gefrorenes Restwasser wird durch leichte Erwärmung und weitergehendes Vakuum auf < 5 % Restfeuchte gebracht.",
        difficulty = 4,
        funFact = "Gefriergetrocknete Lebensmittel können ohne Kühlung 20–30 Jahre haltbar sein — Notfallvorräte der NASA und des US-Militärs nutzen dieses Prinzip."
    ),

    // Question 7 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Warum ist der Tripelpunkt von Wasser (0,01 °C, 6,1 mbar) für die Gefriertrocknung entscheidend?",
        answerA = "Unterhalb des Tripelpunkts kann Wasser nur als Eis oder Dampf existieren, nie als Flüssigkeit — Sublimation ist möglich",
        answerB = "Oberhalb des Tripelpunkts sublimiert Wasser am schnellsten",
        answerC = "Am Tripelpunkt friert Wasser sofort, was Eiskristallschäden verhindert",
        answerD = "Der Tripelpunkt definiert die maximale Lagertemperatur für gefriergetrocknete Produkte",
        correctAnswer = 0,
        explanation = "Der Tripelpunkt ist der einzige Zustandspunkt, an dem Eis, flüssiges Wasser und Wasserdampf gleichzeitig existieren können. Unterhalb des Tripelpunkts (Druck < 6,1 mbar und Temperatur < 0,01 °C) existiert kein flüssiges Wasser — Eis sublimiert direkt zu Dampf. Die Gefriertrocknung arbeitet bewusst unterhalb dieses Punktes.",
        difficulty = 4,
        funFact = null
    ),

    // Question 8 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Collapse Temperature' (Kollapsteperatur) bei der Gefriertrocknung?",
        answerA = "Die maximale Lagertemperatur des fertig getrockneten Produkts",
        answerB = "Die kritische Temperatur, oberhalb derer die gefrorene Matrix kollabiert und das Produkt seine poröse Struktur verliert",
        answerC = "Die Temperatur, bei der Eiskristalle zu wachsen beginnen und Zellwände durchstechen",
        answerD = "Der Siedepunkt des Lösungsmittels unter Vakuumbedingungen",
        correctAnswer = 1,
        explanation = "Die Kollapstemeratur (Tg') ist die kritische Grenze für die Primärtrocknung. Steigt die Produkttemperatur über diesen Wert, verliert die gefrorene amorphe Matrix ihre mechanische Stabilität — das Produkt kollabiert zu einer dichten, schlecht löslichen Masse statt der gewünschten porösen Struktur.",
        difficulty = 4,
        funFact = "Für Instant-Kaffee liegt die Kollapstemeratur typischerweise bei −25 bis −30 °C, weshalb die Primärtrocknung sehr sorgfältig temperaturkontrolliert wird."
    ),

    // Question 9 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Konservierungsmethode nutzt das Prinzip der 'Hürdentheorie' (Hurdle Technology) von Leistner?",
        answerA = "Ausschließlich hohe Temperaturen, um alle Hürden in einem Schritt zu überwinden",
        answerB = "Hochdruckpasteurisierung (HPP) als einzige physikalische Hürde",
        answerC = "Ausschließlich chemische Konservierungsstoffe in Kombination mit Vakuumverpackung",
        answerD = "Kombination mehrerer subletaler Faktoren (pH, aw, Temperatur, Redoxpotenzial), die zusammen Mikroorganismen hemmen, ohne jeden Einzelfaktor extrem zu setzen",
        correctAnswer = 3,
        explanation = "Die Hürdentheorie (Leistner, 1978) besagt, dass mehrere mittelstarke antimikrobielle Faktoren (Hürden) synergistisch wirken können: Eine Keimpopulation, die eine Hürde (z. B. niedriger pH) überwindet, ist bereits geschwächt und scheitert leichter an der nächsten (z. B. niedriger aw-Wert). Dies ermöglicht mildere Einzelbehandlungen und bessere sensorische Qualität.",
        difficulty = 4,
        funFact = "Fermentierte Wurst (Salami) ist ein klassisches Hürden-Produkt: Kombiniert werden Salzung (aw), Säuerung (pH), Räuchern (antimikrobielle Phenole), Trocknung und anoxische Bedingungen."
    ),

    // Question 10 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hochdruckpasteurisierung' (HPP) und welche Mikroorganismen werden NICHT abgetötet?",
        answerA = "HPP behandelt Lebensmittel mit 100–200 MPa; vegetative Keime überleben, Sporen werden abgetötet",
        answerB = "HPP ist identisch mit Autoklavierung bei 121 °C unter erhöhtem Druck",
        answerC = "HPP behandelt Lebensmittel mit 400–600 MPa; vegetative Keime und die meisten Viren werden abgetötet, aber hitzeresistente Bakteriensporen überleben",
        answerD = "HPP verwendet 1000–2000 MPa; ausschließlich Prionen werden nicht abgetötet",
        correctAnswer = 2,
        explanation = "HPP (auch Kaltpasteurisierung) behandelt verpackte Lebensmittel mit isostatischem Druck von 400–600 MPa bei Raumtemperatur. Die extreme Kompression zerstört Zellmembranen vegetativer Keime und denaturiert Virusproteine. Bakteriensporen (Endosporen) jedoch überstehen HPP, da deren Dehydratisierung und Proteinhülle Druckresistenz verleihen.",
        difficulty = 4,
        funFact = "Guacamole und Feinkostaufschnitte in den USA werden häufig per HPP konserviert — bei frischen Farben und Aromen ohne Konservierungsstoffe."
    ),

    // ── E-NUMMERN & LEBENSMITTELZUSATZSTOFFE ─────────────────────────────────

    // Question 11 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche E-Nummer trägt Sorbinsäure und gegen welche Keimgruppen wirkt sie vorwiegend?",
        answerA = "E 210; wirkt gegen Clostridium-Sporen durch pH-unabhängige Membranschädigung",
        answerB = "E 234; wirkt ausschließlich gegen grampositive Bakterien durch Hemmung der Zellwandsynthese",
        answerC = "E 252; wirkt gegen Salmonellen und Listerien durch Hemmung der DNA-Replikation",
        answerD = "E 200; wirkt gegen Hefen und Schimmelpilze, weniger gegen Bakterien, und ist am effektivsten bei pH < 6",
        correctAnswer = 3,
        explanation = "Sorbinsäure (E 200) und ihre Salze (Kaliumsorbat E 202, Natriumsorbat E 201) hemmen vorrangig Hefen und Schimmelpilze durch Störung der Fettsäure-Biosynthese und Membranpermeabilität. Da die undissoziierte Säure die Zelle penetriert, ist die antimikrobielle Wirkung pH-abhängig und am stärksten unter pH 6.",
        difficulty = 4,
        funFact = null
    ),

    // Question 12 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist Nisin (E 234) und warum ist es in der Lebensmitteltechnologie besonders wertvoll?",
        answerA = "Ein natürliches Peptid-Bacteriocin aus Lactococcus lactis, das grampositive Bakterien und Sporen durch Porenbildung in der Zellmembran hemmt",
        answerB = "Ein synthetisches Konservierungsmittel auf Basis von Benzoesäure, das Schimmelpilze hemmt",
        answerC = "Ein antioxidatives Polyphenol aus Rosmarin (E 392), das Fettranzigkeit verhindert",
        answerD = "Ein Emulgator aus Lecithin, der Schimmelpilzwachstum auf Käseoberflächen verhindert",
        correctAnswer = 0,
        explanation = "Nisin ist ein natürliches Lantibiotikum (Bacteriocin), das von Lactococcus lactis produziert wird. Es bindet an Lipid II, einen Vorläufer der Zellwandsynthese, und bildet Poren in der Zytoplasmamembran grampositiver Bakterien. Es hemmt u. a. Listeria monocytogenes, Staphylococcus aureus und C. botulinum-Sporen. Sein 'natürlicher' Ursprung macht es besonders interessant für Clean-Label-Produkte.",
        difficulty = 4,
        funFact = "Nisin wird seit 1953 kommerziell eingesetzt und gilt als das erste kommerzielle Bacteriocin in der Lebensmittelindustrie."
    ),

    // Question 13 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Funktion hat Natriumnitrit (E 250) bei Pökelfleisch über die antimikrobielle Wirkung hinaus?",
        answerA = "Es erhöht den Wassergehalt durch Bindung an Muskelproteine (Wasserbindungskapazität)",
        answerB = "Es senkt den aw-Wert durch osmotische Entwässerung des Fleisches",
        answerC = "Es reagiert mit Myoglobin zu stabilem Nitrosomyoglobin, das die charakteristische rote Pökelfarbe erzeugt und Fettoxidation hemmt",
        answerD = "Es aktiviert körpereigene Enzyme, die Kollagen zu Gelatine abbauen",
        correctAnswer = 2,
        explanation = "Nitrit (NO₂⁻) wird im sauren Milieu des Fleisches zu NO reduziert. NO reagiert mit Myoglobin zu Nitrosomyoglobin (rosa), das beim Erhitzen zu hitzestabilem Nitrosohämochrom (rötlich) wird — die typische Schinkenfarbe. Zusätzlich hemmt Nitrit die Fettsäure-Oxidation durch Chelatbildung mit Metallionen und wirkt stark gegen C. botulinum.",
        difficulty = 4,
        funFact = "Die ADI (Acceptable Daily Intake) für Nitrit beträgt laut EFSA 0,07 mg/kg Körpergewicht. Überschreitungen können Methämoglobinbildung verursachen."
    ),

    // Question 14 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Emulgator' und 'Stabilisator' nach EU-Lebensmittelrecht?",
        answerA = "Emulgatoren sind ausschließlich tierischen Ursprungs; Stabilisatoren sind synthetisch",
        answerB = "Emulgatoren ermöglichen die Bildung von Öl-Wasser-Emulsionen durch Amphiphilie; Stabilisatoren erhalten bereits gebildete Dispersionen (Emulsionen, Schäume) über Zeit aufrecht",
        answerC = "Stabilisatoren erhöhen die Viskosität; Emulgatoren senken sie unter pH 4",
        answerD = "Emulgatoren wirken ausschließlich in kalten Systemen; Stabilisatoren nur in heißen",
        correctAnswer = 1,
        explanation = "Emulgatoren (amphiphile Moleküle wie Lecithin E 322, Mono-/Diglyceride E 471) setzen die Grenzflächenspannung zwischen Öl und Wasser herab und ermöglichen so die initiale Emulsionsbildung. Stabilisatoren (z. B. Carrageen E 407, Xanthan E 415) erhöhen die Viskosität oder bilden Gelstrukturen, die die gebildeten Tröpfchen am Aufrahmen oder Koaleszieren hindern.",
        difficulty = 4,
        funFact = null
    ),

    // Question 15 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Reaktion macht Ascorbinsäure (E 300) zum wichtigsten Antioxidationsmittel in der Lebensmittelindustrie?",
        answerA = "Sie bildet stabile Chelate mit Eisen- und Kupferionen, die die Lipidoxidation katalysieren",
        answerB = "Sie senkt den pH-Wert, sodass Fettoxidations-Enzyme inaktiviert werden",
        answerC = "Sie polymerisiert mit Fettsäureketten zu stabilen Komplexen, die nicht ranzig werden können",
        answerD = "Sie wird bevorzugt durch Radikale und Sauerstoff oxidiert (geopfert), regeneriert dabei Tocopherole und schützt so andere Lebensmittelinhaltsstoffe vor oxidativem Verderb",
        correctAnswer = 3,
        explanation = "Ascorbinsäure (Vitamin C) wirkt als Reduktionsmittel: Es gibt ein Elektron an Radikale oder Sauerstoff ab und wird dabei zunächst zu Ascorbylradikal, dann zu Dehydroascorbinsäure oxidiert. Dieser Opfer-Mechanismus schützt empfindlichere Moleküle (Fette, Aromen, Vitamine). Zusätzlich regeneriert Ascorbinsäure oxidiertes Tocopherol (Vitamin E) zurück zur aktiven Form.",
        difficulty = 4,
        funFact = "Die Kombination von Ascorbinsäure (E 300) und Tocopherol (E 306–309) wirkt synergistisch: Man spricht von einem regenerativen Antioxidationssystem."
    ),

    // ── FERMENTATION & MIKROBIELLE KONSERVIERUNG ──────────────────────────────

    // Question 16 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet homofermentative von heterofermentativen Milchsäurebakterien (LAB)?",
        answerA = "Homofermentative LAB produzieren ausschließlich Milchsäure (via Embden-Meyerhof-Parnas-Weg); heterofermentative LAB produzieren zusätzlich Ethanol, CO₂ und Essigsäure (via Phosphoketolase-Weg)",
        answerB = "Homofermentative LAB benötigen Sauerstoff; heterofermentative sind strikt anaerob",
        answerC = "Homofermentative LAB fermentieren nur Glucose; heterofermentative fermentieren auch Fette",
        answerD = "Der Begriff 'homofermentativ' bezieht sich auf die Verwendung eines einzigen Substrats; 'heterofermentativ' auf mehrere Substrate gleichzeitig",
        correctAnswer = 0,
        explanation = "Homofermentative LAB (z. B. Lactobacillus delbrueckii, Streptococcus thermophilus) nutzen den EMP-Weg und produzieren fast ausschließlich Milchsäure aus Glucose (Ausbeute ~2 mol Lactat/mol Glucose). Heterofermentative LAB (z. B. Leuconostoc mesenteroides, Lactobacillus fermentum) verwenden den Phosphoketolase-Weg und produzieren je 1 mol Lactat, 1 mol Ethanol und 1 mol CO₂ pro mol Glucose.",
        difficulty = 4,
        funFact = "Sauerkraut nutzt beide Typen: Zunächst starten heterofermentative LAB (Leuconostoc mesenteroides, erzeugen CO₂ für Anaerobiose), dann dominieren homofermentative (Lactobacillus plantarum)."
    ),

    // Question 17 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welcher biochemische Mechanismus erklärt, warum fermentierte Lebensmittel mit niedrigem pH (≤ 4,6) für C. botulinum sicher sind?",
        answerA = "Säure denaturiert das Botulinum-Toxin irreversibel",
        answerB = "Milchsäure bildet kovalente Bindungen mit den Sporenprotein-Hüllen und verhindert die Keimung",
        answerC = "Bei pH ≤ 4,6 können C. botulinum-Sporen nicht auskeimen und vegetative Zellen nicht wachsen, da der interne pH unter das Wachstumsminimum fällt",
        answerD = "Unter pH 4,6 ist der aw-Wert physikalisch immer unter 0,93, was Wachstum verhindert",
        correctAnswer = 2,
        explanation = "C. botulinum hat eine pH-Wachstumsuntergrenze von ca. 4,6–4,8. Unter diesem Wert können die Sporen nicht auskeimen (Germination gehemmt), und selbst wenn vegetative Zellen vorhanden wären, würde der interne pH sinken und Enzymfunktionen hemmen. Dies ist der Grund, warum niedrig-saure Konserven (pH > 4,6) sterilisiert werden müssen, hochsaure (pH ≤ 4,6) wie Tomatenprodukte aber nur pasteurisiert werden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 18 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist SCOBY bei der Kombucha-Fermentation und welche Mikroorganismen bilden ihn?",
        answerA = "Ein Synbiotikum aus Lactobacillus acidophilus und Bifidobacterium bifidum",
        answerB = "Ein reines Schimmelpilz-Mycel aus Aspergillus niger und Penicillium camemberti",
        answerC = "Eine Mischkultur aus Streptococcus thermophilus und Lactobacillus bulgaricus in Gelatine",
        answerD = "Eine symbiotische Kultur aus Essigsäurebakterien (z. B. Acetobacter, Gluconobacter) und Hefen (z. B. Brettanomyces, Zygosaccharomyces), eingebettet in eine Bakteriencellulose-Matrix",
        correctAnswer = 3,
        explanation = "SCOBY (Symbiotic Culture of Bacteria and Yeast) ist ein gummiartiger Biofilm aus Bakteriencellulose, produziert von Acetobacter- und Gluconobacter-Arten. Hefen (v. a. Brettanomyces bruxellensis, Zygosaccharomyces bailii) vergären Saccharose zu Ethanol, das die Essigsäurebakterien dann zu Essigsäure oxidieren.",
        difficulty = 4,
        funFact = "Die Bakteriencellulose des SCOBY hat eine Faserdicke von 3–4 nm — feiner als Baumwollfaser — und besitzt eine sehr hohe Wasserhaltekapazität."
    ),

    // Question 19 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Enzym produziert Aspergillus oryzae (Koji-Schimmel) und warum ist er für die japanische Küche unentbehrlich?",
        answerA = "Rennin (Chymosin) — für die Käseherstellung aus Sojamilch",
        answerB = "Amylasen und Proteasen — er saccharifiziert Stärke zu vergärbaren Zuckern und spaltet Proteine für Umami in Miso, Sojasauce und Sake",
        answerC = "Lipasen — er emulgiert Fette in fermentiertem Tofu",
        answerD = "Pektinase — er klärt Reiswein durch Abbau von Pektinen",
        correctAnswer = 1,
        explanation = "Aspergillus oryzae (Koji) produziert reichlich α-Amylase (spaltet Stärke zu Maltose und Glucose) und Proteasen (spalten Proteine zu Peptiden und freien Aminosäuren, insbesondere Glutamat). Diese Enzyme ermöglichen erst die Alkoholgärung in Sake und erzeugen den intensiven Umami-Geschmack in Miso und Sojasauce.",
        difficulty = 4,
        funFact = "Aspergillus oryzae wurde vom japanischen Bildungsministerium 2006 offiziell als 'nationaler Schimmelpilz' (Kokkin) Japans anerkannt."
    ),

    // Question 20 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der aw-Wert (Wasseraktivität) und bei welchem Wert wird das Wachstum von Schimmelpilzen allgemein verhindert?",
        answerA = "Der aw-Wert ist der Quotient aus dem Dampfdruck des Lebensmittels und dem des reinen Wassers bei gleicher Temperatur; die meisten Schimmelpilze wachsen nicht mehr unter aw 0,70–0,80",
        answerB = "Der aw-Wert ist das Verhältnis von gebundenem zu freiem Wasser; Schimmelpilze werden unter aw 0,95 gestoppt",
        answerC = "Der aw-Wert misst den Gesamtwassergehalt in Prozent; unter 15 % Wassergehalt stoppen alle Keime",
        answerD = "Der aw-Wert ist ein pH-äquivalentes Maß; unter aw 1,5 stoppt Schimmelwachstum",
        correctAnswer = 0,
        explanation = "Der aw-Wert (water activity) ist dimensionslos (0–1,0) und beschreibt die 'freie', für Mikroorganismen verfügbare Wassermenge. Reines Wasser hat aw = 1,0. Xerophile Schimmelpilze (z. B. Aspergillus glaucus) können noch bei aw 0,70–0,75 wachsen; die meisten anderen Schimmelpilze benötigen aw > 0,80; Hefen > 0,88; Bakterien > 0,90–0,91.",
        difficulty = 4,
        funFact = null
    ),

    // ── LEBENSMITTELCHEMIE & REAKTIONEN ───────────────────────────────────────

    // Question 21 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist Acrylamid in Lebensmitteln und bei welcher Reaktion entsteht es hauptsächlich?",
        answerA = "Ein natürlicher Bitterstoff in Kreuzblütlern; entsteht durch enzymatische Hydrolyse von Glucosinolaten",
        answerB = "Ein Abbauprodukt von Nitrit in gepökeltem Fleisch über 200 °C",
        answerC = "Ein synthetischer Emulgator, der sich bei Backtemperaturen aus Mono-/Diglyceriden bildet",
        answerD = "Eine potentiell krebserregende Verbindung, die bei der Maillard-Reaktion zwischen Asparagin und reduzierenden Zuckern bei Temperaturen über 120 °C entsteht",
        correctAnswer = 3,
        explanation = "Acrylamid (CAS 79-06-1) entsteht beim Erhitzen stärkereicher Lebensmittel über 120 °C: Die freie Aminosäure Asparagin reagiert mit reduzierenden Zuckern (Glucose, Fructose) in einem Maillard-ähnlichen Mechanismus — eine Decarboxylierung und Deaminierung liefert Acrylamid als Zwischenprodukt. Kartoffelchips, Pommes frites und dunkles Brot sind Hauptquellen.",
        difficulty = 4,
        funFact = "Die EU-Verordnung 2017/2158 schreibt Mindestmaßnahmen zur Acrylamid-Reduktion vor — z. B. Kartoffeln nie unter 8 °C lagern (verhindert Zuckeranreicherung)."
    ),

    // Question 22 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Retrogradation' von Stärke und welche Lebensmittelprobleme verursacht sie?",
        answerA = "Die enzymatische Spaltung von Amylose durch α-Amylase bei Lagertemperatur",
        answerB = "Die Hydrolyse von Amylopektin bei hoher Temperatur zu unverdaulichen Dextrinen",
        answerC = "Die Rekristallisation von Amylose und Amylopektin nach dem Abkühlen gekochter Stärke, die Altbackenwerden und Synärese (Wasseraustritt) verursacht",
        answerD = "Die Oxidation von Stärke durch atmosphärischen Sauerstoff, die zur Vergilbung von Mehl führt",
        correctAnswer = 2,
        explanation = "Beim Abkühlen gelierter Stärke lagern sich Amylose-Ketten durch Wasserstoffbrückenbindungen zu kristallinen Strukturen zusammen (Retrogradation). Amylose retrogradiert schnell (innerhalb von Stunden), Amylopektin langsam (Tage). Folgen: Brot wird altbacken, Kartoffelpüree wird gummiartig, Pudding tritt Wasser aus (Synärese). Modifizierte Stärken mit reduzierter Retrogradation verlängern die Haltbarkeit.",
        difficulty = 4,
        funFact = null
    ),

    // Question 23 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Verbindung ist für den typischen 'gekochten' Geschmack von UHT-Milch im Vergleich zu frischer Milch verantwortlich?",
        answerA = "Dimethylsulfid (DMS) aus Methionin-Abbau und β-Lactoglobulin-Denaturierung, die freie Sulfhydrylgruppen (SH-Gruppen) freilegt",
        answerB = "Laktulosebildung durch Isomerisierung von Laktose",
        answerC = "Bildung von Furfural durch Maillard-Reaktion zwischen Laktose und Lysin",
        answerD = "Erhöhter Diacetylgehalt durch thermische Zersetzung von Zitronensäure",
        correctAnswer = 0,
        explanation = "Der Kochgeschmack von UHT-Milch entsteht hauptsächlich durch Hitzedenaturierung von β-Lactoglobulin, das dabei freie Sulfhydrylgruppen (−SH) freilegt. Diese reagieren zu Dimethylsulfid (DMS) und anderen schwefelhaltigen Verbindungen. Zusätzlich bilden sich Lactulose (Isomer der Laktose) durch Isomerisierung und Maillard-Reaktionsprodukte.",
        difficulty = 4,
        funFact = "Frische Milch enthält kein Dimethylsulfid — der DMS-Gehalt gilt als analytischer Marker für den Erhitzungsgrad von Milch."
    ),

    // Question 24 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hydroxymethylfurfural' (HMF) und warum ist seine Konzentration ein Qualitätsmerkmal für Honig?",
        answerA = "Ein natürliches Enzym im frischen Honig; hohe Werte zeigen aktive Bienentätigkeit an",
        answerB = "Ein Aromaester, der bei der Gärung von Honigsäuren entsteht und auf Wildblumenhonig hinweist",
        answerC = "Eine mikrobiologische Verbindung, die von Hefezellen bei Honigfermentation gebildet wird",
        answerD = "Ein Abbauprodukt von Fructose (Maillard-Reaktion/Säurehydrolyse), das bei Lagerung oder Überhitzung zunimmt; frischer Honig hat < 40 mg/kg nach EU-Verordnung",
        correctAnswer = 3,
        explanation = "HMF entsteht durch säurekatalytische Dehydratisierung von Fructose und ist ein Abbauprodukt der Zuckermoleküle. In frischem Honig liegt HMF unter 10 mg/kg. Die EU-Verordnung 2001/110/EG legt einen Grenzwert von 40 mg/kg fest (80 mg/kg für tropische Honige). Erhöhte HMF-Werte zeigen Überhitzung oder Alterung an.",
        difficulty = 4,
        funFact = null
    ),

    // Question 25 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Verseifungszahl' (Saponification Number) eines Fettes und was sagt sie über die Fettsäurezusammensetzung aus?",
        answerA = "Sie gibt den Gehalt an freien Fettsäuren in mg KOH/g an; höhere Werte zeigen ranzig gewordenes Fett an",
        answerB = "Sie gibt die Menge KOH in mg an, die benötigt wird, um 1 g Fett vollständig zu verseifen; höhere Werte zeigen kürzere/mehr Fettsäureketten an",
        answerC = "Sie misst den Anteil ungesättigter Fettsäuren in Mol-%; höhere Werte zeigen mehr Doppelbindungen an",
        answerD = "Sie gibt den Schmelzpunkt in °C an; je höher, desto mehr gesättigte Fettsäuren",
        correctAnswer = 1,
        explanation = "Die Verseifungszahl (VZ) gibt an, wie viel Milligramm KOH nötig sind, um 1 g Fett vollständig in Glycerin und Fettsäure-Salze zu spalten. Da kurze Fettsäuren ein geringeres Molekulargewicht haben, aber gleich viele Esterbindungen bilden, steigt die VZ mit kürzer werdenden Fettsäureketten. Kokosfett (VZ ~255) hat kurze Fettsäuren, Rapsöl (~190) langkettige.",
        difficulty = 4,
        funFact = "Die Jodzahl (Iodzahl) ergänzt die Verseifungszahl: Sie misst den Gehalt an Doppelbindungen — und damit die Oxidationsanfälligkeit (Ranzigkeitsrisiko) eines Fettes."
    ),

    // ── VERPACKUNGSTECHNOLOGIE & MAP ──────────────────────────────────────────

    // Question 26 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Gasgemisch wird typischerweise für die MAP-Verpackung von frischem Rindfleisch verwendet?",
        answerA = "100 % N₂ — Stickstoff verdrängt O₂ und verhindert aerobe Bakterien",
        answerB = "100 % CO₂ — hohe CO₂-Konzentration hemmt alle aeroben Bakterien maximal",
        answerC = "70–80 % O₂ + 20–30 % CO₂ — hoher O₂ erhält die rote Oxymyoglobin-Farbe; CO₂ hemmt Bakterien und Schimmelpilze",
        answerD = "50 % CO₂ + 50 % CO — CO stabilisiert Oxymyoglobin dauerhaft und CO₂ hemmt Keimwachstum",
        correctAnswer = 2,
        explanation = "Frisches Rindfleisch benötigt hohen Sauerstoffgehalt (70–80 %), damit Myoglobin als leuchtend rotes Oxymyoglobin vorliegt. O₂ allein würde jedoch aerobe Verderbnisbakterien fördern. Deshalb kombiniert man es mit 20–30 % CO₂, das in Wasser zu Kohlensäure hydratisiert, den intrazellulären pH der Bakterien senkt und Enzymaktivitäten hemmt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 27 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Barriereeigenschaft' von Verpackungsmaterialien und welche Einheit wird für die Sauerstoffdurchlässigkeit (OTR) verwendet?",
        answerA = "Barriereeigenschaft = Fähigkeit, den Durchtritt von Gasen, Dämpfen oder Aromen zu hemmen; OTR (Oxygen Transmission Rate) wird in cm³/(m²·d·bar) gemessen",
        answerB = "Barriereeigenschaft = Lichtundurchlässigkeit; Einheit: UV-Absorptionskoeffizient (UVA)",
        answerC = "Barriereeigenschaft = Schutz vor mechanischer Beschädigung; OTR gibt die Zugfestigkeit in N/mm² an",
        answerD = "Barriereeigenschaft = Wärmedämmung; OTR gibt die Wärmeleitfähigkeit in W/(m·K) an",
        correctAnswer = 0,
        explanation = "Barriereeigenschaften beschreiben, wie gut eine Verpackung den Durchtritt von O₂, CO₂, Wasserdampf, Aromastoffen oder Licht verhindert. Die OTR (Oxygen Transmission Rate) gibt an, wie viel cm³ Sauerstoff pro Quadratmeter und Tag bei 1 bar Partialdruck die Verpackungswand durchdringt. Hochbarriere-Folien für sauerstoffempfindliche Produkte haben OTR < 1 cm³/(m²·d·bar).",
        difficulty = 4,
        funFact = "EVOH (Ethylen-Vinylalkohol-Copolymer) ist das wichtigste Barrierematerial in modernen Mehrschichtfolien — 6 µm EVOH hemmen O₂-Durchtritt besser als 100 µm PE."
    ),

    // Question 28 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Wie funktioniert das Prinzip von 'Aktivverpackungen' mit Sauerstofffängern (O₂-Scavengern)?",
        answerA = "Sie emittieren CO₂ in die Verpackung, das O₂ chemisch bindet",
        answerB = "Sie enthalten Katalysatoren, die O₂ zu H₂O reduzieren und damit aus der Gasphase entfernen",
        answerC = "Sie sind Membranen, die selektiv O₂ durchlassen, aber CO₂ zurückhalten",
        answerD = "Sie enthalten eisenbasierte oder enzymatische Systeme, die O₂ aktiv aus der Verpackungsatmosphäre aufnehmen und irreversibel binden, um unter 0,1 % O₂ zu gelangen",
        correctAnswer = 3,
        explanation = "O₂-Scavenger in Aktivverpackungen basieren meist auf Eisenpulver, das in einem feuchtigkeitsgetriggerten Prozess mit O₂ zu Fe₂O₃ (Rost) oxidiert: 4 Fe + 3 O₂ → 2 Fe₂O₃. Enzymatische Varianten nutzen Glucose-Oxidase + Katalase. Beide Systeme reduzieren den O₂-Gehalt unter 0,01 %, was für sauerstoffempfindliche Produkte weit besser ist als passive Gasspülung.",
        difficulty = 4,
        funFact = null
    ),

    // Question 29 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Migration' bei Lebensmittelverpackungen und welche EU-Verordnung reguliert sie für Kunststoffe?",
        answerA = "Die physikalische Bewegung von Lebensmitteln in der Verpackung; reguliert durch EU 1935/2004",
        answerB = "Das Austrocknen von Lebensmitteln durch Wasserdampf-Durchlässigkeit der Folie; reguliert durch Codex Alimentarius",
        answerC = "Der Übertritt von Verpackungsinhaltsstoffen (Monomere, Weichmacher, Additive) in das Lebensmittel; für Kunststoffe gilt EU-Verordnung 10/2011 mit OML von 10 mg/dm²",
        answerD = "Die Aufnahme von Aromen aus dem Lebensmittel in die Verpackungsfolie (Scalping); reguliert durch EU 852/2004",
        correctAnswer = 2,
        explanation = "Migration ist der physikalisch-chemische Prozess, bei dem Bestandteile der Verpackung in das Lebensmittel diffundieren. EU-Verordnung 10/2011 (Plastics Regulation) setzt spezifische Migrationslimite (SML) für einzelne Substanzen (z. B. Bisphenol A: SML 0,05 mg/kg LM) und ein Gesamtmigrationslimit (OML) von 10 mg Substanz pro dm² Kontaktfläche.",
        difficulty = 4,
        funFact = "Das mittlerweile verbotene Bisphenol A (BPA) konnte aus Epoxidharz-Beschichtungen von Doseninnenseiten migrieren — weshalb viele Hersteller auf BPA-freie Alternativen umgestellt haben."
    ),

    // Question 30 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche Konservierungswirkung hat das Räuchern von Lebensmitteln auf molekularer Ebene?",
        answerA = "Wasserdampf aus dem Rauch desinfiziert die Oberfläche ähnlich wie Autoklavierung",
        answerB = "Phenolische Verbindungen (Phenol, Guajakol, Syringol) und Aldehyde im Rauch hemmen Mikroorganismen; Trocknung senkt den aw-Wert; Carbonylverbindungen binden an Proteine und bilden eine antimikrobielle Kruste",
        answerC = "CO₂ im Rauch wirkt wie eine MAP-Atmosphäre und senkt den Sauerstoffgehalt auf der Oberfläche",
        answerD = "Nikotin und Teer im Rauch sind die Hauptantimikrobika beim Fleischräuchern",
        correctAnswer = 1,
        explanation = "Rauchkonservierung wirkt durch mehrere Mechanismen: (1) Phenolische Verbindungen denaturieren Membranproteine und -lipide von Mikroorganismen. (2) Aldehyde (Formaldehyd, Furfural) reagieren mit Proteinen und bilden bakteriostatische Vernetzungen. (3) Trocknung der Oberfläche senkt den aw-Wert. (4) Säuren im Rauch senken den pH. Alle vier Mechanismen wirken als Hürden-System.",
        difficulty = 4,
        funFact = null
    ),

    // ── ENZYMOLOGIE & LEBENSMITTELTECHNOLOGIE ─────────────────────────────────

    // Question 31 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'enzymatische Bräunung' und wie wirkt Citronensäure als Inhibitor?",
        answerA = "Polyphenoloxidase (PPO) oxidiert Phenole zu Chinonen, die zu braunen Melaninen polymerisieren; Citronensäure hemmt PPO durch pH-Senkung UND Chelatierung des Kupfer-Kofaktors (Cu²⁺)",
        answerB = "Enzymatische Bräunung entsteht durch Karamellisierung; Citronensäure senkt den pH unter den Karamellisierungspunkt",
        answerC = "Peroxidase oxidiert Chlorophyll; Citronensäure regeneriert das Chlorophyll-Molekül durch Reduktion",
        answerD = "Lipase hydrolysiert Fette zu braunfärbenden Aldehyden; Citronensäure bildet Komplexe mit den Reaktionsprodukten",
        correctAnswer = 0,
        explanation = "PPO (Polyphenoloxidase) ist ein kupferhaltiges Enzym, das Catechine und andere o-Diphenole mit O₂ zu o-Chinonen oxidiert, die spontan zu braunen Melaninen polymerisieren. Citronensäure hemmt auf zwei Wegen: (1) pH-Absenkung unter das PPO-Optimum (~6,5); (2) Chelatierung des katalytisch notwendigen Cu²⁺-Ions im aktiven Zentrum, was das Enzym dauerhaft inaktiviert.",
        difficulty = 4,
        funFact = "Sulfite (E 220–228) sind die stärksten PPO-Inhibitoren, da SO₂ kovalent an die Kupferionen und Quinon-Intermediate bindet. Wegen allergener Eigenschaften werden Sulfite nur noch begrenzt eingesetzt."
    ),

    // Question 32 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Enzymklasse muss bei der Blanchierung von Gemüse vor dem Einfrieren inaktiviert werden?",
        answerA = "Amylasen — sie bauen Stärke zu Glukose ab, was Süßungsartefakte beim Auftauen erzeugt",
        answerB = "Proteasen — sie bauen Myofibrillenproteine ab und machen aufgetautes Gemüse matschig",
        answerC = "Pectinasen — sie lösen Pektine auf und das Gemüse verliert seine Zellstruktur beim Einfrieren",
        answerD = "Lipasen und Lipoxygenasen — sie katalysieren Fettspaltung und Fettsäure-Oxidation, die ranzige Aromen und Farb-/Vitaminabbau verursachen; Peroxidase dient als Inaktivierungs-Leitenzym",
        correctAnswer = 3,
        explanation = "Beim Einfrieren werden Enzyme nicht inaktiviert — sie arbeiten verlangsamt weiter. Lipoxygenase (LOX) oxidiert mehrfach ungesättigte Fettsäuren zu Hydroperoxiden (off-flavors, Ranzigkeit). Chlorophyllasen und Peroxidasen zerstören Chlorophyll (Farbe) und Vitamine. Peroxidase ist hitzeresistenter als LOX und dient daher als 'Sentinel-Enzym': Wenn Peroxidase inaktiviert ist, sind alle anderen Enzyme sicher inaktiviert.",
        difficulty = 4,
        funFact = null
    ),

    // Question 33 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Chymosin' (früher Rennin) und warum wurde rekombinantes Chymosin ein Meilenstein der Lebensmittelbiotechnologie?",
        answerA = "Ein Emulgator aus Kalbslabmagen; rekombinant hergestelltes Chymosin ermöglichte vegane Käseherstellung",
        answerB = "Ein Zucker-Hydrolyseenzym aus Kalbslabmagen; rekombinant hergestellt für laktosefreie Milchprodukte",
        answerC = "Eine aspartische Protease aus Kalbslabmagen, die κ-Casein bei Phe₁₀₅–Met₁₀₆ spaltet und Milch gerinnen lässt; rekombinantes Chymosin aus Aspergillus niger oder E. coli ersetzt tierisches Lab",
        answerD = "Eine Lipase aus Ziegenlabmagen, die spezifische Fettsäuren aus Milchfett freisetzt; rekombinant für Blauschimmelkäse-Aroma",
        correctAnswer = 2,
        explanation = "Chymosin (EC 3.4.23.4) ist eine Aspartyl-Protease, die die Phe₁₀₅–Met₁₀₆-Bindung in κ-Casein spaltet. Dies entfernt das hydrophile Caseinomakropeptid (CMP), das normalerweise Micellen abstößt — ohne CMP koagulieren die Caseins zu Quark. Rekombinantes Chymosin (FPC) aus Aspergillus niger var. awamori oder Kluyveromyces marxianus deckt heute ~90 % des Weltbedarfs.",
        difficulty = 4,
        funFact = "Rekombinantes Chymosin ist das erste genetisch veränderte Produkt, das von der FDA (1990) für den Lebensmitteleinsatz zugelassen wurde."
    ),

    // Question 34 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Laktase' (β-Galactosidase) und wie verändert ihr Einsatz den Kohlenhydratgehalt von Milch?",
        answerA = "Sie spaltet Saccharose in Glucose und Fructose; laktosefreie Milch enthält 20 % weniger Kohlenhydrate",
        answerB = "Sie hydrolysiert Laktose (β-1,4-Glykosidbindung) in Glucose und Galactose; die Milch enthält gleich viele Kohlenhydrate, schmeckt aber süßer",
        answerC = "Sie baut Laktose vollständig zu CO₂ und H₂O ab; laktosefreie Milch ist kalorienärmer",
        answerD = "Sie wandelt Galactose in Fructose um, was die Milch haltbarer macht",
        correctAnswer = 1,
        explanation = "Laktase (β-D-Galactosidase, E.C. 3.2.1.23) spaltet die β-1,4-Glykosidbindung der Laktose in Glucose + Galactose. Der Gesamtkohlendrats­gehalt bleibt gleich (Glucose + Galactose = Laktose in mol), aber der Süßegrad steigt, weil Glucose und Galactose zusammen süßer sind als Laktose. Für Laktoseintoleranz-Betroffene beseitigt dies die Beschwerden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 35 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Unter welchen Bedingungen geliert hochverestertes Pektin (HM-Pektin) in Marmeladen?",
        answerA = "Bei pH 2,5–3,5 und ≥ 55 % Zucker durch hydrophobe Wechselwirkungen und Wasserstoffbrücken; niedrigverestertes Pektin (LM-Pektin) geliert mit Ca²⁺-Ionen ohne Zucker",
        answerB = "Pektinmethylesterase aktiviert Pektin bei hohem pH; Gelierbedingungen: pH 7, keine Zugabe von Zucker nötig",
        answerC = "Pektinase baut Pektin zu Polygalacturonsäure ab, die dann mit Kaliumionen ein festes Gel bildet",
        answerD = "Amylase überträgt Glukoseketten auf Pektin und bewirkt so Netzwerkbildung bei Kühlung",
        correctAnswer = 0,
        explanation = "HM-Pektin (Veresterungsgrad > 50 %) geliert in saurer Umgebung (pH 2,5–3,5) bei hohem Zuckergehalt (> 55 °Brix): Zucker entzieht Wasser (Dehydratation) und reduziert die elektrostatische Abstoßung zwischen Carboxylgruppen; hydrophobe Methoxylgruppen lagern sich zusammen. LM-Pektin (Veresterungsgrad < 50 %) hat viele freie Carboxylgruppen, die Ca²⁺-Ionen als Brücken binden — ideal für zuckerarme Gelees.",
        difficulty = 4,
        funFact = "Pektin (E 440) ist sowohl in HM- als auch LM-Form ein natürliches Hydrokolloide aus Zitrusschalen oder Apfeltrester — ein Nebenprodukt der Saft-/Wein-Industrie."
    ),

    // ── KONSERVIERUNG DURCH STRAHLUNG & MODERNE VERFAHREN ────────────────────

    // Question 36 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Wellenlängenbereich wird bei der UV-Bestrahlung von Lebensmitteln zur Keimreduktion verwendet und welcher Mechanismus tötet Mikroorganismen?",
        answerA = "UV-A (315–400 nm) — erzeugt reaktive Sauerstoffspezies in der Keimzelle",
        answerB = "UV-B (280–315 nm) — denaturiert Membranproteine durch direkte Energieabsorption",
        answerC = "Vakuum-UV (100–200 nm) — ionisiert Zellwasserkomponenten zu freien Radikalen",
        answerD = "UV-C (200–280 nm, optimal ~254 nm) — DNA absorbiert diese Wellenlänge und bildet Thymin-Dimere, die die DNA-Replikation hemmen und zum Zelltod führen",
        correctAnswer = 3,
        explanation = "UV-C-Strahlung bei ~254 nm entspricht dem Absorptionsmaximum der DNA-Purin- und Pyrimidinbasen. Die Energie bewirkt kovalente Verknüpfung benachbarter Thymin-Basen zu Cyclobutanpyrimidin-Dimeren (CPDs). Diese Läsionen blockieren DNA-Replikation und Transkription irreversibel, was zum Tod der Mikroorganismen führt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 37 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Elektronenstrahlbestrahlung' (E-Beam) und worin unterscheidet sie sich von Gamma-Bestrahlung?",
        answerA = "E-Beam und Gamma-Bestrahlung sind identisch in Wirkung und Penetrationstiefe — nur die Strahlenquelle unterscheidet sich",
        answerB = "E-Beam nutzt beschleunigte Elektronen (begrenzte Eindringtiefe 3–8 cm); Gamma (⁶⁰Co) nutzt Photonenstrahlung mit großer Durchdringungstiefe — beide erzeugen ionisierende Radikale, die DNA und Keime schädigen",
        answerC = "E-Beam arbeitet mit Infrarotlicht; Gamma mit Röntgenstrahlung — beide bei unter 1 kGy",
        answerD = "E-Beam macht Lebensmittel radioaktiv; Gamma-Bestrahlung nicht",
        correctAnswer = 1,
        explanation = "E-Beam (Elektronenstrahlsterilisation) und Gamma-Bestrahlung (⁶⁰Co, ¹³⁷Cs) gehören beide zur ionisierenden Strahlung. Unterschied: E-Beam-Elektronen haben begrenzte Reichweite (3–8 cm in Wasser) und eignen sich für dünne Produkte; Gammastrahlung ist hochpenetrierend und kann ganze Paletten durchdringen. Beide machen Lebensmittel NICHT radioaktiv.",
        difficulty = 4,
        funFact = "In Deutschland ist Lebensmittelbestrahlung nur für Gewürze und Kräuter zugelassen — und muss mit 'bestrahlt' oder einem Strahlensymbol gekennzeichnet werden."
    ),

    // Question 38 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pulsed Electric Field' (PEF) in der Lebensmitteltechnologie und bei welcher Anwendung ist es besonders vorteilhaft?",
        answerA = "Kurze intensive elektrische Hochspannungsimpulse (20–80 kV/cm, Mikrosekunden), die Zellmembranen durch Elektroporation irreversibel perforieren — besonders schonend für Fruchtsäfte, da keine Hitze entsteht",
        answerB = "Elektromagnetische Hochfrequenzfelder, die Wassermoleküle in Bewegung versetzen (Mikrowellen-Prinzip) — gut für schnelles Auftauen",
        answerC = "Statische elektrische Felder, die den aw-Wert absenken und so Konservierungsstoffe einsparen",
        answerD = "Ultraschall-ähnliche Elektroden, die Kavitations-Bläschen erzeugen und Keime mechanisch zerstören",
        correctAnswer = 0,
        explanation = "PEF-Technologie nutzt intensive elektrische Impulse (20–80 kV/cm, 1–100 µs) in einer Flusskammer. Das elektrische Feld induziert Transmembranpotenziale in Zellen: Übersteigt die Feldstärke einen Schwellenwert (Elektroporation), entstehen irreversible Poren in Zellmembranen — Keime sterben durch Verlust der Membranintegrität. Die Behandlung erfolgt bei Raumtemperatur, wodurch hitzeempfindliche Vitamine (C, B₁) und Aromen weitgehend erhalten bleiben.",
        difficulty = 4,
        funFact = null
    ),

    // Question 39 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ohmic Heating' (Ohmsche Erwärmung) und welchen Vorteil bietet es gegenüber konventioneller Heißverarbeitung?",
        answerA = "Erwärmung durch Wärmestrahlung von Infrarot-Panels; schneller als Konvektion, aber identisches Ergebnis",
        answerB = "Erwärmung mit hochfrequentem Wechselstrom (Mikrowellen); gleicher Mechanismus wie im Haushalts-Mikrowellenherd",
        answerC = "Direkte elektrische Widerstandserwärmung — Strom fließt durch das Lebensmittel selbst; das gesamte Volumen erwärmt sich gleichzeitig (keine Temperaturgradienten), ideal für partikelhaltige Flüssigkeiten",
        answerD = "Elektrochemische Erwärmung durch Elektrolyse des Lebensmittelwassers zu Wasserstoff und Sauerstoff",
        correctAnswer = 2,
        explanation = "Beim Ohmic Heating wird Wechselstrom (50 Hz bis 25 kHz) direkt durch das Lebensmittel geleitet. Das Produkt selbst ist der Widerstand (P = I²·R); die erzeugte Wärme entsteht gleichmäßig im gesamten Volumen — kein Wärmegradient von außen nach innen. Besonders vorteilhaft für Suppen mit Fleischstücken: Partikel und Flüssigkeit erreichen dieselbe Temperatur gleichzeitig.",
        difficulty = 4,
        funFact = "Beim konventionellen Platten-Wärmetauscher muss die Trägerflüssigkeit überhitzt werden, damit die Partikel die Sterilisationstemperatur erreichen — Ohmic Heating vermeidet diesen Qualitätsverlust."
    ),

    // Question 40 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist HACCP und welche sieben Grundsätze umfasst das System nach Codex Alimentarius?",
        answerA = "HACCP = Hazard Analysis and Critical Control Points; 7 Grundsätze: Gefährdungsanalyse, CCPs identifizieren, kritische Grenzwerte festlegen, Überwachungssystem, Korrekturmaßnahmen, Verifizierungsverfahren, Dokumentation",
        answerB = "HACCP = High-Accuracy Chemical Control Protocol; 7 Schritte: Laboranalyse, Stichproben, Grenzwerte, Rückrufplan, Schulung, Audit, Zertifizierung",
        answerC = "HACCP = Hazard Assessment and Contamination Control Plan; Grundsätze identisch mit ISO 9001",
        answerD = "HACCP = Heat-Applied Critical Control Points; nur thermische Verfahren werden durch HACCP reguliert",
        correctAnswer = 0,
        explanation = "HACCP (Hazard Analysis and Critical Control Points) ist ein präventives Lebensmittelsicherheitssystem nach Codex Alimentarius. Die 7 Grundsätze: (1) Gefährdungsanalyse; (2) CCPs bestimmen; (3) Kritische Grenzwerte festlegen; (4) Überwachungssystem einrichten; (5) Korrekturmaßnahmen definieren; (6) Verifizierungsverfahren; (7) Dokumentations- und Aufzeichnungspflichten. In der EU seit 2006 für Lebensmittelunternehmen verpflichtend (VO 852/2004).",
        difficulty = 4,
        funFact = null
    ),

    // ── MILCHTECHNOLOGIE ──────────────────────────────────────────────────────

    // Question 41 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Homogenisierung' von Milch auf physikalischer Ebene und welchen Effekt hat sie auf Milchfettkugeln?",
        answerA = "Homogenisierung bedeutet die gleichmäßige Verteilung von Vitaminen und Mineralstoffen in Milch durch Zentrifugation",
        answerB = "Chemische Verbindung von Caseinmicellen und Molkenproteinen durch Hitze bei 85 °C",
        answerC = "Ionenaustausch zur Entfernung von Calcium-Ionen und Verhinderung von Labkuchen-Bildung",
        answerD = "Mechanische Zerkleinerung der Milchfettkugeln von 1–10 µm auf 0,1–0,5 µm durch Hochdruckventile (~200 bar) — verhindert Aufrahmen und erhöht die Emulsionsstabilität",
        correctAnswer = 3,
        explanation = "Rohe Milch würde durch Aufrahmen eine Fettschicht bilden. Homogenisierung presst Milch mit 150–250 bar durch enge Ventilspalten (~0,1 mm): Der Druckabfall erzeugt Kavitation und Turbulenz, die Fettkügelchen von ~3 µm auf ~0,5 µm zerkleinern. Neue Kasein- und Molkenprotein-Schichten adsorbieren sofort auf den vergrößerten Fetttröpfchenoberfl­ächen und stabilisieren die Emulsion dauerhaft.",
        difficulty = 4,
        funFact = "Homogenisierte Milch hat eine leicht weißere Farbe als nicht-homogenisierte, weil kleinere Fettkügelchen Licht stärker streuen (Tyndall-Effekt)."
    ),

    // Question 42 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche Rolle spielt κ-Casein für die Mizellstruktur von Casein in Kuhmilch?",
        answerA = "α-, β-, γ-Casein; γ-Casein schützt die Micelle durch negative Ladung",
        answerB = "κ-Casein bildet eine hydrophile Haarschicht (Caseinomakropeptid) auf der Micelloberfläche, die durch sterische und elektrostatische Abstoßung Aggregation verhindert",
        answerC = "κ-Casein gibt es in Kuhmilch nicht — nur in Büffelmilch",
        answerD = "κ-Casein ist ausschließlich für die Calciumphosphat-Bindung im Micellinneren verantwortlich",
        correctAnswer = 1,
        explanation = "Caseinmicellen bestehen aus αs1-, αs2-, β- und κ-Casein plus Calciumphosphat-Clustern. κ-Casein ist amphiphil und befindet sich bevorzugt auf der Micelloberfläche: Der hydrophobe N-terminale Teil veranschert in der Micelle; das hydrophile C-terminale Caseinomakropeptid (CMP, negativ geladen) ragt ins wässrige Milieu und schafft eine sterische/elektrostatische Barriere gegen Aggregation.",
        difficulty = 4,
        funFact = null
    ),

    // Question 43 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ultrafiltration' (UF) in der Molkerei-Industrie und welche Komponenten werden zurückgehalten?",
        answerA = "Thermische Abtrennung von Molke durch Zentrifugation; Casein und Molkenproteine werden abgetrennt",
        answerB = "Ionenaustauschchromatographie; Calcium und Phosphat werden zurückgehalten, alles andere permeiert",
        answerC = "Membranverfahren mit Porengröße 1–100 kDa MWCO; Proteine (Casein, Molkenproteine) und Fett werden zurückgehalten, Laktose, Mineralstoffe und Wasser permeieren",
        answerD = "Umkehrosmose-Verfahren mit 0,001 µm Poren; alles außer Wasser wird zurückgehalten",
        correctAnswer = 2,
        explanation = "Ultrafiltration (UF) nutzt semipermeable Membranen mit Trenngrenze von 1–100 kDa (typisch: 10–50 kDa für Molkenproteine). Das Konzentrat (Retentat) enthält alle Proteine und Fette; das Filtrat (Permeat) enthält Laktose, Vitamine und Salze. UF ermöglicht die standardisierte Proteinkonzentrierung für Frischkäse, WPC (Whey Protein Concentrate) und Feta-ähnlichen Käse.",
        difficulty = 4,
        funFact = "Die erste industrielle UF-Anlage in der Molkerei-Industrie wurde 1969 in Frankreich für das MMV-Verfahren (Maubois-Mocquot-Vassal) installiert."
    ),

    // Question 44 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Late Blowing' bei Käse und welches Bakterium ist die Hauptursache?",
        answerA = "Clostridium tyrobutyricum vergärt Laktate (Milchsäure) zu Buttersäure, CO₂ und H₂ — sogenannte Buttersäuregärung; Käse bildet Risse und bekommt einen ranzig-bitteren Geschmack",
        answerB = "Überproduktion von CO₂ durch überschießende malolaktische Gärung von Lactobacillus casei",
        answerC = "Propionibacterium freudenreichii bildet Propionsäure und CO₂ aus Laktose außer Kontrolle",
        answerD = "Hefe-Kontamination (Candida famata) produziert Ethanol und CO₂ aus Laktose im Reifungsraum",
        correctAnswer = 0,
        explanation = "Clostridium tyrobutyricum-Sporen überstehen die Pasteurisierung. Im Käse keimen sie unter anaeroben Bedingungen aus und vergären Laktat (Milchsäure) zu Butyrat (Buttersäure) + CO₂ + H₂: C₆H₁₀O₃ → C₄H₈O₂ + 2CO₂ + 2H₂. Das entstehende CO₂ und H₂ bilden große, unregelmäßige Gaseinschlüsse (Bläher), Buttersäure erzeugt ranzigen Geruch. Hauptkontrollmaßnahmen: Bactofugation der Milch und Nitrat-Zusatz.",
        difficulty = 4,
        funFact = null
    ),

    // Question 45 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Enzyme sind bei der Käsereifung für den Proteinabbau (Proteolyse) hauptverantwortlich?",
        answerA = "Der Tiefenabbau misst den Wasserverlust durch Trocknung; Lipasen sind hauptverantwortlich",
        answerB = "Der Fettabbau (Lipolyse) gibt den Reifegrad an; ausschließlich Schimmelpilz-Lipasen sind verantwortlich",
        answerC = "Der Laktosegehalt wird als Reifeindikator genutzt; je mehr Laktose verbraucht wurde, desto reifer der Käse",
        answerD = "Chymosin (spaltet αs1-Casein), Plasmin (körpereigene Milch-Protease) und mikrobielle Proteasen der Starterkulturen sind verantwortlich; Reifegrad wird als % wasserlöslicher Stickstoff (WSN/TN) gemessen",
        correctAnswer = 3,
        explanation = "Die Reife von Hartkäse wird meist durch den Grad der Proteolyse gemessen: WSN/TN (water-soluble nitrogen / total nitrogen) zeigt den Anteil von Casein, der zu Peptiden und Aminosäuren abgebaut wurde. Hauptverantwortlich: Chymosin (spaltet αs1-Casein an Phe23–Phe24), Plasmin (Hauptenzym in Langzeit-Reiferäse wie Parmesan) und Milchsäurebakterien-Proteasen.",
        difficulty = 4,
        funFact = "Parmesan Reggiano enthält nach 36 Monaten Reifung über 25 mg freies Glutamat pro 100 g — deshalb ist gereifter Parmesane natürlicher Umami-Verstärker."
    ),

    // ── SPEZIELLE KONSERVIERUNGSTECHNIKEN ────────────────────────────────────

    // Question 46 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Gasgemisch-Zusammensetzung verwendet MAP für Salat und Frischgemüse und warum ist ein Restsauerstoffgehalt nötig?",
        answerA = "100 % CO₂ hemmt alle aeroben Keime maximal; kein Sauerstoff nötig für Blattgemüse",
        answerB = "100 % Stickstoff ist optimal für alle Frischgemüse, weil N₂ anaerobe Bakterien hemmt",
        answerC = "Niedrige O₂- (2–5 %) und erhöhte CO₂-Konzentrationen (5–10 %) — der O₂ ist notwendig für die Zellatmung (verhindert Anaerobiose-Schäden), CO₂ hemmt Aerobe und verlangsamt den Reifeprozess",
        answerD = "Argon + CO₂ in 60/40-Mischung — Argon hat stärkere antimikrobielle Wirkung als Stickstoff",
        correctAnswer = 2,
        explanation = "Frischgeschnittener Salat und Gemüse atmen weiter (Zellatmung). MAP für diese Produkte balanciert zwei Anforderungen: (1) Genug O₂ (2–5 %), damit Anaerobiose vermieden wird (anaerobe Bakterien, Ethanol-Bildung, Braunverfärbung). (2) Erhöhtes CO₂ (5–10 %), das die Permeabilität der Zellmembranen mikrobieller Zellen erhöht, Enzyme hemmt und den pH senkt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 47 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sous-Vide' in der Lebensmitteltechnologie und welches Prinzip der Lebensmittelsicherheit liegt zugrunde?",
        answerA = "Rohes Lebensmittel wird im Vakuumbeutel bei 20 °C fermentiert; Milchsäure konserviert es",
        answerB = "Vakuumdestillation von Aromen bei 40 °C zur Extraktion flüchtiger Verbindungen",
        answerC = "Friertrocknung unter Vakuum bei −55 °C für miniaturisierte Küchenproduktionen",
        answerD = "Lebensmittel wird vakuumversiegelt und bei präziser Niedrigtemperatur (55–90 °C) über lange Zeit (Stunden bis Tage) erhitzt; Sicherheit basiert auf der Pasteurisierung durch Zeit-Temperatur-Integration (äquivalente Lethalität)",
        correctAnswer = 3,
        explanation = "Sous Vide (franz. 'unter Vakuum') vakuumversiegelt Lebensmittel und gart sie in präzis temperiertem Wasserbad (typisch: 55–65 °C für Fleisch, bis 90 °C für Gemüse). Die Sicherheit basiert auf dem USDA/FDA-Konzept der kumulativen Lethalität: Auch bei 57 °C wird nach ausreichend langer Haltezeit (z. B. 4–6 h für Geflügel) eine 7-log-Reduktion von Salmonellen erreicht.",
        difficulty = 4,
        funFact = "Sous Vide wurde in den 1970er Jahren von Georges Pralus (für Foie Gras) und Bruno Goussault (für wissenschaftliche Basis) unabhängig entwickelt."
    ),

    // Question 48 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kryokonzentration' und warum ist sie für die Fruchtsaftherstellung vorteilhafter als Eindampfen?",
        answerA = "Partielles Einfrieren des Saftes: Reines Wasser kristallisiert als Eis aus, das durch Separation entfernt wird — es entsteht ein Konzentrat ohne Wärmebelastung, das Aromen, Vitamine und Farbe besser erhält als thermisches Eindampfen",
        answerB = "Tiefgefrieren von Saft und Zentrifugation; vorteilhaft weil Zucker dabei auskristallisiert und leicht entfernt wird",
        answerC = "Flüssiger Stickstoff kühlt den Saft so schnell, dass Aromastoffe eingefroren werden und nicht verdampfen können",
        answerD = "Ultrafiltration bei −20 °C, bei der Zuckermoleküle durch die Membran permeieren, aber Aromen zurückgehalten werden",
        correctAnswer = 0,
        explanation = "Bei der Kryokonzentration wird Fruchtsaft langsam partiell eingefroren: Wasser kristallisiert als reines Eis (Ausschlussmechanismus — Aromen und Zucker passen nicht ins Eiskristallgitter), während die konzentrierte Lösung fließfähig bleibt. Durch Abtrennung des Eises entsteht ein 5–10-fach konzentrierter Saft ohne thermische Belastung.",
        difficulty = 4,
        funFact = null
    ),

    // Question 49 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Spray Drying' (Sprühtrocknung) und warum übersteht Instant-Kaffee-Pulver das Sprühen trotz 180–220 °C heißer Luft ohne zu verbrennen?",
        answerA = "Das Produkt wird direkt eingefroren, bevor es mit heißer Luft in Kontakt kommt",
        answerB = "Kaffeeextrakt hat einen sehr hohen Zuckergehalt, der als Hitzeschutzschicht wirkt",
        answerC = "Die verdampfende Feuchtigkeit aus den Tröpfchen kühlt deren Oberfläche durch Verdunstungskälte: Während Wasser verdunstet, bleibt die Produkttemperatur unter 80 °C — erst wenn alle Feuchtigkeit weg ist, steigt die Temperatur rasch an, weshalb das Pulver sofort ausgetragen wird",
        answerD = "Der Luft-Produkt-Kontakt dauert nur 0,1 Millisekunden — zu kurz für Wärmeschäden",
        correctAnswer = 2,
        explanation = "Sprühtrocknung versprüht konzentrierten Extrakt zu feinen Tröpfchen (50–200 µm) in einem heißen Luftstrom (Einlass: 180–220 °C). Das Prinzip der Verdunstungskühlung schützt das Produkt: Die Wärme wird vollständig für die Verdampfung des Wassers verbraucht (Enthalpie der Verdampfung = 2260 J/g), solange Feuchtigkeit vorhanden ist. Die Tröpfcheninnentemperatur bleibt < 80 °C bis zur vollständigen Trocknung.",
        difficulty = 4,
        funFact = "Das Sprühtrocknungsverfahren wurde 1872 von Percy LaCelles Percy patentiert — ursprünglich für Eipulver, nicht für Kaffee."
    ),

    // Question 50 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Retortenprozess' (Sterilisierung in verschlossenem Behälter) und welche Herausforderung besteht bei der Wärmeübertragung in Dosen mit festen Lebensmitteln?",
        answerA = "Retortenprozess = UHT-Behandlung vor dem Abfüllen; keine Wärmeübertragungs-Herausforderung da Flüssigkeit",
        answerB = "Verschlossene Konserven werden im Autoklav bei 116–121 °C sterilisiert; bei festen Lebensmitteln erfolgt Wärmeübertragung nur durch langsame Wärmeleitung (Konduktion) — der 'Cold Spot' (kälteste Punkt) im geometrischen Zentrum bestimmt die notwendige Prozesszeit",
        answerC = "Konserven werden durch Mikrowellen im Autoklav sterilisiert; der Cold Spot liegt immer an der Doseninnenwand",
        answerD = "Retortenprozesse nutzen ausschließlich Dampf bei 100 °C; höhere Temperaturen sind gesetzlich verboten",
        correctAnswer = 1,
        explanation = "Im Retortenprozess (Autoklav) werden verschlossene Dosen mit Sattdampf bei 116–121 °C behandelt. In flüssigen Produkten verteilt Konvektion die Wärme schnell. In festen Produkten (z. B. Hühnerstücke, Bohnen) erfolgt Wärmeübertragung nur durch Wärmeleitung (Konduktion) — sehr langsam. Der 'Cold Spot' (meist geometrisches Zentrum) muss die Sterilisationstemperatur für ausreichend lange Zeit erreichen, was Übersterilisation der Außenbereiche bedeutet.",
        difficulty = 4,
        funFact = "Rotationsretorten drehen die Dosen während der Sterilisierung und erzeugen damit Konvektion im Produktinneren — dies reduziert die Prozesszeit erheblich und verbessert die Produktqualität."
    )
)
