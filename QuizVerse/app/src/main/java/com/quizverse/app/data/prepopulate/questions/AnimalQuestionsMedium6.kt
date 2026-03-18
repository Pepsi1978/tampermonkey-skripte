package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsMedium6(): List<Question> = listOf(

    // MEDIUM (difficulty = 2) -- Mixed Animal World

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist das schnellste Landtier der Erde?",
        answerA = "Loewe",
        answerB = "Gepard",
        answerC = "Gabelbock",
        answerD = "Springbok",
        correctAnswer = 1,
        explanation = "Der Gepard erreicht Spitzengeschwindigkeiten von bis zu 120 km/h und ist damit das schnellste Landtier. Er kann diese Geschwindigkeit jedoch nur kurze Zeit halten.",
        difficulty = 2,
        funFact = "Der Gepard braucht nur drei Sekunden, um von 0 auf 100 km/h zu beschleunigen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat das groesste Gehirn im Verhaeltnis zur Koerpergroesse?",
        answerA = "Elefant",
        answerB = "Delfin",
        answerC = "Ameise",
        answerD = "Kraehe",
        correctAnswer = 2,
        explanation = "Delfine haben im Verhaeltnis zu ihrer Koerpergroesse eines der groessten Gehirne aller Tiere. Dies haengt mit ihrer hochentwickelten Intelligenz und komplexen sozialen Strukturen zusammen.",
        difficulty = 2,
        funFact = "Delfine schlafen mit nur einer Gehirnhaelfte gleichzeitig, damit sie nicht ertrinken."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie kommunizieren Bienen, um den anderen Bienen den Weg zu einer Nahrungsquelle zu zeigen?",
        answerA = "Durch Duftstoffe",
        answerB = "Durch Vibration der Fluegel",
        answerC = "Durch den Schwanzeltanz",
        answerD = "Durch Lautgebung",
        correctAnswer = 2,
        explanation = "Bienen verwenden den Schwanzeltanz (Waggle Dance), um Richtung und Entfernung einer Nahrungsquelle zu kommunizieren. Die Richtung des Tanzes zeigt den Winkel zur Sonne an.",
        difficulty = 2,
        funFact = "Karl von Frisch entschluesselte den Bienentanz 1944 und erhielt dafuer 1973 den Nobelpreis."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter Mimikry im Tierreich?",
        answerA = "Die Faehigkeit, Toene nachzuahmen",
        answerB = "Die Nachahmung eines anderen Tieres zur Verteidigung oder zum Angriff",
        answerC = "Das Vortaeuschen des Todes",
        answerD = "Die Anpassung der Koerperfarbe an den Untergrund",
        correctAnswer = 1,
        explanation = "Mimikry ist die Nachahmung eines anderen Tieres. Ein harmloses Tier ahmt ein gefaehrliches oder ungeniessbares Tier nach, um Fressfeinde abzuschrecken.",
        difficulty = 2,
        funFact = "Die Schwebfliege ahmt das Aussehen einer Biene nach, ist aber voellig harmlos und stachellos."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier lebt am laengsten?",
        answerA = "Gruenlandbogenkopfwal",
        answerB = "Galapagos-Riesenschildkroete",
        answerC = "Groenlaendischer Eishai",
        answerD = "Europaeischer Hummer",
        correctAnswer = 2,
        explanation = "Der Groenlaendische Eishai kann bis zu 400 Jahre alt werden und ist damit das laengst lebende Wirbeltier. Das aelteste bekannte Exemplar wurde auf etwa 392 Jahre geschaetzt.",
        difficulty = 2,
        funFact = "Groenlaendische Eishaie werden erst nach etwa 150 Jahren geschlechtsreif."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Symbiose im Tierreich?",
        answerA = "Der Kampf zweier Arten um dasselbe Revier",
        answerB = "Das Zusammenleben zweier Arten zum gegenseitigen Vorteil",
        answerC = "Die Abhaengigkeit eines Tieres von einem anderen ohne Gegenleistung",
        answerD = "Die Jagd in Gruppen",
        correctAnswer = 1,
        explanation = "Symbiose bezeichnet das Zusammenleben zweier verschiedener Arten, bei dem beide Partner Vorteile haben. Ein klassisches Beispiel ist das Verhaltnis zwischen Krokodil und Krokodilwaechter-Vogel.",
        difficulty = 2,
        funFact = "Der Clownfisch und die Seeanemone sind ein bekanntes Beispiel fuer Symbiose: Der Fisch schuetzt die Anemone, diese bietet ihm Unterschlupf."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann seinen Arm regenerieren, wenn er abgetrennt wird?",
        answerA = "Eidechse",
        answerB = "Axolotl",
        answerC = "Seestern",
        answerD = "Planaria-Plattwurm",
        correctAnswer = 2,
        explanation = "Der Seestern ist in der Lage, abgetrennte Arme vollstaendig zu regenerieren. Manche Arten koennen sogar aus einem einzigen Arm einen neuen vollstaendigen Seestern wachsen lassen.",
        difficulty = 2,
        funFact = "Axolotl koennen sogar Teile ihres Herzens und Gehirns regenerieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches ist das schwerste Tier, das jemals auf der Erde gelebt hat?",
        answerA = "Argentinosaurus",
        answerB = "Blauwal",
        answerC = "Afrikanischer Elefant",
        answerD = "Paraceratherium",
        correctAnswer = 1,
        explanation = "Der Blauwal ist das schwerste Tier, das jemals auf der Erde gelebt hat. Er kann bis zu 180 Tonnen wiegen und 30 Meter lang werden.",
        difficulty = 2,
        funFact = "Das Herz eines Blauwals ist so gross wie ein kleines Auto und schlaegt nur etwa 8 bis 10 Mal pro Minute."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie orientieren sich Zugvoegel auf ihrer Reise?",
        answerA = "Ausschliesslich nach dem Sonnenstand",
        answerB = "Durch Duftstoffe in der Luft",
        answerC = "Mithilfe des Erdmagnetfeldes und der Sterne",
        answerD = "Durch den Luftdruck",
        correctAnswer = 2,
        explanation = "Zugvoegel verwenden mehrere Navigationsmethoden: das Erdmagnetfeld, Sterne, Sonnenstand und Landmarken. Viele Voegel haben magnetosensitive Zellen, die als interner Kompass dienen.",
        difficulty = 2,
        funFact = "Arktisseeschwalben legen den laengsten Zugweg aller Tiere zurueck: bis zu 90.000 km pro Jahr zwischen Arktis und Antarktis."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Alligator und einem Krokodil?",
        answerA = "Alligatoren sind groesser",
        answerB = "Krokodile haben ein breiteres Maul",
        answerC = "Bei geschlossenem Maul sind beim Krokodil die Zaehne sichtbar, beim Alligator nicht",
        answerD = "Alligatoren leben ausschliesslich in Salzwasser",
        correctAnswer = 2,
        explanation = "Bei Krokodilen ist bei geschlossenem Maul der vierte untere Zahn sichtbar, waehrend bei Alligatoren alle Zaehne verborgen bleiben. Ausserdem haben Alligatoren ein breiteres, U-foermiges Maul.",
        difficulty = 2,
        funFact = "Krokodile koennen ihren Herzschlag fast vollstaendig anhalten und stundenlang unter Wasser bleiben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier wird als erstes domestiziertes Tier des Menschen angesehen?",
        answerA = "Schaf",
        answerB = "Rind",
        answerC = "Hund",
        answerD = "Pferd",
        correctAnswer = 2,
        explanation = "Der Hund gilt als erstes vom Menschen domestiziertes Tier. Die Domestizierung begann vor etwa 15.000 bis 40.000 Jahren aus dem Wolf heraus.",
        difficulty = 2,
        funFact = "DNA-Analysen zeigen, dass alle Hunde von einer einzigen Population grauer Woelfe abstammen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Parasit?",
        answerA = "Ein Tier, das in Symbiose mit einem anderen lebt",
        answerB = "Ein Organismus, der auf Kosten eines anderen lebt und ihm schadet",
        answerC = "Ein Tier, das sich von Aas ernaehrt",
        answerD = "Eine Art, die einen anderen Lebensraum besetzt",
        correctAnswer = 1,
        explanation = "Ein Parasit lebt auf oder in einem anderen Organismus (dem Wirt) und schadet ihm dabei. Im Gegensatz zur Symbiose profitiert nur der Parasit von dieser Beziehung.",
        difficulty = 2,
        funFact = "Etwa 40 % aller Tierarten sind Parasiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann am weitesten sehen?",
        answerA = "Adler",
        answerB = "Falke",
        answerC = "Geier",
        answerD = "Eule",
        correctAnswer = 0,
        explanation = "Adler haben eine extrem scharfe Sehkraft und koennen ihre Beute aus einer Entfernung von bis zu 3 Kilometern sehen. Ihre Sehschaerfe ist etwa 4 bis 8 Mal besser als die des Menschen.",
        difficulty = 2,
        funFact = "Adler haben zwei Foveae (Stellen hoechster Sehschaerfe) in jedem Auge, Menschen nur eine."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier kann fliegen?",
        answerA = "Fliegender Hund",
        answerB = "Flieghoernchen",
        answerC = "Fledermaus",
        answerD = "Kolibri",
        correctAnswer = 2,
        explanation = "Die Fledermaus ist das einzige Saeugetier, das aktiv fliegen kann. Flieghoernchen gleiten nur, waehrend Fledermaeuse echten Schlagflug mit ihren Fluegeln aus Hautmembranen ausfuehren.",
        difficulty = 2,
        funFact = "Fledermaeuse machen ca. 20 % aller Saeugetierarten aus und es gibt ueber 1.400 Fledermausarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter Echolotung (Echolokation) bei Tieren?",
        answerA = "Die Faehigkeit, Erdbeben wahrzunehmen",
        answerB = "Die Orientierung durch ausgesendete Schallwellen und deren Echo",
        answerC = "Die Kommunikation durch Infraschall",
        answerD = "Das Erkennen von Beute durch Elektrosensoren",
        correctAnswer = 1,
        explanation = "Echolokation ist die Faehigkeit, Ultraschallwellen auszusenden und anhand des zurueckgeworfenen Echos die Umgebung zu kartieren. Fledermaeuse und Wale nutzen dieses System.",
        difficulty = 2,
        funFact = "Delfine koennen durch Echolokation selbst kleine Objekte in truebem Wasser praezise orten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Zoo ist der aelteste noch bestehende Zoo der Welt?",
        answerA = "Berliner Zoo",
        answerB = "Londoner Zoo",
        answerC = "Schoenbrunn Zoo in Wien",
        answerD = "Pariser Zoo",
        correctAnswer = 2,
        explanation = "Der Tiergarten Schoenbrunn in Wien wurde 1752 gegruendet und ist der aelteste noch bestehende Zoo der Welt. Er wurde urspruenglich als kaiserlicher Menagerie angelegt.",
        difficulty = 2,
        funFact = "Der Schoenbrunn Zoo ist seit 1992 mit dem Zoo-Zertifikat der EAZA ausgezeichnet und fuehrt aktive Zuchtprogramme fuer bedrohte Tierarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat den staerksten Biss aller Tiere?",
        answerA = "Grossen Weissen Hai",
        answerB = "Nil-Krokodil",
        answerC = "Hyaene",
        answerD = "Bullenhai",
        correctAnswer = 1,
        explanation = "Das Nil-Krokodil hat mit einer Beisskreaft von bis zu 22.000 Newton den staerksten Biss aller lebenden Tiere. Das entspricht etwa 2,2 Tonnen Druckkraft.",
        difficulty = 2,
        funFact = "Trotz des starken Bisses sind die Muskeln zum Oeffnen des Mauls sehr schwach - man kann ein Krokodilmaul mit blossen Haenden zuhalten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Merkmal eines Wiederkaeuer-Tieres?",
        answerA = "Es hat zwei Magen",
        answerB = "Es kaeuut seine Nahrung mehrmals, nachdem es sie bereits heruntergeschluckt hat",
        answerC = "Es ernaehrt sich ausschliesslich von Gras",
        answerD = "Es schlaeft stehend",
        correctAnswer = 1,
        explanation = "Wiederkaeuer schlingen ihre Nahrung zunachst hinunter, wuergen sie spaeter wieder hoch und kauen sie erneut. Sie haben einen mehrteiligen Magen mit vier Kammern.",
        difficulty = 2,
        funFact = "Kuehe verbringen taeglich etwa 8 Stunden damit, ihr Futter wiederzukauen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier gilt als das giftigste der Welt?",
        answerA = "Schwarze Mamba",
        answerB = "Boxqualle",
        answerC = "Goldfrosch",
        answerD = "Pfeilgiftfrosch",
        correctAnswer = 1,
        explanation = "Die Boxqualle (Seewespe) gilt als das giftigste Tier der Welt. Ihr Gift kann innerhalb von Minuten zum Tod fuehren und es gibt kein wirksames Gegengift.",
        difficulty = 2,
        funFact = "Eine Boxqualle hat bis zu 60 Tentakel mit je etwa 5.000 Nesselzellen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Biolumineszenz bei Tieren?",
        answerA = "Die Faehigkeit, Licht zu absorbieren und waerme zu erzeugen",
        answerB = "Die Faehigkeit, selbst Licht zu produzieren",
        answerC = "Die Reflexion von Mondlicht",
        answerD = "Die Wahrnehmung von ultraviolettem Licht",
        correctAnswer = 1,
        explanation = "Biolumineszenz ist die Faehigkeit von Lebewesen, durch chemische Reaktionen selbst Licht zu erzeugen. Tiefseefische, Gluhwuermchen und manche Quallenarten sind bekannte Beispiele.",
        difficulty = 2,
        funFact = "Etwa 76 % aller Tiefseeorganismen sind biolumineszent."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie schlaeft ein Delfin?",
        answerA = "Vollstaendig wie Landtiere",
        answerB = "Gar nicht, er ruht nur kurz",
        answerC = "Mit einer Gehirnhaelfte, waehrend die andere wach bleibt",
        answerD = "Auf dem Meeresgrund",
        correctAnswer = 2,
        explanation = "Delfine schlafen mit nur einer Gehirnhaelfte gleichzeitig. Dieses unihemisphaerische Schlafen ermoeglicht es ihnen, weiterhin zu atmen und Gefahren wahrzunehmen.",
        difficulty = 2,
        funFact = "Auch Zugvoegel koennen im Flug mit einer Gehirnhaelfte schlafen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist der einzige bekannte Vogel, der seinen Schnabel mit dem Kopf nach unten benutzt?",
        answerA = "Pelikan",
        answerB = "Loeffler",
        answerC = "Flamingo",
        answerD = "Tukanvogel",
        correctAnswer = 2,
        explanation = "Der Flamingo ist der einzige Vogel, der seine Nahrung mit umgedrehtem Kopf filtert. Sein Schnabel ist speziell dafuer angepasst, Wasser und Schlamm herauszufiltern.",
        difficulty = 2,
        funFact = "Flamingos stehen oft auf einem Bein, vermutlich um Koerperwaerme zu sparen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches ist das einzige Saeugetier mit Schuppen?",
        answerA = "Stachelschwein",
        answerB = "Schuppentier (Pangolin)",
        answerC = "Guerteltier",
        answerD = "Igel",
        correctAnswer = 1,
        explanation = "Das Schuppentier (Pangolin) ist das einzige Saeugetier, dessen Koerper mit Hornschuppen bedeckt ist. Diese Schuppen bestehen aus Keratin, dem gleichen Material wie menschliche Fingernagel.",
        difficulty = 2,
        funFact = "Schuppentiere sind die am meisten illegal gehandelten Saeugetiere der Welt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist eine Futternische (oekologische Nische)?",
        answerA = "Der Schlafplatz eines Tieres",
        answerB = "Die Gesamtheit der Bedingungen, die eine Art zum Ueberleben benoetigt",
        answerC = "Das Territorium eines Tieres",
        answerD = "Die Wanderroute eines Zugtieres",
        correctAnswer = 1,
        explanation = "Die oekologische Nische beschreibt die Rolle und Position einer Art in ihrem Oekosystem, einschliesslich ihrer Nahrungsquellen, Lebensraumanforderungen und Interaktionen mit anderen Arten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier ist am staerksten vom Aussterben bedroht?",
        answerA = "Bengalischer Tiger",
        answerB = "Amur-Leopard",
        answerC = "Eisbär",
        answerD = "Breitmaulnashorn",
        correctAnswer = 1,
        explanation = "Der Amur-Leopard gilt als eine der am staerksten vom Aussterben bedrohten Grosskatzen der Welt. In freier Wildbahn gibt es nur noch etwa 100 Exemplare in Russland und China.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tierart wurde von Charles Darwin bei seinen Galapagos-Beobachtungen besonders studiert?",
        answerA = "Galapagos-Schildkroeten",
        answerB = "Blauftlpel-Toelpel",
        answerC = "Darwinfinken",
        answerD = "Meerechsen",
        correctAnswer = 2,
        explanation = "Die Darwinfinken auf den Galapagos-Inseln zeigten Darwin, wie sich eine gemeinsame Vorfahrenart in verschiedene Arten mit unterschiedlichen Schnabelformen aufgespalten hatte. Dies war ein Schluessel zur Evolutionstheorie.",
        difficulty = 2,
        funFact = "Es gibt 18 anerkannte Arten von Darwinfinken, die sich alle von einer gemeinsamen Vorfahrenart entwickelt haben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Affen und einem Menschenaffen?",
        answerA = "Menschenaffen sind groesser",
        answerB = "Menschenaffen haben keinen Schwanz und ein groesseres Gehirn",
        answerC = "Affen leben in der Alten Welt, Menschenaffen in der Neuen Welt",
        answerD = "Menschenaffen sind fleischfressend",
        correctAnswer = 1,
        explanation = "Menschenaffen (Gorilla, Schimpanse, Orang-Utan, Gibbon) haben keinen Schwanz und ein im Verhaeltnis groesseres Gehirn als Affen. Sie sind auch enger mit dem Menschen verwandt.",
        difficulty = 2,
        funFact = "Der Schimpanse teilt etwa 98,7 % seiner DNA mit dem Menschen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie gross ist die Spannweite des Wanderalbatros, des Vogels mit der groessten Fluegelspannweite?",
        answerA = "Bis zu 2 Meter",
        answerB = "Bis zu 2,5 Meter",
        answerC = "Bis zu 3,5 Meter",
        answerD = "Bis zu 4,5 Meter",
        correctAnswer = 2,
        explanation = "Der Wanderalbatros hat mit bis zu 3,5 Metern die groesste Fluegelspannweite aller lebenden Voegel. Dank dieser Fluegelform kann er stundenlang ohne Flugelschlag gleiten.",
        difficulty = 2,
        funFact = "Junge Albatrosse verbringen die ersten 5 bis 10 Jahre ihres Lebens auf See, ohne jemals Land zu betreten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Tarnung (Kryptis) im Tierreich?",
        answerA = "Das Vortaeuschen von Verletzungen",
        answerB = "Die Anpassung an einen giftigen Artgenossen",
        answerC = "Die Anpassung des Aeusseren an die Umgebung, um unsichtbar zu werden",
        answerD = "Das Aussendern von Warnsignalen",
        correctAnswer = 2,
        explanation = "Tarnung (Kryptis) bezeichnet die Anpassung von Farbe, Muster oder Form eines Tieres an seine Umgebung, um fuer Feinde oder Beute schwer sichtbar zu sein.",
        difficulty = 2,
        funFact = "Der Oktopus kann innerhalb von Millisekunden seine Farbe und Textur aendern, um sich perfekt zu tarnen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel legt die groessten Eier der Welt?",
        answerA = "Pinguin",
        answerB = "Nandu",
        answerC = "Straussenvogel",
        answerD = "Kondor",
        correctAnswer = 2,
        explanation = "Der Strausse legt die groessten Eier aller lebenden Voegel. Ein Strauss-Ei kann bis zu 1,5 kg wiegen und hat ein Volumen von etwa 1,5 Litern.",
        difficulty = 2,
        funFact = "Trotz seiner Groesse ist das Strausse-Ei im Verhaeltnis zur Koerpergroesse des Vogels das kleinste Ei aller Voegel."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier macht die laengste Migration aller Landtiere?",
        answerA = "Gnuwildebeest",
        answerB = "Karibu",
        answerC = "Zebra",
        answerD = "Elefant",
        correctAnswer = 1,
        explanation = "Das Karibu (Rentier) in Nordamerika legt die laengste Landmigration aller Saeugetiere zurueck. Einige Herden wandern bis zu 5.000 km pro Jahr.",
        difficulty = 2,
        funFact = "Das Gnu macht zwar nicht die laengste, aber die groesste Massenmigration aller Landtiere: Bis zu 1,5 Millionen Gnus ziehen durch die Serengeti."
    ),

    Question(
        categoryId = 9,
        questionText = "Warum sind viele naechtliche Tiere (wie Katzen) in der Lage, im Dunkeln zu sehen?",
        answerA = "Sie haben mehr Zapfen in der Netzhaut",
        answerB = "Sie haben eine lichtreflektierende Schicht (Tapetum lucidum) hinter der Netzhaut",
        answerC = "Ihre Pupillen sind permanent weit geoeffnet",
        answerD = "Sie sehen durch Infrarotstrahlung",
        correctAnswer = 1,
        explanation = "Viele naechtliche Tiere haben ein Tapetum lucidum, eine reflektierende Schicht hinter der Netzhaut, die Licht zurueckwirft und es dem Auge ermoeglicht, es ein zweites Mal zu nutzen.",
        difficulty = 2,
        funFact = "Das Tapetum lucidum ist der Grund, warum Katzenaugen im Dunkeln leuchten, wenn man sie anleuchtet."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie wird der Prozess genannt, bei dem ein Tier im Winter in einen tiefen Schlafzustand faellt?",
        answerA = "Ruheschlaf",
        answerB = "Torpor",
        answerC = "Winterschlaf (Hibernation)",
        answerD = "Ruhestarre",
        correctAnswer = 2,
        explanation = "Winterschlaf (Hibernation) ist ein Zustand stark reduzierter Koerpertemperatur, Herzfrequenz und Stoffwechsel, der manchen Tieren ermoeglicht, den Winter zu ueberleben. Echter Winterschlaf ist tiefer als Winterruhe.",
        difficulty = 2,
        funFact = "Igel koennen waehrend des Winterschlafs ihre Koerpertemperatur auf fast die Umgebungstemperatur absenken."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann seinen Kopf um 270 Grad drehen?",
        answerA = "Kraehe",
        answerB = "Eule",
        answerC = "Chamaeleo",
        answerD = "Mantis",
        correctAnswer = 1,
        explanation = "Eulen koennen ihren Kopf um bis zu 270 Grad drehen. Da ihre Augen fest in den Augenhohlen sitzen und nicht bewegt werden koennen, kompensieren sie dies durch die extreme Kopfdrehung.",
        difficulty = 2,
        funFact = "Eulen haben besondere Blutgefaesse, die verhindern, dass bei extremer Kopfdrehung der Blutfluss zum Gehirn unterbrochen wird."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das charakteristische Merkmal von Kloakentieren (Monotremata)?",
        answerA = "Sie sind die einzigen giftigen Saeugetiere",
        answerB = "Sie sind eierlegen und saeugen dennoch ihren Nachwuchs",
        answerC = "Sie haben ein Beutel wie Kanguruhs",
        answerD = "Sie koennen fliegen",
        correctAnswer = 1,
        explanation = "Kloakentiere wie das Schnabeltier und der Ameisenigel sind die einzigen Saeugetiere, die Eier legen. Dennoch ernaehren sie ihren Nachwuchs mit Muttermilch und sind echte Saeugetiere.",
        difficulty = 2,
        funFact = "Das maennliche Schnabeltier ist eines der wenigen giftigen Saeugetiere: Es hat einen Giftstachel an den Hinterbeinen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier lebt in einem Kommensal-Verhaeltnis?",
        answerA = "Hund und Floh",
        answerB = "Seeanemone und Clownfisch",
        answerC = "Geier und Loewe",
        answerD = "Baumsteiger-Froschlurch und Pflanzenmaterial",
        correctAnswer = 2,
        explanation = "Kommensalismus bezeichnet eine Beziehung, bei der ein Partner profitiert und dem anderen weder nuetzt noch schadet. Ein Beispiel sind Geier, die Reste von Loewenmahlzeiten fressen, ohne dem Loewen zu schaden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist konvergente Evolution?",
        answerA = "Die Weiterentwicklung zu immer komplexeren Formen",
        answerB = "Die unabhaengige Entwicklung aehnlicher Merkmale in nicht verwandten Arten",
        answerC = "Die Rueckentwicklung von Merkmalen",
        answerD = "Die gemeinsame Entwicklung zweier symbiontischer Arten",
        correctAnswer = 1,
        explanation = "Konvergente Evolution bezeichnet das Phaenomen, dass nicht verwandte Tierarten unabhaengig voneinander aehnliche Merkmale entwickeln, weil sie aehnlichen Umweltbedingungen ausgesetzt sind.",
        difficulty = 2,
        funFact = "Delfin und Hai haben aehnliche Koerperformen, sind aber nicht verwandt: Dies ist ein klassisches Beispiel konvergenter Evolution."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann die laengste Zeit ohne Wasser ueberleben?",
        answerA = "Kamel",
        answerB = "Wuestenigel",
        answerC = "Kenguhratte",
        answerD = "Afrikanischer Lungenfisch",
        correctAnswer = 3,
        explanation = "Der afrikanische Lungenfisch kann in einem Schlamm-Kokon eingekapselt bis zu 4 Jahre ohne Wasser ueberleben. Er verlangsamt seinen Stoffwechsel drastisch und atmet Luft.",
        difficulty = 2,
        funFact = "Das Kamel kann tatsaechlich bis zu 15 Tage ohne Wasser auskommen, der Lungenfisch haelt jedoch den Rekord fuer Wirbeltiere."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet Insekten von anderen Gliedertieren?",
        answerA = "Sie haben 8 Beine",
        answerB = "Sie haben immer 6 Beine und 3 Koerperabschnitte",
        answerC = "Sie sind ausschliesslich Landtiere",
        answerD = "Sie haben einen Exoskelett aus Kalk",
        correctAnswer = 1,
        explanation = "Insekten sind durch drei Koerperabschnitte (Kopf, Brust, Hinterleib) und sechs Beine definiert. Ihr Exoskelett besteht aus Chitin, nicht aus Kalk.",
        difficulty = 2,
        funFact = "Es gibt etwa 10 Trillionen (10 hoch 19) Insekten auf der Erde, was sie zur zahlreichsten Tiergruppe macht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiere haben das komplexeste Sozialleben?",
        answerA = "Nacktmulls",
        answerB = "Schimpansen",
        answerC = "Woelfe",
        answerD = "Elefanten",
        correctAnswer = 0,
        explanation = "Nacktmulls (Heterocephalus glaber) haben eine faszinierende eusoziale Gesellschaftsstruktur aehnlich wie Bienen und Ameisen: Nur eine Koenigin reproduziert, waehrend der Rest der Kolonie Arbeiter- und Waechterfunktionen uebernimmt.",
        difficulty = 2,
        funFact = "Nacktmulls sind quasi schmerzunempfindlich, fast krebsimmun und werden bis zu 30 Jahre alt - aussergewoehnlich lang fuer ein so kleines Saeugetier."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier kann seine Koerpertemperatur aktiv regulieren?",
        answerA = "Schlange",
        answerB = "Krokodil",
        answerC = "Eidechse",
        answerD = "Thunfisch",
        correctAnswer = 3,
        explanation = "Thunfische sind einer der wenigen Fische, die ihre Koerpertemperatur teilweise aktiv regulieren koennen. Durch ein spezielles Waermetauschersystem koennen sie ihre Muskeln waermer halten als das umgebende Wasser.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was bedeutet der Begriff 'endotherm'?",
        answerA = "Tiere, die keine Koerperwaerme produzieren",
        answerB = "Tiere, die Koerperwaerme durch den eigenen Stoffwechsel erzeugen (Warmbluter)",
        answerC = "Tiere, die in heissen Umgebungen leben",
        answerD = "Tiere mit sehr niedrigem Stoffwechsel",
        correctAnswer = 1,
        explanation = "Endotherme Tiere (Warmbluter) erzeugen ihre Koerperwaerme durch den eigenen Stoffwechsel und koennen sie regulieren. Saeuge- und Voegel sind endotherm, Reptilien und Amphibien ektotherm.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat die groessten Augen im Verhaeltnis zur Koerpergroesse?",
        answerA = "Eule",
        answerB = "Tarsier",
        answerC = "Chamaeleo",
        answerD = "Kolossal-Tintenfisch",
        correctAnswer = 1,
        explanation = "Der Tarsier, ein kleiner Primat Suedostasiens, hat die groessten Augen im Verhaeltnis zur Koerpergroesse aller Saeugetiere. Jedes Auge ist groesser als sein gesamtes Gehirn.",
        difficulty = 2,
        funFact = "Der Tarsier kann seine Augen nicht bewegen, kompensiert dies aber durch eine extreme Kopfdrehung von fast 180 Grad."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Ozean ist der Lebensraum des Koboldkalmars, der tiefsten lebenden Tintenfisch-Art?",
        answerA = "Pazifischer Ozean",
        answerB = "Atlantischer Ozean",
        answerC = "Indischer Ozean",
        answerD = "Alle Weltmeere",
        correctAnswer = 3,
        explanation = "Der Koboldkalmar (Vampyroteuthis infernalis) kommt in allen Weltmeeren in Tiefen von 600 bis 900 Metern vor. Er ist kein echter Tintenfisch, sondern eine eigene Ordnung.",
        difficulty = 2,
        funFact = "Der Koboldkalmar kann sein gesamtes Aussehen veraendern und sogar die Tentakel nach innen ueberst lpen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter einem 'Leitartikelfossil' (Leitfossil)?",
        answerA = "Ein Fossil, das eine fehlende Entwicklungsstufe belegt",
        answerB = "Ein Fossil, das typisch fuer eine bestimmte Erdperiode ist und zur Datierung von Gesteinsschichten dient",
        answerC = "Ein Fossil eines ausgestorbenen Raubtiers",
        answerD = "Das aelteste bekannte Fossil einer Art",
        correctAnswer = 1,
        explanation = "Leitfossilien sind Fossilien, die fuer eine bestimmte geologische Zeitperiode charakteristisch sind. Wegen ihrer weiten Verbreitung und ihrer kurzen Existenzzeit helfen sie Geologen, Gesteinsschichten zu datieren.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiergruppe war die erste, die das Land besiedelte?",
        answerA = "Amphibien",
        answerB = "Insekten",
        answerC = "Reptilien",
        answerD = "Spinnentiere",
        correctAnswer = 3,
        explanation = "Spinnentiere (Arachnida) und andere Gliedertiere waren die ersten Tiere, die das Land besiedelten, etwa vor 430 Millionen Jahren. Fische und Tetrapoden kamen erst deutlich spaeter.",
        difficulty = 2,
        funFact = "Die ersten Landpflanzen erschienen etwa gleichzeitig mit den ersten Landtieren, was die Besiedelung des Landes ermoeglichte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Schmetterling legt seine Eier ausschliesslich auf Brennnesseln?",
        answerA = "Zitronenfalter",
        answerB = "Tagpfauenauge",
        answerC = "Kohlweissling",
        answerD = "Schwalbenschwanz",
        correctAnswer = 1,
        explanation = "Das Tagpfauenauge legt seine Eier ausschliesslich auf Brennnesseln, da die Raupen sich nur von Brennnesselblaetern ernaehren. Dies ist ein Beispiel fuer eine spezialisierte Wirt-Parasit-Beziehung.",
        difficulty = 2,
        funFact = "Das Tagpfauenauge ueberwintert als adulter Schmetterling, was in Europa ungewoehnlich ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie laeuft die Kommunikation bei Woelfen hauptsaechlich ab?",
        answerA = "Nur durch Heulen",
        answerB = "Durch Duftstoffe, Koerpersprache und Lautgebung kombiniert",
        answerC = "Hauptsaechlich durch visuelle Signale",
        answerD = "Durch Beruehrungen",
        correctAnswer = 1,
        explanation = "Woelfe kommunizieren durch ein komplexes System aus Duftstoffen (Markierung), Koerpersprache (Schwanzposition, Ohrenstellung) und Lautgebung (Heulen, Knurren, Bellen). Kein einzelnes Signal genuegt allein.",
        difficulty = 2,
        funFact = "Das Heulen eines Wolfes kann bis zu 10 Kilometer weit gehoert werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das CITES-Abkommen im Zusammenhang mit Tieren?",
        answerA = "Ein Vertrag zur Einrichtung von Nationalparks",
        answerB = "Ein internationales Abkommen zum Schutz bedrohter Arten vor uebermaessigem Handel",
        answerC = "Ein Protokoll fuer den Austausch von Zoo-Tieren",
        answerD = "Ein wissenschaftliches Klassifizierungssystem fuer Tierarten",
        correctAnswer = 1,
        explanation = "CITES (Convention on International Trade in Endangered Species) ist ein internationales Abkommen, das den Handel mit bedrohten Tier- und Pflanzenarten reguliert, um ihr Ueberleben zu sichern.",
        difficulty = 2,
        funFact = "CITES wurde 1963 gegr-ndet und schuetzt heute mehr als 38.000 Tier- und Pflanzenarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat das dickste Fell aller Meeressaeugetiere?",
        answerA = "Seehund",
        answerB = "Seeotter",
        answerC = "Seeloewe",
        answerD = "Belugawal",
        correctAnswer = 1,
        explanation = "Der Seeotter hat mit bis zu einer Million Haare pro Quadratzentimeter das dichteste Fell aller Saeugetiere. Da er keine isolierende Fettschicht hat, isoliert das Fell ihn vor dem Kalten Meerwasser.",
        difficulty = 2,
        funFact = "Seeotter schlafen auf dem Wasser und halten sich aneinander fest oder wickeln sich in Meeresalgen, damit sie nicht von Stroemungen wegtreiben."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das besondere an der Fortpflanzung des Seepferchens?",
        answerA = "Es legt die groessten Eier aller Fische",
        answerB = "Das Maennchen tragt und gebaert den Nachwuchs",
        answerC = "Es vermehrt sich ausschliesslich durch Knospung",
        answerD = "Es ist das einzige monogame Fischpaar",
        correctAnswer = 1,
        explanation = "Beim Seepferdchen ist das Maennchen derjenige, der den Nachwuchs in einem Brutbeutel austraegt und zur Welt bringt. Die Weibchen uebertragen die Eier in den Beutel des Maennchens.",
        difficulty = 2,
        funFact = "Ein maennliches Seepferdchen kann in einer einzigen Geburt bis zu 1.500 Jungtiere zur Welt bringen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Faehigkeit von Tieren wie dem Opossum, sich tot zu stellen?",
        answerA = "Katalepsie",
        answerB = "Thanatose",
        answerC = "Nekromimese",
        answerD = "Torporstarre",
        correctAnswer = 1,
        explanation = "Thanatose (auch Totstellreflex) ist das Vortaeuschen des Todes als Schutzreaktion gegen Fressfeinde. Viele Fressfeinde verschmaehen totes Fleisch oder werden durch die Bewegungslosigkeit verwirrt.",
        difficulty = 2,
        funFact = "Das Virginia-Opossum ist der Namensgeber des englischen Ausdrucks 'playing possum', der das Vortaeuschen von Schwaeche oder Tod bedeutet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier hat das beste Gehoer aller Saeugetiere?",
        answerA = "Fledermaus",
        answerB = "Hund",
        answerC = "Katze",
        answerD = "Groesser Wachtelkoenig",
        correctAnswer = 0,
        explanation = "Fledermaeuse haben das empfindlichste Gehoer aller Saeugetiere. Sie koennen Ultraschall bis zu 200.000 Hz wahrnehmen (Menschen nur bis 20.000 Hz) und nutzen dies fuer die Echolokation.",
        difficulty = 2,
        funFact = "Grosse Fledermaeuse haben teilweise Ohren, die groesser sind als ihr gesamter Koerper."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Besondere am Okapi, einem Verwandten der Giraffe?",
        answerA = "Es ist das groesste Tier Afrikas",
        answerB = "Es hat Zebrastreifen an den Beinen, ist aber mit der Giraffe verwandt",
        answerC = "Es kann schwimmen wie ein Nilpferd",
        answerD = "Es lebt ausschliesslich auf Baumkronen",
        correctAnswer = 1,
        explanation = "Das Okapi sieht mit seinen gestreiften Beinen wie eine Kreuzung aus Giraffe und Zebra aus, ist aber der einzige lebende Verwandte der Giraffe. Es lebt im Regenwald des Kongobeckens.",
        difficulty = 2,
        funFact = "Das Okapi wurde von der Wissenschaft erst im Jahr 1901 entdeckt - sehr spaet fuer ein so grosses Tier."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie ernaehrt sich die Venusfliegenfalle, und welche Tiere faengt sie hauptsaechlich?",
        answerA = "Sie ernaehrt sich von kleinen Voegeln",
        answerB = "Sie ernaehrt sich von Insekten und kleinen Spinnen",
        answerC = "Sie ernaehrt sich von Mikroorganismen im Boden",
        answerD = "Sie ist eine fleischfressende Pflanze, die Menschen gefaehrlich werden kann",
        correctAnswer = 1,
        explanation = "Die Venusfliegenfalle ernaehrt sich hauptsaechlich von Insekten und kleinen Spinnen. Sie ist eine fleischfressende Pflanze, keine Tierart, und schnappt durch schnelle Turgordruckaenderungen zu.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Leguan und einem Chamaeleo?",
        answerA = "Leguane koennen ihre Farbe wechseln, Chamaeleons nicht",
        answerB = "Leguane sind wasserlebend, Chamaeleons baumslebend",
        answerC = "Chamaeleons haben Greiffuesse, Zungenwurfzungen und unabhaengige Augen; Leguane sind robust gebaut",
        answerD = "Leguane sind nur in Amerika heimisch, Chamaeleons weltweit",
        correctAnswer = 2,
        explanation = "Chamaeleons unterscheiden sich durch ihre Greiffuesse, die ausserordentlich lange Klebezunge, unabhaengig bewegbare Augen und Farbwechselfaehigkeit. Leguane sind robuster und haben keine dieser Spezialisierungen.",
        difficulty = 2,
        funFact = "Chamaeleons wechseln ihre Farbe hauptsaechlich zur Kommunikation und Thermoregulation, nicht zur Tarnung wie oft angenommen."
    ),

)
