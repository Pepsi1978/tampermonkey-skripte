package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsEasy1(): List<Question> = listOf(

    // Question 1 — Redewendung: Holzweg
    Question(
        categoryId = 11,
        questionText = "Was bedeutet die Redewendung \"auf dem Holzweg sein\"?",
        answerA = "Im Wald spazieren gehen",
        answerB = "Sehr gute Laune haben",
        answerC = "Mit dem Fahrrad fahren",
        answerD = "Einen Fehler machen oder falsch liegen",
        correctAnswer = 3,
        explanation = "\"Auf dem Holzweg sein\" bedeutet, falsch zu liegen oder einen Irrtum zu begehen. Der Holzweg war ursprünglich ein Waldweg, der nur zum Holzeinschlag führte und nirgendwo weiter hinaus.",
        difficulty = 1,
        funFact = "Wer früher einem Holzweg folgte, kam in eine Sackgasse mitten im Wald — es gab kein Dorf und kein Ziel am Ende."
    ),

    // Question 2 — Erfindung: Aspirin
    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde Aspirin erfunden?",
        answerA = "USA",
        answerB = "Schweiz",
        answerC = "Deutschland",
        answerD = "Frankreich",
        correctAnswer = 2,
        explanation = "Aspirin wurde 1897 vom deutschen Chemiker Felix Hoffmann beim Pharmaunternehmen Bayer in Deutschland entwickelt. Es ist eines der meistverkauften Medikamente der Welt.",
        difficulty = 1,
        funFact = "Felix Hoffmann soll Aspirin auch deshalb entwickelt haben, weil er seinem Vater helfen wollte, der unter starken Gelenkschmerzen litt."
    ),

    // Question 3 — Alltagswissen: Ampelfarben
    Question(
        categoryId = 11,
        questionText = "Welche Farbe kommt bei einer deutschen Ampel zwischen Rot und Grün?",
        answerA = "Gelb",
        answerB = "Orange",
        answerC = "Weiss",
        answerD = "Blau",
        correctAnswer = 0,
        explanation = "Bei deutschen Ampeln leuchtet nach Rot die Kombination Rot-Gelb auf, bevor es auf Grün wechselt. Das Gelb warnt Fahrer, dass sie sich auf das Anfahren vorbereiten sollen.",
        difficulty = 1,
        funFact = "In manchen Ländern wie Japan gibt es statt Grün offiziell Blau als Ampelfarbe — das liegt an historischen Sprachunterschieden."
    ),

    // Question 4 — Brauch: Nikolaus
    Question(
        categoryId = 11,
        questionText = "An welchem Tag bringt der Nikolaus Kindern in Deutschland Suessigkeiten in den Schuh?",
        answerA = "5. Dezember",
        answerB = "6. Dezember",
        answerC = "24. Dezember",
        answerD = "1. Dezember",
        correctAnswer = 1,
        explanation = "Der Nikolaustag wird in Deutschland am 6. Dezember gefeiert. Kinder stellen am Vorabend (5. Dezember) ihre Schuhe vor die Tuer, die dann in der Nacht vom Nikolaus mit Suessigkeiten gefüllt werden.",
        difficulty = 1,
        funFact = "Der historische Nikolaus war Bischof von Myra in der heutigen Türkei und gilt als Schutzheiliger der Kinder und Seeleute."
    ),

    // Question 5 — Redewendung: Tuchfuehlung
    Question(
        categoryId = 11,
        questionText = "Woher stammt der Begriff \"auf Tuchfuehlung gehen\"?",
        answerA = "Vom Weben von Stoffen im Mittelalter",
        answerB = "Vom Einkaufen auf dem Markt",
        answerC = "Vom Händeschütteln bei Diplomaten",
        answerD = "Vom engen Nebeneinandertreten von Soldaten",
        correctAnswer = 3,
        explanation = "\"Auf Tuchfuehlung gehen\" stammt vom Militaer: Soldaten standen beim Antreten so eng nebeneinander, dass sich das Tuch ihrer Uniformen beruehrte. Heute bedeutet es, sich jemanden koerperlich oder gedanklich anzunähern.",
        difficulty = 1,
        funFact = "Viele deutsche Redewendungen kommen aus dem Militaer- oder Handwerksleben des 17. und 18. Jahrhunderts."
    ),

    // Question 6 — Kuriosität: Post-it
    Question(
        categoryId = 11,
        questionText = "Wie entstand die Idee für den Post-it-Klebezettel?",
        answerA = "Ein Klebstoff wurde erfunden, der nicht richtig haftete",
        answerB = "Ein Sekretaer wollte Notizen besser sortieren",
        answerC = "Ein Architekt brauchte einen Marker für Bauplänemerkungen",
        answerD = "Kinder klebten Papier an Fenster",
        correctAnswer = 0,
        explanation = "Der Post-it entstand 1968, als Spencer Silver bei 3M versehentlich einen schwach haftenden Klebstoff entwickelte. Erst 1974 erkannte sein Kollege Arthur Fry den Nutzen: Er klebte damit Lesezeichen in sein Gesangbuch.",
        difficulty = 1,
        funFact = "Ursprünglich wollte niemand bei 3M das Produkt vermarkten. Erst als Muster an Sekretaerinnen verteilt wurden, wurde die Nachfrage so gross, dass es 1980 offiziell eingeführt wurde."
    ),

    // Question 7 — Sprache: Umlaute
    Question(
        categoryId = 11,
        questionText = "Wie viele Umlaute gibt es im deutschen Alphabet?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Das deutsche Alphabet hat drei Umlaute: ae, oe und ue. Dazu kommt noch das Sonderzeichen sz (Eszett), das aber kein Umlaut ist.",
        difficulty = 1,
        funFact = "Das Eszett gibt es nur in der deutschen Sprache. Es entstand aus der Ligatur der Buchstaben s und z im Mittelalter."
    ),

    // Question 8 — Erfindung: Druckerpresse
    Question(
        categoryId = 11,
        questionText = "Wer erfand den Buchdruck mit beweglichen Lettern?",
        answerA = "Martin Luther",
        answerB = "Leonardo da Vinci",
        answerC = "Johannes Gutenberg",
        answerD = "Isaac Newton",
        correctAnswer = 2,
        explanation = "Johannes Gutenberg aus Mainz erfand um 1450 den Buchdruck mit beweglichen Metalllettern. Diese Erfindung revolutionierte die Verbreitung von Wissen und gilt als eine der wichtigsten Erfindungen der Menschheitsgeschichte.",
        difficulty = 1,
        funFact = "Dank Gutenbergs Erfindung konnten Bücher erstmals massenweise produziert werden. Vorher musste jedes Buch von Hand abgeschrieben werden."
    ),

    // Question 9 — Alltag: Briefkasten-Farbe
    Question(
        categoryId = 11,
        questionText = "Welche Farbe haben Briefkästen der Deutschen Post?",
        answerA = "Rot",
        answerB = "Blau",
        answerC = "Grün",
        answerD = "Gelb",
        correctAnswer = 3,
        explanation = "Die Briefkästen der Deutschen Post sind traditionell gelb. Diese Farbe wurde gewaehlt, um sie gut sichtbar zu machen. Das Gelb der Post ist sogar als eigene Farbe \"Postgelb\" bekannt.",
        difficulty = 1,
        funFact = "In Grossbritannien sind Briefkästen rot, in Frankreich gelb, in Schweden blau — jedes Land hat seine eigene Posttradition."
    ),

    // Question 10 — Rekord: Biersorten
    Question(
        categoryId = 11,
        questionText = "Wie viele Biersorten gibt es in Deutschland ungefähr?",
        answerA = "Etwa 500",
        answerB = "Etwa 1.500",
        answerC = "Etwa 5.000",
        answerD = "Über 7.000",
        correctAnswer = 3,
        explanation = "In Deutschland gibt es über 7.000 verschiedene Biersorten. Das Reinheitsgebot von 1516 — das aelteste noch gültige Lebensmittelgesetz der Welt — regelt bis heute die Zutaten für deutsches Bier.",
        difficulty = 1,
        funFact = "Das Reinheitsgebot von 1516 erlaubt als Zutaten für Bier nur Wasser, Malz, Hopfen und Hefe."
    ),

    // Question 11 — Redewendung: Schweinehund
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"den inneren Schweinehund überwinden\"?",
        answerA = "Sich überwinden, etwas Unangenehmmes zu tun",
        answerB = "Einem Tier begegnen",
        answerC = "Ein Streit mit einem Nachbarn",
        answerD = "Einen langen Weg gehen",
        correctAnswer = 0,
        explanation = "\"Den inneren Schweinehund überwinden\" bedeutet, seine eigene Faulheit oder Bequemlichkeit zu bekaempfen und sich zu einer ungeliebten Aufgabe aufzuraffen. Der \"Schweinehund\" steht dabei für den faulen Teil in uns.",
        difficulty = 1,
        funFact = "Der Begriff stammt aus dem 19. Jahrhundert und war ursprünglich ein Schimpfwort für einen niedertraechtigen Menschen — erst später wurde er zum Symbol innerer Treibheit."
    ),

    // Question 12 — Erfindung: Foen
    Question(
        categoryId = 11,
        questionText = "Wann und in welchem Land wurde der elektrische Foen erfunden?",
        answerA = "1908 in Deutschland",
        answerB = "1920 in den USA",
        answerC = "1895 in Frankreich",
        answerD = "1930 in England",
        correctAnswer = 0,
        explanation = "Der elektrische Foen wurde 1908 von der deutschen Firma AEG erfunden. Das Wort \"Foen\" ist eigentlich ein Markenname, der zum Allgemeinbegriff wurde — aehnlich wie Tempo oder Tesa.",
        difficulty = 1,
        funFact = "\"Foen\" ist auch der Name eines warmen Fallwinds in den Alpen. Das Geraet wurde nach diesem Wind benannt, weil es warme Luft produziert."
    ),

    // Question 13 — Brauch: Karneval
    Question(
        categoryId = 11,
        questionText = "In welcher Stadt findet traditionell der größte Karnevalszug in Deutschland statt?",
        answerA = "Muenchen",
        answerB = "Hamburg",
        answerC = "Köln",
        answerD = "Berlin",
        correctAnswer = 2,
        explanation = "Köln ist Deutschlands Karnevalshochburg. Der Kölner Karnevalszug am Rosenmontag ist der größte in Deutschland. Die Kölner nennen ihren Karneval liebevoll \"de Fastelovend\".",
        difficulty = 1,
        funFact = "Beim Kölner Karneval werden pro Jahr mehrere Tonnen Kamelle (Suessigkeiten) vom Rosenmontagszug in die Menge geworfen."
    ),

    // Question 14 — Sprache: Wortlänge
    Question(
        categoryId = 11,
        questionText = "Für welche Eigenschaft ist die deutsche Sprache weltweit bekannt?",
        answerA = "Besonders kurze Sätze",
        answerB = "Viele Tonhöhen wie im Chinesischen",
        answerC = "Keine Pluralformen",
        answerD = "Sehr lange zusammengesetzte Wörter",
        correctAnswer = 3,
        explanation = "Deutsch ist weltberuehmt für seine langen zusammengesetzten Wörter (Komposita). Einzelne Wörter können dabei aus vielen Teilwörtern bestehen und sehr lang werden.",
        difficulty = 1,
        funFact = "Das längste jemals amtlich verwendete deutsche Wort war \"Rindfleischetikettierungsüberwachungsaufgabenübertragungsgesetz\" mit 63 Buchstaben — ein saechsisches Gesetz zur Rindfleischaftskontrolle."
    ),

    // Question 15 — Kuriosität: Niesen
    Question(
        categoryId = 11,
        questionText = "Was ist beim Niesen physisch nahezu unmöglich?",
        answerA = "Gleichzeitig zu sprechen",
        answerB = "Die Augen offen zu halten",
        answerC = "Aufrecht zu stehen",
        answerD = "Zu schreien",
        correctAnswer = 1,
        explanation = "Es ist quasi unmöglich, beim Niesen die Augen offen zu halten. Ein Reflex schliesst die Augenlider automatisch, um sie vor herausspritzenden Partikeln zu schützen.",
        difficulty = 1,
        funFact = "Ein Nies kann Partikel mit bis zu 160 km/h herausschleudern und bis zu 8 Meter weit fliegen lassen."
    ),

    // Question 16 — Alltagswissen: Banknoten
    Question(
        categoryId = 11,
        questionText = "Welche Symbole sind auf Euro-Banknoten abgebildet?",
        answerA = "Bücher und Schreibfedern",
        answerB = "Baumarten aus Europa",
        answerC = "Fenster, Tore und Brücken",
        answerD = "Buergermeister europaeischer Staedte",
        correctAnswer = 2,
        explanation = "Euro-Banknoten zeigen stilisierte Fenster und Tore (Vorderseite als Sinnbild für Offenheit) sowie Brücken (Rückseite als Symbol für Verbindung zwischen Menschen). Sie sind fiktiv und stellen keine echten Bauwerke dar.",
        difficulty = 1,
        funFact = "Als der Euro eingeführt wurde, mussten die Motive absichtlich fiktiv gestaltet werden, damit kein einzelnes europaeisches Land bevorzugt würde."
    ),

    // Question 17 — Brauch: Maibaum
    Question(
        categoryId = 11,
        questionText = "Was ist ein Maibaum?",
        answerA = "Ein geschmückter Baum oder Mast, der am 1. Mai aufgestellt wird",
        answerB = "Ein besonderes Frühlingsgemuese",
        answerC = "Ein traditionelles Holzspielzeug",
        answerD = "Eine Tanztradition aus Norddeutschland",
        correctAnswer = 0,
        explanation = "Der Maibaum ist ein geschmückter Holzmast oder Baum, der traditionell am 1. Mai in Bayern und anderen sueddeutschen Regionen aufgestellt wird. Er symbolisiert Frühling und Gemeinschaft.",
        difficulty = 1,
        funFact = "In Bayern ist es ein alter Brauch, dass Burschen aus Nachbarorten heimlich den Maibaum \"stehlen\" — wer seinen Baum bewacht, spart das Loesegeld."
    ),

    // Question 18 — Erfindung: Telefon
    Question(
        categoryId = 11,
        questionText = "Wer gilt als Erfinder des Telefons?",
        answerA = "Thomas Edison",
        answerB = "Alexander Graham Bell",
        answerC = "Nikola Tesla",
        answerD = "Guglielmo Marconi",
        correctAnswer = 1,
        explanation = "Alexander Graham Bell meldete am 7. März 1876 das erste Patent für ein Telefon an. Sein erstes Gespraech mit seinem Assistenten Watson gilt als historisch: \"Mr. Watson, come here, I want to see you.\"",
        difficulty = 1,
        funFact = "Elisha Gray reichte am selben Tag wie Bell sein Patent ein — Bell war nur wenige Stunden früher beim Patentamt."
    ),

    // Question 19 — Alltagswissen: Unglückstag
    Question(
        categoryId = 11,
        questionText = "An welchem Tag soll man laut deutschem Volksglauben NICHT heiraten?",
        answerA = "Montag",
        answerB = "Samstag",
        answerC = "Freitag der 13.",
        answerD = "Mittwoch",
        correctAnswer = 2,
        explanation = "Freitag der 13. gilt in Deutschland als Unglückstag, und Hochzeiten an diesem Tag werden von abergläubischen Menschen gemieden. Der Ursprung liegt in christlichen Traditionen — am Freitag wurde Jesus gekreuzigt.",
        difficulty = 1,
        funFact = "In anderen Kulturen ist Freitag ein Glückstag: Im Islam ist der Freitag der heiligste Wochentag."
    ),

    // Question 20 — Redewendung: Abkupfern
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"etwas abkupfern\"?",
        answerA = "Kupfer schmelzen",
        answerB = "Jemanden um Geld bitten",
        answerC = "Einen Fehler verstecken",
        answerD = "Etwas kopieren oder abschreiben",
        correctAnswer = 3,
        explanation = "\"Abkupfern\" bedeutet, etwas unerlaubt zu kopieren oder abzuschreiben. Das Wort stammt aus dem Mittelalter, als Kunstwerke durch Kupferstiche vervielfaeltigt wurden.",
        difficulty = 1,
        funFact = "Kupferstiche waren die erste Technik zur Massenvervielfaeltigung von Bildern — jeder Stich nutzte dabei eine gravierte Kupferplatte als Druckvorlage."
    ),

    // Question 21 — Brauch: Silvester
    Question(
        categoryId = 11,
        questionText = "Warum heisst der 31. Dezember \"Silvester\"?",
        answerA = "Nach einem römischen Kaiser",
        answerB = "Nach Papst Silvester I., der an diesem Tag starb",
        answerC = "Es ist ein alter germanischer Naturgott",
        answerD = "Nach dem Astronomen Silvio Vester",
        correctAnswer = 1,
        explanation = "Der 31. Dezember heisst Silvester nach Papst Silvester I., der am 31. Dezember 335 n. Chr. starb. In der katholischen Kirche ist dies sein Namenstag.",
        difficulty = 1,
        funFact = "In manchen Regionen Deutschlands ist es Brauch, zu Silvester Blei zu giessen und die Formen als Orakel für das neue Jahr zu deuten."
    ),

    // Question 22 — Kuriosität: Eisbaren
    Question(
        categoryId = 11,
        questionText = "Welche Fellfarbe haben Eisbaren in Wirklichkeit?",
        answerA = "Transparent und farblos",
        answerB = "Weiss",
        answerC = "Hellgrau",
        answerD = "Gelblich",
        correctAnswer = 0,
        explanation = "Das Fell des Eisbaeren ist eigentlich transparent und farblos, nicht weiss. Die weisse Erscheinung entsteht durch die Streuung von Licht. Die Haut darunter ist schwarz.",
        difficulty = 1,
        funFact = "Es wurde früher vermutet, dass Eisbaerenhaare Sonnenlicht wie Glasfasern zur Haut leiten. Das hat sich jedoch als Mythos herausgestellt."
    ),

    // Question 23 — Persoenlichkeit: Einstein
    Question(
        categoryId = 11,
        questionText = "In welcher Stadt wurde Albert Einstein geboren?",
        answerA = "Berlin",
        answerB = "Muenchen",
        answerC = "Ulm",
        answerD = "Frankfurt",
        correctAnswer = 2,
        explanation = "Albert Einstein wurde am 14. März 1879 in Ulm, Wuerttemberg, geboren. Er gilt als einer der bedeutendsten Physiker aller Zeiten und entwickelte die Relativitätstheorie.",
        difficulty = 1,
        funFact = "Als Kind sprach Einstein so spät, dass seine Eltern sich Sorgen machten. Er sprach mit sich selbst und wiederholte Sätze, bevor er sie aussprach."
    ),

    // Question 24 — Alltagswissen: Schaltjahr
    Question(
        categoryId = 11,
        questionText = "Wie oft gibt es ein Schaltjahr mit dem 29. Februar?",
        answerA = "Jedes Jahr",
        answerB = "Alle 2 Jahre",
        answerC = "Alle 10 Jahre",
        answerD = "Alle 4 Jahre",
        correctAnswer = 3,
        explanation = "Ein Schaltjahr findet alle vier Jahre statt. Der zusätzliche Tag (29. Februar) wird eingefuegt, um den Kalender mit dem Sonnenjahr zu synchronisieren, da ein Jahr eigentlich 365,25 Tage hat.",
        difficulty = 1,
        funFact = "Wer am 29. Februar geboren wird, feiert seinen \"echten\" Geburtstag also nur alle vier Jahre. In Nicht-Schaltjahren feiern sie meist am 28. Februar oder 1. März."
    ),

    // Question 25 — Redewendung: Spiessrutenlaufen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Spiessrutenlaufen\"?",
        answerA = "Einen Hindernisparcours absolvieren",
        answerB = "Durch harsche Kritik vieler Menschen gehen",
        answerC = "Beim Laufen stolpern",
        answerD = "Einen langen Weg ohne Pause zurücklegen",
        correctAnswer = 1,
        explanation = "\"Spiessrutenlaufen\" bedeutet, starker Kritik oder Verurteilung vieler Menschen ausgesetzt zu sein. Die Redewendung stammt aus einer mittelalterlichen Militaerstrafe, bei der der Verurteilte durch eine Gasse laufen musste, während er von Soldaten geschlagen wurde.",
        difficulty = 1,
        funFact = "Die Spiessrute war ein Holzstock von etwa einem Meter Länge. Die Strafe wurde in europaeischen Armeen bis ins 19. Jahrhundert angewendet."
    ),

    // Question 26 — Erfindung: Kaffeefilter
    Question(
        categoryId = 11,
        questionText = "Wer erfand den Kaffeefilter?",
        answerA = "Melitta Bentz aus Dresden",
        answerB = "Eine englische Graefin",
        answerC = "Ein französischer Koch",
        answerD = "Ein Schweizer Arzt",
        correctAnswer = 0,
        explanation = "Melitta Bentz erfand 1908 in Dresden den Kaffeefilter. Sie war unzufrieden mit dem Kaffeesatz in ihrer Tasse und bohrte Loecher in eine Blechdose, die sie mit Loeschpapier auskleidete.",
        difficulty = 1,
        funFact = "Melitta Bentz gründete daraufhin ein eigenes Unternehmen — die Firma Melitta existiert noch heute und ist weltbekannt für Kaffeefilter und Kaffeezubehör."
    ),

    // Question 27 — Alltagswissen: Daumen hoch
    Question(
        categoryId = 11,
        questionText = "Was bedeutet in Deutschland ein Daumen hoch?",
        answerA = "Stop",
        answerB = "Ich brauche Hilfe",
        answerC = "Alles gut / Zustimmung",
        answerD = "Ich bin fertig",
        correctAnswer = 2,
        explanation = "Ein Daumen hoch ist ein universelles Zeichen für Zustimmung, Lob oder \"alles ist gut\". In vielen Ländern wird es als positives Signal verwendet.",
        difficulty = 1,
        funFact = "Der Ursprung des Daumen-Zeichens ist umstritten. Eine Theorie besagt, dass es aus dem römischen Gladiatorenkampf stammt, aber historische Belege dafür sind schwach."
    ),

    // Question 28 — Brauch: Ostereier
    Question(
        categoryId = 11,
        questionText = "Welche Farbe hatten Ostereier im Mittelalter typischerweise?",
        answerA = "Weiss",
        answerB = "Bunt bemalt",
        answerC = "Gelb",
        answerD = "Rot",
        correctAnswer = 3,
        explanation = "Im Mittelalter wurden Ostereier hauptsaechlich rot gefärbt. Die rote Farbe symbolisierte das Blut Jesu und die Auferstehung. Erst später wurden sie bunt bemalt.",
        difficulty = 1,
        funFact = "Die aeltesten bekannten bemalten Ostereier stammen aus der Ukraine und sind über 2.000 Jahre alt."
    ),

    // Question 29 — Sprache: Denglisch
    Question(
        categoryId = 11,
        questionText = "Was versteht man unter dem Begriff \"Denglisch\"?",
        answerA = "Ein Dialekt aus Norddeutschland",
        answerB = "Die Mischung aus deutschen und englischen Wörtern",
        answerC = "Eine veraltete Form des Mittelhochdeutschen",
        answerD = "Deutsch für Denker und Philosophen",
        correctAnswer = 1,
        explanation = "\"Denglisch\" bezeichnet die Vermischung der deutschen Sprache mit englischen Wörtern und Ausdrücken. Beispiele sind Wörter wie \"downloaden\", \"mailen\" oder \"chillen\".",
        difficulty = 1,
        funFact = "Der Verein Deutsche Sprache zählt regelmäßig englische Wörter, die sich im Deutschen festgesetzt haben. Seit den 1990er Jahren hat sich ihre Zahl deutlich erhöht."
    ),

    // Question 30 — Kuriosität: Nationaltier Schottland
    Question(
        categoryId = 11,
        questionText = "Was ist das offizielle Nationaltier von Schottland?",
        answerA = "Das Einhorn",
        answerB = "Der rote Hirsch",
        answerC = "Der goldene Adler",
        answerD = "Die Wildkatze",
        correctAnswer = 0,
        explanation = "Das offizielle Nationaltier Schottlands ist das Einhorn. Es steht seit dem 12. Jahrhundert als Symbol für Reinheit und Kraft im schottischen Wappen.",
        difficulty = 1,
        funFact = "Im schottischen Wappen ist das Einhorn mit einer goldenen Kette gefesselt — weil Einhörner als so mächtig galten, dass sie gefesselt werden mussten, um keine Gefahr darzustellen."
    ),

    // Question 31 — Erfindung: Ampel
    Question(
        categoryId = 11,
        questionText = "Wo wurde die erste elektrische Ampel der Welt aufgestellt?",
        answerA = "London",
        answerB = "Paris",
        answerC = "New York",
        answerD = "Cleveland, Ohio",
        correctAnswer = 3,
        explanation = "Die erste elektrische Strassenampel der Welt wurde am 5. August 1914 in Cleveland, Ohio (USA) installiert. Sie hatte damals nur zwei Farben: Rot und Grün.",
        difficulty = 1,
        funFact = "Die erste Ampel in Deutschland stand 1924 in Hamburg. Der Potsdamer Platz in Berlin bekam 1924 die beruehmdeste frühe Ampelanlage Deutschlands."
    ),

    // Question 32 — Alltagswissen: Briefmarke
    Question(
        categoryId = 11,
        questionText = "Welche Information muss zwingend auf einem Briefumschlag stehen, damit er ankommt?",
        answerA = "Absender und Geburtsdatum",
        answerB = "Farbe des Umschlags und Inhalt",
        answerC = "Empfaenger-Adresse und Briefmarke",
        answerD = "Datum und Uhrzeit des Absenders",
        correctAnswer = 2,
        explanation = "Für eine zuverlaessige Zustellung braucht ein Brief die vollständige Empfaenger-Adresse mit Postleitzahl sowie eine gültige Briefmarke. Der Absender ist nur für die Rücksendung wichtig.",
        difficulty = 1,
        funFact = "Die Briefmarke wurde 1840 in Grossbritannien erfunden. Die erste Marke hiess \"Penny Black\" und zeigte das Portraet von Königin Victoria."
    ),

    // Question 33 — Brauch: Aberglaube Spiegel
    Question(
        categoryId = 11,
        questionText = "Was soll laut deutschem Volksglauben passieren, wenn man einen Spiegel zerbricht?",
        answerA = "Drei Jahre Pech",
        answerB = "Sieben Jahre Unglück",
        answerC = "Ein Wunsch geht in Erfüllung",
        answerD = "Man bekommt besondere Kräfte",
        correctAnswer = 1,
        explanation = "Laut deutschem Volksglauben bringt ein zerbrochener Spiegel sieben Jahre Unglück. Dieser Aberglaube hat seine Wurzeln in der Antike, wo Spiegel als Fenster zur Seele galten.",
        difficulty = 1,
        funFact = "Im alten Rom glaubte man, dass sich das Leben alle sieben Jahre erneuert — daher die Zahl sieben beim Spiegel-Aberglaube."
    ),

    // Question 34 — Redewendung: Kater
    Question(
        categoryId = 11,
        questionText = "Woher kommt der Begriff \"Kater\" für das Unwohlsein nach zu viel Alkohol?",
        answerA = "Vom Studentenwort \"Katarrh\" für Erkrankungen",
        answerB = "Von der Katze, die sich nach schlechten Erfahrungen zurückzieht",
        answerC = "Von einem Berliner Schankwirt namens Kater",
        answerD = "Vom griechischen Wort für Kopfschmerzen",
        correctAnswer = 0,
        explanation = "\"Kater\" ist eine mundartliche Verformung des Wortes \"Katarrh\" (Schleimhautentzündung). Die Bezeichnung bezog sich auf die Symptome wie Halskratzen und Unwohlsein, die einem Katarrh aehneln.",
        difficulty = 1,
        funFact = "Im Mittelhochdeutschen nannte man diesen Zustand auch \"das Jammern\" oder \"das Unglück des nächsten Morgens\"."
    ),

    // Question 35 — Persoenlichkeit: Beethoven
    Question(
        categoryId = 11,
        questionText = "In welcher Stadt wurde Ludwig van Beethoven geboren?",
        answerA = "Wien",
        answerB = "Berlin",
        answerC = "Hamburg",
        answerD = "Bonn",
        correctAnswer = 3,
        explanation = "Ludwig van Beethoven wurde am 17. Dezember 1770 in Bonn (damals Kurköln) geboren. Er zog als junger Mann nach Wien, wo er den Grossteil seines Lebens verbrachte und seine beruehmdesten Werke schuf.",
        difficulty = 1,
        funFact = "Beethoven wurde taub, komponierte aber trotzdem weiter. Seine berühmte 9. Sinfonie schrieb er, als er bereits vollständig ertaubt war."
    ),

    // Question 36 — Alltag: Wochentage Herkunft
    Question(
        categoryId = 11,
        questionText = "Warum heisst der \"Mittwoch\" so?",
        answerA = "Weil er in der Mitte der Woche liegt",
        answerB = "Nach dem germanischen Gott Wotan",
        answerC = "Nach dem Planeten Merkur",
        answerD = "Nach einem römischen Kaiser",
        correctAnswer = 0,
        explanation = "Mittwoch heisst so, weil er in der Mitte der Woche liegt. Im Englischen heisst er \"Wednesday\" nach dem germanischen Gott Wotan/Wodin.",
        difficulty = 1,
        funFact = "Donnerstag ist nach dem germanischen Donnergott Thor benannt (engl. Thursday = Thor's Day), und Freitag nach der Göttin Freya."
    ),

    // Question 37 — Kuriosität: Oktoberfest Monat
    Question(
        categoryId = 11,
        questionText = "In welchem Monat beginnt das Muenchner Oktoberfest meistens?",
        answerA = "Oktober",
        answerB = "August",
        answerC = "September",
        answerD = "November",
        correctAnswer = 2,
        explanation = "Trotz des Namens beginnt das Oktoberfest meistens im September und endet erst Anfang Oktober. Das erste Oktoberfest fand am 12. Oktober 1810 statt, aber später wurde es verlegt, um besseres Wetter zu nutzen.",
        difficulty = 1,
        funFact = "Das allererste Oktoberfest war eine Hochzeitsfeier: Es wurde anlaesslich der Hochzeit von Kronprinz Ludwig von Bayern und Prinzessin Therese veranstaltet."
    ),

    // Question 38 — Sprache: Kindergarten
    Question(
        categoryId = 11,
        questionText = "Aus welcher Sprache stammt das weltweit verwendete Wort \"Kindergarten\"?",
        answerA = "Es ist ein deutsches Wort",
        answerB = "Aus dem Latein",
        answerC = "Aus dem Französischen",
        answerD = "Aus dem Japanischen",
        correctAnswer = 0,
        explanation = "\"Kindergarten\" ist ein original deutsches Kompositum, das 1840 von Friedrich Froebel geprägt wurde. Es bedeutet wörtlich \"Garten für Kinder\" und wurde weltweit unverändert übernommen.",
        difficulty = 1,
        funFact = "\"Kindergarten\" ist eines von mehreren deutschen Wörtern in anderen Sprachen, wie auch \"Weltanschauung\", \"Schadenfreude\" oder \"Zeitgeist\"."
    ),

    // Question 39 — Erfindung: Jeans-Tasche
    Question(
        categoryId = 11,
        questionText = "Wofür waren die kleinen Taschen in Jeans ursprünglich gedacht?",
        answerA = "Für Münzen",
        answerB = "Für Taschentuecher",
        answerC = "Für Streichhoelzer",
        answerD = "Für Taschenuhren",
        correctAnswer = 3,
        explanation = "Die kleine Tasche in Jeans — die sogenannte Uhrentasche — war ursprünglich für Taschenuhren gedacht. Als Levi Strauss 1873 die erste Jeans entwarf, trugen Cowboys und Arbeiter häufig Taschenuhren.",
        difficulty = 1,
        funFact = "Die allererste Jeans hatte nur vier Taschen. Die kleine Uhrentasche wurde 1890 hinzugefuegt und ist heute eines der Erkennungszeichen der Levi's-Jeans."
    ),

    // Question 40 — Brauch: Aschermittwoch
    Question(
        categoryId = 11,
        questionText = "Was markiert der Aschermittwoch im deutschen Kirchenkalender?",
        answerA = "Den Beginn des Karnevals",
        answerB = "Das Ende des Karnevals und den Beginn der Fastenzeit",
        answerC = "Den ersten Tag des Frühlings",
        answerD = "Ein Erntedankfest",
        correctAnswer = 1,
        explanation = "Der Aschermittwoch markiert das Ende des Karnevals und den Beginn der 40-tägigen Fastenzeit vor Ostern. In katholischen Kirchen werden Gläubigen Aschekreuze auf die Stirn gezeichnet.",
        difficulty = 1,
        funFact = "In Bayern ist der Aschermittwoch auch für den politischen Aschermittwoch bekannt, bei dem Parteien öffentliche Reden halten."
    ),

    // Question 41 — Alltagswissen: Wasser kochen
    Question(
        categoryId = 11,
        questionText = "Bei welcher Temperatur kocht Wasser auf Meereshöhe?",
        answerA = "80 Grad Celsius",
        answerB = "90 Grad Celsius",
        answerC = "100 Grad Celsius",
        answerD = "120 Grad Celsius",
        correctAnswer = 2,
        explanation = "Reines Wasser kocht auf Meereshöhe bei exakt 100 Grad Celsius. Mit zunehmender Höhe sinkt der Luftdruck und damit auch der Siedepunkt — auf dem Everest kocht Wasser schon bei etwa 70 Grad.",
        difficulty = 1,
        funFact = "Im Druckkochtopf steigt der Druck über dem Wasser, wodurch es erst bei über 120 Grad kocht — deswegen werden Lebensmittel darin schneller gar."
    ),

    // Question 42 — Redewendung: Daumenschrauben
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"jemandem die Daumenschrauben anlegen\"?",
        answerA = "Jemanden fesseln",
        answerB = "Jemanden in Handschellen legen",
        answerC = "Jemanden zu etwas zwingen",
        answerD = "Jemanden unter Druck setzen",
        correctAnswer = 3,
        explanation = "\"Jemandem die Daumenschrauben anlegen\" bedeutet, jemanden stark unter Druck zu setzen. Die Daumenschraube war ein echtes Folterinstrument, das die Finger quetschte, um Geständnisse zu erzwingen.",
        difficulty = 1,
        funFact = "Daumenschrauben wurden im Mittelalter und in der frühen Neuzeit bei Verhören eingesetzt. Heute erinnert uns nur noch die Redewendung an dieses Instrument."
    ),

    // Question 43 — Kuriosität: Kaugummi
    Question(
        categoryId = 11,
        questionText = "Wann wurde moderner Kaugummi erfunden?",
        answerA = "1840er Jahre",
        answerB = "1870er Jahre",
        answerC = "1900er Jahre",
        answerD = "1920er Jahre",
        correctAnswer = 1,
        explanation = "Der moderne Kaugummi wurde in den 1870er Jahren in den USA populaer. Thomas Adams kaufte 1869 Chicle (Baumharz) und begann damit zu experimentieren. 1871 patentierte er eine Maschine zur Kaugummiproduktion.",
        difficulty = 1,
        funFact = "Menschen kauten schon vor über 5.000 Jahren auf Birkenteer. Archaeologen fanden in Skandinavien kautes Birkenharz mit Zahnabdrücken."
    ),

    // Question 44 — Persoenlichkeit: Adenauer
    Question(
        categoryId = 11,
        questionText = "Welches Produkt soll Konrad Adenauer als Kölner Oberbuergermeister erfunden haben?",
        answerA = "Margarine",
        answerB = "Kunsthonig",
        answerC = "Sojawurst",
        answerD = "Vollkornbrot",
        correctAnswer = 2,
        explanation = "Konrad Adenauer, später Deutschlands erster Bundeskanzler, soll während des Ersten Weltkriegs als Kölner Oberbuergermeister eine Sojawurst entwickelt haben, die er \"Friedenswurst\" nannte — um in Notzeiten Fleisch zu ersetzen.",
        difficulty = 1,
        funFact = "Adenauer meldete für seine Ernährungsexperimente im Ersten Weltkrieg mehrere Patente an. Die Sojawurst setzte sich aber nicht dauerhaft durch."
    ),

    // Question 45 — Brauch: Richtfest
    Question(
        categoryId = 11,
        questionText = "Was feiert man bei einem Richtfest?",
        answerA = "Den Abschluss eines Strassenbaus",
        answerB = "Das Aufstellen des Dachstuhls bei einem Neubau",
        answerC = "Die Eröffnung eines neuen Unternehmens",
        answerD = "Den ersten Spatenstich eines Bauprojekts",
        correctAnswer = 1,
        explanation = "Das Richtfest feiert das Aufstellen des Dachstuhls als Meilenstein beim Hausbau. Es ist ein alter Brauch, bei dem Handwerker und Bauherren gemeinsam feiern und der Zimmermann eine Richtrede hält.",
        difficulty = 1,
        funFact = "Der Richtstrauss wird am höchsten Punkt des Rohbaus befestigt und signalisiert der Nachbarschaft: Das Haus waechst!"
    ),

    // Question 46 — Erfindung: Roentgen
    Question(
        categoryId = 11,
        questionText = "Wer entdeckte die Roentgenstrahlen?",
        answerA = "Wilhelm Conrad Roentgen",
        answerB = "Marie Curie",
        answerC = "Max Planck",
        answerD = "Heinrich Hertz",
        correctAnswer = 0,
        explanation = "Wilhelm Conrad Roentgen entdeckte die nach ihm benannten Roentgenstrahlen am 8. November 1895. Für diese Entdeckung erhielt er 1901 den allerersten Nobelpreis für Physik.",
        difficulty = 1,
        funFact = "Das erste Roentgenbild zeigte die Hand von Roentgens Frau Anna Bertha. Als sie das Bild sah, soll sie ausgerufen haben: \"Ich habe meinen Tod gesehen!\""
    ),

    // Question 47 — Alltagswissen: Himmelsrichtungen
    Question(
        categoryId = 11,
        questionText = "Wie viele Himmelsrichtungen gibt es in der klassischen Einteilung?",
        answerA = "2",
        answerB = "6",
        answerC = "8",
        answerD = "4",
        correctAnswer = 3,
        explanation = "Die vier klassischen Himmelsrichtungen sind Nord, Sued, Ost und West. Erweitert gibt es noch die Zwischenrichtungen wie Nordost, Suedwest usw., was acht ergibt.",
        difficulty = 1,
        funFact = "Früher lernten Kinder Himmelsrichtungen mit dem Merksatz: \"Nie ohne Seife waschen\" — Nord, Ost, Sued, West im Uhrzeigersinn."
    ),

    // Question 48 — Redewendung: Blauer Montag
    Question(
        categoryId = 11,
        questionText = "Was bedeutet der Begriff \"blauer Montag\"?",
        answerA = "Ein unentschuldigter Fehltag oder freier Montag",
        answerB = "Ein sehr produktiver Arbeitstag",
        answerC = "Ein Feiertag in Bayern",
        answerD = "Die erste Arbeitswoche im Januar",
        correctAnswer = 0,
        explanation = "Der \"blaue Montag\" bezeichnet einen Montag, an dem jemand ohne Erlaubnis der Arbeit fernbleibt oder frühzeitig aufhört. Im Mittelalter arbeiteten Handwerker montags oft weniger, weil sie noch von Feiern am Wochenende erschoepft waren.",
        difficulty = 1,
        funFact = "Im Mittelalter gärbten Färber am Montag Stoff in blaue Kuepen — ein Prozess, der wenig Aufsicht brauchte, was de facto einen freien Tag ergab."
    ),

    // Question 49 — Kuriosität: Nikotin-Herkunft
    Question(
        categoryId = 11,
        questionText = "Nach wem ist der Wirkstoff Nikotin benannt?",
        answerA = "Nach Nikolaus Kopernikus",
        answerB = "Nach dem französischen Botschafter Jean Nicot",
        answerC = "Nach dem Pharmaunternehmen Nicotiana",
        answerD = "Nach einer Pflanze aus Nordafrika",
        correctAnswer = 1,
        explanation = "Nikotin ist nach Jean Nicot de Villemain benannt, dem französischen Botschafter in Portugal, der Tabak um 1560 am französischen Königshof populaer machte. Die Tabakpflanze heisst wissenschaftlich \"Nicotiana tabacum\".",
        difficulty = 1,
        funFact = "Jean Nicot empfahl Tabak ursprünglich als Heilmittel. Er schickte Tabakblaetter an Königin Katharina von Medici gegen ihre Migräne — ganz ohne zu wissen, wie schädlich Nikotin ist."
    ),

    // Question 50 — Alltag: Postleitzahl
    Question(
        categoryId = 11,
        questionText = "Wie viele Stellen hat eine deutsche Postleitzahl?",
        answerA = "4",
        answerB = "6",
        answerC = "5",
        answerD = "7",
        correctAnswer = 2,
        explanation = "Seit 1993 haben deutsche Postleitzahlen fünf Stellen (z.B. 10115 für Berlin-Mitte). Davor gab es separate vierstellige Postleitzahlen für Ost- und Westdeutschland.",
        difficulty = 1,
        funFact = "Die Postleitzahl 01067 gehört zu Dresden, die 99998 zu Herleshausen in Thueringen — damit spannt das deutsche Postleitzahlensystem von 01001 bis 99998."
    )

)
