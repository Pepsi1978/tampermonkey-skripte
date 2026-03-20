package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMaster3(): List<Question> = listOf(

    // --- KOMPLEXITAETSTHEORIE: P, NP, NP-VOLLSTAENDIGKEIT, REDUKTIONEN, KLASSEN ---

    // Question 1
    Question(
        categoryId = 12,
        questionText = "Was besagt die formale Definition der Komplexitaetsklasse P genau?",
        answerA = "P ist die Menge aller Entscheidungsprobleme, die von einer deterministischen Turingmaschine in polynomieller Zeit geloest werden koennen",
        answerB = "P ist die Menge aller Probleme, die von einem nichtdeterministischen Algorithmus in polynomieller Zeit verifizierbar sind",
        answerC = "P ist die Menge aller Probleme, deren Loesungen in logarithmischem Speicher berechnet werden koennen",
        answerD = "P ist die Menge aller Probleme, fuer die ein Approximationsalgorithmus mit konstantem Fehler existiert",
        correctAnswer = 0,
        explanation = "P (Polynomial Time) ist formal definiert als die Vereinigung aller Klassen TIME(n^k) fuer konstante k >= 1. Ein Problem liegt in P, wenn eine deterministische Turingmaschine existiert, die es in O(n^k) Schritten loest. Die Schluessel-Eigenschaft ist die Kombination aus Determinismus und polynomieller Laufzeit — beides zusammen ist notwendig.",
        difficulty = 5,
        funFact = "Der Begriff 'tractable' (gut handhabbar) wurde von Alan Cobham und Jack Edmonds in den 1960ern gepraegt. Sie erkannten, dass polynomielle Algorithmen in der Praxis meist effizient sind — obwohl O(n^100) theoretisch polynomial, aber praktisch unbrauchbar waere."
    ),

    // Question 2
    Question(
        categoryId = 12,
        questionText = "Welche zwei aequivalenten Definitionen hat die Klasse NP?",
        answerA = "NP ist die Klasse der Probleme, die in nicht-polynomieller Zeit loesbar sind, und alternativ jene Probleme, die eine exponentielle Zertifikatspruefung erlauben",
        answerB = "NP ist (1) die Klasse der Entscheidungsprobleme, die von einer nichtdeterministischen Turingmaschine in polynomieller Zeit geloest werden koennen, und aequivalent (2) die Klasse der Probleme, fuer die ein polynomieller Verifizierer fuer 'Ja'-Instanzen existiert",
        answerC = "NP ist die Klasse der Probleme mit polynomiell verifzierbaren und polynomiell losbaren Zertifikaten",
        answerD = "NP ist die Klasse aller Optimierungsprobleme, die in polynomieller Zeit naeherungsweise geloest werden koennen",
        correctAnswer = 1,
        explanation = "NP hat zwei klassische Charakterisierungen: (1) Nichtdeterministische Polynomialzeit: Eine NDTM rät eine Lösung und verifiziert sie in polynomieller Zeit. (2) Zertifikat-Definition: Für jede Ja-Instanz existiert ein polynomiell langes Zertifikat, das ein deterministischer polynomieller Verifizierer akzeptiert. Beide Definitionen beschreiben exakt dieselbe Klasse — das ist ein nichttriviales Theorem.",
        difficulty = 5,
        funFact = null
    ),

    // Question 3
    Question(
        categoryId = 12,
        questionText = "Stephen Cook bewies 1971 den nach ihm benannten Satz. Was genau besagt der Satz von Cook (Cook-Levin-Theorem)?",
        answerA = "Jedes NP-vollstaendige Problem kann in polynomieller Zeit auf jedes andere NP-Problem reduziert werden",
        answerB = "Das Erfuellbarkeitsproblem der Aussagenlogik (SAT) ist NP-vollstaendig — d.h. es liegt in NP und jedes Problem aus NP kann in polynomieller Zeit auf SAT reduziert werden",
        answerC = "Es gibt kein deterministisches polynomielles Verfahren fuer das SAT-Problem, falls P ungleich NP gilt",
        answerD = "SAT ist in der Klasse PSPACE, aber nicht in NP enthalten",
        correctAnswer = 1,
        explanation = "Der Satz von Cook-Levin (1971/1973) zeigt: SAT ist NP-vollstaendig. Der Beweis ist zweistufig: Erstens zeigt Cook, dass SAT in NP liegt (ein Zertifikat — eine erfuellende Belegung — ist polynomiell verifizierbar). Zweitens zeigt er, dass jede Turingmaschine in polynomieller Zeit in eine SAT-Formel uebersetzt werden kann — also jedes NP-Problem polynomiell auf SAT reduzierbar ist. Leonid Levin publizierte 1973 unabhaengig ein aehnliches Ergebnis.",
        difficulty = 5,
        funFact = "Cook veroeffentlichte seinen Beweis mit 29 Jahren. Das Papier 'The Complexity of Theorem Proving Procedures' gilt als eines der wichtigsten Werke der theoretischen Informatik — obwohl der STOC-Programmausschuss ursprünglich skeptisch war."
    ),

    // Question 4
    Question(
        categoryId = 12,
        questionText = "Was ist eine Polynomialzeit-Reduktion (auch Many-One-Reduktion oder Karp-Reduktion) und warum ist sie fuer die NP-Vollstaendigkeit zentral?",
        answerA = "Eine Reduktion A ≤p B ist eine Funktion f, die in polynomieller Zeit berechenbar ist und Ja-Instanzen von A auf Ja-Instanzen von B und Nein-Instanzen auf Nein-Instanzen abbildet — damit wird B mindestens so schwer wie A",
        answerB = "Eine Reduktion ist ein Algorithmus, der B mithilfe eines einzigen Aufrufs von A loest",
        answerC = "Eine polynomielle Reduktion bedeutet, dass A in polynomiell vielen Schritten auf B zurueckgefuehrt wird, aber B selbst nur exponentiell loesbar ist",
        answerD = "Eine Many-One-Reduktion erlaubt beliebig viele Anfragen an ein Orakel fuer B, muss jedoch selbst in polynomieller Zeit terminieren",
        correctAnswer = 0,
        explanation = "Eine Polynomialzeit-Many-One-Reduktion A ≤p B ist eine in polynomieller Zeit berechenbare Funktion f: {0,1}* → {0,1}*, sodass gilt: x ∈ A genau dann, wenn f(x) ∈ B. Entscheidend: Die Transitivitaet. Wenn A ≤p B und B ≤p C, dann A ≤p C. Ist B in P, folgt damit A ∈ P. Ist A NP-schwer und A ≤p B mit B ∈ NP, dann ist B NP-vollstaendig. Die Karp-Reduktion unterscheidet sich von der Cook-/Turing-Reduktion darin, dass nur ein einziger Aufruf erlaubt ist — die Many-One-Natur.",
        difficulty = 5,
        funFact = "Richard Karp bewies 1972 die NP-Vollstaendigkeit von 21 kombinatorischen Problemen — allesamt durch Ketten von Reduktionen aus dem SAT-Problem. Diese Liste, 'Karps 21 Probleme', ist ein Meilenstein der Informatik."
    ),

    // Question 5
    Question(
        categoryId = 12,
        questionText = "Welche formale Bedingung muss ein Problem B erfuellen, damit es als NP-schwer (NP-hard) bezeichnet wird?",
        answerA = "B muss in NP liegen und von einem polynomiellen Algorithmus loesbar sein",
        answerB = "B muss nicht notwendigerweise in NP liegen, aber jedes Problem A aus NP muss polynomiell auf B reduzierbar sein (A ≤p B fuer alle A ∈ NP)",
        answerC = "B muss mindestens so schwer wie ein bekanntes NP-vollstaendiges Problem sein und selbst in NP liegen",
        answerD = "B muss exponentiellen Speicher benoetigen und in EXPSPACE liegen",
        correctAnswer = 1,
        explanation = "NP-schwer bedeutet: Fuer alle A ∈ NP gilt A ≤p B. Das bedeutet, B ist mindestens so schwer wie das schwerste NP-Problem — B koennte jedoch ausserhalb von NP liegen. NP-vollstaendig = NP-schwer ∩ NP. Das Halteproblem etwa ist NP-schwer, aber nicht NP-vollstaendig, da es nicht entscheidbar und damit nicht in NP ist. Das Schachproblem (beliebige Brettgroesse) ist PSPACE-schwer und damit auch NP-schwer.",
        difficulty = 5,
        funFact = null
    ),

    // Question 6
    Question(
        categoryId = 12,
        questionText = "Warum impliziert ein polynomieller Algorithmus fuer ein einzelnes NP-vollstaendiges Problem, dass P = NP gilt?",
        answerA = "Weil NP-vollstaendige Probleme per Definition in P liegen muessen",
        answerB = "Weil alle NP-Probleme polynomiell auf ein NP-vollstaendiges Problem reduzierbar sind — ein polynomieller Algorithmus fuer dieses Problem kombiniert mit der Reduktion ergibt polynomielle Algorithmen fuer alle NP-Probleme",
        answerC = "Weil der SAT-Algorithmus direkt alle anderen NP-Probleme loest, ohne Reduktion zu benoetigen",
        answerD = "Weil NP eine Teilmenge von P ist, sobald ein Problem aus NP polynomiell loesbar ist",
        correctAnswer = 1,
        explanation = "Sei X NP-vollstaendig und gelte X ∈ P. Fuer jedes beliebige Problem Y ∈ NP gilt per Definition Y ≤p X (polynomielle Reduktion). Nun kann Y wie folgt geloest werden: (1) Reduziere y zu x = f(y) in polynomieller Zeit. (2) Loese X auf x in polynomieller Zeit. Beide Schritte sind polynomial — ihre Komposition ebenfalls. Also Y ∈ P. Da Y beliebig aus NP war, gilt NP ⊆ P. Zusammen mit P ⊆ NP folgt P = NP.",
        difficulty = 5,
        funFact = "Gemaess einer Umfrage unter Informatikern glaubten 2019 bereits 99% der Experten, dass P ≠ NP gilt — bewiesen ist es bis heute nicht. Das Clay Mathematics Institute hat fuer den Beweis ein Preisgeld von einer Million US-Dollar ausgeschrieben."
    ),

    // Question 7
    Question(
        categoryId = 12,
        questionText = "Was ist das Traveling Salesman Problem (TSP) in seiner Entscheidungsversion, und welche Komplexitaetsklasse hat es?",
        answerA = "TSP fragt: 'Gibt es eine Rundreise durch alle n Staedte mit Gesamtkosten hoechstens k?' — und liegt in P",
        answerB = "TSP fragt: 'Gibt es eine Rundreise durch alle n Staedte mit Gesamtkosten hoechstens k?' — und ist NP-vollstaendig",
        answerC = "TSP fragt nach der kuerzesten Rundreise und ist ein Optimierungsproblem in der Klasse APX",
        answerD = "TSP ist PSPACE-vollstaendig, da es exponentielle Speichermengen erfordert",
        correctAnswer = 1,
        explanation = "Die Entscheidungsversion von TSP lautet: Gegeben ein vollstaendiger Graph mit Kantengewichten und eine Schranke k — existiert ein Hamiltonkreis mit Gesamtgewicht ≤ k? Richard Karp zeigte 1972, dass TSP-Entscheidung NP-vollstaendig ist (via Reduktion vom Hamiltonkreisproblem). Das Optimierungsproblem (kuerzeste Tour) ist NP-schwer. Bei 15 deutschen Staedten gibt es bereits 43 Milliarden moegliche Routen — bei 50 Staedten mehr als die Anzahl der Atome im Universum.",
        difficulty = 5,
        funFact = "Der beste bekannte exakte TSP-Algorithmus hat Laufzeit O(2^n * n^2) — das sog. Held-Karp-Algorithmus (1962). Fuer 300 Staedte wuerde selbst dieser den Urknall um Milliarden Jahre ueberdauern."
    ),

    // Question 8
    Question(
        categoryId = 12,
        questionText = "Was ist das 3-SAT-Problem, und warum ist seine NP-Vollstaendigkeit bedeutsamer als die von allgemeinem SAT?",
        answerA = "3-SAT ist SAT mit genau drei Variablen — es ist einfacher als SAT und liegt in P",
        answerB = "3-SAT ist SAT, bei dem jede Klausel genau drei Literale hat — es ist NP-vollstaendig und besonders nuetzlich als Ausgangspunkt fuer Reduktionen, da seine eingeschraenkte Struktur viele Reduktionen vereinfacht",
        answerC = "3-SAT ist eine Variante von SAT mit polynomiell losbaren Instanzen, wenn die Formel in 3-KNF vorliegt",
        answerD = "3-SAT ist aequivalent zu 2-SAT und damit in polynomieller Zeit loesbar",
        correctAnswer = 1,
        explanation = "3-SAT ist die Teilmenge von SAT, bei der jede Klausel genau drei Literale enthaelt (konjunktive Normalform). Cook/Levin zeigten zuerst die NP-Vollstaendigkeit von SAT, dann zeigt eine einfache Reduktion SAT ≤p 3-SAT. 3-SAT ist bevorzugter Ausgangspunkt fuer Reduktionen, weil die feste Klausellaenge von 3 elegante Gadget-Konstruktionen erlaubt. Wichtig: 2-SAT (jede Klausel hat hoechstens 2 Literale) liegt in P — der Uebergang von 2 zu 3 Literalen macht das Problem NP-vollstaendig!",
        difficulty = 5,
        funFact = "Der Phasenuebergang von loesbar zu unloesbar bei zufaelligem 3-SAT tritt bei etwa 4.267 Klauseln pro Variable auf — ein Phaenomen, das Physiker mit Phasenuebegaengen in der statistischen Mechanik in Verbindung bringen."
    ),

    // Question 9
    Question(
        categoryId = 12,
        questionText = "Die Church-Turing-These ist kein mathematisches Theorem, sondern eine These. Was unterscheidet eine mathematische These von einem Theorem in diesem Kontext?",
        answerA = "Eine These kann im Gegensatz zu einem Theorem durch Gegenbeispiele widerlegt werden",
        answerB = "Die Church-Turing-These ist nicht beweisbar, weil der Begriff 'intuitiv berechenbar' nicht formal definiert ist — sie verbindet ein informelles Konzept (was ein Mensch berechnen koennte) mit einem formalen Modell (Turingmaschine)",
        answerC = "Die These gilt nur fuer deterministische Berechnungen, nicht fuer probabilistische oder Quantenalgorithmen",
        answerD = "Eine These ist ein axiomatisches Postulat, das als Grundlage fuer weitere Beweise dient, ohne selbst begruendet zu sein",
        correctAnswer = 1,
        explanation = "Die Church-Turing-These lautet: 'Die Klasse der Turing-berechenbaren Funktionen stimmt mit der Klasse der intuitiv berechenbaren Funktionen ueberein.' Sie ist nicht beweisbar, weil 'intuitiv berechenbar' kein formaler Begriff ist — man koennte ihn nicht in ein Axiomensystem einbetten. Die These wird durch Evidenz gestuetzt: Alle bisher entwickelten Berechnungsmodelle (Lambda-Kalkuel, Markov-Algorithmen, Registermaschinen, Mu-rekursive Funktionen) erweisen sich als aequivalent zur Turingmaschine.",
        difficulty = 5,
        funFact = null
    ),

    // Question 10
    Question(
        categoryId = 12,
        questionText = "Was ist die Komplexitaetsklasse PSPACE, und welche charakteristische Eigenschaft hat das Spiel QBF (Quantified Boolean Formula)?",
        answerA = "PSPACE ist die Klasse aller Probleme loesbar in polynomial beschraenktem Speicher; QBF ist NP-vollstaendig",
        answerB = "PSPACE ist die Klasse der Probleme loesbar in polynomiellem Speicher (nicht begrenzte Zeit); QBF (TQBF) ist PSPACE-vollstaendig",
        answerC = "PSPACE enthaelt alle Probleme aus NP und co-NP; QBF liegt in der Schnittmenge beider Klassen",
        answerD = "PSPACE ist aequivalent zu EXPTIME; QBF ist das kanonische EXPTIME-vollstaendige Problem",
        correctAnswer = 1,
        explanation = "PSPACE = {L | L ist loesbar mit polynomiellem Speicher, beliebiger Zeit}. Es gilt P ⊆ NP ⊆ PSPACE ⊆ EXPTIME, wobei P ⊊ EXPTIME bewiesen ist (Time Hierarchy Theorem), die mittleren Inklusionen jedoch ungeklaert sind. TQBF (True Quantified Boolean Formulas) — das Erfuellbarkeitsproblem quantifizierter Boolescher Formeln — ist PSPACE-vollstaendig. Komplexe Zwei-Personen-Spiele wie Schach (allgemein) oder STRIPS-Planung sind typischerweise PSPACE-vollstaendig.",
        difficulty = 5,
        funFact = "Savitch's Theorem (1970) beweist: NPSPACE = PSPACE. Das bedeutet, nichtdeterministischer polynomieller Speicher ist nicht maechtiger als deterministischer polynomieller Speicher — ein unerwartetes Ergebnis ohne Analogon bei der Zeitkomplexitaet."
    ),

    // Question 11
    Question(
        categoryId = 12,
        questionText = "Was besagt das Time Hierarchy Theorem, und welche direkte Konsequenz hat es fuer die Beziehung P vs. EXPTIME?",
        answerA = "Das Time Hierarchy Theorem besagt, dass mehr Zeit mehr Probleme loesen kann — formal: fuer zeitkonstruierbare t(n) gilt TIME(t(n)) ⊊ TIME(t(n) log t(n)); daraus folgt P ⊊ EXPTIME (strikt)",
        answerB = "Das Theorem besagt, dass NP und P die gleiche Berechnungsstaerke haben, wenn exponentielle Ressourcen verfuegbar sind",
        answerC = "Das Theorem beweist P ≠ NP durch einen diagonalen Widerspruch",
        answerD = "Das Time Hierarchy Theorem belegt, dass PSPACE ⊆ P gilt, wenn Speicher ohne Zeitkosten verfuegbar ist",
        correctAnswer = 0,
        explanation = "Das Time Hierarchy Theorem (Hartmanis & Stearns, 1965): Fuer zeitkonstruierbare Funktionen f(n) und g(n) mit f(n) log f(n) = o(g(n)) gilt TIME(f(n)) ⊊ TIME(g(n)). Angewandt auf P vs. EXPTIME: Da n^k = o(2^n) fuer jedes k, folgt P ⊊ EXPTIME — d.h. es gibt Probleme, die exponentielle Zeit benoetigen, aber nicht in polynomieller Zeit loesbar sind. Interessanterweise beweist das Theorem NICHT P ≠ NP, da nichtdeterministische Klassen schwieriger zu behandeln sind.",
        difficulty = 5,
        funFact = "Juris Hartmanis und Richard Stearns erhielten 1993 den Turing Award — den 'Nobelpreis der Informatik' — fuer ihre grundlegenden Beitraege zur Berechungstheorie, darunter das Time Hierarchy Theorem."
    ),

    // Question 12
    Question(
        categoryId = 12,
        questionText = "Welche Bedeutung hat das Rucksackproblem (Knapsack) fuer die Kryptographie, obwohl es NP-schwer ist?",
        answerA = "Das Rucksackproblem ist die Grundlage des RSA-Kryptosystems, da seine NP-Schwere direkte Sicherheitsgarantien liefert",
        answerB = "Das Merkle-Hellman-Kryptosystem basierte auf einer speziellen (superincreasing) Knapsack-Variante — es wurde jedoch durch einen polynomiellen Angriff (Shamir, 1982) gebrochen, was zeigt, dass NP-Schwere im Worst Case keine kryptographische Sicherheit garantiert",
        answerC = "Das Rucksackproblem ist die Basis des Diffie-Hellman-Schluesseltauschs und wird zur sicheren Schluesselerzeugung genutzt",
        answerD = "NP-schwere Probleme koennen prinzipiell nie kryptographisch nuetzlich sein, da ihre Sicherheit nur auf Worst-Case-Annahmen basiert",
        correctAnswer = 1,
        explanation = "Merkle und Hellman (1978) konstruierten ein Public-Key-Kryptosystem basierend auf dem Subset-Sum/Knapsack-Problem. Die oeffentliche Schluesselerzeugung verbarg eine einfach loesbare (superincreasing) Knapsack-Instanz hinter einer modularen Transformation. Adi Shamir (1982) brach das System mit dem LLL-Gitterreduktions-Algorithmus in polynomieller Zeit. Die Lektion: NP-Schwere ist eine Worst-Case-Eigenschaft — kryptographische Sicherheit erfordert Average-Case-Haerte oder One-Way-Funktionen unter bestimmten Zufallsmodellen.",
        difficulty = 5,
        funFact = "Ralph Merkle war 22 Jahre alt, als er mit seiner Seminararbeit ueber Public-Key-Kryptographie das Fundament der modernen Informationssicherheit legte. Sein Professor gab ihm eine mittelmaeßige Note — er verstand das Paper nicht."
    ),

    // Question 13
    Question(
        categoryId = 12,
        questionText = "Was ist der Unterschied zwischen NP und co-NP, und was wuerde folgen, wenn NP = co-NP?",
        answerA = "co-NP ist die Komplementklasse zu NP: Ein Problem liegt in co-NP, wenn seine Komplement-Sprache in NP liegt. Falls NP = co-NP, wuerde folgen, dass die polynomielle Hierarchie auf der zweiten Stufe kollabiert",
        answerB = "co-NP enthaelt alle Probleme, die in NP sind und zugleich in P liegen. NP = co-NP wuerde P = NP implizieren",
        answerC = "co-NP ist identisch mit PSPACE und enthaelt daher alle NP-Probleme ohnehin",
        answerD = "co-NP ist die Klasse der Probleme, fuer die Nein-Instanzen in polynomieller Zeit verifiziert werden koennen; NP = co-NP gilt trivialerweise fuer alle Probleme in P",
        correctAnswer = 0,
        explanation = "Fuer ein Problem L definiert man co-L als sein Komplement {x | x ∉ L}. co-NP enthaelt alle Probleme, deren Komplement in NP liegt. UNSAT (unerfuellbare Formeln) ist co-NP-vollstaendig. Es ist offen, ob NP = co-NP gilt, aber es wird vermutet, dass NP ≠ co-NP. Falls NP = co-NP, kollabierte die polynomielle Hierarchie (PH) auf der zweiten Stufe — ein weitreichendes Konsequenzen-Beben durch die gesamte Komplexitaetstheorie. P ⊆ NP ∩ co-NP ist bewiesen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 14
    Question(
        categoryId = 12,
        questionText = "Das P-NP-Problem ist eines der sieben Millenniumsprobleme des Clay Mathematics Institute. Welches ist das einzige bisher geloeste Millenniumsproblem?",
        answerA = "Die Riemannsche Vermutung — bewiesen 2004 durch Andrew Wiles",
        answerB = "Die Poincaré-Vermutung — bewiesen 2002/2003 durch Grigori Perelman, der das Preisgeld von 1 Million Dollar ablehnte",
        answerC = "Das Navier-Stokes-Problem — geloest 2010 durch ein russisch-amerikanisches Forscherteam",
        answerD = "Die Birch-und-Swinnerton-Dyer-Vermutung — bewiesen 2008 durch Terrence Tao",
        correctAnswer = 1,
        explanation = "Das Clay Mathematics Institute formulierte im Jahr 2000 sieben Millenniumsprobleme mit je 1 Million Dollar Preisgeld. Bis 2026 ist nur die Poincaré-Vermutung geloest: Sie besagt, dass jede einfach zusammenhaengende, geschlossene 3-Mannigfaltigkeit hoemomorph zur 3-Sphaere ist. Grigori Perelman bewies sie 2002-2003 mit Richardosr Hamiltons Ricci-Flow-Methode. Er lehnte sowohl das Preisgeld als auch die Fields-Medaille ab.",
        difficulty = 5,
        funFact = "Perelman lebt als Einsiedler in St. Petersburg bei seiner Mutter. Auf die Frage nach dem Preisgeld soll er gesagt haben: 'Ich habe alles, was ich brauche.' Die Mathematik-Community war gleichzeitig beeindruckt und ratlos."
    ),

    // Question 15
    Question(
        categoryId = 12,
        questionText = "Was ist das Graphfaerbungsproblem (Graph Coloring) in seiner Entscheidungsversion, und warum ist 3-COLORING NP-vollstaendig, aber 2-COLORING in P?",
        answerA = "3-COLORING ist NP-vollstaendig, weil es auf SAT zurueckfuehrbar ist; 2-COLORING liegt in P weil es aequivalent zur Bipartitheit ist, die linear erkennbar ist",
        answerB = "3-COLORING liegt in P, aber das Optimierungsproblem (minimale Farbanazhl) ist NP-vollstaendig",
        answerC = "2-COLORING ist NP-vollstaendig bei dichten Graphen, aber polynomiell bei planaren Graphen",
        answerD = "Beide Probleme sind NP-vollstaendig; 2-COLORING gilt nur deshalb als einfacher, weil es spezielle Approximationen erlaubt",
        correctAnswer = 0,
        explanation = "k-COLORING fragt: Kann ein Graph G mit k Farben so gefaerbt werden, dass keine zwei adjazenten Knoten dieselbe Farbe haben? 2-COLORING ≡ Bipartitheit-Test: Ein Graph ist 2-faerbbar genau dann, wenn er keinen ungeraden Kreis enthaelt — dies ist mit BFS/DFS in O(n+m) entscheidbar. 3-COLORING ist NP-vollstaendig (Karp, 1972), auch fuer planare Graphen. Der Vier-Farben-Satz (bewiesen 1976 computergestuetzt) besagt, dass planare Graphen stets 4-faerbbar sind — aber ob 3 Farben genuegen, bleibt NP-schwer zu entscheiden.",
        difficulty = 5,
        funFact = "Der Vier-Farben-Satz war der erste bedeutende mathematische Satz, der mit Computerunterstuetzung bewiesen wurde (Appel & Haken, 1976). Viele Mathematiker waren unzufrieden, da kein Mensch den Beweis vollstaendig verifizieren kann — er reduziert sich auf 1.936 Fallunterscheidungen."
    ),

    // Question 16
    Question(
        categoryId = 12,
        questionText = "Welche Aussage ueber die polynomielle Hierarchie (PH) ist korrekt?",
        answerA = "PH ist die Vereinigung aller Klassen Σ^p_k und Π^p_k fuer k ≥ 0; es gilt Σ^p_0 = Π^p_0 = P, und PH kollabiert auf Stufe k falls Σ^p_k = Π^p_k",
        answerB = "PH ist eine Obermenge von PSPACE und enthaelt alle bekannten Komplexitaetsklassen",
        answerC = "PH kollabiert vollstaendig zu P, falls ein einziges NP-vollstaendiges Problem in co-NP liegt",
        answerD = "Die polynomielle Hierarchie ist endlich und endet auf Stufe 3, da hoeherstufigeOrakelanfragen keine neuen Probleme liefern",
        correctAnswer = 0,
        explanation = "Die polynomielle Hierarchie ist definiert durch: Σ^p_0 = Π^p_0 = P, Σ^p_{k+1} = NP^{Σ^p_k} (NP mit Σ^p_k-Orakel), Π^p_{k+1} = co-NP^{Σ^p_k}. PH = ∪_k Σ^p_k ⊆ PSPACE. Wichtige Konsequenz: Falls P = NP (oder allgemein falls Σ^p_k = Π^p_k fuer irgendein k), kollabiert PH auf diese Stufe. Man erwartet PH ⊊ PSPACE, aber kein striktes Enthaltensein wurde bewiesen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 17
    Question(
        categoryId = 12,
        questionText = "Was ist ein NP-Orakel, und was bedeutet P^NP in der Komplexitaetstheorie?",
        answerA = "P^NP ist die Klasse der Probleme in P — das Orakel hat keinen Einfluss auf polynomielle Laufzeit",
        answerB = "P^NP ist die Klasse der Probleme, die von einer deterministischen polynomiellen Turingmaschine geloest werden koennen, die in konstanter Zeit Antworten auf beliebige NP-Fragen erhalten kann (Orakelzugriff) — P^NP = Δ^p_2 und enthaelt z.B. das Problem, die lexikographisch letzte erfuellende Belegung zu finden",
        answerC = "P^NP bedeutet, dass eine polynomielle Maschine exponentielle Ressourcen hat, solange sie kein NP-hartes Problem direkt loest",
        answerD = "P^NP ist identisch mit PSPACE, da beliebige NP-Orakelzugriffe exponentielle Berechnungen simulieren koennen",
        correctAnswer = 1,
        explanation = "Ein Orakel-Turingmaschine A^B kann Anfragen 'Ist x in B?' in einem Schritt stellen. P^NP (= Δ^p_2) ist die zweite Stufe der polynomiellen Hierarchie. Typische P^NP-Probleme: Lexikographisch groesste/kleinste SAT-Loesung finden, Eindeutigkeit der Loesung pruefen, Optimierungsversionen von NP-Problemen. Das Baker-Gill-Solovay-Theorem (1975) zeigt: Es gibt Orakel A, B mit P^A = NP^A und P^B ≠ NP^B — also kann P vs. NP nicht durch Diagonalisierungsargumente allein bewiesen werden.",
        difficulty = 5,
        funFact = "Das Baker-Gill-Solovay-Ergebnis demoralisierte viele Forscher, da die 'naiven' Beweistechniken fuer P ≠ NP systematisch ausgeschlossen wurden. Es war ein struktureller Nachweis, dass neue mathematische Ideen gebraucht werden."
    ),

    // Question 18
    Question(
        categoryId = 12,
        questionText = "Was ist der Satz von Rice, und welche praktische Konsequenz hat er fuer Softwareverifikation?",
        answerA = "Der Satz von Rice besagt, dass alle semantischen Eigenschaften von Turingmaschinen (Eigenschaften ihrer berechneten Funktion) unentscheidbar sind — damit ist keine allgemeine statische Analyse moeglich, die alle Programme korrekt klassifiziert",
        answerB = "Der Satz von Rice beweist, dass das Halteproblem in NP liegt, aber nicht in P",
        answerC = "Rice's Theorem besagt, dass jede Eigenschaft die mehr als die Haelfte aller Programme hat, in polynomieller Zeit entscheidbar ist",
        answerD = "Der Satz besagt, dass jede syntaktische Eigenschaft von Programmen unentscheidbar ist, aber semantische Eigenschaften stets entscheidbar sind",
        correctAnswer = 0,
        explanation = "Henry Gordon Rice bewies 1953: Sei P eine nichttriviale semantische Eigenschaft von Turingmaschinen (d.h. manche TMs haben P, manche nicht, und P haengt nur von der berechneten Funktion ab). Dann ist die Frage 'Besitzt TM M die Eigenschaft P?' unentscheidbar. Beispiele: 'Haelt M auf leerer Eingabe?', 'Berechnet M die Quadratfunktion?', 'Gibt M jemals 42 aus?'. Konsequenz: Es gibt keinen perfekten Virenscanner, keinen vollstaendigen Bug-Finder, keinen allgemeinen Korrektheitspruefper fuer beliebige Programme.",
        difficulty = 5,
        funFact = "Anti-Virus-Software steht damit vor einem theoretisch unloesbarenProblem: Es ist unmoeglich, jeden Virus algorithmisch korrekt zu identifizieren. Praxis-Loesung: Heuristiken und Signaturen — kein vollstaendiger theoretischer Ansatz."
    ),

    // Question 19
    Question(
        categoryId = 12,
        questionText = "Welche Beziehung besteht zwischen dem Erfuellbarkeitsproblem (SAT) und dem Clique-Problem, und wie wird die Reduktion 3-SAT ≤p CLIQUE typischerweise konstruiert?",
        answerA = "3-SAT wird auf CLIQUE reduziert, indem fuer jede Klausel ein Dreieck (3 Knoten) erstellt wird und Kanten zwischen kompatiblen Literalen aus verschiedenen Klauseln eingefuegt werden — eine Clique der Groesse k (Anzahl Klauseln) entspricht einer erfuellenden Belegung",
        answerB = "CLIQUE wird auf 3-SAT reduziert, indem Knotenpaare als Boolesche Variablen kodiert werden und Kantenbedingungen als Klauseln",
        answerC = "Die Reduktion verwendet einen Gadget-Trick, bei dem jede Variable in 3-SAT einem Clique-Knoten und jede Klausel einer Kante entspricht",
        answerD = "SAT und CLIQUE sind inkomparabel — es existiert keine direkte polynomielle Reduktion zwischen ihnen ohne Umweg ueber ein drittes NP-vollstaendiges Problem",
        correctAnswer = 0,
        explanation = "Sei phi eine 3-SAT-Formel mit k Klauseln C_1,...,C_k. Konstruiere Graph G: Fuer jede Klausel C_i = (l_i1 ∨ l_i2 ∨ l_i3) erstelle drei Knoten (i,1), (i,2), (i,3). Fuege eine Kante zwischen (i,j) und (i',j') ein, wenn i ≠ i' und l_ij nicht das Komplement von l_{i'j'} ist. Dann: phi ist erfuellbar ⟺ G hat eine k-Clique. Eine erfuellende Belegung waehlt pro Klausel ein wahres Literal — diese k Literale bilden die Clique. Dies beweist CLIQUE ist NP-vollstaendig (Karp, 1972).",
        difficulty = 5,
        funFact = null
    ),

    // Question 20
    Question(
        categoryId = 12,
        questionText = "Was ist das Vertex Cover Problem und in welcher Beziehung steht es zum Independent Set Problem?",
        answerA = "Vertex Cover und Independent Set sind vollkommen verschiedene Probleme ohne bekannte Verbindung",
        answerB = "Ein Vertex Cover von G ist ein Independent Set im Komplement-Graphen G̅ — daher sind beide Probleme polynomiell aequivalent; V ist ein Vertex Cover ⟺ V̄ = V(G) \\ V ist ein Independent Set",
        answerC = "Independent Set ist einfacher als Vertex Cover: Independent Set liegt in P, waehrend Vertex Cover NP-vollstaendig ist",
        answerD = "Vertex Cover und Independent Set sind komplementaere Suchprobleme, aber ihre Entscheidungsversionen liegen in verschiedenen Komplexitaetsklassen",
        correctAnswer = 1,
        explanation = "In einem Graphen G = (V,E): S ⊆ V ist ein Vertex Cover ⟺ V \\ S ist ein Independent Set (unabhaengige Menge). Denn: Jede Kante wird von S bedeckt (V Cover) ⟺ keine Kante liegt vollstaendig in V\\S (Independent Set). Folge: Minimum Vertex Cover Groesse k ⟺ Maximum Independent Set Groesse n-k. Beide Probleme sind NP-vollstaendig (NP-schwer fuer allgemeine Graphen). Diese duale Struktur ermoeglicht elegante Reduktionen zwischen NP-Problemen.",
        difficulty = 5,
        funFact = "Das Koenig-Theorem (1931) besagt: In bipartiten Graphen gilt |Maximum Matching| = |Minimum Vertex Cover|. Fuer allgemeine Graphen gilt dies nicht — und genau diese Diskrepanz ist der Kern vieler NP-Haertebeweise."
    ),

    // Question 21
    Question(
        categoryId = 12,
        questionText = "Was ist das Subset-Sum-Problem, und warum ist es NP-vollstaendig trotz seiner scheinbaren Einfachheit?",
        answerA = "Subset-Sum fragt: Gibt es eine Teilmenge S einer Menge von ganzen Zahlen, die einen Zielwert t ergibt? Es liegt in NP (Zertifikat: die Teilmenge S), und es ist NP-schwer via Reduktion aus 3-SAT durch Variable-Kodierung in Dezimalzahlen",
        answerB = "Subset-Sum liegt in P, da dynamische Programmierung eine pseudopolynomielle Loesung liefert, die polynomiell in der Eingabezahl ist",
        answerC = "Subset-Sum ist NP-vollstaendig nur fuer Mengen mit mehr als n² Elementen; kleinere Instanzen sind polynomiell loesbar",
        answerD = "Subset-Sum ist schwach NP-vollstaendig und liegt daher in FP (Funktionsprobleme polynomieller Zeit)",
        correctAnswer = 0,
        explanation = "Subset-Sum: Gegeben eine Menge {a_1,...,a_n} und Zielwert t — gibt es I ⊆ {1,...,n} mit Σ_{i∈I} a_i = t? Es liegt in NP (Zertifikat I ist polynomiell verifizierbar). Es ist NP-vollstaendig: Reduktion aus 3-SAT via Gadget-Zahlen. Wichtig: Der bekannte DP-Algorithmus laeuft in O(n*t) — pseudopolynomiell, weil t exponentiell in der Bitlaenge sein kann. Subset-Sum ist 'schwach NP-vollstaendig': polynomiell loesbar, wenn Zahlen unizaer kodiert sind (also klein relativ zu n).",
        difficulty = 5,
        funFact = null
    ),

    // Question 22
    Question(
        categoryId = 12,
        questionText = "Was ist die randomisierte Komplexitaetsklasse BPP (Bounded-Error Probabilistic Polynomial time), und wie verhaelt sie sich zu P und NP?",
        answerA = "BPP ist die Klasse der Probleme loesbar in polynomieller Zeit mit einer Fehlerwahrscheinlichkeit von hoechstens 1/3 auf einer probabilistischen TM; es gilt P ⊆ BPP ⊆ PSPACE, und ob BPP = P ist eine grosse offene Frage",
        answerB = "BPP = NP, da jede NP-Loesung durch Zufallsstichproben in polynomieller Zeit verifiziert werden kann",
        answerC = "BPP liegt klar ausserhalb von NP und ist damit eine eigenstaendige Hierarchiestufe ueber NP",
        answerD = "BPP enthaelt ausschliesslich Probleme, die in P liegen — Randomisierung bringt keinen Mehrwert gegenueber deterministischen Verfahren",
        correctAnswer = 0,
        explanation = "BPP (Gill, 1977): Eine probabilistische polynomial-zeitbeschraenkte TM M entscheidet L ∈ BPP, wenn: x ∈ L ⟹ Pr[M akzeptiert] ≥ 2/3, x ∉ L ⟹ Pr[M akzeptiert] ≤ 1/3. Die 1/3-Fehlergrenze ist beliebig: Durch Mehrheitsvotum ueber polynomiell viele Laeufe kann der Fehler auf 2^{-poly(n)} reduziert werden. Es gilt P ⊆ BPP ⊆ Σ^p_2 ∩ Π^p_2 ⊆ PSPACE. Die Adleman-Frage (ob BPP = P) ist offen; Derandomisierung-Forschung vermutet BPP = P unter starken Pseudozufalls-Annahmen.",
        difficulty = 5,
        funFact = "Der Primzahltest von Miller-Rabin ist ein BPP-Algorithmus: Er akzeptiert zusammengesetzte Zahlen mit Wahrscheinlichkeit < 1/4 pro Runde. Mit k Runden sinkt die Fehlerrate auf 4^{-k}. Seit 2002 gibt es mit dem AKS-Algorithmus einen deterministischen polynomiellen Primzahltest — BPP-Algorithmen ersetzt durch P-Algorithmen."
    ),

    // Question 23
    Question(
        categoryId = 12,
        questionText = "Was ist ein ZPP-Algorithmus (Zero-Error Probabilistic Polynomial time), und wie unterscheidet er sich von einem Las-Vegas- und einem Monte-Carlo-Algorithmus?",
        answerA = "ZPP-Algorithmen liefern immer korrekte Ergebnisse, koennen aber keine Antwort geben; ZPP = RP ∩ co-RP. Las-Vegas gibt immer korrekte Antworten in erwarteter polynomieller Zeit; Monte-Carlo kann Fehler machen, laeuft immer in polynomieller Zeit",
        answerB = "ZPP = P; alle randomisierten Algorithmen ohne Fehler sind deterministisch simulierbar",
        answerC = "Monte-Carlo-Algorithmen sind effizienter als Las-Vegas-Algorithmen, weil sie niemals eine 'kein Ergebnis'-Ausgabe zurueckgeben",
        answerD = "ZPP ⊆ P ist bewiesen; alle Zero-Error randomisierten Algorithmen haben deterministische Aequivalente mit polynomieller Laufzeit",
        correctAnswer = 0,
        explanation = "Las Vegas: Gibt immer korrekte Ausgabe, Laufzeit ist randomisiert (erwartete polynomielle Zeit). Monte Carlo: Laeuft immer in polynomieller Zeit, gibt mit kleiner Wahrscheinlichkeit falsche Ausgabe. ZPP: Gibt entweder korrekte Ausgabe oder '?' (kein Ergebnis), erwartet in polynomieller Zeit. ZPP = RP ∩ co-RP: RP akzeptiert Ja-Instanzen mit Wkt. ≥ 1/2 und lehnt Nein-Instanzen sicher ab; co-RP ist das Komplement. Es gilt P ⊆ ZPP ⊆ RP ⊆ BPP ⊆ PSPACE.",
        difficulty = 5,
        funFact = null
    ),

    // Question 24
    Question(
        categoryId = 12,
        questionText = "Was ist die Klasse IP (Interactive Proof Systems) und welches ueberraschende Ergebnis gilt fuer ihre Maechtigkeit?",
        answerA = "IP ist die Klasse der Sprachen, die von einem polynomiellen Verifizierer in interaktivem Austausch mit einem unbeschraenkten Beweiser akzeptiert werden koennen; es gilt IP = PSPACE",
        answerB = "IP = NP, da jede interaktive Beweis koennte durch Angabe eines polynomiellen Zertifikats simuliert werden",
        answerC = "IP ⊆ EXPTIME, aber IP ≠ PSPACE, da interaktive Beweise Probleme ausserhalb von PSPACE loesen koennen",
        answerD = "IP ist aequivalent zu BPP; Interaktion ohne Zufall bringt keinen Vorteil gegenueber randomisierten Einzeldurchlaeufen",
        correctAnswer = 0,
        explanation = "Interaktive Beweissysteme (Goldwasser, Micali, Rackoff, 1985): Ein polynomieller Verifizierer V tauscht polynomiell viele Nachrichten mit einem allmaechtigen Beweiser P aus. V akzeptiert korrekte Aussagen mit Wahrsch. ≥ 2/3 und lehnt falsche mit Wahrsch. ≤ 1/3 ab. Das Ergebnis IP = PSPACE (Shamir, 1990) war sensationell: Interaktion mit Zufall ist so maechtig wie polynomiell beschraenkter Speicher — weit jenseits von NP. Bewiesen durch die Arithmetisierungstechnik.",
        difficulty = 5,
        funFact = "Amos Wigderson und andere bewiesen: IP enthaelt auch co-NP-vollstaendige Probleme wie TAUTOLOGY. Das war der erste Hinweis, dass interaktive Beweise weit ueber NP hinausgehen — eine Erkenntnis, die zur modernen Kryptographie und zum Begriff der Zero-Knowledge-Beweise fuehrte."
    ),

    // Question 25
    Question(
        categoryId = 12,
        questionText = "Was ist ein Zero-Knowledge-Beweis, und welche drei Eigenschaften muss er erfuellen?",
        answerA = "Ein Zero-Knowledge-Beweis ist ein interaktives Protokoll, das (1) Vollstaendigkeit: ehrlicher Beweiser ueberzeugt ehrlichen Verifizierer; (2) Korrektheit: unehrlicher Beweiser kann nur mit vernachlaessigbarer Wahrscheinlichkeit ueberzeugen; (3) Zero-Knowledge: Verifizierer lernt nichts ausser dem Wahrheitswert der Aussage",
        answerB = "Zero-Knowledge-Beweise beweisen, dass ein Problem in P liegt, ohne die tatsaechliche Loesung zu zeigen — sie sind daher nur fuer P-Probleme anwendbar",
        answerC = "Zero-Knowledge bedeutet, dass der Beweis keine Bits kommuniziert; er basiert ausschliesslich auf nichtverbaler Interaktion",
        answerD = "Zero-Knowledge-Beweise koennen nur fuer NP-vollstaendige Probleme konstruiert werden, da ihre Sicherheit auf der Haerte dieser Probleme basiert",
        correctAnswer = 0,
        explanation = "Zero-Knowledge-Beweise (Goldwasser, Micali, Rackoff, 1985): Vollstaendigkeit — falls x ∈ L, kann ehrlicher P den ehrlichen V mit hoher Wahrscheinlichkeit ueberzeugen. Korrektheit (Soundness) — falls x ∉ L, kann kein effizienter betruegtlicher Beweiser V ueberzeugen. Zero-Knowledge — V lernt ausser dem Wahrheitswert nichts; formal: Alles was V sieht, kann V selbst simulieren ohne P. Anwendung: Passwort-Authentifizierung ohne Passwort-Uebertragung, digitale Signaturen, zk-SNARKs in Blockchain-Systemen.",
        difficulty = 5,
        funFact = "Das klassische Beispiel: Die Hoehle von Ali Baba. Beweiser P kennt das Zauberwort einer Hoehle mit zwei Eingaengen. Verifizierer V waehlt zufaellig einen Ausgang. P kommt aus dem richtigen Ausgang ohne V das Zauberwort zu sagen. Nach 30 Runden ist V zu 1 - (1/2)^30 ueberzeugt. V hat das Wort niemals gesehen."
    ),

    // Question 26
    Question(
        categoryId = 12,
        questionText = "Was beschreibt die Komplexitaetsklasse EXPTIME, und welches Spiel ist ein klassisches EXPTIME-vollstaendiges Problem?",
        answerA = "EXPTIME enthaelt alle Probleme loesbar in 2^{poly(n)} Zeit; Generalized Chess (Schach auf n×n Brett, optimaler Zug) ist EXPTIME-vollstaendig",
        answerB = "EXPTIME = NP^NP, da exponentielle Zeit einer doppelten nichtdeterministischen Schicht entspricht",
        answerC = "EXPTIME ist identisch mit PSPACE; beide Klassen beschreiben Probleme mit exponentiellen Ressourcen",
        answerD = "Schach ist PSPACE-vollstaendig, nicht EXPTIME-vollstaendig, da der Suchbaum polynomiellen Speicher erfordert",
        correctAnswer = 0,
        explanation = "EXPTIME = ∪_k TIME(2^{n^k}) — die Klasse der Probleme loesbar in O(2^{n^k}) Zeit. Es gilt P ⊊ EXPTIME (bewiesen via Time Hierarchy Theorem). Generalized Chess: Gegeben eine Schachposition auf einem n×n Brett, hat Weiss eine Gewinnstrategie? Ist EXPTIME-vollstaendig (Fraenkel et al.). Auch Generalized Go und Checkers sind EXPTIME-vollstaendig. Der Unterschied zu PSPACE-vollstaendigen Spielen: Bei EXPTIME koennen beide Spieler durch exponentielle Spielbaeume beweisen; bei PSPACE-Spielen reicht polynomieller Speicher fuer die Auswertung.",
        difficulty = 5,
        funFact = null
    ),

    // Question 27
    Question(
        categoryId = 12,
        questionText = "Was ist das Post'sche Korrespondenzproblem (PCP) und welche Bedeutung hat es fuer die Unentscheidbarkeit?",
        answerA = "PCP fragt: Gegeben endliche Listen von Strings (alpha_1,...,alpha_k) und (beta_1,...,beta_k) — gibt es eine Indexfolge i_1,...,i_m, sodass die Konkatenation alpha_{i_1}...alpha_{i_m} = beta_{i_1}...beta_{i_m}? Es ist unentscheidbar (auch bei zwei Paaren bereits fuer viele Faelle)",
        answerB = "PCP ist NP-vollstaendig und dient als Ausgangspunkt fuer Reduktionen innerhalb der polynomiellen Hierarchie",
        answerC = "Das Post'sche Korrespondenzproblem liegt in co-NP, da Unloesbarkeit leicht verifizierbar ist",
        answerD = "PCP ist entscheidbar in EXPSPACE, da die maximale Laenge der Loesungsfolge exponentiell beschraenkt ist",
        correctAnswer = 0,
        explanation = "Emil Posts PCP (1946) ist ein klassisches unentscheidbares Problem. Der Beweis laeuft ueber Reduktion aus dem Halteproblem: Eine Turingmaschinen-Berechnung wird in PCP-Instanzen kodiert — eine Loesung der PCP-Instanz entspricht einer akzeptierenden Berechnung. PCP hat grosse Bedeutung: Es dient als Ausgangspunkt fuer viele Unentscheidbarkeitsbeweise (z.B. Unentscheidbarkeit kontextfreier Grammatik-Schnittmengen, Mehrdeutigkeit von CFGs). Wichtig: Nicht zu verwechseln mit dem PCP-Theorem in der Approximationstheorie.",
        difficulty = 5,
        funFact = "Das PCP-Theorem (Probabilistically Checkable Proofs, 1992) ist ebenfalls ein Meilenstein: Es besagt, dass jede NP-Aussage mit polynomiell vielen zufallig gewaehlten Bits und O(1) abgefragten Beweis-Bits mit konstanter Fehlerrate verifiziert werden kann. Daraus folgen starke Inapproximierbarkeitsresultate."
    ),

    // Question 28
    Question(
        categoryId = 12,
        questionText = "Welche Kernaussage hat das PCP-Theorem fuer Approximationsalgorithmen, und was folgt daraus fuer das Maximum-3-SAT-Problem?",
        answerA = "Das PCP-Theorem zeigt, dass Max-3-SAT keine polynomielle Approximation besser als 7/8 zulasst (unter P ≠ NP), obwohl ein einfacher Zufallsalgorithmus genau 7/8 erreicht",
        answerB = "Das PCP-Theorem beweist, dass Approximationsalgorithmen generell besser sind als exakte Algorithmen, da sie NP-Schwere umgehen",
        answerC = "Aus dem PCP-Theorem folgt, dass alle NP-Optimierungsprobleme einen FPTAS (fully polynomial time approximation scheme) haben",
        answerD = "Das PCP-Theorem gilt nur fuer Entscheidungsprobleme und hat keine Implikationen fuer Optimierungsprobleme",
        correctAnswer = 0,
        explanation = "Das PCP-Theorem (Arora, Safra, Sudan et al., 1992): NP = PCP(log n, 1) — jeder NP-Beweis kann probabilistisch mit O(log n) zufall Bits und O(1) Beweis-Bits mit konstanter Fehlerrate verifiziert werden. Inapproximierbarkeits-Konsequenz: Hastad zeigte, dass Max-3-SAT nicht polynomiell auf 7/8 + ε approximierbar ist (fuer ε > 0), es sei denn P = NP. Bemerkenswerterweise erreicht der einfachste Algorithmus (jede Variable zufaellig setzen) genau 7/8 — die 'naive' Loesung ist optimal!",
        difficulty = 5,
        funFact = null
    ),

    // Question 29
    Question(
        categoryId = 12,
        questionText = "Was ist die Klasse #P (Sharp-P) und warum ist das Zaehlen von Loesungen schwieriger als das blosse Entscheiden?",
        answerA = "#P ist die Klasse der Zaehlprobleme: Wieviele akzeptierende Berechnungspfade hat eine nichtdeterministische polynomial-zeitbeschraenkte TM? Valiant zeigte: #P-vollstaendige Probleme sind schwerer als NP — selbst wenn P = NP wuerde #P moeglicherweise nicht kollabieren",
        answerB = "#P ist aequivalent zu NP; Zaehlen und Entscheiden haben dieselbe Komplexitaet fuer polynomielle Probleme",
        answerC = "#P liegt in PSPACE und enthaelt daher alle NP-Zaehlfunktionen in polynomiellem Speicher loesbar",
        answerD = "#P ist eine Teilmenge von P, da Zaehlen prinzipiell einfacher ist als Suchen",
        correctAnswer = 0,
        explanation = "Leslie Valiant definierte #P (1979): Fuer ein NP-Problem L ist #L die Funktion, die die Anzahl akzeptierender Berechnungspfade zaehlt. #SAT (Anzahl erfuellender Belegungen) ist #P-vollstaendig. Ueberraschendes Ergebnis: Das Berechnen des Permanents einer 0-1-Matrix ist #P-vollstaendig — obwohl das Berechnen der Determinante in P^3 liegt! Todts Theorem: PH ⊆ P^{#P} — die gesamte polynomielle Hierarchie kollabiert in P mit #P-Orakel. Anwendung in der Kryptographie: Valiant erhielt 2010 den Turing Award.",
        difficulty = 5,
        funFact = "Valiant entdeckte #P bei der Arbeit an seiner eigenen Komplexitaetsklasse VP (verifiable in polynomial time) und der Frage nach effizienter Berechnung algebraischer Ausdruecke. Das Ergebnis ueber das Permanent ueberraschte die gesamte Forschungsgemeinschaft."
    ),

    // Question 30
    Question(
        categoryId = 12,
        questionText = "Was ist die Klasse LOGSPACE (L) und das Space Hierarchy Theorem? Wie verhalten sie sich zu P?",
        answerA = "L ist die Klasse der Probleme loesbar in O(log n) Speicher auf einer deterministischen TM; das Space Hierarchy Theorem beweist L ⊊ PSPACE. Ob L = P gilt, ist eine grosse offene Frage",
        answerB = "L = P ist bewiesen; logarithmischer Speicher ist aequivalent zu polynomieller Zeit",
        answerC = "LOGSPACE enthaelt alle kontextfreien Sprachen und liegt daher zwischen P und NP in der Komplexitaetshierarchie",
        answerD = "Das Space Hierarchy Theorem beweist L ⊊ P, sodass L und P verschiedene Klassen sind",
        correctAnswer = 0,
        explanation = "L = DSPACE(log n): Probleme loesbar mit O(log n) Speicher (Arbeitsspeicher; Eingabe read-only). NL = NSPACE(log n): nichtdeterministisch. Bekannte Ergebnisse: L ⊆ NL ⊆ P (ob strikt unklar). NL = co-NL (Immermann-Szelepcsényi, 1987 — ein Satz den viele nicht erwarteten). Das Space Hierarchy Theorem (Stearns et al.): fuer platzkonstruierbare s(n) mit s(n) = o(t(n)) gilt SPACE(s(n)) ⊊ SPACE(t(n)). Ob L = NL oder L = P, sind faszinierende offene Fragen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 31
    Question(
        categoryId = 12,
        questionText = "Was ist die Komplexitaet des Graphisomorphismus-Problems (GRAPH ISO), und warum ist seine Einordnung besonders raetselh aft?",
        answerA = "GRAPH ISO ist NP-vollstaendig — es liegt in NP und ist auf SAT reduzierbar",
        answerB = "GRAPH ISO liegt in NP (polynomiell verifizierbar) und in co-AM (probabilistische Co-Klasse); es ist vermutlich weder P noch NP-vollstaendig — ein seltener Kandidat fuer eine Klasse 'dazwischen'",
        answerC = "GRAPH ISO liegt in P; Babai's Quasipolynomial-Algorithmus von 2015 loest es in Zeit 2^{O(log^c n)} und gilt als polynomiell",
        answerD = "GRAPH ISO ist NP-schwer aber nicht in NP, da kein kurzes Zertifikat fuer Isomorphie existiert",
        correctAnswer = 1,
        explanation = "Graphisomorphismus: Gegeben zwei Graphen G1, G2 — sind sie isomorph (gleiche Struktur, nur umbenannte Knoten)? Es liegt in NP (Isomorphismus-Permutation ist Zertifikat). Ob es NP-vollstaendig ist: unbekannt. Falls GRAPH ISO NP-vollstaendig wuerde, kollabirte die polynomielle Hierarchie auf der zweiten Stufe (Boppana et al., 1987). Babais Quasipolynomial-Algorithmus (2015/2017) laeuft in Zeit 2^{O((log n)^c)} — besser als exponentiell, aber kein Beweis fuer P. GRAPH ISO gilt als prominentester Kandidat fuer eine NP-Klasse, die weder P noch NP-vollstaendig ist.",
        difficulty = 5,
        funFact = "László Babai veröffentlichte seinen Quasipolynomial-Algorithmus im Alter von 65 Jahren — nach Jahrzehnten der Arbeit an diesem Problem. Er ist einer der bedeutendsten Beitraege zur Komplexitaetstheorie der letzten 40 Jahre."
    ),

    // Question 32
    Question(
        categoryId = 12,
        questionText = "Was ist das Hamiltonkreisproblem (HCP), und wie unterscheidet es sich in seiner Komplexitaet vom Euler-Kreis-Problem?",
        answerA = "Beide Probleme sind NP-vollstaendig; der Unterschied liegt nur in der Problemformulierung",
        answerB = "Euler-Kreis (jede Kante genau einmal) ist in P (Euler-Kriterium: alle Knoten muessen geraden Grad haben, entscheidbar in O(n+m)); Hamiltonkreis (jeder Knoten genau einmal) ist NP-vollstaendig",
        answerC = "Hamiltonkreis liegt in P fuer planare Graphen; nur fuer allgemeine Graphen ist es NP-vollstaendig",
        answerD = "Euler-Kreis ist NP-vollstaendig fuer gerichtete Graphen, Hamiltonkreis fuer ungerichtete",
        correctAnswer = 1,
        explanation = "Eulerscher Kreis: Jede Kante genau einmal besuchen und zum Startpunkt zurueckkehren. Euler-Kriterium: Existiert genau dann, wenn der Graph zusammenhaengend ist und alle Knoten geraden Grad haben — O(n+m) entscheidbar. Hamiltonkreis: Jeden Knoten genau einmal besuchen. NP-vollstaendig (Karp, 1972). Die strukturell scheinbar aehnlichen Probleme liegen in komplett verschiedenen Komplexitaetsklassen! Das liegt daran: Euler-Bedingung ist lokal (jeder Knoten), Hamilton-Bedingung ist global (Reihenfolge aller Knoten).",
        difficulty = 5,
        funFact = "Euler loeste das Koenigsberger Brueckenproblem (1736) — 7 Bruecken, jede einmal ueberqueren — und begrundete damit die Graphentheorie. Er bewies, dass es keine Loesung gibt, da Koenigsberg vier Knoten mit ungeradem Grad hatte."
    ),

    // Question 33
    Question(
        categoryId = 12,
        questionText = "Was ist Approximierbarkeit in der Komplexitaetstheorie, und was ist ein PTAS vs. FPTAS?",
        answerA = "Ein PTAS (Polynomial Time Approximation Scheme) ist ein Algorithmus, der fuer jedes feste ε > 0 eine (1+ε)-Approximation in polynomieller Zeit liefert; ein FPTAS laeuft zusaetzlich polynomiell in 1/ε — FPTAS ist strenger und effizienter",
        answerB = "PTAS und FPTAS sind identisch; der Unterschied liegt nur in der Konstante des Approximationsfaktors",
        answerC = "Ein FPTAS garantiert eine exakte Loesung in pseudopolynomieller Zeit; PTAS ist die Verallgemeinerung fuer approximative Loesungen",
        answerD = "PTAS existiert fuer alle NP-Optimierungsprobleme; FPTAS nur fuer Probleme in P",
        correctAnswer = 0,
        explanation = "Approximationsklassen fuer NP-Optimierungsprobleme: PTAS: Fuer jedes feste ε > 0 Algorithmus mit Laufzeit poly(n) und Guete (1+ε). Die Laufzeit darf in 1/ε exponentiell sein, z.B. O(n^{1/ε}). FPTAS: Algorithmus laeuft poly(n, 1/ε) — also polynomiell sowohl in n als auch in 1/ε. Strenger als PTAS. Beispiele: Euklidisches TSP hat PTAS (Arora, 1996). Knapsack hat FPTAS (via skalierter DP). Max-CLIQUE hat keinen PTAS unter P ≠ NP (inapproximierbar). APX: Konstante Approximation moeglich.",
        difficulty = 5,
        funFact = null
    ),

    // Question 34
    Question(
        categoryId = 12,
        questionText = "Was ist Ladners Theorem, und welche Konsequenz hat es fuer die Struktur von NP bei P ≠ NP?",
        answerA = "Ladners Theorem besagt: Falls P ≠ NP, existieren Probleme in NP, die weder in P noch NP-vollstaendig sind — sogenannte NP-intermediate oder NPI-Probleme",
        answerB = "Ladners Theorem beweist, dass die NP-vollstaendigen Probleme eine dichte Teilmenge von NP bilden",
        answerC = "Ladners Theorem zeigt, dass es unter der Annahme P = NP keine intermediaren NP-Klassen gibt",
        answerD = "Ladners Theorem klassifiziert alle bekannten NP-Probleme eindeutig als P oder NP-vollstaendig",
        correctAnswer = 0,
        explanation = "Richard Ladner bewies 1975: Falls P ≠ NP, enthalt NP Probleme, die weder in P noch NP-vollstaendig sind. Diese Klasse heisst NPI (NP-intermediate). Kandidaten fuer NPI: Graphisomorphismus, Faktorisierung ganzer Zahlen (Integer Factorization), diskrete Logarithmen. Faktoren-Suche liegt in NP (verifizierbar), kein NP-Vollstaendigkeitsbeweis bekannt, gilt als subexponentiell loesbar (Zahlkoerpersieb). Kryptographie (RSA, Diffie-Hellman) basiert auf der vermuteten Schwere von NPI-Problemen.",
        difficulty = 5,
        funFact = "RSA-Kryptographie basiert auf der Schwierigkeit der Faktorisierung — einem vermutlichen NPI-Problem. Der groesste bisher faktorisierte RSA-Schlussel hatte 829 Bit (RSA-250, 2020). RSA-2048 gilt mit heutiger Technologie als sicher fuer Jahrzehnte."
    ),

    // Question 35
    Question(
        categoryId = 12,
        questionText = "Was ist die Komplexitaetsklasse NC (Nick's Class) und warum ist sie fuer Parallelverarbeitung zentral?",
        answerA = "NC ist die Klasse der Probleme loesbar in polynomieller Zeit auf parallelen Computern mit beliebig vielen Prozessoren; NC = P gilt als bewiesen",
        answerB = "NC ist die Klasse der Probleme loesbar in polylogarithmischer Zeit (O(log^k n)) mit polynomiell vielen parallelen Prozessoren; NC ⊆ P, aber ob P = NC ist offen — P-vollstaendige Probleme gelten als inhaerent sequentiell",
        answerC = "NC enthaelt alle PSPACE-Probleme, die sich parallel effizient berechnen lassen",
        answerD = "NC ist identisch mit L (LOGSPACE) und beschreibt Probleme mit minimaler Parallelkomplexitaet",
        correctAnswer = 1,
        explanation = "NC (Parallel Complexity, Nick Pippenger): NC = ∪_k DTIME(log^k n) mit polynomiell vielen parallelen Prozessoren. Entspricht Schaltkreisen mit polynomieller Groesse und O(log^k n) Tiefe. NC ⊆ P (jede parallele Berechnung kann sequentiell simuliert werden). P-vollstaendige Probleme (z.B. Circuit Value Problem) sind vermutlich nicht in NC — sie erfordern inhaerent sequentielle Berechnungen. Ob P = NC: Die wichtigste offene Frage in der parallelen Komplexitaetstheorie.",
        difficulty = 5,
        funFact = null
    ),

    // Question 36
    Question(
        categoryId = 12,
        questionText = "Welche Bedeutung hat das SAT-Problem fuer praktische Industrieanwendungen, obwohl es NP-vollstaendig ist?",
        answerA = "SAT wird in der Praxis nicht eingesetzt, da seine NP-Vollstaendigkeit jeden praktischen Einsatz ausschliesst",
        answerB = "Moderne SAT-Solver (CDCL-basiert: Conflict Driven Clause Learning) loesen Millionen-Variable-Instanzen in Sekunden fuer typische Praxis-Instanzen; Anwendungen: Chip-Verifikation, Model Checking, Constraint-Satisfaction, KI-Planung, Kryptanalyse",
        answerC = "SAT ist nur fuer Instanzen unter 1000 Variablen effizient loesbar; groessere Instanzen erfordern exponentielle Zeit",
        answerD = "SAT-Solver nutzen Quantum Computing, um die NP-Vollstaendigkeit zu umgehen und polynomielle Loesungszeiten zu erzielen",
        correctAnswer = 1,
        explanation = "CDCL-SAT-Solver (z.B. MiniSAT, CryptoMiniSAT, Glucose) nutzen: Unit Propagation, Konflikt-Analyse und Klausel-Lernen, Nicht-chronologisches Backtracking, heuristische Variablenwahl (VSIDS). Obwohl SAT im Worst-Case exponentiell ist, sind praxisrelevante Instanzen oft in Sekunden loesbar. Anwendungen: Intel/AMD verifizieren Prozessor-Schaltkreise mit SAT-Solvern (verhindert Pentium-FDIV-Bug-Wiederholungen). Das SAT Competition findet jaehrlich statt.",
        difficulty = 5,
        funFact = "Der beruehmt-beruechtigte Intel Pentium FDIV-Bug (1994) kostete Intel 475 Millionen Dollar. Seitdem werden Prozessoren mit formaler Verifikation (via SAT/Model-Checking) geprueft. SAT-Solver sind unsichtbare Helden moderner Halbleiterentwicklung."
    ),

    // Question 37
    Question(
        categoryId = 12,
        questionText = "Was ist die Quantum Complexity Klasse BQP, und welche Beziehung hat sie zu P, NP und BPP?",
        answerA = "BQP (Bounded-Error Quantum Polynomial time) ist die Klasse der auf einem Quantencomputer in polynomieller Zeit losbaren Probleme mit Fehler ≤ 1/3; es gilt BPP ⊆ BQP ⊆ PSPACE; ob NP ⊆ BQP ist offen",
        answerB = "BQP = P, da Quantencomputer nur schnellere Implementierungen klassischer Algorithmen sind",
        answerC = "BQP = NP; Shors Algorithmus beweist, dass alle NP-Probleme auf Quantencomputern polynomiell loesbar sind",
        answerD = "BQP liegt ausserhalb von PSPACE und reprasentiert eine fundamentale neue Berechungsstaerke jenseits klassischer Komplexitaetsklassen",
        correctAnswer = 0,
        explanation = "BQP: Probleme auf polynomiell-zeitbeschraenkten Quantencomputern mit Fehlerwahrscheinlichkeit ≤ 1/3 loesbar. Bekannte BQP-Probleme nicht in P bekannt: Integer Factorization (Shors Algorithmus 1994: O(n^3)), diskrete Logarithmen. BPP ⊆ BQP (Quantencomputer simulieren klassische Zufallsalgorithmen). BQP ⊆ PSPACE (Quantenberechnung simulierbar mit polynomiellem Speicher, Bernstein-Vazirani). Ob NP ⊆ BQP: vermutlich NICHT (Quantencomputer loesen nicht alle NP-Probleme schnell).",
        difficulty = 5,
        funFact = "Peter Shors Algorithmus (1994) loest das Faktorisierungsproblem auf einem Quantencomputer in polynomieller Zeit. Das bedroht RSA-Kryptographie: Ein hinreichend grosser Quantencomputer koennte alle aktuellen RSA-verschluesselten Kommunikationen brechen. NIST standardisiert daher quantensichere Kryptographie."
    ),

    // Question 38
    Question(
        categoryId = 12,
        questionText = "Was ist das Ogden-Lemma (Pumping-Lemma fuer kontextfreie Sprachen) und wie unterscheidet es sich vom regulaeren Pumping-Lemma in der Komplexitaet seiner Anwendung?",
        answerA = "Das Ogden-Lemma ist eine Verstaerkung des CFL-Pumping-Lemmas: Man darf n 'markierte' Positionen waehlen; das Lemma garantiert dann Pumpen innerhalb dieser Positionen — es kann mehr nicht-kontextfreie Sprachen nachweisen als das Standard-Pumping-Lemma",
        answerB = "Das Ogden-Lemma und das CFL-Pumping-Lemma sind aequivalent; Ogden liefert keine zusaetzliche Beweiskraft",
        answerC = "Das Ogden-Lemma gilt ausschliesslich fuer deterministisch kontextfreie Sprachen (DCFL) und ist auf nicht-deterministische CFLs nicht anwendbar",
        answerD = "Das regulaere Pumping-Lemma ist staerker als das Ogden-Lemma, da regulaere Sprachen eine Teilmenge der kontextfreien Sprachen sind",
        correctAnswer = 0,
        explanation = "Das regulaere Pumping-Lemma: Fuer regulaere Sprachen gibt es p, sodass jedes Wort w mit |w| ≥ p in xyz mit |xy| ≤ p, |y| ≥ 1 aufgeteilt werden kann und xy^iz ∈ L fuer alle i ≥ 0. CFL-Pumping-Lemma: Aehnlich, aber Aufspaltung in uvxyz (zwei Pumppunkte). Ogdens Lemma (1968): Man markiert mindestens p Positionen in w; die Zerlegung uvxyz garantiert, dass mindestens eine Pumpstelle in markierten Positionen liegt. Beweiskraft: Einige Sprachen wie a^n b^n c^n (nicht CFL) erfordern das Ogden-Lemma oder den Nachweis via CYK.",
        difficulty = 5,
        funFact = null
    ),

    // Question 39
    Question(
        categoryId = 12,
        questionText = "Was ist eine Turingmaschine mit Orakel (Oracle TM), und welchen philosophischen Einwand bringt das Baker-Gill-Solovay-Theorem (1975) gegen naiv-diagonale P-NP-Beweise?",
        answerA = "Das BGS-Theorem zeigt, dass es Orakel A, B gibt mit P^A = NP^A und P^B ≠ NP^B — Relativierungsargumente allein koennen P vs. NP nicht loesen, da die Antwort relativ zum Orakel variiert",
        answerB = "Das BGS-Theorem beweist, dass P ≠ NP gilt, da ein Orakel B existiert mit P^B ≠ NP^B",
        answerC = "BGS zeigt, dass Orakelmaschinen maechtiger sind als Standard-Turingmaschinen und daher keine validen Beweismittel fuer P vs. NP darstellen",
        answerD = "BGS-Theorem besagt, dass jeder Beweis P ≠ NP ein Orakel als Hilfsmittel benoetigt, da direkte Beweise unmoeglich sind",
        correctAnswer = 0,
        explanation = "Baker, Gill und Solovay (1975): Orakel A mit P^A = NP^A existiert (z.B. A = PSPACE-vollstaendiges Problem); Orakel B mit P^B ≠ NP^B existiert (z.B. B = {0^n | ∃ n-Bit-String in B}). Konsequenz: Jede Beweistechnik, die relativiert (d.h. identisch relativ zu jedem Orakel gilt), kann P vs. NP nicht loesen — sie muesste fuer beide Orakel gleichzeitig gelten. Die meisten klassischen Komplexitaetsargumente relativieren. Dies zeigt: P vs. NP erfordert nicht-relativierende Beweistechniken (Algebrisierung, Natural Proofs, etc.).",
        difficulty = 5,
        funFact = "Razborov und Rudich definierten 1994 'Natural Proofs' und zeigten, dass ein ganzer Klassen von Beweistechniken unter kryptographischen Annahmen P vs. NP nicht loesen koennen. Ein fundamentaler Metabeweis ueber Grenzen der Beweisbarkeit selbst."
    ),

    // Question 40
    Question(
        categoryId = 12,
        questionText = "Was ist die Szasz-Zermelo-Rekursion und welche Klasse von Beweisen fuer Untere Schranken in der Schaltkreiskomplexitaet eroeffnet sie?",
        answerA = "Die Szasz-Zermelo-Rekursion ist eine Technik aus der Mengelehre zur Konstruktion von Schaltkreis-Unteren-Schranken und beweist NC^1 ≠ P",
        answerB = "Razborovs Methode der Approximationen (1985) zeigte erste exponentielle untere Schranken fuer Monotone Schaltkreise bei Clique — ein Paradigmenwechsel fuer schaltkreis-basierte Komplexitaetstheorie",
        answerC = "Die natuerliche Beweismethode (Natural Proofs) von Razborov-Rudich ist die staerkste bekannte Technik fuer allgemeine (nicht-monotone) Schaltkreis-Untere-Schranken",
        answerD = "Das Fuerst-Saxe-Sipser-Theorem beweist exponentielle untere Schranken fuer allgemeine Boolesche Schaltkreise polynomieller Tiefe",
        correctAnswer = 1,
        explanation = "Alexander Razborov bewies 1985 mit seiner Approximationsmethode: Das Clique-Problem erfordert exponentielle Groesse fuer monotone Boolesche Schaltkreise. Monotone Schaltkreise berechnen ohne NOT-Gatter — ein eingeschraenktes Modell. Hastad's Switching Lemma (1986) bewies exponentielle untere Schranken fuer AC^0 (konstante Tiefe). Diese Ergebnisse gelten nur fuer eingeschraenkte Modelle; fuer allgemeine Schaltkreise sind gute untere Schranken (> cn log n) unbekannt — direkt verwandt mit P vs. NP.",
        difficulty = 5,
        funFact = null
    ),

    // Question 41
    Question(
        categoryId = 12,
        questionText = "Was ist die Klasse NEXPTIME und welche Inklusion zwischen NP und NEXPTIME ist bewiesen?",
        answerA = "NP ⊊ NEXPTIME gilt bewiesen durch das Nondeterministic Time Hierarchy Theorem; ausserdem gilt EXPTIME ⊆ NEXPTIME",
        answerB = "NP = NEXPTIME fuer alle praktischen Problemgroessen; die Klassen unterscheiden sich nur bei nicht-polynomiell langen Eingaben",
        answerC = "NEXPTIME = EXPTIME, da nichtdeterministischer Mehraufwand durch exponentielle Zeit ausgeglichen wird",
        answerD = "NEXPTIME liegt in PSPACE, da polynomieller Speicher exponentielle nichtdeterministische Zeit simulieren kann",
        correctAnswer = 0,
        explanation = "NEXPTIME = ∪_k NTIME(2^{n^k}) — nichtdeterministische exponentielle Zeit. Das Nondeterministic Time Hierarchy Theorem (Cooke-Levin): NP ⊊ NEXPTIME (strikt). Bekannt: EXPTIME ⊆ NEXPTIME ⊆ EXPSPACE. Ob EXPTIME = NEXPTIME analog zu P vs. NP offen. MIP* = RE (2020): Durch ein sensationelles Ergebnis von Ji, Natarajan et al. ist die Klasse MIP* (Multi-Prover Interactive Proofs mit Quantenverschraenkung) gleich RE — der Klasse aller rekursiv aufzaehlbaren Sprachen. Das uebertrifft NEXPTIME bei weitem.",
        difficulty = 5,
        funFact = "Das MIP* = RE Ergebnis (2020) loeste gleichzeitig Connes Einbettungsproblem aus der Operatoralgebra negativ — ein Beweis aus der Quanteninformatik loest ein 44 Jahre altes Problem der reinen Mathematik."
    ),

    // Question 42
    Question(
        categoryId = 12,
        questionText = "Was ist das Boolean Circuit Satisfiability Problem (CircuitSAT), und welche Beziehung hat es zu SAT?",
        answerA = "CircuitSAT und SAT sind aequivalent (polynomielle gegenseitige Reduktion); CircuitSAT ist sogar das kanonischste NP-vollstaendige Problem, da jede NDTM-Berechnung direkt als Schaltkreis kodiert wird",
        answerB = "CircuitSAT liegt in P, waehrend SAT NP-vollstaendig ist — Schaltkreise sind berechenbarer als Formeln",
        answerC = "CircuitSAT liegt ausserhalb von NP, da Schaltkreise beliebiger Tiefe nicht polynomiell verifizierbar sind",
        answerD = "CircuitSAT ist PSPACE-vollstaendig, da sequentielle Schaltkreise Speicherzustaende codieren koennen",
        correctAnswer = 0,
        explanation = "CircuitSAT: Gegeben ein boolescher Schaltkreis C mit n Eingaben — gibt es eine Belegung der Eingaben, sodass C den Wert 1 ausgibt? CircuitSAT ist NP-vollstaendig: (1) ∈ NP: Belegung ist polynomiell verifizierbar. (2) NP-schwer: Cooks Beweis kodiert direkt NDTM-Berechnungen als Schaltkreise — CircuitSAT ist in diesem Sinne das 'natuerlichste' NP-vollstaendige Problem. Reduktion CircuitSAT ≤p SAT: Jedes Gatter wird in Klauseln uebersetzt (Tseytin-Transformation, linear in Schaltkreisgroesse).",
        difficulty = 5,
        funFact = null
    ),

    // Question 43
    Question(
        categoryId = 12,
        questionText = "Was ist die Klasse PP (Probabilistic Polynomial time) und wie unterscheidet sie sich von BPP?",
        answerA = "PP ist die Klasse der Probleme, bei denen eine probabilistische TM die korrekte Antwort mit Wahrscheinlichkeit > 1/2 gibt (Mehrheit entscheidet); PP ist maechtiger als BPP und enthaelt NP und co-NP",
        answerB = "PP = BPP; beide Klassen unterscheiden sich nur in der Schwelle fuer Fehlerwahrscheinlichkeit (1/3 vs 1/2), haben aber gleiche Maechtigkeit",
        answerC = "PP liegt in NP, da Mehrheitsentscheidungen polynomielle Zertifikate entsprechen",
        answerD = "PP = PSPACE; Majoritaetsabstimmungen auf polynomiellen Maschinen simulieren polynomiellen Speicher",
        correctAnswer = 0,
        explanation = "PP: Eine probabilistische polynomial-zeitbeschraenkte TM M entscheidet L ∈ PP, wenn: x ∈ L ⟺ Pr[M akzeptiert] > 1/2. Im Gegensatz zu BPP (Fehler ≤ 1/3, durch Wiederholung reduzierbar) ist der Fehler in PP nicht durch Wiederholung reduzierbar — 1/2 + 1/2^{n^k} ist immer > 1/2. PP ist stark: NP ⊆ PP und co-NP ⊆ PP (Gill, 1977). Toda's Theorem (1991, Turing Award 2023): PH ⊆ P^{#P} = P^{PP}. PP ist 'zu mächtig' fuer Kryptographie.",
        difficulty = 5,
        funFact = "Seinosuke Toda erhielt 2023 den Kanellakis Prize fuer sein Theorem, das die polynomielle Hierarchie mit dem Zaehlen verknuepft. Es ist einer der tiefsten Satzeder Komplexitaetstheorie — und zeigt, wie mächtig Zählen gegenueber Entscheiden ist."
    ),

    // Question 44
    Question(
        categoryId = 12,
        questionText = "Was ist die Chebyshev-Ungleichung und welche Rolle spielt sie bei der Fehlerreduktion probabilistischer Algorithmen?",
        answerA = "Die Chebyshev-Ungleichung begrenzt die Abweichungswahrscheinlichkeit eines Zufallsvariablen vom Erwartungswert; fuer BPP-Algorithmen erlaubt die Markov-Ungleichung (verwandte Technik) durch Mehrheitsvotum uber k unabhaengige Laeufe den Fehler auf 2^{-Omega(k)} zu reduzieren",
        answerB = "Chebyshev zeigt, dass alle BPP-Algorithmen deterministisch simuliert werden koennen, wenn n ausreichend gross ist",
        answerC = "Die Ungleichung beweist, dass PP = BPP gilt, da beide durch probabilistische Konzentrationsmasse charakterisiert werden",
        answerD = "Chebyshev's Ungleichung ist irrelevant fuer Komplexitaetstheorie; sie wird nur in der Stochastik eingesetzt",
        correctAnswer = 0,
        explanation = "Chebyshev: Pr[|X - E[X]| ≥ t] ≤ Var[X]/t^2. Fuer BPP-Algorithmen: Ein einzelner Lauf hat Fehler ≤ 1/3. k unabhaengige Laeufe und Mehrheitsvotum: Die Summe S der Ja-Antworten hat E[S] = k*Pr[korrekt]. Die Chernoff-Schranke (staerker als Chebyshev) zeigt: Fehler des Mehrheitsvotums ≤ 2^{-Ω(k)}. Mit k = poly(n) Laeufen sinkt der Fehler auf 2^{-poly(n)} — vernachlaessigbar. Das ist die formale Begruendung, warum BPP-Fehler effektiv eliminiert werden kann.",
        difficulty = 5,
        funFact = null
    ),

    // Question 45
    Question(
        categoryId = 12,
        questionText = "Was ist Hardness vs. Randomness (Derandomisierung) in der Komplexitaetstheorie, und welche zentrale Vermutung treibt sie an?",
        answerA = "Derandomisierung ist der Prozess, jeden BPP-Algorithmus durch einen deterministischen zu ersetzen; unter der Annahme, dass exponentielle Schaltkreise schwer sind (z.B. E hat keine Schaltkreise der Groesse 2^{0.01n}), gilt BPP = P",
        answerB = "Derandomisierung ist bewiesen: BPP = P gilt ohne jede kryptographische Annahme",
        answerC = "Unter der Annahme P = NP folgt BPP = PSPACE, nicht BPP = P",
        answerD = "Hardness vs. Randomness zeigt, dass schwerere Probleme mehr Zufall erfordern — je hoeher in der Hierarchie, desto groesser der Zufallsvorteil",
        correctAnswer = 0,
        explanation = "Yao (1982), Nisan-Wigderson (1994): Falls eine Sprache L ∈ E (deterministische Exponentialzeit) keine polynomialgroessen Schaltkreise hat (d.h. L ist 'schaltkreis-schwer'), dann gibt es pseudozufaellige Generatoren (PRGs) die jeden polynomiellen Algorithmus taueschen. Aus PRGs folgt BPP = P. Impagliazzo-Wigderson (1997): Falls EXPTIME ⊄ P/poly (exponentielle Probleme sind fuer Schaltkreise schwer), dann BPP = P. Der Kreis schliesst sich: Haerte erzeugt Zufall (One-Way-Funktionen), und Zufall kann durch Haerte deterministisch simuliert werden.",
        difficulty = 5,
        funFact = "Avi Wigderson erhielt 2021 den Abel-Preis (den 'Nobelpreis der Mathematik') fuer seine Beitraege zur Komplexitaetstheorie, darunter die Nisan-Wigderson-Konstruktion. Er ist einer der wenigen, die fuer theoretische Informatik einen der hoechsten Mathematik-Preise erhielten."
    ),

    // Question 46
    Question(
        categoryId = 12,
        questionText = "Was ist die formale Sprache des Halteproblems und welche Diagonalisierungsmethode zeigt ihre Unentscheidbarkeit?",
        answerA = "H_TM = {<M,w> | M ist eine TM und M haelt auf w}; Turing zeigte die Unentscheidbarkeit durch Annahme eines universellen Halte-Entscheiders H, Konstruktion einer Diagonalmaschine D(M) = if H(M,M) akzeptiert then schleife else halte, und Selbstanwendung D(D) erzeugt Widerspruch",
        answerB = "Das Halteproblem ist entscheidbar fuer alle Turingmaschinen mit hoechstens n^2 Zustaenden; nur bei unbeschraenkten TMs ist es unentscheidbar",
        answerC = "Die Unentscheidbarkeit folgt direkt aus dem Satz von Rice, ohne Diagonalisierung zu benoetigen",
        answerD = "H_TM liegt in co-NP; eine TM die nicht haelt kann durch polynomielle Zertifikate verifiziert werden",
        correctAnswer = 0,
        explanation = "H_TM = {<M,w> | M haelt auf w} ist rekursiv aufzaehlbar aber nicht rekursiv (nicht entscheidbar). Turings Beweis (1936): Angenommen H entscheide H_TM. Definiere D: Auf Eingabe <M> simuliere H(<M,M>); falls H akzeptiert: schleife; falls H ablehnt: halte. Wende D auf <D> an: D haelt auf <D> ⟺ H(<D,D>) = ablehnen ⟺ D haelt nicht auf <D>. Widerspruch. Diese Diagonalisierung (analog zu Cantors Unendlichkeitsbeweis) zeigt: H_TM unentscheidbar. co-H_TM ist sogar nicht mal RE.",
        difficulty = 5,
        funFact = "Alan Turing schrieb seinen Beweis 1936 als Student in Cambridge — ein Jahr bevor er seinen Doktortitel erhielt. Er erfand damit gleichzeitig den theoretischen Computer und bewies fundamentale Grenzen der Berechenbarkeit — alles ohne je einen realen Computer gesehen zu haben."
    ),

    // Question 47
    Question(
        categoryId = 12,
        questionText = "Was ist das Clique-Entscheidungsproblem und welche konkrete Reduktion zeigt 3-SAT ≤p INDEPENDENT SET?",
        answerA = "3-SAT ≤p IS wird gezeigt durch Konstruktion eines Graphen, in dem jede Variable einen Knoten und jede Klausel eine Kante erhaelt — eine IS der Groesse n entspricht einer erfuellenden Belegung",
        answerB = "Fuer 3-SAT Instanz mit k Klauseln C_i = (l_{i1} ∨ l_{i2} ∨ l_{i3}): Erstelle Dreiecke pro Klausel (3k Knoten). Verbinde komplementaere Literale zwischen verschiedenen Klauseln. Ein IS der Groesse k (genau ein Knoten pro Dreieck, ohne Konflikte) entspricht einer erfuellenden Belegung",
        answerC = "Die Reduktion IS ≤p 3-SAT laeuft in die umgekehrte Richtung — IS wird auf 3-SAT zurueckgefuehrt, nicht umgekehrt",
        answerD = "3-SAT ≤p INDEPENDENT SET erfordert exponentielle Transformationszeit und ist daher keine gueltige polynomielle Reduktion",
        correctAnswer = 1,
        explanation = "Konstruktion: Gegeben 3-SAT Formel mit k Klauseln. Erstelle 3k Knoten in k Dreiecken (je 3 Knoten = 3 Literale der Klausel). Fuege Kanten hinzu zwischen (i,j) und (i',j') falls: (a) i = i' (gleiche Klausel, bereits im Dreieck verbunden) ODER (b) l_{ij} und l_{i'j'} sind komplementaer. Dann: Formel ist erfuellbar ⟺ Graph hat IS der Groesse k. Beweis: Wahl eines wahren Literals pro Klausel gibt IS (keine zwei komplementaer, einer pro Dreieck). Diese Konstruktion ist polynomiell und zeigt INDEPENDENT SET NP-vollstaendig.",
        difficulty = 5,
        funFact = null
    ),

    // Question 48
    Question(
        categoryId = 12,
        questionText = "Was besagt das Savitch-Theorem und welche Konsequenz hat es fuer die Beziehung zwischen deterministischem und nichtdeterministischem Speicher?",
        answerA = "Savitch (1970): NSPACE(f(n)) ⊆ DSPACE(f(n)^2) fuer f(n) ≥ log n; daraus folgt NPSPACE = PSPACE (nichtdeterministischer polynomieller Speicher = deterministischer polynomieller Speicher)",
        answerB = "Savitch beweist NPSPACE = NP, da polynomieller Speicher nichtdeterministische Berechnungen linear beschleunigt",
        answerC = "Das Savitch-Theorem zeigt, dass NSPACE(n) ⊆ DSPACE(n) ohne Quadratkosten gilt — Nichtdeterminismus kostet keinen Mehraufwand bei Speicher",
        answerD = "Savitch beweist, dass deterministischer und nichtdeterministischer Speicher equivalent sind fuer alle Klassen ab LOGSPACE",
        correctAnswer = 0,
        explanation = "Walter Savitch (1970): Fuer jeden raumkonstruierbaren f(n) ≥ log n gilt NSPACE(f(n)) ⊆ DSPACE(f(n)^2). Beweis: Erreichbarkeit (gibt es einen Pfad der Laenge ≤ 2^k zwischen zwei Konfigurationen?) wird rekursiv in O(f(n)^2) Speicher gelöst (Mittelpunktsuche). Konsequenz: NL ⊆ DSPACE(log^2 n), NPSPACE ⊆ PSPACE, also NPSPACE = PSPACE. Kontrast zu Zeitkomplexitaet: Ob NTIME(n) ⊆ DTIME(n^2) — analog fuer Zeit — ist offen (dies waere fast P = NP).",
        difficulty = 5,
        funFact = "Savitch's Theorem zeigt einen fundamentalen Unterschied: Bei Speicher ist Nichtdeterminismus nur quadratisch teurer. Bei Zeit vermuten wir, dass Nichtdeterminismus exponentielle Vorteile bringt (P ≠ NP). Warum Speicher gutmuetiger ist als Zeit — tiefes offenes Problem."
    ),

    // Question 49
    Question(
        categoryId = 12,
        questionText = "Was ist die Kommunikationskomplexitaet und welche Untergrenze fuer das Inner-Product-Problem zeigt Yao's Methode?",
        answerA = "Kommunikationskomplexitaet (Yao, 1979) analysiert, wieviel Kommunikation zwei Parteien Alice (kennt x) und Bob (kennt y) benoetigen, um f(x,y) zu berechnen; das Inner-Product IP_n(x,y) = x·y mod 2 erfordert Omega(n) Bits — keine Protokoll koennen weniger als n/2 Bits kommunizieren",
        answerB = "Das Inner-Product-Problem hat Kommunikationskomplexitaet O(log n), da Hash-Techniken die Datenmenge komprimieren",
        answerC = "Kommunikationskomplexitaet ist irrelevant fuer Schaltkreiskomplexitaet; beide Gebiete haben keine bekannten Verbindungen",
        answerD = "Yaos Methode gilt nur fuer deterministische Protokolle; fuer probabilistische Protokolle ist Inner-Product in O(1) Kommunikation loesbar",
        correctAnswer = 0,
        explanation = "Kommunikationskomplexitaet: Alice hat x ∈ {0,1}^n, Bob hat y ∈ {0,1}^n; berechne f(x,y) mit minimaler Kommunikation. Yaos Methode: Korrespondenzmatrix M_f[x,y] = f(x,y). Deterministische Komm.-Kompl. = log_2(Rang(M_f) ueber Reellen). IP_n Rang = 2^n (voller Rang) → Komm.-Kompl. = n. Verbindung zu Schaltkreisen: Untergrenzen in Kommunikationskomplexitaet implizieren Untergrenzen fuer Schaltkreistiefe. Razborov's Methode nutzt dies fuer Monotone-Schaltkreis-Untergrenzen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 50
    Question(
        categoryId = 12,
        questionText = "Welche der folgenden Aussagen zur P-NP-Frage ist nach aktuellem Forschungsstand (2026) korrekt?",
        answerA = "P = NP wurde 2023 von einem chinesischen Forscherteam bewiesen, aber die Korrektheit des Beweises ist noch umstritten",
        answerB = "P ≠ NP ist das wahrscheinlichste Szenario (2019: 99% der befragten Experten, 88% aller Informatiker), aber der Beweis fehlt; die bekannten Beweisbarrieren (Relativierung, Natural Proofs, Algebrisierung) zeigen, dass fundamentell neue mathematische Methoden benoetigt werden",
        answerC = "Die P-NP-Frage gilt als geloest: Fachkonsens ist P = NP, da alle praktsichen NP-Probleme heuristische polynomielle Loesungen haben",
        answerD = "P-NP ist unentscheidbar innerhalb der ZFC-Mengenlehre (analog zur Kontinuumshypothese), was Scott Aaronson 2018 bewies",
        correctAnswer = 1,
        explanation = "Stand 2026: P vs. NP ist das groesste offene Problem der Informatik und eines der sieben Clay-Millenniumsprobleme. Surveys zeigen: 88% aller befragten Informatiker (Gasarch, 2019) glauben P ≠ NP; unter Experten waren es 99%. Bekannte Barrieren: (1) Relativierung (BGS 1975): Diagonaliserungsbeweise reichen nicht aus. (2) Natural Proofs (Razborov-Rudich 1994): Einfache Schaltkreisuntergrenzenmethoden schliessen sich selbst aus. (3) Algebrisierung (Aaronson-Wigderson 2009): Algebraische Generalisierungen der Relativierung. Jede neue Beweistechnik muss alle drei Barrieren umgehen.",
        difficulty = 5,
        funFact = "Scott Aaronson hat auf seinem Blog Shtetl-Optimized ein offenes Angebot: 200.000 Dollar eigenes Geld fuer jeden, der ihm einen ueberzeugenden Beweis von P = NP zeigt — und 100.000 Dollar fuer P ≠ NP. Er hat das Geld bisher nie ausgezahlt. Tausende von 'Beweisen' wurden eingereicht, alle fehlerhaft."
    )

)
