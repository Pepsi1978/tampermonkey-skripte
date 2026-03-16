package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestions(): List<Question> = listOf(

    // --- EASY (10 questions) ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr begann der Erste Weltkrieg?",
        answerA = "1912",
        answerB = "1914",
        answerC = "1916",
        answerD = "1918",
        correctAnswer = 1,
        explanation = "Der Erste Weltkrieg begann am 28. Juli 1914 mit der Kriegserklärung Österreich-Ungarns an Serbien.",
        difficulty = 1,
        funFact = "Der Auslöser war das Attentat auf Erzherzog Franz Ferdinand in Sarajevo am 28. Juni 1914."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der erste Kaiser des Deutschen Reiches (1871)?",
        answerA = "Otto von Bismarck",
        answerB = "Friedrich III.",
        answerC = "Wilhelm I.",
        answerD = "Wilhelm II.",
        correctAnswer = 2,
        explanation = "Wilhelm I. wurde am 18. Januar 1871 im Spiegelsaal von Versailles zum ersten deutschen Kaiser ausgerufen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Stadt war die Hauptstadt des Dritten Reiches?",
        answerA = "München",
        answerB = "Hamburg",
        answerC = "Nürnberg",
        answerD = "Berlin",
        correctAnswer = 3,
        explanation = "Berlin war die Hauptstadt des Deutschen Reiches und während der NS-Zeit das politische Zentrum des Dritten Reiches.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Wann fiel die Berliner Mauer?",
        answerA = "3. Oktober 1990",
        answerB = "9. November 1989",
        answerC = "1. September 1989",
        answerD = "12. August 1961",
        correctAnswer = 1,
        explanation = "Am 9. November 1989 öffnete die DDR ihre Grenzen, was zum Fall der Berliner Mauer führte.",
        difficulty = 1,
        funFact = "Die Mauer war seit dem 13. August 1961 in Betrieb – insgesamt 28 Jahre lang."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war Christoph Kolumbus?",
        answerA = "Ein portugiesischer König",
        answerB = "Ein spanischer Feldherr",
        answerC = "Ein genuesischer Seefahrer im Dienst Spaniens",
        answerD = "Ein englischer Entdecker",
        correctAnswer = 2,
        explanation = "Christoph Kolumbus war ein genuesischer Seefahrer, der 1492 im Auftrag der spanischen Krone Amerika entdeckte.",
        difficulty = 1,
        funFact = "Kolumbus glaubte bis zu seinem Tod, er habe Asien erreicht, nicht einen neuen Kontinent."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Reich errichtete Julius Cäsar?",
        answerA = "Das Byzantinische Reich",
        answerB = "Das Römische Reich",
        answerC = "Das Griechische Reich",
        answerD = "Das Osmanische Reich",
        correctAnswer = 1,
        explanation = "Julius Cäsar war eine Schlüsselfigur bei der Umwandlung der Römischen Republik in das Römische Kaiserreich.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr endete der Zweite Weltkrieg in Europa?",
        answerA = "1943",
        answerB = "1944",
        answerC = "1945",
        answerD = "1946",
        correctAnswer = 2,
        explanation = "Der Zweite Weltkrieg in Europa endete am 8. Mai 1945 mit der bedingungslosen Kapitulation Deutschland.",
        difficulty = 1,
        funFact = "In Russland wird der 9. Mai als Tag des Sieges gefeiert, da die Kapitulationsurkunde nach Mitternacht Moskauer Zeit unterzeichnet wurde."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war Napoleon Bonaparte?",
        answerA = "Ein englischer Admiral",
        answerB = "Ein österreichischer Kaiser",
        answerC = "Ein französischer Kaiser und Feldherr",
        answerD = "Ein russischer Zar",
        correctAnswer = 2,
        explanation = "Napoleon Bonaparte war ein französischer General, der sich 1804 zum Kaiser krönte und weite Teile Europas eroberte.",
        difficulty = 1,
        funFact = "Napoleon war nicht besonders klein – er maß etwa 1,69 m, was für seine Zeit durchschnittlich war."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Magna Carta?",
        answerA = "Ein Vertrag zwischen England und Frankreich",
        answerB = "Ein englisches Rechtsdokument von 1215",
        answerC = "Eine päpstliche Verkündigung",
        answerD = "Die erste englische Verfassung",
        correctAnswer = 1,
        explanation = "Die Magna Carta war ein 1215 von König Johann ohne Land unterzeichnetes Dokument, das die königliche Macht einschränkte.",
        difficulty = 1,
        funFact = "Nur vier Originalkopien der Magna Carta sind erhalten geblieben."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Zivilisation baute die Pyramiden von Gizeh?",
        answerA = "Die Griechen",
        answerB = "Die Sumerer",
        answerC = "Die alten Ägypter",
        answerD = "Die Römer",
        correctAnswer = 2,
        explanation = "Die Pyramiden von Gizeh wurden von den alten Ägyptern erbaut, die größte um 2560 v. Chr. für Pharao Cheops.",
        difficulty = 1,
        funFact = "Die Große Pyramide von Gizeh war etwa 3800 Jahre lang das höchste Bauwerk der Welt."
    ),

    // --- MEDIUM (15 questions) ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr wurde das Heilige Römische Reich Deutscher Nation aufgelöst?",
        answerA = "1789",
        answerB = "1800",
        answerC = "1806",
        answerD = "1815",
        correctAnswer = 2,
        explanation = "Das Heilige Römische Reich Deutscher Nation wurde am 6. August 1806 aufgelöst, als Kaiser Franz II. abdankte.",
        difficulty = 2,
        funFact = "Voltaire bemerkte spöttisch, es sei weder heilig, noch römisch, noch ein Reich."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Vertrag beendete den Dreißigjährigen Krieg?",
        answerA = "Vertrag von Utrecht",
        answerB = "Westfälischer Friede",
        answerC = "Vertrag von Paris",
        answerD = "Friede von Augsburg",
        correctAnswer = 1,
        explanation = "Der Westfälische Friede von 1648 beendete den Dreißigjährigen Krieg und legte Grundlagen des modernen Staatensystems.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Revolution brach 1789 in Frankreich aus?",
        answerA = "Die Bourgeoisie-Revolution",
        answerB = "Die Industrielle Revolution",
        answerC = "Die Französische Revolution",
        answerD = "Die Glorreiche Revolution",
        correctAnswer = 2,
        explanation = "Die Französische Revolution begann 1789 und beendete die absolute Monarchie. Sie führte zur Republik und zu Napoleons Aufstieg.",
        difficulty = 2,
        funFact = "Das Motto der Revolution – Liberté, Égalité, Fraternité – ist bis heute das Nationalwahrzeichen Frankreichs."
    ),

    Question(
        categoryId = 3,
        questionText = "Wann wurde die DDR (Deutsche Demokratische Republik) gegründet?",
        answerA = "1945",
        answerB = "1947",
        answerC = "1949",
        answerD = "1952",
        correctAnswer = 2,
        explanation = "Die DDR wurde am 7. Oktober 1949 in der sowjetischen Besatzungszone Deutschlands gegründet.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher englische König wurde 1649 hingerichtet?",
        answerA = "Heinrich VIII.",
        answerB = "Karl I.",
        answerC = "Jakob I.",
        answerD = "Richard II.",
        correctAnswer = 1,
        explanation = "Karl I. wurde am 30. Januar 1649 nach dem englischen Bürgerkrieg auf Beschluss des Parlaments hingerichtet.",
        difficulty = 2,
        funFact = "Es war das erste Mal in der Geschichte, dass ein englischer König öffentlich hingerichtet wurde."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis löste den Ersten Weltkrieg unmittelbar aus?",
        answerA = "Die Invasion Belgiens durch Deutschland",
        answerB = "Das Attentat auf Erzherzog Franz Ferdinand",
        answerC = "Die Mobilmachung Russlands",
        answerD = "Der Angriff Österreichs auf Serbien",
        correctAnswer = 1,
        explanation = "Das Attentat auf Erzherzog Franz Ferdinand in Sarajevo am 28. Juni 1914 war der unmittelbare Auslöser des Ersten Weltkriegs.",
        difficulty = 2,
        funFact = "Der Attentäter Gavrilo Princip war 19 Jahre alt und Mitglied der serbischen Nationalistenbewegung Schwarze Hand."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Schlachtformation machte Alexander der Große berühmt?",
        answerA = "Die Testudo-Formation",
        answerB = "Die Phalanx",
        answerC = "Die Cohors",
        answerD = "Die Schildwall-Formation",
        correctAnswer = 1,
        explanation = "Die makedonische Phalanx, mit langen Speeren (Sarissa) bewaffnet, war Alexanders wichtigste Kampfformation.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Marshall-Plan?",
        answerA = "Ein Militärbündnis nach dem Zweiten Weltkrieg",
        answerB = "Ein US-amerikanisches Wirtschaftshilfeprogramm für Europa",
        answerC = "Ein Friedensvertrag zwischen den USA und der UdSSR",
        answerD = "Ein NATO-Verteidigungsplan",
        correctAnswer = 1,
        explanation = "Der Marshall-Plan (1948–1952) war ein US-Programm zur wirtschaftlichen Unterstützung Europas nach dem Zweiten Weltkrieg.",
        difficulty = 2,
        funFact = "Deutschland erhielt etwa 1,4 Milliarden Dollar aus dem Marshall-Plan – damals eine enorme Summe."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Land war das erste, das Frauen das Wahlrecht einräumte?",
        answerA = "Australien",
        answerB = "Schweden",
        answerC = "Neuseeland",
        answerD = "Finnland",
        correctAnswer = 2,
        explanation = "Neuseeland war 1893 das erste Land der Welt, das Frauen das Wahlrecht gewährte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Stadt war das Zentrum der Hanse?",
        answerA = "Hamburg",
        answerB = "Bremen",
        answerC = "Lübeck",
        answerD = "Rostock",
        correctAnswer = 2,
        explanation = "Lübeck war als 'Königin der Hanse' das führende Mitglied und Versammlungsort des Hansebundes.",
        difficulty = 2,
        funFact = "Auf dem Höhepunkt ihrer Macht umfasste die Hanse über 200 Städte von London bis Nowgorod."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Vertrag beendete offiziell den Ersten Weltkrieg?",
        answerA = "Vertrag von Brest-Litowsk",
        answerB = "Vertrag von Versailles",
        answerC = "Vertrag von Saint-Germain",
        answerD = "Londoner Vertrag",
        correctAnswer = 1,
        explanation = "Der Vertrag von Versailles, unterzeichnet am 28. Juni 1919, beendete offiziell den Ersten Weltkrieg.",
        difficulty = 2,
        funFact = "Deutschland musste im Versailler Vertrag die alleinige Kriegsschuld (Artikel 231) akzeptieren."
    ),

    Question(
        categoryId = 3,
        questionText = "Wann fand die Oktoberrevolution in Russland statt?",
        answerA = "1905",
        answerB = "1915",
        answerC = "1917",
        answerD = "1920",
        correctAnswer = 2,
        explanation = "Die Oktoberrevolution fand im Oktober/November 1917 statt und brachte die Bolschewiki unter Lenin an die Macht.",
        difficulty = 2,
        funFact = "Nach dem julianischen Kalender fand sie im Oktober statt, nach dem gregorianischen Kalender war es November – daher 'Oktoberrevolution'."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis markierte den Beginn des Zweiten Weltkriegs?",
        answerA = "Der japanische Angriff auf Pearl Harbor",
        answerB = "Die Besetzung Österreichs durch Deutschland",
        answerC = "Der deutsche Überfall auf Polen",
        answerD = "Die Kriegserklärung Frankreichs an Deutschland",
        correctAnswer = 2,
        explanation = "Am 1. September 1939 überfiel Deutschland Polen, was den Beginn des Zweiten Weltkriegs markierte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Wer führte die Mongolen zu ihrer größten Machtentfaltung?",
        answerA = "Kublai Khan",
        answerB = "Dschingis Khan",
        answerC = "Timur Lenk",
        answerD = "Ögedei Khan",
        correctAnswer = 1,
        explanation = "Dschingis Khan gründete das Mongolische Reich und wurde zu einem der mächtigsten Herrscher der Geschichte.",
        difficulty = 2,
        funFact = "Das Mongolische Reich war flächenmäßig das größte zusammenhängende Landimperium aller Zeiten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher deutsche Kanzler trieb die Wiedervereinigung Deutschlands 1990 voran?",
        answerA = "Willy Brandt",
        answerB = "Helmut Schmidt",
        answerC = "Gerhard Schröder",
        answerD = "Helmut Kohl",
        correctAnswer = 3,
        explanation = "Helmut Kohl trieb als Bundeskanzler die deutsche Wiedervereinigung voran, die am 3. Oktober 1990 vollzogen wurde.",
        difficulty = 2,
        funFact = "Kohl wurde später als 'Kanzler der Einheit' bezeichnet."
    ),

    // --- HARD (12 questions) ---

    Question(
        categoryId = 3,
        questionText = "Welche Schiffe versenkten die Deutschen im Ersten Weltkrieg, was den USA fast den Kriegseintritt kostete?",
        answerA = "RMS Titanic",
        answerB = "SS Sussex",
        answerC = "RMS Lusitania",
        answerD = "HMS Audacious",
        correctAnswer = 2,
        explanation = "Die RMS Lusitania wurde am 7. Mai 1915 von einem deutschen U-Boot versenkt. Dabei starben 1.198 Menschen, darunter 128 US-Bürger.",
        difficulty = 3,
        funFact = "Die Versenkung der Lusitania trug wesentlich zur Kriegsstimmung in den USA bei, auch wenn der Eintritt erst 1917 erfolgte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Ems-Depesche' von 1870?",
        answerA = "Ein Telegramm, das den Deutsch-Französischen Krieg provozierte",
        answerB = "Die erste telegrafische Nachricht in Deutschland",
        answerC = "Ein diplomatisches Ultimatum Frankreichs",
        answerD = "Die Kriegserklärung Preußens an Österreich",
        correctAnswer = 0,
        explanation = "Bismarck redigierte die Ems-Depesche, um Frankreich zu einer Kriegserklärung zu provozieren, die zum Deutsch-Französischen Krieg 1870/71 führte.",
        difficulty = 3,
        funFact = "Bismarck sagte later, er habe die Depesche 'dem Stier ein rotes Tuch gezeigt'."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Dolchstoßlegende' in der Weimarer Republik?",
        answerA = "Eine Verschwörungstheorie, die Juden und Linke für Deutschlands Niederlage im WWI verantwortlich machte",
        answerB = "Ein militärischer Angriff auf die deutsche Heimat",
        answerC = "Eine Propaganda-Kampagne der Alliierten",
        answerD = "Ein Attentat auf Kaiser Wilhelm II.",
        correctAnswer = 0,
        explanation = "Die Dolchstoßlegende behauptete, Deutschland sei im Ersten Weltkrieg nicht militärisch besiegt worden, sondern von innen 'erdolcht'.",
        difficulty = 3,
        funFact = "Die Legende wurde intensiv von den Nationalsozialisten instrumentalisiert, um Hass auf die Weimarer Republik zu schüren."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Bedeutung hatte die Schlacht von Sedan 1870?",
        answerA = "Sie besiegelte die Niederlage Napoleons I.",
        answerB = "Sie führte zur Gefangennahme von Kaiser Napoleon III. und dem Ende des Zweiten Kaiserreichs",
        answerC = "Sie war die erste bedeutende Eisenbahnschlacht der Geschichte",
        answerD = "Sie leitete die Gründung des Deutschen Kaiserreichs unmittelbar ein",
        correctAnswer = 1,
        explanation = "In der Schlacht bei Sedan am 2. September 1870 wurde Kaiser Napoleon III. gefangen genommen, was das Ende des Zweiten Kaiserreichs bedeutete.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das 'Wunder von Bern' 1954 historisch gesehen?",
        answerA = "Die erste Direktwahl des Bundespräsidenten",
        answerB = "Ein diplomatischer Erfolg der BRD bei den UN",
        answerC = "Der WM-Sieg Westdeutschlands, der als nationales Wiedergeburtssymbol gilt",
        answerD = "Die Unterzeichnung der Westeuropäischen Union",
        correctAnswer = 2,
        explanation = "Der Fußball-WM-Sieg 1954 in Bern gilt als symbolischer Neuanfang Deutschlands und nationaler Identitätspunkt der frühen BRD.",
        difficulty = 3,
        funFact = "Der Sieg über Ungarn 3:2 im Finale gegen den haushohen Favoriten gilt als eine der größten Überraschungen der WM-Geschichte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher osmanische Sultan eroberte Konstantinopel 1453?",
        answerA = "Suleiman der Prächtige",
        answerB = "Selim I.",
        answerC = "Mehmed II.",
        answerD = "Bayezid II.",
        correctAnswer = 2,
        explanation = "Mehmed II., auch 'der Eroberer' genannt, nahm 1453 Konstantinopel ein und beendete damit das Byzantinische Reich.",
        difficulty = 3,
        funFact = "Die Eroberung markierte für viele Historiker das Ende des Mittelalters."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der Lateinischen Union (Münzunion) im 19. Jahrhundert?",
        answerA = "Eine militärische Allianz lateinischsprachiger Staaten",
        answerB = "Eine Währungsunion zwischen Frankreich, Belgien, Italien, Schweiz und Griechenland",
        answerC = "Ein Handelsabkommen zwischen Südeuropa und dem Deutschen Reich",
        answerD = "Ein Bildungsprojekt zur Verbreitung des Lateinischen",
        correctAnswer = 1,
        explanation = "Die Lateinische Münzunion (1865–1927) war eine Währungsunion, die einheitliche Silber- und Goldmünzen zwischen mehreren Staaten schuf.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Rolle spielte die 'Volksfront' in Spanien in den 1930er Jahren?",
        answerA = "Sie war eine faschistische Bewegung unter Franco",
        answerB = "Sie war ein Linksbündnis, das 1936 die Wahlen gewann und den Bürgerkrieg auslöste",
        answerC = "Sie bildete die Exilregierung nach dem Bürgerkrieg",
        answerD = "Sie war eine monarchistische Partei",
        correctAnswer = 1,
        explanation = "Die Volksfront gewann 1936 die spanischen Wahlen, was Francos Militärputsch und den Spanischen Bürgerkrieg auslöste.",
        difficulty = 3,
        funFact = "Der Spanische Bürgerkrieg gilt als 'Generalprobe' für den Zweiten Weltkrieg, da Deutschland und die UdSSR darin ihre Waffen testeten."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Berliner Konferenz' von 1884/85?",
        answerA = "Die Gründungskonferenz des Deutschen Kaiserreichs",
        answerB = "Ein europäischer Kongress zur Aufteilung Afrikas unter Kolonialmächten",
        answerC = "Eine Friedenskonferenz nach dem Deutsch-Französischen Krieg",
        answerD = "Der erste internationale Kongress zur Arbeiterfrage",
        correctAnswer = 1,
        explanation = "Auf der Berliner Konferenz (1884/85) teilten die europäischen Mächte Afrika unter sich auf, ohne afrikanische Vertreter einzubeziehen.",
        difficulty = 3,
        funFact = "Diese Aufteilung legte Grenzen fest, die noch heute afrikanische Konflikte mitbedingen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Augsburger Religionsfrieden von 1555?",
        answerA = "Ein Vertrag zwischen dem Papst und dem Kaiser über Kirchenreform",
        answerB = "Ein Abkommen, das lutherischen Fürsten das Recht auf ihre Konfession garantierte",
        answerC = "Ein Friedensschluss zwischen Protestanten und Katholiken in Augsburg",
        answerD = "Die kaiserliche Erlaubnis zur Reformation in Süddeutschland",
        correctAnswer = 1,
        explanation = "Der Augsburger Religionsfrieden gewährte den Reichsfürsten das Recht, die Konfession ihres Territoriums zu bestimmen ('cuius regio, eius religio').",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Bedeutung hatte die Völkerschlacht bei Leipzig 1813?",
        answerA = "Sie beendete den Dreißigjährigen Krieg",
        answerB = "Sie war Napoleons erste bedeutende Niederlage gegen Preußen",
        answerC = "Sie war eine entscheidende Niederlage Napoleons, die seinen Rückzug aus Deutschland erzwang",
        answerD = "Sie besiegelte die Auflösung des Rheinbundes",
        correctAnswer = 2,
        explanation = "Die Völkerschlacht bei Leipzig (16.–19. Oktober 1813) war Napoleons entscheidende Niederlage, die seine Herrschaft über Deutschland beendete.",
        difficulty = 3,
        funFact = "Mit über 600.000 beteiligten Soldaten war sie bis zum Ersten Weltkrieg die größte Landschlacht der Geschichte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Neue Ostpolitik' Willy Brandts?",
        answerA = "Eine Handelspolitik mit Ostasien in den 1970ern",
        answerB = "Eine Annäherungspolitik an die Sowjetunion und Ostblockstaaten in den 1970ern",
        answerC = "Ein Militärbündnis mit Polen und der Tschechoslowakei",
        answerD = "Eine Entspannungspolitik gegenüber der DDR nach dem Mauerbau",
        correctAnswer = 1,
        explanation = "Willy Brandts Neue Ostpolitik (ab 1969) suchte Entspannung und Normalisierung mit der UdSSR, DDR, Polen und anderen Ostblockstaaten.",
        difficulty = 3,
        funFact = "Brandts Kniefall in Warschau 1970 vor dem Denkmal des Warschauer Ghettoaufstands gilt als eines der bewegendsten politischen Symbole des 20. Jahrhunderts."
    ),

    // --- EXPERT (8 questions) ---

    Question(
        categoryId = 3,
        questionText = "Was bedeutete der Begriff 'Translatio imperii' im mittelalterlichen Europa?",
        answerA = "Die Übertragung von Handelsprivilegien zwischen Fürsten",
        answerB = "Die päpstliche Übertragung der kaiserlichen Würde von den Römern auf die Franken und dann die Deutschen",
        answerC = "Der Übergang des Kaisertitels vom Oströmischen auf das Weströmische Reich",
        answerD = "Die Vererbung von Reichsgebieten durch Heirat",
        correctAnswer = 1,
        explanation = "Translatio imperii beschreibt die Theorie, dass die römische Kaiserwürde auf Karl den Großen und dann auf die deutschen Kaiser übertragen wurde.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Rolle spielte das 'Zimmermannsche Telegramm' im Ersten Weltkrieg?",
        answerA = "Es war ein deutsches Friedensangebot an Wilson",
        answerB = "Es war eine verschlüsselte Botschaft, in der Deutschland Mexiko ein Kriegsbündnis gegen die USA anbot",
        answerC = "Es enthielt den deutschen Plan für den U-Boot-Krieg",
        answerD = "Es war Deutschlands Kriegserklärung an die USA",
        correctAnswer = 1,
        explanation = "Das Zimmermann-Telegramm (Januar 1917) war eine deutsche Geheimbotschaft, die Mexiko im Gegenzug für ein Bündnis gegen die USA texanisches, arizonianisches und New Mexico-Territorium anbot.",
        difficulty = 4,
        funFact = "Die Entschlüsselung durch den britischen Geheimdienst und die anschließende Veröffentlichung beschleunigte den US-Kriegseintritt erheblich."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter dem 'Ancien Régime' in Frankreich?",
        answerA = "Die Regierung Napoleons III. nach 1852",
        answerB = "Die konstitutionelle Monarchie nach 1791",
        answerC = "Das politische und soziale System Frankreichs vor der Revolution von 1789",
        answerD = "Die Adelsherrschaft nach der Restauration 1815",
        correctAnswer = 2,
        explanation = "Das Ancien Régime bezeichnet das politische, soziale und wirtschaftliche System Frankreichs vor der Revolution, geprägt von absolutistischer Monarchie und Ständegesellschaft.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der 'Haager Landkriegsordnung' von 1907?",
        answerA = "Sie gründete den Ständigen Schiedshof in Den Haag",
        answerB = "Sie kodifizierte erstmals internationale Regeln für die Kriegsführung und den Schutz von Zivilisten",
        answerC = "Sie verbot den Einsatz chemischer Waffen in Kriegen",
        answerD = "Sie regelte die Seeschifffahrt während Kriegen",
        correctAnswer = 1,
        explanation = "Die Haager Landkriegsordnung von 1907 kodifizierte Regeln für die Kriegsführung, den Schutz von Kriegsgefangenen und der Zivilbevölkerung.",
        difficulty = 4,
        funFact = "Sie bildete die Grundlage für die späteren Genfer Konventionen und das moderne humanitäre Völkerrecht."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Kapp-Putsch' von 1920?",
        answerA = "Ein kommunistischer Aufstand in Bayern",
        answerB = "Ein rechtsextremer Putschversuch in Berlin gegen die Weimarer Republik",
        answerC = "Eine Meuterei der Reichsmarine in Kiel",
        answerD = "Ein separatistischer Aufstand im Rheinland",
        correctAnswer = 1,
        explanation = "Der Kapp-Putsch (März 1920) war ein rechtsextremer Putschversuch gegen die Weimarer Republik, der durch einen Generalstreik scheiterte.",
        difficulty = 4,
        funFact = "Es war das erste Mal in der Geschichte, dass ein Generalstreik einen Staatsstreich erfolgreich verhinderte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Sykes-Picot-Vereinbarung' von 1916?",
        answerA = "Ein Waffenstillstand zwischen Russland und dem Osmanischen Reich",
        answerB = "Ein geheimes Abkommen zwischen Großbritannien und Frankreich zur Aufteilung des Nahen Ostens",
        answerC = "Ein Friedensangebot der Mittelmächte an die Entente",
        answerD = "Eine britisch-französische Militärstrategie gegen die Osmanen",
        correctAnswer = 1,
        explanation = "Die Sykes-Picot-Vereinbarung war ein geheimes britisch-französisches Abkommen (1916) zur Aufteilung der arabischen Gebiete des Osmanischen Reiches.",
        difficulty = 4,
        funFact = "Die Grenzen, die durch Sykes-Picot entstanden, prägen noch heute die politischen Konflikte im Nahen Osten."
    ),

    Question(
        categoryId = 3,
        questionText = "Was bezeichnete man als 'Canossagang' und was war seine historische Bedeutung?",
        answerA = "Kaiser Heinrichs IV. Bußgang zu Papst Gregor VII. 1077 als Symbol des Investiturstreits",
        answerB = "Die Pilgerreise Karls des Großen nach Rom",
        answerC = "Die Unterwerfung Italiens unter das Deutsche Reich",
        answerD = "Der erste Kreuzzug unter deutschem Kommando",
        correctAnswer = 0,
        explanation = "Beim Canossagang 1077 unterwarf sich Kaiser Heinrich IV. Papst Gregor VII. im Investiturstreit. Das Ereignis symbolisiert den Konflikt zwischen weltlicher und geistlicher Macht.",
        difficulty = 4,
        funFact = "Bismarcks Ausspruch 'Nach Canossa gehen wir nicht' (1872) im Kulturkampf zeigt, wie lebendig dieses historische Symbol noch 800 Jahre später war."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Dawes-Plan' von 1924?",
        answerA = "Ein amerikanischer Plan zur Neugestaltung der deutschen Reparationszahlungen nach dem WWI",
        answerB = "Ein britisches Wirtschaftsprogramm für die Weimarer Republik",
        answerC = "Ein Schuldenerlass für die von Deutschland besetzten Gebiete",
        answerD = "Ein Investitionsprogramm des Völkerbundes für Deutschland",
        correctAnswer = 0,
        explanation = "Der Dawes-Plan (1924) regelte Deutschlands Reparationszahlungen neu und ermöglichte durch US-Kredite die wirtschaftliche Stabilisierung der Weimarer Republik.",
        difficulty = 4,
        funFact = "Charles Dawes erhielt für diesen Plan 1925 den Friedensnobelpreis."
    ),

    // --- MASTER (5 questions) ---

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter der 'Kontinentalsperre' Napoleons und warum scheiterte sie?",
        answerA = "Eine militärische Blockade britischer Küstengewässer durch die französische Marine",
        answerB = "Ein Wirtschaftsembargo gegen Großbritannien, das europäische Kontinentalmächte zur Beteiligung zwang, aber durch Schmuggel und den Russlandfeldzug scheiterte",
        answerC = "Eine politische Isolation Frankreichs nach der Niederlage bei Waterloo",
        answerD = "Ein Handelspakt zwischen Frankreich und Preußen gegen britische Waren",
        correctAnswer = 1,
        explanation = "Napoleons Kontinentalsperre (1806) sollte Großbritannien wirtschaftlich ruinieren, scheiterte aber an weit verbreitetem Schmuggel und daran, dass Russlands Ausstieg 1812 den Russlandfeldzug provozierte.",
        difficulty = 5,
        funFact = "Die Kontinentalsperre schadete Europa oft mehr als Großbritannien, da sie den Zugang zu wichtigen Kolonialwaren unterband."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Gleichschaltung' im nationalsozialistischen Deutschland?",
        answerA = "Die Vereinheitlichung der deutschen Streitkräfte unter einem Oberkommando",
        answerB = "Die wirtschaftliche Angleichung der deutschen Bundesstaaten",
        answerC = "Der systematische Prozess der Unterordnung aller gesellschaftlichen Institutionen unter NS-Kontrolle und -Ideologie",
        answerD = "Die politische Integration Österreichs ins Deutsche Reich",
        correctAnswer = 2,
        explanation = "Die Gleichschaltung (ab 1933) bezeichnete den Prozess, durch den die Nationalsozialisten Parteien, Gewerkschaften, Medien und alle anderen Institutionen unter ihre Kontrolle brachten.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Historikerstreit' der 1980er Jahre in Deutschland?",
        answerA = "Eine akademische Debatte über die Echtheit von Hitlers Tagebüchern",
        answerB = "Ein öffentlicher Streit unter deutschen Historikern über die Einzigartigkeit des Holocaust und Deutschlands historische Verantwortung",
        answerC = "Eine Kontroverse über die Bewertung der DDR-Geschichte nach der Wiedervereinigung",
        answerD = "Ein Disput über die Ursachen der Weimarer Inflation von 1923",
        correctAnswer = 1,
        explanation = "Der Historikerstreit (1986–89) war eine öffentliche Debatte, ausgelöst durch Ernst Noltes These, der Holocaust sei eine 'Reaktion' auf sowjetische Verbrechen gewesen – was Jürgen Habermas und andere scharf zurückwiesen.",
        difficulty = 5,
        funFact = "Der Streit prägte die deutsche Erinnerungskultur nachhaltig und beeinflusste, wie Deutschland mit seiner NS-Vergangenheit umgeht."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche geopolitische Theorie formulierte Halford Mackinder 1904, die die strategische Planung im 20. Jahrhundert beeinflusste?",
        answerA = "Die Seemacht-Theorie, wonach Weltmacht durch Kontrolle der Ozeane entsteht",
        answerB = "Die Heartland-Theorie, wonach Kontrolle über Eurasiens Kernland zur Weltherrschaft führe",
        answerC = "Die Randstaaten-Theorie, die Randgebiete als entscheidend für Weltmacht betrachtete",
        answerD = "Die Dominotheorie, die kommunistische Ausbreitung als Kettenreaktion beschrieb",
        correctAnswer = 1,
        explanation = "Mackinders Heartland-Theorie (1904) besagte: 'Wer Osteuropa beherrscht, gebietet über das Herzland; wer das Herzland beherrscht, gebietet über die Weltinsel; wer die Weltinsel beherrscht, gebietet über die Welt.'",
        difficulty = 5,
        funFact = "Mackinders Theorie beeinflusste sowohl NS-Geopolitiker wie Karl Haushofer als auch die US-Eindämmungsstrategie im Kalten Krieg."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Piłsudski-Doktrin' im Polen der Zwischenkriegszeit?",
        answerA = "Eine Wirtschaftspolitik zur Industrialisierung Polens in den 1920ern",
        answerB = "Eine außenpolitische Strategie, die Polen zwischen Deutschland und der UdSSR durch Gleichgewichtspolitik sichern sollte",
        answerC = "Ein Militärpakt zwischen Polen und Frankreich gegen das Deutsche Reich",
        answerD = "Eine Strategie zur ethnischen Homogenisierung Polens durch Umsiedlung von Minderheiten",
        correctAnswer = 1,
        explanation = "Józef Piłsudski verfolgte eine 'Politique d'équilibre', die Polen durch Nichtangriffspakte mit beiden mächtigen Nachbarn (Deutschland 1934, UdSSR 1932) schützen sollte.",
        difficulty = 5,
        funFact = "Nach Piłsudskis Tod 1935 brach diese Strategie zusammen, was Polen anfälliger für die spätere Doppelbedrohung machte."
    ),

    // --- NEW EASY (15 questions) ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr wurde die Berliner Mauer gebaut?",
        answerA = "1955",
        answerB = "1958",
        answerC = "1961",
        answerD = "1963",
        correctAnswer = 2,
        explanation = "Die Berliner Mauer wurde in der Nacht vom 12. auf den 13. August 1961 von der DDR errichtet, um die Massenflucht in den Westen zu stoppen.",
        difficulty = 1,
        funFact = "In den zwölf Jahren vor dem Mauerbau flohen rund 2,6 Millionen Menschen aus der DDR in den Westen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher deutsche Reformator löste 1517 die Reformation aus?",
        answerA = "Johannes Calvin",
        answerB = "Ulrich Zwingli",
        answerC = "Martin Luther",
        answerD = "Thomas Müntzer",
        correctAnswer = 2,
        explanation = "Martin Luther veröffentlichte 1517 seine 95 Thesen gegen den Ablasshandel und löste damit die Reformation der christlichen Kirche aus.",
        difficulty = 1,
        funFact = "Luther übersetzte die Bibel ins Deutsche und prägte damit maßgeblich die deutsche Schriftsprache."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches antike Weltwunder stand in Alexandria?",
        answerA = "Der Koloss von Rhodos",
        answerB = "Der Leuchtturm von Alexandria",
        answerC = "Der Artemistempel von Ephesos",
        answerD = "Die hängenden Gärten von Babylon",
        correctAnswer = 1,
        explanation = "Der Leuchtturm von Alexandria war eines der Sieben Weltwunder der Antike und stand auf der Insel Pharos vor Alexandria.",
        difficulty = 1,
        funFact = "Der Leuchtturm war über 100 Meter hoch und diente jahrhundertelang als Seezeichen für Schiffe im Mittelmeer."
    ),

    Question(
        categoryId = 3,
        questionText = "Wie nannte man den Zeitraum von 1933 bis 1945 in Deutschland?",
        answerA = "Die Weimarer Republik",
        answerB = "Das Zweite Reich",
        answerC = "Das Dritte Reich",
        answerD = "Die Bundesrepublik",
        correctAnswer = 2,
        explanation = "Der Zeitraum der nationalsozialistischen Herrschaft unter Adolf Hitler von 1933 bis 1945 wird als Drittes Reich oder NS-Zeit bezeichnet.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Schiff sank 1912 auf seiner Jungfernfahrt?",
        answerA = "RMS Lusitania",
        answerB = "SS Olympic",
        answerC = "HMS Britannic",
        answerD = "RMS Titanic",
        correctAnswer = 3,
        explanation = "Die RMS Titanic sank in der Nacht vom 14. auf den 15. April 1912 nach einer Kollision mit einem Eisberg im Nordatlantik.",
        difficulty = 1,
        funFact = "Beim Untergang der Titanic starben rund 1.500 Menschen — etwa zwei Drittel der Passagiere und Besatzungsmitglieder."
    ),

    Question(
        categoryId = 3,
        questionText = "Wann wurde die Bundesrepublik Deutschland gegründet?",
        answerA = "1945",
        answerB = "1947",
        answerC = "1949",
        answerD = "1951",
        correctAnswer = 2,
        explanation = "Die Bundesrepublik Deutschland wurde am 23. Mai 1949 gegründet, als das Grundgesetz in Kraft trat.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war die erste Frau auf dem englischen Thron?",
        answerA = "Elisabeth I.",
        answerB = "Maria I.",
        answerC = "Viktoria",
        answerD = "Anna",
        correctAnswer = 1,
        explanation = "Maria I. (auch 'Bloody Mary' genannt) war 1553 die erste Königin von England und regierte bis 1558.",
        difficulty = 1,
        funFact = "Maria I. ließ über 280 Protestanten verbrennen, was ihr den Beinamen 'Bloody Mary' einbrachte."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis begann am 6. Juni 1944?",
        answerA = "Die Kapitulation Deutschlands",
        answerB = "Der D-Day – die allierte Landung in der Normandie",
        answerC = "Die Befreiung Roms durch die Alliierten",
        answerD = "Die Ardennenoffensive",
        correctAnswer = 1,
        explanation = "Am 6. Juni 1944 (D-Day) landeten alliierte Truppen in der Normandie in Frankreich – der größte amphibische Angriff der Geschichte.",
        difficulty = 1,
        funFact = "An der Landung waren über 156.000 Soldaten, 5.000 Schiffe und 13.000 Flugzeuge beteiligt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Stadt war das Zentrum des antiken Griechenlands?",
        answerA = "Sparta",
        answerB = "Korinth",
        answerC = "Theben",
        answerD = "Athen",
        correctAnswer = 3,
        explanation = "Athen war das kulturelle und politische Zentrum des antiken Griechenlands und Geburtsort der Demokratie.",
        difficulty = 1,
        funFact = "Die Akropolis von Athen mit dem Parthenon-Tempel wurde um 447 v. Chr. unter Perikles erbaut."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Krieg fand von 1950 bis 1953 statt?",
        answerA = "Vietnamkrieg",
        answerB = "Koreakrieg",
        answerC = "Falklandkrieg",
        answerD = "Golfkrieg",
        correctAnswer = 1,
        explanation = "Der Koreakrieg dauerte von 1950 bis 1953 und endete mit einem Waffenstillstand, der die Halbinsel an der 38. Breitengrade teilte.",
        difficulty = 1,
        funFact = "Der Koreakrieg gilt als 'vergessener Krieg', obwohl über 5 Millionen Menschen dabei ihr Leben verloren."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die erste Hauptstadt des vereinten Deutschen Reiches nach 1871?",
        answerA = "Frankfurt",
        answerB = "München",
        answerC = "Hamburg",
        answerD = "Berlin",
        correctAnswer = 3,
        explanation = "Berlin war die Hauptstadt des Deutschen Kaiserreichs, das am 18. Januar 1871 im Spiegelsaal von Versailles ausgerufen wurde.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war Kleopatra?",
        answerA = "Eine griechische Göttin",
        answerB = "Die letzte Pharaonin des antiken Ägyptens",
        answerC = "Eine römische Kaiserin",
        answerD = "Eine karthagische Feldherrin",
        correctAnswer = 1,
        explanation = "Kleopatra VII. war die letzte Herrscherin aus der ptolemäischen Dynastien und die letzte Pharaonin des antiken Ägyptens.",
        difficulty = 1,
        funFact = "Kleopatra war nicht ägyptisch, sondern griechisch-makedonischer Herkunft und die erste der Ptolemäer, die Ägyptisch sprach."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Land führte als erstes die Todesstrafe in Friedenszeiten ab?",
        answerA = "Frankreich",
        answerB = "Schweden",
        answerC = "San Marino",
        answerD = "Portugal",
        correctAnswer = 2,
        explanation = "San Marino schaffte die Todesstrafe bereits 1865 ab und war damit weltweit eines der ersten Länder, die dies taten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 3,
        questionText = "Wie hieß der erste Mensch im Weltall?",
        answerA = "Neil Armstrong",
        answerB = "Buzz Aldrin",
        answerC = "Juri Gagarin",
        answerD = "Alan Shepard",
        correctAnswer = 2,
        explanation = "Juri Gagarin war am 12. April 1961 der erste Mensch im Weltall und umkreiste die Erde in 108 Minuten.",
        difficulty = 1,
        funFact = "Gagarin war Pilot der sowjetischen Luftwaffe und wurde nach seinem Flug weltweit als Held gefeiert."
    ),

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr fand die amerikanische Unabhängigkeitserklärung statt?",
        answerA = "1770",
        answerB = "1776",
        answerC = "1783",
        answerD = "1789",
        correctAnswer = 1,
        explanation = "Die amerikanische Unabhängigkeitserklärung wurde am 4. Juli 1776 vom Kontinentalkongress verabschiedet.",
        difficulty = 1,
        funFact = "Der 4. Juli wird in den USA als 'Independence Day' gefeiert — einer der wichtigsten Nationalfeiertage des Landes."
    ),

    // --- NEW MEDIUM (20 questions) ---

    Question(
        categoryId = 3,
        questionText = "Was war der 'Schwarze Freitag' von 1929?",
        answerA = "Der Tag, an dem die Weimarer Republik zusammenbrach",
        answerB = "Der Beginn der Weltwirtschaftskrise durch den Börsencrash in New York",
        answerC = "Der größte Streik in der deutschen Geschichte",
        answerD = "Der Tag, an dem Hindenburg die Notstandsgesetze unterzeichnete",
        correctAnswer = 1,
        explanation = "Am 24. Oktober 1929 (in den USA der 'Black Thursday') brach die New Yorker Börse zusammen und löste die Weltwirtschaftskrise aus.",
        difficulty = 2,
        funFact = "In Deutschland sprach man vom 'Schwarzen Freitag' (25. Oktober), weil der Crash erst mit Zeitverzögerung die europäischen Märkte traf."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher chinesische Kaiser ließ die Große Mauer in ihrer heutigen Form ausbauen?",
        answerA = "Qin Shi Huangdi",
        answerB = "Han Wudi",
        answerC = "Kaiser Yongle",
        answerD = "Wanli",
        correctAnswer = 3,
        explanation = "Die meisten heute noch sichtbaren Abschnitte der Chinesischen Mauer wurden unter Kaiser Wanli der Ming-Dynastie (16./17. Jh.) errichtet.",
        difficulty = 2,
        funFact = "Die Große Mauer ist über 21.000 km lang und wurde über viele Dynastien hinweg gebaut und erweitert."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Anschluss' von 1938?",
        answerA = "Die Eingliederung des Sudetenlandes ins Deutsche Reich",
        answerB = "Die Annexion Österreichs durch das nationalsozialistische Deutschland",
        answerC = "Der Beitritt Deutschlands zum Völkerbund",
        answerD = "Die Vereinigung von Preußen und Bayern",
        correctAnswer = 1,
        explanation = "Der 'Anschluss' bezeichnete die Annexion Österreichs durch das Deutsche Reich am 12./13. März 1938.",
        difficulty = 2,
        funFact = "Österreich blieb bis 1945 Teil des Deutschen Reichs und wurde erst nach dem Zweiten Weltkrieg wieder ein eigenständiger Staat."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Konferenz legte 1945 die Nachkriegsordnung Europas fest?",
        answerA = "Konferenz von Teheran",
        answerB = "Konferenz von Casablanca",
        answerC = "Potsdamer Konferenz",
        answerD = "Konferenz von Jalta",
        correctAnswer = 2,
        explanation = "Auf der Potsdamer Konferenz (Juli/August 1945) einigten sich die Siegermächte USA, UdSSR und Großbritannien auf die Grundzüge der Nachkriegsordnung Deutschlands.",
        difficulty = 2,
        funFact = "In Potsdam wurde u.a. die Aufteilung Deutschlands in vier Besatzungszonen und die Entnazifizierung beschlossen."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war Otto von Bismarck?",
        answerA = "Der erste Kaiser des Deutschen Reiches",
        answerB = "Der erste Bundeskanzler der Weimarer Republik",
        answerC = "Der preußische Ministerpräsident und erste Reichskanzler, der Deutschland einigte",
        answerD = "Ein preußischer General, der Frankreich besiegte",
        correctAnswer = 2,
        explanation = "Otto von Bismarck war preußischer Ministerpräsident und erster Reichskanzler, der durch drei Kriege die deutschen Staaten 1871 zum Kaiserreich einte.",
        difficulty = 2,
        funFact = "Bismarck führte als erster Staatsmann eine Kranken- und Rentenversicherung ein und gilt als Vater des modernen Sozialstaats."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Kristallnacht' (Novemberpogrome) von 1938?",
        answerA = "Ein Bombenangriff auf jüdische Viertel in Berlin",
        answerB = "Ein landesweites Pogrom gegen Juden in Deutschland und Österreich",
        answerC = "Die erste staatliche Deportation von Juden",
        answerD = "Die Einführung der Nürnberger Rassegesetze",
        correctAnswer = 1,
        explanation = "In der Nacht vom 9. auf den 10. November 1938 wurden jüdische Geschäfte, Synagogen und Wohnungen zerstört. Dabei wurden ca. 400 Menschen getötet und 30.000 verhaftet.",
        difficulty = 2,
        funFact = "Der Name 'Kristallnacht' bezieht sich auf die zersplitterten Schaufensterscheiben, verniedlicht aber das tatsächliche Ausmaß der Gewalt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Herrscher ließ den Petersdom in Rom im 16. Jahrhundert neu errichten?",
        answerA = "Papst Leo X.",
        answerB = "Papst Julius II.",
        answerC = "Kaiser Karl V.",
        answerD = "Papst Paul III.",
        correctAnswer = 1,
        explanation = "Papst Julius II. beauftragte 1506 den Neubau des Petersdoms und legte den Grundstein. Der Bau dauerte über 100 Jahre.",
        difficulty = 2,
        funFact = "Die Finanzierung des Petersdoms durch den Ablasshandel war ein Hauptauslöser für Luthers Kritik und die Reformation."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der NATO-Doppelbeschluss von 1979?",
        answerA = "Ein Vertrag zur nuklearen Abrüstung zwischen NATO und Warschauer Pakt",
        answerB = "Die Entscheidung, neue US-Mittelstreckenraketen in Europa zu stationieren, verbunden mit einem Verhandlungsangebot",
        answerC = "Ein Verteidigungsplan gegen eine sowjetische Invasion Westeuropas",
        answerD = "Der Beitritt Spaniens und Portugals zur NATO",
        correctAnswer = 1,
        explanation = "Der NATO-Doppelbeschluss (1979) sah die Stationierung von Pershing-II-Raketen in Europa vor, falls die UdSSR ihre SS-20-Raketen nicht abrüsten würde.",
        difficulty = 2,
        funFact = "Der Beschluss löste in Deutschland die größte Friedensbewegung der Nachkriegsgeschichte aus, mit bis zu 300.000 Demonstranten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Zivilisation errichtete Machu Picchu?",
        answerA = "Die Azteken",
        answerB = "Die Maya",
        answerC = "Die Olmeken",
        answerD = "Die Inka",
        correctAnswer = 3,
        explanation = "Machu Picchu wurde von den Inka im 15. Jahrhundert auf einem Bergrücken in den peruanischen Anden errichtet.",
        difficulty = 2,
        funFact = "Machu Picchu war wahrscheinlich eine Sommerresidenz des Inka-Herrschers Pachacuti und wurde von den Spaniern nie entdeckt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Prager Frühling' von 1968?",
        answerA = "Ein Studentenaufstand gegen die kommunistische Regierung der CSSR",
        answerB = "Eine Reformbewegung unter Alexander Dubček, die durch sowjetische Truppen beendet wurde",
        answerC = "Die Gründung der Tschechoslowakei als demokratischer Staat",
        answerD = "Ein diplomatischer Annäherungsversuch zwischen der CSSR und Westdeutschland",
        correctAnswer = 1,
        explanation = "Der Prager Frühling war eine Reformbewegung unter KP-Chef Dubček (Sozialismus mit menschlichem Antlitz), die im August 1968 durch Truppen des Warschauer Pakts beendet wurde.",
        difficulty = 2,
        funFact = "In der Nacht vom 20. auf den 21. August 1968 marschierten 200.000 Soldaten aus fünf Ostblockstaaten in die CSSR ein."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Pharao ließ den Tempel von Abu Simbel erbauen?",
        answerA = "Tutanchamun",
        answerB = "Echnaton",
        answerC = "Ramses II.",
        answerD = "Thutmosis III.",
        correctAnswer = 2,
        explanation = "Ramses II. ließ den Großen Tempel von Abu Simbel um 1264 v. Chr. in den Nubischen Sandstein hauen – als Monument seiner eigenen Vergöttlichung.",
        difficulty = 2,
        funFact = "1968 wurde der Tempel aufwändig versetzt, um ihn vor dem steigenden Wasser des Assuan-Staudamms zu retten."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis löste die Kuba-Krise 1962 aus?",
        answerA = "Die gescheiterte Invasion in der Schweinebucht",
        answerB = "Die Entdeckung sowjetischer Raketenbasen auf Kuba durch US-Aufklärungsflugzeuge",
        answerC = "Fidel Castros Machtergreifung auf Kuba",
        answerD = "Ein sowjetisches Ultimatum zur Räumung Westberlins",
        correctAnswer = 1,
        explanation = "Am 14. Oktober 1962 fotografierten US-Aufklärungsflugzeuge sowjetische Raketenbasen auf Kuba und lösten damit die Kuba-Krise aus.",
        difficulty = 2,
        funFact = "Die 13-tägige Kuba-Krise gilt als der Moment, in dem die Welt einem Atomkrieg am nächsten war."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Weimarer Republik?",
        answerA = "Das Deutsche Reich unter Kaiser Wilhelm II.",
        answerB = "Die erste parlamentarische Demokratie in Deutschland von 1919 bis 1933",
        answerC = "Ein Stadtstaatenbund mit Weimar als Hauptstadt",
        answerD = "Die Übergangsregierung nach dem Zweiten Weltkrieg",
        correctAnswer = 1,
        explanation = "Die Weimarer Republik war die erste deutsche Demokratie, die von 1919 bis zur Machtergreifung der Nationalsozialisten 1933 bestand.",
        difficulty = 2,
        funFact = "Die Verfassung wurde in Weimar beschlossen, weil die Hauptstadt Berlin nach der Novemberrevolution als zu unruhig galt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Bedeutung hatte der Wiener Kongress von 1814/15?",
        answerA = "Er beendete den Krimkrieg und regelte die Nachfolge des Osmanischen Reiches",
        answerB = "Er stellte nach den Napoleonischen Kriegen die politische Ordnung Europas neu auf",
        answerC = "Er gründete den Deutschen Bund als Vorläufer des Deutschen Reiches",
        answerD = "Er besiegelte die Aufteilung Polens unter Russland, Preußen und Österreich",
        correctAnswer = 1,
        explanation = "Der Wiener Kongress (1814/15) schuf nach Napoleons Niederlagen eine neue europäische Ordnung auf Basis von Restauration und Gleichgewicht der Mächte.",
        difficulty = 2,
        funFact = "Der österreichische Außenminister Metternich war der dominierende Gestalter des Kongresses und der europäischen Politik danach."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Kalte Krieg'?",
        answerA = "Ein Krieg zwischen Russland und Finnland im Winter 1939/40",
        answerB = "Die militärische Konfrontation zwischen NATO und Warschauer Pakt in Mitteleuropa",
        answerC = "Der ideologische und geopolitische Konflikt zwischen den USA und der UdSSR von 1947 bis 1991",
        answerD = "Ein Konflikt um arktische Territorien zwischen Russland und Kanada",
        correctAnswer = 2,
        explanation = "Der Kalte Krieg war die Systemkonfrontation zwischen den kapitalistischen USA und dem kommunistischen Sowjetblock von ca. 1947 bis zum Zerfall der UdSSR 1991.",
        difficulty = 2,
        funFact = "Der Begriff 'Kalter Krieg' wurde 1947 vom US-Berater Bernard Baruch geprägt, um den Konflikt ohne direkten militärischen Zusammenstoß zu beschreiben."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Stadt wurde durch den Vesuv-Ausbruch 79 n. Chr. begraben?",
        answerA = "Neapel",
        answerB = "Herculaneum",
        answerC = "Sorrent",
        answerD = "Pompeji",
        correctAnswer = 3,
        explanation = "Pompeji wurde beim Ausbruch des Vesuvs am 24. August 79 n. Chr. unter Asche und Bimsstein begraben und dadurch für die Nachwelt konserviert.",
        difficulty = 2,
        funFact = "Auch die Stadt Herculaneum wurde beim gleichen Ausbruch zerstört, allerdings durch einen pyroklastischen Strom statt durch Asche."
    ),

    Question(
        categoryId = 3,
        questionText = "Wann begann der Vietnamkrieg für die USA?",
        answerA = "1950",
        answerB = "1955",
        answerC = "1964",
        answerD = "1968",
        correctAnswer = 2,
        explanation = "Die direkte US-Kriegsbeteiligung begann nach dem Tonkin-Zwischenfall im August 1964, als der Kongress Präsident Johnson weitreichende Kriegsvollmachten erteilte.",
        difficulty = 2,
        funFact = "Der Vietnamkrieg kostete über 58.000 US-Soldaten das Leben und endete 1975 mit dem Sieg Nordvietnams."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Entdeckung machte Howard Carter 1922?",
        answerA = "Das Grab des Pharaos Ramses II. im Tal der Könige",
        answerB = "Das nahezu unberührte Grab des Pharaos Tutanchamun",
        answerC = "Die Überreste der versunkenen Stadt Theben",
        answerD = "Die erste vollständige Hieroglyphen-Inschrift",
        correctAnswer = 1,
        explanation = "Howard Carter entdeckte am 4. November 1922 das fast unberührte Grab des Pharaos Tutanchamun im Tal der Könige in Ägypten.",
        difficulty = 2,
        funFact = "Der Fund der goldenen Totenmaske Tutanchamuns gilt als einer der bedeutendsten archäologischen Funde des 20. Jahrhunderts."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Sputnik-Schock von 1957?",
        answerA = "Der Absturz eines sowjetischen Satelliten über den USA",
        answerB = "Die Erschütterung des westlichen Selbstverständnisses durch den ersten Satelliten der UdSSR im Orbit",
        answerC = "Ein sowjetischer Atomtest, der die US-Raketenabwehr überlistete",
        answerD = "Die erste Mondlandung der Sowjetunion",
        correctAnswer = 1,
        explanation = "Als die Sowjetunion am 4. Oktober 1957 mit Sputnik 1 den ersten Satelliten ins All schoss, erschütterte dies die USA und löste das Wettrennen ins All aus.",
        difficulty = 2,
        funFact = "Als Reaktion auf den Sputnik-Schock gründeten die USA 1958 die NASA und verstärkten massiv Bildungsinvestitionen in Naturwissenschaften."
    ),

    Question(
        categoryId = 3,
        questionText = "Welcher Vertrag beendete den Siebenjährigen Krieg?",
        answerA = "Friede von Basel",
        answerB = "Vertrag von Hubertusburg",
        answerC = "Friede von Rijswijk",
        answerD = "Vertrag von Fontainebleau",
        correctAnswer = 1,
        explanation = "Der Siebenjährige Krieg (1756–1763) endete mit dem Frieden von Hubertusburg (zwischen Preußen, Österreich und Sachsen) sowie dem Pariser Frieden (Kolonialkrieg).",
        difficulty = 2,
        funFact = "Der Siebenjährige Krieg gilt als erster 'Weltkrieg', da er auf mehreren Kontinenten gleichzeitig geführt wurde."
    ),

    // --- NEW HARD (15 questions) ---

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter dem 'Kulturkampf' im Deutschen Kaiserreich?",
        answerA = "Bismarcks Konflikt mit der katholischen Kirche und dem Zentrum in den 1870er Jahren",
        answerB = "Der Streit zwischen Konservativen und Liberalen über die deutsche Nationalliteratur",
        answerC = "Ein Konflikt zwischen dem Kaiser und dem Reichstag über Pressefreiheit",
        answerD = "Die Auseinandersetzung zwischen preußischen und bayerischen Kulturtraditionen",
        correctAnswer = 0,
        explanation = "Bismarcks Kulturkampf (1871–1878) war ein Machtkampf gegen den politischen Katholizismus und die Ultramontanen, der u.a. Jesuiten verbot und Kirchengesetze einführte.",
        difficulty = 3,
        funFact = "Bismarck beendete den Kulturkampf schließlich, als er die Unterstützung des Zentrums gegen die Sozialdemokraten benötigte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der 'Emser Depesche' und welche Konsequenz hatte sie?",
        answerA = "Sie war eine diplomatische Note, die den Deutsch-Dänischen Krieg 1864 einleitete",
        answerB = "Bismarck kürzte und verschärfte eine königliche Depesche, um Frankreich zu einer Kriegserklärung zu verleiten",
        answerC = "Sie war das erste Telegramm, das eine Kaiserproklamation ankündigte",
        answerD = "Sie enthielt Preußens Forderungen nach dem Sieg über Österreich 1866",
        correctAnswer = 1,
        explanation = "Bismarck redigierte König Wilhelms I. Bericht über sein Treffen mit dem französischen Botschafter so, dass es wie eine gegenseitige Beleidigung wirkte – was Frankreich zur Kriegserklärung provozierte.",
        difficulty = 3,
        funFact = "Bismarck gab später zu, er habe den 'roten Lumpen vor dem gallischen Stier' geschwenkt, um den gewünschten Krieg auszulösen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Ribbentrop-Molotow-Pakt' von 1939?",
        answerA = "Ein Handelsabkommen zwischen Deutschland und der Sowjetunion über Rohstoffe",
        answerB = "Ein geheimer Nichtangriffspakt zwischen Deutschland und der UdSSR mit geheimem Protokoll zur Aufteilung Osteuropas",
        answerC = "Ein Waffenstillstandsabkommen nach dem Winterkrieg",
        answerD = "Eine gegenseitige Verteidigungsgarantie zwischen dem Deutschen Reich und der Sowjetunion",
        correctAnswer = 1,
        explanation = "Der Ribbentrop-Molotow-Pakt (August 1939) war ein Nichtangriffspakt mit geheimem Zusatzprotokoll, das Osteuropa in deutsche und sowjetische Einflusszonen aufteilte.",
        difficulty = 3,
        funFact = "Das geheime Protokoll wurde von der Sowjetunion bis 1989 offiziell geleugnet."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die historische Bedeutung der 'Wannsee-Konferenz' vom Januar 1942?",
        answerA = "Die Planung der Invasion der Sowjetunion durch SS und Wehrmacht",
        answerB = "Die bürokratische Koordination der 'Endlösung der Judenfrage' – des systematischen Völkermords",
        answerC = "Die Entscheidung zur Einführung des Judensterns im besetzten Europa",
        answerD = "Die Abstimmung über die Deportation von Juden in Arbeitslager",
        correctAnswer = 1,
        explanation = "Auf der Wannsee-Konferenz (20. Januar 1942) koordinierten hochrangige NS-Beamte die systematische Vernichtung der europäischen Juden.",
        difficulty = 3,
        funFact = "Das Protokoll der Konferenz ist eines der erschreckendsten historischen Dokumente, da es den Massenmord in bürokratischer Sprache beschreibt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was bezeichnete man als 'Scramble for Africa' im 19. Jahrhundert?",
        answerA = "Die Sklavenhandelsrouten zwischen Afrika und Amerika",
        answerB = "Das Wetteifern europäischer Mächte um die Kolonisierung Afrikas in den 1880er–1900ern",
        answerC = "Den Widerstand afrikanischer Völker gegen europäische Kolonialherrschaft",
        answerD = "Die Suche nach dem Ursprung des Nils durch europäische Entdecker",
        correctAnswer = 1,
        explanation = "Als 'Scramble for Africa' bezeichnet man den intensiven Wettbewerb europäischer Mächte um afrikanische Kolonien, der Afrika bis 1914 fast vollständig aufgeteilt hatte.",
        difficulty = 3,
        funFact = "1880 kontrollierten Europäer nur 10 % Afrikas — bis 1914 waren es 90 %."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Lebensraum'-Politik im Nationalsozialismus?",
        answerA = "Ein Programm zur Umsiedlung von Deutschen in Südamerika",
        answerB = "Hitlers Konzept der Eroberung osteuropäischer Gebiete zur deutschen Besiedlung und Ausbeutung",
        answerC = "Eine Stadtplanung zur Entlastung überfüllter Großstädte",
        answerD = "Ein Naturschutzprogramm zur Renaturierung deutscher Wälder",
        correctAnswer = 1,
        explanation = "Hitlers 'Lebensraum im Osten'-Konzept sah die Eroberung slawischer Gebiete vor, um dort Deutsche anzusiedeln und die einheimische Bevölkerung zu versklagen oder zu vernichten.",
        difficulty = 3,
        funFact = "Dieses Konzept war ein zentrales Motiv für den Überfall auf die Sowjetunion 1941 und eng mit der Vernichtungspolitik verbunden."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Gunboat Diplomacy' im 19./frühen 20. Jahrhundert?",
        answerA = "Eine britische Strategie zur Kontrolle der Handelsrouten im Mittelmeer",
        answerB = "Die Nutzung militärischer Überlegenheit (oft Kriegsschiffe) durch Großmächte, um schwächere Staaten zu Konzessionen zu zwingen",
        answerC = "Ein Abkommen zwischen europäischen Mächten über Flottengrößen",
        answerD = "Die erste internationale Konvention zum Schutz ziviler Schiffe in Kriegen",
        correctAnswer = 1,
        explanation = "Gunboat Diplomacy bezeichnete die Drohung oder den Einsatz militärischer Macht — oft durch Kriegsschiffe — als diplomatisches Druckmittel gegenüber schwächeren Staaten.",
        difficulty = 3,
        funFact = "Ein bekanntes Beispiel ist die 'Venezuelakrise' 1902/03, als Deutschland und Großbritannien Venezuela mit Kriegsschiffen blockierten, um Schulden einzutreiben."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Bedeutung hatte die 'Reichsgründung von unten' 1848/49?",
        answerA = "Sie war die erste gelungene demokratische Revolution in Deutschland",
        answerB = "Die Frankfurter Nationalversammlung versuchte, Deutschland von unten durch Volkssouveränität zu einigen, scheiterte aber",
        answerC = "Sie führte zur Eingliederung Österreichs in den Deutschen Bund",
        answerD = "Sie war der Ursprung des norddeutschen Bundes unter preußischer Führung",
        correctAnswer = 1,
        explanation = "Die Frankfurter Nationalversammlung (Paulskirchenparlament) versuchte 1848/49, Deutschland demokratisch von unten zu einigen. Das Scheitern führte zur Reaktion und späteren Einigung von oben durch Bismarck.",
        difficulty = 3,
        funFact = "Die Nationalversammlung bot dem preußischen König Friedrich Wilhelm IV. die Kaiserkrone an, den er aber als 'von der Revolution beschmutzt' ablehnte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Sonderweg'-Begriff in der deutschen Geschichtsschreibung?",
        answerA = "Deutschlands besondere Leistungen in Wissenschaft und Kultur im 19. Jahrhundert",
        answerB = "Die These, dass Deutschlands historische Entwicklung von einem 'normalen' westlichen Pfad abwich und zum Nationalsozialismus führte",
        answerC = "Bismarcksdeutsche Außenpolitik der Bündnisse und Gleichgewichtspolitik",
        answerD = "Die These, dass Deutschland einen eigenen Weg zwischen Kapitalismus und Kommunismus gesucht hat",
        correctAnswer = 1,
        explanation = "Die 'Sonderweg'-These besagt, dass Deutschland keine vollständige bürgerliche Revolution erlebte und daher einen Sonderweg zur Moderne nahm, der in den Nationalsozialismus mündete.",
        difficulty = 3,
        funFact = "Die These ist umstritten — Kritiker wie David Blackbourn und Geoff Eley argumentierten, der deutsche Weg sei nicht wirklich 'besonders' gewesen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Aktion T4' im nationalsozialistischen Deutschland?",
        answerA = "Ein Geheimplan zur Deportation aller Juden aus dem Deutschen Reich",
        answerB = "Das NS-Programm zur systematischen Ermordung von Menschen mit Behinderungen",
        answerC = "Eine Geheimoperation zur Sabotage feindlicher Infrastruktur",
        answerD = "Die Geheimdienstoperation zur Überwachung von Regimegegnern",
        correctAnswer = 1,
        explanation = "Die 'Aktion T4' war das NS-Vernichtungsprogramm für Menschen mit körperlichen oder geistigen Behinderungen, bei dem ca. 200.000 Menschen ermordet wurden.",
        difficulty = 3,
        funFact = "Die dabei entwickelten Methoden der Massentötung (Gaswagen, Vergasungsanlagen) wurden später bei der Judenvernichtung eingesetzt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Balfour-Deklaration' von 1917?",
        answerA = "Großbritanniens Kriegserklärung an das Osmanische Reich",
        answerB = "Ein britisches Dokument, das die Errichtung einer jüdischen Heimstätte in Palästina befürwortete",
        answerC = "Ein Friedensangebot Großbritanniens an Deutschland im Ersten Weltkrieg",
        answerD = "Der britische Plan zur Neugestaltung des Nahen Ostens nach dem Krieg",
        correctAnswer = 1,
        explanation = "Die Balfour-Deklaration (November 1917) war ein Brief des britischen Außenministers Balfour, in dem Großbritannien die Errichtung einer nationalen Heimstätte für das jüdische Volk in Palästina befürwortete.",
        difficulty = 3,
        funFact = "Die Deklaration ist bis heute ein zentrales Dokument im israelisch-palästinensischen Konflikt, da sie zugleich die Rechte der arabischen Bevölkerung sichern sollte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter 'Appeasement-Politik' in den 1930er Jahren?",
        answerA = "Eine aggressive Außenpolitik Großbritanniens gegen Hitler-Deutschland",
        answerB = "Die Beschwichtigungspolitik westlicher Mächte gegenüber Hitler, symbolisiert durch das Münchener Abkommen 1938",
        answerC = "Die Isolationspolitik der USA gegenüber europäischen Konflikten",
        answerD = "Frankreichs Annäherungsversuche an die Sowjetunion als Gegengewicht zu Deutschland",
        correctAnswer = 1,
        explanation = "Die Appeasement-Politik (bes. unter Neville Chamberlain) versuchte, Hitler durch Zugeständnisse — wie die Abtretung des Sudetenlandes 1938 — zu besänftigen.",
        difficulty = 3,
        funFact = "Chamberlain kehrte aus München mit dem Versprechen von 'Frieden für unsere Zeit' zurück — ein Jahr später begann der Zweite Weltkrieg."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Koloniale Schuldlüge' im Deutschen Reich nach dem WWI?",
        answerA = "Deutschlands Weigerung, Kriegsreparationen an seine ehemaligen Kolonien zu zahlen",
        answerB = "Die NS-Propaganda, die deutschen Kolonialismus als Wohltat für die Einheimischen darstellte",
        answerC = "Die deutsche Ablehnung des Versailler Mandatssystems mit dem Argument, Deutschlands Kolonialverwaltung sei besser als die der Konkurrenten",
        answerD = "Bismarcks Argumentation, Deutschland brauche keine Kolonien",
        correctAnswer = 2,
        explanation = "Nach Verlust der Kolonien 1919 propagierte Deutschland die 'Koloniale Schuldlüge': die Behauptung, Deutschland sei ein guter Kolonialherr gewesen und müsse die Kolonien zurückbekommen.",
        difficulty = 3,
        funFact = "Tatsächlich hatte Deutschland im Herero- und Nama-Aufstand 1904–08 einen der ersten Völkermorde des 20. Jahrhunderts begangen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die 'Containment-Politik' und wer formulierte sie?",
        answerA = "General MacArthurs Plan zur militärischen Eindämmung Chinas im Koreakrieg",
        answerB = "George Kennans Strategie zur politischen und wirtschaftlichen Eindämmung der sowjetischen Expansion",
        answerC = "Präsident Trumans Plan zur nuklearen Abschreckung der Sowjetunion",
        answerD = "Dwight Eisenhowers Verteidigungsstrategie der massiven Vergeltung",
        correctAnswer = 1,
        explanation = "George Kennan formulierte 1946/47 die Containment-Strategie: Die UdSSR solle nicht militärisch besiegt, sondern durch politische und wirtschaftliche Mittel eingedämmt werden.",
        difficulty = 3,
        funFact = "Kennans 'Long Telegram' von 1946 und sein anonymer 'X-Artikel' von 1947 sind zwei der einflussreichsten außenpolitischen Dokumente des 20. Jahrhunderts."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der 'Generalplan Ost' des NS-Regimes?",
        answerA = "Hitlers strategischer Operationsplan für den Überfall auf die Sowjetunion",
        answerB = "Ein SS-Plan zur Germanisierung Osteuropas durch Vertreibung und Vernichtung der einheimischen Bevölkerung",
        answerC = "Der Plan zur Errichtung eines Ostwall-Verteidigungssystems an der Oder",
        answerD = "Ein Wirtschaftsprogramm zur Ausbeutung besetzter Ostgebiete",
        correctAnswer = 1,
        explanation = "Der Generalplan Ost war ein geheimer SS-Plan (1941–1942) zur Germanisierung Osteuropas durch Massenmord, Vertreibung und Versklavung von 30–50 Millionen Menschen.",
        difficulty = 3,
        funFact = "Der Plan sah vor, innerhalb von 25–30 Jahren 80 % der polnischen, 75 % der weißrussischen und 64 % der ukrainischen Bevölkerung zu vernichten oder zu vertreiben."
    )
)
