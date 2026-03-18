package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsMaster(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) ── 50 questions ──────────────────────────────

    // ── Antike Sportgeschichte (8) ────────────────────────────────────────────

    // Question 1 – Ancient Olympics: Pentathlon components
    Question(
        categoryId = 6,
        questionText = "Welche fuenf Disziplinen umfasste das antike olympische Pentathlon in der klassischen Periode (5. Jh. v. Chr.)?",
        answerA = "Laufen, Ringen, Diskuswurf, Speerwurf, Weitsprung",
        answerB = "Laufen, Boxen, Diskuswurf, Speerwurf, Speerwerfen vom Pferd",
        answerC = "Faustkampf, Ringen, Diskuswurf, Speerwurf, Weitsprung",
        answerD = "Laufen, Ringen, Diskuswurf, Pferderennen, Weitsprung",
        correctAnswer = 0,
        explanation = "Das antike Pentathlon bestand aus Laufen (Stadion), Ringen (Pale), Diskuswurf (Diskos), Speerwurf (Akon) und Weitsprung (Halma). Der Sieger wurde nach einer komplizierten Wertungsregel ermittelt, die noch heute unter Historikern diskutiert wird.",
        difficulty = 5,
        funFact = "Beim antiken Weitsprung trugen die Athleten Haltesteine (Halteres) aus Blei oder Stein in den Haenden, die sie im Absprung nach hinten schwangen, um den Sprung zu verlaengern – eine Technik, die bei modernen Weitspringern verboten waere."
    ),

    // Question 2 – Ancient Olympics: Chariot racing prize
    Question(
        categoryId = 6,
        questionText = "Wer galt in der Antike als Sieger eines olympischen Wagenrennens – der Wagenlenker oder der Besitzer der Pferde?",
        answerA = "Der Wagenlenker, da er die koerperliche Leistung erbrachte",
        answerB = "Beide gemeinsam als gleichberechtigte Sieger",
        answerC = "Der Besitzer der Pferde, da er die Olympionike-Ehre erhielt",
        answerD = "Der Hauptsponsor der Olympischen Spiele in jenem Jahr",
        correctAnswer = 2,
        explanation = "Im antiken Griechenland erhielt der Pferdebesitzer (Hippotrophes) die Ehre des Olympioniken, nicht der Wagenlenker. Kyniska von Sparta war 396 und 392 v. Chr. die erste Frau, die als Olympionikin geehrt wurde – durch den Sieg ihrer Pferde im Wagenrennen.",
        difficulty = 5,
        funFact = "Kyniska liess in Olympia eine Bronzestatue und eine Inschrift aufstellen: 'Ich erklaere, dass ich die einzige Frau in ganz Griechenland bin, die diesen Kranz gewonnen hat.' Spartanische Frauen wurden gezielt im Wagenrennen gefuerdert, um die Stute-Zucht des Stadtstaates zu demonstrieren."
    ),

    // Question 3 – Ancient Roman circus: Hippodrome lanes
    Question(
        categoryId = 6,
        questionText = "Wie viele Runden mussten die Wagenlenker im Circus Maximus in Rom bei den offiziellen Rennen des Kaiserreichs zuruecklegen?",
        answerA = "Sieben Runden (ca. 8 km)",
        answerB = "Zwolf Runden (ca. 14 km)",
        answerC = "Fuenf Runden (ca. 6 km)",
        answerD = "Zehn Runden (ca. 12 km)",
        correctAnswer = 0,
        explanation = "Die Standardlaenge eines Rennens im Circus Maximus betrug sieben Runden (Missus), wobei jede Runde etwa 1.150 Meter lang war – insgesamt rund 8 km. Zur Zaehlung dienten sieben bewegliche Delfine und Eier, die nach jeder Runde umgeklappt wurden.",
        difficulty = 5,
        funFact = "Der Circus Maximus fasste bis zu 250.000 Zuschauer und war damit das groesste Sportstadion der Geschichte. An Renntagen wurden bis zu 24 Rennen pro Tag veranstaltet – die Quadrigae (Vierspanner) rasten dabei mit bis zu 60 km/h durch die Kurven."
    ),

    // Question 4 – Ancient Olympics: Pankration forbidden moves
    Question(
        categoryId = 6,
        questionText = "Welche zwei Techniken waren beim antiken Pankration (olympischer Allkampf) verboten?",
        answerA = "Schlaege in die Leistengegend und Wuerfe ueber die Schulter",
        answerB = "Beissen und Augen ausstechen",
        answerC = "Wuergen und Tritte gegen das Knie",
        answerD = "Haarziehen und Bisse in die Ohren",
        correctAnswer = 1,
        explanation = "Das einzige Regelwerk des Pankration verbot lediglich Beissen (Dakno) und das Ausstechen der Augen (Oryssein). Alle anderen Techniken – Wuergen, Treten, Armbrechen, Schlaege – waren erlaubt. Der Wettkampf endete erst durch Aufgabe, Bewusstlosigkeit oder Tod.",
        difficulty = 5,
        funFact = "Arrhichion von Phigalia gewann 564 v. Chr. das Pankration posthum: Sein Gegner gab auf, genau in dem Moment als Arrhichion an einem Wuergehalt starb. Da die Aufgabe zuerst signalisiert wurde, wurde der tote Arrhichion zum Olympioniken erklaert."
    ),

    // Question 5 – Ancient Olympics: Origin myth
    Question(
        categoryId = 6,
        questionText = "Welches mythologische Ereignis gilt laut antiker Quelle (Pindar) als Ursprung der Olympischen Spiele?",
        answerA = "Herakles gruendete die Spiele nach dem Sieg ueber den Nemaeischen Loewen",
        answerB = "Pelops besiegte Koenig Oinomaos im Wagenrennen und gruendete die Spiele zu Ehren des Zeus",
        answerC = "Zeus besiegte Kronos auf dem Olymp und befahl die Spiele als jaehrliches Fest",
        answerD = "Iphitos von Elis stiftete die Spiele als Friedenspakt mit Sparta auf Geheis Apollons",
        correctAnswer = 1,
        explanation = "Laut Pindar (Olympische Ode 1) gruendete Pelops die Spiele nach seinem Sieg ueber Koenig Oinomaos von Pisa im Wagenrennen. Er gewann die Hand von Hippodameia und etablierte das Fest zu Ehren des Zeus in Olympia. Die historische Gruendung wird jedoch oft Iphitos (884 v. Chr.) zugeschrieben.",
        difficulty = 5,
        funFact = "Oinomaos hatte 13 Freier seiner Tochter im Wagenrennen besiegt und getoetet, bevor Pelops ihn durch Bestechung seines Wagenlenkers Myrtilos besiegte. Als Pelops Myrtilos anschliessend ins Meer warf, verfluchte dieser die Pelopiden – ein Fluch, der laut Mythos die Tragoedie des Atreiden-Hauses ausloeste."
    ),

    // Question 6 – Ancient Olympics: Ekecheiria duration
    Question(
        categoryId = 6,
        questionText = "Wie lange dauerte die Ekecheiria (Olympischer Gottesfriede) der antiken Spiele und welche Strafmassnahme drohte bei Verstoss?",
        answerA = "30 Tage – der verletzende Stadtstaat verlor das Stimmrecht im Amphiktyonischen Bund",
        answerB = "Ein Monat vor und nach den Spielen – Geldbussen und Ausschluss kuenftiger Athleten",
        answerC = "Drei Monate vor den Spielen – Geldstrafe an Zeus und Ausschluss fuer eine Olympiade",
        answerD = "Sechs Wochen – der Stadtstaat wurde vom naechsten Orakel zu Delphi verflucht",
        correctAnswer = 2,
        explanation = "Die Ekecheiria galt drei Monate vor den Spielen und schirmte Athleten, Zuschauer und Gesandte auf dem Weg nach Olympia ab. Verletzer mussten eine Geldstrafe an den Zeustempel zahlen und der verletzte Stadtstaat durfte keine Athleten zur naechsten Olympiade entsenden.",
        difficulty = 5,
        funFact = "Sparta wurde 420 v. Chr. von der Teilnahme ausgeschlossen, weil es Elis (den Austragungsort) waehrend der Ekecheiria angegriffen hatte. Die Spartaner zahlten die Strafe nicht und wurden tatsaechlich ausgesperrt – ein beispielloser diplomatischer Vorfall in der antiken Welt."
    ),

    // Question 7 – Ancient Olympics: Diaulos distance
    Question(
        categoryId = 6,
        questionText = "Was ist die genaue Distanz des Diaulos, der zweitaeltesten olympischen Laufdisziplin, und seit welchem Jahr war sie olympisch?",
        answerA = "400 Meter (2 Stadien), seit 720 v. Chr.",
        answerB = "384 Meter (2 Stadien), seit 724 v. Chr.",
        answerC = "200 Meter (1 Stadion), seit 776 v. Chr.",
        answerD = "600 Meter (4 Stadien), seit 708 v. Chr.",
        correctAnswer = 1,
        explanation = "Der Diaulos betrug zwei Stadien (ca. 384 Meter) und wurde 724 v. Chr. bei der 14. Olympiade eingefuehrt. Ein olympisches Stadion mass 192,27 Meter – die Laenge des Stadions in Olympia. Beim Diaulos mussten die Laeufer an einem Wendepfosten umkehren.",
        difficulty = 5,
        funFact = "Die Wendung beim Diaulos war keine Kurve wie in modernen Stadien, sondern eine abrupte Kehre um einen Pfosten (Kampteres). Technisch versierte Laeufer lernten die Kunst des schnellen Drehens, ohne das Gleichgewicht zu verlieren – Stuerze waren haeufig und brachten oft Schmutz von der Laufbahn."
    ),

    // Question 8 – Ancient Roman gladiators: Munera frequency
    Question(
        categoryId = 6,
        questionText = "Welche seltene Kombination aus gladiatorischen Kaempfertypen stand beim 'Munus Legitimum' im Kaiserzeitlichen Rom an erster Stelle der Prestige-Hierarchie?",
        answerA = "Secutor gegen Retiarius – Netz und Dreizack gegen Schild und Schwert",
        answerB = "Myrmillo gegen Thrax – Halbmond-Schild gegen den grossen Legionaersschild",
        answerC = "Andabata gegen Laquearius – beide blind kaempfend mit Lasso und Speeren",
        answerD = "Samnite gegen Hoplomachus – der klassische Schaukampf des fruehen Roms",
        correctAnswer = 0,
        explanation = "Das Paar Secutor (Verfolger) vs. Retiarius (Netzkampfer) galt als das prestigetraechtigste und symbolisch reichste Paar. Der Retiarius kaempfte ungehelmt mit Netz, Dreizack und Dolch; der Secutor mit Helm, Schild und Gladius. Die Asymmetrie machte das Spektakel dramatisch.",
        difficulty = 5,
        funFact = "Der Retiarius war gesellschaftlich der am wenigsten respektierte Gladiatortyp – wer ohne Helm kaempfte, zeigte sein Gesicht der Menge, was als unmaennlich galt. Gleichzeitig waren die Retiarii die mobilsten Kaempfer und hatten statistisch die hoechste Ueberlebenschance."
    ),

    // ── Sportphysiologie / Genetik (8) ───────────────────────────────────────

    // Question 9 – ACTN3 gene
    Question(
        categoryId = 6,
        questionText = "Das ACTN3-Gen kodiert fuer Alpha-Actinin-3. Welche Variante (Genotyp) ist bei Weltklasse-Sprinter ueberproportional haeufig und warum?",
        answerA = "RR-Genotyp (beide Allele funktionsfaehig) – produziert mehr Alpha-Actinin-3 in Typ-II-Schnellzuckfasern",
        answerB = "XX-Genotyp (beide Allele non-funktional) – erhoehte mitochondriale Dichte durch kompensatorische Expression",
        answerC = "RX-Genotyp (heterozygot) – optimales Gleichgewicht zwischen Schnell- und Langsamzuckfasern",
        answerD = "XX-Genotyp mit hoher AMPK-Aktivitaet – bessere ATP-Synthese waehrend explosiver Belastung",
        correctAnswer = 0,
        explanation = "Der RR-Genotyp des ACTN3-Gens produziert funktionsfaehiges Alpha-Actinin-3, das ausschliesslich in schnellen Typ-II-Muskelfasern vorkommt. Es stabilisiert den Z-Scheiben-Komplex des Sarkomers und erhoecht die Kraftuebertragung bei explosiven Kontraktionen. Studien zeigen, dass der RR-Genotyp bei Elite-Sprintern signifikant ueberrepraesentiert ist.",
        difficulty = 5,
        funFact = "Rund 18% der weissen Europaeer und Nordamerikaner sind XX-homozygot und produzieren kein Alpha-Actinin-3. Diese Menschen koennen trotzdem Sport treiben, aber ihr genetisches Potenzial fuer Sprintdisziplinen ist statistisch geringer. Das XX-Allel scheint evolutionaer selektiert worden zu sein – wahrscheinlich wegen Vorteilen bei Ausdauerleistungen in kaelten Klimazonen."
    ),

    // Question 10 – VO2max genetic heritability
    Question(
        categoryId = 6,
        questionText = "Wie hoch schaetzt die HERITAGE-Familienstudie die Erblichkeit (Heritabilitaet) der VO2max-Reaktion auf Ausdauertraining?",
        answerA = "Etwa 25% – Umweltfaktoren dominieren die Trainingsanpassung",
        answerB = "Etwa 47% – nahezu gleiche Anteile genetisch und umweltbedingt",
        answerC = "Etwa 72% – Genetik bestimmt hauptsaechlich die Trainierbarkeit",
        answerD = "Etwa 15% – VO2max ist praktisch vollstaendig trainingsabhaengig",
        correctAnswer = 1,
        explanation = "Die HERITAGE Family Study (Bouchard et al.) untersuchte 481 Personen aus 98 Familien und fand, dass die Trainings-Reaktion der VO2max eine Heritabilitaet von rund 47% aufweist. Das bedeutet: Wer seinen VO2max durch Training stark verbessern kann ('High Responder') oder kaum ('Low Responder'), haengt zu fast gleichen Teilen von Genen und Umwelt ab.",
        difficulty = 5,
        funFact = "In der HERITAGE-Studie verbesserten manche Teilnehmer ihren VO2max nach 20 Wochen Training um 1000 ml/min, andere kaum um 50 ml/min – bei identischem Trainingsprogramm. 'Low Responder' sind keine faulen Sportler, sondern genetisch benachteiligte Anpasser."
    ),

    // Question 11 – Lactate threshold physiology
    Question(
        categoryId = 6,
        questionText = "Was ist physiologisch der Hauptgrund dafuer, dass gut trainierte Ausdauersportler eine hoehere Laktatthreshold-Leistung haben als Untrainierte?",
        answerA = "Hoehere Pufferkapazitaet des Blutes durch mehr Hbikarbonate und erhoehte Erythrozytenzahl",
        answerB = "Groessere Mitochondriendichte und hoehere Aktivitaet der oxidativen Enzyme in Typ-I-Fasern ermoeglicht mehr aerobe ATP-Synthese bei gleicher Last",
        answerC = "Niedrigere maximale Herzfrequenz reduziert den Sauerstoffbedarf pro Herzschlag",
        answerD = "Dickere Muskelfasern reduzieren die Laktatdiffusion ins Blut durch verkuerzten Diffusionsweg",
        correctAnswer = 1,
        explanation = "Ausdauertraining erhoehlt die Mitochondriendichte in Skelettmuskelzellen und steigert die Aktivitaet oxidativer Enzyme (Zitratsynthase, SDH, etc.). So koennen mehr Pyruvat und Fettsaeuren aerob verstoffwechselt werden, bevor der Muskel auf anaerobe Glykolyse und damit Laktatproduktion angewiesen ist. Die Laktatthreshold verschiebt sich zu hoeheren Intensitaeten.",
        difficulty = 5,
        funFact = "Die Laktatthreshold (auch anaerobe Schwelle, LT2) ist fuer Ausdauerleistung prognostisch wertvoller als der VO2max selbst. Lance Armstrong hatte einen aehnlichen VO2max wie andere Tour-Sieger, aber konnte prozentual viel naeher an seinem Maximum dauerhaft fahren – ein Zeichen ueberlegener Laktatthreshold."
    ),

    // Question 12 – EPO mechanism
    Question(
        categoryId = 6,
        questionText = "Ueber welchen molekularen Signalweg reguliert Hypoxie die endogene Erythropoetin-Produktion in der Niere?",
        answerA = "HIF-1alpha wird unter Hypoxie nicht mehr durch PHD-Enzyme hydroxyliert und damit nicht durch VHL zum Abbau markiert, akkumuliert und aktiviert das EPO-Gen",
        answerB = "VEGF aktiviert STAT3-Phosphorylierung in Nierentubuluszellen, was direkt die EPO-Transkription induziert",
        answerC = "mTORC1 hemmt unter Hypoxie den 4E-BP1-Inhibitor, was die EPO-Translation massiv steigert",
        answerD = "Niedrige O2-Spannung aktiviert AMPK, das via PGC-1alpha die EPO-Promotorregion demethyliert",
        correctAnswer = 0,
        explanation = "Unter Normoxie hydroxylieren Prolyl-Hydroxylase-Domainproteine (PHDs) den Transkriptionsfaktor HIF-1alpha, der dann durch das Von-Hippel-Lindau-Protein (VHL) fuer die Proteasom-Degradation ubiquitiniert wird. Unter Hypoxie sind PHDs inaktiv, HIF-1alpha akkumuliert, dimerisiert mit HIF-1beta und bindet an Hypoxia Response Elements – darunter das EPO-Gen in peritubulaeren Zellen der Niere.",
        difficulty = 5,
        funFact = "Der HIF-Signalweg wurde 2019 mit dem Nobelpreis fuer Medizin ausgezeichnet (Semenza, Ratcliffe, Kaelin). Die Entdeckung erklaerte nicht nur Hoehenanpassung, sondern auch Tumorwachstum, da Krebszellen den gleichen Weg nutzen, um Blutgefaessbildung zu stimulieren."
    ),

    // Question 13 – Muscle fiber type genetics
    Question(
        categoryId = 6,
        questionText = "Welches Protein bestimmt primaer die Klassifizierung einer Muskelfaser als Typ I, IIa oder IIx?",
        answerA = "Die Isoform der schweren Kette des Myosins (MHC – Myosin Heavy Chain)",
        answerB = "Die Troponin-T-Isoform, die die Kalzium-Sensitivitaet der Myofibrillen bestimmt",
        answerC = "Die Konzentration von Myoglobin, das den Sauerstoffspeicher der Faser bildet",
        answerD = "Die Aktivitaet der Kreatinkinase, die die ATP-Regenerationsrate kontrolliert",
        correctAnswer = 0,
        explanation = "Muskelfasertypen werden anhand der Myosin-Schwerketten-Isoform (MHC) klassifiziert: MHC-I (langsam-oxidativ, Typ I), MHC-IIa (schnell-oxidativ-glykolytisch, Typ IIa) und MHC-IIx (schnell-glykolytisch, Typ IIx). Die ATPase-Aktivitaet der jeweiligen MHC-Isoform bestimmt die Kontraktionsgeschwindigkeit der Faser.",
        difficulty = 5,
        funFact = "Beim Menschen machen Typ-I-Fasern je nach Muskel und Trainingsstatus 40-60% aus. Spitzenathleten koennen die Fasertyp-Verteilung durch Training nur begrenzt verschieben (IIx zu IIa ist trainierbar), aber der grundlegende I:II-Anteil ist genetisch festgelegt."
    ),

    // Question 14 – Heat acclimatization mechanism
    Question(
        categoryId = 6,
        questionText = "Welche drei physiologischen Hauptanpassungen vollziehen sich innerhalb von 10-14 Tagen Hitzeakklimatisation bei Sportlern?",
        answerA = "Erhoehtes Plasmavolumen, erniedriger Schwellbeginn-Temperatur, hoehere maximale Schweissrate",
        answerB = "Erhoehte Haemoglobin-Konzentration, niedrigere Ruheherzfrequenz, erhoehte Laktatproduktion",
        answerC = "Verdickung der Haut, reduzierte Nierendurchblutung, Hypertrophie der Schweissdruesenzellen",
        answerD = "Erhoehung der Koerperkerntemperatur-Sollwert, Vasokonstriktion der Haut, Erhoehung des Salzgehalts im Schweiss",
        correctAnswer = 0,
        explanation = "Die drei Hauptanpassungen bei Hitzeakklimatisation sind: (1) Zunahme des Plasmavolumens um 5-12% durch Aldosteron- und AVP-Freisetzung, was die Herzarbeit verbessert; (2) frueherer Schwitzstart bei niedrigerer Koerperkerntemperatur; (3) erhoehte maximale Schweissrate bis 2-3 Liter/Stunde. Zusaetzlich sinkt der Salzgehalt des Schweisses durch aldosteronvermittelte Natriumrueckresorption.",
        difficulty = 5,
        funFact = "Die Erhoehung des Plasmavolumens bei Hitzeakklimatisation aehnelt dem Effekt einer Bluttransfusion – mehr zirkulierendes Blut verbessert den Sauerstofftransport und die Thermoregulation. Tour-de-France-Fahrer nutzen dieses Wissen, indem sie Rennen in heissen Laendern als natuerliches 'Blut-Doping' betrachten."
    ),

    // Question 15 – EPAS1 gene in Tibetans
    Question(
        categoryId = 6,
        questionText = "Welche genetische Besonderheit bei Tibetern erklaert ihre Hoehenanpassung, und welche Quelle hatte dieses Gen laut neuerer Forschung?",
        answerA = "Eine Duplikation des VEGF-Gens verdoppelt die Gefaessdichte, urspruenglich aus einer Denisova-Introgression",
        answerB = "Eine Variante des EPAS1-Gens (HIF-2alpha) haelt das Haemoglobin trotz Hypoxie niedrig – introgrediert von Denisova-Homininen",
        answerC = "Eine Mutation im VHL-Gen verlaengert HIF-1alpha-Halbwertszeit, aus einer Neandertaler-Hybridisierung",
        answerD = "Eine ACTN3-aehnliche Variante optimiert den Muskelstoffwechsel fuer niedrigen Sauerstoff, autochthon selektiert",
        correctAnswer = 1,
        explanation = "Tibeter tragen eine protektive EPAS1-Variante (HIF-2alpha), die paradoxerweise die Haemat-Okritsteigerung unter Hypoxie unterdruckt. Waehrend andere Hochlandbewohner Polyzythaemie entwickeln (erhoeher Hkt = mehr Viskositaet = Herzinfarktrisiko), bleibt der Hkt der Tibeter normal. Huerta-Sánchez et al. (2014) zeigten, dass diese Variante von Denisova-Homininen in das tibetische Erbgut introgriert wurde.",
        difficulty = 5,
        funFact = "Die EPAS1-Variante ist das klarste Beispiel fuer Positiv-Selektion im Menschen in historischer Zeit: In nur ~3.000 Jahren wurde sie von fast 0% auf ~87% Frequenz in der tibetischen Population selektiert – einer der schnellsten bekannten Selektionsprozesse beim Menschen."
    ),

    // Question 16 – Muscle damage and DOMS mechanism
    Question(
        categoryId = 6,
        questionText = "Was ist nach aktuellem wissenschaftlichen Kenntnisstand der primaere Mechanismus des verzoegerten Muskelkaters (DOMS), der 24-72 Stunden nach exzentrischer Belastung auftritt?",
        answerA = "Anhaeufung von Milchsaeure in den Muskelfasern, die Nozizeptoren direkt reizt",
        answerB = "Mikrostrukturelle Schaeden an Z-Scheiben und Sarkomeren loesen Entzuendungskaskaden aus, die Nozizeptoren sensibilisieren",
        answerC = "Dehydrierung der Muskelfaserzellen durch osmotischen Stress beim Training",
        answerD = "Rissbildung in der Faszie durch Schwellung der Muskelfasern nach dem Training",
        correctAnswer = 1,
        explanation = "Exzentrische Kontraktionen verursachen selektive Schaeden an Z-Scheiben und Sarkomermyofilamenten. Dies aktiviert Entzuendungsmediatoren (Prostaglandine, Bradykinin, IL-6), die Muskel-Nozizeptoren (Typ III und IV Afferenzen) sensibilisieren und den typischen Muskelkater ausloesen. Laktat ist bereits nach 1-2 Stunden abgebaut und kann DOMS nicht erklaeren.",
        difficulty = 5,
        funFact = "Der Repeated-Bout-Effect ist eines der faszinierendsten Phaenomene der Sportphysiologie: Eine einzige Einheit exzentrischer Belastung schuetzt die Muskeln fuer Wochen bis Monate vor schwerem DOMS bei identischer Belastung. Der genaue Mechanismus – epigenetische Adaptation, strukturelle Verstaerkung oder neuraler Schutz – ist noch nicht vollstaendig geklaert."
    ),

    // ── Olympische Raritaeten (8) ─────────────────────────────────────────────

    // Question 17 – Art competitions at Olympics
    Question(
        categoryId = 6,
        questionText = "Von 1912 bis 1948 wurden bei den Olympischen Spielen Kunstwettbewerbe ausgetragen. In welchen fuenf Kategorien wurden Medaillen vergeben?",
        answerA = "Malerei, Skulptur, Architektur, Musik, Literatur",
        answerB = "Zeichnung, Skulptur, Reliefkunst, Musik, Dichtung",
        answerC = "Malerei, Skulptur, Architektur, Dramatik, Fotografie",
        answerD = "Malerei, Gravur, Architektur, Symphonie, Novelle",
        correctAnswer = 0,
        explanation = "Coubertin, selbst unter dem Pseudonym Georges Hohrod Teilnehmer, fuegte 1912 Kunstwettbewerbe in fuenf Kategorien hinzu: Architektur, Bildhauerei, Malerei, Musik und Literatur. Alle Werke mussten Sport als Thema haben. Die Wettbewerbe wurden nach 1948 abgeschafft, weil die meisten Teilnehmer Profis waren.",
        difficulty = 5,
        funFact = "Pierre de Coubertin selbst gewann 1912 unter dem Pseudonym 'Georges Hohrod und M. Eschbach' eine Goldmedaille in der Kategorie Literatur fuer seine 'Ode au Sport'. Er verschwieg seine Autorenschaft, um den Anschein eines Interessenkonflikts zu vermeiden – der IOC-Praesident als Olympiasieger."
    ),

    // Question 18 – Olympics: Solo synchronized swimming
    Question(
        categoryId = 6,
        questionText = "Welche paradox erscheinende olympische Disziplin war von 1984 bis 1992 bei den Olympischen Spielen vertreten und wurde dann aus dem Programm gestrichen?",
        answerA = "Einzel-Synchronschwimmen (Solo Synchronized Swimming)",
        answerB = "Einzel-Wassertanzen (Solo Water Dancing)",
        answerC = "Synchron-Turmspringen (Synchronized Platform Diving) als Einzel",
        answerD = "Rhytmische Sportgymnastik – Einzelkeulen (Solo Club Gymnastics)",
        correctAnswer = 0,
        explanation = "Das Solo-Synchronschwimmen war von 1984 (Los Angeles) bis 1992 (Barcelona) olympisch. Eine Sportlerin synchronisierte sich – mit sich selbst. Die Bewertung basierte auf Technik, Choreographie und Uebereinstimmung mit der Musik. Es wurde gestrichen, weil es als weniger zuschauerwirksam galt als Duo und Team.",
        difficulty = 5,
        funFact = "Tracie Ruiz (USA) gewann 1984 sowohl Gold im Solo als auch im Duett – damit war sie die erste und einzige Doppel-Olympiasiegerin im Synchronschwimmen. Beim Solo bewertet das Kampfgericht, wie gut die Sportlerin die Musik 'synchron' interpretiert, was philosophisch bedeutet: Synchronisation mit der eigenen Vorstellung der Musik."
    ),

    // Question 19 – Olympics: Tug of war
    Question(
        categoryId = 6,
        questionText = "Tauziehen war von 1900 bis 1920 olympisch. Welches Land gewann die meisten Goldmedaillen in dieser Disziplin und wie viele waren es?",
        answerA = "Grossbritannien – 5 Goldmedaillen",
        answerB = "USA – 3 Goldmedaillen",
        answerC = "Schweden – 4 Goldmedaillen",
        answerD = "Grossbritannien – 3 Goldmedaillen",
        correctAnswer = 0,
        explanation = "Grossbritannien dominierte das olympische Tauziehen mit 5 Goldmedaillen: 1900 (gemeinsam mit einem Mix-Team), 1904, 1908, 1912 und 1920. Beim Tauziehen 1908 traten zwei britische Polizeimannschaften gegeneinander an – City of London Police besiegte Liverpool Police im Finale.",
        difficulty = 5,
        funFact = "Der Tauziehen-Skandal von 1908: Das US-Team protestierte, weil das britische Liverpool-Police-Team Stiefel mit Absaetzen trug, die gegen die Wettkampfregeln verstiessen. Das Schiedsgericht wies den Protest zurueck. Tauziehen wird noch heute in Deutschland und vielen Laendern professionell betrieben und strebt eine Rueckkehr ins olympische Programm an."
    ),

    // Question 20 – Olympics: Eddie the Eagle
    Question(
        categoryId = 6,
        questionText = "Eddie 'The Eagle' Edwards wurde nach den Olympischen Spielen 1988 das Subjekt einer IOC-Regelaenderung. Wie lautete diese Regel und warum wurde sie eingefuehrt?",
        answerA = "Die 'A-Standard-Regel': Alle Athleten muessen mindestens 50% der Weltrekord-Leistung erreichen, eingefuehrt um kommerzielle Teilnahme ohne sportliche Qualifikation zu verhindern",
        answerB = "Die 'Eddie the Eagle Rule': Athleten muessen in ihrer Sportart innerhalb der besten 50% des WM-Feldes rangieren oder einen internationalen Wettkampf absolviert haben",
        answerC = "Die 'Nationality Rule': Athleten muessen mindestens 3 Jahre Staatsbuerger des Landes sein, fuer das sie starten",
        answerD = "Die 'Minimum-Qualifikations-Regel': Weltverbeaende duerfen nur Athleten nominieren, die eine Mindest-Bewertungspunktezahl erreicht haben",
        correctAnswer = 1,
        explanation = "Nach Calgary 1988 einfuehrte das IOC die 'Eddie the Eagle Rule' (offiziell: Bylaw to Rule 45), die verlangt, dass Athleten entweder in den Top 50% eines internationalen Wettbewerbs rangieren oder im vorherigen Jahr an einem Wettkampf teilgenommen haben. Sie sollte sicherstellen, dass Olympiateilnehmer ein Mindestmass an sportlichem Niveau erreichen.",
        difficulty = 5,
        funFact = "Eddie Edwards sprang in Calgary auf Platz 55 (letzter) und 58 (letzter) – mit fast 20 Metern Rueckstand auf den Sieger. Dennoch wurde er zu einem der beliebtesten Olympioniken aller Zeiten. Er finanzierte seine Teilnahme selbst, naehte Wimpern unter seine Brille, weil seine Skibrille mit seiner normalen Brille nicht kompatibel war."
    ),

    // Question 21 – Olympics: Shooting at live pigeons
    Question(
        categoryId = 6,
        questionText = "Welche olympische Disziplin im Jahr 1900 in Paris ist die einzige in der Geschichte der modernen Spiele, bei der Tiere getoetest wurden?",
        answerA = "Wildenten-Jagdwettbewerb im Bois de Boulogne",
        answerB = "Lebend-Taubenschiessen (Live Pigeon Shooting)",
        answerC = "Hirschjagd-Simulation mit echten Tieren als Ziele",
        answerD = "Hasen-Kurs-Schiessen mit echten Hasen",
        correctAnswer = 1,
        explanation = "Das Lebend-Taubenschiessen 1900 in Paris ist das einzige olympische Ereignis, bei dem Tiere getoetest wurden. Leon de Lunden (Belgien) gewann Gold, indem er 21 Tauben abschoss. Insgesamt wurden schaetzungsweise 300 Tauben getoedet. Die Veranstaltung wurde nie wiederholt und fortan durch Tontaubenschiessen ersetzt.",
        difficulty = 5,
        funFact = "Die Olympischen Spiele 1900 in Paris gelten als die chaotischsten der Geschichte. Sie fanden als Nebenprogramm der Weltausstellung statt, dauerten ueber 5 Monate und viele Athleten wussten nicht einmal, dass sie an olympischen Wettkampfen teilnahmen. Die offizielle Medaillenstatistik dieser Spiele ist bis heute umstritten."
    ),

    // Question 22 – Olympics: Marathon 1904 scandal
    Question(
        categoryId = 6,
        questionText = "Was geschah beim olympischen Marathon 1904 in St. Louis, das ihn zum groteskesten Rennen der Olympiageschichte machte?",
        answerA = "Der urspruengliche Sieger Fred Lorz hatte die Haelfte der Strecke per Auto zurueckgelegt und wurde disqualifiziert; der echte Sieger Thomas Hicks erhielt Rattengift und Brandy als Dopingmittel",
        answerB = "Alle 32 Starter absolvierten die falsche Route; das Rennen wurde wiederholt, aber nur 14 Athleten nahmen erneut teil",
        answerC = "Felix Carvajal lief in Strassenschuhen und aß Aepfel am Streckenrand, was ihm Magenprobleme bereitete, wurde aber Vierter",
        answerD = "Nur A und C – B ist falsch",
        correctAnswer = 0,
        explanation = "Der Marathon 1904 war ein Fiasko: Fred Lorz (USA) kam zuerst ins Ziel, hatte aber 17 Meilen per Auto mitgenommen (er behauptete spaeter, es sei ein Scherz). Thomas Hicks (USA) gewann wirklich, aber sein Betreuer gab ihm Strychnin (Rattengift) gemischt mit Brandy als Aufputschmittel. Hicks halluzinierte kurz vor dem Ziel, gewann aber das Rennen.",
        difficulty = 5,
        funFact = "Felix Carvajal aus Kuba lief in Strassenkleidung und Lederschuhen, machte am Streckenrand Halt, um Aepfel zu essen (die er vermutlich von einem Zuschauer stahl), bekam davon Magenprobleme – und wurde trotzdem noch Vierter. Zwei suedafrikanische Maenner, Tswana-Voelkslaeufern, liefen barfuss und wurden Neunte und Zwölfte."
    ),

    // Question 23 – Olympics: Croquet and Polo
    Question(
        categoryId = 6,
        questionText = "Welcher Sport war nur einmalig olympisch (1900) und hatte ausschliesslich franzoesische Teilnehmer, weil kein anderes Land Teams entsandte?",
        answerA = "Croquet (Krocketspiel)",
        answerB = "Basque Pelota (baskisches Ballspiel)",
        answerC = "Roque (amerikanische Krocket-Variante)",
        answerD = "Real Tennis (Koenigliches Tennis)",
        correctAnswer = 0,
        explanation = "Croquet wurde 1900 in Paris olympisch ausgetragen – als einzige Nation entsandte Frankreich Teilnehmer. Die Wettkampfe fanden auf einem Privatgelande in Ile de la Cite statt, und laut Berichten war die gesamte Veranstaltung so desorganisiert, dass es moeglicherweise nur einen einzigen zahlenden Zuschauer gab: einen Mann aus England.",
        difficulty = 5,
        funFact = "1900 war die einzige Olympiade, bei der Frauen in einem olympischen Wettkampf gewannen. Helene de Pourtalès (Schweiz) gewann im Segeln und Charlotte Cooper (GB) im Tennis – beides allerdings nicht in Croquet, obwohl Frauen dort als Offizielle auftraten."
    ),

    // Question 24 – Olympics: North Korea and South Korea joint team
    Question(
        categoryId = 6,
        questionText = "Bei welchen Olympischen Spielen marschierten Nord- und Suedkorea erstmals gemeinsam unter einer Flagge ein, und welche Flagge nutzten sie dabei?",
        answerA = "2000 Sydney – die koreanische Halbinsel-Flagge (blaue Silhouette auf weissem Grund)",
        answerB = "1988 Seoul – die suedkoreanische Flagge Taegukgi",
        answerC = "2004 Athen – die Flagge der koreanischen Halbinsel mit goldenen Olivenzweigen",
        answerD = "2002 Busan Asian Games – eine gemeinsame Flagge mit dem Sternenbanner",
        correctAnswer = 0,
        explanation = "2000 in Sydney marschierten Athleten aus Nord- und Suedkorea erstmals gemeinsam in die Eroeffnungsfeier ein – unter einer gemeinschaftlichen 'Vereinigte Korea'-Flagge, die die blaue Silhouette der koreanischen Halbinsel auf weissem Hintergrund zeigt. Es war ein historischer Moment, wenngleich sie getrennt antraten.",
        difficulty = 5,
        funFact = "2018 bei den Winterspielen in Pyeongchang starteten Nord- und Suedkorea gemeinsam im Eishockey der Frauen und beim Curling – unter demselben Vereinigungs-Symbol. Das Eishockey-Team aus beiden Laedern verlor alle Spiele, wurde aber von der ganzen Welt gefeiert."
    ),

    // ── Sportsoziologie (6) ───────────────────────────────────────────────────

    // Question 25 – Stacking in American Football
    Question(
        categoryId = 6,
        questionText = "Was bezeichnet der soziologische Begriff 'Stacking' im professionellen Mannschaftssport?",
        answerA = "Die Praxis von Klubs, mehrere Star-Spieler auf einmal durch teure Transfers zu verpflichten",
        answerB = "Die ueberproportionale Konzentration von Athleten bestimmter ethnischer Gruppen auf bestimmten Positionen, die als zentraler/peripher gelten",
        answerC = "Das Phaenemonen, dass Mannschaften Spieler 'stapeln' (horten), ohne sie einzusetzen, um Konkurrenz auszuschalten",
        answerD = "Die systematische Benachteiligung von Spielern aus strukturschwachen Regionen beim Scouting",
        correctAnswer = 1,
        explanation = "Stacking (nach Edwards, 1973) beschreibt die ethnische Segregation von Spielpositionen: Bestimmte Ethnien werden ueberproportional auf peripheren (wenig entscheidungsintensiven) Positionen eingesetzt, waehrend zentralere Positionen ueberproportional von Angehoerigen der dominanten Gruppe besetzt werden. Im NFL ist es historisch: Weisse QB dominieren, schwarze Spieler dominieren auf Wide Receiver, Cornerback, etc.",
        difficulty = 5,
        funFact = "Die Quarterback-Position war jahrzehntelang im amerikanischen Football fast ausschliesslich weissen Spielern vorbehalten. Erst in den 1990er und 2000er Jahren aenderte sich dies langsam. Patrick Mahomes, Lamar Jackson und andere haben das Bild grundlegend veraendert – ihr Erfolg hat den soziologischen Begriff 'Stacking' in dieser Form zunehmend in Frage gestellt."
    ),

    // Question 26 – Bosman ruling
    Question(
        categoryId = 6,
        questionText = "Was genau entschied der Europaeische Gerichtshof im Bosman-Urteil von 1995 (Rechtssache C-415/93) und wie veraenderte es den Fussball?",
        answerA = "Transfers zwischen EU-Klubs wurden generell kostenlos, da Vertragsfreiheit vor Vereinsrechten steht",
        answerB = "Spieler nach Vertragsende duerfen abloesfrei zu anderen EU-Klubs wechseln; Auslaenderregeln fuer EU-Buerger verstiessen gegen die Freizuegigkeit der Arbeitnehmer",
        answerC = "Klubs muessen Spieler nach 5 Jahren Vertragszeit unbefristet weiterbeschaeftigen oder entschaedigen",
        answerD = "Der EuGH verpflichtete die UEFA, ein europaweites Salary-Cap-System einzufuehren",
        correctAnswer = 1,
        explanation = "Der EuGH entschied: (1) Spieler koennen nach Vertragsende abloesfrei zu einem Klub in einem anderen EU-Mitgliedsstaat wechseln; (2) Auslaenderklauseln, die EU-Buerger bevorzugen, verstiessen gegen Art. 48 EG-Vertrag (Arbeitnehmerfreizuegigkeit). Das Urteil revolutionierte den europaeischen Fussballmarkt durch massiv gestiegene Spielergehaelter und Abloesefreiheit.",
        difficulty = 5,
        funFact = "Jean-Marc Bosman, der Klaeger, war ein belgischer Mittelfeldspieler beim RFC Lüttich, der den Wechsel zum franzoesischen Verein Dunkerque nicht vollziehen konnte, weil sein Klub eine zu hohe Abloesesuumme forderte. Nach jahrelangem Rechtsstreit hatte Bosman mit 31 Jahren kaum noch eine Karriere, waehrend sein Fall das Weltfussball-System dauerhaft veraenderte."
    ),

    // Question 27 – Black Power salute 1968
    Question(
        categoryId = 6,
        questionText = "Welche genaue sportsoziologische Botschaft wollten Tommie Smith und John Carlos mit ihrer Geste bei der Siegerehrung der 200-Meter-Laeufer 1968 in Mexiko-Stadt vermitteln?",
        answerA = "Protest gegen die Teilnahme Suedafrikas an den Olympischen Spielen trotz Apartheid",
        answerB = "Symbolische Unterstuetzung der Olympic Project for Human Rights: Armut, Rassismus und internationalem Protest gegen US-Apartheidaequivalente",
        answerC = "Persoenliches Statement gegen den Vietnam-Krieg und die US-Armee",
        answerD = "Protestdemonstration fuer die Aufhebung des Amateurstatuts im olympischen Sport",
        correctAnswer = 1,
        explanation = "Smith und Carlos handelten im Rahmen des Olympic Project for Human Rights (OPHR, gegr. Harry Edwards). Die gesenkten Haupeter, schwarze Handschuhe und blosser Fuss symbolisierten Schwarze Armut, Rassismus und schwarze Einheit. Smith trug eine schwarze Halskette als Symbol fuer gelynchte Schwarze, Carlos offene Reissverschluss-Jacke fuer die Arbeiterklasse.",
        difficulty = 5,
        funFact = "Beide Athleten wurden daraufhin vom IOC disqualifiziert und des Olympischen Dorfes verwiesen. Nach ihrer Rueckkehr in die USA erlitten sie massive Drohungen und Einschuechterungen. Erst jahrzehnte spaeter wurden sie von der Sportwelt geehrt. Peter Norman, der australische Silbermedaillengewinner, trug ebenfalls ein OPHR-Abzeichen und unterstuezte die Geste – dafuer wurde er von Australien bis zu seinem Tod 2006 nicht begnadigt."
    ),

    // Question 28 – Sports and nationalism
    Question(
        categoryId = 6,
        questionText = "Eric Hobsbawm pragte den Begriff 'invented traditions' in Bezug auf Sport. Was meinte er damit konkret?",
        answerA = "Sportarten, die von Kolonialmachten erfunden wurden, um einheimische Bevoelkerungen zu kontrollieren und zu pazifizieren",
        answerB = "Rituale und Symbole (wie Nationalhymnen bei Siegerehrungen), die als 'uralt' oder 'natuerlich' dargestellt werden, aber in Wirklichkeit relativ recent konstruiert wurden, um nationale Identitaeten zu schaffen",
        answerC = "Falsche Ursprungsgeschichten von Sportarten, die Laendern Prestige verleihen sollen (z.B. Abner Doubledays Baseballl-Legende)",
        answerD = "Olympische Zeremonien, die antike Rituale imitieren, aber erst ab 1896 erfunden wurden",
        correctAnswer = 1,
        explanation = "Hobsbawm (1983, 'The Invention of Tradition') argumentierte, dass viele scheinbar alte Traditionen – Hymnen, Fahnen, Maskottchen, Rivalitaeten – vergleichsweise neu und gezielt konstruiert wurden, um nationale Gefuehle zu erzeugen. Sport ist ein Hauptfeld solcher 'invented traditions': Die Vorstellung, dass man 'fuer seine Nation' kaempft, ist eine moderne Konstruktion.",
        difficulty = 5,
        funFact = "Das deutsche 'Turnwesen' (Turnen) von Friedrich Ludwig Jahn (1811) ist ein Paradebeispiel: Es wurde explizit als Werkzeug des deutschen Nationalismus entwickelt, mit dem Ziel, koerperliche Fitness und nationale Identitaet zu verbinden, um Napoleon zu besiegen. 'Turnvater Jahn' gilt als Nationalheld – dabei war er hauptsaechlich ein Nationalisten-Politiker."
    ),

    // Question 29 – Sports media and gender
    Question(
        categoryId = 6,
        questionText = "Welchen Prozentsatz der gesamten Sportberichterstattung im Fernsehen entfielen laut Tucker Center-Studie (2013) auf den Frauensport in den USA?",
        answerA = "Etwa 4% – trotz massiv gestiegener Teilnahme seit Title IX",
        answerB = "Etwa 18% – proportional zur Zahl weiblicher Sportlerinnen",
        answerC = "Etwa 12% – mit steigender Tendenz durch soziale Medien",
        answerD = "Etwa 28% – durch Olympic-Begeisterung gestiegen",
        correctAnswer = 0,
        explanation = "Die Tucker Center-Studie (Cheryl Cooky et al., 2013) fand, dass Frauensport im US-amerikanischen TV-Sport nur etwa 4% der Berichterstattung erhielt – obwohl seit Title IX (1972) die Frauenteilnahme im Sport explodiert war. Spaetere Studien (2019) zeigten nur marginale Verbesserungen auf etwa 5,7%.",
        difficulty = 5,
        funFact = "Title IX des US-Bildungsgesetzes von 1972 verbot Geschlechterdiskriminierung in bildungsfinanzierten Programmen. Der direkte Effekt auf Frauensport war dramatisch: 1972 nahmen 295.000 Maedchen an High-School-Sport teil; 2016 waren es 3,4 Millionen. Trotzdem blieb die Medienberichterstattung fast unveraendert niedrig."
    ),

    // Question 30 – Norbert Elias und Sport
    Question(
        categoryId = 6,
        questionText = "Norbert Elias' Zivilisationstheorie postuliert eine Verbindung zwischen gesellschaftlichem Zivilisationsprozess und der Entwicklung moderner Sportarten. Wie lautet sein Kernargument?",
        answerA = "Sport ist ein Uebersetzungsraum, in dem archaische Aggressivitaet in gesellschaftlich akzeptable Form kanaslisiert wird und Gewalt zunehmend regelgebunden wird",
        answerB = "Der Kapitalismus hat Sport instrumentalisiert, um die Arbeiterklasse zu domestizieren und politisches Bewusstsein zu unterdruecken",
        answerC = "Moderne Sportarten entstanden durch den Rueckgang religioeses Rituals und ersetzen Opferfeste als kollektive Energieentladung",
        answerD = "Staatliche Regulierung und imperiale Expansion haben Sport global standardisiert und lokale Sporttraditionen verdraengt",
        correctAnswer = 0,
        explanation = "Elias ('Ueber den Prozess der Zivilisation', 1939; 'Quest for Excitement', 1986 mit Dunning) argumentiert: Im Zuge des staatlichen Gewaltmonopols wurde interpersonelle Gewalt zunehmend reguliert. Sport ist ein 'kontrollierter Decontrolling of Emotions' – ein Raum, wo begrenzte Erregung und kontrollierte Aggression gesellschaftlich toleriert wird. Sportregeln spiegeln den allgemeinen Zivilisationsprozess wider.",
        difficulty = 5,
        funFact = "Elias und Eric Dunning analysierten Fussballe und Rugby als Beispiele fuer den Zivilisationsprozess: Fruehes 'Folk Football' (mittelalterliches Strassenfussball) war extrem gewalttaetig und ungregelt; die Kodifizierung in Rugby (1845) und Fussball (1863) spiegelt die zunehmende gesellschaftliche Regulierung von Gewalt wider."
    ),

    // ── Sportarchitektur / Stadien (5) ────────────────────────────────────────

    // Question 31 – Colosseum capacity
    Question(
        categoryId = 6,
        questionText = "Das Kolosseum in Rom hatte ein ausgekluegseltes Einlass- und Evakuierungssystem. Wie lange dauerte es laut archaeologischen Studien, das Kolosseum bei Vollbelegung zu evakuieren?",
        answerA = "Etwa 3-4 Minuten durch 80 Eingaenge (Vomitoria)",
        answerB = "Etwa 15-20 Minuten durch gestaffelte Evakuierungsrouten",
        answerC = "Etwa 8-10 Minuten durch separate Treppenhaeuser pro Rang",
        answerD = "Etwa 30-45 Minuten, da nur 40 Ausgaenge vorhanden waren",
        correctAnswer = 0,
        explanation = "Das Kolosseum hatte 80 Eingaenge/Ausgaenge (Vomitoria) und war so konstruiert, dass alle 50.000-80.000 Zuschauer das Bauwerk in etwa 3-4 Minuten verlassen konnten. Moderne Stadionarchitektur versucht diesen Wert zu erreichen – viele heutige Arenen schaffen nur 10-15 Minuten.",
        difficulty = 5,
        funFact = "Der Begriff 'Vomitorium' bezieht sich tatsaechlich auf die Ausgaenge, nicht auf roemische Brechraueume – das ist ein moderner Mythos. Die Romer nutzten 'Vomitoria', weil die Massen durch sie 'ausgebrochen' wurden wie durch einen Vulkan. Das Kolosseum war das erste Mehrzweck-Sportstadion mit ueberdachbarer Arena durch das Velarium."
    ),

    // Question 32 – Maracana original capacity
    Question(
        categoryId = 6,
        questionText = "Das Estadio do Maracana fasste bei seiner Eroeffnung 1950 wie viele Zuschauer (offizielle Kapazitaet), und wie viele Menschen sollen beim WM-Endspiel 1950 tatsaechlich anwesend gewesen sein?",
        answerA = "Offizielle Kapazitaet: 200.000; tatsaechliche Anwesenheit Finale: 199.854",
        answerB = "Offizielle Kapazitaet: 183.000; tatsaechliche Anwesenheit Finale: schaetzungsweise 210.000",
        answerC = "Offizielle Kapazitaet: 150.000; tatsaechliche Anwesenheit Finale: 173.850",
        answerD = "Offizielle Kapazitaet: 220.000; tatsaechliche Anwesenheit Finale: 199.854",
        correctAnswer = 1,
        explanation = "Das Maracana wurde fuer die WM 1950 mit offizieller Kapazitaet von 183.000 erbaut. Das 'Endrundenspiel' Brasilien gegen Uruguay (22. Juli 1950) gilt als das am besten besuchte Fussballspiel aller Zeiten mit schaetzungsweise 199.854 bis 210.000 Zuschauern. Viele kamen ohne Tickets hinein – genaue Zahlen sind umstritten.",
        difficulty = 5,
        funFact = "Das 'Maracanazo' (Brasiliens 1:2-Niederlage gegen Uruguay) ist bis heute das groesste Sporttrauma der brasilianischen Geschichte. Uruguays Torschuetze Alcides Ghiggia sagte spaeter: 'Nur drei Menschen haben je das Maracana mit Stille gefuellt: der Papst, Frank Sinatra und ich.'"
    ),

    // Question 33 – Bird's Nest construction
    Question(
        categoryId = 6,
        questionText = "Das Olympiastadion Peking ('Vogelnest', 2008) wurde von Herzog & de Meuron entworfen. Welches strukturelle Problem musste beim Bau geloest werden und wie?",
        answerA = "Erdbebensicherheit in Zone 8 durch ein flexibles Stahlfachwerk mit ueber 400 km verschweissten Stahlltraegern und seismischen Isolatoren",
        answerB = "Brandschutz der Holzstruktur durch Titan-Beschichtung der 42.000 Stahlstreben",
        answerC = "Die Verhinderung von Schneelasten durch ein beheizbares Dachnetz aus Kohlefaser",
        answerD = "Die optische Illusionseffekte des Netzes erforderten Computersimulationen, die 2004 noch nicht existierten",
        correctAnswer = 0,
        explanation = "Peking liegt in einer Erdbebenzone. Das Vogelnest wurde mit einem System aus 42.000 Tonnen Stahl (ueber 400 km Schweissnaehte) und erdbebenisolierenden Fundamenten gebaut. Die Stahlkonstruktion verteilt Lastspitzen seismischer Aktivitaet. Die urspruengliche Planung sah ein Klappdach vor, das aus Kostengruenden und Sicherheitsbedenken entfernt wurde.",
        difficulty = 5,
        funFact = "Ai Weiwei war kuenstlerischer Berater beim Vogelnest-Entwurf, distanzierte sich aber spaeter von dem Projekt, weil er die Olympischen Spiele in China als propagandistisch empfand. Er bezeichnete seine Mitarbeit als 'Fake-Laecheln'."
    ),

    // Question 34 – Aztec Stadium altitude
    Question(
        categoryId = 6,
        questionText = "Das Estadio Azteca in Mexiko-Stadt liegt auf 2.240 Metern Hoeher. Welcher konkreter physiologischer Effekt muss Auswaeartsteams laut Forschung beachten, und um wie viele Prozent ist VO2max reduziert?",
        answerA = "VO2max ist auf 2.240m um etwa 17-18% reduziert gegenueber Meereshoehe",
        answerB = "VO2max ist auf 2.240m um etwa 7-8% reduziert gegenueber Meereshoehe",
        answerC = "VO2max ist auf 2.240m um etwa 12-13% reduziert gegenueber Meereshoehe",
        answerD = "VO2max ist auf 2.240m um etwa 22-25% reduziert gegenueber Meereshoehe",
        correctAnswer = 1,
        explanation = "Der barometrische Druck auf 2.240m betraegt ca. 760 hPa gegenueber 1013 hPa auf Meereshoehe. Die Sauerstoffpartialdruck-Reduktion fuehrt zu einer VO2max-Abnahme von ungefaehr 7-8% (Faustformel: ~1% pro 100m ueber 1.000m Hoeher). Langzeitakklimatisierte Bewohner verlieren diesen Nachteil; Auswaeartsteams brauchen 2-3 Wochen fuer volle Anpassung.",
        difficulty = 5,
        funFact = "Die FIFA hat eine Hoehengrenze von 2.750m fuer offizielle Laenderspiele beschlossen (2007), was direkt gegen Bolivien (La Paz: 3.640m) gerichtet war. Bolivien klagte, die FIFA hob die Regelung teilweise auf. Das Azteca-Stadion ist knapp innerhalb der akzeptierten Grenze und gilt als heimlicher Vorteil Mexikos bei WM-Qualifikations-Spielen."
    ),

    // Question 35 – Wembley arch engineering
    Question(
        categoryId = 6,
        questionText = "Der Wembley-Bogen (Wembley Arch) des neuen Wembley-Stadions ist ein markantes Bauwerk. Welche strukturelle Funktion erfuellt er und wie gross ist er?",
        answerA = "Reiner Designelement; 133m hoch und 317m lang, traegt keine Last",
        answerB = "Traegt das einziehbare Dach ueber dem Innenfeld; 133m hoch und 317m im Durchmesser",
        answerC = "Entlastet die Seitenwaende von der Dachlast; 315m Spannweite und 133m Hoehe",
        answerD = "Staendig unter Drucklast als Gegengewicht fuer das Dach; 133m hoch, 318m Spannweite",
        correctAnswer = 2,
        explanation = "Der Wembley-Bogen (Latticed Steel Arch) hat eine Spannweite von 315m und ist 133m hoch. Er traegt das gesamte Gewicht des einziehbaren Nordteils und des Festdachs, wodurch keine Stuetzsaeulen benoetigt werden – was bedeutet, dass alle 90.000 Zuschauer uneingeschraenkte Sichtlinien haben. Er ist der laengste ungestuetzte Einseilenbuegel-Bogen der Welt.",
        difficulty = 5,
        funFact = "Der Wembley-Bogen ist so gross, dass er vom Flugzeug aus 25 km weit sichtbar ist und bei klarem Wetter sogar als Orientierungspunkt fuer Piloten genutzt wird. Er ist beleuchtet und aendert die Farbe je nach Ereignis – bei England-Heimspielen leuchtet er in Rot und Weiss."
    ),

    // ── Sportpolitik / Boykotte (5) ───────────────────────────────────────────

    // Question 36 – 1980 Moscow boycott
    Question(
        categoryId = 6,
        questionText = "Wie viele Nationen boykottierten die Olympischen Sommerspiele 1980 in Moskau aus Protest gegen den sowjetischen Einmarsch in Afghanistan, und welche Alternative bot das IOC den ausgeschlossenen Laendern?",
        answerA = "65 Nationen; die IOC erlaubte Athleten, unter der olympischen Flagge anzutreten",
        answerB = "80 Nationen; ein alternatives 'Freedom Games'-Turnier in Philadelphia wurde organisiert",
        answerC = "62 Nationen; Athleten aus boykottierenden Laendern durften unter eigener Flagge ohne Nationalnamen antreten",
        answerD = "47 Nationen; das IOC schlug vor, die Spiele nach Melbourne zu verlegen",
        correctAnswer = 0,
        explanation = "65 Nationen boykottierten Moskau 1980 (USA, BRD, Japan, China u.a. auf US-Druck von Carter). Das IOC bot Athleten aus boykottierenden Laendern an, unter der olympischen Flagge (mit olympischer Hymne) ohne ihr Nationale Flag/Hymne teilzunehmen. Britische, australische und franzoesische Athleten nutzten dieses Angebot und gewannen Medaillen unter olympischem Banner.",
        difficulty = 5,
        funFact = "Sebastian Coe und Steve Ovett liefen 1980 beide unter der britischen olympischen Delegation (nicht unter Union Jack) und lieferten sich das legendaerste Mittelstreckenduo der Olympiageschichte: Coe gewann 1.500m-Gold, Ovett 800m-Gold – trotz breitem Druck aus Grossbritannien, die Spiele zu boykottieren."
    ),

    // Question 37 – South Africa apartheid ban
    Question(
        categoryId = 6,
        questionText = "In welchem Jahr wurde Suedafrika erstmals aus dem IOC ausgeschlossen (nicht nur suspendiert) und welches konkrete Ereignis beschleunigte diesen Schuss?",
        answerA = "1970 – nach dem Massaker von Soweto und internationalem Protest gegen Apartheid-Rugby",
        answerB = "1964 – nach der Weigerung, gemischte Olympiamannschaften aufzustellen, auf Beschluss des IOC",
        answerC = "1976 – nach dem Boykott afrikanischer Laender wegen Neuseelands Rugby-Tour suedafrika",
        answerD = "1968 – nach dem South-African-Referendum, das die Apartheid verstaerkte",
        correctAnswer = 1,
        explanation = "Suedafrika wurde 1964 vom IOC aus den Tokioter Spielen ausgeschlossen, nachdem es sich weigerte, eine integrierte, rassisch gemischte Olympiamannschaft aufzustellen. Der formelle Ausschluss aus dem IOC (Verlust der Mitgliedschaft) erfolgte 1970. Suedafrika kehrte erst 1992 nach Beginn des Apartheid-Abbaus zurueck.",
        difficulty = 5,
        funFact = "Waehrend Suedafrika aus Olympia ausgeschlossen war, spielte es weiterhin Rugby-Tests gegen Laender wie Neuseeland. 1981 fuehrte die Springboks-Tour durch Neuseeland zu massiven Protesten und gespaltener Nation – Kleinflugzeuge warf Mehlsaecke auf das Spielfeld, Polizei und Demonstranten lieferten sich Strassenschlachten."
    ),

    // Question 38 – 1936 Olympics Jesse Owens Hitler myth
    Question(
        categoryId = 6,
        questionText = "Was ist historisch falsch an dem populaeren Mythos, Hitler habe Jesse Owens nach seinen vier Goldmedaillen 1936 demonstrativ nicht die Hand geschuettelt?",
        answerA = "Hitler hat bei diesen Spielen grundsaetzlich keinem Athleten die Hand geschuettelt – nicht Owens, nicht weissen deutschen Siegern, nachdem das IOC nach Tag 1 protestiert hatte",
        answerB = "Hitler hat Owens tatsaechlich heimlich begruesst; die Handschuettel-Verweigerung ist eine Erfindung der US-Presse",
        answerC = "Owens selbst sagte, der US-Praesident F.D. Roosevelt sei der einzige gewesen, der ihn ignoriert habe, nicht Hitler",
        answerD = "Nur A und C sind korrekt – der Mythos ist komplex",
        correctAnswer = 3,
        explanation = "Beide Faktoren A und C sind historisch belegt: Hitler schuettelte nach dem ersten Tag (wegen IOC-Intervention nach Begruessung nur weisser Athleten) grundsaetzlich niemandem mehr die Hand. Und Jesse Owens sagte spater: 'Hitler hat mich gegruesst – Roosevelt hat mir nie telegrafiert.' Der afroamerikanische Olympiasieger wurde nach der Rueckkehr in die USA wieder mit Rassismus konfrontiert, waehrend sein 'Feind' Hitler ihn angeblich respektiert hatte.",
        difficulty = 5,
        funFact = "Owens' wichtigster Freund in Berlin war Carl Ludwig 'Luz' Long, ein weisser deutscher Weitspringer, der ihn bei der Qualifikation beriet (die Anlauflinie besser einzuplanen) und damit seinen Weltrekord-Sprung eroefnete. Die beiden freundeten sich an – vor den Augen Hitlers. Long schrieb Owens 1943 aus Nordafrika einen Brief kurz vor seinem Tod im Krieg: 'Vergiss mich nicht, Jesse.'"
    ),

    // Question 39 – Doping in East Germany
    Question(
        categoryId = 6,
        questionText = "Das staatliche Dopingprogramm der DDR ('Staatsplan 14.25') begann offiziell in welchem Jahr, und welche Substanz war das Hauptmittel?",
        answerA = "1974 – Testosteron und anabole Steroide (Oral-Turinabol / Dehydrochloromethyltestosteron)",
        answerB = "1968 – Amphetamine und Stimulanzien als Reaktion auf Olympia-Ergebnisse in Mexiko",
        answerC = "1972 – humanes Wachstumshormon (hGH) nach den Muenchener Spielen",
        answerD = "1966 – Kortikosteroide als erster Schritt vor den anabolen Programmen",
        correctAnswer = 0,
        explanation = "Staatsplan 14.25 begann formal 1974 unter Leitung des Sportmedizinischen Dienstes (SMD). Das Hauptmittel war Oral-Turinabol (Dehydrochloromethyltestosteron, DHCMT) – ein anaboles Steroid, das der VEB Jenapharm speziell fuer die DDR entwickelte und produzierte. Es wurde systematisch an Athleten verabreicht, oft ohne deren Wissen.",
        difficulty = 5,
        funFact = "Heidi Krieger, DDR-Stosserin und Europameisterin 1986, erhielt so massive Steroid-Dosen, dass sie sich spaeter einer geschlechtsangleichenden Operation unterzog und heute als Andreas Krieger lebt. Er klagte erfolgreich gegen seine ehemaligen Betreuer, die zu bewaehrten Strafen verurteilt wurden – einer der wenigen Faelle, wo DDR-Dopingverantwortliche juristisch verfolgt wurden."
    ),

    // ── Vergessene Sportarten (5) ─────────────────────────────────────────────

    // Question 40 – Pelota Vasca
    Question(
        categoryId = 6,
        questionText = "Baskisches Pelota (Jai Alai) gilt als schnellste Ballsportart der Welt. Welche Hoechstgeschwindigkeit wurde offiziell fuer den Xistera-Handkorb-Abwurf gemessen?",
        answerA = "Etwa 302 km/h",
        answerB = "Etwa 262 km/h",
        answerC = "Etwa 195 km/h",
        answerD = "Etwa 338 km/h",
        correctAnswer = 0,
        explanation = "Das Guinness-Buch der Rekorde erkannte 302 km/h als offizielle Hoechstgeschwindigkeit eines Jai-Alai-Pelota-Balls an (gemessen 1979, Jose Ramon Areitio). Zum Vergleich: Ein Squashball wird maximal bei etwa 170 km/h gespielt, ein Tennis-Aufschlag bei ca. 250 km/h.",
        difficulty = 5,
        funFact = "Jai Alai war in den USA von den 1930ern bis 1990ern ein legales Wettsport-Spektakel mit Millionen-Umsaetzen in Florida. Es verschwand fast voellig, als andere Gluecksspielformen wie Casinos legalisiert wurden. In Baskenland hat es kulturelles UNESCO-Erbe-Status."
    ),

    // Question 41 – Bandy vs Ice hockey
    Question(
        categoryId = 6,
        questionText = "Bandy gilt als Vorlaeufersport des Eishockeys. Welcher konkrete Regel- und Ausstattungsunterschied macht Bandy zu einer eigenstaendigen Sportart?",
        answerA = "Bandy wird auf einem Fussballfeld-grossen Eisfeld gespielt (110x65m), mit einem Fussball-aehnlichen roten Ball statt Puck, zwei Tore statt Boards, und Spieler nutzen Schafahirten-Kruecken-aehnliche Schlaeger",
        answerB = "Bandy wird auf kleinerem Eis gespielt als Eishockey, hat 6 statt 11 Spieler und nutzt einen orangenen Puck mit Loechern",
        answerC = "Bandy nutzt ein Eisfeld von Golfplatz-Groesse, hat 15 Spieler pro Mannschaft und ein Ziel wie beim Rugby",
        answerD = "Bandy ist Eishockey ohne Keeper, auf rundem Eis und mit zwei Baellen gleichzeitig",
        correctAnswer = 0,
        explanation = "Bandy wird auf einem Eisfeld von ca. 90-110 m x 45-65 m gespielt (etwa ein Fussballfeld auf Eis). Jede Mannschaft hat 11 Spieler (wie Fussball), gespielt wird mit einem kleinen roten Ball, die Tore sind gross (Eishockeytore waeren zu klein), und die Schlaeger haben einen flacheren, runderen Kopf als Eishockey-Schlaeger.",
        difficulty = 5,
        funFact = "Bandy hat eine Weltmeisterschaft seit 1957 und wird hauptsaechlich in Russland, Schweden, Norwegen, Finnland und Kasachstan gespielt. Russland hat bisher fast alle Weltmeisterschaften gewonnen. Das Regelwerk ist der FIFA-nahezu identisch (Abseits, Einwuerfe, Torhueter) – nur auf Eis."
    ),

    // Question 42 – Sepak Takraw
    Question(
        categoryId = 6,
        questionText = "Sepak Takraw ist eine suedostasiatische Sportart, bei der ein Rattanball nur mit Fuss, Knie, Brust und Kopf beruehrt werden darf. Welche akrobatische Kerntechnik unterscheidet den Wettkampf-Takraw vom Freizeit-Takraw?",
        answerA = "Der 'Roll Spike' (Rollangriff): Rueckwaerts-Salto mit Dreh-Kick auf den Netzball aus Vollgeschwindigkeit",
        answerB = "Der 'Bicycle Kick': rueckwaerts-Fallschuss identisch mit dem Fussball-Fallrueckzieher",
        answerC = "Der 'Cobra': Vorwaerts-Hechtsprung mit rueckwaertigem Fersenstoss auf den Ball",
        answerD = "Der 'Sunback': Rueckenlage-Kick, bei dem der Spieler liegend den Ball ueber das Netz kickt",
        correctAnswer = 0,
        explanation = "Der Wettkampf-Takraw (Regu: 3 vs 3) erfordert akrobatische Schmetterbaelle. Der Roll Spike (Tek Kuda) ist ein Rueckwaerts-Salto, bei dem der Angreifer sich rueckwaerts ins Leere wirft und den Ball mit einem rotierenden Kick aus der Drehung ueber das Netz haemmert. Geschwindigkeiten ueber 130 km/h wurden gemessen.",
        difficulty = 5,
        funFact = "Sepak Takraw ist bei den Asienspielen eine Medaillensportart seit 1990 und wird in 31 Laendern gespielt. Thailand, Malaysia und Indonesien dominieren international. Das Wort 'Sepak' kommt aus dem Malaiischen (treten) und 'Takraw' ist Thai fuer den geflochtenen Rattanball."
    ),

    // Question 43 – Kabaddi rules
    Question(
        categoryId = 6,
        questionText = "Beim Kabaddi – einem indischen Kontaktsport – muss der Angreifer ('Raider') waehrend seiner Aktion ohne Atemzug das Wort 'Kabaddi' wiederholen. Warum ist diese Regel sportlich funktional?",
        answerA = "Es ist reine Tradition ohne funktionale Bedeutung; die Regel existiert nur als kulturelles Erbe",
        answerB = "Sie dient als Schiedsrichter-Kontrollmechanismus: Das kontinuierliche 'Kabaddi'-Rufen beweist, dass der Angreifer in einem einzigen Atem angreift, was Ausdauer begrenzt und Raids kurz haelt",
        answerC = "Die Stimmbaende sind angespannt beim Rufen; diese Anspannung verbessert die Atemkontrolle und erhoehlt die Ausdauerleistung des Raiders",
        answerD = "Der Klang des Worts 'Kabaddi' erzeugt bestimmte Vibrationsfrequenzen, die traditionell als Einschuechterung der Verteidiger gelten",
        correctAnswer = 1,
        explanation = "Die 'Kabaddi'-Chanting-Regel ist eine ausgekluegelte Schiedsrichter-Kontrollmethode: Da ein Mensch nicht sprechen kann ohne zu atmen, beweist das kontinuierliche Chanting, dass der Raider seit dem Betreten des gegnerischen Feldes einen einzigen Atemzug haelt. Wenn er abbricht zu atmen, endet sein Raid. Dies begrenzt die Zeit im gegnerischen Feld auf realistische Atem-Grenzen.",
        difficulty = 5,
        funFact = "Kabaddi ist der Nationalsport Bangladeschs und hat professionelle Ligen in Indien (Pro Kabaddi League, gegr. 2014), die hohe TV-Quoten erzielen. Bei den Asienspielen ist Kabaddi seit 1990 olympische Disziplin – Indien hat alle Goldmedaillen der Maenner gewonnen."
    ),

    // Question 44 – Underwater Hockey (Octopush)
    Question(
        categoryId = 6,
        questionText = "Unterwasser-Hockey (Octopush) wurde 1954 in England erfunden. Welcher konkrete physiologische Vorteil haben suedafrikanische und australische Spieler laut Studie gegenueber europaeischen Spielern?",
        answerA = "Groessere Lungenvolumina durch Hoehentraining in Plateauregionen",
        answerB = "Fruehkindliche Taucherfahrung erhoehlt die mammalian diving reflex-Reaktion, die Herzfrequenz senkt und Sauerstoffverteilung optimiert",
        answerC = "Genetisch bedingt groessere Milz, die beim Tauchen komprimiert wird und bis zu 50% mehr Erythrozyten freisetzt",
        answerD = "Hoehere Haemat-Okrit-Werte durch Training in beheizten Suedseepools mit hohem Salzgehalt",
        correctAnswer = 2,
        explanation = "Taucher-Voelker wie die Bajau haben genetisch vergrosserte Milzen, die bei Apnoe-Tauchen komprimiert werden und gespeicherte Erythrozyten ins Blut abgeben. Studien zeigen, dass auch trainierte Sporttaucher diesen Effekt staerker nutzen als Untrainierte. Suedafrikanische und australische Unterwasserhockey-Spieler, die in natuerlichem Wasser fruehzeitig trainierten, zeigen aehnliche Muster.",
        difficulty = 5,
        funFact = "Octopush wird in 30+ Laendern gespielt und hat eine eigene Weltmeisterschaft. Gespielt wird am Boden eines 2m tiefen Beckens mit kurzen Schlaegeschlaegern (30cm) und einem Bleipuck (ca. 1,5 kg). Ein Spiel dauert zweimal 15 Minuten – Spieler tauchen wiederholt und rotieren schnell an die Oberflaeche."
    ),

    // ── Sportphilosophie (5) ──────────────────────────────────────────────────

    // Question 45 – Bernard Suits and Trifler
    Question(
        categoryId = 6,
        questionText = "Bernard Suits definierte in 'The Grasshopper: Games, Life and Utopia' (1978) drei Figuren in Bezug auf Spiel: den Spieler, den Betrueger und den Verderber. Wer ist der 'Trifler' und wie unterscheidet er sich vom Betrueger?",
        answerA = "Der Trifler nimmt die Ziele des Spiels nicht ernst und spielt ziellos; der Betrueger nimmt Ziele ernst, aber ignoriert die Regeln",
        answerB = "Der Trifler folgt allen Regeln, versucht aber nicht zu gewinnen; der Betrueger gewinnt, aber durch Regelbruch",
        answerC = "Der Trifler ignoriert sowohl Ziele als auch Regeln und spielt 'sein eigenes Spiel'; der Betrueger ignoriert nur Regeln",
        answerD = "Der Trifler ist ein Spieler, der staendig aufgibt; der Betrueger ist einer, der falsche Ergebnisse meldet",
        correctAnswer = 1,
        explanation = "Suits' Trifler ('Saechsler' in manchen Uebersetzungen) befolgt alle Regeln, hat aber kein genuines Interesse an den konstitutiven Zielen des Spiels – er spielt 'nach Vorschrift', ohne zu versuchen zu gewinnen. Der Betrueger verfolgt das Ziel (zu gewinnen), bricht aber die Regeln, um es zu erreichen. Suits sieht den Betrueger als paradoxerweise earnest (er will wirklich gewinnen), den Trifler als leerer.",
        difficulty = 5,
        funFact = "Suits' Buch ist eine philosophische Verteidigung von Spiel als hoegstem Gut: Im Grasshopper-Utopia, wo alle materiellen Beduerfnisse erfuellt sind, bleibt Spiel die einzig sinnvolle Taetigkeit. Dies macht ihn zu einem Vorlaeufer der Positive-Psychology-Debatte ueber 'Flow' und Freizeitgesellschaft."
    ),

    // Question 46 – Formalism vs Conventionalism in sport
    Question(
        categoryId = 6,
        questionText = "Im sportphilosophischen Streit zwischen 'Formalism' und 'Conventionalism' ueber die Natur von Spielregeln: Was ist der Kern des Unterschieds bezueglich der Frage, ob ein Tor zaehllt?",
        answerA = "Formalismus: Ein Tor zaehllt wenn es den geschriebenen Regeln entspricht; Konventionalismus: Ein Tor zaehllt wenn es dem 'Geist des Spiels' entspricht, auch wenn Regeln verletzt wurden",
        answerB = "Formalismus: Regeln sind zeitlos und universell; Konventionalismus: Regeln gelten nur innerhalb des Kontextes einer bestimmten Spielkultur",
        answerC = "Formalismus: Schiedsrichterentscheidungen sind final und immer regelkonform; Konventionalismus: Spieler koennen Regeln durch Konsens aendern",
        answerD = "Formalismus: Sport ist moralisch neutral; Konventionalismus: Sport traegt moralische Pflichten zum fairen Spiel",
        correctAnswer = 0,
        explanation = "Der philosophische Kernstreit: Formalisten (z.B. Suits) sagen, Spiel ist durch explizite Regeln konstituiert – was regelkonform ist, gilt. Konventionalisten (z.B. Leaman, Fraleigh) argumentieren, es gibt einen 'Sportsgeist' oder implizite Konventionen, die ueber den geschriebenen Text hinausgehen. Die Hand Gottes von Maradona 1986 ist der klassische Testfall.",
        difficulty = 5,
        funFact = "Maradona selbst sah seine Hand-Tor-Aktion 1986 nicht als Betrug, sondern als Ausdruck des Arguments 'wenn der Schiedsrichter es akzeptiert, ist es regelkonform' – eine unwissentlich formalistische Position. William Morgan (Leftist Sport Theories) wiederum sieht darin den Beweis, dass Regeln immer politisch-kulturell eingebettet sind."
    ),

    // Question 47 – Doping ethics and harm principle
    Question(
        categoryId = 6,
        questionText = "Philosopher Julian Savulescu argumentiert, Doping sollte in bestimmten Faellen erlaubt sein. Welches Kernargument nutzt er dabei?",
        answerA = "Doping ist unvermeidlich; effektivere Regulierung sollte Schaeden minimieren statt verbieten",
        answerB = "Wenn eine Substanz nicht gesundheitsschaedlich ist, verbietet kein moralisches Prinzip ihre Verwendung – leistungsssteigernde Substanzen unter sicherem Schwellwert sollten erlaubt sein",
        answerC = "Das Dopingverbot ist ein Eingriff in die koerperliche Autonomie und verletzt Grundrechte der Athleten",
        answerD = "Genetisch bedingte Vorteile (wie ACTN3-RR) sind identisch mit chemischem Doping in ihrer Wirkung – beide oder keines sollten verboten sein",
        correctAnswer = 1,
        explanation = "Savulescu ('Doping Gene Therapy', 2004) argumentiert auf Basis des Mill'schen Schadensprinzips: Moralisches Verbot erfordert Nachweis eines Schadens an anderen. Wenn eine leistungssteigernde Substanz keine gesundheitlichen Schaeden verursacht (sicher dosiert), gibt es keinen moralischen Grund fuer ein Verbot. Er schlaegt einen 'Harm Threshold' vor, unterhalb dessen Substanzen erlaubt sein sollten.",
        difficulty = 5,
        funFact = "Savulescus Argument wird oft mit dem 'Transhumanismus im Sport' verknuepft: Wenn genetisches Engineering ermoeglicht werden wird, Muskelzusammensetzung zu optimieren, ist der Unterschied zu Doping nur eine Frage der Technologie. Die WADA-Liste verbotener Substanzen waechst seit 1999 jedes Jahr – die philosophische Frage 'was ist natuerlich?' wird komplexer."
    ),

    // Question 48 – Philosophy of cheating
    Question(
        categoryId = 6,
        questionText = "Wie definiert die Sportphilosophie den Unterschied zwischen 'Gamesmanship' (Spieltaktik an der Grenze) und echtem Betrug?",
        answerA = "Gamesmanship ist legal aber unethisch; Betrug ist sowohl illegal als auch unethisch – der Unterschied liegt in der formalen Sanktionierung",
        answerB = "Gamesmanship nutzt Regelluecken ohne Regelbruch; Betrug bricht geschriebene Regeln – beide sind moralisch problematisch, aber nur Betrug verdient Sanktion",
        answerC = "Gamesmanship ist eine vom Gegner akzeptierte Form der psychologischen Kriegsfuehrung; Betrug ist jede Handlung, die der Gegner nicht akzeptiert",
        answerD = "Der Begriff Gamesmanship ist wertfrei-deskriptiv; Betrug ist normativer Begriff – der Unterschied liegt nur in der moralischen Bewertung, nicht in der Handlung",
        correctAnswer = 0,
        explanation = "In der Sportethik (D'Agostino, Fraleigh) ist Gamesmanship das Ausnutzen von Regelluecken, Zeitspiel, psychologische Ablenkung – alles innerhalb des Buchstabens der Regeln. Betrug bricht explizite Regeln. Gamesmanship ist ethisch kontrovers ('Slippery Slope' zum Betrug), aber formal legal. Die Herausforderung liegt in der Grauzonenansiedelung: Maradonas Hand war Betrug, absichtliches langsames Einwerfen ist Gamesmanship.",
        difficulty = 5,
        funFact = "Stephen Potter praegte 1947 den Begriff 'Gamesmanship' in seinem satirischen Buch 'The Theory and Practice of Gamesmanship', das Wege beschrieb, legal zu 'gewinnen ohne eigentlich zu spielen'. Das Buch war als Satire gemeint, wurde aber von manchen Sportlern als ernsthaftes Handbuch betrachtet."
    ),

    // Question 49 – Women in sport and philosophy
    Question(
        categoryId = 6,
        questionText = "Iris Marion Young's Essay 'Throwing Like a Girl' (1980) analysiert die Bewegungsmodaelitaeten von Frauen gegenueber Maennern. Was ist ihre Kernthese und warum ist sie fuer Sportphilosophie relevant?",
        answerA = "Frauen sind biologisch schlechter fuer Wurfbewegungen geeignet; Sport muss auf weibliche Koerperstrukturen angepasst werden",
        answerB = "Frauen haben durch sozialisierte 'gehemmte Intentionalitaet' (inhibited intentionality) gelernt, ihren Koerper zurueckzuhalten – nicht durch Biologie, sondern patriarchale Koerper-Sozialisation",
        answerC = "Geschlechterspezifische Bewegungsmuster entstehen durch evolutionaere Anpassung und sollten im Sport anerkannt werden",
        answerD = "Tittle IX hat die koerperliche Befreiung von Frauen gebracht, aber unbewusste Bewegungseinschraenkungen persistieren",
        correctAnswer = 1,
        explanation = "Young (Phaenomenologie nach Merleau-Ponty) argumentiert: Maedchen lernen frueh, ihren Koerper als Objekt zu erfahren, das begutachtet wird, statt als Subjekt, das agiert. Dies fuehrt zu 'inhibited intentionality' – Bewegungen werden gehemmt, zurueckgezogen, auf minimalen Raum beschraenkt. Der Unterschied in Wurfbewegungen ist nicht biologisch, sondern sozialisiert.",
        difficulty = 5,
        funFact = "Youngs Essay wurde zu einem Grundlagentext der feministischen Koerperphilosophie und hat direkten Einfluss auf Sportpaedagogik: Wenn Maedchen ihre koerperliche Zurueckhaltung erlernt haben, kann diese durch gezieltes Training ueberschrieben werden. Studien zeigen, dass Maedchen, die von frueh an in Wurfsportarten aktiv sind, keine signifikanten Unterschiede in der Wurftechnik zu Jungen zeigen."
    ),

    // Question 50 – Philosophy of sport and identity
    Question(
        categoryId = 6,
        questionText = "Wie loest die Sportphilosophie das 'Schiff des Theseus'-Problem in Mannschaftssport: Wenn alle Spieler eines Teams im Laufe der Jahre ausgetauscht werden, ist es noch dasselbe Team?",
        answerA = "Psychologische Kontinuitaetstheorie: Teamidentitaet basiert auf geteilten Erinnerungen der Fans und narrativer Kontinuitaet, nicht auf physischer Spieler-Identitaet",
        answerB = "Biologischer Essentialismus: Nur Teams mit mindestens einem urspruenglichen Spieler sind identisch – sonst entstehen neue Teams",
        answerC = "Institutioneller Realismus: Teams sind juristische Personen (Vereine), deren Identitaet durch Satzung, Logo und Stadion konstituiert wird – unabhaengig von Spielern",
        answerD = "Formalismus: Teams sind durch ihre Spielregeln und Ligazugehoerigkeit definiert – jedes Team in derselben Liga ist im selben Sinne dasselbe",
        correctAnswer = 0,
        explanation = "Die ueberwiegende Position in der Identitaetsphilosophie des Sports (cf. William Morgan, Stephen Mumford) orientiert sich an psychologischer Kontinuitaet: Teamidentitaet ist eine narrative Konstruktion der Fan-Gemeinschaft, die durch Geschichte, Erzaehlung, Rituale und Emotionen konstituiert wird. Der FC Barcelona von 1920 und heute sind 'dasselbe Team', weil die Gemeinschaft diese Kontinuitaet konstruiert und aufrechterhalt.",
        difficulty = 5,
        funFact = "Der Fall AFC Wimbledon vs. MK Dons (Franchise-Streit 2004) ist der realste Sportphilosophie-Test: Als Wimbledon nach Milton Keynes verlegt wurde, gruendeten Fans 'AFC Wimbledon' neu in der Amateurliga. Welches ist das 'echte' Wimbledon? Die Fans von AFC Wimbledon waehlen Kontinuitaet durch Gemeinschaft, nicht durch Rechtseinheit."
    ),
)
