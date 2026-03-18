package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy2(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Wofuer wird NFC am Smartphone genutzt?",
        answerA = "Fuer GPS-Navigation",
        answerB = "Fuer kabelloses Bezahlen und Datenuebertragung auf kurze Distanz",
        answerC = "Fuer Videotelefonie",
        answerD = "Fuer WLAN-Verbindungen",
        correctAnswer = 1,
        explanation = "NFC (Near Field Communication) ermoeglicht kontaktloses Bezahlen (z.B. Google Pay, Apple Pay) und den Austausch kleiner Datenmengen auf wenige Zentimeter Abstand.",
        difficulty = 1,
        funFact = "NFC basiert auf derselben Technologie wie Chipkarten -- es kann nur auf einer Distanz von maximal 4 cm funktionieren, was Missbrauch erschwert."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was macht die App Google Maps?",
        answerA = "Sie verwaltet Fotos auf dem Smartphone",
        answerB = "Sie zeigt Karten und hilft bei der Navigation",
        answerC = "Sie uebertraegt Musik auf Lautsprecher",
        answerD = "Sie speichert Kontakte",
        correctAnswer = 1,
        explanation = "Google Maps ist eine Karten- und Navigations-App von Google, mit der man Routen planen, den Nahverkehr suchen und Orte in der Naehe finden kann.",
        difficulty = 1,
        funFact = "Google Maps-Fahrzeuge haben fuer Streetview insgesamt mehr als 16 Millionen Kilometer zurueckgelegt -- das entspricht ueber 400-mal um die Erde."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Was ist der Apple App Store?",
        answerA = "Ein Online-Shop fuer Apple-Geraete",
        answerB = "Ein Marktplatz zum Herunterladen von Apps fuer iPhone und iPad",
        answerC = "Ein Cloud-Speicher von Apple",
        answerD = "Ein Musikdienst von Apple",
        correctAnswer = 1,
        explanation = "Der Apple App Store ist der offizielle Marktplatz fuer iPhones und iPads, ueber den man Apps herunterladen und kaufen kann.",
        difficulty = 1,
        funFact = "Der App Store wurde am 10. Juli 2008 mit 500 Apps eroeffnet. Heute sind es ueber 1,8 Millionen verfuegbare Anwendungen."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was ist Spotify?",
        answerA = "Eine Video-Plattform",
        answerB = "Ein Online-Supermarkt",
        answerC = "Ein Musik-Streaming-Dienst",
        answerD = "Eine Nachrichten-App",
        correctAnswer = 2,
        explanation = "Spotify ist ein schwedischer Musik-Streaming-Dienst, der Zugang zu Millionen von Songs, Podcasts und Hoerbuechern bietet.",
        difficulty = 1,
        funFact = "Spotify wurde 2006 in Stockholm gegruendet. Der Name entstand aus einem Missverstaendnis -- ein Teammitglied hatte 'Spotify' als Phantasiename gerufen, und der blieb haengen."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Was ist Netflix?",
        answerA = "Ein sozialer Messenger",
        answerB = "Ein Videostreaming-Dienst fuer Filme und Serien",
        answerC = "Eine Gaming-Plattform",
        answerD = "Ein Cloud-Speicherdienst",
        correctAnswer = 1,
        explanation = "Netflix ist einer der groessten Videostreaming-Dienste der Welt. Gegen eine monatliche Gebuehr kann man tausende Filme, Serien und eigene Produktionen schauen.",
        difficulty = 1,
        funFact = "Netflix startete 1997 als DVD-Verleih per Post und wechselte erst 2007 zum Streaming. Heute hat Netflix ueber 260 Millionen zahlende Abonnenten weltweit."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was ist WhatsApp?",
        answerA = "Ein Betriebssystem fuer Smartphones",
        answerB = "Ein Messenger fuer Nachrichten, Fotos und Anrufe",
        answerC = "Ein Musikstreaming-Dienst",
        answerD = "Eine Suchmaschine",
        correctAnswer = 1,
        explanation = "WhatsApp ist ein Messenger-Dienst, ueber den man kostenlos Textnachrichten, Fotos, Videos und Sprachnachrichten senden sowie telefonieren kann.",
        difficulty = 1,
        funFact = "WhatsApp wurde 2009 gegruendet und 2014 von Facebook (Meta) fuer 19 Milliarden Dollar gekauft -- damals eine der groessten Tech-Uebernahmen der Geschichte."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was macht die Frontkamera eines Smartphones hauptsaechlich?",
        answerA = "Sie scannt QR-Codes",
        answerB = "Sie nimmt Selfies und ermoeglicht Videotelefonie",
        answerC = "Sie misst die Helligkeit der Umgebung",
        answerD = "Sie erkennt Fingerabdruecke",
        correctAnswer = 1,
        explanation = "Die Frontkamera ist nach vorne (zum Nutzer) gerichtet und wird hauptsaechlich fuer Selfies und Videotelefonie (z.B. FaceTime, WhatsApp-Videoanrufe) genutzt.",
        difficulty = 1,
        funFact = "Das erste Smartphone mit einer Frontkamera war das HTC EVO 4G aus dem Jahr 2010 -- heute ist sie bei jedem Smartphone selbstverstaendlich."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Wofuer steht GPS?",
        answerA = "Global Positioning System",
        answerB = "General Phone Service",
        answerC = "Geo Positioning Software",
        answerD = "Global Phone Signal",
        correctAnswer = 0,
        explanation = "GPS steht fuer Global Positioning System -- ein satellitengestuetztes Navigationssystem, das den genauen Standort eines Geraets auf der Erde bestimmt.",
        difficulty = 1,
        funFact = "Das GPS-System wurde vom US-Militaer entwickelt und 1983 nach dem Abschuss eines Passagierflugzeugs fuer die zivile Nutzung freigegeben."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Was ist iCloud?",
        answerA = "Ein Streaming-Dienst von Apple",
        answerB = "Der Cloud-Speicherdienst von Apple",
        answerC = "Eine App fuer Wettervorhersage",
        answerD = "Ein Betriebssystem-Update von Apple",
        correctAnswer = 1,
        explanation = "iCloud ist der Cloud-Speicherdienst von Apple, der Fotos, Kontakte, Nachrichten und Dateien automatisch auf Apples Servern sichert und zwischen Geraeten synchronisiert.",
        difficulty = 1,
        funFact = "iCloud wurde 2011 eingefuehrt und ersetzte den aelteren MobileMe-Dienst. Apple bietet jeden Nutzer kostenlos 5 GB Speicher -- danach kostet es extra."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist Bluetooth am Smartphone?",
        answerA = "Eine Technik zur kabellosen Verbindung mit Geraeten in der Naehe",
        answerB = "Eine Art von Mobilfunkverbindung",
        answerC = "Ein Sicherheitsfeature gegen Viren",
        answerD = "Ein Bildschirmfilter fuer Nachtmodus",
        correctAnswer = 0,
        explanation = "Bluetooth ermoeglicht die kabellose Verbindung zwischen Smartphone und anderen Geraeten wie Kopfhoerern, Lautsprechern oder Fitness-Trackern -- ueber kurze Distanzen.",
        difficulty = 1,
        funFact = "Der Name Bluetooth stammt vom daenischen Wikinigkoenig Harald Blaatand (Blauzahn), der verschiedene Staemme vereinte -- so wie Bluetooth verschiedene Geraete verbindet."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Was ist Google Drive?",
        answerA = "Ein Navigationsdienst von Google",
        answerB = "Ein Cloud-Speicherdienst von Google fuer Dateien",
        answerC = "Ein App-Store fuer Android",
        answerD = "Ein E-Mail-Dienst von Google",
        correctAnswer = 1,
        explanation = "Google Drive ist der Cloud-Speicherdienst von Google. Man kann dort Dateien, Fotos und Dokumente speichern, von ueberall abrufen und mit anderen teilen.",
        difficulty = 1,
        funFact = "Google Drive wurde 2012 gestartet und bietet jedem Google-Nutzer kostenlosen 15 GB Speicher -- aufgeteilt zwischen Drive, Gmail und Google Fotos."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist ein QR-Code?",
        answerA = "Ein verschluesseltes Passwort",
        answerB = "Ein zweidimensionaler Barcode, der mit dem Smartphone gescannt wird",
        answerC = "Ein Typ von Speicherkarte",
        answerD = "Ein Sicherheitsprotokoll fuer WLAN",
        correctAnswer = 1,
        explanation = "Ein QR-Code ist ein quadratischer, zweidimensionaler Barcode, der mit der Smartphone-Kamera gescannt werden kann und z.B. Links, Texte oder Zahlungsinfos enthaelt.",
        difficulty = 1,
        funFact = "QR steht fuer 'Quick Response' -- der Code wurde 1994 von Denso Wave in Japan fuer die Autoproduktion erfunden und war urspruenglich nur fuer Fabrikhallen gedacht."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Was ist Dropbox?",
        answerA = "Ein E-Mail-Dienst",
        answerB = "Ein Cloud-Speicherdienst zum Teilen von Dateien",
        answerC = "Eine App fuer Videotelefonie",
        answerD = "Ein Antivirenprogramm",
        correctAnswer = 1,
        explanation = "Dropbox ist ein Cloud-Speicherdienst, mit dem man Dateien online speichern, von mehreren Geraeten darauf zugreifen und mit anderen Nutzern teilen kann.",
        difficulty = 1,
        funFact = "Dropbox-Gruender Drew Houston hatte die Idee 2007, als er seinen USB-Stick zuhause vergessen hatte. Er programmierte die erste Version auf einer Busfahrt."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was ist Disney+?",
        answerA = "Ein Kinderspielzeug-Shop",
        answerB = "Ein Videostreaming-Dienst von The Walt Disney Company",
        answerC = "Ein Fernsehsender",
        answerD = "Eine App fuer Kinderlieder",
        correctAnswer = 1,
        explanation = "Disney+ ist der Streaming-Dienst von The Walt Disney Company mit Inhalten aus dem Disney-, Marvel-, Star-Wars- und Pixar-Universum.",
        difficulty = 1,
        funFact = "Disney+ startete im November 2019 und erreichte in nur 5 Monaten 50 Millionen Abonnenten -- Netflix brauchte dafuer fast 7 Jahre."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist Amazon beim Online-Shopping?",
        answerA = "Eine Suchmaschine",
        answerB = "Einer der groessten Online-Marktplaetze der Welt",
        answerC = "Ein soziales Netzwerk",
        answerD = "Ein Cloud-Speicher nur fuer Bilder",
        correctAnswer = 1,
        explanation = "Amazon ist einer der weltweit groessten Online-Marktplaetze, auf dem man Millionen von Produkten kaufen und auch selbst verkaufen kann.",
        difficulty = 1,
        funFact = "Amazon-Gruender Jeff Bezos startete 1994 in seiner Garage -- damals verkaufte Amazon ausschliesslich Buecher. Heute ist es eines der wertvollsten Unternehmen der Welt."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist PayPal?",
        answerA = "Eine Kreditkarte",
        answerB = "Ein Online-Zahlungsdienst",
        answerC = "Eine Banking-App einer Bank",
        answerD = "Ein Bezahlterminal fuer Geschaefte",
        correctAnswer = 1,
        explanation = "PayPal ist ein Online-Zahlungsdienst, mit dem man im Internet sicher bezahlen und Geld an andere Personen senden kann, ohne Bankdaten preiszugeben.",
        difficulty = 1,
        funFact = "PayPal wurde 1998 gegruendet und war urspruenglich ein Sicherheits-Software-Unternehmen fuer PDAs. Mitgruender Elon Musk verkaufte es spaeter an eBay fuer 1,5 Milliarden Dollar."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was ist ein Smart Speaker?",
        answerA = "Ein Lautsprecher mit besonders gutem Klang",
        answerB = "Ein vernetzter Lautsprecher mit eingebautem Sprachassistenten",
        answerC = "Ein Lautsprecher fuer Smartphones",
        answerD = "Ein tragbarer Bluetooth-Lautsprecher",
        correctAnswer = 1,
        explanation = "Ein Smart Speaker ist ein vernetzter Lautsprecher mit integriertem Sprachassistenten (z.B. Alexa, Google Assistant), der auf Sprachbefehle reagiert.",
        difficulty = 1,
        funFact = "Amazon Echo war 2014 der erste Smart Speaker fuer den Massenmarkt. Heute gibt es weltweit ueber 500 Millionen Smart Speaker in privaten Haushalten."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Wer ist der Sprachassistent von Amazon?",
        answerA = "Cortana",
        answerB = "Siri",
        answerC = "Google",
        answerD = "Alexa",
        correctAnswer = 3,
        explanation = "Alexa ist der Sprachassistent von Amazon. Er ist in Echo-Geraeten eingebaut und kann Fragen beantworten, Musik abspielen und Smart-Home-Geraete steuern.",
        difficulty = 1,
        funFact = "Amazon waehlete den Namen 'Alexa', weil das Phonem 'x' vom Mikrofon sehr zuverlaessig erkannt wird -- und selten in normalen Alltagsgespraechen vorkommt."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was ist Google Home?",
        answerA = "Ein Betriebssystem fuer Smart-TVs",
        answerB = "Ein Smart Speaker und Sprachassistent von Google",
        answerC = "Eine App fuer Immobilien",
        answerD = "Ein Router von Google",
        correctAnswer = 1,
        explanation = "Google Home ist eine Produktlinie von Smart Speakern und dem Google Assistant-Sprachassistenten von Google fuer den Heimbereich.",
        difficulty = 1,
        funFact = "Google Home wurde 2016 als direkte Konkurrenz zum Amazon Echo eingefuehrt. Der eingebaute Google Assistant kann auf Wissen aus der gesamten Google-Suche zugreifen."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Wie viele Megapixel hat eine typische Hauptkamera eines modernen Mittelklasse-Smartphones ungefaehr?",
        answerA = "2-4 Megapixel",
        answerB = "12-50 Megapixel",
        answerC = "200-500 Megapixel",
        answerD = "1-2 Megapixel",
        correctAnswer = 1,
        explanation = "Moderne Mittelklasse-Smartphones haben typischerweise Hauptkameras mit 12 bis 50 Megapixel -- Flaggschiffe erreichen auch 100-200 MP.",
        difficulty = 1,
        funFact = "Das menschliche Auge kann theoretisch etwa 576 Megapixel wahrnehmen -- die meisten Smartphone-Kameras liegen also noch deutlich darunter."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist Online-Banking?",
        answerA = "Das Einkaufen im Internet",
        answerB = "Das Verwalten von Bankkonten ueber das Internet oder eine App",
        answerC = "Das Bezahlen mit Kreditkarte im Geschaeft",
        answerD = "Das Ueberweisen von Geld per Brief",
        correctAnswer = 1,
        explanation = "Online-Banking ermoeglicht es, Bankkonten ueber das Internet oder eine Smartphone-App zu verwalten -- z.B. Ueberweisungen durchfuehren oder den Kontostand pruefen.",
        difficulty = 1,
        funFact = "Online-Banking gibt es in Deutschland seit den 1990er Jahren. Heute nutzen ueber 60 Prozent aller Deutschen ihre Bank-App regelmaessig auf dem Smartphone."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist ein sicheres Passwort?",
        answerA = "Der eigene Name als Passwort",
        answerB = "Eine Kombination aus Gross- und Kleinbuchstaben, Zahlen und Sonderzeichen",
        answerC = "Das Geburtsdatum",
        answerD = "Das Wort 'Passwort'",
        correctAnswer = 1,
        explanation = "Ein sicheres Passwort besteht aus einer zufaelligen Kombination aus Gross- und Kleinbuchstaben, Zahlen und Sonderzeichen und sollte mindestens 12 Zeichen lang sein.",
        difficulty = 1,
        funFact = "Das weltweit haeufigste Passwort ist '123456'. Ein Hacker kann es in weniger als einer Sekunde knacken -- mit einem sicheren Passwort dauert es Milliarden von Jahren."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Warum sind Software-Updates wichtig?",
        answerA = "Sie machen das Geraet langsamer",
        answerB = "Sie beheben Sicherheitsluecken und verbessern die Stabilitat",
        answerC = "Sie loeschen alle gespeicherten Daten",
        answerD = "Sie erhoehen die Mobilfunkkosten",
        correctAnswer = 1,
        explanation = "Software-Updates schliessen Sicherheitsluecken, beheben Fehler und fuegen neue Funktionen hinzu. Nicht aktualisierte Geraete sind anfaelliger fuer Angriffe.",
        difficulty = 1,
        funFact = "Viele der groessten Hackerangriffe der Geschichte -- darunter WannaCry 2017 -- waren moeglich, weil Nutzer verfuegbare Sicherheitsupdates nicht eingespielt hatten."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was macht man mit einem Barcode an der Supermarktkasse?",
        answerA = "Man scannt ihn, um den Preis des Produkts auszulesen",
        answerB = "Man fotografiert ihn als Merkzettel",
        answerC = "Man nutzt ihn als Zahlungsmethode",
        answerD = "Man liest dort das Ablaufdatum ab",
        correctAnswer = 0,
        explanation = "Der Barcode (EAN-Code) an Produkten wird an der Kasse eingescannt, um den Preis aus der Datenbank des Supermarkts abzurufen und die Kasse zu befuellen.",
        difficulty = 1,
        funFact = "Der erste Barcode wurde 1974 an einer Packung Kaugummi in Ohio gescannt. Diese Packung ist heute im Smithsonian Museum ausgestellt."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Was ist der Google Play Store?",
        answerA = "Ein Online-Spielekatalog fuer PCs",
        answerB = "Der offizielle App-Marktplatz fuer Android-Smartphones",
        answerC = "Ein Musikdienst von Google",
        answerD = "Ein Cloud-Speicher von Google",
        correctAnswer = 1,
        explanation = "Der Google Play Store ist der offizielle Marktplatz fuer Android-Geraete. Dort kann man Apps, Spiele, Bucher, Filme und Musik herunterladen.",
        difficulty = 1,
        funFact = "Der Play Store hatte bei der Einfuehrung 2008 nur wenige Hundert Apps. Heute sind es ueber 3 Millionen verfuegbare Apps -- obwohl Google viele qualitativ schlechte Apps entfernt."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist digitale Fotografie?",
        answerA = "Fotografieren mit einer analogen Filmkamera",
        answerB = "Fotografieren, bei dem Bilder als digitale Dateien gespeichert werden",
        answerC = "Das Drucken von Fotos zu Hause",
        answerD = "Das Scannen alter Fotoalben",
        correctAnswer = 1,
        explanation = "Bei der digitalen Fotografie werden Bilder als digitale Dateien (z.B. JPEG, PNG) auf Speicherkarten oder im Smartphone-Speicher gespeichert -- kein Film noetig.",
        difficulty = 1,
        funFact = "Die erste digitale Kamera wurde 1975 von Steve Sasson bei Kodak entwickelt. Sie wog 3,6 kg, hatte 0,01 Megapixel und brauchte 23 Sekunden um ein Bild zu speichern."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist ein Megapixel in der Fotografie?",
        answerA = "Die Groesse des Kamerasensors in cm",
        answerB = "Eine Million Bildpunkte (Pixel)",
        answerC = "Die Lichtstaerke der Kamera",
        answerD = "Die Brennweite des Objektivs",
        correctAnswer = 1,
        explanation = "Ein Megapixel entspricht einer Million Bildpunkten (Pixel). Je mehr Megapixel eine Kamera hat, desto mehr Details kann sie theoretisch aufnehmen.",
        difficulty = 1,
        funFact = "Mehr Megapixel bedeuten nicht automatisch bessere Fotos -- die Groesse der einzelnen Pixel und die Qualitaet der Optik sind genauso wichtig."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Wofuer steht 'JPEG' bei Fotos?",
        answerA = "Ein Videoformat",
        answerB = "Ein haeufig genutztes komprimiertes Bilddateiformat",
        answerC = "Eine Kameramarke",
        answerD = "Eine Fotobearbeitungssoftware",
        correctAnswer = 1,
        explanation = "JPEG (Joint Photographic Experts Group) ist das haeufigste Dateiformat fuer digitale Fotos. Es komprimiert Bilder, um Speicherplatz zu sparen.",
        difficulty = 1,
        funFact = "JPEG wurde 1992 als Standard eingefuehrt. Trotz seines Alters ist es noch immer das Format, in dem die meisten Fotos weltweit gespeichert und verschickt werden."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'kontaktloses Bezahlen' mit dem Smartphone?",
        answerA = "Bezahlen ohne Bargeld oder Karte durch Antippen des Terminals mit dem Smartphone",
        answerB = "Einkaufen ohne persoenlichen Kontakt mit dem Haendler",
        answerC = "Bezahlen per SMS",
        answerD = "Bezahlen per E-Mail",
        correctAnswer = 0,
        explanation = "Kontaktloses Bezahlen mit dem Smartphone nutzt NFC-Technologie (z.B. Google Pay, Apple Pay) -- man haelt das Smartphone ans Lesegeraet und die Zahlung wird ausgefuehrt.",
        difficulty = 1,
        funFact = "Kontaktloses Bezahlen ist in manchen Laendern wie Schweden so verbreitet, dass manche Geschaefte kein Bargeld mehr akzeptieren."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist eine Zwei-Faktor-Authentifizierung (2FA)?",
        answerA = "Ein Passwort mit mindestens zwei Zeichen",
        answerB = "Ein zusaetzlicher Sicherheitsschritt neben dem Passwort, z.B. per SMS-Code",
        answerC = "Das Einloggen mit zwei verschiedenen Passwoertern",
        answerD = "Ein Fingerabdruckscan als alleinige Anmeldung",
        correctAnswer = 1,
        explanation = "Bei der Zwei-Faktor-Authentifizierung muss man neben dem Passwort noch einen zweiten Beweis liefern -- z.B. einen Code per SMS -- um das Konto zu schuetzen.",
        difficulty = 1,
        funFact = "2FA kann einen Angriff auf dein Konto mit 99,9 Prozent Wahrscheinlichkeit verhindern, selbst wenn das Passwort gestohlen wurde -- laut einer Microsoft-Studie."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist eine Smartphone-Benachrichtigung (Notification)?",
        answerA = "Eine gespeicherte Erinnerung im Kalender",
        answerB = "Eine Kurzmeldung einer App, die auf dem Bildschirm erscheint",
        answerC = "Eine verschluesselte Nachricht",
        answerD = "Ein automatisches Update",
        correctAnswer = 1,
        explanation = "Benachrichtigungen sind Kurzmeldungen, die Apps auf dem Sperrbildschirm oder oben im Display anzeigen -- z.B. neue WhatsApp-Nachrichten oder E-Mails.",
        difficulty = 1,
        funFact = "Studien zeigen, dass Smartphone-Nutzer im Durchschnitt 80-mal pro Tag ihr Handy entsperren -- ausgeloest grossteils durch Benachrichtigungen."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was ist ein WLAN-Passwort?",
        answerA = "Das Passwort fuer das Google-Konto",
        answerB = "Der geheime Code zum Verbinden mit einem kabellosen Netzwerk",
        answerC = "Das PIN der SIM-Karte",
        answerD = "Das Passwort fuer den Router-Neustart",
        correctAnswer = 1,
        explanation = "Das WLAN-Passwort (auch WLAN-Schlussel genannt) ist der Sicherheitscode, den man eingeben muss, um sich mit einem kabellosen Heimnetzwerk zu verbinden.",
        difficulty = 1,
        funFact = "Auf der Unterseite fast jedes WLAN-Routers steht das Standard-Passwort. Sicherheitsexperten empfehlen dringend, es beim Einrichten durch ein eigenes zu ersetzen."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist ein Selfie?",
        answerA = "Ein Foto das man von einem Fremden macht",
        answerB = "Ein Selbstportrait das man mit der Frontkamera des Smartphones aufnimmt",
        answerC = "Ein automatisch generiertes Profilbild",
        answerD = "Ein Foto das per GPS-Standort markiert wird",
        correctAnswer = 1,
        explanation = "Ein Selfie ist ein Selbstportrait, das man mit der nach vorne gerichteten Frontkamera des Smartphones aufnimmt -- oft fuer soziale Medien.",
        difficulty = 1,
        funFact = "Das Oxford-Woerterbuch kuerte 'Selfie' 2013 zum Wort des Jahres. Tatsaechlich gibt es den Begriff seit 2002 in einem australischen Online-Forum."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was macht die App Shazam?",
        answerA = "Sie bearbeitet Fotos automatisch",
        answerB = "Sie erkennt Musik die gerade gespielt wird",
        answerC = "Sie uebersetzt Texte in Echtzeit",
        answerD = "Sie misst den Herzschlag",
        correctAnswer = 1,
        explanation = "Shazam ist eine App, die Musik erkennt -- einfach das Mikrofon ans Lied halten und die App zeigt Titel, Kuenstler und Album an.",
        difficulty = 1,
        funFact = "Shazam wurde 2002 gegruendet, lange vor dem Smartphone-Zeitalter. Man rief eine Nummer an, hielt das Telefon zur Musik und bekam den Song per SMS zurueck."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist eine mobile Datenuebertragung per 4G/LTE?",
        answerA = "Eine WLAN-Verbindung ueber eine Telefonleitung",
        answerB = "Schnelles mobiles Internet ueber das Mobilfunknetz",
        answerC = "Eine Bluetooth-Verbindung ueber grosse Entfernungen",
        answerD = "Eine Satelliten-Internetverbindung",
        correctAnswer = 1,
        explanation = "4G/LTE ist die vierte Generation des Mobilfunkstandards und bietet schnelles mobiles Internet ueber Mobilfunkmasten -- ueberall dort, wo Empfang vorhanden ist.",
        difficulty = 1,
        funFact = "4G LTE wurde in Deutschland 2010 eingefuehrt. Der Nachfolger 5G ist bereits in Staedte verfuegbar und ist bis zu 100-mal schneller."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist ein Emoji?",
        answerA = "Ein Kurzbefehl auf der Tastatur",
        answerB = "Ein kleines Bild oder Symbol in digitalen Nachrichten",
        answerC = "Eine Art Verschluesselung fuer Nachrichten",
        answerD = "Ein japanisches Schriftzeichen",
        correctAnswer = 1,
        explanation = "Emojis sind kleine bunte Symbole oder Bilder, die in Textnachrichten, E-Mails und sozialen Medien verwendet werden, um Gefuehle oder Dinge auszudruecken.",
        difficulty = 1,
        funFact = "Das erste Emoji wurde 1999 vom japanischen Designer Shigetaka Kurita fuer eine mobile Internetplattform entworfen -- es war nur 12 x 12 Pixel gross."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was ist ein Screenshot?",
        answerA = "Ein Foto aus der Kamera-App",
        answerB = "Eine Aufnahme des aktuellen Bildschirminhalts",
        answerC = "Ein Videoausschnitt",
        answerD = "Eine Sicherungskopie aller Daten",
        correctAnswer = 1,
        explanation = "Ein Screenshot ist ein Bild des aktuellen Bildschirminhalts. Auf den meisten Smartphones macht man ihn durch gleichzeitiges Druecken von Ein- und Lautstaerketaste.",
        difficulty = 1,
        funFact = "Screenshots wurden urspruenglich in den 1960er Jahren von Computerprogrammierern genutzt, um Bildschirminhalte fuer Handbuecher zu dokumentieren."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist ein Fingerabdrucksensor am Smartphone?",
        answerA = "Ein Sensor zur Messung der Herzfrequenz",
        answerB = "Ein Sicherheitsfeature zum Entsperren des Geraets per Fingerabdruck",
        answerC = "Ein Drucksensor fuer das Display",
        answerD = "Ein Sensor zur Luftqualitaetsmessung",
        correctAnswer = 1,
        explanation = "Ein Fingerabdrucksensor erkennt den einzigartigen Fingerabdruck des Nutzers und ermoeglicht damit das sichere Entsperren des Smartphones ohne PIN oder Passwort.",
        difficulty = 1,
        funFact = "Das erste Smartphone mit einem eingebauten Fingerabdrucksensor war das Apple iPhone 5S im Jahr 2013 -- es hiess 'Touch ID' und war zu seiner Zeit revolutionaer."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist eine Sprachnotiz (Voice Memo) auf dem Smartphone?",
        answerA = "Eine Textnachricht in Grossbuchstaben",
        answerB = "Eine per Mikrofon aufgenommene Audioaufzeichnung",
        answerC = "Eine Sprachuebersetzung in Echtzeit",
        answerD = "Eine automatisch vorgelesene E-Mail",
        correctAnswer = 1,
        explanation = "Eine Sprachnotiz ist eine kurze Audioaufnahme, die man mit dem Mikrofon des Smartphones aufzeichnet -- z.B. um sich Dinge zu merken oder lange Texte zu diktieren.",
        difficulty = 1
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist eine SIM-Karte im Smartphone?",
        answerA = "Eine Speicherkarte fuer Fotos",
        answerB = "Ein kleiner Chip der die Handynummer und Netzwerkdaten speichert",
        answerC = "Ein Prozessor fuer schnellere Apps",
        answerD = "Ein Akku-Erweiterungsmodul",
        correctAnswer = 1,
        explanation = "Die SIM-Karte (Subscriber Identity Module) ist ein kleiner Chip, der die Handynummer, Netzzugangs-Daten und Kontakte speichert und das Einloggen ins Mobilfunknetz ermoeglicht.",
        difficulty = 1,
        funFact = "Die erste SIM-Karte war 1991 noch so gross wie eine Kreditkarte. Heute ist die kleinste Version (Nano-SIM) kleiner als ein Fingernagel."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'App aktualisieren' (Update)?",
        answerA = "Die App loeschen und neu installieren",
        answerB = "Eine neuere Version der App installieren",
        answerC = "Die App auf ein anderes Geraet uebertragen",
        answerD = "Die App-Einstellungen zuruecksetzen",
        correctAnswer = 1,
        explanation = "Ein App-Update installiert eine neuere Version der App, die Fehler behebt, Sicherheitsluecken schliesst und neue Funktionen hinzufuegen kann.",
        difficulty = 1,
        funFact = "Durchschnittlich veroffentlicht jede groessere App wie WhatsApp oder Instagram alle 2-3 Wochen ein Update -- im Jahr macht das 15-25 Updates pro App."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist Google Assistant?",
        answerA = "Ein Navigationsdienst",
        answerB = "Ein KI-gestuetzter Sprachassistent von Google",
        answerC = "Eine E-Mail-App von Google",
        answerD = "Ein Sicherheitsprogramm fuer Android",
        correctAnswer = 1,
        explanation = "Google Assistant ist ein KI-gestuetzter Sprachassistent von Google, der auf Smartphones und Smart Speakern verfuegbar ist und Fragen beantwortet, Erinnerungen setzt und Geraete steuert.",
        difficulty = 1,
        funFact = "Google Assistant wurde 2016 eingefuehrt und versteht Kontextfragen -- man kann also sagen 'Wer ist er?' nach einer vorherigen Frage und er versteht den Bezug."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist ein digitales Foto im Vergleich zu einem analogen Foto?",
        answerA = "Es ist kleiner und weniger detailliert",
        answerB = "Es wird als Datei gespeichert statt auf Film",
        answerC = "Es kann nur auf dem Smartphone angesehen werden",
        answerD = "Es braucht eine Internetverbindung",
        correctAnswer = 1,
        explanation = "Digitale Fotos werden als Bilddateien (z.B. JPEG) auf Speichermedien gespeichert. Analoge Fotos entstehen auf lichtempfindlichem Film der chemisch entwickelt werden muss.",
        difficulty = 1,
        funFact = "Die Firma Kodak -- einst groesster Filmhersteller der Welt -- erfand selbst die digitale Kamera 1975, verdraengte die Erfindung aber aus Angst vor Gewinnverlusten."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist eine Einkaufs-App?",
        answerA = "Eine App die Preise scannt und vergleicht",
        answerB = "Eine App mit der man Online-Shopping betreiben kann",
        answerC = "Eine App fuer Rezepte und Kochen",
        answerD = "Eine App fuer Haushaltsbuch-Fuehrung",
        correctAnswer = 1,
        explanation = "Eine Einkaufs-App (wie Amazon, Zalando, Otto) ermoegicht es, Produkte auf dem Smartphone zu suchen, vergleichen und kaufen -- bequem von zuhause.",
        difficulty = 1,
        funFact = "Ueber 50 Prozent aller Online-Einkauefe in Deutschland werden bereits ueber ein Mobilgeraet getaetigt -- der Trend nimmt jedes Jahr zu."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist 'Flugmodus' (Airplane Mode) beim Smartphone?",
        answerA = "Ein Modus der die Helligkeit automatisch anpasst",
        answerB = "Ein Modus der alle Funkverbindungen des Geraets ausschaltet",
        answerC = "Ein Energiesparmodus",
        answerD = "Ein Modus fuer bessere Kamerafotos",
        correctAnswer = 1,
        explanation = "Der Flugmodus schaltet alle Funkverbindungen (WLAN, Mobilfunk, Bluetooth) aus -- er ist im Flugzeug vorgeschrieben, kann aber auch zum Energiesparen genutzt werden.",
        difficulty = 1,
        funFact = "Trotz des Namens darf man im Flugzeug WLAN nutzen, wenn es das Flugzeug anbietet -- man muss nur zuerst den Flugmodus aktivieren und WLAN danach manuell einschalten."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist eine Kamera-Zeitlupenfunktion (Slow Motion)?",
        answerA = "Eine Funktion die Fotos in Schwarz-Weiss umwandelt",
        answerB = "Eine Funktion die Videos verlangsamt wiedergibt fuer flussigere Bewegungen",
        answerC = "Eine Funktion fuer Langzeitbelichtungen bei Nacht",
        answerD = "Eine Funktion um Videos zu beschleunigen",
        correctAnswer = 1,
        explanation = "Slow Motion filmt mit sehr vielen Bildern pro Sekunde (z.B. 240 fps statt 30 fps), so dass das Video in der Wiedergabe viel langsamer und fliessender erscheint.",
        difficulty = 1,
        funFact = "Hochgeschwindigkeitskameras fuer wissenschaftliche Zwecke koennen ueber eine Million Bilder pro Sekunde aufnehmen -- Tropfen und Explosionen werden so sichtbar."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist ein Passwort-Manager?",
        answerA = "Eine Funktion die Passwoerter automatisch aendert",
        answerB = "Eine App oder Funktion die Passwoerter sicher speichert und eingibt",
        answerC = "Ein Sicherheitsprogramm das Hacker blockiert",
        answerD = "Eine Zwei-Faktor-Authentifizierung",
        correctAnswer = 1,
        explanation = "Ein Passwort-Manager speichert alle Passwoerter sicher und verschluesselt -- man merkt sich nur ein Hauptpasswort und der Manager fuellt die anderen automatisch aus.",
        difficulty = 1,
        funFact = "Sicherheitsexperten empfehlen einen Passwort-Manager, weil der durchschnittliche Nutzer heute ueber 100 Online-Konten hat -- und fuer jedes ein anderes sicheres Passwort braucht."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist eine Video-Konferenz-App wie Zoom oder Teams?",
        answerA = "Eine App fuer Videobearbeitung",
        answerB = "Eine App fuer Videoanrufe mit mehreren Teilnehmern gleichzeitig",
        answerC = "Eine App fuer Videospiele online",
        answerD = "Eine App zum Anschauen von YouTube-Videos",
        correctAnswer = 1,
        explanation = "Videokonferenz-Apps wie Zoom oder Microsoft Teams ermoeglichen Videoanrufe mit vielen Teilnehmern gleichzeitig -- beliebt fuer Homeoffice und Online-Unterricht.",
        difficulty = 1,
        funFact = "Zoom hatte vor der COVID-19-Pandemie 10 Millionen taegliche Nutzer. Im April 2020 waren es 300 Millionen -- ein Wachstum von 3000 Prozent in drei Monaten."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist eine Wecker-App?",
        answerA = "Eine App die Lautsprecher fernsteuert",
        answerB = "Eine App die zu einer eingestellten Zeit einen Alarm auslost",
        answerC = "Eine App die Schlafmuster aufzeichnet",
        answerD = "Eine App fuer Stoppuhr und Timer",
        correctAnswer = 1,
        explanation = "Eine Wecker-App ermoegicht es, eine oder mehrere Weckzeiten einzustellen. Zum vereinbarten Zeitpunkt gibt das Smartphone einen Ton oder ein Vibrieren ab.",
        difficulty = 1
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist eine Taschenlampen-Funktion beim Smartphone?",
        answerA = "Ein Display-Hintergrundlicht fuer den Aussenbereich",
        answerB = "Die Nutzung des Kamerablitzes als Taschenlampe",
        answerC = "Eine LED-Statusanzeige fuer Benachrichtigungen",
        answerD = "Ein Blaulicht-Filter fuer den Bildschirm",
        correctAnswer = 1,
        explanation = "Die Taschenlampen-Funktion nutzt die helle LED des Kamerablitzes als dauerhafte Lichtquelle -- praktisch im Dunkeln, ohne extra Taschenlampe.",
        difficulty = 1,
        funFact = "Die Taschenlampen-App war lange eine der meistgenutzten Apps ueberhaupt -- bis Apple und Google die Funktion direkt ins Betriebssystem integrierten und keine separate App mehr noetig war."
    )
)
