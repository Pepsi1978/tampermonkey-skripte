package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsHard3(): List<Question> = listOf(

    // Question 1 — Gruppe 47: Gründung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde die Gruppe 47 von Hans Werner Richter gegründet?",
        answerA = "1947",
        answerB = "1945",
        answerC = "1950",
        answerD = "1949",
        correctAnswer = 0,
        explanation = "Die Gruppe 47 wurde 1947 von Hans Werner Richter gegründet und wurde zum einflussreichsten literarischen Netzwerk der westdeutschen Nachkriegsliteratur.",
        difficulty = 3,
        funFact = "Der Name 'Gruppe 47' leitet sich schlicht vom Gründungsjahr ab — eine bewusst nüchterne Namensgebung, die dem Zeitgeist der Trümmerliteratur entsprach."
    ),

    // Question 2 — Gruppe 47: Preisträger
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche österreichische Autorin erhielt 1953 als erste Frau den Preis der Gruppe 47 für ihre Lyrik?",
        answerA = "Ilse Aichinger",
        answerB = "Ingeborg Bachmann",
        answerC = "Christa Wolf",
        answerD = "Anna Seghers",
        correctAnswer = 1,
        explanation = "Ingeborg Bachmann erhielt 1953 den Preis der Gruppe 47 für ihre Lyrik, insbesondere für Gedichte aus dem Band 'Die gestundete Zeit'.",
        difficulty = 3,
        funFact = "Bachmanns Auftreten bei der Gruppe 47 gilt als einer der spektakulärsten Durchbrüche in der deutschen Literaturgeschichte — sie las ihre Gedichte in einem weißen Kleid und wurde sofort zum Star."
    ),

    // Question 3 — Trümmerliteratur: Merkmale
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches sprachliche Merkmal ist typisch für die Trümmerliteratur der Nachkriegszeit?",
        answerA = "Üppige, blumenreiche Sprache und romantische Metaphorik",
        answerB = "Komplexe verschachtelte Satzstrukturen im Stile Thomas Manns",
        answerC = "Kurze, knappe Sätze und bewusst schlichte, kahle Sprache",
        answerD = "Häufige Verwendung von Dialekt und Mundart",
        correctAnswer = 2,
        explanation = "Die Trümmerliteratur zeichnet sich durch kurze, karge Sätze und eine betont schlichte Sprache aus — als Reaktion auf den pompösen NS-Sprachstil und als Ausdruck der zerstörten Welt.",
        difficulty = 3,
        funFact = "Wolfgang Borchert prägte den Begriff 'Kahlschlagliteratur' als Selbstbezeichnung — die Sprache sollte wie nach einem Kahlschlag sein: nackt, direkt, ohne Schmuck."
    ),

    // Question 4 — Wolfgang Borchert: Draußen vor der Tür
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt die Hauptfigur in Wolfgang Borcherts Stück 'Draußen vor der Tür'?",
        answerA = "Hans Schnier",
        answerB = "Jan Bronski",
        answerC = "Alfred Ill",
        answerD = "Beckmann",
        correctAnswer = 3,
        explanation = "Die Hauptfigur in 'Draußen vor der Tür' heißt Beckmann — ein aus dem Krieg heimkehrender Soldat, der nirgendwo Aufnahme findet.",
        difficulty = 3,
        funFact = "Borchert schrieb das Stück in nur acht Tagen, schwerkrank an einer Lebererkrankung. Die Uraufführung im Hamburger Radio fand am 13. Februar 1947 statt — einen Tag nach Borcherts Tod wurde das Stück auf einer Bühne uraufgeführt."
    ),

    // Question 5 — Wolfgang Borchert: Biografie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "An welcher Krankheit starb Wolfgang Borchert 1947 im Alter von nur 26 Jahren?",
        answerA = "Schwerer Leberschaden durch Unterernährung und Kriegserkrankungen",
        answerB = "Tuberkulose",
        answerC = "Lungenentzündung infolge einer Kriegsverwundung",
        answerD = "Herzversagen nach einer Typhuserkrankung",
        correctAnswer = 0,
        explanation = "Borchert starb am 20. November 1947 in Basel an progressivem Leberversagen, das durch Unterernährung und Erkrankungen während des Kriegsdienstes verursacht worden war.",
        difficulty = 3,
        funFact = "Borchert starb in Basel, wo er wegen seiner Erkrankung behandelt wurde — ausgerechnet in der Schweiz, die er nie betreten durfte, als er noch gesund gewesen war."
    ),

    // Question 6 — Heinrich Böll: Nobel
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Heinrich Böll den Nobelpreis für Literatur?",
        answerA = "1965",
        answerB = "1972",
        answerC = "1978",
        answerD = "1969",
        correctAnswer = 1,
        explanation = "Heinrich Böll erhielt 1972 den Nobelpreis für Literatur für sein Gesamtwerk, das die moralische Erneuerung der deutschen Literatur nach dem Krieg verkörpert.",
        difficulty = 3,
        funFact = "Böll war der erste Deutschen nach Thomas Mann im Jahr 1929, der den Literaturnobelpreis gewann — und er nahm den Preis ausdrücklich im Namen einer von der Nazi-Diktatur befreiten deutschen Literatur an."
    ),

    // Question 7 — Heinrich Böll: Ansichten eines Clowns
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt spielt Bölls Roman 'Ansichten eines Clowns' hauptsächlich?",
        answerA = "Frankfurt am Main",
        answerB = "Hamburg",
        answerC = "Bonn",
        answerD = "Köln",
        correctAnswer = 2,
        explanation = "Der Roman spielt hauptsächlich in Bonn, wo der Clown Hans Schnier von seiner Wohnung aus telefoniert und mit den Scheinheiligkeiten der westdeutschen Gesellschaft konfrontiert wird.",
        difficulty = 3,
        funFact = "Böll wählte Bonn bewusst als Schauplatz — als Hauptstadt der jungen Bundesrepublik symbolisiert die Stadt die Restauration und den schnellen wirtschaftlichen Wiederaufbau ohne echte moralische Erneuerung."
    ),

    // Question 8 — Heinrich Böll: Ansichten eines Clowns – Figuren
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt die Frau, um die es in Bölls 'Ansichten eines Clowns' geht und die den Protagonisten verlässt?",
        answerA = "Leni",
        answerB = "Katharina",
        answerC = "Agnes",
        answerD = "Marie",
        correctAnswer = 3,
        explanation = "Marie ist die Geliebte des Clowns Hans Schnier. Sie verlässt ihn und heiratet den Katholiken Heribert Züpfner, was den Protagonisten in eine tiefe Krise stürzt.",
        difficulty = 3,
        funFact = "Böll kritisiert in dem Roman scharf den deutschen Katholizismus der Nachkriegszeit — Hans Schnier, selbst Protestant, durchschaut die Doppelmoral der katholischen Kreise um Marie."
    ),

    // Question 9 — Heinrich Böll: Billard um halbzehn
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Symbol für die moralische Komplizenschaft mit dem Nationalsozialismus in Bölls Roman 'Billard um halbzehn'?",
        answerA = "Das 'Sakrament des Büffels'",
        answerB = "Die Abtei Sankt Anton",
        answerC = "Die gelben Schuhe",
        answerD = "Das Billardspiel um halbzehn",
        correctAnswer = 0,
        explanation = "In 'Billard um halbzehn' steht das 'Sakrament des Büffels' symbolisch für die Komplizenschaft mit dem NS-Regime, während das 'Sakrament des Lammes' für die Opfer und die Resistenz steht.",
        difficulty = 3,
        funFact = "Der Roman spielt an einem einzigen Tag — dem 80. Geburtstag des Patriarchen Heinrich Fähmel — und entfaltet über Rückblenden und innere Monologe drei Generationen deutscher Geschichte."
    ),

    // Question 10 — Günter Grass: Blechtrommel
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt spielt Günter Grass' Roman 'Die Blechtrommel'?",
        answerA = "Breslau",
        answerB = "Danzig",
        answerC = "Königsberg",
        answerD = "Stettin",
        correctAnswer = 1,
        explanation = "Die Blechtrommel spielt hauptsächlich in Danzig (dem heutigen Gdańsk, Polen), der Heimatstadt von Grass, die im Roman als symbolischer Ort für das Schicksal der deutschen Minderheiten steht.",
        difficulty = 3,
        funFact = "Grass wurde 1927 in Danzig geboren und verarbeitete seine Kindheitserinnerungen in der Stadt, die nach dem Zweiten Weltkrieg polnisch wurde, in der Danziger Trilogie."
    ),

    // Question 11 — Günter Grass: Blechtrommel – Oskar
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Alter beschließt Oskar Matzerath in 'Die Blechtrommel', aufzuhören zu wachsen?",
        answerA = "Mit fünf Jahren",
        answerB = "Mit vier Jahren",
        answerC = "Mit drei Jahren",
        answerD = "Mit zwei Jahren",
        correctAnswer = 2,
        explanation = "Oskar Matzerath entscheidet sich mit drei Jahren, nicht mehr zu wachsen — an seinem dritten Geburtstag, an dem er eine Blechtrommel geschenkt bekommt.",
        difficulty = 3,
        funFact = "Oskars Entscheidung, als Dreijähriger zu verharren, ist eine Metapher für die Weigerung, an der Welt der Erwachsenen teilzunehmen — einer Welt, die den Nationalsozialismus hervorgebracht hat."
    ),

    // Question 12 — Günter Grass: Nobelpreis
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Günter Grass den Nobelpreis für Literatur?",
        answerA = "1994",
        answerB = "2002",
        answerC = "1995",
        answerD = "1999",
        correctAnswer = 3,
        explanation = "Günter Grass erhielt 1999 den Nobelpreis für Literatur, vor allem für 'Die Blechtrommel', die als sein Hauptwerk gilt.",
        difficulty = 3,
        funFact = "Die Schwedische Akademie lobte Grass dafür, dass er 'in munterem schwarzen Märchen das vergessene Gesicht der Geschichte' gezeichnet habe."
    ),

    // Question 13 — Günter Grass: Waffen-SS
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche brisante Enthüllung machte Günter Grass 2006 in seiner Autobiografie 'Beim Häuten der Zwiebel'?",
        answerA = "Er war als 17-Jähriger Mitglied der Waffen-SS gewesen",
        answerB = "Er hatte als Jugendlicher für die Gestapo informiert",
        answerC = "Er war nicht in Danzig, sondern in Breslau geboren worden",
        answerD = "Er hatte frühere Werke unter einem Pseudonym veröffentlicht",
        correctAnswer = 0,
        explanation = "In 'Beim Häuten der Zwiebel' gestand Grass, als 17-Jähriger zur Waffen-SS eingezogen worden zu sein — eine Enthüllung, die angesichts seiner moralischen Autorität als Autor großes Aufsehen erregte.",
        difficulty = 3,
        funFact = "Die Enthüllung erschütterte Grass' Ruf als moralisches Gewissen der deutschen Nachkriegsgesellschaft — viele sahen in seinem jahrzehntelangen Schweigen einen Verrat an der intellektuellen Ehrlichkeit, die er von anderen verlangt hatte."
    ),

    // Question 14 — Grass: Danziger Trilogie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche drei Werke bilden Günter Grass' 'Danziger Trilogie'?",
        answerA = "'Die Blechtrommel', 'Hundejahre' und 'Der Butt'",
        answerB = "'Die Blechtrommel', 'Katz und Maus' und 'Hundejahre'",
        answerC = "'Die Blechtrommel', 'Katz und Maus' und 'Der Butt'",
        answerD = "'Die Blechtrommel', 'Örtlich betäubt' und 'Hundejahre'",
        correctAnswer = 1,
        explanation = "Die Danziger Trilogie besteht aus 'Die Blechtrommel' (1959), 'Katz und Maus' (1961) und 'Hundejahre' (1963) — alle drei spielen in oder um Danzig.",
        difficulty = 3,
        funFact = "'Katz und Maus' ist die kürzeste der drei Erzählungen und erzählt die Geschichte des Gymnasiasten Mahlke, der das Ritterkreuz eines gefallenen Offiziers stiehlt."
    ),

    // Question 15 — Siegfried Lenz: Deutschstunde
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche Aufgabe muss der Protagonist Siggi Jepsen in Siegfried Lenz' 'Deutschstunde' schreiben, die den Roman rahmt?",
        answerA = "Eine Biografie seines Vaters",
        answerB = "Eine Analyse des deutschen Expressionismus",
        answerC = "Einen Aufsatz über 'Die Freuden der Pflicht'",
        answerD = "Eine Beschreibung der norddeutschen Landschaft",
        correctAnswer = 2,
        explanation = "Siggi Jepsen, der in einer Besserungsanstalt sitzt, muss einen Deutschaufsatz über 'Die Freuden der Pflicht' schreiben — dieser Aufsatz wird so lang, dass er zum Roman wird.",
        difficulty = 3,
        funFact = "Der Titel 'Deutschstunde' spielt doppeldeutig auf den Deutschunterricht an und auf die 'Lektion', die Deutschland in der NS-Zeit erteilt und erhalten hat."
    ),

    // Question 16 — Siegfried Lenz: Deutschstunde – Maler
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welchem realen Maler ist die Figur des verbotenen Malers Max Ludwig Nansen in Lenz' 'Deutschstunde' nachempfunden?",
        answerA = "Ernst Ludwig Kirchner",
        answerB = "Otto Dix",
        answerC = "Max Beckmann",
        answerD = "Emil Nolde",
        correctAnswer = 3,
        explanation = "Die Figur des Max Ludwig Nansen ist Emil Nolde nachempfunden, dem expressionistischen Maler, dem die Nazis ein Malverbot erteilten, obwohl er selbst zeitweise NSDAP-Mitglied war.",
        difficulty = 3,
        funFact = "Die historische Ironie bei Emil Nolde ist, dass er selbst Nationalsozialist war und dennoch mit einem Malverbot belegt wurde — Lenz nutzt diese Widersprüchlichkeit, um Fragen von Pflicht, Kunst und Moral zu stellen."
    ),

    // Question 17 — Friedrich Dürrenmatt: Der Besuch der alten Dame
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welcher fiktiven Stadt spielt Dürrenmatts 'Der Besuch der alten Dame'?",
        answerA = "Güllen",
        answerB = "Konradsberg",
        answerC = "Schwandorf",
        answerD = "Biedermann",
        correctAnswer = 0,
        explanation = "Das Stück spielt in der fiktiven, verarmten Kleinstadt Güllen — ein sprechender Name, denn 'Gülle' bedeutet im Schweizerdeutschen Jauche/Flüssigmist.",
        difficulty = 3,
        funFact = "Der Name 'Güllen' ist eine von Dürrenmatts typischen satirischen Namensgebungen: Die Stadt ist buchstäblich in der Gülle versunken und hofft auf die Milliarden der alten Dame als Rettung."
    ),

    // Question 18 — Dürrenmatt: Der Besuch der alten Dame – Figuren
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie heißt die zurückgekehrte Milliardärin in Dürrenmatts 'Der Besuch der alten Dame'?",
        answerA = "Rosa Pechmann",
        answerB = "Claire Zachanassian",
        answerC = "Hilde Riesemann",
        answerD = "Maria Kronauer",
        correctAnswer = 1,
        explanation = "Claire Zachanassian ist die steinreiche alte Dame, die in ihre Heimatstadt Güllen zurückkehrt und eine Milliarde anbietet — unter der Bedingung, dass ihr ehemaliger Geliebter Alfred Ill getötet wird.",
        difficulty = 3,
        funFact = "Dürrenmatt schuf den Namen 'Zachanassian' als Zusammensetzung aus den Namen dreier reicher Männer: Zacharoff (Waffenhändler), Onassis (Reeder) und Gulbenkian (Ölmagnat)."
    ),

    // Question 19 — Dürrenmatt: Der Besuch der alten Dame – Thema
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Warum fordert Claire Zachanassian den Tod von Alfred Ill in 'Der Besuch der alten Dame'?",
        answerA = "Er hat ihren Vater um sein Erbe betrogen",
        answerB = "Er hat ihren Bruder im Krieg denunziert",
        answerC = "Er hat sie als junges Mädchen verleugnet und bestochen Zeugen, um ihre Vaterschaftsklage zu vernichten",
        answerD = "Er hat ihre Mutter in den Ruin getrieben",
        correctAnswer = 2,
        explanation = "Als junger Mann hatte Ill Claire geschwängert, dann aber vor Gericht Zeugen bestochen, die sein Vaterschaft leugneten — Claire wurde daraufhin zur Prostitution gezwungen und ins Exil vertrieben.",
        difficulty = 3,
        funFact = "Dürrenmatt bezeichnete das Stück als 'tragische Komödie' — die Bürger von Güllen reden sich ein, aus Gerechtigkeit zu handeln, handeln aber tatsächlich aus Habgier."
    ),

    // Question 20 — Max Frisch: Homo Faber
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welchen Beruf hat Walter Faber, der Protagonist in Max Frischs Roman 'Homo Faber'?",
        answerA = "Arzt",
        answerB = "Architekt",
        answerC = "Journalist",
        answerD = "UNESCO-Ingenieur",
        correctAnswer = 3,
        explanation = "Walter Faber ist Ingenieur bei der UNESCO — ein technokratischer Rationalist, der die Welt durch Zahlen und Fakten begreift und das Irrationale verdrängt, bis ihn das Schicksal einholt.",
        difficulty = 3,
        funFact = "'Homo Faber' bedeutet 'der handelnde Mensch' — Frisch zeigt, wie die technische Vernunft des modernen Menschen an den Grenzen des Lebens scheitert, wenn Faber unwissentlich eine Liebesbeziehung mit seiner eigenen Tochter eingeht."
    ),

    // Question 21 — Max Frisch: Andorra
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Thema von Max Frischs Theaterstück 'Andorra' (1961)?",
        answerA = "Kollektive Schuld und Antisemitismus am Beispiel eines jungen Mannes, der fälschlicherweise für jüdisch gehalten wird",
        answerB = "Die Sprachlosigkeit zwischen Generationen nach dem Krieg",
        answerC = "Die moralische Verantwortung des Einzelnen gegenüber dem Staat",
        answerD = "Der Verlust der nationalen Identität durch Flucht und Emigration",
        correctAnswer = 0,
        explanation = "In 'Andorra' wird der junge Andri von allen für jüdisch gehalten, obwohl er es nicht ist — er internalisiert schließlich das Bild, das die anderen von ihm haben. Das Stück ist eine Parabel über Antisemitismus und kollektive Schuld.",
        difficulty = 3,
        funFact = "Das fiktive Land 'Andorra' hat nichts mit dem realen Andorra zu tun — Frisch nutzte den Namen, weil er keinen konkreten historischen Rahmen schaffen wollte, um die universelle Gültigkeit der Aussage zu betonen."
    ),

    // Question 22 — Max Frisch: Stiller
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welchen berühmten Satz sagt die Hauptfigur des Romans 'Stiller' von Max Frisch zu Beginn?",
        answerA = "'Ich bin ein Niemand, der überall fremd ist.'",
        answerB = "'Ich bin nicht Stiller!'",
        answerC = "'Niemand kann mir sagen, wer ich bin.'",
        answerD = "'Die Schweiz ist mein Gefängnis.'",
        correctAnswer = 1,
        explanation = "Der Roman beginnt mit dem berühmten Satz 'Ich bin nicht Stiller!' — der Protagonist weigert sich, seine frühere Identität als Anatol Ludwig Stiller anzuerkennen.",
        difficulty = 3,
        funFact = "Frischs 'Stiller' (1954) ist ein Schlüsselwerk der Frage nach Identität: Kann ein Mensch seine eigene Vergangenheit ablegen und neu werden? Die Antwort des Romans ist pessimistisch."
    ),

    // Question 23 — Ingeborg Bachmann: Tod
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Unter welchen ungeklärten Umständen starb Ingeborg Bachmann 1973 in Rom?",
        answerA = "Bei einem Autounfall auf dem Weg zu einer Lesung",
        answerB = "An einer Überdosis Schlaftabletten",
        answerC = "An den Folgen eines Brandes in ihrer Wohnung, möglicherweise durch Tabak",
        answerD = "An einem Herzinfarkt nach langer Krankheit",
        correctAnswer = 2,
        explanation = "Ingeborg Bachmann starb am 17. Oktober 1973 in Rom an den Folgen schwerer Verbrennungen, die sie bei einem Wohnungsbrand erlitten hatte — die genauen Umstände blieben ungeklärt.",
        difficulty = 3,
        funFact = "Bachmann kämpfte jahrelang mit Schlaf- und Schmerzmittelsucht. Der Brand, der sie tötete, entstand möglicherweise durch eine Zigarette, während sie unter dem Einfluss von Medikamenten schlief."
    ),

    // Question 24 — Ingeborg Bachmann: Werk
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches ist Ingeborg Bachmanns einziger vollendeter Roman?",
        answerA = "\"Das dreißigste Jahr\"",
        answerB = "\"Der gute Gott von Manhattan\"",
        answerC = "\"Simultan\"",
        answerD = "\"Malina\"",
        correctAnswer = 3,
        explanation = "\"Malina\" (1971) ist Bachmanns einziger vollendeter Roman und sollte der erste Teil des geplanten Zyklus \"Todesarten\" sein — die anderen Teile blieben Fragment.",
        difficulty = 3,
        funFact = "\"Malina\" wird als einer der radikalsten feministischen Romane der deutschen Literatur gesehen — die weibliche Ich-Erzählerin kämpft gegen die von ihr selbst gespaltenen Persönlichkeiten Malina und Ivan."
    ),

    // Question 25 — Christa Wolf: Der geteilte Himmel
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Christa Wolfs Roman 'Der geteilte Himmel'?",
        answerA = "1963",
        answerB = "1961",
        answerC = "1968",
        answerD = "1965",
        correctAnswer = 0,
        explanation = "'Der geteilte Himmel' erschien 1963 — zwei Jahre nach dem Bau der Berliner Mauer — und thematisiert direkt die Spaltung Deutschlands und ihre Auswirkungen auf persönliche Beziehungen.",
        difficulty = 3,
        funFact = "Der Roman wurde 1964 verfilmt und war einer der bedeutendsten DEFA-Filme — in der DDR wurde er als sozialistisches Bekenntnis gefeiert, im Westen als subtile Kritik an der Teilung gelesen."
    ),

    // Question 26 — Christa Wolf: Nachdenken über Christa T.
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Werk Christa Wolfs wurde von der DDR-Führung unterdrückt und durfte zunächst nur in minimaler Auflage erscheinen?",
        answerA = "\"Der geteilte Himmel\"",
        answerB = "\"Nachdenken über Christa T.\"",
        answerC = "\"Kassandra\"",
        answerD = "\"Kindheitsmuster\"",
        correctAnswer = 1,
        explanation = "'Nachdenken über Christa T.' (1968) wurde vom DDR-Schriftstellerkongress scharf angegriffen und durfte zunächst nur in einer Auflage von 800 Exemplaren erscheinen — viel zu wenig für die Nachfrage.",
        difficulty = 3,
        funFact = "Das Buch galt der DDR-Führung als 'subjektivistisch' und politisch verdächtig, weil es das Leben einer Frau zeigte, die trotz sozialistischer Ideale scheitert — eine nicht-heroische Darstellung, die das Regime ablehnte."
    ),

    // Question 27 — Christa Wolf: Biografie
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt wurde Christa Wolf 1929 geboren?",
        answerA = "Leipzig",
        answerB = "Dresden",
        answerC = "Landsberg an der Warthe (heute Gorzów Wielkopolski, Polen)",
        answerD = "Halle an der Saale",
        correctAnswer = 2,
        explanation = "Christa Wolf wurde 1929 in Landsberg an der Warthe geboren, einer Stadt, die nach dem Zweiten Weltkrieg polnisch wurde und heute Gorzów Wielkopolski heißt.",
        difficulty = 3,
        funFact = "Wie viele Autorinnen ihrer Generation musste Wolf als Jugendliche nach Kriegsende fliehen — ihre Fluchterfahrungen nach Mecklenburg prägten ihr literarisches Werk nachhaltig."
    ),

    // Question 28 — DDR-Literatur: Zensur
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie hieß die staatliche Zensurbehörde der DDR, die über alle Veröffentlichungen wachte?",
        answerA = "Amt für Literaturkontrolle",
        answerB = "Zentralrat für Kulturpolitik",
        answerC = "Ministerium für Volkskultur",
        answerD = "Hauptverwaltung Verlage und Buchhandel",
        correctAnswer = 3,
        explanation = "Die 'Hauptverwaltung Verlage und Buchhandel' (HV) im Ministerium für Kultur war die zentrale Zensurbehörde der DDR — kein Buch durfte ohne ihre Genehmigung erscheinen.",
        difficulty = 3,
        funFact = "Neben der offiziellen Zensur durch die Hauptverwaltung überwachte auch die Stasi den Literaturbetrieb intensiv — viele DDR-Autoren hatten inoffizielle Mitarbeiter in ihrem unmittelbaren Umfeld."
    ),

    // Question 29 — Wolf Biermann: Ausbürgerung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Wolf Biermann aus der DDR ausgebürgert?",
        answerA = "1976",
        answerB = "1972",
        answerC = "1979",
        answerD = "1968",
        correctAnswer = 0,
        explanation = "Wolf Biermann wurde 1976 aus der DDR ausgebürgert — während einer Konzertreise in Westdeutschland wurde ihm die Rückkehr in die DDR verboten.",
        difficulty = 3,
        funFact = "Biermanns Ausbürgerung löste eine Protestwelle unter DDR-Künstlern und Intellektuellen aus — zwölf bedeutende Kulturschaffende, darunter Christa Wolf und Stephan Hermlin, unterzeichneten einen offenen Protestbrief, der für viele von ihnen ernste Konsequenzen hatte."
    ),

    // Question 30 — Wolf Biermann: Werk
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt durfte Wolf Biermann in der DDR sein erstes Konzert geben, das dann zu seiner Ausbürgerung führte?",
        answerA = "Essen",
        answerB = "Köln",
        answerC = "Hamburg",
        answerD = "München",
        correctAnswer = 1,
        explanation = "Das Konzert, das zu Biermanns Ausbürgerung führte, fand am 13. November 1976 in Köln statt — es wurde im Westdeutschen Rundfunk übertragen und die DDR nutzte es als Vorwand für die Ausbürgerung.",
        difficulty = 3,
        funFact = "Biermanns Kölner Konzert ist eines der berühmtesten Konzerte der deutschen Musikgeschichte — die Live-LP davon wurde ein Bestseller und ist ein zeithistorisches Dokument."
    ),

    // Question 31 — Anna Seghers: Das siebte Kreuz
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was stellen die sieben Kreuze in Anna Seghers' Roman 'Das siebte Kreuz' dar?",
        answerA = "Denkmäler für gefallene Soldaten",
        answerB = "Kirchliche Symbole in einem katholischen Dorf",
        answerC = "Folterinstrumente im Konzentrationslager Westhofen, an die Flüchtlinge gebunden werden sollen",
        answerD = "Grabkreuze für im Exil gestorbene Emigranten",
        correctAnswer = 2,
        explanation = "Im KZ Westhofen werden sieben Kreuze als Folterinstrumente aufgestellt für sieben entflohene Häftlinge — das siebte Kreuz bleibt leer, weil Georg Heisler als einziger entkommen kann.",
        difficulty = 3,
        funFact = "Seghers schrieb den Roman im Exil in Mexico und schmuggelte das Manuskript heraus — das Buch erschien zunächst auf Englisch in den USA und wurde erst nach Kriegsende auf Deutsch veröffentlicht."
    ),

    // Question 32 — Anna Seghers: Biografie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches war der bürgerliche Name von Anna Seghers?",
        answerA = "Anna Kaufmann",
        answerB = "Anna Stern",
        answerC = "Netti Rosenbaum",
        answerD = "Netty Reiling",
        correctAnswer = 3,
        explanation = "Anna Seghers wurde als Netty Reiling am 19. November 1900 in Mainz geboren. Das Pseudonym 'Anna Seghers' übernahm sie von einem flämischen Maler des 17. Jahrhunderts.",
        difficulty = 3,
        funFact = "Seghers floh 1933 aus Deutschland, lebte im Exil in Frankreich, der Schweiz und Mexico, bevor sie 1947 in die DDR zurückkehrte, wo sie Präsidentin des DDR-Schriftstellerverbandes wurde."
    ),

    // Question 33 — Uwe Johnson: Mutmassungen über Jakob
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Womit beginnt und endet Uwe Johnsons Roman 'Mutmassungen über Jakob' (1959)?",
        answerA = "Jakobs Tod auf den Schienen — die Handlung ist eine Rekonstruktion durch verschiedene Perspektiven",
        answerB = "Jakobs Flucht in den Westen und seiner Rückkehr in die DDR",
        answerC = "Der Verhör Jakobs durch die Stasi über eine westdeutsche Agentin",
        answerD = "Jakobs Abschiedsbrief, der nach seinem Verschwinden gefunden wird",
        correctAnswer = 0,
        explanation = "Der Roman beginnt mit Jakobs Tod auf den Gleisen und rekonstruiert retrospektiv durch verschiedene Perspektiven und Stimmen die Ereignisse, die dazu führten — ob es Unfall, Suizid oder Mord war, bleibt offen.",
        difficulty = 3,
        funFact = "Johnson konnte 'Mutmassungen über Jakob' in der DDR nicht veröffentlichen, weil das Buch zu kritisch war — er brachte das Manuskript in den Westen und veröffentlichte es beim Suhrkamp Verlag in Frankfurt."
    ),

    // Question 34 — Uwe Johnson: Jahrestage
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie viele Bände umfasst Uwe Johnsons Hauptwerk 'Jahrestage' und welchen Zeitraum deckt es ab?",
        answerA = "Drei Bände, 1967–1975",
        answerB = "Vier Bände, 1967–1968 (mit Rückblenden bis in die NS-Zeit)",
        answerC = "Zwei Bände, 1966–1967",
        answerD = "Fünf Bände, 1960–1968",
        correctAnswer = 1,
        explanation = "'Jahrestage: Aus dem Leben von Gesine Cresspahl' erschien in vier Bänden (1970–1983) und verfolgt das Leben der Protagonistin Tag für Tag vom 21. August 1967 bis zum 20. August 1968 in New York — mit Rückblenden in die NS-Zeit.",
        difficulty = 3,
        funFact = "Der letzte Band erschien 1983, kurz vor Johnsons Tod — er wurde in extremer Isolation in der englischen Küstenstadt Sheerness-on-Sea vollendet, wohin Johnson sich zurückgezogen hatte."
    ),

    // Question 35 — Stefan Heym: Zensur
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Stefan Heym lebte in der DDR und schrieb auf Englisch und Deutsch. Welches seiner wichtigsten DDR-kritischen Werke wurde in der DDR zunächst verboten?",
        answerA = "\"Der König David Bericht\"",
        answerB = "\"Schwarzenberg\"",
        answerC = "\"5 Tage im Juni\"",
        answerD = "\"Collin\"",
        correctAnswer = 2,
        explanation = "'5 Tage im Juni' (über den Volksaufstand vom 17. Juni 1953 in der DDR) wurde in der DDR verboten und erschien zunächst nur in der Bundesrepublik — ein klares Beispiel für DDR-Zensur.",
        difficulty = 3,
        funFact = "Heym hatte eine außergewöhnliche Biografie: Als jüdischer Emigrant diente er in der US-Armee, kehrte aber in die DDR zurück — und wurde dort später auch vom SED-Regime verfolgt, weil er zu offen war."
    ),

    // Question 36 — Stefan Heym: Biografie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Stefan Heym war in der Weimarer Republik als Helmut Flieg bekannt. In welchem Land lebte er vor seiner Rückkehr in die DDR im Exil?",
        answerA = "In Frankreich und der Schweiz",
        answerB = "In Großbritannien",
        answerC = "In Mexico und Kuba",
        answerD = "In den Vereinigten Staaten",
        correctAnswer = 3,
        explanation = "Stefan Heym lebte im Exil in den USA, diente im Zweiten Weltkrieg in der US-Armee und schrieb zunächst auf Englisch, bevor er 1952 in die DDR zog.",
        difficulty = 3,
        funFact = "Heym war einer der wenigen DDR-Autoren, die auch in der westlichen Welt gut bekannt waren — er veröffentlichte auf Englisch und erhielt in den USA bedeutende literarische Preise, bevor er in die DDR zog."
    ),

    // Question 37 — Jurek Becker: Jakob der Lügner
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Lüge rettet in Jurek Beckers Roman 'Jakob der Lügner' zunächst das Leben der Ghetto-Bewohner?",
        answerA = "Jakob behauptet, ein Radio zu besitzen und Nachrichten von der näher rückenden russischen Front gehört zu haben",
        answerB = "Jakob erzählt, er sei mit einem deutschen Offizier befreundet, der ihnen Schutz versprochen habe",
        answerC = "Jakob behauptet, Pässe für alle Bewohner beschafft zu haben",
        answerD = "Jakob behauptet, eine Geheimwaffe versteckt zu haben, die die Deutschen aufhalten werde",
        correctAnswer = 0,
        explanation = "Jakob Heym behauptet fälschlicherweise, ein Radio zu besitzen und Nachrichten über die näher rückende sowjetische Befreiungsarmee gehört zu haben — diese Lüge gibt den Ghetto-Bewohnern Hoffnung zum Weiterleben.",
        difficulty = 3,
        funFact = "Jurek Becker selbst verbrachte seine Kindheit in verschiedenen Ghettos und Konzentrationslagern, darunter Ravensbrück. Er hat nur bruchstückhafte Erinnerungen daran — was ihn dazu brachte, sich die Geschichte literarisch zu erschließen."
    ),

    // Question 38 — Jurek Becker: Biografie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Land wurde 'Jakob der Lügner' 1999 als einziger DDR-Roman für den Oscar als bester fremdsprachiger Film nominiert?",
        answerA = "In der Bundesrepublik Deutschland",
        answerB = "In den Vereinigten Staaten (Hollywood-Verfilmung mit Robin Williams)",
        answerC = "In Frankreich",
        answerD = "In Israel",
        correctAnswer = 1,
        explanation = "Die Hollywood-Verfilmung von 'Jakob der Lügner' mit Robin Williams in der Hauptrolle wurde 1999 für den Oscar als bester fremdsprachiger Film nominiert. Bereits 1975 hatte eine DEFA-Verfilmung mit Armin Mueller-Stahl als einziger DDR-Film eine Oscar-Nominierung erhalten.",
        difficulty = 3,
        funFact = "Becker verließ die DDR 1977 nach dem Biermann-Protest, verlor seine SED-Mitgliedschaft und lebte fortan in Westdeutschland — bekannt wurde er einem breiten Publikum auch durch die TV-Serie 'Liebling Kreuzberg'."
    ),

    // Question 39 — Thomas Bernhard: Heldenplatz
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Stück von Thomas Bernhard sorgte 1988 vor seiner Uraufführung in Wien für massive politische Proteste?",
        answerA = "\"Die Macht der Gewohnheit\"",
        answerB = "\"Woodcutters\"",
        answerC = "\"Heldenplatz\"",
        answerD = "\"Der Theatermacher\"",
        correctAnswer = 2,
        explanation = "'Heldenplatz' (1988) provozierte vor seiner Uraufführung am Wiener Burgtheater heftige politische Proteste — das Stück kritisiert scharf den österreichischen Antisemitismus und die verklärende Erinnerung an den 'Anschluss' 1938.",
        difficulty = 3,
        funFact = "Bernhard ließ das Stück zum 50. Jahrestag des Anschlusses aufführen — bewusst provokativ. Er bezeichnete Österreich darin als 'sechs Millionen Debilen', was zu parlamentarischen Debatten und Protesten führte."
    ),

    // Question 40 — Thomas Bernhard: Werk
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie lautet der Titel von Thomas Bernhards erstem Roman, der 1963 erschien und seinen Durchbruch markierte?",
        answerA = "\"Der Atem\"",
        answerB = "\"Verstörung\"",
        answerC = "\"Das Kalkwerk\"",
        answerD = "\"Frost\"",
        correctAnswer = 3,
        explanation = "'Frost' erschien 1963 und war Bernhards Debütroman — er etablierte sofort seinen charakteristischen Stil: lange Monologe, düstere Weltsicht, Austria-Kritik und Themen um Tod und Verfall.",
        difficulty = 3,
        funFact = "Bernhard vermachte in seinem Testament ausdrücklich, dass seine Werke in Österreich weder aufgeführt noch neu gedruckt werden sollten — dieses Verbot wurde nach seinem Tod 1989 mit Billigung seiner Erben faktisch ignoriert."
    ),

    // Question 41 — Ilse Aichinger: Die größere Hoffnung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches war das Hauptwerk der österreichischen Autorin Ilse Aichinger, das 1948 erschien und von einem jüdischen Mädchen in Wien handelt?",
        answerA = "\"Die größere Hoffnung\"",
        answerB = "\"Spiegelgeschichte\"",
        answerC = "\"Zu keiner Stunde\"",
        answerD = "\"Der Gefesselte\"",
        correctAnswer = 0,
        explanation = "'Die größere Hoffnung' (1948) ist Aichingers einziger Roman — er handelt von der halbjüdischen Ellen in Wien während der NS-Zeit und gilt als eines der frühen Meisterwerke über Judenverfolgung in Österreich.",
        difficulty = 3,
        funFact = "Aichinger war selbst Tochter einer jüdischen Mutter und erlebte die NS-Verfolgung in Wien am eigenen Leib — ihre Zwillingsschwester überlebte die Deportation nicht. Diese Erfahrungen prägten ihr gesamtes Werk."
    ),

    // Question 42 — Gruppe 47: Hans Werner Richter
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Eigenschaft machte die Treffen der Gruppe 47 so besonders und manchmal gefürchtet?",
        answerA = "Die Mitglieder mussten ihre Werke anonym einreichen und wurden erst nach der Abstimmung bekannt gegeben",
        answerB = "Der Autor las aus seinem unveröffentlichten Werk und wurde danach sofort und direkt von den anwesenden Kollegen kritisiert — ohne Recht auf Erwiderung",
        answerC = "Die Gruppe vergab einen Preis, über den alle Mitglieder geheim abstimmten",
        answerD = "Nur Autoren unter 35 Jahren durften lesen — ältere Teilnehmer durften nur zuhören",
        correctAnswer = 1,
        explanation = "Bei der Gruppe 47 las der Autor aus seinem unveröffentlichten Werk vor und musste danach schweigend die oft scharfe Kritik der anderen Mitglieder ertragen — ohne sich zu verteidigen. Diese 'Rasur' genannte Kritikrunde war berühmt und gefürchtet.",
        difficulty = 3,
        funFact = "Die Regel des Schweigens während der Kritik führte dazu, dass manche Autoren die Treffen als demütigend empfanden. Peter Handke provozierte 1966 bewusst, indem er der Gruppe 'Beschreibungsimpotenz' vorwarf."
    ),

    // Question 43 — Heinrich Böll: Die verlorene Ehre der Katharina Blum
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Thema in Bölls Erzählung 'Die verlorene Ehre der Katharina Blum' (1974)?",
        answerA = "Die Korruption in der westdeutschen Justiz der Nachkriegszeit",
        answerB = "Die Aufarbeitung der NS-Vergangenheit durch eine junge Frau",
        answerC = "Die Zerstörung eines Menschen durch rücksichtslosen Boulevardjournalismus und staatliche Repression",
        answerD = "Der moralische Verfall der deutschen Mittelschicht im Wirtschaftswunder",
        correctAnswer = 2,
        explanation = "Böll zeigt in 'Die verlorene Ehre der Katharina Blum', wie eine junge Frau durch die Enthüllungsberichte einer Boulevardzeitung (eindeutig an die BILD-Zeitung angelehnt) und die Polizei in den Ruin getrieben wird.",
        difficulty = 3,
        funFact = "Böll schrieb die Erzählung als direkte Reaktion auf die BILD-Zeitung, die ihn selbst nach einem Artikel über die RAF-Fahndung als 'Sympathisanten' diffamiert hatte."
    ),

    // Question 44 — DDR-Literatur: Prenzlauer Berg
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche inoffizielle literarische Szene in Ost-Berlin galt in den 1980er Jahren als wichtigstes Zentrum unzensierter DDR-Literatur?",
        answerA = "Die Weißenseer Gruppe",
        answerB = "Die Schönhausener Schule",
        answerC = "Das Literarische Kollektiv Mitte",
        answerD = "Die Prenzlauer Berg-Szene",
        correctAnswer = 3,
        explanation = "Die Prenzlauer Berg-Szene in Ost-Berlin war in den 1980er Jahren das wichtigste Zentrum unzensierten literarischen Schaffens in der DDR — die Autoren verbreiteten ihre Texte in handgehefteten Heften ('Samisdats').",
        difficulty = 3,
        funFact = "Nach der Wende wurde bekannt, dass mehrere Protagonisten der Prenzlauer Berg-Szene inoffizielle Mitarbeiter der Stasi waren — eine Enthüllung, die die DDR-Literaturgeschichte nachhaltig erschütterte."
    ),

    // Question 45 — Christa Wolf: Kassandra
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche antike Figur dient Christa Wolf in ihrem 1983 erschienenen Roman als Projektionsfläche für Kritik an Patriarchat und Kriegslogik?",
        answerA = "Kassandra, die trojanische Seherin",
        answerB = "Medea, die Fremde aus Kolchis",
        answerC = "Elektra, die Rächerin",
        answerD = "Antigone, die Widerständige",
        correctAnswer = 0,
        explanation = "In 'Kassandra' (1983) gibt Christa Wolf der trojanischen Seherin eine Stimme — das Werk ist eine feministische Umdeutung des Trojanischen Krieges und eine Parabel auf Kriegsmechanismen und das Patriarchat.",
        difficulty = 3,
        funFact = "Wolf entwickelte 'Kassandra' aus einer Vorlesungsreihe an der Frankfurter Universität heraus — die 'Voraussetzungen einer Erzählung: Kassandra' erschien zusammen mit dem Roman und erklärt Wolfs poetologischen Ansatz."
    ),

    // Question 46 — Böll: Gruppenportrait mit Dame
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche literarische Technik verwendet Böll in 'Gruppenbild mit Dame' (1971) als strukturelles Mittel?",
        answerA = "Er schreibt aus der Perspektive eines allwissenden Erzählers im 19. Jahrhundert-Stil",
        answerB = "Ein anonymer 'Verf.' befragt verschiedene Zeitzeugen und montiert ihre Aussagen über Leni Pfeiffer",
        answerC = "Das Buch besteht ausschließlich aus Briefen und Tagebucheinträgen",
        answerD = "Die Protagonistin erzählt ihre Geschichte rückblickend in der ersten Person",
        correctAnswer = 1,
        explanation = "In 'Gruppenbild mit Dame' bedient sich Böll eines fiktiven Verfassers ('Verf.'), der verschiedene Personen über die Hauptfigur Leni Pfeiffer befragt und deren Aussagen dokumentiert — eine dokumentarisch-collagehafte Technik.",
        difficulty = 3,
        funFact = "Das Buch entstand in der Zeit der Studentenbewegung und der RAF-Diskussion — Böll zeigt in Leni eine Figur, die durch ihre schlichte Menschlichkeit und Weigerung zu urteilen zum moralischen Maßstab wird."
    ),

    // Question 47 — Trümmerliteratur: Wichtige Werke
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Kurzgeschichte von Heinrich Böll gilt als paradigmatisches Werk der Trümmerliteratur, in der ein sterbender Soldat seine eigene frühere Schulaufgabe an der Wand erkennt?",
        answerA = "\"Wanderer, kommst du nach Spa...\"",
        answerB = "\"Die Postkarte\"",
        answerC = "\"Als der Krieg ausbrach\"",
        answerD = "\"Nicht nur zur Weihnachtszeit\"",
        correctAnswer = 0,
        explanation = "'Wanderer, kommst du nach Spa...' (1950) gilt als paradigmatisches Werk der Trümmerliteratur: Ein schwer verwundeter Soldat wird in sein eigenes früheres Gymnasium eingeliefert und erkennt an der Tafel seine eigene Schulaufgabe.",
        difficulty = 3,
        funFact = "Der Titel ist ein abgebrochenes Zitat des Simonides-Epigramms über die spartanischen Gefallenen bei den Thermopylen — Böll zeigt so die grausame Lüge der heroischen Selbstaufopferung, die der NS-Staat propagiert hatte."
    ),

    // Question 48 — Max Frisch: Biedermann und die Brandstifter
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was ist die zentrale Parabel in Max Frischs 'Biedermann und die Brandstifter' (1958)?",
        answerA = "Die Unfähigkeit des Kleinbürgers, Klassenunterschiede zu überwinden",
        answerB = "Die Mitschuld der Intellektuellen an der Entstehung des Nationalsozialismus",
        answerC = "Der Niedergang der bürgerlichen Familie in der Nachkriegsgesellschaft",
        answerD = "Die Komplizenschaft des braven Bürgers durch Wegschauen und Selbstbetrug gegenüber totalitären Kräften",
        correctAnswer = 3,
        explanation = "Biedermann lässt Brandstifter in seinen Dachboden einziehen und ihnen sogar beim Verlegen der Zündschnüre helfen — das ist die Parabel auf die Mitläufer, die durch Feigheit und Bequemlichkeit den Faschismus ermöglichten.",
        difficulty = 3,
        funFact = "Frisch schrieb das Stück auch als Reaktion auf den kommunistischen Putsch in der Tschechoslowakei 1948 — die Parabel gilt als universell für alle Formen des totalitären Takeovers, bei denen 'brave Bürger' wegschauen."
    ),

    // Question 49 — DDR-Literatur: Literaturstreit
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Debatte erschütterte die deutsche Literaturlandschaft 1990/91 und drehte sich um die Frage, ob DDR-Autoren kollaboriert hätten?",
        answerA = "Der 'deutsch-deutsche Literaturstreit', ausgelöst durch Christa Wolfs 'Was bleibt'",
        answerB = "Die 'Kanzler-Affäre', bei der Autoren Kohls Kulturpolitik kritisierten",
        answerC = "Der 'Prenzlauer-Berg-Streit' um Stasi-Verstrickungen",
        answerD = "Der 'Biermann-Streit' um die Ausreise von DDR-Autoren",
        correctAnswer = 0,
        explanation = "Der 'deutsch-deutsche Literaturstreit' von 1990/91 wurde durch Christa Wolfs 'Was bleibt' ausgelöst — westdeutsche Kritiker warfen ihr vor, als privilegierte DDR-Schriftstellerin mit dem Regime kollaboriert zu haben.",
        difficulty = 3,
        funFact = "Christa Wolf hatte 'Was bleibt' 1979 geschrieben, aber erst 1990 veröffentlicht — dieser Zeitpunkt der Veröffentlichung nach der Wende wurde ihr als Opportunismus ausgelegt, da das Risiko des Verbots nun nicht mehr bestand."
    ),

    // Question 50 — Heinrich Böll: Geburtsort und Prägung
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher deutschen Stadt wurde Heinrich Böll geboren, und welche prägende persönliche Eigenschaft begründete seine lebenslange Kritik an Militarismus und Nationalsozialismus?",
        answerA = "Düsseldorf — er war Sohn eines Militäroffiziers und lehnte dessen Weltbild ab",
        answerB = "Köln — er war überzeugter rheinischer Katholik und Pazifist, der die Heuchelei der Kirche und des Militärs ablehnte",
        answerC = "Bonn — er studierte Theologie und wurde dann zum atheistischen Kriegsgegner",
        answerD = "Aachen — er war Sohn eines protestantischen Pfarrers, der gegen die 'Deutschen Christen' kämpfte",
        correctAnswer = 1,
        explanation = "Heinrich Böll wurde am 21. Dezember 1917 in Köln geboren und war ein tief verwurzelter rheinischer Katholik — seine Kritik richtete sich gerade gegen die Komplizenschaft der deutschen Kirche mit dem Nationalsozialismus.",
        difficulty = 3,
        funFact = "Böll desertierte gegen Ende des Zweiten Weltkriegs mehrfach und ließ sich schließlich von Amerikanern gefangen nehmen — ein Akt der Selbstrettung, der ihm ermöglichte zu überleben und der sein pazifistisches Werk prägte."
    )

)
