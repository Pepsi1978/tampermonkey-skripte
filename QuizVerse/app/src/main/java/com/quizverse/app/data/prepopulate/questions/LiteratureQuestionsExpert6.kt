package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert6(): List<Question> = listOf(

    // Question 1 - Index Librorum Prohibitorum
    // correctAnswer = 0 (richtige Antwort: 1966 → Position A)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde der Index Librorum Prohibitorum der katholischen Kirche offiziell abgeschafft?",
        answerA = "1966",
        answerB = "1948",
        answerC = "1960",
        answerD = "1972",
        correctAnswer = 0,
        explanation = "Der Index Librorum Prohibitorum wurde 1966 formell aufgehoben. Am 14. Juni 1966 erklärte die Kongregation für die Glaubenslehre seine Aufhebung, nachdem Kardinal Alfredo Ottaviani bereits im April erklärt hatte, der Index werde nicht wieder aufgelegt. Das Zweite Vatikanische Konzil hatte diese Entscheidung vorbereitet.",
        difficulty = 4,
        funFact = "In seiner letzten Fassung von 1948 umfasste der Index über 6.000 Titel. Zu den verbotenen Werken zählten Schriften von Galileo Galilei, René Descartes, John Locke, Voltaire und Victor Hugo."
    ),

    // Question 2 - Index Librorum Prohibitorum
    // correctAnswer = 0 (richtige Antwort: Papst Paul IV. → Position A)
    Question(
        categoryId = 10,
        questionText = "Welcher Papst ließ 1557 den ersten offiziellen Index Librorum Prohibitorum drucken?",
        answerA = "Papst Paul IV.",
        answerB = "Papst Gregor XIII.",
        answerC = "Papst Pius V.",
        answerD = "Papst Sixtus V.",
        correctAnswer = 0,
        explanation = "Papst Paul IV. ließ 1557 den ersten offiziellen Index Librorum Prohibitorum drucken. Diese Liste verbotener Bücher entstand als direkte Reaktion auf die Reformation und die Verbreitung des Buchdrucks. Wer ein indiziertes Werk las, druckte oder verbreitete, riskierte die Exkommunikation.",
        difficulty = 4,
        funFact = "Bereits auf dem Konzil von Trient (1545–1563) wurde die Schaffung eines systematischen Index diskutiert. Der erste Trienter Index erschien 1564 und war moderater als der Index von Paul IV."
    ),

    // Question 3 - Bücherverbrennung 1933
    Question(
        categoryId = 10,
        questionText = "Wie hieß die Aktion, unter deren Motto die nationalsozialistischen Bücherverbrennungen 1933 organisiert wurden?",
        answerA = "Gegen den jüdischen Geist",
        answerB = "Gegen das undeutsche Schrifttum",
        answerC = "Wider den undeutschen Geist",
        answerD = "Für das deutsche Buch",
        correctAnswer = 2,
        explanation = "Die Bücherverbrennungen 1933 wurden unter dem Motto 'Wider den undeutschen Geist' von der nationalsozialistischen Deutschen Studentenschaft organisiert. Am 10. Mai 1933 wurden in Berlin am Opernplatz über 20.000 Bücher verbrannt. Propagandaminister Goebbels begleitete die Veranstaltung mit einer Hetzrede.",
        difficulty = 4,
        funFact = "Heinrich Heine schrieb bereits 1820 das prophetische Zitat: 'Dort, wo man Bücher verbrennt, verbrennt man auch am Ende Menschen.' Dieser Satz ist heute am Bebelplatz in Berlin in den Boden eingelassen."
    ),

    // Question 4 - Bücherverbrennung 1933
    Question(
        categoryId = 10,
        questionText = "Welcher Bibliothekar erstellte die 'Schwarzen Listen', nach denen 1933 bei den Bücherverbrennungen 'verbrennungswürdige' Literatur ausgewählt wurde?",
        answerA = "Wolfgang Herrmann",
        answerB = "Alfred Rosenberg",
        answerC = "Joseph Goebbels",
        answerD = "Hans F. K. Günther",
        correctAnswer = 0,
        explanation = "Der Bibliothekar Wolfgang Herrmann erstellte die 'Schwarzen Listen', nach denen Studenten und Hochschulangehörige 'verbrennungswürdige' Literatur in Bibliotheken und Buchhandlungen auswählten. Ein Jahr später umfassten seine Listen bereits mehr als 3.000 verbotene Titel.",
        difficulty = 4,
        funFact = "Die 'Liste des schädlichen und unerwünschten Schrifttums', die ab 1935 regelmäßig herausgegeben wurde, enthielt schließlich 12.400 Titel und das Gesamtwerk von 149 Autoren."
    ),

    // Question 5 - Bücherverbrennung / Erich Kästner
    Question(
        categoryId = 10,
        questionText = "Welcher deutsche Schriftsteller war als einziger der 1933 verbrannten Autoren bei der Verbrennung seiner eigenen Bücher persönlich anwesend?",
        answerA = "Kurt Tucholsky",
        answerB = "Heinrich Mann",
        answerC = "Erich Kästner",
        answerD = "Carl von Ossietzky",
        correctAnswer = 2,
        explanation = "Erich Kästner stand als einziger betroffener Autor persönlich unter den Zuschauern bei der Verbrennung seiner Bücher am 10. Mai 1933 in Berlin. Er beschrieb die Szene später in seinen Erinnerungen. Kästner blieb trotz Publikationsverbot in Deutschland.",
        difficulty = 4,
        funFact = "Kästner durfte in Deutschland nichts mehr veröffentlichen, schrieb aber unter Pseudonym für Schweizer Verlage. Sein Roman 'Fabian' wurde verbrannt; heute gilt er als sein bedeutendstes Werk."
    ),

    // Question 6 - Samizdat
    Question(
        categoryId = 10,
        questionText = "Was bedeutet das russische Wort 'Samizdat' wörtlich übersetzt?",
        answerA = "Verbotene Schrift",
        answerB = "Selbstverlag",
        answerC = "Untergrundzeitung",
        answerD = "Geheimbuch",
        correctAnswer = 1,
        explanation = "Das russische Wort 'Samizdat' bedeutet wörtlich 'Selbstverlag' (sam = selbst, izdat = verlegen/herausgeben). Es bezeichnet die verbreitete Praxis in der Sowjetunion und anderen Ostblockstaaten, verbotene Texte in Eigenregie zu vervielfältigen und von Hand zu Hand weiterzugeben.",
        difficulty = 4,
        funFact = "Unter Stalin wurde die Aufbewahrung und Verbreitung verbotener Texte mit bis zu 25 Jahren Lagerhaft bestraft. Viele Menschen lernten deshalb verbotene Gedichte auswendig und gaben sie nur mündlich weiter."
    ),

    // Question 7 - Samizdat / Tamizdat
    Question(
        categoryId = 10,
        questionText = "Wie heißt das Pendant zu 'Samizdat', bei dem sowjetische Autoren ihre Werke heimlich im Ausland veröffentlichen ließen?",
        answerA = "Zagranitsa",
        answerB = "Tamizdat",
        answerC = "Emigrizdat",
        answerD = "Zaprezdat",
        correctAnswer = 1,
        explanation = "Das Pendant zum Samizdat heißt 'Tamizdat' (tam = dort drüben, izdat = verlegen). Dabei schmuggelten sowjetische Autoren ihre Manuskripte ins westliche Ausland, wo sie dann publiziert wurden. Das bekannteste Beispiel ist Boris Pasternaks 'Doktor Schiwago', der 1957 zuerst in Italien erschien.",
        difficulty = 4,
        funFact = "Der Tamizdat stellte für die Autoren ein erhebliches Risiko dar: Wer erwischt wurde, musste mit Verhaftung, Arbeitslager oder Ausweisung rechnen. Trotzdem nutzten ihn Autoren wie Solschenizyn, Brodsky und viele andere."
    ),

    // Question 8 - Solschenizyn
    // correctAnswer = 1 (richtige Antwort: 1974 → Position B)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Alexander Solschenizyn aus der Sowjetunion ausgebürgert und in den Westen ausgewiesen?",
        answerA = "1970",
        answerB = "1974",
        answerC = "1977",
        answerD = "1980",
        correctAnswer = 1,
        explanation = "Alexander Solschenizyn wurde am 13. Februar 1974 aus der Sowjetunion ausgebürgert und nach Westdeutschland ausgewiesen. Anlass war die Veröffentlichung von 'Der Archipel Gulag' im Westen (1973), in dem er das sowjetische Lagersystem detailliert dokumentierte. Er lebte danach zunächst in der Schweiz, dann in den USA.",
        difficulty = 4,
        funFact = "Solschenizyn kehrte erst 1994 nach dem Zusammenbruch der Sowjetunion nach Russland zurück. Seine Ausweisung löste international großes Aufsehen aus und wurde als schwerer Eingriff in die Meinungsfreiheit verurteilt."
    ),

    // Question 9 - Pasternak / Doktor Schiwago
    // correctAnswer = 1 (richtige Antwort: sowjetischer Druck → Position B)
    Question(
        categoryId = 10,
        questionText = "Warum musste Boris Pasternak den Nobelpreis für Literatur 1958 ablehnen?",
        answerA = "Er war zu krank, um nach Stockholm zu reisen",
        answerB = "Er wurde vom sowjetischen Regime unter Druck gesetzt und zur Ablehnung gezwungen",
        answerC = "Er weigerte sich, sein Land zu verlassen",
        answerD = "Er glaubte, der Preis stünde anderen zu",
        correctAnswer = 1,
        explanation = "Pasternak wurde vom sowjetischen Regime massiv unter Druck gesetzt: Die Behörden drohten ihm mit Ausweisung, dem Schriftstellerverband wurde er ausgeschlossen. Um seiner Familie nicht zu schaden und nicht ins Exil gehen zu müssen, lehnte er den Nobelpreis ab. Er schrieb jedoch an die Schwedische Akademie: 'Ich bin an Russland gebunden.'",
        difficulty = 4,
        funFact = "Pasternaks Sohn Jewgeni Pasternak nahm den Nobelpreis 1989 — 29 Jahre später — posthum in Stockholm entgegen. 'Doktor Schiwago' durfte in der Sowjetunion erst 1988 erscheinen."
    ),

    // Question 10 - Rushdie / Satanische Verse
    // correctAnswer = 3 (richtige Antwort: 14. Februar 1989 → Position D)
    Question(
        categoryId = 10,
        questionText = "Am welchem Datum verkündete Ayatollah Khomeini 1989 die Fatwa gegen Salman Rushdie?",
        answerA = "1. Januar 1989",
        answerB = "4. Juni 1989",
        answerC = "26. September 1989",
        answerD = "14. Februar 1989",
        correctAnswer = 3,
        explanation = "Ayatollah Khomeini verkündete am 14. Februar 1989 — dem Valentinstag — per Radio die Fatwa gegen Salman Rushdie und rief alle Muslime auf, ihn zu töten. Iranische Organisationen setzten ein Kopfgeld aus, das im Laufe der Jahrzehnte auf über 4 Millionen US-Dollar anstieg.",
        difficulty = 4,
        funFact = "Rushdie lebte fast ein Jahrzehnt im Untergrund, ständig von Scotland Yard bewacht. Mehrere Übersetzer und Verleger seiner 'Satanischen Verse' wurden ermordet oder schwer verletzt, darunter der japanische Übersetzer Hitoshi Igarashi 1991."
    ),

    // Question 11 - Lady Chatterley Prozess
    // correctAnswer = 3 (richtige Antwort: Penguin Books → Position D)
    Question(
        categoryId = 10,
        questionText = "Welcher Verlag stand 1960 im berühmten Obszönitätsprozess um D.H. Lawrences 'Lady Chatterley's Lover' vor Gericht?",
        answerA = "Jonathan Cape",
        answerB = "Victor Gollancz",
        answerC = "Faber and Faber",
        answerD = "Penguin Books",
        correctAnswer = 3,
        explanation = "Penguin Books wurde 1960 unter dem Obscene Publications Act von 1959 angeklagt, weil der Verlag die erste vollständige, ungekürzte englische Ausgabe von D.H. Lawrences 'Lady Chatterley's Lover' veröffentlicht hatte. Der Prozess fand am Old Bailey statt und endete am 2. November 1960 mit einem Freispruch.",
        difficulty = 4,
        funFact = "Der Staatsanwalt Mervyn Griffith-Jones machte sich durch die berühmte Frage unsterblich: 'Is it a book that you would even wish your wife or your servants to read?' Diese Frage wurde als Symbol des altmodischen Klassendenkens der britischen Gesellschaft."
    ),

    // Question 12 - Lady Chatterley / Lawrence
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr hatte D.H. Lawrence 'Lady Chatterley's Lover' ursprünglich privat in Italien drucken lassen, weil er wusste, dass das Buch in England verboten würde?",
        answerA = "1920",
        answerB = "1924",
        answerC = "1928",
        answerD = "1932",
        correctAnswer = 2,
        explanation = "D.H. Lawrence ließ 'Lady Chatterley's Lover' 1928 in einer Privatauflage in Florenz drucken, da er wusste, dass das Buch wegen seiner expliziten sexuellen Passagen in England nicht erscheinen durfte. Die erste vollständige englische Ausgabe bei Penguin Books erschien erst 1960, zwölf Jahre nach Lawrences Tod.",
        difficulty = 4,
        funFact = "Lawrence schrieb den Roman in drei verschiedenen Versionen. Das Buch enthält Passagen auf Dialekt (Midlands-Englisch), die als Teil seiner Authentizität gelten — und die Staatsanwalt Griffith-Jones im Prozess als besonders anstößig zitierte."
    ),

    // Question 13 - DDR Literatur / Wolf Biermann
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr und bei welchem Anlass wurde Wolf Biermann aus der DDR ausgebürgert?",
        answerA = "1968, nach der Unterzeichnung eines offenen Briefes gegen den Einmarsch in die CSSR",
        answerB = "1972, nach der Veröffentlichung eines regimekritischen Gedichtbandes im Westen",
        answerC = "1976, während einer Konzerttournee in Westdeutschland",
        answerD = "1980, nach einem Interview mit einem westlichen Fernsehsender",
        correctAnswer = 2,
        explanation = "Wolf Biermann wurde im November 1976 während einer Konzerttournee in Westdeutschland ausgebürgert. Die SED-Führung nutzte seine Abwesenheit, um ihm die Rückkehr zu verweigern. Nach einem Konzert in Köln wurde die Ausbürgerung bekanntgegeben — ein sorgfältig geplanter Akt der Stasi.",
        difficulty = 4,
        funFact = "Biermanns Ausbürgerung löste massive Proteste von DDR-Künstlern aus: Rund 100 namhafte Schriftsteller und Künstler unterzeichneten einen Protestbrief, darunter Christa Wolf, Stefan Heym und Volker Braun. Die Folge war eine Welle von Emigrationen."
    ),

    // Question 14 - DDR Literatur / Christa Wolf
    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Christa Wolf wurde in der DDR trotz Drucklegung zunächst in minimaler Auflage zurückgehalten, weil er zu kritisch erschien?",
        answerA = "Der geteilte Himmel",
        answerB = "Kassandra",
        answerC = "Nachdenken über Christa T.",
        answerD = "Kein Ort. Nirgends.",
        correctAnswer = 2,
        explanation = "Christa Wolfs 'Nachdenken über Christa T.' (1968) wurde in der DDR in einer so kleinen Auflage gedruckt, dass das Buch praktisch nicht erhältlich war. Die Behörden fanden den melancholischen, individualistischen Ton des Romans politisch nicht opportun. In der BRD erschien das Buch dagegen in großer Auflage und wurde ein Bestseller.",
        difficulty = 4,
        funFact = "Christa Wolf war lange Zeit Mitglied der SED und eine Stasi-Informantin (unter dem Decknamen 'Margarete'), bevor sie selbst ab 1968 von der Stasi observiert wurde — ein paradoxes Schicksal, das sie später öffentlich thematisierte."
    ),

    // Question 15 - DDR Literatur / Reiner Kunze
    Question(
        categoryId = 10,
        questionText = "Welcher DDR-Schriftsteller veröffentlichte 1976 den Prosaband 'Die wunderbaren Jahre' im Westen, woraufhin er aus dem DDR-Schriftstellerverband ausgeschlossen und schließlich zur Ausreise gezwungen wurde?",
        answerA = "Stefan Heym",
        answerB = "Reiner Kunze",
        answerC = "Heiner Müller",
        answerD = "Jurek Becker",
        correctAnswer = 1,
        explanation = "Reiner Kunze veröffentlichte 1976 seinen Prosaband 'Die wunderbaren Jahre' im westdeutschen S. Fischer Verlag. Das Buch, das das Leben junger Menschen in der DDR schilderte, wurde sofort verboten. Kunze wurde aus dem Schriftstellerverband ausgeschlossen und siedelte 1977 in die Bundesrepublik über.",
        difficulty = 4,
        funFact = "'Die wunderbaren Jahre' wurde 1979 verfilmt. Reiner Kunze erhielt 1977 den Georg-Büchner-Preis — den bedeutendsten deutschen Literaturpreis — für sein Werk. In der DDR war seine Verleihung selbstverständlich nicht erwünscht."
    ),

    // Question 16 - Sartre / Engagierte Literatur
    // correctAnswer = 0 (richtige Antwort: Was ist Literatur? → Position A)
    Question(
        categoryId = 10,
        questionText = "In welchem Essay-Band von 1948 entwickelte Jean-Paul Sartre seine Theorie der 'littérature engagée' (engagierten Literatur)?",
        answerA = "Was ist Literatur?",
        answerB = "Das Sein und das Nichts",
        answerC = "Kritik der dialektischen Vernunft",
        answerD = "Der Existentialismus ist ein Humanismus",
        correctAnswer = 0,
        explanation = "In seinem Essay-Band 'Qu'est-ce que la littérature?' (1948, dt. 'Was ist Literatur?') entwickelte Sartre seine einflussreiche Theorie der engagierten Literatur. Er argumentierte, dass Prosa — im Gegensatz zur Poesie — grundsätzlich politisch sei und dass Schriftsteller Verantwortung für die gesellschaftlichen Konsequenzen ihres Werkes trügen.",
        difficulty = 4,
        funFact = "Sartre lehnte 1964 den Nobelpreis für Literatur ab — als erster Nobelpreisträger überhaupt. Er begründete dies damit, dass er keine institutionelle Bindung akzeptieren wolle, die seine Unabhängigkeit als Intellektueller gefährden könnte."
    ),

    // Question 17 - Orwell / 1984
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff prägte George Orwell in 'Nineteen Eighty-Four' für die staatliche Praxis, Dokumente und Berichte nachträglich zu fälschen, um die Vergangenheit der herrschenden Ideologie anzupassen?",
        answerA = "Doppeldenk",
        answerB = "Gedankenverbrechen",
        answerC = "Gedächtnisloch",
        answerD = "Neusprech",
        correctAnswer = 2,
        explanation = "Das 'Gedächtnisloch' (memory hole) ist in Orwells '1984' ein Schlitz in der Wand, durch den unbequeme Dokumente in den Verbrennungsofen befördert werden. Der Protagonist Winston Smith arbeitet im Wahrheitsministerium und vernichtet täglich Zeitungsartikel, die mit der aktuellen Parteilinie nicht übereinstimmen — ein Bild für totalitäre Geschichtsfälschung.",
        difficulty = 4,
        funFact = "Orwells '1984' wurde nach seinem Tod 1950 zu einem der meistverkauften Romane des 20. Jahrhunderts. Nach Donald Trumps Amtsantritt 2017 schnellte der Roman auf Platz 1 der Amazon-Bestsellerliste — 67 Jahre nach seiner Erstveröffentlichung."
    ),

    // Question 18 - Orwell / Animal Farm
    // correctAnswer = 3 (richtige Antwort: Stalin/UdSSR war Verbündete → Position D)
    Question(
        categoryId = 10,
        questionText = "Warum lehnten mehrere britische Verlage George Orwells 'Animal Farm' 1944 zunächst ab?",
        answerA = "Wegen zu expliziter Gewaltdarstellung",
        answerB = "Wegen des ungewöhnlichen Genres als politische Fabel",
        answerC = "Weil Orwell kein bekannter Autor war",
        answerD = "Weil die Allegorie auf Stalin und die Sowjetunion politisch heikel war — die UdSSR war Kriegsverbündete",
        correctAnswer = 3,
        explanation = "Mehrere britische Verlage, darunter Victor Gollancz und Jonathan Cape, lehnten 'Animal Farm' ab, weil die Satire auf Stalins Sowjetunion politisch unklug erschien — die UdSSR war 1944 noch Kriegsverbündeter Großbritanniens. Das Buch erschien erst 1945 nach Kriegsende bei Secker and Warburg.",
        difficulty = 4,
        funFact = "T.S. Eliot lehnte 'Animal Farm' für Faber and Faber ab und schrieb: 'Das Buch schlägt dem Leser die falsche politische Haltung vor.' Orwell kämpfte 18 Monate lang darum, einen Verleger zu finden."
    ),

    // Question 19 - Verbotene Bücher / Lolita
    // correctAnswer = 0 (richtige Antwort: Frankreich verboten; Olympia Press → Position A)
    Question(
        categoryId = 10,
        questionText = "In welchem Land wurde Vladimir Nabokovs 'Lolita' nach seiner Erstveröffentlichung 1955 sofort verboten, und in welchem Pariser Verlag erschien das Buch zuerst?",
        answerA = "Frankreich verboten; Verlag: Olympia Press",
        answerB = "Frankreich verboten; Verlag: Gallimard",
        answerC = "Großbritannien verboten; Verlag: Olympia Press",
        answerD = "USA verboten; Verlag: Les Editions de Minuit",
        correctAnswer = 0,
        explanation = "Nabokovs 'Lolita' erschien 1955 im Pariser Verlag Olympia Press, der für englischsprachige Literatur bekannt war, die in anderen Ländern nicht erscheinen konnte. Frankreich selbst verbot das Buch kurz nach Erscheinen. Es wurde auch in Großbritannien, Argentinien und anderen Ländern zeitweise verboten.",
        difficulty = 4,
        funFact = "Nabokov hatte das Manuskript zuvor vier amerikanischen Verlagen angeboten, die alle ablehnten. Die erste US-Ausgabe erschien 1958 bei G.P. Putnam's Sons und wurde sofort ein Bestseller — Nabokov konnte erstmals von seiner Literatur leben."
    ),

    // Question 20 - Verbotene Bücher / Ulysses
    Question(
        categoryId = 10,
        questionText = "In welchem Gerichtsverfahren wurde James Joyces 'Ulysses' 1933 in den USA für legal erklärt, womit das Verbot aufgehoben wurde?",
        answerA = "United States v. One Book Entitled Ulysses",
        answerB = "Random House v. United States",
        answerC = "Joyce v. United States Customs Service",
        answerD = "United States v. James Joyce",
        correctAnswer = 0,
        explanation = "Das Verfahren 'United States v. One Book Entitled Ulysses' (1933) vor Bundesrichter John M. Woolsey hob das US-Verbot von Joyces 'Ulysses' auf. Richter Woolsey urteilte, das Buch sei 'kein Pornografiestück' sondern ein ernsthaftes literarisches Werk. Random House durfte daraufhin die erste US-Ausgabe veröffentlichen.",
        difficulty = 4,
        funFact = "Der Name des Verfahrens — 'One Book Entitled Ulysses' — entstand, weil das Buch selbst als Angeklagter behandelt wurde, nicht der Verlag. Richter Woolseys Urteil gilt bis heute als Meilenstein der amerikanischen Pressefreiheitsgeschichte."
    ),

    // Question 21 - Mahfouz / Kinder der Gabalawi
    // correctAnswer = 0 (richtige Antwort: Awlad Haratina → Position A)
    Question(
        categoryId = 10,
        questionText = "Unter welchem arabischen Originaltitel erschien Naguib Mahfouz' umstrittener Roman, der allegorisch die Geschichte der Propheten Abraham, Moses, Jesus und Mohammed erzählt?",
        answerA = "Awlad Haratina",
        answerB = "Al-Karnak",
        answerC = "Al-Liss wa al-Kilab",
        answerD = "Zuqaq al-Midaqq",
        correctAnswer = 0,
        explanation = "'Awlad Haratina' (Kinder der Gabalawi/Kinder unserer Gasse) erschien 1959 zuerst als Fortsetzungsroman in der ägyptischen Zeitung Al-Ahram. Der Roman erzählt die Geschichte der Propheten in modernen Figuren. Er wurde in Ägypten sofort verboten und trug maßgeblich zu den Todesdrohungen bei, die 1994 zum Attentat auf Mahfouz führten.",
        difficulty = 4,
        funFact = "Das Buch wurde erst 2006 — 47 Jahre nach seinem ersten Erscheinen — offiziell in Ägypten zugelassen. Mahfouz selbst hatte das Verbot immer als Ungerechtigkeit empfunden, bestritt aber jede blasphemische Absicht."
    ),

    // Question 22 - Bulgakov / Verbot
    // correctAnswer = 0 (richtige Antwort: 26 Jahre, 1966 → Position A)
    Question(
        categoryId = 10,
        questionText = "Wie viele Jahre nach dem Tod des Autors erschien Michail Bulgakows Roman 'Der Meister und Margarita' erstmals, und in welchem Jahr war das?",
        answerA = "26 Jahre, 1966",
        answerB = "16 Jahre, 1956",
        answerC = "36 Jahre, 1976",
        answerD = "46 Jahre, 1986",
        correctAnswer = 0,
        explanation = "Michail Bulgakow starb 1940 an einer Nierenerkrankung. 'Der Meister und Margarita' erschien erstmals 1966–67 in der sowjetischen Zeitschrift 'Moskwa' — 26 Jahre nach seinem Tod. Der Roman erschien zunächst nur in stark zensierter Form; die vollständige Fassung erschien erst 1973.",
        difficulty = 4,
        funFact = "Bulgakow schrieb den Roman über zehn Jahre, brannte die erste Fassung 1930 aus Angst vor der Geheimpolizei und schrieb ihn aus dem Gedächtnis neu. Kurz vor seinem Tod diktierte er seiner Frau Elena die letzten Korrekturen."
    ),

    // Question 23 - Zensur / Amerika
    // correctAnswer = 3 (richtige Antwort: Tropic of Cancer → Position D)
    Question(
        categoryId = 10,
        questionText = "Welcher amerikanische Roman von Henry Miller, der explizite Sexualität und das Pariser Bohèmeleben der 1930er-Jahre schildert, war in den USA von 1934 bis 1961 verboten?",
        answerA = "Tropic of Capricorn",
        answerB = "The Rosy Crucifixion",
        answerC = "Sexus",
        answerD = "Tropic of Cancer",
        correctAnswer = 3,
        explanation = "Henry Millers 'Tropic of Cancer' (1934) erschien zunächst nur in Paris bei Obelisk Press. In den USA war das Buch bis 1961 wegen Obszönität verboten. Erst nach einem wegweisenden Urteil des US-Supreme Courts durfte Grove Press eine amerikanische Ausgabe veröffentlichen, die sofort ein Bestseller wurde.",
        difficulty = 4,
        funFact = "Der Verleger Barney Rosset von Grove Press finanzierte bewusst Gerichtsverfahren, um Zensurgesetze anzufechten. Er veröffentlichte auch 'Lady Chatterley's Lover' und 'Lolita' in den USA — und wurde dafür mehrfach angeklagt."
    ),

    // Question 24 - Zensur / Spanien
    Question(
        categoryId = 10,
        questionText = "Welcher spanische Schriftsteller musste sein bedeutendstes Werk, den Roman 'La familia de Pascual Duarte', kurz nach Erscheinen 1942 der Franco-Zensur wegen seiner brutalen Inhalte zweimal aus dem Handel nehmen?",
        answerA = "Federico García Lorca",
        answerB = "Miguel Delibes",
        answerC = "Juan Goytisolo",
        answerD = "Camilo José Cela",
        correctAnswer = 3,
        explanation = "Camilo José Celas Roman 'La familia de Pascual Duarte' erschien 1942 und wurde von der Franco-Zensur zweimal aus dem Handel genommen. Der Roman schildert das Leben eines andalusischen Mörders in schonungsloser Brutalität — der sogenannte 'tremendismo'. Cela erhielt 1989 den Nobelpreis für Literatur.",
        difficulty = 4,
        funFact = "Ironischerweise arbeitete Cela in den 1940er Jahren zeitweise selbst als Zensor für das Franco-Regime — ein moralisch belasteter Aspekt seiner Biographie, der lange Zeit kaum diskutiert wurde."
    ),

    // Question 25 - Verbotene Bücher / Günter Grass
    // correctAnswer = 3 (richtige Antwort: Bundesrepublik Deutschland → Position D)
    Question(
        categoryId = 10,
        questionText = "In welchem Land wurde Günter Grass' 'Die Blechtrommel' nach Erscheinen 1959 in der Gemeinde Düsseldorf auf Antrag einer Bürgerinitiative kurzzeitig aus Schulbibliotheken verbannt?",
        answerA = "In Österreich",
        answerB = "In der DDR",
        answerC = "In der Schweiz",
        answerD = "In der Bundesrepublik Deutschland",
        correctAnswer = 3,
        explanation = "In der Bundesrepublik Deutschland führten Teile des Romans — besonders die als obszön empfundenen Passagen — zu lokalen Verbotsversuchen. In Düsseldorf wurde auf Betreiben einer Bürgerinitiative versucht, das Buch aus öffentlichen Bibliotheken zu entfernen. Grass erhielt wegen des Romans auch zahlreiche Morddrohungen.",
        difficulty = 4,
        funFact = "Günter Grass reichte wegen Verunglimpfung einen Prozess ein — und gewann. 'Die Blechtrommel' wurde dennoch zu einem der meistverkauften deutschen Romane des 20. Jahrhunderts und gewann zahlreiche Auszeichnungen, bevor Grass 1999 den Nobelpreis erhielt."
    ),

    // Question 26 - Zensur / China
    Question(
        categoryId = 10,
        questionText = "Welcher chinesische Literaturnobelpreisträger (2012) wurde in China nie offiziell anerkannt und durfte nicht zur Verleihungszeremonie reisen?",
        answerA = "Ba Jin",
        answerB = "Mo Yan",
        answerC = "Gao Xingjian",
        answerD = "Bei Dao",
        correctAnswer = 1,
        explanation = "Mo Yan erhielt 2012 den Nobelpreis für Literatur. Obwohl er in China lebte und nicht im Exil, durfte er reisen — jedoch wurde die Preisverleihung in China kaum gemeldet und sein Preis vom Regime ambivalent aufgenommen. Der eigentliche Exil-Autor Gao Xingjian erhielt 2000 den Nobelpreis; seine Werke sind in China bis heute verboten.",
        difficulty = 4,
        funFact = "Gao Xingjians Roman 'Die Seele des Berges' und sein Theaterstück 'Busstation' wurden in China verboten. Er lebt seit 1987 in Frankreich und hat die französische Staatsbürgerschaft angenommen."
    ),

    // Question 27 - Heinrich Heine / Exil
    Question(
        categoryId = 10,
        questionText = "Welche Schrift Heinrich Heines wurde 1835 in einem der ersten staatlich organisierten Bücherverbote des Deutschen Bundes verboten — zusammen mit Werken aller Autoren des Jungen Deutschland?",
        answerA = "Zur Geschichte der Religion und Philosophie in Deutschland",
        answerB = "Deutschland. Ein Wintermärchen",
        answerC = "Der Rabbi von Bacherach",
        answerD = "Die Romantische Schule",
        correctAnswer = 3,
        explanation = "1835 verboten die Behörden des Deutschen Bundes sämtliche Schriften des 'Jungen Deutschland', darunter Werke von Heine, Gutzkow, Laube, Wienbarg und Mundt. Heines 'Die Romantische Schule' war explizit in der Verbotsliste genannt. Das Verbot erfasste sogar künftige Werke dieser Autoren — ein ungewöhnlich weitreichender Präventivzensurakt.",
        difficulty = 4,
        funFact = "Heine lebte seit 1831 als politischer Exilant in Paris, wo er die meisten seiner bedeutenden Werke schrieb. Das Verbot von 1835 traf ihn daher nicht unmittelbar persönlich, verhinderte aber die Verbreitung seiner Werke im deutschsprachigen Raum."
    ),

    // Question 28 - Verbotene Bücher / Kafka
    // correctAnswer = 1 (richtige Antwort: Brod veröffentlichte gegen Kafkas Willen → Position B)
    Question(
        categoryId = 10,
        questionText = "Franz Kafka bat seinen Freund Max Brod, nach seinem Tod alle unveröffentlichten Manuskripte zu verbrennen. Was tat Brod stattdessen?",
        answerA = "Er verbrannte alle Manuskripte wie gewünscht",
        answerB = "Er übergab die Manuskripte einem Verlag und veröffentlichte sie gegen Kafkas Willen",
        answerC = "Er lagerte sie unberührt in einer Bank und wartete 50 Jahre",
        answerD = "Er übergab sie der Prager Nationalbibliothek zur dauerhaften Sperrung",
        correctAnswer = 1,
        explanation = "Max Brod ignorierte Kafkas ausdrücklichen Wunsch und veröffentlichte nach dessen Tod 1924 die unveröffentlichten Romane 'Der Process', 'Das Schloss' und 'Amerika'. Brod begründete dies damit, er habe Kafka bereits zu Lebzeiten gesagt, dass er seinen Wunsch nicht erfüllen würde — und Kafka habe ihn trotzdem nicht abgelöst.",
        difficulty = 4,
        funFact = "Brod floh 1939 mit Kafkas Manuskripten im letzten Zug aus Prag nach Tel Aviv. Ein jahrzehntelanger Rechtsstreit zwischen Brods Erben und dem israelischen Nationalarchiv um den Besitz der Manuskripte endete erst 2016."
    ),

    // Question 29 - Politische Literatur / Brecht
    // correctAnswer = 3 (richtige Antwort: HUAC → Position D)
    Question(
        categoryId = 10,
        questionText = "Vor welchem amerikanischen Komitee musste Bertolt Brecht 1947 aussagen, das ihn verdächtigte, kommunistische Propaganda zu betreiben?",
        answerA = "Vor dem Senat-Subkomitee für innere Sicherheit",
        answerB = "Vor dem Justizministerium der McCarthy-Ära",
        answerC = "Vor dem Obersten Gerichtshof der USA",
        answerD = "Vor dem Komitee für unamerikanische Umtriebe (HUAC)",
        correctAnswer = 3,
        explanation = "Bertolt Brecht musste am 30. Oktober 1947 vor dem Komitee für unamerikanische Umtriebe (House Un-American Activities Committee, HUAC) aussagen. Er verstand es, dem Komitee diplomatisch zu antworten, ohne sich zu belasten. Noch am Tag nach seiner Aussage verließ er die USA und kehrte nie zurück.",
        difficulty = 4,
        funFact = "Brecht lebte von 1941 bis 1947 im amerikanischen Exil in Santa Monica, Kalifornien. Er arbeitete dort an mehreren Drehbüchern für Hollywood, die jedoch nie produziert wurden. Seine Rückkehr nach Europa führte ihn schließlich nach Ostberlin."
    ),

    // Question 30 - Zensur / Türkei
    Question(
        categoryId = 10,
        questionText = "Welcher türkische Literaturnobelpreisträger (2006) wurde in der Türkei wegen 'Beleidigung des Türkentums' angeklagt, nachdem er in einem Interview den Massenmord an Armeniern und Kurden öffentlich angesprochen hatte?",
        answerA = "Yaşar Kemal",
        answerB = "Orhan Pamuk",
        answerC = "Ahmet Hamdi Tanpınar",
        answerD = "Nazım Hikmet",
        correctAnswer = 1,
        explanation = "Orhan Pamuk wurde 2005 nach einem Interview mit der Schweizer Zeitung 'Das Magazin' in der Türkei wegen 'Beleidigung des Türkentums' (Artikel 301 des türkischen Strafgesetzbuches) angeklagt. Er hatte erklärt: 'In diesem Land wurden 30.000 Kurden und eine Million Armenier getötet.' Die Anklage wurde 2006 nach internationalem Druck fallen gelassen.",
        difficulty = 4,
        funFact = "Kurz nach Fallengelassen der Anklage erhielt Pamuk den Nobelpreis für Literatur. Die schwedische Akademie betonte damit explizit das Recht auf freie Meinungsäußerung. In der Türkei war die Reaktion gespalten."
    ),

    // Question 31 - Zola / J'accuse
    Question(
        categoryId = 10,
        questionText = "In welcher Zeitung veröffentlichte Émile Zola 1898 seinen offenen Brief 'J'accuse...!' an den Präsidenten der Republik, der ihn selbst strafrechtlich verfolgen ließ?",
        answerA = "Le Figaro",
        answerB = "Le Monde",
        answerC = "L'Aurora",
        answerD = "L'Humanité",
        correctAnswer = 2,
        explanation = "Zolas berühmter offener Brief 'J'accuse...!' erschien am 13. Januar 1898 auf der Titelseite der Zeitung 'L'Aurora' (Die Morgenröte). Der Brief prangerte die Verurteilung des jüdischen Hauptmanns Alfred Dreyfus als Justizirrtum und antisemitisches Komplott an. Zola wurde daraufhin wegen Verleumdung verurteilt und floh nach England.",
        difficulty = 4,
        funFact = "Zola kehrte 1899 nach Frankreich zurück, nachdem Dreyfus' Verfahren neu aufgerollt worden war. Zola starb 1902 unter ungeklärten Umständen — möglicherweise Mordanschlag durch Dreyfus-Gegner — an einer Kohlenmonoxidvergiftung."
    ),

    // Question 32 - Verbotene Bücher / Sowjetunion
    Question(
        categoryId = 10,
        questionText = "Welches Werk des russischen Schriftstellers Jewgeni Samjatin gilt als erstes dystopisches Meisterwerk und beeinflusste direkt Orwells '1984', war aber in der Sowjetunion jahrzehntelang verboten?",
        answerA = "Wir",
        answerB = "Die Insel Krim",
        answerC = "Der Einladungsbrief",
        answerD = "Der Salamander",
        correctAnswer = 0,
        explanation = "Jewgeni Samjatins Roman 'Wir' (1920/21) gilt als Urtext der literarischen Dystopie: Er zeigt einen totalitären Zukunftsstaat, in dem Individuen nur noch Nummern sind. Der Roman konnte in der Sowjetunion nicht erscheinen und wurde erst 1988 unter Gorbatschow veröffentlicht. Orwell bestätigte, 'Wir' vor dem Schreiben von '1984' gelesen zu haben.",
        difficulty = 4,
        funFact = "Samjatin wurde 1931 nach massivem Druck aus dem sowjetischen Schriftstellerverband ausgeschlossen. Mit Genehmigung Stalins — er schrieb ihm persönlich — durfte er emigrieren und lebte bis zu seinem Tod 1937 in Paris."
    ),

    // Question 33 - Verbotene Bücher / DDR / Stefan Heym
    Question(
        categoryId = 10,
        questionText = "Stefan Heyms Roman 'Der König David Bericht' (1972) erschien zunächst nur im Westen — welches Motiv steckt dahinter, das die DDR-Zensoren erkannten?",
        answerA = "Eine Kritik an der Unterdrückung der jüdischen Geschichte",
        answerB = "Eine Allegorie auf die Verfälschung von Geschichte durch Mächtige — eine direkte Anspielung auf die SED-Geschichtspolitik",
        answerC = "Eine religiöse Botschaft, die dem atheistischen Staat missfiel",
        answerD = "Eine Liebesgeschichte, die als obszön eingestuft wurde",
        correctAnswer = 1,
        explanation = "Stefan Heyms 'Der König David Bericht' zeigt, wie der Hofhistoriker Ethan auf Befehl König Salomons eine staatskonforme Biografie Davids schreiben soll — unbequeme Wahrheiten müssen ausgeblendet werden. Die DDR-Zensoren erkannten die Allegorie auf die Verfälschung von Geschichte durch Mächtige als direkte Kritik an der SED-Geschichtspolitik.",
        difficulty = 4,
        funFact = "Stefan Heym (bürgerlicher Name: Helmut Flieg) war Jude, hatte Nazi-Deutschland 1933 verlassen und lebte lange in den USA. Er kehrte 1952 in die DDR zurück — aus Überzeugung. Trotzdem geriet er immer wieder in Konflikt mit dem Regime."
    ),

    // Question 34 - Verbotene Bücher / Irland
    Question(
        categoryId = 10,
        questionText = "Irland hatte zwischen 1929 und 1967 ein besonders strenges Zensurgesetz: Wie viele Bücher wurden in diesem Zeitraum ungefähr verboten?",
        answerA = "Etwa 500 Bücher",
        answerB = "Etwa 5.000 Bücher",
        answerC = "Etwa 12.000 Bücher",
        answerD = "Etwa 50.000 Bücher",
        correctAnswer = 2,
        explanation = "Zwischen 1929 und 1967 verbannte der irische Zensurrat (Censorship Board) etwa 12.000 Bücher. Zu den verbotenen irischen Autoren zählten Samuel Beckett, Brendan Behan, Edna O'Brien und John McGahern. Das Gesetz war so streng, dass fast jeder bedeutende irische Schriftsteller zeitweise verboten war.",
        difficulty = 4,
        funFact = "Samuel Beckett wurde für sein Werk 'More Pricks than Kicks' verboten. Er lebte seit 1937 freiwillig in Paris, da er das kulturell beengende Klima Irlands unerträglich fand. 1969 erhielt er den Nobelpreis für Literatur."
    ),

    // Question 35 - Politische Literatur / Camus
    // correctAnswer = 3 (richtige Antwort: Der Fremde → Position D)
    Question(
        categoryId = 10,
        questionText = "Welcher existenzialistische Roman Albert Camus', in dem ein Algerier einen Araber erschießt und sich weigert, seine Tat zu bereuen, wurde von der FLN (Algerische Befreiungsfront) als kolonialistische Literatur abgelehnt?",
        answerA = "Die Pest",
        answerB = "Der erste Mensch",
        answerC = "Der Fall",
        answerD = "Der Fremde",
        correctAnswer = 3,
        explanation = "Albert Camus' 'Der Fremde' (L'Étranger, 1942) schildert, wie Meursault, ein Franzose in Algerien, einen namenlosen Araber tötet und keinerlei Reue zeigt. Die algerische Befreiungsbewegung und spätere postkoloniale Kritiker sahen darin die Entmenschlichung der algerischen Bevölkerung — der Araber bleibt namenlos und wird nur als Objekt behandelt.",
        difficulty = 4,
        funFact = "Camus war selbst in Algerien geboren und empfand sich als pied-noir (Algerien-Franzose). Er war tief zerrissen zwischen seiner Sympathie für die algerische Bevölkerung und seiner Ablehnung des politischen Terrorismus beider Seiten im Algerienkrieg."
    ),

    // Question 36 - Verbotene Bücher / USA / Banned Books
    Question(
        categoryId = 10,
        questionText = "Welche Organisation in den USA verleiht seit 1982 jährlich in der letzten Septemberwoche eine 'Banned Books Week', um auf Zensurversuche aufmerksam zu machen?",
        answerA = "American Civil Liberties Union (ACLU)",
        answerB = "PEN America",
        answerC = "American Library Association (ALA)",
        answerD = "National Book Foundation",
        correctAnswer = 2,
        explanation = "Die American Library Association (ALA) organisiert seit 1982 jährlich die 'Banned Books Week' in der letzten Septemberwoche. Die ALA führt auch eine jährliche Liste der am häufigsten herausgeforderten Bücher. Zu den perennialen Spitzenreitern gehören Werke wie 'The Hate U Give', 'And Tango Makes Three' und 'The Kite Runner'.",
        difficulty = 4,
        funFact = "In den USA werden Bücher nicht von der Bundesregierung verboten, sondern von lokalen Schul- und Bibliotheksausschüssen 'challenged' (herausgefordert) oder aus Beständen entfernt. Die häufigsten Gründe sind: sexuelle Inhalte, Sprache, LGBTQ+-Themen und religiöse Aspekte."
    ),

    // Question 37 - Zensur / Apartheid Südafrika
    Question(
        categoryId = 10,
        questionText = "Welcher südafrikanische Schriftsteller schrieb 'Disgrace' (1999, dt. 'Schande'), das in Südafrika heftig umstritten war und vom ANC-Parlament als 'rassistisch' bezeichnet wurde?",
        answerA = "Nadine Gordimer",
        answerB = "Athol Fugard",
        answerC = "J.M. Coetzee",
        answerD = "Breyten Breytenbach",
        correctAnswer = 2,
        explanation = "J.M. Coetzees Roman 'Disgrace' (1999) wurde nach dem Ende der Apartheid von Teilen des ANC als rassistisch kritisiert. Das Parlament zitierte Coetzee sogar vor einen Ausschuss. Das Buch schildert u.a. die Vergewaltigung einer weißen Frau durch schwarze Männer auf einem südafrikanischen Bauernhof — Teile der ANC-Fraktion interpretierten dies als negative Darstellung der schwarzen Bevölkerung.",
        difficulty = 4,
        funFact = "Coetzee erhielt 1983 und 1999 zweimal den Booker Prize — als erster Autor überhaupt. Kurz nach dem 'Disgrace'-Streit wanderte er nach Australien aus. 2003 erhielt er den Nobelpreis für Literatur."
    ),

    // Question 38 - Verbotene Bücher / Russland
    Question(
        categoryId = 10,
        questionText = "Welcher russische Dichter wurde 1964 in einem berühmten Schauprozess wegen 'sozialer Schmarotzerei' verurteilt, weil er kein offiziell anerkanntes Berufsfeld ausübte?",
        answerA = "Andrei Voznesensky",
        answerB = "Jewgeni Jewtuschenko",
        answerC = "Joseph Brodsky",
        answerD = "Bulat Okudschawa",
        correctAnswer = 2,
        explanation = "Joseph Brodsky wurde 1964 in Leningrad vor Gericht gestellt. Die Richterin fragte ihn: 'Wer hat Sie autorisiert, sich Dichter zu nennen?' Brodsky antwortete: 'Ich dachte... ich dachte, das kommt von Gott.' Er wurde zu fünf Jahren Zwangsarbeit in Nordsibirien verurteilt. 1987 erhielt er den Nobelpreis für Literatur.",
        difficulty = 4,
        funFact = "Das Protokoll des Brodsky-Prozesses wurde von der Journalistin Frida Vigdorova heimlich mitgeschrieben und über Samizdat-Netzwerke im Westen verbreitet. Dieses Dokument trug erheblich zu internationalen Protesten bei und führte zu Brodskys vorzeitiger Entlassung 1965."
    ),

    // Question 39 - Politische Literatur / Neruda
    // correctAnswer = 3 (richtige Antwort: Senator-Rede gegen Präsident → Position D)
    Question(
        categoryId = 10,
        questionText = "Warum musste der chilenische Dichter und Nobelpreisträger Pablo Neruda 1948 untertauchen und schließlich aus Chile fliehen?",
        answerA = "Wegen eines Skandals um seine Liebesgedichte",
        answerB = "Wegen seiner Mitgliedschaft in einer verbotenen surrealistischen Künstlergruppe",
        answerC = "Weil er heimlich für die sowjetische Kulturpropaganda arbeitete",
        answerD = "Weil er als Senator im Parlament eine Rede gegen Präsident González Videla hielt und deswegen verfolgt wurde",
        correctAnswer = 3,
        explanation = "Pablo Neruda, damals Mitglied der Kommunistischen Partei und Senator, hielt im Januar 1948 im chilenischen Senat eine Rede, in der er Präsident González Videla wegen dessen Repression gegen die Arbeiterbewegung angriff. Ein Haftbefehl wurde ausgestellt; Neruda tauchte unter und floh 1949 über die Anden nach Argentinien.",
        difficulty = 4,
        funFact = "Neruda schrieb während seines Unterlebens weiter, u.a. das epische Werk 'Canto General'. Er kehrte 1952 nach Chile zurück. 1971 erhielt er den Nobelpreis für Literatur; er starb 1973 zwölf Tage nach dem Pinochet-Putsch."
    ),

    // Question 40 - Zensur / Nazi-Deutschland / Exilliteratur
    Question(
        categoryId = 10,
        questionText = "Welcher bedeutende deutsche Schriftstellerverband wurde 1933 im Exil in Paris gegründet, um verfolgten deutschen Autoren eine Plattform zu bieten?",
        answerA = "Schutzverband Deutscher Schriftsteller im Exil",
        answerB = "Bund der freien deutschen Autoren",
        answerC = "Deutsche Schriftstellerliga Paris",
        answerD = "Exilrat der deutschen Literatur",
        correctAnswer = 0,
        explanation = "Der Schutzverband Deutscher Schriftsteller im Exil wurde 1933 in Paris gegründet. Er sollte verfolgten deutschen Autoren im Exil eine Interessenvertretung bieten. Zu seinen Mitgliedern zählten Heinrich Mann, Anna Seghers, Bertolt Brecht, Lion Feuchtwanger und viele andere ins Exil getriebene Schriftsteller.",
        difficulty = 4,
        funFact = "Das NS-Regime entzog zahlreichen Exilautoren die deutsche Staatsbürgerschaft. Heinrich Mann wurde bereits 1933 ausgebürgert — zusammen mit seinem Bruder Thomas Mann. Insgesamt wurden über 2.000 deutschen Schriftstellern die Staatsbürgerschaft entzogen."
    ),

    // Question 41 - Verbotene Bücher / Proust
    // correctAnswer = 3 (richtige Antwort: André Gide → Position D)
    Question(
        categoryId = 10,
        questionText = "Welcher bedeutende französische Verleger lehnte Marcel Prousts 'Du côté de chez Swann' 1912 für den Verlag Nouvelle Revue Française ab — ein Fehler, den er später als seinen größten bezeichnete?",
        answerA = "Gaston Gallimard",
        answerB = "Louis Hachette",
        answerC = "Bernard Grasset",
        answerD = "André Gide",
        correctAnswer = 3,
        explanation = "André Gide las das Manuskript von Prousts 'Du côté de chez Swann' für den Verlag Nouvelle Revue Française und empfahl eine Ablehnung. Proust ließ das Buch 1913 auf eigene Kosten bei Grasset drucken. Nachdem es den Prix Goncourt gewann, holte die NRF unter Gallimard die Rechte — und Gide bezeichnete seine Ablehnung als 'den größten Fehler meines Lebens'.",
        difficulty = 4,
        funFact = "Proust verwendete tatsächlich sein eigenes Geld für den ersten Druck — er war durch sein Erbe finanziell unabhängig. Das Buch fand zunächst kaum Abnehmer; erst der Prix Goncourt 1919 für den zweiten Band machte Proust weltberühmt."
    ),

    // Question 42 - Verbotene Bücher / Rushdie 2022
    Question(
        categoryId = 10,
        questionText = "Bei welcher Veranstaltung in welchem US-Bundesstaat wurde Salman Rushdie im August 2022 mit einem Messer angegriffen?",
        answerA = "Bei einem Literaturfestival in New York City",
        answerB = "Bei einer Lesung im Chautauqua Institution in New York",
        answerC = "Bei einem PEN-America-Gala in Los Angeles",
        answerD = "Bei einem Universitätsvortrag in Boston",
        correctAnswer = 1,
        explanation = "Salman Rushdie wurde am 12. August 2022 während einer Veranstaltung der Chautauqua Institution im Bundesstaat New York auf der Bühne von einem Angreifer mit einem Messer attackiert. Er verlor die Sehkraft auf einem Auge und die Funktion mehrerer Finger. Der Angreifer war ein junger Amerikaner libanesischer Herkunft.",
        difficulty = 4,
        funFact = "Rushdie verarbeitete den Anschlag literarisch: Sein 2024 erschienener Roman 'Knife: Meditations After an Attempted Murder' schildert die Wochen und Monate nach dem Attentat — eine direkte literarische Reaktion auf den Angriff. 33 Jahre nach der Fatwa hatte die Bedrohung ihn fast getötet."
    )

)
