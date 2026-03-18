package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsHard(): List<Question> = listOf(

    // ── Football Tactics & History (10) ──────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welches taktische System setzte Arrigo Sacchi bei AC Milan in den spaeten 1980er Jahren konsequent ein?",
        answerA = "4-3-3 mit Libero",
        answerB = "4-4-2 mit kompakter Viererkette und Pressing",
        answerC = "3-5-2 mit Wingbacks",
        answerD = "Catenaccio mit gesondertem Ausputzer",
        correctAnswer = 1,
        explanation = "Sacchi revolutionierte den italienischen Fussball mit einem flachen 4-4-2 ohne Libero. Seine Mannschaft spielte kollektives Pressing und verschob als geschlossene Einheit – ein voellig neues Konzept fuer die Serie A.",
        difficulty = 3,
        funFact = "Sacchi war nie Profifussballer. Als Gegner ihn deswegen kritisierten, antwortete er: 'Um Jockey zu sein, muss man auch kein Pferd gewesen sein.'"
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man im Fussball unter dem Begriff 'Gegenpressing' (Gegenpress), massgeblich gepraegte von Juergen Klopp?",
        answerA = "Ein Defensivsystem mit tiefer Staffelung hinter dem Ball",
        answerB = "Sofortiges Anlaufen nach Ballverlust, bevor der Gegner geordnet aufbauen kann",
        answerC = "Ein Umschaltspiel mit langen Baellen auf den Mittelstuermer",
        answerD = "Hohe Verteidigungslinie mit Abseits-Falle",
        correctAnswer = 1,
        explanation = "Gegenpress bedeutet, nach eigenem Ballverlust sofort und intensiv anzulaufen – idealerweise innerhalb von 5-6 Sekunden. Der Gegner ist noch ungeordnet und kann leichter um den Ball gebracht werden. Klopp bezeichnete den Gegenpress als 'besten Spielmacher der Welt'.",
        difficulty = 3,
        funFact = "Klopp entwickelte das Konzept stark in Dortmund. Seine BVB-Mannschaft 2011/12 gewann die Meisterschaft mit durchschnittlich 6,03 Sekunden bis zum ersten Pressing-Kontakt nach Ballverlust."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr und gegen welches Land erzielte Geoff Hurst im WM-Finale das beruehmt-beruechtigte 'Wembley-Tor', dessen Gueltigkeit bis heute umstritten ist?",
        answerA = "1966 gegen die Bundesrepublik Deutschland",
        answerB = "1970 gegen Brasilien",
        answerC = "1966 gegen die Sowjetunion",
        answerD = "1962 gegen die Tschechoslowakei",
        correctAnswer = 0,
        explanation = "Im WM-Finale 1966 in Wembley traf Hursts Schuss die Unterkante der Latte. Der Linienrichter Tofiq Bahramov gab das Tor. Bis heute ist die Frage, ob der Ball hinter der Linie war, mit modernsten Analysen nicht eindeutig zu beantworten.",
        difficulty = 3,
        funFact = "Geoff Hurst ist bis heute der einzige Spieler, der in einem WM-Finale einen Hattrick erzielt hat. Das dritte Tor schoss er in der Nachspielzeit mit dem linken Fuss – obwohl er eigentlich Rechtsaussen war."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Taktik nutzte Italien unter Roberto Mancini bei der EM 2020, die mass­geblich zum Titelgewinn beitrug?",
        answerA = "Klassisches Catenaccio mit 5-3-2 und Konter",
        answerB = "4-3-3 mit hohem Pressing und intensivem Gegenpressing",
        answerC = "3-4-3 mit Spielaufbau ueber die Innenverteidiger",
        answerD = "4-2-3-1 mit breiten Fluegelspielern und Spielverlagerung",
        correctAnswer = 1,
        explanation = "Mancini wandelte die azzurri von einer defensiven Mannschaft in ein dynamisches 4-3-3 um. Mit hohem Pressing, schnellem Umschalten und technisch ueberlegenen Mittelfeldspielern (Barella, Verratti, Jorginho) dominierte Italien das Turnier.",
        difficulty = 3,
        funFact = "Die EM 2020 war das erste grosse Turnier, das Italien unter Mancini gewann. Zuvor hatte er auch Manchester City zur englischen Meisterschaft gefuehrt – gegen das Abstiegsgespent Bolton mit einem Tor in der 93. Minute."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Trainer praegte das Konzept des 'Total Football' (Totaalvoetbal) bei Ajax Amsterdam Anfang der 1970er Jahre?",
        answerA = "Louis van Gaal",
        answerB = "Rinus Michels",
        answerC = "Johan Cruyff",
        answerD = "Johan Neeskens",
        correctAnswer = 1,
        explanation = "Rinus Michels entwickelte und implementierte den Totalvoetbal bei Ajax. Dieses System sah vor, dass jeder Spieler jede Position einnehmen konnte – ein revolutionaerer Ansatz. Johan Cruyff war der geniale Ausfuehrende, Michels war der Architekt.",
        difficulty = 3,
        funFact = "Ajax gewann unter Michels von 1971 bis 1973 dreimal in Folge den Europapokal der Landesmeister. Das System wurde dann mit der niederlAndischen Nationalmannschaft bei der WM 1974 weltberuehmt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Inverted Winger'-Taktik, die von Trainern wie Pep Guardiola popularisiert wurde?",
        answerA = "Fluegelstuermer spielen auf ihrer natuerlichen Seite und flanken klassisch",
        answerB = "Fussstarke Fluegelstuermer spielen auf der falschen Seite und schneiden nach innen ein",
        answerC = "Ein Defensivsystem, bei dem die Aussenverteidiger hoch aufrUecken",
        answerD = "Zwei Stuermer tauschen staendig die Positionen",
        correctAnswer = 1,
        explanation = "Ein 'Inverted Winger' (umgekehrter Fluegelstuermer) spielt auf der Gegenseite seines starken Fusses: Ein Linksaussen ist Rechtshaender und schneidet nach innen ein, um mit dem starken Fuss abzuschliessen oder zu flanken. Beispiele: Arjen Robben (links gespielt, schoss rechts), Lionel Messi.",
        difficulty = 3,
        funFact = "Arjen Robben schoss fast alle seine wichtigen Tore mit einem einzigen Muster: diagonal von links nach rechts schneiden, Aufsetzer ins lange Eck. Alle wussten es – trotzdem konnten die meisten Verteidiger ihn nicht stoppen."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei welchem Turnier erzielte der ungarische Stuermer Ferenc Puskas 1954 trotz einer Verletzung eine historische Leistung, bevor Ungarn das Finale verlor?",
        answerA = "EM 1952 in Frankreich",
        answerB = "WM 1954 in der Schweiz",
        answerC = "WM 1958 in Schweden",
        answerD = "EM 1960 in Frankreich",
        correctAnswer = 1,
        explanation = "Ungarn galt 1954 als unschlagbar – die 'Goldene Elf' hatte 4 Jahre lang kein Spiel verloren und England 6:3 geschlagen. Puskas spielte das Finale trotz schwerer Knoechelverletzung, und Ungarn verlor 2:3 gegen Deutschland (das 'Wunder von Bern').",
        difficulty = 3,
        funFact = "Das ungarische Team von 1950-1956 gilt als eine der besten Nationalmannschaften der Geschichte. Sie verloren nur ein einziges Spiel in 49 Spielen – ausgerechnet das WM-Finale 1954."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Ergebnis hatte das als 'Jahrhundertspiel' bezeichnete WM-Halbfinale 1970 zwischen Deutschland und Italien?",
        answerA = "Italien gewann 4:3 nach Verlaengerung",
        answerB = "Deutschland gewann 4:3 nach Verlaengerung",
        answerC = "Unentschieden 3:3, Deutschland durch Elfmeterschiessen",
        answerD = "Italien gewann 5:4 nach Elfmeterschiessen",
        correctAnswer = 0,
        explanation = "Im Halbfinale in Mexiko-Stadt, gespielt um Mitternacht Europaeischer Zeit, fielen in der Verlaengerung fuenf Tore. Gerd Mueller, Seeler, Schnellinger und Held trafen fuer Deutschland; Rivera, Burgnich und Riva fuer Italien. Italien gewann 4:3 in einem dramatischen Spiel.",
        difficulty = 3,
        funFact = "Das Spiel war so dramatisch, dass die FIFA die Trophae 'Jahrhundertspiel' im Aztekenstadion aufstellt. Karl-Heinz Schnellinger schoss sein einziges Tor fuer Deutschland in Minute 90 – ausgerechnet er, der jahrelang in der Serie A spielte."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bezeichnet man im modernen Fussball als 'False Nine' (Falscher Neuner)?",
        answerA = "Einen Stuermer, der die Rueckennummer 9 traegt, aber tatsaechlich Mittelfeldspieler ist",
        answerB = "Einen Mittelstuermer, der tief in den Raum faellt und so die Verteidigung aus ihrer Position zieht",
        answerC = "Einen defensiven Mittelfeldspieler, der als Libero fungiert",
        answerD = "Eine Formation ohne klassischen Stuermer, dafuer mit drei Zehnerpositionierungen",
        correctAnswer = 1,
        explanation = "Der False Nine laesst die klassische Stuermerposition leer. Indem er tief in den Zwischenlinienraum faellt, zieht er Innenverteidiger aus ihrer Stellung – und schafft damit Raum fuer nachrUeckende Mittelfeldspieler. Messi spielte diese Rolle unter Guardiola bei Barcelona meisterhaft.",
        difficulty = 3,
        funFact = "Das Konzept ist nicht neu: Nandor Hidegkuti spielte 1953 als 'False Nine' fuer Ungarn beim legendaeren 6:3-Sieg gegen England in Wembley. Die englische Verteidigung war komplett verwirrt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Revolution brachte Ernst Happel als Trainer beim Hamburger SV, der 1983 den Europapokal der Landesmeister gewann?",
        answerA = "Einfuehrung des 4-4-2 mit Zonal Marking anstelle von Mann-Deckung",
        answerB = "Intensives Pressing und ein 3-5-2 mit sehr offensiven Wingbacks",
        answerC = "Catenaccio mit gesondertem Sweeper vor der Abwehr",
        answerD = "Total Football mit rotierenden Positionen aller Feldspieler",
        correctAnswer = 0,
        explanation = "Happel setzte im deutschen Fussball konsequent auf Raumdeckung (Zonal Marking) statt der damals ueblichen Mann-Deckung. Sein strukturiertes 4-4-2 mit klaren Raum-Verantwortlichkeiten war seiner Zeit weit voraus.",
        difficulty = 3,
        funFact = "Ernst Happel ist der einzige Trainer, der mit zwei verschiedenen Nationalmannschaften WM-Finale erreichte: 1978 mit den Niederlanden (0:3 gegen Argentinien) und als Clubtrainer mehrfach European-Cup-Sieger."
    ),

    // ── Olympic Scandals & History (8) ───────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welcher Laeufer gewann 1988 in Seoul die 100m-Goldmedaille, wurde aber nachtraeglich disqualifiziert, und welches Mittel wurde gefunden?",
        answerA = "Carl Lewis – Ephedrin",
        answerB = "Ben Johnson – Stanozolol",
        answerC = "Linford Christie – Nandrolon",
        answerD = "Leroy Burrell – Testosteron",
        correctAnswer = 1,
        explanation = "Ben Johnson lief in Seoul 9,79 Sekunden – Weltrekord. Drei Tage spaeter wurde im Urin Stanozolol nachgewiesen, ein anaboles Steroid. Johnson verlor Gold, Weltrekord und wurde gesperrt. Carl Lewis uebernahm Gold, obwohl er selbst spaeter gestand, verbotene Stimulanzien genommen zu haben.",
        difficulty = 3,
        funFact = "Das Rennen von Seoul wird manchmal 'Das dreckigste Rennen der Geschichte' genannt – von den 8 Finalteilnehmern wurden spaeter 6 mit Dopingvergehen in Verbindung gebracht."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ereignete sich beim Olympischen Marathon 1904 in St. Louis, das als einer der kuriosesten Skandale der olympischen Geschichte gilt?",
        answerA = "Der Erstplatzierte Fred Lorz hatte einen Teil der Strecke per Auto zurueckgelegt",
        answerB = "Drei Laeufer benutzten Fahrraeder auf abgelegenen Streckenabschnitten",
        answerC = "Der Sieger Thomas Hicks nahm Strychnin und rohen Eischnee als 'Aufputschmittel'",
        answerD = "Beide A und C sind korrekt",
        correctAnswer = 3,
        explanation = "1904 in St. Louis: Fred Lorz kam als Erster an, aber er hatte 17 km im Auto gesessen – disqualifiziert. Der echte Sieger Thomas Hicks wurde von seinen Betreuern mit Strychnin (damals legal) und rohem Eischnee 'versorgt' und kollabiette nach dem Ziel. Beides ist korrekt.",
        difficulty = 3,
        funFact = "Die Marathonstrecke 1904 fuehrte durch staubige Missouri-Landstrassen im August-Sommer. Nur 14 der 32 Starter kamen ins Ziel. Ein Laeufer wurde von einem Hund gebissen und musste aufgeben."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei welchen Olympischen Spielen wurde das erste Mal ein IOC-Mitglied wegen Bestechungsskandal ausgeschlossen, und welche Stadt war betroffen?",
        answerA = "Atlanta 1996 – IOC-Mitglied aus Kenia",
        answerB = "Salt Lake City 2002 – aber der Skandal betraf die Spiele 2002",
        answerC = "Sydney 2000 – IOC-Mitglied aus Ghana",
        answerD = "Salt Lake City 1998/99 – Korruptionsskandal bei der Vergabe an Salt Lake City",
        correctAnswer = 3,
        explanation = "Der Salt-Lake-City-Skandal 1998/99 erschuetterte das IOC: Mehrere IOC-Mitglieder nahmen Bestechungsgelder fuer die Vergabe der Winterspiele 2002 an. Zehn Mitglieder wurden ausgeschlossen oder traten zurueck. Der Skandal fuehrte zu grundlegenden IOC-Reformen.",
        difficulty = 3,
        funFact = "Die Vergabe der Winterspiele 2002 kostete Salt Lake City nachweislich Millionen an Schmiergeldern – von Stipendien fuer Kinder von IOC-Mitgliedern bis zu teuren Reisen und medizinischen Behandlungen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was war der 'Black October' bei den Olympischen Spielen 1968 in Mexiko-Stadt in Bezug auf das Attentat von Tlatelolco?",
        answerA = "Das Massaker an Studenten 10 Tage vor der Eroeffnung, das die mexikanische Regierung verschwieg",
        answerB = "Ein Bombenanschlag im Olympischen Dorf, der ungluecklicherweise glimpflich ausging",
        answerC = "Proteststuerme schwarzer US-Athleten gegen die Apartheid Suedafrikas",
        answerD = "Die Ermordung des mexikanischen NOK-Praesident kurz vor den Spielen",
        correctAnswer = 0,
        explanation = "Am 2. Oktober 1968, zehn Tage vor der Eroeffnung, toetete das mexikanische Militar bei einer Studentendemonstration auf dem Tlatelolco-Platz mindestens 30 (manche Quellen sagen hunderte) Menschen. Die Regierung Diaz Ordaz verschwieg das Massaker; die Spiele fanden statt.",
        difficulty = 3,
        funFact = "Bei denselben Spielen machten Tommie Smith und John Carlos mit dem 'Black Power Salute' – geballte Fauste auf dem Podium – auf Rassismus aufmerksam. Sie wurden aus dem US-Team ausgeschlossen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land schickte 1980 als Teil des Olympiaboykotts kein Team zu den Sommerspielen in Moskau, und wie viele Laender insgesamt boykottierten?",
        answerA = "USA, insgesamt 32 Laender",
        answerB = "USA, insgesamt 65 Laender",
        answerC = "Westdeutschland, insgesamt 50 Laender",
        answerD = "Grossbritannien, insgesamt 45 Laender",
        correctAnswer = 1,
        explanation = "Nach dem sowjetischen Einmarsch in Afghanistan 1979 rief US-Praesident Carter zum Boykott auf. 65 Laender blieben fern (obwohl einige Athleten unter neutraler Flagge teilnahmen). Westdeutschland, Japan, Kanada und andere schlossen sich an; Grossbritannien und Frankreich liessen ihre Athleten teilnehmen.",
        difficulty = 3,
        funFact = "Als Gegenmassnahme boykottierte die Sowjetunion 1984 die Spiele in Los Angeles. Dieser Doppelboykott beeinflusste die Medaillenverteilung beider Spiele erheblich – auf ein Treffen der grossen Rivalen wurde in zwei Olympiaden verzichtet."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Amateur-Paradox' der fruehen Olympischen Spiele, das Pierre de Coubertin betraf?",
        answerA = "Profisportler wurden als Amateure angemeldet, um die Olympischen Zulassungsregeln zu umgehen",
        answerB = "Coubertin bestand auf Amateurismus, obwohl er selbst als bezahlter Sportfunktionaer arbeitete",
        answerC = "Nur Reiche konnten sich den Amateursport leisten, was die Spiele zu einer Veranstaltung der Oberschicht machte",
        answerD = "Jim Thorpe verlor seine Goldmedaillen, weil er fuer kleines Geld Baseball gespielt hatte",
        correctAnswer = 2,
        explanation = "Coubertins Ideal des Amateurs schloss jeden aus, der fuer Sport bezahlt wurde. In der Praxis bedeutete das, dass nur wohlhabende Sportler sich Vollzeittraining leisten konnten. Arbeiter und arme Athleten waren praktisch ausgeschlossen – das Gegenteil des proklamierten olympischen Ideals.",
        difficulty = 3,
        funFact = "Jim Thorpe (Antwort D) ist ebenfalls ein historisches Beispiel: Er verlor die Goldmedaillen 1912 im Fuenfkampf und Zehnkampf, weil er fuer 2 Dollar pro Tag Baseball gespielt hatte. Die Medaillen wurden erst 1983 – 30 Jahre nach seinem Tod – zurueckgegeben."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei welchen Olympischen Spielen wurde erstmals Doping systematisch auf Staatsebene organisiert, wie spaetere Untersuchungen ergaben?",
        answerA = "DDR bei den Sommerspielen 1976 in Montreal",
        answerB = "Sowjetunion bei den Sommerspielen 1952 in Helsinki",
        answerC = "USA bei den Sommerspielen 1968 in Mexiko",
        answerD = "DDR bei den Winterspielen 1972 in Sapporo",
        correctAnswer = 0,
        explanation = "Die DDR etablierte nach 1968 ein staatliches Dopingprogramm (Staatsplan 14.25). Bei den Spielen 1976 in Montreal war das System voll ausgereift: Die DDR-Schwimmerinnen gewannen 11 von 13 Goldmedaillen. Erst nach der Wende wurden die Stasi-Akten geoeffnet und der volle Umfang bekannt.",
        difficulty = 3,
        funFact = "Schatzungen zufolge wurden zwischen 1966 und 1988 ueber 10.000 DDR-Athleten ohne ihr Wissen oder Einverstaendnis mit Anabolika (meist Oral-Turinabol) behandelt. Viele litten spaeter an schwerwiegenden gesundheitlichen Folgen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche neue olympische Disziplin wurde bei den Spielen 1900 in Paris aufgenommen, die heute nicht mehr olympisch ist und als kurioseste Olympiadisziplin gilt?",
        answerA = "Hindernisschwimmen im Fluss (10km, mit Klettern ueber Boote und Tauchen)",
        answerB = "Ballonfahrt-Praezisionslandung",
        answerC = "Kaninchenjagendes Schiessen vom Pferd",
        answerD = "Tauziehen mit gemischten Nationalteams",
        correctAnswer = 0,
        explanation = "1900 in Paris gab es ein 200m-Hindernisschwimmen in der Seine: Die Schwimmer mussten ueber Ruderboote klettern, unter ihnen hindurch tauchen und Hindernisse im trUeben Flusswasser ueberwinden. Frederick Lane gewann in 2:38,4 Minuten. Tauziehen war ebenfalls olympisch (bis 1920).",
        difficulty = 3,
        funFact = "Die Spiele 1900 in Paris waren in das 'Exposition Universelle' eingebettet und so chaotisch organisiert, dass manche Athleten erst Monate spaeter erfuhren, dass sie an Olympischen Spielen teilgenommen hatten."
    ),

    // ── Martial Arts (6) ─────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welches Konzept beschreibt Jigoro Kano als philosophische Grundlage des Judo, das ueber den blossen Kampfsport hinausgeht?",
        answerA = "Bushido – der Weg des Kriegers",
        answerB = "Seiryoku-Zenyo und Jita-Kyoei (maximale Effizienz und gegenseitiger Wohlstand)",
        answerC = "Mushin – kampfloser Geisteszustand",
        answerD = "Zanshin – fortdauernde Wachsamkeit",
        correctAnswer = 1,
        explanation = "Kano gruendete Judo 1882 auf zwei Prinzipien: Seiryoku-Zenyo (maximale Effizienz mit minimaler Kraft – der Schwache ueberwaeltigt den Staerken durch Technik) und Jita-Kyoei (gegenseitiger Wohlstand – beide Partner profitieren vom Training). Judo sollte mehr als Sport sein: ein Weg zur Persoenlichkeitsbildung.",
        difficulty = 3,
        funFact = "Kano war der erste Asiate im IOC (1909). Er setzte sich daher fuer die Aufnahme von Judo ins olympische Programm ein – was erst 1964, posthum, verwirklicht wurde. Kano starb 1938 auf einem Schiff, nachdem er die Vergabe der Spiele 1940 an Tokio gesichert hatte."
    ),

    Question(
        categoryId = 6,
        questionText = "Was unterscheidet Muay Thai (Thai-Boxen) von westlichem Kickboxen in Bezug auf die erlaubten Angriffswerkzeuge?",
        answerA = "Muay Thai erlaubt keine Tieftritte; Kickboxen schon",
        answerB = "Muay Thai nutzt 8 Gliedmassen: Faeuste, Ellbogen, Knie und Schienbeine; Kickboxen meist 4",
        answerC = "Muay Thai hat keine Kampfrunden; es wird bis zur Erschoepfung gekaempft",
        answerD = "Nur Muay Thai erlaubt Wuerfe; im Kickboxen sind sie verboten",
        correctAnswer = 1,
        explanation = "Muay Thai wird als 'Kunst der acht Gliedmassen' bezeichnet: zwei Faeuste, zwei Ellbogen, zwei Knie und zwei Schienbeine. Westliches Kickboxen (z.B. K-1-Regeln) erlaubt typischerweise nur Faeuste und Tritte, keine Ellbogen oder Knie.",
        difficulty = 3,
        funFact = "Der Ellbogen gilt in Muay Thai als gefaehrlichste Waffe. Ellbogentechniken koennen tiefe Schnitte verursachen – weshalb viele internationale Organisationen sie in leichteren Regelversionen verbieten. In Thailand sind Ellbogenkampfe von Kindheit an Teil des Trainings."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Newaza' im Judo, und welche Techniken gehoeren dazu?",
        answerA = "Wurfechniken im Stehen (Tachi-Waza-Unterkategorie)",
        answerB = "Bodenkampftechniken: Halte-Griffe (Osaekomi), Wuerge-Griffe (Shime) und Hebel (Kansetsu)",
        answerC = "Fallschultechniken (Ukemi) fuer sicheres Landen",
        answerD = "Fuss-Wurftechniken, die den Gegner aus dem Gleichgewicht bringen",
        correctAnswer = 1,
        explanation = "Newaza ist der Bodenkampf im Judo. Er umfasst Haltegriffe (Osaekomi-Waza – 25 Sekunden gehalten = Ippon), Wuergetechniken (Shime-Waza – Aufgabe oder Bewusstlosigkeit) und Armhebel (Kansetsu-Waza). Seit 2010 sind bei Jugendlichen Bein- und Wirbelsaeulengelenk-Techniken verboten.",
        difficulty = 3,
        funFact = "Katame-Waza (Haltegriffe) koennen einen groesseren Gegner ueberwaeltigen. Weltmeister haben Gegner mit 30 kg Mehrgewicht durch Newaza besiegt. Der Kampf um den Boden beginnt sofort nach einem unvollstaendigen Wurf."
    ),

    Question(
        categoryId = 6,
        questionText = "Welchen Kampfstil nutzte Bruce Lee als Grundlage fuer seine eigene Kampfkunstphilosophie Jeet Kune Do?",
        answerA = "Karate Shotokan und Taekwondo",
        answerB = "Wing Chun Kung Fu und westliches Fechten und Boxen",
        answerC = "Hapkido und Aikido",
        answerD = "Judo und brasilianisches Jiu-Jitsu",
        correctAnswer = 1,
        explanation = "Lee trainierte Wing Chun unter dem legendaeren Ip Man in Hongkong. In den USA kombinierte er dies mit westlichem Boxen (besonders Footwork und Jabbing), Fechten (Distanzmanagement) und anderen Stilen. JKD lehnt starre Stile ab: 'Absorb what is useful, discard what is useless.'",
        difficulty = 3,
        funFact = "Ip Man trainierte auch zahlreiche andere Kampfkuenstler. Ein Film ueber sein Leben wurde 2008 mit Donnie Yen veroeffentlicht und wurde ein weltweiter Erfolg. Bruce Lee war Ip Mans beruehemtester Schueler."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die Besonderheit des 'Gracies Jiu-Jitsu' (brasilianisches Jiu-Jitsu) im Vergleich zum japanischen Original?",
        answerA = "Es konzentriert sich ausschliesslich auf Waffenkampf und Selbstverteidigung",
        answerB = "Es betont den Bodenkampf und Submissions als Hauptstrategie, auch gegen groessere Gegner",
        answerC = "Es hat mehr Wurfechniken als das japanische Jiu-Jitsu",
        answerD = "Es erlaubt Schlaege und Tritte, die im japanischen Original verboten sind",
        correctAnswer = 1,
        explanation = "Die Familie Gracie (besonders Helio Gracie, der physisch schwach war) entwickelte BJJ mit dem Ziel, einem kleineren und schwaecheren Kaempfer zu erlauben, einen groesseren Gegner am Boden zu besiegen. Der Fokus liegt auf Hebeln (Armbars, Triangle Chokes) und Positionskontrolle.",
        difficulty = 3,
        funFact = "Royce Gracie bewies BJJs Effektivitaet, als er beim ersten UFC 1993 trotz erheblicher Groessen- und Gewichtsnachteile alle Kaempfe gewann. Das aenderte die Welt der Kampfkuenste und Selbstverteidigung grundlegend."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Gewichtsklasse im Boxen gilt historisch als die prestigetraechtigste, und warum?",
        answerA = "Schwergewicht, weil es keine Gewichtsobergrenze hat und der groesste Mann gewinnt",
        answerB = "Schwergewicht, weil es historisch als Symbol fuer physische Ueberlegenheit gilt und die bekanntesten Champions hat",
        answerC = "Mittelgewicht, weil es die beste Kombination aus Kraft und Geschwindigkeit bietet",
        answerD = "Halbschwergewicht, weil es die technisch versiertesten Boxer hervorbringt",
        correctAnswer = 1,
        explanation = "Das Schwergewicht hat keine Obergrenze und ist seit John L. Sullivan (1882) die Koenigsklasse des Boxens. Champions wie Joe Louis, Muhammad Ali, Mike Tyson und Lennox Lewis wurden Weltstars. Ein Schwergewichtskampf zweier unbesiegter Champions ist das groesste Ereignis im Boxen.",
        difficulty = 3,
        funFact = "Muhammad Ali (Cassius Clay) machte den Schwergewichts-Weltmeister zur Symbolfigur. Sein Kampf gegen Joe Frazier 1971 ('Kampf des Jahrhunderts') war der erste, bei dem zwei unbesiegte Weltmeister gegeneinander kaempften."
    ),

    // ── Cycling (6) ──────────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Hors Categorie' (HC) im Radsport, und wie unterscheidet er sich von einer Kategorie-1-Steigung?",
        answerA = "HC ist flacher als Kategorie 1 – eine eingestiegene Abgrenzung fuer leichte Huegel",
        answerB = "HC bedeutet 'ausserhalb der Kategorie' – haerter als Kategorie 1, zu schwer fuer das normale Bewertungssystem",
        answerC = "HC bezeichnet Abfahrten, keine Anstiege",
        answerD = "HC ist gleichbedeutend mit Kategorie 1, aber nur fuer Bergankuenfte",
        correctAnswer = 1,
        explanation = "Hors Categorie (franzoesisch fuer 'ausserhalb der Kategorie') ist die hoechste Schwierigkeitsstufe im Radsport-Bergklassement. Diese Anstiege sind so schwierig, dass sie als unkategorisierbar galten. Beispiele: Alpe d'Huez, Col du Tourmalet, Mont Ventoux.",
        difficulty = 3,
        funFact = "Der Mont Ventoux wurde von Tom Simpson 1967 waehrend der Tour de France trotz Amphetamin- und Alkohol-Einnahme bezwungen – er kollabierte kurz unter dem Gipfel und starb. Sein Sturz schockte die Radsportwelt und fuehrte zu ersten Antidoping-Massnahmen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Strategie ist als 'Domestique' bekannt, und was ist die Aufgabe dieser Fahrer bei der Tour de France?",
        answerA = "Einer der schnellsten Sprinter, der in der Schlussphase fuer den Gesamtfuehrer freigemacht wird",
        answerB = "Ein Helfer, der seinen Kapitaen mit Windschatten, Wasserflaschen und eigenen Kraeften unterstuetzt",
        answerC = "Ein Bergfahrer, der die Fluchtgruppen kontrolliert und das Peloton aufhaelt",
        answerD = "Ein Fahre im Mannschaftsdienst als Sprinter-Lokomotive in den letzten Kilometern",
        correctAnswer = 1,
        explanation = "Ein Domestique (franzoesisch fuer 'Diener') ist ein Hilfsfahrer, der seine eigenen Ambitionen dem Kapitaen unterordnet. Aufgaben: Windschatten geben, Wasserflaschen holen, bei Sturz das eigene Rad abgeben, Konkurrenten kontrollieren. Die besten Domestiques sind selbst Top-Fahrer.",
        difficulty = 3,
        funFact = "Eddy Merckx, fuenffacher Tour-Sieger, war bekannt dafuer, seine Domestiques hart zu behandeln – sie mussten buchstaeblich ihre letzte Kraft geben. Greg LeMond, spaeters Tour-Sieger, begann seine Karriere als Domestique fuer Bernard Hinault."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Peloton' und welche aerodynamischen Vorteile bietet es den Fahrern?",
        answerA = "Die Spitzengruppe der Bergetappen, bestehend aus 5-10 Fahrern",
        answerB = "Das Hauptfeld; Fahrer im Inneren sparen durch Windschatten bis zu 40% Energie",
        answerC = "Der Begleitkonvoi aus Teamfahrzeugen und Motorradreferees",
        answerD = "Die letzten Ausreisser, die sich vom Hauptfeld abgehangen wurden",
        correctAnswer = 1,
        explanation = "Das Peloton ist das Hauptfeld. Windschattenforschung zeigt: Fahrer im Inneren des Pelotons sparen bis zu 30-40% Energie gegenueber dem Freifahren. Dies ermoeglicht es dem Feld, Einzelausreisser stuendenlang zu kontrollieren, um dann im Endspurt wieder einzuholen.",
        difficulty = 3,
        funFact = "Die aerodynamischen Krafte im Peloton sind so stark, dass ein Fahrer im Zentrum selbst bei hohem Tempo kaum pedalen muss. Das erklaert, warum Ausreisser bei flachen Etappen fast immer eingeholt werden – gegen das gesamte Feld ankaepmfen ist physisch nicht moeglich."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Skandal erschuetterte Lance Armstrongs sieben Tour-de-France-Siege und fuehrte 2012 zu seiner Disqualifikation?",
        answerA = "Armstrong gab zu, EPO, Bluttransfusionen, HGH und Testosteron ueber seine gesamte Karriere systematisch verwendet zu haben",
        answerB = "Armstrong war an einer Geldwaescheoperation seines Teams beteiligt",
        answerC = "Armstrong testete positiv auf Kortikosteroide nach der Tour 1999",
        answerD = "Sein Team US Postal manipulierte Zeitnahme-Systeme bei Bergankuenften",
        correctAnswer = 0,
        explanation = "Die USADA (US Anti-Doping Agency) ueberreichte 2012 einen 202-seitigen Bericht mit Zeugenaussagen von 26 Personen. Armstrong gestand in einem Oprah-Winfrey-Interview 2013 umfassendes Doping: EPO, Bluttransfusionen, Wachstumshormon, Testosteron und Kortison.",
        difficulty = 3,
        funFact = "Armstrong bestritt jahrelang vehement jegliches Doping, klagte Journalisten und Buchautoren an und verklagte eine Versicherungsgesellschaft, die seine Tour-Praemien auszahlen sollte. Die Luege kostete ihn letztlich Millionen an Rueckzahlungen und seinen Ruf."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Vuelta a Espana' im Verhaltnis zu Tour de France und Giro d'Italia, und wie wird das Gewinnen aller drei als 'Triple Crown' definiert?",
        answerA = "Die Vuelta ist die juengste der drei Grossen Tours und gilt als die bergigste",
        answerB = "Die Triple Crown bedeutet alle drei Grossen Tours UND Weltmeisterschaft in einem Kalenderjahr zu gewinnen",
        answerC = "Die Vuelta ist nur eine Quali-Veranstaltung fuer die World Tour",
        answerD = "Triple Crown: Tour + Giro + Klassiker (z.B. Paris-Roubaix) im selben Jahr",
        correctAnswer = 1,
        explanation = "Die 'Triple Crown des Radsports' bezeichnet das Gewinnen von Tour de France, Giro d'Italia und Strassenrad-Weltmeisterschaft im selben Kalenderjahr. Nur Eddy Merckx (1974) und Stephen Roche (1987) haben das geschafft. Die Vuelta ist die dritte Grosse Tour, hat aber einen anderen Status.",
        difficulty = 3,
        funFact = "Eddy Merckx gewann 1969 Tour und Vuelta UND Weltmeisterschaft. 1972 und 1974 gelangen ihm weitere historische Kombinationen. Merckx gilt als groesster Radsportler aller Zeiten und wurde 'Der Kannibale' genannt, weil er alles gewann, was er konnte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche biomechanische Theorie erklaert, warum ein niedrigeres Sitzposition (Sattelhoehe) bei Sprintern vorteilhafter ist als bei Bergfahrern?",
        answerA = "Tiefere Sitzposition reduziert Luftwiderstand; Bergfahrer benoetigen mehr Hebelkraft durch hoehere Position",
        answerB = "Tiefere Position aktiviert die Knie-Strecker staerker; hoehere Position die Hueftbeuger – Berge erfordern Hueftflexion",
        answerC = "Sprinter sitzen tiefer fuer mehr Kraftuebertragung auf das Pedal; Bergfahrer hoeher fuer laengere Tretbewegung und weniger Muskelmuedigkeit",
        answerD = "Es gibt keinen biomechanischen Unterschied – die Sitzhoehe ist reine Praeferenz",
        correctAnswer = 2,
        explanation = "Sprinter benoetigen maximale Kraftuebertragung in kurzer Zeit – eine leicht tiefere Sitzposition optimiert die Kraftkurve beim Antreten. Bergfahrer fahren oft Stunden in Wiegetritt und aufrechter Koerperposition; die hoehere Sattelposition ermoeglicht laengere Pedalstriche mit weniger Muskelermueung.",
        difficulty = 3,
        funFact = "Die optimale Sattelhoehe im Radsport wird oft nach der '109%-Methode' berechnet: Innenbeinhohle x 1,09 = Sattelhoehe vom Pedalzentrum. Abweichungen von 2-3mm koennen Knie-Ueberlastungen verursachen."
    ),

    // ── Motorsport Technology (5) ─────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist das 'DRS' (Drag Reduction System) in der Formel 1, und unter welchen Bedingungen darf es aktiviert werden?",
        answerA = "Ein elektrischer Booster, der fuer 3 Sekunden max. Leistung liefert; erlaubt in jeder Zone",
        answerB = "Ein verstellbarer Heckfluegel, der Luftwiderstand reduziert; erlaubt in bestimmten Zonen wenn man max. 1 Sekunde hinter dem Vorausfahrenden ist",
        answerC = "Ein Brems-Regenerationssystem, das Energie in den Hybrid-Akku zurueckspeist",
        answerD = "Ein Kuehlfluegel, der sich bei hohen Temperaturen automatisch oeffnet",
        correctAnswer = 1,
        explanation = "DRS oeffnet eine Klappe im Heckfluegel, reduziert Luftwiderstand und erhoht die Hoechstgeschwindigkeit um ca. 10-20 km/h. Es darf nur in designierten DRS-Zonen aktiviert werden, und nur wenn der Fahrer im vorherigen Detection Point weniger als 1 Sekunde Rueckstand hatte.",
        difficulty = 3,
        funFact = "DRS wurde 2011 eingefuehrt, um Ueberholmaneover zu erleichtern. Kritiker sehen es als 'kuenstliches Ueberholhilfe', Befuerworter als notwendiges Mittel gegen aerodynamisch verursachte 'Dirty Air', die Ueberholmaneover fast unmoeglich machte."
    ),

    Question(
        categoryId = 6,
        questionText = "Was versteht man unter 'Undercut' und 'Overcut' in der Formel-1-Strategie?",
        answerA = "Undercut: frueher an die Box als der Konkurrent, um mit frischen Reifen aufzuholen; Overcut: spaeter pitten und den Konkurrenten ueberholen waehrend er in der Box ist",
        answerB = "Undercut: unter dem Safety Car pitten; Overcut: an der Boxeneinfahrt vorbeifahren und spaeter pitten",
        answerC = "Undercut: weichere Mischung waehlen; Overcut: haertere Mischung fuer laengere Haltbarkeit",
        answerD = "Undercut: in Runde 1 pitten; Overcut: in der letzten moeglichen Runde pitten",
        correctAnswer = 0,
        explanation = "Undercut: Man pit frueher als der Gegner, faehrt schnelle Outlap auf frischen Reifen und kommt vor ihm wieder auf die Strecke. Overcut: Man bleibt laenger drausen auf der Strecke, macht schnelle Rundenzeiten waehrend der Gegner in der Box ist, und ueberholt ihn auf der Strecke.",
        difficulty = 3,
        funFact = "Der Undercut funktioniert am besten, wenn Reifen stark abgebaut haben und Outlap-Zeiten entscheidend sind. 2021 nutzte Max Verstappen den Undercut mehrfach erfolgreich gegen Lewis Hamilton – und umgekehrt. Die Strategie-Abteilungen entscheiden oft den Rennausgang."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das KERS (Kinetic Energy Recovery System) in der Formel 1, und wie viel zusaetzliche Leistung liefert es?",
        answerA = "Ein Turbolader, der Abgasenergie in mechanische Leistung umwandelt; ca. 150 PS extra",
        answerB = "Ein System, das Bremsenergie in elektrische Energie umwandelt und bei Beschleunigung ca. 80 PS bereitstellt",
        answerC = "Ein Schwungmassenspeicher (Flywheel), der mechanische Energie speichert; ca. 60 PS",
        answerD = "Ein Supercharger, der mit ueberschuessigem Motoroel angetrieben wird; ca. 100 PS",
        correctAnswer = 1,
        explanation = "KERS (2009-2013 in der F1) wandelt Bremsenergie in Strom um, speichert ihn in Akkus und gibt ihn auf Knopfdruck als elektrischen Schub zurueck. Es lieferte ca. 81 PS (60 kW) fuer 6,7 Sekunden pro Runde. KERS wurde spaeter zum komplexen ERS (Energy Recovery System) weiterentwickelt.",
        difficulty = 3,
        funFact = "Nicht alle Teams nutzten KERS 2009, weil es schwer und teuer war. Red Bull Racing verzichtete zunaechst darauf und gewann trotzdem fast die Konstrukteurswertung. Heute ist ERS mit MGU-H und MGU-K Pflicht und liefert bis zu 163 PS elektrische Leistung."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das Phaenomen 'Porpoising' in der Formel 1, das 2022 bei Saisonbeginn viele Teams plagierte?",
        answerA = "Ueberhitzen der Reifen auf heissen Strassen, was zu Blasenbildung fuehrt",
        answerB = "Rhythmisches Aufwippen des Fahrzeugs durch alternierenden Auf- und Abtriebsverlust bei Bodeneffekt-Autos",
        answerC = "Vibrationen in der Kardanwelle bei extremen Geschwindigkeitsunterschieden",
        answerD = "Instabilitaet des Hecks unter Hochgeschwindigkeit durch Windkanal-Fehler",
        correctAnswer = 1,
        explanation = "Porpoising entsteht bei Bodeneffekt-Autos (wie 2022 wieder einge-fuehrt): Der Unterboden erzeugt Abtrieb durch Unterdruck. Bei hohen Geschwindigkeiten faehrt das Auto so tief, dass der Luftfluss unterbricht (stall), der Unterdruck kollabiert, das Auto hebt, Luftfluss setzt wieder ein, Abtrieb kommt zurueck – Zyklus wiederholt sich rhythmisch.",
        difficulty = 3,
        funFact = "Lewis Hamilton klagte 2022 nach dem Aserbaidschan GP ueber starke Rueckenschmerzen durch Porpoising in seinem Mercedes. Das Problem zwang die FIA, technische Direktiven zu erlassen. Red Bull litt kaum darunter und dominierte die Saison."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die Funktion des 'MGU-H' im Formel-1-Hybridantrieb (Hybrid Power Unit seit 2014)?",
        answerA = "Motor-Generator-Einheit fuer die Hinterachse, die elektrischen Schub liefert",
        answerB = "Motor-Generator-Einheit am Turbolader: faengt Abgasenergie auf und kann den Turbo vorspulen oder Energie in die Batterie speisen",
        answerC = "Hydraulik-Generator fuer Lenkung und Bremssystem",
        answerD = "Motor-Generator fuer das Kuehlsystem des Verbrennungsmotors",
        correctAnswer = 1,
        explanation = "Die MGU-H (Motor Generator Unit – Heat) sitzt am Turbolader. Sie kann Energie aus dem Abgasstrom ernten (Generator-Modus) oder den Turbo elektrisch antreiben (Motor-Modus), was Turbolag eliminiert. Die gespeicherte Energie kann direkt zur MGU-K (Hinterachse) weitergeleitet werden.",
        difficulty = 3,
        funFact = "Das MGU-H ist das technisch komplexeste Bauteil in der F1-Power-Unit und hat Entwicklungskosten in Millionenhoehe. Ab 2026 wird es in der F1 abgeschafft – die neuen Reglements setzen auf einfachere Hybrid-Systeme, um die Kosten zu senken."
    ),

    // ── Sports Science (5) ────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was beschreibt das 'VO2max' in der Sportwissenschaft, und welcher Wert gilt als Weltklasse fuer Ausdauerathlethen?",
        answerA = "Die maximale Herzfrequenz; Weltklasse: ueber 220 Schlaege/Minute",
        answerB = "Die maximale Sauerstoffaufnahme pro Minute und Koerpergewicht; Weltklasse: ueber 80-90 ml/kg/min",
        answerC = "Das maximale Lungenvolumen; Weltklasse: ueber 10 Liter",
        answerD = "Der maximale Milchsaeurewert im Blut; Weltklasse: unter 2 mmol/l beim Vollsprint",
        correctAnswer = 1,
        explanation = "VO2max ist die maximale Sauerstoffmenge, die der Koerper pro Minute und Kilogramm Koerpergewicht aufnehmen und verwerten kann – in ml/kg/min. Er gilt als bester Praediktor der Ausdauerleistung. Spitzenlaeufer wie Eliud Kipchoge haben Werte ueber 85, Durchschnittsmenschen ca. 35-45.",
        difficulty = 3,
        funFact = "Oskar Svendsen, ein norwegischer Radfahrer, hielt mit 97,5 ml/kg/min den gemessenen Weltrekord. Kjell-Magne Bondevik, ein norwegischer Langlaeufer, hatte 96 ml/kg/min. Eliud Kipchoge, der Marathonweltrekordhalter, hat 'nur' 85 – zeigt, dass Laufoekonomie mindestens so wichtig ist wie VO2max."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Laktatschwelle' (Lactate Threshold) im Ausdauersport, und warum ist sie fuer das Training wichtiger als VO2max?",
        answerA = "Der Punkt, ab dem Milchsaeure den Muskel toetet – Training darueber ist verboten",
        answerB = "Die Intensitaet, bei der die Milchsaeureproduktion die Abbaurate uebersteigt; Training knapp darunter verbessert Ausdauer am effektivsten",
        answerC = "Die maximale Herzfrequenz, bis zu der aerobe Energiegewinnung moeglich ist",
        answerD = "Der Blutzuckerwert, bei dem Glycogen vollstaendig aufgebraucht ist",
        correctAnswer = 1,
        explanation = "An der Laktatschwelle (ca. 2-4 mmol/l Laktat im Blut) kann der Koerper Laktat gerade noch abbauen. Ueber dieser Schwelle haeuft sich Laktat an und zwingt zur Verlangsamung. Training nahe der Schwelle verschiebt sie zu hoeheren Intensitaeten – der Athlet kann laenger schneller laufen.",
        difficulty = 3,
        funFact = "Elite-Marathonlaeufer laufen das gesamte Rennen knapp unterhalb ihrer Laktatschwelle – ca. 85-90% VO2max. Eliud Kipchoge laeuft seinen Sub-2-Stunden-Marathon (~21 km/h) auf Hochleistungsniveau, ohne in den anaeroben Bereich zu kommen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'periodization' (Periodisierung) im Trainingsplan, und welches Modell gilt als Basis aller modernen Ausdauer-Trainingsprogramme?",
        answerA = "Taeglich wechselnde Trainingsintensitaeten fuer maximale Erschoepfung",
        answerB = "Geplante Abwechslung von Belastung und Erholung in Zyklen (Mikro-, Meso-, Makrozyklus)",
        answerC = "Training mit konstanter mittlerer Intensitaet ganzjaehrig ohne Pausen",
        answerD = "Ausschliesslich hochintensives Intervalltraining (HIIT) in Phasen maximaler Leistung",
        correctAnswer = 1,
        explanation = "Periodisierung, entwickelt von Tudor Bompa auf Basis sowjetischer Sportwissenschaft, teilt das Training in Mikrozyklen (Woche), Mesozyklen (Monate) und Makrozyklen (Saisonjahr). Aufbauend-belastende Phasen wechseln mit Erholungsphasen, um Uebertraining zu vermeiden und Supercompensation zu nutzen.",
        difficulty = 3,
        funFact = "Das Konzept der Supercompensation erklaert, warum Erholung genauso wichtig ist wie Training: Nach einer Belastung faellt die Leistung, erholt sich, und steigt kurzzeitig UEBER das Ausgangsniveau – wenn die naechste Belastung im richtigen Moment kommt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt der Begriff 'Sports Specific Adaptation' bei Hochleistungssportlern am Beispiel des Herzens?",
        answerA = "Das Sportler-Herz schlaegt seltener (30-50 Schlaege/min) und hat groessere linke Herzkammer – eine gesunde Anpassung",
        answerB = "Sportler entwickeln Herzrhythmusstorungen als natuerliche Anpassung an hohes Trainingsvolumen",
        answerC = "Das Herz verkleinert sich durch Effizienzgewinn – weniger Masse, mehr Leistung",
        answerD = "Sportler haben verdicktes Herzgewebe (Hypertrophie), was chronisch zu Herzinsuffizienz fuehrt",
        correctAnswer = 0,
        explanation = "Das 'Sportlerherz' zeigt mehrere Anpassungen: Bradykardie (niedrige Ruheherzfrequenz, oft 30-50 Schlaege), vergrosserte linke Herzkammer (erhoehtes Schlagvolumen) und verdicktes Herzmuskelgewebe. Das sind GESUNDE Adaptationen fuer mehr Pumpleistung – nicht krankhaft.",
        difficulty = 3,
        funFact = "Miguel Indurain, fuenffacher Tour-de-France-Sieger, hatte eine Ruheherzfrequenz von 28 Schlaegen pro Minute und ein Lungenvolumen von 8 Litern (Normalwert: 6 Liter). Sein Herz pumpte 50 Liter pro Minute bei Maximalleistung – doppelt so viel wie bei gesunden Untrainierten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Relative Energy Deficiency in Sport' (RED-S), und welche Sportarten sind besonders betroffen?",
        answerA = "Ein Blutarmut-Syndrom durch Eisen-Mangel, besonders im Schwimmen",
        answerB = "Chronisches Energiedefizit, das alle Koerperfunktionen beeintraechtigt; besonders in aesthetischen und Ausdauersportarten",
        answerC = "Ein Ernaehrungs-Supplement-Syndrom bei zu viel Protein-Einnahme im Kraftsport",
        answerD = "Dehydrierung-Syndrom bei Sportlern in Gewichtsklassen-Sportarten",
        correctAnswer = 1,
        explanation = "RED-S (frueherer Name: Female Athlete Triad) beschreibt ein Syndrom, bei dem der Koerper weniger Energie bekommt als er fuer Sport UND koerperliche Grundfunktionen braucht. Folge: Hormonstoerungen, Knochenschwund, Herzrhythmusstorungen, Immunchwaechung. Besonders betroffen: Turnen, Ballett, Ausdauersport, Ringen.",
        difficulty = 3,
        funFact = "RED-S betrifft sowohl Frauen als auch Maenner, obwohl es urspruenglich als 'Female Athlete Triad' bekannt war. Studien zeigen, dass bis zu 45% der Hochleistungssportlerinnen in Aesthetiksportarten betroffen sind – oft ohne es zu wissen."
    ),

    // ── Cricket / Rugby / Baseball (5) ───────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Hat-Trick' im Cricket, und warum ist er seltener als im Fussball?",
        answerA = "Drei Runs in drei aufeinanderfolgenden Schuessen; selten wegen der Entfernung",
        answerB = "Drei Wickets in drei aufeinanderfolgenden Ballen durch denselben Bowler; selten wegen praeziser Bowlingpraezision",
        answerC = "Ein Schlaeger, der drei Sixes in einem Over trifft; selten wegen Pichbeschaffenheit",
        answerD = "Drei aufeinanderfolgende Maidens (keine Runs) – selten wegen guter Schlaeger",
        correctAnswer = 1,
        explanation = "Im Cricket bedeutet Hat-Trick: Ein Bowler nimmt drei Wickets mit drei aufeinanderfolgenden Ballen. Das kann sogar ueber Over-Grenzen oder Innings-Grenzen gehen. Es ist selten, weil der Bowler jedes Mal perfekte Linie und Laenge treffen muss, waehrend der Schlaeger wechselt.",
        difficulty = 3,
        funFact = "Der Begriff 'Hat-Trick' stammt urspruenglich aus dem Cricket: Bowler, die drei Wickets in drei Ballen nahmen, bekamen in der Fruehzeit des Sports einen neuen Hut geschenkt. Erst spaeter uebernahmen Fussball und andere Sportarten den Begriff."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Gainline' im Rugby Union und welche taktische Bedeutung hat es?",
        answerA = "Die Linie, die der Ball nach einer Conversion zwischen den Pfosten passieren muss",
        answerB = "Die imaginaere Linie, ueber die das Angriffsteam hinausmuss, um vorwaerts zu kommen; sie entscheidet ueber Feldpositionierung",
        answerC = "Die 22-Meter-Linie hinter der eigenen Torlinie, die strategische Kicks reguliert",
        answerD = "Die Touchlinie, bei deren Uebertritt der Ball ins Aus ist",
        correctAnswer = 1,
        explanation = "Die Gainline ist die imaginaere Linie entlang der Scrumzone. Ueberquert das Angriffsteam sie konsequent (Yards gained), gewinnt es Feldposition und Schwung. Schafft das Angriffsteam die Gainline nicht zu ueberqueren, verliert es unter Druck und muss kicken.",
        difficulty = 3,
        funFact = "Im modernen Rugby wird jeder Carry (Ball mit dem Koerper tragen) nach Gainline-Durchbruechen ausgewertet. Die Statistik 'Metres after contact' zeigt, wie effektiv ein Spieler die Gainline bricht. Spieler wie Manu Tuilagi (England) oder All Blacks-Mittelfeldspieler sind fuer starke Gainline-Durchbrueche bekannt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was beschreibt die 'Sabermetrics' im Baseball, und welcher Begriff ist ihr bekanntester Ausdruck?",
        answerA = "Die traditionelle Scouting-Methode, bei der Trainer Spieler persoenlich beurteilen",
        answerB = "Die statistische Analyse von Baseball-Daten; OPS (On-base Plus Slugging) ist ein Kernelement",
        answerC = "Die physische Vermessung von Wurfarm und Schlagbewegung per Hochgeschwindigkeitskamera",
        answerD = "Eine Doping-Analytik-Methode fuer MLB-Tests",
        correctAnswer = 1,
        explanation = "Sabermetrics (benannt nach der Society for American Baseball Research, SABR) nutzt statistische Analysen statt traditioneller Beobachtung. OPS (On-base Percentage + Slugging Percentage) kombiniert Trefferquote und Schlagkraft. 'Moneyball' (2011) popularisierte dieses Konzept.",
        difficulty = 3,
        funFact = "Billy Beane und die Oakland Athletics nutzten Sabermetrics 2002, um mit minimalem Budget gegen Teams mit 3-4x hoeherem Gehaltsetat zu konkurrieren. Ihr 20-Spiele-Siegesserie wurde Legende. Heute nutzen alle MLB-Teams ahnliche Ansaetze, und das Konzept hat auch Fussball, Basketball und Cricket beeinflusst."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Beehive Defence' (Bienenschwarm-Verteidigung) im Rugby League?",
        answerA = "Eine Angriffsformation mit vielen schnellen kurzen Paessen im Zentrum",
        answerB = "Eine defensive Strategie, bei der viele Spieler den Balltraeger umschwaermen und einengen",
        answerC = "Eine Kick-Strategie, bei der alle Spieler tief positioniert werden fuer Kick-und-Lauf",
        answerD = "Eine Lineout-Formation mit Taeuschabwehr",
        correctAnswer = 1,
        explanation = "Im Rugby League bezeichnet Beehive Defence eine aggressive Verteidigung, bei der mehrere Spieler schnell auf den Balltraeger konvergieren und ihn umschwamen. Das Ziel ist es, den Ball zu gewinnen oder den Angriff fruehzeitig zu stoppen bevor der Spieler freien Raum gewinnt.",
        difficulty = 3,
        funFact = "Rugby League und Rugby Union unterscheiden sich fundamental: League hat 13 Spieler (Union: 15), keine Lineouts, andere Ruck-Regeln und ein 6-Tackle-System. Viele Spieler haben beide Varianten gespielt, obwohl die Wechsel wegen verschiedener Regeln historisch kontrovers waren."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Spin Rate' (Drehrate) im Baseball-Pitching und warum ist eine hoehere Drehrate bei einem Fastball vorteilhaft?",
        answerA = "Hoehere Drehrate macht den Ball langsamer und ueberraschender",
        answerB = "Hoehere Drehrate erzeugt mehr Magnus-Kraft – der Ball 'steigt' scheinbar oder bricht spaeter",
        answerC = "Hoehere Drehrate verbessert die Praezision durch Gyrostabilisierung",
        answerD = "Hoehere Drehrate ist nur bei Curveballs wichtig; Fastballs brauchen niedrige Drehrate",
        correctAnswer = 1,
        explanation = "Der Magnus-Effekt beschreibt, wie ein rotierender Ball eine Kraft senkrecht zu seiner Flugbahn erfahrt. Ein Fastball mit hoher Backspin-Rate erzeugt Auftrieb – der Ball 'steigt' aus Schlaeger-Sicht (faellt weniger). Das macht ihn schwerer zu treffen, da das visuelle System auf mehr Abfall eingestellt ist.",
        difficulty = 3,
        funFact = "Durch Statcast-Tracking (seit 2015 in der MLB) koennen Spin Rate, Ballgeschwindigkeit und Bewegung millimetergenau gemessen werden. Ein guter Fastball hat 2200-2500 RPM; Spitzenwerte gehen ueber 2800 RPM. Trevor Bauer nutzte legal (dann illegal) Spinrate-Optimierung."
    ),

    // ── Extreme Sports (5) ────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Death Zone' beim Bergsport, und ab welcher Hoehe beginnt sie?",
        answerA = "Die letzten 100 Meter vor dem Gipfel jedes 8000er – gefaehrlich durch Steinschlag",
        answerB = "Hoehen ueber 8.000 Meter, wo der Sauerstoffgehalt fuer dauerhaftes menschliches Leben zu gering ist",
        answerC = "Ein technisch schwieriger Wandabschnitt, der ohne Sicherungsseil besteigen werden muss",
        answerD = "Die Zone zwischen Camp 3 und Camp 4, wo Erfrierungen am wahrscheinlichsten sind",
        correctAnswer = 1,
        explanation = "Die Todeszone beginnt ab 8.000 Metern (manche setzen sie bei 7.500m an). In dieser Hoehe ist der Sauerstoffpartialdruck so niedrig, dass der Koerper langsam abstirbt – selbst wenn man voellig ruhig sitzt. Auf dem Gipfel des Everest (8.849m) betraegt der Sauerstoffgehalt nur noch ca. 30% des Meereshoehenwerts.",
        difficulty = 3,
        funFact = "Reinhold Messner bestieg 1978 den Everest ohne Flaschensauerstoff – als erster Mensch. Er beschrieb den Zustand oben als 'wie durch Watte laufen'. Viele Expeditionen verlassen sich heute auf Sauerstoff – ohne ihn ist die Besteigung extrem lebensgefaehrlich."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Free Solo' im Klettersport, und warum unterscheidet es sich fundamental vom normalen Sportklettern?",
        answerA = "Klettern in einer Solo-Seilschaft ohne Partner, aber mit selbst gelegter Sicherung",
        answerB = "Klettern ohne jegliche Sicherung oder Seil – ein Sturz bedeutet fast sicher den Tod",
        answerC = "Klettern mit Hakenverboten auf historischen Routen",
        answerD = "Klettern nur mit einer Hand als Sportlichkeits-Herausforderung",
        correctAnswer = 1,
        explanation = "Free Solo bedeutet Klettern ohne Seil, Gurte oder Sicherungsgeraete. Jeder Fehler, jedes Abgleiten bedeutet den Tod. Alex Honnold kletterte 2017 den El Capitan (900m Granitwand im Yosemite) frei solo in 3 Stunden 56 Minuten – einer der groessten sportlichen Leistungen der Geschichte.",
        difficulty = 3,
        funFact = "Der Oscar-preisgekroente Dokumentarfilm 'Free Solo' (2018) zeigte Honnolds Vorbereitung und Durchfuehrung. MRT-Scans seines Gehirns zeigten eine unterdurchschnittliche Amygdala-Reaktion auf Angstreize – was moeglicherweise erklaert, wie er mit der extremen Gefahr umgeht."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Wing Suit' und welches physikalische Prinzip ermoeglicht horizontalen Flug?",
        answerA = "Ein aufblasbarer Anzug, der durch Helium Auftrieb erzeugt",
        answerB = "Ein Anzug mit Stoff zwischen Armen und Beinen, der wie ein Fluegelprofil wirkt und Auftrieb durch Vorwaertsfahrt generiert",
        answerC = "Ein motorisierter Anzug mit Mikroturbinen in den Schultern",
        answerD = "Ein Fallschirmanzug, der sich bei bestimmter Geschwindigkeit automatisch entfaltet",
        correctAnswer = 1,
        explanation = "Der Wing Suit hat Stoffmembranen zwischen Armen und Torso sowie zwischen den Beinen. Diese Flaechen wirken wie ein Deltadrachen-Fluegelprofil: Vorwaertsbewegung erzeugt Auftrieb (Bernoulli-Prinzip + Anstellwinkel). Das Gleitverhaeltnis betraegt ca. 2,5:1 – fuer jeden Meter Hoehengewinn faehrt man 2,5 Meter vorwaerts.",
        difficulty = 3,
        funFact = "Wing-Suit-Piloten erreichen Horizontalgeschwindigkeiten von 200-250 km/h und sinken nur ca. 80-100 km/h. Proximity-Flying (dicht ueber Gelaende) ist die extremste Form – Piloten fliegen durch Schluchten und zwischen Baeumen. Die Unfallrate ist extrem hoch."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Big Wave Surfing' und warum gilt Nazare in Portugal als eines der gefaehrlichsten und groessten Surfreviere der Welt?",
        answerA = "Wellen entstehen durch einen submarinen Canyon, der Energie buendelt und Wellen ueber 30 Meter erzeugt",
        answerB = "Nazare hat die groessten kuenstlichen Wellenmaschinen der Welt, gesponsert von Red Bull",
        answerC = "Die Kombination aus Atlantikstuerme und flachem Strandboden verursacht besonders breite Wellen",
        answerD = "Untermeerische Erdbeben vor der Kuesteerzeugen regelmaessige Tsunami-artige Wellen",
        correctAnswer = 0,
        explanation = "Der Nazare-Canyon ist einer der groessten Unterwasser-Schluchtssysteme der Welt – er laeuft fast bis zur Kueste und buendelt Atlantikswell-Energie wie ein riesiger Trichter. Das Ergebnis sind Wellen bis ueber 30 Meter. Sebastian Steudtner surfte 2022 die offiziell groesste je gesurfte Welle: 26,21m.",
        difficulty = 3,
        funFact = "Big Wave Surfer werden oft mit Jetskis in die Wellen gezogen (Tow-In Surfing), weil die Wellen zu schnell anlaufen, um aus eigener Kraft hinein zu paddeln. Nach einem Wipeout (Sturz) kann man unter drei aufeinanderfolgenden Wellen gehalten werden – Ertrinkungsgefahr ist real."
    ),

    Question(
        categoryId = 6,
        questionText = "Was unterscheidet 'Freediving' vom normalen Geraetauchen, und welche physiologischen Schutzreflexe ermoeglichen extreme Tieftauchgaenge?",
        answerA = "Freediving verwendet Sauerstoffflaschen mit kleinerem Volumen; keine besonderen Reflexe",
        answerB = "Freediving ist Tauchen auf einem einzigen Atemzug; Mammalian Dive Reflex (Bradykardie, Blut-Shift) ermoeglicht extreme Tiefen",
        answerC = "Freediving erlaubt Druckluft-Injektionen alle 20 Meter; Reflexe spielen keine Rolle",
        answerD = "Freediving ist nur bis 40 Meter moeglich; tiefer als das ist physisch unmoeglich",
        correctAnswer = 1,
        explanation = "Freediving ist Tauchen auf einem einzigen Atemzug ohne Ausruestung. Der Mammalian Dive Reflex umfasst: Bradykardie (Herzrate sinkt auf 30-50/min), Peripheral Vasoconstriction (Blut zieht sich in lebenswichtige Organe), Blood Shift (Blutplasma fuellt die komprimierten Lungen). Diese Reflexe erlauben erstaunliche Tiefen.",
        difficulty = 3,
        funFact = "Herbert Nitsch tauchte 2012 auf 253,2 Meter – Weltrekord in der 'No-Limits'-Disziplin (mit Gewichten runter, Luftballon hoch). Er erlitt dabei einen Schlaganfall durch Dekompressionskrankheit. Der Rekord steht aber noch. Alexey Molchanov halt mehrere aktuelle Freitauch-Weltrekorde."
    ),
)
