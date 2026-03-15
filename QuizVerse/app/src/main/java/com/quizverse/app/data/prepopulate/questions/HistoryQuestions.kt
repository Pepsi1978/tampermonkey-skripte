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
    )
)
