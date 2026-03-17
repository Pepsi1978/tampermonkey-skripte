package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsHard2(): List<Question> = listOf(

    // Question 1 – Statistical Mechanics: Maxwell-Boltzmann Distribution
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Maxwell-Boltzmann-Verteilung in einem idealen Gas?",
        answerA = "Die Quantenzustände von Elektronen in einem Festkörper",
        answerB = "Die Verteilung der Geschwindigkeiten der Gasmoleküle bei thermischer Gleichgewicht",
        answerC = "Die Energieverteilung von Photonen in einem Hohlraumstrahler",
        answerD = "Die Wahrscheinlichkeit eines radioaktiven Zerfalls pro Zeiteinheit",
        correctAnswer = 1, // B
        explanation = "Die Maxwell-Boltzmann-Verteilung beschreibt die statistische Verteilung der Geschwindigkeiten von Teilchen in einem idealen Gas im thermischen Gleichgewicht. Die wahrscheinlichste Geschwindigkeit v_p = √(2kT/m), die mittlere Geschwindigkeit ⟨v⟩ = √(8kT/πm) und die quadratische Mittelgeschwindigkeit v_rms = √(3kT/m) lassen sich daraus ableiten.",
        difficulty = 3,
        funFact = "James Clerk Maxwell leitete diese Verteilung 1860 her — lange bevor Atome experimentell nachgewiesen wurden. Er vertraute rein auf statistische Überlegungen."
    ),

    // Question 2 – Statistical Mechanics: Partition Function
    Question(
        categoryId = 2,
        questionText = "Was ist die kanonische Zustandssumme (Partition Function) Z in der statistischen Mechanik?",
        answerA = "Z = ∑ exp(+E_i / k_B T) über alle Mikrozustände i",
        answerB = "Z = ∑ exp(−E_i / k_B T) über alle Mikrozustände i",
        answerC = "Z = ∏ E_i / (k_B T) über alle Mikrozustände i",
        answerD = "Z = ln(Ω), wobei Ω die Anzahl der Mikrozustände gleicher Energie ist",
        correctAnswer = 1, // B
        explanation = "Die kanonische Zustandssumme Z = ∑_i exp(−E_i/k_B T) normiert die Boltzmann-Gewichte aller Mikrozustände. Aus Z lassen sich alle thermodynamischen Größen ableiten: freie Energie F = −k_B T ln(Z), innere Energie U = −∂(ln Z)/∂β, Entropie S = k_B(ln Z + βU).",
        difficulty = 3,
        funFact = null
    ),

    // Question 3 – Statistical Mechanics: Bose-Einstein Condensation
    Question(
        categoryId = 2,
        questionText = "Unterhalb welcher kritischen Temperatur bildet sich ein Bose-Einstein-Kondensat?",
        answerA = "Wenn die thermische de-Broglie-Wellenlänge kleiner als der mittlere Teilchenabstand wird",
        answerB = "Wenn die thermische de-Broglie-Wellenlänge größer als der mittlere Teilchenabstand wird",
        answerC = "Wenn die Wärmekapazität des Systems ihr Maximum erreicht",
        answerD = "Wenn alle Bosonen auf den ersten angeregten Quantenzustand fallen",
        correctAnswer = 1, // B
        explanation = "Ein Bose-Einstein-Kondensat entsteht, wenn die thermische de-Broglie-Wellenlänge λ_th = √(2πℏ²/mk_BT) vergleichbar mit oder größer als der mittlere Teilchenabstand n^(-1/3) wird. Dann überlappen die Wellenfunktionen und makroskopisch viele Bosonen besetzen den Grundzustand. 1995 gelang Cornell und Wieman die erste Realisierung mit Rubidium-87.",
        difficulty = 3,
        funFact = "Im Bose-Einstein-Kondensat verhalten sich Millionen von Atomen wie ein einziges Quantenobjekt — ein makroskopischer Quantenzustand, der mit bloßem Auge sichtbar ist."
    ),

    // Question 4 – Statistical Mechanics: Fermi Gas
    Question(
        categoryId = 2,
        questionText = "Was ist die Fermi-Energie eines entarteten Fermi-Gases bei T = 0 K?",
        answerA = "Die Energie, unterhalb derer alle Zustände besetzt und oberhalb derer alle unbesetzt sind",
        answerB = "Die mittlere kinetische Energie aller Fermionen",
        answerC = "Die Energielücke zwischen Valenz- und Leitungsband",
        answerD = "Die Nullpunktsenergie des harmonischen Oszillators",
        correctAnswer = 0, // A
        explanation = "Bei T = 0 K besetzen Fermionen (Spin-1/2-Teilchen) gemäß dem Pauli-Prinzip alle Zustände bis zur Fermi-Energie E_F = (ℏ²/2m)(3π²n)^(2/3). Alle Zustände mit E < E_F sind vollständig besetzt, alle mit E > E_F sind leer. Bei endlicher Temperatur wird diese scharfe Kante durch die Fermi-Dirac-Verteilung aufgeweicht.",
        difficulty = 3,
        funFact = null
    ),

    // Question 5 – Statistical Mechanics: Entropy Formulations
    Question(
        categoryId = 2,
        questionText = "Welche Beziehung stellt die Boltzmann-Entropieformel S = k_B ln(Ω) her?",
        answerA = "Verbindung zwischen makroskopischer Entropie und der Anzahl der Mikrozustände Ω",
        answerB = "Verbindung zwischen Entropie und der freien Energie des Systems",
        answerC = "Verbindung zwischen Entropie und der Wärmekapazität bei konstantem Volumen",
        answerD = "Verbindung zwischen Entropie und dem chemischen Potential der Teilchen",
        correctAnswer = 0, // A
        explanation = "Boltzmanns Formel S = k_B ln(Ω) verbindet die makroskopische thermodynamische Größe Entropie mit der mikroskopischen Größe Ω — der Anzahl der Mikrozustände, die zum gleichen Makrozustand führen. Sie ist auf Boltzmanns Grabstein in Wien eingraviert und gilt als eine der tiefgründigsten Gleichungen der Physik.",
        difficulty = 3,
        funFact = "Die Formel S = k_B ln(Ω) ist auf Ludwig Boltzmanns Grabstein am Wiener Zentralfriedhof eingraviert — sein Epitaph in mathematischer Form."
    ),

    // Question 6 – Analytical Chemistry: Mass Spectrometry
    Question(
        categoryId = 2,
        questionText = "Was gibt das Masse-zu-Ladungs-Verhältnis (m/z) im Massenspektrum eines Moleküls an?",
        answerA = "Das Verhältnis der molaren Masse zur Gesamtladung der Probe",
        answerB = "Die Masse eines ionisierten Teilchens dividiert durch seine Ladungszahl",
        answerC = "Den Quotienten aus kinetischer Energie und elektrischer Feldstärke",
        answerD = "Die Retentionszeit eines Fragments in der Gaschromatographie",
        correctAnswer = 1, // B
        explanation = "Im Massenspektrometer werden Moleküle ionisiert und nach ihrem m/z-Verhältnis (Masse dividiert durch Ladungszahl z) getrennt. Der Molekülionenpeak (M+•) entspricht dem intact ionisierten Molekül. Fragmentierungsmuster erlauben Rückschlüsse auf die Molekülstruktur. Moderne Techniken wie ESI-MS ermöglichen die Analyse intakter Proteine.",
        difficulty = 3,
        funFact = "Mit Tandem-Massenspektrometrie (MS/MS) können heute einzelne Peptidsequenzen aus winzigsten Probenmengen identifiziert werden — revolutionär für die Proteomik."
    ),

    // Question 7 – Analytical Chemistry: Chromatography
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der Van-Deemter-Koeffizient A (A-Term) in der Chromatographie?",
        answerA = "Die longitudinale Diffusion des Analyten in der Mobilphase",
        answerB = "Den Massentransfer zwischen stationärer und mobiler Phase",
        answerC = "Die Eddy-Diffusion durch ungleichmäßige Strömungswege im Säulenmaterial",
        answerD = "Die Trenneffizienz in Abhängigkeit von der Temperatur",
        correctAnswer = 2, // C
        explanation = "Die Van-Deemter-Gleichung H = A + B/u + Cu beschreibt die Bodenhöhe H (Maß für Peakverbreiterung) in Abhängigkeit von der Flussrate u. Der A-Term (Eddy-Diffusion) entsteht durch unterschiedlich lange Strömungswege um die Säulenpartikel. B/u beschreibt Längsdiffusion, Cu den kinetischen Massentransfer.",
        difficulty = 3,
        funFact = null
    ),

    // Question 8 – Analytical Chemistry: Spectrophotometry
    Question(
        categoryId = 2,
        questionText = "Was besagt das Lambert-Beer-Gesetz A = ε·c·l?",
        answerA = "Die Absorption A ist dem Logarithmus der Konzentration proportional",
        answerB = "Die Absorbanz A ist proportional zur molaren Extinktion ε, der Konzentration c und der Schichtdicke l",
        answerC = "Die Transmission T entspricht dem Quotienten aus eingestrahlter und absorbierter Intensität",
        answerD = "Die Fluoreszenzintensität ist proportional zur absorbierten Lichtmenge",
        correctAnswer = 1, // B
        explanation = "Das Lambert-Beer-Gesetz A = ε·c·l beschreibt die lineare Abhängigkeit der Absorbanz A (= log(I₀/I)) vom molaren Extinktionskoeffizienten ε (in L·mol⁻¹·cm⁻¹), der Stoffkonzentration c und der optischen Schichtdicke l. Das Gesetz gilt nur für verdünnte Lösungen und monochromatisches Licht ohne Streuung.",
        difficulty = 3,
        funFact = "Der molare Extinktionskoeffizient von Hämoglobin bei 550 nm ist so charakteristisch, dass er zur Bestimmung von Sauerstoffsättigung im Blut genutzt wird — Grundlage des Pulsoximeters."
    ),

    // Question 9 – Analytical Chemistry: Titration Curves
    Question(
        categoryId = 2,
        questionText = "An welchem Punkt einer Säure-Base-Titrationskurve gilt pH = pKₐ der schwachen Säure?",
        answerA = "Am Äquivalenzpunkt, wenn genau so viel Base wie Säure vorhanden ist",
        answerB = "Am Halbäquivalenzpunkt, wenn die Hälfte der schwachen Säure neutralisiert ist",
        answerC = "Beim Wendepunkt nach dem Äquivalenzpunkt",
        answerD = "Am Anfangspunkt der Titration vor Zugabe von Base",
        correctAnswer = 1, // B
        explanation = "Am Halbäquivalenzpunkt ist [HA] = [A⁻], daher gilt nach der Henderson-Hasselbalch-Gleichung pH = pKₐ + log([A⁻]/[HA]) = pKₐ + log(1) = pKₐ. Der Pufferbereich liegt ±1 pH-Einheit um den pKₐ-Wert. Der Äquivalenzpunkt liegt bei schwachen Säuren oberhalb pH 7, da das konjugierte Anion A⁻ basisch reagiert.",
        difficulty = 3,
        funFact = null
    ),

    // Question 10 – Analytical Chemistry: Electroanalysis
    Question(
        categoryId = 2,
        questionText = "Was misst die zyklische Voltammetrie (CV) in der Elektrochemie?",
        answerA = "Den Widerstand einer Elektrolytlösung als Funktion der Frequenz",
        answerB = "Den Strom als Funktion des Potentials bei einer dreieckförmigen Potenzialkurve",
        answerC = "Die Menge abgeschiedenen Metalls nach dem Faraday'schen Gesetz",
        answerD = "Den pH-Wert einer Lösung durch potentiometrische Messung",
        correctAnswer = 1, // B
        explanation = "In der zyklischen Voltammetrie wird das Potential einer Arbeitselektrode linear hin- und zurückgefahren (Dreieckspotential) und der resultierende Strom gemessen. Das CV-Diagramm zeigt charakteristische Oxidations- und Reduktionspeaks, deren Peakpotentiale und -ströme Aufschluss über Redoxeigenschaften, Reaktionskinetik und Mechanismen geben.",
        difficulty = 3,
        funFact = "Die zyklische Voltammetrie wurde maßgeblich von Reverend John Randles in den 1940er Jahren entwickelt und ist heute eines der meistgenutzten elektrochemischen Analyseverfahren."
    ),

    // Question 11 – Developmental Biology: Morphogen Gradients
    Question(
        categoryId = 2,
        questionText = "Welche Funktion übernimmt Bicoid als Morphogen in der Drosophila-Entwicklung?",
        answerA = "Es aktiviert die Transkription anteriorer Gene in Abhängigkeit von seiner lokalen Konzentration",
        answerB = "Es hemmt die Apoptose in der dorsalen Körperhälfte des Embryos",
        answerC = "Es reguliert die Segmentpolarität entlang der dorsoventralen Achse",
        answerD = "Es kodiert für ein Strukturprotein des Dottersacks",
        correctAnswer = 0, // A
        explanation = "Bicoid (Bcd) ist ein Homeodomänen-Transkriptionsfaktor, dessen mRNA am anterioren Pol des Drosophila-Eies verankert ist. Nach der Translation diffundiert das Protein und bildet einen Konzentrationsgradienten. Hohe Bcd-Konzentration aktiviert anteriore Gene (z.B. hunchback), niedrige Konzentration bewirkt posteriore Identität. Es war das erste experimentell belegte Morphogen.",
        difficulty = 3,
        funFact = "Christiane Nüsslein-Volhard entdeckte Bicoid und erhielt dafür 1995 den Nobelpreis für Physiologie oder Medizin — zusammen mit Eric Wieschaus und Edward Lewis."
    ),

    // Question 12 – Developmental Biology: Hox Genes
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Kolinearität der Hox-Gene?",
        answerA = "Die Expressionsreihenfolge der Hox-Gene entspricht ihrer physischen Reihenfolge auf dem Chromosom",
        answerB = "Alle Hox-Gene werden gleichzeitig im gesamten Embryo exprimiert",
        answerC = "Hox-Gene kodieren für kollagene Strukturproteine der Körperachse",
        answerD = "Die Mutation eines Hox-Gens führt immer zur Apoptose des gesamten Segments",
        correctAnswer = 0, // A
        explanation = "Kolinearität bedeutet, dass die physische Anordnung der Hox-Gene auf dem Chromosom ihrer räumlichen Expressionsdomäne entlang der Körperachse entspricht: 3'-gelegene Gene werden anterior, 5'-gelegene Gene posterior exprimiert. Diese Korrespondenz ist evolutionär konserviert von Nematoden bis zum Menschen. Homeotische Mutationen (z.B. Antennapedia) können ganze Segmente transformieren.",
        difficulty = 3,
        funFact = null
    ),

    // Question 13 – Developmental Biology: Gastrulation
    Question(
        categoryId = 2,
        questionText = "Welche drei Keimblätter entstehen bei der Gastrulation von Vertebraten?",
        answerA = "Epidermis, Mesenchym und Endoderm",
        answerB = "Ektoderm, Mesoderm und Endoderm",
        answerC = "Neurektoderm, Somiten und Splanchnopleura",
        answerD = "Trophoblast, Embryoblast und Decidua",
        correctAnswer = 1, // B
        explanation = "Bei der Gastrulation wandern Zellen der Blastula durch den Primitivstreifen (Vögel/Säuger) oder die Urmundlippe (Amphibien) und bilden die drei Keimblätter: Ektoderm (→ Nervensystem, Haut), Mesoderm (→ Muskulatur, Skelett, Herz, Nieren) und Endoderm (→ Darm, Leber, Lunge). Die molekularen Signale (Nodal, BMP, Wnt) kontrollieren die Schicksalsentscheidungen.",
        difficulty = 3,
        funFact = "Ernst Haeckel prägte 1872 den Begriff 'Gastrulation'. Das Wort leitet sich vom griechischen 'gaster' (Magen) ab — ein Verweis auf die Bildung der inneren Körperhöhle."
    ),

    // Question 14 – Developmental Biology: Stem Cell Niches
    Question(
        categoryId = 2,
        questionText = "Was ist eine Stammzellnische (stem cell niche) und welche Funktion hat sie?",
        answerA = "Ein isolierter Zellpool, der keine Signale aus der Umgebung empfängt",
        answerB = "Eine spezifische Mikroumgebung, die Stammzell-Selbsterneuerung und Differenzierung reguliert",
        answerC = "Ein Gencluster auf dem Y-Chromosom, der Stammzelleigenschaften kodiert",
        answerD = "Die Gesamtheit aller pluripotenten Zellen im adulten Organismus",
        correctAnswer = 1, // B
        explanation = "Die Stammzellnische ist eine definierte anatomische und biochemische Mikroumgebung, die durch Zell-Zell-Kontakte, Extrazellulärmatrix und parakrine Signale (z.B. Wnt, Notch, Hedgehog) den Gleichgewicht zwischen Selbsterneuerung und Differenzierung der Stammzellen kontrolliert. Beispiele: hämatopoetische Nische im Knochenmark (Osteoblasten, CXCL12), intestinale Krypten (Paneth-Zellen, Wnt3a).",
        difficulty = 3,
        funFact = null
    ),

    // Question 15 – Developmental Biology: Organogenesis
    Question(
        categoryId = 2,
        questionText = "Durch welchen Signalmechanismus wird die Herzentwicklung (Kardiogenese) beim Vertebraten primär initiiert?",
        answerA = "Durch FGF-Signale aus dem paraxialen Mesoderm",
        answerB = "Durch BMP-Signale aus dem anterioren viszeral-Endoderm und Wnt-Inhibition",
        answerC = "Durch Shh-Signale (Sonic Hedgehog) aus der Chorda dorsalis",
        answerD = "Durch Retinoidsäure-Gradienten aus dem posterioren Mesoderm",
        correctAnswer = 1, // B
        explanation = "Die Kardiogenese wird durch BMP (Bone Morphogenetic Protein)-Signale aus dem anterioren viszeral-Endoderm gefördert. Gleichzeitig ist die Inhibition des Wnt-Signalwegs (durch Dickkopf, Crescent) anterior notwendig, um das kardiale Schicksal der splanchnischen Mesodermzellen zu spezifizieren. Die kardiogene Progenitorzellen exprimieren die Transkriptionsfaktoren Nkx2.5 und GATA4.",
        difficulty = 3,
        funFact = "Das menschliche Herz beginnt in der 3. Embryonalwoche zu schlagen — lange bevor das zentrale Nervensystem ausgebildet ist."
    ),

    // Question 16 – Planetary Science: Exoplanet Detection
    Question(
        categoryId = 2,
        questionText = "Welche Eigenschaft des Wirtsterns wird bei der Radialgeschwindigkeitsmethode zur Exoplaneten-Detektion gemessen?",
        answerA = "Die periodische Helligkeitsschwankung durch Planetentransits",
        answerB = "Die periodische Dopplerverschiebung der Spektrallinien durch Sternbewegung um gemeinsamen Schwerpunkt",
        answerC = "Die gravitationslinsenartige Ablenkung des Sternlichts durch den Planeten",
        answerD = "Die direkte Infrarotstrahlung des Planeten relativ zum Stern",
        correctAnswer = 1, // B
        explanation = "Bei der Radialgeschwindigkeitsmethode (Doppler-Spektroskopie) wird die zyklische Rotbzw. Blauverschiebung der Sternspektrallinien gemessen, die dadurch entsteht, dass Stern und Planet um ihren gemeinsamen Schwerpunkt rotieren. Die Radialgeschwindigkeit v_r = (m_p sin i / (m_s + m_p)) · 2πa/P erlaubt die Bestimmung von m_p sin i. Sie lieferte 1995 den ersten Nachweis eines Exoplaneten um 51 Pegasi (Mayor & Queloz).",
        difficulty = 3,
        funFact = "Die Erde erzeugt eine Radialgeschwindigkeitssignatur von 0,09 m/s auf die Sonne — weniger als eine Schritttempo. Moderne Spektrographen wie ESPRESSO können tatsächlich solche winzigen Signale messen."
    ),

    // Question 17 – Planetary Science: Mars Geology
    Question(
        categoryId = 2,
        questionText = "Welcher geologische Prozess erklärt die außergewöhnliche Höhe des Olympus Mons auf dem Mars im Vergleich zu irdischen Vulkanen?",
        answerA = "Die geringere Schwerkraft erlaubt höhere Strukturen ohne Lithosphärenbruch",
        answerB = "Das Fehlen von Plattentektonik verhindert die Wanderung der Kruste über den Hotspot",
        answerC = "Verstärkte Effusivität durch höheren CO₂-Anteil im Marsmantel",
        answerD = "Häufigere Asteroideneinschläge verdichten das Baumaterial des Vulkans",
        correctAnswer = 1, // B
        explanation = "Auf der Erde wandern Krustenplatten über Hotspots, wodurch Vulkanketten entstehen und kein einzelner Vulkan unbegrenzt wächst. Auf dem Mars fehlt Plattentektonik, daher bleibt die Lithos­phäre fixiert über dem Mantelplume. Olympus Mons konnte so über Milliarden Jahre Lava aufschichten und erreichte ~22 km Höhe und ~600 km Durchmesser — das größte bekannte Vulkangebäude im Sonnensystem.",
        difficulty = 3,
        funFact = "Olympus Mons ist so groß, dass ein Beobachter auf seinem Gipfel den Kraterrand wegen der Marskrümmung nicht sehen würde — der Vulkan ist größer als Frankreich."
    ),

    // Question 18 – Planetary Science: Europa's Ocean
    Question(
        categoryId = 2,
        questionText = "Welcher Mechanismus hält das flüssige Wasserozean unter Europas Eisschicht aufrecht?",
        answerA = "Radioaktiver Zerfall von Uran und Thorium im Gesteinskern",
        answerB = "Gezeitenwärme durch gravitativer Flexion des Mondes im Jupitersystem",
        answerC = "Solare Wärmestrahlung, die die dünne Eisschicht aufschmilzt",
        answerD = "Chemothermale Reaktionen zwischen dem Ozean und dem Silikatmantel",
        correctAnswer = 1, // B
        explanation = "Europas Ozean wird primär durch Gezeitenerwärmung (tidal heating) aufrechterhalten. Die Gravitationskräfte von Jupiter und den benachbarten Galileischen Monden Io und Ganymed deformieren Europa zyklisch, was Reibungswärme im Inneren erzeugt (Laplace-Resonanz). Diese Energie reicht aus, um trotz der großen Sonnendistanz flüssiges Wasser unter der 10–30 km dicken Eisschale zu erhalten.",
        difficulty = 3,
        funFact = "Europas Ozean enthält schätzungsweise doppelt so viel flüssiges Wasser wie alle Ozeane der Erde zusammen — und gilt als einer der vielversprechendsten Orte für außerirdisches Leben im Sonnensystem."
    ),

    // Question 19 – Planetary Science: Asteroid Composition
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet C-Typ-Asteroiden von S-Typ-Asteroiden spektroskopisch?",
        answerA = "C-Typ-Asteroiden reflektieren mehr Licht und sind reicher an Silikaten",
        answerB = "C-Typ-Asteroiden sind dunkler (kohlenartig) und enthalten primitive Mineralien; S-Typ sind heller und silikatreich",
        answerC = "S-Typ-Asteroiden bestehen aus Eis-Gestein-Gemischen des äußeren Sonnensystems",
        answerD = "C-Typ-Asteroiden entstehen nur durch Kollision zweier S-Typ-Asteroiden",
        correctAnswer = 1, // B
        explanation = "C-Typ-Asteroiden (carbonaceous, ~75% aller Asteroiden) sind spektral flach, sehr dunkel (Albedo ~3–10%) und enthalten wasserhaltige Mineralien und organische Verbindungen — primitive Relikte des frühen Sonnensystems. S-Typ-Asteroiden sind heller (Albedo ~10–22%) und enthalten Olivin und Pyroxen. Die Ryugu- und Bennu-Missionen (Hayabusa2, OSIRIS-REx) untersuchten C-Typ-Asteroiden.",
        difficulty = 3,
        funFact = null
    ),

    // Question 20 – Planetary Science: Planetary Atmospheres
    Question(
        categoryId = 2,
        questionText = "Warum hat die Venus trotz größerer Sonnenferne als Merkur eine viel höhere Oberflächentemperatur?",
        answerA = "Die Venus rotiert schneller und erzeugt dadurch mehr innere Reibungswärme",
        answerB = "Der dichte CO₂-Atmosphärendruckgaseffekt führt zu einem extremen Treibhauseffekt",
        answerC = "Radioaktive Isotope im Venusmanteln erzeugen mehr Wärme als auf Merkur",
        answerD = "Häufige Vulkanausbrüche auf der Venus heizen die Atmosphäre kontinuierlich auf",
        correctAnswer = 1, // B
        explanation = "Die Venusatmosphäre besteht zu 96,5% aus CO₂ bei einem Druck von ~92 bar. Dieser extrem dichte Treibhausgasmantel absorbiert die von der Oberfläche abgestrahlte Infrarotstrahlung fast vollständig und re-emittiert sie nach unten (Treibhauseffekt). Die Oberflächentemperatur erreicht ~465°C — heißer als Merkurs Oberfläche trotz fast doppelter Entfernung zur Sonne.",
        difficulty = 3,
        funFact = "Die Venus ist ein lebendiges Beispiel für einen außer Kontrolle geratenen Treibhauseffekt (runaway greenhouse) — ein Warnsignal für mögliche Klimaentwicklungen auf der Erde."
    ),

    // Question 21 – Evolutionary Biology: Genetic Drift
    Question(
        categoryId = 2,
        questionText = "In welcher Population ist der Effekt genetischer Drift am stärksten?",
        answerA = "In großen Populationen mit hoher Migrationsrate",
        answerB = "In kleinen Populationen, da zufällige Allelhäufigkeitsschwankungen relativ größer sind",
        answerC = "In diploiden Populationen im Hardy-Weinberg-Gleichgewicht",
        answerD = "In Populationen unter starkem positiven Selektionsdruck",
        correctAnswer = 1, // B
        explanation = "Genetische Drift bezeichnet zufällige Schwankungen der Allelfrequenz in endlichen Populationen. Der Effekt ist proportional zu 1/(2N_e), wobei N_e die effektive Populationsgröße ist. In kleinen Populationen können neutrale und sogar leicht nachteilige Allele fixiert werden oder verloren gehen — unabhängig von natürlicher Selektion. Dies erklärte Motoo Kimura mit seiner Neutralen Theorie der molekularen Evolution (1968).",
        difficulty = 3,
        funFact = "Die Cheetahs (Geparden) zeigen extrem geringe genetische Diversität — Folge eines schweren genetischen Flaschenhalseffekts vor ~10.000 Jahren, der fast zur Ausrottung führte."
    ),

    // Question 22 – Evolutionary Biology: Bottleneck Effect
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet den Flaschenhalseffekt (bottleneck) vom Gründereffekt (founder effect) in der Populationsgenetik?",
        answerA = "Beim Flaschenhalseffekt sterben fast alle Individuen einer Population; beim Gründereffekt etabliert eine kleine Gruppe eine neue Population an einem neuen Ort",
        answerB = "Beim Gründereffekt sterben fast alle Individuen; beim Flaschenhalseffekt wandern wenige Individuen aus",
        answerC = "Beide Effekte beschreiben identische Prozesse mit unterschiedlichen Namen",
        answerD = "Nur der Gründereffekt führt zu dauerhafter Reduktion genetischer Diversität",
        correctAnswer = 0, // A
        explanation = "Beim Flaschenhalseffekt wird eine bestehende Population durch ein katastrophales Ereignis (Epidemie, Naturkatastrophe) drastisch verkleinert, wobei ein zufälliger Rest überlebt. Beim Gründereffekt verlässt eine kleine Gruppe die Ausgangspopulation und gründet eine neue Population. Beide verringern genetische Diversität durch Drift, unterscheiden sich aber im Prozess: Massensterben versus Isolation.",
        difficulty = 3,
        funFact = null
    ),

    // Question 23 – Evolutionary Biology: Sexual Selection
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet intersexuelle von intrasexueller Selektion nach Darwin?",
        answerA = "Intersexuelle Selektion: Wahl des Partners durch das andere Geschlecht; intrasexuelle: Konkurrenz innerhalb eines Geschlechts",
        answerB = "Intersexuelle Selektion wirkt nur auf Merkmale der Weibchen; intrasexuelle nur auf Merkmale der Männchen",
        answerC = "Intrasexuelle Selektion erhöht die Fitness, intersexuelle senkt sie",
        answerD = "Beide Formen der Selektion sind identisch und werden nur terminologisch unterschieden",
        correctAnswer = 0, // A
        explanation = "Darwin unterschied zwei Mechanismen der sexuellen Selektion: Bei der intersexuellen Selektion (mate choice) wählt ein Geschlecht (meist Weibchen) unter Individuen des anderen Geschlechts. Bei der intrasexuellen Selektion (male-male competition) konkurrieren Individuen gleichen Geschlechts direkt (Kämpfe, Territorialität). Beide können zu übertriebenen Merkmalen führen (Pfauenschwanz, Geweihe), die natürlicher Selektion widersprechen.",
        difficulty = 3,
        funFact = "Der Pfauenschwanz war für Darwin selbst ein 'Albtraum' — er schrieb 1860, dass der Anblick einer einzigen Pfauenfeder ihn körperlich krank mache, da er keine sofortige Erklärung durch natürliche Selektion sah."
    ),

    // Question 24 – Evolutionary Biology: Co-evolution
    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Konzept des 'evolutionären Wettrüstens' (evolutionary arms race) in der Koevolution?",
        answerA = "Die parallele Zunahme von Körpergröße in Räuber- und Beutepopulationen",
        answerB = "Die gegenseitige Anpassungsspirale zwischen zwei ökologisch interagierenden Arten",
        answerC = "Die gleichzeitige Extinktion von Räuber und Beute durch überstarke Selektion",
        answerD = "Den Prozess der Artbildung durch geografische Isolation zweier koevolvierender Arten",
        correctAnswer = 1, // B
        explanation = "Das evolutionäre Wettrüsten (nach Leigh Van Valen's Red-Queen-Hypothese) beschreibt den reziproken Selektionsdruck zwischen interagierenden Arten: Verbesserungen in einer Art erzeugen Selektionsdruck auf die andere Art, was weitere Anpassungen erfordert. Klassische Beispiele: Schlangen-Kröten-Toxin-Resistenz, Parasit-Wirt-Immunsystem, Bestäuber-Blüten-Morphologie (Darwin's Orchidee und Sphinxmotte).",
        difficulty = 3,
        funFact = "Darwin sagte 1862 voraus, dass es eine Motte geben müsse mit einem 25 cm langen Rüssel, um die Angraecum sesquipedale-Orchidee zu bestäuben. Die Motte Xanthopan morganii praedicta wurde 1903 entdeckt."
    ),

    // Question 25 – Evolutionary Biology: Molecular Clock
    Question(
        categoryId = 2,
        questionText = "Auf welcher Annahme basiert die molekulare Uhr (molecular clock) für phylogenetische Datierungen?",
        answerA = "Alle Gene mutieren mit einer konstanten Rate, die von Artgrenzen unabhängig ist",
        answerB = "Neutrale Mutationen akkumulieren näherungsweise konstant in der Zeit, proportional zur Generationszeit",
        answerC = "Nur Synonymmutationen können als molekulare Uhr dienen, da sie immer neutral sind",
        answerD = "Die molekulare Uhr setzt voraus, dass keine genetische Drift in der Population stattfindet",
        correctAnswer = 1, // B
        explanation = "Die molekulare Uhr (Zuckerkandl & Pauling, 1962) basiert auf Kimuras Neutraler Theorie: Neutrale Mutationen werden durch Drift mit einer Rate fixiert, die der neutralen Mutationsrate entspricht (μ_neutral). Da diese Rate näherungsweise konstant ist, können Sequenzdivergenzen zwischen Arten dazu genutzt werden, Divergenzzeiten zu schätzen, kalibriert durch Fossilbelege. Die Rate variiert jedoch zwischen Genen, Linien und über die Zeit.",
        difficulty = 3,
        funFact = null
    ),

    // Question 26 – Pharmacology: Receptor Agonists/Antagonists
    Question(
        categoryId = 2,
        questionText = "Was ist ein inverser Agonist im Unterschied zu einem kompetitiven Antagonisten?",
        answerA = "Ein inverser Agonist blockiert den Rezeptor sterisch, ohne die Basalaktivität zu ändern",
        answerB = "Ein inverser Agonist bindet an den Rezeptor und senkt seine Aktivität unter die konstitutive Basalaktivität",
        answerC = "Inverse Agonisten binden an allosterische Stellen, kompetitive Antagonisten an orthosterische Stellen",
        answerD = "Ein inverser Agonist wirkt nur bei voller Rezeptorbesetzung mit natürlichem Ligand",
        correctAnswer = 1, // B
        explanation = "Ein kompetitiver Antagonist bindet an die orthosterische Bindungsstelle und verhindert die Ligandenbindung, verändert aber die Basalaktivität nicht. Ein inverser Agonist bindet ebenfalls an die Bindungsstelle, stabilisiert jedoch die inaktive Rezeptorkonformation und senkt die konstitutive (ligandenunabhängige) Aktivität unter die Basislinie. Dies ist klinisch relevant bei Rezeptoren mit hoher konstitutiver Aktivität (z.B. β-Blocker als inverse Agonisten am β-Adrenozeptor).",
        difficulty = 3,
        funFact = "Viele 'Antagonisten' in der Klinik sind eigentlich inverse Agonisten — darunter mehrere Antihistaminika und Antipsychotika. Dieser Unterschied hat therapeutische Konsequenzen."
    ),

    // Question 27 – Pharmacology: Pharmacokinetics
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Bioverfügbarkeit (F) eines oral applizierten Arzneistoffs?",
        answerA = "Den Anteil des Wirkstoffs, der nach oraler Gabe unverändert die systemische Zirkulation erreicht",
        answerB = "Die maximale Konzentration des Wirkstoffs im Blut nach oraler Gabe",
        answerC = "Die Geschwindigkeit der Resorption aus dem Magen-Darm-Trakt",
        answerD = "Den Anteil des Wirkstoffs, der an Plasmaproteine gebunden vorliegt",
        correctAnswer = 0, // A
        explanation = "Die Bioverfügbarkeit F = AUC_oral / AUC_iv gibt den Anteil einer oral applizierten Dosis an, der unverändert die systemische Zirkulation erreicht. Sie wird durch intestinale Absorption, Pre-Systemic Metabolism (First-Pass-Effekt in Darmwand und Leber) sowie Efflux-Transporter (P-Glykoprotein) beeinflusst. Für intravenöse Gaben gilt F = 1 (100%) per Definition.",
        difficulty = 3,
        funFact = null
    ),

    // Question 28 – Pharmacology: Drug Metabolism
    Question(
        categoryId = 2,
        questionText = "Welche Phase der Arzneimittel-Biotransformation katalysieren CYP450-Enzyme hauptsächlich?",
        answerA = "Phase-II-Reaktionen durch Konjugation mit Glucuronsäure",
        answerB = "Phase-I-Reaktionen durch Oxidation, Reduktion oder Hydrolyse",
        answerC = "Phase-III-Reaktionen durch aktiven Transport aus der Leberzelle",
        answerD = "Direkte renale Exkretion ohne chemische Modifikation",
        correctAnswer = 1, // B
        explanation = "CYP450-Enzyme (Cytochrom-P450-Monooxygenasen) katalysieren Phase-I-Metabolisierung: Oxidation (häufigste Reaktion), Reduktion und Hydrolyse. Sie machen lipophile Xenobiotika polarer und damit wasserlöslicher. Die wichtigsten Isoformen sind CYP3A4 (ca. 50% aller Medikamente), CYP2D6, CYP2C9, CYP1A2. Phase II folgt oft mit Konjugationsreaktionen (Glucuronidierung, Sulfatierung, Glutathionkonjugation).",
        difficulty = 3,
        funFact = "Grapefruitsaft enthält Furanocoumarine, die CYP3A4 im Darm irreversibel hemmen. Dadurch können Plasma­spiegel mancher Medikamente auf das Fünffache ansteigen — ein ernstes Arzneimittelinteraktionsrisiko."
    ),

    // Question 29 – Pharmacology: Blood-Brain Barrier
    Question(
        categoryId = 2,
        questionText = "Welche strukturellen Eigenschaften der Blut-Hirn-Schranke limitieren die ZNS-Penetration von Arzneistoffen?",
        answerA = "Geringe Gefäßdichte und mangelnde Vaskularisation des Hirngewebes",
        answerB = "Tight Junctions zwischen Endothelzellen, Pericyten, Astrozytenendfüße und Efflux-Transporter",
        answerC = "Hochgradig negativ geladene Proteoglykane in der Hirnextrazellulärmatrix",
        answerD = "Kontinuierliche Phagozytose eindringender Substanzen durch Mikroglia",
        correctAnswer = 1, // B
        explanation = "Die Blut-Hirn-Schranke besteht aus: (1) Tight Junctions (Claudin-5, Occludin) zwischen Hirnendothelzellen, die parazelluläre Diffusion verhindern; (2) Astrozytenendfüße, die Endothelzellen umhüllen und Signale für BBB-Eigenschaften liefern; (3) Pericyten mit Regulationsfunktion; (4) Efflux-Transporter (P-gp, BCRP, MRP4), die eingedrungene Substanzen aktiv zurückpumpen. Nur kleine, lipophile, ungeladene Moleküle können passiv diffundieren.",
        difficulty = 3,
        funFact = "Viele vielversprechende ZNS-Medikamente scheitern klinisch wegen mangelhafter BBB-Penetration. Die Entwicklung von Nanopartikeln und Trojanischen-Pferd-Strategien für die BBB-Überwindung ist ein aktives Forschungsfeld."
    ),

    // Question 30 – Pharmacology: Therapeutic Index
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der therapeutische Index (TI) und welche Konsequenzen hat ein niedriger TI?",
        answerA = "TI = LD50/ED50; ein niedriger Wert bedeutet kaum Unterschied zwischen therapeutischer und toxischer Dosis",
        answerB = "TI = ED50/LD50; ein niedriger Wert bedeutet das Medikament ist besonders wirksam",
        answerC = "TI = Cmax/EC50; ein niedriger Wert erfordert häufigere Dosierungsintervalle",
        answerD = "TI beschreibt die Halbwertszeit des Wirkstoffs im Blut",
        correctAnswer = 0, // A
        explanation = "Der therapeutische Index TI = LD50/ED50 (Tier) bzw. TD50/ED50 (Mensch) gibt den Sicherheitsabstand zwischen wirksamer und toxischer Dosis an. Medikamente mit niedrigem TI (z.B. Lithium TI ~2–3, Digoxin TI ~2, Warfarin) erfordern enges therapeutisches Drug-Monitoring (TDM), da eine kleine Dosiserhöhung bereits toxisch sein kann. Medikamente mit hohem TI (z.B. Penicillin TI >100) sind viel sicherer in der Anwendung.",
        difficulty = 3,
        funFact = null
    ),

    // Question 31 – Climate Science: Milankovitch Cycles
    Question(
        categoryId = 2,
        questionText = "Welche drei astronomischen Parameter beschreiben die Milankovitch-Zyklen der Erdklimageschichte?",
        answerA = "Erdrotation (~24 h), Mondbahnneigung (~5°) und Sonnenfleckenzyklus (~11 Jahre)",
        answerB = "Exzentrizität der Erdbahn (~100.000 J), Obliquität (Achsneigung, ~41.000 J) und Präzession (~26.000 J)",
        answerC = "Polwanderung (~10.000 J), Gezeiten (~18 J) und Variationen der Solarkonstante (~80 J)",
        answerD = "CO₂-Konzentration, mittlere Meerestemperatur und Albedo der Polargebiete",
        correctAnswer = 1, // B
        explanation = "Milankovitch (1941) identifizierte drei orbitale Parameter als Klimatreiber: (1) Exzentrizität (e = 0–0,06, ~100.000 J): Form der Erdbahn; (2) Obliquität (ε = 22,1°–24,5°, ~41.000 J): Neigung der Erdachse zur Ekliptik; (3) Präzession der Erdachse (~26.000 J): Taumeln der Erdachse. Ihre Kombination beeinflusst die saisonale und breitengradbezogene Verteilung der Sonneneinstrahlung und löste pleistozäne Eiszeiten aus.",
        difficulty = 3,
        funFact = "Milankovitch berechnete seine Zyklen von 1914 bis 1941 von Hand — ohne Computer, teilweise während seiner Zeit als Kriegsgefangener im Ersten Weltkrieg."
    ),

    // Question 32 – Climate Science: Ocean Carbon Pump
    Question(
        categoryId = 2,
        questionText = "Welche zwei Hauptmechanismen umfasst die biologische Kohlenstoffpumpe des Ozeans?",
        answerA = "Thermohaline Zirkulation und Windgetriebene Oberflächenströmungen",
        answerB = "Phytoplankton-Photosynthese und Exportfluss von totem organischem Material in die Tiefsee",
        answerC = "CO₂-Lösung in kaltem Oberflächenwasser und chemische Fällung von Carbonaten",
        answerD = "Vulkanische Ausgasung am Meeresboden und biogene Methanproduktion",
        correctAnswer = 1, // B
        explanation = "Die biologische Kohlenstoffpumpe besteht aus: (1) Primärproduktion durch Phytoplankton, das CO₂ in organische Substanz (Kohlenwasserstoffe) umwandelt; (2) biologischer Export: Absinken von partikulärem organischem Kohlenstoff (POC) als Marine Snow in die Tiefsee, wo Kohlenstoff für Jahrhunderte bis Jahrtausende gebunden bleibt. Diese Pumpe exportiert ~10 Gt C/Jahr in die Tiefsee und ist entscheidend für die Regulation des atmosphärischen CO₂.",
        difficulty = 3,
        funFact = null
    ),

    // Question 33 – Climate Science: Albedo Feedback
    Question(
        categoryId = 2,
        questionText = "Warum gilt die Eis-Albedo-Rückkopplung als positiver Feedback im Klimasystem?",
        answerA = "Schmelzendes Eis setzt CO₂ frei, das den Treibhauseffekt verstärkt",
        answerB = "Weniger Eisbedeckung bedeutet weniger reflektiertes Sonnenlicht und mehr Wärmeabsorption, was zu weiterem Schmelzen führt",
        answerC = "Eis erhöht die Evaporation und damit die Wolkenbildung, die rückwirkend kühlt",
        answerD = "Gletscher produzieren Aerosole, die die Sonneneinstrahlung lokal verstärken",
        correctAnswer = 1, // B
        explanation = "Eis und Schnee haben eine Albedo von 0,8–0,9 (reflektieren 80–90% des einfallenden Sonnenlichts). Wenn Eis schmilzt, wird es durch dunklen Ozean oder Boden (Albedo ~0,06–0,3) ersetzt. Mehr Sonnenenergie wird absorbiert, Temperatur steigt, mehr Eis schmilzt (positiver Feedback-Loop). Arktische Verstärkung: Die Arktis erwärmt sich 2–4× schneller als der globale Durchschnitt, auch wegen dieses Mechanismus.",
        difficulty = 3,
        funFact = "Die Arktis hat seit 1980 etwa 50% ihrer Sommer-Meereisbedeckung verloren — eine der schnellsten Klimaveränderungen, die je gemessen wurde."
    ),

    // Question 34 – Climate Science: IPCC Scenarios
    Question(
        categoryId = 2,
        questionText = "Was beschreibt der SSP5-8.5-Szenario des IPCC AR6?",
        answerA = "Ein nachhaltiges Entwicklungsszenario mit schneller Dekarbonisierung",
        answerB = "Ein 'fossiler Brennstoff-intensive' Szenario mit hohen Emissionen und ~4,4°C Erwärmung bis 2100",
        answerC = "Den optimistischsten Klimapfad mit Netto-Null-Emissionen bis 2040",
        answerD = "Ein Szenario für regionalen Klimawandel in Entwicklungsländern",
        correctAnswer = 1, // B
        explanation = "SSP5-8.5 (Shared Socioeconomic Pathway 5, Radiative Forcing 8.5 W/m²) beschreibt einen Pfad mit fossilbrennstoffintensiver wirtschaftlicher Entwicklung, hohem Energieverbrauch und CO₂-Emissionen, die bis 2100 auf ~130 GtCO₂/Jahr steigen. Dies führt zu einer wahrscheinlichen Erwärmung von 3,3–5,7°C (Median ~4,4°C) bis 2100. Es ist das pessimistischste Basisszenario und dient als Referenz für Worst-Case-Klimafolgen.",
        difficulty = 3,
        funFact = null
    ),

    // Question 35 – Climate Science: Permafrost Methane
    Question(
        categoryId = 2,
        questionText = "Warum ist das Auftauen des arktischen Permafrosts ein besonders besorgniserregender Klimafeedback?",
        answerA = "Permafrost enthält gefroren Schwermetalle, die bei Schmelzen giftige Seen bilden",
        answerB = "Permafrost speichert ~1,5 Billionen Tonnen organischen Kohlenstoffs, der als CO₂ und CH₄ freigesetzt werden kann",
        answerC = "Das Schmelzen des Permafrosts verändert die Meeresströmungen durch Süßwassereintrag",
        answerD = "Permafrostgebiete sind die primären Lebensräume von CO₂-absorbierenden Wäldern",
        correctAnswer = 1, // B
        explanation = "Der arktische Permafrost enthält ~1.500 Pg (Petagramm) organischen Kohlenstoffs — fast doppelt so viel wie die gesamte atmosphärische CO₂-Menge. Bei Auftauen zersetzen Mikroorganismen die organische Substanz anaerob (Methan, CH₄, 80× stärker als CO₂ auf 20 Jahre) oder aerob (CO₂). Dieser positive Feedback könnte selbstverstärkend werden und das globale Klima weit über anthropogene Emissionen hinaus treiben.",
        difficulty = 3,
        funFact = "In Sibirien entstehen riesige Kraterseen ('Thermokarst'), wo Permafrost taupuffert kollabiert. Aus dem Grund mancher Seen steigen Methaneblasen auf, die sich entzünden lassen."
    ),

    // Question 36 – Solid State Physics: Band Theory
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Leiter, Halbleiter und Isolator in der Bändertheorie?",
        answerA = "Die Anzahl der Elektronen im Valenzband",
        answerB = "Die Breite der verbotenen Bandlücke zwischen Valenz- und Leitungsband",
        answerC = "Die Kristallstruktur: kubisch (Leiter), hexagonal (Halbleiter), amorph (Isolator)",
        answerD = "Die effektive Masse der Elektronen im periodischen Potential",
        correctAnswer = 1, // B
        explanation = "In der Bändertheorie unterscheiden sich Leiter, Halbleiter und Isolatoren durch die Bandlücke E_g: Leiter: E_g = 0 (gar keine Lücke oder teilweise gefülltes Valenzband); Halbleiter: E_g ~ 0,1–3 eV (z.B. Si: 1,12 eV, GaAs: 1,42 eV) — thermische Anregung möglich; Isolatoren: E_g > 4 eV (z.B. SiO₂: 9 eV, Diamant: 5,5 eV) — praktisch keine thermische Besetzung des Leitungsbands.",
        difficulty = 3,
        funFact = null
    ),

    // Question 37 – Solid State Physics: p-n Junction
    Question(
        categoryId = 2,
        questionText = "Wie entsteht die Raumladungszone in einem p-n-Übergang bei thermischem Gleichgewicht?",
        answerA = "Durch externe Spannungsanlegen, das Elektronen aus dem n-Bereich treibt",
        answerB = "Durch Diffusion von Elektronen (n→p) und Löchern (p→n), die unkompensierten Donatoren und Akzeptoren zurücklassen",
        answerC = "Durch Thermoemission von Elektronen aus der p-Seite bei Raumtemperatur",
        answerD = "Durch Ionenimplantation an der Grenzfläche während der Halbleiterherstellung",
        correctAnswer = 1, // B
        explanation = "Im p-n-Übergang diffundieren Elektronen vom n-Bereich (hohe e⁻-Konzentration) in den p-Bereich und Löcher vom p-Bereich in den n-Bereich. Die zurückbleibenden ionisierten Donatoren (positiv, n-Seite) und Akzeptoren (negativ, p-Seite) bilden die Raumladungszone mit eingebautem elektrischem Feld E_bi, das der Diffusion entgegenwirkt. Im Gleichgewicht: e·V_bi = kT·ln(N_D·N_A/n_i²).",
        difficulty = 3,
        funFact = "Der p-n-Übergang ist die Grundlage aller modernen Halbleiterbauelemente — Dioden, Transistoren, Solarzellen, LEDs. Die gesamte digitale Revolution basiert auf diesem Prinzip."
    ),

    // Question 38 – Solid State Physics: Hall Effect
    Question(
        categoryId = 2,
        questionText = "Welche Größe kann durch den Hall-Effekt direkt bestimmt werden?",
        answerA = "Die spezifische Wärmekapazität des Halbleiters",
        answerB = "Ladungsträgertyp (n oder p) und Ladungsträgerdichte im Material",
        answerC = "Die Bandlücke zwischen Valenz- und Leitungsband",
        answerD = "Die effektive Elektronenmasse im periodischen Gitterpotential",
        correctAnswer = 1, // B
        explanation = "Beim Hall-Effekt (Edwin Hall, 1879) wird ein stromführender Leiter einem senkrechten Magnetfeld B ausgesetzt. Die Lorentzkraft lenkt Ladungsträger quer ab und erzeugt eine Hall-Spannung V_H = (I·B)/(n·e·d). Das Vorzeichen von V_H gibt den Ladungsträgertyp an (negativ für Elektronen, positiv für Löcher), und der Hall-Koeffizient R_H = 1/(n·e) ermöglicht die Bestimmung der Trägerdichte n.",
        difficulty = 3,
        funFact = null
    ),

    // Question 39 – Solid State Physics: Phonons
    Question(
        categoryId = 2,
        questionText = "Was sind Phononen in einem Kristall und welche Rolle spielen sie bei der Wärmeleitung?",
        answerA = "Quanten der kollektiven Gitterschwingungen; sie transportieren Wärme durch den Kristall",
        answerB = "Elektronen mit negativer effektiver Masse im invertierten Energieband",
        answerC = "Ionisierte Gitterdefekte, die Elektronen streuen und den Widerstand erhöhen",
        answerD = "Stehende elektromagnetische Wellen im Kristallgitter bei Resonanzfrequenzen",
        correctAnswer = 0, // A
        explanation = "Phononen sind die gequantelten Moden kollektiver Gitterschwingungen in einem Kristall — analog zu Photonen für elektromagnetische Felder. Akustische Phononen (gleichphasige Bewegung benachbarter Atome) transportieren Wärme (Phononen-Wärmeleitung, Debye-Modell). Optische Phononen (gegenphasige Bewegung) koppeln an Infrarotstrahlung. Phonon-Phonon-Streuung (Umklapp-Prozesse) und Phonon-Defekt-Streuung limitieren die Wärmeleitfähigkeit.",
        difficulty = 3,
        funFact = "Diamant hat die höchste Wärmeleitfähigkeit aller bekannten Materialien (~2000 W/m·K) — fünfmal mehr als Kupfer — wegen seiner außerordentlich starken kovalenten C-C-Bindungen und damit hoher Phononengeschwindigkeit."
    ),

    // Question 40 – Solid State Physics: Bloch's Theorem
    Question(
        categoryId = 2,
        questionText = "Was besagt Blochs Theorem für Elektronen in einem periodischen Kristallpotential?",
        answerA = "Die Wellenfunktion eines Elektrons ist im periodischen Potential konstant über alle Einheitszellen",
        answerB = "Die Elektronenwellenfunktion ist das Produkt aus einer ebenen Welle und einer Funktion mit Gitterperiodizität",
        answerC = "Elektronen in einem periodischen Potential können keine stehenden Wellen bilden",
        answerD = "Das Pauli-Prinzip gilt nicht für Elektronen in periodischen Kristallen",
        correctAnswer = 1, // B
        explanation = "Blochs Theorem (1928) besagt: ψ_nk(r) = e^(ik·r) · u_nk(r), wobei u_nk(r) dieselbe Periodizität wie das Kristallgitter hat. Die Wellenfunktionen sind Bloch-Wellen mit einem Kristallimpuls ℏk (Quasi-Impuls). Das Theorem ist Grundlage der gesamten Festkörpertheorie: Es erlaubt die Verwendung der reduzierten Brillouin-Zone und erklärt, warum Elektronen im periodischen Potential keine klassische Streuung erleiden (Bloch-Leitung).",
        difficulty = 3,
        funFact = null
    ),

    // Question 41 – Virology: Retrovirus Lifecycle
    Question(
        categoryId = 2,
        questionText = "Welches virale Enzym ist entscheidend für den Replikationszyklus von Retroviren wie HIV?",
        answerA = "RNA-abhängige RNA-Polymerase (RdRp), die virale RNA direkt repliziert",
        answerB = "Reverse Transkriptase, die virale ssRNA in doppelsträngige DNA umschreibt",
        answerC = "Helicase, die die doppelsträngige Wirtszell-DNA für die Integration entwindet",
        answerD = "Neuraminidase, die neue Virionen von der Zelloberfläche ablöst",
        correctAnswer = 1, // B
        explanation = "Retroviren (z.B. HIV) tragen die Reverse Transkriptase (RT), die als RNA-abhängige DNA-Polymerase das virale ssRNA-Genom in cDNA umschreibt: ssRNA → RNA:DNA-Hybrid → dsDNA. Die dsDNA wird durch Integrase in das Wirtsgenom eingebaut (Provirus). RT hat keine Korrekturlesefunktion, was zu hoher Mutationsrate (~10⁻⁴ pro Nukleotid/Replikation) und viraler Evolution führt. RT ist Zielstruktur wichtiger Antiretroviralika (NRTI, NNRTI).",
        difficulty = 3,
        funFact = "Das HIV-Genom von ~9.700 Nukleotiden kodiert für 9 Gene — eine erstaunliche Informationsdichte, die durch alternatives Splicing, überlappende Leserahmen und transaktive Regulatoren erzielt wird."
    ),

    // Question 42 – Virology: mRNA Vaccine Mechanism
    Question(
        categoryId = 2,
        questionText = "Welche Modifikation der mRNA in COVID-19-Impfstoffen erhöht Stabilität und vermindert Immunogenität?",
        answerA = "Methylierung der 5'-Cap-Struktur und Polyadenosylierung des 3'-Endes",
        answerB = "Ersatz von Uridin durch N1-Methylpseudouridin (m1Ψ) in der mRNA-Sequenz",
        answerC = "Verwendung zirkulärer RNA-Strukturen ohne 5'-Cap oder 3'-Poly-A-Schwanz",
        answerD = "Enkapsulierung in Proteinvesikel anstatt in Lipidnanopartikel",
        correctAnswer = 1, // B
        explanation = "Katalin Karikó und Drew Weissman (Nobelpreis 2023) entdeckten, dass Uridin durch N1-Methylpseudouridin (m1Ψ) ersetzt werden kann. Modifizierte mRNA wird von Toll-like-Rezeptoren (TLR7/8) schlechter erkannt, was die angeborene Immunantwort reduziert und die Translationseffizienz erhöht. Zusätzlich sind 5'-Cap (Cap1), optimierte 5'/3'-UTRs und Codon-Optimierung entscheidend für die Wirksamkeit der mRNA-Impfstoffe (BNT162b2, mRNA-1273).",
        difficulty = 3,
        funFact = "Karikó arbeitete jahrzehntelang ohne Drittmittel und wurde mehrfach degradiert, weil niemand an das Potenzial von mRNA-Therapien glaubte. 2023 erhielt sie den Nobelpreis für Physiologie oder Medizin."
    ),

    // Question 43 – Virology: Viral Mutations
    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Quasispezies-Theorie in der Virologie?",
        answerA = "Die Klassifizierung von Viren in verschiedene Spezies nach morphologischen Kriterien",
        answerB = "Eine Viruspopulation als eine Wolke genetisch verwandter Varianten um eine Mastersequenz",
        answerC = "Die Entstehung neuer Virusspezies durch interspezifische Übertragung (Zoonose)",
        answerD = "Den Mechanismus der RNA-Reparatur durch virale Exonukleasen",
        correctAnswer = 1, // B
        explanation = "Die Quasispezies-Theorie (Eigen & Biebricher) beschreibt RNA-Virus-Populationen nicht als einheitliche Genotypen, sondern als Schwarm (cloud) aus vielen genetisch ähnlichen aber unterschiedlichen Varianten. Mutationsraten von RNA-Viren (~10⁻⁴–10⁻⁵ pro Nukleotid pro Replikation) liegen nahe an der Fehler­schwelle. Die dominante Mastersequenz ist von einem Mutationsspektrum umgeben. Dies ermöglicht schnelle Anpassung, erklärt Immunevasion und hat Konsequenzen für antivirale Therapiestrategien.",
        difficulty = 3,
        funFact = null
    ),

    // Question 44 – Virology: Antigenic Shift/Drift
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet den Antigenic Shift vom Antigenic Drift bei Influenzaviren?",
        answerA = "Antigenic Drift: abrupter Austausch ganzer RNA-Segmente; Antigenic Shift: graduelle Punktmutationen",
        answerB = "Antigenic Shift: abrupte Neukombination ganzer Gensegmente; Antigenic Drift: graduelle Mutation einzelner Antigen-Gene",
        answerC = "Beide Begriffe sind Synonyme für virale Antigenveränderungen unterschiedlichen Ausmaßes",
        answerD = "Antigenic Shift betrifft nur das Hämagglutinin, Antigenic Drift nur die Neuraminidase",
        correctAnswer = 1, // B
        explanation = "Antigenic Drift bezeichnet graduelle Punktmutationen in den Genen für Hämagglutinin (HA) und Neuraminidase (NA), die schrittweise Veränderungen der Antigenität bewirken — Grund für jährliche Grippeimpfungen. Antigenic Shift ist ein abruptes Reassortment ganzer RNA-Segmente beim simultanen Infizieren einer Zelle mit zwei verschiedenen Influenzastämmen (z.B. menschlicher + Schweine-Influenza) — verantwortlich für Pandemien (1918, 1957, 1968, 2009).",
        difficulty = 3,
        funFact = "Die Spanische Grippe 1918 tötete mehr Menschen als der Erste Weltkrieg — schätzungsweise 50–100 Millionen Menschen. Der Pandemievirus war ein neuartiger H1N1-Stamm durch Antigenic Shift."
    ),

    // Question 45 – Virology: Prion Structure
    Question(
        categoryId = 2,
        questionText = "Wie unterscheidet sich das Prion-Protein PrP^Sc vom normalen zellulären PrP^C?",
        answerA = "PrP^Sc besitzt eine andere Aminosäuresequenz als PrP^C",
        answerB = "PrP^Sc hat erhöhten β-Faltblatt-Anteil (vermindertes α-Helix) und ist protease-resistent und unlöslich",
        answerC = "PrP^Sc enthält eine Nucleinsäure als Kofaktor, die PrP^C fehlt",
        answerD = "PrP^Sc wird von einem anderen Gen kodiert als PrP^C",
        correctAnswer = 1, // B
        explanation = "Normales PrP^C enthält ~40% α-Helix und ~3% β-Faltblatt, ist löslich und proteasesensitiv. Die pathologische Isoform PrP^Sc hat ~30% α-Helix aber ~43% β-Faltblatt — gleiche Primärstruktur (kodiert vom selben PRNP-Gen), aber radikal andere 3D-Faltung. PrP^Sc ist unlöslich, protease-resistent und induziert konformative Umfaltung von PrP^C (Template-assoziierte Misfolding). Prionen verursachen TSEs: Scrapie (Schaf), BSE (Rind), CJD (Mensch).",
        difficulty = 3,
        funFact = "Stanley Prusiner erhielt 1997 den Nobelpreis für die Entdeckung der Prionen — und überwand dabei heftigen wissenschaftlichen Widerstand, da das Konzept eines infektiösen Proteins ohne Nucleinsäure das damalige Paradigma revolutionierte."
    ),

    // Question 46 – Biochemistry: Krebs Cycle
    Question(
        categoryId = 2,
        questionText = "Welches Enzym des Citratzyklus katalysiert den geschwindigkeitsbestimmenden Schritt und durch welche Effektoren wird es reguliert?",
        answerA = "Pyruvatdehydrogenase; gehemmt durch AMP, aktiviert durch NADH",
        answerB = "Isocitratdehydrogenase; aktiviert durch ADP und Ca²⁺, gehemmt durch NADH und ATP",
        answerC = "Succinyl-CoA-Synthetase; reguliert durch das GTP/GDP-Verhältnis",
        answerD = "Citrat-Synthase; ausschließlich durch Substratkonzentration (Oxalacetat) reguliert",
        correctAnswer = 1, // B
        explanation = "Die Isocitrat-Dehydrogenase (IDH) katalysiert die erste oxidative Decarboxylierung im Citratzyklus (Isocitrat → α-Ketoglutarat + CO₂ + NADH) und ist ein Hauptregulationspunkt. ADP und Ca²⁺ (allosterische Aktivatoren) signalisieren niedrigen Energiestatus und hohe metabolische Aktivität; NADH und ATP hemmen das Enzym, wenn Energie ausreichend ist. IDH-Mutationen sind zudem häufig in Gliomen und AML.",
        difficulty = 3,
        funFact = "Der Citratzyklus wurde von Hans Krebs 1937 aufgeklärt — für seine Entdeckung erhielt er 1953 den Nobelpreis. Sein entsprechendes Manuskript wurde zuvor vom Journal Nature abgelehnt."
    ),

    // Question 47 – Biochemistry: Oxidative Phosphorylation
    Question(
        categoryId = 2,
        questionText = "Wie viele ATP-Moleküle werden pro NADH-Molekül in der oxidativen Phosphorylierung theoretisch synthetisiert?",
        answerA = "Genau 3 ATP (P/O-Quotient = 3, stöchiometrisch exakt)",
        answerB = "~2,5 ATP (nicht-ganzzahlig, da Protonentransport und ATP-Synthase-Stöchiometrie nicht perfekt passen)",
        answerC = "Genau 2 ATP (P/O-Quotient = 2, entspricht FADH₂-Wert)",
        answerD = "38 ATP pro NADH (Gesamtausbeute eines Glukosemoleküls)",
        correctAnswer = 1, // B
        explanation = "Der klassische Wert von 3 ATP/NADH war eine Vereinfachung. Moderne Messungen ergeben ~2,5 ATP/NADH und ~1,5 ATP/FADH₂. NADH-Oxidation pumpt 10 H⁺ über die innere Mitochondrienmembran. Die ATP-Synthase benötigt ~3,67 H⁺/ATP (bei 10 c-Untereinheiten im F₀-Ring, 3 β-Untereinheiten). Zusätzlicher H⁺-Verbrauch durch ADP/ATP-Antiporter und Phosphat-Transporter reduziert die Netto-Ausbeute auf ~2,5 ATP/NADH.",
        difficulty = 3,
        funFact = null
    ),

    // Question 48 – Biochemistry: Protein Folding Chaperones
    Question(
        categoryId = 2,
        questionText = "Welche Funktion übernimmt das Chaperonin GroEL/GroES (Hsp60/Hsp10) bei der Proteinfaltung?",
        answerA = "Es erkennt und entfaltet bereits gefaltete Proteine für den proteasomalen Abbau",
        answerB = "Es stellt eine isolierte hydrophobe Kavität bereit, in der ungefaltete Proteine ATP-abhängig falten können",
        answerC = "Es kovalent verknüpft Cysteinreste zur Disulfidbrückenbildung in Membranproteinen",
        answerD = "Es katalysiert die Isomerisierung von Prolin-Peptidbindungen in nascenten Polypeptiden",
        correctAnswer = 1, // B
        explanation = "GroEL ist ein Barrel-förmiger Komplex aus zwei übereinander gestapelten Ringen mit je 7 Untereinheiten. Der Hohlraum (~85 kDa Kapazität) bindet hydrophobe, ungefaltete Substrate. GroES-Bindung und ATP-Hydrolyse treiben Konformationsänderungen, die den Hohlraum kapseln und der Substrat ermöglichen, in einer hydrophilen Umgebung ohne Aggregationsrisiko zu falten. Der Zyklus dauert ~10–15 Sekunden und kann mehrfach wiederholt werden.",
        difficulty = 3,
        funFact = "Ohne Chaperone würden viele Proteine in der Zelle aggregieren statt zu falten — besonders unter Hitzestress. Deswegen werden Hsp60/Hsp70 als 'Hitzeschockproteine' bezeichnet: Ihre Expression steigt stark bei Temperaturstress."
    ),

    // Question 49 – Biochemistry: Lipid Rafts
    Question(
        categoryId = 2,
        questionText = "Was sind Lipid Rafts (Membranflösse) in der Plasmamembran und welche Funktion haben sie?",
        answerA = "Starre Membranbereiche aus Ceramid, die Signalproteine permanent binden und inaktivieren",
        answerB = "Dynamische Mikrodomainen mit hohem Cholesterin- und Sphingolipidgehalt, die Signalproteine konzentrieren",
        answerC = "Membranvesikel, die für den intrazellulären Proteintransport zwischen ER und Golgi zuständig sind",
        answerD = "Transmembranporen aus Porinproteinen, die den selektiven Ionentransport ermöglichen",
        correctAnswer = 1, // B
        explanation = "Lipid Rafts sind laterale Mikrodomainen (~10–200 nm) in der äußeren Halbschicht der Plasmamembran, die durch enge Packung von Sphingolipiden und Cholesterin eine geordnete Flüssigphase (L_o) bilden. Sie konzentrieren GPI-verankerte Proteine und bestimmte Rezeptortyrosinkinasen und dienen als Plattformen für Signaltransduktion (z.B. T-Zell-Rezeptor-Signaling), Endozytose und Virusinfektion (HIV nutzt Rafts für den Zellein- und -austritt).",
        difficulty = 3,
        funFact = null
    ),

    // Question 50 – Biochemistry: Signal Amplification
    Question(
        categoryId = 2,
        questionText = "Wie erzielt die cAMP-PKA-Signalkaskade eine Signalamplifikation ausgehend von einem einzelnen Hormonmolekül?",
        answerA = "Ein Hormonmolekül bindet irreversibel an den Rezeptor, der dauerhaft aktiv bleibt",
        answerB = "Durch kaskadenartige Enzymaktivierung: 1 Rezeptor aktiviert viele G-Proteine, jede Adenylat-Cyclase produziert viele cAMP, jede PKA phosphoryliert viele Substrate",
        answerC = "Das Hormon wird intrazellulär gespeichert und langsam über Stunden freigesetzt",
        answerD = "Positive Rückkopplung durch Autoaktivierung der PKA bei niedrigen cAMP-Konzentrationen",
        correctAnswer = 1, // B
        explanation = "Die Signalamplifikation in der cAMP-PKA-Kaskade funktioniert stufenweise: (1) 1 Hormon aktiviert 1 GPCR, der viele G_s-Proteine aktiviert; (2) jede aktivierte Adenylat-Cyclase produziert viele cAMP-Moleküle; (3) cAMP aktiviert viele PKA-Tetramere durch Lösung der regulatorischen R-Untereinheiten; (4) jede PKA-Katalysuntereinheit phosphoryliert viele Substrate. Das Ergebnis: Ein einzelnes Adrenalinmolekül kann die Freisetzung von Millionen Glukosemolekülen auslösen (Glykogenolyse in der Leber).",
        difficulty = 3,
        funFact = "Adrenalin wurde 1901 von Jōkichi Takamine als erstes Hormon in reiner Form isoliert. Die Entschlüsselung seiner intrazellulären Signalkaskade (zweiter Botenstoff cAMP) brachte Earl Sutherland 1971 den Nobelpreis."
    )
)
