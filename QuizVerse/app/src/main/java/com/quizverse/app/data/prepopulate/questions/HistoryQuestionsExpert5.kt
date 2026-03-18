package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsExpert5(): List<Question> = listOf(

    // --- Interwar Period: Ruhr Occupation ---

    Question(
        categoryId = 3,
        questionText = "Welches Land besetzte gemeinsam mit Frankreich das Ruhrgebiet im Januar 1923?",
        answerA = "Großbritannien",
        answerB = "Belgien",
        answerC = "Italien",
        answerD = "Polen",
        correctAnswer = 1,
        explanation = "Frankreich und Belgien besetzten ab dem 11. Januar 1923 das Ruhrgebiet, nachdem Deutschland mit Reparationslieferungen in Rückstand geraten war. Die Besatzung dauerte bis 1925.",
        difficulty = 4,
        funFact = "Der 'passive Widerstand' der deutschen Bevölkerung kostete das Reich so viel, dass er die Hyperinflation von 1923 maßgeblich mitverursachte – Deutschland druckte Geld, um streikende Arbeiter zu bezahlen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Dawes-Plan-Architekt erhielt 1925 den Friedensnobelpreis für seinen Beitrag zur Lösung der Ruhrkrise?",
        answerA = "Gustav Stresemann",
        answerB = "Charles G. Dawes",
        answerC = "Austen Chamberlain",
        answerD = "Aristide Briand",
        correctAnswer = 1,
        explanation = "Charles G. Dawes, US-amerikanischer Bankier und späterer Vizepräsident, erhielt 1925 den Friedensnobelpreis für den Dawes-Plan (1924), der Deutschlands Reparationszahlungen neu strukturierte und ausländische Kredite ermöglichte.",
        difficulty = 4,
        funFact = "Der Dawes-Plan schuf einen makabren Kreislauf: US-Banken liehen Deutschland Geld → Deutschland zahlte Reparationen an Frankreich und Großbritannien → diese zahlten ihre Kriegsschulden an die USA zurück."
    ),

    // --- Interwar Period: Rapallo Treaty ---

    Question(
        categoryId = 3,
        questionText = "Was war der historisch bedeutsamste Aspekt des Rapallo-Vertrags von 1922 zwischen Deutschland und Sowjetrussland?",
        answerA = "Gemeinsame Grenzziehung in Polen",
        answerB = "Gegenseitiger Verzicht auf Reparationen und Wiederaufnahme diplomatischer Beziehungen",
        answerC = "Militärbündnis gegen Frankreich",
        answerD = "Freihandelsabkommen für Industriegüter",
        correctAnswer = 1,
        explanation = "Der Rapallo-Vertrag (16. April 1922) normalisierte die Beziehungen zwischen dem international isolierten Deutschland und Sowjetrussland. Beide Länder verzichteten auf gegenseitige Kriegsschulden und Reparationen und erkannten sich gegenseitig diplomatisch an.",
        difficulty = 4,
        funFact = "Der Vertrag wurde während der Genua-Konferenz heimlich ausgehandelt und schockierte die Westmächte so sehr, dass der Begriff 'Geist von Rapallo' zum Symbol unerwarteter deutsch-russischer Kooperation wurde."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche geheime Klausel des Rapallo-Vertrags, die 1926 durch den Berliner Vertrag ergänzt wurde, erlaubte Deutschland trotz Versailler Verboten militärisch zu operieren?",
        answerA = "Stationierung deutscher Truppen in Odessa",
        answerB = "Erprobung verbotener Waffen (Panzer, Flugzeuge, Chemiewaffen) auf sowjetischem Gebiet",
        answerC = "Gemeinsame Entwicklung von U-Booten im Schwarzen Meer",
        answerD = "Ausbildung der Roten Armee durch die Reichswehr in Berlin",
        correctAnswer = 1,
        explanation = "In geheimen Zusatzvereinbarungen (Seeckt-Abkommen) ermöglichte die Sowjetunion der Reichswehr, verbotene Waffengattungen auf russischem Boden zu erproben: Panzerschule in Kasan, Fliegerschule in Lipezk, Gaskampfschule in Saratow.",
        difficulty = 4,
        funFact = "Viele Offiziere, die später Wehrmacht-Kommandeure wurden – darunter Heinz Guderian – sammelten ihre Panzererfahrung in der geheimen Schule von Kasan in der Sowjetunion."
    ),

    // --- Interwar Period: Stresa Front ---

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis löste im April 1935 die Bildung der Stresa-Front zwischen Großbritannien, Frankreich und Italien aus?",
        answerA = "Japans Invasion der Mandschurei",
        answerB = "Hitlers Wiedereinführung der allgemeinen Wehrpflicht",
        answerC = "Der Anschluss Österreichs",
        answerD = "Die Remilitarisierung des Rheinlands",
        correctAnswer = 1,
        explanation = "Als Hitler am 16. März 1935 die allgemeine Wehrpflicht einführte und damit den Versailler Vertrag offen brach, trafen sich Großbritannien, Frankreich und Italien in Stresa, um einen gemeinsamen Protest zu formulieren und die Unabhängigkeit Österreichs zu garantieren.",
        difficulty = 4,
        funFact = "Die Stresa-Front zerbrach nach wenigen Monaten: Großbritannien schloss heimlich das Anglo-Deutsche Flottenabkommen (Juni 1935), und Italiens Angriff auf Äthiopien (Oktober 1935) machte jede gemeinsame Front unmöglich."
    ),

    // --- Interwar Period: Hoare-Laval Pact ---

    Question(
        categoryId = 3,
        questionText = "Was sah der geheime Hoare-Laval-Plan von Dezember 1935 vor, und warum scheiterte er?",
        answerA = "Aufteilung Spaniens zwischen Deutschland und Italien – scheiterte am Volksfront-Sieg in Frankreich",
        answerB = "Abtretung großer Teile Äthiopiens an Italien – scheiterte an einem Presseleeck und öffentlichem Aufschrei",
        answerC = "Übergabe des Sudetenlandes an Deutschland – scheiterte am tschechischen Veto",
        answerD = "Kolonialabtausch zwischen Großbritannien und Frankreich – scheiterte am Kabinettswiderstand",
        correctAnswer = 1,
        explanation = "Der britische Außenminister Samuel Hoare und der französische Premier Pierre Laval planten, Mussolinis Äthiopien-Feldzug durch Gebietsabtretungen zu befrieden. Als der Plan im Dezember 1935 an die Presse gelangte, erzwang der öffentliche Protest Hoares Rücktritt.",
        difficulty = 4,
        funFact = "Der Hoare-Laval-Skandal wurde zum Symbol für 'Appeasement' – dem vergeblichen Versuch, aggressive Diktatoren durch Zugeständnisse auf Kosten schwächerer Staaten zu besänftigen."
    ),

    // --- WWII: Operation Overlord Planning ---

    Question(
        categoryId = 3,
        questionText = "Welcher Codename bezeichnete den alliierten Täuschungsplan, der Hitler glauben ließ, die D-Day-Landung würde im Pas-de-Calais stattfinden?",
        answerA = "Operation Bodyguard",
        answerB = "Operation Fortitude",
        answerC = "Operation Mincemeat",
        answerD = "Operation Quicksilver",
        correctAnswer = 1,
        explanation = "Operation Fortitude war der Haupttäuschungsplan unter dem Oberbegriff Operation Bodyguard. Fortitude South simulierte mithilfe von Funk-Deception und dem fiktiven 'First US Army Group' (FUSAG) unter Patton eine Invasion im Pas-de-Calais.",
        difficulty = 4,
        funFact = "Hitler hielt noch wochenlang nach dem 6. Juni 1944 Panzerdivisionen im Pas-de-Calais zurück, überzeugt, die Normandie-Landung sei nur ein Ablenkungsmanöver – ein Irrtum, der den Alliierten entscheidende Aufbauzeit schenkte."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie hieß der ursprüngliche alliierte Plan für eine Invasion in Nordwestfrankreich, der 1942 ausgearbeitet, aber zugunsten der Nordafrika-Landung (Operation Torch) zurückgestellt wurde?",
        answerA = "Operation Roundup",
        answerB = "Operation Sledgehammer",
        answerC = "Operation Bolero",
        answerD = "Operation Jupiter",
        correctAnswer = 0,
        explanation = "Operation Roundup war der Plan für eine groß angelegte Invasion in Nordfrankreich für 1943. Operation Sledgehammer war eine Notfallvariante für 1942. Churchill setzte sich mit dem Nordafrika-Plan (Torch) durch, was zu erheblichen Spannungen mit US-Strategen führte.",
        difficulty = 4,
        funFact = "US-Generalstabschef George Marshall und Kriegsminister Stimson waren so verärgert über Churchills Nordafrika-Priorität, dass sie ernsthaft erwogen, alle US-Ressourcen in den Pazifik umzuleiten, um Druck auf die Briten auszuüben."
    ),

    // --- WWII: Ultra/Enigma ---

    Question(
        categoryId = 3,
        questionText = "Welches polnische Mathematiker-Trio leistete 1932–1939 die entscheidende Grundlagenarbeit zum Brechen der deutschen Enigma-Verschlüsselung?",
        answerA = "Marian Rejewski, Jerzy Różycki, Henryk Zygalski",
        answerB = "Stefan Mazurkiewicz, Wacław Sierpiński, Hugo Steinhaus",
        answerC = "Alan Turing, Gordon Welchman, Dilly Knox",
        answerD = "William Friedman, Frank Rowlett, Leo Rosen",
        correctAnswer = 0,
        explanation = "Die polnischen Kryptologen Rejewski, Różycki und Zygalski vom Biuro Szyfrów brachen die Enigma mathematisch bereits in den 1930er Jahren. Im Juli 1939 übergaben sie ihre Methoden und Bomba-Maschinen an Großbritannien und Frankreich.",
        difficulty = 4,
        funFact = "Marian Rejewski nutzte eine brillante mathematische Einsicht: Er analysierte die Nachrichteneinleitungen (bei denen die Tageseinstellungen zweimal gesendet wurden) und konnte so die Enigma-Verdrahtung algebraisch rekonstruieren – ohne je eine Maschine gesehen zu haben."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches war die größte operationelle Herausforderung bei der Nutzung von Ultra-Informationen, die verhinderte, dass die Alliierten jeden deutschen Angriff abwehren konnten?",
        answerA = "Die Informationen kamen stets zu spät für operative Entscheidungen",
        answerB = "Das Risiko, die Quelle zu verraten, erzwang selektiven Einsatz der Erkenntnisse",
        answerC = "Ultra konnte nur Marine-, nicht Heer-Enigma entschlüsseln",
        answerD = "Churchill weigerte sich, Ultra-Informationen mit US-Kommandeuren zu teilen",
        correctAnswer = 1,
        explanation = "Die Alliierten mussten Ultra-Erkenntnisse so einsetzen, dass die Deutschen nicht merkten, dass ihre Verschlüsselung gebrochen war. Häufig mussten sie den Schein wahren, z.B. durch vorgetäuschte Aufklärungsflüge vor Angriffen.",
        difficulty = 4,
        funFact = "Die berühmteste tragische Entscheidung: Coventry. Obwohl Churchill wusste, dass ein Großangriff bevorstand, konnte er die Stadt nicht evakuieren, ohne Ultra zu gefährden. Historiker streiten bis heute, ob er wirklich wählen musste oder ob andere Quellen die Warnung erklären konnten."
    ),

    // --- WWII: Manhattan Project ---

    Question(
        categoryId = 3,
        questionText = "Welcher Physiker leitete die wissenschaftliche Direktion des Manhattan-Projekts in Los Alamos und trug den militärischen Titel 'Wissenschaftlicher Direktor'?",
        answerA = "Enrico Fermi",
        answerB = "J. Robert Oppenheimer",
        answerC = "Ernest Lawrence",
        answerD = "Niels Bohr",
        correctAnswer = 1,
        explanation = "J. Robert Oppenheimer leitete das Los Alamos Laboratory (Site Y) als wissenschaftlicher Direktor. General Leslie Groves war der militärische Gesamtleiter des Manhattan-Projekts.",
        difficulty = 4,
        funFact = "Als die erste Atombombe beim Trinity-Test am 16. Juli 1945 explodierte, soll Oppenheimer den Vers aus der Bhagavad Gita zitiert haben: 'Jetzt bin ich der Tod geworden, der Zerstörer der Welten' – ein Zitat, das ihn für immer definierte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher deutsche Physiker leitete das nationalsozialistische Kernwaffenprogramm (Uranverein), das jedoch nie die kritische Masse für eine Bombe erreichte?",
        answerA = "Werner Heisenberg",
        answerB = "Otto Hahn",
        answerC = "Carl Friedrich von Weizsäcker",
        answerD = "Kurt Diebner",
        correctAnswer = 0,
        explanation = "Werner Heisenberg leitete das Hauptforschungsprogramm des Uraniumprojekts. Die Gründe für das Scheitern sind bis heute umstritten: fehlende Ressourcen, fehlendes Schwerwasser (Norsk Hydro), Heisenbergs eigene Fehler bei der kritischen Masse, oder bewusste Verzögerung.",
        difficulty = 4,
        funFact = "Nach Kriegsende wurden Heisenberg und andere deutsche Physiker in Farm Hall (England) interniert. Ihre abgehörten Gespräche nach Hiroshima zeigen, dass sie die wahre kritische Masse der Bombe völlig falsch eingeschätzt hatten."
    ),

    // --- WWII: Yalta Specifics ---

    Question(
        categoryId = 3,
        questionText = "Welche geheime Zusatzvereinbarung von Jalta verpflichtete die Sowjetunion, innerhalb von 90 Tagen nach dem Sieg in Europa Japan den Krieg zu erklären?",
        answerA = "Das Jalta-Protokoll über den Fernen Osten",
        answerB = "Das Geheimabkommen über die sowjetische Kriegsbeteiligung im Pazifik",
        answerC = "Die Jalta-Formel für Asien",
        answerD = "Die Far Eastern Agreement",
        correctAnswer = 1,
        explanation = "In einem geheimen Zusatzabkommen zu Jalta (Februar 1945) vereinbarten Roosevelt und Stalin, dass die UdSSR 90 Tage nach der deutschen Kapitulation Japan den Krieg erklären würde. Im Gegenzug erhielt die Sowjetunion Territorien (Kurilen, Sachalin-Süden, Port Arthur).",
        difficulty = 4,
        funFact = "Die UdSSR erklärte Japan am 8. August 1945 – exakt 90 Tage nach der deutschen Kapitulation und einen Tag nach Hiroshima – den Krieg. Stalin hatte das Abkommen auf die Stunde genau eingehalten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Formel für die Nachkriegsregierungen befreiter Länder wurde in Jalta vereinbart und führte sofort zu Konflikten bezüglich Polens?",
        answerA = "Die Atlantik-Charta-Formel",
        answerB = "Die Formel 'freie und ungehinderte Wahlen so bald wie möglich'",
        answerC = "Das Prozentsatz-Abkommen (Percentages Agreement)",
        answerD = "Die Vier-Mächte-Kontrollformel",
        correctAnswer = 1,
        explanation = "Jalta beschloss, dass in befreiten Ländern 'freie und ungehinderte Wahlen' stattfinden sollten. Stalin interpretierte dies aber höchst eigenwillig: In Polen wurde die kommunistisch dominierte Lubliner Regierung einfach zur Übergangsregierung erklärt.",
        difficulty = 4,
        funFact = "Churchill hatte bereits im Oktober 1944 in Moskau mit Stalin das 'Percentages Agreement' über Einflussphären ausgehandelt – auf einer Serviette: Rumänien 90% Russland, Griechenland 90% Großbritannien, Jugoslawien 50/50. Roosevelt wusste davon."
    ),

    // --- WWII: Morgenthau Plan ---

    Question(
        categoryId = 3,
        questionText = "Was war der Kerninhalt des Morgenthau-Plans (1944) für Nachkriegsdeutschland, und von wem wurde er letztlich abgelehnt?",
        answerA = "Aufteilung Deutschlands in 7 Staaten – abgelehnt von Churchill",
        answerB = "Deindustrialisierung und Umwandlung in einen Agrarstaat – abgelehnt von Kriegsminister Stimson und später Roosevelt selbst",
        answerC = "Permanente Besatzung durch alle vier Mächte für 50 Jahre – abgelehnt von Stalin",
        answerD = "Massendeportation der deutschen Bevölkerung nach Ostafrika – abgelehnt vom US-Kongress",
        correctAnswer = 1,
        explanation = "US-Finanzminister Henry Morgenthau schlug vor, Deutschlands Industrie vollständig zu zerstören und das Land in einen Agrarstaat umzuwandeln. Kriegsminister Stimson und Außenminister Hull lehnten dies scharf ab; Roosevelt distanzierte sich nach Bekanntwerden des Plans.",
        difficulty = 4,
        funFact = "Goebbels nutzte den durchgesickerten Morgenthau-Plan intensiv für die NS-Propaganda: 'Seht, was die Alliierten mit Deutschland vorhaben!' – er soll tatsächlich die deutsche Kriegsmoral im Herbst 1944 kurzzeitig gestärkt haben."
    ),

    // --- Holocaust: Einsatzgruppen ---

    Question(
        categoryId = 3,
        questionText = "Welches war das größte Einzelmassaker der Einsatzgruppen, und wie viele Menschen wurden dort im September 1941 ermordet?",
        answerA = "Babi Jar bei Kiew – etwa 33.771 Menschen in zwei Tagen",
        answerB = "Ponary bei Wilna – etwa 70.000 Menschen über mehrere Monate",
        answerC = "Rumbula bei Riga – etwa 25.000 Menschen in zwei Tagen",
        answerD = "Kamjanez-Podilskyj – etwa 23.600 Menschen in drei Tagen",
        correctAnswer = 0,
        explanation = "Das Massaker von Babi Jar am 29. und 30. September 1941 war das größte Einzelmassaker der Einsatzgruppen: Das Sonderkommando 4a und ukrainische Hilfskräfte erschossen 33.771 Juden aus Kiew in der Schlucht Babi Jar.",
        difficulty = 4,
        funFact = "Bis zum Ende des Krieges wurden in und um Babi Jar schätzungsweise 100.000 bis 150.000 Menschen ermordet – Juden, Roma, sowjetische Kriegsgefangene und ukrainische Nationalisten. Jewgeni Jewtuschenko verewrigte das Massaker 1961 in seinem berühmten Gedicht 'Babi Jar'."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Einsatzgruppen-Kommandeur wurde im Einsatzgruppen-Prozess (Nürnberg 1948) als Hauptangeklagter zum Tode verurteilt und hingerichtet?",
        answerA = "Reinhard Heydrich",
        answerB = "Otto Ohlendorf",
        answerC = "Arthur Nebe",
        answerD = "Walther Stahlecker",
        correctAnswer = 1,
        explanation = "Otto Ohlendorf, Befehlshaber der Einsatzgruppe D (Südrussland/Krim), gab im Nürnberger Einsatzgruppen-Prozess offen zu, für den Tod von über 90.000 Menschen verantwortlich zu sein. Er wurde 1951 hingerichtet.",
        difficulty = 4,
        funFact = "Ohlendorf versuchte sich mit dem Befehlsnotstand zu verteidigen – dem Argument, er habe keine Wahl gehabt. Das Gericht verwarf dies: Kein Beweis zeigte, dass Soldaten für die Weigerung, Zivilisten zu erschießen, hingerichtet wurden."
    ),

    // --- Holocaust: Specific Camps and Dates ---

    Question(
        categoryId = 3,
        questionText = "In welchem Vernichtungslager begann die systematische Vergasung von Juden zuerst, und mit welchem Verfahren?",
        answerA = "Auschwitz-Birkenau, Zyklon B im September 1941",
        answerB = "Belzec, Kohlenmonoxid aus Vergasungsanlagen im März 1942",
        answerC = "Chelmno (Kulmhof), Gaswagen (Kohlenmonoxid) im Dezember 1941",
        answerD = "Treblinka, Zyklon B im Juli 1942",
        correctAnswer = 2,
        explanation = "Chelmno (Kulmhof) war das erste Vernichtungslager im deutschen Einflussbereich. Ab dem 8. Dezember 1941 wurden dort Juden aus dem Warthegau in mobilen Gaswagen mit Kohlenmonoxid ermordet – noch vor der Wannsee-Konferenz.",
        difficulty = 4,
        funFact = "In Chelmno wurden geschätzte 150.000 bis 340.000 Menschen ermordet. Das Lager hatte keine Krematorien – die Leichen wurden in Massengräbern verscharrt, später exhumiert und verbrannt, um die Spuren zu verwischen (Aktion 1005)."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Vernichtungslager war Teil der 'Aktion Reinhard' und hatte die höchste Opferzahl unter den drei Reinhard-Lagern?",
        answerA = "Belzec",
        answerB = "Sobibor",
        answerC = "Treblinka",
        answerD = "Majdanek",
        correctAnswer = 2,
        explanation = "Treblinka II war das Vernichtungslager mit den meisten Opfern der Aktion Reinhard: Zwischen Juli 1942 und Oktober 1943 wurden dort schätzungsweise 700.000 bis 900.000 hauptsächlich polnische Juden ermordet.",
        difficulty = 4,
        funFact = "Am 2. August 1943 erhoben sich die jüdischen Arbeitshäftlinge in Treblinka zum Aufstand – sie hatten Werkzeug und Waffen gehortet. Etwa 200 von 750 Aufständischen entkamen; die meisten wurden auf der Flucht erschossen. Das Lager wurde danach abgebaut."
    ),

    // --- Cold War: Berlin Tunnel ---

    Question(
        categoryId = 3,
        questionText = "Welche Operation der CIA und des britischen MI6 ließ 1955–1956 einen Tunnel unter Berlin in sowjetisches Territorium graben, und wie wurde sie vorzeitig verraten?",
        answerA = "Operation Gold – verraten durch den KGB-Maulwurf George Blake",
        answerB = "Operation Silver – verraten durch den DDR-Spion Werner Wolf",
        answerC = "Operation Stopwatch – verraten durch den CIA-Überläufer Edward Lee Howard",
        answerD = "Operation Mole – verraten durch Aldrich Ames",
        correctAnswer = 0,
        explanation = "Operation Gold (amerikanisch) bzw. Operation Stopwatch (britisch) bohrte einen 450 m langen Tunnel unter Ost-Berlin zu sowjetischen Kommunikationsleitungen. Der britische MI6-Offizier George Blake, der an der Planung beteiligt war, verriet den Tunnel dem KGB noch bevor er fertig war.",
        difficulty = 4,
        funFact = "Das KGB wusste vom Tunnel, durfte ihn aber monatelang nicht 'entdecken', da sonst George Blake als Maulwurf enttarnt worden wäre. Sie warteten auf einen plausiblen Vorwand und 'entdeckten' den Tunnel erst im April 1956 – nach 11 Monaten Betrieb."
    ),

    // --- Cold War: U-2 Incident ---

    Question(
        categoryId = 3,
        questionText = "Welches entscheidende Beweismittel machte es Chruschtschow möglich, Eisenhowers anfängliche Lüge über den abgeschossenen U-2-Aufklärungsflug vom Mai 1960 zu widerlegen?",
        answerA = "Abfangaufnahmen sowjetischer Radarstationen",
        answerB = "Der lebende Pilot Francis Gary Powers und die geborgene Kameraausrüstung",
        answerC = "Geständnis des CIA-Direktors Allen Dulles im US-Senat",
        answerD = "Funkprotokolle des Abschusskommandos",
        correctAnswer = 1,
        explanation = "Die CIA und Eisenhower behaupteten zunächst, es handle sich um ein abgestürztes Wetterforschungsflugzeug. Chruschtschow enthüllte dann, dass sowohl der Pilot Gary Powers lebend gefangen genommen als auch Kameraausrüstung und Aufnahmen geborgen worden waren.",
        difficulty = 4,
        funFact = "Powers wurde 1962 gegen den sowjetischen Spion Rudolf Abel (William Fisher) ausgetauscht – auf der Glienicker Brücke in Berlin, die zum Symbol für Agentenaustausche wurde. Die Geschichte wurde 2015 in Steven Spielbergs Film 'Bridge of Spies' verewigt."
    ),

    // --- Cold War: Bay of Pigs ---

    Question(
        categoryId = 3,
        questionText = "Welcher entscheidende Fehler in der CIA-Planung der Invasion in der Schweinebucht (April 1961) machte das Scheitern praktisch unvermeidbar?",
        answerA = "Die Exilkubaner lehnten den Landeplan im letzten Moment ab",
        answerB = "Kennedy strich die Luftangriffe, die Castros Luftwaffe am Boden zerstören sollten",
        answerC = "Das Landungsschiff wurde von einem kubanischen U-Boot versenkt",
        answerD = "Der CIA unterschätzte die Größe von Castros Armee um den Faktor 10",
        correctAnswer = 1,
        explanation = "Der ursprüngliche Plan sah massive Luftangriffe vor, um Castros Luftwaffe am Boden zu zerstören. Kennedy reduzierte und dann strich diese Angriffe kurz vor der Invasion aus politischen Gründen (Verleugbarkeit). Ohne Luftüberlegenheit waren die Invasoren schutzlos.",
        difficulty = 4,
        funFact = "Nach dem Debakel sagte Kennedy privat, er wünschte, er hätte die Invasion entweder vollständig unterstützt oder vollständig abgesagt – der Mittelweg war das Schlimmste. Er feuerte CIA-Direktor Allen Dulles, Deputy Director Charles Cabell und Richard Bissell."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie endete die Schweinebucht-Krise für die gefangenen Invasoren, und was zahlten die USA als Lösegeld?",
        answerA = "1.113 Gefangene wurden gegen 53 Millionen Dollar in Lebensmitteln und Medikamenten freigelassen",
        answerB = "800 Gefangene wurden in einem Geheimabkommen gegen kubanische Staatsgefangene ausgetauscht",
        answerC = "Die Gefangenen wurden in Kuba zu 30 Jahren Haft verurteilt und nie freigelassen",
        answerD = "Kuba gab die Gefangenen kostenlos frei im Austausch für die Aufhebung der Wirtschaftsblockade",
        correctAnswer = 0,
        explanation = "Die 1.113 überlebenden Gefangenen der Brigade 2506 wurden im Dezember 1962 freigelassen. Cuba erhielt als 'Lösegeld' Lebensmittel und Medikamente im Wert von 53 Millionen Dollar, gesammelt durch private US-amerikanische Spenden.",
        difficulty = 4,
        funFact = "Präsident Kennedy empfing die befreiten Invasoren am 29. Dezember 1962 im Orange Bowl Stadium in Miami. Er übernahm die Brigade-Flagge und versprach: 'Diese Fahne wird in einem freien Havanna zurückkehren.' Das Versprechen wurde nie eingelöst."
    ),

    // --- Cold War: COINTELPRO ---

    Question(
        categoryId = 3,
        questionText = "Gegen welche Organisationen richtete sich COINTELPRO (Counter Intelligence Program) des FBI primär, und in welchem Jahr wurde das Programm offiziell beendet?",
        answerA = "Kommunistische Partei USA, Socialist Workers Party, Black Panther Party, American Indian Movement – 1971",
        answerB = "Ku-Klux-Klan, Weiße Bürgerrechtsorganisationen, John Birch Society – 1975",
        answerC = "Anti-Vietnamkrieg-Bewegung, Scientology, Hells Angels – 1973",
        answerD = "NAACP, Urban League, ACLU – 1969",
        correctAnswer = 0,
        explanation = "COINTELPRO (1956–1971) richtete sich gegen die CPUSA, SWP, White Hate Groups (KKK), Black Power-Bewegungen (Black Panthers, SCLC unter King) und American Indian Movement. Es wurde 1971 offiziell eingestellt, nachdem FBI-Akten von Aktivisten gestohlen und veröffentlicht wurden.",
        difficulty = 4,
        funFact = "Das FBI bezeichnete Martin Luther King jr. als 'gefährlichsten Neger Amerikas'. Hoover ließ Kings Telefone abhören, versuchte, ihn mit einer Affäre zu erpressen, und sandte ihm kurz vor der Nobelpreisverleihung einen anonymen Brief, der ihn zur Selbsttötung aufforderte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche COINTELPRO-Taktik wurde genutzt, um die Black Panther Party und US Organization gegeneinander aufzubringen und zu schwächen?",
        answerA = "Verbreitung gefälschter Drohbriefe und Karikaturen, die Morde und Vergeltungsaktionen provozierten",
        answerB = "Einschleusung von Polizeiinformatoren als Mitglieder",
        answerC = "Falsche Verhaftungen von Führungspersönlichkeiten wegen fabrizierter Verbrechen",
        answerD = "Kontrolle der Bankkonten und Einfrieren von Vereinsvermögen",
        correctAnswer = 0,
        explanation = "Das FBI schickte gefälschte, bedrohliche Briefe und Karikaturen an beide Organisationen, die jeweils von der anderen Seite zu kommen schienen. Diese Manipulation schürte einen gewaltsamen Konflikt, bei dem mehrere Mitglieder beider Gruppen getötet wurden.",
        difficulty = 4,
        funFact = "Der Kirchenausschuss (Church Committee) des US-Senats enthüllte 1975/76 alle COINTELPRO-Aktivitäten. Senator Frank Church sprach von einem 'schlimmen Kapitel der amerikanischen Geschichte' – die Enthüllungen führten zu grundlegenden Reformen der US-Geheimdienste."
    ),

    // --- Post-Cold War: Maastricht Details ---

    Question(
        categoryId = 3,
        questionText = "Welche vier Konvergenzkriterien mussten EU-Mitgliedstaaten laut Maastrichter Vertrag erfüllen, um der Eurozone beizutreten?",
        answerA = "Preisstabilität, Wechselkursstabilität, solide öffentliche Finanzen (Defizit max. 3% BIP, Schulden max. 60% BIP), langfristige Zinssätze",
        answerB = "BIP-Wachstum min. 2%, Arbeitslosigkeit unter 8%, Handelsüberschuss, Zentralbankunabhängigkeit",
        answerC = "Demokratie-Index, Pressefreiheit, Korruptionsindex, Haushaltsüberschuss",
        answerD = "Goldreserven, Devisenreserven, Bankenstabilität, fiskalischer Föderalismus",
        correctAnswer = 0,
        explanation = "Die Maastricht-Konvergenzkriterien (1992): 1) Inflation max. 1,5 Prozentpunkte über den drei preisstabilsten Ländern, 2) Staatsverschuldung max. 60% des BIP, Defizit max. 3%, 3) Wechselkursstabilität (EWS-Teilnahme), 4) Langfristzinsen max. 2 Punkte über den drei stabilsten.",
        difficulty = 4,
        funFact = "Griechenland erfüllte die Kriterien bei EU-Prüfung 2001 rechnerisch – allerdings durch statistische Tricks, wie sich später herausstellte. Dieser Betrug wurde erst 2004 entdeckt und läutete eine Krise ein, die 2010 im griechischen Staatsbankrott gipfelte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Land hielt ein zweites Referendum über den Maastrichter Vertrag ab, nachdem es beim ersten 'Nein' gestimmt hatte, und welche Ausnahmeregelungen wurden dabei ausgehandelt?",
        answerA = "Dänemark – Ausnahmen bei Euro, Verteidigung, EU-Bürgerschaft, Justiz/Inneres",
        answerB = "Irland – Ausnahmen bei Abtreibung, Neutralität und Steuerpolitik",
        answerC = "Norwegen – Ausnahmen bei Fischerei und Ölindustrie",
        answerD = "Schweden – Ausnahmen bei Euro und Schengen",
        correctAnswer = 0,
        explanation = "Dänemark stimmte im Juni 1992 mit 50,7% gegen Maastricht. Nach dem Edinburgher Abkommen (1992), das Dänemark Ausnahmen in vier Bereichen gewährte (Euro, gemeinsame Verteidigung, EU-Bürgerschaft, Justiz/Inneres), stimmten die Dänen im Mai 1993 mit 56,8% dafür.",
        difficulty = 4,
        funFact = "Dänemark ist bis heute nicht Mitglied der Eurozone – nicht weil es die Kriterien nicht erfüllt, sondern weil es die Opt-out-Klausel nie aufgegeben hat. Ein Referendum zur Abschaffung der Opt-outs scheiterte 2000 mit 53% Nein."
    ),

    // --- Post-Cold War: Balkan Wars Specifics ---

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis im August 1995 zwang die bosnischen Serben zum Rückzug und ermöglichte das Daytoner Abkommen?",
        answerA = "Die NATO-Luftkampagne Operation Deliberate Force nach dem Granatenangriff auf den Markale-Markt",
        answerB = "Die kroatische Militäroperation Sturm (Oluja) und Blitz (Bljesak)",
        answerC = "Der UN-Sicherheitsrat-Beschluss zur Entsendung von 60.000 NATO-Soldaten",
        answerD = "Der Rücktritt Radovan Karadžićs und Übergabe des Kommandos",
        correctAnswer = 0,
        explanation = "Nach dem zweiten Granatenangriff auf den Markale-Markt in Sarajevo (28. August 1995, 43 Tote) startete die NATO Operation Deliberate Force (30. August–14. September 1995): 400 Luftangriffe auf bosnisch-serbische Stellungen. Dies, kombiniert mit der kroatischen Operation Sturm, erzwang Verhandlungen.",
        difficulty = 4,
        funFact = "Operation Oluja (Sturm) vom 4.–8. August 1995 war die größte europäische Bodenoffensive seit dem Zweiten Weltkrieg: 200.000 kroatische Soldaten vertrieben die Krajina-Serben in vier Tagen. Etwa 150.000–200.000 Serben flohen – die größte Vertreibung in Europa seit 1945."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher UN-Safe-Area-Beschluss schützte Srebrenica offiziell, und wie viele Blauhelme waren dort bei dem Massaker von Juli 1995 stationiert?",
        answerA = "Resolution 819 (1993) – 600 niederländische Blauhelme (Dutchbat III)",
        answerB = "Resolution 824 (1993) – 1.200 kanadische Blauhelme",
        answerC = "Resolution 836 (1993) – 400 französische Blauhelme",
        answerD = "Resolution 743 (1992) – 800 britische Blauhelme",
        correctAnswer = 0,
        explanation = "Srebrenica wurde durch UN-Resolution 819 vom April 1993 zur 'Safe Area' erklärt. Beim Massaker im Juli 1995 waren rund 600 niederländische Blauhelme (Dutchbat III) vor Ort, die die bosnisch-serbischen Truppen unter Mladic ohne wirksamen Widerstand durchließen.",
        difficulty = 4,
        funFact = "Das niederländische Parlament verabschiedete 2002 einen offiziellen Bericht (NIOD-Bericht), der die Fehler der Niederlande und der UN analysierte. Die niederländische Regierung unter Wim Kok trat kollektiv zurück – ein weltweit einzigartiger Vorgang wegen eines militärischen Versagens im Ausland."
    ),

    // --- Post-Cold War: Rwanda Genocide ---

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis am 6. April 1994 löste den Beginn des Völkermords in Ruanda aus?",
        answerA = "Der Putsch der Hutu-Interahamwe gegen die Regierung",
        answerB = "Der Abschuss des Flugzeugs mit Präsident Habyarimana und dem burundischen Präsidenten",
        answerC = "Der RPF-Angriff auf Kigali von Uganda aus",
        answerD = "Die Ermordung von UN-Generalsekretär Roméo Dallaires Stellvertreter",
        correctAnswer = 1,
        explanation = "Am 6. April 1994 wurde das Flugzeug mit Ruandas Präsident Juvénal Habyarimana und Burundis Präsident Cyprien Ntaryamira beim Landeanflug auf Kigali abgeschossen. Innerhalb von Stunden begannen die Hutu-Extremisten systematisch Tutsi zu ermorden.",
        difficulty = 4,
        funFact = "Wer das Flugzeug abschoss, ist bis heute ungeklärt. Zwei Theorien: Hutu-Extremisten (um einen Vorwand für geplanten Völkermord zu haben) oder RPF-Rebellen unter Paul Kagame (um Habyarimana zu eliminieren). Ein französischer Untersuchungsrichter beschuldigte 2006 Kagame."
    ),

    Question(
        categoryId = 3,
        questionText = "Welchen Codenamen hatte die Militäroperation Frankreichs, die 1994 in Ruanda eine 'humanitäre Schutzzone' errichtete, aber für ihre Doppelrolle kritisiert wurde?",
        answerA = "Operation Turquoise",
        answerB = "Operation Amaryllis",
        answerC = "Operation Assurance",
        answerD = "Operation Noroit",
        correctAnswer = 0,
        explanation = "Operation Turquoise (22. Juni–21. August 1994) entsandte 2.500 französische Soldaten in den Südwesten Ruandas. Kritiker warfen Frankreich vor, den Hutu-Extremisten eine sichere Fluchtroute nach Zaire zu schaffen und eigene Staatsangehörige zu evakuieren, statt Tutsi zu schützen.",
        difficulty = 4,
        funFact = "Frankreich hatte vor dem Völkermord die Habyarimana-Regierung militärisch unterstützt und ausgebildet. Jahrzehntelange Untersuchungen mündeten 2021 in einen offiziellen Bericht der Duclert-Kommission, der Frankreich 'überwältigende Verantwortung' für das Geschehene zuschrieb."
    ),

    // --- Post-Cold War: 9/11 Aftermath ---

    Question(
        categoryId = 3,
        questionText = "Welcher Paragraph des NATO-Vertrags wurde nach dem 11. September 2001 erstmals in der Geschichte des Bündnisses aktiviert?",
        answerA = "Artikel 4 (Konsultationspflicht)",
        answerB = "Artikel 5 (kollektive Verteidigung – Angriff auf einen ist Angriff auf alle)",
        answerC = "Artikel 6 (geographischer Anwendungsbereich)",
        answerD = "Artikel 51 (UN-Charta – Selbstverteidigung)",
        correctAnswer = 1,
        explanation = "Artikel 5 des NATO-Vertrags wurde nach dem 11. September 2001 erstmals seit der Gründung 1949 aktiviert. Dies ermöglichte die NATO-Unterstützung für die Operation Enduring Freedom in Afghanistan.",
        difficulty = 4,
        funFact = "Ironischerweise wurde Artikel 5 zuerst von einem NATO-Mitglied für ein Nicht-NATO-Mitglied ausgelöst: Die USA waren angegriffen worden, und die europäischen NATO-Partner erklärten Solidarität. Der erste NATO-Kampfeinsatz unter Artikel 5 war AWACS-Überwachungsflüge über den USA selbst."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches US-Gesetz wurde 45 Tage nach dem 11. September 2001 verabschiedet und erweiterte die Überwachungsbefugnisse der Behörden erheblich?",
        answerA = "Homeland Security Act",
        answerB = "Authorization for Use of Military Force (AUMF)",
        answerC = "USA PATRIOT Act",
        answerD = "Intelligence Reform and Terrorism Prevention Act",
        correctAnswer = 2,
        explanation = "Der USA PATRIOT Act (Uniting and Strengthening America by Providing Appropriate Tools Required to Intercept and Obstruct Terrorism) wurde am 26. Oktober 2001 verabschiedet und erlaubte u.a. Roving Wiretaps, sneak-and-peek searches und massenhafte Telefonüberwachung.",
        difficulty = 4,
        funFact = "Der PATRIOT Act wurde in weiten Teilen ohne ernsthafte parlamentarische Debatte verabschiedet – viele Senatoren gestanden später, ihn nicht einmal gelesen zu haben. Senator Russ Feingold war der einzige Senator, der dagegen stimmte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was enthüllte die 9/11 Commission über die sogenannten '28 Seiten' des Joint Congressional Inquiry-Berichts, die erst 2016 declassifiziert wurden?",
        answerA = "CIA-Fehler bei der Weitergabe von Informationen über die Attentäter an das FBI",
        answerB = "Verbindungen zwischen saudischen Regierungsbeamten und -staatsbürgern und den 9/11-Entführern",
        answerC = "NSA-Abhörprotokolle, die auf pakistanischen Geheimdienst als Mitorganisator hinwiesen",
        answerD = "Pentagon-Pläne für einen Angriff auf den Irak, die bereits vor dem 11. September existierten",
        correctAnswer = 1,
        explanation = "Die 2016 freigegebenen 28 Seiten dokumentierten Verbindungen zwischen saudischen Regierungsmitarbeitern (u.a. Omar al-Bayoumi, möglicherweise ein Saudi-Geheimdienstler) und zwei Attentätern in San Diego. Die saudische Regierung bestritt jede offizielle Beteiligung.",
        difficulty = 4,
        funFact = "Trotz der brisanten Verbindungen kam die 9/11 Commission zu dem Schluss, dass kein Beweis für eine offizielle saudische Regierungsfinanzierung von al-Qaida vorlag. Kritiker wie Senator Bob Graham, der den Congressional Inquiry leitete, nannten diese Schlussfolgerung eine 'Whitewash'."
    ),

    // --- Additional Expert Questions ---

    Question(
        categoryId = 3,
        questionText = "Welcher Begriff bezeichnete die sowjetische Politik der heimlichen Umsiedlung von Völkern unter Stalin, und welches Volk wurde 1944 komplett aus der Krim deportiert?",
        answerA = "Rasselumsiedlung – Wolgadeutsche",
        answerB = "Zwangsmigration – Krimtataren",
        answerC = "Bevölkerungstransfer – Tschetschenen",
        answerD = "Völkerdeportation – Inguschen",
        correctAnswer = 1,
        explanation = "Im Mai 1944 deportierte Stalin innerhalb von drei Tagen die gesamte krimtatarische Bevölkerung (etwa 190.000 Menschen) nach Zentralasien – angeblich als Kollektivstrafe für Kollaboration mit den Deutschen. Schätzungen zufolge starben dabei 18–46% der Deportierten.",
        difficulty = 4,
        funFact = "Die Krimtataren wurden erst 1989 unter Gorbatschow offiziell rehabilitiert. Nach ihrer Rückkehr auf die Krim blieben sie eine Minderheit – und nach der russischen Annexion 2014 wurden ihre Medien und Institutionen erneut unterdrückt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Abkommen von 1938, das Großbritannien, Frankreich, Deutschland und Italien schlossen, wird als Höhepunkt der Appeasement-Politik bezeichnet, und wer war der britische Unterhändler?",
        answerA = "Berchtesgadener Abkommen – Lord Halifax",
        answerB = "Münchner Abkommen – Neville Chamberlain",
        answerC = "Bad Godesberger Memorandum – Winston Churchill",
        answerD = "Anglo-Deutsches Flottenabkommen – Samuel Hoare",
        correctAnswer = 1,
        explanation = "Das Münchner Abkommen vom 29./30. September 1938 überließ das Sudetenland Deutschland. Neville Chamberlain kehrte mit seinem berühmten Papierschnipsel nach London zurück und verkündete 'Frieden für unsere Zeit'. Die Tschechoslowakei war nicht eingeladen worden.",
        difficulty = 4,
        funFact = "Chamberlain war so euphorisch, dass er Hitler nach München einlud und eine zusätzliche bilaterale Erklärung unterzeichnete, in der beide Länder bekundeten, 'niemals wieder gegeneinander Krieg zu führen'. Hitler betrachtete dieses Dokument als wertlos."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches war das erste Gipfeltreffen zwischen einem US-Präsidenten und einem sowjetischen Führer, und welche Vereinbarung wurde dabei getroffen?",
        answerA = "Teheran 1943 (Roosevelt-Stalin) – Eröffnung der Zweiten Front",
        answerB = "Genf 1955 (Eisenhower-Chruschtschow) – Open Skies-Vorschlag",
        answerC = "Wien 1961 (Kennedy-Chruschtschow) – Berlin-Status",
        answerD = "Glassboro 1967 (Johnson-Kossygin) – Nonproliferationsvertrag",
        correctAnswer = 1,
        explanation = "Der Genfer Gipfel vom Juli 1955 war das erste Treffen eines US-Präsidenten mit einem sowjetischen Führer seit Potsdam 1945. Eisenhower schlug die 'Open Skies'-Initiative vor (gegenseitige Überflugrechte zur Rüstungskontrolle), die die Sowjets ablehnten.",
        difficulty = 4,
        funFact = "Obwohl der Genfer Gipfel keine konkreten Abkommen brachte, schuf er den so genannten 'Geist von Genf' – eine vorübergehende Entspannung, die allerdings nur wenige Monate hielt. Der Ungarn-Aufstand und die Suez-Krise 1956 beendeten jede Illusionen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Begriff beschreibt die US-Strategie unter Dulles/Eisenhower, die über die bloße Eindämmung (Containment) hinausging und die Befreiung der unter sowjetischer Kontrolle stehenden Völker forderte?",
        answerA = "Liberation Policy (Rollback)",
        answerB = "Massive Retaliation",
        answerC = "Flexible Response",
        answerD = "Brinkmanship",
        correctAnswer = 0,
        explanation = "Die Liberation Policy (auch 'Rollback' genannt) wurde von Außenminister John Foster Dulles propagiert und versprach aktive Unterstützung für Aufstände hinter dem Eisernen Vorhang. Beim Ungarn-Aufstand 1956 zeigte sich, dass es reines Wortgeklingel war – die USA griffen nicht ein.",
        difficulty = 4,
        funFact = "Radio Free Europe, das vom CIA finanziert wurde, sendete Botschaften nach Ungarn, die andeuteten, westliche Hilfe sei unterwegs. Als 1956 keine Hilfe kam, hatten die Ungarn das Gefühl, vom Westen betrogen worden zu sein – ein Trauma, das jahrzehntelang nachwirkte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ergebnis hatte der Volksaufstand vom 17. Juni 1953 in der DDR, der von sowjetischen Panzern niedergeschlagen wurde?",
        answerA = "Über 55 Todesopfer, rund 15.000 Verhaftungen, keine politischen Reformen",
        answerB = "Sturz von DDR-Staatschef Pieck, vorübergehende Liberalisierung",
        answerC = "Abzug sowjetischer Truppen aus Berlin, Übergabe an DDR-Volkspolizei",
        answerD = "Westdeutsche Intervention, die Teilung Berlins verhinderte",
        correctAnswer = 0,
        explanation = "Der Aufstand vom 17. Juni 1953 – ausgelöst durch erhöhte Arbeitsnormen – wurde von sowjetischen Panzern niedergeschlagen. Etwa 55–80 Menschen starben, rund 15.000 wurden verhaftet. Politische Reformen fanden nicht statt; SED-Chef Ulbricht festigte sogar seine Macht.",
        difficulty = 4,
        funFact = "Brecht schrieb nach dem Aufstand sein berühmtes satirisches Gedicht: 'Das Volk hatte das Vertrauen der Regierung verscherzt. Wäre es da nicht doch einfacher, die Regierung löste das Volk auf und wählte ein anderes?' – ein Text, den er nie veröffentlichte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Gremium innerhalb des al-Qaida-Netzwerks traf strategische Entscheidungen, und welcher Codename bezeichnete Bin Ladens persönlichen Sicherheitsapparat?",
        answerA = "Shura-Rat (Majlis al-Shura) – Codename: al-Qaeda al-Sulbah",
        answerB = "Fatwa-Komitee – Codename: Base-Network",
        answerC = "Militärrat – Codename: Harakat al-Muqawama",
        answerD = "Bay'at-Kommission – Codename: Tanzim al-Jihad",
        correctAnswer = 0,
        explanation = "Der Shura-Rat (Beratungsrat) war das oberste strategische Gremium von al-Qaida. Der Begriff 'al-Qaeda al-Sulbah' ('die feste Basis') bezeichnete ursprünglich Bin Ladens Netzwerk aus Veteranen des Afghanistan-Kriegs.",
        difficulty = 4,
        funFact = "Der Begriff 'al-Qaida' (arabisch: die Basis) war ursprünglich kein Eigenname der Organisation, sondern ein beschreibender Begriff für eine Datenbank von Mujahideen-Kämpfern aus dem Afghanistan-Krieg. US-Geheimdienste übernahmen ihn und machten ihn zum Markennamen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Projekt des US-Kongresses wurde 1975 durch den Church Committee aufgedeckt und enthüllte, dass die CIA Pläne zur Ermordung ausländischer Staatschefs entwickelt hatte?",
        answerA = "Operation Mongoose",
        answerB = "Operation ZR/RIFLE",
        answerC = "Operation CHAOS",
        answerD = "Operation ARTICHOKE",
        correctAnswer = 1,
        explanation = "Operation ZR/RIFLE war das CIA-Programm für politische Attentate, das u.a. Mordpläne gegen Fidel Castro, Patrice Lumumba (Kongo), Rafael Trujillo (Dom. Rep.) und andere enthielt. Der Church Committee deckte das Programm 1975 auf.",
        difficulty = 4,
        funFact = "Die CIA unternahm mindestens 8 bekannte Versuche, Castro zu töten – mit explodierenden Zigarren, vergifteten Tauchanzügen, Schellackpillen in seinen Schuhen und Zusammenarbeit mit der Mafia. Alle scheiterten. Castro überlebte bis 2016 und starb im Bett."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches SALT-II-Abkommen von 1979 wurde von Präsident Carter dem Senat zur Ratifikation entzogen, und was war der unmittelbare Anlass?",
        answerA = "Die sowjetische Invasion in Afghanistan im Dezember 1979",
        answerB = "Die iranische Geiselnahme und der Sturm auf die US-Botschaft",
        answerC = "Der Aufstand in Polen und die drohende sowjetische Intervention",
        answerD = "Die Entdeckung sowjetischer Kampftruppen auf Kuba",
        correctAnswer = 0,
        explanation = "SALT II war im Juni 1979 unterzeichnet worden, aber als sowjetische Truppen im Dezember 1979 in Afghanistan einmarschierten, zog Carter den Vertrag aus dem Ratifikationsverfahren zurück. Dennoch hielten sich beide Seiten informell lange an die Obergrenzen.",
        difficulty = 4,
        funFact = "Reagan bezeichnete SALT II als 'fatally flawed' und weigerte sich zunächst, es zu ratifizieren. Trotzdem hielten sich die USA bis 1986 de facto an die Grenzen – bis Reagan ankündigte, das Abkommen nicht mehr einzuhalten, als die UdSSR nach seiner Meinung dagegen verstieß."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Begriff bezeichnete die bewusste Strategie der Reagan-Administration, die Sowjetunion wirtschaftlich durch einen Rüstungswettlauf zu ruinieren, der von SDI (Strategic Defense Initiative) angeführt wurde?",
        answerA = "Economic Warfare Doctrine",
        answerB = "NSDD-75 (Direct Competition Strategy)",
        answerC = "Reagan Doctrine",
        answerD = "Competitive Strategy",
        correctAnswer = 1,
        explanation = "NSDD-75 (National Security Decision Directive) von 1983 legte explizit fest, die Sowjetunion nicht nur einzudämmen, sondern ihr System intern zu verändern und sie wirtschaftlich zu überfordern. SDI war ein Kernstück, weil es die Sowjets zur teuren Gegenrüstung zwingen sollte.",
        difficulty = 4,
        funFact = "Egon Bahr nannte SDI 'Star Wars' – und dieser Spitzname haftete. Gorbatschow war so beunruhigt von SDI, dass er beim Reykjavik-Gipfel 1986 anbot, alle nuklearen Waffen abzuschaffen – wenn Reagan SDI aufgäbe. Reagan lehnte ab und gab damit möglicherweise die größte Abrüstungschance des Kalten Krieges auf."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches historische Datum markierte das formelle Ende der Sowjetunion, und welcher Akt symbolisierte dies am deutlichsten?",
        answerA = "25. Dezember 1991 – Gorbatschow tritt zurück und die sowjetische Flagge über dem Kreml wird durch die russische ersetzt",
        answerB = "19. August 1991 – Scheitern des Augustputsches",
        answerC = "8. Dezember 1991 – Unterzeichnung der Belavezha-Abkommen durch Russland, Ukraine und Weißrussland",
        answerD = "21. Dezember 1991 – Unterzeichnung der Alma-Ata-Deklaration durch 11 Republiken",
        correctAnswer = 0,
        explanation = "Am 25. Dezember 1991 um 19:32 Uhr Moskauer Zeit unterzeichnete Gorbatschow seine Rücktrittserklärung und übertrug die Nuklearcodes an Jelzin. Kurz darauf wurde die sowjetische Flagge vom Kreml eingeholt und durch die russische Trikolore ersetzt.",
        difficulty = 4,
        funFact = "Gorbatschow erfuhr vom Beschluss, die UdSSR aufzulösen, aus dem Fernsehen – Jelzin hatte ihn nicht einmal informiert, bevor er die Belavezha-Abkommen unterzeichnete. Das war eine bewusste Demütigung, die das persönliche Verhältnis beider Männer dauerhaft vergiftete."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Vertragsklausel des Daytoner Abkommens (1995) schuf die Grundlage für die Verfassungsstruktur Bosnien-Herzegowinas mit zwei Entitäten und drei Staatsvölkern?",
        answerA = "Annex 4 (Verfassung von Bosnien und Herzegowina)",
        answerB = "Annex 6 (Menschenrechte)",
        answerC = "Annex 10 (zivile Implementierung)",
        answerD = "Annex 1-A (militärische Aspekte)",
        correctAnswer = 0,
        explanation = "Annex 4 des Daytoner Abkommens enthielt die neue Verfassung Bosnien-Herzegowinas: Zwei Entitäten (Republika Srpska mit 49%, Föderación Bosnien-Herzegowina mit 51%) und drei konstitutive Völker (Bosniaken, Serben, Kroaten) mit komplexen Machtaufteilungsregeln.",
        difficulty = 4,
        funFact = "Die Verfassung Bosniens wurde buchstäblich im Nachtzug von Wright-Patterson Air Force Base (Ohio) geschrieben – in 21 Verhandlungstagen im November 1995. Der US-Chefunterhändler Richard Holbrooke bezeichnete den Vertrag später selbst als 'fehlerhaft, aber notwendig'."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches UN-Tribunal wurde 1993 als erstes internationales Straftribunal seit Nürnberg gegründet, um Kriegsverbrechen im ehemaligen Jugoslawien zu verfolgen?",
        answerA = "International Criminal Tribunal for the former Yugoslavia (ICTY) – Sitz Den Haag",
        answerB = "International War Crimes Commission for Yugoslavia – Sitz Genf",
        answerC = "UN Special Court for the Balkans – Sitz Brüssel",
        answerD = "International Military Tribunal Yugoslavia – Sitz Wien",
        correctAnswer = 0,
        explanation = "Der Internationale Strafgerichtshof für das ehemalige Jugoslawien (ICTY) wurde durch UN-Resolution 827 am 25. Mai 1993 gegründet. Er war das erste internationale Straftribunal nach Nürnberg (1945) und Tokio (1946).",
        difficulty = 4,
        funFact = "Slobodan Milošević war der erste amtierende bzw. ehemalige Staatschef, der vor einem internationalen Gericht angeklagt wurde. Er starb jedoch 2006 in seiner Zelle in Den Haag, bevor das Urteil gesprochen werden konnte – nach vier Jahren Prozess."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher geheime Vertrag zwischen der Sowjetunion und Deutschland vom August 1939 enthielt ein geheimes Protokoll zur Aufteilung Osteuropas in Einflusssphären?",
        answerA = "Ribbentrop-Molotow-Pakt (Hitler-Stalin-Pakt)",
        answerB = "Anti-Komintern-Pakt",
        answerC = "Dreimächtepakt",
        answerD = "Berliner Vertrag",
        correctAnswer = 0,
        explanation = "Der Ribbentrop-Molotow-Pakt (23. August 1939) enthielt ein geheimes Zusatzprotokoll: Polen wurde zwischen Deutschland und der UdSSR aufgeteilt, Finnland, Estland, Lettland und Bessarabien der sowjetischen Einflusssphäre zugesprochen, Litauen der deutschen.",
        difficulty = 4,
        funFact = "Die Sowjetunion leugnete die Existenz des geheimen Protokolls jahrzehntelang. Erst im August 1989 – dem 50. Jahrestag des Pakts – erkannte Gorbatschow offiziell an, dass das Protokoll existiert hatte. Drei baltische Demonstranten bildeten zu diesem Anlass eine Menschenkette von Tallinn bis Wilna."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches war die einzige Atombombe, die im Zweiten Weltkrieg eine städtische Bevölkerung traf, ohne den Primärziel-Befehl zu befolgen – und warum?",
        answerA = "Nagasaki – wegen Bewölkung über dem Primärziel Kokura wurde auf Nagasaki ausgewichen",
        answerB = "Hiroshima – wegen technischer Probleme wurde statt Kure auf Hiroshima gezielt",
        answerC = "Tokio – wegen Sturmwarnung wurde auf ein alternatives Ziel ausgewichen",
        answerD = "Osaka – das Primärziel Kyoto wurde von Kriegsminister Stimson persönlich gestrichen",
        correctAnswer = 0,
        explanation = "Am 9. August 1945 war Kokura das Primärziel für 'Fat Man'. Dichte Bewölkung und Rauch von Yawata-Bränden verhinderten die Sicht. Nach drei Überflügen drehte Pilote Bock nach Nagasaki ab, wo eine Wolkenlücke den Abwurf ermöglichte.",
        difficulty = 4,
        funFact = "Die Bewohner Kokuras nannten dies später ihre 'Kokura-Glück' (Kokura no Kōun). Kyoto wurde vom Kriegsminister Henry Stimson persönlich von der Zielliste gestrichen – er war in Kyoto auf Hochzeitsreise gewesen und schätzte die kulturelle Bedeutung der Stadt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches internationale Abkommen von 1994 garantierte der Ukraine Sicherheitszusagen im Austausch für die Aufgabe ihres nuklearen Arsenals – des drittgrößten der Welt?",
        answerA = "Budapester Memorandum – unterzeichnet von USA, Großbritannien und Russland",
        answerB = "Lissabonner Protokoll – unterzeichnet von USA, Russland und Belarus",
        answerC = "Minsker Abkommen – unterzeichnet von USA, Frankreich und Russland",
        answerD = "Kyiv Declaration – unterzeichnet von allen NATO-Mitgliedern",
        correctAnswer = 0,
        explanation = "Das Budapester Memorandum (1994) verpflichtete die USA, Großbritannien und Russland, die territoriale Integrität und Souveränität der Ukraine zu respektieren und sie nicht militärisch zu bedrohen, als Gegenleistung für die Übergabe von 1.900 strategischen Nuklearsprengköpfen.",
        difficulty = 4,
        funFact = "Als Russland 2014 die Krim annektierte, war das Budapester Memorandum wertlos. Die USA und Großbritannien lehnten eine militärische Beistandspflicht ab – es handelte sich nur um 'Sicherheitszusagen', nicht um verbindliche Garantien. Dieses Precedent beunruhigte seither alle nicht-nuklearen Staaten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Doktrin verkündete US-Präsident Truman 1947 vor dem Kongress, die den Grundstein der US-amerikanischen Containment-Politik legte?",
        answerA = "Truman-Doktrin: USA unterstützen freie Völker gegen kommunistische Unterwerfung – ausgelöst durch die Krise in Griechenland und der Türkei",
        answerB = "Marshall-Doktrin: wirtschaftliche Hilfe für Europa als Bollwerk gegen den Kommunismus",
        answerC = "NSC-68-Doktrin: massiver Ausbau des US-Militärs als Antwort auf die sowjetische Atombombe",
        answerD = "Kennan-Doktrin: diplomatische Eindämmung ohne militärisches Engagement",
        correctAnswer = 0,
        explanation = "In seiner Rede vor dem Kongress am 12. März 1947 erklärte Truman, die USA würden freie Völker unterstützen, die sich kommunistischer Unterwerfung widersetzten. Konkreter Anlass: Großbritannien konnte seine Unterstützung für Griechenland und die Türkei nicht mehr finanzieren.",
        difficulty = 4,
        funFact = "George Kennan, der Architekt der Containment-Strategie in seinem 'Long Telegram' (1946) und X-Artikel (1947), war entsetzt über die militaristische Auslegung seiner Ideen durch die Truman-Doktrin. Er hatte eine politisch-diplomatische Eindämmung gemeint, keine globale Militärpräsenz."
    ),

)
