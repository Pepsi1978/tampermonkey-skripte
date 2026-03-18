package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsMaster6(): List<Question> = listOf(

    // --- Cold War Intelligence: Berlin Tunnel / Operation Gold ---

    Question(
        categoryId = 3,
        questionText = "Welcher sowjetische Doppelagent innerhalb des britischen SIS verriet den Alliierten die Operation Gold (Berliner Tunnel) noch vor Baubeginn im Jahr 1953?",
        answerA = "George Blake",
        answerB = "Kim Philby",
        answerC = "Donald Maclean",
        answerD = "Anthony Blunt",
        correctAnswer = 0,
        explanation = "George Blake, ein britischer SIS-Offizier und KGB-Agent, nahm im Oktober 1953 an der geheimen Planungskonferenz in Washington teil, auf der Operation Gold beschlossen wurde. Er informierte den KGB sofort, doch Moskau ließ den Tunnel absichtlich weiterlaufen, um Blake nicht zu enttarnen. Erst im April 1956 wurde der Tunnel 'zufällig' entdeckt.",
        difficulty = 5,
        funFact = "Der Tunnel war 450 Meter lang und verlief 6 Meter unter der Erdoberfläche von West-Berlin nach Altglienicke. Die CIA und der britische SIS zapften damit bis zu 500 sowjetische Telefonleitungen ab — obwohl der KGB die gesamte Operation von Anfang an kannte."
    ),

    Question(
        categoryId = 3,
        questionText = "Unter welchem Decknamen führten CIA und britischer SIS die gemeinsame Operation zum Abhören sowjetischer Kommunikationsleitungen via Tunnel in Berlin?",
        answerA = "Operation Gold / Operation Stopwatch",
        answerB = "Operation Silver / Operation Mole",
        answerC = "Operation Bronze / Operation Pipeline",
        answerD = "Operation Ivy / Operation Foxhole",
        correctAnswer = 0,
        explanation = "Die CIA nannte die Operation intern 'Operation Gold', der britische MI6 verwendete den Decknamen 'Operation Stopwatch'. Der Tunnel wurde zwischen August 1954 und April 1955 gebaut und war von April 1955 bis April 1956 in Betrieb. Die Auswertung der abgehörten Gespräche dauerte noch Jahre nach der Entdeckung.",
        difficulty = 5,
        funFact = "Die Auswertung der abgehörten Materialen füllte über 50.000 Spulen Tonband. Selbst Jahre nach Entdeckung des Tunnels analysierten CIA-Mitarbeiter noch die abgehörten Gespräche — ein Großteil betraf banale Alltagsgespräche sowjetischer Soldaten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische Tarnung verwendeten CIA und MI6, um den Bau des Berliner Abhörtunnels zu verschleiern?",
        answerA = "Ein vorgetäuschtes Radarlager der US Army",
        answerB = "Ein britisches Militärdepot für Lebensmittel",
        answerC = "Eine amerikanische Kaserne mit unterirdischem Bunker",
        answerD = "Ein ziviles Lagerhaus einer fiktiven Exportfirma",
        correctAnswer = 0,
        explanation = "An der Oberfläche errichteten die Alliierten ein vorgetäuschtes Radarlager (Radarstation) der US Army in Alt-Glienicke, West-Berlin. Darunter wurde die eigentliche Tunnelanlage mit Abhörausrüstung gebaut. Die umfangreichen Erdarbeiten ließen sich so als notwendige Fundamentierungsarbeiten für das 'Radar' tarnen.",
        difficulty = 5,
        funFact = "Die Temperaturregulierung im Tunnel stellte ein enormes technisches Problem dar: Die Wärme der Abhörgeräte hätte den Boden über dem Tunnel aufgetaut und im Winter den Schnee geschmolzen — ein sofort sichtbares Verräterzeichen. Spezielle Kühlanlagen lösten das Problem."
    ),

    // --- Cold War Intelligence: Oleg Penkovsky ---

    Question(
        categoryId = 3,
        questionText = "Welchen Codenamen vergab der westliche Geheimdienst dem sowjetischen GRU-Oberst Oleg Penkovsky, der zwischen 1961 und 1962 für CIA und MI6 spionierte?",
        answerA = "HERO",
        answerB = "IRONBARK",
        answerC = "RUPEE",
        answerD = "CARDINAL",
        correctAnswer = 0,
        explanation = "Oleg Penkovsky erhielt den CIA-Codenamen HERO. Er übergab dem Westen in nur 18 Monaten über 5.000 Fotos von geheimen Dokumenten, darunter sowjetische Raketentechnologie und Militärdoktrinen. Seine Informationen waren während der Kubakrise im Oktober 1962 von entscheidender Bedeutung für die Einschätzung der sowjetischen Raketenkapazitäten.",
        difficulty = 5,
        funFact = "Penkovsky übergab seine Informationen oft in öffentlichen Pariser und Londoner Hotels, wo er als Teil offizieller sowjetischer Delegationen auftrat. Er fotografierte Dokumente mit einer Minox-Kamera und traf seine westlichen Führungsoffiziere — darunter den britischen Geschäftsmann Greville Wynne — in einfachen Hotelzimmern."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche entscheidende militärisch-technische Information lieferte Penkovsky während der Kubakrise 1962, die US-Analysten erst ermöglichte, die sowjetischen Raketen auf kubanischem Boden korrekt zu identifizieren?",
        answerA = "Technische Handbücher zur R-12-Rakete (NATO: SS-4) mit Startvorbereitungszeiten",
        answerB = "Den genauen Standortplan aller sowjetischen Raketenbasen auf Kuba",
        answerC = "Die Schiffsladelisten der sowjetischen Frachter nach Kuba",
        answerD = "Den Originaltext von Chruschtschows Geheimbefehl zur Stationierung",
        correctAnswer = 0,
        explanation = "Penkovsky hatte bereits vor der Kubakrise technische Handbücher zur R-12-Mittelstreckenrakete übergeben. Diese Unterlagen enthielten präzise Maßangaben der Startkomplexe und Fahrzeuge. Als US-Analysten die U-2-Aufnahmen auswerteten, konnten sie mithilfe von Penkovskys Materialien die Stellungen auf Kuba exakt als R-12-Basen identifizieren.",
        difficulty = 5,
        funFact = "Penkovsky wurde im Oktober 1962 — mitten in der Kubakrise — vom KGB verhaftet. Er wurde im Mai 1963 erschossen. Greville Wynne, sein britischer Kurier, wurde ebenfalls verhaftet und saß in sowjetischer Haft, bis er 1964 gegen den KGB-Agenten Gordon Lonsdale ausgetauscht wurde."
    ),

    // --- Cold War Intelligence: Oleg Gordievsky ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr begann Oleg Gordievsky, KGB-Resident in London, aktiv für den britischen MI6 zu arbeiten, und was war der ausschlaggebende persönliche Wendepunkt?",
        answerA = "1974; die Enttäuschung über die Niederschlagung des Prager Frühlings 1968",
        answerB = "1971; seine Verhaftung durch MI5 in London und anschließende Werbung",
        answerC = "1968; die persönliche Begegnung mit einem MI6-Offizier in Kopenhagen",
        answerD = "1982; nach seiner Versetzung nach London als Stationsleiter",
        correctAnswer = 0,
        explanation = "Gordievsky begann 1974 in Kopenhagen für den MI6 zu arbeiten. Ausschlaggebend war seine tiefe Desillusionierung nach der Niederschlagung des Prager Frühlings 1968, die er als endgültigen Beweis für das verbrecherische Wesen des sowjetischen Systems empfand. Sein erster Kontakt mit dem MI6 wurde in Kopenhagen geknüpft, wo er als KGB-Offizier stationiert war.",
        difficulty = 5,
        funFact = "Gordievsky spielte eine entscheidende Rolle dabei, die sowjetische Führung von der irrtümlichen Überzeugung abzubringen, der NATO-Übungsplan 'Able Archer 83' sei ein echter Angriff. Seine Berichte erreichten Premierministerin Thatcher und wurden an die Reagan-Regierung weitergeleitet — was möglicherweise einen nuklearen Krieg verhinderte."
    ),

    Question(
        categoryId = 3,
        questionText = "Unter welchem Decknamen exfiltrierten MI6-Agenten Gordievsky im Juli 1985 aus der Sowjetunion, und über welche Grenze?",
        answerA = "Operation PIMLICO; über die sowjetisch-finnische Grenze",
        answerB = "Operation HOTSPUR; mit einem U-Boot durch die Ostsee",
        answerC = "Operation BROADSIDE; über die sowjetisch-türkische Grenze",
        answerD = "Operation CARDINAL; durch einen Diplomatentunnel in Moskau",
        correctAnswer = 0,
        explanation = "Die Exfiltration trug den Codenamen Operation PIMLICO. Gordievsky versteckte sich im Kofferraum eines britischen Diplomatenautos und wurde über die sowjetisch-finnische Grenze nach Finnland geschmuggelt. Die Grenzüberquerung war exakt für den Moment geplant, in dem die sowjetischen Grenzschutzhunde von Sandwiches aus einer britischen Diplomatentasche abgelenkt wurden.",
        difficulty = 5,
        funFact = "Gordievsky hatte einen monatelangen Notfallplan mit dem MI6 vereinbart: Wenn er in Gefahr war, sollte er mit einem Safeway-Tüte an einem bestimmten Ort in Moskau erscheinen — ein Signal, das die Exfiltrationsmaschinerie in Gang setzte. Er wartete Wochen auf die Bestätigung, bevor das Treffen stattfand."
    ),

    // --- Cold War Intelligence: Aldrich Ames ---

    Question(
        categoryId = 3,
        questionText = "Wie viele CIA-Agenten und westliche Quellen enttarnte Aldrich Ames mit seinen Informationen an den KGB, und wie viele wurden daraufhin hingerichtet?",
        answerA = "Über 100 Quellen kompromittiert; mindestens 10 Agenten hingerichtet",
        answerB = "Ca. 30 Quellen kompromittiert; 3 Agenten hingerichtet",
        answerC = "Ca. 25 Quellen kompromittiert; 2 Agenten hingerichtet",
        answerD = "Über 200 Quellen kompromittiert; 20 Agenten hingerichtet",
        correctAnswer = 0,
        explanation = "Ames kompromittierte über 100 Quellen und CIA-Operationen weltweit. Mindestens 10 Agenten, die er verraten hatte, wurden vom KGB hingerichtet, darunter Dimitri Polyakov (TOPHAT), ein weiterer hochrangiger GRU-General, der jahrzehntelang für die CIA gearbeitet hatte. Ames war von 1985 bis zu seiner Verhaftung 1994 aktiv.",
        difficulty = 5,
        funFact = "Der CIA-interne Verdacht auf einen Maulwurf entstand schon früh, als 1985 — dem 'Jahr des Spions' — in kurzer Zeit zahlreiche sowjetische Quellen aufflogen. Doch die eigentliche Untersuchung dauerte fast ein Jahrzehnt, weil intern niemand glauben wollte, dass ein eigener CIA-Offizier der Verräter sein könnte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche konkreten Konsumausgaben machten die CIA intern misstrauisch gegenüber Aldrich Ames?",
        answerA = "Ein bar bezahltes Haus in Virginia für 540.000 Dollar und ein Jaguar-Auto",
        answerB = "Luxusreisen nach Genf und ein Konto in der Cayman Islands",
        answerC = "Ein Boot im Wert von 200.000 Dollar und häufige Casinobesuche in Las Vegas",
        answerD = "Mehrere Immobilien in Kolumbien und ein Privatflugzeug",
        correctAnswer = 0,
        explanation = "Ames kaufte 1989 ein Haus in North Arlington, Virginia für 540.000 Dollar — vollständig in bar. Außerdem fuhr er einen neuen Jaguar. Sein Gehalt als CIA-Offizier betrug ca. 60.000 Dollar jährlich. Diese offensichtlichen Diskrepanzen zwischen Einkommen und Lebensstandard hätten früher Alarm schlagen sollen, wurden aber lange ignoriert.",
        difficulty = 5,
        funFact = "Ames erhielt vom KGB insgesamt mehr als 4,6 Millionen Dollar — die größte jemals an einen US-Agenten gezahlte Summe. Er erklärte seinen Kollegen seinen plötzlichen Reichtum mit dem Vermögen seiner kolumbianischen Frau Rosario. Tatsächlich war auch sie in seine Spionagetätigkeiten eingeweiht."
    ),

    // --- Cold War Crisis: Berlin Ultimatum 1958 ---

    Question(
        categoryId = 3,
        questionText = "Welche präzise Forderung stellte Chruschtschow in seinem Berliner Ultimatum vom 27. November 1958, und welche Frist setzte er?",
        answerA = "West-Berlin solle innerhalb von sechs Monaten zur entmilitarisierten Freien Stadt werden; sonst würde die UdSSR einen separaten Friedensvertrag mit der DDR schließen",
        answerB = "Die westlichen Alliierten sollten West-Berlin binnen drei Monaten räumen und es der DDR übergeben",
        answerC = "West-Berlin sollte sofort der DDR eingegliedert werden oder die NATO verlassen",
        answerD = "Die Vier-Mächte-Kontrolle über Berlin sollte durch eine UNO-Verwaltung ersetzt werden",
        correctAnswer = 0,
        explanation = "Chruschtschow forderte in seiner Note vom 27. November 1958, West-Berlin solle innerhalb von sechs Monaten zu einer 'Freien Stadt' entmilitarisiert werden. Andernfalls würde die Sowjetunion einen separaten Friedensvertrag mit der DDR schließen, wodurch die Westmächte ihre Transitrechte nach Berlin an die DDR-Regierung abtreten müssten — die sie bisher nicht anerkannten.",
        difficulty = 5,
        funFact = "Das Ultimatum löste eine vierjährige Berlin-Krise aus, die erst 1961 mit dem Mauerbau einen vorläufigen Abschluss fand. Chruschtschow verlängerte seine Fristen mehrfach, wenn westlicher Widerstand zu stark wurde — ein Muster des Drucks ohne direkten Kriegswillen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche westliche Antwort auf das Berliner Ultimatum 1958 war die koordinierte Grundlage der NATO-Haltung, und in welchem Dokument wurde sie festgehalten?",
        answerA = "Die Westmächte lehnten die Forderungen in ihren Noten vom Mai 1959 geschlossen ab und bestanden auf den Vier-Mächte-Rechten gemäß der Londoner Konferenz 1954",
        answerB = "Der NATO-Rat verabschiedete die 'Berliner Resolution' vom Januar 1959",
        answerC = "Die drei Westmächte akzeptierten Verhandlungen über einen Sonderstatus, ablehnend für eine freie Stadt",
        answerD = "US-Präsident Eisenhower erklärte Berlin zur 'vitalen Sicherheitszone' der USA",
        correctAnswer = 0,
        explanation = "Die drei Westmächte (USA, Großbritannien, Frankreich) lehnten Chruschtschows Forderungen in gleichlautenden Noten vom Mai 1959 ab. Sie bestanden auf der Fortgeltung ihrer Vier-Mächte-Rechte in Berlin, die auf den Vereinbarungen von 1944/45 und der Londoner Konferenz von 1954 beruhten. Die Einheit der westlichen Haltung war entscheidend für das Scheitern des Ultimatums.",
        difficulty = 5,
        funFact = "Das Ultimatum führte indirekt zu einer der kuriosesten diplomatischen Episoden des Kalten Krieges: Chruschtschows USA-Besuch 1959, bei dem er Disneyland besuchen wollte — und aus Sicherheitsgründen abgewiesen wurde. Seine öffentliche Entrüstung darüber wurde weltberühmt."
    ),

    // --- Cold War Crisis: Checkpoint Charlie Standoff 1961 ---

    Question(
        categoryId = 3,
        questionText = "Wie viele amerikanische und sowjetische Panzer standen sich beim Checkpoint-Charlie-Showdown am 27./28. Oktober 1961 gegenüber, und wer gab zuerst nach?",
        answerA = "Je 10 Panzer auf jeder Seite; die sowjetischen Panzer zogen sich zuerst zurück",
        answerB = "Je 5 Panzer auf jeder Seite; die amerikanischen Panzer zogen sich zuerst zurück",
        answerC = "Je 15 Panzer auf jeder Seite; beide Seiten zogen sich gleichzeitig zurück",
        answerD = "Je 20 Panzer auf jeder Seite; die sowjetischen Panzer zogen sich zuerst zurück",
        correctAnswer = 0,
        explanation = "Am 27. Oktober 1961 standen sich am Checkpoint Charlie je 10 amerikanische M48-Patton-Panzer und 10 sowjetische T-54/55-Panzer in nur 90 Metern Abstand gegenüber. Nach 16-stündigem Stillstand zogen die sowjetischen Panzer als erste ab — gefolgt von den amerikanischen im Abstand von einigen Minuten. Der Rückzug wurde in einem Geheimkanal zwischen Kennedy und Chruschtschow vereinbart.",
        difficulty = 5,
        funFact = "Die Konfrontation entstand, weil die DDR begann, westliche Zivilisten an der Grenze zu kontrollieren — was die USA als Verletzung der Vier-Mächte-Rechte betrachteten. General Lucius Clay ließ daraufhin Zivilfahrzeuge von Militärjeeps durch den Checkpoint eskortieren, was die Situation eskalieren ließ."
    ),

    // --- Cold War Crisis: Able Archer 83 ---

    Question(
        categoryId = 3,
        questionText = "Was war der Codename des NATO-Kommandostabsübung im November 1983, die die sowjetische Führung für eine echte Kriegsvorbereitung hielt, und wer informierte den Westen über die sowjetischen Befürchtungen?",
        answerA = "Able Archer 83; Oleg Gordievsky (KGB) und andere Agenten",
        answerB = "Autumn Forge 83; Robert Hanssen (FBI)",
        answerC = "Reforger 83; Vitaly Yurchenko (KGB)",
        answerD = "Wintex 83; Adolf Tolkachev (GRU)",
        correctAnswer = 0,
        explanation = "Able Archer 83 war eine NATO-Kommandostabsübung vom 7.–11. November 1983, die den Übergang zu einem nuklearen Krieg simulierte. Der sowjetische KGB initiierte das Projekt RYaN (Raketno-Yadernoye Napadenie), um NATO-Erstschlagsvorbereitungen zu erkennen. Gordievsky informierte den MI6 über die tatsächliche sowjetische Panik, die zur Umsteuerung westlicher Politik führte.",
        difficulty = 5,
        funFact = "Die Übung war realistischer als frühere: Erstmals nahm US-Präsident Reagan nicht persönlich teil, was den Sowjets als Zeichen erschien, er halte sich in einem sicheren Bunker versteckt. Manche Historiker halten Able Archer 83 für den gefährlichsten Moment des Kalten Krieges seit der Kubakrise."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches sowjetische Geheimdienstprogramm wurde als direkte Reaktion auf die wahrgenommene NATO-Bedrohung 1981 gestartet und sollte Anzeichen eines bevorstehenden NATO-Erstschlags sammeln?",
        answerA = "Projekt RYaN (RYAN)",
        answerB = "Projekt VRYAN",
        answerC = "Operation SOSUS",
        answerD = "Programm WARLORD",
        correctAnswer = 0,
        explanation = "Projekt RYaN (russisch: Ракетно-Ядерное Нападение, Raketno-Yadernoye Napadenie = Raketen-Nuklear-Angriff) wurde 1981 von KGB-Chef Juri Andropow und GRU-Chef Pjotr Iwaschutin lanciert. Es war das größte Friedenszeit-Geheimdienstprogramm der Sowjetgeschichte und instruierte alle KGB-Residenten weltweit, Indikatoren für einen bevorstehenden NATO-Erstschlag zu sammeln.",
        difficulty = 5,
        funFact = "Zu den im Rahmen von RYaN überwachten Indikatoren gehörten so banale Dinge wie die Öffnungszeiten von Blutbanken (erhöhte Lagerung = Kriegsvorbereitung?) und ob Lichter in Regierungsgebäuden nach Mitternacht brannten. Diese Methoden zeigten, wie paranoid und systematisch die sowjetische Führung die NATO beobachtete."
    ),

    // --- German Reunification: Monday Demonstrations ---

    Question(
        categoryId = 3,
        questionText = "Welcher Losungswandel der Montagsdemonstrationen in Leipzig zwischen September und November 1989 markiert den historiographisch bedeutsamen Übergang vom Reformwillen zur Forderung nach Einheit?",
        answerA = "Von 'Wir sind das Volk' zu 'Wir sind ein Volk'",
        answerB = "Von 'Keine Gewalt' zu 'Einheit jetzt'",
        answerC = "Von 'Freie Wahlen' zu 'Deutschland einig Vaterland'",
        answerD = "Von 'Reisefreiheit' zu 'Wiedervereinigung sofort'",
        correctAnswer = 0,
        explanation = "Der Wandel des Slogans von 'Wir sind das Volk' — ein demokratischer Anspruch auf Volkssouveränität — zu 'Wir sind ein Volk' ab Anfang November 1989 markiert den Übergang von der Reform- zur Einheitsbewegung. Die frühere Parole betonte die DDR-Bürgerrechte, die spätere forderte die nationale Einheit beider deutschen Staaten.",
        difficulty = 5,
        funFact = "Am 9. Oktober 1989 demonstrierten in Leipzig rund 70.000 Menschen — die größte politische Kundgebung in der DDR-Geschichte bis dahin. Trotz befürchteter staatlicher Gewalt blieben die Sicherheitskräfte passiv. Dieser Abend gilt als der 'entscheidende Montag', der den friedlichen Charakter der Revolution besiegelte."
    ),

    Question(
        categoryId = 3,
        questionText = "In welcher Kirche Leipzigs begannen die Friedensgebete, aus denen die Montagsdemonstrationen erwuchsen, und seit welchem Jahr fanden sie regelmäßig statt?",
        answerA = "Nikolaikirche Leipzig; seit 1982",
        answerB = "Thomaskirche Leipzig; seit 1980",
        answerC = "Reformierte Kirche Leipzig; seit 1985",
        answerD = "Propsteikirche Leipzig; seit 1983",
        correctAnswer = 0,
        explanation = "Die Friedensgebete in der Nikolaikirche Leipzig begannen 1982 unter Pfarrer Christian Führer als regelmäßige Montags-Gebete. Sie entwickelten sich zu einem der wichtigsten oppositionellen Sammelpunkte der DDR und bildeten den organisatorischen Kern, aus dem die Montagsdemonstrationen des Herbstes 1989 entstanden.",
        difficulty = 5,
        funFact = "Die Nikolaikirche wurde bewusst als Treffpunkt gewählt, weil die SED die Kirche als politisch harmlos einschätzte und kirchliche Räume nicht einfach stürmen konnte. Pfarrer Führer nutzte dies systematisch, um den Friedensgebeten einen zunehmend politischen Charakter zu geben."
    ),

    // --- German Reunification: Kohl's Ten Points ---

    Question(
        categoryId = 3,
        questionText = "An welchem genauen Datum präsentierte Bundeskanzler Helmut Kohl seinen Zehn-Punkte-Plan zur Überwindung der deutschen Teilung, und welcher westliche Verbündete war vorab NICHT informiert worden?",
        answerA = "28. November 1989; Frankreich (Präsident Mitterrand) und die USA (Außenminister Baker) wurden nicht konsultiert",
        answerB = "9. November 1989; Großbritannien (Premierministerin Thatcher) war nicht informiert",
        answerC = "1. Dezember 1989; Frankreich und Großbritannien waren nicht informiert",
        answerD = "20. November 1989; die USA (Präsident Bush) waren nicht informiert",
        correctAnswer = 0,
        explanation = "Kohl präsentierte seinen Zehn-Punkte-Plan am 28. November 1989 im Bundestag — ohne vorherige Abstimmung mit den westlichen Verbündeten. Weder Frankreich, noch die USA (Außenminister Baker), noch Großbritannien wurden vorab informiert. Dies führte zu erheblicher Verstimmung, besonders bei Mitterrand und Thatcher, die eine schnelle Wiedervereinigung ablehnten.",
        difficulty = 5,
        funFact = "Margaret Thatcher war so verärgert über Kohls Alleingang, dass sie wenige Tage später nach Paris reiste und mit Mitterrand Optionen besprach, die Wiedervereinigung zu verlangsamen. Sie fragte einen Historiker, wie oft Deutschland in den letzten Jahren Europa bedroht hatte — und bekam eine unbequeme Antwort."
    ),

    Question(
        categoryId = 3,
        questionText = "Was sah Punkt 5 von Kohls Zehn-Punkte-Plan konkret vor, und welches neue institutionelle Format wurde damit eingeführt?",
        answerA = "Die Schaffung konföderativer Strukturen zwischen beiden deutschen Staaten als Vorstufe zur Einheit",
        answerB = "Sofortige Währungsunion zwischen BRD und DDR",
        answerC = "Freie Wahlen in der DDR innerhalb von drei Monaten",
        answerD = "Die vollständige wirtschaftliche Integration beider deutscher Staaten",
        correctAnswer = 0,
        explanation = "Punkt 5 des Zehn-Punkte-Plans sah die Entwicklung konföderativer Strukturen zwischen beiden deutschen Staaten vor — gemeinsame Gremien und Institutionen als Zwischenstufe auf dem Weg zu einer etwaigen Einheit. Dies war ein bewusst vorsichtiger Ansatz, der eine sofortige Vereinigung vermied und stattdessen schrittweise Annäherung propagierte.",
        difficulty = 5,
        funFact = "Kohl hatte selbst keine klare Zeitvorstellung für eine mögliche Wiedervereinigung. Sein Plan enthielt kein konkretes Datum. Dass die Einheit schon am 3. Oktober 1990 vollzogen werden würde — weniger als ein Jahr nach dem Mauerfall — überraschte Kohl selbst."
    ),

    // --- German Reunification: Two Plus Four Specifics ---

    Question(
        categoryId = 3,
        questionText = "In welcher Reihenfolge wurden die Zwei-plus-Vier-Verhandlungen geführt, und welcher Artikel des Vertrages regelte die endgültige Grenzfrage?",
        answerA = "Vier Runden (Bonn, Berlin, Paris, Moskau); Artikel 1 bestätigte die Oder-Neiße-Grenze als endgültige Ostgrenze Deutschlands",
        answerB = "Drei Runden (Bonn, Moskau, Washington); Artikel 3 regelte die Grenzfrage",
        answerC = "Fünf Runden (Bonn, Berlin, Paris, Moskau, New York); Artikel 2 zum Grenzthema",
        answerD = "Zwei Runden (Bonn, Moskau); Artikel 4 bestätigte die Grenzen",
        correctAnswer = 0,
        explanation = "Die Zwei-plus-Vier-Gespräche fanden in vier Runden statt: Bonn (5. Mai), Berlin (22. Juni), Paris (17. Juli) und Moskau (12. September 1990). Artikel 1 des Vertrages bestätigte, dass Deutschland aus den Gebieten der BRD, der DDR und (West-)Berlin besteht und keine Gebietsansprüche gegenüber anderen Staaten erheben wird — was faktisch die Oder-Neiße-Grenze festschrieb.",
        difficulty = 5,
        funFact = "Polen war formell nicht Vertragspartei der Zwei-plus-Vier-Verhandlungen, wurde aber als Beobachter bei der Sitzung einbezogen, die die Grenzfrage behandelte. Warschau bestand darauf, dass die Grenzbestätigung in einem separaten Vertrag zwischen Deutschland und Polen nochmals bekräftigt wird — was 1990 auch geschah."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche entscheidende Zusicherung gab Bundeskanzler Kohl der Sowjetunion zur NATO-Mitgliedschaft des vereinten Deutschlands, und welche finanziellen Vereinbarungen wurden parallel getroffen?",
        answerA = "Deutschland würde keine NATO-Streitkräfte auf dem Territorium der ehemaligen DDR stationieren; plus 12 Milliarden DM für den Abzug sowjetischer Truppen",
        answerB = "Deutschland würde der NATO innerhalb von fünf Jahren beitreten; plus 8 Milliarden DM Übergangshilfe",
        answerC = "Die NATO würde ihre Ostgrenze nicht über das vereinte Deutschland hinaus erweitern; plus 5 Milliarden DM",
        answerD = "Deutschland würde seine Bundeswehrstärke auf 200.000 Mann reduzieren; plus 10 Milliarden DM",
        correctAnswer = 0,
        explanation = "Im Vertrag verpflichtete sich Deutschland, keine ausländischen NATO-Streitkräfte und keine Nuklearwaffen auf dem Territorium der ehemaligen DDR zu stationieren. Parallel verhandelte Kohl finanzielle Zusagen für den Abzug der sowjetischen Truppen — insgesamt rund 12 Milliarden DM für Übergangshilfen, Wohnungsbau in der Sowjetunion und Truppenabzugskosten.",
        difficulty = 5,
        funFact = "Der Artikel 5 des Zwei-plus-Vier-Vertrages, der die NATO-Mitgliedschaft des vereinten Deutschlands regelt, enthält eine kompromissartige Formulierung: Das vereinte Deutschland gehört der NATO an, aber auf dem Gebiet der ehemaligen DDR gelten besondere militärische Regeln. Diese Konstruktion war ein diplomatisches Meisterstück."
    ),

    // --- German Reunification: Treuhandanstalt ---

    Question(
        categoryId = 3,
        questionText = "Wie hoch war der anfänglich geschätzte Wert des Treuhand-Portfolios von 8.500 Betrieben, und zu welchem tatsächlichen Ergebnis (Defizit) führte die Privatisierung bis 1994?",
        answerA = "Anfangs geschätzt: 600 Milliarden DM Vermögen; tatsächliches Ergebnis: ca. 250 Milliarden DM Defizit",
        answerB = "Anfangs geschätzt: 1 Billion DM Vermögen; tatsächliches Ergebnis: ca. 500 Milliarden DM Defizit",
        answerC = "Anfangs geschätzt: 300 Milliarden DM Vermögen; tatsächliches Ergebnis: ca. 100 Milliarden DM Defizit",
        answerD = "Anfangs geschätzt: 200 Milliarden DM Vermögen; tatsächliches Ergebnis: ca. 50 Milliarden DM Defizit",
        correctAnswer = 0,
        explanation = "Die Treuhandanstalt wurde 1990 mit dem Auftrag gegründet, das DDR-Volkseigentum zu privatisieren. Ursprüngliche Schätzungen sprachen von einem Vermögen von bis zu 600 Milliarden DM. Das tatsächliche Ergebnis war ein Defizit von rund 250 Milliarden DM, da viele Betriebe marode, unverkäuflich oder mit Schulden und Altlasten belastet waren.",
        difficulty = 5,
        funFact = "Die Treuhandanstalt war zwischenzeitlich der größte Industriekonglomerat der Welt — vor General Motors. Ihr Vorsitzender Detlev Karsten Rohwedder wurde am 1. April 1991 von der RAF erschossen. Seine Nachfolgerin Birgit Breuel führte die Privatisierung bis zur Auflösung der Treuhand am 31. Dezember 1994 fort."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche DDR-Regierung unter welchem Ministerpräsidenten beschloss die Gründung der Treuhandanstalt, und auf welchem gesetzlichen Akt beruhte sie?",
        answerA = "Modrow-Regierung; Treuhandgesetz vom 1. März 1990",
        answerB = "de Maizière-Regierung; Treuhandgesetz vom 17. Juni 1990",
        answerC = "Gysi-Regierung; Volkskammerbeschluss vom 15. Januar 1990",
        answerD = "Krenz-Regierung; SED-Parteitagsbeschluss vom Dezember 1989",
        correctAnswer = 0,
        explanation = "Die Treuhandanstalt wurde unter der Übergangsregierung von Hans Modrow durch das Treuhandgesetz vom 1. März 1990 gegründet. Das Gesetz sollte ursprünglich das Volkseigentum in Aktiengesellschaften umwandeln, die weiterhin im Besitz der DDR-Bevölkerung bleiben sollten. Die Privatisierungsausrichtung erhielt die Treuhand erst unter dem Gesetz, das die de-Maizière-Regierung im Juni 1990 verabschiedete.",
        difficulty = 5,
        funFact = "Die ursprüngliche Idee des Treuhandgesetzes vom März 1990 war nicht die Privatisierung, sondern die Demokratisierung des Volkseigentums: DDR-Bürger sollten Anteilsscheine an den Betrieben erhalten. Dieser Plan wurde von der de-Maizière-Regierung und später der Bundesregierung zugunsten einer schnellen Privatisierung aufgegeben."
    ),

    // --- Post-Reunification: Berlin Republic Debate ---

    Question(
        categoryId = 3,
        questionText = "Welcher Begriff prägte die politikwissenschaftliche Debatte über den Charakter des vereinten Deutschlands nach 1990, und welcher Soziologe/Politologe formulierte ihn maßgeblich?",
        answerA = "'Berliner Republik' versus 'Bonner Republik'; Martin und Sylvia Greiffenhagen prägten die analytische Unterscheidung",
        answerB = "'Neue Bundesrepublik' versus 'Alte BRD'; Jürgen Habermas begründete den Diskurs",
        answerC = "'Großdeutschland' versus 'Kleindeutschland'; Karl Dietrich Bracher strukturierte die Debatte",
        answerD = "'Viertes Reich' versus 'Zweites Kaiserreich'; Richard von Weizsäcker war der Hauptprotagonist",
        correctAnswer = 0,
        explanation = "Die Begriffe 'Bonner Republik' (1949–1999) und 'Berliner Republik' (ab 1999 nach dem Umzug des Regierungssitzes) wurden von verschiedenen Politikwissenschaftlern geprägt, prominent von Martin und Sylvia Greiffenhagen. Die Debatte fragte, ob das vereinte Deutschland eine qualitativ neue Republik oder eine Fortsetzung der alten BRD darstellt.",
        difficulty = 5,
        funFact = "Der Umzug von Bonn nach Berlin war politisch heftig umstritten. Die Abstimmung im Bundestag am 20. Juni 1991 ergab 338 zu 320 Stimmen für Berlin — eine knappe Entscheidung, die von vielen westdeutschen Abgeordneten als Fehler betrachtet wurde. Bonn behielt den Status als 'Bundesstadt' mit zahlreichen Ministeriumsabteilungen."
    ),

    // --- Post-Reunification: Fischer-Scharping Kosovo ---

    Question(
        categoryId = 3,
        questionText = "Welcher innerparteiliche Konflikt auf dem Bielefelder Sonderparteitag der Grünen im Mai 1999 markierte einen Wendepunkt für Außenminister Joschka Fischers Kosovo-Politik?",
        answerA = "Fischer wurde mit einem Farbbeutel beworfen; der Parteitag stimmte dennoch gegen einen sofortigen Abbruch der Luftangriffe",
        answerB = "Fischer trat nach einer verlorenen Abstimmung zurück, kehrte aber nach 48 Stunden zurück",
        answerC = "Der Parteitag votierte für ein Waffenembargo gegen die NATO",
        answerD = "Joschka Fischer wurde als Außenminister abgewählt und durch Trittin ersetzt",
        correctAnswer = 0,
        explanation = "Auf dem außerordentlichen Parteitag in Bielefeld am 13. Mai 1999, inmitten der NATO-Luftangriffe auf Jugoslawien, wurde Joschka Fischer von einem Grünen-Demonstranten mit einem Farbbeutel beworfen. Das verletzte Trommelfell wurde sein Symbol für das innerparteiliche Ringen. Der Parteitag lehnte letztlich einen sofortigen Bombenstop ab und stützte damit Fischers Kurs.",
        difficulty = 5,
        funFact = "Der Kosovo-Krieg war der erste Kriegseinsatz der Bundeswehr nach 1945 und der erste NATO-Einsatz ohne UN-Mandat. Fischer, der aus der Friedensbewegung stammte, begründete seine Zustimmung mit dem Slogan 'Nie wieder Auschwitz' — er sah die Verhinderung eines Genozids als moralisches Gebot, das den Pazifismus übertreffe."
    ),

    Question(
        categoryId = 3,
        questionText = "Welchen Rücktritt musste Rudolf Scharping als Verteidigungsminister 2002 vollziehen, und was war der unmittelbare Auslöser?",
        answerA = "Fotos mit seiner Freundin im Pool während des Mazedonien-Einsatzes der Bundeswehr und Vergünstigungen durch einen PR-Berater",
        answerB = "Sein Versagen bei der Bundeswehr-Reform und das Scheitern der Eurofighter-Beschaffung",
        answerC = "Seine Beteiligung an einer CDU-Spendenaffäre, die später aufgedeckt wurde",
        answerD = "Ein Versprechen, niemals Bundeswehrsoldaten in Kriegseinsätze zu schicken, das er gebrochen hatte",
        correctAnswer = 0,
        explanation = "Rudolf Scharping wurde im Juli 2002 von Bundeskanzler Schröder entlassen. Auslöser war ein Bericht, der Fotos von Scharping mit seiner Freundin Kristina Gräfin Pilati in einem Pool in Mallorca zeigte — während die Bundeswehr in Mazedonien im Einsatz war. Hinzu kamen Vorwürfe, er habe einem PR-Berater, der ihn medienwirksam beraten hatte, unerlaubt Aufträge zugeschanzt.",
        difficulty = 5,
        funFact = "Scharping war einer der wenigen deutschen Minister, die wegen eines Medien-Imageschadens und nicht wegen eines Rechtsverstoßes ihr Amt verloren. Der Pool-Skandal wurde zum Symbol für politisches Gespür-Versagen. Sein Nachfolger wurde Peter Struck, der die Bundeswehrreform fortführte."
    ),

    // --- Agenda 2010 / Hartz Reforms ---

    Question(
        categoryId = 3,
        questionText = "Welches genaue Datum und welches Rednerformat wählte Gerhard Schröder für die Ankündigung der Agenda 2010, und wie lautete der exakte Kernsatz seiner Regierungserklärung?",
        answerA = "14. März 2003, Regierungserklärung im Bundestag; Kernaussage: 'Wir werden Leistungen des Staates kürzen, Eigenverantwortung fördern und mehr Eigenleistung von jedem einzelnen abfordern müssen'",
        answerB = "1. Januar 2003, Neujahrsansprache; Kernaussage: 'Deutschland muss sich reformieren oder untergehen'",
        answerC = "1. Oktober 2002, Koalitionsvertrag; Kernaussage: 'Wir werden den Sozialstaat modernisieren'",
        answerD = "27. September 2002, Wahlnacht; Kernaussage: 'Der Wandel muss jetzt kommen'",
        correctAnswer = 0,
        explanation = "Schröder verkündete die Agenda 2010 am 14. März 2003 in einer Regierungserklärung vor dem Bundestag. Der programmatische Kernsatz lautete: 'Wir werden Leistungen des Staates kürzen, Eigenverantwortung fördern und mehr Eigenleistung von jedem einzelnen abfordern müssen.' Die Agenda umfasste Reformen des Arbeitsmarkts, Gesundheitswesens und der Rente.",
        difficulty = 5,
        funFact = "Die Agenda 2010 spaltete die SPD wie kaum eine andere politische Entscheidung in der Nachkriegsgeschichte. Schröder verlor die Mehrheit in der Partei, rief Neuwahlen aus und verlor die Bundestagswahl 2005 knapp — obwohl seine Reformen wirtschaftlich oft als Erfolg bewertet werden."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche vier Hartz-Gesetze wurden zwischen 2003 und 2005 verabschiedet, und was war der wesentliche Inhalt von Hartz IV?",
        answerA = "Hartz I–IV; Hartz IV fusionierte Arbeitslosenhilfe und Sozialhilfe zum Arbeitslosengeld II (ALG II) mit Bedürftigkeitsprüfung",
        answerB = "Hartz I–IV; Hartz IV schuf die 'Ich-AG' als Selbstständigkeitsförderung",
        answerC = "Hartz I–IV; Hartz IV verlängerte die Bezugsdauer des ALG I auf 24 Monate",
        answerD = "Hartz I–IV; Hartz IV privatisierte die Bundesagentur für Arbeit",
        correctAnswer = 0,
        explanation = "Hartz IV (offiziell: Viertes Gesetz für moderne Dienstleistungen am Arbeitsmarkt, 2004) war das einschneidendste der vier Gesetze: Es verschmolz Arbeitslosenhilfe und Sozialhilfe zum Arbeitslosengeld II (ALG II, Hartz IV), das bedürftigkeitsabhängig war und auf Sozialhilfeniveau lag. Wer Vermögen besaß, musste es zunächst aufbrauchen.",
        difficulty = 5,
        funFact = "Peter Hartz, der Namensgeber der Reformen und damalige VW-Personalvorstand, wurde kurz nach Verabschiedung der Gesetze selbst wegen Bestechung und Untreue im VW-Korruptionsskandal verurteilt. Dieser Umstand beschädigte die politische Akzeptanz der Reformen erheblich."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische Veränderung der Bezugsdauer des Arbeitslosengelds I (ALG I) war Teil der Hartz-Reformen, und für welche Gruppe galt eine Ausnahmeregelung?",
        answerA = "Verkürzung auf maximal 12 Monate (vorher bis zu 32 Monate); Ausnahme: über 55-Jährige konnten bis zu 18 Monate beziehen",
        answerB = "Verkürzung auf maximal 6 Monate; keine Ausnahmeregelung",
        answerC = "Verlängerung auf maximal 24 Monate für alle Arbeitslosen",
        answerD = "Abschaffung des ALG I; Ersatz durch einheitliches ALG II",
        correctAnswer = 0,
        explanation = "Mit Hartz III/IV wurde die maximale Bezugsdauer des ALG I von bis zu 32 Monaten (für Ältere) auf grundsätzlich 12 Monate verkürzt. Für Arbeitnehmer ab 55 Jahren galt eine Ausnahme: Sie konnten ALG I bis zu 18 Monate beziehen. Diese Regel wurde später 2007/08 unter Merkel wieder geändert.",
        difficulty = 5,
        funFact = "Die 'Montagsdemos' gegen Hartz IV, die 2004 hauptsächlich in Ostdeutschland stattfanden, erinnerten bewusst an die Montagsdemonstrationen von 1989 — ein deutliches Zeichen, dass viele Ostdeutsche das Gefühl hatten, die Versprechen der Wiedervereinigung seien nicht eingelöst worden."
    ),

    // --- Historiography: Sonderweg Thesis ---

    Question(
        categoryId = 3,
        questionText = "Wer formulierte die Sonderweg-These in ihrer einflussreichsten modernen Form, und in welchem Werk von welchem Jahr?",
        answerA = "Hans-Ulrich Wehler, in 'Das deutsche Kaiserreich 1871–1918' (1973)",
        answerB = "Fritz Fischer, in 'Griff nach der Weltmacht' (1961)",
        answerC = "Helmut Böhme, in 'Deutschlands Weg zur Großmacht' (1966)",
        answerD = "Heinrich August Winkler, in 'Der lange Weg nach Westen' (2000)",
        correctAnswer = 0,
        explanation = "Hans-Ulrich Wehler formulierte in 'Das deutsche Kaiserreich 1871–1918' (1973) die einflussreichste moderne Version der Sonderweg-These. Er argumentierte, dass das Kaiserreich durch eine 'Gesellschaft im Umbruch, aber politisch im Stillstand' charakterisiert war — eine modernisierte Wirtschaft bei gleichzeitig persistenten vormodernen Eliten, die letztlich zum Nationalsozialismus führten.",
        difficulty = 5,
        funFact = "Die Sonderweg-These hatte eine ältere, umgekehrte Version: Im 19. Jahrhundert priesen konservative deutsche Denker den 'deutschen Sonderweg' als positive Alternative zum westlichen Liberalismus — Deutschland als Land der Pflicht, Gemeinschaft und Tiefe gegenüber dem oberflächlichen Individualismus des Westens."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche britischen Historiker formulierten die einflussreichste Gegenkritik zur Sonderweg-These, und wie lautete ihr zentrales Argument?",
        answerA = "David Blackbourn und Geoff Eley in 'The Peculiarities of German History' (1984); Deutschland hatte keine 'verspätete' oder 'gescheiterte' bürgerliche Revolution",
        answerB = "A.J.P. Taylor in 'The Origins of the Second World War' (1961); Hitler war ein normaler Staatsmann",
        answerC = "Ian Kershaw in 'Hitler' (1998); der Nationalsozialismus war eine Ausnahme ohne strukturelle Wurzeln",
        answerD = "Gordon Craig in 'Germany 1866–1945' (1978); die Sonderweg-These überschätzt die Rolle der Eliten",
        correctAnswer = 0,
        explanation = "David Blackbourn und Geoff Eley argumentierten in 'The Peculiarities of German History' (1984), dass die Sonderweg-These auf einem normativen Vergleich mit einer idealisierten 'westlichen' Entwicklung beruht, die tatsächlich so nie existierte. Deutschland hatte keine 'gescheiterte' bürgerliche Revolution — es gab eine Verbürgerlichung der Gesellschaft, nur in anderem Gewand.",
        difficulty = 5,
        funFact = "Der Titel 'The Peculiarities of German History' war eine bewusste Anspielung auf E.P. Thompsons Aufsatz 'The Peculiarities of the English' (1965), in dem Thompson das britische Bürgertum gegen ähnliche strukturalistische Fehlschlüsse verteidigte. Blackbourn und Eley wandten die gleiche Methode auf Deutschland an."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Schlüsselkonzept entwickelte Wehler in seiner Sonderweg-Analyse für die Stabilisierung der Herrschaft im Kaiserreich durch die manipulative Nutzung nationaler und außenpolitischer Ablenkungsmanöver?",
        answerA = "Negative Integration und Sozialimperialismus",
        answerB = "Bonapartismus und Cäsarismus",
        answerC = "Transformativer Konservatismus",
        answerD = "Defensiver Nationalismus",
        correctAnswer = 0,
        explanation = "Wehler entwickelte die Konzepte der 'negativen Integration' (Zusammenhalt durch Feindbilder: Sozialdemokraten, Katholiken, Juden) und des 'Sozialimperialismus' (imperialistische Außenpolitik zur Ablenkung von inneren sozialen Konflikten). Diese Mechanismen erklärten, wie das Kaiserreich seine inneren Widersprüche trotz fehlender demokratischer Legitimation überspielen konnte.",
        difficulty = 5,
        funFact = "Das Konzept des Sozialimperialismus übernahm Wehler von Hans Rosenberg und wandte es auf Bismarcks Innenpolitik an. Kritiker warfen ihm vor, damit ein zu mechanistisches Modell zu konstruieren, das politischen Akteuren zu wenig Handlungsfreiheit lässt und alles aus Strukturzwängen erklärt."
    ),

    // --- Historiography: Historikerstreit 1986 ---

    Question(
        categoryId = 3,
        questionText = "Welcher Artikel von Ernst Nolte löste den Historikerstreit 1986 aus, und welches war sein provokativstes These?",
        answerA = "'Vergangenheit, die nicht vergehen will' (FAZ, Juni 1986); der Gulag war das historische Vorbild für Auschwitz — der Nationalsozialismus war eine 'asiatische Tat' auf europäischem Boden als Antwort auf den Bolschewismus",
        answerB = "'Die Last unserer Geschichte' (Die Zeit, Mai 1986); der Holocaust sei historisch einmalig und dürfe nicht verglichen werden",
        answerC = "'Über die Normalität des Nationalsozialismus' (Spiegel, Juli 1986); Hitler war ein rationaler Akteur",
        answerD = "'Auschwitz im Kontext' (Historische Zeitschrift, 1986); der Holocaust habe polnische Wurzeln",
        correctAnswer = 0,
        explanation = "Ernst Noltes Artikel 'Vergangenheit, die nicht vergehen will' in der FAZ vom 6. Juni 1986 provozierte den Historikerstreit. Noltes Kernthese: Der Gulag war das kausal-logische Vorbild für Auschwitz — Hitler handelte in 'begreiflicher Reaktion' auf die bolschewistische Bedrohung. Dies stellte den Holocaust als (wenn auch verzerrte) Antwort auf den Kommunismus dar und relativierte ihn.",
        difficulty = 5,
        funFact = "Bereits vor dem FAZ-Artikel hatte Nolte einen noch provokativeren Text für die renommierte Historiker-Versammlung Römerberg-Gespräche verfasst, der aber kurzfristig vom Programm genommen wurde. Der FAZ-Artikel war eine modifizierte Version — was zeigt, dass der Streit nicht aus dem Nichts entstand."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Philosoph antwortete Nolte in der Zeit mit dem entscheidenden Gegenartikel, der den Historikerstreit zu einer öffentlichen Debatte machte?",
        answerA = "Jürgen Habermas, 'Eine Art Schadensabwicklung' (Die Zeit, Juli 1986)",
        answerB = "Hans-Georg Gadamer, 'Geschichte und Erinnerung' (Die Zeit, August 1986)",
        answerC = "Karl-Otto Apel, 'Zur Normalisierung der Vergangenheit' (Die Zeit, September 1986)",
        answerD = "Hannah Arendt (posthum), über den Banalität-des-Bösen-Begriff",
        correctAnswer = 0,
        explanation = "Jürgen Habermas antwortete mit dem Artikel 'Eine Art Schadensabwicklung' in der Zeit vom 11. Juli 1986. Er warf Nolte, Hillgruber und anderen vor, apologetische Geschichtsrevision zu betreiben und das Einmalige des Holocaust zu relativieren. Habermas verknüpfte die Frage nach historischer Darstellung mit der politischen Identität der Bundesrepublik.",
        difficulty = 5,
        funFact = "Habermas' Begriff 'postnationaler Verfassungspatriotismus' — die Idee, dass die Bindung an die BRD auf universellen Verfassungsprinzipien beruhen sollte, nicht auf Nationalkultur — war der positive Gegenentwurf zu dem, was er als Tendenz zur nationalen Renormalisierung bei Nolte und Stürmer kritisierte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche These vertrat Andreas Hillgruber im Historikerstreit, und in welchem Doppelband erschien sie 1986?",
        answerA = "'Zweierlei Untergang' (1986); er verlangte Empathie mit den deutschen Soldaten an der Ostfront als Verteidiger der Zivilbevölkerung — was Habermas als Relativierung des Holocaust angriff",
        answerB = "'Der Zusammenbruch des Ostens' (1986); der Rückzug der Wehrmacht war ein strategisches Versagen",
        answerC = "'Deutschland in der Weltpolitik' (1986); die Kriegsziele Hitlers waren keine Sondererscheinung",
        answerD = "'Hitlers Strategie' (1986); die Ostfront-Entscheidungen waren militärisch rational",
        correctAnswer = 0,
        explanation = "Andreas Hillgruber veröffentlichte 1986 den Doppelband 'Zweierlei Untergang: Die Zerschlagung des Deutschen Reiches und das Ende des europäischen Judentums'. Sein Essay über den 'Zusammenbruch im Osten' verlangte, dass Historiker sich 'mit dem Schicksal der deutschen Bevölkerung im Osten und der Truppe, die sie verteidigte' identifizieren sollten. Habermas sah darin eine Gleichsetzung und Relativierung des Holocaust.",
        difficulty = 5,
        funFact = "Der Historikerstreit hatte eine unerwartete institutionelle Wirkung: Er trug zum Entstehen einer neuen Gedenkkultur bei und war mittelbar am Ringen um das Konzept des Berliner Holocaust-Mahnmals beteiligt, das schließlich 2005 eingeweiht wurde — 19 Jahre nach dem Streit."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher konservative Historiker und Politikberater im Historikerstreit hatte bereits vor Noltes Artikel argumentiert, Deutschland brauche eine 'identitätsstiftende Geschichte' statt negativer Erinnerungskultur?",
        answerA = "Michael Stürmer",
        answerB = "Klaus Hildebrand",
        answerC = "Hagen Schulze",
        answerD = "Thomas Nipperdey",
        correctAnswer = 0,
        explanation = "Michael Stürmer, Historiker und Berater von Bundeskanzler Kohl, hatte in mehreren Artikeln argumentiert, dass Deutschland eine positive nationale Identität brauche. Sein Satz 'In einem geschichtslosen Land gewinnt die Zukunft, wer die Erinnerung füllt, die Begriffe prägt und die Vergangenheit deutet' wurde von Habermas als Beweis für den politisch-instrumentellen Charakter der neuen Geschichtsrevision zitiert.",
        difficulty = 5,
        funFact = "Stürmer war am Konzept des Deutschen Historischen Museums beteiligt, das Kohl 1987 in Berlin einweihte. Das Museum wurde selbst zum Politikum: Kritiker sahen es als Versuch, eine affirmative Nationalgeschichte zu institutionalisieren — ein Echo des Historikerstreits in der Museumspolitik."
    ),

    // --- Additional Master-level questions ---

    Question(
        categoryId = 3,
        questionText = "Welches konkrete Ereignis im Jahr 1985 brachte die CIA schließlich dazu, ernsthaft nach einem Maulwurf in den eigenen Reihen zu suchen, nachdem in diesem Jahr zahlreiche sowjetische Quellen aufgeflogen waren?",
        answerA = "Das gleichzeitige Versiegen von neun aktiven sowjetischen CIA-Quellen innerhalb weniger Monate — das sogenannte 'Jahr des Spions'",
        answerB = "Die Verhaftung von Aldrich Ames in Wien durch den österreichischen Geheimdienst",
        answerC = "Ein anonymer Hinweis aus Moskau durch einen unbekannten KGB-Insider",
        answerD = "Die Enttarnung von Robert Hanssen beim FBI, die auf CIA-Parallelstrukturen hindeutete",
        correctAnswer = 0,
        explanation = "1985 wurde im Nachhinein als 'Jahr des Spions' bekannt: Innerhalb weniger Monate wurden neun hochrangige CIA-Quellen in der Sowjetunion verhaftet und viele hingerichtet. Die simultane Häufung legte einen Maulwurf nahe — doch die interne Suche verlief jahrelang ergebnislos, da Ames als unauffälliger CIA-Insider nicht im Fokus stand.",
        difficulty = 5,
        funFact = "Die CIA-interne Untersuchung geriet in eine bizarre Situation: Aldrich Ames, der Maulwurf selbst, war zeitweise Mitglied des Teams, das nach dem Maulwurf suchte. Er wusste also genau, in welche Richtung die Ermittlungen zeigten — und konnte sie entsprechend lenken."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische Vereinbarung über die Wirtschafts-, Währungs- und Sozialunion zwischen BRD und DDR trat am 1. Juli 1990 in Kraft, und zu welchem Wechselkurs wurden DDR-Mark in D-Mark umgetauscht?",
        answerA = "Staatsvertrag über die Wirtschafts-, Währungs- und Sozialunion; DDR-Mark wurden im Verhältnis 1:1 (Löhne, Renten, Spareinlagen bis 6.000 Mark) bzw. 2:1 (darüber hinaus) umgetauscht",
        answerB = "Grundlagenvertrag zur Währungsunion; DDR-Mark wurden einheitlich 1:2 in D-Mark umgetauscht",
        answerC = "Währungsunionsvertrag; alle DDR-Mark wurden 1:1 in D-Mark umgetauscht",
        answerD = "Wirtschaftsvertrag der Treuhandanstalt; DDR-Mark wurden zu 3:1 abgewertet",
        correctAnswer = 0,
        explanation = "Der Staatsvertrag über die Wirtschafts-, Währungs- und Sozialunion trat am 1. Juli 1990 in Kraft. Löhne, Gehälter, Renten und Mieten wurden 1:1 umgestellt. Spareinlagen wurden je nach Alter unterschiedlich behandelt: Bis 2.000 DDR-Mark für Kinder, bis 4.000 Mark für Personen unter 60 und bis 6.000 Mark für Ältere zum Kurs 1:1; darüber hinaus galt 2:1.",
        difficulty = 5,
        funFact = "Die Bundesbank und ihr Präsident Karl Otto Pöhl waren strikt gegen den 1:1-Kurs, den sie als wirtschaftlich nicht vertretbar hielten. Pöhl sprach von einem 'Desaster'. Politisch war der 1:1-Kurs jedoch kaum vermeidbar — er war die psychologische Voraussetzung für die Akzeptanz der Vereinigung durch die DDR-Bevölkerung."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher sowjetische Außenminister verhandelte den Zwei-plus-Vier-Vertrag auf sowjetischer Seite, und welches Schlüsselzugeständnis erhielt er in Bezug auf die NATO-Osterweiterung?",
        answerA = "Eduard Schewardnadse; mündliche Zusagen westlicher Politiker, die NATO nicht nach Osten zu erweitern — die jedoch nicht vertraglich fixiert wurden",
        answerB = "Andrei Gromyko; ein formelles Protokoll zum Ausschluss der NATO-Erweiterung",
        answerC = "Boris Pankin; eine Garantie für die militärische Neutralität Polens",
        answerD = "Alexander Bessmertnykh; das Versprechen, die NATO aufzulösen",
        correctAnswer = 0,
        explanation = "Eduard Schewardnadse verhandelte auf sowjetischer Seite. Er und Gorbatschow erhielten von westlichen Politikern (Baker, Genscher, Kohl) mündliche Zusagen, die NATO nicht nach Osten zu erweitern. Diese Zusagen wurden jedoch nie in den Zwei-plus-Vier-Vertrag aufgenommen und sind seither Gegenstand erbitterter historischer und diplomatischer Debatten.",
        difficulty = 5,
        funFact = "Die Frage, ob es tatsächlich eine Zusage zur Nicht-Erweiterung der NATO gab, ist bis heute diplomatisch explosiv. Declassifizierte US-Dokumente aus den Archiven zeigen, dass Außenminister Baker im Februar 1990 tatsächlich die Formulierung verwendete, die NATO werde 'keinen Inch nach Osten' erweitern — aber eben nur mündlich."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Rolle spielte die Gruppe der 20 im Herbst 1989 in Leipzig, und wer gehörte ihr an?",
        answerA = "Eine Verhandlungsgruppe aus 20 Bürgerrechtlern und Kirchenvertretern, die nach dem 9. Oktober 1989 direkte Gespräche mit der SED-Stadtführung führte",
        answerB = "Ein geheimes Reformkomitee innerhalb der SED, das Egon Krenz beriet",
        answerC = "Die zwanzig führenden Köpfe der Montags-Demonstrationen, die von der Stasi überwacht wurden",
        answerD = "Ein interfraktioneller Ausschuss im DDR-Volksparlament für Verfassungsreform",
        correctAnswer = 0,
        explanation = "Die 'Gruppe der 20' entstand nach der Demonstration vom 9. Oktober 1989 in Leipzig spontan als Verhandlungsdelegation aus Demonstranten und Kirchenvertretern. Sie führte direkte Gespräche mit der Stadtführung und wurde vom SED-Oberbürgermeister empfangen. Sie war ein erstes Zeichen für den Runden-Tisch-Prozess, der sich wenig später in der gesamten DDR entwickelte.",
        difficulty = 5,
        funFact = "Die Bereitschaft der Leipziger SED-Führung, überhaupt mit der Gruppe der 20 zu sprechen, war ein Novum in der DDR-Geschichte. Möglicherweise spielte dabei eine Rolle, dass Kurt Masur, der Dirigent des Gewandhauses, zu den Vermittlern gehörte — sein künstlerisches Ansehen bot der SED einen gesichtwahrenden Gesprächspartner."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand der Historiker Heinrich August Winkler unter dem 'langen Weg nach Westen' der deutschen Geschichte, und welche Epochenzäsur setzt er als Endpunkt?",
        answerA = "Den Weg zur westlichen parlamentarischen Demokratie, der sich von 1789 bis 1990 erstreckte; Endpunkt: die deutsche Einheit als endgültige Westverankerung",
        answerB = "Den wirtschaftlichen Aufstieg Deutschlands zur westlichen Industrienation 1871–1990",
        answerC = "Die territoriale Westverschiebung Deutschlands durch Kriegsverluste im 20. Jahrhundert",
        answerD = "Die kulturelle Annäherung an Frankreich von 1918 bis zur EU-Gründung 1957",
        correctAnswer = 0,
        explanation = "In seinem monumentalen Werk 'Der lange Weg nach Westen' (2000) beschrieb Winkler Deutschlands Geschichte als einen verzögerten, mit Rückfällen behafteten Weg zur westlichen liberalen Demokratie. Den Endpunkt setzt er bei 1990: Erst mit der Vereinigung in den Grenzen des vereinten Deutschland und vollständiger NATO/EU-Integration sei Deutschland dauerhaft im Westen angekommen.",
        difficulty = 5,
        funFact = "Winkler grenzte sich bewusst von der Sonderweg-These ab: Er sah den deutschen Weg nicht als zwangsläufig zum Nationalsozialismus führend, sondern als eine Variante unter mehreren möglichen — mit dem Nationalsozialismus als historischer Katastrophe, nicht als struktureller Notwendigkeit."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche genaue Formulierung benutzte Fritz Fischer in 'Griff nach der Weltmacht' (1961), die die deutsche Historikerzunft 1961 schockierte, und was war das spezifische historische Argument?",
        answerA = "Deutschland habe den Ersten Weltkrieg bewusst angestrebt; Beleg: das 'Septemberprogramm' 1914 mit konkreten Annexionszielen, das Bethmann Hollweg unmittelbar nach Kriegsbeginn formulierte",
        answerB = "Hitler habe die Außenpolitik Wilhelms II. direkt fortgesetzt; Deutschland trage Alleinschuld an beiden Weltkriegen",
        answerC = "Das Kaiserreich sei eine bonapartistische Diktatur gewesen; Bismarck habe den Krieg als innenpolitisches Ablenkungsmittel geplant",
        answerD = "Die Alldeutschen hätten den Kriegsbeginn 1914 gesteuert; der Kaiser war nur eine Marionette",
        correctAnswer = 0,
        explanation = "Fischer argumentierte, dass Deutschland nicht in den Krieg 'hineingeschlittert' sei, sondern ihn aktiv angestrebt habe, um hegemoniale Ziele zu erreichen. Als zentralen Beleg nannte er das 'Septemberprogramm' vom September 1914, in dem Reichskanzler Bethmann Hollweg konkrete Annexionsziele (Belgien, Nordfrankreich, Teile Russlands) formulierte — wenige Wochen nach Kriegsbeginn.",
        difficulty = 5,
        funFact = "Fischers Buch löste einen echten Historikerkrieg aus: Kollegen versuchten, seine Reisevisum-Einladungen in die USA zu blockieren, und der Deutsche Historikertag 1964 wurde zum öffentlichen Showdown. Der Streit war nicht nur akademisch — er berührte die Frage, ob Westdeutschland eine 'neue' Nation oder ein Kontinuum des alten Deutschlands war."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche institutionelle Neuerung schuf der Einigungsvertrag vom 31. August 1990 für das Beitrittsverfahren der DDR, und auf welchen Artikel des Grundgesetzes stützte er sich?",
        answerA = "Die DDR trat gemäß Artikel 23 GG (Geltungsbereich des Grundgesetzes) der BRD bei — nicht nach Artikel 146 GG (neue Verfassung durch das Volk)",
        answerB = "Die DDR fusionierte mit der BRD nach Artikel 146 GG durch einen Volksentscheid in beiden Staaten",
        answerC = "Ein neues Verfassungsorgan, der 'Gesamtdeutsche Rat', trat an die Stelle des Bundestages",
        answerD = "Die DDR gliederte sich nach Artikel 118 GG als Sonderzone in die BRD ein",
        correctAnswer = 0,
        explanation = "Die DDR trat der BRD gemäß Artikel 23 GG bei — dem 'Beitrittsartikel', der den Geltungsbereich des Grundgesetzes auf andere Teile Deutschlands ausdehnen ließ. Dies ermöglichte die schnelle Einheit ohne neue Verfassung. Der alternative Weg über Artikel 146 GG (gesamtdeutscher Verfassungsgebungsprozess) wurde bewusst nicht gewählt, obwohl er von Bürgerrechtlern und Teilen der Linken gefordert wurde.",
        difficulty = 5,
        funFact = "Nach dem Beitritt wurde Artikel 23 GG gestrichen — er hatte seinen Zweck erfüllt. In das Grundgesetz wurde stattdessen ein neuer Artikel 23 eingefügt, der die Europäische Integration regelt. Dies war ein symbolisch bedeutsamer Akt: Deutschland verzichtete damit formal auf weitere Gebietsansprüche."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand der Politologe Karl Dietrich Bracher unter dem Begriff 'Totalitarismus' in seiner Anwendung auf den Nationalsozialismus, und welche drei Herrschaftsphasen unterschied er in 'Die deutsche Diktatur' (1969)?",
        answerA = "Machtergreifung (1933), Machtkonsolidierung (1933–1934) und Machtausbau (1934–1938) als analytisches Dreierschema der totalitären Durchdringung",
        answerB = "Propaganda, Repression und Expansion als drei Säulen der NS-Herrschaft",
        answerC = "Frühnationalsozialismus, Hochphase und Kriegsregime als chronologische Periodisierung",
        answerD = "Partei, Staat und Wehrmacht als drei konkurrierende Machtzentren",
        correctAnswer = 0,
        explanation = "In 'Die Auflösung der Weimarer Republik' (1955) und 'Die deutsche Diktatur' (1969) entwickelte Bracher das analytische Schema der 'Machtergreifung' in drei Stufen: Machteroberung (Januar–März 1933), Machtkonsolidierung (bis Röhm-Putsch 1934) und Machtausbau/totaler Durchdringung (ab 1934). Dieses Schema wurde zur Standardgliederung der NS-Forschung.",
        difficulty = 5,
        funFact = "Brachers 'Auflösung der Weimarer Republik' (1955) war eine der ersten wissenschaftlich-systematischen Analysen des NS-Aufstiegs. Er schrieb sie als Habilitationsschrift — und die Gutachter lehnten sie zunächst ab, weil das Thema als zu politisch galt. Das Buch wurde dennoch zum Klassiker."
    ),

    // --- Cold War Intelligence: Additional Specifics ---

    Question(
        categoryId = 3,
        questionText = "Welchen Codenamen trug Oleg Gordievskys KGB-Akte bei der britischen Spionageabwehr MI5, und welche konkrete Warnung lieferte er 1983 über die sowjetische Fehleinschätzung von Able Archer 83?",
        answerA = "SUNBEAM; er berichtete, dass der KGB Able Archer 83 für eine echte Kriegsvorbereitung hielt und sowjetische Streitkräfte in erhöhte Alarmbereitschaft versetzt wurden",
        answerB = "PIMLICO; er informierte, dass Breschnew persönlich den Befehl zum Angriff unterzeichnet hatte",
        answerC = "NOCTON; er übermittelte, dass die Sowjets einen Erstschlag für den 15. November 1983 planten",
        answerD = "CARDINAL; er warnte vor einer KGB-Infiltration des britischen Außenministeriums",
        correctAnswer = 0,
        explanation = "Gordievskys MI6-Deckname lautete SUNBEAM. Seine Berichte über Able Archer 83 waren von außerordentlicher Bedeutung: Er schilderte, dass KGB-Residenten weltweit Anweisung erhielten, Hinweise auf bevorstehende NATO-Angriffe zu sammeln, und dass sowjetische Nuklearstreitkräfte im Zuge der Übung in höchste Alarmbereitschaft versetzt wurden. Diese Informationen änderten Reagans Haltung gegenüber der Sowjetunion.",
        difficulty = 5,
        funFact = "Gordievskys Berichte über die sowjetische Panik während Able Archer 83 gelangten über den MI6 zu Reagans Nationaler Sicherheitsberaterin. Reagan, so überliefern Zeitzeugen, war tief erschüttert, dass die Sowjets ernsthaft glaubten, er plane einen Atomschlag — was ihn zu einem vorsichtigeren, gesprächsbereiteren Kurs gegenüber Moskau bewog."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Besonderheit wies der Runde Tisch der DDR auf, der am 7. Dezember 1989 in Ost-Berlin erstmals zusammentrat, und welche institutionelle Kompetenz erhielt er im Laufe der Krise?",
        answerA = "Er war ein Parallelparlament ohne formale Rechtsgrundlage; ab Januar 1990 erhielten Vertreter des Runden Tisches Beobachterstatus in der Regierung Modrow und wirkten an der Ausarbeitung einer neuen DDR-Verfassung mit",
        answerB = "Er war ein offizielles Verfassungsorgan mit Gesetzgebungsrecht, das die Volkskammer ersetzte",
        answerC = "Er tagte nur einmal und beschloss die Abhaltung freier Wahlen am 18. März 1990",
        answerD = "Er war ein reines Beratungsgremium der SED ohne eigene politische Kompetenz",
        correctAnswer = 0,
        explanation = "Der Zentrale Runde Tisch der DDR hatte keine formale Rechtsgrundlage, entwickelte sich aber zu einem faktischen Parallelparlament. Ab Februar 1990 nahmen Vertreter des Runden Tisches als Minister ohne Geschäftsbereich an der Regierung Modrow teil. Er arbeitete an einem eigenen DDR-Verfassungsentwurf, der jedoch durch den schnellen Einheitsprozess obsolet wurde.",
        difficulty = 5,
        funFact = "Der Runde Tisch der DDR tagte insgesamt 16 Mal — von Dezember 1989 bis März 1990. Er beschloss die Abhaltung freier Volkskammerwahlen am 18. März 1990. Diese Wahlen brachten überraschenderweise einen klaren Sieg der CDU-geführten 'Allianz für Deutschland', was als Votum für eine schnelle Wiedervereinigung interpretiert wurde."
    ),

)
