package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsHard3(): List<Question> = listOf(

    // Question 1 - TV Showrunning: Writers Room
    Question(
        categoryId = 4,
        questionText = "Wie viele Drehbuchautoren umfasste das Writers Room der ersten Staffel von 'The West Wing' (1999), das Aaron Sorkin als Showrunner leitete?",
        answerA = "Nur Aaron Sorkin allein",
        answerB = "Etwa 3 bis 4 Autoren",
        answerC = "Etwa 8 bis 10 Autoren",
        answerD = "Ueber 20 Autoren",
        correctAnswer = 0, // A
        explanation = "Aaron Sorkin schrieb in den ersten vier Staffeln von 'The West Wing' nahezu alle Drehbuecher weitgehend allein. Er arbeitete mit einem sehr kleinen Autorenteam, dominierte den Writers Room aber so stark, dass es de facto sein alleiniges Werk war. Diese extreme Arbeitsbelastung fuehrte letztlich zu seinem Ausscheiden nach Staffel 4.",
        difficulty = 3,
        funFact = "Sorkin schrieb bis zu 88 Episoden in vier Jahren — ein Pensum, das als fast unmenschlich gilt und seinen Drogenkonsum dieser Zeit begleitete."
    ),

    // Question 2 - TV Showrunning: Pilot Episodes
    Question(
        categoryId = 4,
        questionText = "Welche US-Serie hatte einen sogenannten 'Backdoor Pilot' als Teil einer laufenden Serie, bevor sie als eigenstaendige Show gestartet wurde — und wurde dabei so bekannt, dass der Begriff 'Backdoor Pilot' massgeblich durch dieses Beispiel gepraegte?",
        answerA = "Better Call Saul (Backdoor in Breaking Bad)",
        answerB = "Frasier (Backdoor in Cheers)",
        answerC = "The Jeffersons (Backdoor in All in the Family)",
        answerD = "Angel (Backdoor in Buffy)",
        correctAnswer = 1, // B
        explanation = "Frasier Crane wurde in 'Cheers' so populaer, dass NBC ihm eine eigene Show gab. 'Frasier' (1993-2004) gilt als das klassische Paradebeispiel des Backdoor Pilots, bei dem eine Nebenfigur aus einer laufenden Serie so viel Potenzial zeigt, dass ein Spin-off entsteht. Die Figur wurde gezielt so geschrieben, dass sie spinoff-faehig war.",
        difficulty = 3,
        funFact = "Frasier gewann 11 Emmy Awards als Outstanding Comedy Series in Folge (1994-2004) — ein bis heute ungebrochener Rekord."
    ),

    // Question 3 - TV Showrunning: Syndication
    Question(
        categoryId = 4,
        questionText = "Wie viele Episoden benoetigt eine US-Fernsehserie ueblicherweise, um profitabel in die Syndication (Wiederholungsverwertung) verkauft werden zu koennen?",
        answerA = "Mindestens 22 Episoden (eine Staffel)",
        answerB = "Mindestens 50 Episoden",
        answerC = "Mindestens 100 Episoden",
        answerD = "Mindestens 150 Episoden",
        correctAnswer = 2, // C
        explanation = "Die Faustregel der US-Fernsehindustrie lautet, dass eine Serie mindestens 100 Episoden benoetigt, um in die lukrative Syndication-Verwertung zu gehen. Bei 100 Folgen kann ein Sender die Serie werktaeglich wiederholen, ohne dass sich Folgen innerhalb eines Quartals wiederholen. Dies erklaert, warum viele Serien trotz sinkender Quoten nicht abgesetzt werden.",
        difficulty = 3,
        funFact = "Seinfeld erzielte durch Syndication-Deals Einnahmen von ueber einer Milliarde Dollar — mehr als die urspruenglichen Ausstrahlungsrechte einbrachten."
    ),

    // Question 4 - HBO Model: Premium TV Revolution
    Question(
        categoryId = 4,
        questionText = "Welches war das erste HBO-Original-Drama, das die Formel 'cineastische Qualitaet + kein Werbedruck + komplexe Charaktere' etablierte und den Beginn der 'Prestige-TV'-Aera einlaeuten?",
        answerA = "The Sopranos (1999)",
        answerB = "Oz (1997)",
        answerC = "The Wire (2002)",
        answerD = "Six Feet Under (2001)",
        correctAnswer = 1, // B
        explanation = "Oz (1997-2003) war das erste einstuendige HBO-Original-Drama und legte das Fundament fuer das spaetere Prestige-TV. Die Gefaengnisserie von Tom Fontana zeigte erstmals komplexe Moralitaet, explizite Gewalt und eine serielle Erzaehlung ohne Ruecksicht auf Werbesponsor-Bedenken. The Sopranos (1999) verfeinerte dieses Modell dann zum Massenmarkterfolg.",
        difficulty = 3,
        funFact = "HBO stand jahrelang fuer 'Home Box Office' — ein Pay-TV-Kanal der 1972 als Kabelnetz-Experiment startete, bevor er zum Qualitaetssymbol wurde."
    ),

    // Question 5 - Peak TV Era
    Question(
        categoryId = 4,
        questionText = "Welcher FX-Serienchef praegte den Begriff 'Peak TV' im Jahr 2015, um die Uebersaettigung des Marktes mit Qualitaetsserien zu beschreiben?",
        answerA = "Ryan Murphy",
        answerB = "John Landgraf",
        answerC = "Jason Blum",
        answerD = "Shonda Rhimes",
        correctAnswer = 1, // B
        explanation = "John Landgraf, CEO von FX Networks, verwendete den Begriff 'Peak TV' erstmals offiziell im August 2015 auf der Television Critics Association. Er warnte, dass die schiere Menge an Qualitaetsserien (damals ca. 400 Scripted Series pro Jahr) nicht nachhaltig sei. Ironischerweise stieg die Zahl danach weiter auf ueber 500 im Jahr 2019.",
        difficulty = 3,
        funFact = "Im Jahr 2022 wurden erstmals seit dem Peak wieder weniger als 500 Scripted Series in den USA produziert — ein Zeichen, dass Landgrafs Warnung schliesslich behoert wurde."
    ),

    // Question 6 - Streaming Wars Specifics
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr startete Netflix seinen Streaming-Dienst in Deutschland, und welche Serie war der erste grosse deutschsprachige Netflix-Original-Eigenprodukion?",
        answerA = "2013, 'Dark'",
        answerB = "2014, 'How to Sell Drugs Online (Fast)'",
        answerC = "2014, 'Dark'",
        answerD = "2016, 'Dark'",
        correctAnswer = 2, // C
        explanation = "Netflix startete seinen Streaming-Dienst in Deutschland im September 2014. Die erste grosse deutschsprachige Netflix-Eigenproduktion war 'Dark' (2017-2020), eine Science-Fiction-Thriller-Serie von Baran bo Odar und Jantje Friese. Sie wurde in ueber 190 Laendern ausgestrahlt und gilt als eine der besten nicht-englischsprachigen Serien auf Netflix.",
        difficulty = 3,
        funFact = "Dark wurde in Deutschland so erfolgreich, dass Netflix danach stark in deutschsprachige Produktionen investierte — darunter 'Barbaren', 'Biohackers' und 'Kitz'."
    ),

    // Question 7 - Famous TV Finales
    Question(
        categoryId = 4,
        questionText = "Das Finale von 'The Sopranos' (2007) endet mit einem abrupten Schnitt ins Schwarz. Welche Diner-Szene wurde in dieser letzten Szene verwendet, und welcher Song lief dabei?",
        answerA = "Blondie - Heart of Glass, Tony isst Onion Rings",
        answerB = "Journey - Don't Stop Believin', Tony isst Onion Rings",
        answerC = "Springsteen - Born to Run, Tony trinkt Kaffee",
        answerD = "Van Morrison - Gloria, Tony liest Zeitung",
        correctAnswer = 1, // B
        explanation = "Das legendaere Finale 'Made in America' endet mit Tony Soprano im Diner, der 'Don't Stop Believin'' von Journey auf der Jukebox spielt, waehrend seine Familie ankommt. Der abrupte Schwarzschnitt mitten im Song spaltet bis heute Publikum und Kritiker. Showrunner David Chase bestaetigt bis heute nicht, ob Tony stirbt.",
        difficulty = 3,
        funFact = "Nach dem Finale stiegen die Verkaufszahlen von 'Don't Stop Believin'' um ueber 400 Prozent — der Song wurde zur meistgekauften Katalog-Single auf iTunes bis zu Michaels Jacksons Tod."
    ),

    // Question 8 - Famous TV Finales Reception
    Question(
        categoryId = 4,
        questionText = "Das Serienfinale von 'Game of Thrones' Staffel 8 (2019) wurde von Fans massiv kritisiert. Wie viele Unterschriften sammelte die Online-Petition, die eine Neuverfilmung der letzten Staffel forderte?",
        answerA = "Etwa 500.000 Unterschriften",
        answerB = "Etwa 1 Million Unterschriften",
        answerC = "Ueber 1,8 Millionen Unterschriften",
        answerD = "Ueber 3 Millionen Unterschriften",
        correctAnswer = 2, // C
        explanation = "Die Change.org-Petition 'Remake Game of Thrones Season 8 with competent writers' sammelte innerhalb weniger Wochen ueber 1,8 Millionen Unterschriften. Das Finale 'The Iron Throne' erhielt trotzdem einen Emmy fuer Outstanding Drama Series — was die Kluft zwischen Kritikern und Publikum in der Peak-TV-Aera symbolisiert.",
        difficulty = 3,
        funFact = "Die letzte Staffel von Game of Thrones hatte ein Budget von 90 Millionen US-Dollar — das entspricht etwa 15 Millionen pro Episode, mehr als viele Hollywood-Spielfilme."
    ),

    // Question 9 - TV Ratings: Nielsen
    Question(
        categoryId = 4,
        questionText = "Was misst ein 'Nielsen Rating' von 1.0 in den USA genau, und wie viele Haushalt entspricht das ungefaehr?",
        answerA = "1 Prozent aller TV-Haushalt, ca. 1,2 Millionen",
        answerB = "1 Prozent der Gesamtbevoelkerung, ca. 3,3 Millionen Personen",
        answerC = "1 Prozent aller Einschaltenden eines Abends",
        answerD = "1000 befragte Nielsen-Panelisten",
        correctAnswer = 1, // B
        explanation = "Ein Nielsen Rating von 1.0 entspricht 1 Prozent der gesamten US-Fernsehbevoelkerung (nicht nur der aktuell Einschaltenden). Das Nielsen-Unternehmen schaetzt diese Zahl auf Basis einer Stichprobe von etwa 50.000 Haushalten hoch. Ein Rating von 1.0 entspricht ca. 3,3 Millionen Personen (Stand 2022).",
        difficulty = 3,
        funFact = "Nielsen wurde 1923 von Arthur C. Nielsen gegruendet, urspruenglich als Marktforschungsunternehmen fuer Konsumgueter — Fernsehen gab es damals noch gar nicht."
    ),

    // Question 10 - TV Ratings: AGF Germany
    Question(
        categoryId = 4,
        questionText = "Was ist die AGF Video Research GmbH, und welche Methode verwendet sie primaer zur Einschaltquotenmessung in Deutschland?",
        answerA = "Ein staatliches Amt, das alle TV-Genehmigungen erteilt",
        answerB = "Ein Branchenverbund mit Messgeraeten (Telemetrieboxen) in repraesentativen Testhaushalten",
        answerC = "Ein Online-Panel mit freiwilligen Zuschauern die manuell eintragen was sie sehen",
        answerD = "Ein Algorithmus der Social-Media-Erwaehungen auswertet",
        correctAnswer = 1, // B
        explanation = "Die AGF (Arbeitsgemeinschaft Fernsehforschung) Video Research GmbH ist ein Zusammenschluss der deutschen TV-Sender zur einheitlichen Quotenmessung. Sie betreibt ein Panel von ca. 5.000 repraesentativen Haushalten mit Telemetrieboxen, die sekundengenau messen, was geschaut wird. Diese Daten werden dann auf die Gesamtbevoelkerung hochgerechnet.",
        difficulty = 3,
        funFact = "Die AGF-Daten sind der Goldstandard fuer Werbepreise im deutschen Fernsehen — ein Marktanteil von 15 Prozent gilt als sehr gutes Ergebnis fuer eine Primetime-Sendung."
    ),

    // Question 11 - International TV Formats
    Question(
        categoryId = 4,
        questionText = "Das britische Format 'Pop Idol' (2001) wurde weltweit adaptiert. Wie heisst die US-Adaption, die in Deutschland zum Pendant 'Deutschland sucht den Superstar' (DSDS) wurde?",
        answerA = "The X Factor",
        answerB = "American Idol",
        answerC = "The Voice",
        answerD = "America's Got Talent",
        correctAnswer = 1, // B
        explanation = "Pop Idol (ITV, 2001) wurde in den USA zu American Idol (Fox, 2002-2016, dann ABC) und in Deutschland zu DSDS (RTL, 2002). Das Format von Simon Fuller (19 Entertainment) etablierte das moderne Castingshow-Genre. American Idol blieb 15 Jahre lang die meistgesehene Primetime-Show in den USA.",
        difficulty = 3,
        funFact = "Das Format-Recht fuer internationale Adaptionen von TV-Shows ist ein milliardenschweres Geschaeft — Simon Fuller verdiente mit American Idol mehr als mit seinen urspruenglichen Musikkarrieren."
    ),

    // Question 12 - International TV Format Adaptations
    Question(
        categoryId = 4,
        questionText = "Das israelische TV-Format 'Homeland' basiert auf welcher israelischen Originalserie, und welches Produktionsstudio kaufte die Rechte?",
        answerA = "BeTipul (In Treatment), HBO",
        answerB = "Prisoners of War (Hatufim), Fox 21 Television Studios",
        answerC = "Tehran, Showtime",
        answerD = "Fauda, Netflix",
        correctAnswer = 1, // B
        explanation = "Homeland (Showtime, 2011-2020) basiert auf der israelischen Serie 'Prisoners of War' (Hatufim, Keshet Broadcasting, 2010). Fox 21 Television Studios kaufte die Adaptionsrechte. Showtime-Produzenten Howard Gordon und Alex Gansa schufen daraus eine der praegendsten Post-9/11-Spionageserien.",
        difficulty = 3,
        funFact = "Israel gilt als einer der kreativsten Exporteure von TV-Formaten weltweit — neben Hatufim wurden auch 'BeTipul' (zur HBO-Serie In Treatment) und 'Euphoria' aus Israel adaptiert."
    ),

    // Question 13 - Anime: Studio Ghibli
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr gruendeten Hayao Miyazaki, Isao Takahata und Toshio Suzuki Studio Ghibli, und welcher Film war die erste Eigenproduktion des Studios?",
        answerA = "1983, Nausicaa aus dem Tal der Winde",
        answerB = "1985, Das Schloss im Himmel (Laputa)",
        answerC = "1984, Mein Nachbar Totoro",
        answerD = "1985, Nausicaa aus dem Tal der Winde",
        correctAnswer = 1, // B
        explanation = "Studio Ghibli wurde im Juni 1985 in Koganei, Tokyo, gegruendet. Der erste Film, der unter dem Ghibli-Label produziert wurde, war 'Das Schloss im Himmel' (Tenku no Shiro Laputa, 1986). 'Nausicaa' (1984) war der Anstosspunkt fuer die Studiogruendung, wurde aber noch unter Topcraft produziert.",
        difficulty = 3,
        funFact = "Der Name 'Ghibli' stammt von einem italienischen Aufklaerungs-Flugzeug aus dem Zweiten Weltkrieg (IMAM Ro.37), das Miyazaki als Kind faszinierte — und bedeutet 'heisser Wuestenwind aus der Sahara'."
    ),

    // Question 14 - Anime: Hideaki Anno / Evangelion
    Question(
        categoryId = 4,
        questionText = "Hideaki Anno litt waehrend der Produktion von 'Neon Genesis Evangelion' (1995-1996) an schweren Depressionen, was die letzten Episoden stark beeinflusste. Wie reagierten viele japanische Fans auf das kontroverse Serienfinale?",
        answerA = "Sie feierten es als kuenstlerisches Meisterwerk und Anno erhielt den wichtigsten Anime-Preis",
        answerB = "Anno erhielt Morddrohungen, und Gainax wurde mit Schmierereien beschmiert",
        answerC = "Die letzte Episode wurde aus dem Fernsehen zensiert und nie ausgestrahlt",
        answerD = "Gainax wurde bankrott und musste das Studio aufloesen",
        correctAnswer = 1, // B
        explanation = "Das Serienfinale von NGE (Episoden 25-26, 1996) verzichtete auf handlungslogische Aufloesungen und konzentrierte sich stattdessen auf introspektive Bewusstseinsreisen der Protagonisten. Viele Fans reagierten mit Wut: Anno erhielt Morddrohungen, Gainax' Buero wurde mit Graffiti beschmiert. Der Film 'End of Evangelion' (1997) entstand als direkte Reaktion auf diese Kritik.",
        difficulty = 3,
        funFact = "Anno war zu diesem Zeitpunkt so depressiv, dass er innerhalb der letzten Episoden nur die absolut minimalen Mittel nutzte — Storyboards wurden als Standbilder ausgestrahlt, weil Geld und Energie fehlten."
    ),

    // Question 15 - Anime: Makoto Shinkai
    Question(
        categoryId = 4,
        questionText = "Makoto Shinkais Film 'Your Name' (Kimi no Na wa, 2016) brach in Japan alle Einspielergebnisse. Welchen Platz belegte er lange Zeit in der weltweiten Animationsfilm-Kassenhistorie?",
        answerA = "Platz 1 aller Zeiten (bis Avatar 2)",
        answerB = "Platz 2 aller Zeiten (hinter Spirited Away)",
        answerC = "Platz 4 aller Zeiten (hinter den drei Ghibli-Filmen)",
        answerD = "Platz 10 aller Zeiten",
        correctAnswer = 1, // B
        explanation = "Your Name spielte weltweit ueber 380 Millionen US-Dollar ein und war damit der erfolgreichste Anime-Film aller Zeiten — bis 'Demon Slayer: Mugen Train' (2020) ihn ueberholte. Shinkai gelang das Kunststueck mit einem moderaten Budget und einem kleinen Team, was ihn als 'naechsten Miyazaki' etablierte.",
        difficulty = 3,
        funFact = "Shinkai produzierte seinen Durchbruchkurzfilm 'She and Her Cat' (2000) quasi allein auf einem PowerMac G4 — er zeichnete, animierte und vertonte alles selbst."
    ),

    // Question 16 - Anime: Specific Studios
    Question(
        categoryId = 4,
        questionText = "Welches Anime-Studio ist bekannt fuer seine 'sakuga'-intensiven Actionsequenzen und produzierte sowohl 'Demon Slayer' (Kimetsu no Yaiba) als auch 'Sword Art Online'?",
        answerA = "Madhouse",
        answerB = "Ufotable",
        answerC = "A-1 Pictures",
        answerD = "Bones",
        correctAnswer = 2, // C
        explanation = "A-1 Pictures (Tochter von Aniplex/Sony Music) produzierte 'Sword Art Online' (2012). 'Demon Slayer' hingegen wurde von Ufotable produziert, das fuer seine aussergewoehnliche Animationsqualitat und spektakulaere Effekte bekannt ist. Ufotable ist auch bekannt fuer die 'Fate/Stay Night: Unlimited Blade Works' Serie.",
        difficulty = 3,
        funFact = "Der Begriff 'sakuga' bezeichnet besonders qualitativ hochwertige Animationssequenzen, oft von Staranimatoren gezeichnet. Fans identifizieren Animatoren an ihrem unverwechselbaren Stil in sakuga-Momenten."
    ),

    // Question 17 - Anime: Osamu Tezuka
    Question(
        categoryId = 4,
        questionText = "Osamu Tezuka gilt als 'Gott des Manga' und pragte den fruehen japanischen Anime. Welches Studio gruendete er, und welche Serie war der erste japanische Serien-Anime fuer das Fernsehen?",
        answerA = "Toei Animation, Hakujaden (1958)",
        answerB = "Mushi Pro, Astro Boy (Tetsuwan Atom, 1963)",
        answerC = "Tezuka Productions, Princess Knight (1967)",
        answerD = "Sunrise, Mobile Suit Gundam (1979)",
        correctAnswer = 1, // B
        explanation = "Osamu Tezuka gruendete Mushi Productions (Mushi Pro) und produzierte 'Astro Boy' (Tetsuwan Atom), der am 1. Januar 1963 startete und als erster japanischer Serien-Anime gilt. Tezuka revolutionierte mit seinem 'limited animation'-Ansatz (weniger Frames, mehr Ausdruck) die Produktionsweise.",
        difficulty = 3,
        funFact = "Tezuka verkaufte die Rechte an Astro Boy an den US-Sender NBC fuer nur 500 Dollar pro Episode — ein Preis, den er spaeter als groessten Fehler seiner Karriere bezeichnete."
    ),

    // Question 18 - Korean Cinema: Bong Joon-ho
    Question(
        categoryId = 4,
        questionText = "Bong Joon-hos 'Parasite' (2019) gewann die Goldene Palme in Cannes und vier Oscars. Welcher Oscar war historisch bedeutsam und weshalb?",
        answerA = "Erster fremdsprachiger Film, der Best Picture gewann",
        answerB = "Erster asiatischer Film, der Best Director gewann",
        answerC = "Erster Film, der gleichzeitig Goldene Palme und Best Picture gewann",
        answerD = "A und C gleichzeitig",
        correctAnswer = 3, // D
        explanation = "Parasite war gleichzeitig der erste nicht-englischsprachige Film, der den Oscar fuer Best Picture gewann (seit Einfuehrung des fremdsprachigen Film-Oscars 1956), UND der erste Film, der im selben Jahr Goldene Palme (Cannes) und Best Picture (Oscars) gewann. Bong Joon-ho gewann ausserdem Best Director.",
        difficulty = 3,
        funFact = "In seiner Oscar-Dankesrede sagte Bong Joon-ho: 'Wenn ihr die Ein-Zoll-Untertitelbarriere ueberwinden koennt, werdet ihr so viel mehr wunderschoene Filme erleben.' — eine vielzitierte Aussage ueber die Schranken der englischsprachigen Filmwelt."
    ),

    // Question 19 - Korean Cinema: Park Chan-wook
    Question(
        categoryId = 4,
        questionText = "Park Chan-wooks 'Oldboy' (2003) gewann in Cannes den Grossen Preis der Jury. Welcher Hollywood-Regisseur war Jury-Praesident und setzte sich persoenlich fuer den Preis ein?",
        answerA = "Quentin Tarantino",
        answerB = "Martin Scorsese",
        answerC = "Steven Spielberg",
        answerD = "Francis Ford Coppola",
        correctAnswer = 0, // A
        explanation = "Quentin Tarantino war 2004 Jury-Praesident in Cannes und setzte sich massgeblich dafuer ein, dass 'Oldboy' den Grossen Preis der Jury erhielt. Tarantino war ein offensichtlicher Fan des koreanischen Kinos und wollte urspruenglich sogar den Hauptpreis (Goldene Palme) an Oldboy vergeben.",
        difficulty = 3,
        funFact = "Park Chan-wooks 'Vengeance Trilogie' (Sympathy for Mr. Vengeance, Oldboy, Lady Vengeance) gilt als Blaupause fuer das moderne koreanische Arthouse-Actionkino und beeinflusste zahlreiche westliche Regisseure."
    ),

    // Question 20 - K-Drama Wave: Hallyu
    Question(
        categoryId = 4,
        questionText = "Die 'Koreanische Welle' (Hallyu) begann Ende der 1990er. Welche K-Drama-Serie gilt als der Startschuss fuer die internationale Popularitaet koreanischer Fernsehserien in Ostasien?",
        answerA = "Boys Over Flowers (2009)",
        answerB = "Winter Sonata (Gyeoul Yeonga, 2002)",
        answerC = "My Love from the Star (2013)",
        answerD = "Crash Landing on You (2019)",
        correctAnswer = 1, // B
        explanation = "Winter Sonata (KBS2, 2002) mit Bae Yong-joon und Choi Ji-woo loeste in Japan und ganz Ostasien einen wahren K-Drama-Boom aus. Die Liebesgeschichte wurde in 20 Laender exportiert und machte Hauptdarsteller Bae zum ersten koreanischen Hallyu-Star. Japan importierte das Format massenhaft und pragte den Begriff 'Yon-sama' als Verehrungs-Titel.",
        difficulty = 3,
        funFact = "Bae Yong-joon loeste bei einem Besuch in Japan 2004 derartige Fan-Hysterie aus, dass der Flughafen Narita fuer Stunden lahmgelegt wurde."
    ),

    // Question 21 - K-Drama: Global Netflix Success
    Question(
        categoryId = 4,
        questionText = "Squid Game (Netflix, 2021) wurde zur erfolgreichsten Nicht-Englisch-Netflix-Serie aller Zeiten. Wie lange dauerte es, bis sie die vorherige Rekordhalterin verdraengte, und welche Serie war das?",
        answerA = "2 Wochen, verdraengte Bridgerton",
        answerB = "4 Tage, verdraengte Lupin (Frankreich)",
        answerC = "3 Wochen, verdraengte Dark (Deutschland)",
        answerD = "1 Woche, verdraengte Money Heist (Spanien)",
        correctAnswer = 0, // A
        explanation = "Squid Game verdraengte nach etwa zwei Wochen die britische Period-Drama-Serie 'Bridgerton' als meistgesehene Netflix-Serie aller Zeiten. 'Bridgerton' war zuvor die Rekordhalterin mit 82 Millionen Haushalten in den ersten 28 Tagen. Squid Game uebertraf das mit 111 Millionen Haushalten.",
        difficulty = 3,
        funFact = "Creator Hwang Dong-hyuk schrieb das Skript zu Squid Game bereits 2008, konnte es aber ein Jahrzehnt lang nicht verkaufen, weil Studios es als zu dunkel und zu teuer erachteten."
    ),

    // Question 22 - TV Writers Room: Structure
    Question(
        categoryId = 4,
        questionText = "Welche Hierarchiestufe im US-amerikanischen TV-Writers-Room bezeichnet jemanden, der die gesamte Serie verantwortet, Drehbuecher ueberschreibt, mit dem Netzwerk verhandelt UND an den Drehs anwesend ist?",
        answerA = "Executive Producer",
        answerB = "Showrunner",
        answerC = "Staff Writer",
        answerD = "Co-Executive Producer",
        correctAnswer = 1, // B
        explanation = "Der 'Showrunner' ist eine in Europa oft missverstandene Rolle: Er kombiniert die kreative Verantwortung eines Head Writers mit der produzierenden Kontrolle eines Executive Producers. Der Begriff ist keine offizielle Guild-Bezeichnung, sondern ein Branchenterm. Aaron Sorkin, David Chase und Vince Gilligan sind Parade-Showrunner.",
        difficulty = 3,
        funFact = "Im britischen TV gibt es traditionell keinen Showrunner — der 'Lead Writer' und der 'Executive Producer' sind oft verschiedene Personen, was bei Doctor Who immer wieder zu kuenstlerischen Konflikten fuehrt."
    ),

    // Question 23 - HBO Premium TV: Oz and Language
    Question(
        categoryId = 4,
        questionText = "Welches war die erste US-amerikanische Fernsehserie, die offen schwule Charaktere und HIV/AIDS als zentrale Handlungsstrang in ein Mainstream-Primetime-Drama einbrachte?",
        answerA = "Oz (HBO, 1997)",
        answerB = "Thirtysomething (ABC, 1987)",
        answerC = "Will & Grace (NBC, 1998)",
        answerD = "Six Feet Under (HBO, 2001)",
        correctAnswer = 1, // B
        explanation = "Thirtysomething (ABC, 1987-1991) zeigte 1989 erstmals zwei Maenner im Bett nach einer Nacht — eine Szene, die massiven Werbeboykott ausloeste. Aber Oz (HBO, 1997) war die erste Serie, die HIV/AIDS, homosexuelle Beziehungen und Vergewaltigung in einem Prison-Setting als regulaere, nicht-sensationalisierte Handlungsstrangs behandelte.",
        difficulty = 3,
        funFact = "Nach der Thirtysomething-Episode, die zwei schwule Maenner im Bett zeigte, zogen mehrere grosse Werbekunden ihre Spots zurueck — ABC verlor schaetzungsweise 1 Million Dollar Werbeeinnahmen."
    ),

    // Question 24 - Anime: Satoshi Kon
    Question(
        categoryId = 4,
        questionText = "Satoshi Kon gilt als einer der einflussreichsten Anime-Regisseure. Welcher seiner Filme beeinflusste nachweislich Christopher Nolans 'Inception' (2010)?",
        answerA = "Perfect Blue (1997)",
        answerB = "Paprika (2006)",
        answerC = "Millennium Actress (2001)",
        answerD = "Tokyo Godfathers (2003)",
        correctAnswer = 1, // B
        explanation = "Satoshi Kons 'Paprika' (2006) handelt von einer Therapeutin, die in Traeume eindringt. Christopher Nolan hat zugegeben, von Paprika fuer Inception inspiriert worden zu sein. Bestimmte Szenen — wie die zusammenklappende Stadt oder der traum-in-traum-in-traum-Aufbau — haben auffaellige visuelle Parallelen zu Inception.",
        difficulty = 3,
        funFact = "Satoshi Kon starb 2010 im Alter von nur 46 Jahren an Bauchspeicheldruesenkrebs, mitten in der Produktion seines Films 'The Dreaming Machine', der bis heute nicht fertiggestellt wurde."
    ),

    // Question 25 - TV Finale: Seinfeld
    Question(
        categoryId = 4,
        questionText = "Das Seinfeld-Finale (1998) war das zweitmeistgesehene Serien-Finale in der US-TV-Geschichte. Welches Finale haelt den Rekord, und wie viele Zuschauer sahen das Seinfeld-Ende?",
        answerA = "MASH-Finale 1983 (106 Mio.), Seinfeld 76 Mio.",
        answerB = "Friends-Finale 2004 (52 Mio.), Seinfeld 58 Mio.",
        answerC = "Cheers-Finale 1993 (80 Mio.), Seinfeld 76 Mio.",
        answerD = "ER-Finale 2009 (16 Mio.), Seinfeld 76 Mio.",
        correctAnswer = 0, // A
        explanation = "Das MASH-Finale 'Goodbye, Farewell and Amen' (28. Februar 1983) haelt mit 106 Millionen Zuschauern den ungebrochenen Rekord als meistgesehenes US-Serienepisode aller Zeiten. Das Seinfeld-Finale sahen etwa 76 Millionen Zuschauer — Platz 2 in der Geschichte der US-Finales.",
        difficulty = 3,
        funFact = "Die MASH-Folge war so ereignisreich, dass Krankenhaeuser in US-Staedten von einer Welle an Notaufnahmen nach der Ausstrahlung berichteten — Menschen hatten die ganze Sendung so intensiv verfolgt, dass sie Toilettenpausen verschoben."
    ),

    // Question 26 - Anime: Shonen vs. Seinen
    Question(
        categoryId = 4,
        questionText = "Was unterscheidet 'Shonen'-Anime von 'Seinen'-Anime in der japanischen Medienklassifikation?",
        answerA = "Shonen sind Kurzfilme, Seinen sind Langfilme",
        answerB = "Shonen richten sich primaer an junge maennliche Leser (bis ca. 18), Seinen an erwachsene Maenner",
        answerC = "Shonen haben immer einen maennlichen Hauptcharakter, Seinen eine weibliche Protagonistin",
        answerD = "Shonen sind Schwarzweiss, Seinen sind in Farbe",
        correctAnswer = 1, // B
        explanation = "In Japan sind diese Bezeichnungen demographische Kategorien fuer Manga-Magazine: Shonen (wortlich 'Junge') fuer junge maennliche Leser bis ca. 18 Jahre (z.B. Weekly Shonen Jump mit Naruto, Dragon Ball, One Piece), Seinen ('junger Mann/Erwachsener') fuer maennliche Erwachsene (z.B. Young Magazine mit Berserk, Vinland Saga). Die Anime-Adaptionen uebernehmen diese Kategorisierung.",
        difficulty = 3,
        funFact = "Weekly Shonen Jump ist die bestverkaufte Manga-Zeitschrift der Welt mit einer Wochenauflage von bis zu 6,5 Millionen Exemplaren auf dem Hoehepunkt in den 1990er Jahren."
    ),

    // Question 27 - Korean Cinema: Im Kwon-taek
    Question(
        categoryId = 4,
        questionText = "Wer war der erste koreanische Regisseur, der bei den Filmfestspielen in Cannes den Preis fuer die Beste Regie gewann, und fuer welchen Film?",
        answerA = "Kim Ki-duk fuer 3-Iron (2004)",
        answerB = "Im Kwon-taek fuer Chihwaseon (2002)",
        answerC = "Park Chan-wook fuer Oldboy (2004)",
        answerD = "Hong Sang-soo fuer The Day He Arrives (2011)",
        correctAnswer = 1, // B
        explanation = "Im Kwon-taek gewann 2002 bei den Filmfestspielen Cannes den Preis fuer die Beste Regie fuer 'Chihwaseon' (Painted Fire), einen Film ueber den legendaeren koreanischen Maler Jang Seung-eop. Im Kwon-taek gilt als Godfather des modernen koreanischen Kinos mit ueber 100 Filmen.",
        difficulty = 3,
        funFact = "Im Kwon-taek begann seine Karriere in den 1960er Jahren mit kommerziellen B-Movies, bevor er sich in den 1970ern dem Arthouse-Kino zuwandte — ein Wandel, der ihn zum renommiertesten koreanischen Regisseur seiner Generation machte."
    ),

    // Question 28 - Streaming Wars: Disney+
    Question(
        categoryId = 4,
        questionText = "Disney+ startete im November 2019. Wie lange dauerte es, um 10 Millionen Abonnenten zu gewinnen — eine Marke, die Netflix dafuer sieben Jahre benoetigt hatte?",
        answerA = "Einen Tag",
        answerB = "Eine Woche",
        answerC = "Einen Monat",
        answerD = "Drei Monate",
        correctAnswer = 0, // A
        explanation = "Disney+ meldete innerhalb des ersten Tages nach dem Start am 12. November 2019 ueber 10 Millionen Abonnenten. Netflix hatte fuer diese Marke sieben Jahre benoetigt (2007-2014). Dieser explosive Start unterstrich die Macht der Disney-Marken-Bibliothek (Star Wars, Marvel, Pixar, Disney-Klassiker) als Abonnements-Treiber.",
        difficulty = 3,
        funFact = "Ein erheblicher Teil der Disney+-Abonnenten im ersten Tag waren Familien, die sich fuer The Mandalorian registrierten — die Baby-Yoda/Grogu-Figur wurde zum viralen Internet-Phaenomen."
    ),

    // Question 29 - TV Finales: The Wire
    Question(
        categoryId = 4,
        questionText = "Das Finale der HBO-Serie 'The Wire' (2008) endete mit einer kontroversen kreislauffoermigen Struktur. Welches strukturelle Erzaehlprinzip verwendete Showrunner David Simon explizit als griechische Tragoedie-Referenz?",
        answerA = "Die 'Deus ex Machina'-Aufloesungen aller Handlungsstrangs",
        answerB = "Die Institutionen als unbesiegbare Antagonisten statt einzelner Schurken",
        answerC = "Alle Hauptfiguren sterben am Ende jeder Staffel",
        answerD = "Der Chor-Effekt durch wiederkehrende Nebenfiguren",
        correctAnswer = 1, // B
        explanation = "David Simon beschrieb The Wire als 'amerikanische Tragoedie im griechischen Sinne', in der die Institutionen (Polizei, Politik, Drogenwirtschaft, Bildungssystem, Presse) die unschlagbaren Antagonisten sind — nicht einzelne boese Menschen. Individuelle Helden scheitern immer an systemischen Kraeften. Dieses Prinzip war die kuenstlerische Aussage aller fuenf Staffeln.",
        difficulty = 3,
        funFact = "David Simon war Journalist beim Baltimore Sun, bevor er The Wire schrieb. Die fuenfte Staffel, die Medienkritik thematisiert, gilt als autobiographischste — und polarisierendste — der Serie."
    ),

    // Question 30 - Anime: Madhouse Studio
    Question(
        categoryId = 4,
        questionText = "Welches renommierte Anime-Studio produzierte sowohl 'Death Note' (2006) als auch 'Hunter x Hunter' (2011) und gilt als eines der angesehensten fuer dunkle, komplexe Narrationen?",
        answerA = "Bones",
        answerB = "Madhouse",
        answerC = "Production I.G.",
        answerD = "J.C. Staff",
        correctAnswer = 1, // B
        explanation = "Madhouse (gegruendet 1972) produzierte sowohl Death Note als auch Hunter x Hunter (2011) und ist bekannt fuer komplexe, dunkle Anime wie Claymore, Overlord und Demon King Daimao. Das Studio wurde von Osamu Dezakis gegruendet und gilt als eines der kreativ unabhaengigsten Japans.",
        difficulty = 3,
        funFact = "Madhouse produzierte auch die Marvel-Anime-Serie (Iron Man, X-Men, Wolverine, Blade) fuer den japanischen Markt — ein ungewoehnliches Cross-Media-Experiment zwischen 2010 und 2011."
    ),

    // Question 31 - Nielsen Ratings: Sweeps
    Question(
        categoryId = 4,
        questionText = "Was sind die 'Sweeps Weeks' im US-amerikanischen TV-Kalender, und warum sind sie fuer Sendeanstalten so wichtig?",
        answerA = "Wochen mit besonders guenstigen Werbepreisen im Sommer",
        answerB = "Messzeitraeume im Februar, Mai, Juli, November wo Einschaltquoten fuer Werbepreise festgesetzt werden",
        answerC = "Wochen wo neue Serien aus dem Programm herausgenommen werden",
        answerD = "Zeitraeume fuer die jaehrliche Nielsen-Panelisten-Rekrutierung",
        correctAnswer = 1, // B
        explanation = "Die 'Sweeps' (abgeleitet von 'sweeping' = alle Maerkte gleichzeitig messen) finden vier Mal jaehrlich statt (November, Februar, Mai, Juli) und sind die Perioden, in denen Nielsen die Quoten fuer alle lokalen TV-Maerkte misst. Auf Basis dieser Daten setzen Lokalsender ihre Werbepreise fest — weshalb Sender in Sweeps-Wochen ihre besten Episoden, Gastauftritte und Cliffhanger platzieren.",
        difficulty = 3,
        funFact = "Der Ausdruck 'very special episode' im US-TV stammt aus der Sweeps-Tradition: Sender kuendigten besonders dramatische oder emotionale Folgen an, um in Sweeps-Wochen moeglichst viele Zuschauer anzulocken."
    ),

    // Question 32 - Korean Cinema: Lee Chang-dong
    Question(
        categoryId = 4,
        questionText = "Lee Chang-dongs Film 'Burning' (2018) basiert auf einer Kurzgeschichte von Haruki Murakami. Welcher Preis wurde ihm auf dem Cannes-Festival verliehen, und welche andere Auszeichnung verfehlte er knapp?",
        answerA = "FIPRESCI-Preis Cannes, knapp verfehlte Oscar-Nominierung",
        answerB = "Grosser Preis der Jury Cannes, knapp verfehlte die Goldene Palme",
        answerC = "FIPRESCI-Preis Cannes, knapp verfehlte die Goldene Palme (hoechste Wertung der Geschichte)",
        answerD = "Bester Regisseur Cannes, knapp verfehlte den Oscar fuer Bester Film",
        correctAnswer = 2, // C
        explanation = "Burning gewann in Cannes 2018 den FIPRESCI-Preis. Die Kritikerabstimmung ergab den hoechsten Durchschnittswert, den Screen International je in Cannes fuer einen Wettbewerbsfilm gemessen hatte (3,8 von 4,0) — und trotzdem gewann der Film die Goldene Palme nicht. Stattdessen ging der Hauptpreis an Kore-edas 'Shoplifters'.",
        difficulty = 3,
        funFact = "Lee Chang-dong war von 2003-2004 Kulturminister Suedkoreas — der einzige bekannte Fall, in dem ein Arthouse-Filmemacher in einer Regierung ein Ministeramt innehatte."
    ),

    // Question 33 - TV Format Adaptations: The Office
    Question(
        categoryId = 4,
        questionText = "Das britische Original 'The Office' (BBC, 2001) von Ricky Gervais und Stephen Merchant hatte nur zwei Staffeln und ein Weihnachtsspecial. Wie gross war das US-Remake (NBC, 2005-2013)?",
        answerA = "4 Staffeln, 60 Episoden",
        answerB = "7 Staffeln, 138 Episoden",
        answerC = "9 Staffeln, 201 Episoden",
        answerD = "11 Staffeln, 260 Episoden",
        correctAnswer = 2, // C
        explanation = "The Office (US) lief 9 Staffeln mit 201 Episoden (2005-2013) und wurde damit mehr als zehnmal so gross wie das britische Original mit 14 Episoden. Der Hauptunterschied liegt im US-Syndication-Denken: Sobald eine Show erfolgreich ist, wird sie so lange wie moeglich weiterproduziert. Das britische Original blieb bewusst kurz und endete auf dem Hoehepunkt.",
        difficulty = 3,
        funFact = "Ricky Gervais und Stephen Merchant verkauften die US-Rechte fuer eine symbolische Summe, behielten aber Kreativ-Kontrolle und Executive Producer-Credits — und verdienten durch die langen Syndication-Rechte schliesslich Millionen."
    ),

    // Question 34 - Anime: Akira and Katsuhiro Otomo
    Question(
        categoryId = 4,
        questionText = "Katsuhiro Otomos 'Akira' (1988) gilt als einer der wichtigsten Anime-Filme. Welchen technischen Massstab setzte er, der in der Branche als revolutionaer gilt?",
        answerA = "Erster vollstaendig computeranimierter Anime",
        answerB = "Erste lippensynchrone Sprachaufnahme (Ton zuerst, dann Animation)",
        answerC = "Erster Anime in IMAX-Format",
        answerD = "Erste 3D-stereoskopische Animation aus Japan",
        correctAnswer = 1, // B
        explanation = "Akira war revolutionaer durch seinen Ansatz 'Ton zuerst': Statt wie ueblich die Sprache nachtraeglich zu vertonen, wurden die Dialoge zuerst aufgezeichnet, und die Animatoren zeichneten die Mundbewegungen passend dazu. Das Ergebnis war eine fuer 1988 ungewoehnlich realistische Lippensynchronisierung. Das Budget von 1,1 Milliarden Yen war das teuerste eines japanischen Animationsfilms bis zu diesem Zeitpunkt.",
        difficulty = 3,
        funFact = "Akira beeinflusste nicht nur die Anime-Industrie, sondern Hollywoods Sci-Fi-Design grundlegend: Die Cyberpunk-Aesthetik von The Matrix, Dark City und Ghost in the Shell (Realfilm) tragen alle Spuren des Neo-Tokyo-Designs."
    ),

    // Question 35 - K-Drama: Genre Conventions
    Question(
        categoryId = 4,
        questionText = "Das 'Chaebol'-Trope ist eines der haeufigsten in K-Dramas. Was bezeichnet 'Chaebol' im koreanischen Kontext?",
        answerA = "Einen traditionellen koreanischen Adel aus der Joseon-Dynastie",
        answerB = "Ein gross angelegtes koreanisches Familienkonglomerat (wie Samsung, Hyundai, LG)",
        answerC = "Einen koreanischen Regierungsbeamten mit Sondervollmachten",
        answerD = "Ein traditionelles koreanisches Festmahl als Gesellschaftsereignis",
        correctAnswer = 1, // B
        explanation = "Chaebol (von chae = Reichtum, bol = Clique/Gruppe) bezeichnet die koreanischen Familienkonglomerate wie Samsung, Hyundai, LG, Lotte oder SK. Diese Unternehmen kontrollieren riesige Teile der koreanischen Wirtschaft. In K-Dramas ist der 'Chaebol-Sohn der sich in eine arme Frau verliebt' eines der meistverwendeten romantischen Grundkonzepte.",
        difficulty = 3,
        funFact = "Samsung allein macht etwa 20 Prozent des suedkoreanischen BIP aus — ein Konzentrationsgrad, der in keiner anderen entwickelten Volkswirtschaft existiert und die gesellschaftliche Macht von Chaebols erklaert."
    ),

    // Question 36 - TV Pilot: Famous Expensive Pilots
    Question(
        categoryId = 4,
        questionText = "Welcher Serien-Pilot gilt als der teuerste in der TV-Geschichte, und welches Studio produzierte ihn?",
        answerA = "Game of Thrones Pilot (HBO, 2010) — 10 Millionen Dollar",
        answerB = "Lost Pilot (ABC, 2004) — 14 Millionen Dollar",
        answerC = "Amazon's 'The Rings of Power' erster Abschnitt (2021) — 465 Millionen fuer Staffel 1",
        answerD = "Westworld Pilot (HBO, 2016) — 25 Millionen Dollar",
        correctAnswer = 1, // B
        explanation = "Der Lost-Pilot (2004) kostete 14 Millionen US-Dollar und ist einer der teuersten Standard-TV-Pilots in der Geschichte. Der Pilot von Game of Thrones kostete etwa 5-10 Millionen, wurde jedoch vollstaendig nachgedreht. Westworld's Pilot kostete ca. 25 Millionen nach mehreren Rewrites — aber das erste Lost-Pilot bleibt das Paradebeispiel fuer teures Network-TV.",
        difficulty = 3,
        funFact = "Der urspruengliche Lost-Pilot wurde von ABC bestellt, obwohl die Kreativen J.J. Abrams und Damon Lindelof noch keine fertige Story hatten — ABC-Chef Lloyd Braun bestellte die Serie auf Basis einer vagen Idee, was seinen Rauswurf mit ausloeste."
    ),

    // Question 37 - Anime: Yoshiaki Kawajiri
    Question(
        categoryId = 4,
        questionText = "Wer regissierte 'Ninja Scroll' (Juubee Ninpuuchou, 1993) und ist bekannt fuer sein extrem stilisiertes, gewalthaltiges Anime fuer erwachsene Publikum?",
        answerA = "Rintaro",
        answerB = "Yoshiaki Kawajiri",
        answerC = "Mamoru Oshii",
        answerD = "Hiroyuki Imaishi",
        correctAnswer = 1, // B
        explanation = "Yoshiaki Kawajiri ist der Regisseur von 'Ninja Scroll' (1993) und 'Wicked City' (1987), die beide fuer ihre stilisierten, brutalen und erotisch aufgeladenen Aesthetik bekannt sind. Kawajiri arbeitete oft fuer Madhouse und pragte das Bild des 'Adult Anime' in der westlichen Welt der 1990er massgeblich mit.",
        difficulty = 3,
        funFact = "Ninja Scroll hatte in den USA einen riesigen Einfluss auf die Generation junger Regisseure — unter anderem bekannte sich der spaeteren 'Kill Bill'-Regisseur Quentin Tarantino als Fan des Films."
    ),

    // Question 38 - TV Streaming: HBO Max / Max
    Question(
        categoryId = 4,
        questionText = "HBO Max wurde 2020 gestartet und 2023 zu 'Max' umbenannt. Welcher strategische Fehler bei der Markenbildung wurde von Medienexperten am haeufigsten kritisiert?",
        answerA = "Das Logo war zu aehnlich wie das von Netflix",
        answerB = "Die Umbenennung verwasserete die Premiummarke HBO durch guenstigere Discovery-Inhalte",
        answerC = "Max war kein internationaler Name und konnte nicht global eingesetzt werden",
        answerD = "Die technische Plattform war zu instabil fuer einen globalen Start",
        correctAnswer = 1, // B
        explanation = "Als Warner Bros. Discovery den Dienst 2023 von 'HBO Max' zu 'Max' umbenannte, kritisierten Experten massiv, dass damit eine der wertvollsten Premiummarken des Fernsehens (HBO) verwasseert wurde, um Discovery-Inhalte (Reality-TV, Dokumentationen) gleichwertig zu positionieren. HBO-Praesident Casey Bloys widersprach dieser Analyse, aber der Schaden an der Markenidentitaet wurde allgemein als real eingestuft.",
        difficulty = 3,
        funFact = "Eine interne HBO-Studie soll ergeben haben, dass das HBO-Logo auf einem Thumbnail die Klickrate um 25 Prozent erhoehte — was die Entscheidung zur Umbenennung umso raetselhafter machte."
    ),

    // Question 39 - Korean Cinema: Action Genre
    Question(
        categoryId = 4,
        questionText = "Welcher koreanische Action-Thriller-Film von 2003 mit Song Kang-ho und Lee Byung-hun verwendete erstmals in Korea ein sogenanntes 'Heist-Movie'-Format und wurde zum Kassenhit?",
        answerA = "A Bittersweet Life (2005)",
        answerB = "A Tale of Two Sisters (2003)",
        answerC = "Memories of Murder (2003)",
        answerD = "JSA: Joint Security Area (2000)",
        correctAnswer = 2, // C
        explanation = "Memories of Murder (2003) von Bong Joon-ho mit Song Kang-ho ist ein Crime-Procedural-Thriller ueber den ersten Serienmord-Fall in Suedkorea (1986-1991). Der Film ist kein klassischer Heist-Film, aber er etablierte das koreanische Crime-Procedural-Drama als eigenstaendiges Genre und machte Song Kang-ho zum Star des koreanischen Kinos.",
        difficulty = 3,
        funFact = "Der reale Serienmorder, auf dem Memories of Murder basiert, wurde 2019 per DNA-Analyse identifiziert — Lee Chun-jae, der bereits wegen eines anderen Mordes im Gefaengnis sass. Der Fall war 33 Jahre lang offen."
    ),

    // Question 40 - TV Ratings: People Meter
    Question(
        categoryId = 4,
        questionText = "Was ist ein 'People Meter' in der TV-Einschaltquotenmessung, und welche Limitation hat dieses System gegenueber modernen Streaming-Daten?",
        answerA = "Ein Sensor der Augenbeweungen trackt — misst aber nur den physischen Bildschirm, nicht VPN-Nutzung",
        answerB = "Eine Fernbedienung mit Personentasten — jedes Haushaltsmitglied muss aktiv bestaetigen dass es zuschaut",
        answerC = "Ein Mikrofon das Tonsignaturen erkennt — kann aber keine Streaming-Apps unterscheiden",
        answerD = "Eine Kamera die Zuschauer im Raum zaehlt — aber nur bei eingeschaltetem Licht",
        correctAnswer = 1, // B
        explanation = "Der People Meter (in Deutschland von GfK/AGF eingesetzt) ist ein Geraet mit individuellen Tasten fuer jedes Haushaltsmitglied. Jede Person muss aktiv 'einstechen' wenn sie anfaengt zuzuschauen und 'ausstechen' wenn sie aufhoert. Das System misst daher Absichtszuschauer, erfordert aber aktive Compliance — und erfasst modernes Streaming-Verhalten auf anderen Geraeten (Tablet, Smartphone) nicht vollstaendig.",
        difficulty = 3,
        funFact = "Studien zeigen, dass People-Meter-Haushalte dazu neigen, zustaetzliche Einschaltzeiten zu 'vergessen' einzutragen — was die Quoten systematisch leicht unter dem echten Wert liegen laesst."
    ),

    // Question 41 - Anime: Ghost in the Shell
    Question(
        categoryId = 4,
        questionText = "Mamoru Oshiis 'Ghost in the Shell' (1995) beeinflusste Hollywood massgeblich. Welche Aussage der Wachowski-Schwestern ueber Matrix (1999) und Ghost in the Shell ist bekannt?",
        answerA = "Sie zeigten dem Studio 'Ghost in the Shell' und sagten: 'Wir wollen, dass The Matrix so aussieht'",
        answerB = "Sie versuchten, Oshii als Ko-Regisseur zu gewinnen, dieser lehnte ab",
        answerC = "Sie lizenzierten gezielt einzelne Kamera-Techniken von Production I.G.",
        answerD = "Sie haben jede Verbindung zwischen beiden Filmen immer bestritten",
        correctAnswer = 0, // A
        explanation = "Die Wachowski-Schwestern (damals noch als Brueder bekannt) zeigten Warner Bros. bei ihrer Pitch-Praesentation fuer The Matrix tatsaechlich Szenen aus 'Ghost in the Shell' und sagten laut ueberliefert: 'Wir wollen den gesamten Film so aussehen lassen.' Oshii selbst nannte Matrix eine 'vollstaendige Weiterentwicklung' seiner Themen.",
        difficulty = 3,
        funFact = "Ghost in the Shell wiederum war von Philip K. Dicks Romanen beeinflusst — insbesondere von 'Do Androids Dream of Electric Sheep?' Damit entstand eine direkte Inspirationskette von Dick zu Oshii zu den Wachowskis."
    ),

    // Question 42 - TV Pilot: Failed Pilots
    Question(
        categoryId = 4,
        questionText = "Welche bekannte TV-Serie hatte einen Pilot, der komplett neu gedreht wurde, bevor er ausgestrahlt wurde — und bei dem alle Hauptdarsteller ausgetauscht wurden?",
        answerA = "Breaking Bad (2008) — Pilot ohne Bryan Cranston",
        answerB = "The Big Bang Theory (2007) — Pilot mit anderen Hauptfiguren",
        answerC = "Game of Thrones (2010) — erster Pilot komplett verworfen",
        answerD = "Seinfeld (1989) — Pilot als 'The Seinfeld Chronicles' mit anderem Titelnamen",
        correctAnswer = 2, // C
        explanation = "Game of Thrones hatte einen ersten Pilot, der intern als Katastrophe galt. Alle Hauptfiguren wurden behalten, aber der Pilot wurde komplett neu gedreht. Beruehmtestes Casting-Opfer: Tamzin Merchant spielte urspruenglich Daenerys, wurde aber durch Emilia Clarke ersetzt. Catelyn Stark war urspruenglich Jennifer Ehle, die durch Michelle Fairley ersetzt wurde.",
        difficulty = 3,
        funFact = "Der verworfene Game-of-Thrones-Pilot soll intern 'a total piece of shit' genannt worden sein — lt. Showrunner Benioff/Weiss wussten zuschauende Testpersonen nicht einmal, welche Figuren miteinander verwandt waren."
    ),

    // Question 43 - K-Drama: Kdrama Industry Structure
    Question(
        categoryId = 4,
        questionText = "In der suedkoreanischen Drama-Industrie ist das 'live-shoot' System bueruchtigt. Was bedeutet das, und welches Problem erzeugt es regelmaessig?",
        answerA = "Serien werden live ausgestrahlt ohne vorherige Aufzeichnung — technische Fehler sind sichtbar",
        answerB = "Drehbuecher werden waehrend der Produktion geschrieben; Episoden werden oft nur Stunden vor Ausstrahlung fertiggestellt",
        answerC = "Schauspieler improvisieren alle Dialoge ohne Skript fuer mehr Authentizitaet",
        answerD = "Die Serie wird parallel in zwei Versionen fuer Inland und Export produziert",
        correctAnswer = 1, // B
        explanation = "Das 'live-shoot' System bedeutet, dass koreanische TV-Dramas oft ihre Drehbuecher erst schreiben, waehrend bereits gedreht wird. Episoden werden manchmal nur wenige Stunden vor der Ausstrahlung fertiggestellt. Das fuehrt zu extremem Stress fuer Cast und Crew, aber auch zu 'audience writing': Produzenten passen den Handlungsverlauf an Zuschauerfeedback an — was Plotlogik manchmal opfert.",
        difficulty = 3,
        funFact = "Star-Schauspieler wie Lee Min-ho berichteten von Schlafmangel durch das Live-Shoot-System. Suedkoreas Fernsehgewerkschaft kaempft seit Jahren fuer ein Pre-Production-Modell nach amerikanischem Vorbild."
    ),

    // Question 44 - Anime: Dragon Ball and Toei
    Question(
        categoryId = 4,
        questionText = "Toei Animation ist das groesste Anime-Studio Japans. Neben Dragon Ball produziert es auch 'One Piece' und 'Sailor Moon'. Was ist Toeis praegendes Qualitaetsproblem, das Fans seit Jahrzehnten kritisieren?",
        answerA = "Zu wenig Farben — alle Toei-Anime sehen blass aus",
        answerB = "Starkes Strecken von Manga-Handlung durch Fueller-Episoden (Filler) und langsame Pacinug",
        answerC = "Weigerung, neue Animationstechniken einzusetzen",
        answerD = "Keine Original-Soundtracks — nur lizenzierte Musik",
        correctAnswer = 1, // B
        explanation = "Toei Animation ist bueruchtigt fuer exzessives Strecken der Manga-Vorlagen durch Filler-Episoden und langsames Pacing. Dragon Ball Super und One Piece gelten als Paradebeispiele: Bei One Piece hat sich die Anime-Adaption so langsam bewegt, dass der Manga trotz Jahrzehnten Vorsprung vom Anime nicht eingeholt wurde. Toei produziert kontinuierlich, um den laufenden Manga nicht zu ueberholen.",
        difficulty = 3,
        funFact = "One Piece ist seit 1999 als Anime im japanischen Fernsehen und gilt mit ueber 1000 Episoden als eine der laengsten laufenden Anime-Serien der Geschichte."
    ),

    // Question 45 - TV Pilot: British vs. American Conventions
    Question(
        categoryId = 4,
        questionText = "Britische TV-Serien haben traditionell kuerzere Staffeln als US-amerikanische. Wie viele Episoden hat eine typische britische Drama-Staffel, und was ist der historische Grund?",
        answerA = "3-6 Episoden; BBC finanziert nach Qualitaet statt Werbequantitaet, kein Syndication-Druck",
        answerB = "8-10 Episoden; britische Schauspieler-Vertraege sind auf 10 Folgen beschraenkt",
        answerC = "6-8 Episoden; BAFTA-Regeln erlauben keine laengeren Staffeln fuer Nominierungen",
        answerD = "4-6 Episoden; Produktionsgelder kommen aus EU-Foerdertoepfen die Begrenzungen haben",
        correctAnswer = 0, // A
        explanation = "Britische Dramen haben typischerweise 3-8 Episoden pro Staffel. Historisch liegt das am BBC-Modell: Als oeffentlich-rechtlicher Sender finanziert durch Rundfunkgebuehr (TV Licence) unterliegt die BBC keinem Werbedruck und keiner Syndication-Logik. Qualitaet wird hoeher gewichtet als Menge. Diese Tradition uebertraegt sich auf private britische Sender wie ITV und Channel 4.",
        difficulty = 3,
        funFact = "Fleabag (2016-2019) von Phoebe Waller-Bridge hat nur 12 Episoden in zwei Staffeln — und gewann sechs Emmy Awards, darunter Outstanding Comedy Series. Ein Beweis, dass Kuerze keine Schwaechewerkzeug sein muss."
    ),

    // Question 46 - Korean Wave: Music and TV Connection
    Question(
        categoryId = 4,
        questionText = "Die koreanische Unterhaltungsindustrie ist stark durch das 'K-Entertainment'-System gepraeget. Wie nennt sich das System, in dem Agenturen wie HYBE (BTS), SM Entertainment oder YG Entertainment talentierte Teenager unter Exklusiv-Vertraegen ausbilden?",
        answerA = "Idol-System",
        answerB = "Trainee-System",
        answerC = "Star-Academy-Modell",
        answerD = "J-Pop-Derivat",
        correctAnswer = 1, // B
        explanation = "Das 'Trainee-System' (yeonseugsaeng-je) ist das Herzstuck der koreanischen Unterhaltungsindustrie: Jugendliche werden von Agenturen als Trainees unter Vertrag genommen und jahrelang in Gesang, Tanz, Sprachen und Auftreten ausgebildet, bevor sie debuetieren. Dieses System produziert sowohl K-Pop-Idole als auch viele K-Drama-Schauspieler — die Grenzen zwischen Musik und TV sind in Korea fliessend.",
        difficulty = 3,
        funFact = "K-Pop-Trainees koennen Jahre ohne Einkommen ausgebildet werden und schulden der Agentur danach oft die Ausbildungskosten zurueck — ein System, das internationale Menschenrechtsorganisationen als problematisch kritisiert haben."
    ),

    // Question 47 - Anime: Fullmetal Alchemist Brotherhood
    Question(
        categoryId = 4,
        questionText = "Fullmetal Alchemist Brotherhood (2009) ist eine Neuverfilmung des Mangas von Hiromu Arakawa. Was war der Hauptunterschied zur ersten Anime-Adaption von 2003 (Fullmetal Alchemist)?",
        answerA = "Brotherhood verwendet CGI, die 2003-Version war handgezeichnet",
        answerB = "Die 2003-Version folgte dem Manga komplett, Brotherhood nicht",
        answerC = "Brotherhood folgte dem Manga treu; die 2003-Version divergierte weil der Manga noch nicht abgeschlossen war",
        answerD = "Brotherhood war fuer Erwachsene, die 2003-Version fuer Kinder gemacht",
        correctAnswer = 2, // C
        explanation = "Der erste FMA-Anime (2003) startete, bevor der Manga abgeschlossen war, und musste daher nach wenigen Staffeln eine eigene Handlung entwickeln. Diese Adaption wurde von vielen Fans abgelehnt. Brotherhood (2009) konnte die vollstaendige Manga-Geschichte von Anfang bis Ende verfilmen und gilt daher als kanonisch und kreativ ueberlegen.",
        difficulty = 3,
        funFact = "Fullmetal Alchemist Brotherhood hat auf MyAnimeList mit ueber 2 Millionen Bewertungen seit Jahren die hoechste Durchschnittsnote aller Anime-Serien und gilt vielen als der 'perfekte Anime'."
    ),

    // Question 48 - TV Syndication: SVOD vs. Syndication
    Question(
        categoryId = 4,
        questionText = "Wie hat der Aufstieg von SVOD-Diensten (Netflix, Amazon, Disney+) das traditionelle TV-Syndication-Modell in den USA veraendert?",
        answerA = "SVOD hat Syndication komplett verdraengt — es gibt keine traditionellen Syndication-Deals mehr",
        answerB = "SVOD hat Syndication ergaenzt: Serien erzielen hoehere Preise, da Streaming und Kabel-Syndication parallel laufen",
        answerC = "Syndication wurde durch SVOD wertlos, da Sender Serien direkt auf eigenen Plattformen behalten",
        answerD = "SVOD hat Syndication auf regionale Maerkte beschraenkt",
        correctAnswer = 1, // B
        explanation = "SVOD hat Syndication nicht verdraengt, sondern vervielfacht: Serien wie Seinfeld oder Friends wurden fuer Hunderte Millionen an Netflix/andere Streamer lizenziert, waehrend gleichzeitig klassische Kabel-Syndication lief. NBCUniversal zahlte 500 Millionen fuer Friends-Rechte auf Peacock. Die Wertsteigerung von Katalog-Content durch Streaming ist enorm.",
        difficulty = 3,
        funFact = "Netflix zahlte 100 Millionen Dollar allein fuer die Rechte, Friends fuer ein weiteres Jahr auf der Plattform zu behalten, bevor NBC die Rechte zurueckholte — ein Zeichen dafuer, wie wertvoll gut gealterte Serien im Streaming-Zeitalter sind."
    ),

    // Question 49 - Anime: Isao Takahata
    Question(
        categoryId = 4,
        questionText = "Isao Takahata war Co-Gruender von Studio Ghibli und Regisseur von 'Mein Nachbar Yamada' (1999) und 'Das Maerchen der Prinzessin Kaguya' (2013). Welche Besonderheit hatte 'Die letzten Gluehwuermchen' (Hotaru no Haka, 1988) in der japanischen Kinoausstrahlung?",
        answerA = "Es war der erste japanische Anime, der exklusiv auf VHS veroeffentlicht wurde",
        answerB = "Es lief als Doppelprogramm zusammen mit Miyazakis 'Mein Nachbar Totoro' im selben Kino",
        answerC = "Es war der erste Anime, der in Japan ein Altersfreigabeverbot bekam",
        answerD = "Es lief ausschliesslich auf NHK, dem oeffentlich-rechtlichen Sender",
        correctAnswer = 1, // B
        explanation = "Die letzten Gluehwuermchen und Mein Nachbar Totoro wurden am 16. April 1988 als Doppelvorstellung im selben japanischen Kino ausgestrahlt — ein Marketingkonzept, das beide Filme als Kontrast-Erlebnis prasentierte: Das niedliche Totoro fuer Kinder, gefolgt vom erschutternden Kriegsdrama Gluehwuermchen. Takahata insistierte auf diesem ungewoehnlichen Format.",
        difficulty = 3,
        funFact = "Die letzten Gluehwuermchen gilt als einer der bewegendsten Antikriegsfilme aller Zeiten — regissiert von einem Mann (Takahata), der die Bombardierung Okayamas 1945 als Kind selbst erlebt hatte."
    ),

    // Question 50 - Korean Cinema: Global Streaming Impact
    Question(
        categoryId = 4,
        questionText = "Nach dem Erfolg von 'Squid Game' (2021) stellte Netflix in Suedkorea erhebliche Investitionen bereit. Wie hoch waren die angekuendigten Investitionen von Netflix in koreanische Inhalte fuer den Zeitraum 2023-2027?",
        answerA = "250 Millionen Dollar",
        answerB = "500 Millionen Dollar",
        answerC = "2,5 Milliarden Dollar",
        answerD = "1 Milliarde Dollar",
        correctAnswer = 2, // C
        explanation = "Netflix kuendigte im Maerz 2023 an, im Zeitraum 2023-2027 insgesamt 2,5 Milliarden US-Dollar in koreanische Inhalte zu investieren — ein Rekordbetrag fuer einen einzelnen Nicht-Heimatmarkt. Damit unterstreicht Netflix, dass Suedkorea nach Grossbritannien und Japan zur drittwichtigsten Produktionsnation in der globalen Streaming-Strategie des Unternehmens geworden ist.",
        difficulty = 3,
        funFact = "Korea ist das einzige Land, in dem Netflix nicht die meistgenutzte Streaming-Plattform ist — der einheimische Dienst 'Wavve' (zusammengeschlossen aus mehreren koreanischen Sendern) hat in Korea mehr Abonnenten als Netflix."
    ),

)
