package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsMaster1(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) — Quer durch alle Wissensgebiete ──

    // Frage 1 — Nobelpreis / Physik
    Question(
        categoryId = 11,
        questionText = "Welcher Physiker erhielt als einziger Mensch in der Geschichte den Nobelpreis zweimal fuer Physik — und wurde beide Male fuer experimentelle Halbleiterforschung ausgezeichnet?",
        answerA = "William Shockley",
        answerB = "John Bardeen",
        answerC = "Walter Brattain",
        answerD = "Herbert Kroemer",
        correctAnswer = 1,
        explanation = "John Bardeen ist der einzige Mensch, der den Nobelpreis fuer Physik zweimal erhielt: 1956 fuer die Erfindung des Transistors (zusammen mit Shockley und Brattain) und 1972 fuer die BCS-Theorie der Supraleitung (zusammen mit Cooper und Schrieffer). Marie Curie gewann zwei Nobelpreise, jedoch in verschiedenen Fachgebieten.",
        difficulty = 5,
        funFact = "John Bardeen war so bescheiden, dass er bei der Verleihung seines zweiten Nobelpreises nur seine beiden Soehne mitnahm — kein grosses Entourage, kein Trubel."
    ),

    // Frage 2 — Vergessene Erfinder
    Question(
        categoryId = 11,
        questionText = "Hedy Lamarr, bekannt als Hollywood-Schauspielerin, meldete 1942 gemeinsam mit George Antheil ein Patent an. Welches technologische Prinzip beschreibt dieses Patent, das heute in WLAN und Bluetooth verwendet wird?",
        answerA = "Amplitudenmodulation mit adaptiver Bandbreite",
        answerB = "Frequenzsprungverfahren (Frequency Hopping Spread Spectrum)",
        answerC = "Zeitmultiplexverfahren mit Fehlerkorrektur nach Reed-Solomon",
        answerD = "Phasenschiebung basierend auf Fourier-Transformation",
        correctAnswer = 1,
        explanation = "Hedy Lamarr und George Antheil patentierten 1942 das 'Secret Communication System' basierend auf dem Frequenzsprungverfahren (FHSS). Das Signal wechselt dabei schnell zwischen verschiedenen Funkfrequenzen, wodurch es schwer abzuhoeren oder zu stoeren ist. Das Prinzip liegt modernen Spread-Spectrum-Technologien wie WLAN und Bluetooth zugrunde. Das Patent lief 1959 ab, bevor die Technologie kommerziell genutzt wurde.",
        difficulty = 5,
        funFact = "Lamarr und Antheil liessen sich von einem Pianola (automatisches Klavier) inspirieren: Wie ein Lochstreifen verschiedene Tasten ansteuert, sollten Sender und Empfaenger synchron die Frequenz wechseln."
    ),

    // Frage 3 — Obskure Geschichte
    Question(
        categoryId = 11,
        questionText = "Der 'Krieg des Eimers' (Guerra del Secchio) von 1325 zwischen Bologna und Modena begann, als Soldaten aus Modena einen Eimer aus einem Brunnen in Bologna stahlen. Wie viele Jahre dauerte der daraus entstandene Konflikt tatsaechlich an?",
        answerA = "2 Jahre",
        answerB = "12 Jahre",
        answerC = "22 Jahre",
        answerD = "37 Jahre",
        correctAnswer = 2,
        explanation = "Der Diebstahl des Eimers im Jahr 1325 war der Funke fuer einen bereits laenger schwelenden Konflikt zwischen den Guelfen (Bologna) und Ghibellinen (Modena). Der eigentliche Krieg dauerte bis 1347, also insgesamt 22 Jahre. Der gestohlene Eimer befindet sich angeblich noch heute im Glockenturm des Palazzo Comunale in Modena.",
        difficulty = 5,
        funFact = "Alessandro Tassoni verewigte das Ereignis 1622 im heroisch-komischen Epos 'La secchia rapita' (Der geraubte Eimer), einem der beruhmtesten Werke der italienischen Barockdichtung."
    ),

    // Frage 4 — Wissenschaft / Chemie
    Question(
        categoryId = 11,
        questionText = "Barry Sharpless erhielt 2001 und 2022 den Nobelpreis fuer Chemie — ein Beispiel fuer zweifache Auszeichnung. Fuer welches Konzept wurde er 2022 ausgezeichnet, das er selbst erstmals 2001 benannte?",
        answerA = "Asymmetrische Katalyse mit BINAP-Liganden",
        answerB = "Click-Chemie — modulare und effiziente Bindungsbildung",
        answerC = "Olefinmetathese mit Ruthenium-Katalysatoren",
        answerD = "Bioorthogonale Chemie mit Tetrazin-Ligation",
        correctAnswer = 1,
        explanation = "Barry Sharpless pragte den Begriff 'Click-Chemie' im Jahr 2001, erhielt den Nobelpreis fuer Chemie 2001 jedoch fuer asymmetrische Oxidationskatalyse. 2022 wurde er dann tatsaechlich fuer die Entwicklung der Click-Chemie ausgezeichnet — gemeinsam mit Carolyn Bertozzi und Morten Meldal. Sharpless ist damit erst die zweite Person nach Marie Curie und neben John Bardeen, die zwei Nobelpreise in Chemie gewann.",
        difficulty = 5,
        funFact = "Der Begriff 'Click-Chemie' entstand durch einen Vergleich mit einem Sicherheitsgurt-Verschluss: Molekuele 'klicken' zuverlassig und schnell zusammen, ohne unerwuenschte Nebenprodukte."
    ),

    // Frage 5 — Philosophie
    Question(
        categoryId = 11,
        questionText = "Welcher Satz stammt aus Immanuel Kants Werk 'Kritik der reinen Vernunft' (1781) und beschreibt den zentralen erkenntnistheoretischen Kern seiner Kopernikanischen Wende?",
        answerA = "\"Die Vernunft erkennt nur das, was sie selbst nach ihrem Entwurfe hervorbringt.\"",
        answerB = "\"Handle nur nach derjenigen Maxime, durch die du zugleich wollen kannst, dass sie allgemeines Gesetz werde.\"",
        answerC = "\"Das Dasein Gottes laesst sich weder beweisen noch widerlegen.\"",
        answerD = "\"Zwei Dinge erfuellen das Gemuet mit immer neuer Bewunderung: der bestirnte Himmel ueber mir und das moralische Gesetz in mir.\"",
        correctAnswer = 0,
        explanation = "Das Zitat 'Die Vernunft erkennt nur das, was sie selbst nach ihrem Entwurfe hervorbringt' stammt aus dem Vorwort zur zweiten Auflage der Kritik der reinen Vernunft (1787) und beschreibt Kants 'Kopernikanische Wende': Nicht der Erkennende richtet sich nach den Gegenstanden, sondern die Gegenstande richten sich nach den Erkenntnisformen des Subjekts. Antwort B ist der kategorische Imperativ aus der Grundlegung zur Metaphysik der Sitten. Antwort D stammt aus dem Beschluss der Kritik der praktischen Vernunft.",
        difficulty = 5
    ),

    // Frage 6 — Seltene Weltrekorde / Geographie
    Question(
        categoryId = 11,
        questionText = "Welches Land der Erde hat die laengste Kuestenlinie der Welt, und welche approximative Laenge in Kilometern wird ihr zugeschrieben?",
        answerA = "Russland mit ca. 37.000 km",
        answerB = "Norwegen mit ca. 83.000 km",
        answerC = "Kanada mit ca. 202.000 km",
        answerD = "Indonesien mit ca. 54.000 km",
        correctAnswer = 2,
        explanation = "Kanada hat mit ca. 202.080 km die laengste Kuestenlinie der Welt, was etwa 28% der gesamten Kuestenlinie der Erde ausmacht. Die extreme Laenge entsteht durch die unzahligen Fjorde, Inseln und Buchten, insbesondere in der Arktis und in British Columbia. Zum Vergleich: Norwegen hat ca. 83.000 km, Russland ca. 37.000 km.",
        difficulty = 5,
        funFact = "Wuerde man Kanadas Kuestenlinie in einer geraden Linie aufspannen, koennte man damit mehr als fuenfmal den Aequator der Erde umrunden."
    ),

    // Frage 7 — Geschichte / Vergessene Ereignisse
    Question(
        categoryId = 11,
        questionText = "Die 'Molasses Flood' von Boston (18. Januar 1919) traf die Stadt mit einer Welle aus Melasse. Welche Geschwindigkeit erreichte die Welle laut historischen Berichten, und wie viele Menschen kamen ums Leben?",
        answerA = "Ca. 15 km/h, 3 Tote",
        answerB = "Ca. 55 km/h, 21 Tote",
        answerC = "Ca. 80 km/h, 47 Tote",
        answerD = "Ca. 35 km/h, 8 Tote",
        correctAnswer = 1,
        explanation = "Am 15. Januar 1919 (nicht 18.) brach ein riesiger Melassetank der United States Industrial Alcohol Company in Boston. Rund 8,7 Millionen Liter Melasse ergossen sich als bis zu 4,5 Meter hohe Welle durch das North End mit einer Geschwindigkeit von ca. 55 km/h. 21 Menschen und zahlreiche Pferde kamen ums Leben, 150 wurden verletzt. Ursache war wohl ein Konstruktionsfehler des Tanks.",
        difficulty = 5,
        funFact = "Anwohner berichten, dass an heissen Sommertagen noch Jahrzehnte spaeter ein suesslicher Geruch aus dem Boden des Bostoner North End-Viertels aufstieg."
    ),

    // Frage 8 — Biologie / Wissenschaft
    Question(
        categoryId = 11,
        questionText = "Das Ames-Experiment (1973) von Bruce Ames revolutionierte die Mutagenitatstestung. Was ist das Kernprinzip des Ames-Tests, und welcher Organismus wird verwendet?",
        answerA = "Maus-Fibroblasten werden mit kanzerogenen Substanzen inkubiert und auf Zelltransformation untersucht",
        answerB = "Histidin-auxotrophe Salmonella-Staemme werden exponiert; Revertanten zeigen mutagenes Potenzial der Substanz",
        answerC = "Drosophila melanogaster wird exponiert; Mosaikphaenomene im Auge zeigen Mutagenizitaet",
        answerD = "Hefen werden mit Substanz behandelt; His⁺-Kolonien auf Minimalmedium zeigen positive Mutagenese",
        correctAnswer = 1,
        explanation = "Der Ames-Test verwendet speziell konstruierte Salmonella typhimurium-Staemme, die eine Histidin-Auxotrophie tragen (sie koennen kein Histidin selbst synthetisieren und sterben auf histidinfreiem Medium). Wenn eine mutagene Substanz vorhanden ist, kehren einige Bakterien durch Rueckmutation zum Wildtyp zurueck (Revertanten) und bilden Kolonien. Die Anzahl der Kolonien korreliert mit der Mutagenizitaet. Wichtig: Zusaetzlich wird ein Ratten-Leberextrakt (S9) zugegeben, um die Metabolisierung durch Leberenzyme zu simulieren.",
        difficulty = 5,
        funFact = "Bruce Ames stellte spaeter fest, dass viele natuerlich vorkommende Pflanzenpestizide den Test ebenso bestehen wie synthetische Chemikalien — ein kontroverser Befund, der die Risikowahrnehmung stark pragte."
    ),

    // Frage 9 — Philosophie / Zitate
    Question(
        categoryId = 11,
        questionText = "Friedrich Nietzsche verwendete den Begriff 'Amor fati' als zentrales Lebenskonzept. In welchem Werk beschreibt er den Gedanken am ausdrucklichsten, und was bedeutet der Begriff wortlich?",
        answerA = "Also sprach Zarathustra — 'Liebe zum Schicksal'",
        answerB = "Die froehliche Wissenschaft — 'Liebe des Schicksals'",
        answerC = "Jenseits von Gut und Boese — 'Annahme des Unvermeidlichen'",
        answerD = "Ecce Homo — 'Umarmung des Chaos'",
        correctAnswer = 1,
        explanation = "Nietzsche pragte den Begriff 'Amor fati' (lateinisch: Liebe des Schicksals) besonders in 'Die froehliche Wissenschaft' (§276, 1882): 'Ich will immer mehr lernen, das Notwendige an den Dingen als das Schoene zu sehn: so werde ich Einer von Denen sein, welche die Dinge schoen machen. Amor fati: das sei von nun an meine Liebe!' Das Konzept fordert, nicht nur das Unvermeidliche zu ertragen, sondern es aktiv zu lieben.",
        difficulty = 5,
        funFact = "Nietzsche bezeichnete Amor fati in einem Brief an Franz Overbeck als 'meine innerste Natur' — das Konzept war fuer ihn keine abstrakte Philosophie, sondern eine persoenliche Ueberlebensstrategie waehrend seiner schweren Krankheitsjahre."
    ),

    // Frage 10 — Technik / Patente
    Question(
        categoryId = 11,
        questionText = "Philo Farnsworth meldete 1927 als 21-Jaehriger das erste Patent fuer ein vollstaendig elektronisches Fernsehsystem an. Gegen wen fuehrte er einen jahrelangen Patentstreit, und wer gewann?",
        answerA = "General Electric — Farnsworth verlor nach 10 Jahren",
        answerB = "RCA (Radio Corporation of America) — Farnsworth gewann den Patentstreit 1939",
        answerC = "AT&T Bell Labs — Einigung aussergerichtlich 1934",
        answerD = "Westinghouse — Lizenzvertrag ohne klaren Sieger",
        correctAnswer = 1,
        explanation = "Philo Farnsworth fuehrte einen langen Patentstreit gegen RCA und dessen Ingenieur Vladimir Zworykin, der ebenfalls Anspruch auf die Erfindung des Fernsehens erhob. 1934 erkannte das US-Patentamt erstmals Farnsworth als Prioritaet an, und 1939 gewann er den Streit endgueltig — RCA musste Lizenzgebuehren zahlen. Es war einer der wenigen Faelle, in denen ein Einzelerfinder einen Konzern bezwingen konnte.",
        difficulty = 5,
        funFact = "Farnsworth soll die Idee fuer das elektronische Fernsehen als 14-Jaehriger waehrend der Feldarbeit auf der Farm seiner Familie in Idaho gehabt haben — bei dem Anblick der geraden Pflugfurchen dachte er an zeilenweises Abtasten eines Bildes."
    ),

    // Frage 11 — Nobelpreis / Medizin
    Question(
        categoryId = 11,
        questionText = "Der Nobelpreis fuer Medizin 1952 wurde an Selman Waksman verliehen. Was entdeckte er, und welcher ehemaliger Doktorand war massgeblich an der eigentlichen Entdeckung beteiligt, erhielt aber keinen Preis?",
        answerA = "Penicillin — Alexander Fleming wurde vergessen",
        answerB = "Streptomycin — Albert Schatz fuehrte die Laborexperimente durch",
        answerC = "Chloramphenicol — David Gottlieb synthetisierte den Wirkstoff",
        answerD = "Tetracyclin — Benjamin Duggar isolierte die Substanz zuerst",
        correctAnswer = 1,
        explanation = "Selman Waksman erhielt den Nobelpreis fuer Physiologie oder Medizin 1952 fuer die Entdeckung von Streptomycin, dem ersten wirksamen Antibiotikum gegen Tuberkulose. Albert Schatz, sein Doktorand, fuehrte jedoch die entscheidenden Laborexperimente durch und isolierte den Wirkstoff 1943 tatsaechlich als Erster. Schatz erhob Anspruch auf Miterfindung und gewann 1950 einen Rechtsstreit gegen Waksman, woraufhin er finanzielle Anerkennung erhielt. Der Nobelpreis wurde jedoch nur an Waksman vergeben.",
        difficulty = 5,
        funFact = "Die Kontroverse um Schatz und Waksman gilt als eines der deutlichsten Beispiele fuer das sogenannte 'Mattheaeus-Effekt' in der Wissenschaft: Bekannte Wissenschaftler erhalten Anerkennung, die eigentlich ihren Mitarbeitern zusteht."
    ),

    // Frage 12 — Geographie / obskure Fakten
    Question(
        categoryId = 11,
        questionText = "Welcher Ort auf der Erde ist am weitesten von allen Ozeankuesten entfernt (Pol der Unzugaenglichkeit) und in welchem Land befindet er sich?",
        answerA = "Ulan Bator, Mongolei — ca. 1.450 km",
        answerB = "EURASISCHER Pol der Unzugaenglichkeit, Xinjiang/China — ca. 2.645 km",
        answerC = "Kasachische Steppe, Kasachstan — ca. 2.100 km",
        answerD = "Sibirisches Hochland, Russland — ca. 3.200 km",
        correctAnswer = 1,
        explanation = "Der eurasische Pol der Unzugaenglichkeit (auch: Kontinentaler Pol) liegt in der Dzungharischen Wueste im Xinjiang-Uygurischen Autonomiegebiet, China, bei ca. 46,3°N 86,7°E. Er ist ca. 2.645 km vom naechstgelegenen Ozean entfernt. Er ist damit der am weitesten von jeder Kuestenlinie entfernte Ort auf der Erde. Die genaue Lage variiert je nach Methode leicht.",
        difficulty = 5
    ),

    // Frage 13 — Chemie / Periodensystem
    Question(
        categoryId = 11,
        questionText = "Element 117, Tennessine (Ts), wurde 2010 erstmals synthetisiert. Wie lange war das kuerzestlebige gemessene Isotop stabil, und welche Kernreaktion wurde zur Herstellung verwendet?",
        answerA = "0,78 Millisekunden — Fusion von Curium-248 mit Calcium-48",
        answerB = "51 Millisekunden — Fusion von Berkelium-249 mit Calcium-48",
        answerC = "14 Sekunden — Fusion von Californium-249 mit Calcium-48",
        answerD = "0,3 Nanosekunden — Fusion von Einsteinium-254 mit Calcium-48",
        correctAnswer = 1,
        explanation = "Tennessine (Ts, Element 117) wurde im Dubna-Beschleunigungslabor (JINR, Russland) in Zusammenarbeit mit Oak Ridge, Vanderbilt und dem Lawrence Livermore National Laboratory durch Beschuss von Berkelium-249 mit Calcium-48-Ionen erzeugt. Das staerkste Isotop Tennessine-294 hat eine Halbwertszeit von etwa 51 Millisekunden. Der Name ehrt den US-Bundesstaat Tennessee, wo wichtige Forschungseinrichtungen beteiligt waren.",
        difficulty = 5,
        funFact = "Die Herstellung von Berkelium-249, das als Targetmaterial benoetigt wird, dauerte selbst 250 Tage im Hochflussreaktor in Oak Ridge — ein riesiger logistischer Aufwand fuer wenige Atome des neuen Elements."
    ),

    // Frage 14 — Musik / obskures Wissen
    Question(
        categoryId = 11,
        questionText = "Johann Sebastian Bach hinterliess eine unvollendete Fuge in der 'Kunst der Fuge' (BWV 1080). An welcher Stelle bricht das Manuskript ab, und welches Thema war gerade eingetreten?",
        answerA = "Contrapunctus XIII — beim Umkehrungsthema im Stretto",
        answerB = "Contrapunctus XIV — beim Eintritt des B-A-C-H-Themas (H-A-C-B) als drittes Thema",
        answerC = "Contrapunctus XII — beim vierfachen Augmentationskanon",
        answerD = "Contrapunctus XI — beim Spiegelfugenmotiv in Engfuehrung",
        correctAnswer = 1,
        explanation = "Die Kunst der Fuge bricht im Contrapunctus XIV (auch als Contrapunctus Nr. 19 gezaehlt) ab. An der Abbruchstelle tritt das dritte Thema ein, das aus den Noten B-A-C-H besteht (im deutschen Notensystem: H, A, C, H — also das musikalische Kryptogramm Bachs). Danach enden die Noten abrupt. Ob Bach aufhoerte, weil er starb, oder ob das Ende bewusst ist, wird bis heute diskutiert.",
        difficulty = 5,
        funFact = "C.P.E. Bach schrieb am Ende des Manuskripts: 'Ueber dieser Fuge, wo der Name B-A-C-H im Contrasubject angebracht worden, ist der Verfasser gestorben.' — ob das stimmt, ist jedoch nicht beweisbar."
    ),

    // Frage 15 — Geschichte / obskure Ereignisse
    Question(
        categoryId = 11,
        questionText = "Das 'Emu-Krieg' von 1932 in Australien endete mit einem Rueckzug des Militaers. Welche militaerische Einheit wurde eingesetzt, was waren die Waffen, und wie viele Emus wurden tatsaechlich bestaetigt getoetet?",
        answerA = "3. Kavallerie-Regiment, Karabiner, ca. 2.500 Emus",
        answerB = "Royal Australian Artillery mit zwei MG08/15 und Lewis-Gewehren, ca. 50 Emus in der ersten Phase",
        answerC = "Sonderkommando mit Vickers-MG und 10.000 Patronen — ca. 986 bestaetigt getoenete Emus",
        answerD = "Royal Australian Infantry, Enfield-Gewehre, ca. 4.000 Emus",
        correctAnswer = 2,
        explanation = "Im November 1932 wurden Major G.P.W. Meredith und zwei Soldaten mit zwei Vickers-Maschinengewehren und 10.000 Patronen nach Campion, Westaustralien, geschickt, um eine Plage von rund 20.000 Emus zu bekaempfen. Trotz des Einsatzes wurden nach drei Tagen nur rund 12 Emus direkt bestaetigt. Nach einem Monat Operation wurden insgesamt ca. 986 getoenete Emus berichtet, jedoch waren die Tiere schwer zu treffen. Ornithologie-Experten spotteten, die Emus haetten den Krieg gewonnen.",
        difficulty = 5,
        funFact = "Ornithologie-Major G.B.W. Field soll gesagt haben: 'Wenn wir eine Militaermedaille fuer Emus haetten, muessten wir sie an die Fuehrungskraefte der Emu-Armee verleihen.'"
    ),

    // Frage 16 — Physik / Quantenmechanik
    Question(
        categoryId = 11,
        questionText = "Das EPR-Paradoxon (Einstein-Podolsky-Rosen, 1935) sollte zeigen, dass die Quantenmechanik unvollstaendig ist. Welches Experiment widerlegte 1982 die klassische Interpretation von EPR endgueltig?",
        answerA = "Aspect-Experiment — Messung verschraenkter Photonen bei Paaren mit variablen Winkeleinstellungen",
        answerB = "Wu-Experiment — Nachweis von Paritaetsverletzung im Betazerfall",
        answerC = "Stern-Gerlach-Experiment — Quantisierung des Drehimpulses im Magnetfeld",
        answerD = "Aharonov-Bohm-Experiment — nichtlokale Wechselwirkung mit Magnetfeld",
        correctAnswer = 0,
        explanation = "Alain Aspects Experiment (1982, Paris) testete erstmals Bellsche Ungleichungen mit verschraenkten Photonenpaaren bei schnell wechselnden Winkeleinstellungen der Analysatoren. Das Ergebnis verletzte die Bellschen Ungleichungen statistisch signifikant und widersprach damit jeder Theorie lokaler verborgener Variablen. Die Quantenmechanik wurde bestaetigt. Aspect, Clauser und Zeilinger erhielten dafuer 2022 den Nobelpreis fuer Physik.",
        difficulty = 5,
        funFact = "Einstein soll Quantenverschraenkung als 'spukhafte Fernwirkung' bezeichnet haben — er war ueberzeugt, dass die Wirklichkeit lokal und deterministisch sein muss. Aspects Experiment zeigte, dass zumindest eine dieser Annahmen falsch ist."
    ),

    // Frage 17 — Biologie / Evolution
    Question(
        categoryId = 11,
        questionText = "Was beschreibt das 'Rote Koenigin'-Prinzip (Red Queen Hypothesis, Leigh Van Valen, 1973) in der Evolutionsbiologie, und worauf bezieht sich der Name?",
        answerA = "Parasiten und Wirte entwickeln sich in einem ewigen Wettruestungsrennen gegenseitig weiter — der Name stammt aus Alice hinter den Spiegeln",
        answerB = "Speziierung beschleunigt sich in Randpopulationen — der Name bezieht sich auf Koenigin Victoria",
        answerC = "Neutrale Mutationen akkumulieren schneller als Selektion wirkt — der Name ist ein Paradoxon aus der Spieltheorie",
        answerD = "Sexuelle Selektion erzeugt stabile Gleichgewichte — der Name kommt aus der Schachtheorie",
        correctAnswer = 0,
        explanation = "Van Valens Rote-Koenigin-Hypothese besagt, dass Organismen kontinuierlich evoluieren muessen, nur um mit ko-evoluierenden Parasiten, Raeuber oder Konkurrenten mitzuhalten — also nicht um Fortschritt zu erzielen, sondern um auf der Stelle zu bleiben. Der Name stammt aus Lewis Carrolls 'Through the Looking-Glass', wo die Rote Koenigin erklaert: 'Es braucht das ganze Laufen, das du tun kannst, um an der gleichen Stelle zu bleiben.'",
        difficulty = 5,
        funFact = "Die Rote-Koenigin-Hypothese erklaert, warum sexuelle Fortpflanzung trotz des zweifachen Fitness-Nachteils (Maennchen produzieren keine Nachkommen direkt) so weit verbreitet ist: Sexuelle Rekombination erzeugt schneller neue Abwehr gegen Parasiten."
    ),

    // Frage 18 — Literatur / obskures Wissen
    Question(
        categoryId = 11,
        questionText = "Jorge Luis Borges' Kurzgeschichte 'Die Bibliothek von Babel' (1941) beschreibt eine Bibliothek, die alle moeglichen Buecher enthaelt. Wie viele Buecher hat diese Bibliothek laut Borges' Berechnungen?",
        answerA = "10^1.312.000 Buecher",
        answerB = "25^1.312.000 Buecher",
        answerC = "2^1.312.000 Buecher",
        answerD = "Unendlich viele Buecher",
        correctAnswer = 1,
        explanation = "Borges' Bibliothek besteht aus Buechern mit jeweils 410 Seiten, 40 Zeilen pro Seite und 80 Buchstaben pro Zeile, also 410 x 40 x 80 = 1.312.000 Zeichen pro Buch. Das Alphabet hat 25 Zeichen (22 Buchstaben, Punkt, Komma, Leerzeichen). Die Anzahl verschiedener Buecher ist daher 25^1.312.000 — eine astronomisch grosse, aber endliche Zahl. Die Bibliothek ist also unvorstellbar gross, aber nicht unendlich.",
        difficulty = 5,
        funFact = "Die Bibliothek von Babel existiert heute als Webseite: libraryofbabel.info zeigt tatsaechlich alle moeglichen Texte aus 29 Zeichen in einem Zufallszugriffsystem — jeder Text, der je geschrieben wurde oder wird, ist dort bereits enthalten."
    ),

    // Frage 19 — Astronomie / obskure Fakten
    Question(
        categoryId = 11,
        questionText = "Der 'Wow!-Signal' vom 15. August 1977 wurde vom Big Ear-Radioteleskop der Ohio State University empfangen. Warum gilt es als moegliches SETI-Signal, und was wurde seitdem zur Erklaerung vorgeschlagen?",
        answerA = "Es entspricht der erwarteten 21-cm-Wasserstoff-Linie, hatte 72 Sekunden Dauer, und eine Studie 2017 schlug Kometen als Quelle vor",
        answerB = "Es zeigte eine Pulsarfrequenz von 1420 MHz und eine periodische Modulation, die auf kuenstlichen Ursprung hindeutet",
        answerC = "Es entsprach dem OH-Radikal-Fenster (1667 MHz) und wurde niemals wiederholt",
        answerD = "Es hatte eine Breite von genau 1 Hz, was natuerliche Quellen ausschliesst, und wurde 1979 nochmals beobachtet",
        correctAnswer = 0,
        explanation = "Das Wow!-Signal wurde bei 1420,405 MHz (21-cm-Wasserstofflinie) empfangen, dauerte 72 Sekunden (genau so lange wie das Teleskop ein Objekt verfolgen kann) und hatte die erwartete Form eines Transits. Es wurde nie wiederholt. 2017 schlug Antonio Paris vor, dass zwei Kometen (266P/Christensen und P/2008 Y2 Gibbs) mit ihren Wasserstoff-Halos die Quelle sein koennten — diese These ist jedoch umstritten.",
        difficulty = 5,
        funFact = "Der Astronom Jerry Ehman schrieb 'Wow!' neben den Computerdaten — daher der Name. Das Original-Printout mit seiner Anmerkung gilt als eines der beruehmt-beruechtigtsten Dokumente der SETI-Geschichte."
    ),

    // Frage 20 — Geschichte / Technik
    Question(
        categoryId = 11,
        questionText = "Der Antikythera-Mechanismus (ca. 100 v.Chr.) gilt als fruehester bekannter Analogrechner. Fuer welche Berechnung war er hauptsaechlich vorgesehen, und welche Forschungsmethode entschluesselte seine Funktion?",
        answerA = "Berechnung von Planetenpositionen — klassische Textilforschung und Sprachvergleich",
        answerB = "Vorhersage von Mondphasen, Sonnenfinsternissen und Olympiaden — Roentgentomographie und PTM-Imaging",
        answerC = "Schiffsnavigation nach Sternpositionen — Neutronentomographie und 3D-Photogrammetrie",
        answerD = "Kalenderberechnung fuer das hellenistische Jahr — Magnetresonanz-Tomographie",
        correctAnswer = 1,
        explanation = "Der Antikythera-Mechanismus berechnet hauptsaechlich: Mondphasen nach dem Metonschen Zyklus (235 Mondmonate = 19 Sonnenjahre), Vorhersage von Sonnen- und Mondfinsternissen (Saros-Zyklus), Planetenpositionen und den Zyklus der Panhellenischen Spiele inklusive der Olympischen Spiele. Die Entschluesselung gelang durch hochaufloesende Roentgentomographie (Team um Freeth, 2006/2021) und Polynomial Texture Mapping (PTM).",
        difficulty = 5,
        funFact = "Der Mechanismus enthielt mehr als 30 Bronzezahnraeder und war so komplex, dass ein vergleichbares Geraet erst wieder im 14. Jahrhundert in Europa auftauchte — eine Luecke von ueber 1.400 Jahren."
    ),

    // Frage 21 — Medizin / obskure Geschichte
    Question(
        categoryId = 11,
        questionText = "Ignaz Semmelweis erkannte 1847, dass Haendewaschen mit Chlorkalk die Muettersterblichkeit dramatisch senkt. In welcher Institution arbeitete er, und warum wurde seine Entdeckung zu Lebzeiten grossteils abgelehnt?",
        answerA = "Charite Berlin — seine Theorie widerspricht Pasteurs Keimtheorie",
        answerB = "Allgemeines Krankenhaus Wien, Geburtsklinik — sein Konzept implizierte, dass Aerzte selbst Krankheitsuebertragungen verursachten",
        answerC = "Guy's Hospital London — fehlende statistische Grundlage seiner Studie",
        answerD = "Hotel-Dieu Paris — politische Feindschaft mit dem Chefchirurgen",
        correctAnswer = 1,
        explanation = "Semmelweis arbeitete an der Ersten Geburtshilflichen Klinik des Wiener Allgemeinen Krankenhauses. Die zentrale Ursache fuer die Ablehnung: Sein Konzept implizierte, dass Aerzte und Medizinstudenten, die direkt von Sektionen zu Geburten kamen, die 'Kadavermiasmen' auf Woechnerinnen uebertrugen. Dies bedeutete, dass Aerzte fuer den Tod ihrer Patientinnen mitverantwortlich waren — eine psychologisch und standesmaessig inakzeptable Schlussfolgerung.",
        difficulty = 5,
        funFact = "Semmelweis starb 1865 unter tragischen Umstaenden in einer psychiatrischen Anstalt — moeglicherweise genau an jener Wundinfektion, die er sein Leben lang bekaempft hatte. Er wurde nur 47 Jahre alt."
    ),

    // Frage 22 — Mathematik / Zahlentheorie
    Question(
        categoryId = 11,
        questionText = "Das Collatz-Problem (3n+1-Problem) ist eines der beruehmt-beruechtigtsten ungloesten Probleme der Mathematik. Was besagt die Vermutung genau, und bis zu welcher Zahl wurde sie (Stand 2024) verifiziert?",
        answerA = "Jede positive gerade Zahl ist Summe zweier Primzahlen — bis 4 × 10^18",
        answerB = "Jede positive ganze Zahl erreicht bei wiederholter Anwendung von n→3n+1 (ungerade) oder n→n/2 (gerade) schliesslich die 1 — verifiziert bis ca. 2^68",
        answerC = "Jede ganze Zahl ist auf genau eine Weise als Produkt von Primzahlen darstellbar — bis 10^25",
        answerD = "Jede positive ganze Zahl hat mindestens einen Primteiler unter ihrem Quadratwurzel — bis 10^20",
        correctAnswer = 1,
        explanation = "Die Collatz-Vermutung besagt: Starte mit einer beliebigen positiven ganzen Zahl n. Ist n ungerade, ersetze sie durch 3n+1; ist n gerade, ersetze sie durch n/2. Wiederhole. Die Vermutung sagt, dass man immer bei 1 landet. Dies wurde bisher fuer alle Zahlen bis ca. 2^68 (ca. 3 × 10^20) rechnerisch ueberprueft. Ein allgemeiner Beweis fehlt.",
        difficulty = 5,
        funFact = "Paul Erdos sagte ueber das Collatz-Problem: 'Mathematik ist fuer dieses Problem noch nicht bereit.' Es ist bekannt als eines der einfachsten zu formulierenden, aber schwierigsten zu loesenden Probleme der Mathematik."
    ),

    // Frage 23 — Physik / Quantencomputing
    Question(
        categoryId = 11,
        questionText = "Was unterscheidet das Konzept des 'topologischen Qubits' von konventionellen supraleitenden Qubits, und welche theoretische Grundlage (Teilchentyp) wird dafuer herangezogen?",
        answerA = "Topologische Qubits nutzen Spin-Qubits in Silizium — Grundlage sind Bosonen",
        answerB = "Topologische Qubits kodieren Information in nicht-Abelschen Anyonen (z.B. Majorana-Fermionen), die inhaerent fehlerresistent sind",
        answerC = "Topologische Qubits verwenden Josephson-Kontakte in 3D-Architektur — Grundlage sind Cooper-Paare",
        answerD = "Topologische Qubits basieren auf Photonen in optischen Resonatoren — Grundlage sind Vakuumfluktuationen",
        correctAnswer = 1,
        explanation = "Topologische Qubits kodieren Quanteninformation in den nicht-lokalen, topologischen Eigenschaften von Quasiteilchen — insbesondere Majorana-Fermionen, die an den Enden topologischer Supraleiter entstehen. Da die Information nicht lokal kodiert ist, sind topologische Qubits inhaerent robust gegen lokale Stoerungen (Fehlertoleranz durch Topologie). Nicht-Abelsche Anyonen haben die Eigenschaft, dass ihr Vertauschen (Zopfen) Quantenzustaende unitaer dreht.",
        difficulty = 5,
        funFact = "Ettore Majorana, nach dem die Majorana-Fermionen benannt sind, verschwand 1938 spurlos auf einer Schiffsreise von Palermo nach Neapel — ob er starb, untertauchte oder sich selbst toetete, ist bis heute ungeklaert."
    ),

    // Frage 24 — Weltrekorde / obskure Fakten
    Question(
        categoryId = 11,
        questionText = "Welcher Mensch hat den Weltrekord fuer die meisten Knochen gebrochen und dabei ueberlebt, und in welchem Kontext wurden diese Verletzungen erlitten?",
        answerA = "Evel Knievel — US-Stuntfahrer, offizielle Guinness-Eintragung mit 433 Knochenbruechen",
        answerB = "Evel Knievel — US-Stuntfahrer, offizielle Guinness-Eintragung mit 35 verschiedenen Knochen gebrochen",
        answerC = "Jackie Chan — Hongkong-Stuntschauspieler, informell ueber 60 Knochen",
        answerD = "Joe Stine — Motorrad-Stuntfahrer, 82 dokumentierte Frakturen",
        correctAnswer = 1,
        explanation = "Robert Craig 'Evel' Knievel hielt offiziell den Guinness-Weltrekord fuer die meisten Knochen, die ein Mensch gebrochen und ueberlebt hat. Das Guinness-Buch dokumentierte, dass er sich 35 verschiedene Knochen gebrochen hatte (manche Quellen nennen bis zu 433 Brueche, aber das bezieht sich auf Fraktur-Ereignisse, nicht auf anatomisch verschiedene Knochen). Seine schwersten Verletzungen erlitt er beim gescheiterten Sprung ueber den Springbrunnen des Caesars Palace (1967).",
        difficulty = 5,
        funFact = "Nach dem Caesars-Palace-Absturz lag Knievel 29 Tage im Koma. Die Filmaufnahme seines Sturzes wurde so oft im amerikanischen Fernsehen gezeigt, dass sie bis dahin der meistgesendete Sportunfall der US-TV-Geschichte war."
    ),

    // Frage 25 — Philosophie / Erkenntnistheorie
    Question(
        categoryId = 11,
        questionText = "Edmund Gettier widerlegte 1963 in einem nur dreiseitigen Aufsatz die klassische Definition von Wissen als 'wahre gerechtfertigte Ueberzeugung'. Was zeigen Gettier-Faelle, und welches Beispiel nennt Gettier im Originalpapier?",
        answerA = "Dass Rechtfertigung nie ausreicht — sein Beispiel: Smith haelt Aussage p (Jones bekommt den Job) fuer gerechtfertigt, aber q (Smith bekommt den Job) tritt ein",
        answerB = "Dass Wahrheit kontextuell ist — sein Beispiel: Ein Mann sieht eine Uhr an einer Wand, die stehengeblieben ist",
        answerC = "Dass Ueberzeugungen immer durch soziale Faktoren geformt sind — sein Beispiel: Zwei Zeugen, die dieselbe Aussage machen",
        answerD = "Dass gerechtfertigte Ueberzeugungen logisch konsistent sein muessen — sein Beispiel: Mathematischer Beweis durch Widerspruch",
        correctAnswer = 0,
        explanation = "Gettier zeigt in 'Is Justified True Belief Knowledge?' (1963), dass man eine wahre, gerechtfertigte Ueberzeugung haben kann, ohne wirklich zu 'wissen'. Sein Fall: Smith glaubt gerechtfertigt, Jones bekomme den Job (p), und schliesst daraus: 'Derjenige, der den Job bekommt, hat 10 Muenzen in der Tasche' (q). Tatsaechlich bekommt Smith selbst den Job — und hat auch zufaellig 10 Muenzen in der Tasche. q ist wahr, gerechtfertigt und wird von Smith geglaubt — aber Smith weiss es nicht wirklich.",
        difficulty = 5,
        funFact = "Gettier schrieb den Aufsatz angeblich nur, um eine Veroeffentlichung fuer seine Tenure-Bewerbung vorweisen zu koennen — ein drei Seiten langes Paper, das 60 Jahre Erkenntnistheorie veraenderte."
    ),

    // Frage 26 — Biologie / Zellbiologie
    Question(
        categoryId = 11,
        questionText = "Die Endosymbionten-Theorie (Lynn Margulis, 1967) erklaert den Ursprung von Mitochondrien und Chloroplasten. Welcher experimentelle Befund gilt als staerkster Beweis, und welcher Aspekt wurde von Margulis urspruenglich kontrovers gesehen?",
        answerA = "Mitochondrien haben eigene zirkulaere DNA und 70S-Ribosomen wie Bakterien — Margulis' Idee der Endosymbiose selbst war kontrovers",
        answerB = "Mitochondrien koennen sich ausserhalb der Zelle teilen — Margulis schlug als Mechanismus horizontalen Gentransfer vor",
        answerC = "Chloroplasten haben 80S-Ribosomen wie Eukaryoten — Margulis' These zur seriellen Endosymbiose wurde sofort akzeptiert",
        answerD = "Mitochondrien koennen zwischen Zellen transplantiert werden — Margulis erweiterte die Theorie auf den Zellkern",
        correctAnswer = 0,
        explanation = "Der staerkste Beweis fuer die Endosymbionten-Theorie: Mitochondrien und Chloroplasten besitzen eigene zirkulaere DNA (aehnlich prokaryotischen Genomen), haben 70S-Ribosomen (wie Bakterien, nicht wie eukaryotische 80S-Ribosomen), teilen sich durch binaere Spaltung und zeigen in phylogenetischen Analysen Verwandtschaft mit spezifischen Bakteriengruppen (Mitochondrien mit Alphaproteobakterien, Chloroplasten mit Cyanobakterien). Margulis' Paper wurde 1967 von 15 Fachzeitschriften abgelehnt.",
        difficulty = 5,
        funFact = "Lynn Margulis wurde von ihrer ersten Ehe mit Carl Sagan geschieden. Sie und Sagan hatten zwei gemeinsame Soehne, darunter Dorion Sagan, mit dem sie zahlreiche wissenschaftliche Buecher schrieb."
    ),

    // Frage 27 — Geschichte / Weltpolitik
    Question(
        categoryId = 11,
        questionText = "Die 'Varrolinien' spielten in der deutschen Diskussion nach der Niederlage im Teutoburger Wald (9 n.Chr.) keine Rolle. Welchen Beinamen erhielt aber der roemische General Publius Quinctilius Varus, und was soll Augustus nach der Niederlage wiederholt gerufen haben?",
        answerA = "Varus erhielt den Beinamen 'Infamis' — Augustus rief: 'Quintili Vare, legiones redde!'",
        answerB = "Varus erhielt posthum keine Titelverleihung — Augustus rief: 'Roma capta est, Vare!'",
        answerC = "Varus wurde 'damnatio memoriae' unterworfen — Augustus verstummte dauerhaft",
        answerD = "Varus erhielt den Beinamen 'Perditor' — Augustus rief: 'Vare, ubi est exercitus meus?'",
        correctAnswer = 0,
        explanation = "Nach der Clades Variana (Niederlage des Varus) verlor Rom drei Legionen (XVII, XVIII, XIX). Laut dem roemischen Historiker Sueton rief Kaiser Augustus wiederholt: 'Quintili Vare, legiones redde!' ('Quintilius Varus, gib mir meine Legionen zurueck!'). Die Legionsnummern XVII, XVIII und XIX wurden nie mehr neu vergeben — ein bis heute einmaliger Vorgang in der roemischen Heeresgeschichte.",
        difficulty = 5,
        funFact = "Die Nummern XVII, XVIII und XIX existierten in der Geschichte der roemischen Legionen danach nie mehr — ein stilles, dauerhaftes Denkmal fuer die verlorene Katastrophe im Teutoburger Wald."
    ),

    // Frage 28 — Chemie / obskure Geschichte
    Question(
        categoryId = 11,
        questionText = "Fritz Haber erhielt 1918 den Nobelpreis fuer Chemie fuer das Haber-Bosch-Verfahren zur Ammoniak-Synthese. Welchen gegensaetzlichen historischen Beinahme traegt er, der seine Ambivalenz beschreibt?",
        answerA = "Vater der Gruenen Revolution und Schrecken der Schlachtfelder",
        answerB = "Vater des Duengemittels und Vater des Giftgaskrieges",
        answerC = "Retter der Menschheit vom Hunger und Schoefer der Massenvernichtungswaffe",
        answerD = "Prometheus der Chemie und Diabolus des Krieges",
        correctAnswer = 1,
        explanation = "Fritz Haber wird oft sowohl als 'Vater des Duengemittels' (das Haber-Bosch-Verfahren ermoegliche synthetischen Stickstoffduenger und ernaehrt heute ca. 50% der Weltbevoelkerung) als auch als 'Vater des Giftgaskrieges' bezeichnet. Er leitete im Ersten Weltkrieg den Einsatz von Chlorgas an der Westfront (Zweite Ypernschlacht, 1915) und arbeitete an weiteren Chemiewaffen. Seine erste Frau Clara, ebenfalls Chemikerin, erschoss sich 1915 als Protest gegen seine Arbeit.",
        difficulty = 5,
        funFact = "Habers zweite Frau Charlotte Nathan schied nach wenigen Jahren erneut aus der Ehe — er starb 1934 auf der Flucht vor den Nationalsozialisten in Basel, obwohl er jahrelang ein ueberzeugter deutscher Nationalist gewesen war."
    ),

    // Frage 29 — Mathematik / Geschichte
    Question(
        categoryId = 11,
        questionText = "Evariste Galois loeste im Alter von 20 Jahren kurz vor seinem Tod durch ein Duell ein zenturienaltes Problem der Algebra. Was bewies er, und was ist das Kernprinzip seiner Theorie?",
        answerA = "Er bewies, dass das Fuenfeck mit Zirkel und Lineal konstruierbar ist — Kernprinzip: Komposition von Symmetrien",
        answerB = "Er bewies, dass allgemeine Polynomgleichungen fuenften Grades nicht durch Radikale loesbar sind — Kernprinzip: Symmetriegruppen von Nullstellen (Galois-Gruppen)",
        answerC = "Er bewies die Nicht-Kommutativitaet grosser Primzahlen — Kernprinzip: Abelsche Gruppen",
        answerD = "Er loeste Fermats letzten Satz fuer den Fall n=5 — Kernprinzip: Modulare Arithmetik",
        correctAnswer = 1,
        explanation = "Galois bewies, dass die allgemeine Polynomgleichung 5. Grades (Quintik) nicht durch eine endliche Folge von Radikalen (Wurzeln) loesbar ist. Das Kernprinzip der Galoistheorie: Jeder Polynomgleichung entspricht eine Gruppe von Symmetrien ihrer Nullstellen (Galois-Gruppe). Die Gleichung ist durch Radikale loesbar genau dann, wenn diese Gruppe aufloesbarer Art ist. Fuer n >= 5 ist die symmetrische Gruppe S_n nicht mehr aufloesbar.",
        difficulty = 5,
        funFact = "Galois schrieb seine bahnbrechenden Ideen in der Nacht vor dem todlichen Duell nieder — mit den Worten 'Je n'ai pas le temps' (Ich habe keine Zeit) am Rand der Seiten, wo er auf Beweise verzichtete."
    ),

    // Frage 30 — Astronomie / Physik
    Question(
        categoryId = 11,
        questionText = "Was ist das 'Schwarze-Loch-Informationsparadoxon' (Hawking-Information-Paradox), und welcher Loesungsansatz wird derzeit am meisten diskutiert?",
        answerA = "Information geht beim Einfall in schwarze Loecher verloren — Loesungsansatz: Parallele Universen",
        answerB = "Quantenmechanik und Allgemeine Relativitaet machen widersprueechliche Voraussagen ueber Hawking-Strahlung — Loesungsansatz: Unitaritaet durch Firewalls oder Island-Formel",
        answerC = "Schwarze Loecher existieren nicht in der Quantentheorie — Loesungsansatz: Fuzzballs aus Stringtheorie",
        answerD = "Die Singularitaet verletzt den zweiten Hauptsatz der Thermodynamik — Loesungsansatz: Entropykorrektur durch Loop-Quantengravitation",
        correctAnswer = 1,
        explanation = "Das Hawking-Informationsparadoxon: Hawking-Strahlung scheint thermisch und zufaellig — sie traegt keine Information ueber den eingestuerzten Zustand. Verdampft das schwarze Loch vollstaendig, ist Information unwiederbringlich verloren, was dem Unitaritaetsprinzip der Quantenmechanik widerspricht. Aktuelle Loesungsansaetze umfassen: Hawkings eigener Vorschlag (Soft Hair), die Firewall-These (AMPS, 2012) und die 'Island-Formel' / Page-Kurve (Penington, Almheiri, 2019), die Unitaritaet durch holographische Randkorrekturen rettet.",
        difficulty = 5
    ),

    // Frage 31 — Technik / obskure Erfindungen
    Question(
        categoryId = 11,
        questionText = "Der Kymmene-Mechanismus (1765) des franzoesischen Ingenieurs Nicolas-Joseph Cugnot gilt als erstes selbstfahrendes Kraftfahrzeug. Bei welcher Geschwindigkeit und welcher ungluecklichen Premiere wurde es bekannt?",
        answerA = "8 km/h — erste Motorpanne auf der Route de Versailles",
        answerB = "3,6 km/h — erster Verkehrsunfall der Geschichte durch Kollision mit einer Mauer in Paris",
        answerC = "12 km/h — Verlust der Steuerung auf der Pont Neuf",
        answerD = "6 km/h — erster Strassenbrand durch Kesselexplosion",
        correctAnswer = 1,
        explanation = "Nicolas-Joseph Cugnots Dampfwagen (Fardier a vapeur, 1769/1771) erreichte ca. 3,6 km/h und gilt als erstes selbstfahrendes Fahrzeug. Laut historischen Berichten verlor der Dampfwagen bei einer Testfahrt die Kontrolle und kollidierte mit einer Mauer des Arsenals in Paris — was zum ersten dokumentierten Verkehrsunfall mit einem motorisierten Fahrzeug wurde. Cugnot wurde daraufhin kurzzeitig inhaftiert.",
        difficulty = 5,
        funFact = "Das Originalfahrzeug (oder seine zweite Version) ist heute noch erhalten und steht im Musee des Arts et Metiers in Paris — es gilt als das aelteste erhaltene motorisierte Fahrzeug der Welt."
    ),

    // Frage 32 — Philosophie / Ethik
    Question(
        categoryId = 11,
        questionText = "Das Trolley-Problem wurde 1967 von Philippa Foot formuliert und 1985 durch Judith Jarvis Thomson erweitert. Was ist der entscheidende moralische Unterschied zwischen der Weichenversion und der Brueckenversion (Fat Man), der die meisten Menschen zu unterschiedlichen Urteilen fuehrt?",
        answerA = "In der Weichenversion stirbt eine Person durch Unterlassen, in der Brueckenversion durch Handeln",
        answerB = "In der Weichenversion wird jemand als Mittel zum Zweck eingesetzt, in der Brueckenversion nicht",
        answerC = "In der Brueckenversion wird ein Mensch koerperlich als Instrument benutzt, in der Weichenversion ist er ein Nebeneffekt der Rettungsaktion (Doctrine of Double Effect)",
        answerD = "Die Weichenversion hat klare Kausalitaet, die Brueckenversion nicht",
        correctAnswer = 2,
        explanation = "Der philosophisch entscheidende Unterschied nach der 'Doktrin der Doppelwirkung' (Doctrine of Double Effect, Thomas von Aquin): In der Weichenversion ist der Tod der einen Person ein Nebeneffekt der Aktion, das eigentliche Ziel ist das Retten der fuenf. In der Brueckenversion wird der dicke Mann explizit als koerperliches Instrument benutzt — sein Tod ist nicht Nebeneffekt, sondern das notwendige Mittel zum Zweck. Dies erklaert, warum die meisten Menschen die Weichenversion akzeptieren, die Brueckenversion aber ablehnen.",
        difficulty = 5,
        funFact = "Neurowissenschaftler fanden per fMRI heraus, dass bei der Brueckenversion das emotionale Verarbeitungszentrum (Amygdala) staerker aktiviert wird als bei der Weichenversion — Moral ist nicht rein rational."
    ),

    // Frage 33 — Biologie / Genetik
    Question(
        categoryId = 11,
        questionText = "Was ist das Hardy-Weinberg-Gleichgewicht, und welche fuenf Bedingungen muessen erfuellt sein, damit eine Population in diesem Zustand verbleibt?",
        answerA = "Konstante Allelfrequenz ueber Generationen — Bedingungen: keine Selektion, grosse Population, kein Gentransfer, keine Mutation, zufaellige Paarung",
        answerB = "Maximale genetische Diversitaet — Bedingungen: maximale Mutation, Migration, Selektion, Rekombination, Hybridisierung",
        answerC = "Gleichgewicht zwischen Anabolismus und Katabolismus — Bedingungen: konstante Temperatur, pH, Substrat, Enzymkonzentration, Zeit",
        answerD = "Gleichgewicht zwischen Drift und Selektion — Bedingungen: kleine Population, hohe Mutationsrate, starke Selektion",
        correctAnswer = 0,
        explanation = "Das Hardy-Weinberg-Gleichgewicht (1908, unabhaengig von Godfrey Harold Hardy und Wilhelm Weinberg formuliert) besagt: In einer idealen Population bleiben Allel- und Genotyphaeufigkeiten von Generation zu Generation konstant. Die fuenf Voraussetzungen: (1) keine Selektion, (2) unendlich grosse Population (kein genetischer Drift), (3) keine Migration (kein Genfluss), (4) keine Mutationen, (5) zufaellige Paarung (Panmixie). In der Realitaet sind diese Bedingungen nie perfekt erfuellt — das HWG dient als Null-Hypothesen-Modell.",
        difficulty = 5
    ),

    // Frage 34 — Kunst / obskure Kunstgeschichte
    Question(
        categoryId = 11,
        questionText = "Jan van Eycks 'Arnolfini-Portrait' (1434) enthielt eine revolutionaere technische Neuheit, die es von allen vorherigen Gemaelden unterscheidet. Was ist diese Neuheit, und welche zweite Botschaft verbirgt der Spiegel im Hintergrund?",
        answerA = "Oelfarbe auf Holz in Laeierungstechnik — der Spiegel reflektiert van Eycks Selbstportrait als Zeuge",
        answerB = "Erste Verwendung von Zentralperspektive in der Portraitmalerei — der Spiegel zeigt die Umarmung beider Personen von hinten",
        answerC = "Vollstaendiger Verzicht auf Tempera durch Oelmalerei mit Lasurtechnik — der Spiegel zeigt zwei Zeugen und moeglicherweise Jan van Eyck selbst mit der Inschrift 'Johannes de Eyck fuit hic 1434'",
        answerD = "Erste detaillierte anatomische Darstellung ohne Idealisierung — der Spiegel zeigt ein Fenster mit Licht von aussen",
        correctAnswer = 2,
        explanation = "Van Eycks Arnolfini-Portrait gilt als Meisterwerk der fruehniederlandischen Malerei und nutzte verfeinerte Oelmalerei-Lasurtechnik (obwohl Van Eyck Oelfarbe nicht erfand, perfektionierte er sie). Im konvexen Spiegel im Hintergrund sind zwei Figuren zu sehen, die den Raum betreten — vermutlich Zeugen. Darueber steht auf Latein: 'Johannes de Eyck fuit hic 1434' ('Jan van Eyck war hier 1434') — moeglicherweise eine notarielle Beglaubigung der Szene.",
        difficulty = 5,
        funFact = "Kunsthistoriker streiten bis heute, ob das Bild eine Ehezeremonie, eine Vertragsbeurkundung oder ein Memoria-Bild fuer die bereits verstorbene Frau darstellt."
    ),

    // Frage 35 — Geschichte / Obskure Fakten Wissenschaft
    Question(
        categoryId = 11,
        questionText = "Welche Substanz wurde von dem Schweizer Chemiker Albert Hofmann am 19. April 1943 zufaellig entdeckt, und welches Datum bezeichnet seitdem den sogenannten 'Bicycle Day'?",
        answerA = "Meskalin — 20. April",
        answerB = "LSD-25 (Lysergsaeurediethylamid) — 19. April",
        answerC = "Psilocybin — 14. Mai",
        answerD = "MDMA — 19. April",
        correctAnswer = 1,
        explanation = "Albert Hofmann synthetisierte LSD-25 erstmals 1938 bei Sandoz (Basel), beachtete es jedoch zunaechst nicht. Am 16. April 1943 bemerkte er zufaellig psychoaktive Wirkungen (vermutlich durch Hautkontakt). Am 19. April 1943 nahm er bewusst 250 Mikrogramm ein und erlebte auf dem Heimweg per Fahrrad ('Bicycle') die erste bewusst geplante LSD-Erfahrung. Der 19. April wird seitdem als 'Bicycle Day' gefeiert.",
        difficulty = 5,
        funFact = "Hofmann nannte LSD spaeter sein 'Sorgenkind' — er lebte bis 102 Jahre alt und vertrat bis ans Lebensende, dass LSD in der Psychiatrie und Psychotherapie nutzbringend eingesetzt werden koennte."
    ),

    // Frage 36 — Linguistik / obskure Sprachen
    Question(
        categoryId = 11,
        questionText = "Was ist das Sapir-Whorf-Prinzip (Linguistische Relativitaet), und welches bekannte Beispiel aus der Hopi-Sprache verwendete Whorf, das spaeter von Linguisten als falsch widerlegt wurde?",
        answerA = "Sprache erzwingt Denken — Whorf behauptete, Hopi habe kein Wort fuer 'Wasser', was falsch ist",
        answerB = "Sprache beeinflusst oder bestimmt das Denken — Whorf behauptete, Hopi habe kein Konzept von Zeit, was Ekkehart Malotki 1983 widerlegte",
        answerC = "Grammatik ist universell — Whorf zeigt, dass Hopi fuenf Zeitformen hat wie Deutsch",
        answerD = "Vokabular bestimmt Wahrnehmung — Whorf behauptete, Eskimos haetten 50 Woerter fuer Schnee",
        correctAnswer = 1,
        explanation = "Das Sapir-Whorf-Prinzip besagt in seiner starken Version (Whorfian Hypothesis), dass Sprache das Denken determiniert — und in der schwachen Version, dass sie es beeinflusst. Whorf behauptete, die Hopi-Sprache habe keine Woerter oder grammatikalischen Formen, die Zeit, Vergangenheit oder Zukunft ausdrucken. Ekkehart Malotki analysierte 1983 in seinem Werk 'Hopi Time' die Hopi-Sprache detailliert und nachwies, dass sie sehr wohl Zeitkonzepte und Zeitmarker hat — Whorfs zentrale These war empirisch falsch.",
        difficulty = 5
    ),

    // Frage 37 — Physik / Thermodynamik
    Question(
        categoryId = 11,
        questionText = "Was ist Maxwells Daemon, und welches Prinzip der Informationstheorie (Landauer, 1961) loest das scheinbare Paradoxon der Verletzung des zweiten Hauptsatzes der Thermodynamik?",
        answerA = "Ein Daemon sortiert Atome nach Groesse — Landauers Prinzip: Atomsortierung kostet Energie",
        answerB = "Ein intelligentes Wesen sortiert schnelle und langsame Teilchen ohne Energieaufwand, was Entropie verringert — Landauers Prinzip: Das Loeschen von Informationen ist mit Energiedissipation verbunden",
        answerC = "Ein Daemon misst Quantenzustaende ohne Kollaps — Landauers Prinzip: Messungen in Quantensystemen erhoehen die Entropie des Universums",
        answerD = "Ein Daemon beschleunigt die Maxwell-Boltzmann-Verteilung — Landauers Prinzip: Temperaturgradienten sind nicht thermodynamisch reversibel",
        correctAnswer = 1,
        explanation = "Maxwells Daemon (James Clerk Maxwell, 1867): Ein intelligentes Wesen oeffnet und schliesst eine Klappe zwischen zwei Gasbehaeltern, sodass schnelle Teilchen auf eine Seite und langsame auf die andere gelangen. Dadurch entstuende ein Temperaturgradient ohne Energieaufwand — ein scheinbarer Widerspruch zum zweiten Hauptsatz. Leo Szilard (1929) und Rolf Landauer (1961) loesten das Paradoxon: Der Daemon muss Informationen ueber Teilchengeschwindigkeiten speichern und loeschen. Landauers Prinzip: Das Loeschen eines Bits Information erzeugt mindestens kT ln 2 Waerme — dieser Energieaufwand stellt sicher, dass der zweite Hauptsatz gilt.",
        difficulty = 5,
        funFact = "Landauers Prinzip wurde 2012 experimentell erstmals direkt bestaetigt — ein einzelnes kolloidales Teilchen fungierte als 1-Bit-Speicher, und seine Entropieaenderung beim Bit-Loeschen wurde praezise gemessen."
    ),

    // Frage 38 — Geschichte / Obskure Militaergeschichte
    Question(
        categoryId = 11,
        questionText = "Der 'Krieg der Ohren' (War of Jenkins' Ear, 1739-1748) zwischen Grossbritannien und Spanien begann mit einem abgetrennten Ohr. Wessen Ohr war es, und was geschah damit?",
        answerA = "Admiral Vernons Ohr — es wurde vor dem Parlament als Kriegsgruesse gezeigt",
        answerB = "Kapitaen Robert Jenkins' Ohr — er prasentierte es 1738 dem britischen Parlament in einem Glasbehaelter",
        answerC = "Gouverneur Portobelos Ohr — es wurde als Trophae dem spanischen Koenig geschickt",
        answerD = "Leutnant Hacketts Ohr — es wurde als Beweis eines spanischen Piratenangriffs prasentiert",
        correctAnswer = 1,
        explanation = "Kapitaen Robert Jenkins behauptete, spanische Grenzwaechter haetten 1731 sein Schiff aufgebracht und ihm das Ohr abgetrennt. 1738 prasentierte er das angeblich eingelegte Ohr dem britischen Parlament, was die oeffentliche Empoerug schuerte und als Casus Belli fuer den Krieg gegen Spanien (1739) diente. Der Krieg ging spaeter in den oesterreichischen Erbfolgekrieg ueber.",
        difficulty = 5,
        funFact = "Es ist historisch nicht sicher, ob Jenkins sein Ohr tatsaechlich durch spanische Hand verlor — er koennte es bei einem anderen Vorfall oder sogar in einem Duell verloren haben. Das Ohr, das er im Glas trug, wurde nie bestaetigt als sein eigenes."
    ),

    // Frage 39 — Physik / Atomphysik
    Question(
        categoryId = 11,
        questionText = "Das Borsche Atommodell (1913) fuehrte quantisierte Elektronenbahnen ein. Welche Gleichung beschreibt die erlaubten Energieniveaus des Wasserstoffatoms im Bohr-Modell, und welche Groesse ist dabei die Bohrschen Radius?",
        answerA = "E_n = -13,6 eV / n² — a₀ = 0,529 Angstroem (Bohr-Radius fuer n=1)",
        answerB = "E_n = -13,6 eV × n² — a₀ = 1,06 Angstroem (mittlerer Elektronenabstand)",
        answerC = "E_n = hf / n — a₀ = de-Broglie-Wellenlaenge des Elektrons",
        answerD = "E_n = mc² / n² — a₀ = Compton-Wellenlaenge des Protons",
        correctAnswer = 0,
        explanation = "Im Bohr-Modell sind die Energieniveaus des Wasserstoffatoms: E_n = -13,6 eV / n² (n = 1, 2, 3...). Der Bohr-Radius a₀ = ħ² / (m_e e²) ≈ 0,529 Angstroem = 52,9 pm beschreibt den Radius der innersten (n=1) Elektronenbahn. Die Ionisierungsenergie des Grundzustands ist |E_1| = 13,6 eV. Obwohl das Bohr-Modell durch die Quantenmechanik ueberholt wurde, sind diese Zahlenwerte noch korrekt.",
        difficulty = 5
    ),

    // Frage 40 — Wirtschaft / obskure Geschichte
    Question(
        categoryId = 11,
        questionText = "Die Suedseeblaese von 1720 (South Sea Bubble) gilt als eine der fruehesten grossen Spekulationsblasen. Welcher renommierte Wissenschaftler verlor bei diesem Zusammenbruch sein Vermoegen, und mit welchem Zitat soll er auf den Verlust reagiert haben?",
        answerA = "Gottfried Wilhelm Leibniz — 'Geldverlust ist Wissensgewinn'",
        answerB = "Isaac Newton — 'Ich kann die Bewegung der Gestirne berechnen, aber nicht die Verruecktheit der Menschen'",
        answerC = "Edmond Halley — 'Die Bahn der Vernunft ist weniger vorhersehbar als die eines Kometen'",
        answerD = "Robert Hooke — 'Der Markt ist ein Perpetuum mobile, das ich nicht begreifen kann'",
        correctAnswer = 1,
        explanation = "Isaac Newton verlor bei der South Sea Bubble ca. 20.000 Pfund Sterling (nach heutigem Wert mehrere Millionen Pfund). Das ihm zugeschriebene Zitat 'I can calculate the motion of heavenly bodies, but not the madness of people' ist historisch nicht zweifelsfrei belegt, wird aber breit zitiert. Newton hatte zuerst rechtzeitig Aktien verkauft und Gewinn gemacht — kaufte dann aber erneut auf dem Hoehepunkt der Blase, als die Kurse noch stiegen.",
        difficulty = 5,
        funFact = "Die South Sea Company hatte das Monopol auf den Handel mit Suedamerika — aber Spanien liess britische Schiffe kaum wirklich handeln. Das gesamte Unternehmen war faktisch ein Pyramidensystem."
    ),

    // Frage 41 — Biologie / Neurologie
    Question(
        categoryId = 11,
        questionText = "Das Phineas-Gage-Experiment (1848) ist ein Schluessel-Fallbeispiel der Neurologie. Was passierte, wie veraenderte sich Gage danach, und welche neurologische Erkenntnis wurde daraus abgeleitet?",
        answerA = "Eine Eisenstange durchbohrte seinen Schaedel und beschaedigte den Okzipitallappen — er erblindete, was die Sehverarbeitung im Okzipitallappen bewies",
        answerB = "Eine Eisenstange durchbohrte seinen linken Frontallappen — seine Persoenlichkeit veraenderte sich fundamental (von zuverlassig zu impulsiv), was auf die Rolle des Frontallappens bei Persoenlichkeit und sozialen Entscheidungen hinwies",
        answerC = "Ein Nagel durchbohrte seinen Schlaefenlappen — er entwickelte Epilepsie und Sprachprobleme, was die Sprachverarbeitung im Temporallappen belegte",
        answerD = "Eine Metallstange beschaedigte den Parietallappen — er verlor das raeumliche Vorstellungsvermoegen",
        correctAnswer = 1,
        explanation = "Phineas Gage, 25, ueberlebte 1848 eine Explosion, bei der eine Eisenstange (109 cm, 6 kg) durch seinen Schaedel von der linken Wange durch den linken praefrontalen Kortex geschossen wurde. Er ueberlebte, veraenderte sich aber drastisch: Von einem zuverlassigen, freundlichen Vorarbeiter wurde er grob, unzuverlaessig und launisch ('Er ist nicht mehr Gage'). Dies war ein fruehes Indiz, dass der Frontallappen fuer Persoenlichkeit, soziales Verhalten und Impulskontrolle zustaendig ist.",
        difficulty = 5,
        funFact = "Gagebskalp und Schaedel sowie die Eisenstange sind heute im Warren Anatomical Museum in Boston ausgestellt. Neuere Computer-Rekonstruktionen zeigen, dass die Stange vor allem den medialen Frontallappen und den orbitofrontalen Kortex beschaedigte."
    ),

    // Frage 42 — Technik / Kryptographie
    Question(
        categoryId = 11,
        questionText = "Der Enigma-Code des Zweiten Weltkriegs wurde in Bletchley Park geknackt. Welche mathematische Schwachstelle der Enigma-Maschine nutzte Alan Turing in seiner 'Bombe' aus, um den Entschluesselungsprozess zu automatisieren?",
        answerA = "Die Enigma konnte niemals denselben Buchstaben ausgeben, den man eingab (Reflexivitaetsfreiheit) — die Bombe suchte nach Konfigurationen, bei denen kein Buchstabe sich selbst verschluesselt",
        answerB = "Die Enigma hatte eine bekannte Initialposition — die Bombe nutzte brute-force aller 159.000 moeglichen Startpositionen",
        answerC = "Die Rotoren wiederholten sich alle 26 Buchstaben — die Bombe erkannte periodische Muster",
        answerD = "Der Reflektor erzeugte immer gerade Permutationen — die Bombe suchte nach ungeraden Permutationen",
        correctAnswer = 0,
        explanation = "Die entscheidende Schwachstelle: Die Enigma konnte aufgrund ihrer Reflektor-Schaltung niemals einen Buchstaben in sich selbst verschluesseln (kein 'A' konnte als 'A' ausgegeben werden). Diese Eigenschaft, kombiniert mit bekannten 'Cribs' (erwarteten Klaartextfragmenten wie Wetterberichte oder Gruessformeln), ermoeglichte Turings Bombe: Sie suchte systematisch nach Einstellungen, bei denen kein Buchstabe des Klaartexts mit dem entsprechenden Geheimtextzeichen uebereinstimmt.",
        difficulty = 5,
        funFact = "Die polnischen Mathematiker Marian Rejewski, Jerzy Rozycki und Henryk Zygalski knackten die Enigma bereits vor dem Krieg (1932) mit rein mathematischen Methoden — ohne Informanten. Ihr Wissen wurde 1939 an Grossbritannien und Frankreich weitergegeben."
    ),

    // Frage 43 — Astronomie / Geschichte
    Question(
        categoryId = 11,
        questionText = "Henrietta Swan Leavitt entdeckte 1912 die Perioden-Leuchtkraft-Beziehung der Cepheiden. Warum war diese Entdeckung revolutionaer fuer die Astronomie, und welche groessere kosmologische Entdeckung ermoeglichte sie?",
        answerA = "Sie erlaubte erstmals genaue Zeitmessung durch Sterne — was Hubbels Expansionsgesetz unterstuetzte",
        answerB = "Sie lieferte eine Standardkerze fuer kosmische Entfernungen — Hubble nutzte sie 1924, um zu beweisen, dass die Andromedagalaxie ausserhalb der Milchstrasse liegt",
        answerC = "Sie bewies, dass Sterne Kernfusion betreiben — was Bethe spaeter formalisierte",
        answerD = "Sie zeigte, dass das Universum expandiert — was Einstein spaeter als 'groessten Fehler' bezeichnete",
        correctAnswer = 1,
        explanation = "Leavitts Entdeckung: Cepheiden-Sterne haben eine praezise Beziehung zwischen ihrer Periodendauer und ihrer absoluten Leuchtkraft (Perioden-Leuchtkraft-Relation). Damit koennte man aus der beobachteten Periode die wahre Helligkeit berechnen und durch Vergleich mit der scheinbaren Helligkeit die Entfernung bestimmen — eine kosmische Standardkerze. Edwin Hubble nutzte dies 1924, um die Entfernung zum Andromedanebel zu messen (~2,5 Mio. Lichtjahre) und bewies, dass er weit ausserhalb der Milchstrasse liegt — was die Vorstellung der Milchstrasse als einzige Galaxis widerlegte.",
        difficulty = 5,
        funFact = "Leavitt arbeitete als 'Human Computer' am Harvard-Observatorium — ihr Lohn betrug 25 Cent pro Stunde. Trotzdem machte sie eine der wichtigsten astronomischen Entdeckungen des 20. Jahrhunderts. Sie starb 1921, bevor der Nobelpreis-Nominierungsprozess sie erreichte."
    ),

    // Frage 44 — Wirtschaft / obskure Fakten
    Question(
        categoryId = 11,
        questionText = "Der 'Tulpenmania' (Tulipomania) von 1637 gilt als eine der ersten spekulativen Blasen. Welcher Tulpentyp erzielte die hoechsten Preise, und was war der biologische Grund fuer seine Seltenheit?",
        answerA = "Schwarze Tulpen — Melaninueberproduktion durch Hitzeexposition",
        answerB = "Gebrochene oder geflammente Tulpen — eine Mosaikvirus-Infektion erzeugte das bunte Muster, was sie zufaellig und selten machte",
        answerC = "Blaue Tulpen — fehlendes Pigment, das erst im 20. Jahrhundert zuchtmaessig erzielt wurde",
        answerD = "Gefuellte Tulpen — genetische Mutation der Staubblatter in Bluetenblatter",
        correctAnswer = 1,
        explanation = "Die teuersten Tulpen waren die sogenannten 'gebrochenen' Tulpen (broken tulips) mit flammenartigen, mehrfarbigen Mustern. Das Muster wurde durch eine Infektion mit dem Tulpen-Mosaik-Virus erzeugt, was die betroffene Zwiebel zufaellig und zunehmend selten machte (da der Virus die Zwiebel schwaechte). Damit war die Einzigartigkeit des Musters biologisch garantiert aber nicht reproduzierbar. Der beruehmt-beruechtigte 'Semper Augustus' kostete auf dem Hoehepunkt so viel wie ein Amsterdamer Stadthaus.",
        difficulty = 5,
        funFact = "Der eigentliche 'Crash' von 1637 war moeglicherweise nicht so dramatisch wie oft beschrieben — neuere Historiker argumentieren, dass der Markt hauptsaechlich auf Terminkontrakte basierte, und der 'Crash' war ein begrenztes Ereignis in wenigen Staedten."
    ),

    // Frage 45 — Biologie / Parasitologie
    Question(
        categoryId = 11,
        questionText = "Toxoplasma gondii ist ein Parasit, der nachweislich das Verhalten von Ratten veraendert. Welchen Mechanismus nutzt er, und welcher kontroverse Befund betrifft moeglicherweise auch Menschen?",
        answerA = "Er blockiert Dopaminrezeptoren, sodass Ratten sich weniger bewegen — beim Menschen foerdert er Depression",
        answerB = "Er infiltriert den Nucleus accumbens und erzeugt eine Fehlverdrahtung, sodass Ratten von Katzenurin angezogen statt abgestossen werden — beim Menschen wird ein Zusammenhang mit Risikobereitschaft, Suizid und bestimmten Persoenlichkeitsmerkmalen diskutiert",
        answerC = "Er schwaecht das Immunsystem der Ratte, sodass sie weniger Angsthormone ausschuettet — beim Menschen keine bekannte Wirkung",
        answerD = "Er infiziert den Riechnerv und veraendert die Geruchswahrnehmung — beim Menschen foerdert er Schizophrenie direkt",
        correctAnswer = 1,
        explanation = "T. gondii manipuliert das Verhalten von Ratten mit faszinierender Praezision: Infizierte Ratten werden von Katzenurin angezogen statt zu fliehen — was die Uebertragung auf die Katze (Endwirt) erleichtert. Der Mechanismus umfasst epigenetische Veraenderungen in Amygdala-Neuronen, die Katzenurin-Reaktionen modulieren. Beim Menschen (ca. 30% der Weltbevoelkerung sind infiziert) werden in Studien Zusammenhaenge mit erhoehter Risikobereitschaft, Suizidrisiko und verlaengerter Reaktionszeit gefunden — ob kausal, ist unklar.",
        difficulty = 5,
        funFact = "Joanne Webster (Oxford) nannte den Mechanismus einen 'gezielten neuronalen Hack' — der Parasit veraendert selektiv die Reaktion auf Katzenurin, ohne andere Angstreaktionen zu beeinflussen, was auf eine hochgradig spezifische neurobiologische Manipulation hindeutet."
    ),

    // Frage 46 — Geschichte / Wissenschaftsgeschichte
    Question(
        categoryId = 11,
        questionText = "Alan Turing legte 1936 in 'On Computable Numbers' den theoretischen Grundstein der Informatik. Was ist eine Turing-Maschine, und was besagt die Turing-Vollstaendigkeit?",
        answerA = "Eine Maschine, die alle arithmetischen Operationen ausfuehren kann — Vollstaendigkeit: alle Berechnungen koennen in Polynom-Zeit abgebildet werden",
        answerB = "Ein abstraktes Rechenmodell mit Band, Lese-/Schreibkopf und Zustandsuebergangstabelle — Turing-Vollstaendigkeit: Ein System kann jede berechenbare Funktion berechnen, die eine universelle Turing-Maschine berechnen kann",
        answerC = "Ein paralleles Rechenmodell mit N Prozessoren — Vollstaendigkeit: alle NP-Probleme sind in polynomieller Zeit loesbar",
        answerD = "Eine Maschine, die natueurliche Sprache verarbeiten kann — Vollstaendigkeit: sie besteht den Turing-Test",
        correctAnswer = 1,
        explanation = "Turings abstrakte Maschine besteht aus: einem unendlich langen Band (Speicher), einem Lese-/Schreibkopf, einem endlichen Zustandsregister und einer Uebergangsfunktion. Sie kann jede 'berechenbare' Funktion ausfuehren. Turing-Vollstaendigkeit (Church-Turing-These): Ein System ist Turing-vollstaendig, wenn es jede Funktion simulieren kann, die eine universelle Turing-Maschine berechnen kann. Gleichzeitig bewies Turing das Halteproblem: Es gibt keine allgemeine Methode, zu entscheiden, ob ein beliebiges Programm haelt oder ewig laeuft.",
        difficulty = 5
    ),

    // Frage 47 — Geologie / Extreme Fakten
    Question(
        categoryId = 11,
        questionText = "Die Siberian Traps (Sibirische Trapps) werden als Hauptursache fuer das groesste Massenaussterben der Erdgeschichte (Perm-Trias-Grenze, ~252 Mio. Jahre) angesehen. Durch welchen Mechanismus verursachten Vulkanausbrueche ein globales Massenaussterben?",
        answerA = "Direkte Lava-Ueberschwemmung aller Landmassen durch superskalare Eruption",
        answerB = "Vulkanische CO2- und SO2-Emissionen verursachten extreme Erwaermung, Versauerung der Ozeane und Sauerstoffverarmung — bis zu 96% aller Meeresarten und 70% aller Landarten starben aus",
        answerC = "Staubwolken blockierten die Sonne fuer 100.000 Jahre und verursachten globale Abkuehlung",
        answerD = "Magma-Wasser-Kontakt erzeugte Megatsunami, die alle Flachmeere leerten",
        correctAnswer = 1,
        explanation = "Die Sibirischen Trapps eruierten ueber ~1-2 Millionen Jahre ca. 2-3 Millionen Kubikkilometer Lava. Die Hauptmechanismen: (1) Massive CO2-Freisetzung (direkt und durch Verbrennen von Kohlelagern) fuerhrte zu extremer Erwaermung (+6-8°C global); (2) SO2-Emissionen erzeugten sauren Regen; (3) Ozeanversauerung und -erwaermung fuehrten zu anoxischen Zonen; (4) Methanklatrhat-Dissoziation durch Meeresbodenwaermung verstaerkte Erwaermung. Ergebnis: ~96% aller Meeresarten, ~70% aller Landwirbeltierarten ausgestorben.",
        difficulty = 5,
        funFact = "Das Perm-Trias-Massenaussterben war so verheerend, dass manche Wissenschaftler es als 'die grosse Sterbung' bezeichnen — das Leben auf der Erde brauchte etwa 10 Millionen Jahre, um sich zu erholen, und die Erde war kurzfristig moeglicherweise fast steril."
    ),

    // Frage 48 — Philosophie / obskure Geschichte
    Question(
        categoryId = 11,
        questionText = "Die 'Leib-Seele-Problem' besteht seit Descartes. Was ist 'epiphänomenaler Dualismus', und was ist das 'Zombie-Argument' (David Chalmers, 1996) gegen den Physikalismus?",
        answerA = "Bewusstsein ist ein Nebenprodukt physischer Prozesse ohne kausale Wirkung — das Zombie-Argument: Ein Wesen koennnte physisch identisch mit einem Menschen sein, ohne Bewusstsein zu haben, was zeigt, dass Bewusstsein nicht physisch ist",
        answerB = "Seele und Koerper wechselwirken durch die Zirbeldruse — das Zombie-Argument: Zombies koennen nicht existieren, da Physis Geist erzeugt",
        answerC = "Bewusstsein ist eine emergente Eigenschaft ohne Reduktionsmoeglichkeit — das Zombie-Argument: Bewusstsein ist eine Illusion",
        answerD = "Alle mentalen Zustaende sind identisch mit Gehirnzustaenden — das Zombie-Argument: Mentale Zstaende koennen nicht ohne Gehirn existieren",
        correctAnswer = 0,
        explanation = "Epiphaenomenaler Dualismus: Mentale Zustaende (Bewusstsein, Qualia) sind echte Entitaeten, aber kausal wirkungslos — sie sind Nebenprodukte physischer Gehirnprozesse ohne selbst etwas zu verursachen. Chalmers' Zombie-Argument: Es ist logisch denkbar, dass ein 'philosophischer Zombie' physisch identisch mit einem Menschen ist, aber kein subjektives Bewusstsein (Qualia) hat. Wenn das moeglich ist, dann ist Bewusstsein nicht durch physische Eigenschaften erschoepft — was den Physikalismus widerlegt.",
        difficulty = 5,
        funFact = "David Chalmers unterscheidet das 'leichte Problem des Bewusstseins' (Erklaerung von Kognitions- und Verhaltensfunktionen) vom 'schwierigen Problem' (Warum gibt es ueberhaupt subjektive Erfahrung?) — das schwierige Problem gilt als moeglicherweise unloesbar."
    ),

    // Frage 49 — Chemie / Materialwissenschaft
    Question(
        categoryId = 11,
        questionText = "Graphen wurde 2004 von Andre Geim und Konstantin Novoselov durch eine ueberraschend simple Methode isoliert. Welche Methode verwendeten sie, und fuer welche besondere Eigenschaft ist Graphen physikalisch bekannt?",
        answerA = "Chemische Gasphasenabscheidung (CVD) — Graphen ist der staerkste bekannte Supraleiter bei Raumtemperatur",
        answerB = "Scotch-Tape-Methode (mechanische Exfoliation von Graphit) — Graphen ist das staerkste bekannte Material (130 GPa) und hat aussergewoehnliche elektronische Mobilitaet (Elektronen verhalten sich wie masselose Dirac-Fermionen)",
        answerC = "Elektrochemische Reduktion von Graphenoxid — Graphen ist das leichteste bekannte Element",
        answerD = "Ionenimplantation in Siliziumkarbid — Graphen ist das waermeleitfaehigste Material ueber 1000 K",
        correctAnswer = 1,
        explanation = "Geim und Novoselov isolierten Graphen 2004 durch die trivial wirkende 'Scotch-Tape'-Methode: Sie klebten Tesafilm auf Graphit und zogen ihn immer wieder auseinander, bis einzelne Atomlagen entstanden. Dafuer erhielten sie 2010 den Nobelpreis fuer Physik. Graphens Eigenschaften: Es ist das staerkste Material, das je gemessen wurde (~130 GPa intrinsische Zugfestigkeit), hat eine extrem hohe Elektronenmobilitaet (Elektronen verhalten sich wie masselose relativistische Teilchen), und ist ein perfekter 2D-Kristall aus Kohlenstoff.",
        difficulty = 5,
        funFact = "Geim ist auch bekannt dafuer, einen Frosch durch Diamagnetismus schweben zu lassen (Ig-Nobelpreis 2000) — er ist der einzige Mensch, der sowohl einen Ig-Nobel- als auch einen echten Nobelpreis gewonnen hat."
    ),

    // Frage 50 — Geschichte / obskure Persoenlichkeiten
    Question(
        categoryId = 11,
        questionText = "Nikola Tesla meldete 1891 das Tesla-Transformator-Patent an und behauptete spaeter, 1899 in Colorado Springs Signale extraterrestrischen Ursprungs empfangen zu haben. Was empfing er tatsaechlich, und welches Projekt der spaeten Jahre blieb voellig unvollendet?",
        answerA = "Er empfing Wetterradar-Echos — unvollendet blieb sein Fernsteuerungsboot",
        answerB = "Er empfing Interferenzsignale von Jupitermonden — unvollendet blieb sein Teleautomatik-System",
        answerC = "Er empfing wahrscheinlich atmosphaerische Radiowellen (Schumann-Resonanzen oder von anderen Sendern) — unvollendet blieb der Wardenclyffe-Turm (drahtlose Weltenergieuebertragung)",
        answerD = "Er empfing Morsezeichen aus der Atmosphaere — unvollendet blieb sein Todesstrahl (Teleforce-Waffe)",
        correctAnswer = 2,
        explanation = "Tesla empfing in Colorado Springs 1899 Signale, die er als extraterrestrisch interpretierte — es handelte sich wahrscheinlich um atmosphaerische Phaenomene (heute als Schumann-Resonanzen bekannt) oder Signale anderer menschlicher Sender. Sein groessteres Vision blieb der Wardenclyffe-Turm (Long Island, 1901-1917): Eine weltweite Station zur drahtlosen Uebertragung von Elektrizitaet und Nachrichten. JP Morgan, der Hauptfinanzier, zog sich zurueck, der Turm wurde nie fertiggestellt und 1917 abgerissen.",
        difficulty = 5,
        funFact = "Tesla starb 1943 allein und verarmt in einem New Yorker Hotelzimmer. Das US-Buero of Alien Property beschlagnahmte sofort alle seine Unterlagen — sie wurden erst nach Jahrzehnten teilweise freigegeben. Tesla hatte kein gueltiges Testament hinterlassen."
    )

)
