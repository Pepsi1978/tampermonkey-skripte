package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMaster4(): List<Question> = listOf(

    // Question 1 - Flaubert / Madame Bovary
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Gustave Flaubert wegen 'Madame Bovary' vor Gericht gestellt?",
        answerA = "1857",
        answerB = "1851",
        answerC = "1862",
        answerD = "1848",
        correctAnswer = 0,
        explanation = "Der Staatsanwalt Ernest Pinard klagte Flaubert 1857 wegen 'Verletzung der öffentlichen Sittlichkeit und der Religion' an. Der Vorwurf: Der Roman verherrliche den Ehebruch. Flaubert wurde am 7. Februar 1857 freigesprochen — und 'Madame Bovary' wurde daraufhin ein Riesenerfolg.",
        difficulty = 5,
        funFact = "Der gleiche Staatsanwalt Pinard klagte im selben Jahr auch Charles Baudelaire wegen 'Les Fleurs du Mal' an — und gewann diesen Fall, woraufhin sechs Gedichte verboten wurden."
    ),

    // Question 2 - Flaubert / Madame Bovary
    Question(
        categoryId = 10,
        questionText = "In welcher Zeitschrift erschien 'Madame Bovary' erstmals als Fortsetzungsroman, bevor es zum Gerichtsverfahren kam?",
        answerA = "Le Figaro",
        answerB = "Revue des Deux Mondes",
        answerC = "Revue de Paris",
        answerD = "Le Monde Illustré",
        correctAnswer = 2,
        explanation = "Zwischen Oktober und Dezember 1856 erschien 'Madame Bovary' in der Revue de Paris als Fortsetzungsroman. Die Staatsanwaltschaft reagierte sofort auf die Veröffentlichung und leitete ein Verfahren wegen Obszönität und Religionsbeleidigung ein.",
        difficulty = 5,
        funFact = "Flaubert arbeitete fast fünf Jahre an 'Madame Bovary'. Er war bekannt dafür, stundenlang nach dem perfekten Wort zu suchen — sein Prinzip hieß 'le mot juste' (das treffende Wort)."
    ),

    // Question 3 - Baudelaire / Les Fleurs du Mal
    Question(
        categoryId = 10,
        questionText = "Wie viele Gedichte aus Baudelaires 'Les Fleurs du Mal' wurden 1857 nach dem Prozess offiziell verboten?",
        answerA = "3",
        answerB = "9",
        answerC = "12",
        answerD = "6",
        correctAnswer = 3,
        explanation = "Sechs Gedichte aus 'Les Fleurs du Mal' wurden nach dem Prozess von 1857 verboten, darunter 'Lesbos' und 'Les Femmes damnées'. Baudelaire musste sie aus dem Buch entfernen und eine Geldstrafe zahlen. Das Verbot dieser sechs Gedichte wurde erst 1949 — 92 Jahre später — offiziell aufgehoben.",
        difficulty = 5,
        funFact = "Beide Verfahren — gegen Flaubert und gegen Baudelaire — wurden vom selben Staatsanwalt Ernest Pinard geführt. Flaubert wurde freigesprochen, Baudelaire verurteilt."
    ),

    // Question 4 - James Joyce / Ulysses
    Question(
        categoryId = 10,
        questionText = "Wie lautete der offizielle Titel des US-Gerichtsverfahrens von 1933, das Joyces 'Ulysses' für nicht obszön erklärte?",
        answerA = "United States v. Ulysses by James Joyce",
        answerB = "United States v. One Book Called Ulysses",
        answerC = "United States v. Random House Publishing",
        answerD = "Joyce v. United States Customs Authority",
        correctAnswer = 1,
        explanation = "Der Rechtsfall hieß offiziell 'United States v. One Book Called Ulysses' — der Titel beschreibt wörtlich das beschlagnahmte Exemplar. Richter John Woolsey urteilte am 6. Dezember 1933, das Buch sei nicht pornografisch, da es 'nirgends den Blick des Wollüstigen' enthalte.",
        difficulty = 5,
        funFact = "Der Verleger Random House arrangierte die Beschlagnahme absichtlich selbst: Er ließ ein Exemplar durch den Zoll einführen, damit es offiziell konfisziert werden konnte — nur so konnte ein Gerichtsverfahren eingeleitet werden."
    ),

    // Question 5 - Joyce / Ulysses Erstverfahren
    Question(
        categoryId = 10,
        questionText = "Wer waren die beiden Herausgeberinnen der Literaturzeitschrift 'The Little Review', die 1921 wegen des Abdrucks von Ulysses-Kapiteln verurteilt wurden?",
        answerA = "Margaret Anderson und Jane Heap",
        answerB = "Virginia Woolf und Katherine Mansfield",
        answerC = "Sylvia Beach und Adrienne Monnier",
        answerD = "Harriet Monroe und Amy Lowell",
        correctAnswer = 0,
        explanation = "Margaret Anderson und Jane Heap wurden 1921 wegen des Abdrucks des 'Nausikaa'-Kapitels aus Ulysses in 'The Little Review' wegen Obszönität verurteilt. Sie mussten Geldstrafen zahlen und durften keine weiteren Kapitel abdrucken. Das führte dazu, dass der Roman zunächst nur in Paris erscheinen konnte.",
        difficulty = 5,
        funFact = "Die New York Society for the Suppression of Vice (Gesellschaft zur Unterdrückung des Lasters) war die treibende Kraft hinter der Anklage — sie hatte im 19. und frühen 20. Jahrhundert viele Bücher und Zeitschriften zensiert."
    ),

    // Question 6 - Nabokov / Lolita
    Question(
        categoryId = 10,
        questionText = "Welcher Pariser Verlag veröffentlichte Vladimir Nabokovs 'Lolita' 1955 als erstes, nachdem alle amerikanischen Verlage das Manuskript abgelehnt hatten?",
        answerA = "Gallimard",
        answerB = "Olympia Press",
        answerC = "Seuil",
        answerD = "Denoël",
        correctAnswer = 1,
        explanation = "Maurice Girodias' Olympia Press in Paris veröffentlichte 'Lolita' 1955 auf Englisch. Olympia Press war bekannt für englischsprachige erotische Literatur und publizierte neben Nabokov auch Samuel Becketts 'Watt' und Henry Millers Werke. Vier amerikanische Verlage hatten das Manuskript zuvor abgelehnt.",
        difficulty = 5,
        funFact = "Nach der Veröffentlichung verbot die britische Regierung die Einfuhr des Buches nach England und setzte Frankreich unter Druck — was Nabokov unerwartet berühmt machte: Das Verbot erzeugte enormes Interesse."
    ),

    // Question 7 - Nabokov / Lolita
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr hob Frankreich das Verbot von Nabokovs 'Lolita' auf, nachdem es zunächst den Vertrieb der englischen Ausgabe untersagt hatte?",
        answerA = "1956",
        answerB = "1962",
        answerC = "1958",
        answerD = "1959",
        correctAnswer = 3,
        explanation = "Frankreich verbot Ende 1956 die Olympia-Press-Ausgabe von 'Lolita' unter Druck der britischen Regierung. Das Verbot wurde im Juli 1959 aufgehoben — just rechtzeitig vor dem Erscheinen der französischen Übersetzung. Ironischerweise wurde das Buch in den USA nie offiziell verboten.",
        difficulty = 5,
        funFact = "Nabokov schrieb 'Lolita' auf Englisch, obwohl er Russe war — und erklärte das Buch zu seiner 'Liebeserklärung an die englische Sprache'. Der Roman erschien erst 1958 in den USA und wurde sofort ein Bestseller."
    ),

    // Question 8 - DH Lawrence / Lady Chatterley
    Question(
        categoryId = 10,
        questionText = "Wie lautete der Name des berühmten Gerichtsverfahrens gegen den Verlag Penguin Books 1960 wegen 'Lady Chatterley's Lover'?",
        answerA = "Crown v. Penguin Books",
        answerB = "Regina v. Lawrence Estate",
        answerC = "HM Government v. Penguin Press",
        answerD = "R v Penguin Books Ltd",
        correctAnswer = 3,
        explanation = "Das Verfahren hieß 'R v Penguin Books Ltd' (R = Regina, die Krone). Es fand vom 20. Oktober bis 2. November 1960 am Old Bailey in London statt. Die Anklage berief sich auf den Obscene Publications Act 1959. Der Freispruch führte zur sexuellen Liberalisierung der britischen Verlagsbranche.",
        difficulty = 5,
        funFact = "Der Ankläger Mervyn Griffith-Jones stellte der Jury die berühmte Frage: 'Ist dies ein Buch, das Sie Ihrer Frau oder Ihren Bediensteten zum Lesen geben würden?' — Diese Frage wurde zur Lachnummer und half, die Jury gegen die Anklage einzunehmen."
    ),

    // Question 9 - DH Lawrence / Lady Chatterley
    Question(
        categoryId = 10,
        questionText = "Wie viele Exemplare von 'Lady Chatterley's Lover' verkaufte Penguin Books am ersten Verkaufstag nach dem Freispruch im Jahr 1960?",
        answerA = "200.000",
        answerB = "100.000",
        answerC = "50.000",
        answerD = "500.000",
        correctAnswer = 0,
        explanation = "Am 10. November 1960 verkaufte Penguin die gesamte erste Auflage von 200.000 Exemplaren an einem einzigen Tag — Menschen standen in Schlangen vor den Buchhandlungen. Innerhalb weniger Wochen wurden drei Millionen Exemplare verkauft. Der Skandalprozess hatte das Buch zur Sensation gemacht.",
        difficulty = 5,
        funFact = "D.H. Lawrence hatte den Roman 1928 geschrieben und ihn zunächst privat in Florenz drucken lassen, da er wusste, dass kein normaler Verlag ihn annehmen würde. Lawrence starb 1930, ohne den Erfolg zu erleben."
    ),

    // Question 10 - Salman Rushdie / Satanische Verse
    Question(
        categoryId = 10,
        questionText = "An welchem Datum im Jahr 1989 erließ Ayatollah Chomeini die Fatwa gegen Salman Rushdie?",
        answerA = "1. Januar 1989",
        answerB = "15. August 1989",
        answerC = "4. November 1989",
        answerD = "14. Februar 1989",
        correctAnswer = 3,
        explanation = "Am 14. Februar 1989 — dem Valentinstag — erließ Ayatollah Chomeini im iranischen Radio die Fatwa: Er rief alle Muslime auf, Rushdie und die Verleger von 'Die Satanischen Verse' zu töten. Das Kopfgeld begann bei ca. 3 Millionen US-Dollar und wurde im Laufe der Jahre auf über 4 Millionen erhöht.",
        difficulty = 5,
        funFact = "Rushdie lebte anschließend fast zehn Jahre im Untergrund, mit ständig wechselnden Wohnorten und Personenschutz. Er beschrieb diese Zeit in seiner Autobiographie 'Joseph Anton' — dem Decknamen, den er während dieser Jahre verwendete."
    ),

    // Question 11 - Rushdie / Satanische Verse Übersetzer
    Question(
        categoryId = 10,
        questionText = "Welcher japanische Übersetzer von Rushdies 'Satanischen Versen' wurde 1991 ermordet?",
        answerA = "Kenzaburo Oe",
        answerB = "Haruki Murakami",
        answerC = "Kobo Abe",
        answerD = "Hitoshi Igarashi",
        correctAnswer = 3,
        explanation = "Hitoshi Igarashi, Professor für Islamistik an der Universität Tsukuba, wurde am 11. Juli 1991 in seinem Büro erstochen aufgefunden. Er hatte 'Die Satanischen Verse' ins Japanische übersetzt. Der Mord blieb offiziell unaufgeklärt. Der italienische Übersetzer Ettore Capriolo überlebte knapp einen Anschlag.",
        difficulty = 5,
        funFact = "Der norwegische Verleger William Nygaard überlebte 1993 ebenfalls einen Anschlag. Bei Angriffen im Zusammenhang mit dem Buch wurden insgesamt mindestens 38 Menschen getötet, hauptsächlich bei Protesten in Pakistan und Indien."
    ),

    // Question 12 - Bret Easton Ellis / American Psycho
    Question(
        categoryId = 10,
        questionText = "Welcher ursprüngliche Verlag zog 'American Psycho' kurz vor der Veröffentlichung 1990 zurück und veranlasste so Ellis' Wechsel zu einem anderen Verlag?",
        answerA = "Harper & Row",
        answerB = "Knopf",
        answerC = "Simon & Schuster",
        answerD = "Random House",
        correctAnswer = 2,
        explanation = "Simon & Schuster hatte das Buch bereits angekauft, zog es jedoch kurz vor der geplanten Veröffentlichung 1990 aus moralischen Gründen zurück — ließ Ellis aber den Vorschuss von 300.000 Dollar behalten. Vintage Books, eine Tochter von Random House, veröffentlichte den Roman dann 1991.",
        difficulty = 5,
        funFact = "Vor der Veröffentlichung erschienen Auszüge des Buches in 'Spy'-Magazin, was eine Welle der Empörung auslöste. Die National Organization for Women (NOW) rief zum Boykott des Verlages auf."
    ),

    // Question 13 - American Psycho / Deutschland
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde 'American Psycho' in Deutschland von der Bundesprüfstelle für jugendgefährdende Schriften indiziert?",
        answerA = "1995",
        answerB = "1993",
        answerC = "1991",
        answerD = "1998",
        correctAnswer = 0,
        explanation = "In Deutschland wurde 'American Psycho' 1995 von der Bundesprüfstelle indiziert und durfte nicht frei verkauft werden. Der Verlag Kiepenheuer & Witsch klagte dagegen und gewann 2000 schließlich das Verfahren — nach fünf Jahren Indizierung.",
        difficulty = 5,
        funFact = "In Australien ist 'American Psycho' bis heute (2026) nicht frei verkäuflich: Das Buch ist als R18+ eingestuft und muss in Klarsichtfolie eingeschweißt verkauft werden — darf also nur an Erwachsene abgegeben werden."
    ),

    // Question 14 - Index Librorum Prohibitorum
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde der 'Index Librorum Prohibitorum' des Vatikans offiziell abgeschafft?",
        answerA = "1948",
        answerB = "1972",
        answerC = "1966",
        answerD = "1958",
        correctAnswer = 2,
        explanation = "Am 14. Juni 1966 erklärte die vatikanische Glaubenskongregation unter Papst Paul VI. den Index für abgeschafft. Die letzte Ausgabe des Index erschien 1948 mit rund 4.000 Titeln. Der Index existierte von 1559 bis 1966 — über vier Jahrhunderte lang.",
        difficulty = 5,
        funFact = "Auch nach der Abschaffung behielt der Index eine moralische Warnung: Die Kongregation erklärte, die verbotenen Bücher bedrohten weiterhin 'das Gewissen und die christlichen Sitten', auch wenn das kirchliche Gesetz des Verbots aufgehoben wurde."
    ),

    // Question 15 - Index Librorum Prohibitorum / Galileo
    Question(
        categoryId = 10,
        questionText = "Welches Werk Galileo Galileis stand auf dem Index Librorum Prohibitorum, und wurde dort erst im Jahr 1835 gestrichen?",
        answerA = "Sidereus Nuncius",
        answerB = "Discorsi e dimostrazioni matematiche",
        answerC = "Dialogo sopra i due massimi sistemi del mondo",
        answerD = "De revolutionibus orbium coelestium",
        correctAnswer = 2,
        explanation = "Galileis 'Dialogo' (Dialog über die zwei wichtigsten Weltsysteme) aus dem Jahr 1632 stand auf dem Index — erst 1835, also über 200 Jahre nach seiner Veröffentlichung, wurde es gestrichen. Das Buch vertrat heliozentrisches Weltbild und brachte Galilei seinen Hausarrest ein.",
        difficulty = 5,
        funFact = "Kopernikus' Werk 'De revolutionibus' stand ebenfalls auf dem Index — und wurde erst 1835 gleichzeitig mit Galilei gestrichen. Das vatikanische Streichungsdatum 1835 markiert das Ende der offiziellen kirchlichen Zensur des Heliozentrismus."
    ),

    // Question 16 - Index / Simone de Beauvoir
    Question(
        categoryId = 10,
        questionText = "Welches Werk Simone de Beauvoirs wurde 1956 auf den vatikanischen Index gesetzt?",
        answerA = "Sie kam und blieb",
        answerB = "Die Mandarins von Paris",
        answerC = "Memoiren einer gesitteten Tochter",
        answerD = "Das andere Geschlecht",
        correctAnswer = 3,
        explanation = "Simone de Beauvoirs feministisches Hauptwerk 'Das andere Geschlecht' (Le Deuxième Sexe, 1949) wurde 1956 auf den vatikanischen Index gesetzt. Der Vatikan verurteilte das Buch wegen seiner Betrachtungen über Moral, Sexualität und Weiblichkeit. Trotzdem oder deswegen wurde es weltweit ein Bestseller.",
        difficulty = 5,
        funFact = "Als 'Das andere Geschlecht' erschien, verkauften sich die beiden Bände in der ersten Woche 22.000 Mal. Der Vatikan war einer von vielen, die das Buch ablehnten — auch viele französische Intellektuelle, darunter Albert Camus, kritisierten es scharf."
    ),

    // Question 17 - Henry Miller / Tropic of Cancer
    Question(
        categoryId = 10,
        questionText = "Wie viele Gerichtsverfahren gab es in den USA zwischen 1961 und 1964 allein rund um Henry Millers 'Tropic of Cancer'?",
        answerA = "Über 20",
        answerB = "Über 60",
        answerC = "Über 100",
        answerD = "Genau 12",
        correctAnswer = 1,
        explanation = "Nach der amerikanischen Erstveröffentlichung durch Grove Press 1961 gab es von 1961 bis 1964 mehr als 60 Gerichtsverfahren rund um 'Tropic of Cancer'. Am 22. Juni 1964 entschied der US Supreme Court in einer 5:4-Entscheidung ('Grove Press v. Gerstein'), das Buch sei nicht obszön.",
        difficulty = 5,
        funFact = "Henry Miller lebte jahrelang in Paris in Armut und schrieb 'Tropic of Cancer' dort 1934. Das Buch durfte 27 Jahre lang nicht in die USA importiert werden. Als es schließlich erschien, wurde es einer der meistverkauften Romane des Jahres."
    ),

    // Question 18 - Boris Pasternak / Doktor Schiwago
    Question(
        categoryId = 10,
        questionText = "Welche Geheimdienstorganisation finanzierte heimlich eine russischsprachige Erstausgabe von Pasternaks 'Doktor Schiwago', um dem Autor die Nobelpreisvoraussetzungen zu ermöglichen?",
        answerA = "MI6",
        answerB = "BND",
        answerC = "CIA",
        answerD = "Mossad",
        correctAnswer = 2,
        explanation = "Die CIA finanzierte 1958 eine russischsprachige Ausgabe von 'Doktor Schiwago' beim Haager Verlag Mouton, da ein Nobelpreis für Literatur die Veröffentlichung des Werkes in der Originalsprache voraussetzte. Die Sowjetunion hatte eine russische Ausgabe verboten. Die CIA nutzte das Buch als Propagandawerkzeug im Kalten Krieg.",
        difficulty = 5,
        funFact = "Pasternak nahm den Nobelpreis 1958 zunächst an, musste aber auf Druck der sowjetischen Regierung und der Schriftstellervereinigung ablehnen. Sein Sohn nahm den Preis 1989 — 29 Jahre nach Pasternaks Tod — stellvertretend in Stockholm entgegen."
    ),

    // Question 19 - Pasternak / Schriftstellerverband
    Question(
        categoryId = 10,
        questionText = "Was geschah mit Boris Pasternak, nachdem er den Nobelpreis 1958 angenommen hatte und dann unter Druck ablehnte?",
        answerA = "Er floh in den Westen",
        answerB = "Er wurde in ein Arbeitslager deportiert",
        answerC = "Er wurde aus dem sowjetischen Schriftstellerverband ausgeschlossen",
        answerD = "Er wurde unter Hausarrest gestellt",
        correctAnswer = 2,
        explanation = "Pasternak wurde aus dem sowjetischen Schriftstellerverband (Sowjetski Sojus Pisatelej) ausgeschlossen — was in der Sowjetunion bedeutete, dass er praktisch nicht mehr publizieren durfte. Er bat in einem persönlichen Brief Chruschtschow darum, im Land bleiben zu dürfen, und durfte bleiben, lebte aber bis zu seinem Tod 1960 unter enormem sozialen Druck.",
        difficulty = 5,
        funFact = "Pasternak schrieb in einem Brief an Chruschtschow: 'Ein Verlassen der Heimat ist für mich gleichbedeutend mit dem Tod.' Er starb am 30. Mai 1960, nur zwei Jahre nach dem Nobelpreis-Skandal, an Lungenkrebs."
    ),

    // Question 20 - Bücherverbrennung 1933
    Question(
        categoryId = 10,
        questionText = "Wo fand die bekannteste nationalsozialistische Bücherverbrennung am 10. Mai 1933 in Berlin statt?",
        answerA = "Brandenburger Tor",
        answerB = "Berliner Reichstag",
        answerC = "Opernplatz (heute Bebelplatz)",
        answerD = "Unter den Linden",
        correctAnswer = 2,
        explanation = "Am Opernplatz (heute Bebelplatz) in Berlin fand die bekannteste Bücherverbrennung statt — organisiert von der Deutschen Studentenschaft unter dem Motto 'Wider den undeutschen Geist'. Ca. 20.000 Bücher wurden verbrannt. Heinrich Heine hatte 1820 prophetisch geschrieben: 'Dort wo man Bücher verbrennt, verbrennt man auch am Ende Menschen.'",
        difficulty = 5,
        funFact = "Der Bebelplatz in Berlin erinnert heute mit einem Denkmal des Künstlers Micha Ullman an die Bücherverbrennung: Unter einer Glasplatte im Pflaster sind leere Bücherregale zu sehen, die alle verbrannten Bücher symbolisieren."
    ),

    // Question 21 - Bücherverbrennung / Heine-Zitat
    Question(
        categoryId = 10,
        questionText = "In welchem Werk schrieb Heinrich Heine 1820/21 den prophetischen Satz: 'Dort wo man Bücher verbrennt, verbrennt man auch am Ende Menschen'?",
        answerA = "Deutschland, ein Wintermärchen",
        answerB = "Almansor",
        answerC = "Buch der Lieder",
        answerD = "Florentinische Nächte",
        correctAnswer = 1,
        explanation = "Der Satz stammt aus Heines Theaterstück 'Almansor' (1820/21), das während der spanischen Inquisition spielt. Die Zeile ist eine Reaktion auf die Verbrennung des Korans durch die Inquisition. 113 Jahre später wurden Heines eigene Bücher von den Nationalsozialisten verbrannt.",
        difficulty = 5,
        funFact = "Auch Heines eigene Werke standen auf der Verbrenningsliste von 1933 — dazu wurden seine Bücher auch auf den vatikanischen Index gesetzt. Vier seiner Werke landeten auf dem Index Librorum Prohibitorum."
    ),

    // Question 22 - Nobelpreis Skandal 2018
    Question(
        categoryId = 10,
        questionText = "Warum wurde der Nobelpreis für Literatur im Jahr 2018 nicht vergeben?",
        answerA = "Wegen eines Streits über den Kandidaten Bob Dylan",
        answerB = "Wegen eines Sexualskandals und dem Rücktritt vieler Akademiemitglieder",
        answerC = "Wegen eines Boykotts wegen der Vergabe an Peter Handke",
        answerD = "Wegen des Todes des vorgesehenen Preisträgers",
        correctAnswer = 1,
        explanation = "2018 wurde der Literaturnobelpreis nicht vergeben, weil die Schwedische Akademie aufgrund eines Sexualskandals handlungsunfähig war: Jean-Claude Arnault, Ehemann einer Akademiemitglied, wurde wegen sexueller Übergriffe beschuldigt. Mehrere Akademiemitglieder traten zurück, das Gremium war nicht mehr beschlussfähig.",
        difficulty = 5,
        funFact = "2019 wurden dann zwei Preise vergeben: für 2018 an die Polin Olga Tokarczuk und für 2019 an den Österreicher Peter Handke. Handkes Auszeichnung löste neue Kontroversen wegen seiner jugoslawischen Politik aus."
    ),

    // Question 23 - Peter Handke / Nobelpreis 2019
    Question(
        categoryId = 10,
        questionText = "Wessen Parteinahme für welchen Politiker führte zu internationalen Protesten gegen Peter Handkes Nobelpreisauszeichnung 2019?",
        answerA = "Für den serbischen Präsidenten Slobodan Milošević",
        answerB = "Für den bosnischen Serbenführer Radovan Karadžić",
        answerC = "Für den montenegrinischen Milo Đukanović",
        answerD = "Für den kroatischen Präsidenten Tudjman",
        correctAnswer = 0,
        explanation = "Handke hatte den serbischen Präsidenten Slobodan Milošević und den serbischen Nationalismus öffentlich verteidigt, u.a. durch einen Nachruf auf Milošević. Mehrere Nobelpreis-Juroren traten aus Protest zurück. Albanien, Bosnien, Kosovo, Kroatien und die Türkei boykottierten die Verleihungszeremonie.",
        difficulty = 5,
        funFact = "Handke hielt 1996 eine viel kritisierte Rede 'Gerechtigkeit für Serbien', in der er die Medienberichterstattung über den Bosnienkrieg kritisierte. Der Schriftsteller Salman Rushdie nannte Handkes Nobelpreis 'eine schändliche Entscheidung'."
    ),

    // Question 24 - Jean-Paul Sartre / Nobelpreis-Ablehnung
    Question(
        categoryId = 10,
        questionText = "Jean-Paul Sartre war der erste Autor, der den Literaturnobelpreis freiwillig ablehnte. In welchem Jahr geschah dies?",
        answerA = "1960",
        answerB = "1962",
        answerC = "1964",
        answerD = "1968",
        correctAnswer = 2,
        explanation = "Jean-Paul Sartre lehnte den Nobelpreis für Literatur 1964 ab — als erster und bisher einziger Autor, der dies freiwillig tat. Seine Begründung: 'Jeder Preis macht abhängig' und er wolle sich nicht 'institutionalisieren' lassen. Er lehnte auch andere Ehrungen ab, darunter die Légion d'honneur.",
        difficulty = 5,
        funFact = "Sartre soll später erklärt haben, er bedaure die Ablehnung — aber nicht aus inhaltlichen Gründen, sondern weil er das Geld hätte gut gebrauchen können. Er lebte zeitlebens bescheiden und gab viel für politische Aktivitäten aus."
    ),

    // Question 25 - Maxim Biller / Esra-Prozess
    Question(
        categoryId = 10,
        questionText = "Welcher deutsche Schriftsteller musste 2007 seinen Roman vom Markt nehmen, nachdem das Bundesverfassungsgericht der Persönlichkeitsrechtklage seiner Ex-Freundin stattgab?",
        answerA = "Günter Grass",
        answerB = "Maxim Biller",
        answerC = "Martin Walser",
        answerD = "Botho Strauß",
        correctAnswer = 1,
        explanation = "Maxim Billers Roman 'Esra' (2003) musste 2007 nach einer Entscheidung des Bundesverfassungsgerichts dauerhaft vom Markt genommen werden. Eine ehemalige Freundin Billers klagte, da die Romanfiguren ihr eigenes Leben und das ihrer Mutter zu erkennbar darstellten und ihr Persönlichkeitsrecht verletzten.",
        difficulty = 5,
        funFact = "Der Fall 'Esra' ist einer der bedeutendsten Zensurfälle der deutschen Nachkriegsliteratur und entfachte eine große Debatte über die Grenzen zwischen Kunstfreiheit und Persönlichkeitsschutz."
    ),

    // Question 26 - Solschenizyn / Gulag Archipelago
    Question(
        categoryId = 10,
        questionText = "Was geschah mit Alexander Solschenizyn in der Sowjetunion, nachdem 'Der Archipel Gulag' 1973 im Westen veröffentlicht worden war?",
        answerA = "Er wurde in ein Arbeitslager deportiert",
        answerB = "Er wurde in eine psychiatrische Klinik eingewiesen",
        answerC = "Er wurde ausgebürgert und aus der Sowjetunion ausgewiesen",
        answerD = "Er wurde zum Tode verurteilt, aber begnadigt",
        correctAnswer = 2,
        explanation = "Solschenizyn wurde am 13. Februar 1974 verhaftet, ausgebürgert und in die Bundesrepublik Deutschland ausgewiesen — die erste Ausbürgerung eines sowjetischen Schriftstellers. Er lebte anschließend im Exil, zunächst in der Schweiz, dann in den USA (Vermont). 1994 kehrte er nach Russland zurück.",
        difficulty = 5,
        funFact = "Solschenizyn hatte den Nobelpreis für Literatur bereits 1970 erhalten, konnte die Verleihung aber nicht persönlich entgegennehmen, da er befürchtete, nicht zurück in die Sowjetunion gelassen zu werden."
    ),

    // Question 27 - Bulgakov / Meister und Margarita
    Question(
        categoryId = 10,
        questionText = "Wie viele Jahre nach Bulgakovs Tod erschien 'Der Meister und Margarita' erstmals — wenn auch zensiert — in der Sowjetunion?",
        answerA = "10 Jahre",
        answerB = "35 Jahre",
        answerC = "45 Jahre",
        answerD = "26 Jahre",
        correctAnswer = 3,
        explanation = "Bulgakov starb am 10. März 1940. Eine stark zensierte Fassung von 'Der Meister und Margarita' erschien 1966 im Moskauer Literaturmagazin 'Moskwa' — 26 Jahre nach seinem Tod. Die vollständige, ungekürzte Ausgabe erschien erst 1973 im Westen.",
        difficulty = 5,
        funFact = "Bulgakov verbrannte 1930 aus Angst das erste Manuskript, schrieb den Roman aber neu. Er arbeitete bis kurz vor seinem Tod daran. Seiner Frau Elena gelang es, das Manuskript zu erhalten und schließlich zur Veröffentlichung zu bringen."
    ),

    // Question 28 - George Orwell / 1984
    Question(
        categoryId = 10,
        questionText = "In welchem Land wurde George Orwells '1984' im Jahr 2022 über Amazon verboten — mit der Begründung, es enthalte 'Inhalte gegen die Regierung'?",
        answerA = "China",
        answerB = "Russland",
        answerC = "Saudi-Arabien",
        answerD = "Iran",
        correctAnswer = 0,
        explanation = "In China wurden über Amazon-China 1984 und andere Orwell-Werke 2022 aus dem Sortiment entfernt. China zensiert politisch sensible Literatur systematisch. Orwells '1984' ist im chinesischen Internet zensiert und in staatlichen Buchhandlungen nicht erhältlich.",
        difficulty = 5,
        funFact = "Auch Aldous Huxleys 'Schöne neue Welt' und F. Scott Fitzgeralds 'Der große Gatsby' wurden bei Amazon China zeitweilig entfernt. '1984' steht auf Schulverbotslisten in verschiedenen US-Bundesstaaten wegen angeblich 'pro-kommunistischer' Inhalte — eine ironische Kehrtwendung."
    ),

    // Question 29 - Knut Hamsun / Kollaboration
    Question(
        categoryId = 10,
        questionText = "Welcher Nobelpreisträger für Literatur kollaborierte im Zweiten Weltkrieg mit den deutschen Besatzern Norwegens und wurde nach dem Krieg vor Gericht gestellt?",
        answerA = "Knut Hamsun",
        answerB = "Sigrid Undset",
        answerC = "Selma Lagerlöf",
        answerD = "Henrik Pontoppidan",
        correctAnswer = 0,
        explanation = "Knut Hamsun, der 1920 den Nobelpreis erhalten hatte, kollaborierte aktiv mit den deutschen Besatzern und traf Adolf Hitler persönlich. Nach dem Krieg wurde er wegen Landesverrats angeklagt. Er wurde für geistig eingeschränkt erklärt, musste aber eine erhebliche Geldstrafe zahlen. Sein literarisches Erbe wurde in Norwegen jahrzehntelang kontrovers diskutiert.",
        difficulty = 5,
        funFact = "Hamsun schrieb nach dem Tod Hitlers einen Nachruf, in dem er ihn als 'Krieger für die Menschheit' bezeichnete — was selbst viele seiner damaligen Unterstützer schockierte. Heute gilt er als literarisches Genie und moralisches Desaster."
    ),

    // Question 30 - Ezra Pound / Verrat
    Question(
        categoryId = 10,
        questionText = "Welcher amerikanische Dichter wurde nach dem Zweiten Weltkrieg wegen Verrats angeklagt, da er für das faschistische Italien Radiopropaganda gemacht hatte, und vermied das Gefängnis durch Einweisung in eine psychiatrische Klinik?",
        answerA = "T.S. Eliot",
        answerB = "William Carlos Williams",
        answerC = "Ezra Pound",
        answerD = "e.e. cummings",
        correctAnswer = 2,
        explanation = "Ezra Pound sendete von 1941 bis 1945 pro-faschistische Radiosendungen für Mussolinis Italien. 1945 wurde er verhaftet und in einem Käfig im Freien interniert. In den USA wurde er für geisteskrank erklärt und in die psychiatrische Klinik St. Elizabeths in Washington eingewiesen — wo er 13 Jahre blieb und weiter schrieb.",
        difficulty = 5,
        funFact = "Während seines psychiatrischen Aufenthalts erhielt Pound 1949 den renommierten Bollingen-Preis für Poesie — was zu einem Skandal führte, da er gleichzeitig wegen Landesverrats untergebracht war."
    ),

    // Question 31 - Marquis de Sade
    Question(
        categoryId = 10,
        questionText = "Wie viele Jahre seines Lebens verbrachte der Marquis de Sade insgesamt in Haft — unter dem Ancien Régime, der Revolution und Napoleon?",
        answerA = "Etwa 13 Jahre",
        answerB = "Etwa 5 Jahre",
        answerC = "Etwa 27 Jahre",
        answerD = "Etwa 38 Jahre",
        correctAnswer = 2,
        explanation = "De Sade verbrachte insgesamt etwa 27 Jahre seines Lebens in Gefängnissen und psychiatrischen Anstalten — unter Ludwig XVI. in der Bastille, während der Revolutionszeit und unter Napoleon. Er starb 1814 in der Irrenanstalt Charenton, wo er weiter schrieb und Theateraufführungen für die Insassen organisierte.",
        difficulty = 5,
        funFact = "De Sade schrieb viele seiner berühmtesten Werke im Gefängnis, darunter '120 Tage von Sodom', das er auf einer 12 Meter langen Papierrolle verfasste. Er glaubte, das Manuskript sei bei der Erstürmung der Bastille verloren — es tauchte aber Jahrzehnte später wieder auf."
    ),

    // Question 32 - Günter Grass / Waffen-SS-Geständnis
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr enthüllte Günter Grass, der Literaturnobelpreisträger von 1999, in seiner Autobiographie seine Mitgliedschaft in der Waffen-SS?",
        answerA = "2002",
        answerB = "2004",
        answerC = "2006",
        answerD = "2009",
        correctAnswer = 2,
        explanation = "In seiner 2006 erschienenen Autobiographie 'Beim Häuten der Zwiebel' gestand Grass, als 17-Jähriger Mitglied der Waffen-SS gewesen zu sein — Jahrzehnte nach seiner öffentlichen Rolle als moralisches Gewissen Deutschlands. Die Enthüllung löste internationale Empörung aus und beschädigte sein Ansehen erheblich.",
        difficulty = 5,
        funFact = "Grass war bekannt als scharfer Kritiker des deutschen Umgangs mit der NS-Vergangenheit. Die Offenbarung, dass er selbst Teil des Systems gewesen war, galt vielen als heuchlerisch. Er verteidigte sich damit, das Geständnis sei 'längst fällig' gewesen."
    ),

    // Question 33 - Naguib Mahfouz / Anschlag
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Nobelpreisträger Naguib Mahfouz auf offener Straße in Kairo Opfer eines islamistischen Anschlags?",
        answerA = "1988",
        answerB = "1997",
        answerC = "1992",
        answerD = "1994",
        correctAnswer = 3,
        explanation = "Am 14. Oktober 1994 wurde der 82-jährige Mahfouz in Kairo von einem islamistischen Extremisten niedergestochen und überlebte schwer verletzt. Sein Angreifer berief sich auf Mahfouz' Roman 'Kinder der Gabalawi', der in Ägypten verboten war. Mahfouz trug bleibende Nervenschäden am rechten Arm davon.",
        difficulty = 5,
        funFact = "Der Anschlag auf Mahfouz erfolgte sechs Jahre nach seinem Nobelpreis. Der Roman 'Kinder der Gabalawi', der den Anlass für Todesdrohungen bot, blieb in Ägypten noch jahrelang verboten — obwohl sein Autor Nobelpreisträger war."
    ),

    // Question 34 - Oscar Wilde / Strafverfahren
    Question(
        categoryId = 10,
        questionText = "Welche Strafe wurde Oscar Wilde 1895 nach dem Prozess wegen 'grober Unanständigkeit' verurteilt?",
        answerA = "Verbannung aus England",
        answerB = "Sechs Monate Haft",
        answerC = "Zwei Jahre Zuchthaus mit Zwangsarbeit",
        answerD = "Geldstrafe und öffentliche Beichte",
        correctAnswer = 2,
        explanation = "Oscar Wilde wurde 1895 zu zwei Jahren Zuchthaus mit Zwangsarbeit in Reading verurteilt — wegen homosexueller Handlungen ('gross indecency'). Diese Erfahrung brach ihn gesundheitlich. Nach der Entlassung 1897 lebte er als gebrochener Mann in Paris und starb bereits 1900 im Alter von 46 Jahren.",
        difficulty = 5,
        funFact = "Im Gefängnis schrieb Wilde den langen Brief 'De Profundis' an seinen früheren Geliebten Lord Alfred Douglas. Nach der Entlassung schrieb er 'The Ballad of Reading Gaol' — das letzte Werk, das er zu Lebzeiten veröffentlichte."
    ),

    // Question 35 - Wilde / Queensberry-Prozess
    Question(
        categoryId = 10,
        questionText = "Welchen schwerwiegenden Fehler machte Oscar Wilde, der direkt zu seiner Verhaftung und Verurteilung 1895 führte?",
        answerA = "Er veröffentlichte homoerotische Gedichte",
        answerB = "Er gestand seine Homosexualität in einer Zeitung",
        answerC = "Er flüchtete nach Frankreich und wurde ausgeliefert",
        answerD = "Er klagte den Marquess of Queensberry wegen Verleumdung — und verlor",
        correctAnswer = 3,
        explanation = "Wilde verklagte den Vater seines Geliebten Douglas, den Marquess of Queensberry, wegen Verleumdung — dieser hatte Wilde als 'Sodomiten' bezeichnet. Als Wilde den Verleumdungsprozess verlor, wurden die Beweise gegen ihn öffentlich, und die Staatsanwaltschaft eröffnete ein Strafverfahren. Freunde rieten Wilde zur Flucht, doch er blieb.",
        difficulty = 5,
        funFact = "Wilde hätte leicht nach Frankreich fliehen können — Freunde drängten ihn dazu und hielten sogar ein Schiff bereit. Doch er zögerte und wurde verhaftet. Warum er blieb, ist bis heute Gegenstand der Diskussion."
    ),

    // Question 36 - Doktor Zhivago / Erstveröffentlichung
    Question(
        categoryId = 10,
        questionText = "In welcher Sprache und in welchem Land erschien 'Doktor Schiwago' erstmals, bevor es je in Russland veröffentlicht wurde?",
        answerA = "Englisch, in London",
        answerB = "Deutsch, in Frankfurt",
        answerC = "Französisch, in Paris",
        answerD = "Italienisch, in Mailand",
        correctAnswer = 3,
        explanation = "Die Welturaufführung von 'Doktor Schiwago' fand im November 1957 in italienischer Übersetzung beim Mailänder Verlag Feltrinelli statt. Der Verleger Giangiacomo Feltrinelli hatte das Manuskript heimlich aus der Sowjetunion herausgebracht. In Russland erschien der Roman erstmals 1988 — 31 Jahre später.",
        difficulty = 5,
        funFact = "Der sowjetische Schriftstellerverband hatte Pasternak gedrängt, das Manuskript von Feltrinelli zurückzufordern. Pasternak sandte ein offizielles Rückforderungsschreiben, schrieb aber gleichzeitig heimlich an Feltrinelli, er solle es trotzdem veröffentlichen."
    ),

    // Question 37 - Lorca / Franco-Diktatur
    Question(
        categoryId = 10,
        questionText = "Was geschah mit Federico García Lorca zu Beginn des Spanischen Bürgerkriegs im Jahr 1936?",
        answerA = "Er wurde von franquistischen Truppen erschossen",
        answerB = "Er floh ins Exil nach Mexiko",
        answerC = "Er wurde in ein Lager deportiert",
        answerD = "Er starb an Typhus in einem Lazarett",
        correctAnswer = 0,
        explanation = "García Lorca wurde am 18. August 1936 von franquistischen Truppen in Granada verhaftet und erschossen. Sein Leichnam wurde in einem Massengrab verscharrt; der genaue Ort ist bis heute unbekannt. Unter Franco blieben seine Werke jahrzehntelang verboten.",
        difficulty = 5,
        funFact = "Lorca war zwar kein aktiver Politiker, aber seine Homosexualität, sein Ruhm und seine Verbindungen zu republikanischen Kreisen machten ihn zum Ziel der Faschisten. Francos Regime verbannte seine Werke bis in die 1950er Jahre."
    ),

    // Question 38 - Zola / J'Accuse
    Question(
        categoryId = 10,
        questionText = "Émile Zola veröffentlichte 1898 seinen berühmten offenen Brief 'J'accuse!' — was waren die unmittelbaren rechtlichen Folgen für ihn?",
        answerA = "Er wurde zu Gefängnis und einer Geldstrafe verurteilt",
        answerB = "Er wurde aus Frankreich verbannt",
        answerC = "Er wurde des Verrats angeklagt und freigesprochen",
        answerD = "Er verlor sein Bürgerrecht und seine Ehrungen",
        correctAnswer = 0,
        explanation = "Zola wurde wegen 'J'accuse!' wegen Verleumdung der Armee verurteilt — zu einem Jahr Gefängnis und einer Geldstrafe. Um der Haft zu entgehen, floh er nach England, wo er über ein Jahr im Exil lebte. 'J'accuse!' war sein offener Brief an den Präsidenten zugunsten des zu Unrecht verurteilten Alfred Dreyfus.",
        difficulty = 5,
        funFact = "Zola kehrte erst 1899 nach Frankreich zurück, als sich die politische Lage verändert hatte. 1902 starb er unter mysteriösen Umständen an einer Kohlenmonoxidvergiftung — manche Historiker vermuten Mord durch Dreyfus-Gegner."
    ),

    // Question 39 - Anna Achmatova / Sowjetunion
    Question(
        categoryId = 10,
        questionText = "Welche sowjetische Dichterin wurde 1946 durch Schdanows Erlass aus dem Schriftstellerverband ausgeschlossen und als 'Nonne und Hure' bezeichnet?",
        answerA = "Marina Zwetajewa",
        answerB = "Bella Achmadulina",
        answerC = "Anna Achmatowa",
        answerD = "Larissa Wassiljewa",
        correctAnswer = 2,
        explanation = "Anna Achmatowa wurde durch den 'Schdanow-Erlass' von 1946 als 'Nonne und Hure' beschimpft und aus dem Sowjetischen Schriftstellerverband ausgeschlossen. Jahrelang konnte sie nicht publizieren und lebte in extremer Armut. Ihr Sohn wurde mehrfach verhaftet und im Gulag inhaftiert.",
        difficulty = 5,
        funFact = "Achmatowa schrieb ihr Hauptwerk 'Requiem' — ein Klagezyklus über den Stalinschen Terror — in einer Zeit, in der sie und ihre Freunde die Gedichte nur mündlich weitergaben und sofort verbrannten. Es erschien erst 1963 im Westen."
    ),

    // Question 40 - Ovids Verbannung
    Question(
        categoryId = 10,
        questionText = "Kaiser Augustus verbannte den römischen Dichter Ovid 8 n.Chr. ans Schwarze Meer. Was nannte Ovid selbst als Ursache seiner Verbannung?",
        answerA = "Ein Gedicht und ein Fehler ('carmen et error')",
        answerB = "Ehebruch mit einer Senatorin",
        answerC = "Verschwörung gegen den Kaiser",
        answerD = "Gotteslästerung gegen den Kaiserkult",
        correctAnswer = 0,
        explanation = "Ovid selbst schrieb, seine Verbannung habe zwei Gründe: 'carmen et error' — ein Gedicht und ein Fehler. Das Gedicht war vermutlich die 'Ars Amatoria' (Liebeskunst), die Augustus als unmoralisch betrachtete. Der 'Fehler' bleibt bis heute eines der größten Geheimnisse der Antike.",
        difficulty = 5,
        funFact = "Ovid verbrachte die letzten neun Jahre seines Lebens in Tomis (heute Konstanza, Rumänien). Er schrieb verzweifelt Bittbriefe an Augustus und später an Tiberius — ohne Erfolg. Er starb 17/18 n.Chr. in der Verbannung."
    ),

    // Question 41 - Allen Ginsberg / Howl
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr und in welcher Stadt fand der Obszönitätsprozess gegen Allen Ginsbergs Gedicht 'Howl' statt, der mit einem Freispruch endete?",
        answerA = "1957 in San Francisco",
        answerB = "1955 in New York",
        answerC = "1959 in Chicago",
        answerD = "1961 in Los Angeles",
        correctAnswer = 0,
        explanation = "Das Verfahren gegen Lawrence Ferlinghetti von City Lights Books, der 'Howl and Other Poems' veröffentlicht hatte, fand 1957 in San Francisco statt. Richter Clayton Horn sprach Ferlinghetti frei mit der Begründung, das Gedicht habe 'erlösende soziale Bedeutung'.",
        difficulty = 5,
        funFact = "Der Prozess machte Ginsberg und die Beat Generation weltweit berühmt. 'Howl' beginnt mit den Zeilen: 'I saw the best minds of my generation destroyed by madness, starving hysterical naked...' — eine der einflussreichsten Eröffnungszeilen der amerikanischen Literaturgeschichte."
    ),

    // Question 42 - D.A.F. de Sade / 120 Tage
    Question(
        categoryId = 10,
        questionText = "Auf welchem ungewöhnlichen Schreibmaterial verfasste de Sade sein Werk '120 Tage von Sodom' in der Bastille, das er für verloren hielt?",
        answerA = "Auf Stoff, den er von Hemden abriss",
        answerB = "Auf einer 12 Meter langen Papierrolle",
        answerC = "Auf Baumrinde aus dem Gefängnishof",
        answerD = "Auf den Innenseiten von Bucheinbänden",
        correctAnswer = 1,
        explanation = "De Sade schrieb '120 Tage von Sodom' auf einer Papierrolle von ca. 12 Metern Länge, die er in einem Loch in der Wand seiner Zelle versteckte. Als er am 3. Juli 1789 — kurz vor der Erstürmung der Bastille — verlegt wurde, glaubte er, die Rolle sei verloren. Sie tauchte jedoch Jahrzehnte später wieder auf.",
        difficulty = 5,
        funFact = "Das Originalmanuskript gilt als eines der wertvollsten und skandalösesten Dokumente der Weltliteratur. Es wechselte mehrfach die Besitzer und wurde 2014 für über 7 Millionen Euro versteigert."
    ),

    // Question 43 - Verbotene Bücher / Apartheid Südafrika
    Question(
        categoryId = 10,
        questionText = "Wie viele Bücher waren im Apartheid-Südafrika offiziell auf der Verbotsliste, die von der 'Publications Control Board' verwaltet wurde?",
        answerA = "Ca. 500",
        answerB = "Ca. 45.000",
        answerC = "Ca. 10.000",
        answerD = "Ca. 1.000",
        correctAnswer = 1,
        explanation = "Im Apartheid-Südafrika standen bis zu 45.000 Bücher, Zeitschriften und andere Publikationen auf der Verbotsliste. Das umfasste politische Literatur, Werke schwarzer Autoren wie Nadine Gordimer, aber auch banale Gegenstände wie Spielzeugkataloge.",
        difficulty = 5,
        funFact = "Nadine Gordimer, die 1991 den Nobelpreis erhielt, hatte mehrere ihrer Romane in Südafrika verboten. Sie nannte das Schreiben in der Apartheid 'das Schreiben in einem Zustand des Krieges'."
    ),

    // Question 44 - Areopagitica / Milton
    Question(
        categoryId = 10,
        questionText = "John Milton schrieb 1644 'Areopagitica' — eines der ersten Plädoyers für Pressefreiheit in der Geschichte. Gegen welche Maßnahme richtete er sich?",
        answerA = "Gegen die kirchliche Bücherverbrennung",
        answerB = "Gegen ein Gesetz, das Vorabgenehmigung für alle Druckwerke verlangte",
        answerC = "Gegen die Verhaftung von Verlegern",
        answerD = "Gegen die Einfuhrbeschränkungen ausländischer Bücher",
        correctAnswer = 1,
        explanation = "Miltons 'Areopagitica' richtete sich gegen den Licensing Order von 1643, der verlangte, dass alle Druckwerke vor der Veröffentlichung staatlich genehmigt werden mussten. Miltons Schrift gilt als Gründungsdokument der modernen Pressefreiheitsdebatte.",
        difficulty = 5,
        funFact = "Milton schrieb 'Areopagitica' ohne Vorabgenehmigung — also in bewusstem Verstoß gegen das Gesetz, das er angriff. Er selbst wurde allerdings nicht verfolgt, da sein politischer Einfluss ihn schützte."
    ),

    // Question 45 - Zola / Naturalismus-Skandal
    Question(
        categoryId = 10,
        questionText = "Welcher Zola-Roman aus dem Rougon-Macquart-Zyklus wurde wegen seiner Darstellung von Alkoholismus und sexueller Verderbtheit in Paris nach der Veröffentlichung sofort zum Skandal?",
        answerA = "Germinal",
        answerB = "Nana",
        answerC = "La Bête humaine",
        answerD = "L'Assommoir",
        correctAnswer = 3,
        explanation = "Zolas 'L'Assommoir' (1877) über Alkoholismus in der Pariser Arbeiterklasse löste einen Skandal aus: Konservative Kritiker verurteilten die schonungslose Schilderung der Armut und des Alkohols als 'vulgär' und 'unanständig'. Es war Zolas erster großer Verkaufserfolg — gerade wegen des Skandals.",
        difficulty = 5,
        funFact = "'Nana' (1880), die Geschichte einer Kurtisane, war noch provokativer: Zola schilderte die Dekadenz des Zweiten Kaiserreichs durch die Augen einer Prostituierten. Das Buch verkaufte sich am ersten Tag 55.000 Mal."
    ),

    // Question 46 - Salman Rushdie / 2022 Anschlag
    Question(
        categoryId = 10,
        questionText = "In welchem US-Bundesstaat wurde Salman Rushdie im August 2022 bei einem Messerangriff niedergestochen?",
        answerA = "New York",
        answerB = "Massachusetts",
        answerC = "New Jersey",
        answerD = "Pennsylvania",
        correctAnswer = 0,
        explanation = "Rushdie wurde am 12. August 2022 bei einer Veranstaltung im Chautauqua Institution im Bundesstaat New York attackiert. Der Angreifer stach ihm mehr als zehnmal zu. Rushdie verlor die Sehkraft eines Auges und die Funktion einer Hand. Der Angreifer bekannte sich zu seiner Sympathie mit der Islamischen Revolutionsgarde.",
        difficulty = 5,
        funFact = "Rushdie verarbeitete die Folgen des Anschlags in seinem 2024 erschienenen Buch 'Knife: Meditations After an Attempted Murder'. Trotz der schweren Verletzungen arbeitet er weiterhin als Autor."
    ),

    // Question 47 - Index / Kopernikus
    Question(
        categoryId = 10,
        questionText = "Wann wurde Kopernikus' 'De revolutionibus orbium coelestium' auf den vatikanischen Index gesetzt — sofort nach Erscheinen 1543 oder erst später?",
        answerA = "Sofort 1543, im Jahr des Erscheinens",
        answerB = "1633, gleichzeitig mit Galileis Verurteilung",
        answerC = "1559, beim ersten Erscheinen des Index",
        answerD = "1616, über 70 Jahre nach dem Erscheinen",
        correctAnswer = 3,
        explanation = "Kopernikus' Hauptwerk erschien 1543, wurde aber erst 1616 auf den Index gesetzt — 73 Jahre später, und just in dem Jahr, in dem auch Galilei erste Probleme mit der Inquisition bekam. Der Vatikan reagierte erst auf das heliozentrische Weltbild, als es breiten wissenschaftlichen Einfluss gewonnen hatte.",
        difficulty = 5,
        funFact = "Kopernikus widmete sein Werk ausgerechnet dem Papst Paul III. — und starb im selben Jahr, in dem es erschien. So entging er jeglicher kirchlicher Reaktion. Das Buch blieb fast ein Dreivierteljahrhundert unbehelligt."
    ),

    // Question 48 - Voltaire / Bastille
    Question(
        categoryId = 10,
        questionText = "Voltaire war zweimal in der Bastille inhaftiert. Was war der Anlass für seine erste Inhaftierung 1717?",
        answerA = "Er hatte die Kirche in einem Gedicht verspottet",
        answerB = "Er hatte satirische Verse über den Regenten Philipp II. von Orléans geschrieben",
        answerC = "Er hatte an einer Verschwörung gegen Ludwig XV. teilgenommen",
        answerD = "Er hatte ein verbotenes Buch importiert",
        correctAnswer = 1,
        explanation = "Voltaire wurde 1717 in die Bastille gesperrt, weil er satirische Verse verfasst hatte, in denen er den Regenten Philipp II. von Orléans und dessen Tochter des Inzests verdächtigte. Er verbrachte dort 11 Monate und schrieb während dieser Zeit sein Epos 'La Henriade'.",
        difficulty = 5,
        funFact = "Voltaires zweite Haft in der Bastille 1726 erfolgte, weil er einen adeligen Schläger provoziert hatte, der ihn dann von Dienern verprügeln ließ. Als Voltaire Vergeltung forderte, landete er statt des Adligen im Gefängnis."
    ),

    // Question 49 - Mishima / Politischer Coup
    Question(
        categoryId = 10,
        questionText = "Was tat Yukio Mishima am 25. November 1970 nach dem Übergeben seines letzten Romanmanuskripts an seinen Verleger?",
        answerA = "Er hielt eine Rede vor dem japanischen Parlament",
        answerB = "Er floh nach Nordkorea",
        answerC = "Er zündete sein Literaturarchiv an",
        answerD = "Er beging rituellen Selbstmord (Seppuku) im Verteidigungsministerium",
        correctAnswer = 3,
        explanation = "Mishima übergab morgens das Manuskript des letzten Bandes seiner Tetralogie an seinen Verleger, hielt danach mit seinen Anhängern das Tokioter Verteidigungsministerium besetzt, rief die Soldaten zur Restauration des Kaisers auf — und beging dann rituellen Seppuku. Er war 45 Jahre alt.",
        difficulty = 5,
        funFact = "Mishima hatte jahrelang eine paramilitärische Gruppe, die 'Tatenokai' (Schildgesellschaft), aufgebaut und trainiert. Sein Tod war ein geplantes, inszeniertes Ende — das letzte Kunstwerk eines Autors, für den das Leben selbst Literatur war."
    ),

    // Question 50 - Cervantes / Gefängnis
    Question(
        categoryId = 10,
        questionText = "In welchem Gefängnis begann Miguel de Cervantes laut seiner eigenen Aussage mit der Arbeit am 'Don Quijote'?",
        answerA = "Im Schloss Segovia",
        answerB = "Im Gefängnis von Sevilla",
        answerC = "Im Turm von Toledo",
        answerD = "In der Burg von La Mancha",
        correctAnswer = 1,
        explanation = "Cervantes schrieb im Vorwort zum 'Don Quijote', das Buch sei 'im Gefängnis entstanden, wo jedes Unbehagen seinen Sitz hat'. Er war mehrfach inhaftiert, u.a. 1597 in Sevilla wegen Unregelmäßigkeiten als Steuereinzieher. Diese Erfahrung prägte das Werk, das als erster moderner Roman der Weltliteratur gilt.",
        difficulty = 5,
        funFact = "Cervantes hatte auch jahrelang als Sklave in Algier gelebt — er war 1575 auf dem Weg nach Spanien von Piraten gefangen genommen worden. Er versuchte viermal zu fliehen. 1580 wurde er freigekauft. Diese Erlebnisse flossen in sein gesamtes literarisches Werk ein."
    )

)
