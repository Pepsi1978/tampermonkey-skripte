package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsHard2(): List<Question> = listOf(

    // ── MAILLARD-REAKTION & LEBENSMITTELCHEMIE ────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Bei welcher Temperatur beginnt die Maillard-Reaktion typischerweise bei Backwaren?",
        answerA = "100 °C",
        answerB = "140 °C",
        answerC = "160 °C",
        answerD = "200 °C",
        correctAnswer = 1,
        explanation = "Die Maillard-Reaktion, bei der reduzierende Zucker mit Aminosäuren reagieren und Bräunung sowie Aromastoffe entstehen, startet ab etwa 140 °C nennenswert. Unterhalb dieser Temperatur dominiert reine Wasserverdampfung.",
        difficulty = 3,
        funFact = "Die Maillard-Reaktion erzeugt über 1.000 verschiedene Aromaverbindungen — mehr als jede andere Kochreaktion."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welche chemische Verbindungsklasse entsteht primär bei der Maillard-Reaktion und verleiht Röstkaffee sein charakteristisches Aroma?",
        answerA = "Terpene",
        answerB = "Furane",
        answerC = "Alkaloide",
        answerD = "Saponine",
        correctAnswer = 1,
        explanation = "Furane sind heterocyclische Verbindungen, die bei der Maillard-Reaktion aus Zuckern entstehen. 2-Furfural und 5-Methylfurfural sind die wichtigsten Vertreter im Röstkaffee-Aroma.",
        difficulty = 3,
        funFact = null
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Retroaldolisierung' im Kontext der Zuckerchemie beim Kochen?",
        answerA = "Die Kristallisation von Saccharose bei 185 °C",
        answerB = "Die Spaltung von Glucose in zwei C3-Fragmente unter Hitze",
        answerC = "Die Umwandlung von Glucose in Fructose durch Isomerase",
        answerD = "Die Bildung von Lactose aus Galactose und Glucose",
        correctAnswer = 1,
        explanation = "Bei der Retroaldolisierung wird Glucose unter Hitze in zwei Triose-Fragmente gespalten (Glycolaldehyd und Glyceraldehyd). Diese Fragmente sind reaktive Intermediate der Maillard-Reaktion und erzeugen besonders intensive Aromavorläufer.",
        difficulty = 3,
        funFact = null
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welches Enzym ist verantwortlich für die enzymatische Bräunung von geschnittenem Obst wie Äpfeln?",
        answerA = "Lipase",
        answerB = "Amylase",
        answerC = "Polyphenoloxidase",
        answerD = "Pektinase",
        correctAnswer = 2,
        explanation = "Polyphenoloxidase (PPO) katalysiert die Oxidation von Phenolen zu Chinonen, die sich weiter zu braunen Melaninen polymerisieren. Zitronensäure hemmt diesen Prozess durch pH-Absenkung und Chelatbildung mit dem Kupfer-Kofaktor.",
        difficulty = 3,
        funFact = "Das Enzym Polyphenoloxidase benötigt Kupfer als Kofaktor — weshalb kupferarme Apfelsorten langsamer bräunen."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Karamellisierung' und der 'Maillard-Reaktion'?",
        answerA = "Karamellisierung benötigt Sauerstoff, Maillard-Reaktion nicht",
        answerB = "Karamellisierung ist reine Pyrolyse von Zuckern ohne Stickstoff; Maillard erfordert Aminogruppen",
        answerC = "Karamellisierung findet nur in Flüssigkeiten statt, Maillard nur in Feststoffen",
        answerD = "Es gibt keinen Unterschied — beide Begriffe beschreiben dasselbe Phänomen",
        correctAnswer = 1,
        explanation = "Karamellisierung ist thermische Pyrolyse von Zuckern allein, ohne Beteiligung von Proteinen oder Aminosäuren. Die Maillard-Reaktion hingegen ist eine nicht-enzymatische Bräunung zwischen reduzierenden Zuckern und freien Aminogruppen.",
        difficulty = 3,
        funFact = null
    ),

    // ── SOUS VIDE & PROFIKOCHTECHNIKEN ────────────────────────────────────────

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Bei welcher Kerntemperatur gilt Hühnerbrust beim Sous-vide-Garen als pasteurisiert, wenn sie 4 Stunden bei konstanter Temperatur gehalten wird?",
        answerA = "72 °C (sofortige Pasteurisierung)",
        answerB = "65 °C für mindestens 4 Minuten",
        answerC = "60 °C für 27 Minuten",
        answerD = "57 °C für 4 Stunden",
        correctAnswer = 3,
        explanation = "Laut USDA-Pasteurisierungstabellen für Geflügel erreicht man bei 57 °C nach 4 Stunden Haltedauer eine 7-Log-Reduktion von Salmonellen. Das Fleisch bleibt saftig, weil Myosin schon ab 50 °C denaturiert, aber Kollagen noch intakt ist.",
        difficulty = 3,
        funFact = "Sous-vide wurde in den 1970er Jahren vom Chemieprofessor Bruno Goussault und Koch Georges Pralus unabhängig voneinander entwickelt."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was ist 'Spherification' in der Molekularküche und welche zwei Hauptvarianten gibt es?",
        answerA = "Basische und saure Spherification mit Natriumcitrat und Citronensäure",
        answerB = "Direkte Spherification (Natriumalginat + Calciumchlorid) und umgekehrte Spherification (Calciumlactat + Natriumalginat-Bad)",
        answerC = "Heiße und kalte Spherification mit Agar-Agar und Carrageenan",
        answerD = "Gel- und Schaum-Spherification mit Methylcellulose und Lecithin",
        correctAnswer = 1,
        explanation = "Bei der direkten Spherification tropft man Natriumalginat-Lösung in ein Calciumchlorid-Bad, wodurch eine Gelschicht entsteht. Bei der umgekehrten Methode enthält das Produkt Calciumsalze und wird in ein Natriumalginat-Bad getaucht — ermöglicht dickere Schalen und säurehaltige Füllungen.",
        difficulty = 3,
        funFact = "Ferran Adrià popularisierte die Spherification in den 1990er Jahren im elBulli, basierend auf Industriepatenten aus den 1940er Jahren."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welchen physikalischen Effekt nutzt die 'Transglutaminase' in der Profiküche?",
        answerA = "Sie emulgiert Fette durch Bildung von Phospholipid-Doppelschichten",
        answerB = "Sie vernetzt Proteinmoleküle durch kovalente Isopeptidbindungen",
        answerC = "Sie spaltet Stärke in Maltose und Glucose",
        answerD = "Sie stabilisiert Schäume durch Denaturierung von Albumin",
        correctAnswer = 1,
        explanation = "Transglutaminase (umgangssprachlich 'Fleischkleber') katalysiert die Bildung von Isopeptidbindungen zwischen Glutamin- und Lysinresten in Proteinen. Damit können Fleischstücke bei Kälte zu neuen Formen verbunden werden, ohne Bindemittel.",
        difficulty = 3,
        funFact = null
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Hydrokolloid' in der Lebensmitteltechnologie?",
        answerA = "Ein fetthaltiger Emulgator auf Basis von Sojalecithin",
        answerB = "Ein wasserlösliches oder quellfähiges Polymer, das Viskosität oder Gelbildung erzeugt",
        answerC = "Ein hochdruckhomogenisiertes Milchprodukt",
        answerD = "Ein durch Ultrafiltration gewonnenes Molkenprotein-Konzentrat",
        correctAnswer = 1,
        explanation = "Hydrokolloide sind wasserassoziierte Makromoleküle (Polysaccharide oder Proteine) wie Gelatine, Xanthan, Pektin oder Carrageen. Sie beeinflussen die Textur von Lebensmitteln durch Gelbildung, Verdickung oder Stabilisierung.",
        difficulty = 3,
        funFact = "Xanthan wird durch Fermentation des Bakteriums Xanthomonas campestris hergestellt — ursprünglich ein Pflanzenpathogen."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welche Temperatur hat flüssiger Stickstoff, der in der Kryotechnik der Küche eingesetzt wird?",
        answerA = "−78 °C",
        answerB = "−112 °C",
        answerC = "−196 °C",
        answerD = "−273 °C",
        correctAnswer = 2,
        explanation = "Flüssiger Stickstoff siedet bei −195,8 °C (77 K) unter Normaldruck. Diese extreme Kälte ermöglicht sofortiges Einfrieren von Lebensmitteln ohne die Bildung großer Eiskristalle, was eine feinere Textur ergibt als herkömmliches Tiefkühlen.",
        difficulty = 3,
        funFact = "Heston Blumenthal nutzte flüssigen Stickstoff erstmals 1999 öffentlich für sein 'nitro-poached ice cream' im The Fat Duck."
    ),

    // ── WEINWISSENSCHAFT ──────────────────────────────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Was bewirkt die malolaktische Gärung (MLF) in Rotwein chemisch?",
        answerA = "Ethanol wird durch Acetobacter in Essigsäure umgewandelt",
        answerB = "Apfelsäure (Äpfelsäure) wird durch Milchsäurebakterien in Milchsäure umgewandelt",
        answerC = "Fruchtzucker wird durch wilde Hefen in Sorbit umgewandelt",
        answerD = "Weinsäure wird durch Kaliumbitartrat-Kristallisation entzogen",
        correctAnswer = 1,
        explanation = "Oenococcus oeni und andere Milchsäurebakterien wandeln die schärfere Äpfelsäure (2 Carboxylgruppen) in die weichere Milchsäure (1 Carboxylgruppe) um. Der Gesamtsäuregehalt sinkt, der pH steigt, und Butteraromen entstehen durch Diacetyl-Bildung.",
        difficulty = 3,
        funFact = "Chardonnay-Weine mit 'buttriger' Note verdanken dieses Aroma fast immer einer vollständig durchlaufenen malolaktischen Gärung."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welcher Stoff im Rotwein verursacht durch selektive Absorption von saurem Polyphenol-Schleim auf Zahnschmelz das typische 'adstringierende' Mundgefühl?",
        answerA = "Resveratrol",
        answerB = "Anthocyane",
        answerC = "Tannine (Polyphenole)",
        answerD = "Weinsäure",
        correctAnswer = 2,
        explanation = "Tannine sind polymere Polyphenole (kondensiert oder hydrolysierbar), die Proteine der Mundschleimhaut durch Wasserstoffbrücken und hydrophobe Wechselwirkungen präzipitieren. Dieser Proteinverlust in der Speichelschutzschicht erzeugt das raue, adstringierende Gefühl.",
        difficulty = 3,
        funFact = null
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Was versteht der Sommelier unter 'Brett' oder 'Brettanomyces' bei der Weinverkostung?",
        answerA = "Ein Holzton durch zu lange Barriquelagerung",
        answerB = "Ein Fehlaroma durch Hefen der Gattung Dekkera/Brettanomyces, beschrieben als Stallmist, Leder oder Pflaster",
        answerC = "Ein Korkton durch 2,4,6-Trichloranisol-Kontamination",
        answerD = "Ein Oxidationsfehler durch zu frühe Belüftung",
        correctAnswer = 1,
        explanation = "Brettanomyces bruxellensis produziert 4-Ethylphenol (Stallmist) und 4-Ethylguaiacol (Leder, Räucher) durch Decarboxylierung von Hydroxyzimtsäuren. In geringen Mengen gilt es in manchen Stilistiken als komplex, in hohen Mengen als Weinfehler.",
        difficulty = 3,
        funFact = "Viele Burgund-Liebhaber schätzen geringe Brett-Noten als 'terroir-Ausdruck' — obwohl es technisch ein mikrobiologischer Fehler ist."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Welche Traubensorte bildet die Grundlage für echten Champagner neben Chardonnay und Pinot Noir?",
        answerA = "Pinot Gris",
        answerB = "Meunier (Pinot Meunier)",
        answerC = "Aligoté",
        answerD = "Viognier",
        correctAnswer = 1,
        explanation = "Die drei klassischen Champagner-Trauben sind Chardonnay, Pinot Noir und Pinot Meunier (Meunier). Pinot Meunier macht etwa ein Drittel der Champagner-Rebfläche aus und bringt Frische sowie Fruchtigkeit in die Assemblage.",
        difficulty = 3,
        funFact = null
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Terroir' im wissenschaftlichen Sinne als messbarer Faktor bei Wein?",
        answerA = "Nur das geografische Herkunftsgebiet ohne weitere Faktoren",
        answerB = "Die Gesamtheit aus Boden, Klima, Topografie und menschlichem Einfluss, die den chemischen Fingerabdruck einer Weinregion definiert",
        answerC = "Der spezifische Klon einer Rebsorte, der auf einer Parzelle wächst",
        answerD = "Das Mikroklima des Weinkellers während der Reifung",
        correctAnswer = 1,
        explanation = "Wissenschaftliche Terroir-Forschung misst messbare Parameter: Bodenmineral-Profile (Ca, K, Mg), Niederschlagsverteilung, Hangneigung und Exposition. Isotopenverhältnisse (87Sr/86Sr) im Wein spiegeln die Geologie des Bodens wider und ermöglichen Herkunftsnachweise.",
        difficulty = 3,
        funFact = "Mit Strontium-Isotopen-Analyse kann man Weinbetrug nachweisen — jeder Boden hat eine einzigartige Isotopen-Signatur."
    ),

    // ── BROTBACKEN & FERMENTATION ─────────────────────────────────────────────

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Autolyse' beim Brotbacken und welchen Effekt hat sie auf das Gluten?",
        answerA = "Das Salzen des Teiges, um Hefewachstum zu kontrollieren",
        answerB = "Eine Ruhephase nur mit Mehl und Wasser, bei der Proteasen das Gluten vorhydratisieren und Disulfidbindungen vorreifen",
        answerC = "Die Zugabe von Ascorbinsäure zur Stärkung der Glutenstränge",
        answerD = "Das Falten des Teiges alle 30 Minuten zur mechanischen Glutenentwicklung",
        correctAnswer = 1,
        explanation = "Bei der Autolyse wird nur Mehl mit Wasser vermischt und 20–60 Minuten geruht, ohne Salz oder Hefe. Enzymatische Aktivität (Proteasen, Amylasen) hydratisiert Glutenproteine, wodurch späteres Kneten verkürzt wird und ein extensibleres, dehnbareres Teiggerüst entsteht.",
        difficulty = 3,
        funFact = "Die Autolyse-Methode wurde in den 1970er Jahren vom französischen Bäckereiwissenschaftler Raymond Calvel entwickelt."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet einen 'Poolish' von einem 'Biga' als Vorteige?",
        answerA = "Poolish ist ein fester Vorteig (ca. 50 % Hydration), Biga ist ein flüssiger Vorteig (ca. 100 % Hydration)",
        answerB = "Poolish ist ein flüssiger Vorteig (ca. 100 % Hydration), Biga ist ein fester Vorteig (50–60 % Hydration)",
        answerC = "Poolish enthält Salz, Biga enthält keines — beide haben identische Hydration",
        answerD = "Poolish wird warm geführt (30 °C), Biga kalt (2 °C) — Hydration ist gleich",
        correctAnswer = 1,
        explanation = "Poolish (französisch-polnischer Ursprung) ist ein flüssiger Vorteig mit ca. 1:1 Mehl-Wasser-Verhältnis (100 % Hydration). Biga (italienisch) ist ein fester Vorteig mit 50–60 % Hydration. Beide fördern Aromakomplexität durch verlängerte Fermentation.",
        difficulty = 3,
        funFact = null
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welche zwei Hauptstämme von Mikroorganismen machen einen gesunden Sauerteig aus?",
        answerA = "Saccharomyces cerevisiae und Aspergillus niger",
        answerB = "Wilde Hefen (z. B. Kazachstania humilis) und Milchsäurebakterien (z. B. Lactobacillus sanfranciscensis)",
        answerC = "Acetobacter xylinum und Gluconobacter oxydans",
        answerD = "Penicillium roqueforti und Geotrichum candidum",
        correctAnswer = 1,
        explanation = "Sauerteig ist ein symbiotisches Ökosystem aus wilden Hefen (Kazachstania humilis / Candida humilis) und homofermentativen oder heterofermentativen Milchsäurebakterien der Gattung Lactobacillus. Hefen produzieren CO₂ zur Lockerung, Bakterien erzeugen Milch- und Essigsäure für Geschmack und Haltbarkeit.",
        difficulty = 3,
        funFact = "Der älteste dokumentierte Sauerteigstarter der Welt wurde 2021 in einem ägyptischen Grab aus dem Jahr 1323 v. Chr. isoliert."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Dehnungstest' (Fenstertest/Windowpane Test) beim Brotbacken?",
        answerA = "Messen der Teigtemperatur mit einem Infrarotthermometer",
        answerB = "Dehnen eines kleinen Teigstücks gegen das Licht, um ein transparentes Glutenfenster ohne Risse zu erzeugen",
        answerC = "Tauchen des Teiges in Wasser, um die Dichte zu messen",
        answerD = "Einstechen des Teiges, um die Fermentationsreife zu prüfen",
        correctAnswer = 1,
        explanation = "Der Fenstertest prüft die Glutenentwicklung: Gut entwickeltes Gluten lässt sich so dünn dehnen, dass Licht hindurchscheint, ohne zu reißen. Reißt der Teig sofort, ist das Gluten unterentwickelt; lässt er sich nicht dehnen, ist er überknetet.",
        difficulty = 3,
        funFact = null
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welches Gas wird beim Backen hauptsächlich für die Lockerung von Backpulver-Gebäck verantwortlich gemacht?",
        answerA = "Sauerstoff durch Katalase-Reaktion",
        answerB = "Kohlendioxid durch Reaktion von Natriumbicarbonat mit Säure",
        answerC = "Wasserdampf durch sofortige Karamellisierung",
        answerD = "Stickstoff durch thermische Zersetzung von Ammoniumcarbonat",
        correctAnswer = 1,
        explanation = "Backpulver besteht aus Natriumbicarbonat (NaHCO₃) und einer Säurekomponente (Weinstein, Natriumaluminiumphosphat). Bei Feuchtigkeit und Hitze reagieren beide zu CO₂, Wasser und einem Salz. Das CO₂ dehnt Luftblasen im Teig aus und erzeugt die Porung.",
        difficulty = 3,
        funFact = "Doppelt wirkendes Backpulver reagiert zweimal: einmal bei Kontakt mit Wasser und einmal bei Hitze über 60 °C."
    ),

    // ── SELTENE ZUTATEN ───────────────────────────────────────────────────────

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Saffron Grade ISO 3632' und welche Klasse gilt als höchste Qualität?",
        answerA = "ISO 3632 Klasse I: Crocin-Gehalt ≥ 190 UV-Absorptionseinheiten",
        answerB = "ISO 3632 Klasse I: Crocin-Gehalt ≥ 250 UV-Absorptionseinheiten",
        answerC = "ISO 3632 Klasse IV: Der höchste Picrocrocin-Wert",
        answerD = "ISO 3632 Klasse II: Mineralstoffgehalt über 8 %",
        correctAnswer = 0,
        explanation = "ISO 3632 klassifiziert Safran in vier Klassen (IV = niedrigste, I = höchste) anhand der UV-Absorbanz bei 440 nm (Crocin/Färbekraft), 330 nm (Picrocrocin/Bitterkeit) und 257 nm (Safranal/Aroma). Klasse I erfordert mindestens 190 Absorptionseinheiten für Crocin.",
        difficulty = 3,
        funFact = "Für ein Kilogramm Safran werden 150.000–200.000 Safranblüten von Hand geerntet — nur die drei Narben jeder Blüte werden verwendet."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welche zwei Haupt-Trüffelarten werden in der europäischen Haute Cuisine am meisten geschätzt?",
        answerA = "Tuber melanosporum (Périgord-Schwarztrüffel) und Tuber magnatum (Weißer Alba-Trüffel)",
        answerB = "Tuber aestivum (Sommertrüffel) und Tuber borchii (Bianchetto)",
        answerC = "Tuber brumale (Wintertrüffel) und Tuber uncinatum (Burgundertrüffel)",
        answerD = "Tuber indicum (Chinesischer Trüffel) und Tuber mesentericum (Mésange-Trüffel)",
        correctAnswer = 0,
        explanation = "Tuber melanosporum (Périgord oder Schwarzer Diamant) ist das Prunkstück der französischen Küche; Tuber magnatum (weißer Alba-Trüffel) ist der teuerste Trüffel der Welt mit intensivem Knoblauch-Heu-Aroma. Beide sind Mykorrhiza-Pilze und können nicht kultiviert werden.",
        difficulty = 3,
        funFact = "Ein weißer Alba-Trüffel erzielte 2010 auf einer Auktion 105.000 Euro für 900 Gramm — ca. 116 Euro pro Gramm."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Wie wird echte Bourbon-Vanille (Vanilla planifolia) bestäubt, da die natürlichen Bestäuber in Mexiko fehlen?",
        answerA = "Durch künstliche Windbestäubung in Gewächshäusern",
        answerB = "Durch manuelle Handbestäubung mit einem dünnen Stäbchen, das Pollen auf die Narbe überträgt",
        answerC = "Durch genetisch veränderte Honigbienen aus Madagaskar",
        answerD = "Durch Chemikalien, die eine Selbstbestäubung auslösen",
        correctAnswer = 1,
        explanation = "Vanilla planifolia wird in Madagaskar, La Réunion und anderen Anbaugebieten von Hand bestäubt, weil der natürliche Bestäuber — eine Melipona-Bienenart — außerhalb Mexikos nicht vorkommt. Jede Blüte öffnet sich nur einen Tag und muss innerhalb von Stunden bestäubt werden.",
        difficulty = 3,
        funFact = "Die Handbestäubung der Vanille wurde 1841 von Edmond Albius, einem 12-jährigen Sklaven auf La Réunion, erfunden."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Was ist 'Katsuobushi' und welche chemische Verbindung ist für seinen intensiven Umami-Geschmack verantwortlich?",
        answerA = "Fermentierter Tintenfisch; Glutaminsäure",
        answerB = "Getrocknetes und geräuchertes Thunfischfilet (Bonito); Inosinmonophosphat (IMP)",
        answerC = "Eingelegter Seetang; Glutaminsäure",
        answerD = "Getrocknete Shiitake-Pilze; Guanosinmonophosphat (GMP)",
        correctAnswer = 1,
        explanation = "Katsuobushi (Bonitoflocken) wird aus Skipjack-Thun durch Kochen, Räuchern und monatelange Fermentation hergestellt. Inosinmonophosphat (IMP) ist der Hauptumami-Träger; in Kombination mit Glutaminsäure aus Kombu entsteht ein synergistischer Umami-Effekt, der als 'Dashi-Phänomen' bekannt ist.",
        difficulty = 3,
        funFact = null
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Welche Schimmelkulturen werden für die Herstellung von Roquefort-Käse verwendet und wie gelangen sie ins Innere des Käses?",
        answerA = "Penicillium camemberti; durch äußere Beimpfung der Rinde",
        answerB = "Penicillium roqueforti; durch Strichlöcher (Nadeln), die Sauerstoff ins Innere leiten",
        answerC = "Geotrichum candidum; durch Injektionen von Schimmelsporen-Suspension",
        answerD = "Aspergillus oryzae; durch natürliche Diffusion über die Käserinde",
        correctAnswer = 1,
        explanation = "Penicillium roqueforti wächst nur aerob. Deshalb werden reife Roquefort-Laibe mit langen Nadeln durchstochen, um Luftkanäle zu schaffen. Der Schimmel wächst entlang dieser Kanäle und erzeugt die charakteristischen blau-grünen Adern sowie das intensive Aroma durch Lipolyse.",
        difficulty = 3,
        funFact = "Penicillium roqueforti produziert Mycophenolsäure, die immunsuppressiv wirkt — weshalb Personen mit Immunsuppression bei Blauschimmelkäse vorsichtig sein sollten."
    ),

    // ── LEBENSMITTELRECHT & SCHUTZBEZEICHNUNGEN ───────────────────────────────

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die EU-Schutzbezeichnung 'g.U.' (geschützte Ursprungsbezeichnung / PDO)?",
        answerA = "Das Produkt enthält mindestens 30 % regionale Zutaten",
        answerB = "Erzeugung, Verarbeitung UND Aufbereitung müssen vollständig in der genannten Region erfolgen",
        answerC = "Nur die finale Verarbeitung muss in der genannten Region stattfinden",
        answerD = "Das Produkt muss mindestens 10 Jahre traditionell hergestellt worden sein",
        correctAnswer = 1,
        explanation = "Die EU-Verordnung 1151/2012 definiert g.U./PDO so, dass alle Produktionsstufen (Rohstoffgewinnung, Verarbeitung, Veredelung) in der definierten Region stattfinden müssen. Dies unterscheidet g.U. von g.g.A. (PGI), wo nur eine Stufe regional sein muss.",
        difficulty = 3,
        funFact = null
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welche EU-Verordnung regelt die Zusammensetzung von Schokolade und legt fest, welche Fette neben Kakaobutter verwendet werden dürfen?",
        answerA = "EU-Richtlinie 2000/36/EG",
        answerB = "EU-Verordnung (EG) 178/2002",
        answerC = "EU-Verordnung 1333/2008 über Lebensmittelzusatzstoffe",
        answerD = "EU-Verordnung 853/2004 über tierische Lebensmittel",
        correctAnswer = 0,
        explanation = "Die EU-Richtlinie 2000/36/EG (Kakao-Richtlinie) erlaubt die Verwendung von bis zu 5 % pflanzlichen Fetten (ausgenommen Kakao- und Laurinfette) neben Kakaobutter. Diese Fette müssen deklariert werden. Die Richtlinie wurde nach jahrelangem Streit zwischen 'Schokoladen-Puristen' (Belgien, Frankreich) und 'Cocoa-Butter-Equivalents-Ländern' (UK, Irland) verabschiedet.",
        difficulty = 3,
        funFact = "Das britische 'Dairy Milk' enthält Kakaobutterfett-Ersatzstoffe und durfte lange in anderen EU-Ländern nicht als 'Schokolade' verkauft werden."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist die Mindest-Reifezeit für Parmigiano Reggiano DOP nach EU-Recht?",
        answerA = "6 Monate",
        answerB = "12 Monate",
        answerC = "18 Monate",
        answerD = "24 Monate",
        correctAnswer = 1,
        explanation = "Die Produktspezifikation für Parmigiano Reggiano DOP schreibt eine Mindestreifung von 12 Monaten vor. Käse, der diese Prüfung nicht besteht, verliert das DOP-Zeichen und die charakteristische Rinde wird abgeschliffen. Die Premium-Variante 'Extra' reift mindestens 18 Monate, 'Riserva' mindestens 24 Monate.",
        difficulty = 3,
        funFact = null
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welches Pestizid-Monitoring-System kontrolliert in der EU Rückstände in Lebensmitteln und setzt die MRL-Grenzwerte?",
        answerA = "EFSA-Rapid-Alert-System (RASFF)",
        answerB = "EU-Verordnung (EG) 396/2005 mit EFSA als Risikobewertungsbehörde",
        answerC = "HACCP-Richtlinie 93/43/EWG",
        answerD = "Codex Alimentarius Standard CAC/MRL-1",
        correctAnswer = 1,
        explanation = "Die EU-Verordnung 396/2005 harmonisiert Pestizid-Höchstgehalte (MRL = Maximum Residue Levels) in Lebensmitteln. Die EFSA führt die wissenschaftliche Risikobewertung durch; die Europäische Kommission setzt daraufhin die verbindlichen Grenzwerte fest.",
        difficulty = 3,
        funFact = "RASFF (Rapid Alert System for Food and Feed) ist das separate EU-Warnsystem, das Mitgliedstaaten bei gefährlichen Lebensmitteln sofort benachrichtigt."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'E-Nummer' in der EU-Lebensmittelkennzeichnung und welche Kategorie hat die höchste Nummer?",
        answerA = "E 100–199 sind Farbstoffe; die höchste Kategorie (E 1400–1599) sind modifizierte Stärken",
        answerB = "E 100–199 sind Konservierungsstoffe; höchste Kategorie (E 900–999) sind Schaumverhütungsmittel",
        answerC = "E 100–199 sind Farbstoffe; die höchste Kategorie E 1000–1999 sind Sequestrans-Mittel",
        answerD = "Alle E-Nummern sind synthetisch; natürliche Zusatzstoffe haben keine E-Nummern",
        correctAnswer = 0,
        explanation = "Das EU-Zusatzstoffsystem ist nach Funktionsklassen unterteilt: E 100–199 Farbstoffe, E 200–299 Konservierungsstoffe, E 300–399 Antioxidationsmittel, E 400–499 Verdickungsmittel, E 500–599 Säureregulatoren, E 600–699 Geschmacksverstärker, E 900–999 Sonstige, E 1400–1599 modifizierte Stärken.",
        difficulty = 3,
        funFact = "Nicht alle E-Nummern sind synthetisch: E 100 (Kurkumin), E 162 (Betanin aus Roter Bete) und E 440 (Pektin aus Früchten) sind natürliche Verbindungen."
    ),

    // ── FLEISCHWISSENSCHAFT ───────────────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was ist Myoglobin und welche drei Oxidationszustände bestimmen die Fleischfarbe?",
        answerA = "Ein Bindegewebsprotein; Kollagen, Elastin, Reticulin",
        answerB = "Ein Sauerstoff-Speicherprotein; Myoglobin (lila), Oxymyoglobin (hellrot), Metmyoglobin (braun)",
        answerC = "Ein Enzymsystem; Katalase, Peroxidase, Oxidase",
        answerD = "Ein Farbstoff; Häm, Porphyrin, Chlorophyll",
        correctAnswer = 1,
        explanation = "Myoglobin (Fe²⁺, O₂-frei) ist purpurrot. Bei O₂-Kontakt entsteht Oxymyoglobin (Fe²⁺, O₂-gebunden), das leuchtend rot ist. Oxidation zu Metmyoglobin (Fe³⁺) ergibt braune Farbe. Die Verhältnisse dieser drei Formen bestimmen, warum Fleisch von innen dunkel und an der Oberfläche hell ist.",
        difficulty = 3,
        funFact = null
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was ist das Wagyu-Bewertungssystem BMS (Beef Marbling Standard) und was bedeutet BMS 12?",
        answerA = "Eine japanische Reifezeit-Skala; BMS 12 = 120 Tage Dry-Aging",
        answerB = "Eine Marmorierungsskala von 1–12 des JMGA; BMS 12 ist die maximale intramuskuläre Fettverteilung",
        answerC = "Ein USDA-System; BMS 12 entspricht dem USDA-Prime-Grad",
        answerD = "Eine Fettgehalt-Gewichtsskala; BMS 12 = 12 % intramuskuläres Fett",
        correctAnswer = 1,
        explanation = "Das JMGA (Japan Meat Grading Association) bewertet Marmorierung auf einer Skala von 1 (kaum Fett) bis 12 (extreme intramuskuläre Fettverteilung). BMS 12 gilt als höchste erreichbare Stufe und findet sich fast ausschließlich bei Kobe-Beef oder Matsusaka-Rindern.",
        difficulty = 3,
        funFact = "Echtes zertifiziertes Kobe-Beef darf nur aus Tajima-Rindern in der Präfektur Hyogo stammen und muss BMS 6 oder höher erreichen."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Ab welcher Temperatur beginnt Kollagen in Fleisch zu Gelatine zu hydrolysieren?",
        answerA = "52 °C",
        answerB = "63 °C",
        answerC = "70 °C",
        answerD = "80 °C",
        correctAnswer = 2,
        explanation = "Kollagen (Typ I und III in Bindegewebe) beginnt ab etwa 70 °C in wässriger Umgebung zu Gelatine zu hydrolysieren. Diese Umwandlung macht langsam geschmortes Fleisch 'schmelzend zart' — die Triple-Helix-Struktur des Kollagens entwindet sich zu zufälligen Polypeptidketten (Gelatine).",
        difficulty = 3,
        funFact = null
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dry Aging' von Rindfleisch auf biochemischer Ebene?",
        answerA = "Gefriertrocknung unter Vakuum, um Wasserverlust zu minimieren",
        answerB = "Oberflächenpasteurisierung mit UV-Licht zur Keimreduktion",
        answerC = "Enzymatische Reifung durch Calpaine und Cathepsine, die Myofibrillen abbauen, kombiniert mit Wasserverdunstung",
        answerD = "Marinierung in Salzlake zur Denaturierung von Oberflächen-Proteinen",
        correctAnswer = 2,
        explanation = "Beim Dry Aging bauen körpereigene Enzyme (Calpaine bei pH-Abfall nach dem Schlachten, Cathepsine aus Lysosomen) die Z-Linien der Myofibrillen ab, was die Fleischstruktur aufweicht. Gleichzeitig verdunsten bis zu 30 % Gewicht als Wasser, was die Aromen konzentriert.",
        difficulty = 3,
        funFact = "Der typische 'nussige' Dry-Aged-Geschmack entsteht nicht durch Schimmel allein, sondern durch Fettsäure-Oxidation zu Aldehyden und Ketonen an der Oberfläche."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was ist 'Rigor Mortis' und welchen Einfluss hat sie auf die Fleischqualität beim Schlachten?",
        answerA = "Postmortale Muskelstarre durch ATP-Erschöpfung; zu frühes Verarbeiten ergibt zähes Fleisch",
        answerB = "Sofortige Erstarrung des Fetts nach dem Abkühlen auf 4 °C",
        answerC = "Enzymatische Lyse der Muskelzellen durch Katalasen",
        answerD = "Oxidation von Myoglobin zu Metmyoglobin innerhalb der ersten 24 Stunden",
        correctAnswer = 0,
        explanation = "Nach dem Tod erschöpfen Muskeln ihre ATP-Reserven. Ohne ATP können Myosin und Aktin nicht voneinander lösen — sie bleiben als Actomyosin dauerhaft gebunden (Rigor Mortis, maximale Starre nach 6–12 h). Wird Fleisch während der Rigor verarbeitet, ist es zäh. Erst nach Auflösung durch enzymatische Reifung (2–14 Tage) wird es zart.",
        difficulty = 3,
        funFact = null
    ),

    // ── KAFFEE & TEE ──────────────────────────────────────────────────────────

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist der 'SCA-Cupping-Score' und ab welchem Wert gilt ein Kaffee als 'Specialty Coffee'?",
        answerA = "Ein Farbwert; ab 50 gilt er als Specialty",
        answerB = "Eine 100-Punkte-Skala der SCA; ab 80 Punkten gilt er als Specialty Coffee",
        answerC = "Ein Säuregrad; ab pH 5,0 gilt er als Specialty",
        answerD = "Ein Koffein-Gehalt; über 1,5 % Koffein gilt als Specialty",
        correctAnswer = 1,
        explanation = "Die Specialty Coffee Association (SCA) bewertet Kaffee nach einem standardisierten Cupping-Protokoll in 10 Kategorien (Aroma, Flavor, Aftertaste, Acidity, Body, Balance, Uniformity, Clean Cup, Sweetness, Overall). Ab 80 Punkten gilt ein Kaffee als Specialty; über 90 Punkte ist weltklasse.",
        difficulty = 3,
        funFact = "Weniger als 3 % der weltweiten Kaffeeernte erreicht den Specialty-Status von 80+ SCA-Punkten."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'First Crack' und 'Second Crack' beim Kaffeerösten?",
        answerA = "First Crack ist das Platzen von Wasserdampf-Druck (hörbar, ca. 196 °C); Second Crack ist die Freisetzung von CO₂ aus dem Zellinneren (ca. 224 °C)",
        answerB = "First Crack tritt bei 120 °C auf und zeigt Karamellisierung an; Second Crack bei 180 °C zeigt Maillard-Reaktion an",
        answerC = "First Crack ist maschinenseitig und Second Crack ist natürlich; beide treten bei 200 °C auf",
        answerD = "First Crack betrifft den äußeren Silberhäutchen; Second Crack betrifft die Kaffeezellwand",
        correctAnswer = 0,
        explanation = "First Crack (ca. 196 °C) entsteht durch Dampfdruck aus Feuchtigkeit und CO₂, die die Kaffeebohne aufsprengen — die Bohne vergrößert sich um bis zu 60 % und verliert Dichte. Second Crack (ca. 224 °C) ist das Bersten der Zellulosewände durch CO₂-Bildung; er markiert den Beginn von Dark Roasts.",
        difficulty = 3,
        funFact = null
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Welche zwei Hauptkaffeesorten (Arabica und Robusta) unterscheiden sich in welchem chemischen Merkmal besonders?",
        answerA = "Arabica hat ca. 2–3 % Koffein; Robusta hat ca. 0,8–1,2 % Koffein",
        answerB = "Arabica hat ca. 0,8–1,4 % Koffein; Robusta hat ca. 1,7–4 % Koffein",
        answerC = "Arabica hat mehr Chlorogensäure; Robusta hat mehr Saccharose",
        answerD = "Beide haben identischen Koffeingehalt; der Unterschied liegt im Ölgehalt",
        correctAnswer = 1,
        explanation = "Coffea arabica enthält 0,8–1,4 % Koffein in der Trockenmasse, während Coffea canephora (Robusta) 1,7–4 % enthält. Robusta produziert mehr Koffein als natürliches Insektizid, weil die tiefer liegenden Plantagen anfälliger für Schädlinge sind als Arabica-Hochlandkulturen.",
        difficulty = 3,
        funFact = "Arabica enthält deutlich mehr Saccharose (ca. 8 %) als Robusta (ca. 4 %), was einen süßlicheren Geschmack und komplexere Maillard-Reaktion beim Rösten ermöglicht."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Wie werden Tee-Qualitätsgrade wie 'FTGFOP1' im internationalen Teehandel entschlüsselt?",
        answerA = "FTGFOP1 = Fully Twisted Golden Flowery Orange Pekoe Grade 1 (höchste manuelle Ernte-Qualität)",
        answerB = "FTGFOP1 = Fine Tea Grade From Orange Plantation 1 (Ernteregion-Code)",
        answerC = "FTGFOP1 = Fermented Top Grade Fine Orange Pekoe 1 (Fermentationsgrad)",
        answerD = "FTGFOP1 = Fresh Tea Grade From Official Producer 1 (Zertifizierungscode)",
        correctAnswer = 0,
        explanation = "FTGFOP1 steht für 'Finest Tippy Golden Flowery Orange Pekoe Grade 1'. Jeder Buchstabe beschreibt Blattqualität: 'Tippy' (viele Blattknospen), 'Golden' (goldene Tipps), 'Flowery' (junge erste Blätter), 'Orange Pekoe' (oberste Blätter mit weißen Härchen). Grade 1 ist die höchste Abstufung.",
        difficulty = 3,
        funFact = null
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Durch welchen chemischen Prozess wird grüner Tee von schwarzem Tee unterschieden, und welches Enzym ist der Schlüssel?",
        answerA = "Oxidation durch Polyphenoloxidase; Grüntee wird direkt dampf- oder hitzefixiert, Schwarztee wird oxidiert",
        answerB = "Fermentation durch Milchsäurebakterien; Grüntee ist frisch, Schwarztee ist fermentiert",
        answerC = "Karamellisierung durch höhere Rösttemperatur; Schwarztee wird länger geröstet",
        answerD = "Extraktion durch Ethanol; Grüntee enthält mehr Catechine durch wässrige Extraktion",
        correctAnswer = 0,
        explanation = "Beide Teetypen kommen aus Camellia sinensis. Bei grünem Tee werden die Blätter sofort nach der Ernte durch Dämpfen (japanisch) oder Rösten in Woks (chinesisch) hitzefixiert, um die Polyphenoloxidase zu inaktivieren. Schwarztee lässt man die Blätter vollständig oxidieren (oft als 'Fermentation' bezeichnet, ist aber Enzymoxidation).",
        difficulty = 3,
        funFact = "Oolong-Tee ist teiloxidiert (15–85 %) — je nach Stil entsteht ein Spektrum von leicht blumig bis tief würzig."
    ),

    // ── SPIRITUOSEN & DESTILLATION ────────────────────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet einen 'Pot Still' von einem 'Column Still' (Coffey Still) bei der Whiskeyherstellung?",
        answerA = "Pot Still erzeugt hochprozentigere Destillate; Column Still erzeugt niedrigprozentigere",
        answerB = "Pot Still ist diskontinuierlich und erzeugt ein aromatisch reicheres Destillat; Column Still ist kontinuierlich und erzeugt reineres, höherprozentiges Destillat",
        answerC = "Pot Still wird für Bourbon verwendet; Column Still ist nur für Scotch erlaubt",
        answerD = "Beide erzeugen identische Destillate; der Unterschied liegt nur im Energieverbrauch",
        correctAnswer = 1,
        explanation = "Der Pot Still (Brennblase) ist ein diskontinuierliches System: jede Charge wird einzeln destilliert, meist zweimal (Schottland) oder dreimal (Irland). Er überträgt mehr Fuselöle und Kongener, die Aromakomplexität erzeugen. Der Continuous Column Still (erfunden 1831 von Aeneas Coffey) arbeitet kontinuierlich und erzeugt neutraleres, hochprozentigeres Destillat.",
        difficulty = 3,
        funFact = null
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Angel's Share' bei der Whiskey-Reifung und wie hoch ist er typischerweise pro Jahr?",
        answerA = "Das Restvolumen nach Abfüllung; ca. 5 % pro Jahr",
        answerB = "Der Anteil an Alkohol, der durch die Fasswand verdunstet; ca. 1–2 % pro Jahr in gemäßigtem Klima",
        answerC = "Der Wasserverlust durch Verdampfung; ca. 0,5 % pro Jahr",
        answerD = "Das Volumen, das beim Umfüllen verloren geht; ca. 3 % pro Befüllung",
        correctAnswer = 1,
        explanation = "Angel's Share bezeichnet die Alkohol-Wasser-Mischung, die durch die porösen Eichenholz-Fassdauben verdunstet. In Schottland und Irland beträgt er etwa 1–2 % pro Jahr; in heißen Klimazonen wie Kentucky (Bourbon) können es 4–8 % pro Jahr sein. Bei 50 Jahren Reifung verliert ein Fass so bis zu 2/3 seines Inhalts.",
        difficulty = 3,
        funFact = "In den Warehouses von Kentucky ist die Luft so gesättigt mit Alkoholdampf, dass sich eine schwarze Schimmelart (Baudoinia compniacensis) auf Fassaden, Bäumen und Häusern bildet."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was sind 'Kongenere' bei Spirituosen und warum sind sie für den Kater-Effekt relevant?",
        answerA = "Mineralsalze, die beim Destillieren im Kessel verbleiben",
        answerB = "Spurenverbindungen (Methanol, höhere Alkohole, Aldehyde, Ester), die neben Ethanol im Destillat entstehen",
        answerC = "Aromastoffe, die ausschließlich durch Fasslagerung entstehen",
        answerD = "Farbstoffe, die bei der Karamellisierung von Getreide entstehen",
        correctAnswer = 1,
        explanation = "Kongenere sind alle Verbindungen außer Wasser und Ethanol im Destillat: Methanol, Propanol, Butanol, Fuselöle (Isoamylalkohol), Acetaldehyd, Ester, Tannine. Studien zeigen, dass höhere Kongenere-Konzentrationen intensivere Kater-Symptome verursachen — weshalb helles Bier und Wodka oft weniger Kater erzeugen als dunkle Spirituosen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welche Destillationsregion in Mexiko darf als einzige 'Mezcal' mit dem Zusatz 'de Oaxaca' bezeichnen?",
        answerA = "Jalisco",
        answerB = "Guerrero",
        answerC = "Oaxaca (nach NOM-070-SCFI-2016)",
        answerD = "Durango",
        correctAnswer = 2,
        explanation = "Die mexikanische Norm NOM-070-SCFI-2016 regelt die Mezcal-Herkunft. Oaxaca ist historisch die wichtigste Region und gibt dem Mezcal seinen Namen. Tequila hingegen ist ausschließlich Jalisco (und vier weitere Bundesstaaten) vorbehalten und muss aus blauem Weber-Agave (Agave tequilana) hergestellt werden.",
        difficulty = 3,
        funFact = "Über 30 verschiedene Agave-Arten dürfen für Mezcal verwendet werden, aber nur Agave tequilana Weber var. Azul ist für Tequila zugelassen."
    ),

    // ── SCHOKOLADE & CONFISERIE ───────────────────────────────────────────────

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist 'Conchieren' bei der Schokoladenherstellung und welche chemischen Veränderungen bewirkt es?",
        answerA = "Das Temperieren der Schokolade auf 28 °C zur Kristallbildung",
        answerB = "Langes Rühren und Belüften der Kakaomasse bei 50–80 °C, das flüchtige Säuren austreibt, Feuchtigkeit reduziert und Aromen entwickelt",
        answerC = "Das Conchieren ist das Mahlen der Kakaobohnen auf unter 20 Mikrometer Partikelgröße",
        answerD = "Das Mischen von Kakaomasse mit Milchpulver unter Vakuum bei 40 °C",
        correctAnswer = 1,
        explanation = "Beim Conchieren (erfunden 1879 von Rodolphe Lindt) wird Kakaomasse stundenlang bis tagelang intensiv gerührt und belüftet. Dabei verdampfen unerwünschte Essigsäure und andere flüchtige Verbindungen, Feuchtigkeit sinkt unter 1 %, Kakaobutter umhüllt gleichmäßig alle Partikel, und Aromastoffe durch Maillard-Reaktion verstärken sich.",
        difficulty = 3,
        funFact = "Lindt entdeckte das Conchieren durch Zufall, als er eine Walzmaschine über das Wochenende laufen ließ — die Schokolade war danach deutlich glatter."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welche fünf stabilen Kristallformen hat Kakaobutter und welche ist die einzig gewünschte beim Temperieren?",
        answerA = "Form I–V; Form IV (Schmelzpunkt 28 °C) ist die gewünschte",
        answerB = "Form I–VI; Form V (β₂-Kristall, Schmelzpunkt 34 °C) ist die gewünschte",
        answerC = "Form I–VI; Form VI (härteste Form, Schmelzpunkt 36 °C) ist die gewünschte",
        answerD = "Form α, β, γ, δ, ε; β-Form (Schmelzpunkt 32 °C) ist die gewünschte",
        correctAnswer = 1,
        explanation = "Kakaobutter bildet sechs polymorphe Kristallformen (I–VI mit Schmelzpunkten von 17–36 °C). Form V (β₂-Polymorph, Schmelzpunkt ~34 °C) ist die Zielform beim Temperieren: Sie gibt Schokolade Glanz, Knackigkeit und Schmelz auf Körpertemperatur. Form VI entsteht bei falscher Lagerung und erzeugt Fettreif.",
        difficulty = 3,
        funFact = null
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fettreif' (Fat Bloom) bei Schokolade und wie entsteht er?",
        answerA = "Ein weißer Belag aus ausgefällten Zuckerkristallen durch Kondensation",
        answerB = "Eine graue Schicht aus umkristallisierter Kakaobutter, die bei Temperaturschwankungen aus Form V in Form VI umwandelt",
        answerC = "Ein Schimmelbefall durch Aspergillus-Arten bei zu hoher Luftfeuchtigkeit",
        answerD = "Oxidationsprodukte der Kakaobutter durch UV-Lichtexposition",
        correctAnswer = 1,
        explanation = "Fettreif (Fat Bloom) entsteht, wenn Kakaobutter-Kristalle der instabilen Form V bei Temperaturschwankungen (z. B. Kühlschrank → Zimmertemperatur) in die stabilere Form VI umkristallisieren. Die gröberen Form-VI-Kristalle reflektieren Licht diffus und erscheinen als grauer oder weißer Belag. Die Schokolade ist essbar, aber optisch und texturell beeinträchtigt.",
        difficulty = 3,
        funFact = "Zuckerreif (Sugar Bloom) sieht ähnlich aus, entsteht aber durch Kondensation: Wasser löst Zucker an der Oberfläche, der nach Verdunstung als rauhe Kristallschicht zurückbleibt."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Welches Fermentationsverfahren wird für Kakaobohnen nach der Ernte angewendet und welche Dauer ist typisch?",
        answerA = "Aerobe Milchsäuregärung; 12–24 Stunden",
        answerB = "Anaerobe Essigsäuregärung im Vakuumbeutel; 3–5 Tage",
        answerC = "Mehrstufige Fermentation: zunächst Hefen, dann Milchsäurebakterien, dann Essigsäurebakterien; 5–7 Tage",
        answerD = "Enzymatische Oxidation ohne Mikroorganismen; 2–3 Tage im Sonnenlicht",
        correctAnswer = 2,
        explanation = "Kakaobohnen werden mit dem Fruchtfleisch in Boxen oder Bananenblättern fermentiert. Zunächst vergären Hefen die Zucker des Fruchtfleisches anaerob zu Alkohol; dann wandeln Milchsäurebakterien Zucker in Milchsäure um; schließlich oxidieren Essigsäurebakterien Ethanol zu Essigsäure (40–50 °C), die den Samen abtötet und Aromaentwicklung ermöglicht.",
        difficulty = 3,
        funFact = null
    ),

    // ── MOLEKULARE GASTRONOMIE ────────────────────────────────────────────────

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist 'Methylcellulose' in der Molekularküche und welche ungewöhnliche thermische Eigenschaft hat sie?",
        answerA = "Ein Emulgator, der bei Kälte flüssig und bei Wärme fest wird (thermoreversibles Hydrokolloid)",
        answerB = "Ein Farbstoff, der bei Erhitzen von weiß zu transparent wird",
        answerC = "Ein Enzym, das Proteine bei Raumtemperatur vernetzt",
        answerD = "Ein Schaumbildner, der nur bei pH unter 4,5 Gele bildet",
        correctAnswer = 0,
        explanation = "Methylcellulose (E 461) ist ein modifiziertes Cellulose-Derivat mit inverser Thermogelierung: Bei Kälte (unter ca. 50 °C) ist es löslich und flüssig; beim Erhitzen (über 50–55 °C) bildet es ein festes Gel. Dies ermöglicht Desserts, die heiß serviert werden, aber beim Abkühlen im Mund schmelzen.",
        difficulty = 3,
        funFact = "Ferran Adrià nutzte Methylcellulose für heiße Gele, die sich beim Abkühlen verflüssigten — eine optisch verwirrende Umkehrung der Erwartungen."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Was ist 'Emulsifikation' auf molekularer Ebene und warum wird Lecithin als natürlicher Emulgator eingesetzt?",
        answerA = "Emulsifikation ist das vollständige Lösen von Fett in Wasser durch Erhitzen; Lecithin senkt den Siedepunkt",
        answerB = "Emulsifikation ist die stabile Verteilung zweier nicht mischbarer Phasen; Lecithin ist amphiphil (hydrophiler Phosphatidylkopf + hydrophober Fettsäureschwanz) und stabilisiert die Grenzfläche",
        answerC = "Emulsifikation ist eine chemische Reaktion bei der Fett zu Glycerin und Fettsäuren gespalten wird; Lecithin ist ein Katalysator",
        answerD = "Emulsifikation ist die Umwandlung von O/W in W/O-Emulsion durch mechanischen Druck; Lecithin erhöht die Viskosität",
        correctAnswer = 1,
        explanation = "Lecithin (Phosphatidylcholin) ist ein Phospholipid mit einer polaren, wasserliebenden Phosphatgruppe und einem unpolaren, fettlöslichen Fettsäure-Doppelschwanz. An der Öl-Wasser-Grenzfläche orientieren sich Lecithin-Moleküle so, dass sie beide Phasen 'anklammern' und die Grenzflächenspannung senken, wodurch die Emulsion stabilisiert wird.",
        difficulty = 3,
        funFact = "Eigelb enthält ca. 10 % Lecithin — weshalb es das klassische Emulgationsmittel für Mayonnaise und Hollandaise ist."
    )
)
