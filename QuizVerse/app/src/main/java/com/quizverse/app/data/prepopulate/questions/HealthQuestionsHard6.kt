package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsHard6(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das Prinzip der informierten Einwilligung (Informed Consent) in der Medizinethik?",
        answerA = "Der Arzt entscheidet allein, welche Therapie am besten ist",
        answerB = "Der Patient muss nach vollstaendiger Aufklaerung freiwillig und kompetent zustimmen",
        answerC = "Die Einwilligung kann muendlich und ohne Begruendung erfolgen",
        answerD = "Familienangehoerige koennen immer stellvertretend einwilligen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Informed Consent verlangt, dass der Patient ausreichend informiert, entscheidungsfaehig und frei von Zwang ist -- fehlt eine dieser drei Voraussetzungen, ist die Einwilligung rechtlich und ethisch unwirksam.",
        funFact = "Das Konzept des Informed Consent wurde massgeblich durch den Nuernberger Kodex von 1947 gepraegt, der als Reaktion auf Menschenversuche im Nationalsozialismus entstand."
    ),

    // Question 2
    Question(
        categoryId = 16,
        questionText = "Welches ethische Prinzip beschreibt die Pflicht eines Arztes, den Patienten nicht zu schaedigen?",
        answerA = "Autonomie",
        answerB = "Benefizienz",
        answerC = "Non-Malefizienz",
        answerD = "Gerechtigkeit",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Non-Malefizienz (lat. non nocere -- nicht schaden) ist eines der vier Prinzipien der Bioethik nach Beauchamp und Childress und verpflichtet Aerzte, Schaden vom Patienten abzuwenden.",
        funFact = "Der hippokratische Grundsatz 'primum non nocere' (zuerst einmal nicht schaden) stammt vermutlich nicht direkt von Hippokrates selbst, sondern aus spaeterer lateinischer Uebersetzungstradition."
    ),

    // Question 3
    Question(
        categoryId = 16,
        questionText = "Was versteht man in der Bioethik unter Patientenautonomie?",
        answerA = "Das Recht des Arztes, ohne Ruecksprache zu handeln",
        answerB = "Das Recht des Patienten, selbst ueber seine Behandlung zu entscheiden",
        answerC = "Die automatische Zustimmung zu Standardbehandlungen",
        answerD = "Die finanzielle Unabhaengigkeit des Patienten vom Gesundheitssystem",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Patientenautonomie ist das ethische Prinzip der Selbstbestimmung -- der Patient hat das Recht, informierte Entscheidungen zu treffen und auch medizinisch sinnvolle Behandlungen abzulehnen.",
        funFact = "In Deutschland ist das Patientenrechtegesetz von 2013 die gesetzliche Grundlage fuer Patientenautonomie und verpflichtet Aerzte zur umfassenden Aufklaerung vor jedem Eingriff."
    ),

    // Question 4
    Question(
        categoryId = 16,
        questionText = "Welches Argument wird in der Sterbehilfe-Debatte als 'Schiefe-Ebene-Argument' (slippery slope) bezeichnet?",
        answerA = "Sterbehilfe ist medizinisch zu riskant und fehleranfaellig",
        answerB = "Eine Legalisierung fuehrt zwangslaeufig zu immer ausgeweiteten Toetungshandlungen",
        answerC = "Palliativmedizin macht aktive Sterbehilfe unnoetwig",
        answerD = "Sterbehilfe widerspricht dem hippokratischen Eid",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Schiefe-Ebene-Argument warnt, dass eine erste Ausnahme (z.B. Sterbehilfe bei unheilbarer Krankheit) logisch oder gesellschaftlich zu immer weiteren Ausnahmen fuehrt, die urspruenglich nicht beabsichtigt waren.",
        funFact = "In den Niederlanden, wo aktive Sterbehilfe seit 2002 legal ist, wurde das Schiefe-Ebene-Argument intensiv diskutiert -- kritiker weisen darauf hin, dass die Zahlen der Faelle seit der Legalisierung stark gestiegen sind."
    ),

    // Question 5
    Question(
        categoryId = 16,
        questionText = "Was unterscheidet die aktive von der passiven Sterbehilfe?",
        answerA = "Aktive Sterbehilfe ist in Deutschland erlaubt, passive nicht",
        answerB = "Aktive Sterbehilfe beschleunigt den Tod durch eine Handlung, passive durch Unterlassen lebensverlaengernder Massnahmen",
        answerC = "Passive Sterbehilfe erfordert immer eine richterliche Genehmigung",
        answerD = "Aktive Sterbehilfe ist ausschliesslich auf Intensivstationen erlaubt",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Aktive Sterbehilfe (z.B. toedliche Injektion) ist in Deutschland strafbar -- passive Sterbehilfe (Abbruch lebensverlaengernder Massnahmen auf Wunsch des Patienten) ist dagegen erlaubt.",
        funFact = "Das Bundesverfassungsgericht entschied 2020, dass das Verbot der geschaeftsmassigen Sterbehilfe verfassungswidrig ist -- seitdem ist die gesetzliche Regelung in Deutschland weiterhin ungeklaert."
    ),

    // Question 6
    Question(
        categoryId = 16,
        questionText = "In welcher Phase klinischer Studien wird ein neues Medikament erstmals am Menschen getestet?",
        answerA = "Phase IV",
        answerB = "Phase III",
        answerC = "Phase II",
        answerD = "Phase I",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Phase-I-Studien testen ein Medikament erstmals an einer kleinen Gruppe gesunder Probanden (10-80 Personen) zur Pruefung von Sicherheit, Vertraeglichkeit und Pharmakologie.",
        funFact = "Die beruechtigten TGN1412-Tests 2006 in London zeigten die Risiken der Phase I: Alle 6 gesunden Probanden erlitten nach einer einzigen Dosis einen lebensbedrohlichen Zytokinsturm."
    ),

    // Question 7
    Question(
        categoryId = 16,
        questionText = "Was ist der Hauptzweck einer Phase-III-Studie fuer ein neues Medikament?",
        answerA = "Erstmals die Sicherheit am Menschen zu testen",
        answerB = "Die optimale Dosierung zu bestimmen",
        answerC = "Die Wirksamkeit und Sicherheit an einer grossen Patientengruppe im Vergleich zu einem Standard zu beweisen",
        answerD = "Langzeitnebenwirkungen nach der Zulassung zu erfassen",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Phase-III-Studien umfassen hunderte bis tausende Patienten und vergleichen das neue Medikament mit Standardtherapie oder Placebo -- sie liefern die Zulassungsdaten fuer Behoerden wie EMA oder FDA.",
        funFact = "Eine typische Phase-III-Studie dauert 3-6 Jahre und kostet 100-300 Millionen Euro -- sie ist damit die teuerste und aufwendigste Phase der klinischen Entwicklung."
    ),

    // Question 8
    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'doppelblind' in einer klinischen Studie?",
        answerA = "Weder Patient noch Arzt wissen, wer Verum oder Placebo erhaelt",
        answerB = "Nur der Patient weiss nicht, welche Behandlung er erhaelt",
        answerC = "Beide Gruppen erhalten dasselbe Medikament in unterschiedlicher Dosis",
        answerD = "Die Studie wird von zwei unabhaengigen Forschungsgruppen durchgefuehrt",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Doppelblindheit bedeutet, dass weder Patient noch behandelnder Arzt wissen, wer Wirksubstanz oder Placebo erhaelt -- dies minimiert Erwartungsverzerrungen auf beiden Seiten.",
        funFact = "Der Placebo-Effekt kann bei Schmerzmitteln bis zu 30-40% der therapeutischen Wirkung ausmachen -- deshalb ist die Doppelblindmethode so entscheidend fuer valide Studienergebnisse."
    ),

    // Question 9
    Question(
        categoryId = 16,
        questionText = "Was untersucht eine Phase-IV-Studie (Post-Marketing-Surveillance)?",
        answerA = "Die erstmalige Wirksamkeit eines Wirkstoffs",
        answerB = "Langzeitwirkungen, seltene Nebenwirkungen und neue Anwendungsgebiete nach der Zulassung",
        answerC = "Die optimale Produktionsqualitaet des Medikaments",
        answerD = "Die Kosteneffektivitaet im Vergleich zu Generika",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Phase-IV-Studien laufen nach der Marktzulassung und erfassen seltene Nebenwirkungen (die in Phase-III-Studien nicht auftraten), Langzeiteffekte und neue Indikationen.",
        funFact = "Der COX-2-Hemmer Rofecoxib (Vioxx) wurde erst durch Phase-IV-Daten zurueckgezogen -- die erhoehte Herzinfarktrate war erst nach der Zulassung an Millionen Patienten erkennbar."
    ),

    // Question 10
    Question(
        categoryId = 16,
        questionText = "Was ist die Nummer Needed to Treat (NNT) in der evidenzbasierten Medizin?",
        answerA = "Die Anzahl der Patienten in einer Studie",
        answerB = "Die Anzahl von Patienten, die behandelt werden muessen, damit ein Patient einen Nutzen hat",
        answerC = "Die minimal wirksame Dosis eines Medikaments",
        answerD = "Die Kosten pro erfolgreich behandeltem Patienten",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die NNT gibt an, wie viele Patienten behandelt werden muessen, damit genau ein Patient von der Therapie profitiert -- eine NNT von 1 waere perfekt, grosse NNT-Werte zeigen geringe Wirksamkeit.",
        funFact = "Statine zur Herzinfarkt-Primaerpraevention haben eine NNT von 60-100 -- das bedeutet, 60-100 Menschen muessen ueber 5 Jahre Statine nehmen, damit einer einen Herzinfarkt vermeidet."
    ),

    // Question 11
    Question(
        categoryId = 16,
        questionText = "Was ist eine Cochrane-Review in der evidenzbasierten Medizin?",
        answerA = "Eine Einzelstudie mit besonders grosser Patientenzahl",
        answerB = "Eine systematische Zusammenfassung und Bewertung aller verfuegbaren Studien zu einer Frage",
        answerC = "Eine Empfehlung einer nationalen Aerztekammer",
        answerD = "Ein Bewertungssystem fuer neue Medikamente durch die EMA",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Cochrane Reviews sind systematische Uebersichtsarbeiten, die alle relevanten Studien zu einer klinischen Frage zusammenfassen und methodisch bewerten -- sie stehen an der Spitze der Evidenzhierarchie.",
        funFact = "Die Cochrane Collaboration wurde 1993 nach Archie Cochrane benannt, einem britischen Arzt, der bereits in den 1970er-Jahren die systematische Auswertung klinischer Studien forderte."
    ),

    // Question 12
    Question(
        categoryId = 16,
        questionText = "Was ist der wesentliche Unterschied zwischen einer systematischen Uebersichtsarbeit und einer Metaanalyse?",
        answerA = "Eine Metaanalyse umfasst mehr Studien als eine systematische Uebersichtsarbeit",
        answerB = "Eine Metaanalyse fasst Ergebnisse mehrerer Studien statistisch zusammen, eine systematische Uebersichtsarbeit muss das nicht",
        answerC = "Systematische Uebersichtsarbeiten werden nur von Regierungsbehoerden erstellt",
        answerD = "Metaanalysen bewerten ausschliesslich nicht-randomisierte Studien",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Eine systematische Uebersichtsarbeit beschreibt und bewertet vorhandene Studien qualitativ -- eine Metaanalyse geht weiter und fasst die Ergebnisse statistisch zu einem gemeinsamen Gesamtergebnis zusammen.",
        funFact = "Eine Metaanalyse kann zu dem paradoxen Ergebnis fuehren, dass viele kleine Studien, die einzeln keine Signifikanz zeigten, zusammengefasst einen klaren Effekt belegen -- dies rettet manchmal wirksame Therapien."
    ),

    // Question 13
    Question(
        categoryId = 16,
        questionText = "Welchen Anteil der Weltbevoelkerung betrifft Unternaehrung in Form von Stunting (Wachstumsverzoegerung) laut WHO hauptsaechlich?",
        answerA = "Kinder in Hocheinkommenslaendern mit Adipositas",
        answerB = "Kinder unter 5 Jahren in Niedrig- und Mitteleinkommenslaendern",
        answerC = "Senioren ueber 70 Jahre in Entwicklungslaendern",
        answerD = "Schwangere Frauen in Industrielaendern",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Stunting durch chronische Unternaehrung betrifft weltweit rund 148 Millionen Kinder unter 5 Jahren und ist in Sub-Sahara-Afrika und Suedasien am haeufigsten -- es verursacht irreversible kognitive und koerperliche Schaeden.",
        funFact = "Kinder mit Stunting verdienen im Erwachsenenalter im Schnitt 10% weniger als normal gewachsene Kinder -- Unternaehrung in der Kindheit hat damit direkte oekonomische Konsequenzen ueber Generationen."
    ),

    // Question 14
    Question(
        categoryId = 16,
        questionText = "Was ist die globale Hauptursache fuer vermeidbare Muettertodesfaelle weltweit?",
        answerA = "Praeklampsia und Eklampsie",
        answerB = "Postpartale Blutungen (PPH)",
        answerC = "Infektionen nach der Geburt",
        answerD = "Obstruierte Geburten",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Postpartale Blutungen verursachen ca. 27% aller Muettertodesfaelle weltweit und sind damit die haeufigste Einzelursache -- sie sind mit guenstigen Medikamenten wie Oxytocin weitgehend vermeidbar.",
        funFact = "99% aller Muettertodesfaelle weltweit ereignen sich in Entwicklungslaendern -- in Deutschland sterben pro 100.000 Lebendgeburten etwa 3-5 Muetter, in Sierra Leone waren es zeitweise ueber 1.800."
    ),

    // Question 15
    Question(
        categoryId = 16,
        questionText = "Wie viele Menschen weltweit hatten laut WHO (2022) keinen Zugang zu sicherem Trinkwasser?",
        answerA = "Ca. 100 Millionen",
        answerB = "Ca. 500 Millionen",
        answerC = "Ca. 2 Milliarden",
        answerD = "Ca. 4 Milliarden",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Laut WHO und UNICEF hatten 2022 rund 2 Milliarden Menschen keinen Zugang zu sicher verwalteten Trinkwasserquellen -- unsauberes Wasser ist eine Hauptursache fuer Durchfallerkrankungen, insbesondere bei Kindern.",
        funFact = "Durchfallerkrankungen durch verunreinigtes Wasser toeten weltweit noch immer ca. 500.000 Kinder unter 5 Jahren pro Jahr -- obwohl Loesungen wie Wasserfilter und Chlorierung seit Jahrzehnten bekannt sind."
    ),

    // Question 16
    Question(
        categoryId = 16,
        questionText = "Was ist die zentrale Finanzierungsidee des britischen National Health Service (NHS)?",
        answerA = "Pflichtversicherung bei privaten Krankenversicherern",
        answerB = "Steuerfinanziertes Gesundheitssystem mit kostenlosem Zugang fuer alle Buerger",
        answerC = "Beitragsfinanzierte Krankenkassen wie in Deutschland",
        answerD = "Kapitalgedecktes System mit individuellem Konto",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der NHS wird aus allgemeinen Steuermitteln finanziert und bietet allen Buergern kostenlosen Zugang zur Gesundheitsversorgung -- das Prinzip 'free at point of use' wurde 1948 von Aneurin Bevan eingefuehrt.",
        funFact = "Der NHS ist einer der groessten Arbeitgeber der Welt mit ueber 1,3 Millionen Beschaeftigten in England allein -- laut regelmaessigen Umfragen ist er trotz Problemen eine der beliebtesten Institutionen Grossbritanniens."
    ),

    // Question 17
    Question(
        categoryId = 16,
        questionText = "Was kennzeichnet das deutsche Krankenversicherungssystem im internationalen Vergleich?",
        answerA = "Ein einheitliches staatliches System ohne private Alternativen",
        answerB = "Beitragsfinanziertes duales System mit gesetzlicher und privater Krankenversicherung",
        answerC = "Rein steuerfinanziertes Einheitssystem wie in Skandinavien",
        answerD = "Vollstaendig marktwirtschaftliches System ohne gesetzliche Mindestversorgung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Deutschland hat ein duales System: GKV (Gesetzliche Krankenversicherung) als Pflichtversicherung fuer den Grossteil der Bevoelkerung und PKV (Private Krankenversicherung) als Alternative fuer Besserverdienende.",
        funFact = "Das deutsche Krankenversicherungssystem gilt als aeltestes der Welt -- Bismarck fuehrte 1883 die erste gesetzliche Krankenversicherung ein, als Reaktion auf die soziale Frage in der Industrialisierung."
    ),

    // Question 18
    Question(
        categoryId = 16,
        questionText = "Welches skandinavische Land hat im internationalen Vergleich konsequent die hoechsten Gesundheitsausgaben pro Kopf und die besten Outcomes?",
        answerA = "Daenemark",
        answerB = "Norwegen",
        answerC = "Finnland",
        answerD = "Island",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Norwegen gibt durch seine Erdoelinnahmen enorm viel pro Kopf fuer Gesundheit aus und erzielt dabei konstant sehr gute Outcomes -- Island zeigt allerdings bei manchen Indikatoren wie Lebenserwartung aehnlich gute Werte.",
        funFact = "Norwegen hat dank des staatlichen Oelfonds eine langfristig gesicherte Gesundheitsfinanzierung -- der Fonds ist mit ueber 1,6 Billionen Dollar der groesste Staatsfonds der Welt."
    ),

    // Question 19
    Question(
        categoryId = 16,
        questionText = "Warum geben die USA trotz sehr hoher Pro-Kopf-Ausgaben schlechtere Gesundheitsindikatoren als viele andere OECD-Laender?",
        answerA = "Weil die USA keine Notaufnahmen haben",
        answerB = "Wegen fehlender universeller Absicherung, hoher Ungleichheit und marktbasierter Strukturen mit teurer Verwaltung",
        answerC = "Weil die USA zu wenig in medizinische Forschung investieren",
        answerD = "Wegen klimabedingter Krankheiten im Sueden des Landes",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die USA geben ca. 17% des BIP fuer Gesundheit aus (mehr als jedes andere Land), haben aber keine universelle Absicherung -- Millionen Unversicherte, hohe Ungleichheit und extreme Verwaltungskosten fuehren zu schlechten durchschnittlichen Outcomes.",
        funFact = "Bis zu 30 Cent von jedem Dollar im US-Gesundheitssystem gehen fuer Verwaltung aus -- im Vergleich sind es in Kanada oder Deutschland weniger als 15 Cent, was enorme Summen fuer direkte Versorgung freistellen wuerde."
    ),

    // Question 20
    Question(
        categoryId = 16,
        questionText = "Was ist ein QALY (Quality-Adjusted Life Year) in der Gesundheitsoekonomie?",
        answerA = "Die durchschnittliche Lebenserwartung in einem Land",
        answerB = "Ein Mass fuer Lebensqualitaet und -quantitaet, das ein gewonnenes Lebensjahr in voller Gesundheit repraesentiert",
        answerC = "Die Kosten eines Krankenhausaufenthalts bezogen auf Behandlungserfolg",
        answerD = "Die Anzahl der Arztbesuche pro Jahr und Buerger",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Ein QALY kombiniert Lebensqualitaet (0 = Tod, 1 = volle Gesundheit) mit Lebensjahren -- ein Jahr in halbem Gesundheitszustand ergibt 0,5 QALYs -- dies erlaubt den Vergleich verschiedener Interventionen.",
        funFact = "Das britische NICE-Institut genehmigt Therapien typischerweise nur, wenn sie weniger als 20.000-30.000 Pfund pro QALY kosten -- teurere Behandlungen werden oft abgelehnt, was regelmaessig zu ethischen Kontroversen fuehrt."
    ),

    // Question 21
    Question(
        categoryId = 16,
        questionText = "Was beschreibt die Kosteneffektivitaetsanalyse (CEA) in der Gesundheitsoekonomie?",
        answerA = "Die Berechnung der Gesamtkosten einer Krankenhausprivatisierung",
        answerB = "Den Vergleich der Kosten verschiedener Interventionen bezogen auf einen einheitlichen Gesundheitsnutzen",
        answerC = "Die Analyse der Verwaltungskosten einer Krankenkasse",
        answerD = "Die Berechnung des Beitragssatzes zur gesetzlichen Krankenversicherung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die CEA vergleicht, wie viel verschiedene Interventionen kosten, um denselben Gesundheitsgewinn (z.B. ein QALY) zu erzielen -- sie hilft Entscheidungstraegern, knappe Ressourcen optimal einzusetzen.",
        funFact = "Impfprogramme gelten oft als kostensparenste Massnahmen im Gesundheitswesen -- die Masernimpfung zum Beispiel rechnet sich in vielen Laendern hundertfach durch vermiedene Behandlungskosten."
    ),

    // Question 22
    Question(
        categoryId = 16,
        questionText = "Was ist ein zentrales Merkmal einer Pandemie im Unterschied zu einer Epidemie?",
        answerA = "Pandemien werden ausschliesslich durch Viren, Epidemien durch Bakterien verursacht",
        answerB = "Eine Pandemie breitet sich ueber mehrere Kontinente oder weltweit aus, eine Epidemie bleibt regional begrenzt",
        answerC = "Pandemien haben immer eine hoehere Sterblichkeitsrate als Epidemien",
        answerD = "Eine Epidemie dauert laenger als eine Pandemie",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die WHO definiert eine Pandemie als weltweite Ausbreitung einer neuen Krankheit -- eine Epidemie ist dagegen auf ein Land oder eine Region beschraenkt, kann aber ebenso schwerwiegend sein.",
        funFact = "Die Spanische Grippe von 1918/19 infizierte rund 500 Millionen Menschen (ein Drittel der Weltbevoelkerung) und toeete schaetzungsweise 20-50 Millionen -- mehr als der gesamte Erste Weltkrieg."
    ),

    // Question 23
    Question(
        categoryId = 16,
        questionText = "Welche internationale Organisation ist primaer fuer Pandemievorsorge und -reaktion zustaendig?",
        answerA = "UNICEF",
        answerB = "Welthandelsorganisation (WTO)",
        answerC = "Weltgesundheitsorganisation (WHO)",
        answerD = "Internationaler Waehrungsfonds (IWF)",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Die WHO koordiniert internationale Pandemiereaktion, veroeffentlicht Risikoeinschaetzungen und kann den internationalen Gesundheitsnotstand (PHEIC) ausrufen -- sie ist aber auf freiwillige Beitraege und Kooperation der Mitgliedsstaaten angewiesen.",
        funFact = "Waehrend COVID-19 wurde die WHO scharf kritisiert: Die USA unter Trump traten sogar aus und kehrten erst unter Biden zurueck -- dies zeigte die politische Verwundbarkeit der wichtigsten globalen Gesundheitsinstanz."
    ),

    // Question 24
    Question(
        categoryId = 16,
        questionText = "Was beschreibt der Begriff 'One Health' in der Pandemievorsorge?",
        answerA = "Ein einheitliches Krankenversicherungssystem fuer alle Nationen",
        answerB = "Den integrierten Ansatz, der Menschengesundheit, Tiergesundheit und Oekosystemgesundheit als untrennbar betrachtet",
        answerC = "Die WHO-Strategie zur Einfuehrung einer einzigen globalen Gesundheitsbehoerde",
        answerD = "Ein Praeventifonsprogramm fuer chronische Erkrankungen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der One-Health-Ansatz erkennt, dass ca. 70% aller neuen Infektionskrankheiten des Menschen zoonotischen Ursprungs sind -- die Gesundheit von Menschen, Tieren und Oekosystemen ist untrennbar verbunden.",
        funFact = "COVID-19, Ebola, HIV, Influenza und SARS -- all diese Pandemien haben tierische Urspruenge -- deshalb gilt Wildtierhandel und Landnutzungsaenderung als eines der groessten Pandemierisiken der Zukunft."
    ),

    // Question 25
    Question(
        categoryId = 16,
        questionText = "Was beschreibt die 'R0'-Zahl (Basisreproduktionszahl) bei Infektionskrankheiten?",
        answerA = "Die Sterblichkeitsrate einer Infektion in der Bevoelkerung",
        answerB = "Die Anzahl von Personen, die eine infizierte Person in einer voellig empfaenglichen Bevoelkerung im Durchschnitt ansteckt",
        answerC = "Die Rate der erfolgreichen Impfungen pro 1.000 Einwohner",
        answerD = "Die Zeit bis zum Auftreten erster Symptome nach Infektion",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "R0 > 1 bedeutet, die Infektion breitet sich aus -- R0 < 1 bedeutet, sie stirbt aus -- Masern haben z.B. R0 von 12-18, COVID-19-Originalvariante ca. 2-3 und die Omikron-Variante ca. 10-15.",
        funFact = "Masern gelten als eine der ansteckendsten Krankheiten der Menschheit mit R0 bis 18 -- fuer Herdenimmunitaet waere eine Impfrate von ueber 95% noetig, was erklaert, warum Masern bei sinkenden Impfquoten sofort zurueckkehren."
    ),

    // Question 26
    Question(
        categoryId = 16,
        questionText = "Welche Aussage zur antimikrobiellen Resistenz (AMR) als globale Bedrohung ist korrekt?",
        answerA = "AMR betrifft nur tropische Laender ohne modernen Sanitaer",
        answerB = "AMR entsteht ausschliesslich durch falschen Einsatz von Antibiotika beim Menschen",
        answerC = "AMR bedroht die Wirksamkeit von Antibiotika und koennte laut Prognosen bis 2050 mehr Todesfaelle verursachen als Krebs",
        answerD = "AMR kann vollstaendig durch Haendehygiene verhindert werden",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Antimikrobielle Resistenz entsteht durch Selektionsdruck bei Ueber- und Fehleinsatz von Antibiotika in Medizin und Landwirtschaft -- Prognosen sagen bis zu 10 Millionen Todesfaelle jaehrlich bis 2050 voraus.",
        funFact = "Rund 70% aller weltweit eingesetzten Antibiotika werden in der Tierhaltung zur Wachstumsfoerderung verwendet -- nicht zur Behandlung kranker Tiere, sondern als Masthilfe, was massgeblich zur Resistenzentwicklung beitraegt."
    ),

    // Question 27
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Antibiotic Stewardship' in Krankenhaeusern?",
        answerA = "Die generelle Vermeidung aller Antibiotikagaben bei Infektionen",
        answerB = "Strukturierte Programme zur rationalen, zielgerichteten und sparsamen Antibiotikavergabe",
        answerC = "Die ausschliessliche Verwendung von Breitspektrum-Antibiotika",
        answerD = "Das Verbot von Antibiotika in der ambulanten Medizin",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Antibiotic-Stewardship-Programme koordinieren den gezielten Einsatz von Antibiotika im Krankenhaus, um Resistenzentwicklung zu verlangsamen, Therapieversagen zu vermeiden und Nebenwirkungen zu minimieren.",
        funFact = "In Schweden wurden durch nationale Antibiotic-Stewardship-Massnahmen die Antibiotikaverordnungen um 40% gesenkt -- ohne dass sich Outcomes verschlechterten, was zeigt, wie gross der bisherige Uebereinsatz war."
    ),

    // Question 28
    Question(
        categoryId = 16,
        questionText = "Was beschreibt den Begriff 'MRSA' im Kontext der antimikrobiellen Resistenz?",
        answerA = "Einen Virus, der Antibiotikaresistenz uebertraegt",
        answerB = "Methicillin-resistenter Staphylococcus aureus -- ein Bakterium, das gegen viele Standardantibiotika resistent ist",
        answerC = "Ein Notfallmedikament gegen multiresistente Erreger",
        answerD = "Eine internationale Behoerde zur Resistenzkontrolle",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "MRSA ist eine Variante von Staphylococcus aureus, die gegen Methicillin und viele andere Beta-Laktam-Antibiotika resistent ist -- er verursacht schwere Krankenhaus- und Gemeinschaftsinfektionen.",
        funFact = "In deutschen Krankenhaeusern sterben jaehrlich schaetzungsweise 1.000-4.000 Menschen an MRSA-Infektionen -- in Laendern wie Daenemark und den Niederlanden ist MRSA durch strikte Hygienemassnahmen fast eliminiert worden."
    ),

    // Question 29
    Question(
        categoryId = 16,
        questionText = "Welche Intervention hat laut WHO den groessten Einfluss auf die Reduzierung der globalen Sterblichkeit durch Infektionskrankheiten?",
        answerA = "Entwicklung neuer Antibiotika",
        answerB = "Impfprogramme",
        answerC = "Erweiterung der Intensivmedizin in Entwicklungslaendern",
        answerD = "Haendehygiene in Krankenhaeusern",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Impfprogramme retten schaetzungsweise 2-3 Millionen Menschenleben pro Jahr direkt -- Pocken wurden durch Impfung vollstaendig ausgerottet, Polio ist fast eliminiert.",
        funFact = "Die Ausrottung der Pocken im Jahr 1980 gilt als einer der groessten Erfolge der Menschheitsgeschichte -- bis zur Ausrottungskampagne toeete die Krankheit jaehrlich noch 2 Millionen Menschen."
    ),

    // Question 30
    Question(
        categoryId = 16,
        questionText = "Welche Aussage zur psychischen Gesundheitsversorgung und Stigmatisierung weltweit ist korrekt?",
        answerA = "Psychische Erkrankungen erhalten global einen aehnlich hohen Anteil der Gesundheitsausgaben wie koerperliche Erkrankungen",
        answerB = "Psychische Erkrankungen verursachen weltweit einen erheblichen Teil der Krankheitslast, erhalten aber trotzdem nur einen kleinen Bruchteil der Gesundheitsressourcen",
        answerC = "Stigmatisierung ist in Entwicklungslaendern kein Problem, sondern nur in westlichen Gesellschaften",
        answerD = "Depression und Angststoerungen haben global nur marginale oekonomische Auswirkungen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Psychische Erkrankungen machen ca. 13% der globalen Krankheitslast aus, erhalten aber im Durchschnitt nur 2% der nationalen Gesundheitsbudgets -- die sogenannte 'treatment gap' ist in Entwicklungslaendern noch groesser.",
        funFact = "Laut WHO haben 75-85% der Menschen mit schweren psychischen Erkrankungen in Niedrigeinkommenslaendern keinen Zugang zu Behandlung -- dies ist eine der groessten und am wenigsten beachteten Versorgungsluecken der globalen Gesundheit."
    ),

    // Question 31
    Question(
        categoryId = 16,
        questionText = "Was ist die 'treatment gap' bei psychischen Erkrankungen?",
        answerA = "Der Unterschied in der Wirksamkeit verschiedener Antidepressiva",
        answerB = "Die Luecke zwischen dem Bedarf an psychischer Behandlung und dem tatsaechlich verfuegbaren Angebot",
        answerC = "Die Wartezeit zwischen Diagnose und Therapiebeginn in Industrielaendern",
        answerD = "Der Unterschied zwischen ambulanter und stationaerer Psychiatrie",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Treatment Gap beschreibt, wie viele Menschen psychische Erkrankungen haben, aber keine angemessene Behandlung erhalten -- global sind das ueber eine Milliarde Menschen, besonders dramatisch in einkommensschwachen Laendern.",
        funFact = "In Somalia oder auf dem Land in Indien gibt es teils einen Psychiater fuer mehrere Millionen Menschen -- die WHO-Empfehlung waere mindestens ein Psychiater pro 100.000 Einwohner."
    ),

    // Question 32
    Question(
        categoryId = 16,
        questionText = "Welche Massnahme hat sich als am wirksamsten erwiesen, um Stigmatisierung psychischer Erkrankungen zu reduzieren?",
        answerA = "Juristische Antidiskriminierungsgesetze allein",
        answerB = "Persoenlicher Kontakt mit Menschen mit psychischen Erkrankungen kombiniert mit Aufklaerung",
        answerC = "Oekonomische Incentives fuer diskriminierungsfreies Verhalten",
        answerD = "Ausschliesslich Schulunterricht ueber psychische Gesundheit",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Forschung zeigt konsistent, dass persoenlicher Kontakt mit Betroffenen (Contact-Based-Education) Stigma am effektivsten reduziert -- reine Wissensvermittlung veraendert Einstellungen kaum ohne die menschliche Dimension.",
        funFact = "Das britische 'Time to Change'-Programm (2007-2021) zeigte, dass persoenliches Kontakt-Storytelling Stigma-Werte bei Zielgruppen um bis zu 20% senken konnte -- ein europaeweit beachtetes Modellprojekt."
    ),

    // Question 33
    Question(
        categoryId = 16,
        questionText = "Welches Land hat das sogenannte 'Opt-Out'-System fuer Organspende eingefuehrt, bei dem alle Buerger automatisch als Spender gelten, sofern sie nicht widersprochen haben?",
        answerA = "Deutschland",
        answerB = "USA",
        answerC = "Oesterreich",
        answerD = "Kanada",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Oesterreich hat seit Jahrzehnten ein Opt-Out-System -- alle Buerger sind automatisch Organspender, es sei denn, sie haben aktiv widersprochen -- dies fuehrt zu deutlich hoeheren Spenderzahlen als im deutschen Opt-In-System.",
        funFact = "Oesterreich hat pro Kopf eine etwa dreimal hoehere Transplantationsrate als Deutschland, das bis heute auf freiwillige Zustimmung setzt -- in Deutschland sterben jaehrlich ca. 1.000 Menschen, weil sie auf ein Spenderorgan warten."
    ),

    // Question 34
    Question(
        categoryId = 16,
        questionText = "Was ist das zentrale ethische Argument GEGEN ein Opt-Out-System bei der Organspende?",
        answerA = "Opt-Out-Systeme haben keine Auswirkung auf die Organzahlen",
        answerB = "Es verletzt die Koerperautonomie, wenn Widerspruch aktiv eingelegt werden muss statt Zustimmung aktiv gegeben werden muss",
        answerC = "Organspende ist medizinisch zu riskant fuer den Empfaenger",
        answerD = "Religions- und Glaubensfreiheit kann nicht durch eine staatliche Datenbank geschuetzt werden",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Kritiker des Opt-Out-Systems argumentieren, dass der Koerper einer Person ihr gehoert und der Staat keine Standardverfuegung ueber ihn treffen sollte -- das Schweigen einer Person sollte keine Zustimmung implizieren.",
        funFact = "Spanien hat das weltweit erfolgreichste Organspendesystem -- trotz Opt-Out liegt der Haupterfolg nicht im Rechtssystem selbst, sondern in gut ausgebildeten Transplantationskoordinatoren in jedem Krankenhaus."
    ),

    // Question 35
    Question(
        categoryId = 16,
        questionText = "Was regelt das Allokationsprinzip 'MELD-Score' bei Lebertransplantationen?",
        answerA = "Wie lange ein Patient bereits auf der Warteliste steht",
        answerB = "Die dringende medizinische Notwendigkeit einer Lebertransplantation basierend auf Laborwerten",
        answerC = "Die Blutgruppenkompatibilitaet zwischen Spender und Empfaenger",
        answerD = "Das Lebensalter des Patienten auf der Warteliste",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der MELD-Score (Model for End-Stage Liver Disease) berechnet aus Laborwerten (Bilirubin, Kreatinin, INR) die 3-Monats-Sterblichkeit ohne Transplantation -- Patienten mit hoeherem MELD erhalten priorisiert ein Organ.",
        funFact = "Der MELD-Score loeste 2002 in den USA das reine Wartezeit-Prinzip ab -- dies fuehrte zu einer deutlichen Senkung der Mortalitaet auf der Transplantationswarteliste, weil nun Dringlichkeit statt Geduld entschied."
    ),

    // Question 36
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das Konzept 'Health Equity' (Gesundheitsgerechtigkeit)?",
        answerA = "Gleiche Ausgaben fuer jeden Buerger im Gesundheitssystem",
        answerB = "Das Ziel, systematische Unterschiede in Gesundheitschancen zu vermeiden, die auf sozialen Faktoren beruhen",
        answerC = "Die gleiche Anzahl an Aerzten pro Region",
        answerD = "Den freien Marktzugang zu medizinischen Leistungen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Health Equity bedeutet, dass jeder Mensch unabhaengig von Herkunft, Einkommen, Bildung oder Wohnort faire Chancen auf Gesundheit haben soll -- systematische gesundheitliche Benachteiligungen gelten als soziale Ungerechtigkeit.",
        funFact = "In vielen Laendern haben arme Stadtteile oder laendliche Regionen bis zu 10 Jahre geringere Lebenserwartung als reiche Gegenden derselben Stadt -- dies ist kein Zufall, sondern Folge struktureller Ungleichheit in Ressourcen."
    ),

    // Question 37
    Question(
        categoryId = 16,
        questionText = "Was ist ein 'Publication Bias' in der medizinischen Forschung?",
        answerA = "Die Tendenz, nur positive oder signifikante Studienergebnisse zu veroeffentlichen",
        answerB = "Die bevorzugte Veroeffentlichung von Studien aus Industrielaendern",
        answerC = "Der Vorteil, den Forschende aus grossen Universitaeten bei der Veroeffentlichung haben",
        answerD = "Die Verpflichtung, alle Studienergebnisse zu veroeffentlichen",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Publication Bias entsteht, weil positive Studienergebnisse viel haeufiger veroeffentlicht werden als negative -- dies verzerrt Metaanalysen und kann zu falschen Therapieempfehlungen fuehren.",
        funFact = "Schlaganfall-Vorbeugung mit Antidepressiva schien lange sinnvoll auf Basis publizierter Studien -- erst als unveroefflentlichte Negativstudien ans Licht kamen, zeigte sich, dass der Effekt sich in Luft aufloeste."
    ),

    // Question 38
    Question(
        categoryId = 16,
        questionText = "Was bedeutet das Konzept 'Herd Immunity' (Herdenimmunitaet) bei Infektionskrankheiten?",
        answerA = "Dass einzelne Tiere in einer Herde besonders resistent gegen Krankheiten sind",
        answerB = "Dass ausreichend Immune in einer Gruppe auch nicht-immune Personen schuetzen, weil Uebertragungsketten unterbrochen werden",
        answerC = "Dass eine Gemeinschaft gegen alle Erreger gleichzeitig immun ist",
        answerD = "Die natuerliche Resistenz von Wildtieren gegen Zoonosen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Herdenimmunitaet entsteht, wenn geniigend Personen immun sind (durch Impfung oder Infektion), sodass die Verbreitung eines Erregers abgewuergt wird und auch Vulnerable ohne eigene Immunitaet geschuetzt werden.",
        funFact = "Fuer Masern mit R0 von ca. 15 braucht man 93-95% Immunisierung in der Bevoelkerung, um Herdenimmunitaet zu erreichen -- bei COVID-19 Omikron mit R0 um 10-15 wird diskutiert, ob echte Herdenimmunitaet ueberhaupt erreichbar ist."
    ),

    // Question 39
    Question(
        categoryId = 16,
        questionText = "Welche der folgenden Aussagen zur globalen Burden of Disease (Krankheitslast) stimmt?",
        answerA = "Infektionskrankheiten sind heute weltweit fuer mehr Todesfaelle verantwortlich als nicht uebertragbare Erkrankungen",
        answerB = "Herz-Kreislauf-Erkrankungen und Krebs machen heute die groesste Last aus, auch in Niedrigeinkommenslaendern",
        answerC = "Nicht uebertragbare Erkrankungen sind ausschliesslich ein Problem wohlhabender Industrielaender",
        answerD = "Psychische Erkrankungen tragen kaum zur globalen Krankheitslast bei",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Herz-Kreislauf-Erkrankungen sind weltweit die haeufigste Todesursache -- selbst in Niedrig- und Mitteleinkommenslaendern ueberwiegen nicht uebertragbare Erkrankungen bereits gegenueber Infektionskrankheiten.",
        funFact = "Der sogenannte 'Double Burden of Disease' betrifft viele Entwicklungslaender: Sie kaempfen gleichzeitig gegen Infektionskrankheiten UND gegen steigende Raten von Diabetes, Herzkrankheiten und Krebs -- beides auf einmal."
    ),

    // Question 40
    Question(
        categoryId = 16,
        questionText = "Was ist die 'Triage' und woher stammt das Konzept urspruenglich?",
        answerA = "Ein diagnostisches Bewertungssystem fuer Krebspatienten, entwickelt von der WHO",
        answerB = "Die Priorisierung medizinischer Behandlung nach Dringlichkeit, urspruenglich aus der Militaermedizin",
        answerC = "Ein Abrechnungssystem fuer Krankenhausleistungen, entwickelt in den 1970er-Jahren",
        answerD = "Das System zur Zuweisung von Organtransplantationen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Triage (franz.: sortieren) wurde von Napoleon-Arzt Dominique Jean Larrey entwickelt, um Verwundete nach Dringlichkeit zu sortieren -- heute standard in Notaufnahmen und Katastrophenmedizin.",
        funFact = "Im Katastrophenfall gibt es eine bittere Triage-Kategorie 'Expectant' (schwarzes Kennzeichen): Patienten mit lebensbedrohlichen Verletzungen, die so viel Ressourcen benoetigen, dass andere Rettungschancen verloren gaenden -- sie erhalten nur Schmerzlinderung."
    ),

    // Question 41
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Vertical Health Programs' in der globalen Gesundheit?",
        answerA = "Gesundheitsprogramme, die ausschliesslich in Hochhaeusern und Stadtgebieten stattfinden",
        answerB = "Spezifische Programme fuer eine Krankheit oder Intervention, die parallel zu bestehenden Gesundheitssystemen laufen",
        answerC = "Programme, die von der WHO direkt an Regierungen finanziert werden",
        answerD = "Hierarchische Gesundheitsverwaltungsstrukturen in Bundesstaaten",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Vertical Programs konzentrieren sich auf eine Krankheit (z.B. HIV, Malaria, TBC) mit eigener Infrastruktur -- sie koennen schnell wirksam sein, aber schwache allgemeine Gesundheitssysteme weiter unterminieren.",
        funFact = "Das PEPFAR-Programm der USA gegen HIV in Afrika ist eines der erfolgreichsten Vertical Programs -- es rettete Millionen Leben, wurde aber kritisiert, weil Gesundheitsministerien Mitarbeiter verloren, die besser bezahlte HIV-Programm-Jobs annahmen."
    ),

    // Question 42
    Question(
        categoryId = 16,
        questionText = "Welches Prinzip beschreibt die gerechte Verteilung knapper Gesundheitsressourcen in der Medizinethik?",
        answerA = "Benefizienz",
        answerB = "Non-Malefizienz",
        answerC = "Gerechtigkeit (Justice)",
        answerD = "Autonomie",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Das Gerechtigkeitsprinzip nach Beauchamp und Childress fordert eine faire Verteilung von Gesundheitsleistungen -- es ist Grundlage von Debatten ueber Triage, Impfpriorisierung und Zuteilung knapper Ressourcen.",
        funFact = "Waehrend COVID-19 entwickelten viele Laender ethische Leitlinien fuer den Extremfall, dass Beatmungsgeraete rationiert werden muessen -- in Deutschland veraesentlichten Aerzteverbauende und DIVI solche Triage-Empfehlungen erstmals explizit."
    ),

    // Question 43
    Question(
        categoryId = 16,
        questionText = "Was beschreibt der Begriff 'Medikalisierung' in der Soziologie der Medizin?",
        answerA = "Die Einfuehrung neuer Medikamente in die Grundversorgung",
        answerB = "Der Prozess, durch den normale Lebenserfahrungen oder soziale Probleme als medizinische Erkrankungen umdefiniert werden",
        answerC = "Die Ausweitung der medizinischen Ausbildung auf Laienhelfer",
        answerD = "Die Steigerung der Medikamentendosen fuer bessere Wirksamkeit",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Medikalisierung (nach Zola und Illich) beschreibt, wie immer mehr menschliche Erfahrungen -- Geburt, Tod, Trauer, Altern, Schyeheit -- zu medizinischen Problemen gemacht werden, die Behandlung erfordern.",
        funFact = "ADHS ist ein klassisches Beispiel fuer umstrittene Medikalisierung -- in den USA werden ca. 10% aller Schulkinder mit Stimulanzien behandelt, in Deutschland ist die Rate mit ca. 3% deutlich geringer, trotzdem stark gestiegen."
    ),

    // Question 44
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen 'Efficacy' und 'Effectiveness' in klinischen Studien?",
        answerA = "Efficacy misst Kosten, Effectiveness misst medizinische Wirkung",
        answerB = "Efficacy ist die Wirksamkeit unter Idealbedingungen (Studie), Effectiveness ist die Wirksamkeit im realen Versorgungsalltag",
        answerC = "Effectiveness ist ein Synonym fuer Efficacy in der WHO-Terminologie",
        answerD = "Efficacy bezieht sich auf Impfstudien, Effectiveness auf Medikamentenstudien",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Efficacy (Wirksamkeitsevidenz aus RCTs) und Effectiveness (reale Wirksamkeit) koennen erheblich voneinander abweichen -- ein Medikament kann im Studienumfeld hocheffektiv sein, aber in der Praxis durch Compliance-Probleme kaum wirken.",
        funFact = "Der Unterschied ist bei Impfstoffen besonders deutlich -- Influenza-Impfstoffe zeigen in idealen Studien 70-90% Efficacy, aber in realen Bevoelkerungsstudien oft nur 40-60% Effectiveness wegen saisonaler Antigenabweichungen."
    ),

    // Question 45
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Rational Drug Use' (rationaler Arzneimittelgebrauch) laut WHO?",
        answerA = "Die ausschliessliche Nutzung von Generika statt Markenpraeparaten",
        answerB = "Die Verordnung des richtigen Medikaments in richtiger Dosis, fuer den richtigen Patienten, zur richtigen Zeit, zum niedrigsten Preis",
        answerC = "Den vollstaendigen Verzicht auf Antibiotika in der Primaerversorgung",
        answerD = "Die staatliche Kontrolle aller Medikamentenverschreibungen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Rational Drug Use ist ein zentrales Prinzip der WHO-Arzneimittelpolitik -- weltweit werden mehr als 50% aller Medikamente irrational verordnet, eingenommen oder verkauft, was Resistenzen, Nebenwirkungen und Kosten erhoehe.",
        funFact = "In vielen Laendern koennen Antibiotika ohne Rezept in Apotheken gekauft werden -- in Brasilien, China und Indien ist dies eine Hauptursache fuer rasant zunehmende antimikrobielle Resistenz in der Normalbevoelkerung."
    ),

    // Question 46
    Question(
        categoryId = 16,
        questionText = "Was ist die 'Alma-Ata-Deklaration' von 1978 und ihre Bedeutung fuer die globale Gesundheit?",
        answerA = "Ein Abkommen zur Bekaempfung von HIV/AIDS in Entwicklungslaendern",
        answerB = "Die erste internationale Erklaerung, die Primaerversorgung als Grundrecht und Schluessel zu 'Gesundheit fuer alle' definierte",
        answerC = "Ein UN-Vertrag zur Einfuehrung globaler Mindeststandards fuer Krankenhaeuser",
        answerD = "Die Gruendungsurkunde der Weltgesundheitsorganisation",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Alma-Ata-Deklaration proklamierte 'Health for All by the Year 2000' durch den Ausbau von Primary Health Care -- sie ist wegweisend fuer dezentrale, gemeindebasierte Gesundheitsversorgung bis heute.",
        funFact = "Die Deklaration wurde in der sowjetischen Stadt Alma-Ata (heute Almaty, Kasachstan) unterzeichnet -- obwohl das Ziel 'Gesundheit fuer alle bis 2000' nie erreicht wurde, praegt das Dokument noch heute WHO-Strategien."
    ),

    // Question 47
    Question(
        categoryId = 16,
        questionText = "Was ist das Ziel der 'Sustainable Development Goals' (SDGs) im Bereich Gesundheit (SDG 3)?",
        answerA = "Die vollstaendige Privatisierung des Gesundheitssektors bis 2030",
        answerB = "Ein gesundes Leben und Wohlbefinden fuer alle Menschen jeden Alters zu foerdern -- inklusive Reduktion von Muetter- und Kindersterblichkeit und Erreichung universeller Gesundheitsversorgung",
        answerC = "Die ausschliessliche Konzentration auf Infektionskrankheitspraevention",
        answerD = "Die Verdopplung der medizinischen Forschungsausgaben aller Mitgliedsstaaten",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "SDG 3 'Good Health and Well-Being' umfasst 13 Unterziele bis 2030 -- darunter universelle Krankenversorgung, Reduzierung von Muettermortalitaet auf unter 70/100.000 und Bekkaempfung von Epidemien.",
        funFact = "Laut UN-Berichten von 2023 ist SDG 3 aufgrund von COVID-19-Folgen, Konflikten und Klimakrise massiv in Gefahr -- der Grossteil der Laender liegt weit hinter den Zielvorgaben, vor allem bei Muetter- und Kindersterblichkeit."
    ),

    // Question 48
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Universal Health Coverage' (UHC)?",
        answerA = "Kostenlose Behandlung fuer alle Menschen weltweit ohne Ausnahme",
        answerB = "Das Ziel, dass alle Menschen qualitativ hochwertige Gesundheitsleistungen nutzen koennen, ohne in finanzielle Not zu geraten",
        answerC = "Ein internationaler Versicherungsvertrag zwischen allen WHO-Mitgliedsstaaten",
        answerD = "Die vollstaendige Verstaatlichung aller Gesundheitssysteme",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "UHC ist ein Kernziel der WHO und SDG 3 -- es bedeutet nicht zwingend Gratisbehandlung, sondern finanziellen Schutz, sodass niemand wegen Gesundheitskosten in Armut faellt und alle Basisversorgung erhalten.",
        funFact = "Schaetzungsweise 100 Millionen Menschen pro Jahr fallen weltweit durch Gesundheitsausgaben in extreme Armut -- die WHO nennt dies als zentrales Argument fuer den Ausbau sozialer Krankenversicherungssysteme."
    ),

    // Question 49
    Question(
        categoryId = 16,
        questionText = "Welche Aussage zum Zusammenhang von Bildung und Gesundheit ist empirisch gesichert?",
        answerA = "Bildung hat keinen nachweisbaren Einfluss auf Gesundheitsindikatoren",
        answerB = "Hoehere Bildung korreliert stark mit besserer Gesundheit, laengerer Lebenserwartung und geringerem Erkrankungsrisiko",
        answerC = "Bildung verbessert nur die psychische, nicht die koerperliche Gesundheit",
        answerD = "Der Zusammenhang von Bildung und Gesundheit ist ausschliesslich auf Einkommen zurueckzufuehren",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bildung ist einer der staerksten sozialen Determinanten von Gesundheit -- jedes zusaetzliche Schuljahr senkt die Sterblichkeit messbar und wirkt ueber Gesundheitskompetenz, Einkommen, Lebensstilfaktoren und bessere Nutzung des Gesundheitssystems.",
        funFact = "Eine Mutter mit Grundschulbildung hat in Entwicklungslaendern bereits signifikant geringere Kindersterblichkeit als eine Mutter ohne Schulbildung -- Maedchenbildung gilt daher als eine der wirksamsten Public-Health-Interventionen."
    ),

    // Question 50
    Question(
        categoryId = 16,
        questionText = "Was beschreibt der Begriff 'Social Determinants of Health' (soziale Determinanten der Gesundheit) nach der WHO?",
        answerA = "Genetische Faktoren, die Gesundheit in sozialen Gruppen beeinflussen",
        answerB = "Die Lebensbedingungen, in denen Menschen geboren werden, aufwachsen, leben, arbeiten und altern -- und die massgeblich ihre Gesundheit bestimmen",
        answerC = "Ausschliesslich der Einfluss von Einkommen auf den Zugang zur Gesundheitsversorgung",
        answerD = "Psychologische Faktoren, die durch soziale Interaktionen entstehen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Soziale Determinanten umfassen Einkommen, Bildung, Arbeitsbedingungen, Wohnumfeld, soziale Unterstuetzung und mehr -- die WHO-Kommission unter Marmot zeigte 2008, dass sie mindestens so wichtig wie klinische Faktoren sind.",
        funFact = "Michael Marmot's 'Whitehall Studies' (1967-1988) zeigten in der britischen Buerokratie, dass hoeherer Beamtenrang mit laengerer Lebenserwartung korreliert -- selbst innerhalb gut versorgter Beamtengruppen bestimmt sozialer Status die Gesundheit."
    )

)
