package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsExpert5(): List<Question> = listOf(

    // --- PSYCHOLOGIE-EXPERIMENTE: GEHORSAM & AUTORITÄT ---

    Question(
        categoryId = 11,
        questionText = "In Stanley Milgrams Gehorsamkeitsexperiment (1961): Welcher Prozentsatz der Versuchspersonen verabreichte die maximale Schockstärke von 450 Volt?",
        answerA = "35 %",
        answerB = "50 %",
        answerC = "65 %",
        answerD = "80 %",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Milgrams erschütterndes Ergebnis: 65 % der Probanden gehorchten der Autorität vollständig und verabreichten die maximale Schockstufe von 450 Volt — obwohl der vermeintliche 'Lernende' bereits bei 330 Volt keine Antworten mehr gab.",
        funFact = "Milgram hatte vor dem Experiment Psychiater befragt, die schätzten, dass maximal 1–2 % die volle Spannung anlegen würden. Das tatsächliche Ergebnis schockierte die gesamte Wissenschaftswelt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Institution war der ursprüngliche Durchführungsort des Milgram-Experiments?",
        answerA = "Harvard University",
        answerB = "Yale University",
        answerC = "Princeton University",
        answerD = "Columbia University",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Das Milgram-Experiment wurde 1961–1962 an der Yale University durchgeführt. Als Milgram das Experiment in einem unregistrierten Büro wiederholte, sank die Gehorsamkeitsrate von 65 % auf 47 % — die Autorität der Institution spielte also eine messbare Rolle.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Beim Milgram-Experiment: Was war der genaue Spannungsabstand zwischen den einzelnen Schockstufen?",
        answerA = "10 Volt",
        answerB = "15 Volt",
        answerC = "25 Volt",
        answerD = "50 Volt",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Die Schockmaschine hatte 30 Stufen, die jeweils um 15 Volt anstiegen — von 15 Volt bis zum Maximum von 450 Volt. Ab 75 Volt begann der (gespielte) Lernende zu stöhnen, ab 150 Volt protestierte er lautstark.",
        funFact = "Die Versuchspersonen zeigten extreme Stresssymptome: Schwitzen, Zittern, Stottern und in einigen Fällen unkontrollierbares Nervenlachen — obwohl kein einziger tatsächlich Schocks empfing."
    ),

    Question(
        categoryId = 11,
        questionText = "Das Stanford-Gefängnisexperiment wurde im August 1971 von Philip Zimbardo durchgeführt. Wie viele Tage war es ursprünglich geplant?",
        answerA = "7 Tage",
        answerB = "14 Tage",
        answerC = "21 Tage",
        answerD = "30 Tage",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Das Stanford-Gefängnisexperiment war ursprünglich auf zwei Wochen (14 Tage) angesetzt. Es musste jedoch bereits nach nur 6 Tagen abgebrochen werden, weil die 'Wärter' sadistisches Verhalten entwickelten und die 'Gefangenen' psychisch zusammenbrachen.",
        funFact = "Zimbardo übernahm selbst die Rolle des 'Gefängnisdirektors' — was seine Objektivität als Wissenschaftler stark beeinträchtigte. Seine damalige Freundin Christina Maslach war diejenige, die ihn zum Abbruch überredete."
    ),

    Question(
        categoryId = 11,
        questionText = "Wer waren die Co-Autoren des Stanford-Gefängnisexperiments neben Philip Zimbardo?",
        answerA = "Leon Festinger und James Carlsmith",
        answerB = "Craig Haney und Curtis Banks",
        answerC = "Solomon Asch und Muzafer Sherif",
        answerD = "John Watson und Rosalie Rayner",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Das Stanford-Gefängnisexperiment wurde von Philip Zimbardo zusammen mit seinen Doktoranden Craig Haney und Curtis Banks durchgeführt. Die Studie wurde 1973 veröffentlicht und ist unter dem Titel 'A Study of Prisoners and Guards in a Simulated Prison' bekannt.",
        funFact = null
    ),

    // --- KONFORMITÄT & GRUPPENDRUCK ---

    Question(
        categoryId = 11,
        questionText = "In Solomon Aschs Linienexperiment (1951): Wie viele Konföderierten (Schauspieler) waren pro Gruppe im Raum und gaben absichtlich falsche Antworten?",
        answerA = "3 Konföderierten",
        answerB = "5 Konföderierten",
        answerC = "7 Konföderierten",
        answerD = "10 Konföderierten",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "In Aschs Linienexperiment saßen 7 Konföderierten mit einer echten Versuchsperson zusammen. Bei einer eindeutig falschen Antwort der Konföderierten schlossen sich etwa 37 % der echten Versuchspersonen der Gruppenantwort an — obwohl die richtige Antwort offensichtlich war.",
        funFact = "Asch fand heraus: Schon ein einziger Abweichler in der Gruppe (ein Konföderierter, der die richtige Antwort gab) reduzierte die Konformitätsrate drastisch auf unter 10 %."
    ),

    Question(
        categoryId = 11,
        questionText = "Was wurde in Aschs Linienexperiment als Aufgabe gestellt?",
        answerA = "Die Länge verschiedener Linien vergleichen und einordnen",
        answerB = "Farben von Lichtern benennen",
        answerC = "Geometrische Figuren zeichnen",
        answerD = "Satzergänzungen wählen",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Die Probanden mussten angeben, welche von drei Vergleichslinien (A, B, C) genauso lang wie eine Standardlinie war. Die Aufgabe war bewusst einfach und eindeutig — Asch wollte zeigen, dass selbst bei offensichtlichen Fakten Gruppenkonformität auftreten kann.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Muzafer Sherifs 'Robbers Cave Experiment' (1954) untersuchte Gruppenkonflikt. An welchem Ort wurde es durchgeführt?",
        answerA = "In einem Schulgebäude in New Haven",
        answerB = "In einem Ferienlager im Robbers Cave State Park, Oklahoma",
        answerC = "In einem Gefängnissimulator in Stanford",
        answerD = "In einem Militärgelände in Virginia",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Sherifs Robbers Cave Experiment fand in einem echten Ferienlager im Robbers Cave State Park in Oklahoma statt. Zwölfjährige Jungen wurden in zwei Gruppen aufgeteilt ('Eagles' und 'Rattlers'), die zunächst getrennt agierten, dann in Konflikt gerieten und schließlich durch gemeinsame Ziele versöhnt wurden.",
        funFact = "Die Studie gilt als Vorläufer der 'Realistic Conflict Theory': Gruppen bekämpfen sich, wenn sie um begrenzte Ressourcen konkurrieren — und kooperieren, wenn sie gemeinsame Ziele verfolgen."
    ),

    // --- LERNEN & KONDITIONIERUNG ---

    Question(
        categoryId = 11,
        questionText = "Iwan Pawlow erhielt 1904 den Nobelpreis — aber NICHT für seine Arbeit zur klassischen Konditionierung. Wofür wurde er ausgezeichnet?",
        answerA = "Für die Entdeckung des Neurotransmitter-Systems",
        answerB = "Für seine Forschungen zur Physiologie der Verdauung",
        answerC = "Für die Entdeckung des Reflexbogens",
        answerD = "Für die Beschreibung des Nervensystems von Hunden",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Pawlow erhielt den Nobelpreis für Physiologie oder Medizin 1904 für seine Forschungen zur Physiologie der Verdauungsdrüsen. Die klassische Konditionierung entdeckte er dabei zufällig — er bemerkte, dass Hunde beim bloßen Anblick der Forscher zu speicheln begannen, noch bevor Futter gegeben wurde.",
        funFact = "Pawlow bestand bis zu seinem Tod darauf, dass Psychologie keine echte Wissenschaft sei. Er weigerte sich, psychologische Begriffe zu verwenden und sprach stets nur von 'bedingten Reflexen'."
    ),

    Question(
        categoryId = 11,
        questionText = "B. F. Skinner entwickelte die 'Skinner Box'. Was war die wichtigste Neuerung gegenüber Pawlows klassischer Konditionierung?",
        answerA = "Tiere lernten durch Beobachtung statt durch Belohnung",
        answerB = "Das Tier erzeugte die Konsequenz selbst durch sein aktives Verhalten (operante Konditionierung)",
        answerC = "Die Konditionierung erfolgte ohne Reiz-Reaktions-Schema",
        answerD = "Nur kognitive Prozesse wurden gemessen, keine Verhaltensänderungen",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Bei Pawlows klassischer Konditionierung reagiert das Tier passiv auf einen Reiz. Skinners operante Konditionierung (instrumentelles Lernen) zeigt: Verhalten, das positive Konsequenzen hat, wird wiederholt — das Tier handelt aktiv, um Belohnungen zu erhalten oder Bestrafungen zu vermeiden.",
        funFact = "Skinner entwarf im Zweiten Weltkrieg ein Projekt, in dem Tauben in Lenkraketen eingesetzt werden sollten ('Project Pigeon'). Die Tauben lernten tatsächlich, Ziele anzusteuern — das Militär finanzierte das Projekt jedoch nicht weiter."
    ),

    Question(
        categoryId = 11,
        questionText = "Albert Banduras Bobo-Doll-Experiment (1961) untersuchte Lernen durch Beobachtung. Wie viele Kinder nahmen an der Originalstudie teil?",
        answerA = "36 Kinder",
        answerB = "48 Kinder",
        answerC = "72 Kinder",
        answerD = "96 Kinder",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "An Banduras Bobo-Doll-Experiment nahmen 72 Kinder (36 Mädchen, 36 Jungen) aus der Stanford University Nursery School teil, im Alter von 3–6 Jahren. Kinder, die ein aggressives Modell beobachteten, zeigten signifikant mehr aggressive Verhaltensweisen gegenüber der aufblasbaren Puppe.",
        funFact = "Bandura entdeckte einen Geschlechterunterschied: Jungen imitierten physische Aggression häufiger als Mädchen — aber bei verbaler Aggression gab es kaum Unterschiede. Außerdem imitierten Kinder beider Geschlechter das männliche Modell häufiger als das weibliche."
    ),

    Question(
        categoryId = 11,
        questionText = "Das 'Little Albert'-Experiment (1920) von John Watson und Rosalie Rayner konditionierte ein Kleinkind auf Angst vor weißen Ratten. An welcher Universität wurde es durchgeführt?",
        answerA = "Yale University",
        answerB = "Columbia University",
        answerC = "Johns Hopkins University",
        answerD = "Stanford University",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Das Little-Albert-Experiment wurde 1920 von John Watson und seiner Assistentin Rosalie Rayner an der Johns Hopkins University durchgeführt. Es gilt als eines der ethisch verwerflichsten Experimente der Psychologiegeschichte — das Kind wurde mit Angst konditioniert und nie dekonditioniert.",
        funFact = "Watson und Rayner wurden beide von der Johns Hopkins University entlassen — allerdings nicht wegen des Experiments, sondern weil Watson eine Affäre mit seiner Doktorandin Rayner hatte. Er heiratete sie später."
    ),

    // --- KOGNITIVE PSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Leon Festinger beschrieb 1957 die kognitive Dissonanz. In seinem klassischen Experiment mit James Carlsmith (1959) zahlte er Probanden 1 oder 20 Dollar für eine Lüge. Welche Gruppe bewertete die langweilige Aufgabe nachher als interessanter?",
        answerA = "Die 20-Dollar-Gruppe, weil sie motivierter war",
        answerB = "Die 1-Dollar-Gruppe, weil sie die Dissonanz internalisieren musste",
        answerC = "Beide Gruppen gleichermaßen",
        answerD = "Keine Gruppe — die Aufgabe wurde von beiden als gleich langweilig bewertet",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Die 1-Dollar-Gruppe beurteilte die langweilige Aufgabe nachher als deutlich interessanter. Festinger erklärt: Wer für eine Lüge nur 1 Dollar bekommt, kann nicht auf die externe Rechtfertigung (das Geld) zurückgreifen — also ändert das Gehirn die eigene Einstellung, um die Dissonanz aufzulösen. 20 Dollar rechtfertigen die Lüge extern.",
        funFact = "Festingers Theorie der kognitiven Dissonanz ist eine der meistzitierten Theorien der Sozialpsychologie. Er entwickelte sie, nachdem er eine Sekte infiltriert hatte, die eine Weltuntergangsvorhersage machte — und deren Reaktion auf das Ausbleiben des Untergangs beobachtete."
    ),

    Question(
        categoryId = 11,
        questionText = "Der Stroop-Effekt (1935) beschreibt Interferenz zwischen automatischen und kontrollierten Prozessen. Was genau macht die Aufgabe so schwierig?",
        answerA = "Wörter und Farben werden in verschiedenen Gehirnhälften verarbeitet",
        answerB = "Lesen ist automatisierter als Farbbenennung und interferiert mit ihr",
        answerC = "Das Gehirn kann Farben nicht gleichzeitig mit Text verarbeiten",
        answerD = "Der visuelle Kortex wird durch Wörter überlastet",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Lesen ist für geübte Leser so automatisch, dass es die Farbbenennung interferiert. Wenn das Wort 'ROT' in blauer Tinte geschrieben steht, muss das Gehirn den automatischen Leseprozess aktiv unterdrücken — das kostet Zeit und erhöht die Fehlerrate.",
        funFact = "John Ridley Stroop beschrieb den Effekt in seiner Dissertation 1935. Das Paper wurde danach 50 Jahre lang kaum beachtet und erlebte ab den 1970ern einen explosionsartigen Anstieg der Zitierungen — es ist heute eines der meistzitierten Papers der Psychologie."
    ),

    Question(
        categoryId = 11,
        questionText = "Elizabeth Loftus zeigte in ihren Studien zur Zeugenaussage (ab 1974), dass Formulierungen Erinnerungen verändern können. Bei welchem Wort schätzten Probanden die Aufprallgeschwindigkeit eines Autos am höchsten ein?",
        answerA = "'Fuhr' (hit)",
        answerB = "'Traf' (contacted)",
        answerC = "'Prallte zusammen' (smashed)",
        answerD = "'Stieß' (bumped)",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Loftus und Palmer (1974) zeigten Probanden Videoaufnahmen von Autounfällen. Die Formulierung 'smashed' führte zu den höchsten Geschwindigkeitsschätzungen (~40 mph) und ließ mehr Probanden fälschlicherweise 'Glasscherben' erinnern — obwohl keine zu sehen waren. Das Wort 'contacted' führte zu den niedrigsten Schätzungen (~32 mph).",
        funFact = "Loftus pflanzte Probanden in späteren Studien vollständige Falscherinnerungen ein — etwa die Erinnerung, als Kind in einem Einkaufszentrum verloren gegangen zu sein. Etwa 25 % der Probanden 'erinnerten' sich an dieses nie passierte Ereignis."
    ),

    Question(
        categoryId = 11,
        questionText = "Der 'Marshmallow-Test' (1970er) von Walter Mischel untersuchte Impulskontrolle bei Kindern. Was ist die Hauptkritik an späteren Langzeitstudien, die Zusammenhänge mit späterem Lebens­erfolg behaupteten?",
        answerA = "Die Kinder wurden nicht korrekt zufällig ausgewählt",
        answerB = "Sozioökonomischer Status und familiärer Hintergrund wurden nicht kontrolliert",
        answerC = "Der Test war zu kurz, um aussagekräftig zu sein",
        answerD = "Marshmallows sind kein valides Testmaterial",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Eine 2018 veröffentlichte Replikationsstudie (Watts et al., PMC 2018) zeigte: Wenn sozioökonomischer Status und familiärer Hintergrund kontrolliert werden, verschwinden die Zusammenhänge zwischen Marshmallow-Warten und späterem Erfolg weitgehend. Kinder aus wohlhabenderen Familien warten länger — nicht wegen höherer Selbstkontrolle, sondern weil ihre Erfahrung zeigt, dass Versprechen eingehalten werden.",
        funFact = null
    ),

    // --- SOZIALPSYCHOLOGIE & BYSTANDER ---

    Question(
        categoryId = 11,
        questionText = "Der Bystander-Effekt wurde durch den Fall Kitty Genovese (1964) bekannt. Wann und wo wurde sie ermordet?",
        answerA = "In Brooklyn, New York, um Mitternacht",
        answerB = "In Queens, New York, um 3:15 Uhr morgens",
        answerC = "In Manhattan, New York, um 22:00 Uhr abends",
        answerD = "In der Bronx, New York, um 6:00 Uhr morgens",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Catherine 'Kitty' Genovese wurde am 13. März 1964 in Kew Gardens, Queens, New York, um ca. 3:15 Uhr morgens erstochen und vergewaltigt, als sie von der Arbeit nach Hause lief. Spätere Untersuchungen zeigten allerdings, dass die ursprüngliche Zeitungsberichterstattung (38 Zeugen sahen untätig zu) stark übertrieben war.",
        funFact = "Der Mordfall hatte einen unerwarteten positiven Effekt: Er führte zur Einführung des Notruf-Systems '911' in den USA und löste eine wissenschaftliche Revolution in der Sozialpsychologie aus."
    ),

    Question(
        categoryId = 11,
        questionText = "Latané und Darley identifizierten drei Mechanismen des Bystander-Effekts. Welcher beschreibt das Phänomen, dass Verantwortung auf alle Anwesenden verteilt wird?",
        answerA = "Pluralistische Ignoranz",
        answerB = "Evaluationsangst",
        answerC = "Diffusion of Responsibility (Verantwortungsdiffusion)",
        answerD = "Konformitätsdruck",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Die drei Mechanismen sind: (1) Diffusion of Responsibility — jeder denkt, ein anderer wird handeln; (2) Pluralistische Ignoranz — man orientiert sich an der Untätigkeit anderer als Signal, dass kein Handlungsbedarf besteht; (3) Evaluationsangst — Angst, sich zu blamieren, wenn man als Einziger reagiert.",
        funFact = "In einem Experiment ließ Latané Rauch in einen Raum strömen. Allein sitzende Personen meldeten den Rauch zu 75 %, Personen in Dreiergruppen mit passiven Konföderierten nur zu 38 %."
    ),

    // --- GEDÄCHTNIS & WAHRNEHMUNG ---

    Question(
        categoryId = 11,
        questionText = "Der 'Rosenhan-Experiment' (1973) ließ gesunde Pseudopatienten in Psychiatrien einweisen. Wie lange dauerte die kürzeste Einweisung?",
        answerA = "3 Tage",
        answerB = "7 Tage",
        answerC = "52 Tage",
        answerD = "14 Tage",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "In Rosenhans berühmtem Experiment wurden 8 gesunde Pseudopatienten in psychiatrische Kliniken eingewiesen. Die Einweisungen dauerten zwischen 7 und 52 Tagen, im Durchschnitt 19 Tage. Alle wurden mit der Diagnose 'Schizophrenie in Remission' entlassen — nicht als 'gesund'.",
        funFact = "Ironischerweise erkannten echte Patienten die Pseudopatienten oft als gesund, während das Personal sie nie enttarnte. Ein Pseudopatient wurde von einem echten Patienten direkt angesprochen: 'Du bist kein Verrückter — du bist Journalist oder Professor.'"
    ),

    Question(
        categoryId = 11,
        questionText = "Welchen Titel trug Rosenhans Studie, die 1973 im Fachjournal 'Science' erschien?",
        answerA = "\"The Myth of Mental Illness\"",
        answerB = "\"On Being Sane in Insane Places\"",
        answerC = "\"Psychiatric Institutions and Reality\"",
        answerD = "\"The Labeling of Mental Disorders\"",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Rosenhans Paper 'On Being Sane in Insane Places' erschien 1973 in Science und provozierte eine heftige Debatte in der Psychiatrie. Die Studie zeigte, dass psychiatrische Diagnosen mehr vom Kontext (Krankenhaus) als von tatsächlichen Symptomen abhängen.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Harry Harlows Affenexperimente (1958) zeigten, dass Rhesusaffen eine Stoffmutter einer Drahtmutter vorzogen. Was taten die Affenjungen, wenn ein erschreckendes Objekt in den Käfig gestellt wurde?",
        answerA = "Sie flohen zur Drahtmutter, die Nahrung gab",
        answerB = "Sie flohen zur Stoffmutter, auch wenn sie keine Nahrung bot",
        answerC = "Sie ignorierten beide Mütter und flohen in eine Ecke",
        answerD = "Sie erstarrten vor Schreck und zeigten keine Präferenz",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Bei Bedrohung flüchteten die Affenjungen stets zur weichen Stoffmutter als 'sicherer Basis' — selbst wenn die Drahtmutter die Nahrungsquelle war. Dies widerlegte die damals vorherrschende Theorie, dass Bindung ausschließlich durch Nahrungsversorgung entsteht (Drive-Reduction Theory).",
        funFact = "Harlow zeigte, dass sozial isoliert aufgezogene Affen als Erwachsene stark gestört waren: Sie zeigten selbstverletzendes Verhalten, konnten keine Sozialbeziehungen eingehen und waren als Mütter vernachlässigend — ein wegweisendes Ergebnis für die Bindungsforschung."
    ),

    // --- ENTWICKLUNGSPSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Jean Piagets 'Drei-Berge-Aufgabe' testet welche kognitive Fähigkeit?",
        answerA = "Räumliches Gedächtnis",
        answerB = "Perspektivenübernahme und Überwindung des Egozentrismus",
        answerC = "Tiefenwahrnehmung",
        answerD = "Ursache-Wirkungs-Denken",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "In Piagets Drei-Berge-Aufgabe sollen Kinder erklären, was eine Puppe von einer anderen Seite des Modells sieht. Kinder unter etwa 7 Jahren beschreiben meist ihre eigene Perspektive — Piaget nannte dies 'egozentrisches Denken' der präoperationalen Phase.",
        funFact = "Spätere Forscher kritisierten Piaget: Wenn die Aufgabe vereinfacht wird (z.B. ein Polizist der sich 'versteckt'), können auch jüngere Kinder Perspektivenübernahme zeigen — Piagets Altersangaben wurden dadurch in Frage gestellt."
    ),

    Question(
        categoryId = 11,
        questionText = "Mary Ainsworths 'Fremde-Situation'-Test (1969) unterscheidet Bindungstypen bei Kleinkindern. Welcher Bindungstyp ist durch Gleichgültigkeit gegenüber der Mutter bei Trennung und Wiederkehr gekennzeichnet?",
        answerA = "Sicher gebunden (Typ B)",
        answerB = "Ängstlich-ambivalent gebunden (Typ C)",
        answerC = "Desorganisiert gebunden (Typ D)",
        answerD = "Vermeidend-unsicher gebunden (Typ A)",
        correctAnswer = 3,
        difficulty = 4,
        explanation = "Typ-A-Kinder (vermeidend-unsicher) zeigen kaum Trennungsangst und ignorieren die Mutter bei der Rückkehr — obwohl physiologische Messungen zeigen, dass sie innerlich stark gestresst sind. Sie haben gelernt, Bindungsbedürfnisse zu unterdrücken.",
        funFact = "Mary Ainsworth entwickelte die Fremde-Situation-Klassifikation durch stundenlange Heimbeobachtungen in Uganda und Baltimore — lange bevor das Laborparadigma entstand. Sie beobachtete Mütter-Kind-Paare in ihrer natürlichen Umgebung."
    ),

    Question(
        categoryId = 11,
        questionText = "Lev Vygotskys Konzept der 'Zone der nächsten Entwicklung' (ZPD) besagt: Was ist der optimale Lernbereich?",
        answerA = "Aufgaben, die das Kind alleine ohne jede Hilfe lösen kann",
        answerB = "Aufgaben die über allen Fähigkeiten liegen, um maximale Herausforderung zu bieten",
        answerC = "Aufgaben die zu schwer für alleiniges Lösen, aber mit Unterstützung bewältigbar sind",
        answerD = "Aufgaben die dem aktuellen Entwicklungsstand exakt entsprechen",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Vygotskys ZPD beschreibt die Lücke zwischen dem, was ein Kind alleine schafft, und dem, was es mit kompetenter Unterstützung (eines Erwachsenen oder erfahreneren Peers) leisten kann. Lernen ist am effektivsten in dieser Zone — nicht bei zu leichten oder zu schweren Aufgaben.",
        funFact = "Vygotsky starb 1934 im Alter von nur 37 Jahren an Tuberkulose. Viele seiner Werke wurden in der Sowjetunion zensiert und erst Jahrzehnte später international bekannt — sein Einfluss auf die Pädagogik ist jedoch bis heute immens."
    ),

    // --- SOZIALE KOGNITION ---

    Question(
        categoryId = 11,
        questionText = "Der 'Fundamentale Attributionsfehler' (Lee Ross, 1977) beschreibt eine systematische Fehleinschätzung. Was genau ist dieser Fehler?",
        answerA = "Eigene Fehler werden situational erklärt, eigene Erfolge dispositional",
        answerB = "Das Verhalten anderer wird auf Persönlichkeitsmerkmale statt auf Situationsfaktoren zurückgeführt",
        answerC = "Gruppenverhalten wird falsch auf Einzelpersonen übertragen",
        answerD = "Erfolge werden intern, Misserfolge extern attribuiert",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Der fundamentale Attributionsfehler: Wir erklären das Verhalten anderer zu stark durch innere Eigenschaften (Er ist faul, sie ist gemein) und unterschätzen situationale Einflüsse — bei uns selbst machen wir es umgekehrt (das nennt sich 'Actor-Observer-Effekt').",
        funFact = "Der Begriff 'fundamentaler Attributionsfehler' wurde von Lee Ross 1977 geprägt. Forschungen zeigen, dass dieser Fehler in westlichen, individualistischen Kulturen stärker ausgeprägt ist als in kollektivistischen Gesellschaften wie Japan oder China."
    ),

    Question(
        categoryId = 11,
        questionText = "Was beschreibt der 'Halo-Effekt' in der sozialen Wahrnehmung?",
        answerA = "Die Tendenz, attraktiven Menschen positive Eigenschaften zuzuschreiben",
        answerB = "Die Übertragung eines positiven Gesamteindrucks auf alle Einzeleigenschaften einer Person",
        answerC = "Der Effekt, dass Autoritäten automatisch als intelligent wahrgenommen werden",
        answerD = "Die Bevorzugung von Menschen mit ähnlichen Ansichten",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Der Halo-Effekt (Edward Thorndike, 1920) beschreibt, wie ein positiver Gesamteindruck (z.B. körperliche Attraktivität) alle weiteren Beurteilungen färbt: Attraktive Menschen werden als intelligenter, kompetenter und vertrauenswürdiger eingeschätzt — unabhängig von Beweisen.",
        funFact = "Der Halo-Effekt wurde erstmals von Thorndike entdeckt, als er Offiziere bat, ihre Soldaten zu bewerten. Offiziere, die einen Soldaten gut fanden, bewerteten ihn konsequent in allen Kategorien hoch — körperliche Attraktivität korrelierte sogar mit eingeschätzter Intelligenz."
    ),

    // --- NEUROPSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Phineas Gage (1848) überlebte einen Eisenstab durch den Schädel und veränderte sich danach grundlegend. Welcher Gehirnbereich war primär betroffen?",
        answerA = "Hippocampus (Gedächtnis)",
        answerB = "Okzipitallappen (Sehen)",
        answerC = "Präfrontaler Kortex (Persönlichkeit, Impulskontrolle)",
        answerD = "Temporallappen (Sprache)",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Der Eisenstab durchbohrte Gages linken präfrontalen Kortex. Er überlebte und behielt Gedächtnis und Sprache — aber seine Persönlichkeit änderte sich drastisch: Der zuverlässige, respektierte Vorarbeiter wurde unberechenbar, vulgär und impulsiv. Dies war ein Schlüsselbeweis für die Funktion des präfrontalen Kortex.",
        funFact = "Gages Schädel und der Eisenstab werden heute noch im Warren Anatomical Museum der Harvard Medical School aufbewahrt. Moderne neuroimaging-Rekonstruktionen von 1994 (Damasio et al.) bestätigten den genauen Verlauf durch den präfrontalen Kortex."
    ),

    Question(
        categoryId = 11,
        questionText = "Patient H.M. (Henry Molaison, gestorben 2008) ist der bekannteste neuropsychologische Fall. Was wurde ihm 1953 operativ entfernt?",
        answerA = "Der frontale Kortex beider Hemisphären",
        answerB = "Beide Hippocampi (und angrenzende mediale Temporallappenstrukturen)",
        answerC = "Das Corpus Callosum (Balken)",
        answerD = "Der Kleinhirn (Cerebellum)",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "H.M. litt an schwerem Epilepsie und wurde von Neurochirurg William Beecher Scoville operiert, der beide Hippocampi entfernte. Danach konnte H.M. keine neuen Langzeiterinnerungen mehr bilden (anterograde Amnesie) — er lebte für den Rest seines Lebens im Jahr 1953. Dies bewies die zentrale Rolle des Hippocampus für das deklarative Gedächtnis.",
        funFact = "H.M. lernte weiterhin motorische Fähigkeiten (prozedurales Gedächtnis) — er wurde besser im Spiegelzeichnen, erinnerte sich aber nie daran, es geübt zu haben. Dies bewies erstmals, dass deklaratives und prozedurales Gedächtnis neurologisch getrennt sind."
    ),

    Question(
        categoryId = 11,
        questionText = "Roger Sperrys Studien an Patienten mit durchtrenntem Corpus Callosum ('Split-Brain') zeigten: Was passiert, wenn man dem rechten Auge ein Objekt zeigt?",
        answerA = "Die linke Hemisphäre verarbeitet es — der Patient kann es benennen",
        answerB = "Die rechte Hemisphäre verarbeitet es — der Patient kann es nicht benennen",
        answerC = "Beide Hemisphären verarbeiten es gleichzeitig",
        answerD = "Das Objekt wird gar nicht wahrgenommen",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Visueller Input vom rechten Auge wird von der linken Hemisphäre verarbeitet, welche das Sprachzentrum enthält — der Patient kann das Objekt benennen. Bei linksseitigem Input (rechte Hemisphäre) kann der Patient es nicht benennen, aber mit der linken Hand danach greifen. Sperry erhielt 1981 den Nobelpreis für diese Forschung.",
        funFact = "In einem Experiment zeigte Sperry einem Split-Brain-Patienten gleichzeitig verschiedene Bilder in jedes Auge. Die linke Hand und rechte Hand wollten buchstäblich verschiedene Dinge greifen — als ob zwei verschiedene Bewusstseine im selben Körper lebten."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie bezeichnete Wilhelm Wundt sein 1879 in Leipzig gegründetes Labor, das als Geburtsstunde der wissenschaftlichen Psychologie gilt?",
        answerA = "Laboratorium für Klinische Psychologie",
        answerB = "Institut für Experimentelle Psychologie",
        answerC = "Laboratorium für psychophysische Untersuchungen",
        answerD = "Institut für Physiologische Psychologie",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Wilhelm Wundt gründete 1879 in Leipzig das erste 'Institut für Experimentelle Psychologie' der Welt — dies gilt als Geburtsstunde der Psychologie als eigenständige Wissenschaft. Wundt verwendete die Methode der Introspektion (systematische Selbstbeobachtung) um Bewusstseinsinhalte zu erforschen.",
        funFact = "Wundt war unglaublich produktiv: Er schrieb in seinem Leben über 53.000 Seiten wissenschaftliche Literatur — seine Gesammtwerke umfassen mehr als die Hälfte aller psychologischen Bücher, die bis 1900 weltweit veröffentlicht wurden."
    ),

    // --- VERHALTENSPSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter dem 'Hawthorne-Effekt' (benannt nach Studien der 1920/30er Jahre)?",
        answerA = "Produktivitätssteigerung allein dadurch, dass Versuchspersonen wissen, dass sie beobachtet werden",
        answerB = "Der Effekt, dass Belohnungen extrinsische Motivation zerstören",
        answerC = "Die Erkenntnis, dass Gruppenarbeit die Leistung einzeln reduziert",
        answerD = "Die Verbesserung von Arbeitsbedingungen durch technische Optimierung",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Der Hawthorne-Effekt bezeichnet das Phänomen, dass Menschen ihr Verhalten ändern, wenn sie wissen, dass sie beobachtet werden — unabhängig davon, was die eigentliche Intervention ist. Er wurde bei Studien im Hawthorne-Werk der Western Electric Company beobachtet: Beleuchtung, Pausen und andere Variablen steigerten allesamt die Produktivität — weil die Arbeiter sich beobachtet fühlten.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Edward Thorndikes 'Gesetz des Effekts' (1898) formulierte: Was passiert mit Verhaltensweisen, die zu befriedigenden Konsequenzen führen?",
        answerA = "Sie werden seltener wiederholt, da die Erwartungshaltung steigt",
        answerB = "Sie werden häufiger wiederholt und in der Situation verankert",
        answerC = "Sie werden auf ähnliche Situationen generalisiert, aber nicht verstärkt",
        answerD = "Sie bleiben neutral, da Konsequenzen das Verhalten nicht direkt beeinflussen",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Thorndikes 'Gesetz des Effekts': Verhaltensweisen, die befriedigende Ergebnisse haben, werden stärker mit der Situation verbunden und häufiger gezeigt; Verhaltensweisen mit unangenehmen Ergebnissen werden geschwächt. Dies bildete die Grundlage für Skinners operante Konditionierung.",
        funFact = "Thorndike untersuchte Katzen in 'Problemkäfigen' — Käfigen mit einem Hebel, der die Tür öffnete. Er beobachtete, wie Katzen durch trial and error lernten, den Hebel zu drücken. Dies war die erste systematische Untersuchung instrumentellen Lernens."
    ),

    // --- TIEFENPSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Sigmund Freud beschrieb den 'Ödipuskomplex'. In welchem Entwicklungsstadium soll er auftreten?",
        answerA = "Orale Phase (0–1,5 Jahre)",
        answerB = "Anale Phase (1,5–3 Jahre)",
        answerC = "Phallische Phase (3–6 Jahre)",
        answerD = "Latenzphase (6–12 Jahre)",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Freud postulierte, dass der Ödipuskomplex in der phallischen Phase (3–6 Jahre) auftritt: Der Junge entwickelt unbewusste sexuelle Gefühle für die Mutter und Rivalitätsgefühle gegen den Vater, die durch Kastrationsangst verdrängt werden. Bei Mädchen postulierte er analog den 'Elektrakomplex'.",
        funFact = "Der Begriff 'Ödipuskomplex' bezieht sich auf den griechischen Mythos von König Ödipus, der unwissentlich seinen Vater tötete und seine Mutter heiratete. Freud sah darin eine universelle menschliche Urerfahrung, die in jedem Menschen unbewusst vorliegt."
    ),

    Question(
        categoryId = 11,
        questionText = "Carl Gustav Jung trennte sich von Freud und entwickelte eigene Konzepte. Was verstand Jung unter dem 'kollektiven Unbewussten'?",
        answerA = "Die gemeinsamen Erfahrungen einer sozialen Schicht",
        answerB = "Ein tieferes Schicht des Unbewussten, das archaische Urbilder (Archetypen) enthält, die alle Menschen teilen",
        answerC = "Das Unbewusste, das durch gesellschaftliche Konditionierung entsteht",
        answerD = "Die Summe aller individuellen Unbewussten in einer Gesellschaft",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Jungs kollektives Unbewusstes liegt tiefer als das persönliche Unbewusste und enthält Archetypen — universale Urbilder wie die Große Mutter, der Held, der Schatten, die Anima/Animus. Diese sind nicht erworben, sondern angeboren und finden sich in Mythen, Märchen und Träumen aller Kulturen.",
        funFact = "Jung und Freud hatten eine intensive Beziehung: Freud sah Jung als seinen 'Kronprinzen' und 'Thronfolger'. Die Trennung 1912 war so schmerzhaft, dass Freud danach zweimal ohnmächtig wurde, wenn Jungs Name fiel."
    ),

    // --- WAHRNEHMUNG & GESTALT ---

    Question(
        categoryId = 11,
        questionText = "Max Wertheimer, Wolfgang Köhler und Kurt Koffka begründeten die Gestaltpsychologie. Welches Prinzip besagt, dass das Gehirn unvollständige Figuren automatisch vervollständigt?",
        answerA = "Prinzip der Nähe",
        answerB = "Prinzip der Ähnlichkeit",
        answerC = "Prinzip der Geschlossenheit (Closure)",
        answerD = "Prinzip der Kontinuität",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "Das Gestalt-Prinzip der Geschlossenheit (Closure): Das Gehirn vervollständigt automatisch unvollständige Formen zu geschlossenen, vollständigen Figuren — etwa sieht man in einem Kreis mit Lücken immer noch einen 'Kreis'. Dies ist Teil des übergeordneten Gestaltgesetzes: 'Das Ganze ist mehr als die Summe seiner Teile.'",
        funFact = "Wolfgang Köhler beobachtete auf Teneriffa Schimpansen, die Probleme durch plötzliche Einsicht (Aha-Erlebnis) lösten — ohne trial and error. Ein Schimpanse namens 'Sultan' stapelte Kisten und nutzte Stöcke, um an hochhängende Bananen zu gelangen. Dies widersprach dem behavioristischen Weltbild."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht die Gestaltpsychologie unter der 'Figur-Grund-Wahrnehmung'?",
        answerA = "Die Fähigkeit, Tiefe und Entfernung wahrzunehmen",
        answerB = "Die automatische Trennung visueller Szenen in einen Vordergrund (Figur) und Hintergrund (Grund)",
        answerC = "Die Wahrnehmung von Farben in Abhängigkeit vom Umfeld",
        answerD = "Das Erkennen von Bewegungsmustern",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Figur-Grund-Trennung ist eine Grundleistung des visuellen Systems: Das Gehirn trennt eine Szene automatisch in den fokussierten Vordergrund (Figur) und den Hintergrund (Grund). Das berühmteste Beispiel: Das Rubin-Vase-Bild, das entweder als Vase oder als zwei Gesichter wahrgenommen werden kann — nie beides gleichzeitig.",
        funFact = null
    ),

    // --- SCHLAF & BEWUSSTSEIN ---

    Question(
        categoryId = 11,
        questionText = "Aserinsky und Kleitman entdeckten 1953 den REM-Schlaf. Was steht 'REM' für?",
        answerA = "Rapid Eye Movement",
        answerB = "Rhythmic Electrical Modulation",
        answerC = "Reduced Eeg Monitoring",
        answerD = "Rapid Encephalographic Measurement",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "REM (Rapid Eye Movement) bezeichnet eine Schlafphase, in der die Augen sich schnell unter den geschlossenen Lidern bewegen. Eugene Aserinsky und Nathaniel Kleitman entdeckten 1953, dass REM-Schlaf mit intensivem Träumen verbunden ist und das EEG dabei ähnlich dem Wachzustand aussieht.",
        funFact = "Aserinsky entdeckte den REM-Schlaf durch reinen Zufall: Er beobachtete nachts seinen schlafenden Sohn und bemerkte die seltsamen Augenbewegungen — damals noch mit einem defekten, alten EEG-Gerät."
    ),

    // --- PERSÖNLICHKEITSPSYCHOLOGIE ---

    Question(
        categoryId = 11,
        questionText = "Hans Eysenck entwickelte ein Persönlichkeitsmodell mit welchen zwei Hauptdimensionen?",
        answerA = "Neurotizismus und Psychotizismus",
        answerB = "Extraversion/Introversion und Neurotizismus",
        answerC = "Gewissenhaftigkeit und Verträglichkeit",
        answerD = "Offenheit und emotionale Stabilität",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Eysencks Modell basierte zunächst auf zwei Dimensionen: Extraversion/Introversion (E) und Neurotizismus (N). Später fügte er Psychotizismus (P) hinzu — das sogenannte PEN-Modell. Eysenck versuchte, Persönlichkeit biologisch zu verankern: Introvertierte haben einen höheren kortikalen Aktivierungsgrad.",
        funFact = "Eysenck war eine der umstrittensten Figuren der Psychologie: Er verteidigte die Rassenunterschiede-Forschung, was ihm heftige Kritik einbrachte. 2020 wurden nach seinem Tod 26 seiner Papers aufgrund von Datenmanipulation zurückgezogen."
    ),

    Question(
        categoryId = 11,
        questionText = "Das 'Big Five'-Persönlichkeitsmodell umfasst fünf Faktoren. Welche Abkürzung fasst sie zusammen?",
        answerA = "SPEAK",
        answerB = "OCEAN",
        answerC = "PRINT",
        answerD = "TRAIT",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "OCEAN steht für: Openness (Offenheit für Erfahrungen), Conscientiousness (Gewissenhaftigkeit), Extraversion, Agreeableness (Verträglichkeit), Neuroticism (Neurotizismus). Das Modell gilt heute als robustestes Persönlichkeitsmodell der empirischen Psychologie.",
        funFact = "Das Big-Five-Modell wurde nicht von einer einzelnen Person 'erfunden' — es entstand durch lexikalische Forschung: Psychologen analysierten tausende Persönlichkeitsadjektive in Wörterbüchern und fanden, dass sich alle auf fünf Grunddimensionen reduzieren lassen."
    ),

    // --- SOZIALE EINFLÜSSE ---

    Question(
        categoryId = 11,
        questionText = "Was beschreibt das Konzept der 'erlernten Hilflosigkeit' (Martin Seligman, 1967)?",
        answerA = "Die Unfähigkeit, Hilfe von anderen anzunehmen",
        answerB = "Das Aufgeben von Kontrollversuchen nach Erfahrungen, dass eigenes Handeln keine Wirkung hat",
        answerC = "Die Tendenz, in sozialen Situationen auf Hilfe anderer zu warten",
        answerD = "Die Überzeugung, dass Erfolg immer von externen Faktoren abhängt",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Seligman entdeckte 'erlernte Hilflosigkeit' an Hunden, die unkontrollierbaren Elektroschocks ausgesetzt wurden. Diese Hunde versuchten später in einer Situation, wo Flucht möglich gewesen wäre, nicht mehr zu entkommen — sie hatten 'gelernt', dass Handeln sinnlos ist. Seligman übertrug dies auf Depression beim Menschen.",
        funFact = "Seligman bereute den Einsatz von Elektroschocks an Tieren und widmete sein späteres Leben der positiven Psychologie — der Erforschung von Glück, Stärken und Wohlbefinden. Er begründete damit eine der einflussreichsten neuen Richtungen der Psychologie."
    ),

    Question(
        categoryId = 11,
        questionText = "Philip Zimbardo beschrieb den 'Luzifer-Effekt'. Was meint er damit?",
        answerA = "Die Neigung von Autoritätspersonen zur Korruption",
        answerB = "Die Transformation normaler, guter Menschen in böse Täter durch situationale Kräfte",
        answerC = "Das Phänomen, dass Böses durch Isolation entsteht",
        answerD = "Die psychologische Erklärung religiöser Gewalt",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "In seinem 2007 erschienenen Buch 'Der Luzifer-Effekt' beschreibt Zimbardo, wie normale Menschen unter bestimmten sozialen Bedingungen zu Tätern werden können — inspiriert vom Stanford-Gefängnisexperiment und dem Abu-Ghraib-Skandal. Böses entsteht nicht durch böse Menschen, sondern durch böse Situationen.",
        funFact = "Zimbardo trat als Sachverständiger im Prozess gegen einen der Abu-Ghraib-Soldaten auf und argumentierte, dass das System ihn zu seinen Taten getrieben habe. Das Gericht folgte dem Argument nicht — der Soldat wurde verurteilt."
    ),

    // --- SPEZIELLE EXPERIMENTE ---

    Question(
        categoryId = 11,
        questionText = "Das 'Good Samaritan Experiment' (Darley & Batson, 1973) testete Prinzipsstudenten der Theologie. Was war der stärkste Prädiktor für Hilfsbereitschaft?",
        answerA = "Religiöse Überzeugung und Frömmigkeit",
        answerB = "Zeitdruck — ob sie glaubten, zu spät zu kommen",
        answerC = "Das Thema ihrer Predigt",
        answerD = "Ihr sozioökonomischer Hintergrund",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Erstaunlicherweise war weder Frömmigkeit noch das Predigtthema (manche sollten über den barmherzigen Samariter predigen!) entscheidend. Nur der Zeitdruck war relevant: Unter hohem Zeitdruck halfen nur 10 % einem am Boden liegenden Person — unter niedrigem Zeitdruck hingegen 63 %.",
        funFact = "Einige Studenten, die gerade eine Predigt über den barmherzigen Samariter vorbereitet hatten, liefen buchstäblich über einen zusammengebrochenen Menschen hinweg, weil sie zu spät kommen wollten. Situationsfaktoren dominieren moralische Überzeugungen."
    ),

    Question(
        categoryId = 11,
        questionText = "Das 'Dunkle Triade'-Konzept in der Persönlichkeitspsychologie umfasst drei Merkmale. Welche sind es?",
        answerA = "Paranoia, Hysterie, Antisoziale Persönlichkeit",
        answerB = "Narzissmus, Machiavellismus, Psychopathie",
        answerC = "Sadismus, Aggression, Impulsivität",
        answerD = "Borderline, Narzissmus, Depression",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Die 'Dunkle Triade' (Paulhus & Williams, 2002) beschreibt drei subclinical Persönlichkeitszüge: Narzissmus (übertriebenes Selbstwertgefühl), Machiavellismus (strategische Manipulation), und Psychopathie (Empathiemangel, Impulsivität). Alle drei sind sozial schädlich, aber unterhalb klinischer Schwellenwerte.",
        funFact = "Studien zeigen, dass Menschen mit hoher Dunkler Triade überproportional häufig in Führungspositionen sind — besonders in Politik und Wirtschaft. Ihre Manipulation, Risikobereitschaft und Selbstdarstellung sind kurzfristig karriereförderlich."
    ),

    Question(
        categoryId = 11,
        questionText = "Was zeigte Robert Cialdinis Forschung zu 'Reciprocity' (Gegenseitigkeit) als Einflussprinzip?",
        answerA = "Menschen helfen nur denjenigen, denen sie bereits geholfen haben",
        answerB = "Kostenlose kleine Geschenke erzeugen ein Gefühl der Verpflichtung, das zu größeren Gegengaben führt",
        answerC = "Soziale Kontrolle wirkt nur in kleinen Gemeinschaften",
        answerD = "Gegenseitigkeit ist nur in kollektivistischen Kulturen wirksam",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Cialdinis 'Influence'-Theorie (1984) zeigt: Kleine Gefälligkeiten — auch unaufgeforderte — erzeugen starke soziale Verpflichtungsgefühle. Menschen fühlen sich verpflichtet, zurückzugeben, oft mit mehr als sie erhalten haben. Dieses Prinzip wird gezielt im Marketing eingesetzt (kostenlose Proben, Aufkleber etc.).",
        funFact = "In einem Experiment schickten Cialdini-Forscher Menschen Weihnachtskarten von Unbekannten. Die überwiegende Mehrheit schickte automatisch eine Karte zurück — ohne zu hinterfragen, wer der Absender war."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter dem 'Mere Exposure Effect' (Robert Zajonc, 1968)?",
        answerA = "Menschen mögen Dinge mehr, je öfter sie damit in Kontakt kommen — ohne bewusste Verarbeitung",
        answerB = "Wiederholte Exposition gegenüber Werbung macht sie weniger wirkungsvoll",
        answerC = "Bekannte Gesichter werden als vertrauenswürdiger eingeschätzt",
        answerD = "Familiäre Stimuli lösen Schutzreflexe aus",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Zajoncs Mere Exposure Effect: Allein die Wiederholung einer Exposition — auch unbewusst und ohne Lernen oder Bewertung — steigert die Sympathie gegenüber einem Reiz. Chinesische Schriftzeichen, Gesichter, Melodien — alles wird beliebter durch bloße Wiederholung.",
        funFact = "Zajonc zeigte den Mere Exposure Effect selbst bei Subliminaler Präsentation (unter der Wahrnehmungsschwelle). Menschen mochten Gesichter mehr, die sie zuvor für Millisekunden gesehen hatten — ohne zu wissen, warum. Dies ist eine der Grundlagen der Werbewirkungsforschung."
    ),

    Question(
        categoryId = 11,
        questionText = "Was beschreibt der 'Priming-Effekt' in der Kognitionspsychologie?",
        answerA = "Die Vorbereitung des Gehirns auf einen bekannten Stimulus durch frühere Exposition",
        answerB = "Die Aktivierung eines Konzepts beeinflusst die spätere Wahrnehmung, Urteile und Verhalten",
        answerC = "Die erhöhte Aufmerksamkeit nach einem emotionalen Ereignis",
        answerD = "Der erste Eindruck dominiert alle späteren Informationen",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Priming: Die Aktivierung eines Konzepts (z.B. durch ein Wort, ein Bild) beeinflusst nachfolgende Gedanken und Verhalten — oft unbewusst. Bargh et al. (1996) zeigten: Probanden, die mit Wörtern für 'alt' geprimt wurden, gingen danach messbar langsamer den Korridor entlang.",
        funFact = "Das berühmte Bargh-Priming-Experiment (1996) wurde als eines der ersten Replikationsfehlschläge bekannt: Mehrere Labore konnten den Effekt nicht reproduzieren. Dies spielte eine zentrale Rolle in der 'Replikationskrise' der Sozialpsychologie ab 2011."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der 'Confirmation Bias' (Bestätigungsfehler)?",
        answerA = "Die Tendenz, bestehende Überzeugungen durch selektive Informationssuche zu bestätigen",
        answerB = "Die Schwierigkeit, neue Informationen in bestehende Schemata zu integrieren",
        answerC = "Die Bevorzugung von Informationen, die von Experten bestätigt wurden",
        answerD = "Der Effekt, dass Gruppen konservativere Entscheidungen treffen als Individuen",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Der Confirmation Bias (Wason, 1960er) ist einer der meistuntersuchten kognitiven Verzerrungen: Menschen suchen, interpretieren und erinnern bevorzugt Informationen, die ihre bestehenden Überzeugungen bestätigen — und ignorieren widersprüchliche Evidenz.",
        funFact = "Peter Wasons 4-Karten-Problem (1966) zeigt den Bestätigungsfehler drastisch: Die meisten Menschen wählen die Karten falsch, weil sie nach Bestätigung statt nach Falsifikation suchen — selbst Wissenschaftler und Mathematiker scheitern häufig an der Aufgabe."
    ),

    Question(
        categoryId = 11,
        questionText = "Was beschreibt die 'Self-Fulfilling Prophecy' (Selbsterfüllende Prophezeiung) im Kontext des Rosenthal-Effekts (1968)?",
        answerA = "Menschen erfüllen unbewusst Erwartungen, die andere an sie haben, weil diese ihr Verhalten beeinflussen",
        answerB = "Negative Selbstaussagen werden zur Realität durch wiederholte Affirmation",
        answerC = "Gruppenentscheidungen werden durch Mehrheitsmeinungen vorherbestimmt",
        answerD = "Vorhersagen von Experten werden immer übertroffen",
        correctAnswer = 0,
        difficulty = 4,
        explanation = "Robert Rosenthal und Lenore Jacobson (1968) testeten in Schulen: Lehrern wurde gesagt, bestimmte Schüler seien 'intellektuelle Hochleister' (zufällig ausgewählt). Am Jahresende schnitten diese Schüler tatsächlich besser ab — weil Lehrererwartungen das Verhalten gegenüber den Schülern subtil veränderten.",
        funFact = "Der Rosenthal-Effekt wird auch 'Pygmalion-Effekt' genannt — benannt nach dem Mythos des Bildhauers Pygmalion, der sich in seine Statue verliebte und sie durch die Kraft seiner Liebe zum Leben erweckte."
    ),

    Question(
        categoryId = 11,
        questionText = "Die 'Replikationskrise' in der Psychologie ab 2011 wurde maßgeblich durch welche Initiative ausgelöst?",
        answerA = "Die American Psychological Association verlangte Nachweise aller Studien",
        answerB = "Das 'Reproducibility Project' der Open Science Collaboration (OSC) replizierte 100 publizierte Studien",
        answerC = "Das Journal 'Science' zog 50 Studien gleichzeitig zurück",
        answerD = "Eine Meta-Analyse zeigte, dass 90 % aller Sozialpsychologie-Studien p-Hacking verwendeten",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Das 'Reproducibility Project' (Open Science Collaboration, 2015) replizierte 100 publizierte Psychologiestudien und fand: Nur ~36–39 % der Ergebnisse konnten reproduziert werden. Dies löste eine grundlegende Krise in der Psychologie aus und führte zu weitreichenden Reformen (Preregistrierung, Open Data, etc.).",
        funFact = "Zu den berühmtesten gescheiterten Replikationen gehört John Bargh's Priming-Studie, das 'ego depletion'-Modell von Baumeister sowie mehrere Power-Posing-Studien von Amy Cuddy — Studien, die in TED-Talks mit Millionen von Aufrufen popularisiert wurden."
    ),

    Question(
        categoryId = 11,
        questionText = "Was zeigte das 'Monster Study' (1939) von Wendell Johnson an der Universität von Iowa?",
        answerA = "Kinder mit Sprachproblemen können durch positive Verstärkung geheilt werden",
        answerB = "Fluency-Probleme sind genetisch bedingt und nicht behandelbar",
        answerC = "Negative Bewertungen des Sprechverhaltens können bei normalen Kindern Stottern auslösen",
        answerD = "Gruppentherapie ist wirksamer als Einzeltherapie bei Sprachstörungen",
        correctAnswer = 2,
        difficulty = 4,
        explanation = "In diesem hochgradig unethischen Experiment wurden Waisenkinder in zwei Gruppen aufgeteilt: Eine Gruppe erhielt positive Verstärkung, die andere wurde für normales Sprechen konstant negativ bewertet und als 'Stotterer' bezeichnet. Kinder der negativen Gruppe entwickelten tatsächlich Sprech­probleme — ein verheerender Beweis für die Macht von Etikettierungen.",
        funFact = "Das Experiment wurde 'Monster Study' von Johnsons Studenten genannt, weil es so ethisch verwerflich war. Johnson versuchte jahrzehntelang, es geheim zu halten. Die Universität Iowa entschuldigte sich offiziell erst 2001 — über 60 Jahre später."
    ),

    Question(
        categoryId = 11,
        questionText = "Zu welchem zentralen Schluss führte Daniel Kahnemans Forschung zu 'System 1' und 'System 2' (2002 Nobelpreis für Wirtschaftswissenschaften)?",
        answerA = "Rationales Denken ist immer dem intuitiven Denken überlegen",
        answerB = "Menschen sind irrationale Entscheider: Schnelles intuitives Denken (System 1) dominiert und produziert systematische Fehler",
        answerC = "Emotionen und Vernunft sind im Gehirn vollständig getrennt",
        answerD = "Wirtschaftliche Entscheidungen sind stets rational, persönliche Entscheidungen nicht",
        correctAnswer = 1,
        difficulty = 4,
        explanation = "Kahneman (mit Tversky) zeigte: Menschen entscheiden nicht rational (wie klassische Wirtschaftstheorie annimmt). System 1 (schnell, intuitiv, unbewusst) dominiert das Alltagsdenken und produziert systematische Fehler (Heuristiken und Biases). System 2 (langsam, analytisch) muss aktiv eingesetzt werden.",
        funFact = "Kahneman gewann den Wirtschaftsnobelpreis als Psychologe — einer der wenigen Nicht-Ökonomen. Er widmete ihn seinem verstorbenen Forschungspartner Amos Tversky, der nicht mehr lebte und damit nicht berücksichtigt werden konnte — Nobelpreise werden nicht posthum vergeben."
    )

)
