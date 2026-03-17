package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsMedium3(): List<Question> = listOf(

    // Question 1 – Genetics & DNA Technology: PCR
    Question(
        categoryId = 2,
        questionText = "Welche Funktion hat die Taq-Polymerase bei der PCR (Polymerase-Kettenreaktion)?",
        answerA = "Sie schneidet die DNA an spezifischen Erkennungssequenzen",
        answerB = "Sie synthetisiert neue DNA-Stränge bei hohen Temperaturen",
        answerC = "Sie trennt die DNA-Doppelhelix durch Enzymaktivität",
        answerD = "Sie markiert die Primer mit Fluoreszenzfarbstoffen",
        correctAnswer = 1, // B
        explanation = "Die Taq-Polymerase stammt aus dem thermophilen Bakterium Thermus aquaticus und ist hitzestabil. Sie kann bei ~72 °C neue DNA-Stränge anhand der Primer-markierten Vorlage synthetisieren, ohne bei den Denaturierungsschritten (~95 °C) zerstört zu werden.",
        difficulty = 2,
        funFact = "Ohne die Taq-Polymerase müsste man nach jedem Erhitzungsschritt neue Polymerase hinzufügen — die PCR wäre unbezahlbar teuer."
    ),

    // Question 2 – Genetics & DNA Technology: Gel Electrophoresis
    Question(
        categoryId = 2,
        questionText = "Warum wandern kleinere DNA-Fragmente bei der Gelelektrophorese weiter als größere?",
        answerA = "Kleinere Fragmente tragen mehr negative Ladungen pro Längeneinheit",
        answerB = "Größere Fragmente werden durch das Gel stärker abgebremst",
        answerC = "Kleinere Fragmente bewegen sich schneller, weil sie leichter sind und weniger Reibung haben",
        answerD = "Die elektrische Ladung ist bei kleineren Fragmenten größer",
        correctAnswer = 1, // B
        explanation = "DNA-Fragmente haben unabhängig von ihrer Größe pro Basenpaar die gleiche Ladung. Im Agarosegel fungiert die Gelmatrix als Sieb: Größere Moleküle werden durch die Poren stärker abgebremst und wandern langsamer, während kleinere Fragmente das Sieb leichter durchqueren.",
        difficulty = 2,
        funFact = null
    ),

    // Question 3 – Genetics & DNA Technology: Plasmids
    Question(
        categoryId = 2,
        questionText = "Was sind Plasmide und wofür werden sie in der Gentechnik genutzt?",
        answerA = "Lineare Chromosomen in eukaryotischen Zellen, die für Proteinexpression genutzt werden",
        answerB = "Zirkuläre DNA-Moleküle in Bakterien, die als Vektoren zum Einschleusen von Fremdgenen dienen",
        answerC = "RNA-Moleküle, die als Boten zwischen Zellkern und Ribosom fungieren",
        answerD = "Proteinstrukturen, die DNA-Reparatur koordinieren",
        correctAnswer = 1, // B
        explanation = "Plasmide sind kleine, zirkuläre, doppelsträngige DNA-Moleküle, die unabhängig vom Chromosom in Bakterien repliziert werden. In der Gentechnik werden sie als Vektoren verwendet: Ein Zielgen wird eingebaut, das Plasmid in Bakterien transformiert, die dann das gewünschte Protein produzieren.",
        difficulty = 2,
        funFact = "Das Insulin für Diabetiker wird heute überwiegend von Bakterien produziert, in die das menschliche Insulin-Gen per Plasmid eingebracht wurde."
    ),

    // Question 4 – Genetics & DNA Technology: Restriction Enzymes
    Question(
        categoryId = 2,
        questionText = "Was sind Restriktionsendonukleasen und welche Eigenschaft macht sie für die Gentechnik so wertvoll?",
        answerA = "Enzyme, die DNA zufällig fragmentieren und so für die Sequenzierung vorbereiten",
        answerB = "Proteine, die spezifische kurze DNA-Sequenzen (Erkennungssequenzen) schneiden und dabei überhängende Enden erzeugen",
        answerC = "Moleküle, die komplementäre DNA-Stränge zusammenfügen",
        answerD = "Enzyme, die methylierte Basen aus der DNA entfernen",
        correctAnswer = 1, // B
        explanation = "Restriktionsenzyme erkennen spezifische 4–8 bp lange palindromische DNA-Sequenzen und schneiden diese. Oft entstehen dabei 'klebrige Enden' (sticky ends), die komplementär zueinander sind. Durch die Nutzung desselben Enzyms für Vektor und Insert können passende Enden erzeugt werden, die von der DNA-Ligase verbunden werden.",
        difficulty = 2,
        funFact = null
    ),

    // Question 5 – Genetics & DNA Technology: Cloning
    Question(
        categoryId = 2,
        questionText = "Was versteht man unter 'molekularem Klonieren' in der Biotechnologie?",
        answerA = "Das Erstellen genetisch identischer Tiere durch Kerntransfer",
        answerB = "Das Vervielfältigen eines spezifischen DNA-Abschnitts durch Einbringen in einen Wirtsorganismus",
        answerC = "Das Kopieren eines gesamten Genoms per PCR",
        answerD = "Das Reparieren von Mutationen durch CRISPR",
        correctAnswer = 1, // B
        explanation = "Beim molekularen Klonieren wird ein gewünschtes DNA-Fragment in einen Vektor (z. B. Plasmid) eingebaut, dieser in einen Wirtsorganismus (z. B. E. coli) transformiert und durch Bakterienwachstum millionenfach vervielfältigt. So erhält man große Mengen eines bestimmten Gens.",
        difficulty = 2,
        funFact = "Das Wort 'Klon' stammt aus dem Griechischen 'klon' = Zweig — wie ein Ast, der von einem Baum geschnitten und neu eingepflanzt wird."
    ),

    // Question 6 – Atmospheric Chemistry: Ozone
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus zerstören Fluorchlorkohlenwasserstoffe (FCKW) das stratosphärische Ozon?",
        answerA = "FCKW reagieren direkt mit Ozon unter Freisetzung von Wärme",
        answerB = "UV-Strahlung spaltet FCKW, die freigesetzten Chloratome katalysieren den Ozonabbau",
        answerC = "FCKW absorbieren UV-Strahlung und verhindern so die Ozonbildung",
        answerD = "Chlor aus FCKW verbindet sich mit Sauerstoff und verhindert so die O3-Bildung",
        correctAnswer = 1, // B
        explanation = "UV-Strahlung spaltet FCKW-Moleküle in der Stratosphäre und setzt reaktive Chloratome frei. Ein Cl-Atom reagiert mit O3 zu ClO + O2, dann reagiert ClO mit einem weiteren O-Atom und setzt Cl wieder frei — ein Katalysezyklus, der ein Cl-Atom bis zu 100.000 O3-Moleküle zerstören lässt.",
        difficulty = 2,
        funFact = "Das Ozonloch über der Antarktis war 2006 mit 29,5 Millionen km² am größten — fast dreimal so groß wie Australien."
    ),

    // Question 7 – Atmospheric Chemistry: Acid Rain
    Question(
        categoryId = 2,
        questionText = "Welche chemische Reaktion ist hauptverantwortlich für die Entstehung von saurem Regen durch Schwefeldioxide?",
        answerA = "SO2 + H2O → H2SO3, dann H2SO3 + ½O2 → H2SO4",
        answerB = "SO2 + 2H2 → H2S + H2O",
        answerC = "2SO2 + O2 → 2SO3, dann SO3 → SO2 + O",
        answerD = "SO2 + 2OH → H2SO4",
        correctAnswer = 0, // A
        explanation = "Schwefeldioxid (SO2) aus Verbrennung löst sich in Wasser zu schwefliger Säure (H2SO3). Diese wird in der Atmosphäre weiter zu Schwefelsäure (H2SO4) oxidiert, dem Hauptbestandteil des sauren Regens. Stickoxide (NOx) bilden analog Salpetersäure (HNO3).",
        difficulty = 2,
        funFact = null
    ),

    // Question 8 – Atmospheric Chemistry: Greenhouse Gases
    Question(
        categoryId = 2,
        questionText = "Warum ist Methan (CH4) als Treibhausgas kurzfristig wirksamer als CO2, obwohl CO2 häufiger diskutiert wird?",
        answerA = "Methan absorbiert keine Infrarotstrahlung, hat aber andere Klimawirkungen",
        answerB = "Methan hat über 20 Jahre ein etwa 80-fach höheres Erwärmungspotenzial als CO2",
        answerC = "CO2 verbleibt kürzer in der Atmosphäre als Methan",
        answerD = "Methan ist nur in der Stratosphäre ein Treibhausgas",
        correctAnswer = 1, // B
        explanation = "Methan hat über einen 20-Jahres-Zeitraum ein Global Warming Potential (GWP) von ca. 80 im Vergleich zu CO2. Über 100 Jahre sinkt dieser Wert auf ca. 28, da Methan in der Atmosphäre schneller abgebaut wird (Halbwertszeit ~12 Jahre). CO2 verbleibt Jahrhunderte bis Jahrtausende.",
        difficulty = 2,
        funFact = "Rinder sind weltweit für etwa 14,5 % der vom Menschen verursachten Treibhausgasemissionen verantwortlich — vor allem durch Methan aus Verdauungsprozessen."
    ),

    // Question 9 – Atmospheric Chemistry: CFCs and Montreal Protocol
    Question(
        categoryId = 2,
        questionText = "Was regelt das Montrealer Protokoll von 1987?",
        answerA = "Die Reduzierung von CO2-Emissionen in Industrieländern",
        answerB = "Das weltweite Verbot ozonschichtschädigender Substanzen wie FCKW",
        answerC = "Den Schutz der Troposphäre vor Stickoxidemissionen",
        answerD = "Die Begrenzung von Methanemissionen aus der Landwirtschaft",
        correctAnswer = 1, // B
        explanation = "Das Montrealer Protokoll ist ein internationales Abkommen zur schrittweisen Abschaffung der Produktion ozonschichtschädigender Substanzen, insbesondere FCKW. Es gilt als eines der erfolgreichsten Umweltabkommen: Die Ozonschicht zeigt sich seit den 1990er Jahren in einer langsamen Erholung.",
        difficulty = 2,
        funFact = null
    ),

    // Question 10 – Atmospheric Chemistry: Air Pollution
    Question(
        categoryId = 2,
        questionText = "Was ist bodennahes Ozon (Sommersmog) und wie entsteht es?",
        answerA = "Ozon, das aus der Stratosphäre in die Troposphäre absinkt",
        answerB = "Sekundärschadstoff, der durch UV-Strahlung aus Stickoxiden und flüchtigen organischen Verbindungen gebildet wird",
        answerC = "Direktes Verbrennungsprodukt von Benzin- und Dieselmotoren",
        answerD = "Natürliches Ozon, das durch Blitzentladungen in Gewittern entsteht",
        correctAnswer = 1, // B
        explanation = "Bodennahes Ozon ist ein Sekundärschadstoff: Stickoxide (NOx) aus Verkehr und Industrie sowie flüchtige organische Verbindungen (VOC) reagieren unter UV-Einwirkung in einer komplexen Photochemie zu Ozon. Im Gegensatz zur schützenden Stratosphäre ist Ozon in der Troposphäre schädlich für Lungen und Pflanzen.",
        difficulty = 2,
        funFact = "In Deutschland werden die Ozon-Grenzwerte im Sommer regelmäßig überschritten — Hitzeperioden verstärken die Ozonbildung erheblich."
    ),

    // Question 11 – Endocrinology: Thyroid Hormones
    Question(
        categoryId = 2,
        questionText = "Welche Funktion haben die Schilddrüsenhormone T3 (Trijodthyronin) und T4 (Thyroxin)?",
        answerA = "Sie regulieren den Blutzuckerspiegel in Zusammenarbeit mit der Bauchspeicheldrüse",
        answerB = "Sie stimulieren den Grundumsatz und beeinflussen Wachstum, Herzfrequenz und Stoffwechsel",
        answerC = "Sie kontrollieren den Calcium- und Phosphatstoffwechsel in den Knochen",
        answerD = "Sie regulieren den Wasserhaushalt über die Nieren",
        correctAnswer = 1, // B
        explanation = "T3 und T4 regulieren den Grundumsatz (Energieverbrauch in Ruhe), die Herzfrequenz, Körpertemperatur, Proteinsynthese und Wachstum. T3 ist biologisch aktiver als T4; T4 wird in den Geweben zu T3 konvertiert. Für ihre Synthese ist Jod essenziell.",
        difficulty = 2,
        funFact = "Jodmangel ist weltweit die häufigste vermeidbare Ursache für geistige Entwicklungsstörungen — deshalb wird Speisesalz in vielen Ländern mit Jod angereichert."
    ),

    // Question 12 – Endocrinology: Growth Hormone
    Question(
        categoryId = 2,
        questionText = "Wann wird Wachstumshormon (Somatotropin, GH) hauptsächlich ausgeschüttet?",
        answerA = "Morgens nach dem Aufwachen als Reaktion auf Licht",
        answerB = "Während des Tiefschlafs und bei körperlicher Belastung",
        answerC = "Nach jeder Mahlzeit als Reaktion auf Blutzuckeranstieg",
        answerD = "Gleichmäßig über den gesamten Tag verteilt",
        correctAnswer = 1, // B
        explanation = "Wachstumshormon wird pulsatil ausgeschüttet, mit dem stärksten Puls in den ersten Stunden des Tiefschlafs (NREM-Schlaf). Auch körperliche Belastung und Hypoglykämie stimulieren die GH-Ausschüttung. GH fördert Zellwachstum, Proteinsynthese und Fettabbau.",
        difficulty = 2,
        funFact = null
    ),

    // Question 13 – Endocrinology: Adrenaline
    Question(
        categoryId = 2,
        questionText = "Welche physiologischen Reaktionen löst Adrenalin (Epinephrin) als Teil der 'Kampf-oder-Flucht'-Reaktion aus?",
        answerA = "Verlangsamter Herzschlag, erhöhte Verdauung, Pupillenverengung",
        answerB = "Erhöhter Herzschlag, Bronchienerweiterung, Glykogenabbau in Leber und Muskulatur",
        answerC = "Verstärkte Insulinausschüttung und Senkung des Blutzuckers",
        answerD = "Hemmung des Sympathikus und Aktivierung des Parasympathikus",
        correctAnswer = 1, // B
        explanation = "Adrenalin wird vom Nebennierenmark ausgeschüttet und bereitet den Körper auf akuten Stress vor: Herzfrequenz und Blutdruck steigen, Bronchien weiten sich für mehr O2-Aufnahme, Glykogen wird in Glucose umgewandelt (mehr Energie), die Durchblutung der Muskulatur erhöht sich, während Verdauung und Haut-Durchblutung gehemmt werden.",
        difficulty = 2,
        funFact = "Adrenalin wird medizinisch eingesetzt: bei anaphylaktischen Schocks (EpiPen) und als Herzstimulans bei der Reanimation."
    ),

    // Question 14 – Endocrinology: Sex Hormones
    Question(
        categoryId = 2,
        questionText = "Welche Aussage über Estrogen und Testosteron ist korrekt?",
        answerA = "Estrogen kommt nur in weiblichen, Testosteron nur in männlichen Körpern vor",
        answerB = "Beide Hormone kommen in beiden Geschlechtern vor, unterscheiden sich aber in der Konzentration",
        answerC = "Testosteron ist ein Vorläufer von Estrogen in allen Körperzellen",
        answerD = "Estrogen wird ausschließlich in den Eierstöcken produziert",
        correctAnswer = 1, // B
        explanation = "Sowohl Estrogen als auch Testosteron kommen in beiden biologischen Geschlechtern vor, jedoch in unterschiedlichen Konzentrationen. Interessanterweise wird Testosteron in Fettzellen und Leber durch das Enzym Aromatase zu Estradiol (einer Estrogen-Form) umgewandelt. Männer produzieren auch kleine Mengen Estrogen.",
        difficulty = 2,
        funFact = null
    ),

    // Question 15 – Endocrinology: Diabetes Types
    Question(
        categoryId = 2,
        questionText = "Was ist der grundlegende Unterschied zwischen Typ-1- und Typ-2-Diabetes mellitus?",
        answerA = "Typ 1 ist ernährungsbedingt, Typ 2 entsteht durch Virusinfektionen",
        answerB = "Bei Typ 1 werden die Insulin-produzierenden Betazellen autoimmun zerstört; bei Typ 2 liegt eine Insulinresistenz der Zellen vor",
        answerC = "Typ 1 betrifft nur Kinder, Typ 2 tritt nur im Alter auf",
        answerD = "Typ 2 produziert kein Insulin, Typ 1 produziert zu viel",
        correctAnswer = 1, // B
        explanation = "Bei Typ-1-Diabetes zerstört das Immunsystem die Betazellen der Bauchspeicheldrüse, die kein Insulin mehr produzieren können — lebenslange Insulinsubstitution ist nötig. Bei Typ-2-Diabetes reagieren die Körperzellen unempfindlich auf Insulin (Insulinresistenz), oft durch Übergewicht und Bewegungsmangel ausgelöst.",
        difficulty = 2,
        funFact = "Weltweit leben ca. 537 Millionen Menschen mit Diabetes — etwa 90 % davon mit Typ 2, der durch Lebensstiländerungen oft verzögert oder verhindert werden kann."
    ),

    // Question 16 – Waves & Sound Physics: Doppler Effect
    Question(
        categoryId = 2,
        questionText = "Was bewirkt der Doppler-Effekt bei einem sich nähernden Krankenwagen?",
        answerA = "Die Lautstärke des Sirenentons nimmt zu, die Frequenz bleibt konstant",
        answerB = "Die wahrgenommene Frequenz des Sirenentons ist höher als die Sendefrequenz",
        answerC = "Die Schallwellen werden gestreckt und der Ton klingt tiefer",
        answerD = "Der Ton klingt lauter, weil der Abstand abnimmt",
        correctAnswer = 1, // B
        explanation = "Der Doppler-Effekt beschreibt die wahrgenommene Frequenzänderung, wenn sich Quelle und Beobachter relativ zueinander bewegen. Bei einem sich nähernden Fahrzeug werden Schallwellen komprimiert → höhere Frequenz (hellerer Ton). Beim Entfernen werden sie gestreckt → niedrigere Frequenz (dunklerer Ton).",
        difficulty = 2,
        funFact = "Der Doppler-Effekt gilt auch für Licht: Sich entfernende Galaxien zeigen eine Rotverschiebung — damit wurde die Expansion des Universums entdeckt."
    ),

    // Question 17 – Waves & Sound Physics: Standing Waves
    Question(
        categoryId = 2,
        questionText = "Was sind stehende Wellen und unter welcher Bedingung entstehen sie?",
        answerA = "Wellen, die sich ohne Energieverlust fortbewegen und durch Resonanz entstehen",
        answerB = "Überlagerung zweier gegenläufiger Wellen gleicher Frequenz und Amplitude, die Knoten und Bäuche erzeugt",
        answerC = "Wellen, die an Hindernissen reflektiert werden und so stationär erscheinen",
        answerD = "Longitudinalwellen, die sich in einem Medium nicht ausbreiten können",
        correctAnswer = 1, // B
        explanation = "Stehende Wellen entstehen durch Überlagerung (Superposition) zweier Wellen gleicher Frequenz und Amplitude, die in entgegengesetzter Richtung laufen. Es entstehen feste Knoten (keine Auslenkung) und Bäuche (maximale Auslenkung). Dies ist die Grundlage für Resonanzphänomene in Saiten und Pfeifen.",
        difficulty = 2,
        funFact = null
    ),

    // Question 18 – Waves & Sound Physics: Resonance
    Question(
        categoryId = 2,
        questionText = "Was versteht man unter der Resonanzfrequenz eines Objekts?",
        answerA = "Die maximale Frequenz, bei der ein Objekt noch schwingt, ohne zu brechen",
        answerB = "Die Eigenfrequenz, bei der ein Objekt auf äußere Schwingungen mit maximaler Amplitude reagiert",
        answerC = "Die Frequenz, bei der Schallwellen in Wärmenergie umgewandelt werden",
        answerD = "Die Frequenz, oberhalb derer ein Objekt keine Schwingungen mehr aufnehmen kann",
        correctAnswer = 1, // B
        explanation = "Jedes schwingungsfähige System hat eine oder mehrere Eigenfrequenzen. Wird es mit seiner Resonanzfrequenz angeregt, nimmt die Schwingungsamplitude stark zu. In der Praxis führt dies bei Brücken oder Gebäuden zu gefährlichen Schwingungen, wenn externe Kräfte (Wind, Erdbeben) die Resonanzfrequenz treffen.",
        difficulty = 2,
        funFact = "Die Tacoma-Narrows-Brücke kollabierte 1940, weil Wind Wirbel erzeugte, die der Eigenfrequenz der Brücke entsprachen — ein klassisches Resonanzbeispiel."
    ),

    // Question 19 – Waves & Sound Physics: Harmonics
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Grundton und Obertönen (Harmonischen) bei einer schwingenden Saite?",
        answerA = "Der Grundton ist der lauteste Ton; Obertöne sind Geräusche durch schlechte Saiten",
        answerB = "Der Grundton ist die niedrigste Eigenfrequenz; Obertöne sind ganzzahlige Vielfache davon",
        answerC = "Obertöne haben immer eine niedrigere Frequenz als der Grundton",
        answerD = "Der Grundton ist von Instrument zu Instrument verschieden; Obertöne sind universal gleich",
        correctAnswer = 1, // B
        explanation = "Eine schwingende Saite erzeugt neben dem Grundton (1. Harmonische, f1) gleichzeitig Obertöne: 2. Harmonische (2f1), 3. Harmonische (3f1) usw. Das spezifische Mischungsverhältnis der Obertöne bestimmt die Klangfarbe (Timbre) eines Instruments — deshalb klingt eine Geige anders als eine Gitarre, obwohl sie denselben Ton spielen.",
        difficulty = 2,
        funFact = null
    ),

    // Question 20 – Waves & Sound Physics: Wave Interference
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen konstruktiver und destruktiver Interferenz bei Schallwellen?",
        answerA = "Konstruktiv bedeutet lauter, destruktiv bedeutet eine Phasenverschiebung von 90°",
        answerB = "Bei konstruktiver Interferenz addieren sich Amplituden (lauter); bei destruktiver löschen sie sich aus (leiser/stiller)",
        answerC = "Destruktive Interferenz entsteht nur bei verschiedenen Frequenzen",
        answerD = "Konstruktive Interferenz tritt nur bei Licht, nicht bei Schall auf",
        correctAnswer = 1, // B
        explanation = "Wenn zwei Wellen gleicher Frequenz sich überlagern, kommt es zur Interferenz: Sind sie in Phase (Wellenberg trifft auf Wellenberg), addieren sich die Amplituden — konstruktive Interferenz. Sind sie gegenphasig (um 180° verschoben), löschen sie sich aus — destruktive Interferenz. Dies ist das Prinzip aktiver Geräuschunterdrückung (Noise-Cancelling).",
        difficulty = 2,
        funFact = "Noise-Cancelling-Kopfhörer erzeugen gezielt gegenphasige Schallwellen zu Umgebungsgeräuschen und löschen diese durch destruktive Interferenz aus."
    ),

    // Question 21 – Volcanology & Mineralogy: Igneous Rock Types
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Plutoniten (Tiefengesteinen) und Vulkaniten (Ergussgesteinen)?",
        answerA = "Plutonite entstehen durch Wassereinwirkung, Vulkanite durch Hitze",
        answerB = "Plutonite erstarren langsam in der Tiefe und haben grobkörnige Struktur; Vulkanite erstarren schnell an der Oberfläche und sind feinkörnig",
        answerC = "Vulkanite sind immer basisch, Plutonite immer sauer",
        answerD = "Plutonite entstehen bei Subduktion, Vulkanite nur an Mittelozeanischen Rücken",
        correctAnswer = 1, // B
        explanation = "Beide Gesteinstypen entstehen aus abkühlender Magma (Schmelze). Plutonite erstarren langsam in großer Tiefe: Kristalle wachsen groß (z. B. Granit mit sichtbaren Kristallen). Vulkanite erstarren schnell an oder nahe der Oberfläche: Die Kristalle bleiben mikroskopisch klein (z. B. Basalt) oder es entsteht Glas (Obsidian).",
        difficulty = 2,
        funFact = "Granit ist eines der häufigsten Gesteine der Erdkruste und wird seit Jahrtausenden als Baumaterial verwendet — von ägyptischen Obelisken bis zu modernen Küchenarbeitsplatten."
    ),

    // Question 22 – Volcanology & Mineralogy: Mineral Hardness
    Question(
        categoryId = 2,
        questionText = "Nach welchem Prinzip funktioniert die Mohs-Härteskala und welches Mineral hat die höchste Härte?",
        answerA = "Sie misst die Druckfestigkeit; Korund (Saphir) hat Härtegrad 10",
        answerB = "Ein härteres Mineral ritzt ein weicheres; Diamant hat Härtegrad 10",
        answerC = "Sie misst die Schmelztemperatur; Diamant beginnt bei Härte 10 zu schmelzen",
        answerD = "Die Skala geht von 1–10 in Schritten von gleichem Energieaufwand; Quarz hat Härtegrad 10",
        correctAnswer = 1, // B
        explanation = "Die Mohs-Härteskala (Friedrich Mohs, 1812) ist eine Relativskala: Ein Mineral der Stufe n ritzt alle Mineralien einer niedrigeren Stufe. Talg (1) ist das weichste, Diamant (10) das härteste natürlich vorkommende Mineral. Die Schritte sind nicht linear — Diamant ist ca. 4-mal härter als Korund (9).",
        difficulty = 2,
        funFact = null
    ),

    // Question 23 – Volcanology & Mineralogy: Volcanic Gases
    Question(
        categoryId = 2,
        questionText = "Welches Gas ist bei Vulkanausbrüchen mengenmäßig am häufigsten?",
        answerA = "Schwefeldioxid (SO2)",
        answerB = "Kohlendioxid (CO2)",
        answerC = "Wasserdampf (H2O)",
        answerD = "Chlorwasserstoff (HCl)",
        correctAnswer = 2, // C
        explanation = "Wasserdampf macht mit ca. 60–90 % den größten Anteil vulkanischer Gase aus, gefolgt von CO2 (~10–40 %) und SO2 (~1–10 %). Obwohl SO2 medienbekannter ist und Schwefelsäureaerosole bildet, ist Wasserdampf mengenmäßig dominant. Vulkane tragen zur Wasserverteilung auf der Erde bei.",
        difficulty = 2,
        funFact = "Ein Teil des Wassers auf der Erde wurde durch Vulkane über Milliarden von Jahren aus dem Erdmantel an die Oberfläche gebracht — vulkanische Ausgasung formte die frühe Atmosphäre."
    ),

    // Question 24 – Volcanology & Mineralogy: Geodes
    Question(
        categoryId = 2,
        questionText = "Wie entstehen Geoden (kristallgefüllte Gesteinshöhlungen)?",
        answerA = "Durch Erosion von Gestein, in das anschließend Mineralien einwachsen",
        answerB = "Durch Gasblasen in abkühlender Lava oder Hohlräume in Sediment, in die mineral-reiches Wasser eintritt und Kristalle ablagert",
        answerC = "Durch Druckkristallisation tief im Erdmantel",
        answerD = "Durch Bakterien, die Kalk im Inneren von Steinen auflösen",
        correctAnswer = 1, // B
        explanation = "Geoden entstehen in Hohlräumen, die durch Gasblasen in Vulkangestein oder in weichem Sediment gebildet werden. Mineralreiches Grundwasser sickert ein und lagert über lange Zeit Mineralien ab — typisch sind Quarz, Amethyst oder Calcit. Die äußere Schale verhärtet, während innen Kristalle wachsen.",
        difficulty = 2,
        funFact = null
    ),

    // Question 25 – Volcanology & Mineralogy: Crystal Systems
    Question(
        categoryId = 2,
        questionText = "Zu welchem Kristallsystem gehört Steinsalz (NaCl) und was charakterisiert es?",
        answerA = "Hexagonales System — durch sechszählige Rotationsachse",
        answerB = "Kubisches (isometrisches) System — drei gleichlange, senkrecht aufeinanderstehende Achsen",
        answerC = "Tetragonales System — eine längere und zwei kürzere gleichlange Achsen",
        answerD = "Monoklines System — eine schiefe Achse",
        correctAnswer = 1, // B
        explanation = "Steinsalz kristallisiert im kubischen System: Na⁺ und Cl⁻ ordnen sich in einem würfelförmigen Gitter an, bei dem jedes Ion von sechs Ionen entgegengesetzter Ladung umgeben ist. Das kubische System zeichnet sich durch drei gleichlange, rechtwinklig aufeinander stehende Achsen aus. Es entstehen charakteristische Würfel- und Oktaederformen.",
        difficulty = 2,
        funFact = "Diamant kristallisiert ebenfalls im kubischen System — trotzdem ist seine Struktur völlig anders als die von Graphit, das hexagonal kristallisiert, obwohl beide nur aus Kohlenstoff bestehen."
    ),

    // Question 26 – Marine Biology: Whale Communication
    Question(
        categoryId = 2,
        questionText = "Wie kommunizieren Blauwale über sehr große Distanzen im Ozean?",
        answerA = "Durch Oberflächenverhalten wie Springen und Flossenschlagen, das Wellen erzeugt",
        answerB = "Durch Infraschall-Laute (sehr tiefe Frequenzen), die im SOFAR-Kanal tausende Kilometer weit reisen",
        answerC = "Durch elektrische Signale, die im Wasser als Impulse übertragen werden",
        answerD = "Durch chemische Duftstoffe (Pheromone) im Wasser",
        correctAnswer = 1, // B
        explanation = "Blauwale produzieren extrem tiefe Laute (10–40 Hz, Infraschall) mit bis zu 188 Dezibel — die lautesten tierischen Laute überhaupt. Diese Frequenzen werden im SOFAR-Kanal (Sound Fixing And Ranging), einer Tiefwasserschicht mit minimaler Schallgeschwindigkeit, über tausende Kilometer übertragen.",
        difficulty = 2,
        funFact = "Der Gesang männlicher Buckelwale kann sich innerhalb einer Saison über das gesamte Pazifik ausbreiten — ein akustischer Kulturwandel, der sich wie ein viraler Hit verbreitet."
    ),

    // Question 27 – Marine Biology: Deep Sea Adaptations
    Question(
        categoryId = 2,
        questionText = "Wie erzeugen Tiefseefische wie der Tiefseeanglerfish ihr Licht (Biolumineszenz)?",
        answerA = "Durch Reflexion des wenigen Lichts, das in die Tiefsee eindringt",
        answerB = "Durch chemische Reaktion von Luciferin und Luciferase, oft in Symbiose mit Leuchtbakterien",
        answerC = "Durch spezielle Pigmente, die Wärme in Licht umwandeln",
        answerD = "Durch elektrische Entladungen ähnlich dem Zitteraal",
        correctAnswer = 1, // B
        explanation = "Biolumineszenz entsteht durch die enzymatische Reaktion: Luciferin wird durch Luciferase unter O2-Verbrauch oxidiert und setzt dabei Licht frei. Viele Tiefseefische beherbergen lumineszente Bakterien in speziellen Organen (Photophoren). Der Tiefseeanglerfish nutzt seinen leuchtenden Köder, um Beute anzulocken.",
        difficulty = 2,
        funFact = null
    ),

    // Question 28 – Marine Biology: Coral Bleaching
    Question(
        categoryId = 2,
        questionText = "Was ist der direkte Auslöser der Korallenbleiche und warum ist sie für das Riff gefährlich?",
        answerA = "Übermäßige Algenbesiedlung verstopft die Korallenpolypen und lässt sie verhungern",
        answerB = "Erhöhte Wassertemperatur stresst die Korallen, die daraufhin die symbiontischen Zooxanthellen ausstoßen und ohne ihre Algen verhungern",
        answerC = "Sinkender Salzgehalt durch Süßwassereintrag zerstört die Kalkstruktur",
        answerD = "UV-Strahlung durch das Ozonloch tötet direkt die Korallenpolypen",
        correctAnswer = 1, // B
        explanation = "Korallen leben in Symbiose mit Zooxanthellen (fotosyntetischen Algen), die bis zu 90 % des Korallen-Energiebedarfs decken und die charakteristische Farbe verleihen. Bei Stress (v. a. Temperaturen >1–2 °C über Normal über mehrere Wochen) stoßen Korallen die Algen aus, werden weiß (gebleicht) und sterben ohne Nahrungsquelle ab.",
        difficulty = 2,
        funFact = "Das Great Barrier Reef hat zwischen 2016 und 2022 fünf schwere Massenbleichen erlebt — mehr als in allen Jahrzehnten zuvor zusammen."
    ),

    // Question 29 – Marine Biology: Plankton
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Phytoplankton und Zooplankton?",
        answerA = "Phytoplankton sind Tiere, Zooplankton sind Pflanzen",
        answerB = "Phytoplankton sind fotosyntheseaktive Mikroorganismen (Primärproduzenten); Zooplankton sind heterotrophe Kleinstlebewesen",
        answerC = "Phytoplankton lebt am Meeresboden, Zooplankton treibt an der Oberfläche",
        answerD = "Zooplankton ist größer und sichtbar mit bloßem Auge, Phytoplankton nicht",
        correctAnswer = 1, // B
        explanation = "Phytoplankton (gr. phyton = Pflanze) betreibt Fotosynthese und bildet die Basis der marinen Nahrungskette — sie produzieren ca. 50 % des atmosphärischen Sauerstoffs. Zooplankton (gr. zoion = Tier) sind heterotrophe Kleinstlebewesen wie Copepoden, Krill und Quallen-Larven, die Phytoplankton fressen.",
        difficulty = 2,
        funFact = "Ein einziger Liter Meerwasser kann bis zu eine Million Phytoplankton-Zellen enthalten."
    ),

    // Question 30 – Marine Biology: Ocean Symbiosis
    Question(
        categoryId = 2,
        questionText = "Was schützt den Clownfisch vor dem Gift der Seeanemone, in der er lebt?",
        answerA = "Der Clownfisch produziert ein chemisches Gegengift gegen das Anemonengift",
        answerB = "Eine spezielle Schleimschicht auf dem Clownfisch verhindert, dass die Nematocysten (Nesselzellen) ausgelöst werden",
        answerC = "Der Clownfisch ist genetisch immun gegen alle bekannten Meeresgifte",
        answerD = "Die Seeanemone erkennt den Clownfisch als Teil ihres Körpers und deaktiviert ihre Nesselzellen",
        correctAnswer = 1, // B
        explanation = "Der Clownfisch (Amphiprioninae) besitzt eine mehrfach dickere Schleimschicht als andere Fische. Dieser Schleim verhindert das Auslösen der Nesselzellen der Anemone durch chemische Tarnung oder fehlenden Reiz. Junge Clownfische müssen sich durch kurze Kontakte schrittweise 'akklimatisieren'.",
        difficulty = 2,
        funFact = null
    ),

    // Question 31 – Astronomy - Stellar: Binary Stars
    Question(
        categoryId = 2,
        questionText = "Was sind spektroskopische Doppelsterne und wie werden sie entdeckt?",
        answerA = "Zwei Sterne, die mit bloßem Auge als eine Einheit erscheinen und nur durch Teleskope trennbar sind",
        answerB = "Doppelsterne, die zu nahe beieinander sind um optisch getrennt zu werden, aber durch periodische Doppler-Verschiebung im Spektrum erkennbar sind",
        answerC = "Sterne, die gleichzeitig Novae sind und so ihre Doppelnatur verraten",
        answerD = "Systeme, bei denen einer der Sterne unsichtbar (ein schwarzes Loch) ist",
        correctAnswer = 1, // B
        explanation = "Spektroskopische Doppelsterne können nicht optisch aufgelöst werden, aber ihr Licht zeigt periodische Doppler-Verschiebungen: Wenn ein Stern auf uns zuzieht, verschieben sich Spektrallinien zum Blauen; beim Entfernen zum Roten. Aus der Periode dieser Verschiebungen lässt sich die Umlaufbahn berechnen.",
        difficulty = 2,
        funFact = "Etwa die Hälfte aller Sterne ist Teil eines Mehrfachsystems — 'Einzelsterne' wie unsere Sonne sind eigentlich die Ausnahme."
    ),

    // Question 32 – Astronomy - Stellar: Red Giants
    Question(
        categoryId = 2,
        questionText = "Was passiert mit einem sonnenähnlichen Stern, wenn er seinen Wasserstoffvorrat im Kern erschöpft hat?",
        answerA = "Er kollabiert sofort zu einem Weißen Zwerg",
        answerB = "Er dehnt sich zu einem Roten Riesen aus, wenn Wasserstofffusion in einer Schale um den Heliumkern beginnt",
        answerC = "Er explodiert als Supernova und hinterlässt einen Neutronenstern",
        answerD = "Er kühlt ab und wird zu einem Braunen Zwerg",
        correctAnswer = 1, // B
        explanation = "Wenn der Wasserstoff im Kern erschöpft ist, zieht sich der Kern gravitativ zusammen und erhitzt sich. Die Wasserstofffusion setzt in einer Schale um den Kern fort. Die dabei freigesetzte Energie bläht die äußeren Schichten zu einem Roten Riesen auf — unsere Sonne wird dies in ~5 Milliarden Jahren tun und bis zur Erdbahn expandieren.",
        difficulty = 2,
        funFact = "Wenn unsere Sonne zum Roten Riesen wird, wird sie so groß, dass sie Venus und möglicherweise die Erde verschluckt."
    ),

    // Question 33 – Astronomy - Stellar: White Dwarfs
    Question(
        categoryId = 2,
        questionText = "Was ist ein Weißer Zwerg und was verhindert seinen weiteren Kollaps?",
        answerA = "Ein junger, heißer Stern mit hoher Strahlungsleistung; Kernfusion verhindert den Kollaps",
        answerB = "Das Ende eines sonnenähnlichen Sterns; Elektronen-Entartungsdruck verhindert weiteren Kollaps",
        answerC = "Ein Stern im Hertzsprung-Spalt, der von Neutronendruck stabilisiert wird",
        answerD = "Ein kollabierterer Zustand als ein Neutronenstern, gestützt durch den Pauli-Druck von Quarks",
        correctAnswer = 1, // B
        explanation = "Ein Weißer Zwerg ist der Überrest eines sonnenähnlichen Sterns nach der Roten-Riesen-Phase. Er besteht hauptsächlich aus Kohlenstoff und Sauerstoff und ist etwa erdgroß, aber mit Sonnenmasse. Kein Kernbrennen findet statt; der Zusammenbruch wird durch den Elektronen-Entartungsdruck (Pauli-Prinzip) verhindert — maximal bis zur Chandrasekhar-Grenze (~1,4 Sonnenmassen).",
        difficulty = 2,
        funFact = null
    ),

    // Question 34 – Astronomy - Stellar: Supernova Types
    Question(
        categoryId = 2,
        questionText = "Was ist der wesentliche Unterschied zwischen einer Typ-Ia-Supernova und einer Kern-Kollaps-Supernova (Typ II)?",
        answerA = "Typ Ia ist heller, Typ II ist seltener",
        answerB = "Typ Ia entsteht in einem Weißen Zwerg-Doppelsternsystem durch Massenübertragung; Typ II durch Kernkollaps eines massereichen Sterns",
        answerC = "Typ II entsteht aus binären Systemen, Typ Ia aus Einzelsternen",
        answerD = "Typ Ia enthält Wasserstofflinien im Spektrum, Typ II nicht",
        correctAnswer = 1, // B
        explanation = "Typ-Ia: Ein Weißer Zwerg überschreitet durch Massenansammlung von einem Begleitstern die Chandrasekhar-Grenze und explodiert vollständig — keine Überreste. Da alle Typ-Ia mit ähnlicher Leuchtkraft explodieren, dienen sie als 'Standardkerzen'. Typ II: Massereiche Sterne (>8 Sonnenmassen) kollabieren im Kern zu Neutronenstern oder schwarzem Loch.",
        difficulty = 2,
        funFact = "Mit Typ-Ia-Supernovae als Standardkerzen entdeckten Riess, Perlmutter und Schmidt 1998 die beschleunigte Expansion des Universums — Nobelpreis 2011."
    ),

    // Question 35 – Astronomy - Stellar: Hertzsprung Gap
    Question(
        categoryId = 2,
        questionText = "Was ist der 'Hertzsprung-Spalt' im Hertzsprung-Russell-Diagramm?",
        answerA = "Die Region zwischen Hauptreihe und Weißen Zwergen, wo keine Sterne existieren",
        answerB = "Eine nahezu leere Zone zwischen Hauptreihe und Riesenast, da Sterne diese Region sehr schnell durchlaufen",
        answerC = "Der Bereich bei mittleren Temperaturen, wo Rote Zwerge und Gelbe Zwerge koexistieren",
        answerD = "Die Lücke in der Leuchtkraft zwischen Riesen und Überriesen",
        correctAnswer = 1, // B
        explanation = "Der Hertzsprung-Spalt (instability strip) ist eine Zone im HRD zwischen Hauptreihe und Riesenast bei mittleren Temperaturen, die kaum Sterne enthält. Der Grund: Sterne durchqueren diese Region auf dem Weg vom Hauptreihenstadium zum Roten Riesen extrem schnell (in astronomischen Zeitskalen). Kurze Aufenthaltszeit = wenige Sterne beobachtbar.",
        difficulty = 2,
        funFact = null
    ),

    // Question 36 – Microbiology: Bacteria vs Archaea
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet Archaeen von Bakterien auf zellulärer Ebene?",
        answerA = "Archaeen haben einen echten Zellkern, Bakterien nicht",
        answerB = "Archaeen besitzen einzigartige Lipide in der Zellmembran (Etherbindungen statt Esterbindungen) und unterschiedliche Zellwandzusammensetzungen",
        answerC = "Archaeen vermehren sich sexuell, Bakterien asexuell",
        answerD = "Bakterien können Fotosynthese betreiben, Archaeen nicht",
        correctAnswer = 1, // B
        explanation = "Obwohl beide Prokaryoten sind (kein Zellkern), unterscheiden sich Archaeen fundamental: Ihre Membran-Lipide bestehen aus Isoprenoid-Einheiten mit Etherbindungen (statt Fettsäuren mit Esterbindungen), was extremen Bedingungen standhält. Ihre Zellwände enthalten kein Peptidoglykan (Murein). Genetisch sind sie näher mit Eukaryoten verwandt als mit Bakterien.",
        difficulty = 2,
        funFact = "Archaeen wurden lange als eine Art Bakterien betrachtet. Erst 1977 erkannte Carl Woese anhand von rRNA-Sequenzvergleichen, dass sie eine völlig eigene Domäne des Lebens bilden."
    ),

    // Question 37 – Microbiology: Biofilms
    Question(
        categoryId = 2,
        questionText = "Was ist ein Biofilm und warum ist er medizinisch problematisch?",
        answerA = "Eine dünne Schicht von Viren auf medizinischen Instrumenten, die durch Sterilisation schwer zu entfernen ist",
        answerB = "Eine strukturierte Gemeinschaft von Mikroorganismen in einer selbst-produzierten Matrix, die Antibiotika-Resistenz stark erhöht",
        answerC = "Ein Schleim produziert von Körperzellen als Immunantwort auf Bakterieninfektionen",
        answerD = "Eine Biofilter-Technologie zur Wasserreinigung in Krankenhäusern",
        correctAnswer = 1, // B
        explanation = "Biofilme sind strukturierte Gemeinschaften von Mikroorganismen (oft mehrere Arten), eingebettet in eine selbstproduzierte extrazelluläre Matrix aus Polysacchariden, Proteinen und DNA. Diese Matrix schützt die Bakterien vor Antibiotika (bis 1000-fach höhere Resistenz) und dem Immunsystem. Biofilme auf Kathetern, Herzklappen und Zahnimplantaten sind medizinisch bedeutsam.",
        difficulty = 2,
        funFact = "Etwa 80 % aller menschlichen Infektionen werden von Biofilm-bildenden Bakterien verursacht. Zahnbelag (Plaque) ist ein klassischer Biofilm."
    ),

    // Question 38 – Microbiology: Extremophiles
    Question(
        categoryId = 2,
        questionText = "Was sind thermophile Archaeen und wo findet man sie?",
        answerA = "Bakterien, die in gekühlten Lebensmitteln bei Temperaturen unter 0 °C überleben",
        answerB = "Mikroorganismen, die bei sehr hohen Temperaturen (60–121 °C) optimal wachsen, z. B. in hydrothermalen Quellen",
        answerC = "Viren, die durch Hitze aktiviert werden und tropische Krankheiten auslösen",
        answerD = "Pilze, die extreme UV-Strahlung für die Fotosynthese nutzen",
        correctAnswer = 1, // B
        explanation = "Thermophile (und Hyperthermophile) gedeihen bei Temperaturen, die andere Organismen töten. Sie sind in hydrothermalen Quellen, Geysiren und Tiefsee-Schwarzen Rauchern (bis 121 °C) zu finden. Ihre Enzyme (wie die Taq-Polymerase aus Thermus aquaticus) sind hitzestabil und industriell wertvoll.",
        difficulty = 2,
        funFact = null
    ),

    // Question 39 – Microbiology: Antibiotics Mechanism
    Question(
        categoryId = 2,
        questionText = "Wie wirken Beta-Laktam-Antibiotika (z. B. Penicillin) auf Bakterien?",
        answerA = "Sie blockieren die Proteinsynthese durch Bindung an die 30S-Untereinheit des Ribosoms",
        answerB = "Sie hemmen die Synthese der bakteriellen Zellwand (Peptidoglykan-Quervernetzung) und führen zum osmotischen Zelltod",
        answerC = "Sie erhöhen die Membrandurchlässigkeit und lassen Ionen unkontrolliert strömen",
        answerD = "Sie inhibieren das Enzym DNA-Gyrase und verhindern so die DNA-Replikation",
        correctAnswer = 1, // B
        explanation = "Beta-Laktam-Antibiotika hemmen Transpeptidasen (Penicillin-bindende Proteine, PBPs), die für die Quervernetzung des Peptidoglykans in der Zellwand zuständig sind. Die geschwächte Wand hält dem osmotischen Druck nicht stand, die Bakterienzelle platzt. Da menschliche Zellen keine Peptidoglykan-Wand haben, ist die Toxizität für Menschen gering.",
        difficulty = 2,
        funFact = "Penicillin wurde 1928 zufällig von Alexander Fleming entdeckt, als ein Penicillium-Schimmelpilz eine Bakterienkultur kontaminierte und einen keimfreien Hof um sich bildete."
    ),

    // Question 40 – Microbiology: Virus Structure
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen einem behüllten und einem unbehüllten Virus?",
        answerA = "Behüllte Viren sind größer und immer gefährlicher als unbehüllte",
        answerB = "Behüllte Viren besitzen eine Lipiddoppelschicht-Hülle um das Kapsid, unbehüllte nicht — was ihre Stabilität und Infektionsweg beeinflusst",
        answerC = "Unbehüllte Viren haben keine Nukleinsäure und vermehren sich nicht",
        answerD = "Behüllte Viren können nur RNA enthalten, unbehüllte nur DNA",
        correctAnswer = 1, // B
        explanation = "Behüllte Viren (z. B. Influenza, HIV, SARS-CoV-2) haben eine Lipidmembran um das Protein-Kapsid, die sie empfindlicher gegenüber Fett-lösenden Substanzen (Seife!) macht. Unbehüllte Viren (z. B. Noro-, Rhinovirus) sind stabiler, überleben auf Oberflächen länger und sind gegen Alkohol-Desinfektion weniger empfindlich.",
        difficulty = 2,
        funFact = "Das Corona-Virus SARS-CoV-2 ist behüllt — deshalb tötet Seife es so effektiv, indem sie die Lipidmembran zerstört."
    ),

    // Question 41 – Physical Chemistry: Reaction Kinetics
    Question(
        categoryId = 2,
        questionText = "Was besagt die Arrhenius-Gleichung über die Temperaturabhängigkeit der Reaktionsgeschwindigkeit?",
        answerA = "Jede Erhöhung der Temperatur um 10 K verdoppelt die Reaktionsgeschwindigkeit",
        answerB = "Die Geschwindigkeitskonstante k steigt exponentiell mit sinkender Aktivierungsenergie und steigender Temperatur",
        answerC = "Reaktionsgeschwindigkeit und Temperatur sind linear proportional",
        answerD = "Oberhalb der Aktivierungstemperatur ist die Reaktionsgeschwindigkeit konstant",
        correctAnswer = 1, // B
        explanation = "Die Arrhenius-Gleichung lautet: k = A · e^(-Ea/RT), wobei A der präexponentielle Faktor, Ea die Aktivierungsenergie, R die Gaskonstante und T die absolute Temperatur ist. Die Exponentialfunktion bewirkt, dass kleine Temperaturerhöhungen zu großen k-Anstiegen führen. Die RGT-Regel (Reaktionsgeschwindigkeit-Temperatur) besagt näherungsweise: +10 K ≈ 2–4-fache Geschwindigkeit.",
        difficulty = 2,
        funFact = null
    ),

    // Question 42 – Physical Chemistry: Activation Energy
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Aktivierungsenergie (Ea) in einer chemischen Reaktion?",
        answerA = "Die gesamte Energie, die bei einer exothermen Reaktion freigesetzt wird",
        answerB = "Die Mindestenergie, die Eduktmoleküle aufbringen müssen, um den Übergangszustand zu erreichen und zu reagieren",
        answerC = "Die Energiedifferenz zwischen Edukten und Produkten",
        answerD = "Die Energie, die ein Katalysator bereitstellt, um eine Reaktion zu starten",
        correctAnswer = 1, // B
        explanation = "Die Aktivierungsenergie ist die Energiebarriere, die Reaktanten überwinden müssen, um den Übergangszustand (Aktivierungskomplex) zu erreichen. Nur Moleküle mit ausreichend kinetischer Energie können reagieren. Ein Katalysator senkt diese Barriere (nicht die Gesamtenthalpie der Reaktion), wodurch mehr Moleküle reagieren können.",
        difficulty = 2,
        funFact = "Enzyme sind biologische Katalysatoren: Sie senken die Aktivierungsenergie biochemischer Reaktionen um Faktoren von bis zu 10^17 — ohne sie würden viele Lebensreaktionen Millionen Jahre dauern."
    ),

    // Question 43 – Physical Chemistry: Catalysts
    Question(
        categoryId = 2,
        questionText = "Was ist ein Katalysator und was ändert er an einer chemischen Reaktion nicht?",
        answerA = "Ein Katalysator erhöht die Ausbeute einer Reaktion und verändert das Gleichgewicht",
        answerB = "Ein Katalysator beschleunigt die Reaktion, indem er die Aktivierungsenergie senkt, aber die Gleichgewichtslage und die Reaktionsenthalpie bleiben unverändert",
        answerC = "Ein Katalysator wird verbraucht und muss nach der Reaktion ersetzt werden",
        answerD = "Ein Katalysator erhöht die Temperatur der Reaktion und beschleunigt so den Prozess",
        correctAnswer = 1, // B
        explanation = "Ein Katalysator bietet einen alternativen Reaktionspfad mit niedrigerer Aktivierungsenergie an und wird dabei nicht verbraucht. Entscheidend: Er verändert weder die thermodynamische Gleichgewichtslage noch die Reaktionsenthalpie (ΔH) — er beschleunigt nur, wie schnell das Gleichgewicht erreicht wird.",
        difficulty = 2,
        funFact = "Der Haber-Bosch-Prozess zur Ammoniakherstellung nutzt Eisenkatalysatoren — er versorgt Dünger für ca. 50 % der heutigen Weltbevölkerung."
    ),

    // Question 44 – Physical Chemistry: Le Chatelier's Principle
    Question(
        categoryId = 2,
        questionText = "Wie reagiert das chemische Gleichgewicht der Ammoniak-Synthese (N2 + 3H2 ⇌ 2NH3, exotherm) auf eine Druckerhöhung?",
        answerA = "Das Gleichgewicht verschiebt sich nach links, weil Druck die Rückreaktion begünstigt",
        answerB = "Das Gleichgewicht verschiebt sich nach rechts, weil die Produktseite weniger Gasmoleküle hat",
        answerC = "Druck hat keinen Einfluss auf Gasreaktionen im Gleichgewicht",
        answerD = "Das Gleichgewicht verschiebt sich nach rechts, weil die Reaktion exotherm ist",
        correctAnswer = 1, // B
        explanation = "Nach dem Le-Chatelier-Prinzip verschiebt sich das Gleichgewicht bei Druckerhöhung in Richtung der Seite mit weniger Gasmolekülen. Links: 1 + 3 = 4 mol Gas; rechts: 2 mol Gas. Erhöhter Druck begünstigt die Ammoniakbildung. Deshalb wird der Haber-Bosch-Prozess bei hohem Druck (150–300 bar) betrieben.",
        difficulty = 2,
        funFact = null
    ),

    // Question 45 – Physical Chemistry: Equilibrium Constants
    Question(
        categoryId = 2,
        questionText = "Was sagt ein Gleichgewichtskonstante Kc > 1 über eine chemische Reaktion aus?",
        answerA = "Die Rückreaktion läuft schneller ab als die Hinreaktion",
        answerB = "Im Gleichgewicht überwiegen die Produkte gegenüber den Edukten",
        answerC = "Die Reaktion ist exotherm und läuft vollständig ab",
        answerD = "Bei Kc > 1 ist der Katalysator notwendig um das Gleichgewicht zu verschieben",
        correctAnswer = 1, // B
        explanation = "Die Gleichgewichtskonstante Kc = [Produkte]^n / [Edukte]^m. Bei Kc > 1 sind im Gleichgewichtszustand die Produktkonzentrationen höher als die Eduktkonzentrationen — das Gleichgewicht liegt auf der Produktseite. Bei Kc < 1 überwiegen die Edukte. Bei Kc = 1 sind beide Seiten gleich stark vertreten.",
        difficulty = 2,
        funFact = "Die Gleichgewichtskonstante der Wasserautoionisation (Kw = 10^-14 bei 25 °C) erklärt, warum reines Wasser einen pH von 7 hat."
    ),

    // Question 46 – Botany & Plant Biology: Transpiration
    Question(
        categoryId = 2,
        questionText = "Was treibt den Wassertransport in der Pflanze von der Wurzel bis zu den Blättern an?",
        answerA = "Osmotischer Wurzeldruck alleine reicht für den Wassertransport aus",
        answerB = "Der Kohäsions-Adhäsions-Zugmechanismus: Transpiration erzeugt Sogkraft, die Wassersäule im Xylem zieht",
        answerC = "Aktiver Membrantransport durch energieverbrauchende Pumpen entlang des Xylems",
        answerD = "Kapillarkräfte in den Tracheen sind allein ausreichend",
        correctAnswer = 1, // B
        explanation = "Das SPAC-Modell (Soil-Plant-Atmosphere Continuum): Transpiration in den Blättern (Wasserverdunstung durch Stomata) erzeugt einen Unterdruck. Durch die Kohäsion (Wassermoleküle haften aneinander) und Adhäsion (Wasser haftet an Zellwänden) wird die gesamte Wassersäule im Xylem nach oben gezogen. Dieser passive Mechanismus trägt Wasser bis zu 100+ Meter hoch.",
        difficulty = 2,
        funFact = "Ein großer Baum kann an einem heißen Sommertag bis zu 400 Liter Wasser transpirieren — ohne eine einzige Pumpe."
    ),

    // Question 47 – Botany & Plant Biology: Phloem and Xylem
    Question(
        categoryId = 2,
        questionText = "Was ist der funktionelle Unterschied zwischen Xylem und Phloem?",
        answerA = "Xylem transportiert Zucker von den Blättern zu den Wurzeln, Phloem transportiert Wasser aufwärts",
        answerB = "Xylem transportiert Wasser und Mineralsalze von der Wurzel aufwärts; Phloem transportiert Assimilate (Zucker) in alle Richtungen",
        answerC = "Xylem und Phloem sind funktional identisch, unterscheiden sich nur in der Zellstruktur",
        answerD = "Phloem ist nur in Blättern aktiv, Xylem nur in Wurzeln",
        correctAnswer = 1, // B
        explanation = "Xylem (Holzteil) besteht aus toten Zellen (Tracheen, Tracheiden) und leitet Wasser + gelöste Mineralsalze von der Wurzel aufwärts — unidirektional. Phloem (Biestteil) besteht aus lebenden Siebröhren-Elementen und transportiert photosynthetisch erzeugte Assimilate (v. a. Saccharose) bidirektional von Quell- zu Senkenorganen.",
        difficulty = 2,
        funFact = null
    ),

    // Question 48 – Botany & Plant Biology: Tropisms
    Question(
        categoryId = 2,
        questionText = "Wie erklärt der Chomokin-Auxin-Gradient den positiven Phototropismus von Pflanzensprossen?",
        answerA = "Licht aktiviert Chlorophyll, das direkt das Zellwachstum steuert",
        answerB = "Auxin wandert von der beleuchteten zur Schattenseite, fördert dort stärkeres Streckungswachstum und der Spross biegt sich zum Licht",
        answerC = "Auf der Lichtseite wird mehr Wasser aufgenommen, die Zellen schwellen an",
        answerD = "Licht zerstört Auxin auf der beleuchteten Seite, hemmend wirkt es auf Zellstreckung",
        correctAnswer = 1, // B
        explanation = "Bei einseitiger Beleuchtung wird das Phytohormon Auxin (IAA) von der beleuchteten Seite lateral zur Schattenseite transportiert. Höhere Auxinkonzentration fördert die Zellstreckung. Die Zellen auf der Schattenseite strecken sich mehr — der Spross biegt sich in Richtung Licht (positiver Phototropismus).",
        difficulty = 2,
        funFact = "Charles Darwin beobachtete 1880 als Erster den Phototropismus in Haferkeimlinge-Experimenten — er nannte den unbekannten Wirkstoff 'Influenz'. Erst 1926 wurde er als Auxin isoliert."
    ),

    // Question 49 – Botany & Plant Biology: Plant Hormones
    Question(
        categoryId = 2,
        questionText = "Welche Rolle spielt das Phytohormon Abscisinsäure (ABA) in Pflanzen unter Trockenstress?",
        answerA = "ABA stimuliert die Öffnung der Stomata um mehr CO2 aufzunehmen",
        answerB = "ABA signalisiert Trockenstress und bewirkt den Schließung der Stomata zur Wasserersparnis",
        answerC = "ABA fördert das Wurzelwachstum und die Auxinproduktion",
        answerD = "ABA aktiviert die Photosynthese um mehr Zucker für osmotischen Schutz zu produzieren",
        correctAnswer = 1, // B
        explanation = "Abscisinsäure ist das wichtigste 'Stresshormon' der Pflanze. Bei Wasserdefizit wird ABA in den Wurzeln und Blättern gebildet und im Phloem transportiert. In den Schließzellen der Stomata löst ABA eine Kaskade aus, die zum Kaliumionenaustrom führt — die Stomata schließen sich und verringern so die Transpiration.",
        difficulty = 2,
        funFact = null
    ),

    // Question 50 – Botany & Plant Biology: Mycorrhiza
    Question(
        categoryId = 2,
        questionText = "Was ist Mykorrhiza und welchen Vorteil bietet sie der Pflanze?",
        answerA = "Eine Pilzinfektion, die das Wurzelsystem der Pflanze parasitiert",
        answerB = "Eine mutualistische Symbiose zwischen Pilzhyphen und Pflanzenwurzeln: Pilz versorgt Pflanze mit Mineralstoffen, erhält dafür Zucker",
        answerC = "Bakterien, die Stickstoff an Pflanzenwurzeln fixieren",
        answerD = "Eine Schutzschicht aus Pilzmyzel, die Wurzeln vor Bodenpathogenen schützt",
        correctAnswer = 1, // B
        explanation = "Mykorrhiza (gr. mykes = Pilz, rhiza = Wurzel) ist eine der häufigsten Symbiosen im Pflanzenreich: Pilzhyphen durchziehen oder umhüllen Wurzeln und vergrößern die Absorptionsfläche für Wasser, Phosphat und andere Mineralstoffe um das 100–1000-fache. Die Pflanze liefert dafür bis zu 20 % ihrer photosynthetisch produzierten Kohlenhydrate.",
        difficulty = 2,
        funFact = "Über 90 % aller Landpflanzen gehen Mykorrhiza-Symbiosen ein. Das unterirdische Netzwerk verbindet auch verschiedene Bäume miteinander — das sogenannte 'Wood Wide Web'."
    )

)
