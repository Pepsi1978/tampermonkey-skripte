package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsHard5(): List<Question> = listOf(

    // HARD (difficulty = 3) -- Oekologie und Tierverhalten

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter einer 'Schluesseltierart' (Keystone Species) in einem Oekosystem?",
        answerA = "Die zahlreichste Art in einem Lebensraum",
        answerB = "Eine Art, deren Einfluss auf das Oekosystem weit groesser ist als ihre Biomasse vermuten laesst",
        answerC = "Die groesste Tierart in einem Nahrungsnetz",
        answerD = "Eine Art, die ausschliesslich von einer einzigen Nahrungsquelle abhaengig ist",
        correctAnswer = 1,
        explanation = "Eine Schluesseltierart hat einen unverhältnismaessig grossen Einfluss auf die Struktur und Funktion ihres Oekosystems. Ihr Verschwinden wuerde das gesamte Nahrungsnetz destabilisieren, obwohl sie nicht zwingend die haeufigste Art ist.",
        difficulty = 3,
        funFact = "Der Seeotter ist ein klassisches Beispiel: Er haelt die Seeigelpopulationen in Schach, die sonst die Seetangwaelder vernichten wuerden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'trophische Kaskade'?",
        answerA = "Die stufenweise Ernaehrungsweise von Zugvoegeln",
        answerB = "Indirekte Effekte, bei denen Veraenderungen auf einer Trophieebene mehrere andere Ebenen im Nahrungsnetz beeinflussen",
        answerC = "Die jaehrliche Migration von Herbivoren in neue Weideggruende",
        answerD = "Den Energieverlust zwischen den Trophiestufen eines Nahrungsnetzes",
        correctAnswer = 1,
        explanation = "Bei einer trophischen Kaskade loest die Veraenderung der Raubtier-Population eine Kettenreaktion aus, die auch Herbivoren und Pflanzen beeinflusst. Zum Beispiel fuhrt das Fehlen von Woelfen zu einer Zunahme von Hirschen, die dann die Vegetation uebermaessig befressen.",
        difficulty = 3,
        funFact = "Die Wiederansiedlung von Woelfen im Yellowstone-Nationalpark 1995 loeste eine trophische Kaskade aus, die sogar den Verlauf von Fluessen veraenderte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt die Theorie, dass zwei Arten mit identischer oekologischer Nische nicht dauerhaft im gleichen Lebensraum koexistieren koennen?",
        answerA = "Das Liebig'sche Minimumgesetz",
        answerB = "Das Lotka-Volterra-Prinzip",
        answerC = "Das Gause'sche Prinzip der kompetitiven Exklusion",
        answerD = "Die Hutchinson'sche Nischentheorie",
        correctAnswer = 2,
        explanation = "Das kompetitive Exklusionsprinzip (Gause 1934) besagt, dass zwei Arten, die exakt dieselbe oekologische Nische besetzen, nicht stabil koexistieren koennen. Eine Art wird die andere verdraengen, es sei denn, es gibt Ressourcentrennung oder andere Mechanismen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Hamilton's Regel' in der Evolutionsbiologie des altruistischen Verhaltens?",
        answerA = "Altruismus entwickelt sich, wenn rb > c gilt (r = Verwandtschaft, b = Nutzen, c = Kosten)",
        answerB = "Tiere helfen nur dann, wenn der direkte Nutzen die Kosten uebertrifft",
        answerC = "Verwandte Tiere verteidigen ihr Revier gemeinsam gegen Eindringlinge",
        answerD = "Die Groesse einer Gruppe bestimmt, wie haeufig altruistisches Verhalten auftritt",
        correctAnswer = 0,
        explanation = "Hamiltons Regel besagt: Altruismus wird durch natuerliche Selektion begunstigt, wenn rb > c gilt. Dabei ist r der Verwandtschaftsgrad, b der Nutzens fuer den Empfaenger und c die Kosten fuer den Geber. Dies erklaert Verwandtenselektion (Kin Selection).",
        difficulty = 3,
        funFact = "J.B.S. Haldane soll gesagt haben: 'Ich wuerde mein Leben fuer zwei Brueder oder acht Cousins opfern' — eine intuitive Beschreibung von Hamiltons Regel."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Strategie, bei der ein Parasit das Verhalten seines Wirtes so veraendert, dass es die Verbreitung des Parasiten foerdert?",
        answerA = "Kommensalismus",
        answerB = "Parasitische Verhaltensmanipulation",
        answerC = "Mimikry",
        answerD = "Kleptoparasitismus",
        correctAnswer = 1,
        explanation = "Parasitische Verhaltensmanipulation ist ein faszinierendes Phaenomen, bei dem Parasiten das Nervensystem oder Hormonhaushalt des Wirtes beeinflussen, um ihre eigene Verbreitung zu maximieren. Der Wirt verhalt sich dabei oft gegen sein eigenes Ueberleben.",
        difficulty = 3,
        funFact = "Toxoplasma gondii infiziert Maeuse und laesst sie die Angst vor Katzen verlieren — so gelangt der Parasit in seinen Endwirt, die Katze."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der 'Zahlen-Jahrgangs-Effekt' (Mast Year / Mastjahr) bei Baeuemen und welchen Vorteil bringt er?",
        answerA = "Baeume produzieren alle paar Jahre synchron riesige Mengen Samen, um Frasspredatoren zu saettigen",
        answerB = "Baeume wachsen in bestimmten Jahren deutlich schneller aufgrund optimaler Witterung",
        answerC = "Baeume verlieren synchron ihre Blaetter um Herbivore zu verwirren",
        answerD = "Baeume bluehen synchron um die Bestaeuber zu konzentrieren",
        correctAnswer = 0,
        explanation = "In einem Mastjahr produzieren viele Baeume einer Art synchron ungewoehnlich viele Fruechte oder Samen. Dies sattigt die Samenpraedatoren (Maeusse, Eichoernchen etc.), so dass ein Teil der Samen ueberlebt und keimt. In mageren Jahren verhungern die Praedatoren.",
        difficulty = 3,
        funFact = "Buchen produzieren nur alle 5-10 Jahre Mastjahre. In diesen Jahren explodieren Maeuse- und Fuchs-Populationen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie funktioniert die Thermoregulation beim Winterschlaf von Saeugetieren physiologisch?",
        answerA = "Die Tiere gefrieren vollstaendig und tauen im Fruehling wieder auf",
        answerB = "Die Koerpertemperatur sinkt auf nahe Umgebungstemperatur, Herzschlag und Stoffwechsel werden drastisch reduziert",
        answerC = "Die Tiere halten ihre Koerpertemperatur konstant aber schlafen sehr tief",
        answerD = "Die Tiere erwaermen sich durch chemische Reaktionen im Fettgewebe",
        correctAnswer = 1,
        explanation = "Beim echten Winterschlaf sinkt die Koerpertemperatur auf wenige Grad Celsius, der Herzschlag auf 2-10 Schlaege pro Minute und der Stoffwechsel auf etwa 5% des Normalwertes. Braunes Fettgewebe ermooglicht das schnelle Aufwaermen.",
        difficulty = 3,
        funFact = "Braunbaeren halten keinen echten Winterschlaf — ihre Koerpertemperatur sinkt nur leicht, sie koennen jederzeit aufwachen und sogar im Schlaf Junge gebaeren."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen Estaivation (Sommerschlaf) und Winterschlaf bei Tieren?",
        answerA = "Es gibt keinen Unterschied, nur der Zeitpunkt ist verschieden",
        answerB = "Estaivation ist eine Ruhephase bei Hitze und Trockenheit; Winterschlaf bei Kaelte und Nahrungsmangel",
        answerC = "Beim Sommerschlaf sinkt die Koerpertemperatur staerker als beim Winterschlaf",
        answerD = "Sommerschlaf tritt nur bei Reptilien auf, Winterschlaf nur bei Saeugetieren",
        correctAnswer = 1,
        explanation = "Estaivation ist eine Torpor-Phase als Anpassung an extreme Hitze und Trockenheit. Lungenfische in Afrika oder Lungenschnecken vergraben sich und reduzieren ihren Stoffwechsel stark. Winterschlaf ist die analoge Anpassung an Kaelte und Nahrungsmangel.",
        difficulty = 3,
        funFact = "Der afrikanische Lungenfisch kann bis zu 4 Jahre in einem Schleim-Kokon im ausgetrockneten Schlamm ueberleben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Mechanismus nutzen Zugvoegel hauptsaechlich zur Orientierung ueber lange Strecken?",
        answerA = "Ausschliesslich visuelle Landmarken wie Berge und Kuesten",
        answerB = "Ein internes Sonnenkompas-System und das Erdmagnetfeld",
        answerC = "Den Geruchssinn, der Gebiete hunderte Kilometer weit erkennt",
        answerD = "Echolokation wie bei Fledermaeuse",
        correctAnswer = 1,
        explanation = "Zugvoegel nutzen ein komplexes Navigationssystem: Sonnenkompas (tageszeit-angepasst ueber die innere Uhr), Sternenkompas in der Nacht, und magnetische Navigation ueber Magnetit-Kristalle im Schnabel oder Quanteneffekte in Cryptochrom-Proteinen.",
        difficulty = 3,
        funFact = "Der Kuckuck findet ohne Eltern seinen Weg nach Afrika — Navigation muss also zumindest teilweise genetisch kodiert sein."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Batesian Mimikry und wie unterscheidet sie sich von Muellerian Mimikry?",
        answerA = "Batesian: gefaehrliche Art ahmt harmlose nach; Muellerian: harmlose Art ahmt gefaehrliche nach",
        answerB = "Batesian: harmlose Art ahmt gefaehrliche nach; Muellerian: mehrere giftige Arten aehneln sich gegenseitig",
        answerC = "Beide Begriffe bezeichnen dasselbe Phaenomen in verschiedenen Tiergruppen",
        answerD = "Batesian: Tiere tarnen sich durch Farbe; Muellerian: Tiere tarnen sich durch Form",
        correctAnswer = 1,
        explanation = "Bei der Batesian Mimikry imitiert eine harmlose, geniessbare Art das Erscheinungsbild einer gefaehrlichen/giftigen Art, um Praedatoren zu taeuschen. Bei Muellerian Mimikry aehneln sich mehrere echte giftige Arten, was das gemeinsame Lernen durch Praedatoren erleichtert.",
        difficulty = 3,
        funFact = "Der korallenrot gebaeanderte Scarlet Kingsnake ahmt die hochgiftige Korallenotter nach — ein klassisches Beispiel fuer Batesian Mimikry in Nordamerika."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'reziprokem Altruismus' in der Verhaltensbiologie?",
        answerA = "Hilfsverhalten gegenueber genetisch verwandten Individuen",
        answerB = "Hilfsverhalten gegenueber nicht verwandten Individuen mit der Erwartung einer zukuenftigen Gegenleistung",
        answerC = "Parasitismus, bei dem der Wirt langfristig profitiert",
        answerD = "Konkurrenzverhalten innerhalb einer Gruppe",
        correctAnswer = 1,
        explanation = "Reziproker Altruismus (Trivers 1971) beschreibt Hilfsverhalten gegenueber nicht-verwandten Individuen, das sich langfristig auszahlt, weil der Empfaenger spaeter zuruckhelfen wird. Voraussetzung: Die Beteiligten erkennen sich und haben wiederholte Interaktionen.",
        difficulty = 3,
        funFact = "Vampire-Fledermaeuse teilen ihr Blutmahl mit hungernden Artgenossen — auch mit Nicht-Verwandten — und merken sich, wer zurueckgegeben hat."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Prozess steuert die zirkadianen Rhythmen bei Tieren auf molekularer Ebene?",
        answerA = "Schwankungen des Blutglukosespiegels ueber den Tag",
        answerB = "Rueckkopplungsschleifen transkriptionaler Repressoren und Aktivatoren (CLOCK/BMAL1, PER/CRY)",
        answerC = "Der Hormonzyklus des Melatonins allein",
        answerD = "Direkte Aktivierung durch Sonnenlicht auf Hautrezeptoren",
        correctAnswer = 1,
        explanation = "Der molekulare Taktgeber der zirkadianen Uhr besteht aus einer Transkriptions-Translations-Rueckkopplungsschleife: CLOCK und BMAL1 aktivieren PER und CRY-Gene, deren Proteine dann CLOCK/BMAL1 hemmen. Dieser Zyklus dauert etwa 24 Stunden.",
        difficulty = 3,
        funFact = "Dieser Mechanismus ist so fundamental, dass er bei Fliegen, Maeuse und Menschen nahezu identisch funktioniert. Der Nobelpreis 2017 wuerdigte seine Entdeckung."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Konzept der 'oekologischen Nische' nach Hutchinson?",
        answerA = "Der physische Lebensraum, den eine Art bewohnt",
        answerB = "Ein n-dimensionaler Hyperraum aller abiotischen und biotischen Variablen, innerhalb derer eine Art existieren kann",
        answerC = "Die Ernaehrungsweise einer Art im Nahrungsnetz",
        answerD = "Das Territorium, das ein Individuum gegen Artgenossen verteidigt",
        correctAnswer = 1,
        explanation = "Hutchinsons (1957) multidimensionale Nischentheorie definiert die Nische als n-dimensionalen Hyperraum aller Umweltvariablen (Temperatur, Feuchtigkeit, Nahrung usw.), in dem eine Art lebensfaehig ist. Unterschied: fundamentale Nische (ohne Konkurrenz) vs. realisierte Nische (mit Konkurrenz).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen Mechanismus koennen invasive Arten einheimische Arten verdraengen, ohne direkt mit ihnen zu konkurrieren?",
        answerA = "Nur durch direkte Praedation",
        answerB = "Durch veraenderte Feuerregimes, Naehrstoffzyklen oder andere Oekosystemprozesse (ecosystem engineering)",
        answerC = "Invasive Arten verdraengen andere Arten ausschliesslich durch direkten Wettbewerb",
        answerD = "Durch Einbringung neuer Krankheiten, gegen die einheimische Arten immun sind",
        correctAnswer = 1,
        explanation = "Invasive Arten koennen als 'Oekosystemingenieure' wirken und fundamentale Prozesse veraendern: Tamarisken erschoepfen Wasserressourcen, Cheatgrass erhoht die Feuerfrequenz, Stickstoff-fixierende invasive Pflanzen veraendern Naehrstoffkreislaeufe — alles ohne direkten Konkurrenzkontakt.",
        difficulty = 3,
        funFact = "Die eingeschleppte Krabbe Carcinus maenas hat in Neuengland durch Biotop-Veraenderung Muschelbaenke zerstoert, die fuer einheimische Voegel lebenswichtig waren."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Handicap-Prinzip' von Zahavi in der sexuellen Selektion?",
        answerA = "Maennchen mit physischen Handicaps sind als Vaeter ungeeignet und werden abgelehnt",
        answerB = "Kostspielige, ehrliche Signale (wie auffaelliges Gefieder) demonstrieren genetische Qualitaet, weil nur starke Individuen sie sich leisten koennen",
        answerC = "Weibchen bevorzugen schwaecher aussehende Maennchen, da diese weniger aggressiv sind",
        answerD = "Tiere mit Handicaps entwickeln kompensatorische Verhaltensweisen zur Fortpflanzung",
        correctAnswer = 1,
        explanation = "Das Handicap-Prinzip (Zahavi 1975) besagt, dass uebertrieben kostspielige Signale ehrliche Anzeiger der genetischen Fitness sind. Nur gesunde, genetisch ueberlegene Individuen koennen ein grosses Pfauenrad, auffaelliges Gefieder oder riskante Balzrituale 'bezahlen'.",
        difficulty = 3,
        funFact = "Der Pfauenschwanz ist das bekannteste Beispiel: Er beeintraechtigt den Vogel erheblich beim Fliehen, zeigt Weibchen aber, dass das Maennchen trotzdem fit genug ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt die 'Red Queen Hypothese' in der Koevolution von Parasiten und Wirten?",
        answerA = "Raubtiere muessen sich staendig verbessern, um mit schnelleren Beutetieren mitzuhalten",
        answerB = "Wirte und Parasiten befinden sich in einem staendigen Evolutionswettlauf; jede Anpassung loest eine Gegenanpassung aus",
        answerC = "Sexuelle Reproduktion entstand, weil sie schnellere Anpassung an Klimaverhaeltnisse ermooglicht",
        answerD = "Populationen muessen staendig migrieren, um dem zunehmenden Selektionsdruck standzuhalten",
        correctAnswer = 1,
        explanation = "Die Red Queen Hypothese (Van Valen 1973) beschreibt den kontinuierlichen Koevolutionswettlauf zwischen Parasit und Wirt. Der Wirt entwickelt Resistenzen, der Parasit neue Virulenz-Strategien. Beide muessen sich staendig veraendern, nur um denselben Status zu erhalten — wie Alice und die Rote Koenigin.",
        difficulty = 3,
        funFact = "Die Red Queen Hypothese erklaert auch, warum sexuelle Reproduktion so weit verbreitet ist: Sie erzeugt schneller neue Resistenzgene als asexuelle Fortpflanzung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielen 'Umbrella Species' im Naturschutz?",
        answerA = "Arten, die spezifische Biotope anzeigen und deren Schutz andere Arten gar nicht beruecksichtigt",
        answerB = "Grossraeumige Arten, deren Schutzmassnahmen automatisch auch viele andere Arten schuetzen",
        answerC = "Arten, die ausschliesslich in Schutzgebieten vorkommen und dort dominieren",
        answerD = "Parasiten-resistente Leitarten, die gesunde Oekosysteme anzeigen",
        correctAnswer = 1,
        explanation = "Umbrella Species sind Arten mit grossen Habitatanspruechen (z.B. Tigr, Grizzlybaer). Wenn ihr Lebensraum geschuetzt wird, werden automatisch auch viele andere Arten mitgeschuetzt, die kleinere Flaechen benoetigen. Effiziente Strategie im Naturschutz.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Allee-Effekt' in der Populationsoekologie?",
        answerA = "Das exponentielle Wachstum einer Population bei unbegrenzten Ressourcen",
        answerB = "Der positive Zusammenhang zwischen Populationsdichte und individueller Fitness bei kleinen Populationen",
        answerC = "Die negative Wirkung von Uebervoelkerung auf das Populationswachstum",
        answerD = "Die Auswanderung von Individuen aus ueberfuellten Populationen",
        correctAnswer = 1,
        explanation = "Der Allee-Effekt beschreibt das Phaenomen, dass bei sehr kleinen Populationen die individuelle Fitness sinkt (nicht steigt wie bei Konkurrenzminimierung). Gruende: schwierige Partnersuche, mangelnde Kooperation, Inzucht. Wichtig fuer Artenschutz.",
        difficulty = 3,
        funFact = "Wandertauben starben trotz anfaenglich grosser Gruppen aus, weil sie unter einer kritischen Schwarmgroesse nicht mehr effizient brueteten — klassischer Allee-Effekt."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie navigieren Meeresschildkroeten ueber Tausende Kilometer zum Geburtsort?",
        answerA = "Durch Verfolgung von Meeresstroemungen und Wassertemperaturen",
        answerB = "Durch Magnetfeldnavigation: Sie detektieren Inklination und Intensitaet des Erdmagnetfeldes",
        answerC = "Durch Geruchsnavigation, die ihren spezifischen Strand erkennt",
        answerD = "Durch Sternnavigation an der Meeresoberflaeche",
        correctAnswer = 1,
        explanation = "Meeresschildkroeten besitzen Magnetit-Kristalle im Gewebe, die es ihnen ermoeglichen, sowohl die Neigung (Inklination) als auch die Staerke (Intensitaet) des Erdmagnetfeldes wahrzunehmen. Diese zwei Informationen geben ihnen einen 'Magnetkoordinaten'-Sinn.",
        difficulty = 3,
        funFact = "Karettschildkroeten koennen zum genauen Geburtsort zurueckkehren, obwohl dieser Strand innerhalb ihres Lebens seinen Magnetwert leicht veraendert hat — sie aktualisieren ihre 'Karte'."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Optimal Foraging Theory' (Theorie der optimalen Nahrungssuche)?",
        answerA = "Tiere fressen immer das Nahrungsmittel mit dem hoechsten Kalorien-Gehalt",
        answerB = "Tiere maximieren ihre Energiebilanz durch Ausbalancieren von Energiegewinn und Suchkosten pro Zeiteinheit",
        answerC = "Tiere suchen ausschliesslich nach Nahrung, wenn Hunger einen Schwellenwert ueberschreitet",
        answerD = "Tiere bevorzugen vertraute Nahrung unabhaengig von deren Naehrwert",
        correctAnswer = 1,
        explanation = "Die Theorie der optimalen Nahrungssuche (MacArthur & Pianka 1966) sagt vorher, dass Tiere ihre Energieaufnahme pro Zeiteinheit maximieren. Sie beruecksichtigt Suchzeit, Handhabungszeit und Energiegehalt der Beute und erklaert, wann es sinnvoll ist, eine Beute abzulehnen.",
        difficulty = 3,
        funFact = "Grossen Meisenartig fressen kleine Insekten auf, ohne sie einzustufen — aber wenn grosse Beute verfuegbar ist, wird kleine abgelehnt, genau wie die Theorie vorhersagt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sind 'Metapopulationen' und welche Bedeutung haben sie fuer den Artenschutz?",
        answerA = "Populationen verschiedener Arten in einem gemeinsamen Lebensraum",
        answerB = "Netzwerke aus lokalen Teilpopulationen, die durch gelegentliche Migration verbunden sind und periodische Aussterbe- und Wiederbesiedlungsereignisse zeigen",
        answerC = "Weltweite Gesamtpopulation einer Art einschliesslich aller Unterarten",
        answerD = "Populationen, die sich an unterschiedliche Lebensraeume angepasst haben",
        correctAnswer = 1,
        explanation = "Das Metapopulationsmodell (Levins 1969) beschreibt eine Population aus Teilpopulationen, die in Habitatflecken leben. Teilpopulationen koennen aussterben, aber leere Flecken werden durch Einwanderer aus anderen Teilpopulationen neu besiedelt. Entscheidend fuer Habitatkonnektivitaet im Naturschutz.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Kleptoparasitismus' im Tierreich?",
        answerA = "Ein Parasit, der seinen Wirt toetet, um sich zu ernaehren",
        answerB = "Das Stehlen von Nahrung oder anderen Ressourcen von einem anderen Tier, das diese beschafft hat",
        answerC = "Die Nutzung von Nestern anderer Arten ohne Schaedigung des Wirtes",
        answerD = "Ein Parasit, der Artgenossen als Wirt benutzt",
        correctAnswer = 1,
        explanation = "Kleptoparasitismus beschreibt das Stehlen erbeuteter Nahrung. Es ist weit verbreitet: Fregattvogel stehlen Fisch von anderen Seevoegeln, Buntspechte raeuben Vorratsspeicher von Eichoernchen, Hyaenen stehlen Loewen-Beute. Meist gluenstiger als selbst jagen.",
        difficulty = 3,
        funFact = "Die Fregattvogel-Maennchen haben keine wasserabweisenden Federn und koennen nicht tauchen — sie sind auf Kleptoparasitismus angewiesen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie beeinflusst das Fehlen von apex-Praedatoren (Spitzenpraedatoren) ein Oekosystem langfristig?",
        answerA = "Es fuehrt stets zur Erholung der Pflanzendiversitaet",
        answerB = "Es kann zu trophischen Kaskaden fuehren: Herbivoren vermehren sich unkontrolliert und ueberfressen die Vegetation",
        answerC = "Das Oekosystem reguliert sich selbst ohne Veraenderungen",
        answerD = "Niedere Praedatoren gleichen den Verlust vollstaendig aus",
        correctAnswer = 1,
        explanation = "Ohne Spitzenpraedatoren entfaellt der 'Fear Effect' und die direkte Regulierung der Herbivorenpopulationen. Dies fuehrt zu 'Mesopraedator Release' (Zunahme mittlerer Raeuber) und Uebergrazing. Das Oekosystem kann kollabieren — bekannt als 'trophische Kaskade von oben nach unten'.",
        difficulty = 3,
        funFact = "In Teilen Ostafrikas, wo Loewenbestande klein sind, haben Olivenbaboons ueberhandgenommen und vernichten Ernten und Biodiversitaet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'ecological stoichiometry' (oekologische Stoechiometrie)?",
        answerA = "Die chemische Zusammensetzung von Wasser in verschiedenen Oekosystemen",
        answerB = "Die Untersuchung des Gleichgewichts von Energie und chemischen Elementen in oekologischen Wechselwirkungen",
        answerC = "Die Menge an Kohlenstoff, die verschiedene Tierarten speichern",
        answerD = "Die Reaktion von Oekosystemen auf Stickstoffduengung",
        correctAnswer = 1,
        explanation = "Oekologische Stoechiometrie untersucht, wie das Verhaltnis von Elementen (C:N:P) in Organismen ihre Wechselwirkungen beeinflusst. Wenn Frasspflanzen N:P-Verhaeltnisse haben, die nicht mit dem Bedarf des Herbivoren uebereinstimmen, entstehen Wachstumslimitierungen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'prisoner's dilemma' und wie erklaert es kooperatives Verhalten bei Tieren?",
        answerA = "Ein Modell, das zeigt, dass Kooperation sich nie evolutionaer stabilisieren kann",
        answerB = "Ein spieltheoretisches Modell, bei dem gegenseitige Kooperation langfristig besser ist als Defektion, wenn Begegnungen wiederholt stattfinden",
        answerC = "Eine Erklaerung fuer territorialen Konflikte zwischen Nachbargruppen",
        answerD = "Ein Modell fuer die Entwicklung von Warnrufen bei sozial lebenden Tieren",
        correctAnswer = 1,
        explanation = "Im wiederholten Gefangenendilemma entwickelt sich Kooperation durch Tit-for-Tat-Strategien: Kooperiere beim ersten Zug, dann tu, was dein Partner beim letzten Mal getan hat. Bei wiederkehrenden Begegnungen ist Kooperation stabiler als stetes Defektieren — erklaert Verhaltenskooperation.",
        difficulty = 3,
        funFact = "Computersimulationen von Axelrod zeigten, dass Tit-for-Tat im Turnier gegen alle anderen Strategien gewann — die einfachste Kooperationsstrategie war die erfolgreichste."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem 'Dilution Effect' (Verduennungseffekt) in Tierpopulationen?",
        answerA = "Die Verringerung von Nahrungsqualitaet durch Uebernutzung einer Ressource",
        answerB = "Die individuelle Risikoreduktion in grossen Gruppen, da Praedatoren nicht alle Individuen angreifen koennen",
        answerC = "Die Abnahme von Parasiten-Virulenz in grossen Wirtsgruppen",
        answerD = "Die Verduennung von Pheromonen in grossen Populationen",
        correctAnswer = 1,
        explanation = "Der Verduennungseffekt beschreibt, dass das individuelle Praedationsrisiko in einer Gruppe sinkt, je groesser die Gruppe ist. Bei gleichbleibender Angriffszahl des Raeubers trifft es statistisch gesehen weniger Individuen. Dies ist eine Haupterklarung fuer das Leben in Herden und Schwaermen.",
        difficulty = 3,
        funFact = "Heringsschwaerme koennen Millionen von Individuen umfassen. Das Risiko, von einem Thunfisch erwischt zu werden, ist fuer jeden einzelnen Hering minimal."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion haben 'Sentinel-Verhalten' bei Erdmaennchen und aehnlichen sozialen Tieren?",
        answerA = "Ein dominantes Individuum markiert hoch gelegene Plaetze zur Reviermarkierung",
        answerB = "Individuen halten Wache auf erhoehten Plaetzen und geben Warnrufe ab, um die Gruppe vor Raeuber zu warnen — auf Kosten eigener Sicherheit",
        answerC = "Wachposten teilen ihre Futterquelle mit der Gruppe aus reinem Altruismus",
        answerD = "Junge Individuen lernen das Sicherheitsverhalten durch Beobachtung erfahrener Wachposten",
        correctAnswer = 1,
        explanation = "Sentinel-Verhalten ist eine Form des kooperativen Verhaltens: Ein Individuum waechst auf einer exponierten Position und warnt andere mit artspezifischen Rufen vor Luftraumbern und Bodenpraedatoren. Die Kosten sind hoehere eigene Sichtbarkeit, der Nutzen liegt in der Verwandtenselektion.",
        difficulty = 3,
        funFact = "Erdmaennchen haben unterschiedliche Warnrufe fuer verschiedene Raeubertypen: ein anderer Ruf fuer Adler als fuer Schlangen — Praedatoren-spezifische Kommunikation."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie ist das Konzept des 'Evolutionaer Stabilen Strategie' (ESS) in der Spieltheorie der Verhaltensbiologie definiert?",
        answerA = "Eine Strategie, die alle Individuen einer Population anwenden und die durch natuerliche Selektion nicht veraendert werden kann",
        answerB = "Eine Verhaltensstrategien, die stabil gegen Invasion durch alternative Strategien ist",
        answerC = "Die Strategie, die in der naechsten Generation am haeufigsten auftreten wird",
        answerD = "Verhalten, das genetisch fixiert ist und nicht durch Lernen modifiziert werden kann",
        correctAnswer = 1,
        explanation = "Eine ESS (Maynard Smith 1973) ist eine Strategie, die, wenn sie von der Mehrheit der Population angewandt wird, nicht durch eine seltene Alternativstrategie unterwandert werden kann. Sie ist stabil gegenueber Invasion — ein Nash-Gleichgewicht in der evolutionaeren Spieltheorie.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'character displacement' (Charakterverschiebung) in der Evolutionsbiologie?",
        answerA = "Die Veraenderung von Artcharakteren durch klimatische Anpassung ohne Konkurrenz",
        answerB = "Die evolutionaere Divergenz von Merkmalen bei sympatrischen Arten, um Ressourcenkonkurrenz zu reduzieren",
        answerC = "Die Angleichung von Merkmalen bei verwandten Arten in verschiedenen Gebieten",
        answerD = "Die Verraenderung des Paarungsverhaltens durch Isolation",
        correctAnswer = 1,
        explanation = "Charakterverschiebung tritt auf, wenn zwei konkurrierende Arten im gleichen Gebiet (sympatrisch) leben: Ihre Merkmale divergieren, um Ressourcentrennung zu foerdern. Wo sie allein leben (allopatrisch), sind die Merkmale aehnlicher. Ein Beweis fuer kompetitive Exklusion.",
        difficulty = 3,
        funFact = "Darwin's Finken auf den Galapagosinseln zeigen klassische Charakterverschiebung: Auf Inseln mit anderen Finkenarten haben ihre Schnabelgroessen starker divergiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das 'island biogeography'-Modell von MacArthur und Wilson?",
        answerA = "Warum Inseln immer weniger Arten als Kontinente haben, unabhaengig von der Inselgroesse",
        answerB = "Die Artenzahl auf einer Insel ist ein dynamisches Gleichgewicht aus Einwanderungsrate und AussterbeRate, abhaengig von Groesse und Entfernung vom Festland",
        answerC = "Insulare Arten entwickeln sich schneller zu neuen Arten als kontinentale",
        answerD = "Die Artenzahl auf Inseln nimmt linear mit der Flaeche zu",
        correctAnswer = 1,
        explanation = "MacArthur und Wilson (1967) zeigten, dass die Artenzahl auf Inseln ein Gleichgewicht aus Einwanderung (gross auf nahegelegenen Inseln) und Aussterben (klein auf grossen Inseln) ist. Grosse, nahe Inseln haben mehr Arten als kleine, ferne. Grundlage der modernen Naturschutzbiologie.",
        difficulty = 3,
        funFact = "Das Modell wird direkt auf Naturschutzgebiete angewendet: Grosse, verbundene Schutzgebiete schnittern Arten besser als viele kleine Fragmente."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'lek mating' und welche Selektionsdynamik entsteht dabei?",
        answerA = "Monogame Paarbindung bei Voegeln mit gemeinsamer Jungenaufzucht",
        answerB = "Maennchen versammeln sich an traditionellen Balzplaetzen; Weibchen waehlen frei; wenige dominante Maennchen paaren sich mit der Mehrheit der Weibchen",
        answerC = "Weibchen kaempfen um Zugang zu ressourcenreichen Territorien von Maennchen",
        answerD = "Gleichzeitige Balz vieler Maennchen um ein einzelnes Weibchen ohne spezifischen Platz",
        correctAnswer = 1,
        explanation = "Bei Lekbalz bieten Maennchen nur Gene, keine Ressourcen. Sie versammeln sich auf Balzplaetzen (Leks), Weibchen besuchen und waehlen. Oft paaren sich 10-20% der Maennchen mit 80-90% der Weibchen — extreme sexuelle Selektion. Klassiker: Auerhahn, Birkhahn, Safarivogel.",
        difficulty = 3,
        funFact = "Bei manchen Lek-Arten wie dem Birkhahn koennten die Maennchen in Gruppen balzen, weil groessere Leks mehr Weibchen anziehen — auch wenn jeder nur kleinere Anteile bekommt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Kleptothermy' bei Reptilien?",
        answerA = "Die Faehigkeit, Waerme aus dem Sonnenlicht direkt durch Infrarotsensoren zu gewinnen",
        answerB = "Das Verhalten, sich an andere Tiere zu drangseln um deren Koerperwaerme zu nutzen",
        answerC = "Die Nutzung der Koerperwaerme anderer Organismen durch engen Koerperkontakt zur Thermoregulation",
        answerD = "Die Faehigkeit, durch Vasodilatation selektiv Waerme in bestimmte Koerperteile zu leiten",
        correctAnswer = 2,
        explanation = "Kleptothermy beschreibt die Nutzung fremder Koerperwaerme zur eigenen Thermoregulation. Viele Schlangen versammeln sich in Massen in Winterlagern und nutzen die gemeinsame Waerme. Auch dokumentiert bei Schlangen, die sich an warme Saeugetiere oder Voegelkoerper schmiegen.",
        difficulty = 3,
        funFact = "In Manitoba, Kanada, versammeln sich Hunderttausende Roter Strumpfbandnattern in riesigen Winterlagern und erwaermen sich gegenseitig."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen adaptiven Wert hat das 'mobbing behavior' (Laerm-Attackenverhalten) bei Voegeln?",
        answerA = "Direkte Toetung des Raeubers durch koordinierten Angriff",
        answerB = "Vertreibung des Raeubers, Lerneffekt fuer Jungtiere und Signalisierung an den Raeuber, dass er entdeckt wurde",
        answerC = "Ablenkung des Raeubers waehrend andere Individuen fliehen",
        answerD = "Territoriale Markierung gegenueber Artgenossen",
        correctAnswer = 1,
        explanation = "Mobbing-Verhalten dient mehreren Zwecken: Den Raeuber stören und vertreiben (Harassment), ihn signalisieren, dass er entdeckt wurde (Jagd ineffizient), Jungtieren beibringen, welche Arten gefaehrlich sind (soziales Lernen), und Artgenossen warnen. Es ist kooperatives Anti-Praedatorverhalten.",
        difficulty = 3,
        funFact = "Voegel lernen Raubtiere durch Beobachtung des Mobbing-Verhaltens: Gesang-Weissvoegelchen, die Mobbing gegen eine harmlose Flasche beobachteten, mieden diese danach."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das 'dear enemy phenomenon' in der Territorialbiologie?",
        answerA = "Tiere kaempfen heftiger gegen bekannte als gegen fremde Nachbarn",
        answerB = "Tiere reagieren weniger aggressiv auf bekannte Nachbarn als auf Fremde, da Nachbarn das Territorium kennen und seltener eindringen",
        answerC = "Nachbarliche Tiere teilen Ressourcen friedlich, statt um sie zu konkurrieren",
        answerD = "Rangniedere Tiere vermeiden Konflikte mit dominanten Nachbarn",
        correctAnswer = 1,
        explanation = "Das 'Dear Enemy'-Phaenomen beschreibt, dass Territoriumsbesitzer gegenueber bekannten Nachbarn weniger aggressiv sind als gegenueber Fremden. Nachbarn haben stabile, bekannte Reviergrenzen und suchen selten neue Gebiete. Fremde sind potentielle Ersetzungswettbewerber.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie wirken sich 'biogenic habitat structures' (biogene Habitatstrukturen) auf Biodiversitaet aus?",
        answerA = "Sie reduzieren die Biodiversitaet durch Konkurrenz mit einheimischen Strukturbildnern",
        answerB = "Organismen, die physische Strukturen schaffen (Biber, Korallen, Weisselefanten), erhoehen die Habitetvielfalt und foerdern damit Biodiversitaet",
        answerC = "Nur ausgestorbene Megafauna war in der Lage, solche Strukturen zu schaffen",
        answerD = "Biogene Strukturen sind ausschliesslich im Meer relevant",
        correctAnswer = 1,
        explanation = "Oekosystemingenieure wie Biber, Elefanten, Korallen oder Prairiehuende schaffen durch ihr Verhalten physische Habitatstrukturen. Biberdaemme erzeugen Feuchtgebiete, Korallenriffe bieten Lebensraum fuer Tausende Arten. Diese Strukturen steigern die Heterogenitaet und Biodiversitaet erheblich.",
        difficulty = 3,
        funFact = "Biberdaemme speichern so viel Wasser und Sediment, dass sie den Wasserhaushalt ganzer Landschaften veraendern und Duerre abschwaechen koennen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'frequency-dependent selection' (frequenzabhaengige Selektion)?",
        answerA = "Selektion, die staerker auf haeufige Phaenotypen wirkt, sodass seltene Varianten begunstigt werden",
        answerB = "Selektion, die proportional zur Generationsfolgezeit einer Art wirkt",
        answerC = "Eine Form der Selektion, die nur in grossen Populationen relevant ist",
        answerD = "Selektion durch periodisch auftretende Umweltereignisse",
        correctAnswer = 0,
        explanation = "Bei negativer frequenzabhaengiger Selektion werden seltene Phaenotypen gegenueber haeufigen begunstigt. Dies erklaert die Erhaltung von Polymorphismen in der Natur. Beispiel: Raubtiere lernen das haeufige Beutebild, seltene Varianten werden weniger praediert.",
        difficulty = 3,
        funFact = "Das Erhalten von zwei oder mehr Morphen in einer Population (Balancierter Polymorphismus) ist ein Zeichen frequenzabhaengiger Selektion — wie beim Banded vs. Unbanded Cepaea-Schnecke."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt 'Bergmann's Regel' in der Zoogeographie?",
        answerA = "Tiere in kaelteren Klimaten haben groessere Extremitaeten zur Waermeabgabe",
        answerB = "Innerhalb einer Saeugetier- oder Vogelgattung sind Arten (oder Populationen) in kaelteren Klimaten im Durchschnitt groesser als in waermeren",
        answerC = "Groessere Tierarten haben eine laengere Lebensdauer und langsamere Reproduktion",
        answerD = "Die Artenvielfalt nimmt von den Polen zum Aequator hin zu",
        correctAnswer = 1,
        explanation = "Bergmann's Regel (1847) besagt, dass Warmbluetertiere in kaelteren Klimaten tendenziell groesser sind. Groessere Tiere haben ein guenstigeres Verhaeltnis von Volumen zu Oberflaeche, verlieren also relativ weniger Waerme. Allen's Regel ergaenzt: Extremitaeten sind in der Kaelte kuerzer.",
        difficulty = 3,
        funFact = "Eisbaeren sind die groessten Landraeuber — ein perfektes Beispiel fuer Bergmanns Regel an der Kaeltegrenze."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Group Selection' (Gruppenselektion) und warum ist sie in der Evolutionsbiologie umstritten?",
        answerA = "Selektion, die auf ganze Arten wirkt und weniger fit Arten aussterben laesst",
        answerB = "Selektion, die Gruppen mit vorteilhafter Struktur gegenueber anderen Gruppen begunstigt — aber anfaellig fuer 'Defektoren' innerhalb der Gruppe",
        answerC = "Kooperation innerhalb verwandter Gruppen, die durch Verwandtenselektion erklaert wird",
        answerD = "Die Selektion der Gruppe als Einheit, die voellig unbestritten ist",
        correctAnswer = 1,
        explanation = "Gruppenselektion wuerde bedeuten, dass altruistische Gruppen konkurrenzfaehiger sind als egoistische Gruppen. Das Problem: Innerhalb altruistischer Gruppen werden Defektoren (Egoisten) selektiv begunstigt, bis die Altruisten verdraengt werden. Individuelle Selektion dominiert meist ueber Gruppenselektion.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das Konzept der 'ecological release' (oekologische Befreiung) bei invasiven Arten?",
        answerA = "Die Freisetzung von Tieren aus Gefangenschaft in die Wildnis",
        answerB = "Invasive Arten explodieren in Populationsgroesse, weil sie ohne ihre natuerlichen Feinde, Parasite und Konkurrenten der Heimatregion sind",
        answerC = "Einheimische Arten erholen sich nach dem Aussterben von Raeuber-Arten",
        answerD = "Tiere, die in neue Lebensraeume wandern, entwickeln schnell neue Anpassungen",
        correctAnswer = 1,
        explanation = "Ecological release erklaert, warum invasive Arten oft exponentielle Populationszunahmen zeigen: Im neuen Gebiet fehlen spezialisierte Parasiten, Pathogene und Konkurrenten aus der Heimat. Die Art ist von natuerlichen Regulationsmechanismen 'befreit' und kann ungezuegelt wachsen.",
        difficulty = 3,
        funFact = "Cane Toads in Australien hatten keine natuerlichen Feinde und explodierten von urspruenglich 102 eingesetzten Tieren auf Hunderte Millionen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie funktioniert die chemische Kommunikation bei Ameisen durch Pheromone?",
        answerA = "Ameisen senden ein einziges Pheromonmolekuel aus, das alle Verhaltensweisen steuert",
        answerB = "Verschiedene Druesenorgane produzieren artspezifische Pheromone fuer Alarm, Futterspuren, Rekrutierung und Kastenerkennung",
        answerC = "Pheromone werden ausschliesslich von der Koenigin produziert und regulieren alle Kolonie-Aktivitaeten",
        answerD = "Pheromone dienen bei Ameisen nur der Feindabwehr, nicht der internen Kommunikation",
        correctAnswer = 1,
        explanation = "Ameisen besitzen ein hochkomplexes chemisches Kommunikationssystem mit bis zu 20 verschiedenen Pheromonklassen: Alarmpheromone aus den Mandibeldruesen, Rekrutierungspheromone fuer Futterspuren, Kastenerkennung durch Kutikula-Kohlenwasserstoffe, Koeniginpheromone zur Fortpflanzungsregulation.",
        difficulty = 3,
        funFact = "Manche Arten von Sklavenhaltungsameisen ahmen die Pheromone ihrer Opferarten nach, um unbemerkt in deren Kolonien einzudringen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der 'priority effects' (Erstbesiedlungseffekt) in der Gemeinschaftsoekologie?",
        answerA = "Groessere Tiere sichern sich stets zuerst die besten Ressourcen",
        answerB = "Die Reihenfolge, in der Arten einen neuen Lebensraum besiedeln, beeinflusst dauerhaft die Zusammensetzung der Gemeinschaft",
        answerC = "Erstankoemmliche Arten in einem Gebiet sind immer die dominierten Arten",
        answerD = "Invasive Arten haben einen evolutionaeren Vorteil, weil sie vor einheimischen Konkurrenten ankommen",
        correctAnswer = 1,
        explanation = "Priority Effects bedeuten, dass die zuerst etablierten Arten die Bedingungen fuer spaeteren Arten veraendern (z.B. durch Ressourcenverbrauch, Habitatveraenderung), und so den Verlauf der Sukzession beeinflussen. Zwei identische Lebensraeume koennen zu verschiedenen Endgemeinschaften fuehren, je nach Besiedlungsreihenfolge.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Funktion des Neuronalen Mechanismus der 'Imprinting' (Praegung) bei Voegeln?",
        answerA = "Jungtiere lernen durch Imprinting die Futterquellen der Eltern",
        answerB = "In kritischen sensiblen Phasen wird das Bild der Eltern/Elterntier dauerhaft als Referenz fuer spaetere Sozialpartner oder Fortpflanzungspartner eingespeichert",
        answerC = "Imprinting ermoeglicht Voegeln, den Gesang ihrer Art zu erlernen",
        answerD = "Junge Voegel praefen sich auf ihre Geburtsregion, um spaeter dahin zurueckzukehren",
        correctAnswer = 1,
        explanation = "Filiales Imprinting (Konrad Lorenz) geschieht in einem kurzen sensiblen Fenster nach dem Schluepfen: Das Junge praegt sich auf das erste grosse bewegliche Objekt ein. Dies bestimmt spaeteres Sozialverhalten und Partnerwahl. Sexuelles Imprinting bestimmt, nach welchem Partner-Typ gesucht wird.",
        difficulty = 3,
        funFact = "Konrad Lorenz liess sich von Gaensekueken als 'Mutter' einpraegen — die Keuken folgten ihm auf Schritt und Tritt. Er erhielt dafuer den Nobelpreis 1973."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielen Mykorhizza-Pilze in der Pflanzenoekologie und wie profitieren Tiere davon indirekt?",
        answerA = "Mykorrhiza-Pilze sind Parasiten, die Pflanzenwachstum hemmen",
        answerB = "Sie verbessern die Nahrstoffaufnahme von Pflanzen (bes. Phosphor), foerdern so Pflanzenwachstum und bilden 'Wood Wide Web' fuer interplanzliche Kommunikation",
        answerC = "Mykorrhiza-Pilze sind nur fuer Baeume wichtig, nicht fuer andere Pflanzen",
        answerD = "Sie sind nah verwandt mit Flechten und bewirken dasselbe wie diese",
        correctAnswer = 1,
        explanation = "Ektomykorrhiza und Arbuskulaere Mykorrhiza verbessern die Phosphor- und Wasseraufnahme von Pflanzen erheblich. Das 'Wood Wide Web' ermoeglicht interplanzlichen Naehrstoff- und Informationstransfer. Staerkere Pflanzen bedeuten mehr Nahrung fuer Herbivore und stabilerere Oekosysteme.",
        difficulty = 3,
        funFact = "Elternbaeume ('Mother Trees') koennen ueber Mykorrhiza-Netzwerke Zuckerstrom an schattige Samlinge weitergeben und deren Ueberleben foerdern."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Phenotypic Plasticity' (Phaenotypische Plastizitaet) und wie beeinflusst sie oekologische Anpassung?",
        answerA = "Die genetisch fixierte Variabilitaet zwischen Individuen einer Art",
        answerB = "Die Faehigkeit eines Organismus, seinen Phaenotyp in Reaktion auf Umweltveraenderungen zu veraendern, ohne genetische Veraenderung",
        answerC = "Die schnelle genetische Anpassung einer Population an neue Umweltbedingungen",
        answerD = "Die Faehigkeit von Raubtieren, ihre Jagdstrategie an verschiedene Beutearten anzupassen",
        correctAnswer = 1,
        explanation = "Phaenotypische Plastizitaet erlaubt Organismen, auf veraenderte Umweltbedingungen zu reagieren, ohne genetische Evolution abzuwarten. Beispiele: Manche Wasserfloehebilden bei Raeuberanwesenheit Dornen, Tiere veraendern ihre Morphologie je nach Nahrungsqualitaet. Wichtig in sich schnell aendernden Umgebungen.",
        difficulty = 3,
        funFact = "Der Siamesische Kampffisch zeigt Plastizitaet: In sauerstoffarmen Gewaessern entwickelt er groessere Atemorgane als in sauerstoffreichen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Konzept der 'ecological succession' (oekologischen Sukzession) und was unterscheidet primaere von sekundaerer Sukzession?",
        answerA = "Beide verlaufen identisch; der Unterschied ist nur der geografische Ort",
        answerB = "Primaere Sukzession beginnt auf unvegetierten Substraten ohne Bodenleben; sekundaere Sukzession beginnt nach Stoerung auf bestehendem Boden mit Samenmaterial",
        answerC = "Sekundaere Sukzession ist immer schneller als primaere und fuehrt zum gleichen Klimax",
        answerD = "Primaere Sukzession findet nur im Meer statt, sekundaere nur auf dem Land",
        correctAnswer = 1,
        explanation = "Primaere Sukzession startet auf neuem, lebensleerem Substrat (Lavafelsen, gletscherfreie Flaechen): langsam, Pionierarten bauen Boden auf. Sekundaere Sukzession startet nach Stoerung (Waldbrand, Ueberschwemmung) auf existierendem Boden mit Samenbank: viel schneller, da Boden und Naehrstoffe vorhanden.",
        difficulty = 3,
        funFact = "Nach dem Krakatau-Ausbruch 1883 war die Insel sterile Asche. Binnen 50 Jahren war sie von tropischem Regenwald bedeckt — ein dramatisches Beispiel primaerer Sukzession."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie beeinflusst die 'Habitat Fragmentation' (Lebensraumfragmentierung) Tierpopulationen genetisch?",
        answerA = "Fragmentierung erhoht die genetische Diversitaet durch Isolation",
        answerB = "Sie verursacht genetische Drift und Inzucht in kleinen isolierten Populationen, fuehrt zu Inzuchtdepression und reduzierter Fitness",
        answerC = "Fragmentierung hat nur auf grosse Tierarten genetische Auswirkungen",
        answerD = "Kleine isolierte Populationen passen sich schnell an lokale Bedingungen an und werden genetisch gesunder",
        correctAnswer = 1,
        explanation = "Fragmentierung trennt grosse Populationen in kleine isolierte Teilpopulationen. Genetische Drift wirkt in kleinen Populationen staerker (Verlust neutraler Varianten), Inzucht fuehrt zu Inzuchtdepression (reduzierte Fertilitat, Immunschwaeche). Genetische Vielfalt ist fuer evolutionaere Anpassungsfaehigkeit entscheidend.",
        difficulty = 3,
        funFact = "Pumas in Los Angeles sind durch Autobahnen so stark isoliert, dass Inzuchtzeichen nachgewiesen wurden — einige zeigen Herzklappenfehler wie inzuechtende Floridapumas."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'hyperparasitism' und welche Bedeutung hat es in der biologischen Schhaedlingsbekaempfung?",
        answerA = "Ein extremer Fall von Parasitismus, bei dem der Parasit seinen Wirt toetet",
        answerB = "Ein Parasit, der selbst von einem anderen Parasiten befallen wird (Parasit des Parasiten)",
        answerC = "Massenparasitismus, bei dem viele Parasiten denselben Wirt befallen",
        answerD = "Parasitismus unter nah verwandten Arten derselben Gattung",
        correctAnswer = 1,
        explanation = "Hyperparasitismus bezeichnet einen Parasiten zweiter Ordnung: Ein Organismus parasitiert einen anderen Parasiten. In der biologischen Schaedlingsbekaempfung kann dies problematisch sein: Wenn der eingesetzte Parasitoide selbst von Hyperparasiten befallen wird, ist seine Schaedlingskontrolle ineffektiv.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt die 'enemy release hypothesis' (Feindbefreiungshypothese) fuer invasive Arten?",
        answerA = "Invasive Arten sind erfolgreich, weil sie aggressiver als einheimische Arten sind",
        answerB = "Invasive Arten florieren, weil sie im neuen Gebiet keine spezialisierten natuerlichen Feinde (Herbivore, Parasiten, Krankheiten) haben",
        answerC = "Einheimische Arten koennen invasive Arten nicht als Nahrung erkennen und meiden sie",
        answerD = "Invasive Arten bringen neue Krankheitserreger mit, gegen die einheimische Arten nicht gewappnet sind",
        correctAnswer = 1,
        explanation = "Die Enemy Release Hypothesis erklaert den Invasionserfolg damit, dass gebietsfremde Arten die coevolutionierten Natuereindaemmer ihrer Heimat hinter sich lassen. Im neuen Gebiet gibt es keine spezialisierten Herbivore, Parasiten oder Pathogene — die Art kann ihre Energie in Wachstum und Reproduktion investieren.",
        difficulty = 3,
        funFact = "Gartenloewenzahn wurde als Heilpflanze in Nordamerika eingebracht und hat sich extrem ausgebreitet — in Europa haeufige Herbivore und Pilze fehlen in Amerika."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt die 'Intermediate Disturbance Hypothesis' in der Oekologie?",
        answerA = "Oekosysteme mit mittlerem Stoerungsregime haben die hoechste Biodiversitaet, da weder kompetitive Exklusion noch haeufige Aussterbe-Ereignisse dominieren",
        answerB = "Mittlere Stoerungsgrade schuetzen ausschliesslich Pionierarten vor Verdraaengung",
        answerC = "Hohe Stoerungsfrequenz fuehrt immer zu hoeherer Biodiversitaet als keine Stoerung",
        answerD = "Biodiversitaet ist unabhaengig vom Stoerungsregime in einem Oekosystem",
        correctAnswer = 0,
        explanation = "Connell (1978) schlug vor, dass bei mittleren Stoerungsintensitaeten und -frequenzen die Artenvielfalt maximal ist: Zu wenig Stoerung fuehrt zu kompetitiver Exklusion durch dominante Arten; zu viel Stoerung laesst nur Pionierarten zu. Mittlere Stoerung haelt das System in einem dynamischen Zustand mit vielen Arten.",
        difficulty = 3,
        funFact = "Korallenriffe zeigen dieses Muster: Moderate Wellenenergie erhaelt die Diversitaet, weil keine Art dauerhaft dominiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt 'niche construction' (Nischenkonstruktion) in der Evolutionsbiologie?",
        answerA = "Die Besetzung neuer oekologischer Nischen durch geografische Ausbreitung",
        answerB = "Der Prozess, durch den Organismen ihre eigene oekologische Nische durch Verhaltens- und Stoffwechselaktivitaeten aktiv veraendern und damit Selektionsdruck auf sich selbst und andere ausueben",
        answerC = "Die Schaffung neuer Arten durch oekologische Spezialisierung",
        answerD = "Bau von Nestern und anderen physischen Strukturen zur Verbesserung der Reproduktionsbedingungen",
        correctAnswer = 1,
        explanation = "Nischenkonstruktion (Odling-Smee et al.) erkennt an, dass Organismen ihre Umwelt aktiv veraendern und dadurch den Selektionsdruck auf sich und andere Arten modifizieren. Biber veraendern Hydrologie, Menschen kultivieren Pflanzen, Regenwuermer veraendern Bodenchemie.",
        difficulty = 3,
        funFact = "Die Laktosetoleranz beim Menschen ist ein Beispiel: Milchwirtschaft (Nischenkonstruktion) schuf den Selektionsdruck, der Laktasepersistenz in milchviehhaltenden Populationen begunstigt hat."
    ),

)
