package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsMaster4(): List<Question> = listOf(

    // --- Carlsbad Decrees (1819) ---

    Question(
        categoryId = 3,
        questionText = "Welcher konkrete Anlass im März 1819 trieb Metternich dazu, die Karlsbader Beschlüsse einzuberufen?",
        answerA = "Die Ermordung August von Kotzebues durch den Studenten Karl Ludwig Sand",
        answerB = "Das Hambacher Fest und die Forderungen nach einer Verfassung",
        answerC = "Der Wartburgbrand und die Bücherverbrennung der Burschenschaft",
        answerD = "Der Frankfurter Wachensturm liberaler Studenten",
        correctAnswer = 0,
        explanation = "Karl Ludwig Sand, Mitglied der Burschenschaft, ermordete am 23. März 1819 den Schriftsteller August von Kotzebue, den er als russischen Spion und Reaktionär betrachtete. Metternich nutzte dieses Ereignis umgehend als Vorwand, um beim Karlsbader Treffen (August 1819) repressive Maßnahmen für den Deutschen Bund durchzusetzen.",
        difficulty = 5,
        funFact = "Sand wurde am 20. Mai 1820 in Mannheim öffentlich hingerichtet — und avancierte dabei paradoxerweise zum Märtyrer der Burschenschaftsbewegung. Zuschauer tauchten angeblich Taschentücher in sein Blut."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische institutionelle Maßnahme der Karlsbader Beschlüsse richtete eine permanente Überwachungsinstanz für den Deutschen Bund ein?",
        answerA = "Die Mainzer Zentraluntersuchungskommission",
        answerB = "Das Bundespresseamt in Frankfurt",
        answerC = "Der Geheime Überwachungsausschuss des Bundestages",
        answerD = "Die Wiener Polizeibehörde für Länderüberwachung",
        correctAnswer = 0,
        explanation = "Die Karlsbader Beschlüsse schufen die Mainzer Zentraluntersuchungskommission als supranationale Ermittlungsbehörde des Deutschen Bundes. Sie sollte revolutionäre Umtriebe, insbesondere in Burschenschaften und politischen Vereinen, aufspüren und untersuchte bis 1828 Hunderte von Verdächtigen.",
        difficulty = 5,
        funFact = "Die Kommission sammelte so viel Material, dass ihre Akten mehrere Dutzend Bände füllten — die meisten der Verfolgten waren jedoch harmlose Studenten, deren größtes Vergehen das Singen patriotischer Lieder war."
    ),

    // --- Zollverein ---

    Question(
        categoryId = 3,
        questionText = "Welcher preußische Zollgesetzgebungsakt von 1818 legte die administrative Grundlage für den späteren Deutschen Zollverein?",
        answerA = "Das preußische Zollgesetz vom 26. Mai 1818",
        answerB = "Der Berliner Handelsvertrag von 1817",
        answerC = "Das Rheinische Mautgesetz von 1816",
        answerD = "Die Frankfurter Zollartikel von 1820",
        correctAnswer = 0,
        explanation = "Das preußische Zollgesetz vom 26. Mai 1818 schaffte alle Binnenzölle innerhalb Preußens ab und schuf ein einheitliches Außenzollsystem. Diese Gesetzgebung, maßgeblich vom Finanzminister Karl Georg von Maassen entwickelt, wurde zum Vorbild und Kern des 1834 gegründeten Deutschen Zollvereins.",
        difficulty = 5,
        funFact = "Vor dem Zollgesetz von 1818 gab es in Preußen über 60 verschiedene Binnenzolltarife — ein Kaufmann, der Waren von Königsberg nach Köln transportierte, musste an zahllosen Mautstellen Halt machen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches wichtige mitteleuropäische Zollbündnis schloss sich dem Deutschen Zollverein bewusst NICHT an und bevorzugte stattdessen ein eigenes Gegenbündnis?",
        answerA = "Der Mitteldeutsche Handelsverein unter Führung Hannovers",
        answerB = "Der Süddeutsche Zollverband unter Führung Bayerns",
        answerC = "Der Norddeutsche Lloyd-Verein",
        answerD = "Das Österreichische Zollkartell von 1833",
        correctAnswer = 0,
        explanation = "Der Mitteldeutsche Handelsverein (1828), dem Hannover, Kurhessen, Sachsen und andere Staaten angehörten, lehnte den preußisch dominierten Zollverein ab und versuchte, eine eigene Zollunion zu bilden. Das Bündnis scheiterte jedoch wirtschaftlich bis 1834, woraufhin die meisten Mitglieder dem Deutschen Zollverein beitraten.",
        difficulty = 5,
        funFact = "Österreich versuchte mehrfach — zuletzt 1849/50 — dem Zollverein beizutreten oder ihn zu spalten, scheiterte aber stets am Widerstand Preußens, das die wirtschaftliche Führungsrolle nicht aufgeben wollte."
    ),

    // --- Schleswig-Holstein-Frage ---

    Question(
        categoryId = 3,
        questionText = "Was besagte das Londoner Protokoll von 1852 bezüglich der Thronfolge in Schleswig-Holstein und welches Kernproblem ließ es ungelöst?",
        answerA = "Es sicherte die Integrität des dänischen Gesamtstaats und legte Prinz Christian von Glücksburg als Nachfolger fest, ließ aber die Frage der Verfassungsgemeinschaft der Herzogtümer ungeklärt",
        answerB = "Es gab Schleswig dauerhaft an Dänemark, Holstein aber an den Deutschen Bund",
        answerC = "Es teilte die Herzogtümer entlang der Königsau-Linie auf",
        answerD = "Es schuf ein unabhängiges Herzogtum Schleswig-Holstein unter augustenburgischer Herrschaft",
        correctAnswer = 0,
        explanation = "Das Londoner Protokoll von 1852 anerkannte die Unversehrtheit der dänischen Monarchie und bestimmte Prinz Christian von Glücksburg (später Christian IX.) als Nachfolger. Es klärte jedoch nicht, ob Schleswig Teil des dänischen Gesamtstaats werden oder seine Sonderverbindung zu Holstein behalten sollte — der Streit um die Novemberverfassung von 1863 entzündete sich genau an dieser Lücke.",
        difficulty = 5,
        funFact = "Lord Palmerston soll über die Schleswig-Holstein-Frage gesagt haben, nur drei Menschen hätten sie je wirklich verstanden: Prinz Albert (gestorben), ein deutscher Professor (verrückt geworden), und er selbst — und er habe sie vergessen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Rechtsformel beschrieb das traditionelle Verhältnis Schleswigs und Holsteins zueinander, das Bismarck 1864–1866 gezielt zur Destabilisierung nutzte?",
        answerA = "\"Up ewig ungedeelt\" (auf ewig ungeteilt)",
        answerB = "\"Indivisibiliter ac inseparabiliter\" (unteilbar und untrennbar)",
        answerC = "\"Personalunion unter dänischer Krone\"",
        answerD = "\"Autonomie unter Bundesgarantie\"",
        correctAnswer = 0,
        explanation = "Die niederdeutsche Formel \"Up ewig ungedeelt\" (auf ewig ungeteilt) stammte aus dem Ripen-Vertrag von 1460 und besagte, dass Schleswig und Holstein niemals voneinander getrennt werden dürften. Bismarck nutzte dieses Argument 1866 als Vorwand, um Österreich aus der gemeinsamen Verwaltung Schleswig-Holsteins zu verdrängen — da Österreich Holstein allein verwaltet hatte, sei die Einheit der Herzogtümer verletzt worden.",
        difficulty = 5,
        funFact = "Der Ripen-Vertrag von 1460, aus dem diese Formel stammt, wurde von König Christian I. von Dänemark unterzeichnet — eine historische Ironie, denn er wurde von dänischer Seite als Basis für die Integration, von deutscher Seite als Garantie der Eigenständigkeit interpretiert."
    ),

    // --- Emser Depesche ---

    Question(
        categoryId = 3,
        questionText = "Welche konkrete Forderung König Wilhelms I. verweigerte die französische Regierung in der Emser-Depesche-Krise, was als eigentlicher Kriegsgrund galt?",
        answerA = "Frankreich forderte eine schriftliche Garantie Wilhelms I., dass die Hohenzollernkandidatur niemals erneuert werden würde",
        answerB = "Frankreich verlangte die Abtretung der Rheinpfalz als Kompensation",
        answerC = "Frankreich bestand auf einem persönlichen Entschuldigungsschreiben des Königs an Napoleon III.",
        answerD = "Frankreich forderte die Neutralisierung Luxemburgs und Belgiens",
        correctAnswer = 0,
        explanation = "Nachdem Prinz Leopold von Hohenzollern-Sigmaringen seine Kandidatur für den spanischen Thron zurückgezogen hatte, forderte der französische Botschafter Benedetti in Bad Ems von Wilhelm I. eine bindende Erklärung, dass die Hohenzollernkandidatur für alle Zukunft ausgeschlossen sei. Wilhelm verweigerte diese demütigende Garantie höflich. Bismarck redigierte die Depesche über diesen Vorfall so, dass sie wie eine gegenseitige Beleidigung wirkte, und veröffentlichte sie — was Frankreich zur Kriegserklärung trieb.",
        difficulty = 5,
        funFact = "Bismarck selbst beschrieb seine Bearbeitung der Depesche mit dem Bild eines roten Tuchs vor einem gallischen Stier: Er habe nicht den Inhalt gefälscht, sondern nur Formulierungen gestrichen, die den Text abschwächten — die Wirkung war dieselbe wie eine Kriegserklärung."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der französische Außenminister, der die Emser Depesche als casus belli akzeptierte und den Ministerrat zur Kriegserklärung drängte?",
        answerA = "Émile Ollivier",
        answerB = "Antoine Agénor de Gramont",
        answerC = "Adolphe Thiers",
        answerD = "Léon Gambetta",
        correctAnswer = 1,
        explanation = "Antoine Agénor, duc de Gramont, war der französische Außenminister, der die Emser Depesche als unerträgliche Demütigung interpretierte und im Ministerrat für die Kriegserklärung warb. Er hatte bereits zuvor durch übermäßige Forderungen an Preußen die Krise verschärft. Premierminister Émile Ollivier erklärte bei der Kriegsabstimmung, Frankreich nehme den Krieg 'leichten Herzens' an — ein Satz, der ihn historisch kompromittierte.",
        difficulty = 5,
        funFact = "Gramont war sich so sicher, Preußen werde in einem Krieg scheitern, dass er sich über die Stärke der preußischen Armee kaum informiert hatte. Frankreich besaß noch keine Generalstabsplanung, die der preußischen vergleichbar gewesen wäre."
    ),

    // --- Kulturkampf / Falk-Gesetze ---

    Question(
        categoryId = 3,
        questionText = "Welches der Falk'schen Maigesetze von 1873 regelte die staatliche Kontrolle über die Ausbildung und Anstellung von Geistlichen?",
        answerA = "Das Gesetz über die Vorbildung und Anstellung der Geistlichen",
        answerB = "Das Klostergesetz zur Auflösung religiöser Orden",
        answerC = "Das Zivilstandsgesetz zur Einführung der obligatorischen Zivilehe",
        answerD = "Das Expatriierungsgesetz gegen unbotmäßige Bischöfe",
        correctAnswer = 0,
        explanation = "Das Gesetz über die Vorbildung und Anstellung der Geistlichen (11. Mai 1873), eines der Kern-Maigesetze, schrieb vor, dass Priester das Abitur absolviert, drei Jahre an einer deutschen Universität studiert und eine staatliche Prüfung abgelegt haben mussten, bevor sie in preußischen Gemeinden wirken durften. Bischöfe mussten Ernennungen dem Staat melden.",
        difficulty = 5,
        funFact = "Papst Pius IX. erklärte die Maigesetze für nichtig und verbot katholischen Priestern, sich ihnen zu fügen — was zu massenhafter Verhaftung von Geistlichen und Vakanz Hunderter von Pfarreien in Preußen führte. Bis 1876 waren viele preußische Bistümer faktisch ohne Bischöfe."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Reichsgesetz des Kulturkampfes verbot 1872 den Jesuiten jede Tätigkeit im Deutschen Reich?",
        answerA = "Das Jesuitengesetz vom 4. Juli 1872",
        answerB = "Das Ordensverbotsgesetz vom März 1873",
        answerC = "Das Kongregationsgesetz von 1874",
        answerD = "Das Klostergesetz vom 31. Mai 1875",
        correctAnswer = 0,
        explanation = "Das Jesuitengesetz vom 4. Juli 1872 verbot den Jesuiten jede Niederlassung und Tätigkeit im Deutschen Reich und ermächtigte die Regierung, einzelne Mitglieder des Ordens auszuweisen. Es war das erste Reichsgesetz des Kulturkampfes und richtete sich gegen die als ultramontane Vorhut des Papsttums betrachtete Gesellschaft Jesu.",
        difficulty = 5,
        funFact = "Das Jesuitengesetz blieb — trotz des faktischen Endes des Kulturkampfes in den 1880er Jahren — bis 1917 in Kraft. Erst der Erste Weltkrieg führte zu seiner Aufhebung, da der Reichstag jesuitischen Seelsorgern den Dienst an der Front ermöglichen wollte."
    ),

    // --- Tirpitz-Memoranden ---

    Question(
        categoryId = 3,
        questionText = "Welches strategische Konzept legte Tirpitz in seinem Dienstmemorandum IX von 1894 erstmals systematisch dar?",
        answerA = "Die Risikotheorie: Eine Flotte mittlerer Stärke, die für England ein zu großes Risiko darstellt, auch wenn es siegen würde",
        answerB = "Die Überlegenheitstheorie: Deutschland müsse die britische Flotte zahlenmäßig übertreffen",
        answerC = "Die Küstenschutzstrategie: Schlachtschiffe zur Verteidigung der deutschen Nordseeküste",
        answerD = "Die Mahantistische Theorie: Kontrolle der Welthandelswege durch Kreuzer",
        correctAnswer = 0,
        explanation = "Tirpitz entwickelte in seinem Memorandum IX (1894) die Risikotheorie (Risikogedanke): Deutschland brauche keine britische Flotte zu übertreffen, sondern nur eine stark genug, dass England im Falle eines Krieges so schwere Verluste riskieren müsste, dass andere Mächte (Frankreich, Russland) eine geschwächte britische Flotte ausnützen könnten. Dadurch sollte England von einem Präventivschlag abgehalten werden.",
        difficulty = 5,
        funFact = "Tirpitz erkannte selbst das fundamentale Dilemma seiner Theorie: In der Aufbauphase — bevor die deutsche Flotte stark genug war — war Deutschland am verwundbarsten. Diese 'Gefahrenzone' zwischen 1900 und 1910 beschäftigte ihn intensiv und führte zu diplomatischen Bemühungen, England durch Verträge zu binden."
    ),

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr und mit welchem zentralen Inhalt wurde das erste Flottengesetz verabschiedet, das Tirpitz' Bauprogramm rechtlich verankerte?",
        answerA = "1898 — Plan zum Bau von 19 Linienschiffen in sieben Jahren",
        answerB = "1900 — Verdoppelung der Flotte auf 38 Linienschiffe",
        answerC = "1895 — Bau der ersten Hochseeflotte mit 12 Schiffen",
        answerD = "1902 — Einführung des Dreadnought-Programms",
        correctAnswer = 0,
        explanation = "Das erste Flottengesetz von 1898 sah den Bau von 19 Linienschiffen, acht Küstenpanzerschiffen sowie Kreuzern und Torpedobooten vor — alles innerhalb von sieben Jahren. Es war bewusst bescheiden gehalten, um den Reichstag nicht zu erschrecken. Das zweite Flottengesetz von 1900 verdoppelte dann das Programm auf 38 Schlachtschiffe.",
        difficulty = 5,
        funFact = "Tirpitz war ein Meister der Öffentlichkeitsarbeit: Er gründete das Nachrichtenbüro des Reichsmarineamts, das systematisch Pressekampagnen für die Flotte organisierte und den Flottenverein (gegr. 1898) mit einer Millionenmitgliedschaft als Lobby aufbaute."
    ),

    // --- Daily Telegraph Affair ---

    Question(
        categoryId = 3,
        questionText = "In welcher Ausgabe des Daily Telegraph erschien das Interview mit Kaiser Wilhelm II., das die Daily-Telegraph-Affäre auslöste?",
        answerA = "28. Oktober 1908",
        answerB = "15. Juli 1908",
        answerC = "3. November 1908",
        answerD = "12. September 1907",
        correctAnswer = 0,
        explanation = "Das Interview erschien am 28. Oktober 1908 im Daily Telegraph unter dem Titel 'The German Emperor and England'. Darin äußerte Wilhelm II. unter anderem, die Deutschen seien anglophob, er selbst aber sei Englands Freund, habe England im Burenkrieg strategische Ratschläge gegeben und seine Pläne würden später in Windsor-Castle als korrekt bestätigt werden.",
        difficulty = 5,
        funFact = "Der Artikel war zuvor vom Adjutanten des Kaisers, Eduard von Liebert, und dann von Reichskanzler Bülow zur Zensur vorgelegt worden — doch Bülow las ihn kaum und gab ihn weiter, ohne ihn wirklich zu prüfen. Diese Nachlässigkeit kostete ihn 1909 schließlich das Amt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche der Aussagen Wilhelms II. im Daily-Telegraph-Interview beleidigte Japan am meisten und führte zu diplomatischen Protesten?",
        answerA = "Der Kaiser behauptete, sein Flottenplan sei auf Wunsch Englands entwickelt worden, um Japan in Schach zu halten",
        answerB = "Er bezeichnete Japan als 'gelbe Gefahr' für die europäische Zivilisation",
        answerC = "Er behauptete, Japan plane heimlich einen Angriff auf Indien",
        answerD = "Er beschrieb die japanische Flottenpolitik als Bedrohung für den Weltfrieden",
        correctAnswer = 0,
        explanation = "Wilhelm II. behauptete im Interview, er habe England während des Burenkriegs eine Strategie übermittelt, die später von Lord Roberts tatsächlich angewendet wurde — und ergänzte, der Aufbau der deutschen Flotte diene auch dazu, Europa gegen den wachsenden japanischen Einfluss zu schützen. Diese Aussage über Japans Bedrohungspotenzial rief in Tokio erhebliche Verstimmung hervor.",
        difficulty = 5,
        funFact = "Die Affäre schwächte Bülow und den Kaiser so stark, dass Wilhelm II. fortan deutlich vorsichtiger öffentlich auftrat — einige Historiker sehen die Daily-Telegraph-Affäre als Wendepunkt, an dem Deutschlands Außenpolitik noch stärker in die Hände der Militärs überging."
    ),

    // --- Herero-Genozid ---

    Question(
        categoryId = 3,
        questionText = "Welcher deutsche Militärbefehl vom 2. Oktober 1904 gilt als explizites schriftliches Beleg für einen Vernichtungsbefehl im Herero-Aufstand?",
        answerA = "Der Vernichtungsbefehl General Lothar von Trothas",
        answerB = "Der Strafexpeditionsbefehl des Gouverneurs Leutwein",
        answerC = "Die Proklamation des Kaisers Wilhelm II. zur Aufstandsniederlegung",
        answerD = "Der Schirmbaumsbefehl des Generals von Schlieffen",
        correctAnswer = 0,
        explanation = "General Lothar von Trothas Proklamation vom 2. Oktober 1904 ('Waterberg-Proklamation') ordnete an, dass jeder bewaffnete oder unbewaffnete Herero, der auf deutschem Boden angetroffen werde, erschossen werde. Frauen und Kinder sollten in die Wüste getrieben werden. Dieser schriftliche Befehl gilt als eines der frühesten dokumentierten Genozid-Dokumente der modernen Geschichte.",
        difficulty = 5,
        funFact = "Reichskanzler Bülow widerrief Trothas Vernichtungsbefehl im Dezember 1904 auf Druck von Missionen und dem Reichstag — doch zu diesem Zeitpunkt war das Gros der Herero bereits tot oder in der Omaheke-Wüste umgekommen. Die Wasserlöcher waren systematisch vergiftet oder bewacht worden."
    ),

    Question(
        categoryId = 3,
        questionText = "In welchem Konzentrationslager wurde die höchste Sterblichkeit unter gefangenen Herero und Nama verzeichnet und was war die Todesursache?",
        answerA = "Shark Island (Lüderitzbucht) — Erschöpfung, Kälte und Hunger durch erzwungene Arbeit unter extremen Bedingungen",
        answerB = "Swakopmund — Erschießungen und medizinische Experimente",
        answerC = "Karibib — Typhus-Epidemien in überfüllten Baracken",
        answerD = "Windhoek — Hinrichtungen nach Schnellverfahren",
        correctAnswer = 0,
        explanation = "Shark Island (Haifischinsel) vor Lüderitzbucht war das berüchtigtste der deutschen Konzentrationslager in Südwestafrika. Die Insassen — hauptsächlich Nama — waren Wind, Kälte und Hunger ausgesetzt, mussten Zwangsarbeit leisten und hatten eine geschätzte Sterblichkeitsrate von über 75 Prozent. Dort arbeitete auch Dr. Eugen Fischer, der Schädelstudien an Gefangenen und Leichen durchführte.",
        difficulty = 5,
        funFact = "Eugen Fischers Rassenforschungen aus Südwestafrika flossen in sein Werk 'Die Rehobother Bastards' (1913) ein, das später von den Nationalsozialisten rezipiert wurde — Fischer selbst wurde 1927 Direktor des Kaiser-Wilhelm-Instituts für Anthropologie."
    ),

    // --- Boxeraufstand ---

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis unmittelbar vor Wilhelms II. 'Hunnenrede' trieb die internationale Intervention im Boxeraufstand voran?",
        answerA = "Die Ermordung des deutschen Gesandten Klemens von Ketteler in Peking am 20. Juni 1900",
        answerB = "Die Belagerung der Gesandtschaftsviertel ab dem 20. Mai 1900",
        answerC = "Die Eroberung der Taku-Forts durch internationale Truppen",
        answerD = "Die Kriegserklärung der Qing-Regierung an die Kolonialmächte",
        correctAnswer = 0,
        explanation = "Gesandter Klemens von Ketteler wurde am 20. Juni 1900 auf dem Weg zum Tsungli Yamen von einem kaiserlichen Soldaten erschossen — er war der einzige ausländische Gesandte, der bei dem Aufstand getötet wurde. Sein Tod gab Wilhelm II. den emotionalen Aufhänger für die 'Hunnenrede' (27. Juli 1900), in der er die abfahrenden deutschen Truppen aufforderte, keine Gefangenen zu machen.",
        difficulty = 5,
        funFact = "Die 'Hunnenrede' wurde zwar aus offiziellen deutschen Presseberichten zensiert, aber von ausländischen Journalisten vollständig dokumentiert und verbreitet. Der Begriff 'Hunnen' für Deutsche blieb während des gesamten Ersten Weltkriegs in der alliierten Propaganda lebendig."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche territorialen und finanziellen Konditionen enthielt das Boxerprotokoll vom 7. September 1901?",
        answerA = "450 Millionen Tael Entschädigung, das Recht auf dauernde Besatzung des Gesandtschaftsviertels, Abbruch der Dagu-Befestigungen und Verbot der Waffeneinfuhr",
        answerB = "200 Millionen Tael, Abtretung der Mandschurei an Russland, Öffnung aller chinesischen Häfen",
        answerC = "100 Millionen Tael, Übergabe der Provinz Zhili und Hinrichtung von 500 Boxerführern",
        answerD = "650 Millionen Tael, dauernde internationale Kontrolle des Zollwesens und Besetzung Tianjins",
        correctAnswer = 0,
        explanation = "Das Boxerprotokoll verpflichtete China zur Zahlung von 450 Millionen Tael (ca. 333 Millionen US-Dollar) in 39 Jahren, gestattete den Mächten dauernde Truppenpräsenz im Gesandtschaftsviertel Pekings, verbot die Einfuhr von Waffen auf zwei Jahre und zwang China, die Taku-Forts zu schleifen sowie die Verbindung zwischen Peking und der Küste offen zu halten.",
        difficulty = 5,
        funFact = "Die USA gaben ihren Anteil an den Boxerentschädigungen teilweise zurück — mit der Auflage, das Geld für Stipendien chinesischer Studenten in Amerika zu verwenden. Das Tsinghua-Vorgängerinstitut wurde 1911 mit diesen Geldern gegründet."
    ),

    // --- Russisch-Japanischer Krieg ---

    Question(
        categoryId = 3,
        questionText = "Welche operative Entscheidung Admirals Tōgō Heihachirō in der Seeschlacht bei Tsushima gilt als taktisches Meisterstück und wurde in Marineschulen weltweit gelehrt?",
        answerA = "Das 'Crossing the T': Tōgō wendete seine Schlachtlinie quer vor der russischen Flotte, um maximales Feuer auf deren Führungsschiff zu konzentrieren",
        answerB = "Der Nachtangriff mit Torpedobooten, der die russische Flotte überraschte",
        answerC = "Die Blockade der Koreastraße, die Rozhestvensky zur Umkehr zwang",
        answerD = "Die Staffelung der japanischen Schlachtschiffe in Dreier-Gruppen",
        correctAnswer = 0,
        explanation = "In der Seeschlacht bei Tsushima (27.–28. Mai 1905) vollzog Tōgō das berühmte 'Crossing the T': Er wendete seine gesamte Flotte in einem Bogen vor dem Kopf der russischen Schlachtlinie und konnte dann mit allen Kanonen auf Rozhestvensky Führungsschiff schießen, während die Russen nur mit ihren Bug-Geschützen antworten konnten. Die russische Flotte wurde fast vollständig vernichtet.",
        difficulty = 5,
        funFact = "Von 38 russischen Schiffen wurden 21 versenkt, 7 gefangen genommen und 6 neutralisiert — nur 3 Schiffe erreichten Wladiwostok. Für eine Flotte, die 18.000 Seemeilen von der Ostsee gereist war, war es eine katastrophale Niederlage, die Russlands Revolution von 1905 beschleunigte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher geheime Artikel des Portsmouth-Friedensvertrages von 1905 regelte Japans künftige Stellung in Korea?",
        answerA = "Es gab keinen geheimen Artikel — Japan erhielt Korea offiziell als Schutzgebiet im öffentlichen Vertragstext",
        answerB = "Russland erkannte in einem Geheimprotokoll Japans exklusive Interessensphäre in Korea an",
        answerC = "Japan und Russland teilten Korea an der 38. Breitengrad auf",
        answerD = "Ein Geheimprotokoll sicherte Japan alle russischen Einflussrechte in der Mandschurei",
        correctAnswer = 1,
        explanation = "Im Portsmouth-Vertrag (5. September 1905) erkannte Russland in Artikel II ausdrücklich und öffentlich 'die leitenden politischen, militärischen und wirtschaftlichen Interessen Japans in Korea' an und verpflichtete sich, diesen nicht zu widersprechen. Geheime Klauseln gab es nicht — die Überantwortung Koreas an Japan war explizit verankert. 1910 annektierte Japan Korea offiziell.",
        difficulty = 5,
        funFact = "Vermittler Theodore Roosevelt erhielt für den Portsmouth-Frieden den Friedensnobelpreis 1906 — der erste, den ein US-Präsident erhielt. Beide Seiten waren jedoch unzufrieden: Japan wollte Kriegsentschädigungen, Russland wollte keine territorialen Verluste akzeptieren."
    ),

    // --- Jungtürken / CUP ---

    Question(
        categoryId = 3,
        questionText = "Welches Gründungsdatum und welchen Gründungsort hatte das Komitee für Einheit und Fortschritt (CUP), und was unterschied seine Ursprungsstruktur von einer herkömmlichen Partei?",
        answerA = "Gegründet 1889 als geheime Gesellschaft an der Militärmedizinischen Schule Konstantinopel — strukturiert als Geheimbund mit Zellen und Eidesleistung",
        answerB = "Gegründet 1896 in Genf von osmanischen Exilpolitikern als Partei im westeuropäischen Modell",
        answerC = "Gegründet 1902 in Paris von Prinz Sabahaddin als Reformbewegung",
        answerD = "Gegründet 1907 in Saloniki von Offizieren des Dritten Armeekorps",
        correctAnswer = 0,
        explanation = "Das İttihad ve Terakki Cemiyeti wurde 1889 von vier Studenten (darunter İbrahim Temo) an der Militärmedizinischen Schule in Konstantinopel als geheime Gesellschaft nach dem Vorbild der Carbonari und Freimaurerlogen gegründet. Mitglieder schworen Geheimhaltung und operierten in Zellen — Kennzeichen einer revolutionären Untergrundbewegung, nicht einer legalen Partei.",
        difficulty = 5,
        funFact = "Lange Zeit glaubten ausländische Beobachter, die CUP sei eine moderne, westlich orientierte Reformbewegung — erst im Nachhinein wurde klar, dass der nationalistische, zentralistische und militaristische Kern der Organisation von Anfang an dominierte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches konkrete Ereignis des Jahres 1908 zwang Sultan Abdülhamid II., die Verfassung von 1876 wieder in Kraft zu setzen?",
        answerA = "Der Aufstand mazedonischer Einheiten des Dritten Armeekorps in Saloniki unter CUP-Führung",
        answerB = "Ein Generalstreik in Konstantinopel und Izmir",
        answerC = "Die drohende britisch-russische Einmischung nach der Revaler Begegnung",
        answerD = "Ein Putschversuch der jungen Offiziere des Ersten Armeekorps in Konstantinopel",
        correctAnswer = 0,
        explanation = "Im Juli 1908 begannen Offiziere des Dritten Armeekorps in Makedonien — insbesondere um Niyazi Bey und Enver Bey — mit bewaffneten Einheiten in die Berge zu gehen und die Restaurierung der Verfassung zu fordern. Angesichts mangelnder Loyalität anderer Einheiten und der Bedrohung sah sich Abdülhamid II. gezwungen, die seit 1878 suspendierte Verfassung von 1876 am 24. Juli 1908 wieder einzuführen.",
        difficulty = 5,
        funFact = "Die Bevölkerung Konstantinopels feierte die Wiedereinführung der Verfassung euphorisch — Christen, Muslime und Juden umarmten sich auf den Straßen. Die Euphorie war kurz: Der Gegenputsch vom 13. April 1909 und dann die CUP-Dominanz beendeten das kurze demokratische Aufflackern."
    ),

    // --- Sykes-Picot-Abkommen ---

    Question(
        categoryId = 3,
        questionText = "Welche fünf Zonen definierte das Sykes-Picot-Abkommen vom 16. Mai 1916 und was war der Status der 'Braunen Zone'?",
        answerA = "Rote Zone (direkte britische Kontrolle: Mesopotamien/Basra-Bagdad), Blaue Zone (direktes französisches Mandatsgebiet: Libanon/Küste), Zone A (französischer Einfluss in Syrien), Zone B (britischer Einfluss in Transjordanien/Irak) und Braune Zone (internationale Verwaltung Palästinas)",
        answerB = "Britische Zone (Arabische Halbinsel), Französische Zone (Nordafrika), Russische Zone (Anatolien), Deutsche Zone (neutralisiert), Internationale Zone (Jerusalem)",
        answerC = "Rote Zone (Ägypten), Blaue Zone (Algerien), Grüne Zone (Palästina), Gelbe Zone (Persien), Braune Zone (Mesopotamien)",
        answerD = "Rote Zone (Suezkanal), Blaue Zone (Syrien), Russische Zone (Armenien), Britische Zone (Persischer Golf), Braune Zone (Kurdistan)",
        correctAnswer = 0,
        explanation = "Das Sykes-Picot-Abkommen teilte die arabischen Provinzen des Osmanischen Reichs in: Rote Zone (direkte britische Kontrolle: Basra-Bagdad-Küste), Blaue Zone (direktes französisches Mandatsgebiet: Libanon, Küstensyrien), Zone A (französischer Einfluss im Binnenland Syriens), Zone B (britischer Einfluss in Transjordanien und Nord-Mesopotamien) und Braune Zone (internatiopale Verwaltung Palästinas wegen der Heiligen Stätten).",
        difficulty = 5,
        funFact = "Das Abkommen widersprach direkt den britischen Versprechen an Sharif Hussein von Mekka (Husayn-McMahon-Korrespondenz 1915), dem ein unabhängiger arabischer Staat versprochen worden war — diese Widersprüche vergifteten die britisch-arabischen Beziehungen für Jahrzehnte."
    ),

    Question(
        categoryId = 3,
        questionText = "Durch welchen Vorfall wurde der Inhalt des Sykes-Picot-Abkommens der Öffentlichkeit bekannt?",
        answerA = "Die Bolschewiki veröffentlichten es im November 1917 nach dem Fund in den Archiven des Außenministeriums",
        answerB = "T. E. Lawrence enthüllte es in seiner Memoirenschrift",
        answerC = "Die britische Presse erhielt es durch einen Parlamentsleck",
        answerD = "Die Osmanische Regierung veröffentlichte es als Propagandamittel 1917",
        correctAnswer = 0,
        explanation = "Nach der Oktoberrevolution durchsuchten die Bolschewiki die Geheimarchive des zaristischen Außenministeriums und fanden das Sykes-Picot-Abkommen (Russland war ebenfalls Vertragspartner und sollte Teile Anatoliens und die Meerengen erhalten). Leon Trotzki ließ es im November/Dezember 1917 veröffentlichen, um die imperialistischen Absichten der Westmächte zu entlarven — eine massive Verlegenheit für Großbritannien und Frankreich.",
        difficulty = 5,
        funFact = "Als Sherif Hussein die Veröffentlichung las, fragte er die Briten direkt nach der Wahrheit. Die britische Regierung spielte die Bedeutung des Abkommens herunter und versicherte ihm, es sei durch spätere Absprachen überholt — eine Aussage, die ebenfalls unwahr war."
    ),

    // --- San-Remo-Konferenz ---

    Question(
        categoryId = 3,
        questionText = "Was legte die Konferenz von San Remo (April 1920) bezüglich der Mandatsvergabe im Nahen Osten fest, und welche wirtschaftliche Klausel war besonders umstritten?",
        answerA = "San Remo verteilte die Völkerbundmandate: Frankreich erhielt Syrien und Libanon, Großbritannien Mesopotamien und Palästina — und das San-Remo-Ölabkommen sicherte Großbritannien 75% der Mosul-Ölproduktion",
        answerB = "San Remo teilte die gesamte arabische Welt zwischen Großbritannien und Frankreich auf und schloss die USA von allen Öl-Konzessionen aus",
        answerC = "San Remo bestätigte nur die Waffenstillstandslinien von Mudros und vertagt die Mandatsfrage",
        answerD = "San Remo gab Frankreich das Mandat über Palästina, Großbritannien über Syrien und Amerika über Mesopotamien",
        correctAnswer = 0,
        explanation = "Bei der Konferenz von San Remo (19.–26. April 1920) erhielt Frankreich die Mandate A über Syrien und Libanon, Großbritannien die Mandate A über Mesopotamien (Irak) und Palästina. Das parallele San-Remo-Ölabkommen gewährte Großbritannien 75% und Frankreich 25% der Mosul-Öleinnahmen — was die USA zu heftigen Protesten veranlasste und zu langwierigen Verhandlungen über die Open-Door-Politik führte.",
        difficulty = 5,
        funFact = "Die Balfour-Deklaration von 1917 wurde in San Remo erstmals völkerrechtlich in das britische Palästina-Mandat eingearbeitet — damit wurde die Idee einer jüdischen Heimstätte erstmals vertragsrechtlich verbindlich, was der arabischen Bevölkerung Palästinas jede Mitsprache versagte."
    ),

    // --- Lausanner Vertrag vs. Sèvres ---

    Question(
        categoryId = 3,
        questionText = "Welche territorialen Bestimmungen des Sèvres-Vertrags von 1920 wurden im Lausanner Vertrag von 1923 für die Türkei vollständig revidiert?",
        answerA = "Sèvres sah ein armenisches und ein kurdisches Staatsgebiet vor, eine griechische Zone um Smyrna, die Abtrennung des gesamten europäischen Territoriums außer Konstantinopel und die Internationalisierung der Meerengen — alles in Lausanne revidiert oder gestrichen",
        answerB = "Sèvres gab Zypern an Griechenland und Syrien an die Türkei — in Lausanne getauscht",
        answerC = "Sèvres teilte Anatolien zwischen Frankreich und Italien auf — in Lausanne zurückgegeben",
        answerD = "Sèvres erkannte nur einen Rumpfstaat um Konstantinopel an — Lausanne gab Anatolien zurück",
        correctAnswer = 0,
        explanation = "Der Sèvres-Vertrag (10. August 1920) sah eine armenische Republik (im Nordosten), eine Autonomiezone für Kurden (im Südosten), eine griechische Verwaltungszone um Smyrna für fünf Jahre mit Option auf Anschluss, Abtretung Thrakiens an Griechenland und die vollständige Internationalisierung der Meerengen vor. Kemal Atatürks militärische Siege (1919–1922) erzwangen eine Neuregelung: Der Lausanner Vertrag (24. Juli 1923) strich Armenien, Kurdistan und Smyrna aus dem Vertrag und gab der Türkei ganz Anatolien sowie Ostthrakien zurück.",
        difficulty = 5,
        funFact = "Sèvres war der einzige Pariser Vorortfrieden, der niemals ratifiziert wurde — das Osmanische Parlament war aufgelöst worden und Kemals Nationalregierung in Ankara erkannte ihn nicht an. Lausanne ist bis heute einer der wenigen Friedensverträge des 20. Jahrhunderts, der noch in Kraft ist."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche bahnbrechende Klausel des Lausanner Vertrags von 1923 schuf ein bis dahin beispielloses Instrument des Bevölkerungsaustauschs?",
        answerA = "Der Zwangsaustausch der griechisch-orthodoxen Bevölkerung Anatoliens gegen die muslimische Bevölkerung Griechenlands — insgesamt ca. 1,5 Millionen Menschen",
        answerB = "Der freiwillige Bevölkerungsaustausch zwischen Armenien und der Türkei",
        answerC = "Die Vertreibung der bulgarischen Bevölkerung aus Thrakien im Austausch gegen türkische Muslime",
        answerD = "Die Umsiedlung der griechischen Bevölkerung von Konstantinopel nach Athen",
        correctAnswer = 0,
        explanation = "Die Lausanner Konvention über den Bevölkerungsaustausch (Artikel im Hauptvertrag, detailliert in der Sonderkonvention) schuf den ersten vertraglich festgelegten Zwangsbevölkerungsaustausch der Geschichte: Griechisch-orthodoxe Christen aus Anatolien (ca. 1,2 Millionen, größtenteils bereits als Flüchtlinge) wurden gegen muslimische Bewohner Griechenlands (ca. 400.000) ausgetauscht — ethnische Identität wurde dabei allein durch Religionszugehörigkeit definiert.",
        difficulty = 5,
        funFact = "Griechischsprachige Muslime aus Kreta und Makedonien wurden 'ausgetauscht' gegen türkischsprachige Christen aus Anatolien — das Kriterium war allein die Religionszugehörigkeit. Der Nansen-Plan für diesen Austausch wurde von Fridtjof Nansen entwickelt, der dafür 1922 den Friedensnobelpreis erhielt."
    ),

    // --- Chanak-Krise ---

    Question(
        categoryId = 3,
        questionText = "Was war der unmittelbare militärische Auslöser der Chanak-Krise vom September 1922?",
        answerA = "Türkische Nationalstreitkräfte unter Kemal rückten auf die von britischen Truppen gesicherte neutrale Zone am Dardanelleneingang bei Çanakkale vor, nachdem sie Griechenlands Armee in Anatolien vernichtend geschlagen hatten",
        answerB = "Französische Truppen verließen die neutrale Zone, woraufhin Kemals Armee die britischen Stellungen umzingelte",
        answerC = "Türkische Truppen beschossen britische Schiffe im Dardanellenmeerenge",
        answerD = "Griechenland rief nach der Niederlage Großbritannien zur gemeinsamen Verteidigung Konstantinopels auf",
        correctAnswer = 0,
        explanation = "Nach dem Sieg über die griechische Armee bei Dumlupinar (26.–30. August 1922) und dem Brand von Smyrna (September 1922) marschierten Kemals Streitkräfte auf die neutrale Zone am Dardanelleneingang zu, die britische Truppen unter General Harington besetzt hielten. Die Briten drohten mit Krieg — Dominions wie Kanada und Australien verweigerten jedoch Unterstützung, was die Westminster-Regierung in eine unhaltbare Lage brachte.",
        difficulty = 5,
        funFact = "Die Chanak-Krise stürzte Lloyd Georges Koalitionsregierung: Die Dominions verweigerten Militärhilfe, die Konservativen traten aus der Koalition aus, und Lloyd George verlor beim anschließenden Misstrauensvotum. Er sollte nie wieder regieren — Chanak beendete eine der dominantesten britischen Politikerkarrieren der Ära."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Klausel des Vertrags von Mudanya (Oktober 1922), der die Chanak-Krise beendete, gab Ostthrakien wieder an die Türkei?",
        answerA = "Die türkischen Truppen besetzten sofort Ostthrakien, griechische Truppen zogen sich innerhalb von 15 Tagen zurück und eine alliierte Gendarmerie verwaltete die Zone bis zum Lausanner Vertrag",
        answerB = "Griechenland behielt Ostthrakien, die Türkei erhielt nur die europäische Grenze am Maritza-Fluss",
        answerC = "Ostthrakien wurde für drei Jahre von einem Völkerbundkomitee verwaltet",
        answerD = "Großbritannien behielt die Meerengenzone, während Frankreich Ostthrakien übernahm",
        correctAnswer = 0,
        explanation = "Der Waffenstillstand von Mudanya (11. Oktober 1922) legte fest: Griechische Truppen räumen Ostthrakien innerhalb von 15 Tagen, alliierte Truppen übernehmen vorübergehend die Verwaltung, und türkische Gendarmerie nimmt schrittweise Kontrolle auf. Die endgültige Übergabe Ostthrakiens an die Türkei wurde im Lausanner Vertrag (1923) bestätigt, der die griechisch-türkische Grenze am Fluss Maritza festlegte.",
        difficulty = 5,
        funFact = "General Harington, der britische Kommandeur in Çanakkale, zögerte die Weiterleitung eines Londoner Ultimatums an Kemal bewusst hinaus — er wollte keinen Krieg und vermutete, dass direkte Verhandlungen die Krise lösen könnten. Seine eigenmächtige Diplomatie erwies sich als erfolgreich."
    ),

    // --- Weitere tiefe 19./20. Jahrhundert-Themen ---

    Question(
        categoryId = 3,
        questionText = "Welches waren die drei wichtigsten Bestimmungen des Deutsch-Österreichischen Zollvereinigungsplans von 1931 und warum scheiterte er?",
        answerA = "Gemeinsamer Außenzoll, gegenseitige Meistbegünstigung und Abbau aller Binnenzölle — gescheitert am Veto des Haager Internationalen Gerichtshofs wegen Verstoß gegen den Genfer Protokoll-Verbot des Anschlusses",
        answerB = "Gemeinsame Währung, gemeinsamer Zoll und gemeinsame Außenhandelspolitik — gescheitert am Widerstand der Tschechoslowakei",
        answerC = "Freihandelszone, gemeinsame Agrarpolitik und Abbau der Grenzkontrollen — gescheitert am britischen Veto",
        answerD = "Douanunion, gemeinsamer Markt und Übernahme deutschen Handelsrechts — gescheitert durch die Weltwirtschaftskrise",
        correctAnswer = 0,
        explanation = "Das deutsch-österreichische Zollunionsprojekt von März 1931 (Curtius-Schober-Plan) sah einen gemeinsamen Außenzoll und gegenseitige Handelsfreiheit vor. Es scheiterte, weil Frankreich und andere Mächte es als verdeckten Anschluss betrachteten, der das Genfer Protokoll von 1922 verletzte (das Österreich im Gegenzug für Kredite zur wirtschaftlichen Unabhängigkeit verpflichtete). Der Ständige Internationale Gerichtshof entschied im September 1931 mit knapper Mehrheit dagegen.",
        difficulty = 5,
        funFact = "Das Scheitern des Zollunionsprojekts und die darauffolgende Bankenkrise (Zusammenbruch der Creditanstalt im Mai 1931) gelten als Wendepunkte, die die Weltwirtschaftskrise auf Europa übertrugen und die politische Destabilisierung Österreichs einleiteten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches war der Hauptinhalt des Geheimprotokolls zum Rückversicherungsvertrag von 1887 zwischen Deutschland und Russland?",
        answerA = "Deutschland anerkannte Russlands Recht auf Einfluss in Bulgarien und auf das Meerengengebiet — Russland sollte wohlwollende Neutralität erhalten, falls Deutschland von Frankreich angegriffen würde",
        answerB = "Russland verpflichtete sich, im Falle eines österreichischen Angriffs auf Deutschland zu intervenieren",
        answerC = "Deutschland versprach, keine Bündnisverhandlungen mit Österreich gegen Russland zu führen",
        answerD = "Beide Mächte garantierten sich gegenseitig freien Zugang zum Balkan ohne Konsultationspflicht",
        correctAnswer = 0,
        explanation = "Das Geheimprotokoll zum Rückversicherungsvertrag (18. Juni 1887) verpflichtete Deutschland zur 'wohlwollenden Neutralität' falls Österreich Russland angreife (umgekehrt bei französischem Angriff auf Deutschland), und anerkannte explizit Russlands 'vorherrschendes Einflussrecht' in Bulgarien sowie das russische Interesse an der Öffnung der Meerengen — was im Widerspruch zum Zweibund mit Österreich stand.",
        difficulty = 5,
        funFact = "Als Kaiser Wilhelm II. und Caprivi 1890 den Rückversicherungsvertrag nicht verlängerten, wurde dies erst Jahre später bekannt — und Bismarck ließ ihn 1896 demonstrativ im Hamburger Hamburger Hamburger Hamburger veröffentlichen, um die Unfähigkeit der neuen Führung zu demonstrieren. Der Vertrag enthüllte die fundamentale Inkompatibilität von Zweibund und russischem Bündnis."
    ),

    Question(
        categoryId = 3,
        questionText = "Was genau forderte der Alldeutsche Verband im 'September-Programm' von 1914 für den Fall eines deutschen Sieges im Ersten Weltkrieg?",
        answerA = "Annexion Belgiens und des Nordens Frankreichs (Longwy-Briey), Schaffung eines Mitteleuropäischen Wirtschaftsverbandes unter deutscher Führung und eines Mittelafrikanischen Kolonialreichs",
        answerB = "Annexion ganz Frankreichs, der Benelux-Staaten und der Baltischen Provinzen",
        answerC = "Annexion der Pufferstaaten zwischen Deutschland und Russland sowie Kontribution von 40 Milliarden Franc von Frankreich",
        answerD = "Schaffung eines deutschen Kolonialreichs in Afrika und Rückgabe der deutschen Kolonien durch England",
        correctAnswer = 0,
        explanation = "Bethmann Hollwegs September-Programm (9. September 1914, streng geheim) sah vor: Frankreich verliert Erzbecken Briey-Longwy und zahlt Kontribution, wird wirtschaftlich abhängig; Belgien wird Vasallenstaat; Niederlande werden eng angebunden; es entsteht ein 'Mitteleuropa' als Wirtschaftsverband unter deutscher Führung; im Osten wird ein 'Oststreifen' polnischer Pufferstaaten abgetrennt; Afrika-Kolonien werden umverteilt. Der Alldeutsche Verband hatte noch weitreichendere Forderungen.",
        difficulty = 5,
        funFact = "Fritz Fischer enthüllte das September-Programm 1961 in 'Griff nach der Weltmacht' — was einen der heftigsten deutschen Historikerkonflikte des 20. Jahrhunderts auslöste. Die 'Fischer-Kontroverse' stellte die Frage, ob Deutschland 1914 bewusst einen Angriffskrieg geplant hatte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche konkrete taktische Innovation der Brusilov-Offensive von 1916 machte sie zum Vorbild moderner Operationskunst?",
        answerA = "Simultane Angriffe auf breiter Front an mehreren Punkten, um eine Konzentrierung feindlicher Reserven zu verhindern — anstelle des üblichen Einzeldurchbruchs an einem konzentrierten Schwerpunkt",
        answerB = "Erstmaliger Einsatz von Panzern auf dem Ostfront",
        answerC = "Gasangriffe kombiniert mit Infanterie-Stoßtruppen nach dem Vorbild von Ypern",
        answerD = "Koordinierter Einsatz von Artillerie-Walzen und Infanterie-Wellen",
        correctAnswer = 0,
        explanation = "General Brusilovs taktische Innovation (Juni–September 1916) bestand darin, gleichzeitig an vier verschiedenen Frontabschnitten anzugreifen, ohne einen einzigen Hauptstoßpunkt zu bestimmen. Dies zwang die österreichisch-ungarische Heeresleitung, ihre Reserven aufzuteilen und verhinderte eine Konzentration gegen den Hauptangriff. Die Offensive kostete die Mittelmächte über eine Million Verluste und gilt als Wendepunkt an der Ostfront.",
        difficulty = 5,
        funFact = "Brusilov erreichte seinen Erfolg trotz chronischer Munitionsknappheit und fehlender Verstärkungen durch die Stavka. Seine Methode wurde in der Zwischenkriegszeit von deutschen, sowjetischen und anderen Militärtheoretikern studiert und beeinflusste die Konzeption der deutschen Blitzkrieg-Taktik."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher polnische Kryptanalytiker löste 1932 erstmals die Enigma-Verschlüsselung und welche Methode verwendete er?",
        answerA = "Marian Rejewski — er nutzte einen Designfehler im Nachrichtenindikator-Verfahren zusammen mit algebraischen Gruppentheoriemethoden und einem gestohlenen Enigma-Handbuch",
        answerB = "Jerzy Różycki — er analysierte Häufigkeitsmuster in deutschen Wettermeldungen",
        answerC = "Henryk Zygalski — er entwickelte die Zygalski-Blätter durch manuelle Permutationsanalyse",
        answerD = "Jan Kowalski — er baute einen mechanischen Nachbau der Enigma nach technischen Zeichnungen",
        correctAnswer = 0,
        explanation = "Marian Rejewski, Mathematiker beim polnischen Biuro Szyfrów (Chiffrierbüro), rekonstruierte 1932 die interne Verkabelung der Enigma-Rotoren durch eine Kombination: abgefangene Nachrichten mit ihren Tageswert-Dopplungen (ein Verfahren, bei dem die Schlüsselindikatoren zweimal verschlüsselt übertragen wurden), algebraische Gruppentheorie und ein von Hans-Thilo Schmidt verkauftes Enigma-Handbuch (Geheimverräter für Frankreich). Er übergab die Erkenntnisse 1939 an Großbritannien und Frankreich.",
        difficulty = 5,
        funFact = "Rejewskis Arbeit war entscheidend für Bletchley Parks spätere Erfolge — Alan Turing baute auf den polnischen 'Bomba'-Maschinen auf. Polen erhielt für diese kriegsentscheidende Leistung jahrzehntelang keine offizielle Anerkennung, da das britische Ultra-Programm bis 1974 streng geheim blieb."
    ),

    Question(
        categoryId = 3,
        questionText = "Was sah das Morgenthau-Plan-Memorandum von September 1944 für Nachkriegsdeutschland vor und warum wurde es aufgegeben?",
        answerA = "Vollständige Deindustrialisierung Deutschlands in einen Agrarstaat, Internationalisierung des Ruhrgebiets und Aufteilung Deutschlands in Nord- und Süddeutschland — aufgegeben wegen wirtschaftlicher Folgen für Europa und britischer Opposition",
        answerB = "Aufteilung Deutschlands in vier Zonen unter dauernder Besatzung ohne Friedensvertrag",
        answerC = "Annexion aller deutschen Gebiete östlich der Oder durch Polen und die Sowjetunion",
        answerD = "Umwandlung Deutschlands in einen Bundesstaat unter dauerndem UN-Mandat",
        correctAnswer = 0,
        explanation = "US-Finanzminister Henry Morgenthau Jr. forderte im September 1944: Schließung aller Schwerindustrie und Bergwerke, internationale Kontrolle des Ruhrgebiets, Teilung Deutschlands in einen nördlichen und südlichen Agrarstaat und Annexion bestimmter Gebiete durch Frankreich und Polen. Roosevelt und Churchill billigten es zunächst in Quebec (September 1944). Es wurde aufgegeben, als Kriegsminister Stimson und Außenminister Hull darauf hinwiesen, dass ein deindustrialisiertes Deutschland ganz Europa in die Armut treiben würde.",
        difficulty = 5,
        funFact = "Als Details des Morgenthau-Plans durchsickerten, nutzte Goebbels sie für intensive Propaganda — er behauptete, die Alliierten wollten Deutschland vernichten, was den deutschen Widerstandswillen in der Endphase des Krieges tatsächlich kurzzeitig erhöhte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische Klausel des Versailler Vertrags veranlasste Deutschland zur Unterzeichnung und war gleichzeitig die umstrittenste in der Weimarer Republik?",
        answerA = "Artikel 231 ('Kriegsschuldklausel') — er legte Deutschland die alleinige Kriegsverantwortung auf und war die rechtliche Grundlage für alle Reparationsforderungen",
        answerB = "Artikel 160 — er begrenzte die Reichswehr auf 100.000 Mann",
        answerC = "Artikel 45 — er übergab das Saargebiet für 15 Jahre an den Völkerbund",
        answerD = "Artikel 119 — er ließ Deutschland alle Kolonien abtreten",
        correctAnswer = 0,
        explanation = "Artikel 231 des Versailler Vertrags ('Kriegsschuldartikel') erklärte Deutschland (und seine Verbündeten) als allein verantwortlich für alle Verluste und Schäden, die die Alliierten durch den von Deutschland aufgezwungenen Krieg erlitten hatten. Er war die juristische Grundlage für Reparationsforderungen und wurde in Deutschland als moralisch unerträgliche Demütigung empfunden — ein zentrales Instrument nationalistischer Agitation bis 1933.",
        difficulty = 5,
        funFact = "Ironischerweise hatten die amerikanischen Juristen John Foster Dulles (später Außenminister) und Norman Davis Artikel 231 als juristischen Kompromiss formuliert, um Reparationen ohne Benennung einer Gesamtsumme zu ermöglichen — sie hatten nicht erwartet, dass er als moralisches Urteil interpretiert werden würde."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der genaue Inhalt des Hoare-Laval-Plans von 1935 und welche politischen Konsequenzen hatte seine Enthüllung?",
        answerA = "Der geheime Plan sah die Übergabe von zwei Dritteln Äthiopiens an Italien vor — seine Enthüllung durch die Presse führte zum Rücktritt beider Architekten (Hoare und Laval) und zu einer schweren Vertrauenskrise gegenüber dem Völkerbund",
        answerB = "Der Plan sah Sanktionen gegen Italien vor, solange äthiopisches Territorium besetzt blieb",
        answerC = "Der Plan teilte Äthiopien zwischen Italien, England und Frankreich auf",
        answerD = "Der Plan garantierte Äthiopien territoriale Integrität im Austausch für wirtschaftliche Konzessionen an Italien",
        correctAnswer = 0,
        explanation = "Sir Samuel Hoare (brit. Außenminister) und Pierre Laval (franz. Ministerpräsident) vereinbarten im Dezember 1935 heimlich, dass Äthiopien den fruchtbaren Süden und Tigray an Italien abtreten sollte — rund zwei Drittel des Landes. Als die Pariser Zeitung Le Temps den Plan am 9. Dezember 1935 veröffentlichte, brach ein Proteststurm aus. Hoare musste zurücktreten, Laval folgte kurz darauf. Das Ansehen des Völkerbunds als kollektives Sicherheitssystem war dauerhaft beschädigt.",
        difficulty = 5,
        funFact = "Mussolini selbst lehnte den Hoare-Laval-Plan ab — nicht weil er zu wenig war, sondern weil die öffentliche Aufregung darüber ihn politisch untragbar machte. Er wollte Äthiopien ganz, und die diplomatische Farce ermöglichte ihm letztlich, weiter Krieg zu führen ohne ernsthafte Sanktionen fürchten zu müssen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche konkrete Formulierung der Balfour-Deklaration von 1917 enthielt eine eingebaute Beschränkung, die Zionisten und Araber gleichermaßen unzufrieden ließ?",
        answerA = "'Es sei klar verstanden, dass nichts unternommen werden soll, was die bürgerlichen und religiösen Rechte bestehender nicht-jüdischer Gemeinschaften in Palästina... beeinträchtigen könnte'",
        answerB = "'Die Errichtung einer jüdischen Heimstätte in Palästina' — nicht eines jüdischen Staates",
        answerC = "'Vorbehaltlich der Genehmigung durch den Völkerbund und die arabische Bevölkerung'",
        answerD = "'In dem Teil Palästinas westlich des Jordan'",
        correctAnswer = 1,
        explanation = "Die Balfour-Deklaration sprach von einer 'nationalen Heimstätte für das jüdische Volk' (national home) — bewusst nicht von einem Staat — und enthielt zwei einschränkende Klauseln: nichts solle die Rechte der 'bestehenden nicht-jüdischen Gemeinschaften' in Palästina noch die Rechte und den politischen Status von Juden in anderen Ländern beeinträchtigen. Zionisten wollten einen Staat, Araber keine jüdische Einwanderung — beide Seiten empfanden die Deklaration als Betrug.",
        difficulty = 5,
        funFact = "Sykes hatte bewusst auf 'Staat' verzichtet und 'Heimstätte' gewählt, da er befürchtete, dass eine klare Staatsgarantie Frankreich und die arabischen Verbündeten verprellen würde. Der Begriff blieb bis 1948 das Zentrum aller Kontroversen über Palästinas Zukunft."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifische Bedingung enthielt das Zimmermann-Telegramm für Mexiko, falls es als Verbündeter in den Krieg gegen die USA einträte?",
        answerA = "Deutschland versprach Mexiko finanzielle Unterstützung und die Rückgewinnung von Texas, Neu-Mexiko und Arizona",
        answerB = "Deutschland bot Mexiko die Kontrolle über Kuba und Puerto Rico",
        answerC = "Deutschland versprach Mexiko Erdöl-Lieferungen und Waffenhilfe für eine Offensive bis nach Kanada",
        answerD = "Deutschland sicherte Mexiko volle Souveränität über den Panamakanal zu",
        correctAnswer = 0,
        explanation = "Das Zimmermann-Telegramm (17. Januar 1917) instruierte den deutschen Botschafter in Mexiko, der Regierung Carranza ein Bündnis anzubieten: Deutschland finanziert einen mexikanischen Krieg gegen die USA, und Mexiko erhält im Siegesfall Texas, New Mexico und Arizona zurück (verlorene Gebiete aus dem Mexikanisch-Amerikanischen Krieg 1848). Die britische Entschlüsselung und Veröffentlichung des Telegramms war entscheidend für den US-Kriegseintritt im April 1917.",
        difficulty = 5,
        funFact = "Außenstaatssekretär Arthur Zimmermann gestand das Telegramm öffentlich als authentisch an — ein diplomatisches Eigentor. Vermutlich tat er es, weil er glaubte, der US-Kriegseintritt sei ohnehin unvermeidlich und das Telegramm könnte als Beweis für deutsche Bedrohungen nützlich sein."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Kern des Dreikaiserbriefs (Dreikaiservertrag) von 1881 und inwiefern stand er im Widerspruch zum Zweibund?",
        answerA = "Österreich, Russland und Deutschland verpflichteten sich zu wohlwollender Neutralität bei einem Krieg mit einer vierten Macht — das Problem war, dass Österreich-Ungarn und Russland rivalisierende Balkanansprüche hatten, die der Vertrag nicht löste",
        answerB = "Die drei Kaiser verpflichteten sich zur gemeinsamen Unterdrückung sozialistischer Bewegungen in ihren Ländern",
        answerC = "Österreich, Russland und Deutschland teilten den Balkan in klar definierte Einflusszonen auf",
        answerD = "Der Vertrag schuf ein Dreier-Konsulationssystem für alle europäischen Konflikte",
        correctAnswer = 0,
        explanation = "Der Dreikaiserbund (18. Juni 1881) verpflichtete die drei Mächte zur wohlwollenden Neutralität, wenn eine von ihnen mit einer vierten Macht in Krieg geriet, und enthielt Regelungen für den osmanischen Raum. Der fundamentale Widerspruch: Der Zweibund (1879) war ein deutsch-österreichisches Defensivbündnis gegen Russland — der Dreikaiserbund versuchte, diesen Widerspruch zu überbrücken, scheiterte aber 1887 endgültig an der bulgarischen Frage.",
        difficulty = 5,
        funFact = "Bismarck jonglierte gleichzeitig mit dem Zweibund (gegen Russland), dem Dreikaiserbund (mit Russland) und dem Rückversicherungsvertrag (geheim mit Russland) — ein diplomatisches Kunstwerk, das nur er selbst zu steuern in der Lage war und das nach seinem Abgang sofort kollabierte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche militärtechnische Neuerung des Ersten Weltkriegs veranlasste Großbritannien zur Entwicklung des ersten Panzers und wie hieß das Projekt geheimtarnend?",
        answerA = "Die Sackgasse des Stellungskrieges durch MG und Stacheldraht veranlasste England zum 'Landschiff'-Projekt — tarnend 'water carrier' (Wasserbehälter/tank) genannt, woraus die Bezeichnung 'Tank' entstand",
        answerB = "Deutsche Gasbomben trieben die Briten zur Entwicklung gepanzerter Fahrzeuge unter dem Codenamen 'Tortoise'",
        answerC = "Der Durchbruch bei der Somme wurde durch den Codenamen 'Panther' gesichert",
        answerD = "Deutschen U-Boot-Angriffen begegnete Großbritannien mit dem Projekt 'Iron Duck'",
        correctAnswer = 0,
        explanation = "Das britische 'Landships Committee' (1915), initiiert von Winston Churchill als Erster Lord der Admiralität, entwickelte gepanzerte Kettenfahrzeuge, um Stacheldraht, Schützengräben und Maschinengewehrnester zu überwinden. Das Projekt wurde zur Geheimhaltung als Produktion von 'water carriers for Mesopotamia' (Wasserbehälter) bezeichnet — die Arbeiter nannten die Dinger kurz 'tanks'. Der Name blieb.",
        difficulty = 5,
        funFact = "Die ersten Tanks wurden am 15. September 1916 an der Somme eingesetzt — mit gemischtem Erfolg, da viele ausfielen. Haig setzte sie zu früh ein, bevor genug Fahrzeuge für einen konzentrierten Einsatz vorhanden waren, und verschenkte damit den Überraschungseffekt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was genau meinte Bismarck mit dem Begriff 'Saturiertheit' in seiner Außenpolitik und welches konkrete Instrument setzte er ein, um Deutschland als solchen Staat darzustellen?",
        answerA = "Deutschland sei territorial befriedigt und habe keine Expansionsinteressen mehr — Bismarck nutzte den Berliner Kongress 1878 als Instrument des 'ehrlichen Maklers', um Deutschland als friedenserhaltende Macht darzustellen",
        answerB = "Deutschland sei wirtschaftlich satt und brauche keine Kolonien — Bismarck schloss deshalb alle deutschen Kolonialerwerbe aus",
        answerC = "Das Deutsche Reich sei innenpolitisch stabil und brauche keine sozialen Reformen — deshalb die Sozialistengesetze",
        answerD = "Deutschland habe seine Rüstungsziele erreicht — Bismarck stoppte deshalb den Flottenausbau",
        correctAnswer = 0,
        explanation = "Bismarck bezeichnete das Deutsche Reich nach 1871 als 'saturierten' Staat, der keine weiteren territorialen Ambitionen in Europa hege. Der Berliner Kongress von 1878, auf dem er als 'ehrlicher Makler' ohne eigene Interessenansprüche den russisch-osmanischen Konflikt moderierte, war das beste Beispiel: Deutschland gewann politisches Kapital, ohne Territorien zu fordern, und inszenierte sich als Stabilitätsanker Europas.",
        difficulty = 5,
        funFact = "Die Ironie der 'Saturiertheit': Gleichzeitig erwarb Deutschland zwischen 1884 und 1885 (Berliner Konferenz) Kolonien in Afrika und im Pazifik — Bismarck mied europäische Expansion, wollte aber außereuropäische Machtpositionen nicht ganz aufgeben, um innenpolitischen Nationalisten zu genügen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche spezifischen Paragraphen des Bismarck'schen Sozialistengesetzes von 1878 verboten konkret was, und welche Lücke ließ das Gesetz bewusst offen?",
        answerA = "§1 verbot sozialdemokratische, sozialistischen und kommunistischen Organisationen und Versammlungen mit dem Ziel des Umsturzes — gelassen wurden Reichstagsmandate, sodass SPD-Abgeordnete weiter im Parlament sprachen",
        answerB = "Das Gesetz verbot die SPD als Partei vollständig, einschließlich ihrer Reichstagsabgeordneten",
        answerC = "Nur außerhalb Deutschlands erscheinende sozialistische Zeitungen waren verboten, inländische Publikationen wurden toleriert",
        answerD = "Das Gesetz galt nur in Preußen und Bayern, nicht im gesamten Deutschen Reich",
        correctAnswer = 0,
        explanation = "Das Gesetz gegen die gemeingefährlichen Bestrebungen der Sozialdemokratie (21. Oktober 1878) verbot Vereine, Versammlungen und Schriften, die auf den Umsturz der staatlichen Ordnung abzielten — SPD-Ortsvereine, Gewerkschaften und sozialistische Zeitungen wurden verboten. Die bewusste Lücke: Reichstagsmandate blieben unangetastet, SPD-Abgeordnete durften weiter im Parlament sprechen, da Bismarck die Verfassung nicht brechen wollte und hoffte, die Partei würde ohne Organisationsstruktur absterben.",
        difficulty = 5,
        funFact = "Das Sozialistengesetz hatte den umgekehrten Effekt: Ohne Ortsvereine und legale Strukturen radikalisierte sich ein Teil der SPD, während ein anderer Teil durch konspirative Erfahrung als straff organisierte Untergrundpartei aus der Zeit der Illegalität hervorging. 1890 hatte die SPD trotz zwölf Jahren Verbot mehr Stimmen als je zuvor."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das 'Schlüsselproblem' der Tanzimat-Reformen im Osmanischen Reich und welcher Reformerlass gilt als Höhepunkt und gleichzeitig als Überdehnungspunkt?",
        answerA = "Das Gülhane-Edikt (1839) und der Hatt-ı Hümayun (1856) versprachen Gleichheit aller Untertanen ungeachtet der Religion — das Schlüsselproblem war, dass diese Reformen von muslimischer Bevölkerung als Statusverlust empfunden wurden",
        answerB = "Die Tanzimat scheiterten hauptsächlich an unzureichender Militärreform nach dem Vorbild Napoleons III.",
        answerC = "Das Schlüsselproblem war die fehlende finanzielle Basis für Reformen nach dem Krimkrieg",
        answerD = "Die Tanzimat-Reformer konnten sich nicht gegen die Ulama (islamische Gelehrte) durchsetzen",
        correctAnswer = 0,
        explanation = "Die Tanzimat-Reformen (1839–1876) versprachen mit dem Gülhane-Edikt (Hatt-ı Şerif) und dem Hatt-ı Hümayun von 1856 volle rechtliche Gleichheit aller osmanischen Untertanen ungeachtet ihrer Religionszugehörigkeit. Das fundamentale Problem: Muslimische Bevölkerung sah darin eine Entwertung des islamischen Vorrangs, während christliche Minderheiten und Großmächte die Umsetzung als unzureichend kritisierten — die Reform befriedigte niemanden vollständig und schuf neue Spannungen.",
        difficulty = 5,
        funFact = "Der Hatt-ı Hümayun von 1856 war dem Osmanischen Reich von den Westmächten nach dem Krimkrieg faktisch aufgezwungen worden, um die Unabhängigkeit des Reichs zu 'garantieren' — ein klassisches Beispiel für erzwungene Reformversprechen, die innenpolitisch kaum umsetzbar waren."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches war das zentrale Argument der 'Fischer-Kontroverse' und warum löste es so heftige Reaktionen in der deutschen Geschichtswissenschaft aus?",
        answerA = "Fritz Fischer argumentierte 1961, Deutschland habe 1914 einen Präventivkrieg geplant und wollte die europäische Hegemonie erlangen — was die Hauptschuld-These der Alliierten (Versailler Vertrag) bestätigte und das Selbstbild der Bundesrepublik erschütterte",
        answerB = "Fischer behauptete, der Kaiser habe persönlich den Kriegsbeginn befohlen, was die Monarchisten in der BRD aufbrachte",
        answerC = "Fischer stellte die Kontinuität zwischen Kaiserreich und Nazideutschland her, was den Nachkriegskonsens über den Sonderweg zerstörte",
        answerD = "Fischer widerlegte die Dolchstoßlegende, was die alten Militärs und ihre Apologeten verärgerte",
        correctAnswer = 0,
        explanation = "Fritz Fischers 'Griff nach der Weltmacht' (1961) argumentierte auf Basis des September-Programms und anderer Dokumente, dass die deutsche Führung 1914 einen Präventivkrieg bewusst provoziert hatte, um Welthegemonie zu erreichen. Dies erschütterte den Nachkriegskonsens, der die Kriegsschuld auf alle Mächte verteilte, und bestätigte implizit die Versailler Kriegsschuldthese — weshalb konservative Historiker wie Gerhard Ritter heftig widersprachen.",
        difficulty = 5,
        funFact = "Die Fischer-Kontroverse erreichte ihr ideologisches Maximum, als herausgestellt wurde, dass Fischer selbst NSDAP-Mitglied gewesen war — was seine Kritiker nutzten, um seine Objektivität zu bezweifeln. Doch seine Dokumentenarbeit hielt der Kritik stand und veränderte die Geschichtsschreibung dauerhaft."
    ),

    Question(
        categoryId = 3,
        questionText = "Welchen spezifischen Mechanismus nutzte Bismarck im Kulturkampf, um aufmüpfige Bischöfe zu entfernen, und welches rechtliche Problem entstand dabei?",
        answerA = "Das Expatriierungsgesetz von 1874 ermächtigte den preußischen Staat, Geistliche, die staatlichen Vorschriften zuwiderhandeln, aus Preußen auszuweisen — was jedoch zu der absurden Situation führte, dass Bistümer unbesetzt blieben, da Päpstliche Ernennungen ohne staatliche Genehmigung nichtig waren",
        answerB = "Bischöfe wurden strafrechtlich verfolgt und in Festungshaft genommen, ohne dass eine rechtliche Grundlage bestand",
        answerC = "Bismarck konfiszierte das Kirchenvermögen und zwang Bischöfe damit zur Unterwerfung",
        answerD = "Bischöfe wurden durch staatliche Gegenbischöfe ersetzt, die das Altkatholizismus-Modell übernahmen",
        correctAnswer = 0,
        explanation = "Das Expatriierungsgesetz (1874) ermächtigte Preußen, Geistliche, die sich der Staatsaufsicht widersetzten, aus dem Staatsgebiet zu verweisen. Da der Papst gleichzeitig jede staatliche Genehmigung für Ernennungen verbot, entstanden 'Sedisvakanz'-Situationen: Bistümer hatten keinen rechtmäßig installierten Bischof mehr. Bis 1876 war ein Großteil der preußischen Bistümer administrativ führungslos — was Bismarck dazu zwang, schrittweise vom Kulturkampf abzurücken.",
        difficulty = 5,
        funFact = "Bischof Martin von Paderborn und Erzbischof Ledóchowski von Gnesen wurden inhaftiert — Ledóchowski saß zwei Jahre im Gefängnis. Der Papst erhob ihn zum Kardinal, während er noch eingesperrt war, was Bismarck in eine noch schwierigere diplomatische Lage brachte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Begriff beschrieb die österreichisch-ungarische Balkanpolitik nach dem Berliner Kongress von 1878 und welches konkrete Mandat erhielt Österreich-Ungarn dort?",
        answerA = "'Okkupationsmandat' — Österreich-Ungarn erhielt das Recht zur Okkupation und Verwaltung Bosnien-Herzegowinas sowie das Recht zur Garnisonierung im Sandschak Novi Pazar",
        answerB = "'Protektorat' — Österreich-Ungarn übernahm die vollständige Souveränität über Serbien und Montenegro",
        answerC = "'Interessenzone' — Österreich-Ungarn erhielt den Vorrang bei Handelsverträgen mit allen Balkanstaaten",
        answerD = "'Verwaltungsmandat' — Österreich-Ungarn kontrollierte den gesamten westlichen Balkan bis zur griechischen Grenze",
        correctAnswer = 0,
        explanation = "Der Berliner Kongress (1878) gestattete Österreich-Ungarn die Okkupation und Verwaltung Bosnien-Herzegowinas (trotz formell weiterhin bestehender osmanischer Souveränität) sowie das Recht, Garnisonen im Sandschak Novi Pazar zu stationieren — einem osmanischen Korridor zwischen Serbien und Montenegro, der deren territorialen Zusammenschluss verhindern sollte. 1908 annektierte Österreich-Ungarn Bosnien-Herzegowina formal.",
        difficulty = 5,
        funFact = "Die Annexionskrise von 1908 (Bosnische Annexionskrise) entstand, weil Außenminister Aehrenthal Russlands Zustimmung durch zweideutige Absprachen beim Treffen von Buchlau erhalten zu haben glaubte — Russland bestand darauf, nur einer internationalen Konferenz zugestimmt zu haben, nicht der einseitigen Annexion."
    ),

    Question(
        categoryId = 3,
        questionText = "Was genau unterschied die 'Erste Marokkokrise' (1905/06) von der 'Zweiten Marokkokrise' (1911) in Bezug auf Auslöser, deutschen Akteur und Ausgang?",
        answerA = "1905: Wilhelms Tangerbesuch und Forderung nach internationaler Konferenz, Scheitern Deutschlands in Algeciras; 1911: Entsendung des Kanonenboots 'Panther' nach Agadir durch den Auswärtigen Dienst, Deutschland erhielt Teile des französischen Kongo als Kompensation",
        answerB = "1905: Deutsche Truppen besetzten Tanger, Frankreich gab Marokko auf; 1911: Deutschland forderte Marokko komplett, erhielt aber nur Sahara-Gebiete",
        answerC = "Beide Krisen hatten identische Ursachen (Wilhelms Einmischung) aber unterschiedliche britische Reaktionen",
        answerD = "1905: Österreich-Ungarn unterstützte Deutschland, 1911: Österreich blieb neutral, was Deutschland schwächte",
        correctAnswer = 0,
        explanation = "In der Ersten Marokkokrise (1905) landete Wilhelm II. persönlich in Tanger und proklamierte Marokkos Unabhängigkeit — Deutschland forderte eine internationale Konferenz. Die Konferenz von Algeciras (1906) endete mit einer Niederlage Deutschlands: Nur Österreich-Ungarn und Marokko stimmten mit Deutschland, alle anderen Mächte unterstützten Frankreich. Die Zweite Marokkokrise (1911) begann mit der Entsendung des Kanonenboots 'Panther' nach Agadir — Deutschland versuchte Kompensation zu erzwingen und erhielt schließlich Teile des französischen Kongos (Neukamerun), was als deutscher Rückzug gewertet wurde.",
        difficulty = 5,
        funFact = "Lloyd Georges 'Mansion-House-Rede' vom Juli 1911, in der er unmissverständlich erklärte, Großbritannien werde seine vitalen Interessen verteidigen, war ein entscheidender Faktor: Deutschland erkannte, dass England im Ernstfall auf Frankreichs Seite kämpfen würde — ein Schock, der die Kriegsplanung 1914 beeinflusste."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche konkrete Schlussfolgerung zog die deutsche Heeresleitung aus den Erfahrungen der Ersten Balkankriege (1912/13) für ihre Kriegsplanungen?",
        answerA = "Die überraschend schnelle bulgarisch-serbische Mobilisierung und der türkische Zusammenbruch zeigten, dass der Faktor Zeit entscheidend ist — was den Druck verstärkte, bei einer Krise sofort zu mobilisieren und nicht zu verhandeln",
        answerB = "Die Balkankriege zeigten, dass moderne Artillerie allein Festungen brechen kann, ohne Infanterieangriffe",
        answerC = "Deutschland erkannte, dass seine Verbündeten (Österreich-Ungarn, Osmanisches Reich) militärisch so schwach waren, dass Deutschland allein kämpfen müsste",
        answerD = "Die Balkankriege bewiesen, dass ein Zweifrontenkrieg militärisch unmöglich zu gewinnen sei",
        correctAnswer = 0,
        explanation = "Die Balkankriege (1912/13) demonstrierten, wie schnell moderne Armeen mobilisieren konnten — Bulgarien und Serbien überrannten osmanische Stellungen in Wochen. Für die deutsche Generalstabsplanung bedeutete das: Wer mit der Mobilisierung zögert, verliert. Dieser Zeitdruck prägte 1914 die Entscheidung gegen diplomatische Lösungen: Sobald Russland auch nur teilweise mobilisierte, schien der Schlieffen-Plan nicht mehr ausführbar.",
        difficulty = 5,
        funFact = "Helmuth von Moltke d. J. schrieb im Dezember 1912 an Außenstaatssekretär Kiderlen-Wächter: 'Wir müssen mit dem Krieg anfangen, je eher desto besser' — ein Dokument, das für die Präventivkriegsdebatte um 1914 von zentraler Bedeutung ist und die Fischer-Kontroverse teilweise belegt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der entscheidende verfassungsrechtliche Streit zwischen dem preußischen Abgeordnetenhaus und Bismarck in der Heereskonflikt-Ära von 1862–1866, und wie löste Bismarck ihn faktisch auf?",
        answerA = "Das Parlament verweigerte die Bewilligung des Kriegsbudgets für die Heeresreform — Bismarck regierte durch die 'Lückentheorie' (fehlende Verfassungsbestimmung für Budgetstreits) und löste den Konflikt 1866 durch die Indemnitätsvorlage nach dem Sieg über Österreich",
        answerB = "Das Parlament versuchte, den König abzusetzen, woraufhin Bismarck es durch Notdekret auflöste",
        answerC = "Der Streit betraf die Dauer des Militärdienstes — Bismarck setzte drei Jahre durch, obwohl das Parlament zwei Jahre wollte",
        answerD = "Das Parlament wollte das Heer unter zivile Kontrolle stellen — Bismarck verweigerte das durch Berufung auf das königliche Kommandorecht",
        correctAnswer = 0,
        explanation = "Das preußische Abgeordnetenhaus, dominiert von Liberalen, verweigerte 1862–1866 die Etats für Roon-Moltkes Heeresreform (Verlängerung der Dienstzeit, Reorganisation). Da die Verfassung keine Regelung für einen dauerhaften Budgetstreit enthielt, regierte Bismarck durch die 'Lückentheorie': Wo die Verfassung schweigt, entscheidet die Exekutive. Nach dem Sieg über Österreich 1866 beantragte er eine Indemnitätsvorlage — das Parlament billigte rückwirkend alle verfassungswidrigen Ausgaben. Die Mehrheit der Liberalen spaltete sich: Nationalliberale stimmten dafür.",
        difficulty = 5,
        funFact = "Die Indemnitätsdebatte spaltete den deutschen Liberalismus dauerhaft: Die Nationalliberalen akzeptierten Bismarcks Machtpolitik als Preis für die nationale Einigung — die Fortschrittspartei (später Freisinnige) beharrte auf parlamentarischen Grundsätzen. Diese Spaltung schwächte den Liberalismus für Jahrzehnte."
    ),

)
