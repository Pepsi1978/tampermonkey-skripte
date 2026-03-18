package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsHard4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 16,
        questionText = "Was ist das Prinzip der Laparoskopie?",
        answerA = "Offene Bauchoeperation mit grossem Hautschnitt",
        answerB = "Einfuehren von Kamera und Instrumenten durch kleine Schnitte unter CO2-Insufflation",
        answerC = "Robotergesteuerter Eingriff ohne menschlichen Chirurgen",
        answerD = "Ultraschallgesteuertes Verfahren ohne Hautschnitt",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei der Laparoskopie wird CO2 in die Bauchhoehlte eingeleitet, um Raum zu schaffen, dann werden Trokar-Huelsen eingesteckt, durch die Kamera und Instrumente gefuehrt werden -- das minimiert Gewebeschaden und Erholungszeit.",
        funFact = "Der erste laparoskopische Eingriff am Menschen wurde 1910 von Hans Christian Jacobaeus in Stockholm durchgefuehrt -- damals noch ohne CO2-Insufflation."
    ),

    // Question 2
    Question(
        categoryId = 16,
        questionText = "Welches Gas wird bei der Laparoskopie zur Bauchraumaufdehnung verwendet und warum?",
        answerA = "Sauerstoff, weil er nicht reaktiv ist",
        answerB = "Stickstoff, weil er billig ist",
        answerC = "CO2, weil es schnell vom Koerper resorbiert wird und nicht entzuendlich ist",
        answerD = "Helium, weil es leichter als Luft ist",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "CO2 wird bevorzugt, da es vom Peritoneum schnell resorbiert und ueber die Lunge abgeatmet wird -- ausserdem ist es nicht brennbar, was bei Elektrokauter-Einsatz wichtig ist.",
        funFact = "Ein Sauerstoff-Pneumoperitoneum waere lebensgefaehrlich, da Sauerstoff in Verbindung mit Elektrokauter eine Explosion ausloesen koennte."
    ),

    // Question 3
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einem koronaren Bypass?",
        answerA = "Ein kuenstliches Herzventil aus Titan",
        answerB = "Eine Bruecke aus Blutgefaess, die eine verengte Koronararterie umgeht",
        answerC = "Ein Stent, der in die Koronararterie eingesetzt wird",
        answerD = "Eine Laserbehandlung zur Kalkentfernung aus Arterien",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Beim aortokoronaren Bypass wird ein entnohmenes Blutgefaess (meist Vena saphena magna oder A. mammaria interna) als Umgehungskreislauf an die Aorta und distal der Stenose angeschlossen.",
        funFact = "Die linke A. mammaria interna (LIMA) ist das bevorzugte Bypass-Gefaess, weil sie eine 10-Jahres-Offenheitsrate von ueber 90 % hat -- Venenbypaesse erreichen nur etwa 50 %."
    ),

    // Question 4
    Question(
        categoryId = 16,
        questionText = "Was ist ein koronarer Stent und bei welchem Eingriff wird er platziert?",
        answerA = "Ein Drahtgeflecht, das bei der perkutanen Koronarintervention (PCI) in eine verengte Koronararterie eingefuehrt wird",
        answerB = "Ein Kunststoffroehrchen, das bei Bypass-Operationen eingelegt wird",
        answerC = "Ein Medikamentenpflaster auf der Herzaussenwand",
        answerD = "Ein elektrisches Implantat zur Rhythmuskontrolle",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Bei der PCI (Ballondilatation) wird ein Ballonkatheter in die Koronararterie vorgeschoben, aufgeblasen und der Stent freigesetzt -- er haelt das Gefaess dauerhaft offen.",
        funFact = "Drug-eluting Stents (DES) sind mit Medikamenten beschichtet, die eine Wiederverengung (Restenose) verhindern -- sie haben die Wiederverschlussrate von 30 % auf unter 5 % gesenkt."
    ),

    // Question 5
    Question(
        categoryId = 16,
        questionText = "Welches Organ hat die laengste Wartezeit auf der Eurotransplant-Warteliste?",
        answerA = "Herz",
        answerB = "Leber",
        answerC = "Niere",
        answerD = "Lunge",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Nierenerkrankte koennen durch Dialyse jahrelang ueberleben, weshalb sich eine grosse Warteliste aufbaut -- die durchschnittliche Wartezeit fuer eine Niere betraegt in Deutschland 7-10 Jahre.",
        funFact = "In Deutschland stehen rund 8.000 Patienten auf der Warteliste fuer eine Niere, aber es werden jaehrlich nur etwa 1.500 Nierentransplantationen durchgefuehrt."
    ),

    // Question 6
    Question(
        categoryId = 16,
        questionText = "Was ist eine hyperakute Abstossungsreaktion nach Organtransplantation?",
        answerA = "Eine Abstossungsreaktion, die Monate nach der Transplantation einsetzt",
        answerB = "Eine durch vorgebildete Antikoerper vermittelte Abstossung innerhalb von Minuten bis Stunden",
        answerC = "Eine langsam fortschreitende Fibrose des transplantierten Organs",
        answerD = "Eine allergische Reaktion auf Immunsuppressiva",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Vorgebildete ABO-Antikoerper oder Anti-HLA-Antikoerper des Empfaengers binden sofort an Endothelzellen des Spenderorgans und aktivieren Komplement -- das fuehrt zu Thrombose und Organverlust.",
        funFact = "Dank ABO-Typisierung und Kreuzprobe (Crossmatch) ist die hyperakute Abstossungsreaktion heute eine Raritaet -- vor deren Einfuehrung kam sie bei 5-10 % aller Transplantationen vor."
    ),

    // Question 7
    Question(
        categoryId = 16,
        questionText = "Welches Medikament ist der Grundpfeiler der Immunsuppression nach Organtransplantation?",
        answerA = "Metformin",
        answerB = "Ciclosporin A",
        answerC = "Amoxicillin",
        answerD = "Methotrexat",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Ciclosporin A hemmt die Calcineurin-Phosphatase und blockiert dadurch die IL-2-Produktion von T-Zellen -- es revolutionierte die Transplantationsmedizin ab den 1980er-Jahren.",
        funFact = "Ciclosporin wurde 1969 aus dem Bodenpilz Tolypocladium inflatum isoliert -- die Substanz wurde zuerst als Antimykotikum getestet und ihre Immunsuppression war ein Zufallsbefund."
    ),

    // Question 8
    Question(
        categoryId = 16,
        questionText = "Was messen T1- und T2-Gewichtung in der Magnetresonanztomographie?",
        answerA = "T1 misst die longitudinale Relaxationszeit, T2 die transversale Relaxationszeit der Protonen",
        answerB = "T1 misst die Strahlendosis, T2 den Kontrast",
        answerC = "T1 und T2 sind Bezeichnungen fuer verschiedene Magnetfeldstaerken",
        answerD = "T1 ist fuer Knochen, T2 ist fuer Weichteile zustaendig",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Nach einem HF-Impuls kehren die Protonen zurueck ins Gleichgewicht -- T1 beschreibt die Spin-Gitter-Relaxation (Laengsmagnetisierung), T2 die Spin-Spin-Relaxation (Quermagnetisierung).",
        funFact = "Fett erscheint in T1-Bildern hell (kurze T1-Zeit), Wasser dunkel -- in T2-Bildern ist es umgekehrt: Wasser erscheint hell, was besonders nuetzlich fuer Oedemdarstellung ist."
    ),

    // Question 9
    Question(
        categoryId = 16,
        questionText = "Was ist der wesentliche Unterschied zwischen CT und MRT hinsichtlich der Strahlenbelastung?",
        answerA = "CT und MRT haben gleiche Strahlenbelastung",
        answerB = "MRT strahlt staerker als CT",
        answerC = "CT verwendet ionisierende Roentgenstrahlung, MRT arbeitet mit Magnetfeldern und Radiowellen ohne ionisierende Strahlung",
        answerD = "CT benutzt Ultraschall, MRT Roentgenstrahlen",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "CT-Strahlung kann DNA-Schaeden verursachen und das Krebsrisiko minimal erhoehen -- ein Abdomen-CT entspricht etwa 400 Roentgenaufnahmen, waehrend MRT keinerlei ionisierende Strahlung einsetzt.",
        funFact = "Ein CT des Abdomens entspricht einer effektiven Dosis von ca. 8-10 mSv -- zum Vergleich: die natuerliche jaehrliche Strahlenbelastung in Deutschland betraegt ca. 2,1 mSv."
    ),

    // Question 10
    Question(
        categoryId = 16,
        questionText = "Was ist ein PET-CT und welcher Tracer wird am haeufigsten eingesetzt?",
        answerA = "Eine rein magnetische Bildgebung mit Jodkontrastmittel",
        answerB = "Eine Kombination aus Positronenemissionstomographie und CT, meist mit 18F-FDG als Tracer",
        answerC = "Ein Ultraschall-Verfahren mit radioaktivem Kontrastmittel",
        answerD = "Eine Szintigraphie kombiniert mit Roentgen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "18F-Fluordesoxyglukose (FDG) wird wie Glukose von stoffwechselaktiven Zellen aufgenommen -- Tumorzellen haben erhoehteten Glukosestoffwechsel und leuchten im PET hell auf.",
        funFact = "Das Positron, das beim FDG-Zerfall entsteht, trifft auf ein Elektron und erzeugt zwei 511-keV-Gammastrahlen in genau entgegengesetzter Richtung -- genau das nutzt der PET-Detektor zur Positionsbestimmung."
    ),

    // Question 11
    Question(
        categoryId = 16,
        questionText = "Was bedeutet CRP als Laborwert und warum ist er klinisch relevant?",
        answerA = "CRP (C-reaktives Protein) ist ein Entzuendungsmarker, der bei Infektion oder Gewebsschaden stark ansteigt",
        answerB = "CRP ist ein Leberwert, der bei Leberzirrhose ansteigt",
        answerC = "CRP ist ein Blutfettwert und Marker fuer das kardiovaskulaere Risiko",
        answerD = "CRP misst die Nierenfiltration",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Die Leber produziert CRP als Akute-Phase-Protein auf IL-6-Signal hin -- ein Anstieg von unter 5 auf ueber 100 mg/l innerhalb von 24-48 Stunden ist typisch fuer bakterielle Infektionen.",
        funFact = "Das hochsensitive CRP (hs-CRP) misst Werte im Mikrogramm-Bereich und wird als kardiovaskulaerer Risikomarker eingesetzt -- selbst leicht erhoehte Werte von 1-3 mg/l verdoppeln das Herzinfarktrisiko."
    ),

    // Question 12
    Question(
        categoryId = 16,
        questionText = "Was gibt der HbA1c-Wert an und warum ist er fuer Diabetiker so wichtig?",
        answerA = "Den aktuellen Blutzucker zum Zeitpunkt der Messung",
        answerB = "Den durchschnittlichen Blutzucker der letzten 2-3 Monate als Prozentsatz des glykierten Haemoglobins",
        answerC = "Die Insulinproduktion der Bauchspeicheldruse",
        answerD = "Den Haemoglobingehalt des Blutes",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Glukose bindet nicht-enzymatisch an Haemoglobin -- da Erythrozyten ca. 120 Tage leben, spiegelt HbA1c die mittlere Glukosebelastung dieser Zeit wider; ein Zielwert unter 7 % reduziert Folgeschaeden.",
        funFact = "Ein HbA1c von 7 % entspricht einem mittleren Blutzucker von ca. 154 mg/dl -- jeder Prozentpunkt HbA1c-Senkung reduziert das Risiko fuer diabetische Mikroangiopathie um etwa 35 %."
    ),

    // Question 13
    Question(
        categoryId = 16,
        questionText = "Was bedeutet eine erhoehte GOT (AST) und GPT (ALT) im Blut?",
        answerA = "Hinweis auf Nierenversagen",
        answerB = "Hinweis auf Leberzellschaeden, da diese Enzyme bei Zelluntergang ins Blut uebertreten",
        answerC = "Zeichen einer Schilddruesenunterfunktion",
        answerD = "Indikator fuer Herzinsuffizienz",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "GOT (AST) und GPT (ALT) sind intrazellulaere Leberenzyme -- bei Hepatozyten-Nekrose treten sie ins Blut ueber; ein GPT/GOT-Verhaeltnis unter 1 spricht eher fuer virale Hepatitis, ueber 2 fuer alkoholtoxischen Schaden.",
        funFact = "GPT (ALT) ist leberspezifischer als GOT -- GOT findet sich auch in Herzmuskel, Skelettmuskel und Erythrozyten, weshalb ein Herzinfarkt ebenfalls die GOT stark erhoehen kann."
    ),

    // Question 14
    Question(
        categoryId = 16,
        questionText = "Was ist das BRCA1/BRCA2-Gen und welche klinische Bedeutung hat eine Mutation?",
        answerA = "Ein Gen, das den Blutdruck reguliert -- Mutationen erhoehen das Hypertonierisiko",
        answerB = "Tumorsuppressorgene -- Mutationen erhoehen das Lebensrisiko fuer Brust- und Eierstockkrebs erheblich",
        answerC = "Ein Gen fuer den Cholesterinstoffwechsel",
        answerD = "Ein Gen fuer die Insulinproduktion",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "BRCA1/2 codieren fuer DNA-Reparaturproteine der homologen Rekombination -- Traegerinnen einer Keimbahnmutation haben ein Lebenszeitrisiko von 50-80 % fuer Brustkrebs und 20-40 % fuer Ovarialkarzinom.",
        funFact = "Angelina Jolie machte 2013 ihre praeventive bilaterale Mastektomie und Oophorektomie oeffentlich -- sie traegt eine BRCA1-Mutation und senkte damit ihr Brustkrebsrisiko von etwa 87 % auf unter 5 %."
    ),

    // Question 15
    Question(
        categoryId = 16,
        questionText = "Was ist Praenataldiagnostik und welche invasiven Methoden gibt es?",
        answerA = "Untersuchungen waehrend der Geburt zur Ueberwachung des Kindes",
        answerB = "Untersuchungen waehrend der Schwangerschaft -- invasive Methoden sind Amniozentese und Chorionzottenbiopsie",
        answerC = "Genetische Tests vor der Empfaengnis",
        answerD = "Neugeborenenscreening in der ersten Lebenswoche",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei der Amniozentese wird ab der 16. SSW Fruchtwasser entnommen, bei der Chorionzottenbiopsie ab der 11. SSW Plazentagewebe -- beide liefern fetale Zellen fuer chromosomale Analysen.",
        funFact = "Der nicht-invasive Praenataltest (NIPT) analysiert zellfreie fetale DNA im muetterlichen Blut -- seit 2022 ist er in Deutschland als Kassenleistung erstattungsfaehig und hat das Fehlgeburtsrisiko invasiver Tests fuer die meisten Frauen ueberflussig gemacht."
    ),

    // Question 16
    Question(
        categoryId = 16,
        questionText = "Was ist PCR (Polymerase-Kettenreaktion) in der medizinischen Diagnostik?",
        answerA = "Ein Bluttest zur Messung von Entzuendungswerten",
        answerB = "Ein Verfahren zur Vervielfaeltigung spezifischer DNA-Abschnitte zum Nachweis von Erregern",
        answerC = "Eine bildgebende Methode fuer Chromosomenanalyse",
        answerD = "Ein Allergietest mit Hautreaktion",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "PCR amplifiziert durch wiederholte Zyklen aus Denaturierung, Annealing und Extension spezifische DNA-Sequenzen milliardenfach -- damit koennen selbst minimale Erregermengen nachgewiesen werden.",
        funFact = "Die PCR wurde 1983 von Kary Mullis entwickelt, der dafuer 1993 den Chemie-Nobelpreis erhielt -- er soll die Idee waehrend einer Autofahrt auf dem Highway 128 in Nordkalifornien gehabt haben."
    ),

    // Question 17
    Question(
        categoryId = 16,
        questionText = "Wie funktioniert ein Herzschrittmacher?",
        answerA = "Er gibt elektrische Impulse ab, wenn die Herzfrequenz unter einen programmierten Grenzwert faellt",
        answerB = "Er reguliert den Blutdruck durch Medikamentenabgabe",
        answerC = "Er massiert den Herzmuskel mechanisch von innen",
        answerD = "Er filtert Blutgerinnsel aus den Koronararterien",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Der Schrittmacher erkennt via Elektrode die intrinsische Herzaktivitaet -- bleibt ein Impuls aus, gibt das Geraet einen Elektroimpuls ab, der die Herzkontraktion ausloest.",
        funFact = "Der erste implantierbare Herzschrittmacher wurde 1958 von Ake Senning implantiert -- der Patient Arne Larsson lebte bis 2001 und ueberlebte mehrere seiner Herzchirurgen."
    ),

    // Question 18
    Question(
        categoryId = 16,
        questionText = "Was ist ein Cochlea-Implantat und fuer wen ist es geeignet?",
        answerA = "Ein Hoergeraet fuer leichten Hoerverlust, das Schall verstaerkt",
        answerB = "Ein elektronisches Implantat, das den Hoerinnennerv direkt stimuliert und fuer taube oder hochgradig schwerhoeerige Patienten geeignet ist",
        answerC = "Eine Druckkammer-Therapie fuer Tinnitus",
        answerD = "Ein Knochenleitungs-Hoergeraet am Schaedel",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das CI umgeht die defekten Haarzellen der Cochlea und stimuliert den N. cochlearis direkt elektrisch -- es besteht aus einem externen Sprachprozessor und einem implantierten Empfaenger-Stimulator.",
        funFact = "Weltweit tragen ueber 700.000 Menschen ein Cochlea-Implantat -- bei Kindern, die im ersten Lebensjahr implantiert werden, ist der Spracherwerb fast normal, weil die neuronale Plastizitaet noch sehr hoch ist."
    ),

    // Question 19
    Question(
        categoryId = 16,
        questionText = "Wie funktioniert eine Insulinpumpe bei Typ-1-Diabetes?",
        answerA = "Sie gibt taeglich eine einmalige Insulindosis injiziert ab",
        answerB = "Sie liefert kontinuierlich eine basale Insulinrate subkutan und ermooeglicht Bolusabgabe vor Mahlzeiten",
        answerC = "Sie misst Blutzucker und gibt bei Bedarf Glukose ab",
        answerD = "Sie stimuliert die verbliebenen Betazellen mit elektrischen Impulsen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Pumpe ahmt die physiologische Insulinsekretion nach -- die Basalrate laeuft kontinuierlich, Bolusmengen werden manuell oder automatisch vor Mahlzeiten abgerufen.",
        funFact = "Moderne Closed-Loop-Systeme (kuenstliche Bauchspeicheldruse) kombinieren kontinuierliches Glukosemonitoring (CGM) mit der Insulinpumpe und regeln die Dosis automatisch -- sie werden deshalb auch als Hybrid-Closed-Loop bezeichnet."
    ),

    // Question 20
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen Allgemeinanasthesie und Spinalanasthesie?",
        answerA = "Allgemeinanasthesie schaltet das Bewusstsein aus, Spinalanasthesie betaeubt durch Injektion in den Subarachnoidalraum nur die untere Koerperhaelfte",
        answerB = "Allgemeinanasthesie ist fuer kleine Eingriffe, Spinalanasthesie fuer grosse Operationen",
        answerC = "Beide Verfahren sind identisch, nur die Dosierung unterscheidet sich",
        answerD = "Spinalanasthesie ist eine Art der Vollnarkose mit kuerzerer Wirkdauer",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Bei der Spinalanasthesie wird ein Lokalanasthetikum in den Liquorraum injiziert und blockiert Nervenwurzeln unterhalb des Injektionsniveaus -- der Patient bleibt wach und atmet selbstaendig.",
        funFact = "Die Spinalanasthesie wurde erstmals 1898 von August Bier durchgefuehrt -- er testete die Methode an sich selbst und seinem Assistenten und berichtete, dass er trotz Hammerschlaegen auf das Schienbein keinen Schmerz spuerelte."
    ),

    // Question 21
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen Spinalanasthesie und Epiduralanasthesie?",
        answerA = "Es gibt keinen Unterschied, beide Begriffe bezeichnen dasselbe",
        answerB = "Spinal: Injektion in den Subarachnoidalraum (Liquor), Epidural: Injektion in den Epiduralraum ausserhalb der Dura mater",
        answerC = "Spinal wirkt am Arm, Epidural am Bein",
        answerD = "Spinal ist fuer Kinder, Epidural fuer Erwachsene",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei der Spinalanasthesie tritt das Lokalanasthetikum direkt in den Liquor cerebrospinalis ein und wirkt schneller und sicherer dosierbar -- die Epiduralanasthesie ermooglicht eine kontinuierliche Nachinfusion ueber Katheter.",
        funFact = "Die Periduralanasthesie unter der Geburt (PDA) ist eine Epiduralanasthesie -- durch den liegenden Katheter kann die Dosierung bedarfsgerecht angepasst werden, ohne erneut stechen zu muessen."
    ),

    // Question 22
    Question(
        categoryId = 16,
        questionText = "Was ist das Manchester-Triage-System (MTS)?",
        answerA = "Ein Punktesystem fuer die Warteliste bei Organtransplantationen",
        answerB = "Ein strukturiertes Ersteinschaetzungssystem in der Notaufnahme mit 5 Dringlichkeitsstufen",
        answerC = "Ein Protokoll fuer die Reanimation ausserhalb des Krankenhauses",
        answerD = "Eine Klassifikation fuer Verbrennungsgrade",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das MTS klassifiziert Patienten in 5 Farben (rot/orange/gelb/gruen/blau) mit maximalen Wartezeiten von 0/10/30/90/120 Minuten -- es wurde 1996 in Manchester entwickelt.",
        funFact = "Ohne Triage-System muss der erstgekommene Patient zuerst behandelt werden -- MTS ermoeglicht, dass ein Schlaganfallpatient (orange) vor einem Patienten mit eingewachsenem Zehennagel (gruen) drankommt, unabhaengig von der Ankunftsreihenfolge."
    ),

    // Question 23
    Question(
        categoryId = 16,
        questionText = "Was ist die Indikation fuer eine endotracheale Intubation?",
        answerA = "Jeder Patient in der Notaufnahme zur Sicherheit",
        answerB = "Sicherung der Atemwege bei bewusstlosen, ateminsuffizienten oder aspirationsgefaehrdeten Patienten",
        answerC = "Schmerztherapie bei schweren Verletzungen",
        answerD = "Verabreichung von Medikamenten bei fehlenden Venenzugaengen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der Tubus wird durch den Kehlkopf in die Trachea eingefuehrt und mit einem Cuff geblockt -- er sichert den Atemweg, verhindert Aspiration und ermooglicht kontrollierte Beatmung.",
        funFact = "Die Rapid Sequence Induction (RSI) mit Succinylcholin und einem Hypnotikum ermoeglicht eine Intubation innerhalb von 60 Sekunden -- ein zertifizierter Intensivmediziner braucht oft weniger als 20 Sekunden."
    ),

    // Question 24
    Question(
        categoryId = 16,
        questionText = "Bei welchem Rhythmus ist eine Defibrillation (Elektroschock) lebensrettend?",
        answerA = "Asystolie (kein Herzstrom sichtbar)",
        answerB = "Sinusrhythmus mit Bradykardie",
        answerC = "Kammerflimmern und pulslose Kammertachykardie",
        answerD = "AV-Block III. Grades",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Kammerflimmern ist ein chaotischer Rhythmus ohne effektive Auswurfleistung -- der Defibrillationsschock depolarisiert simultan alle Herzmuskelzellen und ermooglicht dem Sinusknoten, den Takt wieder zu uebernehmen.",
        funFact = "Die Ueberlebenschance bei Kammerflimmern sinkt pro Minute ohne Defibrillation um 10 % -- mit einem AED innerhalb von 3-5 Minuten kann die Ueberlebensrate ueber 70 % betragen."
    ),

    // Question 25
    Question(
        categoryId = 16,
        questionText = "Was ist eine Angiographie und wozu wird sie eingesetzt?",
        answerA = "Eine Ultraschalluntersuchung des Herzens",
        answerB = "Eine Blutgefaessdarstellung mittels Roentgen und Kontrastmittel zur Diagnostik und Therapie von Gefaesserkrankungen",
        answerC = "Eine Biopsie aus Blutgefaesswandgewebe",
        answerD = "Ein EKG unter koerperlicher Belastung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Iodhaltiges Kontrastmittel wird in das Gefaess injiziert und macht es im Roentgenbild sichtbar -- Angiographie wird diagnostisch (Stenosen, Aneurysmen) und interventionell (PTA, Stentplatzierung) eingesetzt.",
        funFact = "Die erste Hirnangiographie fuehrte Egas Moniz 1927 durch -- er erhielt dafuer jedoch erst 1949 den Nobelpreis, obwohl er zuvor auch fuer die umstrittene Lobotomie bekannt wurde."
    ),

    // Question 26
    Question(
        categoryId = 16,
        questionText = "Was ist ein Troponin-Test und wann ist er positiv?",
        answerA = "Ein Schilddruesentest bei Verdacht auf Hyperthyreose",
        answerB = "Ein hochspezifischer Herzmuskelmarker, der bei Herzinfarkt durch Untergang von Myozyten ins Blut uebertritt",
        answerC = "Ein Test auf Blutgerinnungsstoerungen",
        answerD = "Ein Entzuendungsparameter fuer Autoimmunerkrankungen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Troponin I und T sind Strukturproteine des Herzmuskelzellskeletts -- bei Myokardnekrose werden sie freigesetzt; hochsensitive Troponin-Tests koennen schon 1-2 Stunden nach Infarktereignis erhoehte Werte detektieren.",
        funFact = "Das hochsensitive Troponin (hs-Troponin) hat die Creatinkinase (CK-MB) als Goldstandard der Herzinfarktdiagnostik fast vollstaendig abgeloest -- es ist etwa 100-fach empfindlicher als aeltere Messmethoden."
    ),

    // Question 27
    Question(
        categoryId = 16,
        questionText = "Was ist eine laparoskopische Cholezystektomie?",
        answerA = "Entfernung des Blinddarms durch einen kleinen Bauchschnitt",
        answerB = "Minimalinvasive Entfernung der Gallenblase durch 3-4 kleine Schnitte im Bauch",
        answerC = "Laserbehandlung von Gallensteinen ohne Operation",
        answerD = "Endoskopische Entfernung von Gallensteinen aus dem Gallengang",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Vier Trokar-Zugaenge (10 mm Nabel, 5 mm epigastrisch, 5 mm rechts) ermoeglichen die Praeparation und Durchtrennung von Zystikusarterien und -gang -- die Gallenblase wird durch den Nabelzugang geborgen.",
        funFact = "Die laparoskopische Cholezystektomie ist heute der haeufigste Baucheingriff weltweit -- in Deutschland werden jaehrlich etwa 180.000 Gallenblasens entfernt, davon ueber 90 % laparoskopisch."
    ),

    // Question 28
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen einer Leber- und einer Nierentransplantation hinsichtlich der Organquelle?",
        answerA = "Beide Organe koennen nur von Hirntotspendern entnommen werden",
        answerB = "Nieren koennen auch von Lebendspendern entnommen werden, eine Lebendleberspende ist ebenfalls moeglich (Teilspende), aber seltener",
        answerC = "Lebern koennen nur von Lebendspendern entnommen werden",
        answerD = "Nieren koennen nicht von Lebendspendern gespendet werden",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Nierenlebendspende ist etabliert, da Spender mit einer Niere normal leben koennen -- Leberlebendspende nutzt die Regenerationsfaehigkeit der Leber, wobei der Spender ca. 60 % der Leber behaelt.",
        funFact = "Die Leber ist das einzige Organ, das sich nach Resektion vollstaendig regenerieren kann -- schon 6-8 Wochen nach einer Hemihepatektomie hat die verbleibende Lebermasse ihr urspruengliches Volumen wiedererlangt."
    ),

    // Question 29
    Question(
        categoryId = 16,
        questionText = "Welche Kontraindikation gilt absolut fuer eine MRT-Untersuchung?",
        answerA = "Klaustrophobie",
        answerB = "Taktlos aktive Herzschrittmacher (nicht MRT-kompatibel)",
        answerC = "Schwangerschaft im dritten Trimester",
        answerD = "Alter unter 18 Jahren",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das starke Magnetfeld kann nicht-MRT-kompatible Herzschrittmacher umprogrammieren oder deaktivieren -- auch ferromagnetische Implantate (aeltere Aneurysmaclips) koennen sich bewegen und Gewebe verletzen.",
        funFact = "Moderne MRT-kompatible Herzschrittmacher (Conditional-Geraete) ermoeglichen die Bildgebung unter bestimmten Bedingungen -- seit etwa 2011 werden fast ausschliesslich solche Geraete implantiert."
    ),

    // Question 30
    Question(
        categoryId = 16,
        questionText = "Was ist die Bedeutung des Kreatininwertes im Blut?",
        answerA = "Ein Marker fuer Muskelmasse ohne klinische Relevanz",
        answerB = "Ein Abbauprodukt des Kreatinstoffwechsels, dessen Serumkonzentration die glomerulaere Filtrationsrate (GFR) der Nieren widerspiegelt",
        answerC = "Ein Entzuendungsmarker wie CRP",
        answerD = "Ein Marker fuer den Leberstoffwechsel",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Kreatinin wird konstant produziert und ausschliesslich renal ausgeschieden -- ein Anstieg des Serumkreatinins zeigt eine reduzierte GFR an; jedoch verdoppelt sich der Kreatininwert erst, wenn ca. 50 % der Nierenfunktion verloren ist.",
        funFact = "Die MDRD- und CKD-EPI-Formeln berechnen aus Kreatinin, Alter, Geschlecht und Ethnie die eGFR -- diese ist praeziser als Kreatinin allein, da altere Menschen weniger Muskelmasse haben und damit ein normales Kreatinin eine verdeckte Niereninsuffizienz maskieren kann."
    ),

    // Question 31
    Question(
        categoryId = 16,
        questionText = "Was ist ein Transient Ischemic Attack (TIA) und wie unterscheidet er sich vom Schlaganfall?",
        answerA = "TIA ist ein leichter Herzinfarkt, der spontan heilt",
        answerB = "TIA ist ein kurz andauernder ischaemischer Hirnanfall ohne bleibende Neurologie -- klinisch wie ein Schlaganfall, aber Symptome bilden sich innerhalb von 24 Stunden vollstaendig zurueck",
        answerC = "TIA ist ein epileptischer Anfall mit kurzzeitigem Bewusstseinsverlust",
        answerD = "TIA beschreibt eine vorueebergehende Herzrhythmusstoerung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Beim TIA liegt eine kurze zerebrale Ischaemie vor -- da kein bleibender Infarkt entsteht, erholen sich die Symptome vollstaendig; dennoch ist das Schlaganfall-Risiko in den folgenden 48 Stunden stark erhoeht.",
        funFact = "Das Schlaganfallrisiko nach TIA ist in den ersten 2 Tagen am hoechsten -- 10-15 % aller TIA-Patienten erleiden innerhalb von 3 Monaten einen echten Schlaganfall; die sofortige ABCD2-Score-Berechnung entscheidet ueber stationaere Aufnahme."
    ),

    // Question 32
    Question(
        categoryId = 16,
        questionText = "Was ist das ERCP-Verfahren?",
        answerA = "Endoskopische Retrograde Cholangiopankreatographie -- Darstellung von Gallen- und Pankreasgang via Endoskop und Kontrastmittel",
        answerB = "Elektronische Reflexions-Computertomographie des Pankreas",
        answerC = "Extrarenale Reinigung durch Peritonealdialyse",
        answerD = "Elektrokardiographische Ruhepruefung fuer Coronarparameter",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Das Endoskop wird durch Magenmund und Duodenum bis zur Papilla Vateri vorgeschoben -- dann werden Kontrastmittel injiziert und Steine extrahiert, Strikturen dilatiert oder Stents eingelegt.",
        funFact = "ERCP ersetzt in vielen Faellen die offene Gallengang-Operation -- die Papillotomie (Durchtrennung des Papillensphinkters) ermoeglicht den Abgang von Gallensteinen unter 1 cm spontan oder mit Koerbchen."
    ),

    // Question 33
    Question(
        categoryId = 16,
        questionText = "Welche Art der Allgemeinanasthesie unterscheidet man hinsichtlich der Atemwegssicherung?",
        answerA = "Nur Intubationsnarkose und Spinalanasthesie",
        answerB = "Maskennarkose, Larynxmasken-Anasethesie und endotracheale Intubationsnarkose",
        answerC = "Nur Inhalations- und Injektionsnarkose",
        answerD = "Lokalanasthesie, Regionalanasthesie und Allgemeinanasthesie",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Larynxmaske (LMA) liegt supraglottisch und sichert die Atemwege weniger invasiv als ein Endotrachealtubus -- sie ist Standard fuer kurze Eingriffe ohne Aspirationsrisiko.",
        funFact = "Die Larynxmaske wurde 1981 von Archie Brain entwickelt -- er fertigte erste Prototypen in seiner Kueche und soll dabei eine gefrorene Magenleiche als anatomische Vorlage genutzt haben."
    ),

    // Question 34
    Question(
        categoryId = 16,
        questionText = "Was ist ein implantierbarer Kardioverter-Defibrillator (ICD)?",
        answerA = "Ein Herzschrittmacher fuer Bradyarrhythmien",
        answerB = "Ein implantiertes Geraet, das Kammerflimmern und ventrikulaere Tachykardien erkennt und durch Elektroschock oder Ueberstimulation terminiert",
        answerC = "Ein Blutdruckmessgeraet unter der Haut",
        answerD = "Ein Geraet zur kontinuierlichen Koronarfluss-Messung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der ICD analysiert kontinuierlich den Herzrhythmus -- erkennt er ein lebensbedrohliches Flimmern, versucht er zuerst die Ueberstimulation (ATP), bei Versagen gibt er einen internen Schock von 20-40 Joule ab.",
        funFact = "Dick Cheney, ehemaliger US-Vizepraesident, trug ab 2001 einen ICD -- 2013 liess er dessen WLAN-Funktion deaktivieren, nachdem ein Hackerangriff auf ICDs theoretisch als Mordmethode beschrieben worden war."
    ),

    // Question 35
    Question(
        categoryId = 16,
        questionText = "Was ist das FAST-Schema bei der Schlaganfall-Erkennung?",
        answerA = "Eine Bewertungsskala fuer Verbrennungsgrade",
        answerB = "Eine Ultraschallmethode zur schnellen Bauchraumdiagnostik bei Trauma",
        answerC = "Ein Mnemonic: Face (Gesichtslahmung), Arm (Armlahmung), Speech (Sprachstoerung), Time (Notruf-Zeit) zur Schlaganfall-Erkennung",
        answerD = "Ein Triage-Score fuer polytraumatisierte Patienten",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "FAST hilft Laien, Schlaganfallsymptome schnell zu erkennen -- jede Stunde Verzoegerung bei ischaemischem Schlaganfall bedeutet den Verlust von ca. 120 Millionen Neuronen.",
        funFact = "Time is Brain -- beim ischaemischen Schlaganfall wird das Thrombolyse-Fenster von 4,5 Stunden nach Symptombeginn genutzt; je frueher die Therapie, desto besser das Outcome."
    ),

    // Question 36
    Question(
        categoryId = 16,
        questionText = "Was ist eine perkutane transluminale Angioplastie (PTA)?",
        answerA = "Ein offener Gefaesseratz durch eine Kunststoffprothese",
        answerB = "Eine minimalinvasive Ballondilatation von verengten Gefaessen ueber Katheter",
        answerC = "Eine Laserbehandlung von Venenthrombosen",
        answerD = "Eine Embolisation zur Behandlung von Aneurysmen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Ein Ballonkatheter wird in das verengte Gefaess (Stenose) eingefuehrt und aufgeblasen -- das komprimiert die Arteriosklerose-Plaque und erweitert das Gefaesslumen; danach wird oft ein Stent eingesetzt.",
        funFact = "Andreas Gruentzig fuehrte 1977 in Zuerich die erste koronare Ballondilatation durch -- der Patient soll auf dem Herzkatheter-Tisch wach gewesen sein und Gruentzig zugeschaut haben, wie sein Herzinfarkt-Risiko sank."
    ),

    // Question 37
    Question(
        categoryId = 16,
        questionText = "Was ist ein Blutausstrich und was kann man damit diagnostizieren?",
        answerA = "Eine Blutprobe fuer den Blutzuckertest",
        answerB = "Ein duenner Blutfilm auf einem Objekttraeger, der nach Farbung unter dem Mikroskop Zellmorphologie und Blutparasiten zeigt",
        answerC = "Eine spezielle Blutabnahme fuer Gerinnungsanalysen",
        answerD = "Ein Verfahren zur Blutgruppenbestimmung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der Ausstrich ermoeglicht die Beurteilung von Erythrozytenmorphologie (Sichelzellen, Targetzellen), Thrombozytenaggregaten und Leukozytenveraenderungen sowie den Nachweis von Plasmodien bei Malaria.",
        funFact = "Die Wright-Farbung und die Giemsa-Farbung sind Standardmethoden fuer Blutausstriche -- Paul Ehrlich entwickelte Ende des 19. Jahrhunderts die ersten Zellfarber und gilt damit als Vater der Haematologie."
    ),

    // Question 38
    Question(
        categoryId = 16,
        questionText = "Was ist eine Bronchoskopie und wann wird sie eingesetzt?",
        answerA = "Eine Magenspiegelung zur Diagnostik von Speiseroehrenkrankheiten",
        answerB = "Eine endoskopische Untersuchung der Atemwege bis in die Bronchien, eingesetzt bei Verdacht auf Lungenkrebs, Fremdkoerper oder zur Gewebeentnahme",
        answerC = "Eine Lungenfunktionsmessung durch Atemmaneuver",
        answerD = "Eine Blutgasanalyse aus den Lungenvenen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das flexible Bronchoskop wird durch Nase oder Mund bis in die Segmentbronchien gefuehrt -- es ermooglicht visuelle Beurteilung, Biopsien, bronchoalvelaere Lavage und therapeutische Interventionen.",
        funFact = "Die starre Bronchoskopie wird unter Vollnarkose fuer grosse Interventionen verwendet (Stentplatzierung, massive Blutungen) -- das flexible Bronchoskop kann sogar unter Lokalanasthesie ambulant durchgefuehrt werden."
    ),

    // Question 39
    Question(
        categoryId = 16,
        questionText = "Was ist ein Knochenmarkspunktat und wann ist es indiziert?",
        answerA = "Eine Biopsie aus der Wirbelknochen bei Osteoporose-Verdacht",
        answerB = "Eine Entnahme von Knochenmark aus dem Beckenkamm oder Sternum zur Diagnostik von Blutkrebs, Anaemien und Speicherkrankheiten",
        answerC = "Eine Injektion von Wachstumsfaktoren in das Knochenmark",
        answerD = "Eine Messung der Knochendichte mit Isotopen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Aspirationszytologie und Trepanbiopsie des Knochenmarks sind bei Verdacht auf Leukamie, Lymphom, Myelom oder aplastische Anaemie indiziert -- sie geben Auskunft ueber Reife, Verteilung und Morphologie der Blutzellvorstufen.",
        funFact = "Das Knochenmark eines Erwachsenen produziert taeglich ca. 200 Milliarden Erythrozyten, 10 Milliarden Leukozyten und 400 Milliarden Thrombozyten -- eine unvorstellbare Fertigungskapazitaet im blutbildenden Gewebe."
    ),

    // Question 40
    Question(
        categoryId = 16,
        questionText = "Was ist eine interventionelle Radiologie?",
        answerA = "Die Auswertung radiologischer Befunde ohne Patientenkontakt",
        answerB = "Ein Fachgebiet, das bildgefuehrte minimalinvasive Eingriffe durchfuehrt (z.B. Drainagen, Embolisationen, Stents) ohne offene Chirurgie",
        answerC = "Die Herstellung von Kontrastmitteln fuer die Bildgebung",
        answerD = "Die Planung von Strahlentherapien mit CT-Unterstuetzung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Interventionelle Radiologen nutzen Fluoroskopie, CT oder Ultraschall als Echtzeit-Bildgebung, um Katheter, Nadeln oder Geraete praezise zu platzieren -- viele Eingriffe, die frueher OP erforderten, sind heute so ambulant moeglich.",
        funFact = "Die transjugulaere intrahepatische portosystemische Shunt-Anlage (TIPS) -- ein stentgestuetzter Kanal durch die Leber -- kann lebensbedrohliche Varizenblutungen bei Leberzirrhose behandeln, ohne den Bauch zu eroeffnen."
    ),

    // Question 41
    Question(
        categoryId = 16,
        questionText = "Was ist die Bedeutung des INR-Wertes in der Blutgerinnung?",
        answerA = "Er misst die Thrombozytenzahl im Blut",
        answerB = "Er ist ein standardisierter Wert fuer die Prothrombinzeit und misst die Aktivitaet des extrinsischen Gerinnungsweges -- relevant fuer die Marcumar-Steuerung",
        answerC = "Er misst die Haemoglobinkonzentration",
        answerD = "Er ist ein Marker fuer Thrombozytenaktivierung",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "INR 1,0 entspricht normaler Gerinnung -- Patienten unter Vitamin-K-Antagonisten (Marcumar) werden auf INR 2,0-3,0 eingestellt; ein INR ueber 4,0 bedeutet stark erhoehtes Blutungsrisiko.",
        funFact = "Der INR wurde eingefuehrt, weil Thromboplastin-Reagenzien zwischen Labors variierten und der rohe Quick-Wert nicht vergleichbar war -- der INR-Wert ist international normiert und ermoeglicht weltweite Vergleichbarkeit."
    ),

    // Question 42
    Question(
        categoryId = 16,
        questionText = "Was ist eine Positronenemissionstomographie (PET) im Unterschied zur Szintigraphie?",
        answerA = "Beide Verfahren sind identisch, nur der Tracer unterscheidet sich",
        answerB = "PET nutzt Positronen-emittierende Tracer und misst koinzidente 511-keV-Gammastrahlen fuer hohe Aufloesung; Szintigraphie nutzt direkte Gammastrahler und hat niedrigere Aufloesung",
        answerC = "Szintigraphie misst Sauerstoffaufnahme, PET den Glukosestoffwechsel",
        answerD = "PET ist eine MRT-Variante, Szintigraphie eine CT-Variante",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Beim Positronen-Zerfall entsteht ein Elektron-Positron-Paar, das zwei exakt entgegengesetzte 511-keV-Photonen emittiert -- der Koinzidenzdetektor lokalisiert daraus praezise den Zerfallsort.",
        funFact = "Das PET-CT kombiniert funktionelle (PET) und anatomische (CT) Information in einem Scan -- es hat die Tumorstaging-Genauigkeit revolutioniert und ist heute Standard bei Lymphomen, Lungenkrebs und Melanomen."
    ),

    // Question 43
    Question(
        categoryId = 16,
        questionText = "Was ist das Ziel der Immunsuppression nach Transplantation und welches Risiko geht damit einher?",
        answerA = "Foerderung der Wundheilung -- Risiko: Narbenbildung",
        answerB = "Verhinderung der Abstossungsreaktion -- Risiko: erhoehte Anfaelligkeit fuer Infektionen und Tumoren",
        answerC = "Verbesserung der Organdurchblutung -- Risiko: Hypotonie",
        answerD = "Schmerztherapie nach OP -- Risiko: Abhaengigkeit",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Immunsystem muss dauerhaft supprimiert werden, um das Spenderorgan zu tolerieren -- dadurch werden auch Abwehrmechanismen gegen Erreger und entartete Zellen gehemmt.",
        funFact = "Transplantationspatienten haben ein 3-5-fach erhoehtes Risiko fuer bestimmte Krebsarten -- besonders Hautkrebs (durch EBV und HPV ohne ausreichende Immunabwehr) und posttransplantaeres lymphoproliferatives Syndrom (PTLD)."
    ),

    // Question 44
    Question(
        categoryId = 16,
        questionText = "Was ist eine Liquorpunktion (Lumbalpunktion) und welche Erkrankungen kann sie nachweisen?",
        answerA = "Eine Blutentnahme aus der Halsvene zur Diagnostik von Schilddruesenerkrankungen",
        answerB = "Eine Entnahme von Rueckenmarksflussigkeit aus dem Lumbalkanal zur Diagnostik von Meningitis, Multiple Sklerose und Subarachnoidalblutung",
        answerC = "Eine Biopsie des Rueckenmarks fuer Tumordiagnostik",
        answerD = "Eine Injektion von Analgetika in den Spinalkanal",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Liquor cerebrospinalis wird zwischen L3/L4 oder L4/L5 entnommen -- Trubung, erhoehte Leukozyten, erhoehtes Protein und erniedrigte Glukose weisen auf Meningitis hin; xanthochromer Liquor zeigt eine Subarachnoidalblutung.",
        funFact = "Der Schreiber des ersten Lehrbuchs der Neurologie, Silas Weir Mitchell, beschrieb 1874 das Phantomglieder-Phaenomen -- die Lumbalpunktion selbst wurde erst 1891 von Heinrich Quincke standardisiert."
    ),

    // Question 45
    Question(
        categoryId = 16,
        questionText = "Was ist eine Gastroskopie und welche Diagnosen koennen gestellt werden?",
        answerA = "Eine Dickdarmspiegelung zur Polypen-Vorsorge",
        answerB = "Eine endoskopische Spiegelung von Speiseroehre, Magen und Duermdarmkopf zur Diagnostik von Ulzera, Tumoren, Gastritis und Varizen",
        answerC = "Eine CT-Untersuchung des Magens mit Kontrastmittel",
        answerD = "Eine Ultraschalluntersuchung der Bauchorgane",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Endoskop wird per os in Oedsophagus, Magen und Duodenum eingefuehrt -- es ermoeglicht direkte Visualisierung, Biopsie, HP-Test und therapeutische Interventionen wie Blutstillung.",
        funFact = "Helicobacter pylori wurde 1982 von Barry Marshall und Robin Warren entdeckt -- Marshall trank eine Suspension des Bakteriums, um zu beweisen, dass es Magengeschwuere verursacht, was ihm 2005 den Nobelpreis einbrachte."
    ),

    // Question 46
    Question(
        categoryId = 16,
        questionText = "Was ist eine Nierenbiopsie und wann ist sie notwendig?",
        answerA = "Eine Nierensteinzertrummerung durch Schallwellen",
        answerB = "Eine ultraschallgefuehrte Gewebeentnahme aus der Niere zur histologischen Diagnose von Nierenerkrankungen wie Glomerulonephritis oder Transplantatabstossungen",
        answerC = "Eine Dialyse-Therapie bei akutem Nierenversagen",
        answerD = "Eine Kontrastmitteldarstellung der Nierenarterie",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Unter Ultraschallsicht wird eine Biopsienadel in die Nierenrinde eingefuehrt und ein Gewebezylinder entnommen -- die histologische Aufarbeitung mit Licht-, Immunfluoreszenz- und Elektronenmikroskopie klaert die genaue Nephropathie.",
        funFact = "Die Nierenbiopsie unterscheidet z.B. zwischen IgA-Nephropathie (haeufigste Glomerulopathie weltweit) und Lupusnephritis -- zwei Erkrankungen, die klinisch aehnlich, aber therapeutisch voellig unterschiedlich behandelt werden."
    ),

    // Question 47
    Question(
        categoryId = 16,
        questionText = "Was ist eine Embolisation in der interventionellen Radiologie?",
        answerA = "Die medikamentoese Auflosung eines Blutgerinnsels",
        answerB = "Das gezielte Verschliessen von Blutgefaessen mit Coils, Partikel oder Kleber -- eingesetzt bei Tumoren, Aneurysmen oder Blutungen",
        answerC = "Das Einbringen eines Stents in eine verengte Arterie",
        answerD = "Eine Drainage-Anlage bei Abszessen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Durch Katheter werden Embolisationsmaterialien praezise in Zielgefaesse eingebracht -- bei Lebertumouren als TACE (transarterielle Chemoembolisation) erhalten Tumorgesaesse gleichzeitig Chemotherapie und werden verschlossen.",
        funFact = "Uterusmyom-Embolisation (UFE) ist eine Alternative zur Hysterektomie -- 90 % der Patientinnen erleben deutliche Symptomlinderung, und der Eingriff dauert nur 45-60 Minuten ohne Schnitt."
    ),

    // Question 48
    Question(
        categoryId = 16,
        questionText = "Was misst das BNP (Brain Natriuretic Peptide) im Blut?",
        answerA = "Die Hirnaktivitaet und ist ein Marker fuer neurologische Erkrankungen",
        answerB = "Die Herzwandspannung -- erhoeht bei Herzinsuffizienz, da die ueberlasteten Ventrikel mehr BNP produzieren",
        answerC = "Den Blutzucker bei Diabetikern",
        answerD = "Den Natriumgehalt des Blutes bei Nierenkranken",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "BNP (und NT-proBNP) werden von Herzmuskelzellen bei erhoehter Wandspannung sezerniert -- Werte ueber 400 pg/ml sind stark verdaechtig auf Herzinsuffizienz; sie korrelieren mit NYHA-Stadium und Prognose.",
        funFact = "BNP heisst Brain Natriuretic Peptide, weil es 1988 zuerst im Schweinegehirn entdeckt wurde -- spaeter stellte sich heraus, dass es hauptsaechlich im Herzmuskel produziert wird; der Name blieb trotzdem."
    ),

    // Question 49
    Question(
        categoryId = 16,
        questionText = "Was ist eine Laparoskopie-assistierte Sigmaresektion?",
        answerA = "Eine Entfernung des Blinddarms durch offene Chirurgie",
        answerB = "Eine minimalinvasive Entfernung des Sigma-Dickdarmsegments, z.B. bei Divertikulitis oder Karzinom, mit laparoskopischer Praeparation und kleinem Hilfsschnitt",
        answerC = "Eine endoskopische Polypenentfernung aus dem Dickdarm",
        answerD = "Eine Magenbypass-Operation zur Gewichtsreduktion",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die laparoskopische Kolorektalchirurgie bietet gegenueber offener Chirurgie weniger Blutverlust, kuerzeren Krankenhausaufenthalt und schnellere Darmfunktionsrueckkehr -- die onkologischen Ergebnisse sind vergleichbar.",
        funFact = "Das Sigma (S-foermiger Dickdarm) ist die haeufigste Lokalisation fuer Divertikel und Divertikulitis -- etwa 30 % der Westeuropaeer ueber 60 haben Divertikel, meist asymptomatisch."
    ),

    // Question 50
    Question(
        categoryId = 16,
        questionText = "Was ist das SOFA-Score-System auf der Intensivstation?",
        answerA = "Ein Sitzkomfort-Bewertungssystem fuer Intensivbetten",
        answerB = "Ein Score zur Beurteilung des Schweregrades eines Multiorganversagens, der Funktion von 6 Organsystemen taeglich bewertet",
        answerC = "Ein Ernaehrungsprotokoll fuer beatmete Patienten",
        answerD = "Ein Hygiene-Bewertungssystem fuer Intensivstationen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "SOFA (Sequential Organ Failure Assessment) bewertet Atemfunktion, Gerinnung, Leber, Kreislauf, ZNS und Niere mit 0-4 Punkten pro System -- ein SOFA-Anstieg um 2 oder mehr definiert Sepsis gemaess den Sepsis-3-Kriterien.",
        funFact = "Der qSOFA (quick SOFA) mit nur 3 Parametern (Atemfrequenz, GCS, Blutdruck) kann am Patientenbett ohne Labor bestimmt werden und identifiziert Sepsis-Risikopatienten ausserhalb der Intensivstation innerhalb von Sekunden."
    )

)
