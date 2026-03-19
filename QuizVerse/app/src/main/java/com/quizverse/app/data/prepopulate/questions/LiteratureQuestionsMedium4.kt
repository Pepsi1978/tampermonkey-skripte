package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMedium4(): List<Question> = listOf(

    // Question 1 — Rilke: Der Panther
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wer schrieb das Gedicht 'Der Panther'?",
        answerA = "Rainer Maria Rilke",
        answerB = "Stefan George",
        answerC = "Hugo von Hofmannsthal",
        answerD = "Georg Heym",
        correctAnswer = 0,
        explanation = "Rainer Maria Rilke schrieb 'Der Panther' zwischen 1902 und 1903 in Paris und veröffentlichte es 1907 in den 'Neuen Gedichten'.",
        difficulty = 2,
        funFact = "Rilke beobachtete den Panther im Jardin des Plantes in Paris — einem botanischen Garten mit einer Menagerie. Das Gedicht gilt als Paradebeispiel des 'Dinggedichts'."
    ),

    // Question 2 — Rilke: Duineser Elegien
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wo entstand der erste Vers der Duineser Elegien von Rilke?",
        answerA = "In einem Prager Kaffeehaus",
        answerB = "Auf der Burg Duino bei Triest",
        answerC = "In einem Pariser Atelier",
        answerD = "In einem Münchner Hotel",
        correctAnswer = 1,
        explanation = "Rilke hörte nach der Überlieferung auf den Zinnen der Burg Duino bei Triest eine Stimme aus dem Wind: 'Wer, wenn ich schriee, hörte mich denn aus der Engel Ordnungen?'",
        difficulty = 2,
        funFact = "Die Duineser Elegien wurden 1923 veröffentlicht — fast ein Jahrzehnt nach ihrer Entstehung. Sie gelten als eines der bedeutendsten Werke der deutschsprachigen Lyrik des 20. Jahrhunderts."
    ),

    // Question 3 — Goethe: Erlkönig
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche literarische Form hat Goethes 'Erlkönig'?",
        answerA = "Sonett",
        answerB = "Ode",
        answerC = "Ballade",
        answerD = "Elegie",
        correctAnswer = 2,
        explanation = "Der Erlkönig (1782) ist eine Ballade — eine strophisch gegliederte Gedichtform, die epische, dramatische und lyrische Elemente vereint und eine spannungsreiche Geschichte erzählt.",
        difficulty = 2,
        funFact = "Franz Schubert vertonte den Erlkönig 1815 im Alter von nur 18 Jahren. Die Komposition gilt als eine der bekanntesten Liedvertonungen der Klassik."
    ),

    // Question 4 — Goethe: Prometheus
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher Epoche entstand Goethes Hymne 'Prometheus'?",
        answerA = "Klassik",
        answerB = "Romantik",
        answerC = "Aufklärung",
        answerD = "Sturm und Drang",
        correctAnswer = 3,
        explanation = "Goethes Hymne 'Prometheus' entstand zwischen 1772 und 1774 und gehört zur Epoche des Sturm und Drang, die sich durch rebellischen Individualismus und den Aufstand gegen Autoritäten auszeichnet.",
        difficulty = 2,
        funFact = "Friedrich Heinrich Jacobi druckte die Hymne erstmals unautorisiert ab. Goethe selbst nahm sie erst 1789 in seine gesammelten Schriften auf."
    ),

    // Question 5 — Heine: Loreley
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr schrieb Heinrich Heine das Gedicht 'Die Lore-Ley'?",
        answerA = "1824",
        answerB = "1812",
        answerC = "1835",
        answerD = "1848",
        correctAnswer = 0,
        explanation = "Heinrich Heine schrieb 'Die Lore-Ley' im Jahr 1824. Das Gedicht gehört zur Epoche der Romantik und greift einen Sagenstoff auf, der von Clemens Brentano 1801 erfunden worden war.",
        difficulty = 2,
        funFact = "Friedrich Silcher vertonte Heines Gedicht 1837, sodass es zum berühmten Volkslied wurde. Während der NS-Zeit wurde das Gedicht als 'Autor unbekannt' gedruckt, da Heine Jude war."
    ),

    // Question 6 — Heine: Loreley Komponist
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer vertonte Heinrich Heines Loreley-Gedicht als Volkslied?",
        answerA = "Franz Schubert",
        answerB = "Friedrich Silcher",
        answerC = "Robert Schumann",
        answerD = "Johannes Brahms",
        correctAnswer = 1,
        explanation = "Friedrich Silcher vertonte Heines Gedicht 'Die Lore-Ley' im Jahr 1837. Seitdem ist die Loreley als Volkslied weltbekannt.",
        difficulty = 2,
        funFact = "Heines Gedicht ist ironisch und romantisch zugleich — er verwendet typische Romantik-Motive, verleiht ihnen aber eine distanzierte, moderne Note."
    ),

    // Question 7 — Paul Celan: Todesfuge
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Thema von Paul Celans Gedicht 'Todesfuge'?",
        answerA = "Der Erste Weltkrieg",
        answerB = "Das Exil in Paris",
        answerC = "Der Holocaust",
        answerD = "Die Französische Revolution",
        correctAnswer = 2,
        explanation = "Celans 'Todesfuge' (verfasst ca. 1945, veröffentlicht 1948) befasst sich mit dem Holocaust und der Vernichtung der Juden in Konzentrationslagern.",
        difficulty = 2,
        funFact = "Der Titel verweist auf die Fuge als Musikform — Celan hatte gelesen, dass Juden in Konzentrationslagern Tanzmusik spielen mussten. Das Gedicht gilt als eines der bedeutendsten Werke der Nachkriegsliteratur."
    ),

    // Question 8 — Celan: Biographie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Aus welchem Land stammte der Dichter Paul Celan ursprünglich?",
        answerA = "Deutschland",
        answerB = "Österreich",
        answerC = "Polen",
        answerD = "Rumänien",
        correctAnswer = 3,
        explanation = "Paul Celan (1920–1970) wurde in Czernowitz im damaligen Rumänien (heute Ukraine) geboren. Er schrieb auf Deutsch, obwohl er kein Deutscher war.",
        difficulty = 2,
        funFact = "Celans bürgerlicher Name war Paul Antschel. 'Celan' ist ein Anagramm von 'Ancel', der rumänischen Schreibweise seines Nachnamens."
    ),

    // Question 9 — Schiller: Lied von der Glocke
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Schillers 'Das Lied von der Glocke' veröffentlicht?",
        answerA = "1800",
        answerB = "1786",
        answerC = "1812",
        answerD = "1795",
        correctAnswer = 0,
        explanation = "Friedrich Schillers 'Das Lied von der Glocke' wurde im Jahr 1800 veröffentlicht. Es ist eine der längsten und bekanntesten deutschen Balladen.",
        difficulty = 2,
        funFact = "Das Gedicht beginnt mit den Worten 'Fest gemauert in der Erden'. Jacob Grimm nannte es 1859 'dieses unvergleichliche Gedicht' und erklärte es zum nationalen Einheitssymbol."
    ),

    // Question 10 — Schiller: Ode an die Freude
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer vertonte Schillers 'Ode an die Freude' in seiner 9. Symphonie?",
        answerA = "Wolfgang Amadeus Mozart",
        answerB = "Ludwig van Beethoven",
        answerC = "Franz Joseph Haydn",
        answerD = "Johannes Brahms",
        correctAnswer = 1,
        explanation = "Ludwig van Beethoven vertonte Schillers Ode in seiner 9. Symphonie (1824). Beethoven war zu diesem Zeitpunkt bereits vollständig taub.",
        difficulty = 2,
        funFact = "Die Melodie von Beethovens Vertonung ist seit 1985 die offizielle Hymne der Europäischen Union. Beethovens Jugendtraum war es, dieses Gedicht zu vertonen."
    ),

    // Question 11 — Bertolt Brecht: Dreigroschenoper
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wo hatte Brechts 'Die Dreigroschenoper' ihre Uraufführung?",
        answerA = "Münchner Kammerspiele",
        answerB = "Burgtheater Wien",
        answerC = "Theater am Schiffbauerdamm, Berlin",
        answerD = "Deutsches Theater Hamburg",
        correctAnswer = 2,
        explanation = "Die Dreigroschenoper hatte am 31. August 1928 am Theater am Schiffbauerdamm in Berlin Premiere und wurde zur erfolgreichsten deutschen Theaterproduktion bis 1933.",
        difficulty = 2,
        funFact = "Das bekannteste Lied der Dreigroschenoper, 'Die Moritat von Mackie Messer', schrieb Brecht angeblich in der Nacht vor der Uraufführung."
    ),

    // Question 12 — Brecht: Gedichte
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt Brechts berühmte Gedichtsammlung aus dem dänischen Exil (1939)?",
        answerA = "Hauspostille",
        answerB = "Buckower Elegien",
        answerC = "Lesebuch für Städtebewohner",
        answerD = "Svendborger Gedichte",
        correctAnswer = 3,
        explanation = "Die 'Svendborger Gedichte' (1939) entstanden während Brechts Exil in Svendborg, Dänemark, und sind geprägt von politischen und sozialkritischen Themen.",
        difficulty = 2,
        funFact = "Brecht schrieb in seinem Leben über 2.500 Gedichte. Die 'Hauspostille' von 1927 war seine erste bedeutende Gedichtsammlung."
    ),

    // Question 13 — Walther von der Vogelweide
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was ist 'Minnesang' im Mittelhochdeutschen?",
        answerA = "Kunstvolle Liebeslyrik des Hochmittelalters",
        answerB = "Religiöse Hymnen für den Kirchengesang",
        answerC = "Kriegslieder für Ritter",
        answerD = "Volkslieder aus dem bäuerlichen Milieu",
        correctAnswer = 0,
        explanation = "Minnesang ist eine kunstvolle Form der Lyrik im Hochmittelalter. 'Minne' ist das mittelhochdeutsche Wort für Liebe — speziell die höfische Liebe.",
        difficulty = 2,
        funFact = "Die größte Sammlung mittelhochdeutscher Minnelieder ist der Codex Manesse (14. Jh.), der etwa 90% von Walthers bekannten Liedern enthält."
    ),

    // Question 14 — Walther von der Vogelweide: Leben
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welchem Stand entstammte Walther von der Vogelweide wahrscheinlich?",
        answerA = "Hohem Reichsadel",
        answerB = "Niederem österreichischen Adel",
        answerC = "Geistlichem Stand (Mönch)",
        answerD = "Bürgertum einer Reichsstadt",
        correctAnswer = 1,
        explanation = "Walther von der Vogelweide (ca. 1170–1230) entstammte wahrscheinlich dem niederen österreichischen Adel und wirkte als fahrender Sänger an verschiedenen Fürstenhöfen.",
        difficulty = 2,
        funFact = "Walther wurde von Kaiser Friedrich II. gefördert und erhielt von ihm ein Lehen — ein wichtiger Einschnitt in seinem Leben als fahrender Sänger."
    ),

    // Question 15 — Sonett: Form
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Aus wie vielen Versen besteht ein klassisches Sonett?",
        answerA = "Zwölf Verse",
        answerB = "Sechzehn Verse",
        answerC = "Vierzehn Verse",
        answerD = "Achtzehn Verse",
        correctAnswer = 2,
        explanation = "Ein Sonett besteht aus genau 14 Versen: zwei vierzeilige Quartette und zwei dreizeilige Terzette.",
        difficulty = 2,
        funFact = "Das Sonett stammt aus dem 13. Jahrhundert aus Italien (Sizilien) und wurde durch Petrarca zur Vollkommenheit gebracht. Im Barock erlebte es in Deutschland seine Blütezeit."
    ),

    // Question 16 — Reimschema: Kreuzreim
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Reimschema bezeichnet man als 'Kreuzreim'?",
        answerA = "aabb",
        answerB = "abba",
        answerC = "aabccb",
        answerD = "abab",
        correctAnswer = 3,
        explanation = "Beim Kreuzreim (Schema: abab) reimt sich immer ein Versende mit dem übernächsten Versende — die Reime wechseln sich kreuzweise ab.",
        difficulty = 2,
        funFact = "Ein berühmtes Beispiel für den Kreuzreim ist Eichendorffs 'Die Wünschelrute': 'Schläft ein Lied in allen Dingen, die da träumen fort und fort...'."
    ),

    // Question 17 — Reimschema: umarmender Reim
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie lautet das Reimschema des 'umarmenden Reims'?",
        answerA = "abba",
        answerB = "abab",
        answerC = "aabb",
        answerD = "abcabc",
        correctAnswer = 0,
        explanation = "Der umarmende Reim (auch: umschließender Reim) hat das Schema abba — der äußere Reim umschließt den inneren Reim wie eine Umarmung.",
        difficulty = 2,
        funFact = "Das Sonett nutzt in seinen Quartetten oft den umarmenden Reim. Der umarmende Reim erzeugt eine geschlossene, runde Wirkung auf den Leser."
    ),

    // Question 18 — Ballade: Definition
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche drei literarischen Gattungen vereinigt die Ballade in sich?",
        answerA = "Lyrik, Drama und Essay",
        answerB = "Lyrik, Epik und Dramatik",
        answerC = "Roman, Novelle und Lyrik",
        answerD = "Hymne, Ode und Elegie",
        correctAnswer = 1,
        explanation = "Eine Ballade vereinigt Merkmale aller drei literarischen Hauptgattungen: Die Handlung repräsentiert das Epische, die Dialoge das Dramatische und die Gebundenheit der Sprache (Reim, Versmaß) das Lyrische.",
        difficulty = 2,
        funFact = "Die Ballade hat ihren Ursprung in mittelalterlichen Tanzliedern. Im deutschen Sprachraum wurde sie durch Herder, Goethe und Schiller zur Hochform entwickelt."
    ),

    // Question 19 — Haiku: Silben
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Silbenmuster hat ein traditionelles Haiku?",
        answerA = "7 – 5 – 7",
        answerB = "5 – 5 – 7",
        answerC = "5 – 7 – 5",
        answerD = "7 – 7 – 5",
        correctAnswer = 2,
        explanation = "Ein Haiku besteht aus drei Versen mit dem Silbenmuster 5 – 7 – 5, also insgesamt 17 Silben. Es ist die kürzeste Gedichtform der Welt.",
        difficulty = 2,
        funFact = "Das Haiku ist eine traditionell japanische Gedichtform. Der bekannteste Haiku-Dichter ist Matsuo Bashō (1644–1694), dessen Gedichte über Natur und Jahreszeiten berühmt sind."
    ),

    // Question 20 — Elegie: Form
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Aus welchen Versmaßen besteht das klassische Distichon der Elegie?",
        answerA = "Jambus und Trochäus",
        answerB = "Anapäst und Daktylus",
        answerC = "Zwei Hexameter",
        answerD = "Hexameter und Pentameter",
        correctAnswer = 3,
        explanation = "Das Distichon der klassischen Elegie setzt sich aus einem daktylischen Hexameter (6 Versfüße) und einem daktylischen Pentameter (5 Versfüße) zusammen.",
        difficulty = 2,
        funFact = "Das Wort 'Elegie' stammt aus dem Griechischen und bezeichnete ursprünglich einen Klagegesang, der von einer Doppelflöte (aulos) begleitet wurde."
    ),

    // Question 21 — Georg Trakl: Grodek
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welcher literarischen Epoche ist Georg Trakls Werk einzuordnen?",
        answerA = "Expressionismus",
        answerB = "Naturalismus",
        answerC = "Biedermeier",
        answerD = "Neue Sachlichkeit",
        correctAnswer = 0,
        explanation = "Georg Trakl (1887–1914) gehört zum Expressionismus (ca. 1910–1920). Seine Gedichte sind geprägt von einer melancholischen, düsteren Bildsprache mit herbstlichen Farben und Todesmotiven.",
        difficulty = 2,
        funFact = "Trakls letztes und bekanntestes Gedicht 'Grodek' entstand 1914, nachdem er als Militärapotheker die Schlacht von Grodek in Galizien erlebt hatte. Er starb kurz darauf an einer Überdosis Kokain."
    ),

    // Question 22 — Trakl: Tod
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie starb Georg Trakl im Jahr 1914?",
        answerA = "Er fiel im Ersten Weltkrieg als Soldat",
        answerB = "Er nahm sich mit einer Überdosis Kokain das Leben",
        answerC = "Er erlag einer Lungenentzündung",
        answerD = "Er starb bei einem Unfall in Wien",
        correctAnswer = 1,
        explanation = "Georg Trakl starb am 4. November 1914 in einem Feldlazarett in Krakau durch eine Überdosis Kokain — wahrscheinlich Suizid nach dem Trauma der Kriegserlebnisse bei Grodek.",
        difficulty = 2,
        funFact = "Trakl war 27 Jahre alt, als er starb — er gehört zum sogenannten 'Club der 27', einer Gruppe von Künstlern, die in diesem Alter gestorben sind."
    ),

    // Question 23 — Ingeborg Bachmann: Erste Gedichtsammlung
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie heißt Ingeborg Bachmanns erste Gedichtsammlung (1953)?",
        answerA = "Anrufung des Großen Bären",
        answerB = "Malina",
        answerC = "Die gestundete Zeit",
        answerD = "Früher Mittag",
        correctAnswer = 2,
        explanation = "Bachmanns Debüt 'Die gestundete Zeit' erschien 1953 und machte sie schlagartig bekannt. Sie erhielt dafür den Preis der Gruppe 47.",
        difficulty = 2,
        funFact = "Ingeborg Bachmann (1926–1973) stammte aus Klagenfurt, Österreich. Heute ist der wichtigste deutschsprachige Literaturpreis, der Ingeborg-Bachmann-Preis, nach ihr benannt."
    ),

    // Question 24 — Bachmann: Zweite Sammlung
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Bachmanns zweite Gedichtsammlung 'Anrufung des Großen Bären'?",
        answerA = "1953",
        answerB = "1960",
        answerC = "1949",
        answerD = "1956",
        correctAnswer = 3,
        explanation = "Ingeborg Bachmanns zweite Gedichtsammlung 'Anrufung des Großen Bären' erschien 1956 und kehrte zu traditionelleren lyrischen Formen zurück.",
        difficulty = 2,
        funFact = "Bachmanns Gesamtwerk umfasst neben Gedichten auch Prosa (Roman 'Malina', 1971) und Libretti. Sie starb 1973 in Rom an den Folgen eines Brandunfalls."
    ),

    // Question 25 — Erich Kästner
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Für welche literarische Strömung steht Erich Kästners Lyrik der Weimarer Republik?",
        answerA = "Neue Sachlichkeit",
        answerB = "Expressionismus",
        answerC = "Symbolismus",
        answerD = "Naturalismus",
        correctAnswer = 0,
        explanation = "Erich Kästners Gedichte der Weimarer Republik (1920er/30er Jahre) gehören zur Neuen Sachlichkeit — einer nüchternen, gesellschaftskritischen Strömung.",
        difficulty = 2,
        funFact = "Kästner ist heute vor allem als Kinderbuchautor bekannt (Emil und die Detektive, Pünktchen und Anton), schrieb aber auch bissige politische Gedichte für Erwachsene."
    ),

    // Question 26 — Kurt Tucholsky
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Als welcher Typ von Schriftsteller ist Kurt Tucholsky hauptsächlich bekannt?",
        answerA = "Romantischer Naturdichter",
        answerB = "Politisch-satirischer Journalist und Lyriker",
        answerC = "Expressionistischer Dramatiker",
        answerD = "Klassizistischer Hymnen-Dichter",
        correctAnswer = 1,
        explanation = "Kurt Tucholsky (1890–1935) war ein scharfsinniger politischer Satiriker und Journalist der Weimarer Republik. Seine Gedichte behandeln soziale Ungerechtigkeit und warnen vor dem aufkommenden Faschismus.",
        difficulty = 2,
        funFact = "Tucholsky schrieb unter vier Pseudonymen gleichzeitig: Kaspar Hauser, Peter Panter, Theobald Tiger und Ignaz Wrobel — alle in derselben Zeitschrift 'Die Weltbühne'."
    ),

    // Question 27 — Eduard Mörike
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Mit welchem berühmten Frühlings-Vers beginnt Mörikes Gedicht 'Er ist's'?",
        answerA = "\"Wenn der Frühling auf die Berge steigt\"",
        answerB = "\"Im wunderschönen Monat Mai\"",
        answerC = "\"Frühling lässt sein blaues Band wieder flattern durch die Lüfte\"",
        answerD = "\"Der Mai ist gekommen, die Bäume schlagen aus\"",
        correctAnswer = 2,
        explanation = "Mörikes Gedicht 'Er ist's' beginnt mit dem berühmten Vers: 'Frühling lässt sein blaues Band wieder flattern durch die Lüfte' — einer der meistzitierten Verse der deutschen Lyrik.",
        difficulty = 2,
        funFact = "Eduard Mörike (1804–1875) war schwäbischer Pfarrer und Dichter. Sein Werk gehört zur Schwäbischen Romantik. Hugo Wolf vertonte viele seiner Gedichte."
    ),

    // Question 28 — Theodor Fontane
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher Region ist das Werk von Theodor Fontane hauptsächlich verwurzelt?",
        answerA = "Bayern und Österreich",
        answerB = "Sachsen und Thüringen",
        answerC = "Rheinland und Westfalen",
        answerD = "Preußen und Brandenburg",
        correctAnswer = 3,
        explanation = "Theodor Fontane (1819–1898) ist eng mit Preußen und Brandenburg verbunden. Sein bekanntestes Prosawerk 'Effi Briest' spielt im preußischen Milieu.",
        difficulty = 2,
        funFact = "Fontane begann seine literarische Laufbahn als Balladendichter — sein Gedicht 'Archibald Douglas' gehört zu den meistgelesenen deutschen Balladen."
    ),

    // Question 29 — Shakespeare: Sonett 18
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Mit welchen Worten beginnt Shakespeares berühmtes Sonett Nr. 18?",
        answerA = "\"Shall I compare thee to a summer's day?\"",
        answerB = "\"To be, or not to be, that is the question\"",
        answerC = "\"How do I love thee? Let me count the ways\"",
        answerD = "\"Shall I compare thee to a winter's night?\"",
        correctAnswer = 0,
        explanation = "Shakespeares 18. Sonett beginnt mit 'Shall I compare thee to a summer's day?' und ist eines seiner bekanntesten und meistzitierten Liebessonette.",
        difficulty = 2,
        funFact = "Shakespeare schrieb insgesamt 154 Sonette. Die meisten sind an einen jungen Mann gerichtet (Sonette 1–126), die übrigen an eine 'Dark Lady' (Sonette 127–154)."
    ),

    // Question 30 — Pablo Neruda
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Aus welchem Land stammte der Dichter Pablo Neruda?",
        answerA = "Argentinien",
        answerB = "Chile",
        answerC = "Mexiko",
        answerD = "Kolumbien",
        correctAnswer = 1,
        explanation = "Pablo Neruda (1904–1973) war ein chilenischer Dichter und Diplomat. Er gilt als einer der bedeutendsten Liebesdichter der Weltliteratur.",
        difficulty = 2,
        funFact = "Neruda erhielt 1971 den Nobelpreis für Literatur. Er schrieb auch eine berühmte Sammlung von 'Oden auf gewöhnliche Dinge' — darunter eine Ode auf seine Socken."
    ),

    // Question 31 — Neruda: Sonett XVII
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Für wen schrieb Pablo Neruda seine 'Hundert Liebessonette'?",
        answerA = "Für seine Mutter",
        answerB = "Für die chilenische Republik",
        answerC = "Für seine Frau Matilde",
        answerD = "Für eine unbekannte Verehrerin",
        correctAnswer = 2,
        explanation = "Nerudas 'Hundert Liebessonette' (1959) schrieb er für seine dritte Frau Matilde Urrutia. Das Sonett XVII ('Ich liebe dich nicht, als wärst du Salz') gehört zu den bekanntesten.",
        difficulty = 2,
        funFact = "Nerudas bürgerlicher Name war Neftalí Ricardo Reyes Basoalto. Er nahm das Pseudonym 'Pablo Neruda' an, um Konflikte mit seinem Vater zu vermeiden."
    ),

    // Question 32 — Baudelaire
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt Charles Baudelaires berühmteste Gedichtsammlung (1857)?",
        answerA = "Les Nuits de Paris",
        answerB = "Les Illuminations",
        answerC = "Les Fleurs du Mal (Deutsch: Die Blumen des Bösen)",
        answerD = "Les Fleurs du Mal (Deutsch: Die Blumen des Bösen)",
        correctAnswer = 3,
        explanation = "Charles Baudelaires Hauptwerk 'Les Fleurs du Mal' (Die Blumen des Bösen) erschien 1857 und begründete den literarischen Symbolismus. Sechs Gedichte wurden wegen Obszönität verurteilt.",
        difficulty = 2,
        funFact = "Baudelaire (1821–1867) gilt als Wegbereiter der modernen Lyrik. Er war maßgeblich an der Rezeption Edgar Allan Poes in Frankreich beteiligt, dessen Werke er übersetzte."
    ),

    // Question 33 — Baudelaire: Symbolismus
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher literarischen Strömung wird Charles Baudelaire als Wegbereiter zugerechnet?",
        answerA = "Symbolismus",
        answerB = "Surrealismus",
        answerC = "Naturalismus",
        answerD = "Dadaismus",
        correctAnswer = 0,
        explanation = "Charles Baudelaire gilt als wichtiger Vorläufer des literarischen Symbolismus, der in der zweiten Hälfte des 19. Jahrhunderts in Frankreich entstand.",
        difficulty = 2,
        funFact = "Der Symbolismus betont die Verwendung von Symbolen zur Darstellung von Emotionen und Ideen, anstatt sie direkt zu beschreiben. Baudelaires 'Spleen'-Gedichte sind charakteristisch dafür."
    ),

    // Question 34 — Ode: Definition
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was zeichnet eine Ode als Gedichtform aus?",
        answerA = "Strenger Kreuzreim und vier Strophen",
        answerB = "Lobpreisender Charakter, Strophen ohne festes Reimschema",
        answerC = "Genau 14 Verse und Paarreim",
        answerD = "Stets vier gleiche Strophen mit Jambus",
        correctAnswer = 1,
        explanation = "Oden sind lobpreisende Gedichte, die sich in Strophen gliedern und kein festes Reimschema besitzen. Sie haben einen feierlichen, erhabenen Ton.",
        difficulty = 2,
        funFact = "Die Ode stammt aus der griechischen Antike. Pindars Oden zu Ehren der Sieger bei den Olympischen Spielen sind die ältesten erhaltenen Beispiele dieser Form."
    ),

    // Question 35 — Rilke: Dinggedicht
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was versteht man unter dem Begriff 'Dinggedicht', den Rilke prägte?",
        answerA = "Ein Gedicht über alltägliche Gegenstände des Haushalts",
        answerB = "Ein Gedicht ohne Reimschema und Metrum",
        answerC = "Ein Gedicht, das einen Gegenstand aus dessen innerer Perspektive beschreibt",
        answerD = "Ein Gedicht, das mit einem Ding als Metapher für Liebe arbeitet",
        correctAnswer = 2,
        explanation = "Das Dinggedicht beschreibt einen Gegenstand so intensiv, dass er aus seiner eigenen inneren Perspektive erfahrbar wird — ohne Projektion menschlicher Gefühle auf das Ding.",
        difficulty = 2,
        funFact = "Rilkes 'Der Panther' und 'Der Schwan' sind Paradebeispiele des Dinggedichts. Rilke entwickelte diesen Stil unter dem Einfluss des Bildhauers Auguste Rodin, bei dem er als Sekretär arbeitete."
    ),

    // Question 36 — Goethe: Erlkönig Inhalt
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was ist das Thema von Goethes Ballade 'Erlkönig'?",
        answerA = "Ein König sucht seinen verlorenen Thron",
        answerB = "Ein Ritter kämpft gegen einen Waldgeist",
        answerC = "Ein Mädchen tanzt mit Elfen im Wald",
        answerD = "Ein Vater reitet mit seinem sterbenden Kind durch die Nacht",
        correctAnswer = 3,
        explanation = "In Goethes 'Erlkönig' (1782) reitet ein Vater mit seinem kranken Kind durch die Nacht. Das Kind sieht und hört den Erlkönig — am Ende des Gedichts ist es tot.",
        difficulty = 2,
        funFact = "Der Erlkönig basiert auf einer dänischen Volksballade über den 'Elverkonge' (Elfenkönig). Goethe übersetzte und verwandelte die Vorlage eigenständig."
    ),

    // Question 37 — Matthias Claudius: Abendlied
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Gedicht gilt laut Statistik als das am häufigsten abgedruckte deutsche Gedicht?",
        answerA = "Matthias Claudius: Abendlied ('Der Mond ist aufgegangen')",
        answerB = "Goethe: Erlkönig",
        answerC = "Heine: Die Loreley",
        answerD = "Schiller: Das Lied von der Glocke",
        correctAnswer = 0,
        explanation = "Das 'Abendlied' von Matthias Claudius ('Der Mond ist aufgegangen') wurde in deutschen Anthologien am häufigsten abgedruckt — 84 Mal in 154 Jahren.",
        difficulty = 2,
        funFact = "Matthias Claudius (1740–1815) schrieb das Abendlied 1779. Es gehört zum Schweifreim-Schema (aabccb) und wurde von Johann Abraham Peter Schulz vertont."
    ),

    // Question 38 — Heine: Epoche
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Heinrich Heines Dichtung wird welcher Literaturepoche zugeordnet?",
        answerA = "Klassik",
        answerB = "Romantik (mit ironischer Brechung)",
        answerC = "Expressionismus",
        answerD = "Biedermeier",
        correctAnswer = 1,
        explanation = "Heine gehört zur Romantik, bricht deren Motive aber ironisch. Er verwendet romantische Bilder und unterwandert sie gleichzeitig mit Sarkasmus und Distanz.",
        difficulty = 2,
        funFact = "Heine emigrierte 1831 nach Paris und verbrachte dort den Rest seines Lebens. Er bezeichnete Deutschland aus der Ferne mit der bekannten Sentenz: 'Denk ich an Deutschland in der Nacht, dann bin ich um den Schlaf gebracht.'"
    ),

    // Question 39 — Paarreim
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist das Merkmal des Paareims?",
        answerA = "Jeder zweite Vers reimt sich auf den ersten",
        answerB = "Der erste Vers reimt auf den letzten der Strophe",
        answerC = "Je zwei aufeinanderfolgende Verse reimen sich (Schema: aabb)",
        answerD = "Drei Verse reimen sich, ein Vers bleibt reimlos",
        correctAnswer = 2,
        explanation = "Beim Paarreim reimen sich jeweils zwei aufeinanderfolgende Verse — das Schema lautet aabb. Er vermittelt oft eine direkte, schlichte Stimmung.",
        difficulty = 2,
        funFact = "Der Paarreim ist eine der ältesten und verbreitetsten Reimformen in der deutschen Dichtung. Viele Kinderreime und Volkslieder verwenden ihn wegen seiner Eingängigkeit."
    ),

    // Question 40 — Celan: Sprache
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher Sprache schrieb Paul Celan seine Gedichte, obwohl er kein Deutscher war?",
        answerA = "Rumänisch",
        answerB = "Französisch",
        answerC = "Hebräisch",
        answerD = "Deutsch",
        correctAnswer = 3,
        explanation = "Paul Celan schrieb trotz seiner rumänischen Herkunft und seines Lebens in Paris auf Deutsch — der Sprache seiner jüdischen Mutter, die in einem Konzentrationslager ermordet wurde.",
        difficulty = 2,
        funFact = "Celan bezeichnete die deutsche Sprache als das Einzige, was ihm nach dem Holocaust geblieben sei. Dies macht sein Werk besonders tragisch und bedeutsam."
    ),

    // Question 41 — Martin Opitz
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wer wird als 'Vater der deutschen Dichtung' bezeichnet?",
        answerA = "Martin Opitz",
        answerB = "Hans Sachs",
        answerC = "Andreas Gryphius",
        answerD = "Paul Fleming",
        correctAnswer = 0,
        explanation = "Martin Opitz (1597–1639) gilt als 'Vater der deutschen Dichtung'. Er veröffentlichte 1624 das einflussreiche 'Buch von der Deutschen Poeterey' — das erste Regelwerk der deutschen Dichtkunst.",
        difficulty = 2,
        funFact = "Opitz' Werk leitete die Barockdichtung in Deutschland ein. Er forderte, dass deutsche Dichtung nach antiken Vorbildern gestaltet werden solle."
    ),

    // Question 42 — Brecht: Moritat
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie heißt das bekannteste Lied aus Brechts Dreigroschenoper?",
        answerA = "Ballade von der Hanna Cash",
        answerB = "Die Moritat von Mackie Messer",
        answerC = "Seeräuber-Jenny",
        answerD = "Das Lied von der Unzulänglichkeit",
        correctAnswer = 1,
        explanation = "Die 'Moritat von Mackie Messer' ist das bekannteste Lied aus Brechts Dreigroschenoper (1928). Es wurde weltweit in zahlreichen Versionen adaptiert.",
        difficulty = 2,
        funFact = "Brecht schrieb die 'Moritat von Mackie Messer' angeblich in der Nacht vor der Uraufführung, weil der Darsteller des Macheath ein Lied für seinen Einzug forderte."
    ),

    // Question 43 — Rilke: Neue Gedichte
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welcher Gedichtsammlung von Rilke wurde 'Der Panther' erstmals veröffentlicht?",
        answerA = "Das Stunden-Buch",
        answerB = "Duineser Elegien",
        answerC = "Neue Gedichte",
        answerD = "Das Buch der Bilder",
        correctAnswer = 2,
        explanation = "Rilkes 'Der Panther' wurde 1907 in den 'Neuen Gedichten' veröffentlicht. Die Sammlung enthält viele seiner berühmten Dinggedichte.",
        difficulty = 2,
        funFact = "Die 'Neuen Gedichte' erschienen in zwei Bänden (1907 und 1908) und markieren Rilkes Übergang zu einer objektiven, sachlichen Lyrik unter dem Einfluss Rodins."
    ),

    // Question 44 — Schiller: Räuber und Lyrik
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche von Schillers Gedichtformen wurde von Beethoven in seiner 9. Symphonie vertont?",
        answerA = "Elegie",
        answerB = "Ballade",
        answerC = "Hymne",
        answerD = "Ode",
        correctAnswer = 3,
        explanation = "Schillers 'An die Freude' ist eine Ode — Beethoven vertonte sie im letzten Satz seiner 9. Symphonie. Die Melodie ist heute die Europahymne.",
        difficulty = 2,
        funFact = "Schiller schrieb die Ode 'An die Freude' 1785 in einer euphorischen Phase. Beethoven bewunderte das Gedicht seit seiner Jugend und verwirklichte seine Vertonung erst 39 Jahre später."
    ),

    // Question 45 — Joseph von Eichendorff
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchem Dichter gehören die Verse 'Schläft ein Lied in allen Dingen'?",
        answerA = "Joseph von Eichendorff",
        answerB = "Clemens Brentano",
        answerC = "Novalis",
        answerD = "Ludwig Tieck",
        correctAnswer = 0,
        explanation = "Die Verse 'Schläft ein Lied in allen Dingen, die da träumen fort und fort' stammen aus Eichendorffs Gedicht 'Wünschelrute' — einem der bekanntesten deutschen Gedichte der Romantik.",
        difficulty = 2,
        funFact = "Joseph von Eichendorff (1788–1857) ist einer der bedeutendsten Dichter der deutschen Romantik. Sein Gedicht 'Mondnacht' ('Es war, als hätt' der Himmel') gehört zu den meistvertonten deutschen Gedichten."
    ),

    // Question 46 — Trakl: Farben
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Farbe ist in Georg Trakls expressionistischer Lyrik besonders symbolisch für Verfall und Tod?",
        answerA = "Weiß",
        answerB = "Schwarz und Blau",
        answerC = "Rot und Orange",
        answerD = "Grün und Gelb",
        correctAnswer = 1,
        explanation = "In Trakls Lyrik dominieren dunkle Farben wie Schwarz und tiefes Blau, die für Melancholie, Verfall und Tod stehen. Herbstliche Abendstimmungen prägen sein Werk.",
        difficulty = 2,
        funFact = "Trakls spezifische Farbsymbolik ist so charakteristisch, dass Literaturwissenschaftler von einer 'Traklschen Farbwelt' sprechen. Blau steht bei ihm oft für Sehnsucht und Auflösung."
    ),

    // Question 47 — Codex Manesse
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist der Codex Manesse?",
        answerA = "Ein mittelalterlicher Roman über Rittertaten",
        answerB = "Luthers erste Bibelübersetzung ins Deutsche",
        answerC = "Die größte mittelhochdeutsche Liederhandschrift mit Miniaturen",
        answerD = "Ein Renaissance-Lehrwerk über Dichtkunst",
        correctAnswer = 2,
        explanation = "Der Codex Manesse (14. Jh.) ist die umfangreichste und prächtigste Sammlung mittelhochdeutscher Lyrik. Er enthält die Werke von ca. 140 Minnesängern, darunter Walther von der Vogelweide.",
        difficulty = 2,
        funFact = "Der Codex Manesse enthält berühmte farbige Miniaturen, die jeden Dichter porträtieren. Er wird heute in der Universitätsbibliothek Heidelberg aufbewahrt."
    ),

    // Question 48 — Goethe: Werk
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Goethes 'Erlkönig' ist nach statistischen Auswertungen die am zweithäufigsten abgedruckte deutsche Ballade. Wer schrieb die häufigste?",
        answerA = "Friedrich Schiller",
        answerB = "Heinrich Heine",
        answerC = "Theodor Fontane",
        answerD = "Matthias Claudius (Abendlied)",
        correctAnswer = 3,
        explanation = "Laut Statistik liegt Matthias Claudius' 'Abendlied' auf Platz 1 der meistabgedruckten deutschen Gedichte, Goethes Erlkönig folgt auf Platz 2.",
        difficulty = 2,
        funFact = "Diese Statistik basiert auf der Auswertung von über 200 deutschen Gedichtsammlungen über mehrere Jahrhunderte — eine einzigartige Datenerhebung zur Beliebtheit der Lyrik."
    ),

    // Question 49 — Brecht: Exil
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Land lebte Bertolt Brecht, als er die 'Svendborger Gedichte' schrieb?",
        answerA = "Dänemark",
        answerB = "Schweden",
        answerC = "USA",
        answerD = "Sowjetunion",
        correctAnswer = 0,
        explanation = "Brecht lebte von 1933 bis 1939 im dänischen Exil in Svendborg. Dort entstanden die gleichnamigen politischen 'Svendborger Gedichte'.",
        difficulty = 2,
        funFact = "Brecht floh direkt nach dem Reichstagsbrand 1933 aus Deutschland. Er lebte danach in Dänemark, Schweden, Finnland und schließlich in den USA, bevor er 1949 nach Ost-Berlin zurückkehrte."
    ),

    // Question 50 — Neruda: Nobelpreis
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Pablo Neruda den Nobelpreis für Literatur?",
        answerA = "1967",
        answerB = "1971",
        answerC = "1963",
        answerD = "1975",
        correctAnswer = 1,
        explanation = "Pablo Neruda erhielt 1971 den Nobelpreis für Literatur. Die Begründung lautete, er habe mit der Kraft eines Elementes die Schicksale und Träume eines ganzen Kontinents zum Leben erweckt.",
        difficulty = 2,
        funFact = "Neruda starb am 23. September 1973, nur wenige Tage nach dem Militärputsch von Augusto Pinochet, der seinen engen Freund Salvador Allende stürzte. Die Todesumstände sind bis heute nicht vollständig geklärt."
    )

)
