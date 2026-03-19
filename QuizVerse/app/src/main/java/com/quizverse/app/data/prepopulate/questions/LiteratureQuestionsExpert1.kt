package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert1(): List<Question> = listOf(

    // ── Aristoteles & Antike Poetik (6) ─────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Welcher russische Formalist pragte den Begriff 'Ostranenie' (Verfremdung) in seinem Aufsatz 'Kunst als Verfahren' (1917)?",
        answerA = "Roman Jakobson",
        answerB = "Boris Ejchenbaum",
        answerC = "Jurij Tynjanov",
        answerD = "Viktor Sklovskij",
        correctAnswer = 3,
        explanation = "Viktor Sklovskij pragte 1917 in 'Kunst als Verfahren' den Begriff Ostranenie (Verfremdung). Er beschreibt damit das literarische Verfahren, Bekanntes so darzustellen, als saehe man es zum ersten Mal, um die automatisierte Wahrnehmung aufzubrechen.",
        difficulty = 4,
        funFact = "Sklovskij veranschaulichte Ostranenie u.a. anhand von Tolstojs Erzaehlung 'Cholstomer', in der ein Pferd als Erzaehler fungiert und menschliche Eigentumsverhaeltnisse verfremdet beschreibt."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Aristoteles in seiner 'Poetik' unter dem Begriff 'Katharsis'?",
        answerA = "Die moralische Belehrung des Publikums durch den Dichter",
        answerB = "Die kuenstlerische Vollkommenheit der Tragoedie",
        answerC = "Die Reinigung von Affekten wie Jammer und Schaudern durch das Erleben der Tragoedie",
        answerD = "Die Nachahmung einer vollstaendigen und in sich geschlossenen Handlung",
        correctAnswer = 2,
        explanation = "Aristoteles definiert Katharsis als die Reinigung der Affekte, insbesondere von Eleos (Jammer/Mitleid) und Phobos (Schaudern/Furcht), die das Publikum beim Erleben einer Tragoedie durchmacht. Die genaue Bedeutung ist in der Forschung bis heute umstritten.",
        difficulty = 4,
        funFact = "Jacob Bernays deutete Katharsis im 19. Jahrhundert medizinisch als Entladung; andere wie Gerald Else verstehen sie kognitiv als klaerende Einsicht — der Streit gilt als einer der aeltesten der Literaturwissenschaft."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bedeutet 'Mimesis' im Sinne der aristotelischen 'Poetik'?",
        answerA = "Die Nachahmung menschlicher Handlungen durch kuenstlerische Darstellung",
        answerB = "Die wortgetreue Wiedergabe historischer Ereignisse",
        answerC = "Das Prinzip der poetischen Gerechtigkeit im Drama",
        answerD = "Die Einheit von Ort, Zeit und Handlung in der Tragoedie",
        correctAnswer = 0,
        explanation = "Mimesis bezeichnet bei Aristoteles die Nachahmung (nicht blosse Kopie) menschlicher Handlungen. Im Gegensatz zu Platons negativer Beurteilung der Mimesis wertet Aristoteles sie positiv: Durch Mimesis erkennt der Mensch allgemeine Wahrheiten.",
        difficulty = 4,
        funFact = "Erich Auerbachs Buch 'Mimesis' (1946) verfolgt die Geschichte der Wirklichkeitsdarstellung von Homer bis Virginia Woolf und gilt selbst als Meisterwerk der Literaturwissenschaft."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche der 'Drei Einheiten' des Dramas stammt NICHT direkt aus Aristoteles' 'Poetik', sondern wurde erst von spaeten Kommentatoren hinzugefuegt?",
        answerA = "Einheit der Handlung",
        answerB = "Einheit der Zeit",
        answerC = "Einheit des Stils",
        answerD = "Einheit des Ortes",
        correctAnswer = 3,
        explanation = "Aristoteles forderte in der Poetik die Einheit der Handlung (klar) und erwaehnte die Einheit der Zeit (Tendenz auf einen Sonnenumlauf). Die Einheit des Ortes wurde erst von Renaissancetheoretikern wie Scaliger aus Aristoteles herausgelesen und zur Doktrin erhoben.",
        difficulty = 4,
        funFact = "Corneille und Racine debattierten im 17. Jahrhundert heftig ueber die Anwendung der Drei Einheiten. Corneilles 'Le Cid' galt als Verstoss und loeste den sogenannten 'Querelle du Cid' aus."
    ),
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff verwendet Aristoteles in der 'Poetik' fuer den plotzlichen Handlungsumschlag, der den Helden von Glueck zu Unglueck fuehrt?",
        answerA = "Anagnorisis",
        answerB = "Hamartia",
        answerC = "Peripetie",
        answerD = "Hybris",
        correctAnswer = 2,
        explanation = "Peripetie (gr. peripeteia = Umschlag) bezeichnet bei Aristoteles den plotzlichen Umschwung des Gluecks in der Tragoedie. Sie ist neben der Anagnorisis (Wiedererkennung) eines der zentralen Elemente des tragischen Handlungsaufbaus.",
        difficulty = 4,
        funFact = "In 'Koenig Oedipus' fallen Peripetie und Anagnorisis zusammen: Der Bote, der Oedipus beruhigen will, loest genau jene Enthuellung aus, die seinen Sturz bewirkt."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet 'Hamartia' in der aristotelischen Tragoedie?",
        answerA = "Den tragischen Fehler oder die Verfehlung des Helden",
        answerB = "Die goettliche Strafe fuer menschliche Hybris",
        answerC = "Die Wiedererkennung des Helden durch andere Figuren",
        answerD = "Das Schlusslied des Chors in der attischen Tragoedie",
        correctAnswer = 0,
        explanation = "Hamartia (gr. Verfehlung, Irrtum) bezeichnet den Fehler oder das Versehen, das den Untergang des tragischen Helden ausloest. Aristoteles betont, dass der Held weder vollkommen tugendhaft noch boese sein soll, damit seine Hamartia den Zuschauer erschuettert.",
        difficulty = 4,
        funFact = "Die Uebersetzung von Hamartia als 'Erbsuende' in der Bibelwissenschaft (Roemerbrief) zeigt, wie weit der Begriff in Theologie und Ethik ausgestrahlt hat."
    ),

    // ── Russischer Formalismus (5) ────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Welches Begriffspaar unterscheiden die Russischen Formalisten, um literarischen Stoff von seiner kuenstlerischen Gestaltung zu trennen?",
        answerA = "Langue und Parole",
        answerB = "Fabula und Sjuzet",
        answerC = "Signifikant und Signifikat",
        answerD = "Denotation und Konnotation",
        correctAnswer = 1,
        explanation = "Die Formalisten unterscheiden Fabula (den chronologisch geordneten Rohstoff der Ereignisse) vom Sjuzet (der kuenstlerischen Anordnung und Vermittlung dieser Ereignisse im Text). Diese Unterscheidung ist grundlegend fuer die Narratologie.",
        difficulty = 4,
        funFact = "Gerard Genettes Narratologie uebernimmt diese Unterscheidung als 'histoire' und 'recit' und entwickelt sie zum einflussreichsten Modell der strukturalistischen Erzaehltheorie aus."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche Institution war das institutionelle Zentrum des Russischen Formalismus in Petrograd ab 1916?",
        answerA = "ROSTA (Russische Telegraphenagentur)",
        answerB = "OPOJAZ (Gesellschaft zum Studium der poetischen Sprache)",
        answerC = "LEF (Linke Front der Kuenste)",
        answerD = "MXAT (Moskauer Kuenstlertheater)",
        correctAnswer = 1,
        explanation = "Das OPOJaZ (russisch: Obschestwo po isutscheniju poetitscheskogo jasyka) war ab 1916/17 das organisatorische Zentrum des Russischen Formalismus in Petrograd. Parallel dazu existierte der Moskauer Linguistische Kreis.",
        difficulty = 4,
        funFact = "Unter Stalin wurde der Russische Formalismus ab 1930 als 'bourgeois' verdammt. Sklovskij musste sich oeffentlich selbstkritisieren; viele Formalisten emigrierten oder schwiegen fortan."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Boris Ejchenbaum unter dem Begriff 'Skaz' in seiner Literaturtheorie?",
        answerA = "Eine muendliche, dialogisch-performative Erzaehlweise, die Alltagssprache imitiert",
        answerB = "Den epischen Hintergrund eines Volksmaerchens",
        answerC = "Die metrische Struktur russischer Volkslieder",
        answerD = "Den kollektiven Autor von Folkloretexten",
        correctAnswer = 0,
        explanation = "Skaz bezeichnet bei Ejchenbaum eine Erzaehlweise, die muendliche Rede imitiert und deren Eigenwert betont — nicht was erzaehlt wird, sondern wie (Intonation, Rhythmus, Umgangssprache). Gogols Prosa gilt als Musterbeispiel.",
        difficulty = 4,
        funFact = "Michail Bachtin uebernimmt den Skaz-Begriff und bindet ihn in seine Dialogizitaetstheorie ein: Im Skaz interagieren mindestens zwei Stimmen — die des Erzaehlers und die des impliziten Gespraeches."
    ),
    Question(
        categoryId = 10,
        questionText = "Welcher Formalist pragte den Begriff 'Literarizitaet' (literaturnost) als eigentlichen Gegenstand der Literaturwissenschaft?",
        answerA = "Viktor Sklovskij",
        answerB = "Boris Ejchenbaum",
        answerC = "Roman Jakobson",
        answerD = "Jurij Tynjanov",
        correctAnswer = 2,
        explanation = "Roman Jakobson formulierte, dass die Literaturwissenschaft nicht die Literatur, sondern die 'Literarizitaet' (literaturnost) — das, was ein Werk zu Literatur macht — untersuchen solle. Dieser Programmsatz begrundete die formale Methode.",
        difficulty = 4,
        funFact = "Jakobson pragte spaeter auch das Konzept der 'poetischen Funktion' der Sprache: In der Poesie richtet sich die Botschaft auf sich selbst — die Form wird zum Inhalt."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Jurij Tynjanov mit dem Begriff der 'literarischen Evolution'?",
        answerA = "Den biologisch-darwinistischen Fortschritt der Weltliteratur",
        answerB = "Den Wechsel literarischer Systeme durch Entautomatisierung dominanter Normen",
        answerC = "Die chronologische Abfolge von Stilperioden in der Kunstgeschichte",
        answerD = "Den Einfluss politischer Revolutionen auf die Literatur",
        correctAnswer = 1,
        explanation = "Tynjanov versteht literarische Evolution als systemischen Wandel: Wenn ein literarisches Verfahren automatisiert und damit wirkungslos wird, treten Randelemente ins Zentrum und ersetzen die alten Normen. Literatur entwickelt sich durch interne Dynamik.",
        difficulty = 4,
        funFact = "Tynjanov und Jakobson formulierten 1928 gemeinsam Thesen ueber literarische Evolution, in denen sie die interne literarische Reihe mit der externen sozialen Reihe in Beziehung setzten."
    ),

    // ── Strukturalismus (6) ───────────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Wie lautet der Titel des Hauptwerks von Ferdinand de Saussure, das postum aus Vorlesungsmitschriften zusammengestellt wurde und den modernen Strukturalismus begrundete?",
        answerA = "Cours de linguistique generale",
        answerB = "Lecons de linguistique generale",
        answerC = "Elements de semiologie",
        answerD = "La langue comme systeme de signes",
        correctAnswer = 0,
        explanation = "Der 'Cours de linguistique generale' (1916), aus Vorlesungsmitschriften seiner Schueler zusammengestellt, begrundete die strukturale Linguistik mit Konzepten wie Signifikant/Signifikat, Langue/Parole und dem arbitraeren Zeichen.",
        difficulty = 4,
        funFact = "Saussure selbst hat das Buch nie geschrieben. Es wurde posthum von Charles Bally und Albert Sechehaye aus Mitschriften rekonstruiert — mit allen editorischen Problemen, die das mit sich bringt."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Saussures Begriff 'Langue' im Gegensatz zu 'Parole'?",
        answerA = "Die individuelle, konkrete Sprachaeusserung des Sprechers",
        answerB = "Das abstrakte Zeichensystem, das einer Sprachgemeinschaft gemeinsam ist",
        answerC = "Die historische Entwicklung einer Einzelsprache im Zeitverlauf",
        answerD = "Die lautliche Realisierung eines Phonems im Sprechakt",
        correctAnswer = 1,
        explanation = "Langue bezeichnet das abstrakte, soziale System von Regeln und Konventionen, das einer Sprachgemeinschaft gemeinsam ist. Parole hingegen ist die individuelle, konkrete Sprachaeusserung. Saussure macht die Langue, nicht die Parole, zum Gegenstand der Linguistik.",
        difficulty = 4,
        funFact = "Noam Chomsky uebernimmt die Distinktion als 'Kompetenz' (Langue) und 'Performanz' (Parole) in seine generative Grammatik — und fuehrt sie damit in eine ganz andere theoretische Richtung."
    ),
    Question(
        categoryId = 10,
        questionText = "Was besagt Saussures These der 'Arbitraritaet des Zeichens'?",
        answerA = "Zeichen sind willkuerlich, weil jeder Sprecher sie beliebig aendern kann",
        answerB = "Literarische Zeichen sind mehrdeutiger als Alltagszeichen",
        answerC = "Symbole sind stets ikonisch und verweisen auf reale Objekte",
        answerD = "Die Verbindung zwischen Lautbild (Signifikant) und Begriff (Signifikat) ist konventionell, nicht natuerlich",
        correctAnswer = 3,
        explanation = "Arbitraritaet bedeutet, dass zwischen Signifikant (Lautbild) und Signifikat (Konzept) kein natuerlicher, ikonischer Zusammenhang besteht. 'Hund' und 'dog' bezeichnen dasselbe Konzept — die Verbindung ist gesellschaftliche Konvention, nicht Naturnotwendigkeit.",
        difficulty = 4,
        funFact = "Saussure sah die Arbitraritaet als 'erstes Prinzip' der Linguistik. Ausnahmen wie Onomatopoetika (kuckuck, miau) erklaerte er als marginale Randfaelle, die die Regel bestaetigen."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche Instanz 'stirbt' laut Roland Barthes' Essay 'Der Tod des Autors' (1968) beim Lesen eines Textes?",
        answerA = "Der ideale Leser",
        answerB = "Der implizite Erzaehler",
        answerC = "Der Autor",
        answerD = "Der Kritiker",
        correctAnswer = 2,
        explanation = "Barthes argumentiert, dass im Moment des Schreibens der Autor stirbt: Die Bedeutung eines Textes entsteht nicht aus der Intention des Autors, sondern im Akt des Lesens. Der Leser wird zum eigentlichen Produzenten von Bedeutung.",
        difficulty = 4,
        funFact = "Michel Foucault antwortete auf Barthes mit 'Was ist ein Autor?' (1969) und fragte nach der diskursiven Funktion, die der Autorname uebernimmt — eine Gegenbewegung, die den Autor als Funktion rehabilitiert."
    ),
    Question(
        categoryId = 10,
        questionText = "Welches strukturalistische Konzept beschreibt Roland Barthes in 'Mythologies' (1957)?",
        answerA = "Den Mythos als sekundaeres semiologisches System, das auf einem primaeren Zeichensystem aufbaut",
        answerB = "Die Polysemie literarischer Texte als offene Zeichen",
        answerC = "Die Intertextualitaet als Netz von Textreferenzen",
        answerD = "Den Text als produktiven Gegendiskurs zur Ideologie",
        correctAnswer = 0,
        explanation = "Barthes zeigt in 'Mythologies', wie der Mythos ein sekundaeres Zeichensystem bildet: Ein vollstaendiges Zeichen der ersten Ebene wird zum Signifikanten eines neuen Signifikats. So wird z.B. ein Foto eines gruessenden Soldaten zum Mythos des 'Franzosischen Imperiums'.",
        difficulty = 4,
        funFact = "Barthes analysiert in 'Mythologies' Alltagsphaenomene wie Wrestling, Waschmittelwerbung und Steak mit Pommes als Mythen der buergerlichen Gesellschaft — ein Grundlagentext der Kulturwissenschaften."
    ),
    Question(
        categoryId = 10,
        questionText = "Auf welchem Werk basiert Gerard Genettes strukturalistische Narratologie 'Discours du recit' (1972) als Textbeispiel?",
        answerA = "Flauberts 'Madame Bovary'",
        answerB = "Baudelaires 'Les Fleurs du Mal'",
        answerC = "Sartres 'La Nausee'",
        answerD = "Prousts 'A la recherche du temps perdu'",
        correctAnswer = 3,
        explanation = "Genette analysiert Prousts 'A la recherche du temps perdu' als zentrales Textbeispiel und entwickelt dabei Konzepte wie histoire/recit/narration sowie Analepse, Prolepse und Anachronie als Instrumente der Narratologie.",
        difficulty = 4,
        funFact = "Genettes Unterscheidung von histoire (die erzaehlten Ereignisse), recit (der Erzaehltext) und narration (der Erzaehlakt) entwickelt die formalistischen Begriffe Fabula und Sjuzet systematisch weiter."
    ),

    // ── Hermeneutik (5) ───────────────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Was beschreibt der 'hermeneutische Zirkel' in der Textinterpretation?",
        answerA = "Die Unmoglichkeit objektiver Textdeutung aufgrund subjektiver Vorannahmen",
        answerB = "Das Wechselverhaltnis zwischen dem Verstehen des Ganzen und seiner Teile",
        answerC = "Den Kreislauf von Produktion, Rezeption und neuer Produktion von Literatur",
        answerD = "Die zirkulaere Struktur symbolischer Rede in der Bibel",
        correctAnswer = 1,
        explanation = "Der hermeneutische Zirkel besagt, dass Teile eines Textes nur im Kontext des Ganzen verstanden werden koennen, das Ganze aber nur durch seine Teile erschlossen wird. Schleiermacher, Dilthey und Gadamer haben dieses Konzept unterschiedlich ausgedeutet.",
        difficulty = 4,
        funFact = "Heidegger ontologisierte den hermeneutischen Zirkel: Fuer ihn ist er kein methodisches Problem, das man loesen muss, sondern die Grundstruktur des menschlichen In-der-Welt-Seins."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Hans-Georg Gadamer unter 'Horizontverschmelzung'?",
        answerA = "Das Verschmelzen des Horizonts des Interpreten mit dem Horizont des Textes im Verstehensakt",
        answerB = "Die vollstaendige Aufgabe des eigenen Standpunkts beim Lesen eines Textes",
        answerC = "Die Vereinigung verschiedener nationaler Literaturtraditioned in der Weltliteratur",
        answerD = "Die methodische Rekonstruktion des urspruenglichen Autorhorizonts",
        correctAnswer = 0,
        explanation = "Gadamers 'Horizontverschmelzung' (aus 'Wahrheit und Methode', 1960) beschreibt, wie Verstehen entsteht: Nicht durch Aufgabe des eigenen Horizonts, sondern durch dessen Erweiterung im Kontakt mit dem anderen Horizont des Textes. Verstehen ist immer ein Vermittlungsgeschehen.",
        difficulty = 4,
        funFact = "Gadamer widersprach E.D. Hirschs These, dass das Ziel der Interpretation die Rekonstruktion der Autorintention sei. Fuer Gadamer gehoert der Anwendungsbezug (applicatio) zum Verstehen selbst."
    ),
    Question(
        categoryId = 10,
        questionText = "Welches Werk Gadamers gilt als Hauptwerk der philosophischen Hermeneutik?",
        answerA = "Die Frage nach der Wahrheit der Kunst",
        answerB = "Wahrheit und Methode",
        answerC = "Hermeneutik und Ideologiekritik",
        answerD = "Das Erbe Europas",
        correctAnswer = 1,
        explanation = "'Wahrheit und Methode. Grundzuege einer philosophischen Hermeneutik' (1960) ist Gadamers Hauptwerk. Er argumentiert, dass Wahrheit nicht allein durch wissenschaftliche Methode erreichbar ist, sondern auch durch Kunst, Geschichte und Sprache zugaenglich wird.",
        difficulty = 4,
        funFact = "Juergen Habermas kritisierte Gadamer, er ueberschaetze die Autoritaet der Tradition. Gadamer antwortete, Habermas ueberschaetze die Reflexion — ein Streit, der die Hermeneutik mit der Kritischen Theorie verband."
    ),
    Question(
        categoryId = 10,
        questionText = "Friedrich Schleiermacher definierte Hermeneutik als Kunstlehre des Verstehens. Welche zwei Methoden unterschied er?",
        answerA = "Grammatische und psychologische (divinatorische) Interpretation",
        answerB = "Syntaktische und semantische Interpretation",
        answerC = "Historische und allegorische Auslegung",
        answerD = "Buchstaebliche und metaphorische Deutung",
        correctAnswer = 0,
        explanation = "Schleiermacher unterscheidet grammatische Interpretation (Sprache als gemeinsames System) und psychologische Interpretation (Einfuehlung in den individuellen Autor, auch 'divinatorische' Methode). Ziel ist, den Autor besser zu verstehen, als er sich selbst verstand.",
        difficulty = 4,
        funFact = "Schleiermachers Hermeneutik entstand aus seiner Bibelauslegung, wurde aber zur allgemeinen Theorie des Textverstehens — ein Schritt, der aus der Theologie eine Geisteswissenschaft machte."
    ),
    Question(
        categoryId = 10,
        questionText = "Welcher Denker pragte das Konzept der 'Vor-Struktur des Verstehens' als notwendige Bedingung jedes Verstehens, das Gadamer als 'Vorurteil' weiterentwickelte?",
        answerA = "Friedrich Schleiermacher",
        answerB = "Wilhelm Dilthey",
        answerC = "Hans-Georg Gadamer",
        answerD = "Martin Heidegger",
        correctAnswer = 3,
        explanation = "Heidegger entwickelte in 'Sein und Zeit' (1927) das Konzept der Vor-Struktur des Verstehens: Jedes Verstehen setzt ein Vorverstaendnis, eine Vorhabe und einen Vorgriff voraus. Gadamer ubernahm dies und sprach von 'Vorurteilen' als legitimer Bedingung des Verstehens.",
        difficulty = 4,
        funFact = "Gadamer rehabilitiert das Wort 'Vorurteil' gegen die Aufklaerung: Nicht alle Vorurteile sind Irrtumer — manche sind legitime Uebertragungen von Tradition, ohne die Verstehen gar nicht moeglich waere."
    ),

    // ── Rezeptionsaesthetik (5) ───────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff pragte Hans Robert Jauss fuer die Summe literarischer und sozialer Erwartungen, die Leser an einen Text herantragen?",
        answerA = "Leerstelle",
        answerB = "Impliziter Leser",
        answerC = "Erwartungshorizont",
        answerD = "Asthetische Distanz",
        correctAnswer = 2,
        explanation = "Jauss entwickelte den Begriff 'Erwartungshorizont' fuer die Summe der literarischen und lebensweltlichen Erwartungen, die Leser einer bestimmten Zeit an einen Text richten. Ein grosser 'asthetischer Abstand' zwischen Text und Erwartungshorizont kennzeichnet literarische Innovation.",
        difficulty = 4,
        funFact = "Jauss hielt seine programmatische Antrittsvorlesung 'Literaturgeschichte als Provokation der Literaturwissenschaft' 1967 in Konstanz — sie gilt als Gruendungsdokument der Konstanzer Schule."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Wolfgang Iser mit dem Begriff der 'Leerstelle' im literarischen Text?",
        answerA = "Druckfehler und Luecken in ueberlieferten Handschriften",
        answerB = "Fehlende Kapitel in fragmentarisch erhaltenen Werken",
        answerC = "Offene Stellen im Text, die der Leser durch Imagination aktiv fuellen muss",
        answerD = "Implizite Verweise auf andere Texte, die der Leser kennen muss",
        correctAnswer = 2,
        explanation = "Isers 'Leerstellen' und 'Unbestimmtheiten' sind Stellen im Text, die nicht explizit ausformuliert sind und den Leser zu aktiver Bedeutungsproduktion einladen. Ohne Leerstellen gaebe es kein kreatives Lesen — der Text waere vollstaendig und liesse keinen Spielraum.",
        difficulty = 4,
        funFact = "Iser nennt als Beispiel die ueberraschende Handlung einer Romanfigur: Der Text liefert keine Erklaerung — der Leser muss eine konstruieren. Je mehr Leerstellen, desto aktiver die Lektuere."
    ),
    Question(
        categoryId = 10,
        questionText = "An welcher Universitaet war die 'Konstanzer Schule' der Rezeptionsaesthetik institutionell verankert?",
        answerA = "Universitaet Freiburg",
        answerB = "Universitaet Tuebingen",
        answerC = "Freie Universitaet Berlin",
        answerD = "Universitaet Konstanz",
        correctAnswer = 3,
        explanation = "Die 'Konstanzer Schule' entstand an der neu gegruendeten Universitaet Konstanz, wo Hans Robert Jauss und Wolfgang Iser ab Ende der 1960er Jahre lehrten. Ihr Ansatz pragte die Literaturwissenschaft international unter dem Begriff 'Reader-Response-Criticism'.",
        difficulty = 4,
        funFact = "Die Universitaet Konstanz wurde 1966 als Reformuniversitaet gegruendet — konzipiert als intellektuelles Labor ohne Hierarchien. Diese Atmosphaere beguenstigte die Entstehung der Rezeptionsaesthetik."
    ),
    Question(
        categoryId = 10,
        questionText = "Was unterscheidet Isers 'impliziten Leser' von einem realen oder empirischen Leser?",
        answerA = "Der implizite Leser ist eine Textstruktur, die die Rezeptionshaltung eines idealen Lesers vorschreibt",
        answerB = "Der implizite Leser ist der Durchschnittsleser laut empirischen Umfragen",
        answerC = "Der implizite Leser ist der historische Erstleser des Textes",
        answerD = "Der implizite Leser ist identisch mit dem Erzaehler in der Diegese",
        correctAnswer = 0,
        explanation = "Isers 'impliziter Leser' ist keine reale Person, sondern eine im Text angelegte Struktur: die Gesamtheit der Orientierungsangebote, die ein Text seinem Leser macht. Er beschreibt, welche Lektuerehaltung der Text 'fordert' — unabhaengig von empirischen Lesern.",
        difficulty = 4,
        funFact = "Seymour Chatman pragte parallel den Begriff 'implied reader', Wayne Booth den des 'ideal reader'. Die terminologische Unschaerfe zeigt, wie fruchtbar — und streitbar — das Konzept in der Erzaehltheorie war."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche Methode schlaegt Jauss vor, um den historischen Erwartungshorizont eines Textes zu rekonstruieren?",
        answerA = "Textimmanente Analyse der sprachlichen Oberflaeche",
        answerB = "Befragung zeitgenoessischer Leser per Umfrage",
        answerC = "Auswertung von Rezensionen, Gattungskonventionen und zeitgenoessischen Texten",
        answerD = "Biographische Analyse des Autorenlebens",
        correctAnswer = 2,
        explanation = "Jauss schlaegt vor, den historischen Erwartungshorizont durch Auswertung von Zeitrezensionen, Gattungsregeln, literarischen Polemiken und dem Vergleich mit zeitgenoessischen Texten zu rekonstruieren. So laesst sich der 'asthetische Abstand' eines Werkes historisch messen.",
        difficulty = 4,
        funFact = "Jauss' Methode wurde fuer Cervantes' 'Don Quijote' angewendet: Im Kontext der Ritterromane war der Erwartungshorizont klar — Quijotes Parodie verletzte und vervielfaeltigte ihn zugleich."
    ),

    // ── Dekonstruktion (5) ────────────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Jacques Derridas Begriff 'Differance' (mit 'a' statt 'e')?",
        answerA = "Ein Kunstwort, das 'unterscheiden' und 'aufschieben' verbindet und die Instabilitaet von Bedeutung bezeichnet",
        answerB = "Den franzosischen Begriff fuer kulturelle Differenz",
        answerC = "Die Verschiedenheit von geschriebener und gesprochener Sprache",
        answerD = "Den Unterschied zwischen Denotation und Konnotation im Text",
        correctAnswer = 0,
        explanation = "Derridas 'differance' verbindet zwei Bedeutungen des franzosischen 'differer': unterscheiden und aufschieben. Bedeutung entsteht nie als prasente Einheit, sondern nur durch Differenz zu anderen Zeichen und wird stets auf weitere Zeichen verschoben.",
        difficulty = 4,
        funFact = "Das 'a' in 'differance' statt 'e' ist im Franzosischen nur schriftlich erkennbar, nicht hoerbar — Derrida demonstriert damit selbst die Differenz von Schrift und Laut, die er theoretisch behauptet."
    ),
    Question(
        categoryId = 10,
        questionText = "Was kritisiert Derrida mit dem Begriff 'Logozentrismus'?",
        answerA = "Die Ueberbewertung formaler Logik in der Philosophie des 20. Jahrhunderts",
        answerB = "Die abendlaendische Tradition, die Schrift der Sprache unterzuordnen und den Logos als Ursprung von Bedeutung zu setzen",
        answerC = "Die Dominanz analytischer Philosophie gegenueber der Hermeneutik",
        answerD = "Den Eurozentrismus in der komparatistischen Literaturwissenschaft",
        correctAnswer = 1,
        explanation = "Derrida kritisiert, dass die westliche Philosophie seit Platon die Sprache (Logos, Praesenz, Stimme) ueber die Schrift stellt. Dieser 'Phonozentrismus' ist Teil eines umfassenden Logozentrismus, der Praesenz, Ursprung und Identitaet bevorzugt und Differenz unterdrueckt.",
        difficulty = 4,
        funFact = "Derridas Grammatologie beginnt mit der Analyse, warum die Schrift in der Philosophie stets als 'Supplement', als blosser Ersatz fuer Sprache, abgewertet wurde — und zeigt, dass sie in Wahrheit die Sprache selbst konstituiert."
    ),
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschienen Derridas drei Schluesseltexte, die die Dekonstruktion begruendeten?",
        answerA = "1966",
        answerB = "1962",
        answerC = "1972",
        answerD = "1967",
        correctAnswer = 3,
        explanation = "1967 erschienen Derridas drei Schluesseltexte: 'De la grammatologie', 'L'ecriture et la difference' und 'La voix et le phenomene'. Sie begruendeten die Dekonstruktion als philosophisch-literaturtheoretisches Programm und verschafften Derrida internationale Resonanz.",
        difficulty = 4,
        funFact = "Derrida war algerischer Herkunft und studierte an der Ecole Normale Superieure unter u.a. Louis Althusser. Seine Kritik am Eurozentrismus ist also auch biographisch grundiert."
    ),
    Question(
        categoryId = 10,
        questionText = "Was ist nach der Dekonstruktion das Ziel der Textlektuere?",
        answerA = "Die Rekonstruktion der Autorintention durch philologische Methoden",
        answerB = "Die Entdeckung der strukturalen Tiefengrammatik des Textes",
        answerC = "Das Aufdecken innerer Widerspruche und Aporien, die die Ordnung des Textes unterlaufen",
        answerD = "Die Identifikation des Textes mit einem historischen Gattungsmodell",
        correctAnswer = 2,
        explanation = "Dekonstruktive Lektuere sucht nicht nach der 'richtigen' Bedeutung, sondern nach den Stellen, wo der Text seinen eigenen Anspruch unterlauft: Widerspruche, Aporien, Randfiguren, die das Zentrum destabilisieren. Der Text dekonstruiert sich selbst.",
        difficulty = 4,
        funFact = "Paul de Man zeigte in 'Allegories of Reading', dass rhetorische und grammatische Lesarten von Texten stets miteinander kollidieren — Literatur ist ihrer Natur nach aporetisch."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche literaturtheoretische Schule entwickelte sich in den USA als Rezeption von Derridas Dekonstruktion, vertreten durch Paul de Man und Geoffrey Hartman?",
        answerA = "New Historicism",
        answerB = "Yale-Schule der Dekonstruktion",
        answerC = "Chicago School of Criticism",
        answerD = "Postkoloniale Theorie",
        correctAnswer = 1,
        explanation = "Die Yale-Schule (Paul de Man, Geoffrey Hartman, J. Hillis Miller, Harold Bloom) entwickelte in den 1970er/80er Jahren eine US-amerikanische Variante der Dekonstruktion, mit staerkerem Fokus auf Rhetorik und Tropen.",
        difficulty = 4,
        funFact = "Harold Bloom galt als Aussenseiter der Yale-Schule: Sein Konzept der 'Einflussangst' (anxiety of influence) verbindet Dekonstruktion mit Psychoanalyse, bleibt aber dem kanonischen Werk verpflichtet."
    ),

    // ── Semiotik (5) ─────────────────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Charles Sanders Peirce unterscheidet drei Zeichentypen. Welche Relation verbindet beim 'Index' das Zeichen mit seinem Objekt?",
        answerA = "Existenzielle Kontiguitat (kausale oder physische Verbindung)",
        answerB = "Konvention (willkuerliche Setzung)",
        answerC = "Aehnlichkeit (ikonische Beziehung)",
        answerD = "Metaphorische Uebertragung (Analogiebeziehung)",
        correctAnswer = 0,
        explanation = "Beim Index steht das Zeichen in einer existenziellen, kausalen oder raeumlichen Beziehung zu seinem Objekt. Rauch ist ein Index fuer Feuer; ein Fingerabdruck ist ein Index fuer den Taeter. Das Symbol beruht auf Konvention, das Ikon auf Aehnlichkeit.",
        difficulty = 4,
        funFact = "In der Literaturwissenschaft wird Peirces Zeichentypologie fuer Symbolanalyse genutzt: Die Rose als Symbol (Konvention), ein Foto als Ikon, ein Datum als Index — alle koennen in einem einzigen Text zusammenwirken."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Peirce unter dem Begriff 'Semiose'?",
        answerA = "Den abgeschlossenen Ubersetzungsprozess eines Zeichens in seine Bedeutung",
        answerB = "Die historische Herausbildung eines kulturellen Zeichensystems",
        answerC = "Den Ubertragungskanal zwischen Sender und Empfaenger in der Kommunikation",
        answerD = "Den unabschliesslichen Prozess der Zeicheninterpretation, in dem jedes Interpretant zum neuen Zeichen wird",
        correctAnswer = 3,
        explanation = "Semiose bezeichnet fuer Peirce den dynamischen, unabschliesslichen Prozess, in dem ein Zeichen einen Interpretanten erzeugt, der selbst wieder ein Zeichen ist, das einen neuen Interpretanten erzeugt — und so fort. Bedeutung ist kein Zustand, sondern ein Prozess.",
        difficulty = 4,
        funFact = "Umberto Eco bezeichnet diesen endlosen Interpretationsprozess als 'unbegrenzte Semiose' und warnt zugleich vor einer 'hermeneutischen Drift', bei der jede Interpretation beliebig wird."
    ),
    Question(
        categoryId = 10,
        questionText = "Umberto Eco unterscheidet 'geschlossene' von 'offenen' Werken. Was kennzeichnet ein 'offenes Werk' (opera aperta)?",
        answerA = "Ein Werk ohne klare Gattungszugehoerigkeit oder Autorschaft",
        answerB = "Ein Werk, das strukturell mehrere gleich legitime Interpretationen einlaed",
        answerC = "Ein Werk, das absichtlich unvollendet blieb und posthum herausgegeben wurde",
        answerD = "Ein Werk, das programmatisch alle literarischen Konventionen verwirft",
        correctAnswer = 1,
        explanation = "Eco beschreibt in 'Opera aperta' (1962) Werke, die durch ihre Struktur mehrere gleichwertige Interpretationen einladen, ohne sich auf eine festzulegen. Der Leser wird zum aktiven Mitproduzenten. Eco grenzt das 'offene' vom 'geschlossenen' Werk ab, das eine Lektuere bevorzugt.",
        difficulty = 4,
        funFact = "Eco bezieht sich auf Weberns Musik, Joyces 'Finnegans Wake' und Brechts Theater. Ironischerweise schrieb er selbst Romane wie 'Der Name der Rose', die er als verhaeltnismaessig 'geschlossener' einschaetzte."
    ),
    Question(
        categoryId = 10,
        questionText = "Welche Unterscheidung trifft Eco zwischen 'Kode' und 'Subkode' in seiner Theorie der kulturellen Codes?",
        answerA = "Kodes sind allgemeine Zeichensysteme; Subkodes sind spezifischere Regeln innerhalb eines Kodes fuer besondere Kontexte",
        answerB = "Kodes sind universell, Subkodes sind sprachspezifisch",
        answerC = "Kodes existieren nur in der Sprache; Subkodes gelten fuer nicht-sprachliche Zeichen",
        answerD = "Kodes sind bewusste Konventionen; Subkodes sind unbewusste Muster",
        correctAnswer = 0,
        explanation = "Eco unterscheidet Kode (das allgemeine System, z.B. die Sprache) von Subkode (einem spezifischeren Regelsystem innerhalb des Kodes fuer bestimmte Kontexte, z.B. den Subkode des Liebesromans). Subkodes steuern die konnotative Bedeutung von Texten.",
        difficulty = 4,
        funFact = "Ecos 'Trattato di semiotica generale' (1975) ist der Versuch, eine umfassende Theorie aller Zeichenprozesse in Kultur und Kommunikation zu entwickeln — anknuepfend an Saussures Traum einer allgemeinen Semiologie."
    ),
    Question(
        categoryId = 10,
        questionText = "Julia Kristeva entwickelte den Begriff der 'Intertextualitaet'. Auf welcher Theorie basiert er theoretisch?",
        answerA = "Auf Genettes Konzept der Hypertextualitaet",
        answerB = "Auf Bachtins Theorie der Dialogizitaet und Polyphonie",
        answerC = "Auf Derridas Begriff der Differance",
        answerD = "Auf Saussures Theorie des arbitraeren Zeichens",
        correctAnswer = 1,
        explanation = "Kristeva entwickelte den Begriff 'Intertextualitaet' in den 1960ern auf Basis von Bachtins Dialogizitaetstheorie: Jeder Text ist ein Mosaik von Zitaten und Transformationen anderer Texte. Sie radikalisierte Bachtins Dialogizitaet zu einer semiotischen Theorie des Textes.",
        difficulty = 4,
        funFact = "Kristevas Begriff wurde vielfach vereinfacht rezipiert — oft meint 'Intertextualitaet' heute nur das Zitieren. Kristeva meinte etwas Radikaleres: Kein Text hat einen Ursprung; alle Texte sind Transformationen anderer Texte."
    ),

    // ── New Criticism (4) ─────────────────────────────────────────────────────
    Question(
        categoryId = 10,
        questionText = "Was bezeichnen W.K. Wimsatt und Monroe Beardsley mit dem Begriff 'Intentional Fallacy'?",
        answerA = "Den Irrtum, einen Text ausschliesslich nach seiner Wirkung auf den Leser zu beurteilen",
        answerB = "Die Neigung der Leser, Texte allegorisch zu deuten",
        answerC = "Den Irrtum, einen Text ausserhalb seines historischen Kontexts zu lesen",
        answerD = "Den Fehler, die Bedeutung eines Textes aus der Intention des Autors ableiten zu wollen",
        correctAnswer = 3,
        explanation = "Die 'Intentional Fallacy' (Aufsatz 1946) besagt, dass die Absicht des Autors kein valider Massstab zur Beurteilung eines literarischen Werkes ist. Das Werk ist autonom: Seine Bedeutung entsteht aus dem Text selbst, nicht aus dem, was der Autor 'gemeint' hat.",
        difficulty = 4,
        funFact = "Wimsatt und Beardsley formulierten damit das Kernprogramm des New Criticism: Der Text als autarkes Objekt, befreit von Autor und Leser — ein Idealbild, das die Literaturkritik des 20. Jahrhunderts pragte."
    ),
    Question(
        categoryId = 10,
        questionText = "Was beschreibt die 'Affective Fallacy' nach Wimsatt und Beardsley (1949)?",
        answerA = "Den Fehler, emotionale Authentizitaet als Qualitaetsmassstab fuer Lyrik zu verwenden",
        answerB = "Die Tendenz romantischer Kritiker, Gefuehl ueber Verstand zu stellen",
        answerC = "Den Irrtum, ein Werk nach seinen emotionalen Wirkungen auf den Leser statt nach seinen inneren Qualitaeten zu beurteilen",
        answerD = "Den Fehler, Fiktion mit der Wirklichkeit des Autors zu verwechseln",
        correctAnswer = 2,
        explanation = "Die 'Affective Fallacy' bezeichnet den Fehler, ein literarisches Werk nach seiner emotionalen Wirkung auf den Leser zu beurteilen. Wimsatt und Beardsley argumentieren, dass subjektive Wirkung ebenso wenig ein Massstab ist wie die Autorintention.",
        difficulty = 4,
        funFact = "Diese beiden 'Fallacies' grenzten den New Criticism von zwei Seiten ab: gegen biographische Kritik (Autor) und gegen Wirkungsaesthetik (Leser). Ironischerweise bereiteten sie so den Boden fuer die Rezeptionsaesthetik."
    ),
    Question(
        categoryId = 10,
        questionText = "Welcher New-Criticism-Theoretiker zeigte in 'Seven Types of Ambiguity' (1930), dass Mehrdeutigkeit die eigentliche poetische Energie eines Textes ist?",
        answerA = "William Empson",
        answerB = "Cleanth Brooks",
        answerC = "I.A. Richards",
        answerD = "John Crowe Ransom",
        correctAnswer = 0,
        explanation = "William Empsons 'Seven Types of Ambiguity' (1930) gilt als Vorlaeuferin des New Criticism. Empson zeigt, wie Mehrdeutigkeit nicht ein Fehler, sondern die eigentliche poetische Energie des Textes ist — eine Erkenntnis, die den New Criticism stark pragte.",
        difficulty = 4,
        funFact = "Empson schrieb 'Seven Types of Ambiguity' als Student bei I.A. Richards in Cambridge. Richards soll das Manuskript so beeindruckend gefunden haben, dass er Empson unmittelbar zur Publikation ermutigte."
    ),
    Question(
        categoryId = 10,
        questionText = "Welcher New-Criticism-Theoretiker pragte das Konzept des 'well-wrought urn' als Metapher fuer das autonome Kunstwerk?",
        answerA = "T.S. Eliot",
        answerB = "I.A. Richards",
        answerC = "Cleanth Brooks",
        answerD = "John Crowe Ransom",
        correctAnswer = 2,
        explanation = "Cleanth Brooks verwendete in 'The Well Wrought Urn: Studies in the Structure of Poetry' (1947) die Metapher der 'wohlgearbeiteten Urne' (nach Keats) fuer das autonome Kunstwerk, das in sich selbst vollstaendig und sinnhaft ist — ohne Verweis auf Autor oder aussertextliche Realitaet.",
        difficulty = 4,
        funFact = "Brooks analysiert zehn Gedichte von Donne bis Keats und zeigt jeweils, wie Paradoxon und Ironie die strukturale Grundlage grosser Dichtung bilden — eine Lektuere, die noch heute als Modell des Close Reading gilt."
    ),

    // ── Poststrukturalismus & Weitere Theorien (9) ───────────────────────────
    Question(
        categoryId = 10,
        questionText = "Was versteht Michel Foucault in 'Was ist ein Autor?' (1969) unter der 'Autor-Funktion'?",
        answerA = "Die biographische Person, die einen Text verfasst hat",
        answerB = "Eine diskursive Funktion, die bestimmte Texte klassifiziert, bewertet und ihren Umlauf reguliert",
        answerC = "Das Pseudonym, unter dem ein Autor schreibt",
        answerD = "Die Instanz, die den Leser im Text anspricht",
        correctAnswer = 1,
        explanation = "Foucault argumentiert, dass 'Autor' keine naturliche Entitaet, sondern eine diskursive Funktion ist: Der Autorname klassifiziert Texte, verleiht ihnen Autoritaet und reguliert ihren Umlauf in einer Gesellschaft. Die Autor-Funktion ist historisch variabel und kulturell konstruiert.",
        difficulty = 4,
        funFact = "Foucaults Frage 'Was ist ein Autor?' endet mit einer utopischen Vision: 'Was tut es, wer spricht?' — in einer Gesellschaft, in der Diskurse unabhaengig von Ursprung und Autorschaft zirkulieren."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Michail Bachtin mit dem Begriff der 'Dialogizitaet' in Bezug auf den Roman?",
        answerA = "Die Eigenschaft des Romans, mehrere soziale Sprachen und Bewusstseine unabgeschlossen nebeneinander zu fuehren",
        answerB = "Die direkte Rede von Figuren im Dialog",
        answerC = "Die Wechselwirkung von Autor und Leser im Leseprozess",
        answerD = "Das Gespraech zwischen verschiedenen Nationalliteraturen",
        correctAnswer = 0,
        explanation = "Bachtin versteht Dialogizitaet als fundamentale Eigenschaft des Romans: Im Roman treffen verschiedene soziale Sprachen (Heteroglossie), Bewusstseine und Wertehorizonte aufeinander, ohne dass einer dominiert. Das unterscheidet den Roman grundlegend von der Lyrik.",
        difficulty = 4,
        funFact = "Bachtins Konzept der Polyphonie entwickelte er vor allem an Dostojewskis Romanen: In 'Schuld und Suehne' stehen Raskolnikow und seine Gegenuebers gleichwertig einander gegenueber — keiner hat das letzte Wort."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Bachtin mit dem Begriff der 'Karnevalisierung der Literatur'?",
        answerA = "Die Einfuehrung von Festtagsszenen in ernste literarische Werke",
        answerB = "Den Einfluss des volkstuemlichen Theaters auf die Romangattung",
        answerC = "Die Darstellung von Carnevalsfesten in der mittelalterlichen Literatur",
        answerD = "Die Subversion sozialer Hierarchien und offizieller Diskurse durch das Lachen und die Volkskultur",
        correctAnswer = 3,
        explanation = "Bachtin zeigt in 'Rabelais und seine Welt' (1965), wie die Volkskultur des Karnevals mit Kehrung der Hierarchien, Lachen und Koerperlichkeit in die Hochliteratur einfliesst. Karnevalisierung unterlaeuft ernste, offizielle Diskurse durch Groteske und Ambivalenz.",
        difficulty = 4,
        funFact = "Bachtins 'Rabelais'-Buch wurde 1940 als Dissertation eingereicht, aber von sowjetischen Gutachtern abgelehnt. Es erschien erst 1965 — 25 Jahre spaeter — und wurde zum Grundlagentext der Kulturwissenschaften."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Roman Jakobson unter der 'poetischen Funktion' der Sprache in seinem Kommunikationsmodell?",
        answerA = "Die Funktion von Sprache, Schoenes zu beschreiben",
        answerB = "Die emotionale Funktion der Sprache, die den Sprecher ausdruckt",
        answerC = "Die Ausrichtung der Botschaft auf sich selbst, wobei die Ausdrucksform zum Inhalt wird",
        answerD = "Die konative Funktion, die den Empfaenger zu einer Handlung auffordert",
        correctAnswer = 2,
        explanation = "In Jakobsons Kommunikationsmodell (1960) bezeichnet die poetische Funktion die Ausrichtung auf die Botschaft selbst: Wie etwas gesagt wird, tritt in den Vordergrund gegenueber was gesagt wird. Die poetische Funktion projiziert Aequivalenz von der Achse der Selektion auf die Achse der Kombination.",
        difficulty = 4,
        funFact = "Jakobsons Kommunikationsmodell mit 6 Faktoren (Sender, Empfaenger, Botschaft, Kontext, Kontakt, Kode) und 6 Funktionen ist bis heute ein Standardmodell in der Linguistik und Kommunikationswissenschaft."
    ),
    Question(
        categoryId = 10,
        questionText = "Welches Konzept entwickelte Gadamer in 'Wahrheit und Methode', das die Praegewirkung der Ueberlieferungsgeschichte auf jeden Interpreten beschreibt?",
        answerA = "Daseinsanalytik",
        answerB = "Entschlossenheit",
        answerC = "Geworfenheit",
        answerD = "Wirkungsgeschichtliches Bewusstsein",
        correctAnswer = 3,
        explanation = "Gadamers 'wirkungsgeschichtliches Bewusstsein' beschreibt, dass jedes Verstehen eines Textes durch die Geschichte seiner Wirkungen auf den Interpreten gepraegt ist. Vollstaendige Distanz zur Ueberlieferung ist weder moeglich noch wuenschenswert.",
        difficulty = 4,
        funFact = "Gadamers Konzept wendet sich gegen den Anspruch der Aufklaerung, alle Vorurteile durch Vernunft auszuschalten. Vorverstaendnisse sind fuer Gadamer konstitutiv fuer jedes Verstehen."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Paul Ricoeur mit dem Begriff der 'narrativen Identitaet'?",
        answerA = "Die Identitaet des Erzaehlers innerhalb einer Erzaehlung",
        answerB = "Die Identitaet einer Person, die sich durch das Erzaehlen ihres Lebens konstituiert",
        answerC = "Die Identifikation des Lesers mit der Hauptfigur",
        answerD = "Die konsistente Erzaehlperspektive eines Autors ueber sein Gesamtwerk",
        correctAnswer = 1,
        explanation = "Ricoeur entwickelt in 'Soi-meme comme un autre' (1990) das Konzept der narrativen Identitaet: Personale Identitaet entsteht dadurch, dass ein Mensch sein Leben in Erzaehlform zusammenfasst. Wir sind die Geschichten, die wir uns ueber uns selbst erzaehlen.",
        difficulty = 4,
        funFact = "Ricoeurs Konzept verbindet Hermeneutik, Narratologie und Ethik. Es wurde in der Psychologie aufgegriffen (Narrative Therapie) und in der Identitaetsforschung zur Grundlage eines eigenen Forschungsfeldes."
    ),
    Question(
        categoryId = 10,
        questionText = "Was versteht Harold Bloom mit dem Begriff der 'Einflussangst' (anxiety of influence)?",
        answerA = "Die Angst des Lesers vor zu umfangreichen, unangemessenen Werken",
        answerB = "Die Befuerchtung, einem literarischen Einfluss bewusst nicht zu erkennen",
        answerC = "Den psychologischen Kampf eines Dichters gegen die Uebermacht seiner maessgeblichen Vorgaenger",
        answerD = "Den institutionellen Druck auf Autoren, kommerziell erfolgreiche Literatur zu schreiben",
        correctAnswer = 2,
        explanation = "Harold Blooms 'The Anxiety of Influence' (1973) beschreibt, wie staerke Dichter gegen ihre Vorgaenger kaempfen: durch kreative Fehllesungen ('misreadings'), die den Vorgaenger verzerren und so Platz fuer eigene Originalitaet schaffen. Literaturgeschichte ist demnach ein oedipaler Kampf.",
        difficulty = 4,
        funFact = "Bloom nennt diesen kreativen Fehllesungsprozess 'Clinamen' (nach Lukrez): Der neue Dichter swerves vom Vorgaenger ab — eine notwendige Abweichung, um als eigene Stimme existieren zu koennen."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Gerard Genette mit dem Begriff 'Paratext'?",
        answerA = "Den Zwischenraum zweier Texte bei intertextuellen Verweisen",
        answerB = "Die implizite Bedeutungsebene unterhalb der manifesten Textebene",
        answerC = "Alles, was einen Text umgibt und einrahmt (Titel, Vorwort, Klappentexte, Fussnoten)",
        answerD = "Die metatextuelle Reflexion eines Textes ueber seine eigene Entstehung",
        correctAnswer = 2,
        explanation = "Genette definiert 'Paratext' in 'Seuils' (1987) als alles, was einen Text umgibt und ihn zu einem Buch macht: Titel, Untertitel, Widmung, Vorwort, Klappentexte, Fussnoten, Abbildungen. Der Paratext ist der 'Schwellenwert', der den Zugang zum Text reguliert.",
        difficulty = 4,
        funFact = "Genette unterscheidet 'Peritext' (im Buch selbst: Titel, Vorworte) von 'Epitext' (ausserhalb: Interviews, Briefwechsel des Autors). Beide gehoeren zum Paratext und beeinflussen, wie wir den Text lesen."
    ),
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet das Konzept des 'New Historicism' (Stephen Greenblatt) in der Literaturwissenschaft?",
        answerA = "Die Rueckkehr zu positivistischer Quellenkritik und historischer Philologie",
        answerB = "Die universalgeschichtliche Betrachtung von Weltliteratur ohne nationalen Fokus",
        answerC = "Die Anwendung marxistischer Geschichtsphilosophie auf die Literaturgeschichte",
        answerD = "Die Interpretation literarischer Texte als Teil eines Netzwerks sozialer Kraefte und Diskurse ihrer Zeit",
        correctAnswer = 3,
        explanation = "Der New Historicism (Greenblatt, 1980er) betrachtet literarische Texte als Teil eines zirkulierenden Netzwerks sozialer Energien und Diskurse. Literatur ist nicht ausserhalb der Geschichte, sondern konstituiert diese mit — und wird von ihr konstituiert.",
        difficulty = 4,
        funFact = "Greenblatts bekanntestes Werk 'Shakespearean Negotiations' (1988) liest Shakespeare nicht als autonomen Genius, sondern als Knoten in einem Netz von fruehneuzeitlichen Machtkonflikten, Ritualen und Oekonomien."
    )
)
