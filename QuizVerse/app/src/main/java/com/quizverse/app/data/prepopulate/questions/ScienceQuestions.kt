package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestions(): List<Question> = listOf(

    // ── EASY (difficulty = 1) ─────────────────────────────────────────────────

    Question(
        categoryId = 2,
        questionText = "Welches Gas macht den größten Anteil der Erdatmosphäre aus?",
        answerA = "Sauerstoff",
        answerB = "Kohlendioxid",
        answerC = "Stickstoff",
        answerD = "Wasserstoff",
        correctAnswer = 2,
        explanation = "Stickstoff (N₂) macht etwa 78 % der Erdatmosphäre aus, Sauerstoff etwa 21 %.",
        difficulty = 1,
        funFact = "Obwohl Pflanzen Kohlendioxid aufnehmen, besteht die Luft nur zu 0,04 % daraus."
    ),

    Question(
        categoryId = 2,
        questionText = "Wie viele Knochen hat ein erwachsener Mensch?",
        answerA = "206",
        answerB = "215",
        answerC = "198",
        answerD = "230",
        correctAnswer = 0,
        explanation = "Ein erwachsener Mensch hat genau 206 Knochen. Neugeborene haben etwa 270–300, da sich viele Knochen im Laufe des Lebens zusammenschließen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist das chemische Symbol für Gold?",
        answerA = "Go",
        answerB = "Gd",
        answerC = "Ag",
        answerD = "Au",
        correctAnswer = 3,
        explanation = "Das Symbol Au kommt vom lateinischen Wort 'Aurum', was Gold bedeutet.",
        difficulty = 1,
        funFact = "Gold ist so dehnbar, dass man aus einem Gramm einen Draht von 2,5 km Länge ziehen kann."
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Organ produziert beim Menschen Insulin?",
        answerA = "Leber",
        answerB = "Niere",
        answerC = "Bauchspeicheldrüse",
        answerD = "Milz",
        correctAnswer = 2,
        explanation = "Die Bauchspeicheldrüse (Pankreas) produziert das Hormon Insulin, das den Blutzuckerspiegel reguliert.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist die Einheit der elektrischen Spannung?",
        answerA = "Ampere",
        answerB = "Watt",
        answerC = "Ohm",
        answerD = "Volt",
        correctAnswer = 3,
        explanation = "Die elektrische Spannung wird in Volt (V) gemessen, benannt nach Alessandro Volta.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welcher Planet ist der Sonne am nächsten?",
        answerA = "Venus",
        answerB = "Merkur",
        answerC = "Mars",
        answerD = "Erde",
        correctAnswer = 1,
        explanation = "Merkur ist mit einer durchschnittlichen Entfernung von ca. 58 Millionen km der sonnennächste Planet.",
        difficulty = 1,
        funFact = "Trotz seiner Sonnennähe ist Merkur nicht der heißeste Planet – das ist Venus, wegen ihres dichten Treibhauseffekts."
    ),

    Question(
        categoryId = 2,
        questionText = "Aus welchem Element besteht Wasser hauptsächlich?",
        answerA = "Nur Sauerstoff",
        answerB = "Nur Wasserstoff",
        answerC = "Wasserstoff und Sauerstoff",
        answerD = "Wasserstoff und Stickstoff",
        correctAnswer = 2,
        explanation = "Wasser (H₂O) besteht aus zwei Wasserstoffatomen und einem Sauerstoffatom.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist Photosynthese?",
        answerA = "Die Atmung von Tieren",
        answerB = "Die Umwandlung von Licht in chemische Energie durch Pflanzen",
        answerC = "Die Verdauung von Nährstoffen",
        answerD = "Der Transport von Wasser in Pflanzen",
        correctAnswer = 1,
        explanation = "Bei der Photosynthese wandeln Pflanzen Lichtenergie, Wasser und CO₂ in Glukose und Sauerstoff um.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welches ist das leichteste Element im Periodensystem?",
        answerA = "Helium",
        answerB = "Lithium",
        answerC = "Wasserstoff",
        answerD = "Bor",
        correctAnswer = 2,
        explanation = "Wasserstoff (H) ist das erste und leichteste Element mit der Ordnungszahl 1.",
        difficulty = 1,
        funFact = "Wasserstoff ist das häufigste Element im Universum und macht etwa 75 % der normalen Materie aus."
    ),

    Question(
        categoryId = 2,
        questionText = "Wie schnell bewegt sich Licht im Vakuum?",
        answerA = "Etwa 300.000 km/s",
        answerB = "Etwa 150.000 km/s",
        answerC = "Etwa 500.000 km/s",
        answerD = "Etwa 100.000 km/s",
        correctAnswer = 0,
        explanation = "Licht bewegt sich im Vakuum mit genau 299.792.458 m/s, also rund 300.000 km/s.",
        difficulty = 1,
        funFact = "Mit Lichtgeschwindigkeit würde man die Erde in etwa 0,13 Sekunden einmal umrunden."
    ),

    // ── MEDIUM (difficulty = 2) ───────────────────────────────────────────────

    Question(
        categoryId = 2,
        questionText = "Welche Blutgruppe wird als 'universeller Spender' bezeichnet?",
        answerA = "AB positiv",
        answerB = "A negativ",
        answerC = "0 negativ",
        answerD = "B positiv",
        correctAnswer = 2,
        explanation = "0 negativ (Rh-) enthält keine A-, B- oder Rh-Antigene und kann daher an alle Blutgruppen gespendet werden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt das zweite Newtonsche Gesetz?",
        answerA = "Jede Wirkung hat eine gleiche und entgegengesetzte Reaktion",
        answerB = "Kraft ist gleich Masse mal Beschleunigung",
        answerC = "Ein Körper in Ruhe bleibt in Ruhe",
        answerD = "Energie bleibt immer erhalten",
        correctAnswer = 1,
        explanation = "Das zweite Newtonsche Gesetz besagt: F = m × a (Kraft = Masse × Beschleunigung).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Wie viele Chromosomen hat eine normale menschliche Körperzelle?",
        answerA = "23",
        answerB = "46",
        answerC = "48",
        answerD = "44",
        correctAnswer = 1,
        explanation = "Menschliche Körperzellen haben 46 Chromosomen (23 Paare). Keimzellen (Spermien, Eizellen) haben nur 23.",
        difficulty = 2,
        funFact = "Menschen teilen etwa 98,7 % ihrer DNA mit Schimpansen."
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Mineral ist das härteste in der Mohs-Skala?",
        answerA = "Rubin",
        answerB = "Korund",
        answerC = "Diamant",
        answerD = "Quarz",
        correctAnswer = 2,
        explanation = "Diamant hat den Härtegrad 10 auf der Mohs-Skala und ist das härteste natürlich vorkommende Mineral.",
        difficulty = 2,
        funFact = "Diamant ist eine Form von reinem Kohlenstoff – derselbe Stoff, aus dem auch Bleistiftmine (Graphit) besteht."
    ),

    Question(
        categoryId = 2,
        questionText = "Welche Säure befindet sich im Magensaft des Menschen?",
        answerA = "Schwefelsäure",
        answerB = "Essigsäure",
        answerC = "Salzsäure",
        answerD = "Salpetersäure",
        correctAnswer = 2,
        explanation = "Der Magensaft enthält Salzsäure (HCl) mit einem pH-Wert zwischen 1,5 und 3,5.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen einer Arterie und einer Vene?",
        answerA = "Arterien führen Blut zum Herz, Venen vom Herz weg",
        answerB = "Arterien führen Blut vom Herz weg, Venen zum Herz hin",
        answerC = "Arterien tragen nur sauerstoffreiches, Venen nur sauerstoffarmes Blut",
        answerD = "Es gibt keinen Unterschied",
        correctAnswer = 1,
        explanation = "Arterien führen Blut vom Herzen weg (in der Regel sauerstoffreich), Venen führen es zum Herzen zurück.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Phänomen erklärt, warum der Himmel blau ist?",
        answerA = "Reflexion am Ozean",
        answerB = "Rayleigh-Streuung",
        answerC = "Brechung des Sonnenlichts",
        answerD = "Ozonabsorption",
        correctAnswer = 1,
        explanation = "Die Rayleigh-Streuung beschreibt, wie kurzwelliges (blaues) Licht stärker an Luftmolekülen gestreut wird als langwelliges (rotes).",
        difficulty = 2,
        funFact = "Bei Sonnenuntergang erscheint der Himmel rot, weil das Licht einen längeren Weg durch die Atmosphäre zurücklegt."
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Element hat die Ordnungszahl 6?",
        answerA = "Stickstoff",
        answerB = "Sauerstoff",
        answerC = "Kohlenstoff",
        answerD = "Bor",
        correctAnswer = 2,
        explanation = "Kohlenstoff (C) hat die Ordnungszahl 6 und ist die Grundlage aller organischen Verbindungen.",
        difficulty = 2,
        funFact = "Kohlenstoff ist nach Sauerstoff, Silizium und Aluminium das vierthäufigste Element in der Erdkruste."
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist die Halbwertszeit eines radioaktiven Elements?",
        answerA = "Die Zeit, bis das Element vollständig zerfallen ist",
        answerB = "Die Zeit, in der die Hälfte der Atome zerfallen ist",
        answerC = "Die Zeit, bis die Strahlung halbiert wird",
        answerD = "Die Zeit, bis das Element stabil wird",
        correctAnswer = 1,
        explanation = "Die Halbwertszeit ist der Zeitraum, nach dem die Hälfte der ursprünglichen Menge eines radioaktiven Isotops zerfallen ist.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welcher Prozess findet in den Mitochondrien statt?",
        answerA = "Proteinbiosynthese",
        answerB = "Photosynthese",
        answerC = "Zellatmung (ATP-Produktion)",
        answerD = "DNA-Replikation",
        correctAnswer = 2,
        explanation = "In den Mitochondrien findet die aerobe Zellatmung statt, bei der ATP (Adenosintriphosphat) als Energieträger produziert wird.",
        difficulty = 2,
        funFact = "Mitochondrien haben eine eigene DNA und waren ursprünglich eigenständige Bakterien."
    ),

    Question(
        categoryId = 2,
        questionText = "Welche Kraft hält Elektronen in ihrer Bahn um den Atomkern?",
        answerA = "Gravitationskraft",
        answerB = "Elektromagnetische Kraft",
        answerC = "Starke Kernkraft",
        answerD = "Schwache Kernkraft",
        correctAnswer = 1,
        explanation = "Die elektromagnetische Kraft (Coulomb-Kraft) zwischen dem positiv geladenen Kern und den negativ geladenen Elektronen hält diese in ihrer Bahn.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist die Funktion des Chlorophylls in Pflanzen?",
        answerA = "Wasseraufnahme",
        answerB = "Absorption von Lichtenergie für die Photosynthese",
        answerC = "Nährstofftransport",
        answerD = "Schutz vor Schädlingen",
        correctAnswer = 1,
        explanation = "Chlorophyll ist das grüne Pigment in Pflanzen, das Lichtenergie absorbiert und für die Photosynthese nutzt.",
        difficulty = 2,
        funFact = "Chlorophyll absorbiert hauptsächlich rotes und blaues Licht, aber kaum grünes – deshalb erscheinen Pflanzen grün."
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Gesetz beschreibt die Beziehung zwischen Druck und Volumen eines Gases bei konstanter Temperatur?",
        answerA = "Gesetz von Avogadro",
        answerB = "Gesetz von Gay-Lussac",
        answerC = "Gesetz von Boyle-Mariotte",
        answerD = "Gesetz von Charles",
        correctAnswer = 2,
        explanation = "Das Gesetz von Boyle-Mariotte besagt: Bei konstanter Temperatur ist das Produkt aus Druck und Volumen eines idealen Gases konstant (p × V = const).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welches ist das häufigste Element in der Erdkruste?",
        answerA = "Silizium",
        answerB = "Eisen",
        answerC = "Aluminium",
        answerD = "Sauerstoff",
        correctAnswer = 3,
        explanation = "Sauerstoff macht etwa 46 % der Erdkruste aus (meist in Verbindung mit anderen Elementen wie SiO₂).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was versteht man unter dem 'Treibhauseffekt'?",
        answerA = "Die Erwärmung von Gewächshäusern durch Sonnenlicht",
        answerB = "Die Erwärmung der Erdoberfläche durch Infrarotstrahlung absorbierende Gase",
        answerC = "Den Abbau der Ozonschicht durch UV-Strahlung",
        answerD = "Den Temperaturunterschied zwischen Tag und Nacht",
        correctAnswer = 1,
        explanation = "Treibhausgase wie CO₂ und Methan absorbieren die von der Erde abgestrahlte Infrarotstrahlung und geben sie zurück, was die Atmosphäre erwärmt.",
        difficulty = 2,
        funFact = "Ohne natürlichen Treibhauseffekt wäre die durchschnittliche Temperatur der Erde bei ca. -18 °C statt +15 °C."
    ),

    // ── HARD (difficulty = 3) ─────────────────────────────────────────────────

    Question(
        categoryId = 2,
        questionText = "Welches Enzym ist für die DNA-Replikation verantwortlich?",
        answerA = "RNA-Polymerase",
        answerB = "DNA-Polymerase",
        answerC = "Ligase",
        answerD = "Restriktionsendonuklease",
        correctAnswer = 1,
        explanation = "Die DNA-Polymerase synthetisiert neue DNA-Stränge, indem sie die komplementären Nucleotide an den Matrizenstrang anfügt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Pauli-Ausschlussprinzip?",
        answerA = "Keine zwei Elektronen können denselben Quantenzustand einnehmen",
        answerB = "Elektronen bewegen sich auf festen Kreisbahnen um den Kern",
        answerC = "Licht verhält sich gleichzeitig als Welle und Teilchen",
        answerD = "Die Energie eines Photons ist proportional seiner Frequenz",
        correctAnswer = 0,
        explanation = "Das Pauli-Ausschlussprinzip besagt, dass keine zwei Fermionen (z. B. Elektronen) gleichzeitig denselben vollständigen Quantenzustand einnehmen können.",
        difficulty = 3,
        funFact = "Dieses Prinzip erklärt die Stabilität der Materie und die Struktur des Periodensystems."
    ),

    Question(
        categoryId = 2,
        questionText = "Welche Strahlung hat die höchste Energie?",
        answerA = "Gammastrahlung",
        answerB = "Röntgenstrahlung",
        answerC = "Ultraviolettstrahlung",
        answerD = "Infrarotstrahlung",
        correctAnswer = 0,
        explanation = "Gammastrahlung hat die kürzeste Wellenlänge und damit die höchste Energie im elektromagnetischen Spektrum.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Wie lautet die chemische Formel für Schwefelsäure?",
        answerA = "H₂SO₃",
        answerB = "HNO₃",
        answerC = "H₃PO₄",
        answerD = "H₂SO₄",
        correctAnswer = 3,
        explanation = "Schwefelsäure hat die Formel H₂SO₄. Sie ist eine der wichtigsten Industriechemikalien weltweit.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist ein Neutrino?",
        answerA = "Ein neutrales Baryon",
        answerB = "Ein elektrisch neutrales Lepton mit sehr kleiner Masse",
        answerC = "Ein Quark mit neutraler Ladung",
        answerD = "Ein radioaktives Zerfallsprodukt von Neutronen",
        correctAnswer = 1,
        explanation = "Neutrinos sind elektrisch neutrale Elementarteilchen aus der Leptonenfamilie mit extrem kleiner, aber nicht null Masse.",
        difficulty = 3,
        funFact = "Jede Sekunde passieren Billionen von Neutrinos von der Sonne ungehindert durch jeden Quadratzentimeter deines Körpers."
    ),

    Question(
        categoryId = 2,
        questionText = "Welche Gesteinsart entsteht durch Erstarrung von Magma?",
        answerA = "Sedimentgestein",
        answerB = "Metamorphes Gestein",
        answerC = "Magmatisches Gestein",
        answerD = "Organisches Gestein",
        correctAnswer = 2,
        explanation = "Magmatisches Gestein (Igneit) entsteht durch die Erstarrung von Magma, entweder an der Oberfläche (Vulkanit) oder in der Tiefe (Plutonit).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist CRISPR-Cas9?",
        answerA = "Ein Antibiotikum gegen Viren",
        answerB = "Ein Werkzeug zur gezielten Bearbeitung von DNA-Sequenzen",
        answerC = "Eine Methode zur Herstellung von Stammzellen",
        answerD = "Ein Protein zur Immunabwehr",
        correctAnswer = 1,
        explanation = "CRISPR-Cas9 ist ein molekulares 'Genscherensystem', das präzise Veränderungen im Erbgut von Lebewesen ermöglicht.",
        difficulty = 3,
        funFact = "Das System wurde ursprünglich als Teil des Immunsystems von Bakterien gegen Viren entdeckt."
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Heisenbergsche Unschärferelation?",
        answerA = "Die Geschwindigkeit eines Teilchens ist immer ungenau messbar",
        answerB = "Ort und Impuls eines Teilchens können nicht gleichzeitig beliebig genau bestimmt werden",
        answerC = "Die Energie eines Quantensystems ist unbestimmt",
        answerD = "Teilchen können sich nicht schneller als Licht bewegen",
        correctAnswer = 1,
        explanation = "Die Heisenbergsche Unschärferelation besagt: Δx · Δp ≥ ℏ/2 – je genauer der Ort, desto ungenauer der Impuls und umgekehrt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Protein ist hauptsächlich für den Sauerstofftransport im Blut verantwortlich?",
        answerA = "Albumin",
        answerB = "Fibrinogen",
        answerC = "Hämoglobin",
        answerD = "Globulin",
        correctAnswer = 2,
        explanation = "Hämoglobin ist ein eisenhaltiges Protein in roten Blutkörperchen, das Sauerstoff reversibel binden und transportieren kann.",
        difficulty = 3,
        funFact = "Ein einzelnes Hämoglobin-Molekül kann vier Sauerstoffmoleküle gleichzeitig tragen."
    ),

    Question(
        categoryId = 2,
        questionText = "Wie wird der pH-Wert einer Lösung definiert?",
        answerA = "Als die Konzentration von OH⁻-Ionen",
        answerB = "Als der negative dekadische Logarithmus der H₃O⁺-Konzentration",
        answerC = "Als die Anzahl der Protonen pro Liter",
        answerD = "Als die elektrische Leitfähigkeit der Lösung",
        correctAnswer = 1,
        explanation = "pH = -log₁₀[H₃O⁺]. Ein pH unter 7 ist sauer, über 7 basisch, genau 7 ist neutral.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist die Schwarzschild-Radius?",
        answerA = "Der Radius, ab dem ein Stern zur Supernova wird",
        answerB = "Der kritische Radius, unterhalb dessen ein Objekt zu einem Schwarzen Loch kollabiert",
        answerC = "Die maximale Ausdehnung einer Neutronensternhülle",
        answerD = "Der Abstand zwischen einem Schwarzen Loch und seinem nächsten Stern",
        correctAnswer = 1,
        explanation = "Der Schwarzschild-Radius ist der Radius, unterhalb dessen die Fluchtgeschwindigkeit die Lichtgeschwindigkeit übersteigt – das Objekt wird zum Schwarzen Loch.",
        difficulty = 3,
        funFact = "Für die Erde beträgt der Schwarzschild-Radius nur etwa 9 mm."
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Phänomen erklärt die kontinentale Verschiebung?",
        answerA = "Erdmagnetismus",
        answerB = "Plattentektonik",
        answerC = "Isostasie",
        answerD = "Konvektion im äußeren Erdkern",
        correctAnswer = 1,
        explanation = "Die Plattentektonik beschreibt die Bewegung der Lithosphärenplatten, angetrieben durch Konvektionsströmungen im Erdmantel.",
        difficulty = 3,
        funFact = "Europa und Amerika entfernen sich pro Jahr um etwa 2–3 cm – in etwa so schnell, wie Fingernägel wachsen."
    ),

    // ── EXPERT (difficulty = 4) ───────────────────────────────────────────────

    Question(
        categoryId = 2,
        questionText = "Was beschreibt die Schrödinger-Gleichung?",
        answerA = "Die klassische Bewegung von Teilchen in einem elektrischen Feld",
        answerB = "Die Zeitentwicklung der Wellenfunktion eines Quantensystems",
        answerC = "Die Beziehung zwischen Energie und Masse in der Relativitätstheorie",
        answerD = "Die Verteilung von Elektronen in chemischen Bindungen",
        correctAnswer = 1,
        explanation = "Die Schrödinger-Gleichung ist die zentrale Gleichung der Quantenmechanik: iℏ ∂Ψ/∂t = ĤΨ. Sie beschreibt, wie sich Quantenzustände zeitlich entwickeln.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen mRNA und tRNA?",
        answerA = "mRNA ist doppelsträngig, tRNA einzelsträngig",
        answerB = "mRNA trägt die Proteinbauanleitung, tRNA transportiert Aminosäuren zum Ribosom",
        answerC = "mRNA befindet sich nur im Zellkern, tRNA nur im Zytoplasma",
        answerD = "Sie unterscheiden sich nur in der Länge",
        correctAnswer = 1,
        explanation = "mRNA (Boten-RNA) überträgt die genetische Information vom Zellkern zum Ribosom. tRNA (Transfer-RNA) bringt die passenden Aminosäuren zur Proteinsynthese.",
        difficulty = 4,
        funFact = "Es gibt 20 verschiedene Aminosäuren und über 60 verschiedene tRNA-Typen."
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt das Konzept der 'chemischen Elektronegativität'?",
        answerA = "Die Fähigkeit eines Atoms, Elektronen bei einer chemischen Bindung anzuziehen",
        answerB = "Die negative Ladung eines Ions in Lösung",
        answerC = "Die Anzahl der Valenzelektronen eines Elements",
        answerD = "Die Affinität eines Atoms gegenüber Protonen",
        correctAnswer = 0,
        explanation = "Elektronegativität (nach Pauling) beschreibt die relative Fähigkeit eines Atoms, Elektronen in einer kovalenten Bindung anzuziehen. Fluor hat die höchste EN (3,98).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Welches Konzept beschreibt die 'epigenetische Vererbung'?",
        answerA = "Vererbung durch Veränderungen der DNA-Sequenz selbst",
        answerB = "Vererbung von Merkmalen durch chemische Modifikationen der DNA oder Histone ohne Änderung der Sequenz",
        answerC = "Horizontaler Gentransfer zwischen verschiedenen Arten",
        answerD = "Rekombination von Genen während der Meiose",
        correctAnswer = 1,
        explanation = "Epigenetische Vererbung umfasst vererbbare Genregulationsänderungen (z. B. DNA-Methylierung, Histonmodifikation) ohne Veränderung der eigentlichen DNA-Sequenz.",
        difficulty = 4,
        funFact = "Umweltfaktoren wie Ernährung oder Stress können epigenetische Markierungen hinterlassen, die an Nachkommen weitergegeben werden."
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Fusion und Fission in der Kernphysik?",
        answerA = "Fusion verbrennt Atome, Fission kühlt sie ab",
        answerB = "Fusion vereint leichte Kerne, Fission spaltet schwere Kerne",
        answerC = "Fusion erzeugt Gammastrahlung, Fission nur Alphastrahlung",
        answerD = "Fusion findet nur in Sternen statt, Fission nur in Reaktoren",
        correctAnswer = 1,
        explanation = "Kernfusion vereinigt leichte Atomkerne (z. B. Wasserstoff → Helium in Sternen). Kernspaltung (Fission) spaltet schwere Kerne (z. B. Uran-235) in kleinere.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was versteht man unter dem 'Hardy-Weinberg-Gleichgewicht'?",
        answerA = "Das Gleichgewicht zwischen Predatoren und Beutetieren in einem Ökosystem",
        answerB = "Ein Modell, bei dem Allelfrequenzen in einer Population ohne evolutionäre Einflüsse konstant bleiben",
        answerC = "Die Stabilisierung von Proteinfaltungen in einer Zelle",
        answerD = "Das thermodynamische Gleichgewicht in biochemischen Reaktionen",
        correctAnswer = 1,
        explanation = "Das Hardy-Weinberg-Gleichgewicht beschreibt eine ideale Population ohne Mutation, Selektion, Gendrift oder Migration, in der Allelfrequenzen konstant bleiben.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist ein Fermion?",
        answerA = "Ein Teilchen mit ganzzahligem Spin, das dem Bose-Einstein-Statistik folgt",
        answerB = "Ein Teilchen mit halbzahligem Spin, das dem Pauli-Ausschlussprinzip unterliegt",
        answerC = "Ein hypothetisches Teilchen, das Schwerkraft überträgt",
        answerD = "Ein zusammengesetztes Teilchen aus drei Quarks",
        correctAnswer = 1,
        explanation = "Fermionen sind Teilchen mit halbzahligem Spin (1/2, 3/2, ...) und folgen der Fermi-Dirac-Statistik. Beispiele: Elektronen, Quarks, Protonen.",
        difficulty = 4,
        funFact = "Bosonen (ganzzahliger Spin) können denselben Quantenzustand teilen – daher ist ein Laser möglich."
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt die 'allgemeine Relativitätstheorie' von Einstein?",
        answerA = "Die Äquivalenz von Masse und Energie (E=mc²)",
        answerB = "Die Krümmung der Raumzeit durch Masse und Energie",
        answerC = "Das Verhalten von Teilchen nahe der Lichtgeschwindigkeit",
        answerD = "Die Zeitdilatation bei hoher Geschwindigkeit",
        correctAnswer = 1,
        explanation = "Die allgemeine Relativitätstheorie (1915) beschreibt Gravitation als Krümmung der vierdimensionalen Raumzeit durch Masse und Energie.",
        difficulty = 4,
        funFact = "GPS-Satelliten müssen die Vorhersagen der allgemeinen Relativitätstheorie berücksichtigen – sonst wäre die Positionsgenauigkeit täglich um mehrere Kilometer falsch."
    ),

    // ── MASTER (difficulty = 5) ───────────────────────────────────────────────

    Question(
        categoryId = 2,
        questionText = "Was beschreibt die 'Quantenchromodynamik' (QCD)?",
        answerA = "Die Theorie der elektromagnetischen Wechselwirkung zwischen geladenen Teilchen",
        answerB = "Die Quantenfeldtheorie der starken Wechselwirkung zwischen Quarks und Gluonen",
        answerC = "Ein Modell zur Beschreibung von Farbwahrnehmung auf Quantenebene",
        answerD = "Die Vereinigung von Quantenmechanik und allgemeiner Relativitätstheorie",
        correctAnswer = 1,
        explanation = "Die QCD ist die Quantenfeldtheorie der starken Kernkraft. Sie beschreibt, wie Quarks durch Gluonen zusammengehalten werden, wobei 'Farbe' eine Quanteneigenschaft (rot, grün, blau) ist.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist 'Confinement' in der Quantenchromodynamik?",
        answerA = "Die Eigenschaft, dass Quarks nur in gebundenen Zuständen (Hadronen) existieren und nicht isoliert vorkommen können",
        answerB = "Die Einschränkung von Elektronen auf bestimmte Energieniveaus",
        answerC = "Die Begrenzung der Lichtgeschwindigkeit durch die starke Wechselwirkung",
        answerD = "Das Einschluss-Phänomen in Quantencomputern",
        correctAnswer = 0,
        explanation = "Confinement ist das Phänomen, dass freie Quarks niemals beobachtet wurden. Die Stärke der starken Kraft nimmt mit dem Abstand zu, sodass Quarks nie isoliert existieren können.",
        difficulty = 5,
        funFact = "Versucht man, Quarks zu trennen, wird so viel Energie eingebracht, dass neue Quark-Antiquark-Paare entstehen – statt freier Quarks."
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt die 'Chandrasekhar-Grenze'?",
        answerA = "Die maximale Temperatur, bei der ein Stern noch existieren kann",
        answerB = "Die maximale Masse eines weißen Zwergs (~1,4 Sonnenmassen), bevor er kollabiert",
        answerC = "Den minimalen Radius für die Entstehung eines Schwarzen Lochs",
        answerD = "Die Grenzfrequenz, ab der Photonen Materie ionisieren können",
        correctAnswer = 1,
        explanation = "Die Chandrasekhar-Grenze (~1,44 Sonnenmassen) ist die maximale Masse, die ein weißer Zwerg durch den Quantendruck der Elektronen tragen kann. Wird sie überschritten, kollabiert er zu einem Neutronenstern oder explodiert als Supernova.",
        difficulty = 5,
        funFact = "Subrahmanyan Chandrasekhar berechnete diese Grenze 1930 im Alter von 19 Jahren auf dem Schiff von Indien nach England."
    ),

    Question(
        categoryId = 2,
        questionText = "Was ist der 'Casimir-Effekt'?",
        answerA = "Die Emission von Strahlung durch schwarze Körper bei endlicher Temperatur",
        answerB = "Eine anziehende Kraft zwischen zwei parallelen leitenden Platten im Vakuum durch Quantenvakuumfluktuationen",
        answerC = "Die Änderung der Lichtgeschwindigkeit in verschiedenen Medien",
        answerD = "Ein Resonanzphänomen in Supraleitern",
        correctAnswer = 1,
        explanation = "Der Casimir-Effekt ist eine messbare Kraft zwischen nahen Oberflächen im Vakuum, verursacht durch quantenmechanische Nullpunktsenergie des elektromagnetischen Feldes.",
        difficulty = 5,
        funFact = "Der Effekt wurde 1948 theoretisch vorhergesagt und erst 1997 präzise experimentell bestätigt."
    ),

    Question(
        categoryId = 2,
        questionText = "Was beschreibt das 'No-Cloning-Theorem' in der Quanteninformation?",
        answerA = "Es ist unmöglich, zwei identische Quantencomputer zu bauen",
        answerB = "Es ist unmöglich, einen unbekannten Quantenzustand perfekt zu kopieren",
        answerC = "Quantensysteme können nicht von klassischen Systemen simuliert werden",
        answerD = "Verschränkte Teilchen können keine Informationen übertragen",
        correctAnswer = 1,
        explanation = "Das No-Cloning-Theorem (Wootters & Zurek, 1982) besagt, dass es physikalisch unmöglich ist, eine exakte Kopie eines beliebigen unbekannten Quantenzustands herzustellen.",
        difficulty = 5,
        funFact = "Dieses Theorem ist die physikalische Grundlage der Sicherheit von Quantenkryptographie – abgehörte Quanteninformationen hinterlassen immer Spuren."
    )
)
