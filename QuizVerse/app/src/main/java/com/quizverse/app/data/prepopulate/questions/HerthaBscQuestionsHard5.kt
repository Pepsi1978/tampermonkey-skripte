package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun herthaBscQuestionsHard5(): List<Question> = listOf(

    // ── INVESTOR WINDHORST (1–10) ──────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr schloss Hertha BSC erstmals eine Investitionsvereinbarung mit Lars Windhorst ab?",
        answerA = "2018",
        answerB = "2019",
        answerC = "2020",
        answerD = "2021",
        correctAnswer = 1,
        explanation = "Lars Windhorst schloss im Juni 2019 über seine Tennor Holding erstmals eine Investitionsvereinbarung mit Hertha BSC und erwarb zunächst einen Anteil an der Hertha BSC GmbH & Co. KGaA.",
        difficulty = 3,
        funFact = "Windhorst nannte Hertha BSC öffentlich einen 'schlafenden Giganten' — ein Satz, der in Berlin schnell berühmt-berüchtigt wurde."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie hoch war der Gesamtbetrag, den Lars Windhorst über seine Tennor Holding in Hertha BSC investierte?",
        answerA = "224 Millionen Euro",
        answerB = "300 Millionen Euro",
        answerC = "374 Millionen Euro",
        answerD = "450 Millionen Euro",
        correctAnswer = 2,
        explanation = "Lars Windhorst investierte insgesamt rund 374 Millionen Euro in Hertha BSC, verteilt auf mehrere Tranchen. Zunächst 224 Millionen für 49,9 % der Anteile, dann eine weitere Tranche von 150 Millionen Euro.",
        difficulty = 3,
        funFact = "Trotz dieser enormen Investition konnte Windhorst letztlich nur etwa 100 Millionen Euro von Nachfolger 777 Partners zurückbekommen — ein Verlust von rund 274 Millionen Euro."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen prozentualen Anteil an der Hertha BSC KGaA hielt Tennor Holding nach der zweiten Investitionstranche?",
        answerA = "49,9 %",
        answerB = "55,0 %",
        answerC = "66,6 %",
        answerD = "74,9 %",
        correctAnswer = 2,
        explanation = "Nach der zweiten Investition von weiteren 150 Millionen Euro erhöhte Tennor Holding ihren Anteil auf 66,6 % der Hertha BSC GmbH & Co. KGaA.",
        difficulty = 3,
        funFact = "Die Überschreitung der 50-%-Marke war rechtlich möglich, weil Hertha BSC als Kommanditgesellschaft auf Aktien strukturiert ist und nicht direkt unter die 50+1-Regel fiel."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher US-amerikanische Investor übernahm im März 2023 die Windhorst-Anteile an Hertha BSC?",
        answerA = "Silver Lake Partners",
        answerB = "RedBird Capital",
        answerC = "Elliott Management",
        answerD = "777 Partners",
        correctAnswer = 3,
        explanation = "777 Partners aus Miami, Florida, übernahm im März 2023 die Anteile von Tennor Holding und zahlte dafür rund 100 Millionen Euro, womit sie 78,8 % der Hertha BSC KGaA hielten.",
        difficulty = 3,
        funFact = "777 Partners hielt zum Zeitpunkt des Einstiegs bei Hertha auch Anteile an anderen Fußballklubs weltweit, darunter Vasco da Gama (Brasilien) und Standard Lüttich (Belgien)."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viel Prozent der Hertha BSC KGaA erwarb 777 Partners im März 2023 von Tennor Holding?",
        answerA = "66,6 %",
        answerB = "74,9 %",
        answerC = "78,8 %",
        answerD = "82,3 %",
        correctAnswer = 2,
        explanation = "777 Partners erwarb 78,8 % der Hertha BSC GmbH & Co. KGaA von Lars Windhorsts Tennor Holding für rund 100 Millionen Euro.",
        difficulty = 3,
        funFact = "Obwohl Windhorst 374 Millionen Euro investiert hatte, erhielt er für seinen Anteil nur rund 100 Millionen Euro zurück — das entspricht etwa einem Verlust von 73 %."
    ),

    Question(
        categoryId = 13,
        questionText = "Was forderte Lars Windhorst im Rahmen seines Konflikts mit Hertha BSC öffentlich?",
        answerA = "Einen Sitz im Aufsichtsrat für sich persönlich",
        answerB = "Den Rücktritt von Präsident Kay Bernstein",
        answerC = "Die sofortige Auflösung der KGaA-Struktur",
        answerD = "Die Abberufung des damaligen Geschäftsführers Fredi Bobic",
        correctAnswer = 3,
        explanation = "Lars Windhorst forderte öffentlich die Abberufung von Hertha-Geschäftsführer Fredi Bobic und warf dem Verein Missmanagement vor. Dieser Konflikt eskalierte Ende 2021 und Anfang 2022.",
        difficulty = 3,
        funFact = "Windhorst engagierte sogar PR-Berater und schickte offene Briefe an die Medien, um seinen Druck auf die Vereinsführung zu verstärken."
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen Lars Windhorst wurde 2024 ein Haftbefehl erlassen. Warum?",
        answerA = "Wegen Steuerhinterziehung in Millionenhöhe",
        answerB = "Wegen Nichterscheinens vor Gericht trotz Vorladung",
        answerC = "Wegen Betrugs im Zusammenhang mit dem Hertha-Vertrag",
        answerD = "Wegen Beleidigung eines Hertha-Funktionärs",
        correctAnswer = 1,
        explanation = "Ein Haftbefehl gegen Lars Windhorst wurde erlassen, weil er einer gerichtlichen Vorladung nicht Folge leistete. Ihm drohten drei Wochen Haft als Ordnungsmittel.",
        difficulty = 3,
        funFact = "Der Haftbefehl hatte keine direkte Verbindung zu seinen Hertha-Investitionen, zeigte aber die turbulente rechtliche Situation des ehemaligen Investors."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Begriff verwendete Lars Windhorst, um seine Vision für Hertha BSC zu beschreiben?",
        answerA = "Operation Goldadler",
        answerB = "Projekt Hauptstadt",
        answerC = "Vision Berlin 2025",
        answerD = "Big City Club",
        correctAnswer = 3,
        explanation = "Lars Windhorst verwendete den Begriff 'Big City Club', um seine Vision für Hertha BSC zu beschreiben — Hertha sollte zu einem der großen Klubs Europas werden, vergleichbar mit Vereinen aus London oder Paris.",
        difficulty = 3,
        funFact = "Der Begriff 'Big City Club' wurde so populär, dass Hertha-Fans ihn als ironischen Kommentar nutzten, wenn der Verein wieder einmal enttäuschend abschnitt."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr eskalierte der Konflikt zwischen Lars Windhorst und der Hertha-Vereinsführung erstmals öffentlich?",
        answerA = "2020",
        answerB = "2022",
        answerC = "2023",
        answerD = "2021",
        correctAnswer = 3,
        explanation = "Ende 2021 eskalierte der Konflikt zwischen Lars Windhorst und der Hertha-Vereinsführung. Windhorst äußerte sich öffentlich zu Management-Fehlern und forderte personelle Konsequenzen.",
        difficulty = 3,
        funFact = "Windhorst bezeichnete Herthas Sportdirektor Arne Friedrich in einem Interview als einen der Hauptverantwortlichen für die sportliche Misere."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Anteil hielt der eingetragene Verein Hertha BSC e.V. nach dem Einstieg von 777 Partners noch an der Hertha BSC KGaA?",
        answerA = "10,6 %",
        answerB = "18,4 %",
        answerC = "21,2 %",
        answerD = "33,4 %",
        correctAnswer = 2,
        explanation = "Nach dem Einstieg von 777 Partners mit 78,8 % hielt der eingetragene Verein Hertha BSC e.V. noch rund 21,2 % der Anteile an der KGaA.",
        difficulty = 3,
        funFact = "Die komplizierte KGaA-Struktur ermöglichte es Investoren, Mehrheitsanteile zu erwerben, während der eingetragene Verein weiterhin Komplementär blieb und damit bestimmte Vetorechte behielt."
    ),

    // ── ABSTIEGE & AUFSTIEGE (11–20) ───────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "In welcher Saison stieg Hertha BSC zum zweiten Mal nach der Wiedervereinigung aus der Bundesliga ab?",
        answerA = "Saison 2011/12",
        answerB = "Saison 2012/13",
        answerC = "Saison 2009/10",
        answerD = "Saison 2010/11",
        correctAnswer = 0,
        explanation = "Hertha BSC stieg in der Saison 2011/12 erneut aus der Bundesliga ab. Es war nach 2009/10 der zweite Abstieg innerhalb weniger Jahre.",
        difficulty = 3,
        funFact = "Zwischen 2010 und 2013 pendelte Hertha BSC zweimal zwischen der Bundesliga und der 2. Bundesliga hin und her — eine Phase, die die Instabilität des Vereins illustrierte."
    ),

    Question(
        categoryId = 13,
        questionText = "Mit wie vielen Punkten belegte Hertha BSC in der Abstiegssaison 2022/23 den letzten Tabellenplatz?",
        answerA = "24 Punkte",
        answerB = "27 Punkte",
        answerC = "29 Punkte",
        answerD = "31 Punkte",
        correctAnswer = 2,
        explanation = "Hertha BSC beendete die Saison 2022/23 mit 29 Punkten auf dem letzten Tabellenplatz und stieg damit direkt in die 2. Bundesliga ab.",
        difficulty = 3,
        funFact = "Trotz einem starken Saisonfinish unter dem zurückgekehrten Pál Dárdai reichten die Punkte nicht mehr aus — Hertha hatte das Relegationsfeld zu weit hinter sich gelassen."
    ),

    Question(
        categoryId = 13,
        questionText = "Welches Ergebnis der Partie gegen Schalke 04 im April 2023 führte zur Entlassung von Sandro Schwarz?",
        answerA = "0:3",
        answerB = "1:4",
        answerC = "2:5",
        answerD = "3:6",
        correctAnswer = 2,
        explanation = "Nach einer 2:5-Niederlage gegen Schalke 04 im April 2023, bei der Hertha das Schlusslicht der Bundesliga war, wurde Sandro Schwarz entlassen und Pál Dárdai übernahm.",
        difficulty = 3,
        funFact = "Das Spiel gegen Schalke war das vierte Mal in dieser Saison, dass Hertha mindestens fünf Gegentore kassierte — ein Rekord an Defensive-Schwäche."
    ),

    Question(
        categoryId = 13,
        questionText = "In welcher Saison schaffte Hertha BSC nach dem Abstieg 2012 den direkten Wiederaufstieg?",
        answerA = "Saison 2012/13",
        answerB = "Saison 2013/14",
        answerC = "Saison 2014/15",
        answerD = "Saison 2015/16",
        correctAnswer = 0,
        explanation = "Nach dem Abstieg in der Saison 2011/12 gelang Hertha BSC in der darauffolgenden Saison 2012/13 der direkte Wiederaufstieg in die Bundesliga.",
        difficulty = 3,
        funFact = "Jos Luhukay führte Hertha BSC als Meister der 2. Bundesliga 2012/13 zurück ins Oberhaus — mit 19 Saisonsiegen und einem deutlichen Vorsprung."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer war Trainer von Hertha BSC, als der Verein in der Saison 2021/22 knapp den Abstieg verhinderte?",
        answerA = "Tayfun Korkut",
        answerB = "Pál Dárdai",
        answerC = "Felix Magath",
        answerD = "Sandro Schwarz",
        correctAnswer = 2,
        explanation = "Felix Magath übernahm im März 2022 als Nothelfer bei Hertha BSC und rettete den Verein in der Saison 2021/22 durch die Relegation gegen den Hamburger SV vor dem Abstieg.",
        difficulty = 3,
        funFact = "Felix Magath war zum Zeitpunkt seiner Verpflichtung 68 Jahre alt — er wurde damit zum ältesten Trainer in der Bundesliga-Geschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Gegen welchen Verein bestritt Hertha BSC im Mai 2022 die Bundesliga-Relegation und wie lautete das Gesamtergebnis?",
        answerA = "1. FC Heidenheim, 1:2",
        answerB = "Hamburger SV, 2:1",
        answerC = "Fortuna Düsseldorf, 3:2",
        answerD = "VfB Stuttgart, 2:2 (nach Verlängerung)",
        correctAnswer = 1,
        explanation = "Hertha BSC traf in der Relegation 2022 auf den Hamburger SV. Nach einem 1:0 im Hinspiel und einem 2:0 im Rückspiel sicherte sich Hertha den Bundesliga-Verbleib mit einem Gesamtergebnis von 2:1.",
        difficulty = 3,
        funFact = "Der Hamburger SV war zum dritten Mal in Folge in die Relegation geraten — alle drei Male scheiterte der HSV und verpasste den Aufstieg."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Trainer wurde im November 2021 nach nur wenigen Monaten im Amt von Hertha BSC entlassen?",
        answerA = "Tayfun Korkut",
        answerB = "Pál Dárdai",
        answerC = "Bruno Labbadia",
        answerD = "Ante Čović",
        correctAnswer = 1,
        explanation = "Pál Dárdai übernahm im Januar 2021 Hertha BSC und rettete den Verein zunächst vor dem Abstieg. Nach einem schwachen Saisonstart 2021/22 wurde er jedoch im November 2021 entlassen und durch Tayfun Korkut ersetzt.",
        difficulty = 3,
        funFact = "Es war bereits das zweite Mal, dass Dárdai als Trainer von Hertha entlassen wurde — sein Leidensweg mit dem Verein setzte sich fort."
    ),

    Question(
        categoryId = 13,
        questionText = "In welcher Saison der 2. Bundesliga nach dem Abstieg 2023 erreichte Hertha BSC den besten Tabellenplatz?",
        answerA = "Saison 2023/24 — Platz 8",
        answerB = "Saison 2023/24 — Platz 10",
        answerC = "Saison 2024/25 — Platz 6",
        answerD = "Saison 2024/25 — Platz 4",
        correctAnswer = 2,
        explanation = "In der Saison 2024/25 belegte Hertha BSC nach 26 Spieltagen Platz 6 mit 41 Punkten. Die Saison 2023/24 verlief unter den Erwartungen.",
        difficulty = 3,
        funFact = "Nach dem Abstieg 2023 brauchte Hertha BSC Zeit, um sich neu zu formieren — der direkte Wiederaufstieg blieb zunächst aus, anders als es Fans und Vereinsführung gehofft hatten."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele verschiedene Cheftrainer setzte Hertha BSC allein in der Abstiegssaison 2022/23 ein?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "5",
        correctAnswer = 0,
        explanation = "In der Saison 2022/23 setzte Hertha BSC zwei Cheftrainer ein: Sandro Schwarz (bis April 2023) und Pál Dárdai (ab April 2023 bis Saisonende).",
        difficulty = 3,
        funFact = "Zählt man die Vorsaison 2021/22 hinzu, hatte Hertha BSC in nur zwei Jahren fünf verschiedene Trainer — ein Zeichen für die strukturelle Instabilität des Klubs."
    ),

    Question(
        categoryId = 13,
        questionText = "Wann stieg Hertha BSC zuletzt vor dem Abstieg 2023 aus der Bundesliga ab?",
        answerA = "2010",
        answerB = "2011",
        answerC = "2012",
        answerD = "2013",
        correctAnswer = 2,
        explanation = "Der letzte Bundesliga-Abstieg vor 2023 war in der Saison 2011/12. Danach gelang 2012/13 der direkte Wiederaufstieg, und Hertha blieb bis 2023 im Oberhaus.",
        difficulty = 3,
        funFact = "Die elfjährige Zugehörigkeit zur Bundesliga von 2012 bis 2023 war die längste ununterbrochene Erstliga-Periode in der modernen Hertha-Geschichte."
    ),

    // ── TRAINER & PERSONAL (21–30) ──────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welcher Trainer übernahm Hertha BSC für die Saison 2024/25 nach Pál Dárdais Abgang?",
        answerA = "Steffen Baumgart",
        answerB = "Cristian Fiél",
        answerC = "Markus Weinzierl",
        answerD = "Tim Walter",
        correctAnswer = 1,
        explanation = "Cristian Fiél wurde als neuer Cheftrainer bei Hertha BSC für die Saison 2024/25 verpflichtet. Er kam von 1. FC Nürnberg und unterschrieb einen Vertrag bis 2026.",
        difficulty = 3,
        funFact = "Cristian Fiél ist spanisch-deutscher Abstammung und begann seine Trainerkarriere in der Jugend beim BVB, bevor er bei Nürnberg seinen Durchbruch als Chefcoach feierte."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie oft war Pál Dárdai insgesamt als Cheftrainer von Hertha BSC tätig?",
        answerA = "Zweimal",
        answerB = "Viermal",
        answerC = "Einmal",
        answerD = "Dreimal",
        correctAnswer = 3,
        explanation = "Pál Dárdai war dreimal Cheftrainer von Hertha BSC: von 2015 bis 2019, dann kurz 2021 und erneut ab April 2023 bis Sommer 2024.",
        difficulty = 3,
        funFact = "Dárdai ist gebürtiger Ungar und spielte selbst 15 Jahre für Hertha BSC als Profi — er ist damit einer der größten Sympathieträger in der Vereinsgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Trainer brachte Hertha BSC in der Saison 2019/20 auf Platz 10 der Bundesliga — das beste Ergebnis der 2010er-Jahre?",
        answerA = "Pál Dárdai",
        answerB = "Ante Čović",
        answerC = "Bruno Labbadia",
        answerD = "Jürgen Klinsmann",
        correctAnswer = 2,
        explanation = "Bruno Labbadia übernahm Hertha BSC im April 2020 und führte den Verein nach dem Corona-Neustart auf Platz 10. Allerdings begann die Saison bereits unter Ante Čović und kurz unter Jürgen Klinsmann.",
        difficulty = 3,
        funFact = "Der Saisonabschluss unter Labbadia auf Platz 10 weckte trotzdem keine nachhaltigen Hoffnungen: Ein Jahr später war Hertha wieder Abstiegskandidat."
    ),

    Question(
        categoryId = 13,
        questionText = "Jürgen Klinsmann war im Jahr 2019/20 kurzzeitig Trainer bei Hertha BSC. Wie lange dauerte sein Engagement?",
        answerA = "Sechs Wochen",
        answerB = "Fünf Monate",
        answerC = "Drei Monate",
        answerD = "Elf Wochen",
        correctAnswer = 3,
        explanation = "Jürgen Klinsmann übernahm Hertha BSC im November 2019 und trat bereits im Februar 2020 zurück — nach nur elf Wochen im Amt. Er erklärte seinen Rücktritt überraschend via Facebook.",
        difficulty = 3,
        funFact = "Klinsmanns Abgang via Facebook-Post wurde zum Sinnbild für die chaotische Vereinsführung in der Windhorst-Ära: Weder Spieler noch Funktionäre waren auf den Rücktritt vorbereitet."
    ),

    Question(
        categoryId = 13,
        questionText = "Wer übernahm nach Kay Bernsteins Tod im Januar 2024 kommissarisch das Amt des Hertha-Präsidenten?",
        answerA = "Fabian Drescher",
        answerB = "Michael Preetz",
        answerC = "Arne Friedrich",
        answerD = "Fredi Bobic",
        correctAnswer = 0,
        explanation = "Vizepräsident Fabian Drescher übernahm nach dem überraschenden Tod von Kay Bernstein im Januar 2024 kommissarisch die Funktion des Vereinspräsidenten.",
        difficulty = 3,
        funFact = "Fabian Drescher war kein ehemaliger Profi, sondern ein Vereinsfunktionär aus dem Fanumfeld — als Vizepräsident war er bereits unter Bernstein für organisatorische Aufgaben zuständig."
    ),

    Question(
        categoryId = 13,
        questionText = "Wann und wie starb Hertha-Präsident Kay Bernstein?",
        answerA = "Er starb im März 2024 an Krebs",
        answerB = "Er starb im Januar 2024 an plötzlichem Herzversagen",
        answerC = "Er verunglückte im Dezember 2023 bei einem Unfall",
        answerD = "Er starb im Februar 2024 nach langer Krankheit",
        correctAnswer = 1,
        explanation = "Hertha-Präsident Kay Bernstein starb am 16. Januar 2024 im Alter von nur 43 Jahren an plötzlichem Herzversagen. Seine Frau fand ihn leblos am Morgen.",
        difficulty = 3,
        funFact = "Kay Bernstein war früher aktiver Ultra bei Hertha BSC und hatte sich als Fanaktivist für Mitgliederrechte eingesetzt, bevor er 2022 überraschend zum Vereinspräsidenten gewählt wurde."
    ),

    Question(
        categoryId = 13,
        questionText = "Fredi Bobic war von 2021 bis 2022 Geschäftsführer Sport bei Hertha BSC. Woher kam er?",
        answerA = "Vom FC Bayern München",
        answerB = "Von Borussia Dortmund",
        answerC = "Vom VfB Stuttgart",
        answerD = "Von Eintracht Frankfurt",
        correctAnswer = 3,
        explanation = "Fredi Bobic wechselte im Sommer 2021 von Eintracht Frankfurt zu Hertha BSC, wo er als Geschäftsführer Sport tätig war. Bei Frankfurt hatte er den Verein als Sportvorstand zu großen Erfolgen geführt.",
        difficulty = 3,
        funFact = "Bobic holte in seiner kurzen Zeit bei Hertha eine Reihe von Spielern, die sich aber nicht durchsetzen konnten — sein Abgang nach weniger als zwei Jahren gilt als weiteres Zeichen der Instabilität."
    ),

    Question(
        categoryId = 13,
        questionText = "Werner Gegenbauer war 14 Jahre lang Präsident von Hertha BSC. In welchem Jahr trat er zurück?",
        answerA = "2022",
        answerB = "2020",
        answerC = "2021",
        answerD = "2023",
        correctAnswer = 0,
        explanation = "Werner Gegenbauer trat im Mai 2022 nach 14-jähriger Amtszeit als Präsident von Hertha BSC zurück. Seine Amtszeit war geprägt von sportlichen Höhen und Tiefen sowie dem turbulenten Windhorst-Investment.",
        difficulty = 3,
        funFact = "Gegenbauer holte Lars Windhorst als Investor zu Hertha BSC — ein Schritt, der zunächst euphorisch gefeiert wurde, sich aber langfristig als problematisch herausstellte."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie wurde Kay Bernstein auf der Mitgliederversammlung 2022 zum Hertha-Präsidenten gewählt — und gegen wen setzte er sich durch?",
        answerA = "Einstimmig, da er der einzige Kandidat war",
        answerB = "Mit 1670 Stimmen gegen CDU-Politiker Frank Steffel mit 1280 Stimmen",
        answerC = "Knapp mit 51 % der Stimmen gegen Werner Gegenbauer",
        answerD = "Mit 2100 Stimmen als Ergebnis einer Online-Abstimmung",
        correctAnswer = 1,
        explanation = "Kay Bernstein wurde auf der Mitgliederversammlung am 26. Juni 2022 mit 1670 Stimmen zum Präsidenten gewählt. Er setzte sich überraschend gegen den favorisierten CDU-Politiker Frank Steffel durch, der 1280 Stimmen erhielt.",
        difficulty = 3,
        funFact = "Bernsteins Wahl gilt als einer der spektakulärsten Momente in der neueren Vereinsgeschichte — der ehemalige Ultra schlug den politisch vernetzten Kandidaten und wurde damit zur Symbolfigur der Fankultur."
    ),

    Question(
        categoryId = 13,
        questionText = "Welchen Verein hatte Tayfun Korkut vor seiner Verpflichtung als Hertha-Trainer im November 2021 zuletzt betreut?",
        answerA = "VfB Stuttgart",
        answerB = "1. FSV Mainz 05",
        answerC = "Bayer Leverkusen",
        answerD = "Hannover 96",
        correctAnswer = 0,
        explanation = "Tayfun Korkut war zuletzt beim VfB Stuttgart als Trainer tätig gewesen, bevor er im November 2021 von Hertha BSC als Nachfolger von Pál Dárdai verpflichtet wurde.",
        difficulty = 3,
        funFact = "Korkut galt als Feuerwehrmann-Trainer — auch in Stuttgart übernahm er eine Mannschaft in akuter Abstiegsgefahr und rettete sie, bevor er entlassen wurde."
    ),

    // ── TRANSFERS & KADER (31–40) ──────────────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welcher Transfer stellt bis heute den Rekord-Zugang in der Geschichte von Hertha BSC dar?",
        answerA = "Matheus Cunha für 18 Millionen Euro",
        answerB = "Dodi Lukebakio für 20 Millionen Euro",
        answerC = "Krzysztof Piątek für 24 Millionen Euro",
        answerD = "Lucas Tousart für 25 Millionen Euro",
        correctAnswer = 3,
        explanation = "Lucas Tousart ist der teuerste Zugang in der Geschichte von Hertha BSC. Der Franzose wurde im Januar 2020 für 25 Millionen Euro von Olympique Lyon verpflichtet und anschließend für den Rest der Saison zurück nach Lyon verliehen.",
        difficulty = 3,
        funFact = "Tousart wurde bei Hertha nie wirklich glücklich und verließ den Verein vorzeitig — trotzdem bleibt er der teuerste Einkauf der Vereinsgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Für welche Ablösesumme wechselte Matheus Cunha im Sommer 2021 von Hertha BSC zu Atlético Madrid?",
        answerA = "30 Millionen Euro",
        answerB = "22 Millionen Euro",
        answerC = "18 Millionen Euro",
        answerD = "26 Millionen Euro",
        correctAnswer = 3,
        explanation = "Matheus Cunha wechselte im Sommer 2021 für rund 26 Millionen Euro von Hertha BSC zu Atlético Madrid — und ist damit der teuerste Abgang in der Vereinsgeschichte.",
        difficulty = 3,
        funFact = "Cunha entwickelte sich nach seinem Wechsel enorm weiter: Über Atlético Madrid gelangte er zu Wolverhampton Wanderers in der Premier League, wo er zu einem der besten Stürmer avancierte."
    ),

    Question(
        categoryId = 13,
        questionText = "Woher kam Dodi Lukebakio, als er 2019 für 20 Millionen Euro zu Hertha BSC wechselte?",
        answerA = "Fortuna Düsseldorf",
        answerB = "FC Watford",
        answerC = "RSC Anderlecht",
        answerD = "AS Monaco",
        correctAnswer = 1,
        explanation = "Dodi Lukebakio wechselte im Sommer 2019 für rund 20 Millionen Euro vom englischen Erstligisten FC Watford zu Hertha BSC.",
        difficulty = 3,
        funFact = "Lukebakio war zuvor im Belgier-Trikot mit einem Hattrick gegen Bayern München beim FC Fortuna Düsseldorf aufgefallen — sein Wert stieg dadurch schlagartig."
    ),

    Question(
        categoryId = 13,
        questionText = "Krzysztof Piątek wechselte im Januar 2020 für 24 Millionen Euro zu Hertha BSC. Von welchem Verein kam er?",
        answerA = "Inter Mailand",
        answerB = "Genua CFC",
        answerC = "Juventus Turin",
        answerD = "AC Mailand",
        correctAnswer = 3,
        explanation = "Krzysztof Piątek wechselte im Januar 2020 für rund 24 Millionen Euro vom AC Mailand zu Hertha BSC. Er galt als einer der formstärksten Stürmer Europas, als Hertha ihn verpflichtete.",
        difficulty = 3,
        funFact = "Piątek hatte zuvor in der Serie A in rasanter Folge 19 Tore erzielt — bei Hertha traf er nie an diese Leistungen heran und verließ den Verein nach nur einer Saison."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Stürmer erzielte in der Saison 2019/20 trotz Abstiegssorgen mit 14 Toren die meisten Treffer für den Verein?",
        answerA = "Krzysztof Piątek",
        answerB = "Dodi Lukebakio",
        answerC = "Vedad Ibisevic",
        answerD = "Davie Selke",
        correctAnswer = 1,
        explanation = "Dodi Lukebakio war in der Saison 2019/20 mit 14 Bundesligatoren der erfolgreichste Torschütze von Hertha BSC.",
        difficulty = 3,
        funFact = "Lukebakio war einer der wenigen Lichtblicke in einer turbulenten Zeit bei Hertha — seine Tore konnten die strukturellen Probleme des Vereins aber nicht lösen."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Spieler wechselte im Sommer 2020 von Hertha BSC zu Borussia Dortmund?",
        answerA = "Ondřej Duda",
        answerB = "Niklas Stark",
        answerC = "Boyata Dedryck",
        answerD = "Dodi Lukebakio",
        correctAnswer = 0,
        explanation = "Ondřej Duda wechselte im Sommer 2020 von Hertha BSC zu Borussia Dortmund, nachdem er zuvor mehrere Jahre ein wichtiger Spieler im Berliner Mittelfeld gewesen war.",
        difficulty = 3,
        funFact = "Duda war unter Pal Dardai einer der kreativsten Mittelfeldspieler der Bundesliga — sein Abgang wurde als herber Verlust für Hertha gewertet."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Nationalspieler wurde im Sommer 2020 von Hertha BSC für rund 10 Millionen Euro vom FC Augsburg verpflichtet?",
        answerA = "Maximilian Arnold",
        answerB = "Florian Niederlechner",
        answerC = "Niklas Dorsch",
        answerD = "Álvaro Odriozola",
        correctAnswer = 1,
        explanation = "Florian Niederlechner wechselte im Sommer 2020 für rund 10 Millionen Euro vom FC Augsburg zu Hertha BSC. Er galt als robuster Stürmer, der Hertha mehr Physis geben sollte.",
        difficulty = 3,
        funFact = "Niederlechner erzielte bei Hertha BSC deutlich weniger Tore als erwartet und verließ den Verein nach nur einer Saison — ein weiterer teurer Fehleinkauf der Windhorst-Ära."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher langjährige Hertha-Kapitän und Innenverteidiger verließ den Verein im Sommer 2023 nach dem Abstieg ablösefrei?",
        answerA = "Dedryck Boyata",
        answerB = "Marc Oliver Kempf",
        answerC = "Niklas Stark",
        answerD = "Jordan Torunarigha",
        correctAnswer = 2,
        explanation = "Niklas Stark, langjähriger Innenverteidiger und zeitweise Kapitän von Hertha BSC, verließ den Verein nach dem Abstieg 2023 ablösefrei.",
        difficulty = 3,
        funFact = "Niklas Stark war zehn Jahre lang Teil der Hertha-Mannschaft und gilt als eines der Gesichter einer ganzen Ära — sein Abgang markierte das Ende einer Epoche."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Torwart war während der Bundesliga-Saison 2022/23 Herthas Stammtorhüter?",
        answerA = "Oliver Christensen",
        answerB = "Rune Jarstein",
        answerC = "Alexander Schwolow",
        answerD = "Tjark Ernst",
        correctAnswer = 0,
        explanation = "Oliver Christensen war in der Bundesliga-Saison 2022/23 Herthas Stammtorhüter. Der dänische Torwart hatte Konkurrenz durch andere Torhüter, setzte sich aber durch.",
        difficulty = 3,
        funFact = "Christensen wechselte nach dem Abstieg 2023 zu Fiorentina in die Serie A — ein weiterer Abgang eines zentralen Spielers nach dem Bundesliga-Absturz."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher brasilianische Mittelfeldspieler war in der Saison 2020/21 ein Leihtransfer bei Hertha BSC und besonderer Publikumsliebling?",
        answerA = "Matheus Cunha",
        answerB = "Santiago Ascacibar",
        answerC = "Lucas Tousart",
        answerD = "Eduard Löwen",
        correctAnswer = 0,
        explanation = "Matheus Cunha war zwar kein reiner Mittelfeldspieler — er spielte als hängende Spitze — war aber ein besonderer Publikumsliebling. In der Saison 2020/21 war er Herthas herausragender Akteur.",
        difficulty = 3,
        funFact = "Cunha war bei Hertha zeitweise spielprägend — seine Kreativität und sein Torriecher begeisterten die Fans und machten ihn zum begehrtesten Spieler im Kader."
    ),

    // ── VEREINSSTRUKTUR & FINANZEN (41–50) ─────────────────────────────────────

    Question(
        categoryId = 13,
        questionText = "Welche Rechtsform hat Hertha BSCs Profiabteilung, die es Investoren ermöglichte, Mehrheitsanteile zu erwerben?",
        answerA = "Aktiengesellschaft (AG)",
        answerB = "GmbH",
        answerC = "GmbH & Co. KGaA",
        answerD = "Verein auf Gegenseitigkeit",
        correctAnswer = 2,
        explanation = "Herthas Profiabteilung ist als GmbH & Co. Kommanditgesellschaft auf Aktien (KGaA) organisiert. Diese Rechtsform ermöglichte es, Investoren wie Windhorst und 777 Partners Mehrheitsanteile zu verkaufen, ohne die 50+1-Regel direkt zu umgehen.",
        difficulty = 3,
        funFact = "Die KGaA-Struktur ist im deutschen Fußball selten — außer Hertha nutzen sie vor allem Borussia Dortmund und Eintracht Frankfurt, wobei deren Strukturen sich im Detail unterscheiden."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr wurde Hertha BSC zuletzt Deutscher Meister?",
        answerA = "1930",
        answerB = "1931",
        answerC = "1968",
        answerD = "1971",
        correctAnswer = 1,
        explanation = "Hertha BSC wurde zuletzt 1931 Deutscher Meister — das ist inzwischen fast 95 Jahre her. Seit der Bundesliga-Gründung 1963 konnte Hertha nie die Meisterschaft gewinnen.",
        difficulty = 3,
        funFact = "Die letzte Meisterschaft liegt so weit zurück, dass sie noch in der Zeit der Weimarer Republik liegt — ein Fakt, der die historische Stagnation des Vereins verdeutlicht."
    ),

    Question(
        categoryId = 13,
        questionText = "Hertha BSC spielte von 2004 bis 2006 in der Champions League. Gegen welchen Verein schied Hertha in der Gruppenphase 2002/03 trotz zunächst gutem Start aus?",
        answerA = "Real Madrid",
        answerB = "AC Mailand",
        answerC = "Manchester United",
        answerD = "FC Arsenal",
        correctAnswer = 2,
        explanation = "Hertha BSC spielte in der Champions-League-Saison 2002/03 in einer Gruppe mit Manchester United, Deportivo La Coruña und Maccabi Haifa. Trotz eines 1:1 gegen Manchester United schied Hertha als Gruppendritter aus.",
        difficulty = 3,
        funFact = "Das Spiel Hertha gegen Manchester United in der Champions League 2002 lockte über 74.000 Zuschauer ins Olympiastadion — bis heute eine der emotionalsten Nächte der neueren Vereinsgeschichte."
    ),

    Question(
        categoryId = 13,
        questionText = "Was bezeichnete man bei Hertha BSC als die '50+1-Debatte' rund um den Windhorst-Deal?",
        answerA = "Die Diskussion, ob Windhorst 50 % plus eine Aktie kaufen darf",
        answerB = "Den Streit um Windhorsts Anteil von über 50 %, der durch die KGaA-Struktur möglich wurde",
        answerC = "Den Beschluss, 50 % der Transfereinnahmen für die Infrastruktur zu verwenden",
        answerD = "Die Mitgliederabstimmung mit 50,1 % Ja-Stimmen zur Investoren-Struktur",
        correctAnswer = 1,
        explanation = "Die 50+1-Regel im deutschen Fußball soll sicherstellen, dass Mitglieder die Mehrheitskontrolle behalten. Weil Hertha eine KGaA ist und Windhorst über 50 % hielt, entstand eine Debatte, ob der Geist dieser Regel verletzt wurde.",
        difficulty = 3,
        funFact = "Die DFL prüfte den Windhorst-Deal auf seine Vereinbarkeit mit der 50+1-Regel und kam letztlich zu dem Schluss, dass die KGaA-Struktur formal regelkonform sei — was viele Kritiker empörte."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher ehemalige Hertha-Spieler und Torschützenkönig wurde von 2009 bis 2021 Geschäftsführer des Vereins?",
        answerA = "Dieter Hoeneß",
        answerB = "Arne Friedrich",
        answerC = "Fredi Bobic",
        answerD = "Michael Preetz",
        correctAnswer = 3,
        explanation = "Michael Preetz war nicht nur als Spieler eine Legende bei Hertha BSC, sondern auch als Geschäftsführer tätig. Er leitete die Vereinsgeschäfte von 2009 bis 2021 und prägte damit eine ganze Ära.",
        difficulty = 3,
        funFact = "Preetz blieb seinem Verein als Funktionär treu — obwohl seine Amtszeit von sportlichen Aufs und Abs geprägt war, genießt er bei den Fans bis heute hohes Ansehen."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Berliner Stadion bestreitet Hertha BSC seit 1963 seine Heimspiele?",
        answerA = "Jahn-Sportpark",
        answerB = "Friedrich-Ludwig-Jahn-Stadion",
        answerC = "Olympiastadion Berlin",
        answerD = "Estádio das Nações",
        correctAnswer = 2,
        explanation = "Hertha BSC trägt seit der Bundesliga-Gründung 1963 seine Heimspiele im Berliner Olympiastadion aus. Das Stadion fasst rund 74.667 Zuschauer.",
        difficulty = 3,
        funFact = "Hertha BSC diskutiert seit Jahren über den Bau eines eigenen, kleineren Stadions — bislang ist das Olympiastadion aber weiterhin die Heimstätte, was aufgrund der hohen Kapazität manchmal für beschämend leere Ränge sorgt."
    ),

    Question(
        categoryId = 13,
        questionText = "Wie viele Zuschauer fasst das Berliner Olympiastadion bei Bundesliga-Spielen von Hertha BSC?",
        answerA = "54.000",
        answerB = "64.500",
        answerC = "74.667",
        answerD = "82.000",
        correctAnswer = 2,
        explanation = "Das Berliner Olympiastadion fasst bei Bundesliga-Spielen rund 74.667 Zuschauer. Es ist damit eines der größten Fußballstadien Deutschlands.",
        difficulty = 3,
        funFact = "Die große Kapazität ist für Hertha ein zweischneidiges Schwert: Bei Topspiel werden die Massen gelockt, aber bei Normalpartien wirkt das Stadion oft gefährlich leer."
    ),

    Question(
        categoryId = 13,
        questionText = "Welche Vereinsfarben trägt Hertha BSC?",
        answerA = "Blau-Weiß",
        answerB = "Blau-Gold",
        answerC = "Schwarz-Blau",
        answerD = "Weiß-Blau",
        correctAnswer = 1,
        explanation = "Hertha BSC trägt traditionell Blau und Weiß als Vereinsfarben. Das Trikot ist blau-weiß gestreift, ergänzt durch goldene Details beim Vereinswappen.",
        difficulty = 3,
        funFact = "Die Vereinsfarben Blau-Weiß gehen auf die Gründungszeit im Jahr 1892 zurück — laut Vereinslegende wurden die Farben nach dem Dampfschiff 'Hertha' benannt, das die Gründer auf einer Ausflugstour sahen."
    ),

    Question(
        categoryId = 13,
        questionText = "Welcher Hertha-Spieler wurde in den Saisons 2019/20 und 2020/21 regelmäßig in die deutsche Nationalmannschaft berufen und hat seinen Abgang 2023 besonders schmerzhaft gemacht?",
        answerA = "Maximilian Mittelstädt",
        answerB = "Niklas Stark",
        answerC = "Jordan Torunarigha",
        answerD = "Marvin Plattenhardt",
        correctAnswer = 0,
        explanation = "Maximilian Mittelstädt spielte für Hertha BSC und wurde in dieser Zeit auch in der deutschen Nationalmannschaft berücksichtigt. Er verließ den Verein nach dem Abstieg 2023.",
        difficulty = 3,
        funFact = "Mittelstädt war einer der wenigen wirklich entwicklungsfähigen Eigengewächse in der Windhorst-Ära — sein Abgang symbolisierte den Exodus junger Talente nach dem Abstieg."
    ),

    Question(
        categoryId = 13,
        questionText = "In welchem Jahr und in welchem Berliner Bezirk wurde Hertha BSC gegründet?",
        answerA = "1885 in Charlottenburg",
        answerB = "1888 in Mitte",
        answerC = "1900 in Schöneberg",
        answerD = "1892 in Gesundbrunnen",
        correctAnswer = 3,
        explanation = "Hertha BSC wurde am 25. Juli 1892 in Berlin-Gesundbrunnen gegründet. Der Verein ist damit einer der ältesten Fußballklubs Deutschlands.",
        difficulty = 3,
        funFact = "Der volle Name lautet 'Hertha Berliner Sport-Club von 1892 e.V.' — der Name 'Hertha' soll nach einem Dampfschiff benannt sein, das die Vereinsgründer auf einer Ausflugstour auf der Havel sahen."
    )

)
