package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsMaster3(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) — Palaeozoology & Comparative Anatomy ──

    Question(
        categoryId = 9,
        questionText = "Welche genaue stratigraphische Lage innerhalb des Burgess-Schiefers (British Columbia) lieferte die urspruengliche Fauna, die Charles Doolittle Walcott 1909 entdeckte?",
        answerA = "Phyllopod Bed der Walcott Quarry Formation",
        answerB = "Greater Phyllopod Bed im Raymond Quarry Member",
        answerC = "Otiia Bed der Mount Stephen Formation",
        answerD = "Ogygopsis Shale des Cathedral Formation",
        correctAnswer = 0,
        explanation = "Walcott entdeckte 1909 das Phyllopod Bed in der Walcott Quarry, Burgess Pass, British Columbia. Dieses Lagerstaettenniveau innerhalb der Stephen Formation (Mittleres Kambrium, ca. 508 Mio. Jahre) enthielt die beruehmteste kambrozische Fauna und zeigt aussergewoehnliche Weichteilerhaltung durch rasche Einbettung in anoxischen Feinschlamm.",
        difficulty = 5,
        funFact = "Walcott entdeckte die Fundstelle zufaellig, als sein Pferd auf dem Weg den Burgess Pass hinunter strauchelte und dabei eine Platte mit Fossilien aufdeckte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche radiometrische Datierungsmethode wird bevorzugt verwendet, um die absolute Altersbestimmung kambrischer Gesteine vorzunehmen, und welches Zerfallspaar wird dabei genutzt?",
        answerA = "Kalium-Argon (K-Ar), Zerfall von K-40 zu Ar-40",
        answerB = "Uran-Blei (U-Pb) an Zirkon, Zerfall von U-238 zu Pb-206 und U-235 zu Pb-207",
        answerC = "Rubidium-Strontium (Rb-Sr), Zerfall von Rb-87 zu Sr-87",
        answerD = "Samarium-Neodym (Sm-Nd), Zerfall von Sm-147 zu Nd-143",
        correctAnswer = 1,
        explanation = "Die U-Pb-Datierung an Zirkonkristallen (Zirkondatierung) ist die bevorzugte Methode fuer kambrozische und praekambrische Gesteine. Zirkon schliesst beim Kristallisieren Uran ein, aber kein Blei, sodass das gesamte Pb radiogen ist. Die Concordia-Diagramm-Methode (Wetherill 1956) erlaubt selbst bei partiellen Bleiverlustereignissen praezise Altersbestimmungen.",
        difficulty = 5,
        funFact = "Die bisher aeltesten bekannten Zirkone aus dem Jack Hills (Westaustralien) sind 4,4 Milliarden Jahre alt — aelter als die aeltesten Gesteine der Erde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche anatomische Besonderheit unterscheidet Tiktaalik roseae (Devon, ~375 Mio. Jahre) von allen vorherigen Fischen und macht ihn zum Schluesselfossil des Uebergangs von Wasser zu Land?",
        answerA = "Vorhandensein von Lungen statt Kiemen",
        answerB = "Modifizierter Pectoralflossenguertels mit Humerus, Radius, Ulna und distalen Handwurzelknochen in einer gewichtstragenden Anordnung",
        answerC = "Fehlen von Schuppen und Entwicklung einer amnioten Haut",
        answerD = "Besitz von fuenf distinkten Fingern an jeder Flosse",
        correctAnswer = 1,
        explanation = "Tiktaalik roseae (2004 entdeckt von Daeschler, Shubin, Jenkins) zeigt als erster bekannter Fisch einen vollstaendig tetrapoden Schulterguertels mit freiem Humerus, Radius und Ulna sowie proximalen Handwurzelknochen. Der flache Kopf mit Nackenregion (Hals) und die Faehigkeit, den Koerper mit den Flossen zu stuetzen, sind als Uebergangsmorphologie belegt. Es fehlen jedoch noch echte Ziffern.",
        difficulty = 5,
        funFact = "Tiktaalik bedeutet in der Inuktitut-Sprache 'grosser Suesswaasserfisch' — der Name wurde von den Inuit-Aeltesten der Region vergeben, in der das Fossil auf Ellesmere Island, Kanada, gefunden wurde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Theorie erklaert die Kambrium-Explosion (ca. 541-515 Mio. Jahre) durch einen rapiden Anstieg der Sauerstoffkonzentration im Ediacaran-Kambrium-Uebergang, kombiniert mit welchem anderen Mechanismus?",
        answerA = "Snowball-Earth-Ereignisse gefolgt von Treibhauseffekt und erhoehter UV-Strahlung",
        answerB = "Erhoehung atmosphaerischer O2 auf ~10% PAL (Present Atmospheric Level) kombiniert mit evo-devo-Innovationen bei Signalwegen (Wnt, Notch, Hedgehog)",
        answerC = "Massenaussterben der Ediacara-Fauna durch Meteoriteneinschlag freigab oekologische Nischen",
        answerD = "Plattentektonische Neuordnung durch Gondwana-Zerfall und Entstehung flacher Epikontinentalmeere",
        correctAnswer = 1,
        explanation = "Die am staerksten belegte Kombination fuer die Kambrium-Explosion umfasst: (1) Anstieg von O2 auf ca. 10% PAL (Logan et al. 1995, Canfield et al. 2007) ermoeglichte groessere aktive Tiere mit Kollagen-basiertem Bindegewebe; (2) Innovation bei konservierten Entwicklungssignalwegen (Wnt, Notch, TGF-beta, Hedgehog) erlaubte komplexe Koerperpplaene. Beide Faktoren zusammen werden als 'developmental toolkit expansion' verstanden.",
        difficulty = 5,
        funFact = "Die Ediacara-Biota verschwand fast vollstaendig an der Ediacaran-Kambrium-Grenze — ob durch Konkurrenz mit neuen kambrozischen Tieren oder durch Umweltveraenderungen, ist noch nicht abschliessend geklart."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische anatomische Struktur bei Archaeopteryx lithographica (Jura, ~150 Mio. Jahre) wurde als entscheidend fuer die Klassifikation als Vogelvorfahre vs. Theropoden-Dinosaurier kontrovers diskutiert, und wie ist der aktuelle wissenschaftliche Konsens?",
        answerA = "Das Vorhandensein von Federn; Konsens: Archaeopteryx ist ein Vogelvorfahre",
        answerB = "Die Furcula (Gabelbein) und der umkehrbare Hallux; Konsens: Archaeopteryx liegt innerhalb der Aves als basalstes Mitglied",
        answerC = "Der Wishbone und die klauentragenden Fluegel; Konsens: Archaeopteryx ist ein nicht-avialer Theropod",
        answerD = "Die asymmetrischen Flugfedern und Pygostyl; Konsens: Archaeopteryx ist konvergent zu Voegeln entwickelt",
        correctAnswer = 2,
        explanation = "Xu Xings 2011-Neuanalyse und spaetere phylogenetische Studien (Turner et al. 2012, Baron et al. 2017) platzierten Archaeopteryx zeitweise ausserhalb der Aves als basalsten nicht-avialen Paravian. Der aktuelle Konsens (Lee et al. 2014, Padian & Chiappe) sieht Archaeopteryx wieder als basalstes bekanntes Mitglied der Aves. Die Furcula (Gabelbein als Vogelmerkmal) kombiniert mit klauentragenden Fluegeln und freien Fingern zeigt seinen Uebergangscharakter. Kein Pygostyl vorhanden — Steuer durch langen Schwanz.",
        difficulty = 5,
        funFact = "Von Archaeopteryx sind 12 Skelettexemplare bekannt, wobei das Berliner Exemplar (Humboldt Museum) als das vollstaendigste gilt und sogar Weichteilabdruecke von Federn zeigt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches spezifische Merkmal der Ediacaran-Biota (635-541 Mio. Jahre) bei Dickinsonia costata deutet nach neuesten isotopischen Analysen (Bobrovskiy et al. 2018) auf tierisches Leben hin?",
        answerA = "Vorhandensein von Kollagen in fossilen Biofilmen",
        answerB = "Cholesterin-Biomarker (Cholesterol und andere Sterole) in direkter Assoziation mit dem Fossil",
        answerC = "Bilaterale Symmetrie und metamere Segmentierung",
        answerD = "Zellulare Differenzierung nachgewiesen durch Immunhistochemie an Fossilien",
        correctAnswer = 1,
        explanation = "Bobrovskiy et al. (2018, Science) analysierten organische Molekuele in Dickinsonia-Fossilien aus russischem Ediacaran. Sie fanden ausschliesslich Cholesterol und Ergosterol-Vorstufen (tier- und pilztypische Sterole), waehrend der umliegende Schiefer nur Algaene (bakterielle Hopanoide) enthielt. Dies gilt als bisher staerkster geochemischer Beweis, dass Dickinsonia ein vielzelliges Tier war.",
        difficulty = 5,
        funFact = "Dickinsonia costata erreichte Laengen von bis zu 1,4 Metern und galt lange als eines der raetselhaftesten Organismen des Ediacaran — ob Pflanze, Tier oder eine eigene Gruppe war jahrzehntelang debattiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion hatte der Nasenaufsatz (Prominenz) des Hadrosauroiden-Dinosauriers Parasaurolophus walkeri gemaess der am besten belegten Hypothese, und welche anatomische Analyse unterstuetzt dies?",
        answerA = "Thermoregulation durch vergroesserte Blutgefaessnetze, belegt durch Histo-Tomographie",
        answerB = "Schallresonator fuer arttypische Vokalisationen; CT-Scans zeigen interne Rohrensysteme verbunden mit dem Nasengang",
        answerC = "Schnorchel-Funktion zum Untertauchen; belegt durch Vergleich mit Krokodilnasenstrukturen",
        answerD = "Sexualdimorphismus-Signal ohne Funktion; bestaetigt durch histologische Wachstumsstudien",
        correctAnswer = 1,
        explanation = "CT-Scans (Evans et al. 2009, Anatomical Record) zeigten, dass der hohle Aufsatz von Parasaurolophus komplexe Rohrensysteme enthaelt, die vom Nasengang durch den Kamm bis in die Schadelbasis fuehren. Akustische Modellierung (Weishampel 1981, verfeinert durch Evans 2009) ergab Resonanzfrequenzen im Tieftonbereich (ca. 48-240 Hz), was arttypische niederfrequente Laute ermoeglichte. Dies ist die am besten belegte Hypothese durch beide Methoden.",
        difficulty = 5,
        funFact = "2012 rekonstruierte ein Team um Evans und Bernhard akustisch den moeglichen Klang von Parasaurolophus — das Ergebnis klingt wie ein tiefer, nasaler Trompetenton und wurde in einer wissenschaftlichen Videosimulation veroffentlicht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Veraenderung in der Ohrknochenmorphologie markiert den evolutionaeren Uebergang von Cynodontia (Therapsida) zu den Mammalia, und welche Homologien gelten als gesichert?",
        answerA = "Entstehung des Mittelohres durch Reduktion des Quadratum; das Incus homolog zum Quadratum, Malleus homolog zum Articulare",
        answerB = "Fusion des Dentale zum einzigen Unterkieferknochen und Wanderung von Quadratum (Incus) und Articulare (Malleus) in die Mittelohrhohle",
        answerC = "Entstehung eines Trommelfells durch Invagination der Haut ueber dem Hyoid-Bogen",
        answerD = "Neuentstehung des Stapes aus dem Columella-Vorlaeufer der Reptilien ohne Homologie zum Reptilien-Kiefer",
        correctAnswer = 1,
        explanation = "Fossil-Evidenz aus Cynodontia-Uebergangsformen (z.B. Probainognathus, Brasilodon) zeigt schrittweise: (1) Reduktion aller Unterkieferknochen ausser Dentale; (2) Dentale-Surangulare-Gelenk ersetzt Articulare-Quadratum-Kiefergelenk; (3) Articulare wird Malleus, Quadratum wird Incus, Columella bleibt Stapes. Morganucodon und Hadrocodium dokumentieren das Mittelstadium mit noch vorhandenem post-dentalen Knochen-Komplex.",
        difficulty = 5,
        funFact = "Dieser Kieferknochen-zu-Gehoerknoechelchen-Uebergang ist einer der am besten dokumentierten Uebergaenge der Evolutionsgeschichte — mit lueckenlosen Zwischenstufen ueber 30 Millionen Jahre."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher spezifische Mechanismus erklaert die extrem praezise Erhaltung von Weichteilen im Burgess Shale und aehnlichen Lagerstaetten (Konzentrat-Lagerstaetten), und welche taphonomische Sequenz ist dabei belegt?",
        answerA = "Schnelle Verkieselung durch SiO2-gesaettigtes Hydrothermallwasser direkt nach dem Tod",
        answerB = "Pyritisierung durch sulfatreduzierende Bakterien unter anoxischen Bedingungen bei erhoehtem Fe-Gehalt",
        answerC = "Anoxisches, sulfatarmes Tiefenwasser verhinderte mikrobielle Zersetzung; rascher Transport durch Truebestroemungen in anoxische Sedimentzone; Aluminosilikat-Aufflockung (clay flocculation) konservierte Weichteile",
        answerD = "Einbalsamierung durch organische Teer-Exhalationen aus dem Meeresboden",
        correctAnswer = 2,
        explanation = "Canfield & Farquhar (2009) und Gaines et al. (2012, Geology) belegten den Burgess-Shale-Mechanismus: anoxisches, sulfatarmes Tiefenwasser (Sulfat < 0,1 mM) verhinderte sulfatreduzierende Bakterien, die normalerweise Weichteile zersetzen. Truebestroemungen transportierten Lebewesen rasch in diese Zone. Tonminerale (Illit/Kaolinit) filtrierten mikrobielle Kolonie-Bildung. Die Folge ist karbonnatreiche, organisch erhaltene Mineralreplizierung (Kohlenstoff-Ruckstaende).",
        difficulty = 5,
        funFact = "Die Chengjiang-Fauna (Yunnan, China, ~520 Mio. Jahre), aelter als der Burgess Shale, zeigt durch phosphatische Mineralisation sogar 3D-erhaltene Weichteile und gilt als noch bedeutendere Lagerstaette."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Synapomorphie vereint Anomalocaris canadensis, Hurdia victoria und Peytoia nathorsti innerhalb der Klade Radiodonta (Burgess Shale-Kambrium)?",
        answerA = "Vorhandensein von gegliedertem Bauchpanzer aus Sklerotindurchtraenkten Platten",
        answerB = "Paarige frontal appendages (Greifanhaenge) vor dem Mund und ein kreisfoermiges Mund-Apparat aus Platten",
        answerC = "Biraminose Beinstruktur mit Exopodit und Endopodit analog zu Crustaceen",
        answerD = "Kambrozische Komplexaugen mit mehr als 16.000 Ommatidien belegt durch Fossilbefunde",
        correctAnswer = 1,
        explanation = "Radiodonten (Anomalocarida) werden durch zwei Schluesselmorphologien definiert: (1) paarige frontal appendages (grosse ventrale Greifanhaenge aus mehrgliedrigen Segmenten), (2) ein kreisfoermiger Mund-Apparat (oral cone) aus radial angeordneten Sklerotplatten. Anomalocaris war mit bis zu 60 cm das groesste Raubtier des Kambriums. Van Roy et al. (2015) und Cong et al. (2014) belegten diese Synapomorphien durch aussergewoehnlich erhaltene Exemplare.",
        difficulty = 5,
        funFact = "Anomalocaris wurde zunaechst als drei verschiedene Tiere beschrieben: die Greifanhaenge als Garnelen, der Mund-Apparat als Qualle (Peytoia) und der Rumpf als Schwamm — erst 1985 wurden alle Teile als ein Tier erkannt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Theorie erklaert die Entstehung der Mitochondrien durch endosymbiotische Aufnahme eines Alpha-Proteobakteriums, und welche spezifischen phylogenomischen Evidenzen stuetzen dies bei Tieren?",
        answerA = "Serial Endosymbiosis Theory (SET, Margulis 1967): mitochondriale Gene zeigen groesste Aehnlichkeit zur Rickettsiales (Alpha-Proteobacteria)",
        answerB = "Autogene Theorie: Mitochondrien entstanden durch Invagination der Plasmamembran in Proto-Eukaryoten",
        answerC = "Thermoplasma-Theorie: Archaeen-Symbiose als Grundlage des Eukaryoten-Kerns mit separatem Mitochondrienursprung",
        answerD = "Hydrogenosom-Theorie: Anaerobe Wasserstoff-produzierende Organellen transformierten sich bei erhoehtem O2 in Mitochondrien",
        correctAnswer = 0,
        explanation = "Lynn Margulis' SET (1967) wird durch umfangreiche phylogenomische Daten gestuetzt: (1) mitochondriale Proteine zeigen hoechste Sequenzaehnlichkeit zu Rickettsiales (Alphaproteobacteria, insbesondere Rickettsia); (2) mitochondriale Ribosomen sind prokaryotisch (70S); (3) doppelte Membran entspricht Gram-negativem Bakterium; (4) Mitochondrien teilen sich durch Binaerteilung; (5) mitochondriale DNA ist zirkulaer (in urspruenglicheren Tieren). Phylogenomik platziert Alpha-Proteobacteria als Schwestertaxon aller Mitochondrien.",
        difficulty = 5,
        funFact = "Mitochondrien haben ihre eigene DNA bereits stark reduziert — das menschliche Mitochondriengenom kodiert nur noch 37 Gene, waehrend Tausende mitochondrialer Proteine vom Kerngenom kodiert werden, ein Prozess namens 'gene transfer to the nucleus'."
    ),

    Question(
        categoryId = 9,
        questionText = "Was kennzeichnet die Homologie des Cetaceen-Flipper-Skeletts (Balaenoptera musculus) mit dem Tetrapoden-Vorderextremitaet-Grundbauplan nach der vergleichenden Anatomie?",
        answerA = "Vollstaendige Reduktion aller Handwurzelknochen; nur Humerus und zwei Metakarpen erhalten",
        answerB = "Humerus verkuerzt, Radius/Ulna hyperphalangisiert, alle fuenf Finger erhalten mit stark vermehrten Phalangen (Hyperphalangie) bei Beibehaltung des Tetrapoden-Grundbauplans",
        answerC = "Neuentstehung von Flipperstrukturen aus modifiziertem Bindegewebe ohne Skeletthomologien",
        answerD = "Verschmelzung aller Handknochen zu einer einzigen Platte durch Synostose",
        correctAnswer = 1,
        explanation = "Der Wal-Flipper zeigt klassische Homologie zum Tetrapoden-Pentadactyl-Extremitaet: Humerus, Radius und Ulna sind verkuerzt und fusioniert, aber die Grundelemente sind erkennbar. Charakteristisch ist Hyperphalangie: alle fuenf Finger sind vorhanden, aber mit stark vermehrten Phalangen (besonders Finger II und III mit 3-14 Phalangen statt der normalen 2-3). Embryologisch entwickeln sich diese Strukturen aus identischen Extremitaetenknospen-Regionen wie bei Landwirbeltieren.",
        difficulty = 5,
        funFact = "Blauwale haben trotz fehlendem aeusserlichen Finger noch rudimentaere Nagunanlagen als Embryonen, die waehrend der Entwicklung rueckgebildet werden — Evo-Devo-Beweis fuer die tetrapode Herkunft."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Extinktionsereignis am Ende des Perms (Perm-Trias-Grenze, ~252 Mio. Jahre) ist als schwerste Massenaussterbung der Phanerozoikums dokumentiert, und welche kombinierten Ursachen gelten nach aktuellem Forschungsstand als belegt?",
        answerA = "Chicxulub-Einschlag; 90% mariner Arten verloren durch Staubschleier und saurer Regen",
        answerB = "Sibirischer Trapp-Vulkanismus (LIP: Large Igneous Province) fuehrer zu CO2-Anstieg, Ozeanversauerung, Ozeananiox und Erderwaermung; ca. 90-96% mariner Arten, 70% terrestrischer Gattungen ausgestorben",
        answerC = "Snowball Earth-Ereignis kombiniert mit Methanklathraten-Freisetzung aus Tiefseelagern",
        answerD = "Gamma-Strahlenausbruch (GRB) kombiniert mit Ozonschichtzerfall und UV-Hyperstrahlung",
        correctAnswer = 1,
        explanation = "Das Perm-Trias-Massenaussterben (ca. 252,24 Mio. Jahre, GSSP in Meishan, China) vernichtete 90-96% mariner Arten und 70% terrestrischer Gattungen. Hauptursache: Sibirischer Trapp-Vulkanismus (2-3 Millionen km3 Basalt) setzte massive CO2- und SO2-Mengen frei. Folgen: (1) globale Erwaermung um ca. 8-10°C; (2) Ozean-Versauerung (pH-Abfall um 0,7 Einheiten); (3) ozeanische Anoxie; (4) Ozonabbau durch vulkanische Halogene. Chen & Benton (2012, Nature Geoscience) dokumentierten die ~5-Millionen-Jahr-Erholung danach.",
        difficulty = 5,
        funFact = "Das Perm-Trias-Aussterben betraf fast alle Riffriffe der Erde so gravierend, dass echte Korallenriffe erst in der mittleren Trias, also ca. 10 Millionen Jahre spaeter, wieder entstanden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche homologe Struktur im Tetrapoden-Vorderbein entspricht anatomisch der 'Fibula' im Hinterbein, und auf welche entwicklungsbiologische Grundlage beruht diese Homologie?",
        answerA = "Der Humerus entspricht der Fibula; beide sind durch HoxA-Cluster reguliert",
        answerB = "Die Ulna entspricht der Fibula; beide sind postaxiale Elemente, durch HoxD-Cluster (Hoxd11-13) und posterior Shh-Signalgebung reguliert",
        answerC = "Der Radius entspricht der Fibula; beide sind praexiale Elemente des Zeugopodiums",
        answerD = "Das Intermedium entspricht der Fibula; beide entstehen aus dem axialen Karpal-Mesenchym",
        correctAnswer = 1,
        explanation = "Ulna (Vorderbein) und Fibula (Hinterbein) sind serielle Homologa als postaxiale Elemente des Zeugopodiums. Beide entstehen durch vergleichbare genetische Programme: Shh-Signal (Sonic Hedgehog) aus der posterioren Extremitaetenknospe reguliert die postaxiale Identitaet; HoxD-Gene (Hoxd9-13) bestimmen die distalen Elemente beider Extremitaeten. Die Konzepte der seriellen vs. spezifischen Homologie (Owen 1843) unterscheiden zwischen Homologien innerhalb eines Organismus (Ulna/Fibula) vs. zwischen Organismen (Ulna/Ulna).",
        difficulty = 5,
        funFact = "Richard Owen praegte 1843 die Begriffe 'Homologie' und 'Analogie' und unterschied serielle Homologie (gleiche Struktur innerhalb eines Koerpers) von spezifischer Homologie (gleiche Struktur zwischen Arten) — ein Grundlagenkonzept der vergleichenden Anatomie."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Fossil aus dem Ordovizium (~450 Mio. Jahre) gilt als fruehester sicherer Beleg fuer landlebende Wirbeltiere oder Wirbeltiervorfahren, und was sind seine diagnostischen Merkmale?",
        answerA = "Cooksonia pertoni (Pflanze); kein Wirbeltierfossil aus dem Ordovizium bekannt, frueheste sind devonisch",
        answerB = "Arandaspis prionotolepis (Kieferloser Fisch) aus dem Ordovizium Australiens; zeigt Knochenplatten und ist ein Fisch, kein Landtier",
        answerC = "Promissum pulchrum (Conodont) aus dem Ordovizium Suedafrikas; grosses Chordat ohne Landmerkmale",
        answerD = "Keine gesicherten Landwirbeltiere aus dem Ordovizium; frueheste sind Ichthyostega und Acanthostega aus dem Spae-Devon (~374 Mio. Jahre)",
        correctAnswer = 3,
        explanation = "Es gibt keine gesicherten Landwirbeltiere aus dem Ordovizium. Die fruehesten echten Tetrapoden (landlebende Wirbeltiere) sind Ichthyostega stensioei und Acanthostega gunnari aus dem Spaeten Devon (Famennian, Groenland, ~374 Mio. Jahre; Clack 2002). Arandaspis ist ein echter Ordovizian-Fisch (agnath), aber rein aquatisch. Ordovizische Wirbeltiere sind ausschliesslich Fische (Arandaspida, Eriptychiida). Landgangspuren von Arthropoden exisieren schon im Ordovizium.",
        difficulty = 5,
        funFact = "Acanthostega besass acht Ziffern an jedem Vorderbein und war vermutlich noch ueberwiegend aquatisch — die Reduktion auf fuenf Ziffern (Pentadaktylie) erfolgte erst spaeter in der Tetrapoden-Evolution."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Struktur im Saeugertiergehirn gilt als vergleichend-anatomisches Homologon zum Archistriatum (Paleostriatum) der Voegel, und welche Funktion teilen beide?",
        answerA = "Das Cerebellum; beide koordinieren motorisches Lernen und Bewegungssequenzen",
        answerB = "Die Amygdala; beide sind beteiligt an emotionaler Verarbeitung, Angst-Konditionierung und Gedaechtnis-Konsolidierung",
        answerC = "Der Hippocampus; beide sind raeumliches Gedaechtnis und Navigation",
        answerD = "Der Thalamus; beide fungieren als sensorischer Relay-Hub",
        correctAnswer = 1,
        explanation = "Das Archistriatum der Voegel (nach moderner Nomenklatur: Arcopallium) gilt als homolog zur Saeugetier-Amygdala. Beide entstammen derselben entwicklungsbiologischen Region (subpalliale Telencephalon-Anlage, Emx1-negativ, Dlx-positiv). Phylogenetisch und funktionell teilen beide Strukturen Rollen in emotionaler Verhaltenssteuerung, Angstkonditionierung und neuroendokriner Regulation. Reiner & Perkel (2004) und die Avian Brain Nomenclature Consortium (2005) revidierten die Vogelhirn-Nomenklatur, um diese Homologien korrekt widerzuspiegeln.",
        difficulty = 5,
        funFact = "Die alte Vorstellung, dass Voegel 'primitive Reptiliengehirne' hatten, ist widerlegt: Kraehen, Papageien und Singvoegel zeigen kognitive Leistungen, die frueheren Primatenstudien entsprechen, trotz grundlegend anderer Gehirnarchitektur."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Perm-zeitliche (Cisuralian, ~290 Mio. Jahre) Pelycosaur-Fossil zeigt als fruehestes Saeugetier-Stammlinienmitglied einen sagittalen Knochen-Segel und ist oekologisch als was eingeordnet?",
        answerA = "Edaphosaurus boanerges; herbivorer Pelycosaurier mit Zahnknoollen auf dem Neuraldornsegl",
        answerB = "Dimetrodon limbatus; apikaler Predator des Frueh-Perms; Segelstruktur aus verlaengerten Neuraldornen diente moeglicher Thermoregulation",
        answerC = "Casea broilii; ganzpflanzenfressender Basispelycosaurier mit kleinem Segel",
        answerD = "Ophiacodon uniformis; semiaquatischer Fischfresser mit reduziertem Segel",
        correctAnswer = 1,
        explanation = "Dimetrodon limbatus (Frueh-Perm, Texas/Oklahoma, ca. 295-272 Mio. Jahre) war der dominante Predator seiner Zeit. Das Segel aus bis zu 1,8 m langen Neuraldornen diente nach Thermoregulations-Modellen (Bennett 1996) als Heizflaeche: Modellierungen zeigen, dass ein 250 kg-Dimetrodon mit Segel 80 Minuten weniger brauchte, um Betriebstemperatur zu erreichen als ohne. Dimetrodon ist kein Dinosaurier, sondern ein Synapsid (Saeugetier-Stammlinie) aus der Klade Sphenacodontidae.",
        difficulty = 5,
        funFact = "Dimetrodon ist naeher mit Saeugetieren verwandt als mit Dinosauriern — wer Dimetrodon in die Dinokiste legt, macht denselben phylogenetischen Fehler wie einen Menschen zwischen Krokodile zu sortieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche vergleichend-anatomische Theorie postuliert, dass Flossen und Extremitaeten aus den gleichen Vorlaeuferstrukturen entstehen, und wie heisst das paarige Vorlaeufer-Element?",
        answerA = "Fin-Fold-Theorie (Balfour 1876): Paarige laterale Hautfalten (lateral fin folds) sind Vorlaeufer paariger Extremitaeten; Archetyp-Element: Archipterygiun",
        answerB = "Gill-Arch-Theorie (Gegenbaur 1870): Extremitaeten entstanden aus modifizierten Kiemenboegen; homologes Vorlaeufer: Viszeral-Bogen",
        answerC = "Neopallium-Theorie: Extremitaeten wuchsen aus Bauchrippenpaaren heraus ohne Fin-Fold-Vorlaufer",
        answerD = "Segmentation-Theorie (Remak): Extremitaeten entsprechen vergroesserten Koerpersegmenten (Metamere)",
        correctAnswer = 0,
        explanation = "Die Fin-Fold-Theorie (Balfour 1876, unabhaengig Thacher und Mivart) postuliert, dass paarige Extremitaeten aus paarigen lateralen Hautfalten (Lateral Fin Folds) entstanden, aehnlich wie noch beim Amphioxus (Cephalochordata) und Haifisch-Embryonen als transiente Struktur sichtbar. Gegenbaurs Kiemenbogen-Theorie (1870) ist historisch wichtig, aber heute widerlegt. Evo-Devo-Studien zeigen, dass Hox-Gene und Tbx-Transkriptionsfaktoren in Flossenentwicklung und Extremitaetentwicklung konserviert sind, was auf gemeinsamen entwicklungsbiologischen Ursprung hindeutet.",
        difficulty = 5,
        funFact = "Das Handmuster (Handwurzel, Mittelhand, Finger) kann bei Fischen in den paarigen Brustflossen der Quastenflosser (Latimeria) als dreigliedriges Grundelement erkannt werden — ein direkter anatomischer Beleg der Fin-to-Limb-Transition."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Gesteinsformation in der Doushantuo-Formation (Ediacaran, Suedchina, ~632-551 Mio. Jahre) lieferte phosphaterhaltene Fossilien, die als moegliche fruehe Tiereier und -embryonen diskutiert wurden?",
        answerA = "Die Weng'an Biota in den phosphoritischen Knollen der oberen Doushantuo-Formation",
        answerB = "Die Miaohe Biota in den schwarzen Schiefern der unteren Doushantuo-Formation",
        answerC = "Die Lantian Biota in den Alaunschiefer-Horizonten der mittleren Doushantuo-Formation",
        answerD = "Die Shibantan Biota in den Karbonaten der obersten Doushantuo-Formation",
        correctAnswer = 0,
        explanation = "Die Weng'an Biota (obere Doushantuo, ca. 580-600 Mio. Jahre, Guizhou) enthaltene phosphatisierte Mikrostrukturen, die Xiao & Knoll (2000, Science) als mogliche Tiereier und fruehe Embryonen deuteten. Spaetere Studien (Huldtgren et al. 2011, Science; Cunningham et al. 2012) interpretierten viele als Algen oder Protisten, aber einige Exemplare bleiben als mogliche fruehe Metazoa-Embryonen diskutiert. Die phosphatische Erhaltung im Doushantuo-Phosphorit ist einzigartig und wird durch fruehdiagentetische Phosphatisierung erklart.",
        difficulty = 5,
        funFact = "Die Doushantuo-Formation enthalt auch Megascopische Algen und mogliche fruehe Bilateria-Spuren, was sie zur bedeutendsten Ediacaran-Lagerstaette Asiens macht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches anatomische Prinzip der vergleichenden Anatomie besagt, dass Organe, die dieselbe Funktion erfullen, aber einen unterschiedlichen evolutionaeren Ursprung haben, als analog bezeichnet werden, und was ist das klassische Schulbeispiel?",
        answerA = "Prinzip der Konvergenz; Auge des Tintenfisches (Cephalopoda) und Auge des Wirbeltiers als inverse retinale Konstruktionen",
        answerB = "Prinzip der Homologie; Fluegel der Fledermaus und Fluegel des Vogels als abgeleitete Tetrapoden-Extremitaeten",
        answerC = "Prinzip der Analogie; Fluegel des Insekts (aus Thoraxwand-Auswuechsen) und Fluegel des Vogels (aus Tetrapoden-Extremitaet) erfullen beide den Flug, haben aber voellig verschiedenen entwicklungsbiologischen Ursprung",
        answerD = "Prinzip der Parallelentwicklung; Beckenrudiment der Schlange und Beckenrudiment des Wals als unabhaengig reduzierte Homologa",
        correctAnswer = 2,
        explanation = "Analoge Strukturen (Analogien) entstehen durch konvergente Evolution: gleiche Funktion, verschiedener Ursprung. Das Paradebeispiel sind Insektenflugel (Thoraxwand-Evaginationen, Tracheensystem-beladen, keine Knochen) vs. Vogelflugel (Tetrapoden-Vorderextremitaet, Radius/Ulna/Metacarpen). Beide ermoglichen Flug, aber entwicklungsbiologisch und strukturell vollig verschieden. Das Tintenfisch-Auge (inverse Retina-Konstruktion: Nervenfasern hinter Photorezeptoren) vs. Wirbeltier-Auge (nicht-inverse) ist ein weiteres Paradebeispiel fur Analogie trotz verbluffender struktureller Ahnlichkeit.",
        difficulty = 5,
        funFact = "Das Tintenfisch-Auge gilt als 'besseres Design' als das Wirbeltierauge, weil es keinen blinden Fleck hat — die Evolution hat diese Losung unabhangig zweimal 'gefunden', aber auf verschiedenen Wegen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches fossile Taxon aus dem Devon (~419-359 Mio. Jahre) gilt als naechster lebender Verwandter der Tetrapoden unter den Fischen, basierend auf molekularer und morphologischer Phylogenie?",
        answerA = "Latimeria chalumnae (Quastenflosser/Coelacanth)",
        answerB = "Neoceratodus forsteri (Australischer Lungenfisch/Dipnoi)",
        answerC = "Polypterus senegalus (Flossenhecht/Polypteriformes)",
        answerD = "Lepisosteus osseus (Knochenhechtl/Lepisosteiformes)",
        correctAnswer = 1,
        explanation = "Lungenfische (Dipnoi), insbesondere Neoceratodus forsteri (Australien), sind nach molekularer Phylogenie (Brinkmann et al. 2004, Nature; Amemiya et al. 2013) und morphologischen Cladistik die naechsten lebenden Verwandten der Tetrapoden. Die Coelacanths (Latimeria) sind Schwestertaxon der Dipnoi+Tetrapoden-Klade. Devonische Lungenfische wie Dipterus valenciennesi zeigen Uebergangsmerkmale. Das Dipnoi-Tetrapoda-Schwestertaxon-Verhaeltnis ist seit Schultze & Trueb (1991) gut begruendet.",
        difficulty = 5,
        funFact = "Das Australische Lungenfisch-Genom (Neoceratodus forsteri) wurde 2021 sequenziert und ist mit 43 Milliarden Basenpaaren das groesste jemals sequenzierte Tier-Genom — funfzehnmal groesser als das menschliche Genom."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche vestigialen Strukturen sind beim Boa constrictor (Familie Boidae) anatomisch nachweisbar, und welche evolutionaere Bedeutung haben sie?",
        answerA = "Rudimentaere Augen unter der Hornhaut; Beweis fuer unterirdische Vorfahren",
        answerB = "Pelvic spurs (Beckensporne) als externe Manifestation rudimentaerer Hinterbein-Knochen (Femur, Tibiotarsus); Beweis fuer tetrapode Abstammung von beintragendem Vorfahren",
        answerC = "Reste eines vierkammerigen Herzens neben dem dreigliedrigen; Beweis fuer Warmbluter-Abstammung",
        answerD = "Rudimentaere Trommelfell-Membran; Beweis fuer oberirdische Vorfahren mit Gehoersystem",
        correctAnswer = 1,
        explanation = "Boa constrictor und Python-Arten besitzen sichtbare Kloakensporne (pelvic spurs) — kleine, klauenaehnliche Strukturen nahe der Kloake. Diese sind extern sichtbare Manifestationen rudimentaerer Hinterbein-Skelettelemente: ein Femur-Rudiment und manchmal auch Tibia-Reste sind im Beckenbereich erhalten, eingebettet in Muskelgewebe ohne funktionale Verbindung zur Wirbelsaule. Diese Strukturen beweisen die tetrapode Abstammung der Schlangen und wurden durch HOX-Gen-Expressionsveraenderungen (Cohn & Tickle 1999, Nature) erklaert: verlangerte Tbx5-Hox-Expressionszone eliminiert Vorderextremitaeten, verloescht Shh-Signal reduziert Hinterextremitaeten.",
        difficulty = 5,
        funFact = "Maennliche Boas und Pythons nutzen die Beckensporne waehrend der Paarung aktiv als Stimulationsorgane beim Weibchen — vestigiale Strukturen koennen also sekundaer neue Funktionen erwerben (Exaptation)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche stratigraphische Position und welches Taxon markieren die Basis der Kambrium-Explosion als GSSP (Global Boundary Stratotype Section and Point)?",
        answerA = "Fortune Head, Neufundland, Kanada; basiert auf dem ersten Auftreten von Treptichnus pedum (komplexe Fresspur)",
        answerB = "Xiaoshiba, Yunnan, China; basiert auf dem ersten Auftreten von Pikaia gracilens",
        answerC = "Meischucun, Yunnan, China; basiert auf dem ersten Auftreten von Cloudina hartmannae (Roehrenfossil)",
        answerD = "Sirius Passet, Groenland; basiert auf ersten Skleritomorphen-Fossilien",
        correctAnswer = 0,
        explanation = "Das GSSP fuer die Praekambrium-Kambrium-Grenze (541 Mio. Jahre) liegt am Fortune Head, Burin-Halbinsel, Neufundland, Kanada (ratifiziert 1992). Die Grenzmarkierung ist das erste Auftreten der komplexen Weidespuren Treptichnus pedum (auch: Trichophycus pedum), die dreidimensionale, verzweigte Fressgang-Systeme zeigen und auf Bilateria mit muskelgetriebenem Koerper hinweisen. Cloudina und Namacalathus sind Ediacaran-Fossilien des Terminalen Ediacarans, nicht Kambriums.",
        difficulty = 5,
        funFact = "Treptichnus pedum ist eine Spur, kein Korper-Fossil — der Organismus selbst ist unbekannt, aber die Spur verrät, dass ein bilateral-symmetrisches Tier mit muskelgetriebenem Vorderteil existierte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifischen anatomischen Merkmale unterscheiden die drei rezenten Krokodilordnungen (Crocodylidae, Alligatoridae, Gavialidae) auf Schadelebene?",
        answerA = "Crocodylidae: vierter Unterkiefer-Zahn sichtbar; Alligatoridae: eingebettet in Oberkiefer-Grube; Gavialidae: extrem langes, schlankes Rostrum mit Bulb (Ghariyal-Hocker beim Maennchen)",
        answerB = "Crocodylidae: breites U-Rostrum; Alligatoridae: schmales V-Rostrum; Gavialidae: mittleres Rostrum",
        answerC = "Unterschiede nur in Schuppenstruktur und Osteodermenanzahl, nicht im Schadel",
        answerD = "Crocodylidae: 80 Zaehne; Alligatoridae: 74 Zaehne; Gavialidae: 110 Zaehne messbar",
        correctAnswer = 0,
        explanation = "Die taxonomisch bedeutsamsten kraniale Unterschiede: (1) Crocodylidae (echte Krokodile): vierter Unterkiefer-Zahn (D4) bleibt sichtbar wenn Mund geschlossen (ragt durch Kerbe im Oberkiefer); (2) Alligatoridae (Alligatoren/Kaimane): D4 versenkt in Grube im Oberkiefer, nicht sichtbar; (3) Gavialidae (Gharial): extrem elongiertes, nadelduennes Rostrum fuer Fischfang; adulte Maennchen haben eine ghata (knollenartige Nasalaufwuchs). Molekulare Phylogenie zeigt: Gavialidae + Crocodylidae sind Schwestergruppen, Alligatoridae basaler.",
        difficulty = 5,
        funFact = "Der Gharial (Gavialis gangeticus) ist einer der seltensten Krokodiliarier der Welt — 2007 wurden nur noch etwa 200 adulte Tiere in freier Wildbahn gezahlt, verteilt auf wenige Flusse des nordlichen Indischen Subkontinents."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches chemische Prinzip der Biogeochemie erklaert, warum Schwefel-Isotopen-Verhaeltnisse (delta-34S) in devonischen Schwarzschiefern als Proxy fuer ozeanische Anoxie genutzt werden?",
        answerA = "Sulfatreduzierende Bakterien fraktionieren Schwefel isotopisch: bevorzugen S-32 ueber S-34, was d34S-Werte in Pyrit unter marinem Sulfat absenkt; grosse Abweichungen zeigen intensive Sulfatreduktion = Anoxie",
        answerB = "Photosynthetische Organismen reichern S-34 an; hohe d34S-Werte zeigen oxische Bedingungen",
        answerC = "Pyrit-Oxidation bei oxygeniertem Meereswasser setzt S-32 bevorzugt frei, erhoeht d34S im Pyrit",
        answerD = "Schwefel-Isotopenfraktionierung erfolgt nur in hydrothermalen Systemen, nicht durch Biota",
        correctAnswer = 0,
        explanation = "Sulfatreduzierende Bakterien (SRB) bevorzugen beim Abbau organischer Materie S-32 gegenueber S-34 (kinetische Isotopeneffekte), was den produzierten Pyrit (FeS2) isotopisch leichter macht als das umgebende Meerwassersulfat. In anoxischen Sedimentbecken sind SRB aktiver → staerkere Fraktionierung → sehr negative delta-34S-Werte in Pyrit. Canfield (1989) entwickelte diesen Proxy; er wurde verwendet, um das Neoproterozoikum-Sauerstoffanstieg-Ereignis und das Frasnian-Famennian-Massenaussterben (Devonende) zu rekonstruieren.",
        difficulty = 5,
        funFact = "Das Frasnian-Famennian-Massenaussterben (~374 Mio. Jahre) vernichtete etwa 70-75% aller Meeresarten, darunter fast alle Riffbauenden Stromatoporoiden und Rugosakorallen — das zweite groesste Aussterben des Phanerozoikums."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche drei Typen von Zirkulationssystemen unterscheidet die vergleichende Anatomie bei Arthropoden, Cephalopoden und Wirbeltieren, und welcher Term beschreibt das offene System?",
        answerA = "Sinusoid-System (Arthropoden), Lacunensystem (Mollusken), Kapillarsystem (Wirbeltiere); offenes System = Haemocoel-System",
        answerB = "Offenes Haemal-System (Arthropoden, Haemocoel); gemischtes System (Cephalopoden: teilgeschlossen mit Kapillarbetten); vollgeschlossenes Hochdruck-System (Wirbeltiere mit echten Kapillaren)",
        answerC = "Alle drei sind geschlossene Systeme mit unterschiedlichem Druckniveau",
        answerD = "Arthropoden: Tracheen-System (keine Haemolymphe); Cephalopoden: Tintensack-Kreislauf; Wirbeltiere: Blutgefaesssystem",
        correctAnswer = 1,
        explanation = "Vergleichende Anatomie der Kreislaufsysteme: (1) Arthropoden: offenes Haemal-System (Haemocoel) — Hämolymphe fliesst direkt zwischen Organen, Herz pumpt Hämolymphe in Sinus, keine echten Kapillaren; (2) Cephalopoda (Tintenfische, Kraken): semi-geschlossenes System mit Kiemenherzen (Branchialherzen), Kapillarbetten in Kiemen; (3) Wirbeltiere: vollstaendig geschlossenes Hochdruck-System mit echten Kapillaren, Arterien, Venen und erythrozytaeren Blutzellen. Cephalopoden haben das effizienteste Kreislaufsystem aller Mollusken, was mit ihrer hohen Aktivitaet korreliert.",
        difficulty = 5,
        funFact = "Oktopusse haben drei Herzen: zwei Kiemenherzen pumpen Blut durch die Kiemen, ein Koerperherz pumpt es durch den Rest des Koerpers. Bei Stressreaktion stoppt das Koerperherz kurz — weshalb Oktopusse beim Schwimmen schnell muede werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches palaeogeographische Ereignis am Ende des Ordoviziums (~445 Mio. Jahre) gilt als Hauptursache fuer das Ordovizian-Silur-Massenaussterben (zweites groesstes Massenaussterben des Phanerozoikums)?",
        answerA = "Gondwana-Drift uber den Suedpol fuehrte zu Vergletscherung und globalem Meeresspiegel-Abfall um ~100 Meter; gleichzeitig Ozeanversauerung durch CO2-Freisetzung",
        answerB = "Erodierung des Iapetus-Ozeans durch Subduktion fuehrte zu Vulkanismus und CO2-Anstieg",
        answerC = "Kollision von Laurentia und Baltica (Kaledonische Orogenese) schuf Landbruecken und trennte marine Populationen",
        answerD = "Gamma-Strahlenausbruch (GRB) vom WR 104-Stern dezimierte Meeresflachzone durch UV-Hyperexposition",
        correctAnswer = 0,
        explanation = "Das Ordovizian-Silurisches Massenaussterben (~445-443 Mio. Jahre, Hirnantian Stage) vernichtete ca. 85% der Meeresarten in zwei Pulsen. Ursache: (1) Gondwana driftete ueber den Suedpol, Sahara-Region vergletscherte massiv (Hirnantian Glaciation); (2) Meeresspiegelabfall um ~100 m trocknete Flachwasser-Habitate aus; (3) anschliessend schnelles Abtauen fuehrte zu ozeanischer Anoxie beim zweiten Puls. Schatz et al. (2001) und Brenchley (1989) dokumentierten diese zweiphasige Struktur durch globale Delta-O18-Daten.",
        difficulty = 5,
        funFact = "Die Hirnantian-Fauna (eiszeitlich angepasste Brachiopoden und Trilobiten) entstand und verschwand innerhalb von ca. 1-2 Millionen Jahren — eine der kurzlebigsten, aber charakteristischsten Faunen der Erdgeschichte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff der vergleichenden Neuroanatomie beschreibt die sekundaere Zunahme des Telencephalons (Vorderhirns) bei Saeugetieren gegenueber Fischen und Amphibien, und welche Struktur ist dabei hauptsaechlich vergroessert?",
        answerA = "Encephalisierung; hauptsaechlich das Cerebellum (Kleinhirn) als Zentrum hoeherer kognitiver Funktionen",
        answerB = "Telencephalisierung; hauptsaechlich der Neokortex (Isokortex) als sechsschichtige Rindenstruktur, die bei Reptilien fehlt",
        answerC = "Corticalisierung; hauptsaechlich der Hippocampus als evolutionaer aelteste Kortexregion",
        answerD = "Encephalisierung; hauptsaechlich der Thalamus als sensorischer Relay-Hub vergroessert",
        correctAnswer = 1,
        explanation = "Telencephalisierung beschreibt die uberproportionale Vergroesserung des Telencephalons bei Saeugetieren. Die schluessige Innovation ist der Neokortex (Isokortex): eine sechsschichtige Rindenstruktur (Lagen I-VI), die ausschliesslich bei Saeugetieren vorkommt. Bei Reptilien existiert nur der dreischichtige Archikortex und Paleokortex. Der Neokortex ermoeglichte hohere kognitive Funktionen, Sprache und komplexes Sozialverhalten. Das Encephalisierungsquotient (EQ nach Jerison 1973) misst die Gehirngroesse relativ zur Koerpermasse.",
        difficulty = 5,
        funFact = "Der menschliche Neokortex enthalt ca. 16 Milliarden Neuronen und ist so stark gefaltet (Gyrifikation), dass er ausgebreitet etwa 2400 cm2 bedecken wuerde — ungefahr die Groesse einer Pillowcase."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche fossilen Strukturen in der Mazon Creek-Lagerstaette (Pennsylvanian, Illinois, ~307 Mio. Jahre) sind einzigartig und warum ist diese Lagerstaette palaeontologisch besonders bedeutend?",
        answerA = "Erhaltung vollstaendiger Dinosaurierskelette in Kohlenflozfortsaetzen; bedeutend als fruehester Beweis fuer Coelurosauria",
        answerB = "Konservierende Siderit-Konkretionen (Eisenkarbonat) erhalten Weichteile von Tieren und Pflanzen des Karbonikums; bedeutend als Fenster in die terrestrisch-marine Uebergangszone und als Quelle der Tully-Monster-Kontroverse",
        answerC = "Bernstein-Einschluesse mit vollstaendigen Insekten; bedeutend als frueheste Quellen von Insekten-DNA",
        answerD = "Phosphaterhaltung kleiner Metazoa; bedeutend als Beleg karbonischer Meeresflora",
        correctAnswer = 1,
        explanation = "Mazon Creek (Pennsylvanian, ~307 Mio. Jahre, Illinois) zeigt Erhaltung durch Siderit-Konkretionen (FeCO3): organische Materie induzierte fruehdiagenetische Sideritisierung, die Weichteile bewahrte. Die Lagerstaette ist bedeutend fuer: (1) vollstaendige terrestrische und marine Oekosystem-Erhaltung an Flu ssdeltas-Meeresuebergang; (2) das ratselhaftes Tully Monster (Tullimonstrum gregarium) — ein enigmatisches Tier, dessen Zugehoerigkeit (Wirbeltier? Annelid?) bis heute kontrovers ist (McCoy et al. 2016 classifying it as Vertebrate; Sallan et al. 2017 widersprach). Einzigartiger Fenster in karbonische Biodiversitat.",
        difficulty = 5,
        funFact = "Das Tully Monster (Tullimonstrum gregarium) ist das offizielle Staatsfossil von Illinois — obwohl seine phylogenetische Zuordnung nach uber 60 Jahren Diskussion noch immer nicht eindeutig geklart ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche anatomischen Strukturen werden als Synapomorphien der Tetrapoda (Landwirbeltiere) definiert und grenzen sie von ihren Fischvorfahren ab?",
        answerA = "Pennadactyl-Extremitaeten mit Ziffern, freier Nackenregion (Hals), Verlust der Kiemenboegen als Atemorgane, Choane (innere Nasoeoffnungen)",
        answerB = "Verlust der Schuppen, Entwicklung von Haarfollikeln, vierkammeriges Herz, Lungen",
        answerC = "Entwicklung von Amnioten-Ei (Amnion, Chorion, Allantois), keratinisierte Haut, dreikammeriges Herz",
        answerD = "Ausschliesslich terrestrische Fortpflanzung, Entwicklung von Knotengelenken (Condyli) am Unterkiefer",
        correctAnswer = 0,
        explanation = "Synapomorphien der Tetrapoda umfassen nach Clack (2002) und Coates (1996): (1) paarige Extremitaeten mit Handwurzel, Mittelhand und Ziffern (auch wenn urspruenglich 6-8 Ziffern); (2) freier Hals (Nackenregion) durch Trennung des Schulterguertels vom Schaedel; (3) Choanen (innere Nasoeoffnungen) fuer Atemlufteinzug mit geschlossenem Mund; (4) Verlust der aktiven Kiemenfunktion (Operculum-Knochen); (5) modifizierter Beckenguertel mit Ilium-Artikulation an der Wirbelsaule. Lungen sind nicht exklusiv tetrapod (Lungenfische haben Lungen).",
        difficulty = 5,
        funFact = "Acanthostega gunnari hatte acht Ziffern — die fruehen Tetrapoden waren also polydactyl, und die Reduktion auf funf (Pentadaktylie) ist ein abgeleitetes Merkmal, das sich in der Tetrapoden-Stammgruppe mehrfach unabhangig entwickelte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches spezifische Protein der extrazellularen Matrix ermoeglicht die vergleichend-anatomische Zuordnung von Kollagen-Fragmenten aus fossilem T. rex-Knochen (Schweitzer et al. 2007) zu Vogeln?",
        answerA = "Keratin alpha (Typ I); identisch in Sauropsida und Aves",
        answerB = "Kollagen Typ I (COL1A1/COL1A2 alpha-Ketten); Peptid-Sequenzen zeigen groesste Aehnlichkeit zu Straussenvogel (Struthio camelus)",
        answerC = "Aktin und Myosin (Muskelproteine); konservierte Sequenzabschnitte verbinden T. rex mit Krokodilen",
        answerD = "Osteocalcin (Bone GLA Protein); gamma-Carboxylgruppen erhalten in Fossilien und belegen Vogelverwandtschaft",
        correctAnswer = 1,
        explanation = "Schweitzer et al. (2007, Science) extrahierten Kollagen-Typ-I-Peptide aus einem 68 Millionen Jahre alten T. rex-Knochen aus dem Hell Creek. Massenspektrometrische Analyse (MALDI/ESI) zeigte, dass die COL1A1/COL1A2-Peptidsequenzen die hoechste Aehnlichkeit zu modernem Vogelkollagen (besonders Strauss: Struthio camelus) aufwiesen, gefolgt von Krokodilen. Dies stuetzt die phylogenetische Position der Theropoden nahe den Voegeln auf molekularer Ebene, auch wenn die methodischen Details kontrovers diskutiert wurden.",
        difficulty = 5,
        funFact = "Die Entdeckung von Protein-Resten in 68 Millionen Jahre alten Knochen war anfangs so kontrovers, dass Schweitzers Paper zunachst von mehreren Journals abgelehnt wurde — bis unabhangige Labore die Befunde replizierten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion haben die Weberschen Knochen (Weberscher Apparat) bei Ostariophysi-Fischen (Karpfen, Welse, Salmler) aus vergleichend-anatomischer Sicht?",
        answerA = "Hydrostatische Funktion als Gegengewicht zur Schwimmblase bei vertikalen Wanderungen",
        answerB = "Schallleitung: modifizierte vordere Wirbelquerfortsaetze (Tripus, Intercalarium, Scaphium, Claustrum) verbinden Schwimmblase mechanisch mit Innenohr (Labyrinth) und erhoehen Schallwahrnehmung",
        answerC = "Nahrungsfilterung: vergroesserte Querfortsaetze bilden Reusensystem fuer Plankton-Filtration",
        answerD = "Reproduktive Funktion: Knochenkamm-System produziert Pheromone bei Laichreife",
        correctAnswer = 1,
        explanation = "Der Webersche Apparat (Weber 1820, anatomisch korrekt: Weberscher Apparat = Ossiculae Weberi) besteht aus 4-5 modifizierten Wirbelstrukturen der ersten Wirbel: Claustrum, Scaphium, Intercalarium, Tripus (und bei manchen Artens Stapes). Diese uebertragen Druckschwankungen aus der Schwimmblase auf das Labyrinth (Innenohr). Folge: Ostariophysi horen bis zu 13 kHz (Karpfen), waehrend Fische ohne Weberschen Apparat nur bis ca. 600 Hz wahrnehmen. Diese funktionelle Analogie zu Gehoerknoechelchen der Saeugetiere ist ein Paradebeispiel konvergenter Hoersystem-Evolution.",
        difficulty = 5,
        funFact = "Ostariophysi umfassen uber 10.000 Arten — mehr als ein Viertel aller Fischarten — und dominieren viele Suesswasser-Okosysteme weltweit. Ihr uberlegenes Horvermogen ist ein wichtiger Selektionsvorteil."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet morphologisch die Anomodontia (Therapsida, Perm) von anderen Therapsiden, und was macht Dicynodon lacerticeps zum wichtigen biostratigraphischen Leitfossil?",
        answerA = "Anomodontia: Verlust aller Zahne ausser zwei Eckzaehnen (Dicynodonten) oder vollstaendige Zahnlosigkeit; Dicynodon: Vorhandensein in zahlreichen Perm-Trias-Schichten als Zonenindex",
        answerB = "Anomodontia: Entwicklung von Milchzaehnen (Diphyodontie) als fruheste Saeugetiere",
        answerC = "Anomodontia: aquatische Anpassungen mit Ruderflosse; Dicynodon: Meeresleitfossil des oberen Perms",
        answerD = "Anomodontia: Vogelartiger Schnabel aus Keratin ohne Zahne; Dicynodon: erster bekannter Pflanzenfresser der Therapsida",
        correctAnswer = 0,
        explanation = "Dicynodontia (Untergruppe der Anomodontia) sind charakterisiert durch: (1) weitgehenden Zahnverlust — nur ein Paar grosser Stosszaehne (Canini) erhalten oder vollstaendig zahnlos; (2) horniger Schnabel (Rhamphotheca) fuer Pflanzenfresserei. Dicynodon lacerticeps (und verwandte Gattungen) sind wichtige biostratigraphische Leitfossile des Oberen Perms (Guadalupian-Lopingian) weltweit (Suedafrika, Russland, China), da sie weit verbreitet, abundante und zeitlich begrenzt waren. Kalandadze & Rautian (1991) nutzten Dicynodon-Zonen zur globalen perm-zeitlichen Zonierung.",
        difficulty = 5,
        funFact = "Dicynodonten waren extrem erfolgreich — sie dominierten terrestrische Okosysteme des Spaten Perms und erholten sich sogar vom Perm-Trias-Massenaussterben (Lystrosaurus-Phase); erst im Mittleren Trias verschwanden sie fast vollstandig."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Fossilgruppe liefert die wichtigsten Proxy-Daten fuer paleo-ozeanische Temperaturen des Mesozoikums, und welches geochemisches Prinzip liegt zugrunde?",
        answerA = "Foraminiferen (planktisch und benthisch): Sauerstoff-Isotopenverhaeltnis (delta-O18) in Kalkschalen ist Temperaturabhaengig; O-18/O-16-Verhaeltnis nimmt mit sinkender Temperatur zu",
        answerB = "Trilobiten-Exoskelett: Magnesium/Kalzium-Verhaeltnis (Mg/Ca) in Chitin-Schichten als Temperaturen-Proxy",
        answerC = "Belemniten-Rostra: Strontium-Isotopen-Verhaeltnis (Sr/Ca) als Paleotemperatur-Proxy",
        answerD = "Plankton-Coccolithophorida: delta-C13-Werte als Proxy fuer Oberflachenwasser-Produktivitat und Temperatur",
        correctAnswer = 0,
        explanation = "Foraminifera-Sauerstoff-Isotopie ist der Goldstandard fuer paleo-ozeanische Temperaturen (Emiliani 1955, DSDP/ODP-Kerne). Grundlage: Sauerstoff-Isotopenfrraktionierung bei Kalzit-Bildung ist temperaturabhaengig (Urey-Gleichung 1947). Kalteres Wasser erhoeht O-18/O-16 im Karbonatkristall. Benthische Foraminiferen (z.B. Cibicidoides) spiegeln Tiefseetemperaturen wider; planktische (z.B. Globigerina) Oberflachenwasser. Zachos et al. (2001, Science) erstellten den kanonischen benthischen Foraminiferen-delta-O18-Stack fuer das gesamte Kaenozoikum.",
        difficulty = 5,
        funFact = "Foraminiferen sind so empfindliche Paleo-Thermometer, dass delta-O18-Kurven aus Tiefseebohrkernen sogar einzelne Eiszeiten der letzten 2,6 Millionen Jahre auflosen konnen — eine Prazsion von wenigen tausend Jahren bei Millionen Jahre alten Gesteinen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche vergleichend-anatomische Parallele zeigen Pinniped-Flossen (Robben, Seeloewen) und Cetaceen-Flippers auf Skelettniveau, und was belegt die unterschiedliche evolutionaere Herkunft?",
        answerA = "Beide zeigen identische Humerus-Radius-Ulna-Verhaeltnisse; gleiche Herkunft aus gemeinsamen Vorfahren belegt durch Pakicetus-Uebergangsform",
        answerB = "Pinnipedia: funktionstuechtiger Vorderfuss mit allen fuenf Ziffern, Schwimmhaut zwischen Ziffern, Knochen aehnlich terrestrischen Carnivoren; Cetacea: Hyperphalangie, Verlust des aeusseren Hauttrennung zwischen Ziffern; verschiedene Vorfahrengruppen (Pinnipedia: terrestrische Musteloidea/Carnivora; Cetacea: Artiodactyla/Mesonychidae)",
        answerC = "Beide sind vollstaendige Neuschopfungen ohne Tetrapoden-Knochen-Homologien",
        answerD = "Pinnipedia und Cetacea haben identische Flipper-Skelettelemente; unterschiedliche Weichteile beweisen konvergente Evolution",
        correctAnswer = 1,
        explanation = "Vergleichende Anatomie zeigt deutliche Unterschiede: (1) Pinnipedia (Robben, Familie Phocidae; Seeloewen, Otariidae): fuenf funktionstuechtige Ziffern mit Schwimmhaut erhalten (aehnlich Otter), Knochen proportional zu terrestrischen Carnivoren, Hinterextremitaeten als Ruder erhalten; entstanden aus Carnivora (Musteloidea). (2) Cetacea: extreme Hyperphalangie (vermehrte Phalangen), Verlust des Handgelenk-Bewegungsradius (versteift), Hinterextremitaeten vollstaendig reduziert (vestigiell); entstanden aus Artiodactyla. Beide sind konvergente Anpassungen an aquatisches Leben aus verschiedenen Ausgangsgruppen.",
        difficulty = 5,
        funFact = "Robben konnen an Land laufen (Seeloewen sogar galoppieren), Wale dagegen nicht — dieser Unterschied spiegelt genau wider, dass Robben noch alle vier funktionellen Extremitaten behalten haben, Wale aber nur zwei."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Hallmarker-Fossilien definieren die Ediacaran-Fauna (Vendian-Fauna) und was unterscheidet sie fundamental von kambrozischen Tieren?",
        answerA = "Ediacaran-Organismen haben harte Kalkschalen; Kambrium einfuehrte weiche Korperplane",
        answerB = "Ediacaran-Fauna (Dickinsonia, Charniodiscus, Spriggina, Kimberella): quilted (matratzenartig) Konstruktion, keine Mundoeffnung bei vielen Formen belegt, keine Sklerotisierung ausser Cloudina; Kambrium: Sklerotisierung, Augen, aktive Predation, Coelom, Segmentierung, bilateral-symmetrisch komplex",
        answerC = "Ediacaran-Tiere: bilateral-symmetrisch mit Extremitaeten; Kambrium: radialsymmetrisch",
        answerD = "Kein fundamentaler Unterschied; Ediacaran-Fauna ist Vorlaufer aller kambrozischen Phyla mit nachweisbarer Kontinuitat",
        correctAnswer = 1,
        explanation = "Ediacaran-Fossilien (635-541 Mio. Jahre, Russland/Suedaustralien/Namibia) zeigen: (1) 'Quilt'-Konstruktion (parallel-modulare Gliederung ohne echte Segmentierung); (2) viele Formen ohne Mund, ohne Verdauungstrakt (Saugflache); (3) kein Exoskelett ausser Cloudina und Namacalathus; (4) sessile oder langsam gleitende Lebensweise. Kambrium-Tiere dagegen: Sklerotisierung (Biomineralisierung), komplexe Sinnesorgane (Augen), aktive Predation, Coelom, Muskelaktivitaet. Ob Ediacara-Organismen Vorfahren kambrozischer Taxa sind (Knoll & Carroll 1999) oder eine aussterbende 'failed experiment'-Gruppe (Narbonne 2005), ist noch diskutiert.",
        difficulty = 5,
        funFact = "Kimberella quadrata (Russland, ~558 Mio. Jahre) gilt als mogliches fruhes Bilateria mit Spuren von Schabeaktivitat (Praedations-Spuren) und ist eines der wenigen Ediacara-Fossilien, das eindeutig tierischen Charakter zeigt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Methode der Palaeontologie kombiniert Morphologie und Geochemie, um die Ernahrungsgewohnheiten ausgestorbener Tiere zu rekonstruieren?",
        answerA = "Stabile Kohlenstoff-Isotopenanalyse (delta-C13) an Zahnschmelz: C3-Pflanzen-Fresser haben niedrigere delta-C13-Werte als C4-Pflanzen-Fresser; Fleischfresser zeigen Anreicherung durch tropische Magnifikation",
        answerB = "Magnesium-Kalzium-Verhaltnis in Knochen als Proxy fuer Proteinstoffwechsel",
        answerC = "Zahnschmelz-Dickenmessung (Optical Coherence Tomography) als Proxy fuer Kauleistung",
        answerD = "Stickstoff-Isotopenanalyse (delta-N15) an Knochen-Kollagen: Karnivoren zeigen hohere delta-N15-Werte durch Stufenmagnifikation in der Nahrungskette",
        correctAnswer = 3,
        explanation = "Stickstoff-Isotopen-Analyse (delta-N15) an Knochen-Kollagen ist der wichtigste palaodiaetatische Proxy: delta-N15 erhoht sich um 3-5 prom je Trophiestufe (Trophische Magnifikation). Karnivore haben delta-N15 von +10 bis +20 prom; Herbivore +5 bis +10 prom (gegenuber atmospharischem N2). Kombiniert mit delta-C13 (C3- vs. C4-Pflanzen, marin vs. terrestrisch) ermoglicht die bivariate Analyse eine praazise Palaodiaat-Rekonstruktion. Diese Methode wird intensiv in Pliostozaen-Palaoanthropologie eingesetzt (z.B. Neanderthaler vs. moderner Mensch Diat-Rekonstruktion).",
        difficulty = 5,
        funFact = "Neanderthaler-Knochen zeigen delta-N15-Werte vergleichbar mit Woelfen und Hyanen — ein Beweis, dass sie als apex predators hochwertige tierische Proteine konsumierten, wahrscheinlich Grosswild wie Mammuts und Wollrhinozerosse."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Knochen des Schulterguertels sind bei Voegeln im Vergleich zu nicht-avialen Theropoden-Dinosauriern signifikant vergroessert oder neu entwickelt, und welche Funktion haben sie beim Flug?",
        answerA = "Coracoid stark vergroessert und Clavicula-Paar zur Furcula (Gabelbein) fusioniert; Furcula federnd als Energiespeicher beim Fluegelschlag, Coracoid als stabiles Strut zwischen Sternum und Glenoid",
        answerB = "Scapula stark vergroessert als Flugmuskel-Ansatzflache; Coracoid rudimentar",
        answerC = "Neuentstehung eines knochigen Praecoracoids als fluchtigue Stutzstruktur",
        answerD = "Fusion aller Schulterguerteknochen zu einem einzigen Scapulocoracoid wie bei Krokodilen",
        correctAnswer = 0,
        explanation = "Bei Voegeln zeigt der Schulterguertels spezifische Modifikationen: (1) Furcula (Gabelbein) = fusionierte Claviculae; fungiert als elastische Feder (Jenkins et al. 1988, Science) — speichert kinetische Energie des Fluegelabschlags und gibt sie beim Aufschlag zuruck, ca. 20% Energieersparnis; (2) Coracoid als robuster, stab-formiger Knochen (strut-like) transmittiert Flugkrafte vom Glenoid zum Sternum; (3) Sternum stark vergroessert mit Carina (Brustbeinkamm) als Ansatzflache fuer M. pectoralis major (Hauptflugmuskel, ca. 15-25% Koerpermasse bei guten Fliegern).",
        difficulty = 5,
        funFact = "Die Furcula (Gabelbein) beim Weihnachtsessen-Brauch stammt von dieser federnden Funktion: nach Abzupfen wird das Gabelbein gespannt und der Teil, der den langeren Abschnitt halt, erhalt einen Wunsch — ein Jahrtausende alter Brauch."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept der palaontologischen Biogeographie beschreibt die Verteilung verwandter fossiler Taxa auf getrennten Kontinenten als Beleg fuer Kontinentaldrift?",
        answerA = "Dispersal-Biogeographie: Organismen verbreiteten sich aktiv uber Landbrucken oder Flosse",
        answerB = "Vikarianzbiogeographie: gemeinsamer Vorfahre wurde durch geologische Ereignisse (Kontinentaldrift) getrennt; rezente und fossile Verbreitungsmuster sind Folge dieser Trennung",
        answerC = "Equilibrium-Theorie: Artenzahl auf Inseln/Kontinnenten durch Einwanderungs- und Aussterbegleichgewicht reguliert",
        answerD = "Center-of-Origin-Hypothese: alle Gruppen entstanden in einer Ursprungsregion und verbreiteten sich sternformig",
        correctAnswer = 1,
        explanation = "Vikarianzbiogeographie (Croizat 1958, Nelson & Platnick 1981) erklaert Verbreitungsmuster durch geologische Trennung: wenn sich Kontinente teilen, werden gemeinsame Vorfahren-Populationen getrennt und divergieren zu verschiedenen Arten/Taxa. Klassisches Beispiel: Gondwana-Zersplitterung (Sudamerika, Afrika, Indien, Australien, Antarktis) erklaert die Verbreitung von Marsupialien, Ratitae-Voegeln (Strausse, Emus, Nandus, Kiwis), Proteaceae-Pflanzen und devonischen Fischfaunen auf heute getrennten Kontinenten. Fossiler Beleg: Glossopteris-Flora (perm-zeitliche Pflanze) auf allen Gondwana-Fragmenten.",
        difficulty = 5,
        funFact = "Alfred Wegeners ursprungliche Kontinentaldrift-Hypothese (1912) wurde anfangs vor allem durch palaeontologische Argumente gestutzt — die identischen Glossopteris-Pflanzenfossilien auf sudlichen Kontinenten waren eines seiner Hauptargumente."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifischen Schluesselmutationen im Opsin-Gen erklaeren den Verlust des Trichromasie bei Saugetieren gegenuber Reptilien/Vogeln, und was belegt die Nacht-Hypothese des fruhen Saugetier-Stammlinien-Bottleneck?",
        answerA = "Duplikation des LWS-Opsin-Gens bei Primaten ermoglichte sekundare Trichromasie; Nacht-Hypothese: fruhe Saugetiere waren tagaktiv und verloren im Mesozoikum zwei Opsin-Typen",
        answerB = "Frameshift-Mutationen inaktivierten SWS2 und Rh2 Opsine in der Saugetier-Stammlinie; Nacht-Hypothese: fruhe Saeugetiere waren nachtaktiv (Mesozoikum-Bottleneck) und verloren dadurch zwei von vier Cone-Opsinen; Primaten erholten sekundare Trichromasie durch LWS-Genduplikation",
        answerC = "Saugetiere verloren alle vier Opsine und entwickelten ausschliesslich Stachsehen (Rhodopsin); Primaten-Trichromasie entstand de novo",
        answerD = "Opsine wurden durch epigenetische Stilllegung inaktiviert; keine Mutationen im kodierenden Bereich",
        correctAnswer = 1,
        explanation = "Vergleichende Genomik (Yokoyama 2002, Springer et al. 2003) zeigte: fruhe Saugetier-Stammlinie verlor SWS2 (kurzwellig-2) und Rh2 (Rhodopsin-2)-Opsine durch inaktivierende Mutationen (Nonsense-Mutationen, Frameshift). Nacht-Hypothese (Walls 1942, modifiziert durch Gerkema et al. 2013): mesozoische Saugetier-Vorfahren waren nachtaktiv, um Dinosaurier-Konkurrenz/Pradation zu meiden; dies reduzierte Selektionsdruck fur Farbsehen. Primaten erwarben sekundare Trichromasie durch Tandem-Duplikation des LWS-Opsin-Gens auf dem X-Chromosom, was zwei leicht verschiedene Opsine (OPN1LW, OPN1MW) ergab.",
        difficulty = 5,
        funFact = "Hunde sehen nicht schwarz-weiss wie oft behauptet, sondern dichromisch (wie farbenblinde Menschen mit Rotgrun-Schwache) — sie unterscheiden Blau von Gelblich, konnen aber Rot und Grun nicht trennen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches kambrozische Tier aus dem Burgess Shale galt jahrzehntelang als raetselhafter Organismus (als Annelid, dann als Priapulid-Verwandter klassifiziert) und wurde erst 2015 als fruhes Onychophora (Stummelfusser) eingeordnet?",
        answerA = "Opabinia regalis",
        answerB = "Wiwaxia corrugata",
        answerC = "Hallucigenia sparsa",
        answerD = "Nectocaris pteryx",
        correctAnswer = 2,
        explanation = "Hallucigenia sparsa (Walcott 1911, Morris 1977) wurde zunachst auf dem Kopf stehend rekonstruiert: die Stacheln als Beine, die Beine als Tentakel-Rucken. Conway Morris (1977) erkannte die richtige Orientierung teilweise, rekonstruierte aber Kopf und Schwanz vertauscht. Erst Smith & Caron (2015, Nature) klarten durch neue chengijangische Exemplare (Yunnan, China) die Kopfmorphologie: keulenformiger Kopf, einfache Augen, Rachen mit Zahnreihen. Hallucigenia ist nun als basales Panarthropod innerhalb der Lobopodialineage eingeordnet, nahe Onychophora (Stummelfusser).",
        difficulty = 5,
        funFact = "Der Name 'Hallucigenia' wurde von Simon Conway Morris gepragt, weil er das Tier fur eine 'Halluzination' hielt — so seltsam erschien seine Morphologie. Der Name blieb, auch nachdem die korrekte Anatomie geklart war."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches anatomische Merkmal unterscheidet Crocodylia von allen anderen lebenden Reptilien in Bezug auf das Herz und was ist die funktionelle Bedeutung?",
        answerA = "Krokodile haben als einzige Reptilien ein vollstandig vierkammeriges Herz mit vollstandiger Trennung von Koerper- und Lungenkreislauf; das Foramen Panizzae ermoglicht dennoch gesteuerten Links-Rechts-Shunt beim Tauchen",
        answerB = "Krokodile haben ein dreikammeriges Herz mit unvollstandiger Septierung wie alle Reptilien",
        answerC = "Krokodile besitzen ein einkammeriges Herz mit hohem Pumpdruck fur aquatisches Leben",
        answerD = "Krokodile haben ein zweikammeriges Herz (wie Fische) als aquatische Anpassung",
        correctAnswer = 0,
        explanation = "Krokodile sind die einzigen nicht-avialen Reptilien mit einem vollstandig vierkammerigen Herz (wie Saugetiere und Vogel). Das Foramen Panizzae (Loch zwischen linken und rechten Aortenbogen) ermoglicht jedoch einen kontrollierten Rechts-Links-Shunt: beim Tauchen kann CO2-reiches Blut aus dem rechten Ventrikel direkt in den Systemkreislauf geleitet werden, was Verdauungs-pH-Regulation unterstuetzt und den Gasaustausch beim Tauchen optimiert. Diese einzigartige Kombination wurde durch Gauntner et al. (2010) praazise dokumentiert.",
        difficulty = 5,
        funFact = "Das Foramen Panizzae ist nach dem italienischen Anatomen Bartolomeo Panizza benannt, der es 1833 als erster beschrieb — uber 180 Jahre, bevor seine genaue Funktion beim Tauchen vollstandig verstanden wurde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische fossile Formation in Yunnan (China) lieferte Exemplare mit erhaltenem Gehirn-Gewebe und gilt als fruehester Beleg fur komplexe Zentralnervensysteme im Kambrium?",
        answerA = "Maotianshan-Schiefer (Chengjiang-Fauna, ~520 Mio. Jahre); Radiodontia-Gehirne belegt durch phosphatische Erhaltung",
        answerB = "Niutitang-Formation (Sinian-Kambrium-Grenze); Ediacaranische Weichkorperfossilien",
        answerC = "Doushantuo-Formation; Phosphat-erhaltene Embryonen ohne Nervensysteme",
        answerD = "Balang-Formation (Cambrian Series 2); erste Arthropoden-Fossilien ohne Weichgewebe",
        correctAnswer = 0,
        explanation = "Die Maotianshan-Schiefer (Chengjiang Biota, Yunnan, ca. 518-520 Mio. Jahre) lieferten aussergewohnliche Funde: Hou et al. (2012, Nature) und Ma et al. (2012, Nature) beschrieben Radiodontia (Anomalocaris-Verwandte) und Fuxianhuia protensa mit phosphatisch erhaltenen Gehirn-Strukturen. Fuxianhuia zeigt ein anteriorisiertes Gehirn (Deutocerebrum) mit Optik-Lappen, was auf komplexe visuelle Verarbeitung hindeutet. Diese Befunde sind als Schlussel fur das Verstandnis der fruhkambrischen Nervensystem-Evolution wichtig, auch wenn die Interpretation umstritten ist (Strausfeld et al. 2012 vs. Edgecombe 2012).",
        difficulty = 5,
        funFact = "Die Chengjiang-Fauna ist als UNESCO-Weltnaturerbe anerkannt (seit 2012) und gilt als bedeutendste Kambrium-Lagerstaatte Asiens — uber 200 Tierarten wurden dort bisher beschrieben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche vergleichend-anatomische Theorie erklaert die ursprungliche Entstehung der Knochen bei Wirbeltieren, und was waren die ersten biologisch mineralisierten Strukturen in der Wirbeltierlinie?",
        answerA = "Stutzfunktions-Hypothese: Knochen entstanden fur mechanische Belastbarkeit terrestrischer Fortbewegung",
        answerB = "Ionenspeicher-Hypothese (Halstead 1969): Mineralisierung entstand ursprunglich als Calciumphosphat-Ionenspeicher fur physiologische Regulation; erste mineralisierte Strukturen waren odontodische Exoskelett-Elemente (Zahnschmelz-analoge Platten) der fruhen Agnatha (Heterostracen, Thelodonti, Ordovizium)",
        answerC = "Pradations-Schutz-Hypothese: harter Knochenpanzer als Schutz gegen Anomalocaris-artige Raubtiere des Kambriums",
        answerD = "Blut-Hypothese: Knochen entstanden als Reservoirfur hamatopoetisches Gewebe (Knochenmark) bei den ersten Wirbeltieren",
        correctAnswer = 1,
        explanation = "Halsteads Ionenspeicher-Hypothese (1969, revidiert von Purnell 1995, Donoghue & Sansom 2002) ist die am besten belegte Erklarung: fruhe Vertebraten benótigten Calciumphosphat-Puffer fur Muskelaktivitat und Ionenhomoostase; Mineralisierung entstand an der Korperoberflache als Ionendepot. Erste mineralisierte Strukturen in der Wirbeltierlinie sind odontodische Elemente (Zahnschmelz + Dentin + Knochen-Komposit) in fruhen kieferlosen Fischen (Astraspis, Eriptychiida, Spat-Ordovizium ~470 Mio. Jahre), nicht echte Knochen. Echtes dermales Knochen-Exoskelett folgte bei Heterostracen.",
        difficulty = 5,
        funFact = "Zahne sind evolutionar alter als Knochen — die ersten mineralisierten Strukturen der Wirbeltierlinie waren zahnschmelzartige Zahnelemente (Conodonten, ~490 Mio. Jahre), nicht das innere Knochenskelett."
    ),

    Question(
        categoryId = 9,
        questionText = "Was belegen Studien zu den Sauerstoffisotopen in fossilem Zahnschmelz von Sauropoden-Dinosauriern (insbesondere Brachiosaurus) uber deren Thermoregulation?",
        answerA = "Delta-O18-Werte zeigen Wechselblutigkeit: starke saisonale Schwankungen in Zahnschmelz wie bei Krokodilen",
        answerB = "Delta-O18-Werte (Amiot et al. 2006, Earth and Planetary Science Letters) und Phosphat-O18-Werte zeigen endothermen oder zumindest gigantothermen Metabolismus: Zahnschmelz-O18 korreliert mit Korpertemperaturen von 36-38 Grad Celsius, ahnlich heutiger Grosssauger",
        answerC = "Sauropoden-Zahnschmelz-O18 beweist poikilotherme Kaltblutigkeit; Temperaturwerte unter 25 Grad Celsius",
        answerD = "Keine aussagekraftigen Ergebnisse aus Dinosaurier-Zahnschmelz erzielbar; zu starke diagenetische Alteration",
        correctAnswer = 1,
        explanation = "Amiot et al. (2006) und Barrick & Showers (1994) analysierten delta-O18 von Sauropoden-Zahnschmelz und Knochenapatit. Die Phosphat-Sauerstoff-Isotopie (delta-O18 PO4) in Bioapatit ist mit der Korpertemperatur bei der Mineralisation verbunden (Longinelli & Nuti 1973-Gleichung). Ergebnisse zeigen Korpertemperaturen von 35-38 Grad Celsius fur grosse Sauropoden — vereinbar mit Endothermie oder Gigantothermie (grosse Masse als thermischer Puffer). Das Modell der Gigantothermie (Paladino 1990) erklart hohe Temperaturen auch ohne echte Endothermie durch die schiere Korpermasse.",
        difficulty = 5,
        funFact = "Die grossten Sauropoden (Argentinosaurus, ~70-80 Tonnen) hatten durch ihre enorme Korpermasse ein so gunstiges Oberfachen-Volumen-Verhaltnis, dass sie Korperwarme kaum verloren — ahnlich wie grosse Meeresschildkroten heute bereits Gigantothermie zeigen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche morphologische Anpassung der Arthropoden-Cuticula in der Klade Ecdysozoa ermoglicht das periodische Hautungsverhalten (Ecdysis), und welche molekularen Signalwege steuern diesen Prozess?",
        answerA = "Chitinase-Enzyme bauen Cuticula vollstandig ab; Neusynthese durch Epidermiszellen; Steuersignal: Ecdyson (Steroidhormon) supprimiert Juvenile Hormone",
        answerB = "Chitin-basierte Cuticula wird durch spezifische Proteasen und Chitinase zwischen alter und neuer Cuticula aufgetrennt; Ecdyson-Signalweg (EcR/USP-Kernrezeptor-Heterodimer) als Masterregulator der Ecdysis; Juvenil-Hormon antagonisiert Metamorphose-Signale",
        answerC = "Calciumphosphat-Panzer wird durch Osteoklasten-analoge Zellen abgebaut; Parathormon-analoges Signal steuert Cyclus",
        answerD = "Ecdysis wird durch mechanischen Druck des wachsenden Korpers ausgelost; keine hormonelle Steuerung nachgewiesen",
        correctAnswer = 1,
        explanation = "Ecdysis-Mechanismus (Riddiford 1993, Zieler & Bhaskaran 2000): (1) Alte Cuticula wird durch Trennzone (exocuticle/endocuticle-Grenze) hydrolytisch gespalten; (2) Chitinase und spezifische Proteasen im Exuvial-Fluid bauen alte Cuticularegionen ab; (3) Ecdyson (20-Hydroxyecdyson) bindet EcR/USP-Kernrezeptor-Dimer, aktiviert Ecdysis-Gene-Kaskade; (4) Juvenile Hormone (JH, Sesquiterpene) supprimieren Metamorphose-spezifische Ecdyson-Antworten; (5) EH (Eclosion Hormone) und ETH (Ecdysis-Triggering Hormone) koordinieren finalen Hautungsvorgang. Dieses System ist in Nematoden (Ecdysozoa) und Arthropoden konserviert.",
        difficulty = 5,
        funFact = "Arthropoden sind wahrend der Ecdysis (Hautung) besonders verletzlich — weiche, ungesklerotisierte Haut, erschopft durch Hautungsprozess. Krebstiere verbergen sich deshalb wahrend der Ecdysis in Verstecken; bei Hummern dauert die Hartung der neuen Schale bis zu 48 Stunden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Struktur des Innenohrs gilt als gemeinsames, homologes Merkmal aller Amniota (Reptilien, Vogel, Saugetiere) und was ist die vergleichend-anatomische Besonderheit bei Saeugetieren gegenuber Reptilien?",
        answerA = "Cochlea (Schnecke) als vollstandig aufgerolltes Organ einzigartig bei Saeugetieren; Reptilien/Vogel haben gerade oder leicht gebogene Lagena statt aufgerollter Cochlea",
        answerB = "Alle Amniota haben identische Cochlea-Morphologie; Unterschiede nur in Grosse und Frequenzreichweite",
        answerC = "Reptilien besitzen keine auditorischen Haarzellen; Saugetiere entwickelten diese de novo",
        answerD = "Tympanalmembran (Trommelfell) als Amniota-Synapomorphie; Reptilien haben geschlossenes Mittelohr, Saugetiere offenes",
        correctAnswer = 0,
        explanation = "Das Innenohr der Amniota enthalt eine Lagena (papilla lagena) als Schallwahrnehmungsorgan. Homologievergleich (Fritzsch et al. 2013, Hearing Research): Reptilien/Vogel besitzen eine gerade oder leicht gekrummte Lagena (Basilarpapille); Saugetiere entwickelten eine vollstandig aufgerollte Cochlea (bis 2,5-4 Windungen bei Menschen). Die Cochlear-Aufrollung ermoglicht ein kontinuierliches tonotopisches Map uber einen grosseren Frequenzbereich (20 Hz - 20 kHz beim Menschen), wahrend Reptilien meist auf schmalere Frequenzbander beschrankt sind. Drei Mittelohrknoechelchen (Malleus, Incus, Stapes) sind eine weitere Saeugetier-Synapomorphie.",
        difficulty = 5,
        funFact = "Elefanten horen mit dem Boden: ihre Fusse und der Russel nehmen Infraschall-Erschutterungen wahr, die durch Substrat ubertragen werden — eine Kommunikationsform uber Kilometer Distanz, die erst 1994 von Cynthia O'Connell entdeckt wurde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches devonische Fossil aus dem Miguasha-Nationalpark (Quebec) zeigt als fruhester bekannter Nachweis Merkmale sowohl von Rhipidistia-Fischen als auch von fruhen Tetrapoden und wird als 'missing link' des aquatisch-terrestrischen Ubergangs bezeichnet?",
        answerA = "Panderichthys rhombolepis (Letten-Devon, ca. 380 Mio. Jahre): tetrapodoider Schadel, Loss der Rueckenflossen, tetrapodahnliche Wirbelsaule, Pectoralflossen mit Humerus/Radius/Ulna analog Tetrapoden",
        answerB = "Eusthenopteron foordi (Mittleres Devon): vollstandig tetrapod, vier echte Extremitaten belegt",
        answerC = "Elpistostege watsoni (Spatdevon): vollstandiger Uebergang mit echten Ziffern dokumentiert",
        answerD = "Ventastega curonica (Spatdevon): basalster echter Tetrapode mit vollstandiger terrestrischer Anatomie",
        correctAnswer = 0,
        explanation = "Panderichthys rhombolepis (ca. 380 Mio. Jahre, Lettland; Vorobyeva & Schultze 1991) ist das wichtigste Uebergangsform zwischen Rhipidistia und Tetrapoden (Tetrapodomorpha). Diagnostische Merkmale: (1) abgeflachter, tetrapodoider Schadel mit dorsalen Augen; (2) Verlust der zweiten Rueckenflosse und der Analflosse; (3) Pectoralflosse mit erkennbarem Humerus, Radius, Ulna; (4) tetrapodahnliche Wirbelkonstruktion. Steht zwischen Eusthenopteron (fishlike) und Tiktaalik/Acanthostega (mehr-tetrapod) in der Ubergangssequenz. Elpistostege watsoni (Cloutier et al. 2020, Nature) zeigte sogar Fingeranlagen.",
        difficulty = 5,
        funFact = "Elpistostege watsoni (2020, Cloutier et al.) wurde als 'luckende Verbindung' zwischen Fisch und Tetrapoden beschrieben, nachdem ein vollstandiges Exemplar im Miguasha-Park gefunden wurde, das echte Fingerknochen-Anlagen im Flossengerust zeigt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche primare Funktion hat das Jacobsonsche Organ (Vomeronasalorgan, VNO) bei Schlangen aus vergleichend-anatomischer Sicht, und welche Rezeptorklasse unterscheidet es vom Hauptgeruchsorgan?",
        answerA = "Thermorezeption: VNO detektiert Infrarot-Warmestrahlung von Beute; thermosensible TRP-Kanale (TRPA1) als Rezeptoren",
        answerB = "Chemorezeption luftgetragener Geruchsmolekule wie Hauptgeruchsorgan; identische OR-Rezeptorfamilie, aber andere Lage",
        answerC = "Chemorezeption nicht-fluchtiger Duftstoffe und Pheromonwahrnehmung; VR1/V2R-Rezeptorfamilien (Vomeronasale Rezeptoren), die von Hauptgeruchs-OR-Rezeptoren distinkt sind; afferente Signalwege zum Accessory Olfactory Bulb (AOB) statt Hauptriechkolben",
        answerD = "Gleichgewichtswahrnehmung (Vestibularfunktion) bei aquatischen Schlangen; keine Chemorezeptoren vorhanden",
        correctAnswer = 2,
        explanation = "Das Jacobsonsche Organ (VNO) bei Squamaten (Schlangen, Eidechsen) ist auf Chemorezeption nicht-fluchtiger und schwer-fluchtiger Molekule spezialisiert: Schlangen transportieren Duftstoffe mit gespaltener Zunge in das paarige VNO. Molekulare Basis: V1R- und V2R-Rezeptorfamilien (Vomeronasale Rezeptoren Typ 1/2) sind strukturell von olfaktorischen OR-Rezeptoren (Hauptgeruch) verschieden, G-Protein-gekoppelt uber Galphai und Galphaο. Signale gehen zum Accessory Olfactory Bulb (AOB), nicht zum Hauptriechkolben, und von dort zu Amygdala und Hypothalamus fur soziale/reproduktive Verhaltenssteuerung.",
        difficulty = 5,
        funFact = "Der Mensch hat ein rudimentares VNO (als Embryo deutlicher, im Erwachsenen reduziert) ohne funktionale Rezeptorgene — ein vestigiales Organ, das bei unseren Vorfahren mogelicherweise Pheromone detektiert hat."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Theorie erklaert die polyphyletische Entstehung der Warmblutigkeit (Endothermie/Homoiothermie) bei Vogeln und Saugetieren, und welche metabolischen Schlusselenzyme gelten als Indikatoren?",
        answerA = "Thermogenin-Theorie: braunes Fettgewebe mit UCP1 (Uncoupling Protein 1) ermoglichte Warmeerzeugung; UCP1 entstand einmalig in gemeinsamen Warmbluter-Vorfahren",
        answerB = "Aerobic-Capacity-Modell (Bennett & Ruben 1979): Endothermie entstand als Nebenprodukt erhohter aerober Kapazitat fur Aktivitat; hohe Mitochondriendichte (COX-Aktivitat), Kreatin-Phosphatpuffer und Laktat-Dehydrogenase-Isozym-Muster als Indikatoren; konvergente Entstehung in Saeugetier-Stammlinie und Vogelstammlinie unabhangig",
        answerC = "Insulation-First-Modell: Fell/Federn entstanden als primarer Warmeschutz; Endothermie folgte als sekundare Konsequenz der verbesserten Warmedammung",
        answerD = "Einmalige Entstehung in gemeinsamen Amniota-Vorfahren; Reptilien sind sekundar kaltblut geworden",
        correctAnswer = 1,
        explanation = "Das Aerobic Capacity Model (Bennett & Ruben 1979, weiterentwickelt von Hulbert & Else 2000) ist das akzeptierteste Modell: Selektion fur hohere aerobe Aktivitaet erforderte mehr Mitochondrien, hohere ATP-Produktion und damit mehr Warmeproduktion als Nebenprodukt. Indikatoren: (1) Mitochondriendichte (COX-Aktivitat = Cytochrom-c-Oxidase); (2) Na/K-ATPase-Aktivitat (membrane leak); (3) LDH-Isozymmuster (muskulare LDH fuer schnelle Glykolyse). Voegel und Saugetiere entwickelten Endothermie unabhangig (konvergent) aus ektothermen Amniota-Vorfahren, was durch die unterschiedliche anatomische Umsetzung (Haare vs. Federn, verschiedene Thermogenin-Typen) belegt ist.",
        difficulty = 5,
        funFact = "Schnabelkrebse (Tuatara, Sphenodon punctatus) in Neuseeland haben eine Korpertemperatur von nur 12 Grad Celsius als optimale Aktivitatstemperatur — ein lebender Beleg fur ektotherme Reptilien-Physiologie im 21. Jahrhundert."
    ),

)
