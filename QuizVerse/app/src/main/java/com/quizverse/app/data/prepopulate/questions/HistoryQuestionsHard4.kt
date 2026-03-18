package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsHard4(): List<Question> = listOf(

    // --- WWI: Schlieffen Plan ---
    Question(
        categoryId = 3,
        questionText = "Welches Kernprinzip des Schlieffen-Plans sah vor, den Hauptangriff gegen Frankreich zu führen?",
        answerA = "Gleichzeitiger Angriff auf Russland und Frankreich",
        answerB = "Massiver Umfassungsangriff durch Belgien und die Niederlande, um Paris von Norden zu umgehen",
        answerC = "Direkter Durchbruch durch die Vogesen",
        answerD = "Defensiver Stellungskrieg an der Westfront",
        correctAnswer = 1,
        explanation = "Der Schlieffen-Plan (entwickelt 1905) sah einen gewaltigen Schwenkmanöver durch Belgien vor, um die französische Armee von hinten einzukesseln und Paris zu nehmen, bevor Russland mobilisiert.",
        difficulty = 3,
        funFact = "Alfred von Schlieffen warnte auf seinem Sterbebett 1913: 'Macht mir den rechten Flügel stark!' – sein Nachfolger Moltke d.J. schwächte ihn jedoch ab."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie viele Wochen kalkulierte der Schlieffen-Plan für den Sieg über Frankreich, bevor Truppen nach Osten verlegt werden sollten?",
        answerA = "3 Wochen",
        answerB = "6 Wochen",
        answerC = "10 Wochen",
        answerD = "14 Wochen",
        correctAnswer = 1,
        explanation = "Der Schlieffen-Plan sah vor, Frankreich in etwa 6 Wochen zu besiegen, danach sollten die Truppen per Eisenbahn an die Ostfront gegen Russland verlegt werden.",
        difficulty = 3,
        funFact = "Das deutsche Schienennetz hatte 1914 genau die Kapazität geplant, um eine Million Soldaten in wenigen Tagen von West nach Ost zu transportieren."
    ),

    // --- Schützengraben-Taktiken ---
    Question(
        categoryId = 3,
        questionText = "Was bezeichnete man im Ersten Weltkrieg als 'No Man's Land'?",
        answerA = "Das neutrale Territorium der Schweiz",
        answerB = "Das unbewohnte Gebiet zwischen den feindlichen Schützengräben",
        answerC = "Die demilitarisierte Zone im Rheinland",
        answerD = "Das Hinterland hinter der Westfront",
        correctAnswer = 1,
        explanation = "No Man's Land war der von beiden Seiten beschossene, mit Stacheldraht gesicherte Streifen zwischen den deutschen und alliierten Schützengräben – oft nur 50–300 Meter breit.",
        difficulty = 3,
        funFact = "An manchen Frontstellen war No Man's Land so schmal, dass Soldaten Gespräche der Gegner hören konnten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Taktik wurde bei der Offensive an der Somme (1916) erstmals im großen Maßstab eingesetzt?",
        answerA = "Giftgasangriff per Artillerie",
        answerB = "Einsatz von Panzern",
        answerC = "Zermürbungsstrategie durch wochenlangen Artilleriebeschuss",
        answerD = "Luftlandetruppen hinter feindlichen Linien",
        correctAnswer = 1,
        explanation = "An der Somme wurden am 15. September 1916 erstmals Panzer (britische Mark I) im Kampf eingesetzt. Die Zermürbungsstrategie durch Artillerie war zwar bekannt, Panzer waren aber die echte taktische Neuerung.",
        difficulty = 3,
        funFact = "Die ersten Panzer fuhren so langsam (6 km/h), dass Infanteristen locker daneben her gehen konnten – und mussten, da Panzer noch keine zuverlässige Infanterieunterstützung hatten."
    ),

    // --- Gallipoli ---
    Question(
        categoryId = 3,
        questionText = "Wer war der maßgebliche Initiator der Gallipoli-Kampagne (1915)?",
        answerA = "Herbert Kitchener",
        answerB = "Douglas Haig",
        answerC = "Winston Churchill",
        answerD = "John French",
        correctAnswer = 2,
        explanation = "Winston Churchill, damals Erster Lord der Admiralität, war der Hauptbefürworter der Dardanellen-Kampagne. Nach dem Scheitern musste er zurücktreten.",
        difficulty = 3,
        funFact = "Das Scheitern von Gallipoli galt lange als Churchills größte Niederlage – er selbst meldete sich danach als Offizier an der Westfront."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche beiden Nationen kämpften als ANZAC-Truppen bei Gallipoli?",
        answerA = "Australien und Neuseeland",
        answerB = "Australien und Südafrika",
        answerC = "Kanada und Australien",
        answerD = "Neuseeland und Indien",
        correctAnswer = 0,
        explanation = "ANZAC steht für Australian and New Zealand Army Corps. Die Landung am 25. April 1915 (ANZAC Day) ist bis heute ein Nationalfeiertag in beiden Ländern.",
        difficulty = 3,
        funFact = "Mustafa Kemal (später Atatürk) befehligte die osmanische Verteidigung bei ANZAC Cove und wurde durch Gallipoli zur nationalen Heldenfigur der Türkei."
    ),

    // --- Armenischer Genozid ---
    Question(
        categoryId = 3,
        questionText = "In welchem Jahr begann der Völkermord an den Armeniern im Osmanischen Reich?",
        answerA = "1913",
        answerB = "1915",
        answerC = "1917",
        answerD = "1919",
        correctAnswer = 1,
        explanation = "Der Armenische Genozid begann 1915 mit der Verhaftung armenischer Intellektueller in Konstantinopel am 24. April 1915 (heute Gedenktag) und den systematischen Deportationen.",
        difficulty = 3,
        funFact = "Die Zahl der Todesopfer wird auf 600.000 bis 1,5 Millionen geschätzt – die genaue Zahl ist bis heute politisch umstritten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche osmanische Führungsgruppe war hauptverantwortlich für die Organisation des Armenischen Genozids?",
        answerA = "Die Sultansgarde",
        answerB = "Das Komitee für Einheit und Fortschritt (Jungtürken), besonders das 'Trio der Pashas'",
        answerC = "Die osmanische Armee-Oberkommando",
        answerD = "Das osmanische Parlament (Großnationale Versammlung)",
        correctAnswer = 1,
        explanation = "Das Komitee für Einheit und Fortschritt (Jungtürken) unter den 'Drei Pashas' – Enver, Talaat und Cemal – organisierte die Deportationen und Massaker an den Armeniern.",
        difficulty = 3,
        funFact = "Talaat Pascha, der Hauptverantwortliche, wurde 1921 in Berlin von dem armenischen Überlebenden Soghomon Tehlirian erschossen – das Gericht sprach ihn frei."
    ),

    // --- Balfour-Deklaration ---
    Question(
        categoryId = 3,
        questionText = "An wen war die Balfour-Deklaration von 1917 offiziell gerichtet?",
        answerA = "Chaim Weizmann, Präsident der Zionistischen Weltorganisation",
        answerB = "Lord Walter Rothschild, Vertreter der britisch-jüdischen Gemeinschaft",
        answerC = "Den osmanischen Sultan",
        answerD = "Den US-Präsidenten Woodrow Wilson",
        correctAnswer = 1,
        explanation = "Die Deklaration war ein Brief von Außenminister Arthur Balfour an Lord Walter Rothschild, ein führendes Mitglied der britisch-jüdischen Gemeinschaft und Unterstützer des Zionismus.",
        difficulty = 3,
        funFact = "Die Deklaration war nur 67 Wörter lang, hatte aber enorme historische Konsequenzen für die Entstehung des Staates Israel."
    ),

    // --- Versailler Vertrag: spezifische Artikel ---
    Question(
        categoryId = 3,
        questionText = "Welcher Artikel des Versailler Vertrags enthält die berühmte 'Kriegsschuldklausel', die Deutschland die alleinige Kriegsschuld zuweist?",
        answerA = "Artikel 48",
        answerB = "Artikel 231",
        answerC = "Artikel 160",
        answerD = "Artikel 80",
        correctAnswer = 1,
        explanation = "Artikel 231 des Versailler Vertrags, die sogenannte Kriegsschuldklausel (War Guilt Clause), zwang Deutschland, die alleinige Verantwortung für den Krieg anzuerkennen – Grundlage für Reparationsforderungen.",
        difficulty = 3,
        funFact = "Die deutschen Vertreter nannten Artikel 231 den 'Schandparagraphen' – er wurde von der Weimarer Republik und später von den Nationalsozialisten massiv propagandistisch genutzt."
    ),

    Question(
        categoryId = 3,
        questionText = "Auf welche Stärke begrenzte der Versailler Vertrag (Artikel 160) das deutsche Heer (Reichswehr)?",
        answerA = "50.000 Mann",
        answerB = "100.000 Mann",
        answerC = "200.000 Mann",
        answerD = "300.000 Mann",
        correctAnswer = 1,
        explanation = "Artikel 160 des Versailler Vertrags begrenzte das deutsche Heer auf maximal 100.000 Mann – ohne Panzer, schwere Artillerie oder Luftwaffe.",
        difficulty = 3,
        funFact = "General Hans von Seeckt baute die Reichswehr bewusst als Elite-Kadertruppe auf: Jeder Soldat sollte ein potenzieller Offizier sein, um bei Remilitarisierung schnell expandieren zu können."
    ),

    // --- Russischer Bürgerkrieg ---
    Question(
        categoryId = 3,
        questionText = "Welche zwei Hauptlager standen sich im Russischen Bürgerkrieg (1917–1922) gegenüber?",
        answerA = "Bolschewiki (Rote Armee) und Menschewiki",
        answerB = "Rote Armee (Bolschewiki) und Weiße Armee (Konterrevolutionäre)",
        answerC = "Zaristen und Sozialrevolutionäre",
        answerD = "Kommunisten und Anarchisten (Schwarze Armee)",
        correctAnswer = 1,
        explanation = "Der Russische Bürgerkrieg war hauptsächlich ein Kampf zwischen der Roten Armee der Bolschewiki und der Weißen Armee, die aus Zaristen, Liberalen, Menschewiki und ausländischen Interventen bestand.",
        difficulty = 3,
        funFact = "14 ausländische Staaten intervenierten auf Seiten der Weißen, darunter Großbritannien, Frankreich, USA und Japan – eine Tatsache, die die sowjetische Propaganda jahrzehntelang nutzte."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer befehligte die Rote Armee im Russischen Bürgerkrieg und baute sie von Grund auf neu auf?",
        answerA = "Lenin",
        answerB = "Stalin",
        answerC = "Trotzki",
        answerD = "Bucharin",
        correctAnswer = 2,
        explanation = "Leo Trotzki als Volkskommissar für Kriegsangelegenheiten baute die Rote Armee von 1918–1920 von einer irregulären Truppe zu einer disziplinierten Armee von 5 Millionen Mann auf.",
        difficulty = 3,
        funFact = "Trotzki reiste im berühmten 'Panzerzug' an die Fronten, um die Moral zu heben – der Zug war ein fahrendes Hauptquartier mit eigenem Druckhaus, Küche und Radiosender."
    ),

    // --- Weimarer Republik: Parteien ---
    Question(
        categoryId = 3,
        questionText = "Welche Partei stellte mit Friedrich Ebert den ersten Reichspräsidenten der Weimarer Republik?",
        answerA = "Zentrumspartei",
        answerB = "Deutsche Demokratische Partei (DDP)",
        answerC = "Sozialdemokratische Partei Deutschlands (SPD)",
        answerD = "Unabhängige Sozialdemokratische Partei (USPD)",
        correctAnswer = 2,
        explanation = "Friedrich Ebert (SPD) war der erste Reichspräsident der Weimarer Republik (1919–1925). Er hatte zuvor auch das Amt des Reichskanzlers inne.",
        difficulty = 3,
        funFact = "Ebert starb 1925 mit nur 54 Jahren an einer verschleppten Blinddarmentzündung, weil er keinen Arzt aufsuchen wollte – er befürchtete, ein Rechtsstreit würde ihn belasten."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie hieß die rechtsnationalistische Partei, aus der die NSDAP hervorging?",
        answerA = "Deutschnationale Volkspartei (DNVP)",
        answerB = "Deutsche Arbeiterpartei (DAP)",
        answerC = "Vaterlandspartei",
        answerD = "Freikorps-Bewegung",
        correctAnswer = 1,
        explanation = "Die NSDAP entstand 1920 aus der Deutschen Arbeiterpartei (DAP), die 1919 in München gegründet worden war. Hitler trat der DAP im Herbst 1919 bei.",
        difficulty = 3,
        funFact = "Hitler war ursprünglich als Spitzel des Reichswehr-Nachrichtendienstes zu einer Versammlung der DAP geschickt worden – und blieb dann selbst."
    ),

    // --- Weimarer Republik: Kanzler ---
    Question(
        categoryId = 3,
        questionText = "Wer war der erste Reichskanzler der Weimarer Republik?",
        answerA = "Philipp Scheidemann",
        answerB = "Gustav Bauer",
        answerC = "Hermann Müller",
        answerD = "Philipp Scheidemann",
        correctAnswer = 0,
        explanation = "Philipp Scheidemann (SPD) war der erste Reichskanzler der Weimarer Republik (Februar–Juni 1919). Er hatte am 9. November 1918 eigenmächtig die Republik ausgerufen.",
        difficulty = 3,
        funFact = "Scheidemann trat zurück, weil er den Versailler Vertrag nicht unterzeichnen wollte – er nannte ihn einen 'Mördervertrag, der deutschen Boden, deutschen Ehrgeiz, deutsche Kraft tötet'."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Reichskanzler der Weimarer Republik führte 1923 die Stabilisierungsmaßnahmen durch, die die Hyperinflation beendeten?",
        answerA = "Wilhelm Cuno",
        answerB = "Gustav Stresemann",
        answerC = "Hans Luther",
        answerD = "Wilhelm Marx",
        correctAnswer = 1,
        explanation = "Gustav Stresemann als Reichskanzler (August–November 1923) und danach als Außenminister leitete die Währungsreform ein, die die Hyperinflation mit der Einführung der Rentenmark beendete.",
        difficulty = 3,
        funFact = "Die Rentenmark war durch Hypotheken auf landwirtschaftliche und gewerbliche Grundstücke gedeckt – ein einzigartiger Kunstgriff, da es kein echtes Gold als Deckung gab."
    ),

    // --- Weimarer Verfassung: Artikel ---
    Question(
        categoryId = 3,
        questionText = "Welcher Artikel der Weimarer Verfassung ermöglichte dem Reichspräsidenten das Regieren per Notverordnung ohne Zustimmung des Reichstags?",
        answerA = "Artikel 25",
        answerB = "Artikel 48",
        answerC = "Artikel 54",
        answerD = "Artikel 76",
        correctAnswer = 1,
        explanation = "Artikel 48 der Weimarer Verfassung ('Diktaturparagraph') ermöglichte dem Reichspräsidenten in Notlagen, ohne Zustimmung des Reichstags zu regieren – er wurde zur Schwachstelle der Demokratie.",
        difficulty = 3,
        funFact = "Artikel 48 wurde bis 1932 über 250 Mal angewendet. In den letzten Jahren der Weimarer Republik regierte Hindenburg faktisch per Notverordnung."
    ),

    // --- Aufstieg des Nationalsozialismus ---
    Question(
        categoryId = 3,
        questionText = "Was war der Unterschied zwischen SA und SS in der frühen NS-Bewegung?",
        answerA = "SA war die politische Polizei, SS die Parteiarmee",
        answerB = "SA war die paramilitärische Massenorganisation ('Braunhemden'), SS die kleinere Elitegarde Hitlers",
        answerC = "SA war für die Propaganda zuständig, SS für militärische Operationen",
        answerD = "SA war die Jugendorganisation, SS die Erwachsenenorganisation",
        correctAnswer = 1,
        explanation = "Die SA (Sturmabteilung) war die große paramilitärische Kampftruppe der NSDAP mit über 3 Millionen Mann bis 1934. Die SS (Schutzstaffel) begann als Hitlers persönliche Leibgarde und blieb zunächst kleiner und exklusiver.",
        difficulty = 3,
        funFact = "Beim Röhm-Putsch (Nacht der langen Messer, 30. Juni 1934) ließ Hitler die SA-Führung durch die SS ermorden, um die Wehrmacht zu beruhigen und Himmlers SS zur dominanten Machtorganisation zu machen."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie hieß das Gesetz vom 24. März 1933, das dem Reichskabinett die Vollmacht gab, Gesetze ohne Zustimmung des Reichstags zu erlassen?",
        answerA = "Reichstagsbrandverordnung",
        answerB = "Gesetz zur Behebung der Not von Volk und Reich (Ermächtigungsgesetz)",
        answerC = "Gesetz zur Wiederherstellung des Berufsbeamtentums",
        answerD = "Schutzhaftbefehl",
        correctAnswer = 1,
        explanation = "Das Ermächtigungsgesetz ('Gesetz zur Behebung der Not von Volk und Reich') vom 24. März 1933 übertrug die Gesetzgebungsgewalt auf die Reichsregierung und schaltete den Reichstag faktisch aus.",
        difficulty = 3,
        funFact = "Das Ermächtigungsgesetz wurde mit Stimmen der Zentrums- und Deutschnationalen Parteien verabschiedet – nur die SPD stimmte geschlossen dagegen. KPD-Abgeordnete waren bereits verhaftet."
    ),

    Question(
        categoryId = 3,
        questionText = "Was bezeichnet der Begriff 'Gleichschaltung' im NS-Kontext?",
        answerA = "Die Vereinheitlichung des Schienennetzwerks",
        answerB = "Die Gleichstellung von Männern und Frauen im Arbeitsleben",
        answerC = "Die Unterwerfung aller gesellschaftlichen Institutionen unter NS-Kontrolle",
        answerD = "Die Angleichung der Löhne in der Rüstungsindustrie",
        correctAnswer = 2,
        explanation = "Gleichschaltung bezeichnete die systematische Unterwerfung aller staatlichen, politischen, gesellschaftlichen und kulturellen Institutionen unter die nationalsozialistische Kontrolle (1933–1934).",
        difficulty = 3,
        funFact = "Selbst Sportvereine, Gesangsvereine und Kleintierzüchterverbände wurden 'gleichgeschaltet' – entweder aufgelöst oder in NS-Organisationen überführt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis nutzten die Nationalsozialisten, um mit der Notverordnung vom 28. Februar 1933 Grundrechte außer Kraft zu setzen?",
        answerA = "Das Attentat auf Ernst Röhm",
        answerB = "Der Reichstagsbrand",
        answerC = "Der Marsch auf Berlin der SA",
        answerD = "Die Ermordung von Walther Rathenau",
        correctAnswer = 1,
        explanation = "Der Reichstagsbrand vom 27. Februar 1933 wurde von den Nazis genutzt, um am nächsten Tag die 'Verordnung zum Schutz von Volk und Staat' zu erlassen, die Grundrechte dauerhaft außer Kraft setzte.",
        difficulty = 3,
        funFact = "Bis heute ist umstritten, ob Marinus van der Lubbe allein handelte oder ob die Nazis selbst den Brand legten. Die historische Forschung neigt zur Einzeltäter-These."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der erste Führer der SS und baute sie zur mächtigsten Terrororganisation des NS-Staates aus?",
        answerA = "Reinhard Heydrich",
        answerB = "Ernst Röhm",
        answerC = "Heinrich Himmler",
        answerD = "Rudolf Heß",
        correctAnswer = 2,
        explanation = "Heinrich Himmler übernahm 1929 die Führung der SS und baute sie von einer kleinen Leibgarde zu einer Massenorganisation mit eigener Polizei (Gestapo), Konzentrationslagern und Waffen-SS aus.",
        difficulty = 3,
        funFact = "Himmler war ursprünglich Hühnerzüchter und Landwirtschaftsstudent – sein bürokratisches Organisationstalent machte ihn zum effektivsten Terrorchef des NS-Regimes."
    ),

    // --- Spanischer Bürgerkrieg ---
    Question(
        categoryId = 3,
        questionText = "Welche internationale Einheit kämpfte auf republikanischer Seite im Spanischen Bürgerkrieg und bestand überwiegend aus freiwilligen Kommunisten und Antifaschisten aus aller Welt?",
        answerA = "Fremdenlegion",
        answerB = "Internationale Brigaden",
        answerC = "COMINTERN-Freiwillige",
        answerD = "Anarchistische Milizen (FAI)",
        correctAnswer = 1,
        explanation = "Die Internationalen Brigaden (1936–1938) bestanden aus ca. 35.000 freiwilligen Antifaschisten aus über 50 Ländern, organisiert von der Komintern, die für die Spanische Republik kämpften.",
        difficulty = 3,
        funFact = "Ernest Hemingway und George Orwell kämpften und schrieben über den Spanischen Bürgerkrieg – Orwells 'Mein Katalonien' ist ein direktes Zeugnis seiner Erfahrungen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis des Spanischen Bürgerkriegs inspirierte Picassos berühmtes gleichnamiges Gemälde (1937)?",
        answerA = "Die Belagerung von Madrid",
        answerB = "Die Bombardierung von Guernica durch die deutsche Legion Condor",
        answerC = "Der Fall Barcelonas an Francos Truppen",
        answerD = "Das Massaker von Badajoz",
        correctAnswer = 1,
        explanation = "Am 26. April 1937 bombardierten die deutsche Legion Condor und italienische Flugzeuge das baskische Städtchen Guernica – eines der ersten gezielten Bombardements einer Zivilbevölkerung in Europa.",
        difficulty = 3,
        funFact = "Picasso malte 'Guernica' in nur 35 Tagen im Auftrag der Spanischen Republik für die Pariser Weltausstellung 1937. Das Gemälde kehrte erst 1981 nach dem Tod Francos nach Spanien zurück."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche beiden faschistischen Staaten unterstützten Franco militärisch im Spanischen Bürgerkrieg mit Truppen und Ausrüstung?",
        answerA = "Deutschland und Portugal",
        answerB = "Deutschland und Italien",
        answerC = "Italien und Japan",
        answerD = "Deutschland und Ungarn",
        correctAnswer = 1,
        explanation = "Nazi-Deutschland (Legion Condor, ca. 19.000 Mann) und das faschistische Italien (Corpo Truppe Volontarie, ca. 70.000 Mann) unterstützten Francos Nationalisten massiv.",
        difficulty = 3,
        funFact = "Für Hitler war der Spanische Bürgerkrieg ein Testfeld für neue Waffen und Taktiken – besonders die Bomber der Legion Condor wurden für den späteren Blitzkrieg erprobt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Pakt zwischen Deutschland und der Sowjetunion überraschte die Spanische Republik 1939, als sie noch hoffte, eine antifaschistische Koalition zu bilden?",
        answerA = "Münchner Abkommen",
        answerB = "Stahl-Pakt",
        answerC = "Hitler-Stalin-Pakt (Molotow-Ribbentrop-Pakt)",
        answerD = "Anti-Komintern-Pakt",
        correctAnswer = 2,
        explanation = "Der Hitler-Stalin-Pakt vom 23. August 1939 schockierte die europäische Linke und ließ die Spanische Republik (die auf sowjetische Hilfe gehofft hatte) endgültig isoliert – sie war da aber bereits gefallen.",
        difficulty = 3,
        funFact = "Als die Sowjetunion 1936–1938 die Spanische Republik unterstützte, nutzte Stalin dies, um NKWD-Agenten in Spanien zu stationieren und Trotzkisten und Anarchisten zu verfolgen."
    ),

    // --- Anschluss Österreichs ---
    Question(
        categoryId = 3,
        questionText = "In welchem Monat und Jahr fand der Anschluss Österreichs an das Deutsche Reich statt?",
        answerA = "Februar 1938",
        answerB = "März 1938",
        answerC = "September 1938",
        answerD = "Oktober 1938",
        correctAnswer = 1,
        explanation = "Der Anschluss Österreichs erfolgte am 12./13. März 1938, als deutsche Truppen in Österreich einmarschierten und Österreich als 'Ostmark' ins Deutsche Reich eingegliedert wurde.",
        difficulty = 3,
        funFact = "Österreichischer Bundeskanzler Schuschnigg hatte kurz zuvor ein Referendum über die Unabhängigkeit geplant – Hitler ließ ihn unter Druck setzen und zum Rücktritt zwingen, bevor es stattfinden konnte."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der österreichische Bundeskanzler, den Hitler 1938 unter Druck setzte und zum Rücktritt zwang, um den Anschluss zu ermöglichen?",
        answerA = "Engelbert Dollfuß",
        answerB = "Arthur Seyß-Inquart",
        answerC = "Kurt Schuschnigg",
        answerD = "Wilhelm Miklas",
        correctAnswer = 2,
        explanation = "Kurt Schuschnigg, Bundeskanzler seit 1934, wollte ein Volksbegehren zur österreichischen Unabhängigkeit abhalten. Hitler bestand auf seinem Rücktritt und ernannte den NS-Sympathisanten Seyß-Inquart als Nachfolger.",
        difficulty = 3,
        funFact = "Schuschnigg verbrachte die Jahre 1938–1945 in verschiedenen NS-Gefängnissen und KZ-Außenlagern. Er überlebte und emigrierte nach dem Krieg in die USA."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche 'Volksabstimmung' fand nach dem Anschluss Österreichs statt und ergab ein angebliches Ja von über 99 Prozent?",
        answerA = "Die Volksabstimmung über den Beitritt zur Wehrmacht",
        answerB = "Die Volksabstimmung vom 10. April 1938 über die Vereinigung mit Deutschland",
        answerC = "Die Volksabstimmung über die neue Reichsverfassung",
        answerD = "Die Volksabstimmung über die NS-Rassengesetze",
        correctAnswer = 1,
        explanation = "Am 10. April 1938 fand eine Volksabstimmung über den Anschluss statt, die unter massivem Druck und ohne geheime Abstimmung zu 99,71 % Zustimmung ergab – internationales Symbol für inszenierte NS-Demokratie.",
        difficulty = 3,
        funFact = "Selbst Sigmund Freud musste in Wien öffentlich unterschreiben, dass er gut behandelt worden sei, bevor ihm die Ausreise nach London erlaubt wurde."
    ),

    // --- Münchner Abkommen ---
    Question(
        categoryId = 3,
        questionText = "Welche vier Staatsführer unterzeichneten das Münchner Abkommen vom 29./30. September 1938?",
        answerA = "Hitler, Mussolini, Chamberlain, Daladier",
        answerB = "Hitler, Mussolini, Chamberlain, Stalin",
        answerC = "Hitler, Ribbentrop, Chamberlain, Halifax",
        answerD = "Hitler, Göring, Chamberlain, Daladier",
        correctAnswer = 0,
        explanation = "Das Münchner Abkommen wurde von Adolf Hitler (Deutschland), Benito Mussolini (Italien), Neville Chamberlain (Großbritannien) und Édouard Daladier (Frankreich) unterzeichnet.",
        difficulty = 3,
        funFact = "Die Tschechoslowakei selbst war nicht eingeladen und wurde nachträglich über die Abtretung des Sudetenlandes informiert – deshalb nennt man das Abkommen auf Tschechisch 'Mnichovská zrada' (Münchner Verrat)."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand Neville Chamberlain unter seiner Politik der 'Appeasement' gegenüber Hitler?",
        answerA = "Militärische Aufrüstung als Abschreckung",
        answerB = "Nachgeben bei revisionistischen Forderungen, um einen neuen Weltkrieg zu vermeiden",
        answerC = "Wirtschaftliche Sanktionen gegen Deutschland",
        answerD = "Eine gemeinsame europäische Verteidigungsallianz",
        correctAnswer = 1,
        explanation = "Appeasement bezeichnete die britische Politik, Hitlers territoriale Forderungen (Rheinland, Österreich, Sudetenland) schrittweise nachzugeben in der Hoffnung, dadurch den Frieden zu erhalten.",
        difficulty = 3,
        funFact = "Chamberlain kehrte aus München mit dem berühmten Satz zurück: 'I believe it is peace for our time' – weniger als ein Jahr später begann der Zweite Weltkrieg."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Gebiet der Tschechoslowakei musste nach dem Münchner Abkommen an Deutschland abgetreten werden?",
        answerA = "Die Slowakei",
        answerB = "Das Sudetenland",
        answerC = "Böhmen und Mähren",
        answerD = "Das Karpatenukraine",
        correctAnswer = 1,
        explanation = "Das Sudetenland – die deutschen Siedlungsgebiete am Rand Böhmens und Mährens – musste nach dem Münchner Abkommen bis zum 10. Oktober 1938 an Deutschland abgetreten werden.",
        difficulty = 3,
        funFact = "Im Sudetenland lebten rund 3,5 Millionen Deutschsprachige. Hitler nutzte die angebliche Unterdrückung durch die Tschechoslowakei als Vorwand, obwohl das Land eine funktionierende Demokratie war."
    ),

    Question(
        categoryId = 3,
        questionText = "Wann besetzte Hitler entgegen dem Münchner Abkommen den Rest der Tschechoslowakei?",
        answerA = "Oktober 1938",
        answerB = "Januar 1939",
        answerC = "März 1939",
        answerD = "September 1939",
        correctAnswer = 2,
        explanation = "Am 15. März 1939 marschierte die Wehrmacht in die restliche Tschechoslowakei ein und errichtete das 'Protektorat Böhmen und Mähren' – ein klarer Bruch des Münchner Abkommens.",
        difficulty = 3,
        funFact = "Die Besetzung Prags war ein Wendepunkt: Es war das erste Mal, dass Hitler nicht-deutsches Gebiet annektierte – und Chamberlain erkannte, dass Appeasement gescheitert war."
    ),

    // --- Zusätzliche Vertiefungsfragen ---
    Question(
        categoryId = 3,
        questionText = "Welcher US-Präsident formulierte die '14 Punkte' als Friedensgrundlage nach dem Ersten Weltkrieg?",
        answerA = "Theodore Roosevelt",
        answerB = "Warren G. Harding",
        answerC = "Woodrow Wilson",
        answerD = "William Howard Taft",
        correctAnswer = 2,
        explanation = "Woodrow Wilson verkündete am 8. Januar 1918 seine '14 Punkte' – ein Friedensprogramm, das Selbstbestimmungsrecht der Völker, Abrüstung und den Völkerbund vorsah.",
        difficulty = 3,
        funFact = "Ironischerweise ratifizierte der US-Senat den Versailler Vertrag nicht, und die USA traten dem Völkerbund nie bei – obwohl Wilson dessen Gründung durchgesetzt hatte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Militärtaktik wurde bei der deutschen Frühjahrsoffensive 1918 (Operation Michael) eingesetzt und revolutionierte die Infanterietaktik?",
        answerA = "Massenpanzerangriffe",
        answerB = "Stoßtruppen-Taktik mit kleinen Infiltrationsgruppen",
        answerC = "Gasangriffe als Hauptwaffe",
        answerD = "Fallschirmtruppen hinter den Linien",
        correctAnswer = 1,
        explanation = "Die Stoßtruppen-Taktik (Hutier-Taktik) setzte kleine, schnelle Infiltrationsgruppen ein, die feindliche Stellungen umgingen statt frontal anzugreifen – eine revolutionäre Abkehr vom Massenangriff.",
        difficulty = 3,
        funFact = "Die Stoßtruppen-Taktik bildete die Grundlage des späteren deutschen Blitzkriegs: Geschwindigkeit, Infiltration und Umgehung statt frontaler Zermürbung."
    ),

    Question(
        categoryId = 3,
        questionText = "In welcher Stadt wurde die Weimarer Verfassung 1919 verabschiedet und warum nicht in Berlin?",
        answerA = "Frankfurt, wegen der historischen Paulskirche",
        answerB = "Weimar, wegen Sicherheitsbedenken nach der Berliner Spartakistenunruhen",
        answerC = "München, als größte Stadt",
        answerD = "Hamburg, wegen seiner demokratischen Tradition",
        correctAnswer = 1,
        explanation = "Die Nationalversammlung tagte in Weimar, da Berlin nach dem Spartakusaufstand (Januar 1919) als zu unsicher galt – und Weimar als Symbol für das klassische Deutschland (Goethe, Schiller) stand.",
        difficulty = 3,
        funFact = "Der Spartakusaufstand wurde vom SPD-geführten Kabinett mit Hilfe der Freikorps brutal niedergeschlagen – Rosa Luxemburg und Karl Liebknecht wurden ermordet."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Artikel der Weimarer Verfassung regelte die Möglichkeit der Reichstagsauflösung durch den Reichspräsidenten?",
        answerA = "Artikel 25",
        answerB = "Artikel 48",
        answerC = "Artikel 54",
        answerD = "Artikel 73",
        correctAnswer = 0,
        explanation = "Artikel 25 der Weimarer Verfassung gab dem Reichspräsidenten das Recht, den Reichstag aufzulösen – allerdings nur einmal wegen desselben Anlasses. Hindenburg nutzte dies mehrfach.",
        difficulty = 3,
        funFact = "Zwischen 1930 und 1933 wurde der Reichstag dreimal aufgelöst – ein Zeichen für die völlige politische Instabilität, die den Aufstieg der NSDAP begünstigte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Vertrag beendete den Ersten Weltkrieg an der Ostfront zwischen Deutschland und Sowjetrussland?",
        answerA = "Vertrag von Saint-Germain",
        answerB = "Vertrag von Brest-Litowsk",
        answerC = "Vertrag von Rapallo",
        answerD = "Vertrag von Riga",
        correctAnswer = 1,
        explanation = "Der Vertrag von Brest-Litowsk (3. März 1918) beendete Russlands Teilnahme am Ersten Weltkrieg – Russland musste enorme Gebiete (Ukraine, Baltikum, Finnland) abtreten.",
        difficulty = 3,
        funFact = "Lenin bezeichnete den 'obszönen Frieden' von Brest-Litowsk als notwendiges Opfer – er hoffte, die deutschen Arbeiter würden bald ebenfalls revolutionieren und den Vertrag hinfällig machen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Dolchstoßlegende', die nach dem Ersten Weltkrieg in Deutschland verbreitet wurde?",
        answerA = "Die Behauptung, Frankreich habe Deutschland heimlich mit Chemiewaffen sabotiert",
        answerB = "Der Mythos, die deutsche Armee sei im Feld ungeschlagen, aber von Sozialisten und Juden in der Heimat verraten worden",
        answerC = "Die These, der Versailler Vertrag sei durch Erpressung zustande gekommen",
        answerD = "Die Legende, der Kaiser habe die Kapitulation gegen den Willen der Generäle angeordnet",
        correctAnswer = 1,
        explanation = "Die Dolchstoßlegende behauptete, die deutsche Armee sei im Feld unbesiegt gewesen und durch 'Verräter' in der Heimat (Sozialisten, Pazifisten, Juden) 'in den Rücken gestochen' worden – eine gefährliche Lüge.",
        difficulty = 3,
        funFact = "Hindenburg selbst verbreitete die Dolchstoßlegende vor dem Reichstagsausschuss 1919, obwohl er als OHL-Chef selbst die Kapitulation betrieben hatte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was bezeichnete die 'Nacht der langen Messer' (30. Juni bis 2. Juli 1934)?",
        answerA = "Die Ermordung jüdischer Geschäftsleute während der Kristallnacht",
        answerB = "Die Ermordung der SA-Führung und politischer Gegner durch die SS auf Hitlers Befehl",
        answerC = "Der SA-Marsch durch jüdische Viertel in Berlin",
        answerD = "Die gewaltsame Auflösung der Gewerkschaften",
        correctAnswer = 1,
        explanation = "Während der 'Nacht der langen Messer' ließ Hitler SA-Chef Ernst Röhm und weitere SA-Führer sowie politische Gegner ermorden – um die Wehrmacht zu beschwichtigen und Himmlers SS zu stärken.",
        difficulty = 3,
        funFact = "Auch der frühere Reichskanzler Kurt von Schleicher und seine Frau wurden bei dieser Aktion ermordet – ein Signal, dass niemand vor Hitlers Willkür sicher war."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Partei bildete die stärkste parlamentarische Opposition gegen die Nationalsozialisten im Reichstag bis 1933?",
        answerA = "Deutschnationale Volkspartei (DNVP)",
        answerB = "Sozialdemokratische Partei Deutschlands (SPD)",
        answerC = "Kommunistische Partei Deutschlands (KPD)",
        answerD = "Zentrumspartei",
        correctAnswer = 1,
        explanation = "Die SPD war die stärkste und konsequenteste demokratische Oppositionspartei bis 1933 – sie als einzige stimmte geschlossen gegen das Ermächtigungsgesetz am 23. März 1933.",
        difficulty = 3,
        funFact = "SPD-Fraktionsvorsitzender Otto Wels hielt am 23. März 1933 eine mutige Rede gegen das Ermächtigungsgesetz – wenige Wochen später wurde die SPD verboten."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Kapp-Putsch' von 1920?",
        answerA = "Ein kommunistischer Aufstandsversuch in Hamburg",
        answerB = "Ein rechtsextremistischer Putschversuch gegen die Weimarer Republik, der durch einen Generalstreik scheiterte",
        answerC = "Hitlers erster Versuch, die Regierung in Berlin zu stürzen",
        answerD = "Eine Meuterei der Marine in Kiel",
        correctAnswer = 1,
        explanation = "Der Kapp-Putsch (13.–17. März 1920) war ein Staatsstreich von Teilen der Reichswehr und Freikorps unter Wolfgang Kapp, der durch einen erfolgreichen Generalstreik der Arbeiter scheiterte.",
        difficulty = 3,
        funFact = "Die Reichswehr weigerte sich, gegen die Putschisten vorzugehen. Reichswehrchef von Seeckt soll gesagt haben: 'Truppe schießt nicht auf Truppe.'"
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Artikel des Versailler Vertrags schuf den Völkerbund?",
        answerA = "Artikel 1",
        answerB = "Artikel 119",
        answerC = "Artikel 231",
        answerD = "Artikel 380",
        correctAnswer = 0,
        explanation = "Artikel 1 des Versailler Vertrags enthielt die Satzung des Völkerbundes. Die Gründung des Völkerbundes war Wilsons wichtigstes Ziel in seinen 14 Punkten.",
        difficulty = 3,
        funFact = "Der Völkerbund wurde 1920 in Genf gegründet – ohne die USA, deren Senat die Ratifizierung des Versailler Vertrags verweigerte."
    ),

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr wurde die deutsche Hyperinflation durch die Einführung der Rentenmark beendet?",
        answerA = "1921",
        answerB = "1922",
        answerC = "1923",
        answerD = "1924",
        correctAnswer = 2,
        explanation = "Die Rentenmark wurde am 15. November 1923 eingeführt und setzte der Hyperinflation ein Ende – 1 Rentenmark entsprach dabei 1 Billion Papiermark.",
        difficulty = 3,
        funFact = "Im Oktober 1923 kostete ein Laib Brot 200 Milliarden Mark – Menschen transportierten ihr Geld in Schubkarren zum Einkaufen."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der Anführer der bolschewistischen Revolution im November 1917 in Russland?",
        answerA = "Alexander Kerenski",
        answerB = "Leo Trotzki",
        answerC = "Wladimir Iljitsch Lenin",
        answerD = "Georgi Plechanow",
        correctAnswer = 2,
        explanation = "Lenin führte die Bolschewiki bei der Oktoberrevolution (nach dem Julianischen Kalender) / Novemberrevolution (nach Gregorianischem Kalender) 1917 an, die die Provisorische Regierung Kerenskis stürzte.",
        difficulty = 3,
        funFact = "Lenin war zum Zeitpunkt der Revolution erst seit wenigen Monaten aus dem Schweizer Exil zurück – Deutschland hatte ihn im berühmten 'versiegelten Zug' durch Deutschland geschickt, um Russland zu destabilisieren."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das Ergebnis der Locarno-Verträge von 1925 für Deutschland?",
        answerA = "Deutschland musste weitere Reparationen zahlen",
        answerB = "Deutschland anerkannte die Westgrenzen und wurde diplomatisch wieder eingegliedert",
        answerC = "Deutschland erhielt Kolonien in Afrika zurück",
        answerD = "Deutschland wurde aus dem Versailler Vertrag entlassen",
        correctAnswer = 1,
        explanation = "Die Locarno-Verträge (Oktober 1925) brachten Deutschlands diplomatische Rehabilitation: Es anerkannte freiwillig die Westgrenzen (Rhein), was den Weg in den Völkerbund (1926) öffnete.",
        difficulty = 3,
        funFact = "Stresemann, Briand und Chamberlain erhielten für die Locarno-Verträge den Friedensnobelpreis 1926 – der 'Geist von Locarno' war der Höhepunkt der Weimarer Außenpolitik."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Reparationssumme legte der Versailler Vertrag für Deutschland fest, die 1921 durch die Reparationskommission auf 132 Milliarden Goldmark festgesetzt wurde?",
        answerA = "Die Summe war bereits 1919 im Vertrag exakt festgelegt",
        answerB = "Der genaue Betrag wurde 1919 bewusst offengelassen und erst 1921 festgelegt",
        answerC = "Deutschland sollte unbegrenzt zahlen, ohne Enddatum",
        answerD = "Die Summe wurde auf Betreiben der USA auf 50 Milliarden begrenzt",
        correctAnswer = 1,
        explanation = "Der Versailler Vertrag 1919 legte keine genaue Summe fest – erst 1921 setzte die Reparationskommission 132 Milliarden Goldmark als Gesamtschuld fest (tatsächlich zu zahlende A-Bonds: 50 Mrd.).",
        difficulty = 3,
        funFact = "Deutschland leistete die letzte Reparationszahlung erst am 3. Oktober 2010 – 92 Jahre nach Ende des Ersten Weltkriegs."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Dawes-Plan' von 1924?",
        answerA = "Ein britischer Plan zur Verringerung der deutschen Armee",
        answerB = "Ein US-amerikanischer Plan zur Neustrukturierung der deutschen Reparationszahlungen und Stabilisierung der Wirtschaft",
        answerC = "Ein Abrüstungsplan für die europäischen Großmächte",
        answerD = "Ein Plan zur Neuziehung der deutschen Grenzen",
        correctAnswer = 1,
        explanation = "Der Dawes-Plan (August 1924) war ein US-amerikanisch vermitteltes Abkommen: Deutschland erhielt amerikanische Kredite und konnte die Reparationen in kleineren Raten zahlen – Grundlage der relativen Stabilisierung 1924–1929.",
        difficulty = 3,
        funFact = "Der Dawes-Plan schuf einen zirkulären Kapitalfluss: US-Banken liehen Deutschland Geld → Deutschland zahlte Reparationen an England und Frankreich → die zahlten ihre Kriegsschulden an die USA zurück."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Organisation war für die Durchführung der 'Endlösung' (Holocaust) hauptverantwortlich und leitete die Wannsee-Konferenz 1942?",
        answerA = "Die SA unter Ernst Röhm",
        answerB = "Das RSHA (Reichssicherheitshauptamt) unter Reinhard Heydrich",
        answerC = "Das Reichsministerium für Volksaufklärung und Propaganda",
        answerD = "Die Wehrmacht-Führung (OKW)",
        correctAnswer = 1,
        explanation = "Reinhard Heydrich, Chef des RSHA (Reichssicherheitshauptamt), leitete am 20. Januar 1942 die Wannsee-Konferenz, auf der die bürokratische Koordination der 'Endlösung' besprochen wurde.",
        difficulty = 3,
        funFact = "Die Wannsee-Konferenz dauerte nur 90 Minuten – das Protokoll, das den Mord an Millionen Menschen bürokratisch koordinierte, ist eines der erschreckendsten Dokumente der Geschichte."
    ),

)
