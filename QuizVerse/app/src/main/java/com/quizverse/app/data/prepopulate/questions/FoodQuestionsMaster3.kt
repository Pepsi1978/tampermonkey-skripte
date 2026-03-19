package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster3(): List<Question> = listOf(

    // ── NEOLITHISCHE REVOLUTION & URSPRÜNGE DES ACKERBAUS ────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welche Region gilt als älteste bekannte Wiege des Ackerbaus — der sogenannte 'Fruchtbare Halbmond' — wo etwa 10.000 v. Chr. erstmals Wildgräser domestiziert wurden?",
        answerA = "Niltal (heutiges Ägypten und Sudan)",
        answerB = "Indus-Tiefland (heutiges Pakistan)",
        answerC = "Levante und Mesopotamien (heutiger Naher Osten)",
        answerD = "Gelber Fluss (heutiges Nordchina)",
        correctAnswer = 2,
        explanation = "Der Fruchtbare Halbmond — das Gebiet von der Levante über den Taurus bis nach Mesopotamien — gilt als früheste Wiege des Ackerbaus. Hier wurden Emmer, Einkorn und Gerste als erste Getreidesorten um 10.000 v. Chr. domestiziert, parallel zur Domestizierung von Schafen und Ziegen.",
        difficulty = 5,
        funFact = "Die Neolithische Revolution geschah nicht an einem Ort, sondern unabhängig voneinander in mehreren Weltregionen: Mesopotamien (~10.000 v. Chr.), China (~7000 v. Chr.), Mesoamerika (~5000 v. Chr.) und West-Afrika (~3000 v. Chr.)."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der anthropologische Begriff 'Broad Spectrum Revolution', der dem Beginn der Landwirtschaft vorausging?",
        answerA = "Die Ausweitung des Handels auf Luxusgüter wie Gewürze und Edelmetalle",
        answerB = "Die erste globale Verbreitung von Nahrungspflanzen durch Migration",
        answerC = "Die Erfindung von Mahlsteinen und Mörsern zur Verarbeitung von Getreide",
        answerD = "Die Erweiterung der Nahrungspalette auf eine breite Vielfalt kleinerer Tiere, Pflanzen und Meeresfrüchte vor Einsetzen des Ackerbaus",
        correctAnswer = 3,
        explanation = "Die 'Broad Spectrum Revolution' (Kent Flannery, 1969) bezeichnet eine Phase ca. 20.000–10.000 v. Chr., in der Menschen ihr Nahrungsspektrum erheblich erweiterten — von der Konzentration auf Großwild auf ein breites Spektrum aus Kleintieren, Fischen, Weichtieren, Nüssen und Wildpflanzen. Diese Diversifizierung gilt als Vorläufer der Landwirtschaft.",
        difficulty = 5,
        funFact = "Paläontologen fanden heraus, dass viele frühe Ackerbaukulturen paradoxerweise kleiner und kränker waren als ihre Jäger-und-Sammler-Vorfahren — Ackerbau bedeutete nicht automatisch bessere Ernährung."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Welches Getreide gilt als erste domestizierte Kulturpflanze der Menschheitsgeschichte — und wo wurde es ursprünglich angebaut?",
        answerA = "Dinkel — im Hochland Anatoliens, ca. 9000 v. Chr.",
        answerB = "Gerste — im heutigen Iran, ca. 8500 v. Chr.",
        answerC = "Einkorn-Weizen — am Karacadag-Gebirge (heutige Türkei), ca. 9600 v. Chr.",
        answerD = "Emmer-Weizen — im südlichen Levante (heutiges Israel/Palästina), ca. 9500 v. Chr.",
        correctAnswer = 2,
        explanation = "Genetische Analysen von 2006 zeigten, dass Einkorn-Weizen (Triticum monococcum) am Karacadag-Gebirge im südöstlichen Anatolien domestiziert wurde — alle heutigen Einkorn-Varietäten leiten sich von dieser Ursprungspopulation ab. Es ist die genetisch am besten nachverfolgbare frühe Getreidepflanze.",
        difficulty = 5,
        funFact = "Das Karacadag-Gebirge liegt nur etwa 30 km von der archäologischen Stätte Göbekli Tepe entfernt — einem rätselhaften Steinkreis-Tempel aus ca. 10.000 v. Chr., der möglicherweise mit frühen Ackerbaupraktiken zusammenhing."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welcher Anthropologe prägte 1942 den Begriff 'Neolithische Revolution' und argumentierte, dass Ackerbau eine bewusste menschliche 'Erfindung' war?",
        answerA = "Claude Lévi-Strauss",
        answerB = "Vere Gordon Childe",
        answerC = "Margaret Mead",
        answerD = "Lewis Henry Morgan",
        correctAnswer = 1,
        explanation = "Der australisch-britische Archäologe Vere Gordon Childe (1892–1957) prägte 1942 den Begriff 'Neolithic Revolution' in seinem Werk 'What Happened in History'. Er sah Ackerbau als revolutionäre Erfindung, die Sesshaftigkeit und Zivilisation ermöglichte — eine Sichtweise, die heute als zu vereinfacht gilt.",
        difficulty = 5,
        funFact = "Childes Revolutionsbegriff wird heute kritisch betrachtet: Die Transition zur Landwirtschaft dauerte Tausende von Jahren und war eher ein gradueller Prozess als eine 'Revolution' — lokale Jäger-Sammler-Gruppen coexistierten Jahrtausende lang mit frühen Ackerbauern."
    ),

    // ── COLUMBIAN EXCHANGE — TIEFGANG ─────────────────────────────────────────

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welcher US-amerikanische Historiker prägte 1972 den Begriff 'Columbian Exchange' — und in welchem Werk?",
        answerA = "Jared Diamond in 'Guns, Germs, and Steel' (1997)",
        answerB = "Fernand Braudel in 'Civilization and Capitalism' (1979)",
        answerC = "Alfred W. Crosby in 'The Columbian Exchange: Biological and Cultural Consequences of 1492'",
        answerD = "William McNeill in 'Plagues and Peoples' (1976)",
        correctAnswer = 2,
        explanation = "Alfred W. Crosby (1931–2018) prägte den Begriff 'Columbian Exchange' in seinem gleichnamigen Buch von 1972. Er argumentierte, dass der biologische Austausch nach 1492 — Pflanzen, Tiere, Krankheiten — mindestens so bedeutsam war wie der kulturelle und wirtschaftliche Austausch.",
        difficulty = 5,
        funFact = "Crosby prägte später auch den Begriff 'Ecological Imperialism' — seine These, dass Europas Vorherrschaft teilweise auf eingeschleppten Krankheiten und invasiven Arten beruhte, war für seine Zeit revolutionär und ist heute Standardlehre."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welches Nahrungsmittel aus der Neuen Welt verursachte nach seiner Einführung in Europa den größten demografischen Aufschwung — und in welchem Land am deutlichsten?",
        answerA = "Mais — in Spanien, wo er erstmals angebaut wurde",
        answerB = "Kartoffel — in Irland und Preußen, wo sie bis zu 25% Bevölkerungswachstum auslöste",
        answerC = "Tomate — in Italien, wo sie die mediterrane Küche revolutionierte",
        answerD = "Maniok — in Westafrika, wo er zur Hauptnahrungsquelle wurde",
        correctAnswer = 1,
        explanation = "Laut einer Studie von Nunn & Qian (2010, Harvard) trug die Kartoffel zwischen 1700 und 1900 zu 12–25% des Bevölkerungswachstums in Afro-Eurasien bei. Besonders Irland und Preußen verzeichneten extreme Abhängigkeit von der Kartoffel — was Irland 1845–1852 verheerend traf.",
        difficulty = 5,
        funFact = "Mais verbreitete sich parallel rasant in Afrika und ermöglichte dort ebenfalls erhebliches Bevölkerungswachstum — was Historiker mit dem Anstieg des transatlantischen Sklavenhandels in Verbindung bringen: mehr Nahrung = mehr Bevölkerung = mehr Sklaven."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was war der 'Dreieckshandel' (Triangle Trade) im Kontext des Columbian Exchange und welche Rolle spielte Zucker dabei?",
        answerA = "Getreide aus Europa → Amerika → Afrika; Zucker ersetzte Salz als Konservierungsmittel",
        answerB = "Silber aus Amerika → Spanien → Osmanisches Reich; Zucker wurde als Luxusgut mitgeführt",
        answerC = "Manufakturwaren aus Europa → Afrika (für Sklaven) → Karibik (Plantagenarbeit); Zucker und Rum aus Karibik → Europa",
        answerD = "Gewürze aus Asien → Europa → Amerika; Zucker war das Zahlungsmittel für Gewürze",
        correctAnswer = 2,
        explanation = "Der atlantische Dreieckshandel verband Europa, Westafrika und die Karibik: Europa exportierte Manufakturwaren nach Afrika, Afrika lieferte versklavte Menschen in die Karibik, die Karibik exportierte Zucker, Rum und Tabak nach Europa. Zucker war der wirtschaftliche Motor dieses Handelssystems.",
        difficulty = 5,
        funFact = "Auf dem Höhepunkt der Sklaverei arbeiteten allein auf den karibischen Zuckerinseln über 400.000 versklavte Menschen. Die Zuckerproduktion war so extrem kräftezehrend, dass die durchschnittliche Lebenserwartung nach der Ankunft in der Karibik nur 7–10 Jahre betrug."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welche amerikanische Pflanze hatte den tiefgreifendsten Einfluss auf die chinesische Küche und Demografie nach dem Columbian Exchange — und wann gelangte sie nach China?",
        answerA = "Tomate — ca. 1700, über jesuitische Missionare",
        answerB = "Kartoffel — ca. 1600, über portugiesische Handelsniederlassungen in Macao",
        answerC = "Mais — ca. 1550, über portugiesische Händler, und Süßkartoffel — ca. 1580",
        answerD = "Erdnuss — ca. 1650, über spanische Händler auf den Philippinen",
        correctAnswer = 2,
        explanation = "Mais und Süßkartoffel gelangten ca. 1550–1580 nach China und revolutionierten die Ernährung der Armen. Sie konnten auf marginalem Bergland angebaut werden, das für Reis ungeeignet war, und ermöglichten die Besiedelung des chinesischen Hochlands — was zu erheblichem Bevölkerungswachstum führte.",
        difficulty = 5,
        funFact = "Historiker schätzen, dass die aus Amerika stammenden Nahrungspflanzen (Mais, Süßkartoffel, Erdnuss) zu einem erheblichen Teil des chinesischen Bevölkerungswachstums von ca. 100 Millionen (1500) auf über 400 Millionen (1850) beigetragen haben."
    ),

    // ── GEWÜRZHANDEL — WELTPOLITIK & ANTHROPOLOGIE ───────────────────────────

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Was waren die 'Gewürzinseln' (Molukken) und warum waren sie im 16.–17. Jahrhundert Zentrum blutiger Kolonialkonkurrenz?",
        answerA = "Malaiische Halbinseln, durch die alle Schiffsrouten zwischen Indien und China führten",
        answerB = "Arabische Inseln im Roten Meer, von denen aus der gesamte Gewürzhandel kontrolliert wurde",
        answerC = "Indische Küstenregionen, die das globale Pfeffer-Monopol kontrollierten",
        answerD = "Indonesische Inseln, die als einzige Orte weltweit Muskatnuss und Nelken produzierten",
        correctAnswer = 3,
        explanation = "Die Molukken (heute Teil Indonesiens) waren die einzigen natürlichen Produktionsorte von Muskatnuss (Banda-Inseln) und Gewürznelken (Ternate, Tidore). Da diese Gewürze in Europa extrem wertvoll waren, kämpften Portugal, Spanien, die Niederlande und England im 16.–17. Jahrhundert erbittert um deren Kontrolle.",
        difficulty = 5,
        funFact = "Im Vertrag von Breda (1667) tauschte England die Banda-Insel Run (eine Muskatnuss-Insel) gegen Nieuw Amsterdam (das heutige New York) — die Niederländer hielten das Muskat-Monopol für wertvoller als die gesamte nordamerikanische Kolonie."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Warum wurden Gewürze im mittelalterlichen Europa derart hoch geschätzt, dass Pfeffer als Zahlungsmittel diente — was ist die historisch akkurateste Erklärung?",
        answerA = "Zur Maskierung von verfaultem Fleisch, da Kühlmittel fehlten",
        answerB = "Aus medizinischen Gründen (humoralpathologische Theorie), als Statussymbol und für die Konservierung von Speisen",
        answerC = "Als Weihrauchersatz in christlichen Zeremonien",
        answerD = "Wegen ihres tatsächlichen Nährwerts als Vitamin- und Mineralstoffquellen",
        correctAnswer = 1,
        explanation = "Die 'verfaultes Fleisch'-Theorie ist ein Mythos. Gewürze waren so teuer, dass sie ohnehin nur Reichen zugänglich waren, die frisches Fleisch hatten. Der echte Grund: Gewürze wurden nach der humoralpathologischen Medizin als heilend angesehen, galten als Statussymbole des Reichtums und hatten tatsächlich konservierende Wirkung.",
        difficulty = 5,
        funFact = "Ein Pfund Muskatnuss kostete im 14. Jahrhundert in Europa so viel wie drei bis sieben Schafe oder ein halber Jahresverdienst eines Handwerkers — der 'Gewürzhandel' war buchstäblich das Öl-Geschäft des Mittelalters."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welches historische Ereignis von 1453 trieb Europa dazu, alternative Seewege nach Asien zu suchen — und welchen direkten Einfluss hatte das auf die Kulinargeschichte?",
        answerA = "Der Schwarze Tod dezimierte arabische Händler und unterbrach alle Gewürzrouten",
        answerB = "Venedigs Bankrott erzwang den Rückzug aus dem Gewürzhandel",
        answerC = "Der Zusammenbruch der Mongolenherrschaft machte die Seidenstraße unsicher für Händler",
        answerD = "Die Einnahme Konstantinopels durch die Osmanen blockierte die Landrouten und erhöhte Zölle auf Gewürze, was die Entdeckungsfahrten motivierte",
        correctAnswer = 3,
        explanation = "Als 1453 das Osmanische Reich Konstantinopel einnahm, kontrollierten die Osmanen fortan die Landrouten zwischen Europa und Asien und erhoben hohe Zölle. Dies trieb Portugal und Spanien dazu, Seewege um Afrika herum zu erkunden — was direkt zum Columbian Exchange und zur Globalisierung des Essens führte.",
        difficulty = 5,
        funFact = "Der Einfluss auf die Kulinargeschichte war immens: Vasco da Gamas Seeroute nach Indien (1498) brach das venezianische Monopol, und Kolumbus suchte eine Westroute zu den 'Gewürzinseln' — und stieß stattdessen auf Amerika mit seinen neuen Lebensmitteln."
    ),

    // ── FERMENTATION & ANTHROPOLOGIE DES ESSENS ──────────────────────────────

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welche anthropologische Theorie besagt, dass fermentierte Getränke — nicht Brot — der Hauptgrund für die Sesshaftwerdung der Menschheit und den Beginn des Getreidanbaus waren?",
        answerA = "Die 'Beer Before Bread Hypothesis' von Katz und Voigt (1986)",
        answerB = "Die 'Demography-Push Theory' von Cohen (1977)",
        answerC = "Die 'Bread Hypothesis' von Levi-Strauss (1962)",
        answerD = "Die 'Feast Theory' von Hayden (1990)",
        correctAnswer = 0,
        explanation = "Die Anthropologen Solomon Katz und Mary Voigt stellten 1986 die provokante These auf, dass Menschen sesshaft wurden und Getreide anbauten, weil sie fermentierte Biergetränke wollten — nicht für Brot. Bier hatte soziale, religiöse und vermutlich auch ernährungsphysiologische Vorteile (Vitamine durch Gärung).",
        difficulty = 5,
        funFact = "Die ältesten Belege für Bierbrauen stammen aus der Rakefet-Höhle in Israel (ca. 13.000 v. Chr.) — von noch-nomadischen Natufianern. Das unterstützt die These, dass Fermentation der Landwirtschaft möglicherweise vorausging."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Was ist 'Koji' (Aspergillus oryzae) und welche fundamentale Rolle spielt dieser Schimmelpilz in der ostasiatischen Kulinargeschichte?",
        answerA = "Ein japanisches Fischfermentationsenzym, das den Umami-Geschmack in Dashi-Brühe erzeugt",
        answerB = "Eine Hefe-Variante, die für das Backen von Reisbrot in Japan und Korea verwendet wird",
        answerC = "Eine traditionelle chinesische Pilzart, die als erstes kultivierbares Nahrungsmittel gilt",
        answerD = "Ein Schimmelpilz, der Stärke in Zucker und Proteine in Aminosäuren spaltet — Basis für Sake, Sojasauce, Miso und viele fermentierte ostasiatische Lebensmittel",
        correctAnswer = 3,
        explanation = "Koji (Aspergillus oryzae) ist ein Schimmelpilz, der Enzyme produziert, die Stärke zu Zucker und Proteine zu Aminosäuren abbauen. Er ist die biologische Grundlage für Sake (Reiswein), Shoyu (Sojasauce), Miso, Amazake, Shio Koji und viele weitere fermentierte Produkte — unverzichtbar für die ostasiatische Küche seit über 2.000 Jahren.",
        difficulty = 5,
        funFact = "Japan erklärte Aspergillus oryzae im Jahr 2006 offiziell zum 'nationalen Schimmelpilz' (kokkin) — ein einzigartiger Akt, ein Mikroorganismus staatlich zu ehren."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "In welchem Kontext beschrieb Claude Lévi-Strauss das 'Kulinarische Dreieck' und was bezeichnet es in der Anthropologie?",
        answerA = "Die drei grundlegenden Geschmacksrichtungen aller Kulturen: süß, sauer und salzig",
        answerB = "Die drei Welternährungsregionen: Asien (Reis), Amerika (Mais) und Europa (Weizen)",
        answerC = "Die drei Phasen der menschlichen Ernährungsgeschichte: Jagen, Ackerbau, Industrie",
        answerD = "Das strukturalistische Schema der Nahrungszubereitung: roh — gegart — verfault (fermentiert) als universelle kulturelle Kategorien",
        correctAnswer = 3,
        explanation = "Claude Lévi-Strauss entwickelte 1964 das 'Kulinarische Dreieck': Nahrung kann 'roh', 'gegart' (kulturell transformiert durch Feuer) oder 'verfault/fermentiert' (natürlich transformiert) sein. Er argumentierte, diese Dreiteilung sei eine universelle kulturelle Struktur, die das Verhältnis von Natur und Kultur symbolisiert.",
        difficulty = 5,
        funFact = "Lévi-Strauss' These war hochgradig symbolisch: Das Kochen über Feuer repräsentiert Kultur, Fermentation repräsentiert Natur — aber fermentierte Nahrung ist gleichzeitig kulturell hoch geschätzt, was seine einfache Dichotomie kompliziert."
    ),

    // ── KOCHBUCHGESCHICHTE & GASTRONOMIELITERATUR ─────────────────────────────

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welches mesopotamische Tontafel-Set aus ca. 1700 v. Chr. gilt als älteste erhaltene Sammlung von Kochrezepten der Welt — und wo werden die Originale aufbewahrt?",
        answerA = "Die Nippur-Tafeln — im Irak-Museum in Bagdad",
        answerB = "Die Yale Culinary Tablets (YBC 4644) — in der Yale University Babylonian Collection",
        answerC = "Die Ebla-Kocharchive — im Nationalen Museum von Syrien in Damaskus",
        answerD = "Die Uruk-Speiseplatten — im Pergamonmuseum in Berlin",
        correctAnswer = 1,
        explanation = "Die Yale Culinary Tablets — drei Keilschrifttafeln aus ca. 1700 v. Chr. (babylonische Zeit) in der Yale University Babylonian Collection — sind die ältesten erhaltenen Kochrezept-Sammlungen. Sie enthalten 35 Eintopfrezepte in akkadischer Sprache, darunter Lamm-, Vogel- und Gemüsegerichte.",
        difficulty = 5,
        funFact = "Die Tafeln wurden erst 2020 vollständig übersetzt — die meisten keilschriftkundigen Wissenschaftler des 20. Jahrhunderts hielten sie für Landwirtschaftsabrechnungen und ignorierten ihren kulinarischen Inhalt jahrzehntelang."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welcher arabische Gelehrte des 10. Jahrhunderts verfasste das älteste vollständig erhaltene arabische Kochbuch mit über 600 Rezepten?",
        answerA = "Ziryab (Abu al-Hasan Ali ibn Nafi') — Musiker und Feinschmecker am Hofe von Córdoba",
        answerB = "Al-Kindi — Philosoph und Gelehrter des Abbasidenreichs",
        answerC = "Ibn Sayyar al-Warraq — sein 'Kitab al-Tabikh' (Kochbuch) ca. 940 n. Chr. enthält 600 Rezepte",
        answerD = "Ibn Rushd (Averroes) — Arzt und Aristoteles-Kommentator",
        correctAnswer = 2,
        explanation = "Ibn Sayyar al-Warraq verfasste ca. 940 n. Chr. das 'Kitab al-Tabikh' (Buch der Gerichte) — das älteste vollständig erhaltene arabische Kochbuch mit über 600 Rezepten. Es ist auch eines der ersten Kochbücher überhaupt, das Ernährungsmedizin, Tischmanieren und Menüplanung systematisch behandelt.",
        difficulty = 5,
        funFact = "Das 'Kitab al-Tabikh' beschreibt auch das älteste bekannte Rezept für Baklava-ähnliches Gebäck und enthält detaillierte Anweisungen für Hofbankette — ein einzigartiges Dokument abbasidischer Hofkultur."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was unterschied Auguste Escoffiers 'Brigade de Cuisine'-System von der vorherigen Küchenorganisation — und warum gilt es als Revolution der Gastronomiegeschichte?",
        answerA = "Er führte die erste einheitliche Kochuniform ein und standardisierte Restaurantpreise",
        answerB = "Er unterteilte die Küche in spezialisierte Stationen (Saucier, Gardemanger etc.) mit klarer Hierarchie — statt eines einzigen Allround-Kochs pro Gericht",
        answerC = "Er erfand die A-la-carte-Speisekarte als Alternative zum festen Menü",
        answerD = "Er etablierte das erste internationale Netzwerk von Restaurantführern und Bewertungssystemen",
        correctAnswer = 1,
        explanation = "Escoffiers 'Brigade de Cuisine' (entwickelt im Ritz Paris, ca. 1898) unterteilte die Restaurantküche in spezialisierte Posten: Saucier, Entremetier, Rôtisseur, Gardemanger, Pâtissier usw. — jeder Cook spezialisiert auf sein Feld. Dies ermöglichte die Skalierung auf Hunderte von Gästen gleichzeitig und ist bis heute Standard.",
        difficulty = 5,
        funFact = "Escoffier war inspiriert von der militärischen Hierarchie, die er während des Deutsch-Französischen Krieges 1870 erlebt hatte — er übertrug das Konzept der Truppengliederung auf die Küche."
    ),

    // ── KULTURELLE NAHRUNGSANTHROPOLOGIE ──────────────────────────────────────

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der soziologische Begriff 'Gastro-Politik' (Gastro-Politics), geprägt von Arjun Appadurai 1981?",
        answerA = "Die Verwendung von Nahrung als Machtmittel in sozialen Hierarchien, insbesondere in hinduistischen Kasten-Gesellschaften Indiens",
        answerB = "Die diplomatische Praxis, Staatsbesuche mit traditionellen Nationalgerichten zu empfangen",
        answerC = "Die politische Regulierung von Lebensmittelimporten durch Schutzzölle",
        answerD = "Die historische Verbindung zwischen Gewürzhandel und Kolonialherrschaft",
        correctAnswer = 0,
        explanation = "Arjun Appadurai prägte 1981 den Begriff 'Gastro-Politics' für die Verwendung von Nahrung als soziales Machtinstrument in Südasien: Wer welches Essen bekommt, wer mit wem isst, welche Gerichte welcher Kaste oder welchem Geschlecht vorbehalten sind — Nahrung als Spiegel und Instrument sozialer Hierarchie.",
        difficulty = 5,
        funFact = "Appadurais Ansatz zeigte, dass das Verweigern von Speisen oder das Einladen zum Essen in Indien komplexe Statusbotschaften trägt — ähnlich wie Blumengaben oder Verbeugungen in anderen Kulturen."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Welche der folgenden Theorien erklärt Schweinefleischtabus im Islam und Judentum durch eine ökologisch-materialistische Perspektive?",
        answerA = "Marvin Harris' Kultureller Materialismus: Schweinehaltung war im Nahen Osten ökologisch ineffizient und konkurrierte mit Menschen um Nahrungsressourcen",
        answerB = "Mary Douglas' strukturalistische Theorie: Schweine waren 'anomale' Tiere (gespaltene Hufe, aber kein Wiederkäuen), die das Kategoriesystem störten",
        answerC = "Die Hygienehypothese: Schweinefleisch enthält Trichinen und war ohne Kühlung in heißen Klimaten gefährlich",
        answerD = "Die Identitätshypothese: Tabus dienten zur Abgrenzung von Nachbarvölkern, die Schweine aßen",
        correctAnswer = 0,
        explanation = "Marvin Harris' 'kultureller Materialismus' (1975) ist die einflussreichste materialistische Erklärung: Im trockenen Nahen Osten benötigten Schweine Schatten und Wasser, konnten kein Gras fressen (anders als Rinder/Ziegen) und konkurrierten direkt mit Menschen um Getreide. Schweinehaltung war ökologisch ineffizient und wurde daher tabuisiert.",
        difficulty = 5,
        funFact = "Mary Douglas' symbolische Erklärung ist kulturanthropologisch einflussreicher: Leviticus definiert 'rein' als 'in Kategorie passend' — gespaltene Klauen UND Wiederkäuen = rein; nur eines von beiden = anomal/unrein. Dies erklärt auch, warum Hasen (Wiederkäuer ohne gespaltene Klauen) verboten sind."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Cuisines of Resistance' in der Nahrungsanthropologie?",
        answerA = "Traditionelle Kochweisen, die gegen die Industrialisierung der Nahrungsmittelproduktion kämpfen",
        answerB = "Kulinarische Praktiken unterdrückter Gruppen (Sklaven, Kolonisierte, Migranten), die kulturelle Identität und Würde trotz Repression bewahren",
        answerC = "Vegetarische und vegane Bewegungen als Widerstand gegen die Fleischindustrie",
        answerD = "Regionale Küchen, die EU-Herkunftsschutzzeichen gegen Globalisierung einsetzen",
        correctAnswer = 1,
        explanation = "'Cuisines of Resistance' bezeichnet kulinarische Praktiken marginalisierter Gruppen: Versklavte Afrikaner in Amerika bewahrten Kochtechniken und Zutaten (Okra, Schwarzaugen-Bohnen, Reisgerichte), die ihre Kultur am Leben hielten. Ähnliches gilt für indigene Völker, Migranten und kolonisierte Kulturen.",
        difficulty = 5,
        funFact = "Soul Food in den USA — Grits, Collard Greens, Black-Eyed Peas — hat seine Wurzeln direkt in den kulinarischen Überlebensstrategien versklavter Afrikaner, die die unerwünschten Tierteile (Schweinsfüße, Innereien) in schmackhafte, nahrhafte Gerichte verwandelten."
    ),

    // ── HISTORISCHE LEBENSMITTELTECHNOLOGIE ───────────────────────────────────

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Was war die historische Bedeutung von Lea & Perrins' Worcestershire Sauce — und welche geheime Zutat macht sie zu einem ungewöhnlichen Würzmittel?",
        answerA = "Sie war die erste industriell produzierte Flüssigsauce — ihr Geheimnis ist die Zugabe von Sojabohnen",
        answerB = "Sie enthält fermentierte Sardellen — was sie zu einem Umami-Würzmittel macht, vergleichbar mit antikem Garum",
        answerC = "Sie wurde für Queen Victoria speziell kreiert — ihr Geheimnis ist Trüffelextrakt",
        answerD = "Sie war das erste Produkt mit gesetzlichem Markenschutz — ihr Geheimnis ist Tamarinde aus Indien",
        correctAnswer = 1,
        explanation = "Worcestershire Sauce (erfunden ca. 1837 von Lea & Perrins) enthält unter anderem fermentierte Sardellen — was sie ungewöhnlich macht: Eine englische Sauce basiert auf einem uralten Fermentationsprinzip identisch mit antikem römischem Garum. Das vollständige Rezept ist bis heute streng geheim.",
        difficulty = 5,
        funFact = "Die vollständige Rezeptur der Worcestershire Sauce ist bis heute ein streng gehütetes Geheimnis — wie Coca-Cola. Bekannte Zutaten umfassen Sardellen, Tamarinde, Essig, Melasse, Zwiebeln und Knoblauch; die genauen Anteile sind unbekannt."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welche Entdeckung des Chemikers Justus von Liebig revolutionierte 1840 das Verständnis von Ernährung und legte den Grundstein für die moderne Lebensmittelwissenschaft?",
        answerA = "Die Entdeckung von Vitaminen als essenziellen Mikronährstoffen",
        answerB = "Die Entdeckung, dass Kochsalz Jodmangel verhindert",
        answerC = "Die Klassifizierung von Proteinen, Fetten und Kohlenhydraten als die drei Grundnährstoffe",
        answerD = "Die Theorie, dass Pflanzen Nährstoffe aus dem Boden beziehen (Mineraltheorie), nicht aus Humus — Grundlage für Kunstdünger",
        correctAnswer = 3,
        explanation = "Justus von Liebigs 'Organische Chemie in ihrer Anwendung auf Agricultur und Physiologie' (1840) revolutionierte die Landwirtschaft: Er zeigte, dass Pflanzen anorganische Mineralien (Stickstoff, Phosphor, Kali) aus dem Boden benötigen — nicht organischen Humus wie traditionell geglaubt. Dies schuf die wissenschaftliche Basis für chemischen Kunstdünger.",
        difficulty = 5,
        funFact = "Liebig erfand auch den Fleischextrakt 'Liebigs Fleisch-Extract' (später zu OXO-Würfel) und die Babynahrung 'Liebigs Suppe' — er prägte modern die Idee, Nahrung nach ihrem chemischen Nährwert zu optimieren."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Was war das 'Miracle Berry' (Synsepalum dulcificum) und wie nutzte ein Unternehmer in den 1970er-Jahren seine Eigenschaft für ein kulinarisches Geschäftsmodell?",
        answerA = "Eine westafrikanische Beere, deren Protein Miraculin saure Speisen süß schmecken lässt — Robert Harvey wollte sie als Zuckerersatz für Diabetiker vermarkten",
        answerB = "Eine brasilianische Frucht, die Bitterkeit neutralisiert — Nestlé versuchte damit Kaffee zu süßen",
        answerC = "Ein südasiatisches Gewächs, dessen Extrakt alle fünf Grundgeschmacksrichtungen gleichzeitig auslöst",
        answerD = "Eine asiatische Beere, die das Geschmackserlebnis von fetthaltigen Speisen verstärkt",
        correctAnswer = 0,
        explanation = "Die Wunderbeere (Synsepalum dulcificum) enthält das Glykoprotein Miraculin, das Saures für 30–90 Minuten süß schmecken lässt. Robert Harvey plante in den 1970ern, es als natürlichen Zuckerersatz für Diabetiker zu vermarkten. Die FDA blockierte dies 1974 — angeblich durch Lobby der Zuckerindustrie.",
        difficulty = 5,
        funFact = "In Japan ist Miraculin als Lebensmittelzusatz zugelassen. Die Wunderbeere wird heute bei 'Flavor Tripping Parties' eingesetzt, bei denen Teilnehmer Zitronen als Süßigkeit erleben — ein kulinarisch-sensorisches Experiment."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Was war die 'Perpetual Stew' (Ewig-Eintopf) des Mittelalters und welche anthropologische Bedeutung hatte sie?",
        answerA = "Ein Gericht, das an Festtagen rituell zubereitetes Essen symbolisierte und Generationen überbrückte",
        answerB = "Ein Kochtopf, der in ärmeren Haushalten und Wirtshäusern nie vollständig geleert wurde — immer neue Zutaten kamen hinzu, was Kontinuität über Tage oder Wochen bedeutete",
        answerC = "Ein Alchemistenrezept, das angeblich unsterblich machende Zutaten enthielt",
        answerD = "Ein Klostergericht, das das ganze Jahr über auf dem Feuer stand und Mönche das ganze Jahr ernährte",
        correctAnswer = 1,
        explanation = "Der 'Perpetual Stew' oder 'Pottage' war ein im mittelalterlichen Europa weit verbreitetes Kochprinzip: Ein Topf blieb über Tage oder Wochen über dem Feuer, und täglich wurden neue Zutaten (Gemüse, Knochen, Reste) hinzugefügt, während der Boden gegessen wurde. Dies war eine effiziente Methode zur Resteverwertung und ein Zeichen der Nahrungsknappheit.",
        difficulty = 5,
        funFact = "Ein berühmtes Beispiel soll ein Gasthaus in Perpignan, Frankreich, gehabt haben, dessen Eintopf angeblich seit über 300 Jahren ohne Unterbrechung weitergekocht wird — obwohl historisch nicht verifizierbar, spiegelt die Geschichte die mittelalterliche Realität des Perpetual Stew."
    ),

    // ── NAHRUNG & SOZIALE STRUKTUREN ─────────────────────────────────────────

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was war der 'Service à la française' und warum wurde er im 19. Jahrhundert durch den 'Service à la russe' verdrängt?",
        answerA = "Beim Service à la française wurden alle Speisen gleichzeitig auf dem Tisch präsentiert; der russische Service brachte Gänge nacheinander — für heiße Speisen und theatralische Präsentation",
        answerB = "Der französische Service bedeutete, dass Gäste sich selbst bedienten; der russische Service führte Kellner ein",
        answerC = "Der französische Service reservierte Sitzplätze nach Stand; der russische Service erlaubte freies Sitzen",
        answerD = "Beim französischen Service wurden alle Speisen auf silbernen Tabletts serviert; der russische Service nutzte erstmals Porzellan",
        correctAnswer = 0,
        explanation = "Service à la française (bis ca. 1850): Alle Gerichte eines Gangs standen gleichzeitig auf dem Tisch — opulenter Anblick, aber Speisen wurden kalt. Service à la russe (ab ca. 1810, durch russischen Diplomaten Kurakin eingeführt): Gerichte werden sequenziell serviert, kommen heiß an, und die Präsentation vor dem Gast wird zum Theater.",
        difficulty = 5,
        funFact = "Der Service à la russe ist heute weltweiter Standard in gehobenen Restaurants. Er veränderte auch die Tischarchitektur: Da nicht mehr alle Speisen gleichzeitig auf dem Tisch standen, konnte man elegantere, schmalere Tische bauen."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welcher Historiker verband das Terroir-Konzept mit der kulturellen Identität Frankreichs als 'Erinnerungsort' — und in welchem grundlegenden Werk?",
        answerA = "Joël Robuchon in seinem Konzept der 'Cuisine du Terroir' (1970er)",
        answerB = "Jean-Robert Pitte in 'Gastronomie française' (1991)",
        answerC = "Auguste Escoffier in 'Le Guide Culinaire' (1903)",
        answerD = "Pierre Nora in 'Les Lieux de Mémoire' (1984) — Terroir als 'Erinnerungsort' der nationalen Identität",
        correctAnswer = 3,
        explanation = "Pierre Noras Konzept der 'Lieux de Mémoire' (Erinnerungsorte) umfasste auch regionale Lebensmittel und Küchen als Träger kollektiver Identität. Terroir ist in diesem Sinne nicht nur eine ökologische Größe, sondern ein kultureller Erinnerungsort — eine Verkörperung von Geschichte, Identität und Zugehörigkeit.",
        difficulty = 5,
        funFact = "Frankreich ist das einzige Land, das 'Gastronomische Mahlzeiten der Franzosen' (2010) zum UNESCO-Weltkulturerbe erklären ließ — Terroir als immaterielles Kulturerbe ist damit institutionell anerkannt."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Was beschreibt die 'Omnivore's Dilemma' (Michael Pollan, 2006) als fundamentales anthropologisches Problem der menschlichen Ernährung?",
        answerA = "Die Unfähigkeit, sich als Omnivore ethisch zu ernähren angesichts der industriellen Nahrungsproduktion",
        answerB = "Die psychologische Spannung zwischen Hunger und kulturellen Nahrungstabus",
        answerC = "Das evolutionäre Paradox, dass Menschen als Allesfresser ständig entscheiden müssen was sicher und nahrhaft ist — im Gegensatz zu Spezialisten-Tieren",
        answerD = "Das globale Ernährungsproblem, gleichzeitig Überfluss für Reiche und Hunger für Arme zu haben",
        correctAnswer = 2,
        explanation = "Pollan (basierend auf Paul Rozins Psychologie) beschreibt das 'Omnivore's Dilemma': Weil Menschen alles essen können, brauchen sie kulturelle Systeme (Küchen, Tabus, Regeln) um zu entscheiden was sie essen sollen — Spezialisten wie Koalas haben dieses Problem nicht. Moderne Menschen stehen vor diesem Dilemma angesichts tausender verarbeiteter Produkte ohne kulturelle Orientierung.",
        difficulty = 5,
        funFact = "Rozin nennt dies das 'Omnivore's Paradox': Allesfresser sind evolutionär flexibler, aber leiden unter Neophobia (Angst vor neuem Essen) und Neopilia (Begeisterung für Neues) gleichzeitig — eine einzigartige kognitive Last."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist 'Commensality' als anthropologisches Konzept — und welcher Soziologe erkannte sie 1910 als Fundament menschlicher Gesellschaft?",
        answerA = "Georg Simmel in 'Soziologie der Mahlzeit': Gemeinsames Essen ist die primitivste Form der Vergemeinschaftung",
        answerB = "Max Weber in 'Wirtschaft und Gesellschaft': Tischgemeinschaft definiert Klassen und Statusgruppen",
        answerC = "Émile Durkheim in 'Les formes élémentaires': Ritualmahlzeiten stärken kollektive Identität",
        answerD = "Pierre Bourdieu in 'La Distinction': Essensgewohnheiten reproduzieren sozialen Habitus",
        correctAnswer = 0,
        explanation = "Georg Simmel schrieb 1910 'Soziologie der Mahlzeit' — einer der frühesten soziologischen Texte über Essen. Er argumentierte, dass das gemeinsame Essen (Commensality, von lat. 'com mensa' = am gleichen Tisch) die primitivste, universellste Form der Vergemeinschaftung ist: Was Menschen sonst trennt, vereint die gemeinsame Mahlzeit.",
        difficulty = 5,
        funFact = "Das englische Wort 'companion' (Begleiter) kommt vom lateinischen 'com panis' (jemand, mit dem man Brot teilt) — ein etymologischer Beweis für die fundamentale Bedeutung der Tischgemeinschaft in der Sozialgeschichte."
    ),

    // ── NAHRUNG & GLOBALISIERUNG ───────────────────────────────────────────────

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Culinary Imperialism' in der Postkolonialgeschichte — und welches Land wird am häufigsten als Beispiel genannt?",
        answerA = "Die Verdrängung traditioneller Küchen durch Fast Food — USA und McDonald's als Symbol",
        answerB = "Die wirtschaftliche Abhängigkeit ehemaliger Kolonien von Nahrungsimporten der früheren Kolonialmächte",
        answerC = "Die Behauptung, eine nationale Küche sei 'überlegen' und daher weltweit zu exportieren — Frankreich und seine Haute Cuisine als normatives Ideal",
        answerD = "Die Patentierung traditioneller Rezepte und Zutaten durch westliche Lebensmittelkonzerne",
        correctAnswer = 2,
        explanation = "Culinary Imperialism bezeichnet die Durchsetzung einer kulturellen Küchenhierarchie, in der eine Küche als universell 'besser' oder 'zivilisierter' gilt. Frankreich ist das klassische Beispiel: Die französische Haute Cuisine wurde im 19.–20. Jahrhundert als internationale Norm für 'feine Küche' gesetzt — mit Auswirkungen auf Restaurantausbildung, Michelin-Kritiken und Gastronomie weltweit.",
        difficulty = 5,
        funFact = "Die UNESCO-Anerkennung von Gastronomien (Frankreich 2010, Mexiko 2010, Mittelmeerdiät 2013, japanische Washoku 2013) ist teilweise eine Reaktion auf diesen Imperialismus — ein Versuch, kulturelle Vielfalt gegen eine einzige dominante Norm zu schützen."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist 'Gastrodiplomacy' und welches Land gilt als erster und erfolgreichster Anwender dieses außenpolitischen Instruments?",
        answerA = "Frankreich, das seit dem 19. Jahrhundert seine Küche als Weichheit-Instrument in der Diplomatie einsetzt",
        answerB = "Thailand, das ab 2002 mit dem 'Global Thai'-Programm gezielt Thai-Restaurants weltweit eröffnete",
        answerC = "Japan mit seiner 'Cool Japan'-Strategie ab 2005 zur weltweiten Förderung japanischer Küche",
        answerD = "USA, die mit Fast-Food-Ketten Soft Power betreiben",
        correctAnswer = 1,
        explanation = "Thailand gilt als Pionier der modernen 'Gastrodiplomacy': Das 'Global Thai'-Programm (2002) subventionierte und förderte aktiv die weltweite Eröffnung von Thai-Restaurants — als Instrument zur Förderung von Tourismus, kulturellem Ansehen und wirtschaftlichem Einfluss. Die Zahl der Thai-Restaurants weltweit stieg von 5.500 (2002) auf über 15.000 (2011).",
        difficulty = 5,
        funFact = "Der Begriff 'Gastrodiplomacy' wurde vom Politologen Paul Rockower geprägt. Andere Länder mit aktiven Gastrodiplomacy-Programmen: Südkorea ('Hansik' Promotion), Peru, Israel und Taiwan."
    ),

    // ── NAHRUNG & RELIGION / RITUAL ───────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was ist der historische Ursprung des hinduistischen Vegetarismus — und welche philosophische Schule begründete ihn systematisch?",
        answerA = "Die vedischen Upanishaden (ca. 800 v. Chr.) betonten Ahimsa als kosmisches Prinzip, das auf Nahrung ausgedehnt wurde",
        answerB = "Kaiser Asokas Edikt (ca. 250 v. Chr.) verbot Tieropfer und damit Fleischessen im gesamten Maurya-Reich",
        answerC = "Die Jain-Philosophie (Mahavira, ca. 500 v. Chr.) und die Ahimsa-Ethik (Nicht-Schaden) sowie ihre Aufnahme durch bestimmte brahmanische Kreise",
        answerD = "Die brahmanischen Ritualregeln des Manusmriti (ca. 200 v. Chr. – 200 n. Chr.) verboten Fleischessen für obere Kasten",
        correctAnswer = 2,
        explanation = "Der Jainismus (Mahavira, ca. 599–527 v. Chr.) stellte Ahimsa (Nicht-Schaden) als absolutes ethisches Prinzip auf und entwickelte den konsequentesten Vegetarismus aller Religionen. Diese Ethik beeinflusste brahmanische Kreise, und durch die Bhakti-Bewegung verbreitete sich Vegetarismus in Teilen des Hinduismus.",
        difficulty = 5,
        funFact = "Jains sind die striktesten Vegetarier der Welt: Nicht nur kein Fleisch, sondern auch keine Wurzelgemüse (Karotten, Zwiebeln), da beim Ausreißen ganze Pflanzen sterben und Insekten verletzt werden — Ahimsa bis zur letzten Konsequenz."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was war das Agapé-Mahl in der frühen Christenheit und warum verschwand es im 4.–5. Jahrhundert?",
        answerA = "Ein rituelles Fastenmahl aus Brot und Wasser als Vorbereitung auf die Taufe",
        answerB = "Eine gemeinsame Mahlzeit der christlichen Gemeinde, die mit dem Abendmahl verbunden war und soziale Gemeinschaft betonte — sie verschwand durch Trennung von Eucharistie und gemeinsamen Mahl sowie durch Missbrauch",
        answerC = "Ein Opfermahl für verstorbene Gemeindemitglieder, das durch das Totengedächtnis ersetzt wurde",
        answerD = "Ein symbolisches Mahl, das die Speisung der 5.000 nachahmte und durch die Institutionalisierung der Kirche verboten wurde",
        correctAnswer = 1,
        explanation = "Das Agapé-Mahl (von griech. 'agape' = Liebe) war in der frühen Christenheit ein gemeinsames Gemeindemahl, das soziale Gleichheit verkörperte — Arme und Reiche aßen zusammen. Im Laufe des 4. Jahrhunderts trennte die Kirche Eucharistie (als heiliges Sakrament) von der gemeinsamen Mahlzeit; Paulus hatte bereits Missbräuche kritisiert (1 Kor 11).",
        difficulty = 5,
        funFact = "Das Agapé-Mahl war eines der frühesten bekannten Praktiken sozialer Gleichheit durch Tischgemeinschaft — Sklaven und freie Bürger aßen gemeinsam. Diese Radikalität war ein Teil der sozialen Sprengkraft des frühen Christentums."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was verstand die mittelalterliche Medizin unter der 'Humoralpathologie' im Kontext von Nahrung — und welche Konsequenzen hatte das für die Küche?",
        answerA = "Nahrungsmittel wurden nach ihrer Heilwirkung auf Infektionskrankheiten klassifiziert, was Kräuterküchen entstehen ließ",
        answerB = "Gewürze wurden als Gegenmittel gegen Pest und Infektionskrankheiten angesehen, was ihren hohen Preis rechtfertigte",
        answerC = "Essen wurde nach vier Qualitäten (heiß/kalt, feucht/trocken) eingeteilt und sollte die Körpersäfte (Blut, Schleim, gelbe und schwarze Galle) ausbalancieren",
        answerD = "Fleischkonsum war nach Beruf und Stand geregelt: Ritter durften mehr essen als Bauern, da sie mehr Körperwärme benötigten",
        correctAnswer = 2,
        explanation = "Die auf Hippokrates und Galen basierende Humoralpathologie teilte Nahrungsmittel nach den Qualitäten heiß/kalt und feucht/trocken ein. Pfeffer war 'heiß und trocken', Gurke 'kalt und feucht'. Ein guter Koch musste diese Qualitäten ausbalancieren, um die vier Körpersäfte zu harmonisieren — diese medizinische Theorie prägte die mittelalterliche Küche grundlegend.",
        difficulty = 5,
        funFact = "Rote Weine galten als 'heiß' und wurden verdünnt mit Wasser getrunken; Melone galt als 'kalt und feucht' und wurde daher in Italien traditionell mit Prosciutto (heiß und trocken) kombiniert — ein humoralpathologisch begründetes Paar, das kulinarisch bis heute überlebt hat."
    ),

    // ── LEBENSMITTEL & INDUSTRIALISIERUNG ────────────────────────────────────

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was war die 'Meatpacking Revolution' in Chicago (1860–1900) und welchen globalen Einfluss hatte sie auf die Nahrungsmittelproduktion?",
        answerA = "Die erste industrielle Fließbandproduktion von Fleisch durch Gustavus Swift und Philip Armour, die mit Kühltransport die weltweite Fleischversorgung industrialisierte",
        answerB = "Die Einführung von Hygienegesetzen nach dem Skandal durch Upton Sinclairs 'The Jungle' (1906)",
        answerC = "Die Erfindung der Konservierung durch Kochsalzlake, die Exportfleisch nach Europa ermöglichte",
        answerD = "Der erste Streik in der Nahrungsmittelindustrie, der zur Einführung von Mindestlöhnen führte",
        correctAnswer = 0,
        explanation = "Gustavus Swift erfand 1878 den Kühlwagon-Transport und Philip Armour entwickelte das Fließband-Schlachtsystem ('Disassembly Line') in Chicago's Union Stock Yards. Dies industrialisierte die Fleischproduktion — mit Kühlwagen konnten Schlachttiere zentral in Chicago verarbeitet und per Bahn in alle USA und per Schiff nach Europa exportiert werden.",
        difficulty = 5,
        funFact = "Henry Ford ließ sich direkt von Chicagos Meat Disassembly Line zu seinem Auto-Fließband inspirieren — die industrielle Nahrungsmittelproduktion war das Vorbild für die gesamte moderne Massenfertigung."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was war die 'Green Revolution' (Grüne Revolution, 1940–1970) und welche anthropologische Kontroverse umgibt sie bis heute?",
        answerA = "Die Einführung von Ökolandbau als Reaktion auf Pestizidrückstände in Nahrungsmitteln",
        answerB = "Die globale Verbreitung von Vegetarismus als Alternative zur ressourcenintensiven Viehzucht",
        answerC = "Die Einführung von GMO-Pflanzen in Entwicklungsländern durch die Rockefeller-Foundation",
        answerD = "Die Entwicklung hochertragender Weizen- und Reissorten durch Norman Borlaug u.a., die Milliarden von Hungertod rettete — aber auch traditionelle Landwirtschaft, Biodiversität und kleinbäuerliche Strukturen zerstörte",
        correctAnswer = 3,
        explanation = "Norman Borlaugs hochertragende Zwergweizensorten (Nobelpreis 1970) retteten laut Schätzungen eine Milliarde Menschen vor dem Hungertod. Die Kontroverse: Die Grüne Revolution erforderte massive Mengen an synthetischen Düngern, Pestiziden und Bewässerung, verdrängte lokale Sorten (Biodiversitätsverlust) und ruinierte kleinbäuerliche Strukturen zugunsten industrieller Landwirtschaft.",
        difficulty = 5,
        funFact = "Borlaug selbst warnte in seiner Nobelpreisrede, die Grüne Revolution sei 'eine vorübergehende Atempause' — die Bevölkerung wachse schneller als die Ernährungsgewinne. Er bezeichnete Familienplanung als ebenso wichtig wie Agrartechnologie."
    ),

    // ── GASTRONOMISCHE AVANTGARDE ─────────────────────────────────────────────

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist 'Molecular Gastronomy' und wer sind ihre wissenschaftlichen Begründer — im Gegensatz zu den Küchenchefs, die sie popularisierten?",
        answerA = "Heston Blumenthal und Ferran Adrià entwickelten sie in den 1990ern als eigenständige Kochtechnik ohne wissenschaftliche Basis",
        answerB = "Hervé This (Chemiker) und Nicholas Kurti (Physiker) prägten 1988 den Begriff und die wissenschaftliche Disziplin; Adrià, Blumenthal und Grant Achatz popularisierten sie in Restaurants",
        answerC = "Harold McGee entwickelte die Wissenschaft des Kochens und nannte sie Molecular Gastronomy in 'On Food and Cooking' (1984)",
        answerD = "Auguste Escoffier begründete sie durch seine systematische Kochchemie im Ritz Paris (1898)",
        correctAnswer = 1,
        explanation = "Der Physiker Nicholas Kurti und Chemiker Hervé This prägten 1988 den Begriff 'Molecular and Physical Gastronomy' für die wissenschaftliche Untersuchung der physikalisch-chemischen Prozesse beim Kochen. Ferran Adrià (elBulli), Heston Blumenthal (The Fat Duck) und Grant Achatz (Alinea) wandten diese Wissenschaft kreativ in ihren Restaurants an.",
        difficulty = 5,
        funFact = "Kurti hielt 1969 einen legendären Vortrag bei der Royal Institution: 'The physicist in the kitchen' — mit der berühmten Klage: 'It is a sad reflection that we know more about the temperature inside stars than inside a soufflé.'"
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Slow Food' als Gegenbewegung — wo wurde es gegründet und durch welchen konkreten Auslöser?",
        answerA = "In Frankreich 1971, ausgelöst durch die Schließung regionaler Märkte durch EU-Handelsregeln",
        answerB = "In den USA 1992 durch Michael Pollan, als Reaktion auf die erste McDonald's-Kritik durch Eric Schlosser",
        answerC = "In Deutschland 1983 durch Alice Waters, als Reaktion auf die Industrialisierung des Bäckerhandwerks",
        answerD = "In Italien 1989 durch Carlo Petrini, ausgelöst durch die Eröffnung eines McDonald's an der Spanischen Treppe in Rom 1986",
        correctAnswer = 3,
        explanation = "Carlo Petrini gründete Slow Food 1989 in Paris als internationale Organisation, nachdem die geplante Eröffnung eines McDonald's an der Spanischen Treppe in Rom 1986 eine heftige öffentliche Debatte ausgelöst hatte. Slow Food propagiert regionale Küchen, Biodiversität, traditionelle Produktionsmethoden und Tischkultur als Gegenpol zur Fastfood-Globalisierung.",
        difficulty = 5,
        funFact = "Slow Food betreibt die 'Ark of Taste' (Arche des Geschmacks) — eine Datenbank von über 5.000 bedrohten traditionellen Lebensmitteln weltweit, von alten Apfelsorten bis zu aussterbenden Viehrassen, die vor dem Verschwinden bewahrt werden sollen."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was ist der kulinarisch-historische Unterschied zwischen 'Nouvelle Cuisine' (1960er/70er) und klassischer Haute Cuisine?",
        answerA = "Nouvelle Cuisine ersetzte schwere Saucen durch leichte Zubereitungen, verwendete frische Zutaten statt langer Lagerung, und präsentierte kleine Portionen als Kunstwerk",
        answerB = "Nouvelle Cuisine war die erste Küche, die internationale Zutaten einbezog und damit den französischen Nationalismus in der Gastronomie brach",
        answerC = "Nouvelle Cuisine führte erstmals vegetarische Alternativen in gehobene Restaurants ein",
        answerD = "Nouvelle Cuisine standardisierte Kochzeiten durch den ersten Einsatz von Thermometern in professionellen Küchen",
        correctAnswer = 0,
        explanation = "Die von Henri Gault und Christian Millau propagierte Nouvelle Cuisine (Paul Bocuse, Michel Guérard, Frères Troisgros) reagierte auf Escoffiers schwere Muttersaucen: kurze Garzeiten, Dampfgaren, leichte Vinaigretten statt Buttersaucen, minimale Portionen als visuelle Kunstwerke, Betonung der Eigenqualität frischer Produkte.",
        difficulty = 5,
        funFact = "Der Begriff 'Nouvelle Cuisine' wurde 1973 von den Journalisten Gault und Millau geprägt, die damit eine Auszeichnung für Bocuse und andere Köche kombinierten. Der Gault-Millau-Führer wurde dadurch zum mächtigen Konkurrenten des Michelin-Führers."
    ),

    // ── SPEZIFISCHE NAHRUNGSGESCHICHTE ────────────────────────────────────────

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welche historische Rolle spielte die 'Via Salaria' in der Antike — und was ist der etymologische Zusammenhang zum modernen Begriff 'Gehalt'?",
        answerA = "Eine ägyptische Opferroute, auf der Salz als Göttergeschenk zum Nil getragen wurde",
        answerB = "Ein altbabylonischer Handelsweg für Salz aus dem Persischen Golf nach Mesopotamien",
        answerC = "Die Salzstraße im antiken Rom, die Salz in die Stadt führte; 'Salarium' (Salz-Ration an Soldaten) ist der Ursprung des englischen Wortes 'salary'",
        answerD = "Der erste regulierte Handelsweg der Phönizier, der Salz gegen Gewürze tauschte",
        correctAnswer = 2,
        explanation = "Die Via Salaria (Salzstraße) war eine der ältesten Straßen Roms, die Salz aus den Salinæ (Salinen) bei Ostia nach Rom transportierte. Das lateinische 'Salarium' (Salzzuteilung an Soldaten) ist der Ursprung des englischen Wortes 'salary' (Gehalt) — Salz als Zahlungsmittel.",
        difficulty = 5,
        funFact = "Salz war so wertvoll, dass es weltweit als Währung diente: Im Äthiopien des 19. Jahrhunderts wurden Amole-Salzbarren als Währung genutzt; in Tibet dienten Salzziegel noch im 20. Jahrhundert als Tauschmittel."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Was war der historische Kontext der 'Boston Tea Party' (1773) und welche langfristigen kulinarischen Konsequenzen hatte das Ereignis für die amerikanische Trinkkultur?",
        answerA = "Der britische Steuersatz auf Tee trieb Kolonisten zum Protest; Amerika entwickelte sich anschließend zur Kaffeenation, da Teetrinken als unpatriotisch galt",
        answerB = "Das Ereignis hatte keine kulturellen Folgen — Amerika wurde trotzdem zur Tee-Nation",
        answerC = "Das Ereignis hatte keine kulturellen Folgen — Amerika wurde trotzdem zur Tee-Nation",
        answerD = "Der Import von giftigem Tee aus Indien wurde vermutet; danach entwickelten sich Kräutertees als Alternative",
        correctAnswer = 0,
        explanation = "Die Boston Tea Party (1773) war Protest gegen den Tea Act, der der British East India Company Monopolvorteile gab. Nach der Unabhängigkeit wurde Kaffeetrinken zum patriotischen Akt — Tee galt als britisches Symbol. Dies erklärt, warum die USA eine der weltweit kaffeelastigsten Nationen sind, obwohl Europa teetrinkt.",
        difficulty = 5,
        funFact = "In der kolonialen Zeit vor 1773 war Amerika eine der größten Teekonsumgesellschaften der Welt — der politische Wandel von 1776 veränderte buchstäblich, was Menschen tranken, was zeigt, wie tief Politik und Kulinargeschichte verflochten sind."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "In welchen alten Kulturen außerhalb Japans existierten ähnliche Umami-Konzentrate wie das japanische Garum — und was verbindet sie alle?",
        answerA = "Nur in asiatischen Kulturen (Japan, China, Korea) — westliche Küchen entwickelten kein Umami-Konzept",
        answerB = "Nur Frankreich und seine 'Fond'-Tradition repräsentieren ein ähnliches Konzept",
        answerC = "Nur im japanischen Dashi-System — Umami-Konzentrate sind kulturspezifisch japanisch",
        answerD = "Garum (Rom), Nuoc Mam (Vietnam), Murri (mittelalterliches Arabien) und Worcestershire Sauce (England) — alle nutzen Fermentation zur Umami-Konzentration",
        correctAnswer = 3,
        explanation = "Das Umami-Konzept — konzentrierte herzhafte Würze durch Fermentation — erscheint weltweit: Garum (fermentierte Fischsauce des antiken Roms), Nuoc Mam und Fish Sauce in Südostasien, Murri (fermentiertes Gersten-Gewürz im mittelalterlichen arabischen Raum), Worcestershire Sauce (mit Sardellen). Menschen haben unabhängig voneinander diese Umami-Konzentration entdeckt.",
        difficulty = 5,
        funFact = "Fermentierte Fischsaucen sind möglicherweise die älteste 'Industrieküche' der Geschichte — Garum-Produktionsstätten in Pompeji hatten industrielle Kapazitäten, und Amphoren voller Garum wurden von Nordafrika bis Britannien transportiert."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Creolization' (Kreolisierung) im kulinarischen Kontext — und in welcher Region entstand Kreolküche als Paradebeispiel?",
        answerA = "Die Entwicklung einer Hochküche in ehemaligen Kolonien, die europäische Techniken mit einheimischen Produkten verband",
        answerB = "Die Entstehung von Fusionsküche durch Migration in Einwanderungsländer wie Brasilien und Argentinien",
        answerC = "Die kulinarische Fusion aus westafrikanischen, europäischen (französisch/spanisch) und indigenen amerikanischen Einflüssen, die in der Karibik und Louisiana entstand",
        answerD = "Die Verschmelzung europäischer Hotelküche mit regionalen Zutaten in tropischen Kolonien",
        correctAnswer = 2,
        explanation = "Kreolisierung bezeichnet die kreative Fusion von Kulturen unter Kolonialbedingungen: In Louisiana und der Karibik vermischten sich westafrikanische Kochtechniken (Okra, Schwarzaugen-Bohnen, One-Pot-Cooking), europäische Zutaten und Zubereitungen sowie indigene Pflanzen zur Kreolküche — eine der reichsten Fusionenküchen der Welt.",
        difficulty = 5,
        funFact = "Gumbo — das Nationalgericht Louisianas — verkörpert Kreolisierung perfekt: 'Gumbo' kommt von 'ki ngombo' (Okra) in der Sprache der Kongo-Völker; die Roux ist französisch; Filé Powder kommt von den Choctaw-Indianern; Garnelen und Austern aus dem Golf von Mexiko."
    ),

    // ── NAHRUNG, KRISE UND WANDEL ─────────────────────────────────────────────

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was war die 'Ancel Keys Diet Controversy' und welchen langfristigen Einfluss hatte sie auf die globale Ernährungspolitik?",
        answerA = "Keys' 'Seven Countries Study' verknüpfte tierische Fette mit Herzerkrankungen; die resultierende Anti-Fett-Politik der WHO führte jahrzehntelang zu kohlenhydratreicher Ernährungsempfehlung",
        answerB = "Keys erfand die K-Rations (Militärnahrung im 2. WK) und beeinflusste damit die Standardisierung von Fertignahrung",
        answerC = "Keys Studie bewies, dass Mediterrane Ernährung Krebs verhindert und führte zur Mittelmeerdiät-Propagierung",
        answerD = "Keys Forschung über Hungerstoffwechsel veränderte die Ernährungstherapie für Anorexia-Patienten",
        correctAnswer = 0,
        explanation = "Ancel Keys' 'Seven Countries Study' (1958) korrelierte tierisches Fett mit Herzerkrankungen. Dies führte zu Jahrzehnten globaler 'Low-Fat'-Ernährungsempfehlungen. Kritiker werfen Keys vor, Daten selektiert zu haben (er untersuchte ursprünglich 22 Länder, publizierte nur 7). Die Zuckerindustrie finanzierte zudem Keys-freundliche Forschung — eine der größten Wissenschaftskontroversen der Ernährungsgeschichte.",
        difficulty = 5,
        funFact = "Als die Low-Fat-Empfehlungen zu mehr Zuckerkonsum führten (Fett wurde durch Zucker ersetzt), stieg Adipositas global an — was manche Historiker als unbeabsichtigte Folge der Keys-Kontroverse sehen."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was zeigte Ökonom Amartya Sen in seiner Analyse der 'Great Bengal Famine' (1943) über die wahren Ursachen von Hungersnöten?",
        answerA = "Eine natürliche Hungersnot durch Missernte, bei der Großbritannien die schnellste Hilfe aller Kolonien leistete",
        answerB = "Eine von Japan verursachte Hungersnot durch die Besetzung Burmas und damit die Unterbrechung des Reisimports",
        answerC = "Eine durch Dürre und Überschwemmung gleichzeitig verursachte Naturkatastrophe, ohne menschliche Mitschuld",
        answerD = "Hungersnöte entstehen nicht durch Nahrungsmangel allein, sondern durch Verteilungsversagen — koloniale Kriegspolitik, Preisspekulation und Exportkontinuität verursachten 2–3 Millionen Tote trotz ausreichender Nahrung",
        correctAnswer = 3,
        explanation = "Ökonom Amartya Sen zeigte in 'Poverty and Famines' (1981), dass die Bengal-Hungersnot keine reine Naturkatastrophe war: Die Reisproduktion 1943 war nicht deutlich schlechter als in Normaljahren. Kriegspolitik (Nahrungslieferungen für Truppen), Exporte aus Indien trotz Hunger, Preisspekulation und Churchill-Regierungsversagen töteten 2–3 Millionen Menschen.",
        difficulty = 5,
        funFact = "Sen's Analyse begründete eine revolutionäre These: 'Democracies don't have famines' — in Demokratien mit freier Presse werden Hungersnöte politisch unmöglich, weil öffentlicher Druck sofortige Reaktion erzwingt. Fast alle großen Hungersnöte des 20. Jahrhunderts ereigneten sich in Diktaturen."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist 'Food Sovereignty' als politisches Konzept — und welche internationale Bauernbewegung prägte diesen Begriff?",
        answerA = "Das Recht der Nationen, ihre Nahrungsimporte durch Zölle zu schützen — entwickelt von der WTO als Ausnahmebestimmung für Entwicklungsländer",
        answerB = "Ein EU-Konzept für die Absicherung europäischer Grundnahrungsversorgung gegen geopolitische Abhängigkeiten",
        answerC = "Das Konzept der nationalen Nahrungsautarkie — von Hugo Chávez in Venezuela zum Staatsprinzip erhoben",
        answerD = "La Via Campesina (gegründet 1993) prägte den Begriff: Das Recht von Völkern, ihre eigene Nahrungspolitik demokratisch zu gestalten, lokale Märkte zu schützen und Saatgut zu kontrollieren",
        correctAnswer = 3,
        explanation = "La Via Campesina (Weg der Bauern), ein globales Netzwerk kleinbäuerlicher Organisationen, prägte 1996 den Begriff 'Food Sovereignty': das Recht von Völkern, ihre eigene Nahrungspolitik zu bestimmen — im Gegensatz zu 'Food Security' (bloße Verfügbarkeit), das auch durch Import-Abhängigkeit erfüllt sein kann.",
        difficulty = 5,
        funFact = "Food Sovereignty war direkt gegen WTO und GATT gerichtet: La Via Campesina argumentiert, freier Nahrungsmittelhandel zerstört kleinbäuerliche Strukturen weltweit, da billiges Subventionsgetreide aus USA und EU lokale Märkte untergräbt — was langfristig mehr Nahrungsunsicherheit schafft."
    ),

    // ── TIEFSINNIGE NAHRUNGSGESCHICHTE ────────────────────────────────────────

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was beschreibt Richard Wrangham's 'Cooking Hypothesis' (2009) als evolutionären Wendepunkt in der Menschheitsgeschichte?",
        answerA = "Kochen ermöglichte die Domestizierung von Tieren, weil gegrilltes Fleisch Hunde anlockte",
        answerB = "Die Kontrolle des Feuers ermöglichte die Besiedlung kalter Klimazonen und damit die globale Ausbreitung des Homo sapiens",
        answerC = "Das Kochen von Nahrung erhöhte die Kalorienausbeute, was die Evolution des großen menschlichen Gehirns ermöglichte — Kochen machte uns buchstäblich zu Menschen",
        answerD = "Kochen über Feuer war das erste soziale Gemeinschaftserlebnis, das Familienstrukturen und Sprache entstehen ließ",
        correctAnswer = 2,
        explanation = "Richard Wranghams 'Catching Fire: How Cooking Made Us Human' (2009) argumentiert: Kochen erhöht die Kalorienausbeute aus Nahrung drastisch (gekochte Stärke ist 30–98% effizienter verdaubar). Dies erlaubte weniger Zeit zur Nahrungssuche, kleinere Verdauungsorgane und mehr Energie für Gehirnentwicklung — Kochen machte uns buchstäblich zu Menschen.",
        difficulty = 5,
        funFact = "Wrangham schätzt, dass Homo erectus vor ca. 1,8 Millionen Jahren regelmäßig kochte — seine anatomischen Veränderungen (kleinerer Kiefer, kleinerer Darm, größeres Gehirn) deuten darauf hin, weit früher als archäologische Feuerstellen (ca. 400.000 Jahre alt) belegen."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist 'Foodways' als wissenschaftliches Konzept der amerikanischen Folkloristik und Anthropologie?",
        answerA = "Die Handelsrouten (Foodways = Nahrungswege), über die Lebensmittel historisch transportiert wurden",
        answerB = "Das Gesamtsystem der kulturellen Praktiken rund ums Essen: Beschaffung, Zubereitung, Tischkultur, Rituale und Bedeutungen, die eine Gruppe mit Nahrung verbindet",
        answerC = "Die ernährungsphysiologischen Wege, auf denen Nährstoffe im Körper verarbeitet werden",
        answerD = "Ernährungsrichtlinien (Dietary Guidelines) staatlicher Gesundheitsbehörden",
        correctAnswer = 1,
        explanation = "'Foodways' bezeichnet das ganzheitliche kulturelle System einer Gemeinschaft in Bezug auf Nahrung: Was gegessen wird und was nicht, wie Nahrung beschafft, zubereitet und gegessen wird, welche sozialen und religiösen Bedeutungen damit verbunden sind. Der Begriff wurde von Jay Anderson geprägt und ist ein Kernkonzept der amerikanischen Folkloristik und Kulturanthropologie.",
        difficulty = 5,
        funFact = "Das Southern Foodways Alliance (gegründet 1999) dokumentiert systematisch die Foodways des amerikanischen Südens — als lebendiges kulturelles Erbe, das afroamerikanische, europäische und indigene Traditionen vereint."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Wer war Sylvester Graham und welche kulinarische Erfindung geht auf seine Ernährungsreformbewegung zurück?",
        answerA = "Ein amerikanischer Prediger, der gegen Weißbrot und 'stimulierende' Nahrung predigte — er erfand den Graham-Cracker als gesunde Vollkornalternative",
        answerB = "Max Bircher-Benner, der das Birchermüsli als Gegenstück zu industriellem Weißbrot für Sanatoriumspatienten entwickelte",
        answerC = "John Harvey Kellogg, der in seinem Battle Creek Sanatorium Weißbrot verbot und Vollkorngetreide als Heilmittel propagierte",
        answerD = "Die britische Anti-Adulteration-Bewegung, die gegen das Beimischen von Kreide und Knochen zu Weißmehl durch Bäcker kämpfte",
        correctAnswer = 0,
        explanation = "Sylvester Graham (1794–1851), amerikanischer Prediger und Ernährungsreformer, entwickelte eine Vollkornernährungstheorie, bei der Weißbrot als 'künstliche' Nahrung galt, die das Nervensystem schwäche. Er erfand den Graham-Cracker als gesunde Alternative. Seine Ideen beeinflussten die gesamte Gesundheitsreformbewegung des 19. Jahrhunderts.",
        difficulty = 5,
        funFact = "Graham argumentierte, dass 'stimulierende' Nahrungsmittel (Fleisch, Weißbrot, Gewürze, Kaffee) sexuelle Gelüste weckten — seine Vollkorn-Diät sollte moralische Reinheit durch Nahrungsaskese fördern. Kellogg folgte dieser Logik mit seiner Anti-Fleisch- und Anti-Masturbations-Gesundheitsküche."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist der historische Ursprung des Begriffs 'Restaurant' — und wer eröffnete das erste Restaurant im heutigen Sinne in Paris?",
        answerA = "Der Begriff kommt von französisch 'restaurer' (wiederherstellen); Boulanger eröffnete 1765 in Paris das erste Lokal, das stärkende Brühen ('restaurants') als Heilmittel verkaufte",
        answerB = "Der Begriff entstand nach der Französischen Revolution, als Hofköche entlassener Adliger eigene Lokale eröffneten",
        answerC = "Der erste 'Restaurateur' war Antoine Beauvilliers, der 1782 das Konzept des festen Menüs einführte",
        answerD = "Der Begriff kommt vom lateinischen 'restauratio'; Cafés in Wien entwickelten 1683 das erste vollständige Restaurantkonzept",
        correctAnswer = 0,
        explanation = "Monsieur Boulanger eröffnete 1765 in Paris ein Lokal, das 'restaurants' (von frz. 'restaurer' = wiederherstellen) verkaufte: kräftige Fleischbrühen, die die Kräfte wiederherstellen sollten. Dies unterschied sich von Tavernen (feste Menüs zu festen Zeiten) — Gäste konnten aus einer Speisekarte wählen. Das moderne Restaurantkonzept mit Wahl à la carte entstand.",
        difficulty = 5,
        funFact = "Die Französische Revolution 1789 beförderte das Restaurantwesen: Hofköche des Adels verloren ihre Stelle und eröffneten eigene Lokale. Von ca. 100 Restaurants in Paris 1789 stieg die Zahl auf über 500 bis 1804 — eine direkte Folge des politischen Wandels."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Was ist die anthropologische These des 'Cooking as Control' — und welche feministischen Wissenschaftlerinnen entwickelten sie als Kritik an der traditionellen Küchenarbeit?",
        answerA = "Betty Friedan in 'The Feminine Mystique' (1963): Kochen als Symbol der Unterdrückung der Frau in der Nachkriegsgesellschaft",
        answerB = "Ann Oakley in 'The Sociology of Housework' (1974): Küchenarbeit ist unbezahlte Lohnarbeit, die das BIP unterschätzt",
        answerC = "Carole Counihan und Sherrie Inness (1990er–2000er): Kochen ist ambivalent — einerseits Kontrolle und Identität für Frauen, andererseits strukturelle Einschränkung auf die private Sphäre",
        answerD = "Simone de Beauvoir in 'Das andere Geschlecht' (1949): Kochen als Wiederholung ohne Schöpfung, das Frauen im Alltag gefangen hält",
        correctAnswer = 2,
        explanation = "Carole Counihan ('The Anthropology of Food and Body', 1999) und Sherrie Inness ('Kitchen Culture in America', 2001) entwickelten die ambivalente These: Kochen gibt Frauen Kontrolle, Identität und Ausdruck (Ernährer der Familie), ist aber gleichzeitig strukturell auf die private Sphäre begrenzt und gesellschaftlich unsichtbar (unbezahlt, wenig wertgeschätzt). Diese Ambivalenz erklärt, warum Frauen häufig kochen, aber professionelle Spitzenköche überwiegend Männer sind.",
        difficulty = 5,
        funFact = "Obwohl Frauen weltweit ca. 80% der häuslichen Kocharbeit leisten, sind in den Top 50 Restaurants der World's 50 Best Restaurants nur ca. 15% Chefköchinnen — die sogenannte 'Glass Ceiling of Gastronomy'."
    )

)
