package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsEasy3(): List<Question> = listOf(

    // ── Shakespeare ──────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "In welcher Stadt spielt Shakespeares 'Romeo und Julia'?",
        answerA = "Florenz",
        answerB = "Venedig",
        answerC = "Verona",
        answerD = "Mailand",
        correctAnswer = 2,
        explanation = "Shakespeares Liebestragödie 'Romeo und Julia' spielt in Verona, einer Stadt im Norden Italiens.",
        difficulty = 1,
        funFact = "Verona hat heute einen Balkon, der offiziell als 'Julias Balkon' gilt und jährlich tausende Touristen anzieht."
    ),

    Question(
        categoryId = 10,
        questionText = "Welchen berühmten Satz spricht Hamlet in Shakespeares gleichnamigem Theaterstück?",
        answerA = "Sein oder Nichtsein, das ist hier die Frage.",
        answerB = "Wer zuletzt lacht, lacht am besten.",
        answerC = "Alle Welt ist eine Bühne.",
        answerD = "Der Rest ist Schweigen.",
        correctAnswer = 0,
        explanation = "'Sein oder Nichtsein, das ist hier die Frage' ist eines der bekanntesten Zitate der Weltliteratur und stammt aus Shakespeares Tragödie 'Hamlet'.",
        difficulty = 1,
        funFact = "Im englischen Original lautet der Satz: 'To be, or not to be, that is the question.'"
    ),

    Question(
        categoryId = 10,
        questionText = "Welche beiden verfeindeten Familien stehen im Mittelpunkt von 'Romeo und Julia'?",
        answerA = "Capulet und Montague",
        answerB = "Tudor und Stuart",
        answerC = "Medici und Borgia",
        answerD = "Visconti und Sforza",
        correctAnswer = 0,
        explanation = "Die Familien Capulet und Montague sind die rivalisierenden Adelsfamilien, deren Fehde Romeo und Julias tragische Liebesgeschichte beendet.",
        difficulty = 1,
        funFact = "Shakespeare basierte sein Stück auf einer älteren italienischen Erzählung von Matteo Bandello aus dem Jahr 1554."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer ist der Geist, der Hamlet in Shakespeares Stück erscheint?",
        answerA = "Sein Vater",
        answerB = "Sein Onkel Claudius",
        answerC = "Sein Freund Horatio",
        answerD = "Seine Mutter Gertrude",
        correctAnswer = 0,
        explanation = "Der Geist von Hamlets ermordeten Vater erscheint ihm und fordert ihn auf, seinen Tod zu rächen. Claudius, Hamlets Onkel, hatte den König vergiftet.",
        difficulty = 1,
        funFact = "In Shakespeares Zeit glaubten die Menschen ernsthaft an Geister — das Stück spielte also mit echten Ängsten des Publikums."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das Stück 'Ein Sommernachtstraum' von Shakespeare?",
        answerA = "Eine romantische Komödie mit Feen und Zauber",
        answerB = "Eine Tragödie über einen verratenen König",
        answerC = "Ein historisches Drama über König Heinrich",
        answerD = "Eine dunkle Geschichte über Verrat und Mord",
        correctAnswer = 0,
        explanation = "'Ein Sommernachtstraum' ist eine romantische Komödie von Shakespeare, in der Feen, Zauberei und verwirrte Liebespaare im Wald eine komische Geschichte erleben.",
        difficulty = 1,
        funFact = "Der Feenkönig Oberon und seine Gattin Titania sowie der Kobold Puck sind die bekanntesten Figuren aus diesem Stück."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer tötet König Duncan in Shakespeares 'Macbeth'?",
        answerA = "Macduff",
        answerB = "König Duncan selbst",
        answerC = "Macbeth",
        answerD = "Malcolm",
        correctAnswer = 2,
        explanation = "Macbeth ermordet König Duncan, um selbst König zu werden. Angestachelt von seiner Frau Lady Macbeth und den Prophezeiungen der Hexen begeht er diesen Verrat.",
        difficulty = 1,
        funFact = "Viele Schauspieler nennen 'Macbeth' das 'verfluchte Stück' und sprechen seinen Namen backstage nie laut aus."
    ),

    Question(
        categoryId = 10,
        questionText = "In welchem Shakespeare-Stück spielt der Mohr von Venedig die Hauptrolle?",
        answerA = "König Lear",
        answerB = "Der Sturm",
        answerC = "Othello",
        answerD = "Viel Lärm um nichts",
        correctAnswer = 2,
        explanation = "Othello ist der Titelheld von Shakespeares gleichnamiger Tragödie. Er wird durch die Lügen des bösartigen Iago in eifersüchtigen Wahn getrieben.",
        difficulty = 1,
        funFact = "Iago gilt als einer der meistgespielten Bösewichte der Theatergeschichte — viele Schauspieler träumen davon, diese Rolle zu spielen."
    ),

    // ── Charles Dickens ──────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Oliver Twist'?",
        answerA = "Mark Twain",
        answerB = "Victor Hugo",
        answerC = "Charles Dickens",
        answerD = "Arthur Conan Doyle",
        correctAnswer = 2,
        explanation = "Charles Dickens schrieb 'Oliver Twist', der Geschichte eines Waisenkindes im viktorianischen England. Das Buch erschien 1837–1839.",
        difficulty = 1,
        funFact = "Dickens schrieb 'Oliver Twist' ursprünglich als Fortsetzungsgeschichte in einem Magazin, Kapitel für Kapitel."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer ist der Hauptcharakter in Dickens' 'Eine Weihnachtsgeschichte'?",
        answerA = "Bob Cratchit",
        answerB = "Tiny Tim",
        answerC = "Ebenezer Scrooge",
        answerD = "Jacob Marley",
        correctAnswer = 2,
        explanation = "Ebenezer Scrooge ist der geizige alte Mann, der in 'Eine Weihnachtsgeschichte' von drei Weihnachtsgeistern besucht wird und sein Leben ändert.",
        difficulty = 1,
        funFact = "Das Wort 'Scrooge' ist im Englischen heute ein gebräuchlicher Begriff für einen Geizkragen."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie viele Weihnachtsgeister besuchen Scrooge in Dickens' Geschichte?",
        answerA = "Zwei",
        answerB = "Drei",
        answerC = "Vier",
        answerD = "Fünf",
        correctAnswer = 1,
        explanation = "Scrooge wird von drei Weihnachtsgeistern besucht: dem Geist der vergangenen Weihnacht, der gegenwärtigen Weihnacht und der zukünftigen Weihnacht.",
        difficulty = 1,
        funFact = "Dickens schrieb 'Eine Weihnachtsgeschichte' in nur sechs Wochen, und das Buch wurde zu einem der einflussreichsten Weihnachtstexte aller Zeiten."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt das Buch von Charles Dickens, das sein eigenes Leben am stärksten widerspiegelt?",
        answerA = "Große Erwartungen",
        answerB = "Bleakhaus",
        answerC = "David Copperfield",
        answerD = "Dombey und Sohn",
        correctAnswer = 2,
        explanation = "'David Copperfield' gilt als Dickens' autobiografischstes Werk. Viele Episoden aus dem Leben des Helden spiegeln Dickens' eigene Kindheit und Jugend wider.",
        difficulty = 1,
        funFact = "Dickens selbst nannte David Copperfield sein 'Lieblingskind' unter allen seinen Büchern."
    ),

    // ── J.R.R. Tolkien ───────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Hobbit in Tolkiens Roman 'Der Hobbit'?",
        answerA = "Frodo Beutlin",
        answerB = "Bilbo Beutlin",
        answerC = "Samweis Gamdschie",
        answerD = "Peregrin Tuk",
        correctAnswer = 1,
        explanation = "Bilbo Beutlin ist der Hauptcharakter in Tolkiens Roman 'Der Hobbit'. Er bricht mit dem Zauberer Gandalf und dreizehn Zwergen auf ein Abenteuer auf.",
        difficulty = 1,
        funFact = "Tolkien erfand den ersten Satz von 'Der Hobbit' angeblich spontan beim Korrigieren von Studentenarbeiten: 'In einem Loch im Boden, da lebte ein Hobbit.'"
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Ring in Tolkiens 'Der Herr der Ringe', den Frodo vernichten muss?",
        answerA = "Der Ring der Macht",
        answerB = "Der Elfenring",
        answerC = "Der Necroring",
        answerD = "Der Schwarze Ring",
        correctAnswer = 0,
        explanation = "Der 'Eine Ring' oder 'Ring der Macht' ist das mächtigste Artefakt in Tolkiens Mittelerde. Frodo muss ihn in den Feuern des Schicksalsberg vernichten.",
        difficulty = 1,
        funFact = "Die Inschrift auf dem Ring lautet auf Schwarzer Sprache: 'Ash nazg durbatulûk' — 'Ein Ring, sie zu knechten.'"
    ),

    Question(
        categoryId = 10,
        questionText = "Wer ist der dunkle Herrscher in Tolkiens 'Der Herr der Ringe'?",
        answerA = "Saruman",
        answerB = "Gollum",
        answerC = "Morgoth",
        answerD = "Sauron",
        correctAnswer = 3,
        explanation = "Sauron ist der dunkle Herrscher Mittelerdes und hat den Ring der Macht erschaffen, um alle anderen Ringe zu beherrschen.",
        difficulty = 1,
        funFact = "Sauron war ursprünglich ein guter Geist (Maia), der von Morgoth, dem ersten dunklen Herrscher, korrumpiert wurde."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie nennt man die kleinen, wohnlichen Wesen, zu denen Bilbo und Frodo gehören?",
        answerA = "Elfen",
        answerB = "Zwerge",
        answerC = "Halblinge",
        answerD = "Gnome",
        correctAnswer = 2,
        explanation = "Hobbits werden auch Halblinge genannt. Sie sind klein, haben behaarte Füße und lieben ein gemütliches Leben mit gutem Essen.",
        difficulty = 1,
        funFact = "Tolkien erfand den Begriff 'Hobbit' selbst — das Wort existierte zuvor in keiner Sprache der Welt."
    ),

    // ── J.K. Rowling / Harry Potter ──────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie heißt die Zauberschule, die Harry Potter besucht?",
        answerA = "Beauxbatons",
        answerB = "Hogwarts",
        answerC = "Durmstrang",
        answerD = "Castelobruxo",
        correctAnswer = 1,
        explanation = "Harry Potter besucht die Hogwarts-Schule für Hexerei und Zauberei, die sich in einem Schloss in Schottland befindet.",
        difficulty = 1,
        funFact = "Hogwarts hat vier Häuser: Gryffindor, Slytherin, Hufflepuff und Ravenclaw — benannt nach den vier Gründern der Schule."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Hauptbösewicht in der Harry-Potter-Reihe?",
        answerA = "Lord Voldemort",
        answerB = "Bellatrix Lestrange",
        answerC = "Dolores Umbridge",
        answerD = "Draco Malfoy",
        correctAnswer = 0,
        explanation = "Lord Voldemort, mit bürgerlichem Namen Tom Riddle, ist der gefährlichste dunkle Zauberer und Hauptantagonist der Harry-Potter-Reihe.",
        difficulty = 1,
        funFact = "Voldemort bedeutet auf Französisch ungefähr 'Flug des Todes' — ein Hinweis auf seine Angst vor dem Tod."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer sind Harrys beste Freunde in der Harry-Potter-Reihe?",
        answerA = "Neville und Luna",
        answerB = "Ginny und Fred",
        answerC = "Seamus und Dean",
        answerD = "Ron und Hermine",
        correctAnswer = 3,
        explanation = "Ron Weasley und Hermine Granger sind Harrys engste Freunde. Zusammen bilden sie ein unzertrennliches Trio, das gemeinsam alle Abenteuer besteht.",
        difficulty = 1,
        funFact = "J.K. Rowling hat zugegeben, dass sie ursprünglich überlegte, Ron und Hermine am Ende nicht zusammenzubringen."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie viele Bücher umfasst die Harry-Potter-Hauptreihe von J.K. Rowling?",
        answerA = "Fünf",
        answerB = "Sieben",
        answerC = "Acht",
        answerD = "Sechs",
        correctAnswer = 1,
        explanation = "Die Harry-Potter-Hauptreihe besteht aus sieben Bänden, vom Stein der Weisen (1997) bis zu den Heiligtümern des Todes (2007).",
        difficulty = 1,
        funFact = "Die Bücher wurden in über 80 Sprachen übersetzt und haben sich weltweit über 500 Millionen Mal verkauft."
    ),

    // ── Antoine de Saint-Exupéry ──────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Von wem stammt das Buch 'Der kleine Prinz'?",
        answerA = "Antoine de Saint-Exupéry",
        answerB = "Jules Verne",
        answerC = "Hans Christian Andersen",
        answerD = "Charles Perrault",
        correctAnswer = 0,
        explanation = "'Der kleine Prinz' wurde 1943 vom französischen Autor und Piloten Antoine de Saint-Exupéry geschrieben. Es ist eines der meistgelesenen Bücher der Welt.",
        difficulty = 1,
        funFact = "'Der kleine Prinz' wurde in über 300 Sprachen übersetzt und ist damit das am meisten übersetzte Buch der Welt nach der Bibel."
    ),

    Question(
        categoryId = 10,
        questionText = "Von welchem Planeten kommt der kleine Prinz?",
        answerA = "Erde",
        answerB = "Asteroid B-612",
        answerC = "Mars",
        answerD = "Mond",
        correctAnswer = 1,
        explanation = "Der kleine Prinz kommt vom winzigen Asteroid B-612, auf dem nur er, eine Rose und drei Vulkane leben.",
        difficulty = 1,
        funFact = "Saint-Exupéry zeichnete die Illustrationen für 'Der kleine Prinz' selbst — er war neben dem Schreiben auch leidenschaftlicher Zeichner."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Tier zähmt der kleine Prinz auf der Erde?",
        answerA = "Einen Hasen",
        answerB = "Einen Wolf",
        answerC = "Einen Fuchs",
        answerD = "Eine Katze",
        correctAnswer = 2,
        explanation = "Der kleine Prinz zähmt einen Fuchs, der ihm erklärt: 'Man sieht nur mit dem Herzen gut. Das Wesentliche ist für die Augen unsichtbar.'",
        difficulty = 1,
        funFact = "Der berühmte Satz des Fuchses gilt als eines der schönsten Zitate der Weltliteratur und wurde millionenfach zitiert."
    ),

    // ── Mark Twain ───────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Die Abenteuer des Tom Sawyer'?",
        answerA = "Jack London",
        answerB = "Mark Twain",
        answerC = "Ernest Hemingway",
        answerD = "Edgar Allan Poe",
        correctAnswer = 1,
        explanation = "Mark Twain schrieb 'Die Abenteuer des Tom Sawyer' im Jahr 1876. Das Buch spielt am Mississippi und handelt vom abenteuerlustigen Jungen Tom Sawyer.",
        difficulty = 1,
        funFact = "Mark Twain war ein Pseudonym — der echte Name des Autors war Samuel Langhorne Clemens."
    ),

    Question(
        categoryId = 10,
        questionText = "An welchem großen Fluss spielen die Abenteuer von Tom Sawyer und Huckleberry Finn?",
        answerA = "Missouri River",
        answerB = "Mississippi",
        answerC = "Ohio River",
        answerD = "Colorado River",
        correctAnswer = 1,
        explanation = "Die Abenteuer von Tom Sawyer und Huckleberry Finn spielen am Mississippi-Fluss, dem größten Fluss der USA, der durch Mark Twains Heimatgegend fließt.",
        difficulty = 1,
        funFact = "Mark Twain wuchs in Hannibal, Missouri, direkt am Mississippi auf — die Stadt diente als Vorbild für das fiktive St. Petersburg in seinen Büchern."
    ),

    // ── Jules Verne ──────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie heißt der U-Boot-Kapitän in Jules Vernes '20.000 Meilen unter dem Meer'?",
        answerA = "Kapitän Ahab",
        answerB = "Kapitän Flint",
        answerC = "Kapitän Hook",
        answerD = "Kapitän Nemo",
        correctAnswer = 3,
        explanation = "Kapitän Nemo ist der geheimnisvolle Kommandant des U-Boots Nautilus in Jules Vernes Roman '20.000 Meilen unter dem Meer' (1870).",
        difficulty = 1,
        funFact = "Der Name 'Nemo' ist lateinisch und bedeutet 'Niemand' — ein Hinweis darauf, dass der Kapitän seine Identität und Vergangenheit verbirgt."
    ),

    Question(
        categoryId = 10,
        questionText = "In wie vielen Tagen umrundet Phileas Fogg in Jules Vernes Roman die Erde?",
        answerA = "80 Tagen",
        answerB = "60 Tagen",
        answerC = "100 Tagen",
        answerD = "40 Tagen",
        correctAnswer = 0,
        explanation = "In Jules Vernes Roman 'Reise um die Erde in 80 Tagen' (1872) wettet Phileas Fogg, dass er die Erde in genau 80 Tagen umrunden kann.",
        difficulty = 1,
        funFact = "Jules Vernes Romane inspirierten echte Reisende: 1889 umrundete Journalistin Nellie Bly die Erde tatsächlich in 72 Tagen."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Franzose schrieb die Abenteuerromane '20.000 Meilen unter dem Meer' und 'Reise um die Erde in 80 Tagen'?",
        answerA = "Jules Verne",
        answerB = "Victor Hugo",
        answerC = "Gustave Flaubert",
        answerD = "Alexandre Dumas",
        correctAnswer = 0,
        explanation = "Jules Verne (1828–1905) war ein französischer Schriftsteller, der als Vater der Science-Fiction gilt und zahlreiche Abenteuer- und Zukunftsromane schrieb.",
        difficulty = 1,
        funFact = "Verne sagte viele technische Erfindungen voraus, darunter U-Boote, Flugzeuge und Raumfahrzeuge — Jahrzehnte bevor sie erfunden wurden."
    ),

    // ── Daniel Defoe ─────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Robinson Crusoe'?",
        answerA = "Jonathan Swift",
        answerB = "Daniel Defoe",
        answerC = "Henry Fielding",
        answerD = "Samuel Richardson",
        correctAnswer = 1,
        explanation = "Daniel Defoe schrieb 'Robinson Crusoe' im Jahr 1719. Es gilt als einer der ersten modernen Romane der englischen Literatur.",
        difficulty = 1,
        funFact = "Defoe basierte die Geschichte auf dem realen Erlebnis des schottischen Matrosen Alexander Selkirk, der vier Jahre auf einer einsamen Insel überlebte."
    ),

    Question(
        categoryId = 10,
        questionText = "Wo ist Robinson Crusoe gestrandet?",
        answerA = "Auf einer einsamen Insel",
        answerB = "In der Arktis",
        answerC = "In der Wüste",
        answerD = "In einem Dschungel auf dem Festland",
        correctAnswer = 0,
        explanation = "Robinson Crusoe strandet nach einem Schiffbruch auf einer einsamen tropischen Insel, auf der er 28 Jahre lang alleine überleben muss.",
        difficulty = 1,
        funFact = "Robinson Crusoe erfindet auf der Insel unzählige Werkzeuge und Methoden zum Überleben — das Buch gilt als Vorlage für das Genre der Survival-Geschichten."
    ),

    // ── Lewis Carroll ─────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie kommt Alice in Wunderland?",
        answerA = "Sie schläft ein und träumt",
        answerB = "Sie folgt einem weißen Kaninchen in sein Loch",
        answerC = "Sie fällt in einen tiefen Brunnen",
        answerD = "Sie tritt durch einen Zauberspiegel",
        correctAnswer = 1,
        explanation = "Alice folgt einem weißen Kaninchen, das eine Uhr trägt, in sein Erdloch und fällt in die Tiefe — so beginnt ihr Abenteuer in Wunderland.",
        difficulty = 1,
        funFact = "Lewis Carroll, der eigentliche Name Charles Lutwidge Dodgson, war Mathematikprofessor in Oxford und erzählte die Geschichte erstmals 1862 auf einem Bootsausflug."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Alice im Wunderland'?",
        answerA = "Oscar Wilde",
        answerB = "Lewis Carroll",
        answerC = "Rudyard Kipling",
        answerD = "H.G. Wells",
        correctAnswer = 1,
        explanation = "Lewis Carroll (eigentlich Charles Lutwidge Dodgson) schrieb 'Alice's Adventures in Wonderland' im Jahr 1865.",
        difficulty = 1,
        funFact = "Das Buch wurde Alice Liddell gewidmet, dem echten Kind, für das Carroll die Geschichte ursprünglich erfunden hatte."
    ),

    // ── Miguel de Cervantes ───────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Don Quijote'?",
        answerA = "Federico García Lorca",
        answerB = "Lope de Vega",
        answerC = "Francisco de Quevedo",
        answerD = "Miguel de Cervantes",
        correctAnswer = 3,
        explanation = "Miguel de Cervantes schrieb 'Don Quijote' in zwei Teilen (1605 und 1615). Es gilt als der erste moderne Roman und als Meisterwerk der Weltliteratur.",
        difficulty = 1,
        funFact = "Don Quijote ist nach der Bibel und dem Koran das meistgedruckte Buch der Geschichte."
    ),

    Question(
        categoryId = 10,
        questionText = "Wogegen kämpft Don Quijote in seiner berühmtesten Szene?",
        answerA = "Gegen einen Drachen",
        answerB = "Gegen Windmühlen",
        answerC = "Gegen einen Riesen",
        answerD = "Gegen einen Löwen",
        correctAnswer = 1,
        explanation = "Don Quijote hält Windmühlen für riesige Feinde und greift sie an. Diese Szene wurde zum Symbol für das Kämpfen gegen imaginäre Feinde.",
        difficulty = 1,
        funFact = "Der Begriff 'gegen Windmühlen kämpfen' kommt direkt aus diesem Roman und bedeutet, gegen Probleme zu kämpfen, die es gar nicht wirklich gibt."
    ),

    // ── Alexandre Dumas ───────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie lautet der berühmte Wahlspruch der drei Musketiere in Dumas' Roman?",
        answerA = "Einer für alle, alle für einen",
        answerB = "Freiheit, Gleichheit, Brüderlichkeit",
        answerC = "Ehre, Mut, Treue",
        answerD = "Gott, König, Vaterland",
        correctAnswer = 0,
        explanation = "'Einer für alle, alle für einen' ist der Wahlspruch von Athos, Porthos, Aramis und d'Artagnan in Dumas' Roman 'Die drei Musketiere' (1844).",
        difficulty = 1,
        funFact = "Obwohl das Buch 'Die drei Musketiere' heißt, gibt es eigentlich vier Musketiere — Hauptfigur d'Artagnan kommt als vierter dazu."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Titelheld in Dumas' Roman 'Der Graf von Monte Christo'?",
        answerA = "Jean Valjean",
        answerB = "Fernand Mondego",
        answerC = "Edmond Dantès",
        answerD = "Albert de Morcerf",
        correctAnswer = 2,
        explanation = "Edmond Dantès ist ein junger Matrose, der unschuldig ins Gefängnis geworfen wird, flieht, einen Schatz findet und als Graf von Monte Christo Rache nimmt.",
        difficulty = 1,
        funFact = "Der Roman 'Der Graf von Monte Christo' ist einer der meistverkauften Romane aller Zeiten und wurde über 40 Mal verfilmt."
    ),

    // ── Victor Hugo ───────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Glöckner in Victor Hugos Roman 'Der Glöckner von Notre-Dame'?",
        answerA = "Quasimodo",
        answerB = "Frollo",
        answerC = "Esmeralda",
        answerD = "Phoebus",
        correctAnswer = 0,
        explanation = "Quasimodo ist der bucklige, taubgewordene Glöckner der Kathedrale Notre-Dame in Paris, der sich in die schöne Zigeunerin Esmeralda verliebt.",
        difficulty = 1,
        funFact = "Victor Hugo schrieb 'Der Glöckner von Notre-Dame' (1831), um die Pariser auf den schlechten Zustand der Kathedrale aufmerksam zu machen und ihre Restaurierung zu fördern."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt der entlaufene Sträfling, der sich ein neues Leben aufbaut, in Victor Hugos 'Les Misérables'?",
        answerA = "Jean Valjean",
        answerB = "Javert",
        answerC = "Fantine",
        answerD = "Marius",
        correctAnswer = 0,
        explanation = "Jean Valjean ist ein ehemaliger Häftling, der nach 19 Jahren Galeerenstrafe versucht, ein anständiger Mensch zu werden — verfolgt vom unerbittlichen Inspektor Javert.",
        difficulty = 1,
        funFact = "Jean Valjean wurde ursprünglich wegen des Diebstahls eines einzigen Brotes verurteilt, das er für seinen hungernden Neffen stahl."
    ),

    Question(
        categoryId = 10,
        questionText = "Von wem stammt der Roman 'Les Misérables'?",
        answerA = "Gustave Flaubert",
        answerB = "Victor Hugo",
        answerC = "Honoré de Balzac",
        answerD = "Émile Zola",
        correctAnswer = 1,
        explanation = "'Les Misérables' (Die Elenden) ist ein Roman von Victor Hugo aus dem Jahr 1862. Es ist ein Meisterwerk über Gerechtigkeit, Armut und die Redemption des Menschen.",
        difficulty = 1,
        funFact = "Victor Hugo schrieb 'Les Misérables' über einen Zeitraum von 17 Jahren und überarbeitete es mehrmals grundlegend."
    ),

    // ── Ernest Hemingway ──────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Der alte Mann und das Meer'?",
        answerA = "John Steinbeck",
        answerB = "William Faulkner",
        answerC = "F. Scott Fitzgerald",
        answerD = "Ernest Hemingway",
        correctAnswer = 3,
        explanation = "Ernest Hemingway schrieb 'Der alte Mann und das Meer' im Jahr 1952. Es erzählt die Geschichte des alten Fischers Santiago, der einen riesigen Marlin fängt.",
        difficulty = 1,
        funFact = "Hemingway erhielt 1954 den Nobelpreis für Literatur, und als Begründung wurde explizit 'Der alte Mann und das Meer' erwähnt."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Tier kämpft der alte Fischer Santiago in Hemingways Roman?",
        answerA = "Einen Thunfisch",
        answerB = "Einen Hai",
        answerC = "Einen Schwertfisch",
        answerD = "Einen Marlin",
        correctAnswer = 3,
        explanation = "Santiago kämpft tagelang gegen einen riesigen Marlin auf hoher See. Auf dem Rückweg wird sein Fang jedoch von Haien gefressen.",
        difficulty = 1,
        funFact = "Hemingway schrieb das Buch in nur acht Wochen und nannte es selbst 'das Beste, was ich je geschrieben habe'."
    ),

    // ── George Orwell ─────────────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den dystopischen Roman '1984'?",
        answerA = "George Orwell",
        answerB = "Aldous Huxley",
        answerC = "Ray Bradbury",
        answerD = "Franz Kafka",
        correctAnswer = 0,
        explanation = "George Orwell schrieb '1984' im Jahr 1949. Der Roman beschreibt eine totalitäre Gesellschaft, in der 'Big Brother' jeden Bürger überwacht.",
        difficulty = 1,
        funFact = "George Orwell hieß mit bürgerlichem Namen Eric Arthur Blair. Er wählte das Pseudonym George Orwell, weil es 'englischer' klang."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bedeutet der Begriff 'Big Brother' aus Orwells '1984'?",
        answerA = "Ein freundlicher Beschützer der Bevölkerung",
        answerB = "Der älteste Bruder der Hauptfigur",
        answerC = "Eine allwissende, totalitäre Überwachungsmacht",
        answerD = "Eine Geheimorganisation gegen die Regierung",
        correctAnswer = 2,
        explanation = "In Orwells '1984' ist 'Big Brother' die allgegenwärtige Überwachungsmacht des totalitären Staates. Überall hängen Plakate mit der Aufschrift 'Big Brother Is Watching You'.",
        difficulty = 1,
        funFact = "Der Begriff 'Big Brother' ist heute in vielen Sprachen ein geflügeltes Wort für staatliche Überwachung — auch außerhalb der Literatur."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Tier steht im Mittelpunkt von George Orwells 'Farm der Tiere'?",
        answerA = "Pferde",
        answerB = "Kühe",
        answerC = "Schafe",
        answerD = "Schweine",
        correctAnswer = 3,
        explanation = "In 'Farm der Tiere' (1945) übernehmen die Schweine die Führung der Tierfarm. Der Leitsatz lautet: 'Alle Tiere sind gleich, aber manche sind gleicher.'",
        difficulty = 1,
        funFact = "Orwell schrieb 'Farm der Tiere' als Allegorie auf die Russische Revolution und den Stalinismus — mehrere Verlage lehnten es zunächst ab."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt das bekannteste Tier in Orwells 'Farm der Tiere', das als Symbol für Stalin gilt?",
        answerA = "Boxer",
        answerB = "Schneeflöckchen",
        answerC = "Schneeball",
        answerD = "Napoleon",
        correctAnswer = 3,
        explanation = "Napoleon ist das Schwein, das als Allegorie auf Josef Stalin gilt. Er übernimmt die Macht auf der Farm und wird immer tyrannischer.",
        difficulty = 1,
        funFact = "Das Pferd Boxer steht für das einfache Arbeitervolk und ist mit seinem Motto 'Ich werde noch härter arbeiten' eine der tragischsten Figuren des Romans."
    ),

    // ── Weitere bekannte Werke ────────────────────────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Aus welchem Land stammte der Autor Jules Verne?",
        answerA = "England",
        answerB = "Frankreich",
        answerC = "Deutschland",
        answerD = "Belgien",
        correctAnswer = 1,
        explanation = "Jules Verne (1828–1905) war Franzose und stammte aus Nantes. Er schrieb seine berühmten Abenteuerromane auf Französisch.",
        difficulty = 1,
        funFact = "Jules Verne lebte fast sein ganzes Schreibleben in Amiens und schrieb dort über 60 Romane in seiner Werkstatt."
    ),

    Question(
        categoryId = 10,
        questionText = "In welchem Jahrhundert lebte William Shakespeare?",
        answerA = "14./15. Jahrhundert",
        answerB = "17./18. Jahrhundert",
        answerC = "15./16. Jahrhundert",
        answerD = "16./17. Jahrhundert",
        correctAnswer = 3,
        explanation = "William Shakespeare lebte von 1564 bis 1616, also im 16. und frühen 17. Jahrhundert. Er gilt als der größte Dichter englischer Sprache.",
        difficulty = 1,
        funFact = "Shakespeare schrieb insgesamt 37 Theaterstücke, 154 Sonette und mehrere längere Gedichte — ein enormes Werk für seine Zeit."
    ),

    Question(
        categoryId = 10,
        questionText = "Wofür ist Charles Dickens' Roman 'Eine Weihnachtsgeschichte' besonders bekannt?",
        answerA = "Für seine genaue historische Darstellung des 18. Jahrhunderts",
        answerB = "Für seine schaurige Horroratmosphäre",
        answerC = "Für seine Botschaft über Menschlichkeit und Großzügigkeit zu Weihnachten",
        answerD = "Für seine Beschreibung der industriellen Revolution",
        correctAnswer = 2,
        explanation = "Dickens' 'Eine Weihnachtsgeschichte' ist berühmt für seine Botschaft: Weihnachten ist ein Fest der Menschlichkeit, des Teilens und der Nächstenliebe.",
        difficulty = 1,
        funFact = "Viele Historiker glauben, dass Dickens mit seiner Weihnachtsgeschichte die moderne Vorstellung von Weihnachten als Familienfest entscheidend geprägt hat."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Nationalität hatte J.R.R. Tolkien, der Autor von 'Der Herr der Ringe'?",
        answerA = "Amerikanisch",
        answerB = "Britisch",
        answerC = "Australisch",
        answerD = "Irisch",
        correctAnswer = 1,
        explanation = "J.R.R. Tolkien (1892–1973) war britischer Staatsangehöriger. Er lehrte als Professor für Angelsächsisch und Englische Literatur an der Universität Oxford.",
        difficulty = 1,
        funFact = "Tolkien war mit C.S. Lewis, dem Autor der Narnia-Bücher, befreundet. Die beiden diskutierten oft über Mythologie und Literatur."
    ),

    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien der erste Harry-Potter-Band 'Harry Potter und der Stein der Weisen'?",
        answerA = "1997",
        answerB = "1995",
        answerC = "1999",
        answerD = "2001",
        correctAnswer = 0,
        explanation = "Der erste Harry-Potter-Band erschien am 26. Juni 1997 im britischen Bloomsbury Verlag. Er wurde zunächst mit einer Auflage von nur 500 Stück gedruckt.",
        difficulty = 1,
        funFact = "J.K. Rowling hatte die Idee zu Harry Potter 1990 in einem Zug, der wegen einer Panne hält. Sie hatte damals weder Stift noch Papier dabei."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist in Shakespeares 'Hamlet' das Werkzeug des Mordes an König Hamlet?",
        answerA = "Ein Schwert",
        answerB = "Eine Pistole",
        answerC = "Erdrosseln",
        answerD = "Gift",
        correctAnswer = 3,
        explanation = "König Hamlet wurde von seinem Bruder Claudius durch Gift ermordet, das ihm ins Ohr gegossen wurde, während er schlief.",
        difficulty = 1,
        funFact = "Das Motiv des Giftes, das ins Ohr gegossen wird, galt im Elisabethanischen England als besonders hinterhältige und schändliche Mordmethode."
    )

)
