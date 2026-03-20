package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsMaster6(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) — Mathematik-Geschichte: Mathematiker & Entdeckungen ──
    // correctAnswer-Verteilung: 0→13, 1→12, 2→13, 3→12

    // Frage 1 — Fields-Medaille / Jüngster Träger  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Jean-Pierre Serre erhielt 1954 die Fields-Medaille und ist bis heute der juengste Traeger dieses Preises. Wie alt war er zum Zeitpunkt der Verleihung?",
        answerA = "23 Jahre",
        answerB = "25 Jahre",
        answerC = "27 Jahre",
        answerD = "29 Jahre",
        correctAnswer = 2,
        explanation = "Jean-Pierre Serre war bei der Verleihung der Fields-Medaille 1954 genau 27 Jahre alt und haelt damit seit ueber 70 Jahren den Rekord als juengster Preisträger. Die Fields-Medaille wird alle vier Jahre auf dem Internationalen Mathematiker-Kongress verliehen und ist auf Mathematiker unter 40 Jahren beschraenkt.",
        difficulty = 5,
        funFact = "Serre ist auch der einzige Mathematiker, der sowohl die Fields-Medaille (1954) als auch den Abel-Preis (2003) und den Wolf-Preis (2000) erhalten hat — eine Art Triple Crown der Mathematik."
    ),

    // Frage 2 — Fields-Medaille / Erste Frau  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Maryam Mirzakhani wurde 2014 als erste Frau mit der Fields-Medaille ausgezeichnet. Fuer welches Fachgebiet erhielt sie den Preis?",
        answerA = "Algebraische Topologie und Homologietheorie",
        answerB = "Wahrscheinlichkeitstheorie und stochastische Prozesse",
        answerC = "Zahlentheorie und elliptische Kurven",
        answerD = "Dynamik und Geometrie von Riemann'schen Flaechen",
        correctAnswer = 3,
        explanation = "Maryam Mirzakhani erhielt die Fields-Medaille 2014 fuer ihre herausragenden Beitraege zur Dynamik und Geometrie von Riemann'schen Flaechen und deren Modulraeumen. Die iranische Mathematikerin war Professorin an der Stanford University. Sie verstarb 2017 im Alter von nur 40 Jahren an Brustkrebs.",
        difficulty = 5,
        funFact = "Als Kind in Teheran wollte Mirzakhani Schriftstellerin werden. Erst nach einem Sieg bei der Internationalen Mathematik-Olympiade (IMO) 1994 widmete sie sich ganz der Mathematik — und gewann 1995 erneut Gold mit voller Punktzahl."
    ),

    // Frage 3 — Fields-Medaille / Ablehnender Preisträger  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Grigori Perelman lehnte 2006 als erster Mathematiker die Fields-Medaille ab. Er bewies damit auch ein beruemtes Jahrtausend-Problem. Welches Preisgeld des Clay Mathematics Institute lehnte er zusaetzlich ab?",
        answerA = "500.000 US-Dollar",
        answerB = "750.000 US-Dollar",
        answerC = "1.000.000 US-Dollar",
        answerD = "2.000.000 US-Dollar",
        correctAnswer = 2,
        explanation = "Grigori Perelman bewies die Poincaré-Vermutung und lehnte sowohl die Fields-Medaille 2006 als auch das Millennium-Preisgeld von einer Million US-Dollar des Clay Mathematics Institute (2010) ab. Er zog sich komplett aus der Mathematik zurueck und lebt zurueckgezogen in Sankt Petersburg.",
        difficulty = 5,
        funFact = "Perelman begründete seine Ablehnung damit, dass sein Beitrag nicht groesser sei als der von Richard Hamilton, dessen Ricci-Fluss-Theorie er benutzte. Ein seltenes Beispiel von Bescheidenheit in der Wissenschaftsgeschichte."
    ),

    // Frage 4 — Millennium-Probleme  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Das Clay Mathematics Institute stellte im Jahr 2000 sieben Millennium-Probleme auf, fuer deren Loesung je eine Million Dollar ausgelobt wird. Welches dieser Probleme erscheint auch auf Hilberts beruehmter Liste von 1900?",
        answerA = "P-NP-Problem",
        answerB = "Navier-Stokes-Gleichungen",
        answerC = "Birch und Swinnerton-Dyer-Vermutung",
        answerD = "Riemannsche Vermutung",
        correctAnswer = 3,
        explanation = "Die Riemannsche Vermutung ist das einzige Problem, das sowohl auf Hilberts Liste von 23 Problemen aus dem Jahr 1900 als auch auf der Millennium-Liste des Clay Institute von 2000 erscheint. Sie betrifft die Nullstellen der Riemann'schen Zeta-Funktion und ist eng mit der Verteilung der Primzahlen verbunden.",
        difficulty = 5,
        funFact = "David Hilbert soll gesagt haben: 'Wenn ich nach tausend Jahren aufwachen wuerde, waere meine erste Frage: Wurde die Riemannsche Vermutung bewiesen?' — Sie ist bis heute (2026) ungekloert."
    ),

    // Frage 5 — Abel-Preis / Dotierung  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Der Abel-Preis wird seit 2003 von der Norwegischen Akademie der Wissenschaften verliehen. Wie hoch ist die dotierte Preissumme (Stand 2026)?",
        answerA = "Etwa 680.000 Euro",
        answerB = "Etwa 250.000 Euro",
        answerC = "Etwa 450.000 Euro",
        answerD = "Etwa 1.200.000 Euro",
        correctAnswer = 0,
        explanation = "Der Abel-Preis ist mit 7,5 Millionen norwegischen Kronen dotiert, was etwa 680.000 Euro entspricht. Er gilt als der de-facto-Nobelpreis der Mathematik und hat — im Gegensatz zur Fields-Medaille — keine Altersbeschraenkung. Der Preis ist nach dem norwegischen Mathematiker Niels Henrik Abel benannt.",
        difficulty = 5
    ),

    // Frage 6 — Abel-Preis 2026  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Welcher deutsche Mathematiker erhielt den Abel-Preis 2026 — als erster Deutscher ueberhaupt — fuer seine Arbeiten zur arithmetischen Geometrie?",
        answerA = "Peter Scholze",
        answerB = "Gerd Faltings",
        answerC = "Gebhard Boeckle",
        answerD = "Don Zagier",
        correctAnswer = 1,
        explanation = "Gerd Faltings erhielt den Abel-Preis 2026 als erster Deutscher. Er ist vor allem fuer den Beweis der Mordell-Vermutung bekannt (1983), fuer den er bereits 1986 die Fields-Medaille erhielt. Seine Arbeiten zur arithmetischen Geometrie haben das Verstaendnis diophantischer Gleichungen revolutioniert.",
        difficulty = 5,
        funFact = "Faltings' Beweis der Mordell-Vermutung loeste auch eine Folgerung aus Fermats letztem Satz: Er zeigte, dass fuer Exponenten n > 3 nur endlich viele ganzzahlige Loesungen existieren koennen."
    ),

    // Frage 7 — Niels Henrik Abel  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Niels Henrik Abel bewies im Jahr 1824 die Unloesbarkeit allgemeiner Polynomgleichungen fuenften Grades durch Radikale. In welchem Alter starb dieser norwegische Mathematiker, ohne die volle Anerkennung seiner Arbeit zu erleben?",
        answerA = "22 Jahre",
        answerB = "30 Jahre",
        answerC = "34 Jahre",
        answerD = "26 Jahre",
        correctAnswer = 3,
        explanation = "Niels Henrik Abel starb 1829 im Alter von nur 26 Jahren an Tuberkulose. Zwei Tage nach seinem Tod traf in Oslo ein Brief ein, der ihm eine Professorenstelle in Berlin anbot. Seine Arbeit ueber die Unloesbarkeit von Polynomgleichungen fuenften Grades (heute: Satz von Abel-Ruffini) hatte er selbst auf eigene Kosten als sechsseitige Broschuere gedruckt.",
        difficulty = 5,
        funFact = "Abel war so arm, dass er fuer seine Reise nach Paris einen Reisepass beantragt hatte, den Einheimische fuer ihn finanzieren mussten. Trotzdem schenkte er der Mathematik in seiner kurzen Lebenszeit Ergebnisse, die Generationen von Mathematikern beschaeftigten."
    ),

    // Frage 8 — Evariste Galois  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Evariste Galois legte in der Nacht vor seinem Tod 1832 die Grundlagen einer ganzen mathematischen Theorie schriftlich nieder. In welchem Alter starb er in einem Duell?",
        answerA = "20 Jahre",
        answerB = "19 Jahre",
        answerC = "21 Jahre",
        answerD = "23 Jahre",
        correctAnswer = 0,
        explanation = "Evariste Galois starb am 31. Mai 1832 im Alter von 20 Jahren an den Folgen eines Duells in Paris. In der Nacht davor schrieb er einem Freund seine mathematischen Erkenntnisse nieder — die Grundlagen der Galois-Theorie, die erklaert, warum Polynomgleichungen ab Grad 5 nicht durch Radikale loesbar sind. Die Theorie traegt seinen Namen bis heute.",
        difficulty = 5,
        funFact = "Galois schrieb am Rand seiner Aufzeichnungen mehrfach 'Je n'ai pas le temps' (Ich habe keine Zeit). Seine Ideen wurden erst Jahrzehnte spaeter von Mathematikern wie Liouville vollstaendig verstanden und veroeffentlicht."
    ),

    // Frage 9 — Leonhard Euler / Produktivitaet  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Leonhard Euler verlor sein rechtes Auge und wurde spaeter auf beiden Augen fast blind. Trotzdem produzierte er einen erheblichen Anteil der mathematischen Literatur des 18. Jahrhunderts. Welcher Prozentsatz wird ihm nach Historiker Clifford Truesdell zugeschrieben?",
        answerA = "10 %",
        answerB = "17 %",
        answerC = "25 %",
        answerD = "33 %",
        correctAnswer = 2,
        explanation = "Laut dem Mathematikhistoriker Clifford Truesdell stammen etwa 25 % der gesamten mathematischen, physikalischen, mechanischen, astronomischen und Navigationswerke des 18. Jahrhunderts von Leonhard Euler. Er verfasste ueber 800 Buecher und Artikel und loeste das Koenigsberger Brueckenproblem, indem er die Graphentheorie erfand.",
        difficulty = 5,
        funFact = "Euler arbeitete auch nach seiner vollstaendigen Erblindung weiter — er diktierte seinen Assistenten und berechnete Mondbewegungen und Logarithmen im Kopf. Seine Produktivitaet steigerte sich nach der Erblindung sogar noch."
    ),

    // Frage 10 — Eulers Identitaet  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Eulers Identitaet e^(iπ) + 1 = 0 gilt als schoenste Formel der Mathematik. Welche fuenf fundamentalen mathematischen Konstanten vereint sie in einer einzigen Gleichung?",
        answerA = "e, i, π, 0, 1",
        answerB = "e, i, π, φ, 1",
        answerC = "e, i, π, √2, 0",
        answerD = "e, π, 0, 1, φ",
        correctAnswer = 0,
        explanation = "Eulers Identitaet e^(iπ) + 1 = 0 vereint fuenf der bedeutendsten Konstanten der Mathematik: e (Eulersche Zahl, Basis des natuerlichen Logarithmus), i (imaginaere Einheit), π (Kreiszahl), 0 (neutrales Element der Addition) und 1 (neutrales Element der Multiplikation). Sie folgt direkt aus Eulers Formel e^(ix) = cos(x) + i·sin(x).",
        difficulty = 5,
        funFact = "In einer Umfrage der Mathematical Intelligencer wurde Eulers Identitaet zur 'schoensten mathematischen Formel' gewaehlt. Der Physiker Richard Feynman nannte sie 'das erstaunlichste Gleichnis der Mathematik'."
    ),

    // Frage 11 — Primzahlsatz  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Carl Friedrich Gauss vermutete als Jugendlicher den Primzahlsatz — lange bevor er bewiesen wurde. In welchem Jahr wurde der Primzahlsatz schliesslich unabhaengig von Hadamard und de la Vallée Poussin bewiesen?",
        answerA = "1859",
        answerB = "1871",
        answerC = "1903",
        answerD = "1896",
        correctAnswer = 3,
        explanation = "Der Primzahlsatz besagt, dass die Anzahl der Primzahlen bis n asymptotisch n/ln(n) entspricht. Gauss vermutete dies bereits um 1792/93, als er 15 oder 16 Jahre alt war. Bewiesen wurde er 1896 unabhaengig von Jacques Hadamard und Charles-Jean de la Vallée Poussin, beide stuetzten sich auf Riemanns Zeta-Funktion.",
        difficulty = 5
    ),

    // Frage 12 — Gauss / Summe 1 bis 100  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Die beruehMte Anekdote ueber den jungen Gauss besagt, dass er als Achtjaehriger blitzschnell die Summe der Zahlen 1 bis 100 berechnete. Was ist das korrekte Ergebnis?",
        answerA = "4950",
        answerB = "5000",
        answerC = "5050",
        answerD = "5100",
        correctAnswer = 2,
        explanation = "Die Summe der Zahlen von 1 bis 100 betraegt 5050. Gauss soll erkannt haben, dass man je 50 Paare bilden kann (1+100, 2+99, ... 50+51), die jeweils 101 ergeben: 50 × 101 = 5050. Diese Methode verallgemeinert sich zur Gauss'schen Summenformel: n(n+1)/2.",
        difficulty = 5,
        funFact = "Die Geschichte wurde von Gauss' Biograph Wolfgang Sartorius von Waltershausen ueberliefert. Der Lehrer soll den Unterricht dazu genutzt haben, die Schueler ruhig zu halten — und war fassungslos, als Gauss nach Sekunden die Antwort hatte."
    ),

    // Frage 13 — Bernhard Riemann / Habilitationsvortrag  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Bernhard Riemann hielt 1854 seinen Habilitationsvortrag ueber die Grundlagen der Geometrie. Welches revolutionaere Konzept fuer die spaetere Allgemeine Relativitaetstheorie Einsteins legte er dabei vor?",
        answerA = "Den Begriff der gekruemmten n-dimensionalen Mannigfaltigkeit (Riemannsche Geometrie)",
        answerB = "Die projektive Geometrie des flachen Raumes",
        answerC = "Die hyperbolische Geometrie als Alternative zu Euklid",
        answerD = "Das Konzept der fraktalen Dimension",
        correctAnswer = 0,
        explanation = "Riemanns Habilitationsvortrag 'Ueber die Hypothesen, welche der Geometrie zu Grunde liegen' (1854) einfuehrte das Konzept der Riemannschen Mannigfaltigkeit — gekruemmte n-dimensionale Raeume. Diese Geometrie wurde 60 Jahre spaeter von Einstein als mathematisches Fundament der Allgemeinen Relativitaetstheorie verwendet. Gauss, der bei dem Vortrag anwesend war, soll tief beeindruckt gewesen sein.",
        difficulty = 5,
        funFact = "Riemann litt an Schuechternheit und musste seinen Habilitationsvortrag mehrfach verschieben. Als er ihn hielt, erkannte Gauss sofort die Bedeutung — und diskutierte noch auf dem Heimweg begeistert darueber. Es war einer der letzten grossen intellektuellen Momente fuer den alten Gauss."
    ),

    // Frage 14 — Srinivasa Ramanujan / Theoreme  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Srinivasa Ramanujan schickte 1913 einen Brief mit mathematischen Entdeckungen an den britischen Mathematiker G. H. Hardy. Wie viele Theoreme und Formeln soll Ramanujan waehrend seines kurzen Lebens insgesamt entwickelt haben?",
        answerA = "Ueber 1.000",
        answerB = "Ueber 2.000",
        answerC = "Ueber 3.000",
        answerD = "Ueber 5.000",
        correctAnswer = 2,
        explanation = "Ramanujan entwickelte waehrend seines kurzen Lebens ueber 3.000 Theoreme, Formeln und Konjekturen — viele davon wurden erst Jahrzehnte spaeter bewiesen. Hardy erkannte sofort sein Ausnahmetalent: 'Ein einziger Blick auf die Formeln genuegt, um zu sehen, dass sie nur ein Mathematiker allerersten Ranges geschrieben haben konnte.' Ramanujan starb 1920 im Alter von nur 32 Jahren.",
        difficulty = 5,
        funFact = "Als Hardy Ramanujan im Krankenhaus besuchte und die Taxinummer 1729 erwaehnte, antwortete der fiebernde Ramanujan sofort: '1729 ist die kleinste Zahl, die auf zwei verschiedene Arten als Summe zweier Kubikzahlen dargestellt werden kann.' (1³+12³ = 9³+10³). Diese Zahl heisst seitdem Hardy-Ramanujan-Zahl oder Taxicab-Zahl."
    ),

    // Frage 15 — Fermats Randnotiz  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Pierre de Fermat hinterliess seinen beruehMten letzten Satz als Randnotiz in einem Buch. Welches Buch war das, in dessen Rand er schrieb, er habe einen wunderbaren Beweis gefunden, der jedoch zu gross fuer den Rand sei?",
        answerA = "Euklids Elemente",
        answerB = "Diophants Arithmetica",
        answerC = "Newtons Principia Mathematica",
        answerD = "Archimedes' Methode",
        correctAnswer = 1,
        explanation = "Fermat schrieb seine beruehMte Notiz in sein Exemplar der 'Arithmetica' des griechischen Mathematikers Diophant von Alexandria. Er schrieb (sinngemaeß): 'Ich habe hierfuer einen wunderbaren Beweis entdeckt, den dieser Rand zu klein ist, ihn zu fassen.' Dieser Beweis fuer x^n + y^n = z^n (n > 2 hat keine ganzzahligen Loesungen) liess 358 Jahre auf sich warten.",
        difficulty = 5,
        funFact = "Fermats Sohn Clement-Samuel fand die Randnotiz nach dem Tod seines Vaters und veroeffentlichte eine Edition der Arithmetica mit Fermats Kommentaren. Waere diese nicht veroeffentlicht worden, kaeme eine der beruehMtesten mathematischen Geschichten nie ans Licht."
    ),

    // Frage 16 — Andrew Wiles / Geheimarbeit  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Andrew Wiles bewies 1995 Fermats letzten Satz. Wie viele Jahre hatte er heimlich und weitgehend allein an dem Beweis gearbeitet, bevor er ihn 1993 erstmals oeffentlich praesentierte?",
        answerA = "4 Jahre",
        answerB = "7 Jahre",
        answerC = "10 Jahre",
        answerD = "13 Jahre",
        correctAnswer = 1,
        explanation = "Andrew Wiles arbeitete von 1986 bis 1993 sieben Jahre lang weitgehend im Geheimen an Fermats letztem Satz. Er praesentierte den Beweis 1993 in Cambridge — jedoch wurde ein Fehler entdeckt. Nach weiteren 14 Monaten intensiver Arbeit (mit Hilfe seines ehemaligen Studenten Richard Taylor) veroeffentlichte er 1995 den vollstaendigen korrekten Beweis. Wiles erhielt 2016 den Abel-Preis.",
        difficulty = 5,
        funFact = "Als Wiles 1993 den Fehler in seinem Beweis entdeckte, beschrieb er es spaeter als 'die schlimmsten Monate meines Lebens'. In einem BBC-Interview erklaerte er unter Traenen: 'Es war so unglaublich schoen, so unglaublich ueberraschend, dass ich 20 Minuten lang einfach nur schauen musste.'"
    ),

    // Frage 17 — Nicht-Euklidische Geometrie  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Die nicht-euklidische Geometrie wurde Anfang des 19. Jahrhunderts von drei Mathematikern unabhaengig entdeckt. Wer sind die drei Begründer?",
        answerA = "Gauss, Bolyai und Lobatschewski",
        answerB = "Gauss, Riemann und Lobatschewski",
        answerC = "Bolyai, Lobatschewski und Riemann",
        answerD = "Gauss, Bolyai und Klein",
        correctAnswer = 0,
        explanation = "Die nicht-euklidische Geometrie (hyperbolische Geometrie) wurde unabhaengig von Carl Friedrich Gauss, Janos Bolyai (Ungarn) und Nikolai Lobatschewski (Russland) entdeckt. Gauss veroeffentlichte seine Erkenntnisse nie aus Angst vor Kontroversen. Bolyais Vater — selbst Mathematiker — schrieb seinem Sohn verzweifelt, er solle das Parallelenaxiom in Ruhe lassen, da es ihn 'sein ganzes Leben kosten' wuerde.",
        difficulty = 5
    ),

    // Frage 18 — Georg Cantor / Aleph  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Georg Cantor zeigte, dass es verschiedene Groessen von Unendlichkeiten gibt. Welches Symbol verwendete er fuer die kleinste unendliche Kardinalzahl (die Maechtigigkeit der natuErlichen Zahlen)?",
        answerA = "Omega (ω)",
        answerB = "Epsilon (ε)",
        answerC = "Aleph-Null (ℵ₀)",
        answerD = "Omega-Null (Ω₀)",
        correctAnswer = 2,
        explanation = "Georg Cantor einfuehrte das Symbol Aleph-Null (ℵ₀) fuer die Maechtigigkeit (Kardinalzahl) der Menge der natuErlichen Zahlen — die kleinste unendliche Kardinalzahl. Er bewies, dass die reellen Zahlen eine groessere Unendlichkeit haben als die natuErlichen Zahlen (Cantors Diagonalargument, 1891).",
        difficulty = 5,
        funFact = "Cantors Arbeit wurde von seinem Zeitgenossen Leopold Kronecker vehement abgelehnt. Kronecker nannte ihn einen 'Korrumpteur der Jugend' und 'Verderber der Mathematik'. Der jahrelange Angriff trug vermutlich zu Cantors wiederkehrenden Depressionen bei."
    ),

    // Frage 19 — Kontinuumshypothese  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Georg Cantors Kontinuumshypothese besagt, dass es keine Kardinalzahl zwischen ℵ₀ und der Maechtigigkeit der reellen Zahlen gibt. Wer zeigte schliesslich 1963, dass diese Hypothese in der Standard-Mengenlehre weder beweisbar noch widerlegbar ist?",
        answerA = "Kurt Goedel",
        answerB = "Paul Cohen",
        answerC = "Ernst Zermelo",
        answerD = "Abraham Fraenkel",
        correctAnswer = 1,
        explanation = "Paul Cohen zeigte 1963 mit seiner Methode des 'Forcing', dass die Kontinuumshypothese in der Zermelo-Fraenkel-Mengenlehre mit Auswahlaxiom (ZFC) unabhaengig ist — sie kann weder bewiesen noch widerlegt werden. Kurt Goedel hatte bereits 1940 gezeigt, dass sie nicht widerlegbar ist. Cohen erhielt 1966 fuer diese Arbeit die Fields-Medaille.",
        difficulty = 5
    ),

    // Frage 20 — Kurt Goedel / Erster Unvollstaendigkeitssatz  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Kurt Goedels Unvollstaendigkeitssaetze (1931) erschuetterten die mathematischen Grundlagen. Was besagt der erste Unvollstaendigkeitssatz vereinfacht?",
        answerA = "Kein formales System kann alle Wahrheiten der Arithmetik beweisen",
        answerB = "Jedes widerspruchsfreie System kann seine eigene Konsistenz beweisen",
        answerC = "Es gibt keine unentscheidbaren mathematischen Aussagen",
        answerD = "Alle wahren Aussagen der Mathematik sind auch beweisbar",
        correctAnswer = 0,
        explanation = "Goedels erster Unvollstaendigkeitssatz besagt: In jedem hinreichend maechtigem und konsistenten formalen System gibt es wahre Aussagen, die in diesem System nicht beweisbar sind. Der zweite Satz besagt, dass ein konsistentes System seine eigene Konsistenz nicht beweisen kann. Beide Saetze wurden 1931 in der Monatshefte fuer Mathematik veroeffentlicht, als Goedel erst 25 Jahre alt war.",
        difficulty = 5,
        funFact = "David Hilbert hatte kurz zuvor das Programm veroeffentlicht, die gesamte Mathematik auf ein vollstaendiges und widerspruchsfreies Fundament zu stellen. Goedels Beweis zeigte, dass dieses Programm prinzipiell unerfuellbar ist — eine der groessten intellektuellen Erschuetterungen des 20. Jahrhunderts."
    ),

    // Frage 21 — Hypatia von Alexandria  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Hypatia von Alexandria gilt als erste namentlich bekannte Mathematikerin und Philosophin der Geschichte. In welchem Jahrhundert lebte sie und in welcher Stadt wirkte sie?",
        answerA = "2. Jahrhundert v. Chr., Athen",
        answerB = "1. Jahrhundert n. Chr., Rom",
        answerC = "4./5. Jahrhundert n. Chr., Alexandria",
        answerD = "3. Jahrhundert n. Chr., Karthago",
        correctAnswer = 2,
        explanation = "Hypatia von Alexandria lebte von ca. 360 bis 415 n. Chr. in Alexandria, Aegypten (damals Teil des Roemischen Reiches). Sie leitete die neuplatonische Schule in Alexandria, kommentierte Ptolemaios' Almagest, Diophants Arithmetica und Apollonius' Kegelschnitte. Sie wurde 415 n. Chr. von einer christlichen Menge ermordet.",
        difficulty = 5,
        funFact = "Hypatia lehnte mehrere Heiratsantraege ab und widmete ihr Leben vollstaendig der Wissenschaft. Als ein Verehrer nicht lockerliess, soll sie ihm eine benutzte Mondbinde gezeigt und gesagt haben: 'Das ist es, was du liebst, kein Schoenes.'"
    ),

    // Frage 22 — Koenigsberger Brueckenproblem  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Das Koenigsberger Brueckenproblem (1736) gilt als Grundstein einer ganzen mathematischen Disziplin. Welche Disziplin begruendete Euler mit seiner Loesung dieses Problems?",
        answerA = "Topologie",
        answerB = "Graphentheorie",
        answerC = "Kombinatorik",
        answerD = "Wahrscheinlichkeitstheorie",
        correctAnswer = 1,
        explanation = "Euler loeste das Koenigsberger Brueckenproblem (kann man alle 7 Bruecken Koenigsbergs genau einmal ueberqueren und zum Startpunkt zurueckkehren?) durch Abstraktion: Er ersetzte Landmassen durch Punkte (Knoten) und Bruecken durch Linien (Kanten). Dabei bewies er, dass ein Euler-Kreis nur moeglich ist, wenn alle Knoten geraden Grad haben. Dies gilt als Geburtsstunde der Graphentheorie.",
        difficulty = 5
    ),

    // Frage 23 — Emmy Noether / Theorem  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Emmy Noether gilt als bedeutendste Mathematikerin der Geschichte. Noethers Theorem (1915) hat fundamentale Bedeutung fuer die Physik. Was besagt es?",
        answerA = "Jede Symmetrie eines physikalischen Systems entspricht einer Erhaltungsgroesse",
        answerB = "Die Energie eines Systems ist stets positiv definit",
        answerC = "Symmetrische Differentialgleichungen haben keine eindeutigen Loesungen",
        answerD = "Jede stetige Transformation erhalt die Topologie des Raumes",
        correctAnswer = 0,
        explanation = "Noethers Theorem besagt: Jede kontinuierliche Symmetrie eines physikalischen Systems entspricht einer Erhaltungsgroesse. Aus Zeitsymmetrie folgt Energieerhaltung, aus Translationssymmetrie folgt Impulserhaltung, aus Rotationssymmetrie folgt Drehimpulserhaltung. Einstein nannte sie 'das bedeutendste kreative mathematische Genie, das bisher in der uns zugaenglichen Hochschulbildung der Frauen hervorgebracht wurde'.",
        difficulty = 5,
        funFact = "Noether durfte in Erlangen als Frau nicht offiziell Vorlesungen halten und musste Lehrveranstaltungen unter dem Namen ihres Kollegen David Hilbert anbieten. Hilbert hatte sich vehement fuer ihre Zulassung eingesetzt: 'Ich sehe nicht, warum das Geschlecht der Kandidatin ein Argument gegen ihre Zulassung sein soll. Wir sind eine Universitaet, keine Badeanstalt.'"
    ),

    // Frage 24 — Archimedes-Palimpsest  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Archimedes benutzte die Methode der Exhaustion zur Flaechen- und Volumenberechnung — ein Vorlaeufer der Integralrechnung. Welche seiner Erkenntnisse ist im Archimedes-Palimpsest ueberliefert, das 1906 wiederentdeckt wurde?",
        answerA = "Das Prinzip des Hebels und der Schwerpunkt ebener Figuren",
        answerB = "Die Formel fuer den Kreisumfang",
        answerC = "Der Satz ueber eingeschriebene und umschriebene Vielecke",
        answerD = "Methoden zur Berechnung von Flaechen und Volumina durch mechanisches Denken",
        correctAnswer = 3,
        explanation = "Das Archimedes-Palimpsest, 1906 vom Philologen Johan Ludwig Heiberg wiederentdeckt, enthaelt Archimedes' 'Methode der mechanischen Theoreme'. Darin beschreibt er, wie er Flaechen und Volumina durch mechanisches 'Auswiegen' (Hebeldenken) findet, bevor er sie mathematisch beweist. Dies zeigt, dass er konzeptionell der Integralrechnung um fast 2000 Jahre vorausgriff.",
        difficulty = 5,
        funFact = "Das Palimpsest war ein mittelalterlicher Gebetstext, unter dem Archimedes' Schriften lagen — Moenche hatten das Pergament abgeschabt und ueberschrieben. Modernes Multispektral-Imaging konnte den Originaltext 2008 vollstaendig rekonstruieren."
    ),

    // Frage 25 — Euklids Elemente  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Euklids 'Elemente' gelten als eines der einflussreichsten Werke der Mathematikgeschichte und wurden in Europa bis ins 19. Jahrhundert als Lehrbuch verwendet. Wie viele Buecher (Kapitel) umfassen die Elemente?",
        answerA = "9 Buecher",
        answerB = "13 Buecher",
        answerC = "15 Buecher",
        answerD = "20 Buecher",
        correctAnswer = 1,
        explanation = "Euklids 'Elemente' bestehen aus 13 Buechern, verfasst um 300 v. Chr. in Alexandria. Sie behandeln Planimetrie, Zahlentheorie, irrationale Groessen und Stereometrie. Besonders bemerkenswert ist der Beweis, dass es unendlich viele Primzahlen gibt (Buch IX, Satz 20) — einer der aeltesten erhaltenen mathematischen Beweise der Geschichte.",
        difficulty = 5
    ),

    // Frage 26 — Newton vs. Leibniz  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Der Prioritaetsstreit zwischen Newton und Leibniz ueber die Erfindung der Infinitesimalrechnung belastete die euroaeische Wissenschaft jahrzehntelang. Welches Gremium entschied 1713 zugunsten Newtons — in einem Komitee, das Newton selbst zusammengestellt hatte?",
        answerA = "Die Academie Royale des Sciences in Paris",
        answerB = "Die Akademie der Wissenschaften in Berlin",
        answerC = "Die Universitaet Cambridge",
        answerD = "Die Royal Society in London",
        correctAnswer = 3,
        explanation = "Die Royal Society in London veroeffentlichte 1713 den Bericht 'Commercium Epistolicum', der Newton als Ersterfinder der Infinitesimalrechnung proklamierte. Ironischerweise hatte Newton selbst das Komitee zusammengestellt und den anonymen Bericht verfasst. Heute gilt als gesichert, dass Newton (ab ca. 1666) und Leibniz (ab ca. 1675) die Infinitesimalrechnung unabhaengig voneinander entwickelt haben.",
        difficulty = 5,
        funFact = "Leibniz' Notation (dx, dy, ∫) setzte sich langfristig durch und ist bis heute Standard — auch wenn Newton sie erfunden haben soll. Britische Mathematiker benutzten stur Newtons Fluxions-Notation und isolierten sich damit fast 100 Jahre lang vom Fortschritt der kontinentalen Mathematik."
    ),

    // Frage 27 — Sophie Germain  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Sophie Germain korrespondierte mit Gauss unter dem maennlichen Pseudonym 'Monsieur LeBlanc', um als Frau ernst genommen zu werden. Womit trug Germain zur Mathematik bei?",
        answerA = "Wichtige Teilresultate zu Fermats letztem Satz fuer eine Klasse von Primzahlen",
        answerB = "Beweis der transzendenten Natur der Zahl π",
        answerC = "Erste vollstaendige Theorie der elliptischen Kurven",
        answerD = "Beweis des Primzahlsatzes fuer arithmetische Progressionen",
        correctAnswer = 0,
        explanation = "Sophie Germains wichtigster mathematischer Beitrag war der 'Germain-Satz' (ca. 1823): Fuer eine 'Germain-Primzahl' p (wobei 2p+1 ebenfalls prim ist) kann Fermats Gleichung x^p + y^p = z^p keine Loesungen haben, bei denen p keines der x, y, z teilt. Dies war das bedeutendste Teilresultat zu Fermats letztem Satz vor Andrew Wiles' vollstaendigem Beweis 1995.",
        difficulty = 5,
        funFact = "Als Napoleon Paris bombardierte und Germain sich Sorgen um ihren Brieffreund Gauss machte, schickte sie einen General, um ihn zu schuetzen. Als Gauss erfuhr, dass 'Monsieur LeBlanc' eine Frau war, schrieb er ihr: 'Diese Gewohnheit, sich zu vermummen, hat mich um den Vorzug gebracht, Sie frueher kennenzulernen.'"
    ),

    // Frage 28 — Hilbert / Problem 2  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "David Hilbert stellte 1900 auf dem Internationalen Mathematiker-Kongress in Paris 23 ungeloeste Probleme vor. Welches dieser Probleme betrifft die Konsistenz der Axiome der Arithmetik und wurde durch Goedels Saetze als unloesbar im urspruenglichen Sinne erwiesen?",
        answerA = "Hilberts erstes Problem (Kontinuumshypothese)",
        answerB = "Hilberts siebtes Problem (Transzendenz von Zahlen)",
        answerC = "Hilberts zweites Problem (Widerspruchsfreiheit der Arithmetik)",
        answerD = "Hilberts zehntes Problem (Diophantische Gleichungen)",
        correctAnswer = 2,
        explanation = "Hilberts zweites Problem forderte einen Beweis, dass die Axiome der Arithmetik widerspruchsfrei sind — ein Beweis innerhalb der Arithmetik selbst. Goedels zweiter Unvollstaendigkeitssatz (1931) zeigte, dass ein konsistentes System hinreichender Staerke seine eigene Konsistenz nicht beweisen kann, was Hilberts Programm zum Scheitern brachte.",
        difficulty = 5
    ),

    // Frage 29 — Hilberts Hotel  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Das Gedankenexperiment 'Hilberts Hotel' veranschaulicht Paradoxien unendlicher Mengen. In diesem Szenario hat ein Hotel unendlich viele Zimmer, alle belegt. Wie viele neue Gaeste kann das Hotel noch aufnehmen?",
        answerA = "Keinen einzigen",
        answerB = "Genau einen",
        answerC = "Endlich viele",
        answerD = "Unendlich viele",
        correctAnswer = 3,
        explanation = "In Hilberts Hotel mit abzaehlbar unendlich vielen Zimmern (alle belegt) koennen trotzdem neue Gaeste aufgenommen werden: Fuer einen Gast schiebt man alle bestehenden Gaeste um ein Zimmer nach (Gast in Zimmer n zieht in Zimmer n+1). Fuer unendlich viele neue Gaeste schiebt man alle in Zimmer 2n und die Neuen in alle ungeraden Zimmer. Dies illustriert Cantors Unendlichkeitsbegriff.",
        difficulty = 5,
        funFact = "Das 'Hilbert Hotel' wurde tatsaechlich nicht von Hilbert selbst formuliert, sondern von Georg Cantor als Gedankenexperiment genutzt und erst in einem Vortrag Hilberts 1924 populaer. Heute ist es eines der beliebtesten Beispiele in der populaereren Mathematik."
    ),

    // Frage 30 — Alan Turing / Halteproblem  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Alan Turing formulierte 1936 in seinem Aufsatz 'On Computable Numbers' das Konzept der Turing-Maschine. Welches zentrale Problem der Mathematik und Informatik bewies er dabei als unloesbar?",
        answerA = "Das Halteproblem (kann man fuer beliebige Programme bestimmen, ob sie terminieren?)",
        answerB = "Das Entscheidungsproblem fuer Primzahlen",
        answerC = "Die Unloesbarkeit des Erfuellbarkeitsproblems (SAT)",
        answerD = "Die Unmoeglichtkeit einer allgemeinen Faktorisierung",
        correctAnswer = 0,
        explanation = "Turing bewies in 'On Computable Numbers, with an Application to the Entscheidungsproblem' (1936), dass das Halteproblem unentscheidbar ist: Es gibt keinen allgemeinen Algorithmus, der fuer beliebige Programme und Eingaben entscheidet, ob das Programm haelt oder ewig laeuft. Dieses Ergebnis ist fundamental fuer die theoretische Informatik und loeste gleichzeitig Hilberts Entscheidungsproblem negativ.",
        difficulty = 5,
        funFact = "Turing entwickelte dieselbe Idee unabhaengig und gleichzeitig mit Alonzo Church, der den Lambda-Kalkuel verwendete. Die Church-Turing-These — jedes effektiv berechenbare Problem kann von einer Turing-Maschine berechnet werden — ist bis heute ein Eckpfeiler der theoretischen Informatik."
    ),

    // Frage 31 — Poincaré-Vermutung / Methode  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Grigori Perelman bewies die Poincaré-Vermutung. Welche Methode nutzte er als Grundlage fuer seinen Beweis?",
        answerA = "Atiyah-Singer Indexsatz",
        answerB = "Ricci-Fluss mit Chirurgie (nach Richard Hamilton)",
        answerC = "Morse-Theorie und Homotopiegruppen",
        answerD = "Algebraische K-Theorie und Spektralsequenzen",
        correctAnswer = 1,
        explanation = "Perelman baute auf Richard Hamiltons Theorie des Ricci-Flusses auf — eine Methode, bei der eine Riemannsche Metrik gemaess ihrer Kruemmung 'geglättet' wird. Hamilton hatte das Programm begonnen, aber an 'Singularitaeten' (scharfe Kruemmungsspitzen) scheiterte. Perelmans Durchbruch war der Begriff der 'Ricci-Fluss mit Chirurgie', der diese Singularitaeten kontrolliert entfernt.",
        difficulty = 5
    ),

    // Frage 32 — Nicolas Bourbaki  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Nicolas Bourbaki ist ein beruehMter Mathematiker, der ab den 1930er Jahren eine umfassende Grundlegung der Mathematik veroeffentlichte. Was ist das Besondere an diesem 'Mathematiker'?",
        answerA = "Er war ein russischer Immigrant, der anonym publizierte",
        answerB = "Er war ein fiktiver Charakter aus einem Romanzyklus",
        answerC = "Es handelt sich um ein kollektives Pseudonym einer Gruppe franzoesischer Mathematiker",
        answerD = "Er war ein Computerprogramm, das automatisch Beweise generierte",
        correctAnswer = 2,
        explanation = "Nicolas Bourbaki ist das kollektive Pseudonym einer Gruppe hauptsaechlich franzoesischer Mathematiker, die sich 1934 in Paris gruendeten. Gruendungsmitglieder waren u.a. Henri Cartan, Claude Chevalley, Jean Dieudonne und Andre Weil. Ziel war es, die gesamte Mathematik auf strenger, axiomatischer Basis neu zu schreiben. Die Gruppe besteht bis heute, und ihre Mitglieder treten mit 50 Jahren aus.",
        difficulty = 5,
        funFact = "Der Name 'Nicolas Bourbaki' stammt angeblich von einem franzoesischen General aus dem 19. Jahrhundert. Bourbaki-Mitglieder halten ihre Zugehoerigkeit geheim und inszenieren gelegentlich absurde Veranstaltungen — zum Beispiel kuendigten sie einmal an, Bourbaki habe eine Tochter geheiratet und werde Grossvater."
    ),

    // Frage 33 — John von Neumann / Architektur  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "John von Neumann leistete Beitraege in Mathematik, Physik, Oekonomie und Informatik. Fuer welchen grundlegenden Begriff der modernen Computer-Architektur ist er bekannt?",
        answerA = "Die Von-Neumann-Architektur (gemeinsamer Speicher fuer Programme und Daten)",
        answerB = "Das Konzept objektorientierter Programmierung",
        answerC = "Den ersten Compiler fuer maschinenunabhaengige Sprachen",
        answerD = "Die Entwicklung des Dezimalsystems fuer Computer",
        correctAnswer = 0,
        explanation = "Die Von-Neumann-Architektur (1945) beschreibt einen Computer mit einer Zentraleinheit (CPU), einem gemeinsamen Speicher fuer Programme und Daten sowie Ein-/Ausgabeeinheiten. Dieses Prinzip — dass ein Programm im gleichen Speicher liegt wie Daten und selbst modifiziert werden kann — ist die Grundlage fast aller modernen Computer.",
        difficulty = 5,
        funFact = "Von Neumann konnte als Kind ganze Telefonbuchseiten auswendig lernen. Er war bekannt fuer seine Faehigkeit, komplexe Berechnungen im Kopf schneller durchzufuehren als fruehe Computerprototypen. Kollegen berichteten, er gebe manchmal absichtlich falsche Antworten, um nicht arrogant zu wirken."
    ),

    // Frage 34 — Mandelbrot  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Benoit Mandelbrot begründete in den 1970er Jahren die Fraktalgeometrie. Welche beruehmte Frage stellte er 1967 in einem wissenschaftlichen Aufsatz, der als Startpunkt der Fraktalforschung gilt?",
        answerA = "Wie komplex ist die Mandelbrot-Menge?",
        answerB = "Gibt es eine endliche Teilmenge des Kontinuums?",
        answerC = "Was ist die Dimension des Cantor-Staubes?",
        answerD = "Wie lang ist die Kueste Grossbritanniens?",
        correctAnswer = 3,
        explanation = "Mandelbrots Aufsatz 'How Long Is the Coast of Britain? Statistical Self-Similarity and Fractional Dimension' (1967) zeigte, dass die gemessene Laenge einer Kuestenlinie vom Massstab abhaengt: Je feiner die Messung, desto laenger die Kuestenlinie. Dies fuehrte zum Konzept der fraktalen Dimension — Objekte koennen nicht-ganzzahlige Dimensionen haben.",
        difficulty = 5,
        funFact = "Mandelbrot erlebte als Kind den Zweiten Weltkrieg in Frankreich und floh mit seiner Familie vor den Nazis. Diese Erfahrung praege seine Sichtweise auf irregulaere, raue Formen — er sah ueberall Strukturen, die die klassische glatte Geometrie nicht beschreiben konnte."
    ),

    // Frage 35 — Pythagoreische Tripel  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Der Satz des Pythagoras war bereits Jahrhunderte vor Pythagoras bekannt. Welche altorientalische Kultur verwendete pythagoreische Tripel schon um 1800 v. Chr. praktisch fuer Vermessungszwecke?",
        answerA = "Altaegyptische Pyramidenbauer",
        answerB = "Babylonier (Keilschrift-Tafeln wie Plimpton 322)",
        answerC = "Indische Mathematiker des Sulbasutras",
        answerD = "Phoeenizische Handelsleute",
        correctAnswer = 1,
        explanation = "Die babylonische Keilschrift-Tafel Plimpton 322 (ca. 1800 v. Chr.) enthaelt eine systematische Liste pythagoreischer Tripel, die zeigen, dass die Babylonier das Prinzip a² + b² = c² bereits 1200 Jahre vor Pythagoras kannten. Ob sie es bewiesen oder nur empirisch anwendeten, ist umstritten. Pythagoras (ca. 570-495 v. Chr.) wird traditionell der erste strenge Beweis zugeschrieben.",
        difficulty = 5
    ),

    // Frage 36 — Riemannsche Vermutung / Jahr  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Die Riemannsche Vermutung besagt, dass alle nicht-trivialen Nullstellen der Riemann'schen Zeta-Funktion einen Realteil von 1/2 haben. Wann formulierte Bernhard Riemann diese Vermutung?",
        answerA = "1842",
        answerB = "1871",
        answerC = "1859",
        answerD = "1883",
        correctAnswer = 2,
        explanation = "Riemann formulierte seine beruehMte Vermutung 1859 in einem einzigen 8-seitigen Aufsatz mit dem Titel 'Ueber die Anzahl der Primzahlen unter einer gegebenen Groesse', veroeffentlicht in den Monatsberichten der Berliner Akademie. Es ist das einzige Werk, in dem Riemann explizit zur Zahlentheorie publizierte, und gilt als der wichtigste noch ungekloerte Satz der Mathematik.",
        difficulty = 5,
        funFact = "Bisher wurden mehr als zehn Billionen (10^13) Nullstellen der Zeta-Funktion berechnet — alle mit Realteil 1/2. Dennoch gilt dies nicht als Beweis. Das Clay Institute bietet eine Million Dollar fuer den Beweis oder die Widerlegung."
    ),

    // Frage 37 — Fermat'sche Primzahlen / Euler  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Fermat vermutete, dass alle Zahlen der Form F_n = 2^(2^n) + 1 Primzahlen sind. Wer widerlegte diese Vermutung 1732 mit der Faktorisierung von F_5?",
        answerA = "Leonhard Euler",
        answerB = "Carl Friedrich Gauss",
        answerC = "Nicolas Bernoulli",
        answerD = "Abraham de Moivre",
        correctAnswer = 0,
        explanation = "Leonhard Euler zeigte 1732, dass F_5 = 2^32 + 1 = 4.294.967.297 = 641 × 6.700.417 zusammengesetzt ist und keine Primzahl ist. Damit widerlegte er Fermats Vermutung. Bis heute sind keine weiteren Fermat-Primzahlen ausser F_0 bis F_4 bekannt — und fast alle geprueften Fermat-Zahlen ab F_5 sind zusammengesetzt.",
        difficulty = 5
    ),

    // Frage 38 — Erdős-Zahl  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Paul Erdős war fuer seinen nomadischen Lebensstil bekannt — er reiste mit zwei Koffern von Mathematiker zu Mathematiker und veroeffentlichte ueber 1.500 Artikel. Was ist die 'Erdős-Zahl' und welche Erdős-Zahl hatte Erdős selbst?",
        answerA = "Die Anzahl der gemeinsamen Veroffentlichungen mit Erdős; er hatte Nummer 1",
        answerB = "Die Anzahl der Kooperationsschritte zu Erdős; er hatte Nummer 0",
        answerC = "Der Abstand im Kooperationsgraphen; er hatte Nummer 1",
        answerD = "Die Anzahl seiner Zitierungen; er hatte Nummer 0",
        correctAnswer = 1,
        explanation = "Die Erdős-Zahl misst den Abstand im Kooperationsnetzwerk zu Paul Erdős: Wer direkt mit Erdős publiziert hat, hat Erdős-Zahl 1. Wer mit jemandem der Erdős-Zahl 1 publiziert hat, hat Erdős-Zahl 2 usw. Erdős selbst hat per Definition die Erdős-Zahl 0. Die meisten Mathematiker haben eine Erdős-Zahl von 5 oder weniger.",
        difficulty = 5,
        funFact = "Erdős hatte keine feste Adresse, kein Bankkonto und fast keinen Besitz. Wenn er ein Problem loeste oder jemand anderem half, zahlte er Preisgelder aus seiner eigenen Tasche — manchmal 10 bis 10.000 Dollar, je nach Schwierigkeit des Problems."
    ),

    // Frage 39 — Collatz-Vermutung  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Die Collatz-Vermutung (auch '3n+1-Problem') ist ein beruehMtes ungeloestes Problem. Wer stellte sie urspruenglich auf und in welchem Jahr?",
        answerA = "Paul Collatz, 1921",
        answerB = "Georg Collatz, 1953",
        answerC = "Hans Collatz, 1944",
        answerD = "Lothar Collatz, 1937",
        correctAnswer = 3,
        explanation = "Die Collatz-Vermutung wurde 1937 vom deutschen Mathematiker Lothar Collatz aufgestellt. Sie besagt: Beginnt man mit einer beliebigen natuErlichen Zahl n, wendet man wiederholt folgende Regel an: Ist n gerade, teile durch 2; ist n ungerade, multipliziere mit 3 und addiere 1. Die Vermutung besagt, dass man immer bei 1 landet. Trotz einfacher Formulierung ist sie bis heute unbewiesen.",
        difficulty = 5,
        funFact = "Paul Erdős sagte ueber die Collatz-Vermutung: 'Die Mathematik ist noch nicht reif fuer solche Probleme.' Trotzdem hat sie Generationen von Hobbyrmathematikern fasziniert. Computerberechnungen haben die Vermutung bis zu 2^68 (ca. 295 Trillionen) bestaetigt, aber kein allgemeiner Beweis existiert."
    ),

    // Frage 40 — Pascalina  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Blaise Pascal entwickelte im Alter von 18 oder 19 Jahren eine mechanische Rechenmaschine. Wie heisst diese Maschine, von der zwischen 1642 und 1645 etwa 50 Exemplare gebaut wurden?",
        answerA = "Pascalina",
        answerB = "Arithmetik-Maschine",
        answerC = "Pascaloid",
        answerD = "Arithmometer",
        correctAnswer = 0,
        explanation = "Pascals mechanische Rechenmaschine heisst 'Pascaline' oder 'Pascalina'. Sie konnte Addition und (durch wiederholtes Addieren) auch Subtraktion durchfuehren. Pascal baute die Maschine, um seinem Vater die Steuerverwaltung zu erleichtern. Von den ca. 50 gebauten Exemplaren existieren noch neun, unter anderem im Conservatoire des Arts et Metiers in Paris.",
        difficulty = 5
    ),

    // Frage 41 — Leibniz / I Ging  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Leibniz entwickelte das Dualsystem (Binaersystem) und erkannte seine philosophische Bedeutung. Welcher chinesische Text soll ihn in seiner Begeisterung fuer das Binaersystem bestaerkt haben?",
        answerA = "Das Tao Te Ching",
        answerB = "Die konfuzianischen Analekten",
        answerC = "Das I Ging (Buch der Wandlungen) mit seinen 64 Hexagrammen",
        answerD = "Das Buch der Lieder (Shijing)",
        correctAnswer = 2,
        explanation = "Leibniz entdeckte, dass die 64 Hexagramme des I Ging (Yijing) perfekt dem Binaersystem der Zahlen 0 bis 63 entsprechen. Dies bestaerkte seine Ueberzeugung, das Binaersystem repraesentiere eine universelle Sprache der Vernunft. Er korrespondierte deswegen mit dem Jesuitenmissionar Joachim Bouvet in China. Das Binaersystem ist heute die Grundlage aller digitalen Computer.",
        difficulty = 5,
        funFact = "Leibniz versuchte Zeit seines Lebens, einen Weltfrieden durch eine universelle Charakteristik zu ermoeglichten — eine mathematische Sprache, die alle Konflikte durch Berechnung loesbarmachen sollte. Er schrieb: 'Streiten wir uns, Herr? Lasst uns rechnen!'"
    ),

    // Frage 42 — Tensorrechnung  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Die Tensorrechnung, die Einstein fuer die Allgemeine Relativitaetstheorie benuetzte, wurde massgeblich von zwei italienischen Mathematikern entwickelt. Wer sind die Begründer des absoluten Differentialkalküls (Tensoranalysis)?",
        answerA = "Ricci-Curbastro und Levi-Civita",
        answerB = "Betti und Volterra",
        answerC = "Peano und Dini",
        answerD = "Beltrami und Cremona",
        correctAnswer = 0,
        explanation = "Gregorio Ricci-Curbastro entwickelte den 'absoluten Differentialkalkuel' in den 1880er und 1890er Jahren. Sein Schueler Tullio Levi-Civita trug wesentlich zur Weiterentwicklung bei und publizierte gemeinsam mit Ricci-Curbastro 1900 die grundlegende Arbeit. Einstein erkannte 1912, dass dieses Werkzeug fuer seine Gravitationstheorie unerlasslich war, und bat Levi-Civita brieflich um Hilfe.",
        difficulty = 5
    ),

    // Frage 43 — Maryna Viazovska  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Maryna Viazovska erhielt 2022 die Fields-Medaille als zweite Frau nach Mirzakhani. Fuer welches Problem erhielt sie den Preis?",
        answerA = "Beweis der Birch-Swinnerton-Dyer-Vermutung in speziellen Faellen",
        answerB = "Vollstaendige Klassifikation der endlichen einfachen Gruppen",
        answerC = "Optimalste Kugelpackung in 8 und 24 Dimensionen",
        answerD = "Neuer Beweis der Riemannschen Vermutung fuer Funktionenkoerper",
        correctAnswer = 2,
        explanation = "Maryna Viazovska loeste 2016 das Kugelpackungsproblem fuer 8 Dimensionen (E8-Gitter) und kurz darauf fuer 24 Dimensionen (Leech-Gitter). Sie zeigte, dass diese Gitter die dichtestmoegliche Kugelpackung in ihren jeweiligen Dimensionen darstellen. Das Problem war fuer 8 Dimensionen seit ueber 150 Jahren offen. Ihren Beweis veroeffentlichte sie in nur wenigen Wochen.",
        difficulty = 5,
        funFact = "Viazovska ist in der Ukraine aufgewachsen und studierte in Kiew, bevor sie nach Europa kam. Der Beweis des Kugelpackungsproblems in 8 Dimensionen umfasst nur etwa 20 Seiten — bemerkenswert knapp fuer ein so lange offenes Problem."
    ),

    // Frage 44 — Terence Tao / Green-Tao  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Terence Tao erhielt 2006 die Fields-Medaille. Er bewies gemeinsam mit Ben Green den 'Green-Tao-Satz'. Was besagt dieser Satz ueber Primzahlen?",
        answerA = "Es gibt unendlich viele Primzahlenpaare mit Abstand 2 (Zwillingsprimzahlen)",
        answerB = "Jede gerade Zahl ist Summe zweier Primzahlen",
        answerC = "Die Dichte der Primzahlen faellt asymptotisch nach dem Primzahlsatz",
        answerD = "Die Primzahlen enthalten arithmetische Progressionen beliebiger endlicher Laenge",
        correctAnswer = 3,
        explanation = "Der Green-Tao-Satz (2004) besagt, dass die Menge der Primzahlen arithmetische Progressionen beliebiger endlicher Laenge enthaelt — zum Beispiel fuenf Primzahlen in gleichem Abstand, oder hundert, oder tausend. Diese Progressionen existieren fuer jede endliche Laenge. Der Beweis kombiniert Methoden der Analytischen Zahlentheorie, Kombinatorik und Ergodic Theory.",
        difficulty = 5,
        funFact = "Terence Tao begann Infinitesimalrechnung im Alter von 7 Jahren zu lernen und nahm mit 10 Jahren an der Internationalen Mathematik-Olympiade teil, wo er die Bronzemedaille gewann. Mit 13 erhielt er Gold — noch heute der juengste Goldmedaillengewinner der IMO."
    ),

    // Frage 45 — Fibonacci-Folge  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Leonardo Fibonacci verbreitete das indisch-arabische Zahlensystem in Europa durch sein Werk 'Liber Abaci' (1202). Welche Zahlenfolge taucht im Liber Abaci als Illustration eines Kaninchenproblems auf?",
        answerA = "Fibonacci-Folge: jede Zahl ist das Produkt der beiden vorherigen",
        answerB = "Fibonacci-Folge: jede Zahl ist die Summe der beiden vorherigen (1, 1, 2, 3, 5, 8, ...)",
        answerC = "Lucas-Folge: jede Zahl ist das Doppelte der vorherigen",
        answerD = "Primzahlfolge in Fibonacci-Abstaenden",
        correctAnswer = 1,
        explanation = "Die Fibonacci-Folge 1, 1, 2, 3, 5, 8, 13, 21, ... (jede Zahl ist die Summe ihrer beiden Vorgaenger) erscheint im Liber Abaci als Loesung fuer ein idealisiertes Kaninchen-Zuchtproblem. Fibonacci selbst nannte die Folge nicht nach sich; den Namen 'Fibonacci' verlieh ihm der Historiker Guillaume Libri erst 1838.",
        difficulty = 5,
        funFact = "Der Goldene Schnitt φ = (1+√5)/2 ≈ 1,618 ist der Grenzwert des Verhaeltnisses aufeinanderfolgender Fibonacci-Zahlen. Diese Verbindung zwischen Fibonacci-Zahlen, dem Goldenen Schnitt und Naturphaenomenen (Phyllotaxis, Spiralen) fasziniert Mathematiker und Biologen gleichermassen."
    ),

    // Frage 46 — Katherine Johnson  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Katherine Johnson berechnete bei der NASA Flugbahnen fuer die ersten US-Raumfluege, einschliesslich Apollo 11. Welchen mathematischen Bereich setzte sie dafuer hauptsaechlich ein?",
        answerA = "Himmelsmechanik, Orbitalmechanik und analytische Geometrie",
        answerB = "Stochastik und statistische Fehlerkorrekturen",
        answerC = "Differentialgeometrie und Tensoranalysis",
        answerD = "Numerische Methoden und Finite-Elemente-Simulation",
        correctAnswer = 0,
        explanation = "Katherine Johnson nutzte Himmelsmechanik, Orbitalmechanik und analytische Geometrie fuer ihre praezisen Bahnberechnungen. Als der erste Computer die Trajektorie fuer John Glenns Erdumkreisung berechnete, bestand Glenn darauf, dass Katherine Johnson die Berechnungen manuell ueberpruefte — er vertraute dem Computer nur mit ihrer Bestaetigung.",
        difficulty = 5,
        funFact = "Johnson wurde in der segregierten NASA der 1950er Jahre als schwarze Frau in der 'Computing Pool' eingestellt — einer Gruppe, die 'human computers' genannt wurde. Trotz Rassentrennung und Diskriminierung arbeitete sie an allen wichtigen fruehen NASA-Missionen. 2015 erhielt sie die Praesidentenmedaille der Freiheit."
    ),

    // Frage 47 — Grothendieck  [correctAnswer = 2]
    Question(
        categoryId = 11,
        questionText = "Alexander Grothendieck revolutionierte die algebraische Geometrie und erhielt 1966 die Fields-Medaille. Aus welchem aussergewoehnlichen Grund lehnte er 1988 den Crafoord-Preis (Preisgeld: 100.000 Dollar) ab?",
        answerA = "Er hielt die Mathematik in diesem Bereich fuer wissenschaftlich bedeutungslos",
        answerB = "Er hatte bereits eine Stelle mit hohem Gehalt und benoetjgte kein Geld",
        answerC = "Er war ueberzeugt, dass die wissenschaftliche Gemeinschaft korrumpiert sei und keine Preise verdiene",
        answerD = "Er war in Konflikt mit dem schwedischen Komitee",
        correctAnswer = 2,
        explanation = "Grothendieck lehnte den Crafoord-Preis 1988 mit einem langen Brief ab, in dem er erklaerte, die etablierte wissenschaftliche Gemeinschaft sei von Prestige, Konkurrenz und Korrumpierung durchzogen. Er zog sich komplett aus der Mathematik zurueck, lebte jahrzehntelang als Einsiedler in den Pyrenaeen und schrieb kryptische philosophische Texte.",
        difficulty = 5,
        funFact = "Grothendieck wurde 1928 in Berlin geboren. Seine Eltern waren anarchistische Aktivisten; sein Vater, ein russisch-juedischer Anarchist, starb in Auschwitz. Grothendieck war staatenlos und lebte lange ohne Nationalitaet, was ihm die Teilnahme an internationalen Kongressen erschwerte."
    ),

    // Frage 48 — Eratosthenes  [correctAnswer = 3]
    Question(
        categoryId = 11,
        questionText = "Eratosthenes von Kyrene berechnete im 3. Jahrhundert v. Chr. den Erdumfang mit bemerkenswerter Genauigkeit. Welche Methode verwendete er dafuer?",
        answerA = "Er beobachtete die Mondfinsternis und berechnete aus dem Schatten die Erdkruemmung",
        answerB = "Er triangulieerde den Abstand zwischen Alexandrien und Athen",
        answerC = "Er benutzte das Spiegelprinzip des Pharos-Leuchtturms fuer Winkelmessungen",
        answerD = "Er mass die Schattenllaenge eines Obelisken in Alexandrien und verglich sie mit dem schattenlosen Mittag in Syene",
        correctAnswer = 3,
        explanation = "Eratosthenes wusste, dass die Sonne am Mittag der Sommersonnenwende in Syene (heutiges Assuan) senkrecht steht (keine Schatten). Gleichzeitig warf ein Obelisk in Alexandrien (ca. 800 km noerdlicher) einen Schatten im Winkel von 7,2 Grad (1/50 Kreis). Daraus berechnete er: Erdumfang ≈ 50 × 800 km = 40.000 km — erstaunlich nah am tatsaechlichen Wert von 40.075 km.",
        difficulty = 5,
        funFact = "Eratosthenes war Leiter der Bibliothek von Alexandria und leistete Beitraege in Geographie, Astronomie, Zahlentheorie (das Sieb des Eratosthenes) und Dichtung. Seine Zeitgenossen nannten ihn spottisch 'Beta' (Zweiter), weil er nie der Groesste auf einem einzigen Gebiet war."
    ),

    // Frage 49 — Claude Shannon / Entropie  [correctAnswer = 1]
    Question(
        categoryId = 11,
        questionText = "Claude Shannon begruendete 1948 mit seiner Abhandlung 'A Mathematical Theory of Communication' ein ganzes Fachgebiet. Welches Konzept einfuehrte er als Mass fuer den Informationsgehalt einer Nachricht?",
        answerA = "Varianz",
        answerB = "Entropie (Shannon-Entropie)",
        answerC = "Wahrscheinlichkeitsdichte",
        answerD = "Fourier-Koeffizienten",
        correctAnswer = 1,
        explanation = "Shannon definierte die Entropie H = -∑ p(x) log₂ p(x) als Mass fuer den mittleren Informationsgehalt (Ungewissheit) einer Nachrichtenquelle. Diese Shannon-Entropie ist die Grundlage der Informationstheorie — sie bestimmt die theoretischen Grenzen der Datenkompression und fehlerkorrigierten Uebertragung. Shannons Arbeit legte das Fundament fuer die digitale Kommunikation.",
        difficulty = 5,
        funFact = "Shannon war bekannt dafuer, auf einem Einrad durch die Bell-Labs-Korridore zu fahren und dabei Kontaktkeilen zu jonglieren. Er baute auch eine Maschine, die ausschliesslich dazu da war, sich selbst abzuschalten ('The Ultimate Machine'), und ein mechanisches Maus-Labyrinth-Lerngeraet."
    ),

    // Frage 50 — Alain Connes  [correctAnswer = 0]
    Question(
        categoryId = 11,
        questionText = "Der franzoesische Mathematiker Alain Connes erhielt 1982 die Fields-Medaille. Fuer welches Fachgebiet, das er massgeblich begruendete, ist er bekannt?",
        answerA = "Nichtkommutative Geometrie",
        answerB = "Tropische Geometrie",
        answerC = "Symplektische Topologie",
        answerD = "Motivische Kohomologie",
        correctAnswer = 0,
        explanation = "Alain Connes ist der Hauptbegruender der nichtkommutativen Geometrie — einem Zweig der Mathematik, in dem geometrische Konzepte auf nichtkommutative Algebren verallgemeinert werden (d.h. wo A×B ≠ B×A). Diese Theorie hat tiefe Verbindungen zur Quantenmechanik, wo Observablen ebenfalls nichtkommutieren. Connes entwickelte auch den Beweis des Indexsatzes fuer Blattstrukturen und formulierte ein Programm zur Vereinheitlichung von Physik und Mathematik.",
        difficulty = 5,
        funFact = "Connes hat behauptet, er erarbeite seine besten mathematischen Ideen in einem Halbschlaf-Zustand kurz vor dem Einschlafen. Er beschreibt mathematische Entdeckungen als 'Reise in eine andere Welt', nicht als Erfindung — ein Standpunkt, der zur philosophischen Debatte ueber mathematischen Platonismus gehoert."
    )

)
