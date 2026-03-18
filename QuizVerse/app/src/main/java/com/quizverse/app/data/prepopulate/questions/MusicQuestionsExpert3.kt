package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsExpert3(): List<Question> = listOf(

    // ── Orchesterarrangement & Instrumentation (10) ──────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Prinzip beschreibt der Begriff 'Klangfarbenmelodie' (Klangfarbenmelodie), den Arnold Schoenberg in 'Harmonielehre' (1911) entwickelte?",
        answerA = "Eine Melodie, die ausschliesslich auf Perkussionsinstrumenten gespielt wird",
        answerB = "Die Idee, Melodie durch wechselnde Klangfarben verschiedener Instrumente zu erzeugen, statt durch Tonhoehen-Verlauf",
        answerC = "Eine spezielle Instrumentierung fuer Streichorchester mit Daempfern",
        answerD = "Das Verdoppeln einer Melodie in zwei verschiedenen Oktaven gleichzeitig",
        correctAnswer = 1,
        explanation = "Schoenbergs Klangfarbenmelodie (auch 'Klangfarbe-Melodie') beschreibt eine Kompositionstechnik, bei der die Klangfarbe (Timbre) selbst zum melodischen Parameter wird. Nicht die Tonhoehe, sondern der wechselnde Instrumentalklang traegt die melodische Linie — ein Grundprinzip des Serialismus und der Klangtechnik des 20. Jahrhunderts.",
        difficulty = 4,
        funFact = "Anton Webern verwirklichte Klangfarbenmelodie am konsequentesten in seinem 'Orchesterstueck op. 10 Nr. 3' (1913), das nur 28 Takte lang ist und als eines der kuerzesten Orchesterwerke der Musikgeschichte gilt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Fachbegriff 'col legno' in einer Orchesterstimme?",
        answerA = "Spielen mit dem Bogenholz (Holz des Bogens) statt mit den Bogenhaaren",
        answerB = "Pizzicato-Spiel mit allen Fingern gleichzeitig",
        answerC = "Daempfen des Instruments mit Holzklotz",
        answerD = "Verwendung eines holzstaebigen Rohrblattinstruments",
        correctAnswer = 0,
        explanation = "Col legno (ital. 'mit dem Holz') weist Streicher an, mit dem Holz des Bogens auf die Saiten zu schlagen oder zu streichen, statt mit den Bogenhaaren. Es erzeugt einen knochigen, perkussiven Klang. Berlioz nutzte diese Technik in der 'Symphonie fantastique' (1830) im Satz 'Sabbat-Traum'.",
        difficulty = 4,
        funFact = "Viele professionelle Streicher sind ungern bereit, col legno zu spielen, da die Saiten das Holz des wertvollen Bogens beschaedigen koennen. Bei teuren Barockboegen wird die Technik daher oft gemieden."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Orchesterstimmlage bezeichnet man in Blechblaeserensembles als 'Tenorhorn' und ist in Deutschland weit verbreitet, waehrend der angloamerikanische Bereich stattdessen das 'Euphonium' kennt?",
        answerA = "Das Baryton in B",
        answerB = "Das Tenorhorn in B (Baritonhorn)",
        answerC = "Die Posaune mit Quartventil",
        answerD = "Das Waldhorn in F",
        correctAnswer = 1,
        explanation = "Das Tenorhorn (deutsch) und das Euphonium (angloamerikanisch) sind aehnliche, aber nicht identische Instrumente. Das Tenorhorn in B hat eine engere Mensur und einen etwas schlankeren Klang als das breiter-mensurierte Euphonium. Beide fuellen die Stimmlage zwischen Posaune und Horn im Blechblaeser-Ensemble.",
        difficulty = 4,
        funFact = "Der Begriff 'Baryton' bezeichnet im deutschen Blasorchester noch ein weiteres verwandtes Instrument, was zu Verwirrung fuehrt: In Streichquartett-Literatur ist das Baryton jedoch ein Zupf-Streichinstrument, das Joseph Haydn bevorzugte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Orchestrierungslehre unter dem Begriff 'Verdoppelung in der Terz'?",
        answerA = "Ein Instrument spielt drei Noten gleichzeitig",
        answerB = "Eine Melodielinie wird von einem zweiten Instrument eine Terz hoeher oder tiefer parallel gespielt",
        answerC = "Das Splitting einer Orchesterstimme auf drei Pulte",
        answerD = "Die Transposition eines Themas um eine Terz in der Reprise",
        correctAnswer = 1,
        explanation = "Terzenverdoppelung (oder Terzparallelen) bedeutet, dass eine zweite Stimme die Melodie dauerhaft eine grosse oder kleine Terz versetzt mitspielt. Schubert und viele Romantiker nutzten dies extensiv fuer warme Klangfaerbung, z. B. Klarinette und Floete oder Klarinette und Oboe in Terzen.",
        difficulty = 4,
        funFact = "Beim Volksmusik-Jodelstil der Alpenregion ist Terzgesang die Standardtechnik — die zweite Stimme singt stets eine Terz unter der fuehrenden Stimme, was den charakteristischen Klang erzeugt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Schlagwerk-Instrument liefert im klassischen Sinfonieorchester die sogenannte 'Batterie', und was ist damit gemeint?",
        answerA = "Pauke (Timpani) — gemeint ist eine Gruppe von bis zu 5 gestimmten Kesselpauken eines Paukisten",
        answerB = "Grosse Trommel, kleine Trommel und Becken zusammen — das Gesamtperkussions-Ensemble",
        answerC = "Xylophon-Familie inklusive Marimba und Vibraphon",
        answerD = "Elektronisches Schlagzeug-Modul im modernen Erweiterungs-Orchester",
        correctAnswer = 0,
        explanation = "Im klassischen Orchesterkontext bezeichnet 'die Batterie' die Paukengruppe: ein Satz von zwei bis fuenf gestimmten Kesselpauken (Timpani), die von einem Paukisten gespielt werden. Im franzoesischen Begriff 'batterie' sind jedoch auch Schlagzeuggruppen allgemein gemeint — die Bedeutung haengt vom Kontext ab.",
        difficulty = 4,
        funFact = "Ludwig van Beethoven erweiterte die Pauke-Stimmung erstmals ausserhalb des ublichen Quint-Abstands: Im Violinkonzert op. 61 verwendet er die Pauke auf D und A — eine fuer 1806 ungewoehnliche Quarte statt der ueblichen Quinte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Divisi' in einer Orchesterstimme, und wie unterscheidet es sich von 'a2'?",
        answerA = "Divisi = beide Spieler spielen unisono; a2 = sie spielen zwei verschiedene Noten",
        answerB = "Divisi = ein Pult teilt sich in zwei separate Stimmen auf; a2 = beide Spieler spielen dieselbe Stimme gemeinsam",
        answerC = "Divisi = Pizzicato; a2 = Arco",
        answerD = "Divisi = schnelle Zweiunddreissigstelnoten; a2 = halbe Noten",
        correctAnswer = 1,
        explanation = "Divisi (ital. 'geteilt') weist eine Stimmgruppe (z. B. erste Violinen) an, sich in zwei Untergruppen aufzuteilen, die verschiedene Noten spielen. 'A 2' (a due) bedeutet umgekehrt, dass beide Spieler oder alle Pulte wieder unisono dieselbe Stimme spielen — haeufig nach einem divisi-Abschnitt.",
        difficulty = 4,
        funFact = "Gustav Mahler trieb Divisi auf die Spitze: Im Adagio seiner 9. Sinfonie sind die ersten Violinen in bis zu vier separate Gruppen geteilt, was eine dichte, schwebende Klangwolke aus fast zwanzig Einzelstimmen erzeugt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Funktion hat das 'Contrafagott' im Orchester im Vergleich zum normalen Fagott?",
        answerA = "Es spielt eine Oktave hoeher und dient als Solistenersatz",
        answerB = "Es klingt eine Oktave tiefer als das Fagott und verstaerkt den Kontrabass-Bereich im Blaeserklang",
        answerC = "Es ist die Altstimme der Fagottfamilie und klingt eine Quinte tiefer",
        answerD = "Es hat eine spezielle Doppelrohrblatt-Konstruktion, die kein normales Fagott besitzt",
        correctAnswer = 1,
        explanation = "Das Kontrafagott klingt eine Oktave tiefer als das notierte Fagott und ist das tiefste Holzblaeserinstrument des klassischen Orchesters. Es verstaerkt die tiefen Streicher (Kontrabass/Cello) im Blaeser-Sound und wird von Brahms, Beethoven und Mahler gezielt eingesetzt, um den Bass-Fundament-Klang zu verdichten.",
        difficulty = 4,
        funFact = "Das Kontrafagott ist fast 2,5 Meter lang, wenn man das Rohr entfaltet. Das Instrument wird U-foermig zusammengefaltet, damit es spielbar bleibt. Ludwig van Beethoven setzte es erstmals prominent im Finale seiner 5. Sinfonie ein."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Orchestrierungsbegriff 'Schwebung' (Beating) im akustischen Sinn?",
        answerA = "Die rhythmische Betonung in einem synkopierten Rhythmus",
        answerB = "Amplitudenmodulation, die entsteht, wenn zwei nahezu gleichhohe Frequenzen gleichzeitig erklingen und periodische Lautstarkeschwankungen erzeugen",
        answerC = "Die vibratoreiche Spielweise von Streichergruppen",
        answerD = "Ein beschleunigendes Tempo im letzten Formteil eines Werkes",
        correctAnswer = 1,
        explanation = "Schwebungen (Beatings) entstehen physikalisch, wenn zwei Toene mit geringem Frequenzunterschied gleichzeitig klingen. Die Differenzfrequenz ist als periodische Lautstarkeschwankung hoerbar. Beim Stimmen von Instrumenten hoert man auf das Verschwinden der Schwebungen als Anzeichen fuer Reinheit.",
        difficulty = 4,
        funFact = "Orchesterstimmer nutzen Schwebungen aktiv: Wenn eine Oboe auf A = 442 Hz gestimmt ist und eine zweite Oboe 440 Hz spielt, hoert man 2 Schwebungen pro Sekunde — ein prima facie Mess-Instrument ohne technische Gerate."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument bezeichnet man als 'Englischhorn' (cor anglais) und warum ist der Name musikhistorisch irrefuehrend?",
        answerA = "Eine englische Waldhornart aus dem 18. Jahrhundert; der Name kommt korrekt aus England",
        answerB = "Eine Altoboe in F; der Name hat vermutlich mit 'angle' (Winkel, wegen der gebogenen Form) zu tun, nicht mit England",
        answerC = "Ein Holzblasinstrument aus dem Hochland Schottlands mit charakteristischem Dudelsack-Klang",
        answerD = "Eine besondere Hornsorte, die in Grossbritannien entwickelt wurde und von dort ihren Namen traegt",
        correctAnswer = 1,
        explanation = "Das Englischhorn (Cor anglais, franzoesisch) ist eine Altoboe in F und klingt eine Quinte tiefer als die normale Oboe. Der Name hat vermutlich nichts mit England zu tun: Wahrscheinlich stammt er vom franzoesischen 'cor angle' (Winkelhorn), da fruehe Formen gebogen waren. Verwechslungen mit England entstanden durch klanglich aehnliche Bezeichnungen.",
        difficulty = 4,
        funFact = "Das Englischhorn ist seit Antonin Dvoraks 'Sinfonie aus der Neuen Welt' (1893, Largo-Satz) als Soloinstrument weltberuehmt. Das Thema gilt als eines der populaersten Orchestersoli der Romantik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Hauptunterschied zwischen 'Instrumentation' und 'Orchestrierung' als Fachbegriffe?",
        answerA = "Instrumentation ist nur fuer Blasmusik; Orchestrierung nur fuer Streichorchester",
        answerB = "Instrumentation bezeichnet die Zuweisung von Stimmen an Instrumente; Orchestrierung umfasst auch das klangliche Gestalten des Orchestersatzes in seiner Gesamtheit",
        answerC = "Instrumentation ist die historische, Orchestrierung die moderne Bezeichnung fuer dasselbe Konzept",
        answerD = "Instrumentation bezieht sich auf Einzelinstrumente, Orchestrierung nur auf grosse Ensembles",
        correctAnswer = 1,
        explanation = "In der Musikwissenschaft bezeichnet 'Instrumentation' im engeren Sinn die technische Zuweisung: welche Stimmen welchen Instrumenten gegeben werden. 'Orchestrierung' meint den umfassenderen Prozess des klanglichen Gestaltens — Balanceentscheidungen, Textur, Farbe, Voicing — und schliesst Instrumentation mit ein. Im Alltag werden beide Begriffe oft synonym verwendet.",
        difficulty = 4,
        funFact = "Nikolai Rimski-Korsakows 'Grundlagen der Orchestrierung' (1913, posthum) ist bis heute eines der massgeblichsten Lehrwerke auf diesem Gebiet. Rimski-Korsakow verbesserte sogar Werke anderer Komponisten — darunter Mussorgskys 'Boris Godunow' — mit eigener Neuorchestrierung."
    ),

    // ── Musikedition & Urtextausgaben (8) ───────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was ist eine 'Urtextausgabe' in der Musiker-Edition, und was unterscheidet sie von einer 'praktischen Ausgabe'?",
        answerA = "Eine Urtextausgabe ist die allererste historische Druckversion; praktische Ausgaben sind digitale Scans davon",
        answerB = "Eine Urtextausgabe rekonstruiert den originalen Notentext nach primaeren Quellen ohne editorische Zusaetze; praktische Ausgaben enthalten Fingersaetze, Artikulationszeichen und sonstige Ergaenzungen durch Herausgeber",
        answerC = "Urtextausgaben enthalten nur die Melodiestimme; praktische Ausgaben den vollstaendigen Klavierauszug",
        answerD = "Urtext bedeutet unveraenderter Erstdruck; praktische Ausgaben sind Neuausgaben nach dem Tod des Komponisten",
        correctAnswer = 1,
        explanation = "Eine Urtextausgabe (auch 'kritische Ausgabe') strebt den originalen Notentext des Komponisten an, basierend auf Autographen, Erstdrucken und zeitgenoessischen Quellen. Editorische Zusaetze werden klar als solche gekennzeichnet oder weggelassen. Praktische Ausgaben (z.B. Peters, Henle mit Fingersaetzen) erleichtern dem Ausfuehrenden die Praxis, aber vermischen Originaltext und Edition.",
        difficulty = 4,
        funFact = "Der Henle-Verlag (Muenchen, gegruendet 1948) gilt als Goldstandard fuer Urtextausgaben klassischer Klaviermusik. Viele Pianisten bemuehen sich um Henle-Ausgaben, obwohl manche Fingersaetze inzwischen als eigene editorische Leistung beigefuegt werden."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff bezeichnet in der Musikwissenschaft den Prozess der Erstellung einer kritischen Edition aus verschiedenen historischen Quellen?",
        answerA = "Paleographie",
        answerB = "Stemmatik und Quellenkritik (Editionsphilologie)",
        answerC = "Hermeneutik",
        answerD = "Organologie",
        correctAnswer = 1,
        explanation = "Die Editionsphilologie (oder musikalische Quellenkritik) umfasst Stemmatik (Erstellen eines Stammbaums der Quellen), Textvergleich, Fehleranalyse und Rekonstruktion des wahrscheinlichen Urtexts. Dabei werden Autographen, Abschriften, Erstdrucke und Briefquellen hierarchisch bewertet.",
        difficulty = 4,
        funFact = "Die Gesamtausgaben grosser Komponisten — wie die Bach-Werke-Verzeichnis-Edition (BWV, Neue Bach-Ausgabe) oder die Neue Mozart-Ausgabe (NMA) — binden Hunderte von Musikwissenschaftlern ueber Jahrzehnte. Die Neue Mozart-Ausgabe wurde erst 2006 nach 50 Jahren Arbeit abgeschlossen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Autograph' in der musikwissenschaftlichen Quellenkunde?",
        answerA = "Eine Unterschrift des Komponisten auf dem Programmheft",
        answerB = "Das handschriftliche Original-Manuskript, das vom Komponisten selbst geschrieben wurde",
        answerC = "Eine autorisierte Druckausgabe, die der Komponist selbst korrekturgelesen hat",
        answerD = "Ein fruehes Tonaufzeichnungs-Dokument auf Wachswalze",
        correctAnswer = 1,
        explanation = "In der Musikwissenschaft bezeichnet 'Autograph' (lat. autographum) ausschliesslich das handschriftliche Original-Manuskript des Komponisten selbst. Es ist die hoechste Quellenstufe und wird bei der Editionsarbeit bevorzugt. Davon zu unterscheiden sind Reinschriften (Kopisten-Abschriften), die der Komponist moeglicherweise autorisiert hat.",
        difficulty = 4,
        funFact = "Mozarts Autographen befinden sich heute an verschiedenen Orten: viele in der Stiftung Mozarteum in Salzburg, andere in der Bibliotheque nationale in Paris und dem British Museum in London. Manche sind verschollen oder wurden im 2. Weltkrieg zerstoert."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches System nutzen Musikwissenschaftler zur eindeutigen Katalogisierung von Werken eines Komponisten, wenn kein offizielles Werkverzeichnis des Komponisten selbst existiert?",
        answerA = "Das Library-of-Congress-System (LCC)",
        answerB = "Werkverzeichnisnummern nach dem Nachnamen des Katalogisators (z.B. BWV fuer Bach, KV fuer Mozart, D fuer Schubert)",
        answerC = "Das Universal-Decimal-Classification-System (UDC)",
        answerD = "Das IMSLP-Nummersystem (Petrucci Music Library)",
        correctAnswer = 1,
        explanation = "Musikwissenschaftliche Werkverzeichnisse werden nach ihren Erstautoren benannt: BWV (Bach-Werke-Verzeichnis, Wolfgang Schmieder), KV (Koechel-Verzeichnis fuer Mozart), D (Otto Erich Deutsch fuer Schubert), HWV (Haendel-Werke-Verzeichnis), Hob. (Hoboken fuer Haydn). Diese Sigeln sind international standardisiert.",
        difficulty = 4,
        funFact = "Ludwig von Koechel (1800-1877) war Botaniker und Mineraloge, kein Berufsmusiker. Sein 'Koechel-Verzeichnis' (1862) ordnete alle Mozartwerke chronologisch — ein wissenschaftliches Meisterwerk, das bis heute in ueberarbeiteten Auflagen (KV^6) verwendet wird."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Editionswissenschaft unter dem Begriff 'Lesart' (Variante)?",
        answerA = "Eine Interpretation des Werkes durch einen besonderen Dirigenten",
        answerB = "Eine abweichende Textfassung in einer historischen Quelle, die sich von der Hauptversion unterscheidet",
        answerC = "Die Vortragsbezeichnung fuer einen besonders expressiven Vortrag",
        answerD = "Eine vereinfachte Fassung fuer Schueler",
        correctAnswer = 1,
        explanation = "Eine 'Lesart' (oder Variante, Lesefehler) bezeichnet in der Editionsphilologie eine textliche Abweichung in einer bestimmten Quelle gegenueber der rekonstruierten Hauptversion. Kritische Editionen verzeichnen alle bedeutsamen Lesarten im Kritischen Bericht und erlaeutern, warum welche Entscheidung getroffen wurde.",
        difficulty = 4,
        funFact = "Bei Beethovens Sonate op. 111 gibt es in der Fugenecke des ersten Satzes eine beruehmt-beruechtigte Stelle, wo verschiedene historische Quellen voneinander abweichen. Bis heute diskutieren Editoren und Pianisten, welche Version Beethoven tatsaechlich gemeint hat."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist die 'Gesamtausgabe' eines Komponisten im wissenschaftlichen Sinn?",
        answerA = "Eine Anthologie aller Werke eines Stils oder einer Epoche",
        answerB = "Eine vollstaendige, kritisch-edierte Sammlung aller bekannten Werke eines Komponisten nach den besten verfuegbaren Quellen",
        answerC = "Eine populaere Sammelausgabe guenstiger Reprints fuer den Unterricht",
        answerD = "Ein mehrbaendiger Kommentar ohne Noten zur Biografie des Komponisten",
        correctAnswer = 1,
        explanation = "Eine Gesamtausgabe (auch 'Edition critique' oder 'Complete Works') umfasst das editorisch aufbereitete Gesamtwerk eines Komponisten nach wissenschaftlichem Standard. Dazu gehoeren Noten, kritische Berichte, Quellenbeschreibungen und Kommentare. Bekannte Beispiele: Bach-Gesamtausgabe (BGA), Neue Mozart-Ausgabe (NMA), Schubert-Gesamtausgabe.",
        difficulty = 4,
        funFact = "Die erste Gesamtausgabe der Geschichte war die Bach-Gesamtausgabe der Bach-Gesellschaft (1850-1900), herausgegeben von Otto Jahn, Carl Ferdinand Becker u.a. — ein 100-baendiges Monumentalwerk, das Bachs Musik systematisch der Oeffentlichkeit zugaenglich machte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche editorische Herausforderung stellt ein Werk dar, fuer das kein Autograph ueberliefert ist und nur spaetere Abschriften existieren?",
        answerA = "Das Werk kann nicht aufgefuehrt werden, da ohne Autograph keine Auflahrungserlaubnis moeglich ist",
        answerB = "Der Editor muss durch Stemmatik (Quellenstammbaum-Analyse) den wahrscheinlichsten Urtext aus den Abschriften rekonstruieren und Fehler identifizieren",
        answerC = "Das Werk wird automatisch als Falschzuschreibung eingestuft und aus dem Werkverzeichnis gestrichen",
        answerD = "Nur die Handschrift des Verlegers der Erstdruckausgabe gilt dann als massgebliche Quelle",
        correctAnswer = 1,
        explanation = "Ohne Autograph muss der Editor die ueberlieferten Abschriften in einen Stammbaum (Stemma) bringen: Welche Quelle ist die aelteste? Welche Fehler teilen Quellen miteinander (Fehlergemeinschaft)? Durch Gruppenanalyse laesst sich der hyparchetypische Text rekonstruieren — ein bewaehrtes Verfahren der Textkritik, das aus der antiken Philologie stammt.",
        difficulty = 4,
        funFact = "Von Johann Sebastian Bachs Schaffen sind einige Kantaten und Kammermusikwerke ausschliesslich in Kopistenstimmen aus dem 18. Jahrhundert ueberliefert, weil das Autograph verloren ist — darunter viele Weimarer Fruehwerke."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Faksimile-Ausgabe' in der Musikedition?",
        answerA = "Eine vereinfachte Volksausgabe fuer den Schulbedarf",
        answerB = "Eine fotomechanische Reproduktion einer historischen Handschrift oder eines Druckoriginals im Originalformat",
        answerC = "Eine Ausgabe mit zusaetzlichem phaenomenologischem Kommentar",
        answerD = "Eine Editon mit eingravierter Faksimile-Unterschrift des Editors",
        correctAnswer = 1,
        explanation = "Eine Faksimile-Ausgabe reproduziert eine historische Quelle — Autograph, Kopie oder Erstdruck — fotomechanisch (Fotodruck, Offset oder digitaler Scan) moeglichst im Originalformat. Sie ermoeglicht Forschern den Zugang zum Quellentext, ohne das fragile Original beruehren zu muessen. Besonders bekannt sind Beethovens und Mozarts Autograph-Faksimiles.",
        difficulty = 4,
        funFact = "Das Autograph von Schuberts 'Winterreise' gilt als eines der schoensten musikalischen Handschriften der Geschichte. Das Original liegt in der Wiener Stadtbibliothek; hochwertige Faksimile-Ausgaben erlauben Musikwissenschaftlern weltweit die Arbeit am Originaltext."
    ),

    // ── Musiksoziologie (8) ──────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Soziologe praegte den Begriff 'Kulturindustrie' und wandte ihn auf die Musikproduktion des 20. Jahrhunderts an?",
        answerA = "Max Weber",
        answerB = "Theodor W. Adorno und Max Horkheimer (Frankfurter Schule)",
        answerC = "Pierre Bourdieu",
        answerD = "Emile Durkheim",
        correctAnswer = 1,
        explanation = "Adorno und Horkheimer entwickelten den Begriff 'Kulturindustrie' in 'Dialektik der Aufklaerung' (1944/1947). Sie argumentierten, dass die Massenproduktion von Musik (Radio, Schallplatte, Film) die kuenstlerische Autonomie zerstoert und Musik zur standardisierten Ware macht, die passive Konsumenten erzeugt.",
        difficulty = 4,
        funFact = "Adorno war selbst ausgebildeter Komponist und Schueler von Alban Berg. Seine radikale Kritik an Jazz und populaerer Musik machte ihn zur kontroversen Figur: Kritiker werfen ihm Eurozentrismus und elitaere Vorurteile vor."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt Pierre Bourdieus Konzept des 'musikalischen Feldes' in seiner Kultursoziologie?",
        answerA = "Die physikalische Ausbreitung von Schallwellen in einem Konzertsaal",
        answerB = "Den sozialen Raum, in dem Akteure (Komponisten, Interpreten, Kritiker, Institutionen) um Kapital und Anerkennung konkurrieren und Regeln und Positionen aushandeln",
        answerC = "Den geographischen Verbreitungsraum einer bestimmten Volksmusikgattung",
        answerD = "Das Tonfeld (Cluster) in der Neuen Musik des 20. Jahrhunderts",
        correctAnswer = 1,
        explanation = "Bourdieu analysiert Kultur als 'Feld' — ein strukturiertes soziales Gefuege mit eigenen Regeln, Hierarchien und Kapitalformen. Im musikalischen Feld konkurrieren Akteure um symbolisches Kapital (Ansehen, Prestige), oekonomisches Kapital und kulturelles Kapital. Positionen im Feld bestimmen, welche Musik als 'legitim' gilt.",
        difficulty = 4,
        funFact = "Bourdieus Werk 'Die feinen Unterschiede' (1979) zeigte empirisch, dass Musikgeschmack stark mit sozialer Herkunft korreliert — klassische Musik wird haeufiger von Hochgebildeten konsumiert, was soziale Distinktion sichtbar macht."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie bezeichnet man in der Musiksoziologie den Prozess, durch den urspruenglich subkulturelle Musikstile durch kommerzielle Verwertung ihren oppositionellen Charakter verlieren?",
        answerA = "Appropriation und Cooptation (kulturelle Vereinnahmung)",
        answerB = "Kanonisierung und Musealisierung",
        answerC = "Folklorisierung",
        answerD = "Diffusion und Akkulturation",
        correctAnswer = 0,
        explanation = "Kulturelle Vereinnahmung (Cooptation) beschreibt den Prozess, wie Mainstream-Institutionen und Industrie subkulturelle Musikformen (Punk, Hip-Hop, Grunge) absorbieren, kommerzialisieren und ihrer urspruenglichen gesellschaftskritischen Funktion entleeren. Dick Hebdige analysierte dies in 'Subculture: The Meaning of Style' (1979).",
        difficulty = 4,
        funFact = "Punk begann 1976-77 als radikale DIY-Gegenkultur zum kommerziellen Rock. Innerhalb von zwei Jahren hatten Major-Labels die meisten Punk-Bands unter Vertrag, und Punk-Aesthetik wurde in der Modeindustrie kommerziell vermarktet — ein Lehrbuchfall von Cooptation."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der musiksoziologische Begriff 'Vergeistigung der Musik' bei Max Weber in 'Die rationalen und soziologischen Grundlagen der Musik'?",
        answerA = "Die spirituelle Dimension der Kirchenmusik",
        answerB = "Den historischen Prozess der Rationalisierung musikalischer Systeme, insbesondere die Einfuehrung temperierter Stimmung und Notenschrift als Rationalisierungsinstrumente",
        answerC = "Die intellektuelle Ueberlegenheit europaeischer Kunstmusik gegenueber Volksmusik",
        answerD = "Die Entstehung von Musik als abstrakte, nicht darstellende Kunst",
        correctAnswer = 1,
        explanation = "Max Webers posthume Schrift (1921) analysiert Musik als Gegenstand soziologischer Rationalisierung: Die europaeische Musikgeschichte tendiert zur zunehmenden Formalisierung, Systematisierung und Vereinheitlichung (Temperatur, Tonsystem, Notation). Diese Rationalisierung ist Teil seines umfassenderen Modernisierungs-Konzepts.",
        difficulty = 4,
        funFact = "Max Weber war selbst kein Musiker, hatte aber tiefe musikhistorische Kenntnisse. Seine Analyse zur Kirchentonalitaet und zur Entstehung des modernen Tonsystems ist bis heute ein Standardverweis in musiksoziologischen Seminaren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept beschreibt in der Ethnomusicology und Musiksoziologie die Anpassung einer musikalischen Praxis an neue soziokulturelle Kontexte durch eine uebernehme Gemeinschaft?",
        answerA = "Transkulturalitaet",
        answerB = "Akkulturation",
        answerC = "Repatriierung",
        answerD = "Assimilation",
        correctAnswer = 1,
        explanation = "Akkulturation bezeichnet den Prozess, bei dem eine kulturelle Gruppe Elemente einer anderen Kultur (hier: musikalische Praktiken) uebernimmt und an ihre eigene Lebenswelt anpasst. Im Unterschied zur blossen Imitation entsteht dabei etwas Neues: z. B. afro-amerikanische Musikstile, die europaeische Harmonik mit afrikanischen Rhythmusprinzipien verbanden.",
        difficulty = 4,
        funFact = "Der Begriff Akkulturation wurde 1880 vom US-Anthropologen John Wesley Powell eingefuehrt. In der Musikwissenschaft ist er zentral fuer das Verstaendnis, wie Genres wie Jazz, Latin Music oder Reggae entstanden sind."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'musikalisches Kapital' im Sinne Bourdieus, und wie unterscheidet es sich von oekonomischem Kapital?",
        answerA = "Musikalisches Kapital ist das Vermoegen, das Musikinstrumente beim Weiterverkauf erzielen",
        answerB = "Musikalisches Kapital ist eine Form kulturellen Kapitals: verinnerlichte musikbezogene Kompetenz, Geschmack und Wissen, das sozialen Status verleiht — unabhaengig von Geld",
        answerC = "Es bezeichnet die Lizenzeinnahmen aus kompositorischen Urheberrechten",
        answerD = "Es ist das Budget eines Orchesters fuer Instrumentenanschaffungen",
        correctAnswer = 1,
        explanation = "Kulturelles Kapital (hier: musikalisches Kapital) umfasst nach Bourdieu verinnerlichte Kompetenz (z.B. Hoerfaehigkeiten, historisches Musikwissen, Notenlesekenntnisse), institutionalisiertes Kapital (Diplome, Preise) und objektiviertes Kapital (Instrument, Notenbibliothek). Es verleiht sozialen Status und Zugang zu Feldern, unabhaengig vom Geldsstand.",
        difficulty = 4,
        funFact = "Bourdieus Konzept erklaert ein Paradox: Warum spielen Kinder aus bildungsnahen Haushalten statistisch signifikant haeufiger klassische Instrumente? Kulturelles Kapital wird intergenerationell weitergegeben — als Habitus, nicht als Geld."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Begriff 'musikalische Gemeinschaft der Praxis' (Community of Practice) in der Musiksoziologie nach Lave und Wenger?",
        answerA = "Ein offiziell registrierter Musikverein mit Satzung und Mitgliedsbeitrag",
        answerB = "Eine Gruppe von Menschen, die durch gemeinsames Musizieren, geteilte Praktiken und gegenseitiges Lernen eine kollektive Expertise und Identitaet entwickeln",
        answerC = "Eine staatlich gefoerderte Berufsmusiker-Gewerkschaft",
        answerD = "Das Ensemble-Probenkonzept im professionellen Orchesterbetrieb",
        correctAnswer = 1,
        explanation = "Lave und Wengers Konzept der 'Community of Practice' (1991) beschreibt informelle Lern-Gemeinschaften: Individuen werden durch Teilnahme und Imitation ('legitime periphere Partizipation') zu vollwertigen Mitgliedern. In der Musiksoziologie angewendet: Jazz-Jamsessions, Folk-Circles, Boygroups in Underground-Szenen — alle entwickeln so kollektives Wissen.",
        difficulty = 4,
        funFact = "Paul McCartney und John Lennon lernten von einander durch informelle Community-of-Practice-Prozesse: Paul lehrte John Gitarren-Akkorde; John brachte Chuck-Berry-Rhythmik ein. Diese gegenseitige Sozialisation prae-formierte den Beatles-Sound."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche musiksoziologische These beschreibt Simon Frith in 'Performing Rites' (1996) zur Funktion populaerer Musik?",
        answerA = "Popmusik ist kuenstlerisch minderwertig und dient nur der Ablenkung",
        answerB = "Populaere Musik konstruiert Identitaet und Gemeinschaft: sie gibt Menschen die Mittel, sich selbst und andere zu verstehen, Grenzen zu ziehen und soziale Rollen auszuhandeln",
        answerC = "Populaere Musik verliert mit zunehmender Technologisierung ihren sozialen Wert",
        answerD = "Nur authentisch aufgefuehrte Livemusik kann soziologische Funktion erfuellen",
        correctAnswer = 1,
        explanation = "Simon Friths zentrales Argument ist, dass Musik vor allem als soziale Praxis verstanden werden muss. Musik konstituiert Identitaet — als Individuum und als Gruppe — und ermoeglicht Grenzziehungen (wir/die). Aesthetischer Genuss ist dabei untrennbar mit sozialer Bedeutungsproduktion verknuepft.",
        difficulty = 4,
        funFact = "Simon Frith hat massgeblich dazu beigetragen, Popular Music Studies als akademisches Fach zu etablieren. Er war selbst Rockmusikkritiker fuer renommierte britische Zeitschriften, bevor er Universitaetsprofessor wurde — ein ungewoehnlicher Karriereweg in der akademischen Musikwissenschaft."
    ),

    // ── Opernproduktion & Regietheater (8) ──────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der kontroverse Begriff 'Regietheater' im deutschsprachigen Opernbetrieb?",
        answerA = "Die Praxis, Opern ausschliesslich auf Originalschauplatz und in Originalsprache zu inszenieren",
        answerB = "Eine Inszenierungspraxis, bei der der Regisseur das Werk stark uminterpretiert, verfremdend bearbeitet oder in neuen zeitlichen und inhaltlichen Kontexten zeigt, oft unabhaengig von den Originalangaben",
        answerC = "Die technische Leitung des Buehnenbetriebs durch den Intendanten",
        answerD = "Ein System, bei dem das Regiebuch strikt die historische Auffuehrungspraxis der Urauffuehrung rekonstruiert",
        correctAnswer = 1,
        explanation = "Regietheater (auch 'Regie-Oper') bezeichnet Produktionen, in denen der Regisseur das Werk staerker als Vorlage fuer eigene Interpretationen benutzt: zeitliche Versetzungen, politische Umdeutungen, Verfremdung von Handlung und Buehne. Es ist ein zentrales Thema im Operndiskurs seit den 1970ern und spaltet Publikum wie Kritiker.",
        difficulty = 4,
        funFact = "Besonders Frank Castorf und Calixto Bieito gelten als Pioniere radikalen Regietheaters. Castorfs 'Ring des Nibelungen' bei den Bayreuther Festspielen 2013 wurde bei der Premiere mit heftigen Buhrufen empfangen — und ist seither Kultobjekt der Opernwelt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Prompter' (Souffleur/Souffleurin) in der Opernproduktion und welche Funktion hat er?",
        answerA = "Der Prompter koordiniert Beleuchtungsuebergaenge und gibt Lichtstichworte",
        answerB = "Der Souffleur/die Souffleurin sitzt in einem verdeckten Kasten an der Buehnenvorderkante und gibt Saengern bei Bedarf Textzeilen oder musikalische Einsaetze leise vor",
        answerC = "Er ist ein Assistent des Dirigenten und gibt Stimmgruppen Einsatzzeichen",
        answerD = "Er koordiniert die Buehnenarbeit zwischen Regisseur und technischem Personal",
        correctAnswer = 1,
        explanation = "Der Souffleur (franzoesisch fuer 'Einfluesterer') ist eine in der Oper traditionell wichtige Figur: Im Soufflierkasten an der Rampenkante folgend im Libretto und Partitur gibt er Saengern bei Bedarf Text oder Noteneinsaetze leise ein. In modernen Produktionen wird diese Rolle durch Monitore und besser trainierte Saenger teils ersetzt, bleibt aber in vielen Opernhaeusern aktiv.",
        difficulty = 4,
        funFact = "An der Metropolitan Opera New York ist der Souffleur-Kasten seit den 1980ern aus aesthetischen Gruenden abgebaut. Stattdessen haben die Saenger Prompter-Monitore seitlich an der Buehne. Dennoch beschaeftigt die MET weiterhin ein Prompter-Team fuer Notfaelle und Proben."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Begriff 'Parkettinszenierung' (Sitzprobe) in der Opernproduktion?",
        answerA = "Eine Probe, bei der das Publikum auf der Buehne sitzt und die Saenger im Parkett singen",
        answerB = "Eine musikalische Probe, bei der Saenger ohne Buehnenaktionen sitzend mit dem Orchester zusammenarbeiten, um Tempo und Intonation zu verfeinern",
        answerC = "Eine Verkleinerte-Besetzungs-Probe nur fuer Statisterie und Choersaenger",
        answerD = "Eine Generalprobe ohne Kostuemstuecke mit reduzierten Orchesterbesetzung",
        correctAnswer = 1,
        explanation = "Die Sitzprobe (Parkettprobe) ist eine unverzichtbare Probenform bei grossen Opernproduktionen: Saenger sitzen im Zuschauersaal, das Orchester im Graben, und es wird rein musikalisch ohne Regie und Buehnenaktionen gearbeitet. Ziel ist die musikalische Abstimmung zwischen Saenger und Orchester.",
        difficulty = 4,
        funFact = "Die Sitzprobe gilt unter Opernsaengern oft als eine der wichtigsten Proben, da man hier erstmals den vollen Orchesterklang erlebt und die Balance sowie Einsaetze feinjustiert werden koennen — ohne den Stress der Buehnenaktionen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Fachbegriff 'Bühnenbildner' (Szenograph) in der Opernproduktion, und was unterscheidet ihn vom Kostümbildner?",
        answerA = "Der Buehnenbildner entwirft das visuelle Gesamtbild der Buehnenraeume; der Kostuembildner entwirft Kleider und Ausstattung der Darsteller",
        answerB = "Buehnenbildner sind fuer Lichtgestaltung, Kostuembildner fuer Maske zustaendig",
        answerC = "Buehnenbildner leiten technisches Personal; Kostuembildner sind Assistenten des Regisseurs",
        answerD = "Beide Berufe sind synonym und werden meist von einer Person ausgefuehrt",
        correctAnswer = 0,
        explanation = "Buehnenbildner (Szenograph) entwirft Bauten, Dekorationen und die raeumliche Gesamtkonzeption der Buehne. Kostuembildner verantwortet alle Kleider, Accessoires und visuellen Erscheinungen der Figuren. Beide arbeiten enge mit dem Regisseur zusammen — manchmal ist eine Person fuer beides zustaendig, haeufiger sind es spezialisierte Kuenstler.",
        difficulty = 4,
        funFact = "Ruth Berghaus, eine der bedeutendsten deutschen Opernregisseurinnen, arbeitete oft mit dem Buehnenbildner Axel Manthey zusammen — ihr gemeinsames, reduziert-abstraktes Buehnenkonzept praegt den Begriff 'Berliner Schule' des Opernregietheaters der DDR-Aera."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet der Ausdruck 'da capo aria' in der Barockoper und welche dramaturgische Funktion erfuellte sie?",
        answerA = "Eine Arie, die vom Orchester ohne Saenger wiederholt wird",
        answerB = "Eine dreiteilige Arienform (A-B-A'), bei der der erste Teil wiederholt wird, wobei der Saenger beim Wiederholungsteil Verzierungen improvisiert — sie diente der Charakterzeichnung und Affektdarstellung",
        answerC = "Eine Arie, die der Saenger ad libitum abbrechen kann",
        answerD = "Eine Arie fuer zwei Saenger, die abwechselnd dasselbe Thema singen",
        correctAnswer = 1,
        explanation = "Die Da-capo-Arie war die vorherrschende Arienform der Barockoper (besonders Opera seria): Teil A (Hauptaffekt), Teil B (Kontrast), dann Da capo (Wiederholung von A) mit Verzierungen und Kadenzen nach Wahl des Saengers. Sie erlaubte Virtuositaet und Affektdarstellung, war aber auch dramaturgisch starr und wurde von Gluck als unrealistisch kritisiert.",
        difficulty = 4,
        funFact = "Handels Saenger improvisierten bisweilen so ausufernde Verzierungen beim Da capo, dass das Publikum in Ekstase geriet oder empeoerte Kritiker warnten. Der beruehmt-beruechtigte Kastraten-Streit zwischen Farinelli-Verehrern und Anderen war oft an Da-capo-Auftritten entbrannt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Bedeutung hat der Begriff 'Dramma per musica' im historischen Kontext der Opernentwicklung?",
        answerA = "Ein Theaterstueck, das ohne Gesang, aber mit Orchesterbegleitung aufgefuehrt wird",
        answerB = "Der historische Gattungsbegriff fuer Oper im 17. und 18. Jahrhundert, besonders fuer Opera seria — betonte den dramatischen Charakter gegenueber dem reinen Musikgenuss",
        answerC = "Eine dramatische Kantate fuer den Kirchengebrauch",
        answerD = "Ein Melodram mit gesprochenen Dialogen und eingelegten Liedern",
        correctAnswer = 1,
        explanation = "'Dramma per musica' (Ital. 'Drama fuer Musik') war der Standard-Gattungsbegriff der Barockoper und bezeichnete das Libretto eines fuer Vertonung bestimmten Theaterstuecks. Die Bezeichnung betonte den literarischen Anspruch und grenzte die Gattung von blossem musikalischem Spektakel ab. Pietro Metastasio war der beherrschende Librettist dieses Genres.",
        difficulty = 4,
        funFact = "Pietro Metastasios Libretti wurden so hoch geschaetzt, dass ein einzelnes Libretto (z.B. 'L'olimpiade') von ueber 60 verschiedenen Komponisten vertont wurde. Sein 'Artaserse' (1730) wurde allein 90-mal vertont — ein unuebertroffener Rekord in der Operngeschichte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Castingdirektor' (Besetzungsdirektor) an grossen Opernhaeusern und welche strategische Funktion nimmt er ein?",
        answerA = "Er leitet die technische Besetzung der Buehne (Buehnenarbeiter, Lichttechniker)",
        answerB = "Er verantwortet die kuenstlerische Auswahl von Saengern fuer Produktionen, fuehrt Vorsingen durch, pflegt internationales Saenger-Netzwerke und plant Saengerbesetzungen langfristig",
        answerC = "Er ist ein hochrangiger Repetitor, der neue Saenger im Fach ausbildet",
        answerD = "Er ist fuer die Ticketpreisgestaltung und Premiere-Besetzungen zustaendig",
        correctAnswer = 1,
        explanation = "Der Besetzungsdirektor (casting director) an grossen Opernhaeusern wie der Metropolitan Opera, Wiener Staatsoper oder Covent Garden ist fuer strategisches Saenger-Casting zustaendig: Vorsingen, Vertragsgespruche, Koordination mit Dirigenten und Regisseuren, Langzeit-Fachwahl-Planung und internationales Saenger-Scouting. Diese Rolle ist entscheidend fuer das kuenstlerische Profil des Hauses.",
        difficulty = 4,
        funFact = "An der Metropolitan Opera New York wurde das Gesangstalent vieler Weltkarrieren entdeckt: Das 'Metropolitan Opera National Council Auditions' Programm hat seit 1954 Saenger wie Leontyne Price und Renee Fleming entdeckt — eines der prestigetraechtigsten Nachwuchsprogramme der Opernwelt."
    ),

    // ── Filmmusik-Analyse (8) ────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Diegetic Music' (diegetische Musik) in der Filmmusiktheorie?",
        answerA = "Musik, die nachtraeglich im Tonstudio auf den Film aufgespielt wird (Post-Production)",
        answerB = "Musik, die innerhalb der Filmwelt existiert und von Figuren gehoert oder gespielt werden kann — im Gegensatz zur nicht-diegetischen Begleitmusik des Zuschauers",
        answerC = "Filmmusik, die ausschliesslich auf diatonischen Skalen basiert",
        answerD = "Musik, die auf einer linearen Erzaehlung (Diegese) basiert und keine atonalen Elemente enthaelt",
        correctAnswer = 1,
        explanation = "Diegetische Musik (source music) ist Musik, die zur erzaehlten Welt des Films gehoert: ein Radio, das eine Figur anmacht; ein Pianist, der im Hintergrund spielt; ein Konzert auf der Leinwand. Die Figuren koennen sie hoeren. Nicht-diegetische Musik (score, underscoring) existiert nur fuer den Zuschauer und ist fuer die Filmfiguren unhoorbar.",
        difficulty = 4,
        funFact = "Stanley Kubrick meisterte den Grenzbereich: In 'A Clockwork Orange' (1971) wird Beethovens 9. Sinfonie diegetisch (Alex hoert sie) und gleichzeitig als emotionale Manipulationsmusik eingesetzt — die Grenze zwischen diegetisch und nicht-diegetisch verwischend."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Filmmusik unter dem Begriff 'Mickey Mousing'?",
        answerA = "Den Einsatz von Cartoon-Soundeffekten in Realfilmen",
        answerB = "Die synchrone musikalische Begleitung jeder Bildaktion, so dass Musik jede Bewegung auf der Leinwand direkt nachzeichnet",
        answerC = "Filmmusik, die von Disney lizenziert und in anderen Filmen verwendet wird",
        answerD = "Den Einsatz von Chormusik bei Actionszenen",
        correctAnswer = 1,
        explanation = "Mickey Mousing bezeichnet die enge musikalische Synchronisation mit Bildaktionen: Jeder Schritt, jede Bewegung wird direkt musikalisch kommentiert. Entstand in den fruehen Disney-Zeichentrickfilmen der 1930er. Im Realfilm als zu illustrativ abgelehnt, wird es heute bewusst parodistisch oder komisch eingesetzt.",
        difficulty = 4,
        funFact = "Carl Stalling, Musikdirektor der Warner Bros. Cartoons (1936-1958), war der groesste Mickey-Mousing-Virtuose der Filmgeschichte. Er schrieb wochentlich bis zu 8 Minuten Musik neu und synchronisierte jede Bewegung exakt — ein handwerkliches Meisterstueck der Filmmusik-Geschichte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Begriff 'Leitmotiv' in Richard Wagners Konzept des Musikdramas, und wie wird er in der Filmmusik weiterverwendet?",
        answerA = "Ein wiederkehrendes rhythmisches Muster im Schlagzeug",
        answerB = "Ein melodisches oder harmonisches Motiv, das einer Person, einem Ort oder einer Idee zugeordnet ist und bei deren Erscheinen oder Erwaehnung erklingt",
        answerC = "Das Hauptthema eines Films, das nur am Anfang und Ende gespielt wird",
        answerD = "Ein Ostinato-Bassmotiv, das strukturell den Harmonieverlauf bestimmt",
        correctAnswer = 1,
        explanation = "Wagners Leitmotivik verbindet musikalische Motive mit dramatischen Inhalten: Das Schwerdt-Motiv, das Ring-Motiv, das Wotan-Motiv erklingen bei Erscheinen oder Gedanken an das Zugeordnete. John Williams hat dieses System meisterhaft auf Filmmusik angewandt: Darth Vaders Imperial March, Hedwigs Theme (Harry Potter), der Jaws-Bass.",
        difficulty = 4,
        funFact = "John Williams Imperial March (Star Wars, 1980) ist vermutlich das bekannteste Filmmusik-Leitmotiv der Geschichte. Williams studierte Wagners Partituren intensiv und bekennt offen Wagners Einfluss auf seine Leitmotiv-Technik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Fachbegriff 'underscore' in der Filmmusikpraxis?",
        answerA = "Die Partitur fuer das Streichquartett in einem Kammerfilm",
        answerB = "Hintergrundmusik, die eine Szene emotional unterstuetzt, ohne selbst im Vordergrund zu stehen — im Gegensatz zu Feature Music, die bewusst gehoert werden soll",
        answerC = "Ein digitaler Musik-Placeholder im Rohschnitt, bevor die endgueltige Komposition erstellt wird",
        answerD = "Die Bassstimme des Filmorchesters im Studioaufnahme-Setting",
        correctAnswer = 1,
        explanation = "Underscore (oder underscoring) ist Filmmusik, die emotional und atmosphaerisch wirkt, aber nicht die Aufmerksamkeit auf sich zieht. Sie 'unterschreibt' die visuelle Handlung. Im Gegensatz dazu steht Feature Music (Source Music oder vordergrundig genutzte Musik), die bewusst zum Gespraeuchsthema wird.",
        difficulty = 4,
        funFact = "Bernard Herrmanns Score zu 'Psycho' (1960) war ein revolutionaeres Underscore-Konzept: Er nutzte ausschliesslich Streicher (keine Holz- oder Blechblaeser), was dem Film einen kalten, nervoeosen Klang gab. Hitchcock wollte urspruenglich gar keine Filmmusik fuer den Duschszene-Mord."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Verfahren bezeichnet man in der Filmproduktion als 'Temp Track'?",
        answerA = "Die vorlaeufige Tonspur mit Platzhalterstimmen fuer Spezialeffekte",
        answerB = "Eine provisorische Musikunterlegung aus bereits existierender Musik, die waehrend der Schnittphase verwendet wird, bis die endgueltige Filmmusik fertig ist",
        answerC = "Die zeitlich optimierte Aufnahmesession fuer den Komponisten im Filmstudio",
        answerD = "Ein MIDI-Demo des Filmkomponisten zur Praesentation beim Studio",
        correctAnswer = 1,
        explanation = "Der Temp Track (Temporary Track) besteht aus vorhandener Musik — oft aus anderen Filmen oder klassischer Musik — die der Cutter waehrend der Schnittphase nutzt. Regisseure gewoehnen sich oft so stark daran, dass der Filmkomponist unter Druck steht, aehnliches zu liefern. Kubrick behielt Temp Tracks oft als endgueltige Musik ('2001: Odyssee im Weltraum', '/' Clockwork Orange').",
        difficulty = 4,
        funFact = "George Lucas nutzte als Temp Track fuer 'Star Wars' (1977) Musik von Holst, Dvorak und anderen Klassikern. Dieses Temp Track praete so stark den gewuenschten Klang, dass John Williams sehr eng an diesen Vorlagen arbeitete — eine der beruehmt-beruechtigtsten Temp-Track-Geschichten Hollywoods."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen einem 'Spotting Session' und einer 'Recording Session' im Filmmusik-Prozess?",
        answerA = "Spotting Session = Probe mit Live-Orchester; Recording Session = Finalaufnahme im Studio",
        answerB = "Spotting Session = Treffen zwischen Regisseur, Musikredakteur und Komponist zur Festlegung wo Musik eingesetzt wird; Recording Session = die tatsaechliche Orchesteraufnahme der fertigen Komposition",
        answerC = "Spotting Session = Sichtung verfuegbarer Lizenztitel; Recording Session = Einspielung von Originalkompositionen",
        answerD = "Spotting Session = Aufnahme von Geraeuscheffekten; Recording Session = Sprachaufnahme fuer Synchronisation",
        correctAnswer = 1,
        explanation = "Die Spotting Session ist ein fundamentaler Schritt im Filmmusikprozess: Regisseur, Music Supervisor und Komponist sichten gemeinsam den Filmschnitt und bestimmen 'Cues' — wo Musik beginnt und endet, welche emotionale Funktion sie hat und wie lange sie dauert. Darauf basiert der Komponist seine Arbeit, die dann in der Recording Session aufgenommen wird.",
        difficulty = 4,
        funFact = "John Williams hat mit Steven Spielberg hunderte Spotting Sessions durchgefuehrt. Die beiden sind seit 'The Sugarland Express' (1974) Kollaborationspartner — eine der laengsten und produktivsten Komponist-Regisseur-Partnerschaften der Filmgeschichte mit ueber 25 gemeinsamen Filmen."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie unterscheidet sich 'Source Music' von 'Score Music' in der Filmmusik-Terminologie?",
        answerA = "Source Music ist komponierte Originalmusik; Score Music sind Lizenztitel aus bestehenden Aufnahmen",
        answerB = "Source Music ist musik, die aus einer erkennbaren Quelle innerhalb der Filmwelt kommt (Radio, Konzert, Plattenspieler); Score Music ist die vom Komponisten geschriebene nicht-diegetische Begleitmusik",
        answerC = "Source Music ist die Partitur (Score) des Komponisten; Score Music ist eine Marketingbegriff der Tontraegerindustrie",
        answerD = "Source Music bezeichnet Volkslieder; Score Music bezeichnet zeitgenoessische Kompositionen",
        correctAnswer = 1,
        explanation = "Source Music ist identisch mit diegetischer Musik: Musik mit erkennbarer Quelle in der Filmwelt. Score Music (Original Score, Film Score) ist die komponierte nicht-diegetische Hintergrundmusik des Filmkomponisten. In der Praxis verwischte Tarantino diese Grenze konsequent: In 'Pulp Fiction' ist fast alle Musik Source Music aus erkennbaren Schallplattenquellen.",
        difficulty = 4,
        funFact = "Quentin Tarantinos Filme haben keinen traditionellen Original Score — er lizenziert ausschliesslich bestehende Songs und Source Music. Diese bewusste Entscheidung unterscheidet ihn von fast allen anderen Mainstreamregisseuren und verleiht seinen Filmen eine besondere nostalgische Unmittelbarkeit."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Fachbegriff 'Stinger' in der Filmmusik-Praxis?",
        answerA = "Ein langer Orchestralsatz fuer Schlussszenen",
        answerB = "Ein kurzer, schroffer musikalischer Akzent — oft ein kraftvoller Akkord oder Cluster — der einen ueberraschenden dramatischen Moment oder Schock begleitet",
        answerC = "Der Gesangspart eines Solisten in einem Filmmusical",
        answerD = "Die musikalische Leitmotiv-Variation in einer Klimax-Szene",
        correctAnswer = 1,
        explanation = "Ein Stinger ist ein praegnanter, kurzer musikalischer Schlag — haeufig ffff-Akkorde oder dissonante Cluster — der einen Schockmoment, eine unerwartete Wendung oder eine plotzliche Enthuellung auf der Leinwand unterstreicht. Typisch in Horrorfilmen, Thrillern und Action-Szenen. Bernard Herrmanns Psycho-Streicherattacken sind das Paradebeispiel.",
        difficulty = 4,
        funFact = "In der Spieltheorie der Videospielindustrie wurde der Begriff 'Stinger' uebernommen: Kurze musikalische Signale bei Ereignissen (Schatz gefunden, Spieler stirbt) folgen demselben Prinzip wie Herrmanns Filmstinger — unmittelbare emotionale Verstaerkung eines einzelnen Moments."
    ),

    // ── Musiktherapie (8) ────────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen 'rezeptiver' und 'aktiver' Musiktherapie?",
        answerA = "Rezeptive Musiktherapie findet im Krankenhaus statt; aktive Musiktherapie in Schulen",
        answerB = "Rezeptive Musiktherapie bedeutet, dass der Klient Musik hoert und in einer nicht-spielenden Rolle bleibt; aktive Musiktherapie bedeutet, dass der Klient selbst Musik macht oder improvisiert",
        answerC = "Rezeptive Therapie nutzt nur klassische Musik; aktive Therapie nutzt Improvisation mit Popmusik",
        answerD = "Rezeptive Musiktherapie ist eine passive Entspannungsmethode ohne therapeutisches Ziel; aktive Therapie hat klar definierte klinische Ergebnisparameter",
        correctAnswer = 1,
        explanation = "In der klinischen Musiktherapie wird zwischen rezeptiver (hoerend, passiv) und aktiver (spielend, singend, improvisierend) Herangehensweise unterschieden. Beide haben ihre Indikationen: Rezeptive Methoden werden z.B. bei Schmerztherapie, Stressreduktion oder Sterbehilfe eingesetzt; aktive Methoden bei Kommunikationsstoerungan, Autismus oder Trauma.",
        difficulty = 4,
        funFact = "Die Bonny Method of Guided Imagery and Music (GIM) ist eine bekannte rezeptive Musiktherapietechnik: Der Klient hoert klassische Musik in einem entspannten Zustand und beschreibt entstehende innere Bilder. Entwickelt von Helen Bonny in den 1970ern, wird sie heute weltweit in der Psychotherapie eingesetzt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher neurologische Effekt wird als 'ISO-Prinzip' in der Musiktherapie bezeichnet?",
        answerA = "Das Prinzip, dass Musik stets in gleicher Lautstaerke gespielt werden soll",
        answerB = "Das therapeutische Verfahren, bei dem die Musik zunachst dem aktuellen emotionalen Zustand des Patienten angepasst wird und dann schrittweise in den Zielzustand (z.B. Entspannung) gefuehrt wird",
        answerC = "Die Isomorphie von Melodiestruktur und Sprachprosodik bei der Behandlung von Aphasie",
        answerD = "Die Echtzeit-Synchronisation von Herzrhythmus und musikalischem Beat",
        correctAnswer = 1,
        explanation = "Das ISO-Prinzip (Iso = gleich, aus dem Griechischen) beschreibt ein Grundprinzip der Musiktherapie: Der Therapeut beginnt mit Musik, die dem Ist-Zustand des Patienten entspricht (z.B. aufgeregte, schnelle Musik bei Agitation), und fuehrt dann schrittweise zu einer gewuenschten Stimmung hin. Abrupte Stimmungsaenderungen durch Musik werden vermieden.",
        difficulty = 4,
        funFact = "Das ISO-Prinzip wurde vom US-amerikanischen Musikpsychologen Ira Max Altshuler in den 1940ern formuliert. Es ist heute ein Standard-Konzept in nahezu allen musiktherapeutischen Ausbildungen weltweit, wenngleich seine neurobiologische Grundlage weiter erforscht wird."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Melodische Intonationstherapie' (MIT) und bei welcher neurologischen Stoerung wird sie primaer eingesetzt?",
        answerA = "Eine Methode zur Verbesserung der Gesangsintonation bei professionellen Saengern mit Stimmproblemen",
        answerB = "Eine musikbasierte Sprachtherapie fuer Aphasie-Patienten, bei der Sprache durch melodisch-rhythmisches Singen oder Intonieren reaktiviert wird",
        answerC = "Eine Entspannungsmethode fuer Patienten mit Panikattacken durch melodisches Summen",
        answerD = "Eine Musiktherapie-Methode zur Behandlung von Hoerstoerungan durch gezielte Frequenzexposition",
        correctAnswer = 1,
        explanation = "Die Melodische Intonationstherapie (MIT, entwickelt von Martin Albert u.a., 1973) nutzt melodisch-rhythmische Sprachmuster, um bei Broca-Aphasie-Patienten die Sprachfunktion zu reaktivieren. Da Sprache und Gesang teilweise unterschiedliche Hirnregionen nutzen, ermoeglicht Singen manchmal das Sprechen auch bei stark beeintroaechtigter Sprachzone.",
        difficulty = 4,
        funFact = "Der bekannteste MIT-Patient war Congresswoman Gabrielle Giffords, die 2011 durch Schusswunden eine schwere Aphasie erlitt. Sie lernte durch Melodische Intonationstherapie erneut zu sprechen — ihr Fall machte die Methode weltweit bekannt und fuehrte zu erhoehter Forschungsfoerderung."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept beschreibt 'Neurologic Music Therapy' (NMT) als Unterschied zu traditionellen Musiktherapieansaetzen?",
        answerA = "NMT setzt ausschliesslich klassische Musik des 18. und 19. Jahrhunderts ein",
        answerB = "NMT basiert auf neurowissenschaftlichen Erkenntnissen ueber musikalische Wirkung auf das Gehirn und entwickelt standardisierte klinische Techniken auf dieser Basis",
        answerC = "NMT ist ein alternativer Ansatz ohne wissenschaftliche Basis, der Musik als spirituelle Heilkraft versteht",
        answerD = "NMT konzentriert sich ausschliesslich auf neurologische Erkrankungen wie Epilepsie und schliesst alle anderen Stoerungsbilder aus",
        correctAnswer = 1,
        explanation = "Neurologic Music Therapy (NMT, entwickelt von Michael Thaut, Colorado State University) basiert auf neurowissenschaftlicher Grundlagenforschung zu musikalischen Wirkungen auf das Gehirn. NMT entwickelt standardisierte, replizierbare Techniken (z.B. Rhythmic Auditory Stimulation fuer Gang-Rehabilitation bei Parkinson) und unterscheidet sich dadurch von anderen Ansaetzen durch seinen empirisch-wissenschaftlichen Standard.",
        difficulty = 4,
        funFact = "Rhythmic Auditory Stimulation (RAS), eine NMT-Technik, hat in klinischen Studien nachgewiesen, dass Parkinson-Patienten durch Gehen im Takt externer Rhythmusquellen signifikant besser gehen: laengere Schrittlaenge, hoehere Geschwindigkeit, bessere Balance — alles messbar verbesserlich."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt das Konzept 'musikbasiertes Gedaechtnistraining' bei Demenz-Patienten?",
        answerA = "Das Spielen von Musikinstrumenten zur Verzoegerung des kognitiven Abbaus",
        answerB = "Das gezielte Nutzen von persoenlich bedeutsamer Musik ('autobiografische Musik') zur Aktivierung von Erinnerungen und emotionaler Reaktivitaet, auch bei fortgeschrittener Demenz",
        answerC = "Das Hoeren von Musik mit spezifischen Frequenzen (40 Hz Gamma), die kognitiven Abbau stoppen sollen",
        answerD = "Musikalisches Quiz als kognitives Training-Instrument",
        correctAnswer = 1,
        explanation = "Autobiografisch bedeutsame Musik (Lieblingslieder, Musik aus der Jugend) aktiviert bei Demenz-Patienten oft noch Erinnerungen, wenn andere Gedaechtnissysteme bereits stark beeintraechtigt sind. Das Dokumentarfilm-Projekt 'Alive Inside' (2014) machte dieses Phanaomen weltweit bekannt: Patienten, die kaum mehr kommunizierten, reagierten emotional stark auf ihre persoenliche Musik.",
        difficulty = 4,
        funFact = "Neurowissenschaftliche Erklaerung: Das autobiografische Gedaechtnis ist im medialen Temporallappen gespeichert — einer Region, die bei Alzheimer-Demenz vergleichsweise spaet betroffen ist. Musik aktiviert emotionale Erinnerungsnetze im limbischen System, das oft laenger erhalten bleibt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Theorie erklaert, warum Musik Schmerz lindern kann, und auf welchem neurobiologischen Mechanismus basiert sie?",
        answerA = "Musik lindert Schmerz durch Ablenkung (attentional distraction): Sie vermindert die kognitive Verarbeitung von Schmerzsignalen, indem sie Aufmerksamkeitsressourcen bindet",
        answerB = "Musik aktiviert spezifische Anti-Schmerz-Nervenfasern im Rueckenmark direkt",
        answerC = "Musik veraendert die Chemie des Blutes und senkt Entzuendungsmarker",
        answerD = "Musik wirkt als Plazebo ohne realen neurobiologischen Effekt",
        correctAnswer = 0,
        explanation = "Musik lindert Schmerz durch mehrere Mechanismen: Ablenkung (Attentional Distraction) ist einer davon — kognitive Ressourcen werden durch Musikhoeren gebunden, die sonst der Schmerzverarbeitung zur Verfuegung stehen. Zusaetzlich stimuliert Musik Endorphin-Ausschuettung und aktiviert das Belohnungssystem (Nucleus accumbens), was Schmerztoleranz erhoehen kann.",
        difficulty = 4,
        funFact = "Eine Metaanalyse von Nilsson (2008) untersuchte 42 Studien zum Thema Musik und postoperativer Schmerz: Patienten, die Musik horten, benoetigten statistisch signifikant weniger Schmerzmedikamente und berichteten geringere Schmerzstaerke — ein klinisch relevanter, replizierter Befund."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'rhythmische Synchronisation' (Entrainment) in der Musiktherapie und welchen physiologischen Systemen kommt sie zugute?",
        answerA = "Die Anpassung der Spielgeschwindigkeit des Therapeuten an den Patienten",
        answerB = "Die Tendenz biologischer Systeme (Herzschlag, Atemrhythmus, Gangbewegung), sich an externe rhythmische Stimuli anzupassen — nutzbar zur Regulation physiologischer Rhythmen",
        answerC = "Ein soziales Phaenomen, bei dem Gruppen spontan im Takt klatschen",
        answerD = "Die Synchronisation von zwei Musikern durch gemeinsames Metronom",
        correctAnswer = 1,
        explanation = "Entrainment (Rhythmische Synchronisation) beschreibt das physikalische und biologische Phaenomen, dass biologische Oszillatoren (Herzrhythmus, Atmung, Gangzyklus) dazu neigen, sich an externe rhythmische Quellen anzupassen. In der Musiktherapie wird dies genutzt: z.B. langsame Musik zur Herzfrequenz-Senkung, rhythmische Pulse zur Gangnormalisierung bei Parkinson.",
        difficulty = 4,
        funFact = "Entrainment wurde bereits 1665 vom Physiker Christiaan Huygens beschrieben: Er bemerkte, dass zwei Pendeluhren an derselben Wand sich synchronisierten. Heute weiss man, dass dasselbe Prinzip biologische Rhythmen und neuronale Oszillationen im Gehirn betrifft."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen 'Musiktherapie' und 'Musikmedizin' als klinischen Disziplinen?",
        answerA = "Musiktherapie ist fuer Kinder; Musikmedizin fuer Erwachsene",
        answerB = "Musiktherapie ist ein interaktiver therapeutischer Prozess zwischen Therapeut und Klient; Musikmedizin ist der praeskriptive Einsatz aufgezeichneter Musik durch medizinisches Personal ohne Therapeuten-Klient-Beziehung",
        answerC = "Musiktherapie nutzt Livemusik; Musikmedizin ausschliesslich Aufnahmen",
        answerD = "Musikmedizin ist ein unerkanntes Pseudowissenschaftsfeld; Musiktherapie ist klinisch anerkannt",
        correctAnswer = 1,
        explanation = "Die Unterscheidung ist fuer die Berufsidentitaet wichtig: Musiktherapie beinhaltet eine therapeutische Beziehung, individualisierte Interventionsplanung und Evaluation durch ausgebildete Therapeuten. Musikmedizin (Music Medicine) bezeichnet den klinischen Einsatz aufgezeichneter Musik — z.B. Kopfhoerer mit entspannender Musik vor Operationen — durch medizinisches Personal ohne eigene Musiktherapie-Ausbildung.",
        difficulty = 4,
        funFact = "Die erste Berufsorganisation fuer Musiktherapie war die National Association for Music Therapy (NAMT), gegruendet 1950 in den USA — kurz nach dem Zweiten Weltkrieg, als Veteranenhospitaeler Musik systematisch zur Traumabehandlung einsetzten und erkannten, dass professionelle Ausbildung noetig war."
    )

)
