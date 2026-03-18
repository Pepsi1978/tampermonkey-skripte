package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsHard5(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das 'T' im TNM-Stagingsystem fuer Tumore?",
        answerA = "Therapieerfolg nach Erstbehandlung",
        answerB = "Ausdehnung des Primaertumors",
        answerC = "Anzahl der befallenen Lymphknoten",
        answerD = "Vorhandensein von Fernmetastasen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Im TNM-System steht T fuer Tumor und beschreibt Groesse und lokale Ausdehnung des Primaertumors -- T0 bedeutet kein Primaertumor nachweisbar, T4 bedeutet maximale lokale Invasion.",
        funFact = "Das TNM-Klassifikationssystem wurde von Pierre Denoix in den 1940er-Jahren entwickelt und wird heute von der UICC international standardisiert -- es ist die Grundlage fuer Therapieentscheidungen weltweit."
    ),

    // Question 2
    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'N1' im TNM-Stagingsystem?",
        answerA = "Kein Lymphknotenbefall nachweisbar",
        answerB = "Regionaere Lymphknoten koennen nicht beurteilt werden",
        answerC = "Befall regionaerer Lymphknoten",
        answerD = "Fernmetastasen in Lymphknoten",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "N steht fuer 'Nodes' (Lymphknoten) -- N0 bedeutet kein regionaerer Befall, N1 bis N3 bezeichnen zunehmenden Befall regionaerer Lymphknoten, NX bedeutet nicht beurteilbar.",
        funFact = "Der Lymphknotenstatus ist bei vielen Krebsarten der wichtigste prognostische Faktor -- beim Mammakarzinom entscheidet er massgeblich ueber die Notwendigkeit einer adjuvanten Chemotherapie."
    ),

    // Question 3
    Question(
        categoryId = 16,
        questionText = "Welcher Tumormarker wird hauptsaechlich zur Ueberwachung des Prostatakarzinoms eingesetzt?",
        answerA = "CEA (Karzinoembryonales Antigen)",
        answerB = "CA-125",
        answerC = "AFP (Alpha-Fetoprotein)",
        answerD = "PSA (Prostata-spezifisches Antigen)",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "PSA ist eine Serinprotease, die von Prostatazellen produziert wird -- erhöhte PSA-Werte koennen auf ein Prostatakarzinom, aber auch auf benigne Prostatahyperplasie oder Prostatitis hinweisen.",
        funFact = "Ein PSA-Wert ueber 4 ng/ml gilt als erhoehungsverdaechtig, jedoch haben bis zu 25 Prozent der Maenner mit Prostatakarzinom einen PSA-Wert unter diesem Grenzwert -- die PSA-Dichte und -Kinetik sind daher entscheidend."
    ),

    // Question 4
    Question(
        categoryId = 16,
        questionText = "Bei welchem Karzinom wird CA-125 als Tumormarker verwendet?",
        answerA = "Kolonkarzinom",
        answerB = "Ovarialkarzinom",
        answerC = "Leberzellkarzinom",
        answerD = "Lungenkarzinom",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "CA-125 ist ein Glykoprotein, das vorwiegend vom Epithel des Ovars produziert wird -- es dient hauptsaechlich zum Therapiemonitoring und zur Rezidiverkennung beim Ovarialkarzinom, nicht als Screeningtest.",
        funFact = "CA-125 kann auch bei Endometriose, Myomen und sogar waehrend der Menstruation erhoehen -- seine Spezifitaet als Screeningmarker ist daher gering, weshalb es nicht zur allgemeinen Frueherkennungsuntersuchung empfohlen wird."
    ),

    // Question 5
    Question(
        categoryId = 16,
        questionText = "Welcher Tumormarker ist typisch erhoehen beim hepatozellulaeren Karzinom (HCC)?",
        answerA = "PSA",
        answerB = "CA 19-9",
        answerC = "AFP (Alpha-Fetoprotein)",
        answerD = "CEA",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "AFP wird normalerweise nur im Foetalstadium produziert -- beim Leberzellkarzinom wird die AFP-Produktion reaktiviert, Werte ueber 400 ng/ml sind hochgradig verdaechtig auf ein HCC.",
        funFact = "AFP dient auch als Marker fuer Keimzelltumoren des Hodens -- beim nicht-seminomatoesen Keimzelltumor ist AFP zusammen mit Beta-HCG und LDH ein wichtiger Stagingparameter."
    ),

    // Question 6
    Question(
        categoryId = 16,
        questionText = "Was ist das Ziel der Strahlentherapie mit Gamma-Messer (Gamma Knife) bei Hirntumoren?",
        answerA = "Mechanische Entfernung des Tumors durch fokussierte Schallwellen",
        answerB = "Praezise Bestrahlung des Tumors mit gebbuendelten Gammastrahlen bei minimaler Belastung des Umgebungsgewebes",
        answerC = "Erwaermung des Tumorgewebes auf ueber 45 Grad Celsius",
        answerD = "Einbringen radioaktiver Substanzen direkt in den Tumor",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Gamma Knife buendelt bis zu 201 Kobalt-60-Quellen auf einen gemeinsamen Fokuspunkt -- die Dosis im Zielpunkt ist tumorozid, waehrend das umliegende Gewebe nur minimale Strahlung erhaelt.",
        funFact = "Der Begriff 'Gamma Knife' ist etwas irrefuehrend -- es handelt sich nicht um ein Messer, sondern um einen radiochirurgischen Apparat. Er wurde 1967 von Lars Leksell entwickelt und wird heute bei ueber 70.000 Patienten jaehrlich eingesetzt."
    ),

    // Question 7
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Hormontherapie' beim Prostatakarzinom?",
        answerA = "Gabe von Testosteron zur Staerkung des Immunsystems",
        answerB = "Androgeentzug durch chirurgische oder medikamentoeser Kastration zur Wachstumshemmung",
        answerC = "Oestrogengabe zur Foerderung der Apoptose in Prostatazellen",
        answerD = "Schilddruesenhormon-Substitution bei Metastasen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Prostatakarzinom ist in fruehen Stadien androgenabhaengig -- durch Androgenentzug (LHRH-Agonisten, Antiandrogene oder Orchiektomie) wird das Tumorwachstum gehemmt.",
        funFact = "Charles Huggins erhielt 1966 den Nobelpreis fuer Medizin fuer die Entdeckung, dass das Prostatakarzinom durch Hormonentzug beeinflusst werden kann -- er bewies 1941, dass Kastration Prostatakrebs zum Rueckgang bringt."
    ),

    // Question 8
    Question(
        categoryId = 16,
        questionText = "Was sind 'tyrosinkinase-Inhibitoren' in der Krebstherapie?",
        answerA = "Antikörper, die Tumorantigene auf der Zelloberfläche blockieren",
        answerB = "Molekuele, die aktivierte Tyrosinkinasen hemmen und damit Wachstumssignale in Tumorzellen blockieren",
        answerC = "Chemotherapeutika, die DNS-Doppelstrangbrueche ausloesen",
        answerD = "Radioaktive Substanzen, die gezielt in Tumorzellen eingeschleust werden",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Tyrosinkinase-Inhibitoren wie Imatinib blockieren spezifische Signalwege in Tumorzellen -- sie hemmen die Phosphorylierung von Proteinen und unterbinden so Proliferationssignale.",
        funFact = "Imatinib (Glivec) war ein Meilenstein der Krebstherapie -- es verwandelte die chronisch myeloische Leukaemie (CML) von einer meist toedlichen Erkrankung in eine chronische, gut kontrollierbare Krankheit mit nahezu normaler Lebenserwartung."
    ),

    // Question 9
    Question(
        categoryId = 16,
        questionText = "Was kennzeichnet einen autosomal-dominanten Erbgang?",
        answerA = "Die Krankheit tritt nur bei Maennern auf",
        answerB = "Zwei defekte Kopien des Gens sind notwendig, um die Krankheit auszuloesen",
        answerC = "Eine einzige defekte Genkopie reicht aus, um die Krankheit auszuloesen",
        answerD = "Das defekte Gen befindet sich ausschliesslich auf dem X-Chromosom",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Beim autosomal-dominanten Erbgang genuegt eine mutierte Kopie eines Gens, um den Phaenotyp auszupraegen -- das Risiko fuer Nachkommen eines betroffenen Elternteils betraegt 50 Prozent.",
        funFact = "Das Marfan-Syndrom ist ein klassisches Beispiel fuer autosomal-dominante Vererbung -- Abraham Lincoln hatte moeglicherweise dieses Syndrom, was seine ungewoehnlich grosse, schlanke Koerpergestalt erklaeren wuerde."
    ),

    // Question 10
    Question(
        categoryId = 16,
        questionText = "Welches Chromosomenmuster liegt beim Turner-Syndrom vor?",
        answerA = "47,XXY",
        answerB = "47,XYY",
        answerC = "45,X0",
        answerD = "47,XX+21",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Beim Turner-Syndrom fehlt ein X-Chromosom vollstaendig oder teilweise -- der Karyotyp 45,X0 fuehrt bei Frauen zu Kleinwuchs, Gonadendysgenesie und Infertilitaet.",
        funFact = "Das Turner-Syndrom tritt bei etwa 1 von 2.500 lebend geborenen Maedchen auf -- interessanterweise werden die meisten 45,X-Konzeptionen spontan abortiert, sodass nur etwa 1 Prozent aller Turner-Konzeptionen lebend geboren werden."
    ),

    // Question 11
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das Klinefelter-Syndrom genetisch?",
        answerA = "Fehlen des Y-Chromosoms bei maennlichem Phaenotyp",
        answerB = "Vorhandensein eines zusaetzlichen X-Chromosoms beim Mann (47,XXY)",
        answerC = "Trisomie des Chromosoms 21",
        answerD = "Monosomie des Chromosoms 18",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Beim Klinefelter-Syndrom haben Maenner einen 47,XXY-Karyotyp -- typische Merkmale sind Hodenunterfunktion, Infertilitaet, Gynaekomastie und oft ueberdurchschnittliche Koerpergroesse.",
        funFact = "Das Klinefelter-Syndrom ist mit einer Haeufigkeit von 1 zu 660 Maennern eine der haeufigsten Chromosomenaberrationen -- viele Betroffene erfahren die Diagnose erst beim Abklaeren unerfuellten Kinderwunsches."
    ),

    // Question 12
    Question(
        categoryId = 16,
        questionText = "Welche Chromosomenaberration liegt beim Down-Syndrom (Trisomie 21) am haeufigsten vor?",
        answerA = "Deletion des langen Arms von Chromosom 21",
        answerB = "Freie Trisomie 21 durch Non-Disjunction in der Meiose",
        answerC = "Translokation eines Teils von Chromosom 14 auf Chromosom 21",
        answerD = "Ringchromosom 21",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "In etwa 95 Prozent der Faelle entsteht das Down-Syndrom durch freie Trisomie 21 -- eine fehlerhafte Chromosomentrennung (Non-Disjunction) meist in der muetterlichen Meiose I.",
        funFact = "Das Risiko fuer Trisomie 21 steigt stark mit dem muetterlichen Alter -- bei 20-jaehrigen Frauen liegt es bei etwa 1:1.500, bei 40-jaehrigen Frauen bei etwa 1:100 und bei 45-jaehrigen bei 1:30."
    ),

    // Question 13
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter Epigenetik?",
        answerA = "Die Lehre von der genetischen Sequenzierung mittels Hochdurchsatzmethoden",
        answerB = "Vererbbare Veraenderungen der Genexpression ohne Aenderung der DNS-Sequenz",
        answerC = "Die Analyse von Genmutationen durch Chromosomenstudien",
        answerD = "Das Studium der Proteinstruktur basierend auf Gendaten",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Epigenetische Veraenderungen umfassen DNS-Methylierung und Histon-Modifikationen -- sie regulieren, welche Gene abgelesen werden, ohne die eigentliche DNS-Sequenz zu veraendern.",
        funFact = "Epigenetische Muster koennen durch Umweltfaktoren wie Ernaehrung, Stress oder Toxine veraendert werden -- Studien an eineiigen Zwillingen zeigen, dass ihre epigenetischen Profile mit dem Alter immer unterschiedlicher werden."
    ),

    // Question 14
    Question(
        categoryId = 16,
        questionText = "Was ist DNS-Methylierung in der Epigenetik?",
        answerA = "Einbau von Methylgruppen in Histonproteine zur Chromatinkondensation",
        answerB = "Anfuegen einer Methylgruppe an Cytosin-Basen der DNS, meist an CpG-Dinukleotiden",
        answerC = "Spaltung von DNS-Doppelstraengen durch Methyltransferasen",
        answerD = "Umwandlung von Thymin zu Methyluracil bei Hitzestress",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "DNS-Methylierung an CpG-Inseln in Promotorregionen fuehrt typischerweise zur Stilllegung von Genen -- bei Krebszellen sind Tumorsuppressorgene oft durch Hypermethylierung inaktiviert.",
        funFact = "Krebszellen zeigen ein paradoxes Methylierungsmuster: globale Hypomethylierung (aktiviert Onkogene) kombiniert mit lokaler Hypermethylierung in Promotoren von Tumorsuppressorgenen -- dieser Befund wird diagnostisch genutzt."
    ),

    // Question 15
    Question(
        categoryId = 16,
        questionText = "Was ist die akute Bleivergiftung typischerweise gekennzeichnet durch?",
        answerA = "Hochroter Hautfarbe, Kirschroter Zunge und Tachykardie",
        answerB = "Bauchkoliken, Enzephalopathie, Anaeamie und Basophile Tuepfelung der Erythrozyten",
        answerC = "Gelber Sklera, Leberschwellung und Leberversagen",
        answerD = "Blaue Verfaerbung der Lippen und periphere Zyaanose",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Blei hemmt die Haem-Biosynthese und schaedigt das Zentralnervensystem -- charakteristisch sind kolikartige Bauchschmerzen, periphere Neuropathie, Anaeamie und basophile Tuepfelung der roten Blutkoerperchen.",
        funFact = "Die roemische Oberschicht verwendete Bleigeschirr und mit Bleiacetat gesuessten Wein (Sapa) -- einige Historiker vermuten, dass chronische Bleivergiftung zur mentalen Verschlechterung roemischer Kaiser und zum Untergang des Imperiums beigetragen hat."
    ),

    // Question 16
    Question(
        categoryId = 16,
        questionText = "Welche Wirkung hat Kohlenmonoxid (CO) im menschlichen Koerper?",
        answerA = "Es bindet an Haemoglobin mit 250-fach hoeherer Affinitaet als Sauerstoff und bildet Carboxyhaemoglobin",
        answerB = "Es verdraengt Stickstoff aus der Atemluft und fuehrt zur Erstickung",
        answerC = "Es bildet mit Wasser Kohlensaeure, die den pH-Wert des Blutes senkt",
        answerD = "Es blockiert Natriumkanaele in Nervenzellen und verursacht Lahmung",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "CO bindet reversibel an das Eisen im Haem des Haemoglobins und bildet Carboxyhaemoglobin (COHb) -- dieses kann keinen Sauerstoff mehr transportieren, was zur inneren Erstickung fuehrt.",
        funFact = "CO ist geruch- und farblos -- klassische Symptome der Vergiftung sind Kopfschmerzen, Schwindel und Uebelkeit, die oft mit einer Grippe verwechselt werden. Die kirschrote Hautfarbe ist ein Spaetsymptom und oft nicht vorhanden."
    ),

    // Question 17
    Question(
        categoryId = 16,
        questionText = "Welches Antidot wird bei einer Kohlenmonoxidvergiftung eingesetzt?",
        answerA = "N-Acetylcystein (NAC)",
        answerB = "Atropin",
        answerC = "100-prozentiger Sauerstoff, ggf. hyperbare Oxygenierung",
        answerD = "Natriumthiosulfat",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Hochkonzentrierter Sauerstoff verkuerzt die Halbwertszeit von Carboxyhaemoglobin von etwa 5 Stunden (Raumluft) auf etwa 60-90 Minuten -- hyperbare Oxygenierung kann die Halbwertszeit weiter auf ca. 20 Minuten senken.",
        funFact = "Bei Schwangeren ist die Indikation zur hyperbaren Sauerstofftherapie grosszuegiger gestellt, da fetales Haemoglobin eine noch hoehereAffinitaet zu CO hat und das ungeborene Kind staerker gefaehrdet ist."
    ),

    // Question 18
    Question(
        categoryId = 16,
        questionText = "Was ist die Sievert-Einheit (Sv) in der Strahlenmedizin?",
        answerA = "Masse des radioaktiven Materials pro Zeiteinheit",
        answerB = "Anzahl der Zerfaelle pro Sekunde einer radioaktiven Substanz",
        answerC = "Energiedosis in Joule pro Kilogramm ohne Beruecksichtigung der Strahlungsart",
        answerD = "Aequivalentdosis -- absorbierte Energie multipliziert mit einem Qualitaetsfaktor der Strahlungsart",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Das Sievert (Sv) ist die SI-Einheit der Aequivalentdosis und beruecksichtigt die biologische Wirksamkeit verschiedener Strahlungsarten -- 1 Sv = 1 J/kg multipliziert mit dem Strahlungs-Wichtungsfaktor.",
        funFact = "Die jaehrliche natuerliche Strahlenbelastung in Deutschland betraegt etwa 2,1 mSv -- ein Transatlantikflug entspricht etwa 0,05-0,1 mSv. Die Dosis bei einer CT-Untersuchung des Brustkorbs betraegt ca. 10 mSv."
    ),

    // Question 19
    Question(
        categoryId = 16,
        questionText = "Was ist die Einheit Becquerel (Bq) in der Strahlenphysik?",
        answerA = "Die biologisch wirksame Strahlendosis pro Kilogramm Koerpergewicht",
        answerB = "Die Aktivitaet einer radioaktiven Substanz -- ein Zerfall pro Sekunde",
        answerC = "Die Energie der emittierten Gammastrahlung in Elektronenvolt",
        answerD = "Die absorbierte Energiedosis in Joule pro Kilogramm",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Ein Becquerel entspricht einem radioaktiven Kernzerfall pro Sekunde -- es ersetzt die alte Einheit Curie (1 Ci = 3,7 x 10^10 Bq), benannt nach Antoine Henri Becquerel, dem Entdecker der Radioaktivitaet.",
        funFact = "Der menschliche Koerper ist selbst radioaktiv -- er enthaelt etwa 4.500 Bq durch Kalium-40 und Kohlenstoff-14. Das entspricht rund 4.500 radioaktiven Zerfaellen pro Sekunde im eigenen Koerper."
    ),

    // Question 20
    Question(
        categoryId = 16,
        questionText = "Welcher Tumor ist besonders stark mit Strahlenexposition assoziiert?",
        answerA = "Magenkrebs",
        answerB = "Schilddruesenkrebs (v.a. papillaeres Karzinom)",
        answerC = "Kolonkarzinom",
        answerD = "Bauchspeicheldruesenkarzinom",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Schilddruese, besonders bei Kindern, reagiert sehr empfindlich auf ionisierende Strahlung -- nach dem Reaktorunfall in Tschernobyl 1986 kam es zu einem dramatischen Anstieg papillaerer Schilddruesenkarzinome bei Kindern.",
        funFact = "Nach Hiroshima und Nagasaki wurden die ersten strahlungsinduzierten Schilddruesenkarzinome beobachtet -- damals wurde Jod-131 noch therapeutisch an Kinder verabreicht, was zu erhoehntem Krebsrisiko fuehrte und heute nicht mehr gemacht wird."
    ),

    // Question 21
    Question(
        categoryId = 16,
        questionText = "Was ist ein Teratogen?",
        answerA = "Ein Gen, das die Tertiaestruktur von Proteinen beeinflusst",
        answerB = "Ein Stoff oder Einfluss, der die normale Entwicklung des Embryos stoert und Fehlbildungen verursacht",
        answerC = "Ein Virus, der spezifisch Eizellen infiziert",
        answerD = "Ein Chromosomenabschnitt, der Wachstumsgene enthaelt",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Teratogene schadigen den Embryo in der sensiblen Phase der Organogenese (3.-8. SSW) -- zu den klassischen Teratogenen zaehlen Thalidomid, Alkohol, Retinsaeure, bestimmte Antiepileptika und Roetelnviren.",
        funFact = "Thalidomid (Contergan) verursachte in den fruehen 1960er-Jahren welteit schwere Fehlbildungen bei ueber 10.000 Kindern -- es ist heute wieder in der Krebstherapie (Multiples Myelom) zugelassen, jedoch unter strengsten Schwangerschaftsschutzauflagen."
    ),

    // Question 22
    Question(
        categoryId = 16,
        questionText = "In welchem Zeitfenster der Schwangerschaft ist der Embryo am empfindlichsten gegenueber Teratogenen?",
        answerA = "1.-2. Schwangerschaftswoche",
        answerB = "3.-8. Schwangerschaftswoche (Organogenese)",
        answerC = "2.-3. Trimester (Fetogenese)",
        answerD = "Unmittelbar vor der Geburt (36.-40. SSW)",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Waehrend der Organogenese (3.-8. SSW) werden alle wichtigen Organe angelegt -- eine Schaedigung in dieser Phase fuehrt zu Fehlbildungen (Malformationen), waehrend eine Schaedigung in den ersten zwei Wochen oft zu 'Alles oder Nichts' fuehrt.",
        funFact = "Das sogenannte 'Alles-oder-Nichts-Prinzip' in den ersten zwei Wochen beschreibt, dass eine Schaedigung entweder zur totalen Rueckbildung fuehrt oder der Embryo durch die Totipotenz der Zellen normal weiterentwickelt -- Fehlbildungen entstehen in dieser Phase seltener."
    ),

    // Question 23
    Question(
        categoryId = 16,
        questionText = "Was ist das fetale Alkoholsyndrom (FAS)?",
        answerA = "Eine Leberzirrhose beim Neugeborenen durch alkoholkranke Muetter",
        answerB = "Ein Spektrum koerperlicher und geistiger Beeintraechtigungen durch praenate Alkoholexposition",
        answerC = "Eine genetische Erkrankung, bei der Alkohol nicht metabolisiert werden kann",
        answerD = "Eine Entzugssymptomatik beim Neugeborenen alkoholabhaengiger Muetter",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "FAS entsteht durch alkohol-bedingte Schaedigung des sich entwickelnden Gehirns -- typisch sind Wachstumsretardierung, faziale Dysmorpihen (z.B. glattes Philtrum, schmales Oberlippe) und kognitive Beeintraechtigungen.",
        funFact = "Alkohol ist das haeufigste bekannte Teratogen in westlichen Laendern -- es gibt keine bekannte sichere Menge Alkohol in der Schwangerschaft. FAS ist die fuehrende vermeidbare Ursache geistiger Behinderung in der westlichen Welt."
    ),

    // Question 24
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter forensischer Toxikologie?",
        answerA = "Die Entwicklung von Gegenmitteln fuer industrielle Gifte",
        answerB = "Den Nachweis und die Interpretation von Giften, Drogen und Medikamenten in biologischen Proben fuer rechtliche Zwecke",
        answerC = "Die Beurteilung von Umweltgiften auf oekosystemare Auswirkungen",
        answerD = "Die Vergiftungstherapie in der Notaufnahme",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Forensische Toxikologen analysieren Blut, Urin, Haare und Gewebe auf Substanzen, die Tod oder Beeintraechtigung verursacht haben koennten -- ihre Ergebnisse sind in Gerichtsverfahren rechtlich relevant.",
        funFact = "Haare koennen als 'Zeitzeugen' in der forensischen Toxikologie dienen -- da Haare etwa 1 cm pro Monat wachsen, koennen Segmentanalysen zeigen, wann ein bestimmtes Gift oder eine Droge eingenommen wurde, teilweise Monate zurueck."
    ),

    // Question 25
    Question(
        categoryId = 16,
        questionText = "Was sind typische Zeichen einer Quecksilbervergiftung (chronisch)?",
        answerA = "Haarausfall, Nagelveraenderungen und periphere Neuropathie (Mees-Streifen)",
        answerB = "Tremor, Gingivitis, Erythismus (psychische Erregbarkeit) und periphere Neuropathie",
        answerC = "Kolik, Basophile Tuepfelung und schieferblaue Zahnfleischsaeume",
        answerD = "Anosmie, Epistaxis und Septumdefekte",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Chronische Quecksilbervergiftung (Hydrargyrose) manifestiert sich als Trias aus Tremor (Intention), Gingivitis und Erethismus -- letzterer bezeichnet eine pathologische Reizbarkeit und psychische Labiliaet.",
        funFact = "Der Ausdruck 'verrueckt wie ein Hutmacher' (englisch: 'mad as a hatter') stammt aus dem 19. Jahrhundert, als Hutmacher Quecksilbernitrat zur Filzbearbeitung verwendeten und haeufig neurologische Symptome entwickelten -- daher auch der 'Verrueckte Hutmacher' in Alice im Wunderland."
    ),

    // Question 26
    Question(
        categoryId = 16,
        questionText = "Was sind Mees-Streifen (weisse Querstreifen auf Fingernaegeln)?",
        answerA = "Ein Zeichen fuer schwere Leberzirrhose",
        answerB = "Traumatische Nagelveraenderungen nach Quetschverletzungen",
        answerC = "Typisches Zeichen einer chronischen Arsen- oder Thalliumvergiftung",
        answerD = "Eine autoimmune Nagelveraenderung bei Lupus erythematodes",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Mees-Streifen entstehen durch Arsenablagerungen in den Naegeln waehrend der Vergiftungsphase -- da Naegel langsam wachsen, kann der Abstand der Streifen von der Nagelbasis den Vergiftungszeitpunkt retrospektiv bestimmen.",
        funFact = "Arsen wurde historisch als 'Erbgift' bezeichnet, da es geruch- und geschmacklos ist und seine Symptome mit einer Magen-Darm-Erkrankung verwechselt werden koennen -- forensische Arsenanalysen haben historische Mordfaelle auch Jahrhunderte spaeter noch aufgeklaert."
    ),

    // Question 27
    Question(
        categoryId = 16,
        questionText = "Was bezeichnet der Begriff 'Totenstarre' (Rigor mortis) in der forensischen Medizin?",
        answerA = "Das Absinken der Koerpertemperatur nach dem Tod",
        answerB = "Die postmortale Verfestigung der Muskulatur durch ATP-Mangel und Aktin-Myosin-Vernetzung",
        answerC = "Das Auftreten von Leichenfaule durch bakterielle Enzyme",
        answerD = "Blutdruckabfall nach dem Tod mit konsekutiver Livores",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Nach dem Tod erschoepfen sich ATP-Reserven, das Aktin-Myosin-System kann sich nicht mehr loesen und die Muskelstarre tritt ein -- sie beginnt ca. 2-4 Stunden post mortem, ist maximal nach 6-12 Stunden und loest sich nach 24-48 Stunden.",
        funFact = "Totenstarre beginnt zuerst in kleinen Muskeln (Augenlieder, Kiefer) und schreitet zu grossen Muskeln fort -- dieser Verlauf (Nysten'sche Regel) hilft Rechtmedizinern, den Todeszeitpunkt grob abzuschaetzen."
    ),

    // Question 28
    Question(
        categoryId = 16,
        questionText = "Welches Enzym ist ein Schluesselmolekuel in der Krebsentstehung und reguliert den Zellzyklus?",
        answerA = "Lactase",
        answerB = "p53 (Tumorsuppressorprotein)",
        answerC = "Amylase",
        answerD = "Katalase",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "p53 ist ein Transkriptionsfaktor, der bei DNS-Schaeden den Zellzyklus anhaelt und ggf. Apoptose einleitet -- Mutationen des TP53-Gens finden sich in etwa 50 Prozent aller menschlichen Tumoren.",
        funFact = "p53 wird als 'Waechter des Genoms' bezeichnet -- es wurde 1979 gleichzeitig von mehreren Laboren entdeckt und zunaechst faelschlicherweise als Onkogen eingestuft. Heute wissen wir, dass es eines der wichtigsten Tumorsuppressorgene ist."
    ),

    // Question 29
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen einem Proto-Onkogen und einem Onkogen?",
        answerA = "Proto-Onkogene kommen nur in Krebszellen vor, Onkogene in normalen Zellen",
        answerB = "Proto-Onkogene sind normale Wachstumsgene -- durch Mutation/Amplifikation werden sie zu krebsfoerdernden Onkogenen",
        answerC = "Proto-Onkogene hemmen das Zellwachstum, Onkogene foerdern es",
        answerD = "Proto-Onkogene sind inaktive Retrovirengene im menschlichen Genom",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Proto-Onkogene kodieren fuer Wachstumsfaktoren und ihre Rezeptoren -- durch Mutation, Genamplifikation oder Translokation werden sie zu Onkogenen, die unkontrolliertes Zellwachstum ausloesen.",
        funFact = "Das erste Onkogen (src) wurde 1976 von Harold Varmus und Michael Bishop in Retrovirusstudie entdeckt -- sie erhielten dafuer 1989 den Nobelpreis. Die Entdeckung zeigte, dass Krebsgene evolutionaer konservierte normale Zellgene sind."
    ),

    // Question 30
    Question(
        categoryId = 16,
        questionText = "Welcher Virus ist kausal mit dem Gebaermutterhalskrebs (Zervixkarzinom) assoziiert?",
        answerA = "Epstein-Barr-Virus (EBV)",
        answerB = "Humane Papillomaviren (HPV), v.a. Typ 16 und 18",
        answerC = "Hepatitis-B-Virus (HBV)",
        answerD = "Herpes-simplex-Virus Typ 2 (HSV-2)",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "HPV-Typen 16 und 18 sind Hochrisikotypen, die durch ihre Onkoproteine E6 (inaktiviert p53) und E7 (inaktiviert pRb) die normalen Zellzykluskontrolle ausser Kraft setzen.",
        funFact = "Harald zur Hausen entdeckte den kausalen Zusammenhang zwischen HPV und Gebarmutterhalskrebs und erhielt dafuer 2008 den Nobelpreis fuer Medizin -- heute gibt es einen effektiven HPV-Impfstoff, der theoretisch das Zervixkarzinom vollstaendig verhindernkoennte."
    ),

    // Question 31
    Question(
        categoryId = 16,
        questionText = "Was ist die CEA (Karzinoembryonales Antigen) als Tumormarker?",
        answerA = "Ein spezifischer Marker, der nur bei Dickdarmkrebs erhoeht ist",
        answerB = "Ein Glykoprotein, das in verschiedenen Karzinomen erhoeht sein kann und zum Therapiemonitoring dient",
        answerC = "Ein Antikoerper, der vom Immunsystem gegen Tumorzellen gebildet wird",
        answerD = "Ein Enzym, das DNA-Schaeden repariert",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "CEA ist ein Glykoprotein, das in der Embryonalzeit produziert wird und im Erwachsenenblut nur in Spuren vorkommt -- erhoehte Werte finden sich bei kolorektalen Karzinomen, aber auch bei Magen-, Pankreas-, Lungen- und Mammakarzinomen sowie bei Rauchern.",
        funFact = "CEA eignet sich nicht als Screeningtest, da Raucher bis zu doppelt so hohe CEA-Werte haben wie Nichtraucher -- es wird hauptsaechlich zum Verlaufsmonitoring nach Krebsoperationen eingesetzt, um Rezidive fruehzeitig zu erkennen."
    ),

    // Question 32
    Question(
        categoryId = 16,
        questionText = "Was ist der X-gebundene rezessive Erbgang?",
        answerA = "Eine Erkrankung, die nur Frauen betrifft, da sie zwei X-Chromosomen haben",
        answerB = "Erkrankungen, die hauptsaechlich Maenner betreffen, da sie nur ein X-Chromosom haben und kein zweites die Mutation kompensieren kann",
        answerC = "Eine Erkrankung, die auf dem Y-Chromosom kodiert ist",
        answerD = "Erkrankungen, die nur entstehen, wenn beide Elternteile betroffen sind",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei X-rezessiven Erkrankungen sind Maenner (46,XY) direkt betroffen, da eine einzige defekte X-Kopie ausreicht -- Frauen sind meist Traegerinnen mit einem gesunden und einem defekten X-Chromosom.",
        funFact = "Rot-Gruen-Blindheit und die Bluterkrankheit (Haemophilie A und B) sind klassische X-gekoppelt rezessive Erkrankungen -- Haemophilie A wurde als 'Koenigskrankheit' bekannt, da Koenigin Victoria Traegerin war und die Erkrankung in europaische Koenigshaueser trug."
    ),

    // Question 33
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen Penetranz und Expressivitaet in der Genetik?",
        answerA = "Penetranz misst die Strahlenempfindlichkeit eines Gens, Expressivitaet seine Mutationsrate",
        answerB = "Penetranz ist der Anteil der Gentraeger, bei denen sich der Phaenotyp zeigt -- Expressivitaet beschreibt den Schweregrad der Auspraegung",
        answerC = "Penetranz beschreibt die Haefigkeit einer Mutation, Expressivitaet ihre chromosomale Position",
        answerD = "Penetranz ist die Vererbungsrate, Expressivitaet die Expressionsrate eines Gens",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Eine Mutation mit 80-prozentiger Penetranz zeigt sich nur bei 80 Prozent der Traeger -- variable Expressivitaet bedeutet, dass verschiedene Individuen mit derselben Mutation unterschiedlich stark betroffen sind.",
        funFact = "Das Retinoblastom-Gen (RB1) hat eine Penetranz von 90 Prozent -- das bedeutet, 10 Prozent der Traeger einer pathogenen RB1-Mutation entwickeln keinen Tumor. Dieses Konzept ist wichtig fuer genetische Beratung bei Erbkrankheiten."
    ),

    // Question 34
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einem 'Knuepfpunkt' (Philadelphia-Chromosom) in der Haematologie?",
        answerA = "Ein zusaetzliches Chromosom 22 bei CLL-Patienten",
        answerB = "Ein Chromosom mit einer Translokation t(9;22), die das BCR-ABL-Fusionsprotein erzeugt",
        answerC = "Ein defektes Chromosom 17 bei AML-Patienten",
        answerD = "Eine Deletion am kurzen Arm des Chromosoms 5 bei MDS",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Philadelphia-Chromosom entsteht durch eine reziproke Translokation zwischen Chromosom 9 und 22 -- das daraus entstehende BCR-ABL-Fusionsprotein hat konstitutiv aktive Tyrosinkinase-Aktivitaet und verursacht die chronische myeloische Leukaemie.",
        funFact = "Das Philadelphia-Chromosom wurde 1960 von Peter Nowell und David Hungerford in Philadelphia entdeckt -- es war die erste klonal-spezifische chromosomale Veraenderung bei Krebs und markierte den Beginn der modernen molekularen Onkologie."
    ),

    // Question 35
    Question(
        categoryId = 16,
        questionText = "Was ist eine 'Loss of Heterozygosity' (LOH) bei Tumorsuppressorgenen?",
        answerA = "Verlust einer Genkopie, sodass eine bereits mutierte zweite Kopie nicht mehr durch eine gesunde Kopie kompensiert werden kann",
        answerB = "Doppelung eines Chromosomenabschnitts mit einem mutierten Gen",
        answerC = "Aktivierung eines Gen durch epigenetische Demethylierung",
        answerD = "Einbau eines viralen Gens in das menschliche Chromosom",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Knudson's 'Two-Hit-Hypothese' besagt, dass beide Allele eines Tumorsuppressorgens inaktiviert sein muessen -- LOH beschreibt den Verlust des gesunden Allels, wodurch die erste Mutation (erster Hit) wirksam wird.",
        funFact = "Alfred Knudson entwickelte die Two-Hit-Hypothese 1971 durch statistische Analyse von Retinoblastomfaellen -- bei erblichem Retinoblastom liegt der erste Hit in der Keimbahn, sodass nur ein somatischer Treffer (Zufallsmutation) zum Tumor fuehrt."
    ),

    // Question 36
    Question(
        categoryId = 16,
        questionText = "Was sind Histone und welche Rolle spielen sie in der Epigenetik?",
        answerA = "Transkriptionsfaktoren, die direkt an DNS-Schadesteilen binden und Reparatur einleiten",
        answerB = "Proteine, um die DNS gewickelt ist -- ihre chemische Modifikation reguliert die Zugaenglichkeit von Genen",
        answerC = "Enzyme, die DNS-Methylierungsgruppen hinzufuegen und entfernen",
        answerD = "Nicht-kodierende RNAs, die Genschweigelegen regulieren",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "DNS ist um Histonoktamere gewickelt und bildet Nukleosomen -- Modifikationen wie Acetylierung (Aktivierung) oder Methylierung der Histon-Schwanzregionen aendern die Chromatinstruktur und regulieren die Genexpression.",
        funFact = "Histon-Acetylierung durch HATs (Histon-Acetyltransferasen) 'oeffnet' das Chromatin und foerdert Transkription -- Histon-Deacetylasen (HDACs) kehren dies um. HDAC-Inhibitoren wie Vorinostat werden bereits in der Krebstherapie eingesetzt."
    ),

    // Question 37
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das Konzept der 'Krebsstammzelle'?",
        answerA = "Stammzellen im Knochenmark, die durch Strahlung entarten koennen",
        answerB = "Eine kleine Subpopulation von Tumorzellen, die Tumorinitiierungs- und Selbsterneuerungs-Faehigkeiten besitzen",
        answerC = "Embryonale Stammzellen, die aus Tumorgewebe gewonnen werden",
        answerD = "Krebszellen, die in den Knochen metastasiert sind",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Krebsstammzellen (CSC) tragen zur Therapieresistenz und zum Rezidiv bei -- sie teilen sich asymmetrisch, koennen sich selbst erneuern und differenzieren in andere Tumorzelltypen, aehnlich normalen Stammzellen.",
        funFact = "Krebsstammzellen sind oft resistent gegen Chemotherapie, da sie weniger stark proliferieren und verstaerrkte DNA-Reparaturmechanismen besitzen -- dies erklaert, warum manche Tumoren nach anfaenglichem Ansprechen auf Therapie rezidivieren."
    ),

    // Question 38
    Question(
        categoryId = 16,
        questionText = "Was ist der Warburg-Effekt in der Tumorbiologie?",
        answerA = "Die Tendenz von Tumorzellen, vermehrt Metastasen in den Knochen zu bilden",
        answerB = "Die praeferentielle aerobe Glykolyse von Tumorzellen trotz Anwesenheit von Sauerstoff",
        answerC = "Die erhoehte Radiosensitivitaet von Tumorzellen bei hypoxischen Bedingungen",
        answerD = "Die Tendenz von Tumoren, immunsupprimierende Zytokine zu produzieren",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Otto Warburg beobachtete, dass Tumorzellen Glukose vorwiegend durch Glykolyse statt durch oxidative Phosphorylierung verstoffwechseln -- auch wenn Sauerstoff vorhanden ist (aerobe Glykolyse).",
        funFact = "Der Warburg-Effekt ist die Grundlage der PET-Untersuchung (Positronen-Emissions-Tomographie) -- Tumorzellen nehmen radioaktiv markierte Glukose (FDG) wegen ihres hohen Glukosestoffwechsels bevorzugt auf und werden so sichtbar gemacht."
    ),

    // Question 39
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'Antizipation' bei genetischen Erkrankungen?",
        answerA = "Fruehzeitige diagnostische Testung asymptomatischer Gentraeger",
        answerB = "Das Phaenomen, dass bestimmte erbliche Erkrankungen in nachfolgenden Generationen frueherer und/oder schwerer auftreten",
        answerC = "Die pranatale Planung von Gentherapiemassnahmen",
        answerD = "Immunologische Praekonditionierung vor Knochenmarktransplantation",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Antizipation tritt bei Erkrankungen durch Trinukleotid-Repeat-Expansionen auf -- mit jeder Generation werden die Repeats laenger, was zu fruehererem Erkrankungsbeginn und/oder schwererer Symptomatik fuehrt.",
        funFact = "Morbus Huntington und die Myotone Dystrophie sind klassische Beispiele -- bei Morbus Huntington beginnt die Erkrankung bei Jugendhuntington (juvenile onset) mit >60 CAG-Repeats oft schon vor dem 20. Lebensjahr, waehrend der klassische Beginn bei 35-50 Jahren liegt."
    ),

    // Question 40
    Question(
        categoryId = 16,
        questionText = "Was ist Strahlenkater (Akutes Strahlen-Syndrom) und ab welcher Dosis tritt es auf?",
        answerA = "Eine chronische Erkrankung nach langjaehriger Niedrigdosisexposition, ab 0,1 Sv",
        answerB = "Eine akute Erkrankung nach Ganzkörperbestrahlung mit Uebelkeit, Erbrechen und Knochenmarksuppression, ab ca. 1 Sv",
        answerC = "Eine psychosomatische Reaktion auf die Diagnose einer Strahlenerkrankung",
        answerD = "Verbrennung der Haut ab 0,5 Sv Exposition",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Akute Strahlen-Syndrom (ARS) beginnt klinisch ab ca. 1 Sv -- es umfasst Prodromalphase (Uebelkeit, Erbrechen), Latenzphase und Manifestationsphase mit haematopoetischen, gastrointestinalen oder zerebrovaskulaeren Schaden.",
        funFact = "Der LD50/60 (letale Dosis fuer 50 Prozent ohne Behandlung innerhalb von 60 Tagen) beim Menschen liegt bei 3-5 Sv Ganzkörperdosis -- mit intensivmedizinischer Behandlung und Stammzelltransplantation koennen Patienten auch hoehere Dosen ueberleben."
    ),

    // Question 41
    Question(
        categoryId = 16,
        questionText = "Was ist Imprinting in der Genetik?",
        answerA = "Die Inaktivierung des zweiten X-Chromosoms bei Frauen (Lyon-Hypothese)",
        answerB = "Ein epigenetischer Mechanismus, bei dem Gene je nach elterlicher Herkunft unterschiedlich exprimiert werden",
        answerC = "Das Phaenomen der Genomdoppelung waehrend der Mitose",
        answerD = "Die praeferentielle Aktivierung muetterlicher Gene im Gehirn",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Genomisches Imprinting fuehrt dazu, dass das Gen nur vom muetterlichen oder nur vom vaeterlichen Chromosom exprimiert wird -- Fehler beim Imprinting verursachen Erkrankungen wie Prader-Willi- und Angelman-Syndrom.",
        funFact = "Das Prader-Willi-Syndrom (Deletion des vaeterlichen Chromosom-15q-Abschnitts) und das Angelman-Syndrom (Deletion des muetterlichen Chromosom-15q-Abschnitts) betreffen dieselbe Chromosomenregion, fuehren aber zu voellig verschiedenen Erkrankungsbildern -- ein eindrucksvoller Beweis fuer Imprinting."
    ),

    // Question 42
    Question(
        categoryId = 16,
        questionText = "Was ist die Fluorid-in-situ-Hybridisierung (FISH) in der Diagnostik?",
        answerA = "Eine Methode zur DNS-Sequenzierung mittels markierter Fluoreszenzfarbstoffe",
        answerB = "Eine zytogenetische Methode, die fluoreszenzmarkierte DNS-Sonden verwendet, um spezifische Chromosomenabschnitte sichtbar zu machen",
        answerC = "Eine Technik zur Messung der Radioaktivitaet in Chromosomenpraeparaten",
        answerD = "Eine Methode zur Kultivierung von Tumorzellen in vitro",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "FISH verwendet fluoreszenzmarkierte Sonden, die komplementaer an spezifische DNS-Sequenzen binden -- sie ermoeglicht den Nachweis von Chromosomaberrationen, Deletionen, Amplifikationen und Translokationen in Tumorzellen.",
        funFact = "FISH wird heute routinemaessig bei Brustkrebsdiagnostik eingesetzt -- der HER2-Status wird oft per FISH bestimmt, da HER2-positive Tumoren spezifisch mit dem Antikoerper Trastuzumab (Herceptin) behandelt werden koennen."
    ),

    // Question 43
    Question(
        categoryId = 16,
        questionText = "Was sind die Hauptgruppen ionisierender Strahlung und ihre Durchdringungsstaerke?",
        answerA = "Alphastrahlung (sehr hoch), Betastrahlung (mittel), Gammastrahlung (gering)",
        answerB = "Alphastrahlung (sehr gering), Betastrahlung (mittel), Gammastrahlung und Roentgenstrahlung (sehr hoch)",
        answerC = "Schallwellen (gering), UV-Strahlen (mittel), Roentgenstrahlen (sehr hoch)",
        answerD = "Infrarotstrahlung (gering), sichtbares Licht (mittel), UV-Strahlung (sehr hoch)",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Alphastrahlung (Heliumkerne) wird von einem Blatt Papier gestoppt, ist aber intern extrem schaedlich -- Betastrahlung dringt einige Zentimeter in Gewebe ein, Gammastrahlung durchdringt den Koerper und erfordert schwere Abschirmung.",
        funFact = "Polonium-210, das Alexander Litvinenko ermordete, ist ein Alphastrahler -- da Alpha-Strahlung kaum externe Strahlung abgibt, war es schwer nachzuweisen. Intern verursacht es massive Gewebeschaeden durch die hohe lokale Energiedeposition."
    ),

    // Question 44
    Question(
        categoryId = 16,
        questionText = "Was ist ein 'Onkogen-Sucht' (Oncogene Addiction) bei Tumoren?",
        answerA = "Die Abhaengigkeit von Krebspatienten von Chemotherapeutika",
        answerB = "Das Phaenomen, dass Tumorzellen fuer ihr Ueberleben auf die Aktivitaet eines bestimmten Onkogens angewiesen sind",
        answerC = "Die Neigung von Onkogenen, weitere Mutationen anzusammeln",
        answerD = "Die Abhaengigkeit von Tumorzellen von der Angiogenese",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Onkogen-Sucht bedeutet, dass ein Tumor trotz vieler Mutationen auf ein einzelnes aktiviertes Onkogen angewiesen ist -- dies erklaert, warum gezielte Therapien (wie Imatinib bei BCR-ABL) so wirksam sein koennen.",
        funFact = "Das Konzept der Onkogen-Sucht ist die Grundlage der zielgerichteten Krebstherapie -- wenn ein Tumor von einem einzigen Signalweg 'abhaengig' ist, genuegt dessen Hemmung oft, um den Tumor zum Absterben zu bringen, waehrend normale Zellen wenig Schaden nehmen."
    ),

    // Question 45
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter 'liquid biopsy' (Fluessigbiopsie) in der Krebsdiagnostik?",
        answerA = "Entnahme von Tumorgewebe durch eine Feinnadelpunktion",
        answerB = "Analyse von zirkulierender Tumor-DNS (ctDNA) oder Tumorzellen in Blut oder anderen Koerperfluessigkeiten",
        answerC = "Ernaehrungstherapie bei Krebspatienten",
        answerD = "Bestimmung von Tumormarkern in der Gewebefluessigkeit",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Liquid Biopsy analysiert zirkulierende Tumor-DNS (ctDNA), zirkulierende Tumorzellen (CTCs) oder Exosomen im Blut -- sie ermoeglicht minimalinvasives Tumormonitoring und fruehzeitige Resistenzerkennung.",
        funFact = "Liquid Biopsy kann theoretisch den gesamten genetischen Fingerabdruck eines Tumors erfassen, da DNS aus allen Metastasen ins Blut abgegeben wird -- im Gegensatz zur konventionellen Biopsie, die nur einen Tumorbereich repraesentiert (intratumorale Heterogenitaet)."
    ),

    // Question 46
    Question(
        categoryId = 16,
        questionText = "Was ist die kausale Ursache des Li-Fraumeni-Syndroms?",
        answerA = "Keimbahnmutation im BRCA1- oder BRCA2-Gen",
        answerB = "Keimbahnmutation im TP53-Gen mit stark erhoehtem Risiko fuer multiple Krebserkrankungen",
        answerC = "Keimbahnmutation im APC-Gen mit kolorektaler Polyposis",
        answerD = "Chromosomale Translokation t(9;22)",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Beim Li-Fraumeni-Syndrom liegt eine Keimbahnmutation im Tumorsuppressorgen TP53 vor -- Betroffene haben ein lebenslanges Risiko von 50-80 Prozent fuer Krebserkrankungen, darunter Sarkome, Brustkarzinom, Gehirntumoren und Leukaeamien.",
        funFact = "Frederick Li und Joseph Fraumeni beschrieben das Syndrom 1969 anhand von vier Familien -- das lebenslange Krebsrisiko ist so hoch, dass intensive Ueberwachungsprogramme (inklusive jaehrlicher MRT-Ganzkörperuntersuchung) empfohlen werden."
    ),

    // Question 47
    Question(
        categoryId = 16,
        questionText = "Was ist das BRCA1/BRCA2-Gentest-Screening?",
        answerA = "Ein Test auf spezifische Brustkrebszellen im Blut",
        answerB = "Genetischer Test auf Keimbahnmutationen in den Tumorsuppressorgenen BRCA1 oder BRCA2, die das Brust- und Eierstockkrebsrisiko stark erhoehen",
        answerC = "Bestimmung des CA-125-Serumwertes als Screeningtest fuer Ovarialkarzinom",
        answerD = "Mammographie mit zusaetzlichem genetischen Biomarkertest",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "BRCA1- und BRCA2-Mutationen sind fuer etwa 5-10 Prozent aller Brustkrebs- und 15 Prozent aller Ovarialkarzinomfaelle verantwortlich -- Traegerinnen haben ein lebenslanges Brustkrebsrisiko von 50-80 Prozent.",
        funFact = "Angelina Jolie machte 2013 ihre praeventive doppelte Mastektomie aufgrund einer BRCA1-Mutation oeffentlich bekannt -- dies fuehrte weltweit zu einem massiven Anstieg von BRCA-Testanfragen (der sog. 'Angelina-Jolie-Effekt')."
    ),

    // Question 48
    Question(
        categoryId = 16,
        questionText = "Was ist das Ziel der Immuntherapie mit 'Checkpoint-Inhibitoren' bei Krebs?",
        answerA = "Aktivierung von Checkpoint-Proteinen, um unkontrolliertes Immunzellwachstum zu stoppen",
        answerB = "Blockade immunologischer Bremsmechanismen (PD-1/PD-L1, CTLA-4), damit T-Zellen Tumorzellen erkennen und angreifen koennen",
        answerC = "Einbringen kuenstlicher T-Zell-Rezeptoren in Immunzellen",
        answerD = "Zerstoerung tumorinfiltrierender Lymphozyten, die Metastasen foerdern",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Tumorzellen exprimieren PD-L1, das PD-1 auf T-Zellen bindet und diese 'erschoepft' -- Checkpoint-Inhibitoren wie Pembrolizumab blockieren diese Hemmung und reaktivieren die Anti-Tumor-Immunantwort.",
        funFact = "James Allison und Tasuku Honjo erhielten 2018 den Nobelpreis fuer die Entdeckung der Checkpoint-Inhibition -- Pembrolizumab (Keytruda) hat inzwischen ueber 30 Zulassungen fuer verschiedene Krebsarten und gilt als Durchbruch der modernen Onkologie."
    ),

    // Question 49
    Question(
        categoryId = 16,
        questionText = "Was ist das 'Nutzen-Risiko-Prinzip' bei der medizinischen Strahlenexposition?",
        answerA = "Die gesetzliche Pflicht, alle Patienten ueber Strahlungsrisiken zu informieren",
        answerB = "Das Prinzip, dass der diagnostische oder therapeutische Nutzen einer Strahlenanwendung groesser sein muss als das Strahlenrisiko",
        answerC = "Die Berechnung der maximalen jaehrlichen Strahlendosis fuer medizinisches Personal",
        answerD = "Die Pflicht zur Zweitmeinung bei hochstrahlenden bildgebenden Verfahren",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Nach dem Strahlenschutzgesetz muss vor jeder Strahlenanwendung eine Rechtfertigungsabwaegung erfolgen -- Rechtfertigung, Optimierung (ALARA-Prinzip: as low as reasonably achievable) und Dosisbegrenzung sind die drei Grundprinzipien.",
        funFact = "Das ALARA-Prinzip bedeutet, die Strahlendosis 'so gering wie vernuenftigerweise erreichbar' zu halten -- ein CT des Abdomens kann durch optimierte Protokolle auf 20-40 Prozent der urspruenglichen Dosis reduziert werden, ohne Bildqualitaetsverlust."
    ),

    // Question 50
    Question(
        categoryId = 16,
        questionText = "Was ist die 'klonale Evolution' bei der Krebsentstehung?",
        answerA = "Die Entwicklung von Krebsstaemmen aus embryonalen Stammzellen",
        answerB = "Das schrittweise Akkumulieren von Mutationen in einer Zelle, die dadurch einen Selektionsvorteil erhaelt und einen Klon bildet",
        answerC = "Die Uebertragung von Krebsgenen von einer Zelle auf eine andere",
        answerD = "Die Entstehung neuer Krebsarten durch Virusmutationen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Krebsentstehung ist ein mehrstufiger Prozess (Initiation, Promotion, Progression) -- jede Zelle, die einen Wachstumsvorteil durch eine Mutation erhaelt, expandiert klonal und akkumuliert weitere Mutationen.",
        funFact = "Das Kolonkarzinom ist das am besten untersuchte Modell der klonalen Evolution -- Bert Vogelstein kartierte den 'adenoma-to-carcinoma'-Uebergang: von normaler Schleimhaut ueber Adenom zu Karzinom dauert es 10-15 Jahre und erfordert 5-10 Treibermutationen."
    )

)
