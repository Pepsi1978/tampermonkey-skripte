package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert2(): List<Question> = listOf(

    // ── MALOLAKTISCHE GÄRUNG & WEINCHEMIE ─────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welches Bakterium ist in der Weinherstellung hauptsächlich für die malolaktische Gärung (MLF) verantwortlich?",
        answerA = "Lactobacillus plantarum",
        answerB = "Acetobacter aceti",
        answerC = "Oenococcus oeni",
        answerD = "Pediococcus damnosus",
        correctAnswer = 2,
        explanation = "Oenococcus oeni ist das primäre Bakterium der MLF. Es ist säure- und alkoholtolerant und wandelt Apfelsäure in Milchsäure und CO₂ um. Dabei sinkt der Gesamtsäuregehalt, und es entsteht Diacetyl, das den charakteristischen Buttergeschmack mancher Weißweine (besonders Chardonnay) verursacht.",
        difficulty = 4,
        funFact = "Oenococcus oeni wurde erst 2002 vollständig sequenziert — sein Genom ist auf das Überleben in sauren, alkoholreichen Umgebungen spezialisiert."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Begriff 'biologischer Säureabbau' (BSA) im Weinbau, und durch welchen chemischen Vorgang wird er ausgelöst?",
        answerA = "Chemische Entfernung von Weinsäure durch Kaliumhydrogentatrat-Fällung",
        answerB = "Enzymatischer Abbau von Weinsäure durch Pektinase-Enzyme",
        answerC = "Bakterielle Umwandlung von L-Äpfelsäure (2 COOH) in L-Milchsäure (1 COOH) und CO₂",
        answerD = "Physikalische Kältefällung von Tartrat-Kristallen bei unter 0 °C",
        correctAnswer = 2,
        explanation = "Der BSA (biologischer Säureabbau) ist die malolaktische Gärung: Milchsäurebakterien decarboxylieren L-Äpfelsäure zu L-Milchsäure und CO₂. Da Milchsäure nur eine Carboxylgruppe hat (statt zwei bei Apfelsäure), wirkt der Wein weicher und runder. Der titrierbare Säuregehalt sinkt um 1–3 g/l.",
        difficulty = 4,
        funFact = null
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Welche Rolle spielen Anthocyane im Rotwein und welcher Prozess macht sie langfristig stabil?",
        answerA = "Anthocyane sind verantwortlich für das Tanningefühl; sie werden durch Oxidation stabil",
        answerB = "Anthocyane verleihen die rote Farbe; sie stabilisieren sich durch Kondensation mit Tanninen zu Pyranoanthocyanen",
        answerC = "Anthocyane erzeugen Fruchtaromen; Hitze macht sie dauerhaft haltbar",
        answerD = "Anthocyane sind Konservierungsstoffe; SO₂ bindet sie langfristig",
        correctAnswer = 1,
        explanation = "Anthocyane (Malvidin, Peonidin, Cyanidin) geben Rotwein die purpurrote Farbe. Sie sind instabil und kondensieren mit Tanninen zu polymeren Pigmenten (Pyranoanthocyane, Vitisin A/B). Diese Kondensationsprodukte sind farbstabiler und erklären, warum ältere Rotweine orange-ziegelrote Töne annehmen.",
        difficulty = 4,
        funFact = "Die Farbe eines Rotweins gibt dem Sommelier Hinweise auf Alter, Rebsorte und Vinifikation — Blauviolett bedeutet jung, Ziegelrot bedeutet reif."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Was ist 'Reduktion' im Weinkontext und wodurch entsteht der typische Schwefelwasserstoff-Geruch?",
        answerA = "Zu viel Sauerstoff während der Gärung; entsteht durch Oxidation der Phenole",
        answerB = "Barrique-Aromen überdecken Fruchtnoten; entsteht durch Toasting des Holzes",
        answerC = "Zu frühe Ernte mit hohem Säuregehalt; entsteht durch unvollständige Maische-Mazeration",
        answerD = "Hefestress durch Nährstoffmangel (v. a. Stickstoff/Thiamin) führt zur Produktion von H₂S durch cysteinolytische Reaktionen",
        correctAnswer = 3,
        explanation = "Reduktionsfehler entstehen, wenn Hefen unter Stress (Stickstoffmangel, Vitamin-B1-Mangel) Schwefelverbindungen produzieren. H₂S (fauler Ei-Geruch) entsteht durch Reduktion von Sulfat oder Cystein. Höhere Mercaptane (Methanthiol, Dimethylsulfid) entstehen im Laufe der Reifung. Belüftung und Kupfersulfat (Kleinstdosen) können Abhilfe schaffen.",
        difficulty = 4,
        funFact = null
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Was ist 'Korkton' (TCA) in einem Wein und welche chemische Verbindung ist dafür verantwortlich?",
        answerA = "Ein Oxidationsdefekt durch zu frühe Belüftung; verursacht durch Acetaldehyd",
        answerB = "Ein Brettanomyces-Fehler; verursacht durch 4-Ethylphenol",
        answerC = "Eine Kontamination durch 2,4,6-Trichloranisol (TCA), das aus Chlorverbindungen und Schimmelpilzen im Kork entsteht",
        answerD = "Ein Gärfehler durch Essigsäure-Bakterien; verursacht durch Ethylacetat",
        correctAnswer = 2,
        explanation = "2,4,6-Trichloranisol (TCA) entsteht, wenn Schimmelpilze (Trichoderma, Penicillium) Chlorphenole methylieren — eine Reaktion, die durch Chlor aus Bleichmitteln ausgelöst wird. TCA hemmt die Geruchswahrnehmung und lässt Wein muffig, nach feuchtem Karton oder Keller riechen. Die Geruchsschwelle liegt unter 2 ng/l.",
        difficulty = 4,
        funFact = "Schätzungsweise 3–8 % aller korkverschlossenen Weine sind in gewissem Grad von TCA betroffen — weshalb Glasverschlüsse und Schraubkappen zunehmend beliebt sind."
    ),

    // ── TERROIR & WEINBAU ──────────────────────────────────────────────────────

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Was versteht die Oenologie unter 'Terroir' als messbarem Konzept und welcher analytische Parameter kann Herkunft beweisen?",
        answerA = "Terroir ist nur subjektiv; kein messbarer Parameter existiert",
        answerB = "Bodenmineral-Isotopenverhältnisse (Strontium 87Sr/86Sr) im Wein spiegeln die geologische Signatur des Standorts wider",
        answerC = "Alkoholgehalt und pH-Wert sind die einzigen messbaren Terroir-Parameter",
        answerD = "Nur der Zucker-Säure-Quotient bei der Ernte definiert das Terroir messbar",
        correctAnswer = 1,
        explanation = "Isotopen-Fingerabdrücke, besonders Strontium (87Sr/86Sr), Sauerstoff (18O/16O) und Stickstoff (15N/14N), sind herkunftsspezifisch. Reben nehmen diese Isotope aus dem Boden auf; das Verhältnis im Wein ist charakteristisch für die Geologie des Anbaugebiets. Diese Methode wird von Zollbehörden zur Weinbetrugserkennung eingesetzt.",
        difficulty = 4,
        funFact = null
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'kontinentales' von 'ozeanischem' Weinbauklima und welchen Einfluss hat das auf Rebsorten-Wahl?",
        answerA = "Kontinental: kalte Winter, heiße trockene Sommer, hohe Temperaturschwankung Tag/Nacht → Aromatische Riesling, Pinot Noir; Ozeanisch: moderate Temperaturen durch Meereseinfluss → Cabernet Sauvignon, Merlot",
        answerB = "Beide Klimatypen eignen sich gleich gut für alle Rebsorten; Klimaeinfluss ist minimal",
        answerC = "Kontinental: milde Winter, hohe Sommerfeuchtigkeit → Bordeaux-Sorten; Ozeanisch: heiße trockene Sommer → Riesling",
        answerD = "Kontinental bedeutet nur Regenmangel; ozeanisch bedeutet nur hohe Luftfeuchtigkeit",
        correctAnswer = 0,
        explanation = "Kontinentales Klima (z. B. Burgund, Mosel, Rheingau) hat kalte Winter und heiße Sommer mit großen Tag-Nacht-Temperaturunterschieden. Diese Diurnal Range erhält Aromen und Säure in Trauben. Ozeanisches Klima (Bordeaux, Loire) ist durch den Atlantik gemäßigt und gleichmäßiger — ideal für spätreifende Sorten wie Cabernet Sauvignon.",
        difficulty = 4,
        funFact = "Die Mosel hat weltweit die steilsten Weinberglagen (bis 70° Neigung) — nur Handarbeit ist möglich, Maschinen können nicht fahren."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Was ist 'Boden-Drainage' im Weinbau und warum bevorzugen Qualitätsweinproduzenten dränierte, magere Böden gegenüber fruchtbaren?",
        answerA = "Fruchtbare Böden erzeugen höhere Erträge und damit mehr Qualität; Drainage ist für Süßweine wichtig",
        answerB = "Schlecht drainierte Böden fördern Traubenqualität durch höheren Wassergehalt in Trockenperioden",
        answerC = "Gut drainierte, nährstoffarme Böden zwingen Reben zur Tiefwurzelung, reduzieren Triebwuchs und konzentrieren Aromen in kleinere Beeren",
        answerD = "Drainage ist nur für Botrytis-anfällige Sorten relevant; bei robusten Sorten spielt sie keine Rolle",
        correctAnswer = 2,
        explanation = "In stressigem, magerem Boden ohne übermäßige Wasserverfügbarkeit bilden Reben tiefe Wurzelsysteme (bis 15 Meter). Der Wasserstress zur Reifezeit konzentriert Zucker, Aromen und Phenole in kleinen, dichtschaligen Beeren. Hohe Erträge auf fruchtbaren Böden verdünnen diese Substanzen. Das Prinzip 'Stress macht Qualität' ist im Weinbau zentral.",
        difficulty = 4,
        funFact = null
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Was ist 'Veraison' im Weinbaujahr und welche biochemischen Veränderungen finden während dieser Phase statt?",
        answerA = "Der Farbumschlag der Beeren von grün zu rot/gelb, verbunden mit Zuckeranstieg, Säureabbau und Erweichung",
        answerB = "Die Rebblüte im Mai/Juni; Anthocyane beginnen sich zu bilden",
        answerC = "Die Winterruhe der Rebe; Stärke wird in Zucker umgewandelt",
        answerD = "Das Entblättern zur Sonneneinstrahlung; Chlorophyll wird abgebaut",
        correctAnswer = 0,
        explanation = "Véraison (frz.) bezeichnet den Reifebeginn der Trauben: Rote Sorten entwickeln Anthocyane (Farbumschlag grün → violett), weiße Sorten werden transparent-gelb. Gleichzeitig steigen Beerenzucker (Glucose, Fructose) stark an, die Weinsäure und Apfelsäure nehmen ab, die Beeren erweichen durch Pektin-Abbau, und Aromavorläufer akkumulieren.",
        difficulty = 4,
        funFact = "Der Zeitpunkt der Véraison im August/September gibt Winzern eine 40–50-Tage-Prognose für den Erntetermin."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Was ist 'Grünlese' (Vendange verte) und welchen Einfluss hat sie auf das Qualitätspotenzial der verbleibenden Beeren?",
        answerA = "Das gezielte Entfernen unreifer Traubenteile oder ganzer Trauben im Sommer zur Reduktion des Ertrags und Konzentration der Aromen",
        answerB = "Die Ernte unreifer Trauben im August für säurebetonte Schaumweine",
        answerC = "Das Entfernen aller grünen Blätter zur besseren Belüftung der Traubenzone",
        answerD = "Eine Schnitttechnik im Winter zur Reduktion der Triebanzahl im Folgejahr",
        correctAnswer = 0,
        explanation = "Grünlese (Vendange verte) ist eine Ertragsbeschränkung im Juli/August: überschüssige oder unreife Trauben werden entfernt. Die Rebe konzentriert ihre Ressourcen auf die verbleibenden Trauben — kleinere Beeren, höhere Zuckerkonzentration, intensivere Phenole. In der EU gibt es AOC-Vorschriften zu Maximalerträgen (z. B. Burgundy Grand Cru: 35 hl/ha).",
        difficulty = 4,
        funFact = null
    ),

    // ── WEINKLASSIFIKATION & APPELLATIONEN ────────────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Bordeaux-Klassifikationssystem von 1855' und was hat sich seit seiner Einführung geändert?",
        answerA = "Eine jährlich aktualisierte Liste; alle Châteaux werden regelmäßig neu bewertet",
        answerB = "Eine von Napoleon III. geordnete Einstufung in 5 Crus classés; seit 1855 wurde nur Mouton Rothschild 1973 von 2ème auf 1er Cru erhöht",
        answerC = "Ein System für das gesamte Bordeaux; Pomerol und Saint-Émilion sind ebenfalls erfasst",
        answerD = "Eine Qualitätsskala basierend auf Hektarertrag; wird alle 10 Jahre aktualisiert",
        correctAnswer = 1,
        explanation = "Das System von 1855 klassifizierte 61 Médoc-Châteaux und Château d'Yquem (Sauternes) in 5 Stufen für die Pariser Weltausstellung. Es basierte auf Marktpreisen der Zeit. Seit 1855 gab es nur eine Änderung: Mouton Rothschild wurde 1973 auf Dekret von Präsident Pompidou von 2ème zu 1er Grand Cru classé hochgestuft. Pomerol besitzt bis heute keine offizielle Klassifikation.",
        difficulty = 4,
        funFact = "Pétrus (Pomerol) ist eines der teuersten Weine weltweit, obwohl es keine offizielle Klassifikation besitzt — Ruf und Markt ersetzen das System."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Premier Cru' im Burgundsystem im Vergleich zu 'Grand Cru' und wie viele Grand Cru-Appellationen gibt es in der Côte d'Or?",
        answerA = "Premier Cru ist die höchste Stufe; Grand Cru ist eine Stufe darunter; 30 Grand Crus",
        answerB = "Grand Cru ist die höchste Stufe mit eigenständiger AOC; Premier Cru ist eine Stufe darunter; 33 Grand Crus in der Côte d'Or",
        answerC = "Beide Begriffe sind gleichwertig; der Unterschied liegt nur in der Lage-Größe",
        answerD = "Grand Cru bezieht sich auf Weingüter, Premier Cru auf einzelne Weinbergslagen; 10 Grand Crus",
        correctAnswer = 1,
        explanation = "Im Burgund besitzt Grand Cru eine eigene AOC (Appellation) ohne Gemeindenamen — z. B. 'Chambertin', nicht 'Gevrey-Chambertin'. Premier Cru steht auf dem Etikett mit Gemeinde + Lage. Die Côte d'Or hat 33 Grand Cru-AOPs, davon 8 in der Côte de Beaune (alle Weißweine: Montrachet, Corton-Charlemagne etc.) und 25 in der Côte de Nuits (Rotweine).",
        difficulty = 4,
        funFact = null
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Was ist 'Blanc de Blancs' und 'Blanc de Noirs' bei Champagner und welche Rebsorten werden jeweils verwendet?",
        answerA = "Blanc de Blancs: ausschließlich aus Chardonnay; Blanc de Noirs: aus roten Trauben (Pinot Noir, Pinot Meunier)",
        answerB = "Blanc de Blancs: aus Pinot Noir; Blanc de Noirs: aus Chardonnay",
        answerC = "Beide Begriffe sind gleichbedeutend und bezeichnen nur den Vinifikationsstil",
        answerD = "Blanc de Blancs: aus allen drei Champagner-Trauben; Blanc de Noirs: ohne Chardonnay",
        correctAnswer = 0,
        explanation = "Blanc de Blancs ('Weiß aus Weißen') wird ausschließlich aus Chardonnay-Trauben hergestellt und zeigt blumige, frische, minerale Noten mit Eleganz. Blanc de Noirs ('Weiß aus Schwarzen') wird aus roten Trauben (Pinot Noir und/oder Pinot Meunier) als Weißwein vinifiziert — minimale Maischekontaktzeit verhindert Farbextraktion. Er ist körperreicher mit Beerenfrüchten.",
        difficulty = 4,
        funFact = "Blanc de Noirs erfordert höchste Sorgfalt bei der Pressung — schon wenige Minuten Maischekontakt können rosafarbene Töne ergeben."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Dosage' und 'Disgorgement' (Dégorgement) bei der Champagner-Herstellung?",
        answerA = "Disgorgement ist die Zugabe des Zucker-Wein-Gemischs; Dosage ist die Entfernung des Hefedepots",
        answerB = "Disgorgement (Dégorgement) ist die Entfernung des Hefedepots nach der Flaschengärung; Dosage ist die anschließende Zugabe der Likörwein-Zuckerlösung zur Einstellung des Restzuckers",
        answerC = "Beide Begriffe bezeichnen denselben Prozess; das Entfernen der Hefe",
        answerD = "Dosage ist die erste Gärung im Stahltank; Disgorgement ist die zweite Gärung in der Flasche",
        correctAnswer = 1,
        explanation = "Nach der Flaschengärung (Méthode champenoise) setzt sich Hefedepot im Flaschenhals ab (Rütteln/Riddling). Beim Dégorgement (Disgorgement) wird der Flaschenhals eingefroren und das Hefepfropfen ausgestoßen. Die Dosage (Likörzugabe: Wein + Zucker) füllt das Volumen auf und bestimmt den Süßegrad: Brut Nature (0 g/l), Brut (<12 g/l), Extra Dry (12–17 g/l), Demi-Sec (33–50 g/l).",
        difficulty = 4,
        funFact = null
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Monopole' im Burgundsystem und welches ist das bekannteste Beispiel?",
        answerA = "Eine negociant-exklusive Abfüllung ohne AOC-Bindung",
        answerB = "Ein Weingut, das ausschließlich Grand Cru produziert; Domaine Leroy ist das bekannteste",
        answerC = "Eine Appellation mit nur einem zugelassenen Produzenten; Champagne ist das bekannteste Monopole",
        answerD = "Eine Weinlage, die sich im Alleinbesitz eines einzigen Weinguts befindet; La Romanée-Conti (Domaine de la Romanée-Conti)",
        correctAnswer = 3,
        explanation = "Im Burgund, wo Lagen typischerweise auf viele Eigentümer aufgeteilt sind (Climat-System), ist ein Monopole eine Ausnahme: eine komplette Lage im Alleinbesitz. Das bekannteste Monopole ist Romanée-Conti (1,8 ha Grand Cru, DRC-Besitz) — eine der teuersten Weinlagen weltweit. Weitere Monopoles: Musigny (komplett bei de Vogüé), La Tâche (DRC).",
        difficulty = 4,
        funFact = "Eine Flasche Romanée-Conti 1945 erzielte 2018 bei Sotheby's 558.000 US-Dollar — Weltrekord für eine einzelne Weinflasche."
    ),

    // ── WEINSERVICE & SOMMELIER-TECHNIK ───────────────────────────────────────

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Wann sollte ein Sommelier dekantieren und wann reicht einfaches Belüften, und was ist der fachliche Unterschied?",
        answerA = "Dekantieren und Belüften sind identisch; der Unterschied ist nur ästhetisch",
        answerB = "Dekantieren ist für alte Weine mit Sediment und stark verschlossene junge Rotweine; Belüften (Airer) reicht für leichte Weißweine; Karaffe ermöglicht mehr Sauerstoffkontakt als Belüfter",
        answerC = "Belüften ist immer ausreichend; Dekantieren schadet alten Weinen durch übermäßige Oxidation",
        answerD = "Alte Weine sollten niemals dekantiert werden; nur junge Rotweine profitieren vom Dekantieren",
        correctAnswer = 1,
        explanation = "Dekantieren verfolgt zwei Ziele: Sedimenttrennung (alte Rotweine ab ca. 10–15 Jahren mit Depot) und Belüftung (junge, tanninreiche Rotweine). Die Karaffe hat eine große Oberfläche und ermöglicht intensive Oxidation über 30 Minuten bis 2 Stunden. Ein Belüfter am Flaschenhals ist für schnellen, moderaten Sauerstoffkontakt geeignet. Sehr alte, fragile Weine sollten sanft und kurz dekantiert oder gar nicht karafiert werden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was ist 'Chambrieren' und warum ist der Begriff heute oenologisch teilweise veraltet?",
        answerA = "Das Schütteln der Flasche zur Aromabindung; veraltet wegen moderner Schraubkappen",
        answerB = "Das Abgießen von Weinen ohne Sediment; veraltet wegen moderner Filtrationstechnik",
        answerC = "Das langsame Erwärmen von Rotwein auf Zimmertemperatur (Chambre = Zimmer); veraltet, weil historische Zimmertemperaturen (16–18 °C) heute wärmer sind (20–22 °C) und zu hohe Temperaturen Alkohol betonen",
        answerD = "Das Abkühlen von Weißweinen im Eiskübel; veraltet wegen moderner Weinkühler",
        correctAnswer = 2,
        explanation = "Chambrieren bedeutet historisch, Rotwein auf 'Zimmertemperatur' zu bringen. Im 19. Jahrhundert war das 16–18 °C. Moderne Wohnräume haben 20–22 °C — zu warm für Rotwein. Bei zu hoher Trinktemperatur tritt Alkohol unangenehm in den Vordergrund. Die ideale Rotweintrintemperatur liegt je nach Stil bei 14–18 °C. Der Begriff überlebt als Konzept, aber die praktische Empfehlung lautet heute: leicht kühlen statt erwärmen.",
        difficulty = 4,
        funFact = "Studien zeigen, dass die meisten Konsumenten Rotwein zu warm trinken — selbst Sommeliers unterschätzen die optimale Trinktemperatur."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Was ist die optimale Servier-Temperatur für verschiedene Weinstile laut Sommelier-Standard?",
        answerA = "Alle Weißweine: 8 °C; alle Rotweine: 20 °C; Champagner: 15 °C",
        answerB = "Leichte Weißweine/Rosés: 8–10 °C; volle Weißweine/leichte Rotweine: 12–14 °C; Mittelschwere Rotweine: 15–17 °C; Kräftige Rotweine: 17–18 °C; Champagner: 8–10 °C",
        answerC = "Alle Weine optimal bei 18 °C; Schaumweine bei 5 °C",
        answerD = "Weißweine: 5–6 °C; Rotweine: 22–24 °C; keine Temperatur-Differenzierung nach Stil",
        correctAnswer = 1,
        explanation = "Servier-Temperaturen nach Weintyp: Champagner/Sekt/Prosecco: 6–8 °C; frische Weißweine (Riesling, Sauvignon Blanc): 8–10 °C; komplexe Weißweine (Burgunder, Chardonnay): 10–13 °C; Rosé und leichte Rotweine (Beaujolais, leichter Pinot): 12–14 °C; mittelschwere Rotweine (Bordeaux, Rioja): 15–17 °C; kräftige Rotweine (Barolo, Syrah): 17–18 °C. Über 18 °C Rotwein zu servieren ist ein Fehler.",
        difficulty = 4,
        funFact = null
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Wie erkennt ein Sommelier 'Brettanomyces' bei einer Blindverkostung und bei welcher Konzentration gilt es als Fehler?",
        answerA = "Durch eine intensiv buttrige Note; ab 50 mg/l 4-Ethylphenol",
        answerB = "Durch einen grünen, unreifen Geruch; erkennbar durch Methoxypyrazine",
        answerC = "Durch Korkton-ähnliche Noten; erkennbar durch TCA-Konzentration über 5 ng/l",
        answerD = "Durch Gerüche nach Stallmist, Leder, Pflaster oder Schweinhaut; 4-Ethylphenol ab ca. 600 µg/l gilt als fehlerhaft, darunter kann es als komplex gelten",
        correctAnswer = 3,
        explanation = "Brettanomyces bruxellensis produziert hauptsächlich 4-Ethylphenol (4-EP, Stallmist, Pflaster) und 4-Ethylguaiacol (4-EG, Leder, Räucherware) durch Decarboxylierung von Hydroxyzimtsäuren. Die Wahrnehmungsschwelle für 4-EP liegt bei ca. 230 µg/l; ab 600 µg/l wird es von den meisten Verkostern als Fehler eingestuft. In Burgund gilt ein Hauch als terroir-typisch.",
        difficulty = 4,
        funFact = "Brettanomyces überlebt in Barrique-Fässern und ist durch normale Reinigung kaum eliminierbar — kontaminierte Fässer müssen oft entsorgt werden."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Was ist die 'WSET'-Weinklassifikation und welche Niveaus gibt es bis zur höchsten Auszeichnung?",
        answerA = "Wine & Spirit Education Trust; Level 1–4, wobei Level 4 (Diploma) das höchste WSET-Niveau vor dem MW ist",
        answerB = "World Sommelier Expert Training; Level 1–3, wobei Level 3 dem Master Sommelier entspricht",
        answerC = "Wine Studies Excellence Training; drei Stufen, wobei Stufe 3 dem WSET Diploma gleichwertig ist",
        answerD = "World Service Education Trust; Level A–D, wobei Level D dem Niveau Master of Wine entspricht",
        correctAnswer = 0,
        explanation = "Der WSET (Wine & Spirit Education Trust) ist die weltweit führende Weinausbildungsorganisation mit Sitzen in London. Die Stufen: Level 1 (Einsteiger), Level 2 (Fortgeschrittene, ca. 30 Stunden), Level 3 (Intensiv, ca. 100 Stunden), Level 4 Diploma (höchstes WSET-Niveau, ca. 500+ Stunden). Das Diploma ist Zulassungsvoraussetzung für den MW (Master of Wine) der Institute of Masters of Wine.",
        difficulty = 4,
        funFact = null
    ),

    // ── REBSORTEN & HERKUNFT ───────────────────────────────────────────────────

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte ist genetisch der Elternteil sowohl von Cabernet Sauvignon als auch von Merlot?",
        answerA = "Cabernet Franc",
        answerB = "Carménère",
        answerC = "Malbec",
        answerD = "Petit Verdot",
        correctAnswer = 0,
        explanation = "DNA-Analysen (Bowers & Meredith, 1997) zeigten, dass Cabernet Sauvignon eine natürliche Kreuzung aus Cabernet Franc × Sauvignon Blanc ist. Merlot ist eine Kreuzung aus Cabernet Franc × Magdeleine Noire des Charentes. Cabernet Franc ist damit eine 'Elternrebe' beider wichtigster Bordeaux-Rotsorten. Carménère wurde lange mit Merlot verwechselt und gilt als genetisch verwandt.",
        difficulty = 4,
        funFact = "Diese genetische Entdeckung revolutionierte das Verständnis der Bordeaux-Rebsortenentwicklung — Cabernet Sauvignon ist jünger als beide Elternteile."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Nebbiolo'-Weinen Barolo und Barbaresco und welche gesetzlichen Mindestreifungen gelten?",
        answerA = "Barolo: mindestens 18 Monate Holzreifung, gesamt 3 Jahre (Riserva 5 Jahre); Barbaresco: 9 Monate Holz, gesamt 2 Jahre (Riserva 4 Jahre)",
        answerB = "Beide sind identisch; der Unterschied liegt nur in der geografischen Gemeinde",
        answerC = "Barolo reift 5 Jahre im Fass; Barbaresco ist ungeregelt und kann sofort verkauft werden",
        answerD = "Barbaresco ist generell süßer wegen höherem Restzucker; Barolo ist trocken",
        correctAnswer = 0,
        explanation = "Barolo DOCG (Piedmont): Mindestreifung 3 Jahre gesamt (davon mind. 18 Monate in Holz); Riserva: 5 Jahre. Barbaresco DOCG: 2 Jahre gesamt (davon mind. 9 Monate in Holz); Riserva: 4 Jahre. Beide verwenden 100 % Nebbiolo, aber Barbaresco aus leichteren Böden (Tanaro-Fluss) gilt als eleganter und früher zugänglich, Barolo ('König der Weine') als mächtiger und langlebiger.",
        difficulty = 4,
        funFact = null
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte steht hinter den Spitzenweinen 'Hermitage' und 'Côte-Rôtie' aus dem nördlichen Rhône-Tal?",
        answerA = "Syrah für Hermitage; Syrah mit bis zu 20 % Viognier für Côte-Rôtie",
        answerB = "Grenache Noir für beide AOCs",
        answerC = "Viognier (weiß) für beide AOCs als Ausnahme-Verschnittpartner",
        answerD = "Mourvèdre für Hermitage; Syrah für Côte-Rôtie",
        correctAnswer = 0,
        explanation = "Hermitage (Tain-l'Hermitage) erzeugt aus 100 % Syrah einen der langlebigsten und konzentriertesten Rotweine Frankreichs. Côte-Rôtie ('gerösteter Hang') ist ebenfalls Syrah-basiert, darf jedoch bis zu 20 % weiße Viognier-Trauben co-vergären (nicht verschneiden) — Viognier stabilisiert die Farbe und verleiht florale Noten. Diese Co-Fermentation ist weltweit einzigartig.",
        difficulty = 4,
        funFact = "Côte-Rôtie 'La Mouline' von Guigal enthält traditionell ca. 8 % Viognier — und erzielte beim Parker-System regelmäßig 100 Punkte."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pigeage' und wie unterscheidet es sich von 'Remontage' in der Rotweinherstellung?",
        answerA = "Pigeage ist maschinelles Umwälzen; Remontage ist Handarbeit — beide extrahieren Tannine",
        answerB = "Beide sind identisch; regionale Bezeichnungsunterschiede Frankreich vs. Italien",
        answerC = "Pigeage (Einstechen/Untertauchen der Maischeschicht von oben) fördert sanfte Extraktion; Remontage (Umpumpen des Mostes über die Maische) ist intensiver und extrahiert mehr Tannine und Farbe",
        answerD = "Pigeage ist die Mazerationszeit; Remontage ist die Gärtemperatur",
        correctAnswer = 2,
        explanation = "Pigeage (Punching Down): Die Traubenmaikschicht (Chapeau/Trommel), die durch CO₂ nach oben steigt, wird von oben in den Most eingestoßen. Schonende Methode, typisch für Burgund (Pinot Noir), erzeugt feinere Tannine. Remontage (Pumping Over): Most wird von unten abgezogen und über die Maische gepumpt. Intensivere Extraktion von Farbe und Tanninen, typisch für Bordeaux und Barossa.",
        difficulty = 4,
        funFact = null
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist 'Passito' und welche bekanntesten Stilweine werden nach dieser Methode hergestellt?",
        answerA = "Ein frisch gepresster Traubenmost für Grappa; typisch für Norditalien",
        answerB = "Spontangärung ohne zugefügte Hefen; typisch für Bioweinproduktion",
        answerC = "Kaltmazeration bei 5 °C vor der eigentlichen Gärung; erzeugt farbintensive Weine",
        answerD = "Eine Technik, bei der Trauben auf Matten oder Gestellen getrocknet werden, um Zucker zu konzentrieren; Vin Santo, Amarone della Valpolicella, Recioto",
        correctAnswer = 3,
        explanation = "Passito bezeichnet das Trocknen (Appassimento) von Trauben — entweder auf Strohmatten (Vin Santo, Toskana), auf Bambusgitter in Kellern (Amarone/Recioto, Venetien) oder auf der Rebe (Straw Wine). Durch Trocknung verlieren Beeren bis zu 40 % Wasser, Zucker und Aromen konzentrieren sich. Amarone gärt die Passito-Maische trocken aus (trockener Süßwein), Recioto behält Restzucker.",
        difficulty = 4,
        funFact = "Amarone entstand laut Legende durch Versehen: Ein Fass Recioto gärte vollständig durch — der entstandene trockene Wein wurde 'Amaro' (bitter) getauft, später zu 'Amarone'."
    ),

    // ── WEINBEWERTUNG & VERKOSTUNG ─────────────────────────────────────────────

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Parker 100-Punkte-System' und was bedeutet eine Bewertung von 90–95 Punkten?",
        answerA = "100 Punkte: perfekt; 90–95: herausragend, klar empfehlenswert und überdurchschnittlich",
        answerB = "100 Punkte: Weltklasse; 90–95: sehr gut, empfehlenswert mit kleinen Mängeln",
        answerC = "Ein System mit Basiswert 50; 90–95: ausgezeichneter Wein mit Potenzial und hoher Qualität",
        answerD = "Ein reines Preis-Leistungs-System; 90–95 bedeutet Preis unter 50 Euro pro Flasche",
        correctAnswer = 2,
        explanation = "Robert Parkers 100-Punkte-System startet bei einem Basiswert von 50 Punkten. Vergeben werden bis zu 50 Zusatzpunkte: 5 für Aussehen, 15 für Nase, 20 für Geschmack/Abgang, 10 für Gesamteindruck. 90–95: 'Ein herausragender Wein mit großer Komplexität, Charakter und Ausdrucksstärke.' 96–100: 'Ein außergewöhnlicher Wein.' Unter 80 Punkte: 'Wein mit deutlichen Fehlern'.",
        difficulty = 4,
        funFact = null
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Retronasal-Aromawahrnehmung' bei der Weinverkostung und warum ist sie wichtig?",
        answerA = "Die Wahrnehmung von Aromen durch die Nase vor dem Trinken (orthonasale Wahrnehmung)",
        answerB = "Das Riechen an einem leeren Weinglas zur Erkennung von Fehlaromen",
        answerC = "Aromawahrnehmung durch den Gaumen-Nasenrachen-Weg beim Schlucken — die wichtigste Komponente des 'Geschmacks' beim Wein",
        answerD = "Die Wahrnehmung von Texturen (Tannine, Säure) im Mundraum ohne Aromabeteiligung",
        correctAnswer = 2,
        explanation = "Was wir als 'Geschmack' erleben, ist zu 80 % retronasal: Wenn Wein im Mund ist und wir schlucken/ausatmen, gelangen flüchtige Aromaverbindungen durch den Gaumen-Rachen zum Riechepithel im hinteren Nasenbereich. Orthonasale Wahrnehmung (vor dem Mund) erkennt ca. 10.000 Gerüche; retronasale Verknüpfung mit Geschmack (süß, sauer, salzig, bitter, umami) erzeugt das komplexe Weinerlebnis.",
        difficulty = 4,
        funFact = "Menschen ohne Geruchssinn (Anosmiker) können Wein nur nach Süße, Säure, Bitterkeit und Tanninen beurteilen — alle 'Aromen' fehlen."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist 'Oxidation' als Weinfehler und welche chemischen Verbindungen entstehen dabei?",
        answerA = "Farbverlust durch UV-Lichtexposition; erzeugt Chlorophyll-Abbauprodukte",
        answerB = "Mikrobieller Befall durch Acetobacter; erzeugt ausschließlich Essigsäure",
        answerC = "Übermäßige Gerbstoffe durch zu langen Holzausbau; verursacht durch Lignin-Abbau",
        answerD = "Kontakt mit Sauerstoff reduziert Fruchtnoten und erzeugt Acetaldehyd (Sherry-artiger Geruch nach welkem Apfel) und Ethylacetat (Nagellackentferner)",
        correctAnswer = 3,
        explanation = "Oxidation ist eine der häufigsten Weinfehler. Ethanol oxidiert zu Acetaldehyd (oxidierter Geruch, welker Apfel, Sherry). Bei fortgeschrittener Oxidation entsteht Essigsäure (flüchtige Säure, 'piquant'). Wein zeigt außerdem Farbveränderung: Weißweine werden goldbraun, Rotweine verlieren Brillanz. SO₂ (Schwefeldioxid) ist das wichtigste Antioxidationsmittel im Weinbau.",
        difficulty = 4,
        funFact = null
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Was ist 'Legs' oder 'Church Windows' (Kirchenfenster) im Weinglas und was verrät es wirklich über den Wein?",
        answerA = "Die Schlieren zeigen den Tanningehalt; mehr Schlieren = mehr Tannine",
        answerB = "Die Schlieren entstehen durch den Marangoni-Effekt (Alkohol verdunstet schneller als Wasser) und zeigen primär den Alkoholgehalt, nicht die Qualität",
        answerC = "Die Schlieren zeigen den Süßegehalt; zähflüssige Schlieren = hoher Restzucker",
        answerD = "Die Schlieren zeigen das Alter; ältere Weine haben mehr und dickere Schlieren",
        correctAnswer = 1,
        explanation = "Die 'Beine' (Legs/Larmes) entstehen durch den Marangoni-Effekt: Alkohol hat eine niedrigere Oberflächenspannung als Wasser und verdunstet schneller. An den Glaswänden entsteht ein Gradient, der den Film nach oben zieht; dann tropft er als Schliere herab. Mehr/dickere Schlieren = höherer Alkohol- oder Zuckergehalt. Qualität des Weins lässt sich daraus nicht ableiten — es ist ein physikalisches Phänomen.",
        difficulty = 4,
        funFact = "Der Marangoni-Effekt wurde 1865 vom italienischen Physiker Carlo Marangoni beschrieben — die Weinanwendung ist zufälliger Nebeneffekt."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist die 'CIVC'-Regelung für Champagner-Restzuckergehalte und was bedeutet 'Brut Nature'?",
        answerA = "CIVC ist die EU-Weinbehörde; Brut Nature ist eine inoffizielle Bezeichnung ohne rechtliche Bedeutung",
        answerB = "CIVC ist der Champagner-Prüfverband; Brut Nature enthält 6–12 g/l Restzucker",
        answerC = "Brut Nature bedeutet ungefiltert und ungeschwefelt; der Restzucker ist nicht reglementiert",
        answerD = "CIVC (Comité Interprofessionnel du vin de Champagne) reguliert u. a. die Dosage-Kategorien; Brut Nature bedeutet keine Zuckerzugabe (0–3 g/l Restzucker, natürliche Restsüße erlaubt)",
        correctAnswer = 3,
        explanation = "Das CIVC (Comité Interprofessionnel du vin de Champagne) ist die Branchenorganisation, die alle Champagner-Produktionsregeln festlegt. Dosage-Kategorien: Brut Nature / Zero Dosage (0–3 g/l, keine Zuckerzugabe), Extra Brut (0–6 g/l), Brut (<12 g/l), Extra Dry (12–17 g/l), Sec (17–32 g/l), Demi-Sec (32–50 g/l), Doux (>50 g/l). Brut Nature ist der reinste Ausdruck ohne Zucker-Korrekturen.",
        difficulty = 4,
        funFact = null
    ),

    // ── BARRIQUE & AUSBAU ──────────────────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen einem 'Barrique' und einem 'Demi-Muid' und welchen Einfluss hat Fassvolumen auf den Wein?",
        answerA = "Barrique: 300 Liter; Demi-Muid: 100 Liter; kleineres Fass = weniger Holzeinfluss",
        answerB = "Barrique: 225 Liter (Bordeaux) / 228 Liter (Burgund); Demi-Muid: 600 Liter; kleinere Fässer haben größeres Oberflächen-Volumen-Verhältnis = mehr Holzeinfluss und Oxidation pro Liter",
        answerC = "Beide sind identisch; nur regionale Namensunterschiede",
        answerD = "Barrique: 500 Liter; Demi-Muid: 1.000 Liter; beide aus verschiedenen Holzarten",
        correctAnswer = 1,
        explanation = "Barrique (Bordeaux-Standard: 225 l, Burgund-Standard: 228 l) ist das am häufigsten eingesetzte Qualitätsfass. Demi-Muid hat 600 l. Das Oberflächen-Volumen-Verhältnis (cm²/l) ist beim Barrique ca. 2,3× größer als beim Demi-Muid. Mehr Holzkontakt = mehr Vanillin, Toastaromen, Tannin-Extraktion und Mikro-Oxidation. Große Fässer (Foutre: 10.000 l) geben kaum Holzton ab.",
        difficulty = 4,
        funFact = "Die Barrel-Herstellung ist ein eigenständiges Handwerk (Tonnellerie) — ein gutes Barrique kostet 800–1.500 Euro und wird nach 3–5 Jahren als 'alt' betrachtet."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was sind die drei 'Toast-Level' beim Barrique-Brennen und wie beeinflussen sie die Weinaromen?",
        answerA = "Light, Medium, Heavy Toast; Light Toast: mehr Vanillin und Holzzucker; Medium Toast: Karamell und Gewürze; Heavy Toast: Röst-, Kaffee- und Rauchnoten, weniger Tannine",
        answerB = "Toast A, B, C; nur Einfluss auf die Dauer des Fasseinsatzes",
        answerC = "Cold, Warm, Hot Toast; beeinflusst nur die Wasserabsorption des Holzes",
        answerD = "Alle Toast-Level erzeugen identische Aromen; nur Holzart ist relevant",
        correctAnswer = 0,
        explanation = "Beim Fass-Brennen (Toasting) wird die Innenseite der Dauben über offenem Feuer erhitzt: Light Toast (LT): Holzstruktur weitgehend erhalten, viel Vanillin (Vanille-Aroma), eichenholztypische Lactone. Medium Toast (MT): Karamell, Kokos, geröstete Noten, optimale Tannin-Balance. Heavy Toast (HT): Kaffee, Röstaroma, Rauch, aber deutlich reduzierte Holztannine da diese durch Hitze abgebaut werden.",
        difficulty = 4,
        funFact = null
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist 'Mikro-Oxidation' und wie wird sie im modernen Weinbau eingesetzt?",
        answerA = "Eine Fehltechnik, die Weinen schadet; wird ausschließlich bei fehlerhaften Weinen angewendet",
        answerB = "Das Pumpen von Stickstoff zur Sauerstoffausschließung bei der Lagerung",
        answerC = "Eine biologische Reinigungsmethode für Weinfässer mit Ozon",
        answerD = "Die kontrollierte Einleitung kleiner Mengen Sauerstoff über Membrane in Tanks/Fässer, um Barrique-ähnliche Reifungseffekte zu erzielen oder Tannine zu stabilisieren",
        correctAnswer = 3,
        explanation = "Mikro-Oxidation (MOX) wurde in den 1990er Jahren von Patrick Ducournau (Madiran, Frankreich) entwickelt. Über spezielle Membrane wird präzise dosiert Sauerstoff in den Wein eingeleitet (typisch: 0,5–5 mg O₂/l/Monat). Dies stabilisiert Farbe (Anthocyan-Tannin-Kondensation), weicht Tannine auf und ermöglicht Barrique-ähnliche Entwicklung in Stahltanks — günstiger und kontrollierter.",
        difficulty = 4,
        funFact = "Mikro-Oxidation ist in der EU für qualitätsweine reguliert; übermäßige MOX kann Weine überoxidieren und Aromen zerstören."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was ist 'Battonage' im Weißweinausbau und welchen Einfluss hat es auf die Textur des Weins?",
        answerA = "Das Entfernen von Hefedepot durch Filtration für Klarheit",
        answerB = "Das Umfüllen von Wein zwischen Fässern zur Belüftung",
        answerC = "Das Schönen des Weins mit Bentonit zur Proteinstabilisierung",
        answerD = "Das regelmäßige Aufwirbeln des Hefedepots (Sur-lie-Lagerung) mit einem Stab, das Polysaccharide und Mannoproteine löst und für Cremigkeit und Körper sorgt",
        correctAnswer = 3,
        explanation = "Battonage (frz.: bâtonner = mit dem Stock rühren) ist das periodische Aufwirbeln von Hefetrub (Feinhefen/lies) bei Sur-lie-Lagerung. Beim Zerfall (Autolyse) der Hefezellen werden Mannoproteine und Polysaccharide freigesetzt, die dem Wein Textur (Cremigkeit, Körper, Vollmundigkeit) verleihen und Tannin-Härte abpuffern. Klassisch für Burgunder Chardonnay und Muscadet sur lie.",
        difficulty = 4,
        funFact = null
    ),

    // ── WEINLAGERUNG ───────────────────────────────────────────────────────────

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welche Bedingungen sind für die optimale Weinlagerung entscheidend und warum müssen Korken-Flaschen liegend gelagert werden?",
        answerA = "10–14 °C, 70–85 % Luftfeuchtigkeit, liegend wegen Korkbefeuchtung; Vibration ist unkritisch",
        answerB = "Optimal: 10–14 °C konstant, 70–85 % Luftfeuchtigkeit, dunkel, vibrationsfrei; liegend, damit Naturkork feucht bleibt und nicht schrumpft — ein trockener Kork lässt Sauerstoff ein",
        answerC = "15–20 °C, jede Luftfeuchtigkeit, stehend bei Weißweinen und liegend bei Rotweinen",
        answerD = "Unter 5 °C ist ideal; Korkflaschen stehen aufrecht, Schraubkappen liegen",
        correctAnswer = 1,
        explanation = "Optimale Weinlagerung: Temperatur 10–14 °C konstant (Schwankungen beschleunigen Reifung und können Kork ausdehnen/zusammenziehen). Luftfeuchtigkeit 70–85 % (trockene Keller lassen Kork austrocknen → Lufteintritt → Oxidation). Dunkelheit (UV-Licht zerstört organische Aromamoleküle). Vibrationsfrei (mechanischer Stress beeinflusst Proteinsediment). Liegende Lagerung benetzt den Naturkork von innen.",
        difficulty = 4,
        funFact = "Schraubverschlüsse und Glaskorken müssen nicht liegend gelagert werden — sie sind feuchtigkeitsunabhängig. Die Liegepflicht gilt nur für Naturkork."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Welche Weintypen sind lagerfähig und warum, und welche sollten jung getrunken werden?",
        answerA = "Alle Rotweine altern mindestens 20 Jahre; alle Weißweine sollten sofort getrunken werden",
        answerB = "Süßweine altern nie gut; Trockenweine sind immer lagerfähig",
        answerC = "Lagerfähig: tannin- und säurereiche Weine (Barolo, Riesling Spätlese, Vintage Port, Grand Cru Burgund); jung trinken: einfache fruchtbetonte Rotweine, Beaujolais Nouveau, leichte Weißweine ohne Struktur",
        answerD = "Lagerfähigkeit hängt ausschließlich vom Alkoholgehalt ab; über 14 % = lange lagerfähig",
        correctAnswer = 2,
        explanation = "Lagerpotenzial entsteht durch: Hohe Tannine (polymerisieren zu sanfteren Verbindungen), hohe Säure (pH-Puffer gegen Oxidation, mikrobielle Stabilität), hoher Zucker (Süßweine wie Sauternes, Trockenbeerenauslese), hoher Alkohol (Stille Weine, Portwein). Strukturarme Weine oxidieren schnell und verlieren Fruchtnoten. Beaujolais Nouveau ist für sofortigen Konsum gemacht.",
        difficulty = 4,
        funFact = null
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Flaschengärung' (Méthode Champenoise / Méthode Traditionnelle) und welche Weine dürfen diesen Begriff auf dem Etikett führen?",
        answerA = "Jeder Schaumwein mit Kohlensäure darf Méthode Champenoise schreiben",
        answerB = "Die zweite Gärung findet in der Flasche statt (Liqueur de tirage zugegeben); nur Champagner darf 'Méthode Champenoise' schreiben, andere müssen 'Méthode Traditionnelle' verwenden",
        answerC = "Flaschengärung ist identisch mit Cuve-Close-Verfahren; alle Begriffe sind gleichwertig",
        answerD = "Nur Cava aus Spanien darf Méthode Champenoise schreiben; Champagner verwendet Méthode Ancestrale",
        correctAnswer = 1,
        explanation = "Bei der traditionellen Methode wird ein Liqueur de tirage (Wein + Zucker + Hefe) zur Grundweinmischung in die Flasche gegeben. Die Hefe vergärt den Zucker zu CO₂, das sich in der verschlossenen Flasche auflöst (5–6 atm Druck). Nach Mindestreife auf der Hefe (Champagner: 15 Monate, Blanc de Blancs Prestige: 3+ Jahre) folgt Rütteln, Dégorgement und Dosage. Nur Champagner darf EU-weit den Begriff 'Méthode Champenoise' verwenden.",
        difficulty = 4,
        funFact = "Dom Pérignon (1638–1715) wird die Entwicklung des Champagners zugeschrieben — tatsächlich hat er eher die Assemblage-Kunst perfektioniert, nicht die Flaschengärung erfunden."
    ),

    // ── WEINGESETZE & PRAEDIKATE ───────────────────────────────────────────────

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Kabinett', 'Spätlese', 'Auslese', 'Beerenauslese' und 'Trockenbeerenauslese' im deutschen Prädikatsweinsystem?",
        answerA = "Alle Prädikatsweine sind Süßweine; der Unterschied liegt nur in der Traubenfarbe",
        answerB = "Das Prädikatsweinsystem basiert auf dem Mostgewicht (Oechsle) bei der Ernte: Kabinett (min. 67–82 °Oe) → Spätlese (76–90 °Oe) → Auslese (83–100 °Oe) → Beerenauslese (110–128 °Oe) → TBA (150–154 °Oe), jeweils ohne Zuckerzusatz",
        answerC = "Das System basiert auf dem Alkoholgehalt; Kabinett: unter 9 % vol; TBA: über 18 % vol",
        answerD = "Die Unterschiede sind rein geografisch; jede Region hat ihre eigene Prädikatsreihe",
        correctAnswer = 1,
        explanation = "Das deutsche Prädikatsystem (Weingesetz 1971, aktuell WeinG) basiert auf natürlichem Mostgewicht (°Oechsle) bei der Lese ohne Zuckerzusatz (Chaptalisierung verboten). Die genauen Werte variieren nach Anbaugebiet und Rebsorte. TBA (Trockenbeerenauslese) wird aus edelfaulen, rosinenhaften Beeren (Botrytis cinerea) handverlesen — Erträge von 5–20 Litern pro 100 kg Trauben sind üblich.",
        difficulty = 4,
        funFact = null
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was ist 'Eiswein' und wie unterscheidet er sich von Trockenbeerenauslese in der Herstellungsmethode?",
        answerA = "Eiswein wird aus gefrorenen Trauben in der Kelter gepresst bei Temperaturen von −8 °C oder kälter; TBA aus botrytisierten Rosinen — beide sind selten und teuer",
        answerB = "Eiswein wird durch künstliche Gefrierung hergestellt; TBA ist immer natürlicher entstanden",
        answerC = "Beide sind identisch; 'Eiswein' ist nur die süddeutsche Bezeichnung für TBA",
        answerD = "Eiswein ist ein halbtrockener Wein; TBA ist ausschließlich ein Dessertwein",
        correctAnswer = 0,
        explanation = "Eiswein: Gesunde (nicht botrytisierte) Trauben frieren am Weinstock bei mindestens −8 °C natürlich ein. Beim Pressen bei Frost bleibt Eis in der Kelter, während das konzentrierte Zucker-Säure-Gemisch herausfließt. Ergibt extreme Süße mit hoher Fruchtsäure und frischer Note. TBA entsteht durch Botrytis cinerea (Edelfäule), die Wasser durch die Beerenhaut entzieht — erzeugt komplexere, honig- und rosinenartige Noten.",
        difficulty = 4,
        funFact = "Deutschland und Österreich sind die Hauptproduzenten von Eiswein; Kanada produziert Icewine in großen Mengen mit künstlicher Gefrierung (darf nicht 'Eiswein' heißen)."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Was regelt das französische AOC/AOP-System (Appellation d'Origine Contrôlée) und welche fünf Parameter werden typischerweise festgelegt?",
        answerA = "AOC/AOP reguliert: geografische Abgrenzung, erlaubte Rebsorten, Mindestreifegrad, maximalen Hektarertrag, Vinifikationsregeln (Ausbaustil, Mindestreifezeit)",
        answerB = "Nur Herkunftsgebiet und Rebsorten; alle anderen Parameter sind optional",
        answerC = "Ausschließlich Exportbestimmungen; innerfranzösische Produktion ist ungeregelt",
        answerD = "Nur Etikettierungsvorschriften und Flaschengröße; Produktionsregeln sind regional selbst bestimmt",
        correctAnswer = 0,
        explanation = "Das AOC-System (seit 1936, heute EU-AOP) legt für jede Appellation fest: 1) Geografische Grenze der Lage; 2) Erlaubte Rebsorten und deren Anteile; 3) Mindest-Oechsle/Zuckergehalt bei der Ernte; 4) Maximaler Hektarertrag (hl/ha); 5) Vinifikationsvorschriften (z. B. Mindestreifung, Ausbau im Holz, maximaler SO₂-Gehalt). Verstöße können den AOC-Status aberkennen.",
        difficulty = 4,
        funFact = null
    ),

    // ── EDELFÄULE & SÜSSWEINE ─────────────────────────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was ist 'Botrytis cinerea' und unter welchen klimatischen Bedingungen wird sie zur 'Edelfäule' statt zur 'Graufäule'?",
        answerA = "Edelfäule entsteht bei Temperaturen über 30 °C; Graufäule nur bei unter 15 °C",
        answerB = "Ein Schädling, der immer als Graufäule auftritt; Edelfäule existiert nicht",
        answerC = "Botrytis ist nur bei Weißweinen möglich; bei Rotweinen entsteht immer Graufäule",
        answerD = "Ein Schimmelpilz; Edelfäule entsteht bei feuchten Morgen (Mycelwachstum) gefolgt von trockenen, warmen Nachmittagen (Wasserverdunstung durch Beeren) — Graufäule entsteht bei durchgehender Nässe ohne Abtrocknung",
        correctAnswer = 3,
        explanation = "Botrytis cinerea ist ein Pilz (Grauschimmel). Unter optimalen Bedingungen — feuchte Herbstnebel morgens (Pilzwachstum, Penetration der Beerenhaut) und trockene, sonnige Nachmittage (Wasserverdunstung durch perforierten Haut) — zieht er Wasser aus den Beeren. Zurück bleiben konzentrierter Zucker, Säure, Glycerin und Botrytis-Aromen (Honig, Safran, Marmelade). Bei dauerhafter Nässe rottet die Beere — Graufäule.",
        difficulty = 4,
        funFact = "Sauternes, Tokaji Aszú und deutsche TBA sind die drei bekanntesten Botrytis-Süßweine der Welt — alle profitieren von ihrer geografischen Lage nahe Flüssen (Nebel!)."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was ist 'Glycerin' (Glycerol) im Wein und wie beeinflusst es die sensorische Wahrnehmung?",
        answerA = "Ein Gärungsnebenprodukt (Hefen produzieren 5–10 g/l), das Körper und Fülle erzeugt sowie leicht süßlich wirkt",
        answerB = "Ein Holzaroma aus dem Barrique, das Vanille-Noten erzeugt",
        answerC = "Ein Säureabbauprodukt, das die Textur verhärtet",
        answerD = "Ein Konservierungsmittel, das ausschließlich synthetisch zugesetzt wird",
        correctAnswer = 0,
        explanation = "Glycerol (1,2,3-Propantriol) ist das drittmengenreichste Gärungsprodukt nach Ethanol und CO₂. Hefen produzieren 5–10 g/l als osmotischen Puffer. Botrytis-Weine haben bis zu 20 g/l, da Botrytis selbst Glycerol produziert. Glycerol ist leicht süßlich (Geschmacksschwelle: 5 g/l) und viskos — verantwortlich für das 'runde', cremige Mundgefühl mancher Weine.",
        difficulty = 4,
        funFact = null
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tokaji Aszú' und wie wird die Süßestufe in 'Puttonyos' gemessen?",
        answerA = "Ein ungarischer Schaumwein; Puttonyos bezeichnet die Anzahl der Gärungstage",
        answerB = "Ein Verstärkter Wein; Puttonyos ist der Alkoholgehalt in Zehntel-Grad",
        answerC = "Ein ungarischer Süßwein aus Botrytis-befallenen Beeren; früher: Anzahl der 25-kg-Körbe (Puttony) edelfauler Beeren pro 136-l-Gőnc-Fass (5–6 Puttonyos = gängig); heute: Restzucker-Mindestgehalt (5 Puttonyos: min. 120 g/l)",
        answerD = "Ein polnischer Weißwein; Puttonyos bezeichnet die Erntewoche im Herbst",
        correctAnswer = 2,
        explanation = "Tokaji Aszú ist Ungarns bekanntester Wein aus dem Tokaj-Anbaugebiet. 'Aszú' sind botrytisierte Einzelbeeren, die handverlesen werden. Traditionell wurde der Süßegrad durch die Anzahl 25-kg-Körbe (Puttony) gemessen, die einer 136-l-Gőnc-Tonne trockenem Basiswein zugegeben wurden. Seit 2013 gilt EU-Restzucker-Klassifikation: 3 Puttonyos (min. 60 g/l) bis 6 Puttonyos (min. 150 g/l). Eszencia (reiner Aszú-Saft) hat >450 g/l Zucker.",
        difficulty = 4,
        funFact = "Tokaji Eszencia ist einer der zuckerstärksten Weine weltweit — mit bis zu 800 g/l Restzucker gärt er jahrelang extrem langsam auf unter 5 % Alkohol."
    ),

    // ── WEINKRITIK & HANDEL ───────────────────────────────────────────────────

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'En Primeur'-Kauf (Futures) und welche Region ist dafür am bekanntesten?",
        answerA = "Eine Auktionsform für ältere Jahrgänge; primär in London und New York",
        answerB = "Ein Subskriptionsmodell für monatliche Weinlieferungen; keine geografische Konzentration",
        answerC = "Der Direktkauf beim Winzer nach der Ernte ohne Zwischenhändler; Burgund ist die Hauptregion",
        answerD = "Der Kauf von Wein als Terminware während der Fassreifung (vor Abfüllung), bei dem der Käufer auf Preis und Qualitätsversprechen wetten; Bordeaux ist die Hauptregion (Châteaux öffnen Keller im April)",
        correctAnswer = 3,
        explanation = "En Primeur (Bordeaux-Futures): Im Frühjahr nach der Ernte (April/Mai) öffnen die Châteaux ihre Keller für Weinpresse und Händler. Basierend auf Fassproben und Kritiker-Beurteilungen werden Weine zu einem Erstausgabepreis verkauft — der Wein wird erst 1,5–2 Jahre später nach Abfüllung geliefert. Käufer spekulieren auf Qualität und Preisanstieg. Für Top-Jahrgänge (2000, 2009, 2010, 2016) lohnte es sich enorm.",
        difficulty = 4,
        funFact = null
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Parker-Effekt' und welche wirtschaftlichen Auswirkungen hat er auf den Weinmarkt?",
        answerA = "Robert Parkers 100-Punkte-Bewertungen veränderten Weinpreise enorm: 95+ Punkte können Flaschenpreise um 100–300 % steigern; Kritik: Stylistische Homogenisierung hin zu 'Parker-Geschmack' (reif, vollmundig, holzig)",
        answerB = "Die Auswirkung von Wetterberichten auf die Ernte; führt zu Versicherungsspekulationen",
        answerC = "Ein Marketingeffekt, der ausschließlich Champagner betrifft",
        answerD = "Ein amerikanisches Weingesetz, das Import-Tarife auf französische Weine regelt",
        correctAnswer = 0,
        explanation = "Robert Parker dominierte seit den 1980ern die Weinbewertung durch seine 100-Punkte-Skala (The Wine Advocate). 'Parker-Punkte' bestimmten Marktpreise und Kaufentscheidungen weltweit. Kritiker bemängeln: Winzer passten ihren Stil an Parkers Geschmackspräferenzen an (überreifte Rotweine, viel Alkohol und Holz) — eine stilistische Homogenisierung. Seit Parkers Rückzug und dem Aufstieg diverser Kritiker (Vinous, Jancis Robinson, Falstaff) hat sich der Markt diversifiziert.",
        difficulty = 4,
        funFact = "Parker bewertete 2003 den Sauternes Château d'Yquem 1936 mit 100 Punkten — den ältesten jemals mit Bestbewertung beurteilten Wein."
    ),

    // ── SCHAUMWEINE & PERLWEINE ────────────────────────────────────────────────

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet das 'Cuve Close'-Verfahren (Charmat) von der Méthode Champenoise bei der Schaumweinherstellung?",
        answerA = "Cuve Close: Flaschengärung in kleinen 0,75-l-Flaschen; Champenoise: Tankgärung in 10.000-l-Tanks",
        answerB = "Cuve Close (Charmat): Zweite Gärung in hermetisch geschlossenen Drucktanks (schnell, fruchtbetonter Stil); Champenoise: Zweite Gärung in Einzelflasche mit Hefelagerung (langsam, Hefeautolyse-Komplex ität)",
        answerC = "Beide sind identisch; nur der Produktionsort unterscheidet sich (Frankreich vs. Italien)",
        answerD = "Cuve Close produziert nur Roséschaumweine; Champenoise nur Weißschaumweine",
        correctAnswer = 1,
        explanation = "Charmat/Cuve Close (entwickelt 1907 von Eugène Charmat): Zweite Gärung findet in großen Drucktanks bei konstanter Temperatur statt. Schnell, kosteneffizient, fruchtbetonte Aromen bleiben erhalten. Ideal für Prosecco, Glera, Frizzante-Stile. Méthode Champenoise: Gärung in Einzelflasche ermöglicht Hefeautolyse (Cremigkeit, Brioche, Hefenoten), erfordert Rütteln und Dégorgement. Zeit- und kostenintensiv, erzeugt komplexere Hefecharaktere.",
        difficulty = 4,
        funFact = null
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pét-Nat' (Pétillant Naturel) und welche historische Schaumweinmethode wird dabei angewendet?",
        answerA = "Ein synthetisch begaster Perlwein; modernes Industrieverfahren ab 1990",
        answerB = "Ein Schaumwein nach der Méthode Champenoise mit zusätzlicher Holzlagerung",
        answerC = "Ein süßer Perlwein nach dem Transfer-Verfahren; gefiltert und dosiert wie Champagner",
        answerD = "Ein Naturschaumwein nach der 'Méthode Ancestrale': Die erste Gärung wird in der Flasche vollendet, kein Dégorgement, keine Dosage — rustikaler, lebendiger Stil mit Trübung",
        correctAnswer = 3,
        explanation = "Pétillant Naturel ('Natürlich perlend') ist nach der Méthode Ancestrale hergestellt — der ältesten bekannten Schaumweinmethode. Der Most wird vor vollständiger Vergärung auf die Flasche gefüllt; die Gärung endet dort (CO₂ bleibt gelöst). Kein Disgorgement, Hefedepot bleibt in der Flasche, keine Dosage. Pét-Nat ist ungefiltert, oft trüb, mit niedrigem Druck (2–3 atm) und lebendiger Gärungsfrische.",
        difficulty = 4,
        funFact = "Die älteste dokumentierte Schaumweinregion der Welt ist nicht Champagne, sondern Limoux (Blanquette de Limoux) im Languedoc — seit 1531."
    ),

    // ── PORTWEIN & VERSTÄRKTE WEINE ────────────────────────────────────────────

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was ist 'Vintage Port' und wie unterscheidet er sich von 'Late Bottled Vintage' (LBV) und 'Tawny Port'?",
        answerA = "Vintage Port enthält nur Touriga Nacional; LBV und Tawny dürfen beliebige Sorten verwenden",
        answerB = "Vintage Port ist ungefiltert; LBV ist gefiltert; Tawny ist immer süßer als beide",
        answerC = "Vintage Port: einzigartiger Jahrgang, 2 Jahre Fasslagerung, dann Flaschengärung über Jahrzehnte; LBV: 4–6 Jahre Fasslagerung, früher zugänglich; Tawny: langjährige oxidative Fasslagerung (10/20/30/40 Jahre), nussig-karamellig",
        answerD = "Alle drei sind identisch; nur Etikettierungsunterschiede",
        correctAnswer = 2,
        explanation = "Vintage Port (VP): Deklariert nur in außergewöhnlichen Jahrgängen (~3×/Dekade), 2 Jahre in Fass, dann über 10–50 Jahre in Flasche gereift. Intensiv, fruchtig, mit Sediment. LBV: 4–6 Jahre in Fass, jährlich verfügbar, gefiltert oder ungefiltert, früher zugänglich. Tawny (10/20/30/40 Jahre): oxidative Fasslagerung, Farbe oxidiert zu goldbraun ('Tawny'), entwickelt Nuss-, Karamell- und getrocknete Früchte-Aromen. Alle haben Weinbrand-Zugabe (Aguardente) bei ca. 75–77 g/l Restzucker.",
        difficulty = 4,
        funFact = null
    ),

    // ── WEIN & SPEISEBEGLEITUNG ────────────────────────────────────────────────

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist das wichtigste Prinzip bei der Wein-Speisenharmonie nach Sommelier-Standard und welche 4 Feindkombinationen sollte man vermeiden?",
        answerA = "Prinzip: Wein und Speise sollen gleiche Herkunft haben (regionaler Einklang); Feindkombinationen: Champagner + Steak, Rotwein + Fisch, Weißwein + Fleisch, Rosé + Suppe",
        answerB = "Prinzip: Preisklasse von Wein und Speise müssen übereinstimmen; kein anderes Prinzip",
        answerC = "Prinzip: Weißwein zu weißem Fleisch, Rotwein zu rotem Fleisch — ohne Ausnahmen",
        answerD = "Prinzip: Wein ergänzt oder kontrastiert Speise ohne eine Komponente zu dominieren; Feindkombinationen: Tanninreicher Rotwein + Fisch (Metallic), Süßer Wein + saure Speise (Süße überwältigt), Hoher Alkohol + scharfes Essen (Brennen), Tanninreicher Wein + Artischocke/Ei (Bitterkeit/Fettigkeit verstärkt Tannin-Adstringenz)",
        correctAnswer = 3,
        explanation = "Hauptprinzip: Komplementär (Wein ergänzt Speise) oder Kontrast (Wein kompensiert Speiseeigenschaft). Klassische Feindkombinationen: 1) Tannine + fettarmer Fisch: Phenole und Fischproteine erzeugen metallischen Geschmack. 2) Trockener Rotwein + süßes Dessert: Wein schmeckt sauer und bitter. 3) Hoher Alkohol + scharfe Gewürze: Capsaicin verstärkt Alkohol-Brennen. 4) Tannine + Artischocke/Spargel/Eigelb: Bitterstoffe addieren sich unangenehm.",
        difficulty = 4,
        funFact = "Die Faustregel 'Weißwein zu Fisch' hat Ausnahmen: Thunfisch, Lachs und Rotbarsch vertragen sich gut mit leichten, fruchtigen Rotweinen (Pinot Noir, Bardolino)."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' als fünfter Grundgeschmack und welche Weinstile harmonieren am besten damit bei Lebensmitteln wie Parmesan, Trüffel oder gereiftem Fleisch?",
        answerA = "Umami ist ein Bitterton; passt am besten zu Champagner Brut Nature",
        answerB = "Umami passt ausschließlich zu Weißweinen; Rotwein überdeckt Umami-Noten immer",
        answerC = "Umami (japanisch: köstlich) ist durch Glutaminsäure und Nukleotide (IMP, GMP) bedingt; reife, vollmundige Rotweine (Barolo, gereifter Burgunder, Rioja Reserva) harmonieren durch ihre eigene Komplexität und Umami-ähnliche Tiefe am besten",
        answerD = "Umami-reiche Speisen benötigen ausschließlich Süßweine als Ausgleich",
        correctAnswer = 2,
        explanation = "Umami (L-Glutaminsäure, Inosinmonophosphat IMP, Guanosinmonophosphat GMP) ist der herzhafte, fleischbrühenartige fünfte Grundgeschmack. Bei der Weinbegleitung: Gereifte Rotweine mit Tiefe (Barolo, Côte de Nuits, Rioja Gran Reserva) entwickeln durch Reifung ähnliche 'Savory'-Noten (Pilze, Trüffel, Fleischbrühe) und ergänzen Umami-Quellen. Außerdem: Champagner zu Parmesan (Säure schneidet durch Fett, Brioche-Note ergänzt Umami). Sehr tanninreiche Weine können mit Eiprotein reagieren.",
        difficulty = 4,
        funFact = "Parmigiano Reggiano enthält ca. 1,2 g freie Glutaminsäure pro 100 g — einer der höchsten Werte aller Lebensmittel, nur Miso und Worcestershiresauce übertreffen ihn."
    )
)
