package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun scienceQuestionsMedium4(): List<Question> = listOf(

    // ── FORENSIC SCIENCE ─────────────────────────────────────────────────────

    // Question 1 – Forensic Science: Fingerprints
    Question(
        categoryId = 2,
        questionText = "Welche chemische Reaktion macht latente Fingerabdrücke auf porösem Papier mit Ninhydrin sichtbar?",
        answerA = "Ninhydrin reagiert mit Lipiden in den Fingerabdrücken und bildet einen blauen Farbstoff",
        answerB = "Ninhydrin reagiert mit Aminosäuren im Schweiß und bildet den violetten Ruhemann-Farbstoff",
        answerC = "Ninhydrin oxidiert das Keratin der Hautschuppen zu einem roten Pigment",
        answerD = "Ninhydrin bindet an DNA-Reste und fluoresziert unter UV-Licht",
        correctAnswer = 1, // B
        explanation = "Ninhydrin reagiert mit primären Aminen – insbesondere den Aminosäuren des Schweißes – und bildet den tiefvioletten Ruhemann-Farbstoff (Diketohydrindylidene-diketohydrindamin). Die Reaktion ist hochempfindlich und eignet sich besonders für ältere Spuren auf Papier.",
        difficulty = 2,
        funFact = "Ninhydrin kann Fingerabdrücke aufdecken, die über 40 Jahre alt sind – vorausgesetzt, das Papier wurde trocken gelagert."
    ),

    // Question 2 – Forensic Science: DNA Profiling
    Question(
        categoryId = 2,
        questionText = "Was sind STRs (Short Tandem Repeats), und warum werden sie in der forensischen DNA-Analyse verwendet?",
        answerA = "STRs sind kurze Proteinsequenzen, die individuell variieren und im Blut nachgewiesen werden",
        answerB = "STRs sind sich wiederholende DNA-Abschnitte, deren Anzahl individuell verschieden ist und damit eindeutige Profile ermöglichen",
        answerC = "STRs sind mitochondriale DNA-Marker, die ausschließlich über die Mutterlinie vererbt werden",
        answerD = "STRs sind Einzelnukleotid-Polymorphismen, die zur Bestimmung der ethnischen Herkunft dienen",
        correctAnswer = 1, // B
        explanation = "Short Tandem Repeats sind kurze DNA-Motive (2–7 Basenpaare), die tandenartig wiederholt werden. Die Anzahl der Wiederholungen variiert stark zwischen Individuen. Durch Kombination mehrerer STR-Loci entsteht ein statistisch nahezu eindeutiges genetisches Profil, das für Identifikation und Verwandtschaftsanalysen genutzt wird.",
        difficulty = 2,
        funFact = null
    ),

    // Question 3 – Forensic Science: Blood Spatter
    Question(
        categoryId = 2,
        questionText = "Wie verändert sich die Form eines Bluttropfens auf einer horizontalen Oberfläche, wenn der Aufprallwinkel von 90° auf 30° sinkt?",
        answerA = "Der Tropfen wird runder und größer",
        answerB = "Der Tropfen wird elliptischer und zeigt einen Ausläufer in Bewegungsrichtung",
        answerC = "Der Tropfen zerspringt in viele kleine Satellitentropfen ohne Richtungsangabe",
        answerD = "Der Tropfen bleibt kreisförmig, aber die Satelliten verteilen sich symmetrisch",
        correctAnswer = 1, // B
        explanation = "Bei einem senkrechten Aufprall (90°) entsteht ein nahezu kreisrunder Fleck. Mit flacher werdendem Winkel wird die Aufprallform zunehmend elliptisch, und es bildet sich ein Ausläufer ('tail') sowie Satellitentropfen in Bewegungsrichtung. Der Exzentrizitätsgrad der Ellipse erlaubt die rechnerische Bestimmung des Aufprallwinkels.",
        difficulty = 2,
        funFact = "Forensiker berechnen den Aufprallwinkel mit arcsin(Breite/Länge) des Blutflecks."
    ),

    // Question 4 – Forensic Science: Forensic Entomology
    Question(
        categoryId = 2,
        questionText = "Welche Insektenart ist für forensische Entomologen bei der Schätzung des Todeszeitpunkts am wichtigsten, und warum?",
        answerA = "Ameisen, weil sie als erste die Leiche besiedeln und präzise Uhrzeiten anzeigen",
        answerB = "Schmeißfliegen (Calliphoridae), weil sie Leichen innerhalb von Minuten besiedeln und ihre Larvenentwicklung temperaturabhängig kalkulierbar ist",
        answerC = "Käfer der Familie Dermestidae, weil sie ausschließlich frische Leichen befallen",
        answerD = "Mücken, weil ihre Eier die genaue Temperatur zum Todeszeitpunkt codieren",
        correctAnswer = 1, // B
        explanation = "Schmeißfliegen werden von Verwesungsgasen angelockt und legen Eier innerhalb weniger Minuten bis Stunden nach dem Tod ab. Die Entwicklungszeit Ei → Larve → Puppe ist temperaturabhängig und in 'accumulated degree days' (ADD) berechenbar. Der Entwicklungsstand der ältesten Larven gibt Aufschluss über das Mindestalter der Leiche.",
        difficulty = 2,
        funFact = null
    ),

    // Question 5 – Forensic Science: Toxicology
    Question(
        categoryId = 2,
        questionText = "Warum wird in der forensischen Toxikologie Haar häufig als Probenmaterial bevorzugt, um chronischen Drogenkonsum nachzuweisen?",
        answerA = "Haar enthält mehr Drogenmetabolite als Blut und ist daher empfindlicher",
        answerB = "Drogen und ihre Metabolite werden beim Haarwachstum (~1 cm/Monat) eingebaut und ermöglichen einen Zeitverlauf über Monate",
        answerC = "Haare sind steriler als Blut und verhindern bakteriellen Abbau der Substanzen",
        answerD = "Im Haar sind Drogen besser wasserlöslich und daher leichter zu extrahieren",
        correctAnswer = 1, // B
        explanation = "Während Blut und Urin nur ein kurzes Nachweisfenster (Stunden bis Tage) bieten, werden Substanzen aus dem Blutkreislauf in wachsende Haarfollikel eingebaut. Da Haar etwa 1 cm pro Monat wächst, erlaubt ein 6 cm langes Haarstück eine Rekonstruktion des Konsumverlaufs der letzten sechs Monate – segmentweise analysiert.",
        difficulty = 2,
        funFact = "Napoleons Haarproben zeigten erhöhte Arsenkonzentrationen – ein forensischer Hinweis, der bis heute Historiker beschäftigt."
    ),

    // ── SPACE PHYSICS ─────────────────────────────────────────────────────────

    // Question 6 – Space Physics: Cosmic Radiation
    Question(
        categoryId = 2,
        questionText = "Aus welchen Teilchen besteht die primäre kosmische Strahlung hauptsächlich?",
        answerA = "Zu etwa 89 % aus Protonen, ~10 % Heliumkernen und ~1 % schwereren Kernen",
        answerB = "Zu etwa 60 % aus Elektronen und 40 % aus Gammastrahlung",
        answerC = "Zu etwa 50 % aus Neutrinos und 50 % aus Protonen",
        answerD = "Ausschließlich aus hochenergetischen Photonen (Röntgen- und Gammastrahlung)",
        correctAnswer = 0, // A
        explanation = "Primäre kosmische Strahlung besteht überwiegend aus geladenen Kernen: ~89 % Protonen, ~10 % Alpha-Teilchen (Heliumkerne) und ~1 % schwerere Kerne (CNO-Gruppe, Eisen). Elektronen machen nur ~1 % aus. Diese Teilchen werden in der Atmosphäre zu sekundären Teilchenkaskaden (Schauer) umgewandelt.",
        difficulty = 2,
        funFact = "Die energiereichsten kosmischen Teilchen – 'Oh-My-God'-Teilchen – haben eine Energie von ~3×10²⁰ eV, vergleichbar mit einem Tennis-Aufschlag in einem einzigen Teilchen."
    ),

    // Question 7 – Space Physics: Solar Wind
    Question(
        categoryId = 2,
        questionText = "Was ist der Sonnenwind physikalisch gesehen, und mit welcher typischen Geschwindigkeit trifft er auf die Erde?",
        answerA = "Elektromagnetische Strahlung der Sonne, die mit Lichtgeschwindigkeit (300.000 km/s) die Erde erreicht",
        answerB = "Ein kontinuierlicher Strom geladener Teilchen (Protonen, Elektronen), der die Sonne mit ~400–800 km/s verlässt",
        answerC = "Infrarotstrahlung, die den interplanetaren Raum auf ~10.000 K aufheizt",
        answerD = "Neutrale Wasserstoffatome, die mit ~50 km/s die Erde passieren",
        correctAnswer = 1, // B
        explanation = "Der Sonnenwind ist ein Plasma aus überwiegend Protonen und Elektronen, das kontinuierlich aus der Sonnenkorona entweicht. Die langsame Komponente hat ~400 km/s, die schnelle ~700–800 km/s. Er formt die Heliosphäre und komprimiert das Erdmagnetfeld auf der Tagseite, während er es nacht- seitig zu einem langen Schweif streckt.",
        difficulty = 2,
        funFact = null
    ),

    // Question 8 – Space Physics: Van Allen Belts
    Question(
        categoryId = 2,
        questionText = "Was sind die Van-Allen-Strahlungsgürtel, und aus welchen Teilchen bestehen sie hauptsächlich?",
        answerA = "Ringe aus kosmischem Staub, die von der Erdgravitation eingefangen wurden",
        answerB = "Torusförmige Zonen energiereicher geladener Teilchen (Protonen und Elektronen), die vom Erdmagnetfeld gefangen werden",
        answerC = "Schichten aus ionisiertem Stickstoff in der oberen Atmosphäre, die UV-Strahlung absorbieren",
        answerD = "Konzentrische Schalen aus neutraler Materie, die den geomagnetischen Pol umgeben",
        correctAnswer = 1, // B
        explanation = "Die Van-Allen-Gürtel (entdeckt 1958 durch Explorer 1) sind zwei torusförmige Regionen im Erdmagnetfeld, in denen energiereiche Protonen und Elektronen gefangen sind. Der innere Gürtel (~1.000–6.000 km Höhe) ist protonen-reich, der äußere (~13.000–60.000 km) elektronen-reich. Sie stellen eine Strahlenbelastung für Satelliten und Astronauten dar.",
        difficulty = 2,
        funFact = "Die Apollo-Astronauten durchquerten die Van-Allen-Gürtel schnell und erhielten dabei nur eine vergleichsweise geringe Strahlendosis."
    ),

    // Question 9 – Space Physics: Magnetosphere
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus entsteht ein Polarlicht (Aurora)?",
        answerA = "Sonnenlicht wird an Eiskristallen in der Stratosphäre zu farbigem Licht gebrochen",
        answerB = "Geladene Teilchen des Sonnenwinds folgen den Magnetfeldlinien zu den Polen und regen Luftmoleküle zur Lichtemission an",
        answerC = "Radioaktive Elemente im Erdkern emittieren Strahlung, die an den Polen durch die dünne Atmosphäre dringt",
        answerD = "Meteorite verglühen in Polnähe und erzeugen farbige Leuchtspur-Muster",
        correctAnswer = 1, // B
        explanation = "Geladene Teilchen (v.a. Elektronen) des Sonnenwinds werden entlang der Magnetfeldlinien zu den magnetischen Polen geleitet. Dort stoßen sie mit Stickstoff- und Sauerstoffmolekülen in der Ionosphäre (~100–300 km Höhe) zusammen, regen diese an, und die Rückkehr in den Grundzustand erzeugt Lichtemissionen: Sauerstoff grün/rot, Stickstoff blau/violett.",
        difficulty = 2,
        funFact = null
    ),

    // Question 10 – Space Physics: Space Weather
    Question(
        categoryId = 2,
        questionText = "Was ist ein 'koronaler Massenauswurf' (CME), und welche Folgen kann er auf der Erde haben?",
        answerA = "Eine Explosion auf der Sonnenoberfläche, die ausschließlich Gammastrahlung in alle Richtungen aussendet",
        answerB = "Ein gewaltiger Ausbruch von Plasma und Magnetfeld aus der Sonnenkorona, der Stromnetze, Satelliten und GPS stören kann",
        answerC = "Ein periodisches Ausströmen von Neutrinos, das biologische Prozesse auf der Erde beeinflusst",
        answerD = "Eine lokale Verdichtung des Sonnenwinds, die ausschließlich die Polarzonen betrifft",
        correctAnswer = 1, // B
        explanation = "Ein CME ist ein Ausbruch von Milliarden Tonnen magnetisiertem Plasma aus der Sonnenkorona. Trifft er auf die Erde (Reisezeit 1–3 Tage), kann er geomagnetische Stürme auslösen: Polarlichter in niedrigen Breiten, Schäden an Satelliten, Ausfälle von Stromleitungen (durch Induktion) und GPS-Störungen. Der Carrington-Event 1859 gilt als stärkster dokumentierter CME.",
        difficulty = 2,
        funFact = "Ein CME vom Ausmaß des Carrington-Events heute würde laut Schätzungen Schäden von bis zu 2 Billionen US-Dollar verursachen."
    ),

    // ── PARASITOLOGY ──────────────────────────────────────────────────────────

    // Question 11 – Parasitology: Malaria Lifecycle
    Question(
        categoryId = 2,
        questionText = "In welcher Phase des Malaria-Lebenszyklus von Plasmodium falciparum findet die sexuelle Vermehrung statt?",
        answerA = "Im menschlichen Blut, wo Gameten sich direkt miteinander verschmelzen",
        answerB = "Im Darm der weiblichen Anopheles-Mücke, wo Gameten zur Zygote verschmelzen",
        answerC = "In der menschlichen Leber, wo Sporozoiten zu Merozoiten werden",
        answerD = "In roten Blutkörperchen, wo Trophozoiten sich geschlechtlich teilen",
        correctAnswer = 1, // B
        explanation = "Plasmodium hat einen zweiphasigen Lebenszyklus: Die ungeschlechtliche Schizogonie läuft im Menschen ab (Leber → Erythrozyten). Die geschlechtliche Phase beginnt, wenn Gametozyten mit einer Blutmahlzeit in die Mücke aufgenommen werden. Im Mückendarm verschmelzen Mikro- und Makrogameten zur Zygote (Ookinet → Oozyte → Sporozoiten), die in die Speicheldrüsen wandern.",
        difficulty = 2,
        funFact = null
    ),

    // Question 12 – Parasitology: Tapeworms
    Question(
        categoryId = 2,
        questionText = "Wie nimmt der Mensch den Schweinebandwurm (Taenia solium) hauptsächlich auf, und welche gefährlichere Erkrankung kann dieser Parasit verursachen?",
        answerA = "Durch den Stich infizierter Mücken; verursacht Elephantiasis",
        answerB = "Durch den Verzehr von rohem oder unzureichend gegartem Schweinefleisch mit Finnen; kann Neurozystizerkose verursachen",
        answerC = "Durch kontaminiertes Trinkwasser mit Proglottiden; verursacht Gelbfieber",
        answerD = "Durch Hautkontakt mit infiziertem Boden; verursacht Strongyloidiasis",
        correctAnswer = 1, // B
        explanation = "Der Mensch infiziert sich als Endwirt durch Verzehr von Schweinefleisch mit Zystizerken (Finnenstadium). Im Darm entwickelt sich der Bandwurm (bis 8 m). Schluckt der Mensch aber Eier (z.B. durch fäkal-orale Kontamination), kann er unbeabsichtigt zum Zwischenwirt werden: Larven wandern ins Gewebe, v.a. Gehirn → Neurozystizerkose, eine häufige Ursache epileptischer Anfälle in Entwicklungsländern.",
        difficulty = 2,
        funFact = "Taenia solium kann im menschlichen Darm bis zu 25 Jahre lang leben."
    ),

    // Question 13 – Parasitology: Toxoplasma
    Question(
        categoryId = 2,
        questionText = "Welches Tier ist der einzige Endwirt von Toxoplasma gondii, und wie manipuliert der Parasit sein Zwischenwirt?",
        answerA = "Hunde; Toxoplasma bewirkt erhöhte Aggression bei infizierten Ratten gegenüber Katzen",
        answerB = "Katzen; Toxoplasma vermindert bei infizierten Nagetieren die Angst vor Katzengeruch und erleichtert so die Übertragung",
        answerC = "Vögel; Toxoplasma veranlasst Mäuse dazu, sich in der Nähe von Vogelnestern aufzuhalten",
        answerD = "Menschen; Toxoplasma verändert menschliches Verhalten, um die Ausbreitung durch Haustiere zu fördern",
        correctAnswer = 1, // B
        explanation = "Die sexuelle Reproduktion von T. gondii findet ausschließlich im Darmepithel von Katzen statt. Als Zwischenwirt nutzt der Parasit u.a. Nagetiere. Infizierte Mäuse zeigen eine reduzierte Furcht vor Katzengeruch (sogar eine Attraktion zu Katzenurin), was ihre Prädation durch Katzen wahrscheinlicher macht – ein klassisches Beispiel für parasitäre Verhaltensmanipulation.",
        difficulty = 2,
        funFact = null
    ),

    // Question 14 – Parasitology: Helminth Types
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet Nematoden von Plathelminthen in ihrer Körperbauplan-Grundstruktur?",
        answerA = "Nematoden sind segmentiert, Plathelminthen sind unsegmentiert",
        answerB = "Nematoden besitzen einen echten Körperhöhle (Pseudocoel) und sind rund im Querschnitt; Plathelminthen sind abgeflacht und acoelom oder acoelomat",
        answerC = "Nematoden haben ein Blutgefäßsystem, Plathelminthen nicht",
        answerD = "Nematoden sind ausschließlich parasitisch, Plathelminthen ausschließlich freilebend",
        correctAnswer = 1, // B
        explanation = "Nematoden (Fadenwürmer) haben einen runden Querschnitt und eine Pseudocoelom (flüssigkeitsgefüllter Körperraum ohne Mesothel), der als hydrostatisches Skelett dient. Plathelminthen (Plattwürmer) sind dorsoventral abgeflacht, haben kein echtes Coelom (acoelom) und übertragen Nährstoffe diffusiv. Wichtige parasitische Nematoden: Ascaris, Filarien; Plathelminthen: Bandwürmer, Saugwürmer.",
        difficulty = 2,
        funFact = "Caenorhabditis elegans, ein freilebender Nematode, war das erste Tier, dessen gesamtes Nervensystem komplett kartiert wurde – alle 302 Neuronen."
    ),

    // Question 15 – Parasitology: Parasite Defense Mechanisms
    Question(
        categoryId = 2,
        questionText = "Welche Immunabwehrstrategie ist besonders effektiv gegen Helminthen-Infektionen?",
        answerA = "Zytotoxische T-Zellen (CD8+), die infizierte Körperzellen direkt abtöten",
        answerB = "Th2-dominierte Immunantwort mit IgE-Produktion und Aktivierung von Mastzellen und eosinophilen Granulozyten",
        answerC = "Neutrophile Granulozyten und Komplement-Lyse durch IgM",
        answerD = "Natürliche Killerzellen, die Parasiten durch Perforin-Ausschüttung abtöten",
        correctAnswer = 1, // B
        explanation = "Helminthen sind zu groß für Phagozytose. Die primäre Abwehr erfolgt über eine Th2-Immunantwort: IL-4/IL-13 stimulieren B-Zellen zur IgE-Produktion, IL-5 aktiviert Eosinophile. IgE bindet an Mastzellen; bei Kontakt mit Parasitenantigen degranulieren diese (Histamin etc.). Eosinophile setzen toxische Granula (MBP, ECP) frei, die Helminthen schädigen – 'ADCC' (antibody-dependent cellular cytotoxicity).",
        difficulty = 2,
        funFact = null
    ),

    // ── PHOTONICS ─────────────────────────────────────────────────────────────

    // Question 16 – Photonics: Fiber Optics
    Question(
        categoryId = 2,
        questionText = "Auf welchem physikalischen Prinzip basiert die Lichtleitung in einer Glasfaser?",
        answerA = "Beugung des Lichts an der Glasoberfläche durch Fraunhofer-Beugung",
        answerB = "Totalreflexion an der Grenzfläche zwischen Kern (höherer Brechungsindex) und Mantel (niedrigerer Brechungsindex)",
        answerC = "Absorption und Wiederemission durch Fluoreszenz-Dotierung des Glases",
        answerD = "Piezoelektrische Beschleunigung der Photonen durch mechanische Spannung im Glas",
        correctAnswer = 1, // B
        explanation = "Glasfasern nutzen die Totalreflexion: Wenn Licht von einem dichteren Medium (Kern, n₁ > n₂) auf ein dünneres trifft und der Einfallswinkel den kritischen Winkel θ_c = arcsin(n₂/n₁) überschreitet, wird 100 % des Lichts reflektiert. Der Kern hat typisch n ≈ 1,48, der Mantel n ≈ 1,46. So propagiert Licht über tausende Kilometer mit minimalen Verlusten.",
        difficulty = 2,
        funFact = "Eine einzige Glasfaser kann heute über 100 Terabit Daten pro Sekunde übertragen – mehr als alle frühen Kupfernetzwerke der Welt zusammen."
    ),

    // Question 17 – Photonics: Laser Types
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet einen Festkörperlaser (z.B. Nd:YAG) von einem Gaslaser (z.B. CO₂-Laser) grundlegend?",
        answerA = "Festkörperlaser erzeugen immer sichtbares Licht, Gaslaser immer Infrarotlicht",
        answerB = "Das aktive Lasermedium ist bei Festkörperlasern ein dotierter Kristall oder Glas, bei Gaslasern ein ionisiertes oder angeregtes Gasgemisch",
        answerC = "Festkörperlaser funktionieren ohne Resonatorspiegel, Gaslaser benötigen immer zwei Spiegel",
        answerD = "Gaslaser sind immer gepulst, Festkörperlaser immer im Dauerstrichbetrieb (CW)",
        correctAnswer = 1, // B
        explanation = "Der grundlegende Unterschied liegt im aktiven Medium: Festkörperlaser verwenden dotierte Kristalle (Nd:YAG = Neodym in Yttrium-Aluminium-Granat) oder Gläser, die durch eine Pumplichtquelle (Blitzlampe, Diodenlaser) angeregt werden. Gaslaser verwenden ein Gasgemisch (CO₂/N₂/He), in dem durch elektrische Entladung Populationsinversion erzeugt wird. Beide Typen benötigen einen optischen Resonator.",
        difficulty = 2,
        funFact = null
    ),

    // Question 18 – Photonics: LED Technology
    Question(
        categoryId = 2,
        questionText = "Durch welchen Prozess emittiert eine LED (Light Emitting Diode) Licht?",
        answerA = "Thermische Strahlung – die LED erhitzt sich und glüht wie eine Glühbirne",
        answerB = "Elektrolumineszenz – Elektronen und Löcher rekombinieren im p-n-Übergang und geben die Energiedifferenz als Photon ab",
        answerC = "Fluoreszenz – UV-Strahlung eines internen Entladungsbogens regt Phosphore zur Lichtemission an",
        answerD = "Piezoelektrischer Effekt – mechanische Vibrationen des Halbleiterkristalls erzeugen Licht",
        correctAnswer = 1, // B
        explanation = "In einer LED werden Elektronen aus der n-Schicht und Löcher aus der p-Schicht in die aktive Zone (Rekombinationszone) injiziert. Bei der strahlenden Rekombination eines Elektrons mit einem Loch wird die Energie ΔE = E_Leitungsband − E_Valenzband als Photon der Frequenz ν = ΔE/h abgegeben. Die Wellenlänge (Farbe) bestimmt sich durch die Bandlücke des Halbleitermaterials.",
        difficulty = 2,
        funFact = "Für die Entwicklung der blauen LED erhielten Akasaki, Amano und Nakamura 2014 den Nobelpreis für Physik – ohne Blau kein weißes LED-Licht."
    ),

    // Question 19 – Photonics: Holography
    Question(
        categoryId = 2,
        questionText = "Was unterscheidet ein Hologramm grundlegend von einer gewöhnlichen Fotografie?",
        answerA = "Ein Hologramm ist immer farbig, eine Fotografie kann nur schwarzweiß sein",
        answerB = "Ein Hologramm zeichnet Amplitude und Phase des Lichts auf (3D-Tiefeninformation), eine Fotografie nur die Intensität (Amplitude²)",
        answerC = "Ein Hologramm verwendet UV-Licht, eine Fotografie sichtbares Licht",
        answerD = "Ein Hologramm ist digital gespeichert, eine Fotografie immer chemisch entwickelt",
        correctAnswer = 1, // B
        explanation = "Konventionelle Fotografie registriert nur die Intensität (|E|²) des auftreffenden Lichts – die Phaseninformation geht verloren. Holographie nutzt Interferenz: Ein Referenzstrahl und der objektreflektierte Strahl überlagern sich auf dem holographischen Film; das entstehende Interferenzmuster codiert sowohl Amplitude als auch Phase. Bei Beleuchtung wird die vollständige Wellenfront rekonstruiert, was einen dreidimensionalen Eindruck erzeugt.",
        difficulty = 2,
        funFact = null
    ),

    // Question 20 – Photonics: Photovoltaic Cells
    Question(
        categoryId = 2,
        questionText = "Warum haben Solarzellen aus kristallinem Silizium einen theoretischen Wirkungsgrad von maximal etwa 29 %, obwohl die Bandlücke optimal gewählt ist?",
        answerA = "Weil Silizium nur rotes Licht absorbiert und den Rest des Spektrums reflektiert",
        answerB = "Weil die Shockley-Queisser-Grenze thermodynamische Verluste durch Wärmeerzeugung (Thermalisierung) und nicht absorbierbare Subband-Photonen festlegt",
        answerC = "Weil der p-n-Übergang Licht mit einer Spannung von maximal 0,3 V umwandeln kann",
        answerD = "Weil Reflexionsverluste an der Glasoberfläche 71 % des Lichts vernichten",
        correctAnswer = 1, // B
        explanation = "Die Shockley-Queisser-Grenze (~33 % für eine Einfach-Solarzelle, ~29 % für Si) ergibt sich aus zwei Hauptverlusten: 1) Photonen mit Energie < Bandlücke werden nicht absorbiert. 2) Photonen mit Energie > Bandlücke erzeugen 'heiße' Ladungsträger, die durch Phonon-Emission (Thermalisierung) auf Bandlückenenergie relaxieren. Für Silizium (Eg ≈ 1,12 eV) ist die Bandlücke nahe-optimal, aber diese fundamentalen Verluste bleiben.",
        difficulty = 2,
        funFact = "Tandem-Solarzellen mit mehreren p-n-Übergängen verschiedener Bandlücken können die Shockley-Queisser-Grenze überwinden – Labor-Rekorde liegen über 47 %."
    ),

    // ── SOIL SCIENCE ─────────────────────────────────────────────────────────

    // Question 21 – Soil Science: Soil Horizons
    Question(
        categoryId = 2,
        questionText = "In welcher Reihenfolge erscheinen die Bodenhorizonte im typischen Bodenprofil eines mitteleuropäischen Waldbodens von oben nach unten?",
        answerA = "C → B → A → O",
        answerB = "O → A → B → C",
        answerC = "A → O → C → B",
        answerD = "B → A → O → Gestein",
        correctAnswer = 1, // B
        explanation = "Das typische Bodenprofil zeigt von oben: O-Horizont (organische Auflage: Streu, Humus), A-Horizont (Oberboden: mit Humus gemischtes Mineral, dunkel), B-Horizont (Unterboden: angereichert mit ausgewaschenen Mineralien, Fe/Al-Oxiden), C-Horizont (verwittertes Ausgangsgestein). Darunter liegt R (festes Gestein). Die Horizontfolge O-A-B-C ist ein diagnostisches Merkmal für Bodenklassifikation.",
        difficulty = 2,
        funFact = null
    ),

    // Question 22 – Soil Science: Humus
    Question(
        categoryId = 2,
        questionText = "Was ist Humus chemisch betrachtet, und welche zentrale Funktion erfüllt er im Boden?",
        answerA = "Humus sind abgestorbene Wurzeln; er lockert mechanisch den Boden auf",
        answerB = "Humus ist die stabile organische Substanz aus mikrobiellem Umbau von Pflanzenresten; er verbessert Wasserhaltekapazität, Nährstoffspeicherung und Bodenstruktur",
        answerC = "Humus besteht aus Mineralien wie Ton und Schluff, die sich aus Gestein ablagern",
        answerD = "Humus ist ein Gasgemisch aus CO₂ und CH₄, das anaerob aus organischen Resten entsteht",
        correctAnswer = 1, // B
        explanation = "Humus ist die Gesamtheit der organischen Substanz im Boden, die aus dem mikrobiellen und chemischen Umbau von pflanzlichen und tierischen Rückständen entsteht. Huminsäuren und Fulvinsäuren als Hauptkomponenten bilden Komplexe mit Tonmineralien (Ton-Humus-Komplexe), erhöhen die Kationenaustauschkapazität, verbessern die Aggregatstruktur, fördern die Wasserhaltekapazität und dienen als Nährstoffspeicher.",
        difficulty = 2,
        funFact = "Ein Teelöffel gesunder Erde enthält mehr Mikroorganismen als es Menschen auf der Erde gibt."
    ),

    // Question 23 – Soil Science: Nitrogen Fixation in Soil
    Question(
        categoryId = 2,
        questionText = "Welches Enzym ist für die biologische Stickstofffixierung verantwortlich, und warum ist es gegenüber Sauerstoff empfindlich?",
        answerA = "Nitrogenase; das Eisen-Molybdän-Kofaktorzentrum wird durch O₂ irreversibel oxidiert und inaktiviert",
        answerB = "Glutaminsynthetase; sie reagiert mit O₂ zu einem toxischen Peroxid",
        answerC = "Urease; sie spaltet Harnstoff in NH₃ und CO₂, wird aber durch O₂ denaturiert",
        answerD = "Nitratreduktase; O₂ konkurriert mit NO₃⁻ um das aktive Zentrum",
        correctAnswer = 0, // A
        explanation = "Die Nitrogenase (aus zwei Proteinkomplexen: Eisen-Protein und Molybdän-Eisen-Protein) katalysiert N₂ + 8H⁺ + 8e⁻ + 16 ATP → 2NH₃ + H₂ + 16 ADP + 16 Pi. Das FeMo-Kofaktorzentrum wird durch O₂ irreversibel zerstört. Daher schützen symbiontische Bakterien (Rhizobium) in Wurzelknöllchen das Enzym durch Leghämoglobin, das O₂ bindet und den pO₂ niedrig hält.",
        difficulty = 2,
        funFact = null
    ),

    // Question 24 – Soil Science: Erosion Types
    Question(
        categoryId = 2,
        questionText = "Was ist der Unterschied zwischen Flächenerosion und Rillenerosion, und welche ist für landwirtschaftliche Böden schädlicher?",
        answerA = "Flächenerosion ist lokal begrenzt und schadet mehr; Rillenerosion betrifft nur Bachläufe",
        answerB = "Flächenerosion ist die gleichmäßige Abtragung dünner Bodenschichten durch Niederschlag; Rillenerosion konzentriert Abfluss in linearen Rinnen und trägt tiefere Schichten schneller ab",
        answerC = "Rillenerosion ist harmloser, da Wasser in Rillen kanalisiert wird und nicht seitlich abfließt",
        answerD = "Flächenerosion entsteht durch Wind, Rillenerosion ausschließlich durch Wasser",
        correctAnswer = 1, // B
        explanation = "Flächenerosion (sheet erosion) trägt durch Niederschlagstropfen ('splash') und Oberflächenabfluss gleichmäßig dünne Schichten ab – schwer sichtbar, kumulativ schädlich. Rillenerosion entsteht, wenn Abfluss sich konzentriert und V-förmige Rinnen gräbt; die Erosionsrate ist wesentlich höher, da Turbulenzen tiefere Schichten erfassen. Unbehandelt entwickelt sich Rillenerosion zu Graben- (Gully-)Erosion.",
        difficulty = 2,
        funFact = "Weltweit gehen jährlich schätzungsweise 24 Milliarden Tonnen fruchtbarer Oberboden durch Erosion verloren."
    ),

    // Question 25 – Soil Science: Mycorrhizal Networks
    Question(
        categoryId = 2,
        questionText = "Welchen Vorteil bietet eine ektomykorrhizale Symbiose dem Pilz und der Pflanze jeweils?",
        answerA = "Der Pilz erhält Wasser, die Pflanze erhält Mineralsalze wie Phosphor und Stickstoff",
        answerB = "Der Pilz erhält photosynthetisch produzierte Kohlenhydrate (Zucker) von der Pflanze; die Pflanze erhält Mineralsalze (v.a. Phosphat, Stickstoff) und Wasser durch das ausgedehnte Pilzmyzel",
        answerC = "Der Pilz schützt die Pflanze vor Frost, die Pflanze schützt den Pilz vor Austrocknung",
        answerD = "Beide Partner teilen Kohlendioxid und Sauerstoff als Austauschprodukte",
        correctAnswer = 1, // B
        explanation = "Bei der Ektomykorrhiza umhüllen Pilzhyphen die Wurzelspitzen ('Hartig'sches Netz') ohne in Zellen einzudringen. Die Pflanze liefert bis zu 30 % ihrer photosynthetischen Produkte (Saccharose, Glucose) an den Pilz. Der Pilz erschließt mit seinem weitverzweigten Myzel ein vielfach größeres Bodenvolumen und versorgt die Pflanze mit schlecht verfügbarem Phosphat, Stickstoff und Spurenelementen.",
        difficulty = 2,
        funFact = null
    ),

    // ── CRYOGENICS ───────────────────────────────────────────────────────────

    // Question 26 – Cryogenics: Liquid Nitrogen Uses
    Question(
        categoryId = 2,
        questionText = "Bei welcher Temperatur siedet flüssiger Stickstoff unter Normaldruck, und welche Eigenschaft macht ihn für kryogene Anwendungen so nützlich?",
        answerA = "−196 °C (77 K); er ist nicht brennbar, billig, reichlich vorhanden und kann Proben extrem schnell einfrieren",
        answerB = "−269 °C (4 K); er ist das kälteste leicht verfügbare Kühlmittel",
        answerC = "−78 °C (195 K); er sublimiert direkt und hinterlässt keine Rückstände",
        answerD = "−253 °C (20 K); er eignet sich zur Lagerung von Wasserstoff-Brennstoffzellen",
        correctAnswer = 0, // A
        explanation = "Flüssiger Stickstoff siedet bei −195,79 °C (77,36 K) unter Normaldruck. Seine Nützlichkeit liegt in der Kombination aus: günstiger Preis (N₂ ist 78 % der Atmosphäre), Ungiftigkeit, Nicht-Brennbarkeit, hoher volumetrischer Kühlkapazität und sehr schnellen Einfriergeschwindigkeiten. Anwendungen: Kryokonservierung, medizinische Behandlungen (Kryotherapie), Materialprüfung, Lebensmittelkühlung.",
        difficulty = 2,
        funFact = "Flüssiger Stickstoff auf Haut bildet sofort einen isolierenden Dampffilm (Leidenfrost-Effekt) – kurzer Kontakt ist daher weniger schädlich als direktes Berühren von −196°C kaltem Metall."
    ),

    // Question 27 – Cryogenics: Supercooling
    Question(
        categoryId = 2,
        questionText = "Was ist Unterkühlung (Supercooling) bei Flüssigkeiten, und warum erstarrt unterkühles Wasser schlagartig bei der geringsten Störung?",
        answerA = "Unterkühlung ist das Abkühlen unter den Gefrierpunkt ohne Phasenübergang; Störungen liefern Kristallisationskeime, die spontane Nukleation und sofortige Erstarrung auslösen",
        answerB = "Unterkühlung ist das langsame Abkühlen auf 0 °C; Störungen beschleunigen die Wärmeleitung ins Eis",
        answerC = "Unterkühlung bedeutet Abkühlen unter −273 °C; nahe dem absoluten Nullpunkt wirken Quantenfluktuationen als Kristallisationskeime",
        answerD = "Unterkühlung ist der metastabile Zustand von Eis bei Druckerhöhung; mechanische Störungen heben den Druck auf",
        correctAnswer = 0, // A
        explanation = "Unterkühlung tritt auf, wenn reines, störungsfreies Wasser unter 0 °C abgekühlt wird, ohne dass Nukleationskeime (Verunreinigungen, Kratzer, Vibrationen) vorhanden sind. Die Flüssigkeit verbleibt metastabil. Jede Störung liefert einen Nukleationskeim, der eine explosive Kristallisationsfront auslöst ('flash freezing'). Wasser kann labortechnisch bis −40 °C unterkühlt werden.",
        difficulty = 2,
        funFact = null
    ),

    // Question 28 – Cryogenics: Cryopreservation
    Question(
        categoryId = 2,
        questionText = "Warum werden Kryoprotektiva wie DMSO oder Glycerin bei der Kryokonservierung von Zellen eingesetzt?",
        answerA = "Sie erhöhen den Gefrierpunkt und verlangsamen die Eiskristallbildung auf kontrollierbare Geschwindigkeit",
        answerB = "Sie dringen in Zellen ein, verdrängen Wasser und verhindern die intrazelluläre Eiskristallbildung, die Membranen zerstören würde",
        answerC = "Sie töten alle Bakterien ab und sterilisieren die Proben vor dem Einfrieren",
        answerD = "Sie versiegeln die Zellmembran extern und verhindern das Eindringen von Kälte",
        correctAnswer = 1, // B
        explanation = "Eiskristalle, die sich intrazellulär bilden, zerreißen Membranen und Organellen – die Hauptursache für Kryoschäden. Kryoprotektiva wie DMSO (Dimethylsulfoxid) penetrieren die Zellmembran, binden Wassermoleküle und senken die Aktivität des Wassers, was die Nukleation von Eiskristallen hemmt. Zusätzlich erhöhen sie die Viskosität und fördern die Glasbildung (Vitrifikation) statt Kristallisation.",
        difficulty = 2,
        funFact = "Einige Frösche (z.B. Rana sylvatica) überleben den Winter, indem bis zu 65 % ihres Körperwassers als Eis kristallisiert – ihr Blut enthält natürliche Kryoprotektiva."
    ),

    // Question 29 – Cryogenics: Absolute Zero Approaches
    Question(
        categoryId = 2,
        questionText = "Welche Methode wird verwendet, um Atome im Labor auf Temperaturen im Nanokelvin-Bereich zu kühlen, weit unter die Temperaturen, die mit flüssigem Helium erreichbar sind?",
        answerA = "Kompression in einem Hochdruckbehälter, gefolgt von adiabatischer Expansion",
        answerB = "Laser-Doppler-Kühlung kombiniert mit evaporativer Kühlung in magnetischen oder optischen Fallen",
        answerC = "Adsorption an supraleitenden Oberflächen, die Wärmeenergie absorbieren",
        answerD = "Tauchkühlung in supraflüssigem Helium-3 bei weniger als 3 mK",
        correctAnswer = 1, // B
        explanation = "Laser-Kühlung (Doppler-Kühlung) nutzt den Impulsübertrag resonanter Photonen: Atome, die sich auf einen Laserstrahl zu bewegen, absorbieren häufiger blauverschobene Photonen und werden gebremst. Dies bringt Atome auf μK-Temperaturen. Anschließende evaporative Kühlung in Magnetfallen (energiereiche Atome 'verdampfen' aus der Falle) bringt Ensembles auf nK, nahe genug für Bose-Einstein-Kondensation.",
        difficulty = 2,
        funFact = null
    ),

    // Question 30 – Cryogenics: Bose-Einstein in Lab
    Question(
        categoryId = 2,
        questionText = "Was ist ein Bose-Einstein-Kondensat (BEC), und welche besondere Eigenschaft zeigt es?",
        answerA = "Ein Plasma aus Bosonen bei über 10.000 K, das supraleitend ist",
        answerB = "Ein Zustand ultrakalter Bosonen, in dem makroskopisch viele Teilchen denselben Quantengrundzustand besetzen und kollektiv als eine einzige Materiewelle verhalten",
        answerC = "Ein fester Aggregatzustand von Helium-4 bei Temperaturen unter 2 K mit perfekter Kristallstruktur",
        answerD = "Ein superfluides Gemisch aus Elektronen und Positronen, das Licht vollständig absorbiert",
        correctAnswer = 1, // B
        explanation = "Wenn identische Bosonen (ganzzahliger Spin) unter ihre kritische Temperatur (nK-Bereich) abgekühlt werden, kollapsen ihre de-Broglie-Wellenlängen und überlappen sich. Das System besetzt kollektiv den niedrigsten Quantenzustand – ein makroskopisches Quantenphänomen. BECs verhalten sich wie eine einzige kohärente Materiewelle, zeigen Interferenz und wurden 1995 von Cornell, Wieman und Ketterle experimentell realisiert (Nobelpreis 2001).",
        difficulty = 2,
        funFact = "In einem BEC kann Licht auf wenige Meter pro Sekunde verlangsamt werden – 20 Millionen Mal langsamer als im Vakuum."
    ),

    // ── BIOMECHANICS ─────────────────────────────────────────────────────────

    // Question 31 – Biomechanics: Muscle Contraction
    Question(
        categoryId = 2,
        questionText = "Welche molekulare Abfolge beschreibt den Querbrückenzyklus bei der Muskelkontraktion nach dem Gleitfilamentmodell?",
        answerA = "Myosin bindet ATP → Kopf richtet sich aus → ATP-Hydrolyse → Myosin bindet Aktin → Kraftschlag → ADP/Pi werden freigesetzt → neues ATP löst die Bindung",
        answerB = "Aktin bindet ATP → Troponin aktiviert Myosin → Kraftschlag → Aktin gleitet über Myosin → Ca²⁺ löst die Bindung",
        answerC = "Ca²⁺ bindet direkt an Myosin → Querbrücke bildet sich spontan → Kraftschlag ohne ATP → ADP löst die Bindung",
        answerD = "Titin spannt sich unter ATP-Verbrauch → Aktin zieht sich zusammen → Myosin bleibt statisch",
        correctAnswer = 0, // A
        explanation = "Im Querbrückenzyklus: 1) ATP bindet an Myosinkopf → Aktin-Myosin-Bindung löst sich. 2) ATP-Hydrolyse → Myosinkopf richtet sich aus ('gespannter Zustand'). 3) Schwache Bindung an Aktin. 4) Pi-Freisetzung → starke Bindung + Kraftschlag (5–10 nm Verschiebung). 5) ADP-Freisetzung → Rigor-Komplex. 6) Neues ATP bindet → Lösung. Ohne ATP: Totenstarre (Rigor mortis).",
        difficulty = 2,
        funFact = null
    ),

    // Question 32 – Biomechanics: Bone Strength
    Question(
        categoryId = 2,
        questionText = "Welche zwei Hauptkomponenten verleihen dem Knochen sowohl Druckfestigkeit als auch Biegeelastizität?",
        answerA = "Kalziumphosphat (Hydroxylapatit) für Druckfestigkeit und Kollagen Typ I für Zugfestigkeit und Elastizität",
        answerB = "Calciumcarbonat für Druck und Elastin für Elastizität",
        answerC = "Eisen für Festigkeit und Hyaluronsäure für Flexibilität",
        answerD = "Phospholipide für die Zellstruktur und Keratin für Zugfestigkeit",
        correctAnswer = 0, // A
        explanation = "Knochen ist ein Verbundwerkstoff aus zwei Hauptkomponenten: Hydroxylapatit [Ca₁₀(PO₄)₆(OH)₂] als mineralische Phase (70 % des trockenen Gewichts) verleiht Druckfestigkeit und Härte. Kollagen Typ I als organische Phase (30 %) bildet geordnete Fibrillen, die Zugkräften widerstehen und Brüchigkeit verhindern. Diese Kombination erzeugt eine Bruchzähigkeit, die einzelnen Komponenten weit überlegen ist.",
        difficulty = 2,
        funFact = "Gramm für Gramm ist Knochen stärker als Stahl in der Druckfestigkeit – aber nur 1/3 des Gewichts."
    ),

    // Question 33 – Biomechanics: Joint Types
    Question(
        categoryId = 2,
        questionText = "Welche Bewegungsfreiheitsgrade (Achsen) besitzt ein Kugelgelenk im Vergleich zu einem Scharniergelenk?",
        answerA = "Kugelgelenk: 1 Achse (Beugung/Streckung); Scharniergelenk: 3 Achsen (alle Richtungen)",
        answerB = "Kugelgelenk: 3 Achsen (Beugung/Streckung, Abspreizung/Heranführung, Rotation); Scharniergelenk: 1 Achse (Beugung/Streckung)",
        answerC = "Beide Gelenke haben 2 Achsen, unterscheiden sich aber in der Gelenkfläche",
        answerD = "Kugelgelenk: 2 Achsen; Scharniergelenk: 2 Achsen; Sattelgelenk: 3 Achsen",
        correctAnswer = 1, // B
        explanation = "Kugelgelenke (Enarthrosen, z.B. Schulter, Hüfte) erlauben Bewegungen um drei Achsen: Flexion/Extension, Abduktion/Adduktion und Innen-/Außenrotation – maximale Bewegungsfreiheit. Scharniergelenke (Ginglymi, z.B. Ellbogen, Fingergelenke) sind auf eine Achse beschränkt (Beugung/Streckung), was Stabilität auf Kosten der Beweglichkeit bietet.",
        difficulty = 2,
        funFact = null
    ),

    // Question 34 – Biomechanics: Gait Analysis
    Question(
        categoryId = 2,
        questionText = "Was ist das 'Doppelstützphasen'-Phänomen beim menschlichen Gehen, und wodurch unterscheidet es sich vom Laufen?",
        answerA = "Beim Gehen gibt es Phasen, in denen beide Füße gleichzeitig den Boden berühren; beim Laufen gibt es Flugphasen, in denen kein Fuß den Boden berührt",
        answerB = "Beim Gehen berührt nie ein Fuß den Boden; beim Laufen immer ein Fuß",
        answerC = "Die Doppelstützphase beschreibt den Moment, wenn beide Beine gestreckt sind; beim Laufen sind immer beide Knie gebeugt",
        answerD = "Beim Gehen gibt es eine längere Schwungphase; beim Laufen eine längere Stützphase",
        correctAnswer = 0, // A
        explanation = "Der definitorische Unterschied zwischen Gehen und Laufen liegt in der Doppelstützphase: Beim Gehen (~60 % Stützphase, ~40 % Schwungphase) gibt es zwei kurze Intervalle (~10 % des Zyklus), in denen beide Füße gleichzeitig Kontakt haben. Beim Laufen verschwindet diese Phase vollständig und wird durch eine Flugphase (beide Füße in der Luft) ersetzt. Diese Grenze liegt bei etwa 2–3 m/s Gehgeschwindigkeit.",
        difficulty = 2,
        funFact = "Ganganalyse mit Bodenreaktionskraftplatten zeigt, dass beim Laufen Bodenreaktionskräfte von bis zu 3× dem Körpergewicht auftreten."
    ),

    // Question 35 – Biomechanics: Stress on Spine
    Question(
        categoryId = 2,
        questionText = "Warum ist das Heben schwerer Gegenstände mit rundem Rücken biomechanisch deutlich gefährlicher als das Heben mit geradem Rücken und gebeugten Knien?",
        answerA = "Der gerade Rücken aktiviert mehr Muskeln, die die Last besser verteilen und die Bandscheiben durch erhöhten Innendruck stabilisieren",
        answerB = "Beim runden Rücken wirkt ein langer Hebelarm: die Rückenstrecker müssen mit dem bis zu 10-fachen der gehobenen Last gegenhalten, was den Druck auf Bandscheiben massiv erhöht",
        answerC = "Gebeugte Knie verkürzen den Weg der Last und reduzieren damit die Beschleunigungsphase",
        answerD = "Der runde Rücken dehnt das Ligamentum longitudinale anterior, das reißt und direkt Schmerzen verursacht",
        correctAnswer = 1, // B
        explanation = "Die Wirbelsäule funktioniert als Hebelsystem. Bei vorgeneigtem, rundem Rücken liegt der Schwerpunkt der Last weit vor dem Lendenwirbelgelenk (langer Lastarm). Die Rückenstrecker arbeiten mit kurzem Kraftarm (~5 cm) am Dornfortsatz. Nach dem Hebelgesetz (F_Muskel × d_kurz = F_Last × d_lang) entstehen Muskelkräfte, die ein Vielfaches der gehobenen Last betragen – und dieser Kraft addiert sich noch die Erdanziehung des Oberkörpers.",
        difficulty = 2,
        funFact = null
    ),

    // ── HISTORY OF SCIENCE ───────────────────────────────────────────────────

    // Question 36 – History of Science: Galileo
    Question(
        categoryId = 2,
        questionText = "Mit welchem Experiment widerlegte Galileo Galilei die aristotelische Behauptung, dass schwerere Körper schneller fallen als leichtere?",
        answerA = "Er ließ Kugeln von verschiedenen Schiffen fallen und maß die Aufprallzeiten mit einer Wasseruhr",
        answerB = "Er rollte Kugeln unterschiedlicher Masse auf einer geneigten Ebene ab und maß die Fallzeiten – die Zeiten waren unabhängig von der Masse",
        answerC = "Er ließ Federn und Bleikugeln im Vakuum einer Glasröhre fallen",
        answerD = "Er berechnete mathematisch den Freien Fall ohne experimentelle Bestätigung",
        correctAnswer = 1, // B
        explanation = "Galileo nutzte geneigte Ebenen, um den freien Fall zu verlangsamen und messbar zu machen (Wasseruhren konnten kurze Fallzeiten nicht auflösen). Er rollte Kugeln unterschiedlicher Masse hinunter und stellte fest, dass die Rollzeit unabhängig von der Masse war – im Widerspruch zu Aristoteles. Das Legende gewordene Experiment vom Schiefen Turm zu Pisa ist wahrscheinlich nicht historisch belegt.",
        difficulty = 2,
        funFact = "Galileos Ergebnisse wurden von der Kirche nicht wegen der Fallgesetze verurteilt, sondern wegen seiner Unterstützung des heliozentrischen Weltbildes."
    ),

    // Question 37 – History of Science: Pasteur
    Question(
        categoryId = 2,
        questionText = "Wie widerlegte Louis Pasteur 1859/1861 die Theorie der Spontanzeugung (Urzeugung)?",
        answerA = "Er sterilisierte Fleischbrühe und verschloss Kolben hermetisch – keine Keime entstanden, was Urzeugung widerlegte",
        answerB = "Er verwendete Schwanenhalskolben: Sterilisierte Nährlösung blieb keimfrei, solange der geschwungene Hals intakt war; nach dem Abbrechen wuchs Schimmel – Luft mit Keimen war die Ursache, nicht Spontanzeugung",
        answerC = "Er filterte Luft durch Baumwollwolle und zeigte, dass gefilterte Luft keine Keime enthielt",
        answerD = "Er destillierte Wasser in einem Vakuumapparat und bewies, dass kein Leben aus reinem Wasser entsteht",
        correctAnswer = 1, // B
        explanation = "Pasteurs elegantes Experiment mit Schwanenhalskolben (Ballons à col de cygne) war entscheidend: Der geschwungene Hals ließ Luft durch, hielt aber Staubpartikel (mit Keimen) zurück. Die Nährlösung blieb klar. Erst wenn der Hals abgebrochen wurde, wuchsen Mikroorganismen. Somit bewies er, dass Keime aus der Luft stammten, nicht durch Spontanzeugung entstanden.",
        difficulty = 2,
        funFact = null
    ),

    // Question 38 – History of Science: Darwin's Voyage
    Question(
        categoryId = 2,
        questionText = "Welche Beobachtung auf den Galapagos-Inseln war für Darwin besonders bedeutsam für die Entwicklung der Evolutionstheorie?",
        answerA = "Er beobachtete, wie Schildkröten schwimmen lernten und damit Inseln kolonisierten",
        answerB = "Die Schnabelformen der Finken variierten inselartig je nach Nahrungsquelle, was auf Anpassung durch natürliche Selektion hindeutete",
        answerC = "Er fand fossile Überreste ausgestorbener Tiere, die modernen Arten ähnelten",
        answerD = "Er beobachtete, dass Eidechsen auf verschiedenen Inseln dieselbe Farbe hatten, obwohl sie isoliert waren",
        correctAnswer = 1, // B
        explanation = "Darwins Beobachtung der Galapagos-Finken (Geospizinae) war wegweisend: Die ~14 Arten hatten unterschiedliche Schnabelformen (groß und kräftig für harte Samen, lang und dünn für Nektar/Insekten, usw.), die jeweils optimal für die verfügbare Nahrungsquelle der jeweiligen Insel angepasst waren. Darwin erkannte, dass alle von einem gemeinsamen Vorfahren abstammten und sich adaptiv radiiert hatten.",
        difficulty = 2,
        funFact = "Darwin erkannte die Bedeutung der Finken erst nach seiner Rückkehr in England, als der Ornithologe John Gould die verschiedenen Arten klassifizierte."
    ),

    // Question 39 – History of Science: Marie Curie
    Question(
        categoryId = 2,
        questionText = "Marie Curie entdeckte die Elemente Polonium und Radium. Welche wissenschaftliche Methode verwendete sie für ihre Entdeckungen?",
        answerA = "Sie analysierte das Spektrum von Pechblende mit einem Spektroskop und identifizierte unbekannte Spektrallinien",
        answerB = "Sie maß die Ionisationswirkung von Pechblende-Strahlung mit einem Elektrometer und isolierte durch chemische Fraktionierung radioaktive Komponenten, die stärker strahlten als reines Uran",
        answerC = "Sie verwendete Röntgenstrahlung, um die Kristallstruktur von Pechblende zu analysieren",
        answerD = "Sie erhitzte Pechblende in einem Massenspektrometer und trennte Isotope nach ihrer Masse",
        correctAnswer = 1, // B
        explanation = "Curie entwickelte eine quantitative Messmethode: Mit einem von Pierre Curie entwickelten piezoelektrischen Elektrometer maß sie die Ionisationskapazität (Radioaktivität) verschiedener Mineralien. Sie stellte fest, dass Pechblende stärker strahlte als reines Uran – es mussten unbekannte Elemente vorhanden sein. Durch tonnenweise chemische Aufarbeitung von Pechblende isolierte sie schließlich Polonium (1898) und Radium (1898).",
        difficulty = 2,
        funFact = "Marie Curie ist bis heute die einzige Person, die Nobelpreise in zwei verschiedenen Naturwissenschaften erhielt: Physik (1903) und Chemie (1911)."
    ),

    // Question 40 – History of Science: Watson & Crick
    Question(
        categoryId = 2,
        questionText = "Welche entscheidende experimentelle Grundlage verwendeten Watson und Crick für ihr 1953 vorgeschlagenes Doppelhelix-Modell der DNA?",
        answerA = "Biochemische Analysen von Chargaff, die zeigten, dass A = T und G = C (Chargaff-Regeln), sowie Röntgenkristallographiebilder von Franklin und Wilkins",
        answerB = "Elektronenmikroskopaufnahmen von DNA-Molekülen, die die Helix direkt zeigten",
        answerC = "Sequenzierungsdaten von Sanger, die die Basenreihenfolge der DNA enthüllten",
        answerD = "Kernspinresonanz-Spektren, die die chemischen Bindungen in der DNA aufklärten",
        correctAnswer = 0, // A
        explanation = "Watson und Cricks Modell basierte auf zwei Schlüsselquellen: 1) Chargaffs Regeln (1950): A/T- und G/C-Verhältnisse sind immer ~1:1, was auf spezifisches Basenpaaren hindeutet. 2) Rosalind Franklins Röntgenkristallographiebild 'Photo 51' (1952, aufgenommen von Wilkins' Gruppe) zeigte die helikale Struktur und den Abstand der Basenpaare (3,4 Å). Watson sah das Bild ohne Franklins explizite Zustimmung, was bis heute ethisch diskutiert wird.",
        difficulty = 2,
        funFact = null
    ),

    // ── CRYSTALLOGRAPHY BASICS ───────────────────────────────────────────────

    // Question 41 – Crystallography: Crystal Systems
    Question(
        categoryId = 2,
        questionText = "Wie viele Kristallsysteme gibt es in der Kristallographie, und welches hat die höchste Symmetrie?",
        answerA = "5 Systeme; das hexagonale System hat die höchste Symmetrie",
        answerB = "7 Systeme; das kubische System hat die höchste Symmetrie mit 48 Symmetrieelementen",
        answerC = "6 Systeme; das trigonale System hat die höchste Symmetrie",
        answerD = "9 Systeme; das tetragonale System hat die höchste Symmetrie",
        correctAnswer = 1, // B
        explanation = "Es gibt 7 Kristallsysteme: triklin, monoklin, orthorhombisch, tetragonal, trigonal (rhomboedrisch), hexagonal und kubisch. Das kubische System (isometrisch) besitzt die höchste Symmetrie mit 3 vierzähligen, 4 dreizähligen und 6 zweizähligen Drehachsen plus Spiegelebenen – insgesamt 48 Symmetrieoperationen. Beispiele: NaCl, Diamant, Pyrit.",
        difficulty = 2,
        funFact = "Diamant und Graphit sind beide reiner Kohlenstoff, aber Diamant kristallisiert kubisch, Graphit hexagonal – mit extrem unterschiedlichen Eigenschaften."
    ),

    // Question 42 – Crystallography: Unit Cells
    Question(
        categoryId = 2,
        questionText = "Was ist eine Elementarzelle (Einheitszelle) in der Kristallographie?",
        answerA = "Die kleinste sich wiederholende Einheit eines Kristallgitters, die die vollständige Symmetrie des Kristalls repräsentiert",
        answerB = "Ein einzelnes Atom oder Molekül, aus dem der Kristall aufgebaut ist",
        answerC = "Der Bereich um ein Atom, in dem Elektronen lokalisiert sind",
        answerD = "Die kleinste sichtbare Einheit eines Kristalls unter dem Lichtmikroskop",
        correctAnswer = 0, // A
        explanation = "Die Elementarzelle ist das kleinste dreidimensionale Parallelflach, das durch seine periodische Aneinanderreihung das gesamte Kristallgitter erzeugt. Sie wird durch Gitterkonstanten a, b, c (Kantenlängen) und Winkel α, β, γ beschrieben. Die Konvention wählt die Zelle so, dass sie alle Symmetrieelemente des Kristalls enthält. Für NaCl z.B. ist die kubisch-flächenzentrierte Elementarzelle mit Kantenlänge a = 5,64 Å.",
        difficulty = 2,
        funFact = null
    ),

    // Question 43 – Crystallography: Polymorphism
    Question(
        categoryId = 2,
        questionText = "Was ist Polymorphismus in der Kristallographie, und welches bekannte Beispiel veranschaulicht dieses Phänomen dramatisch?",
        answerA = "Polymorphismus ist das Vorkommen eines Stoffes in mehreren kristallinen Phasen mit unterschiedlichen Eigenschaften; Kohlenstoff: Diamant vs. Graphit",
        answerB = "Polymorphismus ist die Fähigkeit eines Kristalls, Licht unterschiedlich zu brechen je nach Einfallswinkel",
        answerC = "Polymorphismus bezeichnet Mischkristalle aus zwei verschiedenen Elementen mit zufälliger Anordnung",
        answerD = "Polymorphismus ist das Auftreten gleicher Strukturen in verschiedenen Verbindungen (Isotypie)",
        correctAnswer = 0, // A
        explanation = "Polymorphismus (Enantiomorphie ist ein Spezialfall) bedeutet, dass dieselbe chemische Verbindung in mehreren kristallinen Strukturen existiert. Kohlenstoff ist das eindrucksvollste Beispiel: Diamant (kubisch, sp³-Hybridisierung, härtestes natürliches Material) vs. Graphit (hexagonal, sp²-Schichten, weich und leitend). Weitere Beispiele: Calciumcarbonat als Calcit vs. Aragonit; Eisendioxid als Rutil, Anatas oder Brookit.",
        difficulty = 2,
        funFact = "Auch Schokolade zeigt Polymorphismus: Nur eine der sechs kristallinen Formen von Kakaobutter (Form V) gibt Schokolade den perfekten Schmelzpunkt und Glanz."
    ),

    // Question 44 – Crystallography: Quartz Piezoelectricity
    Question(
        categoryId = 2,
        questionText = "Warum zeigt α-Quarz Piezoelektrizität, während kubische Kristalle wie NaCl oder Diamant kein piezoelektrisches Verhalten zeigen?",
        answerA = "Quarz enthält Silizium, das ein Halbleiter ist und daher elektrische Ladungen erzeugt",
        answerB = "α-Quarz hat keine Inversionssymmetrie (nicht-zentrosymmetrische Raumgruppe), sodass mechanische Verformung die Ladungsschwerpunkte von Kationen und Anionen verschiebt und ein Dipolmoment erzeugt",
        answerC = "Quarz leitet Elektrizität besser als Diamant und kann daher Ladungen speichern",
        answerD = "Die SiO₂-Bindungen in Quarz sind ionisch und erzeugen bei Druck freie Elektronen",
        correctAnswer = 1, // B
        explanation = "Piezoelektrizität erfordert das Fehlen eines Inversionszentrums: α-Quarz (trigonal, Raumgruppe P3₁21) hat keine Inversionssymmetrie. Bei mechanischer Verformung verschieben sich die Ladungsschwerpunkte der Si⁴⁺- und O²⁻-Ionen gegeneinander – ein makroskopisches elektrisches Dipolmoment entsteht. Kubische Strukturen wie NaCl oder Diamant besitzen Inversionszentren; Verformungen kompensieren sich symmetrisch, kein Nettodipolmoment.",
        difficulty = 2,
        funFact = null
    ),

    // Question 45 – Crystallography: Snowflake Symmetry
    Question(
        categoryId = 2,
        questionText = "Warum haben Schneeflocken immer eine sechszählige Symmetrie (Hexagonalsymmetrie)?",
        answerA = "Weil Wassermoleküle hexagonale Cluster bevorzugen und die Eiskristallstruktur das Hexagonalgitter des Eises I_h widerspiegelt",
        answerB = "Weil Schneeflocken im Fall rotieren und durch die Corioliskraft sechseckige Formen annehmen",
        answerC = "Weil sechszählige Symmetrie energetisch am stabilsten ist – alle anderen Formen sind instabil",
        answerD = "Weil Schneeflocken aus sechs identischen Eisteilchen zusammengesetzt werden",
        correctAnswer = 0, // A
        explanation = "Eis I_h (gewöhnliches Eis) kristallisiert im hexagonalen System. Im Gitter bilden Wassermoleküle durch Wasserstoffbrückenbindungen sechseckige Ringe (jedes O-Atom tetraedisch von 4 Wasserstoffbrücken umgeben). Beim Wachstum der Schneeflocke scheiden sich H₂O-Moleküle bevorzugt an den sechs äquivalenten Ecken des hexagonalen Gitters ab – die makroskopische Form spiegelt die molekulare Kristallsymmetrie direkt wider.",
        difficulty = 2,
        funFact = "Der Botaniker Wilson Bentley fotografierte ab 1885 über 5.000 Schneeflocken und fand keine zwei identischen – tatsächlich ist die Wahrscheinlichkeit identischer Formen astronomisch gering."
    ),

    // ── ANIMAL PHYSIOLOGY ────────────────────────────────────────────────────

    // Question 46 – Animal Physiology: Echolocation
    Question(
        categoryId = 2,
        questionText = "Welche Frequenzbereiche verwenden Fledermäuse für ihre Echoortung, und warum sind diese Frequenzen für die Ortungspräzision vorteilhaft?",
        answerA = "Infraschall (< 20 Hz), weil niedrige Frequenzen weiter durch die Nacht reisen",
        answerB = "Ultraschall (20 kHz – 200 kHz); kurze Wellenlängen ermöglichen die Auflösung kleiner Objekte (Insekten), und hohe Frequenzen liefern präzisere Zeitmarken für die Distanzberechnung",
        answerC = "Sichtbares Licht (400–700 nm), das Fledermäuse mit speziellen Augen wahrnehmen",
        answerD = "Mikrowellen (1–10 GHz), die durch das Fell gesendet und von Insekten reflektiert werden",
        correctAnswer = 1, // B
        explanation = "Fledermäuse senden Ultraschallpulse von ~20–200 kHz aus. Die Wellenlänge λ = c/f bestimmt die minimale auflösbare Objektgröße: Bei 50 kHz beträgt λ ≈ 6,8 mm – gerade genug, um Insekten aufzulösen. Höhere Frequenzen ermöglichen feinere Auflösung, dämpfen aber schneller in der Luft. Das Doppler-Shift der Echos verrät Beutegeschwindigkeit und -richtung. Einige Arten (z.B. Große Hufeisennase) nutzen konstante Frequenz-Rufe für Doppler-Analyse.",
        difficulty = 2,
        funFact = null
    ),

    // Question 47 – Animal Physiology: Electric Eels
    Question(
        categoryId = 2,
        questionText = "Wie erzeugt der Zitteraal (Electrophorus electricus) Spannungen von bis zu 860 Volt?",
        answerA = "Durch Reibung spezieller Schuppen, die statische Elektrizität aufbauen",
        answerB = "Durch spezialisierte Elektrozyten – in Reihe geschaltete, modifizierte Muskelzellen, die je ~150 mV erzeugen; ihre serielle Summe ergibt die hohe Gesamtspannung",
        answerC = "Durch Biolumineszenz-Reaktionen, die UV-Photonen in elektrische Energie umwandeln",
        answerD = "Durch metabolische Oxidation von Fettsäuren in speziellen Lebergeweben mit direkter Elektrizitätsabgabe",
        correctAnswer = 1, // B
        explanation = "Elektrozyten sind modifizierte Muskelzellen (Abkömmlinge von Muskelzellen, die ihre kontraktile Funktion verloren haben). Jede Elektrozyte erzeugt durch Na⁺/K⁺-Ionenkanäle ein Aktionspotential von ~150 mV. Die Zitteraale haben ~6.000 Elektrozyten in Reihe geschaltet (wie Batterien in Serie): 6.000 × 0,15 V = 860 V. Der Zitteraal kann außerdem schwache elektrische Felder zur Elektroortung nutzen.",
        difficulty = 2,
        funFact = "Zitteraale können für kurze Zeit aus dem Wasser springen und elektrische Entladungen auf Fressfeinde abgeben, die sie am Ufer bedrohen."
    ),

    // Question 48 – Animal Physiology: Chameleon Color Change
    Question(
        categoryId = 2,
        questionText = "Durch welchen Mechanismus ändert ein Chamäleon seine Farbe, und welchem Hauptzweck dient dies?",
        answerA = "Chamäleons produzieren verschiedene Pigmente je nach Umgebungstemperatur zur Tarnung",
        answerB = "Chamäleons nutzen nanostrukturierte Guaninkristalle in Iridophor-Zellen; durch muskuläre Dehnung ändern sie den Kristallabstand und damit die reflektierte Lichtfarbe – hauptsächlich zur Kommunikation, nicht zur Tarnung",
        answerC = "Chamäleons absorbieren Umgebungsfarben durch Photorezeptoren in der Haut und re-emittieren diese",
        answerD = "Spezielle Chromatophoren expandieren und kollabieren mechanisch, um verschiedene Pigmentschichten freizulegen",
        correctAnswer = 1, // B
        explanation = "In der oberen Hautschicht haben Chamäleons Iridophoren mit einem Gitter aus Guaninkristallen. Wenn Muskeln die Haut dehnen oder entspannen, ändert sich der Abstand der Kristalle. Dieses photonische Kristallgitter reflektiert nach dem Bragg-Gesetz λ = 2nd·cos(θ) unterschiedliche Wellenlängen. Hauptzweck: Kommunikation (Dominanz, Paarungsbereitschaft, Stimmung), nicht primär Tarnung – dafür haben Chamäleons eine dauerhafte Grundfärbung.",
        difficulty = 2,
        funFact = null
    ),

    // Question 49 – Animal Physiology: Eagle Vision
    Question(
        categoryId = 2,
        questionText = "Warum ist das Sehvermögen eines Adlers dem des Menschen erheblich überlegen, und welche anatomischen Merkmale ermöglichen dies?",
        answerA = "Adler sehen im UV-Bereich, der für Menschen unsichtbar ist, was ihnen zusätzliche Informationen liefert",
        answerB = "Adler haben eine höhere Dichte von Zapfen in der Fovea (~1 Mio./mm² vs. ~200.000 beim Menschen) und besitzen zwei Foveae, was sowohl Schärfe als auch Weitwinkel-Schärfe kombiniert",
        answerC = "Adler haben eine flachere Linse, die weniger Licht bricht und so Verzerrungen vermeidet",
        answerD = "Adler haben drei Augen – das dritte liegt zentral und übernimmt die Fernsicht",
        correctAnswer = 1, // B
        explanation = "Adleraugen haben eine extrem hohe Zapfendichte in der Fovea centralis (~1 Million Zapfen/mm² vs. ~200.000 beim Menschen) – das ermöglicht ca. 4–8× höhere Sehschärfe. Zusätzlich besitzen viele Greifvögel zwei Foveae (fovea centralis für geraden Blick, fovea temporalis für seitlichen Blick mit Tiefenwahrnehmung). Außerdem sehen viele Raptoren im nahen UV (Mäuseurin fluoresziert unter UV – nützlich zur Jagd).",
        difficulty = 2,
        funFact = "Ein Steinadler kann eine Maus aus 3 km Entfernung erkennen – entspricht dem Lesen einer Zeitungsschlagzeile aus 100 m Entfernung."
    ),

    // Question 50 – Animal Physiology: Elephant Infrasound
    Question(
        categoryId = 2,
        questionText = "Wie kommunizieren Elefanten über große Distanzen mit Infraschall, und über welchen Weg nehmen sie diese Signale wahr?",
        answerA = "Elefanten senden Infraschall über spezielle Atemöffnungen aus; sie empfangen ihn ausschließlich über ihre großen Ohren",
        answerB = "Elefanten produzieren Infraschallrufe (14–35 Hz) im Kehlkopf; die Signale breiten sich als Bodenvibration aus und werden über die Fußsohlen und das Skelett zur Cochlea geleitet",
        answerC = "Elefanten kommunizieren über elektrische Feldimpulse, die durch Ultraschall der Stoßzähne erzeugt werden",
        answerD = "Infraschall wird durch Rüsselschwingungen erzeugt und mit den Backenzähnen als Resonatoren empfangen",
        correctAnswer = 1, // B
        explanation = "Elefanten produzieren tiefe Rufe (14–35 Hz, unterhalb menschlicher Hörschwelle) im Kehlkopf. Infraschall breitet sich nicht nur durch Luft aus (bis ~10 km), sondern auch als seismische Wellen im Boden (bis ~16 km). Elefanten nehmen Bodenvibration über Mechanorezeptoren in den Fußpolstern ('Paccini-Körperchen') wahr; die Vibrationen werden über die Knochen des Beins zum Innenohr weitergeleitet – eine Art 'Knochenhören'.",
        difficulty = 2,
        funFact = "Elefanten können einen Erdbeben-Tsunami bis zu 24 Stunden vor Menschen wahrnehmen – ihre Seismosensoren registrieren die Vorläuferwellen."
    )

)
