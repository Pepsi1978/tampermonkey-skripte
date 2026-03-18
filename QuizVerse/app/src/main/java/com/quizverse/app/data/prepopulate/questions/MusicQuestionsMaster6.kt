package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsMaster6(): List<Question> = listOf(

    // ── Polyphonie-Geschichte vor Bach (8) ────────────────────────────────────

    // Q1
    Question(
        categoryId = 5,
        questionText = "Welches Kompositionsprinzip kennzeichnet das Notre-Dame-Organum des 12. Jahrhunderts im Unterschied zum frueheren primitiven Organum?",
        answerA = "Die Verwendung eines langen gehaltenen Cantus firmus im Tenor waehrend die obere Stimme (Duplum) floride melismatische Passagen entfaltet — dies ermoeglichte erstmals rhythmische Unabhaengigkeit der Stimmen",
        answerB = "Die strenge Fuehrung beider Stimmen in Terzen oder Sexten ueber einem bewegten Bassus",
        answerC = "Die Integration von Volksmelodien in den liturgischen Cantus firmus durch Technik der Contrafaktur",
        answerD = "Die gleichzeitige Verdoppelung der Melodie in Quart und Quint ohne rhythmische Abweichung",
        correctAnswer = 0,
        explanation = "Das melismatische Notre-Dame-Organum — wie in Leonins 'Magnus Liber Organi' (um 1170) — haelt den gregorianischen Tenor in extrem langen Notenwerten (Organal-Stil), waehrend das Duplum schnelle Melismen entfaltet. Dadurch entsteht erstmals eine echte rhythmische Polyphonie: Die obere Stimme bewegt sich autonom, nicht parallel. Perotin entwickelte dies weiter zum drei- und vierstimmigen Organum.",
        difficulty = 5,
        funFact = "Der Name 'Notre-Dame-Schule' stammt nicht aus dem Mittelalter selbst, sondern wurde von Musikhistorikern des 20. Jahrhunderts gepraegte. Die zeitgenoessische Quelle 'Anonymous IV' (um 1280) nennt Leonin und Perotin als groesste Meister, nennt aber keine Schulbezeichnung."
    ),

    // Q2
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Isorhythmie' (Talea/Color-Technik), wie sie Motetten der Ars Nova des 14. Jahrhunderts strukturiert?",
        answerA = "Die Wiederholung eines rhythmischen Musters (Talea) unabhaengig von der Wiederholung des melodischen Musters (Color) im Tenor — beide Muster laufen asynchron und erzeugen grosse formale Zyklen",
        answerB = "Die gleichmaessige rhythmische Bewegung aller Stimmen in identischen Notenwerten als Gegensatz zur melismatischen Polyphonie",
        answerC = "Das Prinzip, bei dem jede Stimme exakt dasselbe melodisch-rhythmische Muster in unterschiedlichen Tonlagen vortraegt",
        answerD = "Die Technik, bei der Rhythmus und Melodie jeweils streng spiegelbildlich invertiert werden",
        correctAnswer = 0,
        explanation = "Isorhythmie ist ein Strukturprinzip der Ars-Nova-Motette (Philippe de Vitry, Guillaume de Machaut): Der Tenor basiert auf einem gregorianischen Cantus firmus, der in eine rhythmische Einheit (Talea) und eine melodische Einheit (Color) aufgeteilt wird. Talea und Color haben unterschiedliche Laengen und erzeugen bei ihrem Zusammentreffen grosse formale Zyklen. Die Technik wird manchmal auch auf die Oberstimmen ausgedehnt.",
        difficulty = 5,
        funFact = "Machauts isorhythmische Motetten wurden lange als akademisch-trockene Konstruktionen abgetan. Erst moderne Auffuehrungen zeigten, dass die mathematischen Proportionen einen eigenen klanglichen Reiz erzeugen — aehnlich wie minimalistische Musik des 20. Jahrhunderts."
    ),

    // Q3
    Question(
        categoryId = 5,
        questionText = "Welche Kompositionstechnik kennzeichnet den sogenannten 'cantus-firmus-Zyklus' der burgundischen Messe (z.B. Dufay, Ockeghem) und warum ist er historisch bedeutsam?",
        answerA = "Alle Saetze einer Messvertonung basieren auf demselben cantus firmus (oft einer weltlichen Melodie wie 'L'homme arme') im Tenor — dies schuf erstmals formal zusammenhaengende, mehrsaetzige Vokalwerke",
        answerB = "Der Cantus firmus wechselt von Satz zu Satz und schafft so kontrastierende Klangfarben innerhalb des Messzyklus",
        answerC = "Eine einheitliche Tonart verbindet alle Saetze, waehrend der Cantus firmus in verschiedenen Stimmen wandert",
        answerD = "Die Technik, alle Messabschnitte durch wiederholte Kadenzformeln miteinander zu verknuepfen",
        correctAnswer = 0,
        explanation = "Die cantus-firmus-Messe des 15. Jahrhunderts ist ein Meilenstein der Musikgeschichte: Erstmals werden alle Messabschnitte (Kyrie, Gloria, Credo, Sanctus, Agnus Dei) durch einen gemeinsamen cantus firmus im Tenor zusammengebunden. Dufays 'Missa L'homme arme' und Ockeghems 'Missa L'homme arme' sind Schluesseldokumente. Die Verwendung weltlicher Melodien als Messgrundlage war theologisch umstritten, wurde aber toleriert.",
        difficulty = 5,
        funFact = "Die Melodie 'L'homme arme' (Der bewaffnete Mann) wurde von mindestens 40 Renaissance-Komponisten als Messgrundlage verwendet — vom 15. bis 16. Jahrhundert. Der Ursprung der Melodie ist unbekannt; sie koennte auf eine populaere Chanson oder eine politische Anspielung zurueckgehen."
    ),

    // Q4
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Fauxbourdon' in der burgundischen Polyphonie des fruehen 15. Jahrhunderts und wie unterscheidet er sich vom englischen 'faburden'?",
        answerA = "Fauxbourdon (Dufay) ist eine dreistimmige Technik mit Oberstimme und Tenor in der Partitur; die mittlere Stimme (Contratenor) wird improvisiert eine Quarte darunter. Englischer Faburden meint das improvisierte Hinzufuegen von Stimmen ueber einem Cantus, oft in Terzen und Sexten",
        answerB = "Fauxbourdon ist eine englische Technik, waehrend Faburden die franzoesische Bezeichnung fuer dasselbe Verfahren darstellt",
        answerC = "Beide Begriffe bezeichnen identische Verfahren der Improvisation einer Stimme in Quintparallelen",
        answerD = "Fauxbourdon meint die Verdoppelung des Basses eine Oktave tiefer; Faburden die Verdoppelung der Oberstimme in der Terz",
        correctAnswer = 0,
        explanation = "Fauxbourdon (franzoesisch-burgundische Terminologie, vor allem bei Dufay) ist eine notierte Technik: Zwei Stimmen stehen in der Partitur, die dritte (Contratenor) wird konventionell eine Quarte unter der Oberstimme improvisiert. Der englische Faburden ist ein anderes Verfahren: Ein Sanger improvisiert Stimmen, die ueber oder unter einem gesungenen Cantus folgen, hauptsaechlich in Terzen und Sexten. Trotz etymologischer Verwandtschaft sind die Techniken nicht identisch.",
        difficulty = 5,
        funFact = "Die historiographische Frage, ob Fauxbourdon aus England importiert wurde oder eine eigenstaendige burgundische Erfindung ist, beschaeftigt Musikforscher seit dem 19. Jahrhundert. Brian Trowell und Margaret Bent haben in den 1980er Jahren wesentliche neue Argumente fuer die Eigenstaendigkeit beider Traditionen vorgelegt."
    ),

    // Q5
    Question(
        categoryId = 5,
        questionText = "Welche Technik kennzeichnet die sogenannte 'pervading imitation' (durchimitierende Polyphonie) der franko-flaeamischen Schule (Josquin, Ockeghem) als Stilmerkmal?",
        answerA = "Alle Stimmen fuehren nacheinander dasselbe Motiv ein (Imitation), ohne dass eine Stimme eine ruhende Cantus-firmus-Funktion einnimmt — jede Stimme wechselt zwischen motivfuehrender und begleitender Rolle",
        answerB = "Eine Stimme singt den Cantus firmus durchgehend, waehrend alle anderen Stimmen imitatorisch um ihn kreisen",
        answerC = "Die oberen beiden Stimmen imitieren sich gegenseitig, waehrend die unteren als Stimmenpaar in Terzen begleiten",
        answerD = "Der Tenor imitiert den Cantus der Oberstimme in der Unterquinte bei gleichzeitiger Gegenbewegung im Bass",
        correctAnswer = 0,
        explanation = "Die pervading imitation oder Durchimitation ist das Stilmerkmal der Josquin-Generation (spaetes 15./fruehes 16. Jh.): Kein Stimmpaar steht fest, sondern jede Stimme ist gleichberechtigt. Ein Motiv wandert durch alle Stimmen, dann folgt ein neues Motiv — die Musik entsteht als Sequenz imitativer Abschnitte ohne strukturellen Cantus firmus. Dieses Prinzip bestimmt die Motettentechnik bis in die Fruehbarockzeit.",
        difficulty = 5,
        funFact = "Josquin des Prez wurde von Martin Luther als 'Meister der Noten' bezeichnet, der 'tut mit den Noten was er will'. Haydn und Mozart studierten noch im 18. Jahrhundert Josquins Kontrapunkt, und Heinrich Glarean stellte ihn in seinem 'Dodecachordon' (1547) als Hoehepunkt der Polyphonie dar."
    ),

    // Q6
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Begriff 'Mannerism' oder 'Ars subtilior' in der spaeteren Ars Nova des spaeteren 14. Jahrhunderts und welche Notation war typisch?",
        answerA = "Ein Stil extremer rhythmischer Komplexitaet mit verschachtelten Synkopen, Hemiolen und ungewoehnlichen Notationssymbolen (rote Noten, herzfoermige Handschriften) — vorwiegend weltliche Chansons fuer Kenner-Kreise",
        answerB = "Eine vereinfachte Notationsform fuer den breiten Kirchengebrauch, die auf komplizierte isorhythmische Strukturen verzichtete",
        answerC = "Ein liturgisches Repertoire des suedfranzoeischen Benediktinerordens mit eigener Zeichenschrift fuer Mikrotone",
        answerD = "Die Manier, alle Stimmen streng im Einklang zu fuehren als Gegenbewegung zur polyphonen Komplexitaet",
        correctAnswer = 0,
        explanation = "Der Begriff Ars subtilior ('die subtilere Kunst') wurde 1963 von Ursula Guenter eingefuehrt fuer Musik des avignonesischen Hofes um 1380-1420 (Chastelain de Couci, Matteo da Perugia, Jacob Senleches). Der Stil ist extrem komplex: Rhythmische Polymetrie, notierende Synkopen, und ungewoehnliche Notensymbole (Herznotenhandschrift 'Chantilly-Manuskript'). Die Musik war fuer hochgebildete Connaisseure, keine Volksmusik.",
        difficulty = 5,
        funFact = "Das Chantilly-Manuskript (um 1395-1410) ist die wichtigste Quelle der Ars subtilior. Es enthaelt herzfoermige und kreisfoermige Handschriften — diese 'notation extraordinaire' ist kein kuenstlerischer Schnickschnack, sondern technisch praezise rhythmische Information, die moderner Musikwissenschaft noch Raetsel aufgibt."
    ),

    // Q7
    Question(
        categoryId = 5,
        questionText = "Welche Bedeutung hatte Heinrich Isaac fuer die Entwicklung der weltlichen deutschen Polyphonie, und welches Werk ist sein bekanntester Beitrag?",
        answerA = "Isaac setzte deutsche Volkslieder mehrstimmig aus und schuf mit 'Innsbruck ich muss dich lassen' das vielleicht bekannteste Lied der Renaissance, das spaeter als lutherisches Kirchenlied adaptiert wurde",
        answerB = "Isaac grundete die erste offentliche Musikschule in Wien und verfasste das erste deutschsprachige Kompositionslehrbuch",
        answerC = "Er entwickelte die erste systematische Temperierung fuer Tasteninstrumente und dokumentierte sie im 'Choralis Constantinus'",
        answerD = "Isaac erfand die fuenfstimmige Motette als neue Gattung und ersetzte damit das vierstimmige Vorbild Josquins",
        correctAnswer = 0,
        explanation = "Heinrich Isaac (um 1450-1517) war am Hof Kaiser Maximilian I. taetig und verband flaeamische Polyphonie mit deutschen Volkslied-Traditionen. 'Innsbruck ich muss dich lassen' (um 1500) wurde von Isaac als Tenormelodie in eine vierstimmige Vokalpolyphonie eingebettet. Der Text 'O Welt ich muss dich lassen' macht es spaeter zu einem der bedeutendsten lutherischen Choralsaetze, den auch Bach verarbeitete.",
        difficulty = 5,
        funFact = "Isaacs monumentales Werk 'Choralis Constantinus' (3 Baende, 1550-1555 posthum verlegt) ist eine vollstaendige mehrstimmige Vertonung des proprium missae fuer das gesamte Kirchenjahr — eine einmalige Leistung, die modern erst durch die Neue Mozart Ausgabe-Methodik vollstaendig erschlossen wurde."
    ),

    // Q8
    Question(
        categoryId = 5,
        questionText = "Welchen kompositionstechnischen Fortschritt brachte Orlando di Lasso (Roland de Lassus, 1532-1594) im Bereich der expressiven Chromatik gegenueber seinen Vorgaengern?",
        answerA = "Lasso nutzte chromatische Alteration konsequent als rhetorisches Ausdrucksmittel (Musica reservata): Er harmonisierte die affektive Bedeutung einzelner Textworte direkt durch ueberraschende Chromatik — dieser Text-Ton-Bezug war expressiver als jede Vorgaenger-Polyphonie",
        answerB = "Lasso fuehrte als Erster die Enharmonik durch die Gleichschwebende Temperierung in die Vokalpolyphonie ein",
        answerC = "Er entwickelte das Krebsgang-Verfahren, bei dem eine Stimme rueckwaerts singt, als manieristisches Extrem der Chromatik",
        answerD = "Lasso systematisierte die Chromatik durch Verwendung einer 24-Ton-Skala, die Mikrotone einschloss",
        correctAnswer = 0,
        explanation = "Orlando di Lassos affektive Chromatik ist Kernmerkmal der 'Musica reservata': Er setzte einzelne Schluesselbegriffe des Textes (Tod, Liebe, Schmerz) durch chromatische Klangrhetorik direkt um. Die 'Prophetiae Sibyllarum' (um 1560) sind das extremste Beispiel — die Prologenmelodie durchlaeuft innerhalb weniger Takte fast alle 24 Halbtone. Dieser affektive Einsatz von Chromatik beeinflucte direkt das Madrigal und den fruehen Barock.",
        difficulty = 5,
        funFact = "Lassos 'Prophetiae Sibyllarum' beginnen mit einer fast atonal klingenden chromatischen Introduktion, die selbst fuer erfahrene Renaissancemusiker verwirrend war. Der Komponist selbst betonte im Vorwort, das Stueck sei 'aus dem chromatischen Genus gemacht' — ein direkter Verweis auf antike Musiktheorie."
    ),

    // ── Musikhandschriftkunde / Kodikologie (7) ───────────────────────────────

    // Q9
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Musikhandschriftenkunde unter dem Begriff 'Palimpsest' und welche Bedeutung hat dieser Befund fuer die Musikforschung?",
        answerA = "Eine Handschrift, auf der frueherer Text abgeschabt oder ausgewaschen und neu beschrieben wurde — Musikpalimpseste koennen aeltere Notationsschichten unter dem sichtbaren Text enthalten, die mit UV-Licht oder Multispektralfotografie sichtbar gemacht werden",
        answerB = "Eine Handschrift, die nachtraeglich mit Korrekturen eines anderen Schreibers versehen wurde, ohne den Originaltext zu veraendern",
        answerC = "Eine liturgische Handschrift, die mehrere Notationssysteme parallel verwendet, um verschiedene regionale Gepflogenheiten zu zeigen",
        answerD = "Eine unvollstaendige Handschrift, bei der einzelne Lagen (Fascikeln) fehlen oder verloren sind",
        correctAnswer = 0,
        explanation = "Ein Palimpsest entstand, wenn Pergament (ein teures Material) durch Schaben oder Waschen recycelt wurde. Unter der sichtbaren Schicht koennen Musiknotationen aus einem frueheren Stadium liegen. Die Codex-Forschung nutzt heute Multispektralaufnahmen und Infrarotreflektographie, um geloeschte Schichten zu lesen. Beruehmte Musikpalimpseste sind z.B. im Kloster St. Gallen und im British Museum aufgetaucht.",
        difficulty = 5,
        funFact = "Das Archimedes-Palimpsest (enthielt geometrische Texte des Archimedes unter christlichen Gebeten) zeigte der Musikwissenschaft, wie wertvoll Multispektraltechnologie ist. Seitdem wurden im Scriptorium-Bereich mehrere Musikpalimpseste aus dem 9.-11. Jahrhundert mit neuer Technik entschluesselt."
    ),

    // Q10
    Question(
        categoryId = 5,
        questionText = "Welche kodikologische Methode nutzt man, um das Entstehungsdatum einer mittelalterlichen Musikhandschrift zu bestimmen, wenn keine expliziten Datumsangaben vorhanden sind?",
        answerA = "Schriftanalyse (Palaeographie), Analyse des Pergament-Materials (Tierhaut-Typ, Bereitung), Untersuchung von Tinten-Zusammensetzung per Spektroskopie, Wasserzeichenanalyse (bei spaetmittelalterlichem Papier), sowie stilistische Einordnung der Notationsformen",
        answerB = "Ausschliesslich Radiokarbon-Datierung des Pergaments, die auf ein Jahrhundert genau datiert",
        answerC = "Vergleich der Schreiber-Handschrift mit datierten Schreiber-Dokumenten anderer Institutionen",
        answerD = "Computergestuetzte Analyse der Notendichte, die auf Jahrhunderte schliessen laesst",
        correctAnswer = 0,
        explanation = "Die kodikologische Datierung einer mittelalterlichen Handschrift kombiniert mehrere Methoden: Palaeographie (Buchstaben- und Notenform), Materialanalyse (Pergament vs. Papier, Tierhaut), Tintenanalyse (Eisengallus, Quecksilbervermilion), Wasserzeichen (ab ca. 1280 bei Papierhandschriften) und musikalisch-stilistische Vergleiche. Radiokarbon-Datierung ist moeglich, aber zu ungenau fuer feine Fragen (Genauigkeit ca. +/- 50-100 Jahre) und zerstoert Material.",
        difficulty = 5,
        funFact = "Das Wasserzeichen-Archiv (WZIS — Wasserzeichen-Informationssystem) erfasst ueber 200.000 mittelalterliche Papier-Wasserzeichen und erlaubt eine praezise Datierung auf wenige Jahre. Bei Musikhandschriften auf Papier (ab 14. Jh.) ist dies oft die praeziseste Methode."
    ),

    // Q11
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'fascicle' (Faszikel) in der kodikologischen Beschreibung einer Musikhandschrift?",
        answerA = "Eine eigenstaendige Lage aus gefalteten Blatteinheiten (Bifolio), die vor dem Binden separat zusammengefasst war — Faszikeln koennen unterschiedliche Schreiber, Epochen und Repertoires enthalten und sind die grundlegende Analyseeinheit der Handschriftenkunde",
        answerB = "Ein einzelnes Notensystem innerhalb einer Seite, das als Einheit zur Transkription behandelt wird",
        answerC = "Die Gesamtheit aller Handschriften eines bestimmten Klosters, die als Verbund analysiert werden",
        answerD = "Eine Sammlung von Fragmenten verschiedener Handschriften, die spaeter zu einem Codex zusammengebunden wurden",
        correctAnswer = 0,
        explanation = "Ein Faszikel (Fascicle) ist eine Gruppe von zusammengefalteten Blatteinheiten (Bifolios/Lagen), die physisch zusammen behandelt wurde. Ein Codex besteht aus mehreren Faszikeln. Die Faszikel-Analyse ist zentral: Unterschiedliche Faszikel einer Handschrift koennen von verschiedenen Schreibern, zu verschiedenen Zeiten, an verschiedenen Orten entstanden sein. Sie erlaubt, den Entstehungsprozess einer Handschrift zu rekonstruieren.",
        difficulty = 5,
        funFact = "Das Montpellier Codex (um 1300), eine Schluesselquelle der Ars-Antiqua-Motette, besteht aus 8 Faszikeln, die ueber mehrere Jahrzehnte zusammengewachsen sind. Durch Faszikel-Analyse konnte Margaret Bent zeigen, wie das Repertoire schrittweise ergaenzt und umgeordnet wurde."
    ),

    // Q12
    Question(
        categoryId = 5,
        questionText = "Welche Bedeutung hat die 'Squarcialupi-Handschrift' (Florenz, um 1415-1430) fuer die Erforschung der italienischen Ars Nova?",
        answerA = "Sie ist die wichtigste und umfangreichste Quelle fuer das Trecento-Repertoire: Mit 354 Musikstuecken und Portaets der Komponisten ueberliefert sie Werke von Francesco Landini, Giovanni da Cascia und anderen und ist codikologisch als bewusstes Denkmal konzipiert",
        answerB = "Sie enthaelt die aeltesten bekannten Notationsformen der franzoesischen Ars Nova und beweist den direkten Einfluss von Guillaume de Machaut auf die Florentiner Schule",
        answerC = "Die Handschrift dokumentiert den Uebergang vom lateinischen zum volkssprachlichen Lied und liefert das erste Beispiel einer datierten Chanson in toskanischer Sprache",
        answerD = "Sie enthalt die vollstaendige Messvertonung von Antonio Squarcialupi, die als aelteste vollstaendige italioesische Messe gilt",
        correctAnswer = 0,
        explanation = "Die Squarcialupi-Handschrift (Codex Squarcialupi, Biblioteca Medicea Laurenziana Florenz) ist das prachtvollste Dokument des Trecento: 354 Stuecke, portaets der 12 enthaltenen Komponisten, aufwendige Illumination. Zusammengestellt wurde sie fuer Antonio Squarcialupi, Hoforganist der Medici. Francesco Landinis 145 Werke nehmen den groessten Platz ein. Sie ist kein Gebrauchsmanuskript, sondern ein bewusstes historisches Monument.",
        difficulty = 5,
        funFact = "Antonio Squarcialupi (1416-1480) war selbst ein bedeutender Musiker — und beauftragte die nach ihm benannte Handschrift als Gedenkwerk fuer die grosse florentinische Musiktradition. Er erlebte die Fertigstellung jedoch moeglicherweise nicht; die Handschrift koennte posthum abgeschlossen worden sein."
    ),

    // Q13
    Question(
        categoryId = 5,
        questionText = "Welche kodikologische Besonderheit weist das sogenannte 'Codex Calixtinus' (Santiago de Compostela, 12. Jh.) auf, und warum ist er fuer die Musikforschung bedeutsam?",
        answerA = "Er enthaelt die aeltesten bekannten mehrstimmigen Gesaenge (Organa) des westlichen Mittelalters, datiert auf die Mitte des 12. Jahrhunderts, und ist sowohl als Pilgerhandbuch als auch als liturgische Musikquelle konzipiert",
        answerB = "Er ist die erste vollstaendig auf Liniennotation (Guidonisches System) geschriebene Handschrift des christlichen Abendlandes",
        answerC = "Die Handschrift enthaelt eine vollstaendige Abschrift des Graduale Romanum aus dem 9. Jahrhundert und beweist die fruehe Kanonisierung des gregorianischen Chorals",
        answerD = "Er dokumentiert erstmals die Notation von Microtonen und dient als Grundlage fuer die moderne Rekonstruktion aramaisch-christlicher Sakralmusik",
        correctAnswer = 0,
        explanation = "Der Codex Calixtinus (auch Liber Sancti Jacobi, um 1150-1160) enthaelt im fuenften Buch 20 mehrstimmige Gesaenge, darunter Organa im Notre-Dame-Stil. Dies macht ihn zu einer der aeltesten Quellen fuer notierte Polyphonie ueberhaupt. Als Pilgerfuehrer nach Compostela hat er eine einzigartige Doppelfunktion: liturgisch-musikalisch und praktisch-touristisch. 2011 wurde er gestohlen und 2012 wiederentdeckt.",
        difficulty = 5,
        funFact = "Der Diebstahl des Codex Calixtinus 2011 durch Manuel Fernandez Castiñeiras, einen ehemaligen Elektriker der Kathedrale, war ein internationaler Skandal. Er hatte das Manuskript jahrelang in einem alten Kuehlschrank zu Hause aufbewahrt. Die spanische Polizei stellte auch Geld und andere Kathedralschaetze sicher."
    ),

    // Q14
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Quellenforschung unter 'concordance' bei mittelalterlichen Musikhandschriften, und welche Methode nutzt man zur systematischen Erfassung?",
        answerA = "Das Vorkommen desselben Musikstuecks in mehreren verschiedenen Handschriften (Quellen) — durch Konkordanzvergleich rekonstruiert man Ueberlieferungswege, Varianten und moegliche Urquellen; systematisch erfasst in Datenbanken wie RISM (Repertoire International des Sources Musicales)",
        answerB = "Die Uebereinstimmung von Text und Melodie in einer einzelnen Handschrift, die als Qualitaetsmerkmal fuer die Verlasslichkeit der Quelle gilt",
        answerC = "Die gleichzeitige Existenz von zwei oder mehr Schreibern in derselben Handschrift, erkennbar an unterschiedlichen Tintensorten",
        answerD = "Eine Notation, bei der Laut- und Instrumentalstimmen in derselben Partitur aufgezeichnet sind",
        correctAnswer = 0,
        explanation = "Konkordanz bezeichnet das Vorkommen eines Stuecks in mehreren Quellen. Durch Variantenvergleich laesst sich ein Stemma (Stammbaum der Quellen) erstellen, das zeigt, welche Handschriften voneinander abgeschrieben wurden und was moeglicherweise dem Original nahesteht. Das RISM (gegr. 1952 in Paris) ist das internationale Standardrepertoire und hat ueber 1,3 Millionen Musikquellen vor 1800 verzeichnet.",
        difficulty = 5,
        funFact = "RISM (Repertoire International des Sources Musicales) laeuft heute als Open-Access-Datenbank unter rism.info und enthaelt ueber 1,3 Millionen Nachweise zu Musikhandschriften und -drucken. Die Institution arbeitet mit ueber 35 nationalen Gruppen weltweit zusammen."
    ),

    // Q15
    Question(
        categoryId = 5,
        questionText = "Welche wissenschaftliche Methode ermoeglicht es, ohne Oeffnen eines gebundenen Codex die innere Struktur der Lagen und eventuelle Palimpsest-Schichten zu analysieren?",
        answerA = "Roentgen-Computertomographie (CT-Scan) und Terahertz-Spektroskopie erlauben die schichtweise Darstellung des Codex-Innern ohne physische Intervention — sichtbar werden Lagenstruktur, Tintensichten, Beschaedigungen und ueberdeckte Texte",
        answerB = "Fluoreszenz-Mikroskopie an Randproben des Pergaments, kombiniert mit digitaler 3D-Rekonstruktion",
        answerC = "Dendrochronologie der verwendeten Holzdeckel, die das Entstehungsdatum des Einbands auf ein Jahr genau bestimmt",
        answerD = "Ausschliesslich DNA-Analyse des Pergaments, die Tier-Rasse und Herkunftsregion des Materials identifiziert",
        correctAnswer = 0,
        explanation = "Moderne Handschriftenforschung nutzt zerstoerungsfreie Bildgebung: CT-Scans machen die Lagenstruktur sichtbar, ohne das Buch zu oeffnen. Terahertz-Spektroskopie kann Tintenschichten unter der Oberflaeche lesen. Multispektrale Bildgebung (von UV bis Infrarot) entschluesselt geloeschte oder ueberdeckte Texte. Diese Methoden sind in grossen Digitalisierungsprojekten wie dem 'Endangered Archives Programme' (British Library) Standard.",
        difficulty = 5,
        funFact = "Ein CT-Scan des Vinland-Manuskripts (Universitaetsbibliothek Yale) enthullte 2021, dass einige als Faelschung verdaechtigte Teile tatsaechlich mit mittelalterlicher Tinte beschrieben wurden — allerdings loeste dies die Echtheitsdebatte nicht endgueltig, da spatere Palimpsestierung nicht auszuschliessen ist."
    ),

    // ── Akustische Messtechnik (7) ────────────────────────────────────────────

    // Q16
    Question(
        categoryId = 5,
        questionText = "Was misst die Nachhallzeit RT60 in der Raumakustik und mit welcher Formel laesst sie sich naeherungsweise berechnen?",
        answerA = "Die Zeit in Sekunden, die ein Schall benoetigt, um nach Abschalten der Quelle um 60 dB abzusinken — Sabines Formel: RT60 = 0,161 x V / A, wobei V das Raumvolumen in Kubikmetern und A die Gesamtabsorptionsflaeche (Sabin) ist",
        answerB = "Die Zeit vom Beginn des Schalls bis zum Erreichen des maximalen Schalldruckpegels in einem Raum",
        answerC = "Den Zeitversatz zwischen Direktschall und dem ersten Reflex an der Rueckwand, gemessen in Millisekunden",
        answerD = "Die Grenzfrequenz, unterhalb derer ein Raum als akustisch tot (anechoisch) gilt",
        correctAnswer = 0,
        explanation = "RT60 (Nachhallzeit) ist der Zentralbegriff der Raumakustik. Wallace Clement Sabine formulierte die Formel 1900: RT60 = 0,161 x V / A (SI-Einheiten). V = Raumvolumen [m3], A = Summe aller Absorptionsflaechenwerte [m2 Sabin]. Die Formel gilt fuer diffuse Schallfelder in rechteckigen Raeumen. Konzertsaele angestrebt RT60 ca. 1,8-2,2 s (Sinfonie), Sprachverstaendlichkeit erfordert RT60 < 1 s.",
        difficulty = 5,
        funFact = "Wallace Sabine (1868-1919) entwickelte seine Formel mit bemerkenswert einfachen Mitteln: Er schleppte Sitzkissen aus dem Sanders Theatre in Fogg Art Museum und mass den Nachhall mit einer Stoppuhr und seinen eigenen Ohren. Trotzdem ist seine Formel bis heute die Grundlage der Raumakustik."
    ),

    // Q17
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Schalldruckpegel (SPL — Sound Pressure Level) und welche Referenzgroesse liegt der Dezibel-Skala zugrunde?",
        answerA = "Der SPL beschreibt den Schalldruck logarithmisch relativ zur Hoerschwelle des menschlichen Ohrs: Lp = 20 x log10(p/p0) dB, wobei p0 = 20 Mikropascal der Referenzschalldruck (Hoerschwelle bei 1 kHz) ist",
        answerB = "Der SPL misst die Schallintensitaet in Watt pro Quadratmeter mit dem Referenzwert 1 Watt/m2",
        answerC = "Der SPL beschreibt die Schallgeschwindigkeit in verschiedenen Medien, normiert auf den Luftwert von 343 m/s",
        answerD = "Der SPL ist das Verhaeltnis von Schalldruck zum atmosphaerischen Luftdruck von 101325 Pascal",
        correctAnswer = 0,
        explanation = "Der Schalldruckpegel (SPL) wird in Dezibel (dB) angegeben: Lp = 20 x log10(p/p0), wobei p0 = 20 microPa der internationale Referenzschalldruck ist (Hoerschwelle des gesunden menschlichen Ohrs bei 1 kHz). Wegen des logarithmischen Massstabs entspricht eine Verdoppelung des Schalldrucks +6 dB, eine Verzehnfachung +20 dB. Schmerzgrenze liegt bei ca. 120-130 dB SPL.",
        difficulty = 5,
        funFact = "Die Einheit 'Bel' (1/10 Dezibel) wurde nach Alexander Graham Bell benannt. In der Praxis arbeitet man fast immer mit Dezibel, da das Bel zu grob ist. Das Dezibel ist keine absolute Einheit, sondern immer ein Verhaeltnis zu einem Referenzwert — deshalb gibt es verschiedene dB-Masstaebe (dBSPL, dBFS, dBu, dBV)."
    ),

    // Q18
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Impulse Response' (IR) in der akustischen Messtechnik und wie wird sie in der modernen Raumakustikmessung erfasst?",
        answerA = "Die vollstaendige akustische 'Fingerabdruck' eines Raums: die zeitliche Antwort auf einen idealen Impuls. Moderne Messung nutzt logarithmische Sinus-Sweeps statt Pistolenschuss, weil sie besseres Signal-Rausch-Verhaeltnis und vollstaendige Frequenzinformation liefern",
        answerB = "Die Reaktionszeit des Raumklangs auf eine plotzliche Schallquellenverschiebung, gemessen in Millisekunden",
        answerC = "Das Spektrogramm des ersten Reflekses an der Decke, isoliert durch Bandpassfilterung",
        answerD = "Die Impulsantwort des Mikrofons, die dessen Frequenzgang und Verzerrungsverhalten charakterisiert",
        correctAnswer = 0,
        explanation = "Die Impulsantwort (IR) beschreibt, wie ein Raum auf einen idealen zeitlichen Impuls reagiert — sie enthalt die vollstaendige Information ueber Nachhall, Reflektionen und Absorption in allen Frequenzen. Fruehher nutzte man Pistolenschuesse; modern sind Logarithmische Sinus-Sweeps (LSS) Standard, weil sie hoehes SNR bieten und nicht-lineares Verhalten (Verzerrungen) separieren. Mit Faltungs-Algorithmen (Convolution) kann jeder Sound durch eine IR raeumlich prozessiert werden.",
        difficulty = 5,
        funFact = "Die Impulsantworten beruehmter Konzertsaele werden kommerziell als 'Convolution Reverb Packs' verkauft. Tonstudios koennen so den Klang der Elbphilharmonie, der Carnegie Hall oder des Wiener Musikvereinsaals simulieren — durch Faltung des Trockensignals mit der echten IR des jeweiligen Saals."
    ),

    // Q19
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem psychoakustischen Phaenomen der 'kritischen Bandbreite' (Critical Band) nach Bark-Skala, und welche Bedeutung hat es fuer die Klangsynthese?",
        answerA = "Der Frequenzbereich, innerhalb dessen zwei Toene miteinander interferieren und sich im auditorischen System nicht getrennt wahrnehmen lassen — Klangmischer und Synthesizer muessen Partialtoene ausserhalb kritischer Baender positionieren, um Maskierung zu vermeiden",
        answerB = "Der Frequenzbereich zwischen 2000 und 4000 Hz, in dem das menschliche Ohr am empfindlichsten ist",
        answerC = "Die minimale Frequenzdifferenz, die noetig ist, damit zwei gleichzeitige Sinustoene als getrennte Toene wahrgenommen werden",
        answerD = "Der Frequenzbereich, in dem Tonsignale durch Tiefpass-Filterung nicht wahrnehmbar gedaempft werden",
        correctAnswer = 0,
        explanation = "Die kritische Bandbreite (Critical Band) ist ein Konzept der Gehoerphysiologie: Das Ohr analysiert Schall in frequenzselektiven 'Baendern' auf der Basilarmembran der Cochlea. Zwei Frequenzen innerhalb eines kritischen Bandes erzeugen Schwebungen und Maskierung; ausserhalb davon werden sie getrennt wahrgenommen. Die Bark-Skala teilt das Hoerspektrum in 24 kritische Baender. Dieses Konzept ist grundlegend fuer psychoakustische Audiokompression (MP3) und additive Synthese.",
        difficulty = 5,
        funFact = "MP3-Kompression basiert massgeblich auf der psychoakustischen Maskierung innerhalb kritischer Baender: Informationen, die durch lautere Nachbarsignale im gleichen kritischen Band verdeckt werden, koennen weggelassen werden, ohne dass das menschliche Ohr einen Unterschied hoert. Deshalb klingt MP3 bei 320 kbps fast identisch mit WAV."
    ),

    // Q20
    Question(
        categoryId = 5,
        questionText = "Was misst der 'Clarity Index' C80 in der Raumakustik und fuer welche Musikgattungen ist er besonders relevant?",
        answerA = "C80 misst das logarithmische Verhaeltnis von Schallenergie innerhalb der ersten 80 ms (Direktschall + fruehe Reflektionen) zur Energie nach 80 ms (Nachhall) — hohe C80-Werte bedeuten grosse Klarheit, niedrige mehr Verschmelzung; besonders relevant fuer Orchestermusik",
        answerB = "Die maximale Schalldruckdifferenz zwischen Buehne und letzter Zuschauerreihe in dB",
        answerC = "Der Zeitpunkt (in ms), nach dem 80% der Gesamtnachhallenergie des Raums abgeklungen sind",
        answerD = "Das Verhaeltnis von Direktschall zum Diffusschall, gemessen in der Mitte des Saals",
        correctAnswer = 0,
        explanation = "C80 (Clarity, 80ms-Grenze) ist ein Schluesselmass fuer musikalische Raumakustik: C80 = 10 x log10(E0-80/E80-inf) [dB]. Positive C80-Werte (> 0 dB) bedeuten, dass mehr Energie in den ersten 80 ms ankommt — der Raum klingt 'klar'. Negative Werte bedeuten mehr Nachhall, mehr 'Verschmelzung'. Fuer Orchestersinfonik sind leicht negative bis null-Werte ideal, fuer Kammermusik eher positive. Das Mass wurde von Jens Holger Rindel systematisiert.",
        difficulty = 5,
        funFact = "Die Berliner Philharmonie von Hans Scharoun gilt akustisch als eines der besten Konzertsaele weltweit. Ihre C80-Werte schwanken je nach Sitzplatz erheblich — manche Plaetze hoeren sehr klar, andere sehr raumig. Dies ist Folge der unregulmaessigen Weinbergterassen-Anordnung, die Scharoun bewusst einsetzte."
    ),

    // Q21
    Question(
        categoryId = 5,
        questionText = "Welches Messprinzip liegt dem binauralen Aufnahmeverfahren (Kunstkopf-Stereofonie) zugrunde, und warum repraesentiert es eine raeumliche Hoererfahrung besonders originalgetreu?",
        answerA = "Zwei Mikrofonkapseln sind in den Gehoergaengen eines menschlichen Kopf-Dummys (HATS) positioniert — die interauralen Differenzen in Zeit (ITD) und Pegel (ILD) sowie kopfbezogene Uebertragungsfunktionen (HRTF) werden unverfaelscht erfasst und bei Wiedergabe ueber Kopfhoerer als vollstaendige raeumliche Szene rekonstruiert",
        answerB = "Zwei Stereomikrofone werden im Abstand der menschlichen Ohren positioniert, um die Laufzeitdifferenzen zu erfassen, die das Gehirn als Richtungsinformation verarbeitet",
        answerC = "Ein Ambisonic-Array aus vier Mikrofonen erfasst das schallfeld in drei Dimensionen, das dann auf Kopfhoerer oder Lautsprecher gemischt wird",
        answerD = "Das binaurale Verfahren kombiniert Monoaufnahmen mit digitalen Delay-Linien, die die raeumliche Empfindung nachtraeglich simulieren",
        correctAnswer = 0,
        explanation = "Binaurale Aufnahmen mit HATS (Head And Torso Simulator, z.B. dem 'Kunstkopf' von Neumann/Sennheiser, entwickelt 1973) erfassen genau die Signale, die ein Mensch an beiden Ohreingengen wahrnehmen wuerde. Die kopfbezogene Uebertragungsfunktion (HRTF) kodiert Aussenohrkanaeresonanzen und Schallbeugung am Torso. Bei Kopfhoererwiedergabe rekonstruiert das Gehirn eine praesize raeumliche Klangsituation — einschliesslich Hoehen- und Tiefenwahrnehmung, die normale Stereofonie nicht leisten kann.",
        difficulty = 5,
        funFact = "Der Neumann KU 100 'Fritz' ist der kommerziell erfolgreichste Kunstkopf und wird von BBC, BR und vielen Rundfunkanstalten eingesetzt. Binaurale Produktionen gewinnen durch VR und 3D-Audio-Streaming (Dolby Atmos, Sony 360 Reality Audio) wieder an Bedeutung."
    ),

    // Q22
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Psychoakustik unter dem 'Haas-Effekt' (Praezedenzeffekt) und welche praktische Anwendung hat er in der Beschallungstechnik?",
        answerA = "Bei Verzoegerungen des zweiten Lautsprechers bis ca. 40 ms hoert der Hoerer nur die Richtung des ersten Signals, auch wenn das verzoegerte Signal lauter ist — in der Live-Beschallung verzoegert man Satellitenboxen, damit die raeumliche Lokalisierung zur Buehne zeigt, nicht zum nahen Lautsprecher",
        answerB = "Das Echo wird erst ab 50 ms Verzoegerung als separates Schallereignis wahrgenommen — unter 50 ms verschmilzt es mit dem Direktschall",
        answerC = "Zwei gleichzeitige Klangquellen aus verschiedenen Richtungen werden stets als ein einziger Klang in der Mitte lokalisiert",
        answerD = "Der erste Schall einer Sequenz wird immer lauter wahrgenommen als spaetere Schallereignisse, unabhaengig von ihrer Amplitude",
        correctAnswer = 0,
        explanation = "Der Haas-Effekt (1951, Helmut Haas): Das Gehirn lokalisiert eine Schallquelle anhand der zuerst eintreffenden Wellenfront (Praezedenz). Trifft ein zweites Signal mit bis zu 30-40 ms Verzoegerung ein, wird es als Raeumlichkeit wahrgenommen — nicht als getrennte Quelle — auch wenn es bis zu 10 dB lauter ist. In Beschallungsanlagen werden Fill-Lautsprecher um die entsprechende Laufzeit verzoegert, damit das Publikum die Schallquelle weiterhin auf der Buehne lokalisiert.",
        difficulty = 5,
        funFact = "Helmut Haas formulierte seinen Effekt in seiner Dissertationsschrift 1949 am Universitaet Goettingen, veroffentlicht 1951. Sein Versuchsaufbau war einfach, seine Erkenntnis revolutionaer: Die Natur des menschlichen Hoersystems priorisiert das erste Signal — eine evolutionaere Anpassung fuer das Orten von Schallquellen in reflexionsreicher Umgebung."
    ),

    // ── Musikethnologie-Theorien (8) ──────────────────────────────────────────

    // Q23
    Question(
        categoryId = 5,
        questionText = "Welches Konzept entwickelte Bruno Nettl in seiner Theorie der Musikethnologie, um den Widerspruch zwischen universellen Mustern und kultureller Spezifitaet in der Weltmusik zu beschreiben?",
        answerA = "Nettl unterschied zwischen 'Musikuniversalien' (Eigenschaften, die in allen Kulturen vorkommen, z.B. Melodie, Rhythmus, Variation) und 'kulturellen Spezifika' und forderte eine Forschungsmethode, die beide Ebenen beachtet ohne eine zu privilegieren",
        answerB = "Er entwickelte das Konzept der 'musikalischen Biologie', das genetisch verankerte Musikpraeferenzen als Erklaerung fuer transkulturelle Aehnlichkeiten postuliert",
        answerC = "Nettl etablierte die These, dass alle Musikkulturen aus einem gemeinsamen afrikanischen Ursprung stammen und sich von dort weltweit differenziert haben",
        answerD = "Er entwickelte eine 'universelle Grammatik der Musik' analog zu Chomskys Transformationsgrammatik, die kulturuebergreifende Tiefenstrukturen beschreibt",
        correctAnswer = 0,
        explanation = "Bruno Nettl (1930-2020) war einer der wichtigsten Theoretiker der Ethnomusikologie. In 'The Study of Ethnomusicology' (1983, rev. 2005) diskutiert er Musikuniversalien (Patternsysteme, die in allen Kulturen vorkommen) versus kulturelle Besonderheiten. Er warnt vor eurozentrischem Universalismus und vor radikalem kulturellen Relativismus gleichermassen und fordert eine dialektische Perspektive.",
        difficulty = 5,
        funFact = "Nettl verbrachte jahrzehntelange Feldforschungszeit bei den Blackfoot-Indianern Montanas und in Iran. Er war einer der ersten Ethnomuskologen, der systematisch die Wechselwirkung zwischen Weltmusiktraditionen und westlicher Kommerzialisierung (Weltmusik-Markt) untersuchte."
    ),

    // Q24
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Transkription' in der Ethnomusikologie und welche methodischen Probleme verbinden sich damit?",
        answerA = "Die Uebertragung muendlich tradierter Musik in westliche Notenschrift — methodische Probleme: Mikrotone und Glissandi lassen sich kaum exakt notieren, kulturelle Strukturen werden durch westliche Kategorien (Takt, Tonleiter) verzerrt, und die Auswahl der Transkriptionsmethode praegt die Interpretation",
        answerB = "Die Uebersetzung ethnischer Sprachtexte in europaische Sprachen, wobei musikalische Intonation als Bedeutungstraeger verloren geht",
        answerC = "Das Abschreiben eines Musikstuecks von einer auf eine andere Handschrift, typisch fuer die Ueberlieferungsforschung im europaeischen Mittelalter",
        answerD = "Die Anpassung exotischer Skalen an das europaische 12-Ton-System als Grundlage fuer kompositorische Verarbeitung",
        correctAnswer = 0,
        explanation = "Transkription ist ein zentrales, aber umstrittenes Verfahren der Ethnomusikologie. Die Probleme sind vielschichtig: Mikrotone (z.B. arabische Vierteltone, indische sruti) sprengen das westliche Notenraster. Strukturprinzipien wie Raga, Maqam oder Gamelan-Schichtung werden durch Takt- und Tonleiterkonzepte verzerrt. Mantle Hood entwickelte Alternativen (Grafische Transkription, Time-code-Notation), aber keine Methode ist neutral.",
        difficulty = 5,
        funFact = "Bela Bartok transkribierte ueber 13.000 Volkslieder aus Ungarn, Rumaenien, der Tuerkei und Nordafrika mit eigenem Notationssystem fuer Mikrotone und Ornamente. Seine Methode war fuer die Zeit revolutionaer praezise — aber auch Bartok klagte, dass keine Notation den lebendigen Vortrag vollstaendig erfassen koenne."
    ),

    // Q25
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Musikethnologie unter dem Konzept der 'Musikkultur' nach Alan Merriam und wie unterscheidet er es vom blossen Begriff 'Musik'?",
        answerA = "Merriam unterscheidet zwischen dem Klangprodukt (Musik als Schall) und dem umfassenderen Konzept der 'Musikkultur', das die sozialen, konzeptionellen und behavioralen Dimensionen einschliesst — sein Drei-Ebenen-Modell: Konzepte ueber Musik, Verhalten in Bezug auf Musik, und der Klang selbst",
        answerB = "Musikkultur bezeichnet die Gesamtheit aller schriftlich ueberlieferten Musiktraditionen einer Gesellschaft, Musik meint die mundlich tradierte Volksmusik",
        answerC = "Merriam definiert Musikkultur als den wirtschaftlichen und institutionellen Rahmen, in dem Musik produziert und konsumiert wird",
        answerD = "Der Begriff unterscheidet zwischen professioneller Musik (Musikkultur) und Amateurmusik (Musik) innerhalb einer Gemeinschaft",
        correctAnswer = 0,
        explanation = "Alan Merriam (1923-1980) entwickelte in 'The Anthropology of Music' (1964) sein einflussreiches Drei-Ebenen-Modell: 1) Konzepte ueber Musik (Theorien, Bedeutungen, Werte einer Gesellschaft bezueglich Musik), 2) Verhalten in Bezug auf Musik (Soziale Rollen, Lernprozesse, Rituale), 3) Musikklang selbst. Musik kann ohne diesen kulturellen Kontext nicht vollstaendig verstanden werden — das war sein zentrales Argument gegen eine rein klangtechnische Analyse.",
        difficulty = 5,
        funFact = "Merriam selbst war Schlagzeuger und hatte einen bimusikalischen Hintergrund in Jazz und akademischer Musik. Seine Dissertation behandelte die Musik der Flathead-Indianer Idahos — eine Forschungsarbeit, die er als 'ethnomusicologist in the field' mit umfassendem Einblick in Stammesleben und Musikpraxis betrieb."
    ),

    // Q26
    Question(
        categoryId = 5,
        questionText = "Welche Theorie entwickelte Charles Seeger mit seinem Konzept der 'Musikologie' als Gegenueber zur 'Linguologie' in der wissenschaftlichen Musikbetrachtung?",
        answerA = "Seeger postulierte, dass Musik als autonomes Erkenntnissystem nicht vollstaendig durch Sprache (Musikwissenschaft) erfasst werden kann — 'Musikologie' beschreibt die Erkenntnis durch Musik selbst, 'Linguologie' die Beschreibung von Musik durch Worte; er nannte diesen Widerspruch die 'musicological juncture'",
        answerB = "Seeger entwickelte eine Universalgrammatik der Musik analog zur Linguistik, die alle musikalischen Systeme durch gemeinsame Tiefenstrukturen erklaert",
        answerC = "Er postulierte, dass alle Vokalmusik urspruenglich aus sprachlichen Intonationsmustern entstammt und stellte Linguologie als Mutterdisziplin der Musikologie dar",
        answerD = "Seegers Theorie besagt, dass musikalische Syntax und linguistische Syntax identischen Transformationsregeln folgen und daher eine einheitliche Kognitionswissenschaft moeglich sei",
        correctAnswer = 0,
        explanation = "Charles Seeger (1886-1979, Vater von Pete Seeger) ist einer der theoretisch ambitioniertesten Musikwissenschaftler. Sein Konzept der 'musicological juncture': Musik ist ein eigenes Erkenntnissystem (Musikologie), Sprache ueber Musik ist ein anderes (Linguologie). Jede Beschreibung von Musik in Worten ist ein Uebersetzungsproblem. Dieses erkenntnistheoretische Dilemma ist bis heute in der Musikwissenschaft ungeklaert.",
        difficulty = 5,
        funFact = "Charles Seeger war einer der Grundungsvaeter der American Musicological Society (1934) und ein Pionier der Ethnomusikologie in den USA. Er ist der Vater von Folk-Ikone Pete Seeger und dem Produzenten Mike Seeger — eine musikalische Familie par excellence, die zwischen akademischer Theorie und politischem Aktivismus lebte."
    ),

    // Q27
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Musikdiffusion' in der historischen Ethnomusikologie, und welche Theorie steht dieser Betrachtungsweise gegenüber?",
        answerA = "Diffusionismus behauptet, Musikstile und -instrumente verbreiteten sich durch Kontakt und Migration von Ursprungszentren ('Kulturkreise') — dem gegenueber steht der Evolutionismus, der parallele unabhaengige Entwicklung aehnlicher Musikformen in verschiedenen Kulturen postuliert",
        answerB = "Musikdiffusion bezeichnet den Prozess, durch den kommerzielle Popularmusik traditionelle Musikformen in Entwicklungslaendern verdrAngt",
        answerC = "Der Begriff beschreibt die Ausbreitung eines Musikstuecks von der urbanen Elite in die laendliche Volkskultur",
        answerD = "Diffusion meint die Akkulturation einer Musikkultur an eine dominante Fremdkultur unter Verlust der eigenen Identitaet",
        correctAnswer = 0,
        explanation = "Der Diffusionismus in der Ethnomusikologie (beeinflusst von Friedrich Ratzel und Curt Sachs) erklaert aehnliche Musikinstrumente und -stile in verschiedenen Kulturen durch historische Kontakte, Migrationen und Handel. Curt Sachs' Organologiewerk nutzte diffusionistische Argumente fuer die Verbreitung von Instrumententypen. Der Evolutionismus (etwa Adolf Bastians 'Elementargedanken') sieht aehnliche Entwicklungen als parallele, unabhaengige Loesungen gleicher menschlicher Beduerfnisse.",
        difficulty = 5,
        funFact = "Curt Sachs und Erich von Hornbostel entwickelten 1914 das Hornbostel-Sachs-System zur Klassifikation von Musikinstrumenten. Dieses System, das auf deweys Dezimalklassifikation basiert, wird bis heute weltweit verwendet — obwohl es urspruenglich auf diffusionistischen Annahmen aufbaute."
    ),

    // Q28
    Question(
        categoryId = 5,
        questionText = "Welche Kritik formulierte John Blacking an der westlichen Musikwissenschaft in seinem Werk 'How Musical Is Man?' (1973)?",
        answerA = "Blacking kritisierte die westliche Annahme, Musikalitaet sei ein seltenes Talent Weniger — er zeigte am Beispiel der Venda (Suedafrika), dass alle Menschen musikfaehig sind, und forderte, Musik als universell menschliche, nicht elite Faehigkeit zu begreifen",
        answerB = "Er kritisierte die Notationsgebundenheit westlicher Musikwissenschaft und forderte den Einbezug improvisierter Musik als gleichwertige Ausdrucksform",
        answerC = "Blacking stellte die These auf, dass westliche Kunstmusik gegenueber muendlich tradierten Musikformen strukturell weniger komplex ist",
        answerD = "Er kritisierte die Trennung von Musik und Tanz in der westlichen Forschung und behauptete, beide seien anthropologisch nicht trennbar",
        correctAnswer = 0,
        explanation = "John Blacking (1928-1990) verbrachte Feldforschungsjahre bei den Venda in Suedafrika. Sein Buch 'How Musical Is Man?' (1973) ist ein ethnomusikologischer Klassiker: Er argumentiert, dass alle Venda-Kinder singen und musizieren, ohne besondere 'Begabung' zu benoetigen. Musikalitaet ist eine universell menschliche Faehigkeit, keine Gabe Weniger. Die westliche Vorstellung vom 'musikalischen Talent' ist eine kulturelle Konstruktion, keine biologische Tatsache.",
        difficulty = 5,
        funFact = "Blacking selbst war ausgebildeter Pianist und hatte eine Doppelidentitaet als Performeeer und Forscher. Er behauptete spaeter, die Zeit bei den Venda habe seine eigene Musikalitaet fundamental veraendert — er hoerte und spielte danach anders."
    ),

    // Q29
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Ethnomusikologie unter 'Bimusikal' (Bimusikalitaet) nach dem Konzept von Mantle Hood, und welche methodische Forderung verbindet sich damit?",
        answerA = "Bimusikal beschreibt einen Forscher, der in zwei verschiedenen Musiktraditionen performativ kompetent ist — Hood forderte, dass Ethnomuskologen die untersuchte Musiktradition aktiv erlernen sollen (Mitspielen, Singen), um sie von innen zu verstehen, nicht nur zu beobachten",
        answerB = "Bimusikalitaet bezeichnet das Beherrschen zweier verschiedener westlicher Musikstile (z.B. Klassik und Jazz) als Grundlage fuer den interkulturellen Vergleich",
        answerC = "Das Konzept beschreibt die Faehigkeit, gleichzeitig in zwei verschiedenen Tonalitaetssystemen zu denken — eine Grundkompetenz des vergleichenden Musikwissenschaftlers",
        answerD = "Hood meinte damit die Faehigkeit, Musik sowohl kompositorisch als auch analytisch zu beurteilen — eine Kombination von Komposition und Theorie",
        correctAnswer = 0,
        explanation = "Mantle Hood (1918-2005) forderte in seinem einflussreichen Aufsatz 'The Challenge of Bi-Musicality' (1960): Ethnomuskologen muessen die untersuchte Musik aktiv erlernen und performativ beherrschen. Nur wer Gamelan spielt, Raga singt oder Kora schlaegt, versteht die Musik von innen. Am UCLA etablierte Hood weltmusikalische Ensembles als akademische Kurse — eine Praxis, die heute weltweit Schule gemacht hat.",
        difficulty = 5,
        funFact = "Mantle Hood grundete an der UCLA das beruehmte 'World Music Program' mit ueber 20 Ensembles aus verschiedenen Weltmusikkulturen. Studenten lernten Gamelan, Afrikanische Schlaginstrumente, Indische Klassik — eine Methode, die den Unterschied zwischen 'Zuschauen' und 'Verstehen' paradigmatisch illustriert."
    ),

    // Q30
    Question(
        categoryId = 5,
        questionText = "Welche theoretische Position vertritt Steven Feld mit seinem Konzept der 'Acoustemology' (Acoustic Epistemology)?",
        answerA = "Feld postuliert, dass Schallwahrnehmung und musikalisches Hoeren eine eigene Erkenntnisform darstellen — am Beispiel der Bosavi-Regenwaldbewohner Papua-Neuguineas zeigt er, wie Menschen Welt durch Klangerfahrung (nicht primae durch Sehen) verstehen und kategorisieren",
        answerB = "Acoustemology ist eine Methode der objektiven Raumakustikmessung, die epistemologisch gegenueber subjektiven Klangerfahrungen privilegiert wird",
        answerC = "Feld entwickelte ein System zur computergestuetzten Analyse von Sprachmelodie als Schnittstelle zwischen Linguistik und Musikwissenschaft",
        answerD = "Die Theorie besagt, dass akustisches Wissen kulturell konstruiert ist und keine Verbindung zur physikalischen Schallrealitaet hat",
        correctAnswer = 0,
        explanation = "Steven Felds 'Acoustemology' (ein Koffer aus 'acoustic' und 'epistemology') beschreibt Schall als Erkenntnismedium: Die Bosavi-Kaluli Papua-Neuguineas navigieren den Regenwald primae akustisch — Vogelgesang, Wasserfall, Wind sind nicht nur Orientierungshilfen, sondern ontologische Kategorien. Sein Buch 'Sound and Sentiment' (1982) und das spaetere Konzept 'Acoustemology' sind Standardtexte der Soundstudies-Bewegung.",
        difficulty = 5,
        funFact = "Feld verbrachte jahrelang Feldforschungszeit bei den Kaluli und machte dort auch Tonaufnahmen, die als 'Bosavi: Rainforest Music from Papua New Guinea' veroffentlicht wurden. Diese Aufnahmen gelten als Musterbeispiel ethnomusikologischer Feldforschung und wurden von Musikern wie Brian Eno als Inspiration genannt."
    ),

    // ── Archivierung / Klangspeicherung (7) ──────────────────────────────────

    // Q31
    Question(
        categoryId = 5,
        questionText = "Was bezeichnete Edison als grundlegendes technisches Problem bei der Entwicklung des Phonographen (1877) und wie unterscheidet sich das Verfahren vom spaeter entwickelten Grammophon Berlins?",
        answerA = "Edison nutzte Tiefenschrift auf Zinnfolie (spaeter Wachswalzen): Die Nadel bewegt sich vertikal entsprechend dem Schalldruck. Berlins Grammophon (1887) nutzte Seitenschrift auf flachen Schellackplatten: Die Nadel bewegt sich horizontal. Berlins Plattenformat erlaubte Massenreplikation durch Pressverfahren, Edisons Walzen mussten einzeln bespielt werden.",
        answerB = "Edison verwendete elektromagnetische Induktion zur Aufzeichnung, Berlin das mechanische Einritzen; erst Berlins System erlaubte elektrische Wiedergabe",
        answerC = "Edisons Phonograph arbeitete mit Magnetband, Berlins Grammophon mit Lackplatten; die Unterschiede lagen ausschliesslich im Traegermedium",
        answerD = "Edison nutzte Quecksilber als Schreib-Medium auf Kupferwalzen, Berlin entwickelte die Fotographie des Schalldrucks auf lichtempfindliche Platten",
        correctAnswer = 0,
        explanation = "Edisons Phonograph (1877) nutzte Tiefenschrift: Eine Nadel ritzt vertikal in Zinnfolie (spaeter Wachs) entsprechend den Schallschwingungen. Berlins Grammophon (Erfindung 1887) nutzte Seitenschrift auf flachen Scheiben. Das Entscheidende: Berlins Platten konnten durch einen negativen Metallstempel ('Master') beliebig oft gepresst werden. Diese Massenreproduzierbarkeit machte das Grammophon zum wirtschaftlich dominanten System.",
        difficulty = 5,
        funFact = "Edisons erste Aufnahme war das Kinderlied 'Mary Had a Little Lamb', aufgenommen am 12. August 1877. Edison selbst war so ueberrascht von der Wiedergabe, dass er die eigene Erfindung kaum glauben konnte. Er nannte den Phonographen spater sein liebstes Erfindung — obwohl er wirtschaftlich das Rennen gegen Berlins Grammophon verlor."
    ),

    // Q32
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Spielfeldbreite' (Stereobreite) bei der Lagerung und Restaurierung historischer Magnetbandaufnahmen, und welche Probleme entstehen bei der Digitalisierung alter Tonbaender?",
        answerA = "Historische Bander koennen durch den 'Sticky-Shed-Syndrom' (SSS) kleben — die Polyurethanbindung der Magnetschicht absorbiert Feuchtigkeit und zerfaellt beim Abspuelen. Standardrettung: Backingverfahren (Erwaermen im Ofen bei 50-55 Grad) um die Bindung temporaer zu stabilisieren, dann digitalisieren",
        answerB = "Die Stereobreite historischer Aufnahmen ist durch den Kopierverlust (generation loss) beim Analographierumkopieren stark reduziert und muss durch digitale Breitenexpansion restauriert werden",
        answerC = "Alte Magnetbaender haben oft die falsche Betriebsgeschwindigkeit aufgezeichnet und muessen durch Zeitstreckung (TSM) auf Standardpitch korrigiert werden",
        answerD = "Das Sticky-Shed-Syndrom bezeichnet verrutschte Aufkopfspuren bei fruehzeitigem Reel-zu-Reel-Abspuelen, das durch Schubladenreinigung behoben wird",
        correctAnswer = 0,
        explanation = "Sticky-Shed-Syndrom (SSS) ist ein Hauptproblem bei Polyurethanbinder-Magnetbaendern der 1970er-80er (Ampex, 3M): Die Bindung absorbiert Feuchtigkeit, wird klebrig und bleibt beim Abspielen an Kopf und Bandleitrollen kleben. Die Standardrettung: Das Band wird 4-8 Stunden im Ofen bei ca. 52 Grad gebacken ('Baking'). Dies trocknet die Bindung temporaer, ermoeglicht eine Abspielung und Digitalisierung. Danach verschlechtert sich das Band erneut.",
        difficulty = 5,
        funFact = "Das IRENE-System (Image, Reconstruct, Erase Noise Etc.) der Library of Congress scannt physikalisch beschaedigte Schallplatten beruehrungslos mit einem Profilometer und rekonstruiert den Klang digital — ohne die Platte je mit einer Nadel zu beruehren. So werden selbst zersplitterte Platten abgespielt."
    ),

    // Q33
    Question(
        categoryId = 5,
        questionText = "Welche internationale Norm definiert die Anforderungen an die Langzeitarchivierung digitaler Audiodateien, und welches Dateiformat gilt als besonders geeignet?",
        answerA = "ISO 19005 (PDF/A-Standard) gilt fuer Dokumente; fuer Audio ist IASA-TC 04 (International Association of Sound and Audiovisual Archives) die Referenz — empfohlen werden unkomprimierte BWF (Broadcast Wave Format / .wav) mit eingebetteten Metadaten nach EBU R 98 als Archivformat",
        answerB = "ISO 31000 definiert Audioarchivierungsstandards; FLAC ist das einzige anerkannte Format weil es verlustfreie Kompression mit Open-Source-Implementierung verbindet",
        answerC = "Die IFLA (Internationale Foederation der Bibliotheksvereinigungen) schreibt MP3 mit 320 kbps als universelles Archivformat vor, weil es Dateigroe und Qualitaet optimal verbindet",
        answerD = "ITU-R BS.1116 definiert Archivstandards und schreibt DSD (Direct Stream Digital) als verlustfreies Archivformat vor",
        correctAnswer = 0,
        explanation = "IASA-TC 04 (IASA Technical Committee Publications No. 4) ist der internationale Goldstandard fuer audiovisuelle Archivierung. Das empfohlene Format ist BWF (Broadcast Wave Format): unkomprimiertes PCM-Audio (mindestens 48 kHz / 24 bit) mit EBU-konformen Metadaten im BEXT-Chunk. BWF ist ein offener Standard (EBU R 99), langzeitstabil und wird von allen professionellen DAWs gelesen. FLAC ist als Ergienzungsformat akzeptiert, aber BWF ist der Primaerstandard.",
        difficulty = 5,
        funFact = "Die Library of Congress scannert jaehrlich Zehntausende historischer Schallplatten, Zylinder und Drahtaufnahmen. Der groesste Schatz: ca. 3 Millionen Tonaufnahmen im National Jukebox, viele davon auf fragilen 78-U/min-Schellackplatten, die ohne Digitalisierung unwiederbringlich zerstoert werden."
    ),

    // Q34
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Bit Rot' bei der digitalen Langzeitarchivierung von Audiofiles und welche Strategien werden dagegen eingesetzt?",
        answerA = "Bit Rot bezeichnet das spontane, stille Veraendern einzelner Bits in gespeicherten Dateien durch kosmische Strahlung, Medienalterung oder Hardwarefehler — Gegenstrategie: multiple geografisch verteilte Backups, regelmaessige Integritaetspruefungen durch Pruefsummen (MD5, SHA-256) und Migration auf neue Medien alle 5-10 Jahre",
        answerB = "Bit Rot meint den Qualitatsverlust durch wiederholtes Umkopieren digitaler Dateien — entsteht durch Rundungsfehler bei der D/A-A/D-Wandlung bei jedem Kopierschritt",
        answerC = "Der Begriff bezeichnet veraltete Dateiformate, die von neueren Betriebssystemen nicht mehr geoeffnet werden koennen — kein physisches Datenproblem, sondern ein Kompatibilitaetsproblem",
        answerD = "Bit Rot beschreibt den Abbau magnetischer Schichten auf Harddisks durch langjaehrige Lagerung ohne Betrieb",
        correctAnswer = 0,
        explanation = "Bit Rot (auch 'data decay', 'data rot') ist ein reales Problem: Einzelne Bits in gespeicherten Dateien koennen sich spontan aendern (durch kosmische Strahlung, Halbleiteralterung, mechanische Abnutzung). Bei Audiodateien fuehrt das zu unhoerbaren Fehlern, die sich akkumulieren. Gegenstrategie: Redundante Speicherung (RAID, geografisch verteilte Backups), regelmaessige Integritaetschecks (Checksums), und aktive Migration — Dateien regelmaessig auf neue Medien uebertragen.",
        difficulty = 5,
        funFact = "Die NASA verlor Terabytes von Forschungsdaten aus den 1970ern und 1980ern, weil Magnetbaender physisch zersetzt waren und die Hardware zum Abspielen der alten Formate nicht mehr existierte. Das Problem der 'doppelten Obsoleszenz' (Medium und Format veralten gleichzeitig) ist eine der groessten Herausforderungen der digitalen Archivierung."
    ),

    // Q35
    Question(
        categoryId = 5,
        questionText = "Was ist das phonographische Prinzip der 'Vormagnetisierung' (AC Bias) und welche Qualitaetsverbesserung brachte es bei der Magnetbandaufnahme?",
        answerA = "Das Ueberlagern des Nutzsignals mit einem unhoeerbaren Hochfrequenzton (30-100 kHz) waehrend der Aufnahme linearisiert die Magnetisierungskennlinie des Bandes und reduziert Verzerrungen drastisch — entdeckt 1940, ermoeglichte professionelle Klangqualitaet bei Magnetbandaufnahmen",
        answerB = "Eine Gleichstromvormagnetisierung (DC Bias) des Bandkopfes sorgt dafuer, dass das Restmagnetfeld zwischen Aufnahmen erhalten bleibt und Anlaufgerausche vermieden werden",
        answerC = "Die Vormagnetisierung bezeichnet das Erwaermen des Bandes vor der Aufnahme, um die Magnetpartikel beweglicher zu machen und die Koerzitivkraft zu reduzieren",
        answerD = "AC Bias meint die Wechselstromspeisung des Wiedergabekopfes, die Bandgeraeusche durch phasenverschobene Gegensignale kompensiert",
        correctAnswer = 0,
        explanation = "Die AC-Vormagnetisierung (AC Bias) wurde 1940 von Walter Weber und Hans-Joachim von Braunmuehl bei der AEG/BASF-Magnetbandentwicklung entdeckt (zeitgleich auch in Japan). Das Prinzip: Dem Audiosignal wird ein hochfrequenter Ton (ueber 20 kHz) ueberlagert. Dies linearisiert die nicht-lineare Magnetisierungskurve des Bandmaterials und reduziert Klirrverzerrungen von 10-15% (DC-Bias) auf unter 1% (AC-Bias). Erst dadurch wurde Magnetband fuer professionelle Musikaufnahmen brauchbar.",
        difficulty = 5,
        funFact = "Die Entdeckung der AC-Vormagnetisierung war ein Zufallsfund: Ein Radiotechniker stellte versehentlich ein fehlerhaftes Geraet an, das unbeabsichtigt eine Hochfrequenz ueberlagerte — und stellte fest, dass die Aufnahmen deutlich besser klangen. Die gezielte Weitereentwicklung machte Magnetband zum Standardmedium der Rundfunk- und Musikindustrie."
    ),

    // Q36
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Konzept der 'Phonothek' als wissenschaftlicher Institution, und welche Funktion hat die Berliner Phonothek (Phonogrammarchiv) in der Ethnomusikologie?",
        answerA = "Eine Phonothek ist eine wissenschaftliche Sammlung und Archiv von Tonaufnahmen. Das Berliner Phonogrammarchiv (1900 gegruendet, heute im Ethnologischen Museum) besitzt ueber 150.000 historische Aufnahmen aus aller Welt, viele auf Edison-Walzen, und ist UNESCO Memory of the World",
        answerB = "Die Phonothek bezeichnet in der Rundfunktechnik die Schallplatten-Bibliothek eines Senders mit Rechten fuer Sendezwecke",
        answerC = "Das Berliner Phonogrammarchiv ist ein Archiv ausschliesslich europaeischer Volksmusikaufnahmen aus dem 19. Jahrhundert und wurde von Brahms gestiftet",
        answerD = "Eine Phonothek ist eine oeffentliche Hoerbibliothek, in der Buerger Aufnahmen ausleihen koennen, aehnlich einer Buchbibliothek",
        correctAnswer = 0,
        explanation = "Das Berliner Phonogrammarchiv wurde 1900 von Carl Stumpf und Erich von Hornbostel am Psychologischen Institut der Berliner Universitaet gegruendet. Es ist eines der aeltesten tonarchivierenden Institute weltweit und beherbergt ueber 150.000 Aufnahmen auf Wachswalzen, Schellackplatten und Magnetbaendern aus allen Kontinenten. Seit 1999 ist es Teil des Ethnologischen Museums (Humboldt-Forum). Die Sammlung wurde 1999 ins UNESCO Memory of the World Register aufgenommen.",
        difficulty = 5,
        funFact = "Die aeltesten Aufnahmen im Berliner Phonogrammarchiv stammen aus dem Jahr 1893 und zeigen Zulu-Gesang, aufgenommen bei einer Voelkerschau in Berlin. Diese problematische Entstehungsgeschichte (Voelkerschauen als koloniale Spektakel) wird heute im Archiv kritisch reflektiert und in der Metadatierung dokumentiert."
    ),

    // Q37
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'CEDAR' in der professionellen Audio-Restaurierung und welche Prinzipien liegen der algorithmischen Klickentfernung zugrunde?",
        answerA = "CEDAR (Computer Enhanced Digital Audio Restoration) ist ein professionelles System fuer Audio-Restaurierung. Klickentfernung nutzt Transientenerkennung (Amplitude und Steilheit), Interpolationsalgorithmen (z.B. autoregressive Modelle oder Wavelets), um den Klick durch synthethische Signalrekonstruktion zu ersetzen",
        answerB = "CEDAR ist ein Notationsstandard fuer historische Tonaufnahmen, der Metadaten strukturiert und fuer Archivzwecke normiert",
        answerC = "Das Akronym steht fuer 'Certified Enhanced Digital Audio Recording', ein Zertifizierungsstandard fuer Aufnahmestudios",
        answerD = "CEDAR ist eine Klangsimulationstechnik, die historischen Aufnahmen den Klang moderner Aufnahmetechnik hinzufuegt",
        correctAnswer = 0,
        explanation = "CEDAR Audio Ltd (Cambridge, UK, gegruendet 1989) entwickelte die ersten kommerziell erfolgreichen digitalen Audio-Restaurierungssysteme. Ihre Klick- und Knackentfernungsalgorithmen basieren auf: 1) Transientenerkennung (Klicks zeichnen sich durch extrem steile Amplitudengradienten aus), 2) Kontextanalyse (das Signal vor und nach dem Klick), 3) Interpolation durch autoregressive Modellierung oder Wavelet-Zerlegung, um das fehlende Signal zu rekonstruieren. Moderne KI-basierte Systeme (iZotope RX, Adobe Enhance) setzen auf neuronale Netze.",
        difficulty = 5,
        funFact = "Die erste professionelle Restaurierung einer historischen Aufnahme mit CEDAR-Algorithmen war 1988 die Wiederherstellung von Caruso-Platten fuer eine BBC-Dokumentation. Das Ergebnis ueberraschte Audioingenieure: Die bereinigten Aufnahmen klangen so klar, dass die emotionale Qualitat von Carusos Stimme erstmals vollstaendig hoerbar wurde."
    ),

    // ── Gregorianische Semiologie (8) ─────────────────────────────────────────

    // Q38
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der gregorianischen Semiologie nach Dom Eugene Cardine unter dem Begriff 'Neumenzeichen' als Ausdruck rhetorischer Qualitaet und nicht nur als Tonhoehenindikator?",
        answerA = "Cardines Semiologie (Semiology of Gregorian Chant, 1968) interpretiert Neumen als praezise Zeichen fuer Klangqualitaet: Schriftzeichen wie Quilisma, Oriscus oder Episema sind keine reine Tonhoehenanweisungen, sondern Informationen ueber Stimmqualitaet, Weichheit, Akzent und rhythmischen Aufenthaltscharakter",
        answerB = "Neumenzeichen sind nach Cardine ausschliesslich melodische Gedaechtnishilfen fuer bereits bekannte Melodien ohne eigenen Informationsgehalt ueber Rhythmus oder Qualitaet",
        answerC = "Cardine interpretiert Neumen als Linie-Notation, die erst durch die Zuordnung zu Guidonischen Linien ihren rhythmischen Wert erhaelt",
        answerD = "Die Semiologie interpretiert Neumen als graphische Darstellung der Atemtechnik des Saengers, nicht der Melodie selbst",
        correctAnswer = 0,
        explanation = "Dom Eugene Cardine OSB (1905-1988) vom Kloster Solesmes begrundete die gregorianische Semiologie als Wissenschaft. Er wies nach, dass fruehe Neumen (Sangallische, Messine, Laon-Notation) nicht nur Tonhoehe anzeigen, sondern fein differenzierte Klangqualitaeten: Episema (Verlaengerungszeichen), Quilisma (Zitterzeichen fuer weichen Uebergang), Oriscus (besondering Klangqualitaet im Verbund). Diese Zeichen beinhalten phrasing-, dynamische- und agogische Information.",
        difficulty = 5,
        funFact = "Cardines Hauptwerk 'Gregorian Semiology' (1968, deutsch 1979) wurde von seinen Studenten nach seinen Vorlesungsnotizen zusammengestellt. Er selbst hielt die Publikation anfangs fuer verfrueht, da die Forschung noch offene Fragen hatte. Das Werk wurde dennoch zum Standardwerk und loeste eine Welle neuer Choralforschung aus."
    ),

    // Q39
    Question(
        categoryId = 5,
        questionText = "Was unterscheidet die 'adiastematischen' Neumen (Sangallische Neumen) von 'diastematischen' Neumen (Guidonische Linienschrift) in der Geschichte der Choralnotation?",
        answerA = "Adiastematische Neumen (keine Linien, z.B. Sangallen, 9.-11. Jh.) zeigen nur Richtung und Qualitaet der Melodiebewegung ohne genaue Tonhoehe — sie setzen ein bekanntes Repertoire voraus. Diastematische Neumen (mit Linien, Guido d'Arezzo, um 1025) fixieren die genaue Tonhoehe auf Linien und ermoeglichten erst die Ueberlieferung unbekannter Melodien",
        answerB = "Adiastematisch bedeutet, die Neumen sind nur fuer Solisten notiert; diastematisch meint die Notation fuer Chorgruppen",
        answerC = "Adiastematische Neumen notieren ausschliesslich Konsonanten der Melodie (betonte Silben), diastematische alle Silben einschliesslich unbetonter",
        answerD = "Diastematisch bezeichnet Neumen auf zwei Linien (Diastema = Intervall), adiastematisch solche ohne jegliche Linienhilfe und ohne Intervallbezug",
        correctAnswer = 0,
        explanation = "Der entscheidende Schritt der abendlaendischen Musiknotation: Adiastematische Neumen (stilo sangallensis, staffless neumes) konnten nur fuer bereits memorierte Melodien als Gedaechtnishilfe dienen — sie zeigen Bewegungsrichtung und -qualitaet, aber nicht die genauen Intervalle. Guidos Eintuehrung von Linien (um 1025-1030, beschrieben im 'Micrologus') ermoeglichte erstmals die vollstaendige schriftliche Fixierung unbekannter Melodien und damit den Unterricht ohne muendliche Weitergabe.",
        difficulty = 5,
        funFact = "Guido d'Arezzzo schreibt im 'Epistola de ignoto cantu', dass Saenger mit seiner Methode eine bisher unbekannte Melodie in wenigen Tagen erlernen koennen, waehrend sie fruher jahrelang Unterricht brauchten. Papst Johannes XIX. soll bei einer Demonstration so beeindruckt gewesen sein, dass er Guido persoenlich nach Rom einlud."
    ),

    // Q40
    Question(
        categoryId = 5,
        questionText = "Welche Bedeutung hat das Quilisma in der gregorianischen Neumennotation, und wie wird es in der Semiologie nach Cardine interpretiert?",
        answerA = "Das Quilisma (Wellenzeichen) bezeichnet einen weichen, zitternden oder gleitenden Uebergang zwischen zwei Toenen — nach Cardines Semiologie signalisiert es einen besonderen Weich-Charakter des vorausgehenden Tons (der Vorgaenger-Ton soll gehalten und weich gesungen werden) und ist kein einfaches Vorschlag-Element",
        answerB = "Das Quilisma ist ein Trillerpunkt, der dreifache schnelle Wiederholung des bezeichneten Tons anzeigt",
        answerC = "Es bezeichnet das Ende eines Melodiebogens und zeigt an, dass an dieser Stelle ein Atemzug eingelegt werden soll",
        answerD = "Das Quilisma ist ein Transpositionszeichen, das angibt, dass die folgende Passage eine Quart hoeher gesungen werden soll",
        correctAnswer = 0,
        explanation = "Das Quilisma erscheint in den fruehen Handschriften des 9.-11. Jahrhunderts als zackiges Wellenzeichen. Cardines Analyse: Das Quilisma bezeichnet nicht Trillerwiederholung, sondern einen weichen, glissandoartigen Aufstieg (meist kleine Terz aufwaerts). Sein Hauptcharakteristikum: Der Ton VOR dem Quilisma soll verlangert und weich behandelt werden — das Quilisma fungiert als Signal fuer die vocalische Qualitaet des Vorgaengers. Musikhistorisch verweist es auf die antike Praxis der 'Liquescenz'.",
        difficulty = 5,
        funFact = "Das Quilisma ist eines der am strittigsten interpretierten Zeichen der Choralforschung. Einige Forscher (z.B. Kenneth Levy) bezweifeln, dass es spezifische Klangqualitaet anzeigt und halten es fuer ein ornamentales Kuriosium. Die Debatte um seine Bedeutung laeuft seit den 1950ern und ist ein Beispiel fuer die Grenzen der semologischen Methode."
    ),

    // Q41
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Liqueszenz' in der gregorianischen Notation, und bei welchen phonetischen Kontexten tritt sie auf?",
        answerA = "Liqueszenz (lat. liquescere = zerfliessen) bezeichnet das leichte Abschwellen des letzten Tons einer Neumengruppe — sie tritt vor allem bei bestimmten Konsonanten-Verbindungen auf (Diphthonge, Liquiden: l, r, m, n; Affrikaten), wo der Uebergang zwischen Silben stimmlich besonders weich gestaltet werden soll",
        answerB = "Liqueszenz ist ein Rhythmussystem des mittelalterlichen Chorals, bei dem alle Notenwerte durch Division der Breve in kleinere Einheiten fluessig gemacht werden",
        answerC = "Der Begriff bezeichnet das Ineinanderfliessen zweier Melodiephasen ohne Zaesurzeichen, was grosse melodische Boegen erzeugt",
        answerD = "Liqueszenz meint das Aufloesen chromatischer Toene in ihre diatonischen Nachbarn, typisch fuer die Praxis des 11. Jahrhunderts",
        correctAnswer = 0,
        explanation = "Liqueszente Neumen (z.B. Epiphonus, Cephalicus) sind in fruehen Handschriften kleiner geschrieben oder mit speziellen Formen — sie zeigen an, dass der Abschluss-Ton leicht wird ('zerfliessen' soll). Sie treten fast ausschliesslich bei phonetisch anspruchsvollen Konsonanten-Uebergaengen auf: nach Liquiden (l, m, n, r), vor Diphthoingen, bei Sibilanten oder Affrikaten. Der Saenger soll hier besonders weich und sprachlich fliessend formulieren.",
        difficulty = 5,
        funFact = "Liqueszente Neumen finden sich in fruehen gregorianischen Quellen so regelmaessig, dass Musikforscher des 19. Jahrhunderts glaubten, sie seien reine Schreibvarianten ohne eigene Bedeutung. Cardines Semiologie rehabilitierte sie als phaenomenologisch bedeutsame Zeichen — eine Grundlage moderner Choralausfuehrungspraxis."
    ),

    // Q42
    Question(
        categoryId = 5,
        questionText = "Welche Handschriften-Tradition gilt als die praeziseste und informationsreichste Quelle fuer die neumatische Notation des gregorianischen Chorals?",
        answerA = "Die Sangallische Neumennotation (Kloster St. Gallen, 9.-11. Jh., z.B. Codex 359 und 530) gilt wegen ihrer feinen Differenzierung von Buchstaben-Zusatzen (Romanusbuchstaben: c=celeriter, t=tenete, etc.) als informatiosreichste Quelle fuer rhythmisch-qualitative Details des Chorals",
        answerB = "Die franzoesische Metzer Schreibtradition (Messine Neumen, 9. Jh.) ist die aelteste bekannte Neumenhandschrift und gilt deshalb als Urquelle",
        answerC = "Die Beneventaner Tradition (Sueditalien, 11.-13. Jh.) enthalt die vollstaendigste Notation weil sie diastematisch und adiastematisch kombiniert",
        answerD = "Das Graduale Triplex (Solesmes, 1979) ist die massgebliche Quelle, weil es drei Handschriften-Traditionen simultan gegenueberstellt",
        correctAnswer = 0,
        explanation = "Die St. Gallener Handschriften (vor allem Codex Sangallensis 359, 'Cantatorium', um 920-930) sind wegen der Romanusbuchstaben besonders wertvoll: Buchstaben wie 'c' (celeriter = schnell), 't' (tenete = halten), 'a' (altius = hoeher), 's' (sursum = aufwaerts) geben zusaetzliche qualitative und agogische Anweisungen. Dadurch sind St. Gallener Quellen die informativsten Primaerquellen fuer die Ausfuehrungspraxis des Chorals.",
        difficulty = 5,
        funFact = "Das Graduale Triplex (Solesmes 1979) druckt den Choral auf drei Systemen gleichzeitig: Guidonische Liniennotation (bekannt aus dem Graduale Romanum) plus adiastematische Neumen aus St. Gallen (oben) und Laon (unten). Es ist das Standardwerk fuer Schola-Cantorum-Ensembles und ermoeglicht den direkten Vergleich der drei wichtigsten Notationstraditionen."
    ),

    // Q43
    Question(
        categoryId = 5,
        questionText = "Was versteht man in der gregorianischen Formenlehre unter dem Begriff 'Centonisation' und welche Gattungen sind davon besonders betroffen?",
        answerA = "Centonisation bezeichnet die Kompositionspraxis, bei der neue Gesaenge aus bereits vorhandenen, traditionellen Melodiefloskeln (Formeln) zusammengesetzt werden — besonders Gradualen, Offertoria und Tractus zeigen einen hohen Grad an centonisierter Formelkomposition",
        answerB = "Der Begriff bezeichnet die Zuordnung von Texten zu vorgegebenen Melodietypen in der Psalmodie, bei der jeder Ton des Psalms einer bestimmten Formel entspricht",
        answerC = "Centonisation meint das nachtraegliche Einfuegen neuer Texte in vorhandene Melodien (Tropen) als Erweiterung des liturgischen Repertoires",
        answerD = "Die Praxis, Melodien verschiedener Regionen in eine einheitliche roem-foraemische Ur-Choral-Form zurueckzufuehren",
        correctAnswer = 0,
        explanation = "Centonisation (von lat. cento = Flickenwerk) ist ein Grundprinzip gregorianischer Komposition: Viele Gesaenge wurden nicht frei erfunden, sondern aus einem Repertoire stabiler Melodieformeln zusammengesetzt. Besonders Gradualen und Tractus (die aeltesten, psalmisch-responsorischen Formen) zeigen diese Technik deutlich: Bestimmte Formelketten kehren in verschiedenen Gesaengen mit verschiedenen Texten wieder. Leo Treitler und William Apel haben diese Praxis umfassend dokumentiert.",
        difficulty = 5,
        funFact = "Die Theorie der Centonisation erklaert, warum Gregor der Grosse (590-604) unmoeglich der personliche Komponist aller ihm zugeschriebenen Gesaenge gewesen sein kann. Das gregorianische Repertoire ist ein kollektives, uber Jahrhunderte gewachsenes Werk — 'Gregor' ist mehr eine Institution als ein Individuum."
    ),

    // Q44
    Question(
        categoryId = 5,
        questionText = "Welche Funktion hat die 'Episema' in der Sangallischen Neumennotation, und wie unterscheidet sich ihre Interpretation bei Cardine gegenueber der Solesmes-Methode des 19. Jahrhunderts?",
        answerA = "Das Episema (horizontaler Strich ueber einem Neumenzeichen) zeigt nach Cardine eine qualitative Verlaengerung an (der Ton soll mehr Zeit bekommen, soll betont werden). Die Solesmes-Methode des 19. Jh. (Dom Mocquereau) interpretierte alle Noten als gleich lang und deutete das Episema als blossen Akzent ohne rhythmische Implikation",
        answerB = "Das Episema ist ein Transpositionszeichen, das eine Quart-Transposition des folgenden Abschnitts anzeigt",
        answerC = "Es bezeichnet bei Solesmes die Zusammenfassung mehrerer Toene zu einem Syllabikum; Cardine interpretiert es als Phrasierungszeichen ohne rhythmische Bedeutung",
        answerD = "Das Episema war nach beiden Schulen bedeutungslos und wurde in der Praxis ignoriert — seine Funktion ist bis heute ungeklaert",
        correctAnswer = 0,
        explanation = "Das Episema (griechisch: Zeichen, Merkmal) ist ein horizontaler Strich, der einzelne oder mehrere Neumazeichen begleitet. Dom Andre Mocquereau (Solesmes, 1900) sah alle Choraltoene als gleich lang ('ictus'-Theorie) und deutete Episemata als Akzente ohne rhythmische Wirkung. Cardine wies nach, dass die fruehen Handschriften Episemata konsequent an Stellen setzen, die zeitliche Expansion erfordern — eine qualitative, nicht bloss akzentuelle Wirkung. Diese Frage ist zentral fuer die praktische Choralinterpretation.",
        difficulty = 5,
        funFact = "Die 'Solesmes-Methode' des 19. Jahrhunderts (Dom Gueranger, Pothier, Mocquereau) hatte das Ziel, den 'authentischen' Choral wiederherzustellen. Ironischerweise schuf sie eine eigene, historisch nicht vollstaendig belegbare Auffuehrungstradition. Die semologische Forschung Cardines zeigte, dass Solesmes mancherorts zu sehr geglaeäettet hatte."
    ),

    // Q45
    Question(
        categoryId = 5,
        questionText = "Welche Bedeutung haben die sogenannten 'Modi' (Kirchentoene) in der gregorianischen Musiktheorie, und wie unterscheidet sich das mittelalterliche Modalitaetskonzept vom antiken griechischen Tonsystem, auf das es sich beruft?",
        answerA = "Die acht Kirchentoene (Modi) des Mittelalters sind praktische Klassifikationssysteme fuer Gesaenge nach Finalis und Ambitus. Das griechische System war anders strukturiert (Tetrachord-Verbindungen, absteigende Skalen) — die mittelalterliche Modalitaet berief sich auf die Griechen, schuf aber faktisch ein eigenstaendiges System",
        answerB = "Die Kirchentoene sind identisch mit den griechischen Harmoniai und wurden direkt aus Boethius' Uebersetzungen in die gregorianische Praxis uebernommen",
        answerC = "Die mittelalterlichen Modi sind Transpositionsstufen einer einzigen Ur-Skala, genau wie die griechischen Tonoi verschiedene Transpositionslagen derselben Grundskala darstellen",
        answerD = "Kirchentoene und griechische Modi unterscheiden sich nur in der Terminologie, nicht in der strukturellen Beschaffenheit der Skalen",
        correctAnswer = 0,
        explanation = "Das achtmodale System (Oktochos), entwickelt im 8.-9. Jahrhundert in Verbindung mit karolingischer Gesangsreform, klassifiziert gregorianische Melodien nach: 1) Finalis (Schlusston: D, E, F, G), 2) Ambitus (Umfang: authentisch = Quinte ueber Finalis aufwaerts, plagal = Quarte darunter). Das griechische System war fundamental anders: absteigende Tetrachorde, Tonoi als Transpositionsstufen. Die mittelalterliche Modalitaet uebernahm griechische Namen (Dorisch, Phrygisch, Lydisch, Mixolydisch), meinte aber etwas strukturell Verschiedenes — ein historisches Missverstaendnis mit grosser musikhistorischer Wirkung.",
        difficulty = 5,
        funFact = "Der Musiktheoretiker Aurelian von Reome (um 850) ist der erste, der das Oktoechos-System systematisch auf den gregorianischen Choral anwendet. Er selbst war sich der Diskrepanz zwischen griechischer Theorie und frankoer Praxis nicht bewusst — die Namensgleichheit (Dorisch etc.) verschleierte das tiefere strukturelle Missverhaltnis fuer Jahrhunderte."
    )
)
