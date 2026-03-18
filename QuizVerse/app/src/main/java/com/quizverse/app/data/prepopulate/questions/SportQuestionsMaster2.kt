package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsMaster2(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) ── 50 questions ──────────────────────────────

    // ── Sportanthropologie (10) ───────────────────────────────────────────────

    // Question 1 – Sport anthropology: Yanomami archery grip
    Question(
        categoryId = 6,
        questionText = "Welche einzigartige Besonderheit zeigt die Bogenschutz-Technik der Yanomami (Amazonas) im Vergleich zu euroasiatischen Bogenschiessen-Traditionen, die Sportanthropologen als kulturell determinierte Motorik klassifizieren?",
        answerA = "Die Yanomami verwenden ausschliesslich den Daumen als Zugoption (Mongolian draw) wie zentralasiatische Reiter",
        answerB = "Sie halten den Bogen horizontal statt vertikal und schliessen dabei beide Augen gleichzeitig",
        answerC = "Sie schliessen das dominante Auge beim Zielen, waehrend euroasiatische Schiessen das nicht-dominante Auge schliessen",
        answerD = "Sie nutzen einen Split-Finger-Draw mit vier Fingern, was biomechanisch keine Vorteile bietet",
        correctAnswer = 1,
        explanation = "Sportanthropologische Feldstudien (Henrich et al.) dokumentierten, dass Yanomami-Schiessen den Bogen bei horizontaler Haltung abfeuern und dabei beide Augen schliessen, was in westlichen Systemen als 'Fehler' gilt, aber in ihrer Jagdpraxis auf kurze Distanzen funktional ist. Diese Motorik ist kulturell erworben, nicht angeboren.",
        difficulty = 5,
        funFact = "Der Begriff 'kulturell determinierte Motorik' wurde vom deutschen Ethnomotoriker Henning Eichberg gepraeagt, der argumentierte, dass selbst vermeintlich universelle Bewegungen wie Laufen kulturspezifische Muster tragen – z.B. unterscheiden sich Gangrhythmen zwischen Industriegesellschaften und Subsistenzvoelkern messbar."
    ),

    // Question 2 – Sport anthropology: Maori haka function
    Question(
        categoryId = 6,
        questionText = "Welche anthropologische Funktion hat der Haka der Maori bei Sport-Wettkaempfen aus Sicht der kulturellen Kinesik, die ihn von blossem Ritual-Theater unterscheidet?",
        answerA = "Reine Einschuechterungsstrategie ohne rituellen Bezug, vergleichbar mit Trash-Talk in der NBA",
        answerB = "Synchronisierte Gruppenphysiologie (heart-rate entrainment) und kollektive Identitaetsmarkierung als praekompetitive Stressregulation",
        answerC = "Religioeser Gebet-Akt an Tane, dem Maori-Gott des Sports, ohne psychophysiologische Wirkung",
        answerD = "Ausdauertest des Gegners, der durch die Dauer des Haka eingeschuchtert werden soll",
        correctAnswer = 1,
        explanation = "Forschungen der Auckland-Universität zeigten, dass synchrones Haka-Ausfuehren messbar Kortisolspiegel senkt und Herzraten-Synchronisierung (heart-rate entrainment) im Team foerdert. Diese kollektive Physiologie-Regulation ist eine echte praekompetitive Funktion, nicht nur Symbolismus.",
        difficulty = 5,
        funFact = "Das All-Blacks-Team der Rugby-Nationalmannschaft Neuseelands fuehrte 1905 erstmals einen Haka vor einem internationalen Spiel auf. Gegner beschwerten sich, dass die Synchronizitaet des Haka tatsaechlich Angst ausloest – eine psychologische Wirkung, die Sportwissenschaftler 2017 im Journal of Sport Psychology bestaetigten."
    ),

    // Question 3 – Sport anthropology: Sepak Takraw origins
    Question(
        categoryId = 6,
        questionText = "Welches anthropologische Phänomen erklärt, warum Sepak Takraw (Korbball mit dem Fuss) nahezu zeitgleich und unabhaengig in Thailand, Malaysia, Myanmar und auf den Philippinen entstand?",
        answerA = "Diffusion durch arabische Haendler, die das Spiel entlang der Gewuerzhandelsrouten verbreiteten",
        answerB = "Konvergente Kulturentwicklung durch gleiche oekologische Bedingungen: Rattan als Rohmaterial und knappe Landflaechen foerderten Geschicklichkeitsspiele ohne Koerperkontakt",
        answerC = "Genetisch bedingte Praefeaerenz suedostasiatischer Voelker fuer Fussbetonte Koordination",
        answerD = "Ausbreitung durch buddhistische Moenche, die das Spiel als Meditationsuebung foerderten",
        correctAnswer = 1,
        explanation = "Ethnomotorische Analysen (Blanchard & Cheska, 1985) erklaeren die parallele Entstehung durch Konvergenz: Rattan ist in ganz Suedostasien abundantes Material, und verdichtete Siedlungsstrukturen foerderten Spiele mit minimalem Platzbedarf. Aehnlich wie Polynesier unabhaengig Kanus entwickelten, loesten verschiedene Kulturen das gleiche Problem mit dem gleichen Material.",
        difficulty = 5,
        funFact = "Ein Sepak-Takraw-Ball aus geflochtenem Rattan hat bis zu 12 Meter Flugbahn bei einem Kick und haelt mehrere tausend Treffer aus. Moderne Wettkampfbaelle muessen ein Gewicht von 150-180 g und einen Umfang von 42-44 cm haben – Normen, die die ISTAF erst 1965 standardisierte."
    ),

    // Question 4 – Sport anthropology: Tarahumara ultrarunning
    Question(
        categoryId = 6,
        questionText = "Was unterscheidet die Raramuri (Tarahumara) Lauftechnik biomechanisch-anthropologisch am stärksten von trainierter westlicher Lauftechnik, laut der Studie von Lieberman et al. (2010) in Nature?",
        answerA = "Raramuri laufen mit extremem Vorfussaufsatz und hoher Kadenz, waehrend Schuhtraeger aus dem Westen dominierend fersenaufsetzen",
        answerB = "Sie verwenden ausschliesslich Zehenlauf (digitigrade locomotion) mit gestreckten Kniegelenken",
        answerC = "Ihre Schrittlaenge ist dreimal groesser als bei westlichen Laeufen, was fuer grosse Strecken effizienter ist",
        answerD = "Sie laufen mit rueckwaerts geneigtem Koerper und erhoehtem Armeinsatz, was Bergabsektionen beschleunigt",
        correctAnswer = 0,
        explanation = "Liebermans Harvard-Studie zeigte, dass barfuss-laufende Raramuri bevorzugt auf dem Mittel- oder Vorfuss aufsetzen, was den Aufprallstoss (impact transient) um bis zu 50% reduziert gegenueber Fersenaufsatz. Dies erklaert teilweise ihre aussergewoehnliche Verletzungsresistenz bei Laeufen von 160+ km.",
        difficulty = 5,
        funFact = "Die Raramuri veranstalten traditionelle Laufwettkaeampe namens Rarjipari (Maenner kicken einen Holzball) und Ariweta (Frauen werfen einen Ring mit einem Stock). Diese koennen 24-48 Stunden dauern und ueber 150 km Strecke fuehren – Distanzen, die selbst elite-Ultramarathonlaeufer erschoepfen wuerden."
    ),

    // Question 5 – Sport anthropology: Inuit games
    Question(
        categoryId = 6,
        questionText = "Welches Prinzip liegt den traditionellen arktischen Winterspielen (Arctic Winter Games) zugrunde, das sich fundamental von westlichen Wettkampfprinzipien unterscheidet?",
        answerA = "Absolute Punktemaximierung und Ausschluss von Verlierern, identisch zu olympischen Prinzipien",
        answerB = "Kooperative Leistungssteigerung: Sieger helfen Verlierer bei der Wiederholung, Ziel ist kollektive Verbesserung nicht individuelle Dominanz",
        answerC = "Spirituelle Kommunikation mit Ahnengeistern durch bestimmte Bewegungssequenzen ohne Leistungselement",
        answerD = "Schmerztoleranztests als soziales Selektionskriterium fuer Jagdtauglichkeit",
        correctAnswer = 1,
        explanation = "Anthropologische Studien von Blanchard (1995) zeigten, dass traditionelle Inuit-Spiele wie das One-Foot High Kick oder Two-Foot High Kick kollektiv orientiert sind: Sobald ein Teilnehmer eine Hoehe schafft, helfen andere, diese ebenfalls zu erreichen. Dieser Ethos steht im Gegensatz zu westlichem Ausgrenzungs-Wettbewerb.",
        difficulty = 5,
        funFact = "Beim One-Foot High Kick muss der Athlet mit einem Fuss abspringen, einen haengenden Gegenstand mit demselben Fuss treffen und auf demselben Fuss landen. Der Weltrekord liegt bei 2,97 m Hoehe – ein Wert, der bei westlichen Hochspringwettkämpfen kompetitiv waere, aber voellig anders trainiert wird."
    ),

    // Question 6 – Sport anthropology: Capoeira disguise thesis
    Question(
        categoryId = 6,
        questionText = "Welche kulturanthropologische Kontroverse umgibt die 'Verkleidungsthese' des brasilianischen Capoeira?",
        answerA = "Die These, dass Capoeira von versklavten Afrikanern als Kampfkunst verkleidet als Tanz entwickelt wurde, wird von neuerer Geschichtsforschung als romantische Nachrationalisierung des 20. Jahrhunderts bezweifelt",
        answerB = "Die Debatte, ob Capoeira urspruenglich aus Angola (Capoeira Angola) oder aus Brasilien (Capoeira Regional) stammt, ist wissenschaftlich eindeutig zu Gunsten Angolas entschieden",
        answerC = "Die gesicherte Tatsache, dass Capoeira als religioeser Tanz der Candomble-Tradition entstand und erst im 20. Jahrhundert als Kampfkunst umgedeutet wurde",
        answerD = "Der Streit, ob Capoeira-Meister (Mestres) die Kampftechniken absichtlich uneffektiv gestalteten, um koloniale Beobachter zu taeuscheni",
        correctAnswer = 0,
        explanation = "Historiker wie Maya Talmon-Chvaicer (2008) argumentieren, dass die 'Verschleierungsthese' – Sklaven verkleideten Kampfkunst als Tanz – erst in den 1930er Jahren durch Mestre Bimba und kulturpolitische Interessen konstruiert wurde. Fruehe Kolonialquellen zeigen Capoeira bereits als offenen Strassenkampf, nicht versteckte Praxis.",
        difficulty = 5,
        funFact = "UNESCO nahm Capoeira 2014 als Immaterielles Kulturerbe auf. Mestre Pastinha und Mestre Bimba, die beiden prägenden Figuren des modernen Capoeira, starben beide in Armut – obwohl ihre Kunst Millionen begeisterte. Bimba gruendete 1932 in Salvador die erste Capoeira-Schule, obwohl die Praxis damals noch strafbar war."
    ),

    // Question 7 – Sport anthropology: Gender in traditional games
    Question(
        categoryId = 6,
        questionText = "Was ergab eine vergleichende Studie von 50 traditionellen Gesellschaften (Roberts, Arth & Bush, 1959) ueber den Zusammenhang zwischen Spieltypen und Sozialstruktur?",
        answerA = "Gesellschaften mit Jaeaer-Sammler-Struktur bevorzugen physische Geschicklichkeitsspiele, Ackerbauern strategische Brettspiele",
        answerB = "Gluecksspiele korrelieren mit sozialer Stratifikation, Strategiespiele mit politischer Hierarchie, Geschicklichkeitsspiele mit Riten der Umgebungsbeherrschung",
        answerC = "Nur westliche Gesellschaften entwickelten kompetitive Spiele; traditionelle Kulturen kennen ausschliesslich kooperative Spielformen",
        answerD = "Spieltypen sind kulturunabhaengig und folgen universalen Piaget-Entwicklungsstufen",
        correctAnswer = 1,
        explanation = "Roberts et al. untersuchten 50 Kulturen und fanden, dass Gluecksspiele in sozial stratifizierten Gesellschaften haeufiger sind, Strategiespiele in politisch hierarchischen Systemen, und Koerpergeschicklichkeitsspiele in Gesellschaften, die Umgebungskontrolle betonen. Diese Korrelation begrundete die anthropologische Spielforschung als eigenstaendige Disziplin.",
        difficulty = 5,
        funFact = "Schach (Strategie) entstand in komplexen hierarchischen Gesellschaften (Gupta-Indien, Sassaniden-Persien), waehrend Wuerfelspiele (Glueck) in fruehen mesopotamischen Stadtstaaten mit sozialer Ungleichheit flourierten – ein Muster, das Roberts These stuetzt. Ausnahmen wie das stratifizierte Hawaii, das jedoch Zufall-Spiele bevorzugte, blieben unerklaert."
    ),

    // Question 8 – Sport anthropology: Melanesian kula ring and sport
    Question(
        categoryId = 6,
        questionText = "Welchen Begriff praegt die Sportanthropologie fuer Wettkampfformen, bei denen das Austauschen von Prestige-Gaben wichtiger ist als der sportliche Sieg, angelehnt an Malinowskis Kula-Ring?",
        answerA = "Agonistischer Gabentausch (agonistic gift exchange)",
        answerB = "Potlatch-Sport",
        answerC = "Kompetitiver Mutualismus",
        answerD = "Symmetrischer Antagonismus",
        correctAnswer = 0,
        explanation = "Der Begriff 'agonistischer Gabentausch' beschreibt Wettkampfformen wie Potlatch-Feste der Nordwest-Kuestenindianer oder bestimmte melanesische Tauschsport-Rituale, bei denen Prestige durch grosszuegige Gabe (nicht Sieg) erlangt wird. Malinowskis Kula-Ring-Analyse (1922) wurde auf diese Sportformen uebertragen.",
        difficulty = 5,
        funFact = "Bei den Kwakwaka'wakw (Kwakiutl) in British Columbia galt der 'Potlatch-Wettkaeamper' als Sieger, wer am meisten verschenkte oder vernichtete, nicht wer am meisten anhaeaufte. Kanadas Regierung verbot den Potlatch von 1885 bis 1951 als 'zivilisationsfeindlich' – eine der erschreckendsten kulturellen Unterdrueckungen in der Geschichte des Sports."
    ),

    // Question 9 – Sport anthropology: Kung Fu transmission
    Question(
        categoryId = 6,
        questionText = "Was bezeichnet der Begriff 'Fa Jin' im klassischen chinesischen Gong-Fu in biomechanischer Fachsprache?",
        answerA = "Die explosive Entladung gespeicherter kinetischer Energie durch koordinierte Koerperkettenaktivierung (kinetic chain) und maximale Muskel-Relaxation-Kontraktion",
        answerB = "Die spirituelle Kraft-Uebertragung durch Qi-Kanaele ohne messbare physische Komponente",
        answerC = "Eine spezifische Atemtechnik (Qigong), die Sauerstoffversorgung der Muskeln um 40% steigert",
        answerD = "Die psychologische Technik der mentalen Visualisierung, die Krafteinsatz ohne physisches Training ermoeglicht",
        correctAnswer = 0,
        explanation = "Biomechanische Untersuchungen (Harvard Sport Science Lab, 2019) von Tai-Chi-Meistern zeigten, dass Fa Jin die kinetische Energiekette von Fuss uber Hufte, Wirbelsaeule und Schulter in 0,08-0,12 Sekunden aktiviert – vergleichbar mit der kinematic chain eines Boxschlags, aber mit optimierter Relaxations-Kontraktion-Sequenz.",
        difficulty = 5,
        funFact = "Bruce Lee wurde 1966 von Wissenschaftlern an der UCLA vermessen: Sein 1-Inch-Punch erzeugte trotz minimaler Rueckholung eine Kraft von ca. 350 Newtons – vergleichbar mit einem ausholenden Boxschlag. Hochgeschwindigkeitskameras zeigten seine vollstaendige kinetic-chain-Aktivierung in unter 50 Millisekunden."
    ),

    // Question 10 – Sport anthropology: Ritual combat in highland New Guinea
    Question(
        categoryId = 6,
        questionText = "Welchen Terminus technicus verwendet die politische Anthropologie fuer Stammeskriege in Papua-Neuguinea (z.B. der Dani), bei denen ritualisierte Kaeampfe mit formalem Zeremoniell und Todesbegrenzung stattfinden?",
        answerA = "Symbolischer Krieg (Symbolic Warfare)",
        answerB = "Ritueller Krieg (Ritual Warfare) oder zeremonielle Konfrontation",
        answerC = "Sportliche Aggression (Sporting Aggression) nach dem Aggression-Kanalisierungs-Modell",
        answerD = "Beschraenkter Feldzug (Limited Campaign) nach Clausewitz",
        correctAnswer = 1,
        explanation = "Karl Heider dokumentierte in 'Grand Valley Dani' (1970) ritualisierte Staemmekaempfe mit formalen Kampfplaetzen, festgelegten Kampfzeiten (nur bei gutem Wetter und Tageslicht), Trauerpausen nach Todesfaellen und gegenseitigem Einvernehmen zur Kampfpause. Diese 'ritual warfare' unterscheidet sich von Vernichtungskrieg durch streng kodifizierte Grenzen.",
        difficulty = 5,
        funFact = "Robert Gardners Dokumentarfilm 'Dead Birds' (1963) zeigte Dani-Kaempfe der Weltoeffentlichkeit. Nach anfaenglicher Kritik an vermeintlicher 'Primitivismus-Verherrlichung' gilt der Film heute als Meilenstein der Visual Anthropology. Heiders Forschung zeigte, dass Dani-Kaempfe weniger toedlich waren als viele Kriegsuebertreibungen vermuten liessen."
    ),

    // ── Biomechanik-Forschung (10) ────────────────────────────────────────────

    // Question 11 – Biomechanics: Magnus effect in soccer
    Question(
        categoryId = 6,
        questionText = "Welcher Magnus-Effekt-Mechanismus erklaert das 'unhittable' Knuckleball-Phaenomen im Fussball (z.B. Ronaldos Freistoesse ohne Drall) und warum ist es aus physikalischer Sicht am schwierigsten auf Seelevel zu blocken?",
        answerA = "Turbulenter Grenzschichtumschlag bei ca. 60-80 km/h: Der Ball wechselt zwischen zwei stabilen Stromungsregimen, was chaotische Flugbahn erzeugt",
        answerB = "Laminarer Staudruck-Effekt: Kein Drall bedeutet kein Magnus-Lift, der Ball faellt streng geradlinig ab",
        answerC = "Wirbel-Synchronisierung in der Nachlauf-Wirbelstrasse (Karman vortex street) zwingt den Ball in stabile Sinusbahn",
        answerD = "Molekulare Luftreibung (Stokes-Reibung) dominiert bei niedrigem Drall und erzeugt gleichmaessig verlangsamte Bahn",
        correctAnswer = 0,
        explanation = "Forschungen von Carré et al. (2002) und Asai et al. (2013) zeigten: Ein drallfreier Ball bei 60-80 km/h befindet sich in einem kritischen Reynoldszahl-Bereich, wo turbulente und laminare Grenzschicht instabil koexistieren. Minimale Oberflaechenunregelmaessigkeiten (Naehte, Paneele) triggern stochastische Seitenablenkungen von bis zu 1 m.",
        difficulty = 5,
        funFact = "Die 2010er-WM-Ball 'Jabulani' hatte 8 statt 32 Paneele und eine glattere Oberflaeche, was den kritischen Umschlagsbereich auf 65-90 km/h verschob. Torhüter beklagten 'unmögliche' Flugbahnen – Physiker bestaetigten, dass der Ball tatsaechlich staerker als je zuvor unvorhersehbar war."
    ),

    // Question 12 – Biomechanics: Sprint start reaction time
    Question(
        categoryId = 6,
        questionText = "Warum setzte der Leichtathletik-Weltverband (World Athletics) die Reaktionszeitgrenze fuer Fehlstarts auf 0,100 Sekunden fest, und was zeigen neuere neurowissenschaftliche Studien ueber diese Grenze?",
        answerA = "0,100 s ist die physiologische Mindest-Reaktionszeit des menschlichen Nervensystems, unter der kein willkuerliches Handeln moeglich ist",
        answerB = "Die Grenze ist willkuerlich und wird seit 2010 wissenschaftlich bestritten, da Spitzenathleten nachweislich 0,085 s oder weniger reaktionsfaehig sind",
        answerC = "0,100 s entspricht der Mindest-Synapsenzeit fuer Akustik-Motor-Umwandlung (auditorischer Kortex zu Rueckenmark)",
        answerD = "Die Regelung wurde 1980 ohne wissenschaftliche Grundlage als Kompromiss zwischen vier national unterschiedlichen Regelwerken eingefuehrt",
        correctAnswer = 1,
        explanation = "Forschungen von Lipps et al. (2011) und Jaime Morales (2016) zeigten, dass elite-Sprinter in Laborbedingungen auf akustische Reize in 0,080-0,095 s reagieren koennen. Die 0,100-s-Regel ist ein Konventionskonsens von 1998 (IAAF), der auf Messgeraete-Genauigkeit basierte, nicht auf biophysiologischer Unmoeglkichkeit.",
        difficulty = 5,
        funFact = "Usain Bolt hatte beim 100m-Weltrekord in Berlin 2009 eine Startreaktionszeit von 0,146 Sekunden – fuer Elite-Niveau relativ langsam. Sein Weltrekord beruht hauptsaechlich auf aussergewoehnlicher Schrittlaenge (2,44 m bei 6 ft 5 in Koerpergroesse) kombiniert mit hoher Frequenz."
    ),

    // Question 13 – Biomechanics: Golf club sweet spot
    Question(
        categoryId = 6,
        questionText = "Was versteht die Golfbiomechanik unter dem 'Center of Percussion' (COP) eines Golfschlaegerschafts und wie unterscheidet es sich vom geometrischen Mittelpunkt des Schlaegerkopfs?",
        answerA = "COP ist identisch mit dem geometrischen Mittelpunkt; modernes Driver-Design maximiert beides gleichzeitig",
        answerB = "COP ist der Punkt, an dem ein transversaler Impuls keine Reazione-Kraft am Griffende erzeugt – er liegt physikalisch abhaengig von Massenverteilung tiefer als der geometrische Mittelpunkt des Sclaegerkopfs",
        answerC = "COP bezeichnet die maximale Energieuebertragungszone und liegt immer 5 mm oberhalb des Schlaegerkopf-Mittelpunkts",
        answerD = "COP ist ein Marketing-Begriff ohne physikalische Definition, der 'optimalen Trefferbereich' beschreibt",
        correctAnswer = 1,
        explanation = "Das Center of Percussion ist definiert als der konjugierte Punkt zum Aufhaengungspunkt (Griffende), an dem ein Schlag keine Reaktionskraft am Griff erzeugt. Bei typischen Drivern liegt das COP 8-15 mm unterhalb des geometrischen Face-Zentrums, abhaengig von Schlaegerkopfmasse und Schwerpunktlage.",
        difficulty = 5,
        funFact = "Perimeter-Weighting (erfindet von Karsten Solheim, Gruender von PING Golf, 1966) verteilt Masse an den Schlaegerkopf-Randbereich, was das 'Moment of Inertia' erhoht und den effektiven Sweet-Spot vergroessert. Moderne Titanium-Driver haben MOI-Werte von bis zu 5900 g-cm2 gegenueber 2500 g-cm2 bei alten Wooden Clubs."
    ),

    // Question 14 – Biomechanics: Swimming drag reduction
    Question(
        categoryId = 6,
        questionText = "Welches Stroemungsprinzip wurde durch die kontroverse LZR-Racer-Arena-Kombination (2008-2009) ausgenutzt, die zur Verbannung der Ganzkoeperanzuege fuehrte?",
        answerA = "Druckwiderstandsreduktion durch Kompressionsgewebe, das Koerperkonturen glaettet und turbulente Abloesung verzoegert",
        answerB = "Auftriebssteigerung durch eingefangene Luftblasen im Gewebe, die Koerperdichte senken",
        answerC = "Laminare Grenzschichtverlaengerung durch Haifisch-Haut-Riblet-Textur auf dem gesamten Anzug",
        answerD = "Hydrophile Oberflaeche, die Wasserfilm-Bildung beschleunigt und Gleitreibung minimiert",
        correctAnswer = 0,
        explanation = "FINA-Untersuchungen und Flinders-Universitats-Studien (Mollendorf et al.) zeigten, dass LZR-Anzuege vor allem durch Kompression des Koerpers die hydrodynamische Form verbesserten (Druckwiderstand), sowie durch Lufteinschluss Auftrieb erhoehten. Beides erzielte Zeiterbesserungen von 1,5-2,0% – aus FINA-Sicht eine technologische Doping-Aequivalenz.",
        difficulty = 5,
        funFact = "Bei den Peking-Olympischen Spielen 2008 wurden 25 von 25 Weltrekorden im Schwimmen mit LZR-Anzuegen gebrochen. FINA verbot ab 2010 Anzuege, die ueber die Schultern gehen oder aus Nicht-Textilmaterialien bestehen. Die Weltrekorde aus dieser Ära blieben in vielen Disziplinen bis in die 2010er-Jahre ungebrochen."
    ),

    // Question 15 – Biomechanics: Achilles tendon energy storage
    Question(
        categoryId = 6,
        questionText = "Welchen Anteil der mechanischen Energie beim Laufen speichert und gibt die Achillessehne pro Schritt zurueck, und wie veraendert sich dieser Wert bei Elitelaeufer vs. Untrainierte?",
        answerA = "5-10% Rueckgabe bei Untrainierten, 15-20% bei Elitelaeufer – die Differenz erklaert komplett die Oekonomie-Unterschiede",
        answerB = "Beide speichern ca. 35-40% der Bodenstoss-Energie, die Achillessehne gibt davon 93-95% elastisch zurueck, unabhaengig vom Trainingsstatus",
        answerC = "Elitelaeufer speichern bis zu 60% und geben 80% zurueck; Untrainierte speichern 20% und geben 40% zurueck",
        answerD = "Die Achillessehne speichert praktisch keine Energie; elastische Rueckgabe erfolgt hauptsaechlich durch Plantarfaszie",
        correctAnswer = 1,
        explanation = "Studien von Ker et al. (1987) und Alexander (1988) zeigten, dass die Achillessehne (Tendon) ca. 35-40 J pro Schritt speichert und mit 93-95% Effizienz (hysteresis) zurueckgibt. Elitelaeufer unterscheiden sich nicht im Sehnen-Wirkungsgrad, sondern in Sehnensteifigkeit und -laenge, die Muskellaengenveraenderung und damit Muskelarbeit reduzieren.",
        difficulty = 5,
        funFact = "Bei Kenianischen Elitelaeufer (besonders der Kalenjin-Gruppe) gemessene Achillessehnen-Querschnitte sind relativ kleiner als bei westlichen Laeufer, aber mit hoeherem Kollagen-Vernetzungsgrad. Dies macht die Sehne steifer – optimal fuer die 'catapult'-Funktion bei hohen Schrittfrequenzen."
    ),

    // Question 16 – Biomechanics: Basketball shot arc
    Question(
        categoryId = 6,
        questionText = "Welcher Abwurfwinkel beim Basketball-Freiwurf maximiert die 'Korbeingangsflaeche' (entry area) geometrisch und wie weicht er vom subjektiv-bevorzugten Winkel der meisten Spieler ab?",
        answerA = "45 Grad ist optimal; Spieler werfen zu flach (30-35 Grad) und unterschaetzen den Vorteil des hohen Bogens",
        answerB = "52 Grad Abwurfwinkel maximiert die effektive Eingangsoeffnung; Spieler bevorzugen 45 Grad und lassen Genauigkeit auf dem Tisch",
        answerC = "Jeder Winkel zwischen 35 und 65 Grad ist gleichwertig, da die Basketballphysik Kompensationsraum erlaubt",
        answerD = "30 Grad ist optimal, weil ein flacher Bogen die horizontale Geschwindigkeitskomponente maximiert",
        correctAnswer = 1,
        explanation = "Huston & Cesar (2003) und Brancazio (1981) berechneten, dass bei 52 Grad Abwurfwinkel die effektive Korboeffnung (projected area) etwa 1,5-fach groesser als der Ball-Durchmesser ist – das Maximum. Spieler tendieren zu 45 Grad aus Gefuehl und Energieeffizienz, verlieren aber 10-15% Fehlertoleranz gegenueber dem optimalen Bogenhochwinkel.",
        difficulty = 5,
        funFact = "Steph Currys Freiwuerfe wurden mit 46-48 Grad gemessen, nah am 52-Grad-Optimum. Larry Birds historische 89% Freiwurf-Quote ist auf mehrere Faktoren zurueckzufuehren, einschliesslich konsistentem Release-Winkel. Ray Allen, Rekordhalter fuer 3-Punkte-Treffer, trainierte mit Hochgeschwindigkeitskameras um seinen 47-Grad-Abwurfwinkel mechanisch zu optimieren."
    ),

    // Question 17 – Biomechanics: Ice skating blade mechanics
    Question(
        categoryId = 6,
        questionText = "Welche Theorie erklaert am besten das Gleiten von Schlittschuhen auf Eis – und welche wurde lange als 'Druckschmelze' missverstanden?",
        answerA = "Druckschmelze (pressure melting): Schlaegerdruck senkt Schmelzpunkt des Eises – dies ist die korrekte Haupterklaerung",
        answerB = "Quasi-fluessige Oberflaeche (quasi-liquid layer, QLL): Eisoberflaeche hat schon ohne Druck eine ungeordnete, quasi-fluessige Molekuelschicht; Druck und Reibungswaerme erhoehen lediglich deren Stabilitaet",
        answerC = "Reibungsschmelze dominiert ausschliesslich: Kinetische Energie schmilzt genug Eis fuer Schmierfilm, statisches Stehen auf Eis ist daher reibungsarm unmoeglich",
        answerD = "Luftpolster-Levitation: Mikroskopische Luftblasen im Eis erzeugen ein Schmiermittel-Kissen unter der Klinge",
        correctAnswer = 1,
        explanation = "Die 'Druckschmelze'-These (Faraday, 1842) wurde Jahrzehnte gelehrt, aber physikalisch widerlegt: Um Eis bei -10 Grad C durch Druck zu schmelzen, waere ein Druck von etwa 1100 bar noetig – weit ueber Schlittschuhdruck (5-10 bar). Moderne Nanoskopie bestaetigte die QLL-Theorie: Die obersten 10-40 Nanometer Eis sind bereits ohne aeusseren Druck ungeordnet-fluessig.",
        difficulty = 5,
        funFact = "Schlittschuhlaufen bei -30 Grad C ist deutlich schwieriger als bei -1 Grad C, weil die QLL bei extrem niedrigen Temperaturen duenner wird. Arktis-Expeditionen berichten, dass Schlitten bei -40 Grad C fast gar nicht gleiten und durch Sand oder Tierhaar unter den Kufen unterstuetzt werden muessen."
    ),

    // Question 18 – Biomechanics: Rowing blade efficiency
    Question(
        categoryId = 6,
        questionText = "Welches hydrodynamische Phaenomen begrenzt die Ruderblatt-Effizienz am stärksten, und wie erklaert dies den Uebergang von Flat-Blade- zu Hatchet-Rudern in den 1990er Jahren?",
        answerA = "Kavitation: Druckabfall hinter dem Blatt erzeugt Dampfblasen, die beim Kollaps Energie vernichten und Blatt beschaedigen",
        answerB = "Schlupf (slip) durch Zirkulation-Verlust an den Blatt-Seitenraendern: Hatchet-Form vergroessert Blattflaeche bei gleichem Stroemungsschatten und reduziert so den Randwirbelverlust",
        answerC = "Laminare Grenzschichtabloesung: Flat-Blades erzeugen mehr Turbulenz, Hatchet-Form behallt laminare Stroemung laenger aufrecht",
        answerD = "Flaechen-Tiefenverhaeltnis: Mehr Wassertiefe des Blattes erhoht Hebelarm und damit hydraulischen Wirkungsgrad",
        correctAnswer = 1,
        explanation = "Forschungen der Lausanner ETH und FISA-Biomechaniker zeigten, dass Randwirbelverluste (tip vortex losses) die Hauptursache fuer Ruderblatt-Schlupf sind. Das Macon/Big-Blade (Hatchet)-Design von Carl Douglas (1991) vergroessert Blattflaeche ohne laengeren Schaft – mehr Flaeche bedeutet niedrigere Anstroemgeschwindigkeit fuer gleiche Kraft, was Schlupf reduziert.",
        difficulty = 5,
        funFact = "Der Wechsel zu Hatchet-Rudern (Macon-Blatt zu Big-Blade, eingefuehrt 1991 von Concept2 in Zusammenarbeit mit Brian Dreyfuss) verbesserte Elite-Weltrekorde um etwa 1-2%. Die deutschen Maenner-Achter, die 1992 und 1996 Olympiagold gewannen, waren Fruehzutaueger des neuen Designs."
    ),

    // Question 19 – Biomechanics: Tennis string tension physics
    Question(
        categoryId = 6,
        questionText = "Welches biomechanisch-physikalische Paradox erklaert, warum niedrigere Saitenspannung im Tennis zu MEHR Ballabfluggeschwindigkeit fuehren kann, obwohl die Saite 'weicher' schwingt?",
        answerA = "Niedrige Spannung erhoht Saitenbett-Formbarkeit, was den Kontaktzeitraum Ball-Saite verlaengert und mehr elastische Energie speichert (trampoline effect)",
        answerB = "Niedrigere Spannung reduziert die Racketmasse effektiv, was nach F=ma mehr Beschleunigung erlaubt",
        answerC = "Weichere Saiten absorbieren Schlagvibration, was Muskelenergie direkt in Ballimpuls umleitet",
        answerD = "Niedrige Spannung erhoht die Saitenelastizitaet, was nach Hooke'schem Gesetz mehr Rueckstoss erzeugt",
        correctAnswer = 0,
        explanation = "Der 'Trampoline-Effekt' (Cross & Lindsey, 2003): Bei niedrigerer Spannung verformt sich das Saitenbett staerker um den Ball, was den Kontaktzeitraum von ca. 4 ms auf 6 ms verlaengert. Ball-Deformation (und damit Energieverlust durch inelastische Kompression) wird reduziert – der Ball verliert weniger Energie. Effekt: bis zu 5% mehr Abfluggeschwindigkeit bei gleicher Schlagstkraft.",
        difficulty = 5,
        funFact = "Federer spielte zeitweise mit 27/26 kg (Aufsaite/Quersaite) Spannung – fuer ein Pro-Racket aussergewoehnlich niedrig. Nadals Saitenspannung liegt bei 25/24 kg Bespannung. Der Durchschnittsspieler verwendet 25-28 kg Spannung und unterschaetzt systematisch den Trampolin-Effekt niedrigerer Spannungen."
    ),

    // Question 20 – Biomechanics: High jump Fosbury Flop physics
    Question(
        categoryId = 6,
        questionText = "Welches physikalische Prinzip macht den Fosbury Flop biomechanisch ueberlegen – und wie kann der Schwerpunkt des Springers die Latte unterqueren, waehrend der Koerper sie uberfliegt?",
        answerA = "Bernoulli-Effekt: Schnelle Koerperbewegung erzeugt Unterdruck unter dem Koerper, der ihn mit extravitalem Auftrieb anhebt",
        answerB = "Koerper-Schwerpunkt kann eine Kurve beschreiben, die AUSSERHALB des Koerpers liegt: Bei stark gewoelbtem Ruecken liegt der Massenschwerpunkt unter der Latte, waehrend alle Koerperteile sie nacheinander ueberqueren",
        answerC = "Rotationsimpuls aus der Absprungspirale gibt dem Koerper ausreichend Winkelgeschwindigkeit um die eigene Achse, um mehr Hoehe ohne mehr Krafteinsatz zu erreichen",
        answerD = "Durch die Rueckenlage wird die Kinesie des Sprungs auf den Schulterguertel verteilt, was Energie-Peak verlaengert",
        correctAnswer = 1,
        explanation = "Das Prinzip: Bei ausgepraegter Rueckenwoelbung liegt der Koerperschwerpunkt ausserhalb des Koerpers – naemlich vor dem Bauch. Wenn der Springer rueckwaerts ueber die Latte gleitet (Schultern, dann Ruecken, dann Beine), kann der Schwerpunkt knapp unterhalb der Latte bleiben, waehrend alle Koerperteile sie passieren. Dadurch muss der Schwerpunkt rechnerisch weniger hoch.",
        difficulty = 5,
        funFact = "Dick Fosbury erfand den Flop zufaellig als Teenager in Medford, Oregon (1963), als er versuchte, eine Hochsprung-Variation zu improvvisieren. Bei den Mexico-City-Olympischen Spielen 1968 gewann er Gold und revolutionierte die Disziplin. Zuvor dominierte der Straddle (Bauchflop) und Scissors (Schersprung)."
    ),

    // ── Sportrecht / Governance-Geschichte (10) ───────────────────────────────

    // Question 21 – Sports law: First doping ban
    Question(
        categoryId = 6,
        questionText = "Welches Land erliess als erstes weltweit ein staatliches Anti-Doping-Gesetz und in welchem Jahr?",
        answerA = "Belgien, 1965",
        answerB = "Frankreich, 1963",
        answerC = "USA, 1968",
        answerD = "DDR, 1970",
        correctAnswer = 0,
        explanation = "Belgien verabschiedete 1965 das weltweit erste staatliche Anti-Doping-Gesetz ('Wet Buysse'), zwei Jahre nach dem Tod des belgischen Radfahrers Knud Jensen (Olympia 1960) und im Gefolge der Tom-Simpson-Diskussion. Das Gesetz regelte jedoch nur Amateur-Wettbewerbe und blieb weitgehend unangewandt.",
        difficulty = 5,
        funFact = "Tom Simpsons Tod am Mont Ventoux (Tour de France 1967) schockierte Europa: Amphetamine und Alkohol wurden in seiner Blutbahn gefunden. Das IOC etablierte daraufhin 1968 bei den Mexico-City-Spielen die ersten offiziellen Doping-Tests – mit nur 7 positiven Befunden aus 667 Proben."
    ),

    // Question 22 – Sports law: Bosman ruling impact
    Question(
        categoryId = 6,
        questionText = "Was war die unmittelbare juristische Folge des Bosman-Urteils (EuGH, 1995) fuer die UEFA-Transfer-Regelungen und welcher unbeabsichtigte Nebeneffekt entstand fuer den Vereinsfussball?",
        answerA = "Spieler koennen Vertragslaeufe ohne Transfergebuehr wechseln; als Nebeneffekt stieg die Marktmacht der Top-Clubs ueberproportional und Gehaltsungleichheiten explodierten",
        answerB = "Transfergebuehren wurden europaeweit abgeschafft; als Folge stiegen Vereinsinsolvenz-Raten um 40%",
        answerC = "Nur EU-Buerger durften ohne Transfer wechseln; Nicht-EU-Spieler blieben von der Regelung ausgenommen – was zur Nicht-EU-Spieler-Diskriminierung fuehrte",
        answerD = "Das Urteil galt nur fuer belgische Spieler; andere EU-Laender implementierten es erst nach weiteren nationalen Klagen",
        correctAnswer = 0,
        explanation = "Bosman (C-415/93): EU-Buerger koennen nach Vertragsende frei wechseln, Auslaender-Beschraenkungen innerhalb der EU sind unzulaessig. Nebeneffekt: Top-Clubs konnten nun uneingeschraenkt auslaendische EU-Stars verpflichten, was Gehaltsspirale und Konzentration der Talente bei Reichen Clubs beschleunigte. 'Bosman-Spirale' bezeichnet dieses Phaenomen.",
        difficulty = 5,
        funFact = "Jean-Marc Bosman, der belgische Fussballer dessen Klage das Urteil ausloeste, profitierte selbst kaum von der Revolution: Er litt unter Depressionen und Alkoholproblemen nach dem Karriereende, wurde Aktivist fuer Spielerrechte und lebt heute zurueckgezogen in Belgien. Sein Fall kostete ihn 5 Jahre Rechtsstreit."
    ),

    // Question 23 – Sports law: Olympic eligibility rules evolution
    Question(
        categoryId = 6,
        questionText = "Warum strich das IOC 1981 den Begriff 'Amateur' aus der Olympischen Charta und welche Governance-Krise hatte das IOC in den 1970er Jahren zur Reform gezwungen?",
        answerA = "Profisportler hatten Amateure systematisch verdraengt; IOC reagierte auf Druck der Sportvereinigungen und Athleten",
        answerB = "Amateurismus-Doppelstandard: Ostblock-Staaten unterstuetzten Staatsathleten faktisch als Profis, waehrend westliche Profis ausgeschlossen blieben – IOC musste Hypokrisie beenden",
        answerC = "US-Kongress drohte mit Finanzierungs-Boykott von US-NOC, wenn Profisportler weiter ausgeschlossen blieben",
        answerD = "FIFA-Druck: Der Fussball-Weltverband weigerte sich, das Olympia-Turnier zu unterstuetzen, solange Profis ausgeschlossen waren",
        correctAnswer = 1,
        explanation = "Der Doppelstandard war unhaltbar: Sowjetische, DDR-, ungarische Athleten erhielten staatliche Gehaealt, Unterkunft und vollzeitmaaessiges Training – faktisch Profis – und galten trotzdem als 'Amateure'. Westliche Profis (z.B. US-Basketball-NBA-Spieler, Tennis-Profis) blieben ausgeschlossen. IOC-Praesident Lord Killanin initiierte 1981 die Amateurismus-Abschaffung unter Avery Brundages Nachfolger.",
        difficulty = 5,
        funFact = "Jim Thorpe verlor seine Goldmedaillen von 1912 (Zehnkampf und Fuenfkampf) posthum wegen 'Professionalismus': Er hatte 1909/10 fuer 25 Dollar pro Woche Baseball gespielt. Das IOC rehabilitierte ihn 1982 und gab seiner Familie Replika-Medaillen – ein Symbol des verfehlten Amateurismus-Dogmas."
    ),

    // Question 24 – Sports law: CAS establishment
    Question(
        categoryId = 6,
        questionText = "Welches strukturelle Problem des fruehen Internationalen Sportgerichtshofs (CAS, gegruendet 1984) fuehrte zur vollstaendigen Reorganisation 1994 nach dem Gundel-Urteil des Schweizer Bundesgerichts?",
        answerA = "Mangelnde Transparenz der Urteilsbegrundungen; Reformdruck kam von Athletenvereinigungen",
        answerB = "Fehlende Unabhaengigkeit: CAS-Finanzierung, Schiedrichterernennung und Regelsetzung lag beim IOC – das Schweizer Bundesgericht verneinte deshalb echte Unabhaengigkeit",
        answerC = "CAS hatte keine Befugnis, IOC-Entscheidungen zu ueberpruefe – nur Verbands-Entscheidungen, was zu einem unvollstaendigen Rechtsschutzsystem fuehrte",
        answerD = "Die Verfahrenssprachen (nur Englisch und Franzosisch) diskriminierten nicht-westliche Athleten und wurden als Verletzung des Gleichheitsgrundsatzes gertuegt",
        correctAnswer = 1,
        explanation = "Das Schweizer Bundesgericht erkannte im Gundel-Urteil (1993), dass CAS keine genugende Unabhaengigkeit vom IOC hatte: Das IOC ernannte 1/3 der CAS-Richter, finanzierte den CAS und konnte Statuten aendern. 1994 wurde der ICAS (Internationaler Sportgerichtshof) gegruendet, der CAS-Unabhaengigkeit durch getrennte Finanzierung und Richterauswahl sicherstellte.",
        difficulty = 5,
        funFact = "Der CAS hat heute Sitz in Lausanne und verhandelt ueber 600 Faelle pro Jahr. Waehrend der Olympischen Spielen betreibt er ein temporaeres Ad-hoc-Gericht direkt am Austragungsort, das innerhalb von 24 Stunden Entscheidungen treffen kann – ein in der Rechtsgeschichte einzigartiger Schnell-Gerichtsweg."
    ),

    // Question 25 – Sports law: FIFA statutes Article 68
    Question(
        categoryId = 6,
        questionText = "Was beinhaltet das FIFA-Statut-Prinzip der 'Sportgerichtsbarkeit' (Artikel 68 FIFA-Statuten) und warum ist es juristisch umstritten in EU-Mitgliedsstaaten?",
        answerA = "Alle Streitigkeiten muessen zuerst intern geloest werden und dann zum CAS – staatliche Gerichte sind ausgeschlossen, was nach EU-Recht den Zugang zur staatlichen Justiz verletzen kann",
        answerB = "FIFA-Entscheidungen haben Vorrang vor nationalem Recht in Sportangelegenheiten – dies ist allgemein als legal anerkannt",
        answerC = "Spieler duerfen FIFA-Entscheidungen nur beim CAS anfechten, nicht bei nationalen Gerichten – dies ist in der EU-Grundrechtecharta ausdrucklich erlaubt",
        answerD = "FIFA-Mitgliedsverbaende koennen nationale Gerichtsurteile ignorieren, wenn diese FIFA-Statuten widersprechen – eine von allen EU-Laendern anerkannte Praxis",
        correctAnswer = 0,
        explanation = "Artikel 68 verlangt, dass alle Streitigkeiten mit FIFA-/Verbandsverbindung zuerst intern und dann beim CAS geloest werden – staatliche Gerichte sind bei Erstaufruf ausgeschlossen. Der EuGH prueft derzeit (Fall Superleague, 2023), ob dieses Monopol mit EU-Wettbewerbsrecht und Grundrechten vereinbar ist.",
        difficulty = 5,
        funFact = "Das EuGH-Urteil vom Dezember 2023 (C-333/21) im Fall European Superleague Company vs. FIFA/UEFA ist eine historische Entscheidung: FIFA/UEFA koennen nicht willkuerlich Konkurrenzkampf-Ligen verbieten. Gleichzeitig bestaetigte der EuGH, dass CAS-Schiedsverfahren grundsaetzlich zulässig sind, solange sie nicht einziger Rechtsweg sind."
    ),

    // Question 26 – Sports law: Olympic boycott legal basis
    Question(
        categoryId = 6,
        questionText = "Welches Rechtsinstrument nutzten die USA 1980, um die Teilnahme des USOC am Moscow-Olympia-Boykott durchzusetzen, obwohl das IOC betonte, dass das USOC dem staatlichen Druck widerstehen durfte?",
        answerA = "Executive Order von Praesident Carter, gestuetzt auf den Trading with the Enemy Act",
        answerB = "Amateur Sports Act von 1978: Congress gab USOC die Anweisung, nicht teilzunehmen, Carter drohte mit Entzug der Steuerbefreiung und Passverweigernng",
        answerC = "UN-Sicherheitsratsresolution, die Sportveranstaltungen mit Laendern unter UN-Sanktionen verbot",
        answerD = "Bilateraler Vertrag zwischen den USA und 64 verbundenen Nationen, der gemeinsamen Boykott regelte",
        correctAnswer = 1,
        explanation = "Carter stutzte sich auf den Amateur Sports Act, drohte dem USOC mit Entzug steuerlicher Befreiumgen und staatlicher Gelder, und Congress schuf Druck. Der USOC-Vorstand stimmte (73:14) gegen Teilnahme, trotz IOC-Empfehlung zur Unabhaengigkeit. Individuellen Athleten wurde gedroht, ihre Paesse fuer die Reise nach Moskau zu verweigern.",
        difficulty = 5,
        funFact = "Inzwischen klagte USOC-Mitglied Anita DeFrantz (spaeter IOC-Mitglied) vor einem US-Bezirksgericht gegen den Boykott und verlor. DeFrantz und 24 andere US-Athleten klagten, der Boykott verletze ihr Recht auf Teilnahme. Das Gericht erkannte, dass die US-Regierung keine direkte Weisungsbefugnis ueber USOC hatte, der politische und finanzielle Druck war jedoch zu stark."
    ),

    // Question 27 – Sports law: Caster Semenya case
    Question(
        categoryId = 6,
        questionText = "Auf welchem wissenschaftlichen Konzept basieren die World Athletics DSD-Regelungen (Differences of Sexual Development), und welche Schweizer Rechtsinstitution entschied 2023 endgueltig gegen Semenya?",
        answerA = "Testosteron-Grenzwert von 5 nmol/L basiert auf evolutionsbiologischen Maenner-Frauen-Unterschieden; Schweizer Bundesgericht bestaetigt World Athletics Regelung",
        answerB = "Oestrogen-Dominanz-Theorie als Leistungs-Einschraenkungskriterium; CAS entschied final gegen Semenya",
        answerC = "Chromosomaler Karyotyp als Kategoriemerkmal; Europaeischer Gerichtshof fuer Menschenrechte untersagte Tesoterostan-Limits",
        answerD = "Knochenichtestruktur als anatomisches Kriterium; UN-Menschenrechtskommission erklaerte Regelung fuer diskriminierend aber nicht bindend",
        correctAnswer = 0,
        explanation = "World Athletics setzte Testosteron-Grenzwert von 5 nmol/L fuer Frauen-Mittelstrecke fest, basierend auf Studien ueber Performance-Vorteil naturlich erhoeher Testosteronwerte. CAS bestaetigte 2019 (2-1), das Schweizer Bundesgericht 2020. Der EGMR-Entscheid (2023) erkannte Verletzung von Art. 8 und 14 EMRK (Privatleben, Diskriminierung) – aber ohne Kraft, World-Athletics-Regeln direkt aufzuheben.",
        difficulty = 5,
        funFact = "Semenya gewann trotz laufender Rechtskaeampfe zwei olympische Goldmedaillen (2012, 2016). Die EGMR-Entscheidung vom Juli 2023 ist historisch als erstes EGMR-Urteil zu Sportgerichtsbarkeit und Athletenrechten – sie verpflichtet die Schweiz als World-Athletics-Sitzstaat, in Zukunft sicherzustellen, dass CAS-Verfahren EMRK-konform sind."
    ),

    // Question 28 – Sports law: FIFA transfer system pre-Bosman
    Question(
        categoryId = 6,
        questionText = "Welches 'Retain and Transfer'-System regelte vor dem Bosman-Urteil die Spielertransfers im englischen Fussball und wann wurde es erstmals erfolgreich angefochten?",
        answerA = "Das 'Wage Cap'-System von 1900-1961, abgeschafft durch George Eastham vs. Newcastle United (1963)",
        answerB = "Das 'Football League Retain and Transfer'-System von 1891; George Eastham gewann 1963 vor dem High Court, das System blieb aber bis Bosman 1995 in abgeschwaeachter Form",
        answerC = "Das 'Transfer Solidarity'-Modell, das 1970 auf FIFA-Ebene institutionalisiert wurde und nie gerichtlich angefochten wurde",
        answerD = "Das 'Maximum Wage'-System, abgeschafft 1961 durch Jimmy Hill und die PFA",
        correctAnswer = 1,
        explanation = "George Easthams Klage gegen Newcastle United (1963) und der folgende High-Court-Sieg erweichten das Retain-System: Clubs konnten Spieler nicht laenger 'einfrieren' (kein Wechsel, kein Gehalt), mussten aber noch Transfer-Gebuehren zahlen. Das vollstaendige System wurde erst durch Bosman 1995 beseitigt.",
        difficulty = 5,
        funFact = "Jimmy Hill, spaeter BBC-Kommentator und Fussball-Ikonenfigur, fuehrte als Vorsitzender der Professional Footballers' Association (PFA) 1961 den Streik-Drohung durch, der die Maximum Wage (damals 20 Pfund pro Woche) abschaffte. Johnny Haynes (Fulham) wurde dadurch zum ersten Hundert-Pfund-pro-Woche-Spieler Englands."
    ),

    // Question 29 – Sports law: Olympic Flag neutrality
    Question(
        categoryId = 6,
        questionText = "Unter welchem offiziellen Status duerfen Athleten aus Laendern mit IOC-Suspendierung (z.B. Russland 2022+, Kuwait 2015-2016) an Olympischen Spielen teilnehmen, und welche juristisch-technische Konstruktion erm steht dahinter?",
        answerA = "Als 'Olympische Athleten aus [Land]' (OAR): IOC uebernimmt ad-hoc Mitgliedschaft und stellt eigene Delegation dar",
        answerB = "Als 'Individuelle neutrale Athleten' (Individual Neutral Athletes, AIN): Athleten vertreten keinen Verband, IOC uebernimmt direkte Startgenehmigung unter neutralen Bedingungen",
        answerC = "Als Gaesathleten des Gastgeber-NOC: Das Gastland-NOC akkreditiert und verkoerpert die Athele, Medaillen gehen ans Gastland",
        answerD = "Ueber das IOC-Refugee-Programm: Suspendierte Nationen werden als Fluechtlingsteam-Status klassifiziert",
        correctAnswer = 1,
        explanation = "Das IOC entwickelte die 'Individueller neutraler Athlet'-Konstruktion (z.B. AIN-Delegation bei Paris 2024): Athleten qualifizieren sich rein leistungsbasiert, starten ohne nationale Flagge/Hymne, IOC gibt direkte Startgenehmigung ohne nationalen Verband als Intermediaer. Dies umgeht das Problem der Verbandssuspendierung.",
        difficulty = 5,
        funFact = "Bei den Olympischen Winterspielen 2018 in Pyeongchang starteten 168 Russische Athleten als 'Olympic Athletes from Russia' (OAR) wegen des Staatsdoping-Skandals. Bei Medaillengewinnen erklang Tschaikowskys 1. Klavierkonzert statt der russischen Nationalhymne – eine musikalische Symbolpolitik, die weltweite Aufmerksamkeit erzeugte."
    ),

    // Question 30 – Sports law: IOC corruption scandal
    Question(
        categoryId = 6,
        questionText = "Welcher IOC-Korruptionsskandal (1998-1999) fuehrte zu bislang groesster Strukturreform des IOC und wie viele Mitglieder wurden infolgedessen ausgeschlossen oder ruecktratreten?",
        answerA = "Salt-Lake-City-Skandal: Bestechungszahlungen fuer Olympiabewerbung 2002; 10 Mitglieder ausgeschlossen/betroffenen, Reform durch IOC 2000-Kommission",
        answerB = "Atlanta-Skandal 1996: Billy Payne Zahlungen fuehrten zum Ausschluss von 15 IOC-Mitgliedern",
        answerC = "Sydney-Skandal 2000: Australische Bewerbungszahlungen; 22 IOC-Mitglieder unter Untersuchung, 8 ausgeschlossen",
        answerD = "Tokyo-Skandal 2020: Dentsu-Vermittlungsgelder fuehren zum ruecktraetend von 3 IOC-Mitgliedern",
        correctAnswer = 0,
        explanation = "Der Salt-Lake-City-Bestechungsskandal: Die Bewerbungsgesellschaft zahlte ca. 1 Mio. USD an IOC-Mitglieder und deren Familien (Stipendien, Zahlungen, Operationen, Jobs). IOC-Praesident Samaranch initiierte die Dick-Pound-Kommission; 10 Mitglieder schieden aus (6 Ausschluss, 4 Ruecktritte). Die Reform fuehrte zur Einschraenkung von Bewerber-Besuchen bei IOC-Mitgliedern.",
        difficulty = 5,
        funFact = "Tom Welch und Dave Johnson, die Hauptverantwortlichen der Salt-Lake-City-Bewerbung, wurden 2003 angeklagt, aber die Klage 2004 abgewiesen. Die Reform fuehlte zu massgeblichen Transparenz-Verbesserungen: IOC-Mitglieder duerfen seitdem keine Gastgeschenke ueber 150 USD annehmen und Olympia-Bewerber-Staedte nicht mehr besuchen."
    ),

    // ── Antidoping-Wissenschaft (10) ──────────────────────────────────────────

    // Question 31 – Anti-doping: Biological passport concept
    Question(
        categoryId = 6,
        questionText = "Welches Grundprinzip unterscheidet den Biologischen Athlet-Pass (ABP) von klassischen Urin-Direkttests, und welche beiden Module umfasst er seit 2019?",
        answerA = "ABP misst direkt verbotene Substanzen mit erhoehter Sensitivitaet; Module: Blut (Haematologie) und Endokrinologie (Hormon)",
        answerB = "ABP prueft keine einzelnen Substanzen, sondern Laengsschnitt-Varianz biologischer Parameter von einer Baseline; Module: Haematologisches Modul und Steroidal Modul",
        answerC = "ABP nutzt Genomics um genetische Doping-Modifikationen zu erkennen; Module: Genetik und Proteomik",
        answerD = "ABP ist ein soziales Monitoring-Werkzeug mit Selbstauskunft-Komponente; Module: Psychometrisch und Haematologisch",
        correctAnswer = 1,
        explanation = "Der ABP basiert auf dem Konzept indirekter Beweise: Statt verbotene Substanzen direkt nachzuweisen, werden individuelle Biomarker (z.B. Haematokrit, Retikulozyten, Testosteron/Epitestosteron-Quotient) laengsschnittlich verfolgt. Abnorme Varianz von der persoenlichen Baseline triggert eine Untersuchung. Die beiden Hauptmodule sind das haematologische (seit 2008) und das steroidal Modul (seit 2014).",
        difficulty = 5,
        funFact = "Der ABP fuehrte zur Sperre mehrerer hochkareatiger Athleten, die nie direkt positiv getestet worden waeren: z.B. Radprofi Frank Schleck (2014) und Leichtathlet Rashid Ramzi, der seine 2008er Olympia-Goldmedaille nachtraeglich verlor. ABP-basierte Sperren machen heute ca. 25% aller WADA-Sperren aus."
    ),

    // Question 32 – Anti-doping: EPO detection history
    Question(
        categoryId = 6,
        questionText = "Welche bahnbrechende Methode entwickelten Wissenschaftler um Francoise Lasne (2000) zur erstmaligen routinemaeassigen EPO-Erkennung, und warum war dies jahrelang als unmoeglich gegolten?",
        answerA = "Massenspektrometrie-Fingerprinting: rekombinantes EPO hat ein charakteristisches Isotopenmuster",
        answerB = "Isoelektrische Fokussierung (IEF): rekombinantes EPO (rEPO) hat andere Glykosylierungsmuster als endogenes EPO, sichtbar als distinkte Banden",
        answerC = "Immunoassay mit monoklonalen Antikoerpern, die spezifisch an rEPO-Epitope binden, die endogenes EPO nicht hat",
        answerD = "Halbwertszeit-Analyse: rEPO hat eine 3-fach laengere Halbwertszeit, detektierbar durch zeitgestaffelte Blutentnahmen",
        correctAnswer = 1,
        explanation = "Lasnes Team am LNDD (Paris) entwickelte die IEF-Methode: Natuerliches EPO hat bestimmte Glykosylierungsmuster (Kohlenhydratseitenketten), die anders als bei rekombinanten Praeparaten sind. Bei der IEF wandern EPO-Isoformen nach ihrem isoelektrischen Punkt – rEPO zeigt charakteristisch andere Bandenmuster. Erstmals routinemaessig bei Sydney 2000 eingesetzt.",
        difficulty = 5,
        funFact = "Vor Sydney 2000 galt EPO als 'undetektierbar'. Das WADA schritze daher doppelt ab: Urintest (IEF) UND Bluttest (Haematokrit-Grenzwert 50%). Lance Armstrong wurde nie mit dem neuen Test positiv getestet – erst 2012 durch Zeugenaussagen und reanalysierte Proben ueberführt. Seine Proben aus 1999 wurden 2013 nachgetestet und 6 wiesen positive EPO-Spuren auf."
    ),

    // Question 33 – Anti-doping: Gene doping
    Question(
        categoryId = 6,
        questionText = "Welches Argument macht Gen-Doping (direkte Genmanipulation oder Vektoren zur Leistungssteigerung) aus anti-doping-wissenschaftlicher Sicht zum schwersten Detektionsproblem, und welche einzige Nachweismethode gilt als vielversprechend?",
        answerA = "Genmodifikationen sind fluechtig und im Blut nicht nachweisbar; DNAse-Aktivitaet zerstoert alle Marker",
        answerB = "Koerpereigene Gene wie myostatin-Ausschaltung erzeugen Proteine, die identisch mit natuerlicherweise exprimierten sind; einzig vielversprechend: Epigenom-Profiling zur Erkennung atypischer Methylierungsmuster",
        answerC = "CRISPR-basierte Modifikationen sind permanent und undetektierbar; nur Biobanking (jahrzehntelanges Aufbewahren von Proben) ermoeglicht spaetere Entdeckung",
        answerD = "Virale Vektoren (AAV) sind im Blut hoechstens 72 Stunden nachwechselbar; nur In-Wettkampf-Biopsien koennen stabile Veraenderungen zeigen",
        correctAnswer = 1,
        explanation = "Das Kernproblem: Wenn ein Athlet z.B. sein eigenes IGF-1-Gen ueberexprimiert oder Myostatin ausschaltet, produziert sein Koerper Proteine, die chemisch identisch mit naturlich produzierten sind – kein Substanz-Fingerprint detektierbar. WADA-Forschungsprioritaet seit 2020: Epigenomics – atypische DNA-Methylierungsmuster durch virale Vektoren oder Genediting koennen Signaturen hinterlassen.",
        difficulty = 5,
        funFact = "Finn Wentorf und sein Hund, der an Myostatin-Mutation leidet, wurden 2004 als erstes dokumentiertes natuerliches Myostatin-Defizit beim Menschen entdeckt. Das Kind zeigte aussergewoehnliche Muskelentwicklung – ein natuerliches Experiment, das zeigt, was Myostatin-Gen-Doping erreichen koennte. WADA klassifiziert Gen-Doping seit 2003 als verboten, auch ohne spezifischen Nachweis-Test."
    ),

    // Question 34 – Anti-doping: Whereabouts requirement
    Question(
        categoryId = 6,
        questionText = "Was besagt das WADA-Whereabouts-System (ADAMS) und welches juristische Urteil definierte, wie viele Versaeumnisse ('missed tests') innerhalb von 12 Monaten eine Anti-Doping-Sperre ausloesen?",
        answerA = "Athleten melden taeglichen Aufenthaltsort; drei Versaeumnisse (missed tests oder filing failures) in 12 Monaten = Anti-Doping-Regelverstzoss",
        answerB = "Athleten melden woechentlichen Aufenthaltsort; fuenf Versaeumnisse in 18 Monaten = Regelverstzoss",
        answerC = "Athleten nennen nur Wettkampftermine; ein einziges Versaeumnis = sofortige Sperre fuer 2 Jahre",
        answerD = "Nur Nationalsportler in A-Kadern muessen Aufenthaltsort melden; Versaeumnis-Schwelle ist individuell von NADA festgelegt",
        correctAnswer = 0,
        explanation = "WADA-Code Artikel 2.4: Athleten in 'Registered Testing Pools' muessen taeglichen 60-Minuten-Zeitslot und Aufenthaltsort angeben. Drei Kombinationen aus 'filing failures' (nicht gemeldeter Ort) und 'missed tests' (nicht angetroffen trotz korrekter Meldung) innerhalb von 12 Monaten konstituieren einen Anti-Doping-Regelverstzoss – Strafe: 1-2 Jahre Sperre.",
        difficulty = 5,
        funFact = "Maria Scharapowa wurde 2016 nicht wegen eines positiven Tests gesperrt, sondern weil sie vergass, ein Medikament (Meldonium) von der WADA-Verbotsliste zu streichen, als es 2016 dort aufgenommen wurde. Sie hatte es seit 2006 aus medizinischen Gruenden genommen – ein Beispiel wie Athleten durch Listen-Aenderungen unfreiwillig in Regelvertoesse geraten koennen."
    ),

    // Question 35 – Anti-doping: Blood doping pre-EPO era
    Question(
        categoryId = 6,
        questionText = "Welche Blutdoping-Methode nutzten Ausdauerathleten in den 1970er-1980er Jahren vor der EPO-Aera, und welcher experimentelle Nachweis von 1984 bestaetigt deren Wirksamkeit?",
        answerA = "Hyperbare Sauerstoffkammern: Atletheten schliefen in O2-angereicherter Atmosphaere; Studien zeigten 3% VO2max-Steigerung",
        answerB = "Autologe und homologe Bluttransfusionen: Reinfusion von gespeichertem Eigenblut oder Fremdblut; 1984er Studie zeigte 5-13% VO2max-Steigerung durch homologe Transfusion",
        answerC = "Erythrozyten-Konzentrat aus Cordblut: Nabelschnurblut-Transfusionen steigerten laut 1984er Studie Haematokrit um 8-12%",
        answerD = "Ozon-Autohemaetherapie: Reinfundiertes Ozon-behandeltes Eigenblut; Wirksamkeit war nie reproduzierbar nachgewiesen",
        correctAnswer = 1,
        explanation = "Mehrere Teams bei der Tour de France 1970er/1980er nutzten Bluttransfusionen. Eine 1984er Studie von Brien & Simon (Canadian Journal of Applied Sport Sciences) zeigte, dass homologe Erythrozyten-Transfusion (Fremdblut, gleiches Blutgruppe) die maximale Sauerstoffaufnahme um 5-13% steigert. Das US-Radteam bei den 1984er LA-Spielen gestand spaeter kollektives Blutdoping.",
        difficulty = 5,
        funFact = "Lasse Viren, finnischer Langstreckenlaeufter mit 4 Olympia-Goldmedaillen (1972 und 1976), wurde wiederholt (aber nie bewiesen) des Blutdopings verdaechtigt. Seine aussergewoehnliche Faehigkeit, nur zu Grossereignissen Spitzenform zu zeigen und in regulaeren Rennen maessig zu sein, wurde als Hinweis auf gespeicherte Blut-Kuehlschrankentleererung interpretiert."
    ),

    // Question 36 – Anti-doping: CERA detection
    Question(
        categoryId = 6,
        questionText = "Wie wurde CERA (Continuous Erythropoiesis Receptor Activator, ein langwirksames EPO-Derivat) nach seiner Markteinfuehrung 2007 fuer Anti-Doping nachgewiesen, und welcher Skandal folgte bei Probenreanalysen?",
        answerA = "CERA hat eine so lange Halbwertszeit (144 h), dass es bei regulaeren Wettkampftests noch 3 Wochen nach letzter Injektion detektierbar ist; 8 Tour-de-France-2008-Proben wurden 2009 positiv nachgetestet",
        answerB = "CERA-spezifische Antikoerper-Immunoassays wurden entwickelt und erkannten CERA in 2-Jaehres-alten Biobank-Proben; daraus folgten retroaktive Sperren fuer 12 Athleten",
        answerC = "Massenspektrometrie-Methode von USADA erkannte CERA-Abbauprodukte; Lance Armstrong wurde dadurch 2012 ueberführt",
        answerD = "CERA-Metaboliten sind im Urin stabil; Routinetests 4 Wochen nach Einnahme lieferten positive Befunde bei Tour 2007",
        correctAnswer = 0,
        explanation = "CERA (Methoxy-PEG-Epoetin beta) hat eine biologische Halbwertszeit von ~90-144 Stunden gegenueber 8-24 h bei konventionellem EPO. IOC liess Tour-de-France-2008-Proben 2009 mit einer neu entwickelten spezifischen IEF-Antikoerper-Methode reanalysieren: 8 Fahrer (darunter Riccardo Ricco, Stefan Schumacher) wurden positiv getestet.",
        difficulty = 5,
        funFact = "Riccardo Ricco wurde beim Reanalyse-Skandal ueberführt, aber nicht fuer immer gesperrt. 2011 wurde er bei einem privaten Blutdoping-Experiment schwer verletzt: Er transfundierte sich altes, nicht kuehl gelagertes Eigenblut und erlitt schwere Nierenversagen und Sepsis. Er ueberlebte, seine Karriere war beendet."
    ),

    // Question 37 – Anti-doping: SARMs in sports
    Question(
        categoryId = 6,
        questionText = "Warum gelten SARMs (Selektive Androgen-Rezeptor-Modulatoren) als naechste grosse Anti-Doping-Herausforderung, obwohl sie nie fuer Menschen zugelassen wurden?",
        answerA = "SARMs sind legal als Nahrungsergaenzungsmittel verkaeuflich und koennen nicht unterschieden werden von natuerlicherweise vorkommenden Verbindungen",
        answerB = "SARMs werden in klinischen Studien getestet und koennten bald zugelassen werden, was Anti-Doping-Regelwerke obsolet machen wuerde",
        answerC = "SARMs stimulieren Muskelaufbau aehnlich wie Anabolika, binden aber selektiv nur an Muskel-Androgenrezeptoren (nicht Prostata/Hoden), sind im Schwarzmarkt weit verbreitet, und Nachweismethoden entwickeln sich langsamer als neue Substanzen",
        answerD = "SARMs aktivieren alternative Androgen-Signalwege, die von WADA-Methoden nicht erfasst werden koennen, da sie keine Androgen-Metaboliten produzieren",
        correctAnswer = 2,
        explanation = "SARMs (z.B. Ostarine, Ligandrol, RAD140) sind auf WADA-Verbotsliste seit 2008, aber massenhaaft im Fitness-Supplementmarkt verkaeuflich (oft falsch deklariert). Sie stimulieren Muskelwachstum mit weniger hormonellen Nebenwirkungen als Anabolika. Das WADA-Accredited Lab in Koeln entwickelt fortlaufend neue LC-MS/MS-Methoden; neue SARMs kommen aber schneller auf den Markt als Testmethoden etabliert werden.",
        difficulty = 5,
        funFact = "2017 schickte die US-Anti-Doping-Agentur (USADA) Warnbriefe an alle US-Sportler: Sie haetten in geplanten Supplement-Tests 70% der Online-SARM-Produkte als falsch deklariert gefunden – Produkte, die als 'natuerlicherweise Nahrungsergaenzung' vermarktet wurden, enthielten tatsaechlich SARMs, Prohormon oder andere verbotene Substanzen."
    ),

    // Question 38 – Anti-doping: Therapeutic Use Exemption
    Question(
        categoryId = 6,
        questionText = "Welches Kriterium muss NICHT erfuellt sein, damit eine Therapeutic Use Exemption (TUE) nach WADA-Code Artikel 4.4 genehmigt werden kann?",
        answerA = "Keine akzeptable therapeutische Alternative ohne die verbotene Substanz",
        answerB = "Die verbotene Substanz oder Methode ist medizinisch noetig",
        answerC = "Die Verwendung der verbotenen Substanz wurde vor Beginn der Erkrankung dokumentiert",
        answerD = "Die Anwendung fuehrt nicht zu einer Leistungssteigerung ueber das 'normale' Gesundheitsniveau hinaus",
        correctAnswer = 2,
        explanation = "TUE-Kriterien (WADA International Standard): 1) Medizinische Notwendigkeit, 2) keine akzeptable Alternative, 3) keine Leistungssteigerung ueber normales Gesundheitsniveau hinaus. Eine Vordiagnose vor Karrierebeginn ist kein Pflichtkriterium – Erkrankungen koennen waehrend der Karriere entstehen. Der Zeitpunkt der Diagnose ist irrelevant.",
        difficulty = 5,
        funFact = "Der Fancy-Bears-Hack (2016) veroeffentlichte TUE-Daten von Weltathleten: Simone Biles hatte TUE fuer Methylphenidat (ADHS), Bradley Wiggins fuer Kortikosteroide vor Grand Tours. Dies loeste Debatte aus, ob TUE-System fuer legitime Behandlung oder als Doping-Schlupfloch missbraucht wird. WADA verschaerfte seitdem TUE-Genehmigungsstandards."
    ),

    // Question 39 – Anti-doping: Urine sample manipulation
    Question(
        categoryId = 6,
        questionText = "Welche chemische Eigenschaft macht kuenstliches Ersetzen oder Verduennen von Urinproben bei WADA-Tests detektierbar, und welche Substanz versuchten Athleten historisch zur Urin-Substitution zu verwenden?",
        answerA = "Urin-Spezifisches Gewicht (SG) und Kreatinin-Konzentration: Werte unter SG 1.003 oder Kreatinin < 2 mmol/L = verduennte Probe (A-Probe ungueltig); Katheterharnblase-Implantate wurden genutzt",
        answerB = "pH-Wert: Synthetischer Urin hat pH 6.5 exakt, natuerlicher Urin variiert 4.5-8.5; pH-Sensoren detektieren Faelschungen sofort",
        answerC = "Urintemperatur: Probe muss 34-38 Grad C haben; Athleten kuehlten Substitut-Urin auf Zimmertemperatur, das wurde kalt detektiert",
        answerD = "Protein-Elektrophorese: Menschlicher Urin enthaelt spezifische Tamm-Horsfall-Glykoproteine, die in synthetischem Urin fehlen",
        correctAnswer = 0,
        explanation = "WADA-Standard: Proben mit spezifischem Gewicht < 1.003 oder Kreatinin < 2 mmol/L werden als 'zu verduennt' eingestuft und als 'keine Probe' behandelt. Athleten versuchten sog. 'Whizzinator'-Geraete (kuenstliche Penisprothesen mit Fremdurin) oder Katheter; beruehmtester Fall: Tyler Hamilton und das Blutdoping-Netz.",
        difficulty = 5,
        funFact = "Der 'Whizzinator' – ein Kunststoff-Penis-Geraet mit warmem Kunsturin – wurde tatsaechlich von Sportlern und Arbeitnehmern bei Drogentests verwendet und war zeitweise legal kauflich. 2008 verhafteten US-Behoerden die Hersteller wegen 'drug paraphernalia'-Verstoss. Das Geraet ist weiterhin in modifizierter Form verkaeufllich fuer 'Fetisch-Zwecke'."
    ),

    // Question 40 – Anti-doping: Retesting stored samples
    Question(
        categoryId = 6,
        questionText = "Fuer wie viele Jahre koennen laut WADA-Code Doping-Proben fuer Retesting aufbewahrt werden, und welcher hochkaeretige Fall bewies erstmals den Wert von 10-Jahres-Archivierungen?",
        answerA = "5 Jahre; Alexander Winokurow (Tour 2007 Blutdoping) wurde 2008 durch 1-Jahr-alte Proben-Reanalyse ueberführt",
        answerB = "10 Jahre; Lance Armstrong-Proben aus der Tour 1999 wurden 2013 (14 Jahre!) reanalysiert, was zwar verjaehrt war, aber EPO-Spuren zeigte",
        answerC = "8 Jahre; USADA-Archivierungen der Sydney-2000-Proben fuehrten 2009 zu 9 retroaktiven Sperren",
        answerD = "15 Jahre; Proben der Moskauer Olympiade 1980 wurden 2016 reanalysiert und bestaetigten systemisches DDR-Doping",
        correctAnswer = 1,
        explanation = "Der WADA-Code schreibt seit 2015 10-Jahres-Aufbewahrung vor (zuvor 8 Jahre). Armstrongs USPS-Proben aus der Tour de France 1999 wurden 2013 von einem Franzosischen Forscherteam reanalysiert: 6 Proben zeigten EPO-Positivbefunde, aber da die Frist von 8 Jahren (damalige Regelung) abgelaufen war, war keine offizielle Sperre moeglich. Es diente nur als Beweismoment fuer seine USA-TODAY-Enthuellungen.",
        difficulty = 5,
        funFact = "Bei den Olympia-Reanalysen 2016/2017 von Peking-2008-Proben wurden insgesamt 45 Athleten aus 23 Laendern nachtraeglich positiv getestet – der groesste Massen-Retesting-Skandal in der Geschichte. Die meisten Faelle betrafen Gewichtheben, Ringen und Leichtathletik. Einige Athleten hatten zu diesem Zeitpunkt bereits ihre olympischen Karrieren abgeschlossen."
    ),

    // ── Sportarchaeologie (10) ────────────────────────────────────────────────

    // Question 41 – Sports archaeology: Earliest ball game evidence
    Question(
        categoryId = 6,
        questionText = "Welche archaeologische Fundstaette liefert den aeltesten Beweis fuer ein organisiertes Ballspiel mit definierten Regeln und Spielerausruestung, und aus welcher Epoche stammt sie?",
        answerA = "Teotihuacan, Mexiko (250-650 n. Chr.): Kautschukball-Reste und Wandmalereien mit Schutzausruestung",
        answerB = "Paso de la Amada (Soconusco, Mexiko/Guatemala), 1400 v. Chr.: Frueheste formale Ballspiel-Platzanlage der Olmeken-Vorgaengerkultur",
        answerC = "Chichen Itza (Yucatan), 900 n. Chr.: Groesster erhaltener Ballspielplatz mit Steinring-Toren und Dekorationsreliefs",
        answerD = "Susa (Elam, Iran), 3000 v. Chr.: Keilschrift-Tontafeln beschreiben erstmalig strukturierte Ballspiel-Wettbewerbe",
        correctAnswer = 1,
        explanation = "Ausgrabungen in Paso de la Amada (Chiapas, Mexiko) durch Hill & Clark (2001) enthuelten einen formalen Ballspiel-Platz aus ca. 1400 v. Chr. – circa 300-400 Jahre aelter als alle Olmeken-Fundplaetze. Dies belegt organisiertes Ballspiel in der Praeklassik-Periode, vor den Olmeken als 'Mutterkultur'.",
        difficulty = 5,
        funFact = "Mesoamerikanische Ballspiele (Ulama) wurden mit einem schweren Kautschukball (bis 3 kg) gespielt, der nur mit Hueften, Oberschenkeln und Ellbogen (nie Haenden oder Fuessen) beruehrt werden durfte. Die Verlierungsform variierte: In manchen Kulturen wurden Spieler geopfert, in anderen wurde dem Gewinner geopfert – weil er die Gotter erfreut hatte."
    ),

    // Question 42 – Sports archaeology: Ancient swimming depictions
    Question(
        categoryId = 6,
        questionText = "Welche archaeologischen Funde aus der Sahara-Region geben Hinweis auf das aelteste Schwimmen als bewusst ausgeuebte Aktivitaet und auf welches Alter werden sie datiert?",
        answerA = "Hoehlenmalereien in Wadi Sura (Libyen, 'Cave of Swimmers'), ca. 10.000 Jahre alt, zeigen anthropomorphe Figuren in schwimmaehnlichen Positionen",
        answerB = "Assyrische Reliefs in Ninive (ca. 700 v. Chr.) zeigen Soldaten, die Flussueberquerungen mit aufgeblasenen Tierblasen ueben",
        answerC = "Aegyptische Papyrusrollen aus dem Neuen Reich (1550-1070 v. Chr.) beschreiben Schwimmunterricht als Teil der Kriegerausbildung",
        answerD = "Griechische Vasenmalereien (600 v. Chr.) aus Korinth zeigen einen strukturierten Schwimmwettkampf mit Richtern und Startmarke",
        correctAnswer = 0,
        explanation = "Die 'Cave of Swimmers' in Wadi Sura (Libysches Gebirge, Gill Kebir), entdeckt 1933 von Almasy, zeigt Felszeichnungen aus ca. 8.000-10.000 Jahre, die Menschen in schwimmaehnlichen Bewegungen darstellen. Die Sahara war damals feuchter ('Green Sahara' im Holozaen). Diese Bilder gelten als fruehester Hinweis auf intentionales Schwimmen.",
        difficulty = 5,
        funFact = "Die 'Cave of Swimmers' wurde durch Anthony Minghellas Film 'Der englische Patient' (1996) weltweit bekannt: Die Figur Almasy entdeckt die Hoehle im Film. Der reale Laszlo Almasy (ungarischer Forscher) entdeckte sie 1933 tatsaechlich und publicierte die Funddaten, was spaeter als Grundlage fuer den Roman von Michael Ondaatje diente."
    ),

    // Question 43 – Sports archaeology: Roman gladiator cemetery
    Question(
        categoryId = 6,
        questionText = "Welche osteoarchaeologischen Befunde am 2007 entdeckten Gladiatoren-Friedhof in Ephesos (Tuerkei) widerlegen oder bestaetigen popualaere Vorstellungen ueber Gladiatorenkaempfe?",
        answerA = "Fehlende Verletzungen am Skelett widerlegen, dass Gladiatoren tatsaechlich kaempften; die Arena-Kaempfe waren inszeniert wie Wrestling",
        answerB = "Skelette zeigen einseitige Muskelansatz-Hypertrophie, abgeheilte Frakturheliungen, und Kehlkopf-Durchtrennnungen mit scharfen Instrumenten – letzteres deutet auf kontrollierte Toetung als Gnadenstoss hin",
        answerC = "Alle Skelette zeigen Hirnschaedeltrauma, was beweist, dass Kopftreffer haeufigste Todesursache waren, entgegen des Colosseum-Bildmaterials",
        answerD = "Genetische Analyse zeigt, dass 90% der Gladiatoren aus Nordafrika und dem Nahen Osten stammten, nicht aus lokaler Sklavenschaft",
        correctAnswer = 1,
        explanation = "Karl Grosschmidts forensisch-anthropologische Analyse des Ephesos-Friedhofs (University of Vienna, 2007-2009) zeigte: Einseitige Knochenveraenderungen (dominant training-Arm), zahlreiche heilende Frakturen ohne toedliche Verletzungen (Gladiatoren wurden medizinisch versorgt), und bei vielen ein praziser Schlag/Schnitt zur Jugularvene oder Halswirbelsaeule – typisch fuer rituellen Gnadenstoss.",
        difficulty = 5,
        funFact = "Der Ephesos-Gladiatoren-Friedhof umfasst 67 Bestattungen aus dem 2.-3. Jahrhundert n. Chr. Isotopenanalysen zeigten, dass die Gladiatoren vegetarisch ernährt wurden mit hohem Kohlhydratanteil (Gerste, Huelsenfruechte) – was zu ihrer Spitzname 'Gerstenmenschen' (Hordearii) passt. Subkutanes Fett schuerzte dem Muskel-darunter und schuerzte beim Schnitt sichtbares, dramatisches Bluten."
    ),

    // Question 44 – Sports archaeology: Olympic site excavation
    Question(
        categoryId = 6,
        questionText = "Welche Kontroverse umgibt die Rekonstruktion des antiken Stadions von Olympia hinsichtlich der Laufbahn-Ausrichtung, die erst durch Ausgrabungen der Deutschen Archaeologischen Instituts (1960-1980) geklart wurde?",
        answerA = "Die Laufbahn war entgegen frueher Annahme kreisfoermig, nicht gerade – was die Laenge des Stadions neu bestimmte",
        answerB = "Das Stadion wurde in drei Bauphasen (7., 5. und 3. Jh. v. Chr.) verschoben und ausgerichtet; in der Endphase lief man mit dem Altis-Tempel im Ruecken, was religiose Ausrichtung bestaetigt",
        answerC = "Das Stadion hatte keine festen Zuschauerplaetze ausser Ehrenpodesten, was organisierte Massen-Zuschauer widerlegt",
        answerD = "Ausgrabungen fanden keine Startlocher (Balbis), was beweist, dass Starts ungeregelt und unstrukturiert waren",
        correctAnswer = 1,
        explanation = "Alfred Mallwitz' Ausgrabungen (DAI) zeigten drei Bauphasen: Stadium I (Fruehes Archaikum, 7./6. Jh.) lag weiter west; Stadium II (5. Jh.) wurde verlegt; Stadium III (3. Jh.) mit Erdwaellen fuer bis zu 40.000 Zuschauer in aktueller Position. Die Ausrichtung aenderte sich mit der architektonischen Entwicklung des Heiligen Bezirks (Altis).",
        difficulty = 5,
        funFact = "Die Balbis (Startanlage) im antiken Stadion war ein Marmorstein mit Furchen fuer die Zehen – keine moderneren Startbloecke. In Olympia wurden zwei Balbis-Steine gefunden: eine fuer den Start und eine fuer das Ziel, identisch gebaut. Der Lauf-Stadion war 192,27 m lang, was nach der Tradition einem Fuss des Herakles entsprechen soll."
    ),

    // Question 45 – Sports archaeology: Minoan bull leaping
    Question(
        categoryId = 6,
        questionText = "Was zeigt die sportarchaeologische Analyse der minoischen 'Stierspringer'-Darstellungen (Knossos, ca. 1500 v. Chr.) ueber die tatsaechliche Ausfuehrbarkeit dieser Darbietung, und welche zwei Interpretationen konkurrieren?",
        answerA = "Biomechanische Studien beweisen, dass Stierspringen ausfuehrbar ist; alle Darstellungen sind realistische Momentaufnahmen",
        answerB = "Stierspringen ist biomechanisch unmoeglich: Die Bewegungsfolge auf Fresken ist physikalisch nicht ausfuehrbar und repraesentiert mytholigischen Inhalt, keine echte Praxis",
        answerC = "Zwei Theorien: (1) Realistische Darstellung einer akrobatischen Ritualdarbietung mit gezaehmten Stieren; (2) symbolisch-mythologische Szene ohne realen Hintergrund; moderene Simulation (2012) stuetzt Theorie 1 als physikalisch moeglich, aber extrem gefaehrlich",
        answerD = "Stierdarstellungen zeigen tatsaechlich Pferde, keine Stiere – eine bis 2005 perpetuierte Fehlinterpretation",
        correctAnswer = 2,
        explanation = "Kontroverse besteht seit Jahrzehnten: Skeptiker (wie Marinatos) halten die dargestellte Bewegung (Griff an Hoerner, Vaulting ueber den Ruecken) fuer mythologisch. Eine 2012er Studie (Sheffield University) simulierte die Bewegungssequenz und zeigte: Mit spezifischem Training und Timing ist ein Satz ueber den Stierruecken physikalisch moeglich, aber nur bei kooperativen (nicht wilden) Stieren.",
        difficulty = 5,
        funFact = "Der Toreador-Fresco im Palast von Knossos (spaet-minoisch, ca. 1450 v. Chr.) zeigt sowohl maennliche als auch weibliche Stiersspringer – erkennbar an der Hautfaerbung (Maenner braun, Frauen weiss nach aegyptischer Konvention). Dies ist eines der fruehesten Hinweise auf mixed-gender Sportveranstaltungen in der Geschichte."
    ),

    // Question 46 – Sports archaeology: Viking games
    Question(
        categoryId = 6,
        questionText = "Welches Brettspiel-Artefakt aus Wikingerzeitaltern (8.-11. Jh.) zeigt Sportarchaeologen, dass strategische Denkspiele als Vorbereitungstraining fuer Kriegsfuehrung und Jagd kultiviert wurden?",
        answerA = "Hnefatafl-Bretter und Spielsteine (z.B. Lewis-Chessmen, 1150 n. Chr.): Das asymmetrische Strategie-Spiel erfordert Verteidigungsplanung gegen Ueberzahl",
        answerB = "Skaering-Halstatt-Knochen-Wuerfel (ca. 900 n. Chr.): Zeigen, dass Glueck dem Koenig-Strategy-Spielen vorgezogen wurde",
        answerC = "Birka-Schachfiguren (800 n. Chr.): Aelteste nordeuropaeische Schachfunde belegen arabischen Import von Strategie-Denkweise",
        answerD = "Gotland-Steinstelen-Inschriften dokumentieren organisierte Wett-Turniere in Tafeln aequivalentem zu modernem Backgammon",
        correctAnswer = 0,
        explanation = "Hnefatafl ('Koenigstisch') wurde auf Brettern mit 7x7 oder 11x11 Feldern gespielt: Ein Koenig muss entkommen, Angreifer ueberwinden Verteidiger. Dies erfordert strategisches Denken in asymmetrischen Kraefteverhaeltnissen – was Militaerhistoriker mit Vikinger-Kriegstaktik analogisieren. Funde in Norwegen, Island und Scotland belegen weite Verbreitung.",
        difficulty = 5,
        funFact = "Die Lewis Chessmen (1150 n. Chr., gefunden auf den Aeusseren Hebriden, wahrscheinlich skandinavisch gefertigt) sind zwar technisch Schachfiguren, nicht Hnefatafl-Steine, aber ihr Stil reflektiert wikingerzeitliche Ikonographie. Sie werden heute zwischen dem British Museum (82 Stuecke) und dem Scottish National Museum (11 Stuecke) geteilt – ein Streit, der seit Jahrzehnten andauert."
    ),

    // Question 47 – Sports archaeology: Ancient wrestling
    Question(
        categoryId = 6,
        questionText = "Welches archaeologische Fundensemble in Baquis-Ta (Sueden Iraks) gilt als fruehester Nachweis organisiertes Ringen mit Schiedsrichter-Funktion, und auf welches Jahrtausend datiert es?",
        answerA = "Sumerische Bronzestatuette (ca. 2600-2400 v. Chr., Baghdad Museum), die zwei Ringer und eine dritte stehende Figur mit Arm zwischen den Kaempfern zeigt",
        answerB = "Hethitische Keilschrift-Tontafeln (1600 v. Chr.) beschreiben Ringen als koeniglichen Sport mit Schiedsrichter-Kodex",
        answerC = "Aegyptische Wandmalereien in Beni Hassan (ca. 2000 v. Chr.) zeigen 122 Ringkampf-Paare mit einer Richter-Figur",
        answerD = "Minoische Siegelsteine (ca. 1700 v. Chr.) zeigen Ringen-Szenen mit Punkt-Zaehler-Figuren",
        correctAnswer = 0,
        explanation = "Die Khafajah-Bronzestatuette (Kish-Region, ca. 2600-2400 v. Chr., jetzt im Baghdad Museum) zeigt zwei Ringer im Schultergriff und eine dritte Person, deren Arm zwischen beide tritt – interpretiert als Schiedsrichter-Eingriff. Dies ist der frueheste dreidimensionale Beweis fuer geregeltes Ringen mit einer Aufsichtsfunktion.",
        difficulty = 5,
        funFact = "Im Gilgamesh-Epos (frueheste Version ca. 2100 v. Chr.) ist der Ringkampf zwischen Gilgamesh und Enkidu eine zentrales narratives Element: Der Kampf endet unentschieden, was zur Freundschaft der beiden Helden fuehrt. Dieses Motiv – Ringkampf als Freundschaftsgruendung – taucht spaeter in der griechischen Mythologie (Herakles vs. Antaios) und anderen Kulturen auf."
    ),

    // Question 48 – Sports archaeology: Polo origins
    Question(
        categoryId = 6,
        questionText = "Welches Text-Artefakt aus dem Sassaniden-Reich (224-651 n. Chr.) liefert die frueheste explizite Beschreibung von Polo als organisierter Teamsport mit Regeln, und in welcher Sprache ist es verfasst?",
        answerA = "Mittelpersisches Traktat 'Karnama-i Ardeshir-i Papakan' (3. Jh. n. Chr.), das Polo als koenigliche Pruefungsuebung beschreibt",
        answerB = "Arabisches Gedicht von al-Mutanabbi (10. Jh. n. Chr.), das Polo am Abbasiden-Hof beschreibt",
        answerC = "Chinesische Tang-Dynastie-Chronik (618-907 n. Chr.), die Polo-Regeln fuer Hofturnier dokumentiert",
        answerD = "Parthisches Graffito in Nisa (2. Jh. v. Chr.), das Reiter mit Schlaegern in einem umzaeunten Bereich zeigt",
        correctAnswer = 0,
        explanation = "Das mittelpersische (Pahlavi) Karnama-i Ardeshir-i Papakan beschreibt Polo (Chawgan) als Koenigstest: Ardeshir II. muss im Polo seine Ueberlegenheit beweisen. Dies ist die frueheste narrative Beschreibung mit Regeln (Mannschaften, Tore, Schlaeger-Einsatz). Archaeologische Polo-Grounds wurden in Persepolis und Pasargadae gefunden.",
        difficulty = 5,
        funFact = "Darius I. (522-486 v. Chr.) soll Polo als strategische Reitereituebung einfuehrt haben. Der aelteste erhaltene Polo-Ground gilt als der in Isfahan, Iran, dem Naqsh-e-Jahan-Platz (17. Jh.) mit seinen Torpfosten aus der Safawiden-Zeit – noch heute als UNESCO-Welterbe besichtigt und nach wie vor fuer Polo-Demonstrationen genutzt."
    ),

    // Question 49 – Sports archaeology: Mayan ball court sacrifices
    Question(
        categoryId = 6,
        questionText = "Welche archaeologische Entdeckung aus El Tajin (Veracruz, Mexiko) klaerte erstmals, WER bei mesoamerikanischen Ballspielritualen geopfert wurde, und widerlegte dabei die populaere 'Verlierer-Opfer'-Theorie?",
        answerA = "Skulptur-Reliefs am 'South Ball Court' (ca. 600-900 n. Chr.) zeigen den Sieger-Anfu(h)rer mit abgeschnittenem Kopf – was Opfer des Gewinners (nicht Verlierers) belegt",
        answerB = "Knochenfunde zeigen ausschliesslich weibliche Opfer, was eine Frauen-Kriegsgefangene-Theorie stuetzt",
        answerC = "Inschriften belegen, dass nur Schiedsrichter geopfert wurden, wenn das Spiel 'nicht gottgefaellig' verlief",
        answerD = "Genetische Analyse der Opferknochen zeigt ausschliesslich nicht-lokale Abstammung, was Kriegsgefangene-Opfer-Theorie bestaetigt",
        correctAnswer = 0,
        explanation = "Der 'South Ball Court' von El Tajin zeigt in sechs Panels die Sequenz eines Ballspiels mit finalem Opferritual: Panel 4 zeigt einen Spieler, der von anderen gehalten wird und einen Obsidian-Dolch in der Brust hat – und er traegt Sieger-Insignien. Arqueologe Rex Koontz (2009) argumentiert, dass es der Sieger war, der als Gottheit-Kandidat geehrt und geopfert wurde.",
        difficulty = 5,
        funFact = "Die 'Verlierer werden geopfert'-Theorie stammte hauptsaechlich aus spanischen Kolonialquellen des 16. Jahrhunderts, die moegicherweise Einheimischen-Aussagen missverstanden oder Propaganda verbreiteten. Die archaeologische Realitaet ist komplexer: Anthropologen vermuten, dass in verschiedenen Epochen und Regionen unterschiedliche Opferregeln galten."
    ),

    // Question 50 – Sports archaeology: Indus Valley sports
    Question(
        categoryId = 6,
        questionText = "Welche Funde aus der Indus-Tal-Zivilisation (Mohenjo-Daro und Harappa, ca. 2600-1900 v. Chr.) lassen Sportarchaeologen auf organisierte Freizeitaktivitaeten schliessen, und welcher Fund ist dabei besonders signifikant?",
        answerA = "Steinstadion-Fundamente in Mohenjo-Daro mit Kapazitaet von 10.000 Zuschauern, vergleichbar mit spaethellenisteischen Amphitheatern",
        answerB = "Tonfiguren von Akrobaten, geometrisch-verzierte Spielsteine aus Steinzug und ein Urform-Spielbrett (Schach-Vorlaeuferspiel), kombiniert mit dem Grossen Bad als rituell-sportlichem Reinigungsort",
        answerC = "Keilschrift-Tontafeln, die Sportereignisse mit Wetteinsaetzen in der Handelssprache der Indus-Kultur beschreiben",
        answerD = "Kupfer-Figurinen von Ringkaempfern mit erkennbarem Schiedsrichter-Motiv in einheitlicher Ausruestung",
        correctAnswer = 1,
        explanation = "Ausgrabungen in Mohenjo-Daro und Harappa lieferten: Spielfiguren (Terrakotta-Akrobaten, Spinn-Tops), Spielsteine mit Geometriemustern, ein fruehes Spielbrett (vermutlich Vorlaeaeufer von Pachisi/Chaupar/Schach), und der Grosse Bad (Grosse Bath) wird als rituell-hygienisches Zentrum interpretiert. Keine Sportstadien – aber Belege fuer gesellschaftliche Freizeitkultur.",
        difficulty = 5,
        funFact = "Das Pachisi-Spiel (Vorlaeaufer von 'Mensch aergere dich nicht' und Ludo) wurde moeglicherweise in der Indus-Tal-Zivilisation entwickelt. Akbar der Grosse (Mughal-Kaiser, 16. Jh.) spielte eine Grossversion auf seinem Palasthof in Fatehpur Sikri, wo lebende Personen als Spielfiguren dienten – ein 'Royal Pachisi Court' ist noch heute sichtbar."
    )
)
