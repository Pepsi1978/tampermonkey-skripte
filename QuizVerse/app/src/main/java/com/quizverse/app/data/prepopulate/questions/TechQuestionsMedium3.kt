package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMedium3(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck eines HTML-Tags wie <meta name=\"description\">?",
        answerA = "Er legt die Schriftart der Seite fest",
        answerB = "Er liefert Suchmaschinen eine kurze Seitenbeschreibung",
        answerC = "Er blendet Text fuer Nutzer unsichtbar ein",
        answerD = "Er verlinkt externe CSS-Dateien",
        correctAnswer = 1,
        explanation = "Das Meta-Description-Tag liefert Suchmaschinen eine kurze Zusammenfassung des Seiteninhalts. Sie erscheint oft als Vorschautext in den Suchergebnissen.",
        difficulty = 2,
        funFact = "Google kuerzt Meta-Descriptions automatisch auf rund 155 Zeichen – laengere Texte werden einfach abgeschnitten."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Welches CSS-Konzept beschreibt, wie Elemente ihren verfuegbaren Platz dynamisch aufteilen?",
        answerA = "Grid",
        answerB = "Float",
        answerC = "Flexbox",
        answerD = "Position absolute",
        correctAnswer = 2,
        explanation = "Flexbox (Flexible Box Layout) erlaubt es, Elemente in einem Container flexibel in einer Achse (Zeile oder Spalte) anzuordnen und den Platz dynamisch aufzuteilen.",
        difficulty = 2,
        funFact = "Bevor Flexbox 2012 als CSS3-Standard einfuehrt wurde, mussten Webentwickler komplizierte Float-Tricks und negative Margins nutzen, um Layouts zu bauen."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'REST' im Kontext von Web-APIs?",
        answerA = "Rapid Exchange of Structured Text",
        answerB = "Representational State Transfer",
        answerC = "Remote Execution of Server Tasks",
        answerD = "Relational Entity Structure Template",
        correctAnswer = 1,
        explanation = "REST steht fuer Representational State Transfer – ein Architekturstil fuer verteilte Systeme, der HTTP-Methoden wie GET, POST, PUT und DELETE zur Kommunikation nutzt.",
        difficulty = 2,
        funFact = "Roy Fielding beschrieb REST erstmals in seiner Doktorarbeit im Jahr 2000. Heute ist REST der am weitesten verbreitete Stil fuer Web-APIs weltweit."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen HTTP GET und HTTP POST?",
        answerA = "GET ist schneller, POST ist sicherer",
        answerB = "GET uebertraegt Daten in der URL, POST im Anfrage-Koerper",
        answerC = "GET verschluesselt Daten, POST nicht",
        answerD = "Es gibt keinen Unterschied – beide sind identisch",
        correctAnswer = 1,
        explanation = "GET sendet Daten als Teil der URL (z. B. ?name=Max), POST sendet sie im Anfrage-Koerper, was fuer sensible Daten wie Passwoerter geeigneter ist.",
        difficulty = 2,
        funFact = "Weil GET-Anfragen in Browser-Historien, Server-Logs und Lesezeichen gespeichert werden, sollten Passwoerter niemals per GET uebertragen werden."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Welches JavaScript-Konzept erlaubt es, eine Funktion nach Abschluss einer asynchronen Operation auszufuehren?",
        answerA = "Promise",
        answerB = "Loop",
        answerC = "Prototype",
        answerD = "Closure",
        correctAnswer = 0,
        explanation = "Ein Promise (Versprechen) repraesentiert das zukuenftige Ergebnis einer asynchronen Operation. Mit .then() und .catch() reagiert man auf Erfolg oder Fehler.",
        difficulty = 2,
        funFact = "Das Konzept hinter Promises existierte in anderen Sprachen schon lange, bevor es 2015 mit ES6 offiziell in JavaScript eingefuehrt wurde."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was speichert ein Browser-Cookie typischerweise?",
        answerA = "Den Quellcode der besuchten Webseite",
        answerB = "Kleine Datenmengengn wie Session-IDs oder Nutzereinstellungen",
        answerC = "Hochaufloesende Bilder fuer den Offline-Betrieb",
        answerD = "Den Browserverlauf der letzten 30 Tage",
        correctAnswer = 1,
        explanation = "Cookies sind kleine Textdateien, die Webserver im Browser speichern. Sie enthalten meist Session-IDs, Login-Tokens oder Nutzereinstellungen.",
        difficulty = 2,
        funFact = "Der Name 'Cookie' stammt aus der Informatik-Terminologie der 1970er-Jahre und bezieht sich auf 'magic cookies' – Datenpakete, die unveraendert hin- und hergeschickt werden."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was schreibt die DSGVO (Datenschutz-Grundverordnung) Unternehmen vor?",
        answerA = "Sie muessen ihre gesamte Software als Open Source veroeffentlichen",
        answerB = "Sie muessen alle Daten nur auf deutschen Servern speichern",
        answerC = "Sie muessen personenbezogene Daten von EU-Buergern schuetzen und deren Verwendung transparent machen",
        answerD = "Sie duerfen keine Nutzerdaten laenger als 24 Stunden speichern",
        correctAnswer = 2,
        explanation = "Die DSGVO verpflichtet Unternehmen, personenbezogene Daten von EU-Buergern zu schuetzen, die Nutzung transparent offenzulegen und Betroffenenrechte zu wahren.",
        difficulty = 2,
        funFact = "Seit Inkrafttreten der DSGVO im Mai 2018 wurden EU-weit Bussgelder von ueber 4 Milliarden Euro verhaengt – der groesste Einzelfall war eine 1,2-Milliarden-Euro-Strafe gegen Meta."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der PageRank-Algorithmus von Google grundlegend?",
        answerA = "Er zaehlt, wie oft ein Suchbegriff auf einer Seite vorkommt",
        answerB = "Er bewertet Seiten danach, wie viele und wie hochwertige Links auf sie zeigen",
        answerC = "Er misst die Ladezeit einer Seite und bevorzugt schnellere",
        answerD = "Er analysiert das Design der Seite mit KI",
        correctAnswer = 1,
        explanation = "PageRank bewertet Webseiten anhand der Anzahl und Qualitaet eingehender Links. Eine Seite, auf die viele wichtige Seiten verlinken, gilt als relevanter.",
        difficulty = 2,
        funFact = "PageRank ist nach Larry Page benannt, einem der Google-Gruender. Der Algorithmus wurde urspruenglich 1998 in seiner Doktorarbeit an der Stanford University beschrieben."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Algorithmus' in der Informatik?",
        answerA = "Ein Computerprogramm, das selbststaendig lernt",
        answerB = "Eine endliche Folge eindeutiger Anweisungen zur Loesung eines Problems",
        answerC = "Eine mathematische Formel fuer Verschluesselung",
        answerD = "Ein Netzwerkprotokoll fuer Datenuebertragung",
        correctAnswer = 1,
        explanation = "Ein Algorithmus ist eine klar definierte, endliche Schritt-fuer-Schritt-Anleitung, die ein Problem loest oder eine Aufgabe erfuellt.",
        difficulty = 2,
        funFact = "Der Begriff 'Algorithmus' leitet sich vom Namen des persischen Mathematikers al-Chwarizmi (ca. 780–850) ab, der als Vater der Algebra gilt."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "In welchem Jahr wurde das soziale Netzwerk Facebook gegruendet?",
        answerA = "2001",
        answerB = "2006",
        answerC = "2004",
        answerD = "2008",
        correctAnswer = 2,
        explanation = "Mark Zuckerberg gruendete Facebook im Februar 2004 als Plattform fuer Harvard-Studenten. Schon ein Jahr spaeter war es an den meisten US-Universitaeten verfuegbar.",
        difficulty = 2,
        funFact = "Facebook hiess urspruenglich 'TheFacebook' und war nur fuer Studenten der Harvard University zugaenglich – die Domain facebook.com kostete Zuckerberg damals 200.000 Dollar."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'Responsive Design' in der Webentwicklung?",
        answerA = "Eine Webseite, die auf Mausbewegungen reagiert",
        answerB = "Eine Webseite, die sich automatisch an verschiedene Bildschirmgroessen anpasst",
        answerC = "Eine Webseite mit besonders kurzen Ladezeiten",
        answerD = "Eine Webseite, die barrierefrei fuer Sehbehinderte ist",
        correctAnswer = 1,
        explanation = "Responsive Design bedeutet, dass sich eine Webseite automatisch an die Bildschirmgroesse des Geraets anpasst – egal ob Smartphone, Tablet oder Desktop-PC.",
        difficulty = 2,
        funFact = "Den Begriff 'Responsive Web Design' praegte der Webdesigner Ethan Marcotte 2010 in einem vielbeachteten Artikel. Vorher gab es oft separate mobile Seiten (m.beispiel.de)."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist 'Machine Learning' im Kern?",
        answerA = "Das Programmieren von Maschinen mit festen Regeln",
        answerB = "Das Trainieren von Computern, aus Daten zu lernen, ohne explizit programmiert zu werden",
        answerC = "Das automatische Installieren von Software-Updates",
        answerD = "Das Kopieren menschlicher Bewegungen durch Roboter",
        correctAnswer = 1,
        explanation = "Machine Learning ist ein Teilbereich der KI, bei dem Algorithmen aus Daten Muster erlernen und Entscheidungen treffen, ohne fuer jeden Fall explizit programmiert zu sein.",
        difficulty = 2,
        funFact = "Den Begriff 'Machine Learning' praegte Arthur Samuel 1959 bei IBM, als er ein Schachprogramm entwickelte, das sich durch Selbststudium verbesserte."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen gruendete Elon Musk NICHT mit?",
        answerA = "PayPal",
        answerB = "Tesla",
        answerC = "Twitter",
        answerD = "SpaceX",
        correctAnswer = 2,
        explanation = "Twitter (heute X) wurde 2006 von Jack Dorsey, Noah Glass, Biz Stone und Evan Williams gegruendet. Elon Musk kaufte Twitter 2022, war aber kein Mitgruender.",
        difficulty = 2,
        funFact = "Als Elon Musk Twitter 2022 fuer 44 Milliarden Dollar kaufte, war es eine der teuersten Akquisitionen in der Tech-Geschichte. Er benannte die Plattform danach in 'X' um."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'neuronales Netz' in der KI-Forschung?",
        answerA = "Ein Computernetzwerk mit besonders vielen Kabeln",
        answerB = "Ein System aus vernetzten Rechenknoten, das vom menschlichen Gehirn inspiriert ist",
        answerC = "Eine Software zur Analyse von MRT-Gehirnscans",
        answerD = "Eine Datenbankstruktur fuer medizinische Daten",
        correctAnswer = 1,
        explanation = "Kuenstliche neuronale Netze bestehen aus Schichten von Rechenknoten (Neuronen), die durch gewichtete Verbindungen verknuepft sind – aehnlich wie Neuronen im menschlichen Gehirn.",
        difficulty = 2,
        funFact = "Das erste Modell eines kuenstlichen Neurons wurde bereits 1943 von Warren McCulloch und Walter Pitts veroeffentlicht – rund 40 Jahre vor dem ersten praktisch nutzbaren neuronalen Netz."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck von 'Cookies' im Zusammenhang mit der DSGVO?",
        answerA = "Cookies muessen nach DSGVO verboten werden",
        answerB = "Nutzer muessen aktiv in die Verwendung von nicht notwendigen Cookies einwilligen",
        answerC = "Cookies duerfen nur in Deutschland eingesetzt werden",
        answerD = "Cookies sind von der DSGVO nicht betroffen",
        correctAnswer = 1,
        explanation = "Laut DSGVO und ePrivacy-Richtlinie muessen Nutzer aktiv in die Verwendung von nicht technisch notwendigen Cookies (z. B. Tracking-Cookies) einwilligen.",
        difficulty = 2,
        funFact = "Das allgegenwaertige Cookie-Banner-Problem hat Entwickler weltweit motiviert: Es gibt heute rund 50 Open-Source-Tools allein fuer das automatische Ablehnen von Cookie-Bannern."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Welche Programmiersprache nutzt man primaer fuer die visuelle Gestaltung von Webseiten?",
        answerA = "JavaScript",
        answerB = "SQL",
        answerC = "CSS",
        answerD = "Python",
        correctAnswer = 2,
        explanation = "CSS (Cascading Style Sheets) ist die Sprache, mit der das Aussehen von HTML-Elementen festgelegt wird – Farben, Schriften, Abstaende, Animationen und mehr.",
        difficulty = 2,
        funFact = "CSS wurde 1994 von Hakon Wium Lie vorgeschlagen, der damals am CERN arbeitete. Der erste Browser, der CSS vollstaendig unterstuetzte, war Internet Explorer 3.0 im Jahr 1996."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter dem 'Silicon Valley'?",
        answerA = "Ein kuenstliches Tal in den USA aus Silizium-Kristallen",
        answerB = "Die Technologie- und Startup-Region suedlich von San Francisco in Kalifornien",
        answerC = "Ein Codename fuer Apples geheime Chip-Fabrik",
        answerD = "Ein Stadtteil in New York mit vielen Tech-Unternehmen",
        correctAnswer = 1,
        explanation = "Das Silicon Valley ist das Technologiezentrum im Sueden der San Francisco Bay Area und Heimat von Unternehmen wie Apple, Google, Meta, Netflix und Tausenden Startups.",
        difficulty = 2,
        funFact = "Der Name 'Silicon Valley' wurde 1971 vom Journalisten Don Hoefler gepraegt – er bezog sich auf den damaligen Boom der Silizium-Chip-Hersteller in der Region."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Wofuer steht die Abkuerzung 'API'?",
        answerA = "Automated Program Interface",
        answerB = "Application Programming Interface",
        answerC = "Advanced Protocol Integration",
        answerD = "Algorithmic Process Interpreter",
        correctAnswer = 1,
        explanation = "API steht fuer Application Programming Interface – eine Schnittstelle, ueber die verschiedene Softwareprogramme miteinander kommunizieren koennen.",
        difficulty = 2,
        funFact = "Ohne APIs wuerden viele Alltagsdienste nicht funktionieren: Wenn du auf Booking.com Fluege suchst, nutzt die Seite APIs von Fluggesellschaften, um Echtzeitpreise abzurufen."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen veroeffentlichte 2001 das erste iPod-Modell?",
        answerA = "Sony",
        answerB = "Microsoft",
        answerC = "Samsung",
        answerD = "Apple",
        correctAnswer = 3,
        explanation = "Apple stellte den ersten iPod am 23. Oktober 2001 vor. Steve Jobs beschrieb ihn mit den Worten '1.000 Songs in deiner Tasche'.",
        difficulty = 2,
        funFact = "Der iPod revolutionierte die Musikindustrie und rettete Apple in einer schwierigen Phase. Bis 2014 verkaufte Apple ueber 400 Millionen iPods – er gilt als einer der einflussreichsten Gadgets der Geschichte."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist 'Phishing' in der IT-Sicherheit?",
        answerA = "Eine Methode zum Knacken von WLAN-Passwoertern",
        answerB = "Ein Angriff, bei dem Nutzer mit gefaelschten Nachrichten zur Datenweitergabe verleitet werden",
        answerC = "Eine Art von Computervirus, der Dateien loescht",
        answerD = "Ein Protokoll zur sicheren Datenuebertragung",
        correctAnswer = 1,
        explanation = "Beim Phishing taeuschen Angreifer mit gefaelschten E-Mails oder Webseiten vertrauenswuerdige Quellen vor, um Passwoerter, Kreditkartendaten oder andere sensible Informationen zu stehlen.",
        difficulty = 2,
        funFact = "Der Begriff 'Phishing' entstand in den 1990ern als Wortspiel aus 'fishing' (Angeln) und 'phone phreaking'. Die erste bekannte Phishing-Attacke richtete sich 1996 gegen AOL-Nutzer."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist der Kern eines Empfehlungsalgorithmus (z. B. bei Netflix oder Spotify)?",
        answerA = "Er zeigt Inhalte mit den meisten Klicks weltweit",
        answerB = "Er analysiert dein Nutzungsverhalten und empfiehlt aehnliche Inhalte",
        answerC = "Er zeigt zufaellig ausgewaehlte Inhalte aus der Datenbank",
        answerD = "Er empfiehlt nur bezahlte Werbepartner-Inhalte",
        correctAnswer = 1,
        explanation = "Empfehlungsalgorithmen analysieren, was ein Nutzer angeschaut, gehoert oder gekauft hat, und suchen nach Mustern, um passende neue Inhalte vorzuschlagen.",
        difficulty = 2,
        funFact = "Netflix schaetzt, dass sein Empfehlungsalgorithmus jaehrlich rund 1 Milliarde Dollar spart, indem er verhindert, dass Nutzer die Plattform aus Langeweile kuendigen."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Welches Ereignis laeuferte den Start der Smartphone-Aera ein?",
        answerA = "Der Launch des Samsung Galaxy S im Jahr 2010",
        answerB = "Die Vorstellung des ersten iPhones durch Steve Jobs im Jahr 2007",
        answerC = "Die Einführung von Windows Mobile im Jahr 2003",
        answerD = "Die Veroeffentlichung des ersten BlackBerry im Jahr 2002",
        correctAnswer = 1,
        explanation = "Als Steve Jobs am 9. Januar 2007 das erste iPhone vorstellte, revolutionierte er die gesamte Mobilfunkbranche. Das Geraet kombinierte Telefon, Musikplayer und Internetbrowser.",
        difficulty = 2,
        funFact = "Jobs beschrieb das iPhone als 'ein revolutionaeres und magisches Produkt'. Die Aktie von Nokia brach nach der Ankuendigung um 6 % ein – ein Vorgeschmack auf den Niedergang des Marktfuehrers."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Open Source' bei Software?",
        answerA = "Die Software ist kostenlos, aber der Quellcode ist geheim",
        answerB = "Der Quellcode ist oeffentlich zugaenglich und darf von jedem genutzt und veraendert werden",
        answerC = "Die Software wird von einer staatlichen Behoerde entwickelt",
        answerD = "Die Software hat keine Lizenz und ist gemeinfrei",
        correctAnswer = 1,
        explanation = "Open Source bedeutet, dass der Quellcode einer Software oeffentlich einsehbar ist und unter bestimmten Lizenzbedingungen genutzt, veraendert und weitergegeben werden darf.",
        difficulty = 2,
        funFact = "Der Linux-Kernel, das Herzstuck des meistgenutzten Betriebssystems der Welt, ist Open Source – er laueft auf 97 % aller Server, allen Android-Handys und der Internationalen Raumstation."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist 'Cloud Computing'?",
        answerA = "Das Speichern von Daten in echten Wolken mithilfe von Satelliten",
        answerB = "Das Bereitstellen von Rechenleistung und Speicher ueber das Internet statt auf lokalen Geraeten",
        answerC = "Eine Methode zur Komprimierung grosser Dateien",
        answerD = "Ein besonders stromsparendes Rechenzentrum",
        correctAnswer = 1,
        explanation = "Cloud Computing bedeutet, dass Rechenleistung, Speicher und Software ueber das Internet bereitgestellt werden – Nutzer greifen darauf zu, ohne lokale Hardware betreiben zu muessen.",
        difficulty = 2,
        funFact = "Der Begriff 'Cloud' als Metapher fuer das Internet stammt aus alten Netzwerkdiagrammen, in denen das Internet als Wolkensymbol dargestellt wurde."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Welche Firma entwickelt das Betriebssystem Android?",
        answerA = "Samsung",
        answerB = "Qualcomm",
        answerC = "Google",
        answerD = "Microsoft",
        correctAnswer = 2,
        explanation = "Android wurde urspruenglich von der Firma Android Inc. entwickelt und 2005 von Google uebernommen. Das Betriebssystem wird heute von der Open Handset Alliance gepflegt.",
        difficulty = 2,
        funFact = "Android wurde anfangs als Betriebssystem fuer Digitalkameras entwickelt. Erst spaeter schwenkte das Team auf Smartphones um – eine Entscheidung, die die Mobiltechnologie veraenderte."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Startup' in der Geschaeftswelt?",
        answerA = "Ein Unternehmen, das gerade Insolvenz angemeldet hat",
        answerB = "Ein junges Unternehmen mit innovativem Geschaeftsmodell und hohem Wachstumspotenzial",
        answerC = "Eine Abteilung innerhalb eines Grosskonzerns",
        answerD = "Ein Betrieb mit weniger als 10 Mitarbeitern",
        correctAnswer = 1,
        explanation = "Ein Startup ist ein junges Unternehmen, das ein innovatives Produkt oder Geschaeftsmodell entwickelt und schnelles Wachstum anstrebt – oft finanziert durch Investoren.",
        difficulty = 2,
        funFact = "Die bekanntesten Silicon-Valley-Startups begannen in Garagen: Apple in der Garage von Jobs' Eltern, Google im Mietgarage von Susan Wojcicki, Amazon im Heimbuero von Jeff Bezos."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Hashtag' in sozialen Medien?",
        answerA = "Eine private Nachricht zwischen zwei Nutzern",
        answerB = "Ein mit # versehenes Schlagwort, das Inhalte zu einem Thema buendelt",
        answerC = "Ein bezahlter Werbebeitrag auf Instagram oder Twitter",
        answerD = "Der Benutzername eines Social-Media-Kontos",
        correctAnswer = 1,
        explanation = "Ein Hashtag (#Schlagwort) kategorisiert Beitraege in sozialen Medien. Klickt man darauf, sieht man alle oeffentlichen Posts mit demselben Hashtag.",
        difficulty = 2,
        funFact = "Der erste Twitter-Hashtag wurde am 23. August 2007 von Chris Messina getwittert: '#barcamp'. Twitter lehnte seine Idee damals als 'zu nerdish' ab – heute sind Hashtags allgegenwaetig."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Datenschutz durch Technikgestaltung' (Privacy by Design)?",
        answerA = "Datenschutzhinweise muessen gut sichtbar gestaltet sein",
        answerB = "Datenschutz wird von Anfang an in die Entwicklung eines Systems eingebaut",
        answerC = "Alle Nutzerdaten muessen visuell dargestellt werden",
        answerD = "Designelemente einer Webseite muessen DSGVO-konform sein",
        correctAnswer = 1,
        explanation = "Privacy by Design bedeutet, Datenschutz nicht nachtraeglich hinzuzufuegen, sondern von Beginn der Entwicklung an in Systeme und Prozesse einzubauen.",
        difficulty = 2,
        funFact = "Das Konzept wurde von Ann Cavoukian in den 1990er-Jahren entwickelt. Seit 2018 ist Privacy by Design als Grundsatz in Artikel 25 der DSGVO gesetzlich verankert."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Welcher soziale Algorithmus-Mechanismus sorgt dafuer, dass Nutzer immer extremere Inhalte sehen?",
        answerA = "Shadow Banning",
        answerB = "A/B-Testing",
        answerC = "Die Filterblase (Filter Bubble)",
        answerD = "Gamification",
        correctAnswer = 2,
        explanation = "Die Filterblase beschreibt das Phaenomen, dass Algorithmen Nutzern immer aehnlichere und oft extremere Inhalte zeigen, die ihren bisherigen Vorlieben entsprechen.",
        difficulty = 2,
        funFact = "Den Begriff 'Filter Bubble' praegte der Aktivist Eli Pariser 2011 in seinem gleichnamigen Buch. Er warnte fruehzeitig vor dem gesellschaftlichen Einfluss von personalisierten Algorithmen."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Wofuer steht 'SEO' in der Webentwicklung?",
        answerA = "Secure Encryption Online",
        answerB = "Software Engineering Operations",
        answerC = "Search Engine Optimization",
        answerD = "Social Engagement Output",
        correctAnswer = 2,
        explanation = "SEO steht fuer Search Engine Optimization – Massnahmen, die eine Webseite in den Suchergebnissen von Google und Co. weiter nach oben bringen sollen.",
        difficulty = 2,
        funFact = "Google aktualisiert seinen Suchalgorithmus mehrere tausend Mal pro Jahr. Grobe Kernupdates passieren einige Male jaehrlich und koennen das Ranking von Webseiten drastisch veraendern."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was war YouTube im Jahr 2005, als es gestartet wurde?",
        answerA = "Ein Bezahl-Streamingdienst fuer Kinofilme",
        answerB = "Eine kostenlose Videoplattform, auf der jeder Videos hochladen konnte",
        answerC = "Ein internes Tool von Google fuer Videokonferenzen",
        answerD = "Eine Plattform fuer professionelle Fernsehmacher",
        correctAnswer = 1,
        explanation = "YouTube wurde im Februar 2005 von Chad Hurley, Steve Chen und Jawed Karim gegruendet. Die Idee entstand, weil sie nach einem Abendessen kein Video einfach teilen konnten.",
        difficulty = 2,
        funFact = "Das erste YouTube-Video ('Me at the zoo') von Mitgruender Jawed Karim ist noch immer online. Google kaufte YouTube im Oktober 2006 fuer 1,65 Milliarden Dollar – 18 Monate nach dem Launch."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'supervised learning' und 'unsupervised learning' im Machine Learning?",
        answerA = "Supervised benoetigt Internetzugang, unsupervised nicht",
        answerB = "Supervised lernt mit gelabelten Beispieldaten, unsupervised findet selbst Muster in ungelabelten Daten",
        answerC = "Supervised ist schneller, unsupervised ist genauer",
        answerD = "Supervised wird von Menschen betreut, unsupervised laeuft vollautomatisch ohne jegliche Daten",
        correctAnswer = 1,
        explanation = "Beim Supervised Learning lernt ein Modell aus Beispieldaten, die mit korrekten Antworten versehen sind. Beim Unsupervised Learning entdeckt das Modell selbst Strukturen in ungelabelten Daten.",
        difficulty = 2,
        funFact = "Ein klassisches Beispiel fuer Unsupervised Learning ist die Kundensegmentierung: Ein Algorithmus gruppiert Kaeufer anhand ihres Verhaltens, ohne dass man vorher sagt, welche Gruppen es geben soll."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist 'Venture Capital' (Risikokapital) in der Startup-Welt?",
        answerA = "Ein staatliches Foerderprogramm fuer kleine Betriebe",
        answerB = "Kapital, das Investoren in vielversprechende Startups investieren und dafuer Unternehmensanteile erhalten",
        answerC = "Darlehen mit besonders niedrigen Zinsen fuer Gruender",
        answerD = "Geld, das Startups durch Crowdfunding von privaten Personen sammeln",
        correctAnswer = 1,
        explanation = "Venture Capital ist Risikokapital, das professionelle Investoren (VC-Fonds) in Startups investieren. Im Gegenzug erhalten sie Unternehmensanteile und hoffen auf hohe Renditen.",
        difficulty = 2,
        funFact = "Sequoia Capital investierte 2005 125.000 Dollar in YouTube und erhielt nach dem Google-Kauf 495 Millionen Dollar zurueck – eine Rendite von fast 4000 % in nur 18 Monaten."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was beschreibt 'Two-Factor Authentication' (2FA)?",
        answerA = "Ein Login-System, das zwei verschiedene Passwoerter gleichzeitig erfordert",
        answerB = "Eine Sicherheitsmethode, bei der zwei unabhaengige Faktoren zur Verifikation noetig sind",
        answerC = "Eine Verschluesselungsmethode mit zwei Schluesseln",
        answerD = "Ein System, das nach zwei Fehlanmeldungen den Account sperrt",
        correctAnswer = 1,
        explanation = "2FA erfordert zwei verschiedene Arten von Nachweisen zur Anmeldung – z. B. ein Passwort plus einen SMS-Code. Selbst wenn das Passwort gestohlen wird, ist der Account sicher.",
        difficulty = 2,
        funFact = "Banken nutzen 2FA schon seit Jahrzehnten: EC-Karte (Besitz) plus PIN (Wissen). Das Konzept wurde erst durch Online-Dienste fuer die breite Oeffentlichkeit sichtbar."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Welches Protokoll macht Webseiten sicherer und verschluesselt die Datenübertragung?",
        answerA = "FTP",
        answerB = "HTTP",
        answerC = "SMTP",
        answerD = "HTTPS",
        correctAnswer = 3,
        explanation = "HTTPS (HyperText Transfer Protocol Secure) verschluesselt die Kommunikation zwischen Browser und Webserver mittels TLS/SSL. Das Schloss-Symbol im Browser zeigt eine HTTPS-Verbindung an.",
        difficulty = 2,
        funFact = "Google begann 2014, HTTPS als Ranking-Faktor in der Suche einzusetzen. Heute sind ueber 95 % des weltweiten Web-Traffics verschluesselt – ein massiver Sicherheitsfortschritt in nur 10 Jahren."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Unicorn' in der Startup-Welt?",
        answerA = "Ein Startup, das von einem einzigen Gruender aufgebaut wurde",
        answerB = "Ein nicht-boersennotietes Startup mit einer Bewertung von ueber 1 Milliarde Dollar",
        answerC = "Ein Technologieunternehmen, das ausschliesslich KI nutzt",
        answerD = "Ein Startup, das in weniger als einem Jahr profitabel wurde",
        correctAnswer = 1,
        explanation = "Als 'Unicorn' (Einhorn) bezeichnet man ein privates Startup, das mit mindestens 1 Milliarde Dollar bewertet wird. Der Begriff wurde 2013 von der Investorin Aileen Lee gepraegte.",
        difficulty = 2,
        funFact = "2013, als Aileen Lee den Begriff praegte, gab es weltweit nur 39 Unicorns. Heute sind es ueber 1.200 – ein Zeichen, dass Risikokapital massiv zugenommen hat."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Welche HTML-Elemente werden genutzt, um eine Tabelle zu erstellen?",
        answerA = "<grid>, <row>, <cell>",
        answerB = "<table>, <tr>, <td>",
        answerC = "<list>, <item>, <column>",
        answerD = "<frame>, <section>, <data>",
        correctAnswer = 1,
        explanation = "<table> definiert die Tabelle, <tr> (table row) eine Zeile und <td> (table data) eine Datenzelle. Fuer Kopfspalten nutzt man <th> (table header).",
        difficulty = 2,
        funFact = "In den fruehen 2000ern wurden HTML-Tabellen haefig missbraucht, um ganze Webseiten-Layouts zu gestalten – eine Praxis, die mit dem Aufkommen von CSS als veraltet gilt."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Big Data' und herkoemmllichen Datenmengen?",
        answerA = "Big Data wird nur von Regierungen verarbeitet",
        answerB = "Big Data ist zu gross, zu schnell oder zu vielschichtig, um mit klassischen Werkzeugen verarbeitet zu werden",
        answerC = "Big Data bezeichnet nur Daten aus sozialen Medien",
        answerD = "Big Data ist verschluesselt, normale Daten nicht",
        correctAnswer = 1,
        explanation = "Big Data beschreibt Datenmengen, die sich durch hohe Volumen (Volume), hohe Geschwindigkeit (Velocity) und grosse Vielfalt (Variety) auszeichnen und spezielle Verarbeitungsmethoden erfordern.",
        difficulty = 2,
        funFact = "Jeden Tag werden weltweit rund 2,5 Quintillionen Bytes an Daten erzeugt. Ueber 90 % aller je erzeugten Daten entstanden in den letzten zwei Jahren."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist die Aufgabe des TikTok-Algorithmus laut dem Unternehmen selbst?",
        answerA = "Videos werden streng nach Anzahl der Follower sortiert",
        answerB = "Er analysiert Nutzerinteraktionen und zeigt Inhalte, die voraussichtlich lang angesehen werden",
        answerC = "Videos werden zunaechst nach Zufallsprinzip ausgespielt",
        answerD = "Er bevorzugt ausschliesslich Inhalte von verifizierten Accounts",
        correctAnswer = 1,
        explanation = "TikToks Empfehlungsalgorithmus analysiert Faktoren wie Wiedergabedauer, Likes, Kommentare und Shares, um jedem Nutzer einen personalisierten 'For You'-Feed zu erstellen.",
        difficulty = 2,
        funFact = "TikTok veroeffentlichte 2023 erstmals einen Einblick in seinen Algorithmus. Laut dem Unternehmen ist die Wiedergabedauer der staerkste Faktor – ein Video, das komplett angesehen wird, erhaelt deutlich mehr Reichweite."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter einem 'A/B-Test' in der Softwareentwicklung?",
        answerA = "Ein Test, bei dem Version A und B einer Software auf Fehler geprueft werden",
        answerB = "Ein Experiment, bei dem zwei Varianten eines Features verschiedenen Nutzergruppen gezeigt werden",
        answerC = "Ein Sicherheitstest fuer Passwoerter der Laenge A und B",
        answerD = "Ein Testverfahren, bei dem nur Experten eine neue Version evaluieren",
        correctAnswer = 1,
        explanation = "Beim A/B-Test wird Nutzern zufaellig entweder Version A oder B eines Produkts gezeigt. Durch den Vergleich der Ergebnisse wird bestimmt, welche Variante besser funktioniert.",
        difficulty = 2,
        funFact = "Google testet gelegentlich ueber 10.000 Veraenderungen pro Jahr per A/B-Test – darunter winzige Unterschiede wie verschiedene Blauschattierungen fuer Links."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen gruendete Jeff Bezos im Jahr 1994?",
        answerA = "eBay",
        answerB = "Alibaba",
        answerC = "Amazon",
        answerD = "Shopify",
        correctAnswer = 2,
        explanation = "Jeff Bezos gruendete Amazon 1994 in seiner Garage in Seattle. Zuerst war es nur ein Online-Buchhaendler – heute ist Amazon einer der wertvollsten Konzerne der Welt.",
        difficulty = 2,
        funFact = "Bezos schrieb den Businessplan fuer Amazon auf einem Roadtrip quer durch Amerika. Er kuendigte dafuer seinen gut bezahlten Job als Hedgefonds-Manager in New York."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'JSON' und wofuer wird es genutzt?",
        answerA = "Eine Datenbanksprache fuer relationale Tabellen",
        answerB = "Ein leichtgewichtiges Datenaustauschformat, das fuer Menschen und Maschinen lesbar ist",
        answerC = "Ein Verschluesselungsstandard fuer API-Verbindungen",
        answerD = "Eine Programmiersprache fuer Backend-Systeme",
        correctAnswer = 1,
        explanation = "JSON (JavaScript Object Notation) ist ein textbasiertes Dateiformat, das Daten strukturiert speichert und austauscht. Es wird haeufig fuer API-Antworten genutzt.",
        difficulty = 2,
        funFact = "JSON wurde um 2001 von Douglas Crockford spezifiziert, obwohl er scherzhaft sagt, er habe es nicht erfunden, sondern nur 'entdeckt' – die Syntax stammt aus JavaScript."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist 'Gamification' in der App-Entwicklung?",
        answerA = "Das Entwickeln von Spielen fuer mobile Geraete",
        answerB = "Das Einsetzen spieltypischer Elemente (Punkte, Abzeichen, Bestenlisten) in nicht spielerischen Kontexten",
        answerC = "Eine Methode, Apps gegen Hacker zu sichern",
        answerD = "Das automatische Testen von Apps durch KI",
        correctAnswer = 1,
        explanation = "Gamification uebertraegt Spielmechaniken wie Punkte, Level und Herausforderungen auf andere Bereiche wie Fitness-Apps, Lern-Plattformen oder Kundenbindungsprogramme.",
        difficulty = 2,
        funFact = "Duolingo, die beliebteste Sprachlern-App der Welt, nutzt Gamification extrem konsequent: Streak-Zaehler, Bestenlisten und virtuelle Belohnungen halten Nutzer tagtaeglich bei der Stange."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'User Experience' (UX)?",
        answerA = "Die technische Performance einer App oder Webseite",
        answerB = "Das gesamte Erleben und die Gefuehle eines Nutzers bei der Interaktion mit einem Produkt",
        answerC = "Die Anzahl der registrierten Nutzer eines Dienstes",
        answerD = "Die Erfahrung eines Software-Entwicklers mit einer Programmiersprache",
        correctAnswer = 1,
        explanation = "UX umfasst alle Aspekte der Interaktion eines Nutzers mit einem Produkt – Bedienbarkeit, Effizienz, Zugaenglichkeit und das emotionale Erleben beim Verwenden.",
        difficulty = 2,
        funFact = "Der Begriff 'User Experience' wurde vom Kognitionswissenschaftler Don Norman gepraegt, als er in den 1990ern bei Apple arbeitete. Er bestand darauf, dass gutes Design unsichtbar sein sollte."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen entwickelte das Betriebssystem Windows?",
        answerA = "IBM",
        answerB = "Intel",
        answerC = "Dell",
        answerD = "Microsoft",
        correctAnswer = 3,
        explanation = "Microsoft veroeffentlichte die erste Version von Windows (1.0) im November 1985. Das Betriebssystem laueft heute auf ueber 70 % aller Desktop-Computer weltweit.",
        difficulty = 2,
        funFact = "Microsoft lizenzierte das Konzept des grafischen Betriebssystems von Apple – und Apple hatte es wiederum bei einem Besuch bei Xerox PARC 'inspiriert' bekommen."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einer nativen App und einer Web-App?",
        answerA = "Native Apps sind kostenlos, Web-Apps kostenpflichtig",
        answerB = "Native Apps werden speziell fuer ein Betriebssystem entwickelt, Web-Apps laufen im Browser",
        answerC = "Native Apps brauchen kein Internet, Web-Apps schon",
        answerD = "Native Apps koennen keine Daten speichern, Web-Apps schon",
        correctAnswer = 1,
        explanation = "Native Apps werden in der Programmiersprache des jeweiligen Betriebssystems entwickelt (z. B. Swift fuer iOS). Web-Apps laufen im Browser und sind plattformunabhaengig.",
        difficulty = 2,
        funFact = "Steve Jobs wollte urspruenglich gar keinen App Store: Er schlug Entwicklern vor, Web-Apps fuer das iPhone zu bauen. Erst der Druck von Entwicklern fuehrte 2008 zum Start des App Stores."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist 'Overfitting' beim maschinellen Lernen?",
        answerA = "Wenn ein Modell zu viele Daten verarbeitet und abstuerzt",
        answerB = "Wenn ein Modell die Trainingsdaten zu genau lernt und bei neuen Daten schlechte Ergebnisse liefert",
        answerC = "Wenn ein Modell mit zu wenig Daten trainiert wurde",
        answerD = "Wenn zwei KI-Modelle gleichzeitig auf denselben Daten trainieren",
        correctAnswer = 1,
        explanation = "Overfitting tritt auf, wenn ein Modell die Trainingsdaten zu genau auswendig lernt, einschliesslich Rauschen und Ausreisser. Es verliert dann die Faehigkeit, korrekte Vorhersagen auf neuen Daten zu treffen.",
        difficulty = 2,
        funFact = "Das Gegenteil von Overfitting ist Underfitting: Das Modell ist zu einfach und erfasst nicht mal die wesentlichen Muster in den Daten – wie ein Schueler, der gar nicht fuer die Pruefung gelernt hat."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Welcher Tech-Konzern wurde durch eine Suchmaschine beruehmt und dominiert heute den globalen Online-Werbemarkt?",
        answerA = "Meta",
        answerB = "Amazon",
        answerC = "Google",
        answerD = "Microsoft",
        correctAnswer = 2,
        explanation = "Google dominiert mit ueber 90 % Marktanteil den globalen Suchmarkt und erzielt den Grossteil seines Umsatzes mit personalisierter Online-Werbung ueber Google Ads.",
        difficulty = 2,
        funFact = "Googles urspruenglicher Name war 'Backrub' – benannt nach der Backlink-Analyse, die das System durchfuehrte. Der Umschwung auf 'Google' kam 1997 und ist ein Schreibfehler des Wortes 'Googol' (10 hoch 100)."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist eine 'Progressive Web App' (PWA)?",
        answerA = "Eine App, die nur auf neuesten Smartphones laueft",
        answerB = "Eine Webseite, die sich wie eine native App verhaelt und offline genutzt werden kann",
        answerC = "Eine App mit besonders grossem Speicherplatz",
        answerD = "Eine Anwendung fuer professionelle Webentwickler",
        correctAnswer = 1,
        explanation = "Eine PWA ist eine Webseite, die mithilfe moderner Web-Technologien app-aehnliche Funktionen bietet: Offline-Betrieb, Push-Benachrichtigungen und Installation auf dem Startbildschirm.",
        difficulty = 2,
        funFact = "Twitter hat eine PWA als leichtgewichtige Alternative zu seiner nativen App entwickelt. Die PWA laedt 3x schneller und braucht 70 % weniger Datendaten als die originale App."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Welches Konzept beschreibt, dass Software iterativ in kleinen Schritten entwickelt und schnell ausgeliefert wird?",
        answerA = "Waterfall-Modell",
        answerB = "Agile Entwicklung",
        answerC = "V-Modell",
        answerD = "Extreme Programmierung nach dem Big-Bang-Modell",
        correctAnswer = 1,
        explanation = "Agile Entwicklung setzt auf kurze Entwicklungszyklen (Sprints), schnelles Feedback und kontinuierliche Verbesserung – im Gegensatz zum Wasserfall-Modell, das alle Phasen sequenziell durchlaeuft.",
        difficulty = 2,
        funFact = "Das Agile Manifesto wurde 2001 von 17 Softwareentwicklern in einem Skiresort in Utah verfasst. Es hat nur 68 Woerter – aber es veraenderte, wie die gesamte Tech-Industrie Software baut."
    )
)
