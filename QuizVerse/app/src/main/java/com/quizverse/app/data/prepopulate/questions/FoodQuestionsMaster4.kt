package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster4(): List<Question> = listOf(

    // ── MILCHSÄUREGÄRUNG & GRUNDLAGEN ─────────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welcher Unterschied besteht zwischen homofermentativer und heterofermentativer Milchsäuregärung?",
        answerA = "Homofermentativ erzeugt ausschließlich Milchsäure; heterofermentativ bildet zusätzlich Ethanol und CO₂",
        answerB = "Homofermentativ läuft bei höheren Temperaturen ab als heterofermentativ",
        answerC = "Homofermentativ benötigt Sauerstoff; heterofermentativ ist anaerob",
        answerD = "Homofermentativ wird nur von Hefen katalysiert; heterofermentativ nur von Bakterien",
        correctAnswer = 0,
        explanation = "Bei der homofermentativen Milchsäuregärung wird Glukose ausschließlich zu Milchsäure abgebaut (z. B. durch Lactobacillus acidophilus). Bei der heterofermentativen Variante entstehen neben Milchsäure auch Ethanol, CO₂ und Essigsäure, da der Pentosephosphatweg genutzt wird.",
        difficulty = 5,
        funFact = "Heterofermentative Bakterien wie Leuconostoc mesenteroides spielen die entscheidende Rolle in der frühen Phase der Sauerkrautfermentation."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welches Enzym fehlt heterofermentativen Milchsäurebakterien, das sie von homofermentativen unterscheidet?",
        answerA = "Lactase",
        answerB = "Amylase",
        answerC = "Lipase",
        answerD = "Aldolase",
        correctAnswer = 3,
        explanation = "Heterofermentative Milchsäurebakterien besitzen keine Aldolase (und keine Fruktose-1,6-bisphosphat-Aldolase), können also den klassischen Embden-Meyerhof-Parnas-Weg nicht vollständig nutzen. Stattdessen verwenden sie den Phosphoketolase-Weg und erzeugen dadurch mehrere Endprodukte.",
        difficulty = 5,
        funFact = null
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Auf welchen pH-Wert sinkt vollständig fermentiertes Sauerkraut typischerweise ab?",
        answerA = "pH 4,5–5,0",
        answerB = "pH 3,8–4,2",
        answerC = "pH 5,5–6,0",
        answerD = "pH 2,5–3,0",
        correctAnswer = 1,
        explanation = "Vollständig fermentiertes Sauerkraut erreicht einen pH-Wert von etwa 3,8 bis 4,2. Dieses saure Milieu hemmt Fäulnisbakterien effektiv und macht das Produkt ohne Kühlung monatelang haltbar.",
        difficulty = 5,
        funFact = "Sauerkraut wurde auf Segelsschiffen des 18. Jahrhunderts als Vitamin-C-Lieferant gegen Skorbut eingesetzt — lange bevor Vitamin C überhaupt entdeckt worden war."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welche Bakterienart leitet typischerweise die erste Phase der Sauerkrautgärung ein?",
        answerA = "Pediococcus cerevisiae",
        answerB = "Lactobacillus plantarum",
        answerC = "Leuconostoc mesenteroides",
        answerD = "Streptococcus thermophilus",
        correctAnswer = 2,
        explanation = "Leuconostoc mesenteroides ist heterofermentativ und säuretoleranter als viele Konkurrenten. Es dominiert die erste Gärphase, senkt den pH schnell und schafft damit die Bedingungen für die spätere Dominanz von Lactobacillus plantarum.",
        difficulty = 5,
        funFact = null
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welche Funktion hat das Salz bei der Sauerkrautherstellung aus mikrobiologischer Sicht primär?",
        answerA = "Es katalysiert chemisch die Umwandlung von Zucker in Milchsäure",
        answerB = "Es erhöht den pH-Wert und schafft ideale Bedingungen für Hefen",
        answerC = "Es entzieht dem Kohl Wasser durch Osmose und selektiert salztolerante Milchsäurebakterien",
        answerD = "Es tötet direkt alle unerwünschten Bakterien ab",
        correctAnswer = 2,
        explanation = "Salz (typischerweise 2 % des Kohlgewichts) entzieht durch Osmose den Zellsaft aus dem Kohl und schafft die anaerobe Sole, die Milchsäurebakterien benötigen. Gleichzeitig hemmt die Salzkonzentration grampositive und gramnegative Fäulnisbakterien, während salztolerante Milchsäurebakterien selektiv überleben.",
        difficulty = 5,
        funFact = "Der optimale Salzgehalt für Sauerkraut beträgt 1,5–2,5 %. Zu wenig Salz begünstigt Schimmel; zu viel verlangsamt die Fermentation erheblich."
    ),

    // ── KOJI & MISO ────────────────────────────────────────────────────────────

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welcher Schimmelpilz ist der Hauptorganismus bei der Koji-Herstellung?",
        answerA = "Rhizopus oligosporus",
        answerB = "Mucor racemosus",
        answerC = "Aspergillus oryzae",
        answerD = "Penicillium roqueforti",
        correctAnswer = 2,
        explanation = "Aspergillus oryzae (Koji-Schimmel, auf Japanisch 'Koji-kin') wird auf gedämpften Reis, Gerste oder Sojabohnen inokuliert und produziert bei 30 °C über 48 Stunden die Enzyme Amylase und Protease. Diese Enzyme liefern Zucker für die Hefen und Aminosäuren für das Umami-Aroma.",
        difficulty = 5,
        funFact = "Aspergillus oryzae wurde 2006 von der japanischen Brauer-Vereinigung offiziell zum 'nationalen Schimmelpilz Japans' erklärt."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Welche zwei Hauptenzymklassen produziert Aspergillus oryzae beim Koji-Prozess, und welche Aufgaben erfüllen sie?",
        answerA = "Amylasen (Stärke → Zucker) und Proteasen (Protein → Aminosäuren)",
        answerB = "Cellulasen (Zellwandabbau) und Pektinasen (Gelatinierung)",
        answerC = "Nucleasen (DNA-Abbau) und Transaminasen (Aminosäuretransfer)",
        answerD = "Lipasen (Fettabbau) und Oxidasen (Bräunung)",
        correctAnswer = 0,
        explanation = "Amylasen spalten Stärke in Glukose und Oligosaccharide, die als Substrat für die anschließende Hefen-Fermentation dienen. Proteasen hydrolysieren Proteine zu freien Aminosäuren wie Glutaminsäure — der Hauptträger des Umami-Geschmacks in Miso und Sojasoße.",
        difficulty = 5,
        funFact = null
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Wie lange kann die Fermentation von Premium-Hatcho-Miso dauern?",
        answerA = "2–4 Wochen",
        answerB = "1–3 Jahre",
        answerC = "3–6 Monate",
        answerD = "5–10 Jahre",
        correctAnswer = 1,
        explanation = "Hatcho-Miso aus reinen Sojabohnen reift in riesigen Zedernholzfässern unter schweren Steingewichten mindestens 3 Jahre lang. Dieser lange Prozess entwickelt einen sehr dunklen, intensiven und komplexen Geschmack mit niedrigem Wassergehalt.",
        difficulty = 5,
        funFact = "Hatcho-Miso aus dem japanischen Okazaki wird seit dem 14. Jahrhundert hergestellt — es war das Standardproviant der Samurai-Krieger."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welche Miso-Sorte macht ca. 80 % der japanischen Gesamtproduktion aus?",
        answerA = "Hatcho-Miso (reines Sojamiso)",
        answerB = "Kome-Miso (Reismiso)",
        answerC = "Mugi-Miso (Gerstenmiso)",
        answerD = "Shiro-Miso (weißes Miso)",
        correctAnswer = 1,
        explanation = "Kome-Miso (Reismiso) ist mit etwa 80 % der Produktion die mit Abstand häufigste Miso-Sorte in Japan. Es wird aus Sojabohnen und Reis-Koji hergestellt, ist mild und vielseitig. Mugi-Miso (Gerste) dominiert die südlichen Regionen Japans.",
        difficulty = 5,
        funFact = null
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welcher Mikroorganismus ist für die alkoholische Komponente in der Miso-Fermentation hauptverantwortlich?",
        answerA = "Leuconostoc mesenteroides",
        answerB = "Bacillus subtilis",
        answerC = "Saccharomyces rouxii (Zygosaccharomyces rouxii)",
        answerD = "Aspergillus sojae",
        correctAnswer = 2,
        explanation = "Zygosaccharomyces rouxii ist eine osmofile Hefe, die auch bei hohen Salzkonzentrationen aktiv bleibt. Sie vergärt die durch Koji-Amylasen freigesetzte Glukose zu Ethanol und erzeugt Esterverbindungen, die wesentlich zum Aroma von Miso und Sojasoße beitragen.",
        difficulty = 5,
        funFact = "Zygosaccharomyces rouxii kann in Medien mit bis zu 60 % Zucker überleben — fast kein anderer Organismus überlebt solche osmotischen Extrembedingungen."
    ),

    // ── SAUERTEIG ──────────────────────────────────────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welche Bakterienart ist im deutschen und europäischen Sauerteig am häufigsten vertreten und gilt als Leitorganismus?",
        answerA = "Lactobacillus sanfranciscensis (heute: Fructilactobacillus sanfranciscensis)",
        answerB = "Lactobacillus acidophilus",
        answerC = "Bifidobacterium longum",
        answerD = "Streptococcus thermophilus",
        correctAnswer = 0,
        explanation = "Fructilactobacillus sanfranciscensis (früher Lactobacillus sanfranciscensis) ist heterofermentativ und der charakteristische Leitorganismus des San-Francisco-Sauerbrots sowie vieler europäischer Sauerteige. Er vergärt Maltose bevorzugt zu Milchsäure, Essigsäure, Ethanol und CO₂.",
        difficulty = 5,
        funFact = "Der Name sanfranciscensis wurde 1971 vergeben, nachdem der Organismus im berühmten San-Francisco-Sauerteig entdeckt worden war — dieser Teig wird teilweise seit über 150 Jahren weitergepflegt."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Warum ist Sauerteig bei der Verwendung von Roggenmehl technologisch notwendig, während Weizenbrot auch ohne ihn backtechnisch funktioniert?",
        answerA = "Roggen hat keinen natürlichen Hefebesatz und braucht externe Mikroorganismen",
        answerB = "Roggen enthält Phytinsäure, die nur durch Alkohol gebunden werden kann",
        answerC = "Roggen enthält mehr Gluten, das ohne Säure nicht quillt",
        answerD = "Roggenmehl-eigene Amylasen bauen bei Backtemperaturen Stärke ab; die Säure des Sauerteigs hemmt diese Enzyme",
        correctAnswer = 3,
        explanation = "Roggenmehl enthält hitzestabile Amylasen, die auch während des Backens aktiv bleiben und die Stärke in wasserbindendes Dextrin verwandeln — das ergibt klebrige, unstrukturierte Krume. Die Milch- und Essigsäure des Sauerteigs senkt den pH auf ca. 4,0–4,5 und inhibiert diese Amylasen gezielt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Wie viele Milchsäurebakterien und Hefezellen befinden sich ungefähr in 1 Gramm aktivem Roggensauerteig?",
        answerA = "100 Millionen Bakterien und 1 Million Hefezellen",
        answerB = "1 Milliarde Bakterien und 10 Millionen Hefezellen",
        answerC = "1 Million Bakterien und 100.000 Hefezellen",
        answerD = "1 Billion Bakterien und 1 Milliarde Hefezellen",
        correctAnswer = 1,
        explanation = "In einem aktiven Roggensauerteig befinden sich pro Gramm etwa 10⁹ (1 Milliarde) Milchsäurebakterien und 10⁷ (10 Millionen) Hefezellen. Dieses Verhältnis von etwa 100:1 ist charakteristisch und stabil, da Bakterien und Hefen eine Symbiose bilden.",
        difficulty = 5,
        funFact = "Die Hefezellen und Milchsäurebakterien im Sauerteig konkurrieren nicht, sondern kooperieren: Hefen produzieren CO₂ für die Lockerung, Bakterien produzieren Säure zum Schutz beider."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem 'Triebvermögen' im Bäckereibegriff und welche Mikroorganismen sind primär dafür verantwortlich?",
        answerA = "Die Krustenbräunung — erzeugt durch Maillard-Reaktion mit Bakterienstoffwechsel",
        answerB = "Die Haltbarkeit des Brotes — erzeugt durch Essigsäurebakterien",
        answerC = "Die Fähigkeit des Teiges aufzugehen — erzeugt durch CO₂ der Sauerteighefen",
        answerD = "Die Süßkraft des Brotes — erzeugt durch Amylasen der Milchsäurebakterien",
        correctAnswer = 2,
        explanation = "Das Triebvermögen beschreibt die Fähigkeit des Teigs, durch Gasbildung aufzugehen und eine luftige Krumenstruktur zu entwickeln. Hauptverantwortlich sind Hefen (v. a. Saccharomyces cerevisiae und wildlebende Sauerteighefen), die CO₂ als Nebenprodukt der alkoholischen Gärung erzeugen.",
        difficulty = 5,
        funFact = null
    ),

    // ── KÄSE-REIFUNG ──────────────────────────────────────────────────────────

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welcher Edelschimmelpilz ist für die Blauschimmelbildung in Käsesorten wie Roquefort, Gorgonzola und Stilton verantwortlich?",
        answerA = "Aspergillus niger",
        answerB = "Penicillium roqueforti",
        answerC = "Penicillium camemberti",
        answerD = "Geotrichum candidum",
        correctAnswer = 1,
        explanation = "Penicillium roqueforti bildet die charakteristischen blauen bzw. blaugrünen Schimmeladern. Das Myzel wächst in den durch Nadeln eingestochenen Kanälen im Käse, wo Sauerstoffzutritt möglich ist. Es produziert Lipasen und Proteasen, die das Fett und Protein des Käses abbauen und den intensiven Geschmack erzeugen.",
        difficulty = 5,
        funFact = "Der ursprüngliche Roquefort darf nur in Höhlen bei Roquefort-sur-Soulzon im südfranzösischen Combalou gereift werden — die dortigen Luftströme transportieren natürliche Penicillium-roqueforti-Sporen."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welche Bakterienart ist für die charakteristischen Löcher (Augen) im Emmentaler Käse verantwortlich?",
        answerA = "Brevibacterium linens",
        answerB = "Lactobacillus helveticus",
        answerC = "Propionibacterium freudenreichii",
        answerD = "Leuconostoc lactis",
        correctAnswer = 2,
        explanation = "Propionibacterium freudenreichii (Propionsäurebakterien) vergärt Laktat zu Propionsäure, Essigsäure und CO₂. Das freigesetzte CO₂ kann nicht aus dem festen Käselaib entweichen und sammelt sich zu runden Gasblasen — den charakteristischen Emmentaler-Löchern.",
        difficulty = 5,
        funFact = "Die Größe der Emmentaler-Löcher wird in der Schweiz traditionell geregelt: Sie sollen zwischen einem 1-Franken-Stück und einem 2-Franken-Stück liegen."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was bewirkt Brevibacterium linens auf der Oberfläche von Rotschmierekäse wie Limburger oder Münster?",
        answerA = "Es produziert Kohlendioxid und lockert die Käsestruktur",
        answerB = "Es bildet die weiße Rinde durch Proteinausfällung",
        answerC = "Es erzeugt den orangeroten Farbton und das intensive Aroma durch Schwefelverbindungen",
        answerD = "Es bildet Propionsäure und schützt den Käse vor Schimmel",
        correctAnswer = 2,
        explanation = "Brevibacterium linens erzeugt durch Abbau schwefelhaltiger Aminosäuren (v. a. Methionin) flüchtige Schwefelverbindungen wie Methanethiol — verantwortlich für das intensive, stechende Aroma. Gleichzeitig produziert es Carotinoide, die dem Käse die orange-rötliche Farbe verleihen.",
        difficulty = 5,
        funFact = "Brevibacterium linens lebt auch auf menschlicher Haut und ist mitverantwortlich für den Geruch von Schweißfüßen — dasselbe Bakterium, das Limburger seinen intensiven Geruch gibt."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welches Lab-Enzym ist für die Milchgerinnung bei der Käseherstellung klassischerweise verantwortlich, und woher stammt es traditionell?",
        answerA = "Amylase — aus dem Speicheldrüsen von Wiederkäuern",
        answerB = "Rennet — aus Pflanzenmilch von Feigenbäumen",
        answerC = "Chymosin (Rennin) — aus dem Labmagen von Kälbern",
        answerD = "Pepsin — aus dem Magen von Schweinen",
        correctAnswer = 2,
        explanation = "Chymosin (auch Rennin) ist eine Aspartat-Protease, die aus dem Labmagen (Abomasum) von Kälbern gewonnen wird. Es spaltet spezifisch das κ-Casein, was zur Destabilisierung der Casein-Micellen und zur Bildung eines festen Gallerts führt. Heute wird Chymosin meist gentechnisch in Pilzen oder Hefen produziert.",
        difficulty = 5,
        funFact = "Vegetarischer Käse verwendet oft Chymosin aus gentechnisch veränderten Mikroorganismen (fermentation-produced chymosin, FPC) — heute macht dies über 90 % der weltweiten Chymosin-Produktion aus."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Lipolyse' im Kontext der Käsereifung?",
        answerA = "Die Umwandlung von Laktose in Milchsäure durch Bakterien",
        answerB = "Die Bildung von Schimmelsporen auf der Käseoberfläche",
        answerC = "Die Hydrolyse von Proteinen in Aminosäuren durch bakterielle Enzyme",
        answerD = "Den enzymatischen Abbau von Milchfett in freie Fettsäuren",
        correctAnswer = 3,
        explanation = "Lipolyse bezeichnet den enzymatischen Abbau von Triglyceriden (Milchfett) durch Lipasen in freie Fettsäuren und Glycerol. Diese freien Fettsäuren sind Vorläufer für viele Aromaverbindungen — besonders in Schimmelkäsen, wo Penicillium-Lipasen sehr aktiv sind und die intensiven Aromen erzeugen.",
        difficulty = 5,
        funFact = null
    ),

    // ── KOMBUCHA & WASSERKEFIR ─────────────────────────────────────────────────

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Was ist ein SCOBY und welche Funktion hat er bei der Kombucha-Herstellung?",
        answerA = "Eine symbiontische Gemeinschaft aus Bakterien und Hefen in einer Cellulose-Matrix — vergärt Tee und Zucker",
        answerB = "Ein Sterilisationsverfahren — sorgt für keimfreien Ansatz",
        answerC = "Ein spezielles Tongeschirr — wird für die anaerobe Fermentation benötigt",
        answerD = "Eine Zuckerart — wird von Hefen bevorzugt als Substrat genutzt",
        correctAnswer = 0,
        explanation = "SCOBY steht für 'Symbiotic Culture of Bacteria and Yeast'. Die Hefen (u. a. Brettanomyces, Zygosaccharomyces) vergären Zucker zu Ethanol und CO₂, während Essigsäurebakterien (v. a. Komagataeibacter xylinus) das Ethanol zu Essigsäure oxidieren und die Cellulose-Pellicle bilden.",
        difficulty = 5,
        funFact = "Komagataeibacter xylinus produziert die Cellulose-Matrix des SCOBY — dieselbe bakterielle Cellulose wird in der Medizintechnik als Wundauflage und in der Lebensmittelindustrie als Verdickungsmittel verwendet."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Welche organischen Säuren entstehen primär während der Kombucha-Fermentation?",
        answerA = "Zitronensäure und Apfelsäure",
        answerB = "Essigsäure und Gluconsäure (sowie Milchsäure)",
        answerC = "Salzsäure und Schwefelsäure",
        answerD = "Oxalsäure und Harnsäure",
        correctAnswer = 1,
        explanation = "Die Hauptsäuren im Kombucha sind Essigsäure (erzeugt durch Essigsäurebakterien aus Ethanol) und Gluconsäure (erzeugt durch Oxidation von Glukose). Zusätzlich entsteht Milchsäure durch milchsäureproduzierende Bakterien im SCOBY. Diese Säuremischung gibt Kombucha seinen charakteristischen Geschmack.",
        difficulty = 5,
        funFact = null
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Kefirkörner bestehen aus einer komplexen Gemeinschaft. Was ist die strukturbildende Substanz der Kefirkörner?",
        answerA = "Casein — Milchprotein, das die Bakterien verkittet",
        answerB = "Kefiran — ein Exopolysaccharid aus Glukose und Galaktose",
        answerC = "Chitin (wie in Pilzzellwänden)",
        answerD = "Cellulose — wie beim Kombucha-SCOBY",
        correctAnswer = 1,
        explanation = "Kefiran ist ein wasserlösliches Exopolysaccharid (EPS), das aus gleichen Teilen Glukose und Galaktose aufgebaut ist. Es wird hauptsächlich von Lactobacillus kefiranofaciens produziert und bildet das gallertartige Gerüst der Kefirkörner, in dem Bakterien und Hefen eingebettet sind.",
        difficulty = 5,
        funFact = "Kefiran hat in Studien entzündungshemmende und immunmodulierende Eigenschaften gezeigt — es wird als potenzielle Bioaktivsubstanz für funktionelle Lebensmittel erforscht."
    ),

    // ── ALKOHOLISCHE GÄRUNG & WEINHERSTELLUNG ─────────────────────────────────

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'malolaktischer Gärung' beim Weinausbau und welche Bakterienart ist hauptverantwortlich?",
        answerA = "Die Vergärung von Weinsäure zu Glycerol durch Essigsäurebakterien",
        answerB = "Die Vergärung von Restzucker zu Ethanol durch Hefen nach der Hauptgärung",
        answerC = "Die Bildung von Schwefelverbindungen durch Methoden-Hefen",
        answerD = "Die Umwandlung der harten Äpfelsäure in mildere Milchsäure durch Oenococcus oeni",
        correctAnswer = 3,
        explanation = "Bei der malolaktischen Gärung (MLF) decarboxyliert Oenococcus oeni L-Äpfelsäure zu L-Milchsäure und CO₂. Da Milchsäure nur ein Proton abgibt (einsäurig) gegenüber zwei bei Äpfelsäure (zweisäurig), wird der Wein säureärmer, weicher und runder. Sie ist bei Rotweinen fast immer erwünscht.",
        difficulty = 5,
        funFact = "Bei Weißweinen wird die malolaktische Gärung oft bewusst durch Schwefelung (SO₂) verhindert, um die frische, knackige Säure zu erhalten."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Wie viele Moleküle Ethanol und CO₂ entstehen bei der Vergärung eines Glukose-Moleküls durch Saccharomyces cerevisiae?",
        answerA = "3 Ethanol und 3 CO₂",
        answerB = "4 Ethanol und 2 CO₂",
        answerC = "2 Ethanol und 2 CO₂",
        answerD = "1 Ethanol und 1 CO₂",
        correctAnswer = 2,
        explanation = "Nach der Gay-Lussac-Gleichung: C₆H₁₂O₆ → 2 C₂H₅OH + 2 CO₂. Aus einem Molekül Glukose entstehen genau 2 Moleküle Ethanol und 2 Moleküle Kohlendioxid. Dieser Prozess läuft über den Embden-Meyerhof-Parnas-Weg und anschließende Pyruvat-Decarboxylierung ab.",
        difficulty = 5,
        funFact = null
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist 'Spontangärung' beim Wein und warum gilt sie als besonders anspruchsvoll?",
        answerA = "Gärung ausschließlich mit wildlebenden Hefen aus Weinberg und Kellerei ohne Reinzuchthefenzusatz",
        answerB = "Gärung ohne Schwefelzusatz — höheres Risiko mikrobiologischer Fehlentwicklungen",
        answerC = "Beschleunigte Gärung durch Sauerstoffzufuhr — fertig in wenigen Stunden",
        answerD = "Gärung ohne Temperaturkontrolle — Hefen arbeiten in schwankenden Temperaturen",
        correctAnswer = 0,
        explanation = "Spontangärung (auch Wildfermentation) nutzt ausschließlich die natürlich vorhandenen Hefen auf Trauben und im Keller. Da mindestens 16 verschiedene Hefestämme im Weinberg vorkommen, ist das Ergebnis weniger kontrollierbar, kann aber terroirgeprägte, komplexere Weine erzeugen. Das Risiko von Fehlgärungen ist deutlich höher.",
        difficulty = 5,
        funFact = "Viele Naturwein-Produzenten verzichten bewusst auf Reinzuchthefen und akzeptieren das Risiko der Spontangärung als Ausdruck des Terroirs."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welches Gärungsprodukt entsteht in Brauereien als Nebenprodukt und macht die Sterilität der Würze besonders kritisch?",
        answerA = "Bier gärt ausschließlich mit Wildhefen und braucht keine sterilen Bedingungen",
        answerB = "Die fehlende natürliche Mikroflora im Kochprozess — Fehlgärungsrisiko ist höher als beim Wein",
        answerC = "Der Hopfen sterilisiert alle unerwünschten Organismen vollständig",
        answerD = "Der niedrige pH-Wert verhindert selbst Kontaminationen",
        correctAnswer = 1,
        explanation = "Bierwürze hat nach dem Kochen einen pH von ca. 5,2 und enthält keine Weinsäure wie Traubenmost (pH 3,0–3,5). Dieser höhere pH bietet deutlich weniger natürlichen Schutz vor unerwünschten Mikroorganismen. Da die Würze steril aus dem Kochen kommt, müssen gezielt Reinzuchthefen zugegeben werden.",
        difficulty = 5,
        funFact = null
    ),

    // ── KIMCHI & WEITERE FERMENTE ─────────────────────────────────────────────

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welche Bakteriengemeinschaft dominiert in der späten Fermentationsphase von Kimchi?",
        answerA = "Streptococcus thermophilus und Lactobacillus delbrueckii",
        answerB = "Acetobacter aceti und Gluconobacter oxydans",
        answerC = "Leuconostoc citreum (frühe Phase) und Weissella confusa",
        answerD = "Lactobacillus sakei und Lactobacillus plantarum (späte Phase)",
        correctAnswer = 3,
        explanation = "Die Kimchi-Fermentation verläuft in Phasen: Zuerst dominieren Leuconostoc-Arten (heterofermentativ), die den pH schnell senken. In der späten Phase, wenn die Säurekonzentration hoch ist, übernehmen säuretolerante Lactobacillus-Arten wie L. sakei und L. plantarum.",
        difficulty = 5,
        funFact = "Kimchi enthält bis zu 10¹¹ (100 Milliarden) lebende Milchsäurebakterien pro Gramm bei optimaler Reife — damit ist es eines der probiotischsten Lebensmittel der Welt."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist 'Natto' und welcher Mikroorganismus ist für seine Fermentation verantwortlich?",
        answerA = "Fermentierter Reis — vergärt durch Aspergillus oryzae",
        answerB = "Fermentierte Süßkartoffeln — vergärt durch Saccharomyces cerevisiae",
        answerC = "Fermentierter Fisch — vergärt durch Lactobacillus brevis",
        answerD = "Fermentierte Sojabohnen — vergärt durch Bacillus subtilis var. natto",
        correctAnswer = 3,
        explanation = "Natto ist ein japanisches Nahrungsmittel aus fermentierten Sojabohnen, bei dem Bacillus subtilis var. natto die Proteine der Sojabohnen abbaut und dabei charakteristische klebrige Fäden (Polyglutaminsäure) und das Enzym Nattokinase produziert, das als Fibrinolytikum bekannt ist.",
        difficulty = 5,
        funFact = "Nattokinase — das Enzym aus Natto — löst in vitro Blutgerinnsel auf und wird in der traditionellen japanischen Medizin seit Jahrhunderten zur Herzkreislaufprävention genutzt."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welches Fermentationsprodukt aus Indonesien wird durch Rhizopus oligosporus hergestellt und ist reich an pflanzlichem Protein?",
        answerA = "Gochujang",
        answerB = "Doenjang",
        answerC = "Tempeh",
        answerD = "Taho",
        correctAnswer = 2,
        explanation = "Tempeh wird aus gekochten Sojabohnen hergestellt, die mit Rhizopus oligosporus inokuliert werden. Der Schimmelpilz durchwächst die Bohnen mit weißem Myzel und bindet sie zu einem festen Kuchen. Durch die Proteolyse werden antinutritive Faktoren abgebaut und die Proteine werden leichter verdaulich.",
        difficulty = 5,
        funFact = "Tempeh enthält neben vollständigem Protein auch Vitamin B12 — eines der wenigen pflanzlichen Lebensmittel mit nachgewiesenem aktivem B12-Gehalt."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist 'Garum' und welches Konservierungsprinzip macht es haltbar?",
        answerA = "Fermentierte Fischsoße aus der Antike — haltbar durch hohe Salzkonzentration (Halophilie)",
        answerB = "Geräucherter Käse aus dem antiken Rom — haltbar durch Rauch-Phenole",
        answerC = "Fermentiertes Traubenmost aus Griechenland — haltbar durch hohen Alkoholgehalt",
        answerD = "Getrocknetes Gemüse — haltbar durch vollständigen Wasserentzug",
        correctAnswer = 0,
        explanation = "Garum war die berühmte Fischsoße des antiken Roms. Fischinnereien wurden mit hohen Salzmengen (15–20 %) über Monate vergärt — die körpereigenen Proteasen der Fische (Autolyse) und halophile Bakterien bauen Proteine zu Aminosäuren und Peptiden ab. Die hohe Salzkonzentration verhindert Fäulnis.",
        difficulty = 5,
        funFact = "Garum war im antiken Rom so wertvoll wie heute guter Wein — die teuersten Sorten stammten aus Südspanien und wurden im gesamten Mittelmeerraum gehandelt."
    ),

    // ── JOGHURT & SCHMELZKÄSE ─────────────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welche zwei Bakterienstämme bilden die klassische Joghurtkultur und wie wirken sie symbiontisch zusammen?",
        answerA = "Lactobacillus bulgaricus und Streptococcus thermophilus — stimulieren sich gegenseitig durch Aminosäuren und CO₂",
        answerB = "Bifidobacterium bifidum und Lactobacillus acidophilus — nur getrennt aktiv",
        answerC = "Lactococcus lactis und Leuconostoc cremoris — produzieren Butter und Aroma",
        answerD = "Pediococcus damnosus und Oenococcus oeni — typisch für Bier und Wein",
        correctAnswer = 0,
        explanation = "Lactobacillus delbrueckii subsp. bulgaricus und Streptococcus thermophilus bilden das klassische Joghurt-Starter-Duo. S. thermophilus wächst zuerst und produziert CO₂ und Folsäure, die L. bulgaricus stimulieren. L. bulgaricus setzt dann Aminosäuren (v. a. Valin) frei, die S. thermophilus beschleunigen — eine echte Symbiose.",
        difficulty = 5,
        funFact = "Élie Metchnikoff, der Nobelpreisträger für Medizin, postulierte 1907 dass die Langlebigkeit der Bulgaren auf ihrem hohen Joghurtkonsum basiere — er popularisierte damit Joghurt in Westeuropa."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Bei welcher Temperatur werden klassische Joghurtkulturen inkubiert und warum ist diese Temperatur optimal?",
        answerA = "55–60 °C — pasteurisierungsnahe Temperatur für Sterilitätssicherung",
        answerB = "10–15 °C — kühle Gärung für besseres Aroma",
        answerC = "42–45 °C — optimale Temperatur für thermophile Joghurtbakterien",
        answerD = "20–25 °C — wie Raumtemperatur für mesophile Organismen",
        correctAnswer = 2,
        explanation = "S. thermophilus und L. bulgaricus sind thermophile Organismen mit einem Temperaturoptimum von 42–45 °C. Bei dieser Temperatur findet optimales Wachstum, schnelle Säuerung und die gewünschte Texturbildung statt. Unter 38 °C werden die Kulturen zu langsam; über 48 °C beginnt die Hemmung.",
        difficulty = 5,
        funFact = null
    ),

    // ── SCHIMMELKÄSE & REIFUNGSPROZESSE ──────────────────────────────────────

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Proteolyse' und 'Lipolyse' bei der Käsereifung bezüglich der entstehenden Aromen?",
        answerA = "Proteolyse senkt den pH; Lipolyse erhöht den pH",
        answerB = "Proteolyse ist nur bei Weichkäse aktiv; Lipolyse nur bei Hartkäse",
        answerC = "Proteolyse erzeugt fruchtige Esteraromen; Lipolyse erzeugt nussige Aromen",
        answerD = "Proteolyse erzeugt fleischige, würzige, manchmal bittere Noten; Lipolyse erzeugt scharfe, fettige, ranzige Noten",
        correctAnswer = 3,
        explanation = "Proteolyse durch Proteasen spaltet Casein in Peptide und freie Aminosäuren — diese erzeugen würzige, umami-reiche, manchmal bittere Aromen. Lipolyse durch Lipasen spaltet Fett in kurz- und mittelkettige Fettsäuren (Buttersäure, Capronsäure, Caprylsäure) — diese geben dem Käse scharfe, pikante, charakteristisch 'käsige' Noten.",
        difficulty = 5,
        funFact = "Im Parmigiano Reggiano dauert der Reifungsprozess mindestens 12, oft 24–36 Monate — die tiefe Proteolyse erzeugt die typischen weißen Kristalle (Tyrosin-Aminosäurekristalle) im reifen Parmesan."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welche Rolle spielt Geotrichum candidum bei der Reifung von Weichkäsen wie Brie und Camembert?",
        answerA = "Es ist für die rote Rotschmiere auf der Käseoberfläche verantwortlich",
        answerB = "Es produziert Propionsäure und bildet die charakteristischen Käselöcher",
        answerC = "Es kolonisiert als Hefe die Oberfläche, erhöht den pH und bereitet den Boden für Penicillium camemberti",
        answerD = "Es bildet die blaue Schimmelflora im Inneren des Käses",
        correctAnswer = 2,
        explanation = "Geotrichum candidum (auch als Hefe klassifiziert) bildet eine weiße, cremige Schicht auf der Käseoberfläche. Es deacidifiziert die Oberfläche (erhöht den pH durch Aminosäureabbau), was für Penicillium camemberti, das einen höheren pH bevorzugt, essentiell ist. Ohne G. candidum könnte P. camemberti nicht optimal wachsen.",
        difficulty = 5,
        funFact = null
    ),

    // ── FERMENTATIONSCHEMIE & KONSERVIERUNG ───────────────────────────────────

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welches Prinzip liegt der Fermentations-Konservierung grundlegend zugrunde — verglichen mit Trocknung oder Pasteurisierung?",
        answerA = "Temperaturerhöhung — Fermentationswärme tötet Pathogene ab",
        answerB = "Biologische Selbstkonservierung — Fermentationsprodukte (Säuren, Alkohol) schaffen ein lebensfeindliches Milieu für Pathogene",
        answerC = "Wasserentzug — wie bei Trocknung, aber durch Osmose der Fermentationsprodukte",
        answerD = "Sauerstoffanreicherung — aerobe Bedingungen töten anaerobe Fäulnisbakterien",
        correctAnswer = 1,
        explanation = "Fermentation nutzt die eigenen Stoffwechselprodukte von Mikroorganismen als Konservierungsmittel: Milchsäure und Essigsäure senken den pH, Alkohol denaturiert Proteine, CO₂ verdrängt Sauerstoff. Diese biologisch erzeugten Barrieren machen das Produkt selbstschützend — ohne externe Energiezufuhr wie Hitze.",
        difficulty = 5,
        funFact = "Das 'Hurdle-Konzept' der modernen Lebensmittelsicherheit beschreibt Fermentation als ideales Mehrfachbarrieren-System: pH + Aw-Wert + Konkurrenzflora + antimikrobielle Substanzen."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was sind 'Bacteriocine' und welche Bedeutung haben sie für die Lebensmittelsicherheit bei Fermentaten?",
        answerA = "Antimikrobielle Peptide, die von Milchsäurebakterien produziert werden und Pathogene hemmen",
        answerB = "Enzyme, die Proteine in Fermentaten abbauen und den Geschmack verbessern",
        answerC = "Lipide, die die Fettphase in Emulsionen stabilisieren",
        answerD = "Polysaccharide, die die Textur von Joghurt und Kefir verbessern",
        correctAnswer = 0,
        explanation = "Bacteriocine sind ribosomale Peptide mit antimikrobieller Wirkung. Das bekannteste ist Nisin (von Lactococcus lactis), das die Zellmembran grampostiver Bakterien destabilisiert. Bacteriocine können Listerien und Staphylokokken hemmen und werden als natürliche Konservierungsmittel in Lebensmitteln eingesetzt (E234).",
        difficulty = 5,
        funFact = "Nisin wurde 1969 von der WHO als sicheres Lebensmitteladditiv eingestuft und ist das einzige von Bakterien produzierte antimikrobielle Peptid, das als Lebensmittelzusatzstoff zugelassen ist."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Aw-Wert' (Wasseraktivität) und warum ist er für die Haltbarkeit fermentierter Lebensmittel relevant?",
        answerA = "Den Säuregehalt — niedrigerer pH bedeutet niedrigere Wasseraktivität",
        answerB = "Den Anteil des frei verfügbaren Wassers — Mikroorganismen benötigen Aw > 0,6 für Wachstum",
        answerC = "Den Alkoholgehalt — höherer Alkohol bedeutet bessere Haltbarkeit",
        answerD = "Die Osmolarität — gemessen in mOsm/kg",
        correctAnswer = 1,
        explanation = "Der Aw-Wert (0–1) beschreibt den Anteil des frei verfügbaren Wassers in einem Lebensmittel. Die meisten Bakterien brauchen Aw > 0,91, Hefen > 0,88, Schimmelpilze > 0,70. Fermentate mit hohem Salzgehalt oder Zuckergehalt haben einen niedrigen Aw-Wert — Salz und Zucker binden Wasser osmotisch und machen es für Pathogene unverfügbar.",
        difficulty = 5,
        funFact = null
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Welche Aminosäure ist für den Umami-Geschmack hauptverantwortlich und in welchen fermentierten Produkten ist sie besonders konzentriert?",
        answerA = "Lysin — konzentriert in Sauerteigbrot",
        answerB = "Methionin — konzentriert in Sauerkraut und Kimchi",
        answerC = "Tryptophan — konzentriert in Naturjoghurt",
        answerD = "Glutaminsäure (Glutamat) — konzentriert in Miso, Sojasoße, gereiftem Parmesan",
        correctAnswer = 3,
        explanation = "Glutaminsäure (als Glutamat) aktiviert Umami-Geschmacksrezeptoren (T1R1/T1R3-Heterodimer). Durch Proteolyse in Miso, Sojasoße und gereiftem Parmesan werden Proteine in freie Aminosäuren gespalten, wobei Glutaminsäure stark angereichert wird. Parmesan enthält bis zu 1200 mg Glutamat pro 100 g — eines der höchsten natürlichen Vorkommen.",
        difficulty = 5,
        funFact = "Kikunae Ikeda entdeckte 1908 Umami als fünfte Geschmacksrichtung — inspiriert durch die intensive Würze von Kombu-Dashi. Er isolierte Glutaminsäure aus Meeresalgen und patentierte Mononatriumglutamat."
    ),

    // ── KOJI-FERMENTATION (VERTIEFT) ──────────────────────────────────────────

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welchen modernen westlichen Anwendungsbereich hat Koji außerhalb der traditionellen asiatischen Küche erschlossen?",
        answerA = "Als Emulgator in der Schokoladen-Herstellung",
        answerB = "Zur schnellen Reifung von Fleisch, Fisch und zur Umami-Intensivierung ohne Salz",
        answerC = "Als Backhefe-Ersatz für glutenfreies Brot",
        answerD = "Als Farbstoff für rote Lebensmittel durch Monascus-Pigmente",
        correctAnswer = 1,
        explanation = "Koji-Fermentation wird in der modernen westlichen Spitzenküche (u. a. Noma, Kopenhagen) genutzt, um Fleisch und Fisch durch Amylase und Protease-Aktivität schnell zu 'altern' — ein Prozess der sonst Wochen oder Monate dauert. Koji-Rub auf Fleisch erzeugt in 48–72 Stunden tiefe Umami-Aromen, die Jus-artige Texturen und karamellartige Röst-Noten.",
        difficulty = 5,
        funFact = "Das Noma-Fermentationslabor in Kopenhagen veröffentlichte 2018 'The Noma Guide to Fermentation' — eines der einflussreichsten Fermentationsbücher, das Koji in der westlichen Haute Cuisine etablierte."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welches Nukleotid entsteht beim Koji-Prozess und verstärkt synergistisch den Umami-Geschmack?",
        answerA = "NAD (Nicotinamid-Adenin-Dinukleotid)",
        answerB = "cAMP (zyklisches Adenosinmonophosphat)",
        answerC = "ATP (Adenosintriphosphat)",
        answerD = "5'-Inosinmonophosphat (IMP) und 5'-Guanosinmonophosphat (GMP)",
        correctAnswer = 3,
        explanation = "Nucleasen von Aspergillus oryzae spalten RNA in 5'-Nukleotide wie IMP und GMP. Diese Nukleotide sind selbst mild umami, aber in Kombination mit Glutamat verstärken sie den Umami-Geschmack synergistisch um das bis zu 30-fache — das Phänomen heißt 'Umami-Synergismus' oder 'Kokumi-Effekt'.",
        difficulty = 5,
        funFact = null
    ),

    // ── ESSIGSÄUREGÄRUNG & WEINESSIG ──────────────────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welche Bakterienart bildet die 'Essigmutter' bei der traditionellen Essigherstellung?",
        answerA = "Acetobacter aceti und Komagataeibacter europaeus",
        answerB = "Gluconobacter cerinus",
        answerC = "Pediococcus damnosus",
        answerD = "Lactobacillus acetotolerans",
        correctAnswer = 0,
        explanation = "Die Essigmutter ist eine schwimmende Cellulose-Schicht, gebildet hauptsächlich von Acetobacter aceti und Komagataeibacter (früher Gluconacetobacter) europaeus. Diese Essigsäurebakterien oxidieren Ethanol aerob zu Essigsäure — für diese Reaktion ist Sauerstoff zwingend notwendig (strikt aerob).",
        difficulty = 5,
        funFact = "Balsamico-Essig aus Modena reift traditionell 12–25 Jahre in einer Batterie aus verschiedenen Holzfässern (Maulbeere, Kirsche, Kastanie, Eiche) — jedes Jahr wird Essig entnommen und aufgefüllt."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Warum können Essigsäurebakterien im Gegensatz zu Milchsäurebakterien keine anaerobe Fermentation betreiben?",
        answerA = "Sie besitzen keinen Stoffwechselweg für anaerobe Energiegewinnung und sind strikt auf die aerobe Oxidation von Ethanol angewiesen",
        answerB = "Sie sind zu groß und können nicht in Flüssigkeiten wachsen",
        answerC = "Sie produzieren Sauerstoff als Stoffwechselprodukt und töten sich unter anaeroben Bedingungen selbst",
        answerD = "Sie benötigen Licht für ihre Enzyme — ohne Licht kein Stoffwechsel",
        correctAnswer = 0,
        explanation = "Essigsäurebakterien (Acetobacter, Komagataeibacter) sind strikt aerob und nutzen die Atmungskette mit Sauerstoff als terminalem Elektronenakzeptor. Sie oxidieren Ethanol zu Essigsäure über den Membran-gebundenen ADH/ALDH-Komplex. Ohne Sauerstoff sterben sie oder stellen den Stoffwechsel ein.",
        difficulty = 5,
        funFact = null
    ),

    // ── TRADITIONELLE KONSERVIERUNG (ÜBERGREIFEND) ────────────────────────────

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pökeln' und welche chemische Reaktion schützt gepökeltes Fleisch vor Botulinum-Toxin?",
        answerA = "Trocknen unter Vakuum — Wasserentzug verhindert Toxinbildung",
        answerB = "Einlegen in Essig — Säure hemmt Clostridium botulinum direkt",
        answerC = "Salzen mit Nitrit — Nitrit hemmt Clostridium botulinum durch Bildung von Nitrosomyoglobin und direkte antimikrobielle Wirkung",
        answerD = "Räuchern mit Phenolverbindungen — Rauch-Phenole denaturieren das Botulinum-Toxin",
        correctAnswer = 2,
        explanation = "Pökeln mit Natriumnitrit (NaNO₂) schützt Fleisch auf mehreren Wegen: Nitrit hemmt direkt die Keimung von Clostridium-botulinum-Sporen und deren Toxinproduktion. Gleichzeitig reagiert Nitrit mit Myoglobin zu Nitrosomyoglobin (rote Farbe). Die genauen antimikrobiellen Mechanismen sind noch nicht vollständig geklärt.",
        difficulty = 5,
        funFact = "Botulinum-Toxin ist das giftigste bekannte Protein — die letale Dosis beim Menschen beträgt ca. 1,3–2,1 ng/kg Körpergewicht intravenös. In winzigen, kontrollierten Mengen ist es als Botox medizinisch zugelassen."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was ist 'Konfit' und wie unterscheidet sich das zugrunde liegende Konservierungsprinzip von Fermentation?",
        answerA = "Konfit ist Fleisch in Fett eingelegt und haltbar durch Sauerstoffabschluss und Fett als physische Barriere — kein biologischer Prozess",
        answerB = "Konfit ist fermentiertes Fett — Lipasen der Milchsäurebakterien machen es haltbar",
        answerC = "Konfit ist geräuchertes Fleisch — Phenole des Rauchs wirken antibakteriell",
        answerD = "Konfit ist durch Osmose konserviert — Zucker entzieht Wasser wie bei Marmelade",
        correctAnswer = 0,
        explanation = "Konfit (franz.: confire = einmachen) ist traditionell Fleisch (v. a. Ente, Gans), das im eigenen Fett gegart und dann vollständig von Fett bedeckt aufbewahrt wird. Das Fett bildet eine physische Sauerstoffbarriere — ohne Sauerstoff kein aerobes Wachstum. Zusätzlich ist das Fleisch durch das Garen steril. Kein Fermentationsprozess ist beteiligt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'wilde Fermentation' von 'kontrollierten Starterkulturen' aus lebensmitteltechnologischer Sicht?",
        answerA = "Wilde Fermentation ergibt immer komplexere Aromen; Starterkulturen nur einfache",
        answerB = "Wilde Fermentation ist immer gefährlicher und wird industriell nicht eingesetzt",
        answerC = "Starterkulturen fermentieren schneller, wilde Fermentation dauert immer länger",
        answerD = "Wilde Fermentation nutzt die natürliche Mikroflora des Substrats/Umfelds; Starterkulturen sind definierte, ausgewählte Reinkulturen für konsistente Ergebnisse",
        correctAnswer = 3,
        explanation = "Wilde Fermentation (z. B. Spontangärung, traditionelles Sauerkraut) nutzt die natürlich vorhandene Mikroflora aus Rohstoff und Umgebung — Ergebnisse variieren je nach Saison und Standort. Starterkulturen sind gezüchtete, definierte Reinkulturen, die konsistente, vorhersagbare Ergebnisse liefern und industriell standard sind.",
        difficulty = 5,
        funFact = "Die erste kommerzielle Starterkulturen-Industrie entstand in den 1870er Jahren für Brauhefen — Emil Christian Hansen von der Carlsberg-Brauerei isolierte 1883 erstmals eine Reinzuchthefe."
    ),

    // ── METABOLISMUS & BIOLOGIE DER FERMENTATION ─────────────────────────────

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was ist 'Katabolit-Repression' im Kontext von Sauerteig-Bakterien und wie beeinflusst sie die Aromenbildung?",
        answerA = "Glukose hemmt die Aufnahme von Maltose — führt zu mehr Essigsäure wenn Maltose abgebaut wird",
        answerB = "Milchsäure hemmt die Hefefermentation — verhindert Alkohol in Sauerteig",
        answerC = "CO₂ hemmt alle Fermentationsenzyme über allosterische Regulation",
        answerD = "Salz hemmt die Proteasen — verhindert Glutenabbau im Sauerteig",
        correctAnswer = 0,
        explanation = "In Sauerteig zeigen manche heterofermentativen Milchsäurebakterien eine Katabolit-Repression: Bei Anwesenheit von Glukose wird die Maltose-Transporterexpression gehemmt. Wenn Glukose verbraucht ist, beginnt der Maltoseabbau. Da Maltoseabbau über den Phosphoketolase-Weg zu mehr Essigsäure führt, beeinflusst das Timing der Substratverfügbarkeit das Milch-/Essigsäure-Verhältnis.",
        difficulty = 5,
        funFact = null
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Welcher Prozess ist für die charakteristische weiße Blüte ('Bloom') auf der Oberfläche gereifter Schokolade verantwortlich — und ist Fermentation dabei beteiligt?",
        answerA = "Salzausblühung — Milchsäurefermentation setzt Salze frei",
        answerB = "Schimmelwachstum — Fermentation durch Penicillium-Arten verändert die Kakaobohnen-Oberfläche",
        answerC = "Hefeblüte — Hefen aus der Kakaobohnenfermentation wachsen an der Oberfläche weiter",
        answerD = "Fettblüte — Migration und Rekristallisation von Kakaobutter-Triglyceriden (kein Fermentationsprozess)",
        correctAnswer = 3,
        explanation = "Schokoladen-'Bloom' ist ein physikalisch-chemischer Prozess: Bei Temperaturschwankungen wandern flüssige Fettanteile der Kakaobutter an die Oberfläche und rekristallisieren in der instabilen β'-Form (statt der stabilen β-Form). Obwohl Kakaobohnen durch Fermentation verarbeitet werden, hat der Bloom nichts mit aktiven Mikroorganismen zu tun.",
        difficulty = 5,
        funFact = "Die Fermentation der Kakaobohnen (4–8 Tage) ist essentiell für die Schokoladenqualität: Hefen, Milchsäure- und Essigsäurebakterien bauen Fruchtfleisch ab und erzeugen Aromavorläufer im Bohnenkern."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was ist 'Quorum Sensing' und welche Rolle spielt es bei der Koordination von Fermentationsprozessen?",
        answerA = "Ein Messverfahren für die optimale Gärgefäßgröße in industriellen Anlagen",
        answerB = "Chemische Kommunikation zwischen Bakterien über Signalmoleküle, die bei Erreichen einer Zelldichte-Schwelle kollektives Verhalten auslösen",
        answerC = "Die Methode zur Bestimmung der idealen Starterkultur-Konzentration",
        answerD = "Ein Enzym-Komplex, der bei der Käsereifung Proteine koordiniert abbaut",
        correctAnswer = 1,
        explanation = "Beim Quorum Sensing produzieren Bakterien kleine Signalmoleküle (Autoinduktoren, z. B. AHL). Wenn ihre Konzentration (= Zelldichte) einen Schwellenwert überschreitet, aktivieren Bakterien kollektiv spezifische Gene. In Fermentaten kann dies die koordinierte Produktion von Bacteriocinen, Biofilmen oder Fermentationsenzymen steuern.",
        difficulty = 5,
        funFact = "Quorum Sensing wurde 1970 in Vibrio fischeri entdeckt — dem biolumineszenten Meeresorganismus, der nur leuchtet wenn genug Zellen vorhanden sind, um sichtbares Licht zu erzeugen."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist 'Shoyu' (japanische Sojasoße) und wie unterscheidet sich der Fermentationsprozess von Miso?",
        answerA = "Shoyu ist identisch mit Miso, wird aber aus Gerste statt Reis hergestellt",
        answerB = "Shoyu ist eine Alkohol-Marinade — hergestellt durch reine Hefegärung ohne Schimmelpilze",
        answerC = "Shoyu ist ein Essig aus Sojabohnen — fermentiert durch Essigsäurebakterien statt Schimmel",
        answerD = "Shoyu ist eine flüssige, gesalzene Würzsoße — hergestellt durch Koji-Fermentation von Sojabohnen mit Weizen, anschließend ausgepresst statt als Paste belassen",
        correctAnswer = 3,
        explanation = "Shoyu (Sojasoße) und Miso teilen die Koji-Phase (Aspergillus oryzae auf Soja + Weizen), aber Shoyu wird nach der Fermentation durch Pressen der Maische gewonnen — es entsteht eine klare, flüssige Würzsoße. Miso ist eine fermentierte Paste, die nicht ausgepresst wird. Shoyu fermentiert typischerweise 6–12 Monate.",
        difficulty = 5,
        funFact = null
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welches historische Ereignis gilt als Beginn der wissenschaftlichen Mikrobiologie der Fermentation und wer entdeckte es?",
        answerA = "Louis Pasteur bewies 1857, dass Milchsäuregärung durch lebende Mikroorganismen und nicht durch chemische Katalyse verursacht wird",
        answerB = "Robert Koch entdeckte 1876, dass Bacillus anthracis Milch säuert und damit die Fermentationstheorie begründete",
        answerC = "Justus von Liebig bewies 1840, dass Fermentation ein rein chemischer Prozess ohne Lebewesen ist — was sich später als richtig herausstellte",
        answerD = "Alexander Fleming entdeckte 1928 Penicillium roqueforti und begründete damit die Fermentationsforschung",
        correctAnswer = 0,
        explanation = "Louis Pasteur bewies 1857 durch exakte Experimente, dass die Milchsäuregärung von lebenden Milchsäurebakterien verursacht wird — nicht durch rein chemische Prozesse, wie Justus von Liebig behauptet hatte. Diese Entdeckung begründete die wissenschaftliche Mikrobiologie und widerlegte die Urzeugungstheorie entscheidend.",
        difficulty = 5,
        funFact = "Pasteur prägte auch den Begriff 'Pasteurisierung' — das nach ihm benannte Erhitzungsverfahren zur Keimreduktion, das er 1864 zur Haltbarmachung von Wein entwickelte."
    )

)
