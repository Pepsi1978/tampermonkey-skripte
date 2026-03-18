package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsMedium2(): List<Question> = listOf(

    // --- Napoleonic Wars ---

    Question(
        categoryId = 3,
        questionText = "In welcher Schlacht von 1805 besiegte Napoleon die österreichisch-russischen Truppen entscheidend?",
        answerA = "Schlacht bei Waterloo",
        answerB = "Schlacht bei Jena",
        answerC = "Schlacht bei Austerlitz",
        answerD = "Schlacht bei Leipzig",
        correctAnswer = 2,
        explanation = "Die Dreikaiserschlacht bei Austerlitz am 2. Dezember 1805 gilt als Napoleons größter taktischer Sieg. Er besiegte die vereinten Armeen von Zar Alexander I. und Kaiser Franz II.",
        difficulty = 2,
        funFact = "Napoleon wählte den Jahrestag seiner Kaiserkrönung für die Entscheidungsschlacht – ein bewusst symbolischer Akt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Rechtssystem, das Napoleon in Frankreich einführte, beeinflusst bis heute Rechtssysteme weltweit?",
        answerA = "Das Preußische Allgemeine Landrecht",
        answerB = "Der Code civil (Napoleonisches Gesetzbuch)",
        answerC = "Das Common Law",
        answerD = "Das Corpus Juris Civilis",
        correctAnswer = 1,
        explanation = "Der Code civil von 1804 vereinheitlichte das französische Zivilrecht und basierte auf Gleichheit vor dem Gesetz, Eigentumsrechten und Vertragsfreiheit. Er gilt als Grundlage vieler moderner Rechtssysteme.",
        difficulty = 2,
        funFact = "Napoleon soll gesagt haben, sein wahrer Ruhm liege nicht in den gewonnenen Schlachten, sondern im Code civil."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Kontinentalsperre, die Napoleon 1806 verhängte?",
        answerA = "Ein Verbot für kontinentale Armeen, den Ärmelkanal zu überqueren",
        answerB = "Ein Wirtschaftsboykott gegen Großbritannien, der den Handel mit England verbot",
        answerC = "Eine Seeblockade gegen Russland",
        answerD = "Ein Zollsystem innerhalb des Französischen Kaiserreichs",
        correctAnswer = 1,
        explanation = "Die Kontinentalsperre (Berliner Dekret, 1806) sollte Großbritannien wirtschaftlich durch den Ausschluss vom europäischen Handel schwächen. Sie scheiterte, weil viele Länder sich nicht daran hielten.",
        difficulty = 2,
        funFact = "Russlands Weigerung, die Kontinentalsperre einzuhalten, war einer der Hauptgründe für Napoleons verhängnisvollen Russlandfeldzug 1812."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Völkerschlacht von 1813 leitete Napoleons endgültigen Niedergang in Deutschland ein?",
        answerA = "Völkerschlacht bei Leipzig",
        answerB = "Völkerschlacht bei Dresden",
        answerC = "Völkerschlacht bei Berlin",
        answerD = "Völkerschlacht bei Frankfurt",
        correctAnswer = 0,
        explanation = "Die Völkerschlacht bei Leipzig (16.–19. Oktober 1813) war die größte Schlacht der Napoleonischen Kriege. Über 600.000 Soldaten kämpften; Napoleon erlitt eine entscheidende Niederlage gegen die Koalitionstruppen.",
        difficulty = 2,
        funFact = "In der Völkerschlacht bei Leipzig starben oder wurden verwundet mehr als 100.000 Menschen – sie war die blutigste Landschlacht in Europa vor dem Ersten Weltkrieg."
    ),

    Question(
        categoryId = 3,
        questionText = "Wohin wurde Napoleon nach seiner ersten Abdankung 1814 verbannt?",
        answerA = "Nach St. Helena",
        answerB = "Nach Korsika",
        answerC = "Nach Elba",
        answerD = "Nach Sardinien",
        correctAnswer = 2,
        explanation = "Nach der ersten Abdankung wurde Napoleon auf die Insel Elba im Mittelmeer verbannt. Von dort floh er im März 1815 zurück nach Frankreich – der Beginn der sogenannten Hundert Tage.",
        difficulty = 2,
        funFact = "Napoleon regierte Elba wie ein kleines Kaiserreich: Er reformierte Verwaltung und Bergbau und unterhielt eine eigene Armee von 1.000 Mann."
    ),

    // --- Wiener Kongress ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr fand der Wiener Kongress statt, der Europa nach Napoleon neu ordnete?",
        answerA = "1812–1813",
        answerB = "1814–1815",
        answerC = "1816–1817",
        answerD = "1818–1819",
        correctAnswer = 1,
        explanation = "Der Wiener Kongress tagte von September 1814 bis Juni 1815. Er stellte die europäische Ordnung nach den Napoleonischen Kriegen wieder her und schuf eine Balance-of-Power-Architektur.",
        difficulty = 2,
        funFact = "Der österreichische Außenminister Fürst de Ligne kommentierte: 'Der Kongress tanzt, aber er schreitet nicht vorwärts' – ein Hinweis auf die zahlreichen Feste neben den Verhandlungen."
    ),

    Question(
        categoryId = 3,
        questionText = "Wer war der führende Diplomat auf dem Wiener Kongress und Architekt der neuen europäischen Ordnung?",
        answerA = "Otto von Bismarck",
        answerB = "Talleyrand",
        answerC = "Klemens von Metternich",
        answerD = "Zar Alexander I.",
        correctAnswer = 2,
        explanation = "Klemens von Metternich, österreichischer Außenminister und späterer Staatskanzler, war die dominierende Figur des Kongresses. Er prägte die restaurative 'Metternich'sche System'-Politik bis 1848.",
        difficulty = 2,
        funFact = "Metternich war trotz seiner konservativen Politik ein überzeugter Europäer – er sah Europa als politische Einheit, nicht als Ansammlung von Nationalstaaten."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das Ziel des nach dem Wiener Kongress gegründeten Deutschen Bundes (1815)?",
        answerA = "Die Gründung eines einheitlichen deutschen Nationalstaates",
        answerB = "Ein lockerer Staatenbund zur Verteidigung und Koordination der deutschen Staaten",
        answerC = "Eine Militärallianz gegen Frankreich",
        answerD = "Die Wiederherstellung des Heiligen Römischen Reiches",
        correctAnswer = 1,
        explanation = "Der Deutsche Bund (1815–1866) war ein Staatenbund von 35 Fürstentümern und 4 freien Städten. Er diente dem Frieden, nicht der nationalen Einheit – Entscheidungen erforderten Einstimmigkeit.",
        difficulty = 2,
        funFact = "Der Deutsche Bund hatte kein gemeinsames Heer, keine gemeinsame Währung und kein gemeinsames Rechtssystem – er war bewusst schwach konstruiert."
    ),

    // --- Revolutionen von 1848 ---

    Question(
        categoryId = 3,
        questionText = "Was war das zentrale politische Ziel der Revolutionäre in Deutschland 1848?",
        answerA = "Die Abschaffung der Monarchie und Einführung der Republik",
        answerB = "Die nationale Einheit und eine liberale Verfassung",
        answerC = "Die Einführung des Sozialismus",
        answerD = "Die Annexion Frankreichs",
        correctAnswer = 1,
        explanation = "Die Revolutionäre von 1848 wollten eine konstitutionelle Monarchie mit Grundrechten und die Einigung der deutschen Staaten. Die Frankfurter Nationalversammlung erarbeitete die Paulskirchen-Verfassung.",
        difficulty = 2,
        funFact = "Die Frankfurter Nationalversammlung bot Friedrich Wilhelm IV. von Preußen die Kaiserkrone an – er lehnte ab, da er sie nicht 'aus dem Rinnstein' annehmen wollte."
    ),

    Question(
        categoryId = 3,
        questionText = "Wo tagte die erste deutsche Nationalversammlung während der Revolution von 1848?",
        answerA = "Im Berliner Stadtschloss",
        answerB = "In der Frankfurter Paulskirche",
        answerC = "Im Wiener Parlament",
        answerD = "Im Hamburger Rathaus",
        correctAnswer = 1,
        explanation = "Die Frankfurter Nationalversammlung tagte ab Mai 1848 in der Paulskirche. Sie erarbeitete die erste demokratische Verfassung für Deutschland, die jedoch scheiterte.",
        difficulty = 2,
        funFact = "Die Paulskirchen-Verfassung enthielt einen modernen Grundrechtskatalog, der viele Grundrechte des Grundgesetzes von 1949 vorwegnahm."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche zwei politischen Lager stritten in der Frankfurter Paulskirche über die Form des deutschen Nationalstaates?",
        answerA = "Kommunisten und Sozialisten",
        answerB = "Kleindeutsche (ohne Österreich) und Großdeutsche (mit Österreich)",
        answerC = "Monarchisten und Republikaner",
        answerD = "Preußen und Bayern",
        correctAnswer = 1,
        explanation = "Die 'Kleindeutschen' wollten einen deutschen Staat unter preußischer Führung ohne Österreich; die 'Großdeutschen' wollten Österreich einschließen. Die kleindeutsche Lösung setzte sich letztlich 1871 durch.",
        difficulty = 2,
        funFact = "Hinter der kleindeutsch-großdeutschen Debatte steckte auch ein religiöser Konflikt: Kleindeutschland wäre protestantisch dominiert, Großdeutschland katholisch."
    ),

    // --- Deutsches Kaiserreich / Bismarck ---

    Question(
        categoryId = 3,
        questionText = "Welches Bündnissystem schuf Bismarck nach 1871, um Frankreich diplomatisch zu isolieren?",
        answerA = "Den Zweibund mit Österreich-Ungarn",
        answerB = "Das Bismarcksches Bündnissystem (Zweibund, Dreibund, Rückversicherungsvertrag)",
        answerC = "Den Dreibund mit England und Russland",
        answerD = "Den Vierbund mit Frankreich, England und Österreich",
        correctAnswer = 1,
        explanation = "Bismarck schuf ein komplexes Netz aus Bündnissen: Zweibund (1879, D+Österreich), Dreibund (1882, +Italien), Rückversicherungsvertrag (1887, mit Russland). Ziel: Frankreich ohne Verbündete lassen.",
        difficulty = 2,
        funFact = "Nach Bismarcks Entlassung 1890 ließ Wilhelm II. den Rückversicherungsvertrag mit Russland auslaufen – Russland schloss sich daraufhin mit Frankreich zusammen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter dem 'Kulturkampf' im Deutschen Kaiserreich der 1870er Jahre?",
        answerA = "Bismarcks Kampf für die Förderung der deutschen Kultur und Kunst",
        answerB = "Den staatlichen Konflikt mit der katholischen Kirche um staatliche Kontrolle über Bildung und Klerus",
        answerC = "Den Kampf gegen die sozialistische Arbeiterbewegung",
        answerD = "Die Auseinandersetzungen um den Schulunterricht in Elsass-Lothringen",
        correctAnswer = 1,
        explanation = "Bismarck versuchte im Kulturkampf (1871–1887), die Macht der katholischen Kirche im Staat zu beschränken. Maßnahmen waren Jesuitenverbot, staatliche Lehrerseminare und die 'Maigesetze'.",
        difficulty = 2,
        funFact = "Der Begriff 'Kulturkampf' wurde vom Politiker Rudolf Virchow geprägt. Bismarck verlor letztlich den Kulturkampf – er beendete ihn, um die Unterstützung der Zentrumspartei gegen die Sozialisten zu gewinnen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Gesetz erließ Bismarck 1878, um die Sozialdemokratie zu bekämpfen?",
        answerA = "Das Sozialistengesetz",
        answerB = "Das Arbeiterschutzgesetz",
        answerC = "Das Reichsvereinsgesetz",
        answerD = "Das Gewerkschaftsverbotsgesetz",
        correctAnswer = 0,
        explanation = "Das Sozialistengesetz (1878–1890) verbot sozialdemokratische Organisationen, Versammlungen und Schriften. Gleichzeitig führte Bismarck Sozialreformen ein (Kranken-, Unfall-, Rentenversicherung), um die Arbeiter dem Staat zu binden.",
        difficulty = 2,
        funFact = "Bismarck nannte seine Doppelstrategie 'Zuckerbrot und Peitsche': Mit dem Sozialistengesetz verbot er die SPD, mit den Sozialgesetzen versuchte er, die Arbeiter zu gewinnen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Kriegsereignis führte unmittelbar zur Proklamation des Deutschen Kaiserreichs 1871?",
        answerA = "Der Deutsch-Dänische Krieg",
        answerB = "Der Austro-Preußische Krieg (Bruderkrieg)",
        answerC = "Der Deutsch-Französische Krieg",
        answerD = "Der Schleswig-Holstein-Krieg",
        correctAnswer = 2,
        explanation = "Der Deutsch-Französische Krieg (1870–71) endete mit der Niederlage Frankreichs und der Proklamation des Deutschen Kaiserreichs im Spiegelsaal von Versailles am 18. Januar 1871.",
        difficulty = 2,
        funFact = "Frankreich musste im Frieden von Frankfurt 5 Milliarden Franc Kriegsentschädigung zahlen und Elsass-Lothringen abtreten – eine Demütigung, die 1914 noch nachwirkte."
    ),

    // --- Österreich-Ungarisches Reich ---

    Question(
        categoryId = 3,
        questionText = "Was war der Ausgleich von 1867 und welches Ergebnis hatte er?",
        answerA = "Ein Friedensvertrag zwischen Österreich und Preußen nach dem Krieg von 1866",
        answerB = "Die Umwandlung des Österreichischen Kaiserreichs in die Doppelmonarchie Österreich-Ungarn",
        answerC = "Ein Bündnisvertrag Österreichs mit dem Deutschen Reich",
        answerD = "Ein Autonomieabkommen für Böhmen",
        correctAnswer = 1,
        explanation = "Der Österreichisch-Ungarische Ausgleich (1867) teilte das Reich in zwei gleichberechtigte Staaten mit gemeinsamen Ministerien für Außen-, Kriegs- und Finanzpolitik. Ungarn erhielt innenpolitische Autonomie.",
        difficulty = 2,
        funFact = "Kaiser Franz Joseph I. regierte 68 Jahre (1848–1916) – er erlebte die Niederlage gegen Preußen, die Ermordung seiner Frau Sisi und den Beginn des Ersten Weltkriegs."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Nationalitäten lebten hauptsächlich im Österreichisch-Ungarischen Reich, was zu ständigen Spannungen führte?",
        answerA = "Nur Deutsche und Ungarn",
        answerB = "Deutsche, Ungarn, Tschechen, Polen, Slowaken, Kroaten, Serben, Rumänen und andere",
        answerC = "Deutsche, Franzosen und Italiener",
        answerD = "Deutsche, Türken und Griechen",
        correctAnswer = 1,
        explanation = "Das Vielvölkerreich umfasste über ein Dutzend Nationalitäten, die alle eigene Sprachen, Kulturen und Nationalbewegungen hatten. Dieser Nationalitätenkonflikt war ein Hauptgrund für den Zerfall 1918.",
        difficulty = 2,
        funFact = "Das k. u. k. Reich hatte 11 Amtssprachen – Beamte mussten die Sprache der jeweiligen Region sprechen, was zu enormen bürokratischen Herausforderungen führte."
    ),

    // --- Russisches Reich ---

    Question(
        categoryId = 3,
        questionText = "Welche grundlegende Reform führte Peter der Große in Russland durch, um das Land zu 'europäisieren'?",
        answerA = "Die Abschaffung der Leibeigenschaft",
        answerB = "Die Modernisierung von Armee, Verwaltung und Wirtschaft nach westeuropäischem Vorbild",
        answerC = "Die Einführung einer Verfassung",
        answerD = "Die Trennung von Kirche und Staat",
        correctAnswer = 1,
        explanation = "Peter der Große (reg. 1682–1725) modernisierte Russland radikal: Er reformierte Armee und Marine, gründete die Hauptstadt St. Petersburg (1703), säkularisierte die Kirche und schickte Adlige zum Studium ins Ausland.",
        difficulty = 2,
        funFact = "Peter der Große besteuerte sogar Bärte – wer einen tragen wollte, musste eine Bartsteuer bezahlen, um die Modernisierung zu finanzieren."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Zarín erweiterte das Russische Reich im 18. Jahrhundert am stärksten und galt als aufgeklärte Herrscherin?",
        answerA = "Elisabeth I. von Russland",
        answerB = "Anna von Russland",
        answerC = "Katharina die Große",
        answerD = "Maria Theresia",
        correctAnswer = 2,
        explanation = "Katharina die Große (reg. 1762–1796) erweiterte Russland nach Westen (Polen-Teilungen) und Süden (Krim), förderte Bildung und Aufklärung und stand im Briefwechsel mit Voltaire und Diderot.",
        difficulty = 2,
        funFact = "Katharina kam ursprünglich aus Stettin (heute Polen) – sie hieß Sophie von Anhalt-Zerbst und war keine Russin, wurde aber zur bedeutendsten russischen Herrscherin nach Peter dem Großen."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Kriege führte Russland im 18. Jahrhundert, um Zugang zur Ostsee zu erlangen?",
        answerA = "Den Krimkrieg",
        answerB = "Den Großen Nordischen Krieg gegen Schweden",
        answerC = "Den Russisch-Türkischen Krieg",
        answerD = "Den Siebenjährigen Krieg",
        correctAnswer = 1,
        explanation = "Im Großen Nordischen Krieg (1700–1721) besiegte Peter der Große Schweden unter Karl XII. Russland gewann die baltischen Provinzen und damit den ersehnten Ostsee-Zugang ('Fenster nach Europa').",
        difficulty = 2,
        funFact = "Karl XII. von Schweden gilt als militärisches Genie – doch sein Russlandfeldzug wurde durch den katastrophalen Winterfeldzug und die Niederlage bei Poltawa (1709) beendet."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Leibeigenschaft im Russischen Reich und wann wurde sie abgeschafft?",
        answerA = "Eine Form der Steuerpflicht, abgeschafft 1825",
        answerB = "Die Bindung der Bauern an den Boden des Adels, abgeschafft 1861 unter Zar Alexander II.",
        answerC = "Das Militärdienstpflichtprinzip, abgeschafft 1881",
        answerD = "Die Adelsprivilegien, abgeschafft 1905",
        correctAnswer = 1,
        explanation = "Die russische Leibeigenschaft band Bauern an das Land des Adels – sie waren faktisch Eigentum ihrer Herren. Zar Alexander II. hob sie 1861 auf, doch die Bauern mussten Ablösezahlungen leisten.",
        difficulty = 2,
        funFact = "Bei der Aufhebung der Leibeigenschaft 1861 waren noch ca. 23 Millionen Leibeigene in Russland – fast ein Drittel der Bevölkerung."
    ),

    // --- Britisches Empire ---

    Question(
        categoryId = 3,
        questionText = "Welche Handelspolitik des Britischen Empire ermöglichte die wirtschaftliche Dominanz im 19. Jahrhundert?",
        answerA = "Protektionismus durch hohe Zölle auf alle Importe",
        answerB = "Freihandel, besonders nach Abschaffung der Corn Laws 1846",
        answerC = "Staatlicher Kapitalismus mit Verstaatlichung der Industrie",
        answerD = "Kolonialer Merkantilismus ohne außereuropäischen Handel",
        correctAnswer = 1,
        explanation = "Großbritannien setzte nach der Abschaffung der Corn Laws 1846 auf Freihandel. Als führende Industrienation profitierte es enorm – britische Waren überschwemmten die Weltmärkte, während Konkurrenten kaum mithalten konnten.",
        difficulty = 2,
        funFact = "Die 'Pax Britannica' (1815–1914) war eine Phase relativer weltweiter Stabilität, gesichert durch die Royal Navy – das erste Mal in der Geschichte kontrollierte eine Macht die Weltmeere allein."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Sepoy-Aufstand (Indischer Aufstand) von 1857 und welche Folge hatte er?",
        answerA = "Ein gescheiterter Aufstand der Briten gegen die Mughal-Herrschaft",
        answerB = "Ein indischer Aufstand gegen die Britische Ostindien-Kompanie, nach dem die Krone direkt die Kontrolle über Indien übernahm",
        answerC = "Ein Handelskonflikt, der zum Opiumkrieg führte",
        answerD = "Eine Rebellion der Maharadschas gegen die britische Steuerpolitik",
        correctAnswer = 1,
        explanation = "Der Sepoy-Aufstand (1857) begann als Meuterei indischer Soldaten der Ostindien-Kompanie. Nach seiner Niederschlagung übernahm die britische Krone direkt die Herrschaft über Indien – Queen Victoria wurde 1876 Kaiserin von Indien.",
        difficulty = 2,
        funFact = "Auslöser des Aufstands soll die Verwendung von tier- oder schweinfettbeschmierten Patronen gewesen sein, die für hinduistische und muslimische Soldaten religiös inakzeptabel waren."
    ),

    Question(
        categoryId = 3,
        questionText = "Auf welchem Kontinent dehnte das Britische Empire seinen Einfluss durch die 'Scramble for Africa' in den 1880er Jahren aus?",
        answerA = "Asien",
        answerB = "Australien",
        answerC = "Afrika",
        answerD = "Südamerika",
        correctAnswer = 2,
        explanation = "Beim 'Scramble for Africa' (Wettlauf um Afrika) teilten die europäischen Großmächte ab den 1880ern Afrika unter sich auf. Großbritannien kontrollierte schließlich einen Streifen von Ägypten bis Südafrika.",
        difficulty = 2,
        funFact = "Auf der Berliner Konferenz (1884–85) wurde Afrika von europäischen Mächten aufgeteilt – ohne einen einzigen afrikanischen Vertreter am Verhandlungstisch."
    ),

    // --- Industrielle Revolution / Soziale Folgen ---

    Question(
        categoryId = 3,
        questionText = "Welches soziale Phänomen entstand durch die Industrialisierung und beschrieb die elenden Lebensbedingungen der Fabrikarbeiter?",
        answerA = "Der Feudalismus",
        answerB = "Das Pauperismus (Massenarmut der arbeitenden Bevölkerung)",
        answerC = "Der Merkantilismus",
        answerD = "Die Agrarrevolution",
        correctAnswer = 1,
        explanation = "Pauperismus bezeichnete die strukturelle Massenarmut der entstehenden Industriearbeiterklasse. Trotz Arbeit lebten Millionen in Elend – lange Arbeitszeiten, Kinderarbeit und Slums waren die Realität.",
        difficulty = 2,
        funFact = "In Manchester, der 'Hauptstadt der industriellen Revolution', lebte die Hälfte der Kinder aus Arbeiterfamilien nicht länger als 5 Jahre – die Sterblichkeit durch Armut war erschreckend hoch."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter 'Kinderarbeit' während der frühen Industrialisierung?",
        answerA = "Das Ausbildungssystem für Kinder in Handwerksbetrieben",
        answerB = "Die reguläre Beschäftigung von Kindern ab 5–6 Jahren in Fabriken und Bergwerken unter gefährlichen Bedingungen",
        answerC = "Die schulische Berufsausbildung für Jugendliche",
        answerD = "Die Mitarbeit von Kindern im familiären Landwirtschaftsbetrieb",
        correctAnswer = 1,
        explanation = "Kinder arbeiteten in der frühen Industrialisierung regulär in Fabriken, Minen und Kaminen. In britischen Kohleminen schufen Kinder ab 5 Jahren als 'Trappers' – sie öffneten Belüftungstüren im Dunkeln.",
        difficulty = 2,
        funFact = "In Großbritannien wurde Kinderarbeit unter 9 Jahren erst 1833 verboten – und auch nur in Textilfabriken. In Bergwerken war sie erst 1842 für unter 10-Jährige untersagt."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Erfindung trieb die Industrialisierung im 18. Jahrhundert am stärksten voran?",
        answerA = "Die Lokomotive",
        answerB = "Die Dampfmaschine (verbessert von James Watt)",
        answerC = "Die Druckmaschine",
        answerD = "Der mechanische Webstuhl",
        correctAnswer = 1,
        explanation = "James Watts Verbesserung der Dampfmaschine (1769) ermöglichte erstmals effiziente mechanische Kraft für Fabriken, Bergwerke und später Eisenbahnen. Sie war der zentrale Motor der Industriellen Revolution.",
        difficulty = 2,
        funFact = "Die Maßeinheit 'Watt' für elektrische Leistung wurde nach James Watt benannt – eine posthume Ehrung für den Mann, der die Dampfkraft revolutionierte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der Eisenbahn für die Industrialisierung im 19. Jahrhundert?",
        answerA = "Sie diente hauptsächlich dem Personennahverkehr in Städten",
        answerB = "Sie verband Märkte, verbilligte Transport, ermöglichte Massenproduktion und schuf neue Industriezweige",
        answerC = "Sie ersetzte die Dampfmaschine als Hauptenergiequelle",
        answerD = "Sie war primär ein Militärtransportmittel",
        correctAnswer = 1,
        explanation = "Die Eisenbahn revolutionierte Wirtschaft und Gesellschaft: Transport wurde billiger und schneller, regionale Märkte wurden national, Kohle und Stahl fanden Massenabnehmer, und neue Industriezweige entstanden.",
        difficulty = 2,
        funFact = "Die erste öffentliche Dampfeisenbahn der Welt fuhr 1825 in England zwischen Stockton und Darlington – sie transportierte Kohle mit 24 km/h, damals eine atemberaubende Geschwindigkeit."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das 'Manchester-Tum' und welche politische Philosophie stand dahinter?",
        answerA = "Eine britische Stadtplanungsbewegung für Industriestädte",
        answerB = "Eine liberale Wirtschaftsphilosophie für freien Markt ohne staatliche Eingriffe (Laissez-faire)",
        answerC = "Eine sozialistische Bewegung gegen die Industrialisierung",
        answerD = "Eine konservative Reaktion auf den Fabrikbau",
        correctAnswer = 1,
        explanation = "Der 'Manchesterismus' oder 'Manchesterliberalismus' stand für radikalen Freihandel, freie Märkte und minimalen Staat. Er wurde von Richard Cobden und John Bright in Manchester entwickelt.",
        difficulty = 2,
        funFact = "Trotz des liberalen Rufes des Manchestertums lebten die Arbeiter Manchesters in extremer Armut – Friedrich Engels beschrieb dies 1845 detailliert in 'Die Lage der arbeitenden Klasse in England'."
    ),

    // --- Arbeiterbewegung ---

    Question(
        categoryId = 3,
        questionText = "Was war die Erste Internationale (International Workingmen's Association) und wann wurde sie gegründet?",
        answerA = "Eine internationale Handelsorganisation, gegründet 1851",
        answerB = "Die erste internationale Organisation der Arbeiterbewegung, gegründet 1864 in London",
        answerC = "Ein Bündnis sozialistischer Staaten, gegründet 1871",
        answerD = "Eine Gewerkschaftsdachorganisation, gegründet 1848",
        correctAnswer = 1,
        explanation = "Die Erste Internationale (1864–1876) war das erste internationale Netzwerk der Arbeiterbewegung. Sie vereinte Sozialisten, Anarchisten und Gewerkschafter – internen Streit zwischen Marx und Bakunin zerriß sie.",
        difficulty = 2,
        funFact = "Karl Marx war der führende Kopf der Ersten Internationale und schrieb viele ihrer zentralen Dokumente, obwohl er nie selbst Fabrikarbeiter war."
    ),

    Question(
        categoryId = 3,
        questionText = "Was forderten die Chartisten in Großbritannien in den 1830er–1840er Jahren?",
        answerA = "Die Verstaatlichung der Fabriken",
        answerB = "Das allgemeine Männerwahlrecht, geheime Stimmabgabe und bezahlte Parlamentsabgeordnete",
        answerC = "Die Abschaffung der Monarchie",
        answerD = "Höhere Löhne und kürzere Arbeitszeiten",
        correctAnswer = 1,
        explanation = "Die Chartisten (nach der 'People's Charter' von 1838) forderten demokratische Reformen: Allgemeines Männerwahlrecht, jährliche Parlamente, bezahlte Abgeordnete. Ihre Forderungen wurden erst Jahrzehnte später erfüllt.",
        difficulty = 2,
        funFact = "Die Chartisten sammelten über 3 Millionen Unterschriften für ihre Petition – das Parlament lehnte sie trotzdem ab. Viele ihrer Forderungen wurden erst Jahrzehnte später Gesetz."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Unterschied zwischen Trade Unions (Gewerkschaften) und politischen Arbeiterparteien im 19. Jahrhundert?",
        answerA = "Es gab keinen Unterschied – beide kämpften für dieselben Ziele",
        answerB = "Trade Unions kämpften für unmittelbare Arbeitsbedingungen (Lohn, Stunden), Parteien für politische und gesellschaftliche Veränderung",
        answerC = "Trade Unions waren staatlich organisiert, Parteien privat",
        answerD = "Trade Unions existierten nur in England, Parteien nur auf dem Kontinent",
        correctAnswer = 1,
        explanation = "Trade Unions konzentrierten sich auf praktische Verbesserungen: Lohnerhöhungen, kürzere Arbeitszeiten, bessere Bedingungen. Politische Parteien wie die SPD strebten nach gesellschaftlicher Transformation.",
        difficulty = 2,
        funFact = "In Deutschland waren Gewerkschaften lange verboten – das Sozialistengesetz (1878–1890) erschwerte auch die Gewerkschaftsarbeit erheblich."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Ereignis in Frankreich 1871 gilt als erster Versuch, eine Arbeiterregierung zu errichten?",
        answerA = "Die Julirevolution",
        answerB = "Die Pariser Kommune",
        answerC = "Die Februarrevolution",
        answerD = "Der Generalstreik von 1871",
        correctAnswer = 1,
        explanation = "Die Pariser Kommune (März–Mai 1871) war eine kurze Arbeiterregierung in Paris. Sie dauerte 72 Tage, bevor sie von Regierungstruppen blutig niedergeschlagen wurde – über 10.000 Kommunarden starben.",
        difficulty = 2,
        funFact = "Marx bezeichnete die Pariser Kommune als das 'Grab des zweiten Kaiserreichs und die Wiege der proletarischen Revolution' – sie beeinflusste das revolutionäre Denken der nächsten Jahrzehnte enorm."
    ),

    // --- Marx und Engels ---

    Question(
        categoryId = 3,
        questionText = "In welchem Jahr erschien das 'Kommunistische Manifest' von Marx und Engels?",
        answerA = "1844",
        answerB = "1848",
        answerC = "1867",
        answerD = "1871",
        correctAnswer = 1,
        explanation = "Das Kommunistische Manifest erschien im Februar 1848, kurz vor dem Ausbruch der Revolutionen. Es enthält den Aufruf 'Proletarier aller Länder, vereinigt euch!' und analysiert die Klassengesellschaft.",
        difficulty = 2,
        funFact = "Das Kommunistische Manifest war ursprünglich nur ein kleines Pamphlet – Marx und Engels schrieben es in wenigen Wochen. Es wurde zum meistgelesenen politischen Dokument der Geschichte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was ist das Hauptwerk von Karl Marx und welches ökonomische Konzept steht im Mittelpunkt?",
        answerA = "Das Kapital (1867) – mit der Mehrwerttheorie als zentralem Konzept",
        answerB = "Die Deutsche Ideologie – mit der Klassentheorie",
        answerC = "Das Elend der Philosophie – mit der Lohntheorie",
        answerD = "Die Heilige Familie – mit der Materialismuskritik",
        correctAnswer = 0,
        explanation = "Das Kapital (Bd. 1, 1867) ist Marx' ökonomisches Hauptwerk. Die Mehrwerttheorie erklärt, wie Kapitalisten durch unbezahlte Arbeit der Lohnarbeiter Profit erzeugen ('Ausbeutung').",
        difficulty = 2,
        funFact = "Marx lebte selbst in tiefer Armut in London – ohne die finanzielle Unterstützung seines Freundes Friedrich Engels hätte er das Kapital nie fertiggestellt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war Friedrich Engels' eigene Herkunft, die ihn zur Arbeiterfrage führte?",
        answerA = "Er war selbst Fabrikarbeiter aus dem Ruhrgebiet",
        answerB = "Er stammte aus einer wohlhabenden Unternehmerfamilie aus Barmen und arbeitete in der väterlichen Textilfabrik in Manchester",
        answerC = "Er war ein verarmter Adliger aus Preußen",
        answerD = "Er war Journalist aus Wien",
        correctAnswer = 1,
        explanation = "Engels stammte aus einer Fabrikantenfamilie in Barmen (Wuppertal) und arbeitete in der väterlichen Textilfabrik in Manchester. Diese direkte Beobachtung der Industriearbeit führte zu seinem Werk 'Die Lage der arbeitenden Klasse in England' (1845).",
        difficulty = 2,
        funFact = "Engels finanzierte Karl Marx und seine Familie jahrzehntelang – er unterhielt sogar eine zweite 'offizielle' Wohnung für seine Geliebte Mary Burns, damit seine bürgerliche Familie nichts davon erfuhr."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand Marx unter dem Begriff 'historischer Materialismus'?",
        answerA = "Die Ansicht, dass Geschichte durch geistige Ideen und Philosophie vorangetrieben wird",
        answerB = "Die Auffassung, dass wirtschaftliche Verhältnisse und Klassenkämpfe der Motor der Geschichte sind",
        answerC = "Eine Theorie über materielle Güter und Wirtschaftsstatistiken",
        answerD = "Die Lehre, dass die Natur die Geschichte bestimmt",
        correctAnswer = 1,
        explanation = "Der historische Materialismus besagt, dass die 'Basis' (Produktionsverhältnisse, Wirtschaft) den 'Überbau' (Kultur, Recht, Politik) bestimmt. Geschichte ist der Prozess der Klassenkämpfe um Produktionsmittel.",
        difficulty = 2,
        funFact = "Marx wandte Hegels Dialektik materialistisch um: Wo Hegel den Geist als treibende Kraft sah, sah Marx die materiellen Lebensbedingungen – er 'stellte Hegel vom Kopf auf die Füße'."
    ),

    Question(
        categoryId = 3,
        questionText = "Was meinte Marx mit dem Begriff 'Entfremdung' der Arbeiter?",
        answerA = "Die geografische Trennung von Arbeitern und ihrer Heimat durch Urbanisierung",
        answerB = "Die Entfremdung des Arbeiters von seinem Produkt, seiner Arbeitstätigkeit, seinen Mitmenschen und seinem menschlichen Potential durch Lohnarbeit",
        answerC = "Die politische Ausgrenzung der Arbeiter aus dem Wahlrecht",
        answerD = "Die kulturelle Trennung zwischen Bürgern und Adeligen",
        correctAnswer = 1,
        explanation = "Marx beschreibt in den Ökonomisch-philosophischen Manuskripten (1844) vier Dimensionen der Entfremdung: vom Produkt, von der Arbeitstätigkeit, von anderen Menschen und vom Gattungswesen des Menschen.",
        difficulty = 2,
        funFact = "Der Begriff 'Alienation' (Entfremdung) war ursprünglich ein theologischer Begriff – Marx entlehnte ihn von Hegel und füllte ihn mit wirtschaftlichem Inhalt."
    ),

    Question(
        categoryId = 3,
        questionText = "Was unterschied den 'wissenschaftlichen Sozialismus' von Marx/Engels vom 'utopischen Sozialismus' (z. B. Owen, Fourier)?",
        answerA = "Der utopische Sozialismus wollte eine bessere Gesellschaft durch gerechte Gesetze; der wissenschaftliche Sozialismus durch technischen Fortschritt",
        answerB = "Der utopische Sozialismus entwarf ideale Gesellschaftsmodelle; der wissenschaftliche Sozialismus analysierte historische Gesetzmäßigkeiten und den Klassenkampf",
        answerC = "Der utopische Sozialismus war international; der wissenschaftliche Sozialismus national",
        answerD = "Es gab keinen wesentlichen Unterschied",
        correctAnswer = 1,
        explanation = "Marx/Engels kritisierten Utopisten wie Owen und Fourier, weil deren Entwürfe idealistisch und unrealistisch seien. Der 'wissenschaftliche' Sozialismus beanspruchte, auf objektiven historischen Gesetzen zu beruhen.",
        difficulty = 2,
        funFact = "Robert Owen, ein britischer Fabrikant und früher Utopist, gründete tatsächlich eine genossenschaftliche Musterfabrik in New Lanark – ein Experiment, das sein Überleben bewies, aber nicht der kapitalistischen Logik entkam."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche der beiden großen sozialistischen Richtungen des späten 19. Jahrhunderts glaubte an die Notwendigkeit einer gewaltsamen Revolution?",
        answerA = "Die Revisionisten um Eduard Bernstein",
        answerB = "Die orthodoxen Marxisten und später die Bolschewisten",
        answerC = "Die Anarcho-Syndikalisten",
        answerD = "Die Fabier in England",
        correctAnswer = 1,
        explanation = "Orthodoxe Marxisten und später Lenins Bolschewisten hielten die Revolution für notwendig. Revisionisten wie Bernstein glaubten dagegen, der Sozialismus könne durch Reformen und demokratische Wahlen erreicht werden.",
        difficulty = 2,
        funFact = "Eduard Bernstein, ein enger Freund von Engels, veröffentlichte 1899 'Die Voraussetzungen des Sozialismus' – sein Buch löste eine der heftigsten Debatten der europäischen Sozialdemokratie aus."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Zweite Internationale (1889) und für welches Datum setzte sie ein weltweites Symbol?",
        answerA = "Ein Militärbündnis sozialistischer Staaten; Symbol: 9. November",
        answerB = "Die internationale Organisation sozialistischer Parteien; Symbol: 1. Mai als Tag der Arbeit",
        answerC = "Eine Handelsunion sozialistischer Länder; Symbol: 8. März als Frauentag",
        answerD = "Eine Gewerkschaftsorganisation; Symbol: 4. August als Antikriegstag",
        correctAnswer = 1,
        explanation = "Die Zweite Internationale (1889–1916) vereinte sozialistische Parteien weltweit. Sie rief den 1. Mai 1890 zum internationalen Kampftag der Arbeiterklasse aus – ein Symbol, das bis heute gilt.",
        difficulty = 2,
        funFact = "Die Zweite Internationale zerbrach 1914 am Ausbruch des Ersten Weltkriegs: Die meisten sozialistischen Parteien stimmten den Kriegskrediten ihrer Länder zu – der Internationalismus scheiterte am Nationalismus."
    ),

    Question(
        categoryId = 3,
        questionText = "Welches Land war führend in der frühen Industriellen Revolution und wurde deshalb 'Werkstatt der Welt' genannt?",
        answerA = "Frankreich",
        answerB = "Deutschland",
        answerC = "Großbritannien",
        answerD = "Belgien",
        correctAnswer = 2,
        explanation = "Großbritannien war Mitte des 19. Jahrhunderts unbestrittener Industrieführer: Es produzierte mehr als die Hälfte der weltweiten Kohle, die Hälfte des Stahls und mehr als die Hälfte der Baumwolltextilien.",
        difficulty = 2,
        funFact = "Großbritannien versuchte lange, den Export von Maschinen und die Auswanderung von Facharbeitern zu verbieten – doch das Wissen ließ sich nicht aufhalten."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das 'Proletariat' im marxistischen Sinne?",
        answerA = "Der Adel, der sein Land verloren hatte",
        answerB = "Die Klasse der Lohnarbeiter, die ihre Arbeitskraft verkaufen muss, weil sie keine Produktionsmittel besitzt",
        answerC = "Die armen Bauern ohne Land",
        answerD = "Die städtische Unterschicht ohne Arbeit",
        correctAnswer = 1,
        explanation = "Marx definierte das Proletariat als Klasse der Lohnarbeiter in der kapitalistischen Gesellschaft. Sie besitzen keine Produktionsmittel (Fabriken, Maschinen) und müssen daher ihre Arbeitskraft an Kapitalisten verkaufen.",
        difficulty = 2,
        funFact = "Das Wort 'Proletarier' stammt aus dem antiken Rom – 'proletarii' bezeichnete die ärmste Bürgerklasse, deren einziger Beitrag zum Staat ihre Kinder ('proles', Nachkommenschaft) waren."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche Auswirkung hatte der Eisenbahnbau auf den deutschen Nationalismus im 19. Jahrhundert?",
        answerA = "Er hatte keine politische Bedeutung",
        answerB = "Er verband die deutschen Staaten wirtschaftlich und förderte das Gefühl nationaler Zusammengehörigkeit",
        answerC = "Er verhinderte die Einigung, da jeder Staat sein eigenes Netz baute",
        answerD = "Er führte zu Konflikten zwischen Preußen und Österreich",
        correctAnswer = 1,
        explanation = "Das deutsche Eisenbahnnetz des Zollvereins verband die deutschen Staaten und schuf wirtschaftliche Einheit noch vor der politischen. Friedrich List erkannte: Erst Zollunion und Eisenbahnen, dann Nationalstaat.",
        difficulty = 2,
        funFact = "Friedrich List, der 'Vater des deutschen Eisenbahnwesens', setzte sich für den Zollverein und ein nationales Eisenbahnnetz ein – eine Idee, die er in Amerika kennenlernte."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war der Zollverein (1834) und warum war er politisch bedeutsam?",
        answerA = "Ein Handelsvertrag zwischen Preußen und Frankreich",
        answerB = "Eine Freihandelszone der deutschen Staaten unter preußischer Führung, die wirtschaftliche Integration vor der politischen Einigung schuf",
        answerC = "Ein System von Schutzzöllen gegen britische Importe",
        answerD = "Ein Abkommen zur Vereinheitlichung der deutschen Währungen",
        correctAnswer = 1,
        explanation = "Der Deutsche Zollverein (1834) beseitigte Binnenzölle zwischen 18 deutschen Staaten unter preußischer Führung. Er schuf einen einheitlichen Wirtschaftsraum und stärkte Preußens Machtposition gegenüber Österreich.",
        difficulty = 2,
        funFact = "Österreich war bewusst aus dem Zollverein ausgeschlossen – Preußen nutzte die wirtschaftliche Integration, um seinen Führungsanspruch im deutschen Raum zu etablieren."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war das Ergebnis des Preußisch-Österreichischen Krieges von 1866 (Bruderkrieg)?",
        answerA = "Österreich gewann und wurde zur führenden deutschen Macht",
        answerB = "Preußen besiegte Österreich und schied es aus dem Deutschen Bund aus – die kleindeutsche Lösung wurde möglich",
        answerC = "Der Krieg endete unentschieden mit einem Kompromissfrieden",
        answerD = "Frankreich nutzte den Krieg, um Elsass-Lothringen zu annektieren",
        correctAnswer = 1,
        explanation = "In der Entscheidungsschlacht bei Königgrätz (1866) besiegte Preußen Österreich innerhalb von sieben Wochen. Österreich schied aus dem Deutschen Bund aus; Bismarcks Weg zur kleindeutschen Einigung war frei.",
        difficulty = 2,
        funFact = "Preußen gewann den Krieg durch die Nutzung der Eisenbahn für schnelle Truppenbewegungen und durch das neue Zündnadelgewehr – eine technologische Revolution in der Kriegsführung."
    ),

    Question(
        categoryId = 3,
        questionText = "Welche sozialpolitischen Maßnahmen führte Bismarck ein, um die Arbeiter vom Sozialismus fernzuhalten?",
        answerA = "Einführung von Schulpflicht und öffentlichen Bibliotheken",
        answerB = "Krankenversicherung (1883), Unfallversicherung (1884) und Rentenversicherung (1889)",
        answerC = "Arbeitszeitreduktion auf 8 Stunden und Mindestlohn",
        answerD = "Verstaatlichung der großen Industrien",
        correctAnswer = 1,
        explanation = "Bismarcks Sozialgesetze schufen das erste staatliche Sozialversicherungssystem der Welt. Ziel war die 'Zähmung' der Arbeiterbewegung durch staatliche Fürsorge – die SPD sollte überflüssig werden.",
        difficulty = 2,
        funFact = "Bismarcks Rentenversicherung setzte das Rentenalter auf 70 Jahre fest – in einer Zeit, als die durchschnittliche Lebenserwartung der Arbeiter weit darunter lag."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der Berliner Konferenz (1884–85) für den Kolonialismus?",
        answerA = "Sie beendete den Sklavenhandel offiziell weltweit",
        answerB = "Sie legte die Regeln für die Aufteilung Afrikas unter europäische Mächte fest und legitimierte den Kolonialismus",
        answerC = "Sie schuf ein gemeinsames europäisches Heer für die Kolonien",
        answerD = "Sie gründete den Völkerbund als Vorläufer der UN",
        correctAnswer = 1,
        explanation = "Auf der Berliner Konferenz (Westafrika-Konferenz) einigten sich 14 europäische Staaten und die USA auf Regeln zur Besitzergreifung afrikanischer Gebiete. Afrikanische Vertreter waren nicht eingeladen.",
        difficulty = 2,
        funFact = "Gastgeber der Berliner Konferenz war Bismarck – obwohl er persönlich wenig Interesse an Kolonien hatte, nutzte er die Konferenz als diplomatisches Werkzeug zur Stärkung Deutschlands."
    ),

    Question(
        categoryId = 3,
        questionText = "Was verstand man unter der 'Emser Depesche' von 1870 und welche Rolle spielte Bismarck dabei?",
        answerA = "Ein diplomatischer Brief Peters des Großen an Friedrich den Großen",
        answerB = "Eine von Bismarck redigierte Depesche, die Frankreich provozieren sollte, Deutschland den Krieg zu erklären",
        answerC = "Ein Friedensangebot Frankreichs an Preußen nach dem Krieg",
        answerD = "Eine Geheimdepesche über die Kronprinzenheirat",
        correctAnswer = 1,
        explanation = "Bismarck kürzte die Emser Depesche so, dass sie wie eine gegenseitige Beleidigung wirkte. Frankreich erklärte daraufhin Preußen den Krieg – und trug damit die Schuld des Aggressors, was die deutschen Staaten an Preußens Seite brachte.",
        difficulty = 2,
        funFact = "Bismarck gestand später in seinen Memoiren offen, die Depesche 'manipuliert' zu haben, um Frankreich zur Kriegserklärung zu provozieren – eine seiner kühnsten diplomatischen Operationen."
    ),

    Question(
        categoryId = 3,
        questionText = "Was war die Bedeutung der 'Peterloo-Massaker' von 1819 für die britische Arbeiterbewegung?",
        answerA = "Es war ein Bergwerksunglück, das zur Verbesserung der Arbeitssicherheit führte",
        answerB = "Das gewaltsame Vorgehen der Kavallerie gegen eine Reformversammlung in Manchester stärkte die Forderung nach politischer Reform",
        answerC = "Es war die erste erfolgreiche Streikniederlegung durch die Regierung",
        answerD = "Es markierte den Beginn der irischen Unabhängigkeitsbewegung",
        correctAnswer = 1,
        explanation = "Beim Peterloo-Massaker (16. August 1819) ritten Husaren in eine friedliche Versammlung von 60.000 Reformanhängern in Manchester. 15 Menschen starben, Hunderte wurden verletzt – die Empörung beflügelte die Reformbewegung.",
        difficulty = 2,
        funFact = "Der Name 'Peterloo' war eine bittere Anspielung auf die glorifizierte Schlacht von Waterloo – die gleichen Soldaten, die Napoleon besiegt hatten, wurden jetzt gegen eigene Bürger eingesetzt."
    ),

)
