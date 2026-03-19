package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster5(): List<Question> = listOf(

    // ── KAFFEE: ANBAU & BOTANIK ───────────────────────────────────────────────

    // Question 1  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "In welcher optimalen Höhenlage werden die besten Arabica-Kaffeebohnen angebaut — und warum profitiert die Qualität von großer Höhe?",
        answerA = "600–2300 m — langsame Reifung durch kühle Temperaturen entwickelt komplexere Aromastoffe",
        answerB = "200–600 m — Kaffeerost befällt Pflanzen nur im Hochland, Tiefland ist sicherer",
        answerC = "2300–3500 m — Frost fördert die Ausbildung besonders harter Bohnen",
        answerD = "0–200 m — Meeresluft und Luftfeuchtigkeit begünstigen die Reifung",
        correctAnswer = 0,
        explanation = "Arabica gedeiht optimal zwischen 600 und 2300 m ü. M. In großer Höhe sind die Temperaturen kühler (18–22 °C), die Kirsche reift langsamer und hat mehr Zeit, komplexe Aromastoffe, Säuren und Zucker aufzubauen. Hochland-Arabicas gelten daher als qualitativ hochwertiger.",
        difficulty = 5,
        funFact = "Äthiopisches Yirgacheffe wird auf bis zu 2200 m Höhe angebaut — die Kombination aus Höhe, wilden Heferassen und erblichem Genpool der Ursprungspflanze erzeugt einzigartige Jasmin- und Zitrusnoten."
    ),

    // Question 2  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet die Arabica-Varietät 'Geisha' botanisch und geschmacklich von Standard-Typica, und woher stammt sie ursprünglich?",
        answerA = "Aus Japan (Präfektur Kagoshima), selektiert als koffeinfreie Varietät für den japanischen Markt",
        answerB = "Aus Äthiopien (Region Gori Gesha), bekannt für florale Jasmin- und Pfirsichnoten durch einzigartigen Genpool",
        answerC = "Aus Kolumbien, eine Kreuzung aus Typica und Bourbon mit erhöhtem Schokoladenanteil",
        answerD = "Aus Kenia, entwickelt als SL-Hybride mit extremer Trockenresistenz",
        correctAnswer = 1,
        explanation = "Geisha stammt aus dem Gori-Gesha-Wald in Äthiopien. Sie wurde in den 1930er-Jahren nach Costa Rica und später nach Panama gebracht, wo sie auf der Hacienda La Esmeralda weltberühmt wurde. Geishas DNA unterscheidet sich deutlich von Typica/Bourbon und produziert ausgeprägte florale Aromen (Jasmin, Bergamotte, Pfirsich).",
        difficulty = 5,
        funFact = "Bei der Best of Panama Auktion 2004 brach Hacienda La Esmeralda Geisha alle Preisrekorde — heute erzielen Spitzen-Geisha-Lots bis zu 10.000 USD pro Kilogramm."
    ),

    // Question 3  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Welche Coffea-Spezies hat den höchsten natürlichen Koffeingehalt, wird fast ausschließlich in der Industrie (Instant-Kaffee, Energie-Getränke) verwendet und wächst bevorzugt im Tiefland?",
        answerA = "Coffea liberica — ca. 1,8 % Koffein, angebaut in Westafrika",
        answerB = "Coffea arabica — ca. 1,5 % Koffein, hochwertigste Industriesorte",
        answerC = "Coffea canephora (Robusta) — ca. 2,7 % Koffein, Tiefland bis 600 m",
        answerD = "Coffea eugenioides — ca. 0,4 % Koffein, Vorfahre des Arabica",
        correctAnswer = 2,
        explanation = "Coffea canephora (Robusta) enthält mit ca. 2,7 % Koffein fast doppelt so viel wie Arabica (ca. 1,5 %). Das Koffein wirkt als natürliches Pestizid — ein Evolutionsvorteil im heißen, insektenreichen Tiefland. Robusta ist widerstandsfähiger, ertragreicher und billiger, aber aromatisch deutlich schlichter.",
        difficulty = 5,
        funFact = "Coffea eugenioides ist tatsächlich einer der beiden Elterteile des Arabica: Vor ca. 1 Million Jahren hybridisierten Coffea canephora und Coffea eugenioides spontan — das Ergebnis war das allotetraploide Coffea arabica."
    ),

    // Question 4  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was beschreibt das Konzept 'Kaffeegürtel' (Coffee Belt) und welche Klimaparameter definieren ihn exakt?",
        answerA = "Alle tropischen Regenwaldgebiete der Erde ohne Rücksicht auf Breitengrad oder Temperatur",
        answerB = "Nur die Hochlandregionen Äthiopiens, Kolumbiens und Javas über 1000 m Höhe",
        answerC = "Der Bereich zwischen 10°N und 10°S — nur die äquatornahen Regionen mit konstanter Hitze",
        answerD = "Der Bereich zwischen dem Wendekreis des Krebses und dem Wendekreis des Steinbocks (23,5°N–23,5°S) mit 1500–3000 mm Jahresniederschlag und 18–24 °C",
        correctAnswer = 3,
        explanation = "Der Kaffeegürtel umspannt den Bereich zwischen den Wendekreisen (23,5°N–23,5°S). Optimale Bedingungen: 1500–3000 mm Regen/Jahr, keine Fröste, Temperatur 18–24 °C (Arabica) bzw. 18–36 °C (Robusta). Über 50 Länder bauen Kaffee in diesem Gürtel an.",
        difficulty = 5,
        funFact = "Hawaii und Australien liegen knapp außerhalb oder an der Grenze des Kaffeegürtels, produzieren aber trotzdem Kaffee — dank günstiger Meereshöhe und Mikroklima."
    ),

    // ── KAFFEE: AUFBEREITUNG ──────────────────────────────────────────────────

    // Question 5  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Bei der 'Washed'-Aufbereitung (nasse Methode) wird Fruchtfleisch maschinell entfernt, dann Mucilage durch Fermentation abgebaut. Welcher Prozess findet dabei statt und was beeinflusst das Geschmacksprofil?",
        answerA = "Enzymatische und mikrobielle Fermentation baut Pektine der Mucilage ab — das Ergebnis sind klare, frucht- und säurebetonte Aromen",
        answerB = "Osmotische Trocknung entzieht der Bohne Wasser — Süße und Körper steigen, Säure sinkt",
        answerC = "Oxidation durch Luftkontakt karamellisiert die Mucilage — die Bohne bekommt ein nussiges Profil",
        answerD = "Chlorophyll-Abbau durch Sonnenlicht erzeugt Blumennoten im Grünkaffee",
        correctAnswer = 0,
        explanation = "Bei der Washed-Methode fermentieren Bakterien und Hefen die Mucilage (Pektinschicht) enzymatisch ab — 12–72 Stunden je nach Klima. Das Ergebnis ist ein sauberes, transparentes Geschmacksprofil, das Terroir und Varietät klar zeigt, mit ausgeprägter Frucht und heller Säure.",
        difficulty = 5,
        funFact = "Für 1 kg aufbereiteten Washed-Kaffee werden ca. 40 Liter Wasser benötigt — in wasserarmen Anbaugebieten ein ernstes Problem. 'Eco-pulpers' reduzieren den Wasserverbrauch um bis zu 90 %."
    ),

    // Question 6  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet den 'Black Honey Process' vom 'Yellow Honey Process' bei der Aufbereitung von Kaffeebohnen?",
        answerA = "Black Honey verwendet schwarze Rohrzuckermelasse als Fermentationsstarter, Yellow Honey verwendet Honig",
        answerB = "Black Honey: fast gesamte Mucilage bleibt an der Bohne, sehr langsame Trocknung → mehr Süße und Körper; Yellow Honey: nur 25 % Mucilage bleibt, schnelle Trocknung → leichteres Profil",
        answerC = "Die Farbe bezeichnet die Bohnenfarbe nach der Röstung: schwarz für Espresso, gelb für Filter",
        answerD = "Black Honey wird nur in Brasilien produziert, Yellow Honey nur in Costa Rica",
        correctAnswer = 1,
        explanation = "Beim Honey Process bleibt unterschiedlich viel Mucilage (Fruchtschleimhaut) an der Bohne. Black Honey: 100 % Mucilage, langsame Trocknung (bis 30 Tage), intensive Süße und Körper. Yellow Honey: ca. 25 % Mucilage, schnelle Trocknung, helleres, klareres Profil.",
        difficulty = 5,
        funFact = "Costa Rica gilt als Heimat des Honey Process — dort wurde er systematisch entwickelt und kommerzialisiert. Die Farbnamen (Yellow, Red, Black) beziehen sich auf die Farbe der Bohnen während der Trocknung."
    ),

    // Question 7  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was ist 'anaerobe Fermentation' bei der Kaffeeaufbereitung und warum erzeugt sie so ungewöhnliche Geschmacksprofile?",
        answerA = "Kaffeebohnen werden unter Wasser fermentiert, wodurch Chlorophyll vollständig abgebaut wird",
        answerB = "Eine Vakuumkammer entzieht der Bohne Sauerstoff und beschleunigt die Maillard-Reaktion bereits im Grünkaffee",
        answerC = "Kaffeebohnen fermentieren in versiegelten, sauerstoffarmen Behältern — Hefen und Bakterien produzieren andere organische Säuren und Ester als bei aerober Fermentation",
        answerD = "Kohlendioxide aus der Röstung werden in die noch ungerösteten Bohnen eingepresst",
        correctAnswer = 2,
        explanation = "Bei der anaeroben Fermentation werden Kaffeekirschen in versiegelte Tanks gefüllt. Ohne Sauerstoff dominieren andere Mikroorganismen (heterofermentative Lactobazillen, bestimmte Hefen) und produzieren exotische organische Säuren, Alkohole und Ester — oft fruchtig-tropische, weinartige oder sogar alkoholartige Noten.",
        difficulty = 5,
        funFact = "Anaerob fermentierter Kaffee polarisiert: Specialty-Coffee-Enthusiasten lieben die exotischen Noten, Traditionalisten kritisieren, dass die Bohne ihren Herkunftscharakter verliert."
    ),

    // ── KAFFEE: RÖSTUNG & EXTRAKTION ─────────────────────────────────────────

    // Question 8  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Welche chemischen Reaktionen laufen beim Kaffeerösten zwischen 150°C und 230°C ab, die für Aroma und Farbe verantwortlich sind?",
        answerA = "Verseifung von Fettsäuren und Oxidation von Chlorogensäuren zu Tanninen",
        answerB = "Hydrolyse von Stärke zu Maltose und anschließende Vergärung zu Ethanol",
        answerC = "Denaturierung von Proteinen zu löslichen Peptiden und Freisetzung von Schwefelverbindungen",
        answerD = "Maillard-Reaktion (Aminosäuren + reduzierende Zucker → Melanoidine + Aromastoffe) und Karamellisierung (Zucker → Karamell-Verbindungen)",
        correctAnswer = 3,
        explanation = "Zwei Hauptreaktionen prägen das Röstprofil: Die Maillard-Reaktion (ca. 155–165 °C) zwischen Aminosäuren und reduzierenden Zuckern erzeugt über 1000 Aromastoffe und braune Melanoidine. Die Karamellisierung (165–200 °C) karamellisiert Saccharose. Beim First Crack (ca. 196 °C) dehnt sich die Bohne aus und bricht auf.",
        difficulty = 5,
        funFact = "Kaffee enthält über 1000 flüchtige Aromastoffe — Wein zum Vergleich nur ca. 400. Die meisten entstehen erst durch die Röstung; im Rohkaffee sind kaum Aromen vorhanden."
    ),

    // Question 9  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Warum sollte Espresso mit exakt 9 Bar Brühdruck extrahiert werden — und was passiert bei zu hohem oder zu niedrigem Druck?",
        answerA = "9 Bar ermöglichen optimale Löslichkeit von Ölen, Säuren und Melanoidinen; zu viel Druck: Überextraktion (bitter, holzig); zu wenig: Unterextraktion (säuerlich, dünn, keine Crema)",
        answerB = "9 Bar ist der Siedepunkt des Wassers bei 90 °C in der Siebträgermaschine — Abweichungen verändern die Wassertemperatur, nicht den Geschmack",
        answerC = "Der Druck verhindert ausschließlich das Verstopfen des Siebs — Geschmack und Crema entstehen unabhängig vom Druck",
        answerD = "9 Bar wurde 1948 von Gaggia patentiert, hat aber keine chemische Begründung — es ist nur ein Industriestandard",
        correctAnswer = 0,
        explanation = "9 Bar ist der empirisch optimale Druck: Er emulgiert unlösliche Öle in Wasser, löst CO₂ aus den Bohnen (Crema-Bildung) und extrahiert das ideale Verhältnis von Aromastoffen, Säuren und Bitterstoffen. Zu hoher Druck (>11 Bar) führt zu Kanalbildung und Überextraktion; zu niedriger Druck (<7 Bar) zu Unterextraktion ohne Crema.",
        difficulty = 5,
        funFact = "Der optimale Brühdruck variiert je nach Bohne und Mahlgrad. Professionelle Baristi experimentieren bewusst mit 6–12 Bar, um das beste Profil für eine spezifische Bohne zu finden."
    ),

    // Question 10  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist das 'TDS' (Total Dissolved Solids) beim Kaffee und welcher TDS-Wert gilt für einen optimalen Filterkaffee nach der SCA-Norm?",
        answerA = "TDS = Trockensubstanz der Kaffeebohne vor der Röstung; Norm: unter 5 % für Specialty-Coffee",
        answerB = "TDS = gelöste Feststoffe im Kaffeegetränk; SCA-Norm für Filterkaffee: 1,15–1,35 % TDS",
        answerC = "TDS = die Temperatur des Extraktionswassers multipliziert mit der Brühzeit in Sekunden",
        answerD = "TDS ist kein Kaffeebegriff — der korrekte Begriff ist 'Extraction Yield'",
        correctAnswer = 1,
        explanation = "TDS (Total Dissolved Solids) misst den Anteil gelöster Stoffe im fertigen Kaffeegetränk. Die Specialty Coffee Association (SCA) definiert das 'Goldene Dreieck' für Filterkaffee: 1,15–1,35 % TDS bei einer Extraktionsausbeute von 18–22 %. TDS wird mit einem Refraktometer gemessen.",
        difficulty = 5,
        funFact = "Cold Brew Kaffee hat typischerweise einen TDS von 1,5–2,5 % — er wird dann mit Wasser oder Milch auf Trinkstärke verdünnt."
    ),

    // Question 11  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Welche Defektklassen unterscheidet das SCA-Grading-System für Grünkaffee, und ab welcher Defektanzahl gilt eine Probe als 'Specialty Grade'?",
        answerA = "Nur eine Defektklasse: alle Mängel werden gleichwertig gezählt; Specialty Grade: unter 10 Defekte",
        answerB = "Drei Klassen (A=minor, B=major, C=critical); Specialty Grade erfordert Klasse A",
        answerC = "Category 1 (primäre Defekte: schwarze Bohnen, Steine, Kirschenschalen) und Category 2 (sekundäre Defekte: Käfer-Schäden, Bruchbohnen); Specialty Grade: 0 primäre, max. 5 sekundäre Defekte pro 350 g",
        answerD = "Defekte werden ausschließlich nach Bohnenfarbe klassifiziert; Specialty Grade ist ausschließlich hellgrün",
        correctAnswer = 2,
        explanation = "Das SCA-Grading teilt Defekte in Primary (Category 1: schwarze, saure, pilzbefallene Bohnen, Steine — zählen schwer) und Secondary (Category 2: gebrochene, zerdrückte Bohnen, Chitinhüllen — zählen leicht). Specialty Grade: 0 Primary Defects, max. 5 Secondary Defects pro 350 g Stichprobe.",
        difficulty = 5,
        funFact = "Ein einziger Stein in der Probe genügt, um einen Kaffee disqualifizieren zu lassen — Steine beschädigen Mühlen und können Feuer in Röstern verursachen."
    ),

    // ── KAFFEE: VARIETÄTEN & ANBAUGEBIETE ────────────────────────────────────

    // Question 12  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was macht die kenianische Varietät SL28 aromatisch besonders, und warum ist sie trotz ihrer Qualität kommerziell schwierig anzubauen?",
        answerA = "SL28 hat das höchste Koffein-Profil aller Arabica-Sorten und ist daher bei Energydrink-Herstellern begehrt",
        answerB = "SL28 reift besonders schnell und kann dreimal im Jahr geerntet werden, was zu Überproduktion führt",
        answerC = "SL28 enthält keine Chlorogensäuren und ist daher magenfreundlicher als andere Varietäten",
        answerD = "SL28 produziert intensive Johannisbeere, Tamarinde und Zitrus durch hohen Chlorogensäuregehalt; anfällig gegen CBD (Coffee Berry Disease) und ergibt niedrige Erträge",
        correctAnswer = 3,
        explanation = "SL28 (Scott Laboratories 28) wurde in den 1930er-Jahren in Kenia selektiert. Ihre ungewöhnlich hohe Fruchtigkeit (schwarze Johannisbeere, Tamarinde, Grapefruit) gilt als einzigartig unter Arabica-Varietäten. Der Nachteil: hohe Anfälligkeit gegen Coffee Berry Disease (CBD) und Kaffeerost, geringe Erträge, anspruchsvolle Anbaubedingungen.",
        difficulty = 5,
        funFact = "Scott Laboratories selektierte SL28 ursprünglich wegen Dürreresistenz für trockene kenianische Regionen — die außergewöhnliche Qualität war ein unerwarteter Nebeneffekt."
    ),

    // Question 13  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Cup of Excellence' (COE), und wie beeinflusst dieser Wettbewerb den Weltmarktpreis für Specialty Coffee?",
        answerA = "COE ist ein internationaler Kaffeewettbewerb mit Blindverkostungen durch internationale Jury; Siegerlots werden per Online-Auktion versteigert und erzielen oft 50–300x den Weltmarktpreis",
        answerB = "COE ist eine EU-Zertifizierung für ökologisch angebauten Kaffee vergleichbar mit dem Bio-Siegel",
        answerC = "COE ist das Qualitäts-Grading-System der ICO (International Coffee Organization) für kommerziellen Kaffee",
        answerD = "COE ist ein brasilianischer Markenname für Premium-Espresso-Blends, die im Siebträger verwendet werden",
        correctAnswer = 0,
        explanation = "Cup of Excellence (gegr. 1999) ist der prestigeträchtigste Kaffeewettbewerb weltweit. Kaffeebauern reichen Lots ein, die zunächst national, dann von einer internationalen Jury blind verkostet werden (80+ Punkte). Die Siegerlots werden online versteigert — 2021 erzielte ein Guatemala-Lot 1029 USD/kg, das 500-fache des Weltmarktpreises.",
        difficulty = 5,
        funFact = "COE wurde ursprünglich nur in Brasilien abgehalten; heute gibt es Wettbewerbe in 12+ Ländern. Die Auktionserlöse gehen direkt an die Bauern — ein Paradigmenwechsel gegenüber dem traditionellen Kommoditätshandel."
    ),

    // Question 14  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Liberica-Kaffee' (Coffea liberica), und warum spielt er heute kaum noch eine Rolle im Welthandel, obwohl er einst Europa dominierte?",
        answerA = "Liberica ist eine europäische Züchtung aus den 1950er-Jahren, die durch genetische Veränderung koffeinarm ist",
        answerB = "Liberica dominierte nach dem Kaffeekraut-Befall (Hemileia vastatrix) 1869 kurz den Weltmarkt; heute nur noch in Malaysia/Philippinen; großer Kirschenbaum, holzige-rauchige Aromen, sehr niedriger Ertrag",
        answerC = "Liberica ist ausgestorben und nur noch in Genbanken erhalten",
        answerD = "Liberica und Arabica sind synonym — beide bezeichnen dieselbe Spezies mit unterschiedlichen Sortenbezeichnungen",
        correctAnswer = 1,
        explanation = "Als Hemileia vastatrix (Kaffeerost) 1869 die Arabica-Plantagen Ceylons und Südostasiens vernichtete, wurde Liberica als resistente Alternative gepflanzt und dominierte kurz den Weltmarkt. Als Arabica-resistente Sorten verfügbar wurden, verdrängte Robusta Liberica wieder. Heute wird Liberica fast nur noch in Westafrika, Malaysia und den Philippinen (Barako) angebaut.",
        difficulty = 5,
        funFact = "In Malaysia heißt Liberica-Kaffee 'Kopi-O kampung' und ist Teil der nationalen Kaffeekultur der älteren Generation — jüngere Malaysier entdecken ihn als 'Heritage Coffee' neu."
    ),

    // ── TEE: BOTANIK & KLASSIFIKATION ─────────────────────────────────────────

    // Question 15  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Alle Teesorten (Schwarz-, Grün-, Weiß-, Oolong-, Gelb- und Pu-Erh-Tee) stammen von derselben Pflanze ab. Welche Pflanze ist das, und was unterscheidet die Sorten?",
        answerA = "Camellia japonica — jede Sorte stammt von einer anderen Unterart dieser Zierpflanze",
        answerB = "Verschiedene Arten der Gattung Camellia — Schwarztee von C. sinensis, Grüntee von C. viridis, Weißtee von C. alba",
        answerC = "Camellia sinensis — der Unterschied liegt ausschließlich in der Verarbeitung (Oxidation, Fermentation, Trocknung), nicht in der Pflanze",
        answerD = "Thea sinensis und Thea assamica sind zwei völlig verschiedene Gattungen, die je nach Region angebaut werden",
        correctAnswer = 2,
        explanation = "Alle echten Teesorten stammen von Camellia sinensis ab. Schwarz = volloxidiert; Oolong = teiloxidiert; Grün = nicht oxidiert; Weiß = nur leicht welk gelassen; Gelb = leicht oxidiert + eingewickelt; Pu-Erh = fermentiert. Die Sorte, Erntezeitpunkt und Anbaugebiet prägen zusätzlich den Charakter.",
        difficulty = 5,
        funFact = "Camellia sinensis hat zwei Hauptvarietäten: sinensis (kleines Blatt, kühleres Klima, z.B. China, Japan) und assamica (großes Blatt, tropisch, z.B. Assam, Yunnan). Pu-Erh wird typischerweise aus C. sinensis var. assamica hergestellt."
    ),

    // Question 16  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen dem Schattenanbau bei Gyokuro und dem intensiveren Schattenanbau bei Tencha (der Matcha-Vorstufe) in Japan?",
        answerA = "Gyokuro wird überhaupt nicht beschattet — nur Tencha/Matcha wird abgedeckt",
        answerB = "Beide werden gleich behandelt; der einzige Unterschied ist das Mahlverfahren: Gyokuro wird gerollt, Tencha gemahlen",
        answerC = "Kabusecha (halbschattig) wird für Gyokuro verwendet, während Tencha kein Schattenwachstum benötigt",
        answerD = "Gyokuro: ca. 20 Tage Schattierung mit 70–90 % Lichtreduktion; Tencha: 20–30 Tage mit 95–99 % Lichtreduktion, zusätzlich werden Stängel und Blattadern vor dem Mahlen entfernt",
        correctAnswer = 3,
        explanation = "Gyokuro wird ca. 20 Tage vor der Ernte zu 70–90 % beschattet. Tencha, die Vorstufe von Matcha, wird bis zu 30 Tage mit fast vollständiger Lichtreduktion (95–99 %) angebaut. Durch Lichtblockade erhöht sich L-Theanin (Umami) und Chlorophyll, während Catechine (Bitterkeit) nicht gebildet werden. Bei Tencha werden zudem Stängel und Blattrippen entfernt.",
        difficulty = 5,
        funFact = "Das intensive Schattenwachstum lässt die Teeblätter eine leuchtend dunkelgrüne Farbe entwickeln, die für hochwertigen Matcha charakteristisch ist. Billiger Matcha aus unverschatteten Blättern ist blasser und bitterer."
    ),

    // Question 17  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'L-Theanin' im Tee, und wie interagiert es mit Koffein, um den typischen 'ruhigen Wachheitszustand' von Matcha zu erzeugen?",
        answerA = "L-Theanin ist eine Aminosäure, die Alpha-Gehirnwellen fördert; in Kombination mit Koffein dämpft es Koffein-Jitteriness und verlängert die konzentrierte Wachheit ohne Aufgeregtheit",
        answerB = "L-Theanin ist ein Alkaloid das Koffein im Magen chemisch bindet und so die Resorption verlangsamt",
        answerC = "L-Theanin ist ein natürliches Beruhigungsmittel ohne jegliche synergistische Wirkung mit Koffein",
        answerD = "L-Theanin erhöht den Koffeingehalt des Tees durch Biosynthese während des Schattenwachstums",
        correctAnswer = 0,
        explanation = "L-Theanin (Glutamat-Analogon) überquert die Blut-Hirn-Schranke und fördert Alpha-Gehirnwellen (entspannte Wachheit). Zusammen mit Koffein bewirkt es synergistisch verbesserte Aufmerksamkeit, Reaktionszeit und Stimmung — ohne die Nervosität und den Jitter-Effekt, den Koffein alleine erzeugt. Matcha enthält besonders viel L-Theanin durch Schattenanbau.",
        difficulty = 5,
        funFact = "Ein Gramm Matcha enthält ca. 34 mg Koffein und 17–22 mg L-Theanin. Verglichen mit Kaffee (ca. 80–120 mg Koffein/Tasse ohne Theanin) ist die Wirkung gleichmäßiger und länger anhaltend."
    ),

    // Question 18  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Oolong-Tee' exakt, und wie bestimmt der Oxidationsgrad den Charakter des Endprodukts?",
        answerA = "Oolong ist volloxidierter Tee, der extra-lange in Holzfässern gereift wurde",
        answerB = "Oolong ist teiloxidierter Tee (15–85 % Oxidation); leichter Oolong (15–30 %) ähnelt Grüntee mit floralen Noten; schwerer Oolong (60–85 %) ähnelt Schwarztee mit röstigen, karamellartigen Noten",
        answerC = "Oolong ist ein Mischprodukt aus Schwarz- und Grüntee verschiedener Plantagen",
        answerD = "Oolong bezeichnet ausschließlich eine spezifische Tee-Varietät aus der Wuyi-Region — keine Verarbeitungsmethode",
        correctAnswer = 1,
        explanation = "Oolong liegt im Oxidationsspektrum zwischen Grün- (0–5 %) und Schwarztee (95–100 %). Leichter Oolong (z.B. Bao Zhong): 15–30 % Oxidation, hellgrün, floral-cremig. Schwerer Oolong (z.B. Da Hong Pao aus Wuyi): 60–85 %, röstartig, dunkel, erdige Mineralität.",
        difficulty = 5,
        funFact = "Die Oxidation von Oolong wird durch Welken (Sonnenlicht), Schütteln und kontrolliertes Liegen in Körben präzise gesteuert. Der Meister riecht und tastet stündlich, um den optimalen Oxidationspunkt zu erkennen."
    ),

    // ── TEE: PU-ERH ───────────────────────────────────────────────────────────

    // Question 19  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Sheng Pu-Erh' (roher Pu-Erh) von 'Shou Pu-Erh' (reifer Pu-Erh) in der Herstellung, und welcher ist traditionell höherwertiger?",
        answerA = "Sheng wird in Stein-Pressen gepresst, Shou in Holzformen; beide fermentieren gleich lang",
        answerB = "Shou ist traditionell höherwertiger, weil die beschleunigte Fermentation mehr Gesundheitsverbindungen produziert",
        answerC = "Sheng: natürliche Langzeitfermentation über Jahrzehnte; Shou: künstlich beschleunigte Nassfermentation (Wo Dui, 1973 entwickelt); Sheng-Jahrgänge gelten als hochwertig und sammelwürdig",
        answerD = "Sheng und Shou sind identisch; der Unterschied bezeichnet nur das Erntejahr (jung vs. alt)",
        correctAnswer = 2,
        explanation = "Sheng (roh) wird nach dem Trocknen auf der Sonne gepresst und reift natürlich über 10–50+ Jahre — Mikroorganismen fermentieren ihn langsam. Shou (reif) entstand 1973 als CNNP-Innovation: Leaves werden angefeuchtet, aufgestapelt und bei 35–45 °C mit Wo Dui (Nassfermentation) in 45 Tagen 'gereift'. Alte Sheng-Cakes aus den 1950er–70er-Jahren erzielen Auktionspreise von Tausenden USD.",
        difficulty = 5,
        funFact = "Ein Bing Cha (357 g Sheng-Cake) aus dem Jahr 1952, der Red Mark Puerh, wurde 2020 für 1,7 Millionen HKD (ca. 220.000 USD) versteigert — teurer als viele Burgunderweine."
    ),

    // Question 20  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Gushu-Pu-Erh' und warum ist er erheblich teurer als Pu-Erh von jungen Plantagen-Teebäumen?",
        answerA = "Gushu bezeichnet Pu-Erh der mindestens 50 Jahre im Keller gelagert wurde — Alter der Lagerung, nicht der Bäume",
        answerB = "Gushu ist ein Qualitätszertifikat der chinesischen Regierung für Pu-Erh aus kontrollierten Naturschutzgebieten",
        answerC = "Gushu bezeichnet Pu-Erh der zweimal fermentiert wurde — einmal Sheng, dann nochmals Shou",
        answerD = "Gushu (alte Bäume, mind. 100 Jahre) haben tiefere Wurzeln, vielfältigere Mineralstoffaufnahme und weniger Schädlingsbefall; konzentrierte Aromen, dickere Blätter, tieferer Körper",
        correctAnswer = 3,
        explanation = "Gushu (古树, alte Bäume) bezeichnet Pu-Erh von Teebäumen über 100 Jahren (manche über 500 Jahre). Alte Bäume wachsen langsamer, ihre Wurzeln reichen tief in mineralreiche Schichten, sie haben von Natur aus weniger Schädlingsbefall und produzieren komplexere, konzentriertere Aromen. Plantagen-Tee (taidi cha) von jungen Büschen ist deutlich günstiger.",
        difficulty = 5,
        funFact = "Im Lincang-Distrikt (Yunnan) gibt es Teebäume, die über 3000 Jahre alt sein sollen. Ein einziger 100-g-Cake von Gushu-Tee alter Bäume kann 500–5000 USD kosten."
    ),

    // Question 21  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Welche Mikroorganismen sind für die mikrobielle Fermentation beim Pu-Erh-Tee hauptverantwortlich und welche Aromaverbindungen entstehen dabei?",
        answerA = "Aspergillus niger, Penicillium, Rhizopus und Lactobazillen — sie produzieren Galactomannan, Theabrownine und erdige Terpenoide (Geosmin), die das typische Pu-Erh-Aroma erzeugen",
        answerB = "Nur Saccharomyces cerevisiae (Bäckerhefe) fermentiert Pu-Erh, ähnlich wie bei Weinherstellung",
        answerC = "Ausschließlich thermophile Bakterien bei Temperaturen über 60 °C — Schimmelpilze spielen keine Rolle",
        answerD = "Die Fermentation ist rein chemisch (Autooxidation der Catechine) ohne mikrobielle Beteiligung",
        correctAnswer = 0,
        explanation = "Pu-Erh-Fermentation ist hochkomplex: Aspergillus niger und Penicillium produzieren Cellulasen und Proteasen, die Zellwände aufbrechen. Lactobazillen erzeugen organische Säuren. Dabei entstehen Theabrownine (verantwortlich für Farbe und Körper), abgebaute Catechine, Geosmin (erdiger Geruch) und diverse Terpenoide.",
        difficulty = 5,
        funFact = "Geosmin — die Verbindung die 'Erde nach Regen' riecht — ist im Pu-Erh ein erwünschtes Aromamerkmal. Der Mensch riecht Geosmin ab 5 Teile pro Trillion (ppt) — eine der stärksten Geruchswahrnehmungen überhaupt."
    ),

    // ── TEE: TEEZEREMONIEN & KULTUR ───────────────────────────────────────────

    // Question 22  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was sind die vier Grundprinzipien des japanischen Chado (Teeweg, 茶道), formuliert von Sen no Rikyū im 16. Jahrhundert?",
        answerA = "Ma (Raum), Ki (Energie), Do (Weg), Sabi (Melancholie)",
        answerB = "Wa (Harmonie), Kei (Ehrfurcht/Respekt), Sei (Reinheit), Jaku (Stille/Gelassenheit)",
        answerC = "Mono no Aware (Vergänglichkeit), Wabi (Schlichtheit), Sabi (Patina), Yūgen (Tiefe)",
        answerD = "Ichi-go ichi-e (Einmaligkeit), Mushin (Leere), Zanshin (Bewusstsein), Fudōshin (Unerschütterlichkeit)",
        correctAnswer = 1,
        explanation = "Sen no Rikyū (1522–1591) formulierte die vier Grundprinzipien: Wa (和, Harmonie), Kei (敬, Ehrfurcht), Sei (清, Reinheit), Jaku (寂, Stille/Gelassenheit). Diese Prinzipien sind untrennbar mit Zen-Buddhismus verbunden.",
        difficulty = 5,
        funFact = "Sen no Rikyū wurde 1591 von Toyotomi Hideyoshi zum Tode durch Seppuku verurteilt — möglicherweise wegen seines zu großen politischen Einflusses. Seine Nachkommen führten drei Teeschulen weiter: Ura Senke, Omote Senke und Mushanokōji Senke."
    ),

    // Question 23  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Gongfu Cha' (功夫茶) und wie unterscheidet sich die Brühmethode fundamental vom westlichen Teeaufguss?",
        answerA = "Gongfu Cha ist eine kung-fu-ähnliche Körperhaltung beim Teetrinken mit rituellen Bewegungsabläufen",
        answerB = "Gongfu Cha bezeichnet ausschließlich Teezeremonien bei kaiserlichen Banketten in der Ming-Dynastie",
        answerC = "Gongfu Cha = viele kleine Aufgüsse (5–15 ml pro Guss) mit großer Teeblattmenge in kleinen Yixing-Teekannen — jeder Aufguss dauert nur 10–60 Sekunden und entwickelt den Tee schrittweise",
        answerD = "Gongfu Cha ist ein einzelner langer Aufguss (10–15 Minuten) um maximale Inhaltsstoffe zu extrahieren",
        correctAnswer = 2,
        explanation = "Gongfu Cha (wörtlich 'Tee mit Geschick/Können') verwendet viel Tee in kleinen Behältern (Gaiwan oder Yixing-Kanne) und viele kurze Aufgüsse. Dadurch entwickelt jede Infusion einen anderen Charakter — die Aromen öffnen sich schrittweise. Im westlichen Teeaufguss wird typischerweise wenig Tee lange gezogen.",
        difficulty = 5,
        funFact = "Die Yixing-Teekannen aus Zisha-Ton (Lila Sand) absorbieren über Jahre Teeöle und formen sich dadurch dem bevorzugten Tee an — eine alte Kanne für einen spezifischen Tee gilt als unersetzlich."
    ),

    // Question 24  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ichi-go ichi-e' (一期一会) im Kontext der japanischen Teezeremonie, und wie formt es die Haltung der Teilnehmer?",
        answerA = "Ein technischer Begriff für den Moment des ersten Aufgusses in der Teekanne",
        answerB = "Das Prinzip, dass jede Tasse Tee anders schmeckt je nach Jahreszeit",
        answerC = "Eine Regel, die besagt, dass jeder Gast nur einmal eingeladen werden darf",
        answerD = "Jede Teezeremonie ist einzigartig und nie wiederholbar — Gäste und Gastgeber begegnen sich mit der Haltung, dass dieser Moment nie wieder identisch sein wird",
        correctAnswer = 3,
        explanation = "'Ichi-go ichi-e' (eine Zeit, eine Begegnung) beschreibt die Haltung, jede Teezeremonie als einmalig zu betrachten: Diese exakte Zusammenstellung von Menschen, Wetter, Jahreszeit, Tee und Atmosphäre wird nie wieder identisch sein. Diese Erkenntnis ruft zu vollständiger Präsenz und Wertschätzung auf — ein tiefes Konzept aus dem Zen-Buddhismus.",
        difficulty = 5,
        funFact = "Der Begriff 'Ichi-go ichi-e' wurde vom Teemaster Ii Naosuke im 19. Jahrhundert geprägt, ist aber heute weit über die Teezeremonie hinaus bekannt — als allgemeines Lebenskonzept der Vergänglichkeit und Präsenz."
    ),

    // ── TEE: MATCHA & JAPANISCHE TEES ─────────────────────────────────────────

    // Question 25  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Ceremonial Grade Matcha' von 'Culinary Grade Matcha' in Bezug auf Ernte, Verarbeitung und Inhaltsstoffe?",
        answerA = "Ceremonial: erste Ernte (Ichibancha), nur Blattspitzen, Schattenanbau, Granitstein-Mühle, tiefgrün, süßlich-umami; Culinary: spätere Ernten, mehr Stängel, hellgrüner, bitterer — zum Backen/Kochen",
        answerB = "Ceremonial Matcha enthält kein Koffein, Culinary Matcha hat normalen Koffeingehalt",
        answerC = "Ceremonial Grade kommt ausschließlich aus Nishio (Aichi), Culinary Grade darf aus China importiert werden",
        answerD = "Der einzige Unterschied ist die Verpackung — biochemisch sind beide Grades identisch",
        correctAnswer = 0,
        explanation = "Ceremonial Grade: Ichibancha (erster Flush), beschattet, nur zarte Blattspitzen, Stängel und Nerven entfernt, langsam auf Granitstein gemahlen, intensiv grün, süß, umami-reich. Culinary Grade: zweiter/dritter Flush, mehr Stängel, weniger Schatten, oft maschinell gemahlen, helleres Grün, deutlich bitterer — funktioniert beim Backen, aber nicht für Teezeremonien.",
        difficulty = 5,
        funFact = "Echter Ceremonial Matcha wird mit einem Chasen (Bambusbesen mit 80–120 Fäden) zu einer feinen Emulsion geschlagen — Billigmatcha schäumt nicht richtig, weil die Partikelgröße zu grob ist."
    ),

    // Question 26  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kabusecha' und wie positioniert er sich aromatisch zwischen Gyokuro und normalem Sencha?",
        answerA = "Kabusecha ist ein Schwarztee aus Kagoshima mit starkem Körper und wenig Tanninen",
        answerB = "Kabusecha = halbschattiger Tee (ca. 7–14 Tage Abdeckung mit 50–70 % Lichtreduktion); aromatisch zwischen Sencha (klar, grasig) und Gyokuro (tief-umami, süß) — weniger Bitterkeit als Sencha, weniger Umami als Gyokuro",
        answerC = "Kabusecha bezeichnet Sencha der im Frühjahr ohne Schattierung aus alten Bäumen geerntet wird",
        answerD = "Kabusecha und Gyokuro sind identisch — 'Kabuse' ist nur ein regionaler Dialektausdruck für Schattierung",
        correctAnswer = 1,
        explanation = "Kabusecha (かぶせ茶, 'bedeckter Tee') ist ein Zwischen-Tee: 7–14 Tage Abdeckung mit Schattierungsnetzen reduziert ca. 50–70 % des Lichts (Gyokuro: 90–99 %). Das Ergebnis: mehr L-Theanin und Chlorophyll als Sencha, aber weniger als Gyokuro. Geschmacklich: dezentes Umami, frisches Gras, mäßige Bitterkeit.",
        difficulty = 5,
        funFact = "Kabusecha aus Mie-Präfektur und Shizuoka-Präfektur gelten als besonders hochwertig. Der 'Ise-Kabuse' aus Mie ist regional so bedeutend wie Gyokuro aus Uji für die traditionelle japanische Teekultur."
    ),

    // ── TEE: ANBAUGEBIETE & KLASSIFIKATION ───────────────────────────────────

    // Question 27  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die Klassifikation 'SFTGFOP1' bei einem Darjeeling-Tee, und was sagt sie über Qualität und Blattstruktur aus?",
        answerA = "Slow Fermented Traditional Green Flowery Orange Processing — eine chinesische Zertifizierung für langsam fermentierte Tees",
        answerB = "Super Fine Turkish Grade Full Orange Pekoe — eine osmanische Qualitätsstufe für importierten indischen Tee",
        answerC = "Special Finest Tippy Golden Flowery Orange Pekoe 1 — höchste Qualitätsstufe; Tee enthält viele goldene Spitzen (Tippy), Blütenblätter (Flowery), zarte ganze Blätter (Pekoe), kaum Bruch",
        answerD = "SFTGFOP1 ist kein reales Klassifizierungssystem; Darjeeling wird nur nach Flush (1st, 2nd, Autumn) klassifiziert",
        correctAnswer = 2,
        explanation = "SFTGFOP1 = Special Finest Tippy Golden Flowery Orange Pekoe 1, die höchste Klassifizierungsstufe im orthodoxen Schwarztee-Grading. Jeder Buchstabe bezeichnet eine Eigenschaft: Tippy (viele goldene Knospenspitzen), Flowery (Blütennoten, ganze Blätter), Orange Pekoe (ungerollte ganze Blätter), die '1' für außergewöhnliche Qualität innerhalb dieser Klasse.",
        difficulty = 5,
        funFact = "Scherzhaft steht SFTGFOP auch für 'Sounds Fancy The Guy Found On Plants' — das System ist berüchtigt für seine Komplexität."
    ),

    // Question 28  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Muscatel Character' im Darjeeling Second Flush, und durch welchen biologischen Prozess entsteht er?",
        answerA = "Ein synthetisches Aroma das durch Muskatnuss-Extrakte beim Trocknen des Tees hinzugefügt wird",
        answerB = "Ein natürlicher Reifeprozess der Knospen durch Sonnenbestrahlung im Sommer",
        answerC = "Eine chemische Reaktion zwischen Chlorophyll und Tanninen bei der Oxidation des Second Flush",
        answerD = "Ein traubig-blumiges Aroma, das durch den Befall der Teeblätter mit der Zikade Empoasca flavescens entsteht — ähnlich wie bei taiwanesischem Dongfang Meiren",
        correctAnswer = 3,
        explanation = "Der legendäre 'Muscatel Character' des Darjeeling Second Flush entsteht durch den Befall der Teeblätter mit der kleinen Blattzikade Empoasca flavescens. Als Abwehrreaktion produziert die Pflanze Terpene und Aromaverbindungen, die nach dem Verarbeiten als traubig-blumige Muskatnote wahrnehmbar sind.",
        difficulty = 5,
        funFact = "Dieses Phänomen — Insektenbefall als Qualitätsmerkmal — tritt auch beim taiwanesischen 'Oriental Beauty' (Dongfang Meiren) auf. Dort verursacht dieselbe Zikade (Jacobiasca formosana) die begehrten Honig-Aromen im Tee."
    ),

    // Question 29  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Welche zwei Hauptvarietäten von Camellia sinensis werden in Assam angebaut, und wie unterscheiden sich ihre Eigenschaften?",
        answerA = "C. sinensis var. assamica (großblättrig, hohe Tannine, kräftiger Körper, für Masala Chai) und C. sinensis var. sinensis (kleinblättrig, importiert für Specialty-Tees) — assamica dominiert mit >95 %",
        answerB = "Darjeeling-Klon und Assam-Klon — beide sind künstlich gezüchtet und genetisch identisch",
        answerC = "C. sinensis var. assamica und C. assamica var. lasiocalyx — nur auf den Hochplateaus von Assam angebaut",
        answerD = "CTC-Varietät und Orthodox-Varietät — keine botanischen Unterarten, sondern Verarbeitungsmethoden",
        correctAnswer = 0,
        explanation = "In Assam dominiert C. sinensis var. assamica — großblättrig, robust, bildet hohe Tannine und Theaflavin-Verbindungen. Das ergibt den typischen starken, malzigen Assam-Schwarztee mit tiefer Farbe, perfekt für Milch-Chai. C. sinensis var. sinensis wird gelegentlich für Premium-Orthodox-Tees angebaut, ist aber eine Minderheit.",
        difficulty = 5,
        funFact = "Assam produziert ca. 52 % des gesamten indischen Tees und ist mit über 850 Teegärten die größte Teeanbauregion der Welt. Der Brahmaputra-Fluss reguliert das Klima und ermöglicht die hohe Produktion."
    ),

    // Question 30  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dianhong' (滇红) und welche Eigenschaften machen diesen Yunnan-Schwarztee unverwechselbar gegenüber anderen Schwarztees?",
        answerA = "Ein stark fermentierter Pu-Erh-Schwarztee der mindestens 3 Jahre gereift sein muss",
        answerB = "Yunnan-Schwarztee aus C. sinensis var. assamica mit goldenem Flaum (Golden Buds), warmen Aromen (Malz, Kakao, Pfeffer), durch hohen Lipidgehalt cremiger Körper ohne Milch",
        answerC = "Ein grüner Tee aus Yunnan der durch spezielle Trocknungsmethode schwarz erscheint",
        answerD = "Eine nur im Winter geerntete Spezialsorte für den chinesischen Kaiserhof",
        correctAnswer = 1,
        explanation = "Dianhong (云南红茶, Yunnan Red Tea) entstand 1939 als chinesischer Exporttee. Hergestellt aus den großblättrigen assamica-Pflanzen Yunnans, enthält er besonders viele goldene Knospenspitzen. Charakteristisch: warme Aromen (Malz, Honig, Kakao, weißer Pfeffer), samtig-cremiger Körper, tiefe kupferfarbene Infusion.",
        difficulty = 5,
        funFact = "Die Mao-Feng-Knospenspitzen des Dianhong sind vollständig mit goldenen Trichomen bedeckt — je mehr Gold, desto hochwertiger. 'Golden Monkey' (金猴) ist die begehrteste Dianhong-Qualitätsstufe."
    ),

    // ── KAFFEE: SPEZIALTHEMEN ─────────────────────────────────────────────────

    // Question 31  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Third Wave of Coffee' und wie unterscheidet sie sich fundamental von der ersten und zweiten Kaffeewelle?",
        answerA = "1. Welle: Kaffeeplantagen in Kolonien; 2. Welle: Fairer Handel; 3. Welle: Biokaffee ohne Pestizide",
        answerB = "Die drei Wellen beziehen sich auf drei Extraktionsmethoden: Filterkaffee, Espresso, Cold Brew",
        answerC = "1. Welle: Industriekaffee (Instant, Massenproduktion); 2. Welle: Espresso-Kultur als Erlebnis (Starbucks); 3. Welle: Kaffee als Handwerk/Ursprungsprodukt — Terroir, Varietät, Aufbereitung transparent kommuniziert",
        answerD = "Third Wave bezeichnet nur den steigenden Konsum von Specialty Coffee — inhaltlich unterscheidet sie sich nicht von der zweiten Welle",
        correctAnswer = 2,
        explanation = "Die Third Wave (Begriff geprägt von Trish Rothgeb, 2002) behandelt Kaffee wie Wein: Transparenz über Ursprung, Varietät, Aufbereitung und Röster; helle Röstungen um natürliche Aromen zu betonen; direkte Beziehungen zu Bauern; präzise Brühparameter. Im Gegensatz zur 2. Welle (Kaffee als soziales Getränk in Ketten) steht die 3. Welle für handwerkliche Einzelbohnen-Kultur.",
        difficulty = 5,
        funFact = "Einige sprechen bereits von einer 'Fourth Wave': Wissenschaft und Technologie im Fokus (Kaffeelabors, spektroskopische Analyse, Fermentations-Engineering) — Kaffee als komplexestes Lebensmittel-System."
    ),

    // Question 32  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kopi Luwak' genau, und warum wird es von Specialty-Coffee-Experten trotz des hohen Preises meistens abgelehnt?",
        answerA = "Ein indonesischer Blend aus Robusta und Liberica der durch Seewasser-Reifung seinen einzigartigen Geschmack bekommt",
        answerB = "Ein Kaffee der nur auf dem aktiven Vulkan Kawah Ijen angebaut wird — Schwefelatmosphäre gibt Mineralnoten",
        answerC = "Kopi Luwak ist ein Marketingbegriff ohne echten Inhalt — alle Bohnen sind normale Arabica-Bohnen mit exotischer Verpackung",
        answerD = "Kaffee aus Kaffeebohnen die der Fleckenroller (Luwak) verdaut hat; Qualität ist unregelmäßig und oft schlecht; massive ethische Probleme durch Käfighaltung; Terroir und Varietät unklar",
        correctAnswer = 3,
        explanation = "Kopi Luwak (Civet Coffee) entstand ursprünglich als Nebenprodukt kolonialzeitlicher Kaffeeplantagen. Die Verdauung durch den Fleckenroller (Paradoxurus hermaphroditus) verändert zwar Proteine, verbessert aber nicht notwendigerweise die Qualität. Specialty-Experten lehnen ihn ab wegen fehlender Rückverfolgbarkeit, ethischer Käfighaltungsprobleme und unzuverlässiger Qualität.",
        difficulty = 5,
        funFact = "Black Ivory Coffee (durch Elefanten verdauter Tee) kostet noch mehr als Kopi Luwak — das Prinzip ist ähnlich. Weder Kopi Luwak noch Black Ivory gewinnen Specialty-Wettbewerbe."
    ),

    // Question 33  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Terroir' beim Kaffee und welche Faktoren prägen den Terroir-Charakter einer Herkunft am stärksten?",
        answerA = "Bodenzusammensetzung (Vulkanasche, Mineralien), Höhenlage, Mikroklima, lokale Heferassen, Aufbereitungswasser — zusammen erzeugen sie unverwechselbare Herkunftsaromen",
        answerB = "Terroir beim Kaffee ist ausschließlich durch die Varietät bestimmt — Boden und Klima spielen keine Rolle",
        answerC = "Terroir beim Kaffee bezeichnet nur das Röstprofil des lokalen Rösters, nicht die Herkunft",
        answerD = "Terroir ist ein Begriff der ausschließlich dem Wein vorbehalten ist und wird bei Kaffee nicht verwendet",
        correctAnswer = 0,
        explanation = "Kaffeeterroir umfasst: Bodenprofil (vulkanische Böden wie in Kolumbien/Guatemala geben Mineralität), Höhenlage (Dichte der Bohne, Säurestruktur), Mikroklima (Temperaturunterschiede Tag/Nacht), Wasser-pH beim Aufbereiten, lokale Mikroorganismen. Äthiopisches Yirgacheffe und jamaikanisches Blue Mountain sind Beispiele stark terroir-geprägter Kaffees.",
        difficulty = 5,
        funFact = "Wissenschaftler können inzwischen mithilfe von Isotopen-Analyse (Sr, Pb, C) die geografische Herkunft einer Kaffeebohne bestimmen — ähnlich wie Wein-Forensik für Fälschungsnachweis."
    ),

    // Question 34  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist der chemische Unterschied zwischen 'Chlorogensäure' und deren Abbauprodukten im Kaffee, und welche Auswirkungen haben sie auf Geschmack und Magenverträglichkeit?",
        answerA = "Chlorogensäure ist das Koffein-Analogon in entkoffeiniertem Kaffee; Quinolinsäure entsteht nur bei Schimmelbefall",
        answerB = "Chlorogensäure = phenolische Antioxidantien (500–1000 mg/Tasse), durch Röstung zu Quinolinsäure abgebaut; Quinolinsäure reizt die Magenschleimhaut — helle Röstungen enthalten mehr Chlorogensäure",
        answerC = "Beide Säuren sind in jedem Röstgrad identisch konzentriert; Magenprobleme entstehen ausschließlich durch Koffein",
        answerD = "Chlorogensäure und Quinolinsäure sind verschiedene Namen für dieselbe Verbindung",
        correctAnswer = 1,
        explanation = "Chlorogensäuren (CGAs) sind phenolische Antioxidantien und wichtigste Polyphenole im Kaffee. Durch Röstung werden sie zu Chinolactonen und Chinolinsäure abgebaut — diese Abbauprodukte können die Magensäureproduktion stimulieren. Helle Röstungen enthalten mehr intakte CGAs; dunkle Röstungen haben mehr N-Methylpyridinium (NMP), das magenschützend wirkt.",
        difficulty = 5,
        funFact = "Kaffeesäure (ein Abbauprodukt der Chlorogensäure) zeigte in Studien antioxidative, entzündungshemmende und Anti-Tumor-Eigenschaften. Kaffee ist eine der wichtigsten Antioxidantienquellen in der westlichen Ernährung."
    ),

    // ── TEE: WEITERE THEMEN ───────────────────────────────────────────────────

    // Question 35  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Aged White Tea' (gereifter Weißtee) und warum wird er in der chinesischen Volksmedizin seit Jahrhunderten geschätzt?",
        answerA = "Ein geschweftelter weißer Tee der durch chemische Behandlung jahrzehntelang haltbar gemacht wird",
        answerB = "Ausschließlich in tibetischen Klöstern produzierter Weißtee der mit Butterfett versetzt wird",
        answerC = "Weißtee (Silver Needle, Bai Mu Dan) aus Fujian, über 3–20+ Jahre natürlich gereift — durch Langzeitoxidation entwickeln sich Polyphenole und Triterpene; gilt traditionell als anti-entzündlich",
        answerD = "Aged White Tea ist identisch mit Shou Pu-Erh — der Begriff bezeichnet dasselbe Produkt",
        correctAnswer = 2,
        explanation = "Gereifter Weißtee (老白茶, Lao Bai Cha) aus der Fujian-Provinz lagert trocken für Jahre bis Jahrzehnte. Während dieser Zeit entwickeln sich die Catechine durch langsame Autooxidation weiter, Polyphenole polymerisieren und es entstehen neue Terpenoide. Das Ergebnis: weniger Bitterkeit, tiefere Farbe, Honig-Noten, komplexere Aromen. In der TCM gilt er als fiebersenkend.",
        difficulty = 5,
        funFact = "Es gibt ein chinesisches Sprichwort: '1年茶，3年药，7年宝' (1 Jahr Tee, 3 Jahre Medizin, 7 Jahre Schatz) — hochwertiger Lao Bai Cha von 2005 oder früher erzielt heute Tausende Yuan pro Kilogramm."
    ),

    // Question 36  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist das 'CTC-Verfahren' (Cut, Tear, Curl) in der Teeherstellung, und warum wurde es entwickelt?",
        answerA = "Eine japanische Dampf-Methode zur Herstellung von Sencha die Oxidation vollständig verhindert",
        answerB = "Ein Qualitätstest der Teeplantagen: Prüfer schneiden, reißen und rollen Proben, um Reife zu beurteilen",
        answerC = "CTC bezeichnet ausschließlich die britische Zertifizierung für Fair-Trade-Tee aus Assam und Darjeeling",
        answerD = "Maschinelles Schneiden, Reißen und Rollen der Teeblätter zu kleinen Granulaten — entwickelt für schnelle Extraktion in Teebeutel, maximale Farbe und Stärke, niedrigere Kosten als Orthodox-Verarbeitung",
        correctAnswer = 3,
        explanation = "CTC (Cut, Tear, Curl) wurde in den 1930er-Jahren in Assam entwickelt. Maschinen schneiden und reißen die Blätter zu kleinen Kugeln/Granulaten. Vorteile: schnelle Extraktion (2–3 Minuten), intensive Farbe und Kraft, perfekt für Teebeutel und Chai mit Milch. Nachteil: keine Feinheit, kaum Nuancen. Ca. 70 % des weltweiten Schwarztees wird per CTC produziert.",
        difficulty = 5,
        funFact = "Orthodox-Verarbeitung (ganze Blätter gerollt und oxidiert) ist die traditionelle Methode und produziert aromatisch komplexere Tees. Darjeeling-Premiumtees werden fast ausschließlich orthodox verarbeitet."
    ),

    // Question 37  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hojicha' und wie unterscheidet er sich biochemisch von normalem Grüntee durch seinen Röstprozess?",
        answerA = "Hojicha = gerösteter japanischer Grüntee (meist Bancha/Kukicha) bei 200 °C; Koffein sublimiert teilweise, Catechine werden zu milderen Pyrazinen und Laktonen umgewandelt — deutlich weniger bitter, nussig-karamellig",
        answerB = "Hojicha ist ein koreanischer Rauchtee der über Holzkohle bei 500 °C getrocknet wird",
        answerC = "Hojicha ist ein chinesischer Grüntee mit künstlichem Röstaroma — die Blätter selbst werden nicht erhitzt",
        answerD = "Hojicha und Schwarztee sind identisch — der einzige Unterschied ist der Pflanzenursprung (Japan vs. Indien)",
        correctAnswer = 0,
        explanation = "Hojicha (ほうじ茶) wird durch Röstung von Bancha, Kukicha oder Sencha bei ca. 200 °C hergestellt. Die Hitze sublimiert einen Teil des Koffeins (Hojicha hat ca. 7–10 mg Koffein/Tasse vs. 30–40 mg Sencha). Catechine wandeln sich durch Maillard-Reaktion und Pyrolyse zu Pyrazinen, Furanonen und anderen Röstaromastoffen um.",
        difficulty = 5,
        funFact = "Hojicha Latte ist in Japan seit den 2000er-Jahren extrem populär. Wegen des niedrigen Koffeingehalts wird er gerne Kindern und abends getrunken."
    ),

    // Question 38  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Genmaicha' und welche historische Herkunftslegende erklärt seinen Namen?",
        answerA = "Ein spezieller Yukihana-Tee aus Hokkaido, vermischt mit weißem Jasminreis aus Thailand",
        answerB = "Grüntee (Bancha) gemischt mit geröstetem Puffreis (Genmai); Legende: Diener Genmai ließ versehentlich Reiskörner in den Tee fallen und wurde hingerichtet — der Tee trägt seinen Namen",
        answerC = "Ein Tee der ausschließlich aus Reisstroh hergestellt wird und kein Teeblatt enthält",
        answerD = "Genmaicha ist identisch mit Gyokuro — 'Genmai' ist ein veraltetes Synonym für Schattenanbau",
        correctAnswer = 1,
        explanation = "Genmaicha (玄米茶) ist Bancha-Grüntee gemischt mit geröstetem Puffreis (Genmai = brauner Reis). Die populäre Legende erzählt von einem Diener namens Genmai der beim Ausschenken Reiskörner in die Tasse fallen ließ — sein Herr ließ ihn hinrichten, der Tee wurde nach ihm benannt. Historisch entstand Genmaicha als günstige Mischung um Tee zu strecken.",
        difficulty = 5,
        funFact = "Heute gilt Genmaicha als eigenständiger hochwertiger Tee. Die weißen 'Popcorn'-Stücke im Genmaicha sind aufgepoppte Reiskörner — sie geben den typischen nussig-getreidigen Geschmack."
    ),

    // ── KAFFEE & TEE: WISSENSCHAFT & BIOCHEMIE ────────────────────────────────

    // Question 39  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Welche Verbindungsklassen machen den Großteil der Antioxidantien im Grüntee aus, und wie unterscheiden sie sich von denen im Schwarztee?",
        answerA = "Grüntee enthält ausschließlich Vitamin C als Antioxidans; Schwarztee enthält Tannine",
        answerB = "Grüntee und Schwarztee haben identische Antioxidantien-Profile — der Unterschied liegt nur in der Koffeinmenge",
        answerC = "Grüntee: Catechine (EGCG, EGC, ECG, EC) — monomer, hohe Bioverfügbarkeit; Schwarztee: Theaflavine und Thearubigine (oxidierte Catechin-Polymere) — weniger EGCG, eigene antioxidative Eigenschaften",
        answerD = "Schwarztee enthält mehr Antioxidantien als Grüntee, weil die Oxidation neue stärkere Verbindungen erzeugt",
        correctAnswer = 2,
        explanation = "Grüntee: reich an Catechinen, vor allem EGCG (Epigallocatechingallat, bis 300 mg/Tasse) — bei der Verarbeitung nicht oxidiert. Schwarztee: durch Oxidation polymerisieren Catechine zu Theaflavinen (für goldige Farbe, stringent-frisch) und Thearubiginen (für rote Farbe, körperreich). Theaflavine haben andere, nicht schlechtere Antioxidantien-Wirkung als Catechine.",
        difficulty = 5,
        funFact = "EGCG aus Grüntee wird intensiv auf Anti-Krebs-, Anti-Adipositas- und Neuroprotektive Wirkungen erforscht. Hochkonzentrierte EGCG-Supplemente sind allerdings hepatotoxisch in hoher Dosierung — als Tee ist es sicher."
    ),

    // Question 40  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist der optimale pH-Wert und die ideale Temperatur des Brühwassers für hochwertigen Gyokuro — und warum?",
        answerA = "pH 8,0–9,0 (leicht basisch), 100 °C kochendes Wasser — Gyokuro braucht maximale Extraktionstemperatur",
        answerB = "pH und Temperatur spielen keine Rolle — Gyokuro schmeckt bei jeder Wasserqualität und Temperatur identisch",
        answerC = "pH 4,0–5,0 (sauer), 40 °C — sehr saures, kühles Wasser verhindert jede Bitterkeit",
        answerD = "pH 6,0–7,5 (leicht sauer bis neutral), 50–70 °C für Gyokuro — höhere Temperaturen extrahieren mehr Catechine (Bitterkeit); niedrigere Temperaturen extrahieren mehr L-Theanin (Umami)",
        correctAnswer = 3,
        explanation = "Brühwasser für Grüntee sollte leicht sauer bis neutral sein (pH 6–7,5). Hartes, alkalisches Wasser (pH >8) verändert Catechine negativ und trübt die Infusion. Für Gyokuro: 50–60 °C optimal — niedrige Temperaturen extrahieren L-Theanin (Umami, süß) selektiver; hohe Temperaturen extrahieren mehr Catechine und Koffein (bitter, adstringent).",
        difficulty = 5,
        funFact = "Japanische Teekenner kühlen Wasser von 100 °C auf 60 °C durch dreimaliges Umschütten zwischen Gefäßen (湯冷まし, Yuzamashi) — jedes Umschütten kostet ca. 10 °C und belüftet das Wasser."
    ),

    // Question 41  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Cold Brew Tea' biochemisch anders als heiß gebrühter Tee — und warum ergibt er einen glattereren Geschmack?",
        answerA = "Bei Kaltextraktion (4–12 Stunden, 4–8 °C) werden L-Theanin und süße Aromastoffe extrahiert, Catechine und Koffein lösen sich deutlich schlechter als bei Hitze — weniger Bitterkeit, mehr Umami",
        answerB = "Cold Brew extrahiert mehr Koffein als heißes Wasser, weil die Löslichkeit bei Kälte höher ist",
        answerC = "Cold Brew und Heißtee haben identisches Aromaprofil — nur die Konsistenz ist anders",
        answerD = "Cold Brew denaturiert alle Antioxidantien und ist daher gesundheitlich minderwertig",
        correctAnswer = 0,
        explanation = "Temperatur beeinflusst die Löslichkeit verschiedener Teeverbindungen unterschiedlich. L-Theanin und Zucker lösen sich gut bei Kälte; Catechine und Koffein sind bei niedrigen Temperaturen weniger löslich. Kalt gebrühter Tee enthält daher mehr L-Theanin relativ zu Catechinen — seidiger, weniger adstringenter, umami-reicher Tee.",
        difficulty = 5,
        funFact = "Mizudashi (水出し, Kaltextraktion) ist in Japan eine traditionelle Methode besonders für Gyokuro und hochwertigen Sencha — die Japaner kannten Cold Brew lang vor dem westlichen Trend."
    ),

    // Question 42  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Wie viele Aromastoffe enthält eine Tasse Kaffee ungefähr, und welche Verbindungsklassen dominieren das Kaffee-Aroma?",
        answerA = "Ca. 50–100 Aromastoffe — Kaffee ist weniger komplex als Wein (400 Verbindungen)",
        answerB = "Über 1000 flüchtige Verbindungen, dominiert durch Pyrazine (röstartig, nussig), Furane (karamellartig), Thiole (schwefelhaltig, erste Noten) und Aldehyde (fruchtig-blumig)",
        answerC = "Ausschließlich Koffein und Chlorogensäure — alle anderen Verbindungen sind geruchlos",
        answerD = "Ca. 200–300 Aromastoffe, alle entstehen ausschließlich durch die Kaffeepflanze, nicht durch die Röstung",
        correctAnswer = 1,
        explanation = "Kaffee enthält über 1000 identifizierte flüchtige Aromastoffe — mehr als jedes andere Lebensmittel außer einigen Käsesorten. Dominante Klassen: Pyrazine (Maillard-Reaktion, röstiges/nussiges Aroma), Furane (Karamellnoten), Thiole und Mercaptane (erste Noten), Aldehyde und Ketone (fruchtig-blumig), Lactone (cremig). Rohe Kaffeebohnen riechen kaum — 99 % der Aromen entstehen erst durch Röstung.",
        difficulty = 5,
        funFact = "Furfurylthiol gilt als der wichtigste einzelne Aromastoff im Kaffee — obwohl es nur in Spuren vorkommt (ppb-Bereich), ist es für die typische 'Kaffeenote' mitverantwortlich. Es hat eine Geruchsschwelle von nur 0,01 ppb."
    ),

    // Question 43  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was beschreibt das 'Flavor Wheel' der Specialty Coffee Association (SCA), und wie wird es in der professionellen Kaffeeverkostung ('Cupping') verwendet?",
        answerA = "Ein Instrument zur Messung von Röstgrad und Röstprofil durch Farbsensoren",
        answerB = "Eine chemische Formel zur Berechnung des TDS-Werts anhand von Temperatur und Mahlgrad",
        answerC = "Ein visuelles Klassifizierungssystem für Kaffeearomen in konzentrische Kreise: innen grobe Kategorien (fruchtig, nussig, blumig), außen präzise Deskriptoren (z.B. Zitrone, Jasmin, Mandel) — standardisiert die Kommunikation bei Cuppings",
        answerD = "Eine Marketing-Visualisierung ohne wissenschaftliche Grundlage — nur für Verbraucher gedacht",
        correctAnswer = 2,
        explanation = "Das SCA Flavor Wheel (1995, überarbeitet 2016) ist ein standardisiertes Aromaklassifikationssystem für Kaffee. Konzentrische Ringe: innen grobe Kategorien (Fruchtig, Fermentiert, Grün, Röstartig, Würzig usw.), außen spezifische Deskriptoren. Bei Cuppings (standardisierter Blindverkostung) nutzen Fachleute es um Aromen präzise zu kommunizieren.",
        difficulty = 5,
        funFact = "Das SCA Flavor Wheel ist von der Weinflavorwissenschaft beeinflusst. Ann Noble (UC Davis) entwickelte 1984 das Aroma Wheel für Wein — das Kaffeependant folgte 11 Jahre später und ist heute globaler Standard."
    ),

    // ── KAFFEE & TEE: GESUNDHEIT & WIRTSCHAFT ────────────────────────────────

    // Question 44  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Kaffee ist eines der meistgehandelten Rohstoffe weltweit. Wie viel Kaffee wird jährlich global produziert und welches Land führt die Produktion an?",
        answerA = "Ca. 1 Million Tonnen/Jahr; Äthiopien führt als Ursprungsland mit 60 %",
        answerB = "Ca. 50 Millionen Tonnen/Jahr; China dominiert durch Yunnan-Plantagen seit 2010",
        answerC = "Ca. 10 Millionen Tonnen/Jahr; Kolumbien führt durch exklusive Arabica-Qualität",
        answerD = "Ca. 10 Millionen Tonnen/Jahr; Brasilien führt mit ca. 35–40 % Weltproduktion, gefolgt von Vietnam (ca. 20 %) und Kolumbien (ca. 9 %)",
        correctAnswer = 3,
        explanation = "Weltweit werden ca. 9–11 Millionen Tonnen Rohkaffee/Jahr produziert. Brasilien (ca. 35–40 %, Arabica und Robusta), Vietnam (ca. 17–20 %, fast ausschließlich Robusta), Kolumbien (ca. 9 %, nur Arabica), Indonesien und Äthiopien folgen. Kaffee sichert den Lebensunterhalt von ca. 100 Millionen Menschen weltweit.",
        difficulty = 5,
        funFact = "Finnland ist pro Kopf der weltgrößte Kaffeekonsument: Finnen trinken ca. 12 kg Rohkaffee/Person/Jahr — fast dreimal so viel wie der deutsche Durchschnitt."
    ),

    // Question 45  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Fair Trade'-zertifiziertem Kaffee und 'Direct Trade'-Kaffee im Specialty-Coffee-Bereich?",
        answerA = "Fair Trade: Mindestpreis-Garantie über zertifizierte Handelsstrukturen, oft Kooperativen; Direct Trade: persönliche Beziehung Röster-Bauer, oft höhere Preise als Fair Trade aber ohne Drittzertifizierung",
        answerB = "Fair Trade und Direct Trade sind gesetzlich regulierte Synonyme — es gibt keinen Unterschied",
        answerC = "Direct Trade ist teurer für den Verbraucher aber schlechter für den Bauern; Fair Trade garantiert mehr",
        answerD = "Fair Trade gilt nur für Robusta, Direct Trade nur für Arabica — geografische Einschränkungen",
        correctAnswer = 0,
        explanation = "Fair Trade (Fairtrade International) garantiert Mindestpreise (z.B. 1,80 USD/lb für Arabica-Washed), Prämien für Gemeinschaftsprojekte und Arbeitsnormen. Direct Trade (kein einheitlicher Standard) beschreibt die direkte Beziehung zwischen Röster und Kaffeebauern mit oft höheren, marktbasierten Preisen — aber ohne externe Verifizierung.",
        difficulty = 5,
        funFact = "Einige Kritiker argumentieren, Fair Trade halte Kaffeebauern in der Überproduktion gefangen, während Direct Trade einzelne exzellente Bauern exponentiell reicher macht. Die Debatte ist ungelöst."
    ),

    // Question 46  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Entkoffeinierung' durch das CO₂-Verfahren, und warum gilt es als schonendste Methode für Aromaschonung?",
        answerA = "CO₂ wird in die Bohnen gepresst, Koffein sublimiert und wird durch Filter aufgefangen — eine rein physikalische Methode ohne Chemie",
        answerB = "Superkritisches CO₂ (31 °C, 74 Bar) wirkt als selektives Lösungsmittel nur für Koffein, nicht für Aromastoffe — Bohnen bleiben trocken, keine Lösungsmittelrückstände, Aromaerhalt besser als bei Wasserextraktion",
        answerC = "Flüssiges CO₂ bei -78 °C gefriert die Bohnen, Koffein kristallisiert und wird abgekratzt",
        answerD = "CO₂ reagiert chemisch mit Koffein zu Koffein-Carbonat das ausgewaschen wird",
        correctAnswer = 1,
        explanation = "Das superkritische CO₂-Verfahren nutzt CO₂ unter kritischen Bedingungen (>31 °C, >73,8 Bar), wo es weder fest noch flüssig noch gasförmig ist. In diesem Zustand ist CO₂ ein hervorragendes selektives Lösungsmittel für Koffein-Moleküle. Aromastoffe bleiben weitgehend in der Bohne. Das Verfahren hinterlässt keine Rückstände.",
        difficulty = 5,
        funFact = "Superkritisches CO₂ wird auch zum Extrahieren von Hopfen-Aromen für Bier und von Cannabis-Verbindungen verwendet — dasselbe physikalische Prinzip, unterschiedliche Zielindustrien."
    ),

    // Question 47  — correctAnswer = 2 (Antwort C)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Specialty Coffee' laut Definition der Specialty Coffee Association (SCA), und welchen Mindestscore muss ein Kaffee erreichen?",
        answerA = "Specialty Coffee = jeder Kaffee der von einem zertifizierten Barista zubereitet wurde, unabhängig von der Bohnenqualität",
        answerB = "Specialty Coffee = biologisch zertifiziert, Fair Trade und aus Hochland über 1500 m — alle drei Kriterien müssen erfüllt sein",
        answerC = "Specialty Coffee = cupped score von mindestens 80/100 Punkten; keine primären Defekte, max. 5 sekundäre; klar erkennbare Herkunftsnoten; in kontrollierten Bedingungen angebaut und verarbeitet",
        answerD = "Specialty Coffee = Kaffee mit einem Preis über 50 USD/kg im Großhandel",
        correctAnswer = 2,
        explanation = "Die SCA definiert Specialty Coffee als Kaffee mit einem cupped score ≥80/100 Punkten bei einer standardisierten Blindverkostung durch zertifizierte Q-Grader. Zusätzlich: 0 primary defects, max. 5 secondary defects in 350 g Stichprobe, klar erkennbarer Herkunftscharakter. Ca. 10 % der globalen Kaffeeproduktion erreicht Specialty-Qualität.",
        difficulty = 5,
        funFact = "Ein Q-Grader (Coffee Quality Institute) muss 22 Tests bestehen inklusive Aromaidentifikation, Diskriminationstests und Cuppings. Nur ca. 5000 Q-Grader existieren weltweit — sie sind die 'Sommeliers des Kaffees'."
    ),

    // Question 48  — correctAnswer = 3 (Antwort D)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Robusta im Espresso-Blend' und warum verwenden viele italienische Traditionsröster trotz Arabica-Dominanz im Specialty-Bereich Robusta-Anteile?",
        answerA = "Robusta-Anteile werden ausschließlich wegen des niedrigeren Preises zugemischt — qualitativ gibt es keinen Vorteil",
        answerB = "Robusta in Espresso ist eine Fehlinformation — kein professioneller Röster verwendet Robusta in Espresso-Blends",
        answerC = "Robusta wird hinzugefügt um den Koffeingehalt zu reduzieren, da er weniger Koffein als Arabica enthält",
        answerD = "Robusta erhöht Crema-Stabilität durch mehr CO₂-Bindung und Lipide, gibt mehr Körper/Bitterkeit — traditionelle neapolitanische Espresso-Kultur bevorzugt 20–40 % Robusta",
        correctAnswer = 3,
        explanation = "In der klassischen neapolitanischen und süditalienischen Espresso-Tradition werden 20–40 % Robusta eingemischt. Gründe: Robusta bildet durch höheren CO₂- und Lipoproteingehalt eine dichtere, stabilere Crema. Mehr Körper und ausgeprägte Bitterkeit passen zur Tradition des starken, kurzen Espressos. Moderne Specialty-Röster lehnen Robusta ab — traditionelle neapolitanische Röster sehen ihn als unverzichtbar.",
        difficulty = 5,
        funFact = "Neapolitaner trinken Espresso traditionell ohne Milch — der hohe Robusta-Anteil passt perfekt zu diesem bitter-starken Stil. Norditalienische Röster (Mailand, Triest) bevorzugen dagegen mehr Arabica."
    ),

    // Question 49  — correctAnswer = 0 (Antwort A)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Yixing-Ton' (紫砂, Zisha) und warum gelten Yixing-Teekannen als das optimale Gefäß für Oolong und Pu-Erh-Gongfu-Cha?",
        answerA = "Zisha (Lila Sand) ist ein eisenoxidreicher Ton aus Yixing (Jiangsu) mit mikroporöser Struktur — absorbiert Teeöle, reguliert Wärme, verbessert sich mit jedem Aufguss und 'lernt' den Lieblingstee des Besitzers",
        answerB = "Yixing-Ton ist ein Kunstharz-Material das 1950 als Ersatz für Porzellan entwickelt wurde",
        answerC = "Zisha-Ton enthält natürliches Koffein, das beim Erhitzen in den Tee abgegeben wird",
        answerD = "Yixing-Teekannen haben keinen Einfluss auf den Teegeschmack — sie sind rein ästhetische Sammlerstücke",
        correctAnswer = 0,
        explanation = "Zisha (紫砂, Lila Sand) ist ein seltener Ton aus der Yixing-Region mit besonderer mikroporöser Struktur. Die Poren absorbieren über Jahre Teeöle — eine gut 'eingespielte' Kanne verstärkt den Teecharakter. Zisha reguliert Temperatur gleichmäßig und hält Wärme länger als Porzellan. Alte Kanne großer Meister erzielen auf Auktionen Millionenwerte.",
        difficulty = 5,
        funFact = "Eine klassische Regel: Eine Yixing-Kanne sollte nur für einen Teetyp verwendet werden — wer sie für verschiedene Tees benutzt, 'verwirrt' die Kanne und verdirbt das Geschmacksprofil beider Tees."
    ),

    // Question 50  — correctAnswer = 1 (Antwort B)
    Question(
        categoryId = 8,
        questionText = "Was ist der botanische Ursprung des Kaffees, und warum gilt Äthiopien als 'Wiege des Kaffees' — auch wissenschaftlich belegt?",
        answerA = "Kaffee stammt botanisch aus dem Jemen, wohin er durch arabische Händler aus Indien gebracht wurde",
        answerB = "Kaffeepflanzen wachsen wild in den Bergwäldern Südwestäthiopiens (Kaffa, Jimma, Bench Maji); genetische Studien belegen, dass alle kultivierten Arabica-Sorten von äthiopischen Wildpopulationen abstammen — größte genetische Diversität weltweit",
        answerC = "Kaffee ist pflanzlich gesehen aus Teepflanzen durch natürliche Hybridisierung entstanden",
        answerD = "Die Heimat des Kaffees ist genetisch unklar — sowohl Äthiopien als auch Sudan haben gleich starke Ansprüche",
        correctAnswer = 1,
        explanation = "Coffea arabica wächst wild in den feuchten Bergwäldern Südwest-Äthiopiens (Kaffa, Bonga, Yayu) in Höhen von 1500–2000 m. Genetische Analysen belegen: Alle weltweit angebauten Arabica-Varietäten stammen von diesen äthiopischen Wildpopulationen ab. Die genetische Diversität in Äthiopien übertrifft die aller anderen Anbaugebiete. Der Name 'Kaffee' leitet sich wahrscheinlich von der Region 'Kaffa' ab.",
        difficulty = 5,
        funFact = "Die äthiopischen Kaffa-Wälder (Biosphärenreservat UNESCO seit 2010) sind eine genetische Schatzkammer für Kaffeezüchtung. Klimawandel bedroht diese Wildbestände — Wissenschaftler sammeln dringend Saatgut, bevor diese Vielfalt verloren geht."
    )

)
