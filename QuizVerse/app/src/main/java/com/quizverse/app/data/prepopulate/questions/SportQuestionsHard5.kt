package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsHard5(): List<Question> = listOf(

    // ── Sportsoziologie (8) ────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welches Konzept beschreibt Pierre Bourdieus Analyse des Sports als sozialen Raum, in dem verschiedene Kapitalformen reproduziert werden?",
        answerA = "Die 'strukturelle Assimilation', bei der Sport ethnische Unterschiede nivelliert",
        answerB = "Das 'Feld' als autonomer sozialer Raum mit eigenen Logiken, Regeln und Kapitalformen",
        answerC = "Die 'Subkultur-Theorie', bei der Sportgruppen eigene Normen entwickeln",
        answerD = "Das 'Humankapital-Modell', das Sporterfolg durch genetische Voraussetzungen erklaert",
        correctAnswer = 1,
        explanation = "Bourdieu analysierte Sport als soziales Feld mit eigenem oekonomischem, kulturellem und sozialem Kapital. Sportpraktiken sind nie neutral: Sie reproduzieren Klassenunterschiede, da Zugang zu bestimmten Sportarten (z.B. Golf, Tennis) von sozioekonomischem Status abhaengt.",
        difficulty = 3,
        funFact = "Bourdieu selbst war begeisterter Rugbyspieler in seiner Jugend. Seine Feldforschungen in Algerien beeinflussten seine spaetere Sicht auf Sport als Arena sozialer Distinktion."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter dem soziologischen Begriff 'Sportifizierung' (Sportization) nach Norbert Elias und Eric Dunning?",
        answerA = "Die zunehmende Professionalisierung und Kommerzialisierung aller gesellschaftlichen Bereiche durch Sport",
        answerB = "Den historischen Prozess, durch den Freizeitaktivitaeten zunehmend regelgebunden, wettbewerbsorientiert und emotional kontrolliert wurden",
        answerC = "Die Integration von Migrantengruppen in die Aufnahmegesellschaft durch gemeinsame Sportteilnahme",
        answerD = "Den Rueckgang traditioneller Volksspiele zugunsten moderner Wettkampfsportarten",
        correctAnswer = 1,
        explanation = "Elias und Dunning beschreiben Sportifizierung als Teil des umfassenderen Zivilisationsprozesses: Rohe Kampfspiele wurden durch feste Regeln, faire Austragung und emotionale Kontrolle in 'modernen Sport' transformiert. Fussball etwa entwickelte sich aus unkontrollierten Dorfschlachten zu einem reglementierten Wettbewerb.",
        difficulty = 3,
        funFact = "Elias begann sein Hauptwerk 'Ueber den Prozess der Zivilisation' im Londoner Exil. Er verband Sportgeschichte mit Manierenlehre und Staatsbildung zu einer einzigartigen Gesellschaftstheorie."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Phaenomen beschreibt der Begriff 'Stacking' in der Sportsoziologie?",
        answerA = "Die Tendenz, dass Sportler mit hoeherem sozioekonomischem Status bevorzugt fuehrende Positionen einnehmen",
        answerB = "Die ungleiche Verteilung von Athleten verschiedener Ethnizitaeten auf bestimmte Positionen, basierend auf Stereotypen",
        answerC = "Die Konzentration von Medienberichterstattung auf Einzelathleten statt auf Mannschaften",
        answerD = "Die Haeuftung von Verletzungen in bestimmten Karrierephasen von Leistungssportlern",
        correctAnswer = 1,
        explanation = "Stacking beschreibt, wie ethnische Stereotype die Positionsvergabe beeinflussen. Im American Football werden z.B. schwarze Spieler haeufiger auf athletischen Positionen (Wide Receiver, Cornerback) eingesetzt, waehrend weisse Spieler ueberproportional oft 'denkende' Positionen (Quarterback, Center) belegen.",
        difficulty = 3,
        funFact = "Der Begriff 'Stacking' wurde 1968 vom Soziologen Jack Olsen im Sports Illustrated gepraegte. Seitdem ist die Forschung zu Rasse und Sport in Nordamerika ein eigenes akademisches Feld."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die 'homologous reproduction' (gleichartige Reproduktion) im Sport-Management nach Acosta und Carpenter?",
        answerA = "Die biologische Weitergabe sportlicher Talente innerhalb von Sportler-Familien",
        answerB = "Die Tendenz von Entscheidungstraegern, Nachfolger mit aehnlichem Hintergrund, Geschlecht und Erfahrungen zu befoerdern",
        answerC = "Die gleichfoermige Trainingsplanung in professionellen Sportverbaenden",
        answerD = "Die Standardisierung von Wettkampfformaten durch internationale Sportfachverbaende",
        correctAnswer = 1,
        explanation = "Acosta und Carpenter zeigten, dass der Rueckgang weiblicher Trainerinnen nach dem Title IX-Gesetz (1972) paradoxerweise damit zusammenhing, dass maennliche Funktionaere bevorzugt maennliche Trainer einstellen. 'Men hire men' – dieses Muster erklaert strukturelle Ungleichheit in Sportverbaenden.",
        difficulty = 3,
        funFact = "Vor Title IX (1972) wurden 90% aller Frauenmannschaften in den USA von Frauen trainiert. Bis 2000 sank dieser Anteil auf unter 50%, weil Maenner das nun attraktivere Berufsfeld uebernahmen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Theorie erklaert, warum Sportstars in der modernen Gesellschaft zu 'parasoziale Beziehungen' erzeugen und wie Medien dies foerdern?",
        answerA = "Die Agenda-Setting-Theorie: Medien bestimmen, welche Themen als wichtig wahrgenommen werden",
        answerB = "Die parasoziale Interaktionstheorie: Zuschauer entwickeln einseitige, aber emotional reale Beziehungen zu Medienpersoenlichkeiten",
        answerC = "Die Kultivierungstheorie: Langzeitmedienkonsum formt soziale Realitaetswahrnehmung durch Wiederholung",
        answerD = "Die Framing-Theorie: Medien steuern durch Darstellungsweisen die Interpretation von Sportereignissen",
        correctAnswer = 1,
        explanation = "Parasoziale Interaktion bezeichnet die emotionale Bindung von Zuschauern an Medienpersoenlichkeiten, die keine Gegenseitigkeit kennt. Bei Sportstars ist dies besonders stark: Fans erleben Siege und Niederlagen als persoenliche Ereignisse, obwohl der Sportler sie nicht kennt. TV-Nahaufnahmen und Social Media verstaerken dies erheblich.",
        difficulty = 3,
        funFact = "Der Begriff 'parasoziale Interaktion' wurde 1956 von den Soziologen Horton und Wohl gepraegte. Die Intensitaet parasozialer Bindungen an Sportler ist laut Forschung oft staerker als die an Schauspieler oder Politiker."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter 'Sport-Hegemonie' im Sinne Antonio Gramscis, angewandt auf Nationalsport und Identitaet?",
        answerA = "Die militaerische Dominanz von Sportgrossnationen in internationalen Wettkampfstaetten",
        answerB = "Die Art, wie herrschende Klassen Sportkulturen nutzen, um ihre Werte als natuerlich und universal erscheinen zu lassen",
        answerC = "Die rechtliche Vorherrschaft nationaler Sportfachverbaende ueber regionale Vereine",
        answerD = "Das Monopol staatlicher Foerderinstitutionen auf die Ausbildung von Leistungssportlern",
        correctAnswer = 1,
        explanation = "Gramscis Hegemoniekonzept, auf Sport angewandt, zeigt: Nationalsport ist nie neutral. Die Propagierung bestimmter Sportwerte (Haerte, Wettkampf, Individualismus oder Kollektivismus) legitimiert gesellschaftliche Machtverhaeltnisse. Das Konzept erklaert, warum z.B. bestimmte Sportarten zum 'nationalen Charakter' erklaert werden.",
        difficulty = 3,
        funFact = "Cricket wurde in der britischen Kolonialzeit bewusst als Werkzeug kultureller Hegemonie eingesetzt. Die Kolonisierten uebernahmen den Sport, begannen aber auch, ihn gegen die Kolonialherren zu spielen und zu schlagen – ein klassischer Fall von Hegemonie-Aneignung."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher soziologische Begriff beschreibt das Phaenomen, dass Sportverletzungen systematisch bagatellisiert werden und Sportler trotz Schmerzen weitertrainieren?",
        answerA = "Pathologische Aufopferung – ein individuelles Persoenlichkeitsmerkmal von Leistungssportlern",
        answerB = "Die 'Sport-Ethik' (sport ethic) und Uebersozialisation in eine Kultur des Schmerzertragens",
        answerC = "Sekundaere Viktimisierung – gesellschaftliche Stigmatisierung verletzter Sportler",
        answerD = "Koerperkapital-Investition – rationale oekonomische Entscheidungen von Berufssportlern",
        correctAnswer = 1,
        explanation = "Der Sportsoziolog Jay Coakley beschreibt eine dominante 'sport ethic', die vier Normen umfasst: Hingabe an das Spiel, Streben nach Exzellenz, Akzeptanz von Risiko und Schmerz sowie Widerstand gegen Hindernisse. Wer diese Normen extrem internalisiert (Uebersozialisation), gefaehrdet seine Gesundheit.",
        difficulty = 3,
        funFact = "Studien zeigen, dass bis zu 80% aller Profisportler mit Verletzungen trainieren, die medizinisch zur Sportpause raten wuerden. Die Bereitschaft, 'fuer das Team zu leiden' wird soziologisch als erlernte, nicht natuerliche Verhaltensweise analysiert."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Konzept erklaert die Theorie der 'invented traditions' von Eric Hobsbawm im Kontext nationaler Sportrituale?",
        answerA = "Sporttraditionen sind biologisch verankerte Verhaltensweisen, die sich in Gemeinschaften spontan entwickeln",
        answerB = "Vermeintlich uralte Sportrituale sind oft kuerzlich erfundene Praktiken, die als historisch alt inszeniert werden, um nationale Identitaet zu stiften",
        answerC = "Sporttraditionen entstehen ausschliesslich durch wirtschaftliche Interessen kommerzieller Vereine und Verbaende",
        answerD = "Nationale Sportrituale sind unveraenderte Ueberlieferungen praeindustrieller Gemeinschaftsformen",
        correctAnswer = 1,
        explanation = "Hobsbawm zeigte, dass viele 'Traditionen' Erfindungen des 19. und fruehen 20. Jahrhunderts sind, die als altehrwuerdig inszeniert wurden. Im Sport: Zeremonien wie der Mannschaftsgesang vor WM-Spielen, bestimmte Trophaeenrituale oder 'nationale Sportarten' wurden oft bewusst konstruiert, um Nationalstolz zu foerdern.",
        difficulty = 3,
        funFact = "Die Highland Games in Schottland werden als uralte keltische Tradition vermarktet, wurden aber in ihrer heutigen Form erst im 19. Jahrhundert von Koenig Victoria popularisiert. Das Tragen von Tartanmustern war vor 1800 kaum verbreitet."
    ),

    // ── Sportmedizin & Verletzungen (7) ──────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die 'Ottawa Rules' und wofuer werden sie in der sportmedizinischen Notfallversorgung eingesetzt?",
        answerA = "Behandlungsrichtlinien fuer Hirnerschuetterungen im Eishockey, entwickelt von der Canadian Medical Association",
        answerB = "Klinische Entscheidungsregeln zur Bestimmung, ob nach Knoecheltrauma eine Roentgenaufnahme benoetigt wird",
        answerC = "Protokolle fuer die Rueckkehr zum Sport nach Kreuzbandrekonstruktion, basierend auf funktionellen Tests",
        answerD = "Internationale Standards fuer die Dopingkontrolle bei Wintersportereignissen in Nordamerika",
        correctAnswer = 1,
        explanation = "Die Ottawa Ankle Rules sind klinische Entscheidungsregeln: Eine Roentgenaufnahme ist nur noetig, wenn Knochenschmerz an spezifischen anatomischen Punkten vorliegt oder der Patient nicht 4 Schritte gehen kann. Ihre Einfuehrung reduzierte unnoetige Roentgenaufnahmen um 30-40% ohne diagnostische Sicherheit zu verringern.",
        difficulty = 3,
        funFact = "Die Ottawa Rules wurden 1992 von Ian Stiell und Kollegen am Ottawa Civic Hospital entwickelt und sind eine der am haeutigsten validierten klinischen Entscheidungsregeln in der Medizin. Sie werden weltweit in Notaufnahmen angewandt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Mechanismus erklaert das 'Tendinopathie'-Modell nach Cook und Purdam (2009) und warum ist es revolutionaer in der Sehnenbehandlung?",
        answerA = "Sehnen werden bei chronischer Ueberbelastung entzuendet; Entzuendungshemmer sind die Therapie der Wahl",
        answerB = "Sehnenpathologien folgen einem Kontinuum von reaktiver Tendinopathie bis Degeneration ohne obligate Entzuendung; Therapie zielt auf mechanische Belastungssteuerung",
        answerC = "Sehnenschaeden entstehen ausschliesslich durch direkte Traumata; chronische Beschwerden deuten auf Muskelprobleme hin",
        answerD = "Das Tendinopathie-Modell erklaert, warum Kortikosteroid-Injektionen langfristig die ueberlegene Therapieform sind",
        correctAnswer = 1,
        explanation = "Cook und Purdams Kontinuum-Modell revolutionierte die Sehnentherapie: Sehnenprobleme sind kein reines Entzuendungsgeschehen (daher veraltet 'Tendinitis'), sondern ein Spektrum von adaptiver reaktiver Verdickung bis zu degenerativem Umbau. Schweres exzentrisches Training und Laststeuerung sind evidenzbasierter als Antiphlogistika.",
        difficulty = 3,
        funFact = "Die Patella- und Achillessehne sind am haeuftigen von Tendinopathien betroffen. Spitzenfussballer haben ein lebenslanges Risiko von ueber 40% fuer Achillessehnenprobleme. Passive Therapien allein (Eis, Ruhe, NSAR) zeigen in Studien enttaeuschende Langzeitergebnisse."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Female Athlete Triad'-Syndrom und welche drei Komponenten umfasst es?",
        answerA = "Erhoehte Verletzungsrate, Hormonschwankungen und psychische Erkrankungen bei weiblichen Profiathletinnen",
        answerB = "Energiemangel (mit oder ohne Essstoerung), menstruelle Dysfunktion und verminderte Knochengesundheit",
        answerC = "Uebertraining, Eisenmangel und Hyponatriamie als typische Trias bei Ausdauersportlerinnen",
        answerD = "Anorexie, Amenorrhoe und Angstsyndrom als psychiatrische Trias im Leistungssport",
        correctAnswer = 1,
        explanation = "Die Female Athlete Triad (FAT) umfasst: 1) Relativer Energiemangel im Sport (RED-S), 2) Menstruelle Dysfunktion bis zur Amenorrhoe, 3) verminderte Knochenmineraldichte (erhoehtes Stressfrakturrisiko). Die drei Komponenten bedingen einander: Energiemangel supprimiert Hormone, was die Knochengesundheit schaedigt.",
        difficulty = 3,
        funFact = "Das IOC hat 2014 das breitere Konzept RED-S (Relative Energy Deficiency in Sport) eingefuehrt, das auch maennliche Athleten umfasst. Schaetzungsweise 25-50% aller weiblichen Ausdauersportlerinnen auf hohem Niveau zeigen Zeichen des Syndroms."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche biomechanische Erklaerung liefert die Wissenschaft fuer die erhoehte Kreuzbandverletzungsrate (ACL) bei weiblichen Athletinnen?",
        answerA = "Weibliche Athletinnen haben schwaecher ausgepraegte Quadrizepsmuskeln, was direkt zu ACL-Rissen fuehrt",
        answerB = "Multifaktorielle Ursachen: anatomische Unterschiede (Q-Winkel, Interkondylaerraum), hormonelle Einfluesse auf Ligamentelastizitaet und neuromuskulaere Aktivierungsmuster",
        answerC = "Weibliche Athletinnen trainieren haeufiger im Ermuedungszustand, was das ACL-Verletzungsrisiko verdreifacht",
        answerD = "Oestrogen versteift Ligamente, was bei Frauen zu haeufigerem Riss unter Belastung fuehrt",
        correctAnswer = 1,
        explanation = "Weibliche Athletinnen reissen das vordere Kreuzband 2-8x haeufiger als maennliche. Ursachen sind multifaktoriell: groesserer Q-Winkel (Beckenbreite), engerer Interkondylaerraum, oestrogener Einfluss auf Ligamentlaxitaet in der Zyklusmitte sowie neuromuskulaere Muster (mehr Quadrizeps- statt Hamstring-Dominanz bei Landebewegungen).",
        difficulty = 3,
        funFact = "Praeventionsprogramme wie das FIFA 11+ Aufwaermprogramm koennen ACL-Verletzungen bei Fussballerinnen um bis zu 50% reduzieren. Sie kombinieren Krafttraining, Gleichgewichtsuebungen und Landebewegungskorrekturen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die sportmedizinische Klassifikation 'Grad III' einer Muskelfaserverletzung nach dem British Athletics Muscle Injury Classification System?",
        answerA = "Vollstaendige Muskelruptur mit tastbarer Delle und sofortigem Funktionsverlust",
        answerB = "Grosse Faserverletzung mit >50% Querschnittsbeteiligung, aber erhaltener Muskelkontinuitaet",
        answerC = "Muskel-Sehnen-Uebergangszone-Verletzung mit moeglicher intratendinoser Komponente",
        answerD = "Diffuse Muskelprellung ohne fokale Schaedigung nach direktem Trauma",
        correctAnswer = 2,
        explanation = "Das Britische Klassifikationssystem unterscheidet Grad 0 (keine Verletzung), 1a/1b (minor), 2a/2b/2c (moderate), 3a/3b (major, Muskel-Sehnen-Uebergang) und 4 (vollstaendige Ruptur). Grad 3c spezifiziert intratendinoese Beteiligung. MRT-basierte Klassifikationen helfen bei Prognose und Rueckkehrzeitplanung.",
        difficulty = 3,
        funFact = "Der Oberschenkelmuskel (M. biceps femoris) ist am haeuftigen verletzt in Sprintsportarten. Die Rekonvaleszenzzeit bei Grad-3-Verletzungen betraegt typischerweise 6-12 Wochen, wobei das Rueckfallrisiko in der ersten Saison nach Verletzung bei 30% liegt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche physiologische Erklaerung steckt hinter dem 'DOMS'-Phaenomen (Delayed Onset Muscle Soreness) und warum ist die frueherer Hypothese zur Milchsaeure falsch?",
        answerA = "DOMS entsteht durch Milchsaureakkumulation, die den pH-Wert senkt und Schmerzrezeptoren aktiviert",
        answerB = "DOMS ist auf exzentrische kontraktionsinduzierten Mikrotraumen zurueckzufuehren, die eine inflammatorische Kaskade ausloesen; Laktat ist nach 1-2 Stunden vollstaendig metabolisiert",
        answerC = "DOMS ist ausschliesslich ein psychologisches Phaenomen ohne strukturelle Muskelschaedigung",
        answerD = "DOMS entsteht durch Krampfspasmus kleiner Muskelfasern nach erschoepfendem Training",
        correctAnswer = 1,
        explanation = "Die Milchsaeurehypothese ist widerlegt: Laktat wird binnen Stunden abgebaut, DOMS tritt aber 24-72 Stunden spaeter auf. Aktuelle Evidenz zeigt: Exzentrische Kontraktionen verursachen strukturelle Myofibrillen-Schaeden, die eine inflammatorische Kaskade (Leukozyteninfiltration, Zytokine) ausloesen. Diese Entzuendungsreaktion verursacht spaetere Schmerzempfindlichkeit.",
        difficulty = 3,
        funFact = "DOMS ist nach erstmaliger Belastungsform am staerksten und nimmt bei Wiederholung deutlich ab (Repeated Bout Effect). Dieser Schutzeffekt haelt teilweise Wochen an und ist Gegenstand aktiver Forschung zur Muskelprotein-Signalgebung."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Konzept beschreibt die 'Return to Sport'-Entscheidung nach Kreuzband-OP am besten nach aktuellem wissenschaftlichem Standard?",
        answerA = "Die 6-Monats-Grenze: Nach 6 Monaten ist anatomische Heilung abgeschlossen und Sport ist sicher",
        answerB = "Zeitbasierte und kriterienbasierte Entscheidung: Kombination aus Zeitfaktor, funktionellen Tests, Kraftasymmetrie und psychologischer Bereitschaft",
        answerC = "Bildgebende Diagnostik: MRT zeigt vollstaendige Sehneneinheilung und gibt freies Attest",
        answerD = "Schmerzfreiheit bei Alltagsaktivitaeten ist das einzig relevante Kriterium fuer die Sportfreigabe",
        correctAnswer = 1,
        explanation = "Aktuelle Leitlinien empfehlen eine biopsychosoziale Entscheidungsfindung: Mindestzeit (meist 9 Monate fuer Kontaktsportarten), funktionelle Tests (Einbeinsprung, Kraftsymmetrie <10% Differenz seitengleich), kognitive Tests und psychologische Fragebögen (z.B. ACL-RSI). Die Kombination aller Faktoren reduziert Rezidivraten erheblich.",
        difficulty = 3,
        funFact = "Studien zeigen, dass nur 65% aller Profiathletinnen und -athleten nach ACL-Rekonstruktion auf ihr vorheriges Leistungsniveau zurueckkehren. Einer der staerksten Praedikatoren ist nicht die koerperliche Kraft, sondern die psychologische Bereitschaft (Fear-avoidance-Modell)."
    ),

    // ── Sportrecht & Faelle (7) ──────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche Grundsatzentscheidung traf der Europaeische Gerichtshof (EuGH) im Fall 'Bosman' (1995) und welche langfristigen Folgen hatte sie fuer den europaeischen Fussball?",
        answerA = "Der EuGH erklaerte Doping-Sperren von mehr als 2 Jahren fuer unverhaaltnismaessig und kartellrechtswidrig",
        answerB = "Der EuGH kippte Transferentschaedigungen nach Vertragsende und Auslaenderklauseln als Verstoss gegen EU-Freizuegigkeit",
        answerC = "Der EuGH urteilte, dass Sportfachverbaende keine Schiedsklauseln vorschreiben duerfen und Athleten staatliche Gerichte anrufen koennen",
        answerD = "Der EuGH erklaerte die Vergabe von Grossereignissen durch FIFA und UEFA fuer wettbewerbsrechtswidrig",
        correctAnswer = 1,
        explanation = "Jean-Marc Bosman, ein belgischer Fussballprofi, klagte gegen Transferentschaedigung nach Vertragsende. Der EuGH entschied: EU-Buerger koennen als Arbeitsmigranten ohne Einschraenkung in anderen EU-Staaten arbeiten. Auslaenderklauseln fuer EU-Buerger sind unzulaessig. Die Folge: Explosion von Spielergehaeltern, dramatisch geaenderte Transfermaerkte.",
        difficulty = 3,
        funFact = "Bosman selbst konnte von seinem Urteil kaum profitieren: Er war zu diesem Zeitpunkt sportlich am Ende und kaempfte jahrelang mit finanziellen und gesundheitlichen Problemen. Das UEFA-Bosman-Urteil praegt aber bis heute den gesamten europaeischen Profisport."
    ),

    Question(
        categoryId = 6,
        questionText = "Was entschied der Court of Arbitration for Sport (CAS) im Fall 'Salnikov v. RUSADA' und was sagt es ueber die Beweislastumkehr im Dopingrecht aus?",
        answerA = "CAS-Faelle erfordern immer den vollen strafrechtlichen Beweisstandard 'jenseits vernuenftigen Zweifels' fuer Dopingverurteilungen",
        answerB = "Im Dopingrecht gilt das Prinzip der 'strict liability': Der Nachweis einer verbotenen Substanz genuegt fuer eine Sanktion, die Absicht spielt grundsaetzlich keine Rolle",
        answerC = "Verbaende muessen bei Doping-Vorverdacht die vollstaendige Kausal-Beweiskette lueckenlos belegen, bevor eine Sperre verhaengt werden darf",
        answerD = "CAS-Entscheidungen haben keinerlei Bindungswirkung fuer staatliche Gerichte und nationale Sportfachverbaende",
        correctAnswer = 1,
        explanation = "Der Grundsatz der 'strict liability' (strikte Haftung) im Anti-Doping-Recht besagt: Das Vorhandensein einer verbotenen Substanz im Koerper begrindet die Verletzung, unabhaengig von Vorsatz oder Fahrlassigkeit. Die Beweislast kehrt um: Der Athlet muss beweisen, wie die Substanz in seinen Koerper gelangt ist, um eine Sanktionsminderung zu erreichen.",
        difficulty = 3,
        funFact = "Der CAS in Lausanne ist das hoechste Sportschiedsgericht der Welt. Pro Jahr behandelt er ueber 600 Faelle. Die Entscheidungen sind durch Schiedsklauseln in Vertragswerken international bindend und koennen nur unter engen Voraussetzungen vor staatlichen Gerichten angefochten werden."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter dem sportrechtlichen Begriff 'whereabouts'-System (ADAMS) der WADA und welche Grundrechte stehen dabei auf dem Spiel?",
        answerA = "Ein GPS-Tracking-System, das Sportler waehrend Wettkampfveranstaltungen in Echtzeit ueberwacht",
        answerB = "Die Pflicht fuer Spitzensportler, Aufenthaltsorte quartalsweise zu melden und 1 Stunde taeglich fuer Tests verfuegbar zu sein – im Spannungsfeld mit Privatsphaerenrechten",
        answerC = "Ein internationales Register aller gesperrten Athleten, das oeffentlich zugaenglich ist und Wettkampfregistrierungen blockiert",
        answerD = "Die Pflicht, Medikamentenlisten bei nationalen Anti-Doping-Agenturen zu hinterlegen und alle Aenderungen innerhalb von 24 Stunden zu melden",
        correctAnswer = 1,
        explanation = "Das ADAMS-Whereabouts-System verpflichtet Topathletinnen im Registered Testing Pool dazu, taeglich einen 1-Stunden-Slot zu melden, in dem sie fuer unangekuendigte Kontrollen erreichbar sind. Drei versaeumt-dokumentierte Kontrollen innerhalb von 12 Monaten gelten als Dopingverstoss. Der Europaeische Gerichtshof fuer Menschenrechte wies Klagen gegen das System 2018 ab.",
        difficulty = 3,
        funFact = "Das Whereabouts-System wird von Athletenvereinigungen scharf kritisiert. Weltathleten-Vereinigung-Praesident Sebastian Coe selbst sprach von einem 'Eingriff in die Privatsphare', verteidigte aber das System als notwendig. Die Diskussion spiegelt den grundsaetzlichen Konflikt zwischen Integritaet des Sports und Persoenlichkeitsrechten wider."
    ),

    Question(
        categoryId = 6,
        questionText = "Welchen Prazendenzfall schuf das US-Supreme-Court-Urteil 'PGA Tour v. Casey Martin' (2001) fuer das Sportrecht?",
        answerA = "Das Urteil bestaetigt das uneingeschraenkte Hausrecht von Privatverbaenden, eigene Teilnahmeregeln ohne richterliche Kontrolle zu setzen",
        answerB = "Das Gericht verpflichtete die PGA Tour, einem Golfspieler mit Beinbehinderung die Nutzung eines Golfcarts zu ermoeglichen, da dies keine wesentliche Regelaenderung darstellt",
        answerC = "Das Urteil begruendete das Recht aller Profiathletinnen auf staatliche Foerderung unabhaengig von Verbandsmitgliedschaft",
        answerD = "Das Supreme Court erklaerte Transfersperren als Verstoss gegen den Sherman Antitrust Act und gab Spielergewerkschaften Kollektivverhandlungsrechte",
        correctAnswer = 1,
        explanation = "Casey Martin litt an einer Durchblutungsstoerung im Bein und konnte Golfturnierplaetze nicht vollstaendig ablaufen. Der Supreme Court entschied 7:2, dass der Americans with Disabilities Act (ADA) auf professionellen Sport anwendbar ist und die PGA Tour das Cart erlauben muss, ohne den Wesenskern des Wettkampfs zu veraendern.",
        difficulty = 3,
        funFact = "Casey Martin spielte tatsaechlich auf der PGA Tour und hatte zeitweise grosse Erfolge. Der Fall loeste eine breite Debatte aus, was den 'Kern' eines Wettkampfs ausmacht – ob das Laufen zum Golfspielen unverzichtbar gehoert oder nur eine Nebenkomponente ist."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Duty of Care'-Konzept im modernen Sportrecht und wie wurde es durch den Fall 'Smoldon v. Whitworth' (1997) konkretisiert?",
        answerA = "Verbandsvorsitzende haften persoenlich fuer finanzielle Schaeden durch Fehlentscheidungen ihrer Organisation",
        answerB = "Schiedsrichter koennen zivilrechtlich haften, wenn sie Verletzungen durch grob fahrlassige Spielleitung verursachen oder verhindern haetten koennen",
        answerC = "Trainer sind verpflichtet, bei erkennbaren Gehirnerschuetterungen Spieler sofort zu substituieren und haften bei Unterlassen strafrechtlich",
        answerD = "Veranstalter grosser Sportevents haften nur bei arglistig verschwiegenen Sicherheitsmaengeln an der Sportstatte",
        correctAnswer = 1,
        explanation = "In Smoldon v. Whitworth verurteilte das englische Court of Appeal einen Schiedsrichter zu Schadensersatz, weil er beim Rugby-Jugendscrummagen keine ausreichenden Sicherheitsmassnahmen anordnete und ein Spieler dauerhaft gelahmt wurde. Das Urteil etablierte: Schiedsrichter schulden Spielern eine 'duty of care' und koennen bei grober Fahrlassigkeit haftbar gemacht werden.",
        difficulty = 3,
        funFact = "Das Konzept 'Duty of Care' hat im britischen Sport seit den 2000er Jahren zu erheblichen Strukturveraenderungen gefuehrt. Verbandstraeger, Trainer und Schiedsrichter durchlaufen heute umfangreiche Sicherheitsschulungen, die auch rechtliche Haftungsfragen umfassen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was entschied der EuGH im bahnbrechenden Fall 'International Skating Union v. Kommission' (2023) in Bezug auf Schiedsklauseln im Sport?",
        answerA = "Der EuGH bestaetigt, dass Sportfachverbaende private Schiedsgerichte verpflichtend vorschreiben duerfen, solange der CAS den EU-Wettbewerbsrecht entspricht",
        answerB = "ISU-Regeln, die Athleten bei Teilnahme an nicht genehmigten Wettkampfen mit lebenslangen Sperren bedrohen, verstiessen gegen EU-Wettbewerbsrecht",
        answerC = "Der EuGH erklaert staatliche Sportfoerderung fuer wettbewerbsrechtlich unzulaessig, wenn sie bestimmten Verbaenden vorbehalten ist",
        answerD = "Athleten haben das Recht, ihren Arbeitsplatz frei zu waehlen; Monopolverbandssperren sind generell unvereinbar mit EU-Grundfreiheiten",
        correctAnswer = 1,
        explanation = "Der EuGH bestaetigt: ISU-Regeln, die Eisschnelllaeufer bei Teilnahme an nicht genehmigten Veranstaltungen mit lebenslanger Sperre bedrohten, verstiessen gegen Art. 101 AEUV (Kartellverbot). Sportorganisationen genossen keine generelle Wettbewerbsrechtsimmunitaet mehr. Das Urteil hat weitreichende Konsequenzen fuer die Monopolstellung grosser Sportfachverbaende.",
        difficulty = 3,
        funFact = "Der Fall begann, als die Eisschnelllaeufer Claudia Pechstein und Mark Tuitert versuchten, an der Konkurrenzveranstaltung 'SuperSkate' teilzunehmen. Die ISU-Sanktionsdrohungen hielten sie davon ab. Pechstein ist zudem aus ihrer jahrelangen Dopingsperre bekannt, die sie selbst stets bestritt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welchen Grundsatz statuierte das Schweizer Bundesgericht im Fall 'Canas v. ATP Tour' hinsichtlich des Schiedsrechts im Sport?",
        answerA = "Das Schweizer Bundesgericht ist niemals zust andig, CAS-Urteile in Dopingfaellen zu ueberpruefen",
        answerB = "CAS-Schiedsurteile koennen vom Schweizer Bundesgericht bei Verfahrensverstoss oder ordre-public-Verletzung aufgehoben werden, bestaetigt aber grundsaetzlich die Qualitaet des CAS",
        answerC = "Das Bundesgericht erklaerte, dass Verbands-Schiedsklauseln nur dann guelig sind, wenn Athleten sie ohne wirtschaftlichen Druck unterzeichnet haben",
        answerD = "Schweizer Gerichte erklaerten sich grundsaetzlich unzustaendig fuer alle internationalen Sportstreitigkeiten und verwissen auf den CAS",
        correctAnswer = 1,
        explanation = "Im Fall des argentinischen Tennisprofis Guillermo Canas (2007) anerkannte das Schweizer Bundesgericht die Kontrollfunktion ueber CAS-Urteile: Es kann eingreifen bei Verfahrensmaengeln, Verletzung von Grundrechten oder Widerspruch zum schweizerischen ordre public. Gleichzeitig bestaetigt das Gericht regelmaessig die Rechtmaessigkeit des CAS-Systems.",
        difficulty = 3,
        funFact = "Guillermo Canas wurde 2005 wegen eines Dopingverstosses gesperrt, bestritt aber seine Schuld. Er gewann 2007 ueberraschend gegen Roger Federer in Indian Wells. Sein Fall wurde einer der Leitfaelle fuer die Grenzen des Sportschiedsrechts in der Schweiz."
    ),

    // ── Sporternaehrung & Wissenschaft (7) ────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche physiologische Erklaerung liefert die aktuelle Wissenschaft fuer das Konzept 'Carbohydrate Periodization' im Ausdauersport?",
        answerA = "Kohlenhydrate muessen bei jeder Trainingseinheit maximal verfuegbar sein, um optimale Leistungen zu erzielen",
        answerB = "Gezielt kohlenhydratarmes Training aktiviert Signaladaptationen (z.B. AMPK), die die Fettoxidation und mitochondriale Biogenese foerdern, waehrend wettkampfnahes Training mit hoher Kohlenhydratzufuhr erfolgt",
        answerC = "Kohlenhydrat-Periodisierung bedeutet, alle vier Wochen eine ketogene Phase einzuschieben, die Glykogen-Superspeicher nach dem Refeed-Effekt erzeugt",
        answerD = "Sportwissenschaftler empfehlen grundsaetzlich, die Kohlenhydratzufuhr nach Koerpergewicht und nicht nach Trainingsvolumen zu berechnen",
        correctAnswer = 1,
        explanation = "Carbohydrate Periodization ('train low, compete high') nutzt gezielt glykogenarme Trainingszustaende, um molekulare Adaptation-Signalwege zu aktivieren: AMPK stimuliert mitochondriale Biogenese, PGC-1alpha wird hochreguliert. Wettkampfe werden aber mit vollstaendigen Glykogenspeichern bestritten. Das Konzept wurde massgeblich durch Forschungen von Jahn und Hansen entwickelt.",
        difficulty = 3,
        funFact = "Die praktische Umsetzung von 'train low' ist anspruchsvoll: Zu haeuftiges kohlenhydratarmes Training erhoet das Verletzungsrisiko und beeintraechtigt die Trainingsqualitaet. Profiteams nutzen detaillierte Ernaehrungsplaene, die mit Trainingsintensitaeten synchronisiert sind."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das Konzept 'Protein Muscle Full Effect' und welche Implikation hat es fuer die Proteinzufuhr von Kraftsportlern?",
        answerA = "Proteine werden nach dem Training zu 100% in Muskeln eingebaut; hoehere Mengen erhoehen proportional die Muskelmasse",
        answerB = "Nach einer Proteinmahlzeit werden Aminosaeuren maximal aufgenommen, dann folgt eine Refractory-Phase; Verteilung der Proteinzufuhr ueber den Tag ist wichtiger als Gesamtmenge pro Mahlzeit",
        answerC = "Pflanzliche Proteine erzeugen einen staerkeren 'Muscle Full Effect' als tierische, weshalb vegane Ernaehrung die Muskelsynthese optimiert",
        answerD = "Protein-Timing ist irrelevant; nur die Gesamttagesproteinmenge beeinflusst die Muskelproteinsynthese",
        correctAnswer = 1,
        explanation = "Der 'Muscle Full Effect' (Stewart Phillips, 2009) beschreibt, dass nach einer Proteinmahlzeit die Muskelproteinsyntheserate nach 3-4 Stunden wieder auf Basislevel sinkt, auch wenn noch Aminosaeuren verfuegbar sind. Optimale Strategie: 4-5 Mahlzeiten mit je 20-40g hochwertigem Protein, verteilt ueber den Tag, statt wenige grosse Mahlzeiten.",
        difficulty = 3,
        funFact = "Die optimale Proteinmenge pro Mahlzeit liegt laut aktuellen Studien fuer junge Athleten bei 20-40g (0,3-0,4g/kg). Aeltere Athleten benoetigen etwas mehr (40-60g), da die anabole Sensitivitaet der alternden Muskulatur abnimmt – bekannt als 'anabolic resistance'."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Mechanismen erklaeren die leistungssteigernde Wirkung von Natriumbicarbonat (Backpulver) als Puffersubstanz im Hochleistungssport?",
        answerA = "Natriumbicarbonat erhoet die Sauerstoffaufnahmekapazitaet des Blutes durch Bindung an Haemoglobin",
        answerB = "Natriumbicarbonat als extrazellulaerer pH-Puffer neutralisiert Laktat-bedingte Azidose, erhoet die Pufferkapazitaet des Blutes und verzoegert Muskelermuedung",
        answerC = "Backpulver stimuliert die Ausschuettung von Wachstumshormonen, die direkt die Muskelsynthese foerdern",
        answerD = "Natriumbicarbonat erhoet die Glykogenmobilisierung durch Aktivierung von Phosphofructokinase im aneroben Stoffwechsel",
        correctAnswer = 1,
        explanation = "Bei intensiver anaerober Belastung akkumulieren H+-Ionen (Protonenakkumulation, nicht Laktat selbst, verursacht Azidose). Natriumbicarbonat erhoeht die extrazellulaere Pufferkapazitaet: Bicarbonat nimmt H+-Ionen auf, die aus der Muskelzelle transportiert werden. Meta-Analysen zeigen durchschnittlich 1-2% Leistungssteigerung bei Belastungen von 1-7 Minuten.",
        difficulty = 3,
        funFact = "Natriumbicarbonat ist legal und nicht auf der WADA-Verbotsliste. Viele Athleten scheuen die Einnahme wegen gastrointestinaler Nebenwirkungen (Uebelekeit, Blähungen). Neuere Untersuchungen zeigen, dass enteric-coated Kapseln und Aufteilung der Dosis die Vertraeglichkeit verbessern."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die 'Gut Microbiome'-Forschung im Leistungssport, und welche konkreten Erkenntnisse liefern Studien zu Spitzenathletinnen?",
        answerA = "Darmflora hat keinen nachweisbaren Einfluss auf sportliche Leistung; Ernaehrungsinterventionen zielen ausschliesslich auf Energieverfuegbarkeit",
        answerB = "Leistungssportler zeigen spezifische Darmmikrobiom-Profile (z.B. erhoehte Veillonella atypica), die mit verbessertem Laktat-Metabolismus und Leistungsdaten korrelieren",
        answerC = "Probiotikaeinnahme steigert nachweislich aerobe VO2max um durchschnittlich 8-12% und wird deshalb von Spitzenathletinnen standardmaessig eingesetzt",
        answerD = "Das Darmmikrobiom beeinflusst ausschliesslich das Immunsystem, hat aber keine direkte Wirkung auf Muskelleistung oder Energiestoffwechsel",
        correctAnswer = 1,
        explanation = "Pionierarbeiten von Jonathan Scheiman (Harvard, 2019) analysierten das Darmmikrobiom von Boston-Marathon-Laeuferinnen. Veillonella atypica nutzt Laktat als Energiequelle und produziert Propionat, das als Energiesubstrat dient. Maeuseexperimente zeigten signifikant verbesserte Ausdauerleistung nach Veillonella-Transplantation. Die Forschung steht noch am Anfang.",
        difficulty = 3,
        funFact = "Der Harvard-Wissenschaftler Jonathan Scheiman gruendete 'FitBiomics' zur Kommerzialisierung dieser Erkenntnisse. Gleichzeitig warnen Experten vor voreiligen Produkten: Die kausalen Mechanismen sind noch nicht vollstaendig verstanden, und direkte Leistungssteigerung beim Menschen ist bisher nicht zuverlaessig reproduziert."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche physiologische Erklaerung steckt hinter dem 'Glycogen Supercompensation'-Protokoll und wie unterscheidet es sich von modernen evidenzbasierten Empfehlungen?",
        answerA = "Klassisches Protokoll (Astrand, 1967): 3 Tage Kohlenhydrat-Depletion, dann 3 Tage maximale Beladung; modernes Protokoll: 36 Stunden Hochkarb-Phase ohne Depletionsphase erzielt aehnliche Speichergroesse",
        answerB = "Glykogen-Superkompensation verdoppelt die Glykogenspeicher dauerhaft und muss nur einmal pro Saison durchgefuehrt werden",
        answerC = "Modernes Protokoll empfiehlt 7-taetige Kohlenhydratreduktion gefolgt von 3-taetigem Carb-Loading fuer maximale Superspeicherung",
        answerD = "Glykogen-Superkompensation ist nur bei Ausdauersportlern unter 30 Jahren wirksam und fuer Mastersathleten nicht empfohlen",
        correctAnswer = 0,
        explanation = "Das klassische Astrand-Protokoll (Depletionsphase + Beladungsphase) fuehrt zu bis zu 200% erhoehten Glykogenspeichern, bedingte aber intensives Ermuedungstraining. Burke et al. (2017) zeigten: Ein einfaches 36-48-Stunden-Hochkarb-Protokoll (8-12g KH/kg/d) ohne Depletion erzielt aehnliche Speicherfuellstande. Das alte Protokoll ist daher obsolet.",
        difficulty = 3,
        funFact = "Glykogenspeicher beeinflussen massgeblich die Ausdauerleistung: Bei vollstaendig gefuellten Speichern koennen trainierte Laeufer bei moderater Intensitaet etwa 2 Stunden Energie liefern. Maratonstarter mit suboptimalen Speichern erfahren den gefuerchteten 'Hungerast' (bonking) fruehzeitiger."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter 'Altitude Training' und warum erklaert die Wissenschaft unterschiedliche 'Live High, Train Low' vs. 'Live High, Train High'-Strategien?",
        answerA = "Beide Strategien sind gleichwertig; Entscheidend ist allein die Gesamthoehe und Aufenthaltsdauer, nicht der Trainingsort",
        answerB = "Live High, Train Low (LHTL) ermoeglicht Hoehenadaptation (EPO-Anstieg, erhoehte Erythrozytenmasse) waehrend hochintensive Trainingsqualitaet auf niedrigerer Hoehe erhalten bleibt",
        answerC = "Live High, Train High (LHTH) ist die wissenschaftlich ueberlegene Methode, da Sauerstoffmangel bei jeder Intensitaet die mitochondriale Dichte erhoet",
        answerD = "Hoehentraining ist wissenschaftlich widerlegt; EPO-Niveauveraenderungen kehren so schnell zurueck, dass kein Wettkampfvorteil entsteht",
        correctAnswer = 1,
        explanation = "Bei LHTH leidet die Trainingsqualitaet unter Sauerstoffmangel: Absolutes Lauftempo sinkt, Laktatthreshold-Trainingsreize fehlen. LHTL kombiniert den Vorteil der Hoehenadaptation (EPO-Stimulation, erhoehte Erythrozytenmasse durch Erythropoese-Aktivierung) mit unvermindert hoher Trainingsintensitaet im Flachland. Die Methode ist wissenschaftlicher Goldstandard fuer Ausdauersportlerinnen.",
        difficulty = 3,
        funFact = "Natuerliche EPO-Stimulation durch Hoehenaufenthalt ist legal, waehrend exogene EPO-Injektion verboten ist. Das Dilemma: Wissenschaftlich sind die physiologischen Effekte fast identisch. Die Grenze zwischen legalem Hoehentraining und illegalem Doping wird in der Sportphilosophie intensiv diskutiert."
    ),

    // ── Sportstatistik & Analytics (7) ────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die Sabermetrics-Metrik 'WAR' (Wins Above Replacement) im Baseball und warum ist sie revolutionaer?",
        answerA = "WAR misst die durchschnittliche Homerun-Rate eines Spielers bereinigt um Stadiongroesse und Windverhaeltnisse",
        answerB = "WAR quantifiziert den Gesamtbeitrag eines Spielers in Siegen gegenueber einem theoretischen Ersatzspieler auf Minimalliganiveau – kombiniert Batting, Fielding und Pitching in einer einzigen Kennzahl",
        answerC = "WAR beschreibt die Wahrscheinlichkeit, dass ein Spieler in einem Spiel zum spielentscheidenden Faktor wird, berechnet durch Monte-Carlo-Simulationen",
        answerD = "WAR ist eine auf dem Win-Probability-Modell basierende Kennzahl, die den statistischen Einfluss jedes Spielzugs auf die Siegchance berechnet",
        correctAnswer = 1,
        explanation = "WAR integriert alle Spielerleistungen in eine skalierbare Vergleichsmetrik: Ein WAR-Wert von 5 bedeutet, dieser Spieler hat dem Team 5 Siege mehr gebracht als ein beliefbarer Ersatzspieler (Minimalgehaltsebene). Die Metrik ermoeglicht epochen- und positionsuebergreifende Vergleiche und wurde durch Michael Lewis' 'Moneyball' beruehmt.",
        difficulty = 3,
        funFact = "Babe Ruths Saison 1923 wird auf WAR ~14 geschaetzt – einer der hoechsten Einzelsaisonwerte aller Zeiten. Moderne Spieler mit WAR ueber 8 gelten als MVP-Kandidaten. Die Metrik hat die Transferpolitik von MLB-Teams grundlegend veraendert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was misst die Metrik 'Expected Goals' (xG) im Fussball und welche statistischen Verfahren liegen ihr zugrunde?",
        answerA = "xG berechnet die Anzahl an Toeren, die ein Team in einem Spiel schiessen muesste, basierend auf Ballbesitzzeiten und Laufwegen",
        answerB = "xG quantifiziert fuer jeden Torschuss die historische Wahrscheinlichkeit eines Tores basierend auf Schussposition, -winkel, -art und Torhuetersituation – typischerweise durch logistische Regression oder Machine Learning",
        answerC = "xG ist eine Echtzeit-Visualisierung der Torschussgelegenheiten und wird ausschliesslich als Qualitaetskennzahl fuer Taktik-Coaching eingesetzt",
        answerD = "Expected Goals beschreibt die erwartete Torausbeute eines Teams bei idealer Chancenverwertung, also wenn jede Schussgelegenheit optimal ausgefuehrt wird",
        correctAnswer = 1,
        explanation = "xG-Modelle werden typischerweise durch logistische Regression oder Gradient Boosting auf historischen Schussdaten trainiert. Features: Entfernung, Winkel, Schusstyp (Kopf/Fuss/Direktabnahme), vorangegangene Aktion (Flanke, Einzel-Dribbling). Ein xG-Wert von 0,8 bedeutet: Historisch erzielen Spieler aus dieser Situation in 80% der Faelle ein Tor.",
        difficulty = 3,
        funFact = "StatsBomb, Opta und andere Datenanbieter verkaufen hochdimensionale xG-Modelle an Proficlubs. Manchester City unter Guardiola ist dafuer bekannt, Spieler anhand ihres xG-Profils zu rekrutieren, nicht nur nach erzielten Toren. Tore sind hochvariabel; xG ist ein zuverlaessigerer Leistungsindikator."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das statistische Konzept 'Regression to the Mean' im Sportkontext und wie erklaert es den 'Sophomore Slump'?",
        answerA = "Sportler verbessern sich statistisch in ihrem zweiten Profijahr, weil mehr Daten fuer bessere Analysen vorliegen",
        answerB = "Extreme Leistungen im ersten Jahr (Rookie-Saison) sind teilweise Zufallsvariation; im zweiten Jahr naehern sich Werte dem individuellen Leistungsmittel an – was wie ein Leistungsabfall aussieht",
        answerC = "Teams, die im ersten Jahr erfolgreich sind, verlieren durch Draft-Picks-Tausch an Tiefe; das erklaert sinkende Teamleistungen im Folgejahr",
        answerD = "Der Sophomore Slump entsteht durch psychologischen Druck in der zweiten Saison, wenn Gegner den Spieler gezielt analysiert und Schwaechen gefunden haben",
        correctAnswer = 1,
        explanation = "Regression to the Mean: Extreme Werte (Highperformer in Jahr 1) enthalten immer einen Gluecksanteil. In Jahr 2 faellt dieser Gluecksanteil weg. Der Spieler zeigt seine 'wahre' Leistung, die schlechter aussieht. Daniel Kahneman beschreibt dies als kognitiven Fehler: Wir erklaeren statistisches Rauschen durch kausale Geschichten (z.B. 'Druck').",
        difficulty = 3,
        funFact = "Der Sophemore Slump ist in nahezu allen US-Sportligen statistisch nachweisbar. Rookies, die ins All-Rookie-Team gewaehlt werden, liefern im zweiten Jahr im Durchschnitt schlechtere Statistiken. GM-Entscheidungen auf Basis von Rookie-Ausnahmeperformances sind daher besonders risikoreich."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche statistische Methode liegt dem NBA-Konzept 'Player Impact Estimate' (PIE) oder aehnlichen Plus-Minus-Varianten zugrunde?",
        answerA = "PIE ist eine einfache Addition aller positiven und negativen Spielstatistiken, gewichtet nach Spielminuten",
        answerB = "Box Plus-Minus (BPM) und aehnliche Metriken verwenden multivariate Regressionsmodelle, die Boxscore-Statistiken zu Teamauswirkungen in Punkten pro 100 Ballbesitze umrechnen",
        answerC = "PIE berechnet durch Netzwerkanalyse die zentrale Position eines Spielers im Passnetzwerk seiner Mannschaft",
        answerD = "Plus-Minus-Statistiken basieren ausschliesslich auf dem rohen Punktedifferential, wenn ein Spieler auf dem Feld ist, ohne Kontrollvariablen",
        correctAnswer = 1,
        explanation = "Moderne NBA-Metriken wie RAPTOR (FiveThirtyEight) oder EPM (Estimated Plus-Minus) kombinieren Boxscore-Regression mit play-by-play Plus-Minus-Daten und Machine Learning. Sie kontrollieren fuer Teamstaerke, Mitspieler-Qualitaet und Gegnerstaerke – was einfaches Raw Plus-Minus nicht kann. Ziel ist die Schaetzung des Nettoeinflusses eines Spielers auf Punktdifferenz.",
        difficulty = 3,
        funFact = "Die NBA hat mit der Einfuehrung von SportVU-Tracking-Kameras 2013 eine Revolution der Datenerhebung ausgeloest. Jetzt werden nicht nur Statistiken erfasst, sondern die Positionen aller 10 Spieler und des Balls 25 Mal pro Sekunde – was voellig neue Metriken (z.B. Contested Shot Rate, Defensive Coverage) ermoeglicht."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt der Begriff 'Hot Hand Fallacy' und wie verhaelt sich die aktuelle Sportwissenschaft zum urspruenglichen Befund von Gilovich et al. (1985)?",
        answerA = "Gilovich bewies endgueltig, dass die 'heisse Hand' ein statistischer Irrtum ist; neuere Studien bestaetigen dies fuer alle Sportarten",
        answerB = "Gilovich fand keinen Nachweis fuer den Hot-Hand-Effekt; Miller und Sanjurjo (2018) zeigten jedoch einen statistischen Analysefehler (Bayes-Correction), und nach Korrektur existiert ein echter, kleiner Hot-Hand-Effekt",
        answerC = "Die Hot Hand Fallacy beschreibt die Tendenz von Trainern, gute Spieler uebermaessig lange einzusetzen, was statistisch zu schlechteren Ergebnissen fuehrt",
        answerD = "Gilovich et al. zeigten, dass die Hot Hand ein reales Phaenomen in Mannschaftssportarten ist, aber in Einzelsportarten wie Tennis nicht existiert",
        correctAnswer = 1,
        explanation = "Gilovich et al. analysierten NBA-Freiwuerfe und fanden keine seriellen Korrelationen. Miller und Sanjurjo (2018) identifizierten einen mathematischen Fehler: Wenn man in einer endlichen Sequenz nach 'Treffer nach Treffer' sucht, entsteht ein systematischer Bias gegen das Auffinden echter Korrelationen. Nach Korrektur zeigt sich ein statistisch signifikanter, wenn auch kleiner Hot-Hand-Effekt.",
        difficulty = 3,
        funFact = "Die Korrektur von Miller und Sanjurjo wird als einer der ueberraschendsten Befunde der Verhaltensstatistik der letzten Jahre gefeiert. Sie verdeutlicht, wie selbst Nobelpreistraeaeger (Kahneman zitierte den urspruenglichen Befund extensiv) von methodischen Subtilitaeten getaeuscht werden koennen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt der Fussball-Analyseansatz 'PPDA' (Passes Allowed Per Defensive Action) und was misst er spezifisch?",
        answerA = "PPDA misst die durchschnittliche Passstrecke pro Defensivaktion und gibt Auskunft ueber die vertikale Spielweise eines Teams",
        answerB = "PPDA misst, wie viele Paesse der Gegner in der Vorwaertszone durchfuehren kann, bevor das pressende Team eingreift – niedriger PPDA bedeutet intensiveres Pressing",
        answerC = "PPDA ist die Quoterel der gelungenen Defensivaktionen pro Gesamtpaesse und bewertet individuelle Defensivspieler-Effizienz",
        answerD = "PPDA beschreibt das Verhaeltnis von Pressing-Aktionen zu zugelassenen Konterangriffen und dient zur Risikobeurteilung defensiver Pressingstrategien",
        correctAnswer = 1,
        explanation = "PPDA wurde von StatsBomb entwickelt und misst die Pressing-Intensitaet: Paesse des Gegners im Aufbau geteilt durch Defensivaktionen (Tackles, Zweikampfe, Fouls) des pressenden Teams in einem definierten Feldbereich. Ein PPDA von 5 bedeutet: Nach je 5 Gegnerpaessen erfolgt eine Defensivaktion – sehr intensives Pressing. Werte ueber 15 deuten auf geringes Pressing hin.",
        difficulty = 3,
        funFact = "Juergen Klopps Liverpool-Mannschaft hatte in der Meistersaison 2019/20 eines der niedrigsten PPDA-Werte der Premier-League-Geschichte. Pressing-Intensitaet korreliert messbar mit Balleroberungen in vorderen Feldzonen und damit mit Tormoeglichkeiten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das Konzept der 'Pythagorean Expectation' im Sport, urspruenglich aus dem Baseball stammend, und wie wurde sie auf Fussball und Basketball uebertragen?",
        answerA = "Die Pythagoraische Erwartung berechnet die theoretische Saisontabelle basierend auf dem mathematischen Satz des Pythagoras zur Dreiecksgeometrie von Spielerbewegungen",
        answerB = "Formel von Bill James: Erwartete Siegquote = (erzielte Runs)^2 / ((erzielte Runs)^2 + (kassierte Runs)^2); im Fussball adaptiert als Torquotient – prediziert zuverlässig wahre Teamstaerke besser als Siegquote",
        answerC = "Pythagoraische Erwartung beschreibt die optimale Spielerwahl nach geometrischen Abstandsberechnungen im Statistikraum der Sabermetrics-Variablen",
        answerD = "Die Formel berechnet erwartete Leistung aus dem Verhaltnis von Teamgehalt zu durchschnittlichem Ligagehalt, gewichtet nach Pokal- und Meisterschaftsanforderungen",
        correctAnswer = 1,
        explanation = "Bill James entwickelte die Formel W% = RS^k/(RS^k + RA^k) (urspruenglich k=2). Im Fussball wird k=1,3 oder andere Werte verwendet. Die Pythagorische Erwartung prediziert die Ligaposition besser als aktuelle Siegquote, weil sie zufaellige Schwankungen in Ergebnissen glaettet. Teams, die stark ueberperformen, fallen im Folgejahr oft ab (Regression zur Mitte).",
        difficulty = 3,
        funFact = "Daryl Morey, ehemaliger GM der Houston Rockets, war einer der ersten NBA-Manager, der Basketball-Analytics systematisch nutzte. Er nutzte adaptierte Pythagoraische Formeln zur Teambeurteilung. Die Rockets wurden damit zu Pionieren des 'Moneyball' im Basketball."
    ),

    // ── Taktik verschiedener Sportarten (7) ──────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das Konzept 'Murrayfield Effect' in der Rugby-Taktik und welche strategische Implikation hat es fuer Verteidigungsformationen?",
        answerA = "Die Tendenz schottischer Teams, auf eigenem Gelaende durch intensives Pressing ueberlegene Gegner zu besiegen",
        answerB = "Ein Defensivdruck-Phaenomen, das beschreibt, wie Heimvorteil und Lautsiaerke des Publikums Schiedsrichterentscheidungen nachweislich beeinflusst",
        answerC = "Im Rugby-Kontext beschreibt es die Tendenz von Defensivlinien, bei Gegner-Gainlines-Bruechen kollateral nach innen zusammenzubrechen und Aussenbahnen freizugeben",
        answerD = "Eine Defensivformation, bei der alle Spieler zwischen den 5- und 22-Meter-Linien komprimiert stehen, um den Gegnern alle Spielraeume zu nehmen",
        correctAnswer = 2,
        explanation = "Im Rugby bezieht sich 'Murrayfield Effect' auf taktische Defensivkompression: Wenn Angreifer die Gainline durchbrechen, verschieben Verteidiger nach innen zum Drohpunkt. Dies oeffnet systematisch die Aussenbahn. Kluge Angreifer-Teams 'fixieren' Verteidiger zentral und spielen schnell quer fuer ueberladene Aussenpositionen.",
        difficulty = 3,
        funFact = "Murrayfield ist das Nationalstadion Schottlands mit einer Kapazitaet von 67.144 Zuschauern und gilt als eines der lautesten Rugby-Stadien. Der Begriff wird in der taktischen Analyse haeufig fuer Defensive benutzt, die durch Publikumsdruck oder Drucksituationen ihre Structur verliert."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche taktische Innovation brachte die 'Princeton Offense' von Coach Pete Carril ins College-Basketball und wie beeinflusste sie die NBA?",
        answerA = "Princeton Offense ist ein aggressives Fast-Break-System, das maximale Transition-Punkte durch fruehes Pressing und schnelle Umschaltsituationen erzeugt",
        answerB = "Ein Pass-and-Cut-System ohne festen Spielmacher, das durch Bewegung ohne Ball, Backdoor-Cuts und geduldiges Ballbewegen versucht, qualitativ hochwertige Wuerfe zu kreieren",
        answerC = "Eine Isolation-Offense, bei der Superstars im Post-Up-Spiel ihre Spieler freilaufen lassen – bekannt als 'Princeton Triangle'",
        answerD = "Das Princeton-System setzt ausschliesslich auf 3-Punkte-Wuerfe und vermeidet Mid-Range-Wuerfe komplett als ineffizienten Schussbereich",
        correctAnswer = 1,
        explanation = "Pete Carrils Princeton Offense revolutionierte Basketball durch intellektuelle Simplizitaet: keine Hochleistungsathletik noetig. Kernelemente: Geduld, Bewegung aller 5 Spieler, Backdoor-Cuts sobald der Ball-Handler angepresst wird, 5-out-Formation. Die San Antonio Spurs adaptierten Elemente fuer Gregg Popovichy's Motion-Offense-Variante.",
        difficulty = 3,
        funFact = "Princeton unter Carril schlug 1996 als 16-er Seed die favorisierten UCLA Bruins im NCAA-Tournament mit Backdoor-Cuts im letzten Spielabschnitt – eines der groesSten Upsets der College-Basketball-Geschichte. Die Offensive ist bis heute Lehrstoff an Coaches-Seminaren."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das taktische Konzept 'Libero Sweeper' im Volleyball und wie unterscheidet es sich funktional und regelmaessig vom normalen Libero?",
        answerA = "Der Libero Sweeper ist ein Offensivspezialist, der in bestimmten Rotationen den Angreifer ersetzen darf und Freischlaege ausfuehrt",
        answerB = "Im normalen Volleyball gibt es nur einen Libero (Defensive Spezialist); 'Libero Sweeper' ist ein informeller Coaching-Begriff fuer einen Libero mit erweiterter Seitenverteidigung und proaktivem Raumabdeckungsverhalten",
        answerC = "Der Libero Sweeper darf im Gegensatz zum normalen Libero auch vorne in der Annahmeformation spielen und Bagger-Angriffe durchfuehren",
        answerD = "Der Libero Sweeper ist eine 2023 eingefuehrte FIFA-Volley-Regel, die Teams erlaubt, zwei Liberos gleichzeitig auf dem Feld einzusetzen",
        correctAnswer = 1,
        explanation = "In der offiziellen Regelwelt gibt es nur einen Libero. 'Libero Sweeper' beschreibt coaching-taktisch einen Libero, der nicht nur reaktiv anspielt, sondern proaktiv Raeume antizipiert, Bagger-Abwehr weit vor dem Koerper sucht und Mitspieler durch Raumabdeckung freispielt. Es ist kein offizieller Regelstatus, sondern ein taktischer Spielstil.",
        difficulty = 3,
        funFact = "Der Libero wurde 1998 offiziell in das Volleyball-Regelwerk eingefuehrt. Anfangs war er umstritten, hat sich aber zum unverzichtbaren Defensivspezialist entwickelt. In der Weltklasse ist der Libero oft der technisch raffiniertest Spieler im Team – besonders Annahme und Feldabwehr erfordern ausserordentliche Reaktionsschnelligkeit."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die 'Overload-Underload'-Taktik im modernen Fussball und welche Trainer werden mit ihrer Systematisierung assoziiert?",
        answerA = "Systematisches Ueberlasten des Gegners durch Pressing auf einer Spielfeldhaelfte, waehrend die eigene Haelfte personell reduziert wird",
        answerB = "Gezieltes numerisches Uebergewicht auf einer Seite (Overload) und entsprechendes Untergewicht auf der anderen (Underload), um durch Ballzirkulation den Gegner zur Seite zu ziehen und dann schnell zu verlagern",
        answerC = "Wechsel zwischen offensiven und defensiven Phasen durch gezielten Spielerbewegungen in Raumdominanzbereiche, definiert durch Voronoi-Diagramme",
        answerD = "Eine physische Trainingsphilosophie, bei der Spieler in bestimmten Saisontphasen uebermaessig belastet werden, um nach Erholung eine Leistungssuperkompensation zu erzeugen",
        correctAnswer = 1,
        explanation = "Overload-Underload (Ueberladung-Unterladung) ist ein Kernkonzept moderner Positionsspiel-Taktik (Guardiolas Pep-System). Durch 3-vs-2-Situationen auf einer Seite wird der Gegner gebunden; das schnelle Verlagern des Balls zur Underload-Seite eroeffnet Uebergangsraeume. Erfordert praezises Timing und koordinierte Bewegungen aller Spieler.",
        difficulty = 3,
        funFact = "Die Formalisierung von Overload-Underload-Konzepten geht auf Konzepte von Johan Cruyff zurueck, wurde von Louis van Gaal systematisiert und von Pep Guardiola bei Barcelona und Manchester City zur Perfektion entwickelt. Heutige Taktikvideos auf Plattformen wie YouTube haben diese Konzepte einem breiten Amateursport-Publikum zugaenglich gemacht."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche taktische Innovation brachte das 'Bob Bryan / Mike Bryan'-Doppelspiel im Tennis und wie unterscheidet sich ihre Taktik von klassischen Ansaetzen?",
        answerA = "Die Bryans popularisierten die 'Australian Formation' als Standardaufstellung, bei der beide Spieler auf einer Seite stehen und den Return-Spieler taeuschen",
        answerB = "Die Bryans revolutionierten das Doppelspiel durch nahezu perfektes Signalsystem (Handzeichen hinter dem Ruecken) und aggressive Net-Dominanz mit koordiniertem Positionstausch nach jedem Schlag",
        answerC = "Sie entwickelten die 'I-Formation' als neuartige Aufstellung, bei der der Netzmann direkt vor dem Aufschlaeger steht und nach dem Aufschlag seitlich wechselt",
        answerD = "Die Bryans spielten als erste Top-Doppelpaare ausschliesslich mit Topspin-Grundlinienspielen und mieden Netzangriffe konsequent, was als taktische Anomalie im Doppel gilt",
        correctAnswer = 1,
        explanation = "Das Signalsystem der Bryans war legendaer: Handzeichen hinter dem Ruecken signalisierten, ob der Netzmann nach dem Aufschlag zur Vorhand- oder Rueckhandseite des Returners wechselt. Dies machte ihre Netzpraesenz fast unvorhersehbar. Ihr Schluessel war aussergewoehnliche Sychronisation, entwickelt durch jahrzehntelanges gemeinsames Spielen seit der Kindheit.",
        difficulty = 3,
        funFact = "Bob und Mike Bryan gewannen 119 ATP-Doppeltitel – Rekord in der Open Era – und alle vier Grand Slams sowie Gold bei den Olympischen Spielen 2012. Ihre eineiige Zwillingsverbindung ermoeglichte eine intuitive Koordination, die trainierte Nicht-Geschwister kaum replizieren koennen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das taktische Konzept 'High Block' vs. 'Low Block' im Handball und welche situativen Faktoren bestimmen die Wahl?",
        answerA = "High Block und Low Block beschreiben die Abwehrhoehe bei Torwuerfen; High Block ist die Standardposition fuer Torhuer bei hohen Wuerfen",
        answerB = "High Block (6-0-Deckung oder hoeher) nimmt Raum vor der Wurfzone und zwingt zu langen Wuerfen; Low Block (zieht sich tief zurueck) laesst Aussenraum, verdichtet den Torhuerbereich",
        answerC = "High Block bedeutet aggressives Einzeldecken mit Mann-Mann-Verteidigung gegen alle Angreifer; Low Block ist reine Zonenverteidigung vor dem 6-Meter-Kreis",
        answerD = "High Block und Low Block sind Handball-Begriffe aus dem Beachhandball und beziehen sich auf die Hoehenposition von Blockaktionen am Netz",
        correctAnswer = 1,
        explanation = "Im Handball bestimmt die Deckungshoehe Raum und Risiko: 6-0-Deckung (Low Block) bietet dichte Zentrumsicherung, laesst aber Aussenpositionen offen. Offensive Deckungen (5-1, 3-2-1) pressen frueh, riskieren aber Luecken im Ruecken. Wahl abhaengig von: Wurfstaerke des Gegners, Spielstand, Ermuedung, Torhuerform und Konterstärke der eigenen Mannschaft.",
        difficulty = 3,
        funFact = "Die deutshe Nationalmannschaft war unter Bundestrainer Dagur Sigurdsson bekannt fuer flexible Abwehrsysteme und schnelle Wechsel zwischen Deckungskonzepten. Diese taktische Variabilitaet gilt als Schluessel zum WM-Titel 2007 und EM-Titel 2016."
    ),

    // ── Sportphilosophie Vertiefung (7) ──────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was beschreibt der philosophische Begriff 'Autotelos' im Kontext des Spiels nach Hans-Georg Gadamer und welche Implikation hat dies fuer den Berufssport?",
        answerA = "Autotelos bedeutet, dass Spiele ihre Zweckbestimmung ausserhalb sich selbst haben – etwa in wirtschaftlichen Gewinnen oder sozialem Ansehen",
        answerB = "Gadamers Konzept beschreibt Spiel als selbstzweckhafte Aktivitaet, die um ihrer selbst willen gespielt wird; Berufssport in seiner Instrumentalisierung fuer externe Zwecke widerstreitet diesem urspruenglichen Spielcharakter",
        answerC = "Autotelos ist ein Konzept der antiken Sportphilosophie und beschreibt den Zustand koerperlicher Vollkommenheit als hoecstes Gut des Athleten",
        answerD = "Im modernen Sportkontext bedeutet Autotelos die vollstaendige Selbstbestimmung des Sportlers in Trainingsgestaltung und Karriereplanung",
        correctAnswer = 1,
        explanation = "Gadamer analysiert in 'Wahrheit und Methode' (1960) Spiel als ontologische Struktur: Das Spiel 'spielt sich selbst', es zieht Spieler in seine eigene Bewegung. Der 'Autotelos'-Charakter (griech.: sich selbst zum Ziel habend) meint, Spielen hat seinen Sinn in sich. Berufssport instrumentalisiert Sport fuer externe Ziele (Geld, Ruhm) und unterwirft ihn damit einem Widerspruch.",
        difficulty = 3,
        funFact = "Gadamer wurde 102 Jahre alt und spielte bis ins hohe Alter Tennis – er selbst kommentierte, dass das Spielen als Genuss stets im Vordergrund stand. Seine Spieltheorie ist weniger bekannt als seine Hermeneutik, gilt aber als philosophisch tiefsinnigster Beitrag zur Spielanalyse des 20. Jahrhunderts."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Position vertreten Transhumanisten wie Julian Savulescu zum 'genetischen Enhancement' im Sport, und wie unterscheidet sich diese von traditionellen Fair-Play-Argumenten?",
        answerA = "Transhumanisten fordern ein absolutes Verbot jeglicher genetischer Veraenderung von Sportlern, da sie die menschliche Natur des Sports beschaedigen",
        answerB = "Savulescu und andere Transhumanisten argumentieren, genetisches Enhancement solle erlaubt oder gar gefoerdert werden, solange es sicher ist – da der Wettbewerb 'natuerliches' Enhancement (Talent, Ernährung, Training) sowieso bevorzugt",
        answerC = "Transhumanisten lehnen Sport ab, da er auf koerperlichen Faehigkeiten basiert, die durch technologische Erweiterung irrelevant werden sollten",
        answerD = "Die transhumanistische Position im Sport befuerwortet ausschliesslich kognitive Enhancement-Methoden, lehnt koerperliche Enhancement aber als biologistisch ab",
        correctAnswer = 1,
        explanation = "Savulescu ('The Genetic Enhancement of Athletes', 2000) argumentiert: 'Natuerliche' genetische Vorteile (ACTN3-Genotyp, HIF1A-Varianten) sind bereits ungleich verteilt. Wenn wir natuerliche Genetik akzeptieren, ist das Prinzip 'natuerlicher Sport' schon gebrochen. Wenn genetisches Engineering sicher ist, waere es heuchlerisch, es zu verbieten. Fair Play muesse neu definiert werden.",
        difficulty = 3,
        funFact = "Eero Maentyranta, finnischer Skilanglaeufer und mehrfacher Olympiasieger, hatte eine natuerliche EPO-Rezeptor-Mutation, die seinen Haematokrit auf ueber 65% erhoehte. Er gewann legal. Waere dieselbe Eigenschaft durch gentechnische Eingriffe erzeugt worden, waere sie heute verboten – obwohl die physiologische Auswirkung identisch ist."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt William Morgans Konzept des 'Arete' im Sportkontext und wie unterscheidet es sich von der modernen Medaillenoptimierungs-Logik?",
        answerA = "Arete beschreibt das antike Konzept sportlicher Exzellenz als vollstaendige Verwirklichung der eigenen Faehigkeiten – nicht bloss Siegen, sondern bestmoegliches Handeln gemaess eigener Natur",
        answerB = "Morgan definiert Arete als reinen Wettbewerbswillen, der nach Sieg um jeden Preis strebt und gesellschaftliche Normen fuer den sportlichen Triumph ueberwindet",
        answerC = "Das Arete-Konzept im modernen Sport beschreibt die Verpflichtung der Olympischen Bewegung zur koerperlichen Schoenheit als aesthetisches Kriterium beim Wettkampf",
        answerD = "Arete ist ein rechtliches Konzept, das die Pflicht des Sportlers beschreibt, nicht nur zu siegen, sondern dem Publikum eine zuschauerwuerdige sportliche Leistung zu bieten",
        correctAnswer = 0,
        explanation = "William Morgan entwickelt in 'Leftist Theories of Sport' und anderen Werken eine tugendethische Sportphilosophie: Arete (griech.: Tugend, Exzellenz) meint sportliche Bestleistung als umfassende Verwirklichung des Koennens. Moderne Medaillenoptimierung hingegen reduziert den Athleten auf den Sieg; Taktiken wie 'Lose to Gain' (absichtliche Niederlagen fuer bessere Turnierpositionen) widersprechen dem Arete-Ideal fundamental.",
        difficulty = 3,
        funFact = "Der Badminton-Skandal bei den Olympischen Spielen 2012, als mehrere Teams absichtlich verloren, um guenstigere Ziehungslose zu erhalten, ist ein paradigmatisches Beispiel, wie Medaillenoptimierungs-Logik mit dem Arete-Ideal kollidiert. Die IOC-Reaktion war heftig: Acht Spielerinnen wurden disqualifiziert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht Heidegger in seiner Analyse des Spiels unter 'Gelassenheit' und wie koennte dieses Konzept auf den Flow-Zustand im Sport angewendet werden?",
        answerA = "Gelassenheit bedeutet voellige Passivitaet und Akzeptanz des Ergebnisses ohne Anstrengung – ein Konzept, das Hochleistungssport widerspricht",
        answerB = "Heideggers Gelassenheit beschreibt ein offenes, nicht-willentliches Seinslassen; im Sport beschreibt es den Zustand, in dem der Sportler nicht mehr bewusst kontrolliert, sondern im Vollzug aufgeht – verwandt mit Csikszentmihalyis Flow",
        answerC = "Heidegger lehnte Sport grundsaetzlich als Manifestation des modernen Gestells (technologischer Weltbeherrschung) ab und entwickelte keine sportspezifische Philosophie",
        answerD = "Gelassenheit im Heidegger'schen Sinn meint die bewusste Distanzierung des Athleten von seiner koerperlichen Leistung, um Angst vor Versagen zu ueberwinden",
        correctAnswer = 1,
        explanation = "Heideggers 'Gelassenheit' (aus der Vorlesung 'Gelassenheit', 1955) ist das offene Einlassenlassen des Seins ohne rechnendes Denken und willentliches Kontrollieren. Im Sport entspricht dies dem Flow-Zustand: Der Sportler 'rechnet' nicht mehr mit Ergebnissen, sondern ist vollstaendig im Vollzug. Csikszentmihalyi beschreibt dasselbe Phaenomen wissenschaftlich-psychologisch.",
        difficulty = 3,
        funFact = "Michael Jordan beschrieb seinen besten Spielzustand als 'not thinking, just playing'. Hochspringer Dick Fosbury, der mit dem revolutionaeren Fosbury Flop 1968 Gold gewann, beschrieb aehnlich, wie der Sprung im entscheidenden Moment 'von selbst' passiere – ein phaenoemenologisches Zeugnis des Gelassenheitszustands im Sport."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Kritik richtet der Philosoph Michael Sandel gegen die Praxis des genetischen Enhancements im Sport in seinem Werk 'The Case Against Perfection' (2007)?",
        answerA = "Sandel kritisiert genetisches Enhancement aus rein medizinischer Sicht als zu riskant und fordert stattdessen bessere Regulierung durch Sportmediziner",
        answerB = "Sandel argumentiert, genetisches Enhancement zerstoere die Offenheit fuer das Gegebene ('Giftedness') und verwandele Sport in ein technologisches Optimierungsprojekt, das die Demut vor natuerlichen Grenzen beseitigt",
        answerC = "Sandels Hauptkritik ist oekonomischer Natur: Genetisches Enhancement wuerde den Sportmarkt auf reiche Nationen beschraenken und globale Ungleichheit im Sport verstaerken",
        answerD = "Sandel argumentiert, Enhancement-Verbote sollen allein durch religiose Kommissionen implementiert werden, da nur Theologen die moralischen Konsequenzen beurteilen koennen",
        correctAnswer = 1,
        explanation = "Sandel entwickelt eine virtue-ethics-basierte Kritik: Der Drang zur Perfektionierung durch Enhancement beseitigt das 'Giftedness'-Element – die Anerkennung, dass viel in unserem Leben (einschliesslich Talent) 'gegeben' ist und nicht verdient. Dies foerdert eine Haltung der Demut und Dankbarkeit. Hypereltern-Enhancement wuerde Kinder zu Projekten machen, nicht zu Gaben.",
        difficulty = 3,
        funFact = "Sandels Buch wurde nach Erscheinen kontrovers diskutiert. Transhumanisten wie Nick Bostrom kritisierten seinen Begriff 'Giftedness' als metaphysisch beladen. Die Debatte offenbart fundamentale Unterschiede in der ethischen Grundhaltung: Tugendethik vs. Konsequentialismus im Sportkontext."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das Konzept 'Competitive Asymmetry' (Wettbewerbsasymmetrie) im sportphilosophischen Diskurs nach Warren Fraleigh?",
        answerA = "Fraleigh analysiert, wie groessere Athleten systematisch bevorzugt werden, und fordert Gewichtsklassen in allen Sportarten",
        answerB = "Wettbewerbsasymmetrie beschreibt, dass Sport nur dann sinnvoll ist, wenn Gegner unbekannte Staerke besitzen; der Ausgang muss ungewiss sein, sonst verliert der Wettkampf seinen Sinn",
        answerC = "Competitive Asymmetry bezeichnet die unterschiedlichen Ressourcen von Profi- und Amateurathletinnen, die fairen Wettbewerb strukturell verunmoeglicht",
        answerD = "Fraleigh beschreibt, warum Sport 'ungleich fair' sein muss: Wenn beide Gegner identisch gut waeren, haette sportlicher Sieg keine Bedeutung mehr",
        correctAnswer = 1,
        explanation = "Fraleigh argumentiert in 'Right Actions in Sport' (1984), dass sportlicher Wettkampf die echte Moeglichkeit des Scheiterns voraussetzt. Wenn einer Partei der Sieg sicher ist (oder fast sicher), verliert der Sport seine ethische Substanz. Dies begruendet Handicap-Systeme, Liga-Aufstieg/-Abstieg und Auslosung-Methoden als moralisch notwendige Institutionen.",
        difficulty = 3,
        funFact = "Das 'Problem der Festspiele' (Mismatch-Debatten) in Boxen zeigt die Praxisrelevanz: Ein 20:1-Favorit gegen einen unbekannten Gegner befriedigt zwar kommerzielle Interessen, zerstoert aber den sportethischen Wettkampfsinn. Organisationen wie die WBC wurden deswegen fuer das Arrangement solcher Kaempfe stark kritisiert."
    )
)
