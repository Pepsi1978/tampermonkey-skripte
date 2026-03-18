package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsHard4(): List<Question> = listOf(

    // ── Sportphilosophie & Ethik (8) ──────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was versteht man in der Sportethik unter dem Begriff 'Fair Play' im Sinne von Bernard Suits' Konzept des 'lusiory attitude'?",
        answerA = "Die blosse Einhaltung der schriftlichen Regelwerke ohne Ruecksicht auf den Geist des Spiels",
        answerB = "Die freiwillige Bereitschaft, konstitutive Regeln des Spiels anzuerkennen, auch wenn man dadurch schlechter gestellt wird",
        answerC = "Das Verbot jeglicher taktischer Regelausnutzung im professionellen Sport",
        answerD = "Die automatische Disqualifikation bei absichtlichen Regelverstoessen",
        correctAnswer = 1,
        explanation = "Bernard Suits beschreibt in 'The Grasshopper' (1978) den Spieler als jemanden, der freiwillig unnoetige Hindernisse akzeptiert. Die 'lusiory attitude' ist die Bereitschaft, den Regeln zu folgen, weil man spielen moechte – nicht trotz der Regeln, sondern durch sie. Ethisches Fair Play bedeutet, diesen Geist auch dann zu wahren, wenn Regelluecken ausgenutzt werden koennten.",
        difficulty = 3,
        funFact = "Suits' Buch wurde nach seinem Erscheinen kaum beachtet, gilt heute aber als eines der bedeutendsten Werke der Sportphilosophie und Spieltheorie."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches philosophische Problem beschreibt das 'Doping-Dilemma' (auch bekannt als 'Steroid's Dilemma') im Bereich der Sportethik?",
        answerA = "Die Frage, ob Doping den Athleten schadet oder ihm nuetzt, aus medizinischer Sicht",
        answerB = "Ein Gefangenendilemma, bei dem alle Sportler dopen wuerden, wenn alle anderen es tun, obwohl alle ohne Doping besser gestellt waeren",
        answerC = "Die Ungleichheit zwischen reichen und armen Nationen beim Zugang zu Dopingmitteln",
        answerD = "Das Dilemma der Dopingkontrolleure zwischen Privatsphaere und Kontrolle",
        correctAnswer = 1,
        explanation = "Das 'Steroid's Dilemma' ist ein klassisches Gefangenendilemma: Wenn alle Konkurrenten dopen, muss auch der einzelne Athlet dopen, um konkurrenzfaehig zu bleiben – obwohl das kollektive Ergebnis (alle dopen, niemand hat Vorteil, aber alle tragen Gesundheitsrisiken) schlechter ist als wenn niemand dopen wuerde. Es zeigt, warum externe Regulierung (Verbote) rational notwendig ist.",
        difficulty = 3,
        funFact = "Norman Fost, Bioethiker an der University of Wisconsin, argumentierte kontrovers, Leistungsverbesserungen durch Doping seien nicht grundsaetzlich unethischer als andere Vorteile wie bessere Trainingsgeraete oder Hoehentraining."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die Kernthese des 'interne Gueter'-Arguments von Alasdair MacIntyre in Bezug auf Sport?",
        answerA = "Sportliche Exzellenz hat nur dann moralischen Wert, wenn sie mit externen Guotern wie Geld und Ruhm verbunden ist",
        answerB = "Sport besitzt inhaerente Gueter (Exzellenz, Freude, Gemeinschaft), die nur durch das Spielen selbst erreichbar sind und durch reine Gewinnorientierung zerstoert werden",
        answerC = "Profisport ist per se unethisch, weil er externe Gueter (Geld) ueber interne Gueter stellt",
        answerD = "Jeder Sportler sollte ausschliesslich intrinsisch motiviert sein, externe Belohnungen seien unethisch",
        correctAnswer = 1,
        explanation = "MacIntyre unterscheidet in 'After Virtue' (1981) zwischen internen Guotern (die nur durch Teilnahme an einer Praxis erreichbar sind, z.B. sportliche Exzellenz) und externen Guotern (Geld, Ruhm). Angewandt auf Sport: Basketball-Exzellenz ist ein internes Gut, das nur durch Spielen erworben wird. Wenn externe Guoter die internen dominieren, korrumpiert dies die Praxis – z.B. wenn Athlet lieber foult als fair zu spielen, um Geld zu gewinnen.",
        difficulty = 3,
        funFact = "W. Morgan und andere Sportphilosophen entwickelten MacIntyres Ansatz weiter zur Grundlage der 'Broad Internalism'-Schule in der Sportethik."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche ethische Position vertreten Befuerworter des 'Enhancement-Sports' (Transhumanismus im Sport)?",
        answerA = "Jegliche technologische oder pharmakologische Verbesserung des menschlichen Koerpers sollte im Sport erlaubt sein, da menschliche Grenzen arbitraer sind",
        answerB = "Nur natuerliche genetische Vorteile sollten erlaubt sein, technologische Verbesserungen sind unethisch",
        answerC = "Sport muss vollstaendig unmodifiziert bleiben, um die Reinheit des menschlichen Wettbewerbs zu bewahren",
        answerD = "Enhancement ist nur dann ethisch, wenn es allen Athleten gleichermassen zugaenglich ist",
        correctAnswer = 0,
        explanation = "Transhumanistische Sportethiker wie Andy Miah argumentieren, dass die Grenzziehung zwischen 'natuerlichen' und 'unnatuerlichen' Verbesserungen arbitraer ist. Hoehentraining, spezielle Ernaehrung, Schlafoptimierung gelten als akzeptabel – warum nicht pharmakologische Mittel? Sie fordern offene 'Enhancement Leagues', in denen Athleten mit allen verfuegbaren Mitteln antreten.",
        difficulty = 3,
        funFact = "Oscar Pistorius' Fall – ein Doppelunterschenkelamputierter mit Karbonfaser-Prothesen – entfachte die philosophische Debatte: Waren seine Prothesen ein Vorteil oder Nachteil? Das CAS entschied 2008 fuer seine Teilnahme an den Olympischen Spielen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was besagt die 'Separateness of Persons'-Kritik (John Rawls) in Bezug auf die Praxis nationaler Sportmannschaften?",
        answerA = "Nationale Sportteams verletzen das Gleichheitsprinzip, da nicht alle Buerger repraesentiert werden",
        answerB = "Sportliche Erfolge einzelner Athleten koennen nicht legitimerweise der gesamten Nation zugeschrieben werden, da jeder Mensch eine eigene separate Person mit eigenen Leistungen ist",
        answerC = "Nationale Teams sollten nach dem Rawls'schen Differenzprinzip zusammengestellt werden, bevorzugt schwaechere Athleten",
        answerD = "Internationaler Sport ist unethisch, da er Nationalismus foerdert, den Rawls als irrational ablehnte",
        correctAnswer = 1,
        explanation = "Rawls' 'Separateness of Persons' (aus 'A Theory of Justice', 1971) besagt, dass Individuen nicht bloss Mittel kollektiver Zwecke sind. Angewandt auf Sport: Wenn ein Sportler eine Goldmedaille gewinnt, hat ER gesiegt – nicht 'Deutschland'. Nationaler Stolz auf fremde Leistungen kann philosophisch problematisch sein, da er die individuelle Autorenschaft der Leistung verschleiert.",
        difficulty = 3,
        funFact = "Bill Morgan entwickelte diese Kritik in 'Leftist Theories of Sport' (1994) und argumentierte, nationaler Sport reproduziere problematische kollektive Identitaeten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter 'Gamesmanship' und wie unterscheidet es sich ethisch von 'Sportsmanship'?",
        answerA = "Gamesmanship und Sportsmanship sind Synonyme fuer faires Spiel",
        answerB = "Gamesmanship bezeichnet die Kunst, innerhalb der Regeln maximale psychologische Vorteile zu suchen (z.B. Stoerung des Gegners), ohne den Geist des Spiels zu respektieren",
        answerC = "Gamesmanship ist nur im Profi-Bereich ethisch vertretbar, Sportsmanship gilt fuer Amateure",
        answerD = "Sportsmanship bezeichnet das Ausnutzen von Regelluecken, Gamesmanship bedeutet Regelkonformitaet",
        correctAnswer = 1,
        explanation = "Stephen Potter praegte 'Gamesmanship' in seinem satirischen Buch 'The Theory and Practice of Gamesmanship' (1947). Es bezeichnet das Bestreben, durch psychologische Tricks, Ablenkung oder Zeitschinderei zu gewinnen – alles formal regelkonform, aber im Widerspruch zum Geist des fairen Wettbewerbs. Sportsmanship hingegen umfasst Respekt vor Gegner, Schiedsrichter und dem Spiel selbst.",
        difficulty = 3,
        funFact = "Potters Buch war urspruenglich satirisch gemeint, wurde aber von Sportpsychologen und Coaches ernsthaft als Taktikhandbuch studiert – ein ungewollter Einfluss auf den Profisport."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches ethische Prinzip liegt dem Konzept des 'Mutually Acceptable Risk' im Kampfsport (Boxen, MMA) zugrunde?",
        answerA = "Das Paternalismuverbot: Erwachsene duerfen riskante Sportarten ausueben, solange sie informiert zustimmen und das Risiko gegenseitig akzeptiert wird",
        answerB = "Kampfsport ist nur dann ethisch, wenn das Verletzungsrisiko unter 1% liegt",
        answerC = "Staatliche Regulierung muss alle Sportarten verbieten, die Hirnverletzungen verursachen koennen",
        answerD = "Kampfsport ist grundsaetzlich unethisch, da er absichtliche Koerperverletzung foerdert",
        correctAnswer = 0,
        explanation = "Das 'Mutually Acceptable Risk'-Prinzip sagt: Wenn beide Kontrahenten als freie Erwachsene informiert zustimmen und das gleiche Risiko eingehen, ist die Aktivitaet ethisch vertretbar – auch wenn sie gefaehrlich ist. Liberale Philosophen wie Joel Feinberg argumentieren, Paternalismus (Schutz des Einzelnen vor sich selbst) sei nicht legitim, wenn keine dritte Partei geschaedigt wird. Gegner halten CTE (chronische Hirnverletzung) als zu hohes Risiko, das durch Zustimmung nicht legitimiert werden kann.",
        difficulty = 3,
        funFact = "Die British Medical Association forderte seit den 1980er Jahren wiederholt ein Boxverbot – bislang ohne Erfolg, da die Debatte zwischen liberalen und paternalistischen Positionen weiter ungeklaert ist."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das philosophische Kernproblem beim Einsatz von KI-Schiedsrichtern im Sport aus ethischer Sicht?",
        answerA = "KI-Schiedsrichter sind zu teuer fuer den Breitensport",
        answerB = "KI-Systeme koennen keine Haftung uebernehmen; bei Fehlentscheidungen ist unklar, wer moralisch verantwortlich ist (Verantwortungsluecke / Responsibility Gap)",
        answerC = "KI-Schiedsrichter bevorzugen statistisch staerkere Mannschaften aufgrund ihrer Trainingsdaten",
        answerD = "Der Einsatz von KI widerspricht dem olympischen Geist der menschlichen Exzellenz",
        correctAnswer = 1,
        explanation = "Der Philosophen Robert Sparrow und andere diskutieren die 'Responsibility Gap' bei autonomen Systemen: Wenn ein KI-Schiedsrichter eine falsche Entscheidung trifft, die das Spielergebnis beeinflusst – wer traegt die moralische Verantwortung? Der Programmierer? Der Sportverband? Die KI selbst (die keine Person ist)? Diese Luecke in der Verantwortungszuschreibung ist ein fundamentales ethisches Problem autonomer Entscheidungssysteme im Sport.",
        difficulty = 3,
        funFact = "Der Hawk-Eye-Ballverfolgung im Tennis und Cricket ist technisch kein 'Schiedsrichter', sondern ein Beweissystem – die endgueltige Entscheidungsgewalt liegt noch beim menschlichen Schiedsrichter, was die Verantwortungsfrage entschaerft."
    ),

    // ── Sportarchitektur & Stadionbau (7) ────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welches revolutionaere Dachkonstruktionsprinzip setzte Frei Otto beim Olympiastadion Muenchen (1972) ein?",
        answerA = "Eine Stahlbetonkuppel nach dem Prinzip geodaetischer Strukturen von Buckminster Fuller",
        answerB = "Ein Haengedach aus seilgestuetzten, acrylglasbespannten Netzkonstruktionen – eines der ersten grossen Seilnetzflaechentragwerke weltweit",
        answerC = "Ein faltbares Retraktionsdach auf Schienensystem, das sich bei Regen schliessen kann",
        answerD = "Eine Drucklufthalle (pneumatische Membran), die durch Ueberdruck stuetzenfrei gehalten wird",
        correctAnswer = 1,
        explanation = "Frei Ottos transparente Seilnetzkonstruktion aus PVC-beschichtetem Acrylglas und Stahlseilen war eine technische Revolution. Das transluzente Dach folgt dem Landschaftsprofil und verbindet Stadion, Sporthalle und Schwimmhalle optisch. Es beeinflusste Generationen von Architekten und gilt als Meilenstein der Leichtbau-Architektur. Das Stadion kostet ca. 137 Millionen DM – das Budget explodierte auf 1,35 Milliarden DM.",
        difficulty = 3,
        funFact = "Frei Otto bekam 2015 posthum den Pritzker-Preis – die hoechste Auszeichnung in der Architektur – er starb wenige Tage vor der offiziellen Bekanntgabe."
    ),

    Question(
        categoryId = 6,
        questionText = "Was macht die Tragkonstruktion des Stade de France (Saint-Denis, 1998) ingenieurtechnisch besonders?",
        answerA = "Ein vollstaendig vergrabenes Untergeschoss mit drei Spielebenen, das maximale Zuschauernaehe ermoeglicht",
        answerB = "Ein freitragendes Ringdach aus Stahlrohren mit einem einzigen umlaufenden Druckring ohne innere Stuetzen – ein Toruschnitt-System",
        answerC = "Eine vollstaendig demontierbare Modularstruktur, die nach der WM 1998 umgebaut wurde",
        answerD = "Ein Dachsystem aus vorgespanntem Beton nach dem Prinzip der katalanischen Ziegelgewoelbe",
        correctAnswer = 1,
        explanation = "Das Dach des Stade de France besteht aus einem 43.000 Tonnen schweren Stahlring mit einem Durchmesser von 310 Metern, der auf nur 18 Pylonen ruht. Der aeussere Druckring und der innere Zugring sind durch Stahlseile verbunden – ein hocheffizientes Tensegrity-artiges System. Das Dach hat eine Spannweite von 67 Metern freitragend ueber den Zuschauern.",
        difficulty = 3,
        funFact = "Fuer den Bau des Stade de France wurden 155.000 Kubikmeter Beton und 20.000 Tonnen Stahl verarbeitet. Der Bau dauerte nur 31 Monate – ein Rekord fuer ein Stadion dieser Groesse."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches akustische Prinzip nutzt das Allianz Arena in Muenchen, um Laerm nach aussen zu reduzieren und gleichzeitig die Atmosphaere innen zu maximieren?",
        answerA = "Vollstaendig geschlossene ETFE-Fassade und nach innen geneigte Dachueberstands-Geometrie, die Schallwellen reflektiert und in der Schuessel haelt",
        answerB = "Aktive Laermunterdrueckungssysteme (Gegenschall) in den Fassadenpaneelen",
        answerC = "Besondere Betonmischungen mit Schallabsorptionspigmenten in Stuehlen und Bodenplatten",
        answerD = "Ein Unterdruck-Tunnelsystem unter dem Spielfeld, das Schallwellen ableitet",
        correctAnswer = 0,
        explanation = "Die Allianz Arena nutzt eine doppelte akustische Strategie: Das komplett geschlossene Stadiondach haelt den Schall im Innenraum, waehrend die nach innen geneigte Geometrie (die Zuschauertribuenen neigen sich zum Spielfeld hin) Schallwellen zurueck Richtung Innenraum reflektiert. Die ETFE-Fassade (Ethylen-Tetrafluorethylen) ist zwar optisch transluzent, wirkt aber als akustische Barriere nach aussen.",
        difficulty = 3,
        funFact = "Die 2874 ETFE-Kissen der Allianz Arena koennen in 16 Millionen Farben beleuchtet werden. Das Stadion kann in den Farben von Bayern Muenchen (rot), TSV 1860 Muenchen (blau) oder dem DFB-Nationalteam (weiss) leuchten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Bird's Nest'-Konzept des Olympiastadions Peking (2008) und welcher Tragwerksmechanismus liegt ihm zugrunde?",
        answerA = "Ein Raeumliches Fachwerk aus unregelmaessig angeordneten Stahltraegern, die sich gegenseitig stuetzen – inspiriert von der Netzstruktur chinesischer Keramikrisse",
        answerB = "Eine traditionelle chinesische Holzverbindungstechnik (Dougong) in Stahl uebersetzt",
        answerC = "Ein freitragendes Schalentragsystem aus vorgespanntem Hochfestigkeitsbeton",
        answerD = "Ein Haengedach an 8 zentralen Pylonen nach dem Vorbild der Pekinger Tempelarchitektur",
        correctAnswer = 0,
        explanation = "Das 'Vogelnest' (Architekt Herzog & de Meuron / Arup-Ingenieure) besteht aus einem labyrinthischen Netzwerk aus 36 Kilometer Stahltraegern mit unregelmaeassigem Rautenmuster. Die Struktur ist ein raeumliches Fachwerk, in dem jeder Traeger durch andere gestuetzt wird – kein Traeger ist allein tragend. Das Muster war urspruenglich von chinesischen Keramikrissen inspiriert. Das Stadion wiegt 42.000 Tonnen Stahl.",
        difficulty = 3,
        funFact = "Ai Weiwei war urspruenglich kuenstlerischer Berater des Projekts, distanzierte sich spaeter oeffentlich davon und nannte es ein 'gefaelschtes Laecheln' der chinesischen Regierung."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Nachhaltigkeitsprinzip zeichnet die Tottenham Hotspur Stadium (2019) aus und macht es architektonisch weltweit einzigartig?",
        answerA = "Ein vollstaendig solarbetriebenes Stadion mit 12.000 Photovoltaik-Paneelen auf dem Dach",
        answerB = "Der erste Retraktions-Hybridrasen der Welt: Ein echtes Naturrasen-Segment, das unter einem synthetischen NFL-Rasen weggezogen werden kann, sodass ein Stadion beide Sportarten beherbergt",
        answerC = "Ein Grasdach mit 4 Hektar Bewuchs, der das Stadion thermoreguliert und CO2 bindet",
        answerD = "Vollstaendig aus rezyklierten Schiffsstahl-Traegern gebaut, ohne Neustahlproduktion",
        correctAnswer = 1,
        explanation = "Das Tottenham Hotspur Stadium besitzt das weltweit erste und bislang einzige aufteilbare Hybridrasen-System: Der Naturrasen (fuer Premier-League-Spiele) besteht aus drei grossen Segmenten, die auf Schienen unter die Nordtribuene gefahren werden. Dann liegt ein synthetischer Kunstrasen frei, der fuer NFL-Spiele (American Football) genutzt wird. Dieses System ermoeglicht beiden Sportarten optimale Spielbedingungen.",
        difficulty = 3,
        funFact = "Die NFL hat eine langfristige Partnerschaft mit Tottenham und nutzt das Stadion regelmaessig fuer Regular-Season-Spiele in London – das Tottenham-Stadion ist damit quasi das 'Zuhause' der NFL in Europa."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das besondere an der Tragkonstruktion des Luzhniki-Stadions in Moskau, das fuer die WM 2018 renoviert wurde?",
        answerA = "Die originale Sowjet-Stahlbeton-Stufenstruktur von 1956 wurde erhalten und mit einem neuen auskragenden Dach kombiniert, das die historische Fassade vollstaendig umschliesse",
        answerB = "Das Stadion wurde vollstaendig abgerissen und als Betonschale-Neubau errichtet, der aeusserlich die Sowjet-Optik imitiert",
        answerC = "Die originale Traegerkonstruktion wurde mit Carbon-Fiber-Verbundwerkstoffen verstaerkt, um seismische Belastungen zu kompensieren",
        answerD = "Das Dach wurde als selbsttragende Membranstruktur aus PTFE-Gewebe hinzugefuegt, getragen von Erdanker-Kabeln",
        correctAnswer = 0,
        explanation = "Beim Umbau des Luzhniki-Stadions (urspruenglich 1956 erbaut) bestand die groesste Herausforderung darin, die sowjetische Kolonnaden-Fassade (unter Denkmalschutz) zu erhalten, waehrend das Innere vollstaendig modernisiert wurde. Die Ingenieure entfernten das Innenfeld, senkten das Spielfeld ab und bauten neue Tribuenestufen – alles waehrend die historische Aussenhuelle stehen blieb. Das neue auskragende Dach wurde darunter konstruiert.",
        difficulty = 3,
        funFact = "Das Luzhniki-Stadion fasste in seiner urspruenglichen Form 103.000 Zuschauer – es war das groesste Stadion Europas bis in die 1990er Jahre."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche akustischen und thermischen Herausforderungen entstehen beim Bau von Retraktionsdaechern (Klappda) in Grossstadien?",
        answerA = "Retraktionsdaecher sind akustisch neutral und haben keinen Einfluss auf die Thermik im Stadion",
        answerB = "Wenn das Dach geschlossen wird, steigt der Innenlärm durch Echos drastisch an; zudem staut sich Waerme, da natuerliche Luftzirkulation unterbunden wird – beides erfordert spezielle akustische Absorber und aktive Klimatisierung",
        answerC = "Retraktionsdaecher verbessern immer die Akustik, da sie Schall zurueck zum Spielfeld reflektieren",
        answerD = "Der einzige Nachteil ist das Gewicht, das die Fundamentierung erhoeht – akustisch und thermisch sind sie problemlos",
        correctAnswer = 1,
        explanation = "Retraktionsdaecher schaffen ein geschlossenes Volumen, in dem Laerm-Reflexionen zunehmen koennen. Das Vancouver BC Place (Umbau 2011) und andere Stadien mussten akustische Absorber (spezielle Panels an Dach und Tribueenen) nachruesten. Gleichzeitig steigen Temperaturen rapide bei Sonneneinstrahlung auf ein geschlossenes Dach. Das AT&T Stadium in Dallas (2009) nutzt eines der maechtigsten Klimatisierungssysteme der Welt (69.000 Tonnen Kuehlkapazitaet), um das Problem zu bewaeltigen.",
        difficulty = 3,
        funFact = "Das AT&T Stadium in Arlington verbraucht so viel Energie wie eine Kleinstadt. Allein die Klimaanlage verbraucht an Spieltagen mehr Strom als 10.000 Haushalte."
    ),

    // ── Sportjournalismus (7) ──────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welcher Journalist und welcher Artikel gelten als Geburtsmoment des modernen US-amerikanischen Sportjournalismus?",
        answerA = "Damon Runyon, 'The Manassa Mauler' (1919) ueber Jack Dempsey – der erste Boxer-Artikel mit literarischen Anspruch",
        answerB = "Grantland Rice, 'Outlined against a Blue-Gray October Sky' (1924) ueber Notre-Dame – der erste Sportartikel, der explizit mit literarischen Mitteln arbeitete",
        answerC = "Red Smith, 'Turning Lead to Gold' (1943) – der erste analytische Sportkommentar in der New York Times",
        answerD = "Heywood Broun, 'Baseball at its Best' (1921) – die erste Sportkolumne mit gesellschaftlicher Kritik",
        correctAnswer = 1,
        explanation = "Grantland Rices beruehmt-mythologischer Spielbericht ueber das Notre-Dame-Army-Spiel vom 18. Oktober 1924 ('Outlined against a blue-gray October sky the Four Horsemen rode again...') gilt als Wendepunkt im Sportjournalismus. Rice machte die vier Notre-Dame-Running-Backs zu legendaeren 'Vier Reitern der Apokalypse' – ein Stilmittel, das Sportberichterstattung von nuechterner Faktenvermittlung zu narrativem Storytelling transzendierte.",
        difficulty = 3,
        funFact = "Der Notre-Dame-Publicity-Mann George Strickler verstand die Metapher sofort und inszenierte ein Pressefoto der vier Spieler auf Pferden – das Foto verbreitete sich landesweit und machte die 'Vier Reiter' zur Legende."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter 'Gonzo Sports Journalism' und durch welchen Autor wurde es gepraegte?",
        answerA = "Eine objektive, datenbasierte Analysemethode im Sportjournalismus, gepraegte von Nate Silver",
        answerB = "Ein subjektiver, ichbezogener Reportagestil, bei dem der Journalist selbst Teil des Geschehens wird und seine Erfahrungen ungefiltert berichtet – gepraegte von Hunter S. Thompson",
        answerC = "Ein Investigativjournalismus-Stil, der Insider-Informationen aus dem Sport durch verdeckte Recherche beschafft",
        answerD = "Die erste Radiosportreportage live vom Spielfeld, initiiert von CBS in den 1930er Jahren",
        correctAnswer = 1,
        explanation = "Hunter S. Thompson praeegte den 'Gonzo'-Stil mit Werken wie 'Fear and Loathing at the Super Bowl' (1973). Statt neutraler Berichterstattung platzierte sich Thompson als Protagonist: seine eigenen Reaktionen, Erfahrungen und Psyche wurden Teil des Textes. Das Ich des Reporters ist untrennbar vom Gegenstand. Thompsons Sport-Essays erschienen hauptsaechlich im Rolling Stone und beeinflussten eine Generation von Sportautoren.",
        difficulty = 3,
        funFact = "Thompson liebte Fussball (American Football) leidenschaftlich. Sein Freund Muhammad Ali liess Thompson regelmaessig zu exklusiven Trainingslagern – Thompson schrieb ueber Ali mit einer Mischung aus Bewunderung und existentialistischem Schwindel."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Rooney Rule' der NFL und welchen Einfluss hatte sie auf den Sportjournalismus?",
        answerA = "Eine Pflicht fuer NFL-Klubs, bei der Head-Coach-Suche mindestens einen Kandidaten aus einer unterrepraesentierten Minderheit zu interviewen – sie wurde von Journalisten initiiert und durch deren Berichterstattung durchgesetzt",
        answerB = "Ein NFL-Regelwerk ueber Bildrechte, das Sportjournalisten den Zugang zu Spielerinterviews beschraenkt",
        answerC = "Eine Quote fuer afroamerikanische Sportjournalisten in akkreditierten Medien bei NFL-Spielen",
        answerD = "Ein Fairplay-Regelwerk fuer Berichterstattung, das diffamierende Schlagzeilen ueber Spieler verbietet",
        correctAnswer = 0,
        explanation = "Die Rooney Rule (benannt nach Steelers-Eigentueaer Dan Rooney, einfuehrt 2003) verlangt, dass NFL-Teams bei der Suche nach Head Coaches und General Managers mindestens ein Vorstellungsgespraech mit einem Kandidaten aus einer Minderheit fuehren. Investigativjournalisten – vor allem Johnnie L. Roberts vom Newsweek – spielten eine Schluesselrolle dabei, die Unterrepraesentation schwarzer Coaches in der NFL zu dokumentieren und oeffentlichen Druck aufzubauen, der zur Regelung fuehrte.",
        difficulty = 3,
        funFact = "Trotz der Rooney Rule ist der Anteil schwarzer Head Coaches in der NFL historisch gesehen niedrig geblieben – was Journalisten dazu veranlasst hat, die Wirksamkeit der Regel kritisch zu hinterfragen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Technologie veraenderte den Sportjournalismus durch das Aufkommen sozialer Medien am staerksten und was ist das 'First Touch Dilemma'?",
        answerA = "Live-Streaming-Apps wie Periscope: Das Dilemma, ob Journalisten exklusive Livestreams mit oder ohne offizielle Akkreditierung verbreiten duerfen",
        answerB = "Twitter/X als Echtzeit-Nachrichtenkanal: Das Dilemma zwischen Schnelligkeit (erster Bericht) und Verifikation (korrekte Information) – Fehlinformationen verbreiten sich schneller als Korrekturen",
        answerC = "Instagram-Stories: Die Frage, ob Fotos aus dem Umkleideraum ethisch vertretbar sind, wenn Spieler selbst sie posten",
        answerD = "TikTok: Das Dilemma zwischen kurzen, viralen Clips und der journalistischen Pflicht zur tiefgreifenden Analyse",
        correctAnswer = 1,
        explanation = "Das 'First Touch Dilemma' beschreibt die Spannung in der Twitter-Aera zwischen dem Druck, als Erstes zu berichten, und dem journalistischen Gebot der Verifikation. Beim Boston-Marathon-Attentat 2013 oder bei Spieler-Verletzungen wurden wiederholt falsche Meldungen viral, bevor sie korrigiert wurden. Serioeser Sportjournalismus muss zwischen Echtzeitgeschwindigkeit und Faktenchecks navigieren.",
        difficulty = 3,
        funFact = "ESPN-Reporterin Hazel Irvine und andere argumentierten, Twitter habe den 'Scoop' (exklusive Erstmeldung) als zentrales journalistisches Gut faktisch demokratisiert und damit traditionelle Sportredaktionen strukturell bedroht."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Sports Analytics Journalism' (auch 'StatsBomb-Journalismus') und wie veraenderte es die Berichterstattung?",
        answerA = "Die Praxis, Spielerinterviews mit quantitativen Kennzahlen zu verbinden – entwickelt von ESPN StatsLLC in den 1990ern",
        answerB = "Ein Journalismusstil, der fortgeschrittene statistische Metriken (xG, VAEP, Pressing-Intensitaet) benutzt, um taktische und leistungsbezogene Narrative zu ersetzen oder zu bereichern – ausgeloest durch Sabermetrics im Baseball",
        answerC = "Automatisierter Datenjournalismus, bei dem Algorithmen Spielberichte ohne menschliche Autoren schreiben",
        answerD = "Eine Investigativmethode, die Sportwettbetrug durch Auffaelligkeiten in statistischen Mustern aufdeckt",
        correctAnswer = 1,
        explanation = "Baseball-Sabermetrics (Billy Beane / Michael Lewis 'Moneyball', 2003) loeste eine Revolution im Sportdatenjournalismus aus. Heute analysiert Outlets wie The Athletic, FiveThirtyEight (gegruendet von Nate Silver) oder The Ringer taktische Systeme mit xG (Expected Goals), Expected Assists, Ball-Recovery-Intensitaet. Journalisten wie Michael Caley (Guardian) oder Ted Knutson (StatsBomb) schufen neue analytische Narrative jenseits von Toren und Assists.",
        difficulty = 3,
        funFact = "Der Begriff 'Moneyball' ist so einflussreich geworden, dass 'Moneyball-Ansatz' in fast allen Teamsportarten (Basketball, Hockey, Fussball) als Synonym fuer datengetriebene Entscheidungsfindung gilt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche rechtliche Besonderheit gilt in Deutschland fuer die Pressefreiheit im Sport und welches Grundsatzurteil definiert die Grenzen?",
        answerA = "Das BGH-Urteil 'Doping im Sport' (1991) erklaert Verdachtsberichterstattung ueber Doping grundsaetzlich als unzulaessig ohne nachgewiesene Beweise",
        answerB = "Das BVerfG-Urteil 'Lebach' (1973) und spaeaetere BGH-Urteile stellen klar, dass Persoenlichkeitsrecht von Sportlern und Pressefreiheit abzuwaegen sind – Echtnamensberichterstattung ist erlaubt, stigmatisierende Wiederholung nach Suehneleistung nicht",
        answerC = "Ein EU-Recht verbietet die Berichterstattung ueber nationale Sportligen ohne Lizenz des jeweiligen Verbandes",
        answerD = "Das DFL-Hausrecht erlaubt es Bundesligaklubs, einzelne Journalisten dauerhaft von Spielen auszusperren – ein Recht, das keiner gerichtlichen Ueberpruefung unterliegt",
        correctAnswer = 1,
        explanation = "Das BVerfG-Urteil 'Lebach' (1973) – obwohl kein Sportfall – etablierte das Prinzip, dass Persoenlichkeitsrecht und Pressefreiheit gegeneinander abzuwaegen sind, und dass das Persoenlichkeitsrecht nach Verbuessung einer Strafe staerker wiegt (zeitliche Dimension). Im Sport wird dies auf rehabilitierte Athleten (Dopingsperre abgegessen, Wettskandale) angewendet. Sportjournalisten muessen zwischen legitimer Oeffentlichkeitsinformation und persoenlichkeitsrechtsverletzender Stigmatisierung unterscheiden.",
        difficulty = 3,
        funFact = "Der Lebach-Fall betraf einen Moerder, nicht einen Sportler – sein Einfluss auf den Sportjournalismus entstand durch analoge Anwendung des Abwaegungsprinzips in Medienrechtsfaellen, die Sportler betrafen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die journalistische Ethik hinter dem Konzept des 'Source Protection' im Sportjournalismus, und welchen Konflikt loest es aus?",
        answerA = "Journalisten duerfen Quellen immer nennen, wenn eine Straftat im Sport aufgedeckt wurde – Quellenfreiheit gilt nur bei Zivilsachen",
        answerB = "Journalisten sind ethisch und teils rechtlich verpflichtet, vertrauliche Quellen zu schuetzen, was in Konflikt mit staatlichem Interesse an Aufklaerung von Sportbetrug oder Doping geraet – Quellenfreiheit vs. Wahrheitspflicht der Justiz",
        answerC = "Source Protection bedeutet, dass Sportjournalisten keine Quellen aus dem Vereinsumfeld nutzen duerfen, um Interessenkonflikte zu vermeiden",
        answerD = "Quellenfreiheit im Sport gilt nur fuer oeffentlich-rechtliche Medien, nicht fuer private Verlage",
        correctAnswer = 1,
        explanation = "Quellenfreiheit (Art. 5 GG, § 53 StPO, pressefreiheits-relevante Zeugnisverweigerungsrechte) schuetzt Journalisten davor, ihre Informanten offenbaren zu muessen. Im Sportjournalismus entsteht ein Spannungsfeld: Ein Whistleblower ueber Spielabsprachen gibt einem Journalisten exklusive Informationen – ermittelt die Staatsanwaltschaft, kann sie verlangen, dass der Journalist seine Quelle nennt. Der Journalist muss dies verweigern, auch auf Kosten der eigenen Strafverfolgung (Konflikt mit Justizinteresse).",
        difficulty = 3,
        funFact = "Im FIFA-Korruptionsskandal 2015 arbeiteten Journalisten des Sunday Times und BBC-Panorama jahrelang mit anonymen Quellen – deren Schutz war entscheidend dafuer, dass ueberhaupt Informationen an die Oeffentlichkeit gelangten."
    ),

    // ── Sport und Technologie (7) ─────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie funktioniert das 'Hawk-Eye'-System im Tennis und welche Fehlertoleranz hat es offiziell?",
        answerA = "Ein GPS-basiertes System, das den Ball via Satellit verfolgt und Positionen mit einer Genauigkeit von ±2 mm berechnet",
        answerB = "Mehrere hochaufloeaende Kameras triangulieren die Ballposition aus verschiedenen Winkeln; die offizielle Fehlertoleranz betraegt durchschnittlich 3,6 mm",
        answerC = "Radarsensoren in der Netzanlage messen Ballflugbahn und Aufprall mit einer Toleranz von ±1 mm",
        answerD = "Ein Lasersensor-Netz aus 48 Detektoren, die den Ball beruehrungslos verfolgen, mit Nulltoleranz",
        correctAnswer = 1,
        explanation = "Hawk-Eye nutzt typischerweise 6-10 hochaufloeaende Kameras (4K+) mit sehr hoher Bildwiederholrate. Die Software rekonstruiert die dreidimensionale Ballbahn durch Triangulation. Die vom System selbst angegebene durchschnittliche Fehlertoleranz betraegt 3,6 mm (offiziell akzeptiert durch die ITF). Kritiker weisen darauf hin, dass 3,6 mm bei Linienfragen entscheidend sein kann – besonders auf Sand, wo der physische Abdruck oft anders aussieht als das Hawk-Eye-Ergebnis.",
        difficulty = 3,
        funFact = "Hawk-Eye wurde urspruenglich fuer den Cricket-Einsatz (Leg Before Wicket-Entscheidungen) entwickelt und spaeter fuer Tennis adaptiert. Es wird heute in Fussball (Goal-Line-Technology) und American Football eingesetzt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Wearable Technology' im Profi-Fussball und welche Daten liefert ein GPS-Leistungstracker wie Catapult oder STATSports?",
        answerA = "Herzfrequenz-Monitore, die nur Herzschlag und Kalorienverbrauch messen",
        answerB = "In Leibchen integrierte GPS-Module, die Sprintgeschwindigkeit, Gesamtlaufleistung, High-Intensity-Runs (>25 km/h), Beschleunigungen, Dezelerationen, Sprungbelaastungen und metabolische Leistung in Echtzeit tracken",
        answerC = "Schuhsensoren, die Ballkontakte, Pass-Kraft und Schussgeschwindigkeit messen",
        answerD = "Hautpflaster mit biometrischen Sensoren fuer Cortisol-, Laktat- und Glucosewerte waehrend des Spiels",
        correctAnswer = 1,
        explanation = "Systeme wie Catapult, STATSports oder Kinexon nutzen GPS+Inertialsensoren (Accelerometer, Gyroskope), um vollstaendige Bewegungsprofile zu erstellen. Wichtige KPIs: Total Distance, High-Intensity Distance (>21 km/h), Sprints (>25 km/h), max. Beschleunigung (m/s²), Spielerbelastung (PlayerLoad). Diese Daten steuern Trainingssteuerung und Erholungsmanagement. Die FIFA erlaubt Wearables im Spielbetrieb seit 2015 unter Auflagen.",
        difficulty = 3,
        funFact = "Laut STATSports legt ein Bundesliga-Mittelfeldspieler im Schnitt 12-13 km pro Spiel zurueck, davon ca. 1-2 km in hochintensiven Laeufen. Aussenverteidiger laufen sogar mehr als Stuermer."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie veraenderte die Einfuehrung des 'Instant Replay' (Videobeweis) die Spielleitung im American Football und was ist das 'indisputable visual evidence'-Standard?",
        answerA = "Alle Spielentscheidungen koennen per Video revidiert werden; der Standard verlangt eine einfache Mehrheitsentscheidung des Review-Komitees",
        answerB = "Nur bestimmte Spielsituationen sind ueberprufbar; eine Entscheidung wird nur dann geaendert, wenn die Videobeweise die Fehlentscheidung eindeutig und unzweifelhaft belegen – ein bewusst hoher Standard, der den Schiedsrichter als primaere Entscheidungsinstanz beibehalt",
        answerC = "Alle Entscheidungen werden automatisch per KI ueberprueft; der Schiedsrichter auf dem Feld hat nur noch eine Beratungsfunktion",
        answerD = "Instant Replay gilt nur fuer Touchdowns und Interceptions; alle anderen Entscheidungen bleiben endgueltig",
        correctAnswer = 1,
        explanation = "Die NFL-Regel besagt, dass ein Call nur dann durch Replay geaendert wird, wenn es 'indisputable visual evidence' – eindeutigen, unzweifelhaften Videobeweis – gibt. Dieser Standard schuetzt den Schiedsrichter auf dem Feld als primaere Entscheidungsinstanz und vermeidet, dass jede knappe Entscheidung revidiert wird. Die 'Challenge'-Systematik (Coaches koennen bestimmte Calls anfechten) und das Booth-Review-System (automatisch bei Touchdowns) sind unterschiedliche Mechanismen.",
        difficulty = 3,
        funFact = "Das erste NFL-Instant-Replay-System wurde 1986 eingefuehrt, 1992 abgeschafft und 1999 als permanentes System wieder eingefuehrt. Heute nutzt die NFL einen zentralen Review-Hub in New York fuer alle Spiele gleichzeitig."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Biomechanik-Analyse im Hochleistungssport' und welche Methode nutzen Biomechaniker zur 3D-Bewegungsanalyse?",
        answerA = "Videoanalyse aus zwei Kameraperspektiven mit manueller Winkelausmessung durch Experten",
        answerB = "Motion-Capture-Systeme mit reflektiven Markern an Koerpergelenken, die von Infrarotkameras verfolgt werden und 3D-Koordinaten des gesamten Bewegungsapparats in bis zu 200 Hz Abtastrate liefern",
        answerC = "KI-gesteuerte Einzelkamera-Analyse, die Gelenk-Winkel aus 2D-Videomaterial berechnet",
        answerD = "Elektrische Muskelstimulation mit Biosensoren, die Muskelaktivierungsmuster waehrend der Bewegung aufzeichnen",
        correctAnswer = 1,
        explanation = "Professionelle Biomechanik-Labore verwenden Marker-basierte Motion-Capture-Systeme (Vicon, Qualisys, OptiTrack). Reflektive Marker werden an Knochenlandmarken (Schulter, Ellenbogen, Handgelenk, Hueft, Knie, Sprunggelenk) befestigt. Infrarotkameras (8-32 Kameras) nehmen die Marker-Positionen mit 100-500 Hz auf. Aus 3D-Koordinaten werden Gelenk-Winkel, Drehmomente und Krafte berechnet (inverse Dynamik mit Kraftmessplattformen).",
        difficulty = 3,
        funFact = "Roger Federers Aufschlag wurde mehrfach biomechanisch analysiert – seine aussergewoehnliche Schulterrotation und Handgelenkflexion ermoglichen einen Aufschlag mit geringerem Stressmauster als bei anderen ATP-Spielern, was seine Langlebigkeit erklaert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Expected Goals (xG)'-Metrik im Fussball und welche Variablen fliesaen in ein modernes xG-Modell ein?",
        answerA = "xG misst nur den Abstand zum Tor; je naeher, desto hoeher der xG-Wert",
        answerB = "xG ist die statistische Wahrscheinlichkeit, dass ein Torschuss ein Tor erzielt, basierend auf Schussposition, Winkel, Schusstyp, Vorangegangene Aktion, Abwehrspieler-Positionen und manchmal Torwartposition",
        answerC = "xG misst die Torchancenqualitaet ausschliesslich basierend auf historischen Trefferprozenten des schiessenden Spielers",
        answerD = "xG ist der erwartete Tabellenplatz eines Teams basierend auf seinen erzeugten Torchancen",
        correctAnswer = 1,
        explanation = "Moderne xG-Modelle (StatsBomb, Opta, Wyscout) beruecksichtigen: Schussposition (x/y-Koordinaten), Winkel zum Tor, Distanz, Schussart (Fuss links/rechts, Kopf, Volley), Assist-Typ (Flanke, Durchstecker, Dribbling), Spielsituation (offener Angriff, Standard, Konter), Anzahl Verteidiger zwischen Schuss und Tor, teils Torwart-Position. Summe aller xG-Werte eines Spiels = expected Tore. Ueberperformance/Underperformance zeigt Glueck oder Effizienz.",
        difficulty = 3,
        funFact = "Der erste xG-Algorithmus wurde von Sam Green entwickelt und 2012 oeffentlich beschrieben. Heute produzieren Firmen wie StatsBomb 'open source xG-Modelle' und fuehren eine Revolution in der Fussball-Analyse an."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie funktioniert die 'Drag Force'-Reduktion (DRS) in der Formel 1 und welche aerodynamischen Prinzipien liegen zugrunde?",
        answerA = "DRS erhoeht den Anpressdruck durch Vergroesserung der Fluegelflasche, was mehr Traktionsgrip auf geraden Strecken erzeugt",
        answerB = "DRS erlaubt das Oeffnen eines verstellbaren Elements am Heckfluegel, das den Anstellwinkel reduziert, Luftwiderstand senkt und Endgeschwindigkeit auf Geraden um ca. 10-15 km/h erhoeht, auf Kosten des Abtriebs",
        answerC = "DRS aktiviert eine Bodeneffektduese unter dem Fahrzeug, die eine Luftkissenwirkung erzeugt und Rollwiderstand eliminiert",
        answerD = "DRS leitet Abgasstroeme durch spezielle Kanaele in den Diffusor, was den Abtrieb bei hoehen Geschwindigkeiten um 15% erhoeht",
        correctAnswer = 1,
        explanation = "DRS (Drag Reduction System) erlaubt seit 2011 das Oeffnen einer verstellbaren Klappe am Oberelement des Heckfluegels in bestimmten Zonenbereichen (wenn der Abstand zum Vorausfahrenden <1 Sekunde ist). Der Heckfluegelanstellwinkel sinkt von ca. 12-15° auf nahezu 0°, was den Luftwiderstand erheblich reduziert. Auf langen Geraden bedeutet das 10-15 km/h Mehrgeschwindigkeit, auf Kosten des Abtriebs (durch den Verlust an Fluegel-Downforce).",
        difficulty = 3,
        funFact = "DRS wurde eingefuehrt, um Ueberholmanover zu erleichtern, die durch zunehmende aerodynamische Abhaengigkeit der Fahrzeuge voneinander erschwert worden waren. Kritiker sehen es als kunstliche Ueberholhilfe, die echtes Racing untergraebt."
    ),

    // ── Tauchen & Unterwassersport (7) ────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Boyle'sche Gesetz' und wie beeinflusst es den Sporttaucher beim Auf- und Abstieg?",
        answerA = "Das Gesetz besagt, dass Gasvolumen proportional zur Temperatur zunimmt – Taucher muessen daher bei kaltem Wasser laangere Dekompressionspausen einhalten",
        answerB = "Bei konstanter Temperatur ist das Volumen eines Gases umgekehrt proportional zum Druck – beim Abtauchen komprimiert sich Luft in Lungen und Ausruestung; beim Auftauchen expandiert sie und kann zu Lungenueberdehnungsverletzungen fuehren",
        answerC = "Das Gesetz beschreibt die Loeslichkeit von Stickstoff in Blut unter Druck – Grundlage der Dekompressionskrankheit",
        answerD = "Boyles Gesetz gilt nur fuer ideale Gase bei Temperaturen ueber 0°C und ist im Tauchen praktisch irrelevant",
        correctAnswer = 1,
        explanation = "Boyles Gesetz (p × V = konstant bei konstanter Temperatur): In 10 m Tiefe (2 bar absolut) ist das Gasvolumen halb so gross wie an der Oberflaeche. Praektisch: Wer in 20 m Tiefe mit vollen Lungen taucht und beim Auftauchen die Luft anhaelt, riskiert eine Lungenueberdehnungsverletzung (Barotrauma) – die expandierende Luft kann Alveolen zerreissen. Die Grundregel lautet: 'Immer weiteratmen beim Auftauchen, nie die Luft anhalten.'",
        difficulty = 3,
        funFact = "Selbst Freitaucher (Apnoetaucher) ohne Pressluftflasche unterliegen dem Boyle'schen Gesetz: Ihre Lungen komprimieren sich beim Abtauchen erheblich. Weltrekordjagdtaucher wie Herbert Nitsch tauchten auf bis zu 253 m – dort sind die Lungen auf ein Bruchteil ihres normalen Volumens komprimiert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Dekompressionskrankheit' (DCS) im Tauchen und welche physiologischen Vorgaenge liegen ihr zugrunde?",
        answerA = "Eine Erkaeltung durch das kalte Wasser, die Muskeln und Gelenke verkrampft – Behandlung: Waerme und Ruhe",
        answerB = "Beim Tauchen unter Druck loest sich mehr Stickstoff im Blut und Gewebe (Dalton/Henry-Gesetz); steigt der Taucher zu schnell auf, bilden sich Stickstoffblasen in Gewebe und Blutbahn, die Schmerzen, Laehmungen oder Tod verursachen koennen",
        answerC = "Sauerstofftoxizitaet durch zu hohe O2-Partialdrucke in der Atemluft bei grossen Tiefen",
        answerD = "Hypo-thermie-induzierte Herzrhythmusstoeruungen durch ploetzliches Auftauchen in kaelterem Wasser",
        correctAnswer = 1,
        explanation = "Unter erhoehtem Druck (Tauchen) loest sich Stickstoff nach Henry-Gesetz verstaerkt in Koerperfluessigkeiten. Bei zu schnellem Auftauchen entgast der Stickstoff schneller, als das Blut ihn transportieren kann – es entstehen Blasen (wie beim Oeffnen einer Sprudelflasche). Diese Blasen blockieren Blutgefaesse, reizen Nerven und koennen Gewebe zerstoeren. Behandlung: Druckkammer-Rekompressions-Therapie. Praevention: Einhaltung von Dekompressionsstops und Aufstiegsgeschwindigkeit.",
        difficulty = 3,
        funFact = "Die Dekompressionskrankheit wurde erstmals 1841 bei Caissonarbeitern (Tunnelbauer unter Luftdruck) beschrieben, weshalb sie auch 'Caissonkrankheit' heisst. Taucher nannten sie spaeter 'the bends', weil Betroffene sich vor Schmerzen kruemmten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was unterscheidet 'technisches Tauchen' (Tech Diving) vom Recreational Diving und welche spezifischen Risiken entstehen?",
        answerA = "Technisches Tauchen ist einfach das Tauchen mit besserer Ausruestung; Risiken sind identisch mit Freizeittauchen",
        answerB = "Tech Diving umfasst Tiefen jenseits von 40 m, Deko-Verpflichtungen (keine direkte Aufstiegmoeglichkeit), Gasmischungen wie Trimix, Nitrox oder Heliox, Mehrflaschensysteme – Risiken: Stickstoffnarkose, O2-Toxizitaet, komplexe Deko-Planung und geringere Fehlertoleranz",
        answerC = "Technisches Tauchen bedeutet ausschliesslich das Tauchen in Hoehlen und Wracks ohne offene Wasseroberflaeohe ueber sich",
        answerD = "Tech Diving verwendet nur Rebreather (Kreislaufgeraete) statt offener Kreislaufsysteme – alle anderen Parameter sind identisch mit Freizeittauchen",
        correctAnswer = 1,
        explanation = "Tech Diving (jenseits der PADI Open Water Limits: 40 m, keine Deko) erfordert spezialisierte Ausbildung. Kernpunkte: 1) Tiefen >40 m bis 300+ m moeglich; 2) Deko-Verpflichtung (der Taucher muss in bestimmten Tiefen stoppen, kann nicht direkt auftauchen); 3) Spezialgasmischungen (Heliox/Trimix gegen Stickstoffnarkose, Nitrox fuer Deko-Effizienz); 4) Twin-Tanks und Stage-Bottles als Redundanz; 5) Umgebungen ohne direkte Fluchtmoeglichkeit (Hoehlen, Wracks).",
        difficulty = 3,
        funFact = "Herbert Nitschs Weltrekord-Tauchen (253 m, No-Limit-Freediving) fuehrte zu einem schweren DCS, der ihn fuer Monate lahmlegte – selbst Freitaucher auf Extremtiefen sind gefaehrdet."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Freediving' (Apnoetauchen) und welche physiologischen Adaptationen ermoeglichten Herbert Nitsch einen Weltrekord von 253 m?",
        answerA = "Tauchsport nur mit sehr langer Sauerstoffflasche, die das Tauchen bis 253 m erlaubt",
        answerB = "Tauchen nur mit angehaltener Luft ohne Druckluftgeraet; Adaptationen: Bradykardie (Herzfrequenzreduktion auf 20 Schlaege/min), periphere Vasokonstriktion, Blutverlagerung in Rumpf-Organe (Blood Shift), Milzkontrakation als Sauerstoffreservoir",
        answerC = "Tauchen mit reinem Sauerstoff statt Druckluft fuer maximale Effizienz bei extremen Tiefen",
        answerD = "Eine spezielle Atemtechnik (Hypoventilation) vor dem Tauchgang, die CO2 minimiert und das Tauchen bis zu 50 Minuten ermoeglicht",
        correctAnswer = 1,
        explanation = "Beim Apnoetauchen aktiviert der 'Diving Reflex': Herzfrequenz sinkt auf 20-30 Schlaege/min (Bradykardie), periphere Blutgefaesse ziehen sich zusammen (Vasokonstriktion), Blut zentralisiert sich in lebenswichtige Organe. Der Blood Shift fuellt Lungenarterien und Venen mit Blut, um die komprimierenden Lungenraeume zu fuellen und Barotrauma zu verhindern. Die Milz kontrahiert und entlaesst sauerstoffreiche Erythrozyten ins Blut. Diese Adaptationen erlauben Nitsch Tauchgaenge bis 253 m (No-Limits, mit Schlitten und Auftriebskoerper).",
        difficulty = 3,
        funFact = "Manche erfahrene Freitaucher entwickeln Milzen, die doppelt so gross sind wie bei Nichttauchern – sie speichern mehr Sauerstoff. Badjao-Meeresvolk auf den Philippinen haben genetisch vergroesserte Milzen und koennen laenger abtauchen als andere Menschen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was sind die Wettkampfdisziplinen beim Freediving-Weltverband AIDA und wie funktioniert 'Constant Weight' (CWT)?",
        answerA = "Die einzige AIDA-Disziplin ist das Tieftauchen mit Flossen; alle anderen Disziplinen gehoeren zur CMAS",
        answerB = "CWT ist eine AIDA-Disziplin, bei der der Athlet nur mit eigener Muskelkraft (Monoflosse oder Beine) auf- und abtaucht, ohne Zusatzgewicht zu veraendern – weitere Disziplinen sind Static Apnea (Zeitrekord), Dynamic (Beckenlange), Free Immersion (am Seil ohne Flossen)",
        answerC = "CWT bedeutet, ein konstantes Gewicht (Bleigewicht) waehrend des gesamten Wettkampfs zu tragen; der Athlet kann weder Gewicht ablegen noch hinzufuegen",
        answerD = "CWT ist nur fuer Frauen eine eigenstaendige Disziplin; Maenner tauchten frueherer in No-Limits und Variable Weight",
        correctAnswer = 1,
        explanation = "AIDA (Association Internationale pour le Developpement de l'Apnee) reguliert 8 Disziplinen. CWT (Constant Weight): Athlet taucht mit konstant bleibendem Gewicht ab und auf, nutzt Flossen (Bifins oder Monofin) oder kein Equipment ausser Wetsuit. Nur Muskeln – kein Seil zum Ziehen. Weltrekord Maenner: Alexey Molchanov (134 m, 2023). Static Apnea: Gesicht im Wasser, Atemstillstand Zeit messen (Rekord: 24:33 min). Dynamic Apnea: Beckenlange (246 m Rekord).",
        difficulty = 3,
        funFact = "Natalia Molchanova, Mutter von Alexey, dominierte den Frauenfreediving ueber 15 Jahre mit 41 Weltrekorden. Sie verschwand 2015 beim Freizeittauchen spurlos – ihr Koerper wurde nie gefunden."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Unterwasser-Rugby' (UWR) und welche Regel macht es taktisch einzigartig im Vergleich zu Landrugby?",
        answerA = "Eine Landrugby-Variante in einem flachen Schwimmbecken, bei der alle anderen Regeln unveraendert bleiben",
        answerB = "Eine 3D-Unterwassersportart, bei der 2 Teams von je 6 aktiven Spielern einen salzwassergefuellten Ball in einen am Beckenboden befestigten Korb des Gegners einbringen muessen – Spielfeld ist der gesamte dreidimensionale Wasserraum",
        answerC = "Rugby-Variante, die vollstaendig unter Wasser auf dem Beckenboden gespielt wird, wobei Taucher den Boden nicht verlassen duerfen",
        answerD = "Eine Synchronschwimm-Variante, bei der Teams choreographierte Rugbypassfolgen unter Wasser vorTun und Punkte fuer Stilausfuehrung erhalten",
        correctAnswer = 1,
        explanation = "Unterwasser-Rugby wird im 3,5-5 m tiefen Becken gespielt. Das Spielfeld ist der gesamte dreidimensionale Raum (nicht nur der Boden). Der Ball ist salzwassergesaettigt und sinkt langsam. Angriff und Verteidigung finden in allen drei Raumdimensionen statt. Wer den Ball hat, kann von allen Seiten angegriffen werden. Da alle Spieler apnoetauchen, herrscht permanenter Spielerwechsel (Spieler tauchen kurz auf, holen Luft, tauchen wieder ab). Weltverband: CMAS. Weltmeisterschaften seit 1980.",
        difficulty = 3,
        funFact = "Unterwasser-Rugby ist in Skandinavien (besonders Norwegen, Deutschland, Kolumbien) am weitesten verbreitet und wird bei CMAS-Weltmeisterschaften ausgetragen – obwohl er im oeffentlichen Bewusstsein fast unbekannt ist."
    ),

    // ── Randsportarten & Kurioses (7) ─────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist 'Sepak Takraw' und in welcher Region ist es eine etablierte Sportart mit professionellen Ligen?",
        answerA = "Ein indonesischer Brettbrettspiel-Wettbewerb, der auf traditionellen Schifffahrtsrouten gespielt wird",
        answerB = "Eine Ballsportart Suedostasiens, bei der ein Rattanball ausschliesslich mit Fuss, Knie, Brust und Kopf (nicht Haenden) ueber ein Netz gespielt wird – aehnlich Volleyball, aber mit dem Koerper als Werkzeug",
        answerC = "Ein philippinisches Kampfsportart mit Bambusstab, das bei Suedostasienischen Spielen als Demonstrationssport gezeigt wird",
        answerD = "Ein Wasserball-Hybrid aus Thailand und Malaysia, gespielt in seichten Flussbetten mit aufgeblasenen Bambusbaellen",
        correctAnswer = 1,
        explanation = "Sepak Takraw (Wort aus Malaisch: 'sepak' = treten, 'takraw' = geflochtener Ball) ist in Thailand, Malaysia, Myanmar, Indien und anderen Laendern Suedostasiens fest etabliert. Es aehnelt Volleyball: 3 Spieler pro Seite, ein Netz, der Ball darf nur mit Fuss, Knie, Brust und Kopf gespielt werden. Die athletischen 'Roll-Spikes' (Spieler springen rueckwaerts und treten den Ball mit dem Kopf ueber das Netz) erfordern extreme Akrobatik. Bei den Asienspielen ist Sepak Takraw offizielle Medaillensportart.",
        difficulty = 3,
        funFact = "Professionelle Sepak-Takraw-Spieler trainieren Kickboxen, Tuernkunststuecke und Akrobatik – ein Roll-Spike erfordert Beweglichkeit, Sprungkraft und Koordination auf Weltklasse-Niveau."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'World Gurning Championship' und was steckt hinter diesem britischen Tradition?",
        answerA = "Ein jaehrlicher Grossgrundbesitz-Wettbewerb in Schottland, bei dem Lairds ihren Grundbesitz durch Grenzlaeufe verteidigen",
        answerB = "Ein Grimassenschneiden-Wettbewerb in Egremont, England (seit dem 13. Jahrhundert): Teilnehmer stecken den Kopf durch einen Pferdehalter-Rahmen und ziehen die groteske Grimasse ('gurn') – Gewinner ist, wer das haesslichste Gesicht macht",
        answerC = "Ein Ringelstechen-Turnier aus der tudorzeitlichen Ritter-Tradition, das in nordenglischen Doerfern bis heute ausgefuehrt wird",
        answerD = "Ein schottisches Fasswerfen-Wettkampf (Gurning = Fassrollen), bei dem Whisky-Faesser den Huegel hinuntergerollt werden",
        correctAnswer = 1,
        explanation = "Die World Gurning Championship ist Teil der Egremont Crab Fair in Cumbria, England – eines der aeltesten Volksfeste der Welt (erstmals 1267 urkundlich erwaehnt). Teilnehmer stecken den Kopf durch ein Pferdegeschirr ('brace') und schneiden Grimassen. Bewertet wird die Groteske und Originalitaet der Gesichtsverzerrung. Vielfacher Weltmeister war Thomas Mattinson, der auch zahnarztlos (zur besseren Mundverformung) antrat.",
        difficulty = 3,
        funFact = "Manche Weltmeister liessen sich Zaehne ziehen, um noch extremere Grimassen ziehen zu koennen. Rekordweltmeister Peter Jackman gewann 28 Mal."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Buzkashi' und welche zentrale Rolle spielt es in der Kultur Afghanistaens?",
        answerA = "Ein traditionelles Bogenschiessen-Turnier in Afghanistan, das als Ersatz fuer kriegerische Auseinandersetzungen zwischen Staemmen dient",
        answerB = "Ein Reitersportkampf, bei dem Spieler zu Pferde einen enthaupteten Ziegenkadaver um ein Ziel tragen und ablegen muessen – Nationalsport Afghanistaens mit tiefen politischen und sozialen Konnotationen",
        answerC = "Ein usbekisches Polo-Variante, bei dem Spieler einen Holzball durch ein erhoeahtes Tor schlagen, zu Pferde",
        answerD = "Ein kasachisches Ringkampf auf Pferden, bei dem der Verlierer abgeworfen werden muss",
        correctAnswer = 1,
        explanation = "Buzkashi (dari: 'Ziege reissen') ist der Nationalsport Afghanistaens. Ein koepfloser Ziegenkadaver (buz) wird von Reitern (chapandaz) um einen Kreis getragen und darin abgelegt. Das Spiel dauert Stunden oder Tage, es gibt wenige feste Regeln. Historisch diente Buzkashi als Demonstration von Macht und Reiterkunst durch Khane und Warlords – wer Buzkashi-Spiele sponserte, demonstrierte Einfluss. Politische Fuehrer (auch Taliban) nutzten es zur Machtdemonstration.",
        difficulty = 3,
        funFact = "Buzkashi wurde 1991 verfilmt (Bozorgmehr Rahimi) und ist im Westen durch Khalid Hosseinis Roman 'The Kite Runner' (2003) bekannt, in dem eine Buzkashi-Szene die gesellschaftlichen Hierarchien Kabuls illustriert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Fierljeppen' und welche technische Besonderheit macht diesen niederlaendischen Sport einzigartig?",
        answerA = "Ein traditionelles Eisschieaaen auf hollaendischen Kanaelen, das nur bei mindestens 15 cm Eisdicke ausgeuebt werden darf",
        answerB = "Ein Stabhochsprung-Variante, bei der Wettkampfteilnehmer einen langen Stab in einen Kanal rammen, daran hinaufklettern und auf die andere Kanalseite schwingen – die Weite wird gemessen",
        answerC = "Ein Wattwandern-Rennen durch tiefe Schlickgebiete, bei dem das Ziel ist, in moeglichst kurzer Zeit eine Strecke ohne Verschmutzen zu ueberqueren",
        answerD = "Ein Heurollen-Wettbewerb, bei dem grosse Heuballen moeglichst weit bergab gerollt werden",
        correctAnswer = 1,
        explanation = "Fierljeppen (friesisch: 'weit springen') ist ein friesisch-niederlaendischer Stabhochsprung-Variante fuer Kanalueberquerungen. Ein bis zu 13 m langer Holz-/Alupfahl wird in den Kanalgrund gerammt. Der Athlet rennt, springt gegen den Stab, klettert daran hoch (waehrend der Stab ueber den Kanal faellt) und landet moeglichst weit weg. Weltrekord (Herren): 22,21 m. Nationaler Wettkampfbetrieb in den Niederlanden mit Verbandssystem.",
        difficulty = 3,
        funFact = "Fierljeppen war urspruenglich eine praktische Methode fuer Bauern, Graeben und Kanaele in der flachen Frieslande-Landschaft zu ueberqueren – aus dem Alltagswerkzeug wurde eine Sportdisziplin."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Underwater Hockey' (auch Octopush) und wo wurde es erfunden?",
        answerA = "Eine US-amerikanische Erfindung der Navy-SEALs als Trainingsmethode fuer Unterwasserkampf, seit 1972 als Wettkampfsport",
        answerB = "1954 in Southsea, England erfunden von Alan Blake: Zwei Teams von je 6 Spielern stossen mit kleinen Schlaegern einen Puck auf dem Beckenboden ins Tor des Gegners – gespielt unter Wasser mit Schnorchel und Flossen",
        answerC = "Ein australischer Sport, erfunden 1965 als Trainingsvariante fuer Synchronschwimmer, die Unterwasserausdauer entwickeln wollten",
        answerD = "Ein niederlaendischer Poolsport des 20. Jahrhunderts, in dem ein aufgeblasener Ball unter Wasser per Hand ins Gegner-Tor gedrueckt wird",
        correctAnswer = 1,
        explanation = "Underwater Hockey (Octopush, benannt nach den 8 Spielern pro Team im Original) wurde 1954 vom britischen Taucher Alan Blake in Portsmouth erfunden. Gespielt im Schwimmbad-Boden: 6 Feldspieler pro Team (+ Ersatz), Schnorchel und Flossen, kleine Ketchup-Schlaeger (Puck-Schlaeger), ein ca. 3 kg schwerer Puck aus Blei. Ziel: den Puck in das 3 m breite Metalltor des Gegners schieben. CMAS reguliert den Sport, WM findet regelmaessig statt.",
        difficulty = 3,
        funFact = "Da alle Spieler apnoetauchen muessen, herrscht permanenter schneller Spielerwechsel – Spieler tauchen, spielen einige Sekunden, tauchen auf, holen Luft, tauchen wieder ab. Das macht Unterwasserhockey zu einer der konditionell anspruchsvollsten Sportarten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Jai Alai' und warum galt es in den 1970er-80er Jahren in den USA als die 'schnellste Ballsportart der Welt'?",
        answerA = "Ein japanischer Badminton-Ableitung, bei dem der Federball mit einem langen Bambusschlaeger gegen eine Wand gespielt wird",
        answerB = "Eine baskische Wandballsportart, bei der Spieler mit einem gebogenen Korbgeflecht-Arm (Cesta) einen Hartgummiball mit bis zu 300 km/h an einer dreiteiligen Wand abschlagen – die Cesta ermoeglicht Schluaeage mit enormer Zentrifugalkraft",
        answerC = "Ein philippinisches Volleyballspiel mit einem Rottangball, gespielt auf einem abgewinkelten Holzfeld",
        answerD = "Ein iberisches Squash-Variante, bei dem zwei Spieler in einem geschlossenen Raum abwechselnd einen Lederball an die Wand schlagen",
        correctAnswer = 1,
        explanation = "Jai Alai (baskisch: 'frohes Fest') stammt aus dem Baskenland und wird in einer Cancha (3-wandigem Spielfeld) gespielt. Die Cesta (gebogener Korbgeflecht-Arm, 60-80 cm lang) erlaubt extreme Schleudereffekte – Baelle wurden mit bis zu 302 km/h gemessen (Guinness-Rekord), was zum Beinamen 'Schnellste Ballsportart' fuehrte. In Florida und Connecticut gab es grosse Profiligen mit Wettbueros in den 1970er-80er Jahren.",
        difficulty = 3,
        funFact = "Jai Alai war in Florida so populaer, dass Fronton-Arenen (Spielstaetten) oeffentlich gebaut wurden. Der Niedergang kam durch den Aufstieg legaler Kasinos, die das Publikum abzogen."
    ),

    // ── Sportfilme & Dokumentationen (7) ─────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche filmischen Techniken setzte Leni Riefenstahl in 'Olympia' (1938) ein, die die Sportfilmaesthetik dauerhaft veraeanderten?",
        answerA = "Erstmals wurde Farb-Kinfilm (Agfacolor) fuer einen Sportfilm verwendet; alle anderen Techniken entsprachen dem Standard der Epoche",
        answerB = "Riefenstahl nutzte Zeitlupe, Unterwasserkameras beim Hochsprung-Anlauf, Grubenaufnahmen (Kameragraben im Stadion), Luftbilder und montierte Grossaufnahmen mit Weitaufnahmen – Techniken, die zuvor im Sportfilm kaum verwendet wurden",
        answerC = "Olympia war der erste Sportfilm, der vollstaendig im Studio nachgedreht wurde, da Liveaufnahmen zu eingeschraenkt waren",
        answerD = "Der Film nutzte erstmals Mobile 16mm-Kameras auf Fahrradfuehrungen neben Laeuferfeldern – ein Vorlaeufer des heutigen Motos-Kamerabilds",
        correctAnswer = 1,
        explanation = "Riefenstahls 'Olympia' (Olympische Spiele Berlin 1936) revolutionierte die Sportfilm-Aesthetik: Grubenaufnahmen (Kameramen gruben Gruben unter den Hochsprung-Anlauf fuer Froschperspektive), Unterwasserkameras bei Turmsprung-Sequenzen, Zeitlupe fuer Athletik-Grazie, Luftaufnahmen des Olympiastadions und raffinierte Montage rhythmisierte Bewegung zur Musik. Viele dieser Techniken sind heute Standard in TV-Sportproduktion.",
        difficulty = 3,
        funFact = "Riefenstahl beschaeftigte 45 Kameraleute und schnitt 400 Stunden Filmmaterial auf 4 Stunden Endprodukt. Trotz des NS-Propagandakontexts gilt 'Olympia' filmwissenschaftlich als Meilenstein der Dokumentarfilm-Geschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das besondere an ESPN's '30 for 30'-Dokumentationsreihe und welchen journalistischen Ansatz verfolgt sie?",
        answerA = "Eine Serienreihe, die ausschliesslich die 30 groessten Sportler aller Zeiten in Chronologie portraetiert",
        answerB = "Auteur-Dokumentationen von renommierten Regisseuren (auch Nicht-Sportjournalisten), die jeweils eine Sportgeschichte als narratives Kunstwerk behandeln – jede Folge ist stilistisch eigenstaendig und thematisiert kulturelle, soziale und persoenliche Dimensionen jenseits des Sports",
        answerC = "Eine Reality-Doku-Serie, die 30 junge Athleten beim Weg zum Profi ueber 30 Monate begleitet",
        answerD = "Die erste Sportdokumentationsreihe, die ausschliesslich Frauen-Sportgeschichten portraetiert – gestartet zum 30. Jahrestag des ESPN-Sendebetriebs",
        correctAnswer = 1,
        explanation = "'30 for 30' (gestartet 2009, zum 30. ESPN-Geburtstag) ueberliess namhaften Filmemachern wie Peter Berg, Barry Levinson, Albert Maysles und anderen die kreative Kontrolle. Jede Episode waehlt eine Sportgeschichte und behandelt sie als Spielfilm-Narrativ. Episoden wie 'O.J.: Made in America' (Ezra Edelman, 2016, 7,5 Stunden, Oscar-Gewinner) ueberschreiten die Grenzen von Sportdokumentation in soziokulturelle Analyse. Der Ansatz: Sport als Linse auf die Gesellschaft.",
        difficulty = 3,
        funFact = "'O.J.: Made in America' (30 for 30, 2016) ist mit 7,5 Stunden einer der laengsten jemals fuer den Oscar nominierten Dokumentarfilme – und gewann den Academy Award fuer den besten Dokumentarfilm."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die filmische Bedeutung von 'Hoop Dreams' (1994, Steve James) fuer den Sportdokumentarfilm?",
        answerA = "Erster Sportdokumentarfilm, der mit versteckten Kameras produziert wurde und damit undercover Korruption im NBA-Scouting-System aufdeckte",
        answerB = "Ein Langzeit-Dokumentarfilm (5 Jahre Dreharbeitszeit) ueber zwei afroamerikanische Jugendliche aus Chicago auf dem Weg in die NBA – er redefinierte den Dokumentarfilm als intimes, langzeit-begleitendes Narriv und enthullte systematische soziale Ungleichheit",
        answerC = "Der erste Sport-Spielfilm (Fiction), der ausschliesslich mit dokumentarischen Drehmethoden (Handheld, verdeckte Kamera) produziert wurde",
        answerD = "Ein experimenteller Dokufilm ohne Protagonist, der ausschliesslich durch Statistiken und Datenmaterial die NBA-Entwicklung 1975-1990 beschreibt",
        correctAnswer = 1,
        explanation = "Steve James begleitete Arthur Agee und William Gates von der 8. Klasse bis zum College-Basketball (1987-1992). Das Ergebnis: ein 171-minuetiges Epos ueber Traum und Realitaet, Familienstrukturen, Armut, Rassismus und die Ausbeutungsdynamik des Highschool-Sportmarkets. Roger Ebert nannte es einen der besten Filme des Jahres – obwohl es keinen Oscar gewann (Academy-Skandal). 'Hoop Dreams' etablierte den langzeit-begleitenden Sportdokumentarfilm als respektiertes Kunstformat.",
        difficulty = 3,
        funFact = "Die Nichtberuecksichtigung von 'Hoop Dreams' bei den Oscar-Nominierungen 1994 galt als so skandaloes, dass die Academy daraufhin das Abstimmungsverfahren fuer Dokumentarfilme grundlegend reformierte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Sportfilm gilt als bestes Beispiel fuer das dramaturgische Mittel des 'ticking clock' und wie nutzt 'Rush' (Ron Howard, 2013) es besonders effektiv?",
        answerA = "Rush nutzt die F1-Weltmeisterschaft 1976 als Rahmen, wobei der 'ticking clock' durch den sich naehernden Saisonabschluss und Lauda/Hunt Punkteverfolge erzeugt wird; die Nurburgring-Notfallszene fuegt existentielle Zeitdringlichkeit hinzu",
        answerB = "Der Film nutzt eine Countdown-Uhr im Bild, die exakt die verbleibende Saisonzeit anzeigt",
        answerC = "Rush gilt nicht als 'ticking clock'-Film, sondern als Charakterstudie ohne dramaturgische Zeitdringlichkeit",
        answerD = "Der 'ticking clock' in Rush ist der Formel-1-Motor: Lauda und Hunt haben bei jedem Rennen nur 90 Minuten, bevor ihr Motor wegen Ueberhitzung implodiert",
        correctAnswer = 0,
        explanation = "Ron Howards 'Rush' (2013) nutzt mehrere 'ticking clocks': Die F1-Saison 1976 naehert sich ihrem Ende, der Punkteabstand Hunt/Lauda (extremes Wechselspiel), Laudas physische Rehabilitation nach dem Nurburgring-Feuerunfall (8 Wochen Pause!) und schliesslich das Japan-Rennen im Regen. Lauda muss entscheiden, ob er unter lebensbedrohlichen Bedingungen faehrt. Jede Ebene des Zeitdrucks verstaerkt die dramatische Spannung exponentiell.",
        difficulty = 3,
        funFact = "Niki Lauda war beratend am Film beteiligt und lobte Daniela Bruehls Darstellung. Er bezeichnete die Rekonstruktion des Nurburgring-Unfalls als 'erschreckend akkurat'. Lauda verstarb 2019."
    ),

    Question(
        categoryId = 6,
        questionText = "Was macht 'Icarus' (Bryan Fogel, Netflix, 2017) zu einem journalistischen Wendepunkt in der Anti-Doping-Debatte?",
        answerA = "Ein Sportfilm, der das Leben von Lance Armstrong aus seiner persoenlichen Perspektive schildert",
        answerB = "Fogel begann als persoehnliches Selbst-Experiment (Doping im Amateurradsport), kontaktierte dabei den russischen Anti-Doping-Chef Grigory Rodchenkov, der ihm das russische Staatsdoping-System enthullte – der Film mutierte zu einem Investigativ-Epos und wurde zum Ausloeser des russischen WADA-Ausschlusses",
        answerC = "Der erste Dokumentarfilm, der vollstaendig auf Whistleblower-Aussagen ohne eigene Recherche basiert und juristisch angefochten wurde",
        answerD = "Eine Netflix-Fiction-Serie, die als Dokumentarfilm vermarktet wurde und spaeter als Manipulation enthullt wurde",
        correctAnswer = 1,
        explanation = "Bryan Fogel wollte zeigen, wie einfach Doping im Amateurradsport ist, und kontaktierte Grigory Rodchenkov (damaliger Leiter des russischen Anti-Doping-Labors). Rodchenkov enthullte nicht nur Fogels Doping, sondern das gesamte staatlich orchestrierte russische Dopingprogramm bei den Sotschi-Olympischen Spielen 2014. Fogels Film loeste eine internationale Untersuchung aus, die zu Rodchenkows Umsiedlung in die USA (Zeugenschutzprogramm) und zu Russlands Olympia-Ausschluss fuehrte.",
        difficulty = 3,
        funFact = "Rodchenkov steht heute unter US-Zeugenschutz. Der 'Rodchenkov Anti-Doping Act' (US-Bundesgesetz, 2020) wurde nach ihm benannt und macht Doping bei Olympischen Spielen zu einem US-Bundesvergehen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welchen Einfluss hatte 'Moneyball' (Bennett Miller, 2011) auf die oeffentliche Wahrnehmung von Sportanalyse und was ist die filmische Kernthese?",
        answerA = "Der Film zeigt, dass Statistik im Sport nutzlos ist, da menschliche Intuition immer besser ist – Brad Pitts Charakter versagt letztlich",
        answerB = "Die Kernthese: Traditionelle Scouting-Intuition kann durch systematische Datenanalyse uebertroffen werden; ein Arm-Team kann durch kluge Ressourcenallokation nach Spielerwert-Metriken gegen reiche Teams bestehen – eine Metapher auf Effizienz und Disruption",
        answerC = "Moneyball zeigt, dass Oakland Athletics die World Series durch Sabermetrics gewann – historisch akkurat",
        answerD = "Der Film propagiert eine marxistische Kritik an der MLB-Kapitalisierung durch die Perspektive des unterbezahlten Spielers",
        correctAnswer = 1,
        explanation = "Basierend auf Michael Lewis' Buch (2003) zeigt 'Moneyball' General Manager Billy Beanes Ansatz, den Oakland Athletics-Kader durch statistische Metriken (On-Base Percentage statt klassischer Scouting-Kriterien) aufzubauen. Die Kernthese: Maerkte unterbewerten bestimmte Spieler, weil traditionelle Scouts falsche Metriken betonen. Sabermetrics kann Marktineffizienzen ausnutzen. Historisch: Oakland gewann 2002 eine 20-Spiele-Siegesserie, verlor aber die ALCS. Der Einfluss auf reale Sportanalyse-Praxis war enorm.",
        difficulty = 3,
        funFact = "Nach 'Moneyball' stellten fast alle MLB-Teams eigene Analytics-Abteilungen ein. Der Boston Red Sox nutzte Beanes Ansatz und gewann 2004 die World Series – ihr erster Titel seit 86 Jahren."
    )
)
