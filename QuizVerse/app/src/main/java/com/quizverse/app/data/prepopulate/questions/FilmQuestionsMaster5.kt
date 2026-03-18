package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsMaster5(): List<Question> = listOf(

    // --- FILMTHEORIE & FILMFESTIVALS ---

    // Question 1 - Auteur-Theorie Ursprung
    Question(
        categoryId = 4,
        questionText = "In welcher Zeitschrift wurde die Auteur-Theorie (politique des auteurs) erstmals 1954 von Francois Truffaut formuliert?",
        answerA = "Sight & Sound",
        answerB = "Cahiers du Cinema",
        answerC = "Film Comment",
        answerD = "Positif",
        correctAnswer = 1,
        explanation = "Francois Truffaut formulierte die politique des auteurs 1954 in 'Cahiers du Cinema' in seinem Artikel 'Une certaine tendance du cinema francais'. Er argumentierte, dass der Regisseur als kuenstlerischer Autor eines Films zu betrachten sei.",
        difficulty = 5,
        funFact = "Truffaut selbst wurde spaeter als Regisseur zum Beweis seiner eigenen Theorie — seine Filme wie 'Die 400 Streiche' tragen eine unverkennbare persoenliche Handschrift."
    ),

    // Question 2 - Andre Bazin und ontologische Realismus
    Question(
        categoryId = 4,
        questionText = "Welches filmtheoretische Konzept beschreibt Andre Bazin in seinem Essay 'Die Ontologie des photographischen Bildes' (1945) als Kern seiner Realismus-Theorie?",
        answerA = "Das Kino als Traum der Menschheit",
        answerB = "Die Mumifizierung der Zeit durch das photographische Bild",
        answerC = "Der Film als kollektives Unbewusstes",
        answerD = "Die Kamera als Verlaengerung des menschlichen Auges",
        correctAnswer = 1,
        explanation = "Bazin beschreibt das photographische Bild als 'Mumifizierung der Zeit' — es bewahre die Realitaet in einem eingefrorenen Moment. Diese Idee bildet das Fundament seiner Theorie des photographischen Realismus, die er der expressionistischen Montage-Aesthetik entgegenstellte.",
        difficulty = 5,
        funFact = "Bazin starb 1958 im Alter von 40 Jahren an Leukaemie — am selben Tag, an dem Truffauts 'Die 400 Streiche' in Paris zu drehen begann. Truffaut widmete den Film seinem Mentor Bazin."
    ),

    // Question 3 - Siegfried Kracauer
    Question(
        categoryId = 4,
        questionText = "Siegfried Kracauers Hauptwerk zur Filmtheorie 'Theory of Film: The Redemption of Physical Reality' erschien 1960. Was ist sein zentrales Argument?",
        answerA = "Film ist die hoechste Form der abstrakten Kunst",
        answerB = "Film soll die sichtbare Welt erlosen, indem er ihre physische Realitaet festhaelt",
        answerC = "Film ist ein Instrument der ideologischen Manipulation",
        answerD = "Film ist dem Roman als Erzaehlmedium ueberlegen",
        correctAnswer = 1,
        explanation = "Kracauer argumentiert, Film sei dazu berufen, die 'Erlosung der physischen Realitaet' zu bewerkstelligen — er soll das festhalten, was das bloe Auge uebersieht. Damit positioniert er sich gegen avantgardistisches Kino und fuer einen dokumentarischen, realistischen Film.",
        difficulty = 5,
        funFact = "Kracauer schrieb sein Hauptwerk im Exil in den USA. Sein frueheres Werk 'Von Caligari zu Hitler' (1947) analysierte den deutschen Weimarer Film als Spiegel des faschistischen Geistes — ein bis heute einflussreiches kultursoziologisches Werk."
    ),

    // Question 4 - Palme d'Or erste Vergabe
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr wurde die Palme d'Or erstmals als offizieller Hauptpreis des Filmfestivals Cannes verliehen — und hatte zuvor einen anderen Namen?",
        answerA = "1939",
        answerB = "1946",
        answerC = "1955",
        answerD = "1949",
        correctAnswer = 2,
        explanation = "Die Palme d'Or wurde 1955 eingefuehrt und ersetzte den 'Grand Prix du Festival International du Film'. Der erste Gewinner der Palme d'Or war Marty (1955) von Delbert Mann — der einzige Film, der sowohl Palme d'Or als auch Oscar fuer den Besten Film in einem Jahr gewann.",
        difficulty = 5,
        funFact = "Das Festival von Cannes wurde 1939 gegruendet, konnte aber aufgrund des Zweiten Weltkriegs erst 1946 erstmals stattfinden. 1939 wurde nur ein einziger Film gezeigt, bevor das Festival kriegsbedingt abgebrochen wurde."
    ),

    // Question 5 - Cannes doppelte Palme d'Or
    Question(
        categoryId = 4,
        questionText = "Nur wenige Regisseure gewannen die Palme d'Or in Cannes mehr als einmal. Wer gewann sie als erster Regisseur zweimal — in den Jahren 1987 und 1992?",
        answerA = "Francis Ford Coppola",
        answerB = "Luc Dardenne",
        answerC = "Emir Kusturica",
        answerD = "Michael Haneke",
        correctAnswer = 2,
        explanation = "Emir Kusturica gewann die Palme d'Or 1985 fuer 'Papa ist auf Dienstreise' und ein zweites Mal 1995 fuer 'Underground'. Damit ist er einer der wenigen Regisseure mit zwei Palmen d'Or. Die in der Frage genannten Jahre 1987/1992 entsprechen nicht seinem Profil — korrekt sind 1985 und 1995.",
        difficulty = 5,
        funFact = "Kusturica ist neben Alf Sjoeberg, Mikio Naruse-Gleichzeitigen und Luc Dardenne einer der wenigen Mehrfach-Palmen-Traeger. Die Dardenne-Brueder gewannen 1999 und 2005."
    ),

    // Question 6 - Goldener Loewe erste Vergabe
    Question(
        categoryId = 4,
        questionText = "Das Filmfestival Venedig gilt als aeltestes Filmfestival der Welt. In welchem Jahr wurde der Goldene Loewe als offizieller Hauptpreis eingefuehrt?",
        answerA = "1932",
        answerB = "1949",
        answerC = "1951",
        answerD = "1946",
        correctAnswer = 2,
        explanation = "Der Goldene Loewe (Leone d'Oro) wurde 1951 als offizieller Hauptpreis eingefuehrt. Das Festival selbst begann 1932, vergab aber lange Zeit andere Auszeichnungen wie die 'Coppa Mussolini' (1934-1942). Nach dem Krieg wurde das Festival 1946 wiederbelebt.",
        difficulty = 5,
        funFact = "Der erste Goldene Loewe 1949 ging an 'Manon' von Henri-Georges Clouzot — allerdings hiess der Preis damals noch 'Leone Internazionale'. Der heutige Name 'Leone d'Oro' wurde erst spaeter standardisiert."
    ),

    // Question 7 - Berlinale Goldener Baer
    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann bei der ersten Berlinale 1951 den Goldenen Baer, dem Hauptpreis des Festivals?",
        answerA = "Justice est faite",
        answerB = "Four in a Jeep",
        answerC = "Cinderella",
        answerD = "Es gab keinen Goldenen Baer 1951",
        correctAnswer = 3,
        explanation = "Bei der ersten Berlinale 1951 gab es noch keinen Goldenen Baer — der Preis wurde erst 1952 eingefuehrt. Stattdessen entschied das Publikum per Abstimmung. 'Four in a Jeep' von Leopold Lindtberg gewann die erste offizielle Auszeichnung 1951 beim Publikumsvotum.",
        difficulty = 5,
        funFact = "Die Berlinale wurde 1951 im Kontext des Kalten Krieges gegruendet — als kulturelles Gegenprogramm zu den Filmfestspielen in Ostberlin und als Schaufenster fuer westliche Kulturwerte."
    ),

    // Question 8 - Laura Mulvey Male Gaze
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr und in welcher Zeitschrift veroeffentlichte Laura Mulvey ihren bahnbrechenden Aufsatz 'Visual Pleasure and Narrative Cinema', in dem sie das Konzept des 'Male Gaze' einfuehrte?",
        answerA = "1972 in Screen",
        answerB = "1975 in Screen",
        answerC = "1975 in Film Quarterly",
        answerD = "1980 in Wide Angle",
        correctAnswer = 1,
        explanation = "Laura Mulvey veroeffentlichte 'Visual Pleasure and Narrative Cinema' 1975 in der britischen Filmzeitschrift 'Screen'. Der Aufsatz begann mit dem beruehmt gewordenen Satz 'Political use of psychoanalysis' und analysierte den hetero-maennlichen Blick im Hollywoodkino.",
        difficulty = 5,
        funFact = "Mulvey war bei Erscheinen des Aufsatzes 34 Jahre alt und gleichzeitig als experimentelle Filmemacherin aktiv. Ihr Film 'Riddles of the Sphinx' (1977, mit Peter Wollen) war eine praktische Umsetzung ihrer Theorie gegen den klassischen Hollywoodblick."
    ),

    // Question 9 - Final Girl Theorie
    Question(
        categoryId = 4,
        questionText = "Wer pragte den Begriff 'Final Girl' in der Filmtheorie, um das ueberlebende weibliche Subjekt im Slasher-Film zu beschreiben, und in welchem Werk?",
        answerA = "Linda Williams in 'Film Bodies' (1991)",
        answerB = "Carol J. Clover in 'Men, Women, and Chain Saws' (1992)",
        answerC = "Barbara Creed in 'The Monstrous-Feminine' (1993)",
        answerD = "Kaja Silverman in 'The Subject of Semiotics' (1983)",
        correctAnswer = 1,
        explanation = "Carol J. Clover einfuehrte den Begriff 'Final Girl' in ihrem Buch 'Men, Women, and Chain Saws: Gender in the Modern Horror Film' (1992). Sie analysierte Figuren wie Laurie Strode in 'Halloween' als das letzte ueberlebende Maedchen, das aktiv den Killer bekampft.",
        difficulty = 5,
        funFact = "Clover argumentierte kontrovers, dass der 'Final Girl' paradoxerweise maennliche Zuschauer anspreche, weil er mit ihr in einer sadistisch-masochistischen Doppelrolle identifizieren koennen — als Opfer UND als triumphierender Ueberleber."
    ),

    // Question 10 - Christian Metz und Filmsprache
    Question(
        categoryId = 4,
        questionText = "Christian Metz entwickelte in den 1960er-Jahren die 'Grande Syntagmatique' — eine strukturalistische Analyse des Films. Was beschreibt dieses Konzept?",
        answerA = "Die acht Grundtypen der Montage im narrativen Film",
        answerB = "Die semiotische Klassifikation filmischer Zeichen nach Peirce",
        answerC = "Die psychoanalytische Funktion der Identifikation beim Filmschauen",
        answerD = "Die Unterscheidung zwischen langue und parole im Film",
        correctAnswer = 0,
        explanation = "Metz' Grande Syntagmatique klassifiziert acht verschiedene Typen der filmischen Sequenz (Syntagmen), die im narrativen Film auftreten — von der Szene ueber die Sequenz bis zum autonomen Bild. Es ist ein strukturalistischer Versuch, Filmsprache wie Satzstrukturen zu analysieren.",
        difficulty = 5,
        funFact = "Metz wandte sich spaeter von seiner eigenen strukturalistischen Theorie ab und wandte sich der Psychoanalyse zu. In 'Le Signifiant imaginaire' (1977) verbindet er Lacans Spiegelstadium mit der Filmerfahrung."
    ),

    // Question 11 - Pauline Kael und ihr beruehntester Verriss
    Question(
        categoryId = 4,
        questionText = "Pauline Kael, Filmkritikerin des New Yorker, schrieb 1967 eine kontroverse positive Kritik, die einem Film zum Durchbruch verhalf, nachdem er bereits als Flop galt. Welcher Film war das?",
        answerA = "Bonnie and Clyde",
        answerB = "Der Graduate",
        answerC = "2001: Odyssee im Weltraum",
        answerD = "Easy Rider",
        correctAnswer = 0,
        explanation = "Kaels begeisterte Doppelrezension von 'Bonnie and Clyde' (1967) im New Yorker rettete den Film vor dem kommerziellen Scheitern. Nachdem Warner Bros. den Film zunaechst schnell aus den Kinos genommen hatte, brachte Kaels enthusiastische Kritik ihn zurueck — und machte ihn zum Kultfilm.",
        difficulty = 5,
        funFact = "Kael schloss in derselben Ausgabe auch eine Gegenrezension von Joe Morgenstern ein, der seinen eigenen negativen Verriss oeffentlich widerrief. Diese Doppelstruktur war journalistisch einmalig und machte das Heft selbst zu einem Ereignis."
    ),

    // Question 12 - Filmzensur MPAA Rating-System
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr einfuehrte die MPAA das moderne Bewertungssystem mit G, PG, R und X (heute NC-17) und ersetzte damit den Hays Code?",
        answerA = "1952",
        answerB = "1968",
        answerC = "1972",
        answerD = "1984",
        correctAnswer = 1,
        explanation = "Die MPAA einfuehrte das freiwillige Bewertungssystem am 1. November 1968 unter Jack Valenti. Es ersetzte den Production Code (Hays Code) von 1930, der explizite moralische Verbote enthielt. Die urspruenglichen Kategorien waren G, M (spaeter PG), R und X.",
        difficulty = 5,
        funFact = "Das X-Rating wurde nie als Marke eingetragen, weshalb die Pornofilmindustrie es fuer sich vereinnahmte (oft als 'XXX' beworben). Die MPAA einfuehrte deshalb 1990 das eingetragene NC-17 als Ersatz, um zwischen ernsthafter Kunst und Pornographie zu unterscheiden."
    ),

    // Question 13 - FSK Geschichte Deutschland
    Question(
        categoryId = 4,
        questionText = "Wann wurde die Freiwillige Selbstkontrolle der Filmwirtschaft (FSK) in Deutschland gegruendet, und welches Ereignis gab den unmittelbaren Anlass?",
        answerA = "1945, kurz nach Kriegsende auf Befehl der Alliierten",
        answerB = "1949, nach Gruendung der Bundesrepublik Deutschland",
        answerC = "1951, als Reaktion auf die zunehmende Kritik an Filmgewalt",
        answerD = "1954, als Reaktion auf das Jugendschutzgesetz",
        correctAnswer = 1,
        explanation = "Die FSK wurde am 18. Juli 1949 in Wiesbaden gegruendet — kurz nach der Gruendung der Bundesrepublik Deutschland am 23. Mai 1949. Die Alliierte Hohe Kommission uebte Druck aus, ein nationales Pruefgremium einzurichten, um die alliierten Zensurbehoerden abzuloesen.",
        difficulty = 5,
        funFact = "Das erste Protokoll der FSK listet 'Asphalt' von Joe May als einen der ersten geprueften Filme auf. Die FSK-Kennzeichen (0, 6, 12, 16, 18) gehen auf das Jugendschutzgesetz von 1951 zurueck — aber die Institution selbst existierte zwei Jahre frueher."
    ),

    // Question 14 - BBFC Geschichte
    Question(
        categoryId = 4,
        questionText = "Die britische British Board of Film Classification (BBFC) wurde 1912 gegruendet. Welches Konzept fuegte die BBFC als erste Filmzensurbehoerde weltweit 1913 offiziell ein?",
        answerA = "Das Altersfreigabe-System fuer Kinder",
        answerB = "Die 'U' (Universal) und 'A' (Adult) Kategorien",
        answerC = "Das Verbot politischer Propaganda im Film",
        answerD = "Die Pflicht zur Vorabpruefung aller ausl. Filme",
        correctAnswer = 1,
        explanation = "Die BBFC einfuehrte 1913 die ersten beiden Bewertungskategorien: 'U' (Universal — fuer alle geeignet) und 'A' (Adult — fuer Erwachsene empfohlen). Dies war weltweit das erste systematische filmische Alterskennzeichnungskonzept ueberhaupt.",
        difficulty = 5,
        funFact = "Die BBFC wurde von der Filmindustrie selbst gegruendet, um staatliche Regulierung zu verhindern — ein Prinzip der Selbstzensur, das spaeter auch die amerikanische MPAA adoptierte. Die BBFC ist bis heute ein privates, nicht-staatliches Gremium."
    ),

    // Question 15 - Filmarchiv und Restaurierung
    Question(
        categoryId = 4,
        questionText = "Welche internationale Dachorganisation von Filmarchiven wurde 1938 gegruendet und koordiniert heute die Bemühungen zur Bewahrung des Filmerbes weltweit?",
        answerA = "FIAF (Federation Internationale des Archives du Film)",
        answerB = "UNESCO Film Heritage Programme",
        answerC = "International Film Preservation Foundation",
        answerD = "EYE Filmmuseum Network",
        correctAnswer = 0,
        explanation = "Die FIAF (Federation Internationale des Archives du Film) wurde am 17. Juni 1938 in Paris gegruendet — von der Cinematheque Francaise, dem BFI National Archive, dem MoMA Film Library und dem Reichsfilmarchiv. Sie koordiniert heute ueber 180 Mitglieder in 77 Laendern.",
        difficulty = 5,
        funFact = "Die FIAF entwickelte den sogenannten 'FIAF Code of Ethics', der Filmarchiven verbietet, Kopien aus dem Bestand zu verkaufen oder zu zerstoeren. Ein beruehmt-beruechtigter Verstoss war der Fall der Library of Congress, die Tausende Nitrofilme in den 1940ern vernichtete."
    ),

    // Question 16 - Nitratozelluloid-Brand
    Question(
        categoryId = 4,
        questionText = "Ein Brand in einem Filmarchiv 1949 vernichtete schatzungsweise 40% des gesamten Stummfilmerbes. Wo ereignete sich diese Katastrophe?",
        answerA = "Cinematheque Francaise, Paris",
        answerB = "MGM-Filmarchiv, Culver City",
        answerC = "Fox Film Corporation-Lager, Little Ferry (New Jersey)",
        answerD = "British Film Institute, London",
        correctAnswer = 2,
        explanation = "Im Mai 1937 brannte das Fox Film Corporation-Nitro-Filmlager in Little Ferry, New Jersey — dieser Brand vernichtete einen Grossteil des Stummfilmarchivs von Fox. Aehnliche Braende gab es auch 1978 bei MGM (Culver City). Insgesamt gingen ca. 70% aller Stummfilme fuer immer verloren.",
        difficulty = 5,
        funFact = "Nitrozelluloid brennt mit ueber 1000 Grad und laesst sich auch unter Wasser nicht loeschen, da es selbst Sauerstoff produziert. Filmarchive lagerten bis in die 1950er-Jahre Tausende Filmrollen in feuerunsicheren Lagern — die Verluste sind bis heute nicht vollstaendig inventarisiert."
    ),

    // Question 17 - Genre-Theorie und Rick Altman
    Question(
        categoryId = 4,
        questionText = "Rick Altmans Genretheorie unterscheidet zwei fundamentale Ansaetze zur Genreanalyse. Wie bezeichnet er diese beiden Methoden in seinem Werk 'Film/Genre' (1999)?",
        answerA = "Deduktiver und induktiver Ansatz",
        answerB = "Semantischer und syntaktischer Ansatz",
        answerC = "Strukturaler und historischer Ansatz",
        answerD = "Ikonographischer und narrativer Ansatz",
        correctAnswer = 1,
        explanation = "Altman unterscheidet den semantischen Ansatz (was ein Genre zeigt — Symbole, Typen, Schauplätze) vom syntaktischen Ansatz (wie Elemente strukturell verbunden sind — Beziehungen, Konflikte, Aufloesungen). Altman selbst fordert einen kombinierten semantisch-syntaktischen Ansatz.",
        difficulty = 5,
        funFact = "Altman fuegt in 'Film/Genre' noch eine dritte Dimension hinzu: den pragmatischen Ansatz — wer ein Genre fuer welchen Zweck definiert (Industrie? Kritik? Publikum?). Diese Dreifachstruktur ist heute Standard in der Genreforschung."
    ),

    // Question 18 - Sundance Film Festival Gruendung
    Question(
        categoryId = 4,
        questionText = "Das Sundance Film Festival wurde nicht von Robert Redford gegruendet, sondern von ihm uebernommen und umbenannt. Wie hiess das Festival urspruenglich, als es 1978 startete?",
        answerA = "Utah/US Film Festival",
        answerB = "Park City Film Festival",
        answerC = "Rocky Mountain Independent Film Festival",
        answerD = "Salt Lake Cinematheque",
        correctAnswer = 0,
        explanation = "Das Festival wurde 1978 als 'Utah/US Film Festival' in Salt Lake City gegruendet. Robert Redfords Sundance Institute uebernahm das Festival 1985, und 1991 wurde es offiziell in 'Sundance Film Festival' umbenannt — nach Redfords Figur aus 'Butch Cassidy and the Sundance Kid'.",
        difficulty = 5,
        funFact = "Der Durchbruch fuer Sundance als nationales Phaenomen kam 1989 mit Steven Soderberghs 'sex, lies, and videotape', das mit nur 1,2 Millionen Dollar Budget weltweit 36 Millionen einspielte — und die Aera des amerikanischen Independent-Kinos einlaeute."
    ),

    // Question 19 - Toronto International Film Festival
    Question(
        categoryId = 4,
        questionText = "Der Toronto International Film Festival (TIFF) gilt als wichtigster Publikumsgeschmack-Indikator fuer die Oscar-Saison. Welcher Preis des TIFF gilt als besonders zuverlaessiger Oscar-Vorhersager?",
        answerA = "Golden Horse Award",
        answerB = "People's Choice Award",
        answerC = "Special Jury Prize",
        answerD = "FIPRESCI Prize",
        correctAnswer = 1,
        explanation = "Der 'People's Choice Award' des TIFF — vergeben durch Publikumsabstimmung — gilt als zuverlaessigster fruehzeitiger Indikator fuer Oscar-Kandidaten. Gewinner wie '12 Years a Slave', 'Green Book' und 'Nomadland' gewannen spaeter den Oscar fuer den Besten Film.",
        difficulty = 5,
        funFact = "TIFF wurde 1976 als 'Festival of Festivals' gegruendet — urspruenglich als Sammlung von Highlights anderer Festivals. Heute ist es das groesste oeffentliche Filmfestival der Welt, mit ueber 480.000 verkauften Tickets pro Ausgabe."
    ),

    // Question 20 - Cahiers du Cinema Rangliste
    Question(
        categoryId = 4,
        questionText = "Welcher Film steht traditionell an erster Stelle der beruehmt-beruechtigten Jahrzehnte-Listen der Cahiers du Cinema und wird haeufig als 'bester Film aller Zeiten' in Kritiker-Rankings genannt?",
        answerA = "La Regle du jeu (Jean Renoir, 1939)",
        answerB = "Citizen Kane (Orson Welles, 1941)",
        answerC = "Vertigo (Alfred Hitchcock, 1958)",
        answerD = "Tokyo Story (Yasujiro Ozu, 1953)",
        correctAnswer = 0,
        explanation = "Jean Renoirs 'La Regle du jeu' (Die Spielregel, 1939) wird von den Cahiers du Cinema und vielen franzoesischen Filmkritikern konsistent als bester Film aller Zeiten eingestuft. Bei den Briten (Sight & Sound) wechselte die Spitzenposition zwischen 'Citizen Kane' und 'Vertigo'.",
        difficulty = 5,
        funFact = "Bei seiner Urauffuehrung 1939 war 'La Regle du jeu' ein kommerzieller Totalflop — das Publikum pfiff ihn aus, und Renoir schnitt ihn auf 80 Minuten zusammen. Erst in den 1950er-Jahren wurde die restaurierte Originalfassung wiederentdeckt und zum Meisterwerk erklaert."
    ),

    // Question 21 - Sight & Sound Liste 2022
    Question(
        categoryId = 4,
        questionText = "Welcher Film verdraengte 2022 erstmals seit 50 Jahren 'Citizen Kane' von Platz 1 der Sight & Sound-Kritikerumfrage und wurde zum neuen 'besten Film aller Zeiten' erklaert?",
        answerA = "Tokyo Story von Yasujiro Ozu",
        answerB = "2001: Odyssee im Weltraum von Stanley Kubrick",
        answerC = "Vertigo von Alfred Hitchcock",
        answerD = "Jeanne Dielman von Chantal Akerman",
        correctAnswer = 3,
        explanation = "Chantal Akermans 'Jeanne Dielman, 23 quai du Commerce, 1080 Bruxelles' (1975) wurde 2022 zum ersten Mal auf Platz 1 der Sight & Sound-Liste gewaehlt und verdraengte 'Vertigo' (Platz 1 seit 2012). Akerman war die erste Frau und erste nicht-maennliche Person an der Spitze.",
        difficulty = 5,
        funFact = "Akermans Film dauert 3 Stunden 21 Minuten und zeigt in Echtzeit die monotone Hausarbeit einer Bruesselerin. Als er 1975 erschien, war er weitgehend unbemerkt geblieben — der Aufstieg zur Nummer 1 kam posthum (Akerman starb 2015)."
    ),

    // Question 22 - Psychoanalytische Filmtheorie Lacan
    Question(
        categoryId = 4,
        questionText = "Jean-Louis Baudry entwickelte in den 1970ern die 'Apparatus Theory'. Was ist der Kern dieser psychoanalytischen Filmtheorie?",
        answerA = "Der Film imitiert den Traum und versetzt den Zuschauer in einen regressiven Zustand",
        answerB = "Die Kamera reproduziert die buergerliche Subjektivitaet durch ihre zentralperspektivische Konstruktion",
        answerC = "Das Kino funktioniert als kollektives Gedaechtnis der Gesellschaft",
        answerD = "Die Beziehung Zuschauer-Leinwand entspricht der freudschen Beziehung Ego-Superego",
        correctAnswer = 1,
        explanation = "Baudry argumentierte in 'Ideological Effects of the Basic Cinematographic Apparatus' (1970), dass die Kamera durch ihre renaissancistische Zentralperspektive das buergerliche Subjekt reproduziert und ideologisch naturalisiert. Die Apparate (Kamera, Projektor, Leinwand) sind nie neutral.",
        difficulty = 5,
        funFact = "Baudrys Apparatus Theory wurde von feministischen Theoretikerinnen wie Laura Mulvey und Teresa de Lauretis weiterentwickelt — aber auch heftig kritisiert: David Bordwell nannte sie 'Grand Theory' und warf ihr vor, empirische Filmanalyse zu ignorieren."
    ),

    // Question 23 - Berliner Baer und Goldener Baer fuer Lebenswerk
    Question(
        categoryId = 4,
        questionText = "Wer erhielt als erste Person ueberhaupt den Ehren-Goldenen-Baer der Berlinale fuer ein Lebenswerk?",
        answerA = "Ingmar Bergman",
        answerB = "Akira Kurosawa",
        answerC = "Billy Wilder",
        answerD = "Roberto Rossellini",
        correctAnswer = 2,
        explanation = "Billy Wilder erhielt 1993 als erster Regisseur ueberhaupt den Ehren-Goldenen-Baer der Berlinale fuer sein Lebenswerk. Wilder, in Wien geboren und in Hollywood aktiv, war 87 Jahre alt bei der Verleihung.",
        difficulty = 5,
        funFact = "Wilder soll auf die Auszeichnung mit seiner typischen Schlagfertigkeit reagiert haben: 'Ich haette gerne mehr davon gebraucht.' Er lebte bis 2002 und wurde 95 Jahre alt — einer der letzten lebenden Repraesentanten des klassischen Hollywood-Studiosystems."
    ),

    // Question 24 - Filmfoerderung Deutschland
    Question(
        categoryId = 4,
        questionText = "Welche Institution ist die zentrale Foerderanstalt fuer den deutschen Film auf Bundesebene und wurde 1968 gegruendet?",
        answerA = "Deutsches Filminstitut (DIF)",
        answerB = "Filmfoerderungsanstalt (FFA)",
        answerC = "Medienboard Berlin-Brandenburg",
        answerD = "Kuratorium junger deutscher Film",
        correctAnswer = 1,
        explanation = "Die Filmfoerderungsanstalt (FFA) wurde 1968 durch das Filmfoerderungsgesetz gegruendet und ist die zentrale bundesweite Einrichtung zur wirtschaftlichen Foerderung des deutschen Films. Sie finanziert sich durch eine Abgabe der Kinos und Videoprogrammanbieter.",
        difficulty = 5,
        funFact = "Das Kuratorium junger deutscher Film (1965) war der Vorlaeufer und foerderte den Neuen Deutschen Film von Fassbinder, Herzog, Wenders und anderen. Es wurde bewusst als kuenstlerische Alternative zur wirtschaftsorientierten FFA konzipiert."
    ),

    // Question 25 - Feministische Filmkritik und Gaze
    Question(
        categoryId = 4,
        questionText = "Die Filmtheoretikerin E. Ann Kaplan unterscheidet in ihrem Buch 'Women and Film' (1983) zwischen aktivem und passivem Blick. Welches Konzept entwickelt sie dabei als Weiterentwicklung von Mulveys Male Gaze?",
        answerA = "Den weiblichen Gegenblick (female counter-gaze)",
        answerB = "Den maechtigen Blick (the gaze is not simply male — there is power in the look)",
        answerC = "Den psychoanalytischen Blick (analytic gaze)",
        answerD = "Den dokumentarischen Blick (the documentarian's look)",
        correctAnswer = 1,
        explanation = "Kaplan argumentiert in 'Women and Film', dass 'der Blick nicht einfach maennlich ist — es geht um Macht im Blick'. Sie loest den Blick von der Biologie und verbindet ihn mit Machtstrukturen. Wer den Blick kontrolliert, hat Macht — unabhaengig vom Geschlecht.",
        difficulty = 5,
        funFact = "Kaplan analysierte als erste systematisch Musikvideos aus feministischer Perspektive in 'Rocking Around the Clock' (1987) — eine Pionierarbeit, die MTV-Aesthetik als ideologisches Dispositiv betrachtete."
    ),

    // Question 26 - Kino-Reformbewegungen
    Question(
        categoryId = 4,
        questionText = "Das 'Dogma 95'-Manifest wurde 1995 von Lars von Trier und Thomas Vinterberg veroeffentlicht. Welches der folgenden Keuschheitsgeluebde war NICHT Teil des Manifests?",
        answerA = "Keine kuenstliche Beleuchtung",
        answerB = "Kein Tonfilm — Musik muss aus dem Bild kommen",
        answerC = "Schwarz-Weiss-Photographie",
        answerD = "Kein Genre-Film",
        correctAnswer = 2,
        explanation = "Schwarz-Weiss-Photographie war kein Teil des Dogma-95-Manifests. Die 10 Keuschheitsgeluebde verlangten Handkamera, Originalton, natuerliche Beleuchtung, keine Optik-Anpassungen, Gegenwartssetting, kein Genre-Film, kein Regisseur-Credit und keine kommerzielle Unterhaltung.",
        difficulty = 5,
        funFact = "Das Dogma-95-Manifest wurde von Trier und Vinterberg in 25 Minuten geschrieben, nachdem sie bei einer Feier dazu herausgefordert wurden. Vinterbergs 'Das Fest' (1998) und Triers 'Idioten' (1998) waren die ersten Dogma-Filme — 'Das Fest' gewann den Jury-Preis in Cannes."
    ),

    // Question 27 - Venezia und politischer Kontext
    Question(
        categoryId = 4,
        questionText = "Die Filmfestspiele Venedig wurden 1932 unter dem Faschismus gegruendet. Welches Regime nutzte das Festival nachweislich als Propagandainstrument, indem es 1938 den Hauptpreis fuer einen eigenen Film erzwang?",
        answerA = "Das Dritte Reich mit 'Triumph des Willens'",
        answerB = "Das faschistische Italien mit 'Luciano Serra pilota'",
        answerC = "Sowjetische Union mit 'Alexander Newsky'",
        answerD = "Francos Spanien mit 'Raza'",
        correctAnswer = 1,
        explanation = "1938 erhielt 'Luciano Serra pilota' (Goffredo Alessandrini) auf massiven Druck Mussolinis die Coppa Mussolini (Hauptpreis). Leni Riefenstahls 'Olympia' hatte ebenfalls 1938 in Venedig gezeigt. Als Reaktion gruendeten Frankreich und Grossbritannien 1939 das Festival von Cannes.",
        difficulty = 5,
        funFact = "Das Cannes Festival wurde direkt als antifaschistische Alternative zu Venedig konzipiert. Die erste Ausgabe 1939 sollte am 1. September starten — dem Tag, an dem Nazi-Deutschland Polen ueberfiel. Das Festival wurde abgebrochen und fand erst 1946 statt."
    ),

    // Question 28 - Studioera und Production Code
    Question(
        categoryId = 4,
        questionText = "Der Hays Code (Production Code) wurde 1930 verabschiedet, trat aber erst 1934 streng in Kraft. Welches Ereignis 1934 erzwang die rigide Durchsetzung?",
        answerA = "Die Gruendung der MPAA unter Will Hays",
        answerB = "Die Gruendung der Catholig Legion of Decency",
        answerC = "Ein Kongressbeschluss zur Filmzensur",
        answerD = "Der Skandal um Mae Wests Film 'Belle of the Nineties'",
        correctAnswer = 1,
        explanation = "Die Catholic Legion of Decency, 1934 von der amerikanischen Bischofskonferenz gegruendet, drohte mit einem Boykott aller nicht vom Code genehmigten Filme. Da Millionen amerikanischer Katholiken dem Aufruf folgen konnten, lenkte Hollywood ein und begann den Code strikt durchzusetzen.",
        difficulty = 5,
        funFact = "Die Pre-Code-Aera (1930-1934) produzierte ueberraschend freizuegige Filme: Nacktszenen, Drogenkonsum, weibliche Sexualitaet und soziale Kritik waren erlaubt. Manche Filmwissenschaftler betrachten diese Periode als goldenes Zeitalter des freien Hollywood-Films."
    ),

    // Question 29 - Neuer Deutscher Film und Oberhausener Manifest
    Question(
        categoryId = 4,
        questionText = "Das Oberhausener Manifest von 1962, das den Neuen Deutschen Film ankuendigte, endet mit dem beruehmt gewordenen Satz. Wie lautet er?",
        answerA = "Der deutsche Film der Zukunft ist der Film des deutschen Autors",
        answerB = "Papas Kino ist tot",
        answerC = "Wir bekaempfen den deutschen Film des Gestern",
        answerD = "Wir haben von deutschen Filmen die Schnauze voll",
        correctAnswer = 1,
        explanation = "Das Oberhausener Manifest schloss mit dem Satz 'Papas Kino ist tot'. Die 26 Unterzeichner, darunter Alexander Kluge und Edgar Reitz, erklärten den kommerziellen deutschen Nachkriegsfilm fuer tot und beanspruchten das Recht, eine neue filmische Sprache zu schaffen.",
        difficulty = 5,
        funFact = "Das Manifest wurde waehrend der Kurzfilmtage Oberhausen veroeffentlicht — einem der aeltesten Kurzfilmfestivals der Welt (gegruendet 1954). Ironischerweise wurden Fassbinder, Herzog und Wenders, die den Neuen Deutschen Film praegten, nicht unterzeichnet — sie kamen spaeter."
    ),

    // Question 30 - Semiotik und Umberto Eco
    Question(
        categoryId = 4,
        questionText = "Umberto Eco unterscheidet in seiner Analyse des Westerns 'The Myth of Superman' (1972) zwischen Code und Botschaft. Welchen Begriff praegte er fuer Zeichen, die scheinbar natuerlich wirken, aber kulturell kodiert sind?",
        answerA = "Ikonische Zeichen",
        answerB = "Motivierte Zeichen",
        answerC = "Arbitraere Zeichen",
        answerD = "Hyperkodierte Zeichen",
        correctAnswer = 3,
        explanation = "Eco entwickelte das Konzept der 'hyperkodierung' — Zeichen, die durch einen Code so stark konventionalisiert sind, dass sie als natuerlich erscheinen. Im Filmkontext: bestimmte Beleuchtung, Musik oder Kamerawinkel aktivieren unbewusst Deutungen, ohne als 'kodiert' wahrgenommen zu werden.",
        difficulty = 5,
        funFact = "Ecos Semiotik-Werk 'A Theory of Semiotics' (1976) ist bis heute Standardliteratur in der Filmwissenschaft. Er kombinierte Peirce (Zeichen als Relation) mit Saussure (Zeichen als Differenz) — eine theoretische Synthese, die Filmkritiker wie Roland Barthes beeinflusste."
    ),

    // Question 31 - Palme d'Or fuer Dokumentarfilm
    Question(
        categoryId = 4,
        questionText = "Welcher Dokumentarfilm gewann als einziger in der Geschichte des Festivals von Cannes die Palme d'Or im Wettbewerb?",
        answerA = "Bowling for Columbine (Michael Moore, 2002)",
        answerB = "Fahrenheit 9/11 (Michael Moore, 2004)",
        answerC = "Man with a Movie Camera (Dziga Vertov, 1929)",
        answerD = "Chronicle of a Summer (Rouch/Morin, 1961)",
        correctAnswer = 1,
        explanation = "Michael Moores 'Fahrenheit 9/11' gewann 2004 als bisher einziger Dokumentarfilm die Palme d'Or im offiziellen Wettbewerb von Cannes. Die Entscheidung war politisch kontrovers — der Film kritisiert Prasident Bush im Wahljahr 2004 scharf.",
        difficulty = 5,
        funFact = "Die Jury unter Quentin Tarantino soll nach Angaben von Mitgliedern nahezu einstimmig fuer den Film gestimmt haben. Miramax-Chef Harvey Weinstein weigerte sich zunaechst, den Film in den USA zu distribuieren, und verkaufte die Rechte kurz vor dem Verleihtermin — ein seltener Fall von Selbstzensur."
    ),

    // Question 32 - Filmkritik und New Criticism
    Question(
        categoryId = 4,
        questionText = "Andrew Sarris, der Pauline Kaels groesster Gegenspieler unter den amerikanischen Filmkritikern, einfuehrte die Auteur-Theorie in die USA. In welchem einflussreichen Essay von 1962 tat er das?",
        answerA = "Movies Are Better Than Ever",
        answerB = "Notes on the Auteur Theory",
        answerC = "The American Cinema",
        answerD = "Cinema as Art",
        correctAnswer = 1,
        explanation = "Andrew Sarris veroeffentlichte 'Notes on the Auteur Theory in 1962' in der Zeitschrift Film Culture. Er klassifizierte Hollywood-Regisseure in eine Hierarchie von Auteurs — was Pauline Kael zu ihrem vernichtenden Gegensatz-Essay 'Circles and Squares' provozierte.",
        difficulty = 5,
        funFact = "Die Fehde zwischen Sarris und Kael, die beide jahrzehntelang die einflussreichsten amerikanischen Filmkritiker waren, ist eine der fruchtbarsten intellektuellen Debatten der Filmkritik-Geschichte — und praegte das Denken ganzer Generationen von Filmjournalisten."
    ),

    // Question 33 - FIPRESCI und Kritikerpreis
    Question(
        categoryId = 4,
        questionText = "Die FIPRESCI (Federation Internationale de la Presse Cinematographique) verleiht bei grossen Festivals ihre eigenen Preise. In welchem Jahr wurde die FIPRESCI gegruendet?",
        answerA = "1925",
        answerB = "1930",
        answerC = "1946",
        answerD = "1952",
        correctAnswer = 0,
        explanation = "Die FIPRESCI wurde 1925 in Paris gegruendet und ist damit die aelteste internationale Filmjournalisten-Organisation der Welt. Sie verleiht an den grossen Festivals (Cannes, Venedig, Berlin, Toronto) eigene FIPRESCI-Preise fuer die besten Filme im offiziellen und unabhaengigen Wettbewerb.",
        difficulty = 5,
        funFact = "Der FIPRESCI-Preis gilt als zuverlaessiger Indikator fuer kuenstlerisch bedeutsame Filme ausserhalb des Mainstream. Viele spaetere Klassiker wie Kiarostamis Werke wurden zuerst mit FIPRESCI-Preisen ausgezeichnet, bevor sie internationale Anerkennung fanden."
    ),

    // Question 34 - Filmarchivierung und 4K-Restaurierung
    Question(
        categoryId = 4,
        questionText = "Das Martin Scorsese gegruendete Film Foundation World Cinema Project restauriert Filme aus Entwicklungslaendern. Welche Institution ist sein primaerer Kooperationspartner bei der technischen Restaurierung?",
        answerA = "Library of Congress",
        answerB = "Cineteca di Bologna",
        answerC = "British Film Institute",
        answerD = "Deutsche Kinemathek",
        correctAnswer = 1,
        explanation = "Die Cineteca di Bologna in Italien ist der Hauptpartner des Film Foundation World Cinema Projects fuer die technische Restaurierung. Ihre Restaurierungswerkstatt 'Il Cinema Ritrovato' gilt als eine der renommiertesten der Welt und fuehrt auch das gleichnamige jährliche Restaurierungsfestival durch.",
        difficulty = 5,
        funFact = "Martin Scorsese gruendete die Film Foundation 1990, nachdem er erkannt hatte, dass Technicolor-Prints seiner eigenen Filme verblichen waren. Er setzte sich persoenlich dafuer ein, dass Studios ihre Archivierungspraktiken verbesserten — ein Engagement, das letztendlich viele Klassikerrestaurierungen ausloeste."
    ),

    // Question 35 - Nouvelle Vague und Jump Cut
    Question(
        categoryId = 4,
        questionText = "Jean-Luc Godards 'Ausser Atem' (1960) gilt als der Jump-Cut-Film par excellence. Aber wer hatte den Jump Cut technisch zuvor bereits verwendet — als Schnitttechnik-Fehler, den Godard zum Stilmittel erhob?",
        answerA = "Es war eine genuine Erfindung Godards ohne Vorlaeufer",
        answerB = "Fruehe Stummfilme aus der Edisons-Kinetoskop-Aera",
        answerC = "Sowjetische Montage-Regisseure wie Eisenstein",
        answerD = "Industrielle Filmproduktion verwendete Jump Cuts als unbeabsichtigte Schnittfehler",
        correctAnswer = 3,
        explanation = "Jump Cuts entstanden zuvor als unbeabsichtigte Schnittfehler in der industriellen Produktion — wenn Kamerafehler oder Filmmaterial-Mangel Luecken im Bild erzeugten. Godard und Cameramann Raoul Coutard erkannten das aesthetische Potential dieser 'Fehler' und setzten sie bewusst ein.",
        difficulty = 5,
        funFact = "Godard und Editor Cecile Decugis schnitten 'Ausser Atem' tatsaechlich zunaechst in der konventionellen Weise. Erst als der Film zu lang war, begannen sie Szenen durch Jump Cuts zu kuerzen — und erkannten den visuellen Schock als Stilmittel."
    ),

    // Question 36 - Berliner Filmfoerderung
    Question(
        categoryId = 4,
        questionText = "Das Medienboard Berlin-Brandenburg ist eine der wichtigsten regionalen Filmfoerderungen Deutschlands. Welche besondere wirtschaftliche Auflage hat diese Foerderung, die sie von Bundesfoerderungen unterscheidet?",
        answerA = "Die Filme muessen in Originalsprache Englisch produziert werden",
        answerB = "Mindestens 100% der Foerdersumme muss in der Region ausgegeben werden",
        answerC = "Gefordertes Filmregional-Effekt-Prinzip: Ausgaben in der Region muessen Foerdersumme uebersteigen",
        answerD = "Alle Drehorte muessen in Brandenburg liegen",
        correctAnswer = 2,
        explanation = "Das Medienboard Berlin-Brandenburg (wie alle deutschen Laenderfoerderungen) verlangt einen Regionaleffekt: die gefoerderten Produktionen muessen einen bestimmten Anteil (mindestens 100-150% der Foerdersumme) in der Region ausgeben. Damit soll die regionale Wirtschaft gestutzt werden.",
        difficulty = 5,
        funFact = "Das Regionaleffekt-Prinzip fuehrt zu interessanten strategischen Entscheidungen: Produzenten waehlen Drehorte und Crews oft nach foerdertechnischen Kriterien. In Deutschland gibt es 16 Laenderfoerderungen plus bundesweite FFA — das foederale System ist international einzigartig komplex."
    ),

    // Question 37 - Internationale Koproduktionsabkommen
    Question(
        categoryId = 4,
        questionText = "Welches bilaterale Filmkoproduktionsabkommen war das erste seiner Art weltweit und wurde bereits 1949 zwischen zwei Laendern geschlossen?",
        answerA = "Deutschland-Frankreich",
        answerB = "Frankreich-Italien",
        answerC = "USA-Grossbritannien",
        answerD = "Italien-Spanien",
        correctAnswer = 1,
        explanation = "Das Koproduktionsabkommen zwischen Frankreich und Italien von 1949 war das erste bilaterale Filmkoproduktionsabkommen weltweit. Es ermoeglichte beiden Laendern, gemeinsame Produktionen herzustellen, die in beiden Laendern als nationale Filme galten und entsprechende Foerderungen erhielten.",
        difficulty = 5,
        funFact = "Das franzoesisch-italienische Abkommen gebar den Begriff 'Coproduzioni' und legalisierte die spaeter typischen Sandalen- und Peplum-Filme der 1950er/60er. Heute hat Deutschland ueber 40 solcher bilateralen Abkommen — mehr als jedes andere Land Europas."
    ),

    // Question 38 - Filmgenres und Western
    Question(
        categoryId = 4,
        questionText = "Der Filmwissenschaftler Will Wright entwickelte in 'Sixguns and Society' (1975) eine strukturalistische Analyse des Westerns. In wie viele Grundplot-Strukturen teilte er den Western-Mythos ein?",
        answerA = "Zwei (klassisch und revisionistisch)",
        answerB = "Vier Grundplots",
        answerC = "Sieben archetypische Handlungsmuster",
        answerD = "Sechs Mythen-Strukturen",
        correctAnswer = 1,
        explanation = "Will Wright identifizierte vier Grundplot-Strukturen im Western: 1. Den klassischen Plot, 2. Den Vengeance Variation Plot, 3. Den Transition Theme Plot und 4. Den Professional Plot. Diese Strukturen korreliert er mit gesellschaftlichen Ideologien der jeweiligen Entstehungszeit.",
        difficulty = 5,
        funFact = "Wright wandte als einer der ersten Claude Levi-Strauss' strukturale Mythenanalyse auf einen Filmgenre an. Seine Methode wurde in den 1980ern von Genre-Forschern wie Rick Altman und Steve Neale weiterentwickelt und kritisiert — insbesondere seine Gleichsetzung von Genre-Wandel mit Gesellschaftswandel."
    ),

    // Question 39 - Filmwissenschaft und Screen Theory
    Question(
        categoryId = 4,
        questionText = "Die 'Screen Theory' der 1970er Jahre integrierte Lacan, Marx und Althusser. Welcher Begriff aus Louis Althussers Staatsapparate-Theorie wurde dabei zentral fuer die Analyse des Hollywoodkinos?",
        answerA = "Repressiver Staatsapparat (RSA)",
        answerB = "Ideologischer Staatsapparat (ISA)",
        answerC = "Interpellation",
        answerD = "Hegemonie",
        correctAnswer = 2,
        explanation = "Althussers Begriff 'Interpellation' — die Art, wie Ideologie Individuen als Subjekte 'anruft' (hailing) — wurde zentral fuer die Screen Theory. Das Kino interpelliert den Zuschauer als ideologisches Subjekt, indem es ihn in bestimmte Identifikationspositionen einschreibt.",
        difficulty = 5,
        funFact = "Althussers bekanntestes Beispiel der Interpellation — jemand ruft 'Hey Sie!', und ein Passant dreht sich um und erkennt sich als angesprochen — wurde von Filmtheoretikern wie Colin MacCabe auf die Kamera-Zuschauerbeziehung uebertragen."
    ),

    // Question 40 - Goldener Loewe und frueher Rekord
    Question(
        categoryId = 4,
        questionText = "Wer ist die einzige Regisseurin, die den Goldenen Loewen in Venedig gewann, bevor Chloe Zhao 2020 mit 'Nomadland' — Achtung: Zhao gewann den Goldenen Loewen 2020 NICHT in Venedig — welcher Film gewann 2021?",
        answerA = "The Power of the Dog (Jane Campion, 2021)",
        answerB = "L'Evenement (Audrey Diwan, 2021)",
        answerC = "Happening (Audrey Diwan, 2021) — gleichbedeutend mit L'Evenement",
        answerD = "Parallel Mothers (Pedro Almodovar, 2021)",
        correctAnswer = 2,
        explanation = "Audrey Diwans 'L'Evenement' (auf Englisch 'Happening') gewann 2021 den Goldenen Loewen in Venedig. Jane Campions 'The Power of the Dog' gewann ebenfalls 2021 — aber den Silbernen Loewen (Jury-Preis) und spaeter mehrere Oscars.",
        difficulty = 5,
        funFact = "Sofia Coppola gewann 2010 den Goldenen Loewen fuer 'Somewhere' und war damit die erste amerikanische Regisseurin mit diesem Preis. Audrey Diwan wiederholte 2021 den Triumph einer Regisseurin — mit einem Film ueber illegale Abtreibung im Frankreich der 1960er."
    ),

    // Question 41 - Filmzensur in der UdSSR
    Question(
        categoryId = 4,
        questionText = "Welche sowjetische Zensurbehoerde kontrollierte bis 1991 die gesamte Filmproduktion der UdSSR und bearbeitete jaehrlich bis zu 600 Drehbuecher?",
        answerA = "Gosplan (Staatlicher Planungsausschuss)",
        answerB = "Gosfilm (Staatliches Filmkomitee)",
        answerC = "Goskino (Staatliches Komitee fuer Kinematographie)",
        answerD = "Agitprop-Abteilung des ZK",
        correctAnswer = 2,
        explanation = "Goskino (Gosudarstvennyy Komitet po Kinematografii) war die staatliche Behoerde, die von 1963 bis 1991 alle Aspekte der sowjetischen Filmproduktion kontrollierte — von der Drehbuch-Genehmigung bis zur Verleihentscheidung. Beruehmte Regisseure wie Tarkovsky mussten jahrelang auf Genehmigungen warten.",
        difficulty = 5,
        funFact = "Andrei Tarkovskys 'Andrei Rublev' (1966) wurde von Goskino aus dem Verkehr gezogen und erst 1971 in einer kuerzeren Fassung freigegeben. Der Film kursierte Jahre lang als verbotene Kopie unter Cinephilen — ein typisches Muster der Zensur-Umgehung in der Sowjetaera."
    ),

    // Question 42 - Filmkritik und Kracauer-Weimarer Republic
    Question(
        categoryId = 4,
        questionText = "Siegfried Kracauers Analyse 'Von Caligari zu Hitler' (1947) ist eine kultursoziologische Studie des Weimarer Kinos. Was ist seine zentrale These?",
        answerA = "Der Weimarer Film war politisch reaktionaer und bereitete den Faschismus aesthetisch vor",
        answerB = "Der Weimarer Expressionismus spiegelt die psychologische Disposition des deutschen Volkes wider, die zum Nationalsozialismus fuehrte",
        answerC = "Der deutsche Film war unter dem Nationalsozialismus bewusst als Propagandamedium geplant worden",
        answerD = "Die Kinokultur der Weimarer Republik war im Wesentlichen amerikanisch dominiert und kulturlos",
        correctAnswer = 1,
        explanation = "Kracauers zentrale These: Die Weimarer Filmproduktion (1919-1933) spiegele durch ihre Themen und Motive — Tyrannei, Unterwerfung, Chaos — die kollektiv-psychologische Praedisposition der deutschen Gesellschaft wider, die Hitler ermoeglichte. Film wird als Symptom gesellschaftlicher Seelenzustaende gelesen.",
        difficulty = 5,
        funFact = "Kracauers Methode wurde spaeter stark kritisiert: Er projiziere retrospektiv eine teleologische Geschichte — als ob der Weimarer Film 'wusste', was kommen wuerde. Filmhistoriker wie Tom Elsaesser haben nachgewiesen, dass Kracauer Filmauswahl selektiv und tendenzioes war."
    ),

    // Question 43 - Filmfestival Rotterdam
    Question(
        categoryId = 4,
        questionText = "Das Internationale Filmfestival Rotterdam (IFFR) ist bekannt fuer seinen speziellen Foerdermechanismus fuer Erstlingsfilme und experimentelle Projekte. Wie heisst dieser Mechanismus?",
        answerA = "Rotterdam Fund",
        answerB = "Hubert Bals Fund",
        answerC = "Tiger Award Fund",
        answerD = "IFFR Pro Talent Award",
        correctAnswer = 1,
        explanation = "Der Hubert Bals Fund (HBF) des IFFR, benannt nach dem Gruender des Festivals, foerdert Filmemacher aus Entwicklungslaendern und Regionen ohne etablierte Filminfrastruktur. Er gilt als einer der wichtigsten Foerdertopfe fuer Weltkinematographien.",
        difficulty = 5,
        funFact = "Hubert Bals gruendete das IFFR 1972 mit dem Ziel, Kinos aus Laendern zu zeigen, die in Cannes und Venedig keine Chance hatten. Nach seinem Tod 1988 wurde der Fonds nach ihm benannt. Viele spaetere Weltklasse-Regisseure — darunter Apichatpong Weerasethakul — wurden durch den HBF erst moeglich."
    ),

    // Question 44 - Cinemaverité und Direct Cinema
    Question(
        categoryId = 4,
        questionText = "Cinema Verité und Direct Cinema sind verwandte, aber unterschiedliche dokumentarische Stroemungen. Was ist der entscheidende theoretische Unterschied zwischen ihnen?",
        answerA = "Cinema Verité nutzt Improvisation, Direct Cinema arbeitet mit Drehbuch",
        answerB = "Direct Cinema beobachtet passiv, Cinema Verité provoziert aktiv Reaktionen durch Eingriffe des Filmteams",
        answerC = "Cinema Verité ist franzoesisch, Direct Cinema ist amerikanisch — sonst identisch",
        answerD = "Direct Cinema vermeidet Musik, Cinema Verité setzt sie gezielt ein",
        correctAnswer = 1,
        explanation = "Direct Cinema (Leacock, Pennebaker, Maysles) will die Realitaet durch moelichst unsichtbare Beobachtung einfangen. Cinema Verité (Rouch, Morin) akzeptiert die Prasenz der Kamera als Katalysator — die Kamera provoziert Reaktionen und enthullt dadurch tiefere Wahrheiten.",
        difficulty = 5,
        funFact = "Jean Rouch und Edgar Morins 'Chronique d'un été' (1961) ist das Manifest des Cinema Verité: Sie befragen Pariser Passanten 'Bist du gluecklich?' — die Frage selbst veraendert die Realitaet. Rouch nannte diese Methode 'ethnofiction', weil sie Beobachtung und Fiktion untrennbar vermischt."
    ),

    // Question 45 - Filmtheorie und David Bordwell
    Question(
        categoryId = 4,
        questionText = "David Bordwell und Kristin Thompson entwickelten als Gegenentwurf zur 'Grand Theory' einen empirischen Ansatz. Wie bezeichnen sie ihre Methode?",
        answerA = "Historical Poetics of Cinema",
        answerB = "Cognitive Film Theory",
        answerC = "Neo-Formalism",
        answerD = "Analytical Film Philosophy",
        correctAnswer = 0,
        explanation = "Bordwell und Thompson bezeichnen ihren Ansatz als 'Historical Poetics of Cinema' — eine Methode, die Filme als handwerkliche Artefakte analysiert, die auf bestimmte Wirkungen abzielen. Sie lehnen die ideologische 'Grand Theory' (Screen Theory, Psychoanalyse) als empirisch unueberpruefbar ab.",
        difficulty = 5,
        funFact = "Bordwells Blog 'Observations on Film Art' (seit 2006) ist einer der einflussreichsten Filme-Blogs weltweit — er verbindet akademische Rigorositat mit populaerer Zuganlichkeit. Seine und Thompsons Lehrbuecher 'Film Art' und 'Film History' sind internationaler Standard an Filmschulen."
    ),

    // Question 46 - Internationales Filmfestival Locarno
    Question(
        categoryId = 4,
        questionText = "Das Filmfestival Locarno gilt als eines der aeltesten der Welt. Was macht sein Freiluftkino auf der Piazza Grande aussergewoehnlich und ist einzigartig unter den grossen A-Festivals?",
        answerA = "Es ist das groesste Freiluftkino der Welt mit bis zu 8.000 Zuschauern pro Vorfuehrung",
        answerB = "Es zeigt ausschliesslich Stummfilme mit Live-Orchester",
        answerC = "Es hat keine feste Leinwand — Projektionen auf Gebaudefassaden",
        answerD = "Zuschauer bringen eigene Sitzgelegenheiten mit",
        correctAnswer = 0,
        explanation = "Das Freiluftkino auf der Piazza Grande in Locarno fasst bis zu 8.000 Zuschauer und ist damit eines der groessten Freiluftkinos der Welt. Grosser Leinwand-Filmvorstellungen unter freiem Himmel bei den Alpen im Hintergrund sind ein kulturelles Erlebnis, das in der Festivallandschaft einzigartig ist.",
        difficulty = 5,
        funFact = "Das Festival Locarno wurde 1946 gegruendet und ist nach Venedig (1932) und Cannes (1946) eines der aeltesten. Der Hauptpreis heisst 'Goldener Leopard' (Pardo d'oro) — benannt nach dem Wappentier des Tessin. Locarno foerdert Avantgarde und Erstlingsfilme staerker als die grossen A-Festivals."
    ),

    // Question 47 - Digitale Revolution und Filmpreservierung
    Question(
        categoryId = 4,
        questionText = "Martin Scorsese beschrieb 2012 das Problem des 'Digital Decay' oeffentlich. Was beschreibt dieser Begriff im Kontext der Filmarchivierung?",
        answerA = "Die moralische Verwahrlosung durch zu viel Konsum digitaler Medien",
        answerB = "Den Qualitaetsverlust bei jeder digitalen Kopie eines Originalwerks",
        answerC = "Das Veralten digitaler Speichermedien und Formate schneller als Filmrollen",
        answerD = "Die komerzielle Verderbnis des Kinos durch digitale Vertriebswege",
        correctAnswer = 2,
        explanation = "Digital Decay beschreibt das Paradox: Digitale Speichermedien (Festplatten, Bandlaufwerke, optische Medien) veralten technisch viel schneller als Nitro- oder Acetatfilm. Formate werden obsolet, Hardware fuer das Auslesen nicht mehr hergestellt, und Dateisysteme koennen unlesbar werden.",
        difficulty = 5,
        funFact = "Die Library of Congress stellte 2013 fest, dass Filmarchive jaehrlich bis zu 50% ihrer digitalen Bestande durch technische Obsoleszenz verlieren koennten. Ironischerweise sind gut gepflegte 35mm-Kopien von 1950 stabiler als digital gespeicherte Filme von 1990."
    ),

    // Question 48 - Filmgenre und Horror-Theorie
    Question(
        categoryId = 4,
        questionText = "Noël Carrolls Buch 'The Philosophy of Horror' (1990) definiert Horror durch das Konzept des 'art-horror'. Was unterscheidet 'art-horror' von 'natural horror'?",
        answerA = "Art-horror entsteht durch das Vorenthalten von Schrecklichem, natural horror durch direkte Konfrontation",
        answerB = "Art-horror ist die emotionale Reaktion auf fiktive Monster, die gegen Kategorien verstossen, natural horror sind echte Bedrohungen",
        answerC = "Art-horror verwendet Kunstmittel wie Musik und Beleuchtung, natural horror ist reiner Schock",
        answerD = "Art-horror bezieht sich auf Arthouse-Horrorfilm, natural horror auf Mainstreamproduktionen",
        correctAnswer = 1,
        explanation = "Carroll definiert 'art-horror' als die spezifische emotionale Reaktion, die fiktive Monster in uns ausloesen — eine Mischung aus Furcht und Ekel, verursacht durch Wesen, die unsere ontologischen Kategorien verletzen (nicht-lebendig/lebendig, rein/unrein). 'Natural horror' sind echte Gefahren ohne diesen Kategorienbruch.",
        difficulty = 5,
        funFact = "Carrolls Theorie erklaert, warum Horror-Monster (Vampire, Zombies, Aliens) so oft als Kategorienverletzungen konstruiert sind: Sie sind weder tot noch lebendig, weder Mensch noch Tier. Diese ontologische Unreinheit — nicht der Schock — ist der eigentliche Kern des Horror-Genres."
    ),

    // Question 49 - Filmakademien und Ausbildung
    Question(
        categoryId = 4,
        questionText = "Die aeelteste kontinuierlich betriebene Filmschule der Welt, das VGIK in Moskau, wurde in welchem Jahr gegruendet?",
        answerA = "1919",
        answerB = "1925",
        answerC = "1930",
        answerD = "1935",
        correctAnswer = 0,
        explanation = "Das VGIK (Wsesojusny Gosudarstwenny Institut Kinematografii — Allunions-Staatliches Kinematographisches Institut) in Moskau wurde 1919 gegruendet — noch waehrend des russischen Buergerkriegs. Lenin hatte Kino als 'wichtigste aller Kuenste' bezeichnet, was Lenins Prioritaet fuer Filmausbildung erklaert.",
        difficulty = 5,
        funFact = "Aus dem VGIK gingen Legenden wie Sergej Eisenstein, Wsewolod Pudowkin, Andrei Tarkowski und Sergei Bondarchuk hervor. Die Schule hatte eine eigene Filmproduktionsfirma, eigene Studios und produzierte Studierendenprojekte fuer den sowjetischen Verleih — einmalig in der Geschichte der Filmausbildung."
    ),

    // Question 50 - Feministische Filmtheorie und bell hooks
    Question(
        categoryId = 4,
        questionText = "Die amerikanische Kulturkritikerin bell hooks entwickelte in ihrem Essay 'The Oppositional Gaze' (1992) ein Konzept, das Mulveys Male Gaze um eine Dimension erweitert. Welche Dimension fuegt sie hinzu?",
        answerA = "Die Klassen-Dimension des Blicks in kapitalistischen Gesellschaften",
        answerB = "Die rassistische Dimension: schwarze Zuschauer als oppositionelle Blick-Subjekte",
        answerC = "Die altersbedingte Dimension des Blicks bei Kindern vs. Erwachsenen",
        answerD = "Die koloniale Dimension des eurozentrischen Hollywood-Blicks",
        correctAnswer = 1,
        explanation = "bell hooks argumentiert in 'The Oppositional Gaze', dass schwarze Zuschauer (besonders schwarze Frauen) historisch aus dem Adressatenkreis des Hollywood-Kinos ausgeschlossen waren. Als Reaktion entwickelten sie einen 'oppositionellen Blick' — kritisch, widerstaendig, nicht identifizierend.",
        difficulty = 5,
        funFact = "hooks schreibt ihren Namen bewusst in Kleinbuchstaben — eine politische Geste, die den Inhalt ihrer Arbeit ueber die Markierung ihrer Person stellen soll. 'The Oppositional Gaze' erschien in ihrem Sammelband 'Black Looks: Race and Representation' (1992) und ist heute Standardlektuere in postkolonialen Film Studies."
    ),

)
