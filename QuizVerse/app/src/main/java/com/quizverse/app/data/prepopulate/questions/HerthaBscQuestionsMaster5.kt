package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsMaster5(): List<Question> = listOf(

    // ── OLYMPIASTADION BERLIN: BAU & ARCHITEKTUR (1–10) ────────────────────────

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde das Olympiastadion Berlin offiziell für die Olympischen Spiele eröffnet?",
        answerA = "1932",
        answerB = "1934",
        answerC = "1936",
        answerD = "1938",
        correctAnswer = 2,
        explanation = "Das Olympiastadion Berlin wurde zwischen 1934 und 1936 erbaut und am 1. August 1936 zur Eröffnung der XI. Olympischen Sommerspiele eingeweiht. Es ersetzte das ältere Deutsche Stadion auf dem gleichen Gelände.",
        difficulty = 5,
        funFact = "Der Vorgängerbau, das Deutsche Stadion, wurde bereits 1912 eröffnet — Architekt war Otto March, der Vater von Werner March, der das neue Olympiastadion entwarf. Die Familie March baute also quasi beide Stadien."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Welches Architekturbüro übernahm die Sanierung und Überdachung des Olympiastadions Berlin von 2000 bis 2004?",
        answerA = "Gerkan, Marg und Partner (gmp)",
        answerB = "Behnisch Architekten",
        answerC = "Zaha Hadid Architects",
        answerD = "Ingenhoven Architects",
        correctAnswer = 0,
        explanation = "Das Hamburger Büro Gerkan, Marg und Partner (gmp) gewann den Wettbewerb und führte die umfassende Modernisierung des Olympiastadions durch. Meinhard von Gerkan war der leitende Partner. Die Arbeiten dauerten von Mai 2000 bis Juli 2004.",
        difficulty = 5,
        funFact = "Die Architekten stellten vor eine fast unlösbare Aufgabe: Denkmalschutz und moderne Bundesliga-Anforderungen gleichzeitig erfüllen. Ihre Lösung — alle Neubauten unterirdisch anzulegen — gilt bis heute als vorbildlich."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wie groß war die ursprüngliche Zuschauerkapazität des Olympiastadions Berlin bei den Spielen 1936?",
        answerA = "75.000",
        answerB = "85.000",
        answerC = "95.000",
        answerD = "110.000",
        correctAnswer = 3,
        explanation = "Das Olympiastadion Berlin fasste 1936 ca. 110.000 Zuschauer, was es zu einem der größten Stadien der Welt machte. Werner March baute den Unterbau 12 Meter unter das Geländeniveau versenkt, um die monumentale Außenwirkung zu begrenzen.",
        difficulty = 5,
        funFact = "Hitler lehnte Werner Marchs erste Entwürfe als 'zu modern und zu verglast' ab. Erst als March die Fassade mit massivem Naturstein (Fränkischem Jurakalk) verkleidete und die Stahlkonstruktion versteckte, gab der Diktator grünes Licht."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Wie viel kostete die Sanierung des Olympiastadions Berlin zwischen 2000 und 2004 ungefähr?",
        answerA = "ca. 140 Millionen Euro",
        answerB = "ca. 242 Millionen Euro",
        answerC = "ca. 320 Millionen Euro",
        answerD = "ca. 190 Millionen Euro",
        correctAnswer = 1,
        explanation = "Die Gesamtkosten der Sanierung beliefen sich auf rund 242 Millionen Euro. Der Bund übernahm davon ca. 196 Millionen Euro, da das Stadion als nationales Kulturdenkmal gilt. Das restliche Viertel trug das Land Berlin.",
        difficulty = 5,
        funFact = "Während der vierjährigen Bauphase lief der Spielbetrieb von Hertha BSC weiter. Das Stadion blieb für Heimspiele geöffnet — die Bauarbeiter arbeiteten quasi rund um die Spieltermine herum."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wie viele Zuschauer fasst das Olympiastadion Berlin seit der Renovierung 2004?",
        answerA = "74.475",
        answerB = "71.500",
        answerC = "76.200",
        answerD = "68.000",
        correctAnswer = 0,
        explanation = "Seit der Modernisierung 2004 hat das Olympiastadion Berlin eine Dauerkapazität von 74.475 Sitzplätzen. Damit ist es das größte Stadion Deutschlands für internationale Fußballbegegnungen.",
        difficulty = 5,
        funFact = "Das Olympiastadion Berlin ist eines der wenigen Großstadien weltweit, das sowohl für Olympische Spiele (1936) als auch für eine Fußball-Weltmeisterschaft (2006) und eine Fußball-Europameisterschaft (2024) den Endspielort stellte."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Welches Großereignis fand 2024 im Olympiastadion Berlin statt, bei dem sechs Spiele ausgetragen wurden?",
        answerA = "FIFA Klub-Weltmeisterschaft",
        answerB = "Champions-League-Finale",
        answerC = "UEFA Euro 2024",
        answerD = "FIFA Confederations Cup",
        correctAnswer = 2,
        explanation = "Bei der UEFA Euro 2024 war das Olympiastadion Berlin einer der zehn deutschen Spielorte. Sechs Spiele wurden hier ausgetragen, darunter das Endspiel am 14. Juli 2024 (Spanien gewann gegen England 2:1).",
        difficulty = 5,
        funFact = "Das Olympiastadion Berlin ist damit das einzige Stadion der Welt, in dem sowohl das WM-Finale 2006 (Frankreich vs. Italien) als auch das EM-Finale 2024 (Spanien vs. England) stattfanden."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wie viele Hektar umfasste das Reichssportfeld, zu dem das Olympiastadion 1936 gehörte?",
        answerA = "45 Hektar",
        answerB = "78 Hektar",
        answerC = "104 Hektar",
        answerD = "132 Hektar",
        correctAnswer = 3,
        explanation = "Das gesamte Reichssportfeld umfasste 132 Hektar (330 Acres). Es bestand aus dem Olympiastadion, dem Maifeld (50.000 Plätze), der Waldbühne (25.000 Plätze) sowie zahlreichen Sportstätten für Schwimmen, Reiten und Hockey.",
        difficulty = 5,
        funFact = "Das Maifeld neben dem Olympiastadion — heute meist für Konzerte genutzt — war für Massenveranstaltungen der Nationalsozialisten konzipiert. Es fasste 500.000 Menschen bei entsprechend verdichteter Aufstellung."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Welcher Teil des Olympiastadion-Areals wurde für die Waldbühne genutzt, die zur Anlage gehört?",
        answerA = "Nördlicher Teil (Sportanlagen)",
        answerB = "Westlicher Teil (Amphitheater im Wald)",
        answerC = "Östlicher Teil (Eingangsbereich)",
        answerD = "Südlicher Teil (Olympischer Platz)",
        correctAnswer = 1,
        explanation = "Die Waldbühne liegt im westlichen Teil des Olympia-Areals und ist als natürliches Amphitheater in eine Waldlichtung eingebettet. Sie fasst ca. 25.000 Zuschauer und gilt als eine der schönsten Freiluftbühnen Europas.",
        difficulty = 5,
        funFact = "1965 wurde die Waldbühne nach einem Rolling-Stones-Konzert so stark zerstört (Stuhlwürfe, Schlägereien), dass sie 13 Jahre lang für Veranstaltungen gesperrt blieb und erst 1978 wieder öffnete."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wer war der Vater von Olympiastadion-Architekt Werner March, der bereits das Vorgängerstadion auf dem gleichen Gelände entworfen hatte?",
        answerA = "Otto March",
        answerB = "Karl March",
        answerC = "Heinrich March",
        answerD = "Friedrich March",
        correctAnswer = 0,
        explanation = "Otto March war der Vater von Werner March. Er entwarf das Deutsche Stadion (1909–1913), den Vorgängerbau des Olympiastadions. Werner March baute das neue Olympiastadion buchstäblich auf dem Fundament seines Vaters.",
        difficulty = 5,
        funFact = "Werner March arbeitete bei den Plänen für 1936 eng mit seinem Bruder Walter March zusammen. Es war also ein echtes Familienunternehmen über zwei Generationen, das diesen historischen Ort prägte."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "In welchem Berliner Stadtbezirk befindet sich das Olympiastadion?",
        answerA = "Spandau",
        answerB = "Wilmersdorf",
        answerC = "Charlottenburg",
        answerD = "Tiergarten",
        correctAnswer = 2,
        explanation = "Das Olympiastadion liegt im Stadtbezirk Charlottenburg (heute Charlottenburg-Wilmersdorf). Architekt Werner March stammte selbst aus Charlottenburg, dem Berliner Bezirk, in dem das Stadion liegt.",
        difficulty = 5
    ),

    // ── HERTHA BSC: GESCHICHTE & GRÜNDUNG (11–20) ─────────────────────────────

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "An welchem Datum wurde Hertha BSC gegründet?",
        answerA = "12. März 1892",
        answerB = "1. April 1892",
        answerC = "10. Juni 1892",
        answerD = "25. Juli 1892",
        correctAnswer = 3,
        explanation = "Hertha BSC wurde am 25. Juli 1892 von den Bruderpaaren Fritz und Max Lindner sowie Otto und Willi Lorenz als 'Berliner Fußball-Club Hertha 1892' gegründet. Die blau-weißen Vereinsfarben leiten sich vom Dampfschiff 'Hertha' ab, das die Gründer auf der Spree sahen.",
        difficulty = 5,
        funFact = "Der Name 'Hertha' stammt von einem Ausflugsdampfer auf der Spree. Die Gründer sollen auf einem Schiff gefeiert haben, als sie zufällig den Dampfer 'Hertha' sahen und spontan beschlossen, ihren neuen Verein danach zu benennen."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Mit welchem anderen Verein fusionierte Hertha zwischen 1923 und 1930, was zum heutigen Namen führte?",
        answerA = "Berliner FC Victoria 1889",
        answerB = "Berliner Sport-Club",
        answerC = "BFC Preußen",
        answerD = "FC Normania Berlin",
        correctAnswer = 1,
        explanation = "Von 1923 bis 1930 war Hertha mit dem Berliner Sport-Club (BSC) fusioniert, woraus der bis heute gültige Name 'Hertha BSC' entstand. Nach der Trennung behielten beide Vereine den gemeinsamen Namen bei, wobei Hertha dominant blieb.",
        difficulty = 5,
        funFact = "Die Abkürzung 'BSC' in 'Hertha BSC' steht also nicht für einen ursprünglichen Vereinsnamen, sondern für 'Berliner Sport-Club' — den Fusionspartner von 1923. Viele Fans wissen das nicht."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr zog Hertha BSC endgültig in das Olympiastadion um?",
        answerA = "1963",
        answerB = "1957",
        answerC = "1970",
        answerD = "1974",
        correctAnswer = 0,
        explanation = "Als Hertha BSC 1963 in die neu gegründete Bundesliga aufgenommen wurde, zog der Verein ins Olympiastadion um, da die alte Plumpe am Gesundbrunnen die Bundesliga-Standards nicht erfüllte. Seitdem ist das Olympiastadion die Heimspielstätte.",
        difficulty = 5,
        funFact = "Hertha war einer der 16 Gründungsvereine der Bundesliga 1963 — obwohl der Verein damals sportlich nicht gerade auf dem Höhepunkt stand. Der Ruf als Hauptstadtclub war offenbar entscheidend für die Aufnahme."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gewann Hertha BSC seine erste Deutsche Meisterschaft?",
        answerA = "1926",
        answerB = "1928",
        answerC = "1930",
        answerD = "1932",
        correctAnswer = 2,
        explanation = "Am 22. Juni 1930 gewann Hertha BSC erstmals die Deutsche Meisterschaft mit einem 5:4-Finalsieg gegen Holstein Kiel. Zuvor hatte der Verein vier Finalniederlagen in Folge kassiert (1926–1929), ehe der fünfte Versuch gelang.",
        difficulty = 5,
        funFact = "Hertha BSC trat zwischen 1926 und 1931 sechsmal in Folge ins Finale der Deutschen Meisterschaft ein — eine Rekordserie, die in der deutschen Fußballgeschichte nur einmal erreicht, aber nie überboten wurde."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein gewann Hertha BSC 1931 seine zweite Deutsche Meisterschaft?",
        answerA = "1. FC Nürnberg",
        answerB = "Schalke 04",
        answerC = "Hamburger SV",
        answerD = "TSV 1860 München",
        correctAnswer = 3,
        explanation = "Im Finale der Deutschen Meisterschaft 1931 besiegte Hertha BSC den TSV 1860 München. Es war die zweite Meisterschaft in Folge — ein Kunststück, das zuvor nur der 1. FC Nürnberg vollbracht hatte.",
        difficulty = 5,
        funFact = "Hertha BSC war in der Zwischenkriegszeit der zweiterfolgreichste Verein Deutschlands — nur der 1. FC Nürnberg war noch dominanter. Die aktuelle sportliche Situation des Vereins steht in starkem Kontrast zu dieser ruhmreichen Vergangenheit."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Was war der Spitzname des alten Stadions von Hertha BSC am Gesundbrunnen?",
        answerA = "Die Sandkiste",
        answerB = "Die Plumpe",
        answerC = "Der Kessel",
        answerD = "Die Festung",
        correctAnswer = 1,
        explanation = "Das Stadion am Gesundbrunnen wurde von Berliner Fans liebevoll 'Plumpe' genannt — ein Berliner Dialektwort, das auf die Wasserpumpen zurückgeht, die früher auf vielen Straßen Berlins standen.",
        difficulty = 5,
        funFact = "Die 'Plumpe' wurde zwischen 1923 und 1924 erbaut, fasste 35.239 Zuschauer und wurde am 9. Februar 1924 mit einem 1:0 gegen VfB Pankow eröffnet. Das letzte Spiel dort fand am 3. September 1974 statt (Berlin vs. Royal Antwerp FC, 2:1)."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wann wurde das Stadion am Gesundbrunnen (Plumpe) von Hertha BSC abgerissen?",
        answerA = "1974",
        answerB = "1968",
        answerC = "1980",
        answerD = "1976",
        correctAnswer = 0,
        explanation = "Hertha BSC verkaufte das Gelände der Plumpe 1974, um eine drohende Insolvenz abzuwenden. Das Stadion wurde anschließend abgerissen und durch einen Wohnkomplex ersetzt. Der letzte Ball rollte dort am 3. September 1974.",
        difficulty = 5,
        funFact = "Das Gelände der ehemaligen Plumpe liegt heute unter einem Wohngebäude im Bezirk Mitte. Eine Gedenktafel erinnert an die Geschichte des alten Hertha-Stadions an dieser Stelle."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Wie viele Zuschauer fasste das Stadion am Gesundbrunnen (Plumpe) auf seinem Höhepunkt?",
        answerA = "22.000",
        answerB = "29.000",
        answerC = "35.239",
        answerD = "41.000",
        correctAnswer = 2,
        explanation = "Das Stadion am Gesundbrunnen hatte eine Kapazität von 35.239 Zuschauern. Die Fans hatten liebevolle Namen für die Tribünen: 'Uhrenberg' (wegen einer Stadionuhr) und 'Zauberberg'.",
        difficulty = 5
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wie hieß Hertha BSC beim Bundesliga-Start 1963 noch vollständig?",
        answerA = "Hertha BSC Berlin 1892 e.V.",
        answerB = "Berliner Sport-Club Hertha 1892",
        answerC = "FC Hertha Berliner Sport-Club",
        answerD = "Hertha, Berliner Sport-Club e.V.",
        correctAnswer = 3,
        explanation = "Der offizielle Vereinsname lautet 'Hertha, Berliner Sport-Club e.V.' — dieser Name entstand aus der Fusion von Hertha BSC mit dem Berliner Sport-Club 1923. Das Komma nach 'Hertha' ist dabei Teil des offiziellen Namens.",
        difficulty = 5,
        funFact = "Der ungewöhnliche Name mit Komma sorgt regelmäßig für Verwirrung. Offiziell heißt es 'Hertha, BSC' — nicht 'Hertha BSC' ohne Komma. Im allgemeinen Sprachgebrauch wird das Komma allerdings fast immer weggelassen."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wie viele Heimspielzuschauer zog Hertha BSC in der Saison 2023/24, womit erstmals seit 25 Jahren die Millionenmarke überschritten wurde?",
        answerA = "1.014.381",
        answerB = "987.500",
        answerC = "1.045.000",
        answerD = "1.002.100",
        correctAnswer = 0,
        explanation = "In der Saison 2023/24 lockte Hertha BSC exakt 1.014.381 Zuschauer zu seinen Heimspielen ins Olympiastadion — zum ersten Mal seit 25 Jahren überschritt der Verein damit die Millionenmarke bei den Heimspielbesuchern.",
        difficulty = 5,
        funFact = "Trotz des Abstiegs aus der Bundesliga und des Abstiegs in die 2. Bundesliga blieb die Fanbasis von Hertha BSC erstaunlich stabil. Die Berliner Fans zeigten damit, dass der Verein auch in schwierigen Zeiten eine treue Anhängerschaft besitzt."
    ),

    // ── HERTHA BSC: ZUSCHAUER & REKORDE (21–28) ────────────────────────────────

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Welche offizielle Zuschauerzahl wurde beim Bundesliga-Rekordspiel Hertha BSC gegen 1. FC Köln am 26. September 1969 registriert?",
        answerA = "81.450",
        answerB = "88.075",
        answerC = "92.300",
        answerD = "79.800",
        correctAnswer = 1,
        explanation = "Am 26. September 1969 kamen offiziell 88.075 Zuschauer zum Spiel Hertha BSC gegen den 1. FC Köln ins Olympiastadion — Bundesliga-Zuschauerrekord für ein Einzelspiel, der bis heute nicht gebrochen wurde. Hertha gewann 1:0.",
        difficulty = 5,
        funFact = "Augenzeugen berichteten, dass die tatsächliche Zuschauerzahl die 90.000er-Marke deutlich überschritten hatte — der offizielle Wert von 88.075 gilt aber bis heute als Bundesliga-Rekord für ein Einzelspiel."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "In welcher Saison erzielte Hertha BSC seinen historischen Zuschauerschnitt-Rekord?",
        answerA = "Saison 1968/69",
        answerB = "Saison 1971/72",
        answerC = "Saison 1970/71",
        answerD = "Saison 1974/75",
        correctAnswer = 2,
        explanation = "In der Saison 1970/71 erzielte Hertha BSC seinen bis heute höchsten Zuschauerschnitt der Vereinsgeschichte mit durchschnittlich 53.640 Zuschauern pro Heimspiel. Diese Rekord-Saison steht eng in Verbindung mit der starken sportlichen Phase des Vereins.",
        difficulty = 5,
        funFact = "Der Zuschauerschnitt von 53.640 in der Saison 1970/71 war so hoch, dass er selbst nach dem Ende der goldenen Hertha-Ära jahrzehntelang unerreicht blieb — ein Beweis für die damalige Popularität des Vereins in der geteilten Stadt Berlin."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Welches Ergebnis erzielte Hertha BSC im Bundesliga-Rekordspiel gegen den 1. FC Köln am 26. September 1969?",
        answerA = "2:1 für Hertha BSC",
        answerB = "0:0 Unentschieden",
        answerC = "3:2 für den 1. FC Köln",
        answerD = "1:0 für Hertha BSC",
        correctAnswer = 3,
        explanation = "Hertha BSC gewann das bis heute zuschauerstärkste Bundesligaspiel mit 1:0 gegen den amtierenden ersten Bundesliga-Meister 1. FC Köln. Das Tor zum entscheidenden Sieg machte das Spiel noch legendärer.",
        difficulty = 5
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wie war die Kapazität des Olympiastadions während der laufenden Umbauarbeiten zwischen 2000 und 2004 für Hertha-Heimspiele?",
        answerA = "Mindestens 55.000 Plätze waren freigehalten",
        answerB = "Das Stadion war für Spiele gesperrt",
        answerC = "Maximal 30.000 Zuschauer erlaubt",
        answerD = "Nur Stehplätze waren zugelassen",
        correctAnswer = 0,
        explanation = "Während der gesamten vierjährigen Bauphase (2000–2004) hielt das Olympiastadion bei jedem Heimspiel von Hertha BSC mindestens 55.000 Sitzplätze frei. Der Umbau lief also parallel zum laufenden Spielbetrieb.",
        difficulty = 5,
        funFact = "Die logistische Meisterleistung, ein Stadion für 74.000 Zuschauer umzubauen und gleichzeitig offen zu halten, erforderte eine präzise Abstimmung zwischen Hertha BSC, der Baufirma und den Berliner Behörden."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Das Olympiastadion Berlin wurde im Jahr 2006 für welches Großereignis genutzt, bei dem es das Endspiel ausrichtete?",
        answerA = "UEFA-Pokal-Finale",
        answerB = "FIFA Weltmeisterschaft",
        answerC = "Leichtathletik-Weltmeisterschaft",
        answerD = "UEFA Champions League",
        correctAnswer = 1,
        explanation = "Bei der FIFA Weltmeisterschaft 2006 in Deutschland richtete das Olympiastadion Berlin sechs Spiele aus, darunter das Finale am 9. Juli 2006, bei dem Italien Frankreich nach Elfmeterschießen besiegte (5:3 n.E., 1:1 n.V.).",
        difficulty = 5,
        funFact = "Das WM-Finale 2006 ist vor allem wegen des legendären Kopfstoßes von Zinédine Zidane gegen Marco Materazzi in der Verlängerung in Erinnerung geblieben — eines der ikonischsten Bilder der Fußballgeschichte."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Wie lang ist die Stahlrohrfachwerkkonstruktion des Daches am Olympiastadion Berlin umlaufend?",
        answerA = "ca. 45 Meter",
        answerB = "ca. 55 Meter",
        answerC = "ca. 68 Meter",
        answerD = "ca. 82 Meter",
        correctAnswer = 2,
        explanation = "Die Dachkonstruktion des Olympiastadions Berlin ist als Kragarmkonstruktion in Stahlbauweise mit einer Membran als oberer und unterer Dachhaut ausgeführt. Die Gesamtlänge der Stahlrohrfachwerkkonstruktion beträgt umlaufend rund 68 Meter.",
        difficulty = 5,
        funFact = "Das Dach des Olympiastadions wurde so konstruiert, dass es optisch dem ursprünglichen Werner-March-Entwurf treu bleibt, aber gleichzeitig modernen Wetterstandards und der für Profifußball nötigen Beschallung entspricht."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wie viele Spiele richtete das Olympiastadion Berlin bei der UEFA Euro 2024 aus?",
        answerA = "4",
        answerB = "3",
        answerC = "7",
        answerD = "6",
        correctAnswer = 3,
        explanation = "Das Olympiastadion Berlin war Gastgeber von sechs Spielen der UEFA Euro 2024, darunter das Finale am 14. Juli 2024, bei dem Spanien gegen England mit 2:1 gewann.",
        difficulty = 5
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Ab welchem Jahr ist das Olympiastadion Berlin offiziell die Heimspielstätte von Hertha BSC?",
        answerA = "1963",
        answerB = "1958",
        answerC = "1965",
        answerD = "1971",
        correctAnswer = 0,
        explanation = "Seit der Gründung der Bundesliga 1963 spielt Hertha BSC im Olympiastadion. Die alte Plumpe am Gesundbrunnen entsprach nicht den Bundesliga-Anforderungen, weshalb der Umzug zum Olympiastadion notwendig war.",
        difficulty = 5
    ),

    // ── BERLINER STADTDERBY: UNION VS. HERTHA (29–36) ──────────────────────────

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr fand das erste offizielle Pflichtspiel zwischen Union Berlin und Hertha BSC statt?",
        answerA = "2005",
        answerB = "2010",
        answerC = "2012",
        answerD = "2019",
        correctAnswer = 1,
        explanation = "Das erste offizielle Pflichtspiel zwischen Union Berlin und Hertha BSC fand am 17. September 2010 statt — ein Zweitliga-Duell im Stadion An der Alten Försterei, das 1:1 endete. Zuvor gab es jahrzehntelang kein Pflichtspielduell.",
        difficulty = 5,
        funFact = "Vor 2010 pflegten beide Vereine — auch wegen der Berliner Teilung — eher eine Fanfreundschaft als eine Rivalität. Union-Fans besuchten sogar Hertha-Spiele und umgekehrt. Die Feindschaft entstand erst durch gemeinsame Pflichtspiele."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Wie viele Zuschauer sahen das erste Pflichtspiel Union Berlin gegen Hertha BSC am 17. September 2010?",
        answerA = "12.100",
        answerB = "21.500",
        answerC = "18.432",
        answerD = "14.800",
        correctAnswer = 2,
        explanation = "Das erste Pflichtspielduell zwischen Union Berlin und Hertha BSC verfolgten 18.432 Zuschauer im Stadion An der Alten Försterei. Das Spiel endete 1:1 — ein historisches Unentschieden.",
        difficulty = 5
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "In welchem Jahr gelang 1. FC Union Berlin erstmals der Aufstieg in die Bundesliga, was zum ersten Erstliga-Derby seit über 40 Jahren führte?",
        answerA = "2017",
        answerB = "2018",
        answerC = "2016",
        answerD = "2019",
        correctAnswer = 3,
        explanation = "Im Mai 2019 schaffte 1. FC Union Berlin erstmals in der Vereinsgeschichte den Aufstieg in die Bundesliga. Damit kam es zur ersten Erstliga-Derby-Begegnung der beiden Berliner Klubs seit über vier Jahrzehnten.",
        difficulty = 5,
        funFact = "Hertha BSC wollte das erste Bundesliga-Derby am 9. November 2019 ausrichten — dem 30. Jahrestag des Mauerfalls. Dieses Datum hätte eine symbolische Brücke zwischen den Klubs aus Ost- und West-Berlin geschlagen."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Welche Besonderheit hatte die Fanbeziehung zwischen Union Berlin und Hertha BSC während der Berliner Teilung?",
        answerA = "Es bestand eine Fanfreundschaft, keine Rivalität",
        answerB = "Union-Fans boykottierten alle Hertha-Spiele",
        answerC = "Es gab regelmäßige Schlägereien zwischen den Fanlagern",
        answerD = "Hertha-Fans durften Ost-Berlin nicht betreten",
        correctAnswer = 0,
        explanation = "Während der Berliner Teilung pflegten Hertha und Union eine ungewöhnliche Fanfreundschaft. Union-Fans besuchten Hertha-UEFA-Pokal-Spiele in Prag, Hertha-Fans kamen ans Alte Försterei. Die echte Rivalität begann erst mit gemeinsamen Pflichtspielen ab 2010.",
        difficulty = 5,
        funFact = "Im März 1979 reisten Union Berlin-Fans nach Prag, um Hertha BSC im UEFA-Pokal-Viertelfinalrückspiel gegen Dukla Prag anzufeuern. Diese Geste der Solidarität über die Grenzen der Berliner Teilung hinweg ist bis heute unvergessen."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Welcher Berliner Verein gewann die letzten vier Berliner Stadtderbys gegen Hertha BSC in der gemeinsamen Bundesliga-Zeit?",
        answerA = "Hertha BSC",
        answerB = "1. FC Union Berlin",
        answerC = "BFC Dynamo",
        answerD = "Wechselnde Sieger",
        correctAnswer = 1,
        explanation = "1. FC Union Berlin gewann die letzten vier Berliner Stadtderbys gegen Hertha BSC in der Bundesliga. Dieser Dominanzstreifen ist mitverantwortlich für die gewachsene Rivalität und den Statuswechsel zwischen den beiden Hauptstadtclubs.",
        difficulty = 5
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Wo spielt der 1. FC Union Berlin seine Heimspiele?",
        answerA = "Jahn-Sportpark Berlin",
        answerB = "Friedrich-Ludwig-Jahn-Sportpark",
        answerC = "Stadion An der Alten Försterei",
        answerD = "Sportforum Hohenschönhausen",
        correctAnswer = 2,
        explanation = "Der 1. FC Union Berlin spielt im Stadion An der Alten Försterei in Berlin-Köpenick. Das Stadion ist für seine besondere Atmosphäre bekannt und wurde in mehreren Etappen modernisiert.",
        difficulty = 5,
        funFact = "Das Stadion An der Alten Försterei wurde von Union-Fans in Eigenleistung renoviert — Tausende Mitglieder investierten Arbeitsstunden statt Geld. Diese Geschichte macht Union Berlin zu einem der ungewöhnlichsten Vereinsprojekte im modernen Fußball."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "In welchem Berliner Bezirk liegt das Stadion An der Alten Försterei von Union Berlin?",
        answerA = "Marzahn",
        answerB = "Friedrichshain",
        answerC = "Lichtenberg",
        answerD = "Köpenick",
        correctAnswer = 3,
        explanation = "Das Stadion An der Alten Försterei liegt im Berliner Bezirk Treptow-Köpenick, im Ortsteil Köpenick. Es befindet sich in einem Waldgebiet nahe dem Flüsschen Wuhle, was der Atmosphäre des Stadions ihren einzigartigen Charakter verleiht.",
        difficulty = 5
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "An welchem historischen Datum wollte Hertha BSC ursprünglich das erste Bundesliga-Derby gegen Union Berlin ausrichten?",
        answerA = "9. November 2019 (30. Jahrestag des Mauerfalls)",
        answerB = "3. Oktober 2019 (Tag der deutschen Einheit)",
        answerC = "1. Januar 2020 (Jahrtausendwende+20)",
        answerD = "12. August 2019 (Jahrestag des Mauerbaus)",
        correctAnswer = 0,
        explanation = "Hertha BSC äußerte den Wunsch, das erste Bundesliga-Derby gegen Union am 9. November 2019 auszutragen — dem 30. Jahrestag des Mauerfalls. Das hätte die symbolische Brücke zwischen den Klubs aus Ost- und West-Berlin perfektiert.",
        difficulty = 5,
        funFact = "Der 9. November wäre ein perfektes Datum gewesen: Union aus dem früheren Ost-Berlin, Hertha aus dem West-Berliner Olympiastadion — ein Derby am Tag des Mauerfalls hätte eine einzigartige historische Symbolik gehabt."
    ),

    // ── TENNIS BORUSSIA & BERLINER FUSSBALL (37–43) ────────────────────────────

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Wann wurde Tennis Borussia Berlin (TeBe) gegründet?",
        answerA = "1895",
        answerB = "1902",
        answerC = "1910",
        answerD = "1898",
        correctAnswer = 1,
        explanation = "Tennis Borussia Berlin wurde am 9. April 1902 gegründet, als sich zwölf junge Sportler in einer Konditorei in Berlin-Mitte versammelten und die 'Kameradschaftliche Vereinigung Borussia' mit der 'Berliner Tennis- und Ping-Pong-Gesellschaft' zusammenschlossen.",
        difficulty = 5,
        funFact = "Tennis Borussia begann tatsächlich als Tennis- und Tischtennis-Verein — Fußball wurde erst 1903 aufgenommen. Der Name 'Tennis Borussia' blieb jedoch, auch nachdem Fußball zur wichtigsten Sportart wurde."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Mit welchem historischen Ergebnis besiegte Tennis Borussia Berlin Hertha BSC im Gauliga-Finale 1941?",
        answerA = "8:2",
        answerB = "4:1",
        answerC = "6:0",
        answerD = "5:3",
        correctAnswer = 0,
        explanation = "Im Gauliga-Finale Berlin-Brandenburg 1941 demütigte Tennis Borussia Berlin den Stadtrivalen Hertha BSC mit 8:2 — einer der höchsten Niederlagen in Herthasz Vereinsgeschichte. TeBe gewann damit seine zweite Stadtmeisterschaft.",
        difficulty = 5,
        funFact = "Tennis Borussia Berlin hatte bereits 1932 die erste Stadtliga-Meisterschaft gewonnen. Der 8:2-Sieg gegen Hertha 1941 blieb aber das sportliche Highlight der TeBe-Geschichte — und eines der unvergesslichsten Derbys der Berliner Fußballgeschichte."
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Wann nahm Tennis Borussia Berlin (TeBe) erstmals den Fußball als Sport auf?",
        answerA = "1898",
        answerB = "1901",
        answerC = "1903",
        answerD = "1906",
        correctAnswer = 2,
        explanation = "Tennis Borussia Berlin nahm erst 1903 den Fußball auf, ein Jahr nach der Vereinsgründung 1902. Ursprünglich war TeBe ein reiner Tennis- und Tischtennisverein. Die Fußballabteilung entwickelte sich jedoch schnell zur bedeutendsten des Vereins.",
        difficulty = 5
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wann wurde BFC Dynamo als eigenständiger Fußballverein gegründet?",
        answerA = "1954",
        answerB = "1958",
        answerC = "1962",
        answerD = "1966",
        correctAnswer = 3,
        explanation = "Der Berliner FC Dynamo (BFC Dynamo) wurde am 15. Januar 1966 gegründet, als die Fußballabteilung vom SC Dynamo Berlin ausgegliedert wurde. Zuvor existierte seit 1954 der SC Dynamo Berlin als Gesamtsportverein.",
        difficulty = 5,
        funFact = "BFC Dynamo ist als 'Stasi-Club' in die Geschichte eingegangen, da der Verein enge Verbindungen zur Staatssicherheit der DDR hatte. Die zehn DDR-Meisterschaften in Folge (1979–1988) sind bis heute umstritten."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wie viele DDR-Meisterschaften gewann BFC Dynamo in Folge zwischen 1979 und 1988?",
        answerA = "10",
        answerB = "8",
        answerC = "9",
        answerD = "7",
        correctAnswer = 0,
        explanation = "BFC Dynamo gewann zwischen 1979 und 1988 zehn DDR-Meisterschaften in Folge — eine Rekordserie, die bis heute die längste in der Geschichte der DDR-Oberliga ist. Der Verein ist damit Rekordmeister der DDR-Liga.",
        difficulty = 5,
        funFact = "Die Dominanz von BFC Dynamo in den 1980er-Jahren war so erdrückend, dass andere DDR-Vereine scherzhaft sagten, die einzige Frage sei nicht ob, sondern wie hoch BFC Meister wird. Die Verflechtung mit der Stasi machte den Verein bei anderen Fans verhasst."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Was bedeutet die Abkürzung 'BSC' im heutigen Vereinsnamen 'Hertha BSC'?",
        answerA = "Berliner Sportclub 1892",
        answerB = "Berliner Sport-Club",
        answerC = "Brandenburger Sport-Club",
        answerD = "Berliner Sportverein Club",
        correctAnswer = 1,
        explanation = "Die Abkürzung 'BSC' steht für 'Berliner Sport-Club' — den Fusionspartner, mit dem Hertha 1923 zusammenging. Bis 1930 lief der Verein als gemeinsamer Club, danach trennte man sich wieder, aber der Name 'Hertha BSC' blieb erhalten.",
        difficulty = 5
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Welcher Verein war der erste Stadtmeister der Berliner Stadtliga von Tennis Borussia Berlin — im Jahr 1932?",
        answerA = "Hertha BSC",
        answerB = "BFC Dynamo",
        answerC = "Tennis Borussia Berlin",
        answerD = "Berliner SV 1892",
        correctAnswer = 2,
        explanation = "Tennis Borussia Berlin gewann 1932 die erste Stadtliga-Meisterschaft der Oberliga Berlin-Brandenburg. Es war der erste von zwei Stadtmeistertiteln des Vereins (der zweite folgte 1941 mit dem 8:2-Sieg gegen Hertha).",
        difficulty = 5
    ),

    // ── HERTHA BSC: BUNDESLIGA & MODERNE ÄRA (44–50) ─────────────────────────

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "Wie viele Male trat Hertha BSC zwischen 1926 und 1931 in Folge ins Finale der Deutschen Meisterschaft ein?",
        answerA = "4",
        answerB = "5",
        answerC = "7",
        answerD = "6",
        correctAnswer = 3,
        explanation = "Hertha BSC stand von 1926 bis 1931 sechsmal in Folge im Finale der Deutschen Meisterschaft — ein Rekord, der in der Geschichte des deutschen Fußballs nur einmal erreicht (FC Schalke 04, 1937–1942), aber nie übertroffen wurde.",
        difficulty = 5,
        funFact = "In den ersten vier Finalteilnahmen (1926–1929) verlor Hertha BSC jedes Mal. Erst im fünften Anlauf 1930 gelang der erste Titelgewinn gegen Holstein Kiel. Das macht die sechs Finale noch dramatischer."
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein errang Hertha BSC am 22. Juni 1930 seinen ersten Deutschen Meistertitel — und mit welchem Ergebnis?",
        answerA = "5:4 gegen Holstein Kiel",
        answerB = "3:1 gegen den 1. FC Nürnberg",
        answerC = "2:0 gegen Schalke 04",
        answerD = "4:2 gegen Eintracht Frankfurt",
        correctAnswer = 0,
        explanation = "Am 22. Juni 1930 gewann Hertha BSC mit 5:4 gegen Holstein Kiel die erste Deutsche Meisterschaft. Dieses dramatische Finale mit neun Toren war der Lohn für jahrelange Arbeit nach vier vorherigen Finalniederlagen.",
        difficulty = 5,
        funFact = "Das Finale 1930 war so dramatisch, dass es 9 Tore gab — davon 5 für Hertha und 4 für Holstein Kiel. Ein Spiel dieser Intensität war im deutschen Fußball der damaligen Zeit ungewöhnlich."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Welcher Verein war neben Hertha BSC der erfolgreichste Fußballklub Deutschlands in der Zwischenkriegszeit?",
        answerA = "Hamburger SV",
        answerB = "1. FC Nürnberg",
        answerC = "Schalke 04",
        answerD = "Borussia Dortmund",
        correctAnswer = 1,
        explanation = "In der Zwischenkriegszeit war der 1. FC Nürnberg der dominante Verein Deutschlands und gilt als der erfolgreichste dieser Ära. Hertha BSC war mit seinen zwei Meisterschaften (1930/31) der zweiterfolgreichste Verein jener Epoche.",
        difficulty = 5
    ),

    // correctAnswer=2
    Question(
        categoryId = 13,
        questionText = "Welche Besonderheit verbindet das Olympiastadion Berlin mit keinem anderen Stadion der Welt (Stand 2024)?",
        answerA = "Gleichzeitig Olympia-Austragungsort und Bundesliga-Heimstadion",
        answerB = "Dreifacher Heimatclub eines Vereins über 60 Jahre",
        answerC = "Gastgeber von WM-Finale und EM-Finale",
        answerD = "Ältestes noch genutztes Fußballstadion Europas",
        correctAnswer = 2,
        explanation = "Das Olympiastadion Berlin ist das einzige Stadion der Welt, das sowohl das FIFA WM-Finale (2006: Italien vs. Frankreich) als auch das UEFA EM-Finale (2024: Spanien vs. England) ausgerichtet hat. Diese Doppelstellung ist weltweit einzigartig.",
        difficulty = 5,
        funFact = "Beide Endspiele haben historische Momente hervorgebracht: 2006 Zidanes Kopfstoß, 2024 Spaniens Triumph mit dem jüngsten WM-Finaltorschützen aller Zeiten (Lamine Yamal, 17 Jahre)."
    ),

    // correctAnswer=3
    Question(
        categoryId = 13,
        questionText = "In welchem Bundesland liegt das Olympiastadion Berlin rechtlich und administrativ?",
        answerA = "Brandenburg",
        answerB = "Preußen",
        answerC = "Berlin-West (historisch)",
        answerD = "Berlin (Stadtstat)",
        correctAnswer = 3,
        explanation = "Berlin ist als Stadtstat (Stadtstaat) gleichzeitig Stadt und Bundesland. Das Olympiastadion liegt im Bezirk Charlottenburg-Wilmersdorf des Bundeslandes Berlin — eines der drei deutschen Stadtstaaten neben Hamburg und Bremen.",
        difficulty = 5
    ),

    // correctAnswer=0
    Question(
        categoryId = 13,
        questionText = "Wann wurde das Olympiastadion Berlin nach der Sanierung 2000–2004 feierlich wiedereröffnet?",
        answerA = "Juli 2004",
        answerB = "August 2005",
        answerC = "März 2004",
        answerD = "Oktober 2004",
        correctAnswer = 0,
        explanation = "Das Olympiastadion Berlin wurde im Juli 2004 feierlich wiedereröffnet, nach vier Jahren Bauzeit (Mai 2000 bis Juli 2004). Die Eröffnung erfolgte rechtzeitig, damit das Stadion die Qualifikationsspiele und das Confederations Cup 2005 ausrichten konnte.",
        difficulty = 5,
        funFact = "Die Wiedereröffnung des Olympiastadions 2004 war ein Medienereignis, das Deutschland-weit Aufmerksamkeit erlangte. Die Mischung aus historischem Denkmal und modernem Bundesliga-Stadion galt als gelungene Synthese."
    ),

    // correctAnswer=1
    Question(
        categoryId = 13,
        questionText = "Wofür steht der Name 'Hertha' im Vereinsnamen Hertha BSC — und woher kommt er?",
        answerA = "Griechische Göttin der Erde",
        answerB = "Name eines Ausflugsdampfers auf der Spree",
        answerC = "Name der Ehefrau des Gründers Fritz Lindner",
        answerD = "Nordischer Name für 'Stärke und Ausdauer'",
        correctAnswer = 1,
        explanation = "Der Name 'Hertha' leitet sich von einem Ausflugsdampfer namens 'Hertha' ab, den die Gründer Fritz und Max Lindner sowie Otto und Willi Lorenz am Gründungstag (25. Juli 1892) auf der Spree erblickten. Der Dampfer inspirierte sowohl den Namen als auch die blau-weißen Vereinsfarben.",
        difficulty = 5,
        funFact = "Das Dampfschiff 'Hertha' fuhr auf der Spree mit blau-weißen Nationalfarben — daher sind Herthaz Trikotfarben bis heute blau-weiß. Ein zufälliger Blick auf einen Ausflugssteamer hat also die Identität eines der bekanntesten deutschen Fußballvereine geprägt."
    )

)
