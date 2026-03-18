package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsEasy2(): List<Question> = listOf(

    // Question 1 - Common cold
    Question(
        categoryId = 16,
        questionText = "Wie nennt man die haeufigste Erkrankung der oberen Atemwege?",
        answerA = "Grippe",
        answerB = "Erkaeltung",
        answerC = "Bronchitis",
        answerD = "Lungenentzuendung",
        correctAnswer = 1,
        explanation = "Die Erkaeltung ist eine virale Infektion der oberen Atemwege und geht haeufig mit Schnupfen, Husten und Halsschmerzen einher.",
        difficulty = 1,
        funFact = "Ein Erwachsener erkrankt im Durchschnitt zwei- bis viermal pro Jahr an einer Erkaeltung."
    ),

    // Question 2 - Common cold vs flu
    Question(
        categoryId = 16,
        questionText = "Was ist ein typisches Zeichen einer echten Grippe (Influenza) im Vergleich zur Erkaeltung?",
        answerA = "Laufende Nase",
        answerB = "Leichtes Kratzen im Hals",
        answerC = "Ploetzlicher hoher Fieber-Beginn",
        answerD = "Niesen",
        correctAnswer = 2,
        explanation = "Die echte Grippe beginnt meist ploetzlich mit hohem Fieber und starkem Krankheitsgefuehl, waehrend eine Erkaeltung schleichend beginnt.",
        difficulty = 1,
        funFact = "Der Begriff 'Grippe' leitet sich vom franzoesischen Wort 'gripper' (packen) ab, weil die Krankheit einen so ploetzlich packt."
    ),

    // Question 3 - Fever basics
    Question(
        categoryId = 16,
        questionText = "Ab welcher Koerpertemperatur spricht man bei Erwachsenen von Fieber?",
        answerA = "Ab 36,5 Grad Celsius",
        answerB = "Ab 37,0 Grad Celsius",
        answerC = "Ab 38,0 Grad Celsius",
        answerD = "Ab 40,0 Grad Celsius",
        correctAnswer = 2,
        explanation = "Fieber liegt vor, wenn die Koerpertemperatur ueber 38,0 Grad Celsius steigt. Zwischen 37,5 und 38,0 Grad spricht man von subfebrilen Temperaturen.",
        difficulty = 1,
        funFact = "Fieber ist kein Feind, sondern eine Abwehrreaktion des Koerpers: Viele Krankheitserreger koennen sich bei hoeheren Temperaturen schlechter vermehren."
    ),

    // Question 4 - Fever treatment
    Question(
        categoryId = 16,
        questionText = "Was hilft am schnellsten dabei, leichtes Fieber zu senken?",
        answerA = "Viel essen und schlafen",
        answerB = "Sport treiben und schwitzen",
        answerC = "Viel trinken und Ruhe",
        answerD = "Kalte Dusche nehmen",
        correctAnswer = 2,
        explanation = "Bei Fieber verliert der Koerper viel Fluessigkeit. Ausreichendes Trinken und Bettruhe unterstuetzen das Immunsystem bei der Bekaempfung der Krankheitserreger.",
        difficulty = 1,
        funFact = "Bereits eine leichte Erhoehung der Koerpertemperatur um 1 Grad steigert die Aktivitaet bestimmter Immunzellen um bis zu 40 Prozent."
    ),

    // Question 5 - Headache
    Question(
        categoryId = 16,
        questionText = "Was ist die haeufigste Ursache fuer Kopfschmerzen?",
        answerA = "Gehirntumor",
        answerB = "Spannungskopfschmerz",
        answerC = "Meningitis",
        answerD = "Schlaganfall",
        correctAnswer = 1,
        explanation = "Spannungskopfschmerzen sind die haeufigste Form von Kopfschmerzen. Sie entstehen oft durch Stress, Verspannungen oder Schlafmangel.",
        difficulty = 1,
        funFact = "Etwa 70 Prozent aller Menschen leiden gelegentlich unter Spannungskopfschmerzen. Sie fuehlten sich wie ein enger Band um den Kopf an."
    ),

    // Question 6 - Headache remedy
    Question(
        categoryId = 16,
        questionText = "Was kann bei leichten Kopfschmerzen helfen, bevor man Schmerzmittel nimmt?",
        answerA = "Kaffee trinken und laut Musik hoeren",
        answerB = "Viel Wasser trinken und frische Luft schnappen",
        answerC = "Sofort ins Bett legen und Schlaftabletten nehmen",
        answerD = "Intensiv Sport treiben",
        correctAnswer = 1,
        explanation = "Oft entstehen leichte Kopfschmerzen durch Dehydration. Ein Glas Wasser und frische Luft reichen haeufig aus, um die Beschwerden zu lindern.",
        difficulty = 1,
        funFact = "Das Gehirn besteht zu etwa 75 Prozent aus Wasser. Schon ein leichter Fluessigkeitsmangel kann Kopfschmerzen ausloesen."
    ),

    // Question 7 - Stomachache
    Question(
        categoryId = 16,
        questionText = "Welches Hausmittel hilft klassischerweise bei Bauchschmerzen und Uebelkeit?",
        answerA = "Ingwer- oder Kamillentee",
        answerB = "Stark gesalzene Brezeln",
        answerC = "Eiskaltes Wasser",
        answerD = "Fettreiche Speisen",
        correctAnswer = 0,
        explanation = "Kamillentee hat entzuendungshemmende und krampfloesende Eigenschaften. Ingwer kann Uebelkeit lindern und wird seit Jahrhunderten als Heilmittel eingesetzt.",
        difficulty = 1,
        funFact = "Ingwer wurde bereits im alten China vor ueber 2.000 Jahren als Heilpflanze gegen Uebelkeit eingesetzt und ist heute wissenschaftlich bestaetigt."
    ),

    // Question 8 - Allergies
    Question(
        categoryId = 16,
        questionText = "Was ist eine Allergie?",
        answerA = "Eine Infektion durch Bakterien",
        answerB = "Eine uebermaessige Reaktion des Immunsystems auf eigentlich harmlose Stoffe",
        answerC = "Ein Vitaminmangel",
        answerD = "Eine Erkrankung des Herzens",
        correctAnswer = 1,
        explanation = "Bei einer Allergie reagiert das Immunsystem auf an sich harmlose Substanzen (Allergene) wie Pollen oder Tierhaare so, als waeren sie gefaehrliche Eindringlinge.",
        difficulty = 1,
        funFact = "Etwa 30 Prozent der Deutschen leiden an einer Allergie. Die haeufigste ist die Heuschnupfen-Allergie gegen Baum- und Graespollen."
    ),

    // Question 9 - Pollen allergy
    Question(
        categoryId = 16,
        questionText = "Wie nennt man die Allergie gegen Bluetenpollen?",
        answerA = "Neurodermitis",
        answerB = "Heuschnupfen",
        answerC = "Asthma",
        answerD = "Nesselsucht",
        correctAnswer = 1,
        explanation = "Heuschnupfen (allergische Rhinitis) ist eine allergische Reaktion auf Pollen. Typische Symptome sind Niesen, laufende Nase und juckende Augen.",
        difficulty = 1,
        funFact = "Der Begriff 'Heuschnupfen' ist eigentlich irrefuehrend: Nicht Heu, sondern vor allem Baumbluetenstaub und Graeser sind die hauptsaechlichen Ausloesers."
    ),

    // Question 10 - Broken bone
    Question(
        categoryId = 16,
        questionText = "Was sollte man bei einem Knochenbruch als Erste-Hilfe-Massnahme tun?",
        answerA = "Den Knochen selbst einrenken",
        answerB = "Den Betroffenen rennen lassen, damit es sich ausheilt",
        answerC = "Die betroffene Stelle ruhigstellen und den Notruf verstaendigen",
        answerD = "Den Bereich staerker belasten",
        correctAnswer = 2,
        explanation = "Bei einem Knochenbruch ist es wichtig, die verletzte Stelle zu ruhigstellen und medizinische Hilfe zu rufen. Falsche Bewegungen koennen den Bruch verschlimmern.",
        difficulty = 1,
        funFact = "Der menschliche Knochen ist pro Quadratzentimeter fast so belastbar wie Granit, aber viermal leichter als Stahl."
    ),

    // Question 11 - Sprains
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einer 'Verstauchung'?",
        answerA = "Einen gebrochenen Knochen",
        answerB = "Eine Verletzung der Muskeln",
        answerC = "Eine Ueberdehnumg oder einen Riss von Baendern",
        answerD = "Eine Entzuendung der Nerven",
        correctAnswer = 2,
        explanation = "Bei einer Verstauchung werden die Baender eines Gelenks ueberdehnt oder leicht eingerissen. Das Sprunggelenk ist am haeufigsten betroffen.",
        difficulty = 1,
        funFact = "Die PECH-Regel (Pause, Eis, Compression, Hochlagern) ist die Standardmassnahme bei Verstauchungen und funktioniert auch bei Muskelzerrungen."
    ),

    // Question 12 - PECH rule
    Question(
        categoryId = 16,
        questionText = "Was bedeutet das 'E' in der Erste-Hilfe-Regel 'PECH' bei Sportverletzungen?",
        answerA = "Einwickeln",
        answerB = "Eis",
        answerC = "Erholung",
        answerD = "Einmassieren",
        correctAnswer = 1,
        explanation = "Die PECH-Regel steht fuer Pause, Eis, Compression, Hochlagern. Das Kuehlen mit Eis verringert Schwellung und Schmerz durch Einengen der Blutgefaesse.",
        difficulty = 1,
        funFact = "Eis darf nie direkt auf die Haut gelegt werden, da dies zu Kaltschmerz oder Erfrierungen fuehren kann. Ein Tuch als Zwischenlage ist Pflicht."
    ),

    // Question 13 - Cuts
    Question(
        categoryId = 16,
        questionText = "Was ist der erste Schritt bei einer blutenden Schnittwunde?",
        answerA = "Die Wunde mit Erde abdecken",
        answerB = "Den Blutfluss durch Druck stoppen",
        answerC = "Sofort laufen und einen Arzt suchen, ohne die Wunde zu beruehren",
        answerD = "Alkohol direkt in die Wunde giessen",
        correctAnswer = 1,
        explanation = "Mit einem sauberen Tuch oder Verband sollte man Druck auf die Wunde ausueben, um die Blutung zu stoppen. Danach Wunde reinigen und verbinden.",
        difficulty = 1,
        funFact = "Der Koerper verschliesst kleine Wunden erstaunlich schnell: Innerhalb von Minuten bildet sich ein Blutpfropf, und nach wenigen Tagen beginnt die Narbenbildung."
    ),

    // Question 14 - Burns
    Question(
        categoryId = 16,
        questionText = "Was soll man bei einer Verbrennung ersten Grades (roete, keine Blasen) sofort tun?",
        answerA = "Butter oder Oel auftragen",
        answerB = "Mit kaltem Wasser kuehlen",
        answerC = "Nichts tun und abwarten",
        answerD = "Watte direkt auf die Brandstelle legen",
        correctAnswer = 1,
        explanation = "Verbrennungen sollten sofort mit kuehlem (nicht eiskaltem) fliessendem Wasser gekuehlt werden, mindestens 10 bis 15 Minuten lang. Das lindert den Schmerz und begrenzt den Gewebeschaden.",
        difficulty = 1,
        funFact = "Butter, Oel oder Zahnpasta auf Verbrennungen sind gefaehrliche Hausmittel: Sie halten Waerme ein und erhoehen das Infektionsrisiko erheblich."
    ),

    // Question 15 - Burns severity
    Question(
        categoryId = 16,
        questionText = "Bei welchem Zeichen muss eine Verbrennung unbedingt vom Arzt behandelt werden?",
        answerA = "Die Haut ist etwas roeter als normal",
        answerB = "Es bilden sich Blasen oder die Haut ist zerstoert",
        answerC = "Es juckt leicht",
        answerD = "Es brennt kurz und hoert dann auf",
        correctAnswer = 1,
        explanation = "Blasenbildung deutet auf eine Verbrennung zweiten Grades hin. Blasen duerfen nicht aufgestochen werden und benoetigen aerztliche Behandlung, da ein hohes Infektionsrisiko besteht.",
        difficulty = 1,
        funFact = "Verbrennungen werden in Grade eingeteilt: Grad 1 (Roete), Grad 2 (Blasen), Grad 3 (zerstoertes Gewebe) und Grad 4 (Verkohlung). Nur Grad 1 kann zu Hause behandelt werden."
    ),

    // Question 16 - Choking
    Question(
        categoryId = 16,
        questionText = "Was tut man, wenn sich jemand verschluckt hat und keine Luft mehr bekommt?",
        answerA = "Abwarten, bis es von selbst aufhoert",
        answerB = "Dem Betroffenen Wasser zu trinken geben",
        answerC = "Heimlich-Manover: Kraeeftige Druecke von hinten in den Oberbauch",
        answerD = "Den Betroffenen auf den Ruecken legen",
        correctAnswer = 2,
        explanation = "Das Heimlich-Manoever (Abdominalstoss) erzeugt Druck im Bauch, der den Fremdkoerper aus den Atemwegen herausbefoerdern kann. Bei Bewusstlosigkeit sofort Notruf und Reanimation.",
        difficulty = 1,
        funFact = "Das Heimlich-Manoever wurde 1974 vom amerikanischen Arzt Henry Heimlich entwickelt und hat seitdem Tausenden von Menschen das Leben gerettet."
    ),

    // Question 17 - Choking baby
    Question(
        categoryId = 16,
        questionText = "Was macht man, wenn ein Saeugling sich verschluckt hat und keine Luft bekommt?",
        answerA = "Das gleiche Heimlich-Manoever wie bei Erwachsenen",
        answerB = "Fuenf Rueckenschlaege und fuenf Brustdruecke abwechselnd",
        answerC = "Abwarten",
        answerD = "Das Kind schuetteln",
        correctAnswer = 1,
        explanation = "Bei Saeuglingen darf man kein normales Heimlich-Manoever anwenden. Stattdessen gibt man fuenf Rueckenschlaege und fuenf Brustdruecke und ruft den Notruf.",
        difficulty = 1,
        funFact = "Kleine runde Lebensmittel wie Weintrauben, Nsse und Kirschengehoeren zu den groessten Erstickungsgefahren fuer Kleinkinder unter vier Jahren."
    ),

    // Question 18 - Emergency number Germany
    Question(
        categoryId = 16,
        questionText = "Welche Notrufnummer gilt in Deutschland fuer den Rettungsdienst?",
        answerA = "110",
        answerB = "112",
        answerC = "115",
        answerD = "118",
        correctAnswer = 1,
        explanation = "Die 112 ist europaweit die einheitliche Notrufnummer fuer Feuerwehr und Rettungsdienst. Die 110 ist die Notrufnummer der Polizei.",
        difficulty = 1,
        funFact = "Die Notrufnummer 112 funktioniert in allen EU-Laendern und kann sogar ohne SIM-Karte und ohne Guthaben vom Handy aus angerufen werden."
    ),

    // Question 19 - When to call a doctor
    Question(
        categoryId = 16,
        questionText = "Bei welchem Symptom sollte man sofort den Notruf (112) rufen?",
        answerA = "Leichter Schnupfen",
        answerB = "Einmaligem Niesen",
        answerC = "Plotzlicher lahmung einer Koerperseite",
        answerD = "Kleiner Schnittwunde am Finger",
        correctAnswer = 2,
        explanation = "Eine ploetzliche Lahmung einer Koerperseite kann ein Zeichen fuer einen Schlaganfall sein. Hier gilt: jede Minute zaehlt und der Notruf muss sofort verstaendigt werden.",
        difficulty = 1,
        funFact = "Der FAST-Test hilft, einen Schlaganfall zu erkennen: Face (Gesichtslahmung), Arms (Armlahmung), Speech (Sprachstoerung), Time (Zeit ist kritisch)."
    ),

    // Question 20 - Chickenpox
    Question(
        categoryId = 16,
        questionText = "Woran erkennt man Windpocken (Varizellen)?",
        answerA = "An gelblichen Flecken auf der Haut",
        answerB = "An stark juckenden Blaeeschen auf der ganzen Haut",
        answerC = "An Schuppungen nur an Haenden und Fuessen",
        answerD = "An hartem Ausschlag ohne Juckreiz",
        correctAnswer = 1,
        explanation = "Windpocken zeigen sich als stark juckende, mit Fluessigkeit gefuellte Blaeschen, die sich ueber den ganzen Koerper verteilen. Sie heilen nach einigen Tagen als Krusten ab.",
        difficulty = 1,
        funFact = "Das Windpocken-Virus (Varizella-Zoster-Virus) bleibt nach der Erkrankung lebenslang im Koerper und kann spaeter als Guertelrose wieder ausbrechen."
    ),

    // Question 21 - Chickenpox contagious
    Question(
        categoryId = 16,
        questionText = "Wie werden Windpocken uebertragen?",
        answerA = "Durch verunreinigtes Wasser",
        answerB = "Durch Insektenstiche",
        answerC = "Durch Troepfchen in der Luft und Kontakt mit Blaeschen",
        answerD = "Durch den Biss infizierter Tiere",
        correctAnswer = 2,
        explanation = "Windpocken sind hoch ansteckend und werden ueber die Luft (Troepfcheninfektion) oder durch Beruehrung der Blaeschen uebertragen. Die Ansteckungszeit beginnt schon vor dem Ausschlag.",
        difficulty = 1,
        funFact = "Windpocken sind so ansteckend, dass fast 90 Prozent aller Menschen, die noch keine Immunitat haben, sich nach Kontakt mit einem Infizierten anstecken."
    ),

    // Question 22 - Measles
    Question(
        categoryId = 16,
        questionText = "Gegen welche Kinderkrankheit schuetzt die MMR-Impfung unter anderem?",
        answerA = "Windpocken",
        answerB = "Masern",
        answerC = "Krupp-Husten",
        answerD = "Scharlach",
        correctAnswer = 1,
        explanation = "Die MMR-Impfung schuetzt gegen Masern, Mumps und Roeteln. Sie wird Kindern ab dem 11. Lebensmonat empfohlen und bietet langjaehrigen Schutz.",
        difficulty = 1,
        funFact = "Masern gehoeren zu den ansteckendsten Krankheiten ueberhaupt: Ein Infizierter kann bis zu 18 nicht geimpfte Personen anstecken."
    ),

    // Question 23 - Measles symptoms
    Question(
        categoryId = 16,
        questionText = "Welches typische Symptom tritt bei Masern auf?",
        answerA = "Blaue Flecken auf den Armen",
        answerB = "Roter fleckiger Hautausschlag, beginnend im Gesicht",
        answerC = "Gelbfaerbung der Haut",
        answerD = "Starkes Schwitzen nur nachts",
        correctAnswer = 1,
        explanation = "Masern beginnen mit Fieber, Husten und roten Augen. Charakteristisch ist der roetliche Ausschlag, der sich vom Gesicht aus ueber den ganzen Koerper ausbreitet.",
        difficulty = 1,
        funFact = "Nach einer Maserninfektion kann das Immunsystem fuer Monate bis Jahre stark geschwaecht sein, was eine erhoehte Anfaelligkeit fuer andere Krankheiten bedeutet."
    ),

    // Question 24 - Sunburn
    Question(
        categoryId = 16,
        questionText = "Was sollte man bei einem Sonnenbrand sofort tun?",
        answerA = "Sofort wieder in die Sonne gehen, um die Haut zu gewohnen",
        answerB = "Butter oder Oel auf die Haut auftragen",
        answerC = "In den Schatten gehen und die Haut mit kuehlenden, feuchten Umschlaegen behandeln",
        answerD = "Die Haut sofort trockenmassieren",
        correctAnswer = 2,
        explanation = "Bei Sonnenbrand hilft es, die Haut sofort aus der Sonne zu nehmen und mit kuehlenden, feuchten Tuechern oder Aloe-Vera-Gel zu behandeln. Viel trinken ist ebenfalls wichtig.",
        difficulty = 1,
        funFact = "Ein Sonnenbrand erhoehen langfristig das Risiko fuer Hautkrebs. Bereits fuenf Sonnenbraende im Kindesalter verdoppeln das spaetere Hautkrebsrisiko."
    ),

    // Question 25 - Sunburn prevention
    Question(
        categoryId = 16,
        questionText = "Was schuetzt am besten vor Sonnenbrand?",
        answerA = "Viel Wasser trinken",
        answerB = "Sonnenschutzmittel mit hohem Lichtschutzfaktor auftragen",
        answerC = "Braeune aus dem Vorjahr",
        answerD = "Dunkle Sonnenbrille tragen",
        correctAnswer = 1,
        explanation = "Sonnenschutzmittel mit hohem LSF (Lichtschutzfaktor) schuetzt die Haut vor UV-Strahlung. Regelmaessiges Nachauftragen, vor allem nach dem Schwimmen, ist wichtig.",
        difficulty = 1,
        funFact = "Sonnenbrand kann auch an bewoelkten Tagen entstehen, da bis zu 80 Prozent der UV-Strahlung Wolken durchdringt."
    ),

    // Question 26 - Insect bites
    Question(
        categoryId = 16,
        questionText = "Was hilft bei einem normalen Mueckenstich gegen den Juckreiz?",
        answerA = "Die Wunde kratzen bis sie blutet",
        answerB = "Kuehlen und juckreizstillende Creme auftragen",
        answerC = "Mit einem Messer einschneiden",
        answerD = "Heisses Wasser auftragen",
        correctAnswer = 1,
        explanation = "Kuehlen lindert den Juckreiz durch den Mueckenstich, da Kaelte die Schmerzrezeptoren beruhigt. Juckreizstillende Cremes oder Gele helfen zusaetzlich.",
        difficulty = 1,
        funFact = "Es sind nur weibliche Muecken, die stechen und Blut saugen, weil sie das Eiweiss fuer die Eientwicklung benoetigen. Maennliche Muecken ernaehren sich nur von Pflanzensaeften."
    ),

    // Question 27 - Bee sting
    Question(
        categoryId = 16,
        questionText = "Was ist bei einem Bienenstich zu beachten?",
        answerA = "Den Stachel so schnell wie moeglich herausdruecken oder quetschen",
        answerB = "Den Stachel vorsichtig herauskratzen, ohne ihn zu quetschen",
        answerC = "Die Stichstelle tief einschneiden",
        answerD = "Gift mit dem Mund aussaugen",
        correctAnswer = 1,
        explanation = "Der Bienenstachel sollte herausgekratzt werden (z.B. mit einem Fingernagel), da das Quetschen weitere Giftmengen in die Wunde pressen wuerde.",
        difficulty = 1,
        funFact = "Bienen verlieren nach dem Stich ihren Stachel und sterben dadurch. Wespen koennen dagegen mehrfach stechen, da ihr Stachel nicht verhakt ist."
    ),

    // Question 28 - Allergic reaction to insect sting
    Question(
        categoryId = 16,
        questionText = "Welches Zeichen deutet auf eine gefaehrliche allergische Reaktion nach einem Insektenstich hin?",
        answerA = "Ein roter Punkt um die Stichstelle",
        answerB = "Leichter Juckreiz",
        answerC = "Geschwollene Lippen, Atemprobleme oder Schwindel",
        answerD = "Kurzer Schmerz beim Stich",
        correctAnswer = 2,
        explanation = "Geschwollene Lippen, Atemprobleme oder Schwindel nach einem Insektenstich koennen auf einen allergischen Schock (Anaphylaxie) hinweisen. Sofort 112 rufen!",
        difficulty = 1,
        funFact = "Etwa 3 Prozent der Erwachsenen in Deutschland sind allergisch gegen Insektengifte. Fuer sie kann ein einzelner Stich lebensbedrohlich sein."
    ),

    // Question 29 - Nosebleed
    Question(
        categoryId = 16,
        questionText = "Was tut man richtig bei Nasenbluten?",
        answerA = "Kopf in den Nacken legen und Nase hochziehen",
        answerB = "Kopf nach vorne beugen und die Nase zuklemmen",
        answerC = "Sofort ins Krankenhaus fahren",
        answerD = "Kalt duschen",
        correctAnswer = 1,
        explanation = "Bei Nasenbluten sollte man den Kopf nach vorne beugen und die Nase zuklemmen. Den Kopf in den Nacken legen ist falsch, weil Blut in den Rachen laufen kann.",
        difficulty = 1,
        funFact = "Nasenbluten klingt dramatisch, ist aber meistens harmlos. Die Nasenscheidewand hat viele kleine Blutgefaesse, die leicht reissen, z.B. bei trockener Luft oder starkem Schnauben."
    ),

    // Question 30 - Nosebleed duration
    Question(
        categoryId = 16,
        questionText = "Wie lange sollte man die Nase bei Nasenbluten zuklemmen?",
        answerA = "10 bis 20 Minuten",
        answerB = "1 bis 2 Stunden",
        answerC = "Nur 30 Sekunden",
        answerD = "5 Sekunden, dann loslassen und wiederholen",
        correctAnswer = 0,
        explanation = "Das Zuklemmen der Nase fuer 10 bis 20 Minuten gibt den Blutgefaessen Zeit, sich durch Blutgerinnsel zu verschliessen. Kaelteumschlaege auf dem Nacken koennen zusaetzlich helfen.",
        difficulty = 1,
        funFact = "Das vordere Drittel der Nase (Kisselbachscher Bereich) ist fuer etwa 90 Prozent aller Nasenbluten verantwortlich, da hier besonders viele kleine Gefaesse dicht beieinander liegen."
    ),

    // Question 31 - Cold compress for injuries
    Question(
        categoryId = 16,
        questionText = "Wofuer wird ein Kuehlpack beim Sport haeufig eingesetzt?",
        answerA = "Um Muskeln aufzuwaermen vor dem Sport",
        answerB = "Um Schwellungen und Schmerzen nach einer Verletzung zu reduzieren",
        answerC = "Um Fieber zu erzeugen",
        answerD = "Als Nahrungsergaenzungsmittel",
        correctAnswer = 1,
        explanation = "Kaelte verringert die Durchblutung, reduziert Schwellungen und lindert Schmerzen nach Prellungen, Verstauchungen oder anderen Verletzungen.",
        difficulty = 1,
        funFact = "Kuehlpacks sollten nie direkt auf die Haut gelegt werden. Ein Tuch darunter verhindert Erfrierungen, die bei direktem Kontakt entstehen koennen."
    ),

    // Question 32 - Flu prevention
    Question(
        categoryId = 16,
        questionText = "Was ist die wirksamste Methode, um die Uebertragung von Erkaeltungs- und Grippeviren zu verhindern?",
        answerA = "Taeglich mehrfach warme Fluessigkeiten trinken",
        answerB = "Regelmaessiges und ggruendliches Haendewaschen",
        answerC = "Vitaminpillen nehmen",
        answerD = "Sport treiben",
        correctAnswer = 1,
        explanation = "Regelmaessiges Haendewaschen mit Seife fuer mindestens 20 Sekunden ist eine der effektivsten Massnahmen gegen die Uebertragung von Atemwegsviren.",
        difficulty = 1,
        funFact = "Studien zeigen, dass gruendliches Haendewaschen die Uebertragung von Durchfallerregern um 50 Prozent und von Atemwegsviren um bis zu 21 Prozent reduzieren kann."
    ),

    // Question 33 - Flu shot
    Question(
        categoryId = 16,
        questionText = "Warum muss die Grippe-Impfung jedes Jahr erneuert werden?",
        answerA = "Weil Impfungen generell nach einem Jahr unwirksam werden",
        answerB = "Weil das Influenza-Virus sich staendig veraendert",
        answerC = "Weil man sonst gegenueber anderen Krankheiten anfalliiger wird",
        answerD = "Weil die Pharmaindustrie das so verlangt",
        correctAnswer = 1,
        explanation = "Das Influenza-Virus mutiert (veraendert sich) staendig. Die jaaehrliche Impfung wird an die aktuell zirkulierenden Virusvarianten angepasst.",
        difficulty = 1,
        funFact = "Die Weltgesundheitsorganisation (WHO) beobachtet das Grippevirus weltweit ganzjaehrig und entscheidet jedes Jahr im Februar, welche Staemme in den Nordhaelfte-Impfstoff kommen."
    ),

    // Question 34 - Stomach flu vs food poisoning
    Question(
        categoryId = 16,
        questionText = "Was sind typische Symptome einer Magengrippe (Gastroenteritis)?",
        answerA = "Husten und Schnupfen",
        answerB = "Uebelkeit, Erbrechen und Durchfall",
        answerC = "Hautausschlag und Fieber",
        answerD = "Kopfschmerzen und Rueckenschmerzen",
        correctAnswer = 1,
        explanation = "Eine Magengrippe aeussert sich typischerweise mit Uebelkeit, Erbrechen, Durchfall und oft auch Bauchkraempfen. Ausreichendes Trinken ist besonders wichtig.",
        difficulty = 1,
        funFact = "Die Bezeichnung 'Magengrippe' ist medizinisch nicht korrekt, da sie nichts mit dem Grippevirus zu tun hat. Der korrekte Begriff lautet Gastroenteritis."
    ),

    // Question 35 - Dehydration
    Question(
        categoryId = 16,
        questionText = "Was kann bei Durchfall und Erbrechen besonders gefaehrlich werden?",
        answerA = "Zu viel Schlaf",
        answerB = "Austrocknung (Dehydration) durch Fluessigkeitsverlust",
        answerC = "Zu viel Kaelte",
        answerD = "Zu wenig Bewegung",
        correctAnswer = 1,
        explanation = "Bei anhaltendem Erbrechen und Durchfall verliert der Koerper schnell Fluessigkeit und Mineralstoffe. Besonders gefaehrlich ist dies fuer Saeuglinge und aeltere Menschen.",
        difficulty = 1,
        funFact = "Bereits ein Fluessigkeitsverlust von nur 2 Prozent des Koerpergewichts fuehrt zu merklichen Leistungseinbussen und Konzentrationsproblemen."
    ),

    // Question 36 - Scarlet fever
    Question(
        categoryId = 16,
        questionText = "Was ist Scharlach?",
        answerA = "Eine Virusinfektion der Lunge",
        answerB = "Eine bakterielle Kinderkrankheit mit Halsschmerzen und charakteristischem Ausschlag",
        answerC = "Eine Pilzinfektion der Haut",
        answerD = "Eine Erkrankung der Nieren",
        correctAnswer = 1,
        explanation = "Scharlach wird durch Streptokokken-Bakterien ausgeloest und aeussert sich mit Halsschmerzen, Fieber und einem feinen, roten Ausschlag. Er wird mit Antibiotika behandelt.",
        difficulty = 1,
        funFact = "Die typische 'Erdbeer-Zunge' (stark geroetete Zunge mit hervorstehenden Geschmacksknospen) ist ein charakteristisches Zeichen von Scharlach."
    ),

    // Question 37 - Antibiotics
    Question(
        categoryId = 16,
        questionText = "Wofuer werden Antibiotika eingesetzt?",
        answerA = "Gegen Viren wie Erkaeltung und Grippe",
        answerB = "Gegen bakterielle Infektionen",
        answerC = "Gegen Allergien",
        answerD = "Als Schmerzmittel",
        correctAnswer = 1,
        explanation = "Antibiotika wirken nur gegen Bakterien, nicht gegen Viren. Bei Erkaeltungen, Grippe und anderen viralen Erkrankungen helfen sie deshalb nicht.",
        difficulty = 1,
        funFact = "Das Penicillin wurde 1928 von Alexander Fleming zufaellig entdeckt, als er beobachtete, dass ein Schimmelpilz die Bakterien in seiner Petrischale abtoetete."
    ),

    // Question 38 - First aid kit
    Question(
        categoryId = 16,
        questionText = "Was gehoert in einen Erste-Hilfe-Kasten?",
        answerA = "Aspirin und Energydrinks",
        answerB = "Verbandsmaterial, Pflaster und Schere",
        answerC = "Nur Pflaster",
        answerD = "Messer und Feuerzeug",
        correctAnswer = 1,
        explanation = "Ein Erste-Hilfe-Kasten enthaelt Verbandsmaterial, Pflaster, Schere, Rettungsdecke und weitere Materialien fuer Notfallversorgung. Er sollte in jedem Haushalt vorhanden sein.",
        difficulty = 1,
        funFact = "In Deutschland ist ein Erste-Hilfe-Kasten im Auto gesetzlich vorgeschrieben. Er muss der DIN-Norm 13164 entsprechen und darf nicht veraltet sein."
    ),

    // Question 39 - Recovery position
    Question(
        categoryId = 16,
        questionText = "Wann bringt man eine bewusstlose Person in die stabile Seitenlage?",
        answerA = "Wenn sie Schmerzen klagt",
        answerB = "Wenn sie atmet, aber bewusstlos ist",
        answerC = "Wenn sie sich bewegt",
        answerD = "Immer bei Verletzungen",
        correctAnswer = 1,
        explanation = "Die stabile Seitenlage verhindert, dass eine bewusstlose, atmende Person am Erbrochenen erstickt. Bei fehlender Atmung muss sofort mit Reanimation begonnen werden.",
        difficulty = 1,
        funFact = "Die stabile Seitenlage wird in Erste-Hilfe-Kursen weltweit gelehrt und hat seit ihrer systematischen Verbreitung in den 1960er-Jahren zahlreiche Leben gerettet."
    ),

    // Question 40 - CPR basics
    Question(
        categoryId = 16,
        questionText = "Was ist der erste Schritt bei einer Person, die bewusstlos ist und nicht atmet?",
        answerA = "Wasser ueber sie giessen",
        answerB = "Sofort 112 rufen und mit Herzdruckmassage beginnen",
        answerC = "Warten, bis sie von selbst aufwacht",
        answerD = "Ihr etwas zu essen geben",
        correctAnswer = 1,
        explanation = "Bei Bewusstlosigkeit ohne Atmung sofort 112 rufen und Herzdruckmassage beginnen: 30 Mal kraeftig auf die Mitte der Brust druecken, dann 2 Atemstoss geben, wiederholen.",
        difficulty = 1,
        funFact = "Durch schnelle Herzdruckmassage koennen Ersthelfer die Ueberlebenschancen eines Herzstillstands verdoppeln oder sogar verdreifachen."
    ),

    // Question 41 - Fainting
    Question(
        categoryId = 16,
        questionText = "Was tut man, wenn jemand ohnmaechtig wird?",
        answerA = "Die Person sofort hochstellen",
        answerB = "Die Person hinlegen und die Beine hochlagern",
        answerC = "Kaltes Wasser ins Gesicht schitten",
        answerD = "Die Person schuetteln",
        correctAnswer = 1,
        explanation = "Bei Ohnmacht legt man die Person hin und lagert die Beine hoch, damit mehr Blut zum Gehirn stroemt. Beengende Kleidung lockern und fuer Frischluft sorgen.",
        difficulty = 1,
        funFact = "Ohnmacht ist haeufig eine Schutzreaktion des Koerpers: In liegender Position kann das Blut leichter zum Gehirn gelangen und die Bewusstlosigkeit endet meistens von selbst."
    ),

    // Question 42 - Mumps
    Question(
        categoryId = 16,
        questionText = "Woran erkennt man Mumps?",
        answerA = "An Blaeschen auf der Haut",
        answerB = "An schmerzhaft geschwollenen Ohrspeicheldruesen",
        answerC = "An Gelbfaerbung der Augen",
        answerD = "An Ausschlag auf dem Ruecken",
        correctAnswer = 1,
        explanation = "Mumps (Ziegenpeter) fuehrt zur schmerzhaften Schwellung der Ohrspeicheldruesen. Das Gesicht sieht dann hamsterartig aufgeblasen aus.",
        difficulty = 1,
        funFact = "Mumps kann bei erwachsenen Maennern zu einer Entzuendung der Hodendruse fuehren, die in seltenen Faellen zur Unfruchtbarkeit fuehren kann."
    ),

    // Question 43 - Rubella
    Question(
        categoryId = 16,
        questionText = "Warum sind Roeteln besonders gefaehrlich fuer schwangere Frauen?",
        answerA = "Sie koennen schwere Schaeeden beim Ungeborenen verursachen",
        answerB = "Sie fuehren bei der Mutter zu Herzerkrankungen",
        answerC = "Sie erhoehen das Risiko fuer Krebs",
        answerD = "Sie sind bei Schwangeren gar nicht gefaehrlich",
        correctAnswer = 0,
        explanation = "Roeteln in der Schwangerschaft koennen beim Ungeborenen schwere Missbildungen an Herz, Augen und Ohren verursachen. Deshalb ist die Impfung vor einer Schwangerschaft wichtig.",
        difficulty = 1,
        funFact = "Das Roetelnvirus gehoert zu den wenigen Viren, die die Plazentabarriere ueberwinden und direkt auf das Ungeborene uebergehen koennen."
    ),

    // Question 44 - Tetanus
    Question(
        categoryId = 16,
        questionText = "Wozu wird eine Tetanus-Auffrischimpfung nach einer tiefen Wunde empfohlen?",
        answerA = "Gegen Austrocknung der Wunde",
        answerB = "Um eine lebensbedrohliche Muskelkrankheit durch Tetanus-Bakterien zu verhindern",
        answerC = "Weil Tetanus ansteckend ist",
        answerD = "Um die Wundheilung zu beschleunigen",
        correctAnswer = 1,
        explanation = "Tetanus (Wundstarrkrampf) wird durch Bakterien verursacht, die in der Erde vorkommen und durch Wunden in den Koerper gelangen. Die Krankheit fuehrt zu Muskelkraempfen und kann toedlich sein.",
        difficulty = 1,
        funFact = "Tetanus wird nicht von Mensch zu Mensch uebertragen. Der Erreger lebt im Boden und kann jahrzehntelang als Spore ueberleben."
    ),

    // Question 45 - Sunstroke
    Question(
        categoryId = 16,
        questionText = "Welche Symptome hat ein Sonnenstich?",
        answerA = "Froesteln und blaue Lippen",
        answerB = "Roter heisser Kopf, Kopfschmerzen, Schwindel und Uebelkeit",
        answerC = "Starke Unterkuehlung der Fuesse",
        answerD = "Ploetzlicher Hustenanfall",
        correctAnswer = 1,
        explanation = "Ein Sonnenstich entsteht durch direkte Sonneneinstrahlung auf den Kopf und aeussert sich mit rotem Kopf, Kopfschmerzen, Schwindel und Uebelkeit. Im Schatten liegen und kuehlen.",
        difficulty = 1,
        funFact = "Ein Sonnenstich und ein Hitzeschlag sind verschiedene Erkrankungen: Beim Sonnenstich ist nur der Kopf betroffen, beim Hitzeschlag ueberhitzt der gesamte Koerper."
    ),

    // Question 46 - Heat stroke
    Question(
        categoryId = 16,
        questionText = "Was ist ein gefaehrliches Zeichen beim Hitzschlag im Unterschied zum Sonnenstich?",
        answerA = "Leichte Muedigkeit",
        answerB = "Durstgefuehl",
        answerC = "Keine Schweiproduktion trotz grosser Hitze und Verwirrtheit",
        answerD = "Gelegentliches Gaehnen",
        correctAnswer = 2,
        explanation = "Beim Hitzschlag versagt die Kuehlungsregulation des Koerpers. Gefaehrliche Zeichen sind fehlender Schweiss trotz Hitze und Bewusstseinsveraenderungen. Sofort 112 rufen!",
        difficulty = 1,
        funFact = "Die Koerpertemperatur kann beim Hitzschlag auf ueber 40 Grad ansteigen, was zu Organschaeeden und im schlimmsten Fall zum Tod fuehren kann."
    ),

    // Question 47 - Hypothermia
    Question(
        categoryId = 16,
        questionText = "Was ist Unterkuehlung (Hypothermie)?",
        answerA = "Wenn man sich nach dem Sport zu wenig ausruht",
        answerB = "Wenn die Koerpertemperatur unter 35 Grad Celsius faellt",
        answerC = "Wenn man zu wenig isst",
        answerD = "Wenn man nachts schlaecht schlaeeft",
        correctAnswer = 1,
        explanation = "Hypothermie entsteht, wenn der Koerper mehr Waerme verliert, als er produzieren kann, und die Kerntemperatur unter 35 Grad Celsius sinkt. Sie kann lebensbedrohlich werden.",
        difficulty = 1,
        funFact = "Wasser kuehlt den Koerper 25 Mal schneller als Luft. Deshalb kann jemand im kalten Wasser schon nach wenigen Minuten eine Unterkuehlung bekommen."
    ),

    // Question 48 - Wound infection signs
    Question(
        categoryId = 16,
        questionText = "Woran erkennt man, dass eine Wunde sich entzuendet hat?",
        answerA = "Sie wird kleiner und heller",
        answerB = "Roetung, Waerme, Schwellung und evt. Eiterbildung",
        answerC = "Sie heilt schneller als normal",
        answerD = "Sie verursacht keinen Schmerz mehr",
        correctAnswer = 1,
        explanation = "Eine infizierte Wunde zeigt die klassischen Entzuendungszeichen: Roetung, Waerme, Schwellung und Schmerz. Eiterbildung ist ein deutliches Zeichen und benoetigt aerztliche Behandlung.",
        difficulty = 1,
        funFact = "Der Eiter besteht hauptsaechlich aus abgestorbenen weissen Blutkoerperchen, die beim Kampf gegen eindringende Bakterien ihr Leben gelassen haben."
    ),

    // Question 49 - Tick bite
    Question(
        categoryId = 16,
        questionText = "Was sollte man nach einem Zeckenbiss beachten?",
        answerA = "Die Zecke mit einer Flamme erwaermen",
        answerB = "Die Zecke mit einer Pinzette nah an der Haut herausziehen und die Stelle beobachten",
        answerC = "Die Zecke mit Oel oder Klebstoff behandeln",
        answerD = "Sofort einen Notruf absetzen",
        correctAnswer = 1,
        explanation = "Zecken mit einer Pinzette oder Zeckenzange nah an der Haut herausziehen, ohne zu drehen oder zu quetschen. Die Einstichstelle wochen lang auf einen roten Ring beobachten.",
        difficulty = 1,
        funFact = "Zecken koennen die Lyme-Borreliose und FSME uebertragen. Der charakteristische rote Ring (Wanderroete) um den Stich ist ein Warnsignal fuer Borreliose."
    ),

    // Question 50 - First aid course
    Question(
        categoryId = 16,
        questionText = "Wie oft sollte man einen Erste-Hilfe-Kurs auffrischen?",
        answerA = "Nie, einmal reicht",
        answerB = "Alle zwei Jahre",
        answerC = "Alle zehn Jahre",
        answerD = "Nur bei Fuehrerscheinerwerb",
        correctAnswer = 1,
        explanation = "Es wird empfohlen, Erste-Hilfe-Kenntnisse alle zwei Jahre aufzufrischen, damit man im Notfall sicher handeln kann. Viele Richtlinien werden staendig aktualisiert.",
        difficulty = 1,
        funFact = "In Deutschland ist ein Erste-Hilfe-Kurs Pflicht fuer die Fuehrerscheinpruefung. Dennoch fuehlten sich laut Umfragen weniger als 50 Prozent der Deutschen sicher, im Notfall helfen zu koennen."
    )

)
