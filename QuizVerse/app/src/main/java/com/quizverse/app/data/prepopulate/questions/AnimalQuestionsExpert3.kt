package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsExpert3(): List<Question> = listOf(

    // ── EXPERT (difficulty = 4) — Animal Physiology & Neurobiology ──────────

    Question(
        categoryId = 9,
        questionText = "Welches Protein ist hauptsaechlich fuer den Sauerstofftransport im Muskelgewebe von Walen und Robben verantwortlich und verleiht deren Muskeln die charakteristische dunkelbraune Farbe?",
        answerA = "Haemoglobin",
        answerB = "Cytochrom c",
        answerC = "Myoglobin",
        answerD = "Transferrin",
        correctAnswer = 2,
        explanation = "Myoglobin ist ein intrazellulaeres Sauerstoffspeicherprotein in Muskeln. Tauchende Saeugetiere wie Wale und Robben besitzen eine extrem hohe Myoglobinkonzentration (bis 10x mehr als Landtiere), was ihre Muskeln fast schwarz faerbt und Tauchzeiten von ueber 90 Minuten ermoeglicht.",
        difficulty = 4,
        funFact = "Ein Pottwal kann dank seines extrem hohen Myoglobingehalts bis zu 90 Minuten tauchen und Tiefen von ueber 3000 Metern erreichen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie funktioniert das Gegenstromaustauschsystem in den Schwanzflossen von Delfinen zur Thermoregulation?",
        answerA = "Warmes arterielles Blut erwaermt venoses Blut durch direkten Kontakt, bevor es die Koerperkerntemperatur senkt",
        answerB = "Kaltes Meerwasser wird durch Hautporen aktiv aufgenommen und intern erwaermt",
        answerC = "Braunfettgewebe produziert Waerme direkt in den Flossen",
        answerD = "Spezielle Salzdruesenaktivitaet reguliert die Waermeabgabe",
        correctAnswer = 0,
        explanation = "Im Gegenstromaustauscher (Rete mirabile) liegen arterielle und venoese Blutgefaesse eng benachbart. Das warme arterielle Blut, das von der Koerpermitte zu den Flossen fliesst, gibt Waerme an das kuehlere zurueckfliessende Venenblut ab. So erreicht nur abgekuehltes Blut die peripheren Extremitaeten, waehrend die Koerperkerntemperatur erhalten bleibt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Enzym katalysiert die Biolumineszenzreaktion beim Gluehwuermchen und setzt dabei Licht frei?",
        answerA = "Peroxidase",
        answerB = "Luciferase",
        answerC = "Oxidoreduktase",
        answerD = "Phospholipase",
        correctAnswer = 1,
        explanation = "Luciferase katalysiert die ATP-abhaengige Oxidation von Luciferin unter Sauerstoffverbrauch. Das entstehende angeregte Oxyluciferin emittiert beim Uebergang in den Grundzustand Photonen im gruenlich-gelben Spektralbereich (550-570 nm). Die Reaktion ist nahezu 100% effizient — kaum Waerme wird freigesetzt.",
        difficulty = 4,
        funFact = "Die Luciferase-Luciferin-Reaktion ist eine der energieeffizientesten Lichtproduktionen der Natur — nahezu 100% der Energie wird als Licht abgegeben, nicht als Waerme."
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen molekularen Mechanismus erkennen Haie elektrische Felder ihrer Beute ueber die Lorenzinischen Ampullen?",
        answerA = "Spannungsgesteuerte Natriumkanaele in spezialisierten Haarzellen",
        answerB = "Mechanorezeptoren die auf Druckaenderungen durch Ionenbewegung reagieren",
        answerC = "Niederohmige gelatinegefuellte Kanaele die kleinste Spannungsgradienten an Haarzellen weiterleiten",
        answerD = "Piezoelektrische Kristallstrukturen im Knorpelgewebe",
        correctAnswer = 2,
        explanation = "Die Lorenzinischen Ampullen sind mit einer hochleitfaehigen Gelee-Substanz (Glycoprotein) gefuellt, die elektrische Signale bis zu 0,005 Mikrovolt/cm weiterleiten kann. Spannungsaenderungen an der Oeffnung werden bis zu den Haarzellen am Ampullengrund transmittiert, wo sie Ionenkanaele oeffnen und Aktionspotentiale ausloesen.",
        difficulty = 4,
        funFact = "Haie koennen elektrische Felder von 0,005 Mikrovolt pro Zentimeter wahrnehmen — das entspricht dem Feld einer AA-Batterie in 1600 Kilometern Entfernung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Haemoglobin-Typ mit erhoehter Sauerstoffaffinitaet findet sich bei Foetalen Saeugetieren und ermoeglicht den Sauerstofftransfer von der Mutter zum Foetus?",
        answerA = "Haemoglobin S (HbS)",
        answerB = "Haemoglobin A2 (HbA2)",
        answerC = "Haemoglobin F (HbF, fetales Haemoglobin)",
        answerD = "Haemoglobin C (HbC)",
        correctAnswer = 2,
        explanation = "Fetales Haemoglobin (HbF) besitzt gamma-Untereinheiten statt der beta-Untereinheiten des adulten HbA. Gamma-Untereinheiten binden 2,3-Bisphosphoglycerat (2,3-BPG) mit geringerer Affinitaet, was die Sauerstoffaffinitaet von HbF erhoeht. Dadurch kann HbF Sauerstoff von muetterlichem HbA an der Plazenta binden und zum Foetus transportieren.",
        difficulty = 4,
        funFact = "Nach der Geburt wird fetales Haemoglobin schrittweise durch adultes Haemoglobin ersetzt — dieser Prozess ist nach etwa 6 Monaten abgeschlossen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Neuropeptid wird im Hypothalamus synthetisiert und reguliert durch osmotischen Druck die Wasserretention in den Nierentubuli von Saeugetieren?",
        answerA = "Oxytocin",
        answerB = "Arginin-Vasopressin (AVP / ADH)",
        answerC = "Gonadotropin-Releasing-Hormon (GnRH)",
        answerD = "Corticotropin-Releasing-Hormon (CRH)",
        correctAnswer = 1,
        explanation = "Arginin-Vasopressin (AVP), auch Antidiuretisches Hormon (ADH) genannt, wird in magnozellulären Neuronen des Nucleus supraopticus und Nucleus paraventricularis synthetisiert. Bei steigendem osmotischem Druck wird AVP aus der Neurohypophyse freigesetzt und bindet an V2-Rezeptoren in den Sammelrohren, was die Insertion von Aquaporin-2-Kanaelen und erhoehte Wasserreabsorption bewirkt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gift der Kegelschnecke (Conus geographus) blockiert spannungsgesteuerte Natriumkanaele und gilt als eines der wirksamsten tierischen Neurotoxine?",
        answerA = "Tetrodotoxin",
        answerB = "mu-Conotoxin GIIIA",
        answerC = "omega-Conotoxin GVIA",
        answerD = "alpha-Conotoxin MI",
        correctAnswer = 1,
        explanation = "mu-Conotoxine blockieren spannungsgesteuerte Natriumkanaele (Nav1.4 an Skelettmuskeln), was zu Lahmung fuehrt. Conus geographus produziert ein komplexes Gemisch aus Peptidtoxinen (Conotoxine), die verschiedene Ionenkanaele angreifen. Das Gesamtgift fuehrt zu Atemlahmung und ist fuer mehrere menschliche Todesfaelle verantwortlich.",
        difficulty = 4,
        funFact = "Das Gift einer einzigen Kegelschnecke enthaelt ueber 100 verschiedene Peptidtoxine — Wissenschaftler erforschen diese als potenzielle Schmerzmittel."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert die Magnetorientierung bei Zugvoegeln auf molekularer Ebene gemaess der Radikalpaar-Hypothese?",
        answerA = "Magnetit-Nanopartikel in den Schnabelrezeptoren rotieren mechanisch und aktivieren Ionenkanaele",
        answerB = "Lichtinduzierte Radikalpaare im Cryptochrom-Protein zeigen spinabhaengige Reaktionsraten die vom Erdmagnetfeld beeinflusst werden",
        answerC = "Eisenhaltige Haarzellen im Innenohr reagieren direkt auf magnetische Kraftlinien",
        answerD = "Elektrische Induktion durch Flugbewegungen im Erdmagnetfeld wird in spezialisierten Neuronen detektiert",
        correctAnswer = 1,
        explanation = "Cryptochrome sind Flavoproteine, die bei Blaulichtabsorption transiente Radikalpaare bilden. Der Elektronenspin dieser Radikale wird durch externe Magnetfelder beeinflusst, was die Reaktionsraten und damit die relativen Konzentrationen von Produkt und Ausgangssubstanz aendert. Diese chemischen Signale werden vom Nervensystem als Richtungsinformation verarbeitet.",
        difficulty = 4,
        funFact = "Voegel 'sehen' das Magnetfeld moeglicherweise als Ueberlagerung im visuellen Feld — es ist ein quantenmechanischer Kompass direkt im Auge."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein bildet die Hauptkomponente der Cuticula bei Arthropoden und zeichnet sich durch kovalente Quervernetzung (Sklerotisierung) aus?",
        answerA = "Kollagen Typ IV",
        answerB = "Resilin",
        answerC = "Arthropodin-Chitin-Komplex (sklerotisiertes Arthropodin)",
        answerD = "Spidroin",
        correctAnswer = 2,
        explanation = "Die Arthropodencuticula besteht aus Chitin-Mikrofibrillen eingebettet in eine Proteinmatrix (Arthropodin und verwandte Proteine). Sklerotisierung haertet die Cuticula durch oxidative Quervernetzung von Proteinseitenketten mittels Chinonen (aus Dopamin/DOPA). Das Enzym Phenoloxidase katalysiert die Produktion der reaktiven Chinonintermediate.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Effekt hat die Bohr-Verschiebung auf die Sauerstoffbindung von Haemoglobin in aktiv metabolisierenden Geweben?",
        answerA = "Steigende CO2-Konzentration und sinkender pH erhoehen die Sauerstoffaffinitaet und foerdern die Beladung",
        answerB = "Steigende CO2-Konzentration und sinkender pH verringern die Sauerstoffaffinitaet und foerdern die Entladung",
        answerC = "Temperaturanstieg erhoeht die Haemoglobinaffinitaet unabhaengig vom pH",
        answerD = "Die Bohr-Verschiebung betrifft nur fetales Haemoglobin",
        correctAnswer = 1,
        explanation = "Der Bohr-Effekt beschreibt die pH-abhaengige Sauerstoffaffinitaetsaenderung des Haemoglobins. In aktivem Gewebe steigen CO2 und Laktat an, der pH sinkt. Protonierung von Histidinresten (v.a. His146 der beta-Kette) stabilisiert die T-Konformation (desoxy), was die Sauerstoffaffinitaet verringert und die O2-Abgabe foerdert. In der Lunge kehrt sich der Prozess um.",
        difficulty = 4,
        funFact = "Christian Bohr entdeckte diesen Effekt 1904 — er war der Vater des Physikers Niels Bohr."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche ionischen Grundlage erklaert die hohe Leitungsgeschwindigkeit von 70-120 m/s in myelinisierten Nervenfasern verglichen mit nicht-myelinisierten Fasern?",
        answerA = "Mehr Natriumkanaele pro Laengeneinheit im myelinisierten Axon erhoehen die Ionenflussrate",
        answerB = "Saltatorische Erregungsleitung: Aktionspotenziale springen zwischen Ranvierschen Schnuerringen, ueberspringen den hochohmigen Myelinabschnitt",
        answerC = "Myelin erhoetzt die intrazellulaere Kaliumkonzentration und beschleunigt die Repolarisation",
        answerD = "Schwann-Zellen pumpen aktiv Natriumionen in Richtung Signalausbreitung vor",
        correctAnswer = 1,
        explanation = "Myelin erhoeht den Membranwiderstand und senkt die Kapazitaet zwischen Ranvierschen Schnuerringen. Der Ionenstrom fliesst dabei vorwiegend kapazitiv (kein Ionenkanal-gestuertzter Fluss) durch den Myelinabschnitt zum naechsten Schnuerring, wo Natriumkanaele dicht gepackt sind und das Aktionspotenzial regenerieren. Dies ist energieeffizienter und schneller als kontinuierliche Erregungsleitung.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Spezies bestand als erste einen Spiegeltest (Mirror Self-Recognition Test) und ist damit neben Menschenaffen als selbstbewusst eingestuft?",
        answerA = "Delfine (Tursiops truncatus) — 2001 durch Diana Reiss und Lori Marino",
        answerB = "Elefanten (Elephas maximus) — 2006 durch Plotnik, de Waal und Reiss",
        answerC = "Kraehenvoegel (Corvus monedula) — 2008 durch Helmut Prior",
        answerD = "Tintenfische (Octopus vulgaris) — 2015",
        correctAnswer = 0,
        explanation = "Delfine bestanden 2001 den Spiegeltest: Diana Reiss und Lori Marino zeigten, dass Grosse Tuemmler Markierungen an ihrem Koerper im Spiegel untersuchen — ein Zeichen fuer Selbstwahrnehmung. Spaeter bestanden auch Elefanten (2006) und europaeische Elstern (2008) den Test, Oktopusse hingegen noch nicht eindeutig.",
        difficulty = 4,
        funFact = "Delfine erkennen sich nicht nur im Spiegel, sondern testen ihre Reflexion spielerisch — sie machen Blasen und beobachten deren Spiegelbild."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Toxin aus dem Blauring-Oktopus (Hapalochlaena maculosa) blockiert spannungsgesteuerte Natriumkanaele und ist identisch mit dem Gift des Kugelfisches?",
        answerA = "Saxitoxin",
        answerB = "Batrachotoxin",
        answerC = "Tetrodotoxin (TTX)",
        answerD = "Palytoxin",
        correctAnswer = 2,
        explanation = "Tetrodotoxin (TTX) bindet mit hoher Affinitaet an die Pore spannungsgesteuerter Natriumkanaele (Nav) und blockiert den Natriumeinstrom. Es wird nicht vom Oktopus selbst synthetisiert, sondern von symbiontischen Bakterien (v.a. Pseudoalteromonas tetraodonis). Die letale Dosis beim Menschen liegt bei ca. 1-2 mg — ein Gegenmittel existiert nicht.",
        difficulty = 4,
        funFact = "Tetrodotoxin ist ca. 1200x giftiger als Cyanid. Kugelfische in Japan (Fugu) duerfen nur von lizenzierten Koechen zubereitet werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher molekulare Mechanismus liegt dem Hitzeempfinden bei Grubenorgeln von Grubenottern (z.B. Crotalus) zugrunde?",
        answerA = "Direkte thermische Denaturierung von Membranproteinen aktiviert Schmerzrezeptoren",
        answerB = "Infrarotstrahlung wird von einem duennen Membranfilm absorbiert, erwaermt Thermorezeptorzellen mit TRPA1-Kanaelen",
        answerC = "Piezoelektrische Drucksensoren wandeln Waermestrahlung in mechanische Signale um",
        answerD = "Rhodopsin-aehnliche Photorezeptoren im Infrarotbereich depolarisieren direkt",
        correctAnswer = 1,
        explanation = "Die Grubenorgane enthalten eine duenne Membran (ca. 15 Mikrometer) mit hoher Dichte an TRPA1-Ionenkanaelen (Transient Receptor Potential Ankyrin 1). Infrarotstrahlung (Waerme) der Beute wird absorbiert und erwaermt die Membran minimal. TRPA1 ist ein temperaturempfindlicher Kationenkanal, dessen Oeffnungswahrscheinlichkeit mit Temperatur steigt — dadurch werden Aktionspotenziale ausgeloest.",
        difficulty = 4,
        funFact = "Grubenottern koennen Temperaturunterschiede von 0,003 Grad Celsius detektieren — empfindlicher als jede menschliche Messtechnik dieser Zeit."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielt das Protein Prestin in den aeusseren Haarzellen des Saeugetier-Innenohrs bei der Gehoerverstaerkung?",
        answerA = "Prestin ist ein Myosin-aehnliches Motor-Protein das aktive Stereozilien-Bewegung antreibt",
        answerB = "Prestin ist ein elektromechanisches Motorprotein das spannungsabhaengige Laengenaenderungen der aeusseren Haarzellen erzeugt",
        answerC = "Prestin pumpt Kaliumionen in die Endolymphe und erzeugt das endolymphatische Potenzial",
        answerD = "Prestin stabilisiert Tip-Links zwischen Stereozilien und erhoetzt deren Steifigkeit",
        correctAnswer = 1,
        explanation = "Prestin (SLC26A5) ist ein piezoelektrisches Membranprotein in der Plasmamembran aeusserer Haarzellen. Es aendert seine Konformation (und damit die Zellaenge) in Abhaengigkeit vom Membranpotenzial mit Frequenzen bis 80 kHz. Diese aktiven Laengenaenderungen verstaerken Basilarmembranbewegungen mechanisch — der cochleaere Verstaerker. Prestin-Knockout-Maeuse zeigen 40-60 dB Hoerverlust.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Prinzip erklaert die Osmoregulation bei Elasmobranchii (Haie, Rochen) im Meerwasser durch hohe Harnstoffkonzentration im Blut?",
        answerA = "Harnstoff wirkt als kompatibles Osmolyt und gleicht den osmotischen Gradienten zum Meerwasser aus, ohne Proteine zu denaturieren",
        answerB = "Harnstoff wird aktiv an der Kiemenmembran gegen Salzionen ausgetauscht",
        answerC = "Hohe Harnstoffkonzentration vergiftet Parasiten und ersetzt so eine aktive Immunabwehr",
        answerD = "Harnstoff erhoeht die Viskositaet des Blutes und verhindert osmotischen Wasserverlust durch hydrostatischen Druck",
        correctAnswer = 0,
        explanation = "Elasmobranchi halten Harnstoffkonzentrationen von 300-400 mmol/L im Blut aufrecht, zusammen mit Trimethylaminoxid (TMAO). Dies hebt die Blutosmolalitaet leicht ueber das Meerwasser an (leicht hyperosmotisch), sodass Wasser osmotisch einstroemt statt ausstroemet. Harnstoff ist ein kompatibles Osmolyt — es stoert die Proteinstruktur nicht, wird aber durch TMAO in seiner destabilisierenden Wirkung kompensiert.",
        difficulty = 4,
        funFact = "Hai-Fleisch riecht nach Urin, weil nach dem Tod Urease Harnstoff zu Ammoniak abbaut — spezielles Fermentieren neutralisiert diesen Geruch bei Islaendischem Haakal."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Neurotransmitter vermittelt an der neuromuskulaeren Endplatte und bindet an nikotinische Acetylcholinrezeptoren (nAChR) an Skelettmuskeln?",
        answerA = "Glutamat",
        answerB = "Noradrenalin",
        answerC = "Acetylcholin",
        answerD = "Glycin",
        correctAnswer = 2,
        explanation = "An der motorischen Endplatte setzt das Motoneuron Acetylcholin in den synaptischen Spalt frei. ACh bindet an nikotinische Acetylcholinrezeptoren (nAChR) — ligandgesteuerte Ionenkanaele, die bei Bindung fuer Na+ und K+ durchlaessig werden. Der Natriumeinstrom erzeugt ein Endplattenpotenzial, das bei ausreichender Groesse ein Muskelaktionspotenzial ausloest. Acetylcholinesterase hydrolysiert ACh im Spalt.",
        difficulty = 4,
        funFact = "Curare, das Gift suedamerikanischer Pfeilgiftfrosch-Jaeger, blockiert nAChR und fuehrt zu Atemlahmung durch Lahmung der Atemmuskulatur."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiere nutzen Werkzeuge in freier Wildbahn und wurden dabei in Langzeitstudien wissenschaftlich dokumentiert (z.B. durch Jane Goodall)?",
        answerA = "Ausschliesslich Schimpansen (Pan troglodytes) — kein anderes Tier nutzt Werkzeuge",
        answerB = "Schimpansen, Neukaledonische Kraeher, Kappenseeoetter und Gruentinten-Oktopusse",
        answerC = "Nur Primaten: Schimpansen, Gorillas, Orang-Utans und Bonobos",
        answerD = "Nur Meeressaeuger: Delfine und Seeloewen",
        correctAnswer = 1,
        explanation = "Jane Goodall dokumentierte ab 1960 Schimpansen beim Termiten-Angeln mit modifizierten Aesten. Neukaledonische Kraeher (Corvus moneduloides) stellen Haken aus Pandanus-Blaettern her. Kappenseeoetter verwenden Steine als Ambosse. Oktopusse transportieren Kokosnussschalen als portable Unterschluepfe — Werkzeuggebrauch ist phylogenetisch weit verbreitet.",
        difficulty = 4,
        funFact = "Neukaledonische Kraeher koennen Werkzeuge aus Materialien herstellen, die sie noch nie zuvor gesehen haben — ein Zeichen fuer analogisches Denken."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein ermoeglicht es Spinnen, Seide mit Zugeigenschaften herzustellen, die Stahl an Reissfestigkeit pro Gewichtseinheit uebertreffen?",
        answerA = "Fibroin mit beta-Faltblatt-Kristalliten eingebettet in amorphe Glycin-reiche Bereiche (Spidroin-Struktur)",
        answerB = "Kollagen mit Dreifachhelixstruktur und Hydroxyprolin-Quervernetzungen",
        answerC = "Keratin mit disulfidvernetzen alpha-Helices und beta-Keratinfaserbuendeln",
        answerD = "Elastin mit hydrophob-aggregierten VPGXG-Pentapeptidwiederholungen",
        correctAnswer = 0,
        explanation = "Spinnenseide (Major Ampullate Spidroin, MaSp) besitzt eine Bimodal-Struktur: kristalline beta-Faltblatt-Nanokristalle (Polyalanin-Segmente) sind in einer flexiblen amorphen Matrix aus Glycin-reichen Bereichen eingebettet. Die Kristallite wirken als physikalische Quervernetzungspunkte und verleihen Steifigkeit, die amorphe Matrix ermoeglicht Dehnung. Dragline-Seide erreicht 1,1 GPa Zugfestigkeit bei 30% Dehnung.",
        difficulty = 4,
        funFact = "Ein Faden Spinnen-Dragline-Seide von der Dicke eines Bleistifts koennte einen Jumbo-Jet abbremsen — aber die Seidenproduktion durch Spinnen ist bislang nicht industriell skalierbar."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher molekulare Rezeptor vermittelt die Wahrnehmung von Capsaicin (Chilischoten) und Hitzeschmerz bei Saeugetieren?",
        answerA = "TRPV1 (Transient Receptor Potential Vanilloid 1) — ein kationischer Ionenkanal",
        answerB = "P2X3-Purinorezeptor — ein ATP-gesteuerter Kationenkanal",
        answerC = "Nav1.7 — spannungsgesteuerter Natriumkanal in Nozizeptoren",
        answerD = "ASIC3 — sauresensitiver Ionenkanal in Schmerzfasern",
        correctAnswer = 0,
        explanation = "TRPV1 ist ein unselektiver Kationenkanal (Ca2+, Na+) der durch Capsaicin, Temperaturen ueber 43 Grad Celsius, sauren pH (<5,9) und endogene Lipide (Anandamid) aktiviert wird. Die Vanilloid-Bindestelle liegt intrazellulär. TRPV1-Knock-out-Maeuse zeigen stark reduziertes Schmerzverhalten bei Hitze und chemischen Reizen. David Julius erhielt 2021 den Nobelpreis fuer Medizin fuer diese Entdeckung.",
        difficulty = 4,
        funFact = "David Julius entdeckte TRPV1 1997, indem er eine cDNA-Bibliothek aus Schmerzrezeptoren in Eierstockzellen exprimierte und nach Capsaicin-Reaktion suchte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus ermoeglicht es Eisbaerenhaare, Sonnenenergie zu leiten, und ist diese Eigenschaft tatsaechlich physikalisch korrekt?",
        answerA = "Hohle Eisbaerenhaare sind transparente Lichtleiter, die UV-Licht zur Haut fuehren — dies ist eine weit verbreitete Fehlinformation, physikalisch nicht belegt",
        answerB = "Sonderlich dichtes Mark im Haar absorbiert Infrarotstrahlung und wandelt sie in Waerme um",
        answerC = "Spezielle Melanin-Schichten auf der Haaroberflaeche reflektieren Kaelte ab",
        answerD = "Piezoelektrische Kristalle im Haar wandeln mechanische Vibration in Waerme um",
        correctAnswer = 0,
        explanation = "Die Theorie, Eisbaerenhaare seien Glasfaser-aehnliche UV-Lichtleiter zur Haut, ist eine hartnaeckige Fehlinformation. Eisbaerenhaare sind zwar hohl, aber die optischen Eigenschaften (zu viele Streuungspunkte, falscher Brechungsindex) schliessen effektive Lichtleitung aus. Eisbaerenhaare sind tatsaechlich weiss durch Lichtstreuung (wie Schnee) — die schwarze Haut darunter absorbiert Waerme direkt.",
        difficulty = 4,
        funFact = "Der Mythos der lichtleitenden Eisbaerenhaare tauchte 1980 in einem Zeitungsartikel auf und verbreitete sich viral — bis heute in Schulbuecher."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert die Faehigkeit des Afrikanischen Elefantenruesseltieres (Elephantulus) zur Torpor-Hypothermie bei Nahrungsknappheit?",
        answerA = "Erhoeht Schilddruesenhormonproduktion zur Aktivierung der Thermogenese in Braunfett",
        answerB = "Suppression des basalen Metabolismus durch erhoeHte Adenosin-Signalgebung und Absenkung der Koerpertemperatur auf nahezu Umgebungstemperatur",
        answerC = "Aktivierung von SIRT1-Deacetylase triggert mitochondriale Entkopplung und reduziert ATP-Produktion",
        answerD = "Erhoeher Cortisol-Spiegel schaltet den Metabolismus auf Fettsaeurenutzung um ohne Temperaturabsenkung",
        correctAnswer = 1,
        explanation = "Tagliche Torpor bei Ruesseltieren und anderen Kleinsaeugern wird durch erhoehte Adenosin-Ausschuettung (aus ATP-Abbau bei Energiemangel) und verringerte Thermogenin-Aktivitaet getriggert. Der Metabolismus kann auf unter 5% des Grundumsatzes fallen. Adenosin-Rezeptoren im Hypothalamus senken den Temperatur-Sollwert, was die Koerpertemperatur bis auf wenige Grad ueber Umgebungstemperatur absinken laesst.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Phänomen beschreibt das Schwarmverhalten von Staren (Murmeltierschwarm/Murmuration) und welche mathematischen Regeln liegen ihm zugrunde?",
        answerA = "Zentrale Leitvoegel geben Signale ab die alle anderen Voegel direkt befolgen",
        answerB = "Selbstorganisation durch lokale Interaktionsregeln: jeder Vogel orientiert sich an den 6-7 naechsten Nachbarn ohne globale Kontrolle",
        answerC = "Magnetfeldwahrnehmung synchronisiert alle Voegel durch globale elektromagnetische Signale",
        answerD = "Chemische Pheromone erzeugen kollektive Richtungsaenderungen ueber die Luft",
        correctAnswer = 1,
        explanation = "Computersimulationen (Reynolds 1987, Cavagna et al. 2010) zeigen, dass Murmeltierschwarmverhalten durch drei lokale Regeln entsteht: Separation (Kollision vermeiden), Ausrichtung (Geschwindigkeit der Nachbarn anpassen), Kohaesion (zum Schwarmzentrum bewegen). Jeder Vogel beachtet nur 6-7 naechste Nachbarn — keine globale Fuehrung noetig. Dies erzeugt kritische Kopplung und eine Korrelationslaenge ueber den gesamten Schwarm.",
        difficulty = 4,
        funFact = "Staren-Schwarmkollektive zeigen Phasenuebergaenge aehnlich wie suprafluessige Fluessigkeiten — die Physik dahinter wird aktiv in der Statischen Mechanik erforscht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche chemische Reaktionskaskade erzeugt Biolumineszenz bei Meerestiefseebewohnern wie Tiefseegarnelen ohne Luciferase-Luciferin-System?",
        answerA = "Fluoreszenz durch GFP-aehnliche Proteine die kurzwelliges biolumineszentes Licht absorbieren und neu emittieren",
        answerB = "Chemilumineszenz durch Reaktion von Coelenterazin mit Sauerstoff, katalysiert durch Photoproteine wie Aequorin",
        answerC = "Thermolumineszenz durch piezoelektrische Druckentladungen bei schnellen Bewegungen",
        answerD = "Elektrische Entladungen durch spezialisierte Elektrozyten analog zu Zitteraalen",
        correctAnswer = 1,
        explanation = "Viele marine Organismen nutzen Coelenterazin als Substrat und Photoproteine (z.B. Aequorin aus der Qualle Aequorea victoria). Aequorin ist ein Calcium-aktiviertes Photoprotein: bei Ca2+-Bindung oxidiert es Coelenterazin ohne Sauerstoffzufuhr von aussen (der Sauerstoff ist bereits im Protein). FRET auf GFP verschiebt das emittierte Licht von blau (469 nm) nach gruen (508 nm) — das urspruengliche GFP-System.",
        difficulty = 4,
        funFact = "Osamu Shimomura erhielt 2008 den Chemie-Nobelpreis fuer die Entdeckung und Isolierung des Gruenfluoreszenzproteins (GFP) aus Aequorea victoria."
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen physiologischen Mechanismus koennen Nashornkaefer (Dynastinae) das bis zu 850-fache ihres Koerpergewichts tragen?",
        answerA = "Besonders dichtes Muskelgewebe mit erhoeHtem Myosin-II-Gehalt pro Muskelfaserquerschnitt",
        answerB = "Skalengesetze: Muskelkraft skaliert mit Querschnittsflaeche (Laenge^2), Koerpergewicht mit Volumen (Laenge^3) — kleine Tiere haben besseres Kraft/Gewicht-Verhaeltnis",
        answerC = "Exoskelett-interne Hydraulik verstaerkt Muskelkraft durch Hebelmechanismen",
        answerD = "Einzigartige ATP-Isoformen in Insektenmuskeln ermoeglichen 10x hoehere Energiefreisetzungsrate",
        correctAnswer = 1,
        explanation = "Das Kraft-Gewichts-Paradoxon kleiner Tiere erklaert sich durch Allometrie: Muskelkraft ist proportional zur Querschnittsflaeche (L^2), Koerpermasse aber proportional zum Volumen (L^3). Bei einem Tier halb so gross ist die Masse 1/8, die Kraft nur 1/4 — das Kraft/Masse-Verhaeltnis verdoppelt sich. Nashornkaefer sind keine Ausnahme physikalischer Gesetze, sondern profitieren von ihrem kleinen Massstab.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ionenpumpe erzeugt das endolymphatische Potenzial von +80 mV in der Scala media des Innenohrs und ist essentiell fuer das Hoeren bei Saeugetieren?",
        answerA = "Na+/K+-ATPase in den Marginalzellen der Stria vascularis",
        answerB = "KCNQ1/KCNE1-Kaliumkanaele in den intermediären Zellen der Stria vascularis",
        answerC = "Koordiniertes Kaliumrecycling durch Na+/K+-ATPase, NKCC1 und KCNQ1/KCNE1 in der Stria vascularis",
        answerD = "Vakuolaere H+-ATPase in den Haarzellen erzeugt das Potenzial durch Protonenexport",
        correctAnswer = 2,
        explanation = "Das endolymphatische Potenzial (+80-100 mV) entsteht durch ein Dreischrittmechanismus in der Stria vascularis: (1) Na+/K+-ATPase in Fibroblasten der Spiralligaments baut K+-Gradienten auf; (2) K+ fliessen ueber KCNJ10 (Kir4.1) in die Endolymphe ein; (3) Marginale Zellen haben NKCC1 basolateral und KCNQ1/KCNE1 apikal. Das +80 mV-Potenzial ist der entscheidende Treiber fuer den Transduktionsstrom in Haarzellen.",
        difficulty = 4,
        funFact = "Mutationen in KCNQ1 und KCNE1 verursachen das Jervell-Lange-Nielsen-Syndrom: kongenitale Taubheit kombiniert mit kardialer Arrhythmie."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Theorie erklaert die Entstehung des Mitochondriums in eukaryotischen Zellen und wie stuetzt die Mitochondrienphysiologie diese Hypothese?",
        answerA = "De-novo-Entstehung aus Membranfaltungen des Endoplasmatischen Retikulums unter Oxidationsdruck",
        answerB = "Endosymbiontenhypothese (Lynn Margulis 1967): Mitochondrien entstanden durch Endosymbiose eines Alpha-Proteobakteriums",
        answerC = "Virale Insertion: Mitochondrien sind evoluierte Retroviren die Energiemetabolismus uebernommen haben",
        answerD = "Plasmidduplizierung: Kernplasmide bildeten durch Membranbildung Organellen aus",
        correctAnswer = 1,
        explanation = "Lynn Margulis formulierte 1967 die Endosymbiontenhypothese: Ein Archaeon verschlang ein Alpha-Proteobakterium (nah verwandt mit Rickettsia), das nicht verdaut wurde und stattdessen als ATP-Produzent symbiontisch lebte. Stuetzende Evidenz: mitochondriale Doppelmembran, eigene 70S-Ribosomen, zirkulaere mt-DNA, Teilung durch Binaerteilung, gleicher Lipidtyp (Cardiolipin) wie Proteobakterien.",
        difficulty = 4,
        funFact = "Mitochondriale DNA wird ausschliesslich muetterlich vererbt — daher kann man durch mt-DNA-Analyse matrilineare Abstammungslinien zurueck zur 'Mitochondrialen Eva' verfolgen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches neuropeptiderge System reguliert Hunger und Saettigung durch gegensaetzlich wirkende Neuronenpopulationen im Nucleus arcuatus des Hypothalamus?",
        answerA = "NPY/AgRP-Neurone (orexigen) vs. POMC/CART-Neurone (anorexigen) — reguliert durch Leptin und Ghrelin",
        answerB = "Dopaminerge vs. Serotoninerge Neurone regulieren Hungermotivation im Striatum",
        answerC = "Orexin/Hypocretin-Neurone im lateralen Hypothalamus vs. GABA-Neurone im VMH",
        answerD = "CRH-Neurone (stressinduzierter Appetitmangel) vs. MCH-Neurone (stressinduzierter Hunger)",
        correctAnswer = 0,
        explanation = "Im Nucleus arcuatus existieren zwei gegensaetzliche Neuronenpopulationen: NPY/AgRP-Neurone foerdern Hunger (AgRP antagonisiert MC4R), waehrend POMC-Neurone Hunger hemmen (alpha-MSH aktiviert MC4R). Leptin (aus Fettgewebe) hemmt NPY/AgRP und aktiviert POMC — Saettigung. Ghrelin (aus Magen) aktiviert NPY/AgRP — Hunger. Leptin-Rezeptor-Mutationen verursachen schwere Adipositas.",
        difficulty = 4,
        funFact = "Die Entdeckung des Leptin-Gens 1994 durch Jeffrey Friedman revolutionierte das Verstaendnis der Adipositas als metabolische Erkrankung, nicht Willensschwaeche."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Enzym synthetisiert Stickstoffmonoxid (NO) in Endothelzellen der Blutgefaesse und reguliert damit die Gefaessweite?",
        answerA = "Xanthinoxidase (XO) — setzt NO als Nebenprodukt der Purinoxidation frei",
        answerB = "Endotheliale NO-Synthase (eNOS / NOS3) — katalysiert die Oxidation von L-Arginin zu L-Citrullin und NO",
        answerC = "Mitochondriale Cytochrom-c-Oxidase — setzt NO durch partielle O2-Reduktion frei",
        answerD = "Superoxid-Dismutase (SOD) — produziert NO aus Superoxid und Stickstoffverbindungen",
        correctAnswer = 1,
        explanation = "eNOS (endotheliale NOS, NOS3) wird durch Scherstress, Acetylcholin und VEGF aktiviert. Ca2+/Calmodulin und Phosphorylierung an Ser1177 aktivieren das Enzym. L-Arginin + O2 → L-Citrullin + NO. NO diffundiert in glatten Muskelzellen und aktiviert loesliche Guanylatzyklase (sGC), die cGMP synthetisiert. cGMP aktiviert PKG, die MLCK hemmt und Myosin leichte Kette dephosphoryliert — Vasodilatation.",
        difficulty = 4,
        funFact = "Robert Furchgott, Louis Ignarro und Ferid Murad erhielten 1998 den Nobelpreis fuer Medizin fuer die Entdeckung von NO als Signalmolekuel. Nitroglycerin wird im Koerper zu NO umgewandelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches physiologische Prinzip erklaert, warum Kolibris beim Schweben bis zu 1200 Schlaege pro Minute des Herzens benoetigen?",
        answerA = "Hoher Metabolismus durch Schwebflug (10x mehr als Laufen) erfordert schnelle Sauerstofflieferung — Herzfrequenz kompensiert kleinvolumiges Herz",
        answerB = "Kolibriherzen muessen hohe Blutdruckschwankungen durch Schwebflug aktiv ausgleichen",
        answerC = "Die hohe Koerpertemperatur von 42 Grad Celsius erfordert schnellere Enzymkinetik im Herzmuskel",
        answerD = "Besondere Muskelfaser-Isoformen (IIx) benoetigen kurze Refraktaerperioden und erfordern hoehere Herzfrequenz",
        correctAnswer = 0,
        explanation = "Schwebflug bei Kolibris verbraucht 5-10x mehr Energie als Laufen bei vergleichbarer Koerpermasse. Da Sauerstoff mit dem Blut transportiert wird und das Herz relativ klein ist (Schlagvolumen begrenzt), muss die Herzfrequenz kompensieren (HZV = HF x SV). Kolibris haben den hoechsten Herzvolumen-zu-Koerpermasse-Index aller Wirbeltiere und Mitochondrien machen bis zu 35% des Muskelzellvolumens aus.",
        difficulty = 4,
        funFact = "Kolibris fallen naechtlich in Torpor: Herzfrequenz faellt auf 50/min, Koerpertemperatur auf 18 Grad Celsius — ohne dies wuerden sie in der Nacht verhungern."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher physiologische Mechanismus verhindert die Selbstverdauung der Magenschleimhaut bei Saeugetieren trotz extrem sauren Mageninhalts (pH 1-2)?",
        answerA = "Bicarbonat-reicher Schleim (Mucin-Bicarbonat-Schicht) bildet einen pH-Gradienten von Magenlumen (pH 1) bis Epitheloberlaeche (pH 7)",
        answerB = "Magenepithelzellen produzieren permanente Antacida aus Kohlensaeure die lokalen pH neutralisieren",
        answerC = "Pepsin wird inaktiv sezerniert (Pepsinogen) und kann die Schleimhaut selbst nicht angreifen",
        answerD = "Prostaglandine blockieren saure Ionenkanaele in der Magenschleimhaut selektiv",
        correctAnswer = 0,
        explanation = "Mucus-sezernierende Becherzellen produzieren eine 0,2 mm dicke Gel-Schicht aus hochmolekularem Mucin. Diese Schicht hat hohe Viskositaet und behinderrt H+-Diffusion. Gleichzeitig sezernieren Oberflaechenepithelzellen Bicarbonat (HCO3-) apikal in den Mucus, das einstroemende Protonen neutralisiert und einen stabilen pH-Gradienten aufrechterhalt. Prostaglandine (PGE2) stimulieren diese Schutzreaktionen.",
        difficulty = 4,
        funFact = "Helicobacter pylori neutralisiert lokal den Magensaeure durch Urease (Harnstoff → Ammoniak) und schlaegt sich so ins Magenepithel — Barry Marshall trank 1984 H. pylori-Bruehe um die Ursache von Magengeschwueren zu beweisen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Signalmolekuel vermittelt die olfaktorische Transduktion in Riechsinneszellen und koppelt Odorantrezeptoren an den Ionenkanal?",
        answerA = "IP3 oeffnet direkt ER-Calciumkanaele, die dann CNG-Kanaele aktivieren",
        answerB = "cAMP aktiviert CNG-Kanaele (zyklisch-Nukleotid-gesteuerte Kanaele) direkt nach Gs-Aktivierung durch Odorantrezeptor",
        answerC = "DAG aktiviert PKC, die CNG-Kanaele phosphoryliert und oeffnet",
        answerD = "G-Protein beta-gamma-Untereinheit aktiviert PLC, produziert PIP2-Metabolite die Kanaele oeffnen",
        correctAnswer = 1,
        explanation = "Odorantrezeptoren (OR) sind GPCRs die Golf (Gs-aehnlich) aktivieren. Golf aktiviert Adenylatzyklase III → cAMP-Anstieg. cAMP oeffnet CNG-Kanaele (Ca2+, Na+ Einstrom). Ca2+ aktiviert Cal-aktivierte Cl--Kanaele (ANO2/TMEM16B) → weiterer Depolarisierungsstrom. Zudem aktiviert Ca2+ Calmodulin, das CNG-Kanaele desensitiviert (negative Rueckkopplung). Richard Axel und Linda Buck erhielten 2004 den Nobelpreis fuer diese Entdeckung.",
        difficulty = 4,
        funFact = "Menschen besitzen ca. 400 funktionale Odorantrezeptor-Gene — Maeuse ca. 1000. Die Kombination verschiedener aktivierter Rezeptoren ermoeglicht die Unterscheidung von mehr als einer Billion verschiedener Geruuche."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezielle Adaptation ermoeglichen Froeschen und anderen Amphibien die kutane Atmung (Hautatmung) durch Wasser und ermoeglicht die Ueberwinterung unter Eis?",
        answerA = "Spezielles Haemoglobin mit 10x hoeHerer Sauerstoffaffinitaet in Amphibien",
        answerB = "Hochdurchlaessige, gefaessreiche Haut mit duenner Cornification und dichtem Kapillarnetz direkt unter der Epidermis",
        answerC = "Kiemenaehnliche Strukturen unter der Haut die im Winter aktiviert werden",
        answerD = "Anaerobe Glykolyse deckt 100% des Energiebedarfs ohne Sauerstoff im Winter",
        correctAnswer = 1,
        explanation = "Amphibienhaaut ist extrem durchlaessig (keine Verhornung wie bei Reptilien) und stark vaskularisiert. Kapillaren liegen unmittelbar unter der Epidermis, die nur wenige Zellagen dick ist. Sauerstoff diffundiert direkt aus dem Wasser durch Haut in Kapillaren. Bei 4 Grad Celsius im Winter ist der O2-Bedarf so gering (Q10-Effekt: Metabolismus halbiert sich pro 10 Grad K Abkuehlung), dass Hautatmung ausreicht.",
        difficulty = 4,
        funFact = "Die Tigerkatzenechse (Notechis scutatus) kann 40% ihres Sauerstoffs ueber die Haut aufnehmen — bei vollstaendig blockierter Lunge ueberleben sie stundenlang."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt die Entdeckung, dass Nervenzellen im Hippocampus von Saeugetieren (Place Cells) sich aktiv entladen wenn das Tier bestimmte Orte im Raum besucht?",
        answerA = "Long-Term Potentiation (LTP) — synaptische Staerkung durch wiederholte Aktivierung",
        answerB = "Ortszellen (Place Cells) — von John O'Keefe 1971 entdeckte hippocampale Neurone mit raumlokalisierter Aktivierung",
        answerC = "Gitterzellen (Grid Cells) — entorhinale Zellen mit hexagonalen Aktivierungsmustern",
        answerD = "Grenzzellen (Border Cells) — Neurone die auf Raumgrenzen ansprechen",
        correctAnswer = 1,
        explanation = "John O'Keefe entdeckte 1971 'Place Cells' im Hippocampus der Ratte: spezifische Pyramidenzellen feuern nur wenn das Tier sich an einem bestimmten Ort (Place Field) befindet. Zusammen mit Grid Cells (May-Britt und Edvard Moser, 2005) bilden sie ein kognitives Kartensystem ('neuronales GPS'). O'Keefe und die Mosers erhielten 2014 den Nobelpreis fuer Medizin.",
        difficulty = 4,
        funFact = "Gitterzellen im entorhinalen Kortex von Ratten feuern in einem perfekten hexagonalen Muster ueber die gesamte Umgebung — sie sind ein metrisches System des Raumes."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein ist die molekulare Grundlage des 'Lauf oder Kampf'-Reflexes und bindet an beta-adrenerge Rezeptoren in Herz und Lunge?",
        answerA = "Adrenalin (Epinephrin) — sezerniert vom Nebennierenmark bei Sympathikusaktivierung",
        answerB = "Cortisol — sezerniert von der Nebennierenrinde bei chronischem Stress",
        answerC = "Noradrenalin — ausschliesslich neuronaler Transmitter ohne endokrine Wirkung",
        answerD = "Dopamin — primaeR im mesolimbischen System aktiv",
        correctAnswer = 0,
        explanation = "Das Nebennierenmark (Chromaffinzellen) sezerniert bei Sympathikusaktivierung Adrenalin (80%) und Noradrenalin (20%) direkt ins Blut. Adrenalin bindet an beta1-Rezeptoren (Herz: positive Chronotropie, Inotropie), beta2-Rezeptoren (Lunge: Bronchodilatation, Skelettmuskel: Vasodilatation) und alpha1-Rezeptoren (Haut/Eingeweide: Vasokonstriktion). Dies optimiert die Kampf-oder-Flucht-Physiologie.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Form der Osmoregulation nutzen marine Knochen fische (Teleostei) im Meerwasser, und welche Ionenpumpen sind dabei in den Kiemen zentral?",
        answerA = "Hyperosmoregulation: Fisch trinkt Meerwasser, Na+/K+-ATPase in Chloridzellen sezerniert Na+ und Cl- aktiv ins Wasser",
        answerB = "Isoosmoregulation: Teleostier sind isosmotisch zum Meerwasser — keine aktive Regulation noetig",
        answerC = "Anhydrie: Teleostier produzieren kein Harn und verlieren kein Wasser",
        answerD = "Ureotelismus: Harnstoffproduktion reguliert die Osmolalitaet identisch wie bei Haien",
        correctAnswer = 0,
        explanation = "Marine Teleostier sind hyposmotisch zum Meerwasser — sie verlieren staendig Wasser osmotisch und gewinnen Salze. Kompensation: (1) Kontinuierliches Trinken von Meerwasser; (2) NaCl-Absorption im Darm; (3) Aktive NaCl-Sekretion ueber MRC (Mitochondria-Rich Cells / Chloridzellen) in den Kiemen mittels Na+/K+-ATPase, NKCC1, CFTR. Harn ist wenig konzentriert, aber wenig produziert.",
        difficulty = 4,
        funFact = "Lachse migrieren zwischen Suess- und Salzwasser — dabei veraendern ihre Kiemen- und Nierenphysiologie sich fundamental, was durch Cortisol und Wachstumshormon gesteuert wird."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher elektrophysiologische Mechanismus erklaert die Erzeugung elektrischer Entladungen von 600 Volt beim Zitteraal (Electrophorus electricus)?",
        answerA = "Spezielle Mitochondrien in Elektrozyten produzieren elektrische Energie direkt aus ATP",
        answerB = "Serielle Reihenschaltung tausender Elektrozyten (modifizierte Muskelzellen), die wie Batteriezellen in Serie geschaltet je 150 mV addieren",
        answerC = "Piezoelektrische Schichten in Hautschuppen wandeln Schwimmbewegungen in Hochspannung um",
        answerD = "Elektrochemische Reaktion von Natriumchlorid in spezialisierten Zellen erzeugt galvanische Spannung",
        correctAnswer = 1,
        explanation = "Elektrozyten sind modifizierte Skelettmuskelfasern die keine Aktin-Myosin-Kontraktion mehr ausfuehren. Sie sind stark abgeflacht und besitzen nur auf einer Seite innervierte Membran mit hoher Natriumkanal-Dichte. Bei Aktivierung erzeugt jede Zelle ca. 150 mV (Ruhepotenzial + Aktionspotenzial). Tausende Elektrozyten in Serie schalten diese Spannungen auf 600 V und koennen 1 Ampere liefern — genueg um ein Pferd zu betaeuben.",
        difficulty = 4,
        funFact = "Der Zitteraal ist kein echter Aal sondern ein Messerfisch (Gymnotiformes). Er orientiert sich durch schwache Entladungen (1-10 V) und nutzt Hochspannung nur zur Jagd und Verteidigung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche besondere Eigenschaft der Haemolymphe des Antarktischen Eisfisches (Channichthyidae) kompensiert das Fehlen von Haemoglobin vollstaendig?",
        answerA = "Extrem hohe Haemocyanin-Konzentration ersetzt Haemoglobin mit gleichwertiger O2-Kapazitaet",
        answerB = "Grosses Blutvolumen (2-4x), grosses Herz mit hohem Schlagvolumen und antifreeze glycoproteins (AFGPs) ermoeglichen O2-Transport physisch geloest",
        answerC = "Myoglobin wird in allen Geweben exprimiert und ersetzt extrazellulären O2-Transport vollstaendig",
        answerD = "Anaerober Stoffwechsel durch Kreatinphosphat-Puffer deckt den gesamten Energiebedarf",
        correctAnswer = 1,
        explanation = "Eisfische verloren evolutionaer Haemoglobin und Myoglobin (Pseudogen). Bei 0 Grad Celsius enthaelt Wasser mehr geloesten O2 als bei 37 Grad. Kompensation: 2-4x groesseres Blutvolumen, hypertrophiertes Herz (bis 0,5% Koerpermasse vs. 0,1% bei anderen Fischen), grosses Schlagvolumen, weitlumige Kapillaren. Antifreeze-Glykoproteine verhindern Eiskristallbildung. O2 wird physisch im Plasma geloest transportiert.",
        difficulty = 4,
        funFact = "Das Herz des Eisfisches ist transparent — man kann das Blut direkt durch die Herzwand pumpen sehen. Es ist das einzige Wirbeltier ohne Haemoglobin."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept der Neuroethologie beschreibt eingebaute neuronale Schaltkreise die artspezifisches Verhalten ohne Lernen ausloesen, wie das Ei-Rollverhalten der Graugans?",
        answerA = "Konditionierungsreflex (klassische Konditionierung nach Pawlow)",
        answerB = "Angeborenes Ausloese-Schema (IRM) und Fixed Action Pattern (FAP) nach Konrad Lorenz und Nikolaas Tinbergen",
        answerC = "Imprinting (Pragung) — einmaliger Lernprozess in sensitivem Zeitfenster",
        answerD = "Operantes Lernen durch positive Verstaerkung im Belohnungssystem",
        correctAnswer = 1,
        explanation = "Konrad Lorenz und Nikolaas Tinbergen begruendeten die Neuroethologie. Ein Innate Releasing Mechanism (IRM) ist ein neuronaler Schaltkreis der auf spezifische Reizkonfigurationen (Sign Stimuli) anspricht. Er loest ein Fixed Action Pattern (FAP) aus — eine stereotyp ablaufende Verhaltenssequenz. Das Ei-Rollen der Graugans ist ein klassisches Beispiel: einmal gestartet laeuft die Sequenz auch ohne Reiz zu Ende (Ballerbewegung). Lorenz/Tinbergen erhielten 1973 den Nobelpreis.",
        difficulty = 4,
        funFact = "Supranormale Stimuli uebertreffen natuerliche Ausloser: Eine riesige kuenstliche Graugansei wird gieriger eingerollt als ein normales Ei — das neuronale IRM-System laesst sich 'ueberstimuluern'."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche biochemische Reaktion ermoeglicht Schlittenhunden und anderen Ausdauerathleten die hohe Fettoxidation (Lipolyse) bei langanhaltender Belastung?",
        answerA = "Phospholipase A2 hydrolysiert Membranphospholipide zu freien Fettsaeuren fuer die beta-Oxidation",
        answerB = "Hormon-sensitive Lipase (HSL) und Adipozyten-Triglyzerid-Lipase (ATGL) hydrolysieren Triglyzeride zu Glycerol und freien Fettsaeuren",
        answerC = "Lipoproteinlipase im Blut hydrolysiert direkt VLDL-Partikel und leitet Fettsaeuren in Muskelzellen",
        answerD = "Peroxisomale Fettsaeureoxidation durch ACOX1 ist der limitierende Schritt der Lipolyse",
        correctAnswer = 1,
        explanation = "Bei anhaltender Belastung steigen Glucagon und Adrenalin, die via cAMP-PKA-Kaskade HSL und ATGL in Adipozyten phosphorylieren/aktivieren. ATGL hydrolysiert Triglyzeride zu Diglyzeriden (rate-limiting step), HSL hydrolysiert Di- zu Monoglyzeriden, Monoglyzeridlipase den Rest. Freie Fettsaeuren (FFS) gelangen ins Blut, binden an Albumin, und werden in Skelettmuskel-Mitochondrien via beta-Oxidation zu Acetyl-CoA oxidiert.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Neuropeptid reguliert Schlaf-Wach-Rhythmen und ist bei Narkolepsie-Patienten dramatisch reduziert?",
        answerA = "Melatonin aus der Zirbeldruse reguliert den zirkadianen Rhythmus",
        answerB = "Orexin (Hypocretin) aus dem lateralen Hypothalamus foerdert Wachheit und ist bei Narkolepsie ausgefallen",
        answerC = "Adenosin akkumuliert bei Schlafentzug und erzeugt Schlafdruck",
        answerD = "GABA inhibiert Wachsystem-Neurone und erzeugt Schlaef durch Inhibition",
        correctAnswer = 1,
        explanation = "Orexin/Hypocretin-Neurone im lateralen Hypothalamus projizieren zu Wach-foerdernden Kernen (Locus coeruleus, Raphe, Tuberomammillaerer Kern) und stabilisieren den Wachzustand. Bei Narkolepsie Typ 1 zerstoert eine Autoimmunreaktion 90% der Orexin-Neurone. Dies erklaert Schlafattacken, kataplektische Anfaelle (REM-Atonie im Wachzustand durch Verlust der Orexin-Stabiliiserung) und hypnagoge Halluzinationen.",
        difficulty = 4,
        funFact = "Orexin-Rezeptorantagonisten (Suvorexant, Lemborexant) sind zugelassene Schlafmittel — sie blockieren das Wachsystem statt GABA-Rezeptoren zu aktivieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert das 'Freeze' (Totstellen) bei Beutetieren als aktive physiologische Reaktion, nicht als passives Erstarren?",
        answerA = "Massenhafte Adrenalinausschuettung laehmt voruebergehend motorische Neurone durch Hyperpolarisation",
        answerB = "Aktivierung des dorsalen Vagus (parasympathisch) durch extremen Stress erzeugt Immobilitaet, Bradykardie und Analgesie — Polyvagal-Theorie nach Stephen Porges",
        answerC = "Cortisol-Spitze induziert reversible Muskelfaserkontraktur durch Ca2+-Ueberlast",
        answerD = "Serotonin-Spitze im Rueckenmark blockiert Motoneurone an motorischen Endplatten",
        correctAnswer = 1,
        explanation = "Laut Polyvagal-Theorie (Porges 1994) aktiviert extremer lebensbedrohlicher Stress den phylogenetisch aeltesten Teil des Vagussystems (dorsal motor nucleus of vagus — DMNX). Dies erzeugt Immobilitaet, dramatischen Herzfrequenzabfall (vasovagale Synkope-artig), Analgesie (endorphinvermittelt) und dissoziativen Zustand. Dies ist evolutionaer adaptiv: toter Beutetier wird oft von Raubtier fallengelassen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Enzym ist verantwortlich fuer die Synthese von Acetylcholin und wo ist es hauptsaechlich lokalisiert?",
        answerA = "Monoaminoxidase (MAO) — abbauendes Enzym in Mitochondrien cholinerger Synapsen",
        answerB = "Cholin-Acetyltransferase (ChAT) — synthesiert ACh aus Cholin und Acetyl-CoA in cholinergen Neuronen",
        answerC = "Acetylcholinesterase (AChE) — spaltet ACh im synaptischen Spalt in Cholin und Acetat",
        answerD = "Phospholipase D — hydrolysiert Phosphatidylcholin zu Cholin fuer die ACh-Synthese",
        correctAnswer = 1,
        explanation = "Cholin-Acetyltransferase (ChAT) katalysiert die Kondensation von Cholin + Acetyl-CoA zu Acetylcholin + CoA. ChAT befindet sich im Zytoplasma cholinerger Neurone und ist ein spezifischer Marker fuer diesen Neurontyp. Cholin wird durch hochaffinne Cholin-Transporter (CHT1) aus dem synaptischen Spalt wiederaufgenommen (nach ACh-Hydrolyse durch AChE) und erneut acetyliert. Hemmstoffe von ChAT spielen bei Alzheimer-Forschung eine Rolle.",
        difficulty = 4,
        funFact = "Im Nucleus basalis Meynert konzentrieren sich cholinerge Neurone die den Neokortex versorgen — dieser Kern ist bei Alzheimer fruehzeitig atrophiert, was Gedaechtnisdefizite erklaert."
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen Mechanismus schuetzen sich Bienen des Bienenvolkes vor dem Hornissenkoenig (Vespa mandarinia) durch kollektives Verhaltens?",
        answerA = "Chemische Vergiftung: 1000 Bienen stechen gleichzeitig und injizieren letale Giftmengen",
        answerB = "Thermische Baelle (Konvektionskugeln): Hunderte Bienen umschliessen die Hornisse und erhoehen durch Vibration die Temperatur auf 47 Grad Celsius — toedlich fuer Hornissen, tolerierbar fuer Bienen",
        answerC = "Elektrische Entladungen: Sammelbienen entladen statische Elektrizitaet durch koordinierten Fluegel schlag",
        answerD = "Erstickung: Bienen blockieren alle Luftoeffnungen der Hornisse durch dichte Formation",
        correctAnswer = 1,
        explanation = "Japanische Honigbienen (Apis cerana japonica) zeigen 'Konvektionskugeln' (balling): Hunderte Bienen klettern auf eine eindringende Hornisse und erzeugen durch intensive Flugmuskelvibration (Zittern) Koerperwaerme bis 47 Grad Celsius. Die Hitzetoleranzschwelle von Apis cerana liegt bei 48-50 Grad Celsius, von Vespa mandarinia nur bei 44-46 Grad Celsius. Gleichzeitig erhoehen die Bienen die CO2-Konzentration innerhalb des Balles.",
        difficulty = 4,
        funFact = "Europaeische Honigbienen (Apis mellifera) kennen dieses Verhalten nicht — in Regionen wo Apis mellifera mit Vespa mandarinia zusammentrifft, werden Bienenvoelker komplett vernichtet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein bildet die Grundlage des Echoortungs-Systems bei Fledermaeuse auf der Empfaengerseite und ermoeglicht die Frequenzabstimmung der Cochlea?",
        answerA = "Prestin in aeusseren Haarzellen ist fuer die scharfe Frequenzabstimmung bei Fledermaeuse-Ultraschall entscheidend",
        answerB = "Otolin in Otolithen verstaerkt Ultraschall mechanisch",
        answerC = "Tectorin im Tektorialmembran filtert spezifisch Echoortungsfrequenzen",
        answerD = "Alpha-9-nAChR in aeusseren Haarzellen moduliert efferent die Frequenzempfindlichkeit",
        correctAnswer = 0,
        explanation = "Fledermaeuse zeigen eine Constant-Frequency (CF) Echoortung bei speziesspezifischen Frequenzen (z.B. Rhinolophus: 83 kHz). Im entsprechenden Cochlearabschnitt existiert eine extrem scharfe Frequenzabstimmungszone (Acoustic Fovea) mit extrem hoher Dichte an aeusseren Haarzellen mit stark expressiiertem Prestin. Die elektromechanische Verstaerkung durch Prestin erzeugt Q-Faktoren von 100-400 (vs. 2-10 bei Menschen), was 1-2 m/s Geschwindigkeitsaenderungen in Echos aufloesbat macht.",
        difficulty = 4,
        funFact = "Fledermaeuse kompensieren den Doppler-Effekt beim Flug aktiv: sie erniedrigen die ausgesandte Frequenz so, dass das Echo auf ihrer Optimalfrequenz ankommt — Echtzeit-Doppler-Korrektur im Gehirn."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher biochemische Mechanismus erklaert die Produktion von Antifrierproteinen (AFPs) in arktischen Fischen und wie verhindern sie Eiskristallwachstum?",
        answerA = "AFPs binden kovalent an Eiskristalloberflaechen durch thioesterartige Bindungen und loesen Kristalle enzymatisch auf",
        answerB = "AFPs binden nicht-kovalent (Adsorption) an spezifische Eiskristallflaechen und blockieren das Anlagern neuer Wassermolekule (kinetische Hemmung)",
        answerC = "AFPs erhoehen die Natriumchlorid-Konzentration im Plasma durch Ionenpumpen und senken den Gefrierpunkt nach Clausius-Clapeyron",
        answerD = "AFPs chelatieren Magnesiumionen die Eiskristallnuklei bilden wuerden",
        correctAnswer = 1,
        explanation = "Antifrierproteine (AFPs / AFGPs) binden spezifisch an bestimmte Kristallflaechen von Eiskristallen (z.B. pyramidale oder basale Flaechen). Diese Adsorption blockiert die Anlagerung weiterer Wassermolekule (Gibbs-Thomson-Effekt). Dies erzeugt 'thermale Hysterese': der Schmelzpunkt bleibt unveraendert, aber der Gefrierpunkt wird gesenkt — die Luecke betraegt 0,5-2 Grad Celsius, was das Blut fluessig haelt.",
        difficulty = 4,
        funFact = "AFGPs (Antifreeze Glycoproteins) bei antarktischen Nototheniiden entstanden konvergent aus einem Trypsinogen-Gen — ein klassisches Beispiel fuer molekulare Konvergenzevolution."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Signal-Transduktionssystem wird durch Licht in den Fotorezeptorzellen der Netzhaut aktiviert und fuehrt zur Hyperpolarisation der Staebechen?",
        answerA = "Rhodopsin aktiviert Transducin (Gt-Protein) → PDE6 hydrolysiert cGMP → cGMP-gesteuerte Kanaele schliessen → Hyperpolarisation",
        answerB = "Rhodopsin aktiviert Phospholipase C → IP3 oeffnet intrazellulaere Ca-Speicher → K+-Ausstrom → Hyperpolarisation",
        answerC = "Licht erzeugt direkt elektrischen Strom durch piezoelektrische Retinalschichten",
        answerD = "Melanopsin aktiviert Adenylatzyklase → cAMP oeffnet CNGA1-Kanaele → Depolarisation der Staebechen",
        correctAnswer = 0,
        explanation = "In Dunkelheit halten cGMP-gesteuerte Kanaele Staebechen depolarisiert (Dunkelstrom). Licht aktiviert Rhodopsin → Transducin (alpha-GDP → alpha-GTP) → PDE6 (phosphodiesterase) hydrolysiert cGMP → cGMP-Spiegel faellt → cGMP-Kanaele schliessen → kein Na+/Ca2+-Einstrom → Hyperpolarisation von -40 auf -70 mV → weniger Glutamat ausgeschuettet → ON-Bipolarzellen depolarisieren.",
        difficulty = 4,
        funFact = "Ein einzelnes Photon kann eine Staebchenzelle zur Hyperpolarisation bringen — Staebechen detektieren einzelne Lichtquanten und sind damit an der physikalischen Grenze der Lichtempfindlichkeit."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches zellulaere Phaenomen beschreibt die Beobachtung, dass Neuronenpopulationen im Vorderhirn synchron mit 40-Hz-Gamma-Oszillationen feuern und welche Theorie verknuepft dies mit Bewusstsein?",
        answerA = "Long-Term Potentiation (LTP) bei 40 Hz foerdert Gedaechtnisspeicherung im Hippocampus",
        answerB = "Gamma-Oszillationen (30-80 Hz) binden verteilt verarbeitete Merkmale zu einheitlicher Wahrnehmung (Binding Problem) — Theorie von Francis Crick und Christof Koch",
        answerC = "Theta-Gamma-Kopplung kodiert Sequenzen im Hippocampus fuer episodisches Gedaechtnis",
        answerD = "Delta-Wellen bei 40 Hz markieren Tief-Schlaf-Phasen mit maximaler Gedaechtniskonsolidierung",
        correctAnswer = 1,
        explanation = "Das Binding Problem fragt wie das Gehirn verteilt verarbeitete Merkmale (Farbe, Form, Bewegung) zu einem Perzept integriert. Francis Crick und Christof Koch postulierten 1990, dass synchrone 40-Hz-Gamma-Oszillationen zwischen verschiedenen Kortexarealen Neuronenpopulationen 'binden', die dasselbe Objekt repraesentieren. Experimentell zeigen Tiere beim bewussten Sehen staerkere Gamma-Synchronisierungen als beim unbewussten Reizverarbeiten.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Hormonsystem steuert die Metamorphose bei Insekten und welche Interaktion der Hormone bestimmt ob Haeutung zu Larve oder Imago fuehrt?",
        answerA = "Insulin-IGF-Achse bestimmt Wachstumsrate, Cortisol triggert Metamorphose",
        answerB = "Ecdyson (Haeutungshormon) loest Haeutung aus; Juvenilhormon (JH) unterdrueckt Metamorphose — niedriger JH-Spiegel bei letzter Haeutung erlaubt Imago-Differenzierung",
        answerC = "Thyreoidhormon loest bei niedrigem Prolaktin Metamorphose aus (analog zu Froeschen)",
        answerD = "Prothorakotropes Hormon (PTTH) allein bestimmt ob Larven- oder Imaginal-Haeutung erfolgt",
        correctAnswer = 1,
        explanation = "Ecdyson (von Prothoraxdruesen) loest Haeutungen aus. Juvenilhormon (JH, von Corpora allata) haelt Larvalcharakter aufrecht. Solange JH hoch ist erfolgt Larvalhaeutung. Bei der letzten Larvalhaeutung sinkt JH auf Null — Ecdyson loest nun Puppenbildung aus, da kein JH mehr die Imago-Differenzierung unterdrueckt. Imaginalscheiben differenzieren sich zu adulten Organen.",
        difficulty = 4,
        funFact = "Synthetisches Juvenilhormon (Methoprene) wird als umweltfreundliches Insektizid eingesetzt — es stoert die Metamorphose von Stechmueckenlarven, ist aber fuer Saeugetiere nicht toxisch."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus ermoeglicht Tintenfischen (Cephalopoda) die blitzschnelle Farbveraenderung durch Chromatophoren in weniger als 200 Millisekunden?",
        answerA = "Hormonell gesteuerte Melanin-Synthese aendert Chromatophorenfarbe durch chemische Reaktion",
        answerB = "Direkte neuronale Innervation von Chromatophor-Radialmuskeln durch motorische Neurone — mechanische Ausdehnung von Pigmentblaeschen",
        answerC = "Reflektin-Proteine in Iridophoren kristallisieren reversibel und aendern Lichtinterferenz",
        answerD = "pH-Aenderungen in Chromatophoren loesen Farbumschlag durch Indikator-Pigmente aus",
        correctAnswer = 1,
        explanation = "Cephalopoden-Chromatophoren sind keine passiven Zellen sondern aktive Organe: Ein zentrales Pigmentsaeckchen ist von 15-25 Radialmuskeln umgeben, die direkt durch motorische Neurone innerviert sind. Kontraktion der Radialmuskeln dehnt das Saeckchen von 0,1 mm auf 1-3 mm Durchmesser aus — die Pigmentflaeche vergroessert sich um das 100-300-fache. Relaxation laesst es durch elastische Kraefte schrumpfen. Iridophoren (Strukturfarbe) und Leucophoren (Weissreflexion) ergaenzen das System.",
        difficulty = 4,
        funFact = "Oktopusse sind farbenblind (nur ein Photorezeptortyp), koennten aber durch chromatische Aberration in der U-foermigen Pupille tatsaechlich Farben wahrnehmen — eine Hypothese von Stubbs et al. 2016."
    ),

)
