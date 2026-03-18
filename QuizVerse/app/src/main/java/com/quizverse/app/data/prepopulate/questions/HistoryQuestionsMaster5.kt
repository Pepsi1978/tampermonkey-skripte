package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsMaster5(): List<Question> = listOf(

    // --- Bauhaus ---

    Question(
        categoryId = 3,
        questionText = "Walter Gropius gründete das Bauhaus 1919 in Weimar. Welches pädagogische Doppelprinzip lag dem Unterrichtskonzept zugrunde, das jeden Studenten zwei gleichberechtigte Meister zuwies?",
        answerA = "Formmeister und Werkmeister (Kunst und Handwerk parallel)",
        answerB = "Theoriemeister und Praxismeister",
        answerC = "Gestaltungsmeister und Konstruktionsmeister",
        answerD = "Entwurfsmeister und Ausführungsmeister",
        correctAnswer = 0,
        explanation = "Das Bauhaus trennte Kunst und Handwerk institutionell: Jede Werkstatt hatte einen 'Formmeister' (Künstler, z.B. Paul Klee oder Wassily Kandinsky) und einen 'Werkmeister' (Handwerker). Erst mit dem Umzug nach Dessau 1925 verschmolzen diese Rollen, als ausgebildete Bauhäusler selbst lehrten.",
        difficulty = 5,
        funFact = "Paul Klee und Wassily Kandinsky lehrten gleichzeitig am Bauhaus — zwei der bedeutendsten abstrakten Maler des 20. Jahrhunderts teilten sich buchstäblich denselben Flur in Dessau."
    ),

    Question(
        categoryId = 3,
        questionText = "László Moholy-Nagy übernahm 1923 am Bauhaus Dessau die Leitung des Vorkurses von Johannes Itten. Was war der entscheidende programmatische Unterschied zwischen den Ansätzen beider Meister?",
        answerA = "Itten betonte mystisch-spirituelle Selbsterfahrung (Mazdaznan-Lehre), Moholy-Nagy industrielle Materialerforschung und Massenproduktion",
        answerB = "Itten lehrte Farbtheorie, Moholy-Nagy ausschließlich Fotografie",
        answerC = "Itten war für Architektur zuständig, Moholy-Nagy für Textildesign",
        answerD = "Itten forderte abstrakte Kunst, Moholy-Nagy figurative Darstellung",
        correctAnswer = 0,
        explanation = "Johannes Itten war Anhänger des Mazdaznan, einer zoroastrisch inspirierten Lebensphilosophie, und unterrichtete Meditation und Atemlehre. Gropius drängte ihn 1923 hinaus, weil die Bauhaus-Ausstellung 'Kunst und Technik — eine neue Einheit' einen Richtungswechsel zur industriellen Fertigung einleitete. Moholy-Nagy verkörperte diesen Wandel.",
        difficulty = 5,
        funFact = "Ittens Schüler mussten spezielle Mazdaznan-Diät einhalten — Knoblauch, Gemüse, wenig Fleisch — was im Bauhaus-Alltag zu erheblichen sozialen Reibungen führte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Bauhaus-Meister entwarf 1925/26 die ikonischen Stahlrohrmöbel, darunter den Freischwinger, und ließ sich dabei laut eigener Aussage vom Lenker eines Adler-Fahrrads inspirieren?",
        answerA = "Marcel Breuer",
        answerB = "Ludwig Mies van der Rohe",
        answerC = "Herbert Bayer",
        answerD = "Oskar Schlemmer",
        correctAnswer = 0,
        explanation = "Marcel Breuer entwickelte 1925 den Wassily-Stuhl (B3) und 1927/28 den Freischwinger (B32). Er berichtete, der gebogene Stahlrohrlenker eines Adler-Fahrrads habe ihn auf die Idee gebracht, Möbel aus einem einzigen gebogenen Stahlrohr zu fertigen. Mies van der Rohe entwickelte seinen eigenen Freischwinger (MR10) unabhängig davon ab 1927.",
        difficulty = 5,
        funFact = "Der 'Wassily-Stuhl' bekam seinen heutigen Namen erst in den 1960er Jahren, weil Bauhaus-Freund Wassily Kandinsky das Möbelstück so sehr bewunderte — Breuer selbst nannte ihn schlicht 'B3'."
    ),

    // --- Frankfurter Schule ---

    Question(
        categoryId = 3,
        questionText = "Max Horkheimer übernahm 1931 die Leitung des Instituts für Sozialforschung in Frankfurt. Welchen Begriff prägte er 1937 in seinem Aufsatz 'Traditionelle und kritische Theorie' als Selbstbezeichnung des Forschungsprogramms?",
        answerA = "Kritische Theorie",
        answerB = "Dialektischer Materialismus",
        answerC = "Negative Dialektik",
        answerD = "Instrumentelle Vernunft",
        correctAnswer = 0,
        explanation = "Horkheimer formulierte 1937 den Begriff 'Kritische Theorie' als Gegenbegriff zur 'traditionellen Theorie' (positivistischer Wissenschaft). Kritische Theorie sollte Gesellschaft nicht nur beschreiben, sondern auf ihre Emanzipation hin befragen. 'Instrumentelle Vernunft' und 'Dialektik der Aufklärung' sind spätere Konzepte (1944 im Exil mit Adorno).",
        difficulty = 5,
        funFact = "Das Institut für Sozialforschung wurde von Felix Weil finanziert, dem Sohn eines argentinischen Getreidehändlers — der Marxismus der Frankfurter Schule wurde buchstäblich durch Agrarrenten ermöglicht."
    ),

    Question(
        categoryId = 3,
        questionText = "Walter Benjamin schrieb sein Passagenwerk nie ab. In welchem Archiv lagern die erhaltenen Materialien heute, und wer rettete die Manuskripte vor den Nazis?",
        answerA = "Bibliothèque nationale de France (Paris) — Georges Bataille versteckte sie in der Nationalbibliothek",
        answerB = "Deutsches Literaturarchiv Marbach — Hannah Arendt schmuggelte sie in die USA",
        answerC = "Leo Baeck Institute New York — Gershom Scholem brachte sie nach Palästina",
        answerD = "Akademie der Künste Berlin — Bertolt Brecht hinterlegte sie in Stockholm",
        correctAnswer = 0,
        explanation = "Georges Bataille, damals Bibliothekar an der Bibliothèque nationale, versteckte Benjamins Passagenwerk-Materialien nach dessen Flucht 1940 in den Archiven der Institution. Hannah Arendt brachte zwar Benjamins letztes Manuskript ('Über den Begriff der Geschichte') nach New York, aber die Passagenkonvolute blieben in Paris.",
        difficulty = 5,
        funFact = "Benjamin starb am 26. September 1940 in Portbou an der spanischen Grenze — möglicherweise durch Suizid, nachdem ihm die Weiterreise nach Spanien verweigert worden war. Einen Tag später wurden seine Begleiter durchgelassen."
    ),

    Question(
        categoryId = 3,
        questionText = "Theodor W. Adornos und Max Horkheimers 'Dialektik der Aufklärung' (1944/1947) enthält den Essay 'Kulturindustrie: Aufklärung als Massenbetrug'. Welches Argument unterscheidet diesen Begriff von bloßer 'Massenkultur'?",
        answerA = "Kulturindustrie impliziert zentral gesteuerte, standardisierte Produktion, die falsche Individualisierung simuliert und den Konsumenten passiviert",
        answerB = "Massenkultur ist spontan entstanden, Kulturindustrie ist staatlich zensiert",
        answerC = "Kulturindustrie bezeichnet ausschließlich nationalsozialistische Propaganda",
        answerD = "Der Begriff kritisiert nur amerikanische Unterhaltungsindustrie, nicht europäische Hochkultur",
        correctAnswer = 0,
        explanation = "Adorno und Horkheimer wandten sich explizit gegen den Begriff 'Massenkultur', weil er suggeriert, die Kultur entstehe spontan aus den Massen. 'Kulturindustrie' betont die von oben organisierte, industrielle Herstellung scheinbar individueller Produkte, die in Wahrheit nach Schema F gefertigt sind und kritisches Denken verhindern.",
        difficulty = 5,
        funFact = "Adorno hasste Jazz — er bezeichnete ihn als Ausdruck der Kulturindustrie, die Synkopen als 'falsche Befreiung' vermarktet. Miles Davis und Charlie Parker ignorierten das vollständig."
    ),

    // --- Thomas Mann ---

    Question(
        categoryId = 3,
        questionText = "Thomas Manns Roman 'Doktor Faustus' (1947) enthält eine detaillierte Beschreibung der Zwölftontechnik, für die der Autor Anleihen bei einem lebenden Komponisten machte, der dies zunächst akzeptierte, dann aber im Streit verlangte, namentlich erwähnt zu werden. Wer war dieser Komponist?",
        answerA = "Arnold Schönberg",
        answerB = "Alban Berg",
        answerC = "Anton Webern",
        answerD = "Igor Strawinsky",
        correctAnswer = 0,
        explanation = "Thomas Mann nutzte ausführlich Adornos musiktheoretische Erläuterungen zur Dodekaphonie und Schönbergs Kompositionstechnik, ohne Schönberg zu nennen. Schönberg protestierte und verlangte einen Hinweis. Mann fügte in späteren Ausgaben eine Anmerkung ein: 'Die Zwölftontechnik ist geistiges Eigentum von Arnold Schönberg.' Die Beziehung der beiden blieb zerrüttet.",
        difficulty = 5,
        funFact = "Adorno war für Mann so wichtig für den 'Doktor Faustus', dass Mann ihn im Nachwort als 'Geheimen Mitautor' bezeichnete — Adorno soll das mit gemischten Gefühlen aufgenommen haben."
    ),

    Question(
        categoryId = 3,
        questionText = "In Thomas Manns 'Betrachtungen eines Unpolitischen' (1918) vertrat er eine Position, die er später als Irrtum widerrief. Welche politische Haltung verteidigte Mann in diesem Werk?",
        answerA = "Den deutschen Sonderweg: autoritäre Kultur contra westliche Zivilisation und Demokratie",
        answerB = "Den Anschluss Österreichs an Deutschland",
        answerC = "Eine pazifistische Haltung gegen den Ersten Weltkrieg",
        answerD = "Den revolutionären Sozialismus nach russischem Vorbild",
        correctAnswer = 0,
        explanation = "In den 'Betrachtungen' verteidigte Mann die deutsche Kultur ('Geist', Tiefe, Musik) gegen die westliche Zivilisation (Demokratie, Rationalismus, Politik) und polemisierte gegen seinen Bruder Heinrich Mann. 1922 vollzog er mit der Rede 'Von deutscher Republik' einen öffentlichen Schwenk zur Weimarer Demokratie — eines der dramatischsten intellektuellen Bekenntnisses der Weimarer Republik.",
        difficulty = 5,
        funFact = "Der Bruch mit seinem Bruder Heinrich dauerte fast ein Jahrzehnt. Als beide im amerikanischen Exil lebten, war das Verhältnis zwar versöhnt, aber nie wieder wirklich warm."
    ),

    // --- Gleichschaltung ---

    Question(
        categoryId = 3,
        questionText = "Das 'Gesetz zur Behebung der Not von Volk und Reich' vom 23. März 1933 (Ermächtigungsgesetz) erforderte eine Zweidrittelmehrheit im Reichstag. Welche Partei stimmte als einzige geschlossen dagegen?",
        answerA = "SPD (Sozialdemokratische Partei Deutschlands)",
        answerB = "KPD (Kommunistische Partei Deutschlands)",
        answerC = "Zentrum (Katholische Zentrumspartei)",
        answerD = "DNVP (Deutschnationale Volkspartei)",
        correctAnswer = 0,
        explanation = "Die KPD war bereits verboten und ihre Abgeordneten verhaftet. Das Zentrum unter Prälat Kaas stimmte mehrheitlich zu (nach Verhandlungen mit Hitler über angebliche Zusicherungen). Nur die 94 anwesenden SPD-Abgeordneten stimmten dagegen — Otto Wels hielt eine historische Ablehnungsrede. Die DNVP stimmte als Regierungspartner dafür.",
        difficulty = 5,
        funFact = "Otto Wels riskierte mit seiner Rede buchstäblich sein Leben. Er sagte: 'Freiheit und Leben kann man uns nehmen, die Ehre nicht.' Noch in derselben Nacht floh er ins Exil."
    ),

    Question(
        categoryId = 3,
        questionText = "Das 'Gesetz über den Neuaufbau des Reiches' vom 30. Januar 1934 vollzog einen zentralen Akt der Gleichschaltung. Was wurde damit abgeschafft?",
        answerA = "Die Volksvertretungen der Länder (Landtage) und die Hoheitsrechte der Länder wurden auf das Reich übertragen",
        answerB = "Die Gewerkschaften wurden aufgelöst und durch die DAF ersetzt",
        answerC = "Das Berufsbeamtentum wurde nach politischer Zuverlässigkeit gesäubert",
        answerD = "Die freie Presse wurde dem Reichsministerium für Volksaufklärung unterstellt",
        correctAnswer = 0,
        explanation = "Mit dem Neuaufbaugesetz wurden die deutschen Länder ihrer Eigenstaatlichkeit beraubt: Landtage aufgelöst, Landesregierungen dem Reichsinnenminister unterstellt. Deutschland wurde faktisch zentralistisch. Die Gewerkschaftsauflösung erfolgte bereits am 2. Mai 1933, das Berufsbeamtengesetz am 7. April 1933.",
        difficulty = 5,
        funFact = "Der bayerische Ministerpräsident Heinrich Held wurde am 9. März 1933 durch SA-Männer physisch aus seinem Büro vertrieben — bevor das Gleichschaltungsgesetz überhaupt existierte."
    ),

    // --- Lebensborn ---

    Question(
        categoryId = 3,
        questionText = "Der Lebensborn e.V. wurde 1935 von Heinrich Himmler gegründet. Was war die ursprüngliche und primäre institutionelle Funktion dieses SS-Vereins — im Gegensatz zu seiner späteren Rolle?",
        answerA = "Betrieb von Entbindungsheimen für unverheiratete 'rassisch wertvolle' Mütter zur Bekämpfung von Abtreibungen",
        answerB = "Staatlich organisiertes Zuchtprogramm, in dem SS-Männer mit ausgewählten Frauen Kinder zeugen sollten",
        answerC = "Adoptionsvermittlung germanisierter Kinder aus besetzten Ostgebieten",
        answerD = "Finanzierungsprogramm für kinderreiche SS-Familien",
        correctAnswer = 0,
        explanation = "Der populäre Mythos des 'Zuchtprogramms' ist falsch. Lebensborn betrieb primär Entbindungsheime, in denen unverheiratete Mütter diskret gebären konnten — Himmler wollte Abtreibungen verhindern, die er als 'Rassenselbstmord' ansah. Die Entführung und Germanisierung fremdländischer Kinder wurde erst ab 1942 in besetzten Gebieten praktiziert.",
        difficulty = 5,
        funFact = "Schätzungsweise 8.000 Kinder wurden in Lebensborn-Heimen in Deutschland geboren. In Norwegen waren es noch einmal etwa 12.000 — Kinder norwegischer Frauen und deutscher Besatzungssoldaten."
    ),

    // --- Ahnenerbe ---

    Question(
        categoryId = 3,
        questionText = "Das 'Ahnenerbe — Studiengesellschaft für Geistesurgeschichte, Deutsches Ahnenerbe e.V.' wurde 1935 gegründet. Welcher SS-Hauptsturmführer leitete die berüchtigte Tibet-Expedition von 1938/39, die nach arischen Überresten und kulturellen Verbindungen suchen sollte?",
        answerA = "Ernst Schäfer",
        answerB = "Otto Rahn",
        answerC = "Karl Maria Wiligut",
        answerD = "Friedrich Hielscher",
        correctAnswer = 0,
        explanation = "Ernst Schäfer, Zoologe und Himalayaforscher, leitete die Expedition nach Tibet (1938–39), die offiziell der zoologischen und botanischen Forschung diente, aber von Himmler mit der Suche nach Beweisen für eine arische Hochzivilisation aufgeladen wurde. Otto Rahn suchte nach dem Heiligen Gral, Wiligut war Himmlers 'Rasputin' für germanische Mystik.",
        difficulty = 5,
        funFact = "Die tibetischen Lamas schenkten Schäfer eine Klosterchronik als Gastgeschenk — er brachte auch lebende Tiere nach Deutschland, darunter tibetische Mastiffs, die Himmler als 'arische Urhunde' faszinierten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Ahnenerbe-Wissenschaftler führte medizinische Versuche an KZ-Häftlingen durch und wurde nach dem Krieg im Nürnberger Ärzteprozess zum Tode verurteilt und hingerichtet?",
        answerA = "Sigmund Rascher",
        answerB = "Josef Mengele",
        answerC = "Karl Brandt",
        answerD = "August Hirt",
        correctAnswer = 0,
        explanation = "Sigmund Rascher führte im Auftrag der Luftwaffe und mit Unterstützung des Ahnenerbes Unterdruckkammer- und Kälteversuche in Dachau durch, um Überlebenschancen abgestürzter Piloten zu erforschen. Rascher wurde paradoxerweise 1945 von Himmler selbst hinrichten lassen — wegen Betrugs (er hatte Kinder als 'eigene' ausgegeben). Karl Brandt war Hitlers Leibarzt und Chef des T4-Programms.",
        difficulty = 5,
        funFact = "August Hirt vom Ahnenerbe legte eine 'jüdische Skelettsammlung' an — er ließ 86 Auschwitz-Häftlinge nach Straßburg transportieren und ermorden. Bei Kriegsende floh er und starb 1945 in den Vogesen, möglicherweise durch Suizid."
    ),

    // --- Wunderwaffen ---

    Question(
        categoryId = 3,
        questionText = "Die A4-Rakete (V-2) wurde unter Leitung von Wernher von Braun in Peenemünde entwickelt. Welche technische Eigenschaft machte sie zur ersten Waffe in der Geschichte, die den Weltraum erreichte?",
        answerA = "Sie überschritt bei ihrem Aufstieg die Kármán-Linie (100 km Höhe) und erreichte dabei Mach 5",
        answerB = "Ihr Antriebssystem nutzte erstmals flüssigen Sauerstoff als Oxidator mit Ethanol als Treibstoff kombiniert mit einem Turbopumpensystem",
        answerC = "Sie verwendete eine Trägheitsführung mit Kreiselkompass, die keine externe Steuerung benötigte",
        answerD = "Sie konnte militärisch nicht abgefangen werden, da sie mit Überschallgeschwindigkeit einschlug",
        correctAnswer = 0,
        explanation = "Die A4 überschritt im Oktober 1942 beim ersten erfolgreichen Testflug nachweislich die Kármán-Linie. Ihre Scheitelpunkthöhe betrug etwa 84 km (Testflug) bis über 100 km im operativen Betrieb. Alle anderen Antworten beschreiben zwar technisch korrekte Eigenschaften, aber die historische Einzigartigkeit liegt im Weltraumdurchbruch.",
        difficulty = 5,
        funFact = "Wernher von Braun soll nach dem ersten erfolgreichen Start gesagt haben: 'Die Rakete funktionierte perfekt — sie landete nur auf dem falschen Planeten.' Er meinte damit, dass London nicht Mars war."
    ),

    Question(
        categoryId = 3,
        questionText = "Das Heinkel He 178, der erste rein strahlangetriebene Flug der Geschichte, startete am 27. August 1939. Wessen Triebwerkskonzept war eingebaut, und warum verlor dieser Erfinder trotzdem den Rüstungswettbewerb gegen Junkers?",
        answerA = "Hans von Ohain (Zentrifugalverdichter) — Junkers Jumo 004 mit Axialverdichter war effizienter, leichter und massentauglicher",
        answerB = "Frank Whittle (Axialverdichter) — britische Patente konnten nicht genutzt werden",
        answerC = "Ernst Heinkel selbst — RLM förderte Messerschmitt bevorzugt",
        answerD = "BMW — deren Triebwerk hatte höhere Schubkraft trotz Nachbrenner-Problemen",
        correctAnswer = 0,
        explanation = "Hans von Ohainsches HeS 3-Triebwerk war ein Zentrifugalverdichter. Das Junkers Jumo 004 (Axialverdichter, eingebaut in Me 262) war technisch überlegen: kompakter Querschnitt, geringerer Luftwiderstand, höherer Wirkungsgrad. Die Me 262 mit Jumo-Triebwerken wurde das einzige Düsenjäger-Muster mit operativem Einsatz im WWII.",
        difficulty = 5,
        funFact = "Frank Whittle und Hans von Ohain entwickelten unabhängig voneinander das Strahltriebwerk. Nach dem Krieg trafen sie sich und wurden Freunde — die Geschichte des parallelen Erfindens faszinierte beide lebenslang."
    ),

    // --- Volkssturm ---

    Question(
        categoryId = 3,
        questionText = "Der Volkssturm wurde durch Führererlass vom 25. September 1944 gegründet. Welcher NSDAP-Funktionär hatte die exekutive Gesamtverantwortung für seine Organisation, und warum war dies institutionell bemerkenswert?",
        answerA = "Martin Bormann (Parteikanzlei) — Volkssturm unterstand der Partei, nicht der Wehrmacht, was zu massiven Kompetenzkonflikten führte",
        answerB = "Heinrich Himmler (SS) — er wollte eine SS-eigene Reservearmee aufbauen",
        answerC = "Joseph Goebbels (Gauleiter Berlin) — als Beauftragter für den totalen Kriegseinsatz",
        answerD = "Albert Speer (Rüstungsminister) — wegen der Ausrüstungsbeschaffung",
        correctAnswer = 0,
        explanation = "Martin Bormann als Chef der Parteikanzlei organisierte den Volkssturm als Parteiformation. Himmler war 'Befehlshaber des Ersatzheeres' und für Ausbildung zuständig, aber die politische Kontrolle lag bei der NSDAP. Wehrmacht, SS und Partei stritten permanent um Zuständigkeit, Ausrüstung und Befehlsgewalt — was die ohnehin minimale Kampfeffizienz des Volkssturms weiter untergrub.",
        difficulty = 5,
        funFact = "Volkssturm-Männer erhielten teilweise als einzige Waffe den Panzerfaust — Einführung, Abschuss, fertig. Viele hatten nicht einmal Uniformen und kämpften in Zivilkleidung, was sie nach internationalem Recht nicht als Kombattanten schützte."
    ),

    // --- Nero-Befehl ---

    Question(
        categoryId = 3,
        questionText = "Hitlers 'Nero-Befehl' vom 19. März 1945 ordnete die Zerstörung aller Infrastruktur in Deutschland an. Wer sabotierte seine Umsetzung systematisch und mit welchem Argument gegenüber Hitler?",
        answerA = "Albert Speer — mit dem Argument, das Volk brauche die Infrastruktur für einen Neuaufbau nach dem Krieg",
        answerB = "Wilhelm Keitel — wegen militärischer Nutzlosigkeit der Zerstörungen",
        answerC = "Heinrich Himmler — er verhandelte insgeheim bereits mit den Westalliierten",
        answerD = "Erwin Rommel — aus moralischen Bedenken gegenüber der Zivilbevölkerung",
        correctAnswer = 0,
        explanation = "Albert Speer fuhr unmittelbar nach dem Befehl zu mehreren Gauleitern und bat sie inoffiziell, den Befehl nicht umzusetzen. Er konfrontierte Hitler auch persönlich mit der Argumentation, das Volk dürfe nicht für Hitlers politisches Scheitern bestraft werden. Hitler antwortete mit seiner 'Das Volk hat versagt'-Theorie. Speers Selbstdarstellung als Widerstandskämpfer ist historiographisch umstritten.",
        difficulty = 5,
        funFact = "Speer behauptete nach dem Krieg, er habe einen Plan gehabt, Hitler mit Kampfgas durch das Lüftungssystem des Führerbunkers zu töten. Historiker zweifeln stark daran — die Lüftungsanlage war zu gut geschützt und der Plan nie konkretisiert."
    ),

    // --- Operation Mincemeat ---

    Question(
        categoryId = 3,
        questionText = "Operation Mincemeat (1943) täuschte die Wehrmacht über den geplanten Angriff auf Sizilien. Wessen Leichnam wurde verwendet, welche falsche Identität erhielt er, und wer war der leitende britische Geheimdienstoffizier?",
        answerA = "Leichnam von Glyndwr Michael (obdachloser Waliser), Identität: Major William Martin RM, geleitet von Ewen Montagu (NID) und Charles Cholmondeley (MI5)",
        answerB = "Leichnam eines unbekannten RAF-Piloten, Identität: Colonel James Fraser, geleitet von Ian Fleming (NID)",
        answerC = "Leichnam eines deutschen Kriegsgefangenen, Identität: Hauptmann Heinrich Werner, geleitet von Hugh Trevor-Roper",
        answerD = "Leichnam von Major Martin selbst, einem echten britischen Offizier, geleitet von Stewart Menzies (MI6-Chef)",
        correctAnswer = 0,
        explanation = "Glyndwr Michael starb an Rattengift (Phosphorpaste) und wurde als 'Major William Martin, Royal Marines' aufgebrauscht. Ewen Montagu (Naval Intelligence Division) und Charles Cholmondeley (MI5) planten die Operation. Die gefälschten Dokumente überzeugten Hitler davon, dass die Alliierten Griechenland und Sardinien angreifen wollten, nicht Sizilien.",
        difficulty = 5,
        funFact = "Ian Fleming arbeitete in der NID und hatte möglicherweise die ursprüngliche Idee zu Mincemeat — er erwähnte später eine ähnliche Täuschungsoperation in einem Memo. James Bond war also nicht seine erste Täuschungsidee."
    ),

    // --- Operation Cicero ---

    Question(
        categoryId = 3,
        questionText = "Der Spion 'Cicero' (Elyesa Bazna), albanischstämmiger Kammerdiener des britischen Botschafters in Ankara, lieferte der Abwehr ab 1943 hochgeheime Dokumente. Welcher verhängnisvolle Fehler der deutschen Seite machte seine Arbeit letztlich nutzlos?",
        answerA = "Der SD (Schellenberg) zweifelte an der Echtheit und warnte Hitler nicht rechtzeitig, zudem wurden Ciceros Informationen zu den D-Day-Plänen ignoriert",
        answerB = "Cicero fotografierte die Dokumente mit einer defekten Kamera, sodass sie unlesbar waren",
        answerC = "Die Bezahlung in gefälschten britischen Pfund machte Cicero misstrauisch und er hörte auf zu spionieren",
        answerD = "Ein britischer Doppelagent enttarnte Cicero bereits nach drei Wochen",
        correctAnswer = 0,
        explanation = "Cicero lieferte echte und wertvolle Dokumente — darunter Hinweise auf die Teheraner Konferenz und Informationen über Operationspläne. Ribbentrop und das AA ignorierten oder bezweifelten die Informationen. Zudem zahlten die Deutschen Cicero mit gefälschten britischen Pfund (Operation Bernhard), was nach dem Krieg auffiel — Cicero merkte es erst dann.",
        difficulty = 5,
        funFact = "Elyesa Bazna schrieb nach dem Krieg seine Memoiren und verklagte die Bundesrepublik Deutschland auf Entschädigung für die gefälschten Pfund — ohne Erfolg. Er starb 1970 in relativ ärmlichen Verhältnissen in München."
    ),

    // --- XX Committee / Double Cross ---

    Question(
        categoryId = 3,
        questionText = "Das britische XX Committee ('Double Cross') kontrollierte ab 1941 nahezu alle deutschen Agenten in Großbritannien. Welcher Doppelspion war für die Täuschung über D-Day (Operation Fortitude) besonders wichtig, und wie hieß sein Decknamen-System?",
        answerA = "Juan Pujol García alias 'GARBO' — er betrieb ein fiktives Agentennetzwerk von mindestens 27 erfundenen Unteragenten",
        answerB = "Eddie Chapman alias 'ZIGZAG' — als einziger Brite, der freiwillig für Deutschland spionierte",
        answerC = "Duško Popov alias 'TRICYCLE' — er warnte auch vor Pearl Harbor",
        answerD = "Roman Czerniawski alias 'BRUTUS' — polnischer Offizier mit Zugang zu SHAEF",
        correctAnswer = 0,
        explanation = "Juan Pujol García war der wichtigste Fortitude-Agent. Als Spanier ohne jegliche Geheimdienstausbildung hatte er sich bei den Deutschen angeboten und ein fiktives Netzwerk britischer Agenten erfunden. Die Deutschen zahlten ihm für Informationen, die er aus Bibliotheken und Reiseführern zusammenstellte. Nach D-Day überzeugte seine Falschmeldung Hitler davon, der Hauptangriff komme noch bei Pas-de-Calais.",
        difficulty = 5,
        funFact = "GARBO ist der einzige Mensch in der Geschichte, der sowohl das Eiserne Kreuz (von Deutschland) als auch den Order of the British Empire (von Großbritannien) verliehen bekam — für dieselben Tätigkeiten während desselben Krieges."
    ),

    // --- SOE ---

    Question(
        categoryId = 3,
        questionText = "Die Special Operations Executive (SOE) führte im Mai 1942 Operation Anthropoid durch — die einzige erfolgreiche Attentatsaktion der Alliierten gegen einen hochrangigen NS-Führungsfunktionär. Auf wen zielte das Attentat, und welche Konsequenzen hatte es?",
        answerA = "Reinhard Heydrich (Reichsprotektor Böhmen und Mähren) — Vergeltungsmassaker in Lidice und Ležáky, über 1.300 Todesopfer",
        answerB = "Heinrich Himmler (Reichsführer-SS) — scheiterte, Himmler blieb unverletzt",
        answerC = "Hans Frank (Generalgouverneur Polen) — Massaker in Warschauer Vororten",
        answerD = "Artur Seyß-Inquart (Reichskommissar Niederlande) — Vergeltungshinrichtungen in Amsterdam",
        correctAnswer = 0,
        explanation = "Jozef Gabčík und Jan Kubiš, tschechoslowakische Fallschirmspringer, warfen am 27. Mai 1942 eine Bombe auf Heydrichs Dienstwagen in Prag. Heydrich starb am 4. Juni 1942 an Wundinfektionen. Als Vergeltung wurde Lidice dem Erdboden gleichgemacht (alle Männer erschossen, Frauen ins KZ), Ležáky ebenfalls zerstört, und über 1.300 weitere Personen wurden im Zuge der Suche nach den Attentätern getötet.",
        difficulty = 5,
        funFact = "Gabčík und Kubiš versteckten sich in der Krypta der Kathedrale Sankt Cyrill und Methodus in Prag. Am 18. Juni 1942 wurden sie nach einem stundenlangen Kampf gegen SS-Einheiten getötet — die Krypta ist heute Gedenkstätte."
    ),

    // --- Intentionalismus vs. Funktionalismus ---

    Question(
        categoryId = 3,
        questionText = "Die intentionalistische Schule der Holocausthistoriographie, prominent vertreten durch Lucy Dawidowicz und Andreas Hillgruber, argumentiert im Kern mit welchem historiographischen Hauptargument?",
        answerA = "Hitler hatte bereits seit den 1920er Jahren (Mein Kampf) einen konsistenten Vernichtungsplan, der schrittweise und zielgerichtet umgesetzt wurde",
        answerB = "Die Judenvernichtung entstand erst durch den chaotischen Polykratie-Wettbewerb der NS-Bürokratie ohne zentralen Plan",
        answerC = "Die Vernichtungsentscheidung fiel erst im Herbst 1941 als Reaktion auf den Kriegsverlauf",
        answerD = "Die SS war der alleinige Träger des Holocaust, ohne Kenntnis oder Beteiligung Hitlers",
        correctAnswer = 0,
        explanation = "Intentionalisten sehen Hitlers Antisemitismus als programmierte, konsistente Vernichtungsabsicht ('Programm-These'). Dawidowicz sprach von einem 'Krieg gegen die Juden' als Hitlers Hauptziel. Dem steht der Funktionalismus (Hans Mommsen, Martin Broszat) gegenüber, der die Vernichtung als kumulatives Radikalisierungsprodukt bürokratischer Konkurrenz interpretiert.",
        difficulty = 5,
        funFact = "Die Debatte kulminierte in der 'Historikerstreit'-Kontroverse 1986 — obwohl dieser primär über die Vergleichbarkeit des Holocaust mit sowjetischen Verbrechen ging, berührte er tiefgreifend die intentionalism/functionalism-Frage."
    ),

    Question(
        categoryId = 3,
        questionText = "Martin Broszat prägte den Begriff 'kumulative Radikalisierung' im Kontext der NS-Judenpolitik. Was beschreibt dieser Begriff in Abgrenzung zum Intentionalismus?",
        answerA = "Dass lokale Initiativen und bürokratischer Wettbewerb die Vernichtungspolitik eskalierten, ohne einen zentralen Führerbefehl von Anfang an",
        answerB = "Dass Hitler schrittweise seine ursprünglich gemäßigten antisemitischen Ziele radikalisierte",
        answerC = "Dass die Wehrmacht durch Kriegserfahrungen zunehmend zu Massentötern wurde",
        answerD = "Dass der Holocaust durch kumulierte Kriegsnot (Ressourcenknappheit) ausgelöst wurde",
        correctAnswer = 0,
        explanation = "Broszat argumentierte in 'Der Staat Hitlers' (1969) und im Streit mit Saul Friedländer ('Historisierung des Nationalsozialismus'), dass die Vernichtung nicht aus einem von Anfang an bestehenden Plan folgte, sondern aus dem Wettbewerb regionaler NS-Satrapen, die den 'Führerwillen' antizipierten und übertrumpften. Dieser Ansatz provozierte Friedländers berühmten Einwand der 'Distanzierung'.",
        difficulty = 5,
        funFact = "Der Briefwechsel zwischen Broszat und Friedländer (1987–1988) ist einer der bedeutendsten historiographischen Dialoge über Methodik und Moral der Zeitgeschichtsschreibung — heute Pflichtlektüre im Geschichtsstudium."
    ),

    Question(
        categoryId = 3,
        questionText = "Daniel Jonah Goldhagen löste 1996 mit 'Hitlers willige Vollstrecker' eine internationale Debatte aus. Was war seine Kernthese, und welche Hauptkritik formulierten Historiker wie Christopher Browning?",
        answerA = "These: Eliminatorischer Antisemitismus war 'normal' im deutschen Volk; Brownings Kritik: Browning zeigte anhand desselben Quellenmaterials (Reserve-Polizeibataillon 101), dass Gehorsam, Konformität und Karrieredruck — nicht ideologische Überzeugung — zentral waren",
        answerB = "These: Der Holocaust war eine Reaktion auf die sowjetische Bedrohung; Kritik: dies minimiert deutsche Eigenverantwortung",
        answerC = "These: Die NSDAP-Mitglieder wussten nichts vom Holocaust; Kritik: es existieren Zehntausende Zeitzeugenberichte",
        answerD = "These: Frauen beteiligten sich kaum am Holocaust; Kritik: neuere Forschungen zeigen weibliche Täterinnen",
        correctAnswer = 0,
        explanation = "Goldhagen analysierte dasselbe Polizeibataillon 101 wie Browning ('Ganz normale Männer', 1992) und kam zu entgegengesetzten Schlüssen. Browning betonte situativen Druck, Gehorsam und Gruppenkonformität. Goldhagen insistierte, die Täter handelten aus genuiner antisemitischer Überzeugung. Die Debatte berührte grundsätzliche Fragen über Täterpsychologie, deutsche Kollektivschuld und die Einzigartigkeit des Holocaust.",
        difficulty = 5,
        funFact = "Goldhagens Buch wurde in Deutschland ein Bestseller — was viele Historiker überraschte. Das Publikum akzeptierte offenbar eine härtere Selbstkritik als von der Fachwelt erwartet."
    ),

    // --- Wannseekonferenz ---

    Question(
        categoryId = 3,
        questionText = "Das Wannsee-Protokoll vom 20. Januar 1942 enthält eine Tabelle mit der Anzahl der 'in Betracht kommenden' Juden nach Ländern. Welche Zahl nennt das Protokoll für die gesamte europäische Judenheit, und wer führte das Protokoll?",
        answerA = "11 Millionen Juden europaweit — Protokollführer war SS-Obersturmbannführer Adolf Eichmann",
        answerB = "6 Millionen Juden — Protokollführer war Reinhard Heydrich persönlich",
        answerC = "9 Millionen Juden — Protokollführer war Heinrich Müller (Gestapo-Chef)",
        answerD = "13 Millionen Juden — Protokollführer war Otto Ohlendorf",
        correctAnswer = 0,
        explanation = "Das Wannsee-Protokoll listet 11 Millionen Juden in Europa auf — einschließlich Länder wie England (330.000) und Irland (4.000), die noch nicht unter NS-Kontrolle standen. Adolf Eichmann führte das Protokoll und redigierte es nachträglich, um die klarsten Vernichtungsformulierungen zu entschärfen — was bei seinem Prozess 1961 in Jerusalem herausgearbeitet wurde.",
        difficulty = 5,
        funFact = "Nur eine einzige Kopie des Wannsee-Protokolls überlebte den Krieg — sie wurde 1947 von Robert Kempner bei Recherchen für die Nürnberger Prozesse in einem Aktenschrank des AA gefunden."
    ),

    // --- Adenauer-Ära Spezifika ---

    Question(
        categoryId = 3,
        questionText = "Das Luxemburger Abkommen vom 10. September 1952 regelte Wiedergutmachungszahlungen der Bundesrepublik an Israel. Welche innenpolitische Oppositionsfigur führte im Bundestag die vehementeste Kampagne dagegen, und wie groß war die Mehrheit dafür?",
        answerA = "Konrad Adenauer gewann mit einer relativen Mehrheit (239:35), weil SPD, FDP und Teile der CDU/CSU dagegen stimmten — Hauptopponent war Franz Josef Strauß (CSU)",
        answerB = "Das Abkommen wurde einstimmig angenommen; einziger Gegner war KPD-Fraktionschef Max Reimann",
        answerC = "Herbert Wehner (SPD) führte die Opposition; das Abkommen scheiterte zunächst und wurde erst 1954 ratifiziert",
        answerD = "Das Abkommen wurde ohne Bundestagsabstimmung durch Kabinettsbeschluss ratifiziert",
        correctAnswer = 0,
        explanation = "Die Abstimmung am 18. März 1953 war dramatisch: 239 Ja-Stimmen standen gegen 35 Nein-Stimmen, aber mit über 100 Enthaltungen und Abwesenden. Innerparteilich war die CDU/CSU gespalten — Franz Josef Strauß gehörte zu den lautesten Kritikern. Die SPD-Fraktion enthielt sich mehrheitlich, einige stimmten dafür. Adenauer brauchte SPD-Stimmen, was eine historische temporäre Zusammenarbeit darstellte.",
        difficulty = 5,
        funFact = "Israels Regierung war intern ebenfalls gespalten — Menachem Begin und seine Herut-Partei liefen bei der Knesset-Abstimmung Sturm dagegen. Begin rief die Straßenproteste in Jerusalem persönlich an."
    ),

    // --- Hallstein-Doktrin ---

    Question(
        categoryId = 3,
        questionText = "Die Hallstein-Doktrin (1955) drohte Staaten mit dem Abbruch diplomatischer Beziehungen, die die DDR anerkannten. Welche beiden Ausnahmen gab es von Anfang an, und warum?",
        answerA = "Sowjetunion (als Siegermacht mit Verantwortung für Deutschland) und Jugoslawien (das Bonn nach dessen Anerkennung der DDR 1957 dennoch nicht brach, bis Nasser-Krise 1965 die Doktrin schwächte)",
        answerB = "China und Nordkorea (weil keine wirtschaftlichen Interessen bestanden)",
        answerC = "Polen und Tschechoslowakei (wegen ungeklärter Grenzfragen)",
        answerD = "Es gab keine Ausnahmen — die Doktrin wurde in allen Fällen konsequent angewandt",
        correctAnswer = 0,
        explanation = "Die UdSSR als Siegermacht erhielt Sonderstatus: Adenauer nahm 1955 diplomatische Beziehungen auf (und erreichte die Freilassung der letzten Kriegsgefangenen), obwohl die Sowjetunion die DDR anerkannte. Bei Jugoslawien brach Bonn nach der DDR-Anerkennung 1957 tatsächlich die Beziehungen ab. Die erste echte Aushöhlung kam 1967, als Westdeutschland trotz DDR-Anerkennungen durch Rumänien und Jugoslawien die Beziehungen wiederaufnahm.",
        difficulty = 5,
        funFact = "Der Name stammt von Wilhelm Georg Hallstein, Staatssekretär im AA — aber Walter Hallstein, der erste EWG-Kommissionspräsident, war eine andere Person. Der gleiche Nachname führt bis heute zu Verwirrungen in der Fachliteratur."
    ),

    // --- Ostpolitik ---

    Question(
        categoryId = 3,
        questionText = "Willy Brandts Kniefall von Warschau am 7. Dezember 1970 war eine Spontangeste. Was unterzeichnete Brandt an diesem Tag in Warschau, und was war der genaue Inhalt des Dokuments bezüglich der Oder-Neiße-Linie?",
        answerA = "Warschauer Vertrag: Westdeutschland erkannte die Oder-Neiße-Linie als westliche Staatsgrenze Polens 'für unantastbar' an — mit dem völkerrechtlichen Vorbehalt eines endgültigen Friedensvertrags",
        answerB = "Warschauer Vertrag: Deutschland erkannte Polens Grenzen endgültig und unwiderruflich an",
        answerC = "Warschauer Erklärung: Eine gemeinsame politische Absichtserklärung ohne Rechtsverbindlichkeit",
        answerD = "Warschauer Protokoll: Regelung von Reparationszahlungen und Umsiedlungsfragen",
        correctAnswer = 0,
        explanation = "Der Warschauer Vertrag enthielt die Formel 'unantastbar' für die Oder-Neiße-Linie, vermied aber das Wort 'endgültig', um den Vorbehalt eines Friedensvertrags zu wahren — ein bewusst gewählter Kompromiss, der Brandts innenpolitische Handlungsfähigkeit erhielt. Die endgültige Anerkennung erfolgte erst durch den Zwei-plus-Vier-Vertrag 1990 und den Grenzvertrag vom November 1990.",
        difficulty = 5,
        funFact = "Eine zeitgenössische Umfrage zeigte: Die Mehrheit der Westdeutschen hielt den Kniefall für 'übertrieben'. Heute gilt er als einer der stärksten Momente politischer Symbolik des 20. Jahrhunderts — der Spiegel wählte ihn zum wichtigsten deutschen politischen Bild."
    ),

    Question(
        categoryId = 3,
        questionText = "Das Moskauer Abkommen vom 12. August 1970 (Grundlage der Ostpolitik) enthielt einen geheimen 'Brief zur deutschen Einheit'. Was besagte dieser Brief, und wer übergab ihn dem sowjetischen Außenminister?",
        answerA = "Der Brief erklärte, dass der Vertrag nicht dem Ziel der deutschen Einheit widerspreche — Walter Scheel übergab ihn Andrei Gromyko als Bedingung für die Ratifizierung",
        answerB = "Der Brief enthielt Geheimabsprachen über Berlin-Transitrechte",
        answerC = "Der Brief sicherte der Sowjetunion westdeutsche Wirtschaftshilfe zu",
        answerD = "Der Brief war eine persönliche Nachricht Brandts an Breschnew über NATO-Abrüstung",
        correctAnswer = 0,
        explanation = "Der 'Brief zur deutschen Einheit' war eine einseitige westdeutsche Note, keine sowjetische Gegenleistung. Außenminister Walter Scheel überreichte ihn Gromyko. Der Brief sicherte innenpolitisch ab, dass Brandt die Wiedervereinigung nicht aufgegeben hatte — er ermöglichte die CDU/CSU-Zustimmung zur Ratifizierung oder zumindest ihre Enthaltung (Konstruktives Misstrauensvotum von Barzel scheiterte).",
        difficulty = 5,
        funFact = "Brandts Ostpolitik kostete ihn fast das Kanzleramt: Im April 1972 verlor er das konstruktive Misstrauensvotum von Rainer Barzel nur wegen zweier 'verlorener' Stimmen — von denen sich später herausstellte, dass mindestens eine durch die Stasi gekauft worden war."
    ),

    // --- Radikalenerlass ---

    Question(
        categoryId = 3,
        questionText = "Der 'Radikalenerlass' vom 28. Januar 1972 (offiziell: 'Grundsätze zur Frage der verfassungsfeindlichen Kräfte im öffentlichen Dienst') wurde von Bundesregierung und Ländern gemeinsam beschlossen. Wie viele Bewerber wurden nach Schätzungen im Rahmen der 'Regelanfrage' beim Verfassungsschutz überprüft, und wie viele wurden tatsächlich abgelehnt?",
        answerA = "Etwa 3,5 Millionen Überprüfungen bis 1987 — bei ca. 10.000 Ablehnungen und 1.250 Entlassungen bereits Verbeamteter",
        answerB = "500.000 Überprüfungen — 50.000 Ablehnungen, das Gesetz wurde rigoros durchgesetzt",
        answerC = "10 Millionen Überprüfungen — nur 12 Ablehnungen, das Gesetz war symbolischer Natur",
        answerD = "1 Million Überprüfungen — 100.000 Ablehnungen vorwiegend von KPD-Mitgliedern",
        correctAnswer = 0,
        explanation = "Die Zahlen belegen das Missverhältnis zwischen Aufwand und Ergebnis: Ca. 3,5 Millionen Anfragen beim Verfassungsschutz führten zu etwa 10.000 Ablehnungen (0,3%) und rund 1.250 Entlassungen. Die Wirkung lag primär in der Selbstzensur — viele Linke verzichteten von vornherein auf Bewerbungen im öffentlichen Dienst. International verursachte der Erlass starke Kritik (Günter Grass, Heinrich Böll, ausländische Presseberichte).",
        difficulty = 5,
        funFact = "Frankreich bezeichnete den Radikalenerlass als 'Berufsverbote' — ein Begriff, der international gebräuchlich wurde. Der Europarat verabschiedete 1978 eine Resolution, die Deutschland zur Revision aufforderte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Land war Hauptkritiker des Radikalenerlasses international und welche prominente westdeutsche Schriftstellerin schrieb in diesem Zusammenhang einen offenen Brief an den schwedischen Ministerpräsidenten Olof Palme?",
        answerA = "Schweden war Hauptkritiker — Ingeborg Drewitz schrieb keinen offenen Brief, aber Günter Grass wandte sich direkt an Palme im Kontext der SPD-Solidarität",
        answerB = "Großbritannien — Harold Pinter organisierte eine internationale Protestkampagne",
        answerC = "Frankreich — Simone de Beauvoir publizierte einen Aufruf in Le Monde",
        answerD = "USA — Noam Chomsky kritisierte den Erlass als McCarthyismus-Äquivalent",
        correctAnswer = 0,
        explanation = "Olof Palmes schwedische Sozialdemokraten waren besonders kritisch — die Solidaritätsverbindungen zur SPD machten dies politisch pikant. Günter Grass führte intensive Briefwechsel mit Palme. Grass war insgesamt der prominenteste innerwestdeutsche Kritiker und veröffentlichte zahlreiche Essays gegen die 'Berufsverbote'. Die anderen Antworten beschreiben reale Kritiker, aber nicht im Kontext Palme/Schweden.",
        difficulty = 5,
        funFact = "Olof Palme bezeichnete die Bundesrepublik wegen des Radikalenerlasses als 'autoritären Staat' — was in Bonn zu diplomatischen Verstimmungen führte, obwohl beide Länder sozialdemokratisch regiert wurden."
    ),

    // --- Weimarer Republik Intellektuellenleben ---

    Question(
        categoryId = 3,
        questionText = "Der Berliner Romanistikprofessor Victor Klemperer verfasste in der NS-Zeit ein sprachanalytisches Werk, das nach dem Krieg als 'LTI — Lingua Tertii Imperii' (Sprache des Dritten Reiches) erschien. Was war sein methodisches Kernvorgehen?",
        answerA = "Tagebuchnotizen zur Sprache als Instrument totalitärer Bewusstseinsformung — Analyse von Euphemismen, Nominalstil und ideologischer Bedeutungsverschiebung",
        answerB = "Linguistische Textanalyse offizieller NS-Dokumente aus Berliner Archiven",
        answerC = "Vergleich der NS-Sprache mit faschistischer Rhetorik in Italien",
        answerD = "Statistische Auswertung von Zeitungskorpora aus dem Völkischen Beobachter",
        correctAnswer = 0,
        explanation = "Klemperer, als 'Halbjude' mit 'arischer' Frau unter permanenter Bedrohung in Dresden, notierte im Tagebuch täglich Sprachbeobachtungen. LTI analysiert, wie NS-Begriffe wie 'fanatisch' (positiv umgedeutet), 'Blut und Boden', 'Wille' und 'Gemeinschaft' das Denken formten. Das Werk ist ein Klassiker der politischen Semantik.",
        difficulty = 5,
        funFact = "Klemperer überlebte nur knapp: Er sollte mit dem letzten Deportationstransport aus Dresden am 13. Februar 1945 abtransportiert werden. Der Bombenangriff zerstörte in derselben Nacht das Sammellager — er floh im Chaos und überlebte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Kulturmagazin der Weimarer Republik galt als wichtigstes linkes intellektuelles Organ, erschien von 1920 bis 1933 wöchentlich, und wer war sein langjähriger Chefredakteur?",
        answerA = "Die Weltbühne — Carl von Ossietzky (ab 1926), der 1935 den Friedensnobelpreis erhielt",
        answerB = "Der Querschnitt — Alfred Flechtheim als Gründer und Herausgeber",
        answerC = "Die Neue Rundschau — Samuel Fischer als Verleger mit Hugo von Hofmannsthal",
        answerD = "Simplicissimus — Ludwig Thoma als langjähriger Chefredakteur",
        correctAnswer = 0,
        explanation = "Die Weltbühne, gegründet 1905 als 'Die Schaubühne', wurde unter Siegfried Jacobsohn und dann Carl von Ossietzky zum wichtigsten Organ der pazifistischen und demokratischen Linken. Ossietzky wurde 1931 wegen Enthüllung der geheimen Aufrüstung der Reichswehr verurteilt und saß im KZ, als ihm 1935 der Friedensnobelpreis zuerkannt wurde — was Hitler wutentbrannt zur Nobelpreis-Boykottierung trieb.",
        difficulty = 5,
        funFact = "Ossietzkys Nobelpreis reizte Hitler so sehr, dass er 1937 per Erlass allen Deutschen die Annahme des Nobelpreises verbot — ein Erlass, der bis 1949 formal bestehen blieb."
    ),

    // --- Gleichschaltung der Presse ---

    Question(
        categoryId = 3,
        questionText = "Das Reichsschriftleitergesetz vom 4. Oktober 1933 überführte Journalisten in einen 'Berufsstand'. Welches institutionelle Prinzip unterschied es fundamental von einer direkten staatlichen Pressezensur?",
        answerA = "Selbstverantwortung des Schriftleiters — der Redakteur war persönlich strafrechtlich verantwortlich für staatsfeindliche Inhalte und konnte aus dem Berufsstand ausgeschlossen werden",
        answerB = "Vorabzensur durch das Reichsministerium für Volksaufklärung",
        answerC = "Verstaatlichung aller Pressebetriebe durch Übernahme des Hugenberg-Konzerns",
        answerD = "Einheitliche Nachrichtenversorgung durch DNB (Deutsches Nachrichtenbüro) als einzige erlaubte Quelle",
        correctAnswer = 0,
        explanation = "Das Geniale und Perverse am Reichsschriftleitergesetz: Es brauchte keine direkte Zensurbehörde. Der Schriftleiter war selbst verantwortlich für staatswidrige Inhalte und konnte bei Verstoß aus der Reichspressekammer ausgeschlossen werden — was Berufsverbot bedeutete. Dies erzeugte umfassende Selbstzensur ohne teure Zensurapparate. Goebbels nannte es 'präventive' statt 'repressive' Kontrolle.",
        difficulty = 5,
        funFact = "Max Amann, Reichsleiter der NS-Presse, nutzte die Gleichschaltung für ein privates Zeitungsimperium: Durch NSDAP-Verlag und Eher-Verlag kontrollierte er am Ende des Dritten Reichs zwei Drittel der deutschen Tagespresse."
    ),

    // --- Holocaust Täterforschung ---

    Question(
        categoryId = 3,
        questionText = "Raul Hilbergs dreibändiges Werk 'Die Vernichtung der europäischen Juden' (1961, erweitert 1985) führte ein analytisches Dreierschema ein. Wie lautet es?",
        answerA = "Täter — Opfer — Zuschauer",
        answerB = "Befehlsgeber — Ausführende — Mitläufer",
        answerC = "Ideologie — Bürokratie — Vernichtung",
        answerD = "Planung — Deportation — Massenmord",
        correctAnswer = 0,
        explanation = "Hilbergs Drei-Kategorien-Modell 'Täter — Opfer — Zuschauer' war revolutionär, weil es erstmals die Opferperspektive systematisch einbezog und die 'Zuschauer' (Bevölkerungen, Staaten, Kirchen, internationale Gemeinschaft) als eigenständige analytische Kategorie etablierte. Das Werk stieß auf erheblichen Widerstand — Yad Vashem lehnte zunächst die Publikation ab.",
        difficulty = 5,
        funFact = "Hannah Arendt referenzierte Hilberg ausführlich in 'Eichmann in Jerusalem' (1963), ohne ihn ausreichend zu zitieren — was zu einem lebenslangen, erbitterten Konflikt zwischen beiden führte."
    ),

    // --- Operation Bernhard ---

    Question(
        categoryId = 3,
        questionText = "Operation Bernhard (1942–1945) war die größte Geldfälschungsoperation der Geschichte. Wo wurden die britischen Pfund produziert, und was geschah mit dem Großteil der gefälschten Banknoten am Kriegsende?",
        answerA = "KZ Sachsenhausen (Block 19) — die meisten Noten wurden im Toplitzsee (Steiermark) versenkt",
        answerB = "KZ Dachau — die Noten wurden in Bayern vergraben und nie gefunden",
        answerC = "Reichsdruckerei Berlin — die Noten wurden im Berliner Bankenviertel verbrannt",
        answerD = "KZ Mauthausen — die Noten flohen mit SS-Führern nach Argentinien",
        correctAnswer = 0,
        explanation = "Häftlinge im KZ Sachsenhausen (Block 19) produzierten hochwertige britische Pfund-Scheine in der Absicht, die britische Wirtschaft zu destabilisieren. Am Kriegsende wurden über 100 Kisten mit Noten und Druckplatten im Toplitzsee im Salzkammergut versenkt. Taucher bargen in den 1950er und 1980er Jahren große Teile — der Toplitzsee ist seitdem ein Mythenort für NS-Schätze.",
        difficulty = 5,
        funFact = "Die gefälschten Noten waren so gut, dass die Bank of England nach dem Krieg die gesamte £5-Note-Serie einziehen musste. Einige Scheine kursierten noch jahrelang, ohne als Fälschungen erkannt zu werden."
    ),

    // --- Nürnberger Prozesse spezifisch ---

    Question(
        categoryId = 3,
        questionText = "Der Internationale Militärgerichtshof (IMT) in Nürnberg (1945/46) schuf vier Anklagepunkte. Welcher war historiographisch am umstrittensten, weil er einen rückwirkend definierten Verbrechensbegriff anwandte?",
        answerA = "Verbrechen gegen den Frieden (Planung und Führung eines Angriffskrieges) — nullum crimen sine lege-Einwand",
        answerB = "Verbrechen gegen die Menschlichkeit — weil er erstmals Anwendung fand",
        answerC = "Kriegsverbrechen — weil die Alliierten selbst ähnliche Handlungen begingen",
        answerD = "Verschwörung/gemeinsamer Plan — wegen des kollektiven Schuldprinzips",
        correctAnswer = 0,
        explanation = "Anklagepunkt 1 ('Verbrechen gegen den Frieden') war juristisch am angreifbarsten: Aggressionskrieg war 1939 nicht explizit kriminalisiert (der Briand-Kellogg-Pakt von 1928 verbot Krieg, aber schuf keine individuelle Strafbarkeit). Die Verteidigung argumentierte mit 'nullum crimen sine lege' — kein Verbrechen ohne vorheriges Gesetz. Das IMT wies dies zurück, aber die Kontroverse dauert in der Völkerrechtswissenschaft an.",
        difficulty = 5,
        funFact = "Hermann Göring, der eloquenteste Angeklagte, hielt die Prozesse für Siegerjustiz und verweigerte konsequent jede Reue. Er entzog sich dem Strang durch Selbstvergiftung mit einem Zyankapseln, die er die ganze Zeit versteckt gehalten hatte — bis heute ist unklar, wie er sie erhielt."
    ),

    // --- Adenauer / Wiederbewaffnung ---

    Question(
        categoryId = 3,
        questionText = "Die Europäische Verteidigungsgemeinschaft (EVG) scheiterte 1954 am französischen Parlament. Welche Alternative ermöglichte die westdeutsche Wiederbewaffnung, und welches entscheidende Zugeständnis machte Adenauer dabei?",
        answerA = "Westeuropäische Union (WEU) + NATO-Beitritt — Adenauer verzichtete auf ABC-Waffen und akzeptierte Produktionsbeschränkungen für schwere Waffen",
        answerB = "EURATOM und Römische Verträge — Westdeutschland trat ohne Wiederbewaffnung bei",
        answerC = "Bilaterales deutsch-amerikanisches Sicherheitsabkommen — ohne Einbindung Frankreichs",
        answerD = "Pariser Protokolle schufen eine eigenständige Bundeswehr ohne supranationale Einbindung",
        correctAnswer = 0,
        explanation = "Die Pariser Verträge (Oktober 1954) schufen die WEU und ermöglichten NATO-Beitritt. Adenauer unterschrieb einen 'Verzicht auf ABC-Waffen' (Atomwaffen, Biologische Waffen, Chemische Waffen) und akzeptierte Obergrenzen für Truppenstärke und schwere Waffen. Frankreich erhielt Kontrollrechte. Die Bundeswehr entstand offiziell am 12. November 1955.",
        difficulty = 5,
        funFact = "Der erste Bundeswehr-Soldat erhielt seinen Einberufungsbefehl am 12. November 1955 — dem 200. Geburtstag von Gerhard von Scharnhorst, dem Reformer der preußischen Armee. Das war kein Zufall."
    ),

    // --- Spiegel-Affäre ---

    Question(
        categoryId = 3,
        questionText = "Die Spiegel-Affäre von Oktober 1962 begann mit einer Verhaftungswelle nach dem Abdruck des Artikels 'Bedingt abwehrbereit'. Was löste den Rücktritt von Franz Josef Strauß als Verteidigungsminister aus?",
        answerA = "Strauß hatte über den Militärattaché in Spanien die Verhaftung des im Ausland befindlichen Spiegel-Redakteurs Conrad Ahlers angeordnet — ohne Wissen des Justizministers",
        answerB = "Strauß hatte persönlich die Spiegel-Redaktion durchsuchen lassen",
        answerC = "Er hatte dem Bundestag falsche Aussagen über seine Rolle in der Affäre gemacht",
        answerD = "Er war als Informant des amerikanischen Geheimdienstes CIA enttarnt worden",
        correctAnswer = 0,
        explanation = "Strauß leugnete zunächst im Bundestag jede eigene Rolle. Dann kam heraus, dass er über den deutschen Militärattaché in Madrid spanische Behörden gebeten hatte, den Spiegel-Redakteur Conrad Ahlers zu verhaften — ohne den zuständigen Justizminister Wolfgang Stammberger (FDP) zu informieren. Diese Lüge im Parlament kostete ihn das Amt und zwang Adenauer, sein Kabinett umzubilden.",
        difficulty = 5,
        funFact = "Die Spiegel-Affäre gilt als Deutschlands erster großer Pressefreiheits-Test — und der Spiegel gewann. Rudolf Augstein, der 103 Tage in Untersuchungshaft saß, wurde freigelassen; alle Verfahren eingestellt."
    ),

    // --- Frankfurter Auschwitzprozess ---

    Question(
        categoryId = 3,
        questionText = "Der erste Frankfurter Auschwitz-Prozess (1963–1965) unter Richter Hans Hofmeyer war für die bundesdeutsche Vergangenheitsbewältigung wegweisend. Wer war der treibende Ermittler, der den Prozess durch jahrelange Zeugenbefragungen überhaupt erst möglich machte?",
        answerA = "Fritz Bauer, hessischer Generalstaatsanwalt (ab 1956), der auch Eichmann beim Mossad denunzierte",
        answerB = "Hermann Langbein, Auschwitz-Überlebender und Zeuge der Anklage",
        answerC = "Simon Wiesenthal, der die Angeklagten in Österreich aufspürte",
        answerD = "Hanns Martin Schleyer, damals Staatsanwalt in Frankfurt",
        correctAnswer = 0,
        explanation = "Fritz Bauer ist die zentrale Figur: Als hessischer Generalstaatsanwalt baute er jahrelang Anklagen auf, überwand Widerstände im Justizapparat (viele Kollegen aus der NS-Zeit) und zog internationale Zeugen heran. Bauer informierte auch den Mossad über Eichmanns Aufenthaltsort in Argentinien — weil er dem deutschen Justizapparat nicht traute. Hermann Langbein koordinierte die Zeugensuche als Auschwitz-Komitee-Sekretär.",
        difficulty = 5,
        funFact = "Fritz Bauer wurde nie offiziell für seine Arbeit gewürdigt — er starb 1968 einsam in seiner Wohnung, möglicherweise durch Suizid. Erst Jahrzehnte später entstanden Spielfilme und Gedenkstätten zu seinem Wirken."
    ),

    // --- Goerdeler-Kreis / 20. Juli ---

    Question(
        categoryId = 3,
        questionText = "Das Stauffenberg-Attentat vom 20. Juli 1944 (Operation Walküre) scheiterte durch mehrere Zufälle. Welcher konkrete Umstand verhinderte, dass die Bombe ihre volle Wirkung entfaltete?",
        answerA = "Das Lagebesprechungsgebäude war kurzfristig aus dem unterirdischen Bunker in eine Holzbaracke verlegt worden — Holz absorbiert Druckwellen weniger als Beton",
        answerB = "Stauffenberg konnte nur eine statt zwei Bomben zünden, weil er mit drei Fingern am Draht hantieren musste",
        answerC = "Jemand stellte die Aktentasche mit der Bombe hinter ein massives Eichenholztischbein",
        answerD = "Beide A und C sind korrekt — das Zusammenspiel beider Faktoren rettete Hitler",
        correctAnswer = 3,
        explanation = "Beide Faktoren trugen zum Überleben Hitlers bei: (1) Stauffenberg konnte wegen seiner Verwundungen (drei Finger fehlten) nur eine Bombe scharf machen — die zweite, unscharf gemachte, blieb in seiner Aktentasche. (2) Oberst Brandt stellte die Aktentasche hinter das massive Tischbein, das die Wucht der Explosion abschirmte. Dazu kam die Holzbaracke statt des Betonbunkers.",
        difficulty = 5,
        funFact = "Hitler überlebte mit einem zerrissenen Trommelfell, Verbrennungen und zittrigen Beinen. Er zeigte Mussolini stolz seine zerfetzte Hose — als Beweis seiner Unverwundbarkeit, wie er selbst interpretierte."
    ),

    // --- Berliner Blockade ---

    Question(
        categoryId = 3,
        questionText = "Die Berliner Blockade (Juni 1948 – Mai 1949) wurde durch die Luftbrücke gebrochen. Welcher logistische Engpass fast zur Einstellung der Luftbrücke im ersten Winter führte, und wie wurde er überwunden?",
        answerA = "Kohlemangel und Flugzeugkapazität im Winter 1948/49 — Tegel-Flughafen wurde in 90 Tagen von Berlinern freiwillig gebaut und erhöhte die Kapazität entscheidend",
        answerB = "Schlechtes Wetter lähmte den Flugbetrieb drei Wochen lang — neue Radarsysteme lösten das Problem",
        answerC = "Sowjetische Jagdflugzeuge beschossen Transportmaschinen — US-Jagdabdeckung musste eingeführt werden",
        answerD = "Kerosinmangel in Westdeutschland — Marshall-Plan-Kredite finanzierten Notimporte",
        correctAnswer = 0,
        explanation = "Der Engpass war in der Tat Tegel: Tempelhof war zu klein und überlastet. Berliner Zivilisten bauten den Flughafen Tegel in 90 Tagen (Oktober–Dezember 1948) — für damalige Verhältnisse in Rekordzeit. Der Flughafen wurde am 5. November 1948 eröffnet und verdreifachte nahezu die Versorgungskapazität. Im Spitzenbetrieb landete alle 90 Sekunden ein Flugzeug.",
        difficulty = 5,
        funFact = "Der amerikanische Pilot Gail Halvorsen begann eigenmächtig, Schokolade und Kaugummi an Fallschirmen aus dem Flugzeug zu werfen — die 'Rosinenbomber' wurden zum Symbol der Luftbrücke. Die US Air Force institutionalisierte die Aktion als 'Operation Little Vittles'."
    ),

    // --- Weimar / Stresemann ---

    Question(
        categoryId = 3,
        questionText = "Gustav Stresemann starb am 3. Oktober 1929 — nur wenige Wochen vor dem Börsencrash. Als Außenminister hatte er 1925 in Locarno einen Vertrag ausgehandelt. Was war der entscheidende Unterschied zwischen dem Locarno-Vertrag bezüglich West- und Ostgrenzen?",
        answerA = "Westgrenzen (Rhein) wurden als unverletzlich garantiert und durch ein militärisches Beistandsversprechen gesichert — Ostgrenzen (Polen/Tschechoslowakei) erhielten nur Schiedsvertragsklauseln ohne Garantien",
        answerB = "Alle deutschen Grenzen wurden in Locarno endgültig anerkannt",
        answerC = "Locarno garantierte nur die Entmilitarisierung des Rheinlandes, nicht die Grenzen",
        answerD = "Ostgrenzen wurden stärker garantiert als Westgrenzen, weil Frankreich keine Interessen dort hatte",
        correctAnswer = 0,
        explanation = "Locarno schuf ein Zwei-Klassen-System: Der Rheinpakt garantierte die deutsch-französische und deutsch-belgische Westgrenze mit britischer und italienischer Garantiemacht. Für Polen und die Tschechoslowakei gab es nur 'Schiedsverträge' ohne Garantiepflicht — was Polen als Signal interpretierte, dass die Revision der Ostgrenzen 'verhandelbar' blieb. Hitler nutzte dies später explizit.",
        difficulty = 5,
        funFact = "Stresemann erhielt 1926 den Friedensnobelpreis gemeinsam mit dem französischen Außenminister Aristide Briand — der einzige Fall, dass zwei Außenminister, die auf Augenhöhe verhandelt hatten, gemeinsam ausgezeichnet wurden."
    ),

    // --- Eichmann-Prozess ---

    Question(
        categoryId = 3,
        questionText = "Hannah Arendts Berichterstattung über den Eichmann-Prozess 1961 für den New Yorker mündete im Begriff 'Banalität des Bösen'. Welche spezifische Beobachtung an Eichmanns Persönlichkeit führte sie zu diesem Schluss?",
        answerA = "Eichmanns Gedankenlosigkeit — seine Unfähigkeit zu denken (im Sinne von Urteilen) kombiniert mit bürokratischer Pflichterfüllung und Klischeesprache, nicht ideologischer Besessenheit",
        answerB = "Eichmanns Normalität als Familienvater und Nachbar, die ihn ununterscheidbar von gewöhnlichen Menschen machte",
        answerC = "Seine Bereitschaft, nach dem Krieg ohne Gewissensbisse in der Normalgesellschaft zu leben",
        answerD = "Die Tatsache, dass er nur Befehle befolgte und persönlich keine antisemitische Überzeugung hatte",
        correctAnswer = 0,
        explanation = "Arendts Punkt war subtiler als oft verstanden: Nicht dass Eichmann 'normal' war, sondern dass er unfähig zur eigenständigen moralischen Urteilsbildung war — er dachte in Amtssprache, Klischees und Bürokratenformeln. 'Banalität' meinte nicht Gewöhnlichkeit, sondern das Fehlen tiefer Überzeugung oder dämonischer Motivation. Dieser Punkt wurde von Gershom Scholem, Raul Hilberg und anderen scharf angegriffen.",
        difficulty = 5,
        funFact = "Gershom Scholem warf Arendt in einem offenen Brief 'Herzlosigkeit' gegenüber den jüdischen Opfern vor und kritisierte ihren Begriff 'Judenräte'. Arendt antwortete, sie liebe keine Kollektive, sondern nur ihre Freunde persönlich."
    ),

    // --- Bundesrepublik / Wiedergutmachung ---

    Question(
        categoryId = 3,
        questionText = "Das Bundesentschädigungsgesetz (BEG) von 1953/56 gewährte Reparationen an NS-Verfolgte. Welche Gruppe wurde systematisch ausgeschlossen und erkämpfte erst Jahrzehnte später partielle Anerkennung?",
        answerA = "Sinti und Roma — wurden wegen des 'Rassenmerkmals' laut BGH-Urteil von 1956 als 'kriminelle Asoziale' behandelt, nicht als rassistisch Verfolgte",
        answerB = "Homosexuelle — § 175 StGB blieb bis 1969 in Kraft, Opfer galten als Kriminelle",
        answerC = "Zwangsarbeiter aus Osteuropa — fielen unter DDR-Zuständigkeit, Bundesrepublik verweigerte Entschädigung",
        answerD = "Alle drei Gruppen wurden systematisch ausgeschlossen",
        correctAnswer = 3,
        explanation = "Alle drei Gruppen wurden ausgeschlossen: Sinti und Roma durch das skandalöse BGH-Urteil von 1956 (Ausgrenzung als 'kriminell asozial' galt bis 1963). Homosexuelle galten durch § 175 als Kriminelle (erst 2002 teilweise rehabilitiert, volle Rehabilitation 2017). Zwangsarbeiter aus Ostblockstaaten bekamen erst durch den Stiftungsfonds von 2000 ('Erinnerung, Verantwortung und Zukunft') teilweise Zahlungen.",
        difficulty = 5,
        funFact = "Der BGH-Richter, der 1956 das Urteil gegen Sinti und Roma fällte, war in der NS-Zeit selbst in die Rassenjustiz involviert gewesen — ein exemplarisches Beispiel für die Personalkontinuität in der Bundesrepublik."
    ),

    // --- Partisanenbewegungen ---

    Question(
        categoryId = 3,
        questionText = "Das Warschauer Ghetto-Aufstand (19. April – 16. Mai 1943) war militärisch hoffnungslos. Welche Organisation führte den bewaffneten Widerstand, und wer befehligte die deutschen Vernichtungsoperationen?",
        answerA = "Jüdische Kampforganisation (ŻOB) unter Mordechai Anielewicz — SS-Brigadeführer Jürgen Stroop ließ das Ghetto systematisch niederbrennen",
        answerB = "Jüdischer Militärbund (ŻZW) unter Paweł Frenkel — General Heinz Reinefarth führte die Wehrmacht-Einheiten",
        answerC = "Bund unter Marek Edelman — Himmler persönlich befahl die Operation von Berlin aus",
        answerD = "Polnische AK (Armia Krajowa) unterstützte Jüdische Untergrundkämpfer — Erich von dem Bach-Zelewski koordinierte die SS",
        correctAnswer = 0,
        explanation = "Die ŻOB (Żydowska Organizacja Bojowa) war die Hauptkampforganisation — auch der ŻZW (Żydowski Związek Wojskowy) kämpfte parallel. Anielewicz kommandierte die ŻOB und starb beim Bunker-Kampf am 8. Mai 1943. SS-Brigadeführer Jürgen Stroop schrieb den berühmten Bericht 'Es gibt keinen jüdischen Wohnbezirk in Warschau mehr!' mit Fotos, der nach dem Krieg als Beweisstück in Nürnberg diente.",
        difficulty = 5,
        funFact = "Marek Edelman, einer der ŻOB-Kommandeure, überlebte — er wurde nach dem Krieg Kardiologe in Łódź und war einer der letzten lebenden Aufstandsführer bis zu seinem Tod 2009."
    ),

    // --- Konrad Adenauer Spezifika ---

    Question(
        categoryId = 3,
        questionText = "Adenauer erreichte 1955 die Freilassung der letzten deutschen Kriegsgefangenen aus der Sowjetunion durch direkte Verhandlungen mit Chruschtschow in Moskau. Wie viele Gefangene kamen frei, und welches Junktim stellte die Sowjetunion?",
        answerA = "Ca. 10.000 Gefangene — Gegenleistung waren Aufnahme diplomatischer Beziehungen zwischen BRD und UdSSR, was Adenauer durch den 'deutschen Vorbehalt' (Moskauer Memorandum) absicherte",
        answerB = "Ca. 50.000 Gefangene — Gegenleistung war ein deutsches Versprechen zur Neutralität",
        answerC = "Ca. 1.000 Gefangene — keine Gegenleistung, humanitäre Geste Chruschtschows",
        answerD = "Ca. 100.000 Gefangene — Gegenleistung waren wirtschaftliche Kredite der Bundesrepublik",
        correctAnswer = 0,
        explanation = "Die Moskauer Verhandlungen (September 1955) führten zur Freilassung von ca. 10.000 Kriegsgefangenen und Zivilinternierten (nicht 'Kriegsverbrecher' nach sowjetischer Klassifikation). Als Gegenleistung nahm die BRD diplomatische Beziehungen zur UdSSR auf — was die Hallstein-Doktrin eigentlich verbot. Adenauer sicherte dies durch ein deutsches Memorandum ab, das festhielt, dass die Anerkennung keine Aussage über die Grenzfragen oder Wiedervereinigung implizierte.",
        difficulty = 5,
        funFact = "Adenauer fuhr mit 79 Jahren nach Moskau und verhandelte mit Chruschtschow persönlich — auf Deutsch und Russisch über Dolmetscher. Die Heimkehrer wurden in Friedland empfangen; Adenauer stand am Bahnhof und weinte."
    ),

    // --- Bundesrepublik Parteiengeschichte ---

    Question(
        categoryId = 3,
        questionText = "Die FDP erlebte 1982 einen dramatischen Koalitionswechsel von Schmidt zu Kohl. Welcher FDP-Wirtschaftsminister formulierte das 'Wendepapier', und was war dessen inhaltlicher Kern?",
        answerA = "Otto Graf Lambsdorff — das 'Konzept für eine Politik zur Überwindung der Wachstumsschwäche' forderte Deregulierung, Sozialabbau und Angebotsökonomik, was Schmidt als 'Scheidungsbrief' interpretierte",
        answerB = "Hans-Dietrich Genscher — der Wechsel erfolgte aus außenpolitischen Gründen (NATO-Doppelbeschluss)",
        answerC = "Martin Bangemann — sein Konzept betraf primär Währungsstabilität und Bundesbankautonomie",
        answerD = "Werner Maihofer — er kritisierte Schmidts Sozialpolitik als zu expansiv",
        correctAnswer = 0,
        explanation = "Otto Graf Lambsdorffs Konzeptpapier vom September 1982 war programmatisch: Es forderte massive Einschnitte ins Sozialsystem und angebotsökonomische Reformen, die Schmidt grundsätzlich ablehnte. Helmut Schmidt nannte es öffentlich 'Scheidungsbrief' und machte damit klar, dass die Koalition zerbrochen war. Das konstruktive Misstrauensvotum vom 1. Oktober 1982 brachte Kohl ins Amt.",
        difficulty = 5,
        funFact = "Lambsdorff wurde 1984 wegen Steuerhinterziehung im Zusammenhang mit der Flick-Affäre angeklagt — er trat als Wirtschaftsminister zurück. Sein Nachfolger wurde Martin Bangemann."
    ),

    // --- NS-Wirtschaftspolitik ---

    Question(
        categoryId = 3,
        questionText = "Hjalmar Schacht finanzierte die NS-Aufrüstung ab 1934 durch sogenannte MEFO-Wechsel. Was waren MEFO-Wechsel, und warum waren sie ein genialer buchhalterischer Trick?",
        answerA = "Wechsel einer fiktiven Holdinggesellschaft (Metallurgische Forschungsgesellschaft), die niemals produzierte — die Reichsbank diskontierte sie und hielt so Rüstungsausgaben aus der offiziellen Reichsschuld heraus",
        answerB = "Anleihen der Deutschen Reichsbahn, die bei ausländischen Banken platziert wurden",
        answerC = "Staatliche Schatzwechsel mit Golddeckung aus dem Reichsbankvorrat",
        answerD = "Kriegsanleihen an die Bevölkerung in Form von steuerfreien Obligationen",
        correctAnswer = 0,
        explanation = "Die Metallurgische Forschungsgesellschaft mbH (MEFO) war eine Tarnfirma ohne realen Geschäftsbetrieb, gegründet von Krupp, Siemens, Rheinmetall und Gutehoffnungshütte. Rüstungsunternehmen erhielten MEFO-Wechsel als Zahlungsmittel, die die Reichsbank diskontierte. Da sie nicht als Staatsschulden verbucht wurden, verschleierte dieser Trick die wahre Dimension der Aufrüstung — bis Schacht 1937 die Notbremse zog, weil Inflation drohte.",
        difficulty = 5,
        funFact = "Als Schacht 1937 die MEFO-Finanzierung stoppen wollte und Hitler auf direkter Staatsverschuldung bestand, trat er 1937 als Wirtschaftsminister zurück. Beim Nürnberger Prozess wurde er freigesprochen — eines der kontroversesten Urteile des Tribunals."
    ),

    // --- Historisch-politische Symbolfiguren ---

    Question(
        categoryId = 3,
        questionText = "Der Historikerstreit 1986/87 wurde durch einen Artikel von Ernst Nolte in der Frankfurter Allgemeinen Zeitung ausgelöst. Was war Noltes Kernthese, und wie reagierte Jürgen Habermas?",
        answerA = "Nolte: Auschwitz war 'Reaktion' auf den 'asiatischen' Gulag-Terror Stalins (kausale Verkettung/Präzedenzfall-These); Habermas: dies relativiere die singuläre Schuld und betreibe politische Apologetik für die Neue Rechte",
        answerB = "Nolte: Der Holocaust war quantitativ vergleichbar mit armenischen und kambodschanischen Genoziden; Habermas: Vergleiche seien grundsätzlich unzulässig",
        answerC = "Nolte: Die Wehrmacht war eine normale Armee ohne ideologische Verbrechensneigung; Habermas: damit werde die Funktionalismus-Debatte politisiert",
        answerD = "Nolte: Die BRD solle aufhören, sich kollektiv zu geißeln; Habermas: das Schuldbekenntnis sei konstitutiv für demokratische Identität",
        correctAnswer = 0,
        explanation = "Noltes Artikel 'Vergangenheit, die nicht vergehen will' (FAZ, 6. Juni 1986) argumentierte, der nationalsozialistische Judenmord sei eine 'Reaktion' auf den bolschewistischen Klassenmord gewesen — eine kausale Verkettung, die Auschwitz als verständliche Defensivreaktion erscheinen ließ. Habermas' Antwort in der Zeit entlarvte dies als apologetische Strategie und eröffnete eine monatelange Debatte, an der fast alle großen deutschen Historiker teilnahmen.",
        difficulty = 5,
        funFact = "Michael Stürmer und Andreas Hillgruber schlugen sich auf Noltes Seite, Hans-Ulrich Wehler und Hans Mommsen auf Habermas' Seite. Die Debatte war so intensiv, dass sie dauerhaft in Lehrpläne und internationale Presse einging — obwohl sie fast ausschließlich in deutschen Feuilletons stattfand."
    ),

)
